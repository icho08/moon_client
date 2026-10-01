/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmj {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fnluxx3cgwx;

    private bmj() {
    }

    public static int alw(int n) {
        int n2 = Integer.rotateRight(n * 365829215 - System.identityHashCode(bmj.class), 15);
        int n3 = (n2 ^ n2 >>> 12) * -157400087;
        int n4 = (n3 ^ n3 >>> 16) * -701125151;
        return n4 ^ n4 >>> 13;
    }

    public static int rkha_2(int n, int n2) {
        int n3 = n2 - n ^ 0xA52B6C1F;
        int n4 = (n3 ^ n3 >>> 12) * 381090989;
        int n5 = (n4 ^ n4 >>> 14) * 1651697669;
        return n5 ^ n5 >>> 17;
    }

    public static boolean khthsh(int n, int n2) {
        return ((bmj.rkha_2(n, n2) + Thread.currentThread().hashCode()) * 1697619299 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

