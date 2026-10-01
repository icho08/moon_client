/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1713
 *  net.minecraft.class_1743
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1829
 *  net.minecraft.class_2371
 *  net.minecraft.class_2596
 *  net.minecraft.class_2815
 *  net.minecraft.class_2868
 *  net.minecraft.class_2886
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1268;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1829;
import net.minecraft.class_2371;
import net.minecraft.class_2596;
import net.minecraft.class_2815;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_636;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bak_2;
import us.m0vy.moondlc.m0vyguard.bwk;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.thdh;
import us.m0vy.moondlc.m0vyguard.hb;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.kq;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.client.accessor.IClientPlayerInteractionManager;

public class bfn
implements dl {
    private static int jmt;
    private static int rnj;
    private static final int ththr = -1402369722;
    private static final int bml = 1515124229;
    private static final int ytxok3784 = 2066233966;
    private static final int jh62iq1cs4reg = -2017925712;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int j73ar2urttgv;

    public static void dhykh(int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 1705527657;
        n4 = Integer.rotateLeft(n4 * 292989645, 16) ^ 0x9EBD19B0;
        int n5 = n4 - -1951875512 + 2024338773 - 2024338773;
        block41: while (true) {
            switch (n4 - n5) {
                case -1951875516: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x32D093A8 ^ n4, 9) + 731873427;
                    if (bfn.thzh_2(hb.tdm_2())) {
                        try {
                            n3 -= 3;
                            if ((0x3DAF911F92651EFDL ^ (long)n4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n5 = (int)((long)(n4 - -1951875513) ^ 0xEA4D826CF34B96B5L ^ 0xEA4D826CF34B96B5L);
                        }
                        catch (IllegalStateException illegalStateException) {
                            n5 = Integer.reverse(Integer.reverse(n4 - -1951875513));
                        }
                        continue block41;
                    }
                    try {
                        if ((0x32EE18CE6F1967F7L ^ (long)n4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n5 = Integer.reverse(Integer.reverse(n4 - -1951875515));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n5 = n4 - -1951875515 + 2116342614 - 2116342614;
                    }
                    ++n3;
                    continue block41;
                }
                case -1951875513: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x8FB3F204 ^ n4, 4) - 1797778871;
                    return;
                }
                case -1951875512: {
                    int cfr_ignored_2 = Integer.rotateLeft(0x3D75E1A5 ^ n4, 10) - 1973678646;
                    int cfr_ignored_3 = (int)(0xFFC74F9827D4EB4FL ^ (long)n4 ^ 0x6240831A2DB8525FL);
                    if (bfn.mc.field_1724 == null) {
                        try {
                            n5 = (int)((long)(n4 - -1951875514) ^ 0xA38254E9870ED0A5L ^ 0xA38254E9870ED0A5L);
                        }
                        catch (ArithmeticException arithmeticException) {
                            n5 = (int)((long)(n4 - -1951875514) ^ 0x56913E30C35FF8CAL ^ 0x56913E30C35FF8CAL);
                        }
                        continue block41;
                    }
                    int cfr_ignored_4 = (int)(0x583E4F774FA11982L ^ (long)n4 ^ 0x639E53F1C8231DADL);
                    n5 = n4 - -1951875511;
                    n3 += 3;
                    continue block41;
                }
                case -1951875517: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x7DBC85FC ^ n4, 18) - 1043454143) * 2109507069;
                    n2 = bfn.mc.field_1724.field_7512.field_7763;
                    bfn.shwkh(bfn.mc.field_1761, n2, n, 1, class_1713.field_7795, (class_1657)bfn.mc.field_1724);
                    if (hb.tdm_2() == null) {
                        try {
                            n3 -= 4;
                            if ((0x1D1774F758CC4DDDL ^ (long)n4 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n5 = n4 - -1951875515 ^ 0xEAC65C0B ^ 0xEAC65C0B;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n5 = n4 - -1951875515;
                        }
                        n3 += 5;
                        continue block41;
                    }
                    try {
                        n3 += 4;
                        if ((0xAF4F58F7594A7A4DL ^ (long)n4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n5 = n4 - -1951875516;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n5 = n4 - -1951875516 + -1843365652 - -1843365652;
                    }
                    ++n3;
                    continue block41;
                }
                case -1951875514: {
                    int cfr_ignored_6 = (Integer.rotateRight(0xA8CC7FF2 ^ n4, 8) + 1965104521) * -1462992909;
                    return;
                }
                case -1951875515: {
                    int cfr_ignored_7 = (Integer.rotateRight(0xF99E4013 ^ n4, 18) + 1049059720) * -107069421;
                    bfn.djd_4((class_2596)new class_2815(n2));
                    int cfr_ignored_8 = (int)(0xFD94CA0AD47B10AAL ^ (long)n4 ^ 0x69656445DA7256F8L);
                    n5 = Integer.reverse(Integer.reverse(n4 - -1951875513));
                    n3 += 4;
                    continue block41;
                }
                case -1951875511: {
                    int cfr_ignored_9 = Integer.rotateRight(0x85C931E2 ^ n4, 3) + 934979993;
                    if (bfn.mc.field_1761 != null) {
                        n5 = n4 - -1951875517;
                        int cfr_ignored_10 = (Integer.rotateLeft(0xDEE813F1 ^ n4, 14) + 41421162) * -555215887;
                        int cfr_ignored_11 = (int)(0x1C5ABDCC27D4EB4FL ^ (long)n4 ^ 0x86E8831A2DB99564L);
                        n3 += 4;
                        continue block41;
                    }
                    n5 = n4 - -8027973 ^ 0x98BFA71A ^ 0x98BFA71A;
                    int cfr_ignored_12 = Integer.rotateLeft(0x43E7E1A9 ^ n4, 11) + 1030877874;
                    int cfr_ignored_13 = (int)(0x81554F9427D4EB4FL ^ (long)n4 ^ 0x6258831A2DB8AF7BL);
                    n5 = Integer.reverse(Integer.reverse(n4 - -1951875514));
                    ++n3;
                    continue block41;
                }
                case -1951875510: {
                    int cfr_ignored_14 = Integer.rotateRight(0xC4148A8F ^ n4, 11) - -1025874292;
                    n5 = Integer.reverse(Integer.reverse(n4 - 1341521964));
                    int cfr_ignored_15 = (Integer.rotateRight(0xD72CAAFF ^ n4, 13) - 314987548) * -684938497;
                    int cfr_ignored_16 = (int)(0xA9E1616CC0B2FD86L ^ (long)n4 ^ 0x3FA94DD6002AFE13L);
                    n5 = n4 - -1951875512 ^ 0x6FFEBC66 ^ 0x6FFEBC66;
                    continue block41;
                }
                case -1951875509: {
                    int cfr_ignored_17 = Integer.rotateRight(0x50DBCEEE ^ n4, 13) - -822366707;
                    int cfr_ignored_18 = (int)(0x7C717EB3E41E5BD5L ^ (long)n4 ^ 0x17048F4C8D5533L);
                    n5 = n4 - -1333397200;
                    int cfr_ignored_19 = (int)(0x81EEDCDD9F676F15L ^ (long)n4 ^ 0x44CBF27D250CAE0CL);
                    n5 = Integer.reverse(Integer.reverse(n4 - -1951875512));
                    continue block41;
                }
                case -1951875508: {
                    int cfr_ignored_20 = Integer.rotateRight(0x741C560B ^ n4, 17) + 332139152;
                    n5 = n4 - -554642280;
                    int cfr_ignored_21 = Integer.rotateRight(0xE59DC002 ^ n4, 15) + -763895943;
                    try {
                        n3 += 5;
                        n5 = n4 - -1951875512;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n5 = (int)((long)(n4 - -1951875512) ^ 0x17DB275C9B3C154DL ^ 0x17DB275C9B3C154DL);
                    }
                    continue block41;
                }
                case -1951875507: {
                    int cfr_ignored_22 = (Integer.rotateRight(0xBC276292 ^ n4, 10) + -853373207) * -1138269549;
                    n5 = n4 - -1297000743;
                    int cfr_ignored_23 = Integer.rotateRight(0x21F8B967 ^ n4, 7) - 561779380;
                    try {
                        n5 = Integer.reverse(Integer.reverse(n4 - -1951875512));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n5 = Integer.reverse(Integer.reverse(n4 - -1951875512));
                    }
                    n3 -= 3;
                    continue block41;
                }
                case -1951875506: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x2F4C8C10 ^ n4, 8) + -1096641237) * 793545745;
                    n5 = Integer.reverse(Integer.reverse(n4 - -1951875512));
                    int cfr_ignored_25 = (Integer.rotateLeft(0x817C27D9 ^ n4, 3) + -1301908862) * -2122569767;
                    int cfr_ignored_26 = (int)(0x43CE89E427D4EB4FL ^ (long)n4 ^ 0xEEB8831A2DB92A4CL);
                    n3 -= 3;
                    continue block41;
                }
                case -1951875505: {
                    int cfr_ignored_27 = (Integer.rotateLeft(0x25426911 ^ n4, 7) + -2023204790) * 625109265;
                    int cfr_ignored_28 = (int)(0xE7F0C72C27D4EB4FL ^ (long)n4 ^ 0x7328831A2DB86230L);
                    try {
                        n3 -= 3;
                        n5 = (int)((long)(n4 - -1951875512) ^ 0xDEFEEE39DC46B6A7L ^ 0xDEFEEE39DC46B6A7L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n5 = n4 - -1951875512;
                    }
                    n3 -= 4;
                    continue block41;
                }
                case -1951875504: {
                    int cfr_ignored_29 = (Integer.rotateRight(0x2F2DDDDB ^ n4, 8) + -1158972224) * 791535067;
                    n5 = (int)((long)(n4 - 708317467) ^ 0x7D6E2B8BB2BBDDD2L ^ 0x7D6E2B8BB2BBDDD2L);
                    int cfr_ignored_30 = Integer.rotateLeft(0xC40B1209 ^ n4, 11) + -1045115310;
                    int cfr_ignored_31 = (int)(0x6B9BC3427D4EB4FL ^ (long)n4 ^ 0x8518831A2DB9A0A2L);
                    n5 = Integer.reverse(Integer.reverse(n4 - -591118211));
                    int cfr_ignored_32 = (Integer.rotateLeft(0x459A2A1D ^ n4, 11) - 1913174206) * 1167731229;
                    int cfr_ignored_33 = (int)(0x8728842027D4EB4FL ^ (long)n4 ^ 0xF530831A2DB8A380L);
                    n5 = n4 - -1951875512;
                    n3 -= 4;
                    continue block41;
                }
                case -1951875503: {
                    int cfr_ignored_34 = Integer.rotateRight(0xC7061AC3 ^ n4, 11) + 505076952;
                    n5 = Integer.reverse(Integer.reverse(n4 - 371795715));
                    int cfr_ignored_35 = (Integer.rotateRight(0xBAE197FF ^ n4, 10) - -1515256036) * -1159620609;
                    n5 = n4 - 812959682 + 1786581708 - 1786581708;
                    int cfr_ignored_36 = Integer.rotateLeft(0x15D617C1 ^ n4, 5) + -1454735462;
                    int cfr_ignored_37 = (int)(0xD764B9FC27D4EB4FL ^ (long)n4 ^ 0x8E88831A2DB80318L);
                    n5 = n4 - -1951875512;
                    n3 += 2;
                    continue block41;
                }
                case -1951875502: {
                    int cfr_ignored_38 = (Integer.rotateLeft(0xE0C0947D ^ n4, 15) - 1001364062) * -524249987;
                    int cfr_ignored_39 = (int)(0x22723A4027D4EB4FL ^ (long)n4 ^ 0x89F0831A2DB9E935L);
                    try {
                        if ((0xF3050699761802D5L ^ (long)n4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n5 = Integer.reverse(Integer.reverse(n4 - -1951875512));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n5 = n4 - -1951875512 ^ 0x8C44A1C ^ 0x8C44A1C;
                    }
                    ++n3;
                    continue block41;
                }
                case -1951875501: {
                    int cfr_ignored_40 = (Integer.rotateRight(0xB04805BE ^ n4, 9) - 1561743677) * -1337457217;
                    n5 = (int)((long)(n4 - 263568369) ^ 0x1CC55936A1400539L ^ 0x1CC55936A1400539L);
                    int cfr_ignored_41 = (Integer.rotateLeft(0xED6B383C ^ n4, 16) - -1000771969) * -311740355;
                    int cfr_ignored_42 = (int)(0xDB57E4DC1174D3FEL ^ (long)n4 ^ 0x34C8EE5A5CDA1B7EL);
                    n5 = (int)((long)(n4 - -1552649416) ^ 0xB3CA0D01CA2E6082L ^ 0xB3CA0D01CA2E6082L);
                    int cfr_ignored_43 = (int)(0xD91880FFD1792879L ^ (long)n4 ^ 0xFC8F6E41ABD41FE0L);
                    n5 = n4 - -1951875512;
                    n3 += 3;
                    continue block41;
                }
                case -1951875500: {
                    int cfr_ignored_44 = Integer.rotateRight(0x7B99CA66 ^ n4, 18) - -67296875;
                    try {
                        n3 += 3;
                        if ((0x3E3B798D3E6BA4DFL ^ (long)n4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n5 = Integer.reverse(Integer.reverse(n4 - -1951875512));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n5 = n4 - -1951875512 ^ 0xB2308173 ^ 0xB2308173;
                    }
                    ++n3;
                    continue block41;
                }
                case -1951875499: {
                    int cfr_ignored_45 = (Integer.rotateLeft(0x72DC3F8 ^ n4, 3) + -488089021) * 120439801;
                    n5 = (int)((long)(n4 - 1513083104) ^ 0x1517C6CF1851F7D5L ^ 0x1517C6CF1851F7D5L);
                    int cfr_ignored_46 = (Integer.rotateLeft(0x4BC8F451 ^ n4, 12) + 833828106) * 1271460945;
                    int cfr_ignored_47 = (int)(0x897A5A6C27D4EB4FL ^ (long)n4 ^ 0x49A8831A2DB8BF25L);
                    n5 = (int)((long)(n4 - -1951875512) ^ 0x4940D3E609B62EF6L ^ 0x4940D3E609B62EF6L);
                    n3 += 4;
                    continue block41;
                }
            }
            int cfr_ignored_48 = Integer.rotateLeft(0xE7456CEC ^ n4, 15) - 0x5C5CFCF;
            n5 = (int)((long)(n4 - -1951875512) ^ 0xD188506F05AF2AF1L ^ 0xD188506F05AF2AF1L);
        }
    }

    public static void saq_2(int n) {
        try {
            int n2 = -1891963967;
            n2 = Integer.rotateLeft(n2 * 2128056953, 21) ^ 0x6D0FED67;
            int n3 = n2 ^ 0x6D54C468;
            if ((n3 ^ n2) != 1834271848) {
                int cfr_ignored_0 = (0xE26E2FA9 ^ n2) + -53540276;
            }
            if ((0x165 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (n == -1) {
            return;
        }
        if (bfn.mc.field_1724 == null || bfn.mc.field_1761 == null) {
            return;
        }
        int n4 = bfn.mc.field_1724.field_7512.field_7763;
        bfn.trl(bfn.mc.field_1761, n4, n, 0xF4F798B2 ^ 0xF4F7989A, class_1713.field_7791, (class_1657)bfn.mc.field_1724);
        bfn.mc.field_1724.field_3944.method_52787((class_2596)new class_2815(n4));
    }

    public static void thght_2(int n, int n2) {
        int n3;
        int n4 = 450420699;
        n4 = Integer.rotateLeft(n4 * -1555281135, 26) ^ 0x4EE794E6;
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 14)) ^ 0x2E3DE168;
        if ((n5 ^ n4) != 775807336) {
            int cfr_ignored_0 = (0x34E53EB3 ^ n4) - 758382239;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (bfn.mc.field_1724 == null || bfn.mc.field_1761 == null) {
            return;
        }
        int n6 = bfn.mc.field_1724.field_7512.field_7763;
        int n7 = n2 >= 0 && n2 <= (0xD72C5D54 ^ 0xD72C5D5C) ? n2 : (n3 = n >= 0 && n <= (Integer.reverse(-208912677) ^ 0xDB7C31C7) ? n : -1);
        if (n3 == -1) {
            return;
        }
        bfn.mc.field_1761.method_2906(n6, n3 == n2 ? n : n2, n3, class_1713.field_7791, (class_1657)bfn.mc.field_1724);
        if (!(n6 == 0 || bfn.skn_2() != null && bfn.tghth(hb.tdm_2()))) {
            bfn.mc.field_1724.field_3944.method_52787((class_2596)new class_2815(n6));
        }
    }

    public static void dhhn(int n, int n2) {
        try {
            int n3 = 934028496;
            n3 = Integer.rotateLeft(n3 * 1951376881, 13) ^ 0xCD4DF033;
            n3 = n2 ^ n3;
            int n4 = n3 ^ 0xB4B4618A;
            if ((n4 ^ n3) != -1263246966) {
                int cfr_ignored_0 = (0x8318455A ^ n3) + 497758129;
            }
            if ((0x273 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bfn.mc.field_1724 == null || bfn.mc.field_1761 == null) {
            return;
        }
        int n5 = bfn.mc.field_1724.field_7512.field_7763;
        bfn.jshn(bfn.mc.field_1761, n5, n, n2, class_1713.field_7791, (class_1657)bfn.mc.field_1724);
        if (!bfn.rnb(hb.tdm_2())) {
            bfn.mc.field_1724.field_3944.method_52787((class_2596)new class_2815(n5));
        }
    }

    public static void szm_3(class_1268 class_12682) {
        try {
            int n = -531642161;
            n = Integer.rotateLeft(n * -700247715, 5) ^ 0xFE9E6629;
            class_1268 class_12683 = class_12682;
            n = (class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n;
            int n2 = n ^ 0x520A9D6A;
            if ((n2 ^ n) != 1376427370) {
                int cfr_ignored_0 = (0xB24555A5 ^ n) + -904072112;
            }
            if ((0x22E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bfn.mc.field_1724 == null) {
            return;
        }
        kq kq2 = bfn.tthw_2();
        taj taj2 = bfn.tfq_2(kq2) != null ? kq2.hls_2() : new taj(bfn.add_4(bfn.mc.field_1724), bfn.mc.field_1724.method_36455());
        bfn.thhk_2(class_12682, bfn.dhtkh_2(taj2), bfn.ttt_4(taj2));
    }

    public static void shaq_2(class_1268 class_12682) {
        int n = 2101563393;
        n = Integer.rotateLeft(n * 296688747, 22) ^ 0x145CFAD0;
        class_1268 class_12683 = class_12682;
        n = (class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n;
        int n2 = n ^ 0x5E6AA7E2;
        if ((n2 ^ n) != 1584048098) {
            int cfr_ignored_0 = (0x2329F7E3 ^ n) + -1275119301;
        }
        if (!yf.khdha_2()) {
            bfn.bghj();
            throw null;
        }
        if (bfn.mc.field_1724 == null) {
            return;
        }
        kq kq2 = bfn.dhjgh();
        taj taj2 = kq2.jwj() != null ? kq2.hls_2() : new taj(bfn.mc.field_1724.method_36454(), bfn.zry(bfn.mc.field_1724));
        bfn.ddth_2(class_12682, taj2.dda_3(), taj2.shyq());
    }

    public static void ddth_2(class_1268 class_12682, float f, float f2) {
        int n = -1824432065;
        n = Integer.rotateLeft(n * -1748821681, 18) ^ 0x1DEB3E03;
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 16);
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 10);
        int n2 = n ^ 0x633E9BD6;
        if ((n2 ^ n) != 1665047510) {
            int cfr_ignored_0 = (0xF07FFBE9 ^ n) + -1313666429;
        }
        bfn.san(class_12682, f, f2, false);
    }

    public static void shdt(class_1268 class_12682) {
        try {
            int n = -183916845;
            n = Integer.rotateLeft(n * -1997069545, 15) ^ 0x2024F41A;
            int n2 = n ^ 0x28DEE5F;
            if ((n2 ^ n) != 42856031) {
                int cfr_ignored_0 = (0xF784488C ^ n) + -754835875;
            }
            if ((0x2BF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bfn.tnh_4()) {
            bfn.dhdr();
        }
        if (bfn.mc.field_1724 == null) {
            return;
        }
        kq kq2 = kq.thzt_2();
        taj taj2 = kq2.jty() != null ? bfn.jby(kq2) : new taj(bfn.mc.field_1724.method_36454(), bfn.mc.field_1724.method_36455());
        bfn.thhk_2(class_12682, bfn.ghk(taj2), taj2.shyq());
    }

    /*
     * Unable to fully structure code
     */
    public static void thhk_2(class_1268 var0, float var1_1, float var2_2) {
        var5_3 = 0;
        var3_4 = -516411696;
        var3_4 = Integer.rotateLeft(var3_4 * -326465389, 6) ^ 976019308;
        v0 = var0;
        var3_4 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var3_4;
        var3_4 = Integer.rotateRight(Float.floatToIntBits(var1_1) ^ var3_4, 13);
        var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6) ^ -526368661 ^ -526368661;
        while (true) {
            block36: {
                block27: {
                    block37: {
                        block34: {
                            block28: {
                                block31: {
                                    block29: {
                                        block30: {
                                            block35: {
                                                block32: {
                                                    block33: {
                                                        block26: {
                                                            var5_3 = Integer.rotateRight(var4_5, 6) ^ var3_4;
                                                            switch (var5_3 & 7) {
                                                                case 0: {
                                                                    if (var5_3 == -641295288) break block26;
                                                                    if (var5_3 == -690112328) break block27;
                                                                    Integer.rotateLeft(-1124413340 ^ var3_4, 10) - -423830697;
                                                                    if (var5_3 == -487846368) break;
                                                                    if (var5_3 == -738072296) break block28;
                                                                    if (var5_3 == -619838320) break block29;
                                                                    Integer.rotateRight(-149562973 ^ var3_4, 17) + -268240392;
                                                                    if (var5_3 == -136859352) break block30;
                                                                    if (var5_3 != -2140782544) {
                                                                        ** break;
                                                                    }
                                                                    break block31;
                                                                }
                                                                case 6: {
                                                                    if (var5_3 != 360845814) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 2: {
                                                                    if (var5_3 != -2034869926) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 1: {
                                                                    if (var5_3 != -1488657207) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                                case 7: {
                                                                    if (var5_3 != -536393737) {
                                                                        ** break;
                                                                    }
                                                                    break block35;
                                                                }
                                                                case 5: {
                                                                    if (var5_3 != -1404506467) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 4: {
                                                                    if (var5_3 != -594339980) {
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                            }
                                                            Integer.rotateLeft(198082305 ^ var3_4, 4) + 1918828634;
                                                            (int)(-3928034718677406897L ^ (long)var3_4 ^ 6847867381876277032L);
                                                            yf.athz_2();
                                                            var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ 834768342, 6)));
                                                            (Integer.rotateRight(1749052606 ^ var3_4, 16) - -1540699587) * 1749052607;
                                                            var4_5 = Integer.rotateLeft(var3_4 ^ -641295288, 6) + -1312017094 - -1312017094;
                                                            var5_3 += 5;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-831041676 ^ var3_4, 12) - 80756295) * -831041675;
                                                        bfn.san(var0, var1_1, var2_2, true);
                                                        return;
                                                    }
                                                    (Integer.rotateRight(-1393568417 ^ var3_4, 8) - -177703492) * -1393568417;
                                                    if (!yf.khdha_2()) {
                                                        var4_5 = Integer.rotateLeft(var3_4 ^ -487846368, 6) ^ 1067297542 ^ 1067297542;
                                                        var5_3 -= 3;
                                                        continue;
                                                    }
                                                    (int)(6350731536737415462L ^ (long)var3_4 ^ 6065911670539754901L);
                                                    var4_5 = Integer.rotateLeft(var3_4 ^ -1197752742, 6);
                                                    (int)(-4250315066525356649L ^ (long)var3_4 ^ 5520960368241289174L);
                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -641295288, 6)));
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-1595301228 ^ var3_4, 7) - -2136453337) * -1595301227;
                                                var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -276517264, 6)));
                                                (Integer.rotateLeft(912773788 ^ var3_4, 9) - -1695539169) * 912773789;
                                                var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -14425056, 6)));
                                                (Integer.rotateRight(483212574 ^ var3_4, 6) - -2127034915) * 483212575;
                                                var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6) + -1383842051 - -1383842051;
                                                continue;
                                            }
                                            (Integer.rotateRight(1549742043 ^ var3_4, 14) + 870607552) * 1549742043;
                                            var4_5 = Integer.rotateLeft(var3_4 ^ 1618008893, 6);
                                            (Integer.rotateLeft(1263547989 ^ var3_4, 12) - 588526470) * 1263547989;
                                            (int)(-8511072772664530097L ^ (long)var3_4 ^ -3629757151201149420L);
                                            try {
                                                if ((-8800356400033305817L ^ (long)var3_4 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6) + 946765099 - 946765099;
                                            }
                                            catch (NoSuchElementException v1) {
                                                var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6);
                                            }
                                            var5_3 += 3;
                                            continue;
                                        }
                                        Integer.rotateRight(-203437010 ^ var3_4, 17) - -1938335539;
                                        var4_5 = Integer.rotateLeft(var3_4 ^ -1714811123, 6);
                                        (Integer.rotateRight(1998009810 ^ var3_4, 17) + 1882006441) * 1998009811;
                                        var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6);
                                        continue;
                                    }
                                    (Integer.rotateRight(-1961985953 ^ var3_4, 4) - -618777924) * -1961985953;
                                    var4_5 = Integer.rotateLeft(var3_4 ^ 1649177114, 6) + -1820116095 - -1820116095;
                                    Integer.rotateLeft(1843033028 ^ var3_4, 16) - 1372693495;
                                    var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6) ^ -1838255675 ^ -1838255675;
                                    Integer.rotateRight(-485246098 ^ var3_4, 15) - -2084482675;
                                    continue;
                                }
                                (Integer.rotateRight(-505746505 ^ var3_4, 15) - 1574972004) * -505746505;
                                try {
                                    var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -2034869926, 6)));
                                }
                                catch (IllegalStateException v2) {
                                    var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6);
                                }
                                continue;
                            }
                            (Integer.rotateRight(-709983682 ^ var3_4, 13) - -461413187) * -709983681;
                            var4_5 = Integer.rotateLeft(var3_4 ^ -1115081789, 6) + -1475091524 - -1475091524;
                            (Integer.rotateRight(344690259 ^ var3_4, 5) + -2126259384) * 344690259;
                            var4_5 = Integer.rotateLeft(var3_4 ^ 665837804, 6) ^ -1786441887 ^ -1786441887;
                            (Integer.rotateRight(723614550 ^ var3_4, 8) - 1030459045) * 723614551;
                            var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -2034869926, 6)));
                            var5_3 += 4;
                            continue;
                        }
                        (Integer.rotateLeft(-1491649772 ^ var3_4, 7) - 1076741799) * -1491649771;
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1957180385, 6) + -253992880 - -253992880;
                        (Integer.rotateRight(1309775258 ^ var3_4, 12) + 2021571809) * 1309775259;
                        try {
                            if ((-3542843535492750239L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6);
                        }
                        catch (IllegalStateException v3) {
                            var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6) + 1724940676 - 1724940676;
                        }
                        ++var5_3;
                        continue;
                    }
                    Integer.rotateRight(-1700908569 ^ var3_4, 6) - -1115313612;
                    var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ -1457524110, 6) ^ -2542817293454322480L ^ -2542817293454322480L);
                    (Integer.rotateRight(-1692477473 ^ var3_4, 6) - -853949636) * -1692477473;
                    var4_5 = Integer.rotateLeft(var3_4 ^ 112273043, 6);
                    (Integer.rotateLeft(-379688072 ^ var3_4, 16) + 1187816131) * -379688071;
                    var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6) ^ -1493764796 ^ -1493764796;
                    var5_3 += 5;
                    continue;
                }
                (Integer.rotateLeft(-1827801571 ^ var3_4, 5) - -754029378) * -1827801571;
                (int)(5890523732754361167L ^ (long)var3_4 ^ 5562089688262053551L);
                var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ -197841135, 6) ^ 7068776730919171215L ^ 7068776730919171215L);
                (Integer.rotateLeft(-1388474087 ^ var3_4, 8) + -19779262) * -1388474087;
                (int)(8038713284399262543L ^ (long)var3_4 ^ -8991292507585678641L);
                var4_5 = Integer.rotateLeft(var3_4 ^ -206982049, 6) + -1630942158 - -1630942158;
                Integer.rotateRight(-818478002 ^ var3_4, 12) - 470230189;
                var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6) ^ 911157687 ^ 911157687;
                --var5_3;
                continue;
            }
            (Integer.rotateLeft(-850573892 ^ var3_4, 12) - -524742401) * -850573891;
            var4_5 = Integer.rotateLeft(var3_4 ^ 806082208, 6) + 124995518 - 124995518;
            (Integer.rotateRight(2091741843 ^ var3_4, 18) + 492732168) * 2091741843;
            var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6);
            ++var5_3;
            continue;
lbl198:
            // 8 sources

            (Integer.rotateRight(455854455 ^ var3_4, 6) - 1319830692) * 455854455;
            var4_5 = Integer.rotateLeft(var3_4 ^ -2034869926, 6);
        }
    }

    private static void san(class_1268 class_12682, float f, float f2, boolean bl) {
        int n = 1363887651;
        n = Integer.rotateLeft(n * 1965130809, 9) ^ 0x1B954DB6;
        class_1268 class_12683 = class_12682;
        n = (class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xC7DE05E3;
        if ((n2 ^ n) != -941750813) {
            int cfr_ignored_0 = (0x969543C0 ^ n) - -657061605;
        }
        if (!bfn.bwd_2()) {
            yf.athz_2();
            throw null;
        }
        if (bfn.mc.field_1724 == null) {
            return;
        }
        taj taj2 = new taj(f, f2).jhm_2();
        btj_2.sdd_3(taj2.dda_3(), taj2.shyq());
        thdh.dzd_8(arg_0 -> bfn.zmz_3(class_12682, taj2, arg_0));
        if (bl) {
            bfn.khlkh(bfn.mc.field_1724, class_12682);
        }
    }

    public static void awy(int n) {
        int n2 = 1127434801;
        n2 = Integer.rotateLeft(n2 * 779794979, 6) ^ 0x227FC31F;
        int n3 = (n2 = Integer.rotateRight(n ^ n2, 16)) ^ 0xB5D0BD6B;
        if ((n3 ^ n2) != -1244611221) {
            int cfr_ignored_0 = (0xF6E3F75A ^ n2) - 805710934;
        }
        bfn.hthz_2(n, true);
    }

    public static void hthz_2(int n, boolean bl) {
        try {
            int n2 = -151346762;
            n2 = Integer.rotateLeft(n2 * -1148980587, 3) ^ 0xD7CB57D3;
            int n3 = n2 ^ 0xD98279A0;
            if ((n3 ^ n2) != -645760608) {
                int cfr_ignored_0 = (0x2F78D816 ^ n2) + -710868770;
            }
            if ((0x225 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bfn.shyz_2()) {
            yf.athz_2();
            throw null;
        }
        if (bfn.mc.field_1724 == null || bfn.mc.field_1761 == null) {
            return;
        }
        if (n < 0 || n > (Integer.reverse(239461169) ^ 0x8CC7A278)) {
            return;
        }
        bfn.mc.field_1724.method_31548().field_7545 = n;
        bfn.hhz_4(n);
    }

    /*
     * Unable to fully structure code
     */
    public static void shkz(int var0) {
        var3_1 = 0;
        var1_2 = -1559919250;
        var1_2 = Integer.rotateLeft(var1_2 * -1619268771, 14) ^ -982950216;
        var1_2 = Integer.rotateLeft(var0 ^ var1_2, 26);
        var2_3 = -63413893 * 301766103 + 1992839339 ^ var1_2 ^ -860691703 ^ -860691703;
        while (true) {
            block62: {
                block70: {
                    block63: {
                        block51: {
                            block55: {
                                block69: {
                                    block54: {
                                        block58: {
                                            block57: {
                                                block67: {
                                                    block56: {
                                                        block61: {
                                                            block60: {
                                                                block53: {
                                                                    block71: {
                                                                        block66: {
                                                                            block52: {
                                                                                block64: {
                                                                                    block68: {
                                                                                        block59: {
                                                                                            block73: {
                                                                                                block65: {
                                                                                                    block72: {
                                                                                                        var3_1 = ((var2_3 ^ var1_2) - 1992839339) * -479056409;
                                                                                                        switch (var3_1 & 15) {
                                                                                                            case 0: {
                                                                                                                if (var3_1 == -182655584) break block51;
                                                                                                                if (var3_1 != -835532560) {
                                                                                                                    Integer.rotateRight(-490941018 ^ var1_2, 15) - 2033942101;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block52;
                                                                                                            }
                                                                                                            case 1: {
                                                                                                                if (var3_1 == 1569935585) break;
                                                                                                                if (var3_1 != -1007222031) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block53;
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                if (var3_1 == 1699389074) break block54;
                                                                                                                if (var3_1 != 1884382514) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block55;
                                                                                                            }
                                                                                                            case 5: {
                                                                                                                if (var3_1 == -951383627) break block56;
                                                                                                                if (var3_1 != 1336871797) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block57;
                                                                                                            }
                                                                                                            case 6: {
                                                                                                                if (var3_1 == 1726922518) break block58;
                                                                                                                if (var3_1 == 1809886838) break block59;
                                                                                                                if (var3_1 == -1893650650) break block60;
                                                                                                                if (var3_1 != 357042806) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block61;
                                                                                                            }
                                                                                                            case 8: {
                                                                                                                if (var3_1 != 884125496) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block62;
                                                                                                            }
                                                                                                            case 9: {
                                                                                                                if (var3_1 != -1893572055) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block63;
                                                                                                            }
                                                                                                            case 10: {
                                                                                                                if (var3_1 != 1773863882) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block64;
                                                                                                            }
                                                                                                            case 11: {
                                                                                                                if (var3_1 == -63413893) break block65;
                                                                                                                if (var3_1 != 1563100619) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block66;
                                                                                                            }
                                                                                                            case 12: {
                                                                                                                if (var3_1 == -1784195780) break block67;
                                                                                                                if (var3_1 == 186965996) break block68;
                                                                                                                Integer.rotateRight(-402575901 ^ var1_2, 16) + 478293432;
                                                                                                                if (var3_1 == 138877884) break block69;
                                                                                                                if (var3_1 != 1026014092) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block70;
                                                                                                            }
                                                                                                            case 14: {
                                                                                                                if (var3_1 != -995200098) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block71;
                                                                                                            }
                                                                                                            case 15: {
                                                                                                                if (var3_1 == -441946145) break block72;
                                                                                                                if (var3_1 != -653346017) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block73;
                                                                                                            }
                                                                                                        }
                                                                                                        Integer.rotateLeft(57763072 ^ var1_2, 3) + 1863899707;
                                                                                                        bfn.tlh_3();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    (Integer.rotateRight(126527163 ^ var1_2, 3) + -299380768) * 126527163;
                                                                                                    if (bfn.mc.field_1724 != null) {
                                                                                                        try {
                                                                                                            if ((2875554375211840889L ^ (long)var1_2 | 1L) == 0L) {
                                                                                                                throw new ArithmeticException();
                                                                                                            }
                                                                                                            var2_3 = 1773863882 * 301766103 + 1992839339 ^ var1_2 ^ -1442701287 ^ -1442701287;
                                                                                                        }
                                                                                                        catch (ArithmeticException v0) {
                                                                                                            var2_3 = (1773863882 * 301766103 + 1992839339 ^ var1_2) + -619238611 - -619238611;
                                                                                                        }
                                                                                                        var3_1 -= 4;
                                                                                                        continue;
                                                                                                    }
                                                                                                    var2_3 = Integer.reverse(Integer.reverse(-523899903 * 301766103 + 1992839339 ^ var1_2));
                                                                                                    (Integer.rotateLeft(-1550676580 ^ var1_2, 7) - -753089249) * -1550676579;
                                                                                                    var2_3 = (-995200098 * 301766103 + 1992839339 ^ var1_2) + 2030023886 - 2030023886;
                                                                                                    --var3_1;
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateRight(-1977848689 ^ var1_2, 4) - -1110522740;
                                                                                                if (yf.khdha_2()) {
                                                                                                    (int)(3470175015761113030L ^ (long)var1_2 ^ -1232357426642301568L);
                                                                                                    var2_3 = Integer.reverse(Integer.reverse(-528245000 * 301766103 + 1992839339 ^ var1_2));
                                                                                                    (int)(481062324787403589L ^ (long)var1_2 ^ -2723090911689072501L);
                                                                                                    var2_3 = (-441946145 * 301766103 + 1992839339 ^ var1_2) + -457411209 - -457411209;
                                                                                                    var3_1 -= 5;
                                                                                                    continue;
                                                                                                }
                                                                                                var2_3 = Integer.reverse(Integer.reverse(1569935585 * 301766103 + 1992839339 ^ var1_2));
                                                                                                var3_1 -= 3;
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateRight(2005829426 ^ var1_2, 17) + 2124414537) * 2005829427;
                                                                                            if (!yf.khdha_2()) {
                                                                                                try {
                                                                                                    var3_1 += 4;
                                                                                                    if ((954705783869829065L ^ (long)var1_2 | 1L) == 0L) {
                                                                                                        throw new IllegalArgumentException();
                                                                                                    }
                                                                                                    var2_3 = 1569935585 * 301766103 + 1992839339 ^ var1_2;
                                                                                                }
                                                                                                catch (IllegalArgumentException v1) {
                                                                                                    var2_3 = (int)((long)(1569935585 * 301766103 + 1992839339 ^ var1_2) ^ 6664882686542389319L ^ 6664882686542389319L);
                                                                                                }
                                                                                                var3_1 -= 2;
                                                                                                continue;
                                                                                            }
                                                                                            var2_3 = -1703382257 * 301766103 + 1992839339 ^ var1_2 ^ -481119502 ^ -481119502;
                                                                                            Integer.rotateRight(867922123 ^ var1_2, 9) + 1209026512;
                                                                                            var2_3 = Integer.reverse(Integer.reverse(-441946145 * 301766103 + 1992839339 ^ var1_2));
                                                                                            --var3_1;
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateRight(884761322 ^ var1_2, 9) + 1731041681;
                                                                                        if (var0 != bfn.khdq_2()) {
                                                                                            var2_3 = (int)((long)(1563100619 * 301766103 + 1992839339 ^ var1_2) ^ 5913009677341034320L ^ 5913009677341034320L);
                                                                                            var3_1 += 3;
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            if ((4763615712368325825L ^ (long)var1_2 | 1L) == 0L) {
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            var2_3 = (int)((long)(186965996 * 301766103 + 1992839339 ^ var1_2) ^ 2862937213175994091L ^ 2862937213175994091L);
                                                                                        }
                                                                                        catch (UnsupportedOperationException v2) {
                                                                                            var2_3 = (186965996 * 301766103 + 1992839339 ^ var1_2) + 274933783 - 274933783;
                                                                                        }
                                                                                        var3_1 -= 4;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateLeft(-311877675 ^ var1_2, 16) - -1005028858) * -311877675;
                                                                                    (int)(3448545550341040975L ^ (long)var1_2 ^ -7016464070983683482L);
                                                                                    bfn.hghsh(var0);
                                                                                    return;
                                                                                }
                                                                                Integer.rotateLeft(1312664608 ^ var1_2, 12) + 2111141659;
                                                                                if (var0 >= 0) {
                                                                                    (int)(5900696057853825001L ^ (long)var1_2 ^ 786585577913126423L);
                                                                                    var2_3 = (-835532560 * 301766103 + 1992839339 ^ var1_2) + -1610497432 - -1610497432;
                                                                                    var3_1 += 2;
                                                                                    continue;
                                                                                }
                                                                                (int)(115102223011865188L ^ (long)var1_2 ^ 2650819482195308256L);
                                                                                var2_3 = (int)((long)(-995200098 * 301766103 + 1992839339 ^ var1_2) ^ 1784450832630469283L ^ 1784450832630469283L);
                                                                                var3_1 += 4;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateLeft(-19260771 ^ var1_2, 18) - -523839426) * -19260771;
                                                                            (int)(4352927639809616719L ^ (long)var1_2 ^ -7768565208754563840L);
                                                                            if (var0 > (Integer.reverse(773245174) ^ 1863542908)) {
                                                                                var2_3 = -159247526 * 301766103 + 1992839339 ^ var1_2;
                                                                                Integer.rotateLeft(-2106329108 ^ var1_2, 3) - -798448433;
                                                                                var2_3 = -995200098 * 301766103 + 1992839339 ^ var1_2;
                                                                                var3_1 -= 3;
                                                                                continue;
                                                                            }
                                                                            var2_3 = 615868663 * 301766103 + 1992839339 ^ var1_2;
                                                                            (Integer.rotateRight(-1138051725 ^ var1_2, 10) + -846620632) * -1138051725;
                                                                            var2_3 = 1809886838 * 301766103 + 1992839339 ^ var1_2 ^ 793454005 ^ 793454005;
                                                                            var3_1 -= 4;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateLeft(367424556 ^ var1_2, 5) - -1421496177;
                                                                        thdh.dht_5((class_2596)new class_2868(var0));
                                                                        bfn.hghsh(var0);
                                                                        return;
                                                                    }
                                                                    (Integer.rotateRight(0x1A1BAB1A ^ var1_2, 6) + 766990177) * 0x1A1BAB1B;
                                                                    return;
                                                                }
                                                                (Integer.rotateRight(-354151590 ^ var1_2, 16) + 1979447073) * -354151589;
                                                                var2_3 = Integer.reverse(Integer.reverse(729722817 * 301766103 + 1992839339 ^ var1_2));
                                                                Integer.rotateLeft(1308981061 ^ var1_2, 12) - 1996951702;
                                                                (int)(-8306931877574022321L ^ (long)var1_2 ^ 5728722874474738878L);
                                                                (int)(-8412751607663734598L ^ (long)var1_2 ^ 3497150137003850670L);
                                                                var2_3 = (-987953587 * 301766103 + 1992839339 ^ var1_2) + 100754466 - 100754466;
                                                                (int)(7263512098993050819L ^ (long)var1_2 ^ -6414629155935001525L);
                                                                var2_3 = -63413893 * 301766103 + 1992839339 ^ var1_2 ^ -486923241 ^ -486923241;
                                                                var3_1 += 2;
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(-447492137 ^ var1_2, 15) - -914109884) * -447492137;
                                                            var2_3 = -63413893 * 301766103 + 1992839339 ^ var1_2;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(148661726 ^ var1_2, 4) - 386790685) * 148661727;
                                                        try {
                                                            var2_3 = (-63413893 * 301766103 + 1992839339 ^ var1_2) + 476792717 - 476792717;
                                                        }
                                                        catch (IllegalArgumentException v3) {
                                                            var2_3 = (-63413893 * 301766103 + 1992839339 ^ var1_2) + 1058612660 - 1058612660;
                                                        }
                                                        ++var3_1;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(52589837 ^ var1_2, 3) - 1703529422;
                                                    (int)(-4498855027869947057L ^ (long)var1_2 ^ 5408967300931399408L);
                                                    var2_3 = Integer.reverse(Integer.reverse(-2126955449 * 301766103 + 1992839339 ^ var1_2));
                                                    Integer.rotateRight(-1316323185 ^ var1_2, 9) - -2078068596;
                                                    var2_3 = -63413893 * 301766103 + 1992839339 ^ var1_2;
                                                    Integer.rotateRight(96799586 ^ var1_2, 3) + -1220935655;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1607387226 ^ var1_2, 14) + -1637359071) * 1607387227;
                                                try {
                                                    var2_3 = (-63413893 * 301766103 + 1992839339 ^ var1_2) + -1717886202 - -1717886202;
                                                }
                                                catch (IllegalStateException v4) {
                                                    var2_3 = -63413893 * 301766103 + 1992839339 ^ var1_2 ^ 1525615913 ^ 1525615913;
                                                }
                                                var3_1 += 2;
                                                continue;
                                            }
                                            Integer.rotateRight(-1324572402 ^ var1_2, 9) - 1961172973;
                                            var2_3 = (-2041610231 * 301766103 + 1992839339 ^ var1_2) + -1883490651 - -1883490651;
                                            (Integer.rotateLeft(1319340056 ^ var1_2, 12) + -1976886749) * 1319340057;
                                            var2_3 = (361094158 * 301766103 + 1992839339 ^ var1_2) + 1591284920 - 1591284920;
                                            (Integer.rotateRight(-307375526 ^ var1_2, 16) + -865462239) * -307375525;
                                            var2_3 = -63413893 * 301766103 + 1992839339 ^ var1_2;
                                            var3_1 -= 2;
                                            continue;
                                        }
                                        Integer.rotateLeft(562254369 ^ var1_2, 7) + 323260730;
                                        (int)(-2075600755383538865L ^ (long)var1_2 ^ 380698316972256178L);
                                        var2_3 = 1335292974 * 301766103 + 1992839339 ^ var1_2 ^ -2093754801 ^ -2093754801;
                                        (Integer.rotateLeft(-1205982531 ^ var1_2, 10) - 1342491678) * -1205982531;
                                        (int)(8839585854580386639L ^ (long)var1_2 ^ -833021782604031864L);
                                        try {
                                            var3_1 -= 2;
                                            if ((-4005445033459931961L ^ (long)var1_2 | 1L) == 0L) {
                                                throw new ArithmeticException();
                                            }
                                            var2_3 = Integer.reverse(Integer.reverse(-63413893 * 301766103 + 1992839339 ^ var1_2));
                                        }
                                        catch (ArithmeticException v5) {
                                            var2_3 = Integer.reverse(Integer.reverse(-63413893 * 301766103 + 1992839339 ^ var1_2));
                                        }
                                        var3_1 += 2;
                                        continue;
                                    }
                                    (Integer.rotateRight(1012329047 ^ var1_2, 10) - 1390673860) * 1012329047;
                                    var2_3 = Integer.reverse(Integer.reverse(152088109 * 301766103 + 1992839339 ^ var1_2));
                                    Integer.rotateLeft(1186842120 ^ var1_2, 11) + -1789355469;
                                    var2_3 = Integer.reverse(Integer.reverse(-63413893 * 301766103 + 1992839339 ^ var1_2));
                                    var3_1 += 2;
                                    continue;
                                }
                                (Integer.rotateLeft(-1013914767 ^ var1_2, 11) + -1293342230) * -1013914767;
                                (int)(81712732727208783L ^ (long)var1_2 ^ 7487378528962981781L);
                                (int)(-5168235469251077332L ^ (long)var1_2 ^ -8718252143884182180L);
                                var2_3 = (-63413893 * 301766103 + 1992839339 ^ var1_2) + -1008380112 - -1008380112;
                                var3_1 += 5;
                                continue;
                            }
                            Integer.rotateRight(-1204408734 ^ var1_2, 10) + 1391279385;
                            var2_3 = -436700583 * 301766103 + 1992839339 ^ var1_2;
                            Integer.rotateRight(955107522 ^ var1_2, 10) + -383193415;
                            var2_3 = (-1095212501 * 301766103 + 1992839339 ^ var1_2) + -232372397 - -232372397;
                            (Integer.rotateLeft(-373567211 ^ var1_2, 16) - 1377562822) * -373567211;
                            (int)(3101149628864981839L ^ (long)var1_2 ^ 225324129828076483L);
                            var2_3 = (int)((long)(-63413893 * 301766103 + 1992839339 ^ var1_2) ^ 3248032978498924022L ^ 3248032978498924022L);
                            var3_1 += 4;
                            continue;
                        }
                        Integer.rotateRight(-1120103517 ^ var1_2, 10) + -290226184;
                        var2_3 = 1421433574 * 301766103 + 1992839339 ^ var1_2 ^ 347905416 ^ 347905416;
                        (Integer.rotateRight(312421175 ^ var1_2, 5) - 1168366308) * 312421175;
                        (int)(-4688261526800773323L ^ (long)var1_2 ^ 1767378502837653518L);
                        var2_3 = Integer.reverse(Integer.reverse(888450287 * 301766103 + 1992839339 ^ var1_2));
                        (int)(-7480305044012660497L ^ (long)var1_2 ^ -4534266570390069840L);
                        var2_3 = Integer.reverse(Integer.reverse(-63413893 * 301766103 + 1992839339 ^ var1_2));
                        var3_1 += 5;
                        continue;
                    }
                    (Integer.rotateRight(1605583487 ^ var1_2, 14) - -1693274980) * 1605583487;
                    var2_3 = (int)((long)(1137416264 * 301766103 + 1992839339 ^ var1_2) ^ 2189594605031615654L ^ 2189594605031615654L);
                    (Integer.rotateRight(-919121190 ^ var1_2, 12) + 1645258657) * -919121189;
                    try {
                        var3_1 -= 5;
                        var2_3 = (-63413893 * 301766103 + 1992839339 ^ var1_2) + -1285218264 - -1285218264;
                    }
                    catch (IllegalArgumentException v6) {
                        var2_3 = (-63413893 * 301766103 + 1992839339 ^ var1_2) + -878066840 - -878066840;
                    }
                    --var3_1;
                    continue;
                }
                Integer.rotateLeft(1680591373 ^ var1_2, 15) - 631969486;
                (int)(-6442007633987310769L ^ (long)var1_2 ^ 3823700232097030371L);
                var2_3 = Integer.reverse(Integer.reverse(-1487146406 * 301766103 + 1992839339 ^ var1_2));
                (Integer.rotateLeft(-1040322660 ^ var1_2, 11) - -2111986913) * -1040322659;
                var2_3 = (1013683460 * 301766103 + 1992839339 ^ var1_2) + 961129258 - 961129258;
                Integer.rotateLeft(-1135924728 ^ var1_2, 10) + -780683725;
                var2_3 = -63413893 * 301766103 + 1992839339 ^ var1_2;
                var3_1 -= 5;
                continue;
            }
            Integer.rotateRight(-1012865245 ^ var1_2, 11) + -1260807048;
            (int)(7518689986013218209L ^ (long)var1_2 ^ 8942193406183308670L);
            var2_3 = Integer.reverse(Integer.reverse(-63413893 * 301766103 + 1992839339 ^ var1_2));
            ++var3_1;
            continue;
lbl364:
            // 13 sources

            (Integer.rotateLeft(-454542608 ^ var1_2, 15) + -1132674485) * -454542607;
            var2_3 = -63413893 * 301766103 + 1992839339 ^ var1_2 ^ 945126731 ^ 945126731;
        }
    }

    public static void ddz_5() {
        int n = 0;
        int n2 = 0;
        int n3 = 485165048;
        n3 = Integer.rotateLeft(n3 * 1296982579, 14) ^ 0x3FF7C141;
        int n4 = n3 - -61320031 + 2135097548 - 2135097548;
        while (true) {
            block30: {
                block41: {
                    block51: {
                        block45: {
                            block29: {
                                block36: {
                                    block37: {
                                        block31: {
                                            block44: {
                                                block35: {
                                                    block50: {
                                                        block48: {
                                                            block43: {
                                                                block49: {
                                                                    block34: {
                                                                        block32: {
                                                                            block28: {
                                                                                block38: {
                                                                                    block47: {
                                                                                        block42: {
                                                                                            block46: {
                                                                                                block39: {
                                                                                                    block40: {
                                                                                                        block25: {
                                                                                                            block33: {
                                                                                                                block26: {
                                                                                                                    block27: {
                                                                                                                        if ((n2 = n3 - n4) > -61320031) break block25;
                                                                                                                        if (n2 > -1151054511) break block26;
                                                                                                                        if (n2 > -1515570661) break block27;
                                                                                                                        if (n2 == -1518425673) break block28;
                                                                                                                        if (n2 == -1515570661) break block29;
                                                                                                                        int cfr_ignored_0 = Integer.rotateRight(0x9B9E784A ^ n3, 6) + -594661327;
                                                                                                                        break block30;
                                                                                                                    }
                                                                                                                    if (n2 == -1383514596) break block31;
                                                                                                                    if (n2 == -1151054511) break block32;
                                                                                                                    break block30;
                                                                                                                }
                                                                                                                if (n2 > -753926003) break block33;
                                                                                                                if (n2 == -852186989) break block34;
                                                                                                                if (n2 == -753926003) break block35;
                                                                                                                break block30;
                                                                                                            }
                                                                                                            if (n2 == -713031185) break block36;
                                                                                                            if (n2 == -490481146) break block37;
                                                                                                            if (n2 == -61320031) break block38;
                                                                                                            break block30;
                                                                                                        }
                                                                                                        if (n2 > 685747132) break block39;
                                                                                                        if (n2 > 495687530) break block40;
                                                                                                        if (n2 == 430763888) break block41;
                                                                                                        if (n2 == 495687530) break block42;
                                                                                                        break block30;
                                                                                                    }
                                                                                                    if (n2 == 565035140) break block43;
                                                                                                    if (n2 == 576358090) break block44;
                                                                                                    if (n2 == 685747132) break block45;
                                                                                                    break block30;
                                                                                                }
                                                                                                if (n2 > 1195497833) break block46;
                                                                                                if (n2 == 984596867) break block47;
                                                                                                if (n2 == 1195497833) break block48;
                                                                                                int cfr_ignored_1 = (Integer.rotateLeft(0xCD90173D ^ n3, 12) - -388993122) * -846194883;
                                                                                                int cfr_ignored_2 = (int)(0xF22B90027D4EB4FL ^ (long)n3 ^ 0x8F70831A2DB9B394L);
                                                                                                break block30;
                                                                                            }
                                                                                            if (n2 == 1260439041) break block49;
                                                                                            if (n2 == 1599012296) break block50;
                                                                                            int cfr_ignored_3 = Integer.rotateLeft(0xC615D26C ^ n3, 11) - 16915023;
                                                                                            if (n2 == 1860443117) break block51;
                                                                                            break block30;
                                                                                        }
                                                                                        int cfr_ignored_4 = (Integer.rotateLeft(0xFDDE15F4 ^ n3, 18) - -1035843641) * -35777035;
                                                                                        n = bfn.mc.field_1724.method_31548().field_7545;
                                                                                        bfn.hhz_4(n);
                                                                                        return;
                                                                                    }
                                                                                    int cfr_ignored_5 = (Integer.rotateLeft(0x33478319 ^ n3, 9) + 973504322) * 860324633;
                                                                                    int cfr_ignored_6 = (int)(0xF1F52D2427D4EB4FL ^ (long)n3 ^ 0xA738831A2DB84E3BL);
                                                                                    throw null;
                                                                                }
                                                                                int cfr_ignored_7 = (Integer.rotateRight(0x46CB7A56 ^ n3, 11) - -1761513563) * 1187740247;
                                                                                if (!yf.dnkh()) {
                                                                                    n4 = (int)((long)(n3 - -1151054511) ^ 0x5A5F98B9FDDA3009L ^ 0x5A5F98B9FDDA3009L);
                                                                                    n2 += 3;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    n2 += 2;
                                                                                    if ((0x5C95D09E8660CF39L ^ (long)n3 | 1L) == 0L) {
                                                                                        throw new UnsupportedOperationException();
                                                                                    }
                                                                                    n4 = n3 - 984596867 + 1142943281 - 1142943281;
                                                                                }
                                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                    n4 = n3 - 984596867;
                                                                                }
                                                                                n2 -= 5;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_8 = (Integer.rotateLeft(0x8553075 ^ n3, 4) - 112098662) * 139800693;
                                                                            int cfr_ignored_9 = (int)(0xCAE79E4827D4EB4FL ^ (long)n3 ^ 0xC1E0831A2DB8381EL);
                                                                            return;
                                                                        }
                                                                        int cfr_ignored_10 = (Integer.rotateRight(0xA82803BB ^ n3, 8) + 1630933728) * -1473772613;
                                                                        if (bfn.mc.field_1724 != null) {
                                                                            n4 = (int)((long)(n3 - 495687530) ^ 0x38EB90F3784B1071L ^ 0x38EB90F3784B1071L);
                                                                            ++n2;
                                                                            continue;
                                                                        }
                                                                        n4 = (int)((long)(n3 - -1167783079) ^ 0x50E811C28D5D6A75L ^ 0x50E811C28D5D6A75L);
                                                                        int cfr_ignored_11 = Integer.rotateLeft(0x25C39D05 ^ n3, 7) - -1760714026;
                                                                        int cfr_ignored_12 = (int)(0xE771333827D4EB4FL ^ (long)n3 ^ 0x9B00831A2DB86333L);
                                                                        n4 = (int)((long)(n3 - -1518425673) ^ 0xBC510C6B3D80CB6BL ^ 0xBC510C6B3D80CB6BL);
                                                                        n2 += 4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_13 = Integer.rotateLeft(0x5058D229 ^ n3, 13) + -1088482766;
                                                                    int cfr_ignored_14 = (int)(0x92EA7C1427D4EB4FL ^ (long)n3 ^ 0x558831A2DB88805L);
                                                                    n4 = (int)((long)(n3 - 619571007) ^ 0x4E05156DFA0F5F17L ^ 0x4E05156DFA0F5F17L);
                                                                    int cfr_ignored_15 = (Integer.rotateLeft(0xB677BFD1 ^ n3, 9) + 484301194) * -1233666095;
                                                                    int cfr_ignored_16 = (int)(0x74C511EC27D4EB4FL ^ (long)n3 ^ 0xDEA8831A2DB9445BL);
                                                                    int cfr_ignored_17 = (int)(0x67CC38F7D457B611L ^ (long)n3 ^ 0x8C9F641C97056249L);
                                                                    n4 = Integer.reverse(Integer.reverse(n3 - 1733986092));
                                                                    int cfr_ignored_18 = (int)(0xFCD8B747E0C2F211L ^ (long)n3 ^ 0x93FF0D361F045460L);
                                                                    n4 = Integer.reverse(Integer.reverse(n3 - -61320031));
                                                                    continue;
                                                                }
                                                                int cfr_ignored_19 = (Integer.rotateLeft(0xE28DF255 ^ n3, 15) - 1938683782) * -494013867;
                                                                int cfr_ignored_20 = (int)(0x203F5C6827D4EB4FL ^ (long)n3 ^ 0x45A0831A2DB9EDAFL);
                                                                n4 = n3 - -119134 + 1999167728 - 1999167728;
                                                                int cfr_ignored_21 = Integer.rotateRight(0xA249134A ^ n3, 7) + -1422461647;
                                                                try {
                                                                    n2 -= 3;
                                                                    n4 = n3 - -61320031 ^ 0xD19720B1 ^ 0xD19720B1;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n4 = n3 - -61320031;
                                                                }
                                                                ++n2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_22 = Integer.rotateLeft(0x197C4EED ^ n3, 6) - 443231726;
                                                            int cfr_ignored_23 = (int)(0xDBCEE0D027D4EB4FL ^ (long)n3 ^ 0x3CD0831A2DB81A4CL);
                                                            n4 = Integer.reverse(Integer.reverse(n3 - -1162051656));
                                                            int cfr_ignored_24 = (Integer.rotateLeft(0x94E26299 ^ n3, 5) + 197627842) * -1797102951;
                                                            int cfr_ignored_25 = (int)(0x5650CCA427D4EB4FL ^ (long)n3 ^ 0x6438831A2DB90170L);
                                                            n4 = n3 - -61320031 ^ 0x832C8014 ^ 0x832C8014;
                                                            n2 += 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_26 = Integer.rotateRight(0xB3022323 ^ n3, 9) + -1314922376;
                                                        try {
                                                            n2 -= 2;
                                                            if ((0x1EE19BB7B986A527L ^ (long)n3 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            n4 = n3 - -61320031 + -1686942156 - -1686942156;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n4 = n3 - -61320031 + -190947812 - -190947812;
                                                        }
                                                        n2 -= 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_27 = (Integer.rotateLeft(0x7B8859F1 ^ n3, 18) + -102726806) * 2072533489;
                                                    int cfr_ignored_28 = (int)(0xB93AF7CC27D4EB4FL ^ (long)n3 ^ 0x12E8831A2DB8DFA4L);
                                                    n4 = n3 - 2005260057;
                                                    int cfr_ignored_29 = (Integer.rotateLeft(0x9BB9A9F8 ^ n3, 6) + -539413437) * -1682331143;
                                                    try {
                                                        if ((0xEB3832621C573373L ^ (long)n3 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        n4 = n3 - -61320031 ^ 0x5AAAE4E5 ^ 0x5AAAE4E5;
                                                    }
                                                    catch (ArithmeticException arithmeticException) {
                                                        n4 = (int)((long)(n3 - -61320031) ^ 0x8A731B63F274F761L ^ 0x8A731B63F274F761L);
                                                    }
                                                    n2 += 3;
                                                    continue;
                                                }
                                                int cfr_ignored_30 = Integer.rotateRight(0xC16A8ACB ^ n3, 11) + 1883532752;
                                                n4 = n3 - 298469214 ^ 0xB1F64E8 ^ 0xB1F64E8;
                                                int cfr_ignored_31 = Integer.rotateRight(0xE887AE8A ^ n3, 16) + 751550961;
                                                n4 = n3 - 1778749854;
                                                int cfr_ignored_32 = Integer.rotateRight(0x7E16A0AB ^ n3, 18) + 1226511344;
                                                n4 = n3 - -61320031;
                                                n2 -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_33 = Integer.rotateLeft(0xA27C4C81 ^ n3, 7) + -1318395174;
                                            int cfr_ignored_34 = (int)(0x60CEE2BC27D4EB4FL ^ (long)n3 ^ 0x3808831A2DB96C4CL);
                                            n4 = n3 - 1861560720 + -2107861514 - -2107861514;
                                            int cfr_ignored_35 = Integer.rotateLeft(0xFD808748 ^ n3, 18) + -1225916173;
                                            n4 = n3 - -61320031 + 1581251950 - 1581251950;
                                            n2 -= 2;
                                            continue;
                                        }
                                        int cfr_ignored_36 = Integer.rotateLeft(0x475F9564 ^ n3, 11) - -1460619689;
                                        n4 = n3 - 1059066911;
                                        int cfr_ignored_37 = Integer.rotateLeft(0x1EBAF30D ^ n3, 6) - -1124004402;
                                        int cfr_ignored_38 = (int)(0xDC085D3027D4EB4FL ^ (long)n3 ^ 0x4710831A2DB815C1L);
                                        n4 = (int)((long)(n3 - -61320031) ^ 0x7FEE4902A3DA3371L ^ 0x7FEE4902A3DA3371L);
                                        n2 += 3;
                                        continue;
                                    }
                                    int cfr_ignored_39 = (Integer.rotateRight(0xA73D765F ^ n3, 7) - 1154413756) * -1489144225;
                                    n4 = (int)((long)(n3 - -61320031) ^ 0x16150CB3219FD8F3L ^ 0x16150CB3219FD8F3L);
                                    int cfr_ignored_40 = Integer.rotateLeft(0x217F2B09 ^ n3, 7) + 314824018;
                                    int cfr_ignored_41 = (int)(0xE3CD853427D4EB4FL ^ (long)n3 ^ 0xF718831A2DB86A4AL);
                                    n2 += 5;
                                    continue;
                                }
                                int cfr_ignored_42 = (Integer.rotateLeft(0xB1955430 ^ n3, 9) + -2056072949) * -1315613647;
                                try {
                                    n2 += 5;
                                    n4 = Integer.reverse(Integer.reverse(n3 - -61320031));
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n4 = n3 - -61320031 ^ 0xAB58F1F8 ^ 0xAB58F1F8;
                                }
                                n2 -= 4;
                                continue;
                            }
                            int cfr_ignored_43 = (Integer.rotateRight(0xCEED8A52 ^ n3, 12) + 320954153) * -823293357;
                            n4 = n3 - -61320031;
                            int cfr_ignored_44 = Integer.rotateRight(0xD1429CAE ^ n3, 13) - 1533974605;
                            --n2;
                            continue;
                        }
                        int cfr_ignored_45 = (Integer.rotateLeft(0x31D94ABC ^ n3, 9) - 229485567) * 836324029;
                        try {
                            ++n2;
                            if ((0xDBF6177997F36D1L ^ (long)n3 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n4 = n3 - -61320031;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n4 = (int)((long)(n3 - -61320031) ^ 0x50DA3DDF01278D71L ^ 0x50DA3DDF01278D71L);
                        }
                        continue;
                    }
                    int cfr_ignored_46 = (Integer.rotateRight(0x6BF9ECDB ^ n3, 16) + 396447168) * 1811541211;
                    n4 = n3 - 126593204;
                    int cfr_ignored_47 = (Integer.rotateLeft(0xAE3E10F0 ^ n3, 8) + 501328971) * -1371664143;
                    try {
                        n2 += 3;
                        if ((0x53C9976BA6B745AFL ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = Integer.reverse(Integer.reverse(n3 - -61320031));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = n3 - -61320031 + -1007964823 - -1007964823;
                    }
                    continue;
                }
                int cfr_ignored_48 = Integer.rotateRight(0xD304EFA3 ^ n3, 13) + -1846107144;
                try {
                    ++n2;
                    if ((0x34413F2AFA91041FL ^ (long)n3 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    n4 = n3 - -61320031;
                }
                catch (IllegalStateException illegalStateException) {
                    n4 = (int)((long)(n3 - -61320031) ^ 0x34C4991688D198EAL ^ 0x34C4991688D198EAL);
                }
                n2 += 4;
                continue;
            }
            int cfr_ignored_49 = (Integer.rotateRight(0x4E32DC3E ^ n3, 12) - 2089175741) * 1311956031;
            n4 = n3 - -61320031 + 390131714 - 390131714;
        }
    }

    public static void hhz_4(int n) {
        int n2 = 0;
        int n3 = -470863581;
        n3 = Integer.rotateLeft(n3 * -1951038191, 19) ^ 0xC9C46CAB;
        int n4 = Integer.reverse(Integer.reverse((n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677));
        block36: while (true) {
            switch (n4 - -241729677 ^ 0xF1977F73 ^ n3) {
                case -657322012: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xFF2AAA36 ^ n3, 18) - -360170555) * -13981129;
                    thdh.dht_5((class_2596)new class_2868(n));
                    bfn.khqgh(n);
                    return;
                }
                case 652521412: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x364C139D ^ n3, 9) - -1751908546) * 910955421;
                    int cfr_ignored_2 = (int)(0xF4FEBDA027D4EB4FL ^ (long)n3 ^ 0x8630831A2DB8442CL);
                    if (n > Integer.rotateLeft(0x3DF03E12 ^ 0x2DF03E12, 7)) {
                        int cfr_ignored_3 = (int)(0x8713F23C705F3490L ^ (long)n3 ^ 0x19082C0D9206A3F6L);
                        n4 = (n3 ^ 0x208761A ^ 0xF1977F73) + -241729677 ^ 0xF03296C7 ^ 0xF03296C7;
                        n2 -= 5;
                        continue block36;
                    }
                    try {
                        n2 -= 2;
                        n4 = (int)((long)((n3 ^ 0xF34A5220 ^ 0xF1977F73) + -241729677) ^ 0x81D0D39C3E9EAA9DL ^ 0x81D0D39C3E9EAA9DL);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n4 = (n3 ^ 0xF34A5220 ^ 0xF1977F73) + -241729677;
                    }
                    continue block36;
                }
                case -275200602: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0x2B881B7C ^ n3, 8) - 1238954815) * 730340221;
                    bfn.hghsh(n);
                    return;
                }
                case -870317380: {
                    int cfr_ignored_5 = Integer.rotateLeft(0xAFAEBC41 ^ n3, 8) + 1250323226;
                    int cfr_ignored_6 = (int)(0x6D1C127C27D4EB4FL ^ (long)n3 ^ 0xD988831A2DB977E9L);
                    if (bfn.mc.field_1724 == null) {
                        int cfr_ignored_7 = (int)(0xD0710E2537B165A6L ^ (long)n3 ^ 0xE13AA3D1306A0D33L);
                        n4 = (n3 ^ 0x208761A ^ 0xF1977F73) + -241729677;
                        n2 -= 3;
                        continue block36;
                    }
                    n4 = (n3 ^ 0x1E7C9152 ^ 0xF1977F73) + -241729677;
                    n2 -= 5;
                    continue block36;
                }
                case 34108954: {
                    int cfr_ignored_8 = Integer.rotateRight(0x1DD2842A ^ n3, 6) + -1596219311;
                    return;
                }
                case -2076884448: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0x9DCD1F7D ^ n3, 6) - 540307294) * -1647501443;
                    int cfr_ignored_10 = (int)(0x5F7FB14027D4EB4FL ^ (long)n3 ^ 0x9FF0831A2DB9132EL);
                    if (n >= 0) {
                        try {
                            n2 -= 4;
                            if ((0x66D13964F9691457L ^ (long)n3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n4 = Integer.reverse(Integer.reverse((n3 ^ 0x26E4AFC4 ^ 0xF1977F73) + -241729677));
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n4 = (n3 ^ 0x26E4AFC4 ^ 0xF1977F73) + -241729677;
                        }
                        n2 -= 2;
                        continue block36;
                    }
                    n4 = (n3 ^ 0x208761A ^ 0xF1977F73) + -241729677;
                    n2 += 3;
                    continue block36;
                }
                case 511480146: {
                    int cfr_ignored_11 = Integer.rotateRight(0xC214A803 ^ n3, 11) + -2065827944;
                    if (n < 0) {
                        n4 = (n3 ^ 0x9756A5DC ^ 0xF1977F73) + -241729677 + 2129653020 - 2129653020;
                        int cfr_ignored_12 = (Integer.rotateRight(0x7B771A ^ n3, 3) + 324078433) * 0x7B771B;
                        n4 = (n3 ^ 0x208761A ^ 0xF1977F73) + -241729677 ^ 0x6294F5F9 ^ 0x6294F5F9;
                        continue block36;
                    }
                    n4 = (int)((long)((n3 ^ 0x26E4AFC4 ^ 0xF1977F73) + -241729677) ^ 0x3ED1485D05FA4A8L ^ 0x3ED1485D05FA4A8L);
                    int cfr_ignored_13 = Integer.rotateLeft(0xF14909A0 ^ n3, 17) + 1010157979;
                    n2 -= 5;
                    continue block36;
                }
                case -213233120: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0xA2FF85DD ^ n3, 7) - -1051798274) * -1560312355;
                    int cfr_ignored_15 = (int)(0x604D2BE027D4EB4FL ^ (long)n3 ^ 0xAAB0831A2DB96D4BL);
                    if (n != bfn.khdq_2()) {
                        int cfr_ignored_16 = (int)(0xC60CFC5D083AD60CL ^ (long)n3 ^ 0x5CADCC6573E21C8L);
                        n4 = (n3 ^ 0x5C66EB40 ^ 0xF1977F73) + -241729677 ^ 0x3780519F ^ 0x3780519F;
                        int cfr_ignored_17 = (int)(0x4D604257F5736FD9L ^ (long)n3 ^ 0x79DF265524953711L);
                        n4 = Integer.reverse(Integer.reverse((n3 ^ 0xD8D20FE4 ^ 0xF1977F73) + -241729677));
                        n2 += 3;
                        continue block36;
                    }
                    int cfr_ignored_18 = (int)(0x549FD59C61AF6D98L ^ (long)n3 ^ 0x56480FED201704EEL);
                    n4 = (n3 ^ 0x1D718133 ^ 0xF1977F73) + -241729677 + 1776693741 - 1776693741;
                    int cfr_ignored_19 = (int)(0xB2144509A0444DE5L ^ (long)n3 ^ 0x77638C3B60ECC9F9L);
                    n4 = Integer.reverse(Integer.reverse((n3 ^ 0xEF98C5A6 ^ 0xF1977F73) + -241729677));
                    --n2;
                    continue block36;
                }
                case 1783947260: {
                    int cfr_ignored_20 = Integer.rotateRight(0x259E7F6E ^ n3, 7) - -1836118643;
                    n4 = (int)((long)((n3 ^ 0x4BEC93F1 ^ 0xF1977F73) + -241729677) ^ 0xB6A951F4CCB59FD9L ^ 0xB6A951F4CCB59FD9L);
                    int cfr_ignored_21 = (Integer.rotateLeft(0x864B3474 ^ n3, 3) - 1199110471) * -2041891723;
                    int cfr_ignored_22 = (int)(0x77057C76116522F9L ^ (long)n3 ^ 0x59CEE79BED543DBL);
                    n4 = (int)((long)((n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677) ^ 0xDC412413C8394E5AL ^ 0xDC412413C8394E5AL);
                    --n2;
                    continue block36;
                }
                case 580015666: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x4D16F624 ^ n3, 12) - 1512402327;
                    n4 = (n3 ^ 0x43710E9F ^ 0xF1977F73) + -241729677;
                    int cfr_ignored_24 = (Integer.rotateLeft(0x8F98E2FD ^ n3, 4) - 1742805982) * -1885805827;
                    int cfr_ignored_25 = (int)(0x4D2A4CC027D4EB4FL ^ (long)n3 ^ 0x64F0831A2DB93785L);
                    try {
                        if ((0x6EF9CB02B8355CFBL ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = Integer.reverse(Integer.reverse((n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677));
                    }
                    continue block36;
                }
                case 183800160: {
                    int cfr_ignored_26 = Integer.rotateRight(0x6B7E9CCA ^ n3, 16) + 145922993;
                    n4 = (int)((long)((n3 ^ 0xA8724484 ^ 0xF1977F73) + -241729677) ^ 0x398BBFB40C9FCB36L ^ 0x398BBFB40C9FCB36L);
                    int cfr_ignored_27 = (Integer.rotateLeft(0x9634B411 ^ n3, 5) + 884960586) * -1774930927;
                    int cfr_ignored_28 = (int)(0x54861A2C27D4EB4FL ^ (long)n3 ^ 0xC928831A2DB904DDL);
                    n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677;
                    int cfr_ignored_29 = Integer.rotateRight(0x56E1DAC7 ^ n3, 13) - -1984488108;
                    n2 += 4;
                    continue block36;
                }
                case 481804279: {
                    int cfr_ignored_30 = (Integer.rotateRight(0xC733623F ^ n3, 11) - 597066972) * -952933825;
                    n4 = (int)((long)((n3 ^ 0x6835DD1D ^ 0xF1977F73) + -241729677) ^ 0xBCCFD10275A3AE57L ^ 0xBCCFD10275A3AE57L);
                    int cfr_ignored_31 = Integer.rotateLeft(0xB3414D48 ^ n3, 9) + -1186596109;
                    try {
                        n2 -= 2;
                        if ((0x1FE99596FA9E9A37L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n4 = (int)((long)((n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677) ^ 0xD6F78B14F8532DL ^ 0xD6F78B14F8532DL);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677;
                    }
                    continue block36;
                }
                case -2097569210: {
                    int cfr_ignored_32 = Integer.rotateLeft(0x114256A9 ^ n3, 5) + 459677106;
                    int cfr_ignored_33 = (int)(0xD3F0F89427D4EB4FL ^ (long)n3 ^ 0xC58831A2DB80A30L);
                    n4 = (n3 ^ 0x35C20049 ^ 0xF1977F73) + -241729677;
                    int cfr_ignored_34 = Integer.rotateLeft(0xEC49798D ^ n3, 16) - -1589422258;
                    int cfr_ignored_35 = (int)(0x2EFBD7B027D4EB4FL ^ (long)n3 ^ 0x5210831A2DB9F026L);
                    n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677 ^ 0x4A12EA23 ^ 0x4A12EA23;
                    n2 -= 2;
                    continue block36;
                }
                case 1562188464: {
                    int cfr_ignored_36 = (Integer.rotateRight(0x1092943A ^ n3, 5) + 102601281) * 278041659;
                    n4 = (int)((long)((n3 ^ 0x6100A129 ^ 0xF1977F73) + -241729677) ^ 0x5EC293A9A38B8C3EL ^ 0x5EC293A9A38B8C3EL);
                    int cfr_ignored_37 = Integer.rotateRight(0x4F1173CF ^ n3, 12) - -1753569972;
                    n4 = (n3 ^ 0x1540E7B7 ^ 0xF1977F73) + -241729677;
                    int cfr_ignored_38 = Integer.rotateRight(0x6D39AB0F ^ n3, 16) - 1046042124;
                    n4 = Integer.reverse(Integer.reverse((n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677));
                    ++n2;
                    continue block36;
                }
                case 1995999985: {
                    int cfr_ignored_39 = Integer.rotateRight(0x317DB343 ^ n3, 9) + 43406424;
                    n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677 ^ 0x65FF1AD3 ^ 0x65FF1AD3;
                    n2 -= 4;
                    continue block36;
                }
                case -1509375798: {
                    int cfr_ignored_40 = Integer.rotateLeft(0xD1676F04 ^ n3, 13) - 1608782007;
                    n4 = (int)((long)((n3 ^ 0x95DCAD77 ^ 0xF1977F73) + -241729677) ^ 0x3A361E653CFA9643L ^ 0x3A361E653CFA9643L);
                    int cfr_ignored_41 = Integer.rotateLeft(0xD55A3D80 ^ n3, 13) + -632614469;
                    int cfr_ignored_42 = (int)(0x5FB50ED132E02838L ^ (long)n3 ^ 0xE0D2A973AB5712BBL);
                    n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677;
                    n2 -= 3;
                    continue block36;
                }
                case 1801165649: {
                    int cfr_ignored_43 = (Integer.rotateRight(0xDF88A32 ^ n3, 4) + -1250534583) * 234392115;
                    int cfr_ignored_44 = (int)(0x7EF532F9BBC2CE12L ^ (long)n3 ^ 0x9883BB366703503BL);
                    n4 = (n3 ^ 0xB8314CCD ^ 0xF1977F73) + -241729677;
                    int cfr_ignored_45 = (int)(0x24A1E7945CC278F7L ^ (long)n3 ^ 0x325875370AC9E492L);
                    n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677;
                    n2 -= 5;
                    continue block36;
                }
                case 1985349088: {
                    int cfr_ignored_46 = Integer.rotateRight(0x74DCEFCA ^ n3, 17) + 723429553;
                    n4 = (n3 ^ 0xD818DB07 ^ 0xF1977F73) + -241729677;
                    int cfr_ignored_47 = Integer.rotateLeft(0xB931470D ^ n3, 10) - 1901410766;
                    int cfr_ignored_48 = (int)(0x7B83E93027D4EB4FL ^ (long)n3 ^ 0x2F10831A2DB95AD6L);
                    try {
                        n2 += 4;
                        if ((0xE50713C084C49C3BL ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n4 = (int)((long)((n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677) ^ 0x3CB41ED5BA5A476AL ^ 0x3CB41ED5BA5A476AL);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677 + 1506968933 - 1506968933;
                    }
                    n2 += 2;
                    continue block36;
                }
                case 477881012: {
                    int cfr_ignored_49 = (Integer.rotateLeft(0x9F0670B9 ^ n3, 6) + 1176847778) * -1626967879;
                    int cfr_ignored_50 = (int)(0x5DB4DE8427D4EB4FL ^ (long)n3 ^ 0x4078831A2DB916B8L);
                    n4 = (n3 ^ 0x81F6E19F ^ 0xF1977F73) + -241729677;
                    int cfr_ignored_51 = Integer.rotateRight(0x164B9EAF ^ n3, 5) - -1215965588;
                    n4 = (int)((long)((n3 ^ 0xEA7F586 ^ 0xF1977F73) + -241729677) ^ 0xF52C75A11DB6D97AL ^ 0xF52C75A11DB6D97AL);
                    int cfr_ignored_52 = (Integer.rotateLeft(0xEF1BC03C ^ n3, 16) - -122034561) * -283393987;
                    n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677;
                    n2 += 3;
                    continue block36;
                }
                case -563868323: {
                    int cfr_ignored_53 = Integer.rotateRight(0x6EB58542 ^ n3, 16) + 1817756217;
                    try {
                        n2 += 3;
                        if ((0x84E21DB4F19D9DDDL ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677 + 449581635 - 449581635;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677 + -34454859 - -34454859;
                    }
                    n2 += 3;
                    continue block36;
                }
                case -814807945: {
                    int cfr_ignored_54 = Integer.rotateRight(0x59B1B48B ^ n3, 14) + -522028016;
                    n4 = (int)((long)((n3 ^ 0xD6395C92 ^ 0xF1977F73) + -241729677) ^ 0xAE0A0E0E8CBD47L ^ 0xAE0A0E0E8CBD47L);
                    int cfr_ignored_55 = (Integer.rotateRight(0xAEC8AD12 ^ n3, 8) + 782931049) * -1362580205;
                    n4 = (int)((long)((n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677) ^ 0x8719CF6B8CA9FECAL ^ 0x8719CF6B8CA9FECAL);
                    continue block36;
                }
                case -1691972890: {
                    int cfr_ignored_56 = Integer.rotateLeft(0x98B1964C ^ n3, 6) - -2116103569;
                    n4 = (n3 ^ 0xFE49A944 ^ 0xF1977F73) + -241729677 ^ 0x8264BC46 ^ 0x8264BC46;
                    int cfr_ignored_57 = (Integer.rotateRight(0x20450152 ^ n3, 7) + -323434455) * 541393235;
                    n4 = (n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677 ^ 0xAE9EB375 ^ 0xAE9EB375;
                    n2 += 3;
                    continue block36;
                }
            }
            int cfr_ignored_58 = (Integer.rotateRight(0xEBC0325B ^ n3, 16) + -1868318656) * -339725733;
            n4 = Integer.reverse(Integer.reverse((n3 ^ 0xCC2002BC ^ 0xF1977F73) + -241729677));
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void bnd() {
        var2 = 0;
        var0_1 = 1888283463;
        var0_1 = Integer.rotateLeft(var0_1 * 95712325, 18) ^ -206997936;
        var1_2 = Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) + -621252825 - -621252825;
        block20: while (true) {
            if ((var2 = Integer.reverse(var1_2) ^ var0_1 ^ -1066606356) == 463113141) ** GOTO lbl-1000
            if (var2 == 1368961895) ** GOTO lbl90
            if (var2 != -1273602410) {
                switch (var2) {
                    case 1083096988: {
                        (Integer.rotateLeft(836738905 ^ var0_1, 9) + 242346754) * 836738905;
                        (int)(-906013643796845745L ^ (long)var0_1 ^ -6937651077504808181L);
                        if (bfn.mc.field_1724 != null) {
                            var1_2 = (int)((long)Integer.reverse(var0_1 ^ 1528775057 ^ -1066606356) ^ -4204231119271638099L ^ -4204231119271638099L);
                            Integer.rotateLeft(-1179942240 ^ var0_1, 10) + -2145226597;
                            var1_2 = Integer.reverse(Integer.reverse(Integer.reverse(var0_1 ^ -1620432715 ^ -1066606356)));
                            continue block20;
                        }
                        try {
                            var2 -= 5;
                            if ((4414891075301033503L ^ (long)var0_1 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var1_2 = Integer.reverse(var0_1 ^ 463113141 ^ -1066606356) ^ 1500510669 ^ 1500510669;
                        }
                        catch (IllegalStateException v0) {
                            var1_2 = Integer.reverse(var0_1 ^ 463113141 ^ -1066606356) ^ -824718953 ^ -824718953;
                        }
                        var2 -= 5;
                        continue block20;
                    }
                    case -1620432715: {
                        (Integer.rotateRight(852339871 ^ var0_1, 9) - 725976700) * 852339871;
                        bfn.rnj = bfn.jmt = bfn.mc.field_1724.method_31548().field_7545;
                        return;
                    }
                }
            }
            ** GOTO lbl146
lbl-1000:
            // 1 sources

            {
                (Integer.rotateLeft(419390653 ^ var0_1, 6) - 189452830) * 419390653;
                (int)(-2716292348461651121L ^ (long)var0_1 ^ 7525659125795526986L);
                bfn.jmt = -1;
                bfn.rnj = -1;
                return;
                case -1542937788: {
                    (Integer.rotateLeft(-1634321999 ^ var0_1, 6) + 948870058) * -1634321999;
                    (int)(6639598378870434639L ^ (long)var0_1 ^ -3285231779707284072L);
                    var1_2 = Integer.reverse(Integer.reverse(Integer.reverse(var0_1 ^ -1993067733 ^ -1066606356)));
                    (Integer.rotateRight(1349801106 ^ var0_1, 13) + -1032594199) * 1349801107;
                    var1_2 = Integer.reverse(Integer.reverse(Integer.reverse(var0_1 ^ -1342343700 ^ -1066606356)));
                    (Integer.rotateRight(-999534221 ^ var0_1, 11) + -847545304) * -999534221;
                    var1_2 = Integer.reverse(Integer.reverse(Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356)));
                    continue block20;
                }
                case 922119799: {
                    (Integer.rotateRight(-18837158 ^ var0_1, 18) + -510707423) * -18837157;
                    var1_2 = Integer.reverse(Integer.reverse(Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356)));
                    (Integer.rotateRight(-892758509 ^ var0_1, 12) + -1832465528) * -892758509;
                    var2 += 2;
                    continue block20;
                }
                case 1870121508: {
                    (Integer.rotateRight(-2009904073 ^ var0_1, 4) - -2104239644) * -2009904073;
                    var1_2 = Integer.reverse(var0_1 ^ 1066752536 ^ -1066606356) + -1211394102 - -1211394102;
                    Integer.rotateRight(-197990234 ^ var0_1, 17) - -1769485483;
                    var1_2 = Integer.reverse(var0_1 ^ -376604532 ^ -1066606356) ^ -802511488 ^ -802511488;
                    (Integer.rotateRight(-49465766 ^ var0_1, 18) + -1460194271) * -49465765;
                    var1_2 = Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356);
                    var2 -= 3;
                    continue block20;
                }
                case 205950722: {
                    (Integer.rotateLeft(-1745459403 ^ var0_1, 5) - 1798577830) * -1745459403;
                    (int)(6144256828505385807L ^ (long)var0_1 ^ 8025558684433712984L);
                    try {
                        var2 -= 5;
                        var1_2 = (int)((long)Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) ^ -646486411028227555L ^ -646486411028227555L);
                    }
                    catch (UnsupportedOperationException v1) {
                        var1_2 = Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) + 293893982 - 293893982;
                    }
                    var2 += 2;
                    continue block20;
                }
lbl90:
                // 1 sources

                Integer.rotateLeft(988466948 ^ var0_1, 10) - 650948791;
                var1_2 = Integer.reverse(var0_1 ^ 1242055230 ^ -1066606356);
                (Integer.rotateLeft(-1942299083 ^ var0_1, 4) - -8484954) * -1942299083;
                (int)(5658896112121342799L ^ (long)var0_1 ^ 2116835973323632833L);
                var1_2 = Integer.reverse(var0_1 ^ -364222420 ^ -1066606356) + 36882089 - 36882089;
                (Integer.rotateRight(-366135918 ^ var0_1, 16) + 1607932905) * -366135917;
                var1_2 = Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) + 807899406 - 807899406;
                continue block20;
                case -2129594498: {
                    Integer.rotateRight(-667394389 ^ var0_1, 14) + 858854896;
                    var1_2 = Integer.reverse(var0_1 ^ 1433075546 ^ -1066606356);
                    Integer.rotateRight(-734394557 ^ var0_1, 13) + -1218150312;
                    var1_2 = (int)((long)Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) ^ -7713487739621821527L ^ -7713487739621821527L);
                    continue block20;
                }
                case 1244352365: {
                    (Integer.rotateLeft(837620761 ^ var0_1, 9) + 269684290) * 837620761;
                    (int)(-909803935255696561L ^ (long)var0_1 ^ -8558946943358186642L);
                    var1_2 = (int)((long)Integer.reverse(var0_1 ^ -22450037 ^ -1066606356) ^ -6825117086408755975L ^ -6825117086408755975L);
                    (Integer.rotateLeft(2093434741 ^ var0_1, 18) - 545212006) * 2093434741;
                    (int)(-4722612138112914609L ^ (long)var0_1 ^ 3449901463025275194L);
                    try {
                        var1_2 = (int)((long)Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) ^ 9198551587918087678L ^ 9198551587918087678L);
                    }
                    catch (IllegalArgumentException v2) {
                        var1_2 = Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) + 1378310450 - 1378310450;
                    }
                    continue block20;
                }
                case -384083246: {
                    Integer.rotateLeft(-479623059 ^ var0_1, 15) - -1910168466;
                    (int)(2439585748858760015L ^ (long)var0_1 ^ -5633858985380942233L);
                    var1_2 = Integer.reverse(var0_1 ^ 472506993 ^ -1066606356);
                    (Integer.rotateLeft(1860829553 ^ var0_1, 16) + 1924385770) * 1860829553;
                    (int)(-6027875359614768305L ^ (long)var0_1 ^ -6635909902470941344L);
                    try {
                        var2 += 4;
                        if ((4252176869593645917L ^ (long)var0_1 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var1_2 = Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356);
                    }
                    catch (UnsupportedOperationException v3) {
                        var1_2 = (int)((long)Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) ^ 4989432525202859679L ^ 4989432525202859679L);
                    }
                    var2 += 3;
                    continue block20;
                }
lbl146:
                // 1 sources

                Integer.rotateLeft(-1012607956 ^ var0_1, 11) - -1252831089;
                var1_2 = Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) ^ -1753516453 ^ -1753516453;
                Integer.rotateRight(486616550 ^ var0_1, 6) - -2021511659;
                var2 -= 3;
                continue block20;
                case 1257300478: {
                    Integer.rotateLeft(1536603969 ^ var0_1, 14) + 463327258;
                    (int)(-7411771065710089393L ^ (long)var0_1 ^ -3492397362566357095L);
                    var1_2 = Integer.reverse(var0_1 ^ -559394775 ^ -1066606356);
                    Integer.rotateLeft(-307530619 ^ var0_1, 16) - -870270122;
                    (int)(3393984278677482319L ^ (long)var0_1 ^ 5188290919190361058L);
                    var1_2 = Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356);
                    var2 -= 5;
                }
            }
            (Integer.rotateLeft(-490405096 ^ var0_1, 15) + 2050555683) * -490405095;
            var1_2 = (int)((long)Integer.reverse(var0_1 ^ 1083096988 ^ -1066606356) ^ 6792195765190857452L ^ 6792195765190857452L);
        }
    }

    private static void zghm_2() {
        try {
            int n = 88807384;
            n = Integer.rotateLeft(n * -337402629, 18) ^ 0x74AF378A;
            int n2 = n ^ 0xA7E47383;
            if ((n2 ^ n) != -1478200445) {
                int cfr_ignored_0 = (0xA2AF645B ^ n) - 1602264415;
            }
            if ((0x29B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bfn.hbs_2();
        }
        if (bfn.mc.field_1724 == null) {
            jmt = -1;
            rnj = -1;
            return;
        }
        int n = bfn.mc.field_1724.method_31548().field_7545;
        if (rnj != n) {
            jmt = n;
            rnj = n;
        }
    }

    private static int khdq_2() {
        int n;
        try {
            int n2 = -1148584783;
            n2 = Integer.rotateLeft(n2 * 964779203, 6) ^ 0x2C636C53;
            int n3 = n2 ^ 0x1B2BFFF0;
            if ((n3 ^ n2) != 455868400) {
                int cfr_ignored_0 = (0xA0A20341 ^ n2) - 1458443443;
            }
            if ((0x7F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bfn.mc.field_1724 == null) {
            return -1;
        }
        if (bfn.mc.field_1761 != null && (n = ((IClientPlayerInteractionManager)bfn.mc.field_1761).getLastSelectedSlot()) >= 0 && n <= (Integer.reverse(-616215583) ^ 0x87D2A2D3)) {
            jmt = n;
            return n;
        }
        if (jmt >= 0 && jmt <= (bfn.tsh_6(-1266246871) ^ 0x94D96125)) {
            return jmt;
        }
        return bfn.zty_4((class_746)bfn.mc.field_1724).field_7545;
    }

    /*
     * Unable to fully structure code
     */
    private static void hghsh(int var0) {
        var3_1 = 0;
        var1_2 = -115195966;
        var1_2 = Integer.rotateLeft(var1_2 * 432197841, 6) ^ 1448667835;
        var1_2 = var0 ^ var1_2;
        var2_3 = -486462284 + var1_2 ^ 17848953 ^ 17848953;
        while (true) {
            block59: {
                block73: {
                    block68: {
                        block72: {
                            block71: {
                                block74: {
                                    block61: {
                                        block58: {
                                            block77: {
                                                block62: {
                                                    block57: {
                                                        block67: {
                                                            block76: {
                                                                block64: {
                                                                    block63: {
                                                                        block69: {
                                                                            block60: {
                                                                                block75: {
                                                                                    block70: {
                                                                                        block65: {
                                                                                            block66: {
                                                                                                block56: {
                                                                                                    var3_1 = var2_3 - var1_2;
                                                                                                    switch (var3_1 & 15) {
                                                                                                        case 13: {
                                                                                                            if (var3_1 == -2142346963) break block56;
                                                                                                            if (var3_1 == 537412061) break block57;
                                                                                                            (Integer.rotateLeft(611449808 ^ var1_2, 7) + 1848319339) * 611449809;
                                                                                                            if (var3_1 != 1227838829) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block58;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            if (var3_1 == 1025486581) break block59;
                                                                                                            if (var3_1 != 1232372453) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block60;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            if (var3_1 == 517631788) break block61;
                                                                                                            if (var3_1 == 2120137100) break block62;
                                                                                                            (Integer.rotateLeft(543142108 ^ var1_2, 7) - -269219361) * 543142109;
                                                                                                            if (var3_1 != 445933196) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block63;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            if (var3_1 != -486462284) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block64;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            if (var3_1 == 1047223577) break block65;
                                                                                                            if (var3_1 != 20733497) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block66;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (var3_1 != 526325170) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block67;
                                                                                                        }
                                                                                                        case 0: {
                                                                                                            if (var3_1 == 799860720) break block68;
                                                                                                            if (var3_1 == 1234104544) break block69;
                                                                                                            Integer.rotateRight(-1724998386 ^ var1_2, 6) - -1862097939;
                                                                                                            if (var3_1 != 1847405888) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block70;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            if (var3_1 != -384133965) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block71;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            if (var3_1 != 1684676574) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block72;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            if (var3_1 == -1380575238) break;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        case 11: {
                                                                                                            if (var3_1 == -1878994405) break block73;
                                                                                                            if (var3_1 == -1809361333) break block74;
                                                                                                            if (var3_1 != 966911403) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block75;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            if (var3_1 != -167192961) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block76;
                                                                                                        }
                                                                                                        case 7: {
                                                                                                            if (var3_1 != -1509735993) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block77;
                                                                                                        }
                                                                                                    }
                                                                                                    (Integer.rotateRight(1938365875 ^ var1_2, 17) + 33044456) * 1938365875;
                                                                                                    if (var0 < 0) {
                                                                                                        try {
                                                                                                            --var3_1;
                                                                                                            var2_3 = 966911403 + var1_2 + 869140228 - 869140228;
                                                                                                        }
                                                                                                        catch (UnsupportedOperationException v0) {
                                                                                                            var2_3 = (int)((long)(966911403 + var1_2) ^ -178291199348777749L ^ -178291199348777749L);
                                                                                                        }
                                                                                                        var3_1 -= 3;
                                                                                                        continue;
                                                                                                    }
                                                                                                    var2_3 = -769141534 + var1_2 + -22059439 - -22059439;
                                                                                                    Integer.rotateRight(-643889397 ^ var1_2, 14) + 1587509648;
                                                                                                    var2_3 = 1047223577 + var1_2 ^ -668274780 ^ -668274780;
                                                                                                    continue;
                                                                                                }
                                                                                                (Integer.rotateRight(1770718234 ^ var1_2, 16) + -869065119) * 1770718235;
                                                                                                ((IClientPlayerInteractionManager)bfn.mc.field_1761).setLastSelectedSlot(var0);
                                                                                                try {
                                                                                                    if ((-6939133967449522079L ^ (long)var1_2 | 1L) == 0L) {
                                                                                                        throw new ArithmeticException();
                                                                                                    }
                                                                                                    var2_3 = (int)((long)(1234104544 + var1_2) ^ 7276915848056804748L ^ 7276915848056804748L);
                                                                                                }
                                                                                                catch (ArithmeticException v1) {
                                                                                                    var2_3 = (int)((long)(1234104544 + var1_2) ^ -6397705375098662259L ^ -6397705375098662259L);
                                                                                                }
                                                                                                --var3_1;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateLeft(280534149 ^ var1_2, 5) - 179868502;
                                                                                            (int)(-3311778809453941937L ^ (long)var1_2 ^ -7493845631485081147L);
                                                                                            if (bfn.mc.field_1724 != null) {
                                                                                                var2_3 = 1463652539 + var1_2 + -1564662706 - -1564662706;
                                                                                                (Integer.rotateLeft(1168636956 ^ var1_2, 11) - 1941251743) * 1168636957;
                                                                                                var2_3 = -1380575238 + var1_2 + -691815101 - -691815101;
                                                                                                continue;
                                                                                            }
                                                                                            var2_3 = (int)((long)(2086884294 + var1_2) ^ 4219990958748649955L ^ 4219990958748649955L);
                                                                                            (Integer.rotateLeft(-170464488 ^ var1_2, 17) + -916187357) * -170464487;
                                                                                            var2_3 = 1232372453 + var1_2 ^ -1977332339 ^ -1977332339;
                                                                                            var3_1 -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateRight(177990110 ^ var1_2, 4) - 1295970589) * 177990111;
                                                                                        if (var0 <= bfn.dzd_2(-552113657 ^ -552080889, 20)) {
                                                                                            try {
                                                                                                if ((3558319943169120871L ^ (long)var1_2 | 1L) == 0L) {
                                                                                                    throw new IllegalArgumentException();
                                                                                                }
                                                                                                var2_3 = 1847405888 + var1_2 + 407957896 - 407957896;
                                                                                            }
                                                                                            catch (IllegalArgumentException v2) {
                                                                                                var2_3 = 1847405888 + var1_2 + 1479947682 - 1479947682;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            var2_3 = 966911403 + var1_2 + -1275751811 - -1275751811;
                                                                                        }
                                                                                        catch (NoSuchElementException v3) {
                                                                                            var2_3 = Integer.reverse(Integer.reverse(966911403 + var1_2));
                                                                                        }
                                                                                        var3_1 += 3;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateRight(818162446 ^ var1_2, 9) - -333523475;
                                                                                    if (bfn.mc.field_1761 == null) {
                                                                                        var2_3 = Integer.reverse(Integer.reverse(462879251 + var1_2));
                                                                                        Integer.rotateLeft(-1707770680 ^ var1_2, 6) + -1328039053;
                                                                                        var2_3 = 1234104544 + var1_2 + -1036989516 - -1036989516;
                                                                                        --var3_1;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        var2_3 = -2142346963 + var1_2;
                                                                                    }
                                                                                    catch (IllegalArgumentException v4) {
                                                                                        var2_3 = -2142346963 + var1_2 ^ 367357240 ^ 367357240;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                Integer.rotateLeft(-1909456692 ^ var1_2, 4) - 1009629167;
                                                                                return;
                                                                            }
                                                                            Integer.rotateRight(1213679235 ^ var1_2, 12) + -957404904;
                                                                            return;
                                                                        }
                                                                        Integer.rotateRight(397991791 ^ var1_2, 5) - -473911892;
                                                                        bfn.jmt = var0;
                                                                        bfn.rnj = bfn.mc.field_1724.method_31548().field_7545;
                                                                        return;
                                                                    }
                                                                    Integer.rotateRight(1038644226 ^ var1_2, 10) + -2088522887;
                                                                    throw null;
                                                                }
                                                                (Integer.rotateRight(-585807721 ^ var1_2, 14) - -906925692) * -585807721;
                                                                if (!bfn.thfz()) {
                                                                    (int)(3079005083332567137L ^ (long)var1_2 ^ 6408191133346035876L);
                                                                    var2_3 = (int)((long)(20733497 + var1_2) ^ -7526884853496925112L ^ -7526884853496925112L);
                                                                    var3_1 -= 2;
                                                                    continue;
                                                                }
                                                                try {
                                                                    if ((2389921661276864969L ^ (long)var1_2 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    var2_3 = 445933196 + var1_2 ^ 1689598553 ^ 1689598553;
                                                                }
                                                                catch (UnsupportedOperationException v5) {
                                                                    var2_3 = (int)((long)(445933196 + var1_2) ^ -7582844142799975881L ^ -7582844142799975881L);
                                                                }
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(494764152 ^ var1_2, 6) + -1768935997) * 494764153;
                                                            try {
                                                                var3_1 += 5;
                                                                var2_3 = Integer.reverse(Integer.reverse(-486462284 + var1_2));
                                                            }
                                                            catch (ArithmeticException v6) {
                                                                var2_3 = -486462284 + var1_2;
                                                            }
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-1623899193 ^ var1_2, 6) - 1271977044;
                                                        try {
                                                            var3_1 -= 4;
                                                            if ((-4264730386798420301L ^ (long)var1_2 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            var2_3 = Integer.reverse(Integer.reverse(-486462284 + var1_2));
                                                        }
                                                        catch (ArithmeticException v7) {
                                                            var2_3 = (int)((long)(-486462284 + var1_2) ^ 8574040693204872178L ^ 8574040693204872178L);
                                                        }
                                                        var3_1 += 3;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(897825734 ^ var1_2, 9) - 2136038453;
                                                    var2_3 = (int)((long)(893845167 + var1_2) ^ -6516910600470551829L ^ -6516910600470551829L);
                                                    Integer.rotateLeft(2033559488 ^ var1_2, 18) + -1310920837;
                                                    var2_3 = Integer.reverse(Integer.reverse(-486462284 + var1_2));
                                                    --var3_1;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1734018707 ^ var1_2, 15) + -2006750456) * 1734018707;
                                                var2_3 = 1934035778 + var1_2;
                                                Integer.rotateLeft(-768720664 ^ var1_2, 13) + 2012707667;
                                                var2_3 = -486462284 + var1_2 + -1925407230 - -1925407230;
                                                continue;
                                            }
                                            Integer.rotateRight(-1791728794 ^ var1_2, 5) - 364226709;
                                            var2_3 = Integer.reverse(Integer.reverse(-298654025 + var1_2));
                                            Integer.rotateLeft(1665520392 ^ var1_2, 15) + 164769075;
                                            var2_3 = Integer.reverse(Integer.reverse(-1065547087 + var1_2));
                                            (Integer.rotateRight(-885939050 ^ var1_2, 12) - -1621062299) * -885939049;
                                            var2_3 = (int)((long)(-486462284 + var1_2) ^ -520039525864571940L ^ -520039525864571940L);
                                            continue;
                                        }
                                        (Integer.rotateRight(1032144187 ^ var1_2, 10) + 2004943200) * 1032144187;
                                        (int)(6666369667611705644L ^ (long)var1_2 ^ -7297561557452516138L);
                                        var2_3 = -1589542715 + var1_2 ^ -1976679820 ^ -1976679820;
                                        (int)(-1562670235435438835L ^ (long)var1_2 ^ 8220840792654903665L);
                                        var2_3 = (int)((long)(-486462284 + var1_2) ^ 3760704558614648459L ^ 3760704558614648459L);
                                        continue;
                                    }
                                    (Integer.rotateLeft(-729965295 ^ var1_2, 13) + -1080843190) * -729965295;
                                    (int)(1643588653753363279L ^ (long)var1_2 ^ -7266413850302775217L);
                                    (int)(-6595146412987944655L ^ (long)var1_2 ^ 6340950494873445667L);
                                    var2_3 = -486462284 + var1_2 + -1104854649 - -1104854649;
                                    continue;
                                }
                                (Integer.rotateRight(440908279 ^ var1_2, 6) - 856499236) * 440908279;
                                var2_3 = 1868152850 + var1_2 ^ -1611986420 ^ -1611986420;
                                Integer.rotateLeft(1464161600 ^ var1_2, 13) + -1782386181;
                                var2_3 = Integer.reverse(Integer.reverse(-486462284 + var1_2));
                                var3_1 -= 4;
                                continue;
                            }
                            Integer.rotateRight(-745047985 ^ var1_2, 13) - -1548406580;
                            var2_3 = 1285615101 + var1_2;
                            (Integer.rotateRight(-1491472774 ^ var1_2, 7) + 1082228737) * -1491472773;
                            var2_3 = -1049795043 + var1_2 + -2033966956 - -2033966956;
                            Integer.rotateLeft(440865868 ^ var1_2, 6) - 855184495;
                            var2_3 = -486462284 + var1_2;
                            var3_1 += 2;
                            continue;
                        }
                        Integer.rotateLeft(-552978612 ^ var1_2, 14) - 110776687;
                        (int)(-2255394679981626868L ^ (long)var1_2 ^ -8536253734152409929L);
                        var2_3 = -507433031 + var1_2 ^ 1945092193 ^ 1945092193;
                        (int)(-3793007483985183056L ^ (long)var1_2 ^ -944364045148472472L);
                        var2_3 = -486462284 + var1_2 + 1238602091 - 1238602091;
                        var3_1 -= 3;
                        continue;
                    }
                    (Integer.rotateRight(-939559493 ^ var1_2, 11) + 1011671264) * -939559493;
                    var2_3 = 881531576 + var1_2;
                    (Integer.rotateLeft(1396548565 ^ var1_2, 13) - 416577030) * 1396548565;
                    (int)(-7958126725788538033L ^ (long)var1_2 ^ -1828317300252963121L);
                    try {
                        if ((1000398418684496871L ^ (long)var1_2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var2_3 = Integer.reverse(Integer.reverse(-486462284 + var1_2));
                    }
                    catch (NoSuchElementException v8) {
                        var2_3 = (int)((long)(-486462284 + var1_2) ^ 8851090662634019949L ^ 8851090662634019949L);
                    }
                    ++var3_1;
                    continue;
                }
                (Integer.rotateRight(2080523039 ^ var1_2, 18) - 144949244) * 2080523039;
                var2_3 = 1843595495 + var1_2;
                (Integer.rotateLeft(389071004 ^ var1_2, 5) - -750456289) * 389071005;
                var2_3 = -486462284 + var1_2;
                continue;
            }
            Integer.rotateRight(237138726 ^ var1_2, 4) - -1165389611;
            (int)(-3700646282190974814L ^ (long)var1_2 ^ -5850015430837390184L);
            var2_3 = -1849218143 + var1_2 ^ 1457047061 ^ 1457047061;
            (int)(4880952779227320476L ^ (long)var1_2 ^ -4894645153934923096L);
            var2_3 = -486462284 + var1_2 + -1068959583 - -1068959583;
            continue;
lbl329:
            // 14 sources

            (Integer.rotateRight(201847186 ^ var1_2, 4) + 2035539945) * 201847187;
            var2_3 = (int)((long)(-486462284 + var1_2) ^ 4722048332505334665L ^ 4722048332505334665L);
        }
    }

    public static int hhq_2(class_1792 class_17922, boolean bl) {
        int n = 1044027041;
        n = Integer.rotateLeft(n * -1217067937, 19) ^ 0x27B6912F;
        int n2 = (n = bl ^ n) ^ 0x5B0E5B57;
        if ((n2 ^ n) != 1527667543) {
            int cfr_ignored_0 = (0x6534CDF6 ^ n) + -1506518066;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (bfn.mc.field_1724 == null) {
            return -1;
        }
        class_2371 class_23712 = bfn.adn((class_746)bfn.mc.field_1724).field_7547;
        int n3 = bl ? 0 : 0xDC6CCA2D ^ 0xDC6CCA24;
        int n4 = bl ? Integer.rotateLeft(0x6554481B ^ 0x6550C81B, 17) : 0xCF48E368 ^ 0xCF48E34C;
        int n5 = -1;
        for (int i = n3; i < n4; ++i) {
            if (((class_1799)class_23712.get(i)).method_7909() != class_17922) continue;
            n5 = i;
        }
        return n5;
    }

    public static int shkf(class_1792 class_17922) {
        try {
            int n = -122687727;
            n = Integer.rotateLeft(n * 151081083, 19) ^ 0x7B8FA061;
            int n2 = n ^ 0x71EEABCC;
            if ((n2 ^ n) != 1911466956) {
                int cfr_ignored_0 = (0x894144DD ^ n) + -1419506589;
            }
            if ((0xF3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bfn.rtt_4();
            throw null;
        }
        if (bfn.mc.field_1724 == null) {
            return -1;
        }
        class_2371 class_23712 = bfn.mc.field_1724.method_31548().field_7547;
        int n = -1;
        for (int i = 0; i < 768496823 + -768496787; ++i) {
            class_1799 class_17992 = (class_1799)class_23712.get(i);
            if (class_17992.method_7909() != class_17922) continue;
            n = i;
            break;
        }
        if (n < 864593315 - 864593306 && n != -1) {
            n += 36;
        }
        return n;
    }

    public static boolean zwh_3() {
        block0: {
            int n = 1629493637;
            int n2 = (n = Integer.rotateLeft(n * 1891172597, 14) ^ 0x39F60EE4) ^ 0x46ED43D7;
            if ((n2 ^ n) == 1189954519) break block0;
            int cfr_ignored_0 = (0x27CD5A52 ^ n) - 2067684320;
        }
        return bfn.mc.field_1724.method_6118(class_1304.field_6174).method_31574(class_1802.field_8833);
    }

    public static int dhkk(boolean bl) {
        try {
            int n = 1549759596;
            n = Integer.rotateLeft(n * 486896909, 27) ^ 0x8D08D00F;
            int n2 = n ^ 0x6D8E117C;
            if ((n2 ^ n) != 1838027132) {
                int cfr_ignored_0 = (0x31D16510 ^ n) + -1315723603;
            }
            if ((0x2CE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bfn.mc.field_1724 == null) {
            return -1;
        }
        class_2371 class_23712 = bfn.mc.field_1724.method_31548().field_7547;
        int n = bl ? 0 : -1896127320 - -1896127329;
        int n3 = bl ? 975270647 + -975270638 : Integer.rotateLeft(0x99624E75 ^ 0xBD624E75, 8);
        for (int i = n; i < n3; ++i) {
            if (!(((class_1799)class_23712.get(i)).method_7909() instanceof class_1743)) continue;
            return i;
        }
        return -1;
    }

    public static int tfy_2() {
        int n;
        int n2 = 1577825784;
        int n3 = (n2 = Integer.rotateLeft(n2 * -1825001999, 5) ^ 0xD9F3FC4C) ^ 0x92D8659A;
        if ((n3 ^ n2) != -1831311974) {
            int cfr_ignored_0 = (0xCCD3D062 ^ n2) - 197800039;
        }
        if ((n = bfn.shkhd()) != -1) {
            return n;
        }
        int n4 = bfn.jdhkh();
        if (n4 != -1) {
            return n4;
        }
        int n5 = bfn.mc.field_1724 != null ? bfn.mc.field_1724.method_31548().field_7545 : 0;
        return (n5 + 1) % (0x8F8312AE ^ 0x8F8312A7);
    }

    public static int shkhd() {
        int n = 1390829203;
        int n2 = (n = Integer.rotateLeft(n * -254497015, 9) ^ 0x18390217) ^ 0x3AA7EC78;
        if ((n2 ^ n) != 984083576) {
            int cfr_ignored_0 = (0x6841B2EB ^ n) - 709766881;
        }
        if (bfn.mc.field_1724 == null) {
            return -1;
        }
        class_2371 class_23712 = bfn.mc.field_1724.method_31548().field_7547;
        int n3 = bfn.mc.field_1724.method_31548().field_7545;
        for (int i = 0; i < -1517693807 + 1517693816; ++i) {
            if (!((class_1799)class_23712.get(i)).method_7960() || n3 == i) continue;
            return i;
        }
        return -1;
    }

    private static int jdhkh() {
        int n = bak_2.str_4(-742372052);
        int n2 = n ^ 0x7E0BFA93;
        if ((n2 ^ n) != 2114714259) {
            int cfr_ignored_0 = (Integer.rotateRight(0xADCBB7BF ^ n, 8) - 269016924) * -1379158081;
        }
        if (bfn.mc.field_1724 == null) {
            return -1;
        }
        class_2371 class_23712 = bfn.mc.field_1724.method_31548().field_7547;
        int n3 = bfn.mc.field_1724.method_31548().field_7545;
        for (int i = 0; i < 366705280 - 366705271; ++i) {
            class_1799 class_17992 = (class_1799)class_23712.get(i);
            if (class_17992.method_7909() instanceof class_1829 || n3 == i) continue;
            return i;
        }
        return -1;
    }

    public static int ghts() {
        int n = bak_2.str_4(-1973600445);
        int n2 = n ^ 0x90F3976B;
        if ((n2 ^ n) != -1863084181) {
            int cfr_ignored_0 = Integer.rotateLeft(0x1AAEA828 ^ n, 6) + 1065614355;
        }
        if (bfn.mc.field_1724 == null) {
            return -1;
        }
        int n3 = 0;
        class_2371 class_23712 = bfn.mc.field_1724.method_31548().field_7547;
        for (int i = 0; i < Integer.rotateLeft(0xAB649D3D ^ 0x8F649D3D, 8); ++i) {
            class_1799 class_17992 = (class_1799)class_23712.get(i);
            if (!class_17992.method_31574(class_1802.field_8288) || class_17992.method_7942()) continue;
            ++n3;
        }
        return n3;
    }

    public static int sdz_7(boolean bl) {
        int n = bak_2.str_4(1948723520);
        int n2 = (n = Integer.rotateRight(bl ^ n, 7)) ^ 0xFAAEC328;
        if ((n2 ^ n) != -89210072) {
            int cfr_ignored_0 = Integer.rotateLeft(0x8E89EA68 ^ n, 4) + 1192296915;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        class_2371 class_23712 = bfn.mc.field_1724.method_31548().field_7547;
        for (int i = 0; i < 132241757 + -132241721; ++i) {
            class_1799 class_17992 = (class_1799)class_23712.get(i);
            if (!class_17992.method_31574(class_1802.field_8288) || bl && class_17992.method_7942()) continue;
            return i < -159597329 + 159597338 ? i + (0xBBA2C6F6 ^ 0xBBA2C6D2) : i;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    private static class_2596 zmz_3(class_1268 var0, taj var1_1, int var2_2) {
        var3_3 = null;
        var6_4 = 0;
        var4_5 = 903197901;
        var4_5 = Integer.rotateLeft(var4_5 * 651515125, 21) ^ -1169327968;
        v0 = var1_1;
        var4_5 = Integer.rotateRight((v0 != null ? System.identityHashCode(v0) : 0) ^ var4_5, 18);
        var4_5 = var2_2 ^ var4_5;
        var5_6 = Integer.reverse(Integer.reverse(-760390452 * -1228269821 + 591551268 ^ var4_5));
        while (true) {
            block41: {
                block44: {
                    block33: {
                        block39: {
                            block38: {
                                block36: {
                                    block42: {
                                        block34: {
                                            block43: {
                                                block37: {
                                                    block32: {
                                                        block35: {
                                                            block40: {
                                                                var6_4 = ((var5_6 ^ var4_5) - 591551268) * 1747749803;
                                                                switch (var6_4 & 7) {
                                                                    case 0: {
                                                                        if (var6_4 != -1256227176) {
                                                                            ** break;
                                                                        }
                                                                        break block32;
                                                                    }
                                                                    case 1: {
                                                                        if (var6_4 == 649666305) break block33;
                                                                        if (var6_4 != 1798999849) {
                                                                            ** break;
                                                                        }
                                                                        break block34;
                                                                    }
                                                                    case 2: {
                                                                        if (var6_4 == -1549486046) break block35;
                                                                        if (var6_4 != -533512414) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 4: {
                                                                        if (var6_4 == 1433856228) break block37;
                                                                        if (var6_4 == -2131321956) break block38;
                                                                        Integer.rotateRight(-1387124465 ^ var4_5, 8) - 22059020;
                                                                        if (var6_4 == -410654444) break block39;
                                                                        if (var6_4 != -760390452) {
                                                                            ** break;
                                                                        }
                                                                        break block40;
                                                                    }
                                                                    case 5: {
                                                                        if (var6_4 == -842783739) break;
                                                                        if (var6_4 == 1154343765) break block41;
                                                                        if (var6_4 != 971732101) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 7: {
                                                                        if (var6_4 == -733277825) break block43;
                                                                        if (var6_4 != 969747199) {
                                                                            (Integer.rotateLeft(-1754400711 ^ var4_5, 5) + 1521397282) * -1754400711;
                                                                            (int)(6187758988878474063L ^ (long)var4_5 ^ 5870586262736930415L);
                                                                            ** break;
                                                                        }
                                                                        break block44;
                                                                    }
                                                                }
                                                                Integer.rotateRight(-612238578 ^ var4_5, 14) - -1726282259;
                                                                var3_3 = new class_2886(var0, var2_2, var1_1.dda_3(), var1_1.shyq());
                                                                (int)(-4939737239852828885L ^ (long)var4_5 ^ -919542290724103372L);
                                                                var5_6 = 1154343765 * -1228269821 + 591551268 ^ var4_5 ^ -10701732 ^ -10701732;
                                                                var6_4 += 2;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(-1321121647 ^ var4_5, 9) + 2068146378) * -1321121647;
                                                            (int)(8355275360779430735L ^ (long)var4_5 ^ 3470167661348473398L);
                                                            if (!yf.dnkh()) {
                                                                var5_6 = -1151133721 * -1228269821 + 591551268 ^ var4_5 ^ 409347846 ^ 409347846;
                                                                Integer.rotateRight(1407133774 ^ var4_5, 13) - 744718509;
                                                                var5_6 = -842783739 * -1228269821 + 591551268 ^ var4_5 ^ 1644129825 ^ 1644129825;
                                                                continue;
                                                            }
                                                            try {
                                                                var6_4 -= 5;
                                                                if ((-2997557396868208797L ^ (long)var4_5 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                var5_6 = Integer.reverse(Integer.reverse(-1549486046 * -1228269821 + 591551268 ^ var4_5));
                                                            }
                                                            catch (IllegalArgumentException v1) {
                                                                var5_6 = (int)((long)(-1549486046 * -1228269821 + 591551268 ^ var4_5) ^ 8750344481484897618L ^ 8750344481484897618L);
                                                            }
                                                            var6_4 -= 5;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-106254845 ^ var4_5, 18) + 1074311576;
                                                        throw null;
                                                    }
                                                    (Integer.rotateRight(10445850 ^ var4_5, 3) + 397065825) * 10445851;
                                                    var5_6 = 619977382 * -1228269821 + 591551268 ^ var4_5;
                                                    (Integer.rotateRight(1670693371 ^ var4_5, 15) + 325131424) * 1670693371;
                                                    var5_6 = -760390452 * -1228269821 + 591551268 ^ var4_5;
                                                    var6_4 += 5;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1684437910 ^ var4_5, 15) - 751212133) * 1684437911;
                                                var5_6 = (303704270 * -1228269821 + 591551268 ^ var4_5) + 1396408995 - 1396408995;
                                                bak_2.khjkh(-558227616, var4_5);
                                                (int)(4651487074473114645L ^ (long)var4_5 ^ 3513425802438716619L);
                                                var5_6 = (int)((long)(-760390452 * -1228269821 + 591551268 ^ var4_5) ^ 6431269998149087659L ^ 6431269998149087659L);
                                                ++var6_4;
                                                continue;
                                            }
                                            Integer.rotateRight(2078605135 ^ var4_5, 18) - 85494220;
                                            var5_6 = Integer.reverse(Integer.reverse(850187734 * -1228269821 + 591551268 ^ var4_5));
                                            Integer.rotateLeft(-703496028 ^ var4_5, 13) - -260295913;
                                            try {
                                                if ((-2960177071051634091L ^ (long)var4_5 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                var5_6 = Integer.reverse(Integer.reverse(-760390452 * -1228269821 + 591551268 ^ var4_5));
                                            }
                                            catch (IllegalStateException v2) {
                                                var5_6 = Integer.reverse(Integer.reverse(-760390452 * -1228269821 + 591551268 ^ var4_5));
                                            }
                                            var6_4 += 2;
                                            continue;
                                        }
                                        Integer.rotateRight(-1801722293 ^ var4_5, 5) + 54428240;
                                        var5_6 = -760390452 * -1228269821 + 591551268 ^ var4_5;
                                        continue;
                                    }
                                    (Integer.rotateRight(-167649414 ^ var4_5, 17) + -828920063) * -167649413;
                                    var5_6 = (620411314 * -1228269821 + 591551268 ^ var4_5) + 63997003 - 63997003;
                                    Integer.rotateLeft(-695243672 ^ var4_5, 13) + -4472877;
                                    try {
                                        var5_6 = Integer.reverse(Integer.reverse(-760390452 * -1228269821 + 591551268 ^ var4_5));
                                    }
                                    catch (ArithmeticException v3) {
                                        var5_6 = -760390452 * -1228269821 + 591551268 ^ var4_5;
                                    }
                                    continue;
                                }
                                Integer.rotateRight(2008361863 ^ var4_5, 17) - -2092047212;
                                var5_6 = (2032524900 * -1228269821 + 591551268 ^ var4_5) + 1510356492 - 1510356492;
                                (Integer.rotateLeft(998831093 ^ var4_5, 10) - 972237286) * 998831093;
                                (int)(-487974495373169841L ^ (long)var4_5 ^ 5107226125897588645L);
                                var5_6 = -760390452 * -1228269821 + 591551268 ^ var4_5;
                                (Integer.rotateLeft(-2077557260 ^ var4_5, 3) - 93478855) * -2077557259;
                                continue;
                            }
                            (Integer.rotateLeft(275941148 ^ var4_5, 5) - 37485471) * 275941149;
                            try {
                                if ((5131789543023770687L ^ (long)var4_5 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var5_6 = (-760390452 * -1228269821 + 591551268 ^ var4_5) + -1058249494 - -1058249494;
                            }
                            catch (NoSuchElementException v4) {
                                var5_6 = (int)((long)(-760390452 * -1228269821 + 591551268 ^ var4_5) ^ -7230014940210697386L ^ -7230014940210697386L);
                            }
                            var6_4 -= 2;
                            continue;
                        }
                        Integer.rotateLeft(1970280364 ^ var4_5, 17) - 1022393615;
                        try {
                            var6_4 += 5;
                            if ((409289720037206873L ^ (long)var4_5 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var5_6 = (-760390452 * -1228269821 + 591551268 ^ var4_5) + 1765361035 - 1765361035;
                        }
                        catch (UnsupportedOperationException v5) {
                            var5_6 = (-760390452 * -1228269821 + 591551268 ^ var4_5) + 557717704 - 557717704;
                        }
                        continue;
                    }
                    Integer.rotateLeft(1298794628 ^ var4_5, 12) - 1681172279;
                    try {
                        var5_6 = -760390452 * -1228269821 + 591551268 ^ var4_5;
                    }
                    catch (IllegalArgumentException v6) {
                        var5_6 = -760390452 * -1228269821 + 591551268 ^ var4_5 ^ 597319358 ^ 597319358;
                    }
                    var6_4 -= 4;
                    continue;
                }
                (Integer.rotateLeft(-2123944232 ^ var4_5, 3) + -1344517277) * -2123944231;
                var5_6 = 1734253158 * -1228269821 + 591551268 ^ var4_5 ^ -1246011363 ^ -1246011363;
                (Integer.rotateRight(468859794 ^ var4_5, 6) + 1722996201) * 468859795;
                var5_6 = (int)((long)(-760390452 * -1228269821 + 591551268 ^ var4_5) ^ 859619828607270366L ^ 859619828607270366L);
                Integer.rotateLeft(-1975051383 ^ var4_5, 4) + -1023806254;
                (int)(5257307925391928143L ^ (long)var4_5 ^ -7631205420119802822L);
                var6_4 -= 2;
                continue;
            }
            return (class_2596)var3_3;
lbl196:
            // 7 sources

            Integer.rotateRight(828756643 ^ var4_5, 9) + -5103368;
            var5_6 = (-760390452 * -1228269821 + 591551268 ^ var4_5) + 1745483291 - 1745483291;
        }
    }

    private static void shwkh(class_636 class_6362, int n, int n2, int n3, class_1713 class_17132, class_1657 class_16572) {
        int n4 = -124899052;
        n4 = Integer.rotateLeft(n4 * -1574237645, 28) ^ 0x8DD5DC69;
        n4 = n2 ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 14)) ^ 0x1B2C8A9F;
        if ((n5 ^ n4) != 455903903) {
            int cfr_ignored_0 = (0xE3A2BB8B ^ n4) + -1958008106;
        }
        class_6362.method_2906(n, n2, n3, class_17132, class_16572);
    }

    private static boolean thzh_2(hb hb2) {
        block0: {
            int n = -1243372478;
            int n2 = (n = Integer.rotateLeft(n * -463059855, 15) ^ 0xFC0B8ACB) ^ 0x1D2F8ADE;
            if ((n2 ^ n) == 489655006) break block0;
            int cfr_ignored_0 = (0xA8CC2E9C ^ n) - -507010065;
        }
        return hb2.jndh();
    }

    private static void djd_4(class_2596 class_25962) {
        int n = -919263477;
        n = Integer.rotateLeft(n * -91308379, 21) ^ 0x7CF6EFEA;
        class_2596 class_25963 = class_25962;
        n = Integer.rotateRight((class_25963 != null ? System.identityHashCode(class_25963) : 0) ^ n, 23);
        int n2 = n ^ 0xF3A634C9;
        if ((n2 ^ n) != -207211319) {
            int cfr_ignored_0 = (0x3A9313C2 ^ n) + 1683294033;
        }
        thdh.btj_2(class_25962);
    }

    private static void trl(class_636 class_6362, int n, int n2, int n3, class_1713 class_17132, class_1657 class_16572) {
        int n4 = bak_2.str_4(1197043745);
        n4 = n2 ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 18)) ^ 0xCDAF8785;
        if ((n5 ^ n4) != -844134523) {
            int cfr_ignored_0 = Integer.rotateLeft(0x8AF6F7A4 ^ n4, 4) - -666526697;
        }
        class_6362.method_2906(n, n2, n3, class_17132, class_16572);
    }

    private static hb skn_2() {
        block0: {
            int n = 583703437;
            int n2 = (n = Integer.rotateLeft(n * 17590235, 14) ^ 0x8CA9E6E1) ^ 0x6C39902;
            if ((n2 ^ n) == 113481986) break block0;
            int cfr_ignored_0 = (0x2409028F ^ n) - 1621507552;
        }
        return hb.tdm_2();
    }

    private static boolean tghth(hb hb2) {
        block0: {
            int n = 2001261314;
            int n2 = (n = Integer.rotateLeft(n * 226365511, 18) ^ 0x6EC661EB) ^ 0x2B271B71;
            if ((n2 ^ n) == 723983217) break block0;
            int cfr_ignored_0 = (0x5C6FC873 ^ n) + -1465800161;
        }
        return hb2.jndh();
    }

    private static void jshn(class_636 class_6362, int n, int n2, int n3, class_1713 class_17132, class_1657 class_16572) {
        int n4 = 1666149125;
        n4 = Integer.rotateLeft(n4 * 1181809635, 15) ^ 0x8E63B79F;
        class_636 class_6363 = class_6362;
        n4 = Integer.rotateLeft((class_6363 != null ? System.identityHashCode(class_6363) : 0) ^ n4, 17);
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 19)) ^ 0x21956780;
        if ((n5 ^ n4) != 563439488) {
            int cfr_ignored_0 = (0x42DA0C85 ^ n4) - 1607937913;
        }
        class_6362.method_2906(n, n2, n3, class_17132, class_16572);
    }

    private static boolean rnb(hb hb2) {
        block0: {
            int n = -1089520361;
            int n2 = (n = Integer.rotateLeft(n * 42830333, 20) ^ 0x1EC3DF14) ^ 0xB479F241;
            if ((n2 ^ n) == -1267076543) break block0;
            int cfr_ignored_0 = (0xB76CF56 ^ n) - 109537479;
        }
        return hb2.jndh();
    }

    private static kq tthw_2() {
        block0: {
            int n = bak_2.str_4(-488026053);
            int n2 = n ^ 0x9A753633;
            if ((n2 ^ n) == -1703594445) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x789C6608 ^ n, 18) + -1622279629;
        }
        return kq.thzt_2();
    }

    private static bwk tfq_2(kq kq2) {
        block0: {
            int n = 1147528391;
            n = Integer.rotateLeft(n * -214810695, 23) ^ 0x7FA08666;
            kq kq3 = kq2;
            n = (kq3 != null ? System.identityHashCode(kq3) : 0) ^ n;
            int n2 = n ^ 0xCDD47D10;
            if ((n2 ^ n) == -841712368) break block0;
            int cfr_ignored_0 = (0x89B199D7 ^ n) + -1495876920;
        }
        return kq2.jwj();
    }

    private static float add_4(class_746 class_7462) {
        block0: {
            int n = -1352554204;
            int n2 = (n = Integer.rotateLeft(n * 1094290059, 5) ^ 0x68586038) ^ 0x1949CE60;
            if ((n2 ^ n) == 424267360) break block0;
            int cfr_ignored_0 = (0xB6286744 ^ n) + 23597598;
        }
        return class_7462.method_36454();
    }

    private static float dhtkh_2(taj taj2) {
        block0: {
            int n = 2055970798;
            n = Integer.rotateLeft(n * 1836480517, 8) ^ 0xD9CF0B83;
            taj taj3 = taj2;
            n = (taj3 != null ? System.identityHashCode(taj3) : 0) ^ n;
            int n2 = n ^ 0x73AAEDDC;
            if ((n2 ^ n) == 1940581852) break block0;
            int cfr_ignored_0 = (0x9217232 ^ n) + 413847658;
        }
        return taj2.dda_3();
    }

    private static float ttt_4(taj taj2) {
        block0: {
            int n = bak_2.str_4(-1163660733);
            int n2 = n ^ 0xD794463D;
            if ((n2 ^ n) == -678148547) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6D37B47E ^ n, 16) - 1042053757) * 1832367231;
        }
        return taj2.shyq();
    }

    private static void bghj() {
        int n = bak_2.str_4(830865028);
        int n2 = n ^ 0xECB6CFC8;
        if ((n2 ^ n) != -323563576) {
            int cfr_ignored_0 = Integer.rotateLeft(0xDD33314C ^ n, 14) - -846162065;
        }
        yf.athz_2();
    }

    private static kq dhjgh() {
        block0: {
            int n = -285113008;
            int n2 = (n = Integer.rotateLeft(n * 993205349, 24) ^ 0x3208957B) ^ 0xB7E5273;
            if ((n2 ^ n) == 192828019) break block0;
            int cfr_ignored_0 = (0xE47FD723 ^ n) - -295647401;
        }
        return kq.thzt_2();
    }

    private static float zry(class_746 class_7462) {
        block0: {
            int n = 1040743289;
            int n2 = (n = Integer.rotateLeft(n * 274374323, 15) ^ 0x8329E46A) ^ 0xCFD8ED81;
            if ((n2 ^ n) == -807867007) break block0;
            int cfr_ignored_0 = (0xF1D096F8 ^ n) - 754627218;
        }
        return class_7462.method_36455();
    }

    private static boolean tnh_4() {
        block0: {
            int n = 615375916;
            int n2 = (n = Integer.rotateLeft(n * 2079932545, 10) ^ 0x4AF9F98A) ^ 0x2C5F9AD;
            if ((n2 ^ n) == 46528941) break block0;
            int cfr_ignored_0 = (0x26681D81 ^ n) + -1465710572;
        }
        return yf.khdha_2();
    }

    private static void dhdr() {
        int n = -686351538;
        int n2 = (n = Integer.rotateLeft(n * 1962347219, 9) ^ 0x49C69CFC) ^ 0x10695AE1;
        if ((n2 ^ n) != 275340001) {
            int cfr_ignored_0 = (0xC77E41AF ^ n) + -1070290702;
        }
        yf.athz_2();
    }

    private static taj jby(kq kq2) {
        block0: {
            int n = 572150910;
            n = Integer.rotateLeft(n * -1813973401, 10) ^ 0x5F7EA245;
            kq kq3 = kq2;
            n = (kq3 != null ? System.identityHashCode(kq3) : 0) ^ n;
            int n2 = n ^ 0xC174556;
            if ((n2 ^ n) == 202851670) break block0;
            int cfr_ignored_0 = (0x2E0D1128 ^ n) + 1612344341;
        }
        return kq2.jty();
    }

    private static float ghk(taj taj2) {
        block0: {
            int n = -1176896416;
            n = Integer.rotateLeft(n * 262367359, 4) ^ 0x7A130D7D;
            taj taj3 = taj2;
            n = Integer.rotateLeft((taj3 != null ? System.identityHashCode(taj3) : 0) ^ n, 26);
            int n2 = n ^ 0xD1E5638;
            if ((n2 ^ n) == 220091960) break block0;
            int cfr_ignored_0 = (0xB4C7AA58 ^ n) - 1485199856;
        }
        return taj2.dda_3();
    }

    private static boolean bwd_2() {
        block0: {
            int n = bak_2.str_4(-1875645150);
            int n2 = n ^ 0x9782D488;
            if ((n2 ^ n) == -1753033592) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7B139AA ^ n, 3) + -221013295;
        }
        return yf.khdha_2();
    }

    private static void khlkh(class_746 class_7462, class_1268 class_12682) {
        int n = 1979833386;
        n = Integer.rotateLeft(n * -1946573909, 16) ^ 0x3F5EE495;
        class_746 class_7463 = class_7462;
        n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
        int n2 = n ^ 0xAC16CE44;
        if ((n2 ^ n) != -1407791548) {
            int cfr_ignored_0 = (0xDA17126E ^ n) + 1576805138;
        }
        class_7462.method_6104(class_12682);
    }

    private static boolean shyz_2() {
        block0: {
            int n = bak_2.str_4(-1109339804);
            int n2 = n ^ 0xB19A7B56;
            if ((n2 ^ n) == -1315275946) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xC7AAA32 ^ n, 4) + -2026357943) * 209365555;
        }
        return yf.khdha_2();
    }

    private static void tlh_3() {
        int n = 1946334211;
        int n2 = (n = Integer.rotateLeft(n * 1400392857, 27) ^ 0x15E6FAFC) ^ 0xC0D807BC;
        if ((n2 ^ n) != -1059584068) {
            int cfr_ignored_0 = (0xB4DAB3BF ^ n) + -1939156106;
        }
        yf.athz_2();
    }

    private static void khqgh(int n) {
        int n2 = -1752659770;
        n2 = Integer.rotateLeft(n2 * -600808001, 22) ^ 0x352BFD0E;
        int n3 = (n2 = n ^ n2) ^ 0xF4F665A;
        if ((n3 ^ n2) != 256861786) {
            int cfr_ignored_0 = (0x98C7EE9C ^ n2) - -128568556;
        }
        bfn.hghsh(n);
    }

    private static void hbs_2() {
        int n = 1291481393;
        int n2 = (n = Integer.rotateLeft(n * 1354797287, 8) ^ 0xA070C94) ^ 0xD8F3D275;
        if ((n2 ^ n) != -655109515) {
            int cfr_ignored_0 = (0x9409A344 ^ n) + -1799601417;
        }
        yf.athz_2();
    }

    private static int tsh_6(int n) {
        block0: {
            int n2 = -1295994639;
            n2 = Integer.rotateLeft(n2 * 1318734561, 24) ^ 0xFB9D2BF4;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 6)) ^ 0x32BB1B47;
            if ((n3 ^ n2) == 851123015) break block0;
            int cfr_ignored_0 = (0x807BABB6 ^ n2) + 1985276239;
        }
        return Integer.reverse(n);
    }

    private static class_1661 zty_4(class_746 class_7462) {
        block0: {
            int n = -2033598465;
            int n2 = (n = Integer.rotateLeft(n * -1641209333, 24) ^ 0x65753E78) ^ 0x2245EC4B;
            if ((n2 ^ n) == 575007819) break block0;
            int cfr_ignored_0 = (0xA48C53B4 ^ n) - 1583407480;
        }
        return class_7462.method_31548();
    }

    private static boolean thfz() {
        block0: {
            int n = bak_2.str_4(1566961111);
            int n2 = n ^ 0xB8AFCC91;
            if ((n2 ^ n) == -1196438383) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE5CA2146 ^ n, 15) - -673732939;
        }
        return yf.dnkh();
    }

    private static int dzd_2(int n, int n2) {
        block0: {
            int n3 = -107718289;
            n3 = Integer.rotateLeft(n3 * 90890673, 14) ^ 0x15962AE4;
            n3 = Integer.rotateLeft(n ^ n3, 11);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 20)) ^ 0x1667DABA;
            if ((n4 ^ n3) == 375904954) break block0;
            int cfr_ignored_0 = (0xEFF383D5 ^ n3) - -793265391;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static class_1661 adn(class_746 class_7462) {
        block0: {
            int n = -2108948760;
            int n2 = (n = Integer.rotateLeft(n * 316732125, 23) ^ 0xCC04D9FB) ^ 0xB0EC2D00;
            if ((n2 ^ n) == -1326699264) break block0;
            int cfr_ignored_0 = (0x32A7D3E8 ^ n) + -864503857;
        }
        return class_7462.method_31548();
    }

    private static void rtt_4() {
        int n = bak_2.str_4(273817234);
        int n2 = n ^ 0xD3230E2D;
        if ((n2 ^ n) != -752677331) {
            int cfr_ignored_0 = (Integer.rotateRight(0xC37110BF ^ n, 11) - -1357994404) * -1016000321;
        }
        yf.athz_2();
    }

    private static String[] amh_2(String string) {
        int n = 1824695961;
        n = Integer.rotateLeft(n * 393233627, 6) ^ 0x4F09687D;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x494D9528;
        if ((n2 ^ n) != 1229821224) {
            int cfr_ignored_0 = (0x258F33B1 ^ n) - -875811227;
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

    private static CallSite dhr_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -506285062;
            n3 = Integer.rotateLeft(n3 * 1349102299, 23) ^ 0xEA1A6CB0;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 14);
            int n4 = n3 ^ 0x6DD37DEC;
            if ((n4 ^ n3) != 1842576876) {
                int cfr_ignored_0 = (0x8C01CE16 ^ n3) - 456459108;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ththr ^ string.hashCode() ^ n2 + bml + i * -1240758091) + ththr) ^ bml));
            }
            String[] stringArray = bfn.amh_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rheu8t8sxai(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite e87qhm7hp7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ytxok3784 ^ string.hashCode()) + (n2 + jh62iq1cs4reg) + i ^ ytxok3784, 25) + jh62iq1cs4reg);
            }
            String[] stringArray = bfn.rheu8t8sxai(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

