/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1661
 *  net.minecraft.class_2338
 *  net.minecraft.class_239
 *  net.minecraft.class_2680
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
import java.util.NoSuchElementException;
import net.minecraft.class_1661;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.dz_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="AutoTool", category=bzw.OTHER, desc="Automatically equips the best tool for breaking blocks")
public class ths
extends bnq {
    private final badh_2 khzb_2 = new badh_2(this, "ReturnToSlot").bts(true);
    private int thkhkh = -1;
    private int thqs_2 = -1;
    private boolean ghb = false;
    private final bql<btt> shns = this::sb;
    private static final int zmt = 1909725920;
    private static final int fr = -755395631;
    private static final int dhyb = 266147478;
    private static final int saw = -2069303719;
    private static final int nmsupnlzoi = -285123732;
    private static final int jwamxdjr1 = -342823065;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bisuc6agjm;

    @Override
    public void nc() {
        int n = 392290096;
        n = Integer.rotateLeft(n * -145926441, 19) ^ 0x6988276E;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x7900BC10;
        if ((n2 ^ n) != 2030091280) {
            int cfr_ignored_0 = (0x6E616320 ^ n) + -26976507;
        }
        ths.dqs(this);
    }

    private int szr_3() {
        try {
            int n = 454551893;
            n = Integer.rotateLeft(n * -398467943, 12) ^ 0xC40F2DF8;
            int n2 = n ^ 0xA9D1021F;
            if ((n2 ^ n) != -1445920225) {
                int cfr_ignored_0 = (0xB2C6EB4A ^ n) + -1722504192;
            }
            if ((0x1C2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_239 class_2392 = ths.mc.field_1765;
        if (!(class_2392 instanceof class_3965)) {
            int n = ths.mc.field_1724.method_31548().field_7545;
            if (yf.tdhth_2() == 0) {
                n = n ^ 0xCA55;
            }
            return n;
        }
        class_3965 class_39652 = (class_3965)class_2392;
        class_2392 = ths.tlm_2(ths.mc.field_1687, class_39652.method_17777()).method_26204();
        int n = ths.mc.field_1724.method_31548().field_7545;
        float f = 1.0f;
        for (int i = 0; i < Integer.rotateLeft(0x796FCCF1 ^ 0x5D6FCCF1, 6); ++i) {
            float f2 = ths.tlt_4(ths.mc.field_1724).method_5438(i).method_7924(class_2392.method_9564());
            if (!(f2 > f)) continue;
            f = f2;
            n = i;
        }
        return n;
    }

    private void jzy_2() {
        int n = dz_3.shjk(70767359);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5C7613A7;
        if ((n2 ^ n) != 1551242151) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x5841C158 ^ n, 14) + -1269561117) * 1480704345;
        }
        this.thkhkh = -1;
        this.thqs_2 = -1;
        this.ghb = false;
    }

    private void sb(btt btt2) {
        boolean bl = false;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 961674859;
        n4 = Integer.rotateLeft(n4 * 102362189, 21) ^ 0xC3E37235;
        n4 = System.identityHashCode(this) ^ n4;
        int n5 = n4 ^ 0x50670161 ^ 0x9CDA49E7 ^ 0x9CDA49E7;
        while (true) {
            block58: {
                block86: {
                    block75: {
                        block63: {
                            block83: {
                                block98: {
                                    block102: {
                                        block71: {
                                            block74: {
                                                block96: {
                                                    block65: {
                                                        block68: {
                                                            block100: {
                                                                block64: {
                                                                    block82: {
                                                                        block59: {
                                                                            block62: {
                                                                                block56: {
                                                                                    block73: {
                                                                                        block57: {
                                                                                            block89: {
                                                                                                block95: {
                                                                                                    block90: {
                                                                                                        block84: {
                                                                                                            block87: {
                                                                                                                block81: {
                                                                                                                    block101: {
                                                                                                                        block93: {
                                                                                                                            block76: {
                                                                                                                                block70: {
                                                                                                                                    block88: {
                                                                                                                                        block77: {
                                                                                                                                            block94: {
                                                                                                                                                block69: {
                                                                                                                                                    block99: {
                                                                                                                                                        block60: {
                                                                                                                                                            block97: {
                                                                                                                                                                block91: {
                                                                                                                                                                    block92: {
                                                                                                                                                                        block78: {
                                                                                                                                                                            block85: {
                                                                                                                                                                                block79: {
                                                                                                                                                                                    block80: {
                                                                                                                                                                                        block52: {
                                                                                                                                                                                            block72: {
                                                                                                                                                                                                block66: {
                                                                                                                                                                                                    block67: {
                                                                                                                                                                                                        block53: {
                                                                                                                                                                                                            block61: {
                                                                                                                                                                                                                block54: {
                                                                                                                                                                                                                    block55: {
                                                                                                                                                                                                                        if ((n3 = n5 ^ n4) > 168686003) break block52;
                                                                                                                                                                                                                        if (n3 > -788060371) break block53;
                                                                                                                                                                                                                        if (n3 > -1302754161) break block54;
                                                                                                                                                                                                                        if (n3 > -1706355634) break block55;
                                                                                                                                                                                                                        if (n3 == -1850967340) break block56;
                                                                                                                                                                                                                        if (n3 == -1706355634) break block57;
                                                                                                                                                                                                                        break block58;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (n3 == -1591769878) break block59;
                                                                                                                                                                                                                    if (n3 == -1302754161) break block60;
                                                                                                                                                                                                                    int cfr_ignored_0 = Integer.rotateRight(0xD676308A ^ n4, 13) + -55738383;
                                                                                                                                                                                                                    break block58;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (n3 > -1138469100) break block61;
                                                                                                                                                                                                                if (n3 == -1157710422) break block62;
                                                                                                                                                                                                                if (n3 == -1138469100) break block63;
                                                                                                                                                                                                                int cfr_ignored_1 = Integer.rotateLeft(0x4B86066C ^ n4, 12) - 697853519;
                                                                                                                                                                                                                break block58;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (n3 == -998896301) break block64;
                                                                                                                                                                                                            if (n3 == -788060371) break block65;
                                                                                                                                                                                                            int cfr_ignored_2 = Integer.rotateRight(0x741658B ^ n4, 3) + -448206064;
                                                                                                                                                                                                            break block58;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (n3 > -356194264) break block66;
                                                                                                                                                                                                        if (n3 > -595440952) break block67;
                                                                                                                                                                                                        if (n3 == -761760085) break block68;
                                                                                                                                                                                                        if (n3 == -595440952) break block69;
                                                                                                                                                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0xFBA31FBD ^ n4, 18) - 2099148574) * -73195587;
                                                                                                                                                                                                        int cfr_ignored_4 = (int)(0x3911B18027D4EB4FL ^ (long)n4 ^ 0x9E70831A2DB9DFF2L);
                                                                                                                                                                                                        break block58;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (n3 == -478567663) break block70;
                                                                                                                                                                                                    if (n3 == -356194264) break block71;
                                                                                                                                                                                                    break block58;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (n3 > -275051314) break block72;
                                                                                                                                                                                                if (n3 == -342873611) break block73;
                                                                                                                                                                                                if (n3 == -275051314) break block74;
                                                                                                                                                                                                break block58;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (n3 == 108831870) break block75;
                                                                                                                                                                                            if (n3 == 155373993) break block76;
                                                                                                                                                                                            if (n3 == 168686003) break block77;
                                                                                                                                                                                            break block58;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (n3 > 980944491) break block78;
                                                                                                                                                                                        if (n3 > 603155371) break block79;
                                                                                                                                                                                        if (n3 > 254715713) break block80;
                                                                                                                                                                                        if (n3 == 180868525) break block81;
                                                                                                                                                                                        if (n3 == 254715713) break block82;
                                                                                                                                                                                        int cfr_ignored_5 = (Integer.rotateLeft(0x89506798 ^ n4, 4) + -1525011805) * -1991219303;
                                                                                                                                                                                        break block58;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (n3 == 397849615) break block83;
                                                                                                                                                                                    if (n3 == 603155371) break block84;
                                                                                                                                                                                    int cfr_ignored_6 = (Integer.rotateRight(0xBB2D22BB ^ n4, 10) + -1361783840) * -1154669893;
                                                                                                                                                                                    break block58;
                                                                                                                                                                                }
                                                                                                                                                                                if (n3 > 613279449) break block85;
                                                                                                                                                                                if (n3 == 607834971) break block86;
                                                                                                                                                                                if (n3 == 613279449) break block87;
                                                                                                                                                                                int cfr_ignored_7 = Integer.rotateLeft(0x93FF70AD ^ n4, 5) - -263437266;
                                                                                                                                                                                int cfr_ignored_8 = (int)(0x514DDE9027D4EB4FL ^ (long)n4 ^ 0x4050831A2DB90F4AL);
                                                                                                                                                                                break block58;
                                                                                                                                                                            }
                                                                                                                                                                            if (n3 == 791984107) break block88;
                                                                                                                                                                            if (n3 == 905971777) break block89;
                                                                                                                                                                            if (n3 == 980944491) break block90;
                                                                                                                                                                            break block58;
                                                                                                                                                                        }
                                                                                                                                                                        if (n3 > 1550931521) break block91;
                                                                                                                                                                        if (n3 > 1333190864) break block92;
                                                                                                                                                                        if (n3 == 1083539139) break block93;
                                                                                                                                                                        if (n3 == 1333190864) break block94;
                                                                                                                                                                        break block58;
                                                                                                                                                                    }
                                                                                                                                                                    if (n3 == 1348927841) break block95;
                                                                                                                                                                    if (n3 == 1550931521) break block96;
                                                                                                                                                                    break block58;
                                                                                                                                                                }
                                                                                                                                                                if (n3 > 1604875060) break block97;
                                                                                                                                                                if (n3 == 1588472124) break block98;
                                                                                                                                                                if (n3 == 1604875060) break block99;
                                                                                                                                                                break block58;
                                                                                                                                                            }
                                                                                                                                                            if (n3 == 1631617710) break block100;
                                                                                                                                                            if (n3 == 1792906155) break block101;
                                                                                                                                                            if (n3 == 2140761043) break block102;
                                                                                                                                                            break block58;
                                                                                                                                                        }
                                                                                                                                                        int cfr_ignored_9 = (Integer.rotateRight(0x18CB9096 ^ n4, 6) - 84156773) * 415994007;
                                                                                                                                                        this.jzy_2();
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    int cfr_ignored_10 = Integer.rotateRight(0xF0905CA6 ^ n4, 17) - 634967893;
                                                                                                                                                    if (!this.ghb) {
                                                                                                                                                        n5 = Integer.reverse(Integer.reverse(n4 ^ 0xA11F84EA));
                                                                                                                                                        int cfr_ignored_11 = (Integer.rotateLeft(0x7268309C ^ n4, 17) - -553942497) * 1919430813;
                                                                                                                                                        n3 += 5;
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        n3 += 3;
                                                                                                                                                        if ((0xB5BAF1FBE8F00493L ^ (long)n4 | 1L) == 0L) {
                                                                                                                                                            throw new NoSuchElementException();
                                                                                                                                                        }
                                                                                                                                                        n5 = n4 ^ 0xBAFEBDAA ^ 0xFA417F6E ^ 0xFA417F6E;
                                                                                                                                                    }
                                                                                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                                                                                        n5 = (int)((long)(n4 ^ 0xBAFEBDAA) ^ 0x5D567991CEA09495L ^ 0x5D567991CEA09495L);
                                                                                                                                                    }
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                int cfr_ignored_12 = Integer.rotateRight(0xA6382E6A ^ n4, 7) + 623590929;
                                                                                                                                                if (!this.ghb) {
                                                                                                                                                    int cfr_ignored_13 = (int)(0xBFB8A402B485F79BL ^ (long)n4 ^ 0xB575A5B81410D2A0L);
                                                                                                                                                    n5 = (int)((long)(n4 ^ 0x33EABC3C) ^ 0x647A661736F0AEB9L ^ 0x647A661736F0AEB9L);
                                                                                                                                                    int cfr_ignored_14 = (int)(0x97032AC6F1C11A3L ^ (long)n4 ^ 0x9828128BD861BF31L);
                                                                                                                                                    n5 = n4 ^ 0x6ADD93AB;
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    n3 -= 2;
                                                                                                                                                    n5 = n4 ^ 0xF2EA741;
                                                                                                                                                }
                                                                                                                                                catch (ArithmeticException arithmeticException) {
                                                                                                                                                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0xF2EA741));
                                                                                                                                                }
                                                                                                                                                --n3;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            int cfr_ignored_15 = Integer.rotateRight(0x49CEB10A ^ n4, 12) + -194703503;
                                                                                                                                            if (n != this.thqs_2) {
                                                                                                                                                n5 = (int)((long)(n4 ^ 0xC9DDA956) ^ 0x7C07CFF32CE145DBL ^ 0x7C07CFF32CE145DBL);
                                                                                                                                                int cfr_ignored_16 = Integer.rotateLeft(0x72B7241 ^ n4, 3) + -492800742;
                                                                                                                                                int cfr_ignored_17 = (int)(0xC599DC7C27D4EB4FL ^ (long)n4 ^ 0x4588831A2DB826E2L);
                                                                                                                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0xA11F84EA));
                                                                                                                                                n3 -= 5;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                n3 += 4;
                                                                                                                                                n5 = (n4 ^ 0x91AC7AD4) + 668202302 - 668202302;
                                                                                                                                            }
                                                                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0x91AC7AD4));
                                                                                                                                            }
                                                                                                                                            n3 += 5;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        int cfr_ignored_18 = Integer.rotateLeft(0xD2083104 ^ n4, 13) - 1935380151;
                                                                                                                                        this.ghb = false;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    int cfr_ignored_19 = Integer.rotateRight(0xE7B15D22 ^ n4, 15) + 316139097;
                                                                                                                                    this.ghb = false;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                int cfr_ignored_20 = Integer.rotateLeft(0xE2556F45 ^ n4, 15) - 1823873174;
                                                                                                                                int cfr_ignored_21 = (int)(0x20E7C17827D4EB4FL ^ (long)n4 ^ 0x7F80831A2DB9EC1EL);
                                                                                                                                ths.mc.field_1724.method_31548().field_7545 = n2;
                                                                                                                                this.thqs_2 = n2;
                                                                                                                                n5 = (n4 ^ 0xAB6AA601) + -396304416 - -396304416;
                                                                                                                                int cfr_ignored_22 = Integer.rotateLeft(0xD07123AD ^ n4, 13) - 1108406574;
                                                                                                                                int cfr_ignored_23 = (int)(0x12C38D9027D4EB4FL ^ (long)n4 ^ 0xE650831A2DB98856L);
                                                                                                                                n5 = n4 ^ 0x942D1A9 ^ 0xB4F84936 ^ 0xB4F84936;
                                                                                                                                n3 -= 2;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_24 = (Integer.rotateRight(0xA483D29F ^ n4, 7) - -262922116) * -1534864737;
                                                                                                                            this.ghb = true;
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        int cfr_ignored_25 = (Integer.rotateLeft(0x949AFAD5 ^ n4, 5) - 52559622) * -1801782571;
                                                                                                                        int cfr_ignored_26 = (int)(0x562854E827D4EB4FL ^ (long)n4 ^ 0x54A0831A2DB90181L);
                                                                                                                        if (n2 != n) {
                                                                                                                            try {
                                                                                                                                n3 += 3;
                                                                                                                                if ((0xD90C9071B50001B3L ^ (long)n4 | 1L) == 0L) {
                                                                                                                                    throw new ArithmeticException();
                                                                                                                                }
                                                                                                                                n5 = n4 ^ 0xE379A311 ^ 0xD5C05069 ^ 0xD5C05069;
                                                                                                                            }
                                                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                                                n5 = n4 ^ 0xE379A311;
                                                                                                                            }
                                                                                                                            n3 -= 2;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        n5 = Integer.reverse(Integer.reverse(n4 ^ 0x561A43EF));
                                                                                                                        int cfr_ignored_27 = (Integer.rotateLeft(0x5D644DF4 ^ n4, 14) - 1401098183) * 1566854645;
                                                                                                                        n5 = n4 ^ 0x942D1A9;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_28 = (Integer.rotateLeft(0xCDC1ACD0 ^ n4, 12) + -288256917) * -842945327;
                                                                                                                    this.thkhkh = n;
                                                                                                                    this.thqs_2 = n;
                                                                                                                    n5 = n4 ^ 0xF2EA741 ^ 0x7547ECA ^ 0x7547ECA;
                                                                                                                    int cfr_ignored_29 = (Integer.rotateLeft(0x9DD4CED5 ^ n4, 6) - 555920134) * -1646997803;
                                                                                                                    int cfr_ignored_30 = (int)(0x5F6660E827D4EB4FL ^ (long)n4 ^ 0x3CA0831A2DB9131DL);
                                                                                                                    --n3;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_31 = (Integer.rotateRight(0xC920D397 ^ n4, 12) - 1599553156) * -920595561;
                                                                                                                if (!ths.mc.field_1724.method_7337()) {
                                                                                                                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0x23F36BAB));
                                                                                                                    n3 += 3;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                n5 = n4 ^ 0xABF4FF4;
                                                                                                                int cfr_ignored_32 = Integer.rotateRight(0xB3E061A3 ^ n4, 9) + -863407624;
                                                                                                                n5 = (int)((long)(n4 ^ 0xB2598C8F) ^ 0xDD81CF9C89A4C764L ^ 0xDD81CF9C89A4C764L);
                                                                                                                n3 -= 4;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_33 = Integer.rotateRight(0xDEB2DFC6 ^ n4, 14) - -66668491;
                                                                                                            if (this.thkhkh != -1) {
                                                                                                                n5 = (n4 ^ 0xB137AE22) + 246724864 - 246724864;
                                                                                                                int cfr_ignored_34 = (Integer.rotateLeft(0xAB883B1C ^ n4, 8) - -908277857) * -1417135331;
                                                                                                                n5 = (n4 ^ 0x4F76E0D0) + -1876000728 - -1876000728;
                                                                                                                --n3;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_35 = (int)(0xA960962A19A880FFL ^ (long)n4 ^ 0xD124FFE2FAD8FF10L);
                                                                                                            n5 = n4 ^ 0xA11F84EA;
                                                                                                            n3 += 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_36 = Integer.rotateRight(0x46B212CB ^ n4, 11) + -1813125680;
                                                                                                        bl = ths.mc.field_1761.method_2923();
                                                                                                        n = ths.mc.field_1724.method_31548().field_7545;
                                                                                                        if (!bl) {
                                                                                                            n5 = (int)((long)(n4 ^ 0x2DC91931) ^ 0xA26275C099AA623DL ^ 0xA26275C099AA623DL);
                                                                                                            int cfr_ignored_37 = Integer.rotateRight(0x6B1E12F ^ n4, 3) - -739777556;
                                                                                                            n5 = (n4 ^ 0xF2EA741) + -1706323959 - -1706323959;
                                                                                                            n3 -= 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        n5 = (int)((long)(n4 ^ 0xF0435C75) ^ 0x5871B253683C67C8L ^ 0x5871B253683C67C8L);
                                                                                                        int cfr_ignored_38 = (Integer.rotateLeft(0x8EFDA590 ^ n4, 4) + 1427418027) * -1895979631;
                                                                                                        n5 = (n4 ^ 0xDC824AC8) + -1604691538 - -1604691538;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_39 = Integer.rotateLeft(0xBCAFCE80 ^ n4, 10) + -576216901;
                                                                                                    n2 = this.szr_3();
                                                                                                    if (n2 != -1) {
                                                                                                        try {
                                                                                                            n5 = (n4 ^ 0x40957EC3) + -308373976 - -308373976;
                                                                                                        }
                                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                            n5 = (n4 ^ 0x40957EC3) + -96408380 - -96408380;
                                                                                                        }
                                                                                                        n3 += 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    n5 = (n4 ^ 0xA3040845) + -1337093244 - -1337093244;
                                                                                                    int cfr_ignored_40 = (Integer.rotateRight(0xE58A337E ^ n4, 15) - -803611779) * -443927681;
                                                                                                    n5 = (n4 ^ 0x942D1A9) + 2139278642 - 2139278642;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_41 = (Integer.rotateLeft(0xBF53CB94 ^ n4, 10) - 797132327) * -1085027435;
                                                                                                if (ths.mc.field_1724 != null) {
                                                                                                    int cfr_ignored_42 = (int)(0x5A444C99082BC59FL ^ (long)n4 ^ 0x6442DCE470191959L);
                                                                                                    n5 = (n4 ^ 0x36000841) + 1726806376 - 1726806376;
                                                                                                    continue;
                                                                                                }
                                                                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0xB2598C8F));
                                                                                                int cfr_ignored_43 = Integer.rotateRight(0xE1B8846 ^ n4, 4) - -1179443275;
                                                                                                n3 += 3;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_44 = (Integer.rotateLeft(0xEEF899FD ^ n4, 16) - -193444642) * -285697539;
                                                                                            int cfr_ignored_45 = (int)(0x2C4A37C027D4EB4FL ^ (long)n4 ^ 0x92F0831A2DB9F545L);
                                                                                            if (ths.mc.field_1687 == null) {
                                                                                                try {
                                                                                                    if ((0x5A3ECF56F061B683L ^ (long)n4 | 1L) == 0L) {
                                                                                                        throw new ArithmeticException();
                                                                                                    }
                                                                                                    n5 = (n4 ^ 0xB2598C8F) + 1601596297 - 1601596297;
                                                                                                }
                                                                                                catch (ArithmeticException arithmeticException) {
                                                                                                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0xB2598C8F));
                                                                                                }
                                                                                                n3 -= 3;
                                                                                                continue;
                                                                                            }
                                                                                            n5 = (int)((long)(n4 ^ 0x9A4B144E) ^ 0xAF7BEA972567AC9L ^ 0xAF7BEA972567AC9L);
                                                                                            int cfr_ignored_46 = Integer.rotateLeft(0x475C4228 ^ n4, 11) + -1467375085;
                                                                                            n3 -= 2;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_47 = Integer.rotateRight(0x5ED67F86 ^ n4, 14) - -2141777803;
                                                                                        if (ths.mc.field_1761 == null) {
                                                                                            try {
                                                                                                if ((0xE79C9C0C0E097CC3L ^ (long)n4 | 1L) == 0L) {
                                                                                                    throw new IllegalArgumentException();
                                                                                                }
                                                                                                n5 = (int)((long)(n4 ^ 0xB2598C8F) ^ 0x9C4672AEBD58E7C8L ^ 0x9C4672AEBD58E7C8L);
                                                                                            }
                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                n5 = (int)((long)(n4 ^ 0xB2598C8F) ^ 0x4F363B00BE2F846AL ^ 0x4F363B00BE2F846AL);
                                                                                            }
                                                                                            n3 += 2;
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            n3 -= 3;
                                                                                            if ((0x217EDAAE3BB1B831L ^ (long)n4 | 1L) == 0L) {
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            n5 = n4 ^ 0xAC7D5AD;
                                                                                        }
                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                            n5 = n4 ^ 0xAC7D5AD ^ 0xA36EDCEB ^ 0xA36EDCEB;
                                                                                        }
                                                                                        n3 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_48 = (Integer.rotateRight(0x34608633 ^ n4, 9) + 1544413032) * 878741043;
                                                                                    ths.mc.field_1724.method_31548().field_7545 = this.thkhkh;
                                                                                    this.jzy_2();
                                                                                    this.ghb = false;
                                                                                    return;
                                                                                }
                                                                                int cfr_ignored_49 = (Integer.rotateLeft(0xC4BA657C ^ n4, 11) - -688920257) * -994417283;
                                                                                ths.mc.field_1724.method_31548().field_7545 = this.thkhkh;
                                                                                this.jzy_2();
                                                                                this.ghb = false;
                                                                                return;
                                                                            }
                                                                            int cfr_ignored_50 = (Integer.rotateLeft(0xCC0D989D ^ n4, 12) - -1174201794) * -871524195;
                                                                            int cfr_ignored_51 = (int)(0xEBF36A027D4EB4FL ^ (long)n4 ^ 0x9030831A2DB9B0AFL);
                                                                            if (!this.khzb_2.shzl()) {
                                                                                try {
                                                                                    n3 -= 5;
                                                                                    if ((0x55B620DFED458B7L ^ (long)n4 | 1L) == 0L) {
                                                                                        throw new NoSuchElementException();
                                                                                    }
                                                                                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0xA11F84EA));
                                                                                }
                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                    n5 = (n4 ^ 0xA11F84EA) + 219058963 - 219058963;
                                                                                }
                                                                                n3 -= 3;
                                                                                continue;
                                                                            }
                                                                            n5 = n4 ^ 0x248DE6D9 ^ 0xFACEBDDF ^ 0xFACEBDDF;
                                                                            int cfr_ignored_52 = (Integer.rotateRight(0x6881E492 ^ n4, 16) + -1407693591) * 1753343123;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_53 = Integer.rotateRight(0x12BE832B ^ n4, 5) + 1232044400;
                                                                        if (!bl) {
                                                                            n5 = (int)((long)(n4 ^ 0x2F34B7EB) ^ 0xFC41CC0BDA957419L ^ 0xFC41CC0BDA957419L);
                                                                            int cfr_ignored_54 = (Integer.rotateRight(0xA1134ADE ^ n4, 7) - -2051821539) * -1592571169;
                                                                            n3 += 2;
                                                                            continue;
                                                                        }
                                                                        n5 = (n4 ^ 0x3A78066B) + 1875448046 - 1875448046;
                                                                        --n3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_55 = (Integer.rotateRight(0x3BA3C87E ^ n4, 10) - 1026745981) * 1000589439;
                                                                    if (!bl) {
                                                                        n5 = (int)((long)(n4 ^ 0x5FA87334) ^ 0xDE883C3D17C505E5L ^ 0xDE883C3D17C505E5L);
                                                                        int cfr_ignored_56 = Integer.rotateLeft(0x3077F228 ^ n4, 9) + -488377837;
                                                                        n3 -= 5;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        ++n3;
                                                                        if ((0xB7259EB1632465A7L ^ (long)n4 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n5 = (n4 ^ 0xA11F84EA) + -1216002572 - -1216002572;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n5 = (int)((long)(n4 ^ 0xA11F84EA) ^ 0xF53880D60CCE0505L ^ 0xF53880D60CCE0505L);
                                                                    }
                                                                    n3 += 3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_57 = (Integer.rotateRight(0x2E81A6D7 ^ n4, 8) - -1508846780) * 780248791;
                                                                n5 = n4 ^ 0xCE47461D ^ 0x82737079 ^ 0x82737079;
                                                                int cfr_ignored_58 = (Integer.rotateRight(0x290EE01B ^ n4, 8) + -47529344) * 688840731;
                                                                int cfr_ignored_59 = (int)(0x6D8D2DE2056FE358L ^ (long)n4 ^ 0xA6B4C66C3D9776CBL);
                                                                n5 = (n4 ^ 0x3351E5D3) + -707480837 - -707480837;
                                                                int cfr_ignored_60 = (int)(0x7A94EFFB18ED200AL ^ (long)n4 ^ 0x2286FD69BB3358F8L);
                                                                n5 = n4 ^ 0x50670161;
                                                                continue;
                                                            }
                                                            int cfr_ignored_61 = Integer.rotateRight(0x8A6CB94B ^ n4, 4) + -947384496;
                                                            n5 = (int)((long)(n4 ^ 0x43F5E869) ^ 0x2F69773506001C3FL ^ 0x2F69773506001C3FL);
                                                            int cfr_ignored_62 = (Integer.rotateRight(0x2E5FCDFB ^ n4, 8) + -1577611104) * 778030587;
                                                            n5 = (int)((long)(n4 ^ 0x50670161) ^ 0xB1EEC5FEB76A0B7DL ^ 0xB1EEC5FEB76A0B7DL);
                                                            continue;
                                                        }
                                                        int cfr_ignored_63 = Integer.rotateLeft(0xC7506140 ^ n4, 11) + 655975931;
                                                        n5 = (n4 ^ 0xF864E2EC) + -548392720 - -548392720;
                                                        int cfr_ignored_64 = Integer.rotateRight(0xD0D7F07 ^ n4, 4) - -1728052972;
                                                        n5 = (n4 ^ 0xCD501F71) + -545071339 - -545071339;
                                                        int cfr_ignored_65 = (Integer.rotateLeft(0xC4BC8479 ^ n4, 11) + -684611102) * -994278279;
                                                        int cfr_ignored_66 = (int)(0x60E2A4427D4EB4FL ^ (long)n4 ^ 0xA9F8831A2DB9A1CDL);
                                                        n5 = (n4 ^ 0x50670161) + 1110828612 - 1110828612;
                                                        n3 -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_67 = (Integer.rotateRight(0x5F04379B ^ n4, 14) + -2048894208) * 1594111899;
                                                    n5 = n4 ^ 0xE2AEE81A;
                                                    int cfr_ignored_68 = (Integer.rotateRight(0x127B835B ^ n4, 5) + 1095927616) * 310084443;
                                                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0x50670161));
                                                    int cfr_ignored_69 = Integer.rotateRight(0x6C4AD827 ^ n4, 16) - 560843764;
                                                    continue;
                                                }
                                                int cfr_ignored_70 = Integer.rotateRight(0xD0607D82 ^ n4, 13) + 1074582009;
                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0x4913D309));
                                                int cfr_ignored_71 = Integer.rotateRight(0xCA51860F ^ n4, 12) - -2076386548;
                                                n5 = n4 ^ 0x50670161;
                                                continue;
                                            }
                                            int cfr_ignored_72 = (Integer.rotateLeft(0xE30A4E78 ^ n4, 15) + -2103631933) * -485863815;
                                            int cfr_ignored_73 = (int)(0xB06EADC4BCA660A6L ^ (long)n4 ^ 0xA6F9B5FF3A6ACD0CL);
                                            n5 = Integer.reverse(Integer.reverse(n4 ^ 0x9719767F));
                                            int cfr_ignored_74 = (int)(0x1A6644FD8164BF3DL ^ (long)n4 ^ 0x748BCE7A855D991DL);
                                            n5 = n4 ^ 0x50670161;
                                            continue;
                                        }
                                        int cfr_ignored_75 = (Integer.rotateRight(0xAB10F4B6 ^ n4, 8) - -1150598843) * -1424952137;
                                        try {
                                            n5 = n4 ^ 0x50670161;
                                        }
                                        catch (NoSuchElementException noSuchElementException) {
                                            n5 = (n4 ^ 0x50670161) + 1763107478 - 1763107478;
                                        }
                                        n3 -= 2;
                                        continue;
                                    }
                                    int cfr_ignored_76 = (Integer.rotateRight(0xDC3ED776 ^ n4, 14) - -1342589307) * -599861385;
                                    n5 = n4 ^ 0xC5C87956 ^ 0x4F032278 ^ 0x4F032278;
                                    int cfr_ignored_77 = Integer.rotateLeft(0x44DCCDCC ^ n4, 11) - 1528466159;
                                    try {
                                        n3 -= 3;
                                        n5 = (n4 ^ 0x50670161) + -1617422447 - -1617422447;
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        n5 = n4 ^ 0x50670161;
                                    }
                                    n3 -= 3;
                                    continue;
                                }
                                int cfr_ignored_78 = (Integer.rotateRight(0x45689B77 ^ n4, 11) - 1812492964) * 1164483447;
                                int cfr_ignored_79 = (int)(0x3DE79AA191CA240FL ^ (long)n4 ^ 0xC833EF27B339D61EL);
                                n5 = n4 ^ 0x50670161 ^ 0xE45B0E59 ^ 0xE45B0E59;
                                continue;
                            }
                            int cfr_ignored_80 = (Integer.rotateLeft(0x47E633F1 ^ n4, 11) + -1187124886) * 1206268913;
                            int cfr_ignored_81 = (int)(0x85549DCC27D4EB4FL ^ (long)n4 ^ 0xC6E8831A2DB8A778L);
                            n5 = n4 ^ 0x76985E52 ^ 0x1C3BCF7 ^ 0x1C3BCF7;
                            int cfr_ignored_82 = (Integer.rotateRight(0x2F8CCBBA ^ n4, 8) + -966112575) * 797756347;
                            try {
                                if ((0xF1A92967515AED49L ^ (long)n4 | 1L) == 0L) {
                                    throw new ArithmeticException();
                                }
                                n5 = (n4 ^ 0x50670161) + -1894179871 - -1894179871;
                            }
                            catch (ArithmeticException arithmeticException) {
                                n5 = (n4 ^ 0x50670161) + -42776393 - -42776393;
                            }
                            n3 += 3;
                            continue;
                        }
                        int cfr_ignored_83 = Integer.rotateRight(0x7A71622A ^ n4, 18) + -669482415;
                        n5 = Integer.reverse(Integer.reverse(n4 ^ 0x52EA383C));
                        int cfr_ignored_84 = (Integer.rotateLeft(0x4C324FFD ^ n4, 12) - 1047875294) * 1278365693;
                        int cfr_ignored_85 = (int)(0x8E80E1C027D4EB4FL ^ (long)n4 ^ 0x3EF0831A2DB8B0D0L);
                        try {
                            n3 -= 2;
                            if ((0xE2443CC2F2C6771FL ^ (long)n4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n5 = (int)((long)(n4 ^ 0x50670161) ^ 0xCFF202C50D8EFB9CL ^ 0xCFF202C50D8EFB9CL);
                        }
                        catch (IllegalStateException illegalStateException) {
                            n5 = n4 ^ 0x50670161 ^ 0x7FAFA6CF ^ 0x7FAFA6CF;
                        }
                        n3 += 5;
                        continue;
                    }
                    int cfr_ignored_86 = Integer.rotateLeft(0x7D8D84D ^ n4, 3) - -140521330;
                    int cfr_ignored_87 = (int)(0xC56A767027D4EB4FL ^ (long)n4 ^ 0x1190831A2DB82705L);
                    int cfr_ignored_88 = (int)(0x14DF0015182EABBAL ^ (long)n4 ^ 0xFD5AFCEEAC53846FL);
                    n5 = (n4 ^ 0x491AEE89) + -680871034 - -680871034;
                    int cfr_ignored_89 = (int)(0xD7E9E353EF5AB140L ^ (long)n4 ^ 0x3BD7120699A60202L);
                    n5 = (int)((long)(n4 ^ 0x50670161) ^ 0x11C1852B16735997L ^ 0x11C1852B16735997L);
                    n3 -= 3;
                    continue;
                }
                int cfr_ignored_90 = Integer.rotateRight(0x2A578CEE ^ n4, 8) - 620212237;
                int cfr_ignored_91 = (int)(0xF609774D4FC2E9EAL ^ (long)n4 ^ 0x13EA533628F241C3L);
                n5 = n4 ^ 0x50670161;
                n3 -= 3;
                continue;
            }
            int cfr_ignored_92 = (Integer.rotateLeft(0xAE7580D4 ^ n4, 8) - 613955815) * -1368031019;
            n5 = n4 ^ 0x50670161 ^ 0xB6C11174 ^ 0xB6C11174;
        }
    }

    private static String shjb(String string, int n, int n2, int n3) {
        int n4 = 872352844;
        n4 = Integer.rotateLeft(n4 * -20264233, 24) ^ 0xDE22C321;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0x3FC3BAE6;
        if ((n5 ^ n4) != 1069791974) {
            int cfr_ignored_0 = (0xC3CB6AA ^ n4) - -26416012;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x97E7AE6F) + i ^ zmt, 3) ^ n2 + fr));
        }
        return new String(cArray);
    }

    private static void dqs(ths ths2) {
        int n = -1625645282;
        n = Integer.rotateLeft(n * 644797701, 28) ^ 0x667AB5D4;
        ths ths3 = ths2;
        n = Integer.rotateLeft((ths3 != null ? System.identityHashCode(ths3) : 0) ^ n, 14);
        int n2 = n ^ 0xCAF66E2E;
        if ((n2 ^ n) != -889819602) {
            int cfr_ignored_0 = (0x55ECF130 ^ n) + 1791434227;
        }
        ths2.jzy_2();
    }

    private static class_2680 tlm_2(class_638 class_6382, class_2338 class_23382) {
        block0: {
            int n = 1985211760;
            n = Integer.rotateLeft(n * -943833391, 21) ^ 0x450836E1;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x536644;
            if ((n2 ^ n) == 5465668) break block0;
            int cfr_ignored_0 = (0x76008B34 ^ n) - -1414475628;
        }
        return class_6382.method_8320(class_23382);
    }

    private static class_1661 tlt_4(class_746 class_7462) {
        block0: {
            int n = dz_3.shjk(608329189);
            int n2 = n ^ 0xC9A5F785;
            if ((n2 ^ n) == -911870075) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEDE7AA60 ^ n, 16) + -747945765;
        }
        return class_7462.method_31548();
    }

    private static String[] hdk_2(String string) {
        block0: {
            int n = 2066854398;
            int n2 = (n = Integer.rotateLeft(n * -1141507547, 5) ^ 0xB911602E) ^ 0x13987C41;
            if ((n2 ^ n) == 328760385) break block0;
            int cfr_ignored_0 = (0x68A9CDBF ^ n) + -353737700;
        }
        return string.split("\u0001\u001a", -1);
    }

    private static CallSite htb_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1128479218;
            n3 = Integer.rotateLeft(n3 * 807017045, 12) ^ 0x704D61E8;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 2);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 22);
            int n4 = n3 ^ 0xFF5A95E6;
            if ((n4 ^ n3) != -10840602) {
                int cfr_ignored_0 = (0xBC19AC14 ^ n3) + 631839023;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhyb ^ string.hashCode()) + (n2 + saw) + i ^ dhyb, 19) + saw);
            }
            String[] stringArray = ths.hdk_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] zm0r0lxfz(String string) {
        return string.split("\b\u001e", -1);
    }

    private static CallSite praegtqj0w7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ nmsupnlzoi ^ string.hashCode() ^ n2 + jwamxdjr1 ^ i * 1937289981 ^ nmsupnlzoi, 18) ^ jwamxdjr1));
            }
            String[] stringArray = ths.zm0r0lxfz(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

