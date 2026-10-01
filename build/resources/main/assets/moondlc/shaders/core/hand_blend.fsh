#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform sampler2D Sampler2;
uniform int BlendMode;
uniform float BlendIntensity;
uniform float Shader1Strength;
uniform float Shader2Strength;

in vec2 TexCoord;
out vec4 OutColor;

vec3 blendScreen(vec3 base, vec3 blend) {
    return vec3(1.0) - (vec3(1.0) - base) * (vec3(1.0) - blend);
}

vec3 blendOverlay(vec3 base, vec3 blend) {
    vec3 result;
    result.r = base.r < 0.5 ? (2.0 * base.r * blend.r) : (1.0 - 2.0 * (1.0 - base.r) * (1.0 - blend.r));
    result.g = base.g < 0.5 ? (2.0 * base.g * blend.g) : (1.0 - 2.0 * (1.0 - base.g) * (1.0 - blend.g));
    result.b = base.b < 0.5 ? (2.0 * base.b * blend.b) : (1.0 - 2.0 * (1.0 - base.b) * (1.0 - blend.b));
    return result;
}

void main() {
    vec4 s1 = texture(Sampler0, TexCoord);
    vec4 s2 = texture(Sampler1, TexCoord);
    float depth = texture(Sampler2, TexCoord).r;

    if (depth >= 0.9999) {
        OutColor = vec4(s1.rgb, 1.0);
        return;
    }

    vec3 c1 = s1.rgb * Shader1Strength;
    vec3 c2 = s2.rgb * Shader2Strength;
    vec3 result;

    if (BlendMode == 0) {
        result = mix(c1, c2, 0.5);
    } else if (BlendMode == 1) {
        result = c1 + c2;
    } else if (BlendMode == 2) {
        result = c1 * c2;
    } else if (BlendMode == 3) {
        result = blendScreen(c1, c2);
    } else if (BlendMode == 4) {
        result = blendOverlay(c1, c2);
    } else {
        result = abs(c1 - c2);
    }

    result = mix(s1.rgb, result, BlendIntensity);
    OutColor = vec4(clamp(result, 0.0, 1.0), 1.0);
}
