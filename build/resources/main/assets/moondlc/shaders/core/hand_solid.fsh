#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform float Time;
uniform vec2 Resolution;
uniform vec3 Color1;
uniform vec3 Color2;
uniform float EffectAlpha;

in vec2 TexCoord;
out vec4 OutColor;

float dither(vec2 coord) {
    return (fract(sin(dot(coord, vec2(12.9898, 78.233))) * 43758.5453) - 0.5) / 255.0;
}

void main() {
    vec2 uv = gl_FragCoord.xy / Resolution;
    vec4 color = texture(Sampler0, uv);
    float depth = texture(Sampler1, uv).r;

    if (depth < 0.9999) {
        float gradient = sin(Time + uv.x * 3.14159 + uv.y * 2.0) * 0.5 + 0.5;
        vec3 solidColor = mix(Color1, Color2, gradient);
        solidColor += dither(gl_FragCoord.xy);
        color.rgb = mix(color.rgb, solidColor, EffectAlpha);
    }

    OutColor = vec4(color.rgb, 1.0);
}
