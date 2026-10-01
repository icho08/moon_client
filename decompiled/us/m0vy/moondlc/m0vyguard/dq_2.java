/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dq_2 {
    private static final int zzf = -88692377;
    private static final int rssh_2 = -1060414041;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int twk0plqk1;

    private dq_2() {
    }

    public static int zba_4(int n) {
        int n2 = Integer.rotateRight(n * 1230207101 - System.identityHashCode(dq_2.class), 8) ^ zzf;
        int n3 = (n2 ^ n2 >>> 12) * -1330503311;
        int n4 = (n3 ^ n3 >>> 9) * 742034439;
        return n4 ^ n4 >>> 21 ^ rssh_2;
    }

    public static int ghdhs(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 14)) + rssh_2 ^ zzf;
        int n4 = (n3 ^ n3 >>> 16) * 1154791017;
        int n5 = (n4 ^ n4 >>> 12) * 1625219747;
        return n5 ^ n5 >>> 12 ^ rssh_2;
    }

    public static boolean stb_4(int n, int n2) {
        return ((dq_2.ghdhs(n, n2) + Thread.currentThread().hashCode()) * 4973687 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

