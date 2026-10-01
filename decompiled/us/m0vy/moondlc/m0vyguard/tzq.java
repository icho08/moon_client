/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tzq {
    private static final int zdn_2 = 1127042638;
    private static final int dshj = -868424293;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int k8fyjfi2;

    private tzq() {
    }

    private static int shdj_2(int n) {
        int n2 = n ^ zdn_2;
        int n3 = (n2 ^ n2 >>> 9) * 159699205;
        int n4 = (n3 ^ n3 >>> 12) * -1498714599;
        return (n4 ^ n4 >>> 22) + dshj;
    }

    public static int sssh_2(int n) {
        return tzq.shdj_2(Integer.rotateRight(n * 287830275 - System.identityHashCode(tzq.class), 12) ^ zdn_2);
    }

    public static int sdm_4(int n, int n2) {
        return tzq.shdj_2((n2 - n ^ 0xB544981B) + dshj ^ zdn_2);
    }

    public static boolean khsth(int n, int n2) {
        return ((tzq.sdm_4(n, n2) + Thread.currentThread().hashCode()) * -2008789973 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

