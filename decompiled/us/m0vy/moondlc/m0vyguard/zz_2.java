/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zz_2 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hi5fk36n;

    private zz_2() {
    }

    private static int sst_6(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * -547955691;
        int n4 = (n3 ^ n3 >>> 10) * -937761001;
        return n4 ^ n4 >>> 16;
    }

    public static int jaa_3(int n) {
        return zz_2.sst_6(Integer.rotateRight(n * 2100982169 - System.identityHashCode(zz_2.class), 22));
    }

    public static int zsb_2(int n, int n2) {
        return zz_2.sst_6(Integer.rotateLeft(n ^ n2, 10) * -201800109);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

