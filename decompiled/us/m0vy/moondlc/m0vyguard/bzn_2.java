/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.tjk;

public final class bzn_2
extends tjk {
    private final double hrt_2;
    private static final int tham_2 = 501142048;
    private static final int bqn = -1067078606;
    private static final int rgxxp6m = 2127342883;
    private static final int cjyebz75d0by = -2082957223;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int irtbzjaedie;

    public bzn_2(double d) {
        super(1);
        this.hrt_2 = d;
    }

    public bzn_2(char[] cArray, int n, int n2) {
        this(Double.parseDouble(String.valueOf(cArray, n, n2)));
    }

    public double srr() {
        block0: {
            int n = 1738731298;
            n = Integer.rotateLeft(n * 167376983, 7) ^ 0x4E04CD4F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x5CFA752A;
            if ((n2 ^ n) == 1559917866) break block0;
            int cfr_ignored_0 = (0x3B589A08 ^ n) + -430990737;
        }
        return this.hrt_2;
    }

    private static String[] rtth_2(String string) {
        int n = -972064329;
        int n2 = (n = Integer.rotateLeft(n * -99445665, 18) ^ 0xA6C44022) ^ 0xC559A31D;
        if ((n2 ^ n) != -983981283) {
            int cfr_ignored_0 = (0x356DAAA ^ n) - 1995162919;
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

    private static CallSite tgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -110247466;
            n3 = Integer.rotateLeft(n3 * 44209955, 15) ^ 0xD66E72EC;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x855D61D6;
            if ((n4 ^ n3) != -2057477674) {
                int cfr_ignored_0 = (0x7C30A000 ^ n3) - -343018608;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ tham_2 ^ string.hashCode() ^ n2 + bqn ^ i * -509962615 ^ tham_2, 9) ^ bqn));
            }
            String[] stringArray = bzn_2.rtth_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] l89cu01m(String string) {
        return string.split("\u0003\u001a", -1);
    }

    private static CallSite sp4y4at5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rgxxp6m ^ string.hashCode()) + (n2 + cjyebz75d0by) + i ^ rgxxp6m, 12) + cjyebz75d0by);
            }
            String[] stringArray = bzn_2.l89cu01m(new String(cArray));
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

