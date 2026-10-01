/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public final class btth
extends Enum {
    public static final /* enum */ btth stha_3;
    public static final /* enum */ btth thjdh;
    public static final /* enum */ btth jda;
    private static final btth[] khza;
    private static final int jakh_2 = -1660798543;
    private static final int khngh = 795495496;
    private static final int tmxsjtiuv59z = 790393468;
    private static final int pj1l6pku = 660206807;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static btth[] values() {
        block0: {
            int n = 691507808;
            int n2 = (n = Integer.rotateLeft(n * 1728228301, 7) ^ 0x3E09D9CE) ^ 0x8504C9FD;
            if ((n2 ^ n) == -2063283715) break block0;
            int cfr_ignored_0 = (0xAC335B9D ^ n) - -1878278208;
        }
        return (btth[])khza.clone();
    }

    public static btth valueOf(String string) {
        block0: {
            int n = 1707537404;
            n = Integer.rotateLeft(n * 1544911085, 18) ^ 0x1EF13857;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xC7052677;
            if ((n2 ^ n) == -955963785) break block0;
            int cfr_ignored_0 = (0xA2C3D58B ^ n) - -597900646;
        }
        return Enum.valueOf(btth.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private btth() {
        void var2_-1;
        void var1_-1;
    }

    private static btth[] $values() {
        int n = 1670092077;
        int n2 = (n = Integer.rotateLeft(n * 2130039587, 11) ^ 0xAFA41AE9) ^ 0xBF90414B;
        if ((n2 ^ n) != -1081065141) {
            int cfr_ignored_0 = (0xDC1BD466 ^ n) - -1255734234;
        }
        return new btth[]{stha_3, thjdh, jda};
    }

    private static String[] jrp8c6dlsdd0(String string) {
        int n = 358228939;
        n = Integer.rotateLeft(n * 1150620637, 12) ^ 0x93EBB4F5;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 29);
        int n2 = n ^ 0xB12826;
        if ((n2 ^ n) != 11610150) {
            int cfr_ignored_0 = (0x15EB0BED ^ n) + 1265957094;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite utf7fsuqtkn9h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -934861997;
            n3 = Integer.rotateLeft(n3 * 709643779, 10) ^ 0x57CCC4B4;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x573790E8;
            if ((n4 ^ n3) != 1463259368) {
                int cfr_ignored_0 = (0x9F70B3BB ^ n3) - -1362461373;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jakh_2 ^ string.hashCode()) + (n2 + khngh) + i ^ jakh_2, 26) + khngh);
            }
            String[] stringArray = btth.jrp8c6dlsdd0(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType3) : lookup.findVirtual(clazz, stringArray[0], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] hahtctdswrojk(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite u07k82cp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tmxsjtiuv59z ^ string.hashCode()) + (n2 + pj1l6pku) + i ^ tmxsjtiuv59z, 8) + pj1l6pku);
            }
            String[] stringArray = btth.hahtctdswrojk(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

