#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform float Time;
uniform float ChromaSpeed;
uniform float ChromaSaturation;
uniform float ChromaBrightness;

in vec2 TexCoord;
out vec4 OutColor;

vec3 hsv2rgb(vec3 c) {
    vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);
    vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);
    return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);
}

vec3 createChromaEffect(vec2 coord, float t) {
    float hue = fract(coord.y * 0.5 + coord.x * 0.3 + t * ChromaSpeed);
    float wave = sin(coord.y * 10.0 + t * 3.0) * 0.05;
    hue += wave;
    return hsv2rgb(vec3(hue, ChromaSaturation, ChromaBrightness));
}

void main() {
    vec4 originalColor = texture(Sampler0, TexCoord);
    vec2 texelSize = 1.0 / vec2(textureSize(Sampler1, 0));

    float centerDepth = texture(Sampler1, TexCoord).r;
    float minDepth = centerDepth;
    minDepth = min(minDepth, texture(Sampler1, TexCoord + vec2(-texelSize.x, 0.0)).r);
    minDepth = min(minDepth, texture(Sampler1, TexCoord + vec2(texelSize.x, 0.0)).r);
    minDepth = min(minDepth, texture(Sampler1, TexCoord + vec2(0.0, -texelSize.y)).r);
    minDepth = min(minDepth, texture(Sampler1, TexCoord + vec2(0.0, texelSize.y)).r);

    float mask = smoothstep(0.99, 0.98, minDepth);
    if (mask < 0.01) {
        discard;
    }

    vec3 chromaColor = createChromaEffect(TexCoord, Time);
    float pulse = 0.9 + sin(Time * 4.0) * 0.1;
    chromaColor *= pulse;

    vec4 finalHandColor = mix(originalColor, vec4(chromaColor, 1.0), 0.85);
    OutColor = vec4(finalHandColor.rgb, mask);
}
