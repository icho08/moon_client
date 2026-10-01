/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tjkh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int eae433k77s049;

    private tjkh() {
    }

    public static int stz(int n) {
        int n2 = n ^ System.identityHashCode(tjkh.class) ^ (int)Thread.currentThread().getId() * 2135314241;
        int n3 = (n2 ^ n2 >>> 13) * 1495067777;
        int n4 = (n3 ^ n3 >>> 8) * 1078044973;
        return n4 ^ n4 >>> 17;
    }

    public static int ghakh(int n, int n2) {
        int n3 = n2 - n ^ 0xA663CB6;
        int n4 = (n3 ^ n3 >>> 17) * -1823566985;
        int n5 = (n4 ^ n4 >>> 16) * 1332710699;
        return n5 ^ n5 >>> 19;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

