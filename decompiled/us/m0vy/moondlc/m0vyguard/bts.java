/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1044
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bza_2;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bzy_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.taf;
import us.m0vy.moondlc.m0vyguard.tdhs_2;
import us.m0vy.moondlc.m0vyguard.tzm;
import us.m0vy.moondlc.m0vyguard.tk;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.qd_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class bts
extends thw_3 {
    private float dhfk = 0.0f;
    private final bza_2 hthd_2 = new bza_2(brz_2.ryk, " fps", 7.0f, 200L, btf_2.sdhr);
    private float hdsh = 0.0f;
    private float dthm = 0.0f;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int tx515gm84euc9;

    public bts() {
        super(4.0f, 4.0f);
    }

    @Override
    public String getName() {
        return "Watermark";
    }

    @Override
    public void lh(class_4587 class_45872) {
        Object object;
        float f;
        if (bts.mc.field_1724 == null) {
            return;
        }
        float f2 = this.ada_4(15.0f);
        float f3 = this.ada_4(5.0f);
        float f4 = this.ada_4(6.5f);
        float f5 = this.ada_4(7.5f);
        float f6 = this.ada_4(2.0f);
        float f7 = this.ada_4(5.0f);
        float f8 = this.ada_4(1.0f);
        float f9 = this.ada_4(8.0f);
        float f10 = this.ada_4(4.0f);
        float f11 = this.khta_3().getX();
        float f12 = this.khta_3().getY();
        bza_4 bza2_2 = bza_4.thtsh_2();
        boolean bl = bza2_2.shdf_2.tzn_3("Name");
        boolean bl2 = bza2_2.shdf_2.tzn_3("User");
        boolean bl3 = bza2_2.shdf_2.tzn_3("FPS");
        boolean bl4 = bza2_2.shdf_2.tzn_3("IP");
        boolean bl5 = bza2_2.shdf_2.tzn_3("Lyrics");
        this.dhfk = class_3532.method_16439((float)0.1f, (float)this.dhfk, (float)mc.method_47599());
        int n = Math.round(this.dhfk);
        this.hthd_2.rtb(n);
        String string = mc.method_1558() != null ? bts.mc.method_1558().field_3761 : "singleplayer";
        String string2 = yf.thwt_2().dzl_4().isEmpty() ? System.getProperty("user.name") : yf.thwt_2().dzl_4();
        Color color = Color.WHITE;
        Color color2 = new Color(12, 12, 18, 240);
        float f13 = f2;
        float f14 = this.ada_4(11.5f);
        float f15 = f3;
        int n2 = 0;
        if (bl2) {
            f15 += brz_2.tsf.shdf_2("U", f5) + f6 + this.thdz_2().shdf_2(string2, f4);
            ++n2;
        }
        if (bl4) {
            if (n2++ > 0) {
                f15 += f7 + f8 + f7;
            }
            f15 += brz_2.tsf.shdf_2("W", f5) + f6 + this.thdz_2().shdf_2(string, f4);
        }
        if (bl3) {
            if (n2++ > 0) {
                f15 += f7 + f8 + f7;
            }
            f15 += brz_2.tsf.shdf_2("y", f5) + f6 + this.hthd_2.skhd_3(f4);
        }
        f15 += n2 > 0 ? f3 : 0.0f;
        float f16 = f11;
        if (bl) {
            bjgh.jghs.hrj(class_45872, f16, f12, f13, f13, 2.5f, color2);
            f = (f13 - f14) / 2.0f;
            class_2960 class_29602 = class_2960.method_60655((String)"moondlc", (String)"icon.png");
            class_1044 class_10442 = mc.method_1531().method_4619(class_29602);
            if (class_10442 != null) {
                bjgh.shsf_2.da_4(class_45872, f16 + f, f12 + f, f14, f14, 2.0f, color, 0.0f, 0.0f, 1.0f, 1.0f, class_10442.method_4624());
            }
        }
        float f17 = f = bl ? f16 + f13 + f10 : f16;
        if (n2 > 0) {
            bjgh.jghs.hrj(class_45872, f, f12, f15, f2, 3.0f, color2);
        }
        float f18 = f12 + f2 / 2.0f - f5 / 2.0f;
        float f19 = f12 + f2 / 2.0f - this.thdz_2().khmw(f4) / 2.0f + 0.5f;
        float f20 = f + f3;
        int n3 = 0;
        if (bl2) {
            object = tk.dhfy();
            if (object != null) {
                class_1044 class_10443 = mc.method_1531().method_4619((class_2960)object);
                if (class_10443 != null) {
                    float f21 = f5 + 1.5f;
                    float f22 = f18 - 0.5f;
                    bjgh.shsf_2.da_4(class_45872, f20, f22, f21, f21, f21 / 2.0f, color, 0.0f, 0.0f, 1.0f, 1.0f, class_10443.method_4624());
                    f20 += f21 + f6;
                } else {
                    brz_2.tsf.jdz(class_45872, "U", f20, f18, f5, bas_4.zsz_4(), bas_4.tkb_2(), 1.1f);
                    f20 += brz_2.tsf.shdf_2("U", f5) + f6;
                }
            } else {
                brz_2.tsf.jdz(class_45872, "U", f20, f18, f5, bas_4.zsz_4(), bas_4.tkb_2(), 1.1f);
                f20 += brz_2.tsf.shdf_2("U", f5) + f6;
            }
            this.thdz_2().zskh_4(class_45872, string2, f20, f19, f4, color, 0.0f);
            f20 += this.thdz_2().shdf_2(string2, f4);
            ++n3;
        }
        if (bl4) {
            if (n3++ > 0) {
                this.ghdt_3(class_45872, f20 + f7, f12, f8, f9, f2, 1.0f);
                f20 += f7 + f8 + f7;
            }
            brz_2.tsf.jdz(class_45872, "W", f20, f18, f5, bas_4.zsz_4(), bas_4.tkb_2(), 1.1f);
            this.thdz_2().zskh_4(class_45872, string, f20 += brz_2.tsf.shdf_2("W", f5) + f6, f19, f4, color, 0.0f);
            f20 += this.thdz_2().shdf_2(string, f4);
        }
        if (bl3) {
            if (n3++ > 0) {
                this.ghdt_3(class_45872, f20 + f7, f12, f8, f9, f2, 1.0f);
                f20 += f7 + f8 + f7;
            }
            brz_2.tsf.jdz(class_45872, "y", f20, f18, f5, bas_4.zsz_4(), bas_4.tkb_2(), 1.1f);
            this.hthd_2.zzdh(class_45872, f20 += brz_2.tsf.shdf_2("y", f5) + f6, f19, f4, color);
        }
        boolean bl6 = (object = Moondlc.getInstance().getMusicTracker()) != null && ((qd_2)object).bdhl() && ((qd_2)object).khyl() != null;
        boolean bl7 = bl6 && ((qd_2)object).dhlf();
        tdhs_2 tdhs2 = bl6 ? ((qd_2)object).trh() : null;
        float f23 = bl5 && bl6 && tdhs2 != null ? 1.0f : 0.0f;
        this.hdsh = class_3532.method_16439((float)0.12f, (float)this.hdsh, (float)f23);
        float f24 = n2 > 0 ? f + f15 + f10 : (bl ? f16 + f13 + f10 : f16);
        float f25 = this.ada_4(180.0f);
        float f26 = f25 * this.hdsh;
        if (this.hdsh > 0.02f) {
            this.hdth(class_45872, f24, f12, f26, f2, f3, f4, f8, f9, f7, color2, color, (qd_2)object, tdhs2, bl7, this.hdsh);
        }
        float f27 = (bl ? f13 : 0.0f) + (bl && n2 > 0 ? f10 : 0.0f) + (n2 > 0 ? f15 : 0.0f) + (this.hdsh > 0.02f ? f10 + f26 : 0.0f);
        this.khta_3().setWidth(f27);
        this.khta_3().setHeight(f2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void hdth(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, Color color, Color color2, qd_2 qd2_2, tdhs_2 tdhs2, boolean bl, float f10) {
        block16: {
            if (f3 <= 1.0f) {
                return;
            }
            tzm.hds_2(class_45872, f, f2, f3, f4);
            try {
                Color color3 = new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round((float)color.getAlpha() * f10));
                bjgh.jghs.hrj(class_45872, f, f2, f3, f4, 3.0f, color3);
                float f11 = this.ada_4(8.4f);
                float f12 = f + f5;
                this.tghh_4(class_45872, f12, f2, f4, bl, f10);
                float f13 = f12 + f11 + f9;
                this.ghdt_3(class_45872, f13, f2, f7, f8, f4, f10);
                float f14 = f13 + f7 + f9;
                float f15 = f3 - (f14 - f) - f5;
                if (!(f15 > 5.0f) || tdhs2 == null) break block16;
                long l = qd2_2 != null ? qd2_2.jaa_4() : 0L;
                bzy_2 bzy2 = tdhs2.hdht(l);
                tzm.hds_2(class_45872, f14, f2, f15, f4);
                try {
                    float f16 = f2 + f4 / 2.0f - this.thdz_2().khmw(f6) / 2.0f + 0.5f;
                    if (bzy2 != null && !bzy2.thff().isEmpty()) {
                        float f17 = 0.0f;
                        for (taf taf2 : bzy2.thff()) {
                            f17 += this.thdz_2().shdf_2(taf2.dnsh() + " ", f6);
                        }
                        int n = bzy2.dhs_7(l);
                        float f18 = 0.0f;
                        for (int i = 0; i < n; ++i) {
                            f18 += this.thdz_2().shdf_2(((taf)bzy2.thff().get(i)).dnsh() + " ", f6);
                        }
                        taf taf3 = bzy2.zsd_6(l);
                        float f19 = taf3 != null ? this.thdz_2().shdf_2(taf3.dnsh(), f6) : 0.0f;
                        float f20 = f18 + f19 / 2.0f;
                        float f21 = f17 > f15 ? f20 - f15 / 2.0f : 0.0f;
                        f21 = class_3532.method_15363((float)f21, (float)0.0f, (float)Math.max(0.0f, f17 - f15));
                        this.dthm = class_3532.method_16439((float)0.12f, (float)this.dthm, (float)f21);
                        float f22 = f14 - this.dthm;
                        for (int i = 0; i < bzy2.thff().size(); ++i) {
                            boolean bl2;
                            taf taf4 = (taf)bzy2.thff().get(i);
                            String string = taf4.dnsh();
                            float f23 = this.thdz_2().shdf_2(string, f6);
                            float f24 = this.thdz_2().shdf_2(" ", f6);
                            boolean bl3 = l > taf4.thdt();
                            boolean bl4 = l >= taf4.ssht_3() && l <= taf4.thdt();
                            boolean bl5 = bl2 = l < taf4.ssht_3();
                            if (bl4) {
                                float f25 = taf4.tdd(l);
                                float f26 = 1.0f + 0.12f * (float)Math.sin((double)f25 * Math.PI);
                                class_45872.method_22903();
                                class_45872.method_46416(f22 + f23 / 2.0f, f16 + this.thdz_2().khmw(f6) / 2.0f, 0.0f);
                                class_45872.method_22905(f26, f26, 1.0f);
                                class_45872.method_46416(-(f22 + f23 / 2.0f), -(f16 + this.thdz_2().khmw(f6) / 2.0f), 0.0f);
                                Color color4 = bas_4.tdth_2(Math.round(255.0f * f10));
                                Color color5 = bas_4.dhfk(Math.round(255.0f * f10));
                                this.thdz_2().zd(class_45872, string, f22, f16, f6, color4, color5, 1.2f, brz_2.tkkh_2() * 0.85f);
                                class_45872.method_22909();
                            } else if (bl3) {
                                Color color6 = new Color(255, 255, 255, Math.round(240.0f * f10));
                                this.thdz_2().zskh_4(class_45872, string, f22, f16, f6, color6, 0.0f);
                            } else {
                                Color color7 = new Color(175, 175, 185, Math.round(130.0f * f10));
                                this.thdz_2().zskh_4(class_45872, string, f22, f16, f6, color7, 0.0f);
                            }
                            f22 += f23 + f24;
                        }
                    } else {
                        String string = "♪ " + (tdhs2.dkh_6().isEmpty() ? "Playing..." : tdhs2.dkh_6()) + " ♪";
                        float f27 = this.thdz_2().shdf_2(string, f6);
                        float f28 = f14 + Math.max(0.0f, (f15 - f27) / 2.0f);
                        Color color8 = bas_4.tdth_2(Math.round(255.0f * f10));
                        Color color9 = bas_4.dhfk(Math.round(255.0f * f10));
                        this.thdz_2().zd(class_45872, string, f28, f16, f6, color8, color9, 1.2f, 0.05f);
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

    private void tghh_4(class_4587 class_45872, float f, float f2, float f3, boolean bl, float f4) {
        float f5 = this.ada_4(1.8f);
        float f6 = this.ada_4(1.5f);
        float f7 = f3 * 0.65f;
        float f8 = this.ada_4(2.5f);
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
            bjgh.jghs.hrj(class_45872, f11, f10, f5, f9, 0.8f, color3);
        }
    }

    private void ghdt_3(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 + (f5 - f4) / 2.0f;
        bjgh.jghs.hrj(class_45872, f, f7, f3, f4, 0.5f, new Color(255, 255, 255, Math.round(45.0f * f6)));
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

