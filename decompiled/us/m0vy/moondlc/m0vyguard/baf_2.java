/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class baf_2 {
    private static final int shfl = -821870698;
    private static final int shsy = 594394331;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zmzg9xpirdz;

    private baf_2() {
    }

    private static int zdk(int n) {
        int n2 = n ^ shfl;
        int n3 = (n2 ^ n2 >>> 11) * -337514089;
        int n4 = (n3 ^ n3 >>> 18) * -196295261;
        return (n4 ^ n4 >>> 16) + shsy;
    }

    public static int sdh_4(int n) {
        return baf_2.zdk(Integer.rotateLeft(n ^ (int)System.nanoTime(), 16) * 847043999 ^ shfl);
    }

    public static int zqz_3(int n, int n2) {
        return baf_2.zdk((n + n2 ^ Integer.rotateLeft(n, 4)) + shsy ^ shfl);
    }

    public static boolean dhdk_2(int n, int n2) {
        return ((baf_2.zqz_3(n, n2) + Thread.currentThread().hashCode()) * -1564653895 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

