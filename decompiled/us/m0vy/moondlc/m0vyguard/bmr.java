/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmr {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int shwqv8zl30;

    private bmr() {
    }

    public static int ahs(int n) {
        int n2 = (n ^ bmr.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 11) * -1756958029;
        int n4 = (n3 ^ n3 >>> 13) * -1933652511;
        return n4 ^ n4 >>> 20;
    }

    public static int zny(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1265000385 ^ n2, 12);
        int n4 = (n3 ^ n3 >>> 10) * -1720982345;
        int n5 = (n4 ^ n4 >>> 18) * -734678955;
        return n5 ^ n5 >>> 14;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

