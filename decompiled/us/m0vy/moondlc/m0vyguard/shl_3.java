/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shl_3 {
    private static final int haz_4 = -310562959;
    private static final int shash_2 = -1251479656;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int p5sjc4obelha2;

    private shl_3() {
    }

    private static int aagh(int n) {
        int n2 = n ^ haz_4;
        int n3 = (n2 ^ n2 >>> 10) * 12130815;
        int n4 = (n3 ^ n3 >>> 17) * 1864043867;
        return (n4 ^ n4 >>> 11) + shash_2;
    }

    public static int ghdj(int n) {
        return shl_3.aagh(n ^ System.identityHashCode(shl_3.class) ^ (int)Thread.currentThread().getId() * 30494701 ^ haz_4);
    }

    public static int swgh_2(int n, int n2) {
        return shl_3.aagh(Integer.rotateRight(n * -1881779413 ^ n2, 15) + shash_2 ^ haz_4);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

