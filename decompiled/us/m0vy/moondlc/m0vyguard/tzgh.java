/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tzgh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int eoiukrwxjm0;

    private tzgh() {
    }

    private static int rhj(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 16) * -1890514789;
        int n4 = (n3 ^ n3 >>> 11) * -714350951;
        return n4 ^ n4 >>> 13;
    }

    public static int bnt_2(int n) {
        return tzgh.rhj(Integer.rotateRight(n * 1737409981 - System.identityHashCode(tzgh.class), 12));
    }

    public static int tfsh_2(int n, int n2) {
        return tzgh.rhj(n2 - n ^ 0x70BF4E7A);
    }

    public static boolean sysh(int n, int n2) {
        return ((tzgh.tfsh_2(n, n2) + Thread.currentThread().hashCode()) * 1243552359 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

