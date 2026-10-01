/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bla_2 {
    private static final int stf_2 = 497338947;
    private static final int ddht_2 = -1597614849;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hxm4myszc68l;

    private bla_2() {
    }

    public static int ws(int n) {
        int n2 = n ^ stf_2 ^ System.identityHashCode(bla_2.class) ^ (int)Thread.currentThread().getId() * 723963953;
        int n3 = (n2 ^ n2 >>> 15) * 105807561;
        int n4 = (n3 ^ n3 >>> 7) * 815423699;
        return n4 ^ n4 >>> 21;
    }

    public static int smt_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * 777664333 ^ n2, 12) ^ ddht_2;
        int n4 = (n3 ^ n3 >>> 14) * -654452619;
        int n5 = (n4 ^ n4 >>> 11) * 1914318959;
        return n5 ^ n5 >>> 22;
    }

    public static boolean hthdh(int n, int n2) {
        return ((bla_2.smt_3(n, n2) ^ (int)System.nanoTime()) * -1087963227 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

