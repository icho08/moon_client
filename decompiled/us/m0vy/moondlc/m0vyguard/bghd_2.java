/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1044
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
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
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1044;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bza_2;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.bzy_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.bhl_2;
import us.m0vy.moondlc.m0vyguard.taf;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tkhth;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.tdhs_2;
import us.m0vy.moondlc.m0vyguard.tzm;
import us.m0vy.moondlc.m0vyguard.tk;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.shdh_5;
import us.m0vy.moondlc.m0vyguard.qd_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class bghd_2
extends bqt {
    private static final DateTimeFormatter shhkh;
    private final bza_2 dghdh = new bza_2(brz_2.shjh_2, " fps", 7.5f, 200L, btf_2.sdhr);
    private float bkhr = 0.0f;
    private float bbd_2 = 0.0f;
    private float dnz = 0.0f;
    private float khrb = 0.0f;
    private float shwd_2 = 1.0f;
    private String jtkh_2 = "";
    private final tkhth dhqsh = new tkhth("Elements", List.of("User", "IP", "FPS", "Time"), Set.of("User", "IP", "FPS", "Time"));
    private final ra_2 tdq = new ra_2("Lyrics Bar", List.of("Enabled", "Disabled"), "Enabled");
    private final shdh_5 sthr_2 = new shdh_5("Hide on Lyrics", false);
    private final ra_2 dw_2 = new ra_2("Logo Side", List.of("Left", "Right"), "Left");
    private final tdj rthd = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int i2y8m40oo = 1791641745;
    private static final int yov3nk5r3igz2 = 220685327;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wab2hswyxi;

    public bghd_2() {
        super(8.0f, 8.0f);
        this.rthd.tyt_3(this::dst_7);
        this.rght(this.dhqsh);
        this.rght(this.tdq);
        this.rght(this.sthr_2);
        this.rght(this.dw_2);
        this.rght(this.rthd);
    }

    @Override
    public String getName() {
        return "Moondlc Watermark";
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        String string;
        if (bghd_2.mc.field_1724 == null) {
            return;
        }
        float f6 = this.awd_2();
        float f7 = 15.0f;
        float f8 = 5.0f;
        float f9 = 6.5f;
        float f10 = 7.5f;
        float f11 = 2.5f;
        float f12 = 5.0f;
        float f13 = 1.0f;
        float f14 = 8.0f;
        float f15 = 4.0f;
        float f16 = this.zfj_2(this.khta_3().getX());
        float f17 = this.zfj_2(this.khta_3().getY());
        this.bkhr = class_3532.method_16439((float)0.1f, (float)this.bkhr, (float)mc.method_47599());
        this.dghdh.rtb(Math.round(this.bkhr));
        String string2 = mc.method_1558() != null ? bghd_2.mc.method_1558().field_3761 : "singleplayer";
        String string3 = yf.thwt_2().dzl_4().isEmpty() ? System.getProperty("user.name") : yf.thwt_2().dzl_4();
        String string4 = LocalTime.now().format(shhkh);
        boolean bl = this.dhqsh.akhj("User");
        boolean bl2 = this.dhqsh.akhj("IP");
        boolean bl3 = this.dhqsh.akhj("FPS");
        boolean bl4 = this.dhqsh.akhj("Time");
        boolean bl5 = this.tdq.thnth("Enabled");
        qd_2 qd2_2 = Moondlc.getInstance().getMusicTracker();
        boolean bl6 = qd2_2 != null && qd2_2.bdhl() && qd2_2.khyl() != null;
        boolean bl7 = bl6 && qd2_2.dhlf();
        tdhs_2 tdhs2 = bl6 ? qd2_2.trh() : null;
        boolean bl8 = tdhs2 != null && tdhs2.shs_2() != null && !tdhs2.shs_2().isEmpty();
        String string5 = string = bl6 && qd2_2.khyl().getMedia() != null ? qd2_2.khyl().getMedia().getTitle() + " - " + qd2_2.khyl().getMedia().getArtist() : "";
        if (bl5 && bl6 && bl7 && !string.isEmpty() && !string.equals(this.jtkh_2)) {
            this.jtkh_2 = string;
            if (!bl8) {
                bhl_2.ttr_2("", "Doesn't have available lyrics", 5000L);
            }
        }
        float f18 = bl5 && bl6 && bl7 && bl8 ? 1.0f : 0.0f;
        this.bbd_2 = this.khhs_3(this.bbd_2, f18, f6, bl7 ? 8.0f : 16.0f);
        boolean bl9 = this.sthr_2.dhdhq() && this.bbd_2 > 0.02f;
        this.shwd_2 = this.khhs_3(this.shwd_2, bl9 ? 0.0f : 1.0f, f6, 12.0f);
        boolean bl10 = (bl || bl2 || bl3 || bl4) && this.shwd_2 > 0.02f;
        Color color = Color.WHITE;
        float f19 = 15.0f;
        float f20 = 12.0f;
        float f21 = 5.0f;
        int n = 0;
        if (bl) {
            class_2960 class_29602 = tk.dhfy();
            f5 = class_29602 != null ? 9.0f : brz_2.tsf.shdf_2("U", 7.5f);
            f21 += f5 + 2.5f + this.khh().shdf_2(string3, 6.5f);
            ++n;
        }
        if (bl2) {
            if (n++ > 0) {
                f21 += 11.0f;
            }
            f21 += brz_2.tsf.shdf_2("W", 7.5f) + 2.5f + this.khh().shdf_2(string2, 6.5f);
        }
        if (bl3) {
            if (n++ > 0) {
                f21 += 11.0f;
            }
            f21 += brz_2.tsf.shdf_2("y", 7.5f) + 2.5f + this.dghdh.skhd_3(6.5f);
        }
        if (bl4) {
            if (n > 0) {
                f21 += 11.0f;
            }
            f21 += brz_2.khkhj.shdf_2("i", 7.5f) + 2.5f + this.khh().shdf_2(string4, 6.5f);
        }
        float f22 = (f21 += (n > 0 ? 5.0f : 0.0f) + 2.0f) * this.shwd_2;
        this.khrb = this.khhs_3(this.khrb, this.dw_2.thnth("Right") ? 1.0f : 0.0f, f6, 12.0f);
        f5 = f16;
        float f23 = bl10 ? f16 + f22 + 4.0f : f16;
        float f24 = f5 * (1.0f - this.khrb) + f23 * this.khrb;
        float f25 = f16 + f19 + 4.0f;
        float f26 = f16;
        float f27 = f25 * (1.0f - this.khrb) + f26 * this.khrb;
        this.ssq_3(class_45872, f24, f17, f19, f20);
        if (bl10 && f22 > 4.0f) {
            f4 = this.shwd_2;
            tbkh.bsdh_2(class_45872, f27, f17, f22, 15.0f, f4, 5.0f);
            tbkh.ja_2(class_45872, f27, f17, f22, 15.0f, 5.0f, 0.18f, f4);
            f3 = f17 + 7.5f - 3.75f;
            f2 = f17 + 7.5f - this.khh().khmw(6.5f) / 2.0f - 0.7f;
            f = f27 + 5.0f;
            int n2 = 0;
            if (bl) {
                class_2960 class_29603 = tk.dhfy();
                if (class_29603 != null) {
                    class_1044 class_10443 = mc.method_1531().method_4619(class_29603);
                    if (class_10443 != null) {
                        float f28 = 9.0f;
                        float f29 = f17 + 7.5f - f28 / 2.0f;
                        bjgh.shsf_2.da_4(class_45872, f, f29, f28, f28, f28 / 2.0f, color, 0.0f, 0.0f, 1.0f, 1.0f, class_10443.method_4624());
                        f += f28 + 2.5f;
                    } else {
                        brz_2.tsf.jdz(class_45872, "U", f, f3, 7.5f, bas_4.tdth_2(Math.round(255.0f * f4)), bas_4.dhfk(Math.round(255.0f * f4)), 1.1f);
                        f += brz_2.tsf.shdf_2("U", 7.5f) + 2.5f;
                    }
                } else {
                    brz_2.tsf.jdz(class_45872, "U", f, f3, 7.5f, bas_4.tdth_2(Math.round(255.0f * f4)), bas_4.dhfk(Math.round(255.0f * f4)), 1.1f);
                    f += brz_2.tsf.shdf_2("U", 7.5f) + 2.5f;
                }
                this.khh().zskh_4(class_45872, string3, f, f2, 6.5f, tbkh.hkdh(f4), 0.0f);
                f += this.khh().shdf_2(string3, 6.5f);
                ++n2;
            }
            if (bl2) {
                if (n2++ > 0) {
                    this.dwa_2(class_45872, f + 5.0f, f17, 1.0f, 8.0f, 15.0f, f4);
                    f += 11.0f;
                }
                brz_2.tsf.jdz(class_45872, "W", f, f3, 7.5f, bas_4.tdth_2(Math.round(255.0f * f4)), bas_4.dhfk(Math.round(255.0f * f4)), 1.1f);
                this.khh().zskh_4(class_45872, string2, f += brz_2.tsf.shdf_2("W", 7.5f) + 2.5f, f2, 6.5f, tbkh.hkdh(f4), 0.0f);
                f += this.khh().shdf_2(string2, 6.5f);
            }
            if (bl3) {
                if (n2++ > 0) {
                    this.dwa_2(class_45872, f + 5.0f, f17, 1.0f, 8.0f, 15.0f, f4);
                    f += 11.0f;
                }
                brz_2.tsf.jdz(class_45872, "y", f, f3, 7.5f, bas_4.tdth_2(Math.round(255.0f * f4)), bas_4.dhfk(Math.round(255.0f * f4)), 1.1f);
                this.dghdh.zzdh(class_45872, f += brz_2.tsf.shdf_2("y", 7.5f) + 2.5f, f2, 6.5f, tbkh.hkdh(f4));
                f += this.dghdh.skhd_3(6.5f);
            }
            if (bl4) {
                if (n2 > 0) {
                    this.dwa_2(class_45872, f + 5.0f, f17, 1.0f, 8.0f, 15.0f, f4);
                    f += 11.0f;
                }
                brz_2.khkhj.zskh_4(class_45872, "i", f, f3 + 0.3f, 7.5f, bas_4.tdth_2(Math.round(255.0f * f4)), 0.0f);
                this.khh().zskh_4(class_45872, string4, f += brz_2.khkhj.shdf_2("i", 7.5f) + 2.5f, f2, 6.5f, tbkh.hkdh(f4), 0.0f);
            }
        }
        f4 = bl10 ? f27 + f22 + 4.0f : f24 + f19 + 4.0f;
        f3 = 180.0f;
        f2 = f3 * this.bbd_2;
        if (this.bbd_2 > 0.02f) {
            this.bdh_2(class_45872, f4, f17, f2, 15.0f, 5.0f, 6.5f, 1.0f, 8.0f, 5.0f, color, qd2_2, tdhs2, bl7, this.bbd_2);
        }
        f = f19 + (bl10 ? 4.0f + f22 : 0.0f) + (this.bbd_2 > 0.02f ? 4.0f + f2 : 0.0f);
        this.khta_3().setWidth(f);
        this.khta_3().setHeight(15.0f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void bdh_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, Color color, qd_2 qd2_2, tdhs_2 tdhs2, boolean bl, float f10) {
        block17: {
            if (f3 <= 1.0f) {
                return;
            }
            tzm.hds_2(class_45872, f, f2, f3, f4);
            try {
                tbkh.bsdh_2(class_45872, f, f2, f3, f4, f10, 5.0f);
                tbkh.ja_2(class_45872, f, f2, f3, f4, 5.0f, 0.18f, f10);
                float f11 = 6.2f;
                float f12 = f + f5;
                this.dyj_2(class_45872, f12, f2, f4, bl, f10);
                float f13 = f12 + f11 + f9;
                this.dwa_2(class_45872, f13, f2, f7, f8, f4, f10);
                float f14 = f13 + f7 + f9;
                float f15 = f3 - (f14 - f) - f5;
                if (!(f15 > 5.0f) || tdhs2 == null) break block17;
                long l = qd2_2 != null ? qd2_2.jaa_4() : 0L;
                bzy_2 bzy2 = tdhs2.hdht(l);
                tzm.hds_2(class_45872, f14, f2, f15, f4);
                try {
                    float f16 = f2 + f4 / 2.0f - this.khh().khmw(f6) / 2.0f - 0.4f;
                    if (bzy2 != null && !bzy2.thff().isEmpty()) {
                        float f17 = 0.0f;
                        float f18 = this.khh().shdf_2(" ", f6) + 1.2f;
                        for (taf taf2 : bzy2.thff()) {
                            f17 += this.khh().shdf_2(taf2.dnsh(), f6) + f18;
                        }
                        int n = bzy2.dhs_7(l);
                        float f19 = 0.0f;
                        for (int i = 0; i < n; ++i) {
                            f19 += this.khh().shdf_2(((taf)bzy2.thff().get(i)).dnsh(), f6) + f18;
                        }
                        taf taf3 = bzy2.zsd_6(l);
                        float f20 = taf3 != null ? this.khh().shdf_2(taf3.dnsh(), f6) : 0.0f;
                        float f21 = f19 + f20 / 2.0f;
                        float f22 = f17 > f15 ? f21 - f15 / 2.0f : 0.0f;
                        f22 = class_3532.method_15363((float)f22, (float)0.0f, (float)Math.max(0.0f, f17 - f15));
                        this.dnz = class_3532.method_16439((float)0.12f, (float)this.dnz, (float)f22);
                        float f23 = f14 - this.dnz;
                        for (int i = 0; i < bzy2.thff().size(); ++i) {
                            float f24;
                            taf taf4 = (taf)bzy2.thff().get(i);
                            String string = taf4.dnsh();
                            float f25 = this.khh().shdf_2(string, f6);
                            boolean bl2 = l > taf4.thdt();
                            boolean bl3 = l >= taf4.ssht_3() && l <= taf4.thdt();
                            boolean bl4 = l < taf4.ssht_3();
                            float f26 = 1.0f;
                            if (bl3) {
                                f24 = taf4.tdd(l);
                                f26 = 1.0f + 0.11f * (float)Math.sin((double)f24 * Math.PI);
                            }
                            float f27 = f24 = bl3 ? f25 * f26 : f25;
                            if (bl3) {
                                class_45872.method_22903();
                                class_45872.method_46416(f23 + f25 / 2.0f, f16 + this.khh().khmw(f6) / 2.0f, 0.0f);
                                class_45872.method_22905(f26, f26, 1.0f);
                                class_45872.method_46416(-(f23 + f25 / 2.0f), -(f16 + this.khh().khmw(f6) / 2.0f), 0.0f);
                                var43_50 = bas_4.tdth_2(Math.round(255.0f * f10));
                                Color color2 = bas_4.dhfk(Math.round(255.0f * f10));
                                this.khh().zd(class_45872, string, f23, f16, f6, var43_50, color2, 1.2f, brz_2.tkkh_2() * 0.85f);
                                class_45872.method_22909();
                            } else if (bl2) {
                                var43_50 = new Color(255, 255, 255, Math.round(240.0f * f10));
                                this.khh().zskh_4(class_45872, string, f23, f16, f6, var43_50, 0.0f);
                            } else {
                                var43_50 = new Color(175, 175, 185, Math.round(130.0f * f10));
                                this.khh().zskh_4(class_45872, string, f23, f16, f6, var43_50, 0.0f);
                            }
                            f23 += Math.max(f25, f24) + f18;
                        }
                    } else {
                        String string = "♪ " + (tdhs2.dkh_6().isEmpty() ? "Playing..." : tdhs2.dkh_6()) + " ♪";
                        float f28 = this.khh().shdf_2(string, f6);
                        float f29 = f14 + Math.max(0.0f, (f15 - f28) / 2.0f);
                        Color color3 = bas_4.tdth_2(Math.round(255.0f * f10));
                        Color color4 = bas_4.dhfk(Math.round(255.0f * f10));
                        this.khh().zd(class_45872, string, f29, f16, f6, color3, color4, 1.2f, 0.05f);
                    }
                }
                finally {
                    tzm.jdz_4(class_45872);
                }
            }
            finally {
                tzm.jdz_4(class_45872);
            }
        }
    }

    private void dyj_2(class_4587 class_45872, float f, float f2, float f3, boolean bl, float f4) {
        float f5 = 1.3f;
        float f6 = 1.1f;
        float f7 = f3 * 0.45f;
        float f8 = 2.0f;
        long l = System.currentTimeMillis();
        Color color = bas_4.tdth_2(Math.round(255.0f * f4));
        Color color2 = bas_4.dhfk(Math.round(255.0f * f4));
        for (int i = 0; i < 3; ++i) {
            float f9;
            float f10;
            float f11 = f + (float)i * (f5 + f6);
            if (bl) {
                f10 = (float)Math.sin((double)l * 0.008 + (double)i * 1.6);
                float f12 = (float)Math.cos((double)l * 0.005 + (double)i * 2.1);
                float f13 = (f10 * 0.5f + 0.5f) * 0.6f + (f12 * 0.5f + 0.5f) * 0.4f;
                f9 = f8 + f13 * (f7 - f8);
            } else {
                f9 = f8;
            }
            f10 = f2 + (f3 - f9) / 2.0f;
            Color color3 = i == 1 ? color2 : color;
            bjgh.jghs.hrj(class_45872, f11, f10, f5, f9, 0.6f, color3);
        }
    }

    private void ssq_3(class_4587 class_45872, float f, float f2, float f3, float f4) {
        tbkh.bsdh_2(class_45872, f, f2, f3, f3, 1.0f, 5.0f);
        tbkh.ja_2(class_45872, f, f2, f3, f3, 5.0f, 0.18f, 1.0f);
        float f5 = f + (f3 - f4) / 2.0f;
        float f6 = f2 + (f3 - f4) / 2.0f;
        int n = (int)(System.currentTimeMillis() / 25L % 120L);
        class_2960 class_29602 = class_2960.method_60655((String)"moondlc", (String)String.format("textures/images/logo_anim/frame_%03d.png", n));
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        int n2 = Color.WHITE.getRGB();
        class_2872.method_22918(matrix4f, f5, f6, 0.0f).method_22913(0.0f, 0.0f).method_39415(n2);
        class_2872.method_22918(matrix4f, f5, f6 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(n2);
        class_2872.method_22918(matrix4f, f5 + f4, f6 + f4, 0.0f).method_22913(1.0f, 1.0f).method_39415(n2);
        class_2872.method_22918(matrix4f, f5 + f4, f6, 0.0f).method_22913(1.0f, 0.0f).method_39415(n2);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.disableBlend();
    }

    private void dwa_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 + (f5 - f4) / 2.0f;
        bjgh.jghs.hrj(class_45872, f, f7, f3, f4, 0.5f, new Color(255, 255, 255, Math.round(45.0f * f6)));
    }

    private void dst_7(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] rg5gvozw(String string) {
        return string.split("\u0005\u001a", -1);
    }

    private static CallSite z9ynmf42am(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ i2y8m40oo ^ string.hashCode() ^ n2 + yov3nk5r3igz2 ^ i * 1536734469 ^ i2y8m40oo, 18) ^ yov3nk5r3igz2));
            }
            String[] stringArray = bghd_2.rg5gvozw(new String(cArray));
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

