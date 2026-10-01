/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hs_2 {
    private static final int dds_4 = -1949010987;
    private static final int rlw = -1425787970;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int op88mttzk;

    private hs_2() {
    }

    private static int jda_3(int n) {
        int n2 = n ^ dds_4;
        int n3 = (n2 ^ n2 >>> 12) * -1658363711;
        int n4 = (n3 ^ n3 >>> 16) * 1278579957;
        return (n4 ^ n4 >>> 17) + rlw;
    }

    public static int khdk_2(int n) {
        return hs_2.jda_3((n ^ dds_4 ^ hs_2.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int shzt_2(int n, int n2) {
        return hs_2.jda_3(Integer.rotateRight(n * -1817288291 ^ n2, 7) ^ rlw);
    }

    public static boolean khhk(int n, int n2) {
        return ((hs_2.shzt_2(n, n2) ^ (int)System.nanoTime()) * -731473235 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

