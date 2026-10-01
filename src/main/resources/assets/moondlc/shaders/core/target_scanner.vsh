#version 150

in vec3 Position;
in vec4 Color;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;

// Color channel repurposing (no extra vertex attribs needed):
//   R = normalised Y within the cylinder (0 = bottom, 1 = top)
//   G = angle fraction (0 … 1 == 0 … 2π around the cylinder)
//   B = render mode: 0 = scan-line body, 1 = aurora column background
//   A = master alpha (from show-animation)
out float vNormY;
out float vAngle;
out float vMode;
out float vAlpha;

void main() {
    vNormY = Color.r;
    vAngle = Color.g;
    vMode  = Color.b;
    vAlpha = Color.a;
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);
}
