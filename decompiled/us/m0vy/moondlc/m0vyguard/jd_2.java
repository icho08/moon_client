/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class jd_2 {
    private static final int dhthw = -1402566102;
    private static final int khsf = -595803709;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int z4dffkgu4;

    private jd_2() {
    }

    public static int dhnt_2(int n) {
        int n2 = Integer.rotateRight((n ^ dhthw) * -224012255 - System.identityHashCode(jd_2.class), 20);
        int n3 = (n2 ^ n2 >>> 11) * -1762574263;
        int n4 = (n3 ^ n3 >>> 7) * 1213036445;
        return n4 ^ n4 >>> 22;
    }

    public static int jdn_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 12) * 584464931 ^ khsf;
        int n4 = (n3 ^ n3 >>> 10) * -1419952105;
        int n5 = (n4 ^ n4 >>> 13) * -1371603593;
        return n5 ^ n5 >>> 23;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

