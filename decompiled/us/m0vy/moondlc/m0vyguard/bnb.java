/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnb {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s21e85ra8k;

    private bnb() {
    }

    public static int aghs_2(int n) {
        int n2 = (n ^ bnb.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 15) * -1330396595;
        int n4 = (n3 ^ n3 >>> 7) * -1876082581;
        return n4 ^ n4 >>> 13;
    }

    public static int thaf_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -413003667 ^ n2, 9);
        int n4 = (n3 ^ n3 >>> 15) * 1995480433;
        int n5 = (n4 ^ n4 >>> 10) * -510745215;
        return n5 ^ n5 >>> 12;
    }

    public static boolean ghrgh(int n, int n2) {
        return ((bnb.thaf_2(n, n2) ^ (int)System.nanoTime()) * 1483727167 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

