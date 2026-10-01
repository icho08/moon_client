/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class trz_2 {
    private static final int rnh_2 = -1605946009;
    private static final int thdhgh = 957366269;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qvw7ac2c1ik49;

    private trz_2() {
    }

    public static int ys_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 15) * -846258391 ^ rnh_2;
        int n3 = (n2 ^ n2 >>> 14) * -180031767;
        int n4 = (n3 ^ n3 >>> 15) * 2008066713;
        return n4 ^ n4 >>> 13 ^ thdhgh;
    }

    public static int rws(int n, int n2) {
        int n3 = (n2 - n ^ 0xA953B26B) + thdhgh ^ rnh_2;
        int n4 = (n3 ^ n3 >>> 11) * -43271497;
        int n5 = (n4 ^ n4 >>> 18) * 497119723;
        return n5 ^ n5 >>> 21 ^ thdhgh;
    }

    public static boolean dws_4(int n, int n2) {
        return ((trz_2.rws(n, n2) + Thread.currentThread().hashCode()) * 1533811835 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

