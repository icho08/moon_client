/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2478
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2478;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bzkh;
import us.m0vy.moondlc.m0vyguard.jth_3;
import us.m0vy.moondlc.m0vyguard.khs_2;
import us.m0vy.moondlc.m0vyguard.shm_3;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bt {
    private static final int thft = 892952410;
    private static final int dhkz = -1663790602;
    private static final int rhy_2 = -1504592994;
    private static final int hdha = -2079269667;
    private static final int aj6ttnwv1 = -2124532243;
    private static final int f8ai79r247 = -1766164580;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int r9kpob5r;

    private bt() {
    }

    public static khs_2 md_2(class_2338 class_23382, int n, bzkh bzkh2, jth_3 jth2, float f, float f2, List list, boolean bl) {
        int n2 = 953305803;
        n2 = Integer.rotateLeft(n2 * 1638753543, 26) ^ 0x179541E0;
        bzkh bzkh3 = bzkh2;
        n2 = (bzkh3 != null ? System.identityHashCode((Object)bzkh3) : 0) ^ n2;
        jth_3 jth3 = jth2;
        n2 = Integer.rotateLeft((jth3 != null ? System.identityHashCode((Object)jth3) : 0) ^ n2, 4);
        int n3 = n2 ^ 0x2B5193F7;
        if ((n3 ^ n2) != 726766583) {
            int cfr_ignored_0 = (0x1383D93C ^ n2) + 1366395371;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return null;
        }
        class_243 class_2432 = bt.zdhh(class_3102.field_1724);
        if (bzkh2 == bzkh.szn) {
            if (!bl && !bt.thagh(class_23382)) {
                return null;
            }
            class_243 class_2433 = new class_243((double)bt.dhdh_4(class_23382) + Double.longBitsToDouble(0x33F9F341F93A94D1L ^ 0xC19F341F93A94D1L), (double)class_23382.method_10264() + bt.ttf_3(0x6FEBEF73935BE0CAL ^ 0x500BEF73935BE0CAL), (double)class_23382.method_10260() + Double.longBitsToDouble(0x75DB73458958AD77L ^ 0x4A3B73458958AD77L));
            double d = class_2432.method_1025(class_2433);
            if (d <= (double)(f * f)) {
                class_3965 class_39652 = new class_3965(class_2433, class_2350.field_11033, class_23382, false);
                float[] fArray = bt.sfq(class_2433);
                return new khs_2(class_39652, fArray[0], fArray[1]);
            }
        }
        for (class_2350 class_23502 : class_2350.values()) {
            Object object;
            class_243 class_2434;
            double d;
            class_2338 class_23383 = bt.shkq(class_23382, class_23502.method_10153());
            class_2680 class_26802 = bt.dmk(class_3102.field_1687, class_23383);
            boolean bl2 = !bt.adw_2(class_26802) && !class_26802.method_45474() && !bt.htj(class_26802.method_26204());
            boolean bl3 = list.contains(class_23383);
            if (!bl2 && !bl3) continue;
            class_2350 class_23503 = class_23502;
            double d2 = (Math.random() - Double.longBitsToDouble(0x9721AA154CBF5B37L ^ 0xA8C1AA154CBF5B37L)) * bt.zal_4(0x5058DEEF1069EE76L ^ 0x6FF1477689F077ECL);
            double d3 = (Math.random() - Double.longBitsToDouble(0x6A1C341D4A1E93D0L ^ 0x55FC341D4A1E93D0L)) * Double.longBitsToDouble(0x196051BC41B7DD0DL ^ 0x26C9C825D82E4497L);
            double d4 = (Math.random() - Double.longBitsToDouble(0x98298D2BDB982E81L ^ 0xA7C98D2BDB982E81L)) * Double.longBitsToDouble(0x17EB6D3352AAB1AFL ^ 0x2842F4AACB332835L);
            class_243 class_2435 = new class_243((double)bt.zfa_3(class_23383) + Double.longBitsToDouble(0x9E0FD5D47095AAEBL ^ 0xA1EFD5D47095AAEBL) + (double)class_23503.method_10148() * Double.longBitsToDouble(0xA0E4E66D37180EC2L ^ 0x9F04E66D37180EC2L) + (class_23503.method_10148() == 0 ? d2 : 0.0), (double)bt.bdz_2(class_23383) + Double.longBitsToDouble(0x582163A94BDB9C3BL ^ 0x67C163A94BDB9C3BL) + (double)bt.thqs(class_23503) * Double.longBitsToDouble(0x2491F316D3E381E7L ^ 0x1B71F316D3E381E7L) + (class_23503.method_10164() == 0 ? d3 : 0.0), (double)class_23383.method_10260() + Double.longBitsToDouble(0xEDCC152B6076E6B8L ^ 0xD22C152B6076E6B8L) + (double)class_23503.method_10165() * Double.longBitsToDouble(0x7D360C525AFC8F81L ^ 0x42D60C525AFC8F81L) + (bt.rqa_2(class_23503) == 0 ? d4 : 0.0));
            double d5 = bt.qk(class_2432, class_2435);
            boolean bl4 = bt.thagh(class_23383);
            if (!bl && !bl4) continue;
            double d6 = d = bl4 ? (double)f : (double)f2;
            if (d5 > d * d) continue;
            if (bzkh2 == bzkh.dar_2 || bzkh2 == bzkh.rkhm) {
                class_2434 = bt.jghl(bt.aml(class_2432, class_2435));
                object = new class_243((double)class_23503.method_10148(), (double)class_23503.method_10164(), (double)class_23503.method_10165());
                if (object.method_1026(class_2434) <= 0.0) continue;
            }
            class_2434 = new class_3965(class_2435, class_23503, class_23383, false);
            object = bt.sfq(class_2435);
            return new khs_2((class_3965)class_2434, object[0], object[1]);
        }
        return null;
    }

    private static float[] sfq(class_243 class_2432) {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return new float[]{0.0f, 0.0f};
        }
        class_243 class_2433 = class_3102.field_1724.method_33571();
        double d = class_2432.field_1352 - class_2433.field_1352;
        double d2 = class_2432.field_1351 - class_2433.field_1351;
        double d3 = class_2432.field_1350 - class_2433.field_1350;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = (float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f;
        float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
        float f3 = class_3532.method_15393((float)(f - class_3102.field_1724.method_36454()));
        f = class_3102.field_1724.method_36454() + f3;
        return new float[]{f, f2};
    }

    public static boolean thagh(class_2338 class_23382) {
        int n = -1779519732;
        n = Integer.rotateLeft(n * -220187487, 10) ^ 0xC3805E1;
        class_2338 class_23383 = class_23382;
        n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 5);
        int n2 = n ^ 0x6EB73C92;
        if ((n2 ^ n) != 1857502354) {
            int cfr_ignored_0 = (0xFB59939E ^ n) - 453773636;
        }
        class_310 class_3102 = bt.dtz_2();
        if (class_3102.field_1687 == null || class_3102.field_1724 == null) {
            return false;
        }
        class_3965 class_39652 = class_3102.field_1687.method_17742(new class_3959(bt.tsd_7(class_3102.field_1724), class_23382.method_46558(), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)class_3102.field_1724));
        return class_39652 == null || class_39652.method_17783() == class_239.class_240.field_1333 || class_39652.method_17777().equals((Object)class_23382);
    }

    public static boolean htj(class_2248 class_22482) {
        try {
            int n = 165270550;
            n = Integer.rotateLeft(n * -720571963, 6) ^ 0xC7541BE6;
            class_2248 class_22483 = class_22482;
            n = Integer.rotateLeft((class_22483 != null ? System.identityHashCode(class_22483) : 0) ^ n, 15);
            int n2 = n ^ 0x4114B0C5;
            if ((n2 ^ n) != 1091875013) {
                int cfr_ignored_0 = (0x48CD64D3 ^ n) + 992071011;
            }
            if ((0x7C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bt.dhfm()) {
            yf.athz_2();
        }
        if (class_22482 instanceof class_2478) {
            return true;
        }
        String string = class_22482.getClass().getSimpleName();
        return string.contains("SignBlock") || string.contains("Sign");
    }

    private static String tdk(String string, int n, int n2, int n3) {
        int n4 = shm_3.sad_4(-1756392651);
        n4 = n2 ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0x28C39CE7;
        if ((n5 ^ n4) != 683908327) {
            int cfr_ignored_0 = (Integer.rotateRight(0xBF8C0FD2 ^ n4, 10) + 911444393) * -1081339949;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xF62619D6 ^ n2 ^ i * -1212346299 ^ thft, 27) ^ dhkz));
        }
        return new String(cArray);
    }

    private static class_243 zdhh(class_746 class_7462) {
        block0: {
            int n = -1592847210;
            n = Integer.rotateLeft(n * -270523477, 16) ^ 0x6B4EDEE0;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 13);
            int n2 = n ^ 0x71B562C8;
            if ((n2 ^ n) == 1907712712) break block0;
            int cfr_ignored_0 = (0xD0BA765E ^ n) - 160624704;
        }
        return class_7462.method_33571();
    }

    private static int dhdh_4(class_2338 class_23382) {
        block0: {
            int n = 1385830812;
            int n2 = (n = Integer.rotateLeft(n * -1037172393, 4) ^ 0x9C757292) ^ 0x7251F3B0;
            if ((n2 ^ n) == 1917973424) break block0;
            int cfr_ignored_0 = (0x20CBEA2C ^ n) - -778536069;
        }
        return class_23382.method_10263();
    }

    private static double ttf_3(long l) {
        block0: {
            int n = -95037933;
            n = Integer.rotateLeft(n * -1931129461, 20) ^ 0x20873055;
            int n2 = (n = (int)l ^ n) ^ 0x2F1EF82A;
            if ((n2 ^ n) == 790558762) break block0;
            int cfr_ignored_0 = (0xD54B2E39 ^ n) - 50917014;
        }
        return Double.longBitsToDouble(l);
    }

    private static class_2338 shkq(class_2338 class_23382, class_2350 class_23502) {
        block0: {
            int n = -150215654;
            n = Integer.rotateLeft(n * -106026183, 10) ^ 0x19AA1512;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            class_2350 class_23503 = class_23502;
            n = (class_23503 != null ? System.identityHashCode(class_23503) : 0) ^ n;
            int n2 = n ^ 0x6B3EDF91;
            if ((n2 ^ n) == 1799282577) break block0;
            int cfr_ignored_0 = (0x9C353B8B ^ n) + -1399135682;
        }
        return class_23382.method_10093(class_23502);
    }

    private static class_2680 dmk(class_638 class_6382, class_2338 class_23382) {
        block0: {
            int n = 1251179925;
            n = Integer.rotateLeft(n * 1733136365, 23) ^ 0x928D4472;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 27);
            int n2 = n ^ 0xE1FE7509;
            if ((n2 ^ n) == -503417591) break block0;
            int cfr_ignored_0 = (0xAB6D089C ^ n) - 378490406;
        }
        return class_6382.method_8320(class_23382);
    }

    private static boolean adw_2(class_2680 class_26802) {
        block0: {
            int n = 627007615;
            n = Integer.rotateLeft(n * 83830471, 6) ^ 0xFA5BC33E;
            class_2680 class_26803 = class_26802;
            n = Integer.rotateRight((class_26803 != null ? System.identityHashCode(class_26803) : 0) ^ n, 5);
            int n2 = n ^ 0x2D2BF023;
            if ((n2 ^ n) == 757854243) break block0;
            int cfr_ignored_0 = (0x874905C ^ n) - -924874749;
        }
        return class_26802.method_26215();
    }

    private static double zal_4(long l) {
        block0: {
            int n = shm_3.sad_4(952567662);
            int n2 = (n = Integer.rotateRight((int)l ^ n, 2)) ^ 0xE1503B4A;
            if ((n2 ^ n) == -514835638) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD9973C24 ^ n, 14) - 1571678103;
        }
        return Double.longBitsToDouble(l);
    }

    private static int zfa_3(class_2338 class_23382) {
        block0: {
            int n = shm_3.sad_4(673126349);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x90B80982;
            if ((n2 ^ n) == -1866987134) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB8A71E4F ^ n, 10) - 1620724428;
        }
        return class_23382.method_10263();
    }

    private static int bdz_2(class_2338 class_23382) {
        block0: {
            int n = 1095829788;
            int n2 = (n = Integer.rotateLeft(n * 541981935, 27) ^ 0xE32D562D) ^ 0x9A0566F0;
            if ((n2 ^ n) == -1710922000) break block0;
            int cfr_ignored_0 = (0xDB546FEC ^ n) + -345801015;
        }
        return class_23382.method_10264();
    }

    private static int thqs(class_2350 class_23502) {
        block0: {
            int n = -1302245587;
            int n2 = (n = Integer.rotateLeft(n * 2068521953, 11) ^ 0xE85269B) ^ 0x3E2D8535;
            if ((n2 ^ n) == 1043170613) break block0;
            int cfr_ignored_0 = (0x8C4CCA18 ^ n) + -1325582171;
        }
        return class_23502.method_10164();
    }

    private static int rqa_2(class_2350 class_23502) {
        block0: {
            int n = -1144151105;
            int n2 = (n = Integer.rotateLeft(n * -495577275, 10) ^ 0xD5B362C8) ^ 0x38F6651B;
            if ((n2 ^ n) == 955671835) break block0;
            int cfr_ignored_0 = (0x833BC6A4 ^ n) - -847905199;
        }
        return class_23502.method_10165();
    }

    private static double qk(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = shm_3.sad_4(1667192126);
            class_243 class_2434 = class_2432;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            class_243 class_2435 = class_2433;
            n = Integer.rotateLeft((class_2435 != null ? System.identityHashCode(class_2435) : 0) ^ n, 28);
            int n2 = n ^ 0x2909277F;
            if ((n2 ^ n) == 688465791) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4A567241 ^ n, 12) + 81098010;
            int cfr_ignored_1 = (int)(0x88E4DC7C27D4EB4FL ^ (long)n ^ 0x4588831A2DB8BC18L);
        }
        return class_2432.method_1025(class_2433);
    }

    private static class_243 aml(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = 439965645;
            n = Integer.rotateLeft(n * -598688765, 12) ^ 0x2BF918F4;
            class_243 class_2434 = class_2432;
            n = Integer.rotateLeft((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 15);
            int n2 = n ^ 0x8B0A3E13;
            if ((n2 ^ n) == -1962263021) break block0;
            int cfr_ignored_0 = (0x913369DE ^ n) + 1774112411;
        }
        return class_2432.method_1020(class_2433);
    }

    private static class_243 jghl(class_243 class_2432) {
        block0: {
            int n = shm_3.sad_4(623388779);
            class_243 class_2433 = class_2432;
            n = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 3);
            int n2 = n ^ 0x547D3CBC;
            if ((n2 ^ n) == 1417493692) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x715514D7 ^ n, 17) - -1112857276) * 1901401303;
        }
        return class_2432.method_1029();
    }

    private static class_310 dtz_2() {
        block0: {
            int n = shm_3.sad_4(-620257856);
            int n2 = n ^ 0x7379D59F;
            if ((n2 ^ n) == 1937364383) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA87E485F ^ n, 8) - 1806197436) * -1468118945;
        }
        return class_310.method_1551();
    }

    private static class_243 tsd_7(class_746 class_7462) {
        block0: {
            int n = shm_3.sad_4(1172059344);
            int n2 = n ^ 0xDA48AF26;
            if ((n2 ^ n) == -632770778) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9F949BF6 ^ n, 6) - 1465680389) * -1617650697;
        }
        return class_7462.method_33571();
    }

    private static boolean dhfm() {
        block0: {
            int n = -1000262655;
            int n2 = (n = Integer.rotateLeft(n * 1455124105, 25) ^ 0xAF499973) ^ 0x60570BF1;
            if ((n2 ^ n) == 1616317425) break block0;
            int cfr_ignored_0 = (0xA4363FF0 ^ n) - -505485334;
        }
        return yf.khdha_2();
    }

    private static String[] rdhb(String string) {
        int n = 1969774106;
        int n2 = (n = Integer.rotateLeft(n * 1126536039, 15) ^ 0x181489FB) ^ 0x5FF0559A;
        if ((n2 ^ n) != 1609586074) {
            int cfr_ignored_0 = (0x2A980B80 ^ n) + 2121126499;
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

    private static CallSite sadh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 873928605;
            n3 = Integer.rotateLeft(n3 * -862548001, 22) ^ 0x9FCD9958;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 16);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xA6100D17;
            if ((n4 ^ n3) != -1508897513) {
                int cfr_ignored_0 = (0x92071A8A ^ n3) + 1313285887;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ rhy_2 ^ string.hashCode() ^ n2 + hdha + i * 2136132025) + rhy_2) ^ hdha));
            }
            String[] stringArray = bt.rdhb(new String(cArray));
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

    private static String[] wp35to9hxw(String string) {
        return string.split("\u0004\u0017", -1);
    }

    private static CallSite mutxeiqby4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ aj6ttnwv1 ^ string.hashCode()) + (n2 + f8ai79r247) + i ^ aj6ttnwv1, 8) + f8ai79r247);
            }
            String[] stringArray = bt.wp35to9hxw(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

