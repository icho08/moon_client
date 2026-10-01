/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_243
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_638
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tdkh;
import us.m0vy.moondlc.m0vyguard.trb;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.khd_2;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Jump Circles", category=bzw.OTHER, desc="Draws animated Vega circles when you jump")
public final class ka_2
extends bnq {
    private static final class_2960 khbgh;
    private static final class_2960 sqa;
    private static final class_2960 bdh_2;
    private static final class_2960 dhwq;
    private static final class_2960[] shr_3;
    private static final class_2960[] sghd;
    private static final int sqs = 128;
    private final tay thtb = new tay((hy)this, "Max Time", this::shrt_2).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x7E8FE960 ^ 0x595FE962, 29))).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x762C1DDA ^ 0x7624A29A, 11))).rkh_3(Float.intBitsToFloat(0xF5C48D28 ^ 0xB70C8D28)).ssd_5(Float.intBitsToFloat(0xEEA7C9F3 ^ 0xABFD09F3)).ghshz_2("ms");
    private final tay dtw_2 = new tay((hy)this, "Range", this::shrt_2).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xD6003784 ^ 0xD6407784, 8))).rkh_3(Float.intBitsToFloat(-1775079977 + -1483055370)).ssd_5(2.0f);
    private final khd hfy = new khd(this, "Texture");
    private final fy thdk = new fy(this.hfy, "Circle");
    private final fy zs_4 = new fy(this.hfy, "KonchalEbal");
    private final fy jwy = new fy(this.hfy, "CubicalPieces");
    private final fy shthh_2 = new fy(this.hfy, "Leeches");
    private final fy tlb = new fy(this.hfy, "Lean");
    private final fy shkhj = new fy(this.hfy, "Glow");
    private final fy tskh_2 = new fy(this.hfy, "Mercury");
    private final khd jkhy = new khd(this, "Color Mode");
    private final fy brsh = new fy(this.jkhy, "Client");
    private final fy khth_4 = new fy(this.jkhy, "Rainbow").rhh_3();
    private final fy thbq = new fy(this.jkhy, "Picker");
    private final fy zwn = new fy(this.jkhy, "Picker Fade");
    private final bzw_2 dhtt_3 = new bzw_2(this, "Primary Color", this::shdgh_2).dhshy(new byq(Float.intBitsToFloat(536430634 + 595965910), Float.intBitsToFloat(0xB2197885 ^ 0xF0B97885), 0.0f, Float.intBitsToFloat(1620731362 - 488334818)));
    private final bzw_2 tnkh = new bzw_2(this, "Secondary Color", this::ghjt_2).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(510670170) ^ 0x19D30E78), Float.intBitsToFloat(1273560556 + -148569580), 0.0f, Float.intBitsToFloat(Integer.reverse(-117300249) ^ 0xA4BB409F)));
    private final badh_2 dhh = new badh_2((hy)this, "Deep".concat("est Light"), this::shrt_2).bts(true);
    private final tay dhwa = new tay((hy)this, "Mercu".concat("ry Layers"), this::bas).shth_7(2.0f).dhbs_2(Float.intBitsToFloat(0x1D252BD4 ^ 0x5CB52BD4)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-1626498963 - 1571657837));
    private final tay khyh = new tay((hy)this, "Mercury Height", this::khnh).shth_7(Float.intBitsToFloat(0x5B612E6D ^ 0x6742F967)).dhbs_2(Float.intBitsToFloat(-1143842969 - 2116976733)).rkh_3(Float.intBitsToFloat(-1971375450 - 1322998684)).ssd_5(Float.intBitsToFloat(615469780 + 407269307));
    private final tay bghd_2 = new tay((hy)this, "Size", this::dhdth).shth_7(Float.intBitsToFloat(Integer.reverse(2089924722) ^ 0x73D145F3)).dhbs_2(Float.intBitsToFloat(0xFFA0F0D ^ 0x4FBA0F0D)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x1BD5F1E5 ^ 0x2F22C2D6, 6))).ssd_5(2.0f);
    private final tay jtb_2 = new tay((hy)this, "Life Time", this::dtb_3).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(1403364448) ^ 0x47D5A5CA)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(1180047181 + -87430989));
    private final tay jghgh = new tay((hy)this, "Spawn Dur", this::tzgh_3).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0x87566DA3 ^ 0xC6A66DA3)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xAA6F2CC3 ^ 0xEAAF2CC3));
    private final tay yh_2 = new tay((hy)this, "Dying Dur", this::zshs_4).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0x1B540B0D ^ 0x5AA40B0D)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xA7541EB7 ^ 0xE7D41EB7));
    private final List khtgh_2 = new ArrayList();
    private int sjgh_2;
    private long shhf_2;
    private int bha;
    private boolean rmm;
    private final bql<trb> hsd_3 = this::bqy;
    private final bql<shw_3> thqt = this::shhd;
    private static final int zaw = -2045827420;
    private static final int khsr_2 = -227169343;
    private static final int tr = 259337844;
    private static final int hnt = 985275735;
    private static final int fadh5ck0 = 2116829158;
    private static final int lan8b3puon = 1368762953;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qhskbqq7054;

    private class_243 bhs(class_243 class_2432) {
        int n = 1689437739;
        n = Integer.rotateLeft(n * 1175884583, 7) ^ 0x45FE1962;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xD5612416;
        if ((n2 ^ n) != -715054058) {
            int cfr_ignored_0 = (0xB1D3E23D ^ n) - -464535286;
        }
        class_2338 class_23382 = ka_2.swb(class_2432.field_1352, class_2432.field_1351 - Double.longBitsToDouble(0xA6C21B5AD1A0FB2BL ^ 0x996B82C3483962B1L), class_2432.field_1350);
        class_2680 class_26802 = ka_2.lt_2(ka_2.mc.field_1687, class_23382);
        class_265 class_2652 = class_26802.method_26220((class_1922)ka_2.mc.field_1687, class_23382);
        double d = class_2432.field_1351 + ka_2.trz_4(0xAD44ED98AC2138B2L ^ 0x92C09779EB8F2CC9L);
        if (!class_2652.method_1110()) {
            d = (double)ka_2.hdj_2(class_23382) + class_2652.method_1105(class_2350.class_2351.field_11052) + ka_2.shths(0xF4329A88CCBE4E6BL ^ 0xCBB6E0698B105A10L);
        } else if (class_26802.method_27852(class_2246.field_10477) || ka_2.thha_2(class_26802, class_2246.field_10114)) {
            d += ka_2.zhgh_3(0x8A9F1DBACB0D090EL ^ 0xB55EF63FD5B558E2L);
        }
        return new class_243(class_2432.field_1352, d, class_2432.field_1350);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void shhd(shw_3 shw2) {
        if (this.khtgh_2.isEmpty() || ka_2.mc.field_1724 == null || ka_2.mc.field_1687 == null) {
            return;
        }
        this.shhf_2 = System.currentTimeMillis();
        Iterator iterator = this.khtgh_2.iterator();
        while (iterator.hasNext()) {
            if (!(((tdkh)iterator.next()).ght(this.shhf_2) >= 1.0f)) continue;
            iterator.remove();
        }
        if (this.khtgh_2.isEmpty()) {
            return;
        }
        this.bha = bhj_2.ths().rk();
        RenderSystem.enableBlend();
        if (this.shrt_2()) {
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
        } else {
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.enableDepthTest();
        }
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        try {
            class_243 class_2432 = ka_2.mc.field_1773.method_19418().method_19326();
            for (tdkh tdkh2 : this.khtgh_2) {
                this.bha_2(shw2.ssha_2(), tdkh2, class_2432);
            }
            this.rmm = false;
        }
        catch (RuntimeException runtimeException) {
            if (!this.rmm) {
                Moondlc.dhrn.error("Failed to render Jump Circles", (Throwable)runtimeException);
                this.rmm = true;
            }
        }
        finally {
            RenderSystem.depthMask((boolean)true);
            RenderSystem.enableDepthTest();
            RenderSystem.enableCull();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    private void bha_2(class_4587 class_45872, tdkh tdkh2, class_243 class_2432) {
        float f;
        if (this.shrt_2()) {
            this.srs_3(class_45872, tdkh2, class_2432);
            return;
        }
        if (this.tskh_2.shghkh()) {
            this.zzw_2(class_45872, tdkh2, class_2432);
            return;
        }
        float f2 = tdkh2.ght(this.shhf_2);
        float f3 = 1.0f - f2;
        float f4 = ka_2.khzs_2(f2);
        float f5 = ka_2.shz_2(f4);
        if (f3 < 0.5f) {
            f5 *= ka_2.thqb(f5);
        }
        if ((f = (f3 > 0.5f ? ka_2.zzz_4(f4 * f4) : ka_2.tghb(f4)) * this.dtw_2.thw_5()) <= 0.001f || f5 <= 0.001f) {
            return;
        }
        float f6 = ka_2.dsgh(f4) * 90.0f / (1.0f + f4);
        class_2960 class_29602 = this.hsd_2(tdkh2.hth_5, f3);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        class_45872.method_22903();
        class_45872.method_22904(tdkh2.khaj_2.field_1352 - class_2432.field_1352, tdkh2.khaj_2.field_1351 - class_2432.field_1351, tdkh2.khaj_2.field_1350 - class_2432.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(f6));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f7 = f * 0.5f;
        int n = tdkh2.hth_5 * 30;
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, -f7, 0.0f, -f7).method_22913(0.0f, 0.0f).method_39415(this.shzq_2(n, f5));
        class_2872.method_22918(matrix4f, -f7, 0.0f, f7).method_22913(0.0f, 1.0f).method_39415(this.shzq_2(n + 324, f5));
        class_2872.method_22918(matrix4f, f7, 0.0f, f7).method_22913(1.0f, 1.0f).method_39415(this.shzq_2(n + 648, f5));
        class_2872.method_22918(matrix4f, f7, 0.0f, -f7).method_22913(1.0f, 0.0f).method_39415(this.shzq_2(n + 972, f5));
        class_286.method_43433((class_9801)class_2872.method_60800());
        if (this.dhh.shzl()) {
            this.dhtm(matrix4f, f7, n, f5);
        }
        class_45872.method_22909();
    }

    private void zzw_2(class_4587 class_45872, tdkh tdkh2, class_243 class_2432) {
        float f = tdkh2.ght(this.shhf_2);
        float f2 = ka_2.tghb(class_3532.method_15363((float)((float)(this.shhf_2 - tdkh2.khdhkh) / 700.0f), (float)0.0f, (float)1.0f));
        float f3 = f <= 0.55f ? 1.0f : 1.0f - (float)Math.pow(class_3532.method_15363((float)((f - 0.55f) / 0.45f), (float)0.0f, (float)1.0f), 3.0);
        float f4 = this.dtw_2.thw_5() * f2 * 0.5f;
        if (f4 <= 0.001f || f3 <= 0.001f) {
            return;
        }
        RenderSystem.setShaderTexture((int)0, (class_2960)khbgh);
        class_45872.method_22903();
        class_45872.method_22904(tdkh2.khaj_2.field_1352 - class_2432.field_1352, tdkh2.khaj_2.field_1351 - class_2432.field_1351, tdkh2.khaj_2.field_1350 - class_2432.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)(this.shhf_2 - tdkh2.khdhkh) * 0.018f));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        int n = tdkh2.hth_5 * 30;
        int n2 = Math.round(this.dhwa.thw_5());
        float f5 = this.khyh.thw_5();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (int i = 0; i < n2; ++i) {
            float f6 = (float)i / (float)n2;
            float f7 = f3 * (1.0f - f6) * 0.5f;
            if (f7 <= 0.003921569f) continue;
            float f8 = f4 * (1.0f + f6 * 0.08f);
            float f9 = (float)i * f5;
            class_2872.method_22918(matrix4f, -f8, f9, -f8).method_22913(0.0f, 0.0f).method_39415(this.shzq_2(n + 90, f7));
            class_2872.method_22918(matrix4f, -f8, f9, f8).method_22913(0.0f, 1.0f).method_39415(this.shzq_2(n + 360, f7));
            class_2872.method_22918(matrix4f, f8, f9, f8).method_22913(1.0f, 1.0f).method_39415(this.shzq_2(n + 630, f7));
            class_2872.method_22918(matrix4f, f8, f9, -f8).method_22913(1.0f, 0.0f).method_39415(this.shzq_2(n + 900, f7));
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        class_45872.method_22909();
    }

    private void srs_3(class_4587 class_45872, tdkh tdkh2, class_243 class_2432) {
        float f;
        float f2 = this.shhf_2 - tdkh2.khdhkh;
        if (f2 < tdkh2.khzm) {
            f = ka_2.shb_2(f2 / tdkh2.khzm);
        } else if (f2 < tdkh2.khzm + tdkh2.hsl) {
            f = 1.0f;
        } else {
            float f3 = (f2 - tdkh2.khzm - tdkh2.hsl) / tdkh2.bdt_3;
            f = 1.0f - ka_2.shb_2(class_3532.method_15363((float)f3, (float)0.0f, (float)1.0f));
        }
        if (f <= 0.001f) {
            return;
        }
        RenderSystem.setShaderTexture((int)0, (class_2960)(this.tlb.shghkh() ? bdh_2 : dhwq));
        class_45872.method_22903();
        class_45872.method_22904(tdkh2.khaj_2.field_1352 - class_2432.field_1352, tdkh2.khaj_2.field_1351 - class_2432.field_1351, tdkh2.khaj_2.field_1350 - class_2432.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(f2 * 0.1f));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f4 = this.bghd_2.thw_5() * f;
        int n = ka_2.zzd_3(this.bha, f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f4, 0.0f, -f4).method_22913(0.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, -f4, 0.0f, -f4).method_22913(1.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, -f4, 0.0f, f4).method_22913(1.0f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f4, 0.0f, f4).method_22913(0.0f, 0.0f).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
        class_45872.method_22909();
    }

    private void dhtm(Matrix4f matrix4f, float f, int n, float f2) {
        float f3 = this.tth_2();
        if (f3 <= 0.0f) {
            return;
        }
        int n2 = Math.max(2, Math.round(18.0f * f2));
        if (f2 * f3 * (1.0f - 1.0f / (float)n2) <= 0.003921569f) {
            return;
        }
        float f4 = f * f2 * 0.5f;
        float f5 = f / 6.0f;
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (int i = 1; i <= n2; ++i) {
            float f6 = (float)i / (float)n2;
            float f7 = class_3532.method_16439((float)f6, (float)(f2 * f3), (float)0.0f);
            if (f7 <= 0.003921569f) continue;
            float f8 = ka_2.shz_2(ka_2.khzs_2(class_3532.method_15363((float)(f6 - 1.5f / (float)n2), (float)0.0f, (float)1.0f))) * f5;
            float f9 = f + f8;
            float f10 = f4 * f6;
            class_2872.method_22918(matrix4f, -f9, f10, -f9).method_22913(0.0f, 0.0f).method_39415(ka_2.thsgh(this.shzq_2(n, f7)));
            class_2872.method_22918(matrix4f, -f9, f10, f9).method_22913(0.0f, 1.0f).method_39415(ka_2.thsgh(this.shzq_2(n + 324, f7)));
            class_2872.method_22918(matrix4f, f9, f10, f9).method_22913(1.0f, 1.0f).method_39415(ka_2.thsgh(this.shzq_2(n + 648, f7)));
            class_2872.method_22918(matrix4f, f9, f10, -f9).method_22913(1.0f, 0.0f).method_39415(ka_2.thsgh(this.shzq_2(n + 972, f7)));
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    /*
     * Unable to fully structure code
     */
    private float tth_2() {
        var1_1 = 0.0f;
        var4_2 = 0;
        var2_3 = 514605220;
        var2_3 = Integer.rotateLeft(var2_3 * -1978478077, 14) ^ 92197860;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 28);
        var3_4 = (int)((long)(759436686 * -569849339 + -1615730312 ^ var2_3) ^ -3648205444074320214L ^ -3648205444074320214L);
        while (true) {
            block81: {
                block76: {
                    block86: {
                        block67: {
                            block87: {
                                block80: {
                                    block65: {
                                        block66: {
                                            block74: {
                                                block73: {
                                                    block72: {
                                                        block78: {
                                                            block79: {
                                                                block84: {
                                                                    block82: {
                                                                        block83: {
                                                                            block75: {
                                                                                block70: {
                                                                                    block85: {
                                                                                        block69: {
                                                                                            block71: {
                                                                                                block77: {
                                                                                                    block68: {
                                                                                                        var4_2 = ((var3_4 ^ var2_3) - -1615730312) * 1962963661;
                                                                                                        switch (var4_2 & 15) {
                                                                                                            case 0: {
                                                                                                                if (var4_2 != -337341184) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block65;
                                                                                                            }
                                                                                                            case 1: {
                                                                                                                if (var4_2 != -1490193759) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block66;
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                if (var4_2 == -558835198) break block67;
                                                                                                                if (var4_2 != 1379502354) {
                                                                                                                    Integer.rotateLeft(860192748 ^ var2_3, 9) - 969415887;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block68;
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                if (var4_2 == -1392257053) break block69;
                                                                                                                if (var4_2 != -1229494429) {
                                                                                                                    Integer.rotateLeft(-565699488 ^ var2_3, 14) + -283570469;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block70;
                                                                                                            }
                                                                                                            case 4: {
                                                                                                                if (var4_2 != 704670372) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block71;
                                                                                                            }
                                                                                                            case 5: {
                                                                                                                if (var4_2 != -1664711339) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block72;
                                                                                                            }
                                                                                                            case 6: {
                                                                                                                if (var4_2 != -1617381274) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block73;
                                                                                                            }
                                                                                                            case 7: {
                                                                                                                if (var4_2 == -657665113) break block74;
                                                                                                                if (var4_2 == 1905150007) break block75;
                                                                                                                (Integer.rotateLeft(237382140 ^ var2_3, 4) - -1157843777) * 237382141;
                                                                                                                if (var4_2 != 1516368615) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block76;
                                                                                                            }
                                                                                                            case 8: {
                                                                                                                if (var4_2 != 1982649512) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block77;
                                                                                                            }
                                                                                                            case 9: {
                                                                                                                if (var4_2 == -1575253143) break block78;
                                                                                                                if (var4_2 != 437335401) {
                                                                                                                    (Integer.rotateLeft(1293352280 ^ var2_3, 12) + 1512459491) * 1293352281;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block79;
                                                                                                            }
                                                                                                            case 10: {
                                                                                                                if (var4_2 == 104417866) break block80;
                                                                                                                if (var4_2 == 31130330) break block81;
                                                                                                                if (var4_2 != 1535662362) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block82;
                                                                                                            }
                                                                                                            case 11: {
                                                                                                                if (var4_2 == 2100587051) break block83;
                                                                                                                if (var4_2 != -1209893) {
                                                                                                                    (Integer.rotateLeft(1433134520 ^ var2_3, 13) + 1550741635) * 1433134521;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block84;
                                                                                                            }
                                                                                                            case 12: {
                                                                                                                if (var4_2 == 83045484) break block85;
                                                                                                                if (var4_2 != -1442789588) {
                                                                                                                    (Integer.rotateRight(467710714 ^ var2_3, 6) + 1687374721) * 467710715;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block86;
                                                                                                            }
                                                                                                            case 14: {
                                                                                                                if (var4_2 == 759436686) break;
                                                                                                                ** break;
                                                                                                            }
                                                                                                            case 15: {
                                                                                                                if (var4_2 != -14428017) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block87;
                                                                                                            }
                                                                                                        }
                                                                                                        (Integer.rotateLeft(16884024 ^ var2_3, 3) + 596649219) * 16884025;
                                                                                                        if (!yf.khdha_2()) {
                                                                                                            var3_4 = (int)((long)(-1436688992 * -569849339 + -1615730312 ^ var2_3) ^ -7698463599817273821L ^ -7698463599817273821L);
                                                                                                            (Integer.rotateLeft(-1827107147 ^ var2_3, 5) - -732502234) * -1827107147;
                                                                                                            (int)(5884551632268880719L ^ (long)var2_3 ^ -4872750648355385723L);
                                                                                                            var3_4 = 704670372 * -569849339 + -1615730312 ^ var2_3 ^ -759904393 ^ -759904393;
                                                                                                            var4_2 -= 3;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var3_4 = -54681908 * -569849339 + -1615730312 ^ var2_3;
                                                                                                        (Integer.rotateLeft(-1269644075 ^ var2_3, 9) - -631016186) * -1269644075;
                                                                                                        (int)(8565964036591905615L ^ (long)var2_3 ^ 2927483906250326033L);
                                                                                                        var3_4 = Integer.reverse(Integer.reverse(1535662362 * -569849339 + -1615730312 ^ var2_3));
                                                                                                        continue;
                                                                                                    }
                                                                                                    (Integer.rotateLeft(-443359535 ^ var2_3, 15) + -785999222) * -443359535;
                                                                                                    (int)(2819377526316788559L ^ (long)var2_3 ^ 2065044577608917905L);
                                                                                                    var1_1 = Float.intBitsToFloat(2077198091 - 1051439105);
                                                                                                    var3_4 = 238635948 * -569849339 + -1615730312 ^ var2_3;
                                                                                                    (Integer.rotateRight(98126326 ^ var2_3, 3) - -1179806715) * 98126327;
                                                                                                    var3_4 = Integer.reverse(Integer.reverse(31130330 * -569849339 + -1615730312 ^ var2_3));
                                                                                                    ++var4_2;
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateRight(-1245829909 ^ var2_3, 9) + 107222960;
                                                                                                var1_1 = ka_2.shan(Integer.rotateLeft(1275948597 ^ 1392616184, 1));
                                                                                                var3_4 = -1672334634 * -569849339 + -1615730312 ^ var2_3 ^ 1675724300 ^ 1675724300;
                                                                                                (Integer.rotateRight(-449589865 ^ var2_3, 15) - -979139452) * -449589865;
                                                                                                var3_4 = 31130330 * -569849339 + -1615730312 ^ var2_3;
                                                                                                var4_2 += 4;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateLeft(-671288695 ^ var2_3, 13) + 738131410;
                                                                                            (int)(1535266451812051791L ^ (long)var2_3 ^ 4906815942479677261L);
                                                                                            yf.athz_2();
                                                                                            throw null;
                                                                                        }
                                                                                        (Integer.rotateLeft(-738463279 ^ var2_3, 13) + -1344280694) * -738463279;
                                                                                        (int)(1245632239829838671L ^ (long)var2_3 ^ 4803233151050157891L);
                                                                                        if (!this.zs_4.shghkh()) {
                                                                                            try {
                                                                                                var4_2 += 4;
                                                                                                if ((1104412532261689649L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                    throw new NoSuchElementException();
                                                                                                }
                                                                                                var3_4 = (int)((long)(2100587051 * -569849339 + -1615730312 ^ var2_3) ^ 1663825279389493528L ^ 1663825279389493528L);
                                                                                            }
                                                                                            catch (NoSuchElementException v0) {
                                                                                                var3_4 = (int)((long)(2100587051 * -569849339 + -1615730312 ^ var2_3) ^ 5748552737461896960L ^ 5748552737461896960L);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            var4_2 += 5;
                                                                                            if ((-2479302153595902545L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            var3_4 = (int)((long)(1379502354 * -569849339 + -1615730312 ^ var2_3) ^ 8712214508551496469L ^ 8712214508551496469L);
                                                                                        }
                                                                                        catch (UnsupportedOperationException v1) {
                                                                                            var3_4 = 1379502354 * -569849339 + -1615730312 ^ var2_3 ^ -733666328 ^ -733666328;
                                                                                        }
                                                                                        var4_2 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(-1566700344 ^ var2_3, 7) + -1249825933;
                                                                                    var1_1 = Float.intBitsToFloat(ka_2.shya(-1436388638) ^ 2062389599);
                                                                                    try {
                                                                                        var4_2 -= 4;
                                                                                        if ((2602501813211136709L ^ (long)var2_3 | 1L) == 0L) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        var3_4 = 31130330 * -569849339 + -1615730312 ^ var2_3 ^ 1927253859 ^ 1927253859;
                                                                                    }
                                                                                    catch (IllegalStateException v2) {
                                                                                        var3_4 = (31130330 * -569849339 + -1615730312 ^ var2_3) + -527067597 - -527067597;
                                                                                    }
                                                                                    var4_2 += 2;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-1646016361 ^ var2_3, 6) - 586344836) * -1646016361;
                                                                                var1_1 = Float.intBitsToFloat(1026906834 - -1536507);
                                                                                (int)(-8377491504674127417L ^ (long)var2_3 ^ -6140294546683544917L);
                                                                                var3_4 = 31130330 * -569849339 + -1615730312 ^ var2_3 ^ -363899874 ^ -363899874;
                                                                                var4_2 -= 5;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateRight(-287014161 ^ var2_3, 16) - -234259924;
                                                                            var1_1 = Float.intBitsToFloat(1026906834 - -1536507);
                                                                            var3_4 = -1362807801 * -569849339 + -1615730312 ^ var2_3 ^ -663054840 ^ -663054840;
                                                                            (Integer.rotateRight(1571660991 ^ var2_3, 14) - 1550094940) * 1571660991;
                                                                            var3_4 = (int)((long)(31130330 * -569849339 + -1615730312 ^ var2_3) ^ 56233806551898554L ^ 56233806551898554L);
                                                                            var4_2 += 5;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(889907824 ^ var2_3, 9) + 1890583243) * 889907825;
                                                                        if (!this.jwy.shghkh()) {
                                                                            try {
                                                                                var4_2 -= 5;
                                                                                if ((1928239008041749433L ^ (long)var2_3 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                var3_4 = (int)((long)(1982649512 * -569849339 + -1615730312 ^ var2_3) ^ 7693175536077463377L ^ 7693175536077463377L);
                                                                            }
                                                                            catch (ArithmeticException v3) {
                                                                                var3_4 = 1982649512 * -569849339 + -1615730312 ^ var2_3 ^ -1238858920 ^ -1238858920;
                                                                            }
                                                                            var4_2 -= 4;
                                                                            continue;
                                                                        }
                                                                        (int)(-6973197493310834819L ^ (long)var2_3 ^ -8154240380991401051L);
                                                                        var3_4 = 1532512204 * -569849339 + -1615730312 ^ var2_3 ^ -641748062 ^ -641748062;
                                                                        (int)(5111673214408109025L ^ (long)var2_3 ^ 7068854721383309361L);
                                                                        var3_4 = Integer.reverse(Integer.reverse(83045484 * -569849339 + -1615730312 ^ var2_3));
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(1862491662 ^ var2_3, 16) - 1975911149;
                                                                    if (ka_2.hshq(this.thdk)) {
                                                                        (int)(-2677115751717857805L ^ (long)var2_3 ^ 1125904518844782688L);
                                                                        var3_4 = (int)((long)(254742663 * -569849339 + -1615730312 ^ var2_3) ^ -2059817790475426392L ^ -2059817790475426392L);
                                                                        (int)(128989598597784403L ^ (long)var2_3 ^ 8918891960060718661L);
                                                                        var3_4 = -1229494429 * -569849339 + -1615730312 ^ var2_3 ^ 1261932253 ^ 1261932253;
                                                                        var4_2 -= 2;
                                                                        continue;
                                                                    }
                                                                    var3_4 = (int)((long)(-1392257053 * -569849339 + -1615730312 ^ var2_3) ^ -801096898678590051L ^ -801096898678590051L);
                                                                    Integer.rotateRight(-1159173918 ^ var2_3, 10) + -1501408615;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(-1870157775 ^ var2_3, 5) + -2067071702) * -1870157775;
                                                                (int)(5923647534153395023L ^ (long)var2_3 ^ -1051446364531521093L);
                                                                var3_4 = Integer.reverse(Integer.reverse(-1382944300 * -569849339 + -1615730312 ^ var2_3));
                                                                (Integer.rotateLeft(1176738773 ^ var2_3, 11) - -2102559226) * 1176738773;
                                                                (int)(-8894268517863068849L ^ (long)var2_3 ^ -7592924823287192333L);
                                                                try {
                                                                    var4_2 -= 3;
                                                                    var3_4 = 759436686 * -569849339 + -1615730312 ^ var2_3 ^ 1940665879 ^ 1940665879;
                                                                }
                                                                catch (IllegalStateException v4) {
                                                                    var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + -1478350940 - -1478350940;
                                                                }
                                                                var4_2 += 5;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(1525515989 ^ var2_3, 14) - 119599878) * 1525515989;
                                                            (int)(-7467204679591204017L ^ (long)var2_3 ^ -6007657754452779665L);
                                                            var3_4 = Integer.reverse(Integer.reverse(66761948 * -569849339 + -1615730312 ^ var2_3));
                                                            (Integer.rotateLeft(-1324703243 ^ var2_3, 9) - 1957116902) * -1324703243;
                                                            (int)(8338432062412614479L ^ (long)var2_3 ^ -2098533277895144799L);
                                                            var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + 1048423091 - 1048423091;
                                                            var4_2 += 2;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(1829050871 ^ var2_3, 16) - 939246628) * 1829050871;
                                                        try {
                                                            var4_2 -= 4;
                                                            if ((-7748849602999660769L ^ (long)var2_3 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            var3_4 = Integer.reverse(Integer.reverse(759436686 * -569849339 + -1615730312 ^ var2_3));
                                                        }
                                                        catch (IllegalStateException v5) {
                                                            var3_4 = Integer.reverse(Integer.reverse(759436686 * -569849339 + -1615730312 ^ var2_3));
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(530849345 ^ var2_3, 6) + -650295014;
                                                    (int)(-2515629294549144753L ^ (long)var2_3 ^ -7095277064462788612L);
                                                    var3_4 = Integer.reverse(Integer.reverse(628309958 * -569849339 + -1615730312 ^ var2_3));
                                                    (Integer.rotateLeft(1538578896 ^ var2_3, 14) + 524549995) * 1538578897;
                                                    var3_4 = -547149401 * -569849339 + -1615730312 ^ var2_3 ^ 1924398849 ^ 1924398849;
                                                    Integer.rotateRight(763755782 ^ var2_3, 8) - -2020130059;
                                                    var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + -1153800754 - -1153800754;
                                                    continue;
                                                }
                                                Integer.rotateLeft(-1522977568 ^ var2_3, 7) + 105580123;
                                                var3_4 = (int)((long)(1719068774 * -569849339 + -1615730312 ^ var2_3) ^ 721054324307359414L ^ 721054324307359414L);
                                                (Integer.rotateRight(858319743 ^ var2_3, 9) - 911352732) * 858319743;
                                                try {
                                                    var4_2 += 4;
                                                    if ((2922046472445891267L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    var3_4 = (int)((long)(759436686 * -569849339 + -1615730312 ^ var2_3) ^ -649562334140487996L ^ -649562334140487996L);
                                                }
                                                catch (IllegalArgumentException v6) {
                                                    var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + -1960361653 - -1960361653;
                                                }
                                                var4_2 -= 2;
                                                continue;
                                            }
                                            (Integer.rotateRight(-37479013 ^ var2_3, 18) + -1088604928) * -37479013;
                                            var3_4 = Integer.reverse(Integer.reverse(-1543581644 * -569849339 + -1615730312 ^ var2_3));
                                            Integer.rotateLeft(-2100094484 ^ var2_3, 3) - -605175089;
                                            var3_4 = (int)((long)(759436686 * -569849339 + -1615730312 ^ var2_3) ^ 8517697431796110526L ^ 8517697431796110526L);
                                            var4_2 += 3;
                                            continue;
                                        }
                                        Integer.rotateRight(385062755 ^ var2_3, 5) + -874712008;
                                        var3_4 = (-707271319 * -569849339 + -1615730312 ^ var2_3) + -1830683789 - -1830683789;
                                        (Integer.rotateLeft(265198233 ^ var2_3, 4) + -295544894) * 265198233;
                                        (int)(-3639976519174657201L ^ (long)var2_3 ^ -7766313408940984535L);
                                        var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + -1337242468 - -1337242468;
                                        var4_2 += 4;
                                        continue;
                                    }
                                    Integer.rotateLeft(-153541600 ^ var2_3, 17) + -391577829;
                                    var3_4 = Integer.reverse(Integer.reverse(844653882 * -569849339 + -1615730312 ^ var2_3));
                                    Integer.rotateRight(-450010993 ^ var2_3, 15) - -992194420;
                                    var3_4 = -692866240 * -569849339 + -1615730312 ^ var2_3;
                                    (Integer.rotateLeft(817195409 ^ var2_3, 9) + -363501622) * 817195409;
                                    (int)(-1006616449477448881L ^ (long)var2_3 ^ 8225968867851651550L);
                                    var3_4 = (int)((long)(759436686 * -569849339 + -1615730312 ^ var2_3) ^ -3910087318397613591L ^ -3910087318397613591L);
                                    continue;
                                }
                                (Integer.rotateLeft(-376795848 ^ var2_3, 16) + 1277475075) * -376795847;
                                var3_4 = 961551767 * -569849339 + -1615730312 ^ var2_3;
                                Integer.rotateLeft(-1358280927 ^ var2_3, 8) + 916208698;
                                (int)(7906325452985527119L ^ (long)var2_3 ^ 3407117266565297824L);
                                try {
                                    var4_2 -= 2;
                                    var3_4 = (int)((long)(759436686 * -569849339 + -1615730312 ^ var2_3) ^ -3372743064879668124L ^ -3372743064879668124L);
                                }
                                catch (UnsupportedOperationException v7) {
                                    var3_4 = Integer.reverse(Integer.reverse(759436686 * -569849339 + -1615730312 ^ var2_3));
                                }
                                ++var4_2;
                                continue;
                            }
                            Integer.rotateRight(670026722 ^ var2_3, 7) + -630763623;
                            var3_4 = -897746863 * -569849339 + -1615730312 ^ var2_3 ^ -2076025025 ^ -2076025025;
                            Integer.rotateRight(-2023878590 ^ var2_3, 3) + 1757517625;
                            try {
                                var4_2 -= 2;
                                var3_4 = 759436686 * -569849339 + -1615730312 ^ var2_3;
                            }
                            catch (ArithmeticException v8) {
                                var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + -1982510484 - -1982510484;
                            }
                            var4_2 -= 5;
                            continue;
                        }
                        (Integer.rotateRight(575116467 ^ var2_3, 7) + 721985768) * 575116467;
                        var3_4 = Integer.reverse(Integer.reverse(-492465149 * -569849339 + -1615730312 ^ var2_3));
                        Integer.rotateRight(916218955 ^ var2_3, 9) + -1588738992;
                        try {
                            var3_4 = (int)((long)(759436686 * -569849339 + -1615730312 ^ var2_3) ^ -6200355013557594658L ^ -6200355013557594658L);
                        }
                        catch (ArithmeticException v9) {
                            var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + 879966794 - 879966794;
                        }
                        var4_2 -= 3;
                        continue;
                    }
                    (Integer.rotateLeft(-705534184 ^ var2_3, 13) + -323478749) * -705534183;
                    var3_4 = -1439111638 * -569849339 + -1615730312 ^ var2_3;
                    Integer.rotateRight(1293324738 ^ var2_3, 12) + 1511605689;
                    var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + 1992173003 - 1992173003;
                    Integer.rotateLeft(1386702180 ^ var2_3, 13) - 111339095;
                    var4_2 += 3;
                    continue;
                }
                (Integer.rotateRight(472426003 ^ var2_3, 6) + 1833548680) * 472426003;
                try {
                    var4_2 += 4;
                    if ((-8935069636197406393L ^ (long)var2_3 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var3_4 = Integer.reverse(Integer.reverse(759436686 * -569849339 + -1615730312 ^ var2_3));
                }
                catch (IllegalStateException v10) {
                    var3_4 = 759436686 * -569849339 + -1615730312 ^ var2_3;
                }
                var4_2 += 3;
                continue;
            }
            return var1_1;
lbl406:
            // 16 sources

            Integer.rotateRight(949792003 ^ var2_3, 10) + -547974504;
            var3_4 = (759436686 * -569849339 + -1615730312 ^ var2_3) + -806565906 - -806565906;
        }
    }

    private class_2960 hsd_2(int n, float f) {
        int n2 = 1125054727;
        n2 = Integer.rotateLeft(n2 * -684837909, 24) ^ 0x9FE7F90C;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 20);
        n2 = Float.floatToIntBits(f) ^ n2;
        int n3 = n2 ^ 0x51AC7164;
        if ((n3 ^ n2) != 1370255716) {
            int cfr_ignored_0 = (0x12A28863 ^ n2) - -1213476011;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (ka_2.aaj(this.jwy)) {
            int n4 = (int)((this.shhf_2 + (long)n * (0xAF61BCEB207EECC1L ^ 0xAF61BCEB207EECDFL)) % (0xC65BAF10DDCBF005L ^ 0xC65BAF10DDCBF5D9L) * (long)shr_3.length / (0x24BA89604DC72F69L ^ 0x24BA89604DC72AB5L));
            return shr_3[ka_2.afn(n4, 0, shr_3.length - 1)];
        }
        if (this.shthh_2.shghkh()) {
            float f2 = (f + Float.intBitsToFloat(Integer.rotateLeft(0xADDE5F51 ^ 0x9EED6B2F, 23))) % 1.0f;
            int n5 = Math.min((int)(f2 * ((float)sghd.length - Float.intBitsToFloat(ka_2.dths_3(1588212730) ^ 0x60CC557A))), sghd.length - 1);
            return sghd[ka_2.zlt_3(0, n5)];
        }
        return this.zs_4.shghkh() ? sqa : khbgh;
    }

    private int shzq_2(int n, float f) {
        int n2;
        block7: {
            int n3;
            int n4 = 226555726;
            n4 = Integer.rotateLeft(n4 * 2072498615, 27) ^ 0x5ED408ED;
            n4 = Float.floatToIntBits(f) ^ n4;
            int n5 = n4 ^ 0x687F15FB;
            if ((n5 ^ n4) != 1753159163) {
                int cfr_ignored_0 = (0x65FFE2B5 ^ n4) + -886154070;
            }
            if (ka_2.hn_2(this.khth_4)) {
                var4_5 = (float)(this.shhf_2 % (0x73FCA98E508C249BL ^ 0x73FCA98E508C2F23L)) / Float.intBitsToFloat(ka_2.zrkh_2(0x7445DF69 ^ 0x7445551E, 15)) + (float)n / Float.intBitsToFloat(-1999716936 - 1159380408);
                n3 = Integer.rotateLeft(0x560010F8 ^ 0x51F810F8, 5) | ka_2.tmth(var4_5 - (float)Math.floor(var4_5), Float.intBitsToFloat(Integer.reverse(218160053) ^ 0x92E3515C), 1.0f) & -97184059 - -113961274;
            } else if (this.thbq.shghkh()) {
                n3 = ka_2.sghk(this.dhtt_3).rk();
            } else if (this.zwn.shghkh()) {
                var4_5 = Float.intBitsToFloat(0x8F69B50C ^ 0xB069B50C) + Float.intBitsToFloat(0x3862C5A8 ^ 0x762C5A8) * (float)Math.sin((double)this.shhf_2 / Double.longBitsToDouble(0x91FD3D5583734040L ^ 0xD18FFD5583734040L) + (double)n * Double.longBitsToDouble(0xCCF17D46D33118F9L ^ 0xF356777BA392CFF3L));
                n3 = ka_2.dhd_6(ka_2.dghh(ka_2.hda(this.dhtt_3)), ka_2.thtth_2(ka_2.tft_3(this.tnkh)), var4_5);
            } else {
                n3 = this.bha;
            }
            n3 = ka_2.zdhsh(n3, -1, Float.intBitsToFloat(-714420688 + 1754608080));
            int n6 = ka_2.bbkh(Math.round((float)(n3 >>> -914853344 - -914853368) * class_3532.method_15363((float)f, (float)0.0f, (float)1.0f)), 0, 0x561A055E ^ 0x561A05A1);
            n2 = n6 << (Integer.reverse(-146652380) ^ 0x24C242F7) | n3 & (Integer.reverse(554439804) ^ 0x3ED7CF7B);
            if (ka_2.jtq() != 0) break block7;
            n2 = n2 ^ 0xC8A4;
        }
        return n2;
    }

    private boolean shrt_2() {
        try {
            int n = -854618259;
            n = Integer.rotateLeft(n * -296553251, 18) ^ 0xE11C764B;
            int n2 = n ^ 0xE27FCD70;
            if ((n2 ^ n) != -494940816) {
                int cfr_ignored_0 = (0x2F70421D ^ n) + -1809646617;
            }
            if ((0xD4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (ka_2.dhjt()) {
            throw null;
        }
        return this.tlb != null && this.shkhj != null && (this.tlb.shghkh() || this.shkhj.shghkh());
    }

    private static int zzd_3(int n, float f) {
        try {
            int n2 = -395239340;
            n2 = Integer.rotateLeft(n2 * -197222995, 6) ^ 0x93B37BE9;
            n2 = Float.floatToIntBits(f) ^ n2;
            int n3 = n2 ^ 0x3C6751F9;
            if ((n3 ^ n2) != 1013404153) {
                int cfr_ignored_0 = (0xD41671AD ^ n2) - 647370066;
            }
            if ((0x1C8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        int n4 = ka_2.akhs(Math.round((float)(n >>> (Integer.reverse(-1634879577) ^ 0xE5EDB161)) * ka_2.tqn_2(f, 0.0f, 1.0f)), 0, 0xE627B3C4 ^ 0xE627B33B);
        return n4 << (0x28710658 ^ 0x28710640) | n & (Integer.reverse(-134789608) ^ 0x189D1010);
    }

    private static int dhd_6(int n, int n2, float f) {
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 1865358136;
        n9 = Integer.rotateLeft(n9 * 352162591, 11) ^ 0x8262F36F;
        n9 = Integer.rotateRight(n2 ^ n9, 4);
        int n10 = Integer.reverse(Integer.reverse(n9 ^ 0x1B4400CA));
        block31: while (true) {
            switch (n10 ^ n9) {
                case 590758671: {
                    int cfr_ignored_0 = Integer.rotateRight(0x6B846046 ^ n9, 16) - 157632437;
                    f = ka_2.hjb(f, 0.0f, 1.0f);
                    n3 = ka_2.thth_5(ka_2.thda(f, n >>> -160718349 - -160718373, n2 >>> (0xCF01EAFD ^ 0xCF01EAE5)));
                    n4 = Math.round(class_3532.method_48781((float)f, (int)(n >> (0x345EB79B ^ 0x345EB78B) & (Integer.reverse(1093882379) ^ 0xD04ACC7D)), (int)(n2 >> 849267906 - 849267890 & Integer.rotateLeft(0x78BC059 ^ 0x78A3E59, 23))));
                    n5 = Math.round(class_3532.method_48781((float)f, (int)(n >> 258312289 - 258312281 & (0x5229AB3B ^ 0x5229ABC4)), (int)(n2 >> (0xEA8F4399 ^ 0xEA8F4391) & (Integer.reverse(-517681067) ^ 0xAA0B2478))));
                    n6 = Math.round(class_3532.method_48781((float)f, (int)(n & (Integer.reverse(1402975607) ^ 0xEEADF935)), (int)(n2 & Integer.rotateLeft(0x1EF7E21A ^ 0x1EF7FDFA, 27))));
                    n7 = n3 << (Integer.reverse(-1053312493) ^ 0xC85DEC9B) | n4 << -1468845886 + 1468845902 | n5 << 353019746 + -353019738 | n6;
                    try {
                        n8 += 2;
                        if ((0x349BB02FF57C0917L ^ (long)n9 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n10 = (n9 ^ 0x20B9D289) + -1350670256 - -1350670256;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n10 = (int)((long)(n9 ^ 0x20B9D289) ^ 0xD25B3BDE23CC260FL ^ 0xD25B3BDE23CC260FL);
                    }
                    continue block31;
                }
                case 457978996: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x56EC8AC ^ n9, 3) - -1396184049;
                    yf.athz_2();
                    throw null;
                }
                case 457441482: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0xE0682C58 ^ n9, 15) + 821755363) * -530043815;
                    if (!ka_2.khhn()) {
                        try {
                            n8 += 5;
                            n10 = (int)((long)(n9 ^ 0x1B4C3474) ^ 0x95D4700EBF5D9091L ^ 0x95D4700EBF5D9091L);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n10 = n9 ^ 0x1B4C3474 ^ 0x6CDC16E8 ^ 0x6CDC16E8;
                        }
                        continue block31;
                    }
                    n10 = n9 ^ 0x2336430F;
                    --n8;
                    continue block31;
                }
                case 1967046933: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xB0DD4217 ^ n9, 9) - 1864933380) * -1327676905;
                    n10 = Integer.reverse(Integer.reverse(n9 ^ 0x4110BC70));
                    int cfr_ignored_4 = Integer.rotateRight(0x7BF0EAEA ^ n9, 18) + 109711761;
                    int cfr_ignored_5 = (int)(0x268197D76776201FL ^ (long)n9 ^ 0xD2DE025FBB19E0D2L);
                    n10 = n9 ^ 0x7D8BC0E3;
                    int cfr_ignored_6 = (int)(0xABDB086CF4786885L ^ (long)n9 ^ 0xEDA924432A2CFA67L);
                    n10 = n9 ^ 0x1B4400CA ^ 0x617926B1 ^ 0x617926B1;
                    n8 -= 4;
                    continue block31;
                }
                case -935723609: {
                    int cfr_ignored_7 = (Integer.rotateRight(0x56EB189F ^ n9, 13) - -1965712772) * 1458247839;
                    int cfr_ignored_8 = (int)(0x48251B3AC7394149L ^ (long)n9 ^ 0xCB0542C179B53D9BL);
                    n10 = n9 ^ 0x1B4400CA;
                    n8 -= 3;
                    continue block31;
                }
                case 1182306518: {
                    int cfr_ignored_9 = (Integer.rotateRight(0xD3173C76 ^ n9, 13) - -1808928379) * -753451913;
                    n10 = n9 ^ 0x17A81F22;
                    int cfr_ignored_10 = Integer.rotateRight(0xF86FBF8F ^ n9, 18) - 434491788;
                    try {
                        ++n8;
                        if ((0xE75D5C9D7949EE1FL ^ (long)n9 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n10 = n9 ^ 0x1B4400CA ^ 0x3BB83D25 ^ 0x3BB83D25;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n10 = (int)((long)(n9 ^ 0x1B4400CA) ^ 0xE81A00FC2BCFD0F4L ^ 0xE81A00FC2BCFD0F4L);
                    }
                    n8 += 5;
                    continue block31;
                }
                case 1188030504: {
                    int cfr_ignored_11 = Integer.rotateLeft(0xE2100FCC ^ n9, 15) - 1682933999;
                    n10 = (int)((long)(n9 ^ 0x978AC3DB) ^ 0x65D5E8EFBCF58631L ^ 0x65D5E8EFBCF58631L);
                    int cfr_ignored_12 = Integer.rotateRight(0xFA20F903 ^ n9, 18) + 1314637464;
                    n10 = Integer.reverse(Integer.reverse(n9 ^ 0x1B4400CA));
                    int cfr_ignored_13 = Integer.rotateLeft(0xBE1D9C01 ^ n9, 10) + 166953818;
                    int cfr_ignored_14 = (int)(0x7CAF323C27D4EB4FL ^ (long)n9 ^ 0x9908831A2DB9548FL);
                    n8 += 2;
                    continue block31;
                }
                case 2017572230: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0x20F76471 ^ n9, 7) + 38979818) * 553084017;
                    int cfr_ignored_16 = (int)(0xE245CA4C27D4EB4FL ^ (long)n9 ^ 0x69E8831A2DB8695AL);
                    n10 = Integer.reverse(Integer.reverse(n9 ^ 0xAF388ABE));
                    int cfr_ignored_17 = (Integer.rotateRight(0x2D184ABE ^ n9, 8) - 2051976253) * 756566719;
                    try {
                        n8 -= 4;
                        if ((0x693F94E3505DA841L ^ (long)n9 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n10 = (n9 ^ 0x1B4400CA) + 1126315752 - 1126315752;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n10 = (int)((long)(n9 ^ 0x1B4400CA) ^ 0x5B1EC5543DA1A8A9L ^ 0x5B1EC5543DA1A8A9L);
                    }
                    continue block31;
                }
                case 889841936: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0xC49EAE94 ^ n9, 11) - -745225433) * -996233579;
                    try {
                        n10 = Integer.reverse(Integer.reverse(n9 ^ 0x1B4400CA));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n10 = (int)((long)(n9 ^ 0x1B4400CA) ^ 0x30C5162A8FB1D9A7L ^ 0x30C5162A8FB1D9A7L);
                    }
                    n8 += 3;
                    continue block31;
                }
                case -405441331: {
                    int cfr_ignored_19 = (Integer.rotateRight(0xDBE6FEFE ^ n9, 14) - -1521057795) * -605618433;
                    n10 = (n9 ^ 0x2A1D5171) + -927989764 - -927989764;
                    int cfr_ignored_20 = (Integer.rotateLeft(0xF981B50 ^ n9, 4) + -406262293) * 261626705;
                    int cfr_ignored_21 = (int)(0x716EE5F33FD97196L ^ (long)n9 ^ 0x3696B301180B4F0CL);
                    n10 = n9 ^ 0x1B4400CA;
                    continue block31;
                }
                case 1454437049: {
                    int cfr_ignored_22 = Integer.rotateRight(0x288C0AC3 ^ n9, 8) + -313332520;
                    n10 = (int)((long)(n9 ^ 0x1F77E8EF) ^ 0x1C7E72A08FF954FEL ^ 0x1C7E72A08FF954FEL);
                    int cfr_ignored_23 = Integer.rotateLeft(0xE7BB5B64 ^ n9, 15) - 336441431;
                    n10 = Integer.reverse(Integer.reverse(n9 ^ 0x50FC8687));
                    int cfr_ignored_24 = Integer.rotateRight(0x76DDBBEE ^ n9, 17) - 1765237005;
                    n10 = Integer.reverse(Integer.reverse(n9 ^ 0x1B4400CA));
                    n8 += 2;
                    continue block31;
                }
                case -235131285: {
                    int cfr_ignored_25 = Integer.rotateRight(0x7037F927 ^ n9, 17) - -1692087564;
                    try {
                        --n8;
                        if ((0x34617C5379D9A2D1L ^ (long)n9 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n10 = (int)((long)(n9 ^ 0x1B4400CA) ^ 0x6D7135D797FAB12L ^ 0x6D7135D797FAB12L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n10 = n9 ^ 0x1B4400CA ^ 0x3F67BF37 ^ 0x3F67BF37;
                    }
                    ++n8;
                    continue block31;
                }
                case -1744660786: {
                    int cfr_ignored_26 = (Integer.rotateRight(0x97559E ^ n9, 3) - 380697949) * 9917855;
                    n10 = (int)((long)(n9 ^ 0x4967EE90) ^ 0x45B02A80D1D0B949L ^ 0x45B02A80D1D0B949L);
                    int cfr_ignored_27 = (Integer.rotateRight(0x1F0F8D96 ^ n9, 6) - -952122267) * 521112983;
                    try {
                        n8 += 3;
                        if ((0xEDC4F2DAAA6B32A1L ^ (long)n9 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n10 = Integer.reverse(Integer.reverse(n9 ^ 0x1B4400CA));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n10 = n9 ^ 0x1B4400CA;
                    }
                    n8 += 4;
                    continue block31;
                }
                case -907227585: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0xEA304738 ^ n9, 16) + 1614167811) * -365934791;
                    n10 = (int)((long)(n9 ^ 0xB6D0B668) ^ 0x557F19F5E3CB2C8BL ^ 0x557F19F5E3CB2C8BL);
                    int cfr_ignored_29 = (Integer.rotateRight(0x965056B6 ^ n9, 5) - 941104965) * -1773119817;
                    n10 = n9 ^ 0x1B4400CA ^ 0xF3C96F40 ^ 0xF3C96F40;
                    continue block31;
                }
                case 549048969: {
                    return n7;
                }
            }
            int cfr_ignored_30 = (Integer.rotateLeft(0xD04698B0 ^ n9, 13) + 1021975691) * -800679759;
            n10 = (n9 ^ 0x1B4400CA) + 772709413 - 772709413;
        }
    }

    private static int thsgh(int n) {
        try {
            int n2 = -2125182940;
            n2 = Integer.rotateLeft(n2 * -2024144641, 3) ^ 0xB2088D86;
            n2 = n ^ n2;
            int n3 = n2 ^ 0xCDC2CFCA;
            if ((n3 ^ n2) != -842870838) {
                int cfr_ignored_0 = (0x4C9687EE ^ n2) + 557219276;
            }
            if ((0x374 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        int n4 = n >>> (0xD5FB3DF3 ^ 0xD5FB3DEB);
        int n5 = Math.round((float)(n >> (0xD8E0D990 ^ 0xD8E0D980) & -649149972 + 649150227) * Float.intBitsToFloat(Integer.rotateLeft(0x24546425 ^ 0x80AE5955, 6)));
        int n6 = Math.round((float)(n >> 2136892788 - 2136892780 & (0xD27203A7 ^ 0xD2720358)) * Float.intBitsToFloat(Integer.reverse(1088992431) ^ 0xCBA24B2B));
        int n7 = Math.round((float)(n & 567844226 - 567843971) * Float.intBitsToFloat(1290303514 - 240720881));
        return n4 << -312291494 - -312291518 | n5 << (Integer.reverse(-174281244) ^ 0x27B539BF) | n6 << (Integer.reverse(-924498037) ^ 0xD1E2A71B) | n7;
    }

    private static float khzs_2(float f) {
        int n = -369566212;
        int n2 = (n = Integer.rotateLeft(n * 926905121, 3) ^ 0x4FCE966D) ^ 0x3AC4CEC4;
        if ((n2 ^ n) != 985976516) {
            int cfr_ignored_0 = (0xD33C1338 ^ n) - -951713687;
        }
        return (f > Float.intBitsToFloat(0x28665E22 ^ 0x17665E22) ? 1.0f - f : f) * 2.0f;
    }

    private static float shb_2(float f) {
        try {
            int n = -594302540;
            n = Integer.rotateLeft(n * 1822990039, 23) ^ 0x48C25409;
            int n2 = n ^ 0x27B1390E;
            if ((n2 ^ n) != 665925902) {
                int cfr_ignored_0 = (0xFB2290BA ^ n) + -1396672752;
            }
            if ((0x232 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return (float)Math.sin((double)class_3532.method_15363((float)f, (float)0.0f, (float)1.0f) * Double.longBitsToDouble(0x2AD16D9C195C1DD4L ^ 0x6AD84C674D1830CCL) * Double.longBitsToDouble(0xE2E76E4E8B863905L ^ 0xDD076E4E8B863905L));
    }

    private static float shz_2(float f) {
        try {
            int n = 1282875822;
            n = Integer.rotateLeft(n * 231715561, 18) ^ 0xD831F48F;
            int n2 = n ^ 0xD6458EA4;
            if ((n2 ^ n) != -700084572) {
                int cfr_ignored_0 = (0x9A32AF0A ^ n) - 1878465818;
            }
            if ((0x375 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return (float)Math.sqrt(Math.max(0.0f, 1.0f - (f - 1.0f) * (f - 1.0f)));
    }

    private static float thqb(float f) {
        int n = khd_2.taa_7(1029726086);
        int n2 = n ^ 0xFBB0A22E;
        if ((n2 ^ n) != -72310226) {
            int cfr_ignored_0 = Integer.rotateLeft(0xC6D0FDA8 ^ n, 11) + 397170323;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f < Float.intBitsToFloat(Integer.rotateLeft(0x6445903A ^ 0x64459FFA, 18)) ? (float)Math.pow(Double.longBitsToDouble(0x1FC4857483891DBDL ^ 0x5FC4857483891DBDL), Float.intBitsToFloat(Integer.reverse(-1029050964) ^ 0x74179543) * f - Float.intBitsToFloat(Integer.rotateLeft(0x524C9D88 ^ 0x52CEDD88, 7))) * Float.intBitsToFloat(-837499515 - -1894464123) : (2.0f - (float)Math.pow(Double.longBitsToDouble(0x1BD2D850C9FEC542L ^ 0x5BD2D850C9FEC542L), Float.intBitsToFloat(Integer.reverse(-1588217567) ^ 0x453DAA85) * f + Float.intBitsToFloat(0x1DE8A048 ^ 0x5CC8A048))) * Float.intBitsToFloat(Integer.reverse(-1035703533) ^ 0xF7D62243);
    }

    private static float zzz_4(float f) {
        float f2 = 0.0f;
        int n = 0;
        int n2 = 453903669;
        n2 = Integer.rotateLeft(n2 * 137194455, 28) ^ 0xF7AEBE98;
        int n3 = n2 - 67512638;
        block49: while (true) {
            switch (n2 - n3) {
                case -1717411496: {
                    int cfr_ignored_0 = Integer.rotateRight(0x30937386 ^ n2, 9) - -432497547;
                    f2 = 0.0f;
                    n3 = n2 - 2084947435 ^ 0x7DC7B970 ^ 0x7DC7B970;
                    int cfr_ignored_1 = Integer.rotateRight(0xB7B2016F ^ n2, 9) - 1122749356;
                    n3 = (int)((long)(n2 - -979438995) ^ 0x508FBF015F002803L ^ 0x508FBF015F002803L);
                    n += 2;
                    continue block49;
                }
                case -2069057011: {
                    int cfr_ignored_2 = Integer.rotateRight(0x6F69306E ^ n2, 16) - -2112193395;
                    f2 = 1.0f;
                    try {
                        --n;
                        if ((0xA0A9CB6D7C6BCD09L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 - -979438995 + -2139954919 - -2139954919;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - -979438995;
                    }
                    n -= 3;
                    continue block49;
                }
                case 935525563: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x4617E764 ^ n2, 11) - -2126338985;
                    if (f <= 0.0f) {
                        int cfr_ignored_4 = (int)(0x2093721C350EED2BL ^ (long)n2 ^ 0x1948A6AE2171ECF7L);
                        n3 = n2 - -1717411496 + 898021489 - 898021489;
                        n += 4;
                        continue block49;
                    }
                    n3 = n2 - 569096362 + -596883954 - -596883954;
                    int cfr_ignored_5 = Integer.rotateRight(0xDC963FA2 ^ n2, 14) + -1165012007;
                    n3 = n2 - -1932063909 ^ 0xC54E04D4 ^ 0xC54E04D4;
                    continue block49;
                }
                case -430664606: {
                    int cfr_ignored_6 = Integer.rotateLeft(0x9562540C ^ n2, 5) - 457559215;
                    f2 = (float)(Math.pow(Double.longBitsToDouble(0x518FE5AB9D549CE7L ^ 0x118FE5AB9D549CE7L), Float.intBitsToFloat(0xADA0395C ^ 0x6C80395C) * f) * Math.sin((double)(f * Float.intBitsToFloat(-163468142 + 1256084334) - Float.intBitsToFloat(Integer.reverse(973194476) ^ 0x863805C)) * Double.longBitsToDouble(0xC1505195925BF678L ^ 0x815090C7AA76851DL)) + 1.0);
                    int cfr_ignored_7 = (int)(0xA5C4996C0C3398C7L ^ (long)n2 ^ 0xCFA8D4D4CAA8E658L);
                    n3 = Integer.reverse(Integer.reverse(n2 - 1023689298));
                    int cfr_ignored_8 = (int)(0x10B4A4313F8A9FE3L ^ (long)n2 ^ 0xB512B3A6C4E18CB8L);
                    n3 = n2 - -979438995;
                    n -= 4;
                    continue block49;
                }
                case -1932063909: {
                    int cfr_ignored_9 = Integer.rotateRight(0x7566522 ^ n2, 3) + -405545383;
                    if (!(f >= 1.0f)) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 660592520));
                        int cfr_ignored_10 = (Integer.rotateLeft(0x7275FA70 ^ n2, 17) + -525929781) * 1920334449;
                        n3 = Integer.reverse(Integer.reverse(n2 - -430664606));
                        ++n;
                        continue block49;
                    }
                    int cfr_ignored_11 = (int)(0xF7CE1D2789C6E51EL ^ (long)n2 ^ 0xC73FDF3E311A424DL);
                    n3 = n2 - -2069057011 + -1523146558 - -1523146558;
                    continue block49;
                }
                case -1961682390: {
                    int cfr_ignored_12 = Integer.rotateRight(0x77185AA3 ^ n2, 17) + 1884330232;
                    if (!(f >= 1.0f)) {
                        try {
                            if ((0x1C5510F40414E1EFL ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = Integer.reverse(Integer.reverse(n2 - -430664606));
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = n2 - -430664606 + 794526666 - 794526666;
                        }
                        ++n;
                        continue block49;
                    }
                    try {
                        --n;
                        if ((0xCAD6858B6C1F57D7L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - -2069057011));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(n2 - -2069057011) ^ 0xCC1553A4A357048BL ^ 0xCC1553A4A357048BL);
                    }
                    n += 5;
                    continue block49;
                }
                case 67512638: {
                    int cfr_ignored_13 = Integer.rotateRight(0xC5B01642 ^ n2, 11) + -189771463;
                    if (yf.khdha_2()) {
                        n3 = n2 - -967905034 ^ 0x3553FEF5 ^ 0x3553FEF5;
                        int cfr_ignored_14 = (Integer.rotateLeft(0xA5461079 ^ n2, 7) + 131702242) * -1522134919;
                        int cfr_ignored_15 = (int)(0x67F4BE4427D4EB4FL ^ (long)n2 ^ 0x81F8831A2DB96238L);
                        n3 = Integer.reverse(Integer.reverse(n2 - 935525563));
                        --n;
                        continue block49;
                    }
                    try {
                        --n;
                        n3 = n2 - 69869693 ^ 0xF5C93CA7 ^ 0xF5C93CA7;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - 69869693 + -1094676032 - -1094676032;
                    }
                    n += 5;
                    continue block49;
                }
                case 69869693: {
                    int cfr_ignored_16 = Integer.rotateRight(0x116CF84F ^ n2, 5) - 546287820;
                    yf.athz_2();
                    try {
                        n += 5;
                        if ((0xBF6831E5AB5E219DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 - 935525563;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - 935525563 + 160971998 - 160971998;
                    }
                    n -= 3;
                    continue block49;
                }
                case -2094323980: {
                    int cfr_ignored_17 = Integer.rotateLeft(0x859B4A80 ^ n2, 3) + 841721019;
                    n3 = n2 - 714709029 + -1533881736 - -1533881736;
                    int cfr_ignored_18 = (Integer.rotateRight(0xA51DF13F ^ n2, 7) - 50189788) * -1524764353;
                    try {
                        n += 2;
                        n3 = n2 - 67512638 ^ 0xCB3826B2 ^ 0xCB3826B2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 67512638 + -1212105018 - -1212105018;
                    }
                    n += 4;
                    continue block49;
                }
                case 1735370687: {
                    int cfr_ignored_19 = Integer.rotateLeft(0xF718BCC1 ^ n2, 17) + -262374758;
                    int cfr_ignored_20 = (int)(0x35AA12FC27D4EB4FL ^ (long)n2 ^ 0xD888831A2DB9C685L);
                    n3 = n2 - 67512638 + -1594029283 - -1594029283;
                    int cfr_ignored_21 = Integer.rotateLeft(0x2EEC13A4 ^ n2, 8) - -1292632041;
                    n += 3;
                    continue block49;
                }
                case 1493992373: {
                    int cfr_ignored_22 = Integer.rotateLeft(0xA4B39EA4 ^ n2, 7) - -165817065;
                    n3 = n2 - 67512638 ^ 0x776A829D ^ 0x776A829D;
                    int cfr_ignored_23 = (Integer.rotateLeft(0xC1C40B54 ^ n2, 11) - 2065366631) * -1044116651;
                    n -= 2;
                    continue block49;
                }
                case -1800686701: {
                    int cfr_ignored_24 = Integer.rotateLeft(0x46D2ABC9 ^ n2, 11) + -1746899822;
                    int cfr_ignored_25 = (int)(0x846005F427D4EB4FL ^ (long)n2 ^ 0xF698831A2DB8A511L);
                    n3 = n2 - 67512638 + 488754961 - 488754961;
                    int cfr_ignored_26 = (Integer.rotateLeft(0xB3902474 ^ n2, 9) - -1026422457) * -1282399115;
                    n += 3;
                    continue block49;
                }
                case -1484715680: {
                    int cfr_ignored_27 = (Integer.rotateLeft(0x7D4E139D ^ n2, 18) - 819068734) * 2102268829;
                    int cfr_ignored_28 = (int)(0xBFFCBDA027D4EB4FL ^ (long)n2 ^ 0x8630831A2DB8D228L);
                    n3 = n2 - 67512638 + -1610784307 - -1610784307;
                    int cfr_ignored_29 = Integer.rotateLeft(0xE4DA3489 ^ n2, 15) + -1161167918;
                    int cfr_ignored_30 = (int)(0x26689AB427D4EB4FL ^ (long)n2 ^ 0xC818831A2DB9E100L);
                    n -= 2;
                    continue block49;
                }
                case 73523192: {
                    int cfr_ignored_31 = (Integer.rotateRight(0x7660216 ^ n2, 3) - -373825563) * 124125719;
                    n3 = (int)((long)(n2 - -1152787566) ^ 0x180D52758E17BCF8L ^ 0x180D52758E17BCF8L);
                    int cfr_ignored_32 = Integer.rotateLeft(0x44486069 ^ n2, 11) + 1226918898;
                    int cfr_ignored_33 = (int)(0x86FACE5427D4EB4FL ^ (long)n2 ^ 0x61D8831A2DB8A024L);
                    try {
                        ++n;
                        if ((0x7FFC0DCEBA5921FDL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 - 67512638 ^ 0x7BE9A91A ^ 0x7BE9A91A;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 67512638 ^ 0x52C6532C ^ 0x52C6532C;
                    }
                    n += 4;
                    continue block49;
                }
                case -1412753648: {
                    int cfr_ignored_34 = (Integer.rotateRight(0x3E87EB7A ^ n2, 10) + -1764547839) * 1049095035;
                    n3 = Integer.reverse(Integer.reverse(n2 - -979846673));
                    int cfr_ignored_35 = Integer.rotateLeft(0x688993CD ^ n2, 16) - -1392081650;
                    int cfr_ignored_36 = (int)(0xAA3B3DF027D4EB4FL ^ (long)n2 ^ 0x8690831A2DB8F9A7L);
                    try {
                        if ((0x829FC9FB02E07025L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 67512638));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - 67512638;
                    }
                    n -= 3;
                    continue block49;
                }
                case 78269695: {
                    int cfr_ignored_37 = Integer.rotateLeft(0xC81D1C84 ^ n2, 12) - 1071911735;
                    int cfr_ignored_38 = (int)(0xAED8FA0DBAD9BD0L ^ (long)n2 ^ 0xE2317BE8CC87B80AL);
                    n3 = Integer.reverse(Integer.reverse(n2 - 67512638));
                    n -= 5;
                    continue block49;
                }
                case 597201254: {
                    int cfr_ignored_39 = (Integer.rotateRight(0x84A05D1B ^ n2, 3) + 331933056) * -2069865189;
                    n3 = n2 - 1754599820;
                    int cfr_ignored_40 = (Integer.rotateLeft(0x6CB25251 ^ n2, 16) + 771069706) * 1823625809;
                    int cfr_ignored_41 = (int)(0xAE00FC6C27D4EB4FL ^ (long)n2 ^ 0x5A8831A2DB8F1D0L);
                    try {
                        n -= 2;
                        if ((0x40B8FA1ECEA6BF6DL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 67512638 ^ 0x74A15B95 ^ 0x74A15B95;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 67512638));
                    }
                    --n;
                    continue block49;
                }
                case 1475148675: {
                    int cfr_ignored_42 = Integer.rotateLeft(0x26E49D6D ^ n2, 7) - -1173573778;
                    int cfr_ignored_43 = (int)(0xE456335027D4EB4FL ^ (long)n2 ^ 0x9BD0831A2DB8657DL);
                    try {
                        n -= 2;
                        if ((0x6D7056928FD18577L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 - 67512638 ^ 0x497DCE8F ^ 0x497DCE8F;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 67512638;
                    }
                    continue block49;
                }
                case -1349125536: {
                    int cfr_ignored_44 = (Integer.rotateLeft(0x74E8823D ^ n2, 17) - 746939550) * 1961394749;
                    int cfr_ignored_45 = (int)(0xB65A2C0027D4EB4FL ^ (long)n2 ^ 0xA570831A2DB8C165L);
                    n3 = (int)((long)(n2 - 1367915066) ^ 0x7F8CFDAFF024BC25L ^ 0x7F8CFDAFF024BC25L);
                    int cfr_ignored_46 = Integer.rotateRight(0xC578600E ^ n2, 11) - -302956307;
                    n3 = n2 - 67512638 ^ 0x1C8EDEF2 ^ 0x1C8EDEF2;
                    n -= 3;
                    continue block49;
                }
                case -1969527734: {
                    int cfr_ignored_47 = (Integer.rotateRight(0x3E8CEC73 ^ n2, 10) + -1754382040) * 1049422963;
                    n3 = n2 - -269847165 ^ 0x39A43FBE ^ 0x39A43FBE;
                    int cfr_ignored_48 = (Integer.rotateLeft(0x1B57B630 ^ n2, 6) + 1409068811) * 458733105;
                    try {
                        n += 3;
                        n3 = Integer.reverse(Integer.reverse(n2 - 67512638));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 67512638;
                    }
                    n += 2;
                    continue block49;
                }
                case 514886021: {
                    int cfr_ignored_49 = (Integer.rotateRight(0x26F007F7 ^ n2, 7) - -1150380508) * 653264887;
                    n3 = n2 - -1521799650;
                    int cfr_ignored_50 = Integer.rotateLeft(0xBF163A8C ^ n2, 10) - 672052783;
                    try {
                        if ((0x5437FBF4856FF329L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 - 67512638 + 1284543908 - 1284543908;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - 67512638 ^ 0xCAF81654 ^ 0xCAF81654;
                    }
                    continue block49;
                }
                case -1606410359: {
                    int cfr_ignored_51 = (Integer.rotateRight(0x7230F8DE ^ n2, 17) - -666123747) * 1915812063;
                    int cfr_ignored_52 = (int)(0xBB8CA221DB3E27ABL ^ (long)n2 ^ 0xB9337ACFB470DAC8L);
                    n3 = n2 - 67512638 ^ 0x698CE633 ^ 0x698CE633;
                    n -= 3;
                    continue block49;
                }
                case -979438995: {
                    return f2;
                }
            }
            int cfr_ignored_53 = Integer.rotateRight(0x5A0B9462 ^ n2, 14) + -339437799;
            n3 = Integer.reverse(Integer.reverse(n2 - 67512638));
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static float tghb(float var0) {
        var1_1 = 0.0f;
        var2_2 = 0.0f;
        var5_3 = 0;
        var3_4 = -1366673835;
        var3_4 = Integer.rotateLeft(var3_4 * -163386559, 8) ^ 2022937725;
        var3_4 = Float.floatToIntBits(var0) ^ var3_4;
        var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435 + 179553430 - 179553430;
        block30: while (true) {
            if ((var5_3 = var4_5 - -44742435 ^ -44742435 ^ var3_4) == 466929118) {
                return var2_2;
            }
            if (var5_3 == 960963335) ** GOTO lbl165
            switch (var5_3) {
                case 465253877: {
                    (Integer.rotateLeft(1429640856 ^ var3_4, 13) + 1442438051) * 1429640857;
                    var1_1 = var0 - 1.0f;
                    var2_2 = 1.0f + Float.intBitsToFloat(1499262360 + -422577896) * var1_1 * var1_1 * var1_1 + Float.intBitsToFloat(-1474408728 ^ -1748532344) * var1_1 * var1_1;
                    try {
                        var5_3 -= 5;
                        if ((-738038264223785139L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse((var3_4 ^ 466929118 ^ -44742435) + -44742435));
                    }
                    catch (IllegalStateException v0) {
                        var4_5 = (var3_4 ^ 466929118 ^ -44742435) + -44742435;
                    }
                    --var5_3;
                    continue block30;
                }
                case -1667034981: {
                    (Integer.rotateLeft(-848669355 ^ var3_4, 12) - -465701754) * -848669355;
                    (int)(1141938930301856591L ^ (long)var3_4 ^ 837813679150445152L);
                    if (!yf.khdha_2()) {
                        var4_5 = (var3_4 ^ -2038374417 ^ -44742435) + -44742435;
                        (Integer.rotateLeft(-1663453224 ^ var3_4, 6) + 45802083) * -1663453223;
                        var5_3 -= 5;
                        continue block30;
                    }
                    try {
                        --var5_3;
                        var4_5 = Integer.reverse(Integer.reverse((var3_4 ^ 465253877 ^ -44742435) + -44742435));
                    }
                    catch (NoSuchElementException v1) {
                        var4_5 = (var3_4 ^ 465253877 ^ -44742435) + -44742435;
                    }
                    var5_3 += 4;
                    continue block30;
                }
                case -1865443508: {
                    (Integer.rotateLeft(1285464272 ^ var3_4, 12) + 1267931243) * 1285464273;
                    var4_5 = (var3_4 ^ 337536743 ^ -44742435) + -44742435 + 1173936979 - 1173936979;
                    (Integer.rotateLeft(2051709592 ^ var3_4, 18) + -748267613) * 2051709593;
                    (int)(-2827368911764874854L ^ (long)var3_4 ^ -6298259645747028905L);
                    var4_5 = Integer.reverse(Integer.reverse((var3_4 ^ -820936190 ^ -44742435) + -44742435));
                    (int)(6646245631767794583L ^ (long)var3_4 ^ -7561425343382743639L);
                    var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435 ^ -674479704 ^ -674479704;
                    var5_3 -= 5;
                    continue block30;
                }
                case -79400850: {
                    (Integer.rotateRight(1891215922 ^ var3_4, 17) + -1428604087) * 1891215923;
                    var4_5 = Integer.reverse(Integer.reverse((var3_4 ^ -1824854382 ^ -44742435) + -44742435));
                    Integer.rotateLeft(-1052709627 ^ var3_4, 11) - 1798984406;
                    (int)(284363634943257423L ^ (long)var3_4 ^ 8863228215124666933L);
                    try {
                        if ((6125583693254006295L ^ (long)var3_4 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_5 = (int)((long)((var3_4 ^ -1667034981 ^ -44742435) + -44742435) ^ -3299458778365002561L ^ -3299458778365002561L);
                    }
                    catch (NoSuchElementException v2) {
                        var4_5 = Integer.reverse(Integer.reverse((var3_4 ^ -1667034981 ^ -44742435) + -44742435));
                    }
                    --var5_3;
                    continue block30;
                }
                case 1754774888: {
                    Integer.rotateRight(-1381124701 ^ var3_4, 8) + 208051704;
                    var4_5 = (var3_4 ^ 495452765 ^ -44742435) + -44742435;
                    (Integer.rotateLeft(-215058159 ^ var3_4, 17) + 1996376138) * -215058159;
                    (int)(3574968788872129359L ^ (long)var3_4 ^ 5992183452675985128L);
                    var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435;
                    continue block30;
                }
                case -1661716748: {
                    (Integer.rotateLeft(1031005628 ^ var3_4, 10) - 1969647871) * 1031005629;
                    try {
                        var5_3 += 2;
                        var4_5 = (int)((long)((var3_4 ^ -1667034981 ^ -44742435) + -44742435) ^ -4005824530417807204L ^ -4005824530417807204L);
                    }
                    catch (IllegalArgumentException v3) {
                        var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435 ^ 1078768720 ^ 1078768720;
                    }
                    continue block30;
                }
                case 1776802173: {
                    Integer.rotateLeft(-1744718460 ^ var3_4, 6) - 1821547063;
                    (int)(1846550425066186416L ^ (long)var3_4 ^ 8852053107648470673L);
                    var4_5 = Integer.reverse(Integer.reverse((var3_4 ^ -1667034981 ^ -44742435) + -44742435));
                    continue block30;
                }
                case 975044062: {
                    (Integer.rotateLeft(-1456477900 ^ var3_4, 8) - -2127897465) * -1456477899;
                    var4_5 = (var3_4 ^ -1780156019 ^ -44742435) + -44742435 + 1597626881 - 1597626881;
                    Integer.rotateRight(94366530 ^ var3_4, 3) + -1296360391;
                    try {
                        var5_3 -= 5;
                        if ((5806000969779541183L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435 + -1096341675 - -1096341675;
                    }
                    catch (IllegalStateException v4) {
                        var4_5 = (int)((long)((var3_4 ^ -1667034981 ^ -44742435) + -44742435) ^ -3835352598013791962L ^ -3835352598013791962L);
                    }
                    continue block30;
                }
                case 559698592: {
                    Integer.rotateLeft(846648904 ^ var3_4, 9) + 549556723;
                    try {
                        var5_3 -= 5;
                        var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435;
                    }
                    catch (IllegalArgumentException v5) {
                        var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435 + -1800732092 - -1800732092;
                    }
                    var5_3 += 5;
                    continue block30;
                }
                case -1105214133: {
                    (Integer.rotateRight(-1987336865 ^ var3_4, 4) - -1404656196) * -1987336865;
                    var4_5 = (var3_4 ^ 1451156639 ^ -44742435) + -44742435 ^ -150800317 ^ -150800317;
                    (Integer.rotateLeft(-813462160 ^ var3_4, 12) + 625721291) * -813462159;
                    try {
                        var5_3 -= 5;
                        if ((2188434656425482853L ^ (long)var3_4 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435 + -109466662 - -109466662;
                    }
                    catch (NoSuchElementException v6) {
                        var4_5 = Integer.reverse(Integer.reverse((var3_4 ^ -1667034981 ^ -44742435) + -44742435));
                    }
                    var5_3 -= 5;
                    continue block30;
                }
                case 2028915676: {
                    (Integer.rotateLeft(-223797871 ^ var3_4, 17) + 1725445066) * -223797871;
                    (int)(3466561890175740751L ^ (long)var3_4 ^ -7338471444340683290L);
                    var4_5 = (var3_4 ^ -160122390 ^ -44742435) + -44742435;
                    (Integer.rotateLeft(1685832092 ^ var3_4, 15) - 794431775) * 1685832093;
                    try {
                        var5_3 -= 4;
                        if ((-8101695722025261767L ^ (long)var3_4 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_5 = (int)((long)((var3_4 ^ -1667034981 ^ -44742435) + -44742435) ^ -6755404719996613752L ^ -6755404719996613752L);
                    }
                    catch (NoSuchElementException v7) {
                        var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435 ^ 1582565680 ^ 1582565680;
                    }
                    var5_3 -= 4;
                    continue block30;
                }
lbl165:
                // 1 sources

                (Integer.rotateLeft(-892614564 ^ var3_4, 12) - -1828003233) * -892614563;
                var4_5 = (var3_4 ^ -744645984 ^ -44742435) + -44742435 ^ -221098089 ^ -221098089;
                Integer.rotateLeft(1290402693 ^ var3_4, 12) - 1421022294;
                (int)(-8188857248012506289L ^ (long)var3_4 ^ 6197097235721269607L);
                (int)(-5737502854850641040L ^ (long)var3_4 ^ 7668048101286268177L);
                var4_5 = (int)((long)((var3_4 ^ 1174147895 ^ -44742435) + -44742435) ^ 6089332418874638020L ^ 6089332418874638020L);
                (int)(-7536997942868284450L ^ (long)var3_4 ^ -7643822105613925601L);
                var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435;
                continue block30;
                default: {
                    (Integer.rotateRight(-1469678185 ^ var3_4, 8) - 1757860996) * -1469678185;
                    var4_5 = (var3_4 ^ -1667034981 ^ -44742435) + -44742435 + -1390724195 - -1390724195;
                    continue block30;
                }
                case -2038374417: 
            }
            break;
        }
        (Integer.rotateLeft(-407823439 ^ var3_4, 15) + 315619754) * -407823439;
        (int)(2667175017901779791L ^ (long)var3_4 ^ -7608687421982906410L);
        yf.athz_2();
        throw null;
    }

    private static float dsgh(float f) {
        int n = 712204156;
        int n2 = (n = Integer.rotateLeft(n * -484190443, 23) ^ 0xB51DE28) ^ 0xFDD9832E;
        if ((n2 ^ n) != -36076754) {
            int cfr_ignored_0 = (0xD7AADC52 ^ n) - 839619749;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        double d = Double.longBitsToDouble(0xC6A2AECC8B80F18L ^ 0x339C7DF4825F4B9FL);
        return f < Float.intBitsToFloat(Integer.rotateLeft(0xF1102DD6 ^ 0xF10FADD6, 9)) ? (float)(-(Math.pow(Double.longBitsToDouble(0x11AA9D6E8987C150L ^ 0x51AA9D6E8987C150L), Float.intBitsToFloat(-1548886968 + -1645075528) * f - Float.intBitsToFloat(Integer.rotateLeft(0x47C74E00 ^ 0x47E7DE00, 9))) * Math.sin((double)(Float.intBitsToFloat(0x4AB0685E ^ 0xB10685E) * f - Float.intBitsToFloat(Integer.reverse(1812198660) ^ 0x619DC036)) * d)) * Double.longBitsToDouble(0x9387F408C052CFC9L ^ 0xAC67F408C052CFC9L)) : (float)(Math.pow(Double.longBitsToDouble(0x3614AB2C0CCF5DF5L ^ 0x7614AB2C0CCF5DF5L), Float.intBitsToFloat(Integer.reverse(146471163) ^ 0x1EBF5D10) * f + Float.intBitsToFloat(Integer.rotateLeft(0xD8C57F02 ^ 0xD8473F02, 7))) * Math.sin((double)(Float.intBitsToFloat(Integer.rotateLeft(0x33008257 ^ 0x3310EA57, 10)) * f - Float.intBitsToFloat(1427611871 - 333816031)) * d) * Double.longBitsToDouble(0x7650894C56C595E1L ^ 0x49B0894C56C595E1L) + 1.0);
    }

    private static class_2960 saz_6(String string) {
        int n = 0;
        int n2 = -2077637646;
        n2 = Integer.rotateLeft(n2 * 656854221, 3) ^ 0x28C6C75C;
        int n3 = 1295229496 * -373703921 + -1188394265 ^ n2 ^ 0x5ABA85A0 ^ 0x5ABA85A0;
        block32: while (true) {
            switch (((n3 ^ n2) - -1188394265) * 650367983) {
                case 1727449818: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xFED9213B ^ n2, 18) + -525818528) * -19324613;
                    throw null;
                }
                case 1310113216: {
                    int cfr_ignored_1 = Integer.rotateLeft(0xB5AE94E5 ^ n2, 9) - 75605750;
                    int cfr_ignored_2 = (int)(0x771C3AD827D4EB4FL ^ (long)n2 ^ 0x88C0831A2DB943E9L);
                    return class_2960.method_60655((String)"minecraft", (String)("vegaline/modules/jumpcircles/" + string));
                }
                case 1295229496: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0xEC309095 ^ n2, 16) - -1640029882) * -332361579;
                    int cfr_ignored_4 = (int)(0x2E823EA827D4EB4FL ^ (long)n2 ^ 0x8020831A2DB9F0D5L);
                    if (yf.dnkh()) {
                        try {
                            n -= 4;
                            if ((0xBC1AEAA60E3D48A9L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = 1727449818 * -373703921 + -1188394265 ^ n2 ^ 0xAB672F5F ^ 0xAB672F5F;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (1727449818 * -373703921 + -1188394265 ^ n2) + -1014492459 - -1014492459;
                        }
                        n += 3;
                        continue block32;
                    }
                    n3 = (1310113216 * -373703921 + -1188394265 ^ n2) + -1463129823 - -1463129823;
                    int cfr_ignored_5 = Integer.rotateRight(0x6B387E8A ^ n2, 16) + 3469809;
                    n -= 2;
                    continue block32;
                }
                case -1735191016: {
                    int cfr_ignored_6 = Integer.rotateLeft(0x50F4DCA0 ^ n2, 13) + -771467621;
                    n3 = -568355012 * -373703921 + -1188394265 ^ n2 ^ 0xF0F35FD2 ^ 0xF0F35FD2;
                    int cfr_ignored_7 = Integer.rotateRight(0x130927C7 ^ n2, 5) - 1383690324;
                    int cfr_ignored_8 = (int)(0x2161875484A22CA0L ^ (long)n2 ^ 0xF3D9C5F7A267EF12L);
                    n3 = Integer.reverse(Integer.reverse(-456397888 * -373703921 + -1188394265 ^ n2));
                    int cfr_ignored_9 = (int)(0x2062DFB19F148ED7L ^ (long)n2 ^ 0x4213F29AE689ED14L);
                    n3 = Integer.reverse(Integer.reverse(1295229496 * -373703921 + -1188394265 ^ n2));
                    n -= 5;
                    continue block32;
                }
                case -174207038: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0x989DCE75 ^ n2, 6) - 2138677094) * -1734488459;
                    int cfr_ignored_11 = (int)(0x5A2F604827D4EB4FL ^ (long)n2 ^ 0x3DE0831A2DB9198FL);
                    n3 = -1821746041 * -373703921 + -1188394265 ^ n2;
                    int cfr_ignored_12 = (Integer.rotateRight(0xB4C39393 ^ n2, 9) + -401834488) * -1262251117;
                    try {
                        --n;
                        n3 = (int)((long)(1295229496 * -373703921 + -1188394265 ^ n2) ^ 0x5CA6BEB02673DCA0L ^ 0x5CA6BEB02673DCA0L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = 1295229496 * -373703921 + -1188394265 ^ n2 ^ 0x2C904BA9 ^ 0x2C904BA9;
                    }
                    --n;
                    continue block32;
                }
                case 2123106564: {
                    int cfr_ignored_13 = (Integer.rotateRight(0x3304599E ^ n2, 9) - 837056861) * 855923103;
                    try {
                        n += 3;
                        if ((0x8DB8158EAD6335A9L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1295229496 * -373703921 + -1188394265 ^ n2));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = 1295229496 * -373703921 + -1188394265 ^ n2 ^ 0x7AF9CD49 ^ 0x7AF9CD49;
                    }
                    continue block32;
                }
                case 505287708: {
                    int cfr_ignored_14 = (Integer.rotateRight(0x5159383F ^ n2, 13) - -567578916) * 1364801599;
                    n3 = (1480515255 * -373703921 + -1188394265 ^ n2) + 167038183 - 167038183;
                    int cfr_ignored_15 = Integer.rotateRight(0x71247C03 ^ n2, 17) + -1211587688;
                    try {
                        n -= 3;
                        if ((0x1A2E42F9633EA3A5L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = 1295229496 * -373703921 + -1188394265 ^ n2;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (1295229496 * -373703921 + -1188394265 ^ n2) + 877654244 - 877654244;
                    }
                    continue block32;
                }
                case 1282391007: {
                    int cfr_ignored_16 = (Integer.rotateRight(0x7F4D007B ^ n2, 18) + 1857072672) * 2135752827;
                    n3 = 1295229496 * -373703921 + -1188394265 ^ n2 ^ 0xD98B1A78 ^ 0xD98B1A78;
                    int cfr_ignored_17 = Integer.rotateLeft(0xB1A77A2C ^ n2, 9) - -2019202417;
                    n += 4;
                    continue block32;
                }
                case 1498548001: {
                    int cfr_ignored_18 = (Integer.rotateRight(0x9AAFA71F ^ n2, 6) - -1079845892) * -1699764449;
                    try {
                        n += 2;
                        if ((0x95C56F40D31250AFL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = 1295229496 * -373703921 + -1188394265 ^ n2;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = 1295229496 * -373703921 + -1188394265 ^ n2;
                    }
                    n -= 3;
                    continue block32;
                }
                case -1684692962: {
                    int cfr_ignored_19 = (Integer.rotateLeft(0x4E18F498 ^ n2, 12) + 2036546979) * 1310258329;
                    n3 = (int)((long)(782224561 * -373703921 + -1188394265 ^ n2) ^ 0x556B324665F4B95DL ^ 0x556B324665F4B95DL);
                    int cfr_ignored_20 = (Integer.rotateRight(0x17F069F6 ^ n2, 5) - -361073659) * 401631735;
                    try {
                        if ((0x5708DB5883634471L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = 1295229496 * -373703921 + -1188394265 ^ n2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(1295229496 * -373703921 + -1188394265 ^ n2) ^ 0xDC4325CE6745D485L ^ 0xDC4325CE6745D485L);
                    }
                    continue block32;
                }
                case 712413040: {
                    int cfr_ignored_21 = (Integer.rotateRight(0x68B8241F ^ n2, 16) - -1297481988) * 1756898335;
                    n3 = (1130041836 * -373703921 + -1188394265 ^ n2) + 1161749622 - 1161749622;
                    int cfr_ignored_22 = (Integer.rotateLeft(0x2047F91C ^ n2, 7) - -317404769) * 541587741;
                    n3 = Integer.reverse(Integer.reverse(1398629359 * -373703921 + -1188394265 ^ n2));
                    int cfr_ignored_23 = (Integer.rotateLeft(0x9B6C1DD ^ n2, 4) - 830413054) * 162972125;
                    int cfr_ignored_24 = (int)(0xCB046FE027D4EB4FL ^ (long)n2 ^ 0x22B0831A2DB83BD9L);
                    n3 = 1295229496 * -373703921 + -1188394265 ^ n2;
                    n += 2;
                    continue block32;
                }
                case -1122688533: {
                    int cfr_ignored_25 = Integer.rotateRight(0x41C6F5C3 ^ n2, 11) + -76193320;
                    try {
                        n3 = (int)((long)(1295229496 * -373703921 + -1188394265 ^ n2) ^ 0x88E1C854E7AF0657L ^ 0x88E1C854E7AF0657L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (1295229496 * -373703921 + -1188394265 ^ n2) + -1064727833 - -1064727833;
                    }
                    n -= 2;
                    continue block32;
                }
                case -1853106358: {
                    int cfr_ignored_26 = Integer.rotateLeft(0x30BB5304 ^ n2, 9) - -351490889;
                    n3 = Integer.reverse(Integer.reverse(805037867 * -373703921 + -1188394265 ^ n2));
                    int cfr_ignored_27 = (Integer.rotateRight(0xF4604A12 ^ n2, 17) + -1677289623) * -195016173;
                    try {
                        n += 5;
                        n3 = Integer.reverse(Integer.reverse(1295229496 * -373703921 + -1188394265 ^ n2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(1295229496 * -373703921 + -1188394265 ^ n2) ^ 0xB805326A52EED1A1L ^ 0xB805326A52EED1A1L);
                    }
                    n += 5;
                    continue block32;
                }
                case 430941489: {
                    int cfr_ignored_28 = Integer.rotateRight(0x6CEEF607 ^ n2, 16) - 894265876;
                    n3 = -1119058082 * -373703921 + -1188394265 ^ n2;
                    int cfr_ignored_29 = Integer.rotateRight(0x6EF1C30E ^ n2, 16) - 1940143597;
                    n3 = Integer.reverse(Integer.reverse(307004782 * -373703921 + -1188394265 ^ n2));
                    int cfr_ignored_30 = Integer.rotateRight(0x326E4AA2 ^ n2, 9) + 532195545;
                    n3 = Integer.reverse(Integer.reverse(1295229496 * -373703921 + -1188394265 ^ n2));
                    n += 3;
                    continue block32;
                }
            }
            int cfr_ignored_31 = (Integer.rotateRight(0xBD7EFABF ^ n2, 10) - -155321252) * -1115751745;
            n3 = (int)((long)(1295229496 * -373703921 + -1188394265 ^ n2) ^ 0xCAD5E542A1E0F14AL ^ 0xCAD5E542A1E0F14AL);
        }
    }

    private static class_2960[] zjw(String string, int n, String string2) {
        int n2 = khd_2.taa_7(-1312435930);
        String string3 = string;
        n2 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n2;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 9)) ^ 0x8DEF07E1;
        if ((n3 ^ n2) != -1913714719) {
            int cfr_ignored_0 = Integer.rotateRight(0x3C2AD6C7 ^ n2, 10) - 1301127508;
        }
        if (yf.dnkh()) {
            throw null;
        }
        class_2960[] class_2960Array = new class_2960[n];
        for (int i = 0; i < n; ++i) {
            class_2960Array[i] = ka_2.saz_6("animated/" + string + "/circleframe_" + (i + 1) + "." + string2);
        }
        return class_2960Array;
    }

    @Override
    public void nc() {
        int n = 0;
        int n2 = 1872733412;
        n2 = Integer.rotateLeft(n2 * 2054580915, 18) ^ 0xFC1EF139;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 12);
        int n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA8F49EF8));
        while (true) {
            block15: {
                block26: {
                    block12: {
                        block24: {
                            block17: {
                                block22: {
                                    block28: {
                                        block27: {
                                            block19: {
                                                block20: {
                                                    block29: {
                                                        block13: {
                                                            block18: {
                                                                block14: {
                                                                    block23: {
                                                                        block25: {
                                                                            block21: {
                                                                                block10: {
                                                                                    block16: {
                                                                                        block11: {
                                                                                            if ((n = n3 ^ n2) > -1001888334) break block10;
                                                                                            if (n > -1887175631) break block11;
                                                                                            if (n == -2029774293) break block12;
                                                                                            if (n == -2024143993) break block13;
                                                                                            if (n == -1887175631) break block14;
                                                                                            break block15;
                                                                                        }
                                                                                        if (n > -1460363528) break block16;
                                                                                        if (n == -1788689745) break block17;
                                                                                        if (n == -1460363528) break block18;
                                                                                        break block15;
                                                                                    }
                                                                                    if (n == -1085158569) break block19;
                                                                                    if (n == -1001888334) break block20;
                                                                                    break block15;
                                                                                }
                                                                                if (n > -305297935) break block21;
                                                                                if (n == -652447257) break block22;
                                                                                if (n == -324856144) break block23;
                                                                                int cfr_ignored_0 = (Integer.rotateLeft(0x72DFF4F1 ^ n2, 17) + -310622102) * 1927279857;
                                                                                int cfr_ignored_1 = (int)(0xB06D5ACC27D4EB4FL ^ (long)n2 ^ 0x48E8831A2DB8CD0BL);
                                                                                if (n == -305297935) break block24;
                                                                                break block15;
                                                                            }
                                                                            if (n > 351760217) break block25;
                                                                            if (n == 19430963) break block26;
                                                                            if (n == 351760217) break block27;
                                                                            int cfr_ignored_2 = Integer.rotateLeft(0x6E8AF0E5 ^ n2, 16) - 1731250934;
                                                                            int cfr_ignored_3 = (int)(0xAC385ED827D4EB4FL ^ (long)n2 ^ 0x40C0831A2DB8F5A1L);
                                                                            break block15;
                                                                        }
                                                                        if (n == 974598098) break block28;
                                                                        if (n == 984680500) break block29;
                                                                        break block15;
                                                                    }
                                                                    int cfr_ignored_4 = Integer.rotateLeft(0x27AAF328 ^ n2, 7) + -770633453;
                                                                    yf.athz_2();
                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x2BA3F119));
                                                                    int cfr_ignored_5 = (Integer.rotateLeft(0x5AEDC554 ^ n2, 14) - 120095847) * 1525531989;
                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8F83FC31));
                                                                    n += 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_6 = (Integer.rotateRight(0x7B08FC7B ^ n2, 18) + -361483744) * 2064186491;
                                                                this.khtgh_2.clear();
                                                                this.sjgh_2 = 0;
                                                                this.rmm = false;
                                                                return;
                                                            }
                                                            int cfr_ignored_7 = Integer.rotateRight(0x49A410EA ^ n2, 12) + -281302127;
                                                            if (yf.khdha_2()) {
                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8F83FC31));
                                                                n -= 5;
                                                                continue;
                                                            }
                                                            try {
                                                                n += 3;
                                                                if ((0xFAA9A5AFC5607923L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                n3 = n2 ^ 0xECA316B0 ^ 0x4ABAC4CD ^ 0x4ABAC4CD;
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xECA316B0));
                                                            }
                                                            ++n;
                                                            continue;
                                                        }
                                                        int cfr_ignored_8 = (Integer.rotateLeft(0x116B735C ^ n2, 5) - 543201119) * 292254557;
                                                        int cfr_ignored_9 = (int)(0xCDD709334B35E58FL ^ (long)n2 ^ 0xEF165AD83038367FL);
                                                        n3 = (n2 ^ 0xD9DF759C) + -1727374486 - -1727374486;
                                                        int cfr_ignored_10 = (int)(0x996EFC5B318DC234L ^ (long)n2 ^ 0x5C6AFA87F4E9F0CL);
                                                        n3 = n2 ^ 0xA8F49EF8;
                                                        continue;
                                                    }
                                                    int cfr_ignored_11 = Integer.rotateRight(0xD055B80B ^ n2, 13) + 1052698768;
                                                    int cfr_ignored_12 = (int)(0x94FAD12758812A8FL ^ (long)n2 ^ 0x5F3E7DB1AE388424L);
                                                    n3 = (n2 ^ 0xAE287080) + 1540018554 - 1540018554;
                                                    int cfr_ignored_13 = (int)(0x7E643CDE8092CC0AL ^ (long)n2 ^ 0x84CDCD9663335119L);
                                                    n3 = (int)((long)(n2 ^ 0xA8F49EF8) ^ 0xD5583A011DEA07A9L ^ 0xD5583A011DEA07A9L);
                                                    continue;
                                                }
                                                int cfr_ignored_14 = Integer.rotateRight(0x21ABDB03 ^ n2, 7) + 405611672;
                                                n3 = (int)((long)(n2 ^ 0xA8F49EF8) ^ 0x2E20DC58FC676BA7L ^ 0x2E20DC58FC676BA7L);
                                                int cfr_ignored_15 = Integer.rotateRight(0x49E0B162 ^ n2, 12) + -158131687;
                                                --n;
                                                continue;
                                            }
                                            int cfr_ignored_16 = (Integer.rotateLeft(0x66F36AF0 ^ n2, 15) + 2077725259) * 1727228657;
                                            try {
                                                n -= 4;
                                                if ((0x683C238D2587274BL ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = (n2 ^ 0xA8F49EF8) + 764068408 - 764068408;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = (int)((long)(n2 ^ 0xA8F49EF8) ^ 0x7E8D032D367F543FL ^ 0x7E8D032D367F543FL);
                                            }
                                            ++n;
                                            continue;
                                        }
                                        int cfr_ignored_17 = Integer.rotateLeft(0x17CD201 ^ n2, 3) + 846925146;
                                        int cfr_ignored_18 = (int)(0xC3CE7C3C27D4EB4FL ^ (long)n2 ^ 0x508831A2DB82A4DL);
                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x3144A895));
                                        int cfr_ignored_19 = Integer.rotateRight(0xD77BB10A ^ n2, 13) + 475533169;
                                        n3 = n2 ^ 0x268C6755;
                                        int cfr_ignored_20 = Integer.rotateLeft(0xA446B641 ^ n2, 7) + -387075814;
                                        int cfr_ignored_21 = (int)(0x66F4187C27D4EB4FL ^ (long)n2 ^ 0xCD88831A2DB96039L);
                                        n3 = (n2 ^ 0xA8F49EF8) + 2017965398 - 2017965398;
                                        n += 3;
                                        continue;
                                    }
                                    int cfr_ignored_22 = (Integer.rotateLeft(0x84E9038 ^ n2, 4) + 98637315) * 139366457;
                                    n3 = (n2 ^ 0xFC137EC0) + -821696121 - -821696121;
                                    int cfr_ignored_23 = Integer.rotateLeft(0x706C44C0 ^ n2, 17) + -1585843589;
                                    n3 = n2 ^ 0xBB919530 ^ 0xC0D7C8A9 ^ 0xC0D7C8A9;
                                    int cfr_ignored_24 = Integer.rotateLeft(0x7F0AE005 ^ n2, 18) - 1722728406;
                                    int cfr_ignored_25 = (int)(0xBDB84E3827D4EB4FL ^ (long)n2 ^ 0x6100831A2DB8D6A1L);
                                    n3 = n2 ^ 0xA8F49EF8 ^ 0xCBB72354 ^ 0xCBB72354;
                                    continue;
                                }
                                int cfr_ignored_26 = Integer.rotateLeft(0xC9954148 ^ n2, 12) + 1836091123;
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA7EE5A4D));
                                int cfr_ignored_27 = Integer.rotateLeft(0x94574B01 ^ n2, 5) + -84954022;
                                int cfr_ignored_28 = (int)(0x56E5E53C27D4EB4FL ^ (long)n2 ^ 0x3708831A2DB9001AL);
                                try {
                                    n += 5;
                                    n3 = n2 ^ 0xA8F49EF8;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n3 = (n2 ^ 0xA8F49EF8) + -636199574 - -636199574;
                                }
                                --n;
                                continue;
                            }
                            int cfr_ignored_29 = Integer.rotateRight(0x733F10EB ^ n2, 17) + -117396560;
                            n3 = (int)((long)(n2 ^ 0x35D82A25) ^ 0xAFE304B6AD000024L ^ 0xAFE304B6AD000024L);
                            int cfr_ignored_30 = Integer.rotateRight(0xDC4DB9E7 ^ n2, 14) - -1312349644;
                            int cfr_ignored_31 = (int)(0x2A93EEFC7D90D042L ^ (long)n2 ^ 0x208837925BA3F8F6L);
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA8F49EF8));
                            n += 4;
                            continue;
                        }
                        int cfr_ignored_32 = Integer.rotateLeft(0x5037AF08 ^ n2, 13) + -1155804877;
                        n3 = n2 ^ 0xD9B764A6;
                        int cfr_ignored_33 = Integer.rotateLeft(0xBBB9F448 ^ n2, 10) + -1075694605;
                        n3 = (int)((long)(n2 ^ 0x4703A917) ^ 0x49082FAC2D5F8615L ^ 0x49082FAC2D5F8615L);
                        int cfr_ignored_34 = (Integer.rotateRight(0x839B7C1F ^ n2, 3) - -198072580) * -2086962145;
                        n3 = (int)((long)(n2 ^ 0xA8F49EF8) ^ 0x4BD4F10ABDA46E85L ^ 0x4BD4F10ABDA46E85L);
                        n += 2;
                        continue;
                    }
                    int cfr_ignored_35 = Integer.rotateLeft(0xC954E4E5 ^ n2, 12) - 1705334518;
                    int cfr_ignored_36 = (int)(0xBE64AD827D4EB4FL ^ (long)n2 ^ 0x68C0831A2DB9BA1DL);
                    n3 = n2 ^ 0x6E7265E7;
                    int cfr_ignored_37 = Integer.rotateLeft(0xCA2145E9 ^ n2, 12) + 2120554098;
                    int cfr_ignored_38 = (int)(0x893EBD427D4EB4FL ^ (long)n2 ^ 0x2AD8831A2DB9BCF6L);
                    n3 = n2 ^ 0xA8F49EF8;
                    n += 3;
                    continue;
                }
                int cfr_ignored_39 = (Integer.rotateLeft(0x1F99151C ^ n2, 6) - -672715361) * 530126109;
                n3 = n2 ^ 0xF21D92FF ^ 0x5CC1AC08 ^ 0x5CC1AC08;
                int cfr_ignored_40 = (Integer.rotateLeft(0xB4D36318 ^ n2, 9) + -369713373) * -1261214951;
                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x30522E5A));
                int cfr_ignored_41 = (Integer.rotateRight(0x4538E0F7 ^ n2, 11) - 1715526948) * 1161355511;
                n3 = n2 ^ 0xA8F49EF8;
                n += 3;
                continue;
            }
            int cfr_ignored_42 = (Integer.rotateLeft(0x809AAE9D ^ n2, 3) - -1759984578) * -2137346403;
            int cfr_ignored_43 = (int)(0x422800A027D4EB4FL ^ (long)n2 ^ 0xFC30831A2DB92981L);
            n3 = n2 ^ 0xA8F49EF8;
        }
    }

    private void bqy(trb trb2) {
        try {
            int n = -1069204267;
            n = Integer.rotateLeft(n * 1112076325, 20) ^ 0x7294A87F;
            trb trb3 = trb2;
            n = (trb3 != null ? System.identityHashCode(trb3) : 0) ^ n;
            int n2 = n ^ 0x608BD2EA;
            if ((n2 ^ n) != 1619776234) {
                int cfr_ignored_0 = (0xA0CEEE3F ^ n) + -292443579;
            }
            if ((0x183 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (trb2.zla() != ka_2.mc.field_1724 || ka_2.mc.field_1724 == null || ka_2.mc.field_1687 == null) {
            return;
        }
        if (this.khtgh_2.size() >= (Integer.reverse(-1770842849) ^ 0xF8A8CEE9)) {
            this.khtgh_2.removeFirst();
        }
        long l = System.currentTimeMillis();
        if (this.shrt_2()) {
            float f = this.jghgh.thw_5() * Float.intBitsToFloat(Integer.reverse(-589998845) ^ 0x82E2AB3B);
            float f2 = this.jtb_2.thw_5() * Float.intBitsToFloat(-1256462026 - 1926490422);
            float f3 = this.yh_2.thw_5() * Float.intBitsToFloat(1591419402 - 479404554);
            this.khtgh_2.add(new tdkh(ka_2.mc.field_1724.method_19538().method_1031(0.0, Double.longBitsToDouble(0x1C5807CE5B79B940L ^ 0x239B34FD684A8A73L), 0.0), this.sjgh_2++, f + f2 + f3, l, f, f2, f3));
        } else {
            class_243 class_2432 = ka_2.mc.field_1724.method_18798();
            class_243 class_2433 = ka_2.mc.field_1724.method_19538().method_1031(class_2432.field_1352 * Double.longBitsToDouble(0x35687DC9DC3C61F1L ^ 0x75687DC9DC3C61F1L), 0.0, class_2432.field_1350 * Double.longBitsToDouble(0x27FF349A7B019A98L ^ 0x67FF349A7B019A98L));
            this.khtgh_2.add(new tdkh(this.bhs(class_2433), this.sjgh_2++, this.thtb.thw_5(), l, 0.0f, 0.0f, 0.0f));
        }
    }

    private boolean zshs_4() {
        int n = -1129150525;
        n = Integer.rotateLeft(n * 420363709, 5) ^ 0xA7E39C83;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
        int n2 = n ^ 0x2FD5C392;
        if ((n2 ^ n) != 802538386) {
            int cfr_ignored_0 = (0x93674451 ^ n) - 835331071;
        }
        return !this.shrt_2();
    }

    private boolean tzgh_3() {
        int n = -444023051;
        n = Integer.rotateLeft(n * 205734801, 14) ^ 0xD0C82A77;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x8E4428D7;
        if ((n2 ^ n) != -1908135721) {
            int cfr_ignored_0 = (0x6BCC9622 ^ n) - -1356107991;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.shrt_2();
    }

    private boolean dtb_3() {
        int n;
        block1: {
            int n2 = 891381205;
            n2 = Integer.rotateLeft(n2 * 2093752195, 24) ^ 0x9C5CF4E8;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x1614D736;
            if ((n3 ^ n2) != 370464566) {
                int cfr_ignored_0 = (0x2335B2E3 ^ n2) + -609494850;
            }
            n = !this.shrt_2() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x2F9;
        }
        return n != 0;
    }

    private boolean dhdth() {
        int n = khd_2.taa_7(261198836);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x37011731;
        if ((n2 ^ n) != 922818353) {
            int cfr_ignored_0 = Integer.rotateLeft(0x389084C5 ^ n, 10) - -572673258;
            int cfr_ignored_1 = (int)(0xFA222AF827D4EB4FL ^ (long)n ^ 0xA880831A2DB85995L);
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.shrt_2();
    }

    private boolean khnh() {
        int n;
        block4: {
            try {
                int n2 = 746772067;
                n2 = Integer.rotateLeft(n2 * 329406669, 21) ^ 0x7BD4BBF7;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0x3B728AA3;
                if ((n3 ^ n2) != 997362339) {
                    int cfr_ignored_0 = (0x17F05CC0 ^ n2) + 1505201978;
                }
                if ((0x19C & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = !this.tskh_2.shghkh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x7CB5;
        }
        return n != 0;
    }

    private boolean bas() {
        int n = -289057323;
        n = Integer.rotateLeft(n * -1990005381, 22) ^ 0x49B2108;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0xE157D85C;
        if ((n2 ^ n) != -514336676) {
            int cfr_ignored_0 = (0xF928D89 ^ n) - 1349526027;
        }
        return !this.tskh_2.shghkh();
    }

    private boolean ghjt_2() {
        int n;
        block4: {
            try {
                int n2 = -312311130;
                n2 = Integer.rotateLeft(n2 * -429681447, 5) ^ 0xFA8A4EEB;
                n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 14);
                int n3 = n2 ^ 0x281636C0;
                if ((n3 ^ n2) != 672544448) {
                    int cfr_ignored_0 = (0xC574B466 ^ n2) - -1486575251;
                }
                if ((0xA4 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = !this.zwn.shghkh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x92A7;
        }
        return n != 0;
    }

    private boolean shdgh_2() {
        int n;
        block4: {
            try {
                int n2 = 696248861;
                n2 = Integer.rotateLeft(n2 * 1905697781, 24) ^ 0x73983064;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0x6972407B;
                if ((n3 ^ n2) != 1769095291) {
                    int cfr_ignored_0 = (0x400DAA66 ^ n2) + -1373193755;
                }
                if ((0x1F2 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = !this.thbq.shghkh() && !this.zwn.shghkh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x85C5;
        }
        return n != 0;
    }

    private static String dghh_3(String string, int n, int n2, int n3) {
        try {
            int n4 = 1973107117;
            n4 = Integer.rotateLeft(n4 * 1582101259, 5) ^ 0x94FE83B;
            n4 = Integer.rotateRight(n ^ n4, 2);
            n4 = Integer.rotateRight(n3 ^ n4, 29);
            int n5 = n4 ^ 0xC6366499;
            if ((n5 ^ n4) != -969513831) {
                int cfr_ignored_0 = (0xB3AD5D34 ^ n4) - 2145919326;
            }
            if ((0x230 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x9999AE7E) + zaw ^ Integer.reverse(n2 + i * -659527041), 3) - khsr_2);
        }
        return new String(cArray);
    }

    private static class_2338 swb(double d, double d2, double d3) {
        block0: {
            int n = -1883812691;
            n = Integer.rotateLeft(n * 337077375, 15) ^ 0x3D088679;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0xFB7727C0;
            if ((n2 ^ n) == -76077120) break block0;
            int cfr_ignored_0 = (0x74C06B6D ^ n) + 1790349015;
        }
        return class_2338.method_49637((double)d, (double)d2, (double)d3);
    }

    private static class_2680 lt_2(class_638 class_6382, class_2338 class_23382) {
        block0: {
            int n = -1989217455;
            n = Integer.rotateLeft(n * 298845877, 20) ^ 0x69240D0C;
            class_638 class_6383 = class_6382;
            n = Integer.rotateLeft((class_6383 != null ? System.identityHashCode(class_6383) : 0) ^ n, 28);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x3A465CDF;
            if ((n2 ^ n) == 977689823) break block0;
            int cfr_ignored_0 = (0xB328AF8E ^ n) + -1555884619;
        }
        return class_6382.method_8320(class_23382);
    }

    private static double trz_4(long l) {
        block0: {
            int n = khd_2.taa_7(-393075800);
            int n2 = n ^ 0xD4DC1126;
            if ((n2 ^ n) == -723775194) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3C4E328E ^ n, 10) - 1372962413;
        }
        return Double.longBitsToDouble(l);
    }

    private static int hdj_2(class_2338 class_23382) {
        block0: {
            int n = -673802081;
            int n2 = (n = Integer.rotateLeft(n * 1514001323, 26) ^ 0x1FCEE922) ^ 0x7EC34675;
            if ((n2 ^ n) == 2126726773) break block0;
            int cfr_ignored_0 = (0xA915DEEA ^ n) + -1152642411;
        }
        return class_23382.method_10264();
    }

    private static double shths(long l) {
        block0: {
            int n = khd_2.taa_7(-2109706543);
            int n2 = (n = (int)l ^ n) ^ 0x6A343752;
            if ((n2 ^ n) == 1781806930) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE8745983 ^ n, 16) + 712275480;
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean thha_2(class_2680 class_26802, class_2248 class_22482) {
        block0: {
            int n = 641772857;
            n = Integer.rotateLeft(n * 2092043709, 4) ^ 0xBC33A307;
            class_2680 class_26803 = class_26802;
            n = Integer.rotateRight((class_26803 != null ? System.identityHashCode(class_26803) : 0) ^ n, 10);
            class_2248 class_22483 = class_22482;
            n = Integer.rotateRight((class_22483 != null ? System.identityHashCode(class_22483) : 0) ^ n, 10);
            int n2 = n ^ 0xEDDA5090;
            if ((n2 ^ n) == -304459632) break block0;
            int cfr_ignored_0 = (0xCB9AFDA9 ^ n) - 830386266;
        }
        return class_26802.method_27852(class_22482);
    }

    private static double zhgh_3(long l) {
        block0: {
            int n = 1844727822;
            int n2 = (n = Integer.rotateLeft(n * 22997931, 26) ^ 0xBC0F5C9C) ^ 0x6A98329F;
            if ((n2 ^ n) == 1788359327) break block0;
            int cfr_ignored_0 = (0x76C6291 ^ n) - -811006321;
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean hshq(fy fy2) {
        block0: {
            int n = -1185351330;
            int n2 = (n = Integer.rotateLeft(n * 1584009985, 10) ^ 0x1758F5E5) ^ 0x8B39F500;
            if ((n2 ^ n) == -1959136000) break block0;
            int cfr_ignored_0 = (0x32610C5E ^ n) - 273176887;
        }
        return fy2.shghkh();
    }

    private static int shya(int n) {
        block0: {
            int n2 = khd_2.taa_7(-1933992698);
            int n3 = n2 ^ 0x63D549F;
            if ((n3 ^ n2) == 104682655) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8A84C999 ^ n2, 4) + -898496318) * -1971009127;
            int cfr_ignored_1 = (int)(0x483667A427D4EB4FL ^ (long)n2 ^ 0x3238831A2DB93DBDL);
        }
        return Integer.reverse(n);
    }

    private static float shan(int n) {
        block0: {
            int n2 = 1554681264;
            int n3 = (n2 = Integer.rotateLeft(n2 * -2081235009, 24) ^ 0x67AB9C61) ^ 0x59404556;
            if ((n3 ^ n2) == 1497384278) break block0;
            int cfr_ignored_0 = (0x5EAC8E6 ^ n2) + 546224809;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean aaj(fy fy2) {
        block0: {
            int n = -1732047964;
            n = Integer.rotateLeft(n * -1270627539, 6) ^ 0xDF233D1B;
            fy fy3 = fy2;
            n = (fy3 != null ? System.identityHashCode(fy3) : 0) ^ n;
            int n2 = n ^ 0x27F510B;
            if ((n2 ^ n) == 41898251) break block0;
            int cfr_ignored_0 = (0x9ABC5AAF ^ n) - -517807693;
        }
        return fy2.shghkh();
    }

    private static int afn(int n, int n2, int n3) {
        block0: {
            int n4 = khd_2.taa_7(963761063);
            int n5 = n4 ^ 0xAF1CA89;
            if ((n5 ^ n4) == 183618185) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3380192E ^ n4, 9) - 1088465869;
        }
        return class_3532.method_15340((int)n, (int)n2, (int)n3);
    }

    private static int dths_3(int n) {
        block0: {
            int n2 = khd_2.taa_7(-1067509312);
            int n3 = (n2 = n ^ n2) ^ 0x732CEF08;
            if ((n3 ^ n2) == 1932324616) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xB373F6C8 ^ n2, 9) + -1083670157;
        }
        return Integer.reverse(n);
    }

    private static int zlt_3(int n, int n2) {
        block0: {
            int n3 = 1293784398;
            n3 = Integer.rotateLeft(n3 * 9051655, 16) ^ 0xA454E9C3;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 11)) ^ 0x60E3AF2E;
            if ((n4 ^ n3) == 1625534254) break block0;
            int cfr_ignored_0 = (0x2DFE3A60 ^ n3) + 1606802707;
        }
        return Math.max(n, n2);
    }

    private static boolean hn_2(fy fy2) {
        block0: {
            int n = -640561278;
            n = Integer.rotateLeft(n * -1442392433, 17) ^ 0x41B5D0EF;
            fy fy3 = fy2;
            n = Integer.rotateLeft((fy3 != null ? System.identityHashCode(fy3) : 0) ^ n, 24);
            int n2 = n ^ 0x9849D90A;
            if ((n2 ^ n) == -1739990774) break block0;
            int cfr_ignored_0 = (0x41981688 ^ n) - 9210751;
        }
        return fy2.shghkh();
    }

    private static int zrkh_2(int n, int n2) {
        block0: {
            int n3 = -1442920871;
            n3 = Integer.rotateLeft(n3 * -1786215195, 14) ^ 0xD0E157CB;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 27)) ^ 0xE245A126;
            if ((n4 ^ n3) == -498753242) break block0;
            int cfr_ignored_0 = (0x4BBB677F ^ n3) + 490726986;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int tmth(float f, float f2, float f3) {
        block0: {
            int n = -1159467937;
            int n2 = (n = Integer.rotateLeft(n * -1693039887, 6) ^ 0xAE9E7279) ^ 0xB9D1771E;
            if ((n2 ^ n) == -1177454818) break block0;
            int cfr_ignored_0 = (0x3329B41 ^ n) - -560736546;
        }
        return Color.HSBtoRGB(f, f2, f3);
    }

    private static byq sghk(bzw_2 bzw2_2) {
        block0: {
            int n = 1951582455;
            n = Integer.rotateLeft(n * -851935959, 18) ^ 0x5D23CD8D;
            bzw_2 bzw3_2 = bzw2_2;
            n = Integer.rotateRight((bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n, 25);
            int n2 = n ^ 0xF56DEAC9;
            if ((n2 ^ n) == -177345847) break block0;
            int cfr_ignored_0 = (0x813F223E ^ n) + -1408358742;
        }
        return bzw2_2.sdsh_4();
    }

    private static byq hda(bzw_2 bzw2_2) {
        block0: {
            int n = -44290963;
            n = Integer.rotateLeft(n * 552968489, 19) ^ 0xCCF915D1;
            bzw_2 bzw3_2 = bzw2_2;
            n = Integer.rotateLeft((bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n, 26);
            int n2 = n ^ 0x80A01BAE;
            if ((n2 ^ n) == -2136990802) break block0;
            int cfr_ignored_0 = (0x7DFC37C3 ^ n) + 1567363590;
        }
        return bzw2_2.sdsh_4();
    }

    private static int dghh(byq byq2) {
        block0: {
            int n = khd_2.taa_7(-592210426);
            byq byq3 = byq2;
            n = Integer.rotateRight((byq3 != null ? System.identityHashCode(byq3) : 0) ^ n, 15);
            int n2 = n ^ 0xFC883287;
            if ((n2 ^ n) == -58183033) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x203BA481 ^ n, 7) + -342455590;
            int cfr_ignored_1 = (int)(0xE2890ABC27D4EB4FL ^ (long)n ^ 0xE808831A2DB868C3L);
        }
        return byq2.rk();
    }

    private static byq tft_3(bzw_2 bzw2_2) {
        block0: {
            int n = 541982723;
            n = Integer.rotateLeft(n * -991420741, 17) ^ 0x131E12E5;
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0xC4D620F0;
            if ((n2 ^ n) == -992599824) break block0;
            int cfr_ignored_0 = (0xE49820F3 ^ n) - -1574600687;
        }
        return bzw2_2.sdsh_4();
    }

    private static int thtth_2(byq byq2) {
        block0: {
            int n = 780846781;
            n = Integer.rotateLeft(n * -1006559019, 19) ^ 0x45674CB7;
            byq byq3 = byq2;
            n = Integer.rotateLeft((byq3 != null ? System.identityHashCode(byq3) : 0) ^ n, 23);
            int n2 = n ^ 0xF1672223;
            if ((n2 ^ n) == -244899293) break block0;
            int cfr_ignored_0 = (0xDFEDE49E ^ n) - 1318726345;
        }
        return byq2.rk();
    }

    private static int zdhsh(int n, int n2, float f) {
        block0: {
            int n3 = -2088929970;
            n3 = Integer.rotateLeft(n3 * 1306729151, 23) ^ 0xA0F5D703;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 20)) ^ 0xD4173F1F;
            if ((n4 ^ n3) == -736674017) break block0;
            int cfr_ignored_0 = (0x576A4A51 ^ n3) - 174200945;
        }
        return ka_2.dhd_6(n, n2, f);
    }

    private static int bbkh(int n, int n2, int n3) {
        block0: {
            int n4 = -1918294145;
            n4 = Integer.rotateLeft(n4 * 931693527, 17) ^ 0x41496E50;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 27)) ^ 0xC81ECFEC;
            if ((n5 ^ n4) == -937504788) break block0;
            int cfr_ignored_0 = (0x45B7E893 ^ n4) + -440179364;
        }
        return class_3532.method_15340((int)n, (int)n2, (int)n3);
    }

    private static int jtq() {
        block0: {
            int n = -1477812771;
            int n2 = (n = Integer.rotateLeft(n * 1425749441, 22) ^ 0xE346EFC) ^ 0xA2B65437;
            if ((n2 ^ n) == -1565109193) break block0;
            int cfr_ignored_0 = (0x55C09EA ^ n) + 230379671;
        }
        return yf.tdhth_2();
    }

    private static boolean dhjt() {
        block0: {
            int n = khd_2.taa_7(1235099369);
            int n2 = n ^ 0xF4DE4D8E;
            if ((n2 ^ n) == -186757746) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xBD405367 ^ n, 10) - -282609484;
        }
        return yf.dnkh();
    }

    private static float tqn_2(float f, float f2, float f3) {
        block0: {
            int n = -170750799;
            n = Integer.rotateLeft(n * -226259637, 17) ^ 0x927FDDEA;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 21);
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x7CBE4249;
            if ((n2 ^ n) == 2092843593) break block0;
            int cfr_ignored_0 = (0x896CCEF8 ^ n) + -247366420;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static int akhs(int n, int n2, int n3) {
        block0: {
            int n4 = 498138530;
            n4 = Integer.rotateLeft(n4 * -1148533143, 22) ^ 0x5282C70A;
            n4 = Integer.rotateLeft(n ^ n4, 13);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 14)) ^ 0x8207D211;
            if ((n5 ^ n4) == -2113416687) break block0;
            int cfr_ignored_0 = (0x9FB72FB3 ^ n4) - -1289103640;
        }
        return class_3532.method_15340((int)n, (int)n2, (int)n3);
    }

    private static boolean khhn() {
        block0: {
            int n = -1823301139;
            int n2 = (n = Integer.rotateLeft(n * -474094527, 26) ^ 0x4F54D872) ^ 0xFF061A8B;
            if ((n2 ^ n) == -16377205) break block0;
            int cfr_ignored_0 = (0x6C54BB66 ^ n) - 1680256145;
        }
        return yf.khdha_2();
    }

    private static float hjb(float f, float f2, float f3) {
        block0: {
            int n = 866577969;
            n = Integer.rotateLeft(n * 1694533109, 11) ^ 0xD9930294;
            n = Float.floatToIntBits(f) ^ n;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0xD826B33;
            if ((n2 ^ n) == 226650931) break block0;
            int cfr_ignored_0 = (0x3E248502 ^ n) + 197938634;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static int thda(float f, int n, int n2) {
        block0: {
            int n3 = -1558134023;
            n3 = Integer.rotateLeft(n3 * 1680866697, 10) ^ 0x9806C311;
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 17)) ^ 0x472006C9;
            if ((n4 ^ n3) == 1193281225) break block0;
            int cfr_ignored_0 = (0xE400C430 ^ n3) + 1303296245;
        }
        return class_3532.method_48781((float)f, (int)n, (int)n2);
    }

    private static int thth_5(float f) {
        block0: {
            int n = -794418057;
            int n2 = (n = Integer.rotateLeft(n * 1299311489, 15) ^ 0x25B5E62C) ^ 0x5CFCACFB;
            if ((n2 ^ n) == 1560063227) break block0;
            int cfr_ignored_0 = (0x8C5A888C ^ n) + 1308988870;
        }
        return Math.round(f);
    }

    private static String[] jds_3(String string) {
        block0: {
            int n = 2015944047;
            n = Integer.rotateLeft(n * -1030298867, 20) ^ 0x125F0ABC;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 3);
            int n2 = n ^ 0x56C56CFE;
            if ((n2 ^ n) == 1455779070) break block0;
            int cfr_ignored_0 = (0x2EEDB191 ^ n) - -1090477893;
        }
        return string.split("\u0007\u0016", -1);
    }

    private static CallSite hgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 500500064;
            n3 = Integer.rotateLeft(n3 * 651177597, 19) ^ 0x22038D05;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 4);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xF4779576;
            if ((n4 ^ n3) != -193489546) {
                int cfr_ignored_0 = (0xE9A29316 ^ n3) + 2064393197;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ tr ^ string.hashCode() ^ n2 + hnt ^ i * -962764425 ^ tr, 23) ^ hnt));
            }
            String[] stringArray = ka_2.jds_3(new String(cArray));
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

    private static String[] qkejbscq58uw8(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bl8l168fowc5v4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ fadh5ck0 ^ string.hashCode() ^ n2 + lan8b3puon ^ i * -531922591 ^ fadh5ck0, 17) ^ lan8b3puon));
            }
            String[] stringArray = ka_2.qkejbscq58uw8(new String(cArray));
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

