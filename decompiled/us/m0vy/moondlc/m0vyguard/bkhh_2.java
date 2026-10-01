/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.blj;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tzs;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Totem Particle", category=bzw.OTHER, desc="Custom burst when a totem pops")
public class bkhh_2
extends bnq {
    private static final String zthj = "Glow";
    private static final String sk = "Star";
    private static final String tla_2 = "Spark";
    private static final String zss_4 = "Bloom";
    private static final String khnz_2 = "Snowflake";
    private static final String shla = "Heart";
    private static final String thlr = "Rhombus";
    private final tay khmn = new tay(this, "Count").shth_7(Float.intBitsToFloat(-1036986107 - -2114922235)).dhbs_2(Float.intBitsToFloat(Integer.reverse(2096303992) ^ 0x5CB8CF3E)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-1550690974 - 1643271522));
    private final tay shnl = new tay(this, "Size").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x1AFCBD46 ^ 0x7316DB20, 5))).dhbs_2(Float.intBitsToFloat(1305725641 - 247083311)).rkh_3(Float.intBitsToFloat(Integer.reverse(2018084776) ^ 0x29C24514)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xAF950F6A ^ 0x5C3B1B13, 29)));
    private final tay shgh_4 = new tay(this, "Lifetime").shth_7(Float.intBitsToFloat(-1008220413 - -2061829578)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-390856777) ^ 0xADBFCD17)).rkh_3(Float.intBitsToFloat(-1927965876 - 1330169471)).ssd_5(1.0f);
    private final tay baa_2 = new tay(this, "Spread").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x34F28819 ^ 0xDE94EE70, 29))).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xF1923332 ^ 0x9923333, 29))).rkh_3(Float.intBitsToFloat(0xAD0ED7B3 ^ 0x912D00B9)).ssd_5(Float.intBitsToFloat(Integer.reverse(1622766287) ^ 0xCD76CCEA));
    private final tay rkh_2 = new tay(this, "Gravity").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(1853218597 + -830479510)).rkh_3(Float.intBitsToFloat(-1878380952 + -1434917881)).ssd_5(Float.intBitsToFloat(-1893175165 + -1394957844));
    private final khd rs = new khd(this, "Color Mode");
    private final fy jtha_2 = new fy(this.rs, "Random");
    private final fy bat = new fy(this.rs, "Theme");
    private final fy ttht = new fy(this.rs, "Custom");
    private final bzw_2 dhda_3 = new bzw_2(this, "Custom Color", this::zhq_3).dhshy(new byq(Float.intBitsToFloat(0xDFD9F95B ^ 0x9CA6F95B), Float.intBitsToFloat(Integer.reverse(-864581507) ^ 0xFD6EEE33), Float.intBitsToFloat(Integer.reverse(-524048494) ^ 0xA9AC307), Float.intBitsToFloat(-1244960962 + -1917609790)));
    private final bbd_2 hfh = new bbd_2(this, "Partic".concat("le Types")).sshm(true);
    private final s_3 zthh = new s_3(this.hfh, "Glow").thst();
    private final s_3 rhr = new s_3(this.hfh, "Star");
    private final s_3 jghsh = new s_3(this.hfh, "Spark");
    private final s_3 dhk_2 = new s_3(this.hfh, "Bloom");
    private final s_3 shkhy = new s_3(this.hfh, "Snowflake");
    private final s_3 nh_2 = new s_3(this.hfh, "Heart");
    private final s_3 sbf = new s_3(this.hfh, "Rhombus");
    private final class_2960 std_3 = class_2960.method_60655((String)"moondlc", (String)"images/particles/glow.png");
    private final class_2960 bfh_2 = class_2960.method_60655((String)"moondlc", (String)"images/particles/star.png");
    private final class_2960 stz = class_2960.method_60655((String)"moondlc", (String)"images/particles/spark.png");
    private final class_2960 snkh = class_2960.method_60655((String)"moondlc", (String)"images/particles/bloom.png");
    private final class_2960 ddt_4 = class_2960.method_60655((String)"moondlc", (String)"images/particle".concat("s/snowflake.png"));
    private final class_2960 zksh = class_2960.method_60655((String)"moondlc", (String)"images/particles/heart.png");
    private final class_2960 swt = class_2960.method_60655((String)"moondlc", (String)"images/particles/rhombus.png");
    private final List hfs = Collections.synchronizedList(new ArrayList());
    private final bql<bksh> thyq = this::hshb;
    private final bql<btt> rtt_4 = this::dhnk;
    private final bql<shw_3> dhfy = this::dhhd_4;
    private static final int trm = 447858285;
    private static final int sdz_3 = -2088322284;
    private static final int dhtsh_2 = 410060358;
    private static final int shtt_4 = -900759832;
    private static final int v0bsoam = -809419578;
    private static final int rqtqf9ubc = -1363923089;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int o4bbv3e0tf1;

    @Override
    public void nt() {
        int n = 914038260;
        n = Integer.rotateLeft(n * -112207629, 14) ^ 0x50EE6E;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0xE2EEB6DD;
        if ((n2 ^ n) != -487672099) {
            int cfr_ignored_0 = (0xD495AB29 ^ n) - -890679564;
        }
        this.hfs.clear();
    }

    @Override
    public void nc() {
        int n = blj.sbdh_2(-273351402);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0x78EDEAF1;
        if ((n2 ^ n) != 2028858097) {
            int cfr_ignored_0 = Integer.rotateRight(0x975917E7 ^ n, 5) - 1478984756;
        }
        this.hfs.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void dsh_2(class_1297 class_12972) {
        int n = -847907289;
        n = Integer.rotateLeft(n * -1057187375, 10) ^ 0x19AF8E4;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x3450727B;
        if ((n2 ^ n) != 877687419) {
            int cfr_ignored_0 = (0xF925845C ^ n) + 1006434168;
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        float f = this.baa_2.thw_5();
        List list = bkhh_2.zwq(this);
        List list2 = this.hfs;
        synchronized (list2) {
            for (int i = 0; i < (int)this.khmn.thw_5(); ++i) {
                this.hfs.add(new tzs(new class_243(class_12972.method_23317(), class_12972.method_23318() + threadLocalRandom.nextDouble(0.0, class_12972.method_17682()), class_12972.method_23321()), new class_243(threadLocalRandom.nextDouble(-f, f), bkhh_2.rsd_2(threadLocalRandom, (double)(-f) * Double.longBitsToDouble(0x855ACF883B636B8L ^ 0x37BDACF883B636B8L), (double)f * bkhh_2.ddw_2(0x6D8C71C0866AB165L ^ 0x5235E8591FF328FFL)), threadLocalRandom.nextDouble(-f, f)), this.hfs.size(), this.sr_2().getRGB(), bkhh_2.rdh(this, (String)list.get(threadLocalRandom.nextInt(list.size())))));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void akhd() {
        if (bkhh_2.mc.field_1687 == null || bkhh_2.mc.field_1724 == null) {
            this.hfs.clear();
            return;
        }
        long l = Math.max(1L, (long)Math.round(this.shgh_4.thw_5() * 1000.0f));
        class_243 class_2432 = bkhh_2.mc.field_1724.method_19538();
        List list = this.hfs;
        synchronized (list) {
            Iterator iterator = this.hfs.iterator();
            while (iterator.hasNext()) {
                tzs tzs2 = (tzs)iterator.next();
                if (!tzs2.saa_2(this.rkh_2.thw_5(), l, class_2432)) continue;
                iterator.remove();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void khshf(class_4587 class_45872, float f) {
        ArrayList arrayList;
        if (bkhh_2.mc.field_1773 == null) {
            return;
        }
        List list = this.hfs;
        synchronized (list) {
            if (this.hfs.isEmpty()) {
                return;
            }
            arrayList = new ArrayList(this.hfs);
        }
        list = bkhh_2.mc.field_1773.method_19418();
        class_243 class_2432 = list.method_19326();
        float f2 = -list.method_19330();
        float f3 = list.method_19329();
        long l = Math.max(1L, (long)Math.round(this.shgh_4.thw_5() * 1000.0f));
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.disableCull();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        LinkedHashMap<class_2960, List> linkedHashMap = new LinkedHashMap<class_2960, List>();
        for (tzs object : arrayList) {
            linkedHashMap.computeIfAbsent(object.thhh_2, bkhh_2::shthl).add(object);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            RenderSystem.setShaderTexture((int)0, (class_2960)((class_2960)entry.getKey()));
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            for (tzs tzs2 : (List)entry.getValue()) {
                this.hdz_4(class_2872, class_45872, tzs2, class_2432, f2, f3, f, l);
            }
            class_9801 class_98012 = class_2872.method_60794();
            if (class_98012 == null) continue;
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    private void hdz_4(class_287 class_2872, class_4587 class_45872, tzs tzs2, class_243 class_2432, float f, float f2, float f3, long l) {
        float f4 = tzs2.bmt_2(l);
        if (f4 <= 0.01f) {
            return;
        }
        class_243 class_2433 = tzs2.hbq(f3).method_1020(class_2432);
        float f5 = 0.75f + tzs2.zwd_4(l) * 0.45f;
        float f6 = this.shnl.thw_5() * f5;
        int n = this.bdz(tzs2);
        this.khbgh(class_2872, class_45872, class_2433, f, f2, f6 * 0.92f, this.taq(n, f4 * 0.08f));
        this.khbgh(class_2872, class_45872, class_2433, f, f2, f6 * 0.62f, this.taq(n, f4 * 0.88f));
        this.khbgh(class_2872, class_45872, class_2433, f, f2, f6 * 0.18f, this.taq(0xFFFFFF, f4 * 0.18f));
    }

    private void khbgh(class_287 class_2872, class_4587 class_45872, class_243 class_2432, float f, float f2, float f3, int n) {
        float f4 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n & 0xFF) / 255.0f;
        float f7 = (float)(n >> 24 & 0xFF) / 255.0f;
        class_45872.method_22903();
        class_45872.method_22904(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(f));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(f2));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, -f3, f3, 0.0f).method_22913(0.0f, 1.0f).method_22915(f4, f5, f6, f7);
        class_2872.method_22918(matrix4f, f3, f3, 0.0f).method_22913(1.0f, 1.0f).method_22915(f4, f5, f6, f7);
        class_2872.method_22918(matrix4f, f3, -f3, 0.0f).method_22913(1.0f, 0.0f).method_22915(f4, f5, f6, f7);
        class_2872.method_22918(matrix4f, -f3, -f3, 0.0f).method_22913(0.0f, 0.0f).method_22915(f4, f5, f6, f7);
        class_45872.method_22909();
    }

    /*
     * Unable to fully structure code
     */
    private int bdz(tzs var1_1) {
        var2_2 = 0;
        var5_3 = 0;
        var3_4 = 659344226;
        var3_4 = Integer.rotateLeft(var3_4 * 443337063, 12) ^ -1504219159;
        var3_4 = System.identityHashCode(this) ^ var3_4;
        v0 = var1_1;
        var3_4 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var3_4;
        var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) + -1213805991 - -1213805991;
        while (true) {
            block46: {
                block47: {
                    block37: {
                        block45: {
                            block43: {
                                block41: {
                                    block50: {
                                        block48: {
                                            block40: {
                                                block39: {
                                                    block49: {
                                                        block51: {
                                                            block42: {
                                                                block52: {
                                                                    block44: {
                                                                        block53: {
                                                                            block38: {
                                                                                var5_3 = Integer.reverse(var4_5) ^ var3_4 ^ -2019319082;
                                                                                switch (var5_3 & 7) {
                                                                                    case 6: {
                                                                                        if (var5_3 == -1664117274) break block37;
                                                                                        if (var5_3 == -1149887290) break block38;
                                                                                        (Integer.rotateRight(1884336574 ^ var3_4, 17) - -1641863875) * 1884336575;
                                                                                        if (var5_3 != 285327806) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block39;
                                                                                    }
                                                                                    case 7: {
                                                                                        if (var5_3 == 614305847) break block40;
                                                                                        if (var5_3 == -1433917161) break block41;
                                                                                        if (var5_3 != -260424489) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block42;
                                                                                    }
                                                                                    case 5: {
                                                                                        if (var5_3 == -1761217131) break;
                                                                                        if (var5_3 != 1867314525) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block43;
                                                                                    }
                                                                                    case 2: {
                                                                                        if (var5_3 != -868372390) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block44;
                                                                                    }
                                                                                    case 1: {
                                                                                        if (var5_3 == 502357897) break block45;
                                                                                        if (var5_3 == 331910793) break block46;
                                                                                        Integer.rotateRight(1662927630 ^ var3_4, 15) - 84393453;
                                                                                        if (var5_3 != 1608130497) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block47;
                                                                                    }
                                                                                    case 3: {
                                                                                        if (var5_3 == 1883163075) break block48;
                                                                                        if (var5_3 == -887873285) break block49;
                                                                                        Integer.rotateRight(-63809722 ^ var3_4, 18) - -1904856907;
                                                                                        if (var5_3 == -857763469) break block50;
                                                                                        if (var5_3 != 1121018891) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block51;
                                                                                    }
                                                                                    case 4: {
                                                                                        if (var5_3 == -1170281764) break block52;
                                                                                        if (var5_3 != -149844780) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block53;
                                                                                    }
                                                                                }
                                                                                Integer.rotateLeft(576738208 ^ var3_4, 7) + 772259739;
                                                                                var2_2 = var1_1.shsht;
                                                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 331910793 ^ -2019319082)));
                                                                                (Integer.rotateRight(-47721741 ^ var3_4, 18) + -1406129496) * -47721741;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateLeft(-1171431695 ^ var3_4, 10) + -1881399702) * -1171431695;
                                                                            (int)(8691930565480606543L ^ (long)var3_4 ^ 2083058976118365422L);
                                                                            var2_2 = bkhh_2.sqb(bkhh_2.dsh());
                                                                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ 331910793 ^ -2019319082) ^ 607583806832772799L ^ 607583806832772799L);
                                                                            Integer.rotateRight(-389519509 ^ var3_4, 16) + 883041584;
                                                                            var5_3 -= 5;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateLeft(-138575347 ^ var3_4, 17) - 72376014;
                                                                        (int)(3823323193999158095L ^ (long)var3_4 ^ -6552593309364533297L);
                                                                        if (bkhh_2.thkhz_2(this.bat)) {
                                                                            try {
                                                                                var5_3 += 4;
                                                                                if ((-593529607169779415L ^ (long)var3_4 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                var4_5 = Integer.reverse(var3_4 ^ -1149887290 ^ -2019319082) ^ -46462392 ^ -46462392;
                                                                            }
                                                                            catch (ArithmeticException v1) {
                                                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -1149887290 ^ -2019319082)));
                                                                            }
                                                                            continue;
                                                                        }
                                                                        var4_5 = Integer.reverse(var3_4 ^ 1435852023 ^ -2019319082) ^ 639614495 ^ 639614495;
                                                                        (Integer.rotateRight(586752570 ^ var3_4, 7) + 1082704961) * 586752571;
                                                                        var4_5 = Integer.reverse(var3_4 ^ -868372390 ^ -2019319082);
                                                                        var5_3 -= 3;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateLeft(-1445976619 ^ var3_4, 8) - -1802357754) * -1445976619;
                                                                    (int)(7737900938992872271L ^ (long)var3_4 ^ -1540086924101190892L);
                                                                    if (this.ttht.shghkh()) {
                                                                        try {
                                                                            var5_3 += 2;
                                                                            if ((3815356060226489641L ^ (long)var3_4 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            var4_5 = Integer.reverse(var3_4 ^ -1170281764 ^ -2019319082) ^ -1949979555 ^ -1949979555;
                                                                        }
                                                                        catch (IllegalStateException v2) {
                                                                            var4_5 = Integer.reverse(var3_4 ^ -1170281764 ^ -2019319082);
                                                                        }
                                                                        var5_3 += 4;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        var5_3 -= 3;
                                                                        if ((-4395625226665060881L ^ (long)var3_4 | 1L) == 0L) {
                                                                            throw new UnsupportedOperationException();
                                                                        }
                                                                        var4_5 = Integer.reverse(var3_4 ^ -1761217131 ^ -2019319082) + -1308702317 - -1308702317;
                                                                    }
                                                                    catch (UnsupportedOperationException v3) {
                                                                        var4_5 = Integer.reverse(var3_4 ^ -1761217131 ^ -2019319082) ^ 1431156823 ^ 1431156823;
                                                                    }
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(533397073 ^ var3_4, 6) + -571315446) * 533397073;
                                                                (int)(-2488150368667243697L ^ (long)var3_4 ^ 6748788190074115873L);
                                                                var2_2 = bkhh_2.hlz(this.dhda_3).rk();
                                                                (int)(5410054805609029078L ^ (long)var3_4 ^ 4408430035859094521L);
                                                                var4_5 = Integer.reverse(var3_4 ^ 331910793 ^ -2019319082) ^ -222143201 ^ -222143201;
                                                                var5_3 += 3;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(1096236829 ^ var3_4, 11) - -303152194) * 1096236829;
                                                            (int)(-8942581917781005489L ^ (long)var3_4 ^ -2364245655910045158L);
                                                            (int)(-7580771616651333201L ^ (long)var3_4 ^ -7083325521601724346L);
                                                            var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) + -447587385 - -447587385;
                                                            var5_3 += 3;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1853922903 ^ var3_4, 5) + -1563790670;
                                                        (int)(6038710910604077903L ^ (long)var3_4 ^ 7086558162126965322L);
                                                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1291971898 ^ -2019319082)));
                                                        Integer.rotateLeft(-471832344 ^ var3_4, 15) + -1668656301;
                                                        var4_5 = Integer.reverse(var3_4 ^ 319289554 ^ -2019319082);
                                                        Integer.rotateRight(-2048217341 ^ var3_4, 3) + 1003016344;
                                                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -149844780 ^ -2019319082)));
                                                        var5_3 += 2;
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(-210555630 ^ var3_4, 17) + 2135954537) * -210555629;
                                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ -2097024268 ^ -2019319082) ^ -8260923502400440279L ^ -8260923502400440279L);
                                                    Integer.rotateRight(-1884795485 ^ var3_4, 4) + 1774126584;
                                                    try {
                                                        if ((7064282977949758735L ^ (long)var3_4 | 1L) == 0L) {
                                                            throw new IllegalStateException();
                                                        }
                                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) ^ -4477585031539350245L ^ -4477585031539350245L);
                                                    }
                                                    catch (IllegalStateException v4) {
                                                        var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082);
                                                    }
                                                    ++var5_3;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(1306970973 ^ var3_4, 12) - 1934638974) * 1306970973;
                                                (int)(-8118752764582630577L ^ (long)var3_4 ^ 4012851416446579577L);
                                                var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) + -1819967517 - -1819967517;
                                                var5_3 -= 4;
                                                continue;
                                            }
                                            (Integer.rotateLeft(1109894037 ^ var3_4, 11) - 120221254) * 1109894037;
                                            (int)(-9181417249450955953L ^ (long)var3_4 ^ -1864346097271919365L);
                                            var4_5 = Integer.reverse(var3_4 ^ 1799521152 ^ -2019319082) + -1830870784 - -1830870784;
                                            (Integer.rotateLeft(-765011875 ^ var3_4, 13) - 2127680126) * -765011875;
                                            (int)(1212724355026709327L ^ (long)var3_4 ^ 1274662843005373561L);
                                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) ^ 5600001224389568730L ^ 5600001224389568730L);
                                            var5_3 += 2;
                                            continue;
                                        }
                                        Integer.rotateRight(-285944886 ^ var3_4, 16) + -201112399;
                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ 34157604 ^ -2019319082) ^ -5320508137314549922L ^ -5320508137314549922L);
                                        Integer.rotateLeft(-1999166935 ^ var3_4, 4) + -1771388366;
                                        (int)(5360844949649943375L ^ (long)var3_4 ^ -1920641092614014694L);
                                        var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) ^ 2085126168 ^ 2085126168;
                                        var5_3 += 2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(1719232764 ^ var3_4, 15) - 1829852607) * 1719232765;
                                    try {
                                        var5_3 -= 2;
                                        if ((-2729888843188854439L ^ (long)var3_4 | 1L) == 0L) {
                                            throw new IllegalArgumentException();
                                        }
                                        var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) ^ 401519077 ^ 401519077;
                                    }
                                    catch (IllegalArgumentException v5) {
                                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) ^ 4884979130533510890L ^ 4884979130533510890L);
                                    }
                                    continue;
                                }
                                Integer.rotateLeft(1613954857 ^ var3_4, 15) + -1433762510;
                                (int)(-6737295895536800945L ^ (long)var3_4 ^ 6870385380013172945L);
                                var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) ^ 1770476481 ^ 1770476481;
                                continue;
                            }
                            Integer.rotateLeft(-755737812 ^ var3_4, 13) - -1879791217;
                            (int)(-587371938274648295L ^ (long)var3_4 ^ -8801207377910807965L);
                            var4_5 = Integer.reverse(var3_4 ^ -1463154925 ^ -2019319082) ^ -243862725 ^ -243862725;
                            (int)(6241558665765226227L ^ (long)var3_4 ^ 892794469412307181L);
                            var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082);
                            --var5_3;
                            continue;
                        }
                        (Integer.rotateLeft(661462292 ^ var3_4, 7) - -896260953) * 661462293;
                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -104835786 ^ -2019319082)));
                        Integer.rotateRight(-655712606 ^ var3_4, 14) + 1220990169;
                        (int)(5521191459855709063L ^ (long)var3_4 ^ -7948176530152540945L);
                        var4_5 = (int)((long)Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) ^ -3975372305792881875L ^ -3975372305792881875L);
                        --var5_3;
                        continue;
                    }
                    (Integer.rotateRight(-212735050 ^ var3_4, 17) - 2068392517) * -212735049;
                    var4_5 = Integer.reverse(var3_4 ^ 637297870 ^ -2019319082) ^ -633023987 ^ -633023987;
                    Integer.rotateLeft(-975193043 ^ var3_4, 11) - -92968786;
                    (int)(535103791323999055L ^ (long)var3_4 ^ -2787584020882808053L);
                    try {
                        var5_3 += 2;
                        if ((-4499770770527802177L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) ^ 245692598 ^ 245692598;
                    }
                    catch (IllegalStateException v6) {
                        var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082) + 1861886597 - 1861886597;
                    }
                    var5_3 -= 2;
                    continue;
                }
                (Integer.rotateLeft(1516450013 ^ var3_4, 14) - -161445378) * 1516450013;
                (int)(-7434986824233850033L ^ (long)var3_4 ^ -4562002274066850702L);
                var4_5 = Integer.reverse(var3_4 ^ -149844780 ^ -2019319082);
                Integer.rotateRight(1822574082 ^ var3_4, 16) + 738466169;
                ++var5_3;
                continue;
            }
            return var2_2;
lbl274:
            // 8 sources

            (Integer.rotateLeft(-2048750083 ^ var3_4, 3) - 986501342) * -2048750083;
            (int)(5138646483038694223L ^ (long)var3_4 ^ -4976333439784901775L);
            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -149844780 ^ -2019319082)));
        }
    }

    private int taq(int n, float f) {
        int n2 = -396009736;
        n2 = Integer.rotateLeft(n2 * 220311963, 12) ^ 0x4EBB7AF7;
        n2 = Float.floatToIntBits(f) ^ n2;
        int n3 = n2 ^ 0xEA6189E1;
        if ((n3 ^ n2) != -362706463) {
            int cfr_ignored_0 = (0x204D719 ^ n2) - 439488318;
        }
        int n4 = class_3532.method_15340((int)Math.round(f * Float.intBitsToFloat(0x5A7C036A ^ 0x1903036A)), (int)0, (int)Integer.rotateLeft(0x98B849 ^ 0x98C7C9, 25));
        return n4 << -336088792 + 336088816 | n & 951353980 - 934576765;
    }

    private Color sr_2() {
        int n = -524172402;
        int n2 = (n = Integer.rotateLeft(n * 1918534599, 26) ^ 0x93431105) ^ 0xD6E22ED1;
        if ((n2 ^ n) != -689819951) {
            int cfr_ignored_0 = (0x3623ED5F ^ n) + 657428912;
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        return Color.getHSBColor(threadLocalRandom.nextFloat(), (float)threadLocalRandom.nextDouble(Double.longBitsToDouble(0xB129FDFB3AED179CL ^ 0x8ECACEC809DE24AFL), Double.longBitsToDouble(0xA10B7170D1B7ECABL ^ 0x9EE51716B7D18ACDL)), 1.0f);
    }

    private List trd() {
        int n = blj.sbdh_2(-764566999);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x94D96440;
        if ((n2 ^ n) != -1797692352) {
            int cfr_ignored_0 = Integer.rotateLeft(0x46B4C669 ^ n, 11) + -1807637006;
            int cfr_ignored_1 = (int)(0x8406685427D4EB4FL ^ (long)n ^ 0x2DD8831A2DB8A5DDL);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.zthh.alh()) {
            arrayList.add("Glow");
        }
        if (this.rhr.alh()) {
            arrayList.add(bkhh_2.aby("봻⼫昩", Integer.rotateLeft(0xDF6B4277 ^ 0x56D4FDD3, 19), bkhh_2.byb(0x475142E6 ^ 0x8649A77E, 14), Integer.rotateLeft(0xA78F0CBC ^ 0x52715DA5, 19)));
        }
        if (bkhh_2.dhts_3(this.jghsh)) {
            arrayList.add("Spark");
        }
        if (bkhh_2.sar_3(this.dhk_2)) {
            arrayList.add("Bloom");
        }
        if (this.shkhy.alh()) {
            arrayList.add("Snowflake");
        }
        if (bkhh_2.sld(this.nh_2)) {
            arrayList.add("Heart");
        }
        if (this.sbf.alh()) {
            arrayList.add("Rhombus");
        }
        return arrayList.isEmpty() ? List.of("Glow") : arrayList;
    }

    /*
     * Exception decompiling
     */
    private class_2960 thsa_2(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static List shthl(class_2960 class_29602) {
        return new ArrayList();
    }

    private void dhhd_4(shw_3 shw2) {
        int n = 1002576983;
        n = Integer.rotateLeft(n * 1441752261, 5) ^ 0x8BD57636;
        shw_3 shw3 = shw2;
        n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
        int n2 = n ^ 0xFB9EA0AA;
        if ((n2 ^ n) != -73490262) {
            int cfr_ignored_0 = (0xC05CBCFD ^ n) + -64728824;
        }
        this.khshf(shw2.ssha_2(), shw2.skz_4());
    }

    private void dhnk(btt btt2) {
        int n = -1192782513;
        int n2 = (n = Integer.rotateLeft(n * 1404962523, 5) ^ 0xDCBA012D) ^ 0x5DE6661;
        if ((n2 ^ n) != 98461281) {
            int cfr_ignored_0 = (0xBD39F32E ^ n) - 701201060;
        }
        this.akhd();
    }

    private void hshb(bksh bksh2) {
        class_2596 class_25962;
        int n = -1804036844;
        int n2 = (n = Integer.rotateLeft(n * 1547263403, 5) ^ 0xA14A4FB8) ^ 0x47F670CC;
        if ((n2 ^ n) != 1207333068) {
            int cfr_ignored_0 = (0xD38EE5D8 ^ n) + 513308683;
        }
        if (!((class_25962 = bksh2.asw()) instanceof class_2663)) {
            return;
        }
        class_2663 class_26632 = (class_2663)class_25962;
        if (class_26632.method_11470() != (Integer.reverse(-1422442506) ^ 0x6FFCECF6)) {
            return;
        }
        mc.execute(() -> this.rghd(class_26632));
    }

    private void rghd(class_2663 class_26632) {
        class_1297 class_12972;
        int n = 531027945;
        n = Integer.rotateLeft(n * 702051441, 26) ^ 0x4E525C6F;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
        class_2663 class_26633 = class_26632;
        n = Integer.rotateRight((class_26633 != null ? System.identityHashCode(class_26633) : 0) ^ n, 2);
        int n2 = n ^ 0xC487D261;
        if ((n2 ^ n) != -997731743) {
            int cfr_ignored_0 = (0xDB210588 ^ n) + -1324833532;
        }
        if (bkhh_2.mc.field_1687 != null && (class_12972 = class_26632.method_11469((class_1937)bkhh_2.mc.field_1687)) != null) {
            this.dsh_2(class_12972);
        }
    }

    private boolean zhq_3() {
        int n = 1139908897;
        int n2 = (n = Integer.rotateLeft(n * -524205153, 27) ^ 0x3C2C7D20) ^ 0xD7D9494;
        if ((n2 ^ n) != 226333844) {
            int cfr_ignored_0 = (0x4E8C35B5 ^ n) + -326295627;
        }
        return !this.ttht.shghkh();
    }

    private static String aby(String string, int n, int n2, int n3) {
        int n4 = blj.sbdh_2(343794750);
        n4 = n ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0x5F308E02;
        if ((n5 ^ n4) != 1597017602) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x4B4D6A3C ^ n4, 12) - 582843519) * 1263364669;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x1E25E587 ^ n2 ^ i * -316390215 ^ trm, 22) ^ sdz_3));
        }
        return new String(cArray);
    }

    private static List zwq(bkhh_2 bkhh2) {
        block0: {
            int n = blj.sbdh_2(672673128);
            bkhh_2 bkhh3 = bkhh2;
            n = Integer.rotateLeft((bkhh3 != null ? System.identityHashCode(bkhh3) : 0) ^ n, 13);
            int n2 = n ^ 0x9460ABF3;
            if ((n2 ^ n) == -1805603853) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xBC78869B ^ n, 10) + -688526336) * -1132951909;
        }
        return bkhh2.trd();
    }

    private static double ddw_2(long l) {
        block0: {
            int n = 2143729111;
            n = Integer.rotateLeft(n * 2021250991, 26) ^ 0x4017882C;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 14)) ^ 0xBB67E3BC;
            if ((n2 ^ n) == -1150819396) break block0;
            int cfr_ignored_0 = (0xC4A1566B ^ n) - -830120002;
        }
        return Double.longBitsToDouble(l);
    }

    private static double rsd_2(ThreadLocalRandom threadLocalRandom, double d, double d2) {
        block0: {
            int n = blj.sbdh_2(1637118402);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x3F1D9BB9;
            if ((n2 ^ n) == 1058905017) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x5E89EA7B ^ n, 14) + 1997603872) * 1586096763;
        }
        return threadLocalRandom.nextDouble(d, d2);
    }

    private static class_2960 rdh(bkhh_2 bkhh2, String string) {
        block0: {
            int n = blj.sbdh_2(-233178294);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x888CEC90;
            if ((n2 ^ n) == -2004030320) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x7A9517DA ^ n, 18) + -596933983) * 2056591323;
        }
        return bkhh2.thsa_2(string);
    }

    private static boolean thkhz_2(fy fy2) {
        block0: {
            int n = 855657549;
            int n2 = (n = Integer.rotateLeft(n * 8114801, 3) ^ 0x69259B36) ^ 0xA76C97B1;
            if ((n2 ^ n) == -1486055503) break block0;
            int cfr_ignored_0 = (0x946CDBFC ^ n) - 1753074867;
        }
        return fy2.shghkh();
    }

    private static byq dsh() {
        block0: {
            int n = -1863533145;
            int n2 = (n = Integer.rotateLeft(n * -1818629505, 6) ^ 0x3C4BEBD) ^ 0xA7C4B7C3;
            if ((n2 ^ n) == -1480280125) break block0;
            int cfr_ignored_0 = (0x37280A64 ^ n) + 2031811764;
        }
        return bhj_2.ths();
    }

    private static int sqb(byq byq2) {
        block0: {
            int n = 1561203650;
            n = Integer.rotateLeft(n * 1950276121, 10) ^ 0x6E9B4E08;
            byq byq3 = byq2;
            n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
            int n2 = n ^ 0x1142D733;
            if ((n2 ^ n) == 289593139) break block0;
            int cfr_ignored_0 = (0x4C4CC4F1 ^ n) - 997946113;
        }
        return byq2.rk();
    }

    private static byq hlz(bzw_2 bzw2_2) {
        block0: {
            int n = blj.sbdh_2(-853836801);
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0xA47327D6;
            if ((n2 ^ n) == -1535957034) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x69685C29 ^ n, 16) + -939472846;
            int cfr_ignored_1 = (int)(0xABDAF21427D4EB4FL ^ (long)n ^ 0x1958831A2DB8FA64L);
        }
        return bzw2_2.sdsh_4();
    }

    private static int byb(int n, int n2) {
        block0: {
            int n3 = blj.sbdh_2(1735177932);
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 23)) ^ 0x9365E5DE;
            if ((n4 ^ n3) == -1822038562) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xF4095312 ^ n3, 17) + -1853968791) * -200715501;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean dhts_3(s_3 s2) {
        block0: {
            int n = blj.sbdh_2(-993056373);
            s_3 s3 = s2;
            n = (s3 != null ? System.identityHashCode(s3) : 0) ^ n;
            int n2 = n ^ 0xF4A587E8;
            if ((n2 ^ n) == -190478360) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x306AAE63 ^ n, 9) + -515326664;
        }
        return s2.alh();
    }

    private static boolean sar_3(s_3 s2) {
        block0: {
            int n = 770845878;
            int n2 = (n = Integer.rotateLeft(n * -2146564783, 9) ^ 0x71312B27) ^ 0x2E0E1BAA;
            if ((n2 ^ n) == 772676522) break block0;
            int cfr_ignored_0 = (0x3FC371C ^ n) - -2143947429;
        }
        return s2.alh();
    }

    private static boolean sld(s_3 s2) {
        block0: {
            int n = 558612964;
            int n2 = (n = Integer.rotateLeft(n * 1791991641, 20) ^ 0xFCEA0DC1) ^ 0x1C88C747;
            if ((n2 ^ n) == 478725959) break block0;
            int cfr_ignored_0 = (0x3DC306A3 ^ n) - 570251674;
        }
        return s2.alh();
    }

    private static String zshs_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 319804222;
            n4 = Integer.rotateLeft(n4 * -1769968581, 9) ^ 0x5A7EA000;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x2E8419A7;
            if ((n5 ^ n4) == 780409255) break block0;
            int cfr_ignored_0 = (0x3D8BCA99 ^ n4) - -1708634366;
        }
        return bkhh_2.aby(string, n, n2, n3);
    }

    private static String ztt_7(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1206663745;
            n4 = Integer.rotateLeft(n4 * 105743133, 19) ^ 0xF5880A0C;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 20)) ^ 0x756941E7;
            if ((n5 ^ n4) == 1969832423) break block0;
            int cfr_ignored_0 = (0xCD7A8458 ^ n4) + 402119266;
        }
        return bkhh_2.aby(string, n, n2, n3);
    }

    private static boolean ddd_4(String string, Object object) {
        block0: {
            int n = blj.sbdh_2(1292141859);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x582C3BCF;
            if ((n2 ^ n) == 1479293903) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x1528BEEC ^ n, 5) - -1806910001;
        }
        return string.equals(object);
    }

    private static String hzs_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = blj.sbdh_2(-336391035);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 27)) ^ 0x7AF6C9A0;
            if ((n5 ^ n4) == 2062993824) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x9105DD25 ^ n4, 5) - -1810667850;
            int cfr_ignored_1 = (int)(0x53B7731827D4EB4FL ^ (long)n4 ^ 0x1B40831A2DB90ABFL);
        }
        return bkhh_2.aby(string, n, n2, n3);
    }

    private static String[] bwq(String string) {
        int n = -1560518403;
        n = Integer.rotateLeft(n * 1489949345, 11) ^ 0xD01C5646;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xD6D7D292;
        if ((n2 ^ n) != -690498926) {
            int cfr_ignored_0 = (0x742BB26F ^ n) + -1785728091;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite sfr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1403043285;
            n3 = Integer.rotateLeft(n3 * 823470337, 18) ^ 0xEC03A04D;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x6277B83E;
            if ((n4 ^ n3) != 1652013118) {
                int cfr_ignored_0 = (0xCE28FA15 ^ n3) + -1187752410;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dhtsh_2 ^ string.hashCode() ^ n2 + shtt_4 ^ i * 524917929 ^ dhtsh_2, 5) ^ shtt_4));
            }
            String[] stringArray = bkhh_2.bwq(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] mvr6rflof1uu(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ksjsthwebwtr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ v0bsoam ^ string.hashCode() ^ n2 + rqtqf9ubc ^ i * -1885556653 ^ v0bsoam, 14) ^ rqtqf9ubc));
            }
            String[] stringArray = bkhh_2.mvr6rflof1uu(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

