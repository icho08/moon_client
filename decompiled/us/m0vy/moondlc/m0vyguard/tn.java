/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tn {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jq8dmzxefv1k;

    private tn() {
    }

    private static int jkt(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 14) * 1471443603;
        int n4 = (n3 ^ n3 >>> 17) * 886159543;
        return n4 ^ n4 >>> 24;
    }

    public static int shds_4(int n) {
        return tn.jkt((n ^ tn.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int dhkhl(int n, int n2) {
        return tn.jkt(n2 - n ^ 0x34118FF6);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

