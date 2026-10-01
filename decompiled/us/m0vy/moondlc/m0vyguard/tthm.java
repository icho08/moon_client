/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthm {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int u3ix4y8h0q0jo;

    private tthm() {
    }

    public static int dsa_3(int n) {
        int n2 = (n ^ tthm.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 18) * 1790444289;
        int n4 = (n3 ^ n3 >>> 7) * -1960322589;
        return n4 ^ n4 >>> 18;
    }

    public static int zzr_3(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 13) * -811737143;
        int n4 = (n3 ^ n3 >>> 15) * -582562231;
        int n5 = (n4 ^ n4 >>> 17) * 1915064469;
        return n5 ^ n5 >>> 21;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

