#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform float Time;
uniform vec2 Resolution;
uniform vec3 SmokeColor;
uniform float SmokeIntensity;

in vec2 TexCoord;
out vec4 OutColor;

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

    vec2 smokeUv = (2.0 * TexCoord - 1.0) * Resolution.y / min(Resolution.x, Resolution.y);

    for (float i = 1.0; i < 7.0; i++) {
        smokeUv.x += 0.6 / i * cos(i * 2.5 * smokeUv.y + Time);
        smokeUv.y += 0.6 / i * cos(i * 1.5 * smokeUv.x + Time);
    }

    float smokePattern = 0.1 / abs(sin(Time - smokeUv.y - smokeUv.x));
    vec3 col = SmokeColor * smokePattern * SmokeIntensity;

    vec4 finalHandColor = mix(originalColor, vec4(col, 1.0), 0.85);
    OutColor = vec4(finalHandColor.rgb, mask);
}
