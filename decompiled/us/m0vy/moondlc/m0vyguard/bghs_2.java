/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bghs_2 {
    private static final int shq_2 = 1836867807;
    private static final int sdth = -1246802732;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int z4msqh1qm;

    private bghs_2() {
    }

    private static int zlj_2(int n) {
        int n2 = n ^ shq_2;
        int n3 = (n2 ^ n2 >>> 13) * 563974815;
        int n4 = (n3 ^ n3 >>> 13) * 163134111;
        return (n4 ^ n4 >>> 15) + sdth;
    }

    public static int tghz_3(int n) {
        return bghs_2.zlj_2((n ^ bghs_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ shq_2);
    }

    public static int sah_5(int n, int n2) {
        return bghs_2.zlj_2((n2 - n ^ 0xB87E40B8) + sdth ^ shq_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

