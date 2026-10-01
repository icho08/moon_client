#version 150

// ─── Uniforms ─────────────────────────────────────────────────────────────────
uniform float Time;
uniform float ScanSpeed;
uniform float ScanWidth;
uniform float NoiseAmplitude;
uniform float NoiseFrequency;
uniform float GlowFalloff;
uniform float GlowIntensity;
uniform vec3  Color1;
uniform vec3  Color2;
uniform float Alpha;

// ─── Vertex inputs ────────────────────────────────────────────────────────────
in float vNormY;   // 0 = feet, 1 = head
in float vAngle;   // 0…1 = 0…2π around entity center
in float vMode;    // 0 = scan-line body, 1 = aurora column background
in float vAlpha;   // per-vertex master alpha

out vec4 OutColor;

// ─── Shared noise & wave helpers ──────────────────────────────────────────────
float hash(vec2 p) {
    p = fract(p * vec2(127.1, 311.7));
    p += dot(p, p + 43.5453);
    return fract(p.x * p.y);
}

float valueNoise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    vec2 u = f * f * (3.0 - 2.0 * f);
    return mix(
        mix(hash(i),                hash(i + vec2(1.0, 0.0)), u.x),
        mix(hash(i + vec2(0.0,1.0)), hash(i + vec2(1.0, 1.0)), u.x),
        u.y
    );
}

// Smooth, subtle wave distortion evolving slowly over time
float subtleWave(float angle, float time) {
    float t = time * 0.35; // Slower time evolution
    float w1 = sin(angle * NoiseFrequency + t * 0.8) * 0.65;
    float w2 = cos(angle * (NoiseFrequency * 1.4) - t * 0.5) * 0.35;
    return (w1 + w2) * NoiseAmplitude;
}

// ─── MODE 0 : Scan-line on body surface ──────────────────────────────────────
vec4 renderScanLine() {
    float t = Time * ScanSpeed;

    // Smooth ping-pong scan (0.0 at feet to 1.0 at head)
    float phase = mod(t * 0.32, 2.0);
    float scanRaw = (phase < 1.0) ? phase : (2.0 - phase);
    float scanCentre = smoothstep(0.0, 1.0, scanRaw);

    // Subtle wave distortion (not too wavy, changes slowly)
    float warp = subtleWave(vAngle * 6.283185307, Time);
    float localScanY = scanCentre + warp;

    float dist = abs(vNormY - localScanY);
    float halfW = max(ScanWidth, 0.005);

    // Hot crisp core scan line
    float core = smoothstep(halfW, halfW * 0.06, dist);

    // Soft gradient glow surrounding scan line
    float glow = exp(-dist * max(GlowFalloff, 0.1) * 18.0) * 0.75;

    float intensity = (core * 1.6 + glow) * GlowIntensity;

    // Edge fade near very top and bottom of entity
    float edgeFade = smoothstep(0.0, 0.03, vNormY) * smoothstep(1.0, 0.97, vNormY);
    intensity *= edgeFade;

    if (intensity < 0.004) discard;

    // Color composition: intense white core -> Color1 -> Color2 glow
    float coreMix = smoothstep(halfW * 1.2, 0.0, dist);
    vec3 glowColor = mix(Color2, Color1, smoothstep(halfW * 3.5, 0.0, dist));
    vec3 finalRgb = mix(glowColor, vec3(1.8, 1.8, 1.8), coreMix * 0.65);

    float finalAlpha = clamp(intensity * Alpha * vAlpha, 0.0, 1.0);
    return vec4(clamp(finalRgb, 0.0, 3.0), finalAlpha);
}

// ─── MODE 1 : Aurora column background ───────────────────────────────────────
vec4 renderAurora() {
    float t = Time * 0.25;

    float auroraIntensity = 0.0;
    for (int k = 0; k < 6; k++) {
        float fk = float(k);
        float centerAngle = fract(fk * 0.618033988);
        centerAngle += sin(t * 0.4 + fk * 1.47) * 0.025;

        float halfW = 0.04 + fract(fk * 0.23719) * 0.04;
        float angDist = abs(fract(vAngle - centerAngle + 0.5) - 0.5);
        float strength = fract(fk * 0.39191 + 0.3) * 0.7 + 0.3;

        auroraIntensity += smoothstep(halfW, halfW * 0.2, angDist) * strength;
    }
    auroraIntensity = clamp(auroraIntensity, 0.0, 1.0);

    float turb = valueNoise(vec2(vAngle * 4.0 + t * 0.3, vNormY * 1.8 + t * 0.2));
    auroraIntensity *= 0.6 + turb * 0.4;

    float topFade = smoothstep(1.0, 0.15, vNormY);
    float bottomFade = smoothstep(0.0, 0.08, vNormY);
    auroraIntensity *= topFade * bottomFade;

    vec3 rgb = mix(Color1 * 1.2, Color2, clamp(vNormY * 1.5, 0.0, 1.0)) * GlowIntensity;
    float a = auroraIntensity * Alpha * vAlpha * 0.7;
    if (a < 0.004) discard;

    return vec4(clamp(rgb, 0.0, 3.0), clamp(a, 0.0, 1.0));
}

// ─── Main ─────────────────────────────────────────────────────────────────────
void main() {
    OutColor = (vMode < 0.5) ? renderScanLine() : renderAurora();
}

