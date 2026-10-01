#version 150

uniform sampler2D Scene;
uniform sampler2D DepthSampler;

uniform vec4 uHeader;
uniform vec4 uParams;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec2 uv = texCoord;
    float aspect = uHeader.w;
    vec2 center = uHeader.xy;
    float centerDepth = uHeader.z;

    float radius = uParams.x;
    float halfWidth = max(uParams.y, 1e-4);
    float strength = uParams.z;
    float time = uParams.w;

    vec2 d = uv - center;
    d.x *= aspect;
    float dist = length(d);
    vec2 dir = dist > 1e-5 ? d / dist : vec2(0.0);

    float band = 1.0 - smoothstep(0.0, halfWidth, abs(dist - radius));
    if (band <= 0.001) {
        fragColor = vec4(texture(Scene, uv).rgb, 1.0);
        return;
    }

    float sceneDepth = texture(DepthSampler, uv).r;
    if (sceneDepth + 0.0005 < centerDepth) {
        fragColor = vec4(texture(Scene, uv).rgb, 1.0);
        return;
    }

    float soft = smoothstep(0.0, 1.0, band);

    vec2 tangent = vec2(-dir.y, dir.x);
    float shimmer = sin((dist * 22.0) - time * 3.0) * 0.18;
    vec2 offset = (dir * soft + tangent * shimmer * soft) * strength;
    offset.x /= aspect;

    vec3 col = texture(Scene, clamp(uv + offset, vec2(0.001), vec2(0.999))).rgb;

    float rim = pow(soft, 4.0) * 0.10;
    col += vec3(rim);

    fragColor = vec4(col, 1.0);
}
