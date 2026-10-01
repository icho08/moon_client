#version 150

#moj_import <rockstar:common.glsl>

in vec2 FragCoord;
in vec4 FragColor;

uniform vec2 Size;
uniform float Progress; // 0.0 to 1.0 animation progress
uniform vec4 ColorModulator;

out vec4 OutColor;

float hash(vec2 p) {
    p = fract(p * vec2(123.34, 456.21));
    p += dot(p, p + 45.32);
    return fract(p.x * p.y);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    f = f * f * (3.0 - 2.0 * f);
    float a = hash(i);
    float b = hash(i + vec2(1.0, 0.0));
    float c = hash(i + vec2(0.0, 1.0));
    float d = hash(i + vec2(1.0, 1.0));
    return mix(mix(a, b, f.x), mix(c, d, f.x), f.y);
}

float fbm(vec2 p) {
    float v = 0.0;
    float a = 0.5;
    mat2 rot = mat2(0.8, 0.6, -0.6, 0.8);
    for (int i = 0; i < 4; i++) {
        v += a * noise(p);
        p = rot * p * 2.0;
        a *= 0.5;
    }
    return v;
}

void main() {
    vec2 st = (FragCoord - vec2(0.5));
    float aspect = Size.y / max(1.0, Size.x);
    float dist = length(st * vec2(1.0, aspect));

    float n = fbm(st * 8.0 + vec2(0.0, Progress * 1.5));
    float burnVal = dist * 1.5 - (n * 0.3);

    float threshold = Progress * 1.15;

    if (burnVal > threshold) {
        discard;
    }

    vec4 col = FragColor;
    float edgeWidth = 0.09;
    float diff = threshold - burnVal;

    if (diff < edgeWidth) {
        float t = diff / edgeWidth;
        vec3 fireYellow = vec3(1.0, 0.95, 0.35);
        vec3 fireOrange = vec3(1.0, 0.4, 0.0);
        vec3 fireRed    = vec3(0.85, 0.1, 0.0);
        vec3 flameGlow  = mix(fireRed, mix(fireOrange, fireYellow, t), t);
        col.rgb = mix(flameGlow * 1.35, col.rgb, smoothstep(0.0, 1.0, t));
    }

    OutColor = vec4(col.rgb, col.a * ColorModulator.a);
}
