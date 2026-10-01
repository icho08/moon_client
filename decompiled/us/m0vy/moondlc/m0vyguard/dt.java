/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dt {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int on5oulbk6uo;

    private dt() {
    }

    private static int sh_5(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 8) * -1084236513;
        int n4 = (n3 ^ n3 >>> 13) * 574722409;
        return n4 ^ n4 >>> 14;
    }

    public static int ssl_2(int n) {
        return dt.sh_5((n ^ dt.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int dmsh(int n, int n2) {
        return dt.sh_5(n + n2 ^ Integer.rotateLeft(n, 3));
    }

    public static boolean hzs_4(int n, int n2) {
        return ((dt.dmsh(n, n2) ^ (int)System.nanoTime()) * 1999331911 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

