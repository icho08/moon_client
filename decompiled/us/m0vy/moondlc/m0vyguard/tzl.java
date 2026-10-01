/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.r_2;

public final class tzl {
    private final float[] shzs_3;
    private final float snk;
    private final float zzm_2;
    private static final int g20b007gx9z12 = -2137028601;
    private static final int corm2vzo = -85958269;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int w3rmjx3n;

    public tzl(float[] fArray, float f, float f2) {
        this.shzs_3 = fArray;
        this.snk = f;
        this.zzm_2 = f2;
    }

    public float[] ghzsh_2() {
        block0: {
            int n = r_2.zjt_2(-1083280864);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x54D17EE1;
            if ((n2 ^ n) == 1423015649) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEBBF0CC1 ^ n, 16) + -1870648678;
            int cfr_ignored_1 = (int)(0x290DA2FC27D4EB4FL ^ (long)n ^ 0xB888831A2DB9FFCAL);
        }
        return this.shzs_3;
    }

    public float sts() {
        block0: {
            int n = 266771057;
            n = Integer.rotateLeft(n * 2009207527, 20) ^ 0x3A65C327;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x20EDDB13;
            if ((n2 ^ n) == 552459027) break block0;
            int cfr_ignored_0 = (0x2F0B4162 ^ n) + -1835970512;
        }
        return this.snk;
    }

    public float ghza_3() {
        block0: {
            int n = -274276277;
            n = Integer.rotateLeft(n * 1219637471, 5) ^ 0x5CFA3265;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x86413A25;
            if ((n2 ^ n) == -2042545627) break block0;
            int cfr_ignored_0 = (0x69E7DA6E ^ n) + 1811263428;
        }
        return this.zzm_2;
    }

    private static String[] b5daiquq97zlt(String string) {
        return string.split("\u0003\u001b", -1);
    }

    private static CallSite rpoddq2gjem0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ g20b007gx9z12 ^ string.hashCode() ^ n2 + corm2vzo + i * -846332939) + g20b007gx9z12) ^ corm2vzo));
            }
            String[] stringArray = tzl.b5daiquq97zlt(new String(cArray));
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

