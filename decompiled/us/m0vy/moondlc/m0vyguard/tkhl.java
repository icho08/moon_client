/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bha;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zdh_8;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="3D Cube", category=bzw.OTHER, desc="Floating 3D cubes around you")
public class tkhl
extends bnq {
    private static tkhl bzb;
    private static final class_238 zthsh;
    private final tay qz_2 = new tay(this, "Max Par".concat("ticles")).shth_7(Float.intBitsToFloat(-1663764961 + -1538586143)).dhbs_2(Float.intBitsToFloat(1241108995 - 112316931)).rkh_3(Float.intBitsToFloat(-1712075201 + -1490275903)).ssd_5(Float.intBitsToFloat(0x51436302 ^ 0x138B6302));
    private final tay tnb = new tay(this, "Range").shth_7(Float.intBitsToFloat(-1540287238 + -1670452474)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1883536393) ^ 0xADE1DDF1)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(1978954808) ^ 0x5D8E2FAE));
    private final tay thw_3 = new tay(this, "Size").shth_7(Float.intBitsToFloat(2145145189 - 1116701848)).dhbs_2(Float.intBitsToFloat(0x5B1893B0 ^ 0x641893B0)).rkh_3(Float.intBitsToFloat(895010974 - -133432367)).ssd_5(Float.intBitsToFloat(Integer.reverse(145679142) ^ 0x5A8BB9DD));
    private final badh_2 zghq = new badh_2(this, "Theme Color").bts(true);
    private final bzw_2 dhda_2 = new bzw_2(this, "Color 1", this::dkz_3).dhshy(new byq(Float.intBitsToFloat(0x3F74A8E ^ 0x40884A8E), Float.intBitsToFloat(-2018915696 + -1164036752), Float.intBitsToFloat(0x45634F5F ^ 0x6754F5F), Float.intBitsToFloat(Integer.reverse(993354177) ^ 0xC0F9ACDC)));
    private final bzw_2 dhl_3 = new bzw_2(this, "Color 2", this::smdh).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-1759311109) ^ 0x9D18C4E9), Float.intBitsToFloat(Integer.reverse(-525266138) ^ 0x27DE8D07), Float.intBitsToFloat(0xE7B3ED9A ^ 0xA4CCED9A), Float.intBitsToFloat(Integer.rotateLeft(0x1A42B52A ^ 0xDA42A5F5, 18))));
    private final List dhah = new ArrayList(0x1379228 ^ 0x13792E0);
    private final Quaternionf khkhgh = new Quaternionf();
    private static final class_2960 hdw_2;
    private final bql<btt> khhk = this::ghtm;
    private final bql<shw_3> tthj = this::jkl;
    private static final int tam_2 = -1860835872;
    private static final int tzj = -1901393332;
    private static final int jthkh = -1867564032;
    private static final int zsn = -973774731;
    private static final int zk93tfma = 1213610691;
    private static final int wm56f8xfo89 = 51785817;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int l2e96w3l;

    public tkhl() {
        bzb = this;
    }

    @Override
    public void nc() {
        int n = zdh_8.khww(-1486291878);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
        int n2 = n ^ 0xA19D9E1;
        if ((n2 ^ n) != 169466337) {
            int cfr_ignored_0 = (Integer.rotateRight(0xAD7125BB ^ n, 8) + 85012704) * -1385093701;
        }
        this.dhah.clear();
    }

    private void ththw(class_4587 class_45872, class_287 class_2872, float f, float f2, float f3, float f4, int n) {
        float f5 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f7 = (float)(n & 0xFF) / 255.0f;
        float f8 = (float)(n >> 24 & 0xFF) / 255.0f;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_22915(f5, f6, f7, f8);
    }

    private void ghbj(class_4587 class_45872, class_287 class_2872, class_238 class_2383, int n) {
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = (float)class_2383.field_1323;
        float f6 = (float)class_2383.field_1322;
        float f7 = (float)class_2383.field_1321;
        float f8 = (float)class_2383.field_1320;
        float f9 = (float)class_2383.field_1325;
        float f10 = (float)class_2383.field_1324;
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
    }

    private void asd_4(class_4587 class_45872, class_287 class_2872, class_238 class_2383, int n) {
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = (float)class_2383.field_1323;
        float f6 = (float)class_2383.field_1322;
        float f7 = (float)class_2383.field_1321;
        float f8 = (float)class_2383.field_1320;
        float f9 = (float)class_2383.field_1325;
        float f10 = (float)class_2383.field_1324;
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
    }

    private static int ghas_2(int n, float f) {
        int n2 = 1437991598;
        n2 = Integer.rotateLeft(n2 * 1887936025, 6) ^ 0xD95B899A;
        n2 = n ^ n2;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 26);
        int n3 = n2 ^ 0x71F61DF1;
        if ((n3 ^ n2) != 1911954929) {
            int cfr_ignored_0 = (0x24401F5F ^ n2) - -1264739876;
        }
        int n4 = Math.clamp((long)((int)(f * tkhl.khkhn(-1948033139 + -1214537613))), 0, tkhl.bht_4(-1113307580) ^ 0x22622542);
        return n4 << (Integer.reverse(949301547) ^ 0xD48CA904) | n & Integer.rotateLeft(0xD200CDFC ^ 0x2D80B203, 9);
    }

    private static double ghts_4(double d, double d2) {
        block0: {
            int n = -334149427;
            int n2 = (n = Integer.rotateLeft(n * -820325187, 15) ^ 0x928591BE) ^ 0x40768BA7;
            if ((n2 ^ n) == 1081510823) break block0;
            int cfr_ignored_0 = (0xAC63C36A ^ n) + -1921431050;
        }
        return ThreadLocalRandom.current().nextDouble(d, d2);
    }

    @Generated
    public static tkhl athh_2() {
        block0: {
            int n = 453770557;
            int n2 = (n = Integer.rotateLeft(n * -1792919175, 13) ^ 0xE0319AB7) ^ 0x4B1F0464;
            if ((n2 ^ n) == 1260323940) break block0;
            int cfr_ignored_0 = (0x5014F959 ^ n) + -1256942423;
        }
        return bzb;
    }

    private void jkl(shw_3 shw2) {
        bha bha22;
        try {
            int n = 2085237117;
            n = Integer.rotateLeft(n * -561507095, 19) ^ 0xCAF3F0C;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            shw_3 shw3 = shw2;
            n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
            int n2 = n ^ 0x3F4DA0C3;
            if ((n2 ^ n) != 1062052035) {
                int cfr_ignored_0 = (0x430791BE ^ n) - 116148193;
            }
            if ((0x392 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (tkhl.mc.field_1724 == null || tkhl.mc.field_1687 == null) {
            return;
        }
        class_4587 class_45872 = shw2.ssha_2();
        class_4184 class_41842 = tkhl.mc.field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        float f = shw2.skz_4();
        int n = this.zghq.shzl() ? bas_4.hmq(0).getRGB() : this.dhda_2.sdsh_4().dkhw_2(this.dhl_3.sdsh_4(), Float.intBitsToFloat(Integer.rotateLeft(0xB932A3F4 ^ 0xB932A414, 19))).rk();
        class_45872.method_22903();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.disableCull();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShaderTexture((int)0, (class_2960)hdw_2);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (bha bha22 : this.dhah) {
            float f2 = Float.intBitsToFloat(Integer.rotateLeft(0x9A74FA2B ^ 0x9274FA2F, 28)) * bha22.thsr_2;
            double d = bha22.jab.field_1352 + (bha22.twj.field_1352 - bha22.jab.field_1352) * (double)f - class_2432.field_1352;
            double d2 = bha22.jab.field_1351 + (bha22.twj.field_1351 - bha22.jab.field_1351) * (double)f - class_2432.field_1351;
            double d3 = bha22.jab.field_1350 + (bha22.twj.field_1350 - bha22.jab.field_1350) * (double)f - class_2432.field_1350;
            class_45872.method_22903();
            class_45872.method_22904(d, d2, d3);
            class_45872.method_22907(class_41842.method_23767());
            int n3 = tkhl.ghas_2(n, bha22.qa_2 * Float.intBitsToFloat(-200730304 - -1254339469));
            this.ththw(class_45872, class_2872, -f2 / 2.0f, -f2 / 2.0f, f2, f2, n3);
            class_45872.method_22909();
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.disableDepthTest();
        class_45872.method_22909();
        RenderSystem.enableBlend();
        RenderSystem.disableDepthTest();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.disableCull();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        bha22 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        for (bha bha3 : this.dhah) {
            bha3.bq();
            double d = bha3.jab.field_1352 + (bha3.twj.field_1352 - bha3.jab.field_1352) * (double)f - class_2432.field_1352;
            double d4 = bha3.jab.field_1351 + (bha3.twj.field_1351 - bha3.jab.field_1351) * (double)f - class_2432.field_1351;
            double d5 = bha3.jab.field_1350 + (bha3.twj.field_1350 - bha3.jab.field_1350) * (double)f - class_2432.field_1350;
            float f3 = (float)(bha3.dhmz.field_1352 + (bha3.thqr.field_1352 - bha3.dhmz.field_1352) * (double)f);
            float f4 = (float)(bha3.dhmz.field_1351 + (bha3.thqr.field_1351 - bha3.dhmz.field_1351) * (double)f);
            float f5 = (float)(bha3.dhmz.field_1350 + (bha3.thqr.field_1350 - bha3.dhmz.field_1350) * (double)f);
            class_45872.method_22903();
            class_45872.method_22904(d, d4, d5);
            class_45872.method_22907(this.khkhgh.rotationXYZ(f3, f4, f5));
            class_45872.method_22905(bha3.thsr_2, bha3.thsr_2, bha3.thsr_2);
            int n4 = tkhl.ghas_2(n, bha3.qa_2 * Float.intBitsToFloat(Integer.rotateLeft(0x8FAA8B04 ^ 0x160D529D, 11)));
            int n5 = tkhl.ghas_2(n, bha3.qa_2 * Float.intBitsToFloat(0x7A3A6069 ^ 0x4576ACA4));
            this.ghbj(class_45872, (class_287)bha22, zthsh, n4);
            this.asd_4(class_45872, (class_287)bha22, zthsh, n5);
            class_45872.method_22909();
        }
        class_9801 class_98013 = bha22.method_60794();
        if (class_98013 != null) {
            class_286.method_43433((class_9801)class_98013);
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    private void ghtm(btt btt2) {
        int n = -914623995;
        n = Integer.rotateLeft(n * 1642509457, 8) ^ 0x511385CD;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x93C15A25;
        if ((n2 ^ n) != -1816045019) {
            int cfr_ignored_0 = (0x5ABAA820 ^ n) - 134587239;
        }
        if (tkhl.mc.field_1724 == null || tkhl.mc.field_1687 == null) {
            return;
        }
        this.dhah.removeIf(tkhl::thya_2);
        for (bha bha2 : this.dhah) {
            bha2.hah_2();
        }
        int n3 = (int)this.qz_2.hkj();
        float f = this.tnb.hkj();
        while (this.dhah.size() < n3) {
            this.dhah.add(new bha(tkhl.mc.field_1724.method_19538().method_1031(tkhl.ghts_4(-f, f), tkhl.ghts_4(0.0, Double.longBitsToDouble(0x77BFB67AF7450D5L ^ 0x476FFB67AF7450D5L)), tkhl.ghts_4(-f, f)), class_243.field_1353, new class_243(tkhl.ghts_4(Double.longBitsToDouble(0x9A99280808F9F713L ^ 0x2569280808F9F713L), 1.0), tkhl.ghts_4(0.0, Double.longBitsToDouble(0x4766895C07E6B196L ^ 0x766895C07E6B196L)), tkhl.ghts_4(Double.longBitsToDouble(0x22F526E0453C550L ^ 0xBDDF526E0453C550L), 1.0)), new class_243(tkhl.ghts_4(Double.longBitsToDouble(0x9613BB7D3EB5504FL ^ 0x29E3BB7D3EB5504FL), 1.0), tkhl.ghts_4(Double.longBitsToDouble(0xE629838DA2007495L ^ 0x59D9838DA2007495L), 1.0), tkhl.ghts_4(Double.longBitsToDouble(0x4BBB6A8E8D6F3C36L ^ 0xF44B6A8E8D6F3C36L), 1.0)), (long)tkhl.ghts_4(Double.longBitsToDouble(0xBD4799B62A82A9F6L ^ 0xFDD0E9B62A82A9F6L), Double.longBitsToDouble(0x18AF212C5460C1B5L ^ 0x581EB52C5460C1B5L)), this.thw_3.hkj() + (float)tkhl.ghts_4(Double.longBitsToDouble(0x50BD2B1684EED9CEL ^ 0xEF14B28F1D774054L), Double.longBitsToDouble(0xD30EFE5F1C3CE22EL ^ 0xECB767C685A57BB4L))));
        }
    }

    private static boolean thya_2(bha bha2) {
        int n = -1493363177;
        n = Integer.rotateLeft(n * -1694653243, 24) ^ 0x3AD691FA;
        bha bha3 = bha2;
        n = Integer.rotateLeft((bha3 != null ? System.identityHashCode(bha3) : 0) ^ n, 7);
        int n2 = n ^ 0x2CF60F53;
        if ((n2 ^ n) != 754323283) {
            int cfr_ignored_0 = (0x8A0B1944 ^ n) - 499108193;
        }
        return bha2.qa_2 <= 0.0f && bha2.dsy_2() >= bha2.tyk;
    }

    private boolean smdh() {
        block0: {
            int n = -847665318;
            n = Integer.rotateLeft(n * -1127498521, 13) ^ 0x19C6989A;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
            int n2 = n ^ 0x6504980A;
            if ((n2 ^ n) == 1694799882) break block0;
            int cfr_ignored_0 = (0xA87D3F50 ^ n) + -759938884;
        }
        return this.zghq.shzl();
    }

    private boolean dkz_3() {
        block0: {
            int n = 233618931;
            n = Integer.rotateLeft(n * 494994691, 11) ^ 0xBF5297B4;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7F229187;
            if ((n2 ^ n) == 2132971911) break block0;
            int cfr_ignored_0 = (0x72CE2C74 ^ n) + 1239668859;
        }
        return this.zghq.shzl();
    }

    private static String thhz_2(String string, int n, int n2, int n3) {
        int n4 = 1466485391;
        n4 = Integer.rotateLeft(n4 * 1260346905, 14) ^ 0xC8FFB251;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 3);
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 26)) ^ 0x1A2DBB3F;
        if ((n5 ^ n4) != 439204671) {
            int cfr_ignored_0 = (0x4D4571B0 ^ n4) - -299299917;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x785DED46) + n2 ^ i * 1766869021) ^ tam_2) + tzj);
        }
        return new String(cArray);
    }

    private static float khkhn(int n) {
        block0: {
            int n2 = 1297015226;
            n2 = Integer.rotateLeft(n2 * -1423085847, 3) ^ 0xC5C7F4D;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 9)) ^ 0x89D65BB7;
            if ((n3 ^ n2) == -1982440521) break block0;
            int cfr_ignored_0 = (0xC498BA0D ^ n2) + 16025701;
        }
        return Float.intBitsToFloat(n);
    }

    private static int bht_4(int n) {
        block0: {
            int n2 = -2009429333;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1170582739, 4) ^ 0x69EAE1C8) ^ 0x426CD11;
            if ((n3 ^ n2) == 69651729) break block0;
            int cfr_ignored_0 = (0x8C1C47BA ^ n2) + -197675789;
        }
        return Integer.reverse(n);
    }

    private static String[] hthth(String string) {
        int n = -878639936;
        int n2 = (n = Integer.rotateLeft(n * 2056781227, 17) ^ 0x94DAEA7C) ^ 0x6DDD147B;
        if ((n2 ^ n) != 1843205243) {
            int cfr_ignored_0 = (0xA67C10BB ^ n) - 1556489034;
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

    private static CallSite tss_5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1809856853;
            n3 = Integer.rotateLeft(n3 * -984759019, 22) ^ 0x4C3C90A9;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 29);
            int n4 = n3 ^ 0xB2FFDCE1;
            if ((n4 ^ n3) != -1291854623) {
                int cfr_ignored_0 = (0x26E01A4A ^ n3) - 1320997751;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ jthkh ^ string.hashCode() ^ n2 + zsn ^ i * -87188471 ^ jthkh, 20) ^ zsn));
            }
            String[] stringArray = tkhl.hthth(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ysy87m2pl6ehwv(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ohkqnlw2h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zk93tfma ^ string.hashCode() ^ n2 + wm56f8xfo89 ^ i * -1849197069 ^ zk93tfma, 19) ^ wm56f8xfo89));
            }
            String[] stringArray = tkhl.ysy87m2pl6ehwv(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

