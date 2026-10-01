/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkht {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int y6093xwllko;

    private bkht() {
    }

    private static int zsdh_4(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 16) * 1556630589;
        int n4 = (n3 ^ n3 >>> 9) * -1054040473;
        return n4 ^ n4 >>> 17;
    }

    public static int sshr(int n) {
        return bkht.zsdh_4(Integer.rotateRight(n * -622911637 - System.identityHashCode(bkht.class), 5));
    }

    public static int tmq(int n, int n2) {
        return bkht.zsdh_4(n2 - n ^ 0x8C93B727);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

