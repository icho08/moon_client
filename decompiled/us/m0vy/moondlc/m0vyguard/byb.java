/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class byb {
    private static final int khqa = 985101306;
    private static final int jkth = -1969073536;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int j990ux5g7;

    private byb() {
    }

    private static int thhd(int n) {
        int n2 = n ^ khqa;
        int n3 = (n2 ^ n2 >>> 8) * -1542393911;
        int n4 = (n3 ^ n3 >>> 19) * -766709543;
        return (n4 ^ n4 >>> 14) + jkth;
    }

    public static int szz_5(int n) {
        return byb.thhd((n ^ byb.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ khqa);
    }

    public static int rhs_3(int n, int n2) {
        return byb.thhd((n2 - n ^ 0xF1DC6459) + jkth ^ khqa);
    }

    public static boolean thy_4(int n, int n2) {
        return ((byb.rhs_3(n, n2) ^ (int)System.nanoTime()) * -674856287 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

