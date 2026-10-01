#version 150

#moj_import <moondlc:regular/common.glsl>

in vec2 FragCoord;
in vec4 FragColor;
in vec2 TexCoord;

uniform sampler2D Sampler0;
uniform vec2 uSize;
uniform vec4 uRadius;
uniform float uAlpha;
uniform float uMix;
uniform float uSmoothness;
uniform vec4 uTopLeftColor;
uniform vec4 uBottomLeftColor;
uniform vec4 uTopRightColor;
uniform vec4 uBottomRightColor;

out vec4 fragColor;

vec4 glassColor(vec2 uv) {
    vec4 topColor = mix(uTopLeftColor, uTopRightColor, uv.x);
    vec4 bottomColor = mix(uBottomLeftColor, uBottomRightColor, uv.x);
    return mix(topColor, bottomColor, uv.y);
}

void main() {
    float smoothedAlpha = ralpha(uSize, FragCoord, uRadius, uSmoothness);
    if (smoothedAlpha <= 0.0) {
        discard;
    }

    vec4 texColor = texture(Sampler0, TexCoord);
    vec4 mixedColor = mix(texColor, glassColor(FragCoord), uMix);
    mixedColor.a *= smoothedAlpha * uAlpha;
    if (mixedColor.a <= 0.0) {
        discard;
    }

    fragColor = mixedColor;
}
