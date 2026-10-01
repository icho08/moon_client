/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tjkh;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Hat", category=bzw.OTHER, desc="Renders cosmetic hats (Crown / China Hat / Santa Hat) on players")
public final class bkhs
extends bnq {
    private static final class_2960 dhdt;
    private static final int saf_2 = 48;
    private static final int bshdh = 24;
    private static final int rsz = 6;
    private static final int khwdh = 4;
    private static final float bthj = 0.32f;
    private static final float tthy = 0.13f;
    private static final float hlj = 0.045f;
    private static final float[] jsk;
    private static final float[] skhs;
    private static bkhs bsth_2;
    public final khd zjm = new khd(this, "Type");
    public final fy rtd = new fy(this.zjm, "Crown").rhh_3();
    public final fy hqw = new fy(this.zjm, "China Hat");
    public final fy khskh = new fy(this.zjm, "Santa Hat");
    public final bzw_2 rkq = new bzw_2(this, "Color 1", this::rnr).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0x33751F6D ^ 0x316EE76D, 5)), Float.intBitsToFloat(Integer.reverse(-1548845044) ^ 0x735D75C5), Float.intBitsToFloat(2028185144 + -895788600), Float.intBitsToFloat(637859502 + 494537042)));
    public final bzw_2 dhta = new bzw_2(this, "Color 2", this::khdhkh).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-624169138) ^ 0x31F5D35B), Float.intBitsToFloat(0x302DF34D ^ 0x7295F34D), Float.intBitsToFloat(Integer.reverse(68281677) ^ 0xF1D88820), Float.intBitsToFloat(1386152085 - 253755541)));
    public final tay zdha = new tay(this, "Scale").shth_7(Float.intBitsToFloat(-243558770 - -1300523378)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(0xD1CD067 ^ 0x30501CAA)).ssd_5(1.0f);
    public final tay hyk = new tay((hy)this, "Glow", this::twt_2).shth_7(Float.intBitsToFloat(824474078 - -212357871)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(466277061) ^ 0x9E079F15)).ssd_5(Float.intBitsToFloat(-416951196 - -1477271247));
    public final tay tghj = new tay((hy)this, "Range", this::ghaa).shth_7(Float.intBitsToFloat(Integer.reverse(301654140) ^ 0x7F075F88)).dhbs_2(Float.intBitsToFloat(0x37FBE31B ^ 0x753BE31B)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xFB7F6E84 ^ 0xB93F6E84));
    public final badh_2 shyt = new badh_2((hy)this, "High Detail", this::ddt_5).bts(true);
    public final badh_2 zdhn = new badh_2(this, "On Self").bts(true);
    public final badh_2 jhf = new badh_2(this, "On Friends").bts(true);
    public final badh_2 tsa_3 = new badh_2(this, "On Players").bts(false);
    private boolean rghkh;
    private final bql<shw_3> tdh = this::khdz_2;
    private static final int shghth = 1803515599;
    private static final int bhth_2 = -188917533;
    private static final int tdsh = 1884697735;
    private static final int zd_4 = 1545363140;
    private static final int qnr9432ft = 1371573549;
    private static final int e46mjpp2408b = -626534579;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o5c2nzjwhqu;

    public bkhs() {
        bsth_2 = this;
    }

    public static bkhs thyn() {
        block0: {
            int n = tjkh.stz(133795739);
            int n2 = n ^ 0xEA24913E;
            if ((n2 ^ n) == -366702274) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEDDD1EA5 ^ n, 16) - -769370826;
            int cfr_ignored_1 = (int)(0x2F6FB09827D4EB4FL ^ (long)n ^ 0x9C40831A2DB9F30EL);
        }
        return bsth_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void tth_8(shw_3 shw2) {
        if (bkhs.mc.field_1724 == null || bkhs.mc.field_1687 == null || !this.zdhn.shzl() && !this.jhf.shzl() && !this.tsa_3.shzl()) {
            return;
        }
        class_4184 class_41842 = bkhs.mc.field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        float f = class_3532.method_15363((float)shw2.skz_4(), (float)0.0f, (float)1.0f);
        float f2 = this.tghj.thw_5() * this.tghj.thw_5();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)dhdt);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        try {
            long l = System.currentTimeMillis();
            Quaternionf quaternionf = new Quaternionf((Quaternionfc)class_41842.method_23767());
            for (class_1657 class_16572 : bkhs.mc.field_1687.method_18456()) {
                if (!this.thly(class_16572, class_2432, f2)) continue;
                this.bshy(shw2.ssha_2(), class_16572, class_2432, quaternionf, f, l);
            }
            this.rghkh = false;
        }
        catch (RuntimeException runtimeException) {
            if (!this.rghkh) {
                Moondlc.dhrn.error("Failed to render Hat crowns", (Throwable)runtimeException);
                this.rghkh = true;
            }
        }
        finally {
            RenderSystem.depthMask((boolean)true);
            RenderSystem.enableCull();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            RenderSystem.disableBlend();
        }
    }

    private boolean thly(class_1657 class_16572, class_243 class_2432, float f) {
        if (!class_16572.method_5805() || class_16572.method_7325() || class_16572.method_5767() || class_16572.method_6128()) {
            return false;
        }
        if (class_2432.method_1025(class_16572.method_19538()) > (double)f) {
            return false;
        }
        if (class_16572 == bkhs.mc.field_1724) {
            return this.zdhn.shzl() && !bkhs.mc.field_1690.method_31044().method_31034();
        }
        boolean bl = Moondlc.getInstance().getFriendManager().adhj(class_16572.method_5477().getString());
        return bl ? this.jhf.shzl() : this.tsa_3.shzl();
    }

    private void bshy(class_4587 class_45872, class_1657 class_16572, class_243 class_2432, Quaternionf quaternionf, float f, long l) {
        double d = class_3532.method_16436((double)f, (double)class_16572.field_6014, (double)class_16572.method_23317());
        double d2 = class_3532.method_16436((double)f, (double)class_16572.field_6036, (double)class_16572.method_23318());
        double d3 = class_3532.method_16436((double)f, (double)class_16572.field_5969, (double)class_16572.method_23321());
        double d4 = class_2432.method_1028(d, d2, d3);
        int n = this.shyt.shzl() && d4 < 1024.0 ? 48 : 24;
        int n2 = this.shyt.shzl() && d4 < 1024.0 ? 6 : 4;
        float f2 = this.zdha.thw_5();
        float f3 = 0.32f * f2;
        float f4 = this.hyk.thw_5();
        float f5 = class_16572.method_17682() + 0.25f;
        int n3 = this.rkq.sdsh_4().rk();
        int n4 = this.dhta.sdsh_4().rk();
        class_45872.method_22903();
        class_45872.method_22904(d - class_2432.field_1352, d2 - class_2432.field_1351 + (double)f5, d3 - class_2432.field_1350);
        Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_45872.method_23760().method_23761());
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (int i = 0; i < n; ++i) {
            int n5 = i * 48 / n;
            float f6 = jsk[n5] * f3;
            float f7 = skhs[n5] * f3;
            int n6 = bkhs.dhbsh(n3, n4, (float)i / (float)n, l);
            for (int j = 0; j < n2; ++j) {
                float f8 = Math.max(0.012f, 0.05f - (float)j * 0.006f) * f2;
                float f9 = (float)Math.sin((double)l / 320.0 + (double)i * 0.5) * f8;
                float f10 = 0.02f * f2 + f9 - (float)j * 0.045f * f2;
                float f11 = 0.13f * f2 * (1.0f - (float)j * 0.07f);
                float f12 = Math.max(0.08f, 0.5f - (float)j * 0.07f) * f4;
                Matrix4f matrix4f2 = new Matrix4f((Matrix4fc)matrix4f).translate(f6, f10, f7).rotate((Quaternionfc)quaternionf);
                bkhs.sdhd_2(class_2872, matrix4f2, f11, bkhs.sk_2(n6, f12));
            }
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        class_45872.method_22909();
    }

    private static void sdhd_2(class_287 class_2872, Matrix4f matrix4f, float f, int n) {
        float f2 = f * 0.5f;
        class_2872.method_22918(matrix4f, -f2, -f2, 0.0f).method_22913(0.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f2, -f2, 0.0f).method_22913(1.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f2, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, -f2, f2, 0.0f).method_22913(0.0f, 0.0f).method_39415(n);
    }

    private static int dhbsh(int n, int n2, float f, long l) {
        float f2;
        int n3 = -1928958431;
        n3 = Integer.rotateLeft(n3 * 1760969229, 11) ^ 0x48698156;
        n3 = n ^ n3;
        int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 15)) ^ 0x7F3A697C;
        if ((n4 ^ n3) != 2134534524) {
            int cfr_ignored_0 = (0xF23C075D ^ n3) - -1240447244;
        }
        float f3 = (f2 = (f + (float)(l % (0xF0D405E57F246FBFL ^ 0xF0D405E57F24601FL)) / Float.intBitsToFloat(-112494505 - -1278117801)) % 1.0f) <= Float.intBitsToFloat(bkhs.dhkd(1203704485) ^ 0x9A48FDE2) ? f2 * 2.0f : (1.0f - f2) * 2.0f;
        int n5 = Math.round(class_3532.method_48781((float)f3, (int)(n >> 1349831562 - 1349831546 & Integer.rotateLeft(0xB069808 ^ 0xB395808, 18)), (int)(n2 >> -1281811831 - -1281811847 & (Integer.reverse(257378809) ^ 0x9F92EA0F))));
        int n6 = Math.round(class_3532.method_48781((float)f3, (int)(n >> -1625893506 + 1625893514 & 423758747 - 423758492), (int)(n2 >> (0x999CD8AE ^ 0x999CD8A6) & bkhs.aas_4(0x5E7979C7 ^ 0xAE7979C8, 4))));
        int n7 = Math.round(class_3532.method_48781((float)f3, (int)(n & 1192851115 - 1192850860), (int)(n2 & Integer.rotateLeft(0x110D2EC8 ^ 0x1172AEC8, 17))));
        return Integer.rotateLeft(0xB3E158BC ^ 0xB3E1273C, 17) | n5 << 1075077642 - 1075077626 | n6 << (0xE787D14A ^ 0xE787D142) | n7;
    }

    private static int sk_2(int n, float f) {
        try {
            int n2 = -1042231238;
            n2 = Integer.rotateLeft(n2 * 308385161, 3) ^ 0xDC6A16F;
            n2 = n ^ n2;
            n2 = Integer.rotateRight(Float.floatToIntBits(f) ^ n2, 19);
            int n3 = n2 ^ 0x377ED597;
            if ((n3 ^ n2) != 931059095) {
                int cfr_ignored_0 = (0xF69E05AD ^ n2) + -1956607900;
            }
            if ((0x3AF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        int n4 = class_3532.method_15340((int)Math.round((float)(n >>> (0x9169BC45 ^ 0x9169BC5D)) * class_3532.method_15363((float)f, (float)0.0f, (float)1.0f)), (int)0, (int)(0x5FD1CB24 ^ 0x5FD1CBDB));
        return n4 << (Integer.reverse(1736053173) ^ 0xAD885EFE) | n & (Integer.reverse(-90646766) ^ 0x4814E6A0);
    }

    private static float[] thfh(boolean bl) {
        try {
            int n = 134358832;
            n = Integer.rotateLeft(n * -935530949, 23) ^ 0x43B4BF02;
            int n2 = n ^ 0xFF176619;
            if ((n2 ^ n) != -15243751) {
                int cfr_ignored_0 = (0xF7154129 ^ n) - -1544630878;
            }
            if ((0x16C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        float[] fArray = new float[0xD4B117A1 ^ 0xD4B11791];
        for (int i = 0; i < fArray.length; ++i) {
            float f = (float)i * Float.intBitsToFloat(Integer.rotateLeft(0xB6DDE936 ^ 0x89B0EA12, 14)) / (float)fArray.length;
            fArray[i] = bl ? class_3532.method_15374((float)f) : class_3532.method_15362((float)f);
        }
        return fArray;
    }

    /*
     * Unable to fully structure code
     */
    private void khdz_2(shw_3 var1_1) {
        var4_2 = 0;
        var2_3 = -493474341;
        var2_3 = Integer.rotateLeft(var2_3 * -87546983, 22) ^ 95459665;
        var2_3 = Integer.rotateRight(System.identityHashCode(this) ^ var2_3, 14);
        var3_4 = (int)((long)(-2142650367 * 288890619 + -547486550 ^ var2_3) ^ 3082962143637398371L ^ 3082962143637398371L);
        while (true) {
            block30: {
                block39: {
                    block28: {
                        block35: {
                            block29: {
                                block33: {
                                    block34: {
                                        block36: {
                                            block32: {
                                                block31: {
                                                    block38: {
                                                        block37: {
                                                            var4_2 = ((var3_4 ^ var2_3) - -547486550) * -1099088845;
                                                            switch (var4_2 & 7) {
                                                                case 3: {
                                                                    if (var4_2 != -1977691757) {
                                                                        ** break;
                                                                    }
                                                                    break block28;
                                                                }
                                                                case 7: {
                                                                    if (var4_2 != 179274927) {
                                                                        ** break;
                                                                    }
                                                                    break block29;
                                                                }
                                                                case 6: {
                                                                    if (var4_2 != -1831786490) {
                                                                        ** break;
                                                                    }
                                                                    break block30;
                                                                }
                                                                case 0: {
                                                                    if (var4_2 == 1074624752) break block31;
                                                                    if (var4_2 != 638556568) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 5: {
                                                                    if (var4_2 == -273269403) break block33;
                                                                    if (var4_2 != -1956118819) {
                                                                        Integer.rotateRight(85657287 ^ var2_3, 3) - -1566346924;
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                                case 1: {
                                                                    if (var4_2 == -1529273375) break block35;
                                                                    if (var4_2 == -2142650367) break;
                                                                    (Integer.rotateRight(553777439 ^ var2_3, 7) - 60475900) * 553777439;
                                                                    if (var4_2 == -1324949615) break block36;
                                                                    if (var4_2 != -2106992927) {
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                                case 2: {
                                                                    if (var4_2 == 1141858290) break block38;
                                                                    if (var4_2 != 1989645650) {
                                                                        ** break;
                                                                    }
                                                                    break block39;
                                                                }
                                                            }
                                                            Integer.rotateRight(-1036267838 ^ var2_3, 11) + -1986287431;
                                                            if (this.zjm.skhth(this.rtd)) {
                                                                try {
                                                                    var4_2 += 3;
                                                                    var3_4 = 1141858290 * 288890619 + -547486550 ^ var2_3;
                                                                }
                                                                catch (IllegalStateException v0) {
                                                                    var3_4 = 1141858290 * 288890619 + -547486550 ^ var2_3 ^ -413932870 ^ -413932870;
                                                                }
                                                                var4_2 += 3;
                                                                continue;
                                                            }
                                                            var3_4 = (int)((long)(-2106992927 * 288890619 + -547486550 ^ var2_3) ^ -8613018285710849770L ^ -8613018285710849770L);
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(102212885 ^ var2_3, 3) - -1053123386) * 102212885;
                                                        (int)(-4277000004023555249L ^ (long)var2_3 ^ -1504058127082314597L);
                                                        return;
                                                    }
                                                    (Integer.rotateLeft(910484368 ^ var2_3, 9) + -1766511189) * 910484369;
                                                    this.tth_8(var1_1);
                                                    var3_4 = -12197371 * 288890619 + -547486550 ^ var2_3 ^ -82805729 ^ -82805729;
                                                    (Integer.rotateLeft(-598214883 ^ var2_3, 14) - -1291547714) * -598214883;
                                                    (int)(2226283585446669135L ^ (long)var2_3 ^ 5706204876337942555L);
                                                    var3_4 = -2106992927 * 288890619 + -547486550 ^ var2_3 ^ 1960254081 ^ 1960254081;
                                                    --var4_2;
                                                    continue;
                                                }
                                                Integer.rotateRight(-1000373974 ^ var2_3, 11) + -873577647;
                                                try {
                                                    var4_2 -= 3;
                                                    if ((-2507531506077624963L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var3_4 = (-2142650367 * 288890619 + -547486550 ^ var2_3) + 2053853734 - 2053853734;
                                                }
                                                catch (IllegalStateException v1) {
                                                    var3_4 = -2142650367 * 288890619 + -547486550 ^ var2_3 ^ 1173412978 ^ 1173412978;
                                                }
                                                continue;
                                            }
                                            Integer.rotateRight(803074410 ^ var2_3, 8) + -801252591;
                                            var3_4 = -935538419 * 288890619 + -547486550 ^ var2_3 ^ -1226499817 ^ -1226499817;
                                            (Integer.rotateLeft(-1331408132 ^ var2_3, 9) - 1749265343) * -1331408131;
                                            var3_4 = -2142650367 * 288890619 + -547486550 ^ var2_3;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1603355199 ^ var2_3, 7) + 1908840858;
                                        (int)(7123590684314233679L ^ (long)var2_3 ^ -2699763828149098391L);
                                        var3_4 = (1042531041 * 288890619 + -547486550 ^ var2_3) + 1020538061 - 1020538061;
                                        (Integer.rotateLeft(-739069992 ^ var2_3, 13) + -1363088797) * -739069991;
                                        var3_4 = -2142650367 * 288890619 + -547486550 ^ var2_3 ^ 1182652864 ^ 1182652864;
                                        var4_2 += 5;
                                        continue;
                                    }
                                    Integer.rotateLeft(-1839793051 ^ var2_3, 5) - -1125765258;
                                    (int)(5828874356303129423L ^ (long)var2_3 ^ 6467313213363522585L);
                                    var3_4 = (2037403672 * 288890619 + -547486550 ^ var2_3) + -1814745160 - -1814745160;
                                    Integer.rotateRight(731870467 ^ var2_3, 8) + 1286392472;
                                    (int)(4157065563048590247L ^ (long)var2_3 ^ 5135598608429211312L);
                                    var3_4 = (int)((long)(1967104044 * 288890619 + -547486550 ^ var2_3) ^ 627840319870332575L ^ 627840319870332575L);
                                    (int)(7062421699431781964L ^ (long)var2_3 ^ 8884720236473838036L);
                                    var3_4 = (-2142650367 * 288890619 + -547486550 ^ var2_3) + -1463655006 - -1463655006;
                                    var4_2 -= 4;
                                    continue;
                                }
                                (Integer.rotateLeft(1182588249 ^ var2_3, 11) + -1921225470) * 1182588249;
                                (int)(-8877030941498479793L ^ (long)var2_3 ^ 1997490583198278733L);
                                var3_4 = Integer.reverse(Integer.reverse(2102061345 * 288890619 + -547486550 ^ var2_3));
                                Integer.rotateRight(1144148911 ^ var2_3, 11) - 1182122348;
                                var3_4 = (1917636522 * 288890619 + -547486550 ^ var2_3) + 307821084 - 307821084;
                                (Integer.rotateLeft(1064253013 ^ var2_3, 10) - -1294650490) * 1064253013;
                                (int)(-153799239148442801L ^ (long)var2_3 ^ -3629757151201175958L);
                                var3_4 = (-2142650367 * 288890619 + -547486550 ^ var2_3) + -1490552047 - -1490552047;
                                var4_2 -= 5;
                                continue;
                            }
                            (Integer.rotateRight(-385958818 ^ var2_3, 16) - 993423005) * -385958817;
                            (int)(7899722414649200085L ^ (long)var2_3 ^ 1885941740684015251L);
                            var3_4 = (1262003229 * 288890619 + -547486550 ^ var2_3) + 478635808 - 478635808;
                            (int)(721536364449902022L ^ (long)var2_3 ^ 3346319193215318487L);
                            var3_4 = (int)((long)(-2142650367 * 288890619 + -547486550 ^ var2_3) ^ 7846672056923149010L ^ 7846672056923149010L);
                            continue;
                        }
                        Integer.rotateRight(1956822474 ^ var2_3, 17) + 605199025;
                        var3_4 = (-31585681 * 288890619 + -547486550 ^ var2_3) + 973211119 - 973211119;
                        Integer.rotateRight(-1579338238 ^ var2_3, 7) + -1641600647;
                        var3_4 = -2142650367 * 288890619 + -547486550 ^ var2_3;
                        Integer.rotateLeft(-223036512 ^ var2_3, 17) + 1749047195;
                        continue;
                    }
                    Integer.rotateLeft(-363645312 ^ var2_3, 16) + 1685141691;
                    var3_4 = (int)((long)(-1183577899 * 288890619 + -547486550 ^ var2_3) ^ 579370333095384809L ^ 579370333095384809L);
                    Integer.rotateLeft(1696498916 ^ var2_3, 15) - 1125103319;
                    var3_4 = -464968168 * 288890619 + -547486550 ^ var2_3;
                    (Integer.rotateRight(2044561375 ^ var2_3, 18) - -969862340) * 2044561375;
                    var3_4 = -2142650367 * 288890619 + -547486550 ^ var2_3;
                    var4_2 += 3;
                    continue;
                }
                (Integer.rotateRight(-1522834409 ^ var2_3, 7) - 110018052) * -1522834409;
                try {
                    var4_2 -= 4;
                    var3_4 = (int)((long)(-2142650367 * 288890619 + -547486550 ^ var2_3) ^ -2132538898537291606L ^ -2132538898537291606L);
                }
                catch (IllegalArgumentException v2) {
                    var3_4 = (int)((long)(-2142650367 * 288890619 + -547486550 ^ var2_3) ^ 1037615970250771528L ^ 1037615970250771528L);
                }
                --var4_2;
                continue;
            }
            Integer.rotateRight(393836075 ^ var2_3, 5) + -602739088;
            var3_4 = -1906472263 * 288890619 + -547486550 ^ var2_3 ^ 1734096435 ^ 1734096435;
            Integer.rotateRight(-760254841 ^ var2_3, 13) - -2019819116;
            try {
                var4_2 -= 2;
                if ((-1755098655816765637L ^ (long)var2_3 | 1L) == 0L) {
                    throw new IllegalStateException();
                }
                var3_4 = (-2142650367 * 288890619 + -547486550 ^ var2_3) + -1944076996 - -1944076996;
            }
            catch (IllegalStateException v3) {
                var3_4 = (-2142650367 * 288890619 + -547486550 ^ var2_3) + 164473899 - 164473899;
            }
            var4_2 -= 2;
            continue;
lbl200:
            // 8 sources

            Integer.rotateLeft(-1824067776 ^ var2_3, 5) + -638281733;
            var3_4 = -2142650367 * 288890619 + -547486550 ^ var2_3 ^ 117326748 ^ 117326748;
        }
    }

    private boolean ddt_5() {
        int n;
        block4: {
            try {
                int n2 = -1844481315;
                n2 = Integer.rotateLeft(n2 * -142699621, 6) ^ 0x85A2CF94;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0x5D415AAA;
                if ((n3 ^ n2) != 1564564138) {
                    int cfr_ignored_0 = (0xCF4E2877 ^ n2) + -800935037;
                }
                if ((0xC9 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = !this.zjm.skhth(this.rtd) ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x866;
        }
        return n != 0;
    }

    private boolean ghaa() {
        int n = 241298844;
        n = Integer.rotateLeft(n * 2043585985, 9) ^ 0xD43D36FA;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0x245F5B1F;
        if ((n2 ^ n) != 610229023) {
            int cfr_ignored_0 = (0x2A3EB683 ^ n) + -1014755744;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.zjm.skhth(this.rtd);
    }

    private boolean twt_2() {
        block0: {
            int n = tjkh.stz(658345273);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
            int n2 = n ^ 0xAE7B886E;
            if ((n2 ^ n) == -1367635858) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x89460557 ^ n, 4) - -1546107708) * -1991899817;
        }
        return this.zjm.skhth(this.khskh);
    }

    private boolean khdhkh() {
        block0: {
            int n = tjkh.stz(1304536267);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA5F59089;
            if ((n2 ^ n) == -1510633335) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE8343442 ^ n, 16) + 581956409;
        }
        return this.zjm.skhth(this.khskh);
    }

    private boolean rnr() {
        block0: {
            int n = 644256124;
            int n2 = (n = Integer.rotateLeft(n * -1188671479, 20) ^ 0xAB237481) ^ 0xCD562AB7;
            if ((n2 ^ n) == -849990985) break block0;
            int cfr_ignored_0 = (0xEB30BBCB ^ n) - 1661702573;
        }
        return this.zjm.skhth(this.khskh);
    }

    private static String ttz(String string, int n, int n2, int n3) {
        try {
            int n4 = 801318778;
            n4 = Integer.rotateLeft(n4 * -515825285, 10) ^ 0xE2FA3ED3;
            n4 = Integer.rotateRight(n3 ^ n4, 27);
            int n5 = n4 ^ 0xAD64BFE0;
            if ((n5 ^ n4) != -1385906208) {
                int cfr_ignored_0 = (0x82A7989A ^ n4) - -563782068;
            }
            if ((0x13A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xCB72C2BB) + n2 ^ i * 656022701) ^ shghth) + bhth_2);
        }
        return new String(cArray);
    }

    private static int dhkd(int n) {
        block0: {
            int n2 = -278557935;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1582226475, 23) ^ 0x72F2DD0A) ^ 0x291133D7;
            if ((n3 ^ n2) == 688993239) break block0;
            int cfr_ignored_0 = (0xC674B8C6 ^ n2) + -868095369;
        }
        return Integer.reverse(n);
    }

    private static int aas_4(int n, int n2) {
        block0: {
            int n3 = -315948974;
            n3 = Integer.rotateLeft(n3 * 1648177513, 14) ^ 0x6D741582;
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 19)) ^ 0x27E25736;
            if ((n4 ^ n3) == 669144886) break block0;
            int cfr_ignored_0 = (0xCAC95764 ^ n3) + -2060826535;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String[] thjw(String string) {
        block0: {
            int n = tjkh.stz(1954550267);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 9);
            int n2 = n ^ 0x3D66D00E;
            if ((n2 ^ n) == 1030148110) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x49E6C1F5 ^ n, 12) - -145810458) * 1239859701;
            int cfr_ignored_1 = (int)(0x8B546FC827D4EB4FL ^ (long)n ^ 0x22E0831A2DB8BB79L);
        }
        return string.split("\u0001\u000f", -1);
    }

    private static CallSite ahm_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 114183873;
            n3 = Integer.rotateLeft(n3 * -1195867785, 8) ^ 0x734DEF8C;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xD86C3449;
            if ((n4 ^ n3) != -663997367) {
                int cfr_ignored_0 = (0xDEA27A88 ^ n3) + 788198933;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ tdsh ^ string.hashCode() ^ n2 + zd_4 ^ i * 256976759 ^ tdsh, 23) ^ zd_4));
            }
            String[] stringArray = bkhs.thjw(new String(cArray));
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

    private static String[] hdta6tk4alk(String string) {
        return string.split("\u0001\u0016", -1);
    }

    private static CallSite jghpdi6xp7vz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ qnr9432ft ^ string.hashCode() ^ n2 + e46mjpp2408b ^ i * -1766974113 ^ qnr9432ft, 7) ^ e46mjpp2408b));
            }
            String[] stringArray = bkhs.hdta6tk4alk(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

