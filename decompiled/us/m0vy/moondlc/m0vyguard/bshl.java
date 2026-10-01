/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshl {
    private static final int khts = 227475880;
    private static final int ththkh = 831590839;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int h2atyemfdw3;

    private bshl() {
    }

    private static int hhm_2(int n) {
        int n2 = n ^ khts;
        int n3 = (n2 ^ n2 >>> 14) * -1664139247;
        int n4 = (n3 ^ n3 >>> 16) * -1339026013;
        return (n4 ^ n4 >>> 11) + ththkh;
    }

    public static int sthy(int n) {
        return bshl.hhm_2((n ^ bshl.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ khts);
    }

    public static int jfsh(int n, int n2) {
        return bshl.hhm_2((n2 - n ^ 0x8F8C5425) + ththkh ^ khts);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

