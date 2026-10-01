/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1044
 *  net.minecraft.class_408
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
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_1044;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bdm;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.btd_3;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.baa_3;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.qd_2;
import us.m0vy.moondlc.m0vyguard.lq;
import us.movy.moondlc.Moondlc;

public class brt
extends thw_3 {
    private long dshth = 0L;
    private boolean rfq = false;
    private final bjz khzw = new bjz();
    private final bjz sthkh_2 = new bjz();
    private final bjz shaf = new bjz();
    private static final int fs8rrc0lmi3p = 801881556;
    private static final int pex0fq8 = 1275717453;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int skgxybt4;

    public brt() {
        super(0.0f, 7.0f);
        this.khta_3().setWidth(110.0f);
        this.khta_3().setHeight(45.0f);
        this.khzw.shh(150L);
        this.sthkh_2.shh(150L);
        this.shaf.shh(150L);
        bdm.dhsl_2().jkhh_2(new lq(this::khrh));
    }

    @Override
    public String getName() {
        return "MusicBar";
    }

    private void rsy() {
        float f;
        IMediaSession iMediaSession;
        baa_3 baa2_3 = null;
        qd_2 qd2_2 = Moondlc.getInstance().getMusicTracker();
        if (qd2_2 != null && qd2_2.bdhl() && (iMediaSession = qd2_2.khyl()) != null) {
            baa2_3 = new baa_3();
            baa2_3.thtsh = iMediaSession.getMedia().getTitle();
            baa2_3.khjb = iMediaSession.getMedia().getArtist();
            baa2_3.rzh = iMediaSession;
        }
        if (baa2_3 == null || baa2_3.rzh == null) {
            return;
        }
        iMediaSession = baa2_3;
        double d = brt.mc.field_1729.method_1603() * (double)mc.method_22683().method_4486() / (double)mc.method_22683().method_4480();
        double d2 = brt.mc.field_1729.method_1604() * (double)mc.method_22683().method_4502() / (double)mc.method_22683().method_4507();
        float f2 = this.khta_3().getX();
        float f3 = this.khta_3().getY();
        if (f3 < 0.0f) {
            f3 = this.ada_4(7.0f);
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float f4 = this.ada_4(110.0f);
        float f5 = this.ada_4(45.0f);
        float f6 = f2 + this.ada_4(43.0f);
        float f7 = f4 - this.ada_4(46.0f);
        float f8 = f6 + f7 / 2.0f;
        float f9 = f3 + f5 - this.ada_4(8.5f);
        float f10 = f8;
        float f11 = f8 + this.ada_4(12.0f);
        float f12 = f8 - this.ada_4(12.0f);
        if (this.hld(d, d2, f12 - (f = this.ada_4(5.0f)), f9 - f, f * 2.0f, f * 2.0f)) {
            CompletableFuture.runAsync(() -> brt.rsd_3((baa_3)((Object)iMediaSession)));
        } else if (this.hld(d, d2, f10 - f, f9 - f, f * 2.0f, f * 2.0f)) {
            CompletableFuture.runAsync(() -> this.amt_2((baa_3)((Object)iMediaSession)));
            if (System.currentTimeMillis() - this.dshth > 1500L) {
                this.rfq = !((baa_3)((Object)iMediaSession)).rzh.getMedia().isPlaying();
                this.dshth = System.currentTimeMillis();
            } else {
                this.rfq = !this.rfq;
            }
        } else if (this.hld(d, d2, f11 - f, f9 - f, f * 2.0f, f * 2.0f)) {
            CompletableFuture.runAsync(() -> brt.dmt((baa_3)((Object)iMediaSession)));
        }
    }

    private boolean hld(double d, double d2, float f, float f2, float f3, float f4) {
        return d >= (double)f && d <= (double)(f + f3) && d2 >= (double)f2 && d2 <= (double)(f2 + f4);
    }

    @Override
    public void lh(class_4587 class_45872) {
        boolean bl;
        IMediaSession iMediaSession;
        if (bza_4.thtsh_2() != null && !bza_4.thtsh_2().rgha_2()) {
            return;
        }
        qd_2 qd2_2 = Moondlc.getInstance().getMusicTracker();
        baa_3 baa2_3 = null;
        if (qd2_2 != null && qd2_2.bdhl() && (iMediaSession = qd2_2.khyl()) != null) {
            baa2_3 = new baa_3();
            baa2_3.thtsh = iMediaSession.getMedia().getTitle();
            baa2_3.khjb = iMediaSession.getMedia().getArtist();
            baa2_3.rzh = iMediaSession;
        }
        if (baa2_3 == null && brt.mc.field_1755 instanceof class_408) {
            baa2_3 = new baa_3();
            baa2_3.thtsh = "Not Playing";
            baa2_3.khjb = "No Track Info";
        }
        if (baa2_3 == null) {
            return;
        }
        double d = brt.mc.field_1729.method_1603() * (double)mc.method_22683().method_4486() / (double)mc.method_22683().method_4480();
        double d2 = brt.mc.field_1729.method_1604() * (double)mc.method_22683().method_4502() / (double)mc.method_22683().method_4507();
        float f = this.khta_3().getX();
        float f2 = this.khta_3().getY();
        if (f2 < 0.0f) {
            f2 = this.ada_4(7.0f);
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = this.ada_4(110.0f);
        float f4 = this.ada_4(45.0f);
        this.khta_3().setWidth(110.0f);
        this.khta_3().setHeight(45.0f);
        Color color = new Color(14, 14, 16, 255);
        bjgh.jghs.hrj(class_45872, f, f2, f3, f4, this.ada_4(6.0f), color);
        String string = baa2_3.thtsh == null ? "Oczekiwanie..." : baa2_3.thtsh;
        String string2 = baa2_3.khjb == null ? "" : baa2_3.khjb;
        class_1044 class_10443 = baa2_3.thhgh();
        bsh_2 bsh2 = brz_2.shjh_2;
        bsh_2 bsh3 = brz_2.shthm;
        bsh_2 bsh4 = brz_2.btd_2;
        bsh_2 bsh5 = brz_2.jhw_2;
        float f5 = f + this.ada_4(5.0f);
        float f6 = f2 + this.ada_4(5.0f);
        float f7 = this.ada_4(35.0f);
        if (class_10443 != null) {
            bjgh.shsf_2.da_4(class_45872, f5, f6, f7, f7, this.ada_4(4.0f), Color.WHITE, 0.0f, 0.0f, 1.0f, 1.0f, class_10443.method_4624());
        } else {
            bjgh.jghs.hrj(class_45872, f5, f6, f7, f7, this.ada_4(4.0f), new Color(45, 45, 45));
        }
        float f8 = f + this.ada_4(43.0f);
        float f9 = f3 - this.ada_4(46.0f);
        Object object = string;
        if (bsh2.shdf_2((String)object, this.ada_4(6.5f)) > f9) {
            while (((String)object).length() > 3 && bsh2.shdf_2((String)object + "...", this.ada_4(6.5f)) > f9) {
                object = ((String)object).substring(0, ((String)object).length() - 1);
            }
            object = (String)object + "...";
        }
        bsh2.zskh_4(class_45872, (String)object, f8, f2 + this.ada_4(5.0f), this.ada_4(6.5f), Color.WHITE, 0.0f);
        if (!string2.isEmpty()) {
            Object object2 = string2;
            if (bsh3.shdf_2((String)object2, this.ada_4(5.0f)) > f9) {
                while (((String)object2).length() > 3 && bsh3.shdf_2((String)object2 + "...", this.ada_4(5.0f)) > f9) {
                    object2 = ((String)object2).substring(0, ((String)object2).length() - 1);
                }
                object2 = (String)object2 + "...";
            }
            bsh3.zskh_4(class_45872, (String)object2, f8, f2 + this.ada_4(14.0f), this.ada_4(5.0f), new Color(177, 177, 177), 0.0f);
        }
        long l = baa2_3.rzh != null ? baa2_3.rzh.getMedia().getPosition() : 0L;
        long l2 = baa2_3.rzh != null ? baa2_3.rzh.getMedia().getDuration() : 0L;
        float f10 = l2 > 0L ? (float)((double)l / (double)l2) : 0.0f;
        float f11 = f8;
        float f12 = f2 + f4 - this.ada_4(15.0f);
        float f13 = f3 - this.ada_4(46.0f);
        float f14 = this.ada_4(3.0f);
        Color color2 = bas_4.tdth_2(255);
        bjgh.jghs.hrj(class_45872, f11, f12, f13, f14, this.ada_4(1.5f), new Color(45, 45, 45));
        bjgh.jghs.hrj(class_45872, f11, f12, f13 * f10, f14, this.ada_4(1.5f), color2);
        String string3 = this.hnl(l);
        String string4 = this.hnl(l2);
        float f15 = f2 + this.ada_4(23.0f);
        bsh3.zskh_4(class_45872, string3, f8, f15, this.ada_4(5.0f), new Color(177, 177, 177), 0.0f);
        bsh3.zskh_4(class_45872, string4, f + f3 - this.ada_4(5.0f) - bsh3.shdf_2(string4, this.ada_4(5.0f)), f15, this.ada_4(5.0f), new Color(177, 177, 177), 0.0f);
        boolean bl2 = bl = baa2_3.rzh != null && baa2_3.rzh.getMedia().isPlaying();
        if (System.currentTimeMillis() - this.dshth < 1500L) {
            bl2 = this.rfq;
        }
        float f16 = f2 + f4 - this.ada_4(8.5f);
        float f17 = f11 + f13 / 2.0f;
        float f18 = this.ada_4(5.0f);
        boolean bl3 = this.hld(d, d2, f17 - f18, f16 - f18, f18 * 2.0f, f18 * 2.0f);
        boolean bl4 = this.hld(d, d2, f17 + this.ada_4(12.0f) - f18, f16 - f18, f18 * 2.0f, f18 * 2.0f);
        boolean bl5 = this.hld(d, d2, f17 - this.ada_4(12.0f) - f18, f16 - f18, f18 * 2.0f, f18 * 2.0f);
        this.khzw.shd_6(bl3 ? 1.0 : 0.0, 150L, tbm.hrkh);
        this.sthkh_2.shd_6(bl4 ? 1.0 : 0.0, 150L, tbm.hrkh);
        this.shaf.shd_6(bl5 ? 1.0 : 0.0, 150L, tbm.hrkh);
        this.khzw.ddhdh();
        this.sthkh_2.ddhdh();
        this.shaf.ddhdh();
        int n = (int)(160.0 + 95.0 * this.khzw.khbk());
        int n2 = (int)(140.0 + 115.0 * this.sthkh_2.khbk());
        int n3 = (int)(140.0 + 115.0 * this.shaf.khbk());
        float f19 = this.ada_4(5.5f) + this.ada_4(0.5f) * (float)this.khzw.khbk();
        float f20 = this.ada_4(5.0f);
        float f21 = this.ada_4(0.6f) * (float)this.sthkh_2.khbk();
        float f22 = this.ada_4(0.6f) * (float)this.shaf.khbk();
        String string5 = bl2 ? "O" : "I";
        bsh5.sjw_2(class_45872, string5, f17, f16 - f19 / 2.0f + this.ada_4(0.5f), f19, new Color(255, 255, 255, n), 0.0f);
        bsh5.sjw_2(class_45872, "L", f17 + this.ada_4(12.0f), f16 - f20 / 2.0f + this.ada_4(0.5f), f20 + f21, new Color(255, 255, 255, n2), 0.0f);
        bsh5.sjw_2(class_45872, "K", f17 - this.ada_4(12.0f), f16 - f20 / 2.0f + this.ada_4(0.5f), f20 + f22, new Color(255, 255, 255, n3), 0.0f);
        if (baa2_3.rzh != null) {
            String string6 = baa2_3.rzh.getOwner().toLowerCase();
            String string7 = "F";
            if (string6.contains("spotify")) {
                string7 = "A";
            } else if (string6.contains("yandex")) {
                string7 = "B";
            } else if (string6.contains("telegram") || string6.contains("ayugram")) {
                string7 = "P";
            } else if (string6.contains("vk")) {
                string7 = "V";
            } else if (string6.contains("edge")) {
                string7 = "C";
            } else if (string6.contains("chrome")) {
                string7 = "C";
            }
            bsh5.zskh_4(class_45872, string7, f + f3 - this.ada_4(12.0f), f2 + this.ada_4(4.0f), this.ada_4(8.0f), Color.WHITE, 0.0f);
        }
    }

    private String hnl(long l) {
        long l2 = l % 3600L;
        long l3 = l2 / 60L;
        long l4 = l2 % 60L;
        return String.format("%02d:%02d", l3, l4);
    }

    private static void dmt(baa_3 baa2_3) {
        baa2_3.rzh.next();
    }

    private void amt_2(baa_3 baa2_3) {
        boolean bl = baa2_3.rzh.getMedia().isPlaying();
        baa2_3.rzh.playPause();
        this.dshth = System.currentTimeMillis();
        this.rfq = !bl;
    }

    private static void rsd_3(baa_3 baa2_3) {
        baa2_3.rzh.previous();
    }

    private void khrh(btd_3 btd2) {
        if (btd2.mouse() && btd2.action() == 1 && btd2.key() == 0) {
            this.rsy();
        }
    }

    private static String[] jec8llh6ahw7m7(String string) {
        return string.split("\u0003\u0012", -1);
    }

    private static CallSite vdcsvopu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ fs8rrc0lmi3p ^ string.hashCode() ^ n2 + pex0fq8 ^ i * 456469205 ^ fs8rrc0lmi3p, 18) ^ pex0fq8));
            }
            String[] stringArray = brt.jec8llh6ahw7m7(new String(cArray));
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

