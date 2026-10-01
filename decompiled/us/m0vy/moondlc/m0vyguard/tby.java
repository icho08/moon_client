/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tby {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hgq6pgtrbv596u;

    private tby() {
    }

    private static int dhla(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 8) * -1354117355;
        int n4 = (n3 ^ n3 >>> 18) * 537384505;
        return n4 ^ n4 >>> 16;
    }

    public static int rath(int n) {
        return tby.dhla(Integer.rotateRight(n * -367674765 - System.identityHashCode(tby.class), 23));
    }

    public static int dly(int n, int n2) {
        return tby.dhla(Integer.rotateLeft(n ^ n2, 15) * 1113293937);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

