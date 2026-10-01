/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1306
 *  net.minecraft.class_1921
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4608
 *  net.minecraft.class_5498
 *  net.minecraft.class_7833
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1306;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_5498;
import net.minecraft.class_7833;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector4f;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.ttz;
import us.m0vy.moondlc.m0vyguard.tkhb;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="FlameHands", category=bzw.OTHER, desc="Spawns dynamic glowing flames wrapping your hands/items")
public class tdhkh
extends bnq {
    private static tdhkh dhhkh;
    private final khd dhaa_4 = new khd(this, "Hands");
    private final fy dhls_2 = new fy(this.dhaa_4, "Both");
    private final fy tzw = new fy(this.dhaa_4, "Main Only");
    private final fy ttd_4 = new fy(this.dhaa_4, "Off Only");
    private final khd hlh = new khd(this, "Render Mode");
    private final fy jsn = new fy(this.hlh, "Bloom");
    private final fy thym = new fy(this.hlh, "Glow");
    private final khd jtz_4 = new khd(this, "Color Mode");
    private final fy zjj = new fy(this.jtz_4, "Static");
    private final fy bkhd = new fy(this.jtz_4, "Gradient");
    private final fy ttt_2 = new fy(this.jtz_4, "Rainbow");
    private final bzw_2 dhshn = new bzw_2(this, "Primary ".concat("Color")).dhshy(new byq(Float.intBitsToFloat(0x679D2F09 ^ 0x24E22F09), Float.intBitsToFloat(-2040312109 + -1136873171), Float.intBitsToFloat(1640908877 + -539904077), Float.intBitsToFloat(0x2AC08967 ^ 0x69BF8967)));
    private final bzw_2 hz_4 = new bzw_2(this, "Secondar".concat("y Color")).dhshy(new byq(Float.intBitsToFloat(-522041647 - -1654438191), Float.intBitsToFloat(Integer.rotateLeft(0x9295C7C4 ^ 0x9398E7C4, 6)), 0.0f, Float.intBitsToFloat(Integer.rotateLeft(0x20781668 ^ 0x4F981660, 27))));
    private final tay jthy = new tay(this, "Size").shth_7(Float.intBitsToFloat(351082566 + 677360775)).dhbs_2(Float.intBitsToFloat(0x8ECCF5B3 ^ 0xB180397E)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x4CA47CA8 ^ 0x108C8C27, 14))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x8125173 ^ 0x8125087, 21)));
    private final tay shba_2 = new tay(this, "Density").shth_7(Float.intBitsToFloat(1785289064 + -692672872)).dhbs_2(Float.intBitsToFloat(1559792524 - 425888652)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x4F5AA3A4 ^ 0x4D5FA3A4, 5))).ssd_5(Float.intBitsToFloat(1080897753 - -39505703));
    private final tay zma_2 = new tay(this, "Lifetime").shth_7(Float.intBitsToFloat(0x22A227C9 ^ 0x1F6EEB04)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(2065447780) ^ 0x1B90F413)).ssd_5(Float.intBitsToFloat(Integer.reverse(1873375561) ^ 0xAC3DA6C5));
    private final tay hkq = new tay(this, "Buoyancy").shth_7(0.0f).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x96CB993C ^ 0xF6C30A5, 11))).ssd_5(Float.intBitsToFloat(-1655682504 + -1582320184));
    private final tay zqd_2 = new tay(this, "Turbulence").shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(1149956668) ^ 0x1039DEF)).ssd_5(Float.intBitsToFloat(1638952110 - 588698388));
    private final tay bbn = new tay(this, "Inertia/Lag").shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(658908137) ^ 0xAA88AE29)).ssd_5(Float.intBitsToFloat(2133983479 + -1077018871));
    private final badh_2 twz = new badh_2(this, "Only When Holding").bts(false);
    private final CopyOnWriteArrayList rqm = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList as_2 = new CopyOnWriteArrayList();
    private final Map dhdf_2 = new HashMap();
    private final Map rts_4 = new HashMap();
    private final Map bhz_3 = new HashMap();
    private final Map tjr = new HashMap();
    private static final int tthgh = 750305347;
    private static final int bda = 1758675520;
    private static final int sdhh_3 = -184142153;
    private static final int dhhd_3 = 127874698;
    private static final int tczid30c1itl = -79383313;
    private static final int zevpktyo0k = 612541723;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int i3z6pn7u;

    public static tdhkh rts() {
        block0: {
            int n = 34194971;
            int n2 = (n = Integer.rotateLeft(n * 904922437, 9) ^ 0xB9FE2532) ^ 0x3EB09876;
            if ((n2 ^ n) == 1051760758) break block0;
            int cfr_ignored_0 = (0x3CB95E6D ^ n) - -1335797199;
        }
        return dhhkh;
    }

    public tdhkh() {
        dhhkh = this;
    }

    @Override
    public void nc() {
        int n = 1045376591;
        n = Integer.rotateLeft(n * -172423481, 15) ^ 0x24822B95;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0x910B7DC2;
        if ((n2 ^ n) != -1861517886) {
            int cfr_ignored_0 = (0xAF44538D ^ n) + 281789721;
        }
        this.rqm.clear();
        tdhkh.znn(this.as_2);
        this.dhdf_2.clear();
        this.rts_4.clear();
        this.bhz_3.clear();
        this.tjr.clear();
    }

    public void szd_7(class_1306 class_13062, class_4587 class_45872, class_4597 class_45972, int n, boolean bl) {
        float f;
        float f2;
        boolean bl2;
        if (!this.rgha_2() || tdhkh.mc.field_1724 == null || tdhkh.mc.field_1773 == null || tdhkh.mc.field_1773.method_19418() == null) {
            return;
        }
        if (tdhkh.mc.field_1690.method_31044() != class_5498.field_26664) {
            return;
        }
        boolean bl3 = bl2 = class_13062 == tdhkh.mc.field_1724.method_6068();
        if (bl2 && this.dhaa_4.sdh_2() == this.ttd_4) {
            return;
        }
        if (!bl2 && this.dhaa_4.sdh_2() == this.tzw) {
            return;
        }
        if (this.twz.shzl() && !bl) {
            return;
        }
        long l = System.currentTimeMillis();
        if (!this.dhdf_2.containsKey(class_13062)) {
            this.dhdf_2.put(class_13062, l);
            this.bhz_3.put(class_13062, Float.valueOf(tdhkh.mc.field_1773.method_19418().method_19330()));
            this.tjr.put(class_13062, Float.valueOf(tdhkh.mc.field_1773.method_19418().method_19329()));
            return;
        }
        long l2 = (Long)this.dhdf_2.get(class_13062);
        float f3 = (float)(l - l2) / 1000.0f;
        this.dhdf_2.put(class_13062, l);
        if (f3 > 0.05f) {
            f3 = 0.05f;
        }
        if (f3 <= 0.0f) {
            f3 = 0.001f;
        }
        float f4 = tdhkh.mc.field_1773.method_19418().method_19330();
        float f5 = tdhkh.mc.field_1773.method_19418().method_19329();
        float f6 = this.bhz_3.getOrDefault(class_13062, Float.valueOf(f4)).floatValue();
        float f7 = this.tjr.getOrDefault(class_13062, Float.valueOf(f5)).floatValue();
        float f8 = f4 - f6;
        float f9 = f5 - f7;
        if (f8 > 180.0f) {
            f8 -= 360.0f;
        }
        if (f8 < -180.0f) {
            f8 += 360.0f;
        }
        this.bhz_3.put(class_13062, Float.valueOf(f4));
        this.tjr.put(class_13062, Float.valueOf(f5));
        float f10 = this.bbn.thw_5() * 0.008f;
        float f11 = -f8 * f10;
        float f12 = f9 * f10;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        if (tdhkh.mc.field_1724 != null) {
            class_243 class_2432 = tdhkh.mc.field_1724.method_18798();
            Vector3f vector3f = new Vector3f((float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350);
            Quaternionf quaternionf = new Quaternionf((Quaternionfc)tdhkh.mc.field_1773.method_19418().method_23767()).conjugate();
            vector3f.rotate((Quaternionfc)quaternionf);
            f2 = this.bbn.thw_5() * 0.15f;
            f14 = -vector3f.x * f2;
            f15 = -vector3f.y * f2;
            f16 = -vector3f.z * f2;
        }
        float f17 = f11 + f14;
        float f18 = f12 + f15;
        float f19 = f13 + f16;
        f2 = this.hkq.thw_5() * 0.012f;
        float f20 = this.zqd_2.thw_5() * 0.008f;
        float f21 = 0.86f;
        CopyOnWriteArrayList copyOnWriteArrayList = class_13062 == class_1306.field_6183 ? this.rqm : this.as_2;
        for (ttz ttz2 : copyOnWriteArrayList) {
            if (!ttz2.khzt_2(f3, f17, f18 + f2, f19, f21, f20)) continue;
            copyOnWriteArrayList.remove(ttz2);
        }
        float f22 = this.shba_2.thw_5();
        float f23 = 1.0f / f22;
        float f24 = this.rts_4.getOrDefault(class_13062, Float.valueOf(0.0f)).floatValue();
        f24 += f3;
        float f25 = bl ? 0.45f : 0.15f;
        float f26 = bl ? 0.06f : 0.04f;
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        while (f24 >= f23) {
            f24 -= f23;
            float f27 = threadLocalRandom.nextFloat();
            float f28 = threadLocalRandom.nextFloat(-f26, f26);
            float f29 = f27 * f25 + threadLocalRandom.nextFloat(-0.015f, 0.015f);
            float f30 = -f27 * f25 * 0.35f + threadLocalRandom.nextFloat(-0.015f, 0.015f);
            float f31 = threadLocalRandom.nextFloat(-0.001f, 0.001f);
            float f32 = threadLocalRandom.nextFloat(0.003f, 0.008f);
            float f33 = threadLocalRandom.nextFloat(-0.001f, 0.001f);
            float f34 = this.jthy.thw_5() * threadLocalRandom.nextFloat(0.7f, 1.3f);
            f34 *= 1.0f - f27 * 0.4f;
            f = this.zma_2.thw_5() * threadLocalRandom.nextFloat(0.8f, 1.2f);
            if (f < 0.1f) {
                f = 0.1f;
            }
            float f35 = threadLocalRandom.nextFloat() * 360.0f;
            float f36 = threadLocalRandom.nextFloat(-90.0f, 90.0f);
            byq byq2 = this.zdhf_2(l);
            copyOnWriteArrayList.add(new ttz(f28, f29, f30, f31, f32, f33, f34, f, byq2, f35, f36));
        }
        this.rts_4.put(class_13062, Float.valueOf(f24));
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        class_2960 class_29602 = this.hlh.sdh_2() == this.jsn ? Moondlc.id("images/particles/bloom.png") : Moondlc.id("images/particles/glow.png");
        class_4588 class_45882 = class_45972.getBuffer(class_1921.method_23580((class_2960)class_29602));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        for (ttz ttz3 : copyOnWriteArrayList) {
            Vector4f vector4f = new Vector4f(ttz3.zth_3, ttz3.tkgh, ttz3.bhr_2, 1.0f);
            matrix4f.transform(vector4f);
            class_45872.method_22903();
            class_45872.method_46416(vector4f.x, vector4f.y, vector4f.z);
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(ttz3.thwth));
            Matrix4f matrix4f2 = class_45872.method_23760().method_23761();
            byq byq3 = this.dqb_2(ttz3.ghkhs(), ttz3.thft_2);
            f = ttz3.shy_3 / 2.0f;
            class_45882.method_22918(matrix4f2, -f, f, 0.0f).method_1336((int)byq3.sbk(), (int)byq3.srl(), (int)byq3.shsl_2(), (int)byq3.tzdh_2()).method_22913(0.0f, 1.0f).method_22922(class_4608.field_21444).method_60803(n).method_22914(0.0f, 1.0f, 0.0f);
            class_45882.method_22918(matrix4f2, f, f, 0.0f).method_1336((int)byq3.sbk(), (int)byq3.srl(), (int)byq3.shsl_2(), (int)byq3.tzdh_2()).method_22913(1.0f, 1.0f).method_22922(class_4608.field_21444).method_60803(n).method_22914(0.0f, 1.0f, 0.0f);
            class_45882.method_22918(matrix4f2, f, -f, 0.0f).method_1336((int)byq3.sbk(), (int)byq3.srl(), (int)byq3.shsl_2(), (int)byq3.tzdh_2()).method_22913(1.0f, 0.0f).method_22922(class_4608.field_21444).method_60803(n).method_22914(0.0f, 1.0f, 0.0f);
            class_45882.method_22918(matrix4f2, -f, -f, 0.0f).method_1336((int)byq3.sbk(), (int)byq3.srl(), (int)byq3.shsl_2(), (int)byq3.tzdh_2()).method_22913(0.0f, 0.0f).method_22922(class_4608.field_21444).method_60803(n).method_22914(0.0f, 1.0f, 0.0f);
            class_45872.method_22909();
        }
    }

    private byq zdhf_2(long l) {
        try {
            int n = -412892190;
            n = Integer.rotateLeft(n * 1936189961, 8) ^ 0xD7688652;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateRight((int)l ^ n, 9);
            int n2 = n ^ 0x22B422AE;
            if ((n2 ^ n) != 582230702) {
                int cfr_ignored_0 = (0xC5D7E14C ^ n) - 962817376;
            }
            if ((0x344 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (tdhkh.ghjgh()) {
            throw null;
        }
        if (this.jtz_4.sdh_2() == this.zjj) {
            return this.dhshn.sdsh_4();
        }
        if (this.jtz_4.sdh_2() == this.bkhd) {
            float f = (float)(Math.sin((double)l * tdhkh.ghta_4(0x7F8444B222F1404FL ^ 0x40ECD7C69E9B3EB5L)) * Double.longBitsToDouble(0x771AA5212C522DEBL ^ 0x48FAA5212C522DEBL) + Double.longBitsToDouble(0xA11F3541318681BL ^ 0x35F1F3541318681BL));
            return this.dhshn.sdsh_4().dkhw_2(this.hz_4.sdsh_4(), f);
        }
        float f = (float)(l % (0x1A767DC5D84D19EDL ^ 0x1A767DC5D84D164DL)) / Float.intBitsToFloat(1523059063 - 357435767);
        return byq.slz_2(f, 1.0f, 1.0f);
    }

    private byq dqb_2(float f, byq byq2) {
        int n = 1964506831;
        n = Integer.rotateLeft(n * 1013175109, 8) ^ 0x3519CDF8;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 21);
        int n2 = n ^ 0x6838532E;
        if ((n2 ^ n) != 1748521774) {
            int cfr_ignored_0 = (0x1D2FADE1 ^ n) - -1531498277;
        }
        if (!yf.khdha_2()) {
            tdhkh.bff();
        }
        byq byq3 = byq2;
        byq byq4 = tdhkh.rfb(this.jtz_4) == this.bkhd ? tdhkh.ttz_3(this.hz_4) : byq2;
        byq byq5 = tdhkh.ththb(byq3, byq4, f);
        float f2 = 1.0f - f;
        return byq5.thzz_4(f2);
    }

    private static String atd_2(String string, int n, int n2, int n3) {
        int n4 = tkhb.byr(-85422476);
        n4 = Integer.rotateRight(n ^ n4, 10);
        int n5 = (n4 = n2 ^ n4) ^ 0x77D1A0F2;
        if ((n5 ^ n4) != 2010226930) {
            int cfr_ignored_0 = Integer.rotateRight(0x8D392E86 ^ n4, 4) - 508182901;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x4CF76251) + n2 ^ i * -876727663) ^ tthgh) + bda);
        }
        return new String(cArray);
    }

    private static void znn(CopyOnWriteArrayList copyOnWriteArrayList) {
        int n = -2116436834;
        n = Integer.rotateLeft(n * -1710458515, 21) ^ 0x65D225D1;
        CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
        n = (copyOnWriteArrayList2 != null ? System.identityHashCode(copyOnWriteArrayList2) : 0) ^ n;
        int n2 = n ^ 0xA0D4A12A;
        if ((n2 ^ n) != -1596677846) {
            int cfr_ignored_0 = (0x210D1DB4 ^ n) + 622875589;
        }
        copyOnWriteArrayList.clear();
    }

    private static boolean ghjgh() {
        block0: {
            int n = 391515620;
            int n2 = (n = Integer.rotateLeft(n * -896930377, 23) ^ 0x34B3FDAE) ^ 0x70CD989A;
            if ((n2 ^ n) == 1892522138) break block0;
            int cfr_ignored_0 = (0x679B957E ^ n) + 43693439;
        }
        return yf.dnkh();
    }

    private static double ghta_4(long l) {
        block0: {
            int n = -1404087964;
            n = Integer.rotateLeft(n * 964587559, 12) ^ 0x63E64EEC;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 5)) ^ 0xD525219F;
            if ((n2 ^ n) == -718986849) break block0;
            int cfr_ignored_0 = (0x796A70FB ^ n) - -1585269531;
        }
        return Double.longBitsToDouble(l);
    }

    private static void bff() {
        int n = tkhb.byr(413981470);
        int n2 = n ^ 0xEC2E5A7B;
        if ((n2 ^ n) != -332506501) {
            int cfr_ignored_0 = Integer.rotateLeft(0xF4828165 ^ n, 17) - -1607775626;
            int cfr_ignored_1 = (int)(0x36302F5827D4EB4FL ^ (long)n ^ 0xA3C0831A2DB9C1B1L);
        }
        yf.athz_2();
    }

    private static fy rfb(khd khd2) {
        block0: {
            int n = 734334604;
            n = Integer.rotateLeft(n * -1660989015, 6) ^ 0x8860DCF9;
            khd khd3 = khd2;
            n = Integer.rotateLeft((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 6);
            int n2 = n ^ 0x20340769;
            if ((n2 ^ n) == 540280681) break block0;
            int cfr_ignored_0 = (0xBF109E5 ^ n) - -1230035286;
        }
        return khd2.sdh_2();
    }

    private static byq ttz_3(bzw_2 bzw2_2) {
        block0: {
            int n = 1027266637;
            int n2 = (n = Integer.rotateLeft(n * 1248152985, 26) ^ 0xB91AE32D) ^ 0xECC79BE8;
            if ((n2 ^ n) == -322462744) break block0;
            int cfr_ignored_0 = (0xD1FD43A5 ^ n) + -1365885720;
        }
        return bzw2_2.sdsh_4();
    }

    private static byq ththb(byq byq2, byq byq3, float f) {
        block0: {
            int n = 1169384929;
            n = Integer.rotateLeft(n * 1972200601, 7) ^ 0xC2EDFF48;
            byq byq4 = byq2;
            n = (byq4 != null ? System.identityHashCode(byq4) : 0) ^ n;
            byq byq5 = byq3;
            n = (byq5 != null ? System.identityHashCode(byq5) : 0) ^ n;
            int n2 = n ^ 0xC43D30F1;
            if ((n2 ^ n) == -1002622735) break block0;
            int cfr_ignored_0 = (0x818E5510 ^ n) + -1625570865;
        }
        return byq2.dkhw_2(byq3, f);
    }

    private static String[] ssb(String string) {
        block0: {
            int n = tkhb.byr(415020576);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x6E0F3E94;
            if ((n2 ^ n) == 1846492820) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x76B388B4 ^ n, 17) - 1679502599) * 1991477429;
        }
        return string.split("\u0007\u0013", -1);
    }

    private static CallSite hff(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 141579140;
            n3 = Integer.rotateLeft(n3 * 753640773, 10) ^ 0x8A2B52BB;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 25);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 29);
            int n4 = n3 ^ 0xE693481;
            if ((n4 ^ n3) != 241775745) {
                int cfr_ignored_0 = (0x6196705 ^ n3) - -723623803;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sdhh_3 ^ string.hashCode() ^ n2 + dhhd_3 + i * -224778389) + sdhh_3) ^ dhhd_3));
            }
            String[] stringArray = tdhkh.ssb(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xgw13diz(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pc4r23or(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tczid30c1itl ^ string.hashCode() ^ n2 + zevpktyo0k + i * -124534809) + tczid30c1itl) ^ zevpktyo0k));
            }
            String[] stringArray = tdhkh.xgw13diz(new String(cArray));
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

