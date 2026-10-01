/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_4050
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4050;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.zn;
import us.m0vy.moondlc.m0vyguard.yf;

public class tkhk
implements dl {
    private static final int bwm = -997823212;
    private static final int tdhb = 0x5D5D58;
    private static final int mryv2wfu1 = 247367977;
    private static final int emwladcndm = -610232363;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int uwia3s0t;

    public static boolean rhkh(class_243 class_2432, float f) {
        try {
            int n = 1278237028;
            n = Integer.rotateLeft(n * 1596073857, 18) ^ 0x7607DA61;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 29);
            int n2 = n ^ 0x3C492CC9;
            if ((n2 ^ n) != 1011428553) {
                int cfr_ignored_0 = (0x707975AD ^ n) - -142291620;
            }
            if ((0x140 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        taj taj2 = tkhk.zthb_2(class_2432);
        float f2 = tkhk.zs_4(taj2.dda_3() - tkhk.mc.field_1724.method_36454());
        float f3 = tkhk.fd(taj2.shyq() - tkhk.mc.field_1724.method_36455());
        return Math.abs(f2) <= f && Math.abs(f3) <= f;
    }

    public static taj zthb_2(class_243 class_2432) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        taj taj2 = null;
        int n = 0;
        int n2 = 521121965;
        n2 = Integer.rotateLeft(n2 * -1552977823, 7) ^ 0xFC3F640B;
        class_243 class_2433 = class_2432;
        n2 = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC6A1566F));
        block33: while (true) {
            switch (n3 ^ n2) {
                case -962505105: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x6AD6C11F ^ n2, 16) - -195100164) * 1792459039;
                    if (class_2432 != null) {
                        try {
                            n += 5;
                            if ((0xE4237D588171647L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = n2 ^ 0xCEC206E5;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = n2 ^ 0xCEC206E5;
                        }
                        ++n;
                        continue block33;
                    }
                    n3 = n2 ^ 0x5862A577 ^ 0xEAAAF502 ^ 0xEAAAF502;
                    int cfr_ignored_1 = (Integer.rotateRight(0x12B32ABB ^ n2, 5) + 1208994784) * 313731771;
                    n3 = n2 ^ 0xF96BDF13;
                    continue block33;
                }
                case -110371053: {
                    int cfr_ignored_2 = (Integer.rotateRight(0x6D6FC932 ^ n2, 16) + 1155988553) * 1836042547;
                    taj2 = taj.dlq;
                    n3 = n2 ^ 0xE9D08628 ^ 0xF9C1421E ^ 0xF9C1421E;
                    int cfr_ignored_3 = (Integer.rotateLeft(0xB007A89C ^ n2, 9) - 1430981151) * -1341675363;
                    n -= 4;
                    continue block33;
                }
                case -826145051: {
                    int cfr_ignored_4 = Integer.rotateRight(0x9DB188AA ^ n2, 6) + 484256721;
                    class_243 class_2434 = tkhk.mc.field_1724.method_19538().method_1031(0.0, (double)tkhk.tfz_3(tkhk.mc.field_1724, tkhk.zsr_3(tkhk.mc.field_1724)), 0.0);
                    f = (float)(class_2432.field_1352 - class_2434.field_1352);
                    f2 = (float)(class_2432.field_1351 - class_2434.field_1351);
                    f3 = (float)(class_2432.field_1350 - class_2434.field_1350);
                    f4 = (float)Math.sqrt(f * f + f3 * f3);
                    f5 = (float)(Math.toDegrees(Math.atan2(f3, f)) - Double.longBitsToDouble(0x6150610F90E4C6B3L ^ 0x2106E10F90E4C6B3L));
                    f6 = (float)(-tkhk.zthd_3(Math.atan2(f2, f4)));
                    taj2 = new taj(f5, f6);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4997807B));
                    int cfr_ignored_5 = (Integer.rotateRight(0x97318A16 ^ n2, 5) - 1398626277) * -1758361065;
                    n3 = (int)((long)(n2 ^ 0xE9D08628) ^ 0xC5CD10418F890A02L ^ 0xC5CD10418F890A02L);
                    continue block33;
                }
                case -1575155155: {
                    int cfr_ignored_6 = Integer.rotateLeft(0xDDE24825 ^ n2, 14) - -490447946;
                    int cfr_ignored_7 = (int)(0x1F50E61827D4EB4FL ^ (long)n2 ^ 0x3140831A2DB99370L);
                    try {
                        n += 2;
                        if ((0xB65EC4ACB9027D4DL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC6A1566F));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 ^ 0xC6A1566F ^ 0x1AA7B54 ^ 0x1AA7B54;
                    }
                    n -= 2;
                    continue block33;
                }
                case -1230265489: {
                    int cfr_ignored_8 = Integer.rotateRight(0x8DC083AA ^ n2, 4) + 783126737;
                    n3 = (n2 ^ 0x9294EA4F) + 1422046552 - 1422046552;
                    int cfr_ignored_9 = (Integer.rotateRight(0x44F1483E ^ n2, 11) - 1570070205) * 1156663359;
                    try {
                        n3 = (n2 ^ 0xC6A1566F) + -171632385 - -171632385;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(n2 ^ 0xC6A1566F) ^ 0x1A544EA9DD7344CL ^ 0x1A544EA9DD7344CL);
                    }
                    continue block33;
                }
                case 1652998484: {
                    int cfr_ignored_10 = Integer.rotateLeft(0x24E9320 ^ n2, 3) + 1273065499;
                    n3 = (int)((long)(n2 ^ 0x8CBC9465) ^ 0x7F66B1707BE0A3F6L ^ 0x7F66B1707BE0A3F6L);
                    int cfr_ignored_11 = Integer.rotateLeft(0xE27E67CD ^ n2, 15) - 1907110158;
                    int cfr_ignored_12 = (int)(0x20CCC9F027D4EB4FL ^ (long)n2 ^ 0x6E90831A2DB9EC48L);
                    try {
                        n3 = n2 ^ 0xC6A1566F ^ 0xEF67242 ^ 0xEF67242;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 ^ 0xC6A1566F;
                    }
                    ++n;
                    continue block33;
                }
                case -665200959: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x8888C251 ^ n2, 4) + -1930615030) * -2004303279;
                    int cfr_ignored_14 = (int)(0x4A3A6C6C27D4EB4FL ^ (long)n2 ^ 0x25A8831A2DB939A5L);
                    n3 = (int)((long)(n2 ^ 0x9155BF79) ^ 0xD727E0D3CE82B25CL ^ 0xD727E0D3CE82B25CL);
                    int cfr_ignored_15 = (Integer.rotateLeft(0x5B5ACF90 ^ n2, 14) + 341623211) * 1532678033;
                    n3 = n2 ^ 0xC6A1566F ^ 0x3B7C1F4B ^ 0x3B7C1F4B;
                    n += 2;
                    continue block33;
                }
                case 1013282563: {
                    int cfr_ignored_16 = (Integer.rotateRight(0xB2A8491B ^ n2, 9) + -1497466496) * -1297594085;
                    n3 = n2 ^ 0x6AC61765 ^ 0xA01667F8 ^ 0xA01667F8;
                    int cfr_ignored_17 = Integer.rotateRight(0x23703AEA ^ n2, 7) + 1324663185;
                    try {
                        if ((0x8246D4876335ACB3L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)(n2 ^ 0xC6A1566F) ^ 0x43796AA718F0BD24L ^ 0x43796AA718F0BD24L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 ^ 0xC6A1566F ^ 0xB6D522A9 ^ 0xB6D522A9;
                    }
                    continue block33;
                }
                case -191967720: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0xC1ECCC90 ^ n2, 11) + -2146802517) * -1041445743;
                    n3 = n2 ^ 0x4C6993C4;
                    int cfr_ignored_19 = Integer.rotateRight(0x7E45D5E6 ^ n2, 18) - 1322419733;
                    int cfr_ignored_20 = (int)(0x4AA896F8E1DCFB3DL ^ (long)n2 ^ 0xD0810F0A0D5D3880L);
                    n3 = n2 ^ 0xC6A1566F;
                    continue block33;
                }
                case 167236020: {
                    int cfr_ignored_21 = Integer.rotateLeft(0x3347DA6D ^ n2, 9) - 974197358;
                    int cfr_ignored_22 = (int)(0xF1F5745027D4EB4FL ^ (long)n2 ^ 0x15D0831A2DB84E3BL);
                    n3 = n2 ^ 0x6FA3FCD ^ 0x65BD1C84 ^ 0x65BD1C84;
                    int cfr_ignored_23 = (Integer.rotateLeft(0x5553AC1D ^ n2, 13) - 1501525694) * 1431546909;
                    int cfr_ignored_24 = (int)(0x97E1022027D4EB4FL ^ (long)n2 ^ 0xF930831A2DB88213L);
                    n3 = (int)((long)(n2 ^ 0xC6A1566F) ^ 0x2C579F435DB775B1L ^ 0x2C579F435DB775B1L);
                    int cfr_ignored_25 = (Integer.rotateLeft(0x865B60D5 ^ n2, 3) - 1231968518) * -2040831787;
                    int cfr_ignored_26 = (int)(0x44E9CEE827D4EB4FL ^ (long)n2 ^ 0x60A0831A2DB92402L);
                    continue block33;
                }
                case 1924567382: {
                    int cfr_ignored_27 = Integer.rotateLeft(0xDE214405 ^ n2, 14) - -362488874;
                    int cfr_ignored_28 = (int)(0x1C93EA3827D4EB4FL ^ (long)n2 ^ 0x2900831A2DB994F6L);
                    n3 = (n2 ^ 0xA06ED71C) + -1725137948 - -1725137948;
                    int cfr_ignored_29 = (Integer.rotateRight(0xD5A4A11E ^ n2, 13) - -481484323) * -710631137;
                    int cfr_ignored_30 = (int)(0x6CF7454634DAB97BL ^ (long)n2 ^ 0x77FCA50689D1743FL);
                    n3 = (int)((long)(n2 ^ 0xC6A1566F) ^ 0xC511924992FD6AA7L ^ 0xC511924992FD6AA7L);
                    n -= 2;
                    continue block33;
                }
                case -1261108908: {
                    int cfr_ignored_31 = (Integer.rotateLeft(0x185BCE99 ^ n2, 6) + -142892094) * 408669849;
                    int cfr_ignored_32 = (int)(0xDAE960A427D4EB4FL ^ (long)n2 ^ 0x3C38831A2DB81803L);
                    n3 = (int)((long)(n2 ^ 0x52606DB4) ^ 0x2BF86D6561F0604AL ^ 0x2BF86D6561F0604AL);
                    int cfr_ignored_33 = Integer.rotateLeft(0x730477A8 ^ n2, 17) + -236446573;
                    try {
                        n += 4;
                        n3 = (n2 ^ 0xC6A1566F) + 2113919930 - 2113919930;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 ^ 0xC6A1566F ^ 0x75DB3BD7 ^ 0x75DB3BD7;
                    }
                    ++n;
                    continue block33;
                }
                case 1233711910: {
                    int cfr_ignored_34 = (Integer.rotateRight(0xAEC6FB7B ^ n2, 8) + 779490080) * -1362691205;
                    try {
                        n += 2;
                        if ((0xCF537A0CF0CEE2E9L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = n2 ^ 0xC6A1566F;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC6A1566F));
                    }
                    n -= 2;
                    continue block33;
                }
                case 1073993795: {
                    int cfr_ignored_35 = Integer.rotateLeft(0x10D48FE9 ^ n2, 5) + 236653682;
                    int cfr_ignored_36 = (int)(0xD26621D427D4EB4FL ^ (long)n2 ^ 0xBED8831A2DB8091DL);
                    try {
                        n += 4;
                        n3 = n2 ^ 0xC6A1566F ^ 0xA89F2B2 ^ 0xA89F2B2;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 ^ 0xC6A1566F ^ 0xDF1986AF ^ 0xDF1986AF;
                    }
                    ++n;
                    continue block33;
                }
                case -372210136: {
                    return taj2;
                }
            }
            int cfr_ignored_37 = (Integer.rotateLeft(0x93A985BC ^ n2, 5) - -437989121) * -1817606723;
            n3 = (n2 ^ 0xC6A1566F) + -1467683692 - -1467683692;
        }
    }

    public static taj dghh_4(class_241 class_2412) {
        int n = zn.adhy(-769749412);
        int n2 = n ^ 0xBEF28C8A;
        if ((n2 ^ n) != -1091400566) {
            int cfr_ignored_0 = (Integer.rotateRight(0x6CEC02D6 ^ n, 16) - 888272677) * 1827406551;
        }
        return new taj(class_2412.field_1342, class_2412.field_1343);
    }

    /*
     * Unable to fully structure code
     */
    public static taj zr(class_243 var0) {
        var3_1 = 0;
        var1_2 = 397022136;
        var1_2 = Integer.rotateLeft(var1_2 * -623092609, 26) ^ -25746788;
        var2_3 = 808009462 + var1_2 ^ -1977927999 ^ -1977927999;
        while (true) {
            block38: {
                block45: {
                    block43: {
                        block40: {
                            block46: {
                                block41: {
                                    block42: {
                                        block37: {
                                            block36: {
                                                block44: {
                                                    block39: {
                                                        block35: {
                                                            var3_1 = var2_3 - var1_2;
                                                            switch (var3_1 & 7) {
                                                                case 0: {
                                                                    if (var3_1 == -1333172232) break block35;
                                                                    if (var3_1 != 1550412096) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 2: {
                                                                    if (var3_1 != 1673542370) {
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                                case 3: {
                                                                    if (var3_1 != -1652903877) {
                                                                        ** break;
                                                                    }
                                                                    break block38;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 == -175876580) break block39;
                                                                    if (var3_1 != -737745468) {
                                                                        (Integer.rotateRight(1942020795 ^ var1_2, 17) + 146346976) * 1942020795;
                                                                        ** break;
                                                                    }
                                                                    break block40;
                                                                }
                                                                case 5: {
                                                                    if (var3_1 == 1226305173) break block41;
                                                                    if (var3_1 != 218738941) {
                                                                        Integer.rotateRight(2126581903 ^ var1_2, 18) - 1572774028;
                                                                        ** break;
                                                                    }
                                                                    break block42;
                                                                }
                                                                case 6: {
                                                                    if (var3_1 == 808009462) break;
                                                                    if (var3_1 == -1411197978) break block43;
                                                                    if (var3_1 != -452743186) {
                                                                        ** break;
                                                                    }
                                                                    break block44;
                                                                }
                                                                case 7: {
                                                                    if (var3_1 == 1593392895) break block45;
                                                                    if (var3_1 != -1892216601) {
                                                                        ** break;
                                                                    }
                                                                    break block46;
                                                                }
                                                            }
                                                            (Integer.rotateRight(876276726 ^ var1_2, 9) - 1468019205) * 876276727;
                                                            if (yf.khdha_2()) {
                                                                var2_3 = -1333172232 + var1_2;
                                                                Integer.rotateRight(-1495246682 ^ var1_2, 7) - 965237589;
                                                                continue;
                                                            }
                                                            var2_3 = 1589339756 + var1_2 + 856167624 - 856167624;
                                                            Integer.rotateLeft(1436116449 ^ var1_2, 13) + 1643181434;
                                                            (int)(-7553719803562366129L ^ (long)var1_2 ^ 7694544111821947782L);
                                                            var2_3 = (int)((long)(-175876580 + var1_2) ^ -6128576525418296825L ^ -6128576525418296825L);
                                                            var3_1 -= 5;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-1234159600 ^ var1_2, 9) + 469002539) * -1234159599;
                                                        return new taj(class_3532.method_15393((float)((float)Math.toDegrees(Math.atan2(var0.field_1350, var0.field_1352)) - Float.intBitsToFloat(Integer.rotateLeft(476808556 ^ -1670673094, 19)))), class_3532.method_15393((float)((float)Math.toDegrees(-Math.atan2(var0.field_1351, Math.hypot(var0.field_1352, var0.field_1350))))));
                                                    }
                                                    (Integer.rotateRight(164213623 ^ var1_2, 4) - 868899492) * 164213623;
                                                    yf.athz_2();
                                                    throw null;
                                                }
                                                (Integer.rotateLeft(1382377337 ^ var1_2, 13) + -22731038) * 1382377337;
                                                (int)(-8009712117691913393L ^ (long)var1_2 ^ 8068342880893701246L);
                                                var2_3 = 411223620 + var1_2 ^ -2081783301 ^ -2081783301;
                                                (Integer.rotateRight(-1178771237 ^ var1_2, 10) + -2108925504) * -1178771237;
                                                try {
                                                    var3_1 -= 3;
                                                    if ((-4561521864077136839L ^ (long)var1_2 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var2_3 = Integer.reverse(Integer.reverse(808009462 + var1_2));
                                                }
                                                catch (IllegalStateException v0) {
                                                    var2_3 = 808009462 + var1_2 + 1058671837 - 1058671837;
                                                }
                                                --var3_1;
                                                continue;
                                            }
                                            Integer.rotateLeft(-664249751 ^ var1_2, 14) + 956338674;
                                            (int)(1935127632191744847L ^ (long)var1_2 ^ 1574152218225514596L);
                                            var2_3 = 2142850241 + var1_2 + -1991620859 - -1991620859;
                                            Integer.rotateLeft(1975208364 ^ var1_2, 17) - 1175161615;
                                            try {
                                                if ((6611454205639090357L ^ (long)var1_2 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                var2_3 = 808009462 + var1_2 ^ -1868441638 ^ -1868441638;
                                            }
                                            catch (IllegalArgumentException v1) {
                                                var2_3 = 808009462 + var1_2;
                                            }
                                            var3_1 += 5;
                                            continue;
                                        }
                                        (Integer.rotateLeft(698054713 ^ var1_2, 8) + 238104098) * 698054713;
                                        (int)(-1501433687414871217L ^ (long)var1_2 ^ 5870586262736894850L);
                                        var2_3 = Integer.reverse(Integer.reverse(-156011098 + var1_2));
                                        Integer.rotateRight(-848498486 ^ var1_2, 12) + -460404815;
                                        var2_3 = (int)((long)(808009462 + var1_2) ^ 6864283153034401803L ^ 6864283153034401803L);
                                        ++var3_1;
                                        continue;
                                    }
                                    (Integer.rotateRight(327421363 ^ var1_2, 5) + 1633372136) * 327421363;
                                    var2_3 = -81547432 + var1_2 ^ 1902956703 ^ 1902956703;
                                    Integer.rotateLeft(2134773029 ^ var1_2, 18) - 1826698934;
                                    (int)(-4788272979658871985L ^ (long)var1_2 ^ -4953815441648068920L);
                                    try {
                                        var3_1 -= 4;
                                        var2_3 = 808009462 + var1_2 ^ 60213150 ^ 60213150;
                                    }
                                    catch (UnsupportedOperationException v2) {
                                        var2_3 = (int)((long)(808009462 + var1_2) ^ -998844220503094675L ^ -998844220503094675L);
                                    }
                                    var3_1 -= 4;
                                    continue;
                                }
                                (Integer.rotateRight(-1096837538 ^ var1_2, 10) - 431019165) * -1096837537;
                                try {
                                    ++var3_1;
                                    if ((9177204155264825023L ^ (long)var1_2 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    var2_3 = (int)((long)(808009462 + var1_2) ^ -6289057280032623213L ^ -6289057280032623213L);
                                }
                                catch (IllegalArgumentException v3) {
                                    var2_3 = Integer.reverse(Integer.reverse(808009462 + var1_2));
                                }
                                continue;
                            }
                            (Integer.rotateRight(-842251754 ^ var1_2, 12) - -266756123) * -842251753;
                            try {
                                var3_1 += 4;
                                var2_3 = 808009462 + var1_2 + -190647188 - -190647188;
                            }
                            catch (NoSuchElementException v4) {
                                var2_3 = 808009462 + var1_2 + 448948614 - 448948614;
                            }
                            var3_1 -= 4;
                            continue;
                        }
                        Integer.rotateRight(-971968533 ^ var1_2, 11) + 6991024;
                        var2_3 = 531865941 + var1_2 ^ 2146017308 ^ 2146017308;
                        (Integer.rotateRight(-1795575841 ^ var1_2, 5) - 244968252) * -1795575841;
                        try {
                            --var3_1;
                            var2_3 = (int)((long)(808009462 + var1_2) ^ -3963531547086304937L ^ -3963531547086304937L);
                        }
                        catch (NoSuchElementException v5) {
                            var2_3 = 808009462 + var1_2 ^ 455297249 ^ 455297249;
                        }
                        var3_1 -= 3;
                        continue;
                    }
                    (Integer.rotateRight(382022067 ^ var1_2, 5) + -968973336) * 382022067;
                    var2_3 = 808009462 + var1_2;
                    (Integer.rotateRight(1257396919 ^ var1_2, 12) - 397843300) * 1257396919;
                    --var3_1;
                    continue;
                }
                (Integer.rotateRight(-1595955490 ^ var1_2, 7) - 2138231837) * -1595955489;
                var2_3 = 2130959873 + var1_2 ^ -1358636009 ^ -1358636009;
                (Integer.rotateRight(-2104078569 ^ var1_2, 3) - -728681724) * -2104078569;
                try {
                    var3_1 += 2;
                    var2_3 = Integer.reverse(Integer.reverse(808009462 + var1_2));
                }
                catch (IllegalArgumentException v6) {
                    var2_3 = (int)((long)(808009462 + var1_2) ^ 8507820660890973304L ^ 8507820660890973304L);
                }
                var3_1 += 2;
                continue;
            }
            (Integer.rotateRight(2071070271 ^ var1_2, 18) - -148086564) * 2071070271;
            var2_3 = Integer.reverse(Integer.reverse(-1016232164 + var1_2));
            Integer.rotateLeft(-620748155 ^ var1_2, 14) - -1990079146;
            (int)(1851697119372831567L ^ (long)var1_2 ^ -2017468484602454348L);
            var2_3 = 369563816 + var1_2 ^ -777177089 ^ -777177089;
            Integer.rotateRight(-1971690333 ^ var1_2, 4) + -919613704;
            var2_3 = Integer.reverse(Integer.reverse(808009462 + var1_2));
            continue;
lbl204:
            // 8 sources

            Integer.rotateLeft(2030016300 ^ var1_2, 18) - -1420759665;
            var2_3 = Integer.reverse(Integer.reverse(808009462 + var1_2));
        }
    }

    public static taj baa(taj taj2, taj taj3) {
        float f = class_3532.method_15393((float)(taj3.dda_3() - taj2.dda_3()));
        float f2 = class_3532.method_15393((float)(taj3.shyq() - taj2.shyq()));
        return new taj(f, f2);
    }

    public static class_243 zwh_2(class_1297 class_12972) {
        try {
            int n = 514339407;
            n = Integer.rotateLeft(n * -2069045631, 16) ^ 0xF6964185;
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0xDDB65F6C;
            if ((n2 ^ n) != -575250580) {
                int cfr_ignored_0 = (0xC31E6D23 ^ n) + 1865341200;
            }
            if ((0x2D3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_243 class_2432 = tkhk.mc.field_1724.method_33571();
        class_238 class_2383 = class_12972.method_5829();
        return new class_243(tkhk.bhj_2(class_2432.field_1352, class_2383.field_1323, class_2383.field_1320), tkhk.jzkh_2(class_2432.field_1351, class_2383.field_1322, class_2383.field_1325), class_3532.method_15350((double)class_2432.field_1350, (double)class_2383.field_1321, (double)class_2383.field_1324));
    }

    public static class_243 zdsh_3(class_1297 class_12972, class_243 class_2432) {
        class_238 class_2383 = class_12972.method_5829();
        class_243 class_2433 = mc.method_1560().method_5836(1.0f);
        class_243 class_2434 = new class_243(class_2383.field_1323, class_2383.field_1322, class_2383.field_1321);
        class_243 class_2435 = new class_243(class_2383.field_1320, class_2383.field_1325, class_2383.field_1324);
        double d = -1.7976931348623157E308;
        double d2 = Double.MAX_VALUE;
        class_243 class_2436 = class_2432.method_1020(class_2433);
        if (class_2436.method_1027() < 1.0E-7) {
            return class_2432;
        }
        class_243 class_2437 = class_2436.method_1029();
        block5: for (int i = 0; i < 3; ++i) {
            double d3;
            double d4;
            double d5;
            double d6;
            switch (i) {
                case 0: {
                    d6 = class_2437.field_1352;
                    d5 = class_2434.field_1352;
                    d4 = class_2435.field_1352;
                    d3 = class_2433.field_1352;
                    break;
                }
                case 1: {
                    d6 = class_2437.field_1351;
                    d5 = class_2434.field_1351;
                    d4 = class_2435.field_1351;
                    d3 = class_2433.field_1351;
                    break;
                }
                case 2: {
                    d6 = class_2437.field_1350;
                    d5 = class_2434.field_1350;
                    d4 = class_2435.field_1350;
                    d3 = class_2433.field_1350;
                    break;
                }
                default: {
                    continue block5;
                }
            }
            if (Math.abs(d6) < 1.0E-7) {
                if (!(d3 < d5) && !(d3 > d4)) continue;
                return class_2432;
            }
            double d7 = (d5 - d3) / d6;
            double d8 = (d4 - d3) / d6;
            if (d7 > d8) {
                double d9 = d7;
                d7 = d8;
                d8 = d9;
            }
            if (!((d = Math.max(d, d7)) > (d2 = Math.min(d2, d8)))) continue;
            return class_2432;
        }
        double d10 = class_2436.method_1033();
        if (d > d10 || d < 0.0) {
            return class_2432;
        }
        return class_2433.method_1019(class_2437.method_1021(d));
    }

    private static float zs_4(float f) {
        block0: {
            int n = 487369567;
            int n2 = (n = Integer.rotateLeft(n * -949350191, 27) ^ 0xC7B24174) ^ 0xD4A4D206;
            if ((n2 ^ n) == -727395834) break block0;
            int cfr_ignored_0 = (0xC9A87959 ^ n) + -1225659244;
        }
        return class_3532.method_15393((float)f);
    }

    private static float fd(float f) {
        block0: {
            int n = zn.adhy(891847063);
            int n2 = n ^ 0x4BB9FE55;
            if ((n2 ^ n) == 1270480469) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7E917FC2 ^ n, 18) + 1476138937;
        }
        return class_3532.method_15393((float)f);
    }

    private static class_4050 zsr_3(class_746 class_7462) {
        block0: {
            int n = -148308679;
            int n2 = (n = Integer.rotateLeft(n * 1023695121, 28) ^ 0x99D2A616) ^ 0x1F3CB034;
            if ((n2 ^ n) == 524070964) break block0;
            int cfr_ignored_0 = (0xE8144D0D ^ n) + -592281107;
        }
        return class_7462.method_18376();
    }

    private static float tfz_3(class_746 class_7462, class_4050 class_40502) {
        block0: {
            int n = zn.adhy(1926979398);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xF1179C3C;
            if ((n2 ^ n) == -250110916) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x83CCC37A ^ n, 3) + -97957119) * -2083732613;
        }
        return class_7462.method_18381(class_40502);
    }

    private static double zthd_3(double d) {
        block0: {
            int n = zn.adhy(-170006915);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 20);
            int n2 = n ^ 0xC429D1D7;
            if ((n2 ^ n) == -1003892265) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x31F437AA ^ n, 9) + 284187857;
        }
        return Math.toDegrees(d);
    }

    private static double bhj_2(double d, double d2, double d3) {
        block0: {
            int n = zn.adhy(2016962623);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 7);
            int n2 = n ^ 0xE8044F70;
            if ((n2 ^ n) == -402370704) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x903C274F ^ n, 5) - 2074501580;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static double jzkh_2(double d, double d2, double d3) {
        block0: {
            int n = 128585926;
            n = Integer.rotateLeft(n * 149347403, 14) ^ 0xB0A8374;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 5);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d3) ^ n, 25);
            int n2 = n ^ 0xEDB0B0A1;
            if ((n2 ^ n) == -307187551) break block0;
            int cfr_ignored_0 = (0xEA1AA067 ^ n) + -1569837318;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static String[] ths_8(String string) {
        int n = zn.adhy(-76675401);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 14);
        int n2 = n ^ 0xD8FD3D57;
        if ((n2 ^ n) != -654492329) {
            zn.shay_2(596851680, n);
            int cfr_ignored_0 = (int)(0xBDA442597F4A7C15L ^ (long)n ^ 0x79C23227030CD699L);
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite dbt_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 105024792;
            n3 = Integer.rotateLeft(n3 * 607750299, 20) ^ 0x10BDBDA7;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 8);
            int n4 = n3 ^ 0xE02CA650;
            if ((n4 ^ n3) != -533944752) {
                int cfr_ignored_0 = (0xE66E2B48 ^ n3) - 1749346969;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ bwm ^ string.hashCode() ^ n2 + tdhb ^ i * 1832280769 ^ bwm, 9) ^ tdhb));
            }
            String[] stringArray = tkhk.ths_8(new String(cArray));
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

    private static String[] ye98569g(String string) {
        return string.split("\u0005\u0016", -1);
    }

    private static CallSite z5320bwn6o(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ mryv2wfu1 ^ string.hashCode()) + (n2 + emwladcndm) + i ^ mryv2wfu1, 23) + emwladcndm);
            }
            String[] stringArray = tkhk.ye98569g(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

