#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform sampler2D Sampler2;
uniform float Mode;
uniform vec2 Resolution;
uniform vec4 MirrorColor;
uniform float MirrorBlend;
uniform vec4 FillColor;
uniform float FillOpacity;
uniform float KeepShading;
uniform float ShadowStrength;
uniform float GlowEnabled;
uniform float OuterGlow;
uniform float GlowRadius;
uniform float GlowBrightness;
uniform vec4 GlowColor1;
uniform vec4 GlowColor2;

in vec2 TexCoord;
out vec4 OutColor;

const float TAU = 6.28318530718;

float handMaskAt(vec2 uv) {
    vec3 handScene = texture(Sampler0, uv).rgb;
    vec3 cleanScene = texture(Sampler2, uv).rgb;
    float depth = texture(Sampler1, uv).r;
    float delta = length(handScene - cleanScene);
    float colorMask = smoothstep(0.012, 0.070, delta);
    float depthMask = depth < 0.9999 && delta > 0.002 ? 1.0 : 0.0;
    return max(colorMask, depthMask);
}

vec3 blurredScene(vec2 uv) {
    vec2 texel = 1.0 / Resolution;
    vec3 color = texture(Sampler2, uv).rgb;
    float samples = 1.0;
    float radius = 34.0;

    for (int d = 0; d < 10; d++) {
        float angle = TAU * (float(d) / 10.0);
        vec2 dir = vec2(cos(angle), sin(angle));
        for (int q = 1; q <= 4; q++) {
            vec2 offset = dir * texel * radius * (float(q) / 4.0);
            color += texture(Sampler2, uv + offset).rgb;
            samples += 1.0;
        }
    }

    return color / samples;
}

float glowMask(vec2 uv) {
    if (GlowEnabled < 0.5 || OuterGlow < 0.5) {
        return 0.0;
    }

    vec2 texel = 1.0 / Resolution;
    float radius = max(1.0, GlowRadius) * 4.0;
    float glow = 0.0;

    for (int d = 0; d < 16; d++) {
        float angle = TAU * (float(d) / 16.0);
        vec2 dir = vec2(cos(angle), sin(angle));
        for (int s = 1; s <= 8; s++) {
            float progress = float(s) / 8.0;
            float mask = handMaskAt(uv + dir * texel * radius * progress);
            glow += mask * (1.0 - progress);
        }
    }

    return clamp((glow / 16.0) * GlowBrightness * 0.45, 0.0, 1.0);
}

void main() {
    vec4 source = texture(Sampler0, TexCoord);
    vec3 clean = texture(Sampler2, TexCoord).rgb;
    float mask = handMaskAt(TexCoord);
    vec3 result = source.rgb;

    if (mask > 0.001) {
        if (Mode < 0.5) {
            vec3 mirror = blurredScene(TexCoord) * MirrorColor.rgb;
            result = mix(mirror, source.rgb, clamp(MirrorBlend, 0.0, 0.5));
        } else {
            float luminance = dot(source.rgb, vec3(0.299, 0.587, 0.114));
            vec3 fill = FillColor.rgb;
            if (KeepShading > 0.5) {
                fill *= mix(1.0, luminance, clamp(ShadowStrength, 0.0, 1.0));
            }
            result = mix(source.rgb, fill, clamp(FillOpacity * FillColor.a, 0.0, 1.0));
        }

        result = mix(source.rgb, result, mask);
    } else {
        float glow = glowMask(TexCoord);
        vec3 glowColor = mix(GlowColor1.rgb, GlowColor2.rgb, TexCoord.y);
        result = clean + glowColor * glow;
    }

    OutColor = vec4(clamp(result, 0.0, 1.0), 1.0);
}
