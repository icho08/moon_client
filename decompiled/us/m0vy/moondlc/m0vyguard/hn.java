/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hn {
    private static final int jkk = -644399790;
    private static final int jdkh_2 = -36565620;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int juz63qrtc;

    private hn() {
    }

    private static int hdhsh(int n) {
        int n2 = n ^ jkk;
        int n3 = (n2 ^ n2 >>> 7) * -1662881165;
        int n4 = (n3 ^ n3 >>> 15) * -1301664011;
        return (n4 ^ n4 >>> 11) + jdkh_2;
    }

    public static int zk_2(int n) {
        return hn.hdhsh(n ^ jkk ^ System.identityHashCode(hn.class) ^ (int)Thread.currentThread().getId() * -2134418651);
    }

    public static int dtd(int n, int n2) {
        return hn.hdhsh(Integer.rotateLeft(n ^ n2, 19) * 1016863153 ^ jdkh_2);
    }

    public static boolean zzsh_2(int n, int n2) {
        return ((hn.dtd(n, n2) ^ (int)System.nanoTime()) * 763014425 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

