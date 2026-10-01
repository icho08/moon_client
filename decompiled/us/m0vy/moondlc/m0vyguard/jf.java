/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class jf {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int t3ksjtmxq0m;

    private jf() {
    }

    public static int dld_4(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 4) * -1544137557;
        int n3 = (n2 ^ n2 >>> 15) * 1679157407;
        int n4 = (n3 ^ n3 >>> 15) * 1090141359;
        return n4 ^ n4 >>> 16;
    }

    public static int jfa_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xB);
        int n4 = (n3 ^ n3 >>> 17) * 1149960013;
        int n5 = (n4 ^ n4 >>> 15) * 1050143175;
        return n5 ^ n5 >>> 18;
    }

    public static boolean dhtr(int n, int n2) {
        return ((jf.jfa_2(n, n2) + Thread.currentThread().hashCode()) * -718930743 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

