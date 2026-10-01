/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdhdh {
    private static final int thzsh_2 = -1362113434;
    private static final int rykh = 1666160466;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int butoz98h;

    private bdhdh() {
    }

    public static int dhzz_2(int n) {
        int n2 = (n ^ bdhdh.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ thzsh_2;
        int n3 = (n2 ^ n2 >>> 18) * 2114474275;
        int n4 = (n3 ^ n3 >>> 14) * -309669997;
        return n4 ^ n4 >>> 13 ^ rykh;
    }

    public static int qh_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 9)) + rykh ^ thzsh_2;
        int n4 = (n3 ^ n3 >>> 17) * 409022905;
        int n5 = (n4 ^ n4 >>> 9) * -882312999;
        return n5 ^ n5 >>> 15 ^ rykh;
    }

    public static boolean jf(int n, int n2) {
        return ((bdhdh.qh_2(n, n2) ^ (int)System.nanoTime()) * 1762279145 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

