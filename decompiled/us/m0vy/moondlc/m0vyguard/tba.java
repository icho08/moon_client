/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tba {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kv1h6dgpf;

    private tba() {
    }

    private static int shmt(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * 888767455;
        int n4 = (n3 ^ n3 >>> 13) * 512753969;
        return n4 ^ n4 >>> 20;
    }

    public static int khzh_2(int n) {
        return tba.shmt(n ^ System.identityHashCode(tba.class) ^ (int)Thread.currentThread().getId() * 791966345);
    }

    public static int hdh_3(int n, int n2) {
        return tba.shmt(Integer.rotateRight(n * 457163187 ^ n2, 11));
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

