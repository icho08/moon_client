/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bqb {
    private static final int shdl_2 = 1239758145;
    private static final int khdhdh = 2127683478;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int bzryess1lf8c;

    private bqb() {
    }

    private static int drkh_2(int n) {
        int n2 = n ^ shdl_2;
        int n3 = (n2 ^ n2 >>> 7) * 682538603;
        int n4 = (n3 ^ n3 >>> 9) * -409733015;
        return (n4 ^ n4 >>> 12) + khdhdh;
    }

    public static int hys_2(int n) {
        return bqb.drkh_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 20) * 1539821473 ^ shdl_2);
    }

    public static int khzw_2(int n, int n2) {
        return bqb.drkh_2((n + n2 ^ Integer.rotateLeft(n, 3)) + khdhdh ^ shdl_2);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

