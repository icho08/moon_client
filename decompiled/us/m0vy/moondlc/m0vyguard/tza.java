/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthth;
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.ttht_2;
import us.m0vy.moondlc.m0vyguard.tthn;
import us.m0vy.moondlc.m0vyguard.tdl;
import us.m0vy.moondlc.m0vyguard.tr;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.zq;
import us.m0vy.moondlc.m0vyguard.sgh;
import us.m0vy.moondlc.m0vyguard.sm;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.nr_2;
import us.m0vy.moondlc.m0vyguard.nt_3;
import us.movy.moondlc.Moondlc;

public class tza
extends nt_3 {
    private final fa_2 jst_2 = new fa_2(300L, 0.0f, jkh.shhj);
    private final fa_2 ln = new fa_2(300L, 0.0f, jkh.dzb);
    private final List shas_3 = new ArrayList();
    private boolean zdsh_2;
    private final float hhn;
    private Runnable zbdh = tza::dh_2;
    private boolean thakh;
    private static final int vzqbbrdz6c77 = -1933571369;
    private static final int oba7lf4xmak2 = 1673074378;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jr213814mh;

    public tza(float f, float f2) {
        this(f, f2, 90.0f);
    }

    public tza(float f, float f2, float f3) {
        this(f, f2, f3, 2.0f);
    }

    public tza(float f, float f2, float f3, float f4) {
        this.sdht_2 = f;
        this.shat_2 = f2;
        this.zshl = f3;
        this.hhn = f4;
        this.zdsh_2 = true;
    }

    @Override
    protected void bws_2(bzth bzth2) {
        this.jst_2.dam_2(this.zdsh_2 ? jkh.hd_2 : jkh.hthd);
        this.jst_2.ddt_6(this.zdsh_2);
        this.ln.ddt_6(this.jst_2.tssh_2() >= 0.6f);
        this.zqkh = 0.0f;
        for (Object object : this.shas_3) {
            ((nt_3)object).amf(this.sdht_2, this.shat_2 + this.zqkh, this.zshl, 0.0f);
            this.zqkh += ((nt_3)object).jfn() + 0.5f;
        }
        this.zqkh += 2.0f;
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)Math.min(1.0f, this.jst_2.tssh_2()));
        shk_3.bdhkh(bzth2.getContext(), this.sdht_2 + this.zshl / this.hhn, this.shat_2 + this.zqkh / this.hhn, 0.5f + this.jst_2.tssh_2() * 0.5f);
        bzth2.drawShadow(this.sdht_2, this.shat_2, this.zshl, this.zqkh, 15.0f, zth_8.all(6.0f), byq.dhww.tkhl_2(127.5f));
        if (sgh.dfs()) {
            bzth2.drawBlurredRect(this.sdht_2, this.shat_2, this.zshl, this.zqkh, 45.0f, 7.0f, zth_8.all(6.0f), byq.brz_2.tkhl_2(255.0f * this.jst_2.tssh_2() * sgh.tqa()));
        }
        if (sgh.drgh()) {
            bzth2.drawLiquidGlass(this.sdht_2, this.shat_2, this.zshl, this.zqkh, 7.0f, 0.08f, zth_8.all(6.0f), byq.brz_2.tkhl_2(255.0f * this.jst_2.tssh_2() * sgh.swk_2()));
        }
        boolean bl = Moondlc.getInstance().getThemeManager().zskh_2() == tthn.jthj;
        bzth2.drawSquircle(this.sdht_2, this.shat_2, this.zshl, this.zqkh, 7.0f, zth_8.all(6.0f), bhj_2.khhy_2().tkhl_2(255.0f * (bl ? 0.8f - 0.6f * sgh.swk_2() : 0.7f)));
        for (nt_3 nt2 : this.shas_3) {
            int n = this.shas_3.indexOf(nt2);
            if (n != 0 && !(nt2 instanceof ttht_2) && !(this.shas_3.get(n - 1) instanceof ttht_2)) {
                float f = 0.5f;
                bzth2.drawRect(this.sdht_2, nt2.stk() - 1.0f, this.zshl, f, bhj_2.bzs().tkhl_2(5.1f));
            }
            nt2.dhtz(bzth2);
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)this.jst_2.tssh_2());
        }
        shk_3.hbj(bzth2.getContext());
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public tza zta_3(nt_3 nt2) {
        this.shas_3.add(nt2);
        return this;
    }

    public tza ghshh(String string) {
        this.shas_3.add(new nr_2(string));
        return this;
    }

    public tza ahd(String string) {
        this.shas_3.add(new tthth(string));
        return this;
    }

    public tza thsd_2() {
        this.shas_3.add(new ttht_2());
        return this;
    }

    public tza atf(String string, boolean bl) {
        this.shas_3.add(new sm(string).jja_2(bl));
        return this;
    }

    public tza dhsk(String string, boolean bl, tr tr2) {
        this.shas_3.add(new sm(string).jja_2(bl).hqt_2(tr2));
        return this;
    }

    public tza hsa_3(String string, String string2, tdl tdl2) {
        this.shas_3.add(new zq(this, string, string2, tdl2));
        return this;
    }

    public tza sghs_4(Runnable runnable) {
        this.zbdh = runnable;
        return this;
    }

    public void dhat_2(boolean bl) {
        this.zdsh_2 = bl;
        if (!bl && !this.thakh) {
            this.zbdh.run();
            this.thakh = true;
        }
    }

    @Override
    public void dh_4(double d, double d2, tthdh tthdh2) {
        for (nt_3 nt2 : this.shas_3) {
            nt2.dh_4(d, d2, tthdh2);
        }
        super.dh_4(d, d2, tthdh2);
    }

    @Override
    public void tbkh(double d, double d2, tthdh tthdh2) {
        for (nt_3 nt2 : this.shas_3) {
            nt2.tbkh(d, d2, tthdh2);
        }
        super.tbkh(d, d2, tthdh2);
    }

    @Override
    public void dhhw_2(double d, double d2, double d3, double d4) {
        for (nt_3 nt2 : this.shas_3) {
            nt2.dhhw_2(d, d2, d3, d4);
        }
        super.dhhw_2(d, d2, d3, d4);
    }

    @Override
    public void bry(int n, int n2, int n3) {
        for (nt_3 nt2 : this.shas_3) {
            nt2.bry(n, n2, n3);
        }
        super.bry(n, n2, n3);
    }

    @Override
    public boolean thtt_3(char c, int n) {
        for (nt_3 nt2 : this.shas_3) {
            nt2.thtt_3(c, n);
        }
        return super.thtt_3(c, n);
    }

    @Generated
    public fa_2 ghdf_2() {
        return this.jst_2;
    }

    @Generated
    public boolean ththk() {
        return this.zdsh_2;
    }

    private static void dh_2() {
    }

    private static String[] elj1c3het9fa(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite eej7sxnjepyr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ vzqbbrdz6c77 ^ string.hashCode() ^ n2 + oba7lf4xmak2 ^ i * -1578108125 ^ vzqbbrdz6c77, 19) ^ oba7lf4xmak2));
            }
            String[] stringArray = tza.elj1c3het9fa(new String(cArray));
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

