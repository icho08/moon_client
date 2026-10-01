/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1713
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2371
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2371;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tjb;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="ElytraMotion", category=bzw.OTHER, desc="Freezes player when flying on elytra and close to Aura target")
public class tzf
extends bnq {
    private final tay dhkhd_2 = new tay(this, "Distance").shth_7(Float.intBitsToFloat(632183005 - -404648944)).dhbs_2(Float.intBitsToFloat(-1683072731 - 1525569829)).rkh_3(Float.intBitsToFloat(438095256 - -598736693)).ssd_5(Float.intBitsToFloat(0xD02ABD0 ^ 0x4D42ABD0));
    private final badh_2 zat_3 = new badh_2(this, "Swap Chestplate").bts(true);
    private final badh_2 jdhz = new badh_2((hy)this, "Use F".concat("irework"), this::ghsha_2).bts(true);
    private final badh_2 bql = new badh_2((hy)this, "Legit", this::yth).bts(false);
    private boolean sth = false;
    private final bql<btt> tjgh = this::shkhsh;
    private static final int shksh = 735873918;
    private static final int dhrgh = -1210306737;
    private static final int bny = 1338559519;
    private static final int khghj = 1670415073;
    private static final int ising2qeyb = 1032112162;
    private static final int vfbrbmed2 = -1101497009;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int n14mxyss32rt0p;

    @Override
    public void nt() {
        int n = -592207584;
        n = Integer.rotateLeft(n * 1254849577, 10) ^ 0x26593597;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0x936E7323;
        if ((n2 ^ n) != -1821478109) {
            int cfr_ignored_0 = (0x4FDDD203 ^ n) - -159489023;
        }
        this.sth = false;
    }

    @Override
    public void nc() {
        try {
            int n = 1727271527;
            n = Integer.rotateLeft(n * -1414947897, 27) ^ 0x4D54E470;
            int n2 = n ^ 0x54D7C6C5;
            if ((n2 ^ n) != 1423427269) {
                int cfr_ignored_0 = (0x3223D4A2 ^ n) + 1092365540;
            }
            if ((0x2A5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (this.sth) {
            tzf.khyb(this);
            this.sth = false;
        }
    }

    private void tshgh_2() {
        int n = 0;
        int n2 = 0;
        int n3 = 361210866;
        n3 = Integer.rotateLeft(n3 * 2116626751, 4) ^ 0xCC4AE1A4;
        int n4 = -1123996818 + n3 + 1908044967 - 1908044967;
        while (true) {
            block36: {
                block42: {
                    block52: {
                        block38: {
                            block55: {
                                block51: {
                                    block50: {
                                        block41: {
                                            block43: {
                                                block59: {
                                                    block35: {
                                                        block37: {
                                                            block45: {
                                                                block44: {
                                                                    block56: {
                                                                        block57: {
                                                                            block49: {
                                                                                block48: {
                                                                                    block39: {
                                                                                        block58: {
                                                                                            block54: {
                                                                                                block34: {
                                                                                                    block53: {
                                                                                                        block46: {
                                                                                                            block47: {
                                                                                                                block31: {
                                                                                                                    block40: {
                                                                                                                        block32: {
                                                                                                                            block33: {
                                                                                                                                if ((n2 = n4 - n3) > 471535135) break block31;
                                                                                                                                if (n2 > -1123996818) break block32;
                                                                                                                                if (n2 > -1686080895) break block33;
                                                                                                                                if (n2 == -1973637115) break block34;
                                                                                                                                if (n2 == -1686080895) break block35;
                                                                                                                                break block36;
                                                                                                                            }
                                                                                                                            if (n2 == -1340637506) break block37;
                                                                                                                            if (n2 == -1280432633) break block38;
                                                                                                                            int cfr_ignored_0 = (Integer.rotateRight(0xC3E487D3 ^ n3, 11) + -1123413560) * -1008433197;
                                                                                                                            if (n2 == -1123996818) break block39;
                                                                                                                            break block36;
                                                                                                                        }
                                                                                                                        if (n2 > -367484159) break block40;
                                                                                                                        if (n2 == -395816979) break block41;
                                                                                                                        if (n2 == -367484159) break block42;
                                                                                                                        int cfr_ignored_1 = (Integer.rotateLeft(0x510B7215 ^ n3, 13) - -725585978) * 1359704597;
                                                                                                                        int cfr_ignored_2 = (int)(0x93B9DC2827D4EB4FL ^ (long)n3 ^ 0x4520831A2DB88AA2L);
                                                                                                                        break block36;
                                                                                                                    }
                                                                                                                    if (n2 == 303825159) break block43;
                                                                                                                    if (n2 == 357999374) break block44;
                                                                                                                    if (n2 == 471535135) break block45;
                                                                                                                    break block36;
                                                                                                                }
                                                                                                                if (n2 > 1256134912) break block46;
                                                                                                                if (n2 > 573565678) break block47;
                                                                                                                if (n2 == 498175879) break block48;
                                                                                                                if (n2 == 573565678) break block49;
                                                                                                                int cfr_ignored_3 = Integer.rotateLeft(0x125EC384 ^ n3, 5) - 1037519927;
                                                                                                                break block36;
                                                                                                            }
                                                                                                            if (n2 == 840787242) break block50;
                                                                                                            if (n2 == 1185068054) break block51;
                                                                                                            int cfr_ignored_4 = (Integer.rotateLeft(0x7360254 ^ n3, 3) - -471341209) * 120980053;
                                                                                                            if (n2 == 1256134912) break block52;
                                                                                                            break block36;
                                                                                                        }
                                                                                                        if (n2 > 1432697704) break block53;
                                                                                                        if (n2 == 1326530011) break block54;
                                                                                                        if (n2 == 1379958932) break block55;
                                                                                                        if (n2 == 1432697704) break block56;
                                                                                                        break block36;
                                                                                                    }
                                                                                                    if (n2 == 1571712391) break block57;
                                                                                                    if (n2 == 1989260854) break block58;
                                                                                                    if (n2 == 2112894753) break block59;
                                                                                                    break block36;
                                                                                                }
                                                                                                int cfr_ignored_5 = (Integer.rotateRight(0xDA0E7F76 ^ n3, 14) - 1813974661) * -636584073;
                                                                                                class_1792[] class_1792Array = new class_1792[381502330 + -381502324];
                                                                                                class_1792Array[0] = class_1802.field_22028;
                                                                                                class_1792Array[1] = class_1802.field_8058;
                                                                                                class_1792Array[2] = class_1802.field_8523;
                                                                                                class_1792Array[3] = class_1802.field_8678;
                                                                                                class_1792Array[4] = class_1802.field_8873;
                                                                                                class_1792Array[5] = class_1802.field_8577;
                                                                                                n = tzf.jqsh(this, class_1792Array);
                                                                                                if (n == -1) {
                                                                                                    n4 = 573565678 + n3 ^ 0x6057F6A5 ^ 0x6057F6A5;
                                                                                                    int cfr_ignored_6 = (Integer.rotateLeft(0xCF80A250 ^ n3, 12) + 619792107) * -813653423;
                                                                                                    n2 += 3;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_7 = (int)(0xD255760E1BE5AFBL ^ (long)n3 ^ 0x53B10FCF4ED1B79BL);
                                                                                                n4 = (int)((long)(-159408134 + n3) ^ 0x9980AFAEA4AD1127L ^ 0x9980AFAEA4AD1127L);
                                                                                                int cfr_ignored_8 = (int)(0x9F4976A39BEF802CL ^ (long)n3 ^ 0x1037FB6CFB7E9343L);
                                                                                                n4 = 498175879 + n3;
                                                                                                n2 += 5;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_9 = Integer.rotateRight(0xBA83FE07 ^ n3, 10) - -1705418220;
                                                                                            return;
                                                                                        }
                                                                                        int cfr_ignored_10 = Integer.rotateLeft(0xA08E9B08 ^ n3, 7) + 1973577011;
                                                                                        return;
                                                                                    }
                                                                                    int cfr_ignored_11 = (Integer.rotateLeft(0xC6740334 ^ n3, 11) - 208274055) * -965475531;
                                                                                    if (tzf.mc.field_1724 == null) {
                                                                                        try {
                                                                                            n2 -= 2;
                                                                                            if ((0x4C95005BE5557E41L ^ (long)n3 | 1L) == 0L) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                            n4 = (int)((long)(1326530011 + n3) ^ 0xAF37619D0E6035E7L ^ 0xAF37619D0E6035E7L);
                                                                                        }
                                                                                        catch (IllegalStateException illegalStateException) {
                                                                                            n4 = (int)((long)(1326530011 + n3) ^ 0x8E0A4860E4E87AFFL ^ 0x8E0A4860E4E87AFFL);
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        n2 += 4;
                                                                                        n4 = Integer.reverse(Integer.reverse(1571712391 + n3));
                                                                                    }
                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                        n4 = 1571712391 + n3 + 1879793368 - 1879793368;
                                                                                    }
                                                                                    n2 += 2;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_12 = (Integer.rotateRight(0x16E0247E ^ n3, 5) - -914224515) * 383788159;
                                                                                tzf.mc.field_1761.method_2906(tzf.mc.field_1724.field_7512.field_7763, n, Integer.reverse(-1745422357) ^ 0xD7EF6FEF, class_1713.field_7791, (class_1657)tzf.mc.field_1724);
                                                                                try {
                                                                                    n2 += 5;
                                                                                    if ((0xC3C1135A89009545L ^ (long)n3 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    n4 = (int)((long)(573565678 + n3) ^ 0x6EA354C602BB5A66L ^ 0x6EA354C602BB5A66L);
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    n4 = 573565678 + n3 + -1328154215 - -1328154215;
                                                                                }
                                                                                ++n2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_13 = Integer.rotateRight(0x8424FFA2 ^ n3, 3) + 81302489;
                                                                            return;
                                                                        }
                                                                        int cfr_ignored_14 = Integer.rotateRight(0x86C6CDC2 ^ n3, 3) + 1450215865;
                                                                        if (tzf.mc.field_1761 != null) {
                                                                            try {
                                                                                n4 = (int)((long)(-1973637115 + n3) ^ 0xCAC14913BC576923L ^ 0xCAC14913BC576923L);
                                                                            }
                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                n4 = Integer.reverse(Integer.reverse(-1973637115 + n3));
                                                                            }
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_15 = (int)(0x507F97B43CFBB318L ^ (long)n3 ^ 0xD218B5449D170D2EL);
                                                                        n4 = 1989260854 + n3;
                                                                        n2 -= 5;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_16 = (Integer.rotateLeft(0x1CB771F4 ^ n3, 6) - 2123656135) * 481784309;
                                                                    try {
                                                                        n2 += 2;
                                                                        n4 = -1123996818 + n3 ^ 0xE1389540 ^ 0xE1389540;
                                                                    }
                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                        n4 = -1123996818 + n3 ^ 0xD86DE47D ^ 0xD86DE47D;
                                                                    }
                                                                    n2 -= 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_17 = (Integer.rotateLeft(0x3B73445D ^ n3, 10) - 928179838) * 997409885;
                                                                int cfr_ignored_18 = (int)(0xF9C1EA6027D4EB4FL ^ (long)n3 ^ 0x29B0831A2DB85E52L);
                                                                n4 = -1262899347 + n3 ^ 0xCB111187 ^ 0xCB111187;
                                                                int cfr_ignored_19 = Integer.rotateLeft(0x3CF84E29 ^ n3, 10) + 1718556210;
                                                                int cfr_ignored_20 = (int)(0xFE4AE01427D4EB4FL ^ (long)n3 ^ 0x3D58831A2DB85144L);
                                                                try {
                                                                    n2 += 4;
                                                                    if ((0xEC703A6EB1889F1DL ^ (long)n3 | 1L) == 0L) {
                                                                        throw new IllegalArgumentException();
                                                                    }
                                                                    n4 = -1123996818 + n3 + -1207394605 - -1207394605;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    n4 = -1123996818 + n3;
                                                                }
                                                                continue;
                                                            }
                                                            int cfr_ignored_21 = Integer.rotateRight(0x765F792E ^ n3, 17) - 1508723661;
                                                            try {
                                                                n2 += 2;
                                                                if ((0x5F3A2080792360FDL ^ (long)n3 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                n4 = Integer.reverse(Integer.reverse(-1123996818 + n3));
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                n4 = -1123996818 + n3 ^ 0x618EA6F0 ^ 0x618EA6F0;
                                                            }
                                                            n2 -= 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_22 = (Integer.rotateRight(0xE5F410FE ^ n3, 15) - -588534275) * -436989697;
                                                        n4 = 1826450914 + n3 + 1430077816 - 1430077816;
                                                        int cfr_ignored_23 = Integer.rotateLeft(0x1EB3D9AD ^ n3, 6) - -1138427090;
                                                        int cfr_ignored_24 = (int)(0xDC01779027D4EB4FL ^ (long)n3 ^ 0x1250831A2DB815D3L);
                                                        n4 = Integer.reverse(Integer.reverse(-1123996818 + n3));
                                                        int cfr_ignored_25 = Integer.rotateLeft(0x9B4557ED ^ n3, 6) - -775731986;
                                                        int cfr_ignored_26 = (int)(0x59F7F9D027D4EB4FL ^ (long)n3 ^ 0xED0831A2DB91E3EL);
                                                        n2 -= 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_27 = (Integer.rotateRight(0xF2DEE497 ^ n3, 17) - 1834700164) * -220273513;
                                                    int cfr_ignored_28 = (int)(0xA0317483075D460BL ^ (long)n3 ^ 0x1476C2097730EDB3L);
                                                    n4 = Integer.reverse(Integer.reverse(-1123996818 + n3));
                                                    ++n2;
                                                    continue;
                                                }
                                                int cfr_ignored_29 = Integer.rotateRight(0x6B1671EB ^ n3, 16) + -65705296;
                                                try {
                                                    n2 += 5;
                                                    if ((0x3F4FCE5D27FDF781L ^ (long)n3 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    n4 = -1123996818 + n3 ^ 0xC0250984 ^ 0xC0250984;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n4 = -1123996818 + n3 ^ 0xE0F83615 ^ 0xE0F83615;
                                                }
                                                n2 += 2;
                                                continue;
                                            }
                                            int cfr_ignored_30 = (Integer.rotateLeft(0xBEA147F8 ^ n3, 10) + 434460227) * -1096726535;
                                            n4 = -615506171 + n3 + -717409680 - -717409680;
                                            int cfr_ignored_31 = (Integer.rotateRight(0xEB6153 ^ n3, 3) + 551446600) * 15425875;
                                            int cfr_ignored_32 = (int)(0x857570C73CD0F9F7L ^ (long)n3 ^ 0x1CFEB51208C8A73BL);
                                            n4 = 1527590001 + n3;
                                            int cfr_ignored_33 = (int)(0xBD648D0BA2CCD2DDL ^ (long)n3 ^ 0xE767892A5E9CD718L);
                                            n4 = -1123996818 + n3 ^ 0x720C2962 ^ 0x720C2962;
                                            n2 -= 4;
                                            continue;
                                        }
                                        int cfr_ignored_34 = Integer.rotateRight(0xAE82CDCF ^ n3, 8) - 640977740;
                                        n4 = (int)((long)(1255873666 + n3) ^ 0xB2DB9B4CD298CB28L ^ 0xB2DB9B4CD298CB28L);
                                        int cfr_ignored_35 = (Integer.rotateRight(0xAEA16B16 ^ n3, 8) - 703174373) * -1365153001;
                                        n4 = -1123996818 + n3 + -1555824365 - -1555824365;
                                        int cfr_ignored_36 = Integer.rotateRight(0xBBCD57C3 ^ n3, 10) + -1036304424;
                                        n2 -= 3;
                                        continue;
                                    }
                                    int cfr_ignored_37 = (Integer.rotateLeft(0xEEA4B8F9 ^ n3, 16) + -363854494) * -291194631;
                                    int cfr_ignored_38 = (int)(0x2C1616C427D4EB4FL ^ (long)n3 ^ 0xD0F8831A2DB9F5FDL);
                                    n4 = Integer.reverse(Integer.reverse(-384614137 + n3));
                                    int cfr_ignored_39 = (Integer.rotateLeft(0xB6EC6338 ^ n3, 9) + 721265411) * -1226022087;
                                    n4 = 816312141 + n3 ^ 0xF14AD423 ^ 0xF14AD423;
                                    int cfr_ignored_40 = (Integer.rotateRight(0x4C670CF3 ^ n3, 12) + 1155018920) * 1281821939;
                                    n4 = -1123996818 + n3;
                                    continue;
                                }
                                int cfr_ignored_41 = (Integer.rotateLeft(0x75A18139 ^ n3, 17) + 1122780450) * 1973518649;
                                int cfr_ignored_42 = (int)(0xB7132F0427D4EB4FL ^ (long)n3 ^ 0xA378831A2DB8C3F7L);
                                n4 = (int)((long)(1849385751 + n3) ^ 0xE2E2E89B0031DBF2L ^ 0xE2E2E89B0031DBF2L);
                                int cfr_ignored_43 = Integer.rotateLeft(0xFFA36B69 ^ n3, 18) + -114843406;
                                int cfr_ignored_44 = (int)(0x3D11C55427D4EB4FL ^ (long)n3 ^ 0x77D8831A2DB9D7F2L);
                                n4 = -1123996818 + n3 + 1407449773 - 1407449773;
                                continue;
                            }
                            int cfr_ignored_45 = Integer.rotateRight(0xEF2BCAEA ^ n3, 16) + -89443951;
                            n4 = Integer.reverse(Integer.reverse(-1861432924 + n3));
                            int cfr_ignored_46 = (Integer.rotateLeft(0x9472CF99 ^ n3, 5) + -29048126) * -1804415079;
                            int cfr_ignored_47 = (int)(0x56C061A427D4EB4FL ^ (long)n3 ^ 0x3E38831A2DB90051L);
                            n4 = -1123996818 + n3 + 864366984 - 864366984;
                            int cfr_ignored_48 = Integer.rotateLeft(0xD76B3AAD ^ n3, 13) - 442087982;
                            int cfr_ignored_49 = (int)(0x15D9949027D4EB4FL ^ (long)n3 ^ 0xD450831A2DB98662L);
                            n2 += 5;
                            continue;
                        }
                        int cfr_ignored_50 = (Integer.rotateLeft(0x98D9F610 ^ n3, 6) + -2034078933) * -1730546159;
                        n4 = (int)((long)(2049883730 + n3) ^ 0x398D6843EFCBFCB8L ^ 0x398D6843EFCBFCB8L);
                        int cfr_ignored_51 = Integer.rotateRight(0x9CFD494A ^ n3, 6) + 118062897;
                        try {
                            --n2;
                            if ((0xD08D73BA8F1691E7L ^ (long)n3 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n4 = Integer.reverse(Integer.reverse(-1123996818 + n3));
                        }
                        catch (IllegalStateException illegalStateException) {
                            n4 = -1123996818 + n3;
                        }
                        continue;
                    }
                    int cfr_ignored_52 = (Integer.rotateLeft(0x5CEB879D ^ n3, 14) - 1155730238) * 1558939549;
                    int cfr_ignored_53 = (int)(0x9E5929A027D4EB4FL ^ (long)n3 ^ 0xAE30831A2DB89163L);
                    n4 = -1267875445 + n3 + -1318344887 - -1318344887;
                    int cfr_ignored_54 = (Integer.rotateRight(0x8BA8D9DE ^ n3, 4) - -305135331) * -1951868449;
                    try {
                        n2 += 4;
                        if ((0xC230ED0799F16ECDL ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n4 = -1123996818 + n3;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = -1123996818 + n3;
                    }
                    n2 -= 4;
                    continue;
                }
                int cfr_ignored_55 = Integer.rotateRight(0x8BAA15A2 ^ n3, 4) + -302629415;
                n4 = -1123996818 + n3 ^ 0x4452FC68 ^ 0x4452FC68;
                --n2;
                continue;
            }
            int cfr_ignored_56 = Integer.rotateLeft(0xDFB85D64 ^ n3, 14) - 464580183;
            n4 = -1123996818 + n3 ^ 0xBC22CFD4 ^ 0xBC22CFD4;
        }
    }

    private void dss_5() {
        int n = 0;
        int n2 = 0;
        int n3 = 362328697;
        n3 = Integer.rotateLeft(n3 * 1033421101, 14) ^ 0x6426B4FF;
        n3 = Integer.rotateRight(System.identityHashCode(this) ^ n3, 6);
        int n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) ^ 0xB8258B4BEC1575E1L ^ 0xB8258B4BEC1575E1L);
        while (true) {
            block52: {
                block45: {
                    block42: {
                        block35: {
                            block37: {
                                block41: {
                                    block47: {
                                        block51: {
                                            block50: {
                                                block40: {
                                                    block43: {
                                                        block48: {
                                                            block33: {
                                                                block44: {
                                                                    block39: {
                                                                        block30: {
                                                                            block32: {
                                                                                block36: {
                                                                                    block49: {
                                                                                        block46: {
                                                                                            block34: {
                                                                                                block38: {
                                                                                                    block31: {
                                                                                                        if ((n2 = Integer.rotateRight(n4, 3) ^ n3) == 43195556) break block30;
                                                                                                        if (n2 == 30316095) break block31;
                                                                                                        if (n2 == -1762414821) break block32;
                                                                                                        if (n2 == 1643870844) break block33;
                                                                                                        if (n2 == 130629556) break block34;
                                                                                                        if (n2 == -1466319663) break block35;
                                                                                                        if (n2 == -1567131137) break block36;
                                                                                                        if (n2 == -1370720752) break block37;
                                                                                                        if (n2 == -1814573894) break block38;
                                                                                                        if (n2 == -691055939) break block39;
                                                                                                        if (n2 == -1550355165) break block40;
                                                                                                        if (n2 == -247318541) break block41;
                                                                                                        if (n2 == -1865961285) break block42;
                                                                                                        if (n2 == -1592651445) break block43;
                                                                                                        int cfr_ignored_0 = (Integer.rotateLeft(0x3F872AD5 ^ n3, 10) - -1245982970) * 1065822933;
                                                                                                        int cfr_ignored_1 = (int)(0xFD3584E827D4EB4FL ^ (long)n3 ^ 0xF4A0831A2DB857BAL);
                                                                                                        if (n2 == 2030263337) break block44;
                                                                                                        if (n2 == -2137235027) break block45;
                                                                                                        if (n2 == -345110761) break block46;
                                                                                                        int cfr_ignored_2 = Integer.rotateLeft(0x7129BC1 ^ n3, 3) + -543261798;
                                                                                                        int cfr_ignored_3 = (int)(0xC5A035FC27D4EB4FL ^ (long)n3 ^ 0x9688831A2DB82691L);
                                                                                                        if (n2 == 1030229895) break block47;
                                                                                                        if (n2 == 358840973) break block48;
                                                                                                        if (n2 == 1264282689) break block49;
                                                                                                        int cfr_ignored_4 = Integer.rotateLeft(0x20E47508 ^ n3, 7) + 510771;
                                                                                                        if (n2 == 1940577289) break block50;
                                                                                                        if (n2 == 1337692786) break block51;
                                                                                                        break block52;
                                                                                                    }
                                                                                                    int cfr_ignored_5 = (Integer.rotateRight(0xDA477656 ^ n3, 14) - 1929704357) * -632850857;
                                                                                                    tzf.mc.field_1761.method_2906(tzf.mc.field_1724.field_7512.field_7763, n, Integer.rotateLeft(0x767FEEF3 ^ 0x167FEEF3, 4), class_1713.field_7791, (class_1657)tzf.mc.field_1724);
                                                                                                    if (tzf.mc.field_1724.method_6128()) {
                                                                                                        try {
                                                                                                            if ((0x1BD31747BE2964EFL ^ (long)n3 | 1L) == 0L) {
                                                                                                                throw new ArithmeticException();
                                                                                                            }
                                                                                                            n4 = Integer.rotateLeft(n3 ^ 0x4B5B6C41, 3) + 718772174 - 718772174;
                                                                                                        }
                                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x4B5B6C41, 3)));
                                                                                                        }
                                                                                                        n2 -= 5;
                                                                                                        continue;
                                                                                                    }
                                                                                                    n4 = Integer.rotateLeft(n3 ^ 0xFB5F7143, 3) ^ 0x1166F9A2 ^ 0x1166F9A2;
                                                                                                    int cfr_ignored_6 = Integer.rotateRight(0xB76F252E ^ n3, 9) - 986914765;
                                                                                                    n4 = Integer.rotateLeft(n3 ^ 0x2931CA4, 3) + 1992996215 - 1992996215;
                                                                                                    --n2;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_7 = Integer.rotateLeft(0x4F185CA5 ^ n3, 12) - -1739532490;
                                                                                                int cfr_ignored_8 = (int)(0x8DAAF29827D4EB4FL ^ (long)n3 ^ 0x1840831A2DB8B684L);
                                                                                                if (tzf.mc.field_1761 == null) {
                                                                                                    n4 = Integer.rotateLeft(n3 ^ 0x96BA3C51, 3) + 232718935 - 232718935;
                                                                                                    int cfr_ignored_9 = Integer.rotateLeft(0x89163BC5 ^ n3, 4) - -1643193322;
                                                                                                    int cfr_ignored_10 = (int)(0x4BA495F827D4EB4FL ^ (long)n3 ^ 0xD680831A2DB93A98L);
                                                                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x7C93FB4, 3)));
                                                                                                    n2 += 2;
                                                                                                    continue;
                                                                                                }
                                                                                                n4 = Integer.rotateLeft(n3 ^ 0x8E70E975, 3);
                                                                                                int cfr_ignored_11 = Integer.rotateLeft(0x63FE3C89 ^ n3, 15) + 539423698;
                                                                                                int cfr_ignored_12 = (int)(0xA14C92B427D4EB4FL ^ (long)n3 ^ 0xD818831A2DB8EF48L);
                                                                                                n4 = Integer.rotateLeft(n3 ^ 0xD6CF52BD, 3) + 475212809 - 475212809;
                                                                                                n2 -= 5;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_13 = (Integer.rotateLeft(0xEF7CE498 ^ n3, 16) + 75320739) * -277027687;
                                                                                            return;
                                                                                        }
                                                                                        int cfr_ignored_14 = (Integer.rotateRight(0xB506BF5F ^ n3, 9) - -265368644) * -1257848993;
                                                                                        return;
                                                                                    }
                                                                                    int cfr_ignored_15 = (Integer.rotateRight(0xF10432F3 ^ n3, 17) + 870304424) * -251383053;
                                                                                    return;
                                                                                }
                                                                                int cfr_ignored_16 = (Integer.rotateRight(0x4C11D973 ^ n3, 12) + 981922856) * 1276238195;
                                                                                this.zsdh_2();
                                                                                n4 = Integer.rotateLeft(n3 ^ 0x4B5B6C41, 3) + 1305644662 - 1305644662;
                                                                                int cfr_ignored_17 = Integer.rotateLeft(0xBE459809 ^ n3, 10) + 248186962;
                                                                                int cfr_ignored_18 = (int)(0x7CF7363427D4EB4FL ^ (long)n3 ^ 0x9118831A2DB9543FL);
                                                                                n2 += 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_19 = Integer.rotateLeft(0x88164288 ^ n3, 4) + 2131733939;
                                                                            if (tzf.mc.field_1724 == null) {
                                                                                int cfr_ignored_20 = (int)(0x2453462F25E5EE7AL ^ (long)n3 ^ 0x712E877827D3E577L);
                                                                                n4 = Integer.rotateLeft(n3 ^ 0x7C93FB4, 3);
                                                                                ++n2;
                                                                                continue;
                                                                            }
                                                                            n4 = Integer.rotateLeft(n3 ^ 0xFA0931AF, 3);
                                                                            int cfr_ignored_21 = (Integer.rotateLeft(0x826BBA14 ^ n3, 3) - -815192153) * -2106869227;
                                                                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x93D7CCBA, 3) ^ 0xB8DA67B24C644C33L ^ 0xB8DA67B24C644C33L);
                                                                            n2 -= 2;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_22 = Integer.rotateRight(0xE24CFD0A ^ n3, 15) + 1806713713;
                                                                        tzf.mc.field_1724.method_23669();
                                                                        tzf.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)tzf.mc.field_1724, class_2848.class_2849.field_12982));
                                                                        if (!this.jdhz.shzl()) {
                                                                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x8F13D96C, 3)));
                                                                            int cfr_ignored_23 = Integer.rotateRight(0x777557EE ^ n3, 17) - 2073249037;
                                                                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x4B5B6C41, 3)));
                                                                            n2 += 2;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            n2 -= 2;
                                                                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xA29779FF, 3) ^ 0x6C78088281953320L ^ 0x6C78088281953320L);
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0xA29779FF, 3)));
                                                                        }
                                                                        n2 -= 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_24 = (Integer.rotateRight(0x1708209E ^ n3, 5) - -832990627) * 386408607;
                                                                    n = this.skw(class_1802.field_8833);
                                                                    if (n == -1) {
                                                                        n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xB710955A, 3) ^ 0xF563F71A8C6BD724L ^ 0xF563F71A8C6BD724L);
                                                                        int cfr_ignored_25 = (Integer.rotateLeft(0x7A739DD5 ^ n3, 18) - -664945658) * 2054397397;
                                                                        int cfr_ignored_26 = (int)(0xB8C133E827D4EB4FL ^ (long)n3 ^ 0x9AA0831A2DB8DC53L);
                                                                        n4 = Integer.rotateLeft(n3 ^ 0x4B5B6C41, 3) ^ 0xE6CA687A ^ 0xE6CA687A;
                                                                        n2 -= 4;
                                                                        continue;
                                                                    }
                                                                    n4 = Integer.rotateLeft(n3 ^ 0x1CE963F, 3) ^ 0xAF7CBC50 ^ 0xAF7CBC50;
                                                                    n2 -= 3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_27 = Integer.rotateRight(0x3B17B306 ^ n3, 10) - 742149365;
                                                                try {
                                                                    if ((0x6A073A89CD09E321L ^ (long)n3 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) ^ 0x4C2A34F0C0A2E0B9L ^ 0x4C2A34F0C0A2E0B9L);
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) ^ 0xD33EC8F6 ^ 0xD33EC8F6;
                                                                }
                                                                n2 -= 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_28 = (Integer.rotateLeft(0xB2BDA6FC ^ n3, 9) - -1454057537) * -1296193795;
                                                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x63DD0D25, 3) ^ 0xEAC08C4BFD00BBF7L ^ 0xEAC08C4BFD00BBF7L);
                                                            int cfr_ignored_29 = (Integer.rotateLeft(0x2D018D1D ^ n3, 8) - 2005775806) * 755076381;
                                                            int cfr_ignored_30 = (int)(0xEFB3232027D4EB4FL ^ (long)n3 ^ 0xBB30831A2DB872B7L);
                                                            n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3);
                                                            int cfr_ignored_31 = (Integer.rotateRight(0x361BB51A ^ n3, 9) + -1850176159) * 907785499;
                                                            --n2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_32 = Integer.rotateLeft(0x74B61A49 ^ n3, 17) + 644533778;
                                                        int cfr_ignored_33 = (int)(0xB604B47427D4EB4FL ^ (long)n3 ^ 0x9598831A2DB8C1D8L);
                                                        n4 = Integer.rotateLeft(n3 ^ 0x8C43B2DB, 3) + 1472314291 - 1472314291;
                                                        int cfr_ignored_34 = (Integer.rotateLeft(0x79402E71 ^ n3, 18) + -1289535766) * 2034249329;
                                                        int cfr_ignored_35 = (int)(0xBBF2804C27D4EB4FL ^ (long)n3 ^ 0xFDE8831A2DB8DA34L);
                                                        try {
                                                            n2 -= 2;
                                                            if ((0xACDC1B94440BF653L ^ (long)n3 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) + 690065303 - 690065303;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3);
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_36 = (Integer.rotateRight(0x2D8C8093 ^ n3, 8) + -2006896376) * 764182675;
                                                    n4 = Integer.rotateLeft(n3 ^ 0xC583D5F0, 3);
                                                    int cfr_ignored_37 = Integer.rotateLeft(0xE26A6E41 ^ n3, 15) + 1866529050;
                                                    int cfr_ignored_38 = (int)(0x20D8C07C27D4EB4FL ^ (long)n3 ^ 0x7D88831A2DB9EC60L);
                                                    int cfr_ignored_39 = (int)(0x4568C1946856E39DL ^ (long)n3 ^ 0x7E581C1E3C1D2700L);
                                                    n4 = Integer.rotateLeft(n3 ^ 0xD508F953, 3) ^ 0x7C1797CF ^ 0x7C1797CF;
                                                    int cfr_ignored_40 = (int)(0x3CD21E6F1B02690BL ^ (long)n3 ^ 0xC1AEFAB72931D475L);
                                                    n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) + 768733824 - 768733824;
                                                    n2 += 2;
                                                    continue;
                                                }
                                                int cfr_ignored_41 = Integer.rotateRight(0x89C4BA43 ^ n3, 4) + -1288688296;
                                                try {
                                                    n2 += 4;
                                                    if ((0x880D145057F5F3EDL ^ (long)n3 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3)));
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3)));
                                                }
                                                n2 += 3;
                                                continue;
                                            }
                                            int cfr_ignored_42 = (Integer.rotateLeft(0x7403E410 ^ n3, 17) + 282475819) * 1946412049;
                                            n4 = Integer.rotateLeft(n3 ^ 0x482D4C2A, 3) + -1895819493 - -1895819493;
                                            int cfr_ignored_43 = (Integer.rotateLeft(0xF0BF50D4 ^ n3, 17) - 730360039) * -255897387;
                                            n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) ^ 0xDAF49991 ^ 0xDAF49991;
                                            int cfr_ignored_44 = (Integer.rotateLeft(0x69196BF0 ^ n3, 16) + -1099845301) * 1763273713;
                                            --n2;
                                            continue;
                                        }
                                        int cfr_ignored_45 = (Integer.rotateLeft(0x8F9DA78 ^ n3, 4) + 446632899) * 150592121;
                                        n4 = Integer.rotateLeft(n3 ^ 0x9FCEB57D, 3);
                                        int cfr_ignored_46 = Integer.rotateRight(0xAE4E01CA ^ n3, 8) + 533714609;
                                        n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3)));
                                        continue;
                                    }
                                    int cfr_ignored_47 = (Integer.rotateLeft(0x3CC2EB35 ^ n3, 10) - 1610095270) * 1019407157;
                                    int cfr_ignored_48 = (int)(0xFE70450827D4EB4FL ^ (long)n3 ^ 0x7760831A2DB85131L);
                                    try {
                                        ++n2;
                                        if ((0xEA9D4FD01BB99C9DL ^ (long)n3 | 1L) == 0L) {
                                            throw new IllegalArgumentException();
                                        }
                                        n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) ^ 0x1B25B14F ^ 0x1B25B14F;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) ^ 0x9B1102AC ^ 0x9B1102AC;
                                    }
                                    n2 += 5;
                                    continue;
                                }
                                int cfr_ignored_49 = (Integer.rotateLeft(0xAADF1F99 ^ n3, 8) + -1251839294) * -1428217959;
                                int cfr_ignored_50 = (int)(0x686DB1A427D4EB4FL ^ (long)n3 ^ 0x9E38831A2DB97D0AL);
                                n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) + -2132041243 - -2132041243;
                                int cfr_ignored_51 = (Integer.rotateRight(0xAC5F6D16 ^ n3, 8) - -471083803) * -1403032297;
                                continue;
                            }
                            int cfr_ignored_52 = (Integer.rotateRight(0x529B09D7 ^ n3, 13) - 86233156) * 1385892311;
                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xDAA80C1, 3) ^ 0xDEA2D8F8C292361CL ^ 0xDEA2D8F8C292361CL);
                            int cfr_ignored_53 = Integer.rotateRight(0x969BB78F ^ n3, 5) - 1094244748;
                            n4 = Integer.rotateLeft(n3 ^ 0xCB445ACB, 3) ^ 0x23DBECED ^ 0x23DBECED;
                            int cfr_ignored_54 = Integer.rotateRight(0x7C1BCEE7 ^ n3, 18) - 196848948;
                            n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) + -1391905896 - -1391905896;
                            n2 -= 3;
                            continue;
                        }
                        int cfr_ignored_55 = (Integer.rotateRight(0x7F3C4B13 ^ n3, 18) + 1823127176) * 2134657811;
                        n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x9A04D6B4, 3)));
                        int cfr_ignored_56 = (Integer.rotateRight(0x58FB2E1E ^ n3, 14) - -892848931) * 1492856351;
                        try {
                            n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3);
                        }
                        catch (IllegalStateException illegalStateException) {
                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3)));
                        }
                        continue;
                    }
                    int cfr_ignored_57 = Integer.rotateLeft(0x472E98E0 ^ n3, 11) + -1560141221;
                    try {
                        n2 += 2;
                        n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) ^ 0xA070844DE77F2B8L ^ 0xA070844DE77F2B8L);
                    }
                    n2 -= 4;
                    continue;
                }
                int cfr_ignored_58 = (Integer.rotateRight(0xD571ED9B ^ n3, 13) + -584489728) * -713953893;
                try {
                    n2 += 2;
                    if ((0x5CF75BA82579A179L ^ (long)n3 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3);
                }
                catch (ArithmeticException arithmeticException) {
                    n4 = Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3);
                }
                continue;
            }
            int cfr_ignored_59 = Integer.rotateLeft(0x96FD776C ^ n3, 5) - 1292834127;
            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x96F3AF1B, 3) ^ 0xDF68F3FA444C034AL ^ 0xDF68F3FA444C034AL);
        }
    }

    private void zsdh_2() {
        int n;
        try {
            int n2 = -37977373;
            n2 = Integer.rotateLeft(n2 * -1847752549, 27) ^ 0xCB1A3E11;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 13);
            int n3 = n2 ^ 0x2E6481B6;
            if ((n3 ^ n2) != 778338742) {
                int cfr_ignored_0 = (0xD3D80355 ^ n2) - 1252103647;
            }
            if ((0x114 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            tzf.jthw();
        }
        int n4 = -1;
        for (n = 0; n < 1446669372 - 1446669363; ++n) {
            class_1799 class_17992 = tzf.rtha(tzf.mc.field_1724.method_31548(), n);
            if (class_17992.method_7960() || class_17992.method_7909() != class_1802.field_8639) continue;
            n4 = n;
            break;
        }
        if (n4 != -1) {
            n = tzf.mc.field_1724.method_31548().field_7545;
            tzf.mc.field_1724.method_31548().field_7545 = n4;
            tzf.mc.field_1761.method_2919((class_1657)tzf.mc.field_1724, class_1268.field_5808);
            tzf.mc.field_1724.method_6104(class_1268.field_5808);
            tzf.mc.field_1724.method_31548().field_7545 = n;
        }
    }

    private int skw(class_1792 ... class_1792Array) {
        int n = -1103756842;
        n = Integer.rotateLeft(n * -607583543, 28) ^ 0xD3878E88;
        n = Integer.rotateLeft((class_1792Array != null ? System.identityHashCode(class_1792Array) : 0) ^ n, 20);
        int n2 = n ^ 0x13F466D3;
        if ((n2 ^ n) != 334784211) {
            int cfr_ignored_0 = (0xADC26705 ^ n) - -867403857;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (tzf.mc.field_1724 == null) {
            return -1;
        }
        for (class_1792 class_17922 : class_1792Array) {
            for (int i = 0; i < tzf.baj(tzf.mc.field_1724.field_7512.field_7761); ++i) {
                class_1799 class_17992 = tzf.mc.field_1724.field_7512.method_7611(i).method_7677();
                if (class_17992.method_7960() || class_17992.method_7909() != class_17922) continue;
                return i;
            }
        }
        return -1;
    }

    private void shkhsh(btt btt2) {
        try {
            int n = 1460096427;
            n = Integer.rotateLeft(n * 640634521, 15) ^ 0x752FE7A8;
            n = System.identityHashCode(this) ^ n;
            btt btt3 = btt2;
            n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
            int n2 = n ^ 0x8D95205F;
            if ((n2 ^ n) != -1919606689) {
                int cfr_ignored_0 = (0xDA926DF4 ^ n) - -705569660;
            }
            if ((0x313 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (tzf.mc.field_1724 == null || tzf.mc.field_1687 == null) {
            return;
        }
        class_1309 class_13092 = tkhdh.zkhr_2().rkhh_2();
        if (class_13092 == null) {
            if (this.sth) {
                this.dss_5();
                this.sth = false;
            }
            return;
        }
        class_243 class_2432 = class_13092.method_19538();
        float f = (float)class_2432.method_1022(tzf.mc.field_1724.method_33571());
        boolean bl = tzf.mc.field_1724.method_6118(class_1304.field_6174).method_31574(class_1802.field_8833);
        if (f < this.dhkhd_2.thw_5() && (this.sth || tzf.mc.field_1724.method_6128())) {
            if (bl && this.zat_3.shzl()) {
                this.tshgh_2();
                this.sth = true;
            }
            tzf.mc.field_1724.method_18799(class_243.field_1353);
        } else if (this.sth) {
            this.dss_5();
            this.sth = false;
        }
    }

    private boolean yth() {
        try {
            int n = -1294266147;
            n = Integer.rotateLeft(n * 514251259, 13) ^ 0x48EFC01A;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
            int n2 = n ^ 0x649FBA9;
            if ((n2 ^ n) != 105511849) {
                int cfr_ignored_0 = (0xB492EB74 ^ n) + 1970195172;
            }
            if ((0x111 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.zat_3.shzl() || !this.jdhz.shzl();
    }

    private boolean ghsha_2() {
        int n = 550175641;
        n = Integer.rotateLeft(n * -1202918339, 7) ^ 0x7739A4A8;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0xEFFFB11E;
        if ((n2 ^ n) != -268455650) {
            int cfr_ignored_0 = (0xCF34B287 ^ n) + 844012154;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.zat_3.shzl();
    }

    private static String dz(String string, int n, int n2, int n3) {
        try {
            int n4 = 2099526477;
            n4 = Integer.rotateLeft(n4 * 406608357, 16) ^ 0x29DE394E;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 22);
            n4 = Integer.rotateLeft(n2 ^ n4, 7);
            int n5 = n4 ^ 0xA265D0F4;
            if ((n5 ^ n4) != -1570385676) {
                int cfr_ignored_0 = (0xDF41EBB9 ^ n4) - 885587487;
            }
            if ((0xD9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x37282B81 ^ n2 - i) + dhrgh, 12) ^ shksh + i * -1796832797));
        }
        return new String(cArray);
    }

    private static void khyb(tzf tzf2) {
        int n = tjb.khdt_4(-1185349935);
        int n2 = n ^ 0x11ED715E;
        if ((n2 ^ n) != 300773726) {
            int cfr_ignored_0 = Integer.rotateRight(0xA8B58F8F ^ n, 8) - 1918501260;
        }
        tzf2.dss_5();
    }

    private static int jqsh(tzf tzf2, class_1792[] class_1792Array) {
        block0: {
            int n = 97862539;
            n = Integer.rotateLeft(n * 343375887, 27) ^ 0x1172A369;
            n = Integer.rotateLeft((class_1792Array != null ? System.identityHashCode(class_1792Array) : 0) ^ n, 27);
            int n2 = n ^ 0x593202B4;
            if ((n2 ^ n) == 1496449716) break block0;
            int cfr_ignored_0 = (0x5CE7413F ^ n) + -91013980;
        }
        return tzf2.skw(class_1792Array);
    }

    private static void jthw() {
        int n = -772904981;
        int n2 = (n = Integer.rotateLeft(n * 2004244121, 18) ^ 0xD4AC4E00) ^ 0x5BAAAAAD;
        if ((n2 ^ n) != 1537911469) {
            int cfr_ignored_0 = (0x8A44CD46 ^ n) + 1995261992;
        }
        yf.athz_2();
    }

    private static class_1799 rtha(class_1661 class_16612, int n) {
        block0: {
            int n2 = 1714874578;
            int n3 = (n2 = Integer.rotateLeft(n2 * -2070747429, 17) ^ 0x809AD1B8) ^ 0xCB40A1A9;
            if ((n3 ^ n2) == -884956759) break block0;
            int cfr_ignored_0 = (0xAD76497B ^ n2) - 399211756;
        }
        return class_16612.method_5438(n);
    }

    private static int baj(class_2371 class_23712) {
        block0: {
            int n = 667526487;
            int n2 = (n = Integer.rotateLeft(n * 1478381229, 10) ^ 0x89BBBC97) ^ 0x15CD6785;
            if ((n2 ^ n) == 365782917) break block0;
            int cfr_ignored_0 = (0x3204C2D2 ^ n) - 1749348718;
        }
        return class_23712.size();
    }

    private static String[] zkhgh_2(String string) {
        int n = 460952645;
        n = Integer.rotateLeft(n * -588869197, 20) ^ 0xFBCF3FCB;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xA5B2DFE7;
        if ((n2 ^ n) != -1515003929) {
            int cfr_ignored_0 = (0xBECB4BA2 ^ n) + 1585833833;
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

    private static CallSite zak_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1938428271;
            n3 = Integer.rotateLeft(n3 * -618773659, 7) ^ 0x73A5282D;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 12);
            int n4 = n3 ^ 0xB7AE5A58;
            if ((n4 ^ n3) != -1213310376) {
                int cfr_ignored_0 = (0xC4244B37 ^ n3) + -185048161;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bny ^ string.hashCode()) + (n2 + khghj) + i ^ bny, 25) + khghj);
            }
            String[] stringArray = tzf.zkhgh_2(new String(cArray));
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

    private static String[] pgnrxaoirl(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite mpqse8g1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ising2qeyb ^ string.hashCode()) + (n2 + vfbrbmed2) + i ^ ising2qeyb, 21) + vfbrbmed2);
            }
            String[] stringArray = tzf.pgnrxaoirl(new String(cArray));
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

