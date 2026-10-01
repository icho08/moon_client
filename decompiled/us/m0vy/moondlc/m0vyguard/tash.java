/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2374
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_310;
import us.m0vy.moondlc.m0vyguard.shz_5;
import us.m0vy.moondlc.m0vyguard.yf;

public final class tash {
    private static final class_310 mc;
    public static final class_2382[] dhqn;
    private static final int sds_5 = 1350483894;
    private static final int jnth = 2035492431;
    private static final int ygn2wrm = -20140273;
    private static final int g7e4m29ijqjr0 = 1054686424;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int kal6pub5j;

    public static List ghshk(class_243 class_2432) {
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d = class_2432.method_10216() - Math.floor(class_2432.method_10216());
        double d2 = class_2432.method_10215() - Math.floor(class_2432.method_10215());
        int n = tash.zht_6(d);
        int n2 = tash.zht_6(d2);
        arrayList.add(tash.dkh_4(class_2432));
        for (int i = 0; i <= Math.abs(n); ++i) {
            for (int j = 0; j <= Math.abs(n2); ++j) {
                int n3 = i * n;
                int n4 = j * n2;
                arrayList.add(Objects.requireNonNull(tash.dkh_4(class_2432)).method_10069(n3, 0, n4));
            }
        }
        return arrayList;
    }

    public static List snq(class_243 class_2432) {
        int n;
        class_2338 class_23382 = class_2338.method_49638((class_2374)class_2432);
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d = Math.abs(class_2432.method_10216()) - Math.floor(Math.abs(class_2432.method_10216()));
        double d2 = Math.abs(class_2432.method_10215()) - Math.floor(Math.abs(class_2432.method_10215()));
        int n2 = tash.badh(d, false);
        int n3 = tash.badh(d, true);
        int n4 = tash.badh(d2, false);
        int n5 = tash.badh(d2, true);
        for (n = 1; n < n2 + 1; ++n) {
            arrayList.add(tash.shfr(class_23382, n, 0.0, 1 + n4));
            arrayList.add(tash.shfr(class_23382, n, 0.0, -(1 + n5)));
        }
        for (n = 0; n <= n3; ++n) {
            arrayList.add(tash.shfr(class_23382, -n, 0.0, 1 + n4));
            arrayList.add(tash.shfr(class_23382, -n, 0.0, -(1 + n5)));
        }
        for (n = 1; n < n4 + 1; ++n) {
            arrayList.add(tash.shfr(class_23382, 1 + n2, 0.0, n));
            arrayList.add(tash.shfr(class_23382, -(1 + n3), 0.0, n));
        }
        for (n = 0; n <= n5; ++n) {
            arrayList.add(tash.shfr(class_23382, 1 + n2, 0.0, -n));
            arrayList.add(tash.shfr(class_23382, -(1 + n3), 0.0, -n));
        }
        return arrayList;
    }

    private static class_2338 dkh_4(class_243 class_2432) {
        try {
            int n = -438738886;
            n = Integer.rotateLeft(n * 803814753, 7) ^ 0x8BDF1396;
            int n2 = n ^ 0x881FF1FD;
            if ((n2 ^ n) != -2011172355) {
                int cfr_ignored_0 = (0x6DC691C7 ^ n) + -1231833318;
            }
            if ((0xD7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return class_2338.method_49637((double)class_2432.method_10216(), (double)(class_2432.method_10214() - Math.floor(class_2432.method_10214()) > Double.longBitsToDouble(0xACB605CC5C514319L ^ 0x935F9C55C5C8DA83L) ? Math.floor(class_2432.method_10214()) + 1.0 : Math.floor(class_2432.method_10214())), (double)class_2432.method_10215());
    }

    public static int zht_6(double d) {
        int n;
        block4: {
            try {
                int n2 = -1330486167;
                n2 = Integer.rotateLeft(n2 * 600704271, 26) ^ 0xF811E6C6;
                int n3 = n2 ^ 0xE5362DC9;
                if ((n3 ^ n2) != -449434167) {
                    int cfr_ignored_0 = (0x558449A0 ^ n2) + 298513585;
                }
                if ((0x66 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = d >= Double.longBitsToDouble(0x15C2C4A8D96B5FDDL ^ 0x2A24A2CEBF0D39BBL) ? 1 : (d <= Double.longBitsToDouble(0xFB2ACDA1189CB15CL ^ 0xC4F9FE922BAF826FL) ? -1 : 0);
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0xFBE4;
        }
        return n;
    }

    public static int badh(double d, boolean bl) {
        int n = shz_5.hmt(1668744383);
        int n2 = (n = Integer.rotateLeft(bl ^ n, 15)) ^ 0xD3CDDDBC;
        if ((n2 ^ n) != -741483076) {
            int cfr_ignored_0 = Integer.rotateRight(0xB0BAD903 ^ n, 9) + 1795024536;
        }
        if (bl) {
            return d <= Double.longBitsToDouble(0xF2ABDCF3BB32023AL ^ 0xCD78EFC088013109L) ? 1 : 0;
        }
        return d >= Double.longBitsToDouble(0xA66A8CB092860C9CL ^ 0x998CEAD6F4E06AFAL) ? 1 : 0;
    }

    /*
     * Unable to fully structure code
     */
    public static class_2338 shfr(class_2338 var0, double var1_1, double var3_2, double var5_3) {
        var7_4 = null;
        var10_5 = 0;
        var8_6 = -1890195245;
        var8_6 = Integer.rotateLeft(var8_6 * 547292035, 18) ^ 1268004201;
        var8_6 = (int)Double.doubleToLongBits(var1_1) ^ var8_6;
        var8_6 = Integer.rotateLeft((int)Double.doubleToLongBits(var3_2) ^ var8_6, 2);
        var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321);
        while (true) {
            block68: {
                block58: {
                    block79: {
                        block78: {
                            block65: {
                                block80: {
                                    block60: {
                                        block64: {
                                            block67: {
                                                block74: {
                                                    block61: {
                                                        block72: {
                                                            block71: {
                                                                block59: {
                                                                    block69: {
                                                                        block77: {
                                                                            block70: {
                                                                                block63: {
                                                                                    block62: {
                                                                                        block75: {
                                                                                            block73: {
                                                                                                block76: {
                                                                                                    block66: {
                                                                                                        var10_5 = Integer.reverse(var9_7) ^ var8_6 ^ -1988858321;
                                                                                                        switch (var10_5 & 15) {
                                                                                                            case 0: {
                                                                                                                if (var10_5 != 344802640) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block58;
                                                                                                            }
                                                                                                            case 1: {
                                                                                                                if (var10_5 != 2008821313) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block59;
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                if (var10_5 != 1603673938) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block60;
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                if (var10_5 == -160439853) break block61;
                                                                                                                if (var10_5 != -1994175181) {
                                                                                                                    Integer.rotateLeft(-852695127 ^ var8_6, 12) + -590500686;
                                                                                                                    (int)(1125417857561455439L ^ (long)var8_6 ^ 7951249290582143725L);
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block62;
                                                                                                            }
                                                                                                            case 4: {
                                                                                                                if (var10_5 == -2086942492) break block63;
                                                                                                                if (var10_5 != -833540140) {
                                                                                                                    (Integer.rotateLeft(1684511536 ^ var8_6, 15) + 753494539) * 1684511537;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block64;
                                                                                                            }
                                                                                                            case 5: {
                                                                                                                if (var10_5 == -462967019) break block65;
                                                                                                                if (var10_5 == 2030741077) break block66;
                                                                                                                if (var10_5 == 1875460533) break block67;
                                                                                                                if (var10_5 != 669708949) {
                                                                                                                    if (var10_5 == -178288267) break;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block68;
                                                                                                            }
                                                                                                            case 6: {
                                                                                                                if (var10_5 == 656207974) break block69;
                                                                                                                if (var10_5 == 1771208326) break block70;
                                                                                                                Integer.rotateLeft(-1220243484 ^ var8_6, 9) - 900402135;
                                                                                                                if (var10_5 != -623804090) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block71;
                                                                                                            }
                                                                                                            case 7: {
                                                                                                                if (var10_5 == -1193112153) break block72;
                                                                                                                if (var10_5 == -874513017) break block73;
                                                                                                                (Integer.rotateLeft(1275532856 ^ var8_6, 12) + 960057347) * 1275532857;
                                                                                                                if (var10_5 != 788124695) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block74;
                                                                                                            }
                                                                                                            case 10: {
                                                                                                                if (var10_5 != -1747472614) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block75;
                                                                                                            }
                                                                                                            case 11: {
                                                                                                                if (var10_5 == -913815253) break block76;
                                                                                                                if (var10_5 != -1664694677) {
                                                                                                                    Integer.rotateLeft(1920153828 ^ var8_6, 17) - -531529001;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block77;
                                                                                                            }
                                                                                                            case 13: {
                                                                                                                if (var10_5 != -506477219) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block78;
                                                                                                            }
                                                                                                            case 15: {
                                                                                                                if (var10_5 == -821746033) break block79;
                                                                                                                if (var10_5 != -947809857) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block80;
                                                                                                            }
                                                                                                        }
                                                                                                        (Integer.rotateRight(-867571181 ^ var8_6, 12) + -1051658360) * -867571181;
                                                                                                        var1_1 = -var1_1;
                                                                                                        try {
                                                                                                            var10_5 += 3;
                                                                                                            if ((6926645500950178879L ^ (long)var8_6 | 1L) == 0L) {
                                                                                                                throw new IllegalStateException();
                                                                                                            }
                                                                                                            var9_7 = (int)((long)Integer.reverse(var8_6 ^ -913815253 ^ -1988858321) ^ -3591531297023131425L ^ -3591531297023131425L);
                                                                                                        }
                                                                                                        catch (IllegalStateException v0) {
                                                                                                            var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ -913815253 ^ -1988858321)));
                                                                                                        }
                                                                                                        ++var10_5;
                                                                                                        continue;
                                                                                                    }
                                                                                                    Integer.rotateLeft(-847523668 ^ var8_6, 12) - -430185457;
                                                                                                    tash.dll_2();
                                                                                                    throw null;
                                                                                                }
                                                                                                Integer.rotateRight(-1400061470 ^ var8_6, 8) + -378988135;
                                                                                                if (var0.method_10264() >= 0) {
                                                                                                    var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 1771208326 ^ -1988858321)));
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    var10_5 += 4;
                                                                                                    if ((6606449203508156159L ^ (long)var8_6 | 1L) == 0L) {
                                                                                                        throw new ArithmeticException();
                                                                                                    }
                                                                                                    var9_7 = Integer.reverse(var8_6 ^ -874513017 ^ -1988858321);
                                                                                                }
                                                                                                catch (ArithmeticException v1) {
                                                                                                    var9_7 = Integer.reverse(var8_6 ^ -874513017 ^ -1988858321) ^ -275767487 ^ -275767487;
                                                                                                }
                                                                                                var10_5 += 4;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateLeft(577825260 ^ var8_6, 7) - 805958351;
                                                                                            var3_2 = -var3_2;
                                                                                            try {
                                                                                                var10_5 += 3;
                                                                                                var9_7 = Integer.reverse(var8_6 ^ 1771208326 ^ -1988858321) + 1492292733 - 1492292733;
                                                                                            }
                                                                                            catch (ArithmeticException v2) {
                                                                                                var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 1771208326 ^ -1988858321)));
                                                                                            }
                                                                                            ++var10_5;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateLeft(855318973 ^ var8_6, 9) - 818328862) * 855318973;
                                                                                        (int)(-1132216050720117937L ^ (long)var8_6 ^ -2130058475286803134L);
                                                                                        var3_2 = -var3_2;
                                                                                        var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 1771208326 ^ -1988858321)));
                                                                                        continue;
                                                                                    }
                                                                                    shz_5.jmt_2(-1605607200, var8_6);
                                                                                    (int)(4502220124665314325L ^ (long)var8_6 ^ -3476160819240251097L);
                                                                                    if (!yf.khdha_2()) {
                                                                                        var9_7 = (int)((long)Integer.reverse(var8_6 ^ 774754232 ^ -1988858321) ^ 195661562501830364L ^ 195661562501830364L);
                                                                                        Integer.rotateLeft(-325771896 ^ var8_6, 16) + -1435749709;
                                                                                        var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 2030741077 ^ -1988858321)));
                                                                                        var10_5 -= 4;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        var10_5 -= 5;
                                                                                        if ((-3955942517071912865L ^ (long)var8_6 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        var9_7 = Integer.reverse(var8_6 ^ 656207974 ^ -1988858321) ^ -1598676505 ^ -1598676505;
                                                                                    }
                                                                                    catch (UnsupportedOperationException v3) {
                                                                                        var9_7 = Integer.reverse(var8_6 ^ 656207974 ^ -1988858321) ^ -319661236 ^ -319661236;
                                                                                    }
                                                                                    var10_5 += 4;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(1947761087 ^ var8_6, 17) - 324296028) * 1947761087;
                                                                                var5_3 = -var5_3;
                                                                                var9_7 = Integer.reverse(var8_6 ^ -1664694677 ^ -1988858321) + 124827270 - 124827270;
                                                                                (Integer.rotateLeft(339996948 ^ var8_6, 5) - 2023215271) * 339996949;
                                                                                var10_5 -= 2;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateRight(444277683 ^ var8_6, 6) + 960950760) * 444277683;
                                                                            if (tash.dsb_3(var0) < 0) {
                                                                                try {
                                                                                    var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ -2086942492 ^ -1988858321)));
                                                                                }
                                                                                catch (ArithmeticException v4) {
                                                                                    var9_7 = Integer.reverse(var8_6 ^ -2086942492 ^ -1988858321) + 1198212031 - 1198212031;
                                                                                }
                                                                                var10_5 += 5;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                var9_7 = Integer.reverse(var8_6 ^ -1664694677 ^ -1988858321) + 1550304082 - 1550304082;
                                                                            }
                                                                            catch (UnsupportedOperationException v5) {
                                                                                var9_7 = Integer.reverse(var8_6 ^ -1664694677 ^ -1988858321);
                                                                            }
                                                                            var10_5 += 2;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateRight(1409500150 ^ var8_6, 13) - 818076165) * 1409500151;
                                                                        var7_4 = tash.szl(var0, (class_2382)tash.yl(var1_1, var3_2, var5_3));
                                                                        var9_7 = Integer.reverse(var8_6 ^ 669708949 ^ -1988858321) + 1582392494 - 1582392494;
                                                                        Integer.rotateLeft(-563034259 ^ var8_6, 14) - -200948370;
                                                                        (int)(2072334571530414927L ^ (long)var8_6 ^ 3445397863397954645L);
                                                                        var10_5 += 2;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateLeft(1794629621 ^ var8_6, 16) - -127812122) * 1794629621;
                                                                    (int)(-6321521397468959921L ^ (long)var8_6 ^ 2224922364380511579L);
                                                                    if (var0.method_10263() >= 0) {
                                                                        var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 1116030348 ^ -1988858321)));
                                                                        (Integer.rotateRight(2032486075 ^ var8_6, 18) + -1344196640) * 2032486075;
                                                                        var9_7 = (int)((long)Integer.reverse(var8_6 ^ -913815253 ^ -1988858321) ^ -5825140962685438862L ^ -5825140962685438862L);
                                                                        var10_5 += 4;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        ++var10_5;
                                                                        if ((4425349104590832315L ^ (long)var8_6 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        var9_7 = Integer.reverse(var8_6 ^ -178288267 ^ -1988858321);
                                                                    }
                                                                    catch (IllegalArgumentException v6) {
                                                                        var9_7 = Integer.reverse(var8_6 ^ -178288267 ^ -1988858321);
                                                                    }
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(1909755690 ^ var8_6, 17) + -853871279;
                                                                try {
                                                                    var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ 1075504842 ^ 1075504842;
                                                                }
                                                                catch (IllegalStateException v7) {
                                                                    var9_7 = (int)((long)Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ -2856430005233243359L ^ -2856430005233243359L);
                                                                }
                                                                var10_5 += 2;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(-390872858 ^ var8_6, 16) - 841087765;
                                                            var9_7 = Integer.reverse(var8_6 ^ 1002177519 ^ -1988858321) ^ -946929159 ^ -946929159;
                                                            Integer.rotateRight(1896364867 ^ var8_6, 17) + -1268986792;
                                                            (int)(-2207433914451348133L ^ (long)var8_6 ^ -4582004394650734742L);
                                                            var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 61153467 ^ -1988858321)));
                                                            (int)(3946971124156273975L ^ (long)var8_6 ^ 1717675403638325341L);
                                                            var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ -287798787 ^ -287798787;
                                                            --var10_5;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(1528076442 ^ var8_6, 14) + 198973921) * 1528076443;
                                                        var9_7 = Integer.reverse(var8_6 ^ -1979708162 ^ -1988858321) + -2061452408 - -2061452408;
                                                        Integer.rotateLeft(-1677032924 ^ var8_6, 6) - -375168617;
                                                        try {
                                                            var10_5 += 4;
                                                            if ((-8655489457784534765L ^ (long)var8_6 | 1L) == 0L) {
                                                                throw new UnsupportedOperationException();
                                                            }
                                                            var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) + -659711781 - -659711781;
                                                        }
                                                        catch (UnsupportedOperationException v8) {
                                                            var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321)));
                                                        }
                                                        ++var10_5;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(-1244534527 ^ var8_6, 9) + 147379802;
                                                    (int)(8602798036899654479L ^ (long)var8_6 ^ 8289019262634902295L);
                                                    var9_7 = Integer.reverse(var8_6 ^ 924363902 ^ -1988858321) ^ 893571439 ^ 893571439;
                                                    (Integer.rotateLeft(1328131836 ^ var8_6, 12) - -1704341569) * 1328131837;
                                                    (int)(-7199630335550719962L ^ (long)var8_6 ^ 8197960951747220986L);
                                                    var9_7 = Integer.reverse(var8_6 ^ -1240128124 ^ -1988858321) ^ 1956264051 ^ 1956264051;
                                                    (int)(-6412085646042878591L ^ (long)var8_6 ^ -7397319873130077226L);
                                                    var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ 1458890936 ^ 1458890936;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-548097607 ^ var8_6, 14) + 262087842) * -548097607;
                                                (int)(2154444124207770447L ^ (long)var8_6 ^ -4433649684686727651L);
                                                try {
                                                    --var10_5;
                                                    var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321)));
                                                }
                                                catch (IllegalStateException v9) {
                                                    var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321)));
                                                }
                                                continue;
                                            }
                                            Integer.rotateLeft(-1499568443 ^ var8_6, 7) - 831262998;
                                            (int)(7218365270913772367L ^ (long)var8_6 ^ 7818393101574694280L);
                                            var9_7 = Integer.reverse(var8_6 ^ 1482184193 ^ -1988858321) + 1712905248 - 1712905248;
                                            (Integer.rotateLeft(1591371228 ^ var8_6, 14) - -2133855009) * 1591371229;
                                            var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ -1675543442 ^ -1675543442;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1980570583 ^ var8_6, 4) + -1194901454;
                                        (int)(5422415401782143823L ^ (long)var8_6 ^ 7590961320392473425L);
                                        try {
                                            var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321)));
                                        }
                                        catch (IllegalStateException v10) {
                                            var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321);
                                        }
                                        var10_5 -= 5;
                                        continue;
                                    }
                                    Integer.rotateRight(-328627477 ^ var8_6, 16) + -1524272720;
                                    var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 244328557 ^ -1988858321)));
                                    Integer.rotateLeft(-850716119 ^ var8_6, 12) + -529151438;
                                    (int)(1151149178430483279L ^ (long)var8_6 ^ -7685248615648218590L);
                                    var9_7 = (int)((long)Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ -3571026807266752274L ^ -3571026807266752274L);
                                    (Integer.rotateLeft(1559336573 ^ var8_6, 14) - 1168037982) * 1559336573;
                                    (int)(-7042723544079996081L ^ (long)var8_6 ^ -8218925171491696297L);
                                    var10_5 += 3;
                                    continue;
                                }
                                Integer.rotateRight(-1878113490 ^ var8_6, 5) - 1981268429;
                                var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 478670153 ^ -1988858321)));
                                (Integer.rotateLeft(376238613 ^ var8_6, 5) - -1148260410) * 376238613;
                                (int)(-3107945365302351025L ^ (long)var8_6 ^ 4981125336331191405L);
                                (int)(1234530921820392389L ^ (long)var8_6 ^ 2583529197379882898L);
                                var9_7 = Integer.reverse(var8_6 ^ -161454095 ^ -1988858321);
                                (int)(-1447053151659704670L ^ (long)var8_6 ^ -1380822921028404729L);
                                var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321);
                                var10_5 += 2;
                                continue;
                            }
                            Integer.rotateLeft(1295758028 ^ var8_6, 12) - 1587037679;
                            var9_7 = Integer.reverse(var8_6 ^ -2018540487 ^ -1988858321) + -766354081 - -766354081;
                            Integer.rotateRight(1783078695 ^ var8_6, 16) - -485890828;
                            (int)(-5755301746811423180L ^ (long)var8_6 ^ -2131486240903606893L);
                            var9_7 = (int)((long)Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ -3696322866654429053L ^ -3696322866654429053L);
                            var10_5 += 5;
                            continue;
                        }
                        (Integer.rotateRight(-240647974 ^ var8_6, 17) + 1203091873) * -240647973;
                        var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) + -1834193916 - -1834193916;
                        continue;
                    }
                    (Integer.rotateLeft(-1506042539 ^ var8_6, 7) - 630566022) * -1506042539;
                    (int)(7244377998040034127L ^ (long)var8_6 ^ -7232636853097503549L);
                    var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ -1920966873 ^ -1920966873;
                    Integer.rotateRight(1113704675 ^ var8_6, 11) + 238351032;
                    continue;
                }
                Integer.rotateLeft(1509090700 ^ var8_6, 14) - -389584081;
                var9_7 = (int)((long)Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321) ^ 3245782187831031322L ^ 3245782187831031322L);
                continue;
            }
            return var7_4;
lbl370:
            // 13 sources

            Integer.rotateRight(-1780380689 ^ var8_6, 5) - 716017964;
            var9_7 = Integer.reverse(var8_6 ^ -1994175181 ^ -1988858321);
        }
    }

    public static boolean sdw_4(class_2338 class_23382) {
        return tash.zhk_2(class_23382) || tash.hqb(class_23382) || tash.tbd_4(class_23382) || tash.jhq_2(class_23382) || tash.khath(class_23382);
    }

    public static boolean zhk_2(class_2338 class_23382) {
        return tash.hdhh_2(class_23382) || tash.dzdh(class_23382);
    }

    public static boolean hdhh_2(class_2338 class_23382) {
        int n = -237679026;
        n = Integer.rotateLeft(n * -750260457, 4) ^ 0x5A131DC6;
        class_2338 class_23383 = class_23382;
        n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
        int n2 = n ^ 0x86F245C2;
        if ((n2 ^ n) != -2030942782) {
            int cfr_ignored_0 = (0x77270B8C ^ n) + 1799583431;
        }
        return !(tash.dzdh(class_23382) || !tash.dd_2(class_23382.method_10069(0, -1, 0)) && !tash.khlw(tash.tdt_3(class_23382, 0, -1, 0)) || !tash.zmr_2(class_23382.method_10069(1, 0, 0)) && !tash.khlw(class_23382.method_10069(1, 0, 0)) || !tash.thdj_2(class_23382.method_10069(-1, 0, 0)) && !tash.khlw(tash.zzb(class_23382, -1, 0, 0)) || !tash.thdj_2(class_23382.method_10069(0, 0, 1)) && !tash.khdy(class_23382.method_10069(0, 0, 1)) || !tash.ajk(class_23382.method_10069(0, 0, -1)) && !tash.sghh_2(tash.bghw(class_23382, 0, 0, -1)) || !tash.khyt_2(class_23382) || !tash.shzsh(class_23382.method_10069(0, 1, 0)) || !tash.dhdhh_2(class_23382.method_10069(0, 2, 0)));
    }

    public static boolean dzdh(class_2338 class_23382) {
        int n = shz_5.hmt(1132504060);
        class_2338 class_23383 = class_23382;
        n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 5);
        int n2 = n ^ 0xCBA2C681;
        if ((n2 ^ n) != -878524799) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x8822657D ^ n, 4) - -2138576546) * -2011011715;
            int cfr_ignored_1 = (int)(0x4A90CB4027D4EB4FL ^ (long)n ^ 0x6BF0831A2DB938F0L);
        }
        return tash.zkm(tash.amz_2(class_23382, 0, -1, 0)) && tash.khlw(class_23382.method_10069(1, 0, 0)) && tash.rqd_2(class_23382.method_10069(-1, 0, 0)) && tash.khlw(class_23382.method_10069(0, 0, 1)) && tash.khlw(class_23382.method_10069(0, 0, -1)) && tash.dhdhh_2(class_23382) && tash.dhdhh_2(class_23382.method_10069(0, 1, 0)) && tash.ghjh(class_23382.method_10069(0, 2, 0));
    }

    public static boolean tbd_4(class_2338 class_23382) {
        class_2338[] class_2338Array;
        int n = -1702862955;
        int n2 = (n = Integer.rotateLeft(n * -1327815309, 20) ^ 0x2A113BAF) ^ 0x7778B76A;
        if ((n2 ^ n) != 2004399978) {
            int cfr_ignored_0 = (0xEDF8E8FF ^ n) + 790845840;
        }
        if (!tash.tzn_2(class_23382)) {
            return false;
        }
        class_2382 class_23822 = tash.znd_2(class_23382);
        if (class_23822 == null) {
            return false;
        }
        for (class_2338 class_23383 : class_2338Array = new class_2338[]{class_23382, class_23382.method_10081(class_23822)}) {
            if (!tash.hshy(tash.rths_2(class_23383, 0, 1, 0)) || !tash.swj(class_23383.method_10069(0, 2, 0))) {
                return false;
            }
            class_2338 class_23384 = tash.drt_2(class_23383);
            if (!tash.zfh(class_23384)) {
                return false;
            }
            for (class_2382 class_23823 : dhqn) {
                class_2338 class_23385 = class_23383.method_10081(class_23823);
                if (tash.khlw(class_23385) || class_23385.equals((Object)class_23382) || class_23385.equals((Object)class_23382.method_10081(class_23822))) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean hqb(class_2338 class_23382) {
        int n = 82795613;
        int n2 = (n = Integer.rotateLeft(n * 1239375505, 4) ^ 0xD4268879) ^ 0x76CE44B8;
        if ((n2 ^ n) != 1993229496) {
            int cfr_ignored_0 = (0x722118E5 ^ n) + -38088361;
        }
        if (!tash.tthj(class_23382)) {
            return false;
        }
        class_2382 class_23822 = tash.tna_3(class_23382);
        if (class_23822 == null) {
            return false;
        }
        class_2338[] class_2338Array = new class_2338[]{class_23382, class_23382.method_10081(class_23822)};
        boolean bl = false;
        for (class_2338 class_23383 : class_2338Array) {
            class_2338 class_23384 = tash.rst(class_23383);
            if (tash.thdj_2(class_23384)) {
                bl = true;
            } else if (!tash.jbs_2(class_23384)) {
                return false;
            }
            if (!tash.dhdhh_2(tash.jtr(class_23383, 0, 1, 0)) || !tash.khrb(tash.tth_5(class_23383, 0, 2, 0))) {
                return false;
            }
            for (class_2382 class_23823 : dhqn) {
                class_2338 class_23385 = class_23383.method_10081(class_23823);
                if (tash.ghshth(class_23385)) {
                    bl = true;
                    continue;
                }
                if (tash.khlw(class_23385) || class_23385.equals((Object)class_23382) || class_23385.equals((Object)class_23382.method_10081(class_23822))) continue;
                return false;
            }
        }
        return bl;
    }

    private static class_2382 tna_3(class_2338 class_23382) {
        for (class_2382 class_23822 : dhqn) {
            if (!tash.dhdhh_2(class_23382.method_10081(class_23822))) continue;
            return class_23822;
        }
        return null;
    }

    public static boolean jhq_2(class_2338 class_23382) {
        List list = tash.dbd(class_23382);
        if (list == null) {
            return false;
        }
        boolean bl = false;
        for (class_2338 class_23383 : list) {
            class_2338 class_23384 = class_23383.method_10074();
            if (tash.thdj_2(class_23384)) {
                bl = true;
            } else if (!tash.khlw(class_23384)) {
                return false;
            }
            if (!tash.dhdhh_2(class_23383.method_10069(0, 1, 0)) || !tash.dhdhh_2(class_23383.method_10069(0, 2, 0))) {
                return false;
            }
            for (class_2382 class_23822 : dhqn) {
                class_2338 class_23385 = class_23383.method_10081(class_23822);
                if (tash.thdj_2(class_23385)) {
                    bl = true;
                    continue;
                }
                if (tash.khlw(class_23385) || list.contains(class_23385)) continue;
                return false;
            }
        }
        return bl;
    }

    public static boolean khath(class_2338 class_23382) {
        List list = tash.dbd(class_23382);
        if (list == null) {
            return false;
        }
        for (class_2338 class_23383 : list) {
            class_2338 class_23384 = class_23383.method_10074();
            if (!tash.khlw(class_23384)) {
                return false;
            }
            if (!tash.dhdhh_2(class_23383.method_10069(0, 1, 0)) || !tash.dhdhh_2(class_23383.method_10069(0, 2, 0))) {
                return false;
            }
            for (class_2382 class_23822 : dhqn) {
                class_2338 class_23385 = class_23383.method_10081(class_23822);
                if (tash.khlw(class_23385) || list.contains(class_23385)) continue;
                return false;
            }
        }
        return true;
    }

    private static List dbd(class_2338 class_23382) {
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        arrayList.add(class_23382);
        if (!tash.dhdhh_2(class_23382)) {
            return null;
        }
        if (tash.dhdhh_2(class_23382.method_10069(1, 0, 0)) && tash.dhdhh_2(class_23382.method_10069(0, 0, 1)) && tash.dhdhh_2(class_23382.method_10069(1, 0, 1))) {
            arrayList.add(class_23382.method_10069(1, 0, 0));
            arrayList.add(class_23382.method_10069(0, 0, 1));
            arrayList.add(class_23382.method_10069(1, 0, 1));
        }
        if (tash.dhdhh_2(class_23382.method_10069(-1, 0, 0)) && tash.dhdhh_2(class_23382.method_10069(0, 0, -1)) && tash.dhdhh_2(class_23382.method_10069(-1, 0, -1))) {
            arrayList.add(class_23382.method_10069(-1, 0, 0));
            arrayList.add(class_23382.method_10069(0, 0, -1));
            arrayList.add(class_23382.method_10069(-1, 0, -1));
        }
        if (tash.dhdhh_2(class_23382.method_10069(1, 0, 0)) && tash.dhdhh_2(class_23382.method_10069(0, 0, -1)) && tash.dhdhh_2(class_23382.method_10069(1, 0, -1))) {
            arrayList.add(class_23382.method_10069(1, 0, 0));
            arrayList.add(class_23382.method_10069(0, 0, -1));
            arrayList.add(class_23382.method_10069(1, 0, -1));
        }
        if (tash.dhdhh_2(class_23382.method_10069(-1, 0, 0)) && tash.dhdhh_2(class_23382.method_10069(0, 0, 1)) && tash.dhdhh_2(class_23382.method_10069(-1, 0, 1))) {
            arrayList.add(class_23382.method_10069(-1, 0, 0));
            arrayList.add(class_23382.method_10069(0, 0, 1));
            arrayList.add(class_23382.method_10069(-1, 0, 1));
        }
        if (arrayList.size() != 4) {
            return null;
        }
        return arrayList;
    }

    private static boolean thdj_2(class_2338 class_23382) {
        int n = -562043703;
        n = Integer.rotateLeft(n * -823856347, 26) ^ 0x1F4CBB03;
        class_2338 class_23383 = class_23382;
        n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 25);
        int n2 = n ^ 0xD34AED1B;
        if ((n2 ^ n) != -750064357) {
            int cfr_ignored_0 = (0xD3509D2 ^ n) + 890481082;
        }
        if (tash.mc.field_1687 == null) {
            int n3 = 0;
            if (yf.tdhth_2() == 0) {
                n3 = n3 ^ 0x1ED7;
            }
            return n3 != 0;
        }
        class_2248 class_22482 = tash.mc.field_1687.method_8320(class_23382).method_26204();
        return class_22482 == class_2246.field_10540 || class_22482 == class_2246.field_22108 || class_22482 == class_2246.field_22423 || class_22482 == class_2246.field_23152;
    }

    private static boolean khlw(class_2338 class_23382) {
        int n = 2102452724;
        n = Integer.rotateLeft(n * 444251033, 24) ^ 0x9E28886F;
        class_2338 class_23383 = class_23382;
        n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 10);
        int n2 = n ^ 0x18828691;
        if ((n2 ^ n) != 411207313) {
            int cfr_ignored_0 = (0x65D26765 ^ n) + 502896840;
        }
        if (tash.mc.field_1687 == null) {
            return false;
        }
        return tash.mc.field_1687.method_8320(class_23382).method_26204() == class_2246.field_9987;
    }

    private static boolean dhdhh_2(class_2338 class_23382) {
        if (tash.mc.field_1687 == null) {
            return false;
        }
        return tash.mc.field_1687.method_8320(class_23382).method_45474();
    }

    private static void dll_2() {
        int n = shz_5.hmt(978453007);
        int n2 = n ^ 0xEF9D5C4D;
        if ((n2 ^ n) != -274899891) {
            int cfr_ignored_0 = Integer.rotateRight(0xD5CF5E42 ^ n, 13) + -394655431;
        }
        yf.athz_2();
    }

    private static int dsb_3(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(-1025061025);
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 14);
            int n2 = n ^ 0x8F5C367D;
            if ((n2 ^ n) == -1889782147) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x4DBAF922 ^ n, 12) + 1845611097;
        }
        return class_23382.method_10260();
    }

    private static class_2338 yl(double d, double d2, double d3) {
        block0: {
            int n = -502033911;
            n = Integer.rotateLeft(n * 1493052681, 23) ^ 0xDDDA8F77;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 10);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 27);
            int n2 = n ^ 0x8F011F8B;
            if ((n2 ^ n) == -1895751797) break block0;
            int cfr_ignored_0 = (0x6D128D82 ^ n) + 1535170976;
        }
        return class_2338.method_49637((double)d, (double)d2, (double)d3);
    }

    private static class_2338 szl(class_2338 class_23382, class_2382 class_23822) {
        block0: {
            int n = shz_5.hmt(-1192645821);
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 28);
            class_2382 class_23823 = class_23822;
            n = Integer.rotateRight((class_23823 != null ? System.identityHashCode(class_23823) : 0) ^ n, 17);
            int n2 = n ^ 0xB477A0CA;
            if ((n2 ^ n) == -1267228470) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC9E0B89 ^ n, 4) + -1954478894;
            int cfr_ignored_1 = (int)(0xCE2CA5B427D4EB4FL ^ (long)n ^ 0xB618831A2DB83188L);
        }
        return class_23382.method_10081(class_23822);
    }

    private static boolean dd_2(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(1046470047);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x65B045C9;
            if ((n2 ^ n) == 1706051017) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x5BEF9856 ^ n, 14) - 643895717) * 1542428759;
        }
        return tash.thdj_2(class_23382);
    }

    private static class_2338 tdt_3(class_2338 class_23382, int n, int n2, int n3) {
        block0: {
            int n4 = -1126279429;
            n4 = Integer.rotateLeft(n4 * -783339085, 20) ^ 0xCF3B9E50;
            int n5 = (n4 = n ^ n4) ^ 0x60FA67FD;
            if ((n5 ^ n4) == 1627023357) break block0;
            int cfr_ignored_0 = (0xDC243106 ^ n4) + 576385659;
        }
        return class_23382.method_10069(n, n2, n3);
    }

    private static boolean zmr_2(class_2338 class_23382) {
        block0: {
            int n = 542006955;
            n = Integer.rotateLeft(n * -1242697611, 27) ^ 0xC7BB3D8D;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 27);
            int n2 = n ^ 0x793F3FB4;
            if ((n2 ^ n) == 2034188212) break block0;
            int cfr_ignored_0 = (0x5971611F ^ n) - 357248999;
        }
        return tash.thdj_2(class_23382);
    }

    private static class_2338 zzb(class_2338 class_23382, int n, int n2, int n3) {
        block0: {
            int n4 = -248002467;
            n4 = Integer.rotateLeft(n4 * -642291017, 4) ^ 0x8BC892FA;
            class_2338 class_23383 = class_23382;
            n4 = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n4, 8);
            int n5 = n4 ^ 0x3811F0AF;
            if ((n5 ^ n4) == 940699823) break block0;
            int cfr_ignored_0 = (0xC92638F2 ^ n4) + 691510439;
        }
        return class_23382.method_10069(n, n2, n3);
    }

    private static boolean khdy(class_2338 class_23382) {
        block0: {
            int n = -1903185475;
            int n2 = (n = Integer.rotateLeft(n * 626613155, 25) ^ 0x189F566E) ^ 0x974D700C;
            if ((n2 ^ n) == -1756532724) break block0;
            int cfr_ignored_0 = (0x19C2C1B1 ^ n) - -535496387;
        }
        return tash.khlw(class_23382);
    }

    private static boolean ajk(class_2338 class_23382) {
        block0: {
            int n = -1695489875;
            int n2 = (n = Integer.rotateLeft(n * -1568748551, 27) ^ 0x9709F77D) ^ 0x1D2DC130;
            if ((n2 ^ n) == 489537840) break block0;
            int cfr_ignored_0 = (0x87DD219D ^ n) + -627613103;
        }
        return tash.thdj_2(class_23382);
    }

    private static class_2338 bghw(class_2338 class_23382, int n, int n2, int n3) {
        block0: {
            int n4 = 367052015;
            n4 = Integer.rotateLeft(n4 * -1791550007, 10) ^ 0xFF10D5F9;
            n4 = Integer.rotateRight(n ^ n4, 29);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 9)) ^ 0xF349D7E4;
            if ((n5 ^ n4) == -213264412) break block0;
            int cfr_ignored_0 = (0xE6A9130B ^ n4) - -1977505472;
        }
        return class_23382.method_10069(n, n2, n3);
    }

    private static boolean sghh_2(class_2338 class_23382) {
        block0: {
            int n = -538228247;
            int n2 = (n = Integer.rotateLeft(n * 492755753, 13) ^ 0x62F97899) ^ 0x91590066;
            if ((n2 ^ n) == -1856438170) break block0;
            int cfr_ignored_0 = (0x4EB2498F ^ n) - 623011160;
        }
        return tash.khlw(class_23382);
    }

    private static boolean khyt_2(class_2338 class_23382) {
        block0: {
            int n = 523470303;
            n = Integer.rotateLeft(n * -959104779, 7) ^ 0xDC116AB1;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 28);
            int n2 = n ^ 0xBB7629F6;
            if ((n2 ^ n) == -1149883914) break block0;
            int cfr_ignored_0 = (0xA445AC29 ^ n) - 64616596;
        }
        return tash.dhdhh_2(class_23382);
    }

    private static boolean shzsh(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(-901453037);
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 8);
            int n2 = n ^ 0xF5C996C5;
            if ((n2 ^ n) == -171338043) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3F8D7DD6 ^ n, 10) - -1233134555) * 1066237399;
        }
        return tash.dhdhh_2(class_23382);
    }

    private static class_2338 amz_2(class_2338 class_23382, int n, int n2, int n3) {
        block0: {
            int n4 = shz_5.hmt(254747916);
            class_2338 class_23383 = class_23382;
            n4 = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n4, 27);
            int n5 = (n4 = n ^ n4) ^ 0x96ED23F7;
            if ((n5 ^ n4) == -1762843657) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x99C206FB ^ n4, 6) + -1562609760) * -1715337477;
        }
        return class_23382.method_10069(n, n2, n3);
    }

    private static boolean zkm(class_2338 class_23382) {
        block0: {
            int n = 2082881407;
            int n2 = (n = Integer.rotateLeft(n * -359740597, 5) ^ 0x67B264DA) ^ 0x7EF95A04;
            if ((n2 ^ n) == 2130270724) break block0;
            int cfr_ignored_0 = (0x2DF657B ^ n) + 6641759;
        }
        return tash.khlw(class_23382);
    }

    private static boolean rqd_2(class_2338 class_23382) {
        block0: {
            int n = 168988739;
            n = Integer.rotateLeft(n * 1109686417, 27) ^ 0xD8824CE6;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x9B7AC3DF;
            if ((n2 ^ n) == -1686453281) break block0;
            int cfr_ignored_0 = (0x9168539C ^ n) + 493118332;
        }
        return tash.khlw(class_23382);
    }

    private static boolean ghjh(class_2338 class_23382) {
        block0: {
            int n = -268911369;
            int n2 = (n = Integer.rotateLeft(n * 736712383, 18) ^ 0xEAE979EE) ^ 0x956D2989;
            if ((n2 ^ n) == -1788008055) break block0;
            int cfr_ignored_0 = (0x7A95957E ^ n) + -969145081;
        }
        return tash.dhdhh_2(class_23382);
    }

    private static boolean tzn_2(class_2338 class_23382) {
        block0: {
            int n = 362541964;
            n = Integer.rotateLeft(n * 371697635, 6) ^ 0xCC9FC16E;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 21);
            int n2 = n ^ 0x20AC98CF;
            if ((n2 ^ n) == 548182223) break block0;
            int cfr_ignored_0 = (0x35376B43 ^ n) - -152904879;
        }
        return tash.dhdhh_2(class_23382);
    }

    private static class_2382 znd_2(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(-2035860671);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x87B02C14;
            if ((n2 ^ n) == -2018497516) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1171755 ^ n, 3) - 640250502) * 0x1171755;
            int cfr_ignored_1 = (int)(0xC3A5B96827D4EB4FL ^ (long)n ^ 0x8FA0831A2DB82A9AL);
        }
        return tash.tna_3(class_23382);
    }

    private static class_2338 rths_2(class_2338 class_23382, int n, int n2, int n3) {
        block0: {
            int n4 = shz_5.hmt(-1884773843);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 9)) ^ 0xFC6F67AF;
            if ((n5 ^ n4) == -59807825) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x73C7C582 ^ n4, 17) + 160336377;
        }
        return class_23382.method_10069(n, n2, n3);
    }

    private static boolean hshy(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(-827869315);
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 14);
            int n2 = n ^ 0x7FF4E743;
            if ((n2 ^ n) == 2146756419) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB153503E ^ n, 9) - 2104776381) * -1319940033;
        }
        return tash.dhdhh_2(class_23382);
    }

    private static boolean swj(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(-878305537);
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 19);
            int n2 = n ^ 0x7C180B1;
            if ((n2 ^ n) == 130121905) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCC679E4E ^ n, 12) - -991311187;
        }
        return tash.dhdhh_2(class_23382);
    }

    private static class_2338 drt_2(class_2338 class_23382) {
        block0: {
            int n = -2044097809;
            n = Integer.rotateLeft(n * -1055712523, 12) ^ 0x59C6972D;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 25);
            int n2 = n ^ 0x8CB06382;
            if ((n2 ^ n) == -1934597246) break block0;
            int cfr_ignored_0 = (0xA99E96D ^ n) + 621431591;
        }
        return class_23382.method_10074();
    }

    private static boolean zfh(class_2338 class_23382) {
        block0: {
            int n = -1989214630;
            n = Integer.rotateLeft(n * 1498398787, 4) ^ 0xFDF65273;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x9C44067B;
            if ((n2 ^ n) == -1673263493) break block0;
            int cfr_ignored_0 = (0x152AF821 ^ n) + -539428548;
        }
        return tash.khlw(class_23382);
    }

    private static boolean tthj(class_2338 class_23382) {
        block0: {
            int n = 1719864745;
            n = Integer.rotateLeft(n * -465754071, 3) ^ 0x7DF6D532;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0xE1FE1633;
            if ((n2 ^ n) == -503441869) break block0;
            int cfr_ignored_0 = (0x877D1B9A ^ n) + 2074771566;
        }
        return tash.dhdhh_2(class_23382);
    }

    private static class_2338 rst(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(886409739);
            int n2 = n ^ 0x1A5C45A6;
            if ((n2 ^ n) == 442254758) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x2E89CFAD ^ n, 8) - -1492269778;
            int cfr_ignored_1 = (int)(0xEC3B619027D4EB4FL ^ (long)n ^ 0x3E50831A2DB875A7L);
        }
        return class_23382.method_10074();
    }

    private static boolean jbs_2(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(50069182);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x601253C5;
            if ((n2 ^ n) == 1611813829) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x62E9AD7B ^ n, 15) + -22437600) * 1659481467;
        }
        return tash.khlw(class_23382);
    }

    private static class_2338 jtr(class_2338 class_23382, int n, int n2, int n3) {
        block0: {
            int n4 = 476051430;
            n4 = Integer.rotateLeft(n4 * 202171199, 26) ^ 0xE131E646;
            int n5 = (n4 = n ^ n4) ^ 0xAF2B18A9;
            if ((n5 ^ n4) == -1356130135) break block0;
            int cfr_ignored_0 = (0xB374EF4F ^ n4) - 623339587;
        }
        return class_23382.method_10069(n, n2, n3);
    }

    private static class_2338 tth_5(class_2338 class_23382, int n, int n2, int n3) {
        block0: {
            int n4 = 392158156;
            n4 = Integer.rotateLeft(n4 * -351428815, 6) ^ 0x1A7C1A27;
            class_2338 class_23383 = class_23382;
            n4 = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 25)) ^ 0x6D3638E3;
            if ((n5 ^ n4) == 1832270051) break block0;
            int cfr_ignored_0 = (0x7A69E32F ^ n4) - -683643193;
        }
        return class_23382.method_10069(n, n2, n3);
    }

    private static boolean khrb(class_2338 class_23382) {
        block0: {
            int n = shz_5.hmt(-1024851906);
            int n2 = n ^ 0x87D1EFB3;
            if ((n2 ^ n) == -2016284749) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x453BEF8D ^ n, 11) - 1721737550;
            int cfr_ignored_1 = (int)(0x878941B027D4EB4FL ^ (long)n ^ 0x7E10831A2DB8A2C3L);
        }
        return tash.dhdhh_2(class_23382);
    }

    private static boolean ghshth(class_2338 class_23382) {
        block0: {
            int n = 881233181;
            n = Integer.rotateLeft(n * 897256629, 14) ^ 0x5AF19DDE;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x25EFEDA3;
            if ((n2 ^ n) == 636480931) break block0;
            int cfr_ignored_0 = (0x116960BE ^ n) - 1210338951;
        }
        return tash.thdj_2(class_23382);
    }

    private static String[] htt(String string) {
        block0: {
            int n = -2133734093;
            n = Integer.rotateLeft(n * -908746585, 19) ^ 0x844F6A8B;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
            int n2 = n ^ 0xDBDAEE96;
            if ((n2 ^ n) == -606409066) break block0;
            int cfr_ignored_0 = (0x5B0B23A5 ^ n) + -597783601;
        }
        return string.split("\u0007\u0013", -1);
    }

    private static CallSite shdhk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 549350494;
            n3 = Integer.rotateLeft(n3 * 10860695, 21) ^ 0xEF37AE29;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 22);
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x27B5EE73;
            if ((n4 ^ n3) != 666234483) {
                int cfr_ignored_0 = (0x70B822D ^ n3) - -1092424450;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sds_5 ^ string.hashCode() ^ n2 + jnth + i * -295472775) + sds_5) ^ jnth));
            }
            String[] stringArray = tash.htt(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] vimwxpvrc01(String string) {
        return string.split("\u0004\u0017", -1);
    }

    private static CallSite mz28yrr37(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ygn2wrm ^ string.hashCode() ^ n2 + g7e4m29ijqjr0 ^ i * -2067450953 ^ ygn2wrm, 17) ^ g7e4m29ijqjr0));
            }
            String[] stringArray = tash.vimwxpvrc01(new String(cArray));
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

