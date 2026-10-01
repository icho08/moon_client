/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class khs {
    private static final int tbkh = -1037746374;
    private static final int thjm = -1782322914;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q8clrzt0;

    private khs() {
    }

    private static int zfk(int n) {
        int n2 = n ^ tbkh;
        int n3 = (n2 ^ n2 >>> 8) * 35947809;
        int n4 = (n3 ^ n3 >>> 11) * 1048670403;
        return (n4 ^ n4 >>> 17) + thjm;
    }

    public static int jtth(int n) {
        return khs.zfk(n ^ System.identityHashCode(khs.class) ^ (int)Thread.currentThread().getId() * -460396835 ^ tbkh);
    }

    public static int ztkh_2(int n, int n2) {
        return khs.zfk(Integer.rotateRight(n * -973632545 ^ n2, 18) + thjm ^ tbkh);
    }

    public static boolean ahm(int n, int n2) {
        return ((khs.ztkh_2(n, n2) ^ (int)System.nanoTime()) * -1848480531 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

