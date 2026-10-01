#version 150

uniform mat4 uInvProjection;
uniform mat4 uInvView;
uniform vec4 uCameraPosRadius;
uniform vec4 uCenterWidth;
uniform vec4 uOuterColor;
uniform vec4 uMidColor;
uniform vec4 uInnerColor;
uniform vec4 uScanlineColor;
uniform vec4 uMeta;

uniform sampler2D DepthSampler;

in vec2 texCoord;
out vec4 fragColor;

vec3 reconstructWorldPosition(float depth) {
    vec4 clipPosition = vec4(texCoord * 2.0 - 1.0, depth * 2.0 - 1.0, 1.0);
    vec4 viewPosition = uInvProjection * clipPosition;
    viewPosition /= viewPosition.w;
    vec4 cameraRelativePosition = uInvView * viewPosition;
    return uCameraPosRadius.xyz + cameraRelativePosition.xyz;
}

void main() {
    float sceneDepth = texture(DepthSampler, texCoord).r;
    if (sceneDepth >= 1.0) {
        discard;
    }

    float radius = uCameraPosRadius.w;
    float width = max(uCenterWidth.w, 0.0001);
    float distanceToCenter = distance(reconstructWorldPosition(sceneDepth), uCenterWidth.xyz);
    float innerRadius = radius - width;
    if (distanceToCenter <= innerRadius || distanceToCenter >= radius) {
        discard;
    }

    float shellProgress = clamp((distanceToCenter - innerRadius) / width, 0.0, 1.0);
    float leadingEdge = smoothstep(0.42, 1.0, shellProgress);
    float trailingGlow = 1.0 - smoothstep(0.0, 0.78, shellProgress);
    float scanline = 0.84 + 0.16 * sin(gl_FragCoord.y * 1.25 + uMeta.y * 28.0);

    vec3 trailingColor = mix(uInnerColor.rgb, uMidColor.rgb, shellProgress);
    vec3 scanColor = mix(trailingColor, uOuterColor.rgb, leadingEdge);
    scanColor += uScanlineColor.rgb * (leadingEdge * 0.28 + trailingGlow * 0.08) * scanline;

    float alpha = (leadingEdge * 0.88 + trailingGlow * 0.34) * uOuterColor.a;
    fragColor = vec4(min(scanColor, vec3(1.0)), clamp(alpha, 0.0, 1.0));
}
