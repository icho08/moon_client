/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class yb {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int z99jr1vi1;

    private yb() {
    }

    private static int shyw(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 13) * -1813162707;
        int n4 = (n3 ^ n3 >>> 9) * 262072535;
        return n4 ^ n4 >>> 20;
    }

    public static int khthgh(int n) {
        return yb.shyw(n ^ System.identityHashCode(yb.class) ^ (int)Thread.currentThread().getId() * -624905765);
    }

    public static int ft_2(int n, int n2) {
        return yb.shyw(n2 ^ Integer.rotateLeft(n, n2 & 0xA));
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

