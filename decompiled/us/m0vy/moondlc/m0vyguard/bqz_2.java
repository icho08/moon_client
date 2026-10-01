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
import us.m0vy.moondlc.m0vyguard.bshh_2;
import us.m0vy.moondlc.m0vyguard.bmw;
import us.m0vy.moondlc.m0vyguard.tzr;
import us.m0vy.moondlc.m0vyguard.hs;

public class bqz_2 {
    private final tzr thath_2 = new tzr();
    private final hs zhs_3;
    private static final int hyd_2 = -1159750609;
    private static final int khnsh = -550851859;
    private static final int shdm_2 = -1172732358;
    private static final int shyr = -1340493069;
    private static final int hliryxuf = 986528067;
    private static final int ky405w1u49ab = -792915608;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ogw6j9ppee;

    public bqz_2() {
        bshh_2[] bshhArray = new bshh_2[Integer.reverse(99182844) ^ 0x3F1697A6];
        bshhArray[0] = new bshh_2("Raytrace").td_3(true);
        bshhArray[1] = new bshh_2("Shield break").td_3(true);
        bshhArray[2] = new bshh_2("Fast shie".concat("ld break")).td_3(true);
        bshhArray[3] = new bshh_2("Alwa".concat("ys shield")).td_3(false);
        bshhArray[4] = new bshh_2("TPS sync").td_3(true);
        bshhArray[5] = new bshh_2("Igno".concat("re walls")).td_3(false);
        this.zhs_3 = new hs("Options").dsgh_3(bshhArray);
    }

    public void dhzh_4() {
        int n = 1565334763;
        n = Integer.rotateLeft(n * 286101539, 15) ^ 0x6AC218D4;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0x506981CC;
        if ((n2 ^ n) != 1349091788) {
            int cfr_ignored_0 = (0xD249D27 ^ n) + -2072370953;
        }
        this.thath_2.dhshr();
    }

    @Generated
    public tzr sad_5() {
        block0: {
            int n = 1259102088;
            n = Integer.rotateLeft(n * 1977190889, 6) ^ 0xE7BC04E4;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x90A50A89;
            if ((n2 ^ n) == -1868232055) break block0;
            int cfr_ignored_0 = (0xDBA95501 ^ n) - -1939753045;
        }
        return this.thath_2;
    }

    @Generated
    public hs dkd_3() {
        block0: {
            int n = -674760435;
            n = Integer.rotateLeft(n * 1236054833, 14) ^ 0x1EE7664A;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x9D21293E;
            if ((n2 ^ n) == -1658771138) break block0;
            int cfr_ignored_0 = (0x4AE6D033 ^ n) + 1960624059;
        }
        return this.zhs_3;
    }

    private static String thst_2(String string, int n, int n2, int n3) {
        int n4 = -1145234824;
        n4 = Integer.rotateLeft(n4 * -1274468979, 28) ^ 0x2D43B6D1;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0xAC07B899;
        if ((n5 ^ n4) != -1408780135) {
            int cfr_ignored_0 = (0x17BAA2E1 ^ n4) + 287289347;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xA9004F83) + n2 ^ i * -1404529043) ^ hyd_2) + khnsh);
        }
        return new String(cArray);
    }

    private static String[] khjf(String string) {
        int n = bmw.hda_2(1417036545);
        int n2 = n ^ 0x65DB61ED;
        if ((n2 ^ n) != 1708876269) {
            int cfr_ignored_0 = Integer.rotateLeft(0x31AD22EC ^ n, 9) - 139778511;
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

    private static CallSite khnw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 296229277;
            n3 = Integer.rotateLeft(n3 * 1351692343, 3) ^ 0x2370B2D3;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 4);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xDC958B4;
            if ((n4 ^ n3) != 231299252) {
                int cfr_ignored_0 = (0x1C614129 ^ n3) - 96802611;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shdm_2 ^ string.hashCode()) + (n2 + shyr) + i ^ shdm_2, 20) + shyr);
            }
            String[] stringArray = bqz_2.khjf(new String(cArray));
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

    private static String[] hicpqxlew7leik(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite vkubwozntvdp8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hliryxuf ^ string.hashCode() ^ n2 + ky405w1u49ab + i * 894913861) + hliryxuf) ^ ky405w1u49ab));
            }
            String[] stringArray = bqz_2.hicpqxlew7leik(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

