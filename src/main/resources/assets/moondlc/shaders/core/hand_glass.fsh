#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform sampler2D Sampler2;
uniform float Time;
uniform vec2 Resolution;
uniform float BlurSize;
uniform float Quality;
uniform float Direction;
uniform float Refraction;
uniform float Brightness;
uniform int EnableChromatic;
uniform int EnableDistortion;
uniform int HideHand;
uniform float BackgroundBlur;

in vec2 TexCoord;
out vec4 OutColor;

#define PI 3.14159265

vec4 liquidGlassBlur(sampler2D tex, vec2 uv, float dir, float qual, float size) {
    vec2 radius = (size / Resolution.y) / Resolution;
    vec4 color = texture(tex, uv);
    float total = 1.0;

    float optQual = min(qual, 6.0);
    float optDir = min(dir, 8.0);
    float angleStep = PI / optDir;
    float radiusStep = 1.0 / optQual;

    for (float d = 0.0; d < PI; d += angleStep) {
        vec2 direction = vec2(cos(d), sin(d));
        for (float i = radiusStep; i <= 1.0; i += radiusStep) {
            vec2 offset = direction * radius * i;
            color += texture(tex, uv + offset);
            total += 1.0;
        }
    }

    return color / total;
}

vec4 matteBlur(sampler2D tex, vec2 uv, float blurRadius) {
    const float TAU = 6.28318530718;
    vec2 radius = blurRadius / Resolution.xy;
    vec4 blur = texture(tex, uv);
    float step = TAU / 8.0;

    for (float d = 0.0; d < TAU; d += step) {
        vec2 dir = vec2(cos(d), sin(d));
        for (float i = 0.33; i <= 1.0; i += 0.33) {
            blur += texture(tex, uv + dir * radius * i);
        }
    }

    blur /= 25.0;
    return blur;
}

vec2 glassDistortion(vec2 uv, float time, float strength) {
    float wave1 = sin(uv.y * 10.0 + time * 2.0) * 0.01 * strength;
    float wave2 = cos(uv.x * 8.0 - time * 1.5) * 0.01 * strength;

    vec2 center = vec2(0.5, 0.5);
    vec2 toCenter = uv - center;
    float dist = length(toCenter);
    vec2 radial = toCenter * sin(dist * 15.0 - time * 3.0) * 0.005 * strength;

    return vec2(wave1 + radial.x, wave2 + radial.y);
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

    vec2 distortedUV = TexCoord;
    if (EnableDistortion == 1) {
        distortedUV += glassDistortion(TexCoord, Time, Refraction);
    }

    vec4 handColor = HideHand == 1 ? texture(Sampler2, distortedUV) : texture(Sampler0, distortedUV);
    vec3 glassColor;

    if (centerDepth < 0.99) {
        if (HideHand == 1) {
            if (BackgroundBlur > 0.1) {
                glassColor = matteBlur(Sampler2, TexCoord, BackgroundBlur).rgb;
            } else {
                glassColor = texture(Sampler2, TexCoord).rgb;
            }
            glassColor *= Brightness;
        } else {
            glassColor = liquidGlassBlur(Sampler0, distortedUV, Direction, Quality, BlurSize).rgb;

            if (EnableChromatic == 1) {
                float aberration = 0.003 * Refraction;
                float r = liquidGlassBlur(Sampler0, distortedUV + vec2(aberration, 0.0), Direction, Quality, BlurSize * 0.5).r;
                float b = liquidGlassBlur(Sampler0, distortedUV - vec2(aberration, 0.0), Direction, Quality, BlurSize * 0.5).b;
                glassColor.r = r;
                glassColor.b = b;
            }

            glassColor *= Brightness;
        }
    } else {
        glassColor = handColor.rgb;
    }

    float edgeStrength = 0.0;
    if (centerDepth < 0.99) {
        float right = texture(Sampler1, TexCoord + vec2(texelSize.x, 0.0)).r;
        float left = texture(Sampler1, TexCoord + vec2(-texelSize.x, 0.0)).r;
        float top = texture(Sampler1, TexCoord + vec2(0.0, texelSize.y)).r;
        float bottom = texture(Sampler1, TexCoord + vec2(0.0, -texelSize.y)).r;

        if (right > 0.99) edgeStrength += 1.0;
        if (left > 0.99) edgeStrength += 1.0;
        if (top > 0.99) edgeStrength += 1.0;
        if (bottom > 0.99) edgeStrength += 1.0;

        edgeStrength = clamp(edgeStrength * 0.15, 0.0, 1.0);
    }

    vec3 highlight = vec3(1.0) * edgeStrength * 0.3;
    glassColor += highlight;

    float reflection = sin(Time * 2.0 + TexCoord.x * 20.0) * 0.5 + 0.5;
    reflection *= sin(Time * 1.5 + TexCoord.y * 15.0) * 0.5 + 0.5;
    glassColor += vec3(reflection * 0.1);

    vec3 finalColor = mix(handColor.rgb, glassColor, 0.7);
    OutColor = vec4(finalColor, mask);
}
