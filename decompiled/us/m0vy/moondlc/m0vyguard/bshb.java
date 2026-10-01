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
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
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
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.dhdh_5;
import us.m0vy.moondlc.m0vyguard.zsh_3;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.ya_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Hit Particles", category=bzw.OTHER, desc="Creates particles when you hit or get hit")
public class bshb
extends bnq {
    private final khd sab_2 = new khd(this, "Mode");
    private final fy dhghl = new fy(this.sab_2, "Orbiz");
    private final fy shd = new fy(this.sab_2, "Stars");
    private final fy thsy_2 = new fy(this.sab_2, "Hearts");
    private final fy dthkh = new fy(this.sab_2, "Bloom");
    private final bzw_2 thby = new bzw_2(this, "Color").dhshy(new byq(Float.intBitsToFloat(0x6EC53BF1 ^ 0x2DBA3BF1), Float.intBitsToFloat(1141043029 + -20639573), Float.intBitsToFloat(Integer.reverse(1154177725) ^ 0xFF92D322), Float.intBitsToFloat(0xA9F94DEB ^ 0xEA864DEB)));
    private final tay dhkh_4 = new tay(this, "Count").shth_7(Float.intBitsToFloat(130450947 - -947485181)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x9415E357 ^ 0x93D5E356, 30))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(1850849349) ^ 0xE36D8A76));
    private final tay skhk_2 = new tay(this, "Size").shth_7(Float.intBitsToFloat(-1813319294 - 1453204661)).dhbs_2(Float.intBitsToFloat(-972047221 - -2029011829)).rkh_3(Float.intBitsToFloat(-1557752331 + -1728233195)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x9736585C ^ 0x973657FC, 18)));
    private final tay dzgh_2 = new tay(this, "Lifetime").shth_7(Float.intBitsToFloat(0xE55C4191 ^ 0xDA5C4191)).dhbs_2(Float.intBitsToFloat(2011861710 - 933925582)).rkh_3(Float.intBitsToFloat(0xE351238F ^ 0xDE9DEF42)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xD7CF9933 ^ 0xD7CE6733, 13)));
    private final tay khya = new tay(this, "Spread").shth_7(Float.intBitsToFloat(0x95927F0F ^ 0xA931A805)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1153270960) ^ 0x34C7DB47)).rkh_3(Float.intBitsToFloat(0xEBD0176E ^ 0xD7F3C064)).ssd_5(Float.intBitsToFloat(561272637 - -472874957));
    private final tay tdhh = new tay(this, "Gravity").shth_7(Float.intBitsToFloat(1733677575 + -733084413)).dhbs_2(Float.intBitsToFloat(614729188 - -408009899)).rkh_3(Float.intBitsToFloat(Integer.reverse(-2078845850) ^ 0x5CA9FA4E)).ssd_5(Float.intBitsToFloat(Integer.reverse(327100559) ^ 0xCD613C47));
    private final tay sts_2 = new tay(this, "Fade Speed").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x3274813A ^ 0x75A7B209, 3))).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x2B471DFA ^ 0x4D217414, 21))).ssd_5(1.0f);
    private final badh_2 zthh_2 = new badh_2(this, "Color Animation").bts(false);
    private final CopyOnWriteArrayList zw_2 = new CopyOnWriteArrayList();
    private int shsw = -1;
    private final bql<bthy> khhdh = this::ghha_2;
    private final bql<ya_2> sts_6 = this::ddh_6;
    private final bql<shw_3> jrth = this::akkh;
    private static final int r_2 = -1663413067;
    private static final int jhb_2 = 577110463;
    private static final int dndh = -842821824;
    private static final int khyk = -866250355;
    private static final int kokhmjbj73ai = 159298266;
    private static final int rvtbgro0tg96m = 1116394278;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int k3hjc003icfnte;

    @Override
    public void nc() {
        int n = -2018033093;
        n = Integer.rotateLeft(n * 738938519, 3) ^ 0x26B813A5;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0xEF2E4A33;
        if ((n2 ^ n) != -282179021) {
            int cfr_ignored_0 = (0x68990808 ^ n) - -27653957;
        }
        this.zw_2.clear();
        this.shsw = -1;
    }

    private void tdd_7(class_243 class_2432) {
        int n = 1982107751;
        n = Integer.rotateLeft(n * -834681399, 11) ^ 0x43DED07A;
        class_243 class_2433 = class_2432;
        n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
        int n2 = n ^ 0x173D89A5;
        if ((n2 ^ n) != 389908901) {
            int cfr_ignored_0 = (0x611919C2 ^ n) - 1593919425;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int n3 = Math.round(this.dhkh_4.thw_5());
        float f = this.khya.thw_5();
        for (int i = 0; i < n3; ++i) {
            this.zw_2.add(new zsh_3(this, class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, threadLocalRandom.nextDouble(-f, f), threadLocalRandom.nextDouble(-f, f), threadLocalRandom.nextDouble(-f, f), threadLocalRandom.nextFloat(0.0f, Float.intBitsToFloat(-1915995246 - 1243102098)), bshb.aks(threadLocalRandom, bshb.dqf(0x82CCAEA3 ^ 0xC36CAEA3), Float.intBitsToFloat(-1433323541 + -1743861739)), this.zw_2.size()));
        }
    }

    private void rdhdh() {
        for (zsh_3 zsh2 : this.zw_2) {
            if (!zsh2.sdy_2()) continue;
            this.zw_2.remove(zsh2);
        }
    }

    private void ashj(shw_3 shw2) {
        if (this.zw_2.isEmpty() || bshb.mc.field_1773 == null || bshb.mc.field_1773.method_19418() == null) {
            return;
        }
        if (this.dhghl.shghkh()) {
            for (zsh_3 zsh2 : this.zw_2) {
                this.tst(shw2.ssha_2(), zsh2, shw2.skz_4());
            }
            return;
        }
        class_2960 class_29602 = this.thsy_2.shghkh() ? Moondlc.id("images/particles/heart.png") : (this.dthkh.shghkh() ? Moondlc.id("images/particles/bloom.png") : Moondlc.id("images/particles/star.png"));
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        for (zsh_3 zsh3 : this.zw_2) {
            this.sta_4(shw2.ssha_2(), zsh3, shw2.skz_4());
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableDepthTest();
        RenderSystem.disableBlend();
    }

    private void sta_4(class_4587 class_45872, zsh_3 zsh2, float f) {
        double d = this.dhra(zsh2.bzn_2, zsh2.rath_2, f) - bshb.mc.field_1773.method_19418().method_19326().field_1352;
        double d2 = this.dhra(zsh2.tshz_2, zsh2.rbsh, f) - bshb.mc.field_1773.method_19418().method_19326().field_1351 + 0.1;
        double d3 = this.dhra(zsh2.thtz_2, zsh2.dhkhw, f) - bshb.mc.field_1773.method_19418().method_19326().field_1350;
        float f2 = zsh2.mn();
        if (f2 <= 0.001f) {
            return;
        }
        Color color = zsh2.stth_4(f2);
        float f3 = this.skhk_2.thw_5() / 2.0f;
        class_45872.method_22903();
        class_45872.method_22904(d, d2, d3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-bshb.mc.field_1773.method_19418().method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(bshb.mc.field_1773.method_19418().method_19329()));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(zsh2.zft_2));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, -f3, f3, 0.0f).method_22913(0.0f, 1.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_2872.method_22918(matrix4f, f3, f3, 0.0f).method_22913(1.0f, 1.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_2872.method_22918(matrix4f, f3, -f3, 0.0f).method_22913(1.0f, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_2872.method_22918(matrix4f, -f3, -f3, 0.0f).method_22913(0.0f, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_286.method_43433((class_9801)class_2872.method_60800());
        class_45872.method_22909();
    }

    private void tst(class_4587 class_45872, zsh_3 zsh2, float f) {
        double d = this.dhra(zsh2.bzn_2, zsh2.rath_2, f) - bshb.mc.field_1773.method_19418().method_19326().field_1352;
        double d2 = this.dhra(zsh2.tshz_2, zsh2.rbsh, f) - bshb.mc.field_1773.method_19418().method_19326().field_1351 + 0.1;
        double d3 = this.dhra(zsh2.thtz_2, zsh2.dhkhw, f) - bshb.mc.field_1773.method_19418().method_19326().field_1350;
        float f2 = zsh2.mn();
        if (f2 <= 0.001f) {
            return;
        }
        Color color = zsh2.stth_4(f2 * 0.4f);
        class_45872.method_22903();
        class_45872.method_22904(d, d2, d3);
        class_45872.method_22905(this.skhk_2.thw_5(), this.skhk_2.thw_5(), this.skhk_2.thw_5());
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-bshb.mc.field_1773.method_19418().method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(bshb.mc.field_1773.method_19418().method_19329()));
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        for (double d4 : new double[]{0.3, 0.5, 0.7}) {
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1576);
            for (int i = 0; i <= 20; ++i) {
                float f3 = (float)(Math.sin((float)i * 56.548656f / 180.0f) * d4);
                float f4 = (float)(Math.cos((float)i * 56.548656f / 180.0f) * d4);
                class_2872.method_22918(matrix4f, f3, f4, 0.0f).method_22915((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
            }
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        RenderSystem.disableBlend();
        class_45872.method_22909();
    }

    private double dhra(double d, double d2, float f) {
        block0: {
            int n = dhdh_5.hdd_2(1545996470);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xD33BC786;
            if ((n2 ^ n) == -751057018) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8F1DCF30 ^ n, 4) + 1492760075) * -1893871823;
        }
        return d + (d2 - d) * (double)f;
    }

    private void akkh(shw_3 shw2) {
        int n = 1772379377;
        n = Integer.rotateLeft(n * 2100776155, 10) ^ 0x344C1D3E;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
        shw_3 shw3 = shw2;
        n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
        int n2 = n ^ 0x33550C59;
        if ((n2 ^ n) != 861211737) {
            int cfr_ignored_0 = (0x5AF150A8 ^ n) + 1014002429;
        }
        this.ashj(shw2);
    }

    private void ddh_6(ya_2 ya2) {
        try {
            int n = -163178344;
            n = Integer.rotateLeft(n * 1536433665, 7) ^ 0xD50A5602;
            ya_2 ya3 = ya2;
            n = Integer.rotateRight((ya3 != null ? System.identityHashCode(ya3) : 0) ^ n, 25);
            int n2 = n ^ 0xA508F9F5;
            if ((n2 ^ n) != -1526138379) {
                int cfr_ignored_0 = (0x534EE16D ^ n) + 923111862;
            }
            if ((0x30D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        this.rdhdh();
        if (bshb.mc.field_1724 != null && bshb.mc.field_1724.field_6235 == Integer.rotateLeft(0x58E6C9CD ^ 0x58E6C3CD, 24) && bshb.mc.field_1724.field_6012 != this.shsw) {
            this.shsw = bshb.mc.field_1724.field_6012;
            this.tdd_7(bshb.mc.field_1724.method_19538().method_1031(0.0, (double)bshb.mc.field_1724.method_17682() / Double.longBitsToDouble(0xF366D27F525D578EL ^ 0xB366D27F525D578EL), 0.0));
        }
    }

    private void ghha_2(bthy bthy2) {
        class_1309 class_13092;
        int n = 517029503;
        n = Integer.rotateLeft(n * 1575360575, 25) ^ 0xEDB33073;
        bthy bthy3 = bthy2;
        n = (bthy3 != null ? System.identityHashCode(bthy3) : 0) ^ n;
        int n2 = n ^ 0xD883057A;
        if ((n2 ^ n) != -662502022) {
            int cfr_ignored_0 = (0xC6523B05 ^ n) - 1247380776;
        }
        if (yf.dnkh()) {
            throw null;
        }
        class_1297 class_12972 = bthy2.khtf();
        if (class_12972 instanceof class_1309 && (class_13092 = (class_1309)class_12972).method_5805()) {
            this.tdd_7(class_13092.method_19538().method_1031(0.0, (double)class_13092.method_17682() / Double.longBitsToDouble(0x37FCFFAB6D614406L ^ 0x77FCFFAB6D614406L), 0.0));
        }
    }

    private static String dhzdh_2(String string, int n, int n2, int n3) {
        int n4 = dhdh_5.hdd_2(-646754572);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 9)) ^ 0x66C397C;
        if ((n5 ^ n4) != 107755900) {
            int cfr_ignored_0 = Integer.rotateLeft(0xDF1F7788 ^ n4, 14) + 153950387;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xC176383A) + r_2 ^ Integer.reverse(n2 + i * -1775601981), 4) - jhb_2);
        }
        return new String(cArray);
    }

    private static float dqf(int n) {
        block0: {
            int n2 = -1040839895;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1664988153, 22) ^ 0x2EDF0725) ^ 0x550C580;
            if ((n3 ^ n2) == 89179520) break block0;
            int cfr_ignored_0 = (0xC4A6CEA9 ^ n2) - -1655632107;
        }
        return Float.intBitsToFloat(n);
    }

    private static float aks(ThreadLocalRandom threadLocalRandom, float f, float f2) {
        block0: {
            int n = 1214242969;
            int n2 = (n = Integer.rotateLeft(n * 271135359, 6) ^ 0x4556125C) ^ 0x3299594A;
            if ((n2 ^ n) == 848910666) break block0;
            int cfr_ignored_0 = (0x7AC6B9D3 ^ n) + -832338118;
        }
        return threadLocalRandom.nextFloat(f, f2);
    }

    private static String[] dwdh(String string) {
        int n = dhdh_5.hdd_2(879931211);
        int n2 = n ^ 0xC7D01625;
        if ((n2 ^ n) != -942664155) {
            int cfr_ignored_0 = Integer.rotateRight(0xF3A2B96E ^ n, 17) - -2062412915;
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

    private static CallSite tdhj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1264393554;
            n3 = Integer.rotateLeft(n3 * -105015769, 14) ^ 0x541626A9;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 18);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xA4DD0D60;
            if ((n4 ^ n3) != -1529016992) {
                int cfr_ignored_0 = (0xEF801032 ^ n3) + 544821175;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dndh ^ string.hashCode() ^ n2 + khyk ^ i * 1788108923 ^ dndh, 22) ^ khyk));
            }
            String[] stringArray = bshb.dwdh(new String(cArray));
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

    private static String[] y6vhdqzp(String string) {
        return string.split("\u0004\u0019", -1);
    }

    private static CallSite bdajxyv4ltxj3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ kokhmjbj73ai ^ string.hashCode() ^ n2 + rvtbgro0tg96m ^ i * -333855777 ^ kokhmjbj73ai, 13) ^ rvtbgro0tg96m));
            }
            String[] stringArray = bshb.y6vhdqzp(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

