/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdgh {
    private static final int ya = -609801733;
    private static final int rkhk = 1553508796;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s547vwoxya3i;

    private tdgh() {
    }

    public static int rsb(int n) {
        int n2 = (n ^ tdgh.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ ya;
        int n3 = (n2 ^ n2 >>> 16) * 1915483307;
        int n4 = (n3 ^ n3 >>> 13) * -1726765557;
        return n4 ^ n4 >>> 14 ^ rkhk;
    }

    public static int khyz(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 6) * 210194693 + rkhk ^ ya;
        int n4 = (n3 ^ n3 >>> 14) * 1642665065;
        int n5 = (n4 ^ n4 >>> 10) * -1146586153;
        return n5 ^ n5 >>> 23 ^ rkhk;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

