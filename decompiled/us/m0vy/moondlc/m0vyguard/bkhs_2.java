/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkhs_2 {
    private static final int hta_4 = -531035233;
    private static final int trf = -1098062164;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int w9ofsx775ttu;

    private bkhs_2() {
    }

    private static int szz_8(int n) {
        int n2 = n ^ hta_4;
        int n3 = (n2 ^ n2 >>> 10) * 857860517;
        int n4 = (n3 ^ n3 >>> 19) * -1981455163;
        return (n4 ^ n4 >>> 12) + trf;
    }

    public static int shshr(int n) {
        return bkhs_2.szz_8(n ^ System.identityHashCode(bkhs_2.class) ^ (int)Thread.currentThread().getId() * 69006543 ^ hta_4);
    }

    public static int ska(int n, int n2) {
        return bkhs_2.szz_8((n2 ^ Integer.rotateLeft(n, n2 & 9)) + trf ^ hta_4);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

