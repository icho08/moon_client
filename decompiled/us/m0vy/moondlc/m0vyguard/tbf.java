/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tbf {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int uvwmld7v;

    private tbf() {
    }

    private static int zda_5(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * 996597903;
        int n4 = (n3 ^ n3 >>> 10) * 589348457;
        return n4 ^ n4 >>> 20;
    }

    public static int ttr_4(int n) {
        return tbf.zda_5(Integer.rotateRight(n * -1508426459 - System.identityHashCode(tbf.class), 25));
    }

    public static int khys_2(int n, int n2) {
        return tbf.zda_5(n2 - n ^ 0x86BACB60);
    }

    public static boolean tty_2(int n, int n2) {
        return ((tbf.khys_2(n, n2) + Thread.currentThread().hashCode()) * -662247581 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

