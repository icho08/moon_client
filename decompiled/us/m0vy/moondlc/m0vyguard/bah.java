/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bah {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yx8emkulgn4o;

    private bah() {
    }

    public static int thhq_2(int n) {
        int n2 = Integer.rotateRight(n * -1515002783 - System.identityHashCode(bah.class), 6);
        int n3 = (n2 ^ n2 >>> 11) * -1242810117;
        int n4 = (n3 ^ n3 >>> 9) * 909862373;
        return n4 ^ n4 >>> 19;
    }

    public static int dhz_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1808767643 ^ n2, 16);
        int n4 = (n3 ^ n3 >>> 17) * -1866579873;
        int n5 = (n4 ^ n4 >>> 16) * -510579177;
        return n5 ^ n5 >>> 18;
    }

    public static boolean sqsh_2(int n, int n2) {
        return ((bah.dhz_3(n, n2) + Thread.currentThread().hashCode()) * 1446075461 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

