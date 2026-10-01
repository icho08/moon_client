#version 150

in vec3 Position;
in vec2 UV0;
in vec4 Color;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;
uniform float CameraYaw;
uniform float CameraPitch;

out vec3 Direction;
out vec4 vColor;

mat3 rotateX(float angle) {
    float sine = sin(angle);
    float cosine = cos(angle);
    return mat3(1.0, 0.0, 0.0, 0.0, cosine, sine, 0.0, -sine, cosine);
}

mat3 rotateY(float angle) {
    float sine = sin(angle);
    float cosine = cos(angle);
    return mat3(cosine, 0.0, sine, 0.0, 1.0, 0.0, -sine, 0.0, cosine);
}

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);
    Direction = rotateY(CameraYaw) * rotateX(CameraPitch) * Position;
    vColor = Color;
}
