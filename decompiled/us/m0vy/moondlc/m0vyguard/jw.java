/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class jw {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int rkmmirhwgg896n;

    private jw() {
    }

    private static int abd_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 13) * 1601256123;
        int n4 = (n3 ^ n3 >>> 11) * 536781253;
        return n4 ^ n4 >>> 19;
    }

    public static int tzd_5(int n) {
        return jw.abd_2(n ^ System.identityHashCode(jw.class) ^ (int)Thread.currentThread().getId() * -1727018515);
    }

    public static int thyh(int n, int n2) {
        return jw.abd_2(Integer.rotateRight(n * 1429524053 ^ n2, 17));
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

