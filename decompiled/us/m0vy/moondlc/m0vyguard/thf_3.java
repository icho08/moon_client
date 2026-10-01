/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1656
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2828$class_2831
 *  net.minecraft.class_2846
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_2879
 *  net.minecraft.class_310
 *  net.minecraft.class_634
 *  net.minecraft.class_6373
 *  net.minecraft.class_6374
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1656;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2879;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_6373;
import net.minecraft.class_6374;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bab_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.khsh_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zw_2;
import us.m0vy.moondlc.m0vyguard.ghh_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Disabler", category=bzw.OTHER, desc="Packet and movement spoofs for specific anticheats")
public class thf_3
extends bnq {
    private final badh_2 zt_4 = new badh_2(this, "FunSky").bts(false);
    private final badh_2 bjj = new badh_2(this, "CancelHandSwing").bts(false);
    private final badh_2 rzd_2 = new badh_2(this, "CancelPlaye".concat("rAction")).bts(false);
    private final badh_2 zkhl = new badh_2(this, "NoSprint").bts(false);
    private final badh_2 dqsh = new badh_2(this, "PingSpoof").bts(false);
    private final tay stl_2 = new tay((hy)this, "Delay", this::btt_4).shth_7(Float.intBitsToFloat(884658157 - -235745299)).dhbs_2(Float.intBitsToFloat(1034374729 + 131248567)).rkh_3(Float.intBitsToFloat(-1511142419 + -1671810029)).ssd_5(Float.intBitsToFloat(1544289772 - 395443692));
    private final badh_2 shght = new badh_2(this, "RoyalPixels").bts(false);
    private final badh_2 dys_2 = new badh_2(this, "NoRotat".concat("ionDisabler")).bts(false);
    private final khd tkhgh = new khd((hy)this, "RotMode", this::jsdh);
    private final fy dth_5 = new fy(this.tkhgh, "Zero");
    private final fy khtt_4 = new fy(this.tkhgh, "OffsetYaw");
    private final tay shkkh = new tay((hy)this, "OffsetAmount", this::hghs_2).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xD53345FA ^ 0xD4B52DFA, 7))).dhbs_2(Float.intBitsToFloat(0xDE6B2499 ^ 0x9D5F2499)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(762663417 - -323661319));
    private final badh_2 zysh = new badh_2(this, "MatrixElyt".concat("raSpoofs")).bts(false);
    private final badh_2 dhthsh = new badh_2(this, "HAC").bts(false);
    private final badh_2 taw = new badh_2(this, "AAC5").bts(false);
    private final List hkth = new ArrayList();
    private long hzw_2;
    private long thz_4;
    private long dsb;
    private boolean thst_3;
    private boolean thdj_2;
    private final bql<bksh> zdhm = this::dzgh_4;
    private final bql<ghh_2> bzsh = this::bhz_2;
    private final bql<btt> zf = this::syh_3;
    private static final int rqd_2 = 1193948338;
    private static final int hwf = 430810823;
    private static final int khrh = 642830624;
    private static final int thsgh_2 = -1735465832;
    private static final int osrvv7l4 = -1408846576;
    private static final int ugiq848hecot = -2008772141;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int lreum38a;

    @Override
    public void nt() {
        try {
            int n = 1943343451;
            n = Integer.rotateLeft(n * 1624134249, 14) ^ 0xF928140D;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x80C5FF49;
            if ((n2 ^ n) != -2134507703) {
                int cfr_ignored_0 = (0xF310EE12 ^ n) + -179679844;
            }
            if ((0x14A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!thf_3.htw()) {
            yf.athz_2();
            throw null;
        }
        this.hkth.clear();
        this.hzw_2 = 0L;
        this.thz_4 = 0L;
        this.dsb = 0L;
        if (thf_3.mc.field_1724 != null) {
            this.thst_3 = thf_3.tghh_3((class_746)thf_3.mc.field_1724).field_7478;
            this.thdj_2 = thf_3.mc.field_1724.method_31549().field_7479;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = -200999222;
        var1_2 = Integer.rotateLeft(var1_2 * -1241788213, 25) ^ -2062855030;
        var1_2 = Integer.rotateLeft(System.identityHashCode(this) ^ var1_2, 21);
        var2_3 = 252566768 + var1_2;
        block21: while (true) {
            block38: {
                block35: {
                    block39: {
                        block46: {
                            block45: {
                                block47: {
                                    block43: {
                                        block36: {
                                            block34: {
                                                block41: {
                                                    block42: {
                                                        block37: {
                                                            block48: {
                                                                block44: {
                                                                    block40: {
                                                                        var3_1 = var2_3 - var1_2;
                                                                        switch (var3_1 & 7) {
                                                                            case 5: {
                                                                                if (var3_1 == 992411925) break block34;
                                                                                if (var3_1 == 614181197) break block35;
                                                                                if (var3_1 == 1769611541) break block36;
                                                                                if (var3_1 != 634569869) {
                                                                                    ** break;
                                                                                }
                                                                                break block37;
                                                                            }
                                                                            case 2: {
                                                                                if (var3_1 != 424914338) {
                                                                                    ** break;
                                                                                }
                                                                                break block38;
                                                                            }
                                                                            case 3: {
                                                                                if (var3_1 == -1361493181) break block39;
                                                                                if (var3_1 == 1531017827) break block40;
                                                                                (Integer.rotateLeft(371192592 ^ var1_2, 5) + -1304687061) * 371192593;
                                                                                if (var3_1 != -1871791853) {
                                                                                    ** break;
                                                                                }
                                                                                break block41;
                                                                            }
                                                                            case 1: {
                                                                                if (var3_1 == 2022307681) break;
                                                                                if (var3_1 == 963737617) break block42;
                                                                                (Integer.rotateLeft(1630400596 ^ var1_2, 15) - -923944601) * 1630400597;
                                                                                if (var3_1 != -812696551) {
                                                                                    ** break;
                                                                                }
                                                                                break block43;
                                                                            }
                                                                            case 4: {
                                                                                if (var3_1 == -942012052) break block44;
                                                                                if (var3_1 != -234350948) {
                                                                                    ** break;
                                                                                }
                                                                                break block45;
                                                                            }
                                                                            case 6: {
                                                                                if (var3_1 == -1763237154) break block46;
                                                                                if (var3_1 == -1903298642) break block47;
                                                                                Integer.rotateLeft(-740553459 ^ var1_2, 13) - -1409076274;
                                                                                (int)(1256120773304970063L ^ (long)var1_2 ^ -4967326240530133236L);
                                                                                if (var3_1 != 846844694) {
                                                                                    ** break;
                                                                                }
                                                                                break block48;
                                                                            }
                                                                            case 0: {
                                                                                if (var3_1 != 252566768) ** break;
                                                                                (Integer.rotateRight(-633608170 ^ var1_2, 14) - 1906227685) * -633608169;
                                                                                if (yf.dnkh()) {
                                                                                    try {
                                                                                        ++var3_1;
                                                                                        var2_3 = 2022307681 + var1_2 + -911558313 - -911558313;
                                                                                    }
                                                                                    catch (IllegalStateException v0) {
                                                                                        var2_3 = 2022307681 + var1_2 + 1538341427 - 1538341427;
                                                                                    }
                                                                                    var3_1 -= 2;
                                                                                    continue block21;
                                                                                }
                                                                                try {
                                                                                    --var3_1;
                                                                                    var2_3 = 1531017827 + var1_2 ^ -1373025772 ^ -1373025772;
                                                                                }
                                                                                catch (NoSuchElementException v1) {
                                                                                    var2_3 = 1531017827 + var1_2 ^ 298970212 ^ 298970212;
                                                                                }
                                                                                continue block21;
                                                                            }
                                                                        }
                                                                        Integer.rotateLeft(1453592713 ^ var1_2, 13) + -2110021678;
                                                                        (int)(-7775818025636926641L ^ (long)var1_2 ^ -9216472488954264068L);
                                                                        throw null;
                                                                    }
                                                                    Integer.rotateLeft(-514659159 ^ var1_2, 15) + 1298679730;
                                                                    (int)(2585139390201523023L ^ (long)var1_2 ^ 8671825230961437201L);
                                                                    thf_3.jbz_2(this);
                                                                    if (thf_3.mc.field_1724 == null) {
                                                                        var2_3 = -942012052 + var1_2 ^ -1035297375 ^ -1035297375;
                                                                        continue;
                                                                    }
                                                                    var2_3 = 846844694 + var1_2;
                                                                    (Integer.rotateRight(-1488097870 ^ var1_2, 7) + 1186850761) * -1488097869;
                                                                    var3_1 += 3;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(-839284944 ^ var1_2, 12) + -174785013) * -839284943;
                                                                return;
                                                            }
                                                            Integer.rotateLeft(-2035668600 ^ var1_2, 3) + 1392027315;
                                                            thf_3.dbs_3((class_746)thf_3.mc.field_1724).field_7478 = this.thst_3;
                                                            thf_3.zy_2((class_746)thf_3.mc.field_1724).field_7479 = this.thdj_2;
                                                            (int)(-1893383543585900409L ^ (long)var1_2 ^ 5626532261737817763L);
                                                            var2_3 = Integer.reverse(Integer.reverse(-942012052 + var1_2));
                                                            ++var3_1;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(1601531274 ^ var1_2, 14) + -1818893583;
                                                        try {
                                                            var3_1 -= 5;
                                                            if ((8366846031094777297L ^ (long)var1_2 | 1L) == 0L) {
                                                                throw new NoSuchElementException();
                                                            }
                                                            var2_3 = 252566768 + var1_2 ^ -1373116266 ^ -1373116266;
                                                        }
                                                        catch (NoSuchElementException v2) {
                                                            var2_3 = 252566768 + var1_2 ^ -949527580 ^ -949527580;
                                                        }
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(1113214362 ^ var1_2, 11) + 223151329) * 1113214363;
                                                    var2_3 = -1930333314 + var1_2 ^ -993958348 ^ -993958348;
                                                    Integer.rotateLeft(1826269057 ^ var1_2, 16) + 853010394;
                                                    (int)(-5879438609805415601L ^ (long)var1_2 ^ -1294640744409534207L);
                                                    (int)(4395033946717478006L ^ (long)var1_2 ^ 7304187075963376685L);
                                                    var2_3 = (int)((long)(-1483801467 + var1_2) ^ 4403351798477814870L ^ 4403351798477814870L);
                                                    (int)(-5294647512150238593L ^ (long)var1_2 ^ -5100491015922859814L);
                                                    var2_3 = 252566768 + var1_2 + 1350873996 - 1350873996;
                                                    var3_1 -= 2;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-1928888033 ^ var1_2, 4) - 407257596) * -1928888033;
                                                var2_3 = 252566768 + var1_2;
                                                var3_1 -= 2;
                                                continue;
                                            }
                                            Integer.rotateRight(-78998910 ^ var1_2, 18) + 1919245561;
                                            (int)(8191006466019839872L ^ (long)var1_2 ^ 7243930768402501257L);
                                            var2_3 = -255265354 + var1_2;
                                            (int)(920881722705076384L ^ (long)var1_2 ^ -4654259885064080290L);
                                            var2_3 = Integer.reverse(Integer.reverse(252566768 + var1_2));
                                            var3_1 += 5;
                                            continue;
                                        }
                                        (Integer.rotateRight(1591131515 ^ var1_2, 14) + -2141286112) * 1591131515;
                                        var2_3 = -1943569627 + var1_2 ^ -889574501 ^ -889574501;
                                        (Integer.rotateLeft(522853916 ^ var1_2, 6) - -898153313) * 522853917;
                                        var2_3 = 252566768 + var1_2 + 589119257 - 589119257;
                                        var3_1 -= 5;
                                        continue;
                                    }
                                    Integer.rotateRight(173015203 ^ var1_2, 4) + 1141748472;
                                    var2_3 = 340110702 + var1_2 + 2143006064 - 2143006064;
                                    (Integer.rotateLeft(-1784315944 ^ var1_2, 5) + 594025059) * -1784315943;
                                    try {
                                        var3_1 += 5;
                                        if ((-5295891114142304903L ^ (long)var1_2 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        var2_3 = (int)((long)(252566768 + var1_2) ^ 1263648836373672759L ^ 1263648836373672759L);
                                    }
                                    catch (NoSuchElementException v3) {
                                        var2_3 = Integer.reverse(Integer.reverse(252566768 + var1_2));
                                    }
                                    continue;
                                }
                                (Integer.rotateRight(186939995 ^ var1_2, 4) + 1573417024) * 186939995;
                                (int)(511534160701326863L ^ (long)var1_2 ^ 6216949471297250275L);
                                var2_3 = 252566768 + var1_2;
                                continue;
                            }
                            Integer.rotateRight(775315591 ^ var1_2, 8) - -1661775980;
                            var2_3 = -494568832 + var1_2 ^ -1999965463 ^ -1999965463;
                            Integer.rotateLeft(467421256 ^ var1_2, 6) + 1678401523;
                            var2_3 = 252566768 + var1_2 + 920822574 - 920822574;
                            (Integer.rotateRight(1556632094 ^ var1_2, 14) - 1084199133) * 1556632095;
                            var3_1 -= 2;
                            continue;
                        }
                        (Integer.rotateLeft(-1498093607 ^ var1_2, 7) + 876982914) * -1498093607;
                        (int)(7207529497922693967L ^ (long)var1_2 ^ 7978270888346346973L);
                        var2_3 = 1996621036 + var1_2 + -1767564785 - -1767564785;
                        (Integer.rotateRight(915831702 ^ var1_2, 9) - -1600743835) * 915831703;
                        var2_3 = 1550782454 + var1_2 ^ -1203232622 ^ -1203232622;
                        (Integer.rotateRight(-1144285634 ^ var1_2, 10) - -1039871811) * -1144285633;
                        var2_3 = 252566768 + var1_2;
                        continue;
                    }
                    Integer.rotateLeft(-631652415 ^ var1_2, 14) + 1966856090;
                    (int)(1795548651134970703L ^ (long)var1_2 ^ -2411533451997373433L);
                    try {
                        var3_1 -= 2;
                        if ((7359766228919981517L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var2_3 = 252566768 + var1_2;
                    }
                    catch (IllegalArgumentException v4) {
                        var2_3 = 252566768 + var1_2 + 1566719898 - 1566719898;
                    }
                    var3_1 -= 2;
                    continue;
                }
                (Integer.rotateRight(-606744653 ^ var1_2, 14) + -1555970584) * -606744653;
                (int)(7307497821267384115L ^ (long)var1_2 ^ 1759429269722851075L);
                var2_3 = Integer.reverse(Integer.reverse(98119261 + var1_2));
                (int)(-828335170196381569L ^ (long)var1_2 ^ -5878712343384800045L);
                var2_3 = (int)((long)(252566768 + var1_2) ^ -664461412028169869L ^ -664461412028169869L);
                ++var3_1;
                continue;
            }
            (Integer.rotateLeft(892957392 ^ var1_2, 9) + 1985119851) * 892957393;
            var2_3 = (int)((long)(364849626 + var1_2) ^ 1425322726488217741L ^ 1425322726488217741L);
            (Integer.rotateRight(-2067042625 ^ var1_2, 3) - 419432540) * -2067042625;
            try {
                if ((6048531771883680729L ^ (long)var1_2 | 1L) == 0L) {
                    throw new NoSuchElementException();
                }
                var2_3 = (int)((long)(252566768 + var1_2) ^ 518086990778369977L ^ 518086990778369977L);
            }
            catch (NoSuchElementException v5) {
                var2_3 = 252566768 + var1_2 + 563524727 - 563524727;
            }
            --var3_1;
            continue;
lbl245:
            // 8 sources

            Integer.rotateLeft(1226900517 ^ var1_2, 12) - -547545162;
            (int)(-8389174660136899761L ^ (long)var1_2 ^ -6250852134330778890L);
            var2_3 = (int)((long)(252566768 + var1_2) ^ 4127783836985054373L ^ 4127783836985054373L);
        }
    }

    private class_2596 tlh_2(class_2828 class_28282) {
        float f;
        float f2 = this.khtt_4.shghkh() ? class_28282.method_12271(thf_3.mc.field_1724.method_36454()) + this.shkkh.thw_5() : 0.0f;
        float f3 = f = this.khtt_4.shghkh() ? class_28282.method_12270(thf_3.mc.field_1724.method_36455()) : 0.0f;
        if (class_28282.method_36171()) {
            return new class_2828.class_2830(class_28282.method_12269(thf_3.mc.field_1724.method_23317()), class_28282.method_12268(thf_3.mc.field_1724.method_23318()), class_28282.method_12274(thf_3.mc.field_1724.method_23321()), f2, f, class_28282.method_12273(), thf_3.mc.field_1724.field_5976);
        }
        return new class_2828.class_2831(f2, f, class_28282.method_12273(), thf_3.mc.field_1724.field_5976);
    }

    private void hsf_2() {
        try {
            int n = -1395978546;
            n = Integer.rotateLeft(n * -1996084247, 14) ^ 0x34C28621;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8607A74;
            if ((n2 ^ n) != 140540532) {
                int cfr_ignored_0 = (0xA4AB74BA ^ n) - 1260478153;
            }
            if ((0xC5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!thf_3.shaz_4()) {
            yf.athz_2();
            throw null;
        }
        if (!thf_3.bzr(this.dqsh)) {
            thf_3.zhf_2(this);
            return;
        }
        long l = thf_3.hghw();
        Iterator iterator = this.hkth.iterator();
        while (iterator.hasNext()) {
            khsh_3 khsh2 = (khsh_3)iterator.next();
            if (l < khsh2.hkhq) continue;
            if (thf_3.ssh_8(mc) != null) {
                thf_3.shghh(thf_3.hlb(mc), (class_2596)new class_6374(khsh2.smd_2));
            }
            iterator.remove();
        }
    }

    private void jqa_2() {
        try {
            int n = -1207326726;
            n = Integer.rotateLeft(n * 778479007, 6) ^ 0x9731AF23;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xEDBF057E;
            if ((n2 ^ n) != -306248322) {
                int cfr_ignored_0 = (0x55B6A284 ^ n) + 791007896;
            }
            if ((0x264 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        for (khsh_3 khsh2 : this.hkth) {
            if (mc.method_1562() == null) continue;
            thf_3.kha(mc).method_52787((class_2596)new class_6374(khsh2.smd_2));
        }
        this.hkth.clear();
    }

    private void syh_3(btt btt2) {
        try {
            int n = 1928212242;
            n = Integer.rotateLeft(n * -1846081271, 11) ^ 0x93804BE;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8F1B1625;
            if ((n2 ^ n) != -1894050267) {
                int cfr_ignored_0 = (0xFDF53937 ^ n) + -1685155506;
            }
            if ((0x137 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (thf_3.mc.field_1724 == null || thf_3.mc.field_1687 == null) {
            this.hkth.clear();
            return;
        }
        if (this.zt_4.shzl() && thf_3.mc.field_1724.method_24828()) {
            double d = Math.floor(thf_3.mc.field_1724.method_23317()) + Double.longBitsToDouble(0x82D766B760F5ED04L ^ 0xBD3766B760F5ED04L);
            double d2 = Math.floor(thf_3.mc.field_1724.method_23321()) + Double.longBitsToDouble(0xF866394EE0385504L ^ 0xC786394EE0385504L);
            thf_3.mc.field_1724.method_5814(d, thf_3.mc.field_1724.method_23318(), d2);
        }
        if (this.shght.shzl()) {
            thf_3.mc.field_1724.method_31549().field_7478 = true;
        }
        if (this.zysh.shzl() && thf_3.mc.field_1724.method_6118(class_1304.field_6174).method_31574(class_1802.field_8833) && !thf_3.mc.field_1724.method_24828() && System.currentTimeMillis() - this.hzw_2 >= (0xC05EAFA2D4457818L ^ 0xC05EAFA2D44578E2L)) {
            if (mc.method_1562() != null) {
                mc.method_1562().method_52787((class_2596)new class_2848((class_1297)thf_3.mc.field_1724, class_2848.class_2849.field_12982));
            }
            this.hzw_2 = System.currentTimeMillis();
        }
        if (this.dhthsh.shzl() && System.currentTimeMillis() - this.thz_4 >= (0x39119A4289B6DB76L ^ 0x39119A4289B6DBBEL)) {
            if (mc.method_1562() != null) {
                mc.method_1562().method_52787((class_2596)new class_2828.class_2829(thf_3.mc.field_1724.method_23317(), thf_3.mc.field_1724.method_23318() - Double.longBitsToDouble(0xFE445977B1D91188L ^ 0xC1EDC0EE28408812L), thf_3.mc.field_1724.method_23321(), false, thf_3.mc.field_1724.field_5976));
            }
            this.thz_4 = System.currentTimeMillis();
        }
        if (this.taw.shzl() && System.currentTimeMillis() - this.dsb >= (0x288635676ADDD912L ^ 0x288635676ADDD8D0L)) {
            if (mc.method_1562() != null) {
                mc.method_1562().method_52787((class_2596)new class_2828.class_2829(thf_3.mc.field_1724.method_23317(), thf_3.mc.field_1724.method_23318() + Double.longBitsToDouble(0x53604548AB9248DCL ^ 0x6CFEFD1940175664L), thf_3.mc.field_1724.method_23321(), false, thf_3.mc.field_1724.field_5976));
                mc.method_1562().method_52787((class_2596)new class_2828.class_2829(thf_3.mc.field_1724.method_23317(), thf_3.mc.field_1724.method_23318(), thf_3.mc.field_1724.method_23321(), false, thf_3.mc.field_1724.field_5976));
            }
            this.dsb = System.currentTimeMillis();
        }
        this.hsf_2();
    }

    private void bhz_2(ghh_2 ghh2) {
        class_2848 class_28482;
        int n = 1589426978;
        n = Integer.rotateLeft(n * -544063213, 18) ^ 0x877BC2CF;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x6F8C7B51;
        if ((n2 ^ n) != 1871477585) {
            int cfr_ignored_0 = (0x3130C073 ^ n) + -3010488;
        }
        if (thf_3.mc.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = ghh2.zjd();
        if (this.bjj.shzl() && class_25962 instanceof class_2879) {
            ghh2.dhtd_2();
            return;
        }
        if (this.rzd_2.shzl() && class_25962 instanceof class_2846) {
            ghh2.dhtd_2();
            return;
        }
        if (this.zkhl.shzl() && class_25962 instanceof class_2848 && (class_28482 = (class_2848)class_25962).method_12365() == class_2848.class_2849.field_12981) {
            ghh2.dhtd_2();
            return;
        }
        if (this.dys_2.shzl() && class_25962 instanceof class_2828 && (class_28482 = (class_2828)class_25962).method_36172()) {
            ghh2.dhtd_2();
            if (mc.method_1562() != null) {
                mc.method_1562().method_52787(this.tlh_2((class_2828)class_28482));
            }
        }
    }

    private void dzgh_4(bksh bksh2) {
        try {
            int n = 1987788817;
            n = Integer.rotateLeft(n * -1961455387, 3) ^ 0xBB72805B;
            n = System.identityHashCode(this) ^ n;
            bksh bksh3 = bksh2;
            n = (bksh3 != null ? System.identityHashCode(bksh3) : 0) ^ n;
            int n2 = n ^ 0xC0465672;
            if ((n2 ^ n) != -1069132174) {
                int cfr_ignored_0 = (0xB63D1663 ^ n) + 750989256;
            }
            if ((0x309 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bksh2.tsm_3() || thf_3.mc.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = bksh2.asw();
        if (this.dqsh.shzl() && class_25962 instanceof class_6373) {
            class_6373 class_63732 = (class_6373)class_25962;
            bab_2 bab2 = bab_2.dthh_4();
            if (bab2.rgha_2() && (bab2.shah_4() || bab2.zngh_2())) {
                return;
            }
            this.hkth.add(new khsh_3(class_63732.method_36950(), System.currentTimeMillis() + (long)this.stl_2.thw_5()));
            bksh2.dhtd_2();
        }
    }

    private boolean hghs_2() {
        int n;
        block1: {
            int n2 = 1351237260;
            n2 = Integer.rotateLeft(n2 * 85903767, 11) ^ 0xE0805A5;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x128F950;
            if ((n3 ^ n2) != 19462480) {
                int cfr_ignored_0 = (0x51A2C7DC ^ n2) + -713572270;
            }
            n = !this.dys_2.shzl() || !this.khtt_4.shghkh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x306D;
        }
        return n != 0;
    }

    private boolean jsdh() {
        int n = 363625151;
        n = Integer.rotateLeft(n * 323328951, 17) ^ 0x29B6E093;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 16);
        int n2 = n ^ 0x265B485B;
        if ((n2 ^ n) != 643516507) {
            int cfr_ignored_0 = (0x33F732E4 ^ n) - 806949079;
        }
        return !this.dys_2.shzl();
    }

    private boolean btt_4() {
        try {
            int n = -256530680;
            n = Integer.rotateLeft(n * 1392806619, 17) ^ 0xC5196102;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7690BB64;
            if ((n2 ^ n) != 1989196644) {
                int cfr_ignored_0 = (0x86251C6C ^ n) + 97088783;
            }
            if ((0x321 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.dqsh.shzl();
    }

    private static String zad_5(String string, int n, int n2, int n3) {
        int n4 = -195506694;
        n4 = Integer.rotateLeft(n4 * 450073665, 16) ^ 0xE8F41C21;
        n4 = Integer.rotateRight(n ^ n4, 25);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 7)) ^ 0xA3693988;
        if ((n5 ^ n4) != -1553385080) {
            int cfr_ignored_0 = (0x5731F472 ^ n4) + -2017629377;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xA7D65E6D) + rqd_2 ^ Integer.reverse(n2 + i * -2037864099), 16) - hwf);
        }
        return new String(cArray);
    }

    private static boolean htw() {
        block0: {
            int n = zw_2.sha_3(1102901064);
            int n2 = n ^ 0xD63C0DAE;
            if ((n2 ^ n) == -700707410) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9780E2E6 ^ n, 5) - 1559828757;
        }
        return yf.khdha_2();
    }

    private static class_1656 tghh_3(class_746 class_7462) {
        block0: {
            int n = -1947807095;
            int n2 = (n = Integer.rotateLeft(n * -2102529587, 12) ^ 0x5A42F6A4) ^ 0x4F7510E2;
            if ((n2 ^ n) == 1333072098) break block0;
            int cfr_ignored_0 = (0xC493C26B ^ n) - 87166364;
        }
        return class_7462.method_31549();
    }

    private static void jbz_2(thf_3 thf2) {
        int n = zw_2.sha_3(-1479856624);
        thf_3 thf3 = thf2;
        n = Integer.rotateLeft((thf3 != null ? System.identityHashCode(thf3) : 0) ^ n, 9);
        int n2 = n ^ 0xEB12B111;
        if ((n2 ^ n) != -351096559) {
            int cfr_ignored_0 = Integer.rotateLeft(0x4CD99F01 ^ n, 12) + 1387782234;
            int cfr_ignored_1 = (int)(0x8E6B313C27D4EB4FL ^ (long)n ^ 0x9F08831A2DB8B107L);
        }
        thf2.jqa_2();
    }

    private static class_1656 dbs_3(class_746 class_7462) {
        block0: {
            int n = -1944378348;
            n = Integer.rotateLeft(n * -891580077, 3) ^ 0x1722C617;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 9);
            int n2 = n ^ 0xD70713B;
            if ((n2 ^ n) == 225472827) break block0;
            int cfr_ignored_0 = (0x816B552F ^ n) + 451979492;
        }
        return class_7462.method_31549();
    }

    private static class_1656 zy_2(class_746 class_7462) {
        block0: {
            int n = 1897575684;
            n = Integer.rotateLeft(n * -1458619447, 14) ^ 0x1544D9D7;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 27);
            int n2 = n ^ 0x190F38F2;
            if ((n2 ^ n) == 420428018) break block0;
            int cfr_ignored_0 = (0x68158DF6 ^ n) - -493815105;
        }
        return class_7462.method_31549();
    }

    private static boolean shaz_4() {
        block0: {
            int n = 1570923014;
            int n2 = (n = Integer.rotateLeft(n * 1195909913, 16) ^ 0x7A72F330) ^ 0xB88E5336;
            if ((n2 ^ n) == -1198632138) break block0;
            int cfr_ignored_0 = (0xE52C3130 ^ n) + -1502230510;
        }
        return yf.khdha_2();
    }

    private static boolean bzr(badh_2 badh2) {
        block0: {
            int n = 1047965463;
            n = Integer.rotateLeft(n * -1161973071, 8) ^ 0xE5C5DFD5;
            badh_2 badh3 = badh2;
            n = Integer.rotateRight((badh3 != null ? System.identityHashCode(badh3) : 0) ^ n, 25);
            int n2 = n ^ 0xA7236DA;
            if ((n2 ^ n) == 175257306) break block0;
            int cfr_ignored_0 = (0x340499CD ^ n) - -294753550;
        }
        return badh2.shzl();
    }

    private static void zhf_2(thf_3 thf2) {
        int n = 404441994;
        n = Integer.rotateLeft(n * -461280959, 17) ^ 0x5DD65557;
        thf_3 thf3 = thf2;
        n = (thf3 != null ? System.identityHashCode(thf3) : 0) ^ n;
        int n2 = n ^ 0x2348FE8D;
        if ((n2 ^ n) != 591986317) {
            int cfr_ignored_0 = (0x3B53B507 ^ n) + 766975610;
        }
        thf2.jqa_2();
    }

    private static long hghw() {
        block0: {
            int n = zw_2.sha_3(-1628491753);
            int n2 = n ^ 0xF8AE3224;
            if ((n2 ^ n) == -122801628) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x66410233 ^ n, 15) + 1715266408) * 1715536435;
        }
        return System.currentTimeMillis();
    }

    private static class_634 ssh_8(class_310 class_3102) {
        block0: {
            int n = -1611462558;
            int n2 = (n = Integer.rotateLeft(n * 1828094855, 9) ^ 0x4670C0C8) ^ 0xEB33B62;
            if ((n2 ^ n) == 246627170) break block0;
            int cfr_ignored_0 = (0x91403300 ^ n) + -1383534537;
        }
        return class_3102.method_1562();
    }

    private static class_634 hlb(class_310 class_3102) {
        block0: {
            int n = -1016553820;
            int n2 = (n = Integer.rotateLeft(n * 1896786415, 18) ^ 0xE070F870) ^ 0x833361E4;
            if ((n2 ^ n) == -2093784604) break block0;
            int cfr_ignored_0 = (0x405BFF40 ^ n) - 1057478656;
        }
        return class_3102.method_1562();
    }

    private static void shghh(class_634 class_6342, class_2596 class_25962) {
        int n = zw_2.sha_3(-1557832846);
        int n2 = n ^ 0x66C7C420;
        if ((n2 ^ n) != 1724367904) {
            int cfr_ignored_0 = (Integer.rotateRight(0xC5E29F52 ^ n, 11) + -87102935) * -975003821;
        }
        class_6342.method_52787(class_25962);
    }

    private static class_634 kha(class_310 class_3102) {
        block0: {
            int n = -1573485497;
            n = Integer.rotateLeft(n * -1287870797, 20) ^ 0x37B4C19A;
            class_310 class_3103 = class_3102;
            n = (class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n;
            int n2 = n ^ 0xF4CF8CA;
            if ((n2 ^ n) == 256702666) break block0;
            int cfr_ignored_0 = (0xAD7A7C8D ^ n) + 1121612970;
        }
        return class_3102.method_1562();
    }

    private static String[] ghhm(String string) {
        int n = -1883001818;
        int n2 = (n = Integer.rotateLeft(n * 86004809, 8) ^ 0x4D00541C) ^ 0x1C1B5A30;
        if ((n2 ^ n) != 471554608) {
            int cfr_ignored_0 = (0x93D8F616 ^ n) + 225242648;
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

    private static CallSite fy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -592899017;
            n3 = Integer.rotateLeft(n3 * -1059857547, 18) ^ 0xB25009BD;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 23);
            n3 = Integer.rotateRight(n ^ n3, 9);
            int n4 = n3 ^ 0x625FB201;
            if ((n4 ^ n3) != 1650438657) {
                int cfr_ignored_0 = (0xBEF6A636 ^ n3) + 1686761425;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ khrh ^ string.hashCode() ^ n2 + thsgh_2 ^ i * 364257991 ^ khrh, 9) ^ thsgh_2));
            }
            String[] stringArray = thf_3.ghhm(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ju0jg2er(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite r9c2v6xu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ osrvv7l4 ^ string.hashCode()) + (n2 + ugiq848hecot) + i ^ osrvv7l4, 12) + ugiq848hecot);
            }
            String[] stringArray = thf_3.ju0jg2er(new String(cArray));
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

