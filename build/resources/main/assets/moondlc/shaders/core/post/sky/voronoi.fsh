#version 150

uniform float uTime;
uniform vec2 uResolution;
uniform vec3 uColor;
uniform float uAlpha;
uniform float uSpeed;
uniform float uScale;
uniform float uIntensity;
uniform vec2 uCameraDir;
uniform float uFov;

out vec4 fragColor;

mat3 rotX(float a) {
    float c = cos(a), s = sin(a);
    return mat3(1.0, 0.0, 0.0,
                0.0,   c,   s,
                0.0,  -s,   c);
}
mat3 rotY(float a) {
    float c = cos(a), s = sin(a);
    return mat3(  c, 0.0,   s,
                0.0, 1.0, 0.0,
                 -s, 0.0,   c);
}

// 3D hash vector for Voronoi cell feature points
vec3 hash3(vec3 p) {
    p = vec3(dot(p, vec3(127.1, 311.7, 74.7)),
             dot(p, vec3(269.5, 183.3, 246.1)),
             dot(p, vec3(113.5, 271.9, 124.6)));
    return fract(sin(p) * 43758.5453123);
}

// 3D Voronoi noise calculating F1 (nearest distance) and F2 (2nd nearest)
vec2 voronoi(vec3 x, float t) {
    vec3 n = floor(x);
    vec3 f = fract(x);

    float m1 = 8.0;
    float m2 = 8.0;

    for (int k = -1; k <= 1; k++) {
        for (int j = -1; j <= 1; j++) {
            for (int i = -1; i <= 1; i++) {
                vec3 g = vec3(float(i), float(j), float(k));
                vec3 o = hash3(n + g);
                // Animate feature point offsets
                vec3 r = g + 0.5 + 0.4 * sin(t + 6.2831 * o) - f;
                float d = dot(r, r);

                if (d < m1) {
                    m2 = m1;
                    m1 = d;
                } else if (d < m2) {
                    m2 = d;
                }
            }
        }
    }
    return vec2(sqrt(m1), sqrt(m2));
}

void main() {
    vec2 uv = gl_FragCoord.xy / uResolution.xy;
    vec2 sp = uv * 2.0 - 1.0;
    float aspect = uResolution.x / uResolution.y;

    float tanV = tan(radians(uFov) * 0.5);
    vec3 rayV = normalize(vec3(sp.x * tanV * aspect, sp.y * tanV, 1.0));
    vec3 rayW = rotY(uCameraDir.x) * rotX(uCameraDir.y) * rayV;

    float t = uTime * uSpeed * 0.5;
    vec3 p = rayW * uScale;

    vec2 v = voronoi(p, t);

    // Cell edge bioluminescence: F2 - F1 gives crisp cell boundary lines
    float edge = v.y - v.x;
    float lineGlow = exp(-edge * 12.0);

    // Cell interior soft gradient
    float cellGlow = smoothstep(0.0, 0.8, v.x) * 0.25;

    float totalGlow = (lineGlow * 1.8 + cellGlow) * (uIntensity * 80.0);

    vec3 color = uColor * totalGlow;

    fragColor = vec4(color, uAlpha);
}
