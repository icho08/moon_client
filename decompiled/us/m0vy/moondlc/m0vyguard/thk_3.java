/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thk_3 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int twmkxtpvgl86xu;

    private thk_3() {
    }

    private static int zmb_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * -2062970277;
        int n4 = (n3 ^ n3 >>> 12) * 1117259029;
        return n4 ^ n4 >>> 16;
    }

    public static int bdb_2(int n) {
        return thk_3.zmb_2((n ^ thk_3.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int hmsh(int n, int n2) {
        return thk_3.zmb_2(n + n2 ^ Integer.rotateLeft(n, 9));
    }

    public static boolean rsth(int n, int n2) {
        return ((thk_3.hmsh(n, n2) ^ (int)System.nanoTime()) * 1409726443 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

