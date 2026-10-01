#version 150

uniform sampler2D Sampler0;
uniform vec3 TintColor;
uniform float TintStrength;
uniform float TintOpacity;
uniform float Time;
uniform float BlurSize;
uniform float Quality;
uniform float Refraction;
uniform float Brightness;
uniform int EnableChromatic;

in vec2 TexCoord;
in vec4 FragColor;

out vec4 OutColor;

vec2 clampUv(vec2 uv) {
    vec2 size = vec2(textureSize(Sampler0, 0));
    vec2 texel = 1.0 / size;
    return clamp(uv, texel * 0.5, vec2(1.0) - texel * 0.5);
}

vec3 blurScene(vec2 uv, float blurSize, float quality) {
    vec2 texel = 1.0 / vec2(textureSize(Sampler0, 0));
    float steps = clamp(quality, 2.0, 10.0);
    float radius = blurSize * 0.35;
    vec3 color = texture(Sampler0, clampUv(uv)).rgb;
    float total = 1.0;

    for (float i = 1.0; i <= 10.0; i += 1.0) {
        if (i > steps) {
            break;
        }

        float d = i / steps;
        vec2 offsetX = vec2(texel.x * radius * d, 0.0);
        vec2 offsetY = vec2(0.0, texel.y * radius * d);
        vec2 offsetA = vec2(texel.x, texel.y) * radius * d * 0.72;
        vec2 offsetB = vec2(texel.x, -texel.y) * radius * d * 0.72;

        color += texture(Sampler0, clampUv(uv + offsetX)).rgb;
        color += texture(Sampler0, clampUv(uv - offsetX)).rgb;
        color += texture(Sampler0, clampUv(uv + offsetY)).rgb;
        color += texture(Sampler0, clampUv(uv - offsetY)).rgb;
        color += texture(Sampler0, clampUv(uv + offsetA)).rgb;
        color += texture(Sampler0, clampUv(uv - offsetA)).rgb;
        color += texture(Sampler0, clampUv(uv + offsetB)).rgb;
        color += texture(Sampler0, clampUv(uv - offsetB)).rgb;
        total += 8.0;
    }

    return color / total;
}

void main() {
    float alpha = FragColor.a;
    if (alpha < 0.001) {
        discard;
    }

    vec2 uv = TexCoord;
    float waveX = sin(uv.y * 18.0 + Time * 1.75) * 0.0025 * Refraction;
    float waveY = cos(uv.x * 16.0 - Time * 1.35) * 0.0025 * Refraction;
    vec2 refractedUv = clampUv(uv + vec2(waveX, waveY));

    vec3 glass = blurScene(refractedUv, BlurSize, Quality) * Brightness;

    if (EnableChromatic == 1) {
        float chroma = 0.0035 * Refraction;
        glass.r = blurScene(clampUv(refractedUv + vec2(chroma, 0.0)), BlurSize * 0.45, max(Quality * 0.5, 2.0)).r;
        glass.b = blurScene(clampUv(refractedUv - vec2(chroma, 0.0)), BlurSize * 0.45, max(Quality * 0.5, 2.0)).b;
    }

    vec2 center = uv - 0.5;
    float edge = smoothstep(0.42, 0.74, length(center));
    glass += vec3(edge * 0.22);

    float shine = sin(Time * 2.0 + uv.x * 22.0 + uv.y * 9.0) * 0.5 + 0.5;
    glass += vec3(shine * 0.055);

    vec3 tint = clamp(TintColor, 0.0, 1.0);
    vec3 tintLayer = mix(glass, tint, clamp(TintStrength, 0.0, 1.0));
    vec3 tinted = mix(glass, tintLayer, clamp(TintOpacity, 0.0, 1.0));

    OutColor = vec4(clamp(tinted, 0.0, 1.0), alpha);
}
