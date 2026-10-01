/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wn {
    private static final int dmf = -396032364;
    private static final int sad_6 = 483433878;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int xncg9dy4d9i;

    private wn() {
    }

    private static int df(int n) {
        int n2 = n ^ dmf;
        int n3 = (n2 ^ n2 >>> 12) * -1867393067;
        int n4 = (n3 ^ n3 >>> 18) * -1834743533;
        return (n4 ^ n4 >>> 23) + sad_6;
    }

    public static int zzm(int n) {
        return wn.df(Integer.rotateRight(n * -1363503023 - System.identityHashCode(wn.class), 8) ^ dmf);
    }

    public static int ghkhy(int n, int n2) {
        return wn.df((n2 - n ^ 0x6FF392AE) + sad_6 ^ dmf);
    }

    public static boolean raw(int n, int n2) {
        return ((wn.ghkhy(n, n2) + Thread.currentThread().hashCode()) * -1388409473 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

