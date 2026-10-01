/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmd {
    private static final int shas_2 = 1998161978;
    private static final int rtj_2 = 1438539869;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mmwrss9h3qde;

    private bmd() {
    }

    public static int zkw(int n) {
        int n2 = n ^ System.identityHashCode(bmd.class) ^ (int)Thread.currentThread().getId() * 1107716877 ^ shas_2;
        int n3 = (n2 ^ n2 >>> 16) * -1415866425;
        int n4 = (n3 ^ n3 >>> 11) * 1116768669;
        return n4 ^ n4 >>> 15 ^ rtj_2;
    }

    public static int zth_7(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1232007719 ^ n2, 5) + rtj_2 ^ shas_2;
        int n4 = (n3 ^ n3 >>> 13) * 1925827083;
        int n5 = (n4 ^ n4 >>> 14) * -1407568155;
        return n5 ^ n5 >>> 15 ^ rtj_2;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

