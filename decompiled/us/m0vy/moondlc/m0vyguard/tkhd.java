/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_156
 *  net.minecraft.class_290
 *  net.minecraft.class_2960
 *  net.minecraft.class_304
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_3675
 *  net.minecraft.class_3675$class_306
 *  net.minecraft.class_437
 *  net.minecraft.class_640
 *  net.minecraft.class_7833
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import lombok.Generated;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_156;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_304;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_437;
import net.minecraft.class_640;
import net.minecraft.class_7833;
import us.m0vy.moondlc.m0vyguard.baa;
import us.m0vy.moondlc.m0vyguard.baa_2;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bjj;
import us.m0vy.moondlc.m0vyguard.bja_2;
import us.m0vy.moondlc.m0vyguard.bjk;
import us.m0vy.moondlc.m0vyguard.bhh;
import us.m0vy.moondlc.m0vyguard.bhm;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bdhw;
import us.m0vy.moondlc.m0vyguard.br;
import us.m0vy.moondlc.m0vyguard.brd_2;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.bsd_3;
import us.m0vy.moondlc.m0vyguard.bdk_2;
import us.m0vy.moondlc.m0vyguard.bth_4;
import us.m0vy.moondlc.m0vyguard.bzdh_2;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bay_2;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bnn;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.bwr;
import us.m0vy.moondlc.m0vyguard.byh;
import us.m0vy.moondlc.m0vyguard.bykh;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.byl;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.thz_2;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.trt;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.tshd;
import us.m0vy.moondlc.m0vyguard.tshr;
import us.m0vy.moondlc.m0vyguard.tk;
import us.m0vy.moondlc.m0vyguard.thq_3;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.jy;
import us.m0vy.moondlc.m0vyguard.hw;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.khw;
import us.m0vy.moondlc.m0vyguard.dj;
import us.m0vy.moondlc.m0vyguard.da_2;
import us.m0vy.moondlc.m0vyguard.dha_6;
import us.m0vy.moondlc.m0vyguard.zw;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.ts_4;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.zy_2;
import us.m0vy.moondlc.m0vyguard.fh;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.fw_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.qd;
import us.m0vy.moondlc.m0vyguard.qk;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.nt_3;
import us.m0vy.moondlc.m0vyguard.hj_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class tkhd
extends baa
implements tthy,
byh {
    public static final float swy = 600.0f;
    public static final float zkha = 390.0f;
    public static final float jdr = 6.0f;
    public static final float tll = 14.0f;
    public static final float sz = 14.0f;
    public static final float ddsh_2 = 34.0f;
    public static final float dht_6 = 6.0f;
    public static final int tfz = 3;
    public static final float zdr = 35.0f;
    public static final float sws = 150.0f;
    public static final float shnr = 6.0f;
    public static final float rjm = 40.0f;
    public static final float sthn_2 = 2.1236362f;
    public static final float sha_4 = 20.0f;
    public static final float shrz = 1.150685f;
    public static final byq dmth;
    public static final byq tmr;
    public static final byq jss_3;
    public static final byq thyt_2;
    public static final byq hja;
    public static final byq jqsh;
    public static final byq dhrsh;
    public static final byq shmr;
    public static final byq jtsh;
    public static final byq ztf_2;
    public static final byq znk;
    public static final byq thtl_2;
    private static final class_2960 sw_2;
    private static final class_2960 shwb;
    private static final class_2960 skhh_3;
    private static final class_2960 hsn;
    private static final class_2960 szk_2;
    private static final class_2960 bmd;
    private static final class_2960 khdkh_2;
    private static final class_2960 qdh;
    private static final class_2960 shtth_2;
    private static final class_2960 htth;
    private static final class_2960 thkhth;
    private static final class_2960 khab;
    private static final class_2960 shtq;
    private static final class_2960 khhth;
    private static final class_2960 thdgh_2;
    private static final class_2960 bss_4;
    private static final class_2960 jmm;
    private static final class_2960 dhhth;
    private static final class_2960 tyt;
    private static final class_2960 bl_2;
    private static final class_2960 rl;
    private final Map taz_3 = new HashMap();
    private bjj hha_2 = bjj.rff;
    private trt khlsh = trt.tht_4;
    private bsd_3 zzf_2 = null;
    private final fh dhkhgh;
    private float dhghb;
    private float rzy;
    private boolean shhh_3;
    private final bwr bqa = new bwr();
    private final bwr rghgh = new bwr();
    private final List dah_2;
    private final List sdf;
    private final List rrs;
    private final baa_2 shhd_4;
    private final baa_2 dhas;
    private final baa_2 jkhth;
    private final baa_2 shkhh;
    private final baa_2 khkm;
    private final baa_2 syd_2;
    private final baa_2 hsa_3;
    private final baa_2 sa_2;
    private final baa_2 hrj;
    private final baa_2 zrk;
    private final baa_2 bghdh;
    private String tfs = null;
    private boolean sdy_2 = false;
    private float swa;
    private float bjth;
    private boolean jzth_2 = false;
    private float jtm_2;
    private float thlw;
    private boolean hrz = false;
    private boolean thsd_3 = false;
    private boolean ght_2 = false;
    private boolean rta_2 = false;
    private bjk sjq_2 = null;
    private float bdhth;
    private float ad_2;
    private boolean shrh = false;
    private float tnl;
    private float ttha;
    private boolean tbgh = false;
    private boolean sdht_4 = false;
    private boolean thzb = false;
    private boolean dhkgh = false;
    private boolean khas_4 = false;
    private BufferedImage sja_3;
    private BufferedImage bzy;
    private class_2960 thhd_2;
    private class_2960 bhz_4;
    private float sdhn = 1.0f;
    private float zst_3 = 0.0f;
    private float sdhh_2 = 0.0f;
    private final fa_2 bmth = new fa_2(260L, 0.0f, jkh.tdth);
    private final fa_2 hqr = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 dhtt_4 = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 gh = new fa_2(260L, 0.0f, jkh.tb);
    private final fa_2 baz = new fa_2(350L, 0.0f, jkh.hd_2);
    private final fa_2 bkj = new fa_2(240L, 0.0f, jkh.tdth);
    private final fa_2 ddd_2 = new fa_2(240L, 0.0f, jkh.tdth);
    private final fa_2 jtn_2 = new fa_2(260L, 0.0f, jkh.tdth);
    private final fa_2 dhzb = new fa_2(240L, 1.0f, jkh.tdth);
    private final fa_2 yw = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 ls = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 shat_3 = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 rtd_4 = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 bhh_2 = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 rhw_2 = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 shfh_2 = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 lz_2 = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 shsj = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 thtq_2 = new fa_2(180L, 0.0f, jkh.tb);
    private boolean thbt = false;
    private float tght_2;
    private float thsd;
    private float shzz_3;
    private float dha_6;
    private boolean jghz_2 = false;
    private final baa_2 btz_2;
    private final baa_2 dhndh;
    private thz_2 jzb = thz_2.tdr;
    private boolean rha_3 = false;
    private bzw_2 shln = null;
    private final float[] bzh_3 = new float[3];
    private int sdr_3 = -1;
    private bdh_3 dhdb = null;
    private boolean rf = false;
    private boolean khzdh = false;
    private boolean dhdsh = false;
    private boolean dhkhs_2 = false;
    private boolean rb = false;
    private final fa_2 dhda_4 = new fa_2(240L, 0.0f, jkh.tb);
    private final fa_2 bkhl = new fa_2(180L, 0.0f, jkh.tb);
    private final fa_2 dsgh = new fa_2(180L, 0.0f, jkh.tb);
    private bsd_3 shdhz_2 = null;
    private boolean sykh = false;
    private float jdz_4;
    private float dhka_2;
    private boolean thry = false;
    private float shdr_2;
    private float sghb;
    private boolean rj = false;
    private tay thj_2 = null;
    private boolean dhdhz_2 = false;
    private String shzd_3 = "";
    private class_2960 rdw;
    private class_2960 rml;
    private BufferedImage dhby;
    private BufferedImage stt_2;
    private float tfb = 1.0f;
    private float thfth = 0.0f;
    private float jshz = 0.0f;
    private final bykh thjh;
    private boolean zzth;
    private final fa_2 sza;
    private final fa_2 khzr_2;
    private final fa_2 dnq;
    private final Map khzgh_2 = new HashMap();
    public tkhd_2 rwz_2;
    private final Map jnm = new HashMap();
    private final Map shqh_2 = new HashMap();
    private final Map bdh_5 = new HashMap();
    private final Map sja_2 = new HashMap();
    private final Map bkhf = new HashMap();
    private final Map dlgh = new HashMap();
    private final Map dzh_2 = new HashMap();
    private final Map shkhn = new HashMap();
    private final Map thra_2 = new HashMap();
    private tshd tta_4 = null;
    private int dfm = 0;
    private ts_4 rws_2 = null;
    private final Map thas = new HashMap();
    private final Map thzkh = new HashMap();
    private boolean khqs_2 = false;
    private boolean hmdh = false;
    private boolean bdf = false;
    private final List dya = new LinkedList();
    private bsd_3 shwh = null;
    private tshr bsht = null;
    private final fa_2 zlkh = new fa_2(280L, 0.0f, jkh.tb);
    private long hghw = -1L;
    private float shkh_4 = 0.0f;
    private tshr al = null;
    private static final long jqk = 400L;
    private static final float thdhj = 0.65f;
    private static final Map bfs_2;
    private static final Set thyb;
    private static class_2960 tadh_2;
    private static final Map tkhj;
    private static final Set bghs_2;
    private static boolean dhgh_2;
    private static final int wbfaptso3k4 = -346579680;
    private static final int lnnd14l = -1850838627;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int b8d0id3dezm;

    private class_2960 getIcon(String string, boolean bl) {
        return Moondlc.id("textures/iconpack/cat_" + string + (bl ? "_on.png" : "_off.png"));
    }

    private String formatSettingName(String string) {
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

    private float getRowHeight(bdhw bdhw2) {
        if (bdhw2 instanceof tay || bdhw2 instanceof tshd) {
            return 34.0f;
        }
        if (bdhw2 instanceof badh_2) {
            return 26.0f;
        }
        if (bdhw2 instanceof bzw_2) {
            bzw_2 bzw2_2 = (bzw_2)bdhw2;
            fa_2 fa2_2 = (fa_2)this.thas.get(bzw2_2);
            float f = fa2_2 != null ? fa2_2.tssh_2() : (this.shln == bzw2_2 ? 1.0f : 0.0f);
            float f2 = bzw2_2.shf_4() ? 152.0f : 138.0f;
            return 26.0f + (f2 - 26.0f) * f;
        }
        if (bdhw2 instanceof bdh_3 || bdhw2 instanceof ts_4) {
            return 26.0f;
        }
        if (bdhw2 instanceof fw_2) {
            return 28.0f;
        }
        if (bdhw2 instanceof khd) {
            return 26.0f;
        }
        if (bdhw2 instanceof bbd_2) {
            bbd_2 bbd2 = (bbd_2)bdhw2;
            float f = 600.0f - this.dnq.tssh_2() - 32.0f;
            float f3 = 10.0f;
            float f4 = 18.0f;
            float f5 = 16.0f;
            float f6 = f - 10.0f;
            float f7 = f4;
            for (s_3 s2 : bbd2.zskh_3()) {
                String string = this.formatSettingName(s2.getName());
                float f8 = bmn.sdha_2.twy_2(7.5f).dak(string) + 14.0f;
                if (f3 + f8 > f6) {
                    f3 = 10.0f;
                    f4 += f5 + 4.0f;
                }
                f3 += f8 + 5.0f;
                f7 = Math.max(f7, f4);
            }
            return f7 + f5 + 4.0f;
        }
        return 24.0f;
    }

    public tkhd() {
        this.dah_2 = new LinkedList();
        this.sdf = new ArrayList();
        this.rrs = new LinkedList();
        this.rwz_2 = new tkhd_2();
        this.sza = new fa_2(300L, jkh.tdth);
        this.khzr_2 = new fa_2(350L, 0.0f, jkh.tb);
        this.dnq = new fa_2(350L, 35.0f, jkh.tb);
        float f = tdw.shjh() / 2.0f - 300.0f;
        float f2 = tdw.thfq() / 2.0f - 195.0f;
        this.dhkhgh = new fh(f, f2, 600.0f, 390.0f);
        for (Object object : trt.values()) {
            LinkedList<bsd_3> linkedList = new LinkedList<bsd_3>();
            thq_3 thq2 = new thq_3((trt)((Object)object), linkedList);
            try {
                thq2.dhaj(new bykh(Moondlc.id("penises/" + object.getName().toLowerCase() + ".penis")));
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            this.sdf.add(thq2);
            linkedList.addAll(Moondlc.getInstance().getModuleManager().rdhs().stream().sorted(Comparator.comparing(bsb::getName)).filter(arg_0 -> tkhd.lambda$new$0((trt)((Object)object), arg_0)).map(arg_0 -> tkhd.lambda$new$1(thq2, arg_0)).toList());
        }
        this.shhd_4 = this.mkField("Search...");
        this.dhas = this.mkField("Config name...");
        this.jkhth = this.mkField("Description...");
        this.shkhh = this.mkField("Tags (comma separated)...");
        this.khkm = this.mkField("PNG image path...");
        this.syd_2 = this.mkField("Config name...");
        this.hsa_3 = this.mkField("Description...");
        this.sa_2 = this.mkField("Tags (comma separated)...");
        this.hrj = this.mkField("PNG image path...");
        this.zrk = this.mkField("Username...");
        this.bghdh = this.mkField("Friend alias...");
        this.btz_2 = this.mkField("Display Name");
        this.dhndh = this.mkField("PNG path...");
        this.dhas.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.jkhth.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.shkhh.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.khkm.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.syd_2.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.hsa_3.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.sa_2.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.hrj.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.zrk.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.bghdh.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.btz_2.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.dhndh.bsz(new byq(30.0f, 30.0f, 35.0f, 255.0f));
        this.btz_2.jshb('A');
        this.btz_2.jshb('l');
        this.btz_2.jshb('y');
        this.btz_2.jshb('a');
        this.loadProfileState();
        this.ensureFriendMetaLoaded();
        HashMap hashMap = new HashMap();
        for (bsb bsb2 : Moondlc.getInstance().getModuleManager().rdhs()) {
            Object object;
            Objects.requireNonNull(bsb2);
            object = new bth_4(bsb2::dwkh, tkhd::lambda$new$2);
            hashMap.put(bsb2.getName().replace(" ", ""), object);
            hashMap.put(bsb2.getName(), object);
        }
        this.shhd_4.dthd(hashMap);
        this.thjh = new bykh(Moondlc.id("penises/search.penis"));
        this.thjh.jla_2();
    }

    private baa_2 mkField(String string) {
        baa_2 baa2_2 = new baa_2(bmn.sdha_2.twy_2(7.0f));
        baa2_2.rja(string);
        return baa2_2;
    }

    private File getProfileStateFile() {
        return new File(dj.sdr_2, "modern_profile.json");
    }

    private File getProfileAvatarFile() {
        return new File(dj.sdr_2, "modern_profile_avatar.png");
    }

    private void setFieldText(baa_2 baa2_2, String string) {
        baa2_2.ghthd();
        if (string != null && !string.isEmpty()) {
            baa2_2.khddh_2(string);
        }
        baa2_2.dby(false);
    }

    private void focusProfileField(baa_2 baa2_2) {
        this.btz_2.dby(baa2_2 == this.btz_2);
        this.dhndh.dby(baa2_2 == this.dhndh);
        this.shhd_4.dby(false);
        this.dhas.dby(false);
        this.zrk.dby(false);
        this.bghdh.dby(false);
        baa_2.dhrh = baa2_2;
    }

    private void blurProfileFields() {
        this.btz_2.dby(false);
        this.dhndh.dby(false);
    }

    private void loadProfileState() {
        Object object;
        File file = this.getProfileStateFile();
        if (file.exists()) {
            try {
                object = new FileReader(file);
                try {
                    String string;
                    JsonObject jsonObject = JsonParser.parseReader((Reader)object).getAsJsonObject();
                    if (jsonObject.has("displayName")) {
                        this.setFieldText(this.btz_2, jsonObject.get("displayName").getAsString());
                    }
                    if (jsonObject.has("avatarPath")) {
                        this.setFieldText(this.dhndh, jsonObject.get("avatarPath").getAsString());
                    }
                    if (jsonObject.has("status")) {
                        this.jzb = thz_2.valueOf(jsonObject.get("status").getAsString());
                    }
                    if (jsonObject.has("avatarZoom")) {
                        this.tfb = jsonObject.get("avatarZoom").getAsFloat();
                    }
                    if (jsonObject.has("avatarOffsetX")) {
                        this.thfth = jsonObject.get("avatarOffsetX").getAsFloat();
                    }
                    if (jsonObject.has("avatarOffsetY")) {
                        this.jshz = jsonObject.get("avatarOffsetY").getAsFloat();
                    }
                    if (!(string = this.dhndh.dwq().trim()).isEmpty()) {
                        this.loadAvatarFromPath(false);
                    }
                }
                finally {
                    ((InputStreamReader)object).close();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (this.rml == null && ((File)(object = this.getProfileAvatarFile())).exists()) {
            try {
                this.stt_2 = ImageIO.read((File)object);
                this.registerCroppedAvatarTexture();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (this.rml != null) {
            tk.zlf_2(this.rml);
        }
        this.blurProfileFields();
    }

    private void saveProfileState() {
        try {
            if (!dj.sdr_2.exists()) {
                dj.sdr_2.mkdirs();
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("displayName", this.btz_2.dwq());
            jsonObject.addProperty("avatarPath", this.dhndh.dwq().trim().replace("\"", ""));
            jsonObject.addProperty("status", this.jzb.name());
            jsonObject.addProperty("avatarZoom", (Number)Float.valueOf(this.tfb));
            jsonObject.addProperty("avatarOffsetX", (Number)Float.valueOf(this.thfth));
            jsonObject.addProperty("avatarOffsetY", (Number)Float.valueOf(this.jshz));
            try (FileWriter fileWriter = new FileWriter(this.getProfileStateFile());){
                fileWriter.write(dj.khds_3.toJson((JsonElement)jsonObject));
            }
            if (this.stt_2 != null) {
                ImageIO.write((RenderedImage)this.stt_2, "png", this.getProfileAvatarFile());
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void openModuleSettings(bsd_3 bsd2_2) {
        this.zzf_2 = bsd2_2;
        this.rghgh.zdhl();
        this.khzr_2.atth_2(0.0f);
        this.hha_2 = bjj.sdhl;
    }

    public static tkhd getCurrentScreen() {
        class_437 class_4372 = tkhd.mc.field_1755;
        if (class_4372 instanceof tkhd) {
            tkhd tkhd2 = (tkhd)class_4372;
            return tkhd2;
        }
        return null;
    }

    public void openFloatingSettings(bsd_3 bsd2_2, float f, float f2) {
        this.rrs.removeIf(arg_0 -> tkhd.lambda$openFloatingSettings$3(bsd2_2, arg_0));
        this.rrs.add(new bdk_2(bsd2_2, f, f2));
    }

    public void openFlyingSettingsTab(bsd_3 bsd2_2, float f, float f2) {
        float f3;
        float f4;
        if (!bsd2_2.dtr_3()) {
            return;
        }
        for (tshr tshr2 : this.dya) {
            if (tshr2.dmj() != bsd2_2 || !tshr2.tdd_5()) continue;
            tshr2.rhh();
            return;
        }
        for (tshr tshr2 : this.dya) {
            tshr2.rhh();
        }
        this.dya.removeIf(tkhd::lambda$openFlyingSettingsTab$4);
        float f5 = tdw.shjh();
        float f6 = tdw.thfq();
        float f7 = 185.0f;
        float f8 = 10.0f;
        float f9 = 8.0f;
        float f10 = 600.0f + f8 + f7 + f9;
        if (this.dhkhgh.khdb_2() + f10 > f5) {
            f4 = Math.max(f9, f5 - f10);
            this.dhkhgh.khtd(f4);
        }
        f4 = Math.min(this.dhkhgh.khdb_2() + 600.0f + f8, f5 - f7 - f9);
        float f11 = this.dhkhgh.sw();
        float f12 = f11;
        if (f12 + (f3 = Math.min(250.0f, 200.0f)) > f6 - f9) {
            f12 = Math.max(f9, f6 - f3 - f9);
        }
        tshr tshr3 = new tshr(bsd2_2, this, f4, f12);
        this.dya.add(tshr3);
    }

    public void mergeSettingsTab(tshr tshr2) {
        tshr2.rhh();
        this.shwh = tshr2.dmj();
        this.bsht = new tshr(this.shwh, this, 0.0f, 0.0f);
        this.bsht.jzj(true);
        this.zlkh.atth_2(0.0f);
        this.hha_2 = bjj.rff;
    }

    public void closeDockedSettings() {
        this.shwh = null;
    }

    public void undockSettingsTab(tshr tshr2) {
        bsd_3 bsd2_2 = tshr2.dmj();
        this.shwh = null;
        float f = this.dhkhgh.khdb_2();
        float f2 = this.dhkhgh.sw();
        this.openFlyingSettingsTab(bsd2_2, f + 600.0f + 8.0f, f2);
    }

    private void renderRipEffect(bzth bzth2, float f, float f2) {
    }

    protected void method_25426() {
        this.khmk = false;
        this.dhdhz_2 = false;
        this.thj_2 = null;
        this.tta_4 = null;
        this.jghb.dam_2(jkh.hd_2);
        this.jghb.zkhdh(400L);
        this.jghb.atth_2(0.0f);
        khw.zdt_2.play(0.8f);
        for (thq_3 thq2 : this.sdf) {
            if (thq2.dhq() == null) continue;
            thq2.dhq().jla_2();
        }
        super.method_25426();
    }

    public void method_25393() {
        this.handleMovementKeys();
        super.method_25393();
    }

    @Override
    public void render(bzth bzth2) {
        float f;
        float f2;
        float f3;
        float f4;
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        this.jghb.khmf(this.khmk ? 0.0f : 1.0f);
        this.jghb.dam_2(!this.khmk ? jkh.hd_2 : jkh.hthd);
        this.jghb.zkhdh((long)bnn.dzb_2().art());
        if (this.khmk && this.jghb.tssh_2() <= 0.01f) {
            this.finishCloseAnimation();
            return;
        }
        this.bqa.dzl_2();
        this.rghgh.dzl_2();
        if (this.hrz && this.hha_2 != bjj.rdy) {
            this.hrz = false;
        }
        if (this.ght_2 && this.hha_2 != bjj.rdy) {
            this.ght_2 = false;
            this.sjq_2 = null;
            this.syd_2.dby(false);
        }
        if (this.thsd_3 && this.hha_2 != bjj.khshh_2) {
            this.thsd_3 = false;
        }
        if (this.shhh_3) {
            this.dhkhgh.khtd((float)bzth2.getMouseX() - this.dhghb);
            this.dhkhgh.thtk_2((float)bzth2.getMouseY() - this.rzy);
        }
        if (this.shhd_4.zqr_2() && !this.zzth) {
            this.thjh.dkn();
        }
        this.zzth = this.shhd_4.zqr_2();
        float f5 = this.jghb.tssh_2();
        float f6 = class_3532.method_15363((float)f5, (float)0.0f, (float)1.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f6);
        bnn bnn2 = bnn.dzb_2();
        zy_2 zy2 = bnn2.zks_4();
        float f7 = this.dhkhgh.khdb_2();
        float f8 = this.dhkhgh.sw();
        float f9 = 0.5f + Math.max(0.0f, f5) * 0.5f;
        if (zy2 == zy_2.ty_2) {
            f4 = f6;
            f3 = (1.0f - f4) * -22.0f;
            f2 = (1.0f - f4) * 12.0f;
            bzth2.method_51448().method_22903();
            bzth2.method_51448().method_46416(f7 + 300.0f, f8 + 195.0f, 0.0f);
            bzth2.method_51448().method_22907(class_7833.field_40716.rotationDegrees(f3));
            bzth2.method_51448().method_22907(class_7833.field_40714.rotationDegrees(f2));
            bzth2.method_51448().method_22905(f9, f9, 1.0f);
            bzth2.method_51448().method_46416(-(f7 + 300.0f), -(f8 + 195.0f), 0.0f);
        } else {
            bzth2.method_51448().method_22903();
            shk_3.bdhkh(bzth2.method_51448(), f7 + 300.0f, f8 + 195.0f, f9);
        }
        f4 = this.dnq.tssh_2();
        f3 = f4 - 35.0f;
        f2 = f7 - f3 / 2.0f;
        float f10 = 600.0f + f3;
        boolean bl = bhh.rkhl(f2, f8, f4 + 6.0f, 390.0, bzth2.getMouseX(), bzth2.getMouseY());
        this.dnq.zkhdh((long)bnn2.hmdh());
        this.dnq.khmf(bl ? 115.0f : 35.0f);
        float f11 = this.dnq.tssh_2();
        f3 = f11 - 35.0f;
        f2 = f7 - f3 / 2.0f;
        f10 = 600.0f + f3;
        byq byq2 = bnn2.ghdt() ? new byq(9.0f, 9.0f, 9.0f, 255.0f) : dmth;
        bzth2.drawShadow(f2 - 12.0f, f8 - 12.0f, f10 + 24.0f, 414.0f, 24.0f, zth_8.all(12.0f), bhj_2.bdhj.thzz_4(0.12f * f6));
        float f12 = bnn2.zda_7() / 100.0f;
        if (f12 < 0.995f) {
            byq byq3;
            bzth2.drawRoundedRect(f2, f8, f11, 390.0f, zth_8.left(6.0f, 6.0f), byq2.thzz_4(f6));
            float f13 = 0.35f + 0.65f * (f12 * f12);
            f = (1.0f - f12) * 16.0f;
            if (f > 0.5f) {
                byq3 = bnn2.ghdt() ? bhj_2.bdhj : dmth;
                bzth2.drawBlurredRect(f2 + f11, f8, f10 - f11, 390.0f, f, zth_8.right(6.0f, 6.0f), byq3.tkhl_2(100.0f * f6 * (1.0f - f12)));
            }
            bzth2.drawRoundedRect(f2 + f11, f8, f10 - f11, 390.0f, zth_8.right(6.0f, 6.0f), byq2.thzz_4(f6 * f13));
            byq3 = bnn2.ghdt() ? new byq(35.0f, 35.0f, 40.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f);
            bzth2.drawRoundedBorder(f2, f8, f10, 390.0f, 0.18f, zth_8.all(6.0f), byq3.thzz_4(f6));
        } else {
            bzth2.drawRoundedRect(f2, f8, f10, 390.0f, zth_8.all(6.0f), byq2.thzz_4(f6));
        }
        byq byq4 = bnn2.ghdt() ? new byq(24.0f, 24.0f, 24.0f, 255.0f) : new byq(235.0f, 235.0f, 238.0f, 255.0f);
        bzth2.drawRect(f2 + f11, f8 + 10.0f, 0.5f, 370.0f, byq4.thzz_4(f6));
        this.renderSidebar(bzth2, f2, f8, f11, f6);
        f = f2 + f11 + 12.0f;
        float f14 = 541.0f;
        float f15 = f8 + 14.0f;
        switch (this.hha_2.ordinal()) {
            case 0: {
                this.renderModulesView(bzth2, f7, f8, f, f15, f14, f6);
                break;
            }
            case 1: {
                this.renderFullSettingsPanel(bzth2, f7, f8, f, f15, f14, f6);
                break;
            }
            case 2: {
                this.renderSectionView(bzth2, f7, f8, f, f15, f14, f6, this::renderConfigsContent);
                break;
            }
            case 3: {
                this.renderSectionView(bzth2, f7, f8, f, f15, f14, f6, this::renderFriendsContent);
                break;
            }
            case 4: {
                this.renderSectionView(bzth2, f7, f8, f, f15, f14, f6, this::renderThemesContent);
                break;
            }
            case 5: {
                this.renderSectionView(bzth2, f7, f8, f, f15, f14, f6, this::lambda$render$5);
            }
        }
        for (nt_3 nt2 : this.rrs) {
            nt2.dhtz(bzth2);
        }
        this.renderRipEffect(bzth2, f7, f8);
        for (nt_3 nt2 : this.dya) {
            if (!((tshr)nt2).sdhd_4()) {
                ((tshr)nt2).ss_4(f2 + f10 + 8.0f);
            }
            nt2.dhtz(bzth2);
        }
        this.dya.removeIf(tkhd::lambda$render$6);
        for (nt_3 nt2 : this.dah_2) {
            nt2.dhtz(bzth2);
            if (((br)nt2).rqz() == null) continue;
            if (((br)nt2).rqz().equals("Primary Accent")) {
                bnn2.khghz(((br)nt2).zad_4());
                continue;
            }
            if (!((br)nt2).rqz().equals("Secondary Accent")) continue;
            bnn2.hddh(((br)nt2).zad_4());
        }
        this.rrs.removeIf(tkhd::lambda$render$7);
        this.dah_2.removeIf(tkhd::lambda$render$8);
        if (this.rha_3) {
            this.renderProfileSettings(bzth2, f7, f8);
        }
        if (this.rf) {
            this.renderAvatarEditor(bzth2);
        }
        if (this.thzb) {
            this.renderConfigThumbnailEditor(bzth2);
        }
        if (this.ght_2 && this.hha_2 == bjj.rdy) {
            this.renderConfigActionsModal(bzth2);
        }
        if (this.hrz && this.hha_2 == bjj.rdy) {
            this.renderSaveConfigModal(bzth2);
        }
        if (this.thsd_3 && this.hha_2 == bjj.khshh_2) {
            this.renderAddFriendModal(bzth2);
        }
        if (this.dhkhs_2) {
            this.renderKeybindPopup(bzth2);
        }
        bzth2.method_51448().method_22909();
    }

    private void renderSidebar(bzth bzth2, float f, float f2, float f3, float f4) {
        Object object;
        float f5;
        Object object2;
        String[] stringArray;
        float f6;
        bhm.dar_2(bzth2.method_51448(), f, f2, f3, 390.0f);
        float f7 = class_3532.method_15363((float)((f3 - 35.0f) / 80.0f), (float)0.0f, (float)1.0f);
        float f8 = class_3532.method_15363((float)(f7 * 1.6f), (float)0.0f, (float)1.0f) * f4;
        float f9 = (1.0f - f7) * -12.0f;
        float f10 = f + 30.0f + f9;
        float f11 = f + 17.5f;
        float f12 = f2 + 8.0f;
        float f13 = 22.0f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = (bl ? dmth : jss_3).thzz_4(f4);
        float f14 = f + 6.5f;
        bzth2.drawText(bmn.tdd.twy_2(f13), "A", f14, f12, byq2);
        if (f8 > 0.005f) {
            f6 = f14 + f13 + 6.0f + f9;
            bzth2.drawText(bmn.shmz.twy_2(12.0f), "Moondlc", f6, f12 + 3.0f, byq2.thzz_4(f8));
            bzth2.drawText(bmn.shzth.twy_2(7.5f), "Version:", f6, f12 + 14.5f, new byq(103.0f, 103.0f, 103.0f, 255.0f).thzz_4(f8));
            float f15 = bmn.shzth.twy_2(7.5f).dak("Version: ");
            bzth2.drawText(bmn.shzth.twy_2(7.5f), "Beta", f6 + f15, f12 + 14.5f, bnn.dzb_2().dhdhk(f6).thzz_4(f8));
        }
        f6 = f12 + f13 + 8.0f;
        byq byq3 = bl ? new byq(36.0f, 36.0f, 40.0f, 150.0f) : new byq(235.0f, 235.0f, 238.0f, 255.0f);
        bzth2.drawRect(f + 8.0f, f6, f3 - 16.0f, 0.5f, byq3.thzz_4(f8));
        float f16 = f6 + 10.0f;
        if (f8 > 0.005f) {
            bzth2.drawText(bmn.shmz.twy_2(7.5f), "FEATURES", f10 - 20.0f + f9, f16, new byq(103.0f, 103.0f, 103.0f, 255.0f).thzz_4(f8));
        }
        f16 += 12.0f;
        String[] stringArray2 = new String[]{"Combat", "Movement", "Visuals", "Player", "Misc"};
        trt[] trtArray = new trt[]{trt.tht_4, trt.rqq, trt.shsth_2, trt.khbdh, trt.swl};
        String[] stringArray3 = new String[]{"combat", "movement", "visuals", "player", "misc"};
        String[] stringArray4 = new String[]{"", "", "", "", ""};
        for (int i = 0; i < trtArray.length; ++i) {
            boolean bl2 = (this.hha_2 == bjj.rff || this.hha_2 == bjj.sdhl) && this.khlsh == trtArray[i];
            boolean bl3 = bhh.zzy_3(f, f16, f3, 13.0, bzth2);
            if (bl3) {
                zw.hdhth(bay_2.mw);
                stringArray = bl ? new byq(39.0f, 39.0f, 42.0f, 100.0f) : jqsh.thzz_4(0.4f);
                bzth2.drawRoundedRect(f + 4.0f, f16 - 1.0f, f3 - 8.0f, 13.0f, zth_8.all(3.0f), stringArray.thzz_4(f4));
            }
            stringArray = this.khzgh_2.computeIfAbsent(stringArray3[i], tkhd::lambda$renderSidebar$9);
            stringArray.khmf(bl2 ? 1.0f : 0.0f);
            float f17 = stringArray.tssh_2();
            byq byq4 = thyt_2;
            byq byq5 = bl ? dmth : jss_3;
            object2 = bl3 ? byq5.thzz_4(0.85f) : byq4;
            object2 = ((byq)object2).dkhw_2(byq5, f17).thzz_4(f4);
            f5 = bmn.dhsth_2.twy_2(10.0f).dak(stringArray4[i]);
            bzth2.drawText(bmn.dhsth_2.twy_2(10.0f), stringArray4[i], f11 - f5 / 2.0f, f16 + 1.5f, (byq)object2);
            if (f8 > 0.005f) {
                bzth2.drawText(bl2 ? bmn.sdha_2.twy_2(7.5f) : bmn.shzth.twy_2(7.5f), stringArray2[i], f10, f16 + 2.0f, ((byq)object2).thzz_4(f8));
            }
            f16 += 14.0f;
        }
        f16 += 6.0f;
        if (f8 > 0.005f) {
            bzth2.drawText(bmn.shmz.twy_2(7.5f), "OTHERS", f10 - 20.0f + f9, f16, new byq(103.0f, 103.0f, 103.0f, 255.0f).thzz_4(f8));
        }
        f16 += 12.0f;
        String[] stringArray5 = new String[]{"Configs", "Friends", "Themes", "Cosmetics"};
        bjj[] bjjArray = new bjj[]{bjj.rdy, bjj.khshh_2, bjj.bts_3, bjj.bsd};
        String[] stringArray6 = new String[]{"configs", "friends", "themes", "cosmetics"};
        stringArray = new String[]{"", "", "", ""};
        for (int i = 0; i < bjjArray.length; ++i) {
            boolean bl4 = this.hha_2 == bjjArray[i];
            boolean bl5 = bhh.zzy_3(f, f16, f3, 13.0, bzth2);
            if (bl5) {
                zw.hdhth(bay_2.mw);
                object2 = bl ? new byq(39.0f, 39.0f, 42.0f, 100.0f) : jqsh.thzz_4(0.4f);
                bzth2.drawRoundedRect(f + 4.0f, f16 - 1.0f, f3 - 8.0f, 13.0f, zth_8.all(3.0f), ((byq)object2).thzz_4(f4));
            }
            object2 = this.khzgh_2.computeIfAbsent(stringArray6[i], tkhd::lambda$renderSidebar$10);
            ((fa_2)object2).khmf(bl4 ? 1.0f : 0.0f);
            f5 = ((fa_2)object2).tssh_2();
            object = thyt_2;
            byq byq6 = bl ? dmth : jss_3;
            byq byq7 = bl5 ? byq6.thzz_4(0.85f) : object;
            byq7 = byq7.dkhw_2(byq6, f5).thzz_4(f4);
            float f18 = bmn.dhsth_2.twy_2(10.0f).dak(stringArray[i]);
            bzth2.drawText(bmn.dhsth_2.twy_2(10.0f), stringArray[i], f11 - f18 / 2.0f, f16 + 1.5f, byq7);
            if (f8 > 0.005f) {
                bzth2.drawText(bl4 ? bmn.sdha_2.twy_2(7.5f) : bmn.shzth.twy_2(7.5f), stringArray5[i], f10, f16 + 2.0f, byq7.thzz_4(f8));
            }
            f16 += 14.0f;
        }
        float f19 = f2 + 390.0f - 30.0f;
        this.renderProfileAvatar(bzth2, f + 6.0f, f19, 19.0f, f4);
        this.renderProfileStatus(bzth2, f + 18.5f, f19 + 12.5f, 7.0f, f4);
        if (f8 > 0.005f) {
            float f20 = f + 30.0f + f9;
            trd trd2 = bmn.sdha_2.twy_2(7.5f);
            object2 = (bl ? dmth : jss_3).thzz_4(f4);
            String string = tkhd.getAccountUsername();
            object = tkhd.getAccountUidFormatted();
            bzth2.drawText(trd2, string, f20, f19 + 2.0f, ((byq)object2).thzz_4(f8));
            bzth2.drawText(bmn.sdha_2.twy_2(6.5f), (String)object, f20, f19 + 12.0f, thyt_2.thzz_4(f8));
        }
        bhm.sdhsh_2();
    }

    public float getDockedSplitProgress() {
        return this.zlkh.tssh_2();
    }

    private void renderModulesView(bzth bzth2, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean bl;
        float f7 = (float)(-this.bqa.shtt_4());
        boolean bl2 = bnn.dzb_2().ghdt();
        byq byq2 = bl2 ? dmth : jss_3;
        this.zlkh.khmf(this.shwh != null ? 1.0f : 0.0f);
        float f8 = this.zlkh.tssh_2();
        if (this.shwh == null && f8 < 0.001f) {
            this.bsht = null;
        }
        float f9 = 16.0f;
        float f10 = (f5 - 6.0f) / 2.0f;
        float f11 = (f5 - f9) * 0.44f;
        boolean bl3 = this.shwh != null || f8 > 0.001f;
        float f12 = bl3 ? f10 + (f11 - f10) * f8 : f5;
        boolean bl4 = bl3;
        this.renderSearchBar(bzth2, f, f2, f3, f4, f12, f6);
        boolean bl5 = bl = !this.shhd_4.dwq().trim().isEmpty();
        String string = bl ? "All" : (this.khlsh == trt.swl ? "Misc" : this.khlsh.getName());
        bzth2.drawText(bmn.shmz.twy_2(13.0f), string, f3, f4 + 22.0f, byq2.thzz_4(f6));
        float f13 = f4 + 38.0f;
        float f14 = 390.0f - (f13 - f2) - 10.0f;
        this.renderModuleGrid(bzth2, f3, f13, f12, f14, f7, bl4);
        if (f8 > 0.001f && this.bsht != null) {
            float f15 = f3 + f12 + f9 / 2.0f;
            byq byq3 = bl2 ? new byq(24.0f, 24.0f, 24.0f, 255.0f) : new byq(235.0f, 235.0f, 238.0f, 255.0f);
            bzth2.drawRect(f15, f2 + 10.0f, 0.5f, 370.0f, byq3.thzz_4(f6 * f8));
            float f16 = f15 + f9 / 2.0f + (1.0f - f8) * 16.0f;
            float f17 = f5 - f12 - f9;
            float f18 = f4;
            float f19 = 390.0f - (f18 - f2) - 10.0f;
            this.bsht.amf(f16, f18, f17, f19);
            bhm.dar_2(bzth2.method_51448(), f15 + 1.0f, f18, f17 + f9, f19);
            this.bsht.dhtz(bzth2);
            bhm.sdhsh_2();
        }
    }

    private void renderSearchBar(bzth bzth2, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = Math.min(120.0f, Math.max(60.0f, f5 - 10.0f));
        float f8 = f3;
        float f9 = f4 - 2.0f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(16.0f, 16.0f, 17.0f, 255.0f) : dmth;
        byq byq3 = hja;
        byq byq4 = bl ? dmth : jss_3;
        bzth2.drawRoundedRect(f8, f9, f7, 16.0f, zth_8.all(4.0f), byq2.thzz_4(f6));
        if (!bl) {
            bzth2.drawRoundedBorder(f8, f9, f7, 16.0f, 0.18f, zth_8.all(4.0f), byq3.thzz_4(f6));
        }
        if (bhh.zzy_3(f8, f9, f7, 16.0, bzth2)) {
            zw.hdhth(bay_2.shsdh);
        }
        bzth2.drawTexture(Moondlc.id("textures/iconpack/search.png"), f8 + 5.0f, f9 + 3.5f, 9.0f, 9.0f, thyt_2.thzz_4(f6));
        this.shhd_4.dzh_8(f6);
        this.shhd_4.amf(f8 + 11.5f, f9, f7 - 13.0f, 16.0f);
        this.shhd_4.bsz(byq4);
        this.shhd_4.dhtz(bzth2);
    }

    private void renderModuleGrid(bzth bzth2, float f, float f2, float f3, float f4, float f5, boolean bl) {
        Object object4;
        Object object2;
        List list;
        boolean bl2;
        bhm.dar_2(bzth2.method_51448(), f, f2, f3, f4);
        int n = bl ? 1 : 2;
        float f6 = bl ? f3 : (f3 - 6.0f) / 2.0f;
        float f7 = 0.0f;
        float f8 = f5;
        boolean bl3 = bl2 = !this.shhd_4.dwq().trim().isEmpty();
        if (bl2) {
            list = new ArrayList();
            for (Object object3 : this.sdf) {
                list.addAll(((thq_3)object3).hhsh_2());
            }
        } else {
            object2 = this.sdf.stream().filter(this::lambda$renderModuleGrid$11).findFirst().orElse(null);
            if (object2 == null) {
                bhm.sdhsh_2();
                return;
            }
            list = ((thq_3)object2).hhsh_2();
        }
        object2 = new ArrayList<Object>();
        for (Object object4 : list) {
            if (this.searchHides((bsd_3)object4)) continue;
            boolean bl4 = this.rrs.stream().anyMatch(arg_0 -> tkhd.lambda$renderModuleGrid$12((bsd_3)object4, arg_0));
            ((bsd_3)object4).hls().ddt_6(!bl4);
            ((bsd_3)object4).hshh_2().ddt_6(!bl4);
            float f9 = f + f7 * (f6 + 6.0f);
            float f10 = f2 + f8;
            ((nt_3)object4).amf(f9, f10, f6, 34.0f);
            if (f10 + 34.0f > f2 && f10 < f2 + f4) {
                ((ArrayList)object2).add(object4);
            }
            if (!((f7 += 1.0f) >= (float)n)) continue;
            f7 = 0.0f;
            f8 += 40.0f;
        }
        float f11 = class_3532.method_15363((float)this.jghb.tssh_2(), (float)0.0f, (float)1.0f);
        object4 = ((ArrayList)object2).iterator();
        while (object4.hasNext()) {
            bsd_3 bsd2_2 = (bsd_3)object4.next();
            bsd2_2.sst_7(bzth2, f11);
            if (!bsd2_2.rhb(bzth2)) continue;
            zw.hdhth(bay_2.mw);
        }
        object4 = ((ArrayList)object2).iterator();
        while (object4.hasNext()) {
            bsd_3 bsd3_2 = (bsd_3)object4.next();
            bsd3_2.thzs_3(bzth2, f11);
            bsd3_2.bl_2(bzth2, f11);
        }
        object4 = new bja_2(class_290.field_1575, bmn.sdha_2);
        Iterator iterator = ((ArrayList)object2).iterator();
        while (iterator.hasNext()) {
            bsd_3 bsd4 = (bsd_3)iterator.next();
            bsd4.hdw_2(bzth2, f11);
        }
        ((bja_2)object4).jbn();
        iterator = ((ArrayList)object2).iterator();
        while (iterator.hasNext()) {
            bsd_3 bsd5 = (bsd_3)iterator.next();
            bsd5.stht(bzth2, f11);
        }
        float f12 = f8 + (f7 > 0.0f ? 40.0f : 0.0f) - f5;
        this.bqa.srb_2(-Math.max(0.0f, f12 - f4 + 8.0f));
        bhm.sdhsh_2();
    }

    private void renderFullSettingsPanel(bzth bzth2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.khzr_2.khmf(1.0f);
        float f7 = Math.min(1.0f, this.khzr_2.tssh_2()) * f6;
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f7);
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = (bl ? dmth : jss_3).thzz_4(f7);
        byq byq3 = bnn.dzb_2().dhdhk(f3).thzz_4(f7);
        boolean bl2 = bhh.zzy_3(f3, f4, 52.0, 16.0, bzth2);
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        byq byq4 = (bl2 ? (bl ? dmth : jss_3) : thyt_2).thzz_4(f7);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), "← Back", f3, f4 + 1.0f, byq4);
        bsb bsb2 = this.zzf_2.zhz_7();
        bzth2.drawText(bmn.shmz.twy_2(16.0f), bsb2.getName(), f3, f4 + 22.0f, byq2);
        bzth2.drawText(bmn.shzth.twy_2(7.5f), bsb2.zhz(), f3, f4 + 40.0f, thyt_2.thzz_4(f7));
        boolean bl3 = bsb2.rgha_2();
        fa_2 fa2_2 = this.khzgh_2.computeIfAbsent("mod_toggle_" + bsb2.getName(), arg_0 -> tkhd.lambda$renderFullSettingsPanel$13(bl3, arg_0));
        fa2_2.khmf(bl3 ? 1.0f : 0.0f);
        float f8 = fa2_2.tssh_2();
        float f9 = 24.0f;
        float f10 = 14.0f;
        float f11 = f + 600.0f - 14.0f - 34.0f;
        float f12 = f4 + 22.0f;
        byq byq5 = (bl ? new byq(45.0f, 45.0f, 50.0f, 255.0f) : new byq(209.0f, 213.0f, 219.0f, 255.0f)).thzz_4(f7);
        byq byq6 = byq5.dkhw_2(byq3, f8);
        bzth2.drawRoundedRect(f11, f12, f9, f10, zth_8.all(7.0f), byq6);
        float f13 = 10.0f;
        float f14 = f11 + 2.0f + 10.0f * f8;
        byq byq7 = (bl ? (f8 > 0.5f ? dmth : new byq(18.0f, 18.0f, 20.0f, 255.0f)) : dmth).thzz_4(f7);
        bzth2.drawRoundedRect(f14, f12 + 2.0f, f13, f13, zth_8.all(5.0f), byq7);
        if (bhh.zzy_3(f11, f12, f9, f10, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        float f15 = f4 + 56.0f;
        byq byq8 = (bl ? new byq(36.0f, 36.0f, 40.0f, 150.0f) : hja).thzz_4(f7);
        bzth2.drawRect(f3, f15, f5, 0.5f, byq8);
        float f16 = f15 + 4.0f;
        float f17 = 390.0f - (f16 - f2) - 14.0f + 6.0f;
        float f18 = (float)(-this.rghgh.shtt_4());
        bhm.dar_2(bzth2.method_51448(), f3, f16, f5, f17);
        float f19 = f16 + f18;
        float f20 = 0.0f;
        ArrayList<khd> arrayList = new ArrayList<khd>();
        for (bdhw bdhw2 : bsb2.dty()) {
            if (!bdhw2.tsa_5()) continue;
            if (bdhw2 instanceof khd) {
                khd khd2 = (khd)bdhw2;
                arrayList.add(khd2);
            }
            float f21 = this.renderSettingRow(bzth2, bdhw2, f3, f19, f5, f16, f16 + f17, f7, bl, byq3, byq2);
            f19 += f21 + 4.0f;
            f20 += f21 + 4.0f;
        }
        this.rghgh.srb_2(-Math.max(0.0f, f20 - f17 + 8.0f));
        bhm.sdhsh_2();
        for (khd khd3 : arrayList) {
            this.renderDropdownOverlay(bzth2, khd3, byq3, byq2, f7, bl);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private float renderSettingRow(bzth bzth2, bdhw bdhw2, float f, float f2, float f3, float f4, float f5, float f6, boolean bl, byq byq2, byq byq3) {
        if (f2 + 34.0f < f4 || f2 > f5) {
            return this.getRowHeight(bdhw2);
        }
        if (bdhw2 instanceof badh_2) {
            badh_2 badh2 = (badh_2)bdhw2;
            return this.renderBooleanRow(bzth2, badh2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof tay) {
            tay tay2 = (tay)bdhw2;
            return this.renderSliderRow(bzth2, tay2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof tshd) {
            tshd tshd2 = (tshd)bdhw2;
            return this.renderRangeRow(bzth2, tshd2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof khd) {
            khd khd2 = (khd)bdhw2;
            return this.renderModeRow(bzth2, khd2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof bbd_2) {
            bbd_2 bbd2 = (bbd_2)bdhw2;
            return this.renderSelectRow(bzth2, bbd2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof ts_4) {
            ts_4 ts2 = (ts_4)bdhw2;
            return this.renderStringRow(bzth2, ts2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof fw_2) {
            fw_2 fw2 = (fw_2)bdhw2;
            return this.renderButtonRow(bzth2, fw2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof byl) {
            byl byl2 = (byl)bdhw2;
            return this.renderBlockListRow(bzth2, byl2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof bzw_2) {
            bzw_2 bzw2_2 = (bzw_2)bdhw2;
            return this.renderColorRow(bzth2, bzw2_2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof bdh_3) {
            bdh_3 bdh2_2 = (bdh_3)bdhw2;
            return this.renderBindRow(bzth2, bdh2_2, f, f2, f3, f6, bl, byq2, byq3);
        }
        if (bdhw2 instanceof hw) {
            return this.renderGenericRow(bzth2, bdhw2, f, f2, f3, f6, bl, byq3);
        }
        return this.renderGenericRow(bzth2, bdhw2, f, f2, f3, f6, bl, byq3);
    }

    private float renderBooleanRow(bzth bzth2, badh_2 badh2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        float f5 = 26.0f;
        boolean bl2 = bhh.zzy_3(f, f2, f3, f5, bzth2);
        if (bl2) {
            byq byq4 = (bl ? new byq(32.0f, 32.0f, 36.0f, 160.0f) : new byq(244.0f, 244.0f, 245.0f, 180.0f)).thzz_4(f4);
            bzth2.drawRoundedRect(f, f2, f3, f5, zth_8.all(5.0f), byq4);
            zw.hdhth(bay_2.mw);
        }
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(badh2.getName()), f + 10.0f, f2 + (f5 - 8.5f) / 2.0f + 0.5f, byq3);
        float f6 = this.getOrCreateBoolAnim(badh2);
        float f7 = 24.0f;
        float f8 = 14.0f;
        float f9 = f + f3 - f7 - 10.0f;
        float f10 = f2 + (f5 - f8) / 2.0f;
        byq byq5 = (bl ? new byq(45.0f, 45.0f, 50.0f, 255.0f) : new byq(209.0f, 213.0f, 219.0f, 255.0f)).thzz_4(f4);
        byq byq6 = byq5.dkhw_2(byq2, f6);
        bzth2.drawRoundedRect(f9, f10, f7, f8, zth_8.all(7.0f), byq6);
        float f11 = 10.0f;
        float f12 = f9 + 2.0f + 10.0f * f6;
        byq byq7 = (bl ? (f6 > 0.5f ? dmth : new byq(18.0f, 18.0f, 20.0f, 255.0f)) : dmth).thzz_4(f4);
        bzth2.drawRoundedRect(f12, f10 + 2.0f, f11, f11, zth_8.all(5.0f), byq7);
        return f5;
    }

    private float getOrCreateBoolAnim(badh_2 badh2) {
        fa_2 fa2_2 = this.jnm.computeIfAbsent(badh2, arg_0 -> tkhd.lambda$getOrCreateBoolAnim$14(badh2, arg_0));
        fa2_2.ddt_6(badh2.shzl());
        return fa2_2.tssh_2();
    }

    private float getOrCreateSliderAnim(tay tay2, float f) {
        fa_2 fa2_2 = this.shqh_2.computeIfAbsent(tay2, arg_0 -> tkhd.lambda$getOrCreateSliderAnim$15(f, arg_0));
        fa2_2.khmf(f);
        return fa2_2.tssh_2();
    }

    private float renderSliderRow(bzth bzth2, tay tay2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        float f5;
        float f6 = 34.0f;
        byq byq4 = (bl ? new byq(36.0f, 36.0f, 40.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f)).thzz_4(f4);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(tay2.getName()), f + 10.0f, f2 + 4.0f, byq3);
        float f7 = tay2.thw_5();
        float f8 = (f7 - tay2.alz_2()) / (tay2.sdhh_4() - tay2.alz_2());
        float f9 = this.getOrCreateSliderAnim(tay2, f8);
        float f10 = f + 10.0f;
        float f11 = f2 + 22.0f;
        float f12 = f3 - 20.0f;
        bzth2.drawRoundedRect(f10, f11, f12, 4.0f, zth_8.all(2.0f), byq4);
        if (!bl) {
            bzth2.drawRoundedBorder(f10, f11, f12, 4.0f, 0.18f, zth_8.all(2.0f), hja.thzz_4(f4));
        }
        if ((f5 = Math.max(0.0f, f12 * f9)) > 0.0f) {
            zth_8 zth2 = f5 >= f12 - 2.0f ? zth_8.all(2.0f) : zth_8.left(2.0f, 2.0f);
            bzth2.drawRoundedRect(f10, f11, f5, 4.0f, zth2, byq2);
        }
        float f13 = 8.0f;
        float f14 = f10 + f12 * f9 - f13 / 2.0f;
        float f15 = f11 + 2.0f - f13 / 2.0f;
        bzth2.drawShadow(f14, f15, f13, f13, 4.0f, zth_8.all(f13 / 2.0f), bhj_2.bdhj.thzz_4(0.22f * f4));
        bzth2.drawRoundedRect(f14, f15, f13, f13, zth_8.all(f13 / 2.0f), bhj_2.rrd.thzz_4(f4));
        bzth2.drawRoundedBorder(f14, f15, f13, f13, 0.4f, zth_8.all(f13 / 2.0f), (bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : new byq(200.0f, 200.0f, 205.0f, 255.0f)).thzz_4(f4));
        bzth2.drawRoundedRect(f14 + 2.0f, f15 + 2.0f, f13 - 4.0f, f13 - 4.0f, zth_8.all((f13 - 4.0f) / 2.0f), byq2);
        String string = String.format(Locale.US, "%.1f%s", Float.valueOf(f7), tay2.hah_4());
        bzth2.drawRightText(bmn.shzth.twy_2(7.0f), string, f + f3 - 10.0f, f2 + 4.0f, thyt_2.thzz_4(f4));
        if (bhh.zzy_3(f10, (double)f11 - 5.0, f12, 14.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        return f6;
    }

    private float renderRangeRow(bzth bzth2, tshd tshd2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        float f5 = 34.0f;
        byq byq4 = (bl ? new byq(36.0f, 36.0f, 40.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f)).thzz_4(f4);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(tshd2.getName()), f + 10.0f, f2 + 4.0f, byq3);
        float f6 = (tshd2.dhdb_2() - tshd2.tdh_6()) / (tshd2.ghjdh() - tshd2.tdh_6());
        float f7 = (tshd2.aghm() - tshd2.tdh_6()) / (tshd2.ghjdh() - tshd2.tdh_6());
        fa_2 fa2_2 = this.bdh_5.computeIfAbsent(tshd2, arg_0 -> tkhd.lambda$renderRangeRow$16(f6, arg_0));
        fa_2 fa3_2 = this.sja_2.computeIfAbsent(tshd2, arg_0 -> tkhd.lambda$renderRangeRow$17(f7, arg_0));
        fa2_2.khmf(f6);
        fa3_2.khmf(f7);
        float f8 = fa2_2.tssh_2();
        float f9 = fa3_2.tssh_2();
        String string = String.format(Locale.US, "%.1f - %.1f", Float.valueOf(tshd2.dhdb_2()), Float.valueOf(tshd2.aghm()));
        bzth2.drawRightText(bmn.shzth.twy_2(7.0f), string, f + f3 - 10.0f, f2 + 4.0f, thyt_2.thzz_4(f4));
        float f10 = f + 10.0f;
        float f11 = f2 + 22.0f;
        float f12 = f3 - 20.0f;
        bzth2.drawRoundedRect(f10, f11, f12, 4.0f, zth_8.all(2.0f), byq4);
        if (!bl) {
            bzth2.drawRoundedBorder(f10, f11, f12, 4.0f, 0.18f, zth_8.all(2.0f), hja.thzz_4(f4));
        }
        float f13 = f10 + f12 * f8;
        float f14 = Math.max(0.0f, f12 * (f9 - f8));
        if (f14 > 0.0f) {
            bzth2.drawRoundedRect(f13, f11, f14, 4.0f, zth_8.all(2.0f), byq2);
        }
        float f15 = 8.0f;
        float f16 = f10 + f12 * f8 - f15 / 2.0f;
        float f17 = f10 + f12 * f9 - f15 / 2.0f;
        float f18 = f11 + 2.0f - f15 / 2.0f;
        bzth2.drawShadow(f16, f18, f15, f15, 4.0f, zth_8.all(f15 / 2.0f), bhj_2.bdhj.thzz_4(0.22f * f4));
        bzth2.drawRoundedRect(f16, f18, f15, f15, zth_8.all(f15 / 2.0f), bhj_2.rrd.thzz_4(f4));
        bzth2.drawRoundedBorder(f16, f18, f15, f15, 0.4f, zth_8.all(f15 / 2.0f), (bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : new byq(200.0f, 200.0f, 205.0f, 255.0f)).thzz_4(f4));
        bzth2.drawRoundedRect(f16 + 2.0f, f18 + 2.0f, f15 - 4.0f, f15 - 4.0f, zth_8.all((f15 - 4.0f) / 2.0f), byq2);
        bzth2.drawShadow(f17, f18, f15, f15, 4.0f, zth_8.all(f15 / 2.0f), bhj_2.bdhj.thzz_4(0.22f * f4));
        bzth2.drawRoundedRect(f17, f18, f15, f15, zth_8.all(f15 / 2.0f), bhj_2.rrd.thzz_4(f4));
        bzth2.drawRoundedBorder(f17, f18, f15, f15, 0.4f, zth_8.all(f15 / 2.0f), (bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : new byq(200.0f, 200.0f, 205.0f, 255.0f)).thzz_4(f4));
        bzth2.drawRoundedRect(f17 + 2.0f, f18 + 2.0f, f15 - 4.0f, f15 - 4.0f, zth_8.all((f15 - 4.0f) / 2.0f), byq2);
        if (bhh.zzy_3(f10, (double)f11 - 5.0, f12, 14.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        return f5;
    }

    private float renderModeRow(bzth bzth2, khd khd2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        float f5 = 26.0f;
        boolean bl2 = bhh.zzy_3(f, f2, f3, f5, bzth2);
        if (bl2) {
            byq byq4 = (bl ? new byq(32.0f, 32.0f, 36.0f, 160.0f) : new byq(244.0f, 244.0f, 245.0f, 180.0f)).thzz_4(f4);
            bzth2.drawRoundedRect(f, f2, f3, f5, zth_8.all(5.0f), byq4);
        }
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(khd2.getName()), f + 10.0f, f2 + (f5 - 8.5f) / 2.0f + 0.5f, byq3);
        float f6 = 110.0f;
        float f7 = 16.0f;
        float f8 = f + f3 - f6 - 10.0f;
        float f9 = f2 + (f5 - f7) / 2.0f;
        this.dzh_2.put(khd2, Float.valueOf(f8));
        this.shkhn.put(khd2, Float.valueOf(f9));
        this.thra_2.put(khd2, Float.valueOf(f6));
        byq byq5 = (bl ? new byq(32.0f, 32.0f, 36.0f, 255.0f) : new byq(238.0f, 238.0f, 242.0f, 255.0f)).thzz_4(f4);
        bzth2.drawRoundedRect(f8, f9, f6, f7, zth_8.all(4.0f), byq5);
        if (!bl) {
            bzth2.drawRoundedBorder(f8, f9, f6, f7, 0.18f, zth_8.all(4.0f), hja.thzz_4(f4));
        }
        String string = khd2.sdh_2() != null ? this.formatSettingName(khd2.sdh_2().getName()) : "None";
        bzth2.drawText(bmn.shzth.twy_2(7.5f), string, f8 + 6.0f, f9 + (f7 - 7.5f) / 2.0f + 0.5f, byq3);
        boolean bl3 = this.dlgh.getOrDefault(khd2, false);
        String string2 = bl3 ? "▲" : "▼";
        bzth2.drawText(bmn.shzth.twy_2(6.5f), string2, f8 + f6 - 12.0f, f9 + 4.5f, thyt_2.thzz_4(f4));
        if (bhh.zzy_3(f8, f9, f6, f7, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        return f5;
    }

    private void renderDropdownOverlay(bzth bzth2, khd khd2, byq byq2, byq byq3, float f, boolean bl) {
        Boolean bl2 = (Boolean)this.dlgh.get(khd2);
        boolean bl3 = bl2 != null && bl2 != false;
        fa_2 fa2_2 = this.bkhf.computeIfAbsent(khd2, tkhd::lambda$renderDropdownOverlay$18);
        fa2_2.khmf(bl3 ? 1.0f : 0.0f);
        float f2 = fa2_2.tssh_2();
        if (f2 < 0.01f) {
            return;
        }
        Float f3 = (Float)this.dzh_2.get(khd2);
        Float f4 = (Float)this.shkhn.get(khd2);
        Float f5 = (Float)this.thra_2.get(khd2);
        if (f3 == null || f4 == null || f5 == null) {
            return;
        }
        float f6 = 15.0f;
        float f7 = (float)khd2.jsw().size() * f6 + 4.0f;
        float f8 = f7 * f2;
        float f9 = f4.floatValue() + 16.0f + 2.0f;
        byq byq4 = bl ? new byq(24.0f, 24.0f, 28.0f, 255.0f) : dmth;
        byq byq5 = bl ? new byq(45.0f, 45.0f, 50.0f, 255.0f) : new byq(220.0f, 220.0f, 225.0f, 255.0f);
        bzth2.drawShadow(f3.floatValue() - 2.0f, f9 - 2.0f, f5.floatValue() + 4.0f, f8 + 4.0f, 10.0f, zth_8.all(4.0f), bhj_2.bdhj.thzz_4(0.2f * f * f2));
        bzth2.drawRoundedRect(f3.floatValue(), f9, f5.floatValue(), f8, zth_8.all(4.0f), byq4.thzz_4(f * f2));
        bzth2.drawRoundedBorder(f3.floatValue(), f9, f5.floatValue(), f8, 0.18f, zth_8.all(4.0f), byq5.thzz_4(f * f2));
        bhm.dar_2(bzth2.method_51448(), f3.floatValue(), f9, f5.floatValue(), f8);
        float f10 = f9 + 2.0f;
        for (fy fy2 : khd2.jsw()) {
            boolean bl4;
            boolean bl5 = bhh.zzy_3(f3.floatValue(), f10, f5.floatValue(), f6, bzth2);
            if (bl5) {
                bzth2.drawRoundedRect(f3.floatValue() + 2.0f, f10, f5.floatValue() - 4.0f, f6, zth_8.all(2.5f), byq2.thzz_4(0.2f * f * f2));
                zw.hdhth(bay_2.mw);
            }
            byq byq6 = (bl4 = fy2.shghkh()) ? byq2 : byq3;
            bzth2.drawText(bmn.shzth.twy_2(7.5f), this.formatSettingName(fy2.getName()), f3.floatValue() + 6.0f, f10 + (f6 - 7.5f) / 2.0f + 0.5f, byq6.thzz_4(f * f2));
            if (bl4) {
                bzth2.drawTexture(bl_2, f3.floatValue() + f5.floatValue() - 12.0f, f10 + 4.0f, 7.0f, 7.0f, byq2.thzz_4(f * f2));
            }
            f10 += f6;
        }
        bhm.sdhsh_2();
    }

    private float renderSelectRow(bzth bzth2, bbd_2 bbd2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(bbd2.getName()), f + 10.0f, f2 + 4.0f, byq3);
        float f5 = f + 10.0f;
        float f6 = f2 + 18.0f;
        float f7 = 18.0f;
        float f8 = f + f3 - 10.0f;
        float f9 = f6;
        for (s_3 s2 : bbd2.zskh_3()) {
            if (s2.dhtn()) continue;
            String string = this.formatSettingName(s2.getName());
            float f10 = bmn.shzth.twy_2(8.0f).dak(string) + 16.0f;
            if (f5 + f10 > f8 && f5 > f + 10.0f) {
                f5 = f + 10.0f;
                f6 += f7 + 4.0f;
            }
            boolean bl2 = s2.alh();
            boolean bl3 = bhh.zzy_3(f5, f6, f10, f7, bzth2);
            if (bl3) {
                zw.hdhth(bay_2.mw);
            }
            byq byq4 = (bl3 ? (bl ? new byq(82.0f, 82.0f, 86.0f, 255.0f) : new byq(210.0f, 210.0f, 215.0f, 255.0f)) : (bl ? new byq(68.0f, 68.0f, 72.0f, 255.0f) : new byq(225.0f, 225.0f, 230.0f, 255.0f))).thzz_4(f4);
            byq byq5 = bl2 ? byq2 : byq4;
            bzth2.drawRoundedRect(f5, f6, f10, f7, zth_8.all(5.0f), byq5);
            if (!bl && !bl2) {
                bzth2.drawRoundedBorder(f5, f6, f10, f7, 0.18f, zth_8.all(5.0f), hja.thzz_4(f4));
            }
            byq byq6 = (bl2 ? dmth : (bl ? dmth : jss_3)).thzz_4(f4);
            bzth2.drawCenteredText(bmn.shzth.twy_2(8.0f), string, f5 + f10 / 2.0f, f6 + (f7 - 8.0f) / 2.0f + 0.5f, byq6);
            f5 += f10 + 5.0f;
            f9 = Math.max(f9, f6);
        }
        return f9 - f2 + f7 + 4.0f;
    }

    private float renderStringRow(bzth bzth2, ts_4 ts2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        long l;
        Object object;
        float f5 = 26.0f;
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(ts2.getName()), f + 10.0f, f2 + (f5 - 8.5f) / 2.0f + 0.5f, byq3);
        boolean bl2 = this.rws_2 == ts2;
        Object object2 = object = ts2.dysh() != null ? ts2.dysh() : "";
        if (bl2 && (l = System.currentTimeMillis() / 400L) % 2L == 0L) {
            object = (String)object + "|";
        }
        float f6 = 110.0f;
        float f7 = 16.0f;
        float f8 = f + f3 - f6 - 10.0f;
        float f9 = f2 + (f5 - f7) / 2.0f;
        byq byq4 = (bl2 ? (bl ? new byq(40.0f, 40.0f, 45.0f, 255.0f) : new byq(245.0f, 245.0f, 250.0f, 255.0f)) : (bl ? new byq(30.0f, 30.0f, 34.0f, 255.0f) : new byq(238.0f, 238.0f, 242.0f, 255.0f))).thzz_4(f4);
        bzth2.drawRoundedRect(f8, f9, f6, f7, zth_8.all(4.0f), byq4);
        if (bl2) {
            bzth2.drawRoundedBorder(f8, f9, f6, f7, 0.18f, zth_8.all(4.0f), byq2);
        } else if (!bl) {
            bzth2.drawRoundedBorder(f8, f9, f6, f7, 0.18f, zth_8.all(4.0f), hja.thzz_4(f4));
        }
        bzth2.drawText(bmn.shzth.twy_2(7.5f), (String)object, f8 + 6.0f, f9 + (f7 - 7.5f) / 2.0f + 0.5f, byq3);
        if (bhh.zzy_3(f8, f9, f6, f7, bzth2)) {
            zw.hdhth(bay_2.shsdh);
        }
        return f5;
    }

    private float renderButtonRow(bzth bzth2, fw_2 fw2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        float f5 = 28.0f;
        float f6 = f + 10.0f;
        float f7 = f2 + 4.0f;
        float f8 = f3 - 20.0f;
        float f9 = 20.0f;
        boolean bl2 = bhh.zzy_3(f6, f7, f8, f9, bzth2);
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        byq byq4 = (bl2 ? byq2.thzz_4(0.85f) : (bl ? new byq(36.0f, 36.0f, 40.0f, 255.0f) : new byq(235.0f, 235.0f, 240.0f, 255.0f))).thzz_4(f4);
        bzth2.drawRoundedRect(f6, f7, f8, f9, zth_8.all(4.0f), byq4);
        if (!bl && !bl2) {
            bzth2.drawRoundedBorder(f6, f7, f8, f9, 0.18f, zth_8.all(4.0f), hja.thzz_4(f4));
        }
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(8.0f), this.formatSettingName(fw2.getName()), f6 + f8 / 2.0f, f7 + 5.5f, bl2 ? dmth.thzz_4(f4) : byq3);
        return f5;
    }

    private float renderBlockListRow(bzth bzth2, byl byl2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        float f5 = 26.0f;
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(byl2.getName()), f + 10.0f, f2 + (f5 - 8.5f) / 2.0f + 0.5f, byq3);
        float f6 = 80.0f;
        float f7 = 16.0f;
        float f8 = f + f3 - f6 - 10.0f;
        float f9 = f2 + (f5 - f7) / 2.0f;
        boolean bl2 = bhh.zzy_3(f8, f9, f6, f7, bzth2);
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        int n = byl2.tzs_8() != null ? byl2.tzs_8().size() : 0;
        String string = n + " blocks";
        byq byq4 = (bl2 ? byq2.thzz_4(0.85f) : (bl ? new byq(32.0f, 32.0f, 36.0f, 255.0f) : new byq(238.0f, 238.0f, 242.0f, 255.0f))).thzz_4(f4);
        bzth2.drawRoundedRect(f8, f9, f6, f7, zth_8.all(4.0f), byq4);
        if (!bl && !bl2) {
            bzth2.drawRoundedBorder(f8, f9, f6, f7, 0.18f, zth_8.all(4.0f), hja.thzz_4(f4));
        }
        bzth2.drawCenteredText(bmn.shzth.twy_2(7.5f), string, f8 + f6 / 2.0f, f9 + 4.0f, bl2 ? dmth.thzz_4(f4) : byq3);
        return f5;
    }

    private float renderColorRow(bzth bzth2, bzw_2 bzw2_2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        byq byq4;
        float f5 = 26.0f;
        boolean bl2 = this.shln == bzw2_2;
        fa_2 fa2_2 = this.thas.computeIfAbsent(bzw2_2, tkhd::lambda$renderColorRow$19);
        fa2_2.khmf(bl2 ? 1.0f : 0.0f);
        float f6 = fa2_2.tssh_2();
        boolean bl3 = bhh.zzy_3(f, f2, f3, f5, bzth2);
        if (bl3) {
            byq4 = (bl ? new byq(32.0f, 32.0f, 36.0f, 160.0f) : new byq(244.0f, 244.0f, 245.0f, 180.0f)).thzz_4(f4);
            bzth2.drawRoundedRect(f, f2, f3, f5, zth_8.all(5.0f), byq4);
            zw.hdhth(bay_2.mw);
        }
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(bzw2_2.getName()), f + 10.0f, f2 + (f5 - 8.5f) / 2.0f + 0.5f, byq3);
        byq4 = bzw2_2.sdsh_4();
        float f7 = 16.0f;
        float f8 = f + f3 - f7 - 10.0f;
        float f9 = f2 + (f5 - f7) / 2.0f;
        String string = String.format("#%02X%02X%02X", (int)byq4.sbk(), (int)byq4.srl(), (int)byq4.shsl_2());
        float f10 = bmn.wl.twy_2(7.5f).dak(string);
        bzth2.drawText(bmn.wl.twy_2(7.5f), string, f8 - f10 - 8.0f, f2 + (f5 - 7.5f) / 2.0f + 0.5f, thyt_2.thzz_4(f4));
        bzth2.drawRoundedRect(f8, f9, f7, f7, zth_8.all(4.0f), byq4.thzz_4(f4));
        byq byq5 = (bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : new byq(200.0f, 200.0f, 205.0f, 255.0f)).thzz_4(f4);
        bzth2.drawRoundedBorder(f8, f9, f7, f7, 0.18f, zth_8.all(4.0f), byq5);
        if (f6 > 0.005f) {
            float f11 = bzw2_2.shf_4() ? 120.0f : 106.0f;
            float f12 = f11 * f6;
            bhm.dar_2(bzth2.method_51448(), f + 10.0f, f2 + f5 + 4.0f, f3 - 20.0f, f12);
            this.renderEmbeddedColorPicker(bzth2, bzw2_2, f + 10.0f, f2 + f5 + 4.0f, f3 - 20.0f, byq2, bl, f4 * f6);
            bhm.sdhsh_2();
            return f5 + 4.0f + f12;
        }
        return f5;
    }

    private float renderEmbeddedColorPicker(bzth bzth2, bzw_2 bzw2_2, float f, float f2, float f3, byq byq2, boolean bl, float f4) {
        float f5;
        float f6 = bzw2_2.shf_4() ? 120.0f : 106.0f;
        byq byq3 = (bl ? new byq(24.0f, 24.0f, 28.0f, 255.0f) : new byq(242.0f, 242.0f, 246.0f, 255.0f)).thzz_4(f4);
        byq byq4 = (bl ? new byq(42.0f, 42.0f, 46.0f, 255.0f) : new byq(225.0f, 225.0f, 230.0f, 255.0f)).thzz_4(f4);
        bzth2.drawRoundedRect(f, f2, f3, f6, zth_8.all(6.0f), byq3);
        bzth2.drawRoundedBorder(f, f2, f3, f6, 0.18f, zth_8.all(6.0f), byq4);
        bzth2.drawRoundedRect(f + 8.0f, f2 + 7.0f, 12.0f, 12.0f, zth_8.all(3.0f), bzw2_2.sdsh_4().thzz_4(f4));
        String string = String.format("#%02X%02X%02X", (int)bzw2_2.sdsh_4().sbk(), (int)bzw2_2.sdsh_4().srl(), (int)bzw2_2.sdsh_4().shsl_2());
        float f7 = bmn.wl.twy_2(7.0f).dak(string) + 8.0f;
        float f8 = f + f3 - 8.0f - f7;
        byq byq5 = (bl ? new byq(32.0f, 32.0f, 36.0f, 255.0f) : dmth).thzz_4(f4);
        bzth2.drawRoundedRect(f8, f2 + 6.0f, f7, 14.0f, zth_8.all(3.0f), byq5);
        byq byq6 = (bl ? dmth : jss_3).thzz_4(f4);
        bzth2.drawText(bmn.wl.twy_2(7.0f), string, f8 + 4.0f, f2 + 8.5f, byq6);
        bzth2.drawText(bmn.sdha_2.twy_2(8.0f), this.formatSettingName(bzw2_2.getName()), f + 24.0f, f2 + 8.0f, byq6);
        float f9 = f + 8.0f;
        float f10 = f2 + 24.0f;
        float f11 = f3 - 16.0f;
        float f12 = 56.0f;
        byq byq7 = byq.slz_2(this.bzh_3[0], 1.0f, 1.0f).thzz_4(f4);
        byq byq8 = bhj_2.rrd.thzz_4(f4);
        byq byq9 = bhj_2.bdhj.thzz_4(f4);
        bdht.dhbz_2(bzth2.method_51448(), f9, f10, f11, f12, zth_8.all(4.0f), byq8, byq9, byq9, byq7);
        float f13 = f9 + f11 * this.bzh_3[1];
        float f14 = f10 + f12 * (1.0f - this.bzh_3[2]);
        bzth2.drawRoundedRect(f13 - 4.5f, f14 - 4.5f, 9.0f, 9.0f, zth_8.all(4.5f), byq2);
        bzth2.drawRoundedRect(f13 - 2.5f, f14 - 2.5f, 5.0f, 5.0f, zth_8.all(2.5f), bhj_2.rrd.thzz_4(f4));
        float f15 = f9;
        float f16 = f10 + f12 + 5.0f;
        float f17 = f11;
        float f18 = 8.0f;
        int n = 48;
        for (int i = 0; i < n; ++i) {
            f5 = (float)i / (float)(n - 1);
            byq byq10 = byq.slz_2(f5, 1.0f, 1.0f).thzz_4(f4);
            bzth2.drawRect(f15 + (float)i * (f17 / (float)n), f16, f17 / (float)n + 0.45f, f18, byq10);
        }
        float f19 = class_3532.method_15363((float)(f15 + f17 * this.bzh_3[0]), (float)(f15 + 2.0f), (float)(f15 + f17 - 2.0f));
        bzth2.drawRoundedRect(f19 - 3.0f, f16 - 1.5f, 6.0f, f18 + 3.0f, zth_8.all(3.0f), bhj_2.rrd.thzz_4(f4));
        if (bzw2_2.shf_4()) {
            f5 = f16 + f18 + 4.0f;
            float f20 = 8.0f;
            byq byq11 = new byq(bzw2_2.sdsh_4().sbk(), bzw2_2.sdsh_4().srl(), bzw2_2.sdsh_4().shsl_2(), 255.0f).thzz_4(f4);
            bzth2.drawRoundedRect(f15, f5, f17, f20, zth_8.all(3.0f), byq11);
            float f21 = bzw2_2.sdsh_4().tzdh_2() / 255.0f;
            float f22 = class_3532.method_15363((float)(f15 + f17 * f21), (float)(f15 + 2.0f), (float)(f15 + f17 - 2.0f));
            bzth2.drawRoundedRect(f22 - 3.0f, f5 - 1.5f, 6.0f, f20 + 3.0f, zth_8.all(3.0f), bhj_2.rrd.thzz_4(f4));
        }
        return f6;
    }

    private float renderBindRow(bzth bzth2, bdh_3 bdh2_2, float f, float f2, float f3, float f4, boolean bl, byq byq2, byq byq3) {
        boolean bl2;
        float f5 = 26.0f;
        boolean bl3 = bhh.zzy_3(f, f2, f3, f5, bzth2);
        if (bl3) {
            byq byq4 = (bl ? new byq(32.0f, 32.0f, 36.0f, 160.0f) : new byq(244.0f, 244.0f, 245.0f, 180.0f)).thzz_4(f4);
            bzth2.drawRoundedRect(f, f2, f3, f5, zth_8.all(5.0f), byq4);
            zw.hdhth(bay_2.mw);
        }
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(bdh2_2.getName()), f + 10.0f, f2 + (f5 - 8.5f) / 2.0f + 0.5f, byq3);
        boolean bl4 = bl2 = this.dhdb == bdh2_2;
        String string = bl2 ? "..." : (bdh2_2.sdhkh() <= 0 ? "NONE" : bzdh_2.ddhn_2(bdh2_2.sdhkh()));
        float f6 = Math.max(34.0f, bmn.wl.twy_2(7.5f).dak(string) + 14.0f);
        float f7 = f + f3 - f6 - 10.0f;
        float f8 = f2 + (f5 - 14.0f) / 2.0f;
        byq byq5 = (bl2 ? byq2 : (bl ? new byq(36.0f, 36.0f, 40.0f, 255.0f) : dhrsh)).thzz_4(f4);
        bzth2.drawRoundedRect(f7, f8, f6, 14.0f, zth_8.all(4.0f), byq5);
        bzth2.drawCenteredText(bmn.wl.twy_2(7.5f), string, f7 + f6 / 2.0f, f8 + 3.5f, dmth.thzz_4(f4));
        return f5;
    }

    private float renderGenericRow(bzth bzth2, bdhw bdhw2, float f, float f2, float f3, float f4, boolean bl, byq byq2) {
        float f5 = 24.0f;
        boolean bl2 = bhh.zzy_3(f, f2, f3, f5, bzth2);
        if (bl2) {
            byq byq3 = (bl ? new byq(32.0f, 32.0f, 36.0f, 160.0f) : new byq(244.0f, 244.0f, 245.0f, 180.0f)).thzz_4(f4);
            bzth2.drawRoundedRect(f, f2, f3, f5, zth_8.all(4.0f), byq3);
        }
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.formatSettingName(bdhw2.getName()), f + 10.0f, f2 + 6.0f, byq2);
        return f5;
    }

    private float getSidebarTextAlpha(float f) {
        return Math.max(0.0f, Math.min(1.0f, (f - 35.0f) / 115.0f));
    }

    private float getProfileTextAlpha(float f) {
        return Math.max(0.0f, Math.min(1.0f, (f - 70.0f) / 80.0f));
    }

    private float getSidebarLogoSeparatorY(float f) {
        return f + 5.0f + 48.0f + 5.0f;
    }

    private float getProfileNameX(float f) {
        return f + 28.0f;
    }

    private float getProfileBrushX(float f, float f2) {
        return f + Math.min(f2, 150.0f) - 18.0f;
    }

    private float getProfileTextWidth(float f, float f2) {
        return Math.max(0.0f, this.getProfileBrushX(f, f2) - this.getProfileNameX(f) - 6.0f);
    }

    private void renderProfileAvatar(bzth bzth2, float f, float f2, float f3, float f4) {
        class_2960 class_29602 = this.rml != null ? this.rml : tk.dhfy();
        bzth2.drawRoundedTexture(class_29602, f, f2, f3, f3, zth_8.all(f3 / 2.0f), byq.brz_2.thzz_4(f4));
    }

    private void renderProfileStatus(bzth bzth2, float f, float f2, float f3, float f4) {
        this.dhzb.khmf(1.0f);
        float f5 = this.dhzb.tssh_2();
        float f6 = f3 * (0.72f + 0.28f * f5);
        float f7 = f + f3 / 2.0f - f6 / 2.0f;
        float f8 = f2 + f3 / 2.0f - f6 / 2.0f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(24.0f, 24.0f, 27.0f, 255.0f) : dmth;
        bzth2.drawRoundedRect(f - 1.0f, f2 - 1.0f, f3 + 2.0f, f3 + 2.0f, zth_8.all((f3 + 2.0f) / 2.0f), byq2.thzz_4(f4));
        if (this.jzb == thz_2.tdr) {
            bzth2.drawRoundedRect(f7, f8, f6, f6, zth_8.all(f6 / 2.0f), shmr.thzz_4(f4));
        } else if (this.jzb == thz_2.hht_3) {
            bzth2.drawRoundedTexture(qdh, f7, f8, f6, f6, zth_8.all(f6 / 2.0f), byq.brz_2.thzz_4(f4));
        } else {
            bzth2.drawRoundedTexture(shtth_2, f7, f8, f6, f6, zth_8.all(f6 / 2.0f), byq.brz_2.thzz_4(f4));
        }
    }

    private void cycleProfileStatus() {
        this.jzb = this.jzb == thz_2.tdr ? thz_2.hht_3 : (this.jzb == thz_2.hht_3 ? thz_2.zlt_2 : thz_2.tdr);
        this.dhzb.atth_2(0.0f);
        this.saveProfileState();
    }

    private void renderProfileSettings(bzth bzth2, float f, float f2) {
        this.ddd_2.dam_2(!this.khzdh ? jkh.hd_2 : jkh.hthd);
        this.ddd_2.zkhdh((long)bnn.dzb_2().art());
        this.ddd_2.khmf(this.khzdh ? 0.0f : 1.0f);
        float f3 = this.ddd_2.tssh_2();
        float f4 = class_3532.method_15363((float)f3, (float)0.0f, (float)1.0f);
        if (f4 <= 0.01f && this.khzdh) {
            this.rha_3 = false;
            this.khzdh = false;
            this.blurProfileFields();
            this.saveProfileState();
            return;
        }
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bnn.dzb_2().dhdhk(f);
        byq byq3 = bl ? new byq(13.0f, 13.0f, 14.5f, 255.0f) : dmth;
        byq byq4 = bl ? dmth : jss_3;
        byq byq5 = bl ? new byq(22.0f, 22.0f, 25.0f, 255.0f) : new byq(240.0f, 240.0f, 243.0f, 255.0f);
        float f5 = 145.0f;
        float f6 = 44.0f;
        float f7 = f + 38.0f;
        float f8 = f2 + 390.0f - 52.0f;
        float f9 = 0.5f + Math.max(0.0f, f3) * 0.5f;
        bzth2.pushMatrix();
        shk_3.bdhkh(bzth2.method_51448(), f7 + f5 / 2.0f, f8 + f6 / 2.0f, f9);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f4);
        bzth2.drawShadow(f7, f8 + 2.0f, f5, f6, 8.0f, zth_8.all(5.0f), bhj_2.bdhj.thzz_4(0.25f * f4));
        bzth2.drawRoundedRect(f7, f8, f5, f6, zth_8.all(5.0f), byq3.thzz_4(f4));
        bzth2.drawText(bmn.sdha_2.twy_2(7.2f), "Avatar Path", f7 + 8.5f, f8 + 7.5f, byq4.thzz_4(f4));
        float f10 = 5.5f;
        float f11 = f7 + f5 - 9.5f;
        float f12 = f8 + 4.5f;
        boolean bl2 = bhh.zzy_3((double)f11 - 1.5, (double)f12 - 1.5, (double)f10 + 3.0, (double)f10 + 3.0, bzth2);
        byq byq6 = bl2 ? new byq(248.0f, 113.0f, 113.0f, 255.0f) : new byq(239.0f, 68.0f, 68.0f, 255.0f);
        bzth2.drawRoundedRect(f11, f12, f10, f10, zth_8.all(f10 / 2.0f), byq6.thzz_4(f4));
        bzth2.drawCenteredText(bmn.shmz.twy_2(4.5f), "×", f11 + f10 / 2.0f, f12 + 0.3f, dmth.thzz_4(f4));
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        float f13 = f5 - 17.0f;
        float f14 = 15.0f;
        float f15 = f8 + 19.5f;
        bzth2.drawRoundedRect(f7 + 8.5f, f15, f13, f14, zth_8.all(3.0f), byq5.thzz_4(f4));
        if (this.dhndh.zqr_2()) {
            bzth2.drawRoundedBorder(f7 + 8.5f, f15, f13, f14, 0.18f, zth_8.all(3.0f), byq2.thzz_4(f4));
        }
        this.dhndh.amf(f7 + 8.5f, f15, f13, f14);
        this.dhndh.bsz(byq4);
        this.dhndh.dhtz(bzth2);
        bzth2.popMatrix();
    }

    private void renderAccentButton(bzth bzth2, float f, float f2, float f3, float f4, String string, float f5, float f6) {
        float f7 = 1.0f * f5;
        float f8 = 1.0f + 0.025f * f5;
        byq byq2 = bnn.dzb_2().dhdhk(f);
        byq byq3 = bnn.dzb_2().ghdt() ? new byq(32.0f, 32.0f, 36.0f, 255.0f) : jss_3;
        byq byq4 = byq3.dkhw_2(byq2, f5 * 0.75f + (f5 > 0.01f ? 0.2f : 0.0f));
        bzth2.pushMatrix();
        shk_3.bdhkh(bzth2.method_51448(), f + f3 / 2.0f, f2 + f4 / 2.0f, f8);
        bzth2.drawShadow(f, f2 - f7, f3, f4, 8.0f + 4.0f * f5, zth_8.all(4.0f), bhj_2.bdhj.thzz_4((0.1f + 0.1f * f5) * f6));
        bzth2.drawRoundedRect(f, f2 - f7, f3, f4, zth_8.all(4.0f), byq4.thzz_4(f6));
        if (!string.isEmpty()) {
            bzth2.drawCenteredText(bmn.sdha_2.twy_2(7.0f), string, f + f3 / 2.0f, f2 + f4 / 2.0f - 2.5f - f7, dmth.thzz_4(f6));
        }
        bzth2.popMatrix();
    }

    private void renderBlackButton(bzth bzth2, float f, float f2, float f3, float f4, String string, float f5, float f6) {
        this.renderAccentButton(bzth2, f, f2, f3, f4, string, f5, f6);
    }

    private void renderAvatarEditor(bzth bzth2) {
        this.jtn_2.khmf(this.dhdsh ? 0.0f : 1.0f);
        float f = this.jtn_2.tssh_2();
        if (f <= 0.01f && this.dhdsh) {
            this.rf = false;
            this.dhdsh = false;
            this.saveProfileState();
            return;
        }
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(24.0f, 24.0f, 27.0f, 255.0f) : dmth;
        byq byq3 = bl ? new byq(39.0f, 39.0f, 42.0f, 255.0f) : hja;
        byq byq4 = bl ? dmth : jss_3;
        byq byq5 = bl ? new byq(39.0f, 39.0f, 42.0f, 255.0f) : jqsh;
        byq byq6 = bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : hja;
        float f2 = 260.0f;
        float f3 = 220.0f;
        float f4 = tdw.shjh() / 2.0f - f2 / 2.0f;
        float f5 = tdw.thfq() / 2.0f - f3 / 2.0f;
        bzth2.pushMatrix();
        shk_3.bdhkh(bzth2.method_51448(), f4 + f2 / 2.0f, f5 + f3 / 2.0f, 0.9f + 0.1f * f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
        bzth2.drawShadow(f4, f5 + 8.0f * (1.0f - f), f2, f3, 26.0f, zth_8.all(8.0f), bhj_2.bdhj.thzz_4(0.26f * f));
        bzth2.drawRoundedRect(f4, f5, f2, f3, zth_8.all(8.0f), byq3.thzz_4(f));
        bzth2.drawRoundedRect(f4 + 1.0f, f5 + 1.0f, f2 - 2.0f, f3 - 2.0f, zth_8.all(7.0f), byq2.thzz_4(f));
        bzth2.drawText(bmn.sdha_2.twy_2(9.0f), "Edit profile picture", f4 + 14.0f, f5 + 12.0f, byq4.thzz_4(f));
        float f6 = f4 + f2 / 2.0f - 48.0f;
        float f7 = f5 + 42.0f;
        bzth2.drawRoundedRect(f6 - 4.0f, f7 - 4.0f, 104.0f, 104.0f, zth_8.all(52.0f), (bl ? new byq(39.0f, 39.0f, 42.0f, 255.0f) : jqsh).thzz_4(f));
        if (this.rml != null) {
            bzth2.drawRoundedTexture(this.rml, f6, f7, 96.0f, 96.0f, zth_8.all(48.0f), dmth.thzz_4(f));
        }
        bzth2.drawCenteredText(bmn.shzth.twy_2(6.5f), "Drag image. Scroll to resize.", f4 + f2 / 2.0f, f5 + 150.0f, thyt_2.thzz_4(f));
        boolean bl2 = bhh.zzy_3(f4 + 42.0f, f5 + 178.0f, 52.0, 20.0, bzth2);
        boolean bl3 = bhh.zzy_3(f4 + f2 - 94.0f, f5 + 178.0f, 52.0, 20.0, bzth2);
        float f8 = this.shat_3.khmf(bl2 ? 1.0f : 0.0f);
        float f9 = this.rtd_4.khmf(bl3 ? 1.0f : 0.0f);
        bzth2.drawRoundedRect(f4 + 42.0f, f5 + 178.0f - f8, 52.0f, 20.0f, zth_8.all(4.0f), byq5.dkhw_2(byq6, f8).thzz_4(f));
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(7.0f), "Reset", f4 + 68.0f, f5 + 184.0f - f8, byq4.thzz_4(f));
        this.renderAccentButton(bzth2, f4 + f2 - 94.0f, f5 + 178.0f, 52.0f, 20.0f, "Done", f9, f);
        if (bl2 || bl3 || bhh.zzy_3(f6, f7, 96.0, 96.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bzth2.popMatrix();
    }

    private boolean loadConfigThumbnailFromPath(String string) {
        if ((string = string.trim().replace("\"", "")).isEmpty()) {
            return false;
        }
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(string));
            if (bufferedImage == null) {
                return false;
            }
            this.sja_3 = bufferedImage;
            this.thhd_2 = Moondlc.id("cfg_thumb_src_" + System.currentTimeMillis());
            mc.method_1531().method_4616(this.thhd_2, (class_1044)new class_1043(brd_2.shghdh(bufferedImage, true)));
            this.sdhn = 1.0f;
            this.zst_3 = 0.0f;
            this.sdhh_2 = 0.0f;
            this.updateCroppedConfigThumbnail();
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private void updateCroppedConfigThumbnail() {
        if (this.sja_3 == null) {
            return;
        }
        BufferedImage bufferedImage = new BufferedImage(128, 128, 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        float f = Math.max(128.0f / (float)this.sja_3.getWidth(), 128.0f / (float)this.sja_3.getHeight());
        float f2 = f * this.sdhn;
        int n = Math.round((float)this.sja_3.getWidth() * f2);
        int n2 = Math.round((float)this.sja_3.getHeight() * f2);
        int n3 = Math.round((float)(128 - n) / 2.0f + this.zst_3);
        int n4 = Math.round((float)(128 - n2) / 2.0f + this.sdhh_2);
        graphics2D.drawImage(this.sja_3, n3, n4, n, n2, null);
        graphics2D.dispose();
        this.bzy = bufferedImage;
        this.bhz_4 = Moondlc.id("cfg_thumb_crop_" + System.currentTimeMillis());
        mc.method_1531().method_4616(this.bhz_4, (class_1044)new class_1043(brd_2.shghdh(this.bzy, true)));
    }

    private void saveConfigThumbnailToSelected() {
        File file;
        File file2;
        if (this.sjq_2 == null || this.bzy == null) {
            return;
        }
        String string = this.hrj.dwq().trim().replace("\"", "");
        if (string.isEmpty()) {
            file2 = this.sjq_2.skh_3().getParentFile();
            file = new File(file2, this.sjq_2.thkgh() + "_thumb.png");
            string = file.getAbsolutePath();
        }
        try {
            file2 = new File(string);
            file = file2.getParentFile();
            if (file != null && !file.exists()) {
                file.mkdirs();
            }
            ImageIO.write((RenderedImage)this.bzy, "png", file2);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        bjk.bat_3();
        this.sjq_2.twh(this.sjq_2.rhy(), this.sjq_2.ats_2(), string);
        this.setFieldText(this.hrj, string);
        Moondlc.getInstance().getConfigManager().dhtw_2();
    }

    private void renderConfigThumbnailEditor(bzth bzth2) {
        this.bmth.khmf(this.dhkgh ? 0.0f : 1.0f);
        float f = this.bmth.tssh_2();
        if (f <= 0.01f && this.dhkgh) {
            this.thzb = false;
            this.dhkgh = false;
            this.khas_4 = false;
            return;
        }
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(24.0f, 24.0f, 27.0f, 255.0f) : dmth;
        byq byq3 = bl ? new byq(39.0f, 39.0f, 42.0f, 255.0f) : hja;
        byq byq4 = bl ? dmth : jss_3;
        byq byq5 = bl ? new byq(39.0f, 39.0f, 42.0f, 255.0f) : jqsh;
        byq byq6 = bl ? new byq(55.0f, 55.0f, 60.0f, 255.0f) : hja;
        byq byq7 = bnn.dzb_2().dhdhk(tdw.shjh() / 2.0f);
        float f2 = 260.0f;
        float f3 = 220.0f;
        float f4 = tdw.shjh() / 2.0f - f2 / 2.0f;
        float f5 = tdw.thfq() / 2.0f - f3 / 2.0f;
        bzth2.pushMatrix();
        shk_3.bdhkh(bzth2.method_51448(), f4 + f2 / 2.0f, f5 + f3 / 2.0f, 0.9f + 0.1f * f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
        bzth2.drawShadow(f4, f5 + 8.0f * (1.0f - f), f2, f3, 26.0f, zth_8.all(8.0f), bhj_2.bdhj.thzz_4(0.26f * f));
        bzth2.drawRoundedRect(f4, f5, f2, f3, zth_8.all(8.0f), byq3.thzz_4(f));
        bzth2.drawRoundedRect(f4 + 1.0f, f5 + 1.0f, f2 - 2.0f, f3 - 2.0f, zth_8.all(7.0f), byq2.thzz_4(f));
        bzth2.drawText(bmn.sdha_2.twy_2(9.0f), "Edit config image", f4 + 14.0f, f5 + 12.0f, byq4.thzz_4(f));
        bzth2.drawRoundedRect(f4 + 14.0f, f5 + 24.0f, 24.0f, 2.0f, zth_8.all(1.0f), byq7.thzz_4(f));
        float f6 = f4 + f2 / 2.0f - 48.0f;
        float f7 = f5 + 38.0f;
        bzth2.drawRoundedRect(f6 - 4.0f, f7 - 4.0f, 104.0f, 104.0f, zth_8.all(10.0f), (bl ? new byq(39.0f, 39.0f, 42.0f, 255.0f) : jqsh).thzz_4(f));
        if (this.bhz_4 != null) {
            bzth2.drawRoundedTexture(this.bhz_4, f6, f7, 96.0f, 96.0f, zth_8.all(8.0f), dmth.thzz_4(f));
        }
        bzth2.drawCenteredText(bmn.shzth.twy_2(6.5f), "Drag image. Scroll to resize.", f4 + f2 / 2.0f, f5 + 150.0f, thyt_2.thzz_4(f));
        boolean bl2 = bhh.zzy_3(f4 + 42.0f, f5 + 178.0f, 52.0, 20.0, bzth2);
        boolean bl3 = bhh.zzy_3(f4 + f2 - 94.0f, f5 + 178.0f, 52.0, 20.0, bzth2);
        float f8 = this.hqr.khmf(bl2 ? 1.0f : 0.0f);
        float f9 = this.dhtt_4.khmf(bl3 ? 1.0f : 0.0f);
        bzth2.drawRoundedRect(f4 + 42.0f, f5 + 178.0f - f8, 52.0f, 20.0f, zth_8.all(4.0f), byq5.dkhw_2(byq6, f8).thzz_4(f));
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(7.0f), "Reset", f4 + 68.0f, f5 + 178.0f + 10.0f - 2.5f - f8, byq4.thzz_4(f));
        this.renderAccentButton(bzth2, f4 + f2 - 94.0f, f5 + 178.0f, 52.0f, 20.0f, "Done", f9, f);
        if (bl2 || bl3 || bhh.zzy_3(f6, f7, 96.0, 96.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bzth2.popMatrix();
    }

    private boolean loadAvatarFromPath() {
        return this.loadAvatarFromPath(true);
    }

    private boolean loadAvatarFromPath(boolean bl) {
        String string = this.dhndh.dwq().trim().replace("\"", "");
        if (string.isEmpty()) {
            this.shzd_3 = "No path";
            return false;
        }
        try {
            BufferedImage bufferedImage = string.startsWith("http://") || string.startsWith("https://") ? ImageIO.read(new URI(string).toURL()) : ImageIO.read(new File(string));
            if (bufferedImage == null) {
                this.shzd_3 = "Not an image";
                return false;
            }
            this.dhby = bufferedImage;
            this.rdw = Moondlc.id("local_profile_source_" + System.currentTimeMillis());
            mc.method_1531().method_4616(this.rdw, (class_1044)new class_1043(brd_2.shghdh(bufferedImage, true)));
            if (bl) {
                this.tfb = 1.0f;
                this.thfth = 0.0f;
                this.jshz = 0.0f;
            }
            this.updateCroppedAvatar();
            this.shzd_3 = "Loaded";
            this.saveProfileState();
            return true;
        }
        catch (Exception exception) {
            this.shzd_3 = "Load failed";
            return false;
        }
    }

    private void registerCroppedAvatarTexture() {
        if (this.stt_2 == null) {
            return;
        }
        this.rml = Moondlc.id("local_profile_avatar_" + System.currentTimeMillis());
        mc.method_1531().method_4616(this.rml, (class_1044)new class_1043(brd_2.shghdh(this.stt_2, true)));
        tk.zlf_2(this.rml);
    }

    private void updateCroppedAvatar() {
        if (this.dhby == null) {
            return;
        }
        BufferedImage bufferedImage = new BufferedImage(128, 128, 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        float f = Math.max(128.0f / (float)this.dhby.getWidth(), 128.0f / (float)this.dhby.getHeight());
        float f2 = f * this.tfb;
        int n = Math.round((float)this.dhby.getWidth() * f2);
        int n2 = Math.round((float)this.dhby.getHeight() * f2);
        int n3 = Math.round((float)(128 - n) / 2.0f + this.thfth);
        int n4 = Math.round((float)(128 - n2) / 2.0f + this.jshz);
        graphics2D.drawImage(this.dhby, n3, n4, n, n2, null);
        graphics2D.dispose();
        this.stt_2 = bufferedImage;
        this.registerCroppedAvatarTexture();
    }

    private void renderSectionView(bzth bzth2, float f, float f2, float f3, float f4, float f5, float f6, jy jy2) {
        float f7;
        float f8;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = (bl ? dmth : jss_3).thzz_4(f6);
        float f9 = f4 - 1.0f;
        String string = this.hha_2 == bjj.rdy ? "Configs" : (this.hha_2 == bjj.bts_3 ? "Themes" : (this.hha_2 == bjj.bsd ? "Cosmetics" : "Friends"));
        bzth2.drawText(bmn.shmz.twy_2(13.0f), string, f3, f9 + 3.0f, byq2);
        float f10 = bmn.shmz.twy_2(13.0f).dma().dzh_3(string, 13.0f);
        if (this.hha_2 == bjj.rdy) {
            f8 = f3 + f10 + 10.0f;
            f7 = f9;
            float f11 = 110.0f;
            float f12 = 16.0f;
            byq byq3 = bl ? new byq(16.0f, 16.0f, 17.0f, 255.0f) : dmth;
            bzth2.drawRoundedRect(f8, f7, f11, f12, zth_8.all(4.0f), byq3.thzz_4(f6));
            if (!bl) {
                bzth2.drawRoundedBorder(f8, f7, f11, f12, 0.18f, zth_8.all(4.0f), hja.thzz_4(f6));
            }
            if (bhh.zzy_3(f8, f7, f11, f12, bzth2)) {
                zw.hdhth(bay_2.shsdh);
            }
            bzth2.drawTexture(Moondlc.id("textures/iconpack/search.png"), f8 + 5.0f, f7 + 3.5f, 9.0f, 9.0f, thyt_2.thzz_4(f6));
            this.shhd_4.dzh_8(f6);
            this.shhd_4.amf(f8 + 11.5f, f7, f11 - 13.0f, f12);
            this.shhd_4.bsz(bl ? dmth : jss_3);
            float f13 = f8 + f11 + 6.0f;
            float f14 = f9;
            float f15 = 16.0f;
            boolean bl2 = bhh.zzy_3(f13, f14, f15, f15, bzth2);
            if (bl2) {
                zw.hdhth(bay_2.mw);
            }
            byq byq4 = bl ? (bl2 ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : new byq(18.0f, 18.0f, 20.0f, 255.0f)) : (bl2 ? jqsh : dmth);
            bzth2.drawRoundedRect(f13, f14, f15, f15, zth_8.all(4.0f), byq4.thzz_4(f6));
            float f16 = bmn.dhsth_2.twy_2(8.0f).dak("");
            byq byq5 = bl2 ? (bl ? dmth : jss_3) : thyt_2;
            bzth2.drawText(bmn.dhsth_2.twy_2(8.0f), "", f13 + (f15 - f16) / 2.0f, f14 + 5.5f, byq5.thzz_4(f6));
            float f17 = f13 + f15 + 6.0f;
            float f18 = f9;
            float f19 = 16.0f;
            boolean bl3 = bhh.zzy_3(f17, f18, f19, f19, bzth2);
            if (bl3) {
                zw.hdhth(bay_2.mw);
            }
            byq byq6 = bl ? (bl3 ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : new byq(18.0f, 18.0f, 20.0f, 255.0f)) : (bl2 ? jqsh : dmth);
            bzth2.drawRoundedRect(f17, f18, f19, f19, zth_8.all(4.0f), byq6.thzz_4(f6));
            float f20 = bmn.dhsth_2.twy_2(8.0f).dak("");
            byq byq7 = bl3 ? (bl ? dmth : jss_3) : thyt_2;
            bzth2.drawText(bmn.dhsth_2.twy_2(8.0f), "", f17 + (f19 - f20) / 2.0f, f18 + 5.5f, byq7.thzz_4(f6));
        } else if (this.hha_2 == bjj.khshh_2) {
            f8 = f3 + f10 + 8.0f;
            f7 = f9;
            float f21 = 16.0f;
            boolean bl4 = bhh.zzy_3(f8, f7, f21, f21, bzth2);
            if (bl4) {
                zw.hdhth(bay_2.mw);
            }
            byq byq8 = bl ? (bl4 ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : new byq(18.0f, 18.0f, 20.0f, 255.0f)) : (bl4 ? jqsh : dmth);
            bzth2.drawRoundedRect(f8, f7, f21, f21, zth_8.all(4.0f), byq8.thzz_4(f6));
            float f22 = bmn.dhsth_2.twy_2(8.0f).dak("");
            byq byq9 = bl4 ? (bl ? dmth : jss_3) : thyt_2;
            bzth2.drawText(bmn.dhsth_2.twy_2(8.0f), "", f8 + (f21 - f22) / 2.0f, f7 + 5.5f, byq9.thzz_4(f6));
        }
        f8 = f4 + 20.0f;
        f7 = 390.0f - (f8 - f2) - 10.0f;
        jy2.render(bzth2, f3, f8, f5, f7, f6);
    }

    private void focusOnly(baa_2 baa2_2) {
        this.shhd_4.dby(this.shhd_4 == baa2_2);
        this.dhas.dby(this.dhas == baa2_2);
        this.jkhth.dby(this.jkhth == baa2_2);
        this.shkhh.dby(this.shkhh == baa2_2);
        this.khkm.dby(this.khkm == baa2_2);
        this.syd_2.dby(this.syd_2 == baa2_2);
        this.hsa_3.dby(this.hsa_3 == baa2_2);
        this.sa_2.dby(this.sa_2 == baa2_2);
        this.hrj.dby(this.hrj == baa2_2);
        this.zrk.dby(this.zrk == baa2_2);
        this.bghdh.dby(this.bghdh == baa2_2);
        this.btz_2.dby(this.btz_2 == baa2_2);
        this.dhndh.dby(this.dhndh == baa2_2);
        if (baa2_2 != null) {
            baa2_2.dby(true);
        }
    }

    private void blurConfigFields() {
        this.focusOnly(null);
    }

    private class_2960 getConfigServerIcon(bjk bjk2) {
        String string = bjk2.thkgh();
        if (this.taz_3.containsKey(string)) {
            return (class_2960)this.taz_3.get(string);
        }
        hj_2 hj2_2 = Moondlc.getInstance().getConfigManager().dhjs(string);
        if (hj2_2.singleplayer() || hj2_2.serverIconBase64() == null || hj2_2.serverIconBase64().isBlank()) {
            this.taz_3.put(string, rl);
            return rl;
        }
        try {
            byte[] byArray = Base64.getDecoder().decode(hj2_2.serverIconBase64());
            BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(byArray));
            if (bufferedImage != null) {
                class_2960 class_29602 = Moondlc.id("config_server_icon_" + Math.abs(string.hashCode()));
                mc.method_1531().method_4616(class_29602, (class_1044)new class_1043(brd_2.shghdh(bufferedImage, true)));
                this.taz_3.put(string, class_29602);
                return class_29602;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.taz_3.put(string, rl);
        return rl;
    }

    private void renderConfigsContent(bzth bzth2, float f, float f2, float f3, float f4, float f5) {
        List list = Moondlc.getInstance().getConfigManager().dbh_2();
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(11.5f, 11.5f, 13.0f, 255.0f) : dmth;
        byq byq3 = bl ? dmth : jss_3;
        String string = this.shhd_4.dwq().trim().toLowerCase();
        List list2 = list;
        if (!string.isEmpty()) {
            list2 = list.stream().filter(arg_0 -> tkhd.lambda$renderConfigsContent$20(string, arg_0)).collect(Collectors.toList());
        }
        if (list2.isEmpty()) {
            this.renderEmpty(bzth2, f, f2, f3, f4, thdgh_2, "Nothing to find here.", "Please save a configuration first.", f5);
            return;
        }
        bhm.dar_2(bzth2.method_51448(), f - 2.0f, f2 - 4.0f, f3 + 4.0f, f4 + 8.0f);
        float f6 = 8.0f;
        float f7 = (f3 - f6 * 2.0f) / 3.0f;
        float f8 = 0.0f;
        float f9 = 48.0f;
        float f10 = (float)(-this.bqa.shtt_4());
        String string2 = Moondlc.getInstance().getConfigManager().dhth_3();
        for (bjk bjk2 : list2) {
            float f11;
            float f12 = f + f8 * (f7 + f6);
            float f13 = f2 + f10;
            if (f13 + f9 > f2 && f13 < f2 + f4) {
                float f14;
                float f15;
                float f16;
                float f17;
                String string3;
                boolean bl2 = bhh.zzy_3(f12, f13, f7, f9, bzth2);
                fa_2 fa2_2 = this.getThemeAnim("cfg_card_" + bjk2.thkgh());
                fa2_2.ddt_6(bl2);
                float f18 = fa2_2.tssh_2();
                if (bl2) {
                    zw.hdhth(bay_2.mw);
                }
                byq byq4 = bnn.dzb_2().dhdhk(f12);
                boolean bl3 = bjk2.thkgh().equalsIgnoreCase(string2);
                float f19 = f13 - f18 * 1.5f;
                if (f18 > 0.01f) {
                    bzth2.drawShadow(f12, f19 + 2.0f, f7, f9, 12.0f, zth_8.all(6.0f), bhj_2.bdhj.thzz_4(0.18f * f18 * f5));
                }
                bzth2.drawRoundedRect(f12, f19, f7, f9, zth_8.all(6.0f), byq2.thzz_4(f5));
                if (bl3) {
                    bzth2.drawRoundedBorder(f12, f19, f7, f9, 0.08f, zth_8.all(6.0f), byq4.thzz_4(f5));
                }
                class_2960 class_29602 = this.getConfigServerIcon(bjk2);
                float f20 = 34.0f;
                float f21 = f12 + 7.0f;
                float f22 = f19 + (f9 - f20) / 2.0f;
                bzth2.drawSquircleTexture(class_29602, f21, f22, f20, f20, 1.4f, zth_8.all(6.0f), byq.brz_2.thzz_4(f5));
                float f23 = f12 + 48.0f;
                float f24 = f19 + 6.5f;
                bzth2.drawText(bmn.sdha_2.twy_2(7.5f), bjk2.thkgh(), f23, f24, byq3.thzz_4(f5));
                float f25 = f19 + 18.5f;
                float f26 = bmn.dhsth_2.twy_2(6.5f).dak("");
                bzth2.drawText(bmn.dhsth_2.twy_2(6.5f), "", f23, f25 + 1.2f, (bl ? new byq(150.0f, 150.0f, 160.0f, 255.0f) : thyt_2).thzz_4(f5));
                float f27 = f23 + f26 + 4.0f;
                List<String> list3 = bjk2.ats_2();
                if (list3 == null || list3.isEmpty()) {
                    list3 = List.of("HvH", "Visuals");
                }
                byq byq5 = bl ? new byq(170.0f, 170.0f, 180.0f, 255.0f) : jss_3.thzz_4(0.8f);
                float f28 = f12 + f7 - 6.0f;
                for (int i = 0; i < Math.min(list3.size(), 3); ++i) {
                    string3 = list3.get(i);
                    f17 = bmn.shzth.twy_2(5.5f).dak(string3);
                    if (f27 + f17 > f28) break;
                    bzth2.drawText(bmn.shzth.twy_2(5.5f), string3, f27, f25, byq5.thzz_4(f5));
                    f27 += f17 + 6.0f;
                }
                float f29 = f19 + 31.0f;
                string3 = bl3 ? "Update" : "Load";
                f17 = bmn.dhsth_2.twy_2(6.0f).dak("");
                float f30 = f17 + (f16 = bmn.sdha_2.twy_2(5.5f).dak(string3)) + 10.0f;
                float f31 = f12 + f7 - f30 - 6.0f;
                boolean bl4 = bhh.zzy_3(f31, f15 = f29 - 1.0f, f30, f14 = 12.0f, bzth2);
                if (bl4) {
                    zw.hdhth(bay_2.mw);
                }
                byq byq6 = byq4.thzz_4(bl4 ? 1.0f : 0.85f);
                bzth2.drawRoundedRect(f31, f15, f30, f14, zth_8.all(3.0f), byq6.thzz_4(f5));
                float f32 = f17 + 2.5f + f16;
                float f33 = f31 + (f30 - f32) / 2.0f;
                bzth2.drawText(bmn.dhsth_2.twy_2(6.0f), "", f33, f15 + 4.2f, dmth.thzz_4(f5));
                bzth2.drawText(bmn.sdha_2.twy_2(5.5f), string3, f33 + f17 + 2.5f, f15 + 3.0f, dmth.thzz_4(f5));
                float f34 = bmn.dhsth_2.twy_2(6.5f).dak("");
                float f35 = f31 - f34 - 6.0f;
                float f36 = f15 + 4.0f;
                boolean bl5 = bhh.zzy_3(f35 - 2.0f, f36 - 2.0f, f34 + 4.0f, 13.0, bzth2);
                if (bl5) {
                    zw.hdhth(bay_2.mw);
                }
                byq byq7 = bl5 ? new byq(255.0f, 60.0f, 60.0f, 255.0f) : ztf_2;
                bzth2.drawText(bmn.dhsth_2.twy_2(6.5f), "", f35, f36, byq7.thzz_4(f5));
                float f37 = bmn.dhsth_2.twy_2(6.0f).dak("");
                bzth2.drawText(bmn.dhsth_2.twy_2(6.0f), "", f23, f29 + 2.5f, (bl ? new byq(150.0f, 150.0f, 160.0f, 255.0f) : thyt_2).thzz_4(f5));
                float f38 = f23 + f37 + 3.5f;
                String string4 = bjk2.drs_3();
                bzth2.drawText(bmn.shzth.twy_2(5.5f), string4, f38, f29 + 1.8f, (bl ? new byq(150.0f, 150.0f, 160.0f, 255.0f) : thyt_2).thzz_4(f5));
            }
            f8 += 1.0f;
            if (!(f11 >= 3.0f)) continue;
            f8 = 0.0f;
            f10 += f9 + f6;
        }
        if (f8 != 0.0f) {
            f10 += f9 + f6;
        }
        this.bqa.srb_2(-(f10 - f4 + 8.0f));
        bhm.sdhsh_2();
    }

    private void renderSaveConfigModal(bzth bzth2) {
        this.gh.dam_2(!this.tbgh ? jkh.hd_2 : jkh.hthd);
        this.gh.zkhdh((long)bnn.dzb_2().art());
        this.gh.khmf(this.tbgh ? 0.0f : 1.0f);
        float f = this.gh.tssh_2();
        float f2 = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        if (f2 <= 0.01f && this.tbgh) {
            this.hrz = false;
            this.tbgh = false;
            return;
        }
        if (this.thbt && this.hha_2 == bjj.rdy) {
            this.shzz_3 = (float)bzth2.getMouseX() - this.tght_2;
            this.dha_6 = (float)bzth2.getMouseY() - this.thsd;
        }
        float f3 = 145.0f;
        float f4 = 82.0f;
        float f5 = this.shzz_3;
        float f6 = this.dha_6;
        float f7 = 0.5f + Math.max(0.0f, f) * 0.5f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bnn.dzb_2().dhdhk(f5);
        byq byq3 = bl ? new byq(13.0f, 13.0f, 14.5f, 255.0f) : dmth;
        byq byq4 = bl ? dmth : jss_3;
        byq byq5 = bl ? new byq(22.0f, 22.0f, 25.0f, 255.0f) : new byq(240.0f, 240.0f, 243.0f, 255.0f);
        bzth2.pushMatrix();
        shk_3.bdhkh(bzth2.method_51448(), f5 + f3 / 2.0f, f6 + f4 / 2.0f, f7);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
        bzth2.drawShadow(f5, f6 + 2.0f, f3, f4, 8.0f, zth_8.all(5.0f), bhj_2.bdhj.thzz_4(0.25f * f2));
        bzth2.drawRoundedRect(f5, f6, f3, f4, zth_8.all(5.0f), byq3.thzz_4(f2));
        bzth2.drawText(bmn.sdha_2.twy_2(7.2f), "Create config", f5 + 8.5f, f6 + 8.0f, byq4.thzz_4(f2));
        float f8 = 5.5f;
        float f9 = f5 + f3 - 9.5f;
        float f10 = f6 + 4.5f;
        boolean bl2 = bhh.zzy_3((double)f9 - 1.5, (double)f10 - 1.5, (double)f8 + 3.0, (double)f8 + 3.0, bzth2);
        byq byq6 = bl2 ? new byq(248.0f, 113.0f, 113.0f, 255.0f) : new byq(239.0f, 68.0f, 68.0f, 255.0f);
        bzth2.drawRoundedRect(f9, f10, f8, f8, zth_8.all(f8 / 2.0f), byq6.thzz_4(f2));
        bzth2.drawCenteredText(bmn.shmz.twy_2(4.5f), "×", f9 + f8 / 2.0f, f10 + 0.3f, dmth.thzz_4(f2));
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        float f11 = f3 - 17.0f;
        float f12 = 14.0f;
        float f13 = f6 + 19.5f;
        bzth2.drawRoundedRect(f5 + 8.5f, f13, f11, f12, zth_8.all(3.0f), byq5.thzz_4(f2));
        if (this.dhas.zqr_2()) {
            bzth2.drawRoundedBorder(f5 + 8.5f, f13, f11, f12, 0.18f, zth_8.all(3.0f), byq2.thzz_4(f2));
        }
        this.dhas.amf(f5 + 8.5f, f13, f11, f12);
        this.dhas.bsz(byq4);
        this.dhas.dhtz(bzth2);
        float f14 = f6 + 36.5f;
        bzth2.drawRoundedRect(f5 + 8.5f, f14, f11, f12, zth_8.all(3.0f), byq5.thzz_4(f2));
        if (this.shkhh.zqr_2()) {
            bzth2.drawRoundedBorder(f5 + 8.5f, f14, f11, f12, 0.18f, zth_8.all(3.0f), byq2.thzz_4(f2));
        }
        this.shkhh.amf(f5 + 8.5f, f14, f11, f12);
        this.shkhh.bsz(byq4);
        this.shkhh.dhtz(bzth2);
        float f15 = f11;
        float f16 = 14.0f;
        float f17 = f5 + 8.5f;
        float f18 = f6 + 54.5f;
        boolean bl3 = bhh.zzy_3(f17, f18, f15, f16, bzth2);
        if (bl3) {
            zw.hdhth(bay_2.mw);
        }
        byq byq7 = byq2.thzz_4(bl3 ? 1.0f : 0.88f);
        bzth2.drawRoundedRect(f17, f18, f15, f16, zth_8.all(3.0f), byq7.thzz_4(f2));
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), "Create", f17 + f15 / 2.0f, f18 + 3.0f, dmth.thzz_4(f2));
        bzth2.popMatrix();
    }

    private void openConfigActions(bjk bjk2, float f, float f2) {
        this.sjq_2 = bjk2;
        this.ght_2 = true;
        this.rta_2 = false;
        this.bkj.atth_2(0.0f);
        this.bdhth = Math.max(this.dhkhgh.khdb_2() + 8.0f, Math.min(f, this.dhkhgh.khdb_2() + 600.0f - 250.0f));
        this.ad_2 = Math.max(this.dhkhgh.sw() + 8.0f, Math.min(f2, this.dhkhgh.sw() + 390.0f - 184.0f));
        this.setFieldText(this.syd_2, bjk2.thkgh());
        this.setFieldText(this.hsa_3, bjk2.rhy());
        this.setFieldText(this.sa_2, String.join((CharSequence)", ", bjk2.ats_2()));
        this.setFieldText(this.hrj, bjk2.btgh());
        this.blurConfigFields();
    }

    private void renameSelectedConfig() {
        if (this.sjq_2 == null) {
            return;
        }
        String string = this.syd_2.dwq().trim().replace("\"", "");
        if (string.isEmpty() || string.equalsIgnoreCase(this.sjq_2.thkgh())) {
            return;
        }
        bjk bjk2 = Moondlc.getInstance().getConfigManager().dtth_3(string, true);
        if (bjk2 != null) {
            return;
        }
        File file = new File(this.sjq_2.skh_3().getParentFile(), string + ".moon");
        if (this.sjq_2.skh_3().renameTo(file)) {
            Moondlc.getInstance().getConfigManager().dhtw_2();
            this.sjq_2 = Moondlc.getInstance().getConfigManager().dtth_3(string, true);
            if (this.sjq_2 != null) {
                this.setFieldText(this.syd_2, this.sjq_2.thkgh());
            }
        }
    }

    private void renderConfigActionsModal(bzth bzth2) {
        byq byq2;
        byq byq3;
        byq byq4;
        this.bkj.khmf(this.rta_2 ? 0.0f : 1.0f);
        float f = this.bkj.tssh_2();
        if (f <= 0.01f && this.rta_2) {
            this.ght_2 = false;
            this.rta_2 = false;
            this.sjq_2 = null;
            this.blurConfigFields();
            return;
        }
        if (this.sjq_2 == null) {
            this.rta_2 = true;
            return;
        }
        if (this.shrh) {
            this.bdhth = (float)bzth2.getMouseX() - this.tnl;
            this.ad_2 = (float)bzth2.getMouseY() - this.ttha;
        }
        float f2 = this.bdhth;
        float f3 = this.ad_2;
        float f4 = 240.0f;
        float f5 = 154.0f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq5 = bnn.dzb_2().dhdhk(f2);
        byq byq6 = bl ? new byq(24.0f, 24.0f, 27.0f, 255.0f) : dmth;
        byq byq7 = bl ? new byq(39.0f, 39.0f, 42.0f, 255.0f) : hja;
        byq byq8 = bl ? dmth : jss_3;
        byq byq9 = bl ? new byq(32.0f, 32.0f, 36.0f, 255.0f) : jqsh;
        bzth2.pushMatrix();
        shk_3.bdhkh(bzth2.method_51448(), f2 + f4 / 2.0f, f3 + f5 / 2.0f, 0.9f + 0.1f * f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
        bzth2.drawShadow(f2, f3, f4, f5, 22.0f, zth_8.all(8.0f), bhj_2.bdhj.thzz_4(0.22f * f));
        bzth2.drawRoundedRect(f2, f3, f4, f5, zth_8.all(8.0f), byq7.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 1.0f, f3 + 1.0f, f4 - 2.0f, f5 - 2.0f, zth_8.all(7.0f), byq6.thzz_4(f));
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), "Config settings", f2 + 12.0f, f3 + 8.0f, byq8.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 12.0f, f3 + 21.0f, 28.0f, 2.0f, zth_8.all(1.0f), byq5.thzz_4(f));
        float f6 = f2 + f4 - 18.0f;
        boolean bl2 = bhh.zzy_3(f6, f3 + 7.5f, 10.0, 10.0, bzth2);
        bzth2.drawTexture(bss_4, f6, f3 + 7.5f, 10.0f, 10.0f, (bl2 ? ztf_2 : byq8).thzz_4(f));
        bzth2.drawRect(f2, f3 + 25.0f, f4, 0.5f, (bl ? new byq(45.0f, 45.0f, 50.0f, 255.0f) : hja).thzz_4(f));
        byq byq10 = this.syd_2.zqr_2() ? byq5 : (bl ? new byq(50.0f, 50.0f, 55.0f, 255.0f) : hja);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Name", f2 + 12.0f, f3 + 34.0f, thyt_2.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 50.0f, f3 + 30.0f, f4 - 62.0f, 16.0f, zth_8.all(4.0f), byq10.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 51.0f, f3 + 31.0f, f4 - 64.0f, 14.0f, zth_8.all(3.0f), byq9.thzz_4(f));
        this.syd_2.amf(f2 + 50.0f, f3 + 30.0f, f4 - 62.0f, 16.0f);
        this.syd_2.bsz(byq8);
        this.syd_2.dhtz(bzth2);
        byq byq11 = this.hsa_3.zqr_2() ? byq5 : (bl ? new byq(50.0f, 50.0f, 55.0f, 255.0f) : hja);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Desc", f2 + 12.0f, f3 + 54.0f, thyt_2.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 50.0f, f3 + 50.0f, f4 - 62.0f, 16.0f, zth_8.all(4.0f), byq11.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 51.0f, f3 + 51.0f, f4 - 64.0f, 14.0f, zth_8.all(3.0f), byq9.thzz_4(f));
        this.hsa_3.amf(f2 + 50.0f, f3 + 50.0f, f4 - 62.0f, 16.0f);
        this.hsa_3.bsz(byq8);
        this.hsa_3.dhtz(bzth2);
        byq byq12 = this.sa_2.zqr_2() ? byq5 : (bl ? new byq(50.0f, 50.0f, 55.0f, 255.0f) : hja);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Tags", f2 + 12.0f, f3 + 74.0f, thyt_2.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 50.0f, f3 + 70.0f, f4 - 62.0f, 16.0f, zth_8.all(4.0f), byq12.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 51.0f, f3 + 71.0f, f4 - 64.0f, 14.0f, zth_8.all(3.0f), byq9.thzz_4(f));
        this.sa_2.amf(f2 + 50.0f, f3 + 70.0f, f4 - 62.0f, 16.0f);
        this.sa_2.bsz(byq8);
        this.sa_2.dhtz(bzth2);
        byq byq13 = this.hrj.zqr_2() ? byq5 : (bl ? new byq(50.0f, 50.0f, 55.0f, 255.0f) : hja);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Image", f2 + 12.0f, f3 + 94.0f, thyt_2.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 50.0f, f3 + 90.0f, f4 - 62.0f, 16.0f, zth_8.all(4.0f), byq13.thzz_4(f));
        bzth2.drawRoundedRect(f2 + 51.0f, f3 + 91.0f, f4 - 64.0f, 14.0f, zth_8.all(3.0f), byq9.thzz_4(f));
        this.hrj.amf(f2 + 50.0f, f3 + 90.0f, f4 - 62.0f, 16.0f);
        this.hrj.bsz(byq8);
        this.hrj.dhtz(bzth2);
        float f7 = f3 + 111.0f;
        float f8 = f3 + 128.0f;
        float f9 = 13.0f;
        float f10 = (f4 - 30.0f) / 2.0f;
        boolean bl3 = bhh.zzy_3(f2 + 10.0f, f7, f10, f9, bzth2);
        boolean bl4 = bhh.zzy_3(f2 + 20.0f + f10, f7, f10, f9, bzth2);
        boolean bl5 = bhh.zzy_3(f2 + 10.0f, f8, f10, f9, bzth2);
        boolean bl6 = bhh.zzy_3(f2 + 20.0f + f10, f8, f10, f9, bzth2);
        this.renderAccentButton(bzth2, f2 + 10.0f, f7, f10, f9, "Update", this.shfh_2.khmf(bl3 ? 1.0f : 0.0f), f);
        this.renderAccentButton(bzth2, f2 + 20.0f + f10, f7, f10, f9, "Rename", this.lz_2.khmf(bl4 ? 1.0f : 0.0f), f);
        this.renderAccentButton(bzth2, f2 + 10.0f, f8, f10, f9, "Load", this.shsj.khmf(bl5 ? 1.0f : 0.0f), f);
        float f11 = this.thtq_2.khmf(bl6 ? 1.0f : 0.0f);
        if (bl) {
            byq4 = new byq(40.0f, 24.0f, 27.0f, 255.0f);
            byq3 = byq4.dkhw_2(ztf_2, f11);
            byq2 = bl6 ? dmth : ztf_2;
        } else {
            byq4 = new byq(254.0f, 226.0f, 226.0f, 255.0f);
            byq byq14 = new byq(239.0f, 68.0f, 68.0f, 255.0f);
            byq3 = byq4.dkhw_2(byq14, f11);
            byq2 = bl6 ? dmth : new byq(220.0f, 38.0f, 38.0f, 255.0f);
        }
        bzth2.drawRoundedRect(f2 + 20.0f + f10, f8, f10, f9, zth_8.all(3.0f), byq3.thzz_4(f));
        if (!bl) {
            byq4 = new byq(252.0f, 165.0f, 165.0f, 255.0f).dkhw_2(new byq(220.0f, 38.0f, 38.0f, 255.0f), f11);
            bzth2.drawRoundedBorder(f2 + 20.0f + f10, f8, f10, f9, 0.18f, zth_8.all(3.0f), byq4.thzz_4(f));
        }
        bzth2.drawTexture(shtq, f2 + 28.0f + f10, f8 + 2.0f, 9.0f, 9.0f, byq2.thzz_4(f));
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.2f), "Delete", f2 + 20.0f + f10 + f10 / 2.0f + 4.0f, f8 + 4.0f, byq2.thzz_4(f));
        if (bl2 || bl3 || bl4 || bl5 || bl6 || bhh.zzy_3(f2 + 50.0f, f3 + 30.0f, f4 - 62.0f, 76.0, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bzth2.popMatrix();
    }

    private void renderFriendsContent(bzth bzth2, float f, float f2, float f3, float f4, float f5) {
        byq byq2;
        boolean bl;
        List list = Moondlc.getInstance().getFriendManager().hkha_2();
        String string = this.shhd_4.dwq().trim().toLowerCase();
        List list2 = list;
        if (!string.isEmpty()) {
            list2 = list.stream().filter(arg_0 -> this.lambda$renderFriendsContent$21(string, list, arg_0)).collect(Collectors.toList());
        }
        byq byq3 = (bl = bnn.dzb_2().ghdt()) ? new byq(16.0f, 16.0f, 18.0f, 255.0f) : new byq(206.0f, 206.0f, 206.0f, 255.0f);
        byq byq4 = bl ? dmth : new byq(24.0f, 24.0f, 27.0f, 255.0f);
        byq byq5 = byq2 = bl ? new byq(135.0f, 135.0f, 145.0f, 255.0f) : new byq(105.0f, 105.0f, 110.0f, 255.0f);
        if (list2.isEmpty()) {
            float f6 = f + f3 / 2.0f;
            float f7 = f2 + f4 / 2.0f;
            byq byq6 = (bl ? dmth : jss_3).thzz_4(f5);
            byq byq7 = (bl ? thyt_2 : new byq(120.0f, 120.0f, 125.0f, 255.0f)).thzz_4(f5);
            bzth2.drawTexture(thdgh_2, f6 - 22.0f, f7 - 38.0f, 44.0f, 44.0f, byq7);
            bzth2.drawCenteredText(bmn.shmz.twy_2(11.0f), "U don’t have any Friends", f6, f7 + 14.0f, byq6);
            bzth2.drawCenteredText(bmn.shzth.twy_2(7.5f), "Go find GF lmao stfu .", f6, f7 + 28.0f, byq7);
            return;
        }
        bhm.dar_2(bzth2.method_51448(), f, f2, f3, f4);
        float f8 = 8.0f;
        float f9 = (f3 - f8) / 2.0f;
        float f10 = 0.0f;
        float f11 = 36.0f;
        float f12 = (float)(-this.bqa.shtt_4());
        for (int i = 0; i < list2.size(); ++i) {
            String string2 = (String)list2.get(i);
            int n = list.indexOf(string2);
            float f13 = f + f10 * (f9 + f8);
            float f14 = f2 + f12;
            if (f14 + f11 > f2 && f14 < f2 + f4) {
                Object object;
                boolean bl2;
                float f15;
                float f16;
                float f17;
                boolean bl3;
                if (!bl) {
                    bzth2.drawShadow(f13, f14 + 1.0f, f9, f11, 6.0f, zth_8.all(5.0f), bhj_2.bdhj.thzz_4(0.1f * f5));
                }
                bzth2.drawRoundedRect(f13, f14, f9, f11, zth_8.all(5.0f), byq3.thzz_4(f5));
                if (!bl) {
                    bzth2.drawRoundedBorder(f13, f14, f9, f11, 0.2f, zth_8.all(5.0f), new byq(190.0f, 190.0f, 190.0f, 255.0f).thzz_4(f5));
                }
                float f18 = 25.0f;
                float f19 = f13 + 5.0f;
                float f20 = f14 + (f11 - f18) / 2.0f;
                byq byq8 = bl ? new byq(24.0f, 24.0f, 28.0f, 255.0f) : new byq(180.0f, 180.0f, 180.0f, 255.0f);
                bzth2.drawRoundedRect(f19, f20, f18, f18, zth_8.all(4.0f), byq8.thzz_4(f5));
                class_2960 class_29602 = this.getOrFetchFriendAvatar(string2);
                if (class_29602 != null) {
                    bzth2.drawRoundedTexture(class_29602, f19, f20, f18, f18, zth_8.all(4.0f), byq.brz_2.thzz_4(f5));
                }
                byq byq9 = (bl3 = this.isFriendOnline(string2)) ? new byq(38.0f, 192.0f, 48.0f, 255.0f) : new byq(178.0f, 11.0f, 11.0f, 255.0f);
                float f21 = 6.0f;
                float f22 = f19 + f18 - f21 + 0.5f;
                float f23 = f20 + f18 - f21 + 0.5f;
                bzth2.drawRoundedRect(f22 - 0.8f, f23 - 0.8f, f21 + 1.6f, f21 + 1.6f, zth_8.all((f21 + 1.6f) / 2.0f), byq3.thzz_4(f5));
                bzth2.drawRoundedRect(f22, f23, f21, f21, zth_8.all(f21 / 2.0f), byq9.thzz_4(f5));
                float f24 = f13 + f18 + 8.0f;
                String string3 = this.getFriendDisplayName(string2, n);
                if (string2.equals(this.tfs)) {
                    this.bghdh.ss_4(f24);
                    this.bghdh.raj(f14 + 1.5f);
                    this.bghdh.rbz_2(f9 - (f24 - f13) - 20.0f);
                    this.bghdh.snsh_2(14.0f);
                    this.bghdh.bsz(byq4);
                    this.bghdh.dhtz(bzth2);
                } else {
                    float f25 = bmn.shmz.twy_2(8.5f).dak(string3);
                    bzth2.drawText(bmn.shmz.twy_2(8.5f), string3, f24, f14 + 6.0f, byq4.thzz_4(f5));
                    f17 = f24 + f25 + 3.5f;
                    f16 = f14 + 5.0f;
                    f15 = 7.5f;
                    bl2 = bhh.zzy_3(f17 - 2.0f, f16 - 2.0f, f15 + 4.0f, f15 + 4.0f, bzth2);
                    object = bl2 ? (bl ? dmth : jss_3) : (bl ? new byq(180.0f, 180.0f, 190.0f, 255.0f) : new byq(100.0f, 100.0f, 105.0f, 255.0f));
                    bzth2.drawTexture(khhth, f17, f16, f15, f15, ((byq)object).thzz_4(f5));
                    if (bl2) {
                        zw.hdhth(bay_2.mw);
                    }
                }
                byq byq10 = bl ? new byq(165.0f, 165.0f, 175.0f, 255.0f) : new byq(115.0f, 115.0f, 120.0f, 255.0f);
                bzth2.drawText(bmn.shzth.twy_2(6.8f), "#" + string2, f24, f14 + 18.0f, byq10.thzz_4(f5));
                f17 = 9.5f;
                f16 = f13 + f9 - f17 - 6.5f;
                f15 = f14 + 5.5f;
                bl2 = bhh.zzy_3(f16 - 2.0f, f15 - 2.0f, f17 + 4.0f, f17 + 4.0f, bzth2);
                object = this.getThemeAnim("friend_rm_" + string2);
                ((fa_2)object).ddt_6(bl2);
                float f26 = ((fa_2)object).tssh_2();
                byq byq11 = (bl ? new byq(160.0f, 160.0f, 170.0f, 255.0f) : new byq(100.0f, 100.0f, 105.0f, 255.0f)).dkhw_2(ztf_2, f26);
                bzth2.drawTexture(bss_4, f16, f15, f17, f17, byq11.thzz_4(f5));
                if (bl2) {
                    zw.hdhth(bay_2.mw);
                }
            }
            if (!((f10 += 1.0f) >= 2.0f)) continue;
            f10 = 0.0f;
            f12 += f11 + f8;
        }
        if (f10 != 0.0f) {
            f12 += f11 + f8;
        }
        this.bqa.srb_2(-(f12 - f4 + 8.0f));
        bhm.sdhsh_2();
    }

    private boolean isFriendOnline(String string) {
        if (tkhd.mc.field_1724 == null || tkhd.mc.field_1724.field_3944 == null || string == null) {
            return false;
        }
        for (class_640 class_6402 : tkhd.mc.field_1724.field_3944.method_2880()) {
            if (class_6402.method_2966() == null || class_6402.method_2966().getName() == null || !class_6402.method_2966().getName().equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    private String getFriendDisplayName(String string, int n) {
        this.ensureFriendMetaLoaded();
        String string2 = (String)tkhj.get(string);
        if (string2 != null && !string2.trim().isEmpty()) {
            return string2;
        }
        return "Friend " + (n + 1);
    }

    private void ensureFriendMetaLoaded() {
        if (dhgh_2) {
            return;
        }
        dhgh_2 = true;
        try {
            File file = new File(dj.sdr_2, "friend_meta.json");
            if (!file.exists()) {
                return;
            }
            try (FileReader fileReader = new FileReader(file);){
                JsonObject jsonObject = JsonParser.parseReader((Reader)fileReader).getAsJsonObject();
                if (jsonObject.has("aliases")) {
                    JsonObject jsonObject2 = jsonObject.getAsJsonObject("aliases");
                    for (String string : jsonObject2.keySet()) {
                        tkhj.put(string, jsonObject2.get(string).getAsString());
                    }
                }
                if (jsonObject.has("trusted")) {
                    for (JsonElement jsonElement : jsonObject.getAsJsonArray("trusted")) {
                        bghs_2.add(jsonElement.getAsString());
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void saveFriendMeta() {
        try {
            File file = dj.sdr_2;
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "friend_meta.json");
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            for (Map.Entry object2 : tkhj.entrySet()) {
                jsonObject2.addProperty((String)object2.getKey(), (String)object2.getValue());
            }
            jsonObject.add("aliases", (JsonElement)jsonObject2);
            JsonArray jsonArray = new JsonArray();
            for (String string : bghs_2) {
                jsonArray.add(string);
            }
            jsonObject.add("trusted", (JsonElement)jsonArray);
            try (FileWriter fileWriter = new FileWriter(file2);){
                fileWriter.write(jsonObject.toString());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private class_2960 getSteveHeadTexture() {
        if (tadh_2 != null) {
            return tadh_2;
        }
        try {
            int n = 8;
            BufferedImage bufferedImage = new BufferedImage(n, n, 2);
            int[] nArray = new int[]{-13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -4818094, -4818094, -4818094, -4818094, -13953010, -13953010, -4818094, -4818094, -4818094, -4818094, -4818094, -4818094, -4818094, -4818094, -1, -14141308, -4818094, -4818094, -4818094, -4818094, -14141308, -1, -4818094, -4818094, -4818094, -7121353, -7121353, -4818094, -4818094, -4818094, -13953010, -13953010, -9881049, -9881049, -9881049, -9881049, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010, -13953010};
            bufferedImage.setRGB(0, 0, n, n, nArray, 0, n);
            tadh_2 = Moondlc.id("friend_steve_default");
            mc.method_1531().method_4616(tadh_2, (class_1044)new class_1043(brd_2.shghdh(bufferedImage, true)));
            return tadh_2;
        }
        catch (Exception exception) {
            return Moondlc.id("textures/mainmenu/steve.png");
        }
    }

    private class_2960 getOrFetchFriendAvatar(String string) {
        if (string == null || string.trim().isEmpty()) {
            return this.getSteveHeadTexture();
        }
        class_2960 class_29602 = (class_2960)bfs_2.get(string);
        if (class_29602 != null) {
            return class_29602;
        }
        if (tkhd.mc.field_1724 != null && tkhd.mc.field_1724.field_3944 != null) {
            for (class_640 class_6402 : tkhd.mc.field_1724.field_3944.method_2880()) {
                class_2960 class_29603;
                if (class_6402.method_2966() == null || class_6402.method_2966().getName() == null || !class_6402.method_2966().getName().equalsIgnoreCase(string) || (class_29603 = class_6402.method_52810().comp_1626()) == null) continue;
                bfs_2.put(string, class_29603);
                return class_29603;
            }
        }
        if (!thyb.contains(string)) {
            thyb.add(string);
            CompletableFuture.runAsync(() -> this.lambda$getOrFetchFriendAvatar$24(string));
        }
        return this.getSteveHeadTexture();
    }

    private BufferedImage fetchHeadImage(String string) {
        String[] stringArray;
        for (String string2 : stringArray = new String[]{"https://mc-heads.net/avatar/" + string + "/128", "https://minotar.net/helm/" + string + "/128", "https://crafatar.com/avatars/" + string + "?size=128&overlay"}) {
            try {
                BufferedImage bufferedImage;
                URL uRL = URI.create(string2).toURL();
                HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
                if (httpURLConnection.getResponseCode() != 200 || (bufferedImage = ImageIO.read(httpURLConnection.getInputStream())) == null) continue;
                return bufferedImage;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return null;
    }

    private void renderThemeCardHeader(bzth bzth2, float f, float f2, float f3, String string, String string2) {
        bnn bnn2 = bnn.dzb_2();
        boolean bl = bnn2.ghdt();
        byq byq2 = bl ? new byq(16.0f, 16.0f, 18.0f, 255.0f) : dmth;
        byq byq3 = bl ? new byq(26.0f, 26.0f, 28.0f, 255.0f) : hja;
        byq byq4 = bl ? new byq(250.0f, 250.0f, 250.0f, 255.0f) : jss_3;
        byq byq5 = bl ? new byq(161.0f, 161.0f, 170.0f, 255.0f) : thyt_2;
        bzth2.drawRoundedRect(f, f2, f3, 110.0f, zth_8.all(6.0f), byq2);
        bzth2.drawRoundedBorder(f, f2, f3, 110.0f, 0.18f, zth_8.all(6.0f), byq3);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), string, f + 10.0f, f2 + 8.0f, byq4);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), string2, f + 10.0f, f2 + 20.0f, byq5);
    }

    private fa_2 getThemeAnim(String string) {
        return this.thzkh.computeIfAbsent(string, tkhd::lambda$getThemeAnim$25);
    }

    private void renderThemesContent(bzth bzth2, float f, float f2, float f3, float f4, float f5) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        Object object;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean bl4;
        float f14;
        byq byq2;
        bnn bnn2 = bnn.dzb_2();
        boolean bl5 = bnn2.ghdt();
        boolean bl6 = bnn2.sns();
        byq byq3 = byq2 = (bl5 ? new byq(250.0f, 250.0f, 250.0f, 255.0f) : jss_3).thzz_4(f5);
        byq byq4 = (bl5 ? new byq(140.0f, 144.0f, 154.0f, 255.0f) : thyt_2).thzz_4(f5);
        byq byq5 = (bl5 ? new byq(20.0f, 20.0f, 23.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f)).thzz_4(f5);
        byq byq6 = (bl5 ? new byq(11.5f, 11.5f, 13.0f, 255.0f) : dmth).thzz_4(f5);
        byq byq7 = bnn2.dhdhk(f).thzz_4(f5);
        byq byq8 = (bl5 ? new byq(18.0f, 18.0f, 21.0f, 255.0f) : new byq(228.0f, 228.0f, 231.0f, 255.0f)).thzz_4(f5);
        byq byq9 = (bl5 ? new byq(16.0f, 16.0f, 18.5f, 255.0f) : new byq(244.0f, 244.0f, 245.0f, 255.0f)).thzz_4(f5);
        byq byq10 = (bl5 ? new byq(140.0f, 140.0f, 150.0f, 255.0f) : new byq(140.0f, 140.0f, 148.0f, 255.0f)).thzz_4(f5);
        float f15 = 8.0f;
        float f16 = Math.round((f3 - f15 * 2.0f) * 0.31f);
        float f17 = Math.round((f3 - f15 * 2.0f) * 0.38f);
        float f18 = f3 - f15 * 2.0f - f16 - f17;
        float f19 = f;
        float f20 = f + f16 + f15;
        float f21 = f20 + f17 + f15;
        float f22 = f2;
        float f23 = 84.0f;
        bzth2.drawRoundedRect(f19, f22, f16, f23, zth_8.all(6.0f), byq6);
        bzth2.drawRoundedBorder(f19, f22, f16, f23, 0.18f, zth_8.all(6.0f), byq5);
        bzth2.drawTexture(bmd, f19 + 10.0f, f22 + 8.0f, 10.0f, 10.0f, byq10);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), "Main color", f19 + 24.0f, f22 + 9.5f, byq3);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Choose the main gui theme.", f19 + 10.0f, f22 + 21.0f, byq4);
        float f24 = (f16 - 26.0f) / 2.0f;
        float f25 = 36.0f;
        float f26 = f19 + 10.0f;
        float f27 = f22 + 33.0f;
        float f28 = f26 + f24 + 6.0f;
        boolean bl7 = !bl5;
        boolean bl8 = bl5;
        fa_2 fa2_2 = this.getThemeAnim("light_hov");
        fa_2 fa3_2 = this.getThemeAnim("dark_hov");
        fa2_2.ddt_6(bhh.zzy_3(f26, f27, f24, f25, bzth2));
        fa3_2.ddt_6(bhh.zzy_3(f28, f27, f24, f25, bzth2));
        float f29 = fa2_2.tssh_2();
        float f30 = fa3_2.tssh_2();
        if (f29 > 0.01f || f30 > 0.01f) {
            zw.hdhth(bay_2.mw);
        }
        byq byq11 = bl7 ? byq7 : byq5.dkhw_2(byq7, f29 * 0.5f);
        bzth2.drawRoundedRect(f26, f27, f24, f25, zth_8.all(6.0f), dmth.thzz_4(f5));
        bzth2.drawRoundedBorder(f26, f27, f24, f25, 0.18f, zth_8.all(6.0f), byq11);
        bzth2.drawRect(f26 + 5.0f, f27 + 4.0f, 8.0f, 28.0f, new byq(244.0f, 244.0f, 245.0f, 255.0f).thzz_4(f5));
        bzth2.drawRoundedRect(f26 + 16.0f, f27 + 7.0f, f24 - 22.0f, 3.5f, zth_8.all(1.75f), new byq(228.0f, 228.0f, 231.0f, 255.0f).thzz_4(f5));
        bzth2.drawRoundedRect(f26 + 16.0f, f27 + 14.0f, f24 - 22.0f, 3.5f, zth_8.all(1.75f), new byq(228.0f, 228.0f, 231.0f, 255.0f).thzz_4(f5));
        bzth2.drawRoundedRect(f26 + 16.0f, f27 + 21.0f, (f24 - 22.0f) * 0.6f, 3.5f, zth_8.all(1.75f), new byq(228.0f, 228.0f, 231.0f, 255.0f).thzz_4(f5));
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), "Light", f26 + f24 / 2.0f, f27 + f25 + 3.0f, bl7 ? byq3 : byq4);
        byq byq12 = bl8 ? byq7 : byq5.dkhw_2(byq7, f30 * 0.5f);
        bzth2.drawRoundedRect(f28, f27, f24, f25, zth_8.all(6.0f), (bl5 ? new byq(11.5f, 11.5f, 13.0f, 255.0f) : new byq(18.0f, 18.0f, 20.0f, 255.0f)).thzz_4(f5));
        bzth2.drawRoundedBorder(f28, f27, f24, f25, 0.18f, zth_8.all(6.0f), byq12);
        bzth2.drawRect(f28 + 5.0f, f27 + 4.0f, 8.0f, 28.0f, new byq(18.0f, 18.0f, 21.0f, 255.0f).thzz_4(f5));
        bzth2.drawRoundedRect(f28 + 16.0f, f27 + 7.0f, f24 - 22.0f, 3.5f, zth_8.all(1.75f), new byq(30.0f, 30.0f, 34.0f, 255.0f).thzz_4(f5));
        bzth2.drawRoundedRect(f28 + 16.0f, f27 + 14.0f, f24 - 22.0f, 3.5f, zth_8.all(1.75f), new byq(30.0f, 30.0f, 34.0f, 255.0f).thzz_4(f5));
        bzth2.drawRoundedRect(f28 + 16.0f, f27 + 21.0f, (f24 - 22.0f) * 0.6f, 3.5f, zth_8.all(1.75f), new byq(30.0f, 30.0f, 34.0f, 255.0f).thzz_4(f5));
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), "Dark", f28 + f24 / 2.0f, f27 + f25 + 3.0f, bl8 ? byq3 : byq4);
        float f31 = f2;
        fa_2 fa4 = this.getThemeAnim("grad_expand");
        fa4.khmf(bl6 ? 1.0f : 0.0f);
        float f32 = fa4.tssh_2();
        float f33 = 92.0f + f32 * 28.0f;
        bzth2.drawRoundedRect(f20, f31, f17, f33, zth_8.all(6.0f), byq6);
        bzth2.drawRoundedBorder(f20, f31, f17, f33, 0.18f, zth_8.all(6.0f), byq5);
        byq byq13 = (bl5 ? dmth : jss_3).thzz_4(f5);
        bzth2.drawTexture(khdkh_2, f20 + 10.0f, f31 + 8.0f, 10.0f, 10.0f, byq13);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), "Accent color", f20 + 24.0f, f31 + 9.5f, byq3);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Accent color of the gui.", f20 + 10.0f, f31 + 21.0f, byq4);
        float f34 = f20 + 10.0f;
        float f35 = f31 + 34.0f;
        byq[] byqArray = bnn.khla_2;
        float f36 = (f17 - 20.0f - 12.0f * (float)byqArray.length) / (float)Math.max(1, byqArray.length - 1);
        for (int i = 0; i < byqArray.length; ++i) {
            byq byq14 = byqArray[i];
            f14 = f34 + (float)i * (12.0f + f36);
            bl4 = bhh.zzy_3(f14 - 1.0f, f35 - 1.0f, 14.0, 14.0, bzth2);
            fa_2 fa5 = this.getThemeAnim("sw_" + i);
            fa5.ddt_6(bl4);
            f13 = fa5.tssh_2();
            if (bl4) {
                zw.hdhth(bay_2.mw);
            }
            f12 = 12.0f + f13 * 2.0f;
            float f37 = (f12 - 12.0f) / 2.0f;
            bzth2.drawRoundedRect(f14 - f37, f35 - f37, f12, f12, zth_8.all(f12 / 2.0f), byq14.thzz_4(f5));
            boolean bl9 = bnn2.kb().shnf(byq14);
            if (!bl9) continue;
            float f38 = 3.0f;
            float f39 = f12 + f38 * 2.0f;
            bzth2.drawRoundedBorder(f14 - f37 - f38, f35 - f37 - f38, f39, f39, 0.18f, zth_8.all(f39 / 2.0f), byq14.thzz_4(f5));
        }
        float f40 = f20 + 10.0f;
        float f41 = f31 + 52.0f;
        f14 = (f17 - 26.0f) / 2.0f;
        bzth2.drawText(bmn.shzth.twy_2(6.0f), "Primary", f40, f41, byq4);
        bzth2.drawText(bmn.shzth.twy_2(6.0f), "Secondary", f40 + f14 + 6.0f, f41, byq4);
        bl4 = bhh.zzy_3(f40, f41 + 8.0f, f14, 15.0, bzth2);
        boolean bl10 = bhh.zzy_3(f40 + f14 + 6.0f, f41 + 8.0f, f14, 15.0, bzth2);
        if (bl4 || bl10) {
            zw.hdhth(bay_2.mw);
        }
        bzth2.drawRoundedRect(f40, f41 + 8.0f, f14, 15.0f, zth_8.all(7.5f), byq9);
        if (!bl5) {
            bzth2.drawRoundedBorder(f40, f41 + 8.0f, f14, 15.0f, 0.18f, zth_8.all(7.5f), byq5);
        }
        bzth2.drawRoundedRect(f40 + 4.0f, f41 + 11.5f, 8.0f, 8.0f, zth_8.all(4.0f), bnn2.kb().thzz_4(f5));
        bzth2.drawText(bmn.sdha_2.twy_2(6.5f), bnn2.kb().ddl_4().substring(1, 7).toUpperCase(), f40 + 16.0f, f41 + 12.0f, byq3);
        bzth2.drawRoundedRect(f40 + f14 + 6.0f, f41 + 8.0f, f14, 15.0f, zth_8.all(7.5f), byq9);
        if (!bl5) {
            bzth2.drawRoundedBorder(f40 + f14 + 6.0f, f41 + 8.0f, f14, 15.0f, 0.18f, zth_8.all(7.5f), byq5);
        }
        bzth2.drawRoundedRect(f40 + f14 + 10.0f, f41 + 11.5f, 8.0f, 8.0f, zth_8.all(4.0f), bnn2.rha_3().thzz_4(f5));
        bzth2.drawText(bmn.sdha_2.twy_2(6.5f), bnn2.rha_3().ddl_4().substring(1, 7).toUpperCase(), f40 + f14 + 22.0f, f41 + 12.0f, byq3);
        f13 = f20 + f17 - 28.0f;
        f12 = f41 + 27.0f;
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Animation gradient", f40, f41 + 28.0f, byq4);
        fa_2 fa6 = this.getThemeAnim("grad_switch");
        fa6.ddt_6(bl6);
        float f42 = fa6.tssh_2();
        boolean bl11 = bhh.zzy_3(f13, f12, 20.0, 11.0, bzth2);
        if (bl11) {
            zw.hdhth(bay_2.mw);
        }
        byq byq15 = (bl5 ? new byq(18.0f, 18.0f, 21.0f, 255.0f) : byq5).dkhw_2(bnn2.dhdhk(f13), f42).thzz_4(f5);
        bzth2.drawRoundedRect(f13, f12, 20.0f, 11.0f, zth_8.all(5.5f), byq15);
        float f43 = f13 + 1.0f + f42 * 9.0f;
        bzth2.drawRoundedRect(f43, f12 + 1.0f, 9.0f, 9.0f, zth_8.all(4.5f), dmth.thzz_4(f5));
        if (f32 > 0.01f) {
            f11 = f20 + 10.0f;
            f10 = f31 + 92.0f + (f33 - 92.0f) - 18.0f;
            f9 = f17 - 20.0f;
            f8 = f5 * f32;
            bzth2.drawRoundedRect(f11, f10, f9, 8.0f, zth_8.all(4.0f), byq8.thzz_4(f32));
            bzth2.drawRoundedRect(f11 + 1.0f, f10 + 1.0f, 6.0f, 6.0f, zth_8.left(3.0f, 3.0f), bnn2.dhdhk(f11).thzz_4(f8));
            bzth2.drawRoundedRect(f11 + f9 - 7.0f, f10 + 1.0f, 6.0f, 6.0f, zth_8.right(3.0f, 3.0f), bnn2.dhdhk(f11 + f9).thzz_4(f8));
            for (int i = 4; i < (int)(f9 - 8.0f); ++i) {
                bzth2.drawRect(f11 + 1.0f + (float)i, f10 + 1.0f, 1.0f, 6.0f, bnn2.dhdhk(f11 + (float)i).thzz_4(f8));
            }
        }
        f11 = f2;
        f10 = 72.0f;
        bzth2.drawRoundedRect(f21, f11, f18, f10, zth_8.all(6.0f), byq6);
        bzth2.drawRoundedBorder(f21, f11, f18, f10, 0.18f, zth_8.all(6.0f), byq5);
        bzth2.drawTexture(bmd, f21 + 10.0f, f11 + 8.0f, 10.0f, 10.0f, byq10);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), "Animation", f21 + 24.0f, f11 + 9.5f, byq3);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Gui open/close animations.", f21 + 10.0f, f11 + 21.0f, byq4);
        f9 = f11 + 32.0f;
        f8 = 18.0f;
        float f44 = (f18 - 23.0f) / 2.0f;
        String[] stringArray = new String[]{"Fade", "Tilt"};
        zy_2[] zyArray = zy_2.values();
        for (int i = 0; i < stringArray.length; ++i) {
            f7 = f21 + 10.0f + (float)i * (f44 + 3.0f);
            boolean bl12 = bnn2.zks_4() == zyArray[i];
            boolean bl13 = bhh.zzy_3(f7, f9, f44, f8, bzth2);
            fa_2 fa7 = this.getThemeAnim("anim_btn_" + i);
            fa7.ddt_6(bl12 || bl13);
            f6 = fa7.tssh_2();
            if (bl13) {
                zw.hdhth(bay_2.mw);
            }
            object = bl5 ? new byq(16.0f, 16.0f, 18.5f, 255.0f) : new byq(244.0f, 244.0f, 245.0f, 255.0f);
            byq byq16 = ((byq)object).dkhw_2(bnn2.dhdhk(f7), bl12 ? 1.0f : f6 * 0.4f).thzz_4(f5);
            bzth2.drawRoundedRect(f7, f9, f44, f8, zth_8.all(5.0f), byq16);
            if (!bl5 && !bl12) {
                bzth2.drawRoundedBorder(f7, f9, f44, f8, 0.18f, zth_8.all(5.0f), byq5);
            }
            byq byq17 = (bl12 ? dmth : byq3.thzz_4(0.7f + f6 * 0.3f)).thzz_4(f5);
            bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), stringArray[i], f7 + f44 / 2.0f, f9 + 4.5f, byq17);
        }
        float f45 = bnn2.art();
        f7 = (f45 - 100.0f) / 900.0f;
        float f46 = f21 + 10.0f;
        float f47 = f11 + 54.0f;
        float f48 = f47 + 4.0f;
        f6 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Speed", 7.0f);
        object = (int)f45 + "ms";
        float f49 = bmn.shzth.twy_2(6.5f).dma().dzh_3((String)object, 6.5f);
        float f50 = f21 + f18 - 10.0f - f49;
        bzth2.drawText(bmn.sdha_2.twy_2(7.0f), "Speed", f46, f48 - 3.2f, byq3);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), (String)object, f50, f48 - 2.8f, byq4);
        float f51 = f46 + f6 + 6.0f;
        float f52 = f50 - 6.0f;
        float f53 = Math.max(10.0f, f52 - f51);
        bzth2.drawRoundedRect(f51, f48 - 1.5f, f53, 3.0f, zth_8.all(1.5f), byq8);
        float f54 = Math.max(0.0f, f53 * f7);
        if (f54 > 0.0f) {
            zth_8 zth2 = f54 >= f53 - 2.0f ? zth_8.all(1.5f) : zth_8.left(1.5f, 1.5f);
            bzth2.drawRoundedRect(f51, f48 - 1.5f, f54, 3.0f, zth2, byq7);
        }
        float f55 = f51 + f53 * f7;
        bzth2.drawRoundedRect(f55 - 3.5f, f48 - 3.5f, 7.0f, 7.0f, zth_8.all(3.5f), dmth.thzz_4(f5));
        bzth2.drawRoundedRect(f55 - 2.5f, f48 - 2.5f, 5.0f, 5.0f, zth_8.all(2.5f), byq7);
        boolean bl14 = bl3 = this.hmdh || bhh.zzy_3(f51 - 2.0f, f48 - 6.0f, f53 + 4.0f, 12.0, bzth2);
        if (bl3) {
            zw.hdhth(bay_2.mw);
        }
        float f56 = f19;
        float f57 = f22 + f23 + 8.0f;
        float f58 = 50.0f;
        bzth2.drawRoundedRect(f56, f57, f16, f58, zth_8.all(6.0f), byq6);
        bzth2.drawRoundedBorder(f56, f57, f16, f58, 0.18f, zth_8.all(6.0f), byq5);
        bzth2.drawTexture(bmd, f56 + 10.0f, f57 + 8.0f, 10.0f, 10.0f, byq10);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), "Sidebar speed", f56 + 24.0f, f57 + 9.5f, byq3);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "How fast side bar expands.", f56 + 10.0f, f57 + 21.0f, byq4);
        float f59 = bnn2.hmdh();
        float f60 = (f59 - 10.0f) / 290.0f;
        float f61 = f56 + 10.0f;
        float f62 = f57 + 34.0f;
        float f63 = f62 + 4.0f;
        float f64 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Speed", 7.0f);
        String string = (int)f59 + "ms";
        float f65 = bmn.shzth.twy_2(6.5f).dma().dzh_3(string, 6.5f);
        float f66 = f56 + f16 - 10.0f - f65;
        bzth2.drawText(bmn.sdha_2.twy_2(7.0f), "Speed", f61, f63 - 3.2f, byq3);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), string, f66, f63 - 2.8f, byq4);
        float f67 = f61 + f64 + 6.0f;
        float f68 = f66 - 6.0f;
        float f69 = Math.max(10.0f, f68 - f67);
        bzth2.drawRoundedRect(f67, f63 - 1.5f, f69, 3.0f, zth_8.all(1.5f), byq8);
        float f70 = Math.max(0.0f, f69 * f60);
        if (f70 > 0.0f) {
            zth_8 zth3 = f70 >= f69 - 2.0f ? zth_8.all(1.5f) : zth_8.left(1.5f, 1.5f);
            bzth2.drawRoundedRect(f67, f63 - 1.5f, f70, 3.0f, zth3, byq7);
        }
        float f71 = f67 + f69 * f60;
        bzth2.drawRoundedRect(f71 - 3.5f, f63 - 3.5f, 7.0f, 7.0f, zth_8.all(3.5f), dmth.thzz_4(f5));
        bzth2.drawRoundedRect(f71 - 2.5f, f63 - 2.5f, 5.0f, 5.0f, zth_8.all(2.5f), byq7);
        boolean bl15 = bl2 = this.khqs_2 || bhh.zzy_3(f67 - 2.0f, f63 - 6.0f, f69 + 4.0f, 12.0, bzth2);
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        float f72 = f21;
        float f73 = f11 + f10 + 8.0f;
        float f74 = 50.0f;
        bzth2.drawRoundedRect(f72, f73, f18, f74, zth_8.all(6.0f), byq6);
        bzth2.drawRoundedBorder(f72, f73, f18, f74, 0.18f, zth_8.all(6.0f), byq5);
        bzth2.drawTexture(bmd, f72 + 10.0f, f73 + 8.0f, 10.0f, 10.0f, byq10);
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), "Transparent", f72 + 24.0f, f73 + 9.5f, byq3);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), "Make ur gui transparent.", f72 + 10.0f, f73 + 21.0f, byq4);
        float f75 = bnn2.zda_7();
        float f76 = f75 / 100.0f;
        float f77 = f72 + 10.0f;
        float f78 = f73 + 34.0f;
        float f79 = f78 + 4.0f;
        float f80 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Opacity", 7.0f);
        String string2 = (int)f75 + "%";
        float f81 = bmn.shzth.twy_2(6.5f).dma().dzh_3(string2, 6.5f);
        float f82 = f72 + f18 - 10.0f - f81;
        bzth2.drawText(bmn.sdha_2.twy_2(7.0f), "Opacity", f77, f79 - 3.2f, byq3);
        bzth2.drawText(bmn.shzth.twy_2(6.5f), string2, f82, f79 - 2.8f, byq4);
        float f83 = f77 + f80 + 6.0f;
        float f84 = f82 - 6.0f;
        float f85 = Math.max(10.0f, f84 - f83);
        bzth2.drawRoundedRect(f83, f79 - 1.5f, f85, 3.0f, zth_8.all(1.5f), byq8);
        float f86 = Math.max(0.0f, f85 * f76);
        if (f86 > 0.0f) {
            zth_8 zth4 = f86 >= f85 - 2.0f ? zth_8.all(1.5f) : zth_8.left(1.5f, 1.5f);
            bzth2.drawRoundedRect(f83, f79 - 1.5f, f86, 3.0f, zth4, byq7);
        }
        float f87 = f83 + f85 * f76;
        bzth2.drawRoundedRect(f87 - 3.5f, f79 - 3.5f, 7.0f, 7.0f, zth_8.all(3.5f), dmth.thzz_4(f5));
        bzth2.drawRoundedRect(f87 - 2.5f, f79 - 2.5f, 5.0f, 5.0f, zth_8.all(2.5f), byq7);
        boolean bl16 = bl = this.bdf || bhh.zzy_3(f83 - 2.0f, f79 - 6.0f, f85 + 4.0f, 12.0, bzth2);
        if (bl) {
            zw.hdhth(bay_2.mw);
        }
    }

    private void renderAddFriendModal(bzth bzth2) {
        byq byq2;
        byq byq3;
        this.baz.dam_2(!this.sdht_4 ? jkh.hd_2 : jkh.hthd);
        this.baz.khmf(this.sdht_4 ? 0.0f : 1.0f);
        float f = this.baz.tssh_2();
        float f2 = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        if (f2 <= 0.01f && this.sdht_4) {
            this.thsd_3 = false;
            return;
        }
        if (this.jzth_2 && this.hha_2 == bjj.khshh_2) {
            this.swa = (float)bzth2.getMouseX() - this.jtm_2;
            this.bjth = (float)bzth2.getMouseY() - this.thlw;
        }
        float f3 = 130.0f;
        float f4 = 36.0f;
        float f5 = this.swa;
        float f6 = this.bjth;
        float f7 = 0.5f + Math.max(0.0f, f) * 0.5f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq4 = bnn.dzb_2().dhdhk(f5);
        byq byq5 = bl ? new byq(20.0f, 20.0f, 23.0f, 255.0f) : dmth;
        byq byq6 = bl ? new byq(36.0f, 36.0f, 42.0f, 255.0f) : new byq(222.0f, 222.0f, 226.0f, 255.0f);
        byq byq7 = bl ? dmth : new byq(32.0f, 32.0f, 36.0f, 255.0f);
        byq byq8 = byq3 = bl ? new byq(30.0f, 30.0f, 35.0f, 255.0f) : new byq(232.0f, 232.0f, 234.0f, 255.0f);
        byq byq9 = this.zrk.zqr_2() ? byq4 : (bl ? new byq(45.0f, 45.0f, 52.0f, 255.0f) : new byq(210.0f, 210.0f, 214.0f, 255.0f));
        byq byq10 = bl ? new byq(150.0f, 150.0f, 160.0f, 255.0f) : new byq(156.0f, 163.0f, 175.0f, 255.0f);
        bzth2.pushMatrix();
        shk_3.bdhkh(bzth2.method_51448(), f5 + f3 / 2.0f, f6 + f4 / 2.0f, f7);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
        bzth2.drawShadow(f5, f6, f3, f4, 14.0f, zth_8.all(6.0f), bhj_2.bdhj.thzz_4(0.2f * f2));
        if (!bl) {
            bzth2.drawRoundedRect(f5, f6, f3, f4, zth_8.all(6.0f), byq6.thzz_4(f2));
            bzth2.drawRoundedRect(f5 + 0.8f, f6 + 0.8f, f3 - 1.6f, f4 - 1.6f, zth_8.all(5.2f), byq5.thzz_4(f2));
        } else {
            bzth2.drawRoundedRect(f5, f6, f3, f4, zth_8.all(6.0f), byq5.thzz_4(f2));
        }
        float f8 = f5 + 4.0f;
        float f9 = f6 + 4.0f;
        float f10 = f3 - 21.0f;
        float f11 = 13.5f;
        bzth2.drawRoundedRect(f8, f9, f10, f11, zth_8.all(3.0f), byq9.thzz_4(f2));
        bzth2.drawRoundedRect(f8 + 0.8f, f9 + 0.8f, f10 - 1.6f, f11 - 1.6f, zth_8.all(2.5f), byq3.thzz_4(f2));
        this.zrk.ss_4(f8 + 2.0f);
        this.zrk.raj(f9 + 0.5f);
        this.zrk.rbz_2(f10 - 4.0f);
        this.zrk.snsh_2(f11 - 1.0f);
        this.zrk.bsz(byq7);
        this.zrk.dhtz(bzth2);
        float f12 = f5 + f3 - 13.0f;
        float f13 = f6 + 3.5f;
        float f14 = 9.0f;
        boolean bl2 = bhh.zzy_3(f12 - 2.0f, f13 - 2.0f, f14 + 4.0f, f14 + 4.0f, bzth2);
        byq byq11 = bl2 ? new byq(248.0f, 80.0f, 80.0f, 255.0f) : new byq(239.0f, 68.0f, 68.0f, 255.0f);
        bzth2.drawRoundedRect(f12, f13, f14, f14, zth_8.all(f14 / 2.0f), byq11.thzz_4(f2));
        bzth2.drawTexture(bss_4, f12 + 1.8f, f13 + 1.8f, f14 - 3.6f, f14 - 3.6f, dmth.thzz_4(f2));
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        float f15 = f5 + 6.0f;
        float f16 = f6 + 23.0f;
        bzth2.drawText(bmn.shmz.twy_2(6.8f), "Trusted", f15, f16, byq10.thzz_4(f2));
        float f17 = f5 + f3 - 15.0f;
        float f18 = f6 + 21.0f;
        float f19 = 10.5f;
        boolean bl3 = bhh.zzy_3(f17 - 2.0f, f18 - 2.0f, f19 + 4.0f, f19 + 4.0f, bzth2);
        byq byq12 = this.sdy_2 ? (bl ? new byq(18.0f, 18.0f, 22.0f, 255.0f) : new byq(24.0f, 24.0f, 27.0f, 255.0f)) : (byq2 = bl ? new byq(26.0f, 26.0f, 30.0f, 255.0f) : new byq(232.0f, 232.0f, 234.0f, 255.0f));
        byq byq13 = this.sdy_2 ? (bl ? new byq(55.0f, 55.0f, 65.0f, 255.0f) : new byq(24.0f, 24.0f, 27.0f, 255.0f)) : (bl ? new byq(45.0f, 45.0f, 52.0f, 255.0f) : new byq(200.0f, 200.0f, 204.0f, 255.0f));
        bzth2.drawRoundedRect(f17, f18, f19, f19, zth_8.all(2.5f), byq13.thzz_4(f2));
        bzth2.drawRoundedRect(f17 + 0.8f, f18 + 0.8f, f19 - 1.6f, f19 - 1.6f, zth_8.all(2.0f), byq2.thzz_4(f2));
        if (this.sdy_2) {
            bzth2.drawTexture(bl_2, f17 + 1.2f, f18 + 1.2f, f19 - 2.4f, f19 - 2.4f, dmth.thzz_4(f2));
        }
        if (bl3) {
            zw.hdhth(bay_2.mw);
        }
        bzth2.popMatrix();
    }

    public void openKeybindPopup(bsd_3 bsd2_2, float f, float f2) {
        this.shdhz_2 = bsd2_2;
        this.dhkhs_2 = true;
        this.rb = false;
        this.sykh = false;
        this.thry = false;
        this.dhda_4.dam_2(jkh.hd_2);
        this.dhda_4.zkhdh((long)bnn.dzb_2().art());
        this.dhda_4.atth_2(0.0f);
        this.bkhl.atth_2(bsd2_2.zhz_7().rgha_2() ? 1.0f : 0.0f);
        this.dsgh.atth_2(bsd2_2.zhz_7().shzr() ? 1.0f : 0.0f);
        float f3 = 120.0f;
        float f4 = 48.0f;
        float f5 = mc.method_22683().method_4486();
        float f6 = mc.method_22683().method_4502();
        this.jdz_4 = class_3532.method_15363((float)(f - f3 / 2.0f), (float)10.0f, (float)(f5 - f3 - 10.0f));
        this.dhka_2 = class_3532.method_15363((float)(f2 - f4 / 2.0f), (float)10.0f, (float)(f6 - f4 - 10.0f));
    }

    private void renderKeybindPopup(bzth bzth2) {
        String string;
        float f;
        this.dhda_4.dam_2(!this.rb ? jkh.hd_2 : jkh.hthd);
        this.dhda_4.zkhdh((long)bnn.dzb_2().art());
        this.dhda_4.khmf(this.rb ? 0.0f : 1.0f);
        float f2 = this.dhda_4.tssh_2();
        float f3 = class_3532.method_15363((float)f2, (float)0.0f, (float)1.0f);
        if (this.rb && f2 <= 0.01f) {
            this.dhkhs_2 = false;
            this.rb = false;
            this.shdhz_2 = null;
            this.sykh = false;
            return;
        }
        if (this.shdhz_2 == null) {
            return;
        }
        bsb bsb2 = this.shdhz_2.zhz_7();
        if (this.thry) {
            this.jdz_4 = (float)bzth2.getMouseX() - this.shdr_2;
            this.dhka_2 = (float)bzth2.getMouseY() - this.sghb;
        }
        float f4 = 120.0f;
        float f5 = 48.0f;
        float f6 = this.jdz_4;
        float f7 = this.dhka_2;
        float f8 = 0.5f + Math.max(0.0f, f2) * 0.5f;
        bzth2.pushMatrix();
        shk_3.bdhkh(bzth2.method_51448(), f6 + f4 / 2.0f, f7 + f5 / 2.0f, f8);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(13.0f, 13.0f, 14.5f, 255.0f) : dmth;
        bzth2.drawShadow(f6, f7 + 2.0f, f4, f5, 8.0f, zth_8.all(5.0f), bhj_2.bdhj.thzz_4(0.25f * f3));
        bzth2.drawRoundedRect(f6, f7, f4, f5, zth_8.all(5.0f), byq2.thzz_4(f3));
        float f9 = 5.5f;
        float f10 = f6 + f4 - 9.5f;
        float f11 = f7 + 4.5f;
        boolean bl2 = bhh.zzy_3((double)f10 - 1.5, (double)f11 - 1.5, (double)f9 + 3.0, (double)f9 + 3.0, bzth2);
        byq byq3 = bl2 ? new byq(248.0f, 113.0f, 113.0f, 255.0f) : new byq(239.0f, 68.0f, 68.0f, 255.0f);
        bzth2.drawRoundedRect(f10, f11, f9, f9, zth_8.all(f9 / 2.0f), byq3.thzz_4(f3));
        bzth2.drawCenteredText(bmn.shmz.twy_2(4.5f), "×", f10 + f9 / 2.0f, f11 + 0.3f, dmth.thzz_4(f3));
        if (bl2) {
            zw.hdhth(bay_2.mw);
        }
        float f12 = f = f6 + 8.5f;
        float f13 = f7 + 8.5f;
        byq byq4 = bl ? dmth : new byq(100.0f, 100.0f, 100.0f, 255.0f);
        bzth2.drawText(bmn.sdha_2.twy_2(7.2f), bsb2.getName(), f12, f13, byq4.thzz_4(f3));
        float f14 = bmn.sdha_2.twy_2(7.2f).dak(bsb2.getName());
        float f15 = f + f14 + 6.0f;
        float f16 = f7 + 7.5f;
        float f17 = 18.0f;
        float f18 = 9.0f;
        this.bkhl.khmf(bsb2.rgha_2() ? 1.0f : 0.0f);
        float f19 = this.bkhl.tssh_2();
        byq byq5 = bl ? new byq(45.0f, 45.0f, 50.0f, 255.0f) : new byq(185.0f, 185.0f, 185.0f, 255.0f);
        byq byq6 = bnn.dzb_2().dhdhk(f15);
        byq byq7 = byq5.dkhw_2(byq6, f19);
        bzth2.drawRoundedRect(f15, f16, f17, f18, zth_8.all(f18 / 2.0f), byq7.thzz_4(f3));
        float f20 = 6.6f;
        float f21 = f15 + 1.2f + f19 * (f17 - f20 - 2.4f);
        float f22 = f16 + 1.2f;
        bzth2.drawShadow(f21, f22, f20, f20, 2.5f, zth_8.all(f20 / 2.0f), bhj_2.bdhj.thzz_4(0.15f * f3));
        bzth2.drawRoundedRect(f21, f22, f20, f20, zth_8.all(f20 / 2.0f), dmth.thzz_4(f3));
        if (bhh.zzy_3(f15, f16, f17, f18, bzth2)) {
            zw.hdhth(bay_2.mw);
        }
        float f23 = f;
        float f24 = f7 + 21.5f;
        byq byq8 = bl ? new byq(140.0f, 144.0f, 154.0f, 255.0f) : new byq(141.0f, 141.0f, 141.0f, 255.0f);
        bzth2.drawText(bmn.shzth.twy_2(6.0f), "Keybind", f23, f24, byq8.thzz_4(f3));
        if (this.sykh) {
            string = "...";
        } else if (!bsb2.jmr() || bsb2.thaf() == 0 || bsb2.thaf() == -1) {
            string = "n/a";
        } else {
            string = bsd_3.ghdha(bsb2.thaf());
            if (string.isEmpty()) {
                string = "n/a";
            }
        }
        trd trd2 = bmn.sdha_2.twy_2(5.5f);
        float f25 = trd2.dak(string);
        float f26 = Math.max(13.0f, f25 + 5.0f);
        float f27 = 9.0f;
        float f28 = f + bmn.shzth.twy_2(6.0f).dak("Keybind") + 5.0f;
        float f29 = f7 + 20.0f;
        byq byq9 = this.sykh ? new byq(245.0f, 158.0f, 11.0f, 255.0f) : (bl ? new byq(36.0f, 36.0f, 42.0f, 255.0f) : new byq(54.0f, 54.0f, 54.0f, 255.0f));
        boolean bl3 = bhh.zzy_3(f28, f29, f26, f27, bzth2);
        if (bl3) {
            byq9 = byq9.dkhw_2(dmth, 0.15f);
            zw.hdhth(bay_2.mw);
        }
        bzth2.drawRoundedRect(f28, f29, f26, f27, zth_8.all(2.0f), byq9.thzz_4(f3));
        bzth2.drawCenteredText(trd2, string, f28 + f26 / 2.0f, f29 + 1.8f, dmth.thzz_4(f3));
        float f30 = f;
        float f31 = f7 + 34.5f;
        bzth2.drawText(bmn.shzth.twy_2(6.0f), "Keybind type", f30, f31, byq8.thzz_4(f3));
        boolean bl4 = bsb2.shzr();
        float f32 = f + bmn.shzth.twy_2(6.0f).dak("Keybind type") + 6.0f;
        float f33 = f7 + 34.5f;
        byq byq10 = bl ? dmth : new byq(25.0f, 25.0f, 25.0f, 255.0f);
        byq byq11 = !bl4 ? byq10 : byq8;
        bzth2.drawText(!bl4 ? bmn.sdha_2.twy_2(6.0f) : bmn.shzth.twy_2(6.0f), "Toggle", f32, f33, byq11.thzz_4(f3));
        float f34 = f32 + bmn.sdha_2.twy_2(6.0f).dak("Toggle") + 4.0f;
        float f35 = f7 + 33.5f;
        float f36 = 18.0f;
        float f37 = 9.0f;
        this.dsgh.khmf(bl4 ? 1.0f : 0.0f);
        float f38 = this.dsgh.tssh_2();
        byq byq12 = bl ? new byq(45.0f, 45.0f, 50.0f, 255.0f) : new byq(185.0f, 185.0f, 185.0f, 255.0f);
        bzth2.drawRoundedRect(f34, f35, f36, f37, zth_8.all(f37 / 2.0f), byq12.thzz_4(f3));
        float f39 = f34 + 1.2f + f38 * (f36 - f20 - 2.4f);
        float f40 = f35 + 1.2f;
        bzth2.drawShadow(f39, f40, f20, f20, 2.5f, zth_8.all(f20 / 2.0f), bhj_2.bdhj.thzz_4(0.15f * f3));
        bzth2.drawRoundedRect(f39, f40, f20, f20, zth_8.all(f20 / 2.0f), dmth.thzz_4(f3));
        float f41 = f34 + f36 + 4.0f;
        float f42 = f7 + 34.5f;
        byq byq13 = bl4 ? byq10 : byq8;
        bzth2.drawText(bl4 ? bmn.sdha_2.twy_2(6.2f) : bmn.shzth.twy_2(6.2f), "Hold", f41, f42, byq13.thzz_4(f3));
        boolean bl5 = bhh.zzy_3(f32 - 2.0f, f35 - 2.0f, f41 + 18.0f - f32, f37 + 4.0f, bzth2);
        if (bl5) {
            zw.hdhth(bay_2.mw);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bzth2.popMatrix();
    }

    private void render404(bzth bzth2, float f, float f2, float f3, float f4, String string, float f5) {
        float f6 = f + f3 / 2.0f;
        float f7 = f2 + f4 / 2.0f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = (bl ? dmth : jss_3).thzz_4(f5);
        bzth2.drawTexture(Moondlc.id("textures/iconpack/404.png"), f6 - 18.0f, f7 - 36.0f, 36.0f, 36.0f, byq2);
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(9.5f), string, f6, f7 + 8.0f, byq2);
        bzth2.drawCenteredText(bmn.shzth.twy_2(7.5f), "Check back in the next update \ud83d\ude0e", f6, f7 + 22.0f, thyt_2.thzz_4(f5));
    }

    private void renderEmpty(bzth bzth2, float f, float f2, float f3, float f4, class_2960 class_29602, String string, String string2, float f5) {
        float f6 = f + f3 / 2.0f;
        float f7 = f2 + f4 / 2.0f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = (bl ? dmth : jss_3).thzz_4(f5);
        byq byq3 = (bl ? dmth : thyt_2).thzz_4(f5);
        bzth2.drawTexture(class_29602, f6 - 22.0f, f7 - 34.0f, 44.0f, 44.0f, byq3);
        bzth2.drawCenteredText(bmn.sdha_2.twy_2(10.0f), string, f6, f7 + 16.0f, byq2);
        bzth2.drawCenteredText(bmn.shzth.twy_2(7.5f), string2, f6, f7 + 30.0f, thyt_2.thzz_4(f5));
    }

    private void handleMovementKeys() {
        class_304[] class_304Array;
        if (tkhd.mc.field_1724 == null || this.isTyping()) {
            return;
        }
        long l = mc.method_22683().method_4490();
        for (class_304 class_3042 : class_304Array = new class_304[]{tkhd.mc.field_1690.field_1894, tkhd.mc.field_1690.field_1881, tkhd.mc.field_1690.field_1913, tkhd.mc.field_1690.field_1849, tkhd.mc.field_1690.field_1903}) {
            if (class_3042 == null) continue;
            try {
                String exception = class_3042.method_1428();
                class_3675.class_306 class_3062 = class_3675.method_15981((String)exception);
                int n = class_3062.method_1444();
                class_304.method_1416((class_3675.class_306)class_3062, (boolean)class_3675.method_15987((long)l, (int)n));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (tkhd.mc.field_1724.method_31549().field_7479) {
            try {
                String exception = tkhd.mc.field_1690.field_1832.method_1428();
                class_3675.class_306 class_3063 = class_3675.method_15981((String)exception);
                int n = class_3063.method_1444();
                class_304.method_1416((class_3675.class_306)class_3063, (boolean)class_3675.method_15987((long)l, (int)n));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private boolean isTyping() {
        return tkhd.mc.field_1755 != null && baa_2.dhrh != null && baa_2.dhrh.zqr_2();
    }

    @Override
    public void onMouseClicked(double d, double d2, tthdh tthdh2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        for (Object object : this.dah_2) {
            boolean bl = ((br)object).dzw_3();
            ((br)object).dh_4(d, d2, tthdh2);
            if (((nt_3)object).shrh(d, d2) || bl) {
                return;
            }
            ((br)object).jwd(false);
        }
        for (Object object : this.sdf) {
            for (bsd_3 bsd2_2 : ((thq_3)object).hhsh_2()) {
                if (!bsd2_2.jghh()) continue;
                bsd2_2.zhz_7().zhs_5(tthdh2.getButtonIndex());
                bsd2_2.sdz_2(false);
                return;
            }
        }
        for (Object object : this.dya) {
            ((tshr)object).dh_4(d, d2, tthdh2);
            if (!((nt_3)object).shrh(d, d2)) continue;
            return;
        }
        for (Object object : this.rrs) {
            ((bdk_2)object).dh_4(d, d2, tthdh2);
            if (!((nt_3)object).shrh(d, d2)) continue;
            return;
        }
        float f30 = this.dhkhgh.khdb_2();
        float f31 = this.dhkhgh.sw();
        float f32 = this.dnq.tssh_2();
        float f33 = f32 - 35.0f;
        float f34 = f30 - f33 / 2.0f;
        float f35 = f34 + 10.0f;
        float f36 = f31 + 8.0f;
        float f37 = 22.0f;
        if (this.dhkhs_2 && this.shdhz_2 != null) {
            float f38 = this.jdz_4;
            float f39 = this.dhka_2;
            float f40 = 120.0f;
            float f41 = 48.0f;
            bsb bsb2 = this.shdhz_2.zhz_7();
            if (this.sykh) {
                int n = tthdh2.getButtonIndex() - 100;
                bsb2.zhs_5(n);
                this.sykh = false;
                return;
            }
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2((double)(f38 + f40) - 13.0, (double)f39 + 2.0, 11.0, 10.0, d, d2)) {
                this.rb = true;
                return;
            }
            float f42 = f38 + 8.5f;
            float f43 = bmn.sdha_2.twy_2(7.2f).dak(bsb2.getName());
            float f44 = f42 + f43 + 6.0f;
            float f45 = f39 + 7.5f;
            float f46 = 18.0f;
            float f47 = 9.0f;
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2((double)f44 - 1.0, (double)f45 - 1.0, (double)f46 + 2.0, (double)f47 + 2.0, d, d2)) {
                bsb2.dwkh();
                return;
            }
            String string = !bsb2.jmr() || bsb2.thaf() == 0 || bsb2.thaf() == -1 ? "n/a" : bsd_3.ghdha(bsb2.thaf());
            trd trd2 = bmn.sdha_2.twy_2(5.5f);
            float f48 = Math.max(13.0f, trd2.dak(string) + 5.0f);
            float f49 = 9.0f;
            float f50 = f42 + bmn.shzth.twy_2(6.0f).dak("Keybind") + 5.0f;
            float f51 = f39 + 20.0f;
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2((double)f50 - 1.0, (double)f51 - 1.0, (double)f48 + 2.0, (double)f49 + 2.0, d, d2)) {
                this.sykh = true;
                return;
            }
            float f52 = f42 + bmn.shzth.twy_2(6.0f).dak("Keybind type") + 6.0f;
            float f53 = f52 + bmn.sdha_2.twy_2(6.0f).dak("Toggle") + 4.0f;
            float f54 = f39 + 33.5f;
            float f55 = 9.0f;
            float f56 = f53 + 18.0f + 4.0f;
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2((double)f52 - 2.0, (double)f54 - 1.5, f56 + 16.0f - f52, (double)f55 + 3.0, d, d2)) {
                bsb2.thshdh(!bsb2.shzr());
                return;
            }
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f38, f39, f40, 10.0, d, d2)) {
                this.thry = true;
                this.shdr_2 = (float)d - f38;
                this.sghb = (float)d2 - f39;
                return;
            }
            if (bhh.thsb_2(f38, f39, f40, f41, d, d2)) {
                return;
            }
            this.rb = true;
            return;
        }
        if (this.thzb) {
            float f57 = 260.0f;
            float f58 = 220.0f;
            float f59 = tdw.shjh() / 2.0f - f57 / 2.0f;
            float f60 = tdw.thfq() / 2.0f - f58 / 2.0f;
            float f61 = f59 + f57 / 2.0f - 48.0f;
            float f62 = f60 + 38.0f;
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f61, f62, 96.0, 96.0, d, d2)) {
                this.khas_4 = true;
                return;
            }
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f59 + 42.0f, f60 + 178.0f, 52.0, 20.0, d, d2)) {
                this.sdhn = 1.0f;
                this.zst_3 = 0.0f;
                this.sdhh_2 = 0.0f;
                this.updateCroppedConfigThumbnail();
                return;
            }
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f59 + f57 - 94.0f, f60 + 178.0f, 52.0, 20.0, d, d2)) {
                this.saveConfigThumbnailToSelected();
                this.dhkgh = true;
                this.khas_4 = false;
                return;
            }
            if (bhh.thsb_2(f59, f60, f57, f58, d, d2)) {
                return;
            }
            this.dhkgh = true;
            return;
        }
        if (this.rf) {
            float f63 = 260.0f;
            float f64 = 220.0f;
            float f65 = tdw.shjh() / 2.0f - f63 / 2.0f;
            float f66 = tdw.thfq() / 2.0f - f64 / 2.0f;
            float f67 = f65 + f63 / 2.0f - 48.0f;
            float f68 = f66 + 42.0f;
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f67, f68, 96.0, 96.0, d, d2)) {
                this.rj = true;
                return;
            }
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f65 + 42.0f, f66 + 178.0f, 52.0, 20.0, d, d2)) {
                this.tfb = 1.0f;
                this.thfth = 0.0f;
                this.jshz = 0.0f;
                this.updateCroppedAvatar();
                return;
            }
            if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f65 + f63 - 94.0f, f66 + 178.0f, 52.0, 20.0, d, d2)) {
                this.dhdsh = true;
                this.rj = false;
                this.saveProfileState();
                return;
            }
            if (bhh.thsb_2(f65, f66, f63, f64, d, d2)) {
                return;
            }
            this.dhdsh = true;
            return;
        }
        if (this.rha_3) {
            f29 = f30 + 38.0f;
            f28 = f31 + 390.0f - 52.0f;
            float f69 = 145.0f;
            float f70 = 44.0f;
            float f71 = f29 + f69 - 9.5f;
            f27 = f28 + 4.5f;
            float f72 = 5.5f;
            if (bhh.thsb_2((double)f71 - 1.5, (double)f27 - 1.5, (double)f72 + 3.0, (double)f72 + 3.0, d, d2)) {
                this.khzdh = true;
                this.blurProfileFields();
                this.saveProfileState();
                return;
            }
            f26 = f28 + 19.5f;
            f25 = f69 - 17.0f;
            f24 = 15.0f;
            if (bhh.thsb_2((double)f29 + 8.5, f26, f25, f24, d, d2)) {
                this.focusOnly(this.dhndh);
                this.dhndh.dh_4(d, d2, tthdh2);
                return;
            }
            if (bhh.thsb_2(f29, f28, f69, f70, d, d2)) {
                return;
            }
            this.khzdh = true;
            this.blurProfileFields();
            this.saveProfileState();
        }
        f29 = f36 + f37 + 8.0f;
        f28 = f29 + 10.0f + 12.0f;
        trt[] trtArray = new trt[]{trt.tht_4, trt.rqq, trt.shsth_2, trt.khbdh, trt.swl};
        for (trt trt2 : trtArray) {
            if (bhh.thsb_2(f34, f28, f32, 13.0, d, d2)) {
                if (this.khlsh != trt2 || this.hha_2 != bjj.rff) {
                    khw.sah_2.play(0.8f);
                }
                this.hha_2 = bjj.rff;
                this.khlsh = trt2;
                this.bqa.zdhl();
                this.thj_2 = null;
                return;
            }
            f28 += 14.0f;
        }
        f28 += 18.0f;
        bjj[] bjjArray = new bjj[]{bjj.rdy, bjj.khshh_2, bjj.bts_3, bjj.bsd};
        for (Enum enum_ : bjjArray) {
            if (bhh.thsb_2(f34, f28, f32, 13.0, d, d2)) {
                if (this.hha_2 != enum_) {
                    khw.sah_2.play(0.8f);
                }
                this.hha_2 = enum_;
                this.bqa.zdhl();
                this.thj_2 = null;
                return;
            }
            f28 += 14.0f;
        }
        float f73 = f31 + 390.0f - 30.0f;
        float f74 = class_3532.method_15363((float)((f32 - 35.0f) / 80.0f), (float)0.0f, (float)1.0f);
        float f75 = (1.0f - f74) * -12.0f;
        if (tthdh2 == tthdh.tdha_2 && bhh.thsb_2(f34, f73 - 3.0f, f32, 27.0, d, d2)) {
            this.cycleProfileStatus();
            return;
        }
        if (tthdh2 == tthdh.dhhz_4 && bhh.thsb_2(f34, f73 - 3.0f, f32, 27.0, d, d2)) {
            this.rha_3 = true;
            this.khzdh = false;
            this.ddd_2.atth_2(0.0f);
            return;
        }
        float f76 = f34 + f32 + 12.0f;
        f27 = 541.0f;
        f25 = f31 + 14.0f;
        f24 = f25 + 36.0f;
        if (this.bsht != null && this.shwh != null && this.hha_2 == bjj.rff && bhh.thsb_2(this.bsht.shjgh(), this.bsht.stk(), this.bsht.thbkh(), this.bsht.jfn(), d, d2)) {
            this.bsht.dh_4(d, d2, tthdh2);
            return;
        }
        if (this.hha_2 == bjj.rdy) {
            f26 = bmn.shmz.twy_2(13.0f).dma().dzh_3("Configs", 13.0f);
            f23 = f76 + f26 + 10.0f;
            if (bhh.thsb_2(f23, f22 = f25 - 1.0f, f21 = 110.0f, f20 = 16.0f, d, d2)) {
                this.focusOnly(this.shhd_4);
                this.shhd_4.dh_4(d, d2, tthdh2);
                return;
            }
            f19 = f23 + f21 + 6.0f;
            f18 = f22;
            f17 = 16.0f;
            if (bhh.thsb_2(f19, f18, f17, f17, d, d2)) {
                if (tthdh2 == tthdh.tdha_2) {
                    try {
                        File file = new File(bdhb.dhdhd_2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        class_156.method_668().method_672(file);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                return;
            }
            f16 = f19 + f17 + 6.0f;
            f15 = f22;
            f14 = 16.0f;
            if (bhh.thsb_2(f16, f15, f14, f14, d, d2)) {
                if (tthdh2 == tthdh.tdha_2) {
                    if (this.hrz) {
                        this.tbgh = true;
                    } else {
                        this.hrz = true;
                        this.tbgh = false;
                        this.gh.atth_2(0.0f);
                        this.shzz_3 = f76 + f27 / 2.0f - 72.5f;
                        this.dha_6 = f25 + 30.0f;
                        this.dhas.ghthd();
                        this.shkhh.ghthd();
                        this.focusOnly(this.dhas);
                    }
                }
                return;
            }
        } else if (this.hha_2 == bjj.khshh_2 && bhh.thsb_2(f26 = f76 + bmn.shmz.twy_2(13.0f).dma().dzh_3("Friends", 13.0f) + 8.0f, f23 = f25 - 1.0f, f22 = 16.0f, f22, d, d2)) {
            if (tthdh2 == tthdh.tdha_2) {
                if (this.thsd_3) {
                    this.sdht_4 = true;
                } else {
                    this.thsd_3 = true;
                    this.sdht_4 = false;
                    this.baz.atth_2(0.0f);
                    this.swa = f76 + 130.0f;
                    this.bjth = f25 - 4.0f;
                    this.zrk.ghthd();
                    this.focusOnly(this.zrk);
                }
            }
            return;
        }
        if (this.hha_2 == bjj.sdhl && this.zzf_2 != null) {
            if (bhh.thsb_2(f76, f25, 52.0, 16.0, d, d2)) {
                this.hha_2 = bjj.rff;
                this.jnm.clear();
                this.thj_2 = null;
                this.tta_4 = null;
                this.rws_2 = null;
                return;
            }
            f26 = f30 + 600.0f - 14.0f - 34.0f;
            f23 = f25 + 22.0f;
            if (bhh.thsb_2(f26, f23, 26.0, 14.0, d, d2) && tthdh2 == tthdh.tdha_2) {
                this.zzf_2.zhz_7().dwkh();
                return;
            }
            for (bdhw bdhw2 : this.zzf_2.zhz_7().dty()) {
                khd khd2;
                if (!(bdhw2 instanceof khd) || !this.dlgh.getOrDefault(khd2 = (khd)bdhw2, false).booleanValue()) continue;
                Float f77 = (Float)this.dzh_2.get(khd2);
                Float f78 = (Float)this.shkhn.get(khd2);
                Float f79 = (Float)this.thra_2.get(khd2);
                if (f77 == null || f78 == null || f79 == null) continue;
                f16 = 15.0f;
                f15 = f78.floatValue() + 16.0f + 2.0f;
                f14 = (float)khd2.jsw().size() * f16 + 4.0f;
                if (!bhh.thsb_2(f77.floatValue(), f15, f79.floatValue(), f14, d, d2) || tthdh2 != tthdh.tdha_2) continue;
                float f80 = f15 + 2.0f;
                for (fy fy2 : khd2.jsw()) {
                    if (bhh.thsb_2(f77.floatValue(), f80, f79.floatValue(), f16, d, d2)) {
                        fy2.rhh_3();
                        this.dlgh.put(khd2, false);
                        return;
                    }
                    f80 += f16;
                }
                return;
            }
            float f81 = f25 + 56.0f + 4.0f;
            float f82 = (float)(-this.rghgh.shtt_4());
            float f83 = f81 + f82;
            for (bdhw bdhw3 : this.zzf_2.zhz_7().dty()) {
                if (!bdhw3.tsa_5()) continue;
                float f84 = this.getRowHeight(bdhw3);
                if (bdhw3 instanceof badh_2) {
                    badh_2 badh2 = (badh_2)bdhw3;
                    if (bhh.thsb_2(f76, f83, f27, f84, d, d2) && tthdh2 == tthdh.tdha_2) {
                        badh2.dwkh();
                        return;
                    }
                } else if (bdhw3 instanceof tay) {
                    tay tay2 = (tay)bdhw3;
                    float f85 = f76 + 10.0f;
                    float f86 = f27 - 20.0f;
                    float f87 = f83 + 22.0f;
                    if (bhh.thsb_2(f76 + 10.0f, f83 + 16.0f, f27 - 20.0f, 14.0, d, d2) && tthdh2 == tthdh.tdha_2) {
                        var54_192 = (float)((d - (double)f85) / (double)f86);
                        var54_192 = Math.max(0.0f, Math.min(1.0f, var54_192));
                        tay2.shjl(tay2.alz_2() + var54_192 * (tay2.sdhh_4() - tay2.alz_2()));
                        this.thj_2 = tay2;
                        return;
                    }
                } else if (bdhw3 instanceof tshd) {
                    tshd tshd2 = (tshd)bdhw3;
                    float f88 = f76 + 10.0f;
                    float f89 = f83 + 22.0f;
                    float f90 = f27 - 20.0f;
                    if (bhh.thsb_2(f88, (double)f89 - 6.0, f90, 14.0, d, d2) && tthdh2 == tthdh.tdha_2) {
                        var54_192 = class_3532.method_15363((float)((float)((d - (double)f88) / (double)f90)), (float)0.0f, (float)1.0f);
                        float f91 = tshd2.tdh_6() + var54_192 * (tshd2.ghjdh() - tshd2.tdh_6());
                        float f92 = Math.abs(f91 - tshd2.dhdb_2());
                        float f93 = Math.abs(f91 - tshd2.aghm());
                        this.tta_4 = tshd2;
                        int n = this.dfm = f92 <= f93 ? 1 : 2;
                        if (this.dfm == 1) {
                            tshd2.thkt_2(Math.min(f91, tshd2.aghm()));
                        } else {
                            tshd2.ghbw(Math.max(f91, tshd2.dhdb_2()));
                        }
                        return;
                    }
                } else if (bdhw3 instanceof khd) {
                    khd khd3 = (khd)bdhw3;
                    Float f94 = (Float)this.dzh_2.get(khd3);
                    Float f95 = (Float)this.shkhn.get(khd3);
                    Float f96 = (Float)this.thra_2.get(khd3);
                    if (f94 != null && f95 != null && f96 != null && bhh.thsb_2(f94.floatValue(), f95.floatValue(), f96.floatValue(), 16.0, d, d2) && tthdh2 == tthdh.tdha_2) {
                        this.dlgh.put(khd3, this.dlgh.getOrDefault(khd3, false) == false);
                        return;
                    }
                } else if (bdhw3 instanceof bbd_2) {
                    bbd_2 bbd2 = (bbd_2)bdhw3;
                    float f97 = f76 + 10.0f;
                    float f98 = f83 + 18.0f;
                    float f99 = 16.0f;
                    var54_192 = f76 + f27 - 10.0f;
                    for (s_3 s2 : bbd2.zskh_3()) {
                        String string = this.formatSettingName(s2.getName());
                        var58_208 = bmn.sdha_2.twy_2(7.5f).dak(string) + 14.0f;
                        if (f97 + var58_208 > var54_192) {
                            f97 = f76 + 10.0f;
                            f98 += f99 + 4.0f;
                        }
                        if (bhh.thsb_2(f97, f98, var58_208, f99, d, d2) && tthdh2 == tthdh.tdha_2) {
                            s2.thst();
                            return;
                        }
                        f97 += var58_208 + 5.0f;
                    }
                } else if (bdhw3 instanceof ts_4) {
                    ts_4 ts2 = (ts_4)bdhw3;
                    float f100 = 110.0f;
                    float f101 = f76 + f27 - f100 - 10.0f;
                    float f102 = 16.0f;
                    var54_192 = f83 + (f84 - f102) / 2.0f;
                    if (bhh.thsb_2(f101, var54_192, f100, f102, d, d2) && tthdh2 == tthdh.tdha_2) {
                        this.rws_2 = ts2;
                        return;
                    }
                } else if (bdhw3 instanceof fw_2) {
                    fw_2 fw2 = (fw_2)bdhw3;
                    float f103 = f76 + 10.0f;
                    var54_192 = f83 + 4.0f;
                    float f104 = f27 - 20.0f;
                    float f105 = 20.0f;
                    if (bhh.thsb_2(f103, var54_192, f104, f105, d, d2) && tthdh2 == tthdh.tdha_2) {
                        if (fw2.dqt() != null) {
                            fw2.dqt().run();
                        }
                        return;
                    }
                } else if (bdhw3 instanceof bzw_2) {
                    bzw_2 bzw2_2 = (bzw_2)bdhw3;
                    if (this.shln == bzw2_2) {
                        float f106 = f83 + 30.0f;
                        float f107 = f76 + 18.0f;
                        float f108 = f106 + 8.0f;
                        var54_192 = f27 - 36.0f;
                        float f109 = 56.0f;
                        float f110 = f107;
                        float f111 = f108 + f109 + 5.0f;
                        var58_208 = var54_192;
                        float f112 = 8.0f;
                        float f113 = f111 + f112 + 4.0f;
                        float f114 = 8.0f;
                        if (bhh.thsb_2(f107, f108, var54_192, f109, d, d2) && tthdh2 == tthdh.tdha_2) {
                            this.sdr_3 = 0;
                            this.bzh_3[1] = class_3532.method_15363((float)(((float)d - f107) / var54_192), (float)0.0f, (float)1.0f);
                            this.bzh_3[2] = 1.0f - class_3532.method_15363((float)(((float)d2 - f108) / f109), (float)0.0f, (float)1.0f);
                            int n = Color.HSBtoRGB(this.bzh_3[0], this.bzh_3[1], this.bzh_3[2]);
                            bzw2_2.zmgh(new byq(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, bzw2_2.sdsh_4().tzdh_2()));
                            return;
                        }
                        if (bhh.thsb_2(f110, f111, var58_208, f112, d, d2) && tthdh2 == tthdh.tdha_2) {
                            this.sdr_3 = 1;
                            this.bzh_3[0] = class_3532.method_15363((float)(((float)d - f110) / var58_208), (float)0.0f, (float)1.0f);
                            int n = Color.HSBtoRGB(this.bzh_3[0], this.bzh_3[1], this.bzh_3[2]);
                            bzw2_2.zmgh(new byq(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, bzw2_2.sdsh_4().tzdh_2()));
                            return;
                        }
                        if (bzw2_2.shf_4() && bhh.thsb_2(f110, f113, var58_208, f114, d, d2) && tthdh2 == tthdh.tdha_2) {
                            this.sdr_3 = 2;
                            float f115 = class_3532.method_15363((float)(((float)d - f110) / var58_208), (float)0.0f, (float)1.0f);
                            bzw2_2.zmgh(new byq(bzw2_2.sdsh_4().sbk(), bzw2_2.sdsh_4().srl(), bzw2_2.sdsh_4().shsl_2(), f115 * 255.0f));
                            return;
                        }
                    }
                    if (bhh.thsb_2(f76, f83, f27, 26.0, d, d2) && tthdh2 == tthdh.tdha_2) {
                        if (this.shln == bzw2_2) {
                            this.shln = null;
                        } else {
                            this.shln = bzw2_2;
                            byq byq2 = bzw2_2.sdsh_4();
                            Color.RGBtoHSB((int)byq2.sbk(), (int)byq2.srl(), (int)byq2.shsl_2(), this.bzh_3);
                        }
                        return;
                    }
                } else if (bdhw3 instanceof bdh_3) {
                    bdh_3 bdh2_2 = (bdh_3)bdhw3;
                    if (bhh.thsb_2(f76, f83, f27, 26.0, d, d2) && tthdh2 == tthdh.tdha_2) {
                        this.dhdb = this.dhdb == bdh2_2 ? null : bdh2_2;
                        return;
                    }
                }
                f83 += f84 + 4.0f;
            }
            return;
        }
        if (tthdh2 != tthdh.khhr) {
            f26 = f34 + f32 + 12.0f;
            f22 = f26;
            f21 = f25 - 2.0f;
            f23 = 120.0f;
            if (bhh.thsb_2(f22, f21, f23, 16.0, d, d2) && tthdh2 == tthdh.tdha_2) {
                this.focusOnly(this.shhd_4);
                this.shhd_4.dby(true);
            }
            this.shhd_4.dh_4(d, d2, tthdh2);
            this.dhas.dh_4(d, d2, tthdh2);
            this.jkhth.dh_4(d, d2, tthdh2);
            this.shkhh.dh_4(d, d2, tthdh2);
            this.khkm.dh_4(d, d2, tthdh2);
            this.zrk.dh_4(d, d2, tthdh2);
        }
        if (this.ght_2 && this.hha_2 == bjj.rdy && !this.rta_2) {
            f26 = this.bdhth;
            f23 = this.ad_2;
            f22 = 250.0f;
            f21 = 184.0f;
            if (bhh.thsb_2(f26 + 50.0f, f23 + 30.0f, f22 - 62.0f, 16.0, d, d2)) {
                this.focusOnly(this.syd_2);
                this.syd_2.dh_4(d, d2, tthdh2);
                return;
            }
            if (bhh.thsb_2(f26 + 50.0f, f23 + 50.0f, f22 - 62.0f, 16.0, d, d2)) {
                this.focusOnly(this.hsa_3);
                this.hsa_3.dh_4(d, d2, tthdh2);
                return;
            }
            if (bhh.thsb_2(f26 + 50.0f, f23 + 70.0f, f22 - 62.0f, 16.0, d, d2)) {
                this.focusOnly(this.sa_2);
                this.sa_2.dh_4(d, d2, tthdh2);
                return;
            }
            if (bhh.thsb_2(f26 + 50.0f, f23 + 90.0f, f22 - 62.0f, 16.0, d, d2)) {
                this.focusOnly(this.hrj);
                this.hrj.dh_4(d, d2, tthdh2);
                return;
            }
            if (bhh.thsb_2(f26, f23, f22, 25.0, d, d2) && !bhh.thsb_2(f26 + f22 - 18.0f, (double)f23 + 7.5, 10.0, 10.0, d, d2)) {
                this.shrh = true;
                this.tnl = (float)d - f26;
                this.ttha = (float)d2 - f23;
                return;
            }
            if (bhh.thsb_2(f26 + f22 - 18.0f, (double)f23 + 7.5, 10.0, 10.0, d, d2)) {
                this.rta_2 = true;
                return;
            }
            f20 = f23 + 112.0f;
            f19 = f23 + 132.0f;
            f18 = 16.0f;
            f17 = (f22 - 30.0f) / 2.0f;
            if (this.sjq_2 != null && bhh.thsb_2(f26 + 10.0f, f20, f17, f18, d, d2)) {
                List list;
                String string = this.syd_2.dwq().trim().replace("\"", "");
                String string2 = this.hsa_3.dwq().trim();
                String string3 = this.sa_2.dwq().trim();
                String string4 = this.hrj.dwq().trim().replace("\"", "");
                List list2 = list = string3.isEmpty() ? Collections.emptyList() : Arrays.stream(string3.split(",")).map(String::trim).filter(tkhd::lambda$onMouseClicked$26).collect(Collectors.toList());
                if (!string.isEmpty() && !string.equalsIgnoreCase(this.sjq_2.thkgh())) {
                    this.renameSelectedConfig();
                }
                if (this.sjq_2 != null) {
                    this.sjq_2.hghh_2();
                    this.sjq_2.twh(string2, list, string4);
                    Moondlc.getInstance().getConfigManager().dhtw_2();
                }
                return;
            }
            if (bhh.thsb_2(f26 + 20.0f + f17, f20, f17, f18, d, d2)) {
                this.renameSelectedConfig();
                return;
            }
            if (this.sjq_2 != null && bhh.thsb_2(f26 + 10.0f, f19, f17, f18, d, d2)) {
                this.sjq_2.dsa_5();
                return;
            }
            if (this.sjq_2 != null && bhh.thsb_2(f26 + 20.0f + f17, f19, f17, f18, d, d2)) {
                this.sjq_2.jtz_3();
                Moondlc.getInstance().getConfigManager().dhtw_2();
                this.rta_2 = true;
                return;
            }
            if (bhh.thsb_2(f26, f23, f22, f21, d, d2)) {
                return;
            }
            this.rta_2 = true;
        }
        if (this.hrz && this.hha_2 == bjj.rdy && !this.tbgh) {
            f13 = this.shzz_3;
            f12 = this.dha_6;
            f11 = 145.0f;
            f10 = 82.0f;
            f26 = f11 - 17.0f;
            f23 = 14.0f;
            if (bhh.thsb_2((double)f13 + 8.5, (double)f12 + 19.5, f26, f23, d, d2)) {
                this.focusOnly(this.dhas);
                this.dhas.dh_4(d, d2, tthdh2);
                return;
            }
            if (bhh.thsb_2((double)f13 + 8.5, (double)f12 + 36.5, f26, f23, d, d2)) {
                this.focusOnly(this.shkhh);
                this.shkhh.dh_4(d, d2, tthdh2);
                return;
            }
            f20 = f13 + 8.5f;
            f19 = f12 + 54.5f;
            f22 = f26;
            f21 = 14.0f;
            if (bhh.thsb_2(f20, f19, f22, f21, d, d2)) {
                List list;
                String string = this.dhas.dwq().trim();
                String string5 = this.shkhh.dwq().trim();
                List list3 = list = string5.isEmpty() ? Collections.emptyList() : Arrays.stream(string5.split(",")).map(String::trim).filter(tkhd::lambda$onMouseClicked$27).limit(3L).collect(Collectors.toList());
                if (!string.isEmpty()) {
                    Moondlc.getInstance().getConfigManager().thsj(string, "", list, "");
                    this.dhas.ghthd();
                    this.shkhh.ghthd();
                    Moondlc.getInstance().getNotificationManager().khdhz_2(qk.zhh_2, "Config created: " + string);
                }
                this.tbgh = true;
                return;
            }
            f17 = f13 + f11 - 9.5f;
            f16 = f12 + 4.5f;
            f18 = 5.5f;
            if (bhh.thsb_2((double)f17 - 1.5, (double)f16 - 1.5, (double)f18 + 3.0, (double)f18 + 3.0, d, d2)) {
                this.tbgh = true;
                return;
            }
            if (bhh.thsb_2(f13, f12, f11, 18.0, d, d2)) {
                this.thbt = true;
                this.tght_2 = (float)d - f13;
                this.thsd = (float)d2 - f12;
                return;
            }
            if (bhh.thsb_2(f13, f12, f11, f10, d, d2)) {
                return;
            }
        }
        if (this.thsd_3 && this.hha_2 == bjj.khshh_2 && !this.sdht_4) {
            f13 = this.swa;
            f12 = this.bjth;
            f11 = 130.0f;
            f10 = 36.0f;
            f26 = f13 + f11 - 13.0f;
            f23 = f12 + 3.5f;
            f22 = 9.0f;
            if (bhh.thsb_2(f26 - 3.0f, f23 - 3.0f, f22 + 6.0f, f22 + 6.0f, d, d2)) {
                this.sdht_4 = true;
                return;
            }
            f21 = f13 + 4.0f;
            f20 = f12 + 4.0f;
            f19 = f11 - 21.0f;
            f18 = 13.5f;
            if (bhh.thsb_2(f21, f20, f19, f18, d, d2)) {
                this.focusOnly(this.zrk);
                this.zrk.dh_4(d, d2, tthdh2);
                return;
            }
            if (bhh.thsb_2(f13 + 4.0f, f12 + 18.0f, f11 - 8.0f, 16.0, d, d2)) {
                this.sdy_2 = !this.sdy_2;
                return;
            }
            if (bhh.thsb_2(f13, f12, f11, f10, d, d2)) {
                if (tthdh2 == tthdh.tdha_2) {
                    this.jzth_2 = true;
                    this.jtm_2 = (float)d - f13;
                    this.thlw = (float)d2 - f12;
                }
                return;
            }
        }
        if (this.hha_2 == bjj.rdy) {
            List list = Moondlc.getInstance().getConfigManager().dbh_2();
            String string = this.shhd_4.dwq().trim().toLowerCase();
            if (!string.isEmpty()) {
                list = list.stream().filter(arg_0 -> tkhd.lambda$onMouseClicked$28(string, arg_0)).collect(Collectors.toList());
            }
            f22 = 8.0f;
            f21 = (f27 - f22 * 2.0f) / 3.0f;
            f20 = 0.0f;
            f19 = (float)(-this.bqa.shtt_4());
            f18 = f25 + 20.0f;
            f17 = 390.0f - (f18 - f31) - 10.0f;
            f16 = 48.0f;
            String string6 = Moondlc.getInstance().getConfigManager().dhth_3();
            for (bjk bjk2 : new ArrayList(list)) {
                float f116 = f76 + f20 * (f21 + f22);
                float f117 = f18 + f19;
                if (f117 + f16 > f18 && f117 < f18 + f17) {
                    boolean bl = bjk2.thkgh().equalsIgnoreCase(string6);
                    String string7 = bl ? "Update" : "Load";
                    f9 = bmn.dhsth_2.twy_2(6.0f).dak("");
                    f8 = bmn.sdha_2.twy_2(5.5f).dak(string7);
                    f7 = f9 + f8 + 10.0f;
                    f6 = 12.0f;
                    f5 = f116 + f21 - f7 - 6.0f;
                    float f118 = f117 + 30.0f;
                    f4 = bmn.dhsth_2.twy_2(6.5f).dak("");
                    f3 = f5 - f4 - 6.0f;
                    f2 = f118 + 4.0f;
                    if (bhh.thsb_2(f5, f118, f7, f6, d, d2)) {
                        if (tthdh2 == tthdh.tdha_2) {
                            if (bl) {
                                bjk2.hghh_2();
                                Moondlc.getInstance().getNotificationManager().khdhz_2(qk.zhh_2, "Config updated: " + bjk2.thkgh());
                            } else {
                                bjk2.dsa_5();
                            }
                        }
                        return;
                    }
                    if (bhh.thsb_2(f3 - 2.0f, f2 - 2.0f, f4 + 4.0f, 13.0, d, d2)) {
                        if (tthdh2 == tthdh.tdha_2) {
                            bjk2.jtz_3();
                            Moondlc.getInstance().getNotificationManager().khdhz_2(qk.shtdh_2, "Config deleted: " + bjk2.thkgh());
                        }
                        return;
                    }
                    if (bhh.thsb_2(f116, f117, f21, f16, d, d2)) {
                        if (tthdh2 == tthdh.tdha_2) {
                            bjk2.dsa_5();
                        } else if (tthdh2 == tthdh.dhhz_4) {
                            this.openConfigActions(bjk2, (float)d, (float)d2);
                        }
                        return;
                    }
                }
                if (!((f20 += 1.0f) >= 3.0f)) continue;
                f20 = 0.0f;
                f19 += f16 + f22;
            }
        }
        if (this.hha_2 == bjj.khshh_2) {
            kh_3 kh2 = Moondlc.getInstance().getFriendManager();
            List list = kh2.hkha_2();
            String string = this.shhd_4.dwq().trim().toLowerCase();
            List list4 = list;
            if (!string.isEmpty()) {
                list4 = list.stream().filter(arg_0 -> this.lambda$onMouseClicked$29(string, list, arg_0)).collect(Collectors.toList());
            }
            f20 = 8.0f;
            f19 = (f27 - f20) / 2.0f;
            f18 = 0.0f;
            f17 = (float)(-this.bqa.shtt_4());
            f16 = 36.0f;
            float f119 = f25 + 20.0f;
            boolean bl = false;
            for (int i = 0; i < list4.size(); ++i) {
                String string8 = (String)list4.get(i);
                int n = list.indexOf(string8);
                float f120 = f76 + f18 * (f19 + f20);
                float f121 = f119 + f17;
                if (bhh.thsb_2(f120, f121, f19, f16, d, d2)) {
                    bl = true;
                }
                if (string8.equals(this.tfs) && bhh.thsb_2(f8 = f120 + (f9 = 25.0f) + 8.0f, (double)f121 + 1.5, f7 = f19 - (f8 - f120) - 20.0f, 14.0, d, d2)) {
                    this.focusOnly(this.bghdh);
                    this.bghdh.dh_4(d, d2, tthdh2);
                    return;
                }
                f9 = 9.5f;
                f8 = f120 + f19 - f9 - 6.5f - 2.0f;
                f7 = f121 + 5.5f - 2.0f;
                if (bhh.thsb_2(f8, f7, (double)f9 + 4.0, (double)f9 + 4.0, d, d2)) {
                    kh2.jjm(string8);
                    tkhj.remove(string8);
                    bghs_2.remove(string8);
                    this.saveFriendMeta();
                    if (string8.equals(this.tfs)) {
                        this.tfs = null;
                    }
                    return;
                }
                f6 = 25.0f;
                f5 = f120 + f6 + 8.0f;
                String string9 = this.getFriendDisplayName(string8, n);
                f4 = bmn.shmz.twy_2(8.5f).dak(string9);
                f3 = f5 + f4 + 3.5f;
                if (bhh.thsb_2((double)f3 - 2.0, (double)(f2 = f121 + 5.0f) - 2.0, (double)(f = 7.5f) + 4.0, (double)f + 4.0, d, d2)) {
                    this.tfs = string8;
                    this.setFieldText(this.bghdh, string9);
                    this.focusOnly(this.bghdh);
                    this.bghdh.dby(true);
                    return;
                }
                if (!((f18 += 1.0f) >= 2.0f)) continue;
                f18 = 0.0f;
                f17 += f16 + f20;
            }
            if (this.tfs != null) {
                String string10 = this.bghdh.dwq().trim();
                if (!string10.isEmpty()) {
                    tkhj.put(this.tfs, string10);
                } else {
                    tkhj.remove(this.tfs);
                }
                this.saveFriendMeta();
                this.tfs = null;
                this.bghdh.dby(false);
            }
            if (!bl && tthdh2 == tthdh.tdha_2 && !this.thsd_3 && bhh.thsb_2(f76, (double)f25 + 20.0, f27, 350.0, d, d2)) {
                this.thsd_3 = true;
                this.sdht_4 = false;
                this.baz.atth_2(0.0f);
                this.swa = f76 + 130.0f;
                this.bjth = f25 - 4.0f;
                this.zrk.ghthd();
                this.focusOnly(this.zrk);
                return;
            }
        }
        if (this.hha_2 == bjj.rff) {
            float f122 = 16.0f;
            float f123 = this.zlkh.tssh_2();
            float f124 = (f27 - 6.0f) / 2.0f;
            float f125 = (f27 - f122) * 0.44f;
            boolean bl = this.shwh != null || f123 > 0.001f;
            f19 = f76;
            f18 = f25 + 38.0f;
            f17 = bl ? f124 + (f125 - f124) * f123 : f27;
            f16 = 390.0f - (f18 - f31) - 10.0f;
            boolean bl2 = bl;
            if (bhh.thsb_2(f19, f18, f17, f16, d, d2)) {
                List list;
                boolean bl3;
                boolean bl4 = bl3 = !this.shhd_4.dwq().trim().isEmpty();
                if (bl3) {
                    list = new ArrayList();
                    for (thq_3 thq2 : this.sdf) {
                        list.addAll(thq2.hhsh_2());
                    }
                } else {
                    thq_3 thq3 = this.sdf.stream().filter(this::lambda$onMouseClicked$30).findFirst().orElse(null);
                    List list4 = list = thq3 != null ? thq3.hhsh_2() : Collections.emptyList();
                }
                if (!list.isEmpty()) {
                    int n = bl2 ? 1 : 2;
                    float f126 = bl2 ? f17 : (f17 - 6.0f) / 2.0f;
                    float f127 = 0.0f;
                    float f128 = (float)(-this.bqa.shtt_4());
                    for (bsd_3 bsd3_2 : list) {
                        float f38;
                        if (this.searchHides(bsd3_2)) continue;
                        f7 = f19 + f127 * (f126 + 6.0f);
                        f6 = f18 + f128;
                        f5 = 34.0f;
                        bsd3_2.amf(f7, f6, f126, f5);
                        if (f6 + f5 > f18 && f6 < f18 + f16 && bhh.thsb_2(f7, f6, f126, f5, d, d2)) {
                            bsd3_2.dh_4(d, d2, tthdh2);
                            return;
                        }
                        f127 += 1.0f;
                        if (!(f38 >= (float)n)) continue;
                        f127 = 0.0f;
                        f128 += 40.0f;
                    }
                }
                return;
            }
        }
        if (this.hha_2 == bjj.bts_3 && tthdh2 == tthdh.tdha_2) {
            float f130;
            float f131;
            bnn bnn2 = bnn.dzb_2();
            float f132 = f34 + f32 + 12.0f;
            float f133 = 541.0f;
            float f134 = f31 + 14.0f;
            float f135 = f134 + 20.0f;
            f19 = 8.0f;
            f18 = Math.round((f133 - f19 * 2.0f) * 0.31f);
            f17 = Math.round((f133 - f19 * 2.0f) * 0.38f);
            f16 = f133 - f19 * 2.0f - f18 - f17;
            float f136 = f132;
            float f137 = f132 + f18 + f19;
            float f138 = f137 + f17 + f19;
            float f139 = f135;
            float f140 = f135;
            float f141 = f135;
            float f142 = (f18 - 26.0f) / 2.0f;
            f9 = 36.0f;
            f8 = f136 + 10.0f;
            f7 = f139 + 33.0f;
            f6 = f8 + f142 + 6.0f;
            if (bhh.thsb_2(f8, f7, f142, f9, d, d2)) {
                bnn2.ahkh(false);
                return;
            }
            if (bhh.thsb_2(f6, f7, f142, f9, d, d2)) {
                bnn2.ahkh(true);
                return;
            }
            f5 = 84.0f;
            float f143 = f136;
            f4 = f139 + f5 + 8.0f;
            f3 = f143 + 10.0f;
            f2 = f4 + 34.0f;
            f = f2 + 4.0f;
            float f144 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Speed", 7.0f);
            String string = (int)bnn2.hmdh() + "ms";
            float f145 = f3 + f144 + 6.0f;
            float f146 = bmn.shzth.twy_2(6.5f).dma().dzh_3(string, 6.5f);
            float f147 = f143 + f18 - 10.0f - f146 - 6.0f;
            float f148 = Math.max(10.0f, f147 - f145);
            if (bhh.thsb_2(f145 - 4.0f, f - 6.0f, f148 + 8.0f, 15.0, d, d2)) {
                float f149 = (float)Math.max(0.0, Math.min(1.0, (d - (double)f145) / (double)f148));
                bnn2.syr(10.0f + f149 * 290.0f);
                this.khqs_2 = true;
                return;
            }
            float f150 = f137 + 10.0f;
            float f151 = f140 + 34.0f;
            byq[] byqArray = bnn.khla_2;
            float f152 = (f17 - 20.0f - 12.0f * (float)byqArray.length) / (float)Math.max(1, byqArray.length - 1);
            for (int i = 0; i < byqArray.length; ++i) {
                f131 = f150 + (float)i * (12.0f + f152);
                if (!bhh.thsb_2(f131 - 2.0f, f151 - 2.0f, 16.0, 16.0, d, d2)) continue;
                bnn2.khghz(byqArray[i]);
                return;
            }
            float f153 = f137 + 10.0f;
            f131 = f140 + 52.0f;
            float f154 = (f17 - 26.0f) / 2.0f;
            if (bhh.thsb_2(f153, f131 + 8.0f, f154, 15.0, d, d2)) {
                boolean bl = false;
                for (br br2 : this.dah_2) {
                    if (!"Primary Accent".equals(br2.rqz()) || !br2.ztq_4()) continue;
                    br2.jwd(false);
                    bl = true;
                }
                if (!bl) {
                    this.dah_2.clear();
                    br br3 = new br(f153, f131 + 28.0f, 2.0f, false, bnn2.kb(), "Primary Accent");
                    this.dah_2.add(br3);
                }
                return;
            }
            if (bhh.thsb_2(f153 + f154 + 6.0f, f131 + 8.0f, f154, 15.0, d, d2)) {
                boolean bl = false;
                for (br br4 : this.dah_2) {
                    if (!"Secondary Accent".equals(br4.rqz()) || !br4.ztq_4()) continue;
                    br4.jwd(false);
                    bl = true;
                }
                if (!bl) {
                    this.dah_2.clear();
                    br br5 = new br(f153 + f154 + 6.0f, f131 + 28.0f, 2.0f, false, bnn2.rha_3(), "Secondary Accent");
                    this.dah_2.add(br5);
                }
                return;
            }
            float f155 = f137 + f17 - 28.0f;
            float f156 = f131 + 27.0f;
            if (bhh.thsb_2(f155, f156, 20.0, 11.0, d, d2)) {
                bnn2.sdha_2(!bnn2.sns());
                return;
            }
            float f157 = f141 + 32.0f;
            float f158 = 18.0f;
            float f159 = (f16 - 23.0f) / 2.0f;
            zy_2[] zyArray = zy_2.values();
            for (int i = 0; i < zyArray.length; ++i) {
                f130 = f138 + 10.0f + (float)i * (f159 + 3.0f);
                if (!bhh.thsb_2(f130, f157, f159, f158, d, d2)) continue;
                bnn2.shwr(zyArray[i]);
                return;
            }
            float f160 = f138 + 10.0f;
            f130 = f141 + 54.0f;
            float f161 = f130 + 4.0f;
            float f162 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Speed", 7.0f);
            String string11 = (int)bnn2.art() + "ms";
            float f163 = f160 + f162 + 6.0f;
            float f164 = bmn.shzth.twy_2(6.5f).dma().dzh_3(string11, 6.5f);
            float f165 = f138 + f16 - 10.0f - f164 - 6.0f;
            float f166 = Math.max(10.0f, f165 - f163);
            if (bhh.thsb_2(f163 - 4.0f, f161 - 6.0f, f166 + 8.0f, 15.0, d, d2)) {
                float f167 = (float)Math.max(0.0, Math.min(1.0, (d - (double)f163) / (double)f166));
                bnn2.khnb(100.0f + f167 * 900.0f);
                this.hmdh = true;
                return;
            }
            float f168 = f138;
            float f169 = f141 + 72.0f + 8.0f;
            float f170 = f168 + 10.0f;
            float f171 = f169 + 34.0f;
            float f172 = f171 + 4.0f;
            float f173 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Opacity", 7.0f);
            String string12 = (int)bnn2.zda_7() + "%";
            float f174 = f170 + f173 + 6.0f;
            float f175 = bmn.shzth.twy_2(6.5f).dma().dzh_3(string12, 6.5f);
            float f176 = f168 + f16 - 10.0f - f175 - 6.0f;
            float f177 = Math.max(10.0f, f176 - f174);
            if (bhh.thsb_2(f174 - 4.0f, f172 - 6.0f, f177 + 8.0f, 15.0, d, d2)) {
                float f178 = (float)Math.max(0.0, Math.min(1.0, (d - (double)f174) / (double)f177));
                bnn2.hkh_4(f178 * 100.0f);
                this.bdf = true;
                return;
            }
            if (bhh.thsb_2(f132, f134, f133, 460.0, d, d2)) {
                return;
            }
        }
        if (tthdh2 == tthdh.tdha_2 && bhh.dfw_2(this.dhkhgh, d, d2)) {
            this.shhh_3 = true;
            this.dhghb = (float)(d - (double)this.dhkhgh.khdb_2());
            this.rzy = (float)(d2 - (double)this.dhkhgh.sw());
        }
        super.onMouseClicked(d, d2, tthdh2);
    }

    @Override
    public void onMouseDragged(double d, double d2, tthdh tthdh2, double d3, double d4) {
        if (this.dhkhs_2 && this.thry && tthdh2 == tthdh.tdha_2) {
            this.jdz_4 = (float)d - this.shdr_2;
            this.dhka_2 = (float)d2 - this.sghb;
            return;
        }
        if (this.thsd_3 && this.jzth_2 && tthdh2 == tthdh.tdha_2 && this.hha_2 == bjj.khshh_2) {
            this.swa = (float)d - this.jtm_2;
            this.bjth = (float)d2 - this.thlw;
            return;
        }
        if (this.rf && this.rj && tthdh2 == tthdh.tdha_2) {
            this.thfth += (float)d3;
            this.jshz += (float)d4;
            this.updateCroppedAvatar();
            return;
        }
        if (this.thzb && this.khas_4 && tthdh2 == tthdh.tdha_2) {
            this.zst_3 += (float)d3;
            this.sdhh_2 += (float)d4;
            this.updateCroppedConfigThumbnail();
            return;
        }
        if (this.khqs_2 && tthdh2 == tthdh.tdha_2 && this.hha_2 == bjj.bts_3) {
            float f = this.dnq.tssh_2();
            float f2 = this.dhkhgh.khdb_2() - (f - 35.0f) / 2.0f + f + 12.0f;
            float f3 = 541.0f;
            float f4 = 8.0f;
            float f5 = Math.round((f3 - f4 * 2.0f) * 0.31f);
            float f6 = f2 + 10.0f;
            float f7 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Speed", 7.0f);
            String string = (int)bnn.dzb_2().hmdh() + "ms";
            float f8 = bmn.shzth.twy_2(6.5f).dma().dzh_3(string, 6.5f);
            float f9 = f6 + f7 + 6.0f;
            float f10 = f2 + f5 - 10.0f - f8 - 6.0f;
            float f11 = Math.max(10.0f, f10 - f9);
            float f12 = (float)Math.max(0.0, Math.min(1.0, (d - (double)f9) / (double)f11));
            bnn.dzb_2().syr(10.0f + f12 * 290.0f);
            return;
        }
        if (this.hmdh && tthdh2 == tthdh.tdha_2 && this.hha_2 == bjj.bts_3) {
            float f = this.dnq.tssh_2();
            float f13 = this.dhkhgh.khdb_2() - (f - 35.0f) / 2.0f + f + 12.0f;
            float f14 = 541.0f;
            float f15 = 8.0f;
            float f16 = Math.round((f14 - f15 * 2.0f) * 0.31f);
            float f17 = Math.round((f14 - f15 * 2.0f) * 0.38f);
            float f18 = f14 - f15 * 2.0f - f16 - f17;
            float f19 = f13 + f16 + f15 + f17 + f15;
            float f20 = f19 + 10.0f;
            float f21 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Speed", 7.0f);
            String string = (int)bnn.dzb_2().art() + "ms";
            float f22 = bmn.shzth.twy_2(6.5f).dma().dzh_3(string, 6.5f);
            float f23 = f20 + f21 + 6.0f;
            float f24 = f19 + f18 - 10.0f - f22 - 6.0f;
            float f25 = Math.max(10.0f, f24 - f23);
            float f26 = (float)Math.max(0.0, Math.min(1.0, (d - (double)f23) / (double)f25));
            bnn.dzb_2().khnb(100.0f + f26 * 900.0f);
            return;
        }
        if (this.bdf && tthdh2 == tthdh.tdha_2 && this.hha_2 == bjj.bts_3) {
            float f;
            float f27 = this.dnq.tssh_2();
            float f28 = this.dhkhgh.khdb_2() - (f27 - 35.0f) / 2.0f + f27 + 12.0f;
            float f29 = 541.0f;
            float f30 = 8.0f;
            float f31 = Math.round((f29 - f30 * 2.0f) * 0.31f);
            float f32 = Math.round((f29 - f30 * 2.0f) * 0.38f);
            float f33 = f29 - f30 * 2.0f - f31 - f32;
            float f34 = f = f28 + f31 + f30 + f32 + f30;
            float f35 = f34 + 10.0f;
            float f36 = bmn.sdha_2.twy_2(7.0f).dma().dzh_3("Opacity", 7.0f);
            String string = (int)bnn.dzb_2().zda_7() + "%";
            float f37 = bmn.shzth.twy_2(6.5f).dma().dzh_3(string, 6.5f);
            float f38 = f35 + f36 + 6.0f;
            float f39 = f34 + f33 - 10.0f - f37 - 6.0f;
            float f40 = Math.max(10.0f, f39 - f38);
            float f41 = (float)Math.max(0.0, Math.min(1.0, (d - (double)f38) / (double)f40));
            bnn.dzb_2().hkh_4(f41 * 100.0f);
            return;
        }
        for (tshr tshr2 : this.dya) {
            tshr2.sha(d, d2, tthdh2, d3, d4);
        }
        if (this.bsht != null && this.shwh != null && this.hha_2 == bjj.rff) {
            this.bsht.sha(d, d2, tthdh2, d3, d4);
        }
        if (this.hha_2 == bjj.sdhl && tthdh2 == tthdh.tdha_2 && this.zzf_2 != null) {
            float f = this.dhkhgh.khdb_2();
            float f42 = this.dhkhgh.sw();
            float f43 = this.dnq.tssh_2();
            float f44 = f - (f43 - 35.0f) / 2.0f;
            float f45 = f44 + f43 + 12.0f;
            float f46 = 541.0f;
            float f47 = f42 + 14.0f + 56.0f + 4.0f;
            float f48 = (float)(-this.rghgh.shtt_4());
            float f49 = f47 + f48;
            for (bdhw bdhw2 : this.zzf_2.zhz_7().dty()) {
                if (!bdhw2.tsa_5()) continue;
                float f50 = this.getRowHeight(bdhw2);
                if (bdhw2 instanceof tay) {
                    tay tay2 = (tay)bdhw2;
                    var24_65 = f45 + 10.0f;
                    var25_68 = f49 + 22.0f;
                    var26_70 = f46 - 20.0f;
                    if (this.thj_2 == tay2 || bhh.thsb_2(var24_65, (double)var25_68 - 6.0, var26_70, 16.0, d, d2)) {
                        var27_71 = class_3532.method_15363((float)((float)((d - (double)var24_65) / (double)var26_70)), (float)0.0f, (float)1.0f);
                        var28_72 = tay2.alz_2() + var27_71 * (tay2.sdhh_4() - tay2.alz_2());
                        var29_73 = tay2.bzz_3();
                        if (var29_73 > 0.0f) {
                            var28_72 = tay2.alz_2() + (float)Math.round((var28_72 - tay2.alz_2()) / var29_73) * var29_73;
                        }
                        tay2.shjl(var28_72);
                        fa_2 fa2_2 = (fa_2)this.shqh_2.get(tay2);
                        if (fa2_2 != null) {
                            fa2_2.atth_2(var27_71);
                        }
                    }
                } else if (bdhw2 instanceof tshd) {
                    tshd tshd2 = (tshd)bdhw2;
                    var24_65 = f45 + 10.0f;
                    var25_68 = f46 - 20.0f;
                    if (this.tta_4 == tshd2) {
                        var26_70 = class_3532.method_15363((float)((float)((d - (double)var24_65) / (double)var25_68)), (float)0.0f, (float)1.0f);
                        var27_71 = tshd2.tdh_6() + var26_70 * (tshd2.ghjdh() - tshd2.tdh_6());
                        if (this.dfm == 1) {
                            tshd2.thkt_2(Math.min(var27_71, tshd2.aghm()));
                        } else if (this.dfm == 2) {
                            tshd2.ghbw(Math.max(var27_71, tshd2.dhdb_2()));
                        }
                        var28_72 = (tshd2.dhdb_2() - tshd2.tdh_6()) / (tshd2.ghjdh() - tshd2.tdh_6());
                        var29_73 = (tshd2.aghm() - tshd2.tdh_6()) / (tshd2.ghjdh() - tshd2.tdh_6());
                        fa_2 fa3_2 = (fa_2)this.bdh_5.get(tshd2);
                        fa_2 fa4 = (fa_2)this.sja_2.get(tshd2);
                        if (fa3_2 != null) {
                            fa3_2.atth_2(var28_72);
                        }
                        if (fa4 != null) {
                            fa4.atth_2(var29_73);
                        }
                    }
                } else if (bdhw2 == this.shln && this.sdr_3 >= 0 && tthdh2 == tthdh.tdha_2) {
                    var24_65 = f49 + 30.0f;
                    var25_68 = f45 + 18.0f;
                    var26_70 = var24_65 + 8.0f;
                    var27_71 = f46 - 36.0f;
                    var28_72 = 56.0f;
                    var29_73 = var25_68;
                    float f51 = var27_71;
                    if (this.sdr_3 == 0) {
                        this.bzh_3[1] = class_3532.method_15363((float)(((float)d - var25_68) / var27_71), (float)0.0f, (float)1.0f);
                        this.bzh_3[2] = 1.0f - class_3532.method_15363((float)(((float)d2 - var26_70) / var28_72), (float)0.0f, (float)1.0f);
                        int n = Color.HSBtoRGB(this.bzh_3[0], this.bzh_3[1], this.bzh_3[2]);
                        this.shln.zmgh(new byq(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, this.shln.sdsh_4().tzdh_2()));
                    } else if (this.sdr_3 == 1) {
                        this.bzh_3[0] = class_3532.method_15363((float)(((float)d - var29_73) / f51), (float)0.0f, (float)1.0f);
                        int n = Color.HSBtoRGB(this.bzh_3[0], this.bzh_3[1], this.bzh_3[2]);
                        this.shln.zmgh(new byq(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, this.shln.sdsh_4().tzdh_2()));
                    } else if (this.sdr_3 == 2 && this.shln.shf_4()) {
                        float f52 = class_3532.method_15363((float)(((float)d - var29_73) / f51), (float)0.0f, (float)1.0f);
                        this.shln.zmgh(new byq(this.shln.sdsh_4().sbk(), this.shln.sdsh_4().srl(), this.shln.sdsh_4().shsl_2(), f52 * 255.0f));
                    }
                }
                f49 += f50 + 4.0f;
            }
        }
        super.onMouseDragged(d, d2, tthdh2, d3, d4);
    }

    @Override
    public void onMouseReleased(double d, double d2, tthdh tthdh2) {
        if (this.shhh_3) {
            this.shhh_3 = false;
        }
        if (this.thbt) {
            this.thbt = false;
        }
        if (this.jzth_2) {
            this.jzth_2 = false;
        }
        if (this.shrh) {
            this.shrh = false;
        }
        if (this.thry) {
            this.thry = false;
        }
        if (this.khqs_2) {
            this.khqs_2 = false;
        }
        if (this.hmdh) {
            this.hmdh = false;
        }
        if (this.bdf) {
            this.bdf = false;
        }
        if (this.rj) {
            this.rj = false;
            this.saveProfileState();
        }
        if (this.khas_4) {
            this.khas_4 = false;
        }
        this.thj_2 = null;
        this.tta_4 = null;
        this.dfm = 0;
        this.sdr_3 = -1;
        for (nt_3 nt2 : this.dya) {
            ((tshr)nt2).tbkh(d, d2, tthdh2);
        }
        if (this.bsht != null) {
            this.bsht.tbkh(d, d2, tthdh2);
        }
        for (nt_3 nt2 : this.rrs) {
            ((bdk_2)nt2).tbkh(d, d2, tthdh2);
        }
        for (nt_3 nt2 : this.dah_2) {
            ((br)nt2).tbkh(d, d2, tthdh2);
        }
        if (this.shhd_4.zqr_2()) {
            this.shhd_4.tbkh(d, d2, tthdh2);
        }
        if (this.dhas.zqr_2()) {
            this.dhas.tbkh(d, d2, tthdh2);
        }
        if (this.jkhth.zqr_2()) {
            this.jkhth.tbkh(d, d2, tthdh2);
        }
        if (this.shkhh.zqr_2()) {
            this.shkhh.tbkh(d, d2, tthdh2);
        }
        if (this.khkm.zqr_2()) {
            this.khkm.tbkh(d, d2, tthdh2);
        }
        if (this.syd_2.zqr_2()) {
            this.syd_2.tbkh(d, d2, tthdh2);
        }
        if (this.hsa_3.zqr_2()) {
            this.hsa_3.tbkh(d, d2, tthdh2);
        }
        if (this.sa_2.zqr_2()) {
            this.sa_2.tbkh(d, d2, tthdh2);
        }
        if (this.hrj.zqr_2()) {
            this.hrj.tbkh(d, d2, tthdh2);
        }
        if (this.zrk.zqr_2()) {
            this.zrk.tbkh(d, d2, tthdh2);
        }
        if (this.bghdh.zqr_2()) {
            this.bghdh.tbkh(d, d2, tthdh2);
        }
        if (this.btz_2.zqr_2()) {
            this.btz_2.tbkh(d, d2, tthdh2);
        }
        if (this.dhndh.zqr_2()) {
            this.dhndh.tbkh(d, d2, tthdh2);
        }
        super.onMouseReleased(d, d2, tthdh2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.thzb && this.sja_3 != null) {
            this.sdhn = Math.max(0.5f, Math.min(4.0f, this.sdhn + (float)d4 * 0.08f));
            this.updateCroppedConfigThumbnail();
            return true;
        }
        if (this.rf && this.dhby != null) {
            this.tfb = Math.max(0.5f, Math.min(4.0f, this.tfb + (float)d4 * 0.08f));
            this.updateCroppedAvatar();
            this.saveProfileState();
            return true;
        }
        if (this.bsht != null && this.hha_2 == bjj.rff && bhh.thsb_2(this.bsht.shjgh(), this.bsht.stk(), this.bsht.thbkh(), this.bsht.jfn(), d, d2)) {
            this.bsht.dhhw_2(d, d2, d3, d4);
            return true;
        }
        for (nt_3 nt2 : this.dya) {
            ((tshr)nt2).dhhw_2(d, d2, d3, d4);
        }
        for (nt_3 nt2 : this.rrs) {
            nt2.dhhw_2(d, d2, d3, d4);
        }
        if (bhh.dfw_2(this.dhkhgh, d, d2)) {
            if (this.hha_2 == bjj.sdhl) {
                this.rghgh.jhd(d4);
            } else {
                this.bqa.jhd(d4);
            }
        }
        return super.method_25401(d, d2, d3, d4);
    }

    public boolean method_25404(int n, int n2, int n3) {
        Object object;
        Object object2;
        if (this.rws_2 != null) {
            if (n == 256 || n == 257) {
                this.rws_2 = null;
                return true;
            }
            if (n == 259) {
                String string;
                String string2 = string = this.rws_2.dysh() != null ? this.rws_2.dysh() : "";
                if (!string.isEmpty()) {
                    this.rws_2.shsd_2(string.substring(0, string.length() - 1));
                }
                return true;
            }
        }
        if (this.dhkhs_2) {
            if (this.sykh && this.shdhz_2 != null) {
                if (n == 256 || n == 261 || n == 259) {
                    this.shdhz_2.zhz_7().zhs_5(-1);
                } else {
                    this.shdhz_2.zhz_7().zhs_5(n);
                }
                this.sykh = false;
                return true;
            }
            if (n == 256) {
                this.rb = true;
                return true;
            }
        }
        for (Object object3 : this.sdf) {
            object2 = ((thq_3)object3).hhsh_2().iterator();
            while (object2.hasNext()) {
                bsd_3 bsd2_2 = (bsd_3)object2.next();
                if (!bsd2_2.jghh()) continue;
                if (n == 256 || n == 259) {
                    bsd2_2.zhz_7().zhs_5(0);
                } else {
                    bsd2_2.zhz_7().zhs_5(n);
                }
                bsd2_2.sdz_2(false);
                return true;
            }
        }
        if (this.dhdb != null) {
            if (n == 256 || n == 259) {
                this.dhdb.khsh(0);
            } else {
                this.dhdb.khsh(n);
            }
            this.dhdb = null;
            return true;
        }
        if (n == 256 && this.thzb) {
            this.dhkgh = true;
            this.khas_4 = false;
            return true;
        }
        if (n == 256 && this.rf) {
            this.dhdsh = true;
            this.rj = false;
            this.saveProfileState();
            return true;
        }
        if (n == 256 && this.rha_3) {
            this.khzdh = true;
            this.blurProfileFields();
            this.saveProfileState();
            return true;
        }
        if (n == 256 && this.ght_2) {
            this.rta_2 = true;
            this.blurConfigFields();
            return true;
        }
        if (!this.shhd_4.zqr_2() && class_437.method_25441() && n == 70) {
            this.shhd_4.dby(true);
        }
        if (this.hha_2 == bjj.sdhl) {
            this.rghgh.dhqkh(n);
        } else {
            this.bqa.dhqkh(n);
        }
        for (Object object3 : this.dya) {
            ((tshr)object3).bry(n, n2, n3);
        }
        if (this.bsht != null && this.hha_2 == bjj.rff) {
            this.bsht.bry(n, n2, n3);
        }
        for (Object object3 : this.rrs) {
            ((bdk_2)object3).bry(n, n2, n3);
        }
        for (Object object3 : this.dah_2) {
            ((br)object3).bry(n, n2, n3);
        }
        if (this.shhd_4.zqr_2()) {
            this.shhd_4.bry(n, n2, n3);
        }
        if (this.dhas.zqr_2()) {
            if (n == 257) {
                this.focusOnly(this.shkhh);
            } else {
                this.dhas.bry(n, n2, n3);
            }
        }
        if (this.jkhth.zqr_2()) {
            this.jkhth.bry(n, n2, n3);
        }
        if (this.shkhh.zqr_2()) {
            if (n == 257) {
                Object object3;
                object = this.dhas.dwq().trim();
                object3 = this.shkhh.dwq().trim();
                Object object4 = object2 = ((String)object3).isEmpty() ? Collections.emptyList() : Arrays.stream(((String)object3).split(",")).map(String::trim).filter(tkhd::lambda$keyPressed$31).limit(3L).collect(Collectors.toList());
                if (!((String)object).isEmpty()) {
                    Moondlc.getInstance().getConfigManager().thsj((String)object, "", (List)object2, "");
                    this.dhas.ghthd();
                    this.shkhh.ghthd();
                    Moondlc.getInstance().getNotificationManager().khdhz_2(qk.zhh_2, "Config created: " + (String)object);
                    this.tbgh = true;
                }
            } else {
                this.shkhh.bry(n, n2, n3);
            }
        }
        if (this.khkm.zqr_2()) {
            this.khkm.bry(n, n2, n3);
        }
        if (this.syd_2.zqr_2()) {
            if (n == 257) {
                this.renameSelectedConfig();
                this.syd_2.dby(false);
            } else {
                this.syd_2.bry(n, n2, n3);
            }
        }
        if (this.hsa_3.zqr_2()) {
            this.hsa_3.bry(n, n2, n3);
        }
        if (this.sa_2.zqr_2()) {
            this.sa_2.bry(n, n2, n3);
        }
        if (this.hrj.zqr_2()) {
            this.hrj.bry(n, n2, n3);
        }
        if (this.zrk.zqr_2()) {
            if (n == 257) {
                object = this.zrk.dwq().trim();
                if (!((String)object).isEmpty()) {
                    Moondlc.getInstance().getFriendManager().zfz_4((String)object);
                    if (this.sdy_2) {
                        bghs_2.add(object);
                        this.saveFriendMeta();
                    }
                    this.zrk.ghthd();
                }
                this.sdht_4 = true;
                this.zrk.dby(false);
            } else {
                this.zrk.bry(n, n2, n3);
            }
        }
        if (this.bghdh.zqr_2()) {
            if (n == 257) {
                if (this.tfs != null) {
                    object = this.bghdh.dwq().trim();
                    if (!((String)object).isEmpty()) {
                        tkhj.put(this.tfs, object);
                    } else {
                        tkhj.remove(this.tfs);
                    }
                    this.saveFriendMeta();
                    this.tfs = null;
                }
                this.bghdh.dby(false);
            } else {
                this.bghdh.bry(n, n2, n3);
            }
        }
        if (this.jghz_2 || this.btz_2.zqr_2()) {
            this.dhndh.dby(false);
            if (n == 257 || n == 335) {
                this.jghz_2 = false;
                this.btz_2.dby(false);
                if (this.btz_2.dwq().trim().isEmpty()) {
                    this.setFieldText(this.btz_2, "Alya");
                }
                this.saveProfileState();
                return true;
            }
            if (n == 256 && this.jghz_2) {
                this.jghz_2 = false;
                this.btz_2.dby(false);
                this.loadProfileState();
                return true;
            }
            this.btz_2.dby(true);
            this.btz_2.bry(n, n2, n3);
            this.btz_2.dby(true);
            this.saveProfileState();
            return true;
        }
        if (this.dhndh.zqr_2()) {
            if (n == 257 || n == 335) {
                boolean bl = this.loadAvatarFromPath(true);
                if (bl) {
                    Moondlc.getInstance().getNotificationManager().khdhz_2(qk.zhh_2, "Avatar updated!");
                    this.khzdh = true;
                    this.dhndh.dby(false);
                } else {
                    Moondlc.getInstance().getNotificationManager().khdhz_2(qk.tghs, "Failed to load image");
                }
            } else {
                this.dhndh.bry(n, n2, n3);
            }
        }
        return super.method_25404(n, n2, n3);
    }

    public boolean method_25400(char c, int n) {
        boolean bl = false;
        if (this.rws_2 != null && c >= ' ' && c != '\u007f') {
            String string = this.rws_2.dysh() != null ? this.rws_2.dysh() : "";
            this.rws_2.shsd_2(string + c);
            khw.thzgh_2.play(0.7f);
            return true;
        }
        if (this.dhndh.zqr_2()) {
            this.dhndh.thtt_3(c, n);
            this.saveProfileState();
            khw.thzgh_2.play(0.7f);
            return true;
        }
        if (this.shhd_4.zqr_2()) {
            this.shhd_4.thtt_3(c, n);
            bl = true;
        }
        if (this.dhas.zqr_2()) {
            this.dhas.thtt_3(c, n);
            bl = true;
        }
        if (this.jkhth.zqr_2()) {
            this.jkhth.thtt_3(c, n);
            bl = true;
        }
        if (this.shkhh.zqr_2()) {
            this.shkhh.thtt_3(c, n);
            bl = true;
        }
        if (this.khkm.zqr_2()) {
            this.khkm.thtt_3(c, n);
            bl = true;
        }
        if (this.syd_2.zqr_2()) {
            this.syd_2.thtt_3(c, n);
            bl = true;
        }
        if (this.hsa_3.zqr_2()) {
            this.hsa_3.thtt_3(c, n);
            bl = true;
        }
        if (this.sa_2.zqr_2()) {
            this.sa_2.thtt_3(c, n);
            bl = true;
        }
        if (this.hrj.zqr_2()) {
            this.hrj.thtt_3(c, n);
            bl = true;
        }
        if (this.zrk.zqr_2()) {
            this.zrk.thtt_3(c, n);
            bl = true;
        }
        if (this.bghdh.zqr_2()) {
            this.bghdh.thtt_3(c, n);
            bl = true;
        }
        if (bl) {
            khw.thzgh_2.play(0.7f);
        }
        for (nt_3 nt2 : this.dya) {
            if (!((tshr)nt2).thtt_3(c, n)) continue;
            return true;
        }
        if (this.bsht != null && this.hha_2 == bjj.rff && this.bsht.thtt_3(c, n)) {
            return true;
        }
        for (nt_3 nt2 : this.rrs) {
            nt2.thtt_3(c, n);
        }
        for (nt_3 nt2 : this.dah_2) {
            nt2.thtt_3(c, n);
        }
        return super.method_25400(c, n);
    }

    public void method_25419() {
        if (this.khmk) {
            return;
        }
        this.khmk = true;
        this.jghb.dam_2(jkh.hthd);
        this.jghb.zkhdh((long)bnn.dzb_2().art());
        khw.hml.play(0.8f);
        this.thj_2 = null;
        this.khqs_2 = false;
        this.hmdh = false;
        this.bdf = false;
        this.rj = false;
        this.thbt = false;
        this.blurProfileFields();
        this.saveProfileState();
        if (baa_2.dhrh != null) {
            baa_2.dhrh.dby(false);
        }
    }

    public void method_25432() {
        if (!this.khmk) {
            this.method_25419();
        }
    }

    @Override
    public void finishCloseAnimation() {
        if (this.dhdhz_2) {
            return;
        }
        this.dhdhz_2 = true;
        try {
            ((da_2)Moondlc.getInstance().getModuleManager().dfr_2(da_2.class)).tskh_3();
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            ((dha_6)Moondlc.getInstance().getModuleManager().dfr_2(dha_6.class)).tskh_3();
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            ((qd)Moondlc.getInstance().getModuleManager().dfr_2(qd.class)).tskh_3();
        }
        catch (Exception exception) {
            // empty catch block
        }
        Moondlc.getInstance().getFileManager().dsf_2("client");
        if (Moondlc.getInstance().getConfigManager().tzq_4() != null) {
            Moondlc.getInstance().getConfigManager().tzq_4().hghh_2();
        }
        if (baa_2.dhrh != null) {
            baa_2.dhrh.dby(false);
        }
        mc.method_1507((class_437)null);
    }

    private boolean searchHides(bsd_3 bsd2_2) {
        String string = this.shhd_4.dwq();
        if (string == null || string.isBlank()) {
            return false;
        }
        String string2 = string.toLowerCase();
        String string3 = bsd2_2.zhz_7().getName().toLowerCase();
        return !string3.contains(string2) && !string3.replace(" ", "").contains(string2);
    }

    public boolean isBindingModule() {
        return false;
    }

    public boolean method_25421() {
        return false;
    }

    public void renderTooltip(class_332 class_3322, int n, int n2, float f) {
    }

    public boolean method_25422() {
        return true;
    }

    @Generated
    public fh getMenuWindow() {
        return this.dhkhgh;
    }

    @Generated
    public List getWindows() {
        return this.rrs;
    }

    @Generated
    public List getCategories() {
        return this.sdf;
    }

    @Generated
    public List getColorPickers() {
        return this.dah_2;
    }

    @Generated
    public baa_2 getSearchField() {
        return this.shhd_4;
    }

    @Generated
    public bwr getScrollHandler() {
        return this.bqa;
    }

    @Generated
    public trt getCurrentCategory() {
        return this.khlsh;
    }

    @Generated
    public fa_2 getCurrentCategoryAnim() {
        return this.sza;
    }

    @Generated
    public bykh getSearchPenis() {
        return this.thjh;
    }

    @Generated
    public boolean isPrevFocused() {
        return this.zzth;
    }

    @Generated
    public tkhd_2 getTimer() {
        return this.rwz_2;
    }

    public static String getAccountUsername() {
        String string = yf.thwt_2().dzl_4();
        if (string == null || string.isEmpty() || string.equalsIgnoreCase("Offline") || string.equalsIgnoreCase("Unknown")) {
            return "Admin";
        }
        return string;
    }

    public static String getAccountUidFormatted() {
        long l = yf.thwt_2().dhqn();
        if (l <= 0L) {
            return "#001";
        }
        if (l < 10L) {
            return String.format("#%03d", l);
        }
        if (l < 100L) {
            return String.format("#%03d", l);
        }
        return "#" + l;
    }

    private static boolean lambda$keyPressed$31(String string) {
        return !string.isEmpty();
    }

    private boolean lambda$onMouseClicked$30(thq_3 thq2) {
        return thq2.bkhdh() == this.khlsh;
    }

    private boolean lambda$onMouseClicked$29(String string, List list, String string2) {
        return string2.toLowerCase().contains(string) || this.getFriendDisplayName(string2, list.indexOf(string2)).toLowerCase().contains(string);
    }

    private static boolean lambda$onMouseClicked$28(String string, bjk bjk2) {
        return bjk2.thkgh().toLowerCase().contains(string) || bjk2.rhy().toLowerCase().contains(string);
    }

    private static boolean lambda$onMouseClicked$27(String string) {
        return !string.isEmpty();
    }

    private static boolean lambda$onMouseClicked$26(String string) {
        return !string.isEmpty();
    }

    private static fa_2 lambda$getThemeAnim$25(String string) {
        return new fa_2(150L, jkh.jsf);
    }

    private void lambda$getOrFetchFriendAvatar$24(String string) {
        BufferedImage bufferedImage = this.fetchHeadImage(string);
        if (bufferedImage != null) {
            BufferedImage bufferedImage2 = bufferedImage;
            String string2 = string.toLowerCase().replaceAll("[^a-z0-9_]", "");
            if (string2.isEmpty()) {
                string2 = "user";
            }
            class_2960 class_29602 = Moondlc.id("friend_avatar_" + string2);
            mc.execute(() -> tkhd.lambda$getOrFetchFriendAvatar$22(class_29602, bufferedImage2, string));
        } else {
            mc.execute(() -> this.lambda$getOrFetchFriendAvatar$23(string));
        }
    }

    private void lambda$getOrFetchFriendAvatar$23(String string) {
        bfs_2.put(string, this.getSteveHeadTexture());
    }

    private static void lambda$getOrFetchFriendAvatar$22(class_2960 class_29602, BufferedImage bufferedImage, String string) {
        try {
            mc.method_1531().method_4616(class_29602, (class_1044)new class_1043(brd_2.shghdh(bufferedImage, true)));
            bfs_2.put(string, class_29602);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private boolean lambda$renderFriendsContent$21(String string, List list, String string2) {
        return string2.toLowerCase().contains(string) || this.getFriendDisplayName(string2, list.indexOf(string2)).toLowerCase().contains(string);
    }

    private static boolean lambda$renderConfigsContent$20(String string, bjk bjk2) {
        return bjk2.thkgh().toLowerCase().contains(string) || bjk2.rhy().toLowerCase().contains(string);
    }

    private static fa_2 lambda$renderColorRow$19(bzw_2 bzw2_2) {
        return new fa_2(220L, 0.0f, jkh.tb);
    }

    private static fa_2 lambda$renderDropdownOverlay$18(khd khd2) {
        return new fa_2(180L, 0.0f, jkh.tb);
    }

    private static fa_2 lambda$renderRangeRow$17(float f, tshd tshd2) {
        return new fa_2(120L, f, jkh.tb);
    }

    private static fa_2 lambda$renderRangeRow$16(float f, tshd tshd2) {
        return new fa_2(120L, f, jkh.tb);
    }

    private static fa_2 lambda$getOrCreateSliderAnim$15(float f, tay tay2) {
        return new fa_2(150L, f, jkh.tb);
    }

    private static fa_2 lambda$getOrCreateBoolAnim$14(badh_2 badh2, badh_2 badh3) {
        return new fa_2(240L, badh2.shzl() ? 1.0f : 0.0f, jkh.tb);
    }

    private static fa_2 lambda$renderFullSettingsPanel$13(boolean bl, String string) {
        return new fa_2(200L, bl ? 1.0f : 0.0f, jkh.tb);
    }

    private static boolean lambda$renderModuleGrid$12(bsd_3 bsd2_2, bdk_2 bdk2_2) {
        return bdk2_2.ssk_3() == bsd2_2;
    }

    private boolean lambda$renderModuleGrid$11(thq_3 thq2) {
        return thq2.bkhdh() == this.khlsh;
    }

    private static fa_2 lambda$renderSidebar$10(String string) {
        return new fa_2(220L, 0.0f, jkh.tb);
    }

    private static fa_2 lambda$renderSidebar$9(String string) {
        return new fa_2(220L, 0.0f, jkh.tb);
    }

    private static boolean lambda$render$8(br br2) {
        return br2.dha().tssh_2() == 0.0f && !br2.ztq_4();
    }

    private static boolean lambda$render$7(bdk_2 bdk2_2) {
        return bdk2_2.haa_4().tssh_2() == 0.0f && !bdk2_2.thnn();
    }

    private static boolean lambda$render$6(tshr tshr2) {
        return !tshr2.tdd_5() && tshr2.dghf_2().tssh_2() < 0.01f;
    }

    private void lambda$render$5(bzth bzth2, float f, float f2, float f3, float f4, float f5) {
        this.renderEmpty(bzth2, f, f2, f3, f4, thdgh_2, "Cosmetics are coming next update.", "Check back in the next update", f5);
    }

    private static boolean lambda$openFlyingSettingsTab$4(tshr tshr2) {
        return !tshr2.tdd_5() && tshr2.dghf_2().tssh_2() < 0.01f;
    }

    private static boolean lambda$openFloatingSettings$3(bsd_3 bsd2_2, bdk_2 bdk2_2) {
        return bdk2_2.ssk_3() == bsd2_2;
    }

    private static void lambda$new$2() {
    }

    private static bsd_3 lambda$new$1(thq_3 thq2, bsb bsb2) {
        return new bsd_3(bsb2, thq2);
    }

    private static boolean lambda$new$0(trt trt2, bsb bsb2) {
        return bsb2.dkb().equals((Object)trt2.getCategory());
    }

    private static String[] a55folghjwioca(String string) {
        return string.split("\u0006\u001f", -1);
    }

    private static CallSite y7rw1c2jzq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wbfaptso3k4 ^ string.hashCode() ^ n2 + lnnd14l + i * -1853030513) + wbfaptso3k4) ^ lnnd14l));
            }
            String[] stringArray = tkhd.a55folghjwioca(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

