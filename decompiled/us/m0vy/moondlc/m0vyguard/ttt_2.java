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
import us.m0vy.moondlc.m0vyguard.bnb;
import us.m0vy.moondlc.m0vyguard.tzd_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class ttt_2
extends tzd_2 {
    private final int hshy;
    private static final int ta = 857117643;
    private static final int syz = -1264801838;
    private static final int tsm = -982419722;
    private static final int tdy_2 = -1033684173;
    private static final int tkucva2 = 1408350087;
    private static final int qc6j32og = -590920878;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int n2r1gaf6;

    public ttt_2(int n) {
        if (n < 0 || n > (0x35DDFA27 ^ 0x35DDFA2F)) {
            throw new IllegalArgumentException("Hotbar Slot ID".concat(" must be be").concat("tween 0 and 8"));
        }
        this.hshy = n;
    }

    @Override
    public class_1799 bdy_2() {
        try {
            int n = 1009558140;
            n = Integer.rotateLeft(n * 240394727, 20) ^ 0xB615D6DF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC4681957;
            if ((n2 ^ n) != -999810729) {
                int cfr_ignored_0 = (0xF844BB2B ^ n) + 208160430;
            }
            if ((0x281 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return ttt_2.mc.field_1724 != null && ttt_2.khfdh(ttt_2.mc.field_1724) != null ? ttt_2.bght_2(ttt_2.mc.field_1724.method_31548(), this.hshy) : class_1799.field_8037;
    }

    @Override
    public int shd_5() {
        block0: {
            int n = 1906842610;
            n = Integer.rotateLeft(n * 166818679, 28) ^ 0x7B72EECE;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0xC456C269;
            if ((n2 ^ n) == -1000947095) break block0;
            int cfr_ignored_0 = (0xB5FED99B ^ n) - 542926696;
        }
        return 359477727 + -359477691 + this.hshy;
    }

    @Generated
    public int rdhh_2() {
        block0: {
            int n = bnb.aghs_2(-1539118155);
            int n2 = n ^ 0x61F15B4D;
            if ((n2 ^ n) == 1643207501) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC5B3B0F8 ^ n, 11) + -182448829) * -978079495;
        }
        return this.hshy;
    }

    private static String shbr(String string, int n, int n2, int n3) {
        int n4 = -703922008;
        n4 = Integer.rotateLeft(n4 * 1165932121, 16) ^ 0x36023F06;
        n4 = Integer.rotateLeft(n ^ n4, 18);
        int n5 = (n4 = n2 ^ n4) ^ 0xF8F9A78F;
        if ((n5 ^ n4) != -117856369) {
            int cfr_ignored_0 = (0x2EF2A727 ^ n4) + -1773330960;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xCBB51BDE ^ n2 ^ i * -421375851 ^ ta, 14) ^ syz));
        }
        return new String(cArray);
    }

    private static class_1661 khfdh(class_746 class_7462) {
        block0: {
            int n = -1505260464;
            int n2 = (n = Integer.rotateLeft(n * -779780361, 16) ^ 0x54D19898) ^ 0x7CFF9241;
            if ((n2 ^ n) == 2097123905) break block0;
            int cfr_ignored_0 = (0xDAB81E11 ^ n) + 1689317393;
        }
        return class_7462.method_31548();
    }

    private static class_1799 bght_2(class_1661 class_16612, int n) {
        block0: {
            int n2 = 1014594132;
            n2 = Integer.rotateLeft(n2 * -1808948975, 11) ^ 0xAF332D03;
            class_1661 class_16613 = class_16612;
            n2 = Integer.rotateLeft((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 8);
            int n3 = n2 ^ 0x74C2A6B5;
            if ((n3 ^ n2) == 1958913717) break block0;
            int cfr_ignored_0 = (0x48BBDCE1 ^ n2) - 1911375423;
        }
        return class_16612.method_5438(n);
    }

    private static String[] dsq(String string) {
        block0: {
            int n = -1768173844;
            int n2 = (n = Integer.rotateLeft(n * -1950908025, 22) ^ 0x4F654ECB) ^ 0x2E36310B;
            if ((n2 ^ n) == 775303435) break block0;
            int cfr_ignored_0 = (0xB8ADFFE7 ^ n) - 1897818556;
        }
        return string.split("\u0004\u0019", -1);
    }

    private static CallSite rtt(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -246071705;
            n3 = Integer.rotateLeft(n3 * 1124845187, 23) ^ 0x42CF317;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xB0F0CB07;
            if ((n4 ^ n3) != -1326396665) {
                int cfr_ignored_0 = (0x41A5F560 ^ n3) - -1526222918;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tsm ^ string.hashCode() ^ n2 + tdy_2 + i * 1107726843) + tsm) ^ tdy_2));
            }
            String[] stringArray = ttt_2.dsq(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] prbjwsfjvp(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite t1cvxb4ohyl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tkucva2 ^ string.hashCode()) + (n2 + qc6j32og) + i ^ tkucva2, 8) + qc6j32og);
            }
            String[] stringArray = ttt_2.prbjwsfjvp(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

