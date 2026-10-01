/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class fz {
    private static final int hsq_2 = 1637008802;
    private static final int dbgh = -1750767551;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int iwesib4aq1;

    private fz() {
    }

    private static int jdhsh(int n) {
        int n2 = n ^ hsq_2;
        int n3 = (n2 ^ n2 >>> 14) * 1121909861;
        int n4 = (n3 ^ n3 >>> 12) * 1240880565;
        return (n4 ^ n4 >>> 22) + dbgh;
    }

    public static int zhn_2(int n) {
        return fz.jdhsh(n ^ hsq_2 ^ System.identityHashCode(fz.class) ^ (int)Thread.currentThread().getId() * 318614249);
    }

    public static int shma_2(int n, int n2) {
        return fz.jdhsh(Integer.rotateLeft(n ^ n2, 17) * -129805069 ^ dbgh);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

