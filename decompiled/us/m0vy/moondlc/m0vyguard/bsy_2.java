/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsy_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int c5sxq7cbu8d;

    private bsy_2() {
    }

    public static int hkhf(int n) {
        int n2 = Integer.rotateRight(n * -142770301 - System.identityHashCode(bsy_2.class), 18);
        int n3 = (n2 ^ n2 >>> 11) * -1889777179;
        int n4 = (n3 ^ n3 >>> 9) * -345207579;
        return n4 ^ n4 >>> 14;
    }

    public static int asa(int n, int n2) {
        int n3 = Integer.rotateRight(n * 299166373 ^ n2, 6);
        int n4 = (n3 ^ n3 >>> 10) * -630030433;
        int n5 = (n4 ^ n4 >>> 16) * -900946695;
        return n5 ^ n5 >>> 14;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

