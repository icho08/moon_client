/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1011
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1060
 *  net.minecraft.class_1074
 *  net.minecraft.class_1309
 *  net.minecraft.class_156
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2561
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_437
 *  net.minecraft.class_4587
 *  net.minecraft.class_490
 *  net.minecraft.class_745
 *  net.minecraft.class_7923
 *  net.minecraft.class_8573
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.lwjgl.glfw.GLFW
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_1011;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1060;
import net.minecraft.class_1074;
import net.minecraft.class_1309;
import net.minecraft.class_156;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import net.minecraft.class_490;
import net.minecraft.class_745;
import net.minecraft.class_7923;
import net.minecraft.class_8573;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import us.m0vy.moondlc.m0vyguard.bbk;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bhdh;
import us.m0vy.moondlc.m0vyguard.bkhl;
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.bdhq;
import us.m0vy.moondlc.m0vyguard.bdhl;
import us.m0vy.moondlc.m0vyguard.bza;
import us.m0vy.moondlc.m0vyguard.bzgh;
import us.m0vy.moondlc.m0vyguard.bzm_2;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.bhm_2;
import us.m0vy.moondlc.m0vyguard.bhn_2;
import us.m0vy.moondlc.m0vyguard.bwh;
import us.m0vy.moondlc.m0vyguard.tadh;
import us.m0vy.moondlc.m0vyguard.tbdh;
import us.m0vy.moondlc.m0vyguard.tthz_2;
import us.m0vy.moondlc.m0vyguard.tthw;
import us.m0vy.moondlc.m0vyguard.tjt;
import us.m0vy.moondlc.m0vyguard.tjq;
import us.m0vy.moondlc.m0vyguard.thr;
import us.m0vy.moondlc.m0vyguard.thz;
import us.m0vy.moondlc.m0vyguard.thw;
import us.m0vy.moondlc.m0vyguard.tdm;
import us.m0vy.moondlc.m0vyguard.tdhb;
import us.m0vy.moondlc.m0vyguard.tss;
import us.m0vy.moondlc.m0vyguard.tsd_2;
import us.m0vy.moondlc.m0vyguard.tsm;
import us.m0vy.moondlc.m0vyguard.tshth;
import us.m0vy.moondlc.m0vyguard.tk;
import us.m0vy.moondlc.m0vyguard.jz_2;
import us.m0vy.moondlc.m0vyguard.khgh;
import us.m0vy.moondlc.m0vyguard.rr;
import us.m0vy.moondlc.m0vyguard.sdh_3;
import us.m0vy.moondlc.m0vyguard.shsh_5;
import us.m0vy.moondlc.m0vyguard.fd;
import us.m0vy.moondlc.m0vyguard.qz;
import us.m0vy.moondlc.m0vyguard.lsh;
import us.m0vy.moondlc.m0vyguard.hj_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class gha
extends class_437
implements tshth {
    public final bhn_2 dhjk = new bhn_2(400L, us.m0vy.moondlc.m0vyguard.bdz.bjk);
    public boolean bhw = false;
    public Runnable skhz_4 = null;
    private qz tbz_2 = qz.rza_2;
    private final bhn_2 dqh_2 = new bhn_2(200L, us.m0vy.moondlc.m0vyguard.bdz.shll);
    private float tjn = 0.0f;
    private float rshz = 0.0f;
    private final EnumMap stht = new EnumMap(qz.class);
    private final EnumMap ddhz_2 = new EnumMap(qz.class);
    private String khaa_3 = "";
    private boolean dhdh_3 = false;
    private String khath_2 = "";
    private boolean ban = false;
    private boolean hfn = false;
    private int stt_6 = 3;
    private boolean dtr_2 = false;
    private String fd = "";
    private boolean khrt = false;
    private boolean jthz = false;
    private final bhn_2 sts = new bhn_2(300L, us.m0vy.moondlc.m0vyguard.bdz.sthy);
    private String rbd_2 = "";
    private boolean dyd_2 = false;
    private float shkh_5 = 0.0f;
    private float shq = 0.0f;
    private final Map hzz_4 = new HashMap();
    private boolean sthz_3 = false;
    private boolean bak = false;
    private boolean zh_4 = false;
    private String tmdh = "";
    private int zfz_2 = new Color(19, 105, 4).getRGB();
    private int thzt_2 = new Color(0, 255, 21).getRGB();
    private int sthd_2 = 0;
    private int shzm_2 = 1;
    private int dhjn = -1;
    private final float[] ttm_2 = new float[]{0.31f, 0.92f, 0.82f};
    private final bhn_2 sjkh_2 = new bhn_2(300L, us.m0vy.moondlc.m0vyguard.bdz.sthy);
    private final bhn_2 shwf = new bhn_2(300L, us.m0vy.moondlc.m0vyguard.bdz.sthy);
    private final bhn_2 rqs = new bhn_2(350L, us.m0vy.moondlc.m0vyguard.bdz.shll);
    private tsd_2 lt_2 = null;
    private String rdhz_2 = "";
    private boolean thka = false;
    private float tlsh = 0.0f;
    private float rmdh = 0.0f;
    private final List dhhgh_2 = new ArrayList();
    private final List khyj = new ArrayList();
    private final Map dths = new HashMap();
    private final Map dwd = new HashMap();
    private final Map dtj = new HashMap();
    private final Map zdz_2 = new HashMap();
    private final Map skn = new HashMap();
    private tss dqj = null;
    private long rzq_2 = 0L;
    private baj_2 rnw = null;
    private float bdz = 0.0f;
    private boolean thfh_2 = false;
    private bzm_2 khsw = null;
    private float[] trj = new float[3];
    private float rbh_2 = 0.0f;
    private float dhja_2 = 0.0f;
    private float hyz_2 = 0.0f;
    private int bmm = -1;
    private boolean shlq = false;
    private final bhn_2 sht = new bhn_2(300L, us.m0vy.moondlc.m0vyguard.bdz.sthy);
    private long dlf = 0L;
    private bkt khky = bkt.jdh_5;
    private tsm rngh = null;
    private tss tzdh_2 = null;
    private shsh_5 sjh_4 = null;
    private static final int kz = 760;
    private static final int zzm = 452;
    private static final int jzz = 135;
    private static final int zfj = 56;
    private static final int tmkh = 48;
    private static final int thwk = 32;
    private static final int sqb = 128;
    private static final long dyz = 1250L;
    private static final float hws = 84.0f;
    private static final float jfl = 66.0f;
    private static final int tghq = 14;
    private static final float dhkhh_2 = 22.0f;
    private static final float thgha = 35.0f;
    private static final float khyz_2 = 49.0f;
    private static final float zdw = 8.0f;
    private static final float zmdh = 7.0f;
    private static final float wz_2 = 122.0f;
    private static final float zfq = 84.0f;
    private static final float zghz = 184.0f;
    private static final float dath_2 = 118.0f;
    private static final float tws_2 = 8.0f;
    private static final float dhshgh = 28.0f;
    private static final float jdhb = 62.0f;
    private static final float dhshh = 99.0f;
    private static final float ryy = 9.0f;
    private static final String shsr_2 = "0";
    private static final String bthd = "1";
    private static final String shkhb = "2";
    private static final String tdn = "3";
    private static final String djb = "4";
    private static final String thst_4 = "2";
    private static final String shf_2 = "5";
    private static final String tjb = "";
    private static final class_2960 khqy;
    private static final class_2960 dhlh;
    private static final class_2960 sdb_3;
    private final LinkedHashMap khlt = new LinkedHashMap();
    private rr khtj_2 = null;
    private int jldh = 0;
    private int hfgh = 0;
    private int thwdh = 0;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public gha() {
        super(class_2561.method_30163((String)"FigmaMenuScreen"));
        for (class_2248 class_22482 : class_7923.field_41175) {
            if (class_22482 == class_2246.field_10124 || class_22482.method_8389() == null || class_22482.method_9518().getString().contains("Air")) continue;
            this.dhhgh_2.add(class_22482);
        }
        this.dhhgh_2.sort(Comparator.comparing(gha::lambda$new$0));
        this.khyj.addAll(this.dhhgh_2);
        for (qz qz2 : qz.values()) {
            this.stht.put(qz2, Float.valueOf(0.0f));
            this.ddhz_2.put(qz2, Float.valueOf(0.0f));
        }
    }

    protected void method_25426() {
        this.bhw = false;
        this.dhjk.htgh(us.m0vy.moondlc.m0vyguard.bdz.bjk);
        this.dhjk.dhht_2(0.0f);
        this.dhjk.sfm_2(0.0f);
        this.dhjk.sby_2(true);
        this.dqh_2.dhht_2(this.getCategoryIndex(this.tbz_2));
        this.dqh_2.sfm_2(this.getCategoryIndex(this.tbz_2));
        this.dqh_2.sby_2(true);
        this.khtj_2 = null;
        this.sjh_4 = null;
        this.dhdh_3 = false;
        this.thka = false;
        this.khath_2 = "";
        this.ban = false;
        this.hfn = false;
        this.dtr_2 = false;
        this.fd = "";
        this.khrt = false;
        this.sthz_3 = false;
        this.zh_4 = false;
        this.sthd_2 = 0;
        this.dhjn = -1;
        this.sjkh_2.bzs_2();
        this.shwf.bzs_2();
        this.shlq = false;
        this.khsw = null;
        this.bmm = -1;
        this.sht.bzs_2();
    }

    public boolean method_25421() {
        return false;
    }

    public void method_25419() {
        this.startClosing();
        super.method_25419();
    }

    public void startClosing() {
        if (this.bhw) {
            return;
        }
        this.bhw = true;
        this.dhjk.htgh(us.m0vy.moondlc.m0vyguard.bdz.jkhgh);
        this.dhjk.sby_2(false);
        khgh.dda_5(khgh.rbr);
    }

    private int getCategoryIndex(qz qz2) {
        return switch (thr.zza_2[qz2.ordinal()]) {
            case 1 -> 0;
            case 2 -> 1;
            case 3 -> 2;
            case 4 -> 3;
            case 5 -> 4;
            case 6 -> 5;
            case 7 -> 6;
            default -> 0;
        };
    }

    private void updateAnimations() {
        this.dhjk.htgh(this.bhw ? us.m0vy.moondlc.m0vyguard.bdz.jkhgh : us.m0vy.moondlc.m0vyguard.bdz.bjk);
        this.dhjk.sby_2(!this.bhw);
        this.rqs.sby_2(this.lt_2 != null);
        this.dqh_2.thdhsh(this.getCategoryIndex(this.tbz_2));
        this.sts.htgh(this.jthz ? us.m0vy.moondlc.m0vyguard.bdz.sthy : us.m0vy.moondlc.m0vyguard.bdz.jkhgh);
        this.sts.sby_2(this.jthz);
        this.sjkh_2.htgh(this.sthz_3 ? us.m0vy.moondlc.m0vyguard.bdz.sthy : us.m0vy.moondlc.m0vyguard.bdz.jkhgh);
        this.sjkh_2.sby_2(this.sthz_3);
        this.shwf.htgh(this.sthz_3 && this.sthd_2 != 0 ? us.m0vy.moondlc.m0vyguard.bdz.sthy : us.m0vy.moondlc.m0vyguard.bdz.jkhgh);
        this.shwf.sby_2(this.sthz_3 && this.sthd_2 != 0);
        this.sht.htgh(this.shlq && this.khsw != null ? us.m0vy.moondlc.m0vyguard.bdz.sthy : us.m0vy.moondlc.m0vyguard.bdz.jkhgh);
        this.sht.sby_2(this.shlq && this.khsw != null);
        if (!this.shlq && this.sht.hnf() <= 0.001f) {
            this.khsw = null;
        }
        List list = bza.getInstance().getModuleManager().dbd_3();
        for (tss tss2 : list) {
            bhn_2 bhn2_2 = this.dths.computeIfAbsent(tss2, gha::lambda$updateAnimations$1);
            boolean bl = this.dwd.computeIfAbsent(tss2, gha::lambda$updateAnimations$2);
            bhn2_2.sby_2(bl);
            bhn_2 bhn3 = this.dtj.computeIfAbsent(tss2, gha::lambda$updateAnimations$3);
            bhn3.sby_2(tss2.isEnabled());
            tss2.refreshAnimations();
            for (baj_2 baj2_2 : tss2.getSettings()) {
                if (!(baj2_2 instanceof tjt)) continue;
                bhn_2 bhn4 = this.zdz_2.computeIfAbsent(baj2_2, gha::lambda$updateAnimations$4);
                bhn4.sby_2(((tjt)baj2_2).tsz());
            }
        }
    }

    public void method_25394(class_332 class_3322, int n, int n2, float f) {
        if (this.bhw && this.dhjk.hnf() <= 0.01f) {
            return;
        }
        this.skhz_4 = () -> this.lambda$render$5(class_3322, n, n2, f);
        this.renderContent(class_3322, n, n2, f);
    }

    private void renderContent(class_332 class_3322, int n, int n2, float f) {
        float f2;
        String string;
        String string2;
        this.updateAnimations();
        thz thz2 = bza.getInstance().getThemeManager().bzm();
        this.khky = thz2 == null ? bkt.jdh_5 : thz2.bzy();
        float f3 = Math.max(0.0f, this.dhjk.hnf());
        float f4 = class_3532.method_15363((float)f3, (float)0.0f, (float)1.0f);
        int n3 = this.field_22789;
        int n4 = this.field_22790;
        float f5 = (float)n3 * 0.9f / 760.0f;
        float f6 = (float)n4 * 0.9f / 452.0f;
        float f7 = Math.min(0.85f, Math.min(f5, f6));
        float f8 = f7 * this.getClickGuiAnimationScale();
        float f9 = 760.0f * f8;
        float f10 = 452.0f * f8;
        float f11 = 135.0f * f8;
        float f12 = 56.0f * f8;
        float f13 = (float)n3 / 2.0f - f9 / 2.0f;
        float f14 = (float)n4 / 2.0f - f10 / 2.0f;
        bdhq bdhq2 = bdhq.of(class_3322);
        this.khtj_2 = null;
        tadh.zzd_6(class_3322.method_51448(), f13, f14, f9, f10, 27.0f * f4 * f8, jz_2.all(27.0f * f8), new bkt(255, 255, 255, f4 * 255.0f));
        bkt bkt2 = new bkt(0, 0, 0, (int)(f4 * 0.85f * 255.0f));
        tadh.khdhh(class_3322.method_51448(), f13, f14, f9, f10, jz_2.all(27.0f * f8), bkt2);
        bkt bkt3 = new bkt(18, 18, 18, (int)(f4 * 255.0f));
        tadh.khdhh(class_3322.method_51448(), f13, f14, f9, f12, new jz_2(27.0f * f8, 27.0f * f8, 0.0f, 0.0f), bkt3);
        tadh.khdhh(class_3322.method_51448(), f13, f14 + f12 - 1.0f * f8, f9, 1.0f * f8, jz_2.shhb, new bkt(33, 33, 33, (int)(f4 * 120.0f)));
        tadh.khdhh(class_3322.method_51448(), f13, f14 + f12, f11, f10 - f12, new jz_2(0.0f, 0.0f, 0.0f, 27.0f * f8), bkt3);
        tadh.khdhh(class_3322.method_51448(), f13 + f11 - 1.0f * f8, f14 + f12, 1.0f * f8, f10 - f12, jz_2.shhb, new bkt(33, 33, 33, (int)(f4 * 120.0f)));
        float f15 = bbk.jns.dht_10("Moondlc", 16.0f * f8);
        float f16 = bbk.rqdh.dht_10("Version:", 10.0f * f8);
        float f17 = 3.0f * f8;
        float f18 = bbk.rqdh.dht_10("Beta", 10.0f * f8);
        float f19 = Math.max(f15, f16 + f17 + f18);
        float f20 = 8.0f * f8;
        float f21 = f14 + 14.0f * f8;
        float f22 = 24.0f * f8;
        float f23 = f22 + f20 + f19;
        float f24 = f13 + (f11 - f23) / 2.0f;
        float f25 = f24 + f22 + f20;
        bdhq2.drawTexture(khqy, f24, f21, f22, f22, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        bdhq2.drawText(bbk.jns.rdhz(16.0f * f8), "Moondlc", f25, f21 - 2.0f * f8, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        bdhq2.drawText(bbk.rqdh.rdhz(10.0f * f8), "Version:", f25, f21 + 14.0f * f8, new bkt(103, 103, 103, (int)(f4 * 255.0f)));
        bdhq2.drawText(bbk.rqdh.rdhz(10.0f * f8), "Beta", f25 + f16 + f17, f21 + 14.0f * f8, this.themeAccent(f4 * 255.0f));
        this.renderSidebarTabs(bdhq2, f13, f14, f10, f11, f12, n, n2, f4, f8);
        float f26 = 44.0f * f8;
        float f27 = f14 + f10 - f26;
        tadh.khdhh(class_3322.method_51448(), f13, f27, f11, f26, new jz_2(0.0f, 0.0f, 0.0f, 27.0f * f8), new bkt(18, 18, 18, (int)(f4 * 255.0f)));
        tadh.khdhh(class_3322.method_51448(), f13, f27, f11, 1.0f * f8, jz_2.shhb, new bkt(33, 33, 33, (int)(f4 * 120.0f)));
        yf yf2 = yf.thwt_2();
        String string3 = string2 = yf2.dzl_4().isEmpty() ? "Username" : yf2.dzl_4();
        Object object = yf2.dhqn() >= 0L ? "Uid: #" + yf2.dhqn() : ((string = this.resolveLauncherUuid(yf2)).isEmpty() ? "Uid: #---" : "UUID: " + string);
        float f28 = 18.0f * f8;
        class_2960 class_29602 = tk.dhfy();
        boolean bl = false;
        float f29 = f13 + 12.0f * f8;
        float f30 = f27 + (f26 - f28) / 2.0f;
        float f31 = f29 + f28 + 9.0f * f8;
        float f32 = f11 - 24.0f * f8 - f28 - 9.0f * f8;
        String string4 = this.ellipsizeEnd(string2, bbk.jns, 12.0f * f8, f32);
        String string5 = this.ellipsizeEnd((String)object, bbk.st_3, 8.25f * f8, f32);
        if (class_29602 != null) {
            bdhq2.drawTexture(class_29602, (int)f29, (int)f30, (int)f28, (int)f28, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            bl = true;
        }
        if (!bl) {
            tadh.khdhh(class_3322.method_51448(), f29, f30, f28, f28, jz_2.all(f28 / 2.0f), this.themeAccent(f4 * 255.0f));
            String string6 = string2.isEmpty() ? "M" : String.valueOf(string2.charAt(0)).toUpperCase();
            f2 = bbk.jns.dht_10(string6, 10.0f * f8);
            bdhq2.drawText(bbk.jns.rdhz(10.0f * f8), string6, f29 + (f28 - f2) / 2.0f, f30 + 4.0f * f8, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        }
        bdhq2.drawText(bbk.jns.rdhz(12.0f * f8), string4, f31, f27 + 9.0f * f8, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        bdhq2.drawText(bbk.st_3.rdhz(8.25f * f8), string5, f31, f27 + 24.0f * f8, new bkt(122, 122, 122, (int)(f4 * 255.0f)));
        float f33 = f13 + f9 - 130.0f * f8;
        f2 = f14 + 18.0f * f8;
        float f34 = f13 + f11 + 16.0f * f8;
        float f35 = f14 + 18.0f * f8;
        if (this.tbz_2 == qz.jtt_3) {
            int n5 = Moondlc.getInstance().getFriendManager().hkha_2().size();
            bdhq2.drawText(bbk.jqy.rdhz(14.0f * f8), "2", f34, f35 + 1.0f * f8, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            float f36 = bbk.jqy.dht_10("2", 14.0f * f8);
            bdhq2.drawText(bbk.jns.rdhz(14.0f * f8), "Friends", f34 + f36 + 6.0f * f8, f35, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            float f37 = bbk.jns.dht_10("Friends", 14.0f * f8);
            String string7 = "•  Total friends " + n5;
            bdhq2.drawText(bbk.rqdh.rdhz(12.0f * f8), string7, f34 + f36 + 6.0f * f8 + f37 + 10.0f * f8, f35 + 1.5f * f8, new bkt(140, 140, 140, (int)(f4 * 255.0f)));
        } else {
            bdhq2.drawText(bbk.tshdh.rdhz(12.0f * f8), tjb, f33, f2 + 3.0f * f8, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            Object object2 = this.khaa_3.isEmpty() ? (this.dhdh_3 ? "Search" + this.animatedSearchDots() : "Search...") : this.khaa_3 + (this.dhdh_3 ? this.animatedSearchDots() : "");
            object2 = this.fitTextFromEnd((String)object2, bbk.rqdh, 12.0f * f8, 100.0f * f8);
            bkt bkt4 = this.khaa_3.isEmpty() && !this.dhdh_3 ? new bkt(103, 103, 103, (int)(f4 * 255.0f)) : new bkt(255, 255, 255, (int)(f4 * 255.0f));
            bdhq2.drawText(bbk.rqdh.rdhz(12.0f * f8), (String)object2, f33 + 18.0f * f8, f2 + 3.0f * f8, bkt4);
        }
        if (this.tbz_2 == qz.thkhm && this.bak) {
            this.renderThemesTab(bdhq2, f13, f14, f9, f10, f11, f12, n, n2, f4, f8);
        } else if (this.tbz_2 == qz.thkhm) {
            this.renderConfigsTab(bdhq2, f13, f14, f9, f10, f11, f12, n, n2, f4, f8);
        } else if (this.tbz_2 == qz.jtt_3) {
            this.renderFriendsTab(bdhq2, f13, f14, f9, f10, f11, f12, n, n2, f4, f8);
        } else {
            this.renderModules(bdhq2, f13, f14, f9, f10, f11, f12, n, n2, f4, f8);
        }
        this.renderBlockPicker(bdhq2, f13, f14, f12, n, n2, f4, f8);
        this.renderOpenDropdownOverlay(bdhq2, f4, f8);
        if (this.sts.hnf() > 0.001f) {
            this.renderAddFriendModal(bdhq2, n3, n4, n, n2, f4, f8);
        }
    }

    private float getClickGuiAnimationScale() {
        return 0.5f + Math.max(0.0f, this.dhjk.hnf()) * 0.5f;
    }

    private String resolveLauncherUuid(yf yf2) {
        String string = this.normalizeUuid(yf2.rkhh());
        if (!string.isEmpty()) {
            return string;
        }
        if (this.field_22787 != null && this.field_22787.field_1724 != null) {
            return this.field_22787.field_1724.method_5667().toString();
        }
        return "";
    }

    private String normalizeUuid(String string) {
        if (string == null || string.isBlank()) {
            return "";
        }
        Object object = string.trim().replace("{", "").replace("}", "");
        if (((String)object).length() == 32 && ((String)object).indexOf(45) < 0) {
            object = ((String)object).substring(0, 8) + "-" + ((String)object).substring(8, 12) + "-" + ((String)object).substring(12, 16) + "-" + ((String)object).substring(16, 20) + "-" + ((String)object).substring(20);
        }
        try {
            return UUID.fromString((String)object).toString();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return object;
        }
    }

    private void renderSidebarTabs(bdhq bdhq2, float f, float f2, float f3, float f4, float f5, int n, int n2, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        Object object;
        Object object2;
        boolean bl;
        qz[] qzArray;
        float f11 = f2 + f5 + 18.0f * f7;
        bdhq2.drawText(bbk.khzk.rdhz(9.0f * f7), "FEATURES", f + 12.0f * f7, f11, new bkt(103, 103, 103, (int)(f6 * 255.0f)));
        f11 += 14.0f * f7;
        float f12 = this.dqh_2.hnf();
        float f13 = f12 <= 4.0f ? f2 + f5 + 32.0f * f7 + f12 * 32.0f * f7 : f2 + f3 - 136.0f * f7 + (f12 - 5.0f) * 32.0f * f7;
        tadh.khdhh(bdhq2.method_51448(), f + 8.0f * f7, f13, f4 - 16.0f * f7, 26.0f * f7, jz_2.all(6.0f * f7), this.themeAccent(f6 * 255.0f));
        qz[] qzArray2 = qzArray = new qz[]{qz.rza_2, qz.bhy, qz.thfk, qz.khjn, qz.hfdh};
        int n3 = qzArray2.length;
        for (int i = 0; i < n3; ++i) {
            qz qz2 = qzArray2[i];
            boolean bl2 = class_3532.method_15340((int)n, (int)((int)f), (int)((int)(f + f4))) == n && class_3532.method_15340((int)n2, (int)((int)f11), (int)((int)(f11 + 26.0f * f7))) == n2;
            boolean bl3 = bl = this.tbz_2 == qz2;
            bkt bkt2 = bl ? new bkt(255, 255, 255, (int)(f6 * 255.0f)) : (bl2 ? new bkt(200, 200, 200, (int)(f6 * 255.0f)) : new bkt(180, 180, 180, (int)(f6 * 255.0f)));
            object2 = this.getCategoryIcon(qz2);
            object = this.getCategoryIconFont(qz2);
            float f14 = object == bbk.agh ? 14.5f * f7 : 12.0f * f7;
            f10 = ((tthz_2)object).dht_10((String)object2, f14);
            f9 = f + 18.0f * f7 - f10 / 2.0f;
            if (qz2 == qz.rza_2) {
                f9 += 1.0f * f7;
            }
            f8 = object == bbk.agh ? f11 + 7.0f * f7 + 0.5f * f7 : f11 + 7.0f * f7;
            bdhq2.drawText(((tthz_2)object).rdhz(f14), (String)object2, f9, f8, bkt2);
            String string = qz2.getName();
            if (qz2 == qz.khjn) {
                string = "Visuals";
            }
            if (qz2 == qz.hfdh) {
                string = "Others";
            }
            bdhq2.drawText(bbk.st_3.rdhz(12.0f * f7), string, f + 36.0f * f7, f11 + 7.0f * f7, bkt2);
            f11 += 32.0f * f7;
        }
        f11 = f2 + f3 - 150.0f * f7;
        bdhq2.drawText(bbk.khzk.rdhz(9.0f * f7), "OTHERS", f + 12.0f * f7, f11, new bkt(103, 103, 103, (int)(f6 * 255.0f)));
        f11 += 14.0f * f7;
        for (qz qz3 : qzArray2 = new qz[]{qz.jtt_3, qz.thkhm}) {
            boolean bl4;
            bl = class_3532.method_15340((int)n, (int)((int)f), (int)((int)(f + f4))) == n && class_3532.method_15340((int)n2, (int)((int)f11), (int)((int)(f11 + 26.0f * f7))) == n2;
            boolean bl5 = bl4 = this.tbz_2 == qz3;
            object2 = bl4 ? new bkt(255, 255, 255, (int)(f6 * 255.0f)) : (bl ? new bkt(200, 200, 200, (int)(f6 * 255.0f)) : new bkt(180, 180, 180, (int)(f6 * 255.0f)));
            object = this.getCategoryIcon(qz3);
            tthz_2 tthz2_2 = this.getCategoryIconFont(qz3);
            f10 = tthz2_2 == bbk.agh ? 14.5f * f7 : 12.0f * f7;
            f9 = tthz2_2.dht_10((String)object, f10);
            f8 = f + 18.0f * f7 - f9 / 2.0f;
            float f15 = tthz2_2 == bbk.agh ? f11 + 7.0f * f7 + 0.5f * f7 : f11 + 7.0f * f7;
            bdhq2.drawText(tthz2_2.rdhz(f10), (String)object, f8, f15, (bkt)object2);
            bdhq2.drawText(bbk.st_3.rdhz(12.0f * f7), qz3.getName(), f + 36.0f * f7, f11 + 7.0f * f7, (bkt)object2);
            f11 += 32.0f * f7;
        }
    }

    private String getCategoryIcon(qz qz2) {
        switch (thr.zza_2[qz2.ordinal()]) {
            case 1: {
                return "";
            }
            case 2: {
                return bthd;
            }
            case 3: {
                return "2";
            }
            case 4: {
                return tdn;
            }
            case 5: {
                return "";
            }
            case 6: {
                return "2";
            }
            case 7: {
                return "";
            }
        }
        return djb;
    }

    private void renderModules(bdhq bdhq2, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, float f7, float f8) {
        float f9 = f + f5 + 16.0f * f8;
        float f10 = f2 + f6 + 12.0f * f8;
        float f11 = f3 - f5 - 32.0f * f8;
        float f12 = f4 - f6 - 24.0f * f8;
        bdhq2.method_44379((int)f9, (int)f10, (int)(f9 + f11), (int)(f10 + f12));
        List list = this.getVisibleModules();
        int n3 = 12;
        boolean bl = f3 >= 600.0f * f8;
        float f13 = bl ? (f11 - (float)n3 * f8) / 2.0f : f11;
        float f14 = f10 + this.tjn;
        float f15 = f10 + this.tjn;
        for (int i = 0; i < list.size(); ++i) {
            tss tss2 = (tss)list.get(i);
            boolean bl2 = !bl || f14 <= f15;
            float f16 = bl2 ? f9 : f9 + f13 + (float)n3 * f8;
            float f17 = bl2 ? f14 : f15;
            float f18 = this.renderModuleCard(bdhq2, f16, f17, f13, tss2, n, n2, f7, f8);
            if (bl2) {
                f14 += f18 + (float)n3 * f8;
                continue;
            }
            f15 += f18 + (float)n3 * f8;
        }
        float f19 = -(Math.max(f14, f15) - this.tjn - f12);
        if (f19 > 0.0f) {
            f19 = 0.0f;
        }
        this.rshz = class_3532.method_15363((float)this.rshz, (float)f19, (float)0.0f);
        this.tjn += (this.rshz - this.tjn) * 0.15f;
        this.rememberCurrentScroll();
        bdhq2.method_44380();
    }

    private float renderModuleCard(bdhq bdhq2, float f, float f2, float f3, tss tss2, int n, int n2, float f4, float f5) {
        boolean bl;
        bhn_2 bhn2_2 = (bhn_2)this.dths.get(tss2);
        float f6 = bhn2_2.hnf();
        float f7 = 0.0f;
        if (f6 > 0.01f) {
            for (baj_2 baj2_2 : tss2.getSettings()) {
                if (!baj2_2.baa_2()) continue;
                f7 += (this.getSettingHeight(baj2_2, f3 / f5) + 12.0f) * f5;
            }
            if (f7 > 0.0f) {
                f7 += 8.0f * f5;
            }
        }
        float f8 = 50.0f * f5;
        float f9 = f8 + f7 * f6;
        tadh.khdhh(bdhq2.method_51448(), f, f2, f3, f9, jz_2.all(10.0f * f5), new bkt(18, 18, 19, (int)(f4 * 255.0f)));
        tadh.khdhh(bdhq2.method_51448(), f, f2, f3, f9, jz_2.all(10.0f * f5), new bkt(33, 33, 33, (int)(f4 * 60.0f)));
        bkt bkt2 = tss2.isEnabled() ? new bkt(255, 255, 255, (int)(f4 * 255.0f)) : new bkt(200, 200, 200, (int)(f4 * 255.0f));
        bdhq2.drawText(bbk.st_3.rdhz(15.0f * f5), tss2.getName(), f + 14.0f * f5, f2 + 11.0f * f5, bkt2);
        String string = class_1074.method_4662((String)tss2.getInfo().description(), (Object[])new Object[0]);
        if (string.startsWith("modules.description") || string.contains("modules.description")) {
            string = "No description available.";
        }
        boolean bl2 = bl = tss2 == this.dqj && System.currentTimeMillis() < this.rzq_2;
        if (bl) {
            string = "No settings available";
        }
        String string2 = this.formatBindName(tss2.getKeyCode());
        if (this.tzdh_2 == tss2 && this.rngh == null) {
            string2 = this.animatedSearchDots();
        }
        float f10 = bbk.jns.dht_10(string2, 11.0f * f5);
        float f11 = Math.max(32.0f * f5, f10 + 10.0f * f5);
        float f12 = 18.0f * f5;
        float f13 = f + f3 - 14.0f * f5 - 24.0f * f5 - 8.0f * f5 - f11;
        float f14 = f2 + 16.0f * f5;
        float f15 = Math.max(0.0f, f13 - f - 22.0f * f5);
        string = this.ellipsizeEnd(string, bbk.rqdh, 10.0f * f5, f15);
        bdhq2.drawText(bbk.rqdh.rdhz(10.0f * f5), string, f + 14.0f * f5, f2 + 28.0f * f5, bl ? this.themeAccent(f4 * 255.0f) : new bkt(103, 103, 103, (int)(f4 * 255.0f)));
        tadh.khdhh(bdhq2.method_51448(), f13, f14, f11, f12, jz_2.all(4.0f * f5), new bkt(217, 217, 217, (int)(f4 * 255.0f)));
        bdhq2.drawText(bbk.jns.rdhz(11.0f * f5), string2, f13 + (f11 - f10) / 2.0f, f14 + 4.0f * f5, new bkt(0, 0, 0, (int)(f4 * 255.0f)));
        float f16 = f + f3 - 36.0f * f5;
        float f17 = f2 + 17.0f * f5;
        float f18 = 24.0f * f5;
        float f19 = 15.0f * f5;
        bhn_2 bhn3 = (bhn_2)this.dtj.get(tss2);
        float f20 = bhn3 != null ? bhn3.hnf() : (tss2.isEnabled() ? 1.0f : 0.0f);
        bkt bkt3 = tjq.ttdh_4(new bkt(103, 103, 103, (int)(f4 * 255.0f)), this.themeAccent(f4 * 255.0f), f20);
        tadh.khdhh(bdhq2.method_51448(), f16, f17, f18, f19, jz_2.all(7.5f * f5), bkt3);
        float f21 = 11.0f * f5;
        float f22 = f16 + 2.0f * f5 + 9.0f * f5 * f20;
        tadh.khdhh(bdhq2.method_51448(), f22, f17 + 2.0f * f5, f21, f21, jz_2.all(5.5f * f5), new bkt(18, 18, 18, (int)(f4 * 255.0f)));
        if (f6 > 0.01f) {
            bdhq2.method_44379((int)f, (int)(f2 + f8), (int)(f + f3), (int)(f2 + f9));
            float f23 = f2 + f8 + 4.0f * f5;
            tadh.khdhh(bdhq2.method_51448(), f + 14.0f * f5, f2 + f8 - 1.0f * f5, f3 - 28.0f * f5, 1.0f * f5, jz_2.shhb, new bkt(33, 33, 33, (int)(f4 * 255.0f * f6)));
            for (baj_2 baj3_2 : tss2.getSettings()) {
                if (!baj3_2.baa_2()) continue;
                this.renderSetting(bdhq2, f, f3, f23, baj3_2, n, n2, f4 * f6, f5);
                f23 += (this.getSettingHeight(baj3_2, f3 / f5) + 12.0f) * f5;
            }
            bdhq2.method_44380();
        }
        return f9;
    }

    private void renderSetting(bdhq bdhq2, float f, float f2, float f3, baj_2 baj2_2, int n, int n2, float f4, float f5) {
        float f6 = f + 14.0f * f5;
        float f7 = f3 + (baj2_2 instanceof bzm_2 ? 5.0f : 4.0f) * f5;
        bdhq2.drawText(bbk.st_3.rdhz(13.0f * f5), baj2_2.getName(), f6, f7, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        float f8 = 120.0f * f5;
        float f9 = 16.0f * f5;
        float f10 = f + f2 - 14.0f * f5 - f8;
        if (baj2_2 instanceof tjt) {
            tjt tjt2 = (tjt)baj2_2;
            bhn_2 bhn2_2 = (bhn_2)this.zdz_2.get(baj2_2);
            float f11 = bhn2_2 != null ? bhn2_2.hnf() : (tjt2.tsz() ? 1.0f : 0.0f);
            float f12 = f + f2 - 36.0f * f5;
            float f13 = f3 + 2.0f * f5;
            float f14 = 24.0f * f5;
            float f15 = 15.0f * f5;
            bkt bkt2 = tjq.ttdh_4(new bkt(103, 103, 103, (int)(f4 * 255.0f)), this.themeAccent(f4 * 255.0f), f11);
            tadh.khdhh(bdhq2.method_51448(), f12, f13, f14, f15, jz_2.all(7.5f * f5), bkt2);
            float f16 = 11.0f * f5;
            float f17 = f12 + 2.0f * f5 + 9.0f * f5 * f11;
            tadh.khdhh(bdhq2.method_51448(), f17, f3 + 4.0f * f5, f16, f16, jz_2.all(5.5f * f5), new bkt(18, 18, 18, (int)(f4 * 255.0f)));
        } else if (baj2_2 instanceof bzgh) {
            bzgh bzgh2 = (bzgh)baj2_2;
            float f18 = (bzgh2.bqz_2() - bzgh2.zqw()) / (bzgh2.jshsh() - bzgh2.zqw());
            float f19 = 84.0f * f5;
            float f20 = 6.0f * f5;
            float f21 = f3 + 7.0f * f5;
            tadh.khdhh(bdhq2.method_51448(), f10, f21, f19, f20, jz_2.all(3.0f * f5), new bkt(34, 34, 34, (int)(f4 * 255.0f)));
            float f22 = f19 * f18;
            float f23 = class_3532.method_15363((float)(f22 + 3.0f * f5), (float)0.0f, (float)f19);
            tadh.khdhh(bdhq2.method_51448(), f10, f21, f23, f20, jz_2.all(3.0f * f5), this.themeAccent(f4 * 255.0f));
            float f24 = 4.0f * f5;
            float f25 = class_3532.method_15363((float)(f10 + f22 - 1.5f * f5), (float)(f10 + f24 / 2.0f), (float)(f10 + f19 - f24 / 2.0f));
            tadh.khdhh(bdhq2.method_51448(), f25 - f24 / 2.0f, f21 + 1.0f * f5, f24, f24, jz_2.all(f24 / 2.0f), new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            String string = String.format(Locale.US, "%.1f", Float.valueOf(bzgh2.bqz_2()));
            float f26 = bbk.jns.dht_10(string, 10.0f * f5);
            bdhq2.drawText(bbk.jns.rdhz(10.0f * f5), string, f + f2 - 14.0f * f5 - f26, f3 + 5.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        } else if (baj2_2 instanceof bdhl) {
            bdhl bdhl2 = (bdhl)baj2_2;
            float f27 = (bdhl2.tzf_3() - bdhl2.twth_2()) / (bdhl2.jygh() - bdhl2.twth_2());
            float f28 = (bdhl2.dghth_2() - bdhl2.twth_2()) / (bdhl2.jygh() - bdhl2.twth_2());
            float f29 = 66.0f * f5;
            float f30 = 6.0f * f5;
            float f31 = f3 + 7.0f * f5;
            tadh.khdhh(bdhq2.method_51448(), f10, f31, f29, f30, jz_2.all(3.0f * f5), new bkt(34, 34, 34, (int)(f4 * 255.0f)));
            float f32 = Math.max(f10, f10 + f29 * f27 - 3.0f * f5);
            float f33 = Math.min(f10 + f29, f10 + f29 * f28 + 3.0f * f5);
            tadh.khdhh(bdhq2.method_51448(), f32, f31, f33 - f32, f30, jz_2.all(3.0f * f5), this.themeAccent(f4 * 255.0f));
            float f34 = 4.0f * f5;
            float f35 = class_3532.method_15363((float)(f10 + f29 * f27 - 1.5f * f5), (float)(f10 + f34 / 2.0f), (float)(f10 + f29 - f34 / 2.0f));
            float f36 = class_3532.method_15363((float)(f10 + f29 * f28 - 1.5f * f5), (float)(f10 + f34 / 2.0f), (float)(f10 + f29 - f34 / 2.0f));
            tadh.khdhh(bdhq2.method_51448(), f35 - f34 / 2.0f, f31 + 1.0f * f5, f34, f34, jz_2.all(f34 / 2.0f), new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            tadh.khdhh(bdhq2.method_51448(), f36 - f34 / 2.0f, f31 + 1.0f * f5, f34, f34, jz_2.all(f34 / 2.0f), new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            String string = String.format(Locale.US, "%.1f-%.1f", Float.valueOf(bdhl2.tzf_3()), Float.valueOf(bdhl2.dghth_2()));
            float f37 = bbk.jns.dht_10(string, 10.0f * f5);
            bdhq2.drawText(bbk.jns.rdhz(10.0f * f5), string, f + f2 - 14.0f * f5 - f37, f3 + 5.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        } else if (baj2_2 instanceof rr) {
            rr rr2 = (rr)baj2_2;
            float f38 = 110.0f * f5;
            float f39 = f + f2 - 14.0f * f5 - f38;
            tadh.khdhh(bdhq2.method_51448(), f39, f3 + 2.0f * f5, f38, f9, jz_2.all(4.0f * f5), new bkt(32, 32, 32, (int)(f4 * 255.0f)));
            tadh.khdhh(bdhq2.method_51448(), f39, f3 + 2.0f * f5, f38, f9, jz_2.all(4.0f * f5), new bkt(22, 22, 22, (int)(f4 * 120.0f)));
            bdhq2.drawText(bbk.st_3.rdhz(12.0f * f5), rr2.tdd_4(), f39 + 8.0f * f5, f3 + 5.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            String string = rr2.zst() ? "u" : "d";
            bdhq2.drawText(bbk.jqy.rdhz(10.0f * f5), string, f39 + f38 - 16.0f * f5, f3 + 6.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            float f40 = rr2.bjk().hnf();
            if (f40 > 0.01f) {
                this.khtj_2 = rr2;
                this.jldh = (int)f39;
                this.hfgh = (int)(f3 + 20.0f * f5);
                this.thwdh = (int)f38;
            }
        } else if (baj2_2 instanceof bwh) {
            bwh bwh2 = (bwh)baj2_2;
            float f41 = f6;
            float f42 = f3 + 20.0f * f5;
            for (tbdh tbdh2 : bwh2.shbh()) {
                boolean bl = tbdh2.bzth();
                bkt bkt3 = bl ? this.themeAccent(f4 * 255.0f) : new bkt(103, 103, 103, (int)(f4 * 255.0f));
                float f43 = bbk.rqdh.dht_10(tbdh2.getName(), 10.0f * f5) + 12.0f * f5;
                if (f41 > f6 && f41 + f43 > f + f2 - 14.0f * f5) {
                    f41 = f6;
                    f42 += 20.0f * f5;
                }
                tadh.khdhh(bdhq2.method_51448(), f41, f42, f43, 16.0f * f5, jz_2.all(4.0f * f5), bkt3);
                bdhq2.drawText(bbk.rqdh.rdhz(10.0f * f5), tbdh2.getName(), f41 + 6.0f * f5, f42 + 4.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
                f41 += f43 + 6.0f * f5;
            }
        } else if (baj2_2 instanceof bzm_2) {
            bzm_2 bzm2 = (bzm_2)baj2_2;
            float f44 = 110.0f * f5;
            float f45 = f + f2 - 14.0f * f5 - f44;
            if (this.khsw == bzm2) {
                tadh.khdhh(bdhq2.method_51448(), f45 - 4.0f * f5, f3 + 1.0f * f5, f44 + 4.0f * f5, 22.0f * f5, jz_2.all(4.0f * f5), new bkt(32, 32, 32, (int)(f4 * 255.0f)));
            }
            bkt bkt4 = new bkt(bzm2.skhgh_2().btkh());
            tadh.khdhh(bdhq2.method_51448(), f45 + f44 - 20.0f * f5, f3 + 2.0f * f5, 20.0f * f5, 20.0f * f5, jz_2.all(4.0f * f5), bkt4.rwh_2((int)(f4 * 255.0f)));
            tadh.aad(bdhq2.method_51448(), f45 + f44 - 20.0f * f5, f3 + 2.0f * f5, 20.0f * f5, 20.0f * f5, 0.6f * f5, jz_2.all(4.0f * f5), new bkt(255, 255, 255, (int)(f4 * 75.0f)));
            String string = String.format("#%06X", 0xFFFFFF & bzm2.skhgh_2().btkh());
            bdhq2.drawText(bbk.jns.rdhz(12.0f * f5), string, f45 + f44 - 85.0f * f5, f3 + 7.0f * f5, new bkt(103, 103, 103, (int)(f4 * 255.0f)));
            float f46 = this.getModuleColorPickerProgress(bzm2);
            if (f46 > 0.01f) {
                this.positionEmbeddedModuleColorPicker(f, f2, f3, f5);
                this.renderHsvColorPicker(bdhq2, this.rbh_2, this.dhja_2, this.hyz_2, this.trj, bzm2.jts_2(), bzm2.getName(), f4, f5, f46);
            }
        } else if (baj2_2 instanceof tsd_2) {
            tsd_2 tsd2 = (tsd_2)baj2_2;
            float f47 = 110.0f * f5;
            float f48 = f + f2 - 14.0f * f5 - f47;
            tadh.khdhh(bdhq2.method_51448(), f48, f3 + 2.0f * f5, f47, f9, jz_2.all(4.0f * f5), this.themeAccent(f4 * 255.0f));
            bdhq2.drawText(bbk.st_3.rdhz(12.0f * f5), "Configure...", f48 + 8.0f * f5, f3 + 5.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        } else if (baj2_2 instanceof tsm) {
            tsm tsm2 = (tsm)baj2_2;
            String string = tsm2.jmn();
            if (string == null || string.isEmpty() || string.equalsIgnoreCase("none")) {
                string = "NONE";
            }
            string = string.toUpperCase();
            if (this.rngh == tsm2) {
                string = this.animatedSearchDots();
            }
            float f49 = bbk.jns.dht_10(string, 12.0f * f5);
            float f50 = Math.max(36.0f * f5, f49 + 12.0f * f5);
            float f51 = f + f2 - 14.0f * f5 - f50;
            bkt bkt5 = this.rngh == tsm2 ? this.themeAccent(f4 * 255.0f) : new bkt(59, 59, 59, (int)(f4 * 255.0f));
            tadh.khdhh(bdhq2.method_51448(), f51, f3 + 2.0f * f5, f50, 18.0f * f5, jz_2.all(4.0f * f5), bkt5);
            bdhq2.drawText(bbk.jns.rdhz(12.0f * f5), string, f51 + (f50 - f49) / 2.0f, f3 + 5.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        } else if (baj2_2 instanceof shsh_5) {
            boolean bl;
            shsh_5 shsh2 = (shsh_5)baj2_2;
            Object object = shsh2.shqkh();
            boolean bl2 = bl = this.sjh_4 == shsh2;
            if (bl) {
                object = (String)object + this.animatedSearchDots();
            }
            float f52 = 120.0f * f5;
            float f53 = f + f2 - 14.0f * f5 - f52;
            object = this.fitTextFromEnd((String)object, bbk.rqdh, 12.0f * f5, f52 - 16.0f * f5);
            bkt bkt6 = bl ? this.themeAccent(f4 * 255.0f) : new bkt(44, 44, 44, (int)(f4 * 255.0f));
            tadh.khdhh(bdhq2.method_51448(), f53, f3 + 2.0f * f5, f52, 18.0f * f5, jz_2.all(4.0f * f5), bkt6);
            bdhq2.drawText(bbk.rqdh.rdhz(12.0f * f5), (String)object, f53 + 8.0f * f5, f3 + 5.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        }
    }

    private void renderOpenDropdownOverlay(bdhq bdhq2, float f, float f2) {
        if (this.khtj_2 == null) {
            return;
        }
        rr rr2 = this.khtj_2;
        int n = this.jldh;
        int n2 = this.hfgh;
        int n3 = this.thwdh;
        float f3 = rr2.bjk().hnf();
        int n4 = Math.min(14, rr2.bla_2().size());
        int n5 = Math.max(0, rr2.bla_2().size() - n4);
        int n6 = class_3532.method_15340((int)this.skn.getOrDefault(rr2, 0), (int)0, (int)n5);
        this.skn.put(rr2, n6);
        float f4 = (float)(n4 * 16 + 8) * f2;
        float f5 = f4 * f3;
        bdhq2.method_44379(n, n2 - 2, n + n3, (int)((float)n2 + f5 + 2.0f));
        tadh.khdhh(bdhq2.method_51448(), n, n2, n3, f4, jz_2.all(4.0f * f2), new bkt(32, 32, 32, (int)(f * f3 * 255.0f)));
        tadh.khdhh(bdhq2.method_51448(), n, n2, n3, f4, jz_2.all(4.0f * f2), new bkt(22, 22, 22, (int)(f * f3 * 255.0f)));
        for (int i = 0; i < n4; ++i) {
            int n7 = n6 + i;
            sdh_3 sdh2 = (sdh_3)rr2.bla_2().get(n7);
            boolean bl = rr2.zht(sdh2.getName());
            bkt bkt2 = bl ? new bkt(255, 255, 255, (int)(f * f3 * 255.0f)) : new bkt(77, 77, 77, (int)(f * f3 * 255.0f));
            bdhq2.drawText(bbk.st_3.rdhz(12.0f * f2), sdh2.getName(), (float)n + 8.0f * f2, (float)n2 + (4.0f + (float)i * 16.0f) * f2, bkt2);
        }
        if (n5 > 0) {
            float f6 = (float)n2 + 4.0f * f2;
            float f7 = (float)n4 * 16.0f * f2;
            float f8 = Math.max(14.0f * f2, f7 * (float)n4 / (float)rr2.bla_2().size());
            float f9 = f6 + (f7 - f8) * (float)n6 / (float)n5;
            tadh.khdhh(bdhq2.method_51448(), (float)(n + n3) - 3.0f * f2, f9, 1.5f * f2, f8, jz_2.all(0.75f * f2), this.themeAccent(f * f3 * 210.0f));
        }
        bdhq2.method_44380();
    }

    private void renderBlockPicker(bdhq bdhq2, float f, float f2, float f3, int n, int n2, float f4, float f5) {
        float f6 = this.rqs.hnf();
        if (f6 < 0.01f || this.lt_2 == null) {
            return;
        }
        float f7 = 236.0f * f5;
        float f8 = 312.0f * f5;
        float f9 = f - (f7 + 10.0f * f5) * f6;
        float f10 = f2 + f3 + 10.0f * f5;
        tadh.zzd_6(bdhq2.method_51448(), f9, f10, f7, f8, 27.0f * f4 * f6 * f5, jz_2.all(27.0f * f5), new bkt(255, 255, 255, f4 * 255.0f));
        tadh.khdhh(bdhq2.method_51448(), f9, f10, f7, f8, jz_2.all(27.0f * f5), new bkt(0, 0, 0, (int)(f4 * f6 * 0.85f * 255.0f)));
        float f11 = f9 + 8.0f * f5;
        float f12 = f10 + 8.0f * f5;
        float f13 = f7 - 16.0f * f5;
        float f14 = f8 - 16.0f * f5;
        tadh.khdhh(bdhq2.method_51448(), f11, f12, f13, f14, jz_2.all(15.0f * f5), new bkt(18, 18, 18, (int)(f4 * 255.0f)));
        float f15 = f12 + 8.0f * f5;
        tadh.khdhh(bdhq2.method_51448(), f11 + 8.0f * f5, f15, f13 - 16.0f * f5, 20.0f * f5, jz_2.all(4.0f * f5), this.themeAccent(f4 * 255.0f));
        bdhq2.drawText(bbk.tshdh.rdhz(10.0f * f5), tjb, f11 + 14.0f * f5, f15 + 5.0f * f5, new bkt(255, 255, 255, (int)(f4 * 180.0f)));
        Object object = this.rdhz_2.isEmpty() ? (this.thka ? "Search" + this.animatedSearchDots() : "Search...") : this.rdhz_2 + (this.thka ? this.animatedSearchDots() : "");
        object = this.fitTextFromEnd((String)object, bbk.jns, 12.0f * f5, f13 - 48.0f * f5);
        bdhq2.drawText(bbk.jns.rdhz(12.0f * f5), (String)object, f11 + 28.0f * f5, f15 + 4.0f * f5, new bkt(255, 255, 255, (int)(f4 * (this.rdhz_2.isEmpty() ? 180.0f : 255.0f))));
        float f16 = f15 + 28.0f * f5;
        float f17 = f14 - 45.0f * f5;
        bdhq2.method_44379((int)f11, (int)f16, (int)(f11 + f13), (int)(f16 + f17));
        float f18 = -((float)this.khyj.size() * 26.0f * f5 - f17);
        if (f18 > 0.0f) {
            f18 = 0.0f;
        }
        this.rmdh = class_3532.method_15363((float)this.rmdh, (float)f18, (float)0.0f);
        this.tlsh += (this.rmdh - this.tlsh) * 0.15f;
        bdhq bdhq3 = bdhq2;
        for (int i = 0; i < this.khyj.size(); ++i) {
            class_2248 class_22482 = (class_2248)this.khyj.get(i);
            float f19 = f16 + (float)i * 26.0f * f5 + this.tlsh;
            if (f19 + 22.0f * f5 < f16 || f19 > f16 + f17) continue;
            boolean bl = this.lt_2.shthr(class_22482);
            bkt bkt2 = bl ? new bkt(32, 32, 32, (int)(f4 * 255.0f)) : new bkt(24, 24, 24, (int)(f4 * 80.0f));
            tadh.khdhh(bdhq2.method_51448(), f11 + 8.0f * f5, f19, f13 - 16.0f * f5, 22.0f * f5, jz_2.all(4.0f * f5), bkt2);
            class_1799 class_17992 = new class_1799((class_1935)class_22482);
            bdhq2.method_51448().method_22903();
            bdhq2.method_51448().method_46416(f11 + 12.0f * f5, f19 + 3.0f * f5, 0.0f);
            bdhq2.method_51448().method_22905(f5, f5, 1.0f);
            bdhq3.method_51427(class_17992, 0, 0);
            bdhq2.method_51448().method_22909();
            String string = class_22482.method_9518().getString();
            bdhq2.drawText(bbk.jns.rdhz(12.0f * f5), string, f11 + 34.0f * f5, f19 + 6.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
            float f20 = f11 + f13 - 24.0f * f5;
            bkt bkt3 = bl ? this.themeAccent(f4 * 255.0f) : new bkt(117, 117, 117, (int)(f4 * 255.0f));
            tadh.khdhh(bdhq2.method_51448(), f20, f19 + 3.0f * f5, 16.0f * f5, 16.0f * f5, jz_2.all(4.0f * f5), bkt3);
            String string2 = bl ? "s" : "x";
            bdhq2.drawText(bbk.jqy.rdhz(8.0f * f5), string2, f20 + 4.0f * f5, f19 + 8.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        }
        bdhq2.method_44380();
    }

    private void renderHsvColorPicker(bdhq bdhq2, float f, float f2, float f3, float[] fArray, int n, String string, float f4, float f5, float f6) {
        float f7 = 118.0f * f5;
        float f8 = Math.max(0.0f, f6);
        class_4587 class_45872 = bdhq2.method_51448();
        gha.beginHudWidgetTransform(class_45872, f, f2, f3, f7, f8);
        tadh.khdhh(bdhq2.method_51448(), f, f2, f3, f7, jz_2.all(6.0f * f5), new bkt(32, 32, 32, (int)((f4 *= class_3532.method_15363((float)f8, (float)0.0f, (float)1.0f)) * 255.0f)));
        tadh.khdhh(bdhq2.method_51448(), f, f2, f3, f7, jz_2.all(6.0f * f5), new bkt(22, 22, 22, (int)(f4 * 120.0f)));
        bkt bkt2 = new bkt(n).zdhgh_2(f4 * 255.0f);
        tadh.khdhh(bdhq2.method_51448(), f + 8.0f * f5, f2 + 6.0f * f5, 16.0f * f5, 16.0f * f5, jz_2.all(4.0f * f5), bkt2);
        String string2 = this.formatThemeColor(n);
        float f9 = bbk.jns.dht_10(string2, 10.0f * f5);
        float f10 = f9 + 10.0f * f5;
        float f11 = f + f3 - 8.0f * f5 - f10;
        tadh.khdhh(bdhq2.method_51448(), f11, f2 + 7.0f * f5, f10, 14.0f * f5, jz_2.all(4.0f * f5), new bkt(32, 32, 32, (int)(f4 * 255.0f)));
        String string3 = this.ellipsizeEnd(string, bbk.st_3, 11.0f * f5, Math.max(0.0f, f11 - f - 38.0f * f5));
        bdhq2.drawText(bbk.st_3.rdhz(11.0f * f5), string3, f + 31.0f * f5, f2 + 9.0f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        bdhq2.drawText(bbk.jns.rdhz(10.0f * f5), string2, f11 + 5.0f * f5, f2 + 10.0f * f5, new bkt(170, 170, 170, (int)(f4 * 255.0f)));
        float f12 = gha.getColorPickerSquareX(f, f5);
        float f13 = gha.getColorPickerSquareY(f2, f5);
        float f14 = gha.getColorPickerTrackWidth(f3, f5);
        float f15 = 62.0f * f5;
        bkt bkt3 = bkt.tth_9(fArray[0], 1.0f, 1.0f).zdhgh_2(f4 * 255.0f);
        bkt bkt4 = new bkt(255, 255, 255, (int)(f4 * 255.0f));
        bkt bkt5 = new bkt(0, 0, 0, (int)(f4 * 255.0f));
        tadh.dza_6(bdhq2.method_51448(), f12, f13, f14, f15, jz_2.all(4.0f * f5), bkt4, bkt5, bkt5, bkt3);
        float f16 = f12 + f14 * fArray[1];
        float f17 = f13 + f15 * (1.0f - fArray[2]);
        float f18 = 8.0f * f5;
        tadh.khdhh(bdhq2.method_51448(), f16 - f18 / 2.0f, f17 - f18 / 2.0f, f18, f18, jz_2.all(f18 / 2.0f), this.themeAccent(f4 * 255.0f));
        float f19 = 4.0f * f5;
        tadh.khdhh(bdhq2.method_51448(), f16 - f19 / 2.0f, f17 - f19 / 2.0f, f19, f19, jz_2.all(f19 / 2.0f), bkt4);
        float f20 = f12;
        float f21 = gha.getColorPickerHueY(f2, f5);
        float f22 = f14;
        float f23 = 9.0f * f5;
        tadh.khdhh(bdhq2.method_51448(), f20 - 1.0f * f5, f21 - 1.0f * f5, f22 + 2.0f * f5, f23 + 2.0f * f5, jz_2.all(4.0f * f5), new bkt(32, 32, 32, (int)(f4 * 255.0f)));
        int n2 = 48;
        for (int i = 0; i < n2; ++i) {
            bkt bkt6 = bkt.tth_9((float)i / (float)(n2 - 1), 1.0f, 1.0f).zdhgh_2(f4 * 255.0f);
            tadh.ddhk(bdhq2.method_51448(), f20 + (float)i * f22 / (float)n2, f21, f22 / (float)n2 + 0.45f, f23, bkt6);
        }
        float f24 = f20 + f22 * fArray[0];
        tadh.khdhh(bdhq2.method_51448(), f24 - 3.0f * f5, f21 - 2.0f * f5, 6.0f * f5, f23 + 4.0f * f5, jz_2.all(3.0f * f5), this.themeAccent(f4 * 255.0f));
        tadh.khdhh(bdhq2.method_51448(), f24 - 1.5f * f5, f21 - 1.0f * f5, 3.0f * f5, f23 + 2.0f * f5, jz_2.all(1.5f * f5), bkt4);
        class_45872.method_22909();
    }

    private static void beginHudWidgetTransform(class_4587 class_45872, float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.5f + Math.max(0.0f, f5) * 0.5f;
        float f7 = f + f3 * 0.5f;
        float f8 = f2 + f4 * 0.5f;
        class_45872.method_22903();
        class_45872.method_46416(f7, f8, 0.0f);
        class_45872.method_22905(f6, f6, 1.0f);
        class_45872.method_46416(-f7, -f8, 0.0f);
    }

    private static float getColorPickerSquareX(float f, float f2) {
        return f + 8.0f * f2;
    }

    private static float getColorPickerSquareY(float f, float f2) {
        return f + 28.0f * f2;
    }

    private static float getColorPickerTrackWidth(float f, float f2) {
        return Math.max(1.0f, f - 16.0f * f2);
    }

    private static float getColorPickerHueY(float f, float f2) {
        return f + 99.0f * f2;
    }

    private bkt themeAccent(float f) {
        float f2 = class_3532.method_15363((float)f, (float)0.0f, (float)255.0f);
        return this.khky.zdhgh_2(f2);
    }

    private void renderThemesTab(bdhq bdhq2, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, float f7, float f8) {
        int n3;
        float f9 = f + f5 + 16.0f * f8;
        float f10 = f2 + f6 + 12.0f * f8;
        float f11 = f3 - f5 - 32.0f * f8;
        float f12 = f4 - f6 - 24.0f * f8;
        float f13 = 22.0f * f8;
        boolean bl = tdhb.khjgh(n, n2, f9, f10, f11, f13);
        tadh.khdhh(bdhq2.method_51448(), f9, f10, f11, f13, jz_2.all(4.0f * f8), bl ? new bkt(24, 24, 24, (int)(f7 * 255.0f)) : new bkt(18, 18, 18, (int)(f7 * 255.0f)));
        float f14 = bbk.jns.dht_10("Click to create new theme!", 11.0f * f8);
        bdhq2.drawText(bbk.jns.rdhz(11.0f * f8), "Click to create new theme!", f9 + (f11 - f14) / 2.0f, f10 + 6.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
        float f15 = f10 + 35.0f * f8;
        float f16 = f12 - 35.0f * f8;
        float f17 = 8.0f * f8;
        float f18 = 7.0f * f8;
        float f19 = (f11 - f17) / 2.0f;
        float f20 = 49.0f * f8;
        List list = this.getVisibleThemes();
        bdhq2.method_44379((int)f9, (int)f15, (int)(f9 + f11), (int)(f15 + f16));
        for (n3 = 0; n3 < list.size(); ++n3) {
            thz thz2 = (thz)list.get(n3);
            int n4 = n3 % 2;
            int n5 = n3 / 2;
            float f21 = f9 + (float)n4 * (f19 + f17);
            float f22 = f15 + this.tjn + (float)n5 * (f20 + f18);
            if (f22 + f20 < f15 || f22 > f15 + f16) continue;
            this.drawThemeCard(bdhq2, thz2, f21, f22, f19, f20, f7, f8);
        }
        bdhq2.method_44380();
        n3 = (list.size() + 1) / 2;
        float f23 = n3 == 0 ? 0.0f : (float)n3 * f20 + (float)Math.max(0, n3 - 1) * f18;
        float f24 = Math.min(0.0f, f16 - f23);
        this.rshz = class_3532.method_15363((float)this.rshz, (float)f24, (float)0.0f);
        this.tjn += (this.rshz - this.tjn) * 0.15f;
        this.rememberCurrentScroll();
        if (this.sjkh_2.hnf() > 0.01f) {
            this.renderThemeCreatorPanel(bdhq2, f, f2, f3, n, n2, f7, f8);
        }
    }

    private void drawThemeCard(bdhq bdhq2, thz thz2, float f, float f2, float f3, float f4, float f5, float f6) {
        tadh.khdhh(bdhq2.method_51448(), f, f2, f3, f4, jz_2.all(4.0f * f6), new bkt(18, 18, 18, (int)(f5 * 255.0f)));
        String string = this.ellipsizeEnd(thz2.getName(), bbk.jns, 11.0f * f6, f3 - 20.0f * f6);
        bdhq2.drawText(bbk.jns.rdhz(11.0f * f6), string, f + 10.0f * f6, f2 + 4.5f * f6, new bkt(255, 255, 255, (int)(f5 * 255.0f)));
        String string2 = this.formatThemeColor(thz2.rtd_3()) + " - " + this.formatThemeColor(thz2.dhdhh());
        bdhq2.drawText(bbk.jns.rdhz(7.75f * f6), string2, f + 10.0f * f6, f2 + 15.0f * f6, new bkt(103, 103, 103, (int)(f5 * 255.0f)));
        float f7 = f + 10.0f * f6;
        float f8 = f2 + 23.5f * f6;
        float f9 = f3 - 20.0f * f6;
        float f10 = f4 - 28.0f * f6;
        this.drawThemeWave(bdhq2, f7, f8, f9, f10, thz2.rtd_3(), thz2.dhdhh(), f5, f6);
    }

    private void drawThemeWave(bdhq bdhq2, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6) {
        float f7;
        float f8;
        int n3;
        Matrix4f matrix4f = bdhq2.method_51448().method_23760().method_23761();
        bkt bkt2 = new bkt(n);
        bkt bkt3 = new bkt(n2);
        int n4 = 256;
        float[] fArray = new float[n4 + 1];
        float[] fArray2 = new float[n4 + 1];
        float[] fArray3 = new float[n4 + 1];
        float[] fArray4 = new float[n4 + 1];
        for (n3 = 0; n3 <= n4; ++n3) {
            float f9 = (float)n3 / (float)n4;
            fArray[n3] = f + f3 * f9;
            fArray2[n3] = f2 + f4 * (1.0f - this.themePreviewWave(f9));
        }
        for (n3 = 0; n3 <= n4; ++n3) {
            int n5 = Math.max(0, n3 - 1);
            int n6 = Math.min(n4, n3 + 1);
            float f10 = fArray[n6] - fArray[n5];
            f8 = fArray2[n6] - fArray2[n5];
            f7 = Math.max(1.0E-4f, (float)Math.sqrt(f10 * f10 + f8 * f8));
            fArray3[n3] = -f8 / f7;
            fArray4[n3] = f10 / f7;
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        bkt bkt4 = bkt2.zdhgh_2(f5 * 225.0f);
        bkt bkt5 = bkt3.zdhgh_2(f5 * 225.0f);
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        for (int i = 0; i < n4; ++i) {
            f8 = (float)i / (float)n4;
            f7 = (float)(i + 1) / (float)n4;
            bkt bkt6 = bkt.jsh(bkt4, bkt5, f8);
            bkt bkt7 = bkt.jsh(bkt4, bkt5, f7);
            float f11 = fArray[i];
            float f12 = fArray2[i];
            float f13 = fArray[i + 1];
            float f14 = fArray2[i + 1];
            float f15 = 0.58f * f6;
            float f16 = f11 + fArray3[i] * f15;
            float f17 = f12 + fArray4[i] * f15;
            float f18 = f13 + fArray3[i + 1] * f15;
            float f19 = f14 + fArray4[i + 1] * f15;
            class_2872.method_22918(matrix4f, f11, f2 + f4, 0.0f).method_39415(bkt6.btkh());
            class_2872.method_22918(matrix4f, f13, f2 + f4, 0.0f).method_39415(bkt7.btkh());
            class_2872.method_22918(matrix4f, f18, f19, 0.0f).method_39415(bkt7.btkh());
            class_2872.method_22918(matrix4f, f11, f2 + f4, 0.0f).method_39415(bkt6.btkh());
            class_2872.method_22918(matrix4f, f18, f19, 0.0f).method_39415(bkt7.btkh());
            class_2872.method_22918(matrix4f, f16, f17, 0.0f).method_39415(bkt6.btkh());
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        this.drawThemeWaveFeather(matrix4f, fArray, fArray2, fArray3, fArray4, bkt2, bkt3, f6, f5);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void drawThemeWaveFeather(Matrix4f matrix4f, float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4, bkt bkt2, bkt bkt3, float f, float f2) {
        int n = fArray.length - 1;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        float f3 = 1.45f * f;
        float f4 = 0.18f * f;
        float f5 = 0.62f * f;
        for (int i = 0; i < n; ++i) {
            int n2 = i + 1;
            bkt bkt4 = bkt.jsh(bkt2, bkt3, (float)i / (float)n).zdhgh_2(f2 * 255.0f);
            bkt bkt5 = bkt.jsh(bkt2, bkt3, (float)n2 / (float)n).zdhgh_2(f2 * 255.0f);
            bkt bkt6 = bkt4.rwh_2(0);
            bkt bkt7 = bkt5.rwh_2(0);
            float f6 = fArray[i] - fArray3[i] * f3;
            float f7 = fArray2[i] - fArray4[i] * f3;
            float f8 = fArray[n2] - fArray3[n2] * f3;
            float f9 = fArray2[n2] - fArray4[n2] * f3;
            float f10 = fArray[i] - fArray3[i] * f4;
            float f11 = fArray2[i] - fArray4[i] * f4;
            float f12 = fArray[n2] - fArray3[n2] * f4;
            float f13 = fArray2[n2] - fArray4[n2] * f4;
            float f14 = fArray[i] + fArray3[i] * f5;
            float f15 = fArray2[i] + fArray4[i] * f5;
            float f16 = fArray[n2] + fArray3[n2] * f5;
            float f17 = fArray2[n2] + fArray4[n2] * f5;
            class_2872.method_22918(matrix4f, f6, f7, 0.0f).method_39415(bkt6.btkh());
            class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_39415(bkt7.btkh());
            class_2872.method_22918(matrix4f, f12, f13, 0.0f).method_39415(bkt5.btkh());
            class_2872.method_22918(matrix4f, f6, f7, 0.0f).method_39415(bkt6.btkh());
            class_2872.method_22918(matrix4f, f12, f13, 0.0f).method_39415(bkt5.btkh());
            class_2872.method_22918(matrix4f, f10, f11, 0.0f).method_39415(bkt4.btkh());
            class_2872.method_22918(matrix4f, f10, f11, 0.0f).method_39415(bkt4.btkh());
            class_2872.method_22918(matrix4f, f12, f13, 0.0f).method_39415(bkt5.btkh());
            class_2872.method_22918(matrix4f, f16, f17, 0.0f).method_39415(bkt5.btkh());
            class_2872.method_22918(matrix4f, f10, f11, 0.0f).method_39415(bkt4.btkh());
            class_2872.method_22918(matrix4f, f16, f17, 0.0f).method_39415(bkt5.btkh());
            class_2872.method_22918(matrix4f, f14, f15, 0.0f).method_39415(bkt4.btkh());
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private float themePreviewWave(float f) {
        if ((f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f)) < 0.28f) {
            float f2 = f / 0.28f;
            return this.cubicWavePoint(0.08f, 0.5f, 0.76f, 0.72f, f2);
        }
        if (f < 0.56f) {
            float f3 = (f - 0.28f) / 0.28f;
            return this.cubicWavePoint(0.72f, 0.68f, 0.52f, 0.52f, f3);
        }
        float f4 = (f - 0.56f) / 0.44f;
        return this.cubicWavePoint(0.52f, 0.52f, 0.74f, 0.98f, f4);
    }

    private float cubicWavePoint(float f, float f2, float f3, float f4, float f5) {
        float f6 = 1.0f - f5;
        return f6 * f6 * f6 * f + 3.0f * f6 * f6 * f5 * f2 + 3.0f * f6 * f5 * f5 * f3 + f5 * f5 * f5 * f4;
    }

    private void renderThemeCreatorPanel(bdhq bdhq2, float f, float f2, float f3, int n, int n2, float f4, float f5) {
        float f6;
        float f7 = this.sjkh_2.hnf();
        float f8 = Math.max(0.0f, f7);
        f4 *= class_3532.method_15363((float)f8, (float)0.0f, (float)1.0f);
        float f9 = this.getThemeCreatorPanelX(f, f3, f5);
        float f10 = this.getThemeCreatorPanelY(f2, f5);
        float f11 = 122.0f * f5;
        float f12 = 84.0f * f5;
        class_4587 class_45872 = bdhq2.method_51448();
        gha.beginHudWidgetTransform(class_45872, f9, f10, f11, f12, f8);
        tadh.khdhh(bdhq2.method_51448(), f9, f10, f11, f12, jz_2.all(5.0f * f5), new bkt(18, 18, 18, (int)(f4 * 255.0f)));
        float f13 = f9 + 5.0f * f5;
        float f14 = f10 + 5.0f * f5;
        float f15 = 112.0f * f5;
        float f16 = 17.0f * f5;
        tadh.khdhh(bdhq2.method_51448(), f13, f14, f15, f16, jz_2.all(2.0f * f5), new bkt(24, 24, 24, (int)(f4 * 255.0f)));
        String string = this.tmdh.isEmpty() && !this.zh_4 ? "Enter theme name..." : this.tmdh + (this.zh_4 && System.currentTimeMillis() % 1000L > 500L ? "|" : "");
        string = this.fitTextFromEnd(string, bbk.jns, 7.75f * f5, f15 - 8.0f * f5);
        bdhq2.drawText(bbk.jns.rdhz(7.75f * f5), string, f13 + 4.0f * f5, f14 + 4.5f * f5, this.tmdh.isEmpty() && !this.zh_4 ? new bkt(103, 103, 103, (int)(f4 * 255.0f)) : new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        float f17 = f10 + 27.0f * f5;
        float f18 = 54.0f * f5;
        float f19 = 23.0f * f5;
        float f20 = f9 + 5.0f * f5;
        float f21 = f9 + 63.0f * f5;
        tadh.khdhh(bdhq2.method_51448(), f20, f17, f18, f19, jz_2.all(4.0f * f5), new bkt(this.zfz_2).zdhgh_2(f4 * 255.0f));
        tadh.khdhh(bdhq2.method_51448(), f21, f17, f18, f19, jz_2.all(4.0f * f5), new bkt(this.thzt_2).zdhgh_2(f4 * 255.0f));
        if (this.sthd_2 != 0) {
            f6 = this.sthd_2 == 1 ? f20 : f21;
            tadh.aad(bdhq2.method_51448(), f6, f17, f18, f19, 1.0f * f5, jz_2.all(4.0f * f5), new bkt(255, 255, 255, (int)(f4 * 230.0f)));
        }
        f6 = f9 + 5.0f * f5;
        float f22 = f10 + 60.0f * f5;
        float f23 = 112.0f * f5;
        float f24 = 17.0f * f5;
        boolean bl = tdhb.khjgh(n, n2, f6, f22, f23, f24);
        tadh.khdhh(bdhq2.method_51448(), f6, f22, f23, f24, jz_2.all(2.0f * f5), bl ? new bkt(28, 28, 28, (int)(f4 * 255.0f)) : new bkt(24, 24, 24, (int)(f4 * 255.0f)));
        bdhq2.drawText(bbk.jns.rdhz(7.75f * f5), "Click to confirm", f6 + 4.0f * f5, f22 + 4.5f * f5, new bkt(255, 255, 255, (int)(f4 * 255.0f)));
        class_45872.method_22909();
        float f25 = this.shwf.hnf();
        if (f25 > 0.01f) {
            this.renderThemeColorPicker(bdhq2, this.getThemeColorPickerX(f9, f5), this.getThemeColorPickerY(f10, f5), f4, f5, f25);
        }
    }

    private void renderThemeColorPicker(bdhq bdhq2, float f, float f2, float f3, float f4, float f5) {
        int n = this.shzm_2 == 1 ? this.zfz_2 : this.thzt_2;
        String string = this.shzm_2 == 1 ? "Primary color" : "Secondary color";
        this.renderHsvColorPicker(bdhq2, f, f2, 184.0f * f4, this.ttm_2, n, string, f3, f4, f5);
    }

    private List getVisibleThemes() {
        String string = this.khaa_3.trim().toLowerCase(Locale.ROOT);
        List list = bza.getInstance().getThemeManager().thtdh_2();
        if (!string.isEmpty()) {
            list.removeIf(arg_0 -> gha.lambda$getVisibleThemes$6(string, arg_0));
        }
        return list;
    }

    private float getThemeCreatorPanelX(float f, float f2, float f3) {
        float f4 = f + f2 + 19.0f * f3;
        float f5 = 122.0f * f3;
        float f6 = f4 + f5 <= (float)this.field_22789 - 4.0f ? f4 : f + f2 - f5 - 8.0f * f3;
        return f6;
    }

    private float getThemeCreatorPanelY(float f, float f2) {
        return f + 21.0f * f2;
    }

    private float getThemeColorPickerX(float f, float f2) {
        return class_3532.method_15363((float)f, (float)4.0f, (float)((float)this.field_22789 - 184.0f * f2 - 4.0f));
    }

    private float getThemeColorPickerY(float f, float f2) {
        float f3 = f + 89.0f * f2;
        return class_3532.method_15363((float)f3, (float)4.0f, (float)((float)this.field_22790 - 118.0f * f2 - 4.0f));
    }

    private String formatThemeColor(int n) {
        return String.format(Locale.ROOT, "#%06X", n & 0xFFFFFF);
    }

    private boolean handleThemesTabClick(double d, double d2, int n, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = f + f5 + 16.0f * f7;
        float f15 = f2 + f6 + 12.0f * f7;
        float f16 = f3 - f5 - 32.0f * f7;
        if (n == 0 && tdhb.khjgh(d, d2, f14, f15, f16, 22.0f * f7)) {
            this.sthz_3 = !this.sthz_3;
            this.zh_4 = false;
            this.sthd_2 = 0;
            this.dhjn = -1;
            khgh.dda_5(this.sthz_3 ? khgh.ztz_3 : khgh.rbr);
            return true;
        }
        if (this.sthz_3 && this.sjkh_2.hnf() > 0.85f) {
            f13 = this.getThemeCreatorPanelX(f, f3, f7);
            f12 = this.getThemeCreatorPanelY(f2, f7);
            f11 = f13 + 5.0f * f7;
            f10 = f12 + 5.0f * f7;
            if (n == 0 && tdhb.khjgh(d, d2, f11, f10, 112.0f * f7, 17.0f * f7)) {
                this.zh_4 = true;
                this.sthd_2 = 0;
                return true;
            }
            f9 = f12 + 27.0f * f7;
            if (n == 0 && tdhb.khjgh(d, d2, f13 + 5.0f * f7, f9, 54.0f * f7, 23.0f * f7)) {
                this.activateThemeColor(1);
                return true;
            }
            if (n == 0 && tdhb.khjgh(d, d2, f13 + 63.0f * f7, f9, 54.0f * f7, 23.0f * f7)) {
                this.activateThemeColor(2);
                return true;
            }
            if (n == 0 && tdhb.khjgh(d, d2, f13 + 5.0f * f7, f12 + 60.0f * f7, 112.0f * f7, 17.0f * f7)) {
                this.createThemeFromDraft();
                return true;
            }
            if (this.sthd_2 != 0 && this.shwf.hnf() > 0.85f) {
                float f17 = this.getThemeColorPickerX(f13, f7);
                float f18 = this.getThemeColorPickerY(f12, f7);
                f8 = 184.0f * f7;
                int n2 = this.getColorPickerControl(d, d2, f17, f18, f8, f7);
                if (n == 0 && n2 >= 0) {
                    this.dhjn = n2;
                    this.updateThemeColorFromMouse((float)d, (float)d2, f17, f18, f8, f7);
                    return true;
                }
            }
        }
        this.zh_4 = false;
        f13 = f15 + 35.0f * f7;
        f12 = 8.0f * f7;
        f11 = 7.0f * f7;
        f10 = (f16 - f12) / 2.0f;
        f9 = 49.0f * f7;
        List list = this.getVisibleThemes();
        for (int i = 0; i < list.size(); ++i) {
            f8 = f14 + (float)(i % 2) * (f10 + f12);
            float f19 = f13 + this.tjn + (float)(i / 2) * (f9 + f11);
            if (!tdhb.khjgh(d, d2, f8, f19, f10, f9)) continue;
            if (n == 0) {
                bza.getInstance().getThemeManager().rty_2((thz)list.get(i));
                khgh.dda_5(khgh.tas_4);
            } else if (n == 1) {
                this.deleteTheme((thz)list.get(i));
            }
            return true;
        }
        return true;
    }

    private void activateThemeColor(int n) {
        this.sthd_2 = n;
        this.shzm_2 = n;
        this.dhjn = -1;
        this.zh_4 = false;
        int n2 = n == 1 ? this.zfz_2 : this.thzt_2;
        Color color = new Color(n2, true);
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), this.ttm_2);
        khgh.dda_5(khgh.tas_4);
    }

    private void deleteTheme(thz thz2) {
        if (thz2 == null || this.isBuiltInTheme(thz2.getName())) {
            return;
        }
        String string = thz2.getName();
        bkhl bkhl2 = bza.getInstance().getThemeManager();
        thz thz3 = bkhl2.bzm();
        boolean bl = thz3 != null && thz3.getName().equalsIgnoreCase(string);
        tdm tdm2 = tdm.zkm_2();
        boolean bl2 = tdm2.tsn_2(string);
        boolean bl3 = tthw.sfs_3().ttt_6().removeIf(arg_0 -> gha.lambda$deleteTheme$7(string, arg_0));
        if (!bl2 && !bl3) {
            Moondlc.dhrn.warn("Could not remove theme '{}' because it was not found", (Object)string);
            return;
        }
        if (!bl2) {
            Moondlc.dhrn.warn("Theme '{}' was removed from the UI, but its file could not be deleted", (Object)string);
        }
        if (bl) {
            tthw tthw2 = tthw.sfs_3();
            tthw2.ghtz_2(tthw2.aghz());
            tthw2.thhsh(true);
        }
        bkhl2.rsb_2();
        if (bl) {
            bkhl2.rty_2(bkhl2.thgh());
        }
        khgh.dda_5(khgh.rbr);
    }

    private boolean isBuiltInTheme(String string) {
        return string == null || string.equalsIgnoreCase("MoonDLC") || string.equalsIgnoreCase("Dark") || string.equalsIgnoreCase("Light");
    }

    private void updateThemeColorFromMouse(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.sthd_2 == 0 || this.dhjn < 0 || f6 <= 0.0f) {
            return;
        }
        this.updateHsbFromMouse(this.ttm_2, this.dhjn, f, f2, f3, f4, f5, f6);
        int n = Color.HSBtoRGB(this.ttm_2[0], this.ttm_2[1], this.ttm_2[2]);
        if (this.sthd_2 == 1) {
            this.zfz_2 = n;
        } else {
            this.thzt_2 = n;
        }
    }

    private void openModuleColorPicker(bzm_2 bzm2) {
        if (this.khsw == bzm2 && this.shlq) {
            this.closeModuleColorPicker();
            khgh.dda_5(khgh.rbr);
            return;
        }
        if (this.khsw != bzm2) {
            this.sht.bzs_2();
        }
        this.khsw = bzm2;
        this.shlq = true;
        this.bmm = -1;
        Color.RGBtoHSB(bzm2.skhgh_2().khyh_2(), bzm2.skhgh_2().shghs_2(), bzm2.skhgh_2().shaz(), this.trj);
        this.rnw = null;
        khgh.dda_5(khgh.ztz_3);
    }

    private float getModuleColorPickerProgress(bzm_2 bzm2) {
        return this.khsw == bzm2 ? this.sht.hnf() : 0.0f;
    }

    private void positionEmbeddedModuleColorPicker(float f, float f2, float f3, float f4) {
        this.hyz_2 = Math.max(144.0f * f4, f2 - 28.0f * f4);
        this.rbh_2 = f + (f2 - this.hyz_2) / 2.0f;
        this.dhja_2 = f3 + 28.0f * f4;
    }

    private boolean handleModuleColorPickerClick(double d, double d2, int n, float f) {
        if (this.khsw == null) {
            return false;
        }
        float f2 = 118.0f * f;
        if (!tdhb.khjgh(d, d2, this.rbh_2, this.dhja_2, this.hyz_2, f2)) {
            return false;
        }
        if (n != 0) {
            return true;
        }
        int n2 = this.getColorPickerControl(d, d2, this.rbh_2, this.dhja_2, this.hyz_2, f);
        if (n2 >= 0) {
            this.bmm = n2;
            this.updateModuleColorFromMouse((float)d, (float)d2, f);
        }
        return true;
    }

    private void updateModuleColorFromMouse(float f, float f2, float f3) {
        if (this.khsw == null || this.bmm < 0 || f3 <= 0.0f) {
            return;
        }
        this.updateHsbFromMouse(this.trj, this.bmm, f, f2, this.rbh_2, this.dhja_2, this.hyz_2, f3);
        this.khsw.bhs_2(Color.HSBtoRGB(this.trj[0], this.trj[1], this.trj[2]));
    }

    private int getColorPickerControl(double d, double d2, float f, float f2, float f3, float f4) {
        float f5 = gha.getColorPickerSquareX(f, f4);
        float f6 = gha.getColorPickerTrackWidth(f3, f4);
        if (tdhb.khjgh(d, d2, f5, gha.getColorPickerSquareY(f2, f4), f6, 62.0f * f4)) {
            return 0;
        }
        if (tdhb.khjgh(d, d2, f5, gha.getColorPickerHueY(f2, f4), f6, 9.0f * f4)) {
            return 1;
        }
        return -1;
    }

    private void updateHsbFromMouse(float[] fArray, int n, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = gha.getColorPickerSquareX(f3, f6);
        float f8 = gha.getColorPickerTrackWidth(f5, f6);
        if (n == 0) {
            float f9 = gha.getColorPickerSquareY(f4, f6);
            float f10 = 62.0f * f6;
            fArray[1] = class_3532.method_15363((float)((f - f7) / f8), (float)0.0f, (float)1.0f);
            fArray[2] = 1.0f - class_3532.method_15363((float)((f2 - f9) / f10), (float)0.0f, (float)1.0f);
        } else if (n == 1) {
            fArray[0] = class_3532.method_15363((float)((f - f7) / f8), (float)0.0f, (float)1.0f);
        }
    }

    private void closeModuleColorPicker() {
        this.shlq = false;
        this.bmm = -1;
    }

    private void createThemeFromDraft() {
        String string = this.tmdh.trim();
        String string2 = this.uniqueThemeName(string.isEmpty() ? "Custom" : string);
        fd fd2 = new fd(string2);
        for (Object object : fd2.tjz()) {
            if (((lsh)object).getName().equalsIgnoreCase("Primary")) {
                ((lsh)object).rhm(new Color(this.zfz_2, true));
                continue;
            }
            if (!((lsh)object).getName().equalsIgnoreCase("Secondary")) continue;
            ((lsh)object).rhm(new Color(this.thzt_2, true));
        }
        tdm.zkm_2().ghhth(fd2);
        tthw.sfs_3().ttt_6().add(new thw(fd2));
        bza.getInstance().getThemeManager().rsb_2();
        for (Object object : bza.getInstance().getThemeManager().thtdh_2()) {
            if (!((thz)object).getName().equalsIgnoreCase(string2)) continue;
            bza.getInstance().getThemeManager().rty_2((thz)object);
            break;
        }
        this.tmdh = "";
        this.sthz_3 = false;
        this.zh_4 = false;
        this.sthd_2 = 0;
        this.dhjn = -1;
        khgh.dda_5(khgh.tas_4);
    }

    private String uniqueThemeName(String string) {
        String string2 = string.isBlank() ? "Custom" : string;
        HashSet<String> hashSet = new HashSet<String>();
        for (thz thz2 : bza.getInstance().getThemeManager().thtdh_2()) {
            hashSet.add(thz2.getName().toLowerCase(Locale.ROOT));
        }
        Object object = string2;
        int n = 2;
        while (hashSet.contains(((String)object).toLowerCase(Locale.ROOT))) {
            object = string2 + " " + n++;
        }
        return object;
    }

    private void renderConfigsTab(bdhq bdhq2, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, float f7, float f8) {
        float f9;
        int n3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = f + f5 + 16.0f * f8;
        float f17 = f2 + f6 + 12.0f * f8;
        float f18 = f3 - f5 - 32.0f * f8;
        float f19 = f4 - f6 - 24.0f * f8;
        float f20 = f16 + f18 - 150.0f * f8;
        float f21 = 68.0f * f8;
        float f22 = f16 + (f18 - f21) / 2.0f;
        float f23 = f22 - f16 - 8.0f * f8;
        float f24 = 34.0f * f8;
        tadh.khdhh(bdhq2.method_51448(), f16, f17, f23, f24, jz_2.all(6.0f * f8), new bkt(18, 18, 18, (int)(f7 * 255.0f)));
        bdhq2.drawText(bbk.tshdh.rdhz(12.0f * f8), tjb, f16 + 10.0f * f8, f17 + 11.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
        Object object = this.khath_2.isEmpty() ? (this.ban ? "Search" + this.animatedSearchDots() : "Search...") : this.khath_2 + (this.ban ? this.animatedSearchDots() : "");
        object = this.fitTextFromEnd((String)object, bbk.rqdh, 12.0f * f8, f23 - 40.0f * f8);
        bkt bkt2 = this.khath_2.isEmpty() && !this.ban ? new bkt(103, 103, 103, (int)(f7 * 255.0f)) : new bkt(255, 255, 255, (int)(f7 * 255.0f));
        bdhq2.drawText(bbk.rqdh.rdhz(12.0f * f8), (String)object, f16 + 28.0f * f8, f17 + 11.0f * f8, bkt2);
        boolean bl = tdhb.khjgh(n, n2, f22, f17, f21, f24);
        tadh.khdhh(bdhq2.method_51448(), f22, f17, f21, f24, jz_2.all(6.0f * f8), bl ? this.themeAccent(f7 * 255.0f) : new bkt(18, 18, 18, (int)(f7 * 255.0f)));
        float f25 = bbk.jns.dht_10("Themes", 11.0f * f8);
        bdhq2.drawText(bbk.jns.rdhz(11.0f * f8), "Themes", f22 + (f21 - f25) / 2.0f, f17 + 11.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
        for (int i = 0; i < 4; ++i) {
            f15 = f20 + (float)i * 40.0f * f8;
            boolean bl2 = tdhb.khjgh(n, n2, f15, f17, 34.0f * f8, 34.0f * f8);
            bkt bkt3 = bl2 ? this.themeAccent(f7 * 255.0f) : new bkt(18, 18, 18, (int)(f7 * 255.0f));
            bkt bkt4 = new bkt(255, 255, 255, (int)(f7 * 255.0f));
            tadh.khdhh(bdhq2.method_51448(), f15, f17, 34.0f * f8, 34.0f * f8, jz_2.all(6.0f * f8), bkt3);
            String string = "";
            if (i == 0) {
                string = "";
            } else if (i == 1) {
                string = "";
            } else if (i == 2) {
                string = "";
            } else if (i == 3) {
                string = "";
            }
            f14 = 14.0f * f8;
            f13 = bbk.agh.dht_10(string, f14);
            f12 = f15 + 34.0f * f8 / 2.0f - f13 / 2.0f + 1.0f * f8;
            float f26 = f17 + 15.0f * f8;
            bdhq2.drawText(bbk.agh.rdhz(f14), string, f12, f26, bkt4);
        }
        ArrayList<String> arrayList = new ArrayList<String>(bhdh.khsb().ml());
        if (!this.khath_2.isEmpty()) {
            arrayList.removeIf(this::lambda$renderConfigsTab$8);
        }
        arrayList.sort(this::lambda$renderConfigsTab$9);
        f15 = f17 + 46.0f * f8;
        float f27 = f19 - 46.0f * f8;
        bdhq2.method_44379((int)f16, (int)f15, (int)(f16 + f18), (int)(f15 + f27));
        int n4 = 13;
        boolean bl3 = f3 >= 600.0f * f8;
        float f28 = bl3 ? (f18 - (float)n4 * f8) / 2.0f : f18;
        f14 = 64.0f * f8;
        f13 = f15 + this.tjn;
        f12 = f15 + this.tjn;
        String string = bhdh.khsb().dhth_3();
        for (int i = 0; i < arrayList.size(); ++i) {
            String string2 = (String)arrayList.get(i);
            boolean bl4 = !bl3 || f13 <= f12;
            f11 = bl4 ? f16 : f16 + f28 + (float)n4 * f8;
            float f29 = f10 = bl4 ? f13 : f12;
            if (f10 + f14 >= f15 && f10 <= f15 + f27) {
                float f30;
                float f31;
                boolean bl5 = string2.equalsIgnoreCase(string);
                n3 = tdhb.khjgh(n, n2, f11, f10, f28, f14);
                tadh.khdhh(bdhq2.method_51448(), f11, f10, f28, f14, jz_2.all(8.0f * f8), new bkt(18, 18, 18, (int)(f7 * 255.0f)));
                if (!bl5 && n3 != 0) {
                    tadh.aad(bdhq2.method_51448(), f11, f10, f28, f14, 0.75f * f8, jz_2.all(8.0f * f8), new bkt(112, 112, 112, (int)(f7 * 140.0f)));
                }
                float f32 = 44.0f * f8;
                f9 = f11 + 10.0f * f8;
                float f33 = f10 + 10.0f * f8;
                hj_2 hj2_2 = bhdh.khsb().dhjs(string2);
                this.drawConfigServerIcon(bdhq2, f9, f33, f32, hj2_2, f7, f8);
                String string3 = this.ellipsizeEnd(string2, bbk.jns, 14.0f * f8, f28 - 96.0f * f8);
                bdhq2.drawText(bbk.jns.rdhz(14.0f * f8), string3, f11 + 64.0f * f8, f10 + 10.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
                String string4 = new SimpleDateFormat("dd.MM.yyyy").format(new Date(hj2_2.createdAt()));
                bdhq2.drawText(bbk.rqdh.rdhz(9.0f * f8), string4, f11 + 64.0f * f8, f10 + 26.0f * f8, new bkt(103, 103, 103, (int)(f7 * 255.0f)));
                String[] stringArray = new String[]{"", "", ""};
                for (int j = 0; j < 3; ++j) {
                    f31 = f11 + 64.0f * f8 + (float)j * 24.0f * f8;
                    f30 = f10 + 42.0f * f8;
                    float f34 = 18.0f * f8;
                    float f35 = 14.0f * f8;
                    boolean bl6 = tdhb.khjgh(n, n2, f31, f30, f34, f35);
                    bkt bkt5 = bl6 ? this.themeAccent(f7 * 255.0f) : new bkt(48, 48, 48, (int)(f7 * 255.0f));
                    tadh.khdhh(bdhq2.method_51448(), f31, f30, f34, f35, jz_2.all(3.0f * f8), bkt5);
                    bkt bkt6 = new bkt(255, 255, 255, (int)(f7 * 255.0f));
                    float f36 = 10.0f * f8;
                    float f37 = bbk.agh.dht_10(stringArray[j], f36);
                    float f38 = f31 + f34 / 2.0f - f37 / 2.0f + 0.8f * f8;
                    float f39 = f30 + 5.5f * f8;
                    bdhq2.drawText(bbk.agh.rdhz(f36), stringArray[j], f38, f39, bkt6);
                }
                float f40 = 12.0f * f8;
                f31 = f11 + f28 - 20.0f * f8;
                f30 = f10 + 10.0f * f8;
                bkt bkt7 = bl5 ? this.themeAccent(f7 * 255.0f).jkd_2(0.22f) : new bkt(48, 48, 48, (int)(f7 * 255.0f));
                bkt bkt8 = bl5 ? this.themeAccent(f7 * 255.0f) : new bkt(117, 117, 117, (int)(f7 * 255.0f));
                tadh.khdhh(bdhq2.method_51448(), f31, f30, f40, f40, jz_2.all(f40 / 2.0f), bkt7);
                tadh.khdhh(bdhq2.method_51448(), f31 + 2.0f * f8, f30 + 2.0f * f8, f40 - 4.0f * f8, f40 - 4.0f * f8, jz_2.all((f40 - 4.0f * f8) / 2.0f), bkt8);
            }
            if (bl4) {
                f13 += f14 + (float)n4 * f8;
                continue;
            }
            f12 += f14 + (float)n4 * f8;
        }
        float f41 = -(Math.max(f13, f12) - this.tjn - f27 - f15);
        if (f41 > 0.0f) {
            f41 = 0.0f;
        }
        this.rshz = class_3532.method_15363((float)this.rshz, (float)f41, (float)0.0f);
        this.tjn += (this.rshz - this.tjn) * 0.15f;
        this.rememberCurrentScroll();
        bdhq2.method_44380();
        if (this.hfn) {
            float f42 = 108.0f * f8;
            float f43 = 80.0f * f8;
            f11 = f20 + 120.0f * f8 - f42 + 34.0f * f8;
            f10 = f17 + 38.0f * f8;
            tadh.khdhh(bdhq2.method_51448(), f11, f10, f42, f43, jz_2.all(6.0f * f8), new bkt(21, 21, 21, (int)(f7 * 255.0f)));
            String[] stringArray = new String[]{"Sort for A-Z", "Sort for Z-A", "Sort for Oldest", "Sort for Newest"};
            for (n3 = 0; n3 < 4; ++n3) {
                boolean bl7 = this.stt_6 == n3;
                f9 = f10 + (4.0f + (float)n3 * 17.0f) * f8;
                if (bl7) {
                    tadh.khdhh(bdhq2.method_51448(), f11 + 3.0f * f8, f9, 102.0f * f8, 17.0f * f8, jz_2.all(4.0f * f8), this.themeAccent(f7 * 255.0f));
                }
                bkt bkt9 = bl7 ? new bkt(255, 255, 255, (int)(f7 * 255.0f)) : new bkt(180, 180, 180, (int)(f7 * 255.0f));
                bdhq2.drawText(bbk.jns.rdhz(12.0f * f8), stringArray[n3], f11 + 8.0f * f8, f9 + 4.0f * f8, bkt9);
            }
        }
        if (this.dtr_2) {
            float f44 = 110.0f * f8;
            float f45 = 57.0f * f8;
            f11 = f20;
            f10 = f17 + 38.0f * f8;
            tadh.khdhh(bdhq2.method_51448(), f11, f10, f44, f45, jz_2.all(6.0f * f8), new bkt(21, 21, 21, (int)(f7 * 255.0f)));
            float f46 = f10 + 10.0f * f8;
            tadh.khdhh(bdhq2.method_51448(), f11 + 8.0f * f8, f46, 94.0f * f8, 19.0f * f8, jz_2.all(4.0f * f8), new bkt(27, 27, 27, (int)(f7 * 255.0f)));
            if (this.fd.isEmpty() && !this.khrt) {
                bdhq2.drawText(bbk.jns.rdhz(10.0f * f8), "Enter Name...", f11 + 12.0f * f8, f46 + 5.0f * f8, new bkt(103, 103, 103, (int)(f7 * 255.0f)));
            } else {
                Object object2 = this.fd + (this.khrt ? this.animatedSearchDots() : "");
                object2 = this.fitTextFromEnd((String)object2, bbk.jns, 10.0f * f8, 86.0f * f8);
                bdhq2.drawText(bbk.jns.rdhz(10.0f * f8), (String)object2, f11 + 12.0f * f8, f46 + 5.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
            }
            float f47 = f10 + 35.0f * f8;
            boolean bl8 = tdhb.khjgh(n, n2, f11 + 8.0f * f8, f47, 94.0f * f8, 13.0f * f8);
            bkt bkt10 = bl8 ? this.themeAccent(f7 * 255.0f) : new bkt(27, 27, 27, (int)(f7 * 255.0f));
            tadh.khdhh(bdhq2.method_51448(), f11 + 8.0f * f8, f47, 94.0f * f8, 13.0f * f8, jz_2.all(3.0f * f8), bkt10);
            bdhq2.drawText(bbk.jqy.rdhz(8.0f * f8), "s", f11 + 18.0f * f8, f47 + 3.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
            bdhq2.drawText(bbk.jns.rdhz(10.0f * f8), "Confirm", f11 + 32.0f * f8, f47 + 3.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
        }
    }

    private void renderFriendsTab(bdhq bdhq2, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, float f7, float f8) {
        float f9 = f + f5 + 16.0f * f8;
        float f10 = f2 + f6 + 12.0f * f8;
        float f11 = f3 - f5 - 32.0f * f8;
        float f12 = f4 - f6 - 24.0f * f8;
        List list = Moondlc.getInstance().getFriendManager().hkha_2();
        float f13 = f10;
        float f14 = f12;
        if (list.isEmpty()) {
            float f15 = f9 + f11 / 2.0f;
            float f16 = f10 + f12 / 2.0f - 10.0f * f8;
            float f17 = bbk.jqy.dht_10("2", 32.0f * f8);
            bdhq2.drawText(bbk.jqy.rdhz(32.0f * f8), "2", f15 - f17 / 2.0f, f16 - 25.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
            String string = "No friends.";
            float f18 = bbk.khzk.dht_10(string, 20.0f * f8);
            bdhq2.drawText(bbk.khzk.rdhz(20.0f * f8), string, f15 - f18 / 2.0f, f16 + 12.0f * f8, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
            String string2 = "You don't have any friends right now! Click to add.";
            float f19 = bbk.rqdh.dht_10(string2, 11.0f * f8);
            bdhq2.drawText(bbk.rqdh.rdhz(11.0f * f8), string2, f15 - f19 / 2.0f, f16 + 38.0f * f8, new bkt(130, 130, 130, (int)(f7 * 255.0f)));
        } else {
            int n3;
            bdhq2.method_44379((int)f9, (int)f13, (int)(f9 + f11), (int)(f13 + f14));
            float f20 = (f11 - 12.0f * f8) / 2.0f;
            float f21 = 32.0f * f8;
            float f22 = 12.0f * f8;
            float f23 = 8.0f * f8;
            float f24 = f13 + this.tjn;
            for (n3 = 0; n3 < list.size(); ++n3) {
                String string = (String)list.get(n3);
                int n4 = n3 % 2;
                int n5 = n3 / 2;
                float f25 = f9 + (float)n4 * (f20 + f22);
                float f26 = f24 + (float)n5 * (f21 + f23);
                if (f26 + f21 < f13 || f26 > f13 + f14) continue;
                boolean bl = tdhb.khjgh(n, n2, f25, f26, f20, f21);
                bkt bkt2 = bl ? new bkt(24, 24, 26, (int)(f7 * 255.0f)) : new bkt(18, 18, 19, (int)(f7 * 255.0f));
                tadh.khdhh(bdhq2.method_51448(), f25, f26, f20, f21, jz_2.all(6.0f * f8), bkt2);
                tadh.khdhh(bdhq2.method_51448(), f25, f26, f20, f21, jz_2.all(6.0f * f8), new bkt(35, 35, 38, (int)(f7 * 100.0f)));
                float f27 = 20.0f * f8;
                float f28 = f25 + 6.0f * f8;
                float f29 = f26 + (f21 - f27) / 2.0f;
                this.drawPlayerHead(bdhq2, string, f28, f29, f27);
                float f30 = f25 + 32.0f * f8;
                bdhq2.drawText(bbk.jns.rdhz(11.5f * f8), string, f30, f26 + (f21 - 11.5f * f8) / 2.0f, new bkt(255, 255, 255, (int)(f7 * 255.0f)));
            }
            n3 = (list.size() + 1) / 2;
            float f31 = (float)n3 * f21 + (float)Math.max(0, n3 - 1) * f23;
            float f32 = Math.min(0.0f, f14 - f31);
            this.rshz = class_3532.method_15363((float)this.rshz, (float)f32, (float)0.0f);
            this.tjn += (this.rshz - this.tjn) * 0.15f;
            bdhq2.method_44380();
        }
    }

    private void drawPlayerHead(bdhq bdhq2, String string, float f, float f2, float f3) {
        class_745 class_7452 = this.getOrCreatePreviewPlayer(string);
        if (class_7452 != null) {
            try {
                bjgh.shsf_2.sdth_2(bdhq2.method_51448(), (class_1657)class_7452, f, f2, f3, f3, 0.0f, 4.0f, Color.WHITE);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private void renderAddFriendModal(bdhq bdhq2, float f, float f2, int n, int n2, float f3, float f4) {
        float f5 = this.sts.hnf();
        if (f5 <= 0.001f) {
            return;
        }
        float f6 = 110.0f * f4;
        float f7 = 57.0f * f4;
        float f8 = this.shkh_5;
        float f9 = this.shq;
        if (f8 + f6 > f - 10.0f * f4) {
            f8 = f - f6 - 10.0f * f4;
        }
        if (f9 + f7 > f2 - 10.0f * f4) {
            f9 = f2 - f7 - 10.0f * f4;
        }
        tadh.khdhh(bdhq2.method_51448(), f8, f9, f6, f7, jz_2.all(6.0f * f4), new bkt(21, 21, 21, (int)(f3 * 255.0f * f5)));
        float f10 = f9 + 10.0f * f4;
        tadh.khdhh(bdhq2.method_51448(), f8 + 8.0f * f4, f10, 94.0f * f4, 19.0f * f4, jz_2.all(4.0f * f4), new bkt(27, 27, 27, (int)(f3 * 255.0f * f5)));
        if (this.rbd_2.isEmpty() && !this.dyd_2) {
            bdhq2.drawText(bbk.jns.rdhz(10.0f * f4), "Enter Name...", f8 + 12.0f * f4, f10 + 5.0f * f4, new bkt(103, 103, 103, (int)(f3 * 255.0f * f5)));
        } else {
            Object object = this.rbd_2 + (this.dyd_2 ? this.animatedSearchDots() : "");
            object = this.fitTextFromEnd((String)object, bbk.jns, 10.0f * f4, 86.0f * f4);
            bdhq2.drawText(bbk.jns.rdhz(10.0f * f4), (String)object, f8 + 12.0f * f4, f10 + 5.0f * f4, new bkt(255, 255, 255, (int)(f3 * 255.0f * f5)));
        }
        float f11 = f9 + 35.0f * f4;
        boolean bl = tdhb.khjgh(n, n2, f8 + 8.0f * f4, f11, 94.0f * f4, 13.0f * f4);
        bkt bkt2 = bl ? this.themeAccent(f3 * 255.0f * f5) : new bkt(27, 27, 27, (int)(f3 * 255.0f * f5));
        tadh.khdhh(bdhq2.method_51448(), f8 + 8.0f * f4, f11, 94.0f * f4, 13.0f * f4, jz_2.all(3.0f * f4), bkt2);
        bdhq2.drawText(bbk.jqy.rdhz(8.0f * f4), "s", f8 + 18.0f * f4, f11 + 3.0f * f4, new bkt(255, 255, 255, (int)(f3 * 255.0f * f5)));
        bdhq2.drawText(bbk.jns.rdhz(10.0f * f4), "Confirm", f8 + 32.0f * f4, f11 + 3.0f * f4, new bkt(255, 255, 255, (int)(f3 * 255.0f * f5)));
    }

    private void drawPlayerPreviewModel(bdhq bdhq2, float f, float f2, float f3, float f4, class_1309 class_13092) {
        if (class_13092 == null || bdhq2 == null) {
            return;
        }
        float f5 = class_13092.field_6283;
        float f6 = class_13092.method_36454();
        float f7 = class_13092.method_36455();
        float f8 = class_13092.field_6241;
        float f9 = class_13092.field_6259;
        class_13092.field_6283 = 180.0f - f4;
        class_13092.method_36456(180.0f - f4);
        class_13092.method_36457(0.0f);
        class_13092.field_6241 = 180.0f - f4;
        class_13092.field_6259 = 180.0f - f4;
        Quaternionf quaternionf = new Quaternionf().rotationXYZ((float)Math.toRadians(5.0), (float)Math.toRadians(f4), (float)Math.toRadians(180.0));
        try {
            class_490.method_48472((class_332)bdhq2, (float)f, (float)f2, (float)f3, (Vector3f)new Vector3f(0.0f, 0.0f, 0.0f), (Quaternionf)quaternionf, null, (class_1309)class_13092);
        }
        catch (Exception exception) {
            // empty catch block
        }
        class_13092.field_6283 = f5;
        class_13092.method_36456(f6);
        class_13092.method_36457(f7);
        class_13092.field_6241 = f8;
        class_13092.field_6259 = f9;
    }

    private class_745 getOrCreatePreviewPlayer(String string) {
        if (this.field_22787 == null || this.field_22787.field_1687 == null || string == null || string.isEmpty()) {
            return null;
        }
        return this.hzz_4.computeIfAbsent(string.toLowerCase(Locale.ROOT), arg_0 -> this.lambda$getOrCreatePreviewPlayer$10(string, arg_0));
    }

    public boolean method_25402(double d, double d2, int n) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        qz[] qzArray;
        float f6;
        float f7;
        int n2;
        int n3;
        float f8;
        float f9;
        float f10;
        float f11;
        qz[] qzArray2;
        float f12;
        float f13;
        float f14;
        if (n >= 0 && n <= 4) {
            if (this.tzdh_2 != null && this.rngh == null) {
                this.tzdh_2.setKeyCode(n);
                this.tzdh_2 = null;
                khgh.dda_5(khgh.tas_4);
                return true;
            }
            if (this.rngh != null) {
                this.rngh.jkz(n);
                this.rngh = null;
                khgh.dda_5(khgh.tas_4);
                return true;
            }
        }
        int n4 = this.field_22789;
        int n5 = this.field_22790;
        float f15 = (float)n4 * 0.9f / 760.0f;
        float f16 = (float)n5 * 0.9f / 452.0f;
        float f17 = Math.min(0.85f, Math.min(f15, f16));
        float f18 = f17 * this.getClickGuiAnimationScale();
        float f19 = 760.0f * f18;
        float f20 = 452.0f * f18;
        float f21 = 135.0f * f18;
        float f22 = 56.0f * f18;
        float f23 = (float)n4 / 2.0f - f19 / 2.0f;
        float f24 = (float)n5 / 2.0f - f20 / 2.0f;
        int n6 = (int)d;
        int n7 = (int)d2;
        if (this.jthz) {
            float f25;
            float f26 = 110.0f * f18;
            float f27 = 57.0f * f18;
            float f28 = this.shkh_5;
            float f29 = this.shq;
            if (f28 + f26 > (float)n4 - 10.0f * f18) {
                f28 = (float)n4 - f26 - 10.0f * f18;
            }
            if (f29 + f27 > (float)n5 - 10.0f * f18) {
                f29 = (float)n5 - f27 - 10.0f * f18;
            }
            if (tdhb.khjgh(n6, n7, f28 + 8.0f * f18, f25 = f29 + 10.0f * f18, 94.0f * f18, 19.0f * f18)) {
                this.dyd_2 = true;
                khgh.dda_5(khgh.tas_4);
                return true;
            }
            float f30 = f29 + 35.0f * f18;
            if (tdhb.khjgh(n6, n7, f28 + 8.0f * f18, f30, 94.0f * f18, 13.0f * f18)) {
                if (!this.rbd_2.trim().isEmpty()) {
                    Moondlc.getInstance().getFriendManager().zfz_4(this.rbd_2.trim());
                    this.rbd_2 = "";
                }
                this.jthz = false;
                this.dyd_2 = false;
                khgh.dda_5(khgh.ztz_3);
                return true;
            }
            if (!tdhb.khjgh(n6, n7, f28, f29, f26, f27)) {
                this.jthz = false;
                this.dyd_2 = false;
                khgh.dda_5(khgh.tas_4);
            }
            return true;
        }
        if (this.tbz_2 == qz.jtt_3) {
            f14 = f23 + f21 + 16.0f * f18;
            f13 = f24 + f22 + 12.0f * f18;
            f12 = f19 - f21 - 32.0f * f18;
            float f31 = f20 - f22 - 24.0f * f18;
            qzArray2 = Moondlc.getInstance().getFriendManager().hkha_2();
            if (!qzArray2.isEmpty()) {
                float f32 = f13;
                float f33 = f31;
                float f34 = (f12 - 12.0f * f18) / 2.0f;
                f11 = 32.0f * f18;
                f10 = 12.0f * f18;
                f9 = 8.0f * f18;
                f8 = f32 + this.tjn;
                for (n3 = 0; n3 < qzArray2.size(); ++n3) {
                    String string = (String)qzArray2.get(n3);
                    int n8 = n3 % 2;
                    n2 = n3 / 2;
                    f7 = f14 + (float)n8 * (f34 + f10);
                    f6 = f8 + (float)n2 * (f11 + f9);
                    if (f6 + f11 < f32 || f6 > f32 + f33 || !tdhb.khjgh(n6, n7, f7, f6, f34, f11) || n != 1) continue;
                    Moondlc.getInstance().getFriendManager().jjm(string);
                    khgh.dda_5(khgh.tas_4);
                    return true;
                }
            }
            if (n == 0 && tdhb.khjgh(n6, n7, f14, f13, f12, f31)) {
                this.shkh_5 = n6;
                this.shq = n7;
                this.jthz = true;
                this.dyd_2 = true;
                khgh.dda_5(khgh.tas_4);
                return true;
            }
        }
        if (tdhb.khjgh(n6, n7, f14 = f23 + f19 - 130.0f * f18, f13 = f24 + 18.0f * f18, 130.0f * f18, 24.0f * f18)) {
            this.dhdh_3 = true;
            this.lt_2 = null;
            this.thka = false;
            this.sjh_4 = null;
            return true;
        }
        this.dhdh_3 = false;
        f12 = f24 + f22 + 32.0f * f18;
        for (qz qz2 : qzArray = new qz[]{qz.rza_2, qz.bhy, qz.thfk, qz.khjn, qz.hfdh}) {
            if (tdhb.khjgh(n6, n7, f23 + 8.0f * f18, f12, f21 - 16.0f * f18, 26.0f * f18)) {
                this.bak = false;
                this.sthz_3 = false;
                this.sthd_2 = 0;
                this.dhjn = -1;
                this.zh_4 = false;
                this.selectCategory(qz2);
                this.lt_2 = null;
                this.thka = false;
                this.sjh_4 = null;
                this.closeModuleColorPicker();
                khgh.dda_5(khgh.tas_4);
                return true;
            }
            f12 += 32.0f * f18;
        }
        f12 = f24 + f20 - 136.0f * f18;
        qzArray2 = new qz[]{qz.jtt_3, qz.thkhm};
        for (qz qz3 : qzArray2) {
            if (tdhb.khjgh(n6, n7, f23 + 8.0f * f18, f12, f21 - 16.0f * f18, 26.0f * f18)) {
                this.bak = false;
                this.sthz_3 = false;
                this.sthd_2 = 0;
                this.dhjn = -1;
                this.zh_4 = false;
                this.selectCategory(qz3);
                this.lt_2 = null;
                this.thka = false;
                this.sjh_4 = null;
                this.closeModuleColorPicker();
                khgh.dda_5(khgh.tas_4);
                return true;
            }
            f12 += 32.0f * f18;
        }
        if (this.khtj_2 != null) {
            rr rr2 = this.khtj_2;
            int n9 = this.jldh;
            int n10 = this.hfgh;
            int n11 = this.thwdh;
            f10 = rr2.bjk().hnf();
            int n12 = Math.min(14, rr2.bla_2().size());
            int n13 = Math.max(0, rr2.bla_2().size() - n12);
            n3 = class_3532.method_15340((int)this.skn.getOrDefault(rr2, 0), (int)0, (int)n13);
            float f35 = (float)(n12 * 16 + 8) * f18;
            float f36 = f35 * f10;
            if (tdhb.khjgh(n6, n7, n9, n10, n11, f36)) {
                for (n2 = 0; n2 < n12; ++n2) {
                    f7 = (float)n10 + (4.0f + (float)n2 * 16.0f) * f18;
                    if (!tdhb.khjgh(n6, n7, n9, f7, n11, 16.0f * f18)) continue;
                    rr2.rfr(((sdh_3)rr2.bla_2().get(n3 + n2)).getName());
                    rr2.sjz_2(false);
                    khgh.dda_5(khgh.tas_4);
                    return true;
                }
            } else {
                rr2.sjz_2(false);
            }
        }
        if (this.tbz_2 == qz.thkhm) {
            float f37 = f23 + f21 + 16.0f * f18;
            float f38 = f24 + f22 + 12.0f * f18;
            float f39 = f19 - f21 - 32.0f * f18;
            f11 = f37 + f39 - 150.0f * f18;
            f10 = 68.0f * f18;
            f9 = f37 + (f39 - f10) / 2.0f;
            if (!this.bak && tdhb.khjgh(n6, n7, f9, f38, f10, 34.0f * f18)) {
                this.bak = true;
                this.sthz_3 = false;
                this.sthd_2 = 0;
                this.ban = false;
                this.khrt = false;
                this.tjn = 0.0f;
                this.rshz = 0.0f;
                khgh.dda_5(khgh.tas_4);
                return true;
            }
            if (this.bak) {
                return this.handleThemesTabClick(d, d2, n, f23, f24, f19, f20, f21, f22, f18);
            }
            f8 = f9 - f37 - 8.0f * f18;
            if (tdhb.khjgh(n6, n7, f37, f38, f8, 34.0f * f18)) {
                this.ban = true;
                this.khrt = false;
                return true;
            }
            this.ban = false;
            for (n3 = 0; n3 < 4; ++n3) {
                float f40 = f11 + (float)n3 * 40.0f * f18;
                if (!tdhb.khjgh(n6, n7, f40, f38, 34.0f * f18, 34.0f * f18)) continue;
                khgh.dda_5(khgh.tas_4);
                if (n3 == 0) {
                    this.dtr_2 = !this.dtr_2;
                    this.hfn = false;
                    this.fd = "";
                } else if (n3 == 1) {
                    class_156.method_668().method_672(new File(bdhb.dhdhd_2));
                } else if (n3 != 2 && n3 == 3) {
                    this.hfn = !this.hfn;
                    this.dtr_2 = false;
                }
                return true;
            }
            if (this.hfn) {
                float f41 = 108.0f * f18;
                float f42 = f11 + 120.0f * f18 - f41 + 34.0f * f18;
                float f43 = f38 + 38.0f * f18;
                float f44 = 80.0f * f18;
                if (tdhb.khjgh(n6, n7, f42, f43, f41, f44)) {
                    for (int i = 0; i < 4; ++i) {
                        if (!tdhb.khjgh(n6, n7, f42, f43 + (6.0f + (float)i * 17.0f) * f18, f41, 14.0f * f18)) continue;
                        this.stt_6 = i;
                        this.hfn = false;
                        khgh.dda_5(khgh.tas_4);
                        return true;
                    }
                    return true;
                }
                this.hfn = false;
            }
            if (this.dtr_2) {
                float f45 = f11;
                float f46 = f38 + 38.0f * f18;
                float f47 = 110.0f * f18;
                float f48 = 57.0f * f18;
                if (tdhb.khjgh(n6, n7, f45, f46, f47, f48)) {
                    f7 = f46 + 10.0f * f18;
                    if (tdhb.khjgh(n6, n7, f45 + 8.0f * f18, f7, 94.0f * f18, 19.0f * f18)) {
                        this.khrt = true;
                        return true;
                    }
                    this.khrt = false;
                    f6 = f46 + 35.0f * f18;
                    if (tdhb.khjgh(n6, n7, f45 + 8.0f * f18, f6, 94.0f * f18, 13.0f * f18)) {
                        if (!this.fd.trim().isEmpty()) {
                            bhdh.khsb().daw_3(this.fd.trim());
                            this.dtr_2 = false;
                            this.fd = "";
                            khgh.dda_5(khgh.tas_4);
                        }
                        return true;
                    }
                    return true;
                }
                this.dtr_2 = false;
                this.khrt = false;
            }
            ArrayList<String> arrayList = new ArrayList<String>(bhdh.khsb().ml());
            if (!this.khath_2.isEmpty()) {
                arrayList.removeIf(this::lambda$mouseClicked$11);
            }
            arrayList.sort(this::lambda$mouseClicked$12);
            float f49 = f38 + 46.0f * f18;
            int n14 = 13;
            boolean bl = f19 >= 600.0f * f18;
            f7 = bl ? (f39 - (float)n14 * f18) / 2.0f : f39;
            f6 = 64.0f * f18;
            float f50 = f49 + this.tjn;
            float f51 = f49 + this.tjn;
            for (int i = 0; i < arrayList.size(); ++i) {
                float f52;
                String string = (String)arrayList.get(i);
                boolean bl2 = !bl || f50 <= f51;
                float f53 = bl2 ? f37 : f37 + f7 + (float)n14 * f18;
                float f54 = f52 = bl2 ? f50 : f51;
                if (tdhb.khjgh(n6, n7, f53, f52, f7, f6)) {
                    for (int j = 0; j < 3; ++j) {
                        float f55 = f53 + 64.0f * f18 + (float)j * 24.0f * f18;
                        float f56 = f52 + 42.0f * f18;
                        float f57 = 18.0f * f18;
                        float f58 = 14.0f * f18;
                        if (!tdhb.khjgh(n6, n7, f55, f56, f57, f58)) continue;
                        khgh.dda_5(khgh.tas_4);
                        if (j == 0) {
                            bhdh.khsb().rzs_4(string);
                        } else if (j == 1) {
                            bhdh.khsb().daw_3(string);
                        } else if (j == 2 && !"default".equalsIgnoreCase(string)) {
                            bhdh.khsb().dhbt(string);
                        }
                        return true;
                    }
                    return true;
                }
                if (bl2) {
                    f50 += f6 + (float)n14 * f18;
                    continue;
                }
                f51 += f6 + (float)n14 * f18;
            }
            return true;
        }
        float f59 = f23 + f21 + 16.0f * f18;
        float f60 = f24 + f22 + 12.0f * f18;
        float f61 = f19 - f21 - 32.0f * f18;
        List list = this.getVisibleModules();
        int n15 = 12;
        boolean bl = f19 >= 600.0f * f18;
        f8 = bl ? (f61 - (float)n15 * f18) / 2.0f : f61;
        float f62 = f60 + this.tjn;
        float f63 = f60 + this.tjn;
        for (int i = 0; i < list.size(); ++i) {
            tss tss2 = (tss)list.get(i);
            boolean bl3 = !bl || f62 <= f63;
            f6 = bl3 ? f59 : f59 + f8 + (float)n15 * f18;
            f5 = bl3 ? f62 : f63;
            bhn_2 bhn2_2 = (bhn_2)this.dths.get(tss2);
            f4 = bhn2_2 != null ? bhn2_2.hnf() : 0.0f;
            f3 = 0.0f;
            if (f4 > 0.01f) {
                for (baj_2 baj2_2 : tss2.getSettings()) {
                    if (!baj2_2.baa_2()) continue;
                    f3 += (this.getSettingHeight(baj2_2, f8 / f18) + 12.0f) * f18;
                }
                if (f3 > 0.0f) {
                    f3 += 8.0f * f18;
                }
            }
            if (tdhb.khjgh(n6, n7, f6, f5, f8, f2 = (f = 50.0f * f18) + f3 * f4)) {
                float f64;
                float f65;
                if (tdhb.khjgh(n6, n7, f6, f5, f8, f)) {
                    if (n == 0) {
                        float f66;
                        float f67;
                        float f68;
                        String string;
                        String string2 = string = tss2.getKeyCode() == -1 ? "NONE" : GLFW.glfwGetKeyName((int)tss2.getKeyCode(), (int)0);
                        if (string == null) {
                            string = "NONE";
                        }
                        if (tdhb.khjgh(n6, n7, f65 = f6 + f8 - 14.0f * f18 - 24.0f * f18 - 8.0f * f18 - (f68 = Math.max(32.0f * f18, (f67 = bbk.jns.dht_10(string, 11.0f * f18)) + 10.0f * f18)), f66 = f5 + 16.0f * f18, f68, 18.0f * f18)) {
                            this.tzdh_2 = tss2;
                            this.rngh = null;
                            this.sjh_4 = null;
                            return true;
                        }
                        float f69 = f6 + f8 - 36.0f * f18;
                        f64 = f5 + 17.0f * f18;
                        float f70 = 24.0f * f18;
                        float f71 = 15.0f * f18;
                        if (tdhb.khjgh(n6, n7, f69, f64, f70, f71)) {
                            tss2.setToggled(!tss2.isEnabled());
                            khgh.dda_5(khgh.jhs_3);
                            return true;
                        }
                        tss2.setToggled(!tss2.isEnabled());
                        khgh.dda_5(khgh.jhs_3);
                        return true;
                    }
                    if (n == 1) {
                        if (!this.hasVisibleSettings(tss2)) {
                            this.dqj = tss2;
                            this.rzq_2 = System.currentTimeMillis() + 1250L;
                            khgh.dda_5(khgh.rdf);
                            return true;
                        }
                        boolean bl4 = this.dwd.getOrDefault(tss2, false);
                        this.dwd.put(tss2, !bl4);
                        if (bl4 && this.khsw != null && tss2.getSettings().contains(this.khsw)) {
                            this.closeModuleColorPicker();
                        }
                        khgh.thkhs(khgh.ztz_3, 0.8f, 1.3f);
                        return true;
                    }
                }
                if (f4 > 0.9f && n == 0) {
                    float f72 = f5 + f + 4.0f * f18;
                    for (baj_2 baj3_2 : tss2.getSettings()) {
                        if (!baj3_2.baa_2()) continue;
                        f65 = this.getSettingHeight(baj3_2, f8 / f18) * f18;
                        if (tdhb.khjgh(n6, n7, f6 + 14.0f * f18, f72, f8 - 28.0f * f18, f65)) {
                            this.sjh_4 = null;
                            if (baj3_2 instanceof tjt) {
                                tjt tjt2;
                                tjt2.sdq(!(tjt2 = (tjt)baj3_2).tsz());
                                khgh.dda_5(khgh.jhs_3);
                                return true;
                            }
                            if (baj3_2 instanceof bzgh) {
                                float f73 = f6 + f8 - 14.0f * f18 - 120.0f * f18;
                                if (tdhb.khjgh(n6, n7, f73, f72 + 2.0f * f18, 84.0f * f18, 16.0f * f18)) {
                                    this.rnw = baj3_2;
                                    this.bdz = f6;
                                    this.closeModuleColorPicker();
                                    this.updateNumberSettingFromMouse((bzgh)baj3_2, n6, f73, 84.0f * f18);
                                    return true;
                                }
                            } else if (baj3_2 instanceof bdhl) {
                                bdhl bdhl2 = (bdhl)baj3_2;
                                float f74 = 120.0f * f18;
                                f64 = f6 + f8 - 14.0f * f18 - f74;
                                float f75 = 66.0f * f18;
                                if (tdhb.khjgh(n6, n7, f64, f72 + 2.0f * f18, f75, 16.0f * f18)) {
                                    double d3;
                                    this.rnw = baj3_2;
                                    this.bdz = f6;
                                    float f76 = (bdhl2.tzf_3() - bdhl2.twth_2()) / (bdhl2.jygh() - bdhl2.twth_2());
                                    var53_144 = (bdhl2.dghth_2() - bdhl2.twth_2()) / (bdhl2.jygh() - bdhl2.twth_2());
                                    double d4 = (float)n6 - f64;
                                    double d5 = Math.abs(d4 - (double)(f75 * f76));
                                    this.thfh_2 = d5 < (d3 = Math.abs(d4 - (double)(f75 * var53_144)));
                                    this.closeModuleColorPicker();
                                    this.updateRangeSettingFromMouse(bdhl2, n6, f64, f75);
                                    return true;
                                }
                            } else if (baj3_2 instanceof rr) {
                                rr rr3 = (rr)baj3_2;
                                float f77 = 110.0f * f18;
                                f64 = f6 + f8 - 14.0f * f18 - f77;
                                if (tdhb.khjgh(n6, n7, f64, f72 + 2.0f * f18, f77, 16.0f * f18)) {
                                    rr3.sjz_2(!rr3.zst());
                                    khgh.dda_5(khgh.tas_4);
                                    return true;
                                }
                            } else if (baj3_2 instanceof bwh) {
                                bwh bwh2 = (bwh)baj3_2;
                                float f78 = f6 + 14.0f * f18;
                                f64 = f72 + 20.0f * f18;
                                for (tbdh tbdh2 : bwh2.shbh()) {
                                    var53_144 = bbk.rqdh.dht_10(tbdh2.getName(), 10.0f * f18) + 12.0f * f18;
                                    if (f78 > f6 + 14.0f * f18 && f78 + var53_144 > f6 + f8 - 14.0f * f18) {
                                        f78 = f6 + 14.0f * f18;
                                        f64 += 20.0f * f18;
                                    }
                                    if (tdhb.khjgh(n6, n7, f78, f64, var53_144, 16.0f * f18)) {
                                        tbdh2.zky(!tbdh2.bzth());
                                        khgh.dda_5(khgh.jhs_3);
                                        return true;
                                    }
                                    f78 += var53_144 + 6.0f * f18;
                                }
                            } else if (baj3_2 instanceof bzm_2) {
                                bzm_2 bzm2 = (bzm_2)baj3_2;
                                float f79 = 110.0f * f18;
                                f64 = f6 + f8 - 14.0f * f18 - f79;
                                float f80 = this.getModuleColorPickerProgress(bzm2);
                                if (f80 > 0.85f) {
                                    this.positionEmbeddedModuleColorPicker(f6, f8, f72, f18);
                                    if (this.handleModuleColorPickerClick(d, d2, n, f18)) {
                                        return true;
                                    }
                                }
                                if (tdhb.khjgh(n6, n7, f64, f72 + 1.0f * f18, f79, 22.0f * f18)) {
                                    this.openModuleColorPicker(bzm2);
                                    return true;
                                }
                            } else if (baj3_2 instanceof tsd_2) {
                                tsd_2 tsd2 = (tsd_2)baj3_2;
                                float f81 = 110.0f * f18;
                                f64 = f6 + f8 - 14.0f * f18 - f81;
                                if (tdhb.khjgh(n6, n7, f64, f72 + 2.0f * f18, f81, 16.0 * (double)f18)) {
                                    this.lt_2 = tsd2;
                                    this.thka = true;
                                    return true;
                                }
                            } else if (baj3_2 instanceof tsm) {
                                float f82;
                                float f83;
                                tsm tsm2 = (tsm)baj3_2;
                                String string = tsm2.jmn();
                                if (string == null || string.isEmpty() || string.equalsIgnoreCase("none")) {
                                    string = "NONE";
                                }
                                if (tdhb.khjgh(n6, n7, f83 = f6 + f8 - 14.0f * f18 - (f82 = Math.max(36.0f * f18, (f64 = bbk.jns.dht_10(string = string.toUpperCase(), 12.0f * f18)) + 12.0f * f18)), f72 + 2.0f * f18, f82, 18.0f * f18)) {
                                    this.rngh = tsm2;
                                    this.tzdh_2 = null;
                                    return true;
                                }
                            } else if (baj3_2 instanceof shsh_5) {
                                shsh_5 shsh2 = (shsh_5)baj3_2;
                                float f84 = 120.0f * f18;
                                f64 = f6 + f8 - 14.0f * f18 - f84;
                                if (tdhb.khjgh(n6, n7, f64, f72 + 2.0f * f18, f84, 18.0f * f18)) {
                                    this.sjh_4 = shsh2;
                                    return true;
                                }
                            }
                        }
                        f72 += f65 + 12.0f * f18;
                    }
                }
            }
            if (bl3) {
                f62 += f2 + (float)n15 * f18;
                continue;
            }
            f63 += f2 + (float)n15 * f18;
        }
        if (this.lt_2 != null && this.rqs.hnf() > 0.9f) {
            float f85 = 236.0f * f18;
            float f86 = f23 - f85 - 10.0f * f18;
            f6 = f24 + f22 + 10.0f * f18;
            float f87 = 312.0f * f18;
            if (tdhb.khjgh(n6, n7, f86, f6, f85, f87)) {
                this.sjh_4 = null;
                f5 = f86 + 8.0f * f18;
                float f88 = f6 + 8.0f * f18;
                f4 = f85 - 16.0f * f18;
                f3 = f87 - 16.0f * f18;
                f = f88 + 8.0f * f18;
                if (tdhb.khjgh(n6, n7, f5 + 8.0f * f18, f, f4 - 16.0f * f18, 20.0f * f18)) {
                    this.dhdh_3 = false;
                    this.thka = true;
                    return true;
                }
                f2 = f + 28.0f * f18;
                for (int i = 0; i < this.khyj.size(); ++i) {
                    class_2248 class_22482 = (class_2248)this.khyj.get(i);
                    float f89 = f2 + (float)i * 26.0f * f18 + this.tlsh;
                    if (!tdhb.khjgh(n6, n7, f5 + 8.0f * f18, f89, f4 - 16.0f * f18, 22.0f * f18)) continue;
                    this.lt_2.jfd_2(class_22482);
                    khgh.dda_5(khgh.tas_4);
                    return true;
                }
                return true;
            }
            this.lt_2 = null;
            this.thka = false;
        }
        return super.method_25402(d, d2, n);
    }

    public boolean method_25406(double d, double d2, int n) {
        this.rnw = null;
        this.dhjn = -1;
        this.bmm = -1;
        return super.method_25406(d, d2, n);
    }

    public boolean method_25403(double d, double d2, int n, double d3, double d4) {
        int n2 = this.field_22789;
        int n3 = this.field_22790;
        float f = (float)n2 * 0.9f / 760.0f;
        float f2 = (float)n3 * 0.9f / 452.0f;
        float f3 = Math.min(0.85f, Math.min(f, f2));
        float f4 = f3 * this.getClickGuiAnimationScale();
        int n4 = (int)d;
        float f5 = 760.0f * f4;
        float f6 = 452.0f * f4;
        float f7 = 135.0f * f4;
        if (this.tbz_2 == qz.thkhm && this.bak && this.sthd_2 != 0 && this.dhjn >= 0) {
            float f8 = (float)n2 / 2.0f - f5 / 2.0f;
            float f9 = (float)n3 / 2.0f - f6 / 2.0f;
            float f10 = this.getThemeCreatorPanelX(f8, f5, f4);
            float f11 = this.getThemeCreatorPanelY(f9, f4);
            float f12 = this.getThemeColorPickerX(f10, f4);
            float f13 = this.getThemeColorPickerY(f11, f4);
            this.updateThemeColorFromMouse((float)d, (float)d2, f12, f13, 184.0f * f4, f4);
            return true;
        }
        if (this.khsw != null && this.bmm >= 0) {
            this.updateModuleColorFromMouse((float)d, (float)d2, f4);
            return true;
        }
        if (this.rnw instanceof bzgh) {
            bzgh bzgh2 = (bzgh)this.rnw;
            float f14 = f5 - f7 - 32.0f * f4;
            int n5 = 12;
            boolean bl = f5 >= 600.0f * f4;
            float f15 = bl ? (f14 - (float)n5 * f4) / 2.0f : f14;
            float f16 = this.bdz + f15 - 14.0f * f4 - 120.0f * f4;
            this.updateNumberSettingFromMouse(bzgh2, n4, f16, 84.0f * f4);
            return true;
        }
        if (this.rnw instanceof bdhl) {
            bdhl bdhl2 = (bdhl)this.rnw;
            float f17 = 120.0f * f4;
            float f18 = f5 - f7 - 32.0f * f4;
            int n6 = 12;
            boolean bl = f5 >= 600.0f * f4;
            float f19 = bl ? (f18 - (float)n6 * f4) / 2.0f : f18;
            float f20 = this.bdz + f19 - 14.0f * f4 - f17;
            this.updateRangeSettingFromMouse(bdhl2, n4, f20, 66.0f * f4);
            return true;
        }
        return super.method_25403(d, d2, n, d3, d4);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        float f;
        float f2;
        float f3;
        float f4;
        int n = this.field_22789;
        int n2 = this.field_22790;
        float f5 = (float)n * 0.9f / 760.0f;
        float f6 = (float)n2 * 0.9f / 452.0f;
        float f7 = Math.min(0.85f, Math.min(f5, f6));
        float f8 = f7 * this.getClickGuiAnimationScale();
        float f9 = 760.0f * f8;
        float f10 = 452.0f * f8;
        float f11 = 135.0f * f8;
        float f12 = 56.0f * f8;
        float f13 = (float)n / 2.0f - f9 / 2.0f;
        float f14 = (float)n2 / 2.0f - f10 / 2.0f;
        int n3 = (int)d;
        int n4 = (int)d2;
        if (this.khtj_2 != null && this.khtj_2.zst()) {
            rr rr2 = this.khtj_2;
            int n5 = Math.min(14, rr2.bla_2().size());
            int n6 = Math.max(0, rr2.bla_2().size() - n5);
            f4 = ((float)n5 * 16.0f + 8.0f) * f8;
            if (n6 > 0 && tdhb.khjgh(n3, n4, this.jldh, this.hfgh, this.thwdh, f4)) {
                int n7 = this.skn.getOrDefault(rr2, 0);
                int n8 = d4 < 0.0 ? 1 : (d4 > 0.0 ? -1 : 0);
                this.skn.put(rr2, class_3532.method_15340((int)(n7 + n8 * 3), (int)0, (int)n6));
                return true;
            }
        }
        if (this.lt_2 != null && this.rqs.hnf() > 0.5f && tdhb.khjgh(n3, n4, f3 = f13 - (f2 = 236.0f * f8) - 10.0f * f8, f4 = f14 + f12 + 10.0f * f8, f2, f = 312.0f * f8)) {
            this.rmdh = (float)((double)this.rmdh + d4 * 24.0 * (double)f8);
            return true;
        }
        this.rshz = (float)((double)this.rshz + d4 * 24.0 * (double)f8);
        return true;
    }

    public boolean method_25400(char c, int n) {
        if (this.jthz && this.dyd_2) {
            if (this.rbd_2.length() < 16 && this.isValidConfigNameCharacter(c)) {
                this.rbd_2 = this.rbd_2 + c;
                this.playTypingSound(c);
            }
            return true;
        }
        if (this.tbz_2 == qz.thkhm && this.bak && this.zh_4) {
            if (this.tmdh.length() < 24 && this.isValidConfigNameCharacter(c)) {
                this.tmdh = this.tmdh + c;
                this.playTypingSound(c);
            }
            return true;
        }
        if (this.khrt) {
            if (this.fd.length() < 32 && this.isValidConfigNameCharacter(c)) {
                this.fd = this.fd + c;
                this.playTypingSound(c);
            }
            return true;
        }
        if (this.ban) {
            if (this.khath_2.length() < 48 && this.isValidInputCharacter(c)) {
                this.khath_2 = this.khath_2 + c;
                this.playTypingSound(c);
            }
            return true;
        }
        if (this.sjh_4 != null) {
            if (this.sjh_4.shqkh().length() < 128 && this.isValidInputCharacter(c)) {
                this.sjh_4.dhw_5(c);
                this.playTypingSound(c);
            }
            return true;
        }
        if (this.dhdh_3) {
            if (this.khaa_3.length() < 48 && this.isValidInputCharacter(c)) {
                this.khaa_3 = this.khaa_3 + c;
                this.playTypingSound(c);
            }
            return true;
        }
        if (this.lt_2 != null && this.thka) {
            if (this.rdhz_2.length() < 48 && this.isValidInputCharacter(c)) {
                this.rdhz_2 = this.rdhz_2 + c;
                this.filterBlocks();
                this.playTypingSound(c);
            }
            return true;
        }
        return super.method_25400(c, n);
    }

    public boolean method_25404(int n, int n2, int n3) {
        if (class_437.method_25441() && n == 70) {
            this.sjh_4 = null;
            this.zh_4 = false;
            if (this.lt_2 != null) {
                this.thka = true;
                this.dhdh_3 = false;
                this.ban = false;
            } else if (this.tbz_2 == qz.thkhm && this.bak) {
                this.dhdh_3 = true;
                this.ban = false;
                this.khrt = false;
            } else if (this.tbz_2 == qz.thkhm) {
                this.ban = true;
                this.dhdh_3 = false;
                this.khrt = false;
            } else {
                this.dhdh_3 = true;
                this.ban = false;
            }
            return true;
        }
        if (n == 256 && this.tzdh_2 != null && this.rngh == null) {
            this.tzdh_2.setKeyCode(-1);
            this.tzdh_2 = null;
            khgh.dda_5(khgh.tas_4);
            return true;
        }
        if (n == 256 && this.rngh != null) {
            this.rngh.jkz(-1);
            this.rngh = null;
            khgh.dda_5(khgh.tas_4);
            return true;
        }
        if (n == 256) {
            if (this.jthz) {
                this.jthz = false;
                this.dyd_2 = false;
                khgh.dda_5(khgh.tas_4);
                return true;
            }
            if (this.sthd_2 != 0) {
                this.sthd_2 = 0;
                this.dhjn = -1;
                return true;
            }
            if (this.zh_4) {
                this.zh_4 = false;
                return true;
            }
            if (this.tbz_2 == qz.thkhm && this.bak) {
                this.bak = false;
                this.tjn = 0.0f;
                this.rshz = 0.0f;
                return true;
            }
            if (this.khrt) {
                this.khrt = false;
                return true;
            }
            if (this.ban) {
                this.ban = false;
                return true;
            }
            if (this.sjh_4 != null) {
                this.sjh_4 = null;
                return true;
            }
            if (this.dhdh_3) {
                this.dhdh_3 = false;
                return true;
            }
            if (this.thka) {
                this.thka = false;
                return true;
            }
            this.method_25419();
            return true;
        }
        if (this.jthz && this.dyd_2) {
            if (n == 259) {
                if (!this.rbd_2.isEmpty()) {
                    this.rbd_2 = this.rbd_2.substring(0, this.rbd_2.length() - 1);
                    khgh.sdq_4(1.2f);
                }
            } else if (n == 257 || n == 335) {
                if (!this.rbd_2.trim().isEmpty()) {
                    Moondlc.getInstance().getFriendManager().zfz_4(this.rbd_2.trim());
                    this.rbd_2 = "";
                }
                this.jthz = false;
                this.dyd_2 = false;
                khgh.dda_5(khgh.ztz_3);
            }
            return true;
        }
        if (this.tbz_2 == qz.thkhm && this.bak && this.zh_4) {
            if (n == 259) {
                if (!this.tmdh.isEmpty()) {
                    this.tmdh = this.tmdh.substring(0, this.tmdh.length() - 1);
                    khgh.sdq_4(1.2f);
                }
            } else if (n == 257) {
                this.createThemeFromDraft();
            }
            return true;
        }
        if (this.khrt) {
            if (n == 259) {
                if (!this.fd.isEmpty()) {
                    this.fd = this.fd.substring(0, this.fd.length() - 1);
                    khgh.sdq_4(1.2f);
                }
            } else if (n == 257) {
                if (!this.fd.trim().isEmpty()) {
                    bhdh.khsb().daw_3(this.fd.trim());
                    this.dtr_2 = false;
                    this.fd = "";
                    khgh.dda_5(khgh.tas_4);
                }
                this.khrt = false;
            }
            return true;
        }
        if (this.ban) {
            if (n == 259) {
                if (!this.khath_2.isEmpty()) {
                    this.khath_2 = this.khath_2.substring(0, this.khath_2.length() - 1);
                    khgh.sdq_4(1.2f);
                }
            } else if (n == 257) {
                this.ban = false;
            }
            return true;
        }
        if (this.tzdh_2 != null && this.rngh == null) {
            int n4 = n;
            if (n == 256 || n == 261) {
                n4 = -1;
            }
            this.tzdh_2.setKeyCode(n4);
            this.tzdh_2 = null;
            khgh.dda_5(khgh.tas_4);
            return true;
        }
        if (this.rngh != null) {
            int n5 = n;
            if (n == 256 || n == 261) {
                n5 = -1;
            }
            this.rngh.jkz(n5);
            this.rngh = null;
            khgh.dda_5(khgh.tas_4);
            return true;
        }
        if (this.sjh_4 != null) {
            if (n == 259) {
                String string = this.sjh_4.shqkh();
                this.sjh_4.jdhdh();
                if (!string.equals(this.sjh_4.shqkh())) {
                    khgh.sdq_4(1.2f);
                }
            } else if (n == 257) {
                this.sjh_4 = null;
            }
            return true;
        }
        if (this.dhdh_3) {
            if (n == 259) {
                if (!this.khaa_3.isEmpty()) {
                    this.khaa_3 = this.khaa_3.substring(0, this.khaa_3.length() - 1);
                    khgh.sdq_4(1.2f);
                }
            } else if (n == 257) {
                this.dhdh_3 = false;
            }
            return true;
        }
        if (this.lt_2 != null && this.thka) {
            if (n == 259) {
                if (!this.rdhz_2.isEmpty()) {
                    this.rdhz_2 = this.rdhz_2.substring(0, this.rdhz_2.length() - 1);
                    this.filterBlocks();
                    khgh.sdq_4(1.2f);
                }
            } else if (n == 257) {
                this.thka = false;
            }
            return true;
        }
        return super.method_25404(n, n2, n3);
    }

    private List getVisibleModules() {
        String string = this.khaa_3.trim().toLowerCase(Locale.ROOT);
        boolean bl = !string.isEmpty();
        ArrayList<tss> arrayList = new ArrayList<tss>();
        for (tss tss2 : bza.getInstance().getModuleManager().dbd_3()) {
            boolean bl2;
            if (!(bl2 = (switch (thr.zza_2[tss2.getCategory().ordinal()]) {
                case 1, 2, 3, 4, 5 -> true;
                default -> false;
            })) || !bl && tss2.getCategory() != this.tbz_2 || bl && !tss2.getName().toLowerCase(Locale.ROOT).contains(string)) continue;
            arrayList.add(tss2);
        }
        return arrayList;
    }

    private boolean hasVisibleSettings(tss tss2) {
        for (baj_2 baj2_2 : tss2.getSettings()) {
            if (!baj2_2.baa_2()) continue;
            return true;
        }
        return false;
    }

    private void selectCategory(qz qz2) {
        if (qz2 == null || qz2 == this.tbz_2) {
            return;
        }
        this.rememberCurrentScroll();
        this.tbz_2 = qz2;
        this.tjn = this.stht.getOrDefault((Object)qz2, Float.valueOf(0.0f)).floatValue();
        this.rshz = this.ddhz_2.getOrDefault((Object)qz2, Float.valueOf(this.tjn)).floatValue();
    }

    private void rememberCurrentScroll() {
        this.stht.put(this.tbz_2, Float.valueOf(this.tjn));
        this.ddhz_2.put(this.tbz_2, Float.valueOf(this.rshz));
    }

    private void updateNumberSettingFromMouse(bzgh bzgh2, float f, float f2, float f3) {
        if (f3 <= 0.0f || bzgh2.jshsh() <= bzgh2.zqw()) {
            return;
        }
        float f4 = bzgh2.bqz_2();
        double d = class_3532.method_15350((double)((f - f2) / f3), (double)0.0, (double)1.0);
        bzgh2.dyb_2((float)((double)bzgh2.zqw() + d * (double)(bzgh2.jshsh() - bzgh2.zqw())));
        if (Float.compare(f4, bzgh2.bqz_2()) != 0) {
            this.playSliderSound();
        }
    }

    private void updateRangeSettingFromMouse(bdhl bdhl2, float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= 0.0f || bdhl2.jygh() <= bdhl2.twth_2()) {
            return;
        }
        double d = class_3532.method_15350((double)((f - f2) / f3), (double)0.0, (double)1.0);
        float f6 = (float)((double)bdhl2.twth_2() + d * (double)(bdhl2.jygh() - bdhl2.twth_2()));
        float f7 = f5 = this.thfh_2 ? bdhl2.tzf_3() : bdhl2.dghth_2();
        if (this.thfh_2) {
            bdhl2.drz_4(Math.min(f6, bdhl2.dghth_2()));
        } else {
            bdhl2.zght(Math.max(f6, bdhl2.tzf_3()));
        }
        float f8 = f4 = this.thfh_2 ? bdhl2.tzf_3() : bdhl2.dghth_2();
        if (Float.compare(f5, f4) != 0) {
            this.playSliderSound();
        }
    }

    private void playSliderSound() {
        long l = System.currentTimeMillis();
        if (l - this.dlf < 40L) {
            return;
        }
        this.dlf = l;
        khgh.dda_5(khgh.sst_3);
    }

    private void playTypingSound(char c) {
        if (c == ' ') {
            khgh.sdq_4(0.8f);
            return;
        }
        int n = Math.floorMod(Character.toLowerCase(c) * 37, 401);
        khgh.sdq_4(0.8f + (float)n / 1000.0f);
    }

    private float getSettingHeight(baj_2 baj2_2, float f) {
        if (baj2_2 instanceof bzm_2) {
            bzm_2 bzm2 = (bzm_2)baj2_2;
            return 24.0f + 126.0f * this.getModuleColorPickerProgress(bzm2);
        }
        if (baj2_2 instanceof bwh) {
            bwh bwh2 = (bwh)baj2_2;
            int n = 1;
            float f2 = 0.0f;
            float f3 = Math.max(40.0f, f - 28.0f);
            for (tbdh tbdh2 : bwh2.shbh()) {
                float f4;
                float f5 = bbk.rqdh.dht_10(tbdh2.getName(), 10.0f) + 12.0f;
                float f6 = f4 = f2 == 0.0f ? f5 : f2 + 6.0f + f5;
                if (f2 > 0.0f && f4 > f3) {
                    ++n;
                    f2 = f5;
                    continue;
                }
                f2 = f4;
            }
            return 20.0f + (float)n * 20.0f;
        }
        return 24.0f;
    }

    private String animatedSearchDots() {
        int n = (int)(System.currentTimeMillis() / 220L % 4L);
        return ".".repeat(n);
    }

    private String formatBindName(int n) {
        if (n == -1) {
            return "NONE";
        }
        if (n >= 0 && n <= 4) {
            return "MOUSE" + (n + 1);
        }
        String string = GLFW.glfwGetKeyName((int)n, (int)0);
        if (string != null && !string.isBlank()) {
            return string.toUpperCase(Locale.ROOT);
        }
        String string2 = bhm_2.getKeyName(n);
        if (string2 != null && !string2.isBlank() && !string2.equalsIgnoreCase("NONE")) {
            return string2.toUpperCase(Locale.ROOT);
        }
        return n == 256 ? "ESC" : "KEY_" + n;
    }

    private String ellipsizeEnd(String string, tthz_2 tthz2_2, float f, float f2) {
        if (string == null || string.isEmpty() || f2 <= 0.0f) {
            return "";
        }
        if (tthz2_2.dht_10(string, f) <= f2) {
            return string;
        }
        String string2 = "...";
        float f3 = tthz2_2.dht_10(string2, f);
        if (f3 > f2) {
            return "";
        }
        int n = 0;
        int n2 = string.length();
        while (n < n2) {
            int n3 = n + n2 + 1 >>> 1;
            if (tthz2_2.dht_10(string.substring(0, n3), f) + f3 <= f2) {
                n = n3;
                continue;
            }
            n2 = n3 - 1;
        }
        return string.substring(0, n) + string2;
    }

    private String fitTextFromEnd(String string, tthz_2 tthz2_2, float f, float f2) {
        if (string == null || string.isEmpty() || f2 <= 0.0f) {
            return "";
        }
        if (tthz2_2.dht_10(string, f) <= f2) {
            return string;
        }
        String string2 = "...";
        float f3 = tthz2_2.dht_10(string2, f);
        if (f3 > f2) {
            return "";
        }
        int n = 0;
        int n2 = string.length();
        while (n < n2) {
            int n3 = n + n2 + 1 >>> 1;
            String string3 = string.substring(string.length() - n3);
            if (f3 + tthz2_2.dht_10(string3, f) <= f2) {
                n = n3;
                continue;
            }
            n2 = n3 - 1;
        }
        return string2 + string.substring(string.length() - n);
    }

    private boolean isValidInputCharacter(char c) {
        return !Character.isISOControl(c);
    }

    private boolean isValidConfigNameCharacter(char c) {
        return Character.isLetterOrDigit(c) || c == ' ' || c == '_' || c == '-' || c == '.';
    }

    private void filterBlocks() {
        this.khyj.clear();
        String string = this.rdhz_2.toLowerCase();
        for (class_2248 class_22482 : this.dhhgh_2) {
            if (!class_22482.method_9518().getString().toLowerCase().contains(string)) continue;
            this.khyj.add(class_22482);
        }
    }

    private void drawConfigServerIcon(bdhq bdhq2, float f, float f2, float f3, hj_2 hj2_2, float f4, float f5) {
        if (hj2_2.singleplayer() || "default".equalsIgnoreCase(hj2_2.name())) {
            this.drawVanillaConfigIcon(bdhq2, f, f2, f3, sdb_3, f4, f5);
            return;
        }
        class_2960 class_29602 = this.getConfigServerIconTexture(hj2_2);
        if (class_29602 != null) {
            this.drawVanillaConfigIcon(bdhq2, f, f2, f3, class_29602, f4, f5);
            return;
        }
        this.drawVanillaConfigIcon(bdhq2, f, f2, f3, sdb_3, f4, f5);
    }

    private void drawVanillaConfigIcon(bdhq bdhq2, float f, float f2, float f3, class_2960 class_29602, float f4, float f5) {
        tadh.khdhh(bdhq2.method_51448(), f, f2, f3, f3, jz_2.all(6.0f * f5), new bkt(255, 255, 255, (int)(12.0f * f4)));
        bjgh.shsf_2.tlh_4(bdhq2.method_51448(), f, f2, f3, f3, 6.0f * f5, new Color(255, 255, 255, (int)(240.0f * f4)), 0.0f, 0.0f, 1.0f, 1.0f, class_29602);
    }

    private class_2960 getConfigServerIconTexture(hj_2 hj2_2) {
        if (hj2_2.serverIconBase64() == null || hj2_2.serverIconBase64().isBlank()) {
            return null;
        }
        String string = hj2_2.name().toLowerCase(Locale.ROOT) + ":" + hj2_2.serverIconBase64().hashCode();
        class_8573 class_85732 = (class_8573)this.khlt.get(string);
        if (class_85732 != null) {
            return class_85732.method_52201();
        }
        try {
            byte[] byArray = Base64.getDecoder().decode(hj2_2.serverIconBase64());
            class_85732 = class_8573.method_52202((class_1060)class_310.method_1551().method_1531(), (String)("moondlc-config-" + string));
            class_85732.method_52199(class_1011.method_49277((byte[])byArray));
            this.khlt.put(string, class_85732);
            return class_85732.method_52201();
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private tthz_2 getCategoryIconFont(qz qz2) {
        switch (thr.zza_2[qz2.ordinal()]) {
            case 1: 
            case 5: 
            case 7: {
                return bbk.agh;
            }
        }
        return bbk.jqy;
    }

    private int lambda$mouseClicked$12(String string, String string2) {
        hj_2 hj2_2 = bhdh.khsb().dhjs(string);
        hj_2 hj3 = bhdh.khsb().dhjs(string2);
        switch (this.stt_6) {
            case 0: {
                return string.compareToIgnoreCase(string2);
            }
            case 1: {
                return string2.compareToIgnoreCase(string);
            }
            case 2: {
                return Long.compare(hj2_2.createdAt(), hj3.createdAt());
            }
        }
        return Long.compare(hj3.createdAt(), hj2_2.createdAt());
    }

    private boolean lambda$mouseClicked$11(String string) {
        return !string.toLowerCase().contains(this.khath_2.toLowerCase());
    }

    private class_745 lambda$getOrCreatePreviewPlayer$10(String string, String string2) {
        UUID uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(StandardCharsets.UTF_8));
        GameProfile gameProfile = new GameProfile(uUID, string);
        return new class_745(this.field_22787.field_1687, gameProfile);
    }

    private int lambda$renderConfigsTab$9(String string, String string2) {
        hj_2 hj2_2 = bhdh.khsb().dhjs(string);
        hj_2 hj3 = bhdh.khsb().dhjs(string2);
        switch (this.stt_6) {
            case 0: {
                return string.compareToIgnoreCase(string2);
            }
            case 1: {
                return string2.compareToIgnoreCase(string);
            }
            case 2: {
                return Long.compare(hj2_2.createdAt(), hj3.createdAt());
            }
        }
        return Long.compare(hj3.createdAt(), hj2_2.createdAt());
    }

    private boolean lambda$renderConfigsTab$8(String string) {
        return !string.toLowerCase().contains(this.khath_2.toLowerCase());
    }

    private static boolean lambda$deleteTheme$7(String string, thw thw2) {
        return thw2 != null && thw2.ttkh_3() != null && thw2.ttkh_3().getName().equalsIgnoreCase(string);
    }

    private static boolean lambda$getVisibleThemes$6(String string, thz thz2) {
        return !thz2.getName().toLowerCase(Locale.ROOT).contains(string);
    }

    private void lambda$render$5(class_332 class_3322, int n, int n2, float f) {
        this.renderContent(class_3322, n, n2, f);
    }

    private static bhn_2 lambda$updateAnimations$4(baj_2 baj2_2) {
        return new bhn_2(200L, us.m0vy.moondlc.m0vyguard.bdz.shll);
    }

    private static bhn_2 lambda$updateAnimations$3(tss tss2) {
        return new bhn_2(200L, us.m0vy.moondlc.m0vyguard.bdz.shll);
    }

    private static Boolean lambda$updateAnimations$2(tss tss2) {
        return false;
    }

    private static bhn_2 lambda$updateAnimations$1(tss tss2) {
        return new bhn_2(250L, us.m0vy.moondlc.m0vyguard.bdz.shll);
    }

    private static String lambda$new$0(class_2248 class_22482) {
        return class_22482.method_9518().getString();
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

