/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
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
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import us.m0vy.moondlc.m0vyguard.bfj;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.tzth;
import us.m0vy.moondlc.m0vyguard.shw_3;

public class bhl
extends tzth {
    private float mn = 0.0f;
    private float bms = 0.0f;
    private static final int san_3 = 2056698235;
    private static final int thshkh = 1049260738;
    private static final int ycsa13he8 = -996202227;
    private static final int p2p0x1933g = 1318057947;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int edxldb33;

    @Override
    public void ththd() {
    }

    @Override
    public void ht_2(shw_3 shw2) {
        if (this.dhagh_2() == null || this.ghsht() <= 0.0f) {
            return;
        }
        class_1309 class_13092 = this.dhagh_2();
        tdhz_2 tdhz2_2 = tdhz_2.trb();
        float f = tdhz2_2.bkb().thw_5();
        float f2 = tdhz2_2.tdhh_2().thw_5();
        float f3 = tdhz2_2.trs_4().thw_5();
        float f4 = tdhz2_2.tnf().thw_5();
        float f5 = tdhz2_2.jlh_2().thw_5();
        this.mn += f3;
        this.bms += f3 * 0.375f;
        class_4587 class_45872 = shw2.ssha_2();
        float f6 = shw2.skz_4();
        class_243 class_2432 = this.thnz_2(class_13092);
        class_243 class_2433 = bhl.mc.field_1773.method_19418().method_19326();
        class_243 class_2434 = class_2432.method_1020(class_2433);
        class_45872.method_22903();
        class_45872.method_22904(class_2434.field_1352, class_2434.field_1351, class_2434.field_1350);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        int n = (int)f;
        float f7 = this.dhsht(f6);
        float f8 = f2 * f7;
        float f9 = ((float)bhl.mc.field_1724.field_6012 + f6) * 0.15f;
        float f10 = class_13092.method_17682();
        float f11 = class_13092.method_17681();
        float f12 = f11 * 0.5f;
        int n2 = this.dshh_2(class_13092).getRGB();
        float f13 = this.ghsht();
        class_289 class_2892 = class_289.method_1348();
        class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        for (int i = 0; i < n; ++i) {
            float f14 = (float)Math.sin((float)i * 1.7f + 0.3f) * 0.5f + 0.5f;
            float f15 = (float)Math.cos((float)i * 2.3f + 0.7f) * 0.5f + 0.5f;
            float f16 = (float)Math.sin((float)i * 3.1f + 1.1f) * 0.5f + 0.5f;
            float f17 = (float)i * (360.0f / (float)n) + f14 * 12.0f;
            float f18 = (f9 + (float)bhl.mc.field_1724.field_6012) * f4 + f17;
            float f19 = (f12 + 0.25f + f16 * 0.15f) * f5 * f7;
            float f20 = f19 * (float)Math.cos(Math.toRadians(f18));
            float f21 = f19 * (float)Math.sin(Math.toRadians(f18));
            float f22 = (float)Math.sin(f9 * 0.05f + (float)i * 0.3f) * 0.1f;
            float f23 = f15 * f10 * 1.05f + f22;
            this.za(class_2872, class_45872, f20, f23, f21, f8, n2, f13 * 0.5f, this.mn, this.bms);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.defaultBlendFunc();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        class_45872.method_22909();
    }

    private Color dshh_2(class_1309 class_13092) {
        int n = bfj.dhhth(-1288031223);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x2754991F;
        if ((n2 ^ n) != 659855647) {
            int cfr_ignored_0 = (Integer.rotateRight(0x946EAD16 ^ n, 5) - -37448475) * -1804686057;
        }
        Color color = bhl.dhkhj().zbgh_2();
        if (class_13092.field_6235 > 0) {
            Color color2 = new Color(bhl.rwn(-528880116) ^ 0x30779EF8, -1663569127 + 1663569177, Integer.reverse(-528560443) ^ 0xA3737E35, Integer.rotateLeft(0x2BC2FDAC ^ 0x2C3AFDAC, 13));
            float f = (float)class_13092.field_6235 / Float.intBitsToFloat(-1426820965 - 1775530139);
            int n3 = (int)((float)color2.getRed() * f + (float)color.getRed() * (1.0f - f));
            int n4 = (int)((float)color2.getGreen() * f + (float)color.getGreen() * (1.0f - f));
            int n5 = (int)((float)bhl.zsgh_3(color2) * f + (float)color.getBlue() * (1.0f - f));
            return new Color(n3, n4, n5, 1173344080 + -1173343825);
        }
        return color;
    }

    private void za(class_287 class_2872, class_4587 class_45872, float f, float f2, float f3, float f4, int n, float f5, float f6, float f7) {
        class_45872.method_22903();
        class_45872.method_46416(f, f2, f3);
        class_45872.method_22907(new Quaternionf().rotationY((float)Math.toRadians(f6)));
        class_45872.method_22907(new Quaternionf().rotationX((float)Math.toRadians(f7)));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = (int)((float)(n >> 24 & 0xFF) * f5);
        float f8 = f4 / 2.0f;
        this.tghh_2(class_2872, matrix4f, -f8, -f8, f8, f8, -f8, f8, f8, f8, f8, -f8, f8, f8, n2, n3, n4, n5);
        this.tghh_2(class_2872, matrix4f, -f8, -f8, -f8, -f8, f8, -f8, f8, f8, -f8, f8, -f8, -f8, (int)((double)n2 * 0.9), (int)((double)n3 * 0.9), (int)((double)n4 * 0.9), n5);
        this.tghh_2(class_2872, matrix4f, -f8, -f8, -f8, -f8, -f8, f8, -f8, f8, f8, -f8, f8, -f8, (int)((double)n2 * 0.8), (int)((double)n3 * 0.8), (int)((double)n4 * 0.8), n5);
        this.tghh_2(class_2872, matrix4f, f8, -f8, -f8, f8, f8, -f8, f8, f8, f8, f8, -f8, f8, (int)((double)n2 * 0.8), (int)((double)n3 * 0.8), (int)((double)n4 * 0.8), n5);
        this.tghh_2(class_2872, matrix4f, -f8, f8, -f8, -f8, f8, f8, f8, f8, f8, f8, f8, -f8, (int)Math.min(255.0, (double)n2 * 1.1), (int)Math.min(255.0, (double)n3 * 1.1), (int)Math.min(255.0, (double)n4 * 1.1), n5);
        this.tghh_2(class_2872, matrix4f, -f8, -f8, -f8, f8, -f8, -f8, f8, -f8, f8, -f8, -f8, f8, (int)((double)n2 * 0.7), (int)((double)n3 * 0.7), (int)((double)n4 * 0.7), n5);
        class_45872.method_22909();
    }

    private void tghh_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n, int n2, int n3, int n4) {
        class_2872.method_22918(matrix4f, f, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f7, f8, f9).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f7, f8, f9).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f10, f11, f12).method_1336(n, n2, n3, n4);
    }

    private static tdhz_2 dhkhj() {
        block0: {
            int n = bfj.dhhth(-1174407638);
            int n2 = n ^ 0x9EED9629;
            if ((n2 ^ n) == -1628596695) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x27126003 ^ n, 7) + -1080606824;
        }
        return tdhz_2.trb();
    }

    private static int rwn(int n) {
        block0: {
            int n2 = 769466435;
            n2 = Integer.rotateLeft(n2 * -914061987, 14) ^ 0x54E81CB5;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 3)) ^ 0x1B158379;
            if ((n3 ^ n2) == 454394745) break block0;
            int cfr_ignored_0 = (0x36C8A33A ^ n2) - 566751503;
        }
        return Integer.reverse(n);
    }

    private static int zsgh_3(Color color) {
        block0: {
            int n = -778346892;
            n = Integer.rotateLeft(n * -1458915599, 5) ^ 0x7069D38B;
            Color color2 = color;
            n = Integer.rotateLeft((color2 != null ? System.identityHashCode(color2) : 0) ^ n, 10);
            int n2 = n ^ 0xEA7E1C1C;
            if ((n2 ^ n) == -360834020) break block0;
            int cfr_ignored_0 = (0x3BE54268 ^ n) - -551810349;
        }
        return color.getBlue();
    }

    private static String[] zkq(String string) {
        block0: {
            int n = bfj.dhhth(1644499358);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 13);
            int n2 = n ^ 0x68640CC2;
            if ((n2 ^ n) == 1751387330) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA611D5C ^ n, 4) - 1176513887) * 174136669;
        }
        return string.split("\u0001\u0015", -1);
    }

    private static CallSite ghs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -267671771;
            n3 = Integer.rotateLeft(n3 * 1080301329, 18) ^ 0xD362124F;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 27);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x16D6C3EB;
            if ((n4 ^ n3) != 383173611) {
                int cfr_ignored_0 = (0xE6DD64CE ^ n3) - 745800312;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ san_3 ^ string.hashCode() ^ n2 + thshkh + i * 1638625843) + san_3) ^ thshkh));
            }
            String[] stringArray = bhl.zkq(new String(cArray));
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

    private static String[] j7rzlx02d5c34y(String string) {
        return string.split("\u0004\u0018", -1);
    }

    private static CallSite er9ehkzgdtfl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ycsa13he8 ^ string.hashCode() ^ n2 + p2p0x1933g + i * -1289447301) + ycsa13he8) ^ p2p0x1933g));
            }
            String[] stringArray = bhl.j7rzlx02d5c34y(new String(cArray));
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

