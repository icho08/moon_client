/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btm {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yzwsqk4x1;

    private btm() {
    }

    public static int zrh_3(int n) {
        int n2 = (n ^ btm.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 15) * -1195047861;
        int n4 = (n3 ^ n3 >>> 9) * 1755274407;
        return n4 ^ n4 >>> 17;
    }

    public static int dhndh(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1387584811 ^ n2, 5);
        int n4 = (n3 ^ n3 >>> 13) * 563941823;
        int n5 = (n4 ^ n4 >>> 15) * -592518399;
        return n5 ^ n5 >>> 19;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

