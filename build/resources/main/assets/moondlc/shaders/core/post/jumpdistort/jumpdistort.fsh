#version 150

uniform sampler2D Scene;
uniform sampler2D DepthSampler;

uniform vec4 uHeader;
uniform vec4 uHeader2;
uniform vec4 uHeader3;
uniform mat4 uInvViewProj;

uniform vec4 uData0;  uniform vec4 uData1;  uniform vec4 uData2;  uniform vec4 uData3;
uniform vec4 uData4;  uniform vec4 uData5;  uniform vec4 uData6;  uniform vec4 uData7;
uniform vec4 uData8;  uniform vec4 uData9;  uniform vec4 uData10; uniform vec4 uData11;
uniform vec4 uData12; uniform vec4 uData13; uniform vec4 uData14; uniform vec4 uData15;

uniform vec4 uColors0;  uniform vec4 uColors1;  uniform vec4 uColors2;  uniform vec4 uColors3;
uniform vec4 uColors4;  uniform vec4 uColors5;  uniform vec4 uColors6;  uniform vec4 uColors7;
uniform vec4 uColors8;  uniform vec4 uColors9;  uniform vec4 uColors10; uniform vec4 uColors11;
uniform vec4 uColors12; uniform vec4 uColors13; uniform vec4 uColors14; uniform vec4 uColors15;
uniform vec4 uColors16; uniform vec4 uColors17; uniform vec4 uColors18; uniform vec4 uColors19;
uniform vec4 uColors20; uniform vec4 uColors21; uniform vec4 uColors22; uniform vec4 uColors23;
uniform vec4 uColors24; uniform vec4 uColors25; uniform vec4 uColors26; uniform vec4 uColors27;
uniform vec4 uColors28; uniform vec4 uColors29; uniform vec4 uColors30; uniform vec4 uColors31;

in vec2 texCoord;
out vec4 fragColor;

vec4 rippleData(int index) {
    if (index == 0) return uData0;   if (index == 1) return uData1;
    if (index == 2) return uData2;   if (index == 3) return uData3;
    if (index == 4) return uData4;   if (index == 5) return uData5;
    if (index == 6) return uData6;   if (index == 7) return uData7;
    if (index == 8) return uData8;   if (index == 9) return uData9;
    if (index == 10) return uData10; if (index == 11) return uData11;
    if (index == 12) return uData12; if (index == 13) return uData13;
    if (index == 14) return uData14; if (index == 15) return uData15;
    return vec4(0.0);
}

vec4 rippleColor(int index) {
    if (index == 0) return uColors0;   if (index == 1) return uColors1;
    if (index == 2) return uColors2;   if (index == 3) return uColors3;
    if (index == 4) return uColors4;   if (index == 5) return uColors5;
    if (index == 6) return uColors6;   if (index == 7) return uColors7;
    if (index == 8) return uColors8;   if (index == 9) return uColors9;
    if (index == 10) return uColors10; if (index == 11) return uColors11;
    if (index == 12) return uColors12; if (index == 13) return uColors13;
    if (index == 14) return uColors14; if (index == 15) return uColors15;
    if (index == 16) return uColors16; if (index == 17) return uColors17;
    if (index == 18) return uColors18; if (index == 19) return uColors19;
    if (index == 20) return uColors20; if (index == 21) return uColors21;
    if (index == 22) return uColors22; if (index == 23) return uColors23;
    if (index == 24) return uColors24; if (index == 25) return uColors25;
    if (index == 26) return uColors26; if (index == 27) return uColors27;
    if (index == 28) return uColors28; if (index == 29) return uColors29;
    if (index == 30) return uColors30; if (index == 31) return uColors31;
    return vec4(0.0);
}

vec3 worldPosition(vec2 uv, float depth) {
    vec4 clipPosition = vec4(uv * 2.0 - 1.0, depth * 2.0 - 1.0, 1.0);
    vec4 position = uInvViewProj * clipPosition;
    return position.xyz / position.w;
}

vec3 angularColor(int rippleIndex, vec2 radialDirection) {
    const float TAU = 6.283185307;
    float angle = atan(radialDirection.y, radialDirection.x);
    float colorPosition = (angle < 0.0 ? angle + TAU : angle) / TAU * 4.0;
    int segment = int(floor(colorPosition)) & 3;
    float segmentProgress = fract(colorPosition);
    int baseIndex = rippleIndex * 4;
    return mix(rippleColor(baseIndex + segment).rgb, rippleColor(baseIndex + ((segment + 1) & 3)).rgb, segmentProgress);
}

void main() {
    vec2 uv = texCoord;
    vec3 sourceColor = texture(Scene, uv).rgb;
    float depth = texture(DepthSampler, uv).r;
    if (depth >= 0.999999) {
        fragColor = vec4(sourceColor, 1.0);
        return;
    }

    vec3 position = worldPosition(uv, depth);
    float aspect = max(uHeader.y, 0.0001);
    float time = uHeader.z;
    float baseWarp = max(uHeader.w, 0.0);
    float tintStrength = clamp(uHeader2.x, 0.0, 1.0) * 0.16;
    float distortionScale = max(uHeader3.y, 0.25);
    int count = min(int(uHeader.x + 0.5), 8);

    vec2 offset = vec2(0.0);
    vec3 tint = vec3(0.0);
    float totalInfluence = 0.0;
    for (int rippleIndex = 0; rippleIndex < count; rippleIndex++) {
        vec4 data0 = rippleData(rippleIndex * 2);
        vec4 data1 = rippleData(rippleIndex * 2 + 1);
        vec2 radial = position.xz - data0.xz;
        float radialLength = length(radial);
        if (radialLength <= 0.0001) {
            continue;
        }

        float radius = data0.w;
        float halfWidth = max(data1.x, 0.08);
        float verticalFade = 1.0 - smoothstep(0.20, 0.80, abs(position.y - data0.y));
        float radialFade = 1.0 - smoothstep(halfWidth, halfWidth * 1.8, abs(radialLength - radius));
        float influence = verticalFade * radialFade * clamp(data1.w, 0.0, 1.0);
        if (influence <= 0.0001) {
            continue;
        }

        vec2 radialDirection = radial / radialLength;
        float wave = sin((radialLength - radius) / halfWidth * 3.14159265 + time * 2.0);
        vec2 screenDirection = radialDirection;
        screenDirection.x /= aspect;
        offset += screenDirection * wave * data1.y * influence * distortionScale;
        offset += vec2(sin(time + radialDirection.y * 8.0), cos(time + radialDirection.x * 8.0))
                * baseWarp * influence * 0.15;

        tint += angularColor(rippleIndex, radialDirection) * influence;
        totalInfluence += influence;
    }

    vec2 sampleUv = clamp(uv + offset, vec2(0.001), vec2(0.999));
    vec3 color = texture(Scene, sampleUv).rgb;
    if (totalInfluence > 0.0001) {
        color += tint / totalInfluence * min(totalInfluence, 1.0) * tintStrength;
    }
    fragColor = vec4(min(color, vec3(1.0)), 1.0);
}
