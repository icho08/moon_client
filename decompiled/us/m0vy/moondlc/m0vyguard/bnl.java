/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnl {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int x9okw8j2mh6;

    private bnl() {
    }

    public static int drkh(int n) {
        int n2 = Integer.rotateRight(n * 459161653 - System.identityHashCode(bnl.class), 6);
        int n3 = (n2 ^ n2 >>> 12) * 288421115;
        int n4 = (n3 ^ n3 >>> 15) * -759055757;
        return n4 ^ n4 >>> 20;
    }

    public static int dad_6(int n, int n2) {
        int n3 = n2 - n ^ 0xE21E08F5;
        int n4 = (n3 ^ n3 >>> 16) * 1923967603;
        int n5 = (n4 ^ n4 >>> 11) * 1203523259;
        return n5 ^ n5 >>> 14;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

