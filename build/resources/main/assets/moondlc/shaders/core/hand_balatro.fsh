#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform float Time;
uniform vec2 Resolution;
uniform vec3 BalatroColor1;
uniform vec3 BalatroColor2;
uniform vec3 BalatroColor3;
uniform vec3 BalatroColor4;

in vec2 TexCoord;
out vec4 OutColor;

#define SPIN_ROTATION -2.0
#define SPIN_SPEED 7.0
#define OFFSET vec2(0.0)
#define SPIN_AMOUNT 0.25
#define PIXEL_FILTER 745.0
#define SPIN_EASE 1.0
#define PI 3.14159265359
#define IS_ROTATE false

vec4 effect(vec2 screenSize, vec2 screenCoords, float contrast, float lighting) {
    float pixelSize = length(screenSize.xy) / PIXEL_FILTER;
    vec2 effectUv = (floor(screenCoords.xy * (1.0 / pixelSize)) * pixelSize - 0.5 * screenSize.xy) / length(screenSize.xy) - OFFSET;
    float uvLen = length(effectUv);

    float speed = SPIN_ROTATION * SPIN_EASE * 0.2;
    if (IS_ROTATE) {
        speed = Time * speed;
    }
    speed += 302.2;

    float newPixelAngle = atan(effectUv.y, effectUv.x) + speed - SPIN_EASE * 20.0 * (SPIN_AMOUNT * uvLen + (1.0 - SPIN_AMOUNT));
    vec2 mid = (screenSize.xy / length(screenSize.xy)) / 2.0;
    effectUv = vec2(uvLen * cos(newPixelAngle) + mid.x, uvLen * sin(newPixelAngle) + mid.y) - mid;

    effectUv *= 30.0;
    speed = Time * SPIN_SPEED;
    vec2 uv2 = vec2(effectUv.x + effectUv.y);

    for (int i = 0; i < 5; i++) {
        uv2 += sin(max(effectUv.x, effectUv.y)) + effectUv;
        effectUv += 0.5 * vec2(cos(5.1123314 + 0.353 * uv2.y + speed * 0.131121), sin(uv2.x - 0.113 * speed));
        effectUv -= 1.0 * cos(effectUv.x + effectUv.y) - 1.0 * sin(effectUv.x * 0.711 - effectUv.y);
    }

    float contrastMod = 0.25 * contrast + 0.5 * SPIN_AMOUNT + 1.2;
    float paintRes = min(2.0, max(0.0, length(effectUv) * 0.035 * contrastMod));
    float c1p = max(0.0, 1.0 - contrastMod * abs(1.0 - paintRes));
    float c2p = max(0.0, 1.0 - contrastMod * abs(paintRes));
    float c3p = 1.0 - min(1.0, c1p + c2p);
    float light = (lighting - 0.2) * max(c1p * 5.0 - 4.0, 0.0) + lighting * max(c2p * 5.0 - 4.0, 0.0);

    vec4 color1 = vec4(BalatroColor1, 1.0);
    vec4 color2 = vec4(BalatroColor2, 1.0);
    vec4 color3 = vec4(BalatroColor3, 1.0);

    return (0.3 / contrast) * color1 + (1.0 - 0.3 / contrast) * (color1 * c1p + color2 * c2p + vec4(c3p * color3.rgb, c3p * color1.a)) + light;
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

    float contrast = max(BalatroColor4.r * 10.0, 0.1);
    float lighting = BalatroColor4.g;
    vec4 effectColor = effect(Resolution, TexCoord * Resolution, contrast, lighting);
    vec4 finalHandColor = mix(originalColor, effectColor, 0.85);

    OutColor = vec4(finalHandColor.rgb, mask);
}
