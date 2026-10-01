/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class brd {
    private static final int dwk = 882648496;
    private static final int bf = -717772784;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int i76tn1qezsc;

    private brd() {
    }

    public static int bskh(int n) {
        int n2 = Integer.rotateRight((n ^ dwk) * 1985569571 - System.identityHashCode(brd.class), 15);
        int n3 = (n2 ^ n2 >>> 11) * 2058566611;
        int n4 = (n3 ^ n3 >>> 12) * 1178161261;
        return n4 ^ n4 >>> 18;
    }

    public static int adhm(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x10) ^ bf;
        int n4 = (n3 ^ n3 >>> 17) * 2012438483;
        int n5 = (n4 ^ n4 >>> 15) * 1885938877;
        return n5 ^ n5 >>> 17;
    }

    public static boolean jzl_2(int n, int n2) {
        return ((brd.adhm(n, n2) + Thread.currentThread().hashCode()) * 1128947813 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

