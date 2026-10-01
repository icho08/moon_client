/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bjt {
    private static final int thzd_2 = 1725691120;
    private static final int jthn = -1608281103;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tnvv6yhg;

    private bjt() {
    }

    private static int bkh(int n) {
        int n2 = n ^ thzd_2;
        int n3 = (n2 ^ n2 >>> 14) * 168452869;
        int n4 = (n3 ^ n3 >>> 15) * 1482376523;
        return (n4 ^ n4 >>> 14) + jthn;
    }

    public static int rjq(int n) {
        return bjt.bkh((n ^ bjt.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ thzd_2);
    }

    public static int hkd(int n, int n2) {
        return bjt.bkh((n2 - n ^ 0xB65750C4) + jthn ^ thzd_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

