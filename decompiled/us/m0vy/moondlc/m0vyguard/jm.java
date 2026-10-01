/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class jm {
    private static final int ygh = 719755695;
    private static final int js_2 = 1608568160;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int bjh7mhmtga4alv;

    private jm() {
    }

    public static int aghw(int n) {
        int n2 = Integer.rotateRight(n * 1256925105 - System.identityHashCode(jm.class), 13) ^ ygh;
        int n3 = (n2 ^ n2 >>> 13) * 1927706795;
        int n4 = (n3 ^ n3 >>> 14) * 1073906323;
        return n4 ^ n4 >>> 19 ^ js_2;
    }

    public static int thfs(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 7)) + js_2 ^ ygh;
        int n4 = (n3 ^ n3 >>> 13) * -1827317695;
        int n5 = (n4 ^ n4 >>> 13) * -755708851;
        return n5 ^ n5 >>> 18 ^ js_2;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

