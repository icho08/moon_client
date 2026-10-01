/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ff {
    private static final int thkhr = -1665684476;
    private static final int dwkh = 657020861;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int k17h1n93it;

    private ff() {
    }

    public static int zjd_3(int n) {
        int n2 = Integer.rotateRight((n ^ thkhr) * -668290723 - System.identityHashCode(ff.class), 13);
        int n3 = (n2 ^ n2 >>> 14) * -1608371847;
        int n4 = (n3 ^ n3 >>> 10) * 1232962351;
        return n4 ^ n4 >>> 21;
    }

    public static int zsn_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 9) ^ dwkh;
        int n4 = (n3 ^ n3 >>> 12) * 572545753;
        int n5 = (n4 ^ n4 >>> 18) * -403083195;
        return n5 ^ n5 >>> 18;
    }

    public static boolean saj(int n, int n2) {
        return ((ff.zsn_2(n, n2) + Thread.currentThread().hashCode()) * -777153721 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

