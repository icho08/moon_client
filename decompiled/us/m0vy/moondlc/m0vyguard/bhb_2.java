/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhb_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int a760oul1;

    private bhb_2() {
    }

    public static int hakh_2(int n) {
        int n2 = (n ^ bhb_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * 9863945;
        int n4 = (n3 ^ n3 >>> 16) * 1249618325;
        return n4 ^ n4 >>> 14;
    }

    public static int ass(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 13);
        int n4 = (n3 ^ n3 >>> 9) * -299749711;
        int n5 = (n4 ^ n4 >>> 11) * 894200577;
        return n5 ^ n5 >>> 23;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

