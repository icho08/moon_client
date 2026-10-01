/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class trj {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int karccrj5;

    private trj() {
    }

    private static int hsha_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * 1890570853;
        int n4 = (n3 ^ n3 >>> 14) * 911457799;
        return n4 ^ n4 >>> 20;
    }

    public static int shys(int n) {
        return trj.hsha_2(Integer.rotateRight(n * 2138759101 - System.identityHashCode(trj.class), 7));
    }

    public static int ttk_2(int n, int n2) {
        return trj.hsha_2(Integer.rotateLeft(n ^ n2, 17) * 1658734903);
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

