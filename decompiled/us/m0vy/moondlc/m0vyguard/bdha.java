/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdha {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rookvi0kyb8p6;

    private bdha() {
    }

    private static int ryy(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 14) * -306866469;
        int n4 = (n3 ^ n3 >>> 16) * 1341213463;
        return n4 ^ n4 >>> 20;
    }

    public static int snj(int n) {
        return bdha.ryy((n ^ bdha.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int afsh(int n, int n2) {
        return bdha.ryy(n2 - n ^ 0xFA4AF3D6);
    }

    public static boolean thkhkh(int n, int n2) {
        return ((bdha.afsh(n, n2) ^ (int)System.nanoTime()) * 326227293 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

