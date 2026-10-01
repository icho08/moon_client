/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_7833
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_7833;
import us.m0vy.moondlc.m0vyguard.bhh;
import us.m0vy.moondlc.m0vyguard.bhm;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bsd_3;
import us.m0vy.moondlc.m0vyguard.bzdh_2;
import us.m0vy.moondlc.m0vyguard.bay_2;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bnn;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.tkhd;
import us.m0vy.moondlc.m0vyguard.tra;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.zw;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.zy_2;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.nt_3;

public class bdk_2
extends nt_3 {
    private static final float hthsh = 168.0f;
    private static final float dtsh_2 = 94.0f;
    private static final float bkkh = 25.0f;
    private static final float bzgh_2 = 6.0f;
    private static final byq hnn;
    private static final byq daz;
    private static final byq szm_2;
    private static final byq srd;
    private static final byq zghth;
    private static final byq rbn;
    private static final byq bsh_4;
    private static final byq khht_3;
    private static final byq tad_3;
    private static final byq rdh_3;
    private static final byq thshq;
    private final bsd_3 tdm_2;
    private final fa_2 tts_3;
    private final fa_2 jtd_3;
    private final fa_2 hadh_2;
    private boolean jld_2 = true;
    private boolean khbs = false;
    private boolean rdk = false;
    private boolean bshw = false;
    private boolean dla_2;
    private float khhy_2;
    private float shfq;
    private static final int vxutw27cga = -929358670;
    private static final int uj7rqo8fx = 17074711;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ocw17lyiq8;

    public bdk_2(bsd_3 bsd2_2, float f, float f2) {
        this.tdm_2 = bsd2_2;
        this.sdht_2 = f;
        this.shat_2 = f2;
        this.zshl = 168.0f;
        this.zqkh = 94.0f;
        this.tts_3 = new fa_2(260L, 0.0f, jkh.tb);
        this.jtd_3 = new fa_2(280L, 0.0f, jkh.tb);
        this.hadh_2 = new fa_2(220L, bsd2_2.zhz_7().rgha_2() ? 1.0f : 0.0f, jkh.tb);
    }

    @Override
    protected void bws_2(bzth bzth2) {
        float f;
        float f2;
        boolean bl = tkhd.getCurrentScreen() != null;
        bnn bnn2 = bnn.dzb_2();
        this.tts_3.zkhdh((long)bnn2.art());
        this.tts_3.ddt_6(this.jld_2 && bl);
        this.jtd_3.khmf(this.khbs ? 1.0f : 0.0f);
        this.hadh_2.ddt_6(this.tdm_2.zhz_7().rgha_2());
        if (this.dla_2) {
            this.sdht_2 = (float)bzth2.getMouseX() - this.khhy_2;
            this.shat_2 = (float)bzth2.getMouseY() - this.shfq;
        }
        if ((f2 = Math.min(1.0f, this.tts_3.tssh_2())) <= 0.01f) {
            return;
        }
        this.zqkh = f = tra.thn_3(94.0, 25.0, this.jtd_3.tssh_2());
        float f3 = this.sdht_2;
        float f4 = this.shat_2;
        bzth2.pushMatrix();
        float f5 = 0.85f + 0.15f * f2;
        if (bnn2.zks_4() == zy_2.ty_2) {
            float f6 = (1.0f - f2) * -18.0f;
            float f7 = (1.0f - f2) * 10.0f;
            bzth2.method_51448().method_46416(f3 + 84.0f, f4 + f / 2.0f, 0.0f);
            bzth2.method_51448().method_22907(class_7833.field_40716.rotationDegrees(f6));
            bzth2.method_51448().method_22907(class_7833.field_40714.rotationDegrees(f7));
            bzth2.method_51448().method_22905(f5, f5, 1.0f);
            bzth2.method_51448().method_46416(-(f3 + 84.0f), -(f4 + f / 2.0f), 0.0f);
        } else {
            shk_3.bdhkh(bzth2.method_51448(), f3 + 84.0f, f4 + f / 2.0f, f5);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
        boolean bl2 = bnn.dzb_2().ghdt();
        byq byq2 = bl2 ? new byq(9.0f, 9.0f, 9.0f, 255.0f) : hnn;
        byq byq3 = bl2 ? bhj_2.rrd : szm_2;
        byq byq4 = bl2 ? new byq(161.0f, 161.0f, 170.0f, 255.0f) : srd;
        byq byq5 = bl2 ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : daz;
        byq byq6 = bl2 ? new byq(20.0f, 20.0f, 20.0f, 255.0f) : thshq;
        byq byq7 = bl2 ? new byq(32.0f, 32.0f, 32.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
        bzth2.drawShadow(f3, f4, 168.0f, f, 16.0f, zth_8.all(6.0f), bhj_2.bdhj.thzz_4((bl2 ? 0.35f : 0.16f) * f2));
        bzth2.drawRoundedRect(f3, f4, 168.0f, f, zth_8.all(6.0f), byq2.thzz_4(f2));
        if (!bl2) {
            bzth2.drawRoundedBorder(f3, f4, 168.0f, f, 0.18f, zth_8.all(6.0f), byq5.thzz_4(f2));
        }
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), this.tdm_2.zhz_7().getName(), f3 + 10.0f, f4 + 8.5f + 1.0f, byq3.thzz_4(f2));
        float f8 = this.hadh_2.tssh_2();
        float f9 = f3 + 168.0f - 44.0f;
        float f10 = f4 + 7.0f;
        byq byq8 = bnn.dzb_2().dhdhk(f3);
        byq byq9 = bl2 ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : zghth;
        bzth2.drawRoundedRect(f9, f10, 20.0f, 11.0f, zth_8.all(5.5f), byq9.dkhw_2(byq8, f8).thzz_4(f2));
        float f11 = f9 + 1.0f + 9.0f * f8;
        byq byq10 = bl2 ? (f8 > 0.5f ? bhj_2.rrd : new byq(12.0f, 12.0f, 12.0f, 255.0f)) : bhj_2.rrd;
        bzth2.drawRoundedRect(f11, f10 + 1.0f, 9.0f, 9.0f, zth_8.all(4.5f), byq10.thzz_4(f2));
        float f12 = f3 + 168.0f - 19.0f;
        float f13 = f3 + 168.0f - 9.5f;
        float f14 = f4 + 9.0f;
        bzth2.drawRoundedRect(f12, f14, 7.0f, 7.0f, zth_8.all(3.5f), bsh_4.thzz_4(f2));
        bzth2.drawRoundedRect(f13, f14, 7.0f, 7.0f, zth_8.all(3.5f), khht_3.thzz_4(f2));
        if (bhh.zzy_3(f12, f14, 7.0, 7.0, bzth2) || bhh.zzy_3(f13, f14, 7.0, 7.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        if (f > 27.0f) {
            bhm.dar_2(bzth2.method_51448(), f3, f4 + 25.0f, 168.0f, f - 25.0f);
            bzth2.drawRect(f3, f4 + 25.0f, 168.0f, 0.5f, byq5.thzz_4(f2));
            int n = this.tdm_2.zhz_7().thaf();
            String string = this.rdk ? "Press key..." : (n == -1 ? "n/a" : bzdh_2.ddhn_2(n));
            float f15 = f4 + 25.0f + 4.0f;
            bzth2.drawText(bmn.shzth.twy_2(7.0f), "Keybind", f3 + 10.0f, f15 + 3.0f, byq4.thzz_4(f2));
            bzth2.drawRoundedRect(f3 + 168.0f - 46.0f, f15 + 1.0f, 36.0f, 13.0f, zth_8.all(4.0f), tad_3.thzz_4(f2));
            bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), string, f3 + 168.0f - 28.0f, f15 + 3.5f, bhj_2.rrd.thzz_4(f2));
            float f16 = f15 + 18.0f;
            bzth2.drawRect(f3, f16, 168.0f, 0.5f, byq5.thzz_4(f2));
            bzth2.drawText(bmn.shzth.twy_2(7.0f), "Mode", f3 + 10.0f, f16 + 6.0f, byq4.thzz_4(f2));
            boolean bl3 = bhh.zzy_3((double)(f3 + 168.0f) - 84.0, (double)f16 + 3.0, 36.0, 13.0, bzth2);
            bzth2.drawRoundedRect(f3 + 168.0f - 84.0f, f16 + 3.0f, 36.0f, 13.0f, zth_8.all(4.0f), (this.bshw ? rdh_3 : (bl3 ? byq7 : byq6)).thzz_4(f2));
            bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), "Hold", f3 + 168.0f - 66.0f, f16 + 5.5f, (this.bshw ? bhj_2.rrd : byq3).thzz_4(f2));
            boolean bl4 = bhh.zzy_3((double)(f3 + 168.0f) - 45.0, (double)f16 + 3.0, 36.0, 13.0, bzth2);
            bzth2.drawRoundedRect(f3 + 168.0f - 45.0f, f16 + 3.0f, 36.0f, 13.0f, zth_8.all(4.0f), (!this.bshw ? rdh_3 : (bl4 ? byq7 : byq6)).thzz_4(f2));
            bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), "Toggle", f3 + 168.0f - 27.0f, f16 + 5.5f, (!this.bshw ? bhj_2.rrd : byq3).thzz_4(f2));
            float f17 = f16 + 20.0f;
            bzth2.drawRect(f3, f17, 168.0f, 0.5f, byq5.thzz_4(f2));
            bzth2.drawText(bmn.shzth.twy_2(5.5f), "Middle-click → toggle floatie", f3 + 10.0f, f17 + 5.0f, byq4.thzz_4(f2));
            bhm.sdhsh_2();
        }
        bzth2.popMatrix();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    @Override
    public void dh_4(double d, double d2, tthdh tthdh2) {
        float f = this.shat_2 + 9.0f;
        if (bhh.thsb_2((double)(this.sdht_2 + 168.0f) - 19.0, f, 7.0, 7.0, d, d2)) {
            this.khbs = !this.khbs;
            return;
        }
        if (bhh.thsb_2((double)(this.sdht_2 + 168.0f) - 9.5, f, 7.0, 7.0, d, d2)) {
            this.jld_2 = false;
            return;
        }
        float f2 = this.sdht_2 + 168.0f - 44.0f;
        float f3 = this.shat_2 + 7.0f;
        if (bhh.thsb_2(f2, f3, 20.0, 11.0, d, d2) && tthdh2 == tthdh.tdha_2) {
            this.tdm_2.zhz_7().dwkh();
            return;
        }
        if (!this.khbs) {
            float f4 = this.shat_2 + 25.0f + 4.0f;
            if (bhh.thsb_2((double)(this.sdht_2 + 168.0f) - 46.0, (double)f4 + 1.0, 36.0, 13.0, d, d2)) {
                this.rdk = true;
                return;
            }
            float f5 = f4 + 18.0f;
            if (bhh.thsb_2((double)(this.sdht_2 + 168.0f) - 84.0, (double)f5 + 3.0, 36.0, 13.0, d, d2)) {
                this.bshw = true;
                return;
            }
            if (bhh.thsb_2((double)(this.sdht_2 + 168.0f) - 45.0, (double)f5 + 3.0, 36.0, 13.0, d, d2)) {
                this.bshw = false;
                return;
            }
        }
        if (bhh.thsb_2(this.sdht_2, this.shat_2, 168.0, 25.0, d, d2)) {
            this.dla_2 = true;
            this.khhy_2 = (float)(d - (double)this.sdht_2);
            this.shfq = (float)(d2 - (double)this.shat_2);
        }
        super.dh_4(d, d2, tthdh2);
    }

    @Override
    public void tbkh(double d, double d2, tthdh tthdh2) {
        this.dla_2 = false;
        super.tbkh(d, d2, tthdh2);
    }

    @Override
    public void bry(int n, int n2, int n3) {
        if (this.rdk) {
            this.tdm_2.zhz_7().zhs_5(n == 256 || n == 261 ? -1 : n);
            this.rdk = false;
        }
        super.bry(n, n2, n3);
    }

    @Generated
    public bsd_3 ssk_3() {
        return this.tdm_2;
    }

    @Generated
    public fa_2 haa_4() {
        return this.tts_3;
    }

    @Generated
    public boolean thnn() {
        return this.jld_2;
    }

    @Generated
    public void dsw_2(boolean bl) {
        this.jld_2 = bl;
    }

    private static String[] vb9m5ixlr(String string) {
        return string.split("\u0007\u0012", -1);
    }

    private static CallSite k2clnr14om67v2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ vxutw27cga ^ string.hashCode() ^ n2 + uj7rqo8fx + i * -1315232417) + vxutw27cga) ^ uj7rqo8fx));
            }
            String[] stringArray = bdk_2.vb9m5ixlr(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

