/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthr {
    private static final int dhhk = -1457214446;
    private static final int tzs_4 = 1941995743;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p8wjj4i7;

    private tthr() {
    }

    private static int ddd_8(int n) {
        int n2 = n ^ dhhk;
        int n3 = (n2 ^ n2 >>> 12) * -1344188341;
        int n4 = (n3 ^ n3 >>> 19) * -786363263;
        return (n4 ^ n4 >>> 12) + tzs_4;
    }

    public static int rkd(int n) {
        return tthr.ddd_8(n ^ dhhk ^ System.identityHashCode(tthr.class) ^ (int)Thread.currentThread().getId() * -265975993);
    }

    public static int taw_4(int n, int n2) {
        return tthr.ddd_8(n2 - n ^ 0x5E2BAF43 ^ tzs_4);
    }

    public static boolean dhthf(int n, int n2) {
        return ((tthr.taw_4(n, n2) ^ (int)System.nanoTime()) * -229604739 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

