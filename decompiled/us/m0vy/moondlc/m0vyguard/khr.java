/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class khr {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int xid4m7q0zm;

    private khr() {
    }

    public static int ral(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 5) * 1603099809;
        int n3 = (n2 ^ n2 >>> 12) * 1044909035;
        int n4 = (n3 ^ n3 >>> 7) * -322208201;
        return n4 ^ n4 >>> 21;
    }

    public static int zmz(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 7);
        int n4 = (n3 ^ n3 >>> 10) * 0x59915159;
        int n5 = (n4 ^ n4 >>> 15) * -1166149143;
        return n5 ^ n5 >>> 21;
    }

    public static boolean rmt_2(int n, int n2) {
        return ((khr.zmz(n, n2) + Thread.currentThread().hashCode()) * 521040747 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

