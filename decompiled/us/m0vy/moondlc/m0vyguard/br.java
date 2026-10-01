/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_437
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_437;
import us.m0vy.moondlc.m0vyguard.bhh;
import us.m0vy.moondlc.m0vyguard.bhm;
import us.m0vy.moondlc.m0vyguard.bkhz_2;
import us.m0vy.moondlc.m0vyguard.bkha_2;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bdd_3;
import us.m0vy.moondlc.m0vyguard.bay_2;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byh;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.tthn;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.jn;
import us.m0vy.moondlc.m0vyguard.zw;
import us.m0vy.moondlc.m0vyguard.sgh;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.ghgh;
import us.m0vy.moondlc.m0vyguard.fh;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.nt_3;
import us.movy.moondlc.Moondlc;

public class br
extends nt_3
implements byh,
bkhz_2 {
    private final fa_2 hrsh = new fa_2(300L, 0.0f, jkh.shhj);
    private final fa_2 ztgh_2 = new fa_2(300L, 0.0f, jkh.dzb);
    protected final fa_2 khwy = new fa_2(300L, 0.0f, jkh.dzb);
    private final fa_2 hys_2 = new fa_2(300L, 0.0f, jkh.shhj);
    private final bdd_3 tqd_2 = new bdd_3(300L);
    private final bdd_3 rtk = new bdd_3(200L);
    private final String khaw;
    private boolean khhs_4;
    private float khadh;
    private boolean khss_3;
    private boolean str_3;
    private float thkkh;
    private float jdh_4;
    private boolean ddj_2;
    private boolean thhw;
    private boolean khmh_2;
    private final boolean dsl_2;
    private final fa_2 dhtj = new fa_2(500L, jkh.zah);
    private final fa_2 skhd_2 = new fa_2(500L, jkh.zah);
    private final fa_2 slj = new fa_2(500L, jkh.zah);
    private final fa_2 dmw = new fa_2(500L, jkh.zah);
    private float rzh_4;
    private float thnz_2;
    private float dhqt;
    private float hnw;
    public static final List ras_3;
    private static final int ls5hg52nrg6ee = -1642099988;
    private static final int g5b2dkiduc6 = 2110087807;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int u37jd0b0k8;

    public br(float f, float f2, float f3, boolean bl, byq byq2, String string) {
        super(f, f2, 143.0f, bl ? 160.0f : 136.0f);
        this.khadh = f3;
        this.dsl_2 = bl;
        this.khhs_4 = true;
        this.rtk.all_2(byq2);
        this.khaw = string;
        this.bql(byq2);
    }

    public static void dkhkh_2(List list) {
        ras_3.clear();
        ras_3.addAll(list);
    }

    @Override
    protected void bws_2(bzth bzth2) {
        if (this.ddj_2) {
            this.rzh_4 = bhh.tad(0.0f, 1.0f, this.shat_2 + 22.0f, 66.0f, bzth2.getMouseY());
        }
        if (this.thhw) {
            this.thnz_2 = 1.0f - bhh.tad(0.0f, 1.0f, this.sdht_2 + 6.0f, 114.0f, bzth2.getMouseX());
            this.dhqt = 1.0f - bhh.tad(0.0f, 1.0f, this.shat_2 + 20.0f, 70.0f, bzth2.getMouseY());
        }
        if (this.khmh_2) {
            this.hnw = bhh.tad(0.0f, 1.0f, this.sdht_2 + 7.0f, 88.0f, bzth2.getMouseX());
        }
        if (this.khss_3) {
            this.sdht_2 = (float)bzth2.getMouseX() - this.thkkh;
            this.shat_2 = (float)bzth2.getMouseY() - this.jdh_4;
        }
        ras_3.removeIf(br::dts_5);
        this.hys_2.dam_2(this.str_3 ? jkh.hd_2 : jkh.hthd);
        this.hys_2.ddt_6(this.str_3);
        this.hrsh.dam_2(this.khhs_4 ? jkh.hd_2 : jkh.hthd);
        this.hrsh.ddt_6(this.khhs_4);
        this.ztgh_2.ddt_6(this.hrsh.tssh_2() >= 0.6f);
        this.khwy.ddt_6(this.khss_3);
        this.dhtj.khmf(this.rzh_4);
        this.skhd_2.khmf(1.0f - this.thnz_2);
        this.slj.khmf(1.0f - this.dhqt);
        this.dmw.khmf(this.hnw);
        this.tqd_2.zsa_8(byq.slz_2(this.rzh_4, 1.0f, 1.0f));
        boolean bl = Moondlc.getInstance().getThemeManager().zskh_2() == tthn.jthj;
        byq byq2 = bhj_2.khhy_2().tkhl_2(255.0f * (bl ? 0.9f - 0.6f * sgh.swk_2() : 0.7f));
        byq byq3 = byq.slz_2(this.rzh_4, this.thnz_2, this.dhqt);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)Math.min(1.0f, this.hrsh.tssh_2()));
        shk_3.bdhkh(bzth2.getContext(), this.sdht_2 + this.zshl / this.khadh, this.shat_2 + this.zqkh / this.khadh, 0.5f + this.hrsh.tssh_2() * 0.5f);
        bhm.dar_2(bzth2.getContext(), this.sdht_2 + 1.0f, this.shat_2 + 1.0f, this.zshl - 2.0f, this.zqkh - 2.0f);
        bzth2.drawShadow(this.sdht_2 - 5.0f, this.shat_2 - 5.0f, this.zshl + 10.0f, this.zqkh + 10.0f, 15.0f, zth_8.all(6.0f), byq.dhww.tkhl_2(255.0f * (0.1f + 0.15f * this.khwy.tssh_2())));
        bhm.sdhsh_2();
        if (sgh.dfs()) {
            bzth2.drawBlurredRect(this.sdht_2, this.shat_2, this.zshl, this.zqkh, 45.0f, 7.0f, zth_8.all(6.0f), byq.brz_2.tkhl_2(255.0f * this.hrsh.tssh_2() * sgh.tqa()));
        }
        if (sgh.drgh()) {
            bzth2.drawLiquidGlass(this.sdht_2, this.shat_2, this.zshl, this.zqkh, 7.0f, 0.05f - 0.03f * this.khwy.tssh_2(), zth_8.all(6.0f), byq.brz_2.tkhl_2(255.0f * this.hrsh.tssh_2() * sgh.swk_2()));
        }
        bzth2.drawSquircle(this.sdht_2, this.shat_2, this.zshl, this.zqkh, 7.0f, zth_8.all(6.0f), byq2);
        bhm.dar_2(bzth2.getContext(), this.sdht_2, this.shat_2, this.zshl, this.zqkh);
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(7.0f), this.khaw, this.sdht_2 + this.zshl / 2.0f, this.shat_2 + 7.0f, bhj_2.bzs());
        bzth2.drawTexture(Moondlc.id("icons/colorpicker/pipette.png"), this.sdht_2 + 7.0f, this.shat_2 + 6.0f, 8.0f, 8.0f);
        if (bhh.rkhl(this.sdht_2 + 7.0f, this.shat_2 + 6.0f, 8.0, 8.0, bzth2.getMouseX(), bzth2.getMouseY())) {
            zw.hdhth(bay_2.mw);
        }
        bzth2.drawRoundedRect(this.sdht_2 + this.zshl - 15.0f, this.shat_2 + 5.0f, 10.0f, 10.0f, zth_8.all(5.0f), bhj_2.bdhh());
        bzth2.drawTexture(Moondlc.id("icons/colorpicker/xmark.png"), this.sdht_2 + this.zshl - 15.0f, this.shat_2 + 5.0f, 10.0f, 10.0f);
        if (bhh.rkhl(this.sdht_2 + this.zshl - 15.0f, this.shat_2 + 5.0f, 10.0, 10.0, bzth2.getMouseX(), bzth2.getMouseY())) {
            zw.hdhth(bay_2.mw);
        }
        bzth2.drawRoundedTexture(Moondlc.id("textures/hue.png"), this.sdht_2 + this.zshl - 18.0f, this.shat_2 + 20.0f, 12.0f, 70.0f, zth_8.all(4.0f));
        bzth2.drawRoundedRect(this.sdht_2 + this.zshl - 16.0f, this.shat_2 + 22.0f + 64.0f * this.dhtj.tssh_2(), 8.0f, 2.0f, zth_8.all(0.2f), bhj_2.rrd);
        if (bhh.zzy_3(this.sdht_2 + this.zshl - 18.0f, this.shat_2 + 20.0f, 12.0, 70.0, bzth2) || this.ddj_2) {
            zw.hdhth(bay_2.hzgh);
        }
        bzth2.drawRoundedRect(this.sdht_2 + 6.0f, this.shat_2 + 20.0f, 114.0f, 70.0f, zth_8.all(4.0f), bkha_2.thtl_2(this.tqd_2.dsr_4(), bhj_2.bdhj, bhj_2.rrd, bhj_2.bdhj));
        bzth2.drawRoundedRect(this.sdht_2 + 6.0f + 114.0f * this.skhd_2.tssh_2() - 3.5f, this.shat_2 + 20.0f + 70.0f * this.slj.tssh_2() - 3.5f, 7.0f, 7.0f, zth_8.all(2.5f), bhj_2.rrd);
        bzth2.drawRoundedRect(this.sdht_2 + 7.0f + 114.0f * this.skhd_2.tssh_2() - 3.5f, this.shat_2 + 21.0f + 70.0f * this.slj.tssh_2() - 3.5f, 5.0f, 5.0f, zth_8.all(1.5f), byq3);
        if (bhh.zzy_3(this.sdht_2 + 6.0f, this.shat_2 + 20.0f, 114.0, 70.0, bzth2) || this.thhw) {
            zw.hdhth(bay_2.smdh);
        }
        if (this.dsl_2) {
            bzth2.drawText(bmn.sdha_2.twy_2(5.0f), tr_2.ttq_3("colorpicker.opacity").toUpperCase(), this.sdht_2 + 6.0f, this.shat_2 + 95.0f, bhj_2.bzs().tkhl_2(191.25f));
            bzth2.drawRoundedTexture(Moondlc.id("textures/empty.png"), this.sdht_2 + 6.0f, this.shat_2 + 102.0f, 100.0f, 12.0f, zth_8.all(5.0f));
            bzth2.drawRoundedRect(this.sdht_2 + 6.0f - 0.5f, this.shat_2 + 102.0f - 0.5f, 101.0f, 13.0f, zth_8.all(5.0f), new jn(byq3.tkhl_2(0.0f), byq3));
            bzth2.drawRoundedRect(this.sdht_2 + this.zshl - 32.0f, this.shat_2 + 102.0f, 26.0f, 12.0f, zth_8.all(2.0f), bhj_2.bdhh().tkhl_2(255.0f));
            bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.0f), (int)(this.hnw * 100.0f) + "%", this.sdht_2 + this.zshl - 32.0f + 13.0f, this.shat_2 + 106.0f, bhj_2.bzs());
            bzth2.drawRoundedBorder(this.sdht_2 + 7.0f + 88.0f * this.dmw.tssh_2(), this.shat_2 + 103.0f, 10.0f, 10.0f, 0.5f, zth_8.all(4.0f), bhj_2.rrd);
            bzth2.drawRoundedRect(this.sdht_2 + 8.0f + 88.0f * this.dmw.tssh_2(), this.shat_2 + 104.0f, 8.0f, 8.0f, zth_8.all(3.0f), this.zad_4());
            if (bhh.zzy_3(this.sdht_2 + 6.0f, this.shat_2 + 102.0f, 100.0, 12.0, bzth2) || this.khmh_2) {
                zw.hdhth(bay_2.zdhh);
            }
        }
        bzth2.drawRoundedRect(this.sdht_2 + 6.0f, this.shat_2 + this.zqkh - 36.0f, 29.0f, 29.0f, zth_8.all(5.0f), this.zad_4());
        float f = 0.0f;
        float f2 = 0.0f;
        for (Object object : ras_3) {
            ((ghgh)object).dhma_2.ddt_6(((ghgh)object).rla);
            ((ghgh)object).bqb.ddt_6(((ghgh)object).rrk.ztdh_4() == this.rzh_4 && ((ghgh)object).rrk.dzt_3() == this.dhqt && ((ghgh)object).rrk.shjm() == this.thnz_2);
            if (((ghgh)object).bqb.tssh_2() > 0.0f) {
                float f3 = ((ghgh)object).bqb.tssh_2();
                bzth2.drawRoundedRect(this.sdht_2 + 45.0f + f, this.shat_2 + this.zqkh - 36.0f + f2, 11.0f, 11.0f, zth_8.all(4.5f), ((ghgh)object).rrk.tkhl_2(255.0f * ((ghgh)object).dhma_2.tssh_2()));
                bzth2.drawRoundedBorder(this.sdht_2 + 45.0f + f - 1.0f + 2.0f * f3, this.shat_2 + this.zqkh - 36.0f + f2 - 1.0f + 2.0f * f3, 13.0f - 4.0f * f3, 13.0f - 4.0f * f3, 0.5f, zth_8.all(6.5f - 2.0f * f3), bhj_2.rrd.tkhl_2(255.0f * ((ghgh)object).dhma_2.tssh_2() * ((ghgh)object).bqb.tssh_2()));
            } else {
                bzth2.drawRoundedRect(this.sdht_2 + 45.0f + f, this.shat_2 + this.zqkh - 36.0f + f2, 11.0f, 11.0f, zth_8.all(4.5f), ((ghgh)object).rrk.tkhl_2(255.0f * ((ghgh)object).dhma_2.tssh_2()));
            }
            if (bhh.zzy_3(this.sdht_2 + 45.0f + f, this.shat_2 + this.zqkh - 36.0f + f2, 11.0, 11.0, bzth2)) {
                zw.hdhth(bay_2.mw);
            }
            if (!(45.0f + (f += 20.0f * ((ghgh)object).dhma_2.tssh_2()) > this.zshl)) continue;
            f = 0.0f;
            f2 += 18.0f * ((ghgh)object).dhma_2.tssh_2();
        }
        if (ras_3.size() < 10) {
            bzth2.drawRoundedRect(this.sdht_2 + 45.0f + f, this.shat_2 + this.zqkh - 36.0f + f2, 11.0f, 11.0f, zth_8.all(4.5f), bhj_2.bdhh());
            bzth2.drawTexture(Moondlc.id("icons/colorpicker/plus.png"), this.sdht_2 + 45.0f + f, this.shat_2 + this.zqkh - 36.0f + f2, 11.0f, 11.0f);
            if (bhh.zzy_3(this.sdht_2 + 45.0f + f, this.shat_2 + this.zqkh - 36.0f + f2, 11.0, 11.0, bzth2)) {
                zw.hdhth(bay_2.mw);
            }
        }
        bhm.sdhsh_2();
        shk_3.hbj(bzth2.getContext());
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (this.hys_2.tssh_2() > 0.0f) {
            Object object;
            fh fh2 = new fh(bzth2.getMouseX(), bzth2.getMouseY() + 10, 45.0f + bmn.shzth.twy_2(6.0f).dak(tr_2.ttq_3("colorpicker.click_to_sample")), 30.0f);
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)Math.min(1.0f, this.hys_2.tssh_2()));
            shk_3.bdhkh(bzth2.getContext(), fh2.khdb_2() + fh2.shfz() / 2.0f, fh2.sw() + fh2.khll() / 2.0f, 0.5f + this.hys_2.tssh_2() * 0.5f);
            bzth2.drawBlurredRect(fh2.khdb_2(), fh2.sw(), fh2.shfz(), fh2.khll(), 45.0f, 7.0f, zth_8.all(6.0f), byq.brz_2.tkhl_2(255.0f * this.hys_2.tssh_2()));
            bzth2.drawSquircle(fh2.khdb_2(), fh2.sw(), fh2.shfz(), fh2.khll(), 7.0f, zth_8.all(6.0f), bhj_2.khhy_2().tkhl_2(255.0f * (bl ? 0.8f : 0.7f)));
            object = byq.djk_2((float)((double)bzth2.getMouseX() * tdw.khrz_2()), (float)((double)mc.method_22683().method_4502() - (double)bzth2.getMouseY() * tdw.khrz_2()));
            bzth2.drawRoundedRect(fh2.khdb_2() + 5.0f, fh2.sw() + 5.0f, fh2.khll() - 10.0f, fh2.khll() - 10.0f, zth_8.all(5.0f), (byq)object);
            bzth2.drawTexture(Moondlc.id("icons/colorpicker/click.png"), fh2.khdb_2() + fh2.khll(), fh2.sw() + 16.0f, 6.0f, 6.0f);
            bzth2.drawText(bmn.shzth.twy_2(6.0f), String.format("RGB %s %s %s", (int)((byq)object).sbk(), (int)((byq)object).srl(), (int)((byq)object).shsl_2()), fh2.khdb_2() + fh2.khll(), fh2.sw() + 8.0f, bhj_2.bzs());
            bzth2.drawText(bmn.shzth.twy_2(6.0f), tr_2.ttq_3("colorpicker.click_to_sample"), fh2.khdb_2() + fh2.khll() + 8.0f, fh2.sw() + 17.0f, bhj_2.bzs().tkhl_2(200.0f));
            shk_3.hbj(bzth2.getContext());
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    public byq zad_4() {
        this.rtk.zsa_8(byq.slz_2(this.rzh_4, this.thnz_2, this.dhqt).tkhl_2(this.dsl_2 ? 255.0f * this.hnw : 255.0f));
        return this.rtk.dsr_4();
    }

    @Override
    public void bry(int n, int n2, int n3) {
        if (class_437.method_25438((int)n)) {
            br.mc.field_1774.method_1455(this.zad_4().ddl_4());
        } else if (class_437.method_25437((int)n)) {
            String string = br.mc.field_1774.method_1460();
            try {
                this.bql(byq.rghk(string));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        super.bry(n, n2, n3);
    }

    @Override
    public void dh_4(double d, double d2, tthdh tthdh2) {
        boolean bl = ras_3.size() < 10;
        float f = 0.0f;
        float f2 = 0.0f;
        for (ghgh ghgh2 : ras_3) {
            if (bhh.thsb_2(this.sdht_2 + 45.0f + f, this.shat_2 + this.zqkh - 36.0f + f2, 11.0, 11.0, d, d2)) {
                if (tthdh2.getButtonIndex() != 0) {
                    ghgh2.rla = false;
                    Moondlc.getInstance().getFileManager().dsf_2("client");
                } else {
                    this.bql(ghgh2.rrk);
                }
                return;
            }
            if (ghgh2.rrk.ztdh_4() == this.rzh_4 && ghgh2.rrk.dzt_3() == this.dhqt && ghgh2.rrk.shjm() == this.thnz_2) {
                bl = false;
            }
            if (!(45.0f + (f += 20.0f) > this.zshl)) continue;
            f = 0.0f;
            f2 += 18.0f;
        }
        if (bhh.thsb_2(this.sdht_2 + 45.0f + f, this.shat_2 + this.zqkh - 36.0f + f2, 11.0, 11.0, d, d2) && bl) {
            ras_3.add(new ghgh(this.zad_4()));
            Moondlc.getInstance().getFileManager().dsf_2("client");
        } else if (tthdh2.getButtonIndex() != 0) {
            this.str_3 = false;
        } else {
            if (this.str_3) {
                byq byq2 = byq.djk_2((float)(d * tdw.khrz_2()), (float)((double)mc.method_22683().method_4502() - d2 * tdw.khrz_2()));
                this.bql(byq2);
                this.str_3 = false;
            }
            if (bhh.thsb_2(this.sdht_2 + 7.0f, this.shat_2 + 6.0f, 8.0, 8.0, d, d2)) {
                this.str_3 = true;
            } else if (bhh.thsb_2(this.sdht_2 + this.zshl - 15.0f, this.shat_2 + 5.0f, 10.0, 10.0, d, d2)) {
                this.khhs_4 = false;
                this.khadh = 2.0f;
            } else if (bhh.thsb_2(this.sdht_2 + this.zshl - 18.0f, this.shat_2 + 20.0f, 12.0, 70.0, d, d2)) {
                this.ddj_2 = true;
            } else if (bhh.thsb_2(this.sdht_2 + 6.0f, this.shat_2 + 20.0f, 114.0, 70.0, d, d2)) {
                this.thhw = true;
            } else if (bhh.thsb_2(this.sdht_2 + 6.0f, this.shat_2 + 102.0f, 100.0, 12.0, d, d2)) {
                this.khmh_2 = true;
            } else if (this.shrh(d, d2)) {
                this.khss_3 = true;
                this.thkkh = (float)(d - (double)this.sdht_2);
                this.jdh_4 = (float)(d2 - (double)this.shat_2);
            }
        }
    }

    @Override
    public void tbkh(double d, double d2, tthdh tthdh2) {
        this.khss_3 = false;
        this.thhw = false;
        this.ddj_2 = false;
        this.khmh_2 = false;
    }

    public void bql(byq byq2) {
        this.rzh_4 = byq2.ztdh_4();
        this.thnz_2 = byq2.shjm();
        this.dhqt = byq2.dzt_3();
        this.hnw = byq2.tzdh_2() / 255.0f;
        this.rtk.zsa_8(byq2);
    }

    @Generated
    public fa_2 dha() {
        return this.hrsh;
    }

    @Generated
    public String rqz() {
        return this.khaw;
    }

    @Generated
    public boolean ztq_4() {
        return this.khhs_4;
    }

    @Generated
    public void jwd(boolean bl) {
        this.khhs_4 = bl;
    }

    @Generated
    public boolean taa_3() {
        return this.khss_3;
    }

    @Generated
    public boolean dzw_3() {
        return this.str_3;
    }

    private static boolean dts_5(ghgh ghgh2) {
        return ghgh2.dhma_2.tssh_2() == 0.0f && !ghgh2.rla;
    }

    private static String[] pae9q48x3q1ntz(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite fbdgkfrw9g1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ls5hg52nrg6ee ^ string.hashCode() ^ n2 + g5b2dkiduc6 ^ i * -281987567 ^ ls5hg52nrg6ee, 10) ^ g5b2dkiduc6));
            }
            String[] stringArray = br.pae9q48x3q1ntz(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

