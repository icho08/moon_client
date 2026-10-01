/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1661
 *  net.minecraft.class_1799
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.tzd_2;
import us.m0vy.moondlc.m0vyguard.fdh;

public class bjsh
extends tzd_2 {
    private final int kf;
    private static final int bzz = -1708654903;
    private static final int hdf = -365825554;
    private static final int shshkh = -1733653863;
    private static final int zws_2 = -940293825;
    private static final int ef6w5r68ai = -1984803517;
    private static final int c69gs7lzk4s = -1592967200;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int i0n5wmiiw;

    public bjsh(int n) {
        if (n < 0 || n > 3) {
            throw new IllegalArgumentException("Armor Slot In".concat("dex must be bet").concat("ween 0 and 3"));
        }
        this.kf = n;
    }

    @Override
    public class_1799 bdy_2() {
        int n = 189630649;
        n = Integer.rotateLeft(n * 766836203, 25) ^ 0xAEC020B4;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x376328E3;
        if ((n2 ^ n) != 929245411) {
            int cfr_ignored_0 = (0x3C2EA05A ^ n) - -1428573;
        }
        return bjsh.mc.field_1724 != null && bjsh.mc.field_1724.method_31548() != null ? bjsh.dhyq(bjsh.bkh_3(bjsh.mc.field_1724), this.kf) : class_1799.field_8037;
    }

    @Override
    public int shd_5() {
        block0: {
            int n = fdh.zmz_2(1348682519);
            int n2 = n ^ 0x950A31AB;
            if ((n2 ^ n) == -1794494037) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC56972BC ^ n, 11) - -333282305) * -982945091;
        }
        return Integer.rotateLeft(0x50BBCA14 ^ 0x50B9CA14, 18) - this.kf;
    }

    @Generated
    public int sdhm_2() {
        block0: {
            int n = 536176904;
            int n2 = (n = Integer.rotateLeft(n * 877900693, 26) ^ 0xFBD87BBD) ^ 0x605F049F;
            if ((n2 ^ n) == 1616839839) break block0;
            int cfr_ignored_0 = (0x7FAA6D97 ^ n) + 1406405811;
        }
        return this.kf;
    }

    private static String jal(String string, int n, int n2, int n3) {
        int n4 = -1519278015;
        n4 = Integer.rotateLeft(n4 * 2059454199, 27) ^ 0x6B47078B;
        n4 = Integer.rotateLeft(n ^ n4, 19);
        int n5 = (n4 = n2 ^ n4) ^ 0xC676A6FA;
        if ((n5 ^ n4) != -965302534) {
            int cfr_ignored_0 = (0x63070EBB ^ n4) + 547027971;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x1F6E8483) + bzz ^ Integer.reverse(n2 + i * 14437761), 19) - hdf);
        }
        return new String(cArray);
    }

    private static class_1661 bkh_3(class_746 class_7462) {
        block0: {
            int n = fdh.zmz_2(561354419);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x33FC9AF8;
            if ((n2 ^ n) == 872192760) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x12890C4B ^ n, 5) + 1123425360;
        }
        return class_7462.method_31548();
    }

    private static class_1799 dhyq(class_1661 class_16612, int n) {
        block0: {
            int n2 = -1529668470;
            n2 = Integer.rotateLeft(n2 * 1309873983, 28) ^ 0xB0DA8C20;
            class_1661 class_16613 = class_16612;
            n2 = (class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2;
            int n3 = n2 ^ 0x2C3A6A3B;
            if ((n3 ^ n2) == 742025787) break block0;
            int cfr_ignored_0 = (0x88E976B1 ^ n2) + -2045095498;
        }
        return class_16612.method_7372(n);
    }

    private static String[] zrkh(String string) {
        int n = fdh.zmz_2(2122635968);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
        int n2 = n ^ 0xF174FAD0;
        if ((n2 ^ n) != -243991856) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x8FF02010 ^ n, 4) + 1920041259) * -1880088559;
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

    private static CallSite tdy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1309926424;
            n3 = Integer.rotateLeft(n3 * -601429499, 11) ^ 0x8F0FC060;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 22);
            int n4 = n3 ^ 0x777CF43D;
            if ((n4 ^ n3) != 2004677693) {
                int cfr_ignored_0 = (0xC690EFD5 ^ n3) + 1248002515;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ shshkh ^ string.hashCode() ^ n2 + zws_2 ^ i * 238192789 ^ shshkh, 15) ^ zws_2));
            }
            String[] stringArray = bjsh.zrkh(new String(cArray));
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

    private static String[] i1i7h24cjals(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bneilepylxdo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ef6w5r68ai ^ string.hashCode()) + (n2 + c69gs7lzk4s) + i ^ ef6w5r68ai, 5) + c69gs7lzk4s);
            }
            String[] stringArray = bjsh.i1i7h24cjals(new String(cArray));
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

