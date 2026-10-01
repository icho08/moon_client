#version 150

uniform sampler2D Sampler0;
uniform vec3 TintColor;
uniform float TintStrength;
uniform float TintOpacity;

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

    vec2 mirroredUv = clampUv(TexCoord);
    vec3 reflected = texture(Sampler0, mirroredUv).rgb;
    reflected = clamp(pow(reflected, vec3(1.12)) * 0.74, 0.0, 1.0);

    vec3 tint = clamp(TintColor, 0.0, 1.0);
    vec3 tintLayer = mix(reflected, tint, clamp(TintStrength, 0.0, 1.0));
    vec3 tinted = mix(reflected, tintLayer, clamp(TintOpacity, 0.0, 1.0));

    OutColor = vec4(tinted, alpha);
}
