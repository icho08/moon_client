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
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.blq;
import us.m0vy.moondlc.m0vyguard.bwd;
import us.m0vy.moondlc.m0vyguard.hf_2;
import us.m0vy.moondlc.m0vyguard.wz;

public class hs_3 {
    private static final hs_3 zdhf;
    private final List tjz_2 = new ArrayList();
    private static final int dghz = 652113704;
    private static final int thzkh_2 = -2050366881;
    private static final int z31udy677 = -1775735505;
    private static final int akk1pg3l4upmx = 1711789969;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mb6atdilkj8;

    public void ttgh_2() {
        int n = -1884058577;
        n = Integer.rotateLeft(n * -1557213485, 18) ^ 0x8348B97B;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0x527581C;
        if ((n2 ^ n) != 86464540) {
            int cfr_ignored_0 = (0x8A94D433 ^ n) - -1283837814;
        }
        hs_3.khyr(this, new bwd[]{blq.aah_2(), hs_3.dsy_4()});
        for (bwd bwd2 : this.tjz_2) {
            bwd2.khdhh_2();
        }
    }

    public void arr() {
        int n = -974476476;
        n = Integer.rotateLeft(n * 1579400427, 16) ^ 0x44DA925;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB6E70769;
        if ((n2 ^ n) != -1226373271) {
            int cfr_ignored_0 = (0x730DAC2D ^ n) - -548880787;
        }
        for (bwd bwd2 : this.tjz_2) {
            bwd2.dnj();
        }
    }

    public void sjq(bwd ... bwdArray) {
        int n = -443819614;
        n = Integer.rotateLeft(n * 996655749, 20) ^ 0x34106FED;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x28907D46;
        if ((n2 ^ n) != 680557894) {
            int cfr_ignored_0 = (0xCD1BA4E4 ^ n) + 959530843;
        }
        this.tjz_2.addAll(List.of(bwdArray));
    }

    @Generated
    public List bzh_4() {
        block0: {
            int n = hf_2.rfdh(-1680763155);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x38A2D280;
            if ((n2 ^ n) == 950194816) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA373446D ^ n, 7) - -816650130;
            int cfr_ignored_1 = (int)(0x61C1EA5027D4EB4FL ^ (long)n ^ 0x29D0831A2DB96E52L);
        }
        return this.tjz_2;
    }

    @Generated
    public static hs_3 tmr() {
        block0: {
            int n = -1058648720;
            int n2 = (n = Integer.rotateLeft(n * -2071256031, 6) ^ 0x2711E185) ^ 0x5A4CDC7B;
            if ((n2 ^ n) == 1514986619) break block0;
            int cfr_ignored_0 = (0x9AAA910B ^ n) + -72348614;
        }
        return zdhf;
    }

    private static wz dsy_4() {
        block0: {
            int n = 97614763;
            int n2 = (n = Integer.rotateLeft(n * -533720707, 21) ^ 0x9FBA5BCF) ^ 0x37FB41CA;
            if ((n2 ^ n) == 939213258) break block0;
            int cfr_ignored_0 = (0x322A3A61 ^ n) - -1196989203;
        }
        return wz.tdb_4();
    }

    private static void khyr(hs_3 hs2, bwd[] bwdArray) {
        int n = hf_2.rfdh(1583895308);
        hs_3 hs3 = hs2;
        n = (hs3 != null ? System.identityHashCode(hs3) : 0) ^ n;
        n = (bwdArray != null ? System.identityHashCode(bwdArray) : 0) ^ n;
        int n2 = n ^ 0xA008D2B8;
        if ((n2 ^ n) != -1610034504) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xFE6081B4 ^ n, 18) - -770878457) * -27229771;
        }
        hs2.sjq(bwdArray);
    }

    private static String[] shkhs_2(String string) {
        int n = -235645703;
        n = Integer.rotateLeft(n * 785575447, 3) ^ 0x828942AE;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x86D88789;
        if ((n2 ^ n) != -2032629879) {
            int cfr_ignored_0 = (0x772CD370 ^ n) + 2037955587;
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

    private static CallSite daf_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1115072024;
            n3 = Integer.rotateLeft(n3 * 1829272153, 18) ^ 0xF9792;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x8C4DD17E;
            if ((n4 ^ n3) != -1941057154) {
                int cfr_ignored_0 = (0xCE3B7766 ^ n3) - 224041928;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dghz ^ string.hashCode() ^ n2 + thzkh_2 + i * -1207827767) + dghz) ^ thzkh_2));
            }
            String[] stringArray = hs_3.shkhs_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] cwanpi4x2btv(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rf4apmj6hvb1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ z31udy677 ^ string.hashCode() ^ n2 + akk1pg3l4upmx + i * -679778307) + z31udy677) ^ akk1pg3l4upmx));
            }
            String[] stringArray = hs_3.cwanpi4x2btv(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

