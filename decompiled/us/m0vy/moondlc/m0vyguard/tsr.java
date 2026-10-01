/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsr {
    private static final int dhaq = -1340426077;
    private static final int shtkh = 1325111594;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int e6xjpjxtw8ocs;

    private tsr() {
    }

    public static int jfy(int n) {
        int n2 = (n ^ dhaq ^ tsr.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * -203736477;
        int n4 = (n3 ^ n3 >>> 10) * 1201141989;
        return n4 ^ n4 >>> 22;
    }

    public static int hfy(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 5) * -274716461 ^ shtkh;
        int n4 = (n3 ^ n3 >>> 11) * 59399321;
        int n5 = (n4 ^ n4 >>> 9) * -701874927;
        return n5 ^ n5 >>> 12;
    }

    public static boolean rhs_4(int n, int n2) {
        return ((tsr.hfy(n, n2) ^ (int)System.nanoTime()) * -2128714673 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

