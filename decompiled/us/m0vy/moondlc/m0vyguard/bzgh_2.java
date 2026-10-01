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

public class bzgh_2
extends ght_2 {
    private final String dhdhy;
    private static final int tmz = 705309434;
    private static final int bzm_2 = 569298797;
    private static final int fk2xr1fo = 1891436903;
    private static final int ojh5bdypvn = -1624545322;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rduqf1sj9jvh;

    public String getName() {
        block0: {
            int n = -361716876;
            n = Integer.rotateLeft(n * -1411539031, 16) ^ 0x978A5B2D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB0251FAF;
            if ((n2 ^ n) == -1339744337) break block0;
            int cfr_ignored_0 = (0x5A55BCDB ^ n) + -1123170569;
        }
        return this.dhdhy;
    }

    public bzgh_2(String string) {
        super(Integer.reverse(1904660953) ^ 0x9B8B6188);
        this.dhdhy = string;
    }

    private static String[] dssh_4(String string) {
        int n = -1863661469;
        int n2 = (n = Integer.rotateLeft(n * -248465743, 15) ^ 0xD2177947) ^ 0xFF4FAC46;
        if ((n2 ^ n) != -11555770) {
            int cfr_ignored_0 = (0x6FA56425 ^ n) + 1031015126;
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

    private static CallSite dkhz_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1302325145;
            n3 = Integer.rotateLeft(n3 * -516422525, 12) ^ 0xE13FE27B;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 7);
            String string4 = string2;
            n3 = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n3, 10);
            int n4 = n3 ^ 0x815D6AD6;
            if ((n4 ^ n3) != -2124584234) {
                int cfr_ignored_0 = (0xCCC28D4F ^ n3) - -2007815252;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tmz ^ string.hashCode()) + (n2 + bzm_2) + i ^ tmz, 23) + bzm_2);
            }
            String[] stringArray = bzgh_2.dssh_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rbwifiphfbu(String string) {
        return string.split("\u0005\u001f", -1);
    }

    private static CallSite mn8tcapg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ fk2xr1fo ^ string.hashCode() ^ n2 + ojh5bdypvn ^ i * 329204229 ^ fk2xr1fo, 26) ^ ojh5bdypvn));
            }
            String[] stringArray = bzgh_2.rbwifiphfbu(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

