/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bld {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zvtbts1ra;

    private bld() {
    }

    public static int swh_3(int n) {
        int n2 = n ^ System.identityHashCode(bld.class) ^ (int)Thread.currentThread().getId() * 1958896531;
        int n3 = (n2 ^ n2 >>> 18) * -268555947;
        int n4 = (n3 ^ n3 >>> 8) * -1874585591;
        return n4 ^ n4 >>> 18;
    }

    public static int hssh(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 3);
        int n4 = (n3 ^ n3 >>> 10) * 1786230847;
        int n5 = (n4 ^ n4 >>> 13) * 483894513;
        return n5 ^ n5 >>> 17;
    }

    public static boolean shwdh(int n, int n2) {
        return ((bld.hssh(n, n2) ^ (int)System.nanoTime()) * -651405743 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

