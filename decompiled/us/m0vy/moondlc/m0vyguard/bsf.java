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
import us.m0vy.moondlc.m0vyguard.hkh;

public final class bsf
extends Enum {
    public static final /* enum */ bsf rtz_3;
    public static final /* enum */ bsf tshkh;
    public static final /* enum */ bsf bzs;
    public static final /* enum */ bsf shhz_4;
    public static final /* enum */ bsf hakh_2;
    public static final /* enum */ bsf blj;
    public static final /* enum */ bsf dhshs_2;
    private final int tlth;
    private static final bsf[] zlf;
    private static final int zqt_2 = -462843662;
    private static final int ddz_3 = -179572395;
    private static final int ms9cudcy = -1317322714;
    private static final int zw4b5ggxo = -2000286643;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static bsf[] values() {
        block0: {
            int n = -1101769382;
            int n2 = (n = Integer.rotateLeft(n * 2071146415, 20) ^ 0x7B61BCA7) ^ 0x74570BA7;
            if ((n2 ^ n) == 1951861671) break block0;
            int cfr_ignored_0 = (0xCA035EFD ^ n) - 1781025992;
        }
        return (bsf[])zlf.clone();
    }

    public static bsf valueOf(String string) {
        block0: {
            int n = -1373289153;
            int n2 = (n = Integer.rotateLeft(n * 55552591, 23) ^ 0xE74EA50A) ^ 0xC8DDF7A3;
            if ((n2 ^ n) == -924977245) break block0;
            int cfr_ignored_0 = (0x66F8B29C ^ n) - -1676894485;
        }
        return Enum.valueOf(bsf.class, string);
    }

    public static bsf fromButtonIndex(int n) {
        int n2 = hkh.anf(689488102);
        int n3 = n2 ^ 0x9E046BA3;
        if ((n3 ^ n2) != -1643877469) {
            int cfr_ignored_0 = Integer.rotateLeft(0xB71CAB45 ^ n2, 9) - 819354774;
            int cfr_ignored_1 = (int)(0x75AE057827D4EB4FL ^ (long)n2 ^ 0xF780831A2DB9468DL);
        }
        for (bsf bsf2 : bsf.values()) {
            if (bsf2.getButtonIndex() != n) continue;
            return bsf2;
        }
        return rtz_3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private bsf() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.tlth = var3_2;
    }

    @Generated
    public int getButtonIndex() {
        block0: {
            int n = -1154849663;
            n = Integer.rotateLeft(n * -2049317159, 8) ^ 0xF1D77D9B;
            n = System.identityHashCode((Object)this) ^ n;
            int n2 = n ^ 0x387E52E8;
            if ((n2 ^ n) == 947802856) break block0;
            int cfr_ignored_0 = (0x83543669 ^ n) - 1948141504;
        }
        return this.tlth;
    }

    private static bsf[] $values() {
        int n = hkh.anf(969578995);
        int n2 = n ^ 0x3F997C6E;
        if ((n2 ^ n) != 1067023470) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x653E59D ^ n, 3) - -930714306) * 106161565;
            int cfr_ignored_1 = (int)(0xC4E14BA027D4EB4FL ^ (long)n ^ 0x6A30831A2DB82413L);
        }
        bsf[] bsfArray = new bsf[Integer.rotateLeft(0x2647961 ^ 0x2847961, 11)];
        bsfArray[0] = rtz_3;
        bsfArray[1] = tshkh;
        bsfArray[2] = bzs;
        bsfArray[3] = shhz_4;
        bsfArray[4] = hakh_2;
        bsfArray[5] = blj;
        bsfArray[-305052423 + 305052429] = dhshs_2;
        return bsfArray;
    }

    private static bsf[] $values$() {
        int n = hkh.anf(-1142781360);
        int n2 = n ^ 0x139B488C;
        if ((n2 ^ n) != 328943756) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xA879C2DC ^ n, 8) - 1797011423) * -1468415267;
        }
        bsf[] bsfArray = new bsf[1740205398 + -1740205391];
        bsfArray[0] = rtz_3;
        bsfArray[1] = tshkh;
        bsfArray[2] = bzs;
        bsfArray[3] = shhz_4;
        bsfArray[4] = hakh_2;
        bsfArray[5] = blj;
        bsfArray[Integer.rotateLeft((int)(0x1776D002 ^ 0x1776B002), (int)20)] = dhshs_2;
        return bsfArray;
    }

    private static String[] v84vuhtkxv(String string) {
        int n = hkh.anf(1325589162);
        int n2 = n ^ 0x33059C4A;
        if ((n2 ^ n) != 856005706) {
            int cfr_ignored_0 = Integer.rotateLeft(0x7C077EE0 ^ n, 18) + 155581531;
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

    private static CallSite x64ekiz1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1047809247;
            n3 = Integer.rotateLeft(n3 * -739058483, 8) ^ 0xE5DEACF5;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0xE5228CFB;
            if ((n4 ^ n3) != -450720517) {
                int cfr_ignored_0 = (0xDB56C024 ^ n3) + -1584180037;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zqt_2 ^ string.hashCode() ^ n2 + ddz_3 + i * -1594218655) + zqt_2) ^ ddz_3));
            }
            String[] stringArray = bsf.v84vuhtkxv(new String(cArray));
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

    private static String[] ohijf2mne28f3(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite jyh7jzz8rhia(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ms9cudcy ^ string.hashCode()) + (n2 + zw4b5ggxo) + i ^ ms9cudcy, 16) + zw4b5ggxo);
            }
            String[] stringArray = bsf.ohijf2mne28f3(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

