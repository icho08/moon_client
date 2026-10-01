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
 *  net.minecraft.class_1306
 *  net.minecraft.class_276
 *  net.minecraft.class_284
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
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
import net.minecraft.class_1306;
import net.minecraft.class_276;
import net.minecraft.class_284;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import net.minecraft.class_5944;
import net.minecraft.class_6367;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tbr;
import us.m0vy.moondlc.m0vyguard.thk;
import us.m0vy.moondlc.m0vyguard.thgh_3;
import us.m0vy.moondlc.m0vyguard.jq;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fth;
import us.m0vy.moondlc.m0vyguard.lh;
import us.m0vy.moondlc.m0vyguard.mt_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="View Model", category=bzw.OTHER, desc="Click and drag first-person 3D items directly in chat to adjust their position and size")
public final class qh_2
extends bnq {
    private static final float shly = 0.1f;
    private static final float zfth = 3.5f;
    private static final float rakh_2 = 0.05f;
    private static final float jwa_2 = 3.5f;
    private static final float rkb = 0.01f;
    private static final float dshkh = 650.0f;
    public static final fth shtdh;
    private static final class_10156 smq;
    public final tay dhdgh = this.dhta_2("Right X", 0.0f);
    public final tay dhhk_2 = this.dhta_2("Right Y", 0.0f);
    public final tay rhr_2 = this.dhta_2("Right Z", 0.0f);
    public final tay tzs = this.dhta_2("Left X", 0.0f);
    public final tay thjy = this.dhta_2("Left Y", 0.0f);
    public final tay tdht_2 = this.dhta_2("Left Z", 0.0f);
    public final tay thsh_5 = this.zms_3("Right Scale");
    public final tay ssgh = this.zms_3("Left Scale");
    private static qh_2 dwth;
    private mt_2 dhqth;
    private float zlw;
    private float stn_2;
    private class_6367 bhn_2;
    private class_6367 jkhl;
    private final bql<jq> hzs = this::jnt_2;
    private final bql<thk> hbk = this::tdkh_3;
    private final bql<thgh_3> jza_4 = this::syw;
    private final bql<btt> zzt_3 = this::ghthkh;
    private final bql<tbr> zzk_2 = this::thbh_2;
    private static final int sny = -656237596;
    private static final int ddth = -191514469;
    private static final int dhhl_2 = -487329946;
    private static final int ryth = 981935915;
    private static final int efft289g54yh = 1855627778;
    private static final int pwzdg43v = 1898945359;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rz598j08;

    public qh_2() {
        dwth = this;
    }

    public static qh_2 dhdz() {
        block0: {
            int n = 821675923;
            int n2 = (n = Integer.rotateLeft(n * -1454115913, 24) ^ 0xB301C76) ^ 0x48E4EBA5;
            if ((n2 ^ n) == 1222962085) break block0;
            int cfr_ignored_0 = (0x781D2C36 ^ n) + -919745856;
        }
        return dwth;
    }

    @Override
    public void nc() {
        int n = -1710516019;
        n = Integer.rotateLeft(n * -13013559, 15) ^ 0xA8AD90EB;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 28);
        int n2 = n ^ 0x9AF364DD;
        if ((n2 ^ n) != -1695324963) {
            int cfr_ignored_0 = (0xF8FC10 ^ n) + -471990368;
        }
        this.ashz();
        this.thhk();
    }

    public boolean tkhd() {
        int n = 1274651383;
        int n2 = (n = Integer.rotateLeft(n * 493308627, 28) ^ 0x88D798EE) ^ 0xADECF0B5;
        if ((n2 ^ n) != -1376980811) {
            int cfr_ignored_0 = (0xE6155242 ^ n) - 2013668932;
        }
        if (!yf.khdha_2()) {
            qh_2.szq();
        }
        return this.rgha_2() && this.shn_3() && this.dhqth != null;
    }

    public void zght_2(class_4587 class_45872, class_1306 class_13062) {
        if (!this.rgha_2()) {
            return;
        }
        float f = (class_13062 == class_1306.field_6183 ? this.thsh_5 : this.ssgh).hkj();
        float f2 = class_13062 == class_1306.field_6183 ? 1.0f : -1.0f;
        float f3 = f2 * 0.56f;
        float f4 = -0.52f;
        float f5 = -0.72f;
        if (class_13062 == class_1306.field_6183) {
            class_45872.method_46416(this.dhdgh.hkj(), this.dhhk_2.hkj(), this.rhr_2.hkj());
        } else {
            class_45872.method_46416(-this.tzs.hkj(), this.thjy.hkj(), this.tdht_2.hkj());
        }
        class_45872.method_46416(f3, f4, f5);
        class_45872.method_22905(f, f, f);
        class_45872.method_46416(-f3, -f4, -f5);
    }

    public void zbf_2() {
        int n = -1755795396;
        n = Integer.rotateLeft(n * -698748581, 6) ^ 0xC41EFC8A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5EFF89CB;
        if ((n2 ^ n) != 1593805259) {
            int cfr_ignored_0 = (0xC9A739F7 ^ n) + 1914638493;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (!this.tkhd()) {
            return;
        }
        class_276 class_2762 = mc.method_1522();
        if (class_2762 == null) {
            return;
        }
        this.sth_9(class_2762.field_1482, class_2762.field_1481);
        qh_2.ddgh_2(this.jkhl, true);
        class_2762.method_1237(this.jkhl.field_1482, this.jkhl.field_1481);
        class_2762.method_1235(true);
    }

    public void khghd() {
        try {
            int n = 1120943136;
            n = Integer.rotateLeft(n * -1831930597, 25) ^ 0x89B78B26;
            int n2 = n ^ 0xD718AB2B;
            if ((n2 ^ n) != -686249173) {
                int cfr_ignored_0 = (0x95C8970B ^ n) + -966483283;
            }
            if ((0x288 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (!qh_2.dhkt_2(this)) {
            return;
        }
        class_276 class_2762 = mc.method_1522();
        if (class_2762 == null) {
            return;
        }
        int n = class_2762.field_1482;
        int n3 = class_2762.field_1481;
        qh_2.sh_4(this, n, n3);
        this.bhn_2.method_1235(true);
        qh_2.zhh_3(class_2762, n, n3);
        qh_2.tkht(this.bhn_2, class_2762);
        class_2762.method_1235(true);
        this.ghdhth(class_2762, n, n3);
    }

    private void ghdhth(class_276 class_2762, int n, int n2) {
        class_2762.method_1235(true);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.disableDepthTest();
        RenderSystem.setShaderTexture((int)0, (int)this.bhn_2.method_30277());
        RenderSystem.setShaderTexture((int)1, (int)this.bhn_2.method_30278());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)smq);
        if (class_59442 != null) {
            this.tthj_2(class_59442, "Resolution", n, n2);
            this.dhzgh(class_59442, "GlowColor", 1.0f, 1.0f, 1.0f, 0.95f);
            this.bnsh(class_59442, "DraggedArm", this.dhqth == mt_2.shjj ? 0.0f : 1.0f);
            this.brn(n, n2);
        }
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.setShaderTexture((int)1, (int)0);
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
    }

    private boolean shn_3() {
        try {
            int n = 621537160;
            n = Integer.rotateLeft(n * -855117361, 26) ^ 0x1FB32D32;
            int n2 = n ^ 0x8E393C8;
            if ((n2 ^ n) != 149132232) {
                int cfr_ignored_0 = (0x2DE87440 ^ n) - 1207851641;
            }
            if ((0x1FA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return qh_2.khty_2(this) && qh_2.mc.field_1724 != null && qh_2.mc.field_1755 instanceof class_408;
    }

    private void azw(float f, float f2) {
        float f3 = f - this.zlw;
        float f4 = f2 - this.stn_2;
        this.zlw = f;
        this.stn_2 = f2;
        if (f3 == 0.0f && f4 == 0.0f) {
            return;
        }
        if (this.dhqth == mt_2.shjj) {
            this.dhdgh.shjl(this.dhdgh.hkj() + f3 / 650.0f);
            this.dhhk_2.shjl(this.dhhk_2.hkj() - f4 / 650.0f);
            return;
        }
        this.tzs.shjl(this.tzs.hkj() - f3 / 650.0f);
        this.thjy.shjl(this.thjy.hkj() - f4 / 650.0f);
    }

    private tay jwf(mt_2 mt2) {
        try {
            int n = 1207225115;
            n = Integer.rotateLeft(n * 711675281, 25) ^ 0xCE60296E;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0x23172361;
            if ((n2 ^ n) != 588718945) {
                int cfr_ignored_0 = (0x64E3E87A ^ n) - -1495812305;
            }
            if ((0x379 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return mt2 == mt_2.shjj ? this.thsh_5 : this.ssgh;
    }

    private void tss_8(mt_2 mt2) {
        try {
            int n = 105099470;
            n = Integer.rotateLeft(n * -450557571, 25) ^ 0x1604069A;
            mt_2 mt3 = mt2;
            n = (mt3 != null ? System.identityHashCode((Object)mt3) : 0) ^ n;
            int n2 = n ^ 0x36E841DC;
            if ((n2 ^ n) != 921190876) {
                int cfr_ignored_0 = (0x30ABF112 ^ n) - 1863238908;
            }
            if ((0x250 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (mt2 == mt_2.shjj) {
            this.dhdgh.shjl(0.0f);
            this.dhhk_2.shjl(0.0f);
            this.rhr_2.shjl(0.0f);
            qh_2.dhm_4(this.thsh_5, 1.0f);
            return;
        }
        this.tzs.shjl(0.0f);
        this.thjy.shjl(0.0f);
        this.tdht_2.shjl(0.0f);
        qh_2.bdha_2(this.ssgh, 1.0f);
    }

    private void ashz() {
        int n = 0;
        int n2 = lh.dkhdh(-249239794);
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 18);
        int n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12)));
        while (true) {
            block15: {
                block12: {
                    block13: {
                        block18: {
                            block28: {
                                block23: {
                                    block27: {
                                        block14: {
                                            block26: {
                                                block22: {
                                                    block24: {
                                                        block19: {
                                                            block29: {
                                                                block17: {
                                                                    block20: {
                                                                        block25: {
                                                                            block21: {
                                                                                block10: {
                                                                                    block16: {
                                                                                        block11: {
                                                                                            if ((n = Integer.rotateRight(n3, 12) ^ n2) > -50400777) break block10;
                                                                                            if (n > -1339093729) break block11;
                                                                                            if (n == -1953170056) break block12;
                                                                                            if (n == -1604265445) break block13;
                                                                                            int cfr_ignored_0 = Integer.rotateLeft(0x726D806C ^ n2, 17) - -543151025;
                                                                                            if (n == -1339093729) break block14;
                                                                                            break block15;
                                                                                        }
                                                                                        if (n > -953428066) break block16;
                                                                                        if (n == -1101376819) break block17;
                                                                                        if (n == -953428066) break block18;
                                                                                        break block15;
                                                                                    }
                                                                                    if (n == -532126881) break block19;
                                                                                    if (n == -50400777) break block20;
                                                                                    break block15;
                                                                                }
                                                                                if (n > 204030323) break block21;
                                                                                if (n == -25049152) break block22;
                                                                                if (n == 148114875) break block23;
                                                                                if (n == 204030323) break block24;
                                                                                break block15;
                                                                            }
                                                                            if (n > 1507168346) break block25;
                                                                            if (n == 560059171) break block26;
                                                                            if (n == 1507168346) break block27;
                                                                            int cfr_ignored_1 = Integer.rotateRight(0x56859583 ^ n2, 13) + 2123020824;
                                                                            break block15;
                                                                        }
                                                                        if (n == 1562681690) break block28;
                                                                        if (n == 1873919020) break block29;
                                                                        int cfr_ignored_2 = Integer.rotateLeft(0xA000DB61 ^ n2, 7) + 1685598202;
                                                                        int cfr_ignored_3 = (int)(0x62B2755C27D4EB4FL ^ (long)n2 ^ 0x17C8831A2DB968B5L);
                                                                        break block15;
                                                                    }
                                                                    int cfr_ignored_4 = Integer.rotateRight(0xE83226E7 ^ n2, 16) - 577787188;
                                                                    if (qh_2.twf()) {
                                                                        n3 = Integer.rotateLeft(n2 ^ 0x2F956B00, 12);
                                                                        int cfr_ignored_5 = (Integer.rotateRight(0xEA274CFB ^ n2, 16) + 1595928992) * -366523141;
                                                                        n3 = Integer.rotateLeft(n2 ^ 0x6FB1BC2C, 12) + -470388841 - -470388841;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        n -= 2;
                                                                        if ((0x60FE3F1B69FE5807L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n3 = Integer.rotateLeft(n2 ^ 0xBE5A52CD, 12) ^ 0x8C72EA6D ^ 0x8C72EA6D;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = Integer.rotateLeft(n2 ^ 0xBE5A52CD, 12) ^ 0x6D45CC64 ^ 0x6D45CC64;
                                                                    }
                                                                    n -= 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_6 = Integer.rotateRight(0x82F4F43 ^ n2, 4) + 35141720;
                                                                qh_2.shlt();
                                                                try {
                                                                    if ((0xE404107B1AE25E31L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n3 = Integer.rotateLeft(n2 ^ 0x6FB1BC2C, 12) + -1251363784 - -1251363784;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x6FB1BC2C, 12)));
                                                                }
                                                                --n;
                                                                continue;
                                                            }
                                                            int cfr_ignored_7 = Integer.rotateLeft(0x2A28DAA1 ^ n2, 8) + 525342906;
                                                            int cfr_ignored_8 = (int)(0xE89A749C27D4EB4FL ^ (long)n2 ^ 0x1448831A2DB87CE5L);
                                                            this.dhqth = null;
                                                            this.zlw = 0.0f;
                                                            this.stn_2 = 0.0f;
                                                            return;
                                                        }
                                                        int cfr_ignored_9 = (Integer.rotateRight(0xEABB72B7 ^ n2, 16) - 1896907620) * -356814153;
                                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x4B547C4C, 12) ^ 0x1356914C495D2ED6L ^ 0x1356914C495D2ED6L);
                                                        int cfr_ignored_10 = Integer.rotateRight(0x66B670EA ^ n2, 15) + 1953844113;
                                                        int cfr_ignored_11 = (int)(0x5E200703F104F2D3L ^ (long)n2 ^ 0xF3772EBA1E811191L);
                                                        n3 = Integer.rotateLeft(n2 ^ 0xEE3D6383, 12);
                                                        int cfr_ignored_12 = (int)(0x3E9FBDFC2DB9D64CL ^ (long)n2 ^ 0x868897C057BFD0EEL);
                                                        n3 = Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12) ^ 0xD3FD56DA ^ 0xD3FD56DA;
                                                        --n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_13 = Integer.rotateLeft(0x24634089 ^ n2, 7) + 1818390482;
                                                    int cfr_ignored_14 = (int)(0xE6D1EEB427D4EB4FL ^ (long)n2 ^ 0x2018831A2DB86072L);
                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD16EB4EB, 12)));
                                                    int cfr_ignored_15 = Integer.rotateLeft(0x2D1608A8 ^ n2, 8) + 2047388563;
                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12)));
                                                    int cfr_ignored_16 = Integer.rotateRight(0x51960D2F ^ n2, 13) - -443992084;
                                                    continue;
                                                }
                                                int cfr_ignored_17 = Integer.rotateLeft(0x85D7B3A5 ^ n2, 3) - 964452406;
                                                int cfr_ignored_18 = (int)(0x47651D9827D4EB4FL ^ (long)n2 ^ 0xC640831A2DB9231BL);
                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x9285DC89, 12) ^ 0x63E9688A0D80A0B5L ^ 0x63E9688A0D80A0B5L);
                                                int cfr_ignored_19 = Integer.rotateLeft(0x46F18EA1 ^ n2, 11) + -1684151110;
                                                int cfr_ignored_20 = (int)(0x8443209C27D4EB4FL ^ (long)n2 ^ 0xBC48831A2DB8A557L);
                                                n3 = Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12) + -480240645 - -480240645;
                                                continue;
                                            }
                                            int cfr_ignored_21 = Integer.rotateRight(0xE530C5AA ^ n2, 15) + -985297199;
                                            int cfr_ignored_22 = (int)(0x2F89C656B31C3C55L ^ (long)n2 ^ 0x71DDAA8B838DF2C2L);
                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12)));
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_23 = Integer.rotateLeft(0xB42A75E8 ^ n2, 9) + -712907181;
                                        n3 = Integer.rotateLeft(n2 ^ 0xB88EB496, 12) ^ 0x43479FE6 ^ 0x43479FE6;
                                        int cfr_ignored_24 = Integer.rotateLeft(0x1991D4E0 ^ n2, 6) + 486958683;
                                        int cfr_ignored_25 = (int)(0x56B3FDC5F8ACD16BL ^ (long)n2 ^ 0x6FB3DEA59F100B6L);
                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xE6CD5F7E, 12)));
                                        int cfr_ignored_26 = (int)(0xE989DE91FCEE056L ^ (long)n2 ^ 0xC6A2F32E3B8BB0E0L);
                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12) ^ 0x329736373CD62EB0L ^ 0x329736373CD62EB0L);
                                        n -= 4;
                                        continue;
                                    }
                                    int cfr_ignored_27 = Integer.rotateLeft(0xB813714D ^ n2, 10) - 1320703886;
                                    int cfr_ignored_28 = (int)(0x7AA1DF7027D4EB4FL ^ (long)n2 ^ 0x4390831A2DB95892L);
                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xBC36105C, 12)));
                                    int cfr_ignored_29 = Integer.rotateLeft(0x8C5B5E9 ^ n2, 4) + 340698738;
                                    int cfr_ignored_30 = (int)(0xCA771BD427D4EB4FL ^ (long)n2 ^ 0xCAD8831A2DB8393FL);
                                    n3 = Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12);
                                    continue;
                                }
                                int cfr_ignored_31 = Integer.rotateLeft(0x26826C4C ^ n2, 7) - -1373062033;
                                try {
                                    n += 5;
                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12) ^ 0xC84253B0AB2A5931L ^ 0xC84253B0AB2A5931L);
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12) ^ 0x29919DD2ADA09067L ^ 0x29919DD2ADA09067L);
                                }
                                n += 2;
                                continue;
                            }
                            int cfr_ignored_32 = (Integer.rotateLeft(0x17EBAE18 ^ n2, 5) + -370691037) * 401321497;
                            n3 = Integer.rotateLeft(n2 ^ 0x291881BE, 12) + 919594942 - 919594942;
                            int cfr_ignored_33 = Integer.rotateLeft(0x7B1C05 ^ n2, 3) - 323355606;
                            int cfr_ignored_34 = (int)(0xC2C9B23827D4EB4FL ^ (long)n2 ^ 0x9900831A2DB82842L);
                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12)));
                            --n;
                            continue;
                        }
                        int cfr_ignored_35 = (Integer.rotateRight(0x207E7073 ^ n2, 7) + -206750424) * 545157235;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x40D0F32A, 12)));
                        int cfr_ignored_36 = Integer.rotateRight(0xA5CA3387 ^ n2, 7) - 400153748;
                        n3 = Integer.rotateLeft(n2 ^ 0xD00B15BF, 12);
                        int cfr_ignored_37 = Integer.rotateLeft(0xCCD8E429 ^ n2, 12) + -761184206;
                        int cfr_ignored_38 = (int)(0xE6A4A1427D4EB4FL ^ (long)n2 ^ 0x6958831A2DB9B105L);
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12) ^ 0x1E2BF8EB8D4C765AL ^ 0x1E2BF8EB8D4C765AL);
                        continue;
                    }
                    int cfr_ignored_39 = Integer.rotateLeft(0x5DA81F01 ^ n2, 14) + 1538875482;
                    int cfr_ignored_40 = (int)(0x9F1AB13C27D4EB4FL ^ (long)n2 ^ 0x9F08831A2DB893E4L);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12)));
                    --n;
                    continue;
                }
                int cfr_ignored_41 = Integer.rotateRight(0x512E6186 ^ n2, 13) - -654610827;
                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12)));
                int cfr_ignored_42 = Integer.rotateRight(0x2F1897E3 ^ n2, 8) + -1202191432;
                n -= 4;
                continue;
            }
            int cfr_ignored_43 = Integer.rotateRight(0x43363887 ^ n2, 11) - 669939604;
            n3 = Integer.rotateLeft(n2 ^ 0xFCFEF1F7, 12) + 1107941896 - 1107941896;
        }
    }

    private float jkhs_2() {
        return (float)(qh_2.mc.field_1729.method_1603() * (double)mc.method_22683().method_4486() / (double)Math.max(1, mc.method_22683().method_4480()));
    }

    private float aath() {
        return (float)(qh_2.mc.field_1729.method_1604() * (double)mc.method_22683().method_4502() / (double)Math.max(1, mc.method_22683().method_4507()));
    }

    /*
     * Unable to fully structure code
     */
    private void bnsh(class_5944 var1_1, String var2_2, float var3_3) {
        var6_4 = 0;
        var4_5 = -965000890;
        var4_5 = Integer.rotateLeft(var4_5 * 1708813389, 20) ^ -859253910;
        var4_5 = System.identityHashCode(this) ^ var4_5;
        var5_6 = var4_5 - -1170707224;
        block33: while (true) {
            if ((var6_4 = var4_5 - var5_6) == -359739609) ** GOTO lbl80
            if (var6_4 == -57146062) ** GOTO lbl-1000
            Integer.rotateLeft(-1959999968 ^ var4_5, 4) + -557212389;
            if (var6_4 != 914014732) {
                switch (var6_4) {
                    case -1170707224: {
                        Integer.rotateLeft(-421083956 ^ var4_5, 15) - -95456273;
                        if (var1_1.method_34582(var2_2) != null) {
                            try {
                                --var6_4;
                                if ((-4821981315526537377L ^ (long)var4_5 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1129123114));
                            }
                            catch (UnsupportedOperationException v0) {
                                var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1129123114));
                            }
                            ++var6_4;
                            continue block33;
                        }
                        var5_6 = var4_5 - 939228265;
                        (Integer.rotateLeft(-322168171 ^ var4_5, 16) - -1324034234) * -322168171;
                        (int)(3350313807125998415L ^ (long)var4_5 ^ -7773068808381927124L);
                        var5_6 = var4_5 - -1869732027;
                        continue block33;
                    }
                    case -1129123114: {
                        Integer.rotateLeft(-132779156 ^ var4_5, 18) - 252057935;
                        qh_2.dhth_2(qh_2.znt_2(var1_1, var2_2), var3_3);
                        try {
                            var6_4 -= 2;
                            if ((4011171530061191959L ^ (long)var4_5 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1869732027));
                        }
                        catch (IllegalStateException v1) {
                            var5_6 = var4_5 - -1869732027;
                        }
                        var6_4 += 3;
                        continue block33;
                    }
                    case -1869732027: {
                        (Integer.rotateRight(1094424438 ^ var4_5, 11) - -359336315) * 1094424439;
                        return;
                    }
                }
            }
            ** GOTO lbl157
lbl-1000:
            // 1 sources

            {
                (Integer.rotateRight(633635482 ^ var4_5, 7) + -1758892063) * 633635483;
                var5_6 = var4_5 - 1632261976 ^ 44602273 ^ 44602273;
                Integer.rotateLeft(-297523968 ^ var4_5, 16) + -560063941;
                try {
                    var6_4 += 3;
                    if ((6415057581349703571L ^ (long)var4_5 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    var5_6 = var4_5 - -1170707224 + 764095030 - 764095030;
                }
                catch (IllegalArgumentException v2) {
                    var5_6 = var4_5 - -1170707224 ^ -1571983129 ^ -1571983129;
                }
                continue block33;
                case -1312784027: {
                    Integer.rotateLeft(-750069568 ^ var4_5, 13) + -1704075653;
                    try {
                        var6_4 += 2;
                        if ((-254289427026956755L ^ (long)var4_5 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var5_6 = var4_5 - -1170707224;
                    }
                    catch (UnsupportedOperationException v3) {
                        var5_6 = var4_5 - -1170707224 ^ -2031911561 ^ -2031911561;
                    }
                    var6_4 += 5;
                    continue block33;
                }
lbl80:
                // 1 sources

                (Integer.rotateRight(1784591867 ^ var4_5, 16) + -438982496) * 1784591867;
                var5_6 = var4_5 - -707648194;
                (Integer.rotateRight(1081424287 ^ var4_5, 11) - -762340996) * 1081424287;
                var5_6 = (int)((long)(var4_5 - -1170707224) ^ 1066312562375938909L ^ 1066312562375938909L);
                continue block33;
                case 1121581618: {
                    (Integer.rotateRight(1435016055 ^ var4_5, 13) - 1609069220) * 1435016055;
                    var5_6 = (int)((long)(var4_5 - 1220538407) ^ -1927680716468054411L ^ -1927680716468054411L);
                    (Integer.rotateLeft(-1013755599 ^ var4_5, 11) + -1288408022) * -1013755599;
                    (int)(81626695942335311L ^ (long)var4_5 ^ 245590328151224210L);
                    try {
                        var6_4 += 3;
                        var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1170707224));
                    }
                    catch (IllegalArgumentException v4) {
                        var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1170707224));
                    }
                    var6_4 += 2;
                    continue block33;
                }
                case -2054890447: {
                    Integer.rotateRight(1844732143 ^ var4_5, 16) - 1425366060;
                    var5_6 = (int)((long)(var4_5 - -127450569) ^ 5528342170753722000L ^ 5528342170753722000L);
                    Integer.rotateRight(-825808982 ^ var4_5, 12) + 242969809;
                    var5_6 = var4_5 - -1170707224;
                    continue block33;
                }
                case -76280138: {
                    Integer.rotateLeft(1700221444 ^ var4_5, 15) - 1240501687;
                    try {
                        var6_4 += 4;
                        if ((5081535968854620349L ^ (long)var4_5 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var5_6 = var4_5 - -1170707224 ^ -81957155 ^ -81957155;
                    }
                    catch (IllegalStateException v5) {
                        var5_6 = var4_5 - -1170707224 + -852525075 - -852525075;
                    }
                    continue block33;
                }
                case 666104679: {
                    (Integer.rotateRight(-1580340074 ^ var4_5, 7) - -1672657563) * -1580340073;
                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - -717247855));
                    (Integer.rotateLeft(-708625351 ^ var4_5, 13) + -419304926) * -708625351;
                    (int)(1689291881786436431L ^ (long)var4_5 ^ -2776325021814389966L);
                    try {
                        var6_4 += 2;
                        if ((-8943287705104020419L ^ (long)var4_5 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var5_6 = var4_5 - -1170707224 + 239991570 - 239991570;
                    }
                    catch (UnsupportedOperationException v6) {
                        var5_6 = var4_5 - -1170707224 + 715237526 - 715237526;
                    }
                    var6_4 -= 3;
                    continue block33;
                }
                case 1566043724: {
                    Integer.rotateRight(1364296390 ^ var4_5, 13) - -583240395;
                    var5_6 = var4_5 - 454022991 ^ 854826521 ^ 854826521;
                    Integer.rotateRight(1240647695 ^ var4_5, 12) - -121382644;
                    try {
                        --var6_4;
                        if ((2801605254272161965L ^ (long)var4_5 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1170707224));
                    }
                    catch (NoSuchElementException v7) {
                        var5_6 = var4_5 - -1170707224;
                    }
                    ++var6_4;
                    continue block33;
                }
lbl157:
                // 1 sources

                Integer.rotateRight(-646606877 ^ var4_5, 14) + 1503267768;
                var5_6 = var4_5 - -1338686441 + 1301102346 - 1301102346;
                Integer.rotateLeft(2091364836 ^ var4_5, 18) - 481044951;
                try {
                    var6_4 += 4;
                    if ((3757772135146728601L ^ (long)var4_5 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var5_6 = var4_5 - -1170707224 ^ 2043187932 ^ 2043187932;
                }
                catch (IllegalStateException v8) {
                    var5_6 = var4_5 - -1170707224 ^ -182205713 ^ -182205713;
                }
                ++var6_4;
                continue block33;
                case 1305626748: {
                    (Integer.rotateLeft(424620849 ^ var4_5, 6) + 351588906) * 424620849;
                    (int)(-2594745134762103985L ^ (long)var4_5 ^ -4077865314124555734L);
                    var5_6 = var4_5 - 1692220958 ^ 2008549853 ^ 2008549853;
                    (Integer.rotateRight(972397598 ^ var4_5, 10) - 152798941) * 972397599;
                    try {
                        var6_4 -= 5;
                        var5_6 = (int)((long)(var4_5 - -1170707224) ^ -6728531726409622951L ^ -6728531726409622951L);
                    }
                    catch (NoSuchElementException v9) {
                        var5_6 = var4_5 - -1170707224;
                    }
                    var6_4 += 3;
                    continue block33;
                }
                case -1198150625: {
                    (Integer.rotateRight(-125589450 ^ var4_5, 18) - 474938821) * -125589449;
                    var5_6 = var4_5 - 1585989272 + -1605662031 - -1605662031;
                    Integer.rotateLeft(190170592 ^ var4_5, 4) + 1673565531;
                    var5_6 = var4_5 - -1170707224 + -1506493550 - -1506493550;
                    var6_4 += 3;
                }
            }
            (Integer.rotateLeft(1521868445 ^ var4_5, 14) - 6526014) * 1521868445;
            (int)(-7491895621942187185L ^ (long)var4_5 ^ 2031267580403555807L);
            var5_6 = var4_5 - -1170707224 ^ -2035705150 ^ -2035705150;
        }
    }

    private void tthj_2(class_5944 class_59442, String string, float f, float f2) {
        try {
            int n = -126783116;
            n = Integer.rotateLeft(n * 1560883471, 19) ^ 0xFA817B34;
            n = System.identityHashCode(this) ^ n;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x7187BEC0;
            if ((n2 ^ n) != 1904721600) {
                int cfr_ignored_0 = (0x89F6CFB4 ^ n) - 2092180585;
            }
            if ((0x385 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            qh_2.shfd_2();
            throw null;
        }
        if (class_59442.method_34582(string) != null) {
            class_59442.method_34582(string).method_1255(f, f2);
        }
    }

    private void dhzgh(class_5944 class_59442, String string, float f, float f2, float f3, float f4) {
        try {
            int n = 1739136007;
            n = Integer.rotateLeft(n * -1701335521, 14) ^ 0xB9A9C4FB;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
            class_5944 class_59443 = class_59442;
            n = (class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n;
            int n2 = n ^ 0x741DD5D3;
            if ((n2 ^ n) != 1948112339) {
                int cfr_ignored_0 = (0x13B4C9D4 ^ n) + 1386918242;
            }
            if ((0x350 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (class_59442.method_34582(string) != null) {
            class_59442.method_34582(string).method_35657(f, f2, f3, f4);
        }
    }

    private void brn(int n, int n2) {
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

    private void sth_9(int n, int n2) {
        try {
            int n3 = 371288219;
            n3 = Integer.rotateLeft(n3 * 951732371, 26) ^ 0x432D1F35;
            n3 = System.identityHashCode(this) ^ n3;
            int n4 = n3 ^ 0xF9E015A3;
            if ((n4 ^ n3) != -102754909) {
                int cfr_ignored_0 = (0xEFC17D38 ^ n3) - -1962192937;
            }
            if ((0x34E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (qh_2.khnf()) {
            throw null;
        }
        this.bhn_2 = qh_2.khdhq(this, this.bhn_2, n, n2, true);
        this.jkhl = this.dzs_3(this.jkhl, n, n2, false);
    }

    private class_6367 dzs_3(class_6367 class_63672, int n, int n2, boolean bl) {
        int n3 = lh.dkhdh(1165876255);
        n3 = Integer.rotateLeft(n ^ n3, 27);
        int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 8)) ^ 0x4663F594;
        if ((n4 ^ n3) != 1180956052) {
            int cfr_ignored_0 = Integer.rotateRight(0x31E298B ^ n3, 3) + 1694803728;
        }
        if (class_63672 == null) {
            class_63672 = new class_6367(n, n2, bl);
        } else if (class_63672.field_1482 != n || class_63672.field_1481 != n2) {
            class_63672.method_1234(n, n2);
        }
        qh_2.dsj_4(this, class_63672);
        return class_63672;
    }

    private void dghj(class_6367 class_63672) {
        int n = 0;
        int n2 = -581571504;
        n2 = Integer.rotateLeft(n2 * 1439686063, 17) ^ 0x937BB21E;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 25);
        class_6367 class_63673 = class_63672;
        n2 = Integer.rotateLeft((class_63673 != null ? System.identityHashCode(class_63673) : 0) ^ n2, 6);
        int n3 = n2 ^ 0x6CFCDEBD ^ 0x6444C1C ^ 0x6444C1C;
        block34: while (true) {
            switch (n3 ^ n2) {
                case 44730401: {
                    int cfr_ignored_0 = Integer.rotateRight(0xA66CBBAB ^ n2, 7) + 730355952;
                    GlStateManager._bindTexture((int)0);
                    return;
                }
                case -412350519: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x76662C08 ^ n2, 17) + 1522332723;
                    qh_2.khdr_2(class_63672.method_30278());
                    GlStateManager._texParameter((int)(0x56A1923 ^ 0x56A14C2), (int)qh_2.rlkh(0x1495D310 ^ 0x495D190, 4), (int)(0xECDCD1CE ^ 0xECDCF7CF));
                    GlStateManager._texParameter((int)(0xF53615D5 ^ 0xF5361834), (int)(2008776409 + -2008766169), (int)(Integer.reverse(-1767107315) ^ 0xB0A81368));
                    n3 = (n2 ^ 0x2AA8821) + 330186709 - 330186709;
                    int cfr_ignored_2 = (Integer.rotateLeft(0x253F573D ^ n2, 7) - -2029441122) * 624908093;
                    int cfr_ignored_3 = (int)(0xE78DF90027D4EB4FL ^ (long)n2 ^ 0xF70831A2DB862CAL);
                    --n;
                    continue block34;
                }
                case 1828511421: {
                    int cfr_ignored_4 = Integer.rotateRight(0xAD3B96CA ^ n2, 8) + -23797327;
                    qh_2.stz_8(class_63672.method_30277());
                    GlStateManager._texParameter((int)(0x77AF880F ^ 0x77AF85EE), (int)(77603478 - 77593237), (int)qh_2.tsz_5(0x5FD73071 ^ 0x5FD55061, 28));
                    qh_2.szdh_2(Integer.rotateLeft(0xD74FD139 ^ 0xB847D139, 13), 0xBD2F0FC3 ^ 0xBD2F27C3, -998003398 + 998013127);
                    if (class_63672.method_30278() != -1) {
                        try {
                            if ((0x5F7DB2BA624895D9L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = n2 ^ 0xE76C07C9;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (int)((long)(n2 ^ 0xE76C07C9) ^ 0x27C933EE484E2781L ^ 0x27C933EE484E2781L);
                        }
                        n -= 5;
                        continue block34;
                    }
                    n3 = n2 ^ 0xE43DE4C8 ^ 0xDDEEDF05 ^ 0xDDEEDF05;
                    int cfr_ignored_5 = (Integer.rotateRight(0xC3DDF91A ^ n2, 11) + -1136735903) * -1008862949;
                    n3 = (n2 ^ 0x2AA8821) + -1150396625 - -1150396625;
                    continue block34;
                }
                case -1374807232: {
                    int cfr_ignored_6 = Integer.rotateLeft(0xB8D55F49 ^ n2, 10) + 1714694418;
                    int cfr_ignored_7 = (int)(0x7A67F17427D4EB4FL ^ (long)n2 ^ 0x1F98831A2DB9591EL);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x6CFCDEBD));
                    int cfr_ignored_8 = (Integer.rotateRight(0x908353B3 ^ n2, 5) + -2075868696) * -1870441549;
                    continue block34;
                }
                case -1586117105: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0x16A63EF8 ^ n2, 5) + -1031848125) * 379993849;
                    try {
                        n -= 5;
                        n3 = (n2 ^ 0x6CFCDEBD) + -543667239 - -543667239;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 ^ 0x6CFCDEBD ^ 0x83BB3E97 ^ 0x83BB3E97;
                    }
                    n += 5;
                    continue block34;
                }
                case 458897316: {
                    int cfr_ignored_10 = Integer.rotateLeft(0xEC3D97E4 ^ n2, 16) - -1613560873;
                    n3 = n2 ^ 0x88BE9AC4;
                    int cfr_ignored_11 = Integer.rotateLeft(0xCEB91029 ^ n2, 12) + 214340658;
                    int cfr_ignored_12 = (int)(0xC0BBE1427D4EB4FL ^ (long)n2 ^ 0x8158831A2DB9B5C6L);
                    try {
                        n3 = (n2 ^ 0x6CFCDEBD) + -1752459305 - -1752459305;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x6CFCDEBD));
                    }
                    continue block34;
                }
                case -107142083: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x60866B78 ^ n2, 15) + -1264278845) * 1619422073;
                    n3 = (int)((long)(n2 ^ 0xD3DBE4F2) ^ 0x831D4AB8B009AB7CL ^ 0x831D4AB8B009AB7CL);
                    int cfr_ignored_14 = (Integer.rotateLeft(0x2408F7D ^ n2, 3) - 1244594014) * 37785469;
                    int cfr_ignored_15 = (int)(0xC0F2214027D4EB4FL ^ (long)n2 ^ 0xBFF0831A2DB82C35L);
                    n3 = n2 ^ 0x6CFCDEBD ^ 0xF952D8D6 ^ 0xF952D8D6;
                    continue block34;
                }
                case 1142201459: {
                    int cfr_ignored_16 = Integer.rotateLeft(0x7C7D5C08 ^ n2, 18) + 395035699;
                    n3 = (int)((long)(n2 ^ 0x610E75B7) ^ 0x5F76C4101A2BE47BL ^ 0x5F76C4101A2BE47BL);
                    int cfr_ignored_17 = (Integer.rotateRight(0x883D4AD7 ^ n2, 4) - -2083934396) * -2009249065;
                    try {
                        n -= 4;
                        n3 = (int)((long)(n2 ^ 0x6CFCDEBD) ^ 0x401CD14E381A6704L ^ 0x401CD14E381A6704L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(n2 ^ 0x6CFCDEBD) ^ 0x682BA59E23F4235AL ^ 0x682BA59E23F4235AL);
                    }
                    continue block34;
                }
                case -1736965896: {
                    int cfr_ignored_18 = Integer.rotateRight(0x7C177162 ^ n2, 18) + 187980313;
                    n3 = (int)((long)(n2 ^ 0x4DF20822) ^ 0x886D9FA74BC70349L ^ 0x886D9FA74BC70349L);
                    int cfr_ignored_19 = Integer.rotateLeft(0x4934616D ^ n2, 12) - -508204178;
                    int cfr_ignored_20 = (int)(0x8B86CF5027D4EB4FL ^ (long)n2 ^ 0x63D0831A2DB8BADCL);
                    try {
                        ++n;
                        if ((0x96369704E7BC5CE3L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 ^ 0x6CFCDEBD;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0x6CFCDEBD) + 1074236848 - 1074236848;
                    }
                    continue block34;
                }
                case -464180521: {
                    int cfr_ignored_21 = (Integer.rotateRight(0x2007B4DA ^ n2, 7) + -447969887) * 537375963;
                    n3 = (n2 ^ 0x51632427) + 49933061 - 49933061;
                    int cfr_ignored_22 = (Integer.rotateRight(0xF35C08BA ^ n2, 17) + 2088938945) * -212072261;
                    try {
                        ++n;
                        if ((0x2814968A9524C28BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x6CFCDEBD));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(n2 ^ 0x6CFCDEBD) ^ 0x4F235B503B1A114CL ^ 0x4F235B503B1A114CL);
                    }
                    n += 4;
                    continue block34;
                }
                case -621744120: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x70281C45 ^ n2, 17) - -1724314730;
                    int cfr_ignored_24 = (int)(0xB29AB27827D4EB4FL ^ (long)n2 ^ 0x9980831A2DB8C8E4L);
                    n3 = (int)((long)(n2 ^ 0xAF0E5501) ^ 0xC6040B8E06F4894L ^ 0xC6040B8E06F4894L);
                    int cfr_ignored_25 = (Integer.rotateRight(0xA8712516 ^ n2, 8) - 1779506405) * -1468979945;
                    n3 = (n2 ^ 0x6CFCDEBD) + -913597082 - -913597082;
                    n -= 4;
                    continue block34;
                }
                case 661387658: {
                    int cfr_ignored_26 = (Integer.rotateRight(0x1300E5DE ^ n2, 5) - 1366914333) * 318825951;
                    try {
                        n -= 2;
                        n3 = n2 ^ 0x6CFCDEBD;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 ^ 0x6CFCDEBD;
                    }
                    ++n;
                    continue block34;
                }
                case -1524598581: {
                    int cfr_ignored_27 = (Integer.rotateRight(0x9A9A7C7E ^ n2, 6) - -1122848131) * -1701151617;
                    try {
                        n3 = (n2 ^ 0x6CFCDEBD) + -1832337038 - -1832337038;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 ^ 0x6CFCDEBD ^ 0x46BA1082 ^ 0x46BA1082;
                    }
                    n -= 5;
                    continue block34;
                }
                case 1855315232: {
                    int cfr_ignored_28 = (Integer.rotateRight(0x75BF1992 ^ n2, 17) + 1182906345) * 1975458195;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8B60A2E1));
                    int cfr_ignored_29 = Integer.rotateRight(0xDCAC44E ^ n2, 4) - -1343527763;
                    try {
                        n += 5;
                        if ((0xACFB605CDD02FC57L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(n2 ^ 0x6CFCDEBD) ^ 0x91FEABB52D68BDDBL ^ 0x91FEABB52D68BDDBL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(n2 ^ 0x6CFCDEBD) ^ 0xFDEA546759FC1A3FL ^ 0xFDEA546759FC1A3FL);
                    }
                    n += 3;
                    continue block34;
                }
            }
            int cfr_ignored_30 = Integer.rotateLeft(0x6C8167CD ^ n2, 16) - 671691022;
            int cfr_ignored_31 = (int)(0xAE33C9F027D4EB4FL ^ (long)n2 ^ 0x6E90831A2DB8F1B6L);
            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x6CFCDEBD));
        }
    }

    private void thhk() {
        try {
            int n = -1757530923;
            n = Integer.rotateLeft(n * 215689051, 18) ^ 0xB4B4F31;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xFAA51DAA;
            if ((n2 ^ n) != -89842262) {
                int cfr_ignored_0 = (0x6D9B297F ^ n) + 1927025754;
            }
            if ((0x2B4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!qh_2.ghtha()) {
            yf.athz_2();
            throw null;
        }
        qh_2.ash_3(this, this.bhn_2);
        this.tshdh_2(this.jkhl);
        this.bhn_2 = null;
        this.jkhl = null;
    }

    private void tshdh_2(class_6367 class_63672) {
        int n = 0;
        int n2 = 885710968;
        n2 = Integer.rotateLeft(n2 * 1118938955, 19) ^ 0x35524EFD;
        n2 = System.identityHashCode(this) ^ n2;
        class_6367 class_63673 = class_63672;
        n2 = Integer.rotateLeft((class_63673 != null ? System.identityHashCode(class_63673) : 0) ^ n2, 17);
        int n3 = (int)((long)(n2 ^ 0x8EF1DBE3) ^ 0xEAB0206F7B2B7252L ^ 0xEAB0206F7B2B7252L);
        block32: while (true) {
            switch (n3 ^ n2) {
                case -320612611: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xDBF46A51 ^ n2, 14) + -1493795062) * -604738991;
                    int cfr_ignored_1 = (int)(0x1946C46C27D4EB4FL ^ (long)n2 ^ 0x75A8831A2DB99F5CL);
                    return;
                }
                case -1896752157: {
                    int cfr_ignored_2 = Integer.rotateRight(0xDCFF4A4E ^ n2, 14) - -951607635;
                    if (class_63672 == null) {
                        try {
                            n += 5;
                            n3 = (int)((long)(n2 ^ 0xECE3D6FD) ^ 0xC883F7AE164EC901L ^ 0xC883F7AE164EC901L);
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xECE3D6FD));
                        }
                        n -= 3;
                        continue block32;
                    }
                    n3 = n2 ^ 0xA8C1F7D2 ^ 0x3EEDED41 ^ 0x3EEDED41;
                    int cfr_ignored_3 = (Integer.rotateRight(0x7A45F85B ^ n2, 18) + -757681600) * 2051405915;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC4BF0740));
                    n += 2;
                    continue block32;
                }
                case -994113728: {
                    int cfr_ignored_4 = Integer.rotateRight(0x2E417A86 ^ n2, 8) - -1639221899;
                    class_63672.method_1238();
                    try {
                        n -= 2;
                        if ((0xAF0E725AD616AFAFL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xECE3D6FD));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xECE3D6FD) + 1868193244 - 1868193244;
                    }
                    n -= 3;
                    continue block32;
                }
                case -1975157068: {
                    int cfr_ignored_5 = (Integer.rotateRight(0xC6B0D472 ^ n2, 11) + 331831561) * -961489805;
                    n3 = (n2 ^ 0x69B4B4FD) + 1939111332 - 1939111332;
                    int cfr_ignored_6 = Integer.rotateRight(0xB34B9066 ^ n2, 9) - -1165747307;
                    try {
                        n3 = (n2 ^ 0x8EF1DBE3) + 1770430631 - 1770430631;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x8EF1DBE3) + -942603668 - -942603668;
                    }
                    ++n;
                    continue block32;
                }
                case -120986349: {
                    int cfr_ignored_7 = Integer.rotateRight(0x1122276B ^ n2, 5) + 394290480;
                    n3 = (int)((long)(n2 ^ 0xD3E15945) ^ 0x68E2C2F5267195B2L ^ 0x68E2C2F5267195B2L);
                    int cfr_ignored_8 = (Integer.rotateLeft(0xEB8318D5 ^ n2, 16) - -1992449786) * -343729963;
                    int cfr_ignored_9 = (int)(0x2931B6E827D4EB4FL ^ (long)n2 ^ 0x90A0831A2DB9FFB2L);
                    n3 = n2 ^ 0xB7356902 ^ 0xD367D524 ^ 0xD367D524;
                    int cfr_ignored_10 = Integer.rotateRight(0x854B498B ^ n2, 3) + 679184144;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8EF1DBE3));
                    continue block32;
                }
                case 1931501259: {
                    int cfr_ignored_11 = Integer.rotateLeft(0x11A2DD44 ^ n2, 5) - 655780471;
                    n3 = n2 ^ 0xEB5CA573;
                    int cfr_ignored_12 = (Integer.rotateLeft(0xFD03057D ^ n2, 18) - -1480898210) * -50133635;
                    int cfr_ignored_13 = (int)(0x3FB1AB4027D4EB4FL ^ (long)n2 ^ 0xABF0831A2DB9D2B2L);
                    n3 = n2 ^ 0x8EF1DBE3;
                    n += 5;
                    continue block32;
                }
                case -1266156643: {
                    int cfr_ignored_14 = Integer.rotateLeft(0x7574F749 ^ n2, 17) + 1032294674;
                    int cfr_ignored_15 = (int)(0xB7C6597427D4EB4FL ^ (long)n2 ^ 0x4F98831A2DB8C25DL);
                    try {
                        --n;
                        if ((0x82C4DC6AC8D2CB1BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8EF1DBE3));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8EF1DBE3));
                    }
                    n -= 5;
                    continue block32;
                }
                case 1050804086: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0x9B9FFA35 ^ n2, 6) - -591598682) * -1684014539;
                    int cfr_ignored_17 = (int)(0x592D540827D4EB4FL ^ (long)n2 ^ 0x5560831A2DB91F8BL);
                    try {
                        n += 2;
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8EF1DBE3));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 ^ 0x8EF1DBE3 ^ 0xBFB0535C ^ 0xBFB0535C;
                    }
                    n -= 3;
                    continue block32;
                }
                case 668498459: {
                    int cfr_ignored_18 = Integer.rotateRight(0x4EFEF703 ^ n2, 12) + -1791129448;
                    n3 = n2 ^ 0x8178E6EC;
                    int cfr_ignored_19 = (Integer.rotateLeft(0x2188AEBD ^ n2, 7) - 334153758) * 562605757;
                    int cfr_ignored_20 = (int)(0xE33A008027D4EB4FL ^ (long)n2 ^ 0xFC70831A2DB86BA5L);
                    n3 = (int)((long)(n2 ^ 0x5B9B9AEA) ^ 0xB115A9FD0EF81BAEL ^ 0xB115A9FD0EF81BAEL);
                    int cfr_ignored_21 = Integer.rotateLeft(0x3D8A932C ^ n2, 10) - 2015719823;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8EF1DBE3));
                    n -= 5;
                    continue block32;
                }
                case -2006828067: {
                    int cfr_ignored_22 = Integer.rotateLeft(0xF9CF2205 ^ n2, 18) - 1148370390;
                    int cfr_ignored_23 = (int)(0x3B7D8C3827D4EB4FL ^ (long)n2 ^ 0xE500831A2DB9DB2AL);
                    try {
                        n += 3;
                        if ((0x16787969738FF93FL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8EF1DBE3));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 ^ 0x8EF1DBE3;
                    }
                    ++n;
                    continue block32;
                }
                case -1462814255: {
                    int cfr_ignored_24 = Integer.rotateLeft(0x35A3FE08 ^ n2, 9) + -2093391309;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8EF1DBE3));
                    int cfr_ignored_25 = Integer.rotateRight(0xEF62948B ^ n2, 16) + 21863440;
                    n += 3;
                    continue block32;
                }
                case -321295022: {
                    int cfr_ignored_26 = (Integer.rotateRight(0xF876215B ^ n2, 18) + 447457600) * -126475941;
                    n3 = n2 ^ 0x7871A3AF;
                    int cfr_ignored_27 = (Integer.rotateLeft(0x81DACA71 ^ n2, 3) + -1109646614) * -2116367759;
                    int cfr_ignored_28 = (int)(0x4368644C27D4EB4FL ^ (long)n2 ^ 0x35E8831A2DB92B01L);
                    try {
                        ++n;
                        if ((0xC9ED2FCCCF38FB21L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)(n2 ^ 0x8EF1DBE3) ^ 0x65A02D67F6C99B33L ^ 0x65A02D67F6C99B33L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)(n2 ^ 0x8EF1DBE3) ^ 0x3C568C55C7F059B7L ^ 0x3C568C55C7F059B7L);
                    }
                    --n;
                    continue block32;
                }
                case 1437911484: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0x321BD3FD ^ n2, 9) - 364661470) * 840684541;
                    int cfr_ignored_30 = (int)(0xF0A97DC027D4EB4FL ^ (long)n2 ^ 0x6F0831A2DB84C83L);
                    n3 = (int)((long)(n2 ^ 0xED09115F) ^ 0xBF112C970B9B0A34L ^ 0xBF112C970B9B0A34L);
                    int cfr_ignored_31 = Integer.rotateLeft(0x1E5D9644 ^ n2, 6) - -1313681033;
                    n3 = (int)((long)(n2 ^ 0xA7795700) ^ 0xE2A16E11D4EE5D55L ^ 0xE2A16E11D4EE5D55L);
                    int cfr_ignored_32 = (Integer.rotateRight(0x6975C53E ^ n2, 16) - -912227907) * 1769325887;
                    n3 = n2 ^ 0x8EF1DBE3 ^ 0x3EC7596A ^ 0x3EC7596A;
                    n += 3;
                    continue block32;
                }
                case -1968251714: {
                    int cfr_ignored_33 = Integer.rotateLeft(0xFDE24320 ^ n2, 18) + -1027358693;
                    n3 = n2 ^ 0xC0E54FDF ^ 0x80894A2A ^ 0x80894A2A;
                    int cfr_ignored_34 = Integer.rotateRight(0x6293A38F ^ n2, 15) - -197235316;
                    try {
                        n -= 5;
                        if ((0xEE125D5864FDA997L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8EF1DBE3));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(n2 ^ 0x8EF1DBE3) ^ 0x8EB1B331B30243E1L ^ 0x8EB1B331B30243E1L);
                    }
                    n -= 3;
                    continue block32;
                }
            }
            int cfr_ignored_35 = (Integer.rotateRight(0xC606FFA ^ n2, 4) + -2079641983) * 207646715;
            n3 = n2 ^ 0x8EF1DBE3;
        }
    }

    private tay dhta_2(String string, float f) {
        tay tay2 = null;
        int n = 0;
        int n2 = -461054521;
        n2 = Integer.rotateLeft(n2 * -1577030181, 4) ^ 0xC2FA1E19;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 20);
        String string2 = string;
        n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
        int n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) + -457391199 - -457391199;
        block27: while (true) {
            switch (Integer.reverse(n3) ^ n2 ^ 0x1F9D1D4F) {
                case 532228015: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x491C62A8 ^ n2, 12) + -556953197;
                    tay2 = qh_2.tdz(qh_2.tkhm_2(new tay((hy)this, string, qh_2::tfz_2), Float.intBitsToFloat(Integer.reverse(-798693835) ^ 0x6C07260B)), Float.intBitsToFloat(1702691423 - 622658143)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xD3681AA1 ^ 0x322F9EDB, 11))).ssd_5(f);
                    int cfr_ignored_1 = (int)(0xE1C1A5A47B96FEBDL ^ (long)n2 ^ 0xB6383B9E065C6E52L);
                    n3 = Integer.reverse(n2 ^ 0x5FA740ED ^ 0x1F9D1D4F) ^ 0x4788512A ^ 0x4788512A;
                    int cfr_ignored_2 = (int)(0xD97E47D6A7019DEBL ^ (long)n2 ^ 0x72DD82B0C0F01F2DL);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x1FB927B0 ^ 0x1F9D1D4F) ^ 0xC582F594ADC50404L ^ 0xC582F594ADC50404L);
                    n -= 5;
                    continue block27;
                }
                case 532228013: {
                    int cfr_ignored_3 = (Integer.rotateRight(0x52403D52 ^ n2, 13) + -98235351) * 1379941715;
                    if (!yf.khdha_2()) {
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1FB927AE ^ 0x1F9D1D4F)));
                        continue block27;
                    }
                    try {
                        if ((0x75F19A5B0D0F0FC1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x1FB927AF ^ 0x1F9D1D4F) ^ 0xEDEF0F6F ^ 0xEDEF0F6F;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(n2 ^ 0x1FB927AF ^ 0x1F9D1D4F);
                    }
                    n -= 5;
                    continue block27;
                }
                case 532228014: {
                    int cfr_ignored_4 = Integer.rotateRight(0xBDC3CF2E ^ n2, 10) - -15485491;
                    qh_2.dls_4();
                    try {
                        n3 = Integer.reverse(n2 ^ 0x1FB927AF ^ 0x1F9D1D4F) ^ 0x711AABD6 ^ 0x711AABD6;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(n2 ^ 0x1FB927AF ^ 0x1F9D1D4F);
                    }
                    continue block27;
                }
                case 532228017: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0xC6833035 ^ n2, 11) - 239105446) * -964480971;
                    int cfr_ignored_6 = (int)(0x4319E0827D4EB4FL ^ (long)n2 ^ 0xC160831A2DB9A5B2L);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xE0F1E2BD ^ 0x1F9D1D4F)));
                    int cfr_ignored_7 = Integer.rotateLeft(0x3B657E8 ^ n2, 3) + 2003977299;
                    n3 = Integer.reverse(n2 ^ 0x446686B ^ 0x1F9D1D4F) + 1838496528 - 1838496528;
                    int cfr_ignored_8 = (Integer.rotateRight(0x446AD57F ^ n2, 11) - 1296923036) * 1147852159;
                    n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) ^ 0xD030938E ^ 0xD030938E;
                    n -= 2;
                    continue block27;
                }
                case 532228018: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0x607CD3DD ^ n2, 15) - -1283766530) * 1618793437;
                    int cfr_ignored_10 = (int)(0xA2CE7DE027D4EB4FL ^ (long)n2 ^ 0x6B0831A2DB8E84DL);
                    int cfr_ignored_11 = (int)(0x6B701F29F52DE98DL ^ (long)n2 ^ 0xC32326E8283D7B31L);
                    n3 = Integer.reverse(n2 ^ 0x8735CC7A ^ 0x1F9D1D4F);
                    int cfr_ignored_12 = (int)(0xF4950C65DA4BC7C4L ^ (long)n2 ^ 0xE5BB782474AE44FBL);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F)));
                    ++n;
                    continue block27;
                }
                case 532228019: {
                    int cfr_ignored_13 = (Integer.rotateRight(0xD713D3FE ^ n2, 13) - 264522493) * -686566401;
                    n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F);
                    int cfr_ignored_14 = Integer.rotateRight(0x29A2AB8F ^ n2, 8) - 252732812;
                    ++n;
                    continue block27;
                }
                case 532228020: {
                    int cfr_ignored_15 = Integer.rotateRight(0xB9EFF2CB ^ n2, 10) + -2006186544;
                    int cfr_ignored_16 = (int)(0x87F1A4EC3F18DC10L ^ (long)n2 ^ 0xB4A8B2824306A232L);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) ^ 0xDB2B1E8F23E0D14DL ^ 0xDB2B1E8F23E0D14DL);
                    n += 5;
                    continue block27;
                }
                case 532228021: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xE3030B35 ^ n2, 15) - -2118387034) * -486339787;
                    int cfr_ignored_18 = (int)(0x21B1A50827D4EB4FL ^ (long)n2 ^ 0xB760831A2DB9EEB2L);
                    int cfr_ignored_19 = (int)(0x1B56F29E8F980F26L ^ (long)n2 ^ 0x184DD383E56B9B7CL);
                    n3 = Integer.reverse(n2 ^ 0x9FE54D8B ^ 0x1F9D1D4F) + 1761292448 - 1761292448;
                    int cfr_ignored_20 = (int)(0xF88A543476089AA3L ^ (long)n2 ^ 0x551820A2CE605CC5L);
                    n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) + 1633994607 - 1633994607;
                    continue block27;
                }
                case 532228022: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0xF38892F5 ^ n2, 17) - -2115540250) * -209153291;
                    int cfr_ignored_22 = (int)(0x313A3CC827D4EB4FL ^ (long)n2 ^ 0x84E0831A2DB9CFA5L);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xBD14131D ^ 0x1F9D1D4F) ^ 0x7731B25313AE815DL ^ 0x7731B25313AE815DL);
                    int cfr_ignored_23 = Integer.rotateRight(0x5F7D2043 ^ n2, 14) + -1803253928;
                    try {
                        if ((0x771A9B6736D2BF41L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) ^ 0x68A26BF4 ^ 0x68A26BF4;
                    }
                    ++n;
                    continue block27;
                }
                case 532228023: {
                    int cfr_ignored_24 = (Integer.rotateRight(0x84D63CDE ^ n2, 3) - 441384477) * -2066334497;
                    try {
                        ++n;
                        if ((0xC00737593F97661FL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) ^ 0x5603FBBE ^ 0x5603FBBE;
                    }
                    continue block27;
                }
                case 532228024: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x4EB276B2 ^ n2, 12) + -1946550583) * 1320318643;
                    n3 = Integer.reverse(n2 ^ 0x36CD0BB6 ^ 0x1F9D1D4F);
                    int cfr_ignored_26 = (Integer.rotateLeft(0xCBEBBD31 ^ n2, 12) + -1242986454) * -873743055;
                    int cfr_ignored_27 = (int)(0x959130C27D4EB4FL ^ (long)n2 ^ 0xDB68831A2DB9BF63L);
                    n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) ^ 0xE5BB74CC ^ 0xE5BB74CC;
                    n -= 5;
                    continue block27;
                }
                case 532228025: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0xB7AF33F1 ^ n2, 9) + 1117055338) * -1213254671;
                    int cfr_ignored_29 = (int)(0x751D9DCC27D4EB4FL ^ (long)n2 ^ 0xC6E8831A2DB947EAL);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xCF79185F ^ 0x1F9D1D4F)));
                    int cfr_ignored_30 = (Integer.rotateRight(0x5C4BDCBE ^ n2, 14) - 831347261) * 1548475583;
                    try {
                        ++n;
                        if ((0x58369657ABBC9687L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) ^ 0xB365BE14 ^ 0xB365BE14;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F);
                    }
                    n += 2;
                    continue block27;
                }
                case 532228026: {
                    int cfr_ignored_31 = Integer.rotateLeft(0xB91C75CC ^ n2, 10) - 1859117807;
                    n3 = Integer.reverse(n2 ^ 0xBDB07673 ^ 0x1F9D1D4F);
                    int cfr_ignored_32 = (Integer.rotateRight(0x953CEC92 ^ n2, 5) + 381568233) * -1791169389;
                    n3 = Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F);
                    int cfr_ignored_33 = Integer.rotateRight(0x9702FDEA ^ n2, 5) + 1304059537;
                    continue block27;
                }
                case 532228027: {
                    int cfr_ignored_34 = Integer.rotateLeft(0xCC36E7AC ^ n2, 12) - -1090278129;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x85E021C5 ^ 0x1F9D1D4F)));
                    int cfr_ignored_35 = (Integer.rotateLeft(0x88A68BD5 ^ n2, 4) - -1870098938) * -2002351147;
                    int cfr_ignored_36 = (int)(0x4A1425E827D4EB4FL ^ (long)n2 ^ 0xB6A0831A2DB939F9L);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) ^ 0x90CDBCA83B3B6CF3L ^ 0x90CDBCA83B3B6CF3L);
                    n -= 3;
                    continue block27;
                }
                case 532228016: {
                    return tay2;
                }
            }
            int cfr_ignored_37 = (Integer.rotateRight(0x79304752 ^ n2, 18) + -1321844183) * 2033207123;
            n3 = (int)((long)Integer.reverse(n2 ^ 0x1FB927AD ^ 0x1F9D1D4F) ^ 0xA7AF8149620AAB5FL ^ 0xA7AF8149620AAB5FL);
        }
    }

    private tay zms_3(String string) {
        tay tay2 = null;
        int n = 0;
        int n2 = 268779019;
        n2 = Integer.rotateLeft(n2 * -359514481, 12) ^ 0xD1FD290A;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 15);
        int n3 = (-930453217 * -1586466103 + -1449341202 ^ n2) + 2077408204 - 2077408204;
        block30: while (true) {
            switch (((n3 ^ n2) - -1449341202) * -1880864903) {
                case -930453218: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x3D3CDD3 ^ n2, 3) + 2063829960) * 0x3D3CDD3;
                    tay2 = new tay((hy)this, string, qh_2::dfd_2).shth_7(Float.intBitsToFloat(-43668528 + 1080500477)).dhbs_2(Float.intBitsToFloat(38668274 - -1041365006)).rkh_3(Float.intBitsToFloat(411008622 - -617434719)).ssd_5(1.0f);
                    try {
                        if ((0x8D2BDA290CD8D4C9L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (-930453216 * -1586466103 + -1449341202 ^ n2) + 574128852 - 574128852;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = -930453216 * -1586466103 + -1449341202 ^ n2 ^ 0xCA0E5F7E ^ 0xCA0E5F7E;
                    }
                    n += 4;
                    continue block30;
                }
                case -930453219: {
                    int cfr_ignored_1 = Integer.rotateRight(0x817EE76A ^ n2, 3) + -1296325359;
                    qh_2.shjt_2();
                    n3 = (-930453218 * -1586466103 + -1449341202 ^ n2) + 1806946534 - 1806946534;
                    n += 5;
                    continue block30;
                }
                case -930453217: {
                    int cfr_ignored_2 = Integer.rotateLeft(0xFB6AF189 ^ n2, 18) + 1985011410;
                    int cfr_ignored_3 = (int)(0x39D85FB427D4EB4FL ^ (long)n2 ^ 0x4218831A2DB9DE61L);
                    if (qh_2.khst_3()) {
                        int cfr_ignored_4 = (int)(0xCD56243784278AFDL ^ (long)n2 ^ 0xB51FC4FCEEDC377DL);
                        n3 = -930453218 * -1586466103 + -1449341202 ^ n2 ^ 0xE56C0BDA ^ 0xE56C0BDA;
                        n += 4;
                        continue block30;
                    }
                    try {
                        n -= 5;
                        n3 = -930453219 * -1586466103 + -1449341202 ^ n2;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(-930453219 * -1586466103 + -1449341202 ^ n2));
                    }
                    continue block30;
                }
                case -930453215: {
                    int cfr_ignored_5 = Integer.rotateLeft(0x61E0F084 ^ n2, 15) - -560283849;
                    int cfr_ignored_6 = (int)(0x56BFE76B7F54FE0BL ^ (long)n2 ^ 0x33A6321A073100AEL);
                    n3 = (-930453217 * -1586466103 + -1449341202 ^ n2) + -1949178803 - -1949178803;
                    ++n;
                    continue block30;
                }
                case -930453214: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0xD80D09D4 ^ n2, 14) - 770822119) * -670234155;
                    n3 = 1954882954 * -1586466103 + -1449341202 ^ n2;
                    int cfr_ignored_8 = Integer.rotateRight(0x7BFE8603 ^ n2, 18) + 137353624;
                    n3 = (int)((long)(1793613374 * -1586466103 + -1449341202 ^ n2) ^ 0x1D114A7E2FA37B81L ^ 0x1D114A7E2FA37B81L);
                    int cfr_ignored_9 = Integer.rotateRight(0xB4A9388B ^ n2, 9) + -455378928;
                    n3 = -930453217 * -1586466103 + -1449341202 ^ n2 ^ 0x8FB83759 ^ 0x8FB83759;
                    continue block30;
                }
                case -930453213: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0x216F7B9 ^ n2, 3) + 1160093346) * 35059641;
                    int cfr_ignored_11 = (int)(0xC0A4598427D4EB4FL ^ (long)n2 ^ 0x4E78831A2DB82C99L);
                    n3 = (int)((long)(-1300106525 * -1586466103 + -1449341202 ^ n2) ^ 0xCFEE68FCA97F03F3L ^ 0xCFEE68FCA97F03F3L);
                    int cfr_ignored_12 = (Integer.rotateLeft(0xDAF5B874 ^ n2, 14) - -2011237049) * -621430667;
                    int cfr_ignored_13 = (int)(0xC233F07748728A1FL ^ (long)n2 ^ 0x1D9E5C56EF1829B6L);
                    n3 = -930453217 * -1586466103 + -1449341202 ^ n2;
                    continue block30;
                }
                case -930453212: {
                    int cfr_ignored_14 = Integer.rotateRight(0x58AE8366 ^ n2, 14) - -1048606571;
                    int cfr_ignored_15 = (int)(0x6893C0AC56309082L ^ (long)n2 ^ 0x7C2860D2DA237CF6L);
                    n3 = -179332152 * -1586466103 + -1449341202 ^ n2 ^ 0xB90AAD69 ^ 0xB90AAD69;
                    int cfr_ignored_16 = (int)(0x7CA01157D43D5B3AL ^ (long)n2 ^ 0xDFDF64C94D535491L);
                    n3 = (int)((long)(-930453217 * -1586466103 + -1449341202 ^ n2) ^ 0x90CC844063E41A6EL ^ 0x90CC844063E41A6EL);
                    n -= 4;
                    continue block30;
                }
                case -930453211: {
                    int cfr_ignored_17 = (Integer.rotateRight(0xE0CFF4D6 ^ n2, 15) - 1032602917) * -523242281;
                    n3 = 763617652 * -1586466103 + -1449341202 ^ n2 ^ 0xE24D4CDA ^ 0xE24D4CDA;
                    int cfr_ignored_18 = Integer.rotateLeft(0xFBB2B6C1 ^ n2, 18) + 2130821274;
                    int cfr_ignored_19 = (int)(0x390018FC27D4EB4FL ^ (long)n2 ^ 0xCC88831A2DB9DFD1L);
                    int cfr_ignored_20 = (int)(0xD05211F8A1360408L ^ (long)n2 ^ 0xDE818EDFF3360D75L);
                    n3 = -930453217 * -1586466103 + -1449341202 ^ n2;
                    continue block30;
                }
                case -930453210: {
                    int cfr_ignored_21 = (Integer.rotateRight(0xA56C4192 ^ n2, 7) + 209293289) * -1519631981;
                    n3 = (-986963883 * -1586466103 + -1449341202 ^ n2) + -2004561937 - -2004561937;
                    int cfr_ignored_22 = Integer.rotateRight(0xDCF4D82F ^ n2, 14) - -972829460;
                    try {
                        n += 4;
                        if ((0xCC9B4EC41D69A19FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (-930453217 * -1586466103 + -1449341202 ^ n2) + -757352589 - -757352589;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -930453217 * -1586466103 + -1449341202 ^ n2 ^ 0xB593BF62 ^ 0xB593BF62;
                    }
                    --n;
                    continue block30;
                }
                case -930453209: {
                    int cfr_ignored_23 = Integer.rotateRight(0xD86A322 ^ n2, 4) + -1481940903;
                    n3 = Integer.reverse(Integer.reverse(667704035 * -1586466103 + -1449341202 ^ n2));
                    int cfr_ignored_24 = (Integer.rotateRight(0x6F9965FA ^ n2, 16) + -2014250879) * 1872324091;
                    try {
                        if ((0x718897DC5ABDBF3BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = -930453217 * -1586466103 + -1449341202 ^ n2 ^ 0xD9CC7860 ^ 0xD9CC7860;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -930453217 * -1586466103 + -1449341202 ^ n2;
                    }
                    continue block30;
                }
                case -930453208: {
                    int cfr_ignored_25 = Integer.rotateRight(0x4E2B3D2F ^ n2, 12) - 2073692140;
                    try {
                        n += 4;
                        if ((0xE888191A5F328E61L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-930453217 * -1586466103 + -1449341202 ^ n2));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = -930453217 * -1586466103 + -1449341202 ^ n2 ^ 0x8CB50129 ^ 0x8CB50129;
                    }
                    n -= 3;
                    continue block30;
                }
                case -930453207: {
                    int cfr_ignored_26 = (Integer.rotateRight(0x7C395F ^ n2, 3) - 325620156) * 8141151;
                    try {
                        n -= 2;
                        if ((0x1E6F1DC7D840E19DL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(-930453217 * -1586466103 + -1449341202 ^ n2) ^ 0x1412A2001BCD49EFL ^ 0x1412A2001BCD49EFL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (-930453217 * -1586466103 + -1449341202 ^ n2) + -941927971 - -941927971;
                    }
                    continue block30;
                }
                case -930453206: {
                    int cfr_ignored_27 = (Integer.rotateLeft(0xF7F64255 ^ n2, 17) - 187672454) * -134856107;
                    int cfr_ignored_28 = (int)(0x3544EC6827D4EB4FL ^ (long)n2 ^ 0x25A0831A2DB9C758L);
                    try {
                        if ((0x7E63F49633A6B43FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-930453217 * -1586466103 + -1449341202 ^ n2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(-930453217 * -1586466103 + -1449341202 ^ n2) ^ 0xB81EC1C9E36E1C50L ^ 0xB81EC1C9E36E1C50L);
                    }
                    --n;
                    continue block30;
                }
                case -930453216: {
                    return tay2;
                }
            }
            int cfr_ignored_29 = (Integer.rotateRight(0x7E6A695A ^ n2, 18) + 1396728097) * 2120903003;
            n3 = Integer.reverse(Integer.reverse(-930453217 * -1586466103 + -1449341202 ^ n2));
        }
    }

    private static boolean dfd_2() {
        block0: {
            int n = -1973482438;
            int n2 = (n = Integer.rotateLeft(n * 49989883, 6) ^ 0xE561D2E9) ^ 0x3E1A843E;
            if ((n2 ^ n) == 1041925182) break block0;
            int cfr_ignored_0 = (0xB4458804 ^ n) + -1802568789;
        }
        return true;
    }

    private static boolean tfz_2() {
        block0: {
            int n = 1130185274;
            int n2 = (n = Integer.rotateLeft(n * -498717557, 8) ^ 0x2E3FC617) ^ 0x6CA830E2;
            if ((n2 ^ n) == 1822961890) break block0;
            int cfr_ignored_0 = (0x2FF572D8 ^ n) + 3191643;
        }
        return true;
    }

    private void thbh_2(tbr tbr2) {
        try {
            int n = -1081807251;
            n = Integer.rotateLeft(n * -1475031695, 4) ^ 0x205747BA;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            tbr tbr3 = tbr2;
            n = Integer.rotateLeft((tbr3 != null ? System.identityHashCode(tbr3) : 0) ^ n, 3);
            int n2 = n ^ 0xFB26A118;
            if ((n2 ^ n) != -81354472) {
                int cfr_ignored_0 = (0x44A24F75 ^ n) - 831594175;
            }
            if ((0x2FB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!this.shn_3() || !(qh_2.mc.field_1755 instanceof class_408)) {
            return;
        }
        float f = this.jkhs_2();
        mt_2 mt2 = this.dhqth != null ? this.dhqth : (f >= (float)mc.method_22683().method_4486() * Float.intBitsToFloat(Integer.rotateLeft(0x80B98A7C ^ 0x80B98A02, 23)) ? mt_2.shjj : mt_2.thlz);
        float f2 = Math.signum((float)tbr2.shta());
        if (f2 == 0.0f) {
            return;
        }
        tay tay2 = this.jwf(mt2);
        float f3 = tay2.hkj();
        float f4 = f3 + f2 * Float.intBitsToFloat(Integer.reverse(1581582779) ^ 0xE0DC6EB7);
        tay2.shjl(f4);
        tbr2.dhtd_2();
    }

    private void ghthkh(btt btt2) {
        try {
            int n = -304640868;
            n = Integer.rotateLeft(n * -1745789733, 5) ^ 0xA6AB614C;
            int n2 = n ^ 0x9CADD943;
            if ((n2 ^ n) != -1666328253) {
                int cfr_ignored_0 = (0x717A55DF ^ n) + -1427604077;
            }
            if ((0x235 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!(qh_2.mc.field_1755 instanceof class_408)) {
            this.ashz();
        }
    }

    /*
     * Unable to fully structure code
     */
    private void syw(thgh_3 var1_1) {
        var4_2 = 0;
        var2_3 = 551168003;
        var2_3 = Integer.rotateLeft(var2_3 * 907038609, 18) ^ 429394232;
        var3_4 = (var2_3 ^ 93937834) + -1673961888 - -1673961888;
        block35: while (true) {
            if ((var4_2 = var3_4 ^ var2_3) == 93937834) ** GOTO lbl-1000
            if (var4_2 == 1386205445) ** GOTO lbl220
            (Integer.rotateRight(-1596368846 ^ var2_3, 7) + 2125417801) * -1596368845;
            if (var4_2 == -657395523) ** GOTO lbl72
            if (var4_2 != -2112838863) {
                switch (var4_2) {
                    case -1374902490: {
                        (Integer.rotateRight(334486422 ^ var2_3, 5) - 1852388965) * 334486423;
                        this.ashz();
                        var3_4 = (var2_3 ^ 712700130) + 755825983 - 755825983;
                        var4_2 += 2;
                        continue block35;
                    }
                }
            }
            ** GOTO lbl119
lbl-1000:
            // 1 sources

            {
                Integer.rotateLeft(1585440289 ^ var2_3, 14) + 1977253178;
                (int)(-7147977747802559665L ^ (long)var2_3 ^ 7874688096916771915L);
                if (!yf.dnkh()) {
                    try {
                        var4_2 += 2;
                        if ((5680293938252940263L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1698034262));
                    }
                    catch (IllegalStateException v0) {
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1698034262));
                    }
                    --var4_2;
                    continue block35;
                }
                try {
                    var4_2 -= 3;
                    if ((-4956774966933472617L ^ (long)var2_3 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var3_4 = var2_3 ^ 536184096;
                }
                catch (NoSuchElementException v1) {
                    var3_4 = var2_3 ^ 536184096 ^ 2052780883 ^ 2052780883;
                }
                continue block35;
                case 712700130: {
                    (Integer.rotateRight(-1225934350 ^ var2_3, 9) + 723985289) * -1225934349;
                    return;
                }
                case -1698034262: {
                    Integer.rotateLeft(445118273 ^ var2_3, 6) + 987009050;
                    (int)(-2867287197972370609L ^ (long)var2_3 ^ 5730974674288385467L);
                    if (var1_1.hah() == 0) {
                        try {
                            ++var4_2;
                            var3_4 = var2_3 ^ -1374902490 ^ 910408578 ^ 910408578;
                        }
                        catch (NoSuchElementException v2) {
                            var3_4 = var2_3 ^ -1374902490 ^ 756980043 ^ 756980043;
                        }
                        var4_2 += 2;
                        continue block35;
                    }
                    (int)(5477237628562608711L ^ (long)var2_3 ^ -2286195342558284329L);
                    var3_4 = (var2_3 ^ 712700130) + -245560695 - -245560695;
                    --var4_2;
                    continue block35;
                }
                case 536184096: {
                    (Integer.rotateLeft(1440161212 ^ var2_3, 13) - 1768569087) * 1440161213;
                    throw null;
                }
lbl72:
                // 1 sources

                Integer.rotateLeft(-1078850967 ^ var2_3, 10) + 988602866;
                (int)(9007379936093465423L ^ (long)var2_3 ^ -5343376809415583792L);
                var3_4 = (int)((long)(var2_3 ^ -1471764820) ^ -6521954988379295347L ^ -6521954988379295347L);
                Integer.rotateRight(-2011424885 ^ var2_3, 4) + 2143582480;
                (int)(2420754602481865326L ^ (long)var2_3 ^ -8968709654599438623L);
                var3_4 = var2_3 ^ 93937834 ^ -1785938337 ^ -1785938337;
                var4_2 += 5;
                continue block35;
                case 1114731451: {
                    Integer.rotateRight(1763724654 ^ var2_3, 16) - -1085866099;
                    var3_4 = (int)((long)(var2_3 ^ 2093835104) ^ 2802872688253817528L ^ 2802872688253817528L);
                    (Integer.rotateRight(235856627 ^ var2_3, 4) + -1205134680) * 235856627;
                    var3_4 = (int)((long)(var2_3 ^ 93937834) ^ -387281113134171459L ^ -387281113134171459L);
                    continue block35;
                }
                case 513473090: {
                    (Integer.rotateRight(857600959 ^ var2_3, 9) - 889070428) * 857600959;
                    try {
                        if ((-3719362105773238969L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 93937834));
                    }
                    catch (IllegalStateException v3) {
                        var3_4 = var2_3 ^ 93937834 ^ -1490697920 ^ -1490697920;
                    }
                    var4_2 += 3;
                    continue block35;
                }
                case 1644074159: {
                    (Integer.rotateLeft(-1618042219 ^ var2_3, 6) - 1453543238) * -1618042219;
                    (int)(6718258660492241743L ^ (long)var2_3 ^ -2008461285347747927L);
                    var3_4 = var2_3 ^ -2033878218 ^ 1700648566 ^ 1700648566;
                    (Integer.rotateLeft(-1760700392 ^ var2_3, 5) + 1326107171) * -1760700391;
                    try {
                        var4_2 += 3;
                        var3_4 = (int)((long)(var2_3 ^ 93937834) ^ -8514891628388322061L ^ -8514891628388322061L);
                    }
                    catch (NoSuchElementException v4) {
                        var3_4 = var2_3 ^ 93937834 ^ -31928571 ^ -31928571;
                    }
                    continue block35;
                }
lbl119:
                // 1 sources

                (Integer.rotateLeft(2052965813 ^ var2_3, 18) - -709324762) * 2052965813;
                (int)(-5120756018768975025L ^ (long)var2_3 ^ 3053584695816674319L);
                var3_4 = (int)((long)(var2_3 ^ -1205923293) ^ -9161941004472759800L ^ -9161941004472759800L);
                Integer.rotateRight(12631374 ^ var2_3, 3) - 464817069;
                (int)(7787307783910035120L ^ (long)var2_3 ^ -2654980158107716107L);
                var3_4 = var2_3 ^ -855845801 ^ 433446089 ^ 433446089;
                (int)(-4414368549608645967L ^ (long)var2_3 ^ -355145121349228373L);
                var3_4 = var2_3 ^ 93937834;
                var4_2 -= 5;
                continue block35;
                case 425813428: {
                    Integer.rotateRight(-1297336286 ^ var2_3, 9) + -1489474727;
                    try {
                        var4_2 += 3;
                        if ((7676708703637616457L ^ (long)var2_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var3_4 = var2_3 ^ 93937834;
                    }
                    catch (UnsupportedOperationException v5) {
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 93937834));
                    }
                    var4_2 -= 3;
                    continue block35;
                }
                case 1200670936: {
                    Integer.rotateLeft(950257477 ^ var2_3, 10) - -533544810;
                    (int)(-427444524838229169L ^ (long)var2_3 ^ 3422879865261021683L);
                    try {
                        if ((-3534800629186517239L ^ (long)var2_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var3_4 = (var2_3 ^ 93937834) + 1261473929 - 1261473929;
                    }
                    catch (NoSuchElementException v6) {
                        var3_4 = (int)((long)(var2_3 ^ 93937834) ^ -8616043013613926054L ^ -8616043013613926054L);
                    }
                    var4_2 -= 2;
                    continue block35;
                }
                case -1249175395: {
                    Integer.rotateLeft(541667528 ^ var2_3, 7) + -314931341;
                    var3_4 = (int)((long)(var2_3 ^ -1915046227) ^ 991148286751078715L ^ 991148286751078715L);
                    Integer.rotateRight(-357995198 ^ var2_3, 16) + 1860295225;
                    try {
                        ++var4_2;
                        var3_4 = var2_3 ^ 93937834 ^ -1770635663 ^ -1770635663;
                    }
                    catch (IllegalArgumentException v7) {
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 93937834));
                    }
                    var4_2 -= 3;
                    continue block35;
                }
                case -304298002: {
                    (Integer.rotateLeft(194859952 ^ var2_3, 4) + 1818935691) * 194859953;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -175402213));
                    (Integer.rotateRight(-990185390 ^ var2_3, 11) + -557731543) * -990185389;
                    var3_4 = (int)((long)(var2_3 ^ 93937834) ^ -8795160303253361109L ^ -8795160303253361109L);
                    continue block35;
                }
                case -545014920: {
                    (Integer.rotateLeft(1343313561 ^ var2_3, 13) + -1233708094) * 1343313561;
                    (int)(-7880181539041645745L ^ (long)var2_3 ^ 880597875610388630L);
                    var3_4 = var2_3 ^ 1283582134 ^ -1331176310 ^ -1331176310;
                    (Integer.rotateRight(1564505499 ^ var2_3, 14) + 1328274688) * 1564505499;
                    var3_4 = (var2_3 ^ -1038520320) + -1046275995 - -1046275995;
                    (Integer.rotateLeft(1769109081 ^ var2_3, 16) + -918948862) * 1769109081;
                    (int)(-6070614373018834097L ^ (long)var2_3 ^ 5600370285094697552L);
                    var3_4 = (var2_3 ^ 93937834) + 1903298629 - 1903298629;
                    continue block35;
                }
                case -1435757881: {
                    (Integer.rotateRight(-52074466 ^ var2_3, 18) - -1541063971) * -52074465;
                    var3_4 = var2_3 ^ 287925160;
                    Integer.rotateRight(1888516386 ^ var2_3, 17) + -1512289703;
                    var3_4 = (int)((long)(var2_3 ^ 93937834) ^ -1915642111822883029L ^ -1915642111822883029L);
                    var4_2 += 2;
                    continue block35;
                }
                case -588667295: {
                    (Integer.rotateLeft(1087351612 ^ var2_3, 11) - -578593921) * 1087351613;
                    try {
                        --var4_2;
                        if ((-6790458380140713717L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 93937834));
                    }
                    catch (IllegalArgumentException v8) {
                        var3_4 = (int)((long)(var2_3 ^ 93937834) ^ 6267971847299786245L ^ 6267971847299786245L);
                    }
                    var4_2 -= 5;
                    continue block35;
                }
lbl220:
                // 1 sources

                Integer.rotateLeft(-710579060 ^ var2_3, 13) - -479869905;
                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 613201728));
                Integer.rotateRight(-2097430646 ^ var2_3, 3) + -522596111;
                var3_4 = (int)((long)(var2_3 ^ -52643644) ^ -3632293889098885330L ^ -3632293889098885330L);
                (Integer.rotateRight(590743327 ^ var2_3, 7) - 1206418428) * 590743327;
                var3_4 = (var2_3 ^ 93937834) + -51589772 - -51589772;
                continue block35;
                case 701933456: {
                    Integer.rotateRight(1162670 ^ var2_3, 3) - 109287245;
                    var3_4 = (int)((long)(var2_3 ^ 447626726) ^ -2047526564793684512L ^ -2047526564793684512L);
                    Integer.rotateRight(2100221610 ^ var2_3, 18) + 755604945;
                    var3_4 = var2_3 ^ 93937834;
                }
            }
            (Integer.rotateLeft(1150500061 ^ var2_3, 11) - 1379007998) * 1150500061;
            (int)(-8781576306957161649L ^ (long)var2_3 ^ -2832620017156578926L);
            var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 93937834));
        }
    }

    private void tdkh_3(thk thk2) {
        mt_2 mt2;
        int n = -553555194;
        n = Integer.rotateLeft(n * -692551575, 3) ^ 0x24758D49;
        n = System.identityHashCode(this) ^ n;
        thk thk3 = thk2;
        n = Integer.rotateRight((thk3 != null ? System.identityHashCode(thk3) : 0) ^ n, 21);
        int n2 = n ^ 0xB79363F;
        if ((n2 ^ n) != 192493119) {
            int cfr_ignored_0 = (0xD4785D39 ^ n) + -34970065;
        }
        if (!this.shn_3()) {
            return;
        }
        mt_2 mt3 = mt2 = thk2.jthd() >= (float)mc.method_22683().method_4486() * Float.intBitsToFloat(Integer.rotateLeft(0x3BE94503 ^ 0x34294503, 2)) ? mt_2.shjj : mt_2.thlz;
        if (thk2.dbw() == 2) {
            this.tss_8(mt2);
            this.ashz();
            return;
        }
        if (thk2.dbw() == 0) {
            this.dhqth = mt2;
            this.zlw = thk2.jthd();
            this.stn_2 = thk2.zshz_3();
        }
    }

    private void jnt_2(jq jq2) {
        float f = 0.0f;
        float f2 = 0.0f;
        int n = 0;
        int n2 = -2063943556;
        n2 = Integer.rotateLeft(n2 * -494352353, 18) ^ 0xB522689D;
        jq jq3 = jq2;
        n2 = Integer.rotateRight((jq3 != null ? System.identityHashCode(jq3) : 0) ^ n2, 18);
        int n3 = (int)((long)(n2 ^ 0x14DFD192) ^ 0x22356F1BEF03EE92L ^ 0x22356F1BEF03EE92L);
        while (true) {
            block30: {
                block51: {
                    block39: {
                        block33: {
                            block36: {
                                block46: {
                                    block28: {
                                        block29: {
                                            block43: {
                                                block49: {
                                                    block48: {
                                                        block50: {
                                                            block31: {
                                                                block52: {
                                                                    block44: {
                                                                        block38: {
                                                                            block35: {
                                                                                block32: {
                                                                                    block37: {
                                                                                        block42: {
                                                                                            block45: {
                                                                                                block47: {
                                                                                                    block40: {
                                                                                                        block41: {
                                                                                                            block25: {
                                                                                                                block34: {
                                                                                                                    block26: {
                                                                                                                        block27: {
                                                                                                                            if ((n = n3 ^ n2) > -28223647) break block25;
                                                                                                                            if (n > -779829921) break block26;
                                                                                                                            if (n > -1896195648) break block27;
                                                                                                                            if (n == -1992353877) break block28;
                                                                                                                            if (n == -1896195648) break block29;
                                                                                                                            int cfr_ignored_0 = Integer.rotateRight(0xE74AB1A2 ^ n2, 15) + 107553241;
                                                                                                                            break block30;
                                                                                                                        }
                                                                                                                        if (n == -1831901640) break block31;
                                                                                                                        if (n == -1737167613) break block32;
                                                                                                                        if (n == -779829921) break block33;
                                                                                                                        break block30;
                                                                                                                    }
                                                                                                                    if (n > -487558606) break block34;
                                                                                                                    if (n == -680350865) break block35;
                                                                                                                    if (n == -487558606) break block36;
                                                                                                                    break block30;
                                                                                                                }
                                                                                                                if (n == -472184280) break block37;
                                                                                                                if (n == -233940404) break block38;
                                                                                                                int cfr_ignored_1 = (Integer.rotateRight(0xD383F477 ^ n2, 13) - -1588053596) * -746326921;
                                                                                                                if (n == -28223647) break block39;
                                                                                                                break block30;
                                                                                                            }
                                                                                                            if (n > 612897006) break block40;
                                                                                                            if (n > 162708521) break block41;
                                                                                                            if (n == -21706929) break block42;
                                                                                                            if (n == 162708521) break block43;
                                                                                                            int cfr_ignored_2 = (Integer.rotateRight(0x94657EBE ^ n2, 5) - -56100803) * -1805287745;
                                                                                                            break block30;
                                                                                                        }
                                                                                                        if (n == 350212498) break block44;
                                                                                                        if (n == 379291745) break block45;
                                                                                                        if (n == 612897006) break block46;
                                                                                                        break block30;
                                                                                                    }
                                                                                                    if (n > 1593546594) break block47;
                                                                                                    if (n == 674276913) break block48;
                                                                                                    if (n == 1593546594) break block49;
                                                                                                    break block30;
                                                                                                }
                                                                                                if (n == 1782980213) break block50;
                                                                                                if (n == 2051098634) break block51;
                                                                                                int cfr_ignored_3 = Integer.rotateRight(0x412656EF ^ n2, 11) - -402512340;
                                                                                                if (n == 2063016135) break block52;
                                                                                                break block30;
                                                                                            }
                                                                                            int cfr_ignored_4 = (Integer.rotateLeft(0x121D1839 ^ n2, 5) + 904105506) * 303896633;
                                                                                            int cfr_ignored_5 = (int)(0xD0AFB60427D4EB4FL ^ (long)n2 ^ 0x9178831A2DB80C8EL);
                                                                                            return;
                                                                                        }
                                                                                        int cfr_ignored_6 = Integer.rotateLeft(0x5F499320 ^ n2, 14) + -1907986405;
                                                                                        this.azw(f, f2);
                                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x169B8861));
                                                                                        n -= 4;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_7 = Integer.rotateLeft(0x213345EC ^ n2, 7) - 160634575;
                                                                                    yf.athz_2();
                                                                                    int cfr_ignored_8 = (int)(0xDF86A0125B67B6C6L ^ (long)n2 ^ 0xBD547A7C96AA12DCL);
                                                                                    n3 = (int)((long)(n2 ^ 0xB3600E63) ^ 0x72FCA3C68652630L ^ 0x72FCA3C68652630L);
                                                                                    int cfr_ignored_9 = (int)(0x8EE541404699B0EFL ^ (long)n2 ^ 0x7FF041809AF8B01BL);
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9874ED03));
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_10 = Integer.rotateRight(0xF530F962 ^ n2, 17) + -1253322215;
                                                                                if (!this.shn_3()) {
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x758199F5));
                                                                                    int cfr_ignored_11 = (Integer.rotateLeft(0xF4B9E6B5 ^ n2, 17) - -1495232730) * -189143371;
                                                                                    int cfr_ignored_12 = (int)(0x360B488827D4EB4FL ^ (long)n2 ^ 0x6C60831A2DB9C1C7L);
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x7AF720C7));
                                                                                    --n;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    n += 3;
                                                                                    n3 = (int)((long)(n2 ^ 0xF20E5A4C) ^ 0xD2A61EED292EC5C5L ^ 0xD2A61EED292EC5C5L);
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    n3 = (n2 ^ 0xF20E5A4C) + 1980778577 - 1980778577;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_13 = Integer.rotateLeft(0xAB63E681 ^ n2, 8) + -982087462;
                                                                            int cfr_ignored_14 = (int)(0x69D148BC27D4EB4FL ^ (long)n2 ^ 0x6C08831A2DB97E73L);
                                                                            if (this.shn_3()) {
                                                                                n3 = (n2 ^ 0xF20E5A4C) + 1668310057 - 1668310057;
                                                                                n += 5;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                n -= 3;
                                                                                if ((0xE50EA0BE3649F765L ^ (long)n2 | 1L) == 0L) {
                                                                                    throw new NoSuchElementException();
                                                                                }
                                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x7AF720C7));
                                                                            }
                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                n3 = (n2 ^ 0x7AF720C7) + 110960440 - 110960440;
                                                                            }
                                                                            n -= 2;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_15 = (Integer.rotateRight(0xA9D46ABA ^ n2, 8) + -1793684543) * -1445696837;
                                                                        f = this.jkhs_2();
                                                                        f2 = this.aath();
                                                                        if (this.dhqth == null) {
                                                                            int cfr_ignored_16 = (int)(0xC878F2D9CFA01ED0L ^ (long)n2 ^ 0x18C353F3C6863D20L);
                                                                            n3 = n2 ^ 0x6A317FE7;
                                                                            int cfr_ignored_17 = (int)(0x9836B677AE7D9A06L ^ (long)n2 ^ 0x919F9048CF2A9DBCL);
                                                                            n3 = n2 ^ 0x169B8861;
                                                                            n -= 4;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_18 = (int)(0x89CAE7C79B0152BEL ^ (long)n2 ^ 0x32FFFAB15E5ABE44L);
                                                                        n3 = (n2 ^ 0xE8DE8E9B) + -2116236638 - -2116236638;
                                                                        int cfr_ignored_19 = (int)(0x8C223DC27B777717L ^ (long)n2 ^ 0x86F43A5D1508B595L);
                                                                        n3 = (int)((long)(n2 ^ 0xFEB4C74F) ^ 0xF841465D4C2BBEA2L ^ 0xF841465D4C2BBEA2L);
                                                                        n += 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_20 = (Integer.rotateRight(0x66790F2 ^ n2, 3) + -890753911) * 107450611;
                                                                    if (yf.khdha_2()) {
                                                                        int cfr_ignored_21 = (int)(0x559DDEB3CF692136L ^ (long)n2 ^ 0x40175261B94B06EAL);
                                                                        n3 = (n2 ^ 0xD772AB6F) + -1617534680 - -1617534680;
                                                                        --n;
                                                                        continue;
                                                                    }
                                                                    n3 = n2 ^ 0xE3DB0A28;
                                                                    n += 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_22 = (Integer.rotateRight(0x6D4521E ^ n2, 3) - -669806371) * 114577951;
                                                                this.ashz();
                                                                return;
                                                            }
                                                            int cfr_ignored_23 = (Integer.rotateRight(0xB5B1E47B ^ n2, 9) + 82332192) * -1246632837;
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xB261DE33));
                                                            int cfr_ignored_24 = Integer.rotateLeft(0xA9A96CCC ^ n2, 8) - -1881027601;
                                                            try {
                                                                if ((0xCA983334AA19CCB1L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x14DFD192));
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                n3 = (n2 ^ 0x14DFD192) + 526522548 - 526522548;
                                                            }
                                                            n += 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_25 = (Integer.rotateLeft(0x8852D010 ^ n2, 4) + -2040213205) * -2007838703;
                                                        n3 = n2 ^ 0xEC224E56 ^ 0x581322AD ^ 0x581322AD;
                                                        int cfr_ignored_26 = (Integer.rotateRight(0xBB04A35E ^ n2, 10) - -1444059235) * -1157323937;
                                                        n3 = (int)((long)(n2 ^ 0x75002392) ^ 0xCADFD6E97B19001CL ^ 0xCADFD6E97B19001CL);
                                                        int cfr_ignored_27 = Integer.rotateRight(0x12A6A48B ^ n2, 5) + 1183550480;
                                                        n3 = (n2 ^ 0x14DFD192) + 870092833 - 870092833;
                                                        ++n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_28 = (Integer.rotateLeft(0x2911B67D ^ n2, 8) - -41764770) * 689026685;
                                                    int cfr_ignored_29 = (int)(0xEBA3184027D4EB4FL ^ (long)n2 ^ 0xCDF0831A2DB87A97L);
                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xCA1AB093));
                                                    int cfr_ignored_30 = Integer.rotateLeft(0x2E7C0669 ^ n2, 8) + -1520278030;
                                                    int cfr_ignored_31 = (int)(0xECCEA85427D4EB4FL ^ (long)n2 ^ 0xADD8831A2DB8744CL);
                                                    n3 = (n2 ^ 0x2E5C4129) + -2042976292 - -2042976292;
                                                    int cfr_ignored_32 = Integer.rotateLeft(0xE0691980 ^ n2, 15) + 823637435;
                                                    n3 = (int)((long)(n2 ^ 0x14DFD192) ^ 0x587C00BB17B9F25AL ^ 0x587C00BB17B9F25AL);
                                                    n -= 2;
                                                    continue;
                                                }
                                                int cfr_ignored_33 = (Integer.rotateRight(0xB079CCB3 ^ n2, 9) + 1662871784) * -1334195021;
                                                try {
                                                    if ((0xE0031D2E952A6D9DL ^ (long)n2 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n3 = n2 ^ 0x14DFD192 ^ 0x8CACD566 ^ 0x8CACD566;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    n3 = (int)((long)(n2 ^ 0x14DFD192) ^ 0x20F5DD36AB5A7684L ^ 0x20F5DD36AB5A7684L);
                                                }
                                                n += 4;
                                                continue;
                                            }
                                            int cfr_ignored_34 = (Integer.rotateRight(0x25C36C9E ^ n2, 7) - -1761098147) * 633564319;
                                            try {
                                                if ((0xA8E75C77FFC22A0DL ^ (long)n2 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                n3 = (n2 ^ 0x14DFD192) + 92717686 - 92717686;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                n3 = (int)((long)(n2 ^ 0x14DFD192) ^ 0x5FEE191D61515CE8L ^ 0x5FEE191D61515CE8L);
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_35 = (Integer.rotateLeft(0x9F6E91D5 ^ n2, 6) - 1388398598) * -1620143659;
                                        int cfr_ignored_36 = (int)(0x5DDC3FE827D4EB4FL ^ (long)n2 ^ 0x82A0831A2DB91669L);
                                        n3 = (n2 ^ 0x18D1EEC1) + -732125987 - -732125987;
                                        int cfr_ignored_37 = Integer.rotateLeft(0x738F19EC ^ n2, 17) - 45204175;
                                        n3 = n2 ^ 0x14DFD192;
                                        int cfr_ignored_38 = Integer.rotateLeft(0xFDF6BD0D ^ n2, 18) - -985758770;
                                        int cfr_ignored_39 = (int)(0x3F44133027D4EB4FL ^ (long)n2 ^ 0xDB10831A2DB9D359L);
                                        n += 5;
                                        continue;
                                    }
                                    int cfr_ignored_40 = Integer.rotateRight(0x1EDC2AA6 ^ n2, 6) - -1056519851;
                                    n3 = n2 ^ 0x1BA1F5BD ^ 0xC0F97544 ^ 0xC0F97544;
                                    int cfr_ignored_41 = (Integer.rotateRight(0x615020FF ^ n2, 15) - -854483428) * 1632641279;
                                    try {
                                        n -= 4;
                                        if ((0x35FA04FBA583BB97L ^ (long)n2 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x14DFD192));
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        n3 = (int)((long)(n2 ^ 0x14DFD192) ^ 0x740468C396482CD5L ^ 0x740468C396482CD5L);
                                    }
                                    n += 2;
                                    continue;
                                }
                                int cfr_ignored_42 = Integer.rotateRight(0xD7934B6B ^ n2, 13) + 523485488;
                                n3 = (n2 ^ 0xA8FB221A) + -1687371526 - -1687371526;
                                int cfr_ignored_43 = Integer.rotateLeft(0xC52F4A80 ^ n2, 11) + -451435333;
                                n3 = n2 ^ 0x14DFD192;
                                int cfr_ignored_44 = Integer.rotateLeft(0x6352F28 ^ n2, 3) + -993110765;
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_45 = (Integer.rotateLeft(0x81D41E5C ^ n2, 3) - -1123201953) * -2116805027;
                            n3 = (int)((long)(n2 ^ 0x4E475C33) ^ 0x1106831F71C56865L ^ 0x1106831F71C56865L);
                            int cfr_ignored_46 = (Integer.rotateLeft(0x61B81119 ^ n2, 15) + -643321534) * 1639452953;
                            int cfr_ignored_47 = (int)(0xA30ABF2427D4EB4FL ^ (long)n2 ^ 0x8338831A2DB8EBC4L);
                            n3 = (n2 ^ 0x14DFD192) + 637897242 - 637897242;
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_48 = Integer.rotateRight(0x1D81B36E ^ n2, 6) - -1760405107;
                        try {
                            if ((0x4562E44710E46465L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = (int)((long)(n2 ^ 0x14DFD192) ^ 0x6C40AF10AA233BC8L ^ 0x6C40AF10AA233BC8L);
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = n2 ^ 0x14DFD192;
                        }
                        ++n;
                        continue;
                    }
                    int cfr_ignored_49 = (Integer.rotateLeft(0xDC799591 ^ n2, 14) + -1223246902) * -596011631;
                    int cfr_ignored_50 = (int)(0x1ECB3BAC27D4EB4FL ^ (long)n2 ^ 0x8A28831A2DB99047L);
                    n3 = (int)((long)(n2 ^ 0x8B062C92) ^ 0x8BEFBEDB6743760L ^ 0x8BEFBEDB6743760L);
                    int cfr_ignored_51 = (Integer.rotateRight(0x27D573FB ^ n2, 7) + -684283232) * 668300283;
                    n3 = n2 ^ 0x14DFD192;
                    int cfr_ignored_52 = Integer.rotateRight(0xBC3ABC2A ^ n2, 10) + -814061487;
                    continue;
                }
                int cfr_ignored_53 = (Integer.rotateLeft(0x98E0085C ^ n2, 6) - -2021744033) * -1730148259;
                n3 = n2 ^ 0xBF1C9EEB;
                int cfr_ignored_54 = (Integer.rotateLeft(0xF045CCB8 ^ n2, 17) + 483486083) * -263861063;
                n3 = n2 ^ 0x14DFD192;
                n -= 2;
                continue;
            }
            int cfr_ignored_55 = Integer.rotateRight(0x97EAF527 ^ n2, 5) - 1775324916;
            n3 = (n2 ^ 0x14DFD192) + 84148623 - 84148623;
        }
    }

    private static String zrm(String string, int n, int n2, int n3) {
        try {
            int n4 = -1076237804;
            n4 = Integer.rotateLeft(n4 * -1038738937, 14) ^ 0x91EBD6BD;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateRight(n2 ^ n4, 26);
            int n5 = n4 ^ 0xA4BCD69;
            if ((n5 ^ n4) != 172739945) {
                int cfr_ignored_0 = (0xB592277D ^ n4) + -689882747;
            }
            if ((0x1B9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x1BD247A4) + sny ^ Integer.reverse(n2 + i * 1527307497), 18) - ddth);
        }
        return new String(cArray);
    }

    private static void szq() {
        int n = -2111367628;
        int n2 = (n = Integer.rotateLeft(n * 1527845827, 11) ^ 0x41758E3B) ^ 0x96BA2FC8;
        if ((n2 ^ n) != -1766182968) {
            int cfr_ignored_0 = (0x149D39FC ^ n) - 1341362011;
        }
        yf.athz_2();
    }

    private static void ddgh_2(class_6367 class_63672, boolean bl) {
        int n = 1040581205;
        n = Integer.rotateLeft(n * -1917530159, 12) ^ 0x9E6CFFE0;
        int n2 = (n = Integer.rotateLeft(bl ^ n, 13)) ^ 0x5DA5EF61;
        if ((n2 ^ n) != 1571155809) {
            int cfr_ignored_0 = (0x63A3ED34 ^ n) - -732726824;
        }
        class_63672.method_1235(bl);
    }

    private static boolean dhkt_2(qh_2 qh2_2) {
        block0: {
            int n = 1986857259;
            int n2 = (n = Integer.rotateLeft(n * 1322062583, 4) ^ 0x5BB3D1EE) ^ 0x46AA0A75;
            if ((n2 ^ n) == 1185548917) break block0;
            int cfr_ignored_0 = (0x30C7035E ^ n) - -292773092;
        }
        return qh2_2.tkhd();
    }

    private static void sh_4(qh_2 qh2_2, int n, int n2) {
        int n3 = 1715558202;
        n3 = Integer.rotateLeft(n3 * -1762472209, 5) ^ 0x99D70001;
        qh_2 qh3_2 = qh2_2;
        n3 = (qh3_2 != null ? System.identityHashCode(qh3_2) : 0) ^ n3;
        int n4 = n3 ^ 0x73A81CDF;
        if ((n4 ^ n3) != 1940397279) {
            int cfr_ignored_0 = (0x15E94BE5 ^ n3) - -519168597;
        }
        qh2_2.sth_9(n, n2);
    }

    private static void zhh_3(class_276 class_2762, int n, int n2) {
        int n3 = lh.dkhdh(-590664472);
        class_276 class_2763 = class_2762;
        n3 = (class_2763 != null ? System.identityHashCode(class_2763) : 0) ^ n3;
        int n4 = n3 ^ 0x455D5A1F;
        if ((n4 ^ n3) != 1163745823) {
            int cfr_ignored_0 = (Integer.rotateRight(0x999676F7 ^ n3, 6) - -1651112156) * -1718192393;
        }
        class_2762.method_1237(n, n2);
    }

    private static void tkht(class_6367 class_63672, class_276 class_2762) {
        int n = 1068030558;
        n = Integer.rotateLeft(n * 858854479, 15) ^ 0x22153695;
        class_6367 class_63673 = class_63672;
        n = Integer.rotateLeft((class_63673 != null ? System.identityHashCode(class_63673) : 0) ^ n, 6);
        class_276 class_2763 = class_2762;
        n = (class_2763 != null ? System.identityHashCode(class_2763) : 0) ^ n;
        int n2 = n ^ 0xF8BA6027;
        if ((n2 ^ n) != -122003417) {
            int cfr_ignored_0 = (0xC712BA79 ^ n) - -1842530966;
        }
        class_63672.method_29329(class_2762);
    }

    private static boolean khty_2(qh_2 qh2_2) {
        block0: {
            int n = 1362466896;
            n = Integer.rotateLeft(n * 1937862441, 3) ^ 0x6EAAA972;
            qh_2 qh3_2 = qh2_2;
            n = Integer.rotateLeft((qh3_2 != null ? System.identityHashCode(qh3_2) : 0) ^ n, 3);
            int n2 = n ^ 0xF9D9988F;
            if ((n2 ^ n) == -103180145) break block0;
            int cfr_ignored_0 = (0xA8EC00DF ^ n) - 1738688347;
        }
        return qh2_2.rgha_2();
    }

    private static void dhm_4(tay tay2, float f) {
        int n = -52361000;
        n = Integer.rotateLeft(n * 1279097237, 19) ^ 0x7BEF1221;
        tay tay3 = tay2;
        n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 12);
        int n2 = n ^ 0x49E7F675;
        if ((n2 ^ n) != 1239938677) {
            int cfr_ignored_0 = (0xB506FEAD ^ n) - -577450043;
        }
        tay2.shjl(f);
    }

    private static void bdha_2(tay tay2, float f) {
        int n = lh.dkhdh(548438180);
        tay tay3 = tay2;
        n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
        int n2 = n ^ 0xA1EE5E89;
        if ((n2 ^ n) != -1578213751) {
            int cfr_ignored_0 = Integer.rotateLeft(0x815EDE2D ^ n, 3) - -1361410386;
            int cfr_ignored_1 = (int)(0x43EC701027D4EB4FL ^ (long)n ^ 0x1D50831A2DB92A09L);
        }
        tay2.shjl(f);
    }

    private static boolean twf() {
        block0: {
            int n = 427524147;
            int n2 = (n = Integer.rotateLeft(n * -1806996921, 19) ^ 0xB9944457) ^ 0x1052929F;
            if ((n2 ^ n) == 273846943) break block0;
            int cfr_ignored_0 = (0x92912AC ^ n) + -216936684;
        }
        return yf.khdha_2();
    }

    private static void shlt() {
        int n = -1042370516;
        int n2 = (n = Integer.rotateLeft(n * 1895692295, 5) ^ 0xF2F0A433) ^ 0xF98F48E8;
        if ((n2 ^ n) != -108050200) {
            int cfr_ignored_0 = (0x3851F8C4 ^ n) + -1637474116;
        }
        yf.athz_2();
    }

    private static class_284 znt_2(class_5944 class_59442, String string) {
        block0: {
            int n = 2019655312;
            n = Integer.rotateLeft(n * -1209419521, 13) ^ 0x55FB43D2;
            class_5944 class_59443 = class_59442;
            n = (class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n;
            int n2 = n ^ 0xD9311E4D;
            if ((n2 ^ n) == -651092403) break block0;
            int cfr_ignored_0 = (0xA15060DD ^ n) + 1193897869;
        }
        return class_59442.method_34582(string);
    }

    private static void dhth_2(class_284 class_2842, float f) {
        int n = lh.dkhdh(-1935287545);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 27);
        int n2 = n ^ 0x4DE13D69;
        if ((n2 ^ n) != 1306606953) {
            int cfr_ignored_0 = Integer.rotateRight(0xC144E66E ^ n, 11) - 1807058573;
        }
        class_2842.method_1251(f);
    }

    private static void shfd_2() {
        int n = lh.dkhdh(-856233871);
        int n2 = n ^ 0x623BB48E;
        if ((n2 ^ n) != 1648080014) {
            int cfr_ignored_0 = (Integer.rotateRight(0xAECD5CFF ^ n, 8) - 792453660) * -1362273025;
        }
        yf.athz_2();
    }

    private static boolean khnf() {
        block0: {
            int n = 724327806;
            int n2 = (n = Integer.rotateLeft(n * 616843673, 22) ^ 0xEA3A60B2) ^ 0xF4B2D97D;
            if ((n2 ^ n) == -189605507) break block0;
            int cfr_ignored_0 = (0xDF9E8403 ^ n) + 1334288877;
        }
        return yf.dnkh();
    }

    private static class_6367 khdhq(qh_2 qh2_2, class_6367 class_63672, int n, int n2, boolean bl) {
        block0: {
            int n3 = -867215733;
            n3 = Integer.rotateLeft(n3 * 280872657, 11) ^ 0x20BAA50C;
            int n4 = (n3 = n2 ^ n3) ^ 0x890EFFE0;
            if ((n4 ^ n3) == -1995505696) break block0;
            int cfr_ignored_0 = (0x4541A96B ^ n3) - 1229979549;
        }
        return qh2_2.dzs_3(class_63672, n, n2, bl);
    }

    private static void dsj_4(qh_2 qh2_2, class_6367 class_63672) {
        int n = 1535027908;
        n = Integer.rotateLeft(n * -602920273, 27) ^ 0x307C0C45;
        qh_2 qh3_2 = qh2_2;
        n = (qh3_2 != null ? System.identityHashCode(qh3_2) : 0) ^ n;
        class_6367 class_63673 = class_63672;
        n = (class_63673 != null ? System.identityHashCode(class_63673) : 0) ^ n;
        int n2 = n ^ 0xAB5C6E2D;
        if ((n2 ^ n) != -1420005843) {
            int cfr_ignored_0 = (0xF022C4E9 ^ n) + 1951733278;
        }
        qh2_2.dghj(class_63672);
    }

    private static void stz_8(int n) {
        int n2 = -948284079;
        int n3 = (n2 = Integer.rotateLeft(n2 * 1265165337, 15) ^ 0x7BFA6E26) ^ 0x3FB7D73C;
        if ((n3 ^ n2) != 1069012796) {
            int cfr_ignored_0 = (0xF8CD826D ^ n2) - 209171781;
        }
        GlStateManager._bindTexture((int)n);
    }

    private static int tsz_5(int n, int n2) {
        block0: {
            int n3 = -940519303;
            n3 = Integer.rotateLeft(n3 * -1366253989, 5) ^ 0xB861BED9;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0xB913B31D;
            if ((n4 ^ n3) == -1189891299) break block0;
            int cfr_ignored_0 = (0x7EE36364 ^ n3) + -970871995;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static void szdh_2(int n, int n2, int n3) {
        int n4 = -491941752;
        n4 = Integer.rotateLeft(n4 * -2033639989, 11) ^ 0xDC944CC5;
        int n5 = (n4 = n3 ^ n4) ^ 0xDA17F9B4;
        if ((n5 ^ n4) != -635962956) {
            int cfr_ignored_0 = (0x38BA693C ^ n4) - 70661336;
        }
        GlStateManager._texParameter((int)n, (int)n2, (int)n3);
    }

    private static void khdr_2(int n) {
        int n2 = -485400034;
        n2 = Integer.rotateLeft(n2 * 672493233, 9) ^ 0xA29471B2;
        int n3 = (n2 = n ^ n2) ^ 0x62E2AAD0;
        if ((n3 ^ n2) != 1659022032) {
            int cfr_ignored_0 = (0x81F3C8CE ^ n2) - 859868495;
        }
        GlStateManager._bindTexture((int)n);
    }

    private static int rlkh(int n, int n2) {
        block0: {
            int n3 = -592836255;
            n3 = Integer.rotateLeft(n3 * -606899277, 18) ^ 0xC763DD3F;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 4)) ^ 0x49E7974B;
            if ((n4 ^ n3) == 1239914315) break block0;
            int cfr_ignored_0 = (0x954D9E2A ^ n3) + -1056229991;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean ghtha() {
        block0: {
            int n = 346452837;
            int n2 = (n = Integer.rotateLeft(n * 1806429491, 12) ^ 0x34499F8A) ^ 0xEE8E2E9E;
            if ((n2 ^ n) == -292671842) break block0;
            int cfr_ignored_0 = (0xFA285DFB ^ n) - -956521111;
        }
        return yf.khdha_2();
    }

    private static void ash_3(qh_2 qh2_2, class_6367 class_63672) {
        int n = lh.dkhdh(1406344793);
        qh_2 qh3_2 = qh2_2;
        n = Integer.rotateLeft((qh3_2 != null ? System.identityHashCode(qh3_2) : 0) ^ n, 2);
        class_6367 class_63673 = class_63672;
        n = (class_63673 != null ? System.identityHashCode(class_63673) : 0) ^ n;
        int n2 = n ^ 0xC44C5391;
        if ((n2 ^ n) != -1001630831) {
            int cfr_ignored_0 = Integer.rotateLeft(0x979F4DC8 ^ n, 5) + 1621625459;
        }
        qh2_2.tshdh_2(class_63672);
    }

    private static void dls_4() {
        int n = -12204520;
        int n2 = (n = Integer.rotateLeft(n * 277093001, 7) ^ 0x67FF7D6C) ^ 0xDC57F6F0;
        if ((n2 ^ n) != -598214928) {
            int cfr_ignored_0 = (0x231230E8 ^ n) - 1853796716;
        }
        yf.athz_2();
    }

    private static tay tkhm_2(tay tay2, float f) {
        block0: {
            int n = -628271844;
            n = Integer.rotateLeft(n * -316091477, 4) ^ 0x8AC3AE30;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x5964E41F;
            if ((n2 ^ n) == 1499784223) break block0;
            int cfr_ignored_0 = (0x83E9B103 ^ n) - -230965671;
        }
        return tay2.shth_7(f);
    }

    private static tay tdz(tay tay2, float f) {
        block0: {
            int n = 2015534839;
            n = Integer.rotateLeft(n * -254148639, 28) ^ 0xA813964B;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x375EF75F;
            if ((n2 ^ n) == 928970591) break block0;
            int cfr_ignored_0 = (0x4F7C69A8 ^ n) + -1890642402;
        }
        return tay2.dhbs_2(f);
    }

    private static boolean khst_3() {
        block0: {
            int n = -1522651556;
            int n2 = (n = Integer.rotateLeft(n * -1718686719, 12) ^ 0x8979E158) ^ 0xF8868F28;
            if ((n2 ^ n) == -125399256) break block0;
            int cfr_ignored_0 = (0x5DB8A174 ^ n) - 529511763;
        }
        return yf.khdha_2();
    }

    private static void shjt_2() {
        int n = 967178404;
        int n2 = (n = Integer.rotateLeft(n * -1150657399, 16) ^ 0xB88476E) ^ 0x3B1B997C;
        if ((n2 ^ n) != 991664508) {
            int cfr_ignored_0 = (0x2BE61D8 ^ n) - 359948569;
        }
        yf.athz_2();
    }

    private static String[] tdw_3(String string) {
        int n = 1004701642;
        int n2 = (n = Integer.rotateLeft(n * -1969195985, 18) ^ 0x1143A996) ^ 0x2452B179;
        if ((n2 ^ n) != 609399161) {
            int cfr_ignored_0 = (0x1FB036B3 ^ n) - 1755399450;
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

    private static CallSite thlj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1292057745;
            n3 = Integer.rotateLeft(n3 * 496204957, 24) ^ 0x282A3AF8;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            String string4 = string2;
            n3 = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n3, 13);
            int n4 = n3 ^ 0x296B25E9;
            if ((n4 ^ n3) != 694887913) {
                int cfr_ignored_0 = (0x64681978 ^ n3) - -1534413534;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dhhl_2 ^ string.hashCode() ^ n2 + ryth + i * 1838708711) + dhhl_2) ^ ryth));
            }
            String[] stringArray = qh_2.tdw_3(new String(cArray));
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

    private static String[] z52kahhge(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yvx287gc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ efft289g54yh ^ string.hashCode()) + (n2 + pwzdg43v) + i ^ efft289g54yh, 28) + pwzdg43v);
            }
            String[] stringArray = qh_2.z52kahhge(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

