#version 150

uniform sampler2D InSampler;
uniform float uRadius;
uniform vec2 BlurDir;

in vec2 texCoord;
in vec2 sampleStep;

out vec4 fragColor;

void main() {
    float radius = clamp(uRadius, 0.0, 6.0);
    vec4 blurred = vec4(0.0);
    float samples = 0.0;
    
    vec2 step = sampleStep;
    if (step == vec2(0.0)) {
        step = BlurDir * 0.00001;
    }

    for (int i = -6; i <= 6; i++) {
        float offset = float(i);
        if (abs(offset) > radius) {
            continue;
        }

        blurred += texture(InSampler, texCoord + step * offset);
        samples += 1.0;
    }

    if (samples <= 0.0) {
        fragColor = texture(InSampler, texCoord);
        return;
    }

    vec4 color = blurred / samples;
    fragColor = vec4(color.rgb, color.a);
}
