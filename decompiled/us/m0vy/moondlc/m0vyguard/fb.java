/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class fb {
    private static final int ththw = 89533003;
    private static final int rshs = -2082425422;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int z06rgbqlrl26;

    private fb() {
    }

    public static int zkj_2(int n) {
        int n2 = (n ^ fb.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ ththw;
        int n3 = (n2 ^ n2 >>> 11) * -1060705641;
        int n4 = (n3 ^ n3 >>> 16) * 1909273375;
        return n4 ^ n4 >>> 20 ^ rshs;
    }

    public static int zsj_4(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1298802961 ^ n2, 14) + rshs ^ ththw;
        int n4 = (n3 ^ n3 >>> 8) * 68054935;
        int n5 = (n4 ^ n4 >>> 13) * -963388163;
        return n5 ^ n5 >>> 15 ^ rshs;
    }

    public static boolean jah_3(int n, int n2) {
        return ((fb.zsj_4(n, n2) ^ (int)System.nanoTime()) * -1750127705 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

