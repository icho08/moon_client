/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tbk {
    private static final int htsh_2 = -1895313205;
    private static final int mh_2 = -1771453576;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qlc656xz7z0ac;

    private tbk() {
    }

    public static int zzz(int n) {
        int n2 = (n ^ tbk.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ htsh_2;
        int n3 = (n2 ^ n2 >>> 11) * 130950681;
        int n4 = (n3 ^ n3 >>> 11) * 747139047;
        return n4 ^ n4 >>> 16 ^ mh_2;
    }

    public static int bnh_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 5)) + mh_2 ^ htsh_2;
        int n4 = (n3 ^ n3 >>> 16) * 1332794745;
        int n5 = (n4 ^ n4 >>> 17) * 1968830845;
        return n5 ^ n5 >>> 20 ^ mh_2;
    }

    public static boolean dhwl(int n, int n2) {
        return ((tbk.bnh_2(n, n2) ^ (int)System.nanoTime()) * -83911793 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

