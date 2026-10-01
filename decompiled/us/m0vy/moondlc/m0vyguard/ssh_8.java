/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ssh_8 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fmjqmx5u2m;

    private ssh_8() {
    }

    private static int dyl(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 8) * -246459699;
        int n4 = (n3 ^ n3 >>> 9) * 2130577875;
        return n4 ^ n4 >>> 23;
    }

    public static int ssw(int n) {
        return ssh_8.dyl((n ^ ssh_8.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int dhzl(int n, int n2) {
        return ssh_8.dyl(n2 - n ^ 0x6107F84B);
    }

    public static boolean ana_2(int n, int n2) {
        return ((ssh_8.dhzl(n, n2) ^ (int)System.nanoTime()) * 1581790759 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

