#version 150

in vec3 Position;
in vec4 Color;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;

out vec2 TexCoord;
out vec4 FragColor;

void main() {
    vec4 clipPos = ProjMat * ModelViewMat * vec4(Position, 1.0);
    gl_Position = clipPos;
    TexCoord = (clipPos.xy / max(clipPos.w, 0.0001)) * 0.5 + 0.5;
    FragColor = Color;
}
