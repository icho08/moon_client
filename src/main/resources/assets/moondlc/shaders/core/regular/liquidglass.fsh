#version 150

uniform sampler2D InputSampler;
uniform vec2 InputResolution;
uniform vec2 uSize;
uniform vec2 uLocation;
uniform vec4 radius;

uniform float Smoothness;
uniform float CornerSmoothness;
uniform float GlobalAlpha;
uniform float FresnelPower;
uniform vec3 FresnelColor;
uniform float FresnelAlpha;
uniform float BaseAlpha;
uniform int FresnelInvert;
uniform float FresnelMix;
uniform float DistortStrength;

in vec2 texCoord;
out vec4 fragColor;

// Встроенная функция roundedBoxSDF
float roundedBoxSDF(vec2 p, vec2 b, vec4 r, float smoothness) {
    r.xy = (p.x > 0.0) ? r.xy : r.zw;
    r.x = (p.y > 0.0) ? r.x : r.y;
    vec2 q = abs(p) - b + r.x;
    vec2 q_clamped = max(q, 0.0);
    float len = pow(pow(q_clamped.x, smoothness) + pow(q_clamped.y, smoothness), 1.0/smoothness);
    return min(max(q.x, q.y), 0.0) + len - r.x;
}

void main() {
    vec2 halfSize = uSize / 2.0;
    vec2 center = halfSize;
    vec2 pos = gl_FragCoord.xy - uLocation - center;

    // Вычисляем расстояние до границы
    float distance = roundedBoxSDF(-pos, halfSize - 1.0, radius, CornerSmoothness);
    float alpha = 1.0 - smoothstep(1.0 - Smoothness, 1.0, distance);

    // Если полностью прозрачный - отбрасываем
    if (alpha < 0.001) {
        discard;
    }

    // Вычисляем расстояние до края для эффекта френеля
    float distToEdge = abs(roundedBoxSDF(pos, halfSize - 1.0, radius, CornerSmoothness));
    float max_dist_norm = min(halfSize.x, halfSize.y);
    float edge_gradient = 1.0 - clamp(distToEdge / max_dist_norm, 0.0, 1.0);

    // Френель эффект
    float fresnel;
    float base = FresnelInvert == 1 ? edge_gradient : (1.0 - edge_gradient);

    if (FresnelPower > 20.0) {
        fresnel = exp(FresnelPower * log(clamp(base, 0.001, 1.0)));
    } else {
        fresnel = pow(base, FresnelPower);
    }
    fresnel = clamp(fresnel, 0.0, 1.0);

    // Искажение текстуры
    vec2 dir = length(pos) > 0.0 ? normalize(pos) : vec2(0.0);
    vec2 uv = gl_FragCoord.xy / InputResolution.xy;
    vec2 distortedUV = uv + dir * fresnel * DistortStrength;

    // Сэмплируем текстуру
    vec4 texColor = texture(InputSampler, distortedUV);

    // Смешиваем цвета
    vec3 finalColor = mix(texColor.rgb, FresnelColor, fresnel * FresnelMix);
    float finalAlpha = mix(BaseAlpha, FresnelAlpha, fresnel) * alpha;

    fragColor = vec4(finalColor, finalAlpha * GlobalAlpha);
}