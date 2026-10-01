/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class byh_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int bo3jt26c4gb;

    private byh_2() {
    }

    public static int thzth(int n) {
        int n2 = n ^ System.identityHashCode(byh_2.class) ^ (int)Thread.currentThread().getId() * -1830226675;
        int n3 = (n2 ^ n2 >>> 13) * 1706254387;
        int n4 = (n3 ^ n3 >>> 9) * 485675483;
        return n4 ^ n4 >>> 17;
    }

    public static int shrsh(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 9);
        int n4 = (n3 ^ n3 >>> 8) * 1128575801;
        int n5 = (n4 ^ n4 >>> 15) * -1616780889;
        return n5 ^ n5 >>> 16;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

