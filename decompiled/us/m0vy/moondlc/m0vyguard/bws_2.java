/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1044
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import dev.redstones.mediaplayerinfo.IMediaSession;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_1044;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bdm;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.btd_3;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.qd_2;
import us.m0vy.moondlc.m0vyguard.la;
import us.m0vy.moondlc.m0vyguard.lq;
import us.movy.moondlc.Moondlc;

public class bws_2
extends bqt {
    private static final float jzm_2 = 138.0f;
    private static final float khfkh = 70.0f;
    private static final float sghr = 54.0f;
    private static final float dda = 38.0f;
    private static final float dmy = 6.5f;
    private static final float dhdhf = 6.5f;
    private static final float tla = 49.0f;
    private static final float tqa = 7.6f;
    private static final float rny = 6.2f;
    private static final float dshz_2 = 5.8f;
    private static final float khqf = 2.4f;
    private final bjz dhkf = new bjz();
    private final bjz rzgh_2 = new bjz();
    private final bjz tra = new bjz();
    private la rwkh;
    private long shbn;
    private boolean rthdh;
    private float sdhh = 0.0f;
    private final ra_2 khqq;
    private final ra_2 shz_6;
    private final ra_2 dsa_4;
    private final tdj hra;
    private static final int t82whxz4awbm = -1042349365;
    private static final int btfo12huxv = -1354923020;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int flccutfekoc;

    public bws_2() {
        super(0.0f, 7.0f);
        this.khta_3().setWidth(138.0f);
        this.khta_3().setHeight(70.0f);
        this.dhkf.shh(150L);
        this.rzgh_2.shh(150L);
        this.tra.shh(150L);
        this.khqq = new ra_2("Bar Layout", List.of("Bottom", "Compact"), "Bottom");
        this.shz_6 = new ra_2("Progress Bar", List.of("Enabled", "Disabled"), "Enabled");
        this.dsa_4 = new ra_2("Time Display", List.of("Enabled", "Disabled"), "Enabled");
        this.hra = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
        this.hra.tyt_3(this::jdgh_2);
        this.rght(this.khqq);
        this.rght(this.shz_6);
        this.rght(this.dsa_4);
        this.rght(this.hra);
        bdm.dhsl_2().jkhh_2(new lq(this::sfz));
    }

    @Override
    public String getName() {
        return "Moondlc MusicBar";
    }

    @Override
    public void lh(class_4587 class_45872) {
        la la2;
        IMediaSession iMediaSession;
        la la3 = null;
        qd_2 qd2_2 = Moondlc.getInstance().getMusicTracker();
        if (qd2_2 != null && qd2_2.bdhl() && (iMediaSession = qd2_2.khyl()) != null) {
            la3 = new la();
            la3.hyd = iMediaSession.getMedia().getTitle();
            la3.rjd = iMediaSession.getMedia().getArtist();
            la3.shkhm = iMediaSession;
        }
        if (la3 == null && this.tthy()) {
            la3 = new la();
            la3.hyd = "Not Playing";
            la3.rjd = "No Track Info";
        }
        boolean bl = la3 != null;
        float f = this.awd_2();
        float f2 = this.bhh_3(bl, f);
        if (bl) {
            this.rwkh = la3;
        } else if (!this.tdha_2()) {
            this.rwkh = null;
            return;
        }
        la la4 = la2 = bl ? la3 : this.rwkh;
        if (la2 == null) {
            return;
        }
        double d = bws_2.mc.field_1729.method_1603() * (double)mc.method_22683().method_4486() / (double)mc.method_22683().method_4480();
        double d2 = bws_2.mc.field_1729.method_1604() * (double)mc.method_22683().method_4502() / (double)mc.method_22683().method_4507();
        float f3 = this.khta_3().getScale();
        double d3 = d;
        double d4 = d2;
        if (f3 != 0.0f) {
            d3 = (double)this.khta_3().getX() + (d - (double)this.khta_3().getX()) / (double)f3;
            d4 = (double)this.khta_3().getY() + (d2 - (double)this.khta_3().getY()) / (double)f3;
        }
        float f4 = Math.max(0.0f, this.zfj_2(this.khta_3().getX()));
        float f5 = this.zfj_2(this.khta_3().getY());
        if (f5 < 0.0f) {
            f5 = 7.0f;
        }
        this.sdhh = this.khhs_3(this.sdhh, this.khqq.thnth("Compact") ? 1.0f : 0.0f, f, 12.0f);
        float f6 = 70.0f * (1.0f - this.sdhh) + 54.0f * this.sdhh;
        class_45872.method_22903();
        float f7 = 0.92f + 0.08f * f2;
        class_45872.method_46416(f4 + 69.0f, f5 + f6 / 2.0f, 0.0f);
        class_45872.method_22905(f7, f7, 1.0f);
        class_45872.method_46416(-(f4 + 69.0f), -(f5 + f6 / 2.0f), 0.0f);
        tbkh.bsdh_2(class_45872, f4, f5, 138.0f, f6, f2, 8.0f);
        tbkh.ja_2(class_45872, f4, f5, 138.0f, f6, 8.0f, 0.2f, f2);
        this.rdz_3(class_45872, la2, f4 + 6.5f, f5 + 6.5f, f2);
        this.rdhw(class_45872, la2, f4, f5, f2);
        this.khshs_2(class_45872, la2, f4, f5, d3, d4, f2);
        this.zfd(class_45872, la2, f4, f5, f2);
        class_45872.method_22909();
        this.khta_3().setWidth(138.0f);
        this.khta_3().setHeight(f6);
    }

    private void hlw() {
        IMediaSession iMediaSession;
        bza_4 bza2_2 = bza_4.thtsh_2();
        if (!(bza2_2 != null && bza2_2.rgha_2() && bza2_2.thaz() && this.tat_2())) {
            return;
        }
        la la2 = null;
        qd_2 qd2_2 = Moondlc.getInstance().getMusicTracker();
        if (qd2_2 != null && qd2_2.bdhl() && (iMediaSession = qd2_2.khyl()) != null) {
            la2 = new la();
            la2.hyd = iMediaSession.getMedia().getTitle();
            la2.rjd = iMediaSession.getMedia().getArtist();
            la2.shkhm = iMediaSession;
        }
        if (la2 == null || la2.shkhm == null) {
            return;
        }
        iMediaSession = la2;
        double d = bws_2.mc.field_1729.method_1603() * (double)mc.method_22683().method_4486() / (double)mc.method_22683().method_4480();
        double d2 = bws_2.mc.field_1729.method_1604() * (double)mc.method_22683().method_4502() / (double)mc.method_22683().method_4507();
        float f = this.khta_3().getScale();
        double d3 = d;
        double d4 = d2;
        if (f != 0.0f) {
            d3 = (double)this.khta_3().getX() + (d - (double)this.khta_3().getX()) / (double)f;
            d4 = (double)this.khta_3().getY() + (d2 - (double)this.khta_3().getY()) / (double)f;
        }
        float f2 = Math.max(0.0f, this.khta_3().getX());
        float f3 = this.khta_3().getY() < 0.0f ? 7.0f : this.khta_3().getY();
        float f4 = f2 + 49.0f + 39.5f;
        float f5 = f4 - 18.0f;
        float f6 = f4;
        float f7 = f4 + 18.0f;
        float f8 = 7.0f;
        float f9 = f3 + 40.0f * (1.0f - this.sdhh) + 33.0f * this.sdhh;
        if (this.thbz_2(d3, d4, f5 - f8, f9 - f8, f8 * 2.0f, f8 * 2.0f)) {
            CompletableFuture.runAsync(() -> bws_2.thtq_2((la)((Object)iMediaSession)));
        } else if (this.thbz_2(d3, d4, f6 - f8, f9 - f8, f8 * 2.0f, f8 * 2.0f)) {
            CompletableFuture.runAsync(() -> this.jtw((la)((Object)iMediaSession)));
            if (System.currentTimeMillis() - this.shbn > 1500L) {
                this.rthdh = !((la)((Object)iMediaSession)).shkhm.getMedia().isPlaying();
                this.shbn = System.currentTimeMillis();
            } else {
                this.rthdh = !this.rthdh;
            }
        } else if (this.thbz_2(d3, d4, f7 - f8, f9 - f8, f8 * 2.0f, f8 * 2.0f)) {
            CompletableFuture.runAsync(() -> bws_2.jft((la)((Object)iMediaSession)));
        }
    }

    private void rdz_3(class_4587 class_45872, la la2, float f, float f2, float f3) {
        class_1044 class_10443 = la2.rkht_2();
        if (class_10443 != null) {
            bjgh.shsf_2.da_4(class_45872, f, f2, 38.0f, 38.0f, 5.0f, new Color(255, 255, 255, Math.round(255.0f * f3)), 0.0f, 0.0f, 1.0f, 1.0f, class_10443.method_4624());
        } else {
            Color color = bas_4.zsz_4();
            bjgh.jghs.hrj(class_45872, f, f2, 38.0f, 38.0f, 5.0f, new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(42.0f * f3)));
        }
    }

    private void rdhw(class_4587 class_45872, la la2, float f, float f2, float f3) {
        bsh_2 bsh2 = brz_2.shjh_2;
        bsh_2 bsh3 = brz_2.shthm;
        float f4 = 79.0f;
        String string = la2.hyd == null ? "Oczekiwanie..." : la2.hyd;
        String string2 = la2.rjd == null ? "" : la2.rjd;
        float f5 = f2 + 10.0f * (1.0f - this.sdhh) + 8.0f * this.sdhh;
        bsh2.zskh_4(class_45872, this.jzt_2(bsh2, string, 7.6f, f4), f + 49.0f, f5, 7.6f, tbkh.hkdh(f3), 0.0f);
        if (!string2.isEmpty()) {
            float f6 = f2 + 22.0f * (1.0f - this.sdhh) + 18.0f * this.sdhh;
            bsh3.zskh_4(class_45872, this.jzt_2(bsh3, string2, 6.2f, f4), f + 49.0f, f6, 6.2f, tbkh.thty_2(0.86f * f3), 0.0f);
        }
    }

    private void khshs_2(class_4587 class_45872, la la2, float f, float f2, double d, double d2, float f3) {
        bsh_2 bsh2 = brz_2.jhw_2;
        boolean bl = la2.shkhm != null && la2.shkhm.getMedia().isPlaying();
        boolean bl2 = System.currentTimeMillis() - this.shbn < 1500L ? this.rthdh : bl;
        float f4 = f + 49.0f + 39.5f;
        float f5 = f4 - 18.0f;
        float f6 = f4;
        float f7 = f4 + 18.0f;
        float f8 = 7.0f;
        float f9 = f2 + 38.0f * (1.0f - this.sdhh) + 32.0f * this.sdhh;
        this.tra.bghkh(this.thbz_2(d, d2, f5 - f8, f9 - f8, f8 * 2.0f, f8 * 2.0f) ? 1.0f : 0.0f, 150L, tbm.hrkh);
        this.dhkf.bghkh(this.thbz_2(d, d2, f6 - f8, f9 - f8, f8 * 2.0f, f8 * 2.0f) ? 1.0f : 0.0f, 150L, tbm.hrkh);
        this.rzgh_2.bghkh(this.thbz_2(d, d2, f7 - f8, f9 - f8, f8 * 2.0f, f8 * 2.0f) ? 1.0f : 0.0f, 150L, tbm.hrkh);
        this.tra.ddhdh();
        this.dhkf.ddhdh();
        this.rzgh_2.ddhdh();
        this.dqt_2(class_45872, bsh2, "K", f5, f9, 8.0f + (float)this.tra.khbk(), f3, 0.82f + 0.18f * (float)this.tra.khbk());
        this.dqt_2(class_45872, bsh2, bl2 ? "O" : "I", f6, f9, 10.0f + (float)this.dhkf.khbk(), f3, 0.92f + 0.08f * (float)this.dhkf.khbk());
        this.dqt_2(class_45872, bsh2, "L", f7, f9, 8.0f + (float)this.rzgh_2.khbk(), f3, 0.82f + 0.18f * (float)this.rzgh_2.khbk());
    }

    private void zfd(class_4587 class_45872, la la2, float f, float f2, float f3) {
        boolean bl = this.shz_6.thnth("Enabled");
        boolean bl2 = this.dsa_4.thnth("Enabled");
        if (!bl && !bl2) {
            return;
        }
        long l = la2.shkhm != null ? la2.shkhm.getMedia().getPosition() : 0L;
        long l2 = la2.shkhm != null ? la2.shkhm.getMedia().getDuration() : 0L;
        float f4 = l2 > 0L ? Math.max(0.0f, Math.min(1.0f, (float)l / (float)l2)) : 0.0f;
        float f5 = f + 10.0f;
        float f6 = 118.0f;
        float f7 = f2 + 62.5f;
        float f8 = f + 49.0f;
        float f9 = 79.0f;
        float f10 = f2 + 44.0f;
        float f11 = f5 * (1.0f - this.sdhh) + f8 * this.sdhh;
        float f12 = f6 * (1.0f - this.sdhh) + f9 * this.sdhh;
        float f13 = f7 * (1.0f - this.sdhh) + f10 * this.sdhh;
        if (bl2 && this.sdhh < 0.5f) {
            float f14 = f3 * (1.0f - this.sdhh * 2.0f);
            this.ghgh().zskh_4(class_45872, this.ath_3(l), f11, f2 + 54.5f, 5.8f, bas_4.tdth_2(Math.round(230.0f * f14)), 0.0f);
            String string = this.ath_3(l2);
            this.ghgh().zskh_4(class_45872, string, f11 + f12 - this.ghgh().shdf_2(string, 5.8f), f2 + 54.5f, 5.8f, bas_4.tdth_2(Math.round(170.0f * f14)), 0.0f);
        }
        if (bl) {
            Color color = bas_4.zsz_4();
            bjgh.jghs.hrj(class_45872, f11, f13, f12, 2.4f, 1.2f, new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(56.0f * f3)));
            bjgh.jghs.hrj(class_45872, f11, f13, f12 * f4, 2.4f, 1.2f, bas_4.tdth_2(Math.round(245.0f * f3)));
        }
    }

    private void dqt_2(class_4587 class_45872, bsh_2 bsh2, String string, float f, float f2, float f3, float f4, float f5) {
        bsh2.sjw_2(class_45872, string, f, f2 - f3 / 2.0f + 0.75f, f3, new Color(255, 255, 255, Math.round(255.0f * f4 * f5)), 0.0f);
    }

    private boolean thbz_2(double d, double d2, float f, float f2, float f3, float f4) {
        return d >= (double)f && d <= (double)(f + f3) && d2 >= (double)f2 && d2 <= (double)(f2 + f4);
    }

    private String ath_3(long l) {
        long l2 = l % 3600L;
        long l3 = l2 / 60L;
        long l4 = l2 % 60L;
        return String.format("%d:%02d", l3, l4);
    }

    private static void jft(la la2) {
        la2.shkhm.next();
    }

    private void jtw(la la2) {
        boolean bl = la2.shkhm.getMedia().isPlaying();
        la2.shkhm.playPause();
        this.shbn = System.currentTimeMillis();
        this.rthdh = !bl;
    }

    private static void thtq_2(la la2) {
        la2.shkhm.previous();
    }

    private void sfz(btd_3 btd2) {
        if (btd2.mouse() && btd2.action() == 1 && btd2.key() == 0) {
            this.hlw();
        }
    }

    private void jdgh_2(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] do5wmz9dp784(String string) {
        return string.split("\u0003\u0013", -1);
    }

    private static CallSite m31tlvb853byg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ t82whxz4awbm ^ string.hashCode()) + (n2 + btfo12huxv) + i ^ t82whxz4awbm, 13) + btfo12huxv);
            }
            String[] stringArray = bws_2.do5wmz9dp784(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

