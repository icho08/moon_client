/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthd_2 {
    private static final int shbs = -45851744;
    private static final int dhtz_3 = -572421484;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ibyghemr;

    private tthd_2() {
    }

    private static int hzb_2(int n) {
        int n2 = n ^ shbs;
        int n3 = (n2 ^ n2 >>> 8) * 1984808281;
        int n4 = (n3 ^ n3 >>> 12) * -246500665;
        return (n4 ^ n4 >>> 16) + dhtz_3;
    }

    public static int ahr_2(int n) {
        return tthd_2.hzb_2((n ^ tthd_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ shbs);
    }

    public static int sdn_4(int n, int n2) {
        return tthd_2.hzb_2((n + n2 ^ Integer.rotateLeft(n, 4)) + dhtz_3 ^ shbs);
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

