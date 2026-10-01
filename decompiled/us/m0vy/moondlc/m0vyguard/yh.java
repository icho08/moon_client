/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.yf;

public final class yh
implements tthy {
    private static final int shqt = 1431916102;
    private static final int bfth = -2105882790;
    private static final int zth = -1321526675;
    private static final int jthsh = 2080646275;
    private static final int yidgily7l6dyy = 1838583836;
    private static final int tvfgloo = 1599722615;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int f6o2z705;

    public static float zfn(class_1297 class_12972, class_1657 class_16572) {
        int n = -1028447064;
        n = Integer.rotateLeft(n * 120821803, 23) ^ 0xA19C4725;
        class_1657 class_16573 = class_16572;
        n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
        int n2 = n ^ 0x8D3889C0;
        if ((n2 ^ n) != -1925674560) {
            int cfr_ignored_0 = (0x4F8BAD68 ^ n) + -1231566656;
        }
        class_243 class_2432 = new class_243(class_12972.method_23317(), class_12972.method_23318(), class_12972.method_23321());
        class_243 class_2433 = class_16572.method_5829().method_1005();
        double d = class_2433.method_1022(class_2432);
        if (d < Double.longBitsToDouble(0xA5896D5DCDFF7C12L ^ 0x9A696D5DCDFF7C12L)) {
            d = 0.0;
        }
        double d2 = 1.0 - class_3532.method_15350((double)(d / Double.longBitsToDouble(0xCC8D892E7FE23793L ^ 0x8C95892E7FE23793L)), (double)0.0, (double)1.0);
        boolean bl = class_16572.method_37908().method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)class_16572)).method_17783() != class_239.class_240.field_1333;
        float f = bl ? Float.intBitsToFloat(975499850 + 84820201) : 1.0f;
        return (float)((double)f * (d2 * yh.zwh_4(0xDB3E50BCC091864L ^ 0x4D8BE50BCC091864L) + 1.0));
    }

    @Generated
    private yh() {
        throw new UnsupportedOperationException("This is a u".concat("tility class a").concat("nd cannot ").concat("be instantiated"));
    }

    private static String amw(String string, int n, int n2, int n3) {
        try {
            int n4 = 1881984358;
            n4 = Integer.rotateLeft(n4 * -1645439749, 4) ^ 0x9C4B20E9;
            int n5 = n4 ^ 0x68D244E0;
            if ((n5 ^ n4) != 1758610656) {
                int cfr_ignored_0 = (0x18FE8986 ^ n4) + 1968985385;
            }
            if ((0x1C3 & 0) != 0) {
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
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x39275CE7) + shqt ^ Integer.reverse(n2 + i * 710088207), 14) - bfth);
        }
        return new String(cArray);
    }

    private static double zwh_4(long l) {
        block0: {
            int n = -11802258;
            n = Integer.rotateLeft(n * 420175941, 27) ^ 0x21B79643;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 20)) ^ 0xC906F2FC;
            if ((n2 ^ n) == -922291460) break block0;
            int cfr_ignored_0 = (0x364D1B92 ^ n) - 1460987439;
        }
        return Double.longBitsToDouble(l);
    }

    private static String[] abdh(String string) {
        block0: {
            int n = -1073266634;
            n = Integer.rotateLeft(n * 2042975527, 15) ^ 0x9534F684;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 10);
            int n2 = n ^ 0x4C092229;
            if ((n2 ^ n) == 1275666985) break block0;
            int cfr_ignored_0 = (0x8C0E621F ^ n) - 701433703;
        }
        return string.split("\b\u000f", -1);
    }

    private static CallSite ghkhq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 832617127;
            n3 = Integer.rotateLeft(n3 * -658281995, 14) ^ 0x3821A5B5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            n3 = Integer.rotateLeft(n ^ n3, 24);
            int n4 = n3 ^ 0xB1100730;
            if ((n4 ^ n3) != -1324349648) {
                int cfr_ignored_0 = (0x80B0BD97 ^ n3) - -1431640850;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zth ^ string.hashCode() ^ n2 + jthsh + i * -1643123243) + zth) ^ jthsh));
            }
            String[] stringArray = yh.abdh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] v6u521qb9wms(String string) {
        return string.split("\u0003\u0016", -1);
    }

    private static CallSite zef7xmubkzf6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ yidgily7l6dyy ^ string.hashCode() ^ n2 + tvfgloo + i * 2119980813) + yidgily7l6dyy) ^ tvfgloo));
            }
            String[] stringArray = yh.v6u521qb9wms(new String(cArray));
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

