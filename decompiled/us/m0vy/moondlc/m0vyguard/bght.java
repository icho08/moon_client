/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bght {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int c7ek86l1uz;

    private bght() {
    }

    private static int tddh_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * 107756283;
        int n4 = (n3 ^ n3 >>> 10) * 378019771;
        return n4 ^ n4 >>> 11;
    }

    public static int bjs(int n) {
        return bght.tddh_2(Integer.rotateRight(n * -345841947 - System.identityHashCode(bght.class), 6));
    }

    public static int zbh_4(int n, int n2) {
        return bght.tddh_2(Integer.rotateLeft(n ^ n2, 15) * -1671343211);
    }

    public static boolean daz_6(int n, int n2) {
        return ((bght.zbh_4(n, n2) + Thread.currentThread().hashCode()) * 496201259 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

