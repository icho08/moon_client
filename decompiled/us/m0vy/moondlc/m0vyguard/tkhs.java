/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_9779
 *  org.joml.Vector3d
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_9779;
import org.joml.Vector3d;
import us.m0vy.moondlc.m0vyguard.bthsh;
import us.m0vy.moondlc.m0vyguard.tdha;
import us.m0vy.moondlc.m0vyguard.yf;

public final class tkhs
implements tdha {
    public static double rbl;
    private static final int shqj = 65536;
    private static final double thhth = Math.PI * 2;
    private static final double[] khlb;
    private static final int zgh_2 = 169960670;
    private static final int shfm = 455969531;
    private static final int zfl = 1821395135;
    private static final int tthb = 934114200;
    private static final int otevurxaw8pva = 1679105507;
    private static final int pvr66s62arjse = 924909445;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jca4wz3ov5b1s4;

    public static double btz(double d) {
        int n = 1471891854;
        int n2 = (n = Integer.rotateLeft(n * -158108261, 14) ^ 0xB000F4EE) ^ 0x88454573;
        if ((n2 ^ n) != -2008726157) {
            int cfr_ignored_0 = (0xDFFE0CFD ^ n) - -1507194128;
        }
        int n3 = (int)(d * tkhs.dhsy_2(0xC27DC66D32B0184CL ^ 0x82B9995D5F79D0CFL)) & Integer.rotateLeft(0x56A7C942 ^ 0x56A836B2, 28);
        return khlb[n3];
    }

    public static double bnd_2(double d) {
        try {
            int n = 1107338797;
            n = Integer.rotateLeft(n * 2074374053, 14) ^ 0xD2246B2A;
            int n2 = n ^ 0x53AA4C56;
            if ((n2 ^ n) != 1403669590) {
                int cfr_ignored_0 = (0x11AAEA7B ^ n) + -1326440119;
            }
            if ((0x2F7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        int n = (int)(d * tkhs.hsm(0xAE8D80116B703BE0L ^ 0xEE49DF2106B9F363L) + Double.longBitsToDouble(0x5F84443EA54174B0L ^ 0x1F54443EA54174B0L)) & Integer.rotateLeft(0xFC4099F3 ^ 0x340990C, 8);
        return khlb[n];
    }

    public static float zkhh_2(double d, double d2) {
        float f = 0.0f;
        int n = 0;
        int n2 = 3968028;
        n2 = Integer.rotateLeft(n2 * 583674881, 17) ^ 0x83CE9BC0;
        int n3 = n2 ^ 0x7D728EA6;
        block25: while (true) {
            switch (n3 ^ n2) {
                case 1201195186: {
                    int cfr_ignored_0 = Integer.rotateRight(0x70A0A04A ^ n2, 17) + -1479473103;
                    throw null;
                }
                case 2104659622: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0xCCACA674 ^ n2, 12) - -851065017) * -861100427;
                    if (tkhs.taa_4()) {
                        n3 = n2 ^ 0xF213508 ^ 0x48B23E53 ^ 0x48B23E53;
                        int cfr_ignored_2 = Integer.rotateRight(0xE45FEA0B ^ n2, 15) + -1409616240;
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4798C8B2));
                        n -= 5;
                        continue block25;
                    }
                    try {
                        n += 3;
                        if ((0x4BD912BDF0F0F267L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (n2 ^ 0x3120AD34) + -931298352 - -931298352;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 ^ 0x3120AD34 ^ 0x4ADF954F ^ 0x4ADF954F;
                    }
                    continue block25;
                }
                case 824225076: {
                    int cfr_ignored_3 = Integer.rotateRight(0x5E5F420F ^ n2, 14) - 1910939404;
                    f = (float)(d + (d2 - d) * tkhs.sghf_2());
                    n3 = n2 ^ 0x85D4D92C ^ 0x1C7E0DEC ^ 0x1C7E0DEC;
                    int cfr_ignored_4 = Integer.rotateLeft(0x97DEE2A5 ^ n2, 5) - 1750798646;
                    int cfr_ignored_5 = (int)(0x556C4C9827D4EB4FL ^ (long)n2 ^ 0x6440831A2DB90709L);
                    n3 = (n2 ^ 0x562DA681) + 635805863 - 635805863;
                    n -= 3;
                    continue block25;
                }
                case 2024654084: {
                    int cfr_ignored_6 = Integer.rotateLeft(0x518C9704 ^ n2, 13) - -463214409;
                    n3 = (n2 ^ 0x907BE5AF) + -1590765755 - -1590765755;
                    int cfr_ignored_7 = Integer.rotateLeft(0x711D79A9 ^ n2, 17) + -1225827662;
                    int cfr_ignored_8 = (int)(0xB3AFD79427D4EB4FL ^ (long)n2 ^ 0x5258831A2DB8CA8EL);
                    try {
                        n -= 3;
                        if ((0xF4A07DE27DEBD901L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x7D728EA6));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 ^ 0x7D728EA6 ^ 0x9944DD30 ^ 0x9944DD30;
                    }
                    n += 5;
                    continue block25;
                }
                case 2070411972: {
                    int cfr_ignored_9 = Integer.rotateLeft(0x1DD34429 ^ n2, 6) + -1594695630;
                    int cfr_ignored_10 = (int)(0xDF61EA1427D4EB4FL ^ (long)n2 ^ 0x2958831A2DB81312L);
                    try {
                        n -= 5;
                        n3 = n2 ^ 0x7D728EA6 ^ 0xE39DE9BB ^ 0xE39DE9BB;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0x7D728EA6) + -1435810494 - -1435810494;
                    }
                    continue block25;
                }
                case -1915614127: {
                    int cfr_ignored_11 = Integer.rotateRight(0x6DA482B ^ n2, 3) + -657695632;
                    n3 = n2 ^ 0xAA62F10C ^ 0x2C176AA9 ^ 0x2C176AA9;
                    int cfr_ignored_12 = Integer.rotateLeft(0x39029529 ^ n2, 10) + -340938958;
                    int cfr_ignored_13 = (int)(0xFBB03B1427D4EB4FL ^ (long)n2 ^ 0x8B58831A2DB85AB1L);
                    n3 = (n2 ^ 0x192358AE) + -1589902454 - -1589902454;
                    int cfr_ignored_14 = Integer.rotateLeft(0xF0CDBB24 ^ n2, 17) - 759646359;
                    n3 = (n2 ^ 0x7D728EA6) + 1845010687 - 1845010687;
                    n += 5;
                    continue block25;
                }
                case 2122686892: {
                    int cfr_ignored_15 = Integer.rotateRight(0xE34FC122 ^ n2, 15) + -1962540455;
                    n3 = (n2 ^ 0xD3CD1E06) + -271178094 - -271178094;
                    int cfr_ignored_16 = Integer.rotateRight(0xB080D02 ^ n2, 4) + 1515663993;
                    n3 = (int)((long)(n2 ^ 0x7D728EA6) ^ 0x48DDF74E6CC02166L ^ 0x48DDF74E6CC02166L);
                    n -= 2;
                    continue block25;
                }
                case 1830088338: {
                    int cfr_ignored_17 = (Integer.rotateRight(0x9984FC7F ^ n2, 6) - -1686621540) * -1719337857;
                    int cfr_ignored_18 = (int)(0x5F1D302C1601B8DL ^ (long)n2 ^ 0x5B754E73CC3DA632L);
                    n3 = (n2 ^ 0x7D728EA6) + -1476000622 - -1476000622;
                    n += 5;
                    continue block25;
                }
                case -1899174836: {
                    int cfr_ignored_19 = Integer.rotateRight(0xC3B8A783 ^ n2, 11) + -1212553192;
                    n3 = n2 ^ 0x1E9FFBD3 ^ 0x2CDF5E64 ^ 0x2CDF5E64;
                    int cfr_ignored_20 = Integer.rotateLeft(0xE0F6F04D ^ n2, 15) - 1111799950;
                    int cfr_ignored_21 = (int)(0x22445E7027D4EB4FL ^ (long)n2 ^ 0x4190831A2DB9E959L);
                    int cfr_ignored_22 = (int)(0x128B9E898600E27CL ^ (long)n2 ^ 0xC063C0B23FDF88C6L);
                    n3 = n2 ^ 0x438FAA6C ^ 0x12179559 ^ 0x12179559;
                    int cfr_ignored_23 = (int)(0x6DD270E0D116D0CBL ^ (long)n2 ^ 0x1CB16E9E5AB17675L);
                    n3 = n2 ^ 0x7D728EA6 ^ 0xFF6FECA5 ^ 0xFF6FECA5;
                    continue block25;
                }
                case -1532363489: {
                    int cfr_ignored_24 = Integer.rotateLeft(0x5D96F960 ^ n2, 14) + 1504039387;
                    n3 = (int)((long)(n2 ^ 0x7D728EA6) ^ 0xCC02324B4677BC3AL ^ 0xCC02324B4677BC3AL);
                    int cfr_ignored_25 = Integer.rotateLeft(0x90AE6681 ^ n2, 5) + -1988359974;
                    int cfr_ignored_26 = (int)(0x521CC8BC27D4EB4FL ^ (long)n2 ^ 0x6C08831A2DB909E8L);
                    n -= 5;
                    continue block25;
                }
                case -129797622: {
                    int cfr_ignored_27 = (Integer.rotateRight(0x2BD751F6 ^ n2, 8) - 1399884805) * 735531511;
                    n3 = (n2 ^ 0x7D728EA6) + -24333685 - -24333685;
                    n += 3;
                    continue block25;
                }
                case 1279966787: {
                    int cfr_ignored_28 = Integer.rotateRight(0xDDF8A3CA ^ n2, 14) + -445025103;
                    n3 = n2 ^ 0x3271604B ^ 0x3984DE6F ^ 0x3984DE6F;
                    int cfr_ignored_29 = Integer.rotateRight(0xF0669CC2 ^ n2, 17) + 550148793;
                    n3 = (int)((long)(n2 ^ 0x7D728EA6) ^ 0xF26426475F2656DBL ^ 0xF26426475F2656DBL);
                    n -= 4;
                    continue block25;
                }
                case 1345141795: {
                    int cfr_ignored_30 = Integer.rotateRight(0x6CD4888B ^ n2, 16) + 840574992;
                    n3 = (n2 ^ 0x6B192652) + 677711418 - 677711418;
                    int cfr_ignored_31 = (Integer.rotateLeft(0xC2AA0CFD ^ n2, 11) - -1762315810) * -1029042947;
                    int cfr_ignored_32 = (int)(0x18A2C027D4EB4FL ^ (long)n2 ^ 0xB8F0831A2DB9ADE0L);
                    try {
                        n -= 4;
                        n3 = n2 ^ 0x7D728EA6;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(n2 ^ 0x7D728EA6) ^ 0x9F3B95323363B47EL ^ 0x9F3B95323363B47EL);
                    }
                    n += 2;
                    continue block25;
                }
                case -461000829: {
                    int cfr_ignored_33 = (Integer.rotateRight(0x61A9351A ^ n2, 15) + -673510047) * 1638479131;
                    n3 = n2 ^ 0x98028429;
                    int cfr_ignored_34 = Integer.rotateRight(0xDFC0002 ^ n2, 4) + -1243504775;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x7D728EA6));
                    continue block25;
                }
                case 1445832321: {
                    return f;
                }
            }
            int cfr_ignored_35 = (Integer.rotateRight(0xC9F46137 ^ n2, 12) - 2029348068) * -906731209;
            n3 = (n2 ^ 0x7D728EA6) + -736450184 - -736450184;
        }
    }

    public static double zkhf_2(double d, double d2, double d3, double d4, double d5) {
        try {
            int n = 1497861374;
            n = Integer.rotateLeft(n * -1631185473, 21) ^ 0x56FDA953;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 9);
            int n2 = n ^ 0x5C36F065;
            if ((n2 ^ n) != 1547104357) {
                int cfr_ignored_0 = (0x5717C9B ^ n) + -1564178768;
            }
            if ((0x218 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return Math.pow(1.0 - d, Double.longBitsToDouble(0x17484BD69EEF57C0L ^ 0x57404BD69EEF57C0L)) * d2 + Double.longBitsToDouble(0xF3733A6EF776B3F1L ^ 0xB37B3A6EF776B3F1L) * d * Math.pow(1.0 - d, Double.longBitsToDouble(0xE91DD5D8CEC007E4L ^ 0xA91DD5D8CEC007E4L)) * d3 + tkhs.dhd_3(0xA8A681778BD3380DL ^ 0xE8AE81778BD3380DL) * Math.pow(d, Double.longBitsToDouble(0x6B9720EB485C1289L ^ 0x2B9720EB485C1289L)) * (1.0 - d) * d4 + Math.pow(d, tkhs.zqn_2(0xAFA14817347F7F8BL ^ 0xEFA94817347F7F8BL)) * d5;
    }

    public static int khba_2(String string, String string2) {
        int n = bthsh.shhl(-1710185997);
        String string3 = string;
        n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 27);
        String string4 = string2;
        n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
        int n2 = n ^ 0x3A8D003D;
        if ((n2 ^ n) != 982319165) {
            int cfr_ignored_0 = Integer.rotateRight(0xA09DA1CE ^ n, 7) - 2004105005;
        }
        if (yf.dnkh()) {
            throw null;
        }
        int n3 = string.length();
        int n4 = string2.length();
        int[] nArray = new int[n4 + 1];
        int n5 = 0;
        while (n5 <= n4) {
            nArray[n5] = n5++;
        }
        for (n5 = 1; n5 <= n3; ++n5) {
            int n6 = nArray[0];
            nArray[0] = n5;
            for (int i = 1; i <= n4; ++i) {
                int n7 = nArray[i];
                int n8 = string.charAt(n5 - 1) == tkhs.sbb(string2, i - 1) ? 0 : 1;
                nArray[i] = tkhs.stsh_2(Math.min(nArray[i] + 1, nArray[i - 1] + 1), n6 + n8);
                n6 = n7;
            }
        }
        return nArray[n4];
    }

    /*
     * Unable to fully structure code
     */
    public static float thfdh(float var0, float var1_1) {
        var2_2 = 0.0f;
        var5_3 = 0;
        var3_4 = -878345887;
        var3_4 = Integer.rotateLeft(var3_4 * 1295197051, 11) ^ 185509555;
        var3_4 = Integer.rotateLeft(Float.floatToIntBits(var0) ^ var3_4, 18);
        var3_4 = Integer.rotateRight(Float.floatToIntBits(var1_1) ^ var3_4, 4);
        var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ 7171692794877060663L ^ 7171692794877060663L);
        while (true) {
            block52: {
                block64: {
                    block63: {
                        block55: {
                            block59: {
                                block57: {
                                    block50: {
                                        block60: {
                                            block47: {
                                                block51: {
                                                    block65: {
                                                        block56: {
                                                            block61: {
                                                                block62: {
                                                                    block58: {
                                                                        block49: {
                                                                            block48: {
                                                                                block46: {
                                                                                    block53: {
                                                                                        block54: {
                                                                                            var5_3 = Integer.reverse(var4_5) ^ var3_4 ^ 1452976096;
                                                                                            switch (var5_3 & 15) {
                                                                                                case 1: {
                                                                                                    if (var5_3 == 1028705153) break;
                                                                                                    ** break;
                                                                                                }
                                                                                                case 0: {
                                                                                                    if (var5_3 == -1741386448) break block46;
                                                                                                    if (var5_3 == -1390674688) break block47;
                                                                                                    Integer.rotateLeft(846423725 ^ var3_4, 9) - 542576174;
                                                                                                    (int)(-1098376312632579249L ^ (long)var3_4 ^ 7804882302692510802L);
                                                                                                    if (var5_3 != 1012339664) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block48;
                                                                                                }
                                                                                                case 7: {
                                                                                                    if (var5_3 == 1500631575) break block49;
                                                                                                    if (var5_3 != 1775306679) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block50;
                                                                                                }
                                                                                                case 4: {
                                                                                                    if (var5_3 != 343773348) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block51;
                                                                                                }
                                                                                                case 2: {
                                                                                                    if (var5_3 != -743508238) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block52;
                                                                                                }
                                                                                                case 15: {
                                                                                                    if (var5_3 != 106153023) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block53;
                                                                                                }
                                                                                                case 5: {
                                                                                                    if (var5_3 == 699689317) break block54;
                                                                                                    if (var5_3 != 862068677) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block55;
                                                                                                }
                                                                                                case 8: {
                                                                                                    if (var5_3 == -737086776) break block56;
                                                                                                    if (var5_3 != 632500968) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block57;
                                                                                                }
                                                                                                case 3: {
                                                                                                    if (var5_3 == 1022930179) break block58;
                                                                                                    if (var5_3 != -903549197) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block59;
                                                                                                }
                                                                                                case 11: {
                                                                                                    if (var5_3 == 436811579) break block60;
                                                                                                    if (var5_3 != -103992693) {
                                                                                                        (Integer.rotateRight(32550482 ^ var3_4, 3) + 1082309417) * 32550483;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block61;
                                                                                                }
                                                                                                case 9: {
                                                                                                    if (var5_3 == 1591273033) break block62;
                                                                                                    if (var5_3 == 1418708825) break block63;
                                                                                                    if (var5_3 != 536476761) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block64;
                                                                                                }
                                                                                                case 10: {
                                                                                                    if (var5_3 != -2015973894) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block65;
                                                                                                }
                                                                                            }
                                                                                            (Integer.rotateRight(-2022866478 ^ var3_4, 3) + 1788893097) * -2022866477;
                                                                                            if (!yf.dnkh()) {
                                                                                                var4_5 = Integer.reverse(var3_4 ^ 1830003846 ^ 1452976096) ^ -2125016795 ^ -2125016795;
                                                                                                Integer.rotateRight(1121918274 ^ var3_4, 11) + 492972601;
                                                                                                var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1591273033 ^ 1452976096) ^ -3156813901752187306L ^ -3156813901752187306L);
                                                                                                var5_3 += 3;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                var5_3 += 2;
                                                                                                var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1500631575 ^ 1452976096) ^ -5312881245699013260L ^ -5312881245699013260L);
                                                                                            }
                                                                                            catch (ArithmeticException v0) {
                                                                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1500631575 ^ 1452976096)));
                                                                                            }
                                                                                            var5_3 -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateLeft(1317631340 ^ var3_4, 12) - -2029856945;
                                                                                        var2_2 += tkhs.aaf_2(Integer.reverse(-1016217364) ^ 1958196931);
                                                                                        (int)(-5901264669451916475L ^ (long)var3_4 ^ 245880698004369893L);
                                                                                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1198734935 ^ 1452976096)));
                                                                                        (int)(8911430930455711486L ^ (long)var3_4 ^ 8871555564964633222L);
                                                                                        var4_5 = Integer.reverse(var3_4 ^ -1741386448 ^ 1452976096);
                                                                                        var5_3 += 3;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateRight(1350816463 ^ var3_4, 13) - -1001118132;
                                                                                    var2_2 -= tkhs.tzdh(Integer.rotateLeft(-328873158 ^ -327866822, 10));
                                                                                    try {
                                                                                        var5_3 += 2;
                                                                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ -1741386448 ^ 1452976096) ^ -7930276223303067410L ^ -7930276223303067410L);
                                                                                    }
                                                                                    catch (IllegalArgumentException v1) {
                                                                                        var4_5 = Integer.reverse(var3_4 ^ -1741386448 ^ 1452976096) + 869381233 - 869381233;
                                                                                    }
                                                                                    var5_3 += 2;
                                                                                    continue;
                                                                                }
                                                                                Integer.rotateRight(-559701757 ^ var3_4, 14) + -97640808;
                                                                                return var2_2;
                                                                            }
                                                                            (Integer.rotateRight(955900703 ^ var3_4, 10) - -358604804) * 955900703;
                                                                            if (!(var2_2 > Float.intBitsToFloat(456449240 - -671032104))) {
                                                                                var4_5 = Integer.reverse(var3_4 ^ -1741386448 ^ 1452976096);
                                                                                (Integer.rotateLeft(-1389838020 ^ var3_4, 8) - -62061185) * -1389838019;
                                                                                ++var5_3;
                                                                                continue;
                                                                            }
                                                                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ 106153023 ^ 1452976096) ^ -129121022945007830L ^ -129121022945007830L);
                                                                            var5_3 += 4;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateRight(1487064906 ^ var3_4, 14) + -1072383695;
                                                                        throw null;
                                                                    }
                                                                    (Integer.rotateRight(-1116036649 ^ var3_4, 10) - -164153276) * -1116036649;
                                                                    throw null;
                                                                }
                                                                Integer.rotateRight(-1639343834 ^ var3_4, 6) - 793193173;
                                                                var2_2 = (var0 - var1_1) % Float.intBitsToFloat(-650419941 - -1786289893);
                                                                if (!(var2_2 < Float.intBitsToFloat(1442205723 ^ -1765650405))) {
                                                                    try {
                                                                        var5_3 -= 2;
                                                                        if ((-3067746186810397047L ^ (long)var3_4 | 1L) == 0L) {
                                                                            throw new UnsupportedOperationException();
                                                                        }
                                                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1012339664 ^ 1452976096) ^ 1496390694818610275L ^ 1496390694818610275L);
                                                                    }
                                                                    catch (UnsupportedOperationException v2) {
                                                                        var4_5 = Integer.reverse(var3_4 ^ 1012339664 ^ 1452976096) ^ -13972273 ^ -13972273;
                                                                    }
                                                                    ++var5_3;
                                                                    continue;
                                                                }
                                                                (int)(-974334866770079634L ^ (long)var3_4 ^ 1316009295644084517L);
                                                                var4_5 = Integer.reverse(var3_4 ^ 669875906 ^ 1452976096) ^ 930963549 ^ 930963549;
                                                                (int)(7427484622102334080L ^ (long)var3_4 ^ -8168867131154799626L);
                                                                var4_5 = Integer.reverse(var3_4 ^ 699689317 ^ 1452976096);
                                                                ++var5_3;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(-848696562 ^ var3_4, 12) - -466545171;
                                                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ -463316123 ^ 1452976096) ^ 2604312891044835840L ^ 2604312891044835840L);
                                                            (Integer.rotateRight(-874856078 ^ var3_4, 12) + -1277490167) * -874856077;
                                                            var4_5 = Integer.reverse(var3_4 ^ 1332102552 ^ 1452976096);
                                                            (Integer.rotateRight(274922710 ^ var3_4, 5) - 5913893) * 274922711;
                                                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ -6312924792103129827L ^ -6312924792103129827L);
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(1377871653 ^ var3_4, 13) - -162407242;
                                                        (int)(-8029345186296042673L ^ (long)var3_4 ^ -1206820551675835147L);
                                                        var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) + -856124351 - -856124351;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-800895279 ^ var3_4, 13) + 1015294602) * -800895279;
                                                    (int)(1365119466955139919L ^ (long)var3_4 ^ 4370887586822588466L);
                                                    var4_5 = Integer.reverse(var3_4 ^ 220902974 ^ 1452976096);
                                                    Integer.rotateLeft(-1371803516 ^ var3_4, 8) - 497008439;
                                                    var4_5 = Integer.reverse(var3_4 ^ 1796983471 ^ 1452976096) ^ 1388666620 ^ 1388666620;
                                                    Integer.rotateLeft(-763671260 ^ var3_4, 13) - -2125728105;
                                                    var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ -2103778984 ^ -2103778984;
                                                    var5_3 += 2;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1125894334 ^ var3_4, 11) - 616230461) * 1125894335;
                                                var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) + -1412537062 - -1412537062;
                                                continue;
                                            }
                                            (Integer.rotateRight(-2130774786 ^ var3_4, 3) - -1556264451) * -2130774785;
                                            try {
                                                var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) + 456014535 - 456014535;
                                            }
                                            catch (NoSuchElementException v3) {
                                                var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ 328242490 ^ 328242490;
                                            }
                                            continue;
                                        }
                                        (Integer.rotateLeft(-123297187 ^ var3_4, 18) - 545998974) * -123297187;
                                        (int)(4184983560858692431L ^ (long)var3_4 ^ -1895871294663435783L);
                                        var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ 1001799004 ^ 1001799004;
                                        continue;
                                    }
                                    (Integer.rotateRight(-1907998405 ^ var3_4, 4) + 1054836064) * -1907998405;
                                    try {
                                        if ((-3811992213992335543L ^ (long)var3_4 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ -500007709 ^ -500007709;
                                    }
                                    catch (UnsupportedOperationException v4) {
                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ 3391316319693465031L ^ 3391316319693465031L);
                                    }
                                    var5_3 += 4;
                                    continue;
                                }
                                (Integer.rotateLeft(1041964184 ^ var3_4, 10) + -1985604189) * 1041964185;
                                var4_5 = Integer.reverse(var3_4 ^ -1801706354 ^ 1452976096);
                                Integer.rotateLeft(93265313 ^ var3_4, 3) + -1330498118;
                                (int)(-4089915403318006961L ^ (long)var3_4 ^ -7329464245086051414L);
                                var4_5 = Integer.reverse(var3_4 ^ -1336829402 ^ 1452976096);
                                (Integer.rotateRight(-361179653 ^ var3_4, 16) + 1761577120) * -361179653;
                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096)));
                                --var5_3;
                                continue;
                            }
                            Integer.rotateLeft(834337997 ^ var3_4, 9) - 167918606;
                            (int)(-934405731265483953L ^ (long)var3_4 ^ 6381744820443433921L);
                            var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) + 153136990 - 153136990;
                            var5_3 += 3;
                            continue;
                        }
                        Integer.rotateRight(-1617343794 ^ var3_4, 6) - 1475194413;
                        var4_5 = Integer.reverse(var3_4 ^ 321738549 ^ 1452976096);
                        Integer.rotateRight(109764010 ^ var3_4, 3) + -819038511;
                        try {
                            --var5_3;
                            if ((-5967448431237455683L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ 120482677 ^ 120482677;
                        }
                        catch (IllegalStateException v5) {
                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096)));
                        }
                        var5_3 += 2;
                        continue;
                    }
                    (Integer.rotateLeft(-639074504 ^ var3_4, 14) + 1736771331) * -639074503;
                    var4_5 = Integer.reverse(var3_4 ^ -314310996 ^ 1452976096) ^ 1473708218 ^ 1473708218;
                    (Integer.rotateLeft(1185966864 ^ var3_4, 11) + -1816488405) * 1185966865;
                    (int)(4986454566749281111L ^ (long)var3_4 ^ 1834209548626896823L);
                    var4_5 = Integer.reverse(var3_4 ^ 1729256460 ^ 1452976096) ^ -622422255 ^ -622422255;
                    (int)(-7762056947663573144L ^ (long)var3_4 ^ -5054915776470416034L);
                    var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096)));
                    var5_3 -= 5;
                    continue;
                }
                Integer.rotateRight(220875567 ^ var3_4, 4) - -1669547540;
                var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ -250579930 ^ -250579930;
                (Integer.rotateLeft(-674912527 ^ var3_4, 13) + 625792618) * -674912527;
                (int)(1546714669959670607L ^ (long)var3_4 ^ -1375705537702164673L);
                var5_3 += 2;
                continue;
            }
            Integer.rotateRight(1501378862 ^ var3_4, 14) - -628651059;
            var4_5 = Integer.reverse(var3_4 ^ 313873060 ^ 1452976096) + 1779023499 - 1779023499;
            (Integer.rotateLeft(1437185305 ^ var3_4, 13) + 1676315970) * 1437185305;
            (int)(-7558417707510207665L ^ (long)var3_4 ^ -3803145736854928409L);
            try {
                var5_3 -= 3;
                var4_5 = Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) + -1094260651 - -1094260651;
            }
            catch (NoSuchElementException v6) {
                var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096) ^ -2908858238768957369L ^ -2908858238768957369L);
            }
            var5_3 += 2;
            continue;
lbl304:
            // 13 sources

            Integer.rotateLeft(-1954675640 ^ var3_4, 4) + -392158221;
            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1028705153 ^ 1452976096)));
        }
    }

    public static boolean hd_3(double d, double d2, double d3, double d4, double d5, double d6) {
        try {
            int n = 857796794;
            n = Integer.rotateLeft(n * 898475493, 25) ^ 0xFFAC074A;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 29);
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0x409CEC29;
            if ((n2 ^ n) != 1084025897) {
                int cfr_ignored_0 = (0x73BC1C93 ^ n) - 1594191146;
            }
            if ((0x2DE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return d >= d3 && d <= d3 + d5 && d2 >= d4 && d2 <= d4 + d6;
    }

    public static boolean sdt_5(double d, double d2, int n, int n2, int n3, int n4) {
        try {
            int n5 = -1547074682;
            n5 = Integer.rotateLeft(n5 * -1256539819, 25) ^ 0xF7D8DB6B;
            n5 = (int)Double.doubleToLongBits(d) ^ n5;
            n5 = (int)Double.doubleToLongBits(d2) ^ n5;
            int n6 = n5 ^ 0xB8405A82;
            if ((n6 ^ n5) != -1203742078) {
                int cfr_ignored_0 = (0x1B89D904 ^ n5) + 788125492;
            }
            if ((0xA4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return d >= (double)n && d <= (double)n3 && d2 >= (double)n2 && d2 <= (double)n4;
    }

    public static float dskh(double d, double d2, double d3) {
        block0: {
            int n = bthsh.shhl(-1080293219);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 10);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0xF139459;
            if ((n2 ^ n) == 252941401) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xB08F9CC4 ^ n, 9) - 1707186935;
        }
        return (float)(d + (d2 - d) * d3);
    }

    public static float hth_4(float f, float f2) {
        block0: {
            int n = bthsh.shhl(1630484995);
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 8);
            int n2 = n ^ 0xF41DF733;
            if ((n2 ^ n) == -199362765) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9532CD30 ^ n, 5) + 361003019) * -1791832783;
        }
        return tkhs.jshgh(f - f2);
    }

    public static double afj(double d, double d2) {
        double d3 = 0.0;
        double d4 = 0.0;
        int n = 0;
        int n2 = 934583150;
        n2 = Integer.rotateLeft(n2 * -1156253435, 22) ^ 0xF5F9FEEF;
        n2 = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n2, 15);
        int n3 = n2 - 1635968537 + 896618338 - 896618338;
        while (true) {
            block30: {
                block47: {
                    block51: {
                        block53: {
                            block36: {
                                block46: {
                                    block40: {
                                        block33: {
                                            block35: {
                                                block49: {
                                                    block39: {
                                                        block54: {
                                                            block45: {
                                                                block38: {
                                                                    block37: {
                                                                        block44: {
                                                                            block31: {
                                                                                block50: {
                                                                                    block43: {
                                                                                        block32: {
                                                                                            block28: {
                                                                                                block29: {
                                                                                                    block52: {
                                                                                                        block48: {
                                                                                                            block41: {
                                                                                                                block42: {
                                                                                                                    block25: {
                                                                                                                        block34: {
                                                                                                                            block26: {
                                                                                                                                block27: {
                                                                                                                                    if ((n = n2 - n3) > -226937957) break block25;
                                                                                                                                    if (n > -1270601447) break block26;
                                                                                                                                    if (n > -1894372778) break block27;
                                                                                                                                    if (n == -2109921626) break block28;
                                                                                                                                    if (n == -1894372778) break block29;
                                                                                                                                    break block30;
                                                                                                                                }
                                                                                                                                if (n == -1482886674) break block31;
                                                                                                                                if (n == -1427880290) break block32;
                                                                                                                                if (n == -1270601447) break block33;
                                                                                                                                break block30;
                                                                                                                            }
                                                                                                                            if (n > -510047473) break block34;
                                                                                                                            if (n == -917174530) break block35;
                                                                                                                            if (n == -641449922) break block36;
                                                                                                                            if (n == -510047473) break block37;
                                                                                                                            break block30;
                                                                                                                        }
                                                                                                                        if (n == -294999121) break block38;
                                                                                                                        if (n == -241645896) break block39;
                                                                                                                        int cfr_ignored_0 = (Integer.rotateLeft(0x96F9A05C ^ n2, 5) - 1285032543) * -1762025379;
                                                                                                                        if (n == -226937957) break block40;
                                                                                                                        break block30;
                                                                                                                    }
                                                                                                                    if (n > 879600316) break block41;
                                                                                                                    if (n > 166874078) break block42;
                                                                                                                    if (n == -187331343) break block43;
                                                                                                                    if (n == 166874078) break block44;
                                                                                                                    int cfr_ignored_1 = Integer.rotateLeft(0x5BECD3C9 ^ n2, 14) + 638272658;
                                                                                                                    int cfr_ignored_2 = (int)(0x995E7DF427D4EB4FL ^ (long)n2 ^ 0x698831A2DB89F6DL);
                                                                                                                    break block30;
                                                                                                                }
                                                                                                                if (n == 551477410) break block45;
                                                                                                                if (n == 825549532) break block46;
                                                                                                                int cfr_ignored_3 = Integer.rotateLeft(0xA19E8405 ^ n2, 7) - -1768973354;
                                                                                                                int cfr_ignored_4 = (int)(0x632C2A3827D4EB4FL ^ (long)n2 ^ 0xA900831A2DB96B89L);
                                                                                                                if (n == 879600316) break block47;
                                                                                                                break block30;
                                                                                                            }
                                                                                                            if (n > 1609100346) break block48;
                                                                                                            if (n == 1001578240) break block49;
                                                                                                            if (n == 1560363535) break block50;
                                                                                                            int cfr_ignored_5 = (Integer.rotateRight(0xD5867916 ^ n2, 13) - -542750491) * -712607465;
                                                                                                            if (n == 1609100346) break block51;
                                                                                                            break block30;
                                                                                                        }
                                                                                                        if (n == 1635968537) break block52;
                                                                                                        if (n == 1867551349) break block53;
                                                                                                        if (n == 2040851453) break block54;
                                                                                                        break block30;
                                                                                                    }
                                                                                                    int cfr_ignored_6 = (Integer.rotateLeft(0xC426C63C ^ n2, 11) - -988831617) * -1004091843;
                                                                                                    if (!tkhs.zzh_7()) {
                                                                                                        int cfr_ignored_7 = (int)(0xCEB555A879BB5594L ^ (long)n2 ^ 0x56203FC5500E30BBL);
                                                                                                        n3 = n2 - -1894372778 ^ 0xB83977E1 ^ 0xB83977E1;
                                                                                                        continue;
                                                                                                    }
                                                                                                    n3 = n2 - -121034948 + -2116693818 - -2116693818;
                                                                                                    int cfr_ignored_8 = Integer.rotateLeft(0x15632B8C ^ n2, 5) - -1688214225;
                                                                                                    n3 = n2 - 166874078 + -1608357297 - -1608357297;
                                                                                                    --n;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_9 = Integer.rotateLeft(0xFD75B4E4 ^ n2, 18) - -1247901993;
                                                                                                if (d != d2) {
                                                                                                    n3 = Integer.reverse(Integer.reverse(n2 - -1482886674));
                                                                                                    int cfr_ignored_10 = (Integer.rotateLeft(0x4AFFBB38 ^ n2, 12) + 425020163) * 1258273593;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_11 = (int)(0x5237333DD589B4E2L ^ (long)n2 ^ 0x9B0B67A092E309BFL);
                                                                                                n3 = n2 - -2109921626 ^ 0xC50D7358 ^ 0xC50D7358;
                                                                                                n += 2;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_12 = (Integer.rotateRight(0x626F2252 ^ n2, 15) + -271399127) * 1651450451;
                                                                                            d4 = d;
                                                                                            n3 = Integer.reverse(Integer.reverse(n2 - 879600316));
                                                                                            ++n;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_13 = (Integer.rotateLeft(0x804E6D9 ^ n2, 4) + -51014782) * 134538969;
                                                                                        int cfr_ignored_14 = (int)(0xCAB648E427D4EB4FL ^ (long)n2 ^ 0x6CB8831A2DB838BDL);
                                                                                        d3 = d;
                                                                                        d = d2;
                                                                                        d2 = d3;
                                                                                        n3 = n2 - -499593530 ^ 0x29372DF ^ 0x29372DF;
                                                                                        int cfr_ignored_15 = Integer.rotateRight(0x85845543 ^ n2, 3) + 795079256;
                                                                                        n3 = (int)((long)(n2 - -187331343) ^ 0x56D68E8693AF9552L ^ 0x56D68E8693AF9552L);
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_16 = (Integer.rotateLeft(0x1474FA7C ^ n2, 5) - 2122839103) * 343210621;
                                                                                    d4 = ThreadLocalRandom.current().nextDouble() * (d2 - d) + d;
                                                                                    try {
                                                                                        n += 4;
                                                                                        if ((0xD16BCEE2916B198DL ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new IllegalArgumentException();
                                                                                        }
                                                                                        n3 = n2 - 879600316;
                                                                                    }
                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                        n3 = (int)((long)(n2 - 879600316) ^ 0x842F71196713A8F4L ^ 0x842F71196713A8F4L);
                                                                                    }
                                                                                    n += 3;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_17 = Integer.rotateLeft(0xA0CFE00 ^ n2, 4) + 1005609275;
                                                                                if (!(d > d2)) {
                                                                                    n3 = (int)((long)(n2 - 1169605760) ^ 0x6EF3A8C5650C52E7L ^ 0x6EF3A8C5650C52E7L);
                                                                                    int cfr_ignored_18 = Integer.rotateRight(0x40E9C60F ^ n2, 11) - -525559028;
                                                                                    n3 = n2 - -187331343;
                                                                                    continue;
                                                                                }
                                                                                n3 = n2 - -1427880290 ^ 0x32605646 ^ 0x32605646;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_19 = (Integer.rotateRight(0xD550E41B ^ n2, 13) + -651608448) * -716119013;
                                                                            if (!(d > d2)) {
                                                                                try {
                                                                                    n -= 2;
                                                                                    if ((0xB21E8795FF682E7L ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 - -187331343));
                                                                                }
                                                                                catch (ArithmeticException arithmeticException) {
                                                                                    n3 = n2 - -187331343 + -567750398 - -567750398;
                                                                                }
                                                                                n -= 3;
                                                                                continue;
                                                                            }
                                                                            n3 = n2 - 911098842 ^ 0x7073E0C2 ^ 0x7073E0C2;
                                                                            int cfr_ignored_20 = (Integer.rotateLeft(0x366447DC ^ n2, 9) - -1702735137) * 912541661;
                                                                            n3 = n2 - -1427880290 + -1725416603 - -1725416603;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_21 = Integer.rotateLeft(0x7EC80BC4 ^ n2, 18) - 1586957303;
                                                                        throw null;
                                                                    }
                                                                    int cfr_ignored_22 = (Integer.rotateLeft(0x4DB238B9 ^ n2, 12) + 1827831202) * 1303525561;
                                                                    int cfr_ignored_23 = (int)(0x8F00968427D4EB4FL ^ (long)n2 ^ 0xD078831A2DB8B3D0L);
                                                                    try {
                                                                        n3 = n2 - 1635968537;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        n3 = (int)((long)(n2 - 1635968537) ^ 0x215329C745018A63L ^ 0x215329C745018A63L);
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_24 = (Integer.rotateLeft(0x2BF6D299 ^ n2, 8) + 1463885762) * 737596057;
                                                                int cfr_ignored_25 = (int)(0xE9447CA427D4EB4FL ^ (long)n2 ^ 0x438831A2DB87F59L);
                                                                n3 = n2 - 428595152 + 1012564973 - 1012564973;
                                                                int cfr_ignored_26 = Integer.rotateLeft(0xEA315E0C ^ n2, 16) - 1616380591;
                                                                n3 = n2 - 1635968537 + 1100840037 - 1100840037;
                                                                n += 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_27 = Integer.rotateLeft(0xB46E8B0D ^ n2, 9) - -574589490;
                                                            int cfr_ignored_28 = (int)(0x76DC253027D4EB4FL ^ (long)n2 ^ 0xB710831A2DB94069L);
                                                            n3 = n2 - -2080349775;
                                                            int cfr_ignored_29 = (Integer.rotateRight(0x88BA125F ^ n2, 4) - -1830430532) * -2001071521;
                                                            n3 = (int)((long)(n2 - 1042822511) ^ 0xC168D898683090EEL ^ 0xC168D898683090EEL);
                                                            int cfr_ignored_30 = (Integer.rotateLeft(0x57C31D15 ^ n2, 13) - -1526848314) * 1472404757;
                                                            int cfr_ignored_31 = (int)(0x9571B32827D4EB4FL ^ (long)n2 ^ 0x9B20831A2DB88732L);
                                                            n3 = n2 - 1635968537 ^ 0x668D3AA2 ^ 0x668D3AA2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_32 = Integer.rotateLeft(0x4EE6AAC ^ n2, 3) - -1656976881;
                                                        n3 = (int)((long)(n2 - -109960347) ^ 0xC986110D56083F14L ^ 0xC986110D56083F14L);
                                                        int cfr_ignored_33 = (Integer.rotateLeft(0x3C964F34 ^ n2, 10) - 1519466119) * 1016483637;
                                                        n3 = n2 - 1635968537 + -88891168 - -88891168;
                                                        n += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_34 = Integer.rotateRight(0x6F6702E7 ^ n2, 16) - -2116617932;
                                                    n3 = (int)((long)(n2 - -1140391411) ^ 0xC8254111EAF79229L ^ 0xC8254111EAF79229L);
                                                    int cfr_ignored_35 = (Integer.rotateRight(0xC6069172 ^ n2, 11) + -14074871) * -972648077;
                                                    try {
                                                        n += 3;
                                                        n3 = n2 - 1635968537 + 799944045 - 799944045;
                                                    }
                                                    catch (ArithmeticException arithmeticException) {
                                                        n3 = n2 - 1635968537 ^ 0xBBC74BA6 ^ 0xBBC74BA6;
                                                    }
                                                    n += 3;
                                                    continue;
                                                }
                                                int cfr_ignored_36 = Integer.rotateLeft(0x47695044 ^ n2, 11) - -1440852105;
                                                n3 = n2 - -1796679165 ^ 0x56AC2AC ^ 0x56AC2AC;
                                                int cfr_ignored_37 = Integer.rotateRight(0xE97B5C27 ^ n2, 16) - 1246611444;
                                                n3 = (int)((long)(n2 - 1635968537) ^ 0x9FD48280181122F2L ^ 0x9FD48280181122F2L);
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_38 = Integer.rotateLeft(0x2A81F64C ^ n2, 8) - 706376303;
                                            n3 = n2 - 311782391 ^ 0x963D5520 ^ 0x963D5520;
                                            int cfr_ignored_39 = Integer.rotateLeft(0xBCBE5D08 ^ n2, 10) + -546643149;
                                            try {
                                                ++n;
                                                n3 = (int)((long)(n2 - 1635968537) ^ 0x210B300D2F067BD1L ^ 0x210B300D2F067BD1L);
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                n3 = n2 - 1635968537;
                                            }
                                            ++n;
                                            continue;
                                        }
                                        int cfr_ignored_40 = Integer.rotateRight(0x95DB8743 ^ n2, 5) + 703791192;
                                        try {
                                            n -= 2;
                                            n3 = (int)((long)(n2 - 1635968537) ^ 0x80CE8AD5AF3050FFL ^ 0x80CE8AD5AF3050FFL);
                                        }
                                        catch (ArithmeticException arithmeticException) {
                                            n3 = Integer.reverse(Integer.reverse(n2 - 1635968537));
                                        }
                                        n += 3;
                                        continue;
                                    }
                                    int cfr_ignored_41 = (Integer.rotateRight(0xBC19C95E ^ n2, 10) - -881000035) * -1139160737;
                                    n3 = n2 - -228333777;
                                    int cfr_ignored_42 = Integer.rotateLeft(0xF4C457AD ^ n2, 17) - -1474020050;
                                    int cfr_ignored_43 = (int)(0x3676F99027D4EB4FL ^ (long)n2 ^ 0xE50831A2DB9C13CL);
                                    int cfr_ignored_44 = (int)(0x264231E47A298CC3L ^ (long)n2 ^ 0x9EB838E0E2A1E155L);
                                    n3 = n2 - 1635968537 + -425518904 - -425518904;
                                    n -= 3;
                                    continue;
                                }
                                int cfr_ignored_45 = Integer.rotateLeft(0x7FD8E089 ^ n2, 18) + 2141245394;
                                int cfr_ignored_46 = (int)(0xBD6A4EB427D4EB4FL ^ (long)n2 ^ 0x6018831A2DB8D705L);
                                n3 = n2 - 1386236997 + -1387475013 - -1387475013;
                                int cfr_ignored_47 = Integer.rotateRight(0x1582F8AA ^ n2, 5) + -1623606319;
                                int cfr_ignored_48 = (int)(0x50B26EF628DB9CF2L ^ (long)n2 ^ 0x209C9D04C2C30CB5L);
                                n3 = (int)((long)(n2 - -88317690) ^ 0x338CFD45C36ED59EL ^ 0x338CFD45C36ED59EL);
                                int cfr_ignored_49 = (int)(0xB43A48CCE7663588L ^ (long)n2 ^ 0x6CE9027F9036C5A5L);
                                n3 = n2 - 1635968537 + -70829846 - -70829846;
                                --n;
                                continue;
                            }
                            int cfr_ignored_50 = Integer.rotateRight(0x1EE3EAB ^ n2, 3) + 1077360112;
                            try {
                                n += 2;
                                if ((0x1DC620DE70ACA851L ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                n3 = n2 - 1635968537 ^ 0xB852606E ^ 0xB852606E;
                            }
                            catch (IllegalStateException illegalStateException) {
                                n3 = (int)((long)(n2 - 1635968537) ^ 0x39057CD5C50A0421L ^ 0x39057CD5C50A0421L);
                            }
                            n += 4;
                            continue;
                        }
                        int cfr_ignored_51 = Integer.rotateLeft(0xDF1DB74C ^ n2, 14) - 150393199;
                        n3 = Integer.reverse(Integer.reverse(n2 - -1465248862));
                        int cfr_ignored_52 = (Integer.rotateRight(0x104DD4DF ^ n2, 5) - -37067204) * 273536223;
                        n3 = n2 - 1635968537 ^ 0x3E9EC74D ^ 0x3E9EC74D;
                        int cfr_ignored_53 = (Integer.rotateLeft(0xFAD01B34 ^ n2, 18) - 1670441607) * -87024843;
                        continue;
                    }
                    int cfr_ignored_54 = (Integer.rotateRight(0xA6F9B956 ^ n2, 7) - 1016795301) * -1493583529;
                    n3 = Integer.reverse(Integer.reverse(n2 - -822835849));
                    int cfr_ignored_55 = Integer.rotateRight(0x11A81ECF ^ n2, 5) - 666458700;
                    try {
                        n += 5;
                        if ((0x63EDA10A58CD9AE5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 1635968537));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1635968537));
                    }
                    n -= 5;
                    continue;
                }
                return d4;
            }
            int cfr_ignored_56 = Integer.rotateRight(0x5CE23E6F ^ n2, 14) - 1136864940;
            n3 = (int)((long)(n2 - 1635968537) ^ 0x82F08E96CFB85865L ^ 0x82F08E96CFB85865L);
        }
    }

    public static float tml_2(float f) {
        block0: {
            int n = 1263888071;
            n = Integer.rotateLeft(n * 1362265027, 19) ^ 0x587380C9;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 22);
            int n2 = n ^ 0xC2E83C90;
            if ((n2 ^ n) == -1024967536) break block0;
            int cfr_ignored_0 = (0x89BD5A57 ^ n) + -1875436973;
        }
        return (float)Math.round(f * Float.intBitsToFloat(tkhs.dhsh(1453222173) ^ 0xF9B6796A)) / Float.intBitsToFloat(0x3137FAA3 ^ 0x7017FAA3);
    }

    public static double dhdth_2(double d, double d2) {
        try {
            int n = -1803855329;
            n = Integer.rotateLeft(n * -1723579961, 4) ^ 0xF1EA8E97;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 8);
            int n2 = n ^ 0x48DF6912;
            if ((n2 ^ n) != 1222600978) {
                int cfr_ignored_0 = (0xDCA4330D ^ n) + -254136429;
            }
            if ((0x389 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        double d3 = (double)Math.round(d / d2) * d2;
        return (double)Math.round(d3 * Double.longBitsToDouble(0x40F578A990D7F888L ^ 0xAC78A990D7F888L)) / Double.longBitsToDouble(0xF243B036FE5E1402L ^ 0xB21AB036FE5E1402L);
    }

    public static class_243 asht(int n, int n2, double d) {
        int n3 = -651608019;
        n3 = Integer.rotateLeft(n3 * 1037259277, 18) ^ 0x43C1DD32;
        n3 = n ^ n3;
        int n4 = (n3 = n2 ^ n3) ^ 0x97214547;
        if ((n4 ^ n3) != -1759427257) {
            int cfr_ignored_0 = (0x4E08056A ^ n3) - -2089536864;
        }
        int n5 = Math.min(n, n2);
        float f = (float)(Math.cos((double)n5 * rbl / (double)n2) * d);
        float f2 = (float)(-tkhs.tqz((double)n5 * rbl / (double)n2) * d);
        return new class_243((double)f, 0.0, (double)f2);
    }

    public static Vector3d shal_2(Vector3d vector3d, Vector3d vector3d2) {
        int n = bthsh.shhl(-691601587);
        int n2 = n ^ 0x1CC81A1B;
        if ((n2 ^ n) != 482875931) {
            int cfr_ignored_0 = (Integer.rotateRight(0xCA0EE556 ^ n, 12) - 2083218597) * -904993449;
        }
        return new Vector3d(tkhs.shah_2(vector3d.x, vector3d2.x), tkhs.jds(vector3d.y, vector3d2.y), tkhs.hzth_2(vector3d.z, vector3d2.z));
    }

    public static class_243 hdm(class_243 class_2432, class_243 class_2433) {
        int n = 975959029;
        n = Integer.rotateLeft(n * 184349853, 24) ^ 0x41704B17;
        class_243 class_2434 = class_2433;
        n = Integer.rotateRight((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 18);
        int n2 = n ^ 0xE338F735;
        if ((n2 ^ n) != -482805963) {
            int cfr_ignored_0 = (0xD91304C0 ^ n) + 976601434;
        }
        return new class_243(tkhs.shah_2(class_2432.field_1352, class_2433.field_1352), tkhs.shah_2(class_2432.field_1351, class_2433.field_1351), tkhs.shah_2(class_2432.field_1350, class_2433.field_1350));
    }

    public static class_243 sdh_8(class_1297 class_12972) {
        int n = bthsh.shhl(914799994);
        class_1297 class_12973 = class_12972;
        n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 2);
        int n2 = n ^ 0x362E5331;
        if ((n2 ^ n) != 909005617) {
            int cfr_ignored_0 = Integer.rotateRight(0xA8EE4B ^ n, 3) + 416447056;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return class_12972 == null ? class_243.field_1353 : new class_243(tkhs.khhth_2(class_12972.field_6014, class_12972.method_23317()), tkhs.shah_2(class_12972.field_6036, class_12972.method_23318()), tkhs.shah_2(class_12972.field_5969, class_12972.method_23321()));
    }

    public static float rqh_2(float f, float f2) {
        block0: {
            int n = 1426840316;
            int n2 = (n = Integer.rotateLeft(n * 846658763, 8) ^ 0x5388E60F) ^ 0xDBA0B041;
            if ((n2 ^ n) == -610226111) break block0;
            int cfr_ignored_0 = (0x8EAB6ABD ^ n) - 1739809025;
        }
        return class_3532.method_16439((float)mc.method_61966().method_60637(false), (float)f, (float)f2);
    }

    /*
     * Unable to fully structure code
     */
    public static double shah_2(double var0, double var2_1) {
        var6_2 = 0;
        var4_3 = -1269892407;
        var4_3 = Integer.rotateLeft(var4_3 * 1854859769, 20) ^ -139759525;
        var4_3 = Integer.rotateRight((int)Double.doubleToLongBits(var0) ^ var4_3, 2);
        var4_3 = Integer.rotateLeft((int)Double.doubleToLongBits(var2_1) ^ var4_3, 12);
        var5_4 = var4_3 - 1109988970 + -653554682 - -653554682;
        while (true) {
            block31: {
                block40: {
                    block39: {
                        block29: {
                            block35: {
                                block33: {
                                    block32: {
                                        block38: {
                                            block41: {
                                                block36: {
                                                    block34: {
                                                        block37: {
                                                            block30: {
                                                                var6_2 = var4_3 - var5_4;
                                                                switch (var6_2 & 7) {
                                                                    case 0: {
                                                                        if (var6_2 == -1546156032) break block29;
                                                                        if (var6_2 != -1031188920) {
                                                                            ** break;
                                                                        }
                                                                        break block30;
                                                                    }
                                                                    case 1: {
                                                                        if (var6_2 == -1496007103) break block31;
                                                                        if (var6_2 != 695533849) {
                                                                            ** break;
                                                                        }
                                                                        break block32;
                                                                    }
                                                                    case 2: {
                                                                        if (var6_2 == 1109988970) break;
                                                                        ** break;
                                                                    }
                                                                    case 3: {
                                                                        if (var6_2 == 893060291) break block33;
                                                                        if (var6_2 != 371151475) {
                                                                            ** break;
                                                                        }
                                                                        break block34;
                                                                    }
                                                                    case 4: {
                                                                        if (var6_2 == 1701115524) break block35;
                                                                        if (var6_2 != -79720852) {
                                                                            (Integer.rotateLeft(481475440 ^ var4_3, 6) + 2114081227) * 481475441;
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 5: {
                                                                        if (var6_2 != -1226248795) {
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 6: {
                                                                        if (var6_2 == 1316159270) break block38;
                                                                        if (var6_2 != 831314030) {
                                                                            Integer.rotateLeft(-2052548119 ^ var4_3, 3) + 868762226;
                                                                            (int)(5123468910428220239L ^ (long)var4_3 ^ -7865392600743074843L);
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 7: {
                                                                        if (var6_2 == -412546721) break block40;
                                                                        if (var6_2 != 1030665279) {
                                                                            (Integer.rotateRight(-1369604930 ^ var4_3, 8) - 565164605) * -1369604929;
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                }
                                                                Integer.rotateLeft(-2119635616 ^ var4_3, 3) + -1210950181;
                                                                if (!yf.khdha_2()) {
                                                                    var5_4 = var4_3 - -1226248795;
                                                                    var6_2 += 5;
                                                                    continue;
                                                                }
                                                                (int)(8434347782341462026L ^ (long)var4_3 ^ 6362778759144359880L);
                                                                var5_4 = Integer.reverse(Integer.reverse(var4_3 - -1031188920));
                                                                var6_2 += 3;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(-1608129603 ^ var4_3, 7) - 1760834334) * -1608129603;
                                                            (int)(7104232150019664719L ^ (long)var4_3 ^ 7381543937719757055L);
                                                            return tkhs.sqa_3(tkhs.mc.method_61966().method_60637(false), var0, var2_1);
                                                        }
                                                        Integer.rotateRight(-545978589 ^ var4_3, 14) + 327777400;
                                                        yf.athz_2();
                                                        throw null;
                                                    }
                                                    (Integer.rotateRight(-1260458858 ^ var4_3, 9) - -346274459) * -1260458857;
                                                    try {
                                                        var6_2 -= 4;
                                                        if ((5266474386726248975L ^ (long)var4_3 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        var5_4 = var4_3 - 1109988970 ^ 1228011967 ^ 1228011967;
                                                    }
                                                    catch (ArithmeticException v0) {
                                                        var5_4 = var4_3 - 1109988970 + -2128259619 - -2128259619;
                                                    }
                                                    continue;
                                                }
                                                (Integer.rotateRight(810749814 ^ var4_3, 9) - -563315067) * 810749815;
                                                var5_4 = (int)((long)(var4_3 - 934359692) ^ -4988606212032642869L ^ -4988606212032642869L);
                                                (Integer.rotateRight(9880222 ^ var4_3, 3) - 379531357) * 9880223;
                                                try {
                                                    var6_2 += 3;
                                                    var5_4 = var4_3 - 1109988970;
                                                }
                                                catch (IllegalArgumentException v1) {
                                                    var5_4 = Integer.reverse(Integer.reverse(var4_3 - 1109988970));
                                                }
                                                var6_2 += 4;
                                                continue;
                                            }
                                            Integer.rotateRight(-149370586 ^ var4_3, 17) - -262276395;
                                            var5_4 = var4_3 - 1109988970 ^ -1676327895 ^ -1676327895;
                                            continue;
                                        }
                                        Integer.rotateRight(973175055 ^ var4_3, 10) - 176900108;
                                        var5_4 = (int)((long)(var4_3 - 1109988970) ^ 9221922828370499945L ^ 9221922828370499945L);
                                        var6_2 += 5;
                                        continue;
                                    }
                                    Integer.rotateLeft(-1537834423 ^ var4_3, 7) + -354982382;
                                    (int)(7414099763954772815L ^ (long)var4_3 ^ -6514312712531910631L);
                                    try {
                                        var6_2 += 2;
                                        var5_4 = var4_3 - 1109988970 + 1944257154 - 1944257154;
                                    }
                                    catch (ArithmeticException v2) {
                                        var5_4 = var4_3 - 1109988970;
                                    }
                                    ++var6_2;
                                    continue;
                                }
                                Integer.rotateLeft(-1404632083 ^ var4_3, 8) - -520677138;
                                (int)(7995487822999251791L ^ (long)var4_3 ^ -6426492519798181830L);
                                (int)(-671247446023880909L ^ (long)var4_3 ^ 9039535911129333903L);
                                var5_4 = var4_3 - 1109988970 + -953957595 - -953957595;
                                ++var6_2;
                                continue;
                            }
                            Integer.rotateRight(-235129306 ^ var4_3, 17) - 1374170581;
                            var5_4 = var4_3 - 917374963 + 1829513043 - 1829513043;
                            Integer.rotateRight(1868273647 ^ var4_3, 16) - -2139814612;
                            var5_4 = (int)((long)(var4_3 - 1109988970) ^ -4234692513825377152L ^ -4234692513825377152L);
                            Integer.rotateRight(979433795 ^ var4_3, 10) + 370921048;
                            continue;
                        }
                        Integer.rotateRight(1730553994 ^ var4_3, 15) + -2114156559;
                        var5_4 = var4_3 - -1683456531 + -816026074 - -816026074;
                        Integer.rotateRight(-89149278 ^ var4_3, 18) + 1604584153;
                        var5_4 = (int)((long)(var4_3 - 1109988970) ^ 7198095985158288542L ^ 7198095985158288542L);
                        var6_2 -= 5;
                        continue;
                    }
                    Integer.rotateLeft(-1342051036 ^ var4_3, 9) - 1419335319;
                    (int)(6606058864029259821L ^ (long)var4_3 ^ 2477660540046744203L);
                    var5_4 = var4_3 - 1109988970 ^ -1194133065 ^ -1194133065;
                    var6_2 += 5;
                    continue;
                }
                Integer.rotateRight(-1309136954 ^ var4_3, 9) - -1855295435;
                try {
                    var6_2 += 4;
                    if ((-2687695214610954619L ^ (long)var4_3 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var5_4 = var4_3 - 1109988970 + 1002421015 - 1002421015;
                }
                catch (UnsupportedOperationException v3) {
                    var5_4 = var4_3 - 1109988970 ^ -1060063645 ^ -1060063645;
                }
                continue;
            }
            (Integer.rotateLeft(-740215504 ^ var4_3, 13) + -1398599669) * -740215503;
            var5_4 = var4_3 - 1109988970 + -1349130039 - -1349130039;
            Integer.rotateRight(-2068438846 ^ var4_3, 3) + 376149689;
            ++var6_2;
            continue;
lbl184:
            // 9 sources

            Integer.rotateLeft(1068575693 ^ var4_3, 10) - -1160647410;
            (int)(-215181090676741297L ^ (long)var4_3 ^ -679899395273500714L);
            var5_4 = (int)((long)(var4_3 - 1109988970) ^ -2317331177671210834L ^ -2317331177671210834L);
        }
    }

    public static int tshm_2(double d, int n, int n2) {
        try {
            int n3 = 187146742;
            n3 = Integer.rotateLeft(n3 * -234795251, 4) ^ 0x8E785576;
            n3 = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n3, 18);
            n3 = n ^ n3;
            int n4 = n3 ^ 0xFEC6CE07;
            if ((n4 ^ n3) != -20525561) {
                int cfr_ignored_0 = (0xF5E16FF1 ^ n3) - 1105735878;
            }
            if ((0x302 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return (int)class_3532.method_16436((double)((double)mc.method_61966().method_60638() / d), (double)n, (double)n2);
    }

    public static float swd_2(double d, float f, float f2) {
        int n = 0;
        int n2 = -910703704;
        n2 = Integer.rotateLeft(n2 * -162424575, 28) ^ 0xFD1A3DF;
        n2 = Integer.rotateRight(Float.floatToIntBits(f) ^ n2, 7);
        int n3 = n2 - -536124808;
        block25: while (true) {
            switch (n2 - n3) {
                case 1294546309: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x5FC791F3 ^ n2, 14) + -1652012120) * 1606914547;
                    yf.athz_2();
                    int cfr_ignored_1 = (int)(0x1D0FF50E79E052E8L ^ (long)n2 ^ 0x176C3F735EF797CEL);
                    n3 = (int)((long)(n2 - -917393772) ^ 0x864FE7F3CBF95ABAL ^ 0x864FE7F3CBF95ABAL);
                    int cfr_ignored_2 = (int)(0x7D79593627985DD3L ^ (long)n2 ^ 0x4F1C838340815723L);
                    n3 = Integer.reverse(Integer.reverse(n2 - -648289591));
                    n += 2;
                    continue block25;
                }
                case -536124808: {
                    int cfr_ignored_3 = Integer.rotateLeft(0xB6037DC1 ^ n2, 9) + 248109466;
                    int cfr_ignored_4 = (int)(0x74B1D3FC27D4EB4FL ^ (long)n2 ^ 0x5A88831A2DB944B2L);
                    if (!yf.khdha_2()) {
                        n3 = n2 - 1294546309;
                        n -= 5;
                        continue block25;
                    }
                    int cfr_ignored_5 = (int)(0x24F0E72F847FE994L ^ (long)n2 ^ 0x332FC44C280FE430L);
                    n3 = n2 - -648289591;
                    n -= 3;
                    continue block25;
                }
                case -648289591: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x6B20E054 ^ n2, 16) - -44512921) * 1797316693;
                    return (float)class_3532.method_16436((double)((double)mc.method_61966().method_60638() / d), (double)f, (double)f2);
                }
                case 1238557162: {
                    int cfr_ignored_7 = Integer.rotateLeft(0xE0B5B320 ^ n2, 15) + 979259419;
                    try {
                        if ((0xC14C8F5F06B0000DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 - -536124808 ^ 0xAF0290EB ^ 0xAF0290EB;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - -536124808 + -1045519704 - -1045519704;
                    }
                    n += 5;
                    continue block25;
                }
                case -956462373: {
                    int cfr_ignored_8 = (Integer.rotateRight(0xD546C7B7 ^ n2, 13) - -672149916) * -716781641;
                    n3 = n2 - -611185936;
                    int cfr_ignored_9 = Integer.rotateLeft(0x1D7BE145 ^ n2, 6) - -1772231018;
                    int cfr_ignored_10 = (int)(0xDFC94F7827D4EB4FL ^ (long)n2 ^ 0x6380831A2DB81243L);
                    n3 = Integer.reverse(Integer.reverse(n2 - -536124808));
                    continue block25;
                }
                case 1642438851: {
                    int cfr_ignored_11 = (Integer.rotateRight(0x5F4EA1BF ^ n2, 14) - -1897712292) * 1598988735;
                    n3 = n2 - 659977642 + -1705399822 - -1705399822;
                    int cfr_ignored_12 = Integer.rotateRight(0x2D1D9C6 ^ n2, 3) - 1539767861;
                    try {
                        n += 4;
                        if ((0xF8C485C03A91C5CFL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - -536124808));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - -536124808));
                    }
                    continue block25;
                }
                case 40441124: {
                    int cfr_ignored_13 = Integer.rotateRight(0xCFD09A43 ^ n2, 12) + 782257496;
                    n3 = n2 - -802519417 ^ 0x18C662ED ^ 0x18C662ED;
                    int cfr_ignored_14 = Integer.rotateRight(0x205CF76E ^ n2, 7) - -274754163;
                    n3 = (int)((long)(n2 - -536124808) ^ 0x9296BC0B435CD5D7L ^ 0x9296BC0B435CD5D7L);
                    n += 3;
                    continue block25;
                }
                case 1096908566: {
                    int cfr_ignored_15 = Integer.rotateLeft(0x9FF76D6D ^ n2, 6) - 1666441070;
                    int cfr_ignored_16 = (int)(0x5D45C35027D4EB4FL ^ (long)n2 ^ 0x7BD0831A2DB9175AL);
                    n3 = n2 - -411248169 + 429510187 - 429510187;
                    int cfr_ignored_17 = Integer.rotateLeft(0xD1DD49C5 ^ n2, 13) - 1848217110;
                    int cfr_ignored_18 = (int)(0x136FE7F827D4EB4FL ^ (long)n2 ^ 0x3280831A2DB98B0EL);
                    n3 = n2 - -2056549217 ^ 0x8320C98F ^ 0x8320C98F;
                    int cfr_ignored_19 = (Integer.rotateLeft(0x4D560111 ^ n2, 12) + 1640480842) * 1297482001;
                    int cfr_ignored_20 = (int)(0x8FE4AF2C27D4EB4FL ^ (long)n2 ^ 0xA328831A2DB8B218L);
                    n3 = (int)((long)(n2 - -536124808) ^ 0xAB24075E230FA211L ^ 0xAB24075E230FA211L);
                    --n;
                    continue block25;
                }
                case 1576788792: {
                    int cfr_ignored_21 = (Integer.rotateRight(0x6C7226F7 ^ n2, 16) - 640702244) * 1819420407;
                    n3 = n2 - 170806664 ^ 0x54E6353B ^ 0x54E6353B;
                    int cfr_ignored_22 = (Integer.rotateRight(0x85260773 ^ n2, 3) + 603489832) * -2061105293;
                    try {
                        ++n;
                        n3 = n2 - -536124808 + -652736648 - -652736648;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - -536124808 ^ 0x65B6E03 ^ 0x65B6E03;
                    }
                    n += 4;
                    continue block25;
                }
                case -1707360233: {
                    int cfr_ignored_23 = (Integer.rotateRight(0xE7B6B332 ^ n2, 15) + 326980169) * -407456973;
                    n3 = n2 - 709072816 + 538862608 - 538862608;
                    int cfr_ignored_24 = Integer.rotateLeft(0xDF2A9769 ^ n2, 14) + 176551154;
                    int cfr_ignored_25 = (int)(0x1D98395427D4EB4FL ^ (long)n2 ^ 0x8FD8831A2DB996E1L);
                    try {
                        if ((0x5B02C690404CA107L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 - -536124808 + -1311136998 - -1311136998;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - -536124808));
                    }
                    ++n;
                    continue block25;
                }
                case 169419100: {
                    int cfr_ignored_26 = (Integer.rotateRight(0xC3DC4EFA ^ n2, 11) + -1140117631) * -1008972037;
                    int cfr_ignored_27 = (int)(0xF3786A2D0A76E4BBL ^ (long)n2 ^ 0x292AD85E32504B21L);
                    n3 = Integer.reverse(Integer.reverse(n2 - 627391405));
                    int cfr_ignored_28 = (int)(0x429371941E58C452L ^ (long)n2 ^ 0x1E58F002738328F7L);
                    n3 = Integer.reverse(Integer.reverse(n2 - -536124808));
                    n += 2;
                    continue block25;
                }
                case 1006872808: {
                    int cfr_ignored_29 = Integer.rotateRight(0x71E73363 ^ n2, 17) + -815998920;
                    try {
                        n += 4;
                        if ((0x5BF35F6D6B5E8449L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(n2 - -536124808) ^ 0x86048309FDAE8F10L ^ 0x86048309FDAE8F10L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(n2 - -536124808) ^ 0x2E088F08D70E04A1L ^ 0x2E088F08D70E04A1L);
                    }
                    n += 3;
                    continue block25;
                }
                case -119838383: {
                    int cfr_ignored_30 = (Integer.rotateLeft(0x55659D4 ^ n2, 3) - -1445822489) * 89545173;
                    n3 = n2 - -1152853506 ^ 0xB05AD317 ^ 0xB05AD317;
                    int cfr_ignored_31 = Integer.rotateRight(0x49A15123 ^ n2, 12) + -286887304;
                    n3 = n2 - 1028254388 + -1090748289 - -1090748289;
                    int cfr_ignored_32 = Integer.rotateLeft(0xE418A0A9 ^ n2, 15) + -1554443342;
                    int cfr_ignored_33 = (int)(0x26AA0E9427D4EB4FL ^ (long)n2 ^ 0xE058831A2DB9E085L);
                    n3 = n2 - -536124808 + -440659360 - -440659360;
                    --n;
                    continue block25;
                }
            }
            int cfr_ignored_34 = Integer.rotateRight(0x198F838B ^ n2, 6) + 482250000;
            n3 = n2 - -536124808 ^ 0xFD394F4D ^ 0xFD394F4D;
        }
    }

    public static double rts_3(double d, double d2, double d3) {
        block0: {
            int n = 682877438;
            int n2 = (n = Integer.rotateLeft(n * -915022175, 8) ^ 0xA715C9A4) ^ 0x4BFFD7D4;
            if ((n2 ^ n) == 1275058132) break block0;
            int cfr_ignored_0 = (0x634C362A ^ n) + 1672071765;
        }
        return class_3532.method_16436((double)((double)tkhs.syj(mc).method_60638() / d), (double)d2, (double)d3);
    }

    /*
     * Unable to fully structure code
     */
    public static double thsn(class_243 var0, class_243 var1_1) {
        var2_2 = 0.0;
        var4_3 = 0.0;
        var6_4 = 0.0;
        var8_5 = 0.0;
        var12_6 = 0;
        var10_7 = -1001940674;
        var10_7 = Integer.rotateLeft(var10_7 * 1763180339, 14) ^ -800902530;
        var11_8 = Integer.reverse(Integer.reverse(169743183 + var10_7));
        while (true) {
            block43: {
                block48: {
                    block46: {
                        block47: {
                            block45: {
                                block49: {
                                    block50: {
                                        block41: {
                                            block44: {
                                                block40: {
                                                    block39: {
                                                        block51: {
                                                            block42: {
                                                                var12_6 = var11_8 - var10_7;
                                                                switch (var12_6 & 7) {
                                                                    case 4: {
                                                                        if (var12_6 == 967476548) break block39;
                                                                        if (var12_6 == -1709424700) break block40;
                                                                        Integer.rotateLeft(-2047204376 ^ var10_7, 3) + 1034418259;
                                                                        if (var12_6 != 1520858332) {
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                    case 1: {
                                                                        if (var12_6 == -853452279) break block42;
                                                                        if (var12_6 == 77782817) break block43;
                                                                        if (var12_6 != 662575521) {
                                                                            ** break;
                                                                        }
                                                                        break block44;
                                                                    }
                                                                    case 2: {
                                                                        if (var12_6 == 1993838378) break;
                                                                        if (var12_6 == -189952502) break block45;
                                                                        Integer.rotateRight(488935307 ^ var10_7, 6) + -1949630192;
                                                                        if (var12_6 != 595273562) {
                                                                            ** break;
                                                                        }
                                                                        break block46;
                                                                    }
                                                                    case 6: {
                                                                        if (var12_6 == 122353758) break block47;
                                                                        if (var12_6 != 539293886) {
                                                                            ** break;
                                                                        }
                                                                        break block48;
                                                                    }
                                                                    case 0: {
                                                                        if (var12_6 != 1456688632) {
                                                                            ** break;
                                                                        }
                                                                        break block49;
                                                                    }
                                                                    case 7: {
                                                                        if (var12_6 == -1099610777) break block50;
                                                                        if (var12_6 != 169743183) {
                                                                            ** break;
                                                                        }
                                                                        break block51;
                                                                    }
                                                                }
                                                                (Integer.rotateLeft(-841809256 ^ var10_7, 12) + -253038685) * -841809255;
                                                                var2_2 = var0.method_10216() - tkhs.zsd_5(var1_1);
                                                                var4_3 = var0.method_10214() - var1_1.method_10214();
                                                                var6_4 = var0.method_10215() - var1_1.method_10215();
                                                                var8_5 = tkhs.zrq_2((float)(var2_2 * var2_2 + var4_3 * var4_3 + var6_4 * var6_4));
                                                                try {
                                                                    var12_6 += 4;
                                                                    if ((4500526674257742287L ^ (long)var10_7 | 1L) == 0L) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    var11_8 = 77782817 + var10_7 ^ -344358333 ^ -344358333;
                                                                }
                                                                catch (IllegalStateException v0) {
                                                                    var11_8 = (int)((long)(77782817 + var10_7) ^ 1712541774130768701L ^ 1712541774130768701L);
                                                                }
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(-1611384808 ^ var10_7, 6) + 1659922979) * -1611384807;
                                                            yf.athz_2();
                                                            try {
                                                                var12_6 -= 4;
                                                                var11_8 = 1993838378 + var10_7 ^ -1984800422 ^ -1984800422;
                                                            }
                                                            catch (IllegalArgumentException v1) {
                                                                var11_8 = 1993838378 + var10_7;
                                                            }
                                                            var12_6 += 4;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-268242504 ^ var10_7, 17) + 347661443) * -268242503;
                                                        if (yf.khdha_2()) {
                                                            try {
                                                                if ((2403989967330256275L ^ (long)var10_7 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                var11_8 = 1993838378 + var10_7 + -971841496 - -971841496;
                                                            }
                                                            catch (ArithmeticException v2) {
                                                                var11_8 = 1993838378 + var10_7 + 1785186572 - 1785186572;
                                                            }
                                                            ++var12_6;
                                                            continue;
                                                        }
                                                        try {
                                                            if ((3534129310772704803L ^ (long)var10_7 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            var11_8 = -853452279 + var10_7;
                                                        }
                                                        catch (IllegalArgumentException v3) {
                                                            var11_8 = Integer.reverse(Integer.reverse(-853452279 + var10_7));
                                                        }
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(2078071280 ^ var10_7, 18) + 68944715) * 2078071281;
                                                    var11_8 = -409210955 + var10_7 ^ -997262411 ^ -997262411;
                                                    Integer.rotateRight(571257255 ^ var10_7, 7) - 602350196;
                                                    try {
                                                        if ((-4736640677117611651L ^ (long)var10_7 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        var11_8 = 169743183 + var10_7 + 1582468050 - 1582468050;
                                                    }
                                                    catch (ArithmeticException v4) {
                                                        var11_8 = Integer.reverse(Integer.reverse(169743183 + var10_7));
                                                    }
                                                    continue;
                                                }
                                                Integer.rotateLeft(-1198408095 ^ var10_7, 10) + 1577299194;
                                                (int)(8800896084803382095L ^ (long)var10_7 ^ -2465576647525836393L);
                                                var11_8 = -385434968 + var10_7 + -896291903 - -896291903;
                                                (Integer.rotateRight(2118370774 ^ var10_7, 18) - 1318229029) * 2118370775;
                                                (int)(-5710693148443472469L ^ (long)var10_7 ^ -1666930847385596754L);
                                                var11_8 = 141344119 + var10_7;
                                                (int)(-4020083549777757616L ^ (long)var10_7 ^ 7777695142022364602L);
                                                var11_8 = Integer.reverse(Integer.reverse(169743183 + var10_7));
                                                continue;
                                            }
                                            (Integer.rotateRight(2034525787 ^ var10_7, 18) + -1280965568) * 2034525787;
                                            (int)(-4700118695326418413L ^ (long)var10_7 ^ 6383036054600994906L);
                                            var11_8 = 169743183 + var10_7;
                                            var12_6 += 2;
                                            continue;
                                        }
                                        Integer.rotateRight(-564417270 ^ var10_7, 14) + -243821711;
                                        var11_8 = Integer.reverse(Integer.reverse(240873177 + var10_7));
                                        (Integer.rotateRight(1194090719 ^ var10_7, 11) - -1564648900) * 1194090719;
                                        var11_8 = (int)((long)(169743183 + var10_7) ^ 3873258755315438596L ^ 3873258755315438596L);
                                        var12_6 += 3;
                                        continue;
                                    }
                                    (Integer.rotateLeft(-1034852039 ^ var10_7, 11) + -1942397662) * -1034852039;
                                    (int)(64113640375380815L ^ (long)var10_7 ^ 8320544460026522646L);
                                    try {
                                        var12_6 += 2;
                                        if ((6495172518451650377L ^ (long)var10_7 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        var11_8 = Integer.reverse(Integer.reverse(169743183 + var10_7));
                                    }
                                    catch (NoSuchElementException v5) {
                                        var11_8 = 169743183 + var10_7;
                                    }
                                    continue;
                                }
                                Integer.rotateRight(1520202030 ^ var10_7, 14) - -45132851;
                                var11_8 = (int)((long)(1206713353 + var10_7) ^ 7687485969864614041L ^ 7687485969864614041L);
                                (Integer.rotateLeft(1335851896 ^ var10_7, 12) + -1465019709) * 1335851897;
                                try {
                                    var12_6 += 4;
                                    if ((1975617520424806915L ^ (long)var10_7 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    var11_8 = (int)((long)(169743183 + var10_7) ^ 5483178676746993044L ^ 5483178676746993044L);
                                }
                                catch (IllegalStateException v6) {
                                    var11_8 = Integer.reverse(Integer.reverse(169743183 + var10_7));
                                }
                                --var12_6;
                                continue;
                            }
                            (Integer.rotateRight(-1778211589 ^ var10_7, 5) + 783260064) * -1778211589;
                            var11_8 = 0x62E22E6 + var10_7 ^ 1086716300 ^ 1086716300;
                            Integer.rotateLeft(1713682253 ^ var10_7, 15) - 1657786766;
                            (int)(-6587049435487474865L ^ (long)var10_7 ^ -3490145562752654083L);
                            var11_8 = 169743183 + var10_7 + 2069098289 - 2069098289;
                            ++var12_6;
                            continue;
                        }
                        Integer.rotateLeft(-1761790712 ^ var10_7, 5) + 1292307251;
                        var11_8 = -1066946771 + var10_7 + 1079824688 - 1079824688;
                        (Integer.rotateRight(-1278495430 ^ var10_7, 9) + -905408191) * -1278495429;
                        try {
                            var12_6 -= 4;
                            if ((-1235382410218021819L ^ (long)var10_7 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var11_8 = 169743183 + var10_7;
                        }
                        catch (UnsupportedOperationException v7) {
                            var11_8 = Integer.reverse(Integer.reverse(169743183 + var10_7));
                        }
                        continue;
                    }
                    Integer.rotateLeft(1446971940 ^ var10_7, 13) - 1979701655;
                    var11_8 = 169743183 + var10_7;
                    var12_6 -= 4;
                    continue;
                }
                (Integer.rotateLeft(722921017 ^ var10_7, 8) + 1008959522) * 722921017;
                (int)(-1611083584006460593L ^ (long)var10_7 ^ 7888198895798877849L);
                var11_8 = Integer.reverse(Integer.reverse(169743183 + var10_7));
                Integer.rotateRight(-1953720314 ^ var10_7, 4) - -362543115;
                var12_6 -= 2;
                continue;
            }
            return var8_5;
lbl216:
            // 7 sources

            (Integer.rotateLeft(162875193 ^ var10_7, 4) + 827408162) * 162875193;
            (int)(-3816825955115799729L ^ (long)var10_7 ^ 3420628065447328734L);
            var11_8 = 169743183 + var10_7;
        }
    }

    @Generated
    private tkhs() {
        throw new UnsupportedOperationException("This is a ut".concat("ility class a").concat("nd cannot b").concat("e instantiated"));
    }

    private static String sss_8(String string, int n, int n2, int n3) {
        int n4 = bthsh.shhl(1549954044);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 7)) ^ 0x90F20D5F;
        if ((n5 ^ n4) != -1863185057) {
            int cfr_ignored_0 = Integer.rotateRight(0xCC9066A3 ^ n4, 12) + -908456712;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x91289213 ^ n2 - i) + shfm, 10) ^ zgh_2 + i * -1694816719));
        }
        return new String(cArray);
    }

    private static double dhsy_2(long l) {
        block0: {
            int n = -2010607391;
            int n2 = (n = Integer.rotateLeft(n * 1925932429, 21) ^ 0xE628B0C1) ^ 0xC97DE9D1;
            if ((n2 ^ n) == -914495023) break block0;
            int cfr_ignored_0 = (0x41557930 ^ n) - -1654920040;
        }
        return Double.longBitsToDouble(l);
    }

    private static double hsm(long l) {
        block0: {
            int n = bthsh.shhl(589888882);
            int n2 = (n = (int)l ^ n) ^ 0x6EADCC07;
            if ((n2 ^ n) == 1856883719) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4D853175 ^ n, 12) - 1736350822) * 1300574581;
            int cfr_ignored_1 = (int)(0x8F379F4827D4EB4FL ^ (long)n ^ 0xC3E0831A2DB8B3BEL);
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean taa_4() {
        block0: {
            int n = bthsh.shhl(144017983);
            int n2 = n ^ 0x7E85851A;
            if ((n2 ^ n) == 2122679578) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x76100F25 ^ n, 17) - 1347384502;
            int cfr_ignored_1 = (int)(0xB4A2A11827D4EB4FL ^ (long)n ^ 0xBF40831A2DB8C494L);
        }
        return yf.dnkh();
    }

    private static double sghf_2() {
        block0: {
            int n = 1839236465;
            int n2 = (n = Integer.rotateLeft(n * 1884818445, 5) ^ 0x11EA568C) ^ 0x2F3F97FC;
            if ((n2 ^ n) == 792696828) break block0;
            int cfr_ignored_0 = (0x429F128D ^ n) - 704534469;
        }
        return Math.random();
    }

    private static double dhd_3(long l) {
        block0: {
            int n = 47197577;
            n = Integer.rotateLeft(n * -2055702417, 11) ^ 0x55BD60B9;
            int n2 = (n = (int)l ^ n) ^ 0xC6D1769F;
            if ((n2 ^ n) == -959351137) break block0;
            int cfr_ignored_0 = (0xC4015B16 ^ n) - -141275803;
        }
        return Double.longBitsToDouble(l);
    }

    private static double zqn_2(long l) {
        block0: {
            int n = 1108105924;
            n = Integer.rotateLeft(n * 303993657, 16) ^ 0xC0CB0109;
            int n2 = (n = (int)l ^ n) ^ 0xDEC25703;
            if ((n2 ^ n) == -557689085) break block0;
            int cfr_ignored_0 = (0x9CCE0DC7 ^ n) - -1101083572;
        }
        return Double.longBitsToDouble(l);
    }

    private static char sbb(String string, int n) {
        block0: {
            int n2 = -1188903866;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1921895327, 15) ^ 0x73861A1E) ^ 0xE62D56F6;
            if ((n3 ^ n2) == -433236234) break block0;
            int cfr_ignored_0 = (0x5F0F92B0 ^ n2) + -1677395663;
        }
        return string.charAt(n);
    }

    private static int stsh_2(int n, int n2) {
        block0: {
            int n3 = -527281433;
            n3 = Integer.rotateLeft(n3 * 180112893, 28) ^ 0x4564F6D2;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 22)) ^ 0x2C1DEBC0;
            if ((n4 ^ n3) == 740158400) break block0;
            int cfr_ignored_0 = (0xCC8FB927 ^ n3) - -1691408846;
        }
        return Math.min(n, n2);
    }

    private static float aaf_2(int n) {
        block0: {
            int n2 = bthsh.shhl(-856481208);
            int n3 = n2 ^ 0x4B3F08F9;
            if ((n3 ^ n2) == 1262422265) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x87CC2AB1 ^ n2, 3) + 1981205162) * -2016662863;
            int cfr_ignored_1 = (int)(0x457E848C27D4EB4FL ^ (long)n2 ^ 0xF468831A2DB9272CL);
        }
        return Float.intBitsToFloat(n);
    }

    private static float tzdh(int n) {
        block0: {
            int n2 = -1164588703;
            n2 = Integer.rotateLeft(n2 * 1706058517, 23) ^ 0xA01F0681;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 23)) ^ 0x472362E4;
            if ((n3 ^ n2) == 1193501412) break block0;
            int cfr_ignored_0 = (0xFDB6AB85 ^ n2) + -329585469;
        }
        return Float.intBitsToFloat(n);
    }

    private static float jshgh(float f) {
        block0: {
            int n = -1666410492;
            n = Integer.rotateLeft(n * 449070497, 20) ^ 0x3B28892E;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x22ACA37F;
            if ((n2 ^ n) == 581739391) break block0;
            int cfr_ignored_0 = (0xBE003B7B ^ n) - 198698991;
        }
        return Math.abs(f);
    }

    private static boolean zzh_7() {
        block0: {
            int n = -957049218;
            int n2 = (n = Integer.rotateLeft(n * 935358957, 21) ^ 0xD5B135A2) ^ 0x7DCCFD5C;
            if ((n2 ^ n) == 2110586204) break block0;
            int cfr_ignored_0 = (0xBB386B22 ^ n) - 658466181;
        }
        return yf.dnkh();
    }

    private static int dhsh(int n) {
        block0: {
            int n2 = 937204797;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1972029189, 6) ^ 0xCF57E56E) ^ 0x297412FE;
            if ((n3 ^ n2) == 695472894) break block0;
            int cfr_ignored_0 = (0x1EA88EC3 ^ n2) + -1038859755;
        }
        return Integer.reverse(n);
    }

    private static double tqz(double d) {
        block0: {
            int n = 435305427;
            int n2 = (n = Integer.rotateLeft(n * 1552192591, 15) ^ 0x8323DE0F) ^ 0x824CBC32;
            if ((n2 ^ n) == -2108900302) break block0;
            int cfr_ignored_0 = (0x9BBE87E1 ^ n) + 29000434;
        }
        return Math.sin(d);
    }

    private static double jds(double d, double d2) {
        block0: {
            int n = -1702397803;
            n = Integer.rotateLeft(n * -1631514481, 27) ^ 0xA3354B75;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x16CEAB91;
            if ((n2 ^ n) == 382643089) break block0;
            int cfr_ignored_0 = (0x8C49D304 ^ n) - -699764704;
        }
        return tkhs.shah_2(d, d2);
    }

    private static double hzth_2(double d, double d2) {
        block0: {
            int n = 1678025582;
            n = Integer.rotateLeft(n * 1831749939, 20) ^ 0x8618443A;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 24);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x479D6F4D;
            if ((n2 ^ n) == 1201499981) break block0;
            int cfr_ignored_0 = (0x2399CC23 ^ n) - -784939535;
        }
        return tkhs.shah_2(d, d2);
    }

    private static double khhth_2(double d, double d2) {
        block0: {
            int n = bthsh.shhl(-1878931182);
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0xF337A33A;
            if ((n2 ^ n) == -214457542) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x63366A28 ^ n, 15) + 133462547;
        }
        return tkhs.shah_2(d, d2);
    }

    private static double sqa_3(double d, double d2, double d3) {
        block0: {
            int n = -708187642;
            n = Integer.rotateLeft(n * 1436559475, 20) ^ 0xCE490461;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0xEF5A3D36;
            if ((n2 ^ n) == -279298762) break block0;
            int cfr_ignored_0 = (0x3A93D730 ^ n) + 1521371247;
        }
        return class_3532.method_16436((double)d, (double)d2, (double)d3);
    }

    private static class_9779 syj(class_310 class_3102) {
        block0: {
            int n = bthsh.shhl(-461091698);
            class_310 class_3103 = class_3102;
            n = (class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n;
            int n2 = n ^ 0xE626E013;
            if ((n2 ^ n) == -433659885) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x2A2AC9D ^ n, 3) - 1443923518) * 44215453;
            int cfr_ignored_1 = (int)(0xC01002A027D4EB4FL ^ (long)n ^ 0xF830831A2DB82DF1L);
        }
        return class_3102.method_61966();
    }

    private static double zsd_5(class_243 class_2432) {
        block0: {
            int n = -1589326746;
            n = Integer.rotateLeft(n * -1722409293, 15) ^ 0x5692CA61;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0x814645BC;
            if ((n2 ^ n) == -2126101060) break block0;
            int cfr_ignored_0 = (0x200289DA ^ n) - 1551385813;
        }
        return class_2432.method_10216();
    }

    private static float zrq_2(float f) {
        block0: {
            int n = -1115614483;
            n = Integer.rotateLeft(n * -1802281305, 9) ^ 0x11B5BBFC;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 10);
            int n2 = n ^ 0x34C732EA;
            if ((n2 ^ n) == 885469930) break block0;
            int cfr_ignored_0 = (0x89462007 ^ n) + 689081351;
        }
        return class_3532.method_15355((float)f);
    }

    private static String[] bjdh(String string) {
        block0: {
            int n = 595193147;
            int n2 = (n = Integer.rotateLeft(n * 1525139077, 10) ^ 0x1F834B05) ^ 0x9965232C;
            if ((n2 ^ n) == -1721425108) break block0;
            int cfr_ignored_0 = (0xBA1CCE17 ^ n) + -1227879892;
        }
        return string.split("\u0001\u0013", -1);
    }

    private static CallSite dshf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1505176730;
            n3 = Integer.rotateLeft(n3 * -2109477457, 3) ^ 0x8960FE95;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 15);
            String string3 = string2;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            int n4 = n3 ^ 0xBCAE30AD;
            if ((n4 ^ n3) != -1129434963) {
                int cfr_ignored_0 = (0xE5191C37 ^ n3) + -29160923;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zfl ^ string.hashCode() ^ n2 + tthb + i * -1739943803) + zfl) ^ tthb));
            }
            String[] stringArray = tkhs.bjdh(new String(cArray));
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

    private static String[] n2ewukvf70lvm(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ckwu44zaffxq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ otevurxaw8pva ^ string.hashCode() ^ n2 + pvr66s62arjse ^ i * -1370942209 ^ otevurxaw8pva, 6) ^ pvr66s62arjse));
            }
            String[] stringArray = tkhs.n2ewukvf70lvm(new String(cArray));
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

