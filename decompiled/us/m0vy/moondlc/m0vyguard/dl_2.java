/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dl_2 {
    private static final int hmt = 1141740789;
    private static final int khtth = 850760581;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nihu3pyoo;

    private dl_2() {
    }

    private static int tlt_2(int n) {
        int n2 = n ^ hmt;
        int n3 = (n2 ^ n2 >>> 7) * -1351295483;
        int n4 = (n3 ^ n3 >>> 19) * 1496916601;
        return (n4 ^ n4 >>> 24) + khtth;
    }

    public static int zkha_4(int n) {
        return dl_2.tlt_2((n ^ dl_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ hmt);
    }

    public static int tln_2(int n, int n2) {
        return dl_2.tlt_2((n + n2 ^ Integer.rotateLeft(n, 10)) + khtth ^ hmt);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

