/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tth_3 {
    private static final int tbj = 762001858;
    private static final int bsdh = -1430036944;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ne344h8mgu;

    private tth_3() {
    }

    public static int khhn_2(int n) {
        int n2 = n ^ System.identityHashCode(tth_3.class) ^ (int)Thread.currentThread().getId() * -2116044897 ^ tbj;
        int n3 = (n2 ^ n2 >>> 17) * 1455586929;
        int n4 = (n3 ^ n3 >>> 13) * -1441347875;
        return n4 ^ n4 >>> 21 ^ bsdh;
    }

    public static int khkhsh(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x10)) + bsdh ^ tbj;
        int n4 = (n3 ^ n3 >>> 12) * 1720599331;
        int n5 = (n4 ^ n4 >>> 12) * 768487747;
        return n5 ^ n5 >>> 12 ^ bsdh;
    }

    public static boolean khkhd(int n, int n2) {
        return ((tth_3.khkhsh(n, n2) ^ (int)System.nanoTime()) * -1242291911 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

