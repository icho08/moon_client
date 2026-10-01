/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class kh {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vrwlnocj;

    private kh() {
    }

    public static int thzdh_2(int n) {
        int n2 = Integer.rotateRight(n * 1889532115 - System.identityHashCode(kh.class), 20);
        int n3 = (n2 ^ n2 >>> 16) * 294493069;
        int n4 = (n3 ^ n3 >>> 16) * 507227109;
        return n4 ^ n4 >>> 16;
    }

    public static int jksh(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x12);
        int n4 = (n3 ^ n3 >>> 11) * 1642147515;
        int n5 = (n4 ^ n4 >>> 9) * 1328609027;
        return n5 ^ n5 >>> 23;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

