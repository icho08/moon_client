/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_7833
 *  net.minecraft.class_7923
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_7833;
import net.minecraft.class_7923;
import us.m0vy.moondlc.m0vyguard.baa_2;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bhh;
import us.m0vy.moondlc.m0vyguard.bhm;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bdhw;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bsd_3;
import us.m0vy.moondlc.m0vyguard.bzdh_2;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bay_2;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bnn;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.bwr;
import us.m0vy.moondlc.m0vyguard.byh;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.byl;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.tkhd;
import us.m0vy.moondlc.m0vyguard.tra;
import us.m0vy.moondlc.m0vyguard.tshd;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.khw;
import us.m0vy.moondlc.m0vyguard.zw;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.ts_4;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.zy_2;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.fw_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.nt_3;

public class tshr
extends nt_3
implements byh {
    public static final float shwt = 185.0f;
    public static final float sshh = 24.0f;
    public static final float ssz_3 = 250.0f;
    public static final float tdl = 226.0f;
    private static final float zthw = 8.0f;
    private static final float djm = 10.0f;
    private static final float thlb = 6.0f;
    private static final float khwa = 9.0f;
    private static final byq thml;
    private static final byq shdk;
    private static final byq rbz_2;
    private static final byq rbdh;
    private static final byq zth_2;
    private static final byq bdd;
    private static final byq shbth;
    private static final byq tjsh;
    private static final class_2960 dhghs_2;
    private static final class_2960 shlsh;
    private static final class_2960 rygh;
    private final bsd_3 sthh;
    private final tkhd dhthdh;
    private final fa_2 zl_2;
    private final fa_2 hnd;
    private final fa_2 jnb;
    private final bwr hshgh = new bwr();
    private final Map shaa = new HashMap();
    private final Map hld = new HashMap();
    private final Map tths_2 = new HashMap();
    private final Map dkt_2 = new HashMap();
    private final Map dhs_6 = new HashMap();
    private final Map zns_2 = new HashMap();
    private final Map dzm = new HashMap();
    private final Map shm_2 = new HashMap();
    private final Map shdht = new HashMap();
    private boolean dhsth = false;
    private tay szs_4 = null;
    private tshd zqz = null;
    private int shsd = 0;
    private khd dlsh = null;
    private bzw_2 rsd_3 = null;
    private final float[] sthd_4 = new float[3];
    private int zl = -1;
    private bdh_3 rrn = null;
    private ts_4 dhath = null;
    private byl khtz_4 = null;
    private final fa_2 htw = new fa_2(240L, 0.0f, jkh.tb);
    private final baa_2 jw;
    private final bwr dhdq = new bwr();
    private static List dsh_2;
    private boolean jah_4 = true;
    private boolean khhl = false;
    private boolean shtl = false;
    private float jkr;
    private float tsh_2;
    private static final int bw5gsg3zpe53x = -1702690493;
    private static final int z89oi6u = -641823139;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jl1j6dxjrqbym;

    private static List st_5() {
        if (dsh_2 == null) {
            dsh_2 = new ArrayList();
            for (class_2248 class_22482 : class_7923.field_41175) {
                if (class_22482 == null || class_22482 == class_2246.field_10124) continue;
                dsh_2.add(class_22482);
            }
        }
        return dsh_2;
    }

    public tshr(bsd_3 bsd2_2, tkhd tkhd2, float f, float f2) {
        this.sthh = bsd2_2;
        this.dhthdh = tkhd2;
        this.sdht_2 = f;
        this.shat_2 = f2;
        this.zshl = 185.0f;
        this.zqkh = 24.0f;
        this.hshgh.ghzz(14.0);
        this.dhdq.ghzz(14.0);
        this.zl_2 = new fa_2(240L, 0.0f, jkh.tb);
        this.hnd = new fa_2(240L, 0.0f, jkh.tb);
        this.jnb = new fa_2(200L, bsd2_2.zhz_7().rgha_2() ? 1.0f : 0.0f, jkh.tb);
        this.jw = new baa_2(bmn.sdha_2.twy_2(7.5f));
        this.jw.rja("Search blocks...");
        this.jw.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
    }

    @Override
    protected void bws_2(bzth bzth2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        boolean bl = tkhd.getCurrentScreen() != null;
        bnn bnn2 = bnn.dzb_2();
        this.zl_2.zkhdh((long)bnn2.art());
        this.zl_2.ddt_6(this.jah_4 && bl);
        this.hnd.khmf(this.khhl ? 1.0f : 0.0f);
        this.jnb.ddt_6(this.sthh.zhz_7().rgha_2());
        this.hshgh.dzl_2();
        this.bdht_2(bzth2.getMouseX(), bzth2.getMouseY());
        float f10 = this.zl_2.tssh_2() * Math.min(1.0f, Math.max(0.0f, this.dhthdh.getMenuAnimation().tssh_2()));
        if (this.dhsth) {
            f10 *= this.dhthdh.getDockedSplitProgress();
        }
        if (f10 < 0.005f) {
            return;
        }
        boolean bl2 = bnn2.ghdt();
        byq byq2 = bnn2.dhdhk(this.sdht_2);
        byq byq3 = bl2 ? new byq(9.0f, 9.0f, 9.0f, 255.0f) : bhj_2.rrd;
        byq byq4 = bl2 ? new byq(24.0f, 24.0f, 24.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        float f11 = f9 = this.dhsth ? this.zshl : 185.0f;
        if (this.dhsth) {
            f7 = f8 = Math.max(0.0f, this.zqkh - 24.0f);
        } else {
            f6 = this.dthm_2();
            f5 = tdw.thfq();
            f4 = Math.max(40.0f, f5 - this.shat_2 - 24.0f - 12.0f);
            f7 = Math.min(226.0f, f4);
            f3 = Math.min(f7, f6);
            f8 = tra.thn_3(f3, 0.0, this.hnd.tssh_2());
            this.zqkh = 24.0f + f8;
        }
        f6 = 24.0f + f8;
        f5 = this.sdht_2;
        f4 = this.shat_2;
        bzth2.pushMatrix();
        if (!this.dhsth) {
            f3 = 0.85f + 0.15f * f10;
            zy_2 zy2 = bnn2.zks_4();
            if (zy2 == zy_2.ty_2) {
                f2 = (1.0f - f10) * -18.0f;
                f = (1.0f - f10) * 10.0f;
                bzth2.method_51448().method_46416(f5 + f9 / 2.0f, f4 + f6 / 2.0f, 0.0f);
                bzth2.method_51448().method_22907(class_7833.field_40716.rotationDegrees(f2));
                bzth2.method_51448().method_22907(class_7833.field_40714.rotationDegrees(f));
                bzth2.method_51448().method_22905(f3, f3, 1.0f);
                bzth2.method_51448().method_46416(-(f5 + f9 / 2.0f), -(f4 + f6 / 2.0f), 0.0f);
            } else {
                shk_3.bdhkh(bzth2.method_51448(), f5 + f9 / 2.0f, f4 + f6 / 2.0f, f3);
            }
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f10);
        if (!this.dhsth) {
            bzth2.drawShadow(f5 - 4.0f, f4 - 4.0f, f9 + 8.0f, f6 + 8.0f, 16.0f, zth_8.all(8.0f), bhj_2.bdhj.thzz_4((bl2 ? 0.35f : 0.15f) * f10));
            bzth2.drawRoundedRect(f5, f4, f9, f6, zth_8.all(8.0f), byq3.thzz_4(f10));
            if (!bl2) {
                bzth2.drawRoundedBorder(f5, f4, f9, f6, 0.18f, zth_8.all(8.0f), byq4.thzz_4(f10));
            }
        }
        this.ath(bzth2, f5, f4, f10, byq2, bl2);
        if (f8 > 2.0f) {
            f3 = f5;
            float f12 = f4 + 24.0f;
            f2 = f9;
            bhm.dar_2(bzth2.method_51448(), f3, f12, f2, f8);
            if (!this.dhsth) {
                bzth2.drawRect(f5, f4 + 24.0f, f9, 0.5f, byq4.thzz_4(f10));
            }
            f = this.dhsth ? 0.0f : 9.0f;
            this.khfn(bzth2, f5 + f, f4 + 24.0f + 6.0f, f10, byq2, bl2, f12, f12 + f8, f7);
            bhm.sdhsh_2();
        }
        bzth2.popMatrix();
        this.dhsl(bzth2, f5, f4, f9, f6, f10, byq2, bl2);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void ath(bzth bzth2, float f, float f2, float f3, byq byq2, boolean bl) {
        float f4 = this.dhsth ? this.zshl : 185.0f;
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        float f5 = this.dhsth ? 11.5f : 9.0f;
        bzth2.drawText(bmn.shmz.twy_2(f5), this.sthh.zhz_7().getName(), f + (this.dhsth ? 0.0f : 10.0f), f2 + (24.0f - f5) / 2.0f + 0.5f, byq3.thzz_4(f3));
        float f6 = f2 + 7.0f;
        float f7 = f + f4 - (this.dhsth ? 4.0f : 9.0f) - 10.0f;
        float f8 = f7 - 10.0f - 3.0f;
        float f9 = this.dhsth ? f7 - 10.0f - 4.0f : f8 - 10.0f - 3.0f;
        bzth2.drawRoundedRect(f7, f6, 10.0f, 10.0f, zth_8.all(5.0f), bdd.thzz_4(f3));
        bzth2.drawTexture(dhghs_2, f7 + 2.0f, f6 + 2.0f, 6.0f, 6.0f, bhj_2.rrd.thzz_4(f3));
        if (!this.dhsth) {
            bzth2.drawRoundedRect(f8, f6, 10.0f, 10.0f, zth_8.all(5.0f), shbth.thzz_4(f3));
            bzth2.drawTexture(shlsh, f8 + 2.0f, f6 + 2.0f, 6.0f, 6.0f, bhj_2.rrd.thzz_4(f3));
        }
        bzth2.drawRoundedRect(f9, f6, 10.0f, 10.0f, zth_8.all(5.0f), tjsh.thzz_4(f3));
        bzth2.drawTexture(rygh, f9 + 2.0f, f6 + 2.0f, 6.0f, 6.0f, bhj_2.rrd.thzz_4(f3));
        float f10 = this.jnb.tssh_2();
        float f11 = 20.0f;
        float f12 = 11.0f;
        float f13 = f9 - 6.0f - f11;
        float f14 = f2 + (24.0f - f12) / 2.0f;
        byq byq4 = bl ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : new byq(209.0f, 213.0f, 219.0f, 255.0f);
        byq byq5 = byq4.dkhw_2(byq2, f10).thzz_4(f3);
        bzth2.drawRoundedRect(f13, f14, f11, f12, zth_8.all(5.5f), byq5);
        float f15 = 7.0f;
        float f16 = f13 + 2.0f + 9.0f * f10;
        byq byq6 = bl ? (f10 > 0.5f ? bhj_2.rrd : new byq(12.0f, 12.0f, 12.0f, 255.0f)) : bhj_2.rrd;
        bzth2.drawRoundedRect(f16, f14 + 2.0f, f15, f15, zth_8.all(3.5f), byq6.thzz_4(f3));
        if (bhh.zzy_3(f7, f6, 10.0, 10.0, bzth2) || !this.dhsth && bhh.zzy_3(f8, f6, 10.0, 10.0, bzth2) || bhh.zzy_3(f9, f6, 10.0, 10.0, bzth2) || bhh.zzy_3(f13, f14, f11, f12, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
    }

    private void khfn(bzth bzth2, float f, float f2, float f3, byq byq2, boolean bl, float f4, float f5, float f6) {
        float f7 = this.dhsth ? this.zshl : 185.0f;
        float f8 = f7 - (this.dhsth ? 4.0f : 18.0f);
        float f9 = (float)(-this.hshgh.shtt_4());
        float f10 = f2 + f9;
        float f11 = 0.0f;
        for (bdhw bdhw2 : this.sthh.zhz_7().dty()) {
            if (!bdhw2.tsa_5()) continue;
            float f12 = this.htz_3(bzth2, bdhw2, f, f10, f8, f3, byq2, bl, f4, f5);
            f10 += f12 + 6.0f;
            f11 += f12 + 6.0f;
        }
        float f13 = Math.max(0.0f, f11 - f6);
        this.hshgh.srb_2(-f13);
    }

    private float htz_3(bzth bzth2, bdhw bdhw2, float f, float f2, float f3, float f4, byq byq2, boolean bl, float f5, float f6) {
        float f7 = this.hzr(bdhw2);
        if (f2 + f7 < f5 || f2 > f6) {
            return f7;
        }
        if (bdhw2 instanceof ts_4) {
            ts_4 ts2 = (ts_4)bdhw2;
            return this.dshk(bzth2, ts2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof khd) {
            khd khd2 = (khd)bdhw2;
            return this.aza(bzth2, khd2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof bbd_2) {
            bbd_2 bbd2 = (bbd_2)bdhw2;
            return this.tmk(bzth2, bbd2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof tay) {
            tay tay2 = (tay)bdhw2;
            return this.tys_4(bzth2, tay2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof tshd) {
            tshd tshd2 = (tshd)bdhw2;
            return this.bad_3(bzth2, tshd2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof bzw_2) {
            bzw_2 bzw2_2 = (bzw_2)bdhw2;
            return this.hsd_3(bzth2, bzw2_2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof bdh_3) {
            bdh_3 bdh2_2 = (bdh_3)bdhw2;
            return this.rsf_2(bzth2, bdh2_2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof badh_2) {
            badh_2 badh2 = (badh_2)bdhw2;
            return this.smk_2(bzth2, badh2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof fw_2) {
            fw_2 fw2 = (fw_2)bdhw2;
            return this.dtz_7(bzth2, fw2, f, f2, f3, f4, byq2, bl);
        }
        if (bdhw2 instanceof byl) {
            byl byl2 = (byl)bdhw2;
            return this.szh_4(bzth2, byl2, f, f2, f3, f4, byq2, bl);
        }
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), tshr.dz_3(bdhw2.getName()), f, f2 + 2.0f, byq3.thzz_4(f4));
        return 16.0f;
    }

    private float dshk(bzth bzth2, ts_4 ts2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        String string;
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq4 = bl ? new byq(122.0f, 122.0f, 122.0f, 255.0f) : new byq(161.0f, 161.0f, 170.0f, 255.0f);
        byq byq5 = bl ? new byq(20.0f, 20.0f, 20.0f, 255.0f) : new byq(244.0f, 244.0f, 245.0f, 255.0f);
        byq byq6 = bl ? new byq(35.0f, 35.0f, 35.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), tshr.dz_3(ts2.getName()), f, f2, byq3.thzz_4(f4));
        float f5 = f2 + 12.0f;
        float f6 = 15.0f;
        boolean bl2 = this.dhath == ts2;
        bzth2.drawRoundedRect(f, f5, f3, f6, zth_8.all(4.0f), byq5.thzz_4(f4));
        if (bl2) {
            bzth2.drawRoundedBorder(f, f5, f3, f6, 0.2f, zth_8.all(4.0f), byq2.thzz_4(f4));
        } else if (!bl) {
            bzth2.drawRoundedBorder(f, f5, f3, f6, 0.18f, zth_8.all(4.0f), byq6.thzz_4(f4));
        }
        String string2 = string = ts2.dysh() != null ? ts2.dysh() : "";
        if (string.isEmpty() && !bl2) {
            bzth2.drawText(bmn.shzth.twy_2(8.0f), "Enter text here...", f + 6.0f, f5 + 3.5f, byq4.thzz_4(f4));
        } else {
            Object object = string;
            if (bl2 && System.currentTimeMillis() / 400L % 2L == 0L) {
                object = (String)object + "|";
            }
            bzth2.drawText(bmn.shzth.twy_2(8.0f), (String)object, f + 6.0f, f5 + 3.5f, byq3.thzz_4(f4));
        }
        if (bhh.zzy_3(f, f5, f3, f6, bzth2)) {
            zw.hdhth(bay_2.shsdh);
        }
        return 12.0f + f6;
    }

    private float aza(bzth bzth2, khd khd2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        byq byq3;
        int n = khd2.jsw().size();
        byq byq4 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq5 = bl ? new byq(122.0f, 122.0f, 122.0f, 255.0f) : new byq(161.0f, 161.0f, 170.0f, 255.0f);
        byq byq6 = bl ? new byq(20.0f, 20.0f, 20.0f, 255.0f) : new byq(244.0f, 244.0f, 245.0f, 255.0f);
        byq byq7 = bl ? new byq(32.0f, 32.0f, 32.0f, 255.0f) : new byq(235.0f, 235.0f, 238.0f, 255.0f);
        byq byq8 = byq3 = bl ? new byq(35.0f, 35.0f, 35.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        if (n <= 4 && !khd2.zsm_2()) {
            byq byq9;
            int n2;
            bzth2.drawText(bmn.sdha_2.twy_2(7.5f), tshr.dz_3(khd2.getName()), f, f2, byq4.thzz_4(f4));
            float f5 = f;
            float f6 = f2 + 10.5f;
            float f7 = 14.0f;
            float f8 = 3.5f;
            float f9 = f + f3;
            float[] fArray = new float[n];
            float[] fArray2 = new float[n];
            float[] fArray3 = new float[n];
            float f10 = f5;
            float f11 = f6;
            float f12 = 20.0f;
            for (int i = 0; i < n; ++i) {
                fy fy2 = (fy)khd2.jsw().get(i);
                String string = tshr.dz_3(fy2.getName());
                float f13 = bmn.wl.twy_2(7.0f).dak(string) + 12.0f;
                if (f5 + f13 > f9 && f5 > f) {
                    f5 = f;
                    f6 += f7 + f8;
                }
                fArray[i] = f5;
                fArray2[i] = f6;
                fArray3[i] = f13;
                if (fy2.shghkh()) {
                    f10 = f5;
                    f11 = f6;
                    f12 = f13;
                }
                f5 += f13 + f8;
            }
            float f14 = f10 - f;
            float f15 = f11 - f2;
            float f16 = f12;
            fa_2 fa2_2 = this.zns_2.computeIfAbsent(khd2, arg_0 -> tshr.dhdkh(f14, arg_0));
            fa_2 fa3_2 = this.dzm.computeIfAbsent(khd2, arg_0 -> tshr.khdhw(f15, arg_0));
            fa_2 fa4 = this.shm_2.computeIfAbsent(khd2, arg_0 -> tshr.tdhdh(f16, arg_0));
            fa2_2.khmf(f14);
            fa3_2.khmf(f15);
            fa4.khmf(f16);
            float f17 = f + fa2_2.tssh_2();
            float f18 = f2 + fa3_2.tssh_2();
            float f19 = fa4.tssh_2();
            for (n2 = 0; n2 < n; ++n2) {
                boolean bl2 = ((fy)khd2.jsw().get(n2)).shghkh();
                boolean bl3 = bhh.zzy_3(fArray[n2], fArray2[n2], fArray3[n2], f7, bzth2);
                if (bl3) {
                    zw.hdhth(bay_2.mw);
                }
                byq9 = bl3 ? byq7 : byq6;
                bzth2.drawRoundedRect(fArray[n2], fArray2[n2], fArray3[n2], f7, zth_8.all(3.5f), byq9.thzz_4(f4));
                if (bl || bl2) continue;
                bzth2.drawRoundedBorder(fArray[n2], fArray2[n2], fArray3[n2], f7, 0.18f, zth_8.all(3.5f), byq3.thzz_4(f4));
            }
            bzth2.drawRoundedRect(f17, f18, f19, f7, zth_8.all(3.5f), byq2.thzz_4(f4));
            for (n2 = 0; n2 < n; ++n2) {
                fy fy3 = (fy)khd2.jsw().get(n2);
                String string = tshr.dz_3(fy3.getName());
                byq9 = fy3.shghkh() ? bhj_2.rrd : byq4;
                bzth2.drawCenteredText(bmn.wl.twy_2(7.0f), string, fArray[n2] + fArray3[n2] / 2.0f, fArray2[n2] + 3.5f, byq9.thzz_4(f4));
            }
            return f6 - f2 + f7;
        }
        bzth2.drawText(bmn.sdha_2.twy_2(7.5f), tshr.dz_3(khd2.getName()), f, f2, byq4.thzz_4(f4));
        float f20 = f2 + 12.0f;
        float f21 = 15.0f;
        boolean bl4 = this.dlsh == khd2;
        boolean bl5 = bhh.zzy_3(f, f20, f3, f21, bzth2);
        if (bl5) {
            zw.hdhth(bay_2.mw);
        }
        fa_2 fa5 = this.dhs_6.computeIfAbsent(khd2, tshr::lz_2);
        fa5.khmf(bl4 ? 1.0f : 0.0f);
        float f22 = fa5.tssh_2();
        String string = khd2.sdh_2() != null ? tshr.dz_3(khd2.sdh_2().getName()) : "None";
        byq byq10 = bl5 ? byq7 : byq6;
        zth_8 zth2 = f22 > 0.05f ? zth_8.top(4.0f, 4.0f) : zth_8.all(4.0f);
        bzth2.drawRoundedRect(f, f20, f3, f21, zth2, byq10.thzz_4(f4));
        if (!bl) {
            bzth2.drawRoundedBorder(f, f20, f3, f21, 0.18f, zth2, byq3.thzz_4(f4));
        }
        bzth2.drawText(bmn.shmz.twy_2(8.0f), string, f + 6.0f, f20 + 3.5f, byq4.thzz_4(f4));
        bzth2.drawText(bmn.shzth.twy_2(6.5f), bl4 ? "▲" : "▼", f + f3 - 10.0f, f20 + 4.5f, byq5.thzz_4(f4));
        if (f22 > 0.01f) {
            float f23 = f20 + f21;
            float f24 = (float)khd2.jsw().size() * 15.0f + 4.0f;
            float f25 = f24 * f22;
            bhm.dar_2(bzth2.method_51448(), f, f23, f3, f25);
            bzth2.drawRoundedRect(f, f23, f3, f24, zth_8.bottom(4.0f, 4.0f), byq6.thzz_4(f4));
            if (!bl) {
                bzth2.drawRoundedBorder(f, f23, f3, f24, 0.18f, zth_8.bottom(4.0f, 4.0f), byq3.thzz_4(f4));
            }
            bzth2.drawRect(f + 4.0f, f23, f3 - 8.0f, 0.5f, byq3.thzz_4(f4));
            float f26 = f23 + 2.0f;
            for (fy fy4 : khd2.jsw()) {
                boolean bl6;
                if (fy4.shls_2()) continue;
                boolean bl7 = bhh.zzy_3(f + 2.0f, f26, f3 - 4.0f, 15.0, bzth2);
                if (bl7) {
                    bzth2.drawRoundedRect(f + 2.0f, f26, f3 - 4.0f, 15.0f, zth_8.all(3.0f), byq7.thzz_4(f4));
                    zw.hdhth(bay_2.mw);
                }
                byq byq11 = (bl6 = fy4.shghkh()) ? byq2 : byq4;
                bzth2.drawText(bmn.shmz.twy_2(8.0f), tshr.dz_3(fy4.getName()), f + 6.0f, f26 + 3.5f, byq11.thzz_4(f4));
                if (bl6) {
                    bzth2.drawText(bmn.shmz.twy_2(8.0f), "✓", f + f3 - 12.0f, f26 + 3.5f, byq2.thzz_4(f4));
                }
                f26 += 15.0f;
            }
            bhm.sdhsh_2();
            return 12.0f + f21 + f25;
        }
        return 12.0f + f21;
    }

    private float tmk(bzth bzth2, bbd_2 bbd2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq4 = bl ? new byq(20.0f, 20.0f, 20.0f, 255.0f) : new byq(244.0f, 244.0f, 245.0f, 255.0f);
        byq byq5 = bl ? new byq(32.0f, 32.0f, 32.0f, 255.0f) : new byq(235.0f, 235.0f, 238.0f, 255.0f);
        byq byq6 = bl ? new byq(35.0f, 35.0f, 35.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        bzth2.drawText(bmn.sdha_2.twy_2(7.5f), tshr.dz_3(bbd2.getName()), f, f2, byq3.thzz_4(f4));
        float f5 = f;
        float f6 = f2 + 10.5f;
        float f7 = 13.0f;
        float f8 = 3.5f;
        float f9 = f + f3;
        for (s_3 s2 : bbd2.zskh_3()) {
            if (s2.dhtn()) continue;
            String string = tshr.dz_3(s2.getName());
            float f10 = bmn.sdha_2.twy_2(7.0f).dak(string) + 10.0f;
            if (f5 + f10 > f9 && f5 > f) {
                f5 = f;
                f6 += f7 + f8;
            }
            boolean bl2 = s2.alh();
            boolean bl3 = bhh.zzy_3(f5, f6, f10, f7, bzth2);
            if (bl3) {
                zw.hdhth(bay_2.mw);
            }
            byq byq7 = bl2 ? byq2 : (bl3 ? byq5 : byq4);
            bzth2.drawRoundedRect(f5, f6, f10, f7, zth_8.all(3.5f), byq7.thzz_4(f4));
            if (!bl && !bl2) {
                bzth2.drawRoundedBorder(f5, f6, f10, f7, 0.18f, zth_8.all(3.5f), byq6.thzz_4(f4));
            }
            byq byq8 = bl2 ? bhj_2.rrd : byq3;
            bzth2.drawCenteredText(bmn.sdha_2.twy_2(7.0f), string, f5 + f10 / 2.0f, f6 + 3.2f, byq8.thzz_4(f4));
            f5 += f10 + f8;
        }
        return f6 - f2 + f7;
    }

    private float tys_4(bzth bzth2, tay tay2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        float f5;
        float f6 = tay2.thw_5();
        float f7 = (f6 - tay2.alz_2()) / (tay2.sdhh_4() - tay2.alz_2());
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq4 = bl ? new byq(20.0f, 20.0f, 20.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        byq byq5 = bl ? new byq(35.0f, 35.0f, 35.0f, 255.0f) : new byq(220.0f, 220.0f, 225.0f, 255.0f);
        fa_2 fa2_2 = this.hld.computeIfAbsent(tay2, arg_0 -> tshr.aab_2(f7, arg_0));
        if (this.szs_4 == tay2) {
            fa2_2.atth_2(f7);
        } else {
            fa2_2.khmf(f7);
        }
        float f8 = fa2_2.tssh_2();
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), tshr.dz_3(tay2.getName()), f, f2, byq3.thzz_4(f4));
        String string = String.format(Locale.US, "%.1f%s", Float.valueOf(f6), tay2.hah_4());
        float f9 = bmn.shmz.twy_2(7.5f).dak(string);
        bzth2.drawText(bmn.shmz.twy_2(7.5f), string, f + f3 - f9, f2 + 10.0f, byq3.thzz_4(f4));
        float f10 = f;
        float f11 = f2 + 11.0f;
        float f12 = f3 - 32.0f;
        bzth2.drawRoundedRect(f10, f11, f12, 4.0f, zth_8.all(2.0f), byq4.thzz_4(f4));
        if (!bl) {
            bzth2.drawRoundedBorder(f10, f11, f12, 4.0f, 0.18f, zth_8.all(2.0f), byq5.thzz_4(f4));
        }
        if ((f5 = Math.max(0.0f, f12 * f8)) > 0.0f) {
            bzth2.drawRoundedRect(f10, f11, f5, 4.0f, zth_8.all(2.0f), byq2.thzz_4(f4));
        }
        float f13 = 8.0f;
        float f14 = f10 + f12 * f8 - f13 / 2.0f;
        float f15 = f11 + 2.0f - f13 / 2.0f;
        bzth2.drawShadow(f14, f15, f13, f13, 4.0f, zth_8.all(f13 / 2.0f), bhj_2.bdhj.thzz_4(0.22f * f4));
        bzth2.drawRoundedRect(f14, f15, f13, f13, zth_8.all(f13 / 2.0f), bhj_2.rrd.thzz_4(f4));
        bzth2.drawRoundedBorder(f14, f15, f13, f13, 0.4f, zth_8.all(f13 / 2.0f), (bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : new byq(200.0f, 200.0f, 205.0f, 255.0f)).thzz_4(f4));
        bzth2.drawRoundedRect(f14 + 2.0f, f15 + 2.0f, f13 - 4.0f, f13 - 4.0f, zth_8.all((f13 - 4.0f) / 2.0f), byq2.thzz_4(f4));
        if (bhh.zzy_3(f10, f11 - 5.0f, f12, 14.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        return 19.0f;
    }

    private float bad_3(bzth bzth2, tshd tshd2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        float f5 = (tshd2.dhdb_2() - tshd2.tdh_6()) / (tshd2.ghjdh() - tshd2.tdh_6());
        float f6 = (tshd2.aghm() - tshd2.tdh_6()) / (tshd2.ghjdh() - tshd2.tdh_6());
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq4 = bl ? new byq(20.0f, 20.0f, 20.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        byq byq5 = bl ? new byq(35.0f, 35.0f, 35.0f, 255.0f) : new byq(220.0f, 220.0f, 225.0f, 255.0f);
        fa_2 fa2_2 = this.tths_2.computeIfAbsent(tshd2, arg_0 -> tshr.thqgh(f5, arg_0));
        fa_2 fa3_2 = this.dkt_2.computeIfAbsent(tshd2, arg_0 -> tshr.dnl(f6, arg_0));
        if (this.zqz == tshd2) {
            fa2_2.atth_2(f5);
            fa3_2.atth_2(f6);
        } else {
            fa2_2.khmf(f5);
            fa3_2.khmf(f6);
        }
        float f7 = fa2_2.tssh_2();
        float f8 = fa3_2.tssh_2();
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), tshr.dz_3(tshd2.getName()), f, f2, byq3.thzz_4(f4));
        String string = String.format(Locale.US, "%.1f-%.1f", Float.valueOf(tshd2.dhdb_2()), Float.valueOf(tshd2.aghm()));
        float f9 = bmn.shmz.twy_2(7.5f).dak(string);
        bzth2.drawText(bmn.shmz.twy_2(7.5f), string, f + f3 - f9, f2 + 10.0f, byq3.thzz_4(f4));
        float f10 = f;
        float f11 = f2 + 11.0f;
        float f12 = f3 - 38.0f;
        bzth2.drawRoundedRect(f10, f11, f12, 4.0f, zth_8.all(2.0f), byq4.thzz_4(f4));
        if (!bl) {
            bzth2.drawRoundedBorder(f10, f11, f12, 4.0f, 0.18f, zth_8.all(2.0f), byq5.thzz_4(f4));
        }
        float f13 = f10 + f12 * f7;
        float f14 = Math.max(0.0f, f12 * (f8 - f7));
        if (f14 > 0.0f) {
            bzth2.drawRoundedRect(f13, f11, f14, 4.0f, zth_8.all(2.0f), byq2.thzz_4(f4));
        }
        float f15 = 8.0f;
        float f16 = f10 + f12 * f7 - f15 / 2.0f;
        float f17 = f10 + f12 * f8 - f15 / 2.0f;
        float f18 = f11 + 2.0f - f15 / 2.0f;
        bzth2.drawShadow(f16, f18, f15, f15, 4.0f, zth_8.all(f15 / 2.0f), bhj_2.bdhj.thzz_4(0.22f * f4));
        bzth2.drawRoundedRect(f16, f18, f15, f15, zth_8.all(f15 / 2.0f), bhj_2.rrd.thzz_4(f4));
        bzth2.drawRoundedBorder(f16, f18, f15, f15, 0.4f, zth_8.all(f15 / 2.0f), (bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : new byq(200.0f, 200.0f, 205.0f, 255.0f)).thzz_4(f4));
        bzth2.drawRoundedRect(f16 + 2.0f, f18 + 2.0f, f15 - 4.0f, f15 - 4.0f, zth_8.all((f15 - 4.0f) / 2.0f), byq2.thzz_4(f4));
        bzth2.drawShadow(f17, f18, f15, f15, 4.0f, zth_8.all(f15 / 2.0f), bhj_2.bdhj.thzz_4(0.22f * f4));
        bzth2.drawRoundedRect(f17, f18, f15, f15, zth_8.all(f15 / 2.0f), bhj_2.rrd.thzz_4(f4));
        bzth2.drawRoundedBorder(f17, f18, f15, f15, 0.4f, zth_8.all(f15 / 2.0f), (bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : new byq(200.0f, 200.0f, 205.0f, 255.0f)).thzz_4(f4));
        bzth2.drawRoundedRect(f17 + 2.0f, f18 + 2.0f, f15 - 4.0f, f15 - 4.0f, zth_8.all((f15 - 4.0f) / 2.0f), byq2.thzz_4(f4));
        if (bhh.zzy_3(f10, f11 - 5.0f, f12, 14.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        return 19.0f;
    }

    private float hsd_3(bzth bzth2, bzw_2 bzw2_2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        boolean bl2 = this.rsd_3 == bzw2_2;
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq4 = bl ? new byq(122.0f, 122.0f, 122.0f, 255.0f) : new byq(161.0f, 161.0f, 170.0f, 255.0f);
        byq byq5 = bl ? new byq(20.0f, 20.0f, 20.0f, 255.0f) : new byq(244.0f, 244.0f, 245.0f, 255.0f);
        byq byq6 = bl ? new byq(55.0f, 55.0f, 55.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        fa_2 fa2_2 = this.shdht.computeIfAbsent(bzw2_2, tshr::dhdt_2);
        fa2_2.khmf(bl2 ? 1.0f : 0.0f);
        float f5 = fa2_2.tssh_2();
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), tshr.dz_3(bzw2_2.getName()), f, f2 + 2.0f, byq3.thzz_4(f4));
        byq byq7 = bzw2_2.sdsh_4();
        String string = String.format("#%02X%02X%02X", (int)byq7.sbk(), (int)byq7.srl(), (int)byq7.shsl_2());
        float f6 = bmn.wl.twy_2(7.5f).dak(string);
        float f7 = 12.0f;
        float f8 = f + f3 - f7;
        float f9 = f2 + 1.0f;
        float f10 = f8 - f6 - 6.0f;
        bzth2.drawText(bmn.wl.twy_2(7.5f), string, f10, f2 + 3.0f, byq4.thzz_4(f4));
        bzth2.drawRoundedRect(f8, f9, f7, f7, zth_8.all(3.0f), byq7.thzz_4(f4));
        bzth2.drawRoundedBorder(f8, f9, f7, f7, 0.18f, zth_8.all(3.0f), byq6.thzz_4(f4));
        if (bhh.zzy_3(f, f2, f3, 15.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        if (f5 > 0.005f) {
            Object object;
            float f11;
            float f12 = f2 + 16.0f;
            float f13 = 42.0f;
            float f14 = 9.0f;
            float f15 = bzw2_2.shf_4() ? 9.0f : 0.0f;
            float f16 = f13 + 5.0f + f14 + (bzw2_2.shf_4() ? 4.0f + f15 : 0.0f);
            float f17 = f16 * f5;
            float f18 = f4 * f5;
            bhm.dar_2(bzth2.method_51448(), f, f12, f3, f17);
            byq byq8 = byq.slz_2(this.sthd_4[0], 1.0f, 1.0f);
            bdht.dhbz_2(bzth2.method_51448(), f, f12, f3, f13, zth_8.all(4.0f), bhj_2.rrd.thzz_4(f18), bhj_2.bdhj.thzz_4(f18), bhj_2.bdhj.thzz_4(f18), byq8.thzz_4(f18));
            float f19 = f + this.sthd_4[1] * f3;
            float f20 = f12 + (1.0f - this.sthd_4[2]) * f13;
            bzth2.drawRoundedRect(f19 - 3.0f, f20 - 3.0f, 6.0f, 6.0f, zth_8.all(3.0f), bhj_2.rrd.thzz_4(f18));
            bzth2.drawRoundedRect(f19 - 1.5f, f20 - 1.5f, 3.0f, 3.0f, zth_8.all(1.5f), bhj_2.bdhj.thzz_4(f18));
            float f21 = f12 + f13 + 5.0f;
            float f22 = f3 / 6.0f;
            byq[] byqArray = new byq[]{new byq(255.0f, 0.0f, 0.0f, 255.0f), new byq(255.0f, 255.0f, 0.0f, 255.0f), new byq(0.0f, 255.0f, 0.0f, 255.0f), new byq(0.0f, 255.0f, 255.0f, 255.0f), new byq(0.0f, 0.0f, 255.0f, 255.0f), new byq(255.0f, 0.0f, 255.0f, 255.0f), new byq(255.0f, 0.0f, 0.0f, 255.0f)};
            for (int i = 0; i < 6; ++i) {
                f11 = f + (float)i * f22;
                object = i == 0 ? zth_8.left(3.0f, 3.0f) : (i == 5 ? zth_8.right(3.0f, 3.0f) : zth_8.tjs);
                bdht.dhbz_2(bzth2.method_51448(), f11, f21, f22 + 0.5f, f14, (zth_8)object, byqArray[i].thzz_4(f18), byqArray[i].thzz_4(f18), byqArray[i + 1].thzz_4(f18), byqArray[i + 1].thzz_4(f18));
            }
            float f23 = class_3532.method_15363((float)(f + this.sthd_4[0] * f3), (float)(f + 2.0f), (float)(f + f3 - 2.0f));
            bzth2.drawRoundedRect(f23 - 2.0f, f21 - 1.5f, 4.0f, f14 + 3.0f, zth_8.all(2.0f), bhj_2.rrd.thzz_4(f18));
            if (bzw2_2.shf_4()) {
                f11 = f21 + f14 + 4.0f;
                object = new byq(bzw2_2.sdsh_4().sbk(), bzw2_2.sdsh_4().srl(), bzw2_2.sdsh_4().shsl_2(), 0.0f);
                byq byq9 = new byq(bzw2_2.sdsh_4().sbk(), bzw2_2.sdsh_4().srl(), bzw2_2.sdsh_4().shsl_2(), 255.0f);
                bzth2.drawRoundedRect(f, f11, f3, f15, zth_8.all(3.0f), byq5.thzz_4(f18));
                bdht.dhbz_2(bzth2.method_51448(), f, f11, f3, f15, zth_8.all(3.0f), ((byq)object).thzz_4(f18), ((byq)object).thzz_4(f18), byq9.thzz_4(f18), byq9.thzz_4(f18));
                float f24 = bzw2_2.sdsh_4().tzdh_2() / 255.0f;
                float f25 = class_3532.method_15363((float)(f + f24 * f3), (float)(f + 2.0f), (float)(f + f3 - 2.0f));
                bzth2.drawRoundedRect(f25 - 2.0f, f11 - 1.5f, 4.0f, f15 + 3.0f, zth_8.all(2.0f), bhj_2.rrd.thzz_4(f18));
            }
            bhm.sdhsh_2();
            return 16.0f + f17;
        }
        return 16.0f;
    }

    private float rsf_2(bzth bzth2, bdh_3 bdh2_2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        String string;
        float f5 = 14.0f;
        boolean bl2 = this.rrn == bdh2_2;
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), tshr.dz_3(bdh2_2.getName()), f, f2 + 2.5f, byq3.thzz_4(f4));
        String string2 = bl2 ? "..." : (string = bdh2_2.sdhkh() <= 0 || bdh2_2.sdhkh() == -1 ? "n/a" : bzdh_2.ddhn_2(bdh2_2.sdhkh()));
        if (string.equalsIgnoreCase("key.none") || string.equalsIgnoreCase("none")) {
            string = "n/a";
        }
        float f6 = bmn.shmz.twy_2(7.5f).dak(string) + 12.0f;
        float f7 = 12.0f;
        float f8 = f + f3 - f6;
        float f9 = f2 + 1.0f;
        byq byq4 = bl2 ? new byq(245.0f, 158.0f, 11.0f, 255.0f) : (bdh2_2.sdhkh() == 0 ? byq2 : byq2);
        bzth2.drawRoundedRect(f8, f9, f6, f7, zth_8.all(3.0f), byq4.thzz_4(f4));
        bzth2.drawCenteredText(bmn.shmz.twy_2(7.5f), string, f8 + f6 / 2.0f, f9 + 2.5f, bhj_2.rrd.thzz_4(f4));
        if (bhh.zzy_3(f8, f9, f6, f7, bzth2) || bhh.zzy_3(f, f2, f3, f5, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        return f5;
    }

    private float smk_2(bzth bzth2, badh_2 badh2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        float f5 = 16.0f;
        boolean bl2 = bhh.zzy_3(f, f2, f3, f5, bzth2);
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq4 = bl ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : new byq(209.0f, 213.0f, 219.0f, 255.0f);
        fa_2 fa2_2 = this.shaa.computeIfAbsent(badh2, arg_0 -> tshr.ahh_4(badh2, arg_0));
        fa2_2.ddt_6(badh2.shzl());
        float f6 = fa2_2.tssh_2();
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), tshr.dz_3(badh2.getName()), f, f2 + 3.5f, byq3.thzz_4(f4));
        float f7 = 20.0f;
        float f8 = 11.0f;
        float f9 = f + f3 - f7;
        float f10 = f2 + (f5 - f8) / 2.0f;
        byq byq5 = byq4.dkhw_2(byq2, f6).thzz_4(f4);
        bzth2.drawRoundedRect(f9, f10, f7, f8, zth_8.all(5.5f), byq5);
        float f11 = 7.0f;
        float f12 = f9 + 2.0f + 9.0f * f6;
        byq byq6 = bl ? (f6 > 0.5f ? bhj_2.rrd : new byq(12.0f, 12.0f, 12.0f, 255.0f)) : bhj_2.rrd;
        bzth2.drawRoundedRect(f12, f10 + 2.0f, f11, f11, zth_8.all(3.5f), byq6.thzz_4(f4));
        return f5;
    }

    private float dtz_7(bzth bzth2, fw_2 fw2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        float f5 = 16.0f;
        boolean bl2 = bhh.zzy_3(f, f2, f3, f5, bzth2);
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq4 = bl ? new byq(20.0f, 20.0f, 20.0f, 255.0f) : new byq(244.0f, 244.0f, 245.0f, 255.0f);
        byq byq5 = bl ? new byq(32.0f, 32.0f, 32.0f, 255.0f) : new byq(235.0f, 235.0f, 238.0f, 255.0f);
        byq byq6 = bl2 ? byq5.thzz_4(f4) : byq4.thzz_4(f4);
        bzth2.drawRoundedRect(f, f2, f3, f5, zth_8.all(4.0f), byq6);
        if (!bl) {
            bzth2.drawRoundedBorder(f, f2, f3, f5, 0.18f, zth_8.all(4.0f), new byq(228.0f, 228.0f, 231.0f, 255.0f).thzz_4(f4));
        }
        bzth2.drawCenteredText(bmn.shmz.twy_2(8.0f), tshr.dz_3(fw2.getName()), f + f3 / 2.0f, f2 + 4.0f, byq3.thzz_4(f4));
        return f5;
    }

    private float szh_4(bzth bzth2, byl byl2, float f, float f2, float f3, float f4, byq byq2, boolean bl) {
        boolean bl2;
        float f5 = 16.0f;
        boolean bl3 = this.khtz_4 == byl2;
        byq byq3 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), tshr.dz_3(byl2.getName()), f, f2 + 3.5f, byq3.thzz_4(f4));
        int n = byl2.tzs_8().size();
        Object object = n > 0 ? "Blocks (" + n + ")" : "Select";
        float f6 = bmn.sdha_2.twy_2(6.5f).dak((String)object);
        float f7 = f6 + 12.0f;
        float f8 = 12.0f;
        float f9 = f + f3 - f7;
        float f10 = f2 + 2.0f;
        boolean bl4 = bl2 = bhh.zzy_3(f9, f10, f7, f8, bzth2) || bhh.zzy_3(f, f2, f3, f5, bzth2);
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        byq byq4 = bl3 ? byq2 : (bl ? new byq(24.0f, 24.0f, 28.0f, 255.0f) : new byq(230.0f, 230.0f, 235.0f, 255.0f));
        bzth2.drawRoundedRect(f9, f10, f7, f8, zth_8.all(3.0f), byq4.thzz_4(f4));
        byq byq5 = bl3 ? bhj_2.rrd : (bl ? new byq(180.0f, 180.0f, 190.0f, 255.0f) : new byq(60.0f, 60.0f, 70.0f, 255.0f));
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), (String)object, f9 + f7 / 2.0f, f10 + 2.5f, byq5.thzz_4(f4));
        return f5;
    }

    private void dhsl(bzth bzth2, float f, float f2, float f3, float f4, float f5, byq byq2, boolean bl) {
        boolean bl2 = tkhd.getCurrentScreen() != null;
        bnn bnn2 = bnn.dzb_2();
        this.htw.zkhdh((long)bnn2.art());
        this.htw.ddt_6(this.khtz_4 != null && this.jah_4 && bl2);
        float f6 = this.htw.tssh_2() * f5;
        if (f6 < 0.005f) {
            return;
        }
        float f7 = f3;
        float f8 = 118.0f;
        float f9 = f;
        float f10 = f2 + f4 + 5.0f;
        float f11 = tdw.thfq();
        if (f10 + f8 > f11 - 5.0f) {
            f10 = Math.max(5.0f, f2 - f8 - 5.0f);
        }
        bzth2.pushMatrix();
        float f12 = 0.88f + 0.12f * this.htw.tssh_2();
        shk_3.bdhkh(bzth2.method_51448(), f9 + f7 / 2.0f, f10 + f8 / 2.0f, f12);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f6);
        byq byq3 = bl ? new byq(9.0f, 9.0f, 9.0f, 255.0f) : bhj_2.rrd;
        byq byq4 = bl ? new byq(24.0f, 24.0f, 24.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        byq byq5 = bl ? bhj_2.rrd : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        bzth2.drawShadow(f9 - 4.0f, f10 - 4.0f, f7 + 8.0f, f8 + 8.0f, 16.0f, zth_8.all(8.0f), bhj_2.bdhj.thzz_4((bl ? 0.35f : 0.15f) * f6));
        bzth2.drawRoundedRect(f9, f10, f7, f8, zth_8.all(8.0f), byq3.thzz_4(f6));
        if (!bl) {
            bzth2.drawRoundedBorder(f9, f10, f7, f8, 0.18f, zth_8.all(8.0f), byq4.thzz_4(f6));
        }
        float f13 = f9 + 6.0f;
        float f14 = f10 + 6.0f;
        float f15 = f7 - 12.0f;
        float f16 = 14.0f;
        byq byq6 = bl ? new byq(18.0f, 18.0f, 21.0f, 255.0f) : new byq(240.0f, 240.0f, 243.0f, 255.0f);
        bzth2.drawRoundedRect(f13, f14, f15, f16, zth_8.all(3.0f), byq6.thzz_4(f6));
        if (this.jw.zqr_2()) {
            bzth2.drawRoundedBorder(f13, f14, f15, f16, 0.18f, zth_8.all(3.0f), byq2.thzz_4(f6));
        }
        this.jw.dzh_8(f6);
        this.jw.amf(f13 + 5.0f, f14, f15 - 10.0f, f16);
        this.jw.bsz(byq5);
        this.jw.dhtz(bzth2);
        bzth2.drawRect(f9, f10 + 23.0f, f7, 0.5f, byq4.thzz_4(f6));
        float f17 = f9 + 6.0f;
        float f18 = f10 + 26.0f;
        float f19 = f7 - 12.0f;
        float f20 = f8 - 30.0f;
        bhm.dar_2(bzth2.method_51448(), f9, f18, f7, f20);
        this.dhdq.dzl_2();
        String string = this.jw.dwq().trim().toLowerCase();
        List<class_2248> list = tshr.st_5().stream().filter(arg_0 -> tshr.bqt_2(string, arg_0)).toList();
        float f21 = 14.0f;
        float f22 = 2.0f;
        float f23 = (float)(-this.dhdq.shtt_4());
        float f24 = f18 + f23;
        for (class_2248 class_22482 : list) {
            if (f24 + f21 > f18 && f24 < f18 + f20) {
                boolean bl3 = bhh.zzy_3(f17, f24, f19, f21, bzth2);
                if (bl3) {
                    zw.hdhth(bay_2.mw);
                    bzth2.drawRoundedRect(f17 - 2.0f, f24, f19 + 4.0f, f21, zth_8.all(3.0f), (bl ? new byq(255.0f, 255.0f, 255.0f, 10.0f) : new byq(0.0f, 0.0f, 0.0f, 10.0f)).thzz_4(f6));
                }
                try {
                    bzth2.pushMatrix();
                    bzth2.method_51448().method_46416(f17, f24 + 1.0f, 0.0f);
                    bzth2.method_51448().method_22905(0.65f, 0.65f, 1.0f);
                    bzth2.method_51427(class_22482.method_8389().method_7854(), 0, 0);
                    bzth2.popMatrix();
                }
                catch (Exception exception) {
                    // empty catch block
                }
                Object object = class_22482.method_9518().getString();
                float f25 = f19 - 40.0f;
                float f26 = bmn.sdha_2.twy_2(7.5f).dak((String)object);
                if (f26 > f25) {
                    while (((String)object).length() > 3 && bmn.sdha_2.twy_2(7.5f).dak((String)object + "...") > f25) {
                        object = ((String)object).substring(0, ((String)object).length() - 1);
                    }
                    object = (String)object + "...";
                }
                bzth2.drawText(bmn.sdha_2.twy_2(7.5f), (String)object, f17 + 15.0f, f24 + 3.0f, byq5.thzz_4(f6));
                boolean bl4 = this.khtz_4 != null && this.khtz_4.rdhf(class_22482);
                float f27 = 16.0f;
                float f28 = 9.0f;
                float f29 = f17 + f19 - f27;
                float f30 = f24 + 2.5f;
                byq byq7 = bl ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : new byq(209.0f, 213.0f, 219.0f, 255.0f);
                byq byq8 = byq2;
                byq byq9 = bl4 ? byq8 : byq7;
                bzth2.drawRoundedRect(f29, f30, f27, f28, zth_8.all(f28 / 2.0f), byq9.thzz_4(f6));
                float f31 = f28 - 2.0f;
                float f32 = bl4 ? f29 + f27 - 1.0f - f31 : f29 + 1.0f;
                bzth2.drawRoundedRect(f32, f30 + 1.0f, f31, f31, zth_8.all(f31 / 2.0f), bhj_2.rrd.thzz_4(f6));
            }
            f24 += f21 + f22;
        }
        float f33 = (float)list.size() * (f21 + f22);
        this.dhdq.srb_2(-Math.max(0.0f, f33 - f20 + 4.0f));
        bhm.sdhsh_2();
        bzth2.popMatrix();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private float dthm_2() {
        float f = 6.0f;
        for (bdhw bdhw2 : this.sthh.zhz_7().dty()) {
            if (!bdhw2.tsa_5()) continue;
            float f2 = this.hzr(bdhw2);
            f += f2 + 6.0f;
        }
        return f + 6.0f;
    }

    private float hzr(bdhw bdhw2) {
        if (bdhw2 instanceof ts_4) {
            return 27.0f;
        }
        if (bdhw2 instanceof tay) {
            return 19.0f;
        }
        if (bdhw2 instanceof tshd) {
            return 19.0f;
        }
        if (bdhw2 instanceof badh_2) {
            return 16.0f;
        }
        if (bdhw2 instanceof bdh_3) {
            return 14.0f;
        }
        if (bdhw2 instanceof fw_2) {
            return 16.0f;
        }
        if (bdhw2 instanceof byl) {
            return 16.0f;
        }
        if (bdhw2 instanceof bzw_2) {
            bzw_2 bzw2_2 = (bzw_2)bdhw2;
            fa_2 fa2_2 = (fa_2)this.shdht.get(bzw2_2);
            float f = fa2_2 != null ? fa2_2.tssh_2() : (this.rsd_3 == bzw2_2 ? 1.0f : 0.0f);
            float f2 = bzw2_2.shf_4() ? 85.0f : 72.0f;
            return 16.0f + (f2 - 16.0f) * f;
        }
        if (bdhw2 instanceof khd) {
            khd khd2 = (khd)bdhw2;
            int n = khd2.jsw().size();
            if (n <= 4 && !khd2.zsm_2()) {
                float f = 0.0f;
                float f3 = 10.5f;
                float f4 = 14.0f;
                float f5 = 3.5f;
                float f6 = 167.0f;
                for (int i = 0; i < n; ++i) {
                    fy fy2 = (fy)khd2.jsw().get(i);
                    float f7 = bmn.wl.twy_2(7.0f).dak(tshr.dz_3(fy2.getName())) + 12.0f;
                    if (f + f7 > f6 && f > 0.0f) {
                        f = 0.0f;
                        f3 += f4 + f5;
                    }
                    f += f7 + f5;
                }
                return f3 + f4;
            }
            fa_2 fa3_2 = (fa_2)this.dhs_6.get(khd2);
            float f = fa3_2 != null ? fa3_2.tssh_2() : (this.dlsh == khd2 ? 1.0f : 0.0f);
            return 27.0f + ((float)n * 15.0f + 4.0f) * f;
        }
        if (bdhw2 instanceof bbd_2) {
            bbd_2 bbd2 = (bbd_2)bdhw2;
            float f = 0.0f;
            float f8 = 10.5f;
            float f9 = 13.0f;
            float f10 = 3.5f;
            float f11 = 167.0f;
            for (s_3 s2 : bbd2.zskh_3()) {
                if (s2.dhtn()) continue;
                float f12 = bmn.sdha_2.twy_2(7.0f).dak(tshr.dz_3(s2.getName())) + 10.0f;
                if (f + f12 > f11 && f > 0.0f) {
                    f = 0.0f;
                    f8 += f9 + f10;
                }
                f += f12 + f10;
            }
            return f8 + f9;
        }
        return 16.0f;
    }

    public float atdh_2() {
        if (this.khhl) {
            return 24.0f;
        }
        float f = this.dthm_2();
        float f2 = tdw.thfq();
        float f3 = Math.max(40.0f, f2 - this.shat_2 - 24.0f - 12.0f);
        float f4 = Math.min(Math.min(226.0f, f3), f);
        return 24.0f + f4;
    }

    private static String dz_3(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        Object object = tr_2.ttq_3(string);
        if (((String)object).equals(string) && (string.startsWith("setting.") || string.startsWith("module.") || string.startsWith("settings.") || string.startsWith("modules."))) {
            object = ((String)object).substring(((String)object).lastIndexOf(46) + 1);
        }
        if (((String)object).matches(".*\\d+.*") && (((String)object).contains(".") || ((String)object).contains("+"))) {
            return object;
        }
        if (!((String)(object = ((String)object).replaceAll("([a-z])([A-Z])", "$1 $2"))).isEmpty() && Character.isLowerCase(((String)object).charAt(0))) {
            object = Character.toUpperCase(((String)object).charAt(0)) + ((String)object).substring(1);
        }
        return object;
    }

    public void bdht_2(double d, double d2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (this.shtl) {
            f7 = tdw.shjh();
            f6 = tdw.thfq();
            this.sdht_2 = class_3532.method_15363((float)((float)(d - (double)this.jkr)), (float)0.0f, (float)(f7 - 185.0f));
            this.shat_2 = class_3532.method_15363((float)((float)(d2 - (double)this.tsh_2)), (float)0.0f, (float)(f6 - 24.0f));
        }
        if (this.szs_4 != null) {
            f7 = this.sdht_2 + 9.0f;
            f6 = 167.0f;
            f5 = f7;
            f4 = f6 - 32.0f;
            f3 = class_3532.method_15363((float)((float)((d - (double)f5) / (double)f4)), (float)0.0f, (float)1.0f);
            f2 = this.szs_4.alz_2() + f3 * (this.szs_4.sdhh_4() - this.szs_4.alz_2());
            f = this.szs_4.bzz_3();
            if (f > 0.0f) {
                f2 = this.szs_4.alz_2() + (float)Math.round((f2 - this.szs_4.alz_2()) / f) * f;
            }
            this.szs_4.shjl(f2);
            fa_2 fa2_2 = (fa_2)this.hld.get(this.szs_4);
            if (fa2_2 != null) {
                fa2_2.atth_2(f3);
            }
        }
        if (this.zqz != null) {
            f7 = this.sdht_2 + 9.0f;
            f6 = 167.0f;
            f5 = f7;
            f4 = f6 - 38.0f;
            f3 = class_3532.method_15363((float)((float)((d - (double)f5) / (double)f4)), (float)0.0f, (float)1.0f);
            f2 = this.zqz.tdh_6() + f3 * (this.zqz.ghjdh() - this.zqz.tdh_6());
            if (this.shsd == 1) {
                this.zqz.thkt_2(Math.min(f2, this.zqz.aghm()));
            } else if (this.shsd == 2) {
                this.zqz.ghbw(Math.max(f2, this.zqz.dhdb_2()));
            }
            f = (this.zqz.dhdb_2() - this.zqz.tdh_6()) / (this.zqz.ghjdh() - this.zqz.tdh_6());
            float f8 = (this.zqz.aghm() - this.zqz.tdh_6()) / (this.zqz.ghjdh() - this.zqz.tdh_6());
            fa_2 fa3_2 = (fa_2)this.tths_2.get(this.zqz);
            fa_2 fa4 = (fa_2)this.dkt_2.get(this.zqz);
            if (fa3_2 != null) {
                fa3_2.atth_2(f);
            }
            if (fa4 != null) {
                fa4.atth_2(f8);
            }
        }
        if (this.rsd_3 != null && this.zl >= 0) {
            f7 = (float)(-this.hshgh.shtt_4());
            f6 = this.shat_2 + 24.0f + 6.0f + f7;
            f5 = this.sdht_2 + 9.0f;
            f4 = 167.0f;
            f3 = f6;
            for (bdhw bdhw2 : this.sthh.zhz_7().dty()) {
                if (!bdhw2.tsa_5()) continue;
                if (bdhw2 == this.rsd_3) {
                    float f9 = f3 + 16.0f;
                    float f10 = 42.0f;
                    float f11 = 9.0f;
                    float f12 = f9 + f10 + 5.0f;
                    float f13 = 9.0f;
                    float f14 = f12 + f11 + 4.0f;
                    if (this.zl == 0) {
                        this.sthd_4[1] = class_3532.method_15363((float)(((float)d - f5) / f4), (float)0.0f, (float)1.0f);
                        this.sthd_4[2] = 1.0f - class_3532.method_15363((float)(((float)d2 - f9) / f10), (float)0.0f, (float)1.0f);
                        int n = Color.HSBtoRGB(this.sthd_4[0], this.sthd_4[1], this.sthd_4[2]);
                        this.rsd_3.zmgh(new byq(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, this.rsd_3.sdsh_4().tzdh_2()));
                        break;
                    }
                    if (this.zl == 1) {
                        this.sthd_4[0] = class_3532.method_15363((float)(((float)d - f5) / f4), (float)0.0f, (float)1.0f);
                        int n = Color.HSBtoRGB(this.sthd_4[0], this.sthd_4[1], this.sthd_4[2]);
                        this.rsd_3.zmgh(new byq(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, this.rsd_3.sdsh_4().tzdh_2()));
                        break;
                    }
                    if (this.zl != 2 || !this.rsd_3.shf_4()) break;
                    float f15 = class_3532.method_15363((float)(((float)d - f5) / f4), (float)0.0f, (float)1.0f);
                    this.rsd_3.zmgh(new byq(this.rsd_3.sdsh_4().sbk(), this.rsd_3.sdsh_4().srl(), this.rsd_3.sdsh_4().shsl_2(), f15 * 255.0f));
                    break;
                }
                f3 += this.hzr(bdhw2) + 6.0f;
            }
        }
    }

    @Override
    public void dh_4(double d, double d2, tthdh tthdh2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = this.zl_2.tssh_2();
        if (f5 < 0.01f) {
            return;
        }
        if (this.rrn != null && tthdh2 != null) {
            this.rrn.khsh(tthdh2.getButtonIndex());
            this.rrn = null;
            return;
        }
        float f6 = this.dhsth ? this.zshl : 185.0f;
        float f7 = this.shat_2;
        float f8 = f7 + 7.0f;
        float f9 = this.sdht_2 + f6 - (this.dhsth ? 4.0f : 9.0f) - 10.0f;
        float f10 = f9 - 10.0f - 3.0f;
        float f11 = this.dhsth ? f9 - 10.0f - 4.0f : f10 - 10.0f - 3.0f;
        float f12 = tdw.thfq();
        float f13 = this.dthm_2();
        float f14 = Math.max(40.0f, f12 - this.shat_2 - 24.0f - 12.0f);
        float f15 = Math.min(Math.min(226.0f, f14), f13);
        float f16 = 24.0f + (this.dhsth ? Math.max(0.0f, this.zqkh - 24.0f) : f15);
        if (this.khtz_4 != null && this.htw.tssh_2() > 0.05f) {
            float f17;
            float f18;
            float f19;
            float f20;
            f4 = f6;
            f3 = 118.0f;
            f2 = this.sdht_2;
            f = f7 + f16 + 5.0f;
            if (f + f3 > f12 - 5.0f) {
                f = Math.max(5.0f, f7 - f3 - 5.0f);
            }
            if (bhh.thsb_2(f20 = f2 + 6.0f, f19 = f + 6.0f, f18 = f4 - 12.0f, f17 = 14.0f, d, d2)) {
                this.jw.dby(true);
                this.jw.dh_4(d, d2, tthdh2);
                return;
            }
            this.jw.dby(false);
            float f21 = f2 + 6.0f;
            float f22 = f + 26.0f;
            float f23 = f4 - 12.0f;
            float f24 = f3 - 30.0f;
            if (bhh.thsb_2(f2, f22, f4, f24, d, d2)) {
                String string = this.jw.dwq().trim().toLowerCase();
                List<class_2248> list = tshr.st_5().stream().filter(arg_0 -> tshr.aj(string, arg_0)).toList();
                float f25 = 14.0f;
                float f26 = 2.0f;
                float f27 = (float)(-this.dhdq.shtt_4());
                float f28 = f22 + f27;
                for (class_2248 class_22482 : list) {
                    if (bhh.thsb_2(f21, f28, f23, f25, d, d2)) {
                        if (this.khtz_4.rdhf(class_22482)) {
                            this.khtz_4.zka_4(class_22482);
                            khw.zzgh_2.play(0.8f);
                        } else {
                            this.khtz_4.tss_6(class_22482);
                            khw.dhfs.play(0.8f);
                        }
                        return;
                    }
                    f28 += f25 + f26;
                }
                return;
            }
            if (bhh.thsb_2(f2, f, f4, f3, d, d2)) {
                return;
            }
        }
        if (bhh.thsb_2(f9, f8, 10.0, 10.0, d, d2)) {
            khw.zkhw.play(0.8f);
            if (this.dhsth) {
                this.dhthdh.closeDockedSettings();
            } else {
                this.jah_4 = false;
            }
            return;
        }
        if (!this.dhsth && bhh.thsb_2(f10, f8, 10.0, 10.0, d, d2)) {
            this.khhl = !this.khhl;
            return;
        }
        if (bhh.thsb_2(f11, f8, 10.0, 10.0, d, d2)) {
            if (this.dhsth) {
                this.dhthdh.undockSettingsTab(this);
            } else {
                this.dhthdh.mergeSettingsTab(this);
            }
            return;
        }
        f4 = 20.0f;
        f2 = f11 - 6.0f - f4;
        f3 = 11.0f;
        f = f7 + (24.0f - f3) / 2.0f;
        if (bhh.thsb_2(f2, f, f4, f3, d, d2) && tthdh2 == tthdh.tdha_2) {
            this.sthh.zhz_7().dwkh();
            if (this.sthh.zhz_7().rgha_2()) {
                khw.dhfs.play(0.8f);
            } else {
                khw.zzgh_2.play(0.8f);
            }
            return;
        }
        if (!this.khhl && d2 > (double)(f7 + 24.0f)) {
            this.rjh_2(d, d2, tthdh2);
            return;
        }
        if (!this.dhsth && bhh.thsb_2(this.sdht_2, f7, 185.0, 24.0, d, d2) && tthdh2 == tthdh.tdha_2) {
            this.shtl = true;
            this.jkr = (float)(d - (double)this.sdht_2);
            this.tsh_2 = (float)(d2 - (double)f7);
        }
        super.dh_4(d, d2, tthdh2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void rjh_2(double d, double d2, tthdh tthdh2) {
        float f = this.dhsth ? this.zshl : 185.0f;
        float f2 = (float)(-this.hshgh.shtt_4());
        float f3 = this.shat_2 + 24.0f + 6.0f + f2;
        float f4 = this.sdht_2 + (this.dhsth ? 0.0f : 9.0f);
        float f5 = f - (this.dhsth ? 4.0f : 18.0f);
        float f6 = f3;
        Iterator iterator = this.sthh.zhz_7().dty().iterator();
        while (iterator.hasNext()) {
            float f7;
            block31: {
                Object object;
                Iterator iterator2;
                float f8;
                float f9;
                float f10;
                float f11;
                float f12;
                block38: {
                    Iterator iterator3;
                    block36: {
                        float f13;
                        float f14;
                        int n;
                        khd khd2;
                        block34: {
                            bdhw bdhw2;
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block40: {
                                                block39: {
                                                    block37: {
                                                        block32: {
                                                            block35: {
                                                                block33: {
                                                                    block30: {
                                                                        bdhw2 = (bdhw)iterator.next();
                                                                        if (!bdhw2.tsa_5()) continue;
                                                                        f7 = this.hzr(bdhw2);
                                                                        if (!(bdhw2 instanceof ts_4)) break block30;
                                                                        ts_4 ts2 = (ts_4)bdhw2;
                                                                        if (tthdh2 != tthdh.tdha_2) break block30;
                                                                        if (bhh.thsb_2(f4, f6 + 12.0f, f5, 15.0, d, d2)) {
                                                                            this.dhath = this.dhath == ts2 ? null : ts2;
                                                                            return;
                                                                        }
                                                                        break block31;
                                                                    }
                                                                    if (!(bdhw2 instanceof khd)) break block32;
                                                                    khd2 = (khd)bdhw2;
                                                                    if (tthdh2 != tthdh.tdha_2) break block32;
                                                                    n = khd2.jsw().size();
                                                                    if (n > 4 || khd2.zsm_2()) break block33;
                                                                    f12 = f4;
                                                                    f11 = f6 + 10.5f;
                                                                    f10 = 14.0f;
                                                                    f9 = 3.5f;
                                                                    f14 = f4 + f5;
                                                                    break block34;
                                                                }
                                                                f12 = f6 + 12.0f;
                                                                if (this.dlsh != khd2) break block35;
                                                                f11 = f12 + 15.0f;
                                                                f10 = f11 + 2.0f;
                                                                iterator3 = khd2.jsw().iterator();
                                                                break block36;
                                                            }
                                                            if (bhh.thsb_2(f4, f12, f5, 15.0, d, d2)) {
                                                                this.dlsh = khd2;
                                                                return;
                                                            }
                                                            break block31;
                                                        }
                                                        if (!(bdhw2 instanceof bbd_2)) break block37;
                                                        bbd_2 bbd2 = (bbd_2)bdhw2;
                                                        if (tthdh2 != tthdh.tdha_2) break block37;
                                                        f8 = f4;
                                                        f12 = f6 + 10.5f;
                                                        f11 = 13.0f;
                                                        f10 = 3.5f;
                                                        f9 = f4 + f5;
                                                        iterator2 = bbd2.zskh_3().iterator();
                                                        break block38;
                                                    }
                                                    if (!(bdhw2 instanceof tay)) break block39;
                                                    tay tay2 = (tay)bdhw2;
                                                    if (tthdh2 != tthdh.tdha_2) break block39;
                                                    float f15 = f4;
                                                    f12 = f6 + 11.0f;
                                                    f11 = f5 - 32.0f;
                                                    if (bhh.thsb_2(f15, (double)f12 - 5.0, f11, 14.0, d, d2)) {
                                                        f10 = class_3532.method_15363((float)((float)((d - (double)f15) / (double)f11)), (float)0.0f, (float)1.0f);
                                                        f9 = tay2.alz_2() + f10 * (tay2.sdhh_4() - tay2.alz_2());
                                                        f14 = tay2.bzz_3();
                                                        if (f14 > 0.0f) {
                                                            f9 = tay2.alz_2() + (float)Math.round((f9 - tay2.alz_2()) / f14) * f14;
                                                        }
                                                        tay2.shjl(f9);
                                                        fa_2 fa2_2 = (fa_2)this.hld.get(tay2);
                                                        if (fa2_2 != null) {
                                                            fa2_2.atth_2(f10);
                                                        }
                                                        this.szs_4 = tay2;
                                                        khw.hthn.play(0.35f);
                                                        return;
                                                    }
                                                    break block31;
                                                }
                                                if (!(bdhw2 instanceof tshd)) break block40;
                                                tshd tshd2 = (tshd)bdhw2;
                                                if (tthdh2 != tthdh.tdha_2) break block40;
                                                float f16 = f4;
                                                f12 = f6 + 11.0f;
                                                f11 = f5 - 38.0f;
                                                if (bhh.thsb_2(f16, (double)f12 - 5.0, f11, 14.0, d, d2)) {
                                                    f10 = class_3532.method_15363((float)((float)((d - (double)f16) / (double)f11)), (float)0.0f, (float)1.0f);
                                                    f9 = (tshd2.dhdb_2() - tshd2.tdh_6()) / (tshd2.ghjdh() - tshd2.tdh_6());
                                                    f14 = (tshd2.aghm() - tshd2.tdh_6()) / (tshd2.ghjdh() - tshd2.tdh_6());
                                                    if (Math.abs(f10 - f9) <= Math.abs(f10 - f14)) {
                                                        this.zqz = tshd2;
                                                        this.shsd = 1;
                                                        float f17 = tshd2.tdh_6() + f10 * (tshd2.ghjdh() - tshd2.tdh_6());
                                                        tshd2.thkt_2(Math.min(f17, tshd2.aghm()));
                                                    } else {
                                                        this.zqz = tshd2;
                                                        this.shsd = 2;
                                                        float f18 = tshd2.tdh_6() + f10 * (tshd2.ghjdh() - tshd2.tdh_6());
                                                        tshd2.ghbw(Math.max(f18, tshd2.dhdb_2()));
                                                    }
                                                    khw.hthn.play(0.35f);
                                                    return;
                                                }
                                                break block31;
                                            }
                                            if (!(bdhw2 instanceof bzw_2)) break block41;
                                            bzw_2 bzw2_2 = (bzw_2)bdhw2;
                                            if (tthdh2 != tthdh.tdha_2) break block41;
                                            if (bhh.thsb_2(f4, f6, f5, 15.0, d, d2)) {
                                                if (this.rsd_3 == bzw2_2) {
                                                    this.rsd_3 = null;
                                                    return;
                                                }
                                                this.rsd_3 = bzw2_2;
                                                byq byq2 = bzw2_2.sdsh_4();
                                                Color.RGBtoHSB((int)byq2.sbk(), (int)byq2.srl(), (int)byq2.shsl_2(), this.sthd_4);
                                                return;
                                            }
                                            if (this.rsd_3 == bzw2_2) {
                                                float f19 = f6 + 16.0f;
                                                f12 = 42.0f;
                                                f11 = 9.0f;
                                                f10 = f19 + f12 + 5.0f;
                                                f9 = 9.0f;
                                                f14 = f10 + f11 + 4.0f;
                                                if (bhh.thsb_2(f4, f19, f5, f12, d, d2)) {
                                                    this.zl = 0;
                                                    this.bdht_2(d, d2);
                                                    return;
                                                }
                                                if (bhh.thsb_2(f4, f10 - 2.0f, f5, f11 + 4.0f, d, d2)) {
                                                    this.zl = 1;
                                                    this.bdht_2(d, d2);
                                                    return;
                                                }
                                                if (bzw2_2.shf_4() && bhh.thsb_2(f4, f14 - 2.0f, f5, f9 + 4.0f, d, d2)) {
                                                    this.zl = 2;
                                                    this.bdht_2(d, d2);
                                                    return;
                                                }
                                            }
                                            break block31;
                                        }
                                        if (!(bdhw2 instanceof bdh_3)) break block42;
                                        bdh_3 bdh2_2 = (bdh_3)bdhw2;
                                        if (tthdh2 != tthdh.tdha_2) break block42;
                                        if (bhh.thsb_2(f4, f6, f5, 14.0, d, d2)) {
                                            this.rrn = this.rrn == bdh2_2 ? null : bdh2_2;
                                            return;
                                        }
                                        break block31;
                                    }
                                    if (!(bdhw2 instanceof badh_2)) break block43;
                                    badh_2 badh2 = (badh_2)bdhw2;
                                    if (tthdh2 != tthdh.tdha_2) break block43;
                                    if (bhh.thsb_2(f4, f6, f5, 16.0, d, d2)) {
                                        badh2.dwkh();
                                        if (badh2.shzl()) {
                                            khw.dhfs.play(0.8f);
                                            return;
                                        }
                                        khw.zzgh_2.play(0.8f);
                                        return;
                                    }
                                    break block31;
                                }
                                if (!(bdhw2 instanceof fw_2)) break block44;
                                fw_2 fw2 = (fw_2)bdhw2;
                                if (tthdh2 != tthdh.tdha_2) break block44;
                                if (bhh.thsb_2(f4, f6, f5, 16.0, d, d2)) {
                                    khw.sbkh_2.play(0.8f);
                                    if (fw2.dqt() == null) return;
                                    fw2.dqt().run();
                                    return;
                                }
                                break block31;
                            }
                            if (bdhw2 instanceof byl) {
                                byl byl2 = (byl)bdhw2;
                                if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f4, f6, f5, 16.0, d, d2)) {
                                    byl byl3 = this.khtz_4 = this.khtz_4 == byl2 ? null : byl2;
                                    if (this.khtz_4 != null) {
                                        khw.ghs.play(0.8f);
                                        return;
                                    }
                                    khw.zkhw.play(0.8f);
                                    return;
                                }
                            }
                            break block31;
                        }
                        for (int i = 0; i < n; f12 += f13 + f9, ++i) {
                            object = (fy)khd2.jsw().get(i);
                            String string = tshr.dz_3(((fy)object).getName());
                            f13 = bmn.wl.twy_2(7.0f).dak(string) + 12.0f;
                            if (f12 + f13 > f14 && f12 > f4) {
                                f12 = f4;
                                f11 += f10 + f9;
                            }
                            if (!bhh.thsb_2(f12, f11, f13, f10, d, d2)) continue;
                            ((fy)object).rhh_3();
                            return;
                        }
                        break block31;
                    }
                    while (iterator3.hasNext()) {
                        fy fy2 = (fy)iterator3.next();
                        if (fy2.shls_2()) continue;
                        if (bhh.thsb_2(f4 + 2.0f, f10, f5 - 4.0f, 15.0, d, d2)) {
                            fy2.rhh_3();
                            this.dlsh = null;
                            return;
                        }
                        f10 += 15.0f;
                    }
                    if (bhh.thsb_2(f4, f12, f5, 15.0, d, d2)) {
                        this.dlsh = null;
                        return;
                    }
                    break block31;
                }
                while (iterator2.hasNext()) {
                    s_3 s2 = (s_3)iterator2.next();
                    if (s2.dhtn()) continue;
                    object = tshr.dz_3(s2.getName());
                    float f20 = bmn.sdha_2.twy_2(7.0f).dak((String)object) + 10.0f;
                    if (f8 + f20 > f9 && f8 > f4) {
                        f8 = f4;
                        f12 += f11 + f10;
                    }
                    if (bhh.thsb_2(f8, f12, f20, f11, d, d2)) {
                        s2.drt();
                        return;
                    }
                    f8 += f20 + f10;
                }
            }
            f6 += f7 + 6.0f;
        }
    }

    @Override
    public void tbkh(double d, double d2, tthdh tthdh2) {
        this.shtl = false;
        this.szs_4 = null;
        this.zqz = null;
        this.zl = -1;
        super.tbkh(d, d2, tthdh2);
    }

    public void sha(double d, double d2, tthdh tthdh2, double d3, double d4) {
        this.bdht_2(d, d2);
    }

    @Override
    public void bry(int n, int n2, int n3) {
        if (this.rrn != null) {
            if (n == 256 || n == 259) {
                this.rrn.khsh(0);
            } else {
                this.rrn.khsh(n);
            }
            this.rrn = null;
            return;
        }
        if (this.jw.zqr_2()) {
            if (n == 256) {
                this.jw.dby(false);
            } else {
                this.jw.bry(n, n2, n3);
                khw.thzgh_2.play(0.7f);
            }
            return;
        }
        if (this.dhath != null) {
            if (n == 256 || n == 257) {
                this.dhath = null;
            } else if (n == 259) {
                String string;
                String string2 = string = this.dhath.dysh() != null ? this.dhath.dysh() : "";
                if (!string.isEmpty()) {
                    this.dhath.shsd_2(string.substring(0, string.length() - 1));
                }
            }
        }
        super.bry(n, n2, n3);
    }

    @Override
    public boolean thtt_3(char c, int n) {
        if (this.jw.zqr_2()) {
            this.jw.thtt_3(c, n);
            khw.thzgh_2.play(0.7f);
            return true;
        }
        if (this.dhath != null && c >= ' ' && c != '\u007f') {
            String string = this.dhath.dysh() != null ? this.dhath.dysh() : "";
            this.dhath.shsd_2(string + c);
            return true;
        }
        return super.thtt_3(c, n);
    }

    @Override
    public void dhhw_2(double d, double d2, double d3, double d4) {
        float f;
        float f2 = this.dhsth ? this.zshl : 185.0f;
        float f3 = tdw.thfq();
        float f4 = this.dthm_2();
        float f5 = Math.max(40.0f, f3 - this.shat_2 - 24.0f - 12.0f);
        float f6 = Math.min(Math.min(226.0f, f5), f4);
        float f7 = 24.0f + (this.dhsth ? Math.max(0.0f, this.zqkh - 24.0f) : f6);
        if (this.khtz_4 != null && this.htw.tssh_2() > 0.05f) {
            f = f2;
            float f8 = 118.0f;
            float f9 = this.sdht_2;
            float f10 = this.shat_2 + f7 + 5.0f;
            if (f10 + f8 > f3 - 5.0f) {
                f10 = Math.max(5.0f, this.shat_2 - f8 - 5.0f);
            }
            if (bhh.thsb_2(f9, f10, f, f8, d, d2)) {
                this.dhdq.jhd(d4);
                return;
            }
        }
        if (bhh.thsb_2(this.sdht_2, this.shat_2 + 24.0f, f2, f = this.dhsth ? Math.max(0.0f, this.zqkh - 24.0f) : tra.thn_3(f6, 0.0, this.hnd.tssh_2()), d, d2)) {
            this.hshgh.jhd(d4);
        }
    }

    public void khtt_3(double d, double d2) {
        this.bdht_2(d, d2);
    }

    public void rhh() {
        this.jah_4 = false;
    }

    public fa_2 dghf_2() {
        return this.zl_2;
    }

    public boolean sdhd_4() {
        return this.shtl;
    }

    public boolean tdd_5() {
        return this.jah_4;
    }

    public void dw(boolean bl) {
        this.jah_4 = bl;
    }

    public bsd_3 dmj() {
        return this.sthh;
    }

    public boolean za_4() {
        return this.dhsth;
    }

    public void jzj(boolean bl) {
        this.dhsth = bl;
    }

    @Override
    public float shjgh() {
        return this.sdht_2;
    }

    @Override
    public float stk() {
        return this.shat_2;
    }

    @Override
    public float thbkh() {
        return this.zshl;
    }

    @Override
    public float jfn() {
        return this.zqkh;
    }

    @Override
    public void ss_4(float f) {
        this.sdht_2 = f;
    }

    @Override
    public void raj(float f) {
        this.shat_2 = f;
    }

    private static boolean aj(String string, class_2248 class_22482) {
        return string.isEmpty() || class_22482.method_9518().getString().toLowerCase().contains(string) || class_7923.field_41175.method_10221((Object)class_22482).method_12832().toLowerCase().contains(string);
    }

    private static boolean bqt_2(String string, class_2248 class_22482) {
        return string.isEmpty() || class_22482.method_9518().getString().toLowerCase().contains(string) || class_7923.field_41175.method_10221((Object)class_22482).method_12832().toLowerCase().contains(string);
    }

    private static fa_2 ahh_4(badh_2 badh2, badh_2 badh3) {
        return new fa_2(200L, badh2.shzl() ? 1.0f : 0.0f, jkh.tb);
    }

    private static fa_2 dhdt_2(bzw_2 bzw2_2) {
        return new fa_2(220L, 0.0f, jkh.tb);
    }

    private static fa_2 dnl(float f, tshd tshd2) {
        return new fa_2(120L, f, jkh.tb);
    }

    private static fa_2 thqgh(float f, tshd tshd2) {
        return new fa_2(120L, f, jkh.tb);
    }

    private static fa_2 aab_2(float f, tay tay2) {
        return new fa_2(120L, f, jkh.tb);
    }

    private static fa_2 lz_2(khd khd2) {
        return new fa_2(200L, 0.0f, jkh.tb);
    }

    private static fa_2 tdhdh(float f, khd khd2) {
        return new fa_2(180L, f, jkh.tb);
    }

    private static fa_2 khdhw(float f, khd khd2) {
        return new fa_2(180L, f, jkh.tb);
    }

    private static fa_2 dhdkh(float f, khd khd2) {
        return new fa_2(180L, f, jkh.tb);
    }

    private static String[] qpl6ebhcfi2(String string) {
        return string.split("\u0004\u000e", -1);
    }

    private static CallSite u8bnh3o4ftl13(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bw5gsg3zpe53x ^ string.hashCode() ^ n2 + z89oi6u + i * 137110573) + bw5gsg3zpe53x) ^ z89oi6u));
            }
            String[] stringArray = tshr.qpl6ebhcfi2(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

