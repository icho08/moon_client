/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.trkh;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bsn_2 {
    public static final int dhhn = 22;
    public static final float jnsh = 90.0f;
    public static final float trl = 45.0f;
    private static final int shm = -882962140;
    private static final int zsj = -1618666944;
    private static final int baw_2 = -1366300775;
    private static final int shzdh = -115536922;
    private static final int hota3tih5bxe = 477207967;
    private static final int ayd9ovb3ig7 = 1862799172;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int rvtm8nx66te;

    private bsn_2() {
    }

    public static void zwk(float[] fArray, class_746 class_7462, class_1309 class_13092, lb lb2, lb lb3, float f, float f2, int n, boolean bl) {
        int n2 = 700205083;
        n2 = Integer.rotateLeft(n2 * -553448117, 24) ^ 0x9E3EC199;
        n2 = (fArray != null ? System.identityHashCode(fArray) : 0) ^ n2;
        class_746 class_7463 = class_7462;
        n2 = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n2;
        int n3 = n2 ^ 0xFF443A1D;
        if ((n3 ^ n2) != -12305891) {
            int cfr_ignored_0 = (0xD6F87206 ^ n2) - -740920670;
        }
        if (fArray.length != Integer.rotateLeft(0xF42895BF ^ 0x442895BF, 5)) {
            throw new IllegalArgumentException(bsn_2.thqq("뾧똓껪륖섢ꧺ逅飭捰䯊玲稞", 0x88F9AE37 ^ 0xD95EB3E6, bsn_2.khfth(1374580438) ^ 0xC3B7C3B6, bsn_2.shhdh(-1952634163) ^ 0x1DA04EA2).concat("e vector must c").concat("ontain 22 values"));
        }
        float f3 = bghdh.ttb_2(lb2.sry(), lb3.sry());
        float f4 = lb3.khdhd_2() - lb2.khdhd_2();
        class_243 class_2432 = class_7462.method_18798();
        class_243 class_2433 = class_13092.method_18798();
        double d = class_2433.field_1352 - class_2432.field_1352;
        double d2 = class_2433.field_1351 - class_2432.field_1351;
        double d3 = class_2433.field_1350 - class_2432.field_1350;
        class_238 class_2383 = class_13092.method_5829();
        double d4 = (class_2383.field_1323 + class_2383.field_1320) * Double.longBitsToDouble(0x1EC96F0ED771271FL ^ 0x21296F0ED771271FL);
        double d5 = (class_2383.field_1322 + class_2383.field_1325) * bsn_2.raf_2(0xDC5C9D6811C66C6EL ^ 0xE3BC9D6811C66C6EL);
        double d6 = (class_2383.field_1321 + class_2383.field_1324) * Double.longBitsToDouble(0xE984F890D6FED3F4L ^ 0xD664F890D6FED3F4L);
        double d7 = d4 - class_7462.method_23317();
        double d8 = d5 - bsn_2.zah_2(class_7462);
        double d9 = d6 - class_7462.method_23321();
        double d10 = Math.toRadians(bsn_2.hjh(lb2));
        double d11 = -bsn_2.thjkh(d10);
        double d12 = Math.cos(d10);
        double d13 = bsn_2.dfj(d10);
        double d14 = Math.sin(d10);
        fArray[0] = bsn_2.rhk_2(f3 / Float.intBitsToFloat(1889271456 - 761790112));
        fArray[1] = bsn_2.rhk_2(f4 / Float.intBitsToFloat(0x3A7ED723 ^ 0x78CAD723));
        fArray[2] = bsn_2.rhk_2((float)(Math.sqrt(d7 * d7 + d8 * d8 + d9 * d9) / bsn_2.ttd(0xDFEA9379147EC877L ^ 0x9FCA9379147EC877L)));
        fArray[3] = bsn_2.rhk_2((float)(d8 / bsn_2.hrd(0xA95360BA629F6373L ^ 0xE94360BA629F6373L)));
        fArray[4] = bsn_2.rhk_2((float)((d * d11 + d3 * d12) / Double.longBitsToDouble(0x8E6C8A7B0FEF7CFBL ^ 0xB18513E29676E561L)));
        fArray[5] = bsn_2.hthj((float)((d * d13 + d3 * d14) / Double.longBitsToDouble(0x336E3B8725C49CBAL ^ 0xC87A21EBC5D0520L)));
        fArray[Integer.reverse((int)1422365300) ^ 0x2E49E32C] = bsn_2.rhk_2((float)(d2 / Double.longBitsToDouble(0xECF4C70F898686D0L ^ 0xD31D5E96101F1F4AL)));
        fArray[Integer.reverse((int)-384735759) ^ 0x8FA68890] = bsn_2.rhk_2((float)((class_2432.field_1352 * d11 + class_2432.field_1350 * d12) / Double.longBitsToDouble(0x528E339194A814FEL ^ 0x6D67AA080D318D64L)));
        fArray[366134260 - 366134252] = bsn_2.rhk_2((float)((class_2432.field_1352 * d13 + class_2432.field_1350 * d14) / Double.longBitsToDouble(0x1B0FC964F22BB3F6L ^ 0x24E650FD6BB22A6CL)));
        fArray[Integer.rotateLeft((int)(0xA3DB8A4C ^ 0xA2FB8A4C), (int)11)] = bsn_2.zfkh((float)(class_2432.field_1351 / Double.longBitsToDouble(0xC6D880A028FB16A0L ^ 0xF9311939B1628F3AL)));
        fArray[-1002639288 + 1002639298] = bsn_2.khaf(f / Float.intBitsToFloat(Integer.rotateLeft(0x2E623B4A ^ 0x2F68EB4A, 6)));
        fArray[1354121956 - 1354121945] = bsn_2.rhk_2(f2 / Float.intBitsToFloat(Integer.rotateLeft(0xEF543A8B ^ 0xED459A8B, 5)));
        fArray[228448783 - 228448771] = class_3532.method_15363((float)((float)n / Float.intBitsToFloat(1019407879 - -89985529)), (float)0.0f, (float)1.0f);
        fArray[1739372712 + -1739372699] = bsn_2.dlk_2(class_7462.method_7261(0.0f), 0.0f, 1.0f);
        fArray[998357843 + -998357829] = class_3532.method_15363((float)(class_7462.field_6017 / Float.intBitsToFloat(Integer.reverse(1775284791) ^ 0xAC0D0B96)), (float)0.0f, (float)1.0f);
        fArray[Integer.reverse((int)546905439) ^ 0xFAB8990B] = class_7462.method_24828() ? 1.0f : bsn_2.dwq_2(Integer.rotateLeft(0x89FC8709 ^ 0x82048709, 4));
        fArray[0x28B0883F ^ 0x28B0882F] = class_7462.method_5624() ? 1.0f : bsn_2.jhd_3(-1765766729 - -683636297);
        fArray[0xFDFB75AC ^ 0xFDFB75BD] = bsn_2.dnb((float)class_13092.field_6235 / Float.intBitsToFloat(-1141933947 - 2060417157), 0.0f, 1.0f);
        fArray[Integer.reverse((int)-2114714219) ^ 0xA9A02F93] = class_3532.method_15363((float)(bsn_2.thsw(class_13092) / Float.intBitsToFloat(0x43235FA ^ 0x447235FA)), (float)0.0f, (float)1.0f);
        fArray[bsn_2.tdk_2((int)(0xE31483E9 ^ 0xE3141BE9), (int)21)] = class_7462.method_6128() ? 1.0f : bsn_2.bshz(-1522677892 - -440547460);
        fArray[0xD1F7ADC7 ^ 0xD1F7ADD3] = class_13092.method_6128() ? 1.0f : Float.intBitsToFloat(Integer.reverse(1931848611) ^ 0x7A55A4CE);
        fArray[Integer.reverse((int)-1759201055) ^ 0x871D24FC] = bl ? 1.0f : Float.intBitsToFloat(638584050 - 1720714482);
    }

    public static float dash_4(float f) {
        try {
            int n = 995041814;
            n = Integer.rotateLeft(n * 1080849163, 5) ^ 0xB663CAC8;
            int n2 = n ^ 0x33176D2D;
            if ((n2 ^ n) != 857173293) {
                int cfr_ignored_0 = (0x8584F3B ^ n) - -1120837906;
            }
            if ((0xE9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return class_3532.method_15363((float)(f / Float.intBitsToFloat(-1904357643 + -1271516917)), (float)Float.intBitsToFloat(Integer.reverse(-2065542679) ^ 0x280A4721), (float)1.0f);
    }

    public static float hndh(float f) {
        block0: {
            int n = trkh.thdt_2(-1447726016);
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 28);
            int n2 = n ^ 0x76DDC923;
            if ((n2 ^ n) == 1994246435) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xDF68BD63 ^ n, 14) + 302812728;
        }
        return class_3532.method_15363((float)(f / Float.intBitsToFloat(1873424128 + -762720000)), (float)Float.intBitsToFloat(Integer.reverse(137403969) ^ 0x3DF90C10), (float)1.0f);
    }

    private static float rhk_2(float f) {
        try {
            int n = -360014109;
            n = Integer.rotateLeft(n * 1088399111, 17) ^ 0xF9123364;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 7);
            int n2 = n ^ 0xFFC7991E;
            if ((n2 ^ n) != -3696354) {
                int cfr_ignored_0 = (0x154D07FD ^ n) - 1797953673;
            }
            if ((0x3D3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return class_3532.method_15363((float)f, (float)Float.intBitsToFloat(Integer.reverse(699144543) ^ 0x45583594), (float)Float.intBitsToFloat(142337548 + 927209972));
    }

    private static String thqq(String string, int n, int n2, int n3) {
        int n4 = 1333927175;
        n4 = Integer.rotateLeft(n4 * 99946809, 22) ^ 0xD4D50529;
        n4 = Integer.rotateRight(n ^ n4, 17);
        int n5 = (n4 = n2 ^ n4) ^ 0x1FF54D26;
        if ((n5 ^ n4) != 536169766) {
            int cfr_ignored_0 = (0x50775021 ^ n4) - 1368284115;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x6DB33D6B ^ n2 - i) + zsj, 21) ^ shm + i * 488443799));
        }
        return new String(cArray);
    }

    private static int khfth(int n) {
        block0: {
            int n2 = 1229962245;
            int n3 = (n2 = Integer.rotateLeft(n2 * 402077783, 22) ^ 0x8882DB86) ^ 0x70714508;
            if ((n3 ^ n2) == 1886471432) break block0;
            int cfr_ignored_0 = (0x393EF90D ^ n2) - 777139168;
        }
        return Integer.reverse(n);
    }

    private static int shhdh(int n) {
        block0: {
            int n2 = 131051361;
            n2 = Integer.rotateLeft(n2 * -1199138741, 15) ^ 0xFB4FCAEA;
            int n3 = (n2 = n ^ n2) ^ 0x24475B2;
            if ((n3 ^ n2) == 38041010) break block0;
            int cfr_ignored_0 = (0x58BDAD3 ^ n2) + -408651982;
        }
        return Integer.reverse(n);
    }

    private static String shfq(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1929311801;
            n4 = Integer.rotateLeft(n4 * -2103728065, 15) ^ 0xA762F0CB;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 15);
            int n5 = (n4 = n ^ n4) ^ 0x929B6AE;
            if ((n5 ^ n4) == 153728686) break block0;
            int cfr_ignored_0 = (0x7BD74097 ^ n4) - -645645554;
        }
        return bsn_2.thqq(string, n, n2, n3);
    }

    private static double raf_2(long l) {
        block0: {
            int n = 571682028;
            n = Integer.rotateLeft(n * 422525277, 7) ^ 0x1ECE7B0A;
            int n2 = (n = (int)l ^ n) ^ 0xA23ABA0F;
            if ((n2 ^ n) == -1573209585) break block0;
            int cfr_ignored_0 = (0x802996E3 ^ n) + 271790618;
        }
        return Double.longBitsToDouble(l);
    }

    private static double zah_2(class_746 class_7462) {
        block0: {
            int n = 157628450;
            int n2 = (n = Integer.rotateLeft(n * -1381102087, 6) ^ 0x401BCCA1) ^ 0x3BD88CCE;
            if ((n2 ^ n) == 1004047566) break block0;
            int cfr_ignored_0 = (0x32BDB4EC ^ n) - 1838591599;
        }
        return class_7462.method_23320();
    }

    private static float hjh(lb lb2) {
        block0: {
            int n = trkh.thdt_2(-1142258826);
            lb lb3 = lb2;
            n = (lb3 != null ? System.identityHashCode(lb3) : 0) ^ n;
            int n2 = n ^ 0x1CABB861;
            if ((n2 ^ n) == 481015905) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA7413B17 ^ n, 7) - 1162069764) * -1488897257;
        }
        return lb2.sry();
    }

    private static double thjkh(double d) {
        block0: {
            int n = -174967584;
            n = Integer.rotateLeft(n * 1515020007, 21) ^ 0x9840587B;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 2);
            int n2 = n ^ 0xBDEF4DEF;
            if ((n2 ^ n) == -1108390417) break block0;
            int cfr_ignored_0 = (0x487D790F ^ n) + -516254604;
        }
        return Math.sin(d);
    }

    private static double dfj(double d) {
        block0: {
            int n = 1106382518;
            n = Integer.rotateLeft(n * 1372465493, 15) ^ 0x6D2BC87E;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x21316D18;
            if ((n2 ^ n) == 556887320) break block0;
            int cfr_ignored_0 = (0x60C363AE ^ n) - 567703937;
        }
        return Math.cos(d);
    }

    private static double ttd(long l) {
        block0: {
            int n = -1479376717;
            int n2 = (n = Integer.rotateLeft(n * -317875931, 8) ^ 0xE2D5DEA3) ^ 0x39D3206B;
            if ((n2 ^ n) == 970137707) break block0;
            int cfr_ignored_0 = (0x9E01A0D8 ^ n) - 1789359397;
        }
        return Double.longBitsToDouble(l);
    }

    private static double hrd(long l) {
        block0: {
            int n = trkh.thdt_2(636677135);
            int n2 = (n = (int)l ^ n) ^ 0x1B02E05;
            if ((n2 ^ n) == 28323333) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x2442C20A ^ n, 7) + 1752374897;
        }
        return Double.longBitsToDouble(l);
    }

    private static float hthj(float f) {
        block0: {
            int n = 882068446;
            int n2 = (n = Integer.rotateLeft(n * 60905679, 4) ^ 0x9A9185CB) ^ 0x40BA6C87;
            if ((n2 ^ n) == 1085959303) break block0;
            int cfr_ignored_0 = (0x74292759 ^ n) + -1913285075;
        }
        return bsn_2.rhk_2(f);
    }

    private static float zfkh(float f) {
        block0: {
            int n = 1725531376;
            n = Integer.rotateLeft(n * 1304835999, 9) ^ 0xA05B8241;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x9438649B;
            if ((n2 ^ n) == -1808243557) break block0;
            int cfr_ignored_0 = (0xF2E1E06B ^ n) - -252173835;
        }
        return bsn_2.rhk_2(f);
    }

    private static float khaf(float f) {
        block0: {
            int n = trkh.thdt_2(-1160277979);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x2ADE5F30;
            if ((n2 ^ n) == 719216432) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9009CF15 ^ n, 5) - 1972220614) * -1878405355;
            int cfr_ignored_1 = (int)(0x52BB612827D4EB4FL ^ (long)n ^ 0x3F20831A2DB908A7L);
        }
        return bsn_2.rhk_2(f);
    }

    private static float dlk_2(float f, float f2, float f3) {
        block0: {
            int n = 93385831;
            n = Integer.rotateLeft(n * -1929777761, 4) ^ 0x251061DD;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0xEBF21947;
            if ((n2 ^ n) == -336455353) break block0;
            int cfr_ignored_0 = (0xEE62ED20 ^ n) + 2113563715;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float dwq_2(int n) {
        block0: {
            int n2 = 1035361196;
            n2 = Integer.rotateLeft(n2 * 1615235533, 8) ^ 0x626CAB17;
            int n3 = (n2 = n ^ n2) ^ 0x2CC03F06;
            if ((n3 ^ n2) == 750796550) break block0;
            int cfr_ignored_0 = (0x117664AA ^ n2) + -1275957427;
        }
        return Float.intBitsToFloat(n);
    }

    private static float jhd_3(int n) {
        block0: {
            int n2 = -780371189;
            int n3 = (n2 = Integer.rotateLeft(n2 * -2021678193, 18) ^ 0xA47288B6) ^ 0xD1198A08;
            if ((n3 ^ n2) == -786855416) break block0;
            int cfr_ignored_0 = (0x65F103 ^ n2) - 158092007;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dnb(float f, float f2, float f3) {
        block0: {
            int n = trkh.thdt_2(-1612810599);
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0xA907E9C4;
            if ((n2 ^ n) == -1459099196) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x36D99F5D ^ n, 9) - -1464341634) * 920231773;
            int cfr_ignored_1 = (int)(0xF46B316027D4EB4FL ^ (long)n ^ 0x9FB0831A2DB84507L);
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float thsw(class_1309 class_13092) {
        block0: {
            int n = 786943199;
            n = Integer.rotateLeft(n * 1732843099, 6) ^ 0x7F345738;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 22);
            int n2 = n ^ 0xC760F725;
            if ((n2 ^ n) == -949946587) break block0;
            int cfr_ignored_0 = (0xE9873BFA ^ n) + -115335215;
        }
        return class_13092.method_17682();
    }

    private static int tdk_2(int n, int n2) {
        block0: {
            int n3 = -814024471;
            int n4 = (n3 = Integer.rotateLeft(n3 * -1444656543, 23) ^ 0x73D3F693) ^ 0x6BB5F3F6;
            if ((n4 ^ n3) == 1807086582) break block0;
            int cfr_ignored_0 = (0xA4CF0B1F ^ n3) + -261253146;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float bshz(int n) {
        block0: {
            int n2 = 102322740;
            n2 = Integer.rotateLeft(n2 * 616231541, 16) ^ 0x54810A67;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 2)) ^ 0xCCD02A6B;
            if ((n3 ^ n2) == -858772885) break block0;
            int cfr_ignored_0 = (0xCAC9785F ^ n2) + 1119675981;
        }
        return Float.intBitsToFloat(n);
    }

    private static String[] bhd(String string) {
        block0: {
            int n = 100096668;
            n = Integer.rotateLeft(n * 1966558609, 3) ^ 0x90FD9241;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
            int n2 = n ^ 0x837B9587;
            if ((n2 ^ n) == -2089052793) break block0;
            int cfr_ignored_0 = (0x868CCF1B ^ n) - 166955774;
        }
        return string.split("\b\u0014", -1);
    }

    private static CallSite thys(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1679456068;
            n3 = Integer.rotateLeft(n3 * -1808624781, 20) ^ 0x6CE80D9F;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            String string3 = string2;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 25);
            int n4 = n3 ^ 0x16FE6FC4;
            if ((n4 ^ n3) != 385773508) {
                int cfr_ignored_0 = (0x72E41880 ^ n3) + 1425504898;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ baw_2 ^ string.hashCode()) + (n2 + shzdh) + i ^ baw_2, 17) + shzdh);
            }
            String[] stringArray = bsn_2.bhd(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] t6me6sawzj1(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ywqvvv8omki8n(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ hota3tih5bxe ^ string.hashCode() ^ n2 + ayd9ovb3ig7 ^ i * 1153098665 ^ hota3tih5bxe, 22) ^ ayd9ovb3ig7));
            }
            String[] stringArray = bsn_2.t6me6sawzj1(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

