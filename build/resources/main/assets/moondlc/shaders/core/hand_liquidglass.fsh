#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform sampler2D Sampler2;
uniform vec2 Resolution;
uniform float DistortStrength;
uniform float FresnelPower;
uniform float GlassBrightness;
uniform float BackgroundBlur;
uniform float Quality;
uniform float Direction;
uniform float EdgeRadius;
uniform float EdgeDirections;
uniform float FresnelHighlight;
uniform vec3 GlassTint;
uniform float TintStrength;

in vec2 TexCoord;
out vec4 OutColor;

const float TAU = 6.28318530718;

vec3 blur(sampler2D tex, vec2 uv, float radius, float quality, float directions) {
    vec2 pixelSize = radius / Resolution;
    vec3 col = texture(tex, uv).rgb;
    float count = 1.0;
    for (float d = 0.0; d < TAU; d += TAU / directions) {
        for (float i = 1.0; i <= quality; i += 1.0) {
            vec2 offset = vec2(cos(d), sin(d)) * pixelSize * (i / quality);
            col += texture(tex, uv + offset).rgb;
            count += 1.0;
        }
    }
    return col / count;
}

void main() {
    vec4 color = texture(Sampler0, TexCoord);
    float depth = texture(Sampler1, TexCoord).r;

    if (depth >= 0.9999) {
        OutColor = vec4(color.rgb, 1.0);
        return;
    }

    vec2 texel = 1.0 / Resolution;
    float edgeFactor = 0.0;

    for (float a = 0.0; a < TAU; a += TAU / EdgeDirections) {
        vec2 dir = vec2(cos(a), sin(a));
        for (float r = 1.0; r <= EdgeRadius; r += 1.0) {
            if (texture(Sampler1, TexCoord + dir * texel * r * 2.0).r >= 0.9999) {
                edgeFactor += 1.0 - (r - 1.0) / EdgeRadius;
                break;
            }
        }
    }
    edgeFactor /= EdgeDirections;

    float fresnel;
    if (FresnelPower > 20.0) {
        fresnel = exp(FresnelPower * log(clamp(edgeFactor, 0.001, 1.0)));
    } else {
        fresnel = pow(clamp(edgeFactor, 0.001, 1.0), max(FresnelPower, 0.1));
    }
    fresnel = clamp(fresnel, 0.0, 1.0);

    vec2 screenCenter = vec2(0.5);
    vec2 distDir = normalize(TexCoord - screenCenter);
    vec2 distortedUV = TexCoord + distDir * fresnel * DistortStrength;

    vec3 bg;
    if (BackgroundBlur <= 0.001) {
        bg = texture(Sampler2, distortedUV).rgb;
    } else {
        bg = blur(Sampler2, distortedUV, BackgroundBlur, Quality, Direction);
    }

    color.rgb = bg * GlassBrightness + vec3(1.0) * fresnel * FresnelHighlight;
    color.rgb = mix(color.rgb, color.rgb * GlassTint, clamp(TintStrength, 0.0, 1.0));

    OutColor = vec4(color.rgb, 1.0);
}
