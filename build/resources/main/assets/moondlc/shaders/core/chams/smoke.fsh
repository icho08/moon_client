#version 150

uniform sampler2D Sampler0;
uniform vec3 TintColor;
uniform float TintStrength;
uniform float TintOpacity;
uniform float Time;
uniform vec3 SmokeColor;
uniform float SmokeIntensity;

in vec2 TexCoord;
in vec4 FragColor;

out vec4 OutColor;

vec2 clampUv(vec2 uv) {
    vec2 size = vec2(textureSize(Sampler0, 0));
    vec2 texel = 1.0 / size;
    return clamp(uv, texel * 0.5, vec2(1.0) - texel * 0.5);
}

float smokePattern(vec2 uv) {
    vec2 p = (2.0 * uv - 1.0);

    for (float i = 1.0; i < 7.0; i++) {
        p.x += 0.55 / i * cos(i * 2.4 * p.y + Time);
        p.y += 0.55 / i * cos(i * 1.6 * p.x + Time * 0.86);
    }

    float smoke = 0.09 / max(abs(sin(Time - p.y - p.x)), 0.08);
    float fade = smoothstep(0.9, 0.15, length(uv - 0.5));
    return clamp(smoke * fade, 0.0, 1.0);
}

void main() {
    float alpha = FragColor.a;
    if (alpha < 0.001) {
        discard;
    }

    vec2 uv = clampUv(TexCoord);
    vec3 reflected = texture(Sampler0, uv).rgb;
    float smoke = smokePattern(uv) * SmokeIntensity;
    vec3 smokeColorVal = clamp(SmokeColor, 0.0, 1.0) * smoke;

    vec3 tint = clamp(TintColor, 0.0, 1.0);
    vec3 mixed = mix(reflected * 0.35, smokeColorVal, 0.82);
    vec3 tintLayer = mix(mixed, tint, clamp(TintStrength * 0.65, 0.0, 1.0));
    vec3 tinted = mix(mixed, tintLayer, clamp(TintOpacity, 0.0, 1.0));

    OutColor = vec4(clamp(tinted, 0.0, 1.0), alpha);
}
