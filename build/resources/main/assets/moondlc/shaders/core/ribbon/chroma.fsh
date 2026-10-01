#version 150

uniform sampler2D Sampler0;

in vec2 FragCoord;
in vec2 TexCoord;
in vec4 FragColor;

out vec4 OutColor;

vec2 screenUv() {
    vec2 size = vec2(textureSize(Sampler0, 0));
    vec2 texel = 1.0 / size;
    return clamp(gl_FragCoord.xy / size, texel * 0.5, vec2(1.0) - texel * 0.5);
}

void main() {
    float alpha = FragColor.a;
    if (alpha < 0.001) {
        discard;
    }

    vec4 background = texture(Sampler0, screenUv());
    OutColor = vec4(1.0 - background.rgb, alpha);
}
