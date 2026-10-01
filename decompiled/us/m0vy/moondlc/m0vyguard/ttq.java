/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.bdn;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.bhn_2;
import us.m0vy.moondlc.m0vyguard.taa;
import us.m0vy.moondlc.m0vyguard.tadh;
import us.m0vy.moondlc.m0vyguard.tkhth;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.tsy;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.jz_2;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.shdh_5;
import us.m0vy.moondlc.m0vyguard.msh;

public final class ttq
implements dl {
    private static final ttq szt_4;
    private static final float shds_3 = 126.0f;
    private static final float jmn = 6.0f;
    private static final float dhsb = 19.0f;
    private static final float khks = 4.0f;
    private final bhn_2 rtz_2 = new bhn_2(280L, 0.0f, bdz.bjk);
    private final Map khyt = new HashMap();
    private thw_3 sdhkh_2;
    private float shwq;
    private float dq_2;
    private float jwq;
    private float hmq;
    private float zyz_2;
    private boolean hbz_2;
    private boolean rbk = true;
    private boolean thzz_3;
    private tdj jtw_2;
    private boolean hdhh_2;
    private float rsk;
    private float zar;
    private long rkhq = System.currentTimeMillis();
    private static final int zoxocx6qaxac = 937138876;
    private static final int wz9m2ebr = -560233131;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nyxs7wgk5a1;

    public static ttq tdhd_4() {
        return szt_4;
    }

    private ttq() {
    }

    public void jah_4(thw_3 thw2_2, float f, float f2) {
        if (thw2_2 == null) {
            return;
        }
        tsy.baz_4().thrsh();
        this.sdhkh_2 = thw2_2;
        this.hbz_2 = true;
        this.rbk = false;
        this.jtw_2 = null;
        this.hdhh_2 = false;
        this.rtz_2.htgh(bdz.bjk);
        this.rtz_2.sqm(280L);
        this.rtz_2.sby_2(true);
        this.atl_2();
        float f3 = mc.method_22683().method_4486();
        float f4 = mc.method_22683().method_4502();
        this.jwq = class_3532.method_15363((float)(f - 8.0f), (float)4.0f, (float)Math.max(4.0f, f3 - 126.0f - 4.0f));
        this.hmq = class_3532.method_15363((float)(f2 - 8.0f), (float)4.0f, (float)Math.max(4.0f, f4 - this.zyz_2 - 4.0f));
        if (this.rbk || !this.thzz_3) {
            this.shwq = this.jwq;
            this.dq_2 = this.hmq;
            this.thzz_3 = true;
        }
    }

    public void zjsh_2() {
        if (!this.hbz_2) {
            return;
        }
        this.hbz_2 = false;
        this.jtw_2 = null;
        this.hdhh_2 = false;
        this.rtz_2.htgh(bdz.jkhgh);
        this.rtz_2.sqm(200L);
        this.rtz_2.sby_2(false);
    }

    public boolean twdh_2() {
        return !this.rbk && this.hbz_2 && this.sdhkh_2 != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void hhj(class_4587 class_45872) {
        if (this.rbk) {
            return;
        }
        if (!this.ajth() || this.sdhkh_2 == null) {
            this.zjsh_2();
        }
        long l = System.currentTimeMillis();
        float f = class_3532.method_15363((float)((float)(l - this.rkhq) / 1000.0f), (float)0.001f, (float)0.1f);
        this.rkhq = l;
        this.rtz_2.sby_2(this.hbz_2);
        float f2 = this.rtz_2.hnf();
        float f3 = class_3532.method_15363((float)f2, (float)0.0f, (float)1.0f);
        if (!this.hbz_2 && f3 <= 0.02f && this.rtz_2.ztd_4()) {
            this.rbk = true;
            this.thzz_3 = false;
            this.sdhkh_2 = null;
            this.jtw_2 = null;
            this.hdhh_2 = false;
            return;
        }
        if (f3 <= 0.001f || this.sdhkh_2 == null) {
            return;
        }
        this.atl_2();
        float f4 = mc.method_22683().method_4486();
        float f5 = mc.method_22683().method_4502();
        if (this.hdhh_2) {
            this.jwq = class_3532.method_15363((float)(this.tghz() - this.rsk), (float)4.0f, (float)Math.max(4.0f, f4 - 126.0f - 4.0f));
            this.hmq = class_3532.method_15363((float)(this.bshz_2() - this.zar), (float)4.0f, (float)Math.max(4.0f, f5 - this.zyz_2 - 4.0f));
            this.shwq = class_3532.method_16439((float)(f * 24.0f), (float)this.shwq, (float)this.jwq);
            this.dq_2 = class_3532.method_16439((float)(f * 24.0f), (float)this.dq_2, (float)this.hmq);
        } else {
            this.jwq = class_3532.method_15363((float)this.jwq, (float)4.0f, (float)Math.max(4.0f, f4 - 126.0f - 4.0f));
            this.hmq = class_3532.method_15363((float)this.hmq, (float)4.0f, (float)Math.max(4.0f, f5 - this.zyz_2 - 4.0f));
            this.shwq = class_3532.method_16439((float)(f * 18.0f), (float)this.shwq, (float)this.jwq);
            this.dq_2 = class_3532.method_16439((float)(f * 18.0f), (float)this.dq_2, (float)this.hmq);
            if (Math.abs(this.jwq - this.shwq) < 0.05f) {
                this.shwq = this.jwq;
            }
            if (Math.abs(this.hmq - this.dq_2) < 0.05f) {
                this.dq_2 = this.hmq;
            }
        }
        this.rath_2();
        float f6 = class_3532.method_15363((float)f2, (float)0.0f, (float)1.15f);
        float f7 = this.shwq + 63.0f;
        float f8 = this.dq_2 + this.zyz_2 / 2.0f;
        class_45872.method_22903();
        class_45872.method_46416(0.0f, 0.0f, 2500.0f);
        class_45872.method_46416(f7, f8, 0.0f);
        class_45872.method_22905(f6, f6, 1.0f);
        class_45872.method_46416(-f7, -f8, 0.0f);
        try {
            this.zmd_3(class_45872, f3, f);
        }
        finally {
            class_45872.method_22909();
        }
    }

    private void zmd_3(class_4587 class_45872, float f, float f2) {
        Color color = new Color(9, 9, 9, Math.round(245.0f * f));
        float f3 = 6.0f;
        bjgh.jghs.hrj(class_45872, this.shwq - 1.5f, this.dq_2 - 1.5f, 129.0f, this.zyz_2 + 3.0f, f3 + 1.5f, new Color(0, 0, 0, Math.round(95.0f * f)));
        bjgh.jghs.hrj(class_45872, this.shwq, this.dq_2, 126.0f, this.zyz_2, f3, color);
        this.zsa_4(class_45872, f);
        float f4 = this.dq_2 + 19.0f + 2.5f;
        List list = this.sdhkh_2.bhh();
        for (bdn bdn2 : list) {
            if (bdn2 instanceof ra_2) {
                ra_2 ra2_2 = (ra_2)bdn2;
                this.thza_3(class_45872, ra2_2, f4, f);
                f4 += 26.0f;
                continue;
            }
            if (bdn2 instanceof tkhth) {
                tkhth tkhth2 = (tkhth)bdn2;
                this.zkhs_2(class_45872, tkhth2, f4, f);
                int n = (tkhth2.rrw().size() + 1) / 2;
                f4 += 10.0f + (float)n * 14.5f;
                continue;
            }
            if (bdn2 instanceof tdj) {
                tdj tdj2 = (tdj)bdn2;
                this.ghsh(class_45872, tdj2, f4, f, f2);
                f4 += 21.0f;
                continue;
            }
            if (!(bdn2 instanceof shdh_5)) continue;
            shdh_5 shdh2 = (shdh_5)bdn2;
            this.ghht(class_45872, shdh2, f4, f);
            f4 += 26.0f;
        }
    }

    private void zsa_4(class_4587 class_45872, float f) {
        float f2;
        Object object;
        Color color = bas_4.zsz_4();
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(255.0f * f));
        Color color3 = new Color(255, 255, 255, Math.round(255.0f * f));
        Color color4 = new Color(117, 117, 117, Math.round(220.0f * f));
        Color color5 = new Color(28, 28, 28, Math.round(255.0f * f));
        float f3 = 9.5f;
        float f4 = this.shwq + 6.0f + 1.0f;
        float f5 = this.dq_2 + (19.0f - f3) / 2.0f;
        if (this.sdhkh_2.thdr()) {
            object = this.sdhkh_2.dhdh_7();
            String string = this.sdhkh_2.ghssh_2();
            f2 = ((bsh_2)object).shdf_2(string, f3);
            ((bsh_2)object).zskh_4(class_45872, string, f4 + (f3 - f2) / 2.0f, f5 + 0.6f, f3, color2, 0.0f);
        } else {
            object = this.sdhkh_2.ththz();
            this.tkhf(class_45872, (class_2960)object, f4, f5, f3, f3, color2);
        }
        object = this.sdhkh_2.zhsh_2();
        float f6 = f4 + f3 + 4.0f;
        f2 = this.dq_2 + 6.5f;
        float f7 = 7.2f;
        brz_2.btd_2.zskh_4(class_45872, (String)object, f6, f2, f7, color3, 0.0f);
        float f8 = brz_2.btd_2.shdf_2((String)object, f7);
        float f9 = f6 + f8 + 3.0f;
        brz_2.btd_2.zskh_4(class_45872, "•", f9, f2 - 0.2f, f7, color4, 0.0f);
        float f10 = f9 + brz_2.btd_2.shdf_2("•", f7) + 3.0f;
        brz_2.btd_2.zskh_4(class_45872, "Settings", f10, f2, f7, color3, 0.0f);
        bjgh.jghs.hrj(class_45872, this.shwq + 6.0f, this.dq_2 + 19.0f - 0.5f, 114.0f, 0.8f, 0.0f, color5);
    }

    private void thza_3(class_4587 class_45872, ra_2 ra2_2, float f, float f2) {
        float f3 = this.shwq + 6.0f;
        float f4 = f;
        Color color = new Color(255, 255, 255, Math.round(235.0f * f2));
        brz_2.btd_2.zskh_4(class_45872, ra2_2.getName(), f3, f4, 6.4f, color, 0.0f);
        float f5 = f + 8.5f;
        float f6 = 114.0f;
        List list = ra2_2.thwkh();
        int n = list.size();
        float f7 = 3.0f;
        float f8 = (f6 - (float)(n - 1) * f7) / (float)n;
        float f9 = 11.8f;
        float f10 = 2.5f;
        float f11 = this.tghz();
        float f12 = this.bshz_2();
        for (int i = 0; i < n; ++i) {
            Color color2;
            Color color3;
            String string = (String)list.get(i);
            float f13 = f3 + (float)i * (f8 + f7);
            boolean bl = ra2_2.thnth(string);
            boolean bl2 = baf.zath(f11, f12, f13, f5, f8, f9);
            String string2 = ra2_2.getName() + "_" + string;
            float f14 = this.khyt.getOrDefault(string2, Float.valueOf(0.0f)).floatValue();
            this.khyt.put(string2, Float.valueOf(f14 += (bl2 ? 1.0f : 0.0f - f14) * 0.3f));
            if (bl) {
                Color color4 = bas_4.zsz_4();
                color3 = new Color(color4.getRed(), color4.getGreen(), color4.getBlue(), Math.round(255.0f * f2));
                color2 = new Color(255, 255, 255, Math.round(255.0f * f2));
            } else {
                int n2 = Math.min(42, 20 + Math.round(16.0f * f14));
                color3 = new Color(n2, n2, n2, Math.round(255.0f * f2));
                color2 = new Color(185, 185, 185, Math.round(230.0f * f2));
            }
            bjgh.jghs.hrj(class_45872, f13, f5, f8, f9, f10, color3);
            float f15 = brz_2.btd_2.shdf_2(string, 6.4f);
            float f16 = f13 + (f8 - f15) / 2.0f;
            float f17 = f5 + (f9 - 6.4f) / 2.0f - 0.2f;
            brz_2.btd_2.zskh_4(class_45872, string, f16, f17, 6.4f, color2, 0.0f);
        }
    }

    private void zkhs_2(class_4587 class_45872, tkhth tkhth2, float f, float f2) {
        float f3 = this.shwq + 6.0f;
        float f4 = f;
        Color color = new Color(255, 255, 255, Math.round(235.0f * f2));
        brz_2.btd_2.zskh_4(class_45872, tkhth2.getName(), f3, f4, 6.4f, color, 0.0f);
        float f5 = 114.0f;
        List list = tkhth2.rrw();
        float f6 = 3.0f;
        float f7 = (f5 - f6) / 2.0f;
        float f8 = 11.5f;
        float f9 = 2.5f;
        float f10 = this.tghz();
        float f11 = this.bshz_2();
        for (int i = 0; i < list.size(); ++i) {
            Color color2;
            Color color3;
            int n = i % 2;
            int n2 = i / 2;
            String string = (String)list.get(i);
            float f12 = f3 + (float)n * (f7 + f6);
            float f13 = f + 8.5f + (float)n2 * (f8 + f6);
            boolean bl = tkhth2.akhj(string);
            boolean bl2 = baf.zath(f10, f11, f12, f13, f7, f8);
            if (bl) {
                Color color4 = bas_4.zsz_4();
                color3 = new Color(color4.getRed(), color4.getGreen(), color4.getBlue(), Math.round(255.0f * f2));
                color2 = new Color(255, 255, 255, Math.round(255.0f * f2));
            } else {
                int n3 = bl2 ? 34 : 20;
                color3 = new Color(n3, n3, n3, Math.round(255.0f * f2));
                color2 = new Color(185, 185, 185, Math.round(230.0f * f2));
            }
            bjgh.jghs.hrj(class_45872, f12, f13, f7, f8, f9, color3);
            float f14 = brz_2.btd_2.shdf_2(string, 6.4f);
            float f15 = f12 + (f7 - f14) / 2.0f;
            float f16 = f13 + (f8 - 6.4f) / 2.0f - 0.2f;
            brz_2.btd_2.zskh_4(class_45872, string, f15, f16, 6.4f, color2, 0.0f);
        }
    }

    private void ghht(class_4587 class_45872, shdh_5 shdh2, float f, float f2) {
        float f3 = this.shwq + 6.0f;
        float f4 = f;
        Color color = new Color(255, 255, 255, Math.round(235.0f * f2));
        brz_2.btd_2.zskh_4(class_45872, shdh2.getName(), f3, f4, 6.4f, color, 0.0f);
        float f5 = f + 8.5f;
        float f6 = 114.0f;
        float f7 = 3.0f;
        float f8 = (f6 - f7) / 2.0f;
        float f9 = 11.8f;
        float f10 = 2.5f;
        String[] stringArray = new String[]{"Enabled", "Disabled"};
        boolean[] blArray = new boolean[]{shdh2.dhdhq(), !shdh2.dhdhq()};
        float f11 = this.tghz();
        float f12 = this.bshz_2();
        for (int i = 0; i < 2; ++i) {
            Color color2;
            Color color3;
            String string = stringArray[i];
            boolean bl = blArray[i];
            float f13 = f3 + (float)i * (f8 + f7);
            boolean bl2 = baf.zath(f11, f12, f13, f5, f8, f9);
            if (bl) {
                Color color4 = bas_4.zsz_4();
                color3 = new Color(color4.getRed(), color4.getGreen(), color4.getBlue(), Math.round(255.0f * f2));
                color2 = new Color(255, 255, 255, Math.round(255.0f * f2));
            } else {
                int n = bl2 ? 34 : 20;
                color3 = new Color(n, n, n, Math.round(255.0f * f2));
                color2 = new Color(185, 185, 185, Math.round(230.0f * f2));
            }
            bjgh.jghs.hrj(class_45872, f13, f5, f8, f9, f10, color3);
            float f14 = brz_2.btd_2.shdf_2(string, 6.4f);
            float f15 = f13 + (f8 - f14) / 2.0f;
            float f16 = f5 + (f9 - 6.4f) / 2.0f - 0.2f;
            brz_2.btd_2.zskh_4(class_45872, string, f15, f16, 6.4f, color2, 0.0f);
        }
    }

    private void ghsh(class_4587 class_45872, tdj tdj2, float f, float f2, float f3) {
        float f4 = this.shwq + 6.0f;
        float f5 = f;
        Color color = new Color(255, 255, 255, Math.round(235.0f * f2));
        brz_2.btd_2.zskh_4(class_45872, tdj2.getName(), f4, f5, 6.4f, color, 0.0f);
        String string = tdj2.smw();
        float f6 = brz_2.btd_2.shdf_2(string, 5.8f);
        float f7 = this.shwq + 126.0f - 6.0f - f6;
        float f8 = f + 8.5f;
        brz_2.btd_2.zskh_4(class_45872, string, f7, f8 - 0.5f, 5.8f, color, 0.0f);
        float f9 = f4;
        float f10 = f + 9.0f;
        float f11 = 114.0f - f6 - 5.0f;
        float f12 = 3.0f;
        float f13 = 1.5f;
        bjgh.jghs.hrj(class_45872, f9, f10, f11, f12, f13, new Color(20, 20, 20, Math.round(255.0f * f2)));
        float f14 = tdj2.shykh(f3);
        float f15 = Math.max(f12, f11 * f14);
        Color color2 = bas_4.zsz_4();
        Color color3 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), Math.round(255.0f * f2));
        bjgh.jghs.hrj(class_45872, f9, f10, f15, f12, f13, color3);
        float f16 = 5.6f;
        float f17 = f16 / 2.0f;
        float f18 = f9 + f11 * f14 - f17;
        float f19 = f10 + f12 / 2.0f - f17;
        tadh.khdhh(class_45872, f18, f19, f16, f16, jz_2.all(f17), new bkt(225, 225, 225, (int)(255.0f * f2)));
    }

    private void tkhf(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, Color color) {
        if (class_29602 == null) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        int n = color.getRGB();
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.disableBlend();
    }

    private void rath_2() {
        if (this.jtw_2 == null) {
            return;
        }
        float f = this.tghz();
        float f2 = this.shwq + 6.0f;
        String string = this.jtw_2.smw();
        float f3 = brz_2.btd_2.shdf_2(string, 5.8f);
        float f4 = 114.0f - f3 - 5.0f;
        float f5 = (f - f2) / f4;
        this.jtw_2.khtsh(f5);
    }

    public boolean hwz_2(int n, int n2) {
        if (!this.ajth()) {
            this.zjsh_2();
            return false;
        }
        float f = this.tghz();
        float f2 = this.bshz_2();
        if (n2 == 0) {
            if (this.hdhh_2) {
                this.hdhh_2 = false;
                return true;
            }
            if (this.jtw_2 != null) {
                this.jtw_2 = null;
                msh.jt_2().ghsd();
                return true;
            }
        }
        if (n2 == 1) {
            thw_3 thw2_2;
            if (!this.rbk && this.hbz_2 && this.sdhkh_2 != null) {
                thw_3 thw3;
                if (this.sdhn(f, f2)) {
                    if (n == 0 && f2 >= this.dq_2 && f2 <= this.dq_2 + 19.0f) {
                        this.hdhh_2 = true;
                        this.rsk = f - this.shwq;
                        this.zar = f2 - this.dq_2;
                        return true;
                    }
                    this.hsa(f, f2, n);
                    return true;
                }
                if (n == 1 && (thw3 = this.sghy_2()) != null) {
                    this.jah_4(thw3, f, f2);
                    return true;
                }
                if (n == 0) {
                    this.zjsh_2();
                    return false;
                }
            } else if (n == 1 && (thw2_2 = this.sghy_2()) != null) {
                this.jah_4(thw2_2, f, f2);
                return true;
            }
        }
        return false;
    }

    public boolean alr(double d, double d2) {
        return !this.rbk && this.hbz_2 && this.ajth() && this.sdhn(this.tghz(), this.bshz_2());
    }

    private thw_3 sghy_2() {
        for (thw_3 thw2_2 : taa.tdt_8().dab_4()) {
            if (!thw2_2.tat_2() || thw2_2.khta_3() == null || !thw2_2.khta_3().isHovering()) continue;
            return thw2_2;
        }
        return null;
    }

    private void hsa(float f, float f2, int n) {
        if (this.sdhkh_2 == null || n != 0) {
            return;
        }
        float f3 = this.dq_2 + 19.0f + 2.5f;
        List list = this.sdhkh_2.bhh();
        for (bdn bdn2 : list) {
            int n2;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            if (bdn2 instanceof ra_2) {
                ra_2 ra2_2 = (ra_2)bdn2;
                f8 = f3 + 8.5f;
                f7 = 114.0f;
                List list2 = ra2_2.thwkh();
                int n3 = list2.size();
                f6 = 3.0f;
                f5 = (f7 - (float)(n3 - 1) * f6) / (float)n3;
                f4 = 11.8f;
                for (n2 = 0; n2 < n3; ++n2) {
                    float f9 = this.shwq + 6.0f + (float)n2 * (f5 + f6);
                    if (!baf.zath(f, f2, f9, f8, f5, f4)) continue;
                    ra2_2.ttn_4((String)list2.get(n2));
                    return;
                }
                f3 += 26.0f;
                continue;
            }
            if (bdn2 instanceof tkhth) {
                int n4;
                tkhth tkhth2 = (tkhth)bdn2;
                f8 = 114.0f;
                List list3 = tkhth2.rrw();
                float f10 = 3.0f;
                float f11 = (f8 - f10) / 2.0f;
                f6 = 11.5f;
                for (n4 = 0; n4 < list3.size(); ++n4) {
                    int n5 = n4 % 2;
                    n2 = n4 / 2;
                    String string = (String)list3.get(n4);
                    float f12 = this.shwq + 6.0f + (float)n5 * (f11 + f10);
                    float f13 = f3 + 8.5f + (float)n2 * (f6 + f10);
                    if (!baf.zath(f, f2, f12, f13, f11, f6)) continue;
                    tkhth2.srgh(string);
                    return;
                }
                n4 = (list3.size() + 1) / 2;
                f3 += 10.0f + (float)n4 * 14.5f;
                continue;
            }
            if (bdn2 instanceof tdj) {
                f8 = this.shwq + 6.0f;
                f7 = f3 + 9.0f;
                tdj tdj2 = (tdj)bdn2;
                String string = tdj2.smw();
                float f14 = brz_2.btd_2.shdf_2(string, 5.8f);
                f6 = 114.0f - f14 - 5.0f;
                if (baf.zath(f, f2, f8 - 2.0f, f7 - 2.5f, f6 + 4.0f, (f5 = 7.0f) + 5.0f)) {
                    this.jtw_2 = tdj2;
                    f4 = (f - f8) / f6;
                    tdj2.khtsh(f4);
                    return;
                }
                f3 += 21.0f;
                continue;
            }
            if (!(bdn2 instanceof shdh_5)) continue;
            shdh_5 shdh2 = (shdh_5)bdn2;
            f8 = f3 + 8.5f;
            f7 = 114.0f;
            float f15 = 3.0f;
            float f16 = (f7 - f15) / 2.0f;
            f6 = 11.8f;
            if (baf.zath(f, f2, this.shwq + 6.0f, f8, f16, f6)) {
                shdh2.ashl(true);
                return;
            }
            if (baf.zath(f, f2, this.shwq + 6.0f + f16 + f15, f8, f16, f6)) {
                shdh2.ashl(false);
                return;
            }
            f3 += 26.0f;
        }
    }

    private void atl_2() {
        if (this.sdhkh_2 == null) {
            this.zyz_2 = 70.0f;
            return;
        }
        float f = 21.5f;
        for (bdn bdn2 : this.sdhkh_2.bhh()) {
            if (bdn2 instanceof ra_2 || bdn2 instanceof shdh_5) {
                f += 26.0f;
                continue;
            }
            if (bdn2 instanceof tkhth) {
                tkhth tkhth2 = (tkhth)bdn2;
                int n = (tkhth2.rrw().size() + 1) / 2;
                f += 10.0f + (float)n * 14.5f;
                continue;
            }
            if (!(bdn2 instanceof tdj)) continue;
            f += 21.0f;
        }
        this.zyz_2 = f += 4.0f;
    }

    private boolean sdhn(float f, float f2) {
        return baf.mk(f, f2, this.shwq, this.dq_2, 126.0f, this.zyz_2, 6.0f);
    }

    private boolean ajth() {
        return ttq.mc.field_1724 != null && ttq.mc.field_1687 != null && ttq.mc.field_1755 instanceof class_408 && bza_4.thtsh_2().rgha_2();
    }

    private float tghz() {
        return (float)(ttq.mc.field_1729.method_1603() / mc.method_22683().method_4495());
    }

    private float bshz_2() {
        return (float)(ttq.mc.field_1729.method_1604() / mc.method_22683().method_4495());
    }

    private static String[] vtyrp9i3(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite knds51osr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zoxocx6qaxac ^ string.hashCode()) + (n2 + wz9m2ebr) + i ^ zoxocx6qaxac, 11) + wz9m2ebr);
            }
            String[] stringArray = ttq.vtyrp9i3(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

