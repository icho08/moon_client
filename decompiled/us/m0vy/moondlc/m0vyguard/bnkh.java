/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnkh {
    private static final int thghq = 1152726172;
    private static final int thad_4 = -1206805728;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xzacf7zu4;

    private bnkh() {
    }

    public static int sty_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 3) * -443705521 ^ thghq;
        int n3 = (n2 ^ n2 >>> 14) * -577911151;
        int n4 = (n3 ^ n3 >>> 8) * -1291532009;
        return n4 ^ n4 >>> 16 ^ thad_4;
    }

    public static int dy_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1531882321 ^ n2, 14) + thad_4 ^ thghq;
        int n4 = (n3 ^ n3 >>> 10) * 1118178915;
        int n5 = (n4 ^ n4 >>> 10) * -1088649961;
        return n5 ^ n5 >>> 18 ^ thad_4;
    }

    public static boolean shws(int n, int n2) {
        return ((bnkh.dy_2(n, n2) + Thread.currentThread().hashCode()) * 902458673 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

