/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1268
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1735
 *  net.minecraft.class_1738
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2868
 *  net.minecraft.class_287
 *  net.minecraft.class_2886
 *  net.minecraft.class_4587
 *  net.minecraft.class_634
 *  net.minecraft.class_746
 *  net.minecraft.class_8051
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1735;
import net.minecraft.class_1738;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2868;
import net.minecraft.class_287;
import net.minecraft.class_2886;
import net.minecraft.class_4587;
import net.minecraft.class_634;
import net.minecraft.class_746;
import net.minecraft.class_8051;
import us.m0vy.moondlc.m0vyguard.bdkh;
import us.m0vy.moondlc.m0vyguard.bdt_4;
import us.m0vy.moondlc.m0vyguard.bqb;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.ttt_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.trh;
import us.m0vy.moondlc.m0vyguard.tzd_2;
import us.m0vy.moondlc.m0vyguard.tth_8;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yn;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.ClientPlayerInteractionManagerAccessor;
import us.movy.moondlc.utility.mixins.ArmorItemAddition;

public final class blt_2
implements tthy {
    private static class_243 jwm;
    private static final tkhd_2 za_3;
    private static final int dhjq = 2024865294;
    private static final int khtd_4 = -918265191;
    private static final int hkz = -2066708056;
    private static final int bdhb = 695740826;
    private static final int cs1aketnhyi = -810330433;
    private static final int upiirymy = -177522762;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int t9xu8f9sf6;

    public static void dhkh_7(boolean bl) {
        ttt_2 ttt2;
        int n = -1375090101;
        n = Integer.rotateLeft(n * 1219572073, 6) ^ 0xBDC465DD;
        int n2 = (n = Integer.rotateRight(bl ^ n, 10)) ^ 0x26092281;
        if ((n2 ^ n) != 638132865) {
            int cfr_ignored_0 = (0x8800E8CA ^ n) - 354323589;
        }
        bdt_4 bdt2 = blt_2.zadh();
        ttt_2 ttt3 = ttt2 = bl ? (ttt_2)blt_2.sqj(bdt2, blt_2::thsk_2) : (ttt_2)blt_2.wkh(bdt2, class_1802.field_8833);
        if (ttt2 != null) {
            ttt_2 ttt4 = blt_2.trth_2();
            blt_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2868(blt_2.jlr(ttt2)));
            yn.zthb(ttt2);
            blt_2.mc.field_1761.method_2919((class_1657)blt_2.mc.field_1724, class_1268.field_5808);
            ((class_1735)blt_2.mc.field_1724.field_7512.field_7761.get(Integer.rotateLeft(0x769E331B ^ 0x769E3F1B, 23))).method_53512(new class_1799((class_1935)(bl ? class_1802.field_22028 : class_1802.field_8833)));
            yn.zthb(ttt4);
            blt_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2868(blt_2.mc.field_1724.method_31548().field_7545));
        }
    }

    public static void hwk(class_4587 class_45872, class_287 class_2872, class_238 class_2383, byq byq2) {
        tth_8.zsz_6(class_45872, class_2872, class_2383, byq2);
        tth_8.jqz(class_45872, class_2872, class_2383, byq2);
    }

    public static boolean khdb() {
        block0: {
            int n = bqb.hys_2(-1901625971);
            int n2 = n ^ 0x85F9F3FD;
            if ((n2 ^ n) == -2047216643) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB5E8E70 ^ n, 4) + 1691410123) * 190746225;
        }
        return false;
    }

    public static void khyn(float f) {
        bdt_4 bdt2;
        ttt_2 ttt2;
        int n = -1244598424;
        int n2 = (n = Integer.rotateLeft(n * 1446188065, 26) ^ 0x3EC1088A) ^ 0xD372EDDE;
        if ((n2 ^ n) != -747442722) {
            int cfr_ignored_0 = (0x66A202B6 ^ n) + 895341690;
        }
        if ((ttt2 = (ttt_2)(bdt2 = bdkh.dhyd()).tbt_2(class_1802.field_8639)) != null) {
            Object var3_5 = null;
            lb lb2 = Moondlc.getInstance().getRotationHandler().dhdf();
            lb lb3 = lb2 != null ? lb2 : new lb(blt_2.mc.field_1724.method_36454(), blt_2.ssm(blt_2.mc.field_1724));
            blt_2.dtf_2(blt_2.mc.field_1724.field_3944, (class_2596)new class_2868(blt_2.thshd(ttt2)));
            ((ClientPlayerInteractionManagerAccessor)blt_2.mc.field_1761).invokeSendSequencedPacket(blt_2.mc.field_1687, arg_0 -> blt_2.shhy_2(lb3, arg_0));
            blt_2.tza(blt_2.mc.field_1724.field_3944, (class_2596)new class_2868(blt_2.dwn_2((class_746)blt_2.mc.field_1724).field_7545));
            blt_2.tyk(za_3);
        } else {
            bdt_4 bdt3 = bdkh.dhmth();
            trh trh2 = (trh)bdt3.tbt_2(class_1802.field_8639);
            if (trh2 != null) {
                blt_2.tbz_3(trh2.shd_5(), (int)(f - 1.0f));
                za_3.zat();
            }
        }
    }

    public static class_243 argh(class_1309 class_13092) {
        block0: {
            int n = 1135969024;
            n = Integer.rotateLeft(n * -1835297857, 14) ^ 0x47576969;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xFD4D19E9;
            if ((n2 ^ n) == -45278743) break block0;
            int cfr_ignored_0 = (0xBEF89AE9 ^ n) - 461146298;
        }
        return class_13092.method_19538();
    }

    public static class_243 dhtsh(class_1309 class_13092) {
        block0: {
            int n = -992781050;
            n = Integer.rotateLeft(n * 725474303, 26) ^ 0x2915E06A;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 20);
            int n2 = n ^ 0xC80A99CC;
            if ((n2 ^ n) == -938829364) break block0;
            int cfr_ignored_0 = (0xCD9C4CA ^ n) + 488810924;
        }
        return class_243.field_1353;
    }

    public static float[] shds(float f) {
        float f2;
        int n = bqb.hys_2(-1987905652);
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 10);
        int n2 = n ^ 0x264FE460;
        if ((n2 ^ n) != 642770016) {
            int cfr_ignored_0 = Integer.rotateLeft(0xAFCD13EC ^ n, 8) - 1311967439;
        }
        float f3 = f - f % Float.intBitsToFloat(1039609471 + 96260481);
        float f4 = f % Float.intBitsToFloat(-126133731 - -1262003683);
        if (f4 < 0.0f) {
            f4 += Float.intBitsToFloat(1048265170 + 87604782);
            f3 -= blt_2.thba(Integer.rotateLeft(0xC78D9ABA ^ 0xC789A1FA, 12));
        }
        if ((f2 = (float)Math.round(f4 / blt_2.dhry(blt_2.hzh_3(1817396869) ^ 0xE356CA36)) * Float.intBitsToFloat(-782845358 - -1893549486)) % Float.intBitsToFloat(blt_2.jdl(0x954400F4 ^ 0x9554ADF4, 10)) == 0.0f) {
            float f5 = (f2 - Float.intBitsToFloat(-396722893 + 1507427021)) % Float.intBitsToFloat(-745408293 + 1881278245);
            float f6 = (f2 + Float.intBitsToFloat(0xEA7FBE43 ^ 0xA84BBE43)) % Float.intBitsToFloat(0xB4CBEA8D ^ 0xF77FEA8D);
            var4_8 = f5 < f4 ? f5 : f5 - Float.intBitsToFloat(1246452789 + -135748661);
            var5_9 = f6 > f4 ? f6 : f6 + Float.intBitsToFloat(1762225877 + -651521749);
        } else if (f2 < f4) {
            var4_8 = f2;
            var5_9 = f2 + blt_2.dzb(274079235 + 845013501);
        } else {
            var4_8 = f2 - Float.intBitsToFloat(Integer.rotateLeft(0x9D9683F ^ 0x8D3B83F, 6));
            var5_9 = f2;
        }
        return new float[]{var4_8 += f3, var5_9 += f3};
    }

    @Generated
    private blt_2() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    @Generated
    public static void tzq_3(class_243 class_2432) {
        int n = 0x4445585;
        int n2 = (n = Integer.rotateLeft(n * -1519971665, 7) ^ 0xC938759F) ^ 0x3349B4B;
        if ((n2 ^ n) != 53779275) {
            int cfr_ignored_0 = (0x770CECE ^ n) + 1768687807;
        }
        jwm = class_2432;
    }

    @Generated
    public static tkhd_2 khtm() {
        block0: {
            int n = bqb.hys_2(-1739352003);
            int n2 = n ^ 0x5BE4524;
            if ((n2 ^ n) == 96355620) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9DEDDD19 ^ n, 6) + 606823746) * -1645355751;
            int cfr_ignored_1 = (int)(0x5F5F732427D4EB4FL ^ (long)n ^ 0x1B38831A2DB9136FL);
        }
        return za_3;
    }

    private static class_2596 shhy_2(lb lb2, int n) {
        int n2 = bqb.hys_2(365967263);
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 12)) ^ 0x4225DEF8;
        if ((n3 ^ n2) != 1109778168) {
            int cfr_ignored_0 = Integer.rotateRight(0x57F5E967 ^ n2, 13) - -1423646028;
        }
        return new class_2886(class_1268.field_5808, n, lb2.sry(), lb2.khdhd_2());
    }

    private static boolean thsk_2(class_1799 class_17992) {
        class_1738 class_17382;
        class_1792 class_17922;
        int n = bqb.hys_2(162516924);
        int n2 = n ^ 0xD4992780;
        if ((n2 ^ n) != -728160384) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xDD36E83C ^ n, 14) - -838615425) * -583604163;
        }
        return (class_17922 = class_17992.method_7909()) instanceof class_1738 && ((ArmorItemAddition)(class_17382 = (class_1738)class_17922)).moondlc$getType() == class_8051.field_41935;
    }

    private static String rjkh(String string, int n, int n2, int n3) {
        int n4 = -2100737183;
        n4 = Integer.rotateLeft(n4 * 755027761, 18) ^ 0xB8061277;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 7);
        int n5 = (n4 = n2 ^ n4) ^ 0xDD91AFCD;
        if ((n5 ^ n4) != -577654835) {
            int cfr_ignored_0 = (0x5F58E4AC ^ n4) - 12821574;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x5FE1AAE) + i ^ dhjq, 15) ^ n2 + khtd_4));
        }
        return new String(cArray);
    }

    private static bdt_4 zadh() {
        block0: {
            int n = bqb.hys_2(-1333160725);
            int n2 = n ^ 0x34EF4175;
            if ((n2 ^ n) == 888095093) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8466D59E ^ n, 3) - 215055709) * -2073635425;
        }
        return bdkh.dhyd();
    }

    private static tzd_2 sqj(bdt_4 bdt2, Predicate predicate) {
        block0: {
            int n = bqb.hys_2(1969850387);
            int n2 = n ^ 0xA76F9A92;
            if ((n2 ^ n) == -1485858158) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD2061281 ^ n, 13) + 1931074778;
            int cfr_ignored_1 = (int)(0x10B4BCBC27D4EB4FL ^ (long)n ^ 0x8408831A2DB98CB8L);
        }
        return bdt2.dhjt_2(predicate);
    }

    private static tzd_2 wkh(bdt_4 bdt2, class_1792 class_17922) {
        block0: {
            int n = 1785700634;
            n = Integer.rotateLeft(n * 1268247903, 3) ^ 0xF64C6060;
            bdt_4 bdt3 = bdt2;
            n = Integer.rotateLeft((bdt3 != null ? System.identityHashCode(bdt3) : 0) ^ n, 10);
            int n2 = n ^ 0x2FCD673E;
            if ((n2 ^ n) == 801990462) break block0;
            int cfr_ignored_0 = (0x45A2C624 ^ n) - -1113184920;
        }
        return bdt2.tbt_2(class_17922);
    }

    private static ttt_2 trth_2() {
        block0: {
            int n = -638946040;
            int n2 = (n = Integer.rotateLeft(n * -1515729015, 6) ^ 0x8C2118CE) ^ 0xB6F9CFC2;
            if ((n2 ^ n) == -1225142334) break block0;
            int cfr_ignored_0 = (0x6F13BACA ^ n) + -1007375162;
        }
        return yn.dzz_8();
    }

    private static int jlr(ttt_2 ttt2) {
        block0: {
            int n = -1031373956;
            n = Integer.rotateLeft(n * 677348565, 5) ^ 0x2AD81C9F;
            ttt_2 ttt3 = ttt2;
            n = Integer.rotateRight((ttt3 != null ? System.identityHashCode(ttt3) : 0) ^ n, 19);
            int n2 = n ^ 0xC1929E2E;
            if ((n2 ^ n) == -1047355858) break block0;
            int cfr_ignored_0 = (0x314E552 ^ n) - 516721167;
        }
        return ttt2.rdhh_2();
    }

    private static float ssm(class_746 class_7462) {
        block0: {
            int n = -790254998;
            int n2 = (n = Integer.rotateLeft(n * -2006953303, 25) ^ 0x89071CA2) ^ 0x71CFF3A8;
            if ((n2 ^ n) == 1909453736) break block0;
            int cfr_ignored_0 = (0xA12A59C2 ^ n) + 2021612746;
        }
        return class_7462.method_36455();
    }

    private static int thshd(ttt_2 ttt2) {
        block0: {
            int n = 255864119;
            n = Integer.rotateLeft(n * -721163569, 15) ^ 0xC683C509;
            ttt_2 ttt3 = ttt2;
            n = Integer.rotateRight((ttt3 != null ? System.identityHashCode(ttt3) : 0) ^ n, 24);
            int n2 = n ^ 0x29A5CBFA;
            if ((n2 ^ n) == 698731514) break block0;
            int cfr_ignored_0 = (0x26E5E6CD ^ n) + -1041124001;
        }
        return ttt2.rdhh_2();
    }

    private static void dtf_2(class_634 class_6342, class_2596 class_25962) {
        int n = -1452801793;
        n = Integer.rotateLeft(n * 1252347205, 8) ^ 0xC9D4FFE1;
        class_2596 class_25963 = class_25962;
        n = (class_25963 != null ? System.identityHashCode(class_25963) : 0) ^ n;
        int n2 = n ^ 0xAED38394;
        if ((n2 ^ n) != -1361869932) {
            int cfr_ignored_0 = (0x7BB836B ^ n) - -999256588;
        }
        class_6342.method_52787(class_25962);
    }

    private static class_1661 dwn_2(class_746 class_7462) {
        block0: {
            int n = 1828198580;
            int n2 = (n = Integer.rotateLeft(n * -793732481, 11) ^ 0x7393C878) ^ 0xA5C291C4;
            if ((n2 ^ n) == -1513975356) break block0;
            int cfr_ignored_0 = (0xC93A8970 ^ n) - -1666447622;
        }
        return class_7462.method_31548();
    }

    private static void tza(class_634 class_6342, class_2596 class_25962) {
        int n = -544326293;
        int n2 = (n = Integer.rotateLeft(n * -1356940005, 17) ^ 0x10512DCA) ^ 0xBB56F810;
        if ((n2 ^ n) != -1151928304) {
            int cfr_ignored_0 = (0x64D8C57B ^ n) + 374181783;
        }
        class_6342.method_52787(class_25962);
    }

    private static void tyk(tkhd_2 tkhd2_2) {
        int n = -93079338;
        n = Integer.rotateLeft(n * -1959917117, 15) ^ 0x1981076C;
        tkhd_2 tkhd3 = tkhd2_2;
        n = Integer.rotateLeft((tkhd3 != null ? System.identityHashCode(tkhd3) : 0) ^ n, 6);
        int n2 = n ^ 0x33F8B909;
        if ((n2 ^ n) != 871938313) {
            int cfr_ignored_0 = (0xC98B01DF ^ n) - 191009922;
        }
        tkhd2_2.zat();
    }

    private static void tbz_3(int n, int n2) {
        int n3 = 1976708730;
        n3 = Integer.rotateLeft(n3 * 1305552393, 10) ^ 0x78DE96AC;
        int n4 = (n3 = n ^ n3) ^ 0xBDD0F49C;
        if ((n4 ^ n3) != -1110379364) {
            int cfr_ignored_0 = (0xC802DAE6 ^ n3) - -968069603;
        }
        yn.thmsh(n, n2);
    }

    private static float thba(int n) {
        block0: {
            int n2 = -168693535;
            n2 = Integer.rotateLeft(n2 * -1668905247, 13) ^ 0x6C7A83E0;
            int n3 = (n2 = n ^ n2) ^ 0x4F6E5A7E;
            if ((n3 ^ n2) == 1332632190) break block0;
            int cfr_ignored_0 = (0xBA9FAA9F ^ n2) + -2128162968;
        }
        return Float.intBitsToFloat(n);
    }

    private static int hzh_3(int n) {
        block0: {
            int n2 = -236493229;
            n2 = Integer.rotateLeft(n2 * 863287225, 14) ^ 0x8DA1172B;
            int n3 = (n2 = n ^ n2) ^ 0x832476A;
            if ((n3 ^ n2) == 137512810) break block0;
            int cfr_ignored_0 = (0xF9D52139 ^ n2) + 1738454955;
        }
        return Integer.reverse(n);
    }

    private static float dhry(int n) {
        block0: {
            int n2 = -1405490594;
            n2 = Integer.rotateLeft(n2 * 931222325, 18) ^ 0x7B4CE154;
            int n3 = (n2 = n ^ n2) ^ 0xE2DD885;
            if ((n3 ^ n2) == 237885573) break block0;
            int cfr_ignored_0 = (0xA21432DB ^ n2) - -306867949;
        }
        return Float.intBitsToFloat(n);
    }

    private static int jdl(int n, int n2) {
        block0: {
            int n3 = 1056763667;
            n3 = Integer.rotateLeft(n3 * -1063753081, 25) ^ 0xC036A022;
            int n4 = (n3 = n ^ n3) ^ 0x8C2ED635;
            if ((n4 ^ n3) == -1943087563) break block0;
            int cfr_ignored_0 = (0xB2D23926 ^ n3) + -1748867458;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float dzb(int n) {
        block0: {
            int n2 = 181425192;
            n2 = Integer.rotateLeft(n2 * 1079600055, 13) ^ 0x542DEF36;
            int n3 = (n2 = n ^ n2) ^ 0xB42370D3;
            if ((n3 ^ n2) == -1272745773) break block0;
            int cfr_ignored_0 = (0xBEF324FB ^ n2) - 674896766;
        }
        return Float.intBitsToFloat(n);
    }

    private static String[] ddj_2(String string) {
        int n = 93857869;
        n = Integer.rotateLeft(n * -1009110959, 15) ^ 0xD99C947F;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 18);
        int n2 = n ^ 0xB5DAE2C3;
        if ((n2 ^ n) != -1243946301) {
            int cfr_ignored_0 = (0xB042CA8E ^ n) - -697822874;
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

    private static CallSite thlth(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1887945854;
            n3 = Integer.rotateLeft(n3 * -921141101, 4) ^ 0x4118F95F;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 24);
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            int n4 = n3 ^ 0xF687DB76;
            if ((n4 ^ n3) != -158868618) {
                int cfr_ignored_0 = (0x79FFE0F4 ^ n3) + 1883239035;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hkz ^ string.hashCode()) + (n2 + bdhb) + i ^ hkz, 5) + bdhb);
            }
            String[] stringArray = blt_2.ddj_2(new String(cArray));
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

    private static String[] qlr6jc1e(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ogdklxx5law3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ cs1aketnhyi ^ string.hashCode()) + (n2 + upiirymy) + i ^ cs1aketnhyi, 14) + upiirymy);
            }
            String[] stringArray = blt_2.qlr6jc1e(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

