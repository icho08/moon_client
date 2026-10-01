#version 150

uniform sampler2D Sampler0; // Hand Color
uniform sampler2D Sampler1; // Hand Depth
uniform vec2 Resolution;
uniform vec4 GlowColor;     // White glow color
uniform float DraggedArm;   // 0.0 = Right arm, 1.0 = Left arm, 2.0 = Both

in vec2 TexCoord;
out vec4 OutColor;

float getHandMask(vec2 uv) {
    if (uv.x <= 0.0 || uv.y <= 0.0 || uv.x >= 1.0 || uv.y >= 1.0) {
        return 0.0;
    }
    return smoothstep(0.9999, 0.998, texture(Sampler1, uv).r);
}

void main() {
    // Filter screen side according to dragged arm (0 = Right, 1 = Left)
    if (DraggedArm < 0.5 && TexCoord.x < 0.40) {
        discard;
    }
    if (DraggedArm > 0.5 && DraggedArm < 1.5 && TexCoord.x > 0.60) {
        discard;
    }

    float centerMask = getHandMask(TexCoord);
    vec2 step = 3.0 / Resolution;

    // Ultra-fast 4-tap sampling (5 texture reads total vs 49)
    float m1 = getHandMask(TexCoord + vec2(-step.x, 0.0));
    float m2 = getHandMask(TexCoord + vec2(step.x, 0.0));
    float m3 = getHandMask(TexCoord + vec2(0.0, -step.y));
    float m4 = getHandMask(TexCoord + vec2(0.0, step.y));

    float avgSurrounding = (m1 + m2 + m3 + m4) * 0.25;

    float edge = smoothstep(0.03, 0.30, abs(avgSurrounding - centerMask));
    float outerGlow = smoothstep(0.02, 0.25, avgSurrounding) * (1.0 - centerMask * 0.65);

    float finalAlpha = max(edge * 1.4, outerGlow * 0.9) * GlowColor.a;
    if (finalAlpha <= 0.005) {
        discard;
    }

    vec3 whiteGlow = GlowColor.rgb * (1.3 + edge * 0.4);
    OutColor = vec4(clamp(whiteGlow, 0.0, 1.0), clamp(finalAlpha, 0.0, 1.0));
}
