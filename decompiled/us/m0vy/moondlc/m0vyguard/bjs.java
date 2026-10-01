/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1923
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_2902$class_2903
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_631
 *  net.minecraft.class_638
 *  net.minecraft.class_7923
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2902;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_631;
import net.minecraft.class_638;
import net.minecraft.class_7923;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmr;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.ts_4;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Block ESP", category=bzw.OTHER, desc="Highlights selected blocks in the world")
public class bjs
extends bnq {
    private final bzw_2 tww = new bzw_2(this, "Color").dhshy(new byq(Float.intBitsToFloat(0xB302E684 ^ 0xF07DE684), 0.0f, 0.0f, Float.intBitsToFloat(Integer.rotateLeft(0x25B6E033 ^ 0x2896E032, 30))));
    private final tay tza_4 = new tay(this, "Range").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xD6EFF640 ^ 0xD6EFE680, 18))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xF75B7E5A ^ 0xF75B7E7B, 25)));
    private final badh_2 sshs = new badh_2(this, "Notify").bts(false);
    private final ts_4 lth = new ts_4(this, "Blocks").tshgh("minecraft:diamond_ore,minecraft:ancient_debris");
    private final Map tra_2 = new ConcurrentHashMap();
    private final Set jdhd = new HashSet();
    private long dhah_3;
    private int jlgh;
    private boolean thah = false;
    private final bql<shw_3> jsht_2 = this::shmz;
    private static final int jykh = -854362124;
    private static final int dhl_2 = 2057144918;
    private static final int dkhh = 1358039357;
    private static final int dkh = -402746418;
    private static final int ohmfks4piz = 153986870;
    private static final int efn4poqdjtf = 1769024668;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nnnut23q4q;

    @Override
    public void nt() {
        int n = -1374796148;
        n = Integer.rotateLeft(n * 2068206779, 6) ^ 0xB3B436AD;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x781146B7;
        if ((n2 ^ n) != 2014398135) {
            int cfr_ignored_0 = (0xD61F003B ^ n) - 191689253;
        }
        this.tra_2.clear();
        this.jdhd.clear();
        this.dhah_3 = 0L;
        this.jlgh = 0;
    }

    @Override
    public void nc() {
        int n = bmr.ahs(-290981185);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
        int n2 = n ^ 0xFE5E104D;
        if ((n2 ^ n) != -27389875) {
            int cfr_ignored_0 = (Integer.rotateRight(0x10F9EAF2 ^ n, 5) + 312545929) * 284814067;
        }
        this.tra_2.clear();
        this.jdhd.clear();
    }

    private void jas(class_4587 class_45872, class_238 class_2382, byq byq2) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f = byq2.sbk() / 255.0f;
        float f2 = byq2.srl() / 255.0f;
        float f3 = byq2.shsl_2() / 255.0f;
        float f4 = byq2.tzdh_2() / 255.0f;
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        this.tshr(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1322, class_2382.field_1321, class_2382.field_1320, class_2382.field_1322, class_2382.field_1321, class_2382.field_1320, class_2382.field_1325, class_2382.field_1321, class_2382.field_1323, class_2382.field_1325, class_2382.field_1321, f, f2, f3, f4);
        this.tshr(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1322, class_2382.field_1324, class_2382.field_1320, class_2382.field_1322, class_2382.field_1324, class_2382.field_1320, class_2382.field_1325, class_2382.field_1324, class_2382.field_1323, class_2382.field_1325, class_2382.field_1324, f, f2, f3, f4);
        this.tshr(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1322, class_2382.field_1321, class_2382.field_1323, class_2382.field_1322, class_2382.field_1324, class_2382.field_1323, class_2382.field_1325, class_2382.field_1324, class_2382.field_1323, class_2382.field_1325, class_2382.field_1321, f, f2, f3, f4);
        this.tshr(class_2872, matrix4f, class_2382.field_1320, class_2382.field_1322, class_2382.field_1321, class_2382.field_1320, class_2382.field_1322, class_2382.field_1324, class_2382.field_1320, class_2382.field_1325, class_2382.field_1324, class_2382.field_1320, class_2382.field_1325, class_2382.field_1321, f, f2, f3, f4);
        this.tshr(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1322, class_2382.field_1321, class_2382.field_1320, class_2382.field_1322, class_2382.field_1321, class_2382.field_1320, class_2382.field_1322, class_2382.field_1324, class_2382.field_1323, class_2382.field_1322, class_2382.field_1324, f, f2, f3, f4);
        this.tshr(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1325, class_2382.field_1321, class_2382.field_1320, class_2382.field_1325, class_2382.field_1321, class_2382.field_1320, class_2382.field_1325, class_2382.field_1324, class_2382.field_1323, class_2382.field_1325, class_2382.field_1324, f, f2, f3, f4);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private void rbn(class_4587 class_45872, class_238 class_2382, byq byq2) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f = byq2.sbk() / 255.0f;
        float f2 = byq2.srl() / 255.0f;
        float f3 = byq2.shsl_2() / 255.0f;
        float f4 = byq2.tzdh_2() / 255.0f;
        RenderSystem.lineWidth((float)1.5f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1322, class_2382.field_1321, class_2382.field_1320, class_2382.field_1322, class_2382.field_1321, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1320, class_2382.field_1322, class_2382.field_1321, class_2382.field_1320, class_2382.field_1322, class_2382.field_1324, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1320, class_2382.field_1322, class_2382.field_1324, class_2382.field_1323, class_2382.field_1322, class_2382.field_1324, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1322, class_2382.field_1324, class_2382.field_1323, class_2382.field_1322, class_2382.field_1321, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1325, class_2382.field_1321, class_2382.field_1320, class_2382.field_1325, class_2382.field_1321, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1320, class_2382.field_1325, class_2382.field_1321, class_2382.field_1320, class_2382.field_1325, class_2382.field_1324, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1320, class_2382.field_1325, class_2382.field_1324, class_2382.field_1323, class_2382.field_1325, class_2382.field_1324, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1325, class_2382.field_1324, class_2382.field_1323, class_2382.field_1325, class_2382.field_1321, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1322, class_2382.field_1321, class_2382.field_1323, class_2382.field_1325, class_2382.field_1321, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1320, class_2382.field_1322, class_2382.field_1321, class_2382.field_1320, class_2382.field_1325, class_2382.field_1321, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1323, class_2382.field_1322, class_2382.field_1324, class_2382.field_1323, class_2382.field_1325, class_2382.field_1324, f, f2, f3, f4);
        this.tyd_2(class_2872, matrix4f, class_2382.field_1320, class_2382.field_1322, class_2382.field_1324, class_2382.field_1320, class_2382.field_1325, class_2382.field_1324, f, f2, f3, f4);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.lineWidth((float)1.0f);
    }

    private void tshr(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, float f, float f2, float f3, float f4) {
        int n = 1300801064;
        n = Integer.rotateLeft(n * 7698793, 3) ^ 0x76C7BF54;
        class_287 class_2873 = class_2872;
        n = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n;
        n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 14);
        int n2 = n ^ 0x9E1F6C24;
        if ((n2 ^ n) != -1642107868) {
            int cfr_ignored_0 = (0xD397CA0C ^ n) - -1543804308;
        }
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_22915(f, f2, f3, f4);
        bjs.jrz_2(class_2872, matrix4f, (float)d4, (float)d5, (float)d6).method_22915(f, f2, f3, f4);
        bjs.thzs_4(class_2872, matrix4f, (float)d7, (float)d8, (float)d9).method_22915(f, f2, f3, f4);
        bjs.sthl(class_2872, matrix4f, (float)d10, (float)d11, (float)d12).method_22915(f, f2, f3, f4);
    }

    private void tyd_2(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, double d4, double d5, double d6, float f, float f2, float f3, float f4) {
        int n = -441159479;
        n = Integer.rotateLeft(n * -234063055, 19) ^ 0x43953ACE;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
        n = (int)Double.doubleToLongBits(d) ^ n;
        int n2 = n ^ 0x6B60D23A;
        if ((n2 ^ n) != 1801507386) {
            int cfr_ignored_0 = (0x8ED4A2F3 ^ n) - -762143007;
        }
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_22915(f, f2, f3, f4);
        bjs.dhw(class_2872, matrix4f, (float)d4, (float)d5, (float)d6).method_22915(f, f2, f3, f4);
    }

    private void thhl_2(class_2338 class_23382, Set set, Map map) {
        int n = -816033275;
        n = Integer.rotateLeft(n * -1944416873, 20) ^ 0xDD6C255B;
        n = System.identityHashCode(this) ^ n;
        Map map2 = map;
        n = (map2 != null ? System.identityHashCode(map2) : 0) ^ n;
        int n2 = n ^ 0xA00F7372;
        if ((n2 ^ n) != -1609600142) {
            int cfr_ignored_0 = (0x6F532177 ^ n) - -1987826832;
        }
        int n3 = 2;
        int n4 = -1202601650 - -1202601698;
        double d = this.tza_4.thw_5() * this.tza_4.thw_5();
        for (int i = -n3; i <= n3; ++i) {
            for (int j = -n3; j <= n3; ++j) {
                class_2818 class_28182;
                int n5;
                int n6 = (class_23382.method_10263() >> 4) + i;
                if (!bjs.mc.field_1687.method_8393(n6, n5 = (bjs.szb_3(class_23382) >> 4) + j) || (class_28182 = bjs.mc.field_1687.method_2935().method_12126(n6, n5, false)) == null) continue;
                int n7 = bjs.haa_3((class_2818)class_28182).field_9181 << 4;
                int n8 = bjs.jhk((class_2818)class_28182).field_9180 << 4;
                for (int k = 0; k < (Integer.reverse(-53003744) ^ 0x45CEB2F); ++k) {
                    for (int i2 = 0; i2 < (Integer.reverse(1322603356) ^ 0x3ACAAB62); ++i2) {
                        int n9 = bjs.hs_3(bjs.tzs_6(bjs.mc.field_1687), bjs.ssd_4(class_23382) - n4);
                        int n10 = Math.min(bjs.mc.field_1687.method_8624(class_2902.class_2903.field_13202, n7 + k, n8 + i2), class_23382.method_10264() + n4);
                        for (int i3 = n9; i3 <= n10; ++i3) {
                            this.bash(new class_2338(n7 + k, i3, n8 + i2), d, set, map);
                        }
                    }
                }
            }
        }
    }

    private void shtkh_2(class_2338 class_23382, Set set, Map map) {
        int n = 540456379;
        n = Integer.rotateLeft(n * 1776933813, 15) ^ 0x4CE0BE4D;
        Map map2 = map;
        n = (map2 != null ? System.identityHashCode(map2) : 0) ^ n;
        int n2 = n ^ 0xCF88DFAA;
        if ((n2 ^ n) != -813113430) {
            int cfr_ignored_0 = (0xEFBE6A11 ^ n) + -1701762994;
        }
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                class_2818 class_28182;
                int n3;
                int n4 = (class_23382.method_10263() >> 4) + i;
                if (!bjs.mc.field_1687.method_8393(n4, n3 = (bjs.ddht_4(class_23382) >> 4) + j) || (class_28182 = bjs.shf_3(bjs.mc.field_1687.method_2935(), n4, n3, false)) == null) continue;
                int n5 = class_28182.method_12004().field_9181 << 4;
                int n6 = bjs.rjth((class_2818)class_28182).field_9180 << 4;
                for (int k = 0; k < -1141641425 + 1141641441; ++k) {
                    for (int i2 = 0; i2 < 2071111934 + -2071111918; ++i2) {
                        int n7 = Math.max(bjs.mc.field_1687.method_31607(), class_23382.method_10264() - (-2022517190 + 2022517214));
                        int n8 = Math.min(bjs.mc.field_1687.method_8624(class_2902.class_2903.field_13202, n5 + k, n6 + i2), class_23382.method_10264() + (721383113 - 721383089));
                        for (int i3 = n7; i3 <= n8; ++i3) {
                            this.bash(new class_2338(n5 + k, i3, n6 + i2), Double.longBitsToDouble(0xBBEE9F2D8791025EL ^ 0xFB9E9F2D8791025EL), set, map);
                        }
                    }
                }
            }
        }
    }

    private void bash(class_2338 class_23382, double d, Set set, Map map) {
        int n = 128981856;
        n = Integer.rotateLeft(n * 1297319149, 11) ^ 0x85BABF6;
        n = System.identityHashCode(this) ^ n;
        class_2338 class_23383 = class_23382;
        n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
        int n2 = n ^ 0x264FBB1D;
        if ((n2 ^ n) != 642759453) {
            int cfr_ignored_0 = (0x21FFA07D ^ n) - -62058502;
        }
        if (bjs.mc.field_1724.method_5649((double)class_23382.method_10263() + Double.longBitsToDouble(0x34229E149E6406ACL ^ 0xBC29E149E6406ACL), (double)class_23382.method_10264() + bjs.shthf(0x5E510D61B0E3C493L ^ 0x61B10D61B0E3C493L), (double)class_23382.method_10260() + Double.longBitsToDouble(0xCF70A3F835DF1781L ^ 0xF090A3F835DF1781L)) > d) {
            return;
        }
        class_2680 class_26802 = bjs.mc.field_1687.method_8320(class_23382);
        class_2248 class_22482 = bjs.hth(class_26802);
        String string = class_7923.field_41175.method_10221((Object)class_22482).toString().toLowerCase();
        String string2 = bjs.drb(class_7923.field_41175.method_10221((Object)class_22482).method_12832());
        if (!set.contains(string) && !set.contains(string2)) {
            return;
        }
        class_2338 class_23384 = class_23382.method_10062();
        map.put(class_23384, class_26802);
        if (bjs.ryl(this.sshs) && this.jdhd.add(class_23384) && bjs.mc.field_1724 != null) {
            mc.execute(() -> bjs.shrn(string, class_23382));
        }
    }

    private static void shrn(String string, class_2338 class_23382) {
        int n = 1819502667;
        n = Integer.rotateLeft(n * -1637454927, 22) ^ 0xBC7D990A;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        class_2338 class_23383 = class_23382;
        n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
        int n2 = n ^ 0x2EEA9EAC;
        if ((n2 ^ n) != 787127980) {
            int cfr_ignored_0 = (0x4299F6E7 ^ n) - -118580689;
        }
        bjs.mc.field_1724.method_7353((class_2561)class_2561.method_43470((String)("§8[§bBlockESP§8] §f" + string + " at " + class_23382.method_10263() + ", " + class_23382.method_10264() + ", " + class_23382.method_10260())), false);
    }

    private void shmz(shw_3 shw2) {
        Object object2;
        int n = bmr.ahs(883924976);
        shw_3 shw3 = shw2;
        n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
        int n2 = n ^ 0x9D0D1BE;
        if ((n2 ^ n) != 164680126) {
            int cfr_ignored_0 = Integer.rotateRight(0x3D7F4E4E ^ n, 10) - 1992825517;
        }
        if (bjs.mc.field_1687 == null || bjs.mc.field_1724 == null) {
            this.tra_2.clear();
            return;
        }
        String string = this.lth.dysh();
        if (string == null || string.trim().isEmpty()) {
            this.tra_2.clear();
            return;
        }
        HashSet<String> hashSet = new HashSet<String>();
        for (Object object2 : string.split(",")) {
            hashSet.add(((String)object2).trim().toLowerCase());
        }
        class_2338 class_23382 = bjs.mc.field_1724.method_24515();
        long l = System.currentTimeMillis();
        if (l - this.dhah_3 >= (0x83B8E2A05E4ADD26L ^ 0x83B8E2A05E4ADAF6L) && !this.thah) {
            this.thah = true;
            this.dhah_3 = l;
            this.jlgh = 0;
            CompletableFuture.runAsync(() -> this.jym(class_23382, hashSet));
        }
        if (this.jlgh % 5 == 0 && !this.thah) {
            CompletableFuture.runAsync(() -> this.dhghgh(class_23382, hashSet));
        }
        if (this.jlgh % (1248825699 - 1248825639) == 0) {
            this.tra_2.entrySet().removeIf(arg_0 -> this.jaz_4(hashSet, arg_0));
        }
        ++this.jlgh;
        object2 = this.tww.sdsh_4();
        class_243 class_2432 = bjs.mc.field_1773.method_19418().method_19326();
        class_4587 class_45872 = shw2.ssha_2();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        for (class_2338 class_23383 : this.tra_2.keySet()) {
            class_238 class_2382 = new class_238(class_23383).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
            this.rbn(class_45872, class_2382, (byq)object2);
            this.jas(class_45872, class_2382, ((byq)object2).tkhl_2(Float.intBitsToFloat(1549910884 + -435274596)));
        }
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private boolean jaz_4(Set set, Map.Entry entry) {
        class_2338 class_23382;
        String string;
        boolean bl;
        int n = -463138531;
        n = Integer.rotateLeft(n * 764721369, 15) ^ 0x4DE0DD01;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 2);
        Set set2 = set;
        n = Integer.rotateRight((set2 != null ? System.identityHashCode(set2) : 0) ^ n, 9);
        int n2 = n ^ 0x33B92A58;
        if ((n2 ^ n) != 867773016) {
            int cfr_ignored_0 = (0xD7DC3B45 ^ n) + -598365357;
        }
        boolean bl2 = bl = !set.contains(string = class_7923.field_41175.method_10221((Object)bjs.mc.field_1687.method_8320(class_23382 = (class_2338)entry.getKey()).method_26204()).toString());
        if (bl) {
            this.jdhd.remove(class_23382);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private void dhghgh(class_2338 var1_1, Set var2_2) {
        var6_3 = 0;
        var4_4 = -736313071;
        var4_4 = Integer.rotateLeft(var4_4 * 745444785, 25) ^ -86035106;
        v0 = var1_1;
        var4_4 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var4_4;
        var5_5 = Integer.reverse(Integer.reverse(-46908976 + var4_4));
        while (true) {
            block30: {
                block38: {
                    block34: {
                        block35: {
                            block36: {
                                block31: {
                                    block33: {
                                        block40: {
                                            block32: {
                                                block37: {
                                                    block39: {
                                                        block41: {
                                                            var6_3 = var5_5 - var4_4;
                                                            switch (var6_3 & 7) {
                                                                case 0: {
                                                                    if (var6_3 == -46908976) break;
                                                                    if (var6_3 != 931108032) {
                                                                        Integer.rotateLeft(-877161816 ^ var4_4, 12) + -1348968045;
                                                                        ** break;
                                                                    }
                                                                    break block30;
                                                                }
                                                                case 7: {
                                                                    if (var6_3 != -1524418873) {
                                                                        ** break;
                                                                    }
                                                                    break block31;
                                                                }
                                                                case 5: {
                                                                    if (var6_3 == -1258193763) break block32;
                                                                    if (var6_3 == -260225979) break block33;
                                                                    Integer.rotateRight(1140634222 ^ var4_4, 11) - 1073166989;
                                                                    if (var6_3 == -1977110883) break block34;
                                                                    if (var6_3 == -710799659) break block35;
                                                                    if (var6_3 != 1375216717) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 1: {
                                                                    if (var6_3 != -1906105599) {
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                                case 3: {
                                                                    if (var6_3 == -966329925) break block38;
                                                                    if (var6_3 == 895305051) break block39;
                                                                    (Integer.rotateLeft(-1171299979 ^ var4_4, 10) - -1877316506) * -1171299979;
                                                                    (int)(8691330764707785551L ^ (long)var4_4 ^ 7196896352997563626L);
                                                                    if (var6_3 != 1990091283) {
                                                                        ** break;
                                                                    }
                                                                    break block40;
                                                                }
                                                                case 4: {
                                                                    if (var6_3 != -944554540) {
                                                                        ** break;
                                                                    }
                                                                    break block41;
                                                                }
                                                            }
                                                            Integer.rotateRight(174564770 ^ var4_4, 4) + 1189785049;
                                                            if (yf.khdha_2()) {
                                                                try {
                                                                    var6_3 -= 2;
                                                                    var5_5 = -944554540 + var4_4;
                                                                }
                                                                catch (IllegalStateException v1) {
                                                                    var5_5 = -944554540 + var4_4;
                                                                }
                                                                var6_3 += 3;
                                                                continue;
                                                            }
                                                            var5_5 = (int)((long)(-2146495363 + var4_4) ^ -3639428496749473966L ^ -3639428496749473966L);
                                                            (Integer.rotateLeft(1590893913 ^ var4_4, 14) + 2146315522) * 1590893913;
                                                            (int)(-7178259088305493169L ^ (long)var4_4 ^ -7225881453656500974L);
                                                            var5_5 = (int)((long)(895305051 + var4_4) ^ -8337988528348429042L ^ -8337988528348429042L);
                                                            ++var6_3;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(39523696 ^ var4_4, 3) + 1298479051) * 39523697;
                                                        var3_6 = new HashMap<K, V>();
                                                        this.shtkh_2(var1_1, var2_2, var3_6);
                                                        bjs.mc.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, ssf(java.util.Map ), ()V)((bjs)this, var3_6));
                                                        return;
                                                    }
                                                    (Integer.rotateRight(-576107937 ^ var4_4, 14) - -606232388) * -576107937;
                                                    yf.athz_2();
                                                    throw null;
                                                }
                                                (Integer.rotateRight(-1108586286 ^ var4_4, 10) + 66807977) * -1108586285;
                                                var5_5 = 620088687 + var4_4 ^ 752191226 ^ 752191226;
                                                Integer.rotateRight(-942050718 ^ var4_4, 11) + 934443289;
                                                try {
                                                    if ((-4849574739896803649L ^ (long)var4_4 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var5_5 = (int)((long)(-46908976 + var4_4) ^ -7935997796669764888L ^ -7935997796669764888L);
                                                }
                                                catch (IllegalStateException v2) {
                                                    var5_5 = (int)((long)(-46908976 + var4_4) ^ -8083102903269023854L ^ -8083102903269023854L);
                                                }
                                                continue;
                                            }
                                            (Integer.rotateLeft(841750128 ^ var4_4, 9) + 397694667) * 841750129;
                                            try {
                                                var6_3 += 3;
                                                var5_5 = -46908976 + var4_4 + -677327479 - -677327479;
                                            }
                                            catch (IllegalArgumentException v3) {
                                                var5_5 = Integer.reverse(Integer.reverse(-46908976 + var4_4));
                                            }
                                            ++var6_3;
                                            continue;
                                        }
                                        Integer.rotateLeft(1414949892 ^ var4_4, 13) - 987018167;
                                        (int)(1874187154347496306L ^ (long)var4_4 ^ 2009236849259944405L);
                                        var5_5 = 1594163460 + var4_4 ^ 1285473438 ^ 1285473438;
                                        (int)(6486435163354147064L ^ (long)var4_4 ^ 1847874514778003929L);
                                        var5_5 = Integer.reverse(Integer.reverse(-46908976 + var4_4));
                                        continue;
                                    }
                                    Integer.rotateLeft(-870943836 ^ var4_4, 12) - -1156210665;
                                    var5_5 = -1314889216 + var4_4 ^ -1820278108 ^ -1820278108;
                                    Integer.rotateRight(-2126773906 ^ var4_4, 3) - -1432237171;
                                    try {
                                        var6_3 += 5;
                                        if ((-2614945342152675881L ^ (long)var4_4 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var5_5 = -46908976 + var4_4;
                                    }
                                    catch (ArithmeticException v4) {
                                        var5_5 = Integer.reverse(Integer.reverse(-46908976 + var4_4));
                                    }
                                    var6_3 += 2;
                                    continue;
                                }
                                Integer.rotateRight(719821379 ^ var4_4, 8) + 912870744;
                                var5_5 = Integer.reverse(Integer.reverse(-46908976 + var4_4));
                                Integer.rotateLeft(677738688 ^ var4_4, 8) + -391692677;
                                continue;
                            }
                            (Integer.rotateLeft(-2054383180 ^ var4_4, 3) - 811875335) * -2054383179;
                            try {
                                var6_3 -= 2;
                                var5_5 = Integer.reverse(Integer.reverse(-46908976 + var4_4));
                            }
                            catch (UnsupportedOperationException v5) {
                                var5_5 = -46908976 + var4_4;
                            }
                            var6_3 -= 2;
                            continue;
                        }
                        Integer.rotateLeft(311964620 ^ var4_4, 5) - 1154213103;
                        var5_5 = -97615424 + var4_4;
                        (Integer.rotateRight(-1072557454 ^ var4_4, 11) + 1183701769) * -1072557453;
                        (int)(8603134513458771878L ^ (long)var4_4 ^ 1149728016376218393L);
                        var5_5 = -540308172 + var4_4 + -1246207606 - -1246207606;
                        (int)(4502570127843467186L ^ (long)var4_4 ^ 5920298892511138089L);
                        var5_5 = (int)((long)(-46908976 + var4_4) ^ 2229534849772421917L ^ 2229534849772421917L);
                        continue;
                    }
                    (Integer.rotateLeft(-1053735472 ^ var4_4, 11) + 1767183211) * -1053735471;
                    var5_5 = -46908976 + var4_4 ^ 52662022 ^ 52662022;
                    continue;
                }
                Integer.rotateRight(-1677229073 ^ var4_4, 6) - -381249236;
                var5_5 = -1802072245 + var4_4;
                Integer.rotateRight(2029158850 ^ var4_4, 18) + -1447340615;
                var5_5 = Integer.reverse(Integer.reverse(-1069572097 + var4_4));
                Integer.rotateRight(-242410237 ^ var4_4, 17) + 1148461720;
                var5_5 = -46908976 + var4_4 ^ 981607201 ^ 981607201;
                var6_3 -= 2;
                continue;
            }
            (Integer.rotateRight(-1391741314 ^ var4_4, 8) - -121063299) * -1391741313;
            try {
                var6_3 += 5;
                var5_5 = Integer.reverse(Integer.reverse(-46908976 + var4_4));
            }
            catch (NoSuchElementException v6) {
                var5_5 = (int)((long)(-46908976 + var4_4) ^ 4649010525190164860L ^ 4649010525190164860L);
            }
            var6_3 -= 4;
            continue;
lbl190:
            // 7 sources

            Integer.rotateRight(-997411737 ^ var4_4, 11) - -781748300;
            var5_5 = Integer.reverse(Integer.reverse(-46908976 + var4_4));
        }
    }

    private void ssf(Map map) {
        int n = -1848089409;
        n = Integer.rotateLeft(n * 2011201625, 26) ^ 0x52CBB61C;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
        Map map2 = map;
        n = Integer.rotateLeft((map2 != null ? System.identityHashCode(map2) : 0) ^ n, 26);
        int n2 = n ^ 0x7B6DCBF0;
        if ((n2 ^ n) != 2070793200) {
            int cfr_ignored_0 = (0xEAB5AF4F ^ n) - 244921739;
        }
        this.tra_2.putAll(map);
    }

    private void jym(class_2338 class_23382, Set set) {
        try {
            try {
                int n = -134818377;
                n = Integer.rotateLeft(n * 2027298441, 12) ^ 0x55487B7;
                Set set2 = set;
                n = (set2 != null ? System.identityHashCode(set2) : 0) ^ n;
                int n2 = n ^ 0x3041F916;
                if ((n2 ^ n) != 809629974) {
                    int cfr_ignored_0 = (0xC7B72CA1 ^ n) + -1972657570;
                }
                if ((0x1D4 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            if (!yf.khdha_2()) {
                yf.athz_2();
            }
            HashMap hashMap = new HashMap();
            this.thhl_2(class_23382, set, hashMap);
            mc.execute(() -> this.tmm(hashMap));
        }
        catch (Exception exception) {
            this.thah = false;
        }
    }

    private void tmm(Map map) {
        try {
            int n = 269508455;
            n = Integer.rotateLeft(n * -709905845, 21) ^ 0xB24F8386;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0x55D419A;
            if ((n2 ^ n) != 89997722) {
                int cfr_ignored_0 = (0x154D1EFD ^ n) - -1814061335;
            }
            if ((0xA7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.tra_2.clear();
        this.tra_2.putAll(map);
        this.thah = false;
    }

    private static String dhda(String string, int n, int n2, int n3) {
        int n4 = 1152847739;
        n4 = Integer.rotateLeft(n4 * 634410251, 23) ^ 0x8D964AE9;
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 29)) ^ 0xA8CC983;
        if ((n5 ^ n4) != 176998787) {
            int cfr_ignored_0 = (0x4E3BC6F8 ^ n4) + 159368009;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xAACAC595 ^ n2 ^ i * 146096731 ^ jykh, 9) ^ dhl_2));
        }
        return new String(cArray);
    }

    private static class_4588 jrz_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = -2138142605;
            n = Integer.rotateLeft(n * -10322223, 21) ^ 0x55AD762E;
            class_287 class_2873 = class_2872;
            n = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x69BF9B6F;
            if ((n2 ^ n) == 1774164847) break block0;
            int cfr_ignored_0 = (0xE931131C ^ n) + -1802753083;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static class_4588 thzs_4(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = 912479444;
            n = Integer.rotateLeft(n * -1945424141, 17) ^ 0x8B8C4548;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x4F9B7222;
            if ((n2 ^ n) == 1335587362) break block0;
            int cfr_ignored_0 = (0x79F826F6 ^ n) - 275795998;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static class_4588 sthl(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = 1050077924;
            n = Integer.rotateLeft(n * 1085009969, 8) ^ 0x198AABF5;
            class_287 class_2873 = class_2872;
            n = Integer.rotateRight((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 25);
            Matrix4f matrix4f2 = matrix4f;
            n = Integer.rotateLeft((matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n, 5);
            int n2 = n ^ 0xF4399CEF;
            if ((n2 ^ n) == -197550865) break block0;
            int cfr_ignored_0 = (0xCAAF760B ^ n) + 1130851442;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static class_4588 dhw(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = 543257042;
            n = Integer.rotateLeft(n * 969195337, 18) ^ 0x70371FA2;
            Matrix4f matrix4f2 = matrix4f;
            n = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xB6C298A8;
            if ((n2 ^ n) == -1228760920) break block0;
            int cfr_ignored_0 = (0x96A3E97A ^ n) - 1985957367;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static int szb_3(class_2338 class_23382) {
        block0: {
            int n = 445028524;
            n = Integer.rotateLeft(n * -2135018223, 9) ^ 0x4F1FE3EE;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0xD7CBAE5B;
            if ((n2 ^ n) == -674517413) break block0;
            int cfr_ignored_0 = (0xCD4D36F7 ^ n) - 523343577;
        }
        return class_23382.method_10260();
    }

    private static class_1923 haa_3(class_2818 class_28182) {
        block0: {
            int n = -1867339438;
            int n2 = (n = Integer.rotateLeft(n * 1794678265, 4) ^ 0xBB18D3A3) ^ 0x29C63CD2;
            if ((n2 ^ n) == 700857554) break block0;
            int cfr_ignored_0 = (0xB9749580 ^ n) - -1947552338;
        }
        return class_28182.method_12004();
    }

    private static class_1923 jhk(class_2818 class_28182) {
        block0: {
            int n = 1763760239;
            int n2 = (n = Integer.rotateLeft(n * 307366351, 26) ^ 0xBBDA8228) ^ 0x3A660BFD;
            if ((n2 ^ n) == 979766269) break block0;
            int cfr_ignored_0 = (0x5346D392 ^ n) + 114487635;
        }
        return class_28182.method_12004();
    }

    private static int tzs_6(class_638 class_6382) {
        block0: {
            int n = 1409093208;
            n = Integer.rotateLeft(n * -2005952443, 10) ^ 0xC61D445C;
            class_638 class_6383 = class_6382;
            n = (class_6383 != null ? System.identityHashCode(class_6383) : 0) ^ n;
            int n2 = n ^ 0x511AD373;
            if ((n2 ^ n) == 1360712563) break block0;
            int cfr_ignored_0 = (0x2E7DD2B ^ n) + -1539620706;
        }
        return class_6382.method_31607();
    }

    private static int ssd_4(class_2338 class_23382) {
        block0: {
            int n = bmr.ahs(1998351376);
            int n2 = n ^ 0xE1AAAC32;
            if ((n2 ^ n) == -508908494) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x96B6C022 ^ n, 5) + 1149166425;
        }
        return class_23382.method_10264();
    }

    private static int hs_3(int n, int n2) {
        block0: {
            int n3 = -1076724030;
            int n4 = (n3 = Integer.rotateLeft(n3 * -915329855, 24) ^ 0x68197CDD) ^ 0xF933555A;
            if ((n4 ^ n3) == -114076326) break block0;
            int cfr_ignored_0 = (0x46E12B98 ^ n3) + 1010754781;
        }
        return Math.max(n, n2);
    }

    private static int ddht_4(class_2338 class_23382) {
        block0: {
            int n = -1193239608;
            int n2 = (n = Integer.rotateLeft(n * -1365616221, 25) ^ 0xC8693FD0) ^ 0xAE830952;
            if ((n2 ^ n) == -1367144110) break block0;
            int cfr_ignored_0 = (0x1663929A ^ n) - -565779116;
        }
        return class_23382.method_10260();
    }

    private static class_2818 shf_3(class_631 class_6312, int n, int n2, boolean bl) {
        block0: {
            int n3 = 1454229070;
            n3 = Integer.rotateLeft(n3 * 1712190195, 12) ^ 0xD10442BD;
            n3 = Integer.rotateRight(n ^ n3, 5);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 25)) ^ 0x314C41A0;
            if ((n4 ^ n3) == 827081120) break block0;
            int cfr_ignored_0 = (0x67E187EE ^ n3) - 1727935273;
        }
        return class_6312.method_12126(n, n2, bl);
    }

    private static class_1923 rjth(class_2818 class_28182) {
        block0: {
            int n = bmr.ahs(2016350038);
            int n2 = n ^ 0x3279C16;
            if ((n2 ^ n) == 52927510) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7B089340 ^ n, 18) + -362318853;
        }
        return class_28182.method_12004();
    }

    private static double shthf(long l) {
        block0: {
            int n = -911322566;
            int n2 = (n = Integer.rotateLeft(n * 351260431, 5) ^ 0x73F53280) ^ 0xDC2F3EB9;
            if ((n2 ^ n) == -600883527) break block0;
            int cfr_ignored_0 = (0x15816C83 ^ n) + 627808749;
        }
        return Double.longBitsToDouble(l);
    }

    private static class_2248 hth(class_2680 class_26802) {
        block0: {
            int n = 2057001059;
            int n2 = (n = Integer.rotateLeft(n * -176708951, 9) ^ 0x839DAC73) ^ 0x542BAE4F;
            if ((n2 ^ n) == 1412148815) break block0;
            int cfr_ignored_0 = (0x2EB0F62C ^ n) - -1515896389;
        }
        return class_26802.method_26204();
    }

    private static String drb(String string) {
        block0: {
            int n = bmr.ahs(194537973);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x3B877B5B;
            if ((n2 ^ n) == 998734683) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x301F12AE ^ n, 9) - -668933555;
        }
        return string.toLowerCase();
    }

    private static boolean ryl(badh_2 badh2) {
        block0: {
            int n = -2050859739;
            int n2 = (n = Integer.rotateLeft(n * -600722689, 26) ^ 0xA400AD80) ^ 0xDB1C7A24;
            if ((n2 ^ n) == -618890716) break block0;
            int cfr_ignored_0 = (0x5EDE2701 ^ n) - -362722972;
        }
        return badh2.shzl();
    }

    private static String[] hghd(String string) {
        block0: {
            int n = bmr.ahs(-1488400571);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x3B3B2046;
            if ((n2 ^ n) == 993730630) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9C73EF03 ^ n, 6) + -160984936;
        }
        return string.split("\b\u0017", -1);
    }

    private static CallSite khdkh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -15639650;
            n3 = Integer.rotateLeft(n3 * 571639549, 11) ^ 0x837CD97D;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateLeft(n ^ n3, 27);
            int n4 = n3 ^ 0xA45108BE;
            if ((n4 ^ n3) != -1538193218) {
                int cfr_ignored_0 = (0x5B405320 ^ n3) + -1772989176;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dkhh ^ string.hashCode() ^ n2 + dkh + i * -378210989) + dkhh) ^ dkh));
            }
            String[] stringArray = bjs.hghd(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] wlimnyok(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bh9rbiubxr68(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ohmfks4piz ^ string.hashCode() ^ n2 + efn4poqdjtf + i * 1879121251) + ohmfks4piz) ^ efn4poqdjtf));
            }
            String[] stringArray = bjs.wlimnyok(new String(cArray));
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

