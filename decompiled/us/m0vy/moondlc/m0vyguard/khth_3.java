/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class khth_3 {
    private static final int swj = -1063701718;
    private static final int rwy = -1314705140;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vji5idjwfif;

    private khth_3() {
    }

    private static int syb(int n) {
        int n2 = n ^ swj;
        int n3 = (n2 ^ n2 >>> 11) * 1342495601;
        int n4 = (n3 ^ n3 >>> 19) * -766430021;
        return (n4 ^ n4 >>> 14) + rwy;
    }

    public static int shqa_2(int n) {
        return khth_3.syb(Integer.rotateLeft(n ^ swj ^ (int)System.nanoTime(), 16) * 1866018117);
    }

    public static int zzz_6(int n, int n2) {
        return khth_3.syb(Integer.rotateLeft(n ^ n2, 19) * -2088934743 ^ rwy);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

