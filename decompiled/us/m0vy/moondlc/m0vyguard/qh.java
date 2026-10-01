/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
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
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bqk;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.tzth;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.yf;

public final class qh
extends tzth {
    private static final int thgh = 0;
    private static final int jghy = 1;
    private static final int thfgh = 2;
    private static final int rns_2 = 3;
    private static final int blb = 8;
    private static final long btm = 1000000L;
    private static final double kgh = 1.0E9;
    private static final float jydh = (float)Math.PI * 2;
    private static final int dghq = 6;
    private static final int jky = 16;
    private static final float[][] smh;
    private static final float[][] zakh;
    private static final float[][] bwh_2;
    private static final float[][] saf_3;
    private final double[] nt_2 = new double[3];
    private final double[] shshq = new double[3];
    private final double[] sha_7 = new double[3];
    private final long[] khbm = new long[3];
    private final long[] hjq = new long[3];
    private final int[] bfa_2 = new int[Integer.rotateLeft(0x69176273 ^ 0x69576273, 13)];
    private final int[] thkgh = new int[-91229046 - -91229054];
    private final long thdht_2 = System.nanoTime();
    private int sdf_2 = 1089316237 + 1058167411;
    private int hmd = 1;
    private int hsf = 1;
    private int shta_2 = Integer.rotateLeft(0x5838B768 ^ 0x5828B768, 11);
    private long thshgh = 0x61CDEEBCC3A8D48EL ^ 0xE1CDEEBCC3A8D48EL;
    private int sqk = -1270543372 + -876940276;
    private int hdhn;
    private static final int bsl_2 = 592002071;
    private static final int str = 1534065020;
    private static final int ghz = -738858867;
    private static final int sdhsh_2 = -2084739808;
    private static final int t7ruwud4 = -607847632;
    private static final int mv82z17su = -878544476;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fkazuree;

    @Override
    public void ththd() {
        class_1309 class_13092 = this.dhagh_2();
        if (class_13092 == null || class_13092.method_31481()) {
            this.sdf_2 = Integer.MIN_VALUE;
        }
    }

    public void rds_3(class_1297 class_12972) {
        class_1309 class_13092;
        try {
            int n = 1143816426;
            n = Integer.rotateLeft(n * -1675563973, 10) ^ 0xDAB69172;
            int n2 = n ^ 0x8D1D9583;
            if ((n2 ^ n) != -1927441021) {
                int cfr_ignored_0 = (0xC930D569 ^ n) + 1148506346;
            }
            if ((0x3E5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            qh.shtm_2();
            throw null;
        }
        if (!(class_12972 instanceof class_1309) || qh.tks_3(class_13092 = (class_1309)class_12972)) {
            return;
        }
        int n = qh.ddd_2(class_13092);
        class_1309 class_13093 = this.dhagh_2();
        if (class_13093 == null || class_13093.method_5628() != n) {
            if (this.sqk != n) {
                this.sqk = n;
                this.hdhn = 0;
            }
            this.hdhn = Math.min(1231800461 + -1231800453, this.hdhn + 1);
            return;
        }
        tdhz_2 tdhz2_2 = qh.hth_2();
        long l = System.nanoTime();
        if (this.sdf_2 != n) {
            qh.dqh_2(this, n);
        }
        this.hksh(n, tdhz2_2, l);
        qh.ztd_2(this, n, tdhz2_2, l);
    }

    private void dyt(int n, tdhz_2 tdhz2_2, long l) {
        long l2;
        try {
            int n2 = 1055000445;
            n2 = Integer.rotateLeft(n2 * -1733845313, 22) ^ 0xDE6BFDF4;
            tdhz_2 tdhz3_2 = tdhz2_2;
            n2 = (tdhz3_2 != null ? System.identityHashCode(tdhz3_2) : 0) ^ n2;
            int n3 = n2 ^ 0xB1DB5C3C;
            if ((n3 ^ n2) != -1311024068) {
                int cfr_ignored_0 = (0x8F395B41 ^ n2) - 909097131;
            }
            if ((0x34A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        int n4 = this.ghjh_2(tdhz2_2);
        double d = qh.dshn(this, n4, l, tdhz2_2);
        double d2 = tdhz2_2.hghdh().thw_5();
        int n5 = this.rzkh_2(tdhz2_2);
        this.nt_2[n4] = d;
        this.shshq[n4] = this.saf(this.shshq[n4], d2) + d2 * (double)n5;
        this.khbm[n4] = l;
        this.hjq[n4] = l2 = Math.max(1L, (long)Math.round(qh.dhst_3(tdhz2_2.jmb()))) * (0x9164F9CD18AB730L ^ 0x9164F9CD185F570L);
        this.shta_2 = n;
        this.thshgh = l;
    }

    public void jwgh() {
        int n = -42630864;
        n = Integer.rotateLeft(n * -884262409, 23) ^ 0x6C038F44;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0xEE8FEF6F;
        if ((n2 ^ n) != -292556945) {
            int cfr_ignored_0 = (0x13FA6E5F ^ n) + -426393178;
        }
        this.sdf_2 = Integer.rotateLeft(0x9F61BBC1 ^ 0x9F63BBC1, 14);
        this.shta_2 = 101754138 + 2045729510;
        this.thshgh = 0x2F4AB710BFC715A2L ^ 0xAF4AB710BFC715A2L;
        this.sqk = 500779122 - -1646704526;
        this.hdhn = 0;
        this.hmd = 1;
        this.hsf = 1;
        this.ghdz();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void ht_2(shw_3 shw2) {
        class_1309 class_13092 = this.dhagh_2();
        float f = this.ghsht();
        if (class_13092 == null || class_13092.method_31481() || f <= 0.001f) {
            return;
        }
        int n = class_13092.method_5628();
        if (this.sdf_2 != n) {
            this.dhal_2(n);
        }
        tdhz_2 tdhz2_2 = tdhz_2.trb();
        long l = System.nanoTime();
        this.hksh(n, tdhz2_2, l);
        double d = this.tdj(0, l, tdhz2_2) + (double)tdhz2_2.tws().thw_5();
        double d2 = this.tdj(1, l, tdhz2_2) + (double)tdhz2_2.jhdh().thw_5();
        double d3 = this.tdj(2, l, tdhz2_2);
        d2 += this.ghkhz_2(l) * (double)tdhz2_2.dkt().thw_5() % 360.0;
        float f2 = shw2.skz_4();
        float f3 = Math.max(0.0f, class_3532.method_16439((float)f2, (float)this.khkkh, (float)((float)ls_2.khbk())));
        float f4 = this.sfsh(l, tdhz2_2);
        float f5 = f3 * f4;
        if (f5 <= 0.001f) {
            return;
        }
        float f6 = tdhz2_2.zam().thw_5() * f5;
        float f7 = f6 * 0.5f;
        float f8 = tdhz2_2.hkht().thw_5() / 100.0f;
        float f9 = Math.min(f7, f6 * f8);
        float f10 = tdhz2_2.khsn_2().thw_5() * f5;
        float f11 = tdhz2_2.baq().thw_5();
        int n2 = class_3532.method_15340((int)Math.round(tdhz2_2.skt_3().thw_5()), (int)3, (int)10);
        int n3 = class_3532.method_15340((int)Math.round(tdhz2_2.znj().thw_5()), (int)6, (int)16);
        this.tdhy(tdhz2_2);
        float f12 = this.dat_7(l, n, tdhz2_2);
        int n4 = tdhz2_2.rdl().sdsh_4().rk();
        float f13 = class_3532.method_15363((float)(f * tdhz2_2.khzkh_2().thw_5()), (float)0.0f, (float)1.0f);
        class_243 class_2432 = this.thnz_2(class_13092);
        class_243 class_2433 = shw2.dhal().method_19326();
        class_4587 class_45872 = shw2.ssha_2();
        class_45872.method_22903();
        try {
            class_45872.method_22904(class_2432.field_1352 - class_2433.field_1352, class_2432.field_1351 - class_2433.field_1351 + (double)(class_13092.method_17682() * tdhz2_2.shsr().thw_5() / 100.0f), class_2432.field_1350 - class_2433.field_1350);
            if (tdhz2_2.shaj_2().shzl()) {
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(-shw2.dhal().method_19330()));
            }
            class_45872.method_22907(class_7833.field_40714.rotationDegrees((float)d));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)d2));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)d3));
            RenderSystem.enableBlend();
            RenderSystem.disableCull();
            RenderSystem.depthMask((boolean)false);
            if (tdhz2_2.that_2().shzl()) {
                RenderSystem.disableDepthTest();
            } else {
                RenderSystem.enableDepthTest();
            }
            RenderSystem.setShader((class_10156)class_10142.field_53876);
            float f14 = tdhz2_2.syt_4().thw_5();
            if (f14 > 0.001f) {
                RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                float f15 = tdhz2_2.zbm().thw_5();
                int n5 = Math.max(3, n2 / 2 + 1);
                int n6 = Math.max(6, n3 - 4);
                this.atq(class_45872.method_23760().method_23761(), f7, f9, f10 * f15 * 1.35f, f11, n5, n6, f13 * f14 * 0.045f, f12, n4, this.thkgh);
                this.atq(class_45872.method_23760().method_23761(), f7, f9, f10 * f15, f11, n5, n6, f13 * f14 * 0.1f, f12, n4, this.thkgh);
            }
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
            this.atq(class_45872.method_23760().method_23761(), f7, f9, f10, f11, n2, n3, f13, f12, n4, this.bfa_2);
        }
        finally {
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
            RenderSystem.enableCull();
            RenderSystem.depthMask((boolean)true);
            RenderSystem.enableDepthTest();
            class_45872.method_22909();
        }
    }

    private void atq(Matrix4f matrix4f, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, int n3, int[] nArray) {
        int n4 = n3 >> 16 & 0xFF;
        int n5 = n3 >> 8 & 0xFF;
        int n6 = n3 & 0xFF;
        int n7 = class_3532.method_15340((int)Math.round(f5 * 255.0f), (int)0, (int)255);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        int n8 = 0;
        for (int i = -1; i <= 1; i += 2) {
            for (int j = -1; j <= 1; j += 2) {
                for (int k = -1; k <= 1; k += 2) {
                    int n9 = nArray[n8++];
                    int n10 = this.rthy(n9 >> 16 & 0xFF, n4, f6);
                    int n11 = this.rthy(n9 >> 8 & 0xFF, n5, f6);
                    int n12 = this.rthy(n9 & 0xFF, n6, f6);
                    float f7 = (float)i * f;
                    float f8 = (float)j * f;
                    float f9 = (float)k * f;
                    this.sdr_4(class_2872, matrix4f, f7, f8, f9, f3, n2, n10, n11, n12, n7);
                    this.skhh_2(class_2872, matrix4f, f7, f8, f9, i, j, k, 0, f2, f, f4, f3, n, n2, n10, n11, n12, n7);
                    this.skhh_2(class_2872, matrix4f, f7, f8, f9, i, j, k, 1, f2, f, f4, f3, n, n2, n10, n11, n12, n7);
                    this.skhh_2(class_2872, matrix4f, f7, f8, f9, i, j, k, 2, f2, f, f4, f3, n, n2, n10, n11, n12, n7);
                }
            }
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private void skhh_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, int n, int n2, int n3, int n4, float f4, float f5, float f6, float f7, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11 = 186046455;
        n11 = Integer.rotateLeft(n11 * 2140297985, 24) ^ 0x54037242;
        class_287 class_2873 = class_2872;
        n11 = Integer.rotateRight((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n11, 9);
        Matrix4f matrix4f2 = matrix4f;
        n11 = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n11;
        int n12 = n11 ^ 0x119CB8B2;
        if ((n12 ^ n11) != 295483570) {
            int cfr_ignored_0 = (0x1A8A6F45 ^ n11) - -266805444;
        }
        float f8 = f - (n4 == 0 ? (float)n * f4 : 0.0f);
        float f9 = f2 - (n4 == 1 ? (float)n2 * f4 : 0.0f);
        float f10 = f3 - (n4 == 2 ? (float)n3 * f4 : 0.0f);
        float f11 = 1.0f - f6;
        float f12 = n4 == 0 ? (f + f8) * qh.hzn(Integer.reverse(-1493084773) ^ 0xE6AA80E5) : (float)n * f5 * f11;
        float f13 = n4 == 1 ? (f2 + f9) * qh.aas_3(-1477500235 - 1760502453) : (float)n2 * f5 * f11;
        float f14 = n4 == 2 ? (f3 + f10) * qh.tnw_2(-2049707697 + -1188294991) : (float)n3 * f5 * f11;
        float f15 = f;
        float f16 = f2;
        float f17 = f3;
        for (int i = 1; i <= n5; ++i) {
            float f18 = (float)i / (float)n5;
            float f19 = 1.0f - f18;
            float f20 = f19 * f19;
            float f21 = 2.0f * f19 * f18;
            float f22 = f18 * f18;
            float f23 = f20 * f + f21 * f12 + f22 * f8;
            float f24 = f20 * f2 + f21 * f13 + f22 * f9;
            float f25 = f20 * f3 + f21 * f14 + f22 * f10;
            this.bdd(class_2872, matrix4f, f15, f16, f17, f23, f24, f25, f7, n6, n7, n8, n9, n10);
            if (i == n5) {
                this.sdr_4(class_2872, matrix4f, f23, f24, f25, f7, n6, n7, n8, n9, n10);
            }
            f15 = f23;
            f16 = f24;
            f17 = f25;
        }
    }

    private void bdd(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, int n, int n2, int n3, int n4, int n5) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int n6 = -2071880809;
        n6 = Integer.rotateLeft(n6 * 1404064479, 6) ^ 0xB097B202;
        Matrix4f matrix4f2 = matrix4f;
        n6 = Integer.rotateLeft((matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n6, 17);
        n6 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n6, 11);
        int n7 = n6 ^ 0x79E2FDDC;
        if ((n7 ^ n6) != 2044919260) {
            int cfr_ignored_0 = (0xFD63664B ^ n6) + 1977899051;
        }
        if ((f14 = (f13 = f4 - f) * f13 + (f12 = f5 - f2) * f12 + (f11 = f6 - f3) * f11) <= Float.intBitsToFloat(-2082042819 - 1371193286)) {
            return;
        }
        float f15 = class_3532.method_48119((float)f14);
        float f16 = f7 * Float.intBitsToFloat(0xE9D90D84 ^ 0xD6D5C149);
        float f17 = f - (f13 *= f15) * f16;
        float f18 = f2 - (f12 *= f15) * f16;
        float f19 = f3 - (f11 *= f15) * f16;
        float f20 = f4 + f13 * f16;
        float f21 = f5 + f12 * f16;
        float f22 = f6 + f11 * f16;
        if (Math.abs(f12) < Float.intBitsToFloat(0xCB6998B3 ^ 0xF40FFED5)) {
            f10 = -f11;
            f9 = 0.0f;
            f8 = f13;
        } else {
            f10 = 0.0f;
            f9 = f11;
            f8 = -f12;
        }
        float f23 = f10 * f10 + f9 * f9 + f8 * f8;
        float f24 = class_3532.method_48119((float)f23);
        float f25 = f12 * (f8 *= f24) - f11 * (f9 *= f24);
        float f26 = f11 * (f10 *= f24) - f13 * f8;
        float f27 = f13 * f9 - f12 * f10;
        float[] fArray = smh[n];
        float[] fArray2 = zakh[n];
        for (int i = 0; i < n; ++i) {
            int n8 = i + 1 == n ? 0 : i + 1;
            float f28 = (f10 * fArray[i] + f25 * fArray2[i]) * f7;
            float f29 = (f9 * fArray[i] + f26 * fArray2[i]) * f7;
            float f30 = (f8 * fArray[i] + f27 * fArray2[i]) * f7;
            float f31 = (f10 * fArray[n8] + f25 * fArray2[n8]) * f7;
            float f32 = (f9 * fArray[n8] + f26 * fArray2[n8]) * f7;
            float f33 = (f8 * fArray[n8] + f27 * fArray2[n8]) * f7;
            qh.sks_2(this, class_2872, matrix4f, f17 + f28, f18 + f29, f19 + f30, f20 + f28, f21 + f29, f22 + f30, f20 + f31, f21 + f32, f22 + f33, n2, n3, n4, n5);
            qh.zghgh(this, class_2872, matrix4f, f17 + f28, f18 + f29, f19 + f30, f20 + f31, f21 + f32, f22 + f33, f17 + f31, f18 + f32, f19 + f33, n2, n3, n4, n5);
        }
    }

    private void sdr_4(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4, int n5) {
        try {
            int n6 = 957382401;
            n6 = Integer.rotateLeft(n6 * 615075917, 23) ^ 0xAB12FF58;
            n6 = System.identityHashCode(this) ^ n6;
            n6 = Float.floatToIntBits(f) ^ n6;
            int n7 = n6 ^ 0xA6F20E58;
            if ((n7 ^ n6) != -1494086056) {
                int cfr_ignored_0 = (0x9FE27159 ^ n6) + 1600250493;
            }
            if ((0x272 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (qh.bdq_2()) {
            throw null;
        }
        float[] fArray = smh[n];
        float[] fArray2 = zakh[n];
        float[] fArray3 = bwh_2[n];
        float[] fArray4 = saf_3[n];
        int n8 = fArray3.length - 1;
        for (int i = 0; i < n8; ++i) {
            float f5 = f4 * fArray3[i];
            float f6 = f2 + f4 * fArray4[i];
            float f7 = f4 * fArray3[i + 1];
            float f8 = f2 + f4 * fArray4[i + 1];
            for (int j = 0; j < n; ++j) {
                int n9 = j + 1 == n ? 0 : j + 1;
                float f9 = f + f5 * fArray[j];
                float f10 = f3 + f5 * fArray2[j];
                float f11 = f + f5 * fArray[n9];
                float f12 = f3 + f5 * fArray2[n9];
                float f13 = f + f7 * fArray[j];
                float f14 = f3 + f7 * fArray2[j];
                float f15 = f + f7 * fArray[n9];
                float f16 = f3 + f7 * fArray2[n9];
                if (i == 0) {
                    qh.tkhn_2(this, class_2872, matrix4f, f, f6, f3, f15, f8, f16, f13, f8, f14, n2, n3, n4, n5);
                    continue;
                }
                if (i == n8 - 1) {
                    this.tsht_2(class_2872, matrix4f, f9, f6, f10, f11, f6, f12, f, f8, f3, n2, n3, n4, n5);
                    continue;
                }
                this.tsht_2(class_2872, matrix4f, f9, f6, f10, f11, f6, f12, f15, f8, f16, n2, n3, n4, n5);
                this.tsht_2(class_2872, matrix4f, f9, f6, f10, f15, f8, f16, f13, f8, f14, n2, n3, n4, n5);
            }
        }
    }

    private void tsht_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3, int n4) {
        int n5 = bqk.dr(1874445818);
        n5 = Integer.rotateLeft(System.identityHashCode(this) ^ n5, 21);
        class_287 class_2873 = class_2872;
        n5 = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n5;
        int n6 = n5 ^ 0x375F664B;
        if ((n6 ^ n5) != 928998987) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x58E6A3B1 ^ n5, 14) + -934579798) * 1491510193;
            int cfr_ignored_1 = (int)(0x9A540D8C27D4EB4FL ^ (long)n5 ^ 0xE668831A2DB89979L);
        }
        qh.shzy(class_2872, matrix4f, f, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1336(n, n2, n3, n4);
        qh.zsl_4(class_2872, matrix4f, f7, f8, f9).method_1336(n, n2, n3, n4);
    }

    private void tdhy(tdhz_2 tdhz2_2) {
        if (tdhz2_2.zkq_2().shzl()) {
            for (int i = 0; i < 8; ++i) {
                int n;
                this.bfa_2[i] = n = tdhz2_2.dts_4(i * 45, 255).getRGB();
                this.thkgh[i] = n;
            }
            return;
        }
        int n = tdhz2_2.khjth().sdsh_4().rk();
        int n2 = tdhz2_2.khth().sdsh_4().rk();
        for (int i = 0; i < 8; ++i) {
            this.bfa_2[i] = n;
            this.thkgh[i] = n2;
        }
    }

    private float dat_7(long l, int n, tdhz_2 tdhz2_2) {
        if (!tdhz2_2.jdh_3().shzl() || n != this.shta_2 || this.thshgh == Long.MIN_VALUE) {
            return 0.0f;
        }
        long l2 = Math.max(1L, (long)Math.round(tdhz2_2.jmb().thw_5())) * 1000000L;
        float f = class_3532.method_15363((float)((float)(l - this.thshgh) / (float)l2), (float)0.0f, (float)1.0f);
        float f2 = 1.0f - this.zml_2(f);
        return class_3532.method_15363((float)(f2 * tdhz2_2.bdhz_2().thw_5()), (float)0.0f, (float)1.0f);
    }

    private float sfsh(long l, tdhz_2 tdhz2_2) {
        float f = tdhz2_2.hsw().thw_5();
        if (f <= 0.001f) {
            return 1.0f;
        }
        double d = this.ghkhz_2(l) * (double)tdhz2_2.tf_2().thw_5() * 6.2831854820251465;
        return 1.0f + (float)Math.sin(d) * f;
    }

    private double ghkhz_2(long l) {
        block0: {
            int n = 6603297;
            n = Integer.rotateLeft(n * -823141617, 21) ^ 0x376DDD02;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x3A881ED7;
            if ((n2 ^ n) == 981999319) break block0;
            int cfr_ignored_0 = (0x3AECDCF6 ^ n) + 125581434;
        }
        return (double)(l - this.thdht_2) / Double.longBitsToDouble(0x1AF686196DFDB9BEL ^ 0x5B3B4B7C6DFDB9BEL);
    }

    /*
     * Unable to fully structure code
     */
    private double tdj(int var1_1, long var2_2, tdhz_2 var4_3) {
        var5_4 = 0L;
        var7_5 = 0.0;
        var9_6 = 0.0;
        var11_7 = 0.0;
        var15_8 = 0;
        var13_9 = -1956947665;
        var13_9 = Integer.rotateLeft(var13_9 * 26546657, 6) ^ 1752747665;
        var13_9 = Integer.rotateRight(System.identityHashCode(this) ^ var13_9, 28);
        var13_9 = var1_1 ^ var13_9;
        var14_10 = (int)((long)(-296468234 * 322543817 + -898524962 ^ var13_9) ^ -4004709343516035523L ^ -4004709343516035523L);
        block35: while (true) {
            block64: {
                block75: {
                    block65: {
                        block70: {
                            block68: {
                                block71: {
                                    block69: {
                                        block67: {
                                            block60: {
                                                block74: {
                                                    block63: {
                                                        block58: {
                                                            block61: {
                                                                block57: {
                                                                    block59: {
                                                                        block62: {
                                                                            block76: {
                                                                                block72: {
                                                                                    block66: {
                                                                                        block73: {
                                                                                            var15_8 = ((var14_10 ^ var13_9) - -898524962) * 1285847417;
                                                                                            switch (var15_8 & 15) {
                                                                                                case 6: {
                                                                                                    if (var15_8 == 44901526) break block57;
                                                                                                    if (var15_8 == 728289158) break block58;
                                                                                                    (Integer.rotateRight(412650331 ^ var13_9, 6) + -19497152) * 412650331;
                                                                                                    if (var15_8 == 412082262) break block59;
                                                                                                    if (var15_8 == -1080238506) break block60;
                                                                                                    if (var15_8 == -122918410) break block61;
                                                                                                    if (var15_8 != -296468234) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block62;
                                                                                                }
                                                                                                case 0: {
                                                                                                    if (var15_8 == -1054235408) break;
                                                                                                    if (var15_8 != -1252395360) {
                                                                                                        Integer.rotateLeft(305270593 ^ var13_9, 5) + 946698266;
                                                                                                        (int)(-3422558162185295025L ^ (long)var13_9 ^ -4645318867173241648L);
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block63;
                                                                                                }
                                                                                                case 11: {
                                                                                                    if (var15_8 == 72190187) break block64;
                                                                                                    if (var15_8 != 667505883) {
                                                                                                        (Integer.rotateLeft(1698370608 ^ var13_9, 15) + 1183125771) * 1698370609;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block65;
                                                                                                }
                                                                                                case 7: {
                                                                                                    if (var15_8 == 373456391) break block66;
                                                                                                    if (var15_8 == 1037937159) break block67;
                                                                                                    Integer.rotateLeft(-53144987 ^ var13_9, 18) - -1574250122;
                                                                                                    (int)(4496769839764138831L ^ (long)var13_9 ^ -8808896722677149410L);
                                                                                                    if (var15_8 != 1528357959) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block68;
                                                                                                }
                                                                                                case 5: {
                                                                                                    if (var15_8 == 497216917) break block69;
                                                                                                    if (var15_8 != -1654870635) {
                                                                                                        (Integer.rotateLeft(-1029930051 ^ var13_9, 11) - -1789816034) * -1029930051;
                                                                                                        (int)(12997877376019279L ^ (long)var13_9 ^ -6453514117562389107L);
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block70;
                                                                                                }
                                                                                                case 14: {
                                                                                                    if (var15_8 != 536424894) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block71;
                                                                                                }
                                                                                                case 10: {
                                                                                                    if (var15_8 == 657702842) break block72;
                                                                                                    if (var15_8 == 497825978) break block73;
                                                                                                    if (var15_8 != -2125429878) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block74;
                                                                                                }
                                                                                                case 9: {
                                                                                                    if (var15_8 == 1795808857) break block75;
                                                                                                    if (var15_8 != 2020838009) {
                                                                                                        (Integer.rotateRight(618627679 ^ var13_9, 7) - 2070833340) * 618627679;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block76;
                                                                                                }
                                                                                                case 3: {
                                                                                                    if (var15_8 != 239575203) ** break;
                                                                                                    (Integer.rotateRight(-1364447310 ^ var13_9, 8) + 725050825) * -1364447309;
                                                                                                    this.sha_7[var1_1] = this.shshq[var1_1];
                                                                                                    var11_7 = this.sha_7[var1_1];
                                                                                                    (int)(5777867994566058098L ^ (long)var13_9 ^ -4190332438443782769L);
                                                                                                    var14_10 = Integer.reverse(Integer.reverse(72190187 * 322543817 + -898524962 ^ var13_9));
                                                                                                    continue block35;
                                                                                                }
                                                                                            }
                                                                                            Integer.rotateLeft(-965658492 ^ var13_9, 11) - 202602295;
                                                                                            this.sha_7[var1_1] = var9_6 = class_3532.method_15338((double)this.shshq[var1_1]);
                                                                                            this.nt_2[var1_1] = var9_6;
                                                                                            this.shshq[var1_1] = var9_6;
                                                                                            this.hjq[var1_1] = 0L;
                                                                                            var11_7 = this.sha_7[var1_1];
                                                                                            try {
                                                                                                var15_8 += 3;
                                                                                                if ((-8684816652871898105L ^ (long)var13_9 | 1L) == 0L) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                var14_10 = Integer.reverse(Integer.reverse(72190187 * 322543817 + -898524962 ^ var13_9));
                                                                                            }
                                                                                            catch (IllegalStateException v0) {
                                                                                                var14_10 = (int)((long)(72190187 * 322543817 + -898524962 ^ var13_9) ^ -6788465427171622149L ^ -6788465427171622149L);
                                                                                            }
                                                                                            var15_8 -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateLeft(2079278672 ^ var13_9, 18) + 106373867) * 2079278673;
                                                                                        var9_6 = qh.hyt_2(this, var7_5, var4_3);
                                                                                        this.sha_7[var1_1] = qh.dhfd_2(var9_6, this.nt_2[var1_1], this.shshq[var1_1]);
                                                                                        var11_7 = this.sha_7[var1_1];
                                                                                        var14_10 = -2069409676 * 322543817 + -898524962 ^ var13_9 ^ 448227401 ^ 448227401;
                                                                                        (Integer.rotateLeft(-1897188803 ^ var13_9, 4) - 1389933726) * -1897188803;
                                                                                        (int)(5501599944291969871L ^ (long)var13_9 ^ -4219728702386653854L);
                                                                                        var14_10 = (int)((long)(72190187 * 322543817 + -898524962 ^ var13_9) ^ -2722812364319029823L ^ -2722812364319029823L);
                                                                                        var15_8 += 3;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(425808044 ^ var13_9, 6) - 388391951;
                                                                                    var7_5 = qh.sss_4((double)(var2_2 - this.khbm[var1_1]) / (double)var5_4, 0.0, 1.0);
                                                                                    if (var7_5 >= 1.0) {
                                                                                        (int)(2556304960236263177L ^ (long)var13_9 ^ 6832598715819485986L);
                                                                                        var14_10 = (int)((long)(-1054235408 * 322543817 + -898524962 ^ var13_9) ^ -3534752999320780509L ^ -3534752999320780509L);
                                                                                        var15_8 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        if ((6368425859374465275L ^ (long)var13_9 | 1L) == 0L) {
                                                                                            throw new IllegalArgumentException();
                                                                                        }
                                                                                        var14_10 = 497825978 * 322543817 + -898524962 ^ var13_9 ^ -147432716 ^ -147432716;
                                                                                    }
                                                                                    catch (IllegalArgumentException v1) {
                                                                                        var14_10 = (int)((long)(497825978 * 322543817 + -898524962 ^ var13_9) ^ -3962493696390978530L ^ -3962493696390978530L);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-1517550478 ^ var13_9, 7) + 273819913) * -1517550477;
                                                                                yf.athz_2();
                                                                                throw null;
                                                                            }
                                                                            Integer.rotateRight(-1187293014 ^ var13_9, 10) + 1921866705;
                                                                            var5_4 = this.hjq[var1_1];
                                                                            if (var5_4 <= 0L) {
                                                                                try {
                                                                                    var15_8 -= 3;
                                                                                    if ((-5869345482805824171L ^ (long)var13_9 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    var14_10 = (239575203 * 322543817 + -898524962 ^ var13_9) + -24385608 - -24385608;
                                                                                }
                                                                                catch (ArithmeticException v2) {
                                                                                    var14_10 = (int)((long)(239575203 * 322543817 + -898524962 ^ var13_9) ^ -5531630888786441989L ^ -5531630888786441989L);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            var14_10 = (int)((long)(373456391 * 322543817 + -898524962 ^ var13_9) ^ 5533575033372797559L ^ 5533575033372797559L);
                                                                            (Integer.rotateLeft(1986065212 ^ var13_9, 17) - 1511723903) * 1986065213;
                                                                            --var15_8;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateRight(785357498 ^ var13_9, 8) + -1350476863) * 785357499;
                                                                        if (qh.sdt_4()) {
                                                                            try {
                                                                                if ((6258848965528780799L ^ (long)var13_9 | 1L) == 0L) {
                                                                                    throw new IllegalArgumentException();
                                                                                }
                                                                                var14_10 = Integer.reverse(Integer.reverse(2020838009 * 322543817 + -898524962 ^ var13_9));
                                                                            }
                                                                            catch (IllegalArgumentException v3) {
                                                                                var14_10 = Integer.reverse(Integer.reverse(2020838009 * 322543817 + -898524962 ^ var13_9));
                                                                            }
                                                                            var15_8 -= 4;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            var15_8 += 3;
                                                                            if ((-1674511768628656711L ^ (long)var13_9 | 1L) == 0L) {
                                                                                throw new NoSuchElementException();
                                                                            }
                                                                            var14_10 = (int)((long)(657702842 * 322543817 + -898524962 ^ var13_9) ^ 6195700895607344236L ^ 6195700895607344236L);
                                                                        }
                                                                        catch (NoSuchElementException v4) {
                                                                            var14_10 = Integer.reverse(Integer.reverse(657702842 * 322543817 + -898524962 ^ var13_9));
                                                                        }
                                                                        var15_8 -= 5;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateLeft(-783446027 ^ var13_9, 13) - 1556221414) * -783446027;
                                                                    (int)(1440907549327289167L ^ (long)var13_9 ^ -4692606663260534225L);
                                                                    if (qh.sdt_4()) {
                                                                        (int)(-660587712589008915L ^ (long)var13_9 ^ -4574622606115979141L);
                                                                        var14_10 = (-1469835779 * 322543817 + -898524962 ^ var13_9) + -2041423624 - -2041423624;
                                                                        (int)(-2467376254032019964L ^ (long)var13_9 ^ -4481773307826399659L);
                                                                        var14_10 = (2020838009 * 322543817 + -898524962 ^ var13_9) + 1249450659 - 1249450659;
                                                                        var15_8 -= 5;
                                                                        continue;
                                                                    }
                                                                    var14_10 = Integer.reverse(Integer.reverse(940383900 * 322543817 + -898524962 ^ var13_9));
                                                                    (Integer.rotateLeft(-1396803172 ^ var13_9, 8) - -277980897) * -1396803171;
                                                                    var14_10 = (657702842 * 322543817 + -898524962 ^ var13_9) + 910199469 - 910199469;
                                                                    var15_8 -= 3;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(-308632677 ^ var13_9, 16) + -904433920) * -308632677;
                                                                var14_10 = -1872686183 * 322543817 + -898524962 ^ var13_9 ^ -1442501596 ^ -1442501596;
                                                                (Integer.rotateLeft(-1241786756 ^ var13_9, 9) - 232560703) * -1241786755;
                                                                var14_10 = (-296468234 * 322543817 + -898524962 ^ var13_9) + 2000431227 - 2000431227;
                                                                (Integer.rotateRight(681495834 ^ var13_9, 8) + -275221151) * 681495835;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(-2095524059 ^ var13_9, 3) - -463491914;
                                                            (int)(4731727503160568655L ^ (long)var13_9 ^ 1099022457537900165L);
                                                            var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9;
                                                            var15_8 += 4;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-571895371 ^ var13_9, 14) - -475642842) * -571895371;
                                                        (int)(2259469492072803151L ^ (long)var13_9 ^ -9052091102555171993L);
                                                        var14_10 = Integer.reverse(Integer.reverse(2015261271 * 322543817 + -898524962 ^ var13_9));
                                                        (Integer.rotateLeft(1545643696 ^ var13_9, 14) + 743558795) * 1545643697;
                                                        (int)(1708779748905017949L ^ (long)var13_9 ^ 7003472393748185788L);
                                                        var14_10 = (-296468234 * 322543817 + -898524962 ^ var13_9) + -503730670 - -503730670;
                                                        var15_8 += 2;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(1891783242 ^ var13_9, 17) + -1411017167;
                                                    try {
                                                        var15_8 -= 4;
                                                        var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9;
                                                    }
                                                    catch (IllegalStateException v5) {
                                                        var14_10 = (int)((long)(-296468234 * 322543817 + -898524962 ^ var13_9) ^ 6281796918773504070L ^ 6281796918773504070L);
                                                    }
                                                    var15_8 -= 2;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-280007139 ^ var13_9, 16) - -17042242) * -280007139;
                                                (int)(3314016145154304847L ^ (long)var13_9 ^ 9020854202082653738L);
                                                var14_10 = 481900773 * 322543817 + -898524962 ^ var13_9;
                                                Integer.rotateLeft(-1624226139 ^ var13_9, 6) - 1261841718;
                                                (int)(6738203732700621647L ^ (long)var13_9 ^ 3188692684637804244L);
                                                (int)(1694247872002919336L ^ (long)var13_9 ^ -6368700274181700905L);
                                                var14_10 = (int)((long)(-1175683577 * 322543817 + -898524962 ^ var13_9) ^ -6538990828281076513L ^ -6538990828281076513L);
                                                (int)(1508887807735822344L ^ (long)var13_9 ^ -5215668963925064656L);
                                                var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9;
                                                var15_8 -= 4;
                                                continue;
                                            }
                                            Integer.rotateRight(572507786 ^ var13_9, 7) + 641116657;
                                            var14_10 = 122776128 * 322543817 + -898524962 ^ var13_9;
                                            Integer.rotateRight(-1324161842 ^ var13_9, 9) - 1973900333;
                                            try {
                                                --var15_8;
                                                var14_10 = Integer.reverse(Integer.reverse(-296468234 * 322543817 + -898524962 ^ var13_9));
                                            }
                                            catch (IllegalStateException v6) {
                                                var14_10 = (int)((long)(-296468234 * 322543817 + -898524962 ^ var13_9) ^ -6431894981562922588L ^ -6431894981562922588L);
                                            }
                                            var15_8 -= 2;
                                            continue;
                                        }
                                        (Integer.rotateLeft(1009571509 ^ var13_9, 10) - 1305190182) * 1009571509;
                                        (int)(-99509615576421553L ^ (long)var13_9 ^ 891856874678800621L);
                                        var14_10 = Integer.reverse(Integer.reverse(-296468234 * 322543817 + -898524962 ^ var13_9));
                                        var15_8 -= 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(-639932141 ^ var13_9, 14) + 1710184584) * -639932141;
                                    try {
                                        if ((4339375231833787471L ^ (long)var13_9 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9 ^ -1312465086 ^ -1312465086;
                                    }
                                    catch (UnsupportedOperationException v7) {
                                        var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9;
                                    }
                                    --var15_8;
                                    continue;
                                }
                                Integer.rotateRight(1222871142 ^ var13_9, 12) - -672455787;
                                var14_10 = (-2129276950 * 322543817 + -898524962 ^ var13_9) + 27031661 - 27031661;
                                Integer.rotateLeft(277734220 ^ var13_9, 5) - 93070703;
                                try {
                                    if ((5226557203598540001L ^ (long)var13_9 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9;
                                }
                                catch (ArithmeticException v8) {
                                    var14_10 = (-296468234 * 322543817 + -898524962 ^ var13_9) + -256728278 - -256728278;
                                }
                                continue;
                            }
                            (Integer.rotateLeft(-1209056591 ^ var13_9, 9) + 1247195818) * -1209056591;
                            (int)(8457175761979501391L ^ (long)var13_9 ^ 2623490931402819434L);
                            try {
                                var15_8 += 5;
                                if ((5716597902763521423L ^ (long)var13_9 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9 ^ -951520039 ^ -951520039;
                            }
                            catch (IllegalArgumentException v9) {
                                var14_10 = (-296468234 * 322543817 + -898524962 ^ var13_9) + 1297642091 - 1297642091;
                            }
                            var15_8 -= 5;
                            continue;
                        }
                        (Integer.rotateLeft(234508080 ^ var13_9, 4) + -1246939637) * 234508081;
                        var14_10 = Integer.reverse(Integer.reverse(-1126901916 * 322543817 + -898524962 ^ var13_9));
                        (Integer.rotateRight(-145687914 ^ var13_9, 17) - -148113563) * -145687913;
                        try {
                            var15_8 += 4;
                            if ((-8032497805283047837L ^ (long)var13_9 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var14_10 = (-296468234 * 322543817 + -898524962 ^ var13_9) + 1334693089 - 1334693089;
                        }
                        catch (NoSuchElementException v10) {
                            var14_10 = (int)((long)(-296468234 * 322543817 + -898524962 ^ var13_9) ^ 210443406147527885L ^ 210443406147527885L);
                        }
                        var15_8 += 2;
                        continue;
                    }
                    Integer.rotateRight(-520522777 ^ var13_9, 15) - 1116907572;
                    try {
                        var15_8 -= 4;
                        var14_10 = (int)((long)(-296468234 * 322543817 + -898524962 ^ var13_9) ^ 8081630878185878886L ^ 8081630878185878886L);
                    }
                    catch (NoSuchElementException v11) {
                        var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9 ^ 47705040 ^ 47705040;
                    }
                    --var15_8;
                    continue;
                }
                Integer.rotateRight(-311206482 ^ var13_9, 16) - -984221875;
                var14_10 = -1437818498 * 322543817 + -898524962 ^ var13_9 ^ -1883511122 ^ -1883511122;
                Integer.rotateLeft(405976324 ^ var13_9, 6) - -226391369;
                var14_10 = -296468234 * 322543817 + -898524962 ^ var13_9;
                var15_8 += 3;
                continue;
            }
            return var11_7;
lbl364:
            // 10 sources

            Integer.rotateRight(155273634 ^ var13_9, 4) + 591759833;
            var14_10 = Integer.reverse(Integer.reverse(-296468234 * 322543817 + -898524962 ^ var13_9));
        }
    }

    private double ms_2(double d, tdhz_2 tdhz2_2) {
        try {
            int n = -303389561;
            n = Integer.rotateLeft(n * 1905788865, 12) ^ 0x70EBB9A4;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x856A8C90;
            if ((n2 ^ n) != -2056614768) {
                int cfr_ignored_0 = (0x68802817 ^ n) - 768775413;
            }
            if ((0x11E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (tdhz2_2.thkth().dhbn("Linear")) {
            return d;
        }
        if (qh.dhzt_4(tdhz2_2.thkth(), "Snappy")) {
            double d2 = 1.0 - d;
            return 1.0 - d2 * d2 * d2 * d2;
        }
        return this.sdgh(d);
    }

    private double saf(double d, double d2) {
        double d3 = 0.0;
        int n = 0;
        int n2 = 1999564019;
        n2 = Integer.rotateLeft(n2 * -1946608567, 7) ^ 0x2EFC1892;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 - 2097819254 + -484014194 - -484014194;
        while (true) {
            block34: {
                block42: {
                    block40: {
                        block41: {
                            block35: {
                                block38: {
                                    block33: {
                                        block53: {
                                            block48: {
                                                block52: {
                                                    block32: {
                                                        block45: {
                                                            block36: {
                                                                block46: {
                                                                    block47: {
                                                                        block50: {
                                                                            block51: {
                                                                                block54: {
                                                                                    block39: {
                                                                                        block49: {
                                                                                            block43: {
                                                                                                block44: {
                                                                                                    block29: {
                                                                                                        block37: {
                                                                                                            block30: {
                                                                                                                block31: {
                                                                                                                    if ((n = n2 - n3) > -165409175) break block29;
                                                                                                                    if (n > -1239289103) break block30;
                                                                                                                    if (n > -1649036899) break block31;
                                                                                                                    if (n == -1975558780) break block32;
                                                                                                                    if (n == -1649036899) break block33;
                                                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0x2CF98178 ^ n2, 8) + 1989430467) * 754549113;
                                                                                                                    break block34;
                                                                                                                }
                                                                                                                if (n == -1275116277) break block35;
                                                                                                                if (n == -1239289103) break block36;
                                                                                                                int cfr_ignored_1 = (Integer.rotateRight(0xF8EB77B ^ n2, 4) + -425339104) * 261011323;
                                                                                                                break block34;
                                                                                                            }
                                                                                                            if (n > -778451061) break block37;
                                                                                                            if (n == -973753659) break block38;
                                                                                                            if (n == -778451061) break block39;
                                                                                                            break block34;
                                                                                                        }
                                                                                                        if (n == -490294802) break block40;
                                                                                                        if (n == -183664154) break block41;
                                                                                                        if (n == -165409175) break block42;
                                                                                                        break block34;
                                                                                                    }
                                                                                                    if (n > 782120409) break block43;
                                                                                                    if (n > 435181032) break block44;
                                                                                                    if (n == 150208463) break block45;
                                                                                                    if (n == 435181032) break block46;
                                                                                                    int cfr_ignored_2 = Integer.rotateRight(0x48C62126 ^ n2, 12) - -732192043;
                                                                                                    break block34;
                                                                                                }
                                                                                                if (n == 683256671) break block47;
                                                                                                if (n == 782120409) break block48;
                                                                                                int cfr_ignored_3 = (Integer.rotateRight(0xFB4244DB ^ n2, 18) + 1902376384) * -79543077;
                                                                                                break block34;
                                                                                            }
                                                                                            if (n > 916167063) break block49;
                                                                                            if (n == 827203029) break block50;
                                                                                            if (n == 916167063) break block51;
                                                                                            int cfr_ignored_4 = (Integer.rotateRight(0x1C5E649A ^ n2, 6) + 1942736353) * 475948187;
                                                                                            break block34;
                                                                                        }
                                                                                        if (n == 1278768809) break block52;
                                                                                        if (n == 1459039898) break block53;
                                                                                        if (n == 2097819254) break block54;
                                                                                        break block34;
                                                                                    }
                                                                                    int cfr_ignored_5 = (Integer.rotateRight(0x141DABD6 ^ n2, 5) - 1945464357) * 337488855;
                                                                                    d3 = d;
                                                                                    int cfr_ignored_6 = (int)(0xB19DADA5C851C228L ^ (long)n2 ^ 0xA63B5C107F76CEEAL);
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 - -165409175));
                                                                                    n += 2;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_7 = (Integer.rotateRight(0xBD935A37 ^ n2, 10) - -113931292) * -1114416585;
                                                                                if (!yf.khdha_2()) {
                                                                                    try {
                                                                                        n -= 2;
                                                                                        if ((0x5934E2E126A5B439L ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new NoSuchElementException();
                                                                                        }
                                                                                        n3 = n2 - 827203029;
                                                                                    }
                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                        n3 = n2 - 827203029 + -1222502770 - -1222502770;
                                                                                    }
                                                                                    n += 5;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_8 = (int)(0x8BA00064371022EFL ^ (long)n2 ^ 0xFDB8A293BEF8BA91L);
                                                                                n3 = n2 - 904576592;
                                                                                int cfr_ignored_9 = (int)(0xEACC5C2C2EAB0A61L ^ (long)n2 ^ 0x452891E5EFE47849L);
                                                                                n3 = Integer.reverse(Integer.reverse(n2 - 683256671));
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_10 = (Integer.rotateRight(0xBD5CB152 ^ n2, 10) + -224978903) * -1117998765;
                                                                            d3 = Math.rint(d / d2) * d2;
                                                                            int cfr_ignored_11 = (int)(0xA95DB34830A0B47FL ^ (long)n2 ^ 0x9BE0ADF293D8FF6AL);
                                                                            n3 = n2 - 634101688 ^ 0x86F389BF ^ 0x86F389BF;
                                                                            int cfr_ignored_12 = (int)(0x1D45ADBD9F88E2F2L ^ (long)n2 ^ 0xA60BF3A23EC3975AL);
                                                                            n3 = Integer.reverse(Integer.reverse(n2 - -165409175));
                                                                            n -= 3;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_13 = Integer.rotateRight(0x9FEBDB83 ^ n2, 6) + 1642935320;
                                                                        qh.rkhd_2();
                                                                        try {
                                                                            n += 3;
                                                                            if ((0xB7AA245C0025B8E5L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new ArithmeticException();
                                                                            }
                                                                            n3 = (int)((long)(n2 - 683256671) ^ 0x5BC608E28C0AA0E7L ^ 0x5BC608E28C0AA0E7L);
                                                                        }
                                                                        catch (ArithmeticException arithmeticException) {
                                                                            n3 = n2 - 683256671 + -1194235653 - -1194235653;
                                                                        }
                                                                        --n;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_14 = (Integer.rotateRight(0xD377493 ^ n2, 4) + -1642808056) * 221738131;
                                                                    if (d2 <= 0.0) {
                                                                        n3 = Integer.reverse(Integer.reverse(n2 - -778451061));
                                                                        int cfr_ignored_15 = (Integer.rotateRight(0x45FF1FE ^ n2, 3) - -1946424067) * 73396735;
                                                                        ++n;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        n += 2;
                                                                        if ((0xD7D2C97818955DD1L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        n3 = n2 - 916167063 ^ 0x6CE05BFF ^ 0x6CE05BFF;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = n2 - 916167063 ^ 0xD84B0B3B ^ 0xD84B0B3B;
                                                                    }
                                                                    n += 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_16 = (Integer.rotateRight(0xBBA5D2DA ^ n2, 10) + -1116592223) * -1146760485;
                                                                n3 = n2 - -1936781892 + 807956063 - 807956063;
                                                                int cfr_ignored_17 = (Integer.rotateLeft(0xB2E8E735 ^ n2, 9) - -1366188378) * -1293359307;
                                                                int cfr_ignored_18 = (int)(0x705A490827D4EB4FL ^ (long)n2 ^ 0x6F60831A2DB94D65L);
                                                                try {
                                                                    --n;
                                                                    if ((0xC7085FCD8A61A86FL ^ (long)n2 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    n3 = (int)((long)(n2 - 2097819254) ^ 0x28F193E12FD18DFBL ^ 0x28F193E12FD18DFBL);
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n3 = n2 - 2097819254 ^ 0x20DD06BD ^ 0x20DD06BD;
                                                                }
                                                                n += 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_19 = (Integer.rotateRight(0x29209332 ^ n2, 8) + -11570615) * 690000691;
                                                            n3 = Integer.reverse(Integer.reverse(n2 - 1687658262));
                                                            int cfr_ignored_20 = (Integer.rotateLeft(0xD6D76354 ^ n2, 13) - 141731431) * -690527403;
                                                            try {
                                                                ++n;
                                                                if ((0xD941723F571E9365L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                n3 = n2 - 2097819254 + -1182331078 - -1182331078;
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                n3 = n2 - 2097819254 + 137416834 - 137416834;
                                                            }
                                                            n += 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_21 = (Integer.rotateRight(0x73069B17 ^ n2, 17) - -232102140) * 1929812759;
                                                        n3 = n2 - 633417748;
                                                        int cfr_ignored_22 = (Integer.rotateRight(0x79C20F9B ^ n2, 18) + -1025670400) * 2042761115;
                                                        int cfr_ignored_23 = (int)(0x23464F171E099E49L ^ (long)n2 ^ 0x635EF0A0C7B5EB5DL);
                                                        n3 = Integer.reverse(Integer.reverse(n2 - 1354074075));
                                                        int cfr_ignored_24 = (int)(0x5EBAA7413310EBC7L ^ (long)n2 ^ 0xB3F2AA922CA910A4L);
                                                        n3 = n2 - 2097819254 + -1324555471 - -1324555471;
                                                        n += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_25 = Integer.rotateRight(0xC2D4A3E3 ^ n2, 11) + -1675790408;
                                                    int cfr_ignored_26 = (int)(0xFC0DCD40FC6FD4C3L ^ (long)n2 ^ 0x67F1346C52A055CAL);
                                                    n3 = n2 - 2097819254;
                                                    n -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_27 = Integer.rotateRight(0x793650E ^ n2, 3) - -281617427;
                                                int cfr_ignored_28 = (int)(0xF7CE003EB3DA84A9L ^ (long)n2 ^ 0xFD0DAB06F274424DL);
                                                n3 = n2 - 14661158 + 478069501 - 478069501;
                                                int cfr_ignored_29 = (int)(0xC34BE9866F5327E3L ^ (long)n2 ^ 0x2E7C1215B4E02B46L);
                                                n3 = (int)((long)(n2 - 2097819254) ^ 0x9A24358DC5F0487BL ^ 0x9A24358DC5F0487BL);
                                                n += 2;
                                                continue;
                                            }
                                            int cfr_ignored_30 = Integer.rotateLeft(0xC28EEC29 ^ n2, 11) + -1817429966;
                                            int cfr_ignored_31 = (int)(0x3C421427D4EB4FL ^ (long)n2 ^ 0x7958831A2DB9ADA9L);
                                            n3 = Integer.reverse(Integer.reverse(n2 - -599137522));
                                            int cfr_ignored_32 = (Integer.rotateLeft(0xDA1933D ^ n2, 4) - -1427213410) * 228692797;
                                            int cfr_ignored_33 = (int)(0xCF133D0027D4EB4FL ^ (long)n2 ^ 0x8770831A2DB833F7L);
                                            n3 = Integer.reverse(Integer.reverse(n2 - 2097819254));
                                            ++n;
                                            continue;
                                        }
                                        int cfr_ignored_34 = Integer.rotateLeft(0x75024CA4 ^ n2, 17) - 799336215;
                                        try {
                                            n -= 2;
                                            if ((0x414557C665FF261DL ^ (long)n2 | 1L) == 0L) {
                                                throw new NoSuchElementException();
                                            }
                                            n3 = (int)((long)(n2 - 2097819254) ^ 0xE55D114368B3EB7AL ^ 0xE55D114368B3EB7AL);
                                        }
                                        catch (NoSuchElementException noSuchElementException) {
                                            n3 = n2 - 2097819254 ^ 0x47CF4B72 ^ 0x47CF4B72;
                                        }
                                        n += 4;
                                        continue;
                                    }
                                    int cfr_ignored_35 = (Integer.rotateLeft(0x899DD55 ^ n2, 4) - 251620486) * 144301397;
                                    int cfr_ignored_36 = (int)(0xCA2B736827D4EB4FL ^ (long)n2 ^ 0x1BA0831A2DB83987L);
                                    n3 = (int)((long)(n2 - -1830169384) ^ 0x6EB9A8D3FD7D832CL ^ 0x6EB9A8D3FD7D832CL);
                                    int cfr_ignored_37 = (Integer.rotateLeft(0x5AFD015C ^ n2, 14) - 151046495) * 1526530397;
                                    try {
                                        ++n;
                                        n3 = Integer.reverse(Integer.reverse(n2 - 2097819254));
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        n3 = n2 - 2097819254;
                                    }
                                    n -= 5;
                                    continue;
                                }
                                int cfr_ignored_38 = Integer.rotateLeft(0x5FC02C25 ^ n2, 14) - -1667041354;
                                int cfr_ignored_39 = (int)(0x9D72821827D4EB4FL ^ (long)n2 ^ 0xF940831A2DB89734L);
                                try {
                                    n += 5;
                                    if ((0x2DE50DF4908D1873L ^ (long)n2 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    n3 = (int)((long)(n2 - 2097819254) ^ 0xFB74B863B429A8EFL ^ 0xFB74B863B429A8EFL);
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n3 = Integer.reverse(Integer.reverse(n2 - 2097819254));
                                }
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_40 = Integer.rotateLeft(0x888E4DE1 ^ n2, 4) + -1919349382;
                            int cfr_ignored_41 = (int)(0x4A3CE3DC27D4EB4FL ^ (long)n2 ^ 0x3AC8831A2DB939A8L);
                            n3 = n2 - -305663312 ^ 0x4ED80C06 ^ 0x4ED80C06;
                            int cfr_ignored_42 = Integer.rotateLeft(0xD48794CD ^ n2, 13) - -1060592626;
                            int cfr_ignored_43 = (int)(0x16353AF027D4EB4FL ^ (long)n2 ^ 0x8890831A2DB981BBL);
                            n3 = (int)((long)(n2 - 2097819254) ^ 0xA6103FBAD3F95351L ^ 0xA6103FBAD3F95351L);
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_44 = Integer.rotateLeft(0x7444EBAC ^ n2, 17) - 414591247;
                        n3 = Integer.reverse(Integer.reverse(n2 - -161438991));
                        int cfr_ignored_45 = Integer.rotateLeft(0x55B17D85 ^ n2, 13) - 1692127830;
                        int cfr_ignored_46 = (int)(0x9703D3B827D4EB4FL ^ (long)n2 ^ 0x5A00831A2DB883D6L);
                        try {
                            n += 5;
                            if ((0xAC1ECFD6DC7E1DL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = (int)((long)(n2 - 2097819254) ^ 0xA84DFC68634F2CA0L ^ 0xA84DFC68634F2CA0L);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.reverse(Integer.reverse(n2 - 2097819254));
                        }
                        n += 4;
                        continue;
                    }
                    int cfr_ignored_47 = (Integer.rotateRight(0xCEF0C01A ^ n2, 12) + 327475809) * -823082981;
                    n3 = n2 - 733189207;
                    int cfr_ignored_48 = (Integer.rotateLeft(0x4781CB19 ^ n2, 11) + -1391118526) * 1199688473;
                    int cfr_ignored_49 = (int)(0x8533652427D4EB4FL ^ (long)n2 ^ 0x3738831A2DB8A7B7L);
                    int cfr_ignored_50 = (int)(0x99C1539F1D99FC53L ^ (long)n2 ^ 0x5A4EF78003809E53L);
                    n3 = n2 - 2097819254;
                    ++n;
                    continue;
                }
                return d3;
            }
            int cfr_ignored_51 = Integer.rotateLeft(0x4C4F0F8C ^ n2, 12) - 1106280751;
            n3 = Integer.reverse(Integer.reverse(n2 - 2097819254));
        }
    }

    private double sdgh(double d) {
        try {
            int n = -1703269534;
            n = Integer.rotateLeft(n * 861288079, 28) ^ 0x6F78F433;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 15);
            int n2 = n ^ 0x2561F91;
            if ((n2 ^ n) != 39198609) {
                int cfr_ignored_0 = (0x982C34F3 ^ n) + -1076415134;
            }
            if ((0x2D3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return d * d * (Double.longBitsToDouble(0xD7A01883DB73C38BL ^ 0x97A81883DB73C38BL) - Double.longBitsToDouble(0x9398668CE4C95BC2L ^ 0xD398668CE4C95BC2L) * d);
    }

    /*
     * Unable to fully structure code
     */
    private float zml_2(float var1_1) {
        var4_2 = 0;
        var2_3 = 1245821074;
        var2_3 = Integer.rotateLeft(var2_3 * 1095801909, 28) ^ -1359679547;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var2_3 = Integer.rotateLeft(Float.floatToIntBits(var1_1) ^ var2_3, 24);
        var3_4 = (var2_3 ^ 68677559 ^ 781389231) + 781389231;
        while (true) {
            block32: {
                block38: {
                    block29: {
                        block28: {
                            block31: {
                                block30: {
                                    block37: {
                                        block27: {
                                            block34: {
                                                block36: {
                                                    block33: {
                                                        block39: {
                                                            block35: {
                                                                var4_2 = var3_4 - 781389231 ^ 781389231 ^ var2_3;
                                                                switch (var4_2 & 7) {
                                                                    case 0: {
                                                                        if (var4_2 == 104684136) break block27;
                                                                        if (var4_2 != -2051509608) {
                                                                            (Integer.rotateRight(1850605151 ^ var2_3, 16) - 1607429308) * 1850605151;
                                                                            ** break;
                                                                        }
                                                                        break block28;
                                                                    }
                                                                    case 2: {
                                                                        if (var4_2 != 1935318826) {
                                                                            ** break;
                                                                        }
                                                                        break block29;
                                                                    }
                                                                    case 3: {
                                                                        if (var4_2 != 67300803) {
                                                                            ** break;
                                                                        }
                                                                        break block30;
                                                                    }
                                                                    case 4: {
                                                                        if (var4_2 == -930144204) break block31;
                                                                        if (var4_2 == 371679036) break block32;
                                                                        if (var4_2 != -40775372) {
                                                                            ** break;
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    case 5: {
                                                                        if (var4_2 == 35831965) break block34;
                                                                        if (var4_2 == 568897933) break block35;
                                                                        if (var4_2 != 450499141) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 6: {
                                                                        if (var4_2 == 1405532694) break;
                                                                        if (var4_2 != 1252963726) {
                                                                            (Integer.rotateRight(1964290963 ^ var2_3, 17) + 836722184) * 1964290963;
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 7: {
                                                                        if (var4_2 == 133244943) break block38;
                                                                        if (var4_2 != 68677559) {
                                                                            Integer.rotateRight(-2036631325 ^ var2_3, 3) + 1362182840;
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                }
                                                                (Integer.rotateRight(1508985211 ^ var2_3, 14) + -392854240) * 1508985211;
                                                                qh.thshl();
                                                                throw null;
                                                            }
                                                            Integer.rotateLeft(574437580 ^ var2_3, 7) - 700940271;
                                                            return var1_1 * var1_1 * (Float.intBitsToFloat(-601092824 - -1679028952) - 2.0f * var1_1);
                                                        }
                                                        (Integer.rotateRight(-931220937 ^ var2_3, 12) - 1270166500) * -931220937;
                                                        if (qh.bysh()) {
                                                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -937161196 ^ 781389231) + 781389231));
                                                            Integer.rotateRight(-628754101 ^ var2_3, 14) + 2056703824;
                                                            var3_4 = (var2_3 ^ 568897933 ^ 781389231) + 781389231;
                                                            var4_2 += 2;
                                                            continue;
                                                        }
                                                        var3_4 = (int)((long)((var2_3 ^ -1963849235 ^ 781389231) + 781389231) ^ -2999462482973877011L ^ -2999462482973877011L);
                                                        Integer.rotateRight(-2003203346 ^ var2_3, 4) - -1896517107;
                                                        var3_4 = (var2_3 ^ 1405532694 ^ 781389231) + 781389231;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(902891150 ^ var2_3, 9) - -2001900947;
                                                    var3_4 = (var2_3 ^ 1140803488 ^ 781389231) + 781389231 + 508791249 - 508791249;
                                                    (Integer.rotateLeft(1668207640 ^ var2_3, 15) + 248073763) * 1668207641;
                                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 68677559 ^ 781389231) + 781389231));
                                                    Integer.rotateLeft(1345097920 ^ var2_3, 13) + -1178392965;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-529392557 ^ var2_3, 15) + 841944392) * -529392557;
                                                try {
                                                    var4_2 -= 5;
                                                    if ((-1530950745233984487L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var3_4 = (var2_3 ^ 68677559 ^ 781389231) + 781389231 + 1222181132 - 1222181132;
                                                }
                                                catch (IllegalStateException v0) {
                                                    var3_4 = (int)((long)((var2_3 ^ 68677559 ^ 781389231) + 781389231) ^ 1386625678656453842L ^ 1386625678656453842L);
                                                }
                                                var4_2 += 4;
                                                continue;
                                            }
                                            Integer.rotateRight(1901400331 ^ var2_3, 17) + -1112887408;
                                            try {
                                                ++var4_2;
                                                if ((8611413150621658521L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                var3_4 = (int)((long)((var2_3 ^ 68677559 ^ 781389231) + 781389231) ^ 5175862026571501019L ^ 5175862026571501019L);
                                            }
                                            catch (IllegalStateException v1) {
                                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 68677559 ^ 781389231) + 781389231));
                                            }
                                            var4_2 -= 5;
                                            continue;
                                        }
                                        Integer.rotateRight(-1583234358 ^ var2_3, 7) + -1762380367;
                                        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -305841680 ^ 781389231) + 781389231));
                                        (Integer.rotateLeft(-1570249771 ^ var2_3, 7) - -1359858170) * -1570249771;
                                        (int)(6977568857176468303L ^ (long)var2_3 ^ 7395054736601869435L);
                                        var3_4 = (var2_3 ^ 68677559 ^ 781389231) + 781389231 ^ -1021532323 ^ -1021532323;
                                        var4_2 += 5;
                                        continue;
                                    }
                                    (Integer.rotateRight(-482640354 ^ var2_3, 15) - -2003704611) * -482640353;
                                    var3_4 = (var2_3 ^ -466723646 ^ 781389231) + 781389231;
                                    (Integer.rotateRight(220474551 ^ var2_3, 4) - -1681979036) * 220474551;
                                    var3_4 = (var2_3 ^ 68677559 ^ 781389231) + 781389231 + 1663870448 - 1663870448;
                                    continue;
                                }
                                (Integer.rotateLeft(-2141026824 ^ var2_3, 3) + -1874077629) * -2141026823;
                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 68677559 ^ 781389231) + 781389231));
                                (Integer.rotateRight(-479664449 ^ var2_3, 15) - -1911451556) * -479664449;
                                continue;
                            }
                            (Integer.rotateLeft(-1476264899 ^ var2_3, 8) - 1553672862) * -1476264899;
                            (int)(7688579149473311567L ^ (long)var2_3 ^ 6444795215226697911L);
                            try {
                                --var4_2;
                                if ((3022054570187982195L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var3_4 = (int)((long)((var2_3 ^ 68677559 ^ 781389231) + 781389231) ^ 6722652718637689646L ^ 6722652718637689646L);
                            }
                            catch (NoSuchElementException v2) {
                                var3_4 = (int)((long)((var2_3 ^ 68677559 ^ 781389231) + 781389231) ^ 7836798976553998118L ^ 7836798976553998118L);
                            }
                            continue;
                        }
                        Integer.rotateLeft(1086841512 ^ var2_3, 11) + -594407021;
                        (int)(611111241590123446L ^ (long)var2_3 ^ -3913699786363257561L);
                        var3_4 = (var2_3 ^ 68677559 ^ 781389231) + 781389231 ^ 972796042 ^ 972796042;
                        var4_2 += 3;
                        continue;
                    }
                    (Integer.rotateRight(1116461875 ^ var2_3, 11) + 323824232) * 1116461875;
                    var3_4 = (var2_3 ^ -657785347 ^ 781389231) + 781389231 + 1234222693 - 1234222693;
                    Integer.rotateLeft(-819195988 ^ var2_3, 12) - 447972623;
                    var3_4 = (var2_3 ^ -147946596 ^ 781389231) + 781389231;
                    (Integer.rotateLeft(789109077 ^ var2_3, 8) - -1234177914) * 789109077;
                    (int)(-1316608651823879345L ^ (long)var2_3 ^ 1414274431453787813L);
                    var3_4 = (var2_3 ^ 68677559 ^ 781389231) + 781389231 ^ -1756145157 ^ -1756145157;
                    continue;
                }
                (Integer.rotateRight(1645284698 ^ var2_3, 15) + -462537439) * 1645284699;
                var3_4 = (var2_3 ^ 1043950768 ^ 781389231) + 781389231;
                (Integer.rotateRight(886010430 ^ var2_3, 9) - 1769764029) * 886010431;
                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1323070397 ^ 781389231) + 781389231));
                (Integer.rotateLeft(-1281630244 ^ var2_3, 9) - -1002587425) * -1281630243;
                var3_4 = (var2_3 ^ 68677559 ^ 781389231) + 781389231 + 1997338762 - 1997338762;
                ++var4_2;
                continue;
            }
            (Integer.rotateRight(474052447 ^ var2_3, 6) - 1883968444) * 474052447;
            var3_4 = (var2_3 ^ -200611724 ^ 781389231) + 781389231 ^ 2136981938 ^ 2136981938;
            Integer.rotateRight(-926502545 ^ var2_3, 12) - 1416436652;
            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1489796915 ^ 781389231) + 781389231));
            Integer.rotateLeft(-280029751 ^ var2_3, 16) + -17743214;
            (int)(3314011558129232719L ^ (long)var2_3 ^ -8459867751555926486L);
            var3_4 = (var2_3 ^ 68677559 ^ 781389231) + 781389231;
            var4_2 += 2;
            continue;
lbl197:
            // 8 sources

            Integer.rotateLeft(1049295456 ^ var2_3, 10) + -1758334757;
            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 68677559 ^ 781389231) + 781389231));
        }
    }

    private int ghjh_2(tdhz_2 tdhz2_2) {
        try {
            int n = -1164698571;
            n = Integer.rotateLeft(n * 1640504919, 14) ^ 0xFBB7C8B2;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xECB95231;
            if ((n2 ^ n) != -323399119) {
                int cfr_ignored_0 = (0x562D4E04 ^ n) - 1766309237;
            }
            if ((0x32B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (qh.tds_6(tdhz2_2).dhbn("Sideways")) {
            return 1;
        }
        if (qh.ddm_3(tdhz2_2.athk(), "Flip")) {
            return 0;
        }
        if (tdhz2_2.athk().dhbn("Roll")) {
            return 2;
        }
        if (qh.mt(tdhz2_2).dhbn("Random")) {
            return qh.yb(ThreadLocalRandom.current(), 3);
        }
        int n = this.hmd;
        this.hmd = switch (this.hmd) {
            case 1 -> 0;
            case 0 -> 2;
            default -> 1;
        };
        return n;
    }

    private int rzkh_2(tdhz_2 tdhz2_2) {
        if (tdhz2_2.zkf_2().dhbn("Left")) {
            return -1;
        }
        if (tdhz2_2.zkf_2().dhbn("Alternating")) {
            int n = this.hsf;
            this.hsf = -this.hsf;
            return n;
        }
        return 1;
    }

    private int rthy(int n, int n2, float f) {
        try {
            int n3 = -1168029661;
            n3 = Integer.rotateLeft(n3 * 208854953, 13) ^ 0xA9136D41;
            n3 = Integer.rotateRight(System.identityHashCode(this) ^ n3, 7);
            n3 = Integer.rotateLeft(n ^ n3, 25);
            int n4 = n3 ^ 0x8F709406;
            if ((n4 ^ n3) != -1888447482) {
                int cfr_ignored_0 = (0x3511DC25 ^ n3) - -526167350;
            }
            if ((0x160 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return class_3532.method_15340((int)Math.round((float)n + (float)(n2 - n) * f), (int)0, (int)(934911554 - 934911299));
    }

    private void hksh(int n, tdhz_2 tdhz2_2, long l) {
        try {
            int n2 = -635854329;
            n2 = Integer.rotateLeft(n2 * 1909390661, 11) ^ 0x2569A308;
            n2 = System.identityHashCode(this) ^ n2;
            tdhz_2 tdhz3_2 = tdhz2_2;
            n2 = Integer.rotateLeft((tdhz3_2 != null ? System.identityHashCode(tdhz3_2) : 0) ^ n2, 4);
            int n3 = n2 ^ 0x92FB299E;
            if ((n3 ^ n2) != -1829033570) {
                int cfr_ignored_0 = (0x48E28B99 ^ n2) + 946852247;
            }
            if ((0x11D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (this.sqk != n || this.hdhn <= 0) {
            return;
        }
        int n4 = this.hdhn;
        this.sqk = 378621282 - -1768862366;
        this.hdhn = 0;
        for (int i = 0; i < n4; ++i) {
            this.dyt(n, tdhz2_2, l);
        }
    }

    private void dhal_2(int n) {
        int n2 = bqk.dr(1440879888);
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 ^ 0xDF6CA03F;
        if ((n3 ^ n2) != -546529217) {
            int cfr_ignored_0 = Integer.rotateRight(0x8A8EB52F ^ n2, 4) - -878342164;
        }
        this.sdf_2 = n;
        this.hmd = 1;
        this.hsf = 1;
        this.shta_2 = Integer.rotateLeft(0x4821C471 ^ 0x48218471, 17);
        this.thshgh = 0xEDAEFCBD977A2DECL ^ 0x6DAEFCBD977A2DECL;
        this.ghdz();
    }

    /*
     * Unable to fully structure code
     */
    private void ghdz() {
        var1_1 = 0;
        var4_2 = 0;
        var2_3 = 1822339041;
        var2_3 = Integer.rotateLeft(var2_3 * 1566868807, 24) ^ -1445158011;
        var2_3 = Integer.rotateRight(System.identityHashCode(this) ^ var2_3, 5);
        var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 121047229, 14) ^ 3607560534693423918L ^ 3607560534693423918L);
        block23: while (true) {
            block30: {
                block29: {
                    if ((var4_2 = Integer.rotateRight(var3_4, 14) ^ var2_3) == 562615865) ** GOTO lbl134
                    if (var4_2 == 121047229) break block29;
                    if (var4_2 == 1976341412) ** GOTO lbl149
                    break block30;
                }
                (Integer.rotateLeft(708381744 ^ var2_3, 8) + 558242059) * 708381745;
                var1_1 = 0;
                var3_4 = Integer.rotateLeft(var2_3 ^ 39524966, 14) + 1683997582 - 1683997582;
                ++var4_2;
                continue;
            }
            switch (var4_2) {
                case 1959671110: {
                    Integer.rotateLeft(166532109 ^ var2_3, 4) - 940772558;
                    (int)(-3792107645233206449L ^ (long)var2_3 ^ -8570205942426616978L);
                    this.nt_2[var1_1] = 0.0;
                    this.shshq[var1_1] = 0.0;
                    this.sha_7[var1_1] = 0.0;
                    this.khbm[var1_1] = 0L;
                    this.hjq[var1_1] = 0L;
                    ++var1_1;
                    try {
                        var4_2 += 5;
                        var3_4 = Integer.rotateLeft(var2_3 ^ 39524966, 14) ^ -609735213 ^ -609735213;
                    }
                    catch (NoSuchElementException v0) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ 39524966, 14) ^ 1229388721 ^ 1229388721;
                    }
                    continue block23;
                }
                case 1738280697: {
                    (Integer.rotateRight(28550774 ^ var2_3, 3) - 958318469) * 28550775;
                    return;
                }
                case 39524966: {
                    (Integer.rotateLeft(517642613 ^ var2_3, 6) - -1059703706) * 517642613;
                    (int)(-2564739204742059185L ^ (long)var2_3 ^ -7791083206891531007L);
                    if (var1_1 >= 3) {
                        var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 120791234, 14) ^ -1872252839176543834L ^ -1872252839176543834L);
                        Integer.rotateLeft(-1657298772 ^ var2_3, 6) - 236590095;
                        var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1738280697, 14) ^ -5305666199756033925L ^ -5305666199756033925L);
                        var4_2 += 2;
                        continue block23;
                    }
                    try {
                        var4_2 += 2;
                        if ((4264465503298017469L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ 1959671110, 14) + -1151092656 - -1151092656;
                    }
                    catch (ArithmeticException v1) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ 1959671110, 14) ^ 72695512 ^ 72695512;
                    }
                    var4_2 -= 5;
                    continue block23;
                }
                case 78544508: {
                    (Integer.rotateLeft(-1652139340 ^ var2_3, 6) - 396532487) * -1652139339;
                    try {
                        var4_2 -= 4;
                        if ((1877099663793901121L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14);
                    }
                    catch (IllegalStateException v2) {
                        var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 121047229, 14) ^ -7298809152487924148L ^ -7298809152487924148L);
                    }
                    continue block23;
                }
                case 1411093825: {
                    Integer.rotateLeft(333495564 ^ var2_3, 5) - 1821672367;
                    try {
                        if ((-4806029854269129523L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14) + 1291219046 - 1291219046;
                    }
                    catch (ArithmeticException v3) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14) + 726057535 - 726057535;
                    }
                    var4_2 += 2;
                    continue block23;
                }
                case 949314640: {
                    Integer.rotateRight(-565467582 ^ var2_3, 14) + -276381383;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 1623903976, 14)));
                    Integer.rotateLeft(-264446012 ^ var2_3, 17) - 465352695;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 121047229, 14)));
                    continue block23;
                }
                case -492618794: {
                    Integer.rotateLeft(-314259700 ^ var2_3, 16) - -1078871633;
                    var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14);
                    Integer.rotateRight(-916518942 ^ var2_3, 12) + 1725928345;
                    var4_2 -= 5;
                    continue block23;
                }
                case -614080661: {
                    Integer.rotateLeft(9282820 ^ var2_3, 3) - 361011895;
                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 121047229, 14) ^ -98099890885096500L ^ -98099890885096500L);
                    Integer.rotateLeft(1318877293 ^ var2_3, 12) - -1991232402;
                    (int)(-8345497419716957361L ^ (long)var2_3 ^ 5895356060687447436L);
                    ++var4_2;
                    continue block23;
                }
                case -2055712258: {
                    (Integer.rotateLeft(2019849424 ^ var2_3, 18) + -1735932821) * 2019849425;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 121047229, 14)));
                    (Integer.rotateRight(967267762 ^ var2_3, 10) + -6225975) * 967267763;
                    var4_2 += 4;
                    continue block23;
                }
                case -926551935: {
                    (Integer.rotateRight(707348123 ^ var2_3, 8) + 526199808) * 707348123;
                    (int)(6211994326714263328L ^ (long)var2_3 ^ 2497845934632141243L);
                    var3_4 = Integer.rotateLeft(var2_3 ^ -1049531349, 14);
                    (int)(-1909578306534993484L ^ (long)var2_3 ^ 6646007735757203246L);
                    var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14);
                    var4_2 -= 3;
                    continue block23;
                }
lbl134:
                // 1 sources

                Integer.rotateLeft(-950805624 ^ var2_3, 11) + 663041203;
                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -593794110, 14) ^ -468951531063618546L ^ -468951531063618546L);
                Integer.rotateLeft(1199393153 ^ var2_3, 11) + -1400273446;
                (int)(-8804563951177897137L ^ (long)var2_3 ^ 3605275650169546318L);
                var3_4 = Integer.rotateLeft(var2_3 ^ -1236611809, 14);
                Integer.rotateLeft(526871045 ^ var2_3, 6) - -773622314;
                (int)(-2461845875822630065L ^ (long)var2_3 ^ 8430882650896995962L);
                var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 121047229, 14)));
                var4_2 -= 2;
                continue block23;
lbl149:
                // 1 sources

                Integer.rotateLeft(-1658788224 ^ var2_3, 6) + 190417083;
                var3_4 = Integer.rotateLeft(var2_3 ^ -1967774521, 14);
                (Integer.rotateLeft(-552115011 ^ var2_3, 14) - 137548318) * -552115011;
                (int)(2136336250030058319L ^ (long)var2_3 ^ 7525659125795624602L);
                var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14);
                Integer.rotateLeft(2106725956 ^ var2_3, 18) - 957239671;
                continue block23;
                case 964063277: {
                    (Integer.rotateLeft(-816123691 ^ var2_3, 12) - 543213830) * -816123691;
                    (int)(1002155268283624271L ^ (long)var2_3 ^ 4656866163160626689L);
                    var3_4 = Integer.rotateLeft(var2_3 ^ 1146931204, 14);
                    Integer.rotateLeft(1647518889 ^ var2_3, 15) + -393277518;
                    (int)(-6881066386717349041L ^ (long)var2_3 ^ -1704468310500250414L);
                    try {
                        if ((-8629433991803325255L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14) ^ 1347659994 ^ 1347659994;
                    }
                    catch (IllegalStateException v4) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14) ^ 141751408 ^ 141751408;
                    }
                    var4_2 -= 5;
                    continue block23;
                }
            }
            Integer.rotateLeft(228084480 ^ var2_3, 4) + -1446071237;
            var3_4 = Integer.rotateLeft(var2_3 ^ 121047229, 14) ^ -576589781 ^ -576589781;
        }
    }

    private static String shna_2(String string, int n, int n2, int n3) {
        int n4 = -759279478;
        n4 = Integer.rotateLeft(n4 * -177121261, 3) ^ 0x315F3746;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 5);
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 23)) ^ 0xDE7C151A;
        if ((n5 ^ n4) != -562293478) {
            int cfr_ignored_0 = (0xCC24590 ^ n4) - 709205284;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x851CC433) + bsl_2 ^ Integer.reverse(n2 + i * -1603720413), 11) - str);
        }
        return new String(cArray);
    }

    private static void shtm_2() {
        int n = bqk.dr(1301870540);
        int n2 = n ^ 0x2AA580A4;
        if ((n2 ^ n) != 715489444) {
            int cfr_ignored_0 = Integer.rotateLeft(0x673D7768 ^ n, 15) + -2066803501;
        }
        yf.athz_2();
    }

    private static boolean tks_3(class_1309 class_13092) {
        block0: {
            int n = bqk.dr(260894727);
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x8C58EB53;
            if ((n2 ^ n) == -1940329645) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x83D41B54 ^ n, 3) - -83038617) * -2083251371;
        }
        return class_13092.method_31481();
    }

    private static int ddd_2(class_1309 class_13092) {
        block0: {
            int n = 320806333;
            int n2 = (n = Integer.rotateLeft(n * -944546357, 4) ^ 0x92D5121) ^ 0x6A1F896D;
            if ((n2 ^ n) == 1780451693) break block0;
            int cfr_ignored_0 = (0x790094D0 ^ n) - -1325252088;
        }
        return class_13092.method_5628();
    }

    private static tdhz_2 hth_2() {
        block0: {
            int n = -1504524904;
            int n2 = (n = Integer.rotateLeft(n * -1055446567, 22) ^ 0x478038D4) ^ 0xD09684C9;
            if ((n2 ^ n) == -795441975) break block0;
            int cfr_ignored_0 = (0x76C44151 ^ n) - 679143639;
        }
        return tdhz_2.trb();
    }

    private static void dqh_2(qh qh2, int n) {
        int n2 = 1851587970;
        n2 = Integer.rotateLeft(n2 * 535990237, 11) ^ 0xEE242599;
        qh qh3 = qh2;
        n2 = (qh3 != null ? System.identityHashCode(qh3) : 0) ^ n2;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 2)) ^ 0x4F4F2ED9;
        if ((n3 ^ n2) != 1330589401) {
            int cfr_ignored_0 = (0x2113D35B ^ n2) + 989758509;
        }
        qh2.dhal_2(n);
    }

    private static void ztd_2(qh qh2, int n, tdhz_2 tdhz2_2, long l) {
        int n2 = 807003199;
        n2 = Integer.rotateLeft(n2 * 1177903649, 8) ^ 0xAFFD6678;
        qh qh3 = qh2;
        n2 = Integer.rotateRight((qh3 != null ? System.identityHashCode(qh3) : 0) ^ n2, 21);
        int n3 = (n2 = n ^ n2) ^ 0x70692CF9;
        if ((n3 ^ n2) != 1885940985) {
            int cfr_ignored_0 = (0x4070C8C6 ^ n2) - 666509575;
        }
        qh2.dyt(n, tdhz2_2, l);
    }

    private static double dshn(qh qh2, int n, long l, tdhz_2 tdhz2_2) {
        block0: {
            int n2 = 410760045;
            int n3 = (n2 = Integer.rotateLeft(n2 * -11281755, 15) ^ 0xF892EA) ^ 0xDE74709D;
            if ((n3 ^ n2) == -562794339) break block0;
            int cfr_ignored_0 = (0xC60FC3F0 ^ n2) + -133307855;
        }
        return qh2.tdj(n, l, tdhz2_2);
    }

    private static float dhst_3(tay tay2) {
        block0: {
            int n = -642479326;
            int n2 = (n = Integer.rotateLeft(n * 1989909797, 3) ^ 0x3030A2B8) ^ 0x87CADF18;
            if ((n2 ^ n) == -2016747752) break block0;
            int cfr_ignored_0 = (0x5E7E543A ^ n) + -2095635084;
        }
        return tay2.thw_5();
    }

    private static float hzn(int n) {
        block0: {
            int n2 = -6392580;
            int n3 = (n2 = Integer.rotateLeft(n2 * -107430591, 21) ^ 0xA3A88631) ^ 0x8AF18D9E;
            if ((n3 ^ n2) == -1963881058) break block0;
            int cfr_ignored_0 = (0x756FF962 ^ n2) + -1416922388;
        }
        return Float.intBitsToFloat(n);
    }

    private static float aas_3(int n) {
        block0: {
            int n2 = -1389351011;
            n2 = Integer.rotateLeft(n2 * -1787848471, 8) ^ 0xBE373901;
            int n3 = (n2 = n ^ n2) ^ 0xFF0F7060;
            if ((n3 ^ n2) == -15765408) break block0;
            int cfr_ignored_0 = (0x523F5FFD ^ n2) - 1076824090;
        }
        return Float.intBitsToFloat(n);
    }

    private static float tnw_2(int n) {
        block0: {
            int n2 = -835742104;
            n2 = Integer.rotateLeft(n2 * 1699716139, 25) ^ 0x766E3CC7;
            int n3 = (n2 = n ^ n2) ^ 0x87643E11;
            if ((n3 ^ n2) == -2023473647) break block0;
            int cfr_ignored_0 = (0x494BA879 ^ n2) - -1668070207;
        }
        return Float.intBitsToFloat(n);
    }

    private static void sks_2(qh qh2, class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3, int n4) {
        int n5 = 1507660551;
        n5 = Integer.rotateLeft(n5 * 128855455, 27) ^ 0x8A68DE33;
        qh qh3 = qh2;
        n5 = Integer.rotateLeft((qh3 != null ? System.identityHashCode(qh3) : 0) ^ n5, 12);
        class_287 class_2873 = class_2872;
        n5 = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n5, 20);
        int n6 = n5 ^ 0x1B9A5369;
        if ((n6 ^ n5) != 463098729) {
            int cfr_ignored_0 = (0x4247406E ^ n5) + -1128883754;
        }
        qh2.tsht_2(class_2872, matrix4f, f, f2, f3, f4, f5, f6, f7, f8, f9, n, n2, n3, n4);
    }

    private static void zghgh(qh qh2, class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3, int n4) {
        int n5 = 354365246;
        n5 = Integer.rotateLeft(n5 * -951278723, 24) ^ 0x7A7D049A;
        class_287 class_2873 = class_2872;
        n5 = Integer.rotateRight((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n5, 25);
        Matrix4f matrix4f2 = matrix4f;
        n5 = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n5;
        int n6 = n5 ^ 0x353E03C4;
        if ((n6 ^ n5) != 893256644) {
            int cfr_ignored_0 = (0x20212CFA ^ n5) - -453958544;
        }
        qh2.tsht_2(class_2872, matrix4f, f, f2, f3, f4, f5, f6, f7, f8, f9, n, n2, n3, n4);
    }

    private static boolean bdq_2() {
        block0: {
            int n = 1931504856;
            int n2 = (n = Integer.rotateLeft(n * -211894703, 19) ^ 0xCE1CEEBB) ^ 0xDFD4BED3;
            if ((n2 ^ n) == -539705645) break block0;
            int cfr_ignored_0 = (0xACF4D20B ^ n) + -1323019181;
        }
        return yf.dnkh();
    }

    private static void tkhn_2(qh qh2, class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3, int n4) {
        int n5 = 1445577021;
        n5 = Integer.rotateLeft(n5 * 2006599933, 18) ^ 0x94962B63;
        qh qh3 = qh2;
        n5 = Integer.rotateRight((qh3 != null ? System.identityHashCode(qh3) : 0) ^ n5, 24);
        n5 = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n5, 8);
        int n6 = n5 ^ 0x2E6E06AD;
        if ((n6 ^ n5) != 778962605) {
            int cfr_ignored_0 = (0x7847C790 ^ n5) - 538465513;
        }
        qh2.tsht_2(class_2872, matrix4f, f, f2, f3, f4, f5, f6, f7, f8, f9, n, n2, n3, n4);
    }

    private static class_4588 shzy(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = 1562842455;
            n = Integer.rotateLeft(n * -1981516853, 18) ^ 0x3F563904;
            class_287 class_2873 = class_2872;
            n = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 26);
            Matrix4f matrix4f2 = matrix4f;
            n = Integer.rotateLeft((matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n, 14);
            int n2 = n ^ 0xC60C5529;
            if ((n2 ^ n) == -972270295) break block0;
            int cfr_ignored_0 = (0x9B2B407E ^ n) - 1420452034;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static class_4588 zsl_4(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = -2062560204;
            n = Integer.rotateLeft(n * -1608978869, 16) ^ 0x3CFE7ADA;
            class_287 class_2873 = class_2872;
            n = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 18);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xA09112A;
            if ((n2 ^ n) == 168366378) break block0;
            int cfr_ignored_0 = (0x8F06C51E ^ n) - -915976358;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static boolean sdt_4() {
        block0: {
            int n = -1854165800;
            int n2 = (n = Integer.rotateLeft(n * -1533033031, 14) ^ 0xE96DA5E2) ^ 0xFBE719E3;
            if ((n2 ^ n) == -68740637) break block0;
            int cfr_ignored_0 = (0x6A9CB53B ^ n) - -573523892;
        }
        return yf.khdha_2();
    }

    private static double sss_4(double d, double d2, double d3) {
        block0: {
            int n = bqk.dr(-1211035664);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 27);
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0x7CFBB48C;
            if ((n2 ^ n) == 2096870540) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCB2ABB7C ^ n, 12) - -1635101889) * -886391939;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static double hyt_2(qh qh2, double d, tdhz_2 tdhz2_2) {
        block0: {
            int n = -259300597;
            n = Integer.rotateLeft(n * 414554391, 23) ^ 0xDA2A5558;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x117EA81E;
            if ((n2 ^ n) == 293513246) break block0;
            int cfr_ignored_0 = (0xE1F5CB15 ^ n) + -760310873;
        }
        return qh2.ms_2(d, tdhz2_2);
    }

    private static double dhfd_2(double d, double d2, double d3) {
        block0: {
            int n = -1362414091;
            n = Integer.rotateLeft(n * 304448645, 25) ^ 0xE0A56684;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0x51AED8E9;
            if ((n2 ^ n) == 1370413289) break block0;
            int cfr_ignored_0 = (0xFF65ED1C ^ n) - -106118839;
        }
        return class_3532.method_16436((double)d, (double)d2, (double)d3);
    }

    private static boolean dhzt_4(khd khd2, String string) {
        block0: {
            int n = bqk.dr(839382137);
            khd khd3 = khd2;
            n = Integer.rotateLeft((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 25);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 18);
            int n2 = n ^ 0x63D6E015;
            if ((n2 ^ n) == 1675026453) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x51D1146C ^ n, 13) - -324069297;
        }
        return khd2.dhbn(string);
    }

    private static void rkhd_2() {
        int n = -619430970;
        int n2 = (n = Integer.rotateLeft(n * -1530352911, 28) ^ 0xBC1DA4E8) ^ 0x4DC8BF61;
        if ((n2 ^ n) != 1305001825) {
            int cfr_ignored_0 = (0x96DC84A7 ^ n) - -312580972;
        }
        yf.athz_2();
    }

    private static boolean bysh() {
        block0: {
            int n = 1428039593;
            int n2 = (n = Integer.rotateLeft(n * 1387968397, 11) ^ 0x6E960CD6) ^ 0xC576F6F3;
            if ((n2 ^ n) == -982059277) break block0;
            int cfr_ignored_0 = (0x9068D15A ^ n) - 26704444;
        }
        return yf.khdha_2();
    }

    private static void thshl() {
        int n = -715643386;
        int n2 = (n = Integer.rotateLeft(n * 1768332915, 22) ^ 0xD151F969) ^ 0x48CE142E;
        if ((n2 ^ n) != 1221465134) {
            int cfr_ignored_0 = (0x9D963228 ^ n) - -1185807178;
        }
        yf.athz_2();
    }

    private static khd tds_6(tdhz_2 tdhz2_2) {
        block0: {
            int n = -1949791996;
            n = Integer.rotateLeft(n * -1832341803, 25) ^ 0xC1FF9E2F;
            tdhz_2 tdhz3_2 = tdhz2_2;
            n = (tdhz3_2 != null ? System.identityHashCode(tdhz3_2) : 0) ^ n;
            int n2 = n ^ 0x742DB1C4;
            if ((n2 ^ n) == 1949151684) break block0;
            int cfr_ignored_0 = (0xFFE538C0 ^ n) - 464437002;
        }
        return tdhz2_2.athk();
    }

    private static String thn_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1064019322;
            n4 = Integer.rotateLeft(n4 * 1245164303, 26) ^ 0x374271B5;
            n4 = Integer.rotateLeft(n2 ^ n4, 8);
            int n5 = (n4 = n3 ^ n4) ^ 0x4519C06B;
            if ((n5 ^ n4) == 1159315563) break block0;
            int cfr_ignored_0 = (0x7A726511 ^ n4) + -969625554;
        }
        return qh.shna_2(string, n, n2, n3);
    }

    private static String hnkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bqk.dr(1082487585);
            n4 = Integer.rotateRight(n ^ n4, 12);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 3)) ^ 0xAB975DE5;
            if ((n5 ^ n4) == -1416143387) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEB122EC4 ^ n4, 16) - 2073118967;
        }
        return qh.shna_2(string, n, n2, n3);
    }

    private static boolean ddm_3(khd khd2, String string) {
        block0: {
            int n = -978370742;
            n = Integer.rotateLeft(n * -1048295189, 4) ^ 0x14E78022;
            khd khd3 = khd2;
            n = Integer.rotateLeft((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 19);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 29);
            int n2 = n ^ 0xBC584C3B;
            if ((n2 ^ n) == -1135064005) break block0;
            int cfr_ignored_0 = (0x79F77371 ^ n) + -2019973577;
        }
        return khd2.dhbn(string);
    }

    private static String tjh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1752348587;
            n4 = Integer.rotateLeft(n4 * -112147873, 21) ^ 0xC3ED39BB;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 11);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 22)) ^ 0x40573E93;
            if ((n5 ^ n4) == 1079459475) break block0;
            int cfr_ignored_0 = (0x28258938 ^ n4) - 1536381537;
        }
        return qh.shna_2(string, n, n2, n3);
    }

    private static khd mt(tdhz_2 tdhz2_2) {
        block0: {
            int n = -447135513;
            n = Integer.rotateLeft(n * 932862817, 25) ^ 0xE2F75724;
            tdhz_2 tdhz3_2 = tdhz2_2;
            n = (tdhz3_2 != null ? System.identityHashCode(tdhz3_2) : 0) ^ n;
            int n2 = n ^ 0x8A5351D0;
            if ((n2 ^ n) == -1974251056) break block0;
            int cfr_ignored_0 = (0x6F0A1137 ^ n) + 1168748946;
        }
        return tdhz2_2.athk();
    }

    private static int yb(ThreadLocalRandom threadLocalRandom, int n) {
        block0: {
            int n2 = 985229844;
            n2 = Integer.rotateLeft(n2 * -732765557, 15) ^ 0x4AAB7364;
            ThreadLocalRandom threadLocalRandom2 = threadLocalRandom;
            n2 = (threadLocalRandom2 != null ? System.identityHashCode(threadLocalRandom2) : 0) ^ n2;
            int n3 = (n2 = n ^ n2) ^ 0x28CBD7A7;
            if ((n3 ^ n2) == 684447655) break block0;
            int cfr_ignored_0 = (0x1272BDB3 ^ n2) + 1747329498;
        }
        return threadLocalRandom.nextInt(n);
    }

    private static String[] tds_8(String string) {
        int n = bqk.dr(-1673069870);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 5);
        int n2 = n ^ 0x639AD730;
        if ((n2 ^ n) != 1671092016) {
            int cfr_ignored_0 = Integer.rotateRight(0xFFDC2DE2 ^ n, 18) + 470425;
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

    private static CallSite zdl_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1835707204;
            n3 = Integer.rotateLeft(n3 * -455112959, 16) ^ 0xC8793F19;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 20);
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 2);
            int n4 = n3 ^ 0x97B07D7;
            if ((n4 ^ n3) != 159057879) {
                int cfr_ignored_0 = (0x6411AC93 ^ n3) - -1450611939;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ghz ^ string.hashCode()) + (n2 + sdhsh_2) + i ^ ghz, 5) + sdhsh_2);
            }
            String[] stringArray = qh.tds_8(new String(cArray));
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

    private static String[] g6w8ww21m6z(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite o7go69a7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ t7ruwud4 ^ string.hashCode() ^ n2 + mv82z17su + i * 919118725) + t7ruwud4) ^ mv82z17su));
            }
            String[] stringArray = qh.g6w8ww21m6z(new String(cArray));
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

