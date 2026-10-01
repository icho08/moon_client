/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bshgh;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="See Invisibles", category=bzw.OTHER, desc="Shows invisible entities")
public class bhb
extends bnq {
    private final tay tst_2 = new tay(this, "Alpha").shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(1411656977 + -374825028)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x1A6C3264 ^ 0x83F5918D, 20)));
    private final bql<bshgh> shdhh = this::shmq;
    private static final int hbw = -992402132;
    private static final int khkhz = 504648557;
    private static final int khar_2 = 1325761836;
    private static final int zwd_2 = 1571397777;
    private static final int gdfgx7vh = -1438350777;
    private static final int dkm0bpy5fyc = 830245446;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int svcp2xr4;

    public float khath_2() {
        block0: {
            int n = 649171420;
            n = Integer.rotateLeft(n * -884251841, 20) ^ 0xA9656DA3;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0x1A02B08D;
            if ((n2 ^ n) == 436383885) break block0;
            int cfr_ignored_0 = (0x3CB32151 ^ n) + -472306114;
        }
        return this.tst_2.thw_5();
    }

    private void shmq(bshgh bshgh2) {
        int n = -1683631363;
        n = Integer.rotateLeft(n * -165518567, 19) ^ 0xE211CBB1;
        n = System.identityHashCode(this) ^ n;
        bshgh bshgh3 = bshgh2;
        n = Integer.rotateRight((bshgh3 != null ? System.identityHashCode(bshgh3) : 0) ^ n, 13);
        int n2 = n ^ 0x5C733754;
        if ((n2 ^ n) != 1551054676) {
            int cfr_ignored_0 = (0xC7D6E5A9 ^ n) + -197589004;
        }
        byq byq2 = byq.tkhw(bshgh2.hsth_2());
        bshgh2.trt_3(byq2.tkhl_2(this.tst_2.thw_5() * Float.intBitsToFloat(1802749090 - 670352546)).rk());
    }

    private static String thdh_5(String string, int n, int n2, int n3) {
        int n4 = -1612864053;
        n4 = Integer.rotateLeft(n4 * 1661304371, 3) ^ 0x6A455C5D;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 15);
        int n5 = (n4 = n ^ n4) ^ 0x89935E3F;
        if ((n5 ^ n4) != -1986830785) {
            int cfr_ignored_0 = (0x164EFBF4 ^ n4) - -1204436404;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x193D4B39 ^ n2 - i) + khkhz, 9) ^ hbw + i * -935007267));
        }
        return new String(cArray);
    }

    private static String[] jshk(String string) {
        int n = 85177132;
        int n2 = (n = Integer.rotateLeft(n * -718827847, 22) ^ 0x468F3920) ^ 0x6D4924D8;
        if ((n2 ^ n) != 1833510104) {
            int cfr_ignored_0 = (0x685A97F4 ^ n) + 1605420647;
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

    private static CallSite tshy_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1101529994;
            n3 = Integer.rotateLeft(n3 * 1795917415, 7) ^ 0x67ACDFEB;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x93E11291;
            if ((n4 ^ n3) != -1813966191) {
                int cfr_ignored_0 = (0xD249111B ^ n3) - -569954731;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ khar_2 ^ string.hashCode()) + (n2 + zwd_2) + i ^ khar_2, 22) + zwd_2);
            }
            String[] stringArray = bhb.jshk(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType3) : lookup.findVirtual(clazz, stringArray[0], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] yde7h1rbp513(String string) {
        return string.split("\u0004\u0015", -1);
    }

    private static CallSite ogls5lcof(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ gdfgx7vh ^ string.hashCode() ^ n2 + dkm0bpy5fyc ^ i * 950726943 ^ gdfgx7vh, 15) ^ dkm0bpy5fyc));
            }
            String[] stringArray = bhb.yde7h1rbp513(new String(cArray));
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

