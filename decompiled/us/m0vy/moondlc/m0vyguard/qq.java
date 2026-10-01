/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class qq {
    private static final int bash_2 = 890640842;
    private static final int thhs_2 = -612421292;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ozv0sg1ftazo;

    private qq() {
    }

    public static int tlz_2(int n) {
        int n2 = (n ^ qq.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ bash_2;
        int n3 = (n2 ^ n2 >>> 17) * 1151277325;
        int n4 = (n3 ^ n3 >>> 8) * 1020331307;
        return n4 ^ n4 >>> 15 ^ thhs_2;
    }

    public static int yr(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 5) * 608878041 + thhs_2 ^ bash_2;
        int n4 = (n3 ^ n3 >>> 8) * -1976697831;
        int n5 = (n4 ^ n4 >>> 9) * -634127939;
        return n5 ^ n5 >>> 22 ^ thhs_2;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

