#version 150

#moj_import <moondlc:common.glsl>

in vec2 FragCoord;
in vec4 FragColor;

uniform vec2 uSize;
uniform vec4 uRadius;
uniform float uSmoothness;
uniform float uThickness;

out vec4 fragColor;

void main() {
    vec2 pixel = FragCoord * uSize;

    float outerAlpha = ralpha(uSize, FragCoord, uRadius, uSmoothness);

    vec2 innerSize = max(uSize - vec2(uThickness * 2.0), vec2(0.001));
    vec4 innerRadius = max(uRadius - vec4(uThickness), vec4(0.0));
    vec2 innerCoord = (pixel - vec2(uThickness)) / innerSize;
    float innerAlpha = ralpha(innerSize, innerCoord, innerRadius, uSmoothness);

    float alpha = max(0.0, outerAlpha - innerAlpha);
    vec4 color = vec4(FragColor.rgb, FragColor.a * alpha);

    if (color.a <= 0.0) {
        discard;
    }

    fragColor = color;
}
