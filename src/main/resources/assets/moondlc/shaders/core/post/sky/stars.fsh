#version 150

uniform float uTime;
uniform vec2 uResolution;
uniform vec3 uColor;
uniform float uAlpha;
uniform float uSpeed;
uniform float uScale;
uniform float uIntensity;
uniform vec2 uCameraDir;
uniform float uFov;

out vec4 fragColor;

mat3 rotX(float a) {
    float c = cos(a), s = sin(a);
    return mat3(1.0, 0.0, 0.0,
                0.0,   c,   s,
                0.0,  -s,   c);
}
mat3 rotY(float a) {
    float c = cos(a), s = sin(a);
    return mat3(  c, 0.0,   s,
                0.0, 1.0, 0.0,
                 -s, 0.0,   c);
}

// 3D hash vector
vec3 hash33(vec3 p) {
    p = vec3(dot(p, vec3(127.1, 311.7, 74.7)),
             dot(p, vec3(269.5, 183.3, 246.1)),
             dot(p, vec3(113.5, 271.9, 124.6)));
    return fract(sin(p) * 43758.5453123);
}

// Procedural starfield with twinkling and bloom
float starLayer(vec3 ray, float scale, float t) {
    vec3 p = ray * scale;
    vec3 id = floor(p);
    vec3 pos = fract(p) - 0.5;

    vec3 h = hash33(id);

    // Random star displacement inside cell
    vec3 offset = (h - 0.5) * 0.7;
    float dist = length(pos - offset);

    // Star twinkle phase
    float twinkle = 0.5 + 0.5 * sin(t * (2.0 + h.x * 6.0) + h.y * 6.28);

    // Core star point (sharp center)
    float core = exp(-dist * dist * 350.0);

    // Soft bloom halo
    float halo = exp(-dist * 18.0) * 0.35;

    return (core + halo) * twinkle * step(0.65, h.z);
}

void main() {
    vec2 uv = gl_FragCoord.xy / uResolution.xy;
    vec2 sp = uv * 2.0 - 1.0;
    float aspect = uResolution.x / uResolution.y;

    float tanV = tan(radians(uFov) * 0.5);
    vec3 rayV = normalize(vec3(sp.x * tanV * aspect, sp.y * tanV, 1.0));
    vec3 rayW = rotY(uCameraDir.x) * rotX(uCameraDir.y) * rayV;

    float t = uTime * uSpeed;

    // Layered stars at 3 different spatial scales
    float s1 = starLayer(rayW, uScale * 6.0, t);
    float s2 = starLayer(rayW, uScale * 12.0, t * 1.3);
    float s3 = starLayer(rayW, uScale * 24.0, t * 0.8) * 0.5;

    float stars = s1 + s2 + s3;
    stars *= (uIntensity * 150.0);

    // Cosmic stardust background glow
    vec3 pDust = rayW * uScale * 0.5;
    float dust = sin(pDust.x + t * 0.1) * cos(pDust.y - t * 0.1) * sin(pDust.z);
    dust = max(0.0, dust) * 0.1;

    vec3 color = uColor * (stars + dust);

    fragColor = vec4(color, uAlpha);
}
