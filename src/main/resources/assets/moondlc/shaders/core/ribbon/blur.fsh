#version 150

uniform sampler2D Sampler0;
uniform float ColorOpacity;

in vec2 FragCoord;
in vec2 TexCoord;
in vec4 FragColor;

out vec4 OutColor;

vec2 screenUv(vec2 offset) {
    vec2 size = vec2(textureSize(Sampler0, 0));
    vec2 texel = 1.0 / size;
    return clamp((gl_FragCoord.xy + offset) / size, texel * 0.5, vec2(1.0) - texel * 0.5);
}

void main() {
    float alpha = FragColor.a;
    if (alpha < 0.001) {
        discard;
    }

    // Strong multi-ring gaussian blur (13-tap)
    vec3 color = vec3(0.0);

    // Center tap
    color += texture(Sampler0, screenUv(vec2(0.0))).rgb * 0.12;

    // Ring 1 - close samples (cardinal)
    color += texture(Sampler0, screenUv(vec2( 3.0,  0.0))).rgb * 0.08;
    color += texture(Sampler0, screenUv(vec2(-3.0,  0.0))).rgb * 0.08;
    color += texture(Sampler0, screenUv(vec2( 0.0,  3.0))).rgb * 0.08;
    color += texture(Sampler0, screenUv(vec2( 0.0, -3.0))).rgb * 0.08;

    // Ring 2 - medium diagonal
    color += texture(Sampler0, screenUv(vec2( 5.5,  5.5))).rgb * 0.065;
    color += texture(Sampler0, screenUv(vec2(-5.5,  5.5))).rgb * 0.065;
    color += texture(Sampler0, screenUv(vec2( 5.5, -5.5))).rgb * 0.065;
    color += texture(Sampler0, screenUv(vec2(-5.5, -5.5))).rgb * 0.065;

    // Ring 3 - far samples (cardinal)
    color += texture(Sampler0, screenUv(vec2( 9.0,  0.0))).rgb * 0.05;
    color += texture(Sampler0, screenUv(vec2(-9.0,  0.0))).rgb * 0.05;
    color += texture(Sampler0, screenUv(vec2( 0.0,  9.0))).rgb * 0.05;
    color += texture(Sampler0, screenUv(vec2( 0.0, -9.0))).rgb * 0.05;

    // Ring 4 - very far diagonal
    color += texture(Sampler0, screenUv(vec2( 12.0,  6.0))).rgb * 0.03;
    color += texture(Sampler0, screenUv(vec2(-12.0,  6.0))).rgb * 0.03;
    color += texture(Sampler0, screenUv(vec2( 6.0, -12.0))).rgb * 0.03;
    color += texture(Sampler0, screenUv(vec2(-6.0, -12.0))).rgb * 0.03;

    // Slight brightness boost to compensate for blur darkening
    color *= 1.15;

    // Mild white overlay to make it look like frosted glass
    vec3 frosted = mix(color, vec3(0.95, 0.95, 1.0), 0.15);

    // Mix in the trail color using ColorOpacity
    vec3 mixedColor = mix(frosted, FragColor.rgb, ColorOpacity);

    OutColor = vec4(mixedColor, min(alpha * 1.5, 1.0));
}
