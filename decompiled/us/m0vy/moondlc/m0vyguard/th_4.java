/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class th_4 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kv8ux0uny5;

    private th_4() {
    }

    private static int trr_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 16) * 1190808295;
        int n4 = (n3 ^ n3 >>> 18) * -1576622727;
        return n4 ^ n4 >>> 23;
    }

    public static int my(int n) {
        return th_4.trr_2(n ^ System.identityHashCode(th_4.class) ^ (int)Thread.currentThread().getId() * -1267260039);
    }

    public static int jsn(int n, int n2) {
        return th_4.trr_2(n2 ^ Integer.rotateLeft(n, n2 & 0x16));
    }

    public static boolean dhzd_2(int n, int n2) {
        return ((th_4.jsn(n, n2) ^ (int)System.nanoTime()) * 1284072803 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

