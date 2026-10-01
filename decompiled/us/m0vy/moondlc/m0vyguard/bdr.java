/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdr {
    private static final int shrgh = 1427581054;
    private static final int thbs_2 = -1760884980;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ybikwikcp7o3;

    private bdr() {
    }

    private static int ddh_9(int n) {
        int n2 = n ^ shrgh;
        int n3 = (n2 ^ n2 >>> 16) * 1760401165;
        int n4 = (n3 ^ n3 >>> 10) * 822678087;
        return (n4 ^ n4 >>> 22) + thbs_2;
    }

    public static int hkw(int n) {
        return bdr.ddh_9(n ^ shrgh ^ System.identityHashCode(bdr.class) ^ (int)Thread.currentThread().getId() * -1855660969);
    }

    public static int shd(int n, int n2) {
        return bdr.ddh_9(n2 - n ^ 0xEBA413CB ^ thbs_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

