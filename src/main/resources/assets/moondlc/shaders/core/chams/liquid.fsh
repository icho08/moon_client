#version 150

uniform sampler2D Sampler0;
uniform vec3 TintColor;
uniform float TintStrength;
uniform float TintOpacity;
uniform float Time;
uniform float Distortion;

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

    vec2 uv = TexCoord;
    float slowTime = Time * 0.32;
    float baseWarpX = sin((uv.y * 18.0) + slowTime) + cos((uv.y * 9.0) - slowTime * 0.6);
    float baseWarpY = cos((uv.x * 15.0) - slowTime * 0.8) + sin(((uv.x + uv.y) * 8.0) + slowTime * 0.45);
    float shapeWarpX = sin((uv.x + uv.y) * 13.0) * 0.8;
    float shapeWarpY = cos((uv.x - uv.y) * 11.0) * 0.7;
    uv += vec2(baseWarpX * 0.55 + shapeWarpX, baseWarpY * 0.50 + shapeWarpY) * Distortion;

    vec3 reflected = texture(Sampler0, clampUv(uv)).rgb;
    reflected = clamp(pow(reflected, vec3(1.18)) * 0.64, 0.0, 1.0);

    vec3 tint = clamp(TintColor, 0.0, 1.0);
    vec3 tintLayer = mix(reflected, tint, clamp(TintStrength, 0.0, 1.0));
    vec3 tinted = mix(reflected, tintLayer, clamp(TintOpacity, 0.0, 1.0));

    OutColor = vec4(tinted, alpha);
}
