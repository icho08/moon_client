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
import us.m0vy.moondlc.m0vyguard.ma;
import us.m0vy.moondlc.m0vyguard.yf;

public class trh
extends tzd_2 {
    private final int tqb;
    private static final int hlk = 575588952;
    private static final int shzs_4 = -1763501967;
    private static final int sghl = -978623057;
    private static final int ztt_3 = 204421229;
    private static final int v7xxlzju6 = -521722014;
    private static final int tjbso1nmzgx = 1093870929;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int lfh4qaqc;

    public trh(int n) {
        if (n < 0 || n > Integer.rotateLeft(0x375C6B75 ^ 0x375C5F75, 23)) {
            throw new IllegalArgumentException("Inventory Sl".concat("ot ID must be bet").concat("ween 0 and 26"));
        }
        this.tqb = n;
    }

    @Override
    public class_1799 bdy_2() {
        int n = ma.zfm(686055032);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9C503C1B;
        if ((n2 ^ n) != -1672463333) {
            int cfr_ignored_0 = Integer.rotateRight(0xB4B46263 ^ n, 9) + -432699080;
        }
        return trh.mc.field_1724 != null && trh.jyz_2(trh.mc.field_1724) != null ? trh.dthz_4(trh.mc.field_1724.method_31548(), this.tqb + (Integer.reverse(-1306701645) ^ 0xCD0AB844)) : class_1799.field_8037;
    }

    @Override
    public int shd_5() {
        block0: {
            int n = 521269882;
            int n2 = (n = Integer.rotateLeft(n * 289030261, 22) ^ 0x6DA57325) ^ 0x880E65C4;
            if ((n2 ^ n) == -2012322364) break block0;
            int cfr_ignored_0 = (0x971F97BE ^ n) + 1777890370;
        }
        return this.tqb + (-1459187556 + 1459187565);
    }

    @Generated
    public int thghz_2() {
        block0: {
            int n = 400115158;
            n = Integer.rotateLeft(n * -422796203, 18) ^ 0xCEA9EAF7;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0x9E1919;
            if ((n2 ^ n) == 0x9E1919) break block0;
            int cfr_ignored_0 = (0x17475CCF ^ n) - -1666790017;
        }
        return this.tqb;
    }

    private static String khhd_3(String string, int n, int n2, int n3) {
        int n4 = -1519545964;
        n4 = Integer.rotateLeft(n4 * 994413445, 20) ^ 0x54DD837D;
        int n5 = (n4 = n ^ n4) ^ 0x961AB28A;
        if ((n5 ^ n4) != -1776635254) {
            int cfr_ignored_0 = (0x3377231E ^ n4) + -232970983;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xC1742320) + i ^ hlk, 23) ^ n2 + shzs_4));
        }
        return new String(cArray);
    }

    private static class_1661 jyz_2(class_746 class_7462) {
        block0: {
            int n = ma.zfm(1699020432);
            int n2 = n ^ 0xD40C92CF;
            if ((n2 ^ n) == -737373489) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB1486C5F ^ n, 9) - 2082651836) * -1320653729;
        }
        return class_7462.method_31548();
    }

    private static class_1799 dthz_4(class_1661 class_16612, int n) {
        block0: {
            int n2 = ma.zfm(-223591246);
            class_1661 class_16613 = class_16612;
            n2 = Integer.rotateLeft((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 20);
            int n3 = n2 ^ 0x2BD7BC86;
            if ((n3 ^ n2) == 735558790) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD97BF834 ^ n2, 14) - 1516285319) * -646186955;
        }
        return class_16612.method_5438(n);
    }

    private static String[] zwq_2(String string) {
        block0: {
            int n = 645946684;
            n = Integer.rotateLeft(n * 1529033409, 24) ^ 0x31240435;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x93AF4F5B;
            if ((n2 ^ n) == -1817227429) break block0;
            int cfr_ignored_0 = (0xB52F1267 ^ n) + -1262241349;
        }
        return string.split("\u0005\u0016", -1);
    }

    private static CallSite dhthw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2277265;
            n3 = Integer.rotateLeft(n3 * 1470796729, 12) ^ 0x593BFB47;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 25);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 12);
            int n4 = n3 ^ 0x971C7444;
            if ((n4 ^ n3) != -1759742908) {
                int cfr_ignored_0 = (0x68C1342B ^ n3) - 259799952;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ sghl ^ string.hashCode() ^ n2 + ztt_3 ^ i * 905152467 ^ sghl, 21) ^ ztt_3));
            }
            String[] stringArray = trh.zwq_2(new String(cArray));
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

    private static String[] uqjl1c8nqsz(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qt4e5y22z1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ v7xxlzju6 ^ string.hashCode() ^ n2 + tjbso1nmzgx + i * -1173398487) + v7xxlzju6) ^ tjbso1nmzgx));
            }
            String[] stringArray = trh.uqjl1c8nqsz(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

