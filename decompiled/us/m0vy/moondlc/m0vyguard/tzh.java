/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tzh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int oyd4xwvw;

    private tzh() {
    }

    public static int jqkh(int n) {
        int n2 = Integer.rotateRight(n * -877030171 - System.identityHashCode(tzh.class), 13);
        int n3 = (n2 ^ n2 >>> 17) * 284098169;
        int n4 = (n3 ^ n3 >>> 14) * -1945728295;
        return n4 ^ n4 >>> 14;
    }

    public static int khlq(int n, int n2) {
        int n3 = Integer.rotateRight(n * 326990589 ^ n2, 8);
        int n4 = (n3 ^ n3 >>> 12) * -839190679;
        int n5 = (n4 ^ n4 >>> 14) * -1044468547;
        return n5 ^ n5 >>> 15;
    }

    public static boolean drr_2(int n, int n2) {
        return ((tzh.khlq(n, n2) + Thread.currentThread().hashCode()) * -1560189009 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

