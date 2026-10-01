#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform float Time;
uniform vec2 Resolution;
uniform vec3 StripesColor1;
uniform vec3 StripesColor2;
uniform float StripesWidth;
uniform float StripesSpeed;

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

    vec2 effectUv = TexCoord;
    effectUv.x *= Resolution.x / Resolution.y;

    float diagonal = (effectUv.x + effectUv.y + Time * StripesSpeed) / StripesWidth;
    float pattern = mod(floor(diagonal), 2.0);
    vec3 col = mix(StripesColor1, StripesColor2, pattern);

    vec4 finalHandColor = mix(originalColor, vec4(col, 1.0), 0.85);
    OutColor = vec4(finalHandColor.rgb, mask);
}
