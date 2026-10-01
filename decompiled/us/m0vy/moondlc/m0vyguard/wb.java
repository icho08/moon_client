/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 *  net.minecraft.class_640
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_640;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghq;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bkf;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.zh_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Crystal Optimizer", category=bzw.OTHER, desc="Optimizes crystal placing and breaking packet flow")
public class wb
extends bnq {
    private static final wb szz_3;
    private final tay thbz_2 = new tay(this, "Break Delay").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-1296419834 - 1869755398)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x5B45E486 ^ 0x5BC7A486, 7))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x3CD110D0 ^ 0xBCD114F4, 20)));
    private final tay dhthm = new tay(this, "Place Delay").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x83CF352 ^ 0x83CFB76, 19))).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x1A95EE8B ^ 0x1A94E3AB, 14))).rkh_3(Float.intBitsToFloat(Integer.reverse(285931096) ^ 0x5B4F5088)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x9CB02B00 ^ 0xBBB02B04, 28)));
    private final badh_2 bfr = new badh_2(this, "Instant Break").bts(true);
    private final tay thbsh = new tay(this, "Packet Limit").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-1669426420 - 1541313292)).rkh_3(1.0f).ssd_5(2.0f);
    private final badh_2 zbh_2 = new badh_2(this, "Adaptive".concat(" Packet Limit")).bts(true);
    private final tay jkd = new tay(this, "Max Ping").shth_7(Float.intBitsToFloat(Integer.reverse(534137880) ^ 0x59926BF8)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x6863E7A1 ^ 0xA863EFD3, 19))).rkh_3(Float.intBitsToFloat(1946658142 - 854041950)).ssd_5(Float.intBitsToFloat(-3735295 - -1124138751));
    private final badh_2 zaf = new badh_2(this, "Break Crystals").bts(true);
    private final badh_2 syh_2 = new badh_2(this, "Place Crystals").bts(true);
    private final ScheduledExecutorService sdd = Executors.newSingleThreadScheduledExecutor();
    private int jshk;
    private int jash;
    private long khght_2;
    private long thld;
    private boolean bdhm;
    private boolean khzt;
    private boolean tah_3;
    private final bql<btt> thzl = this::khsj_2;
    private final bql<bghq> rghr = this::dls_3;
    private final bql<bkf> sht_6 = this::sssh_4;
    private static final int khkht = 836928516;
    private static final int dhtt_2 = 106735983;
    private static final int dkht_2 = -21082490;
    private static final int hhs = 1909408265;
    private static final int eknpfs2cr = -1734055833;
    private static final int fsf8fidy1 = 423152552;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cb3ds5pgxalbuf;

    @Override
    public void nt() {
        int n = 1344090713;
        n = Integer.rotateLeft(n * 1697163741, 14) ^ 0x6B0253BE;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9419C1D5;
        if ((n2 ^ n) != -1810251307) {
            int cfr_ignored_0 = (0xC404F38C ^ n) + -2140327534;
        }
        this.jshk = 0;
        this.jash = 0;
        this.bdhm = false;
        this.khzt = false;
        this.tah_3 = false;
    }

    @Override
    public void nc() {
        try {
            int n = -1449693135;
            n = Integer.rotateLeft(n * 632995073, 7) ^ 0x54E1BF74;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
            int n2 = n ^ 0x5B1327E8;
            if ((n2 ^ n) != 1527982056) {
                int cfr_ignored_0 = (0xF28457D9 ^ n) - -1583070588;
            }
            if ((0x3B9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.bdhm = false;
        this.khzt = false;
        this.tah_3 = false;
    }

    public class_1269 ztd_7(class_1657 class_16572, class_1268 class_12682, class_3965 class_39652) {
        int n = -1911214802;
        n = Integer.rotateLeft(n * -346305167, 16) ^ 0xB07FD800;
        class_1657 class_16573 = class_16572;
        n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
        class_1268 class_12683 = class_12682;
        n = (class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n;
        int n2 = n ^ 0x5E46E978;
        if ((n2 ^ n) != 1581705592) {
            int cfr_ignored_0 = (0xD053C456 ^ n) + 1098695565;
        }
        if (!this.rgha_2() || class_16572 != wb.mc.field_1724 || this.tah_3 || !this.syh_2.shzl()) {
            return class_1269.field_5811;
        }
        class_1799 class_17992 = class_16572.method_5998(class_12682);
        if (!wb.rss_4(class_17992, class_1802.field_8301)) {
            return class_1269.field_5811;
        }
        if (this.jshk >= this.bsw()) {
            return class_1269.field_5814;
        }
        class_2338 class_23382 = class_39652.method_17777();
        return wb.tzt_3(this, class_23382) && this.stha_3(class_23382) ? class_1269.field_5811 : class_1269.field_5814;
    }

    private void dda_2() {
        if (!this.rgha_2() || !this.jtha_2()) {
            return;
        }
        this.jash = wb.mc.field_1690.field_1886.method_1434() ? ++this.jash : 0;
        if (this.jash > 2) {
            return;
        }
        if (!wb.mc.field_1690.field_1904.method_1434() && !wb.mc.field_1690.field_1886.method_1434()) {
            this.jshk = 0;
        }
        if (this.jshk >= this.bsw()) {
            return;
        }
        if (this.shnh() && wb.mc.field_1690.field_1886.method_1434()) {
            this.shzgh();
        }
        if (this.syh_2.shzl() && wb.mc.field_1724.method_6047().method_31574(class_1802.field_8301) && wb.mc.field_1690.field_1904.method_1434()) {
            this.thkhsh();
        }
    }

    private boolean jtha_2() {
        int n = -1681666769;
        n = Integer.rotateLeft(n * -1603749701, 13) ^ 0x221B5A3A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x827D4C96;
        if ((n2 ^ n) != -2105717610) {
            int cfr_ignored_0 = (0x19BE81B9 ^ n) - 1643964381;
        }
        return wb.mc.field_1724 != null && wb.mc.field_1687 != null && !this.bdhm;
    }

    private boolean shnh() {
        class_3966 class_39662;
        class_239 class_2392;
        int n = zh_2.khqdh(-708626696);
        int n2 = n ^ 0xCBE6B59D;
        if ((n2 ^ n) != -874072675) {
            int cfr_ignored_0 = Integer.rotateLeft(0x1E258365 ^ n, 6) - -1427601290;
            int cfr_ignored_1 = (int)(0xDC972D5827D4EB4FL ^ (long)n ^ 0xA7C0831A2DB814FFL);
        }
        return (class_2392 = wb.mc.field_1765) instanceof class_3966 && this.hzs_3((class_39662 = (class_3966)class_2392).method_17782());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void shzgh() {
        long l;
        int n = 569780439;
        n = Integer.rotateLeft(n * -885516291, 8) ^ 0x13610C6A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5B36EBB1;
        if ((n2 ^ n) != 1530325937) {
            int cfr_ignored_0 = (0x7AC0C366 ^ n) + -148667583;
        }
        if ((l = wb.zzh_3()) - this.khght_2 < (long)Math.round(this.thbz_2.thw_5())) {
            return;
        }
        class_1297 class_12972 = this.zl();
        if (class_12972 == null) {
            return;
        }
        if (this.bfr.shzl() && this.jshk >= 1) {
            this.khkgh(class_12972);
        }
        this.khzt = true;
        try {
            wb.mc.field_1761.method_2918((class_1657)wb.mc.field_1724, class_12972);
            wb.mc.field_1724.method_6104(class_1268.field_5808);
        }
        finally {
            this.khzt = false;
        }
        ++this.jshk;
        this.khght_2 = l;
    }

    private void thkhsh() {
        long l = System.currentTimeMillis();
        if (l - this.thld < (long)Math.round(this.dhthm.thw_5())) {
            return;
        }
        class_3965 class_39652 = this.shtr();
        if (class_39652 == null) {
            return;
        }
        class_2338 class_23382 = class_39652.method_17777();
        if (!this.bzz_4(class_23382) || !this.stha_3(class_23382)) {
            return;
        }
        this.bdhm = true;
        this.sdd.schedule(() -> this.dfk_2(class_39652), 10L, TimeUnit.MILLISECONDS);
    }

    private class_1297 zl() {
        class_3966 class_39662;
        class_239 class_2392;
        int n = 2147433449;
        n = Integer.rotateLeft(n * 1644014055, 23) ^ 0x29955844;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x125C2878;
        if ((n2 ^ n) != 308029560) {
            int cfr_ignored_0 = (0x6DA31391 ^ n) - -1443283199;
        }
        if ((class_2392 = wb.mc.field_1765) instanceof class_3966 && wb.sqa_4(this, (class_1297)(class_2392 = (class_39662 = (class_3966)class_2392).method_17782()))) {
            return class_2392;
        }
        return null;
    }

    private boolean hzs_3(class_1297 class_12972) {
        int n = -530261747;
        n = Integer.rotateLeft(n * -205346559, 25) ^ 0x4F63F18D;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE3255A5C;
        if ((n2 ^ n) != -484091300) {
            int cfr_ignored_0 = (0x3418351 ^ n) - -1720848121;
        }
        return class_12972 instanceof class_1511 && this.zaf.shzl();
    }

    private boolean bzz_4(class_2338 class_23382) {
        int n = -1738859331;
        n = Integer.rotateLeft(n * -1712936721, 3) ^ 0xC99BADB8;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0xAEA795DE;
        if ((n2 ^ n) != -1364748834) {
            int cfr_ignored_0 = (0x36FC8963 ^ n) - -1518042527;
        }
        if (wb.mc.field_1687 == null) {
            return false;
        }
        class_2680 class_26802 = wb.mc.field_1687.method_8320(class_23382);
        return class_26802.method_27852(class_2246.field_10540) || class_26802.method_27852(class_2246.field_9987);
    }

    private class_3965 shtr() {
        class_243 class_2432 = wb.mc.field_1724.method_33571();
        class_243 class_2433 = this.rdj_2();
        return wb.mc.field_1687.method_17742(new class_3959(class_2432, class_2432.method_1019(class_2433.method_1021(4.5)), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)wb.mc.field_1724));
    }

    private class_243 rdj_2() {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int n = 0;
        int n2 = 985392191;
        n2 = Integer.rotateLeft(n2 * 2031040815, 21) ^ 0x6FA4B611;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0x72C3FED5 ^ 0x72C3FED5;
        block23: while (true) {
            switch (Integer.rotateRight(n3, 22) ^ n2) {
                case 365949659: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x68D68DD5 ^ n2, 16) - -1235694586) * 1758891477;
                    int cfr_ignored_1 = (int)(0xAA6423E827D4EB4FL ^ (long)n2 ^ 0xBAA0831A2DB8F919L);
                    f = Float.intBitsToFloat(-463715980 + 1479719105);
                    f2 = Float.intBitsToFloat(Integer.rotateLeft(0x2AC280AC ^ 0xE456D0C, 25));
                    f3 = class_3532.method_15362((float)(-wb.sfa_3(wb.mc.field_1724) * f - f2));
                    f4 = wb.thtkh(-wb.thzz_2(wb.mc.field_1724) * f - f2);
                    f5 = -wb.khla_2(-wb.jthn(wb.mc.field_1724) * f);
                    f6 = class_3532.method_15374((float)(-wb.da_3(wb.mc.field_1724) * f));
                    return new class_243((double)(f4 * f5), (double)f6, (double)(f3 * f5)).method_1029();
                }
                case -418319205: {
                    int cfr_ignored_2 = Integer.rotateLeft(0xF58F1824 ^ n2, 17) - -1062106217;
                    throw null;
                }
                case 1513502867: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0x29DF7C14 ^ n2, 8) - 376284583) * 702512149;
                    if (yf.dnkh()) {
                        int cfr_ignored_4 = (int)(0x72DA633A2CE9847CL ^ (long)n2 ^ 0x3B049560F3DF4865L);
                        n3 = Integer.rotateLeft(n2 ^ 0x3B31F13E, 22) ^ 0x2411A3B2 ^ 0x2411A3B2;
                        int cfr_ignored_5 = (int)(0x53DA5235802753E4L ^ (long)n2 ^ 0x591BCCFD5CEF0A65L);
                        n3 = Integer.rotateLeft(n2 ^ 0xE710F49B, 22) ^ 0x3C3F296C ^ 0x3C3F296C;
                        continue block23;
                    }
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x971DB303, 22) ^ 0x422FBF9AF51A6796L ^ 0x422FBF9AF51A6796L);
                    int cfr_ignored_6 = (Integer.rotateLeft(0xDA634790 ^ n2, 14) + 1986218411) * -631027823;
                    n3 = Integer.rotateLeft(n2 ^ 0x15CFF2DB, 22);
                    n -= 3;
                    continue block23;
                }
                case -1810385572: {
                    int cfr_ignored_7 = (Integer.rotateRight(0x72BF9B52 ^ n2, 17) + -376345047) * 1925159763;
                    try {
                        n -= 5;
                        n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) + 311219415 - 311219415;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0x6E2F2E78358B0F3EL ^ 0x6E2F2E78358B0F3EL);
                    }
                    n += 2;
                    continue block23;
                }
                case 426453849: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0x14050515 ^ n2, 5) - 1895382214) * 335873301;
                    int cfr_ignored_9 = (int)(0xD6B7AB2827D4EB4FL ^ (long)n2 ^ 0xAB20831A2DB800BEL);
                    n3 = Integer.rotateLeft(n2 ^ 0xAC6A71F0, 22) ^ 0x35293455 ^ 0x35293455;
                    int cfr_ignored_10 = (Integer.rotateLeft(0xCE9CAF9C ^ n2, 12) - 156689183) * -828592227;
                    n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0x36A3FF9A ^ 0x36A3FF9A;
                    int cfr_ignored_11 = Integer.rotateRight(0xF95A3107 ^ n2, 18) - 910790420;
                    --n;
                    continue block23;
                }
                case -1757357116: {
                    int cfr_ignored_12 = Integer.rotateLeft(0xF069C42C ^ n2, 17) - 556556431;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x9FD4A, 22) ^ 0xFE81605FCA63E912L ^ 0xFE81605FCA63E912L);
                    int cfr_ignored_13 = Integer.rotateLeft(0x6B7C34C4 ^ n2, 16) - 141034231;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x5A363893, 22)));
                    continue block23;
                }
                case -1657886281: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x8809FED4 ^ n2, 4) - 2106817255) * -2012610859;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xCF6709B2, 22)));
                    int cfr_ignored_15 = (Integer.rotateLeft(0xF2590694 ^ n2, 17) - 1562733351) * -229046635;
                    try {
                        if ((0xEEA5C17E89B92809L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0xCAC6965A57E71008L ^ 0xCAC6965A57E71008L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0x360FE297 ^ 0x360FE297;
                    }
                    n -= 4;
                    continue block23;
                }
                case -975699759: {
                    int cfr_ignored_16 = Integer.rotateRight(0x87B328CE ^ n2, 3) - 1930399789;
                    n3 = Integer.rotateLeft(n2 ^ 0xA3466A5A, 22);
                    int cfr_ignored_17 = (Integer.rotateRight(0xDE8ED85E ^ n2, 14) - -139865443) * -561063841;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0x9713911CCE231AB5L ^ 0x9713911CCE231AB5L);
                    continue block23;
                }
                case 1651071694: {
                    int cfr_ignored_18 = Integer.rotateLeft(0xC237B961 ^ n2, 11) + -1994583558;
                    int cfr_ignored_19 = (int)(0x85175C27D4EB4FL ^ (long)n2 ^ 0xD3C8831A2DB9ACDBL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x81D2836D, 22)));
                    int cfr_ignored_20 = (Integer.rotateLeft(0x2E86D839 ^ n2, 8) + -1498296798) * 780589113;
                    int cfr_ignored_21 = (int)(0xEC34760427D4EB4FL ^ (long)n2 ^ 0x1178831A2DB875B9L);
                    try {
                        n += 3;
                        if ((0xC04922B3054E930BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0xFB16890A605F75B0L ^ 0xFB16890A605F75B0L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0x95092F81 ^ 0x95092F81;
                    }
                    ++n;
                    continue block23;
                }
                case -1407332371: {
                    int cfr_ignored_22 = Integer.rotateRight(0x4860C887 ^ n2, 12) - -938088556;
                    int cfr_ignored_23 = (int)(0xC767026428D810ABL ^ (long)n2 ^ 0xF9B89D03DA70231FL);
                    n3 = Integer.rotateLeft(n2 ^ 0x8EFE1A76, 22) + -1893872168 - -1893872168;
                    int cfr_ignored_24 = (int)(0xAA3635B1B212C0A2L ^ (long)n2 ^ 0x9613A8967A62F9BDL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x5A363893, 22)));
                    --n;
                    continue block23;
                }
                case -1781689642: {
                    int cfr_ignored_25 = Integer.rotateRight(0x991DEEE ^ n2, 4) - 755473933;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x22417AE1, 22) ^ 0x81709B9EBD60A8ADL ^ 0x81709B9EBD60A8ADL);
                    int cfr_ignored_26 = Integer.rotateRight(0x9E9D6B03 ^ n2, 6) + 963482776;
                    try {
                        n += 2;
                        if ((0x922B216B9FBBC67FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) + 497505159 - 497505159;
                    }
                    continue block23;
                }
                case -274458831: {
                    int cfr_ignored_27 = (Integer.rotateLeft(0x91278330 ^ n2, 5) + -1742306805) * -1859681487;
                    n3 = Integer.rotateLeft(n2 ^ 0x116F9DA5, 22) + 671505299 - 671505299;
                    int cfr_ignored_28 = (Integer.rotateLeft(0xD6F7F8D1 ^ n2, 13) + 207929482) * -688391983;
                    int cfr_ignored_29 = (int)(0x144556EC27D4EB4FL ^ (long)n2 ^ 0x50A8831A2DB9855BL);
                    int cfr_ignored_30 = (int)(0xC61B5114C4D90971L ^ (long)n2 ^ 0x5F594501E9C421E7L);
                    n3 = Integer.rotateLeft(n2 ^ 0x56AFEB87, 22);
                    int cfr_ignored_31 = (int)(0x6D9C1405DE632EAEL ^ (long)n2 ^ 0xD57B7075A67B76E9L);
                    n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0xD8F0627 ^ 0xD8F0627;
                    continue block23;
                }
                case 1997330041: {
                    int cfr_ignored_32 = (Integer.rotateLeft(0x24F90879 ^ n2, 7) + 2122687970) * 620300409;
                    int cfr_ignored_33 = (int)(0xE64BA64427D4EB4FL ^ (long)n2 ^ 0xB1F8831A2DB86146L);
                    n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) ^ 0x81155C27 ^ 0x81155C27;
                    int cfr_ignored_34 = Integer.rotateRight(0xADBC40A7 ^ n2, 8) - 237597556;
                    continue block23;
                }
            }
            int cfr_ignored_35 = (Integer.rotateRight(0x9EC4189B ^ n2, 6) + 1042061824) * -1631315813;
            n3 = Integer.rotateLeft(n2 ^ 0x5A363893, 22) + -471093020 - -471093020;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int bsw() {
        var1_1 = 0;
        var2_2 = 0;
        var5_3 = 0;
        var3_4 = -517702574;
        var3_4 = Integer.rotateLeft(var3_4 * -1503183, 9) ^ -558205455;
        var3_4 = Integer.rotateRight(System.identityHashCode(this) ^ var3_4, 9);
        var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) + 248225393 - 248225393;
        while (true) {
            block46: {
                block62: {
                    block67: {
                        block63: {
                            block59: {
                                block53: {
                                    block60: {
                                        block51: {
                                            block54: {
                                                block69: {
                                                    block49: {
                                                        block64: {
                                                            block48: {
                                                                block70: {
                                                                    block47: {
                                                                        block55: {
                                                                            block52: {
                                                                                block68: {
                                                                                    block61: {
                                                                                        block44: {
                                                                                            block66: {
                                                                                                block45: {
                                                                                                    block56: {
                                                                                                        block65: {
                                                                                                            block57: {
                                                                                                                block58: {
                                                                                                                    block41: {
                                                                                                                        block50: {
                                                                                                                            block42: {
                                                                                                                                block43: {
                                                                                                                                    if ((var5_3 = Integer.reverse(var4_5) ^ var3_4 ^ -1208251066) > -459321337) break block41;
                                                                                                                                    if (var5_3 > -1303534611) break block42;
                                                                                                                                    if (var5_3 > -1782440946) break block43;
                                                                                                                                    if (var5_3 == -1984952187) break block44;
                                                                                                                                    if (var5_3 == -1782440946) break block45;
                                                                                                                                    break block46;
                                                                                                                                }
                                                                                                                                if (var5_3 == -1588236635) break block47;
                                                                                                                                if (var5_3 == -1351806316) break block48;
                                                                                                                                (Integer.rotateRight(1286875899 ^ var3_4, 12) + 1311691680) * 1286875899;
                                                                                                                                if (var5_3 == -1303534611) break block49;
                                                                                                                                break block46;
                                                                                                                            }
                                                                                                                            if (var5_3 > -907581691) break block50;
                                                                                                                            if (var5_3 == -1251423309) break block51;
                                                                                                                            if (var5_3 == -1118374421) break block52;
                                                                                                                            (Integer.rotateLeft(1047039412 ^ var3_4, 10) - -1828272121) * 1047039413;
                                                                                                                            if (var5_3 == -907581691) break block53;
                                                                                                                            break block46;
                                                                                                                        }
                                                                                                                        if (var5_3 == -868500952) break block54;
                                                                                                                        if (var5_3 == -669025553) break block55;
                                                                                                                        (Integer.rotateRight(-913017505 ^ var3_4, 12) - 1834472892) * -913017505;
                                                                                                                        if (var5_3 == -459321337) break block56;
                                                                                                                        break block46;
                                                                                                                    }
                                                                                                                    if (var5_3 > 291102057) break block57;
                                                                                                                    if (var5_3 > -64786224) break block58;
                                                                                                                    if (var5_3 == -328884818) break block59;
                                                                                                                    if (var5_3 == -79881028) break block60;
                                                                                                                    if (var5_3 == -64786224) break block61;
                                                                                                                    break block46;
                                                                                                                }
                                                                                                                if (var5_3 == 5971687) break block62;
                                                                                                                if (var5_3 == 105199150) break block63;
                                                                                                                if (var5_3 == 291102057) break block64;
                                                                                                                break block46;
                                                                                                            }
                                                                                                            if (var5_3 > 1469761846) break block65;
                                                                                                            if (var5_3 == 510080147) break block66;
                                                                                                            if (var5_3 == 651971136) break block67;
                                                                                                            if (var5_3 == 1469761846) break block68;
                                                                                                            break block46;
                                                                                                        }
                                                                                                        if (var5_3 == 1558883261) break block69;
                                                                                                        if (var5_3 != 1890329723) {
                                                                                                            if (var5_3 == 1929050025) {
                                                                                                                (Integer.rotateLeft(-264608103 ^ var3_4, 17) + 460327874) * -264608103;
                                                                                                                (int)(3641380906097503055L ^ (long)var3_4 ^ 7798126903251552448L);
                                                                                                                if (var1_1 < -1340276330 - -1340276380) {
                                                                                                                    (int)(515902170702416694L ^ (long)var3_4 ^ 5324419794886960000L);
                                                                                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1655598708 ^ -1208251066)));
                                                                                                                    (int)(-7824308743667546471L ^ (long)var3_4 ^ 882404118878259973L);
                                                                                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -459321337 ^ -1208251066)));
                                                                                                                    var5_3 += 4;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                try {
                                                                                                                    if ((-716284176722185609L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                                        throw new IllegalArgumentException();
                                                                                                                    }
                                                                                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1118374421 ^ -1208251066)));
                                                                                                                }
                                                                                                                catch (IllegalArgumentException v0) {
                                                                                                                    var4_5 = Integer.reverse(var3_4 ^ -1118374421 ^ -1208251066) + -1024764045 - -1024764045;
                                                                                                                }
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                ** GOTO lbl81
                                                                                                            }
                                                                                                        }
                                                                                                        break block70;
lbl81:
                                                                                                        // 2 sources

                                                                                                        break block46;
                                                                                                    }
                                                                                                    (Integer.rotateLeft(1088320473 ^ var3_4, 11) + -548559230) * 1088320473;
                                                                                                    (int)(-9048613579303621809L ^ (long)var3_4 ^ 5095967126829181192L);
                                                                                                    var2_2 = 1;
                                                                                                    try {
                                                                                                        ++var5_3;
                                                                                                        if ((5951463873824975991L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                            throw new IllegalStateException();
                                                                                                        }
                                                                                                        var4_5 = Integer.reverse(var3_4 ^ 5971687 ^ -1208251066);
                                                                                                    }
                                                                                                    catch (IllegalStateException v1) {
                                                                                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ 5971687 ^ -1208251066) ^ 859439147160554472L ^ 859439147160554472L);
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                (Integer.rotateRight(-309850474 ^ var3_4, 16) - -942185627) * -309850473;
                                                                                                if (!wb.bthd_2()) {
                                                                                                    (int)(-6472532464746682649L ^ (long)var3_4 ^ 1835392347880874376L);
                                                                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1984952187 ^ -1208251066)));
                                                                                                    var5_3 -= 3;
                                                                                                    continue;
                                                                                                }
                                                                                                var4_5 = Integer.reverse(var3_4 ^ -1588236635 ^ -1208251066) ^ 637966910 ^ 637966910;
                                                                                                Integer.rotateRight(1942264942 ^ var3_4, 17) - 153915533;
                                                                                                var5_3 -= 2;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateRight(-1316633046 ^ var3_4, 9) + -2087674287;
                                                                                            var2_2 = Math.max(1, Math.round(wb.dha_6(this.thbsh)) - 1);
                                                                                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1754747632 ^ -1208251066)));
                                                                                            (Integer.rotateLeft(1429699957 ^ var3_4, 13) - 1444270182) * 1429699957;
                                                                                            (int)(-7528378895220544689L ^ (long)var3_4 ^ 6620435600694084314L);
                                                                                            var4_5 = Integer.reverse(var3_4 ^ 5971687 ^ -1208251066);
                                                                                            var5_3 -= 3;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateLeft(-1888933903 ^ var3_4, 4) + 1645835626) * -1888933903;
                                                                                        (int)(5610229270754683727L ^ (long)var3_4 ^ -1231590349626329498L);
                                                                                        if (!this.zbh_2.shzl()) {
                                                                                            var4_5 = Integer.reverse(var3_4 ^ -1752536455 ^ -1208251066) ^ 1250947271 ^ 1250947271;
                                                                                            Integer.rotateRight(987232039 ^ var3_4, 10) - 612666612;
                                                                                            var4_5 = Integer.reverse(var3_4 ^ 1469761846 ^ -1208251066);
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            if ((-1718411948108700981L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                            var4_5 = Integer.reverse(var3_4 ^ -669025553 ^ -1208251066) + -306344901 - -306344901;
                                                                                        }
                                                                                        catch (IllegalStateException v2) {
                                                                                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ -669025553 ^ -1208251066) ^ -9077606999144076880L ^ -9077606999144076880L);
                                                                                        }
                                                                                        var5_3 += 3;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateLeft(990697917 ^ var3_4, 10) - 720108830) * 990697917;
                                                                                    (int)(-450791520382686385L ^ (long)var3_4 ^ 1328706038533742253L);
                                                                                    var2_2 = Math.round(wb.tzz_5(this.thbsh));
                                                                                    try {
                                                                                        var5_3 -= 5;
                                                                                        if ((-7045483087287933531L ^ (long)var3_4 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ 5971687 ^ -1208251066) ^ 8329490241808895211L ^ 8329490241808895211L);
                                                                                    }
                                                                                    catch (UnsupportedOperationException v3) {
                                                                                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 5971687 ^ -1208251066)));
                                                                                    }
                                                                                    ++var5_3;
                                                                                    continue;
                                                                                }
                                                                                Integer.rotateLeft(-1744833812 ^ var3_4, 5) - 1817971151;
                                                                                var2_2 = Math.round(wb.tzz_5(this.thbsh));
                                                                                try {
                                                                                    var4_5 = Integer.reverse(var3_4 ^ 5971687 ^ -1208251066) + 298213129 - 298213129;
                                                                                }
                                                                                catch (IllegalStateException v4) {
                                                                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ 5971687 ^ -1208251066) ^ 6643258004446215054L ^ 6643258004446215054L);
                                                                                }
                                                                                var5_3 += 4;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateLeft(1078813501 ^ var3_4, 11) - -843275362) * 1078813501;
                                                                            (int)(-9007255329165743281L ^ (long)var3_4 ^ 7453601531757635630L);
                                                                            var2_2 = Math.round(this.thbsh.thw_5());
                                                                            try {
                                                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 5971687 ^ -1208251066)));
                                                                            }
                                                                            catch (UnsupportedOperationException v5) {
                                                                                var4_5 = Integer.reverse(var3_4 ^ 5971687 ^ -1208251066) + -971004177 - -971004177;
                                                                            }
                                                                            var5_3 -= 3;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateRight(-1291408421 ^ var3_4, 9) + -1305710912) * -1291408421;
                                                                        var1_1 = wb.hnh_2(this);
                                                                        if ((float)var1_1 > this.jkd.thw_5()) {
                                                                            try {
                                                                                var5_3 -= 2;
                                                                                if ((4616756524868526559L ^ (long)var3_4 | 1L) == 0L) {
                                                                                    throw new NoSuchElementException();
                                                                                }
                                                                                var4_5 = Integer.reverse(var3_4 ^ 510080147 ^ -1208251066) ^ -274788247 ^ -274788247;
                                                                            }
                                                                            catch (NoSuchElementException v6) {
                                                                                var4_5 = Integer.reverse(var3_4 ^ 510080147 ^ -1208251066) ^ 129033665 ^ 129033665;
                                                                            }
                                                                            --var5_3;
                                                                            continue;
                                                                        }
                                                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ -521805672 ^ -1208251066) ^ 3861010968744188248L ^ 3861010968744188248L);
                                                                        (Integer.rotateRight(1195738967 ^ var3_4, 11) - -1513553212) * 1195738967;
                                                                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1929050025 ^ -1208251066)));
                                                                        continue;
                                                                    }
                                                                    Integer.rotateLeft(1128487976 ^ var3_4, 11) + 696633363;
                                                                    throw null;
                                                                }
                                                                Integer.rotateLeft(-2094672916 ^ var3_4, 3) - -437106481;
                                                                var4_5 = (int)((long)Integer.reverse(var3_4 ^ -2035760538 ^ -1208251066) ^ 4310204404136550151L ^ 4310204404136550151L);
                                                                (Integer.rotateRight(1060239095 ^ var3_4, 10) - -1419081948) * 1060239095;
                                                                (int)(6914768361028549996L ^ (long)var3_4 ^ -6984903951946673603L);
                                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1964431311 ^ -1208251066)));
                                                                (int)(3135038271097896887L ^ (long)var3_4 ^ 3753144067736337106L);
                                                                var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) ^ 1310900813 ^ 1310900813;
                                                                var5_3 -= 2;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(-1501986010 ^ var3_4, 7) - 756318421;
                                                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1609811578 ^ -1208251066)));
                                                            (Integer.rotateRight(-926481058 ^ var3_4, 12) - 1417102749) * -926481057;
                                                            (int)(4309107453993351288L ^ (long)var3_4 ^ -1027700092215764405L);
                                                            var4_5 = Integer.reverse(var3_4 ^ 1980250687 ^ -1208251066);
                                                            (int)(-6734423230023700064L ^ (long)var3_4 ^ -652562165015320380L);
                                                            var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066);
                                                            --var5_3;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-2084668414 ^ var3_4, 3) + -126966919;
                                                        try {
                                                            var5_3 += 4;
                                                            if ((-5599414918776778619L ^ (long)var3_4 | 1L) == 0L) {
                                                                throw new UnsupportedOperationException();
                                                            }
                                                            var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) + 471292031 - 471292031;
                                                        }
                                                        catch (UnsupportedOperationException v7) {
                                                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066)));
                                                        }
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(1073491514 ^ var3_4, 10) + -1008256959) * 1073491515;
                                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ 756207465 ^ -1208251066) ^ -5462495293536122129L ^ -5462495293536122129L);
                                                    (Integer.rotateLeft(-645985227 ^ var3_4, 14) - 1522538918) * -645985227;
                                                    (int)(2003435565161442127L ^ (long)var3_4 ^ -5088923430469133750L);
                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066)));
                                                    var5_3 += 3;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-393707755 ^ var3_4, 16) - 753205958) * -393707755;
                                                (int)(3042974468639353679L ^ (long)var3_4 ^ 6854622781317446052L);
                                                var4_5 = (int)((long)Integer.reverse(var3_4 ^ -761235088 ^ -1208251066) ^ -4904688037872122759L ^ -4904688037872122759L);
                                                (Integer.rotateLeft(292373045 ^ var3_4, 5) - 546874278) * 292373045;
                                                (int)(-3179563292128122033L ^ (long)var3_4 ^ 2693296725626980974L);
                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066)));
                                                Integer.rotateLeft(-1332059768 ^ var3_4, 9) + 1729064627;
                                                continue;
                                            }
                                            (Integer.rotateLeft(1001300181 ^ var3_4, 10) - 1048779014) * 1001300181;
                                            (int)(-496505468654130353L ^ (long)var3_4 ^ -2260662864480542743L);
                                            var4_5 = Integer.reverse(var3_4 ^ 796505555 ^ -1208251066);
                                            (Integer.rotateLeft(1428357105 ^ var3_4, 13) + 1402641770) * 1428357105;
                                            (int)(-7525425040052655281L ^ (long)var3_4 ^ 6838860182621553393L);
                                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066)));
                                            var5_3 -= 5;
                                            continue;
                                        }
                                        (Integer.rotateLeft(-898606764 ^ var3_4, 12) - -2013761433) * -898606763;
                                        var4_5 = Integer.reverse(var3_4 ^ 16128447 ^ -1208251066) ^ -294765689 ^ -294765689;
                                        (Integer.rotateRight(-1364964778 ^ var3_4, 8) - 709009317) * -1364964777;
                                        try {
                                            var5_3 -= 5;
                                            var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) ^ 797943649 ^ 797943649;
                                        }
                                        catch (UnsupportedOperationException v8) {
                                            var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066);
                                        }
                                        continue;
                                    }
                                    Integer.rotateRight(761643202 ^ var3_4, 8) + -2085620039;
                                    var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1350710610 ^ -1208251066)));
                                    (Integer.rotateLeft(-707355656 ^ var3_4, 13) + -379944381) * -707355655;
                                    var4_5 = Integer.reverse(var3_4 ^ -26117147 ^ -1208251066) ^ -1749479185 ^ -1749479185;
                                    (Integer.rotateRight(580889851 ^ var3_4, 7) + 900960672) * 580889851;
                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) ^ 7003966512227477842L ^ 7003966512227477842L);
                                    ++var5_3;
                                    continue;
                                }
                                (Integer.rotateLeft(-636525603 ^ var3_4, 14) - 1815787262) * -636525603;
                                (int)(1782807390133218127L ^ (long)var3_4 ^ 7399558336229252266L);
                                try {
                                    var5_3 -= 4;
                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) ^ 7184548778102033053L ^ 7184548778102033053L);
                                }
                                catch (IllegalArgumentException v9) {
                                    var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066);
                                }
                                continue;
                            }
                            Integer.rotateRight(-1755316153 ^ var3_4, 5) - 1493018580;
                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1723563393 ^ -1208251066) ^ -6429204481213568081L ^ -6429204481213568081L);
                            (Integer.rotateLeft(-740780972 ^ var3_4, 13) - -1416129177) * -740780971;
                            try {
                                var5_3 += 5;
                                if ((-2582580079512943653L ^ (long)var3_4 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) + 1031403380 - 1031403380;
                            }
                            catch (IllegalStateException v10) {
                                var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) ^ 1216804466 ^ 1216804466;
                            }
                            ++var5_3;
                            continue;
                        }
                        (Integer.rotateRight(-310692142 ^ var3_4, 16) + -968277335) * -310692141;
                        try {
                            if ((5887370735889371425L ^ (long)var3_4 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) ^ 159180308 ^ 159180308;
                        }
                        catch (UnsupportedOperationException v11) {
                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066) ^ -249771085642663844L ^ -249771085642663844L);
                        }
                        var5_3 += 4;
                        continue;
                    }
                    Integer.rotateLeft(-1217519195 ^ var3_4, 9) - 984855094;
                    (int)(8492820880979979087L ^ (long)var3_4 ^ -2143569274168850840L);
                    var4_5 = Integer.reverse(var3_4 ^ -1662136857 ^ -1208251066);
                    (Integer.rotateLeft(333619673 ^ var3_4, 5) + 1825519746) * 333619673;
                    (int)(-3364171449050535089L ^ (long)var3_4 ^ -2109792276963651727L);
                    try {
                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066)));
                    }
                    catch (IllegalArgumentException v12) {
                        var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066);
                    }
                    --var5_3;
                    continue;
                }
                return var2_2;
            }
            (Integer.rotateRight(-1303321633 ^ var3_4, 9) - -1675020484) * -1303321633;
            var4_5 = Integer.reverse(var3_4 ^ -1782440946 ^ -1208251066);
        }
    }

    private int khad_4() {
        int n = 2052204497;
        n = Integer.rotateLeft(n * -805235819, 15) ^ 0xFD061019;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xEDA68902;
        if ((n2 ^ n) != -307853054) {
            int cfr_ignored_0 = (0x97F4AED3 ^ n) + 2042745983;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (mc.method_1562() == null || wb.mc.field_1724 == null) {
            return 0;
        }
        class_640 class_6402 = mc.method_1562().method_2871(wb.mc.field_1724.method_5667());
        return class_6402 == null ? 0 : wb.rsw_2(class_6402);
    }

    private boolean stha_3(class_2338 class_23382) {
        if (wb.mc.field_1687 == null) {
            return false;
        }
        class_2338 class_23383 = class_23382.method_10084();
        if (!wb.mc.field_1687.method_22347(class_23383)) {
            return false;
        }
        class_238 class_2383 = new class_238((double)class_23383.method_10263(), (double)class_23383.method_10264(), (double)class_23383.method_10260(), (double)class_23383.method_10263() + 1.0, (double)class_23383.method_10264() + 2.0, (double)class_23383.method_10260() + 1.0);
        List list = wb.mc.field_1687.method_8335(null, class_2383);
        return list.isEmpty();
    }

    private void khkgh(class_1297 class_12972) {
        int n = 0;
        int n2 = 1646331437;
        n2 = Integer.rotateLeft(n2 * 118088167, 19) ^ 0x14022CA3;
        n2 = System.identityHashCode(this) ^ n2;
        class_1297 class_12973 = class_12972;
        n2 = Integer.rotateLeft((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n2, 2);
        int n3 = Integer.reverse(Integer.reverse(n2 ^ 0xE4EC484B));
        while (true) {
            block21: {
                block20: {
                    block33: {
                        block27: {
                            block18: {
                                block32: {
                                    block30: {
                                        block31: {
                                            block22: {
                                                block23: {
                                                    block19: {
                                                        block28: {
                                                            block26: {
                                                                block24: {
                                                                    block29: {
                                                                        block25: {
                                                                            block16: {
                                                                                block17: {
                                                                                    if ((n = n3 ^ n2) > -454277045) break block16;
                                                                                    if (n > -1543856731) break block17;
                                                                                    if (n == -1860200434) break block18;
                                                                                    if (n == -1573483624) break block19;
                                                                                    if (n == -1543856731) break block20;
                                                                                    break block21;
                                                                                }
                                                                                if (n == -1505984379) break block22;
                                                                                if (n == -693960253) break block23;
                                                                                int cfr_ignored_0 = (Integer.rotateLeft(0xA9B37A3C ^ n2, 8) - -1860604801) * -1447855555;
                                                                                if (n == -454277045) break block24;
                                                                                break block21;
                                                                            }
                                                                            if (n > 335170677) break block25;
                                                                            if (n == -342776473) break block26;
                                                                            if (n == 305591441) break block27;
                                                                            int cfr_ignored_1 = (Integer.rotateRight(0x3CE63B1B ^ n2, 10) + 1681835904) * 1021721371;
                                                                            if (n == 335170677) break block28;
                                                                            break block21;
                                                                        }
                                                                        if (n > 695379813) break block29;
                                                                        if (n == 465900359) break block30;
                                                                        if (n == 695379813) break block31;
                                                                        int cfr_ignored_2 = (Integer.rotateRight(0x1F1EE1BF ^ n2, 6) - -920980132) * 522117567;
                                                                        break block21;
                                                                    }
                                                                    if (n == 825097437) break block32;
                                                                    if (n == 1754957214) break block33;
                                                                    int cfr_ignored_3 = Integer.rotateRight(0x6D641EEA ^ n2, 16) + 1132289425;
                                                                    break block21;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x4C158351 ^ n2, 12) + 989365770) * 1276478289;
                                                                int cfr_ignored_5 = (int)(0x8EA72D6C27D4EB4FL ^ (long)n2 ^ 0xA7A8831A2DB8B09FL);
                                                                if (!yf.khdha_2()) {
                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x13FA4C75));
                                                                    int cfr_ignored_6 = Integer.rotateLeft(0x4EC884C9 ^ n2, 12) + -1901743214;
                                                                    int cfr_ignored_7 = (int)(0x8C7A2AF427D4EB4FL ^ (long)n2 ^ 0xA898831A2DB8B525L);
                                                                    n -= 2;
                                                                    continue;
                                                                }
                                                                n3 = n2 ^ 0xD62B90D1;
                                                                int cfr_ignored_8 = (Integer.rotateLeft(0xB7841BB0 ^ n2, 9) + 1029503371) * -1216078927;
                                                                n3 = n2 ^ 0xEB91A567;
                                                                n -= 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_9 = (Integer.rotateRight(0xDB31E9D3 ^ n2, 14) + -1888948280) * -617485869;
                                                            class_12972.method_31472();
                                                            class_12972.method_31745(class_1297.class_5529.field_26998);
                                                            class_12972.method_36209();
                                                            return;
                                                        }
                                                        int cfr_ignored_10 = Integer.rotateLeft(0xBD5CE881 ^ n2, 10) + -224540966;
                                                        int cfr_ignored_11 = (int)(0x7FEE46BC27D4EB4FL ^ (long)n2 ^ 0x7008831A2DB9520DL);
                                                        wb.tza_3();
                                                        try {
                                                            n -= 2;
                                                            if ((0x4B89F61B11A1ADCBL ^ (long)n2 | 1L) == 0L) {
                                                                throw new UnsupportedOperationException();
                                                            }
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEB91A567));
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            n3 = n2 ^ 0xEB91A567;
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_12 = (Integer.rotateLeft(0xA01C6351 ^ n2, 7) + 1741530634) * -1608752303;
                                                    int cfr_ignored_13 = (int)(0x62AECD6C27D4EB4FL ^ (long)n2 ^ 0x67A8831A2DB9688CL);
                                                    int cfr_ignored_14 = (int)(0xA502F9801658F26CL ^ (long)n2 ^ 0xE70E0021FFEE7D4L);
                                                    n3 = n2 ^ 0x5A91E7AA ^ 0x94EABC03 ^ 0x94EABC03;
                                                    int cfr_ignored_15 = (int)(0xF71C735C86ACA3A4L ^ (long)n2 ^ 0x1BC9C1EABC6E43E9L);
                                                    n3 = n2 ^ 0xE4EC484B ^ 0x1EAE88E6 ^ 0x1EAE88E6;
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_16 = (Integer.rotateLeft(0x79A7E65C ^ n2, 18) - -1078819745) * 2041046621;
                                                n3 = (int)((long)(n2 ^ 0xE4EC484B) ^ 0xA1CB347A00463723L ^ 0xA1CB347A00463723L);
                                                continue;
                                            }
                                            int cfr_ignored_17 = Integer.rotateLeft(0x1ED7F3C8 ^ n2, 6) + -1065081741;
                                            n3 = n2 ^ 0xE4EC484B;
                                            n -= 5;
                                            continue;
                                        }
                                        int cfr_ignored_18 = (Integer.rotateLeft(0x44C607B9 ^ n2, 11) + 1482198690) * 1153828793;
                                        int cfr_ignored_19 = (int)(0x8674A98427D4EB4FL ^ (long)n2 ^ 0xAE78831A2DB8A138L);
                                        n3 = n2 ^ 0xFFF2FDB5;
                                        int cfr_ignored_20 = (Integer.rotateLeft(0xB4E8BA18 ^ n2, 9) + -326359005) * -1259816423;
                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xE4EC484B));
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_21 = Integer.rotateRight(0xB67F2F2E ^ n2, 9) - 499406285;
                                    n3 = n2 ^ 0x293FD4DE;
                                    int cfr_ignored_22 = (Integer.rotateLeft(0xAFF95579 ^ n2, 8) + 1401878754) * -1342614151;
                                    int cfr_ignored_23 = (int)(0x6D4BFB4427D4EB4FL ^ (long)n2 ^ 0xBF8831A2DB97746L);
                                    int cfr_ignored_24 = (int)(0x5F7E5D618D157D29L ^ (long)n2 ^ 0x47B3D6990175132DL);
                                    n3 = n2 ^ 0x6205DAE6 ^ 0x915DFBE3 ^ 0x915DFBE3;
                                    int cfr_ignored_25 = (int)(0xEB7FC6462B30A8E7L ^ (long)n2 ^ 0x71FC9AD2AAE87B2EL);
                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xE4EC484B));
                                    continue;
                                }
                                int cfr_ignored_26 = Integer.rotateLeft(0xE77A26C4 ^ n2, 15) - 203968759;
                                n3 = n2 ^ 0x696ADD7D ^ 0xBFB3520E ^ 0xBFB3520E;
                                int cfr_ignored_27 = (Integer.rotateRight(0x54BCA633 ^ n2, 13) + 1194704744) * 1421649459;
                                try {
                                    n += 2;
                                    n3 = (n2 ^ 0xE4EC484B) + -797491135 - -797491135;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xE4EC484B));
                                }
                                continue;
                            }
                            int cfr_ignored_28 = (Integer.rotateRight(0xBB0C62BF ^ n2, 10) - -1428319140) * -1156816193;
                            int cfr_ignored_29 = (int)(0x7E66DB015355FBF1L ^ (long)n2 ^ 0x4B726A180CC5511CL);
                            n3 = n2 ^ 0x763C7408;
                            int cfr_ignored_30 = (int)(0xE5DDE2612D1D77E2L ^ (long)n2 ^ 0x39B2968914E2666AL);
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xE4EC484B));
                            n += 4;
                            continue;
                        }
                        int cfr_ignored_31 = Integer.rotateLeft(0x1BC6F044 ^ n2, 6) - 1635039095;
                        try {
                            n -= 3;
                            if ((0xECBB1FF4841A6E4BL ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xE4EC484B));
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = n2 ^ 0xE4EC484B;
                        }
                        n -= 4;
                        continue;
                    }
                    int cfr_ignored_32 = (Integer.rotateLeft(0x9338CE39 ^ n2, 5) + -666986462) * -1824993735;
                    int cfr_ignored_33 = (int)(0x518A600427D4EB4FL ^ (long)n2 ^ 0x3D78831A2DB90EC5L);
                    n3 = (n2 ^ 0x802A63) + 1411317020 - 1411317020;
                    int cfr_ignored_34 = Integer.rotateRight(0x98300E02 ^ n2, 6) + 1915703673;
                    try {
                        n -= 3;
                        if ((0x27D5461DAD4D26D1L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 ^ 0xE4EC484B;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0xE4EC484B) + -2029253590 - -2029253590;
                    }
                    continue;
                }
                int cfr_ignored_35 = Integer.rotateRight(0xEC88FFE3 ^ n2, 16) + -1460364360;
                n3 = (int)((long)(n2 ^ 0x6ED08EA4) ^ 0x8FEA4154FAD30317L ^ 0x8FEA4154FAD30317L);
                int cfr_ignored_36 = Integer.rotateLeft(0xA01A2CA4 ^ n2, 7) - 1737033495;
                try {
                    n -= 2;
                    if ((0x5065858E3462E92DL ^ (long)n2 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    n3 = (int)((long)(n2 ^ 0xE4EC484B) ^ 0x24D23E28B2393B3CL ^ 0x24D23E28B2393B3CL);
                }
                catch (IllegalStateException illegalStateException) {
                    n3 = n2 ^ 0xE4EC484B ^ 0x7A7DA413 ^ 0x7A7DA413;
                }
                n += 2;
                continue;
            }
            int cfr_ignored_37 = Integer.rotateRight(0x2EAF3A2A ^ n2, 8) + -1416254895;
            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xE4EC484B));
        }
    }

    @Generated
    public static wb zrdh() {
        block0: {
            int n = 1481438516;
            int n2 = (n = Integer.rotateLeft(n * 1589316613, 13) ^ 0x826F3E23) ^ 0xE0F145E5;
            if ((n2 ^ n) == -521058843) break block0;
            int cfr_ignored_0 = (0xB8BDB0D1 ^ n) - -15731616;
        }
        return szz_3;
    }

    private void dfk_2(class_3965 class_39652) {
        mc.execute(() -> this.ththy(class_39652));
    }

    private void ththy(class_3965 class_39652) {
        if (!this.rgha_2() || wb.mc.field_1724 == null || wb.mc.field_1687 == null) {
            this.bdhm = false;
            return;
        }
        this.tah_3 = true;
        try {
            class_1269 class_12692 = wb.mc.field_1761.method_2896(wb.mc.field_1724, class_1268.field_5808, class_39652);
            if (class_12692.method_23665()) {
                wb.mc.field_1724.method_6104(class_1268.field_5808);
                this.thld = System.currentTimeMillis();
            }
        }
        finally {
            this.tah_3 = false;
            this.bdhm = false;
        }
    }

    private void sssh_4(bkf bkf2) {
        try {
            int n = -1184966010;
            n = Integer.rotateLeft(n * 679890845, 26) ^ 0x9B81425A;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x9ECAB4BD;
            if ((n2 ^ n) != -1630882627) {
                int cfr_ignored_0 = (0x27946E3B ^ n) + 1254725886;
            }
            if ((0x305 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!this.rgha_2() || wb.mc.field_1724 == null || this.khzt || !this.hzs_3(bkf2.khdl_2())) {
            return;
        }
        if (this.jshk >= this.bsw()) {
            bkf2.dhtd_2();
            return;
        }
        long l = System.currentTimeMillis();
        if (l - this.khght_2 < (long)Math.round(this.thbz_2.thw_5())) {
            bkf2.dhtd_2();
            return;
        }
        if (this.bfr.shzl() && this.jshk >= 1) {
            this.khkgh(bkf2.khdl_2());
        }
        ++this.jshk;
        this.khght_2 = l;
    }

    private void dls_3(bghq bghq2) {
        try {
            int n = 703171234;
            n = Integer.rotateLeft(n * -767670551, 27) ^ 0x8C3EFDAE;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xFEB65EBF;
            if ((n2 ^ n) != -21602625) {
                int cfr_ignored_0 = (0xD75FD41D ^ n) + 1471328810;
            }
            if ((0x2AA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (bghq2.sll() == wb.mc.field_1724) {
            this.tba(false);
        }
    }

    private void khsj_2(btt btt2) {
        int n = 2043818103;
        n = Integer.rotateLeft(n * 532917595, 6) ^ 0xC602D137;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
        btt btt3 = btt2;
        n = Integer.rotateLeft((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 28);
        int n2 = n ^ 0xA3BF853A;
        if ((n2 ^ n) != -1547729606) {
            int cfr_ignored_0 = (0xDA6DB54D ^ n) - 1830882061;
        }
        this.dda_2();
    }

    private static String khly(String string, int n, int n2, int n3) {
        int n4 = -1883456023;
        n4 = Integer.rotateLeft(n4 * 1584973331, 5) ^ 0xD05FB4A8;
        n4 = n2 ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 27)) ^ 0x9BC663A2;
        if ((n5 ^ n4) != -1681497182) {
            int cfr_ignored_0 = (0x147ADE4B ^ n4) - 1922815595;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xB4433D27 ^ n2 - i) + dhtt_2, 21) ^ khkht + i * 1485378339));
        }
        return new String(cArray);
    }

    private static boolean rss_4(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = zh_2.khqdh(694982752);
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 28);
            class_1792 class_17923 = class_17922;
            n = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n;
            int n2 = n ^ 0xC1E7C49B;
            if ((n2 ^ n) == -1041775461) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE88B5CFB ^ n, 16) + 759030176) * -393519877;
        }
        return class_17992.method_31574(class_17922);
    }

    private static boolean tzt_3(wb wb2, class_2338 class_23382) {
        block0: {
            int n = 1809164027;
            n = Integer.rotateLeft(n * 778912771, 27) ^ 0xF8EB8B86;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 19);
            int n2 = n ^ 0x701C610E;
            if ((n2 ^ n) == 1880908046) break block0;
            int cfr_ignored_0 = (0x1BC9C7F5 ^ n) - -103782036;
        }
        return wb2.bzz_4(class_23382);
    }

    private static long zzh_3() {
        block0: {
            int n = 1556314084;
            int n2 = (n = Integer.rotateLeft(n * -203123403, 14) ^ 0xF360BE18) ^ 0x4E652AC2;
            if ((n2 ^ n) == 1315252930) break block0;
            int cfr_ignored_0 = (0x12A65D26 ^ n) - 2122221327;
        }
        return System.currentTimeMillis();
    }

    private static boolean sqa_4(wb wb2, class_1297 class_12972) {
        block0: {
            int n = -1717956720;
            n = Integer.rotateLeft(n * -1352672073, 26) ^ 0x79A6DDDF;
            wb wb3 = wb2;
            n = (wb3 != null ? System.identityHashCode(wb3) : 0) ^ n;
            int n2 = n ^ 0xB1F171C0;
            if ((n2 ^ n) == -1309576768) break block0;
            int cfr_ignored_0 = (0x286B7E50 ^ n) - -573775819;
        }
        return wb2.hzs_3(class_12972);
    }

    private static float sfa_3(class_746 class_7462) {
        block0: {
            int n = -852953030;
            int n2 = (n = Integer.rotateLeft(n * 0x52526655, 24) ^ 0x48EDB7BC) ^ 0x388514B8;
            if ((n2 ^ n) == 948245688) break block0;
            int cfr_ignored_0 = (0xF5ADEC82 ^ n) + 320510858;
        }
        return class_7462.method_36454();
    }

    private static float thzz_2(class_746 class_7462) {
        block0: {
            int n = zh_2.khqdh(1557659014);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x60DC2E27;
            if ((n2 ^ n) == 1625042471) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x3C0BD3A1 ^ n, 10) + 1238122426;
            int cfr_ignored_1 = (int)(0xFEB97D9C27D4EB4FL ^ (long)n ^ 0x648831A2DB850A3L);
        }
        return class_7462.method_36454();
    }

    private static float thtkh(float f) {
        block0: {
            int n = -1115777434;
            int n2 = (n = Integer.rotateLeft(n * -225712539, 19) ^ 0x25BB2832) ^ 0xE3FEE564;
            if ((n2 ^ n) == -469834396) break block0;
            int cfr_ignored_0 = (0x5E807302 ^ n) + -1291892681;
        }
        return class_3532.method_15374((float)f);
    }

    private static float jthn(class_746 class_7462) {
        block0: {
            int n = -1012551184;
            int n2 = (n = Integer.rotateLeft(n * 928321045, 7) ^ 0xBE2E4F07) ^ 0xAF12A3DB;
            if ((n2 ^ n) == -1357732901) break block0;
            int cfr_ignored_0 = (0x6CB7122B ^ n) - 640780543;
        }
        return class_7462.method_36455();
    }

    private static float khla_2(float f) {
        block0: {
            int n = zh_2.khqdh(387842358);
            int n2 = n ^ 0x7D98042B;
            if ((n2 ^ n) == 2107114539) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6A86051D ^ n, 16) - -359121474) * 1787168029;
            int cfr_ignored_1 = (int)(0xA834AB2027D4EB4FL ^ (long)n ^ 0xAB30831A2DB8FDB8L);
        }
        return class_3532.method_15362((float)f);
    }

    private static float da_3(class_746 class_7462) {
        block0: {
            int n = zh_2.khqdh(-270006611);
            int n2 = n ^ 0x6C419C83;
            if ((n2 ^ n) == 1816239235) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x83A99A2E ^ n, 3) - -169391411;
        }
        return class_7462.method_36455();
    }

    private static boolean bthd_2() {
        block0: {
            int n = -1228890614;
            int n2 = (n = Integer.rotateLeft(n * -1822325789, 18) ^ 0x908FFB63) ^ 0x5EC76DA8;
            if ((n2 ^ n) == 1590128040) break block0;
            int cfr_ignored_0 = (0xE807F3A2 ^ n) - -932149;
        }
        return yf.dnkh();
    }

    private static float tzz_5(tay tay2) {
        block0: {
            int n = -520013942;
            n = Integer.rotateLeft(n * -1767900599, 24) ^ 0x10D736CD;
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0x45FDFD0B;
            if ((n2 ^ n) == 1174273291) break block0;
            int cfr_ignored_0 = (0xA4FCCA81 ^ n) + -1758701865;
        }
        return tay2.thw_5();
    }

    private static int hnh_2(wb wb2) {
        block0: {
            int n = -1129597909;
            int n2 = (n = Integer.rotateLeft(n * -2040613057, 27) ^ 0xB438881F) ^ 0xD2A99F83;
            if ((n2 ^ n) == -760635517) break block0;
            int cfr_ignored_0 = (0x6E022BA8 ^ n) - -1135571940;
        }
        return wb2.khad_4();
    }

    private static float dha_6(tay tay2) {
        block0: {
            int n = zh_2.khqdh(1720475310);
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0x8F244F70;
            if ((n2 ^ n) == -1893445776) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE9A811DE ^ n, 16) - 1337444637) * -374861345;
        }
        return tay2.thw_5();
    }

    private static int rsw_2(class_640 class_6402) {
        block0: {
            int n = -926861691;
            n = Integer.rotateLeft(n * -370908507, 19) ^ 0x92F94EA7;
            class_640 class_6403 = class_6402;
            n = (class_6403 != null ? System.identityHashCode(class_6403) : 0) ^ n;
            int n2 = n ^ 0xFCE6EA5B;
            if ((n2 ^ n) == -51975589) break block0;
            int cfr_ignored_0 = (0x3427DCDE ^ n) + -1259792413;
        }
        return class_6402.method_2959();
    }

    private static void tza_3() {
        int n = -1424609663;
        int n2 = (n = Integer.rotateLeft(n * -680892073, 25) ^ 0x15ACF223) ^ 0x5D2A1F0A;
        if ((n2 ^ n) != 1563041546) {
            int cfr_ignored_0 = (0xF63C318B ^ n) + -720376229;
        }
        yf.athz_2();
    }

    private static String[] jhj_2(String string) {
        int n = 1746321955;
        int n2 = (n = Integer.rotateLeft(n * 1181451339, 24) ^ 0x802C246F) ^ 0x54BE2853;
        if ((n2 ^ n) != 1421748307) {
            int cfr_ignored_0 = (0x3CA8EA70 ^ n) + 447127857;
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

    private static CallSite dmd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 785530233;
            n3 = Integer.rotateLeft(n3 * 1613841019, 13) ^ 0xE49733F9;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 26);
            int n4 = n3 ^ 0x3FDE3AC3;
            if ((n4 ^ n3) != 1071528643) {
                int cfr_ignored_0 = (0x110C07BA ^ n3) - -2050249169;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dkht_2 ^ string.hashCode() ^ n2 + hhs + i * -1444317729) + dkht_2) ^ hhs));
            }
            String[] stringArray = wb.jhj_2(new String(cArray));
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

    private static String[] y62qzf7r(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gf29lcwq2b(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ eknpfs2cr ^ string.hashCode() ^ n2 + fsf8fidy1 ^ i * -1933328291 ^ eknpfs2cr, 10) ^ fsf8fidy1));
            }
            String[] stringArray = wb.y62qzf7r(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

