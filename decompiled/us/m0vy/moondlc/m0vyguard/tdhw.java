/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdhw {
    private static final int dhzh = 661580239;
    private static final int tqd = 654425835;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int pni5o87vm1sco;

    private tdhw() {
    }

    private static int shqn(int n) {
        int n2 = n ^ dhzh;
        int n3 = (n2 ^ n2 >>> 8) * 445652431;
        int n4 = (n3 ^ n3 >>> 20) * 136694545;
        return (n4 ^ n4 >>> 14) + tqd;
    }

    public static int dhhn_2(int n) {
        return tdhw.shqn((n ^ tdhw.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dhzh);
    }

    public static int zts_3(int n, int n2) {
        return tdhw.shqn((n + n2 ^ Integer.rotateLeft(n, 4)) + tqd ^ dhzh);
    }

    public static boolean jks_2(int n, int n2) {
        return ((tdhw.zts_3(n, n2) ^ (int)System.nanoTime()) * 485352989 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

