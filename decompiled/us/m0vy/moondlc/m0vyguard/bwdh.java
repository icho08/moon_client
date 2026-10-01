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
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.hz_3;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Camera Clip", category=bzw.OTHER, desc="Allows the third-person camera to clip through blocks")
public class bwdh
extends bnq {
    private static bwdh sja_4;
    private final tay hksh = new tay(this, "Distance").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0x3B0DC2B ^ 0x4290DC2B)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(1095530142 - 13399710));
    private static final int rqt = -235118521;
    private static final int dbd_2 = -583488344;
    private static final int khshth = 1930586658;
    private static final int thjb = 2108376258;
    private static final int tlw8jb2 = -504351561;
    private static final int nlspnk3eai = -1677653811;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int n9yoaj6mf45c6;

    public bwdh() {
        sja_4 = this;
    }

    public static bwdh tghd_4() {
        block0: {
            int n = 150292784;
            int n2 = (n = Integer.rotateLeft(n * 290201443, 26) ^ 0xF64F3517) ^ 0xCBE1DE49;
            if ((n2 ^ n) == -874389943) break block0;
            int cfr_ignored_0 = (0xC3149779 ^ n) + -1544375899;
        }
        return sja_4;
    }

    public float zal_3() {
        block0: {
            int n = -1722981317;
            n = Integer.rotateLeft(n * -872534421, 10) ^ 0xAE6181DC;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xC89012D1;
            if ((n2 ^ n) == -930082095) break block0;
            int cfr_ignored_0 = (0x51DD76EA ^ n) + 1510866289;
        }
        return bwdh.khbz(this.hksh);
    }

    private static String rwy(String string, int n, int n2, int n3) {
        try {
            int n4 = -1059189803;
            n4 = Integer.rotateLeft(n4 * 1474540251, 23) ^ 0xE63E214C;
            n4 = Integer.rotateRight(n2 ^ n4, 23);
            int n5 = n4 ^ 0x5D63ECC2;
            if ((n5 ^ n4) != 1566829762) {
                int cfr_ignored_0 = (0x9DBDE717 ^ n4) + 1212573125;
            }
            if ((0x357 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x60082BF5) + rqt ^ Integer.reverse(n2 + i * 1579767343), 16) - dbd_2);
        }
        return new String(cArray);
    }

    private static float khbz(tay tay2) {
        block0: {
            int n = hz_3.shdz_4(-788952472);
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0x7BDA7F8E;
            if ((n2 ^ n) == 2077917070) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xAB23F5E6 ^ n, 8) - -1111988715;
        }
        return tay2.thw_5();
    }

    private static String[] slt_3(String string) {
        int n = 1904262417;
        int n2 = (n = Integer.rotateLeft(n * -518268547, 6) ^ 0xA694184F) ^ 0xC1E38F3F;
        if ((n2 ^ n) != -1042051265) {
            int cfr_ignored_0 = (0xB063322E ^ n) - 520800435;
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

    private static CallSite sbs_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1877350729;
            n3 = Integer.rotateLeft(n3 * -216439485, 8) ^ 0xD06E319F;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 5);
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xDBD7867D;
            if ((n4 ^ n3) != -606632323) {
                int cfr_ignored_0 = (0x4BCE60CA ^ n3) + 913353960;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ khshth ^ string.hashCode()) + (n2 + thjb) + i ^ khshth, 12) + thjb);
            }
            String[] stringArray = bwdh.slt_3(new String(cArray));
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

    private static String[] u6ksvtmc7qfe(String string) {
        return string.split("\u0003\u0014", -1);
    }

    private static CallSite vu1g50p5rqjz0x(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tlw8jb2 ^ string.hashCode()) + (n2 + nlspnk3eai) + i ^ tlw8jb2, 12) + nlspnk3eai);
            }
            String[] stringArray = bwdh.u6ksvtmc7qfe(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

