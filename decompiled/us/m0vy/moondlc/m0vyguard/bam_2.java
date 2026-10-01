/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.ght_2;

public final class bam_2
extends ght_2 {
    private final double swgh;
    private static final int zts_2 = 731757811;
    private static final int nj = -1496195796;
    private static final int hg7jvktp5zpqj = -1610098335;
    private static final int ms6e2c8186 = 1461739562;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lvlnqgqr;

    public bam_2(double d) {
        super(1);
        this.swgh = d;
    }

    public bam_2(char[] cArray, int n, int n2) {
        this(Double.parseDouble(String.valueOf(cArray, n, n2)));
    }

    public double dsd_8() {
        block0: {
            int n = 1195846648;
            n = Integer.rotateLeft(n * -40135305, 23) ^ 0xB2799F97;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xBCA24FB8;
            if ((n2 ^ n) == -1130213448) break block0;
            int cfr_ignored_0 = (0xFBE56440 ^ n) + 1303832418;
        }
        return this.swgh;
    }

    private static String[] thay(String string) {
        int n = -931369207;
        n = Integer.rotateLeft(n * -920398581, 28) ^ 0xDFB6C9CA;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x789BE545;
        if ((n2 ^ n) != 2023482693) {
            int cfr_ignored_0 = (0xB0E78A4C ^ n) + 1171009944;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite dhqth(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1339864927;
            n3 = Integer.rotateLeft(n3 * -1159569395, 4) ^ 0xE7972A6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 8);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x31A8BDED;
            if ((n4 ^ n3) != 833142253) {
                int cfr_ignored_0 = (0x818BF54C ^ n3) + -145220939;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zts_2 ^ string.hashCode() ^ n2 + nj ^ i * -935446963 ^ zts_2, 11) ^ nj));
            }
            String[] stringArray = bam_2.thay(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] mn8m753x1wctx(String string) {
        return string.split("\u0005\u001d", -1);
    }

    private static CallSite x5cgb33nu470hg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hg7jvktp5zpqj ^ string.hashCode()) + (n2 + ms6e2c8186) + i ^ hg7jvktp5zpqj, 3) + ms6e2c8186);
            }
            String[] stringArray = bam_2.mn8m753x1wctx(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

