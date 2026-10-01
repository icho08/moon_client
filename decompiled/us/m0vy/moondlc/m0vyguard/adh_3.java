/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2680
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bsth_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byl;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ya_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="XRay", category=bzw.OTHER, desc="Allows you to see ores through walls")
public class adh_3
extends bnq {
    private static adh_3 btha_2;
    private final byl aq = new byl(this, "Blocks");
    private final badh_2 dfth = new badh_2(this, "Cave Air").bts(true);
    private final tay zz_2 = new tay(this, "Refresh").shth_7(Float.intBitsToFloat(583402838 + 548666026)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1034111704) ^ 0x51317A43)).rkh_3(Float.intBitsToFloat(0x706FF189 ^ 0x3315F189)).ssd_5(Float.intBitsToFloat(0x83CE7F79 ^ 0xC7B47F79));
    private long sjd_2;
    private boolean dhmk;
    private final bql<ya_2> brz = this::rdgh_2;
    private static final int khsz_2 = 217340925;
    private static final int jnk = -1270234396;
    private static final int thyn = 666407653;
    private static final int zrw = -99397901;
    private static final int puvicef2me = 855733800;
    private static final int u0v2nsb2w = 159577919;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int eb2opqp0;

    public static adh_3 hta_4() {
        block0: {
            int n = -374193016;
            int n2 = (n = Integer.rotateLeft(n * -1419163165, 8) ^ 0xC0A9BD7F) ^ 0xA1FC68C0;
            if ((n2 ^ n) == -1577293632) break block0;
            int cfr_ignored_0 = (0x484E2C48 ^ n) - 139012447;
        }
        return btha_2;
    }

    public adh_3() {
        btha_2 = this;
        class_2248[] class_2248Array = new class_2248[197504102 + -197504081];
        class_2248Array[0] = class_2246.field_10442;
        class_2248Array[1] = class_2246.field_29029;
        class_2248Array[2] = class_2246.field_22109;
        class_2248Array[3] = class_2246.field_10013;
        class_2248Array[4] = class_2246.field_29220;
        class_2248Array[5] = class_2246.field_10571;
        class_2248Array[0x168881D3 ^ 0x168881D5] = class_2246.field_29026;
        class_2248Array[0x1A5B490 ^ 0x1A5B497] = class_2246.field_10212;
        class_2248Array[-349715150 + 349715158] = class_2246.field_29027;
        class_2248Array[Integer.reverse((int)1766736759) ^ 0xEEC2729F] = class_2246.field_10090;
        class_2248Array[1448557375 + -1448557365] = class_2246.field_29028;
        class_2248Array[Integer.rotateLeft((int)(0xFFE0E1B7 ^ 0xA7E0E1B7), (int)5)] = class_2246.field_10080;
        class_2248Array[Integer.reverse((int)-887603135) ^ 0x820218DF] = class_2246.field_29030;
        class_2248Array[931388519 + -931388506] = class_2246.field_10418;
        class_2248Array[Integer.reverse((int)-1789667313) ^ 0xF01BCAA7] = class_2246.field_29219;
        class_2248Array[-437166533 - -437166548] = class_2246.field_27120;
        class_2248Array[Integer.reverse((int)525228498) ^ 0x4B9A72E8] = class_2246.field_29221;
        class_2248Array[1185437572 - 1185437555] = class_2246.field_10260;
        class_2248Array[420169546 + -420169528] = class_2246.field_10034;
        class_2248Array[1680969206 - 1680969187] = class_2246.field_10443;
        class_2248Array[-706743330 + 706743350] = class_2246.field_10380;
        this.aq.zz_2(class_2248Array);
    }

    @Override
    public void nt() {
        try {
            int n = 738604810;
            n = Integer.rotateLeft(n * -1061701677, 23) ^ 0x832AC81;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB208CDC1;
            if ((n2 ^ n) != -1308045887) {
                int cfr_ignored_0 = (0x9E0EFACB ^ n) - -1997599971;
            }
            if ((0x366 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        this.dhmk = true;
        this.sjd_2 = 0L;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = -1521312427;
        var1_2 = Integer.rotateLeft(var1_2 * 863427949, 11) ^ -1243735361;
        var1_2 = Integer.rotateLeft(System.identityHashCode(this) ^ var1_2, 27);
        var2_3 = (var1_2 ^ 2102498901) + -932490915 - -932490915;
        while (true) {
            block34: {
                block38: {
                    block35: {
                        block32: {
                            block40: {
                                block39: {
                                    block37: {
                                        block33: {
                                            block31: {
                                                block29: {
                                                    block41: {
                                                        block30: {
                                                            block36: {
                                                                var3_1 = var2_3 ^ var1_2;
                                                                switch (var3_1 & 7) {
                                                                    case 1: {
                                                                        if (var3_1 == -1611382471) break block29;
                                                                        if (var3_1 != -854810175) {
                                                                            ** break;
                                                                        }
                                                                        break block30;
                                                                    }
                                                                    case 2: {
                                                                        if (var3_1 != -579251958) {
                                                                            ** break;
                                                                        }
                                                                        break block31;
                                                                    }
                                                                    case 3: {
                                                                        if (var3_1 != -1214442845) {
                                                                            ** break;
                                                                        }
                                                                        break block32;
                                                                    }
                                                                    case 5: {
                                                                        if (var3_1 == -2130217611) break block33;
                                                                        if (var3_1 == -126539355) break block34;
                                                                        if (var3_1 == 1517833013) break block35;
                                                                        if (var3_1 == 1040360973) break block36;
                                                                        if (var3_1 == 2102498901) break;
                                                                        if (var3_1 != 1943121061) {
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 6: {
                                                                        if (var3_1 != 1694193278) {
                                                                            ** break;
                                                                        }
                                                                        break block38;
                                                                    }
                                                                    case 7: {
                                                                        if (var3_1 == 1599710807) break block39;
                                                                        if (var3_1 == -995490441) break block40;
                                                                        if (var3_1 != 694996895) {
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                }
                                                                Integer.rotateLeft(820582728 ^ var1_2, 9) + -258494733;
                                                                if (adh_3.jhr_2()) {
                                                                    try {
                                                                        var3_1 -= 2;
                                                                        if ((7525152506439689783L ^ (long)var1_2 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 1040360973));
                                                                    }
                                                                    catch (IllegalArgumentException v0) {
                                                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 1040360973));
                                                                    }
                                                                    var3_1 += 4;
                                                                    continue;
                                                                }
                                                                (int)(6993239836832173335L ^ (long)var1_2 ^ 601250684541169608L);
                                                                var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -1168076392));
                                                                (int)(-8184783236385213285L ^ (long)var1_2 ^ 7166638694480261378L);
                                                                var2_3 = (var1_2 ^ -854810175) + -240317231 - -240317231;
                                                                var3_1 += 4;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(456748835 ^ var1_2, 6) + 1347556472;
                                                            this.dhmk = true;
                                                            this.azl();
                                                            return;
                                                        }
                                                        Integer.rotateLeft(358571560 ^ var1_2, 5) + -1695939053;
                                                        yf.athz_2();
                                                        throw null;
                                                    }
                                                    Integer.rotateRight(528403495 ^ var1_2, 6) - -726116364;
                                                    try {
                                                        if ((-5562664961865228749L ^ (long)var1_2 | 1L) == 0L) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 2102498901));
                                                    }
                                                    catch (NoSuchElementException v1) {
                                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 2102498901));
                                                    }
                                                    var3_1 -= 5;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1014498943 ^ var1_2, 10) - 1457940636) * 1014498943;
                                                var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 1565310252));
                                                Integer.rotateRight(-105658261 ^ var1_2, 18) + 1092805680;
                                                try {
                                                    var3_1 -= 2;
                                                    var2_3 = (var1_2 ^ 2102498901) + 368920198 - 368920198;
                                                }
                                                catch (IllegalArgumentException v2) {
                                                    var2_3 = (var1_2 ^ 2102498901) + 64711551 - 64711551;
                                                }
                                                continue;
                                            }
                                            (Integer.rotateLeft(1957941053 ^ var1_2, 17) - 639874974) * 1957941053;
                                            (int)(-5331873830533797041L ^ (long)var1_2 ^ 4571297770240524755L);
                                            var2_3 = (int)((long)(var1_2 ^ 1651200805) ^ 8643002878861656199L ^ 8643002878861656199L);
                                            (Integer.rotateRight(-2049564450 ^ var1_2, 3) - 961255965) * -2049564449;
                                            (int)(7017587312988252928L ^ (long)var1_2 ^ 686017551941463831L);
                                            var2_3 = var1_2 ^ 2102498901;
                                            --var3_1;
                                            continue;
                                        }
                                        (Integer.rotateRight(-567313669 ^ var1_2, 14) + -333610080) * -567313669;
                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 1175460026));
                                        Integer.rotateRight(-912933206 ^ var1_2, 12) + 1837086161;
                                        (int)(7731290570729943565L ^ (long)var1_2 ^ -2094319043342402745L);
                                        var2_3 = var1_2 ^ 2102498901 ^ -2068805668 ^ -2068805668;
                                        var3_1 += 4;
                                        continue;
                                    }
                                    Integer.rotateRight(-995266901 ^ var1_2, 11) + -715258384;
                                    var2_3 = var1_2 ^ -340035502;
                                    Integer.rotateLeft(-1401746944 ^ var1_2, 8) + -431237829;
                                    var2_3 = (int)((long)(var1_2 ^ -30431971) ^ -4003357599121299747L ^ -4003357599121299747L);
                                    (Integer.rotateRight(1641453243 ^ var1_2, 15) + -581312544) * 1641453243;
                                    var2_3 = var1_2 ^ 2102498901;
                                    var3_1 -= 5;
                                    continue;
                                }
                                Integer.rotateRight(-2145394749 ^ var1_2, 3) + -2009483304;
                                var2_3 = (int)((long)(var1_2 ^ -781088564) ^ -6124362243857350957L ^ -6124362243857350957L);
                                (Integer.rotateLeft(-471418212 ^ var1_2, 15) - -1655818209) * -471418211;
                                var2_3 = (var1_2 ^ 2102498901) + 1054956000 - 1054956000;
                                var3_1 -= 3;
                                continue;
                            }
                            (Integer.rotateRight(-380098597 ^ var1_2, 16) + 1175089856) * -380098597;
                            var2_3 = var1_2 ^ -52189999;
                            (Integer.rotateLeft(1767094393 ^ var1_2, 16) + -981404190) * 1767094393;
                            (int)(-6061539141482124465L ^ (long)var1_2 ^ -3316756977098884589L);
                            try {
                                ++var3_1;
                                if ((-5282239771066847923L ^ (long)var1_2 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var2_3 = var1_2 ^ 2102498901 ^ -1827451314 ^ -1827451314;
                            }
                            catch (NoSuchElementException v3) {
                                var2_3 = (var1_2 ^ 2102498901) + -1108502841 - -1108502841;
                            }
                            var3_1 += 5;
                            continue;
                        }
                        (Integer.rotateRight(-289905677 ^ var1_2, 16) + -323896920) * -289905677;
                        var2_3 = var1_2 ^ 2102498901;
                        Integer.rotateLeft(-1502341500 ^ var1_2, 7) - 745298231;
                        var3_1 += 4;
                        continue;
                    }
                    Integer.rotateLeft(509281992 ^ var1_2, 6) + -1318882957;
                    var2_3 = (var1_2 ^ 1734339149) + -938073205 - -938073205;
                    (Integer.rotateRight(-1601110633 ^ var1_2, 7) - 1978422404) * -1601110633;
                    var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 2102498901));
                    (Integer.rotateRight(883852314 ^ var1_2, 9) + 1702862433) * 883852315;
                    ++var3_1;
                    continue;
                }
                (Integer.rotateLeft(-24673551 ^ var1_2, 18) + -691635606) * -24673551;
                (int)(4338423071394556751L ^ (long)var1_2 ^ -6563852308432955973L);
                var2_3 = var1_2 ^ 1640406120;
                (Integer.rotateRight(-715289381 ^ var1_2, 13) + -625889856) * -715289381;
                try {
                    var3_1 += 4;
                    var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 2102498901));
                }
                catch (UnsupportedOperationException v4) {
                    var2_3 = (var1_2 ^ 2102498901) + 2136279714 - 2136279714;
                }
                var3_1 -= 3;
                continue;
            }
            Integer.rotateLeft(1028798880 ^ var1_2, 10) + 1901238683;
            (int)(8225130125263577156L ^ (long)var1_2 ^ -1298536608077756006L);
            var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 2102498901));
            var3_1 -= 2;
            continue;
lbl204:
            // 7 sources

            Integer.rotateRight(1549581378 ^ var1_2, 14) + 865626937;
            var2_3 = (int)((long)(var1_2 ^ 2102498901) ^ -220125633796823740L ^ -220125633796823740L);
        }
    }

    public boolean rshq(class_2680 class_26802) {
        if (!this.rgha_2() || class_26802 == null) {
            return true;
        }
        if (class_26802.method_26215()) {
            return this.dfth.shzl();
        }
        return this.aq.rdhf(class_26802.method_26204());
    }

    public boolean hthy() {
        return this.rgha_2();
    }

    private void azl() {
        int n = 0;
        int n2 = 726986585;
        n2 = Integer.rotateLeft(n2 * 163927127, 10) ^ 0x2336C534;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 13);
        int n3 = -757402713 + n2;
        block33: while (true) {
            switch (n3 - n2) {
                case -757402713: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x87DE6C32 ^ n2, 3) + 2018294089) * -2015466445;
                    if (!adh_3.dbf()) {
                        try {
                            n += 2;
                            if ((0x7A98175C04AD4DB5L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = (int)((long)(14723274 + n2) ^ 0x4A7998072BD86621L ^ 0x4A7998072BD86621L);
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = 14723274 + n2 ^ 0x88327DF9 ^ 0x88327DF9;
                        }
                        n -= 5;
                        continue block33;
                    }
                    try {
                        n += 4;
                        if ((0xE235AC570B651D0DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = 1685325762 + n2 ^ 0xD30587CF ^ 0xD30587CF;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = 1685325762 + n2 + 2081567942 - 2081567942;
                    }
                    continue block33;
                }
                case -1603651648: {
                    int cfr_ignored_1 = Integer.rotateRight(0xB46871EB ^ n2, 9) + -586978640;
                    this.dhmk = false;
                    this.sjd_2 = System.currentTimeMillis();
                    return;
                }
                case 1200080812: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0x9B214039 ^ n2, 6) + -849058270) * -1692319687;
                    int cfr_ignored_3 = (int)(0x5993EE0427D4EB4FL ^ (long)n2 ^ 0x2178831A2DB91EF6L);
                    adh_3.mc.field_1769.method_3279();
                    try {
                        n -= 2;
                        if ((0xE2761CE5E5737CA1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = -1603651648 + n2;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = -1603651648 + n2 + -308879183 - -308879183;
                    }
                    n -= 3;
                    continue block33;
                }
                case 14723274: {
                    int cfr_ignored_4 = Integer.rotateRight(0xA7D2580F ^ n2, 7) - 1456883980;
                    if (adh_3.mc.field_1769 != null) {
                        n3 = Integer.reverse(Integer.reverse(-520271498 + n2));
                        int cfr_ignored_5 = Integer.rotateRight(0x1475A22A ^ n2, 5) + 2124169809;
                        n3 = (int)((long)(1200080812 + n2) ^ 0x81AFAD8F33BA5675L ^ 0x81AFAD8F33BA5675L);
                        n += 4;
                        continue block33;
                    }
                    int cfr_ignored_6 = (int)(0x57DC62EB4B2A731AL ^ (long)n2 ^ 0x38A65AE71D130269L);
                    n3 = -1603651648 + n2 + -2123004136 - -2123004136;
                    n += 5;
                    continue block33;
                }
                case 1685325762: {
                    int cfr_ignored_7 = Integer.rotateRight(0x3EBF9C0E ^ n2, 10) - -1651407635;
                    throw null;
                }
                case -1376287331: {
                    int cfr_ignored_8 = Integer.rotateLeft(0xDD79A24C ^ n2, 14) - -703052177;
                    int cfr_ignored_9 = (int)(0x8630545446BDE1BEL ^ (long)n2 ^ 0x55D841C8385AA1B1L);
                    n3 = 956382646 + n2;
                    int cfr_ignored_10 = (int)(0x617A20C7F971A019L ^ (long)n2 ^ 0xBCFF3E50BB156F25L);
                    n3 = (int)((long)(-757402713 + n2) ^ 0x603D7EAD869A9F02L ^ 0x603D7EAD869A9F02L);
                    n -= 2;
                    continue block33;
                }
                case 1682188803: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0xE9F5F931 ^ n2, 16) + 1495714858) * -369755855;
                    int cfr_ignored_12 = (int)(0x2B47570C27D4EB4FL ^ (long)n2 ^ 0x5368831A2DB9FB5FL);
                    n3 = -1313808512 + n2 ^ 0x12575432 ^ 0x12575432;
                    int cfr_ignored_13 = Integer.rotateRight(0x6D68D4CE ^ n2, 16) - 1141859373;
                    n3 = -757402713 + n2 + 1704732250 - 1704732250;
                    continue block33;
                }
                case -744256245: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x945CC0D9 ^ n2, 5) + -73860734) * -1805860647;
                    int cfr_ignored_15 = (int)(0x56EE6EE427D4EB4FL ^ (long)n2 ^ 0x20B8831A2DB9000DL);
                    n3 = -1770199920 + n2 ^ 0x78864838 ^ 0x78864838;
                    int cfr_ignored_16 = Integer.rotateRight(0x2DE2EA8F ^ n2, 8) - -1831336308;
                    int cfr_ignored_17 = (int)(0xDFEC30D6D02FFFA1L ^ (long)n2 ^ 0x9CDD6CEC04641209L);
                    n3 = 1558796342 + n2;
                    int cfr_ignored_18 = (int)(0xD0F5847259C470A1L ^ (long)n2 ^ 0xF5947F3B1A640C3AL);
                    n3 = -757402713 + n2;
                    continue block33;
                }
                case 1234080515: {
                    int cfr_ignored_19 = Integer.rotateLeft(0x5AD32D44 ^ n2, 14) - 66067063;
                    n3 = (int)((long)(1762071142 + n2) ^ 0x6C3636CE595AFC0L ^ 0x6C3636CE595AFC0L);
                    int cfr_ignored_20 = (Integer.rotateRight(0xA691E7DA ^ n2, 7) + 805876385) * -1500387365;
                    n3 = Integer.reverse(Integer.reverse(-757402713 + n2));
                    n += 2;
                    continue block33;
                }
                case -1923067641: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0xF328001D ^ n2, 17) - 1983226558) * -215482339;
                    int cfr_ignored_22 = (int)(0x319AAE2027D4EB4FL ^ (long)n2 ^ 0xA130831A2DB9CEE4L);
                    n3 = -2036373503 + n2 ^ 0x9F72DB38 ^ 0x9F72DB38;
                    int cfr_ignored_23 = Integer.rotateRight(0x3E61D54A ^ n2, 10) + -1841925327;
                    try {
                        n -= 3;
                        n3 = -757402713 + n2 ^ 0x550603F7 ^ 0x550603F7;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = -757402713 + n2;
                    }
                    n -= 5;
                    continue block33;
                }
                case -942640275: {
                    int cfr_ignored_24 = (Integer.rotateRight(0x42E64A32 ^ n2, 11) + 507550537) * 1122388531;
                    n3 = -593533100 + n2 + 525210748 - 525210748;
                    int cfr_ignored_25 = Integer.rotateLeft(0x9C114FC9 ^ n2, 6) + -361346926;
                    int cfr_ignored_26 = (int)(0x5EA3E1F427D4EB4FL ^ (long)n2 ^ 0x3E98831A2DB91096L);
                    try {
                        n += 2;
                        if ((0xC8B9DB0D5F4D1395L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-757402713 + n2));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = -757402713 + n2 ^ 0x16F2BF1D ^ 0x16F2BF1D;
                    }
                    n -= 2;
                    continue block33;
                }
                case 490751341: {
                    int cfr_ignored_27 = (Integer.rotateLeft(0x866766F0 ^ n2, 3) + 1256396363) * -2040043791;
                    try {
                        n += 3;
                        n3 = -757402713 + n2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(-757402713 + n2));
                    }
                    --n;
                    continue block33;
                }
                case -1979543378: {
                    int cfr_ignored_28 = (Integer.rotateRight(0xF46EF87F ^ n2, 17) - -1647462756) * -194054017;
                    try {
                        n += 2;
                        if ((0x5BC8F5665983F781L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = -757402713 + n2 ^ 0x4CABAAC3 ^ 0x4CABAAC3;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = -757402713 + n2;
                    }
                    n -= 4;
                    continue block33;
                }
                case -2028106860: {
                    int cfr_ignored_29 = (Integer.rotateRight(0x23F4C6DE ^ n2, 7) - 1593947165) * 603244255;
                    n3 = 2000527968 + n2;
                    int cfr_ignored_30 = (Integer.rotateRight(0x404F0D56 ^ n2, 11) - -839893851) * 1078922583;
                    int cfr_ignored_31 = (int)(0x64056FD28AD23CB3L ^ (long)n2 ^ 0x22D5D917824165DBL);
                    n3 = -757402713 + n2 ^ 0x77C6BE56 ^ 0x77C6BE56;
                    n -= 3;
                    continue block33;
                }
                case 1181441091: {
                    int cfr_ignored_32 = Integer.rotateRight(0x6BE04BCA ^ n2, 16) + 344378545;
                    n3 = Integer.reverse(Integer.reverse(1801457781 + n2));
                    int cfr_ignored_33 = Integer.rotateLeft(0x5183072C ^ n2, 13) - -482640497;
                    n3 = -757402713 + n2 ^ 0x7E5573B2 ^ 0x7E5573B2;
                    continue block33;
                }
                case -172382237: {
                    int cfr_ignored_34 = (Integer.rotateRight(0x53F9CDBE ^ n2, 13) - 798853437) * 1408880063;
                    int cfr_ignored_35 = (int)(0xE5B2F359C1ED321CL ^ (long)n2 ^ 0x1BC34F699F1E66B4L);
                    n3 = Integer.reverse(Integer.reverse(-757402713 + n2));
                    continue block33;
                }
                case -1272129887: {
                    int cfr_ignored_36 = (Integer.rotateLeft(0x10375970 ^ n2, 5) + -82742325) * 272062833;
                    n3 = (int)((long)(-1340233135 + n2) ^ 0xAB2A583436D13831L ^ 0xAB2A583436D13831L);
                    int cfr_ignored_37 = Integer.rotateRight(0x5596548A ^ n2, 13) + 1636948977;
                    n3 = -757402713 + n2 ^ 0x7EE638B6 ^ 0x7EE638B6;
                    int cfr_ignored_38 = Integer.rotateLeft(0x7F52B761 ^ n2, 18) + 1868682234;
                    int cfr_ignored_39 = (int)(0xBDE0195C27D4EB4FL ^ (long)n2 ^ 0xCFC8831A2DB8D611L);
                    n -= 5;
                    continue block33;
                }
            }
            int cfr_ignored_40 = Integer.rotateLeft(0x60BAA5A0 ^ n2, 15) + -1158173285;
            n3 = -757402713 + n2;
        }
    }

    private void rdgh_2(ya_2 ya2) {
        int n = 0;
        int n2 = 1827432350;
        n2 = Integer.rotateLeft(n2 * -687628307, 12) ^ 0x930D2A8F;
        ya_2 ya3 = ya2;
        n2 = Integer.rotateLeft((ya3 != null ? System.identityHashCode(ya3) : 0) ^ n2, 29);
        int n3 = n2 ^ 0x555975 ^ 0x1DD71BE0 ^ 0x1DD71BE0;
        block32: while (true) {
            switch (n3 ^ n2) {
                case 511000036: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x8607E9FC ^ n2, 3) - 1062401215) * -2046301699;
                    return;
                }
                case -746358798: {
                    int cfr_ignored_1 = (Integer.rotateRight(0xC645BDFF ^ n2, 11) - 114270492) * -968507905;
                    if (!((float)(System.currentTimeMillis() - this.sjd_2) < this.zz_2.thw_5())) {
                        try {
                            n += 4;
                            if ((0x4F82BD5698658A01L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = (int)((long)(n2 ^ 0x3763AC68) ^ 0x67343E5CCDF56C11L ^ 0x67343E5CCDF56C11L);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = (int)((long)(n2 ^ 0x3763AC68) ^ 0x710D0A4F1D447695L ^ 0x710D0A4F1D447695L);
                        }
                        ++n;
                        continue block32;
                    }
                    try {
                        --n;
                        n3 = n2 ^ 0x1E753DE4 ^ 0xBA31CFD5 ^ 0xBA31CFD5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x1E753DE4));
                    }
                    n -= 2;
                    continue block32;
                }
                case 929279080: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0x8CCD6770 ^ n2, 4) + 289220043) * -1932695695;
                    this.azl();
                    return;
                }
                case 0x555975: {
                    int cfr_ignored_3 = Integer.rotateRight(0x18077183 ^ n2, 6) + -314286568;
                    if (this.dhmk) {
                        int cfr_ignored_4 = (int)(0x24B723C9133CFA21L ^ (long)n2 ^ 0xBAE2EACA0F65E4BFL);
                        n3 = n2 ^ 0x3763AC68 ^ 0x6F9EEC79 ^ 0x6F9EEC79;
                        n += 2;
                        continue block32;
                    }
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x671DBF3));
                    int cfr_ignored_5 = Integer.rotateLeft(0x2C4D2E89 ^ n2, 8) + 1639334354;
                    int cfr_ignored_6 = (int)(0xEEFF80B427D4EB4FL ^ (long)n2 ^ 0xFC18831A2DB8702EL);
                    n3 = (n2 ^ 0xD38377F2) + 212351385 - 212351385;
                    n -= 5;
                    continue block32;
                }
                case 1934978919: {
                    int cfr_ignored_7 = Integer.rotateLeft(0xAF149844 ^ n2, 8) - 937168759;
                    n3 = n2 ^ 0x555975;
                    ++n;
                    continue block32;
                }
                case -1840342263: {
                    bsth_2.tkhh_3(-1088193152, n2);
                    int cfr_ignored_8 = (int)(0x211404397F4A7C15L ^ (long)n2 ^ 0xF5023227030DEFF9L);
                    n3 = (n2 ^ 0xFC807C9D) + 1939047171 - 1939047171;
                    int cfr_ignored_9 = Integer.rotateLeft(0x75F5428 ^ n2, 3) + -387395565;
                    try {
                        if ((0xFF9D8858FEC971F7L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 ^ 0x555975;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x555975));
                    }
                    n -= 2;
                    continue block32;
                }
                case -2126480080: {
                    int cfr_ignored_10 = (Integer.rotateRight(0xCB468793 ^ n2, 12) + -1578628600) * -884570221;
                    n3 = (n2 ^ 0x555975) + 1549543733 - 1549543733;
                    int cfr_ignored_11 = Integer.rotateRight(0xF61A66A ^ n2, 4) + -516897263;
                    ++n;
                    continue block32;
                }
                case 2057082942: {
                    int cfr_ignored_12 = (Integer.rotateRight(0x39F2EDB ^ n2, 3) + 1956924352) * 60763867;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x76423D46));
                    int cfr_ignored_13 = Integer.rotateLeft(0xACDF3D28 ^ n2, 8) + -211417325;
                    try {
                        n -= 3;
                        if ((0x7E7DEA9B5A1F02DDL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 ^ 0x555975 ^ 0xD3AAF0A1 ^ 0xD3AAF0A1;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0x555975) + -110128444 - -110128444;
                    }
                    n -= 5;
                    continue block32;
                }
                case 22741518: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x3F9FA18 ^ n2, 3) + 2141382691) * 66714137;
                    n3 = (int)((long)(n2 ^ 0x555975) ^ 0x6B13A8D90881FEB9L ^ 0x6B13A8D90881FEB9L);
                    n += 2;
                    continue block32;
                }
                case 132442286: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0x35E95CD1 ^ n2, 9) + -1952457590) * 904486097;
                    int cfr_ignored_16 = (int)(0xF75BF2EC27D4EB4FL ^ (long)n2 ^ 0x18A8831A2DB84366L);
                    n3 = (int)((long)(n2 ^ 0x11F43931) ^ 0xFD64A83EFD33159FL ^ 0xFD64A83EFD33159FL);
                    int cfr_ignored_17 = Integer.rotateLeft(0x4C419D6D ^ n2, 12) - 1078964078;
                    int cfr_ignored_18 = (int)(0x8EF3335027D4EB4FL ^ (long)n2 ^ 0x9BD0831A2DB8B037L);
                    try {
                        n -= 4;
                        n3 = n2 ^ 0x555975;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0x555975) + -450640313 - -450640313;
                    }
                    n -= 5;
                    continue block32;
                }
                case 1440631551: {
                    int cfr_ignored_19 = (Integer.rotateRight(0x5BFA97D2 ^ n2, 14) + 666239401) * 1543149523;
                    try {
                        n -= 4;
                        if ((0xDC520DB8E2663A0BL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = n2 ^ 0x555975 ^ 0x31A07C51 ^ 0x31A07C51;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(n2 ^ 0x555975) ^ 0xA5D32B5778717635L ^ 0xA5D32B5778717635L);
                    }
                    continue block32;
                }
                case 907695941: {
                    int cfr_ignored_20 = (Integer.rotateRight(0x2926B37F ^ n2, 8) - 875420) * 690402175;
                    n3 = (n2 ^ 0x8BA306A0) + 1266528034 - 1266528034;
                    int cfr_ignored_21 = (Integer.rotateLeft(0x508D35D5 ^ n2, 13) - -982047738) * 1351431637;
                    int cfr_ignored_22 = (int)(0x923F9BE827D4EB4FL ^ (long)n2 ^ 0xCAA0831A2DB889AEL);
                    n3 = (int)((long)(n2 ^ 0x555975) ^ 0x3FD7EAB849E67600L ^ 0x3FD7EAB849E67600L);
                    int cfr_ignored_23 = (Integer.rotateLeft(0x8C4E7430 ^ n2, 4) + 31305995) * -1941015503;
                    n += 4;
                    continue block32;
                }
                case 1027360029: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x3FAACE1C ^ n2, 10) - -1173580641) * 1068158493;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA8848E95));
                    int cfr_ignored_25 = Integer.rotateRight(0x3E599146 ^ n2, 10) - -1858718027;
                    try {
                        n += 4;
                        if ((0xC3DE615CBDFDA93BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 ^ 0x555975 ^ 0xB0C91B9A ^ 0xB0C91B9A;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 ^ 0x555975 ^ 0x1ECCFF0B ^ 0x1ECCFF0B;
                    }
                    n -= 4;
                    continue block32;
                }
                case 1327100779: {
                    int cfr_ignored_26 = Integer.rotateRight(0x31F1E04E ^ n2, 9) - 279431341;
                    try {
                        n -= 3;
                        if ((0xBFB24A32487FC85FL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(n2 ^ 0x555975) ^ 0xF54A35CA9459778L ^ 0xF54A35CA9459778L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 ^ 0x555975 ^ 0xE62A85C0 ^ 0xE62A85C0;
                    }
                    n -= 2;
                    continue block32;
                }
            }
            int cfr_ignored_27 = (Integer.rotateRight(0xE917737E ^ n2, 16) - 1043635069) * -384339073;
            n3 = n2 ^ 0x555975;
        }
    }

    private static String tqh_4(String string, int n, int n2, int n3) {
        int n4 = bsth_2.rshf(2102445666);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 5)) ^ 0xB83E65A0;
        if ((n5 ^ n4) != -1203870304) {
            int cfr_ignored_0 = Integer.rotateRight(0xC56EA3C2 ^ n4, 11) + -322735175;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xA2ECA072) + khsz_2 ^ Integer.reverse(n2 + i * 365205777), 20) - jnk);
        }
        return new String(cArray);
    }

    private static boolean jhr_2() {
        block0: {
            int n = bsth_2.rshf(1419621523);
            int n2 = n ^ 0x5E1212B6;
            if ((n2 ^ n) == 1578242742) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA8FA625 ^ n, 4) - 1271053750;
            int cfr_ignored_1 = (int)(0xC83D081827D4EB4FL ^ (long)n ^ 0xED40831A2DB83DABL);
        }
        return yf.khdha_2();
    }

    private static boolean dbf() {
        block0: {
            int n = bsth_2.rshf(-1707848412);
            int n2 = n ^ 0xD6622C7A;
            if ((n2 ^ n) == -698209158) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4C56615E ^ n, 12) - 1121151389) * 1280729439;
        }
        return yf.dnkh();
    }

    private static String[] ghtkh(String string) {
        block0: {
            int n = 1324010304;
            int n2 = (n = Integer.rotateLeft(n * 1438799423, 12) ^ 0xF66C1918) ^ 0x2831B2EE;
            if ((n2 ^ n) == 674345710) break block0;
            int cfr_ignored_0 = (0x66DB79AE ^ n) - -771184672;
        }
        return string.split("\b\u001b", -1);
    }

    private static CallSite khysh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1140880449;
            n3 = Integer.rotateLeft(n3 * -2025074789, 5) ^ 0xF52AC42;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xDD666368;
            if ((n4 ^ n3) != -580492440) {
                int cfr_ignored_0 = (0x99661729 ^ n3) + 762550939;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ thyn ^ string.hashCode()) + (n2 + zrw) + i ^ thyn, 19) + zrw);
            }
            String[] stringArray = adh_3.ghtkh(new String(cArray));
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

    private static String[] eoyaop6avc8fo(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wvbgdjbs4rtj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ puvicef2me ^ string.hashCode() ^ n2 + u0v2nsb2w + i * -905956737) + puvicef2me) ^ u0v2nsb2w));
            }
            String[] stringArray = adh_3.eoyaop6avc8fo(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

