/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bld_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ntzc3odlsz0ry9;

    private bld_2() {
    }

    public static int bfd_2(int n) {
        int n2 = Integer.rotateRight(n * 922672019 - System.identityHashCode(bld_2.class), 26);
        int n3 = (n2 ^ n2 >>> 15) * 798900581;
        int n4 = (n3 ^ n3 >>> 9) * -873953497;
        return n4 ^ n4 >>> 17;
    }

    public static int tsth(int n, int n2) {
        int n3 = n2 - n ^ 0x57689929;
        int n4 = (n3 ^ n3 >>> 16) * 1633891773;
        int n5 = (n4 ^ n4 >>> 12) * -524219415;
        return n5 ^ n5 >>> 14;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

