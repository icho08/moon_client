/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnt_2 {
    private static final int qj = 957093036;
    private static final int szsh = -1170783386;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int cxq0utl9;

    private bnt_2() {
    }

    private static int ghzt_4(int n) {
        int n2 = n ^ qj;
        int n3 = (n2 ^ n2 >>> 9) * -651272287;
        int n4 = (n3 ^ n3 >>> 15) * -1020562555;
        return (n4 ^ n4 >>> 18) + szsh;
    }

    public static int dbr_2(int n) {
        return bnt_2.ghzt_4((n ^ qj ^ bnt_2.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int jshd(int n, int n2) {
        return bnt_2.ghzt_4(n2 ^ Integer.rotateLeft(n, n2 & 0x14) ^ szsh);
    }

    public static boolean zyr(int n, int n2) {
        return ((bnt_2.jshd(n, n2) ^ (int)System.nanoTime()) * 1637908861 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

