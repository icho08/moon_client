/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10156
 *  net.minecraft.class_10366
 *  net.minecraft.class_1799
 *  net.minecraft.class_1806
 *  net.minecraft.class_276
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_5498
 *  net.minecraft.class_5944
 *  net.minecraft.class_6367
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_10156;
import net.minecraft.class_10366;
import net.minecraft.class_1799;
import net.minecraft.class_1806;
import net.minecraft.class_276;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_5498;
import net.minecraft.class_5944;
import net.minecraft.class_6367;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tdk;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fth;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Echo Hand", category=bzw.OTHER, desc="Adds delayed glow around first-person hands and items")
public class bsh_5
extends bnq {
    private static bsh_5 dhrh_2;
    private static final int sdhd_2 = 2;
    private final khd shshsh = new khd(this, "Mode");
    private final fy kz_2 = new fy(this.shshsh, "Echo Trail");
    private final fy dks_2 = new fy(this.shshsh, "Flame");
    public static final fth shbr;
    private static final class_10156 dhdz;
    public static final fth sthf_2;
    private static final class_10156 hq;
    private final badh_2 try_2 = new badh_2((hy)this, "Echo Trail", this::trn).bts(true);
    private final tay shbh = new tay((hy)this, "Strength", this::dks_2).shth_7(Float.intBitsToFloat(0xBDF662AD ^ 0x80BAAE60)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xF63A6A05 ^ 0x363A6A3A, 24))).rkh_3(Float.intBitsToFloat(1291862740 - 263419399)).ssd_5(Float.intBitsToFloat(Integer.reverse(353406605) ^ 0x8E3108A8));
    private final tay dnm = new tay((hy)this, "Radius", this::sfh_3).shth_7(2.0f).dhbs_2(Float.intBitsToFloat(1040268749 - -64930355)).rkh_3(Float.intBitsToFloat(880489560 - -176475048)).ssd_5(Float.intBitsToFloat(-67236658 + 1160901426));
    private final tay tghl = new tay((hy)this, "Trail", this::zhq).shth_7(Float.intBitsToFloat(880064530 - -177738939)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xB119FB33 ^ 0xF68641D2, 9))).rkh_3(Float.intBitsToFloat(0xC1BE16B8 ^ 0xFD9DC1B2)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x4C5BCD26 ^ 0x1DB2379E, 13)));
    private final tay dfq = new tay((hy)this, "Lag", this::zhdh_3).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0xA624B693 ^ 0xE664B693)).rkh_3(Float.intBitsToFloat(-2023613599 + -1242910356)).ssd_5(Float.intBitsToFloat(234123976 - -832487531));
    private final bzw_2 jdy = new bzw_2(this, "Color", this::thrk).dhshy(byq.tkhw(-1916351966 - -991957936));
    private final badh_2 djh = new badh_2((hy)this, "Outside".concat(" Only"), this::khh_2).bts(true);
    private final khd rkha = new khd((hy)this, "Flame Color", this::khjdh);
    private final fy hsw = new fy(this.rkha, "Custom");
    private final fy thlt_2 = new fy(this.rkha, "Client");
    private final fy dql = new fy(this.rkha, "Rainbow");
    private final bzw_2 zyf = new bzw_2(this, "Flame Color Value", this::sys).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-2087546783) ^ 0xC57649C1), Float.intBitsToFloat(2144657106 + -1012260562), Float.intBitsToFloat(-1968440552 - 1194130200), Float.intBitsToFloat(Integer.rotateLeft(0x71FA2676 ^ 0x6ACA2674, 29))));
    private final tay hjz = new tay((hy)this, "Flame Str".concat("ength"), this::ady_2).shth_7(0.0f).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(1537026820 - 508583479)).ssd_5(Float.intBitsToFloat(Integer.reverse(295606479) ^ 0xCC40E012));
    private final tay zzt_4 = new tay((hy)this, "Rise Speed", this::ghsj_2).shth_7(0.0f).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(606502122 - -421941219)).ssd_5(0.0f);
    private final tay thyt = new tay((hy)this, "Wobble", this::tbw_2).shth_7(0.0f).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(2112515130) ^ 0x617A9B73)).ssd_5(Float.intBitsToFloat(0x70CBD003 ^ 0x4FEDB665));
    private final tay shad = new tay((hy)this, "Length", this::tdsh).shth_7(Float.intBitsToFloat(Integer.reverse(-68211364) ^ 0x7783B12)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x1FC03D0F ^ 0x1FC13D8F, 14))).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x2BE9CC0D ^ 0xFF2500DE, 28))).ssd_5(Float.intBitsToFloat(-872429468 + 1936943823));
    private final tay sdhs_2 = new tay((hy)this, "Flame B".concat("rightness"), this::dhkha_2).shth_7(0.0f).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xD06222F7 ^ 0xB6FC8491, 9))).ssd_5(Float.intBitsToFloat(495076853 - -568598641));
    private final tay btf = new tay((hy)this, "Width", this::jmth).shth_7(Float.intBitsToFloat(0xBE45049C ^ 0x8389C851)).dhbs_2(Float.intBitsToFloat(-277991790 - -1355927918)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x7EF76A8C ^ 0x8BC459B8, 30))).ssd_5(1.0f);
    private final tay thts_3 = new tay((hy)this, "Fire", this::zlsh).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-77397566 - -1155333694)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xB5CA6857 ^ 0xFA995B64, 2))).ssd_5(1.0f);
    private final tay shnz = new tay((hy)this, "Turbulence", this::ztf_4).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0xC9752BD7 ^ 0x89352BD7)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1493046086) ^ 0x607B4C28)).ssd_5(1.0f);
    private final badh_2 dlkh = new badh_2((hy)this, "Only Items", this::thhj_2).bts(false);
    private class_6367 bkl;
    private class_6367 jjs_2;
    private class_6367 hsr_2;
    private class_6367 htgh;
    private float dtm_2;
    private float srsh;
    private float dwgh;
    private float dtsh;
    private float jthd_2;
    private float thghz;
    private boolean tghh_2;
    private static final int khza_2 = -1032730072;
    private static final int thzr_2 = 2087738627;
    private static final int rys = 2035919724;
    private static final int khta_3 = 389633375;
    private static final int p8qnaolxxowo = 1677096143;
    private static final int kfwo6r7 = -641352800;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int xij6cr5oxvgbvc;

    public static bsh_5 bshs_2() {
        block0: {
            int n = -1576951323;
            int n2 = (n = Integer.rotateLeft(n * -116058785, 24) ^ 0x24466C06) ^ 0x99C4E0C2;
            if ((n2 ^ n) == -1715150654) break block0;
            int cfr_ignored_0 = (0x3BC54127 ^ n) + 1871232349;
        }
        return dhrh_2;
    }

    public bsh_5() {
        dhrh_2 = this;
    }

    @Override
    public void nc() {
        int n = tdk.dqw_2(-437806937);
        int n2 = n ^ 0xAD11B0D;
        if ((n2 ^ n) != 181476109) {
            int cfr_ignored_0 = Integer.rotateRight(0xEF3683AA ^ n, 16) + -67661615;
        }
        bsh_5.hlgh(this);
        this.jbk();
    }

    public boolean hyh_2() {
        int n = tdk.dqw_2(-72786199);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0x76526C70;
        if ((n2 ^ n) != 1985113200) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x8DFB3299 ^ n, 4) + 902348738) * -1912917351;
            int cfr_ignored_1 = (int)(0x4F499CA427D4EB4FL ^ (long)n ^ 0xC438831A2DB93342L);
        }
        if (!bsh_5.zmh_2(this)) {
            int n3 = 0;
            if (yf.tdhth_2() == 0) {
                n3 = n3 ^ 0x6AE6;
            }
            return n3 != 0;
        }
        if (this.kz_2.shghkh() && !this.try_2.shzl()) {
            return false;
        }
        if (bsh_5.mc.field_1724 == null || bsh_5.mc.field_1690.method_31044() != class_5498.field_26664) {
            return false;
        }
        if (this.skhkh_2()) {
            return false;
        }
        if (this.dks_2.shghkh() && this.dlkh.shzl()) {
            return !bsh_5.mc.field_1724.method_6047().method_7960() || !bsh_5.mc.field_1724.method_6079().method_7960();
        }
        return true;
    }

    public void dshj() {
        try {
            int n = -1121715506;
            n = Integer.rotateLeft(n * -807536111, 8) ^ 0x8E39A9F3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x5C34257C;
            if ((n2 ^ n) != 1546921340) {
                int cfr_ignored_0 = (0xE117DFB2 ^ n) - 1459578024;
            }
            if ((0x16B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bsh_5.sdhkh_2();
        }
        if (!this.hyh_2()) {
            return;
        }
        class_276 class_2762 = mc.method_1522();
        if (class_2762 == null) {
            return;
        }
        bsh_5.dtd_3(this, class_2762.field_1482, class_2762.field_1481);
        this.jjs_2.method_1235(true);
        class_2762.method_1237(this.jjs_2.field_1482, this.jjs_2.field_1481);
        this.jjs_2.method_29329(class_2762);
        class_2762.method_1235(true);
    }

    public void tk() {
        int n = tdk.dqw_2(-1160259142);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x4E09BCCC;
        if ((n2 ^ n) != 1309261004) {
            int cfr_ignored_0 = (Integer.rotateRight(0xF4DE6576 ^ n, 17) - -1421088635) * -186751625;
        }
        if (!this.hyh_2()) {
            return;
        }
        class_276 class_2762 = mc.method_1522();
        if (class_2762 == null) {
            return;
        }
        int n3 = class_2762.field_1482;
        int n4 = class_2762.field_1481;
        this.shwz(n3, n4);
        bsh_5.sjs_4(this.bkl, true);
        bsh_5.tdht(class_2762, n3, n4);
        this.bkl.method_29329(class_2762);
        bsh_5.rthsh(class_2762, true);
        this.dghsh_2(class_2762, n3, n4);
    }

    private void dghsh_2(class_276 class_2762, int n, int n2) {
        this.adhth();
        boolean bl = this.dks_2.shghkh();
        class_10156 class_101562 = bl ? hq : dhdz;
        this.htgh.method_1235(true);
        RenderSystem.disableBlend();
        RenderSystem.disableDepthTest();
        this.thkz();
        class_5944 class_59442 = RenderSystem.setShader((class_10156)class_101562);
        if (class_59442 != null) {
            if (bl) {
                this.hdh_6(class_59442, n, n2, 0.0f);
            } else {
                this.zdm_3(class_59442, n, n2, 0.0f);
            }
            this.sya_4(this.htgh.field_1482, this.htgh.field_1481);
        }
        class_6367 class_63672 = this.hsr_2;
        this.hsr_2 = this.htgh;
        this.htgh = class_63672;
        class_2762.method_1235(true);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        this.thkz();
        class_5944 class_59443 = RenderSystem.setShader((class_10156)class_101562);
        if (class_59443 != null) {
            if (bl) {
                this.hdh_6(class_59443, n, n2, 1.0f);
            } else {
                this.zdm_3(class_59443, n, n2, 1.0f);
            }
            this.sya_4(n, n2);
        }
        this.thtsh(5);
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
    }

    private void thkz() {
        int n = 0;
        int n2 = -787400450;
        n2 = Integer.rotateLeft(n2 * -816854349, 6) ^ 0x66015E60;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (int)((long)(1223434398 * -1998482433 + 27417550 ^ n2) ^ 0xA407F1A089D69E73L ^ 0xA407F1A089D69E73L);
        block26: while (true) {
            switch (((n3 ^ n2) - 27417550) * -1181848577) {
                case -331010746: {
                    int cfr_ignored_0 = Integer.rotateLeft(0xD3BC51E8 ^ n2, 13) + -1473541549;
                    throw null;
                }
                case -390941811: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x3541C780 ^ n2, 9) + 2002044859;
                    RenderSystem.setShaderTexture((int)0, (int)bsh_5.ghkha(this.bkl));
                    bsh_5.shht_3(1, this.jjs_2.method_30277());
                    RenderSystem.setShaderTexture((int)2, (int)this.hsr_2.method_30277());
                    RenderSystem.setShaderTexture((int)3, (int)this.bkl.method_30278());
                    RenderSystem.setShaderTexture((int)4, (int)this.jjs_2.method_30278());
                    return;
                }
                case 1223434398: {
                    int cfr_ignored_2 = Integer.rotateLeft(0x5AEC0FA0 ^ n2, 14) + 116622235;
                    if (bsh_5.jzh_2()) {
                        int cfr_ignored_3 = (int)(0xAB422F4E9F01123FL ^ (long)n2 ^ 0xA3EDF2B1DF58FB55L);
                        n3 = -568967295 * -1998482433 + 27417550 ^ n2 ^ 0xF0520D4C ^ 0xF0520D4C;
                        int cfr_ignored_4 = (int)(0xBC902703EAC67A4EL ^ (long)n2 ^ 0xB377193F0FBAD4F1L);
                        n3 = Integer.reverse(Integer.reverse(-331010746 * -1998482433 + 27417550 ^ n2));
                        n -= 5;
                        continue block26;
                    }
                    try {
                        n -= 5;
                        if ((0xABC42442E50F60FL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-390941811 * -1998482433 + 27417550 ^ n2));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(-390941811 * -1998482433 + 27417550 ^ n2) ^ 0x348FF15F69F1CD8BL ^ 0x348FF15F69F1CD8BL);
                    }
                    ++n;
                    continue block26;
                }
                case 367350943: {
                    int cfr_ignored_5 = Integer.rotateLeft(0x872D2305 ^ n2, 3) - 1658117334;
                    int cfr_ignored_6 = (int)(0x459F8D3827D4EB4FL ^ (long)n2 ^ 0xE700831A2DB926EEL);
                    n3 = -916722194 * -1998482433 + 27417550 ^ n2;
                    int cfr_ignored_7 = (Integer.rotateRight(0xFCE9E57E ^ n2, 18) - -1531942531) * -51780225;
                    int cfr_ignored_8 = (int)(0xB5E46CBCBCFB439AL ^ (long)n2 ^ 0x2409B5457C12C619L);
                    n3 = 1223434398 * -1998482433 + 27417550 ^ n2 ^ 0x6075491A ^ 0x6075491A;
                    n += 4;
                    continue block26;
                }
                case 893429590: {
                    int cfr_ignored_9 = Integer.rotateLeft(0x102E540D ^ n2, 5) - -101069618;
                    int cfr_ignored_10 = (int)(0xD29CFA3027D4EB4FL ^ (long)n2 ^ 0x910831A2DB808E8L);
                    n3 = 1223434398 * -1998482433 + 27417550 ^ n2;
                    int cfr_ignored_11 = Integer.rotateRight(0x32B2EB03 ^ n2, 9) + 671618200;
                    ++n;
                    continue block26;
                }
                case -1246177058: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0x3371DC78 ^ n2, 9) + 1059541443) * 863100025;
                    try {
                        n += 4;
                        if ((0x9A9F7FFD1E808B39L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = 1223434398 * -1998482433 + 27417550 ^ n2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(1223434398 * -1998482433 + 27417550 ^ n2));
                    }
                    continue block26;
                }
                case 1751834031: {
                    int cfr_ignored_13 = Integer.rotateLeft(0x6CF8C0E9 ^ n2, 16) + 914160498;
                    int cfr_ignored_14 = (int)(0xAE4A6ED427D4EB4FL ^ (long)n2 ^ 0x20D8831A2DB8F145L);
                    n3 = Integer.reverse(Integer.reverse(-1315590040 * -1998482433 + 27417550 ^ n2));
                    int cfr_ignored_15 = Integer.rotateLeft(0xC8B4C82C ^ n2, 12) - 1380048015;
                    n3 = Integer.reverse(Integer.reverse(-565195111 * -1998482433 + 27417550 ^ n2));
                    int cfr_ignored_16 = Integer.rotateRight(0x476A7D42 ^ n2, 11) + -1438463431;
                    n3 = 1223434398 * -1998482433 + 27417550 ^ n2;
                    n -= 5;
                    continue block26;
                }
                case -893055757: {
                    int cfr_ignored_17 = Integer.rotateLeft(0xEB3F088C ^ n2, 16) - -2130728913;
                    n3 = (-1455025421 * -1998482433 + 27417550 ^ n2) + 565087539 - 565087539;
                    int cfr_ignored_18 = (Integer.rotateRight(0xE1CE269F ^ n2, 15) - 1549028476) * -506583393;
                    n3 = (1223434398 * -1998482433 + 27417550 ^ n2) + -1748994290 - -1748994290;
                    int cfr_ignored_19 = (Integer.rotateLeft(0x1FB4A43D ^ n2, 6) - -616725858) * 531932221;
                    int cfr_ignored_20 = (int)(0xDD060A0027D4EB4FL ^ (long)n2 ^ 0xE970831A2DB817DDL);
                    continue block26;
                }
                case -415600857: {
                    int cfr_ignored_21 = Integer.rotateRight(0x50E2B08F ^ n2, 13) - -808386420;
                    n3 = (int)((long)(1470731821 * -1998482433 + 27417550 ^ n2) ^ 0x7692BDDCE0373192L ^ 0x7692BDDCE0373192L);
                    int cfr_ignored_22 = Integer.rotateRight(0xEC7D14C7 ^ n2, 16) - -1484577964;
                    n3 = (1223434398 * -1998482433 + 27417550 ^ n2) + -197401694 - -197401694;
                    n -= 3;
                    continue block26;
                }
                case 1153199003: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x9F7C2E20 ^ n2, 6) + 1416049947;
                    try {
                        n3 = (int)((long)(1223434398 * -1998482433 + 27417550 ^ n2) ^ 0x65DB6E14945D8BBEL ^ 0x65DB6E14945D8BBEL);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(1223434398 * -1998482433 + 27417550 ^ n2));
                    }
                    --n;
                    continue block26;
                }
                case 791014691: {
                    int cfr_ignored_24 = Integer.rotateLeft(0x46221EE1 ^ n2, 11) + -2105582470;
                    int cfr_ignored_25 = (int)(0x8490B0DC27D4EB4FL ^ (long)n2 ^ 0x9CC8831A2DB8A4F0L);
                    try {
                        --n;
                        if ((0xAB7F6757D9AF9401L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (1223434398 * -1998482433 + 27417550 ^ n2) + 1178421606 - 1178421606;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(1223434398 * -1998482433 + 27417550 ^ n2) ^ 0x6AB537E73D7211D4L ^ 0x6AB537E73D7211D4L);
                    }
                    ++n;
                    continue block26;
                }
                case 953689496: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0x20AE07D4 ^ n2, 7) - -110063129) * 548276181;
                    n3 = (int)((long)(-1984650729 * -1998482433 + 27417550 ^ n2) ^ 0x225FA07C20568392L ^ 0x225FA07C20568392L);
                    int cfr_ignored_27 = Integer.rotateLeft(0x132BD28D ^ n2, 5) - 1454120526;
                    int cfr_ignored_28 = (int)(0xD1997CB027D4EB4FL ^ (long)n2 ^ 0x410831A2DB80EE3L);
                    n3 = 1223434398 * -1998482433 + 27417550 ^ n2 ^ 0x7570EBF9 ^ 0x7570EBF9;
                    n -= 3;
                    continue block26;
                }
                case -2034243769: {
                    int cfr_ignored_29 = Integer.rotateRight(0x3AD6D3C7 ^ n2, 10) - 610354260;
                    n3 = -796748202 * -1998482433 + 27417550 ^ n2;
                    int cfr_ignored_30 = (Integer.rotateRight(0x2784DCB7 ^ n2, 7) - -848012956) * 663018679;
                    n3 = Integer.reverse(Integer.reverse(1223434398 * -1998482433 + 27417550 ^ n2));
                    int cfr_ignored_31 = (Integer.rotateLeft(0xDD733F38 ^ n2, 14) + -716028157) * -579649735;
                    continue block26;
                }
                case -107161614: {
                    int cfr_ignored_32 = Integer.rotateRight(0xA32C5D07 ^ n2, 7) - -960699628;
                    n3 = (int)((long)(746636508 * -1998482433 + 27417550 ^ n2) ^ 0x602052FD58965F1L ^ 0x602052FD58965F1L);
                    int cfr_ignored_33 = (Integer.rotateRight(0x377D353 ^ n2, 3) + 1876964936) * 58184531;
                    try {
                        n -= 3;
                        if ((0x142FF061FB44718DL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1223434398 * -1998482433 + 27417550 ^ n2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (1223434398 * -1998482433 + 27417550 ^ n2) + 61950097 - 61950097;
                    }
                    continue block26;
                }
            }
            int cfr_ignored_34 = (Integer.rotateRight(0x7F6742D2 ^ n2, 18) + 1910421161) * 2137473747;
            n3 = Integer.reverse(Integer.reverse(1223434398 * -1998482433 + 27417550 ^ n2));
        }
    }

    private void zdm_3(class_5944 class_59442, int n, int n2, float f) {
        int n3 = tdk.dqw_2(109410348);
        n3 = Integer.rotateLeft(n2 ^ n3, 28);
        n3 = Float.floatToIntBits(f) ^ n3;
        int n4 = n3 ^ 0xFD1E351D;
        if ((n4 ^ n3) != -48351971) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xFB9B4D31 ^ n3, 18) + 2083256362) * -73708239;
            int cfr_ignored_1 = (int)(0x3929E30C27D4EB4FL ^ (long)n3 ^ 0x3B68831A2DB9DF82L);
        }
        this.snh_4(class_59442, "Resolution", n, n2);
        bsh_5.ghs_2(this, class_59442, "Strength", this.shbh.thw_5());
        this.syf(class_59442, "Radius", this.dnm.thw_5());
        this.syf(class_59442, "TrailDecay", this.tghl.thw_5());
        bsh_5.daf_2(this, class_59442, "Lag", bsh_5.jthh_2(this.dfq));
        bsh_5.tzkh_3(this, class_59442, "CameraShift", this.dwgh, this.dtsh);
        bsh_5.tll(this, class_59442, bsh_5.dhh_8(bsh_5.jbz("㑿\ud9f8窧ᱝ쇯抈", Integer.reverse(1773703173) ^ 0x778CB7ED, 2069985831 - 480442897, bsh_5.andh(-644168346) ^ 0xB2EAB3F7), bsh_5.jbz("⫝̸읪搦˩\udf66簖᪲", bsh_5.tal_2(0x2CDB842E ^ 0x5F5273C5, 19), 376577134 - 2118764553, Integer.reverse(-997523360) ^ 0xD2493B4F)), f);
        bsh_5.tzl(this, class_59442, "Time", (float)System.nanoTime() / Float.intBitsToFloat(-1905813533 - 1073294523));
        this.tghn_2(class_59442, "EchoColor", this.jdy.sdsh_4());
        this.syf(class_59442, "OuterOnly", this.djh.shzl() ? 1.0f : 0.0f);
    }

    private void hdh_6(class_5944 class_59442, int n, int n2, float f) {
        int n3 = tdk.dqw_2(-1196852760);
        n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 9);
        int n4 = (n3 = n ^ n3) ^ 0x59011F19;
        if ((n4 ^ n3) != 1493245721) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xE1A866F1 ^ n3, 15) + 1472337514) * -509057295;
            int cfr_ignored_1 = (int)(0x231AC8CC27D4EB4FL ^ (long)n3 ^ 0x6CE8831A2DB9EBE4L);
        }
        this.snh_4(class_59442, "Resolution", n, n2);
        this.syf(class_59442, "Strength", this.hjz.thw_5());
        this.syf(class_59442, "RiseSpeed", this.zzt_4.thw_5());
        bsh_5.zjs_4(this, class_59442, bsh_5.jbz("挘躋ⷛ䬼隟㗭", 1679717194 - 775699221, bsh_5.zths_3(461440769) ^ 0xD3E1C2E2, -1497755877 - 504536892), bsh_5.tthgh_2(this.thyt));
        this.syf(class_59442, bsh_5.jbz("퍊㻋鶛ﭰ⛕薇仯걃ଋ盺", bsh_5.athh(2051918568) ^ 0xD28DF483, Integer.rotateLeft(0x338BC620 ^ 0x21584701, 20), 0x1DCCFA21 ^ 0x956B95FE), this.shad.thw_5());
        this.syf(class_59442, "Brightness", bsh_5.dhl_5(this.sdhs_2));
        this.syf(class_59442, "FlameWidth", this.btf.thw_5());
        this.syf(class_59442, "Fire", bsh_5.tkhf_2(this.thts_3));
        this.syf(class_59442, "Turbulence", this.shnz.thw_5());
        bsh_5.tya_3(this, class_59442, "CameraShift", this.dwgh, this.dtsh);
        bsh_5.dsw(this, class_59442, "Comp".concat(bsh_5.jbz("䣱ꕆ؁惻뵇Ḕ碓핷㟓", bsh_5.trm(0xBF99EB43 ^ 0xD5EBBF3B, 15), Integer.rotateLeft(0x1F57E92A ^ 0x49B59F36, 24), 1003097871 - -1289576656)), f);
        this.syf(class_59442, "Time", (float)System.nanoTime() / Float.intBitsToFloat(Integer.reverse(345082523) ^ 0x973FE200));
        this.tghn_2(class_59442, "FlameColor", this.hzh());
    }

    /*
     * Unable to fully structure code
     */
    private byq hzh() {
        var1_1 = 0.0f;
        var4_2 = null;
        var7_3 = 0;
        var5_4 = 270323138;
        var5_4 = Integer.rotateLeft(var5_4 * -258574437, 4) ^ 1619164748;
        var5_4 = System.identityHashCode(this) ^ var5_4;
        var6_5 = (int)((long)((var5_4 ^ 1160580443 ^ 38452840) + 38452840) ^ 2408467136671764023L ^ 2408467136671764023L);
        while (true) {
            block62: {
                block61: {
                    block75: {
                        block71: {
                            block65: {
                                block76: {
                                    block78: {
                                        block70: {
                                            block79: {
                                                block63: {
                                                    block77: {
                                                        block64: {
                                                            block60: {
                                                                block69: {
                                                                    block72: {
                                                                        block66: {
                                                                            block74: {
                                                                                block67: {
                                                                                    block68: {
                                                                                        block73: {
                                                                                            var7_3 = var6_5 - 38452840 ^ 38452840 ^ var5_4;
                                                                                            switch (var7_3 & 15) {
                                                                                                case 0: {
                                                                                                    if (var7_3 != -1898055536) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block60;
                                                                                                }
                                                                                                case 2: {
                                                                                                    if (var7_3 == -1821441614) break block61;
                                                                                                    if (var7_3 != 1959258322) {
                                                                                                        Integer.rotateRight(-1564599894 ^ var5_4, 7) + -1184711983;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block62;
                                                                                                }
                                                                                                case 3: {
                                                                                                    if (var7_3 != -1444472109) {
                                                                                                        if (var7_3 == -74553805) break;
                                                                                                        Integer.rotateRight(1282893710 ^ var5_4, 12) - 1188243821;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block63;
                                                                                                }
                                                                                                case 4: {
                                                                                                    if (var7_3 == -935421452) break block64;
                                                                                                    if (var7_3 != -97870332) {
                                                                                                        Integer.rotateLeft(-2083607128 ^ var5_4, 3) + -94067053;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block65;
                                                                                                }
                                                                                                case 7: {
                                                                                                    if (var7_3 == 1619053479) break block66;
                                                                                                    if (var7_3 == 1602493703) break block67;
                                                                                                    Integer.rotateLeft(1998451365 ^ var5_4, 17) - 1895694646;
                                                                                                    (int)(-5354959623347180721L ^ (long)var5_4 ^ 4918074941548054159L);
                                                                                                    if (var7_3 != -488201497) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block68;
                                                                                                }
                                                                                                case 8: {
                                                                                                    if (var7_3 != 1601201096) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block69;
                                                                                                }
                                                                                                case 9: {
                                                                                                    if (var7_3 == -961920135) break block70;
                                                                                                    if (var7_3 != -1844905911) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block71;
                                                                                                }
                                                                                                case 11: {
                                                                                                    if (var7_3 == 1160580443) break block72;
                                                                                                    if (var7_3 == -2120564373) break block73;
                                                                                                    if (var7_3 == -1021941157) break block74;
                                                                                                    if (var7_3 != -1798512821) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block75;
                                                                                                }
                                                                                                case 13: {
                                                                                                    if (var7_3 == 1119932749) break block76;
                                                                                                    if (var7_3 != 1935418589) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block77;
                                                                                                }
                                                                                                case 14: {
                                                                                                    if (var7_3 == -1494149138) break block78;
                                                                                                    if (var7_3 != -1706974114) {
                                                                                                        Integer.rotateLeft(-769746392 ^ var5_4, 13) + 1980910099;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block79;
                                                                                                }
                                                                                            }
                                                                                            Integer.rotateLeft(1501047329 ^ var5_4, 14) + -638928582;
                                                                                            (int)(-7220813796072953009L ^ (long)var5_4 ^ -772223187634578876L);
                                                                                            var1_1 = (float)(System.currentTimeMillis() % (1012319992805056195L ^ 1012319992805052771L)) / Float.intBitsToFloat(Integer.rotateLeft(-1735975275 ^ 948378306, 20));
                                                                                            var2_6 = byq.slz_2(var1_1, Float.intBitsToFloat(-1730848756 + -1503462944), 1.0f);
                                                                                            var4_2 = var2_6.tkhl_2(Float.intBitsToFloat(Integer.rotateLeft(617100282 ^ 348664289, 21)));
                                                                                            var6_5 = (var5_4 ^ 1769388084 ^ 38452840) + 38452840 + 1534645023 - 1534645023;
                                                                                            (Integer.rotateLeft(695341048 ^ var5_4, 8) + 153980483) * 695341049;
                                                                                            var6_5 = (int)((long)((var5_4 ^ 1959258322 ^ 38452840) + 38452840) ^ 3392704175095971182L ^ 3392704175095971182L);
                                                                                            ++var7_3;
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateRight(-880189873 ^ var5_4, 12) - -1442837812;
                                                                                        if (!this.dql.shghkh()) {
                                                                                            (int)(1776984200968100218L ^ (long)var5_4 ^ -4170824817008468861L);
                                                                                            var6_5 = (var5_4 ^ -1320949218 ^ 38452840) + 38452840;
                                                                                            (int)(803353572291255480L ^ (long)var5_4 ^ -2967187846922257507L);
                                                                                            var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ -488201497 ^ 38452840) + 38452840));
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            var7_3 += 4;
                                                                                            if ((2856627724938892263L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                throw new NoSuchElementException();
                                                                                            }
                                                                                            var6_5 = (int)((long)((var5_4 ^ -74553805 ^ 38452840) + 38452840) ^ 8985415944722950146L ^ 8985415944722950146L);
                                                                                        }
                                                                                        catch (NoSuchElementException v0) {
                                                                                            var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ -74553805 ^ 38452840) + 38452840));
                                                                                        }
                                                                                        var7_3 += 4;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateLeft(659500912 ^ var5_4, 7) + -957063733) * 659500913;
                                                                                    var4_2 = this.zyf.sdsh_4();
                                                                                    try {
                                                                                        var7_3 -= 3;
                                                                                        if ((-8437632009053579183L ^ (long)var5_4 | 1L) == 0L) {
                                                                                            throw new ArithmeticException();
                                                                                        }
                                                                                        var6_5 = (var5_4 ^ 1959258322 ^ 38452840) + 38452840 ^ -1920974043 ^ -1920974043;
                                                                                    }
                                                                                    catch (ArithmeticException v1) {
                                                                                        var6_5 = (int)((long)((var5_4 ^ 1959258322 ^ 38452840) + 38452840) ^ -6125593492522996308L ^ -6125593492522996308L);
                                                                                    }
                                                                                    var7_3 += 4;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-606144685 ^ var5_4, 14) + -1537371576) * -606144685;
                                                                                var4_2 = this.zyf.sdsh_4();
                                                                                try {
                                                                                    var7_3 -= 2;
                                                                                    var6_5 = (var5_4 ^ 1959258322 ^ 38452840) + 38452840 + 1703254349 - 1703254349;
                                                                                }
                                                                                catch (ArithmeticException v2) {
                                                                                    var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ 1959258322 ^ 38452840) + 38452840));
                                                                                }
                                                                                var7_3 += 5;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateLeft(-359218115 ^ var5_4, 16) - 1822384798) * -359218115;
                                                                            (int)(2892553409579510607L ^ (long)var5_4 ^ 2986030701406191001L);
                                                                            if (this.thlt_2.shghkh()) {
                                                                                try {
                                                                                    if ((-4423702714146541469L ^ (long)var5_4 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    var6_5 = (var5_4 ^ 1601201096 ^ 38452840) + 38452840;
                                                                                }
                                                                                catch (IllegalStateException v3) {
                                                                                    var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ 1601201096 ^ 38452840) + 38452840));
                                                                                }
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                var7_3 -= 5;
                                                                                if ((-4483555828510454233L ^ (long)var5_4 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                var6_5 = (var5_4 ^ -2120564373 ^ 38452840) + 38452840;
                                                                            }
                                                                            catch (ArithmeticException v4) {
                                                                                var6_5 = (var5_4 ^ -2120564373 ^ 38452840) + 38452840 ^ 292575130 ^ 292575130;
                                                                            }
                                                                            var7_3 -= 5;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateLeft(1663939305 ^ var5_4, 15) + 115755378;
                                                                        (int)(-6800685214779249841L ^ (long)var5_4 ^ -4262512898846691601L);
                                                                        if (!this.thlt_2.shghkh()) {
                                                                            (int)(-502228090021136581L ^ (long)var5_4 ^ -8566452796401885218L);
                                                                            var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ -2120564373 ^ 38452840) + 38452840));
                                                                            continue;
                                                                        }
                                                                        var6_5 = (int)((long)((var5_4 ^ 1601201096 ^ 38452840) + 38452840) ^ -837386234904443988L ^ -837386234904443988L);
                                                                        ++var7_3;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(274607434 ^ var5_4, 5) + -3859663;
                                                                    if (this.hsw.shghkh()) {
                                                                        try {
                                                                            var6_5 = (int)((long)((var5_4 ^ 1602493703 ^ 38452840) + 38452840) ^ -9207993569953717106L ^ -9207993569953717106L);
                                                                        }
                                                                        catch (IllegalStateException v5) {
                                                                            var6_5 = (int)((long)((var5_4 ^ 1602493703 ^ 38452840) + 38452840) ^ -3158329524678065301L ^ -3158329524678065301L);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        var7_3 -= 2;
                                                                        if ((2973172730397183295L ^ (long)var5_4 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        var6_5 = (var5_4 ^ -1021941157 ^ 38452840) + 38452840;
                                                                    }
                                                                    catch (IllegalArgumentException v6) {
                                                                        var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ -1021941157 ^ 38452840) + 38452840));
                                                                    }
                                                                    var7_3 -= 2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(1094254303 ^ var5_4, 11) - -364610500) * 1094254303;
                                                                var1_1 = (float)((Math.sin((double)System.currentTimeMillis() / Double.longBitsToDouble(5972881523257032152L ^ 1325096339066502616L)) + 1.0) * Double.longBitsToDouble(2714915394028843354L ^ 1895260261847413082L));
                                                                var2_6 = new byq(Float.intBitsToFloat(Integer.reverse(-476097934) ^ 221051335), Float.intBitsToFloat(-396844987 + 1514627003), Float.intBitsToFloat(Integer.reverse(75474328) ^ 1519517216), Float.intBitsToFloat(Integer.reverse(-1014337901) ^ -1978641981));
                                                                var3_7 = new byq(Float.intBitsToFloat(Integer.rotateLeft(1751088054 ^ 1705212855, 30)), Float.intBitsToFloat(Integer.rotateLeft(1921864245 ^ 1624068663, 29)), Float.intBitsToFloat(Integer.reverse(-233570311) ^ -588658609), Float.intBitsToFloat(Integer.rotateLeft(1344345355 ^ -937356282, 22)));
                                                                var4_2 = var2_6.dkhw_2(var3_7, var1_1);
                                                                try {
                                                                    var7_3 -= 5;
                                                                    if ((-3724020407214766749L ^ (long)var5_4 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ 1959258322 ^ 38452840) + 38452840));
                                                                }
                                                                catch (ArithmeticException v7) {
                                                                    var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ 1959258322 ^ 38452840) + 38452840));
                                                                }
                                                                var7_3 += 5;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(-1179382119 ^ var5_4, 10) + -2127862846) * -1179382119;
                                                            (int)(8864949543428746063L ^ (long)var5_4 ^ -4884009647423792164L);
                                                            var6_5 = (var5_4 ^ 1613728231 ^ 38452840) + 38452840;
                                                            (Integer.rotateLeft(-949212227 ^ var5_4, 11) - 712436510) * -949212227;
                                                            (int)(422922200489978703L ^ (long)var5_4 ^ -688906594528156052L);
                                                            try {
                                                                var7_3 += 3;
                                                                if ((6251030812846792849L ^ (long)var5_4 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                var6_5 = (int)((long)((var5_4 ^ 1160580443 ^ 38452840) + 38452840) ^ 8646449797662742321L ^ 8646449797662742321L);
                                                            }
                                                            catch (UnsupportedOperationException v8) {
                                                                var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840 + -2081796520 - -2081796520;
                                                            }
                                                            var7_3 += 2;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(1328078884 ^ var5_4, 12) - -1705983081;
                                                        var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ 1160580443 ^ 38452840) + 38452840));
                                                        var7_3 -= 5;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(1119008420 ^ var5_4, 11) - 402767127;
                                                    var6_5 = (var5_4 ^ 208477822 ^ 38452840) + 38452840;
                                                    Integer.rotateRight(604107111 ^ var5_4, 7) - 1620695732;
                                                    var6_5 = (int)((long)((var5_4 ^ 1160580443 ^ 38452840) + 38452840) ^ -8086380829788766801L ^ -8086380829788766801L);
                                                    var7_3 -= 3;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-707435107 ^ var5_4, 13) - -382407362) * -707435107;
                                                (int)(1686540474197011279L ^ (long)var5_4 ^ 7651759915361993502L);
                                                var6_5 = (int)((long)((var5_4 ^ -1368002081 ^ 38452840) + 38452840) ^ -3584244244979292734L ^ -3584244244979292734L);
                                                (Integer.rotateLeft(702257364 ^ var5_4, 8) - 368386279) * 702257365;
                                                var6_5 = (int)((long)((var5_4 ^ 698774473 ^ 38452840) + 38452840) ^ 7436800527408926328L ^ 7436800527408926328L);
                                                (Integer.rotateRight(432937779 ^ var5_4, 6) + 609413736) * 432937779;
                                                var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840 ^ -890439401 ^ -890439401;
                                                var7_3 -= 3;
                                                continue;
                                            }
                                            (Integer.rotateRight(-1254006434 ^ var5_4, 9) - -146249315) * -1254006433;
                                            try {
                                                var7_3 -= 4;
                                                if ((-6766006422760431017L ^ (long)var5_4 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840;
                                            }
                                            catch (NoSuchElementException v9) {
                                                var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840 ^ 840503312 ^ 840503312;
                                            }
                                            var7_3 += 2;
                                            continue;
                                        }
                                        Integer.rotateRight(1300506210 ^ var5_4, 12) + 1734231321;
                                        (int)(4789502773191912214L ^ (long)var5_4 ^ -8378347839917708994L);
                                        var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840 ^ 1513880300 ^ 1513880300;
                                        var7_3 -= 5;
                                        continue;
                                    }
                                    (Integer.rotateRight(643504251 ^ var5_4, 7) + -1452960224) * 643504251;
                                    var6_5 = (var5_4 ^ 1178885244 ^ 38452840) + 38452840 ^ 836299503 ^ 836299503;
                                    (Integer.rotateRight(87384819 ^ var5_4, 3) + -1512793432) * 87384819;
                                    var6_5 = (int)((long)((var5_4 ^ 1160580443 ^ 38452840) + 38452840) ^ -8335986115313045655L ^ -8335986115313045655L);
                                    var7_3 += 4;
                                    continue;
                                }
                                (Integer.rotateRight(106346651 ^ var5_4, 3) + -924976640) * 106346651;
                                var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ 201795750 ^ 38452840) + 38452840));
                                Integer.rotateRight(-299022449 ^ var5_4, 16) - -606516852;
                                var6_5 = Integer.reverse(Integer.reverse((var5_4 ^ 1160580443 ^ 38452840) + 38452840));
                                (Integer.rotateLeft(-1253436296 ^ var5_4, 9) + -128575037) * -1253436295;
                                var7_3 += 2;
                                continue;
                            }
                            (Integer.rotateLeft(-1917235367 ^ var5_4, 4) + 768490242) * -1917235367;
                            (int)(5695893974021368655L ^ (long)var5_4 ^ 4591563968563721158L);
                            var6_5 = (int)((long)((var5_4 ^ 2007694343 ^ 38452840) + 38452840) ^ -3931418416566548794L ^ -3931418416566548794L);
                            (Integer.rotateLeft(1480858077 ^ var5_4, 14) - -1264795394) * 1480858077;
                            (int)(-7280429574229005489L ^ (long)var5_4 ^ -7876651599811536836L);
                            (int)(-7451082682483077769L ^ (long)var5_4 ^ 2521718527544040673L);
                            var6_5 = (int)((long)((var5_4 ^ 695020097 ^ 38452840) + 38452840) ^ -6727799243612174171L ^ -6727799243612174171L);
                            (int)(-7668574013646149743L ^ (long)var5_4 ^ 8957713651746506486L);
                            var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840 ^ -1602423450 ^ -1602423450;
                            ++var7_3;
                            continue;
                        }
                        Integer.rotateLeft(-1210106908 ^ var5_4, 9) - 1214635991;
                        var6_5 = (var5_4 ^ -491758698 ^ 38452840) + 38452840 ^ 287456610 ^ 287456610;
                        (Integer.rotateRight(425672635 ^ var5_4, 6) + 384194272) * 425672635;
                        var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840;
                        var7_3 += 3;
                        continue;
                    }
                    Integer.rotateRight(-1967608281 ^ var5_4, 4) - -793070092;
                    var6_5 = (var5_4 ^ 963198833 ^ 38452840) + 38452840;
                    Integer.rotateRight(-1509119805 ^ var5_4, 7) + 535170776;
                    try {
                        var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840 ^ -831824766 ^ -831824766;
                    }
                    catch (UnsupportedOperationException v10) {
                        var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840 ^ 788899107 ^ 788899107;
                    }
                    var7_3 += 2;
                    continue;
                }
                (Integer.rotateLeft(2031473616 ^ var5_4, 18) + -1375582869) * 2031473617;
                var6_5 = (int)((long)((var5_4 ^ 1859242324 ^ 38452840) + 38452840) ^ -7680159186226462974L ^ -7680159186226462974L);
                (Integer.rotateRight(-148622949 ^ var5_4, 17) + -239099648) * -148622949;
                try {
                    if ((-1150066909078657817L ^ (long)var5_4 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var6_5 = (int)((long)((var5_4 ^ 1160580443 ^ 38452840) + 38452840) ^ 3120025852958358582L ^ 3120025852958358582L);
                }
                catch (NoSuchElementException v11) {
                    var6_5 = (int)((long)((var5_4 ^ 1160580443 ^ 38452840) + 38452840) ^ -6781529565644314436L ^ -6781529565644314436L);
                }
                ++var7_3;
                continue;
            }
            return var4_2;
lbl355:
            // 11 sources

            (Integer.rotateRight(934490623 ^ var5_4, 9) - -1022317284) * 934490623;
            var6_5 = (var5_4 ^ 1160580443 ^ 38452840) + 38452840 + -1718627416 - -1718627416;
        }
    }

    private void adhth() {
        if (bsh_5.mc.field_1724 == null) {
            this.jbk();
            return;
        }
        float f = bsh_5.mc.field_1724.method_36454();
        float f2 = bsh_5.mc.field_1724.method_36455();
        if (!this.tghh_2) {
            this.dtm_2 = f;
            this.srsh = f2;
            this.tghh_2 = true;
            return;
        }
        float f3 = class_3532.method_15393((float)(f - this.dtm_2));
        float f4 = f2 - this.srsh;
        this.dtm_2 = f;
        this.srsh = f2;
        float f5 = this.dks_2.shghkh() ? 1.0f : this.dfq.thw_5();
        float f6 = class_3532.method_15363((float)(f3 * 0.002f * f5), (float)-0.065f, (float)0.065f);
        float f7 = class_3532.method_15363((float)(-f4 * 0.002f * f5), (float)-0.065f, (float)0.065f);
        this.jthd_2 += (f6 - this.dwgh) * 0.18f;
        this.thghz += (f7 - this.dtsh) * 0.18f;
        this.jthd_2 *= 0.74f;
        this.thghz *= 0.74f;
        this.dwgh = class_3532.method_15363((float)((this.dwgh + this.jthd_2) * 0.92f), (float)-0.075f, (float)0.075f);
        this.dtsh = class_3532.method_15363((float)((this.dtsh + this.thghz) * 0.92f), (float)-0.075f, (float)0.075f);
    }

    private void jbk() {
        this.tghh_2 = false;
        this.dtm_2 = 0.0f;
        this.srsh = 0.0f;
        this.dwgh = 0.0f;
        this.dtsh = 0.0f;
        this.jthd_2 = 0.0f;
        this.thghz = 0.0f;
    }

    private void syf(class_5944 class_59442, String string, float f) {
        try {
            int n = 556709208;
            n = Integer.rotateLeft(n * 1533329595, 24) ^ 0x6EB12C5A;
            class_5944 class_59443 = class_59442;
            n = Integer.rotateLeft((class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n, 27);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 10);
            int n2 = n ^ 0x5BB00117;
            if ((n2 ^ n) != 1538261271) {
                int cfr_ignored_0 = (0x7A9EB44F ^ n) + 1525423298;
            }
            if ((0x1C1 & 0) != 0) {
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
        if (class_59442.method_34582(string) != null) {
            class_59442.method_34582(string).method_1251(f);
        }
    }

    private void snh_4(class_5944 class_59442, String string, float f, float f2) {
        int n = 0;
        int n2 = 1038774781;
        n2 = Integer.rotateLeft(n2 * -1688573345, 4) ^ 0x55FE63FF;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n2, 19);
        int n3 = Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) ^ 0xDE839A89 ^ 0xDE839A89;
        block21: while (true) {
            switch (Integer.reverse(n3) ^ n2 ^ 0xEF7600F4) {
                case 1685632093: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x67F1D1B1 ^ n2, 15) + -1700396118) * 1743901105;
                    int cfr_ignored_1 = (int)(0xA5437F8C27D4EB4FL ^ (long)n2 ^ 0x268831A2DB8E757L);
                    class_59442.method_34582(string).method_1255(f, f2);
                    try {
                        ++n;
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x2722EBDC ^ 0xEF7600F4)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x2722EBDC ^ 0xEF7600F4)));
                    }
                    n -= 2;
                    continue block21;
                }
                case 1671087500: {
                    int cfr_ignored_2 = (Integer.rotateRight(0x47BA1597 ^ n2, 11) - -1276756860) * 1203377559;
                    if (class_59442.method_34582(string) == null) {
                        n3 = Integer.reverse(n2 ^ 0x2722EBDC ^ 0xEF7600F4);
                        n += 5;
                        continue block21;
                    }
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x6478B45D ^ 0xEF7600F4)));
                    int cfr_ignored_3 = (Integer.rotateLeft(0x1B19138 ^ n2, 3) + 954086659) * 28414265;
                    continue block21;
                }
                case 656600028: {
                    int cfr_ignored_4 = (Integer.rotateRight(0xC14CBC3F ^ n2, 11) - 1822976732) * -1051935681;
                    return;
                }
                case -1557955367: {
                    int cfr_ignored_5 = Integer.rotateLeft(0x7F7EC988 ^ n2, 18) + 1958217395;
                    try {
                        n -= 3;
                        if ((0x75AA28AD343CEEF5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) ^ 0x90049AFC ^ 0x90049AFC;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) + 1329528861 - 1329528861;
                    }
                    n += 5;
                    continue block21;
                }
                case -506461047: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0xC311C5D1 ^ n2, 11) + -1551592566) * -1022245423;
                    int cfr_ignored_7 = (int)(0x1A36BEC27D4EB4FL ^ (long)n2 ^ 0x2AA8831A2DB9AE97L);
                    n3 = Integer.reverse(n2 ^ 0x1232C616 ^ 0xEF7600F4) + -2092287811 - -2092287811;
                    int cfr_ignored_8 = (Integer.rotateLeft(0xD8FD91D ^ n2, 4) - -1463227970) * 227531037;
                    int cfr_ignored_9 = (int)(0xCF3D772027D4EB4FL ^ (long)n2 ^ 0x1330831A2DB833ABL);
                    int cfr_ignored_10 = (int)(0xEFFAFDBAD77ED05DL ^ (long)n2 ^ 0x605624E5B9C7224L);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) ^ 0x931D61B9F1C7B2EFL ^ 0x931D61B9F1C7B2EFL);
                    continue block21;
                }
                case -1158108618: {
                    int cfr_ignored_11 = Integer.rotateRight(0xFD4A85EB ^ n2, 18) + -1335634256;
                    n3 = Integer.reverse(n2 ^ 0x2A3FE5D0 ^ 0xEF7600F4) + 88904345 - 88904345;
                    int cfr_ignored_12 = (Integer.rotateRight(0xC867E73B ^ n2, 12) + 1223860064) * -932714693;
                    int cfr_ignored_13 = (int)(0x42D9A9F5107B2BBEL ^ (long)n2 ^ 0xAE9AEC45AC5B2862L);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xFF3F64DB ^ 0xEF7600F4)));
                    int cfr_ignored_14 = (int)(0x7FF7D560BA7CC572L ^ (long)n2 ^ 0x57B1B84A71C3523EL);
                    n3 = Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4);
                    n += 4;
                    continue block21;
                }
                case 785445613: {
                    int cfr_ignored_15 = Integer.rotateLeft(0x30D625CC ^ n2, 9) - -296996113;
                    n3 = Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4);
                    int cfr_ignored_16 = (Integer.rotateRight(0x71F732DE ^ n2, 17) - -783497187) * 1912025823;
                    n -= 2;
                    continue block21;
                }
                case -1477667465: {
                    int cfr_ignored_17 = Integer.rotateRight(0xB96C8503 ^ n2, 10) + 2021767832;
                    int cfr_ignored_18 = (int)(0x1E97CC5C99350866L ^ (long)n2 ^ 0x65C9FED9EBEB90FEL);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) ^ 0x9FD82F5B57BAF105L ^ 0x9FD82F5B57BAF105L);
                    n += 4;
                    continue block21;
                }
                case -1733546863: {
                    int cfr_ignored_19 = Integer.rotateRight(0xFDA06CA3 ^ n2, 18) + -1161115912;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xEAB5AF34 ^ 0xEF7600F4)));
                    int cfr_ignored_20 = Integer.rotateLeft(0x216131A4 ^ n2, 7) - 253927959;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x958EB84D ^ 0xEF7600F4) ^ 0x718F2D8C82A10E98L ^ 0x718F2D8C82A10E98L);
                    int cfr_ignored_21 = Integer.rotateRight(0xFACA7A4F ^ n2, 18) - 1659006668;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) ^ 0xC8C05777F6ADFFA8L ^ 0xC8C05777F6ADFFA8L);
                    n -= 4;
                    continue block21;
                }
                case 1757862974: {
                    int cfr_ignored_22 = (Integer.rotateLeft(0x1DEB9870 ^ n2, 6) + -1545268021) * 501979249;
                    try {
                        ++n;
                        n3 = Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) ^ 0xFD15EB290CFFB9A0L ^ 0xFD15EB290CFFB9A0L);
                    }
                    n -= 3;
                    continue block21;
                }
                case -1098099712: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x8B564B6C ^ n2, 4) - -472858289;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x83440933 ^ 0xEF7600F4) ^ 0xBFF8E0C78E762224L ^ 0xBFF8E0C78E762224L);
                    int cfr_ignored_24 = Integer.rotateLeft(0x7F8F0EEC ^ n2, 18) - 1991273935;
                    n3 = Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) + 1515632102 - 1515632102;
                    int cfr_ignored_25 = (Integer.rotateRight(0xE20C41B ^ n2, 4) + -1168810368) * 237028379;
                    n += 4;
                    continue block21;
                }
                case -1992050347: {
                    int cfr_ignored_26 = (Integer.rotateRight(0x4F576F76 ^ n2, 12) - -1611391355) * 1331130231;
                    n3 = Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4) + 1707586518 - 1707586518;
                    int cfr_ignored_27 = Integer.rotateRight(0x89370843 ^ n2, 4) + -1576558760;
                    n += 5;
                    continue block21;
                }
                case 517878050: {
                    int cfr_ignored_28 = (Integer.rotateRight(0xE0035253 ^ n2, 15) + 616863560) * -536653229;
                    n3 = Integer.reverse(n2 ^ 0xC017C2B9 ^ 0xEF7600F4) + -1010580266 - -1010580266;
                    int cfr_ignored_29 = (Integer.rotateRight(0xC653E19B ^ n2, 11) + 142995712) * -967581285;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4)));
                    int cfr_ignored_30 = (Integer.rotateLeft(0xCE3A9771 ^ n2, 12) + -42600982) * -835020943;
                    int cfr_ignored_31 = (int)(0xC88394C27D4EB4FL ^ (long)n2 ^ 0x8FE8831A2DB9B4C1L);
                    ++n;
                    continue block21;
                }
            }
            int cfr_ignored_32 = (Integer.rotateRight(0x844C751F ^ n2, 3) - 161467900) * -2075364065;
            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x639AC58C ^ 0xEF7600F4)));
        }
    }

    private void tghn_2(class_5944 class_59442, String string, byq byq2) {
        int n = 0;
        int n2 = -798161520;
        n2 = Integer.rotateLeft(n2 * 435484429, 3) ^ 0x450A0136;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 16);
        class_5944 class_59443 = class_59442;
        n2 = (class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n2;
        int n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50);
        while (true) {
            block24: {
                block27: {
                    block34: {
                        block22: {
                            block29: {
                                block30: {
                                    block23: {
                                        block33: {
                                            block35: {
                                                block36: {
                                                    block31: {
                                                        block25: {
                                                            block21: {
                                                                block26: {
                                                                    block32: {
                                                                        block28: {
                                                                            block19: {
                                                                                block20: {
                                                                                    if ((n = Integer.reverse(n3) ^ n2 ^ 0x6093C50) > -1057825811) break block19;
                                                                                    if (n > -1612635482) break block20;
                                                                                    if (n == -1910979454) break block21;
                                                                                    if (n == -1725846201) break block22;
                                                                                    if (n == -1612635482) break block23;
                                                                                    break block24;
                                                                                }
                                                                                if (n == -1198865121) break block25;
                                                                                if (n == -1187434348) break block26;
                                                                                if (n == -1057825811) break block27;
                                                                                break block24;
                                                                            }
                                                                            if (n > 669035022) break block28;
                                                                            if (n == -910829746) break block29;
                                                                            if (n == -557611032) break block30;
                                                                            int cfr_ignored_0 = Integer.rotateLeft(0x96A74164 ^ n2, 5) - 1117686359;
                                                                            if (n == 669035022) break block31;
                                                                            break block24;
                                                                        }
                                                                        if (n > 928259705) break block32;
                                                                        if (n == 831356431) break block33;
                                                                        if (n == 928259705) break block34;
                                                                        break block24;
                                                                    }
                                                                    if (n == 1954110336) break block35;
                                                                    if (n == 2034264354) break block36;
                                                                    int cfr_ignored_1 = (Integer.rotateLeft(0x99390C91 ^ n2, 6) + -1840896822) * -1724314479;
                                                                    int cfr_ignored_2 = (int)(0x5B8BA2AC27D4EB4FL ^ (long)n2 ^ 0xB828831A2DB91AC6L);
                                                                    break block24;
                                                                }
                                                                int cfr_ignored_3 = (Integer.rotateLeft(0x8F37DCD0 ^ n2, 4) + 1545690219) * -1892164399;
                                                                return;
                                                            }
                                                            int cfr_ignored_4 = Integer.rotateLeft(0x4E749A09 ^ n2, 12) + -2072230318;
                                                            int cfr_ignored_5 = (int)(0x8CC6343427D4EB4FL ^ (long)n2 ^ 0x9518831A2DB8B45DL);
                                                            if (class_59442.method_34582(string) == null) {
                                                                int cfr_ignored_6 = (int)(0xDC754B58BB003CFL ^ (long)n2 ^ 0x541BDBD3FCB9B65FL);
                                                                n3 = Integer.reverse(n2 ^ 0x899A0173 ^ 0x6093C50) ^ 0xA46DAD28 ^ 0xA46DAD28;
                                                                int cfr_ignored_7 = (int)(0x3E5B4FCD5BE3A45EL ^ (long)n2 ^ 0x62EA7B74B39BD167L);
                                                                n3 = Integer.reverse(n2 ^ 0xB9393094 ^ 0x6093C50) + -1769217409 - -1769217409;
                                                                n -= 2;
                                                                continue;
                                                            }
                                                            n3 = Integer.reverse(n2 ^ 0xB88AC51F ^ 0x6093C50);
                                                            int cfr_ignored_8 = Integer.rotateLeft(0xD35B73E0 ^ n2, 13) + -1670338725;
                                                            n += 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_9 = Integer.rotateLeft(0xFE514AED ^ n2, 18) - -801787410;
                                                        int cfr_ignored_10 = (int)(0x3CE3E4D027D4EB4FL ^ (long)n2 ^ 0x34D0831A2DB9D416L);
                                                        class_59442.method_34582(string).method_35657(byq2.sbk() / Float.intBitsToFloat(-1171167367 - 1991403385), byq2.srl() / Float.intBitsToFloat(-253944428 - -1386340972), byq2.shsl_2() / Float.intBitsToFloat(0x8A009985 ^ 0xC97F9985), byq2.tzdh_2() / Float.intBitsToFloat(0x64890282 ^ 0x27F60282));
                                                        try {
                                                            n += 4;
                                                            if ((0xB48B8B515A50B25FL ^ (long)n2 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n3 = Integer.reverse(n2 ^ 0xB9393094 ^ 0x6093C50) + 1824042491 - 1824042491;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            n3 = (int)((long)Integer.reverse(n2 ^ 0xB9393094 ^ 0x6093C50) ^ 0x36EF44B758F65A74L ^ 0x36EF44B758F65A74L);
                                                        }
                                                        n -= 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_11 = Integer.rotateRight(0xF91B4067 ^ n2, 18) - 782920628;
                                                    int cfr_ignored_12 = (int)(0x1F92BD83B75EF138L ^ (long)n2 ^ 0x8677A20E195792F4L);
                                                    n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0xEC85B066 ^ 0xEC85B066;
                                                    n += 4;
                                                    continue;
                                                }
                                                int cfr_ignored_13 = Integer.rotateRight(0x60895F6A ^ n2, 15) + -1258279663;
                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xA07E2CB8 ^ 0x6093C50)));
                                                int cfr_ignored_14 = Integer.rotateRight(0xB88A7E43 ^ n2, 10) + 1562569048;
                                                try {
                                                    if ((0xFF8CC0A60C0425BDL ^ (long)n2 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0xB8B30E9D5249DBDDL ^ 0xB8B30E9D5249DBDDL);
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50);
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_15 = (Integer.rotateRight(0x22734F3F ^ n2, 7) - 810825692) * 577982271;
                                            try {
                                                --n;
                                                n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50);
                                            }
                                            catch (ArithmeticException arithmeticException) {
                                                n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0x19827008 ^ 0x19827008;
                                            }
                                            n -= 5;
                                            continue;
                                        }
                                        int cfr_ignored_16 = (Integer.rotateLeft(0x289F2130 ^ n2, 8) + -274553845) * 681517361;
                                        n3 = (int)((long)Integer.reverse(n2 ^ 0xCDCB2B22 ^ 0x6093C50) ^ 0xFE9C9048A69ED644L ^ 0xFE9C9048A69ED644L);
                                        int cfr_ignored_17 = (Integer.rotateRight(0x2B629BB2 ^ n2, 8) + 1162770889) * 727882675;
                                        int cfr_ignored_18 = (int)(0x90A48092D065A65L ^ (long)n2 ^ 0x6D6296BF4FEDBFC5L);
                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x29A7F698 ^ 0x6093C50)));
                                        int cfr_ignored_19 = (int)(0x73EB1DCADC0733E6L ^ (long)n2 ^ 0xC6E574BD9CEB4A07L);
                                        n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) + -494517630 - -494517630;
                                        continue;
                                    }
                                    int cfr_ignored_20 = Integer.rotateLeft(0x4FC1D3C4 ^ n2, 12) - -1395244041;
                                    n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0x2DB207EC ^ 0x2DB207EC;
                                    int cfr_ignored_21 = (Integer.rotateLeft(0x51D2EEB1 ^ n2, 13) + -320305494) * 1372778161;
                                    int cfr_ignored_22 = (int)(0x9360408C27D4EB4FL ^ (long)n2 ^ 0x7C68831A2DB88B11L);
                                    continue;
                                }
                                int cfr_ignored_23 = Integer.rotateLeft(0x8F1E27E8 ^ n2, 4) + 1493464147;
                                try {
                                    n += 5;
                                    if ((0x648376742032D545L ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0x5416C0CB85C27214L ^ 0x5416C0CB85C27214L);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) + -2077230487 - -2077230487;
                                }
                                continue;
                            }
                            int cfr_ignored_24 = (Integer.rotateLeft(0x864D5259 ^ n2, 3) + 1203410946) * -2041752999;
                            int cfr_ignored_25 = (int)(0x44FFFC6427D4EB4FL ^ (long)n2 ^ 0x5B8831A2DB9242EL);
                            n3 = (int)((long)Integer.reverse(n2 ^ 0x75904022 ^ 0x6093C50) ^ 0x98A359D142C616C4L ^ 0x98A359D142C616C4L);
                            int cfr_ignored_26 = (Integer.rotateLeft(0x654E15F1 ^ n2, 15) + 1221740394) * 1699616241;
                            int cfr_ignored_27 = (int)(0xA7FCBBCC27D4EB4FL ^ (long)n2 ^ 0x8AE8831A2DB8E228L);
                            n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50);
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_28 = (Integer.rotateRight(0x79F237FB ^ n2, 18) + -927832416) * 2045917179;
                        try {
                            --n;
                            if ((0xF15C200EF622F623L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0xF8BA7D92 ^ 0xF8BA7D92;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50)));
                        }
                        continue;
                    }
                    int cfr_ignored_29 = Integer.rotateLeft(0x1A444621 ^ n2, 6) + 849485114;
                    int cfr_ignored_30 = (int)(0xD8F6E81C27D4EB4FL ^ (long)n2 ^ 0x2D48831A2DB81C3CL);
                    int cfr_ignored_31 = (int)(0x558D897EDF48EC0EL ^ (long)n2 ^ 0xEF8D7222233B06CAL);
                    n3 = Integer.reverse(n2 ^ 0x51A00F4C ^ 0x6093C50) + 1379096166 - 1379096166;
                    int cfr_ignored_32 = (int)(0x8ED3570E537F896CL ^ (long)n2 ^ 0x536C6A4CE9FEB077L);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50)));
                    ++n;
                    continue;
                }
                int cfr_ignored_33 = (Integer.rotateRight(0x2EE9F5BF ^ n2, 8) - -1296932516) * 787084735;
                try {
                    if ((0x827AB8422AA7E5B1L ^ (long)n2 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0x331196C0 ^ 0x331196C0;
                }
                catch (ArithmeticException arithmeticException) {
                    n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0x1930393E ^ 0x1930393E;
                }
                ++n;
                continue;
            }
            int cfr_ignored_34 = (Integer.rotateLeft(0xE3A62510 ^ n2, 15) + -1787028437) * -475650799;
            n3 = Integer.reverse(n2 ^ 0x8E18C482 ^ 0x6093C50) ^ 0x98A3EC13 ^ 0x98A3EC13;
        }
    }

    private void sya_4(int n, int n2) {
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.identity();
        RenderSystem.setProjectionMatrix((Matrix4f)new Matrix4f().setOrtho(0.0f, (float)n, (float)n2, 0.0f, -1000.0f, 1000.0f), (class_10366)class_10366.field_54954);
        Matrix4f matrix4f = new Matrix4f();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, 0.0f, 0.0f, 0.0f).method_39415(-1);
        class_2872.method_22918(matrix4f, 0.0f, (float)n2, 0.0f).method_39415(-1);
        class_2872.method_22918(matrix4f, (float)n, (float)n2, 0.0f).method_39415(-1);
        class_2872.method_22918(matrix4f, (float)n, 0.0f, 0.0f).method_39415(-1);
        class_286.method_43433((class_9801)class_2872.method_60800());
        matrix4fStack.popMatrix();
    }

    private void shwz(int n, int n2) {
        int n3 = tdk.dqw_2(754226287);
        n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 20);
        int n4 = (n3 = n2 ^ n3) ^ 0xA65E6439;
        if ((n4 ^ n3) != -1503763399) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8AAAF056 ^ n3, 4) - -820987483) * -1968508841;
        }
        int n5 = this.dks_2.shghkh() ? 1 : 2;
        int n6 = Math.max(1, n / n5);
        int n7 = Math.max(1, n2 / n5);
        this.bkl = this.shmb(this.bkl, n, n2, true);
        this.jjs_2 = this.shmb(this.jjs_2, n, n2, true);
        this.hsr_2 = this.shmb(this.hsr_2, n6, n7, false);
        this.htgh = this.shmb(this.htgh, n6, n7, false);
    }

    private class_6367 shmb(class_6367 class_63672, int n, int n2, boolean bl) {
        try {
            int n3 = 401484913;
            n3 = Integer.rotateLeft(n3 * 1935545705, 5) ^ 0x585CD915;
            n3 = Integer.rotateRight(System.identityHashCode(this) ^ n3, 14);
            n3 = Integer.rotateLeft(bl ^ n3, 17);
            int n4 = n3 ^ 0xC92AB673;
            if ((n4 ^ n3) != -919947661) {
                int cfr_ignored_0 = (0xDEC49A02 ^ n3) - 1801478648;
            }
            if ((0x28C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (class_63672 == null) {
            class_63672 = new class_6367(n, n2, bl);
            this.rsy_2(class_63672);
        } else if (class_63672.field_1482 != n || class_63672.field_1481 != n2) {
            class_63672.method_1234(n, n2);
            this.rsy_2(class_63672);
        }
        this.shkm(class_63672);
        return class_63672;
    }

    private void rsy_2(class_6367 class_63672) {
        try {
            int n = -691292303;
            n = Integer.rotateLeft(n * 11226953, 9) ^ 0xF1412BCC;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 16);
            class_6367 class_63673 = class_63672;
            n = Integer.rotateLeft((class_63673 != null ? System.identityHashCode(class_63673) : 0) ^ n, 20);
            int n2 = n ^ 0x7D99D86B;
            if ((n2 ^ n) != 2107234411) {
                int cfr_ignored_0 = (0xAB526F1A ^ n) + -1327908266;
            }
            if ((0x34E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        class_63672.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
        class_63672.method_1230();
    }

    /*
     * Unable to fully structure code
     */
    private void shkm(class_6367 var1_1) {
        var4_2 = 0;
        var2_3 = -1530190903;
        var2_3 = Integer.rotateLeft(var2_3 * -1074789313, 17) ^ -478529680;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 17);
        var3_4 = (var2_3 ^ -1335024640 ^ 57396630) + 57396630;
        block24: while (true) {
            block45: {
                block46: {
                    block47: {
                        block50: {
                            block41: {
                                block43: {
                                    block49: {
                                        block40: {
                                            block48: {
                                                block44: {
                                                    block42: {
                                                        var4_2 = var3_4 - 57396630 ^ 57396630 ^ var2_3;
                                                        switch (var4_2 & 7) {
                                                            case 6: {
                                                                if (var4_2 == 1116988526) break block40;
                                                                if (var4_2 != 513012430) {
                                                                    (Integer.rotateLeft(1567791793 ^ var2_3, 14) + 1430149802) * 1567791793;
                                                                    (int)(-6935485649582232753L ^ (long)var2_3 ^ -7752802610058849711L);
                                                                    ** break;
                                                                }
                                                                break block41;
                                                            }
                                                            case 3: {
                                                                if (var4_2 == -622688965) break block42;
                                                                if (var4_2 != -1555829245) {
                                                                    ** break;
                                                                }
                                                                break block43;
                                                            }
                                                            case 2: {
                                                                if (var4_2 == 724078250) break block44;
                                                                if (var4_2 != -478850174) {
                                                                    Integer.rotateLeft(-818029784 ^ var2_3, 12) + 484124947;
                                                                    ** break;
                                                                }
                                                                break block45;
                                                            }
                                                            case 4: {
                                                                if (var4_2 == -1180803332) break block46;
                                                                if (var4_2 != -1917389372) {
                                                                    ** break;
                                                                }
                                                                break block47;
                                                            }
                                                            case 0: {
                                                                if (var4_2 == -1335024640) break;
                                                                if (var4_2 == -1063992752) break block48;
                                                                if (var4_2 != 1144041088) {
                                                                    ** break;
                                                                }
                                                                break block49;
                                                            }
                                                            case 7: {
                                                                if (var4_2 == 1080383231) ** GOTO lbl48
                                                                if (var4_2 != -412980361) {
                                                                    (Integer.rotateRight(-1943175490 ^ var2_3, 4) - -35653571) * -1943175489;
                                                                    ** break;
                                                                }
                                                                break block50;
lbl48:
                                                                // 1 sources

                                                                tdk.tsk(-474791648, var2_3);
                                                                (int)(9044416183583538197L ^ (long)var2_3 ^ -8340048416800418087L);
                                                                GlStateManager._bindTexture((int)var1_1.method_30278());
                                                                GlStateManager._texParameter((int)(-848125972 - -848129525), (int)(-1917275851 ^ -1917281996), (int)(1200622235 ^ 1200630938));
                                                                GlStateManager._texParameter((int)(-1445232547 + 1445236100), (int)(1357920718 + -1357910478), (int)(-1364413883 - -1364423612));
                                                                try {
                                                                    var4_2 -= 5;
                                                                    if ((2162719270263833413L ^ (long)var2_3 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -622688965 ^ 57396630) + 57396630));
                                                                }
                                                                catch (NoSuchElementException v0) {
                                                                    var3_4 = (var2_3 ^ -622688965 ^ 57396630) + 57396630 + 2050817028 - 2050817028;
                                                                }
                                                                var4_2 -= 5;
                                                                continue block24;
                                                            }
                                                        }
                                                        Integer.rotateRight(94220195 ^ var2_3, 3) + -1300896776;
                                                        GlStateManager._bindTexture((int)var1_1.method_30277());
                                                        GlStateManager._texParameter((int)(-182581688 + 182585241), (int)(Integer.reverse(1726755945) ^ -1775493273), (int)(-357119771 ^ -357110044));
                                                        GlStateManager._texParameter((int)(-821192754 + 821196307), (int)(Integer.reverse(-32284029) ^ -1052319617), (int)(Integer.reverse(-432596170) ^ 1826146918));
                                                        if (var1_1.method_30278() == -1) {
                                                            try {
                                                                var4_2 += 2;
                                                                if ((-104204288355783551L ^ (long)var2_3 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                var3_4 = (var2_3 ^ -622688965 ^ 57396630) + 57396630;
                                                            }
                                                            catch (IllegalStateException v1) {
                                                                var3_4 = (var2_3 ^ -622688965 ^ 57396630) + 57396630 + -1028404941 - -1028404941;
                                                            }
                                                            continue;
                                                        }
                                                        (int)(-6532726762197088003L ^ (long)var2_3 ^ -3292547286955137153L);
                                                        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 1080383231 ^ 57396630) + 57396630));
                                                        var4_2 += 3;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(-708335153 ^ var2_3, 13) - -410308788;
                                                    GlStateManager._bindTexture((int)0);
                                                    return;
                                                }
                                                (Integer.rotateLeft(-1110455760 ^ var2_3, 10) + 8854283) * -1110455759;
                                                var3_4 = (var2_3 ^ 1634330990 ^ 57396630) + 57396630 + 1726438098 - 1726438098;
                                                (Integer.rotateRight(-573699626 ^ var2_3, 14) - -531574747) * -573699625;
                                                try {
                                                    var4_2 -= 3;
                                                    if ((-1466005726225308139L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    var3_4 = (var2_3 ^ -1335024640 ^ 57396630) + 57396630;
                                                }
                                                catch (IllegalArgumentException v2) {
                                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1335024640 ^ 57396630) + 57396630));
                                                }
                                                continue;
                                            }
                                            (Integer.rotateRight(962049970 ^ var2_3, 10) + -167977527) * 962049971;
                                            var3_4 = (var2_3 ^ -668039498 ^ 57396630) + 57396630 ^ -905614341 ^ -905614341;
                                            Integer.rotateLeft(1831490029 ^ var2_3, 16) - 1014860526;
                                            (int)(-5793599651125597361L ^ (long)var2_3 ^ 202806131691156192L);
                                            (int)(-6095532810701853324L ^ (long)var2_3 ^ 6852304291199122177L);
                                            var3_4 = (var2_3 ^ -1437155082 ^ 57396630) + 57396630 ^ -62463086 ^ -62463086;
                                            (int)(-5063099107851502432L ^ (long)var2_3 ^ 8732311864549498537L);
                                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1335024640 ^ 57396630) + 57396630));
                                            --var4_2;
                                            continue;
                                        }
                                        Integer.rotateLeft(170864901 ^ var2_3, 4) - 1075089110;
                                        (int)(-3990858631245141169L ^ (long)var2_3 ^ -4395369087854166806L);
                                        var3_4 = (var2_3 ^ 66777281 ^ 57396630) + 57396630 + -1367394412 - -1367394412;
                                        (Integer.rotateRight(-787802409 ^ var2_3, 13) - 1421173572) * -787802409;
                                        try {
                                            var4_2 += 2;
                                            if ((7410762213782299433L ^ (long)var2_3 | 1L) == 0L) {
                                                throw new IllegalStateException();
                                            }
                                            var3_4 = (var2_3 ^ -1335024640 ^ 57396630) + 57396630 + 484474321 - 484474321;
                                        }
                                        catch (IllegalStateException v3) {
                                            var3_4 = (int)((long)((var2_3 ^ -1335024640 ^ 57396630) + 57396630) ^ 3299488943325115292L ^ 3299488943325115292L);
                                        }
                                        ++var4_2;
                                        continue;
                                    }
                                    (Integer.rotateRight(-1807300654 ^ var2_3, 5) + -118500951) * -1807300653;
                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 628543693 ^ 57396630) + 57396630));
                                    (Integer.rotateRight(1016740954 ^ var2_3, 10) + 1527442977) * 1016740955;
                                    try {
                                        var4_2 += 4;
                                        var3_4 = (var2_3 ^ -1335024640 ^ 57396630) + 57396630;
                                    }
                                    catch (IllegalArgumentException v4) {
                                        var3_4 = (var2_3 ^ -1335024640 ^ 57396630) + 57396630 + -1257978170 - -1257978170;
                                    }
                                    continue;
                                }
                                (Integer.rotateLeft(1175155741 ^ var2_3, 11) - 2143334078) * 1175155741;
                                (int)(-8882828958369518769L ^ (long)var2_3 ^ 5273859312110314658L);
                                var3_4 = (var2_3 ^ 1854739994 ^ 57396630) + 57396630 ^ -1461427956 ^ -1461427956;
                                (Integer.rotateRight(643060730 ^ var2_3, 7) + -1466709375) * 643060731;
                                try {
                                    var4_2 += 4;
                                    if ((8649577654926227765L ^ (long)var2_3 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    var3_4 = (var2_3 ^ -1335024640 ^ 57396630) + 57396630 + -423463099 - -423463099;
                                }
                                catch (IllegalStateException v5) {
                                    var3_4 = (var2_3 ^ -1335024640 ^ 57396630) + 57396630 + 1997181858 - 1997181858;
                                }
                                var4_2 += 3;
                                continue;
                            }
                            (Integer.rotateRight(1377476498 ^ var2_3, 13) + -174657047) * 1377476499;
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1080130468 ^ 57396630) + 57396630));
                            (Integer.rotateLeft(-905267460 ^ var2_3, 12) - 2074724287) * -905267459;
                            (int)(-2119629917712839707L ^ (long)var2_3 ^ -2102289953732138758L);
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1335024640 ^ 57396630) + 57396630));
                            continue;
                        }
                        (Integer.rotateLeft(193731517 ^ var2_3, 4) - 1783954206) * 193731517;
                        (int)(-3945516661501269169L ^ (long)var2_3 ^ -7606435622169329748L);
                        var3_4 = (int)((long)((var2_3 ^ 1608234528 ^ 57396630) + 57396630) ^ 3647963102055136412L ^ 3647963102055136412L);
                        (Integer.rotateRight(-1150757577 ^ var2_3, 10) - -1240502044) * -1150757577;
                        var3_4 = (int)((long)((var2_3 ^ 531600247 ^ 57396630) + 57396630) ^ -8873299451697955723L ^ -8873299451697955723L);
                        Integer.rotateRight(-1883663765 ^ var2_3, 4) + 1809209904;
                        var3_4 = (int)((long)((var2_3 ^ -1335024640 ^ 57396630) + 57396630) ^ 4134098459115986730L ^ 4134098459115986730L);
                        continue;
                    }
                    (Integer.rotateLeft(102615324 ^ var2_3, 3) - -1040647777) * 102615325;
                    var3_4 = (var2_3 ^ 1005135666 ^ 57396630) + 57396630 + -677522846 - -677522846;
                    (Integer.rotateRight(1230316307 ^ var2_3, 12) + -441655672) * 1230316307;
                    if (tdk.sbn_2(var2_3, 440254521)) {
                        (Integer.rotateLeft(-1437539271 ^ var2_3, 8) + -1540799966) * -1437539271;
                        (int)(7557684506389703503L ^ (long)var2_3 ^ 7599968519647230997L);
                    }
                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1335024640 ^ 57396630) + 57396630));
                    --var4_2;
                    continue;
                }
                (Integer.rotateRight(-1113213730 ^ var2_3, 10) - -76642787) * -1113213729;
                var3_4 = (int)((long)((var2_3 ^ 1737434688 ^ 57396630) + 57396630) ^ 1018072489266973073L ^ 1018072489266973073L);
                (Integer.rotateLeft(1688896604 ^ var2_3, 15) - 889431647) * 1688896605;
                try {
                    var4_2 -= 4;
                    if ((164410202092986547L ^ (long)var2_3 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var3_4 = (int)((long)((var2_3 ^ -1335024640 ^ 57396630) + 57396630) ^ -7900321958372671154L ^ -7900321958372671154L);
                }
                catch (UnsupportedOperationException v6) {
                    var3_4 = (var2_3 ^ -1335024640 ^ 57396630) + 57396630 + -987503241 - -987503241;
                }
                --var4_2;
                continue;
            }
            Integer.rotateRight(-994106461 ^ var2_3, 11) + -679284744;
            var3_4 = (var2_3 ^ -1510561275 ^ 57396630) + 57396630;
            (Integer.rotateRight(838578203 ^ var2_3, 9) + 299364992) * 838578203;
            try {
                --var4_2;
                if ((4512386007568667135L ^ (long)var2_3 | 1L) == 0L) {
                    throw new IllegalStateException();
                }
                var3_4 = (int)((long)((var2_3 ^ -1335024640 ^ 57396630) + 57396630) ^ 941566216960142096L ^ 941566216960142096L);
            }
            catch (IllegalStateException v7) {
                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1335024640 ^ 57396630) + 57396630));
            }
            var4_2 += 3;
            continue;
lbl239:
            // 7 sources

            tdk.tsk(1116415072, var2_3);
            (int)(-2541052901018928107L ^ (long)var2_3 ^ 5098692871273059497L);
            var3_4 = (int)((long)((var2_3 ^ -1335024640 ^ 57396630) + 57396630) ^ -3981239157408433957L ^ -3981239157408433957L);
        }
    }

    private void thtsh(int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = -1486247739;
        n4 = Integer.rotateLeft(n4 * -1225023897, 14) ^ 0xDC6BC910;
        n4 = System.identityHashCode(this) ^ n4;
        int n5 = (int)((long)Integer.rotateLeft(n4 ^ 0x2221A99, 21) ^ 0x91D4B15676812165L ^ 0x91D4B15676812165L);
        block31: while (true) {
            switch (Integer.rotateRight(n5, 21) ^ n4) {
                case -237100922: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xF6A08EF9 ^ n4, 17) + -506531998) * -157249799;
                    int cfr_ignored_1 = (int)(0x341220C427D4EB4FL ^ (long)n4 ^ 0xBCF8831A2DB9C5F5L);
                    RenderSystem.setShaderTexture((int)n2, (int)0);
                    ++n2;
                    try {
                        n3 += 4;
                        n5 = (int)((long)Integer.rotateLeft(n4 ^ 0x95E32F17, 21) ^ 0x3D79B2B9A1CD7963L ^ 0x3D79B2B9A1CD7963L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n5 = (int)((long)Integer.rotateLeft(n4 ^ 0x95E32F17, 21) ^ 0xF0CF72EB856BE88BL ^ 0xF0CF72EB856BE88BL);
                    }
                    n3 -= 5;
                    continue block31;
                }
                case 263957735: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0x7BCE1A7C ^ n4, 18) - 38982719) * 2077104765;
                    return;
                }
                case -1780273385: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x1D2B608C ^ n4, 6) - -1935781841;
                    if (n2 < n) {
                        try {
                            n3 -= 2;
                            if ((0x2B927D3CFD108065L ^ (long)n4 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n5 = Integer.rotateLeft(n4 ^ 0xF1DE2086, 21) + -1772669471 - -1772669471;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0xF1DE2086, 21)));
                        }
                        n3 -= 5;
                        continue block31;
                    }
                    n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0xC53AFD5D, 21)));
                    int cfr_ignored_4 = Integer.rotateRight(0xC96788E2 ^ n4, 12) + 1743205017;
                    n5 = Integer.rotateLeft(n4 ^ 0xFBBACE7, 21) + 675954235 - 675954235;
                    continue block31;
                }
                case 35789465: {
                    int cfr_ignored_5 = (Integer.rotateRight(0xE6B09436 ^ n4, 15) - -205549115) * -424635337;
                    n2 = 0;
                    try {
                        n3 -= 2;
                        if ((0x4E4736BA9078E891L ^ (long)n4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n5 = (int)((long)Integer.rotateLeft(n4 ^ 0x95E32F17, 21) ^ 0x3FD83CF2F6D4137DL ^ 0x3FD83CF2F6D4137DL);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0x95E32F17, 21)));
                    }
                    n3 += 5;
                    continue block31;
                }
                case -224939482: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x75E64697 ^ n4, 17) - 1262496644) * 1978025623;
                    n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0xC22FC65E, 21)));
                    int cfr_ignored_7 = Integer.rotateLeft(0xFFB21C9 ^ n4, 4) + -205080942;
                    int cfr_ignored_8 = (int)(0xCD498FF427D4EB4FL ^ (long)n4 ^ 0xE298831A2DB83742L);
                    try {
                        if ((0x5278B8DD71AC2A1DL ^ (long)n4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21) + 221768550 - 221768550;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n5 = (int)((long)Integer.rotateLeft(n4 ^ 0x2221A99, 21) ^ 0x3913FBE3242FFFF9L ^ 0x3913FBE3242FFFF9L);
                    }
                    n3 += 5;
                    continue block31;
                }
                case -649316280: {
                    int cfr_ignored_9 = Integer.rotateRight(0x36DD1087 ^ n4, 9) - -1457348716;
                    n5 = Integer.rotateLeft(n4 ^ 0x22F79F52, 21) ^ 0xE58A7B1C ^ 0xE58A7B1C;
                    int cfr_ignored_10 = (Integer.rotateRight(0x18EAD52 ^ n4, 3) + 883203113) * 26127699;
                    try {
                        if ((0xD1CF1C9955953A9FL ^ (long)n4 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0x2221A99, 21)));
                    }
                    continue block31;
                }
                case 971157929: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0x5FC09F15 ^ n4, 14) - -1666129210) * 1606459157;
                    int cfr_ignored_12 = (int)(0x9D72312827D4EB4FL ^ (long)n4 ^ 0x9F20831A2DB89735L);
                    n5 = (int)((long)Integer.rotateLeft(n4 ^ 0x2221A99, 21) ^ 0xB212EC07FC1575A1L ^ 0xB212EC07FC1575A1L);
                    --n3;
                    continue block31;
                }
                case 116304092: {
                    int cfr_ignored_13 = (Integer.rotateRight(0xB0434CFE ^ n4, 9) - 1552151037) * -1337766657;
                    n5 = Integer.rotateLeft(n4 ^ 0xBEC22DFC, 21);
                    int cfr_ignored_14 = (Integer.rotateRight(0xD5CA263E ^ n4, 13) - -405258051) * -708172225;
                    n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0x2221A99, 21)));
                    n3 += 2;
                    continue block31;
                }
                case 1502779519: {
                    int cfr_ignored_15 = Integer.rotateLeft(0xE7AA37A9 ^ n4, 15) + 301620402;
                    int cfr_ignored_16 = (int)(0x2518999427D4EB4FL ^ (long)n4 ^ 0xCE58831A2DB9E7E0L);
                    n5 = Integer.rotateLeft(n4 ^ 0x606C3A18, 21);
                    int cfr_ignored_17 = Integer.rotateLeft(0x1610296D ^ n4, 5) - -1336761490;
                    int cfr_ignored_18 = (int)(0xD4A2875027D4EB4FL ^ (long)n4 ^ 0xF3D0831A2DB80494L);
                    try {
                        n3 -= 4;
                        if ((0x1139D15F67DAEE9FL ^ (long)n4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21) + 581829973 - 581829973;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n5 = (int)((long)Integer.rotateLeft(n4 ^ 0x2221A99, 21) ^ 0x49891D0D93710E21L ^ 0x49891D0D93710E21L);
                    }
                    n3 -= 3;
                    continue block31;
                }
                case 1021892271: {
                    int cfr_ignored_19 = Integer.rotateRight(0x6FF74527 ^ n4, 16) - -1823539468;
                    n5 = Integer.rotateLeft(n4 ^ 0x32537AAA, 21);
                    int cfr_ignored_20 = (Integer.rotateLeft(0x37E68E3D ^ n4, 9) - -917972834) * 937856573;
                    int cfr_ignored_21 = (int)(0xF554200027D4EB4FL ^ (long)n4 ^ 0xBD70831A2DB84779L);
                    n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21) + 723566506 - 723566506;
                    int cfr_ignored_22 = Integer.rotateLeft(0xD5A87C6D ^ n4, 13) - -473649042;
                    int cfr_ignored_23 = (int)(0x171AD25027D4EB4FL ^ (long)n4 ^ 0x59D0831A2DB983E4L);
                    n3 -= 4;
                    continue block31;
                }
                case -1673130091: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x8729BADD ^ n4, 3) - 1651195902) * -2027308323;
                    int cfr_ignored_25 = (int)(0x459B14E027D4EB4FL ^ (long)n4 ^ 0xD4B0831A2DB926E7L);
                    n5 = Integer.rotateLeft(n4 ^ 0xC7DD17B9, 21) + -858779330 - -858779330;
                    int cfr_ignored_26 = (Integer.rotateLeft(0xF824F398 ^ n4, 18) + 282533539) * -131796071;
                    n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0x2221A99, 21)));
                    n3 += 5;
                    continue block31;
                }
                case 1232507007: {
                    int cfr_ignored_27 = (Integer.rotateRight(0xFCAAF272 ^ n4, 18) + -1659831543) * -55905677;
                    int cfr_ignored_28 = (int)(0x51DEF49325669C08L ^ (long)n4 ^ 0x1456867EC3370E6CL);
                    n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0x2221A99, 21)));
                    n3 += 4;
                    continue block31;
                }
                case -785539448: {
                    int cfr_ignored_29 = Integer.rotateRight(0xC59117AA ^ n4, 11) + -252740399;
                    n5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n4 ^ 0x817B623F, 21)));
                    int cfr_ignored_30 = Integer.rotateRight(0xC677F5C7 ^ n4, 11) - 216293972;
                    try {
                        n3 -= 3;
                        n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21) + -920062044 - -920062044;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21) ^ 0x20651A29 ^ 0x20651A29;
                    }
                    n3 += 3;
                    continue block31;
                }
                case -779384380: {
                    int cfr_ignored_31 = (Integer.rotateRight(0xF152BF56 ^ n4, 17) - 1029884581) * -246235305;
                    int cfr_ignored_32 = (int)(0xCE1828A5482A9D2DL ^ (long)n4 ^ 0xAC3A5CE6C17C31E1L);
                    n5 = Integer.rotateLeft(n4 ^ 0x49CDCF1D, 21);
                    int cfr_ignored_33 = (int)(0xB3BFA7CE98A0C766L ^ (long)n4 ^ 0xB2EDFDF275EACAAEL);
                    n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21);
                    n3 += 4;
                    continue block31;
                }
                case -200923116: {
                    int cfr_ignored_34 = (Integer.rotateRight(0x116F43D7 ^ n4, 5) - 550950468) * 292504535;
                    n5 = Integer.rotateLeft(n4 ^ 0xE77B2F4B, 21) ^ 0x6EF9E736 ^ 0x6EF9E736;
                    int cfr_ignored_35 = Integer.rotateLeft(0xCAE0D245 ^ n4, 12) - -1785260650;
                    int cfr_ignored_36 = (int)(0x8527C7827D4EB4FL ^ (long)n4 ^ 0x580831A2DB9BD75L);
                    n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21) + 1235379233 - 1235379233;
                    int cfr_ignored_37 = (Integer.rotateRight(0x23AE6C3F ^ n4, 7) - 1451014876) * 598633535;
                    n3 -= 5;
                    continue block31;
                }
            }
            int cfr_ignored_38 = (Integer.rotateRight(0x422E99B ^ n4, 3) + -2070419200) * 69396891;
            n5 = Integer.rotateLeft(n4 ^ 0x2221A99, 21) ^ 0xA4AE1FE2 ^ 0xA4AE1FE2;
        }
    }

    private boolean skhkh_2() {
        int n = -61806575;
        n = Integer.rotateLeft(n * 1403151289, 3) ^ 0x1ECCA7C2;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
        int n2 = n ^ 0x3D91F6C5;
        if ((n2 ^ n) != 1032976069) {
            int cfr_ignored_0 = (0xC1C11ED4 ^ n) + -434073028;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (bsh_5.mc.field_1724 == null) {
            return false;
        }
        return this.aydh(bsh_5.mc.field_1724.method_6047()) || this.aydh(bsh_5.mc.field_1724.method_6079());
    }

    private boolean aydh(class_1799 class_17992) {
        int n = -146613166;
        n = Integer.rotateLeft(n * 2014554669, 6) ^ 0x6CD7EA3B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE8B5158C;
        if ((n2 ^ n) != -390785652) {
            int cfr_ignored_0 = (0x1FF7C9DE ^ n) - 106576678;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !class_17992.method_7960() && class_17992.method_7909() instanceof class_1806;
    }

    private void khjh() {
        int n = 1019693198;
        n = Integer.rotateLeft(n * 1698350217, 19) ^ 0xC85CA2A9;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC12BAEFE;
        if ((n2 ^ n) != -1054101762) {
            int cfr_ignored_0 = (0xFDECE670 ^ n) + 1494447021;
        }
        this.khlf(this.bkl);
        this.khlf(this.jjs_2);
        this.khlf(this.hsr_2);
        this.khlf(this.htgh);
        this.bkl = null;
        this.jjs_2 = null;
        this.hsr_2 = null;
        this.htgh = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void khlf(class_6367 class_63672) {
        int n = 0;
        int n2 = -588717205;
        n2 = Integer.rotateLeft(n2 * 1001672479, 5) ^ 0xEEF89710;
        int n3 = 1683252513 + n2;
        while (true) {
            block27: {
                block29: {
                    block33: {
                        block28: {
                            block25: {
                                block37: {
                                    block26: {
                                        block34: {
                                            block38: {
                                                block23: {
                                                    block32: {
                                                        block35: {
                                                            block36: {
                                                                block30: {
                                                                    block31: {
                                                                        block20: {
                                                                            block21: {
                                                                                block24: {
                                                                                    block22: {
                                                                                        block19: {
                                                                                            if ((n = n3 - n2) <= -829052298) break block19;
                                                                                            if (n <= 185800992) break block20;
                                                                                            break block21;
                                                                                        }
                                                                                        if (n <= -1417952810) break block22;
                                                                                        if (n == -1012814207) break block23;
                                                                                        break block24;
                                                                                    }
                                                                                    if (n == -1926803603) break block25;
                                                                                    if (n == -1462045287) break block26;
                                                                                    if (n == -1417952810) {
                                                                                        int cfr_ignored_0 = Integer.rotateLeft(0xD0A91D8D ^ n2, 13) - 1222128462;
                                                                                        int cfr_ignored_1 = (int)(0x121BB3B027D4EB4FL ^ (long)n2 ^ 0x9A10831A2DB989E6L);
                                                                                        return;
                                                                                    }
                                                                                    break block27;
                                                                                }
                                                                                if (n == -953515559) break block28;
                                                                                int cfr_ignored_2 = Integer.rotateRight(0xD255EB8A ^ n2, 13) + 2093294833;
                                                                                if (n == -829052298) break block29;
                                                                                break block27;
                                                                            }
                                                                            if (n <= 881853621) break block30;
                                                                            break block31;
                                                                        }
                                                                        if (n == -466714743) break block32;
                                                                        if (n == -361400849) break block33;
                                                                        if (n == 185800992) break block34;
                                                                        break block27;
                                                                    }
                                                                    if (n == 1683252513) break block35;
                                                                    break block36;
                                                                }
                                                                if (n == 807561236) break block37;
                                                                if (n == 881853621) break block38;
                                                                int cfr_ignored_3 = (Integer.rotateRight(0x25124E97 ^ n2, 7) - -2120932476) * 621956759;
                                                                break block27;
                                                            }
                                                            if (n == 1979836303) {
                                                                int cfr_ignored_4 = Integer.rotateLeft(0x268360C5 ^ n2, 7) - -1371121898;
                                                                int cfr_ignored_5 = (int)(0xE431CEF827D4EB4FL ^ (long)n2 ^ 0x6080831A2DB865B2L);
                                                                class_63672.method_1238();
                                                                n3 = -1417952810 + n2 + 1208667897 - 1208667897;
                                                                int cfr_ignored_6 = (Integer.rotateRight(0xAB8D721A ^ n2, 8) + -897683359) * -1416793573;
                                                                n += 4;
                                                                continue;
                                                            }
                                                            break block27;
                                                        }
                                                        int cfr_ignored_7 = Integer.rotateLeft(0xF4CF5625 ^ n2, 17) - -1451684426;
                                                        int cfr_ignored_8 = (int)(0x367DF81827D4EB4FL ^ (long)n2 ^ 0xD40831A2DB9C12AL);
                                                        if (class_63672 != null) {
                                                            n3 = 1277538962 + n2 ^ 0x11940052 ^ 0x11940052;
                                                            int cfr_ignored_9 = Integer.rotateRight(0x360D0AAB ^ n2, 9) + -1879971344;
                                                            n3 = (int)((long)(1979836303 + n2) ^ 0x8C6B20398730EA71L ^ 0x8C6B20398730EA71L);
                                                            n += 2;
                                                            continue;
                                                        }
                                                        try {
                                                            n -= 2;
                                                            if ((0x6F65278F9F6A181BL ^ (long)n2 | 1L) == 0L) {
                                                                throw new NoSuchElementException();
                                                            }
                                                            n3 = -1417952810 + n2 ^ 0xAB240AC1 ^ 0xAB240AC1;
                                                        }
                                                        catch (NoSuchElementException noSuchElementException) {
                                                            n3 = -1417952810 + n2 ^ 0xFDE7AEE1 ^ 0xFDE7AEE1;
                                                        }
                                                        --n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_10 = Integer.rotateLeft(0x5A648D81 ^ n2, 14) + -158678566;
                                                    int cfr_ignored_11 = (int)(0x98D623BC27D4EB4FL ^ (long)n2 ^ 0xBA08831A2DB89C7DL);
                                                    n3 = (int)((long)(1683252513 + n2) ^ 0x97930354D179175FL ^ 0x97930354D179175FL);
                                                    continue;
                                                }
                                                int cfr_ignored_12 = Integer.rotateRight(0x438DAA0B ^ n2, 11) + 847591056;
                                                n3 = 1532763303 + n2 ^ 0xB92E0FA0 ^ 0xB92E0FA0;
                                                int cfr_ignored_13 = Integer.rotateRight(0x352C12E7 ^ n2, 9) - 1957947700;
                                                int cfr_ignored_14 = (int)(0x958E8F7B0B50CDCDL ^ (long)n2 ^ 0xE386DA1260BC86CCL);
                                                n3 = -646672317 + n2;
                                                int cfr_ignored_15 = (int)(0x1AB02FBC0874388BL ^ (long)n2 ^ 0xA208DC5B8A3198B1L);
                                                n3 = 1683252513 + n2;
                                                --n;
                                                continue;
                                            }
                                            int cfr_ignored_16 = Integer.rotateRight(0xD7AB3BC3 ^ n2, 13) + 572120024;
                                            try {
                                                --n;
                                                if ((0xE48502909540720DL ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = 1683252513 + n2 + 2088100490 - 2088100490;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = 1683252513 + n2 ^ 0xC339081 ^ 0xC339081;
                                            }
                                            n -= 2;
                                            continue;
                                        }
                                        int cfr_ignored_17 = (Integer.rotateRight(0x73D93B3A ^ n2, 17) + 195808065) * 1943616315;
                                        n3 = -1401453031 + n2 + 1070620023 - 1070620023;
                                        int cfr_ignored_18 = (Integer.rotateLeft(0x62DA02D0 ^ n2, 15) + -54266261) * 1658454737;
                                        try {
                                            n -= 4;
                                            if ((0x6CE31D5A37B5280BL ^ (long)n2 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            n3 = 1683252513 + n2;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            n3 = 1683252513 + n2 + -1618813251 - -1618813251;
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_19 = (Integer.rotateLeft(0x7FB8F5C ^ n2, 3) - -69993633) * 133926749;
                                    int cfr_ignored_20 = (int)(0xF74E50D8505AEC3EL ^ (long)n2 ^ 0x5CC06C06235A434DL);
                                    n3 = 1683252513 + n2;
                                    continue;
                                }
                                int cfr_ignored_21 = Integer.rotateLeft(0xFF5EEDC0 ^ n2, 18) + -253990533;
                                n3 = 630829165 + n2 + -1740486875 - -1740486875;
                                int cfr_ignored_22 = Integer.rotateLeft(0x931DA5A4 ^ n2, 5) - -722162153;
                                int cfr_ignored_23 = (int)(0x9B131FDAC573BB6DL ^ (long)n2 ^ 0xC2C546548DFC9BF7L);
                                n3 = 1352860182 + n2;
                                int cfr_ignored_24 = (int)(0x64EBA9620C4D133AL ^ (long)n2 ^ 0xAFB4D429DD536406L);
                                n3 = 1683252513 + n2 ^ 0x24C50D81 ^ 0x24C50D81;
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_25 = Integer.rotateRight(0x531D7C4A ^ n2, 13) + 351251505;
                            n3 = -708174794 + n2;
                            int cfr_ignored_26 = Integer.rotateRight(0xD74383A6 ^ n2, 13) - 361402453;
                            try {
                                n += 2;
                                if ((0xA0750B4EA3753989L ^ (long)n2 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                n3 = 1683252513 + n2;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n3 = (int)((long)(1683252513 + n2) ^ 0x3B0C164817F858A6L ^ 0x3B0C164817F858A6L);
                            }
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_27 = Integer.rotateRight(0xB2A8C442 ^ n2, 9) + -1496489159;
                        n3 = (int)((long)(-76077533 + n2) ^ 0x83A6462DDBCDF840L ^ 0x83A6462DDBCDF840L);
                        int cfr_ignored_28 = Integer.rotateRight(0x585DB80E ^ n2, 14) - -1212749587;
                        try {
                            if ((0x8A0223EED563EA51L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = 1683252513 + n2;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.reverse(Integer.reverse(1683252513 + n2));
                        }
                        n += 4;
                        continue;
                    }
                    int cfr_ignored_29 = (Integer.rotateRight(0xC69C0996 ^ n2, 11) - 289589349) * -962852457;
                    int cfr_ignored_30 = (int)(0x89C285005C7C08FEL ^ (long)n2 ^ 0xF770744BEADABE54L);
                    n3 = 1683252513 + n2 + 357614561 - 357614561;
                    continue;
                }
                int cfr_ignored_31 = (Integer.rotateLeft(0xA1A05698 ^ n2, 7) + -1765270621) * -1583327591;
                n3 = Integer.reverse(Integer.reverse(1211512850 + n2));
                int cfr_ignored_32 = Integer.rotateLeft(0x760342D ^ n2, 3) - -385617746;
                int cfr_ignored_33 = (int)(0xC5D29A1027D4EB4FL ^ (long)n2 ^ 0xC950831A2DB82674L);
                int cfr_ignored_34 = (int)(0x7D55405BF8404E03L ^ (long)n2 ^ 0x7DC73C336721577BL);
                n3 = (int)((long)(491957459 + n2) ^ 0xEF9F7BDEA10FE88BL ^ 0xEF9F7BDEA10FE88BL);
                int cfr_ignored_35 = (int)(0x1B193CEFF8AAB92CL ^ (long)n2 ^ 0x84AF3DE6897F9BE3L);
                n3 = (int)((long)(1683252513 + n2) ^ 0xD3AE01C807F232C6L ^ 0xD3AE01C807F232C6L);
                n -= 2;
                continue;
            }
            int cfr_ignored_36 = Integer.rotateRight(0x4A358F6F ^ n2, 12) - 14286252;
            n3 = Integer.reverse(Integer.reverse(1683252513 + n2));
        }
    }

    private boolean thhj_2() {
        try {
            int n = -1618801694;
            n = Integer.rotateLeft(n * -839705089, 9) ^ 0xF97E868E;
            int n2 = n ^ 0xD9C8F065;
            if ((n2 ^ n) != -641142683) {
                int cfr_ignored_0 = (0x464BFB87 ^ n) + 214452419;
            }
            if ((0x303 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.dks_2.shghkh();
    }

    private boolean ztf_4() {
        int n = 805357646;
        int n2 = (n = Integer.rotateLeft(n * -459200001, 23) ^ 0x902C3911) ^ 0x6F486CB;
        if ((n2 ^ n) != 116688587) {
            int cfr_ignored_0 = (0x36F44E85 ^ n) + -1443668153;
        }
        return !this.dks_2.shghkh();
    }

    private boolean zlsh() {
        int n = -2119291618;
        int n2 = (n = Integer.rotateLeft(n * 433279687, 17) ^ 0x1033A2A8) ^ 0xB284DB7A;
        if ((n2 ^ n) != -1299915910) {
            int cfr_ignored_0 = (0x332AF664 ^ n) + -737482577;
        }
        return !this.dks_2.shghkh();
    }

    private boolean jmth() {
        int n = -551294651;
        int n2 = (n = Integer.rotateLeft(n * -1958147649, 9) ^ 0xBEFE3A4) ^ 0xBB0CEC64;
        if ((n2 ^ n) != -1156780956) {
            int cfr_ignored_0 = (0x642F0521 ^ n) - -693235575;
        }
        return !this.dks_2.shghkh();
    }

    private boolean dhkha_2() {
        int n = tdk.dqw_2(-99725066);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
        int n2 = n ^ 0x49D762F0;
        if ((n2 ^ n) != 1238852336) {
            int cfr_ignored_0 = Integer.rotateRight(0xB3D93206 ^ n, 9) - -878006795;
        }
        return !this.dks_2.shghkh();
    }

    private boolean tdsh() {
        try {
            int n = -2073092465;
            n = Integer.rotateLeft(n * -441070187, 25) ^ 0x4343C998;
            int n2 = n ^ 0x5CCA09F3;
            if ((n2 ^ n) != 1556744691) {
                int cfr_ignored_0 = (0xD8A5177C ^ n) - -53579488;
            }
            if ((0x32B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.dks_2.shghkh();
    }

    private boolean tbw_2() {
        int n = tdk.dqw_2(-1887204897);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
        int n2 = n ^ 0x90C01234;
        if ((n2 ^ n) != -1866460620) {
            int cfr_ignored_0 = Integer.rotateRight(0x1F439BEB ^ n, 6) + -846364496;
        }
        return !this.dks_2.shghkh();
    }

    private boolean ghsj_2() {
        int n = 15162518;
        n = Integer.rotateLeft(n * 1295520767, 4) ^ 0xE87FA2C5;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
        int n2 = n ^ 0xE8B5959F;
        if ((n2 ^ n) != -390752865) {
            int cfr_ignored_0 = (0xE852C909 ^ n) - 1886833006;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.dks_2.shghkh();
    }

    private boolean ady_2() {
        int n = 869155728;
        n = Integer.rotateLeft(n * 2032059785, 17) ^ 0x19592CF3;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
        int n2 = n ^ 0xC497B84D;
        if ((n2 ^ n) != -996689843) {
            int cfr_ignored_0 = (0xF759FBDD ^ n) - -1173409119;
        }
        return !this.dks_2.shghkh();
    }

    private boolean sys() {
        int n = 988273896;
        int n2 = (n = Integer.rotateLeft(n * 1696196411, 25) ^ 0x20D883A3) ^ 0xEB317BD3;
        if ((n2 ^ n) != -349078573) {
            int cfr_ignored_0 = (0xD1D6A73B ^ n) - 85716938;
        }
        return !this.dks_2.shghkh() || !this.hsw.shghkh();
    }

    private boolean khjdh() {
        int n = 178275008;
        n = Integer.rotateLeft(n * -1456067759, 4) ^ 0xCE6D0E72;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0x38C55B39;
        if ((n2 ^ n) != 952458041) {
            int cfr_ignored_0 = (0x326519F9 ^ n) + -2145668017;
        }
        return !this.dks_2.shghkh();
    }

    private boolean khh_2() {
        int n = tdk.dqw_2(1846411660);
        int n2 = n ^ 0x4D557ED9;
        if ((n2 ^ n) != 1297448665) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x235B7F55 ^ n, 7) - 1282542214) * 593198933;
            int cfr_ignored_1 = (int)(0xE1E9D16827D4EB4FL ^ (long)n ^ 0x5FA0831A2DB86E02L);
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.kz_2.shghkh();
    }

    private boolean thrk() {
        int n;
        block1: {
            int n2 = 1263770798;
            n2 = Integer.rotateLeft(n2 * -74892027, 23) ^ 0x8A132EAF;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x384BECDA;
            if ((n3 ^ n2) != 944499930) {
                int cfr_ignored_0 = (0x73187074 ^ n2) + -1305355719;
            }
            n = !this.kz_2.shghkh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x4134;
        }
        return n != 0;
    }

    private boolean zhdh_3() {
        int n = tdk.dqw_2(-2058534117);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x1AC4CB93;
        if ((n2 ^ n) != 449104787) {
            int cfr_ignored_0 = Integer.rotateLeft(0x9F898888 ^ n, 6) + 1443178419;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.kz_2.shghkh();
    }

    private boolean zhq() {
        int n = -763282122;
        int n2 = (n = Integer.rotateLeft(n * 1892263471, 3) ^ 0x19261515) ^ 0xEC6AD730;
        if ((n2 ^ n) != -328542416) {
            int cfr_ignored_0 = (0x3EEBEA06 ^ n) - -1829042501;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.kz_2.shghkh();
    }

    private boolean sfh_3() {
        int n = tdk.dqw_2(-1352727692);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
        int n2 = n ^ 0xA5D57EE4;
        if ((n2 ^ n) != -1512735004) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xA8A7D90 ^ n, 4) + 1260573611) * 176848273;
        }
        return !this.kz_2.shghkh();
    }

    private boolean dks_2() {
        try {
            int n = -90084412;
            n = Integer.rotateLeft(n * 1190202597, 25) ^ 0x58ED7746;
            int n2 = n ^ 0x60769AE5;
            if ((n2 ^ n) != 1618385637) {
                int cfr_ignored_0 = (0x9AD7F121 ^ n) + 2068134795;
            }
            if ((0x253 & 0) != 0) {
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
        return !this.kz_2.shghkh();
    }

    private boolean trn() {
        int n = 387302991;
        n = Integer.rotateLeft(n * -520387865, 14) ^ 0xA2F8927F;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0x690CC2BC;
        if ((n2 ^ n) != 1762443964) {
            int cfr_ignored_0 = (0x7E1904F3 ^ n) - 53071087;
        }
        return !this.kz_2.shghkh();
    }

    private static String jbz(String string, int n, int n2, int n3) {
        int n4 = 689584220;
        n4 = Integer.rotateLeft(n4 * 516647571, 24) ^ 0xECEE27FE;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 21);
        int n5 = (n4 = n3 ^ n4) ^ 0xDB3247D6;
        if ((n5 ^ n4) != -617461802) {
            int cfr_ignored_0 = (0xF2287F8A ^ n4) + 72183885;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xFAFDE814 ^ n2 - i) + thzr_2, 6) ^ khza_2 + i * 1387814235));
        }
        return new String(cArray);
    }

    private static void hlgh(bsh_5 bsh2_2) {
        int n = tdk.dqw_2(-1514115242);
        int n2 = n ^ 0xC5A60A32;
        if ((n2 ^ n) != -978974158) {
            int cfr_ignored_0 = Integer.rotateLeft(0x60666564 ^ n, 15) - -1329338793;
        }
        bsh2_2.khjh();
    }

    private static boolean zmh_2(bsh_5 bsh2_2) {
        block0: {
            int n = -860111530;
            n = Integer.rotateLeft(n * -801853025, 12) ^ 0x4FCB6293;
            bsh_5 bsh3_2 = bsh2_2;
            n = Integer.rotateLeft((bsh3_2 != null ? System.identityHashCode(bsh3_2) : 0) ^ n, 11);
            int n2 = n ^ 0xCE94ABC1;
            if ((n2 ^ n) == -829117503) break block0;
            int cfr_ignored_0 = (0x22F1697 ^ n) - -1415278419;
        }
        return bsh2_2.rgha_2();
    }

    private static void sdhkh_2() {
        int n = 1501109515;
        int n2 = (n = Integer.rotateLeft(n * 1025141057, 16) ^ 0xAD7FA740) ^ 0xC83C4B46;
        if ((n2 ^ n) != -935572666) {
            int cfr_ignored_0 = (0x9145564D ^ n) + 1161261267;
        }
        yf.athz_2();
    }

    private static void dtd_3(bsh_5 bsh2_2, int n, int n2) {
        int n3 = -425884061;
        n3 = Integer.rotateLeft(n3 * -1193105025, 15) ^ 0x83C4395;
        bsh_5 bsh3_2 = bsh2_2;
        n3 = Integer.rotateRight((bsh3_2 != null ? System.identityHashCode(bsh3_2) : 0) ^ n3, 16);
        int n4 = n3 ^ 0xE34DF4F;
        if ((n4 ^ n3) != 238346063) {
            int cfr_ignored_0 = (0xE8A9592C ^ n3) + -424485752;
        }
        bsh2_2.shwz(n, n2);
    }

    private static void sjs_4(class_6367 class_63672, boolean bl) {
        int n = 1056997447;
        n = Integer.rotateLeft(n * -1493849755, 10) ^ 0x13809145;
        int n2 = (n = Integer.rotateRight(bl ^ n, 25)) ^ 0xECA8B9EC;
        if ((n2 ^ n) != -324486676) {
            int cfr_ignored_0 = (0xD3A839AB ^ n) - -814337532;
        }
        class_63672.method_1235(bl);
    }

    private static void tdht(class_276 class_2762, int n, int n2) {
        int n3 = tdk.dqw_2(-1660624514);
        int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 26)) ^ 0xA202A30D;
        if ((n4 ^ n3) != -1576885491) {
            int cfr_ignored_0 = (Integer.rotateRight(0x3F064273 ^ n3, 10) + -1507874008) * 1057374835;
        }
        class_2762.method_1237(n, n2);
    }

    private static void rthsh(class_276 class_2762, boolean bl) {
        int n = tdk.dqw_2(393239415);
        class_276 class_2763 = class_2762;
        n = (class_2763 != null ? System.identityHashCode(class_2763) : 0) ^ n;
        int n2 = n ^ 0xBA3ED25A;
        if ((n2 ^ n) != -1170288038) {
            int cfr_ignored_0 = Integer.rotateLeft(0xAD4E892D ^ n, 8) - 14695342;
            int cfr_ignored_1 = (int)(0x6FFC271027D4EB4FL ^ (long)n ^ 0xB350831A2DB97229L);
        }
        class_2762.method_1235(bl);
    }

    private static boolean jzh_2() {
        block0: {
            int n = tdk.dqw_2(-379765554);
            int n2 = n ^ 0x7BAB5023;
            if ((n2 ^ n) == 2074824739) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x92F66CED ^ n, 5) - -801845266;
            int cfr_ignored_1 = (int)(0x5044C2D027D4EB4FL ^ (long)n ^ 0x78D0831A2DB90D58L);
        }
        return yf.dnkh();
    }

    private static int ghkha(class_6367 class_63672) {
        block0: {
            int n = tdk.dqw_2(363674402);
            int n2 = n ^ 0x76B4FCE9;
            if ((n2 ^ n) == 1991572713) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6319C7CB ^ n, 15) + 75288784;
        }
        return class_63672.method_30277();
    }

    private static void shht_3(int n, int n2) {
        int n3 = 86453261;
        n3 = Integer.rotateLeft(n3 * -315473289, 16) ^ 0x47E457A6;
        int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 2)) ^ 0x1CEE1C8A;
        if ((n4 ^ n3) != 485366922) {
            int cfr_ignored_0 = (0x19C93087 ^ n3) - 829100236;
        }
        RenderSystem.setShaderTexture((int)n, (int)n2);
    }

    private static void ghs_2(bsh_5 bsh2_2, class_5944 class_59442, String string, float f) {
        int n = 814848056;
        n = Integer.rotateLeft(n * -290987527, 19) ^ 0x82E80DE5;
        class_5944 class_59443 = class_59442;
        n = (class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
        int n2 = n ^ 0x3400291;
        if ((n2 ^ n) != 54526609) {
            int cfr_ignored_0 = (0x33D19AA9 ^ n) - 1114494927;
        }
        bsh2_2.syf(class_59442, string, f);
    }

    private static String khsk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tdk.dqw_2(1688037596);
            n4 = n2 ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 17)) ^ 0x4D2E4C4C;
            if ((n5 ^ n4) == 1294879820) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x29B32490 ^ n4, 8) + 286198955) * 699606161;
        }
        return bsh_5.jbz(string, n, n2, n3);
    }

    private static float jthh_2(tay tay2) {
        block0: {
            int n = tdk.dqw_2(-819840734);
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0xEAB7230C;
            if ((n2 ^ n) == -357096692) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x25951A2E ^ n, 7) - -1855206707;
        }
        return tay2.thw_5();
    }

    private static void daf_2(bsh_5 bsh2_2, class_5944 class_59442, String string, float f) {
        int n = -519592465;
        n = Integer.rotateLeft(n * -216182117, 21) ^ 0x37DEC676;
        class_5944 class_59443 = class_59442;
        n = (class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
        int n2 = n ^ 0xA5E25D04;
        if ((n2 ^ n) != -1511891708) {
            int cfr_ignored_0 = (0x44E5F8EB ^ n) - 649081384;
        }
        bsh2_2.syf(class_59442, string, f);
    }

    private static void tzkh_3(bsh_5 bsh2_2, class_5944 class_59442, String string, float f, float f2) {
        int n = tdk.dqw_2(1380899101);
        bsh_5 bsh3_2 = bsh2_2;
        n = (bsh3_2 != null ? System.identityHashCode(bsh3_2) : 0) ^ n;
        int n2 = n ^ 0xEA23874F;
        if ((n2 ^ n) != -366770353) {
            int cfr_ignored_0 = (Integer.rotateRight(0xB86D5E52 ^ n, 10) + 1503398697) * -1200791981;
        }
        bsh2_2.snh_4(class_59442, string, f, f2);
    }

    private static int andh(int n) {
        block0: {
            int n2 = tdk.dqw_2(-607072580);
            int n3 = (n2 = n ^ n2) ^ 0xC4C30620;
            if ((n3 ^ n2) == -993851872) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1F13C89C ^ n2, 6) - -943527393) * 521390237;
        }
        return Integer.reverse(n);
    }

    private static int tal_2(int n, int n2) {
        block0: {
            int n3 = tdk.dqw_2(-572423375);
            int n4 = (n3 = n2 ^ n3) ^ 0x8345445B;
            if ((n4 ^ n3) == -2092612517) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x5EA4C76A ^ n3, 14) + 2052179217;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dhh_8(String string, String string2) {
        block0: {
            int n = 1528738918;
            int n2 = (n = Integer.rotateLeft(n * -614346731, 13) ^ 0x1634E2E) ^ 0x41FA54A;
            if ((n2 ^ n) == 69182794) break block0;
            int cfr_ignored_0 = (0x5F01112C ^ n) - -871808674;
        }
        return string.concat(string2);
    }

    private static void tll(bsh_5 bsh2_2, class_5944 class_59442, String string, float f) {
        int n = tdk.dqw_2(1400420083);
        bsh_5 bsh3_2 = bsh2_2;
        n = (bsh3_2 != null ? System.identityHashCode(bsh3_2) : 0) ^ n;
        class_5944 class_59443 = class_59442;
        n = Integer.rotateRight((class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n, 12);
        int n2 = n ^ 0x6AD53F1E;
        if ((n2 ^ n) != 1792360222) {
            int cfr_ignored_0 = Integer.rotateLeft(0x39AD89ED ^ n, 10) - 6378222;
            int cfr_ignored_1 = (int)(0xFB1F27D027D4EB4FL ^ (long)n ^ 0xB2D0831A2DB85BEFL);
        }
        bsh2_2.syf(class_59442, string, f);
    }

    private static void tzl(bsh_5 bsh2_2, class_5944 class_59442, String string, float f) {
        int n = 1902593668;
        n = Integer.rotateLeft(n * -1596296615, 27) ^ 0x466F11C;
        bsh_5 bsh3_2 = bsh2_2;
        n = Integer.rotateRight((bsh3_2 != null ? System.identityHashCode(bsh3_2) : 0) ^ n, 5);
        class_5944 class_59443 = class_59442;
        n = Integer.rotateRight((class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n, 25);
        int n2 = n ^ 0xD0915BCC;
        if ((n2 ^ n) != -795780148) {
            int cfr_ignored_0 = (0xA1F61D48 ^ n) + 977410355;
        }
        bsh2_2.syf(class_59442, string, f);
    }

    private static String hthk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1233151358;
            n4 = Integer.rotateLeft(n4 * 774490393, 20) ^ 0x4ACFCC86;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
            int n5 = (n4 = n ^ n4) ^ 0x232E89FD;
            if ((n5 ^ n4) == 590252541) break block0;
            int cfr_ignored_0 = (0x9551137F ^ n4) + 1460823455;
        }
        return bsh_5.jbz(string, n, n2, n3);
    }

    private static int zths_3(int n) {
        block0: {
            int n2 = -1091303101;
            n2 = Integer.rotateLeft(n2 * -978520165, 21) ^ 0x84FF902B;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 24)) ^ 0x92808DA7;
            if ((n3 ^ n2) == -1837068889) break block0;
            int cfr_ignored_0 = (0x2C7484E4 ^ n2) - -1443328669;
        }
        return Integer.reverse(n);
    }

    private static float tthgh_2(tay tay2) {
        block0: {
            int n = -423542337;
            n = Integer.rotateLeft(n * -403474071, 10) ^ 0x9E3A8229;
            tay tay3 = tay2;
            n = Integer.rotateLeft((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 14);
            int n2 = n ^ 0xB2920839;
            if ((n2 ^ n) == -1299052487) break block0;
            int cfr_ignored_0 = (0x54534986 ^ n) + -1742936638;
        }
        return tay2.thw_5();
    }

    private static void zjs_4(bsh_5 bsh2_2, class_5944 class_59442, String string, float f) {
        int n = -1631751988;
        n = Integer.rotateLeft(n * 1919986121, 15) ^ 0x113F7B89;
        bsh_5 bsh3_2 = bsh2_2;
        n = Integer.rotateLeft((bsh3_2 != null ? System.identityHashCode(bsh3_2) : 0) ^ n, 5);
        class_5944 class_59443 = class_59442;
        n = Integer.rotateRight((class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n, 22);
        int n2 = n ^ 0xDE0B757B;
        if ((n2 ^ n) != -569674373) {
            int cfr_ignored_0 = (0x40B605B7 ^ n) - 1293494742;
        }
        bsh2_2.syf(class_59442, string, f);
    }

    private static int athh(int n) {
        block0: {
            int n2 = tdk.dqw_2(-1818423791);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 13)) ^ 0xBEE6210C;
            if ((n3 ^ n2) == -1092214516) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x2D7B2F1D ^ n2, 8) - -2042080322) * 763047709;
            int cfr_ignored_1 = (int)(0xEFC9812027D4EB4FL ^ (long)n2 ^ 0xFF30831A2DB87242L);
        }
        return Integer.reverse(n);
    }

    private static float dhl_5(tay tay2) {
        block0: {
            int n = tdk.dqw_2(-410408149);
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 13);
            int n2 = n ^ 0x508AF1A6;
            if ((n2 ^ n) == 1351283110) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xB7035A8D ^ n, 9) - 767923790;
            int cfr_ignored_1 = (int)(0x75B1F4B027D4EB4FL ^ (long)n ^ 0x1410831A2DB946B2L);
        }
        return tay2.thw_5();
    }

    private static String dkhh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -929689947;
            n4 = Integer.rotateLeft(n4 * -967310443, 24) ^ 0x196628C4;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x8495E741;
            if ((n5 ^ n4) == -2070550719) break block0;
            int cfr_ignored_0 = (0x4C03E9E4 ^ n4) - 1944714308;
        }
        return bsh_5.jbz(string, n, n2, n3);
    }

    private static float tkhf_2(tay tay2) {
        block0: {
            int n = 601420242;
            n = Integer.rotateLeft(n * -1402132993, 14) ^ 0x2AD64F5F;
            tay tay3 = tay2;
            n = Integer.rotateLeft((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 5);
            int n2 = n ^ 0xF8FB0486;
            if ((n2 ^ n) == -117767034) break block0;
            int cfr_ignored_0 = (0xDB23F554 ^ n) + -378897437;
        }
        return tay2.thw_5();
    }

    private static String shb_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -416338362;
            n4 = Integer.rotateLeft(n4 * -348130511, 26) ^ 0xCD5A43C6;
            n4 = Integer.rotateRight(n ^ n4, 13);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 7)) ^ 0xC28BFE40;
            if ((n5 ^ n4) == -1031012800) break block0;
            int cfr_ignored_0 = (0x25A4D006 ^ n4) - -778059501;
        }
        return bsh_5.jbz(string, n, n2, n3);
    }

    private static void tya_3(bsh_5 bsh2_2, class_5944 class_59442, String string, float f, float f2) {
        int n = -1293537025;
        n = Integer.rotateLeft(n * -1805354861, 24) ^ 0x91A8C1D6;
        class_5944 class_59443 = class_59442;
        n = Integer.rotateLeft((class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n, 19);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
        int n2 = n ^ 0x231E2BF2;
        if ((n2 ^ n) != 589179890) {
            int cfr_ignored_0 = (0x91F81B0D ^ n) - 110518341;
        }
        bsh2_2.snh_4(class_59442, string, f, f2);
    }

    private static int trm(int n, int n2) {
        block0: {
            int n3 = 909052163;
            n3 = Integer.rotateLeft(n3 * -4836045, 18) ^ 0x6778A047;
            int n4 = (n3 = n ^ n3) ^ 0x946DC8E2;
            if ((n4 ^ n3) == -1804744478) break block0;
            int cfr_ignored_0 = (0xA242C1E1 ^ n3) - 1570588554;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static void dsw(bsh_5 bsh2_2, class_5944 class_59442, String string, float f) {
        int n = tdk.dqw_2(-755040430);
        bsh_5 bsh3_2 = bsh2_2;
        n = (bsh3_2 != null ? System.identityHashCode(bsh3_2) : 0) ^ n;
        class_5944 class_59443 = class_59442;
        n = Integer.rotateRight((class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n, 15);
        int n2 = n ^ 0x7872AF1D;
        if ((n2 ^ n) != 2020781853) {
            int cfr_ignored_0 = Integer.rotateRight(0xAA8C504F ^ n, 8) - -1420076852;
        }
        bsh2_2.syf(class_59442, string, f);
    }

    private static String[] dlth(String string) {
        int n = 1490752625;
        n = Integer.rotateLeft(n * 1970945795, 14) ^ 0xA6851B92;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 19);
        int n2 = n ^ 0x2FEF9B2A;
        if ((n2 ^ n) != 804231978) {
            int cfr_ignored_0 = (0x77348F5B ^ n) - -885317324;
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

    private static CallSite dzm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 896165903;
            n3 = Integer.rotateLeft(n3 * -887088597, 3) ^ 0xAA76EC5F;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x1F005164;
            if ((n4 ^ n3) != 520114532) {
                int cfr_ignored_0 = (0x2A6A396B ^ n3) - 606699687;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rys ^ string.hashCode()) + (n2 + khta_3) + i ^ rys, 17) + khta_3);
            }
            String[] stringArray = bsh_5.dlth(new String(cArray));
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

    private static String[] u6frdjit6cm6(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite f8qsyhy3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ p8qnaolxxowo ^ string.hashCode() ^ n2 + kfwo6r7 ^ i * -238775887 ^ p8qnaolxxowo, 14) ^ kfwo6r7));
            }
            String[] stringArray = bsh_5.u6frdjit6cm6(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

