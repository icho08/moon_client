/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.bjsh;
import us.m0vy.moondlc.m0vyguard.bdt_4;

public class bwd_2
extends bdt_4 {
    private static final int skha = -2137597621;
    private static final int zdn = 1888468;
    private static final int ah8ohbiuxc31z = -1422218930;
    private static final int yep4li9dhha = -99902800;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int nfdi4ui6;

    public bwd_2() {
        super(bwd_2.sza_7());
    }

    private static List sza_7() {
        int n = 1581157623;
        int n2 = (n = Integer.rotateLeft(n * 1528847371, 19) ^ 0x2E48CC2E) ^ 0x80CF98C6;
        if ((n2 ^ n) != -2133878586) {
            int cfr_ignored_0 = (0xDEF11431 ^ n) + 677318743;
        }
        ArrayList<bjsh> arrayList = new ArrayList<bjsh>();
        for (int i = 0; i < 4; ++i) {
            arrayList.add(new bjsh(i));
        }
        return arrayList;
    }

    private static String[] ghar(String string) {
        int n = 555090180;
        int n2 = (n = Integer.rotateLeft(n * 209616117, 17) ^ 0x34C2EDD1) ^ 0x8B3EB98B;
        if ((n2 ^ n) != -1958823541) {
            int cfr_ignored_0 = (0xAA28B88F ^ n) - 1338602055;
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

    private static CallSite zln_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 726082114;
            n3 = Integer.rotateLeft(n3 * 162782923, 20) ^ 0x35DE7426;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 3);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 28);
            int n4 = n3 ^ 0xAAF405C6;
            if ((n4 ^ n3) != -1426848314) {
                int cfr_ignored_0 = (0x81B32784 ^ n3) - -1717126468;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ skha ^ string.hashCode()) + (n2 + zdn) + i ^ skha, 12) + zdn);
            }
            String[] stringArray = bwd_2.ghar(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] vy6c9jd552(String string) {
        return string.split("\u0007\u001a", -1);
    }

    private static CallSite tcmjq7gbp7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ah8ohbiuxc31z ^ string.hashCode() ^ n2 + yep4li9dhha + i * -604160461) + ah8ohbiuxc31z) ^ yep4li9dhha));
            }
            String[] stringArray = bwd_2.vy6c9jd552(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
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

