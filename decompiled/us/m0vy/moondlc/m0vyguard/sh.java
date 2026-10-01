/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
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
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
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
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmdh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tth_3;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="FireFly", category=bzw.OTHER, desc="Animated fireflies with glowing trails")
public class sh
extends bnq {
    private static final long khhd_3 = 8000L;
    private static final long rtdh = 500L;
    private static final double sthk = 60.0;
    private static final int rja = 20;
    private final tay shd_4 = new tay(this, "Count").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x3031C129 ^ 0x3423C129, 4))).dhbs_2(Float.intBitsToFloat(Integer.reverse(971026076) ^ 0x7AE3079C)).rkh_3(Float.intBitsToFloat(0x4C320B03 ^ 0xD120B03)).ssd_5(Float.intBitsToFloat(-1817425954 + -1357137886));
    private final tay thz_5 = new tay(this, "Speed").shth_7(Float.intBitsToFloat(Integer.reverse(-274892610) ^ 0x4052753A)).dhbs_2(Float.intBitsToFloat(Integer.reverse(1911314844) ^ 0x69A378E)).rkh_3(Float.intBitsToFloat(0xB1ECB320 ^ 0x8CA07FED)).ssd_5(Float.intBitsToFloat(0x5EC3D04D ^ 0x60DA49D7));
    private final tay bsk_2 = new tay(this, "Spawn Radius").shth_7(Float.intBitsToFloat(-158287173 + 1250903365)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xE57553E8 ^ 0xC17553C9, 25))).rkh_3(Float.intBitsToFloat(1360864118 + -276636534)).ssd_5(Float.intBitsToFloat(2104482231 - 1000855991));
    private final tay thlk = new tay(this, "Trail ".concat("Length")).shth_7(Float.intBitsToFloat(910075687 - -174151897)).dhbs_2(Float.intBitsToFloat(Integer.reverse(1033060102) ^ 0x22DCC9BC)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(-600248240) ^ 0x4BAF1C3B));
    private final khd tzh_4 = new khd(this, "Color Mode");
    private final fy dshz = new fy(this.tzh_4, "Random");
    private final fy rfgh = new fy(this.tzh_4, "Theme");
    private final fy khf = new fy(this.tzh_4, "Custom");
    private final bzw_2 dhmkh = new bzw_2(this, "Custom Color", this::sns_2).dhshy(new byq(Float.intBitsToFloat(0x120ED282 ^ 0x5171D282), Float.intBitsToFloat(0xDC4F6997 ^ 0x9F306997), Float.intBitsToFloat(Integer.reverse(1218171079) ^ 0xA074D912), Float.intBitsToFloat(Integer.reverse(-1145651053) ^ 0x8A7C6DDD)));
    private final List zjth = new ArrayList(Integer.reverse(-1651998153) ^ 0xEC411095);
    private final class_2960 twy = class_2960.method_60655((String)"moondlc", (String)"images/particle".concat("s/firefly.png"));
    private final bql<btt> rzth_2 = this::thshsh;
    private final bql<shw_3> jaa_2 = this::ala_2;
    private static final int ddth_2 = -20082759;
    private static final int bsf = 1774576820;
    private static final int dkk = -747027549;
    private static final int dzkh = -1533321563;
    private static final int iv4v505o9vh7u = 227049162;
    private static final int oglxragto93 = 1918140049;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int kn51ezoze55;

    @Override
    public void nt() {
        int n = -27270123;
        n = Integer.rotateLeft(n * 182368295, 17) ^ 0x9C6DB35C;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x426F00C8;
        if ((n2 ^ n) != 1114570952) {
            int cfr_ignored_0 = (0xBC30E4DD ^ n) - -1345016300;
        }
        this.zjth.clear();
    }

    @Override
    public void nc() {
        int n = tth_3.khhn_2(-1370469350);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x27F24E4;
        if ((n2 ^ n) != 41886948) {
            int cfr_ignored_0 = (Integer.rotateRight(0xAC2F68FE ^ n, 8) - -568633859) * -1406179073;
        }
        this.zjth.clear();
    }

    private void dma_4() {
        if (sh.mc.field_1724 == null || sh.mc.field_1687 == null) {
            this.zjth.clear();
            return;
        }
        int n = (int)this.shd_4.thw_5();
        while (this.zjth.size() > n) {
            this.zjth.removeFirst();
        }
        class_243 class_2432 = sh.mc.field_1724.method_19538();
        float f = this.thz_5.thw_5();
        int n2 = (int)this.thlk.thw_5();
        Iterator iterator = this.zjth.iterator();
        while (iterator.hasNext()) {
            bmdh bmdh2 = (bmdh)iterator.next();
            if (!bmdh2.twsh(f, n2, class_2432)) continue;
            iterator.remove();
        }
        while (this.zjth.size() < n) {
            this.rmw();
        }
    }

    private void rmw() {
        try {
            int n = 2026094472;
            n = Integer.rotateLeft(n * 1210329159, 26) ^ 0xFFF4BEF2;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
            int n2 = n ^ 0xFB43FC18;
            if ((n2 ^ n) != -79430632) {
                int cfr_ignored_0 = (0x83804390 ^ n) - 102319727;
            }
            if ((0x6D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (sh.mc.field_1724 == null) {
            return;
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        double d = threadLocalRandom.nextDouble(Double.longBitsToDouble(0x8B63BEC2A5AFDEE0L ^ 0xCB77BEC2A5AFDEE0L), this.bsk_2.thw_5());
        double d2 = Math.toRadians(threadLocalRandom.nextDouble(0.0, Double.longBitsToDouble(0xD9BB2B907F1D0EF4L ^ 0x99CDAB907F1D0EF4L)));
        double d3 = -sh.ams(d2) * d;
        double d4 = Math.cos(d2) * d;
        double d5 = threadLocalRandom.nextDouble(Double.longBitsToDouble(0x6EFE85520B150E5BL ^ 0xAEEA85520B150E5BL), Double.longBitsToDouble(0xF8BF977713BA5C8DL ^ 0xB89B977713BA5C8DL));
        double d6 = sh.thgh_5(this.thz_5);
        double d7 = sh.tshth(threadLocalRandom.nextDouble(0.0, sh.ztj(0x61844E680B444CD8L ^ 0x21F2CE680B444CD8L)));
        double d8 = Math.toRadians(threadLocalRandom.nextDouble(Double.longBitsToDouble(0xADBB9CA6491FBA69L ^ 0x6D859CA6491FBA69L), Double.longBitsToDouble(0xD3CE34988A41A20FL ^ 0x93F034988A41A20FL)));
        class_243 class_2432 = new class_243(-Math.sin(d7) * Math.cos(d8) * d6, sh.tghz_2(d8) * d6 * Double.longBitsToDouble(0x59DA7085ACDE5CA4L ^ 0x663A7085ACDE5CA4L), Math.cos(d7) * Math.cos(d8) * d6);
        class_243 class_2433 = sh.mc.field_1724.method_19538().method_1031(d3, d5, d4);
        this.zjth.add(new bmdh(class_2433, class_2432, this.zjth.size(), this.khghd_2().getRGB()));
    }

    private void sdhth_2(class_4587 class_45872, float f) {
        if (this.zjth.isEmpty() || sh.mc.field_1773 == null) {
            return;
        }
        class_4184 class_41842 = sh.mc.field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        float f2 = (float)Math.toRadians(-class_41842.method_19330());
        float f3 = (float)Math.toRadians(class_41842.method_19329());
        float f4 = class_3532.method_15374((float)f2);
        float f5 = class_3532.method_15362((float)f2);
        float f6 = class_3532.method_15374((float)f3);
        float f7 = class_3532.method_15362((float)f3);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.disableCull();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)this.twy);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (bmdh bmdh2 : this.zjth) {
            float f8 = bmdh2.shrz();
            if (f8 <= 0.01f) continue;
            int n = this.za_2(bmdh2);
            this.tzt(class_2872, matrix4f, bmdh2, class_2432, f4, f5, f6, f7, n, f8);
            this.ajl(class_2872, matrix4f, bmdh2, class_2432, f4, f5, f6, f7, n, f8, f);
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    private void tzt(class_287 class_2872, Matrix4f matrix4f, bmdh bmdh2, class_243 class_2432, float f, float f2, float f3, float f4, int n, float f5) {
        if (bmdh2.by_2.size() < 2) {
            return;
        }
        int n2 = bmdh2.by_2.size();
        int n3 = Math.max(1, (n2 + 20 - 1) / 20);
        int n4 = 0;
        for (class_243 class_2433 : bmdh2.by_2) {
            if (n4 % n3 != 0 && n4 != n2 - 1) {
                ++n4;
                continue;
            }
            float f6 = (float)(n4 + 1) / (float)n2;
            float f7 = f5 * f6 * 0.55f;
            if (f7 > 0.01f) {
                float f8 = 0.03f + 0.12f * f6;
                sh.khzdh_2(class_2872, matrix4f, class_2433.field_1352 - class_2432.field_1352, class_2433.field_1351 - class_2432.field_1351, class_2433.field_1350 - class_2432.field_1350, f, f2, f3, f4, f8, this.zkht_4(n, f7));
                if (n4 % 4 == 0 && f6 > 0.3f) {
                    for (int i = 0; i < 2; ++i) {
                        double d = (double)bmdh2.szd_3 * 31.0 + (double)n4 * 17.0 + (double)i * 91.0;
                        sh.khzdh_2(class_2872, matrix4f, class_2433.field_1352 - class_2432.field_1352 + Math.sin(d) * 0.11, class_2433.field_1351 - class_2432.field_1351 + Math.cos(d * 1.37) * 0.08, class_2433.field_1350 - class_2432.field_1350 + Math.sin(d * 0.77) * 0.11, f, f2, f3, f4, f8 * 0.45f, this.zkht_4(n, f7 * 0.55f));
                    }
                }
            }
            ++n4;
        }
    }

    private void ajl(class_287 class_2872, Matrix4f matrix4f, bmdh bmdh2, class_243 class_2432, float f, float f2, float f3, float f4, int n, float f5, float f6) {
        double d = bmdh2.sff.field_1352 + (bmdh2.dhqh_2.field_1352 - bmdh2.sff.field_1352) * (double)f6 - class_2432.field_1352;
        double d2 = bmdh2.sff.field_1351 + (bmdh2.dhqh_2.field_1351 - bmdh2.sff.field_1351) * (double)f6 - class_2432.field_1351;
        double d3 = bmdh2.sff.field_1350 + (bmdh2.dhqh_2.field_1350 - bmdh2.sff.field_1350) * (double)f6 - class_2432.field_1350;
        sh.khzdh_2(class_2872, matrix4f, d, d2, d3, f, f2, f3, f4, 0.34f, this.zkht_4(n, f5 * 0.45f));
        sh.khzdh_2(class_2872, matrix4f, d, d2, d3, f, f2, f3, f4, 0.2f, this.zkht_4(n, f5));
        sh.khzdh_2(class_2872, matrix4f, d, d2, d3, f, f2, f3, f4, 0.09f, this.zkht_4(0xFFFFFF, f5));
    }

    private static void khzdh_2(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, int n) {
        int n2 = tth_3.khhn_2(-635570703);
        class_287 class_2873 = class_2872;
        n2 = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n2, 13);
        n2 = (int)Double.doubleToLongBits(d2) ^ n2;
        int n3 = n2 ^ 0x955A11AE;
        if ((n3 ^ n2) != -1789259346) {
            int cfr_ignored_0 = (Integer.rotateRight(0x4F47E45F ^ n2, 12) - -1642969412) * 1330111583;
        }
        float f6 = (float)(n >> 119547002 - 119546986 & 1976749393 + -1976749138) / Float.intBitsToFloat(sh.dmgh_2(-1387998202) ^ 0x235422B5);
        float f7 = (float)(n >> -700887944 - -700887952 & Integer.rotateLeft(0xCEC25A75 ^ 0xB1425A75, 9)) / Float.intBitsToFloat(Integer.rotateLeft(0x719A2AB4 ^ 0x719A69CB, 16));
        float f8 = (float)(n & (sh.dhght(-1966101167) ^ 0x8AB5F3AE)) / Float.intBitsToFloat(-1534440442 + -1628130310);
        float f9 = (float)(n >> -241000305 + 241000329 & 1645310364 - 1645310109) / sh.ththt_2(467217001 - -665179543);
        sh.ssr(class_2872, matrix4f, d, d2, d3, -f5, f5, f, f2, f3, f4, 0.0f, 1.0f, f6, f7, f8, f9);
        sh.bsh_3(class_2872, matrix4f, d, d2, d3, f5, f5, f, f2, f3, f4, 1.0f, 1.0f, f6, f7, f8, f9);
        sh.ssr(class_2872, matrix4f, d, d2, d3, f5, -f5, f, f2, f3, f4, 1.0f, 0.0f, f6, f7, f8, f9);
        sh.ssr(class_2872, matrix4f, d, d2, d3, -f5, -f5, f, f2, f3, f4, 0.0f, 0.0f, f6, f7, f8, f9);
    }

    private static void ssr(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        int n = 0;
        int n2 = -1554175570;
        n2 = Integer.rotateLeft(n2 * 1729632873, 6) ^ 0x6C196C8A;
        Matrix4f matrix4f2 = matrix4f;
        n2 = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n2;
        n2 = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n2, 15);
        int n3 = n2 - 31420897;
        while (true) {
            block16: {
                block21: {
                    block27: {
                        block30: {
                            block23: {
                                block24: {
                                    block15: {
                                        block13: {
                                            block29: {
                                                block14: {
                                                    block19: {
                                                        block20: {
                                                            block28: {
                                                                block25: {
                                                                    block18: {
                                                                        block26: {
                                                                            block22: {
                                                                                block11: {
                                                                                    block17: {
                                                                                        block12: {
                                                                                            if ((n = n2 - n3) > -692805082) break block11;
                                                                                            if (n > -1376262355) break block12;
                                                                                            if (n == -1527287704) break block13;
                                                                                            if (n == -1509157828) break block14;
                                                                                            if (n == -1376262355) break block15;
                                                                                            break block16;
                                                                                        }
                                                                                        if (n > -846937437) break block17;
                                                                                        if (n == -1025483366) break block18;
                                                                                        if (n == -846937437) break block19;
                                                                                        int cfr_ignored_0 = (Integer.rotateLeft(0xE5865999 ^ n2, 15) + -811435838) * -444180071;
                                                                                        int cfr_ignored_1 = (int)(0x2734F7A427D4EB4FL ^ (long)n2 ^ 0x1238831A2DB9E3B8L);
                                                                                        break block16;
                                                                                    }
                                                                                    if (n == -798952368) break block20;
                                                                                    if (n == -692805082) break block21;
                                                                                    break block16;
                                                                                }
                                                                                if (n > 31420897) break block22;
                                                                                if (n == -567097072) break block23;
                                                                                if (n == -261297741) break block24;
                                                                                if (n == 31420897) break block25;
                                                                                break block16;
                                                                            }
                                                                            if (n > 353432901) break block26;
                                                                            if (n == 256113379) break block27;
                                                                            if (n == 353432901) break block28;
                                                                            break block16;
                                                                        }
                                                                        if (n == 644309755) break block29;
                                                                        if (n == 1952564917) break block30;
                                                                        int cfr_ignored_2 = (Integer.rotateRight(0xF44B75B6 ^ n2, 17) - -1719607227) * -196381257;
                                                                        break block16;
                                                                    }
                                                                    int cfr_ignored_3 = Integer.rotateRight(0xF503FB22 ^ n2, 17) + -1344731047;
                                                                    sh.sqk();
                                                                    int cfr_ignored_4 = (int)(0x9BA8ADDEBE6BDA12L ^ (long)n2 ^ 0xA6CDB0644F029A80L);
                                                                    n3 = n2 - 353432901 + 1966599998 - 1966599998;
                                                                    n += 5;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_5 = (Integer.rotateLeft(0xAE57A671 ^ n2, 8) + 553305834) * -1369987471;
                                                                int cfr_ignored_6 = (int)(0x6CE5084C27D4EB4FL ^ (long)n2 ^ 0xEDE8831A2DB9741BL);
                                                                if (sh.thdz()) {
                                                                    int cfr_ignored_7 = (int)(0x5D7C378097DB80FCL ^ (long)n2 ^ 0x9271E304FADF1729L);
                                                                    n3 = (int)((long)(n2 - 353432901) ^ 0x56B6E3171A0B65C5L ^ 0x56B6E3171A0B65C5L);
                                                                    continue;
                                                                }
                                                                n3 = n2 - 2079563609 + 1820630382 - 1820630382;
                                                                int cfr_ignored_8 = Integer.rotateLeft(0xA9D4EA08 ^ n2, 8) + -1792674253;
                                                                n3 = n2 - -1025483366 + 1222460865 - 1222460865;
                                                                continue;
                                                            }
                                                            int cfr_ignored_9 = (Integer.rotateRight(0xE51D9B6 ^ n2, 4) - -1069089723) * 240245175;
                                                            f13 = f2 * f6;
                                                            f14 = f2 * f5;
                                                            f15 = f * f4 + f14 * f3;
                                                            f16 = -f * f3 + f14 * f4;
                                                            class_2872.method_22918(matrix4f, (float)d + f15, (float)d2 + f13, (float)d3 + f16).method_22913(f7, f8).method_22915(f9, f10, f11, f12);
                                                            return;
                                                        }
                                                        int cfr_ignored_10 = Integer.rotateRight(0xE3674CAB ^ n2, 15) + -1914705936;
                                                        n3 = (int)((long)(n2 - -1973757886) ^ 0xDE26152EE2252444L ^ 0xDE26152EE2252444L);
                                                        int cfr_ignored_11 = (Integer.rotateRight(0x38ED1896 ^ n2, 10) - -384591515) * 955062423;
                                                        int cfr_ignored_12 = (int)(0x980C418715C71B1EL ^ (long)n2 ^ 0x7E7EE73DCD1A9DC9L);
                                                        n3 = Integer.reverse(Integer.reverse(n2 - 31420897));
                                                        n += 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_13 = (Integer.rotateLeft(0x5AD716B5 ^ n2, 14) - 74014502) * 1524045493;
                                                    int cfr_ignored_14 = (int)(0x9865B88827D4EB4FL ^ (long)n2 ^ 0x8C60831A2DB89D1AL);
                                                    n3 = n2 - 356952519 ^ 0xDCB21AFB ^ 0xDCB21AFB;
                                                    int cfr_ignored_15 = Integer.rotateRight(0xD63418EB ^ n2, 13) + -190012496;
                                                    try {
                                                        n += 2;
                                                        if ((0x6B7AB92AF28BCC89L ^ (long)n2 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        n3 = n2 - 31420897 + -877705510 - -877705510;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n3 = Integer.reverse(Integer.reverse(n2 - 31420897));
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_16 = Integer.rotateRight(0x2929C7AA ^ n2, 8) + 7130321;
                                                n3 = n2 - -1477180169 + 2107422831 - 2107422831;
                                                int cfr_ignored_17 = (Integer.rotateLeft(0xB8AA0339 ^ n2, 10) + 1626604322) * -1196817607;
                                                int cfr_ignored_18 = (int)(0x7A18AD0427D4EB4FL ^ (long)n2 ^ 0xA778831A2DB959E0L);
                                                n3 = n2 - 31420897;
                                                continue;
                                            }
                                            int cfr_ignored_19 = (Integer.rotateLeft(0x98EDFF8 ^ n2, 4) + 749387331) * 160358393;
                                            n3 = Integer.reverse(Integer.reverse(n2 - 1365073137));
                                            int cfr_ignored_20 = (Integer.rotateLeft(0x9A5D4C19 ^ n2, 6) + -1247160766) * -1705161703;
                                            int cfr_ignored_21 = (int)(0x58EFE22427D4EB4FL ^ (long)n2 ^ 0x3938831A2DB91C0EL);
                                            try {
                                                if ((0xC296B90F64BC3E69L ^ (long)n2 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                n3 = n2 - 31420897;
                                            }
                                            catch (ArithmeticException arithmeticException) {
                                                n3 = n2 - 31420897 + 430904824 - 430904824;
                                            }
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_22 = Integer.rotateLeft(0x82C4C8A1 ^ n2, 3) + -634262854;
                                        int cfr_ignored_23 = (int)(0x4076669C27D4EB4FL ^ (long)n2 ^ 0x3048831A2DB92D3DL);
                                        n3 = n2 - 1382762414 ^ 0xE9D8981 ^ 0xE9D8981;
                                        int cfr_ignored_24 = (Integer.rotateLeft(0xA0BA4674 ^ n2, 7) - 2062296903) * -1598405003;
                                        int cfr_ignored_25 = (int)(0x683F8CE7FB071E44L ^ (long)n2 ^ 0xE4BF3ABDC7AF7DAEL);
                                        n3 = (int)((long)(n2 - -635042461) ^ 0x350210393394B901L ^ 0x350210393394B901L);
                                        int cfr_ignored_26 = (int)(0xC10DA6126837FD02L ^ (long)n2 ^ 0xB1541CDC01222FCAL);
                                        n3 = n2 - 31420897 ^ 0x1655E739 ^ 0x1655E739;
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_27 = Integer.rotateRight(0xB93DC7C3 ^ n2, 10) + 1926811608;
                                    n3 = Integer.reverse(Integer.reverse(n2 - 1796603099));
                                    int cfr_ignored_28 = (Integer.rotateLeft(0x87B69198 ^ n2, 3) + 1937326243) * -2018078311;
                                    n3 = n2 - 31420897;
                                    continue;
                                }
                                int cfr_ignored_29 = Integer.rotateLeft(0xDD2D36ED ^ n2, 14) - -858307090;
                                int cfr_ignored_30 = (int)(0x1F9F98D027D4EB4FL ^ (long)n2 ^ 0xCCD0831A2DB992EEL);
                                n3 = n2 - -854751780;
                                int cfr_ignored_31 = Integer.rotateLeft(0x540600C8 ^ n2, 13) + 823637875;
                                int cfr_ignored_32 = (int)(0x5B71060ABF0EE39AL ^ (long)n2 ^ 0xF165B2AE3C131B33L);
                                n3 = n2 - -1215084348 ^ 0x826D3BD7 ^ 0x826D3BD7;
                                int cfr_ignored_33 = (int)(0x14CE2D90D6D76D54L ^ (long)n2 ^ 0xA651611D218F844DL);
                                n3 = n2 - 31420897 + 1987400708 - 1987400708;
                                n += 2;
                                continue;
                            }
                            int cfr_ignored_34 = Integer.rotateRight(0xB8F15E0B ^ n2, 10) + 1771569808;
                            n3 = n2 - -439311406 + 346392797 - 346392797;
                            int cfr_ignored_35 = (Integer.rotateRight(0x1F39EA96 ^ n2, 6) - -866056347) * 523889303;
                            n3 = Integer.reverse(Integer.reverse(n2 - 31420897));
                            int cfr_ignored_36 = (Integer.rotateRight(0x80B436BE ^ n2, 3) - -1708113859) * -2135673153;
                            n += 3;
                            continue;
                        }
                        int cfr_ignored_37 = Integer.rotateRight(0x31F9A647 ^ n2, 9) - 295223764;
                        try {
                            n += 4;
                            if ((0xB1D368412D5B42DL ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = n2 - 31420897 + 127070185 - 127070185;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = n2 - 31420897 + -1877709166 - -1877709166;
                        }
                        n += 2;
                        continue;
                    }
                    int cfr_ignored_38 = Integer.rotateRight(0x706C7E4F ^ n2, 17) - -1585386804;
                    int cfr_ignored_39 = (int)(0xFF431BA6ACA7B59L ^ (long)n2 ^ 0x9E0419270D95B239L);
                    n3 = n2 - -863888769 + -2087546641 - -2087546641;
                    int cfr_ignored_40 = (int)(0x460D104C3D3D20FBL ^ (long)n2 ^ 0xDDE8B6C9BAD121CBL);
                    n3 = n2 - 31420897 + 315408431 - 315408431;
                    continue;
                }
                int cfr_ignored_41 = Integer.rotateRight(0x6B096303 ^ n2, 16) + -92234600;
                n3 = Integer.reverse(Integer.reverse(n2 - 31420897));
                int cfr_ignored_42 = (Integer.rotateRight(0xDB74FB52 ^ n2, 14) + -1752691159) * -613090477;
                ++n;
                continue;
            }
            int cfr_ignored_43 = Integer.rotateLeft(0xFB63D85 ^ n2, 4) - -345042346;
            int cfr_ignored_44 = (int)(0xCD0493B827D4EB4FL ^ (long)n2 ^ 0xDA00831A2DB837D8L);
            n3 = Integer.reverse(Integer.reverse(n2 - 31420897));
        }
    }

    private int za_2(bmdh bmdh2) {
        try {
            int n = 1242736675;
            n = Integer.rotateLeft(n * 119594575, 23) ^ 0xB47995D9;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
            int n2 = n ^ 0x550708EE;
            if ((n2 ^ n) != 1426524398) {
                int cfr_ignored_0 = (0x1F15A0CD ^ n) - 984064987;
            }
            if ((0x17A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.rfgh.shghkh()) {
            return sh.thzh_3().rk();
        }
        if (this.khf.shghkh()) {
            return sh.sht_10(sh.rwkh(this.dhmkh));
        }
        return bmdh2.znr;
    }

    private int zkht_4(int n, float f) {
        int n2 = -611294281;
        n2 = Integer.rotateLeft(n2 * -41189859, 20) ^ 0x37D5DC80;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 25)) ^ 0xFA6D402C;
        if ((n3 ^ n2) != -93503444) {
            int cfr_ignored_0 = (0x21FD239B ^ n2) + -1764353560;
        }
        int n4 = class_3532.method_15340((int)Math.round(f * Float.intBitsToFloat(-1048390869 + -2114179883)), (int)0, (int)(0x5B87FD84 ^ 0x5B87FD7B));
        return n4 << (Integer.reverse(-394431180) ^ 0x2CAEBE0F) | n & -1101867277 - -1118644492;
    }

    private Color khghd_2() {
        Color color = null;
        int n = 0;
        int n2 = -1853155085;
        n2 = Integer.rotateLeft(n2 * -703401387, 27) ^ 0x680560BC;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse((n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580));
        while (true) {
            block26: {
                block37: {
                    block41: {
                        block35: {
                            block36: {
                                block40: {
                                    block25: {
                                        block39: {
                                            block42: {
                                                block23: {
                                                    block30: {
                                                        block24: {
                                                            block28: {
                                                                block34: {
                                                                    block29: {
                                                                        block31: {
                                                                            block38: {
                                                                                block32: {
                                                                                    block33: {
                                                                                        block21: {
                                                                                            block27: {
                                                                                                block22: {
                                                                                                    if ((n = n3 - -1966905580 ^ 0x8AC36714 ^ n2) > 636426366) break block21;
                                                                                                    if (n > -1392108122) break block22;
                                                                                                    if (n == -1924229806) break block23;
                                                                                                    if (n == -1520961495) break block24;
                                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0xE7A77B9 ^ n2, 4) + -986571102) * 242907065;
                                                                                                    int cfr_ignored_1 = (int)(0xCCC8D98427D4EB4FL ^ (long)n2 ^ 0x4E78831A2DB83440L);
                                                                                                    if (n == -1392108122) break block25;
                                                                                                    break block26;
                                                                                                }
                                                                                                if (n > -866129069) break block27;
                                                                                                if (n == -1041386790) break block28;
                                                                                                if (n == -866129069) break block29;
                                                                                                int cfr_ignored_2 = (Integer.rotateLeft(0xCE35271 ^ n2, 4) + -1813734678) * 216224369;
                                                                                                int cfr_ignored_3 = (int)(0xCE51FC4C27D4EB4FL ^ (long)n2 ^ 0x5E8831A2DB83172L);
                                                                                                break block26;
                                                                                            }
                                                                                            if (n == 376802196) break block30;
                                                                                            if (n == 636426366) break block31;
                                                                                            break block26;
                                                                                        }
                                                                                        if (n > 1148664129) break block32;
                                                                                        if (n > 804100232) break block33;
                                                                                        if (n == 719673587) break block34;
                                                                                        if (n == 804100232) break block35;
                                                                                        break block26;
                                                                                    }
                                                                                    if (n == 912727191) break block36;
                                                                                    if (n == 1148664129) break block37;
                                                                                    int cfr_ignored_4 = Integer.rotateRight(0x866EEAC2 ^ n2, 3) + 1271663801;
                                                                                    break block26;
                                                                                }
                                                                                if (n > 2059644562) break block38;
                                                                                if (n == 1221221254) break block39;
                                                                                if (n == 2059644562) break block40;
                                                                                int cfr_ignored_5 = Integer.rotateLeft(0xC964B408 ^ n2, 12) + 1737452595;
                                                                                break block26;
                                                                            }
                                                                            if (n == 2060977444) break block41;
                                                                            if (n == 2090997056) break block42;
                                                                            break block26;
                                                                        }
                                                                        int cfr_ignored_6 = Integer.rotateRight(0x55E363E3 ^ n2, 13) + 1793505208;
                                                                        if (!yf.dnkh()) {
                                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x8CC12269 ^ 0x8AC36714) + -1966905580));
                                                                            int cfr_ignored_7 = Integer.rotateLeft(0x2E715CC5 ^ n2, 8) - -1541940458;
                                                                            int cfr_ignored_8 = (int)(0xECC3F2F827D4EB4FL ^ (long)n2 ^ 0x1880831A2DB87456L);
                                                                            n3 = (n2 ^ 0x2AE558F3 ^ 0x8AC36714) + -1966905580 ^ 0x2076D858 ^ 0x2076D858;
                                                                            ++n;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            n += 5;
                                                                            if ((0xB50CDF13275D8055L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new NoSuchElementException();
                                                                            }
                                                                            n3 = (n2 ^ 0xCC5FEB53 ^ 0x8AC36714) + -1966905580;
                                                                        }
                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xCC5FEB53 ^ 0x8AC36714) + -1966905580));
                                                                        }
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_9 = (Integer.rotateLeft(0xB7C87D55 ^ n2, 9) - 1168428166) * -1211597483;
                                                                    int cfr_ignored_10 = (int)(0x757AD36827D4EB4FL ^ (long)n2 ^ 0x5BA0831A2DB94724L);
                                                                    throw null;
                                                                }
                                                                int cfr_ignored_11 = Integer.rotateRight(0xB13B1C2 ^ n2, 4) + 1539319225;
                                                                ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
                                                                color = Color.getHSBColor(threadLocalRandom.nextFloat(), (float)threadLocalRandom.nextDouble(Double.longBitsToDouble(0x6FC483EA46CA0750L ^ 0x50251A73DF539ECAL), sh.shfs_2(0xA85CCA9FD92A208BL ^ 0x97B2ACF9BF4C46EDL)), 1.0f);
                                                                n3 = (n2 ^ 0xCD588B4 ^ 0x8AC36714) + -1966905580 ^ 0xB9D9B189 ^ 0xB9D9B189;
                                                                int cfr_ignored_12 = Integer.rotateLeft(0x1421A6A0 ^ n2, 5) + 1953549467;
                                                                n3 = (n2 ^ 0x44773941 ^ 0x8AC36714) + -1966905580;
                                                                n += 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_13 = Integer.rotateLeft(0xAA169A0C ^ n2, 8) - -1659222353;
                                                            try {
                                                                n += 3;
                                                                n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 ^ 0x14F94E5 ^ 0x14F94E5;
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 + -1652157639 - -1652157639;
                                                            }
                                                            n -= 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_14 = (Integer.rotateRight(0x198386B3 ^ n2, 6) + 457895656) * 428050099;
                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA3EF4EFC ^ 0x8AC36714) + -1966905580));
                                                        int cfr_ignored_15 = Integer.rotateRight(0xCB1E41A2 ^ n2, 12) + -1660448295;
                                                        n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 ^ 0xFF195810 ^ 0xFF195810;
                                                        continue;
                                                    }
                                                    int cfr_ignored_16 = (Integer.rotateRight(0x5F183D9B ^ n2, 14) + -2008214272) * 1595424155;
                                                    n3 = (n2 ^ 0x7C4193E5 ^ 0x8AC36714) + -1966905580 ^ 0xBD266741 ^ 0xBD266741;
                                                    int cfr_ignored_17 = Integer.rotateRight(0x23D9BBE3 ^ n2, 7) + 1539006392;
                                                    try {
                                                        n3 = (int)((long)((n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580) ^ 0xB7C2980D3F604F23L ^ 0xB7C2980D3F604F23L);
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 + -2145545674 - -2145545674;
                                                    }
                                                    --n;
                                                    continue;
                                                }
                                                int cfr_ignored_18 = Integer.rotateRight(0x912049C6 ^ n2, 5) - -1756983755;
                                                n3 = (n2 ^ 0xF12AC1BB ^ 0x8AC36714) + -1966905580 + 116961791 - 116961791;
                                                int cfr_ignored_19 = (Integer.rotateLeft(0x8D2FE035 ^ n2, 4) - 489276838) * -1926242251;
                                                int cfr_ignored_20 = (int)(0x4F9D4E0827D4EB4FL ^ (long)n2 ^ 0x6160831A2DB932EBL);
                                                int cfr_ignored_21 = (int)(0x4EAE906C89331614L ^ (long)n2 ^ 0xDDA9DED5D70F308CL);
                                                n3 = (n2 ^ 0x7F82E4F3 ^ 0x8AC36714) + -1966905580;
                                                int cfr_ignored_22 = (int)(0x86EB8F75B5973BF4L ^ (long)n2 ^ 0xE39BA79D8CCEA006L);
                                                n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580;
                                                n += 4;
                                                continue;
                                            }
                                            int cfr_ignored_23 = Integer.rotateLeft(0xCBD28289 ^ n2, 12) + -1294242350;
                                            int cfr_ignored_24 = (int)(0x9602CB427D4EB4FL ^ (long)n2 ^ 0xA418831A2DB9BF11L);
                                            try {
                                                n += 2;
                                                if ((0x42D4120A9C4AE109L ^ (long)n2 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 + 163083071 - 163083071;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580;
                                            }
                                            n -= 5;
                                            continue;
                                        }
                                        int cfr_ignored_25 = (Integer.rotateLeft(0x1AB26CFC ^ n2, 6) - 1073271231) * 447900925;
                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x2A6E7045 ^ 0x8AC36714) + -1966905580));
                                        int cfr_ignored_26 = (Integer.rotateRight(0x5C06501F ^ n2, 14) - 690049788) * 1543917599;
                                        n3 = (n2 ^ 0xA6DE194 ^ 0x8AC36714) + -1966905580 + -1826768502 - -1826768502;
                                        int cfr_ignored_27 = (Integer.rotateLeft(0x6D86A219 ^ n2, 16) + 1202405442) * 1837539865;
                                        int cfr_ignored_28 = (int)(0xAF340C2427D4EB4FL ^ (long)n2 ^ 0xE538831A2DB8F3B9L);
                                        n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 + -1921853388 - -1921853388;
                                        n += 2;
                                        continue;
                                    }
                                    int cfr_ignored_29 = (Integer.rotateLeft(0xCF2E563D ^ n2, 12) - 452595870) * -819046851;
                                    int cfr_ignored_30 = (int)(0xD9CF80027D4EB4FL ^ (long)n2 ^ 0xD70831A2DB9B6E8L);
                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xCE256AEA ^ 0x8AC36714) + -1966905580));
                                    int cfr_ignored_31 = (Integer.rotateLeft(0xE2562515 ^ n2, 15) - 0x6CCC1CC6) * -497670891;
                                    int cfr_ignored_32 = (int)(0x20E48B2827D4EB4FL ^ (long)n2 ^ 0xEB20831A2DB9EC18L);
                                    int cfr_ignored_33 = (int)(0x275824D2D1D9F420L ^ (long)n2 ^ 0xB4D56F001367E361L);
                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x610A9C74 ^ 0x8AC36714) + -1966905580));
                                    int cfr_ignored_34 = (int)(0x762F506FE6874F2FL ^ (long)n2 ^ 0x5DAF01BD6579418FL);
                                    n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 ^ 0xA0E348FB ^ 0xA0E348FB;
                                    --n;
                                    continue;
                                }
                                int cfr_ignored_35 = Integer.rotateLeft(0xEA4DEDC5 ^ n2, 16) - 1674406422;
                                int cfr_ignored_36 = (int)(0x28FF43F827D4EB4FL ^ (long)n2 ^ 0x7A80831A2DB9FC2FL);
                                n3 = (n2 ^ 0x1286AA98 ^ 0x8AC36714) + -1966905580 + 761694186 - 761694186;
                                int cfr_ignored_37 = (Integer.rotateRight(0x5E7C217E ^ n2, 14) - 1969597821) * 1585193343;
                                try {
                                    if ((0xD80FBC6DCDEE5EE7L ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 + -496434952 - -496434952;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 ^ 0x205116A6 ^ 0x205116A6;
                                }
                                --n;
                                continue;
                            }
                            int cfr_ignored_38 = Integer.rotateLeft(0x27990B24 ^ n2, 7) - -807012201;
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x30AA42B4 ^ 0x8AC36714) + -1966905580));
                            int cfr_ignored_39 = (Integer.rotateLeft(0xDADA9814 ^ n2, 14) - -2066347609) * -623208427;
                            n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 + 7361247 - 7361247;
                            continue;
                        }
                        int cfr_ignored_40 = Integer.rotateLeft(0x6A48D545 ^ n2, 16) - -483429738;
                        int cfr_ignored_41 = (int)(0xA8FA7B7827D4EB4FL ^ (long)n2 ^ 0xB80831A2DB8FC25L);
                        try {
                            n += 4;
                            if ((0xFD6631387044D695L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580 + -536789809 - -536789809;
                        }
                        n += 4;
                        continue;
                    }
                    int cfr_ignored_42 = Integer.rotateLeft(0x6BB3888 ^ n2, 3) + -720799821;
                    try {
                        if ((0x93245C3D40558741L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)((n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580) ^ 0x17C9A31E847C177EL ^ 0x17C9A31E847C177EL);
                    }
                    n += 2;
                    continue;
                }
                return color;
            }
            int cfr_ignored_43 = Integer.rotateLeft(0x73F10625 ^ n2, 17) - 244145590;
            int cfr_ignored_44 = (int)(0xB143A81827D4EB4FL ^ (long)n2 ^ 0xAD40831A2DB8CF56L);
            n3 = (int)((long)((n2 ^ 0x25EF187E ^ 0x8AC36714) + -1966905580) ^ 0x9E79778BCC269303L ^ 0x9E79778BCC269303L);
        }
    }

    private void ala_2(shw_3 shw2) {
        int n = -1168412634;
        int n2 = (n = Integer.rotateLeft(n * -300176081, 21) ^ 0x3CE059D3) ^ 0x8F88D4D7;
        if ((n2 ^ n) != -1886858025) {
            int cfr_ignored_0 = (0x35D3A4F1 ^ n) + -1140285737;
        }
        this.sdhth_2(shw2.ssha_2(), shw2.skz_4());
    }

    private void thshsh(btt btt2) {
        int n = 526127161;
        n = Integer.rotateLeft(n * 329679715, 6) ^ 0xEA16F24A;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 15);
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0xF0F4EF94;
        if ((n2 ^ n) != -252383340) {
            int cfr_ignored_0 = (0xEFA8FFAD ^ n) + 2089518168;
        }
        this.dma_4();
    }

    private boolean sns_2() {
        int n = -1501556873;
        n = Integer.rotateLeft(n * 1958197163, 13) ^ 0x42595705;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xCFC8EFAC;
        if ((n2 ^ n) != -808915028) {
            int cfr_ignored_0 = (0x6948E0DB ^ n) + -1684236798;
        }
        return !this.khf.shghkh();
    }

    private static String thrh(String string, int n, int n2, int n3) {
        try {
            int n4 = -1938855093;
            n4 = Integer.rotateLeft(n4 * -1496807957, 27) ^ 0x4E4FD497;
            n4 = n ^ n4;
            n4 = Integer.rotateLeft(n2 ^ n4, 14);
            int n5 = n4 ^ 0x22BEB34F;
            if ((n5 ^ n4) != 582923087) {
                int cfr_ignored_0 = (0xAED1D804 ^ n4) + -1555817110;
            }
            if ((0x95 & 0) != 0) {
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
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x1E7A0A7D ^ n2 - i) + bsf, 26) ^ ddth_2 + i * -2083241413));
        }
        return new String(cArray);
    }

    private static double ams(double d) {
        block0: {
            int n = tth_3.khhn_2(1269879469);
            int n2 = n ^ 0xADCB95D0;
            if ((n2 ^ n) == -1379166768) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE67B477D ^ n, 15) - -313833634) * -428128387;
            int cfr_ignored_1 = (int)(0x24C9E94027D4EB4FL ^ (long)n ^ 0x2FF0831A2DB9E442L);
        }
        return Math.sin(d);
    }

    private static float thgh_5(tay tay2) {
        block0: {
            int n = -383833018;
            int n2 = (n = Integer.rotateLeft(n * -2097330493, 3) ^ 0xE46FED2A) ^ 0xBB1021E8;
            if ((n2 ^ n) == -1156570648) break block0;
            int cfr_ignored_0 = (0x520F0DAE ^ n) + -1695391820;
        }
        return tay2.thw_5();
    }

    private static double ztj(long l) {
        block0: {
            int n = 211071615;
            n = Integer.rotateLeft(n * 1197423865, 12) ^ 0x2E1921C;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 14)) ^ 0xFC42B2C5;
            if ((n2 ^ n) == -62737723) break block0;
            int cfr_ignored_0 = (0xF0D600BA ^ n) + 1497891651;
        }
        return Double.longBitsToDouble(l);
    }

    private static double tshth(double d) {
        block0: {
            int n = tth_3.khhn_2(-756658512);
            int n2 = n ^ 0x22005198;
            if ((n2 ^ n) == 570446232) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF0E61F28 ^ n, 17) + 809198867;
        }
        return Math.toRadians(d);
    }

    private static double tghz_2(double d) {
        block0: {
            int n = -1873113899;
            n = Integer.rotateLeft(n * 1674885319, 21) ^ 0xA82EBAEB;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xC5336E8F;
            if ((n2 ^ n) == -986485105) break block0;
            int cfr_ignored_0 = (0x5569E25A ^ n) - -879169647;
        }
        return Math.sin(d);
    }

    private static int dmgh_2(int n) {
        block0: {
            int n2 = -478925616;
            n2 = Integer.rotateLeft(n2 * -1986625867, 7) ^ 0xC4E48E76;
            int n3 = (n2 = n ^ n2) ^ 0x57E50587;
            if ((n3 ^ n2) == 1474626951) break block0;
            int cfr_ignored_0 = (0xB4912957 ^ n2) + 1596245408;
        }
        return Integer.reverse(n);
    }

    private static int dhght(int n) {
        block0: {
            int n2 = -884018491;
            n2 = Integer.rotateLeft(n2 * -805541263, 22) ^ 0x8585E7FF;
            int n3 = (n2 = n ^ n2) ^ 0xED1C9084;
            if ((n3 ^ n2) == -316895100) break block0;
            int cfr_ignored_0 = (0x26526241 ^ n2) + -298383754;
        }
        return Integer.reverse(n);
    }

    private static float ththt_2(int n) {
        block0: {
            int n2 = 1524908845;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1469623929, 17) ^ 0xF6DF51B2) ^ 0x9465BBCE;
            if ((n3 ^ n2) == -1805272114) break block0;
            int cfr_ignored_0 = (0xCE81F8E3 ^ n2) + -839123932;
        }
        return Float.intBitsToFloat(n);
    }

    private static void bsh_3(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        int n = 31632090;
        n = Integer.rotateLeft(n * -1865648449, 19) ^ 0x8DAE7F7C;
        class_287 class_2873 = class_2872;
        n = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n;
        Matrix4f matrix4f2 = matrix4f;
        n = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n;
        int n2 = n ^ 0x9168D978;
        if ((n2 ^ n) != -1855399560) {
            int cfr_ignored_0 = (0x908A73A2 ^ n) - -1142260305;
        }
        sh.ssr(class_2872, matrix4f, d, d2, d3, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12);
    }

    private static boolean thdz() {
        block0: {
            int n = 1886845259;
            int n2 = (n = Integer.rotateLeft(n * -1996113503, 15) ^ 0x7093EDF8) ^ 0x42903AFD;
            if ((n2 ^ n) == 1116748541) break block0;
            int cfr_ignored_0 = (0x32E6C3B6 ^ n) - -668151855;
        }
        return yf.khdha_2();
    }

    private static void sqk() {
        int n = -775478894;
        int n2 = (n = Integer.rotateLeft(n * -1195845171, 14) ^ 0xA28FE4EC) ^ 0xBE6B88C;
        if ((n2 ^ n) != 199669900) {
            int cfr_ignored_0 = (0xDA21991E ^ n) + 32340358;
        }
        yf.athz_2();
    }

    private static byq thzh_3() {
        block0: {
            int n = 1814623784;
            int n2 = (n = Integer.rotateLeft(n * 1257250323, 20) ^ 0xDEEE1DCA) ^ 0xCFD676D0;
            if ((n2 ^ n) == -808028464) break block0;
            int cfr_ignored_0 = (0xA3FE80F8 ^ n) - -1354159869;
        }
        return bhj_2.ths();
    }

    private static byq rwkh(bzw_2 bzw2_2) {
        block0: {
            int n = -624813625;
            n = Integer.rotateLeft(n * -1588985037, 24) ^ 0xFD4B9524;
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0xE6D82E58;
            if ((n2 ^ n) == -422039976) break block0;
            int cfr_ignored_0 = (0x3C1A379F ^ n) + -1733933863;
        }
        return bzw2_2.sdsh_4();
    }

    private static int sht_10(byq byq2) {
        block0: {
            int n = 152865092;
            n = Integer.rotateLeft(n * -346535203, 19) ^ 0x81AA551B;
            byq byq3 = byq2;
            n = Integer.rotateRight((byq3 != null ? System.identityHashCode(byq3) : 0) ^ n, 9);
            int n2 = n ^ 0x7EE4D0D5;
            if ((n2 ^ n) == 2128924885) break block0;
            int cfr_ignored_0 = (0x77F85991 ^ n) + -1174956406;
        }
        return byq2.rk();
    }

    private static double shfs_2(long l) {
        block0: {
            int n = tth_3.khhn_2(-542252092);
            int n2 = (n = Integer.rotateRight((int)l ^ n, 21)) ^ 0xCF9918CF;
            if ((n2 ^ n) == -812050225) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1034FB0B ^ n, 5) + -87554672;
        }
        return Double.longBitsToDouble(l);
    }

    private static String[] thas_2(String string) {
        int n = 1147664172;
        n = Integer.rotateLeft(n * -560705319, 11) ^ 0x66FACC92;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
        int n2 = n ^ 0x83D52A52;
        if ((n2 ^ n) != -2083181998) {
            int cfr_ignored_0 = (0xC7B2DD7E ^ n) + -57077584;
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

    private static CallSite h_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1030501816;
            n3 = Integer.rotateLeft(n3 * -594658193, 10) ^ 0xED95473D;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 16);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xD4A6D1F1;
            if ((n4 ^ n3) != -727264783) {
                int cfr_ignored_0 = (0x16351BB9 ^ n3) + 42392451;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dkk ^ string.hashCode()) + (n2 + dzkh) + i ^ dkk, 5) + dzkh);
            }
            String[] stringArray = sh.thas_2(new String(cArray));
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

    private static String[] r14xjupai(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite frnyrzvwy8vtg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ iv4v505o9vh7u ^ string.hashCode() ^ n2 + oglxragto93 + i * 1220038643) + iv4v505o9vh7u) ^ oglxragto93));
            }
            String[] stringArray = sh.r14xjupai(new String(cArray));
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

