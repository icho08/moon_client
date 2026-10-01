#version 150

uniform float Time;
uniform vec2 Resolution;
uniform vec3 SmokeColor;
uniform float SmokeIntensity;
uniform float SmokeScale;
uniform float EffectAlpha;

in vec2 TexCoord;
in vec4 FragColor;

out vec4 OutColor;

float smokePattern(vec2 uv) {
    vec2 ratio = vec2(Resolution.x / max(Resolution.y, 1.0), 1.0);
    vec2 p = (2.0 * uv - 1.0) * ratio / max(SmokeScale, 0.05);

    for (float i = 1.0; i < 7.0; i++) {
        p.x += 0.60 / i * cos(i * 2.5 * p.y + Time);
        p.y += 0.60 / i * cos(i * 1.5 * p.x + Time * 0.86);
    }

    float smoke = 0.1 / max(abs(sin(Time - p.y - p.x)), 0.08);
    float centerFade = smoothstep(1.25, 0.15, length(uv - 0.5));
    return clamp(smoke * centerFade * SmokeIntensity, 0.0, 1.0);
}

void main() {
    float smoke = smokePattern(TexCoord);
    if (smoke < 0.01 || FragColor.a <= 0.001 || EffectAlpha <= 0.001) {
        discard;
    }

    vec3 base = clamp(SmokeColor, 0.0, 1.0);
    vec3 glow = base * (0.35 + smoke * 1.6);
    float alpha = FragColor.a * EffectAlpha * smoothstep(0.08, 0.95, smoke);
    OutColor = vec4(clamp(glow, 0.0, 1.0), alpha);
}
