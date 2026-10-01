/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.trz_2;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bat_2 {
    private static final int dhlt_2 = 1626954813;
    private static final int dhtsh = 160358970;
    private static final int fqbmllcaxznf = 418111003;
    private static final int w69qblou35 = -901092743;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p3ehf5ljjy4;

    private bat_2() {
    }

    public static float shwa_2(class_243 class_2432, class_243 class_2433) {
        int n = 2012938283;
        n = Integer.rotateLeft(n * -893708275, 26) ^ 0x94359E3;
        class_243 class_2434 = class_2432;
        n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
        class_243 class_2435 = class_2433;
        n = (class_2435 != null ? System.identityHashCode(class_2435) : 0) ^ n;
        int n2 = n ^ 0xD13ADC83;
        if ((n2 ^ n) != -784671613) {
            int cfr_ignored_0 = (0xA6C1DCA8 ^ n) + 1741375271;
        }
        class_243 class_2436 = class_2433.method_1020(class_2432);
        double d = bat_2.khjz_2(class_2436.field_1352 * class_2436.field_1352 + class_2436.field_1350 * class_2436.field_1350);
        return (float)(-Math.toDegrees(Math.atan2(class_2436.field_1351, d)));
    }

    public static class_243 rth(class_238 class_2382, class_243 class_2432) {
        int n = -2088257782;
        n = Integer.rotateLeft(n * -1877697051, 20) ^ 0xA906A194;
        class_238 class_2383 = class_2382;
        n = (class_2383 != null ? System.identityHashCode(class_2383) : 0) ^ n;
        class_243 class_2433 = class_2432;
        n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
        int n2 = n ^ 0x31A646C4;
        if ((n2 ^ n) != 832980676) {
            int cfr_ignored_0 = (0xB221F1CE ^ n) - 353013674;
        }
        return new class_243(bat_2.dhhsh(class_2432.field_1352, class_2382.field_1323, class_2382.field_1320), class_3532.method_15350((double)class_2432.field_1351, (double)class_2382.field_1322, (double)class_2382.field_1325), class_3532.method_15350((double)class_2432.field_1350, (double)class_2382.field_1321, (double)class_2382.field_1324));
    }

    public static class_243 ztz_8(class_238 class_2382, class_243 class_2432, float f) {
        double d;
        try {
            int n = 1663024772;
            n = Integer.rotateLeft(n * 1028404343, 5) ^ 0x3334814A;
            class_238 class_2383 = class_2382;
            n = (class_2383 != null ? System.identityHashCode(class_2383) : 0) ^ n;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0x6E1F6412;
            if ((n2 ^ n) != 1847550994) {
                int cfr_ignored_0 = (0xD00DA96 ^ n) + 2036418943;
            }
            if ((0x317 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        double d2 = (class_2382.field_1323 + class_2382.field_1320) * Double.longBitsToDouble(0x60D56FD2B53404E7L ^ 0x5F356FD2B53404E7L);
        double d3 = (class_2382.field_1321 + class_2382.field_1324) * bat_2.ghtdh(0xA99384A8B9079901L ^ 0x967384A8B9079901L);
        double d4 = class_2382.field_1325 - class_2382.field_1322;
        if (d4 < Double.longBitsToDouble(0x49D0DB0F4E7E4CE3L ^ 0x76CAEDEDA5620FCEL)) {
            return new class_243(d2, class_2382.field_1322, d3);
        }
        double d5 = Math.max(d4 * Double.longBitsToDouble(0xDEF538A37CCDCA86L ^ 0xE15B80F29748D43EL), Double.longBitsToDouble(0x7AFDB2C2971D3190L ^ 0x45530A937C982F28L));
        class_243 class_2434 = new class_243(d2, class_2382.field_1325 - d5, d3);
        class_243 class_2435 = new class_243(d2, class_2382.field_1322 + d5, d3);
        float f2 = bat_2.shwa_2(class_2432, class_2434);
        float f3 = bat_2.zghth_2(class_2432, class_2435);
        if (Math.abs(f3 - f2) < bat_2.twr_2(Integer.reverse(-361890753) ^ 0xC2F37A9A)) {
            d = class_2382.field_1322 + d4 * Double.longBitsToDouble(0x32C9BCB8BDEBC033L ^ 0xD291F6FB7D6B097L);
        } else {
            float f4 = (f - f2) / (f3 - f2);
            f4 = class_3532.method_15363((float)f4, (float)0.0f, (float)1.0f);
            d = class_2382.field_1325 - d5 + (double)f4 * (class_2382.field_1322 + d5 - (class_2382.field_1325 - d5));
        }
        return new class_243(d2, d, d3);
    }

    public static class_243 dhthn(class_243 class_2432, class_243 class_2433, class_238 class_2382, float f, float f2) {
        int n = -1207661139;
        n = Integer.rotateLeft(n * -695802877, 16) ^ 0xEF05E121;
        class_243 class_2434 = class_2432;
        n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
        class_243 class_2435 = class_2433;
        n = (class_2435 != null ? System.identityHashCode(class_2435) : 0) ^ n;
        int n2 = n ^ 0x2FAD778A;
        if ((n2 ^ n) != 799897482) {
            int cfr_ignored_0 = (0x97A9FA27 ^ n) + 1547699645;
        }
        class_243 class_2436 = class_2432.method_1020(class_2433);
        if (Math.hypot(class_2436.field_1352, class_2436.field_1350) >= Double.longBitsToDouble(0x97C19388EA862D9FL ^ 0xA80DBB7D280971B6L)) {
            return class_2436;
        }
        if (class_2382 != null) {
            class_243 class_2437 = new class_243((class_2382.field_1323 + class_2382.field_1320) * Double.longBitsToDouble(0x8F72DB43C09125FAL ^ 0xB092DB43C09125FAL), class_2382.field_1322 + (double)f * bat_2.zhh_8(0xC32A8DAB04651297L ^ 0xFCCA2E7C0E586233L), (class_2382.field_1321 + class_2382.field_1324) * Double.longBitsToDouble(0xEFC40B30DC2E9421L ^ 0xD0240B30DC2E9421L)).method_1020(class_2433);
            if (Math.hypot(class_2437.field_1352, class_2437.field_1350) >= Double.longBitsToDouble(0xCC1951AE6AE53BC5L ^ 0xF3D5795BA86A67ECL)) {
                return class_2437;
            }
        }
        double d = Math.toRadians(f2);
        return new class_243(-Math.sin(d) * Double.longBitsToDouble(0x7FD8A3D081D222BAL ^ 0x40148B25435D7E93L), class_2436.field_1351, Math.cos(d) * Double.longBitsToDouble(0x19EE1BDE0D5974F3L ^ 0x2622332BCFD628DAL));
    }

    public static float that_4(class_243 class_2432) {
        try {
            int n = -74703949;
            n = Integer.rotateLeft(n * -1060123991, 26) ^ 0xCCA15D4;
            int n2 = n ^ 0xDC778C45;
            if ((n2 ^ n) != -596145083) {
                int cfr_ignored_0 = (0x27FB97F6 ^ n) + 1148677776;
            }
            if ((0x174 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bat_2.ahq_2()) {
            yf.athz_2();
        }
        return (float)class_3532.method_15338((double)(bat_2.thd_6(Math.atan2(class_2432.field_1350, class_2432.field_1352)) - bat_2.dhhdh_2(0xED5D53699E82D826L ^ 0xAD0BD3699E82D826L)));
    }

    public static float shba_2(class_243 class_2432) {
        block0: {
            int n = trz_2.ys_2(-1461175365);
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 2);
            int n2 = n ^ 0x8D88CAA;
            if ((n2 ^ n) == 148409514) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA030B711 ^ n, 7) + 1782827594) * -1607420143;
            int cfr_ignored_1 = (int)(0x6282192C27D4EB4FL ^ (long)n ^ 0xCF28831A2DB968D5L);
        }
        return (float)(-bat_2.zlm_2(Math.atan2(class_2432.field_1351, Math.sqrt(class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350))));
    }

    private static double khjz_2(double d) {
        block0: {
            int n = -1393694511;
            int n2 = (n = Integer.rotateLeft(n * 140734431, 11) ^ 0x8A61A85C) ^ 0x63CD4DDC;
            if ((n2 ^ n) == 1674399196) break block0;
            int cfr_ignored_0 = (0xCF20A50D ^ n) + -1131898433;
        }
        return Math.sqrt(d);
    }

    private static double dhhsh(double d, double d2, double d3) {
        block0: {
            int n = 1205753638;
            n = Integer.rotateLeft(n * 2116523121, 18) ^ 0x7EA94B32;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0xECBC7042;
            if ((n2 ^ n) == -323194814) break block0;
            int cfr_ignored_0 = (0xAB622764 ^ n) - 37931989;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static double ghtdh(long l) {
        block0: {
            int n = trz_2.ys_2(1002179977);
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 9)) ^ 0xCD42B879;
            if ((n2 ^ n) == -851265415) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF6FEB5F0 ^ n, 17) + -315250869) * -151079439;
        }
        return Double.longBitsToDouble(l);
    }

    private static float zghth_2(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = -1880357125;
            n = Integer.rotateLeft(n * -1430722809, 19) ^ 0x7D5B19FE;
            class_243 class_2434 = class_2433;
            n = Integer.rotateLeft((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 9);
            int n2 = n ^ 0xE4CBE562;
            if ((n2 ^ n) == -456399518) break block0;
            int cfr_ignored_0 = (0x6B27E399 ^ n) + 227995093;
        }
        return bat_2.shwa_2(class_2432, class_2433);
    }

    private static float twr_2(int n) {
        block0: {
            int n2 = 1582141720;
            int n3 = (n2 = Integer.rotateLeft(n2 * -345414361, 8) ^ 0xA5C77496) ^ 0xF2DA1260;
            if ((n3 ^ n2) == -220589472) break block0;
            int cfr_ignored_0 = (0xAC978378 ^ n2) + -997325618;
        }
        return Float.intBitsToFloat(n);
    }

    private static double zhh_8(long l) {
        block0: {
            int n = 448662506;
            n = Integer.rotateLeft(n * 635587921, 19) ^ 0xD50090E3;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 12)) ^ 0x6237BEE;
            if ((n2 ^ n) == 102988782) break block0;
            int cfr_ignored_0 = (0x1C9D7004 ^ n) - 589022478;
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean ahq_2() {
        block0: {
            int n = -2090900149;
            int n2 = (n = Integer.rotateLeft(n * -211012447, 17) ^ 0x5B6CBA8D) ^ 0x94417479;
            if ((n2 ^ n) == -1807649671) break block0;
            int cfr_ignored_0 = (0x171E1132 ^ n) - 854093366;
        }
        return yf.khdha_2();
    }

    private static double thd_6(double d) {
        block0: {
            int n = 1209363280;
            n = Integer.rotateLeft(n * 717976189, 17) ^ 0xD3FAA077;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 10);
            int n2 = n ^ 0x6FB991F8;
            if ((n2 ^ n) == 1874432504) break block0;
            int cfr_ignored_0 = (0x27ACFAA8 ^ n) - -530488126;
        }
        return Math.toDegrees(d);
    }

    private static double dhhdh_2(long l) {
        block0: {
            int n = 1535648402;
            n = Integer.rotateLeft(n * -1444566765, 16) ^ 0x2A58D2AA;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 17)) ^ 0x117DFBF9;
            if ((n2 ^ n) == 293469177) break block0;
            int cfr_ignored_0 = (0x4AF5D96B ^ n) - 486679250;
        }
        return Double.longBitsToDouble(l);
    }

    private static double zlm_2(double d) {
        block0: {
            int n = trz_2.ys_2(464810102);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 14);
            int n2 = n ^ 0xF2F3FCD;
            if ((n2 ^ n) == 254754765) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x149B4FBB ^ n, 5) + -2094250272) * 345722811;
        }
        return Math.toDegrees(d);
    }

    private static String[] khsdh_2(String string) {
        int n = 247215875;
        int n2 = (n = Integer.rotateLeft(n * -2010431351, 20) ^ 0x91EEA547) ^ 0x2B89855E;
        if ((n2 ^ n) != 730432862) {
            int cfr_ignored_0 = (0x2535B25D ^ n) + 1257823008;
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

    private static CallSite abgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1462020849;
            n3 = Integer.rotateLeft(n3 * 253420943, 9) ^ 0x1124E121;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 9);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 21);
            int n4 = n3 ^ 0x131223A5;
            if ((n4 ^ n3) != 319955877) {
                int cfr_ignored_0 = (0x44368954 ^ n3) + -212830863;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dhlt_2 ^ string.hashCode() ^ n2 + dhtsh ^ i * 362564051 ^ dhlt_2, 13) ^ dhtsh));
            }
            String[] stringArray = bat_2.khsdh_2(new String(cArray));
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

    private static String[] y2psxhjl0q79(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bxk2s48g3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ fqbmllcaxznf ^ string.hashCode() ^ n2 + w69qblou35 + i * 225788649) + fqbmllcaxznf) ^ w69qblou35));
            }
            String[] stringArray = bat_2.y2psxhjl0q79(new String(cArray));
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

