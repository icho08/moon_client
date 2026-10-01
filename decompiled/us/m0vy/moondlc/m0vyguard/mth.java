/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class mth {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vnq89ze76sg;

    private mth() {
    }

    public static int jrsh(int n) {
        int n2 = (n ^ mth.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * 1528543465;
        int n4 = (n3 ^ n3 >>> 16) * -1969914915;
        return n4 ^ n4 >>> 13;
    }

    public static int hly(int n, int n2) {
        int n3 = Integer.rotateRight(n * 761899185 ^ n2, 12);
        int n4 = (n3 ^ n3 >>> 11) * -1477312381;
        int n5 = (n4 ^ n4 >>> 11) * -79366579;
        return n5 ^ n5 >>> 19;
    }

    public static boolean dthj(int n, int n2) {
        return ((mth.hly(n, n2) ^ (int)System.nanoTime()) * -969467657 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

