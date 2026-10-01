/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;

public class bjw
extends RuntimeException {
    private final String tms_2;
    private static final int thzs = -216525867;
    private static final int md = -292298089;
    private static final int khza_4 = 1717821851;
    private static final int dld_2 = -1516684862;
    private static final int eq1rhroi = 106781603;
    private static final int cldn2rtncuxi = 1832966567;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int n6lcqbr9wx0l;

    public bjw(String string) {
        super("%s is not".concat(" found!").formatted(string));
        this.tms_2 = string;
    }

    @Generated
    public String getModuleName() {
        block0: {
            int n = 1733566939;
            n = Integer.rotateLeft(n * 2097913377, 4) ^ 0xFB41244A;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7A667793;
            if ((n2 ^ n) == 2053535635) break block0;
            int cfr_ignored_0 = (0x1D325648 ^ n) + -694245772;
        }
        return this.tms_2;
    }

    private static String byczf51d9js8m(String string, int n, int n2, int n3) {
        int n4 = 1355341906;
        n4 = Integer.rotateLeft(n4 * 435432075, 16) ^ 0x556B32ED;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 6);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 26)) ^ 0xF9F69094;
        if ((n5 ^ n4) != -101281644) {
            int cfr_ignored_0 = (0xA93E70C6 ^ n4) + 1534539543;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xADA59A16 ^ n2 - i) + md, 10) ^ thzs + i * -1172062861));
        }
        return new String(cArray);
    }

    private static String[] fvtvv96es1(String string) {
        int n = 520012547;
        n = Integer.rotateLeft(n * -633193459, 10) ^ 0x3F729F75;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 15);
        int n2 = n ^ 0x4A06E04;
        if ((n2 ^ n) != 77622788) {
            int cfr_ignored_0 = (0x1A5EAD07 ^ n) + 537939541;
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

    private static CallSite paxwrv0i2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1105171909;
            n3 = Integer.rotateLeft(n3 * -1118444177, 20) ^ 0x1AC76F21;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0x987A1BE6;
            if ((n4 ^ n3) != -1736827930) {
                int cfr_ignored_0 = (0xD9A58E23 ^ n3) + -1663185070;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ khza_4 ^ string.hashCode() ^ n2 + dld_2 + i * 1756606181) + khza_4) ^ dld_2));
            }
            String[] stringArray = bjw.fvtvv96es1(new String(cArray));
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

    private static String[] ku0q3o9k2i9(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rs8m0sl947kb04(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ eq1rhroi ^ string.hashCode() ^ n2 + cldn2rtncuxi ^ i * -1615102287 ^ eq1rhroi, 5) ^ cldn2rtncuxi));
            }
            String[] stringArray = bjw.ku0q3o9k2i9(new String(cArray));
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

