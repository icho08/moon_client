#version 150

uniform sampler2D Sampler0;
uniform float ColorOpacity;

in vec2 TexCoord;
in vec4 FragColor;

out vec4 OutColor;

vec2 clampUv(vec2 uv) {
    vec2 size = vec2(textureSize(Sampler0, 0));
    vec2 texel = 1.0 / size;
    return clamp(uv, texel * 0.5, vec2(1.0) - texel * 0.5);
}

void main() {
    float alpha = FragColor.a;
    if (alpha < 0.001) {
        discard;
    }

    vec2 reflectedUv = clampUv(vec2(1.0 - TexCoord.x, 1.0 - TexCoord.y));
    vec3 color = texture(Sampler0, reflectedUv).rgb;

    // Mix in the trail color using ColorOpacity
    vec3 mixedColor = mix(color, FragColor.rgb, ColorOpacity);

    OutColor = vec4(mixedColor, alpha);
}
