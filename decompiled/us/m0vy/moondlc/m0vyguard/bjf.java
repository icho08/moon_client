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
import us.m0vy.moondlc.m0vyguard.bdt_4;
import us.m0vy.moondlc.m0vyguard.bdl_2;
import us.m0vy.moondlc.m0vyguard.ttt_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class bjf
extends bdt_4 {
    private static final int khtd_2 = 1434906594;
    private static final int dhd_4 = 1072096194;
    private static final int cwdu9b4cre = 1074982870;
    private static final int kfab2be = 977097841;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ii60wuf30jl8w;

    public bjf() {
        super(bjf.tay_3());
    }

    private static List tay_3() {
        int n = 1686079923;
        int n2 = (n = Integer.rotateLeft(n * 1324514659, 21) ^ 0x4AD52713) ^ 0xC91937E3;
        if ((n2 ^ n) != -921094173) {
            int cfr_ignored_0 = (0xAD66BE50 ^ n) + -38219887;
        }
        if (yf.dnkh()) {
            throw null;
        }
        ArrayList<ttt_2> arrayList = new ArrayList<ttt_2>();
        for (int i = 0; i < Integer.rotateLeft(0xCD201F2D ^ 0xCD20162D, 24); ++i) {
            arrayList.add(new ttt_2(i));
        }
        return arrayList;
    }

    private static String[] htf_2(String string) {
        int n = bdl_2.dtq(1970368262);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xB30ACB18;
        if ((n2 ^ n) != -1291138280) {
            int cfr_ignored_0 = (Integer.rotateRight(0xC67BA41E ^ n, 11) - 223772381) * -964975585;
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

    private static CallSite shwgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1323137251;
            n3 = Integer.rotateLeft(n3 * 615714023, 22) ^ 0x2E17DD5D;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 14);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 14);
            int n4 = n3 ^ 0xD9090FCD;
            if ((n4 ^ n3) != -653717555) {
                int cfr_ignored_0 = (0x682B88D0 ^ n3) - 1305882737;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ khtd_2 ^ string.hashCode()) + (n2 + dhd_4) + i ^ khtd_2, 12) + dhd_4);
            }
            String[] stringArray = bjf.htf_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] d35vsjrn6n10fi(String string) {
        return string.split("\u0002\u0013", -1);
    }

    private static CallSite b6vpprri2q(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ cwdu9b4cre ^ string.hashCode()) + (n2 + kfab2be) + i ^ cwdu9b4cre, 14) + kfab2be);
            }
            String[] stringArray = bjf.d35vsjrn6n10fi(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

