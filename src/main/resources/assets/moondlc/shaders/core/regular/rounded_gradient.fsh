#version 150

uniform vec4 color1;  // Левый верхний
uniform vec4 color2;  // Правый верхний
uniform vec4 color3;  // Левый нижний
uniform vec4 color4;  // Правый нижний
uniform vec2 uSize;
uniform vec2 uLocation;
uniform float radius;
uniform float gradientType; // 0 = 4-цветный, 1 = горизонтальный, 2 = вертикальный

out vec4 fragColor;

float roundedBoxSDF(vec2 center, vec2 size, float radius) {
    return length(max(abs(center) - size + radius, 0.0)) - radius;
}

vec4 getGradientColor(vec2 uv) {
    // Библинейная интерполяция для 4 цветов
    vec4 top = mix(color1, color2, uv.x);
    vec4 bottom = mix(color3, color4, uv.x);
    return mix(top, bottom, uv.y);
}

void main() {
    vec2 pixelPos = gl_FragCoord.xy - uLocation;
    vec2 center = pixelPos - (uSize / 2.0);
    vec2 halfSize = uSize / 2.0;

    float distance = roundedBoxSDF(center, halfSize, radius);
    float smoothedAlpha = 1.0 - smoothstep(0.0, 1.0, distance);

    if (smoothedAlpha <= 0.0) {
        discard;
    }

    vec2 uv = pixelPos / uSize;
    vec4 gradientColor = getGradientColor(uv);

    fragColor = vec4(gradientColor.rgb, gradientColor.a * smoothedAlpha);
}