/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sl {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yioeumdndy4;

    private sl() {
    }

    private static int stz_6(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 14) * 1123837089;
        int n4 = (n3 ^ n3 >>> 11) * -509177055;
        return n4 ^ n4 >>> 22;
    }

    public static int shshy(int n) {
        return sl.stz_6((n ^ sl.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int khykh(int n, int n2) {
        return sl.stz_6(n + n2 ^ Integer.rotateLeft(n, 6));
    }

    public static boolean dsb_2(int n, int n2) {
        return ((sl.khykh(n, n2) ^ (int)System.nanoTime()) * 1626107247 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

