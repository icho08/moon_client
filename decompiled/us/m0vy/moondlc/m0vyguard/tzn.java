/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tzn {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int uheb85huo1;

    private tzn() {
    }

    public static int dhshj(int n) {
        int n2 = (n ^ tzn.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 15) * -1017758137;
        int n4 = (n3 ^ n3 >>> 12) * -2027994001;
        return n4 ^ n4 >>> 18;
    }

    public static int shthy(int n, int n2) {
        int n3 = Integer.rotateRight(n * -393994725 ^ n2, 18);
        int n4 = (n3 ^ n3 >>> 17) * 1969419139;
        int n5 = (n4 ^ n4 >>> 16) * -1388035551;
        return n5 ^ n5 >>> 16;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

