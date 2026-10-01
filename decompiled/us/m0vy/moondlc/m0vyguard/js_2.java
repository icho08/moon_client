/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class js_2 {
    private static final int shkt = -1980719119;
    private static final int zzy = 1769333467;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gjeq3dmx84tyj;

    private js_2() {
    }

    private static int dd_4(int n) {
        int n2 = n ^ shkt;
        int n3 = (n2 ^ n2 >>> 13) * 355718457;
        int n4 = (n3 ^ n3 >>> 17) * -1160161;
        return (n4 ^ n4 >>> 16) + zzy;
    }

    public static int aa(int n) {
        return js_2.dd_4(Integer.rotateRight((n ^ shkt) * 2044025439 - System.identityHashCode(js_2.class), 26));
    }

    public static int hkhth(int n, int n2) {
        return js_2.dd_4(n + n2 ^ Integer.rotateLeft(n, 15) ^ zzy);
    }

    public static boolean khnz(int n, int n2) {
        return ((js_2.hkhth(n, n2) + Thread.currentThread().hashCode()) * 137087069 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

