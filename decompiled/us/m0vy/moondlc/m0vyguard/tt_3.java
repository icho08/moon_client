/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_1011
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Matrix4f
 *  org.lwjgl.BufferUtils
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import javax.imageio.ImageIO;
import lombok.Generated;
import net.minecraft.class_1011;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import us.m0vy.moondlc.m0vyguard.bat;
import us.m0vy.moondlc.m0vyguard.bsw_2;
import us.m0vy.moondlc.m0vyguard.bzk_2;
import us.m0vy.moondlc.m0vyguard.bqt_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.tadh;
import us.m0vy.moondlc.m0vyguard.tjq;
import us.m0vy.moondlc.m0vyguard.tdha;
import us.m0vy.moondlc.m0vyguard.jz_2;
import us.m0vy.moondlc.m0vyguard.mh_2;
import us.m0vy.moondlc.m0vyguard.hy_2;

public final class tt_3
implements tdha {
    public static HashMap skhgh;
    public static HashMap dhk;
    public static final Stack hhl;
    private static final List snth;
    private static final ExecutorService slz_2;
    private static final int b54shygm = 448319346;
    private static final int bogj0ih = 1132617946;
    private static volatile int jv$yiimytiolknmiz;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rlgd36euidetv7;

    public static void drf() {
        Object[] objectArray = new Object[]{};
        tt_3.jv$urkil2yq3zgm(objectArray, -17641818);
        tt_3.jv$noz6hp4u2nasv0("", objectArray, -721181981);
    }

    public static void dhdz_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, Color color, Color color2, Color color3, Color color4) {
        class_2872.method_22918(matrix4f, f, f4, 0.0f).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f3, f4, 0.0f).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f3, f2, 0.0f).method_39415(color3.getRGB());
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_39415(color4.getRGB());
    }

    public static boolean akz(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d3 && d - d5 <= d3 && d2 >= d4 && d2 - d6 <= d4;
    }

    public static void dkz(class_4587 class_45872, float f, float f2, float f3, float f4, int n, Color color) {
    }

    public static void sld_4(class_332 class_3322) {
        class_4587 class_45872 = class_3322.method_51448();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        if (!snth.isEmpty()) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShader((class_10156)class_10142.field_53876);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            snth.forEach(arg_0 -> tt_3.tzb_3(matrix4f, class_2872, arg_0));
            class_286.method_43433((class_9801)class_2872.method_60800());
            RenderSystem.disableBlend();
            snth.clear();
        }
    }

    public static void thqt_2(float f, float f2, float f3, float f4, int n) {
        snth.add(new hy_2(f, f2, f3, f4, tjq.bwk(n, RenderSystem.getShaderColor()[3])));
    }

    public static void dhtk_2(Matrix4f matrix4f, class_287 class_2872, float f, float f2, float f3, float f4) {
        class_2872.method_22918(matrix4f, f, f2, 0.0f);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f);
    }

    public static void zthk_2(Matrix4f matrix4f, class_287 class_2872, float f, float f2, float f3, float f4, int n) {
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_39415(n);
    }

    public static void tghs(Matrix4f matrix4f, float f, float f2, float f3, float f4, int n) {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    public static void ddhf(Matrix4f matrix4f, class_287 class_2872, float f, float f2, float f3, float f4, int n) {
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(n);
    }

    private static bqt_2 rtkh_2(int n, int n2, int n3) {
        bqt_2 bqt2 = null;
        int n4 = Integer.MAX_VALUE;
        for (bqt_2 bqt3 : skhgh.keySet()) {
            int n5 = Math.abs(bqt3.width() - n) + Math.abs(bqt3.height() - n2) + Math.abs(bqt3.blurRadius() - n3);
            if (n5 >= n4) continue;
            n4 = n5;
            bqt2 = bqt3;
        }
        return bqt2;
    }

    public static void ssn(class_4587 class_45872, float f, float f2, float f3, float f4, int n, bsw_2 bsw2) {
        Object object;
        f -= (float)n;
        f2 -= (float)n;
        bqt_2 bqt2 = tt_3.rtkh_2((int)(f3 += (float)(n * 2)), (int)(f4 += (float)(n * 2)), n);
        if (bqt2 == null || (int)(Math.abs((float)bqt2.width() - f3) + Math.abs((float)bqt2.height() - f4) + (float)Math.abs(bqt2.blurRadius() - n)) >= 5) {
            object = new bqt_2((int)f3, (int)f4, n);
            mc.execute(() -> tt_3.thlf((bqt_2)object, n));
        }
        if ((object = (bzk_2)skhgh.getOrDefault(bqt2, null)) != null) {
            ((bzk_2)object).ghzkh();
            tadh.sza_8(class_45872, ((bzk_2)object).hskh.ghzf(), f, f2, f3, f4, bsw2);
        }
    }

    public static void dzr_2(bat bat2, BufferedImage bufferedImage) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write((RenderedImage)bufferedImage, "png", byteArrayOutputStream);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            tt_3.tath_4(bat2, byArray);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void tath_4(bat bat2, byte[] byArray) {
        try {
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)byArray.length).put(byArray);
            byteBuffer.flip();
            class_1043 class_10432 = new class_1043(class_1011.method_4324((ByteBuffer)byteBuffer));
            mc.execute(() -> tt_3.skd_2(bat2, class_10432));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void zzr(class_4587 class_45872, double d, double d2, double d3, double d4, float f, float f2, double d5, double d6, double d7, double d8) {
        double d9 = d + d3;
        double d10 = d2 + d4;
        double d11 = 0.0;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
        class_2872.method_22918(matrix4f, (float)d, (float)d10, (float)d11).method_22913(f / (float)d7, (f2 + (float)d6) / (float)d8);
        class_2872.method_22918(matrix4f, (float)d9, (float)d10, (float)d11).method_22913((f + (float)d5) / (float)d7, (f2 + (float)d6) / (float)d8);
        class_2872.method_22918(matrix4f, (float)d9, (float)d2, (float)d11).method_22913((f + (float)d5) / (float)d7, f2 / (float)d8);
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d11).method_22913(f / (float)d7, (f2 + 0.0f) / (float)d8);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    public static void khtl(class_4587 class_45872, double d, double d2, double d3, double d4, float f, float f2, double d5, double d6, double d7, double d8, Color color, Color color2, Color color3, Color color4) {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        tt_3.thdh_2(class_2872, class_45872, d, d2, d3, d4, f, f2, d5, d6, d7, d8, color, color2, color3, color4);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    public static void thdh_2(class_287 class_2872, class_4587 class_45872, double d, double d2, double d3, double d4, float f, float f2, double d5, double d6, double d7, double d8, Color color, Color color2, Color color3, Color color4) {
        double d9 = d + d3;
        double d10 = d2 + d4;
        double d11 = 0.0;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, (float)d, (float)d10, (float)d11).method_22913(f / (float)d7, (f2 + (float)d6) / (float)d8).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, (float)d9, (float)d10, (float)d11).method_22913((f + (float)d5) / (float)d7, (f2 + (float)d6) / (float)d8).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, (float)d9, (float)d2, (float)d11).method_22913((f + (float)d5) / (float)d7, f2 / (float)d8).method_39415(color3.getRGB());
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d11).method_22913(f / (float)d7, (f2 + 0.0f) / (float)d8).method_39415(color4.getRGB());
    }

    public static void tth_4() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void tbl(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, boolean bl, boolean bl2, int n) {
    }

    public static void dtz(class_4587 class_45872, float f, float f2, float f3, Color color) {
    }

    public static void dhnr(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, boolean bl, boolean bl2, int n) {
        if (bl2) {
            tt_3.dkz(class_45872, f - f3 * f4, f2, f + f3 * f4 - (f - f3 * f4), f3, 10, tt_3.sa_3(new Color(n), 140));
        }
        class_45872.method_22903();
        tt_3.tth_4();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f - f3 * f4, f2 + f3, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2 + f3 - f5, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_39415(n);
        n = tt_3.zdr_3(new Color(n), 0.8f).getRGB();
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2 + f3 - f5, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3 * f4, f2 + f3, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_39415(n);
        if (bl) {
            n = tt_3.zdr_3(new Color(n), 0.6f).getRGB();
            class_2872.method_22918(matrix4f, f - f3 * f4, f2 + f3, 0.0f).method_39415(n);
            class_2872.method_22918(matrix4f, f + f3 * f4, f2 + f3, 0.0f).method_39415(n);
            class_2872.method_22918(matrix4f, f, f2 + f3 - f5, 0.0f).method_39415(n);
            class_2872.method_22918(matrix4f, f - f3 * f4, f2 + f3, 0.0f).method_39415(n);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        tt_3.ths_6();
        class_45872.method_22909();
    }

    public static void ths_6() {
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static float dah_5(float f, float f2, float f3) {
        boolean bl;
        boolean bl2 = bl = f > f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float f4 = Math.max(f, f2) - Math.min(f, f2);
        float f5 = f4 * f3;
        return f2 + (bl ? f5 : -f5);
    }

    public static Color sa_3(Color color, int n) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), class_3532.method_15340((int)n, (int)0, (int)255));
    }

    public static Color ddh_2(Color color, Color color2, double d, double d2) {
        int n = (int)(((double)System.currentTimeMillis() / d + d2) % 360.0);
        n = (n >= 180 ? 360 - n : n) * 2;
        return tt_3.hdkh_2(color, color2, (float)n / 360.0f);
    }

    public static Color st_2(boolean bl, int n) {
        float f = bl ? 3500.0f : 3000.0f;
        float f2 = System.currentTimeMillis() % (long)((int)f) + (long)n;
        if (f2 > f) {
            f2 -= f;
        }
        if ((f2 /= f) > 0.5f) {
            f2 = 0.5f - (f2 - 0.5f);
        }
        return Color.getHSBColor(f2 += 0.5f, 0.4f, 1.0f);
    }

    public static Color snd_4(int n, float f, float f2) {
        double d = Math.ceil((float)(System.currentTimeMillis() + (long)n) / 16.0f);
        return Color.getHSBColor((float)((d %= 360.0) / 360.0), f, f2);
    }

    public static Color ayz_2(int n, int n2) {
        int n3;
        int n4 = (int)((System.currentTimeMillis() / (long)n + (long)n2) % 360L);
        return Color.getHSBColor((double)((float)((double)n3 / 360.0)) < 0.5 ? -((float)((double)n4 / 360.0)) : (float)((double)(n4 %= 360) / 360.0), 0.5f, 1.0f);
    }

    public static Color ragh(Color color) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float f = 0.84f;
        float f2 = fArray[0] - f;
        return new Color(Color.HSBtoRGB(f2, fArray[1], fArray[2]));
    }

    public static Color shsdh(Color color, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((float)color.getAlpha() * f));
    }

    public static int shst_3(int n, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        Color color = new Color(n);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((float)color.getAlpha() * f)).getRGB();
    }

    public static Color zdr_3(Color color, float f) {
        return new Color(Math.max((int)((float)color.getRed() * f), 0), Math.max((int)((float)color.getGreen() * f), 0), Math.max((int)((float)color.getBlue() * f), 0), color.getAlpha());
    }

    public static Color shnr(int n, int n2, float f, float f2, float f3) {
        int n3 = (int)((System.currentTimeMillis() / (long)n + (long)n2) % 360L);
        float f4 = (float)n3 / 360.0f;
        Color color = new Color(Color.HSBtoRGB(f4, f, f2));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.max(0, Math.min(255, (int)(f3 * 255.0f))));
    }

    public static Color rght_2(int n, int n2, Color color, Color color2, boolean bl) {
        int n3 = (int)((System.currentTimeMillis() / (long)n + (long)n2) % 360L);
        n3 = (n3 >= 180 ? 360 - n3 : n3) * 2;
        return bl ? tt_3.za_3(color, color2, (float)n3 / 360.0f) : tt_3.hdkh_2(color, color2, (float)n3 / 360.0f);
    }

    public static Color hdkh_2(Color color, Color color2, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        return new Color(tt_3.zfgh_2(color.getRed(), color2.getRed(), f), tt_3.zfgh_2(color.getGreen(), color2.getGreen(), f), tt_3.zfgh_2(color.getBlue(), color2.getBlue(), f), tt_3.zfgh_2(color.getAlpha(), color2.getAlpha(), f));
    }

    public static Color za_3(Color color, Color color2, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float[] fArray2 = Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), null);
        Color color3 = Color.getHSBColor(tt_3.tthgh(fArray[0], fArray2[0], f), tt_3.tthgh(fArray[1], fArray2[1], f), tt_3.tthgh(fArray[2], fArray2[2], f));
        return new Color(color3.getRed(), color3.getGreen(), color3.getBlue(), tt_3.zfgh_2(color.getAlpha(), color2.getAlpha(), f));
    }

    public static double thsm_2(double d, double d2, double d3) {
        return d + (d2 - d) * d3;
    }

    public static float tthgh(float f, float f2, double d) {
        return (float)tt_3.thsm_2(f, f2, (float)d);
    }

    public static int zfgh_2(int n, int n2, double d) {
        return (int)tt_3.thsm_2(n, n2, (float)d);
    }

    public static class_287 zyy_2(class_4587 class_45872, float f, float f2, float f3, float f4) {
        tt_3.tth_4();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        tt_3.tjm_2(class_2872, matrix4f, f, f2, f + f3, f2 + f4);
        return class_2872;
    }

    public static void tjm_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4) {
        class_2872.method_22918(matrix4f, f, f2, 0.0f);
        class_2872.method_22918(matrix4f, f, f4, 0.0f);
        class_2872.method_22918(matrix4f, f3, f4, 0.0f);
        class_2872.method_22918(matrix4f, f3, f2, 0.0f);
    }

    public static boolean zft_2(Color color) {
        return tt_3.ddhf_2((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f);
    }

    public static boolean ddhf_2(float f, float f2, float f3) {
        return tt_3.szf_2(f, f2, f3, 0.0f, 0.0f, 0.0f) < tt_3.szf_2(f, f2, f3, 1.0f, 1.0f, 1.0f);
    }

    public static float szf_2(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float f9 = f6 - f3;
        return (float)Math.sqrt(f7 * f7 + f8 * f8 + f9 * f9);
    }

    @NotNull
    public static Color ghbr(@NotNull Color color, @NotNull Color color2, float f, boolean bl) {
        if (!bl) {
            return (double)f >= 0.95 ? color2 : color;
        }
        int n = color2.getRed() - color.getRed();
        int n2 = color2.getGreen() - color.getGreen();
        int n3 = color2.getBlue() - color.getBlue();
        int n4 = color2.getAlpha() - color.getAlpha();
        return new Color(tt_3.ls_2(color.getRed() + (int)((float)n * f)), tt_3.ls_2(color.getGreen() + (int)((float)n2 * f)), tt_3.ls_2(color.getBlue() + (int)((float)n3 * f)), tt_3.ls_2(color.getAlpha() + (int)((float)n4 * f)));
    }

    private static int ls_2(int n) {
        return n > 255 ? 255 : Math.max(n, 0);
    }

    public static void sghm_2(class_287 class_2872) {
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    public static void slm(class_332 class_3322, class_2960 class_29602, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4) {
        tt_3.tyz(class_3322, class_29602, f, f2, f3, f4, n, n2, n3, n4, -1);
    }

    public static void tyz(class_332 class_3322, class_2960 class_29602, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4, int n5) {
        class_4587 class_45872 = class_3322.method_51448();
        if (class_29602 != null) {
            if (f4 > 0.0f) {
                tadh.ssf_3(class_45872, class_29602, f, f2, f3, f3, jz_2.all(f4), new bkt(n5 == -1 ? -1 : n5), 0.0f, 0.0f, 1.0f, 1.0f);
            } else {
                class_45872.method_22903();
                RenderSystem.enableBlend();
                RenderSystem.defaultBlendFunc();
                RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
                RenderSystem.setShader((class_10156)class_10142.field_53880);
                class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
                Matrix4f matrix4f = class_45872.method_23760().method_23761();
                int n6 = n5 == -1 ? -1 : n5;
                class_2872.method_22918(matrix4f, f, f2 + f3, 0.0f).method_22913(0.0f, 1.0f).method_39415(n6);
                class_2872.method_22918(matrix4f, f + f3, f2 + f3, 0.0f).method_22913(1.0f, 1.0f).method_39415(n6);
                class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(n6);
                class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_39415(n6);
                class_286.method_43433((class_9801)class_2872.method_60800());
                RenderSystem.disableBlend();
                class_45872.method_22909();
            }
        }
    }

    private static void dhdz_3(class_4587 class_45872, class_2960 class_29602, int n, int n2, float f, float f2, float f3, float f4, int n3, int n4, int n5, int n6, int n7) {
        tt_3.hah_3(class_45872, class_29602, n, (float)n + f, n2, (float)n2 + f2, 0.0f, n3, n4, f3, f4, n5, n6, n7);
    }

    private static void hah_3(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, float f5, int n, int n2, float f6, float f7, int n3, int n4, int n5) {
        tt_3.amb(class_45872, class_29602, f, f2, f3, f4, (f6 + 0.0f) / (float)n3, (f6 + (float)n) / (float)n3, (f7 + 0.0f) / (float)n4, (f7 + (float)n2) / (float)n4, n5);
    }

    private static void amb(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, f, f3, 0.0f).method_22913(f5, f7).method_39415(n);
        class_2872.method_22918(matrix4f, f, f4, 0.0f).method_22913(f5, f8).method_39415(n);
        class_2872.method_22918(matrix4f, f2, f4, 0.0f).method_22913(f6, f8).method_39415(n);
        class_2872.method_22918(matrix4f, f2, f3, 0.0f).method_22913(f6, f7).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    @Generated
    private tt_3() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static void skd_2(bat bat2, class_1043 class_10432) {
        mc.method_1531().method_4616(bat2.ghzf(), (class_1044)class_10432);
    }

    private static void thlf(bqt_2 bqt2, int n) {
        BufferedImage bufferedImage = new BufferedImage(bqt2.width(), bqt2.height(), 2);
        Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(new Color(-1));
        graphics.fillRect(n, n, bqt2.width() - n * 2, bqt2.height() - n * 2);
        graphics.dispose();
        mh_2 mh2 = new mh_2(n);
        BufferedImage bufferedImage2 = mh2.dfz_4(bufferedImage, null);
        skhgh.put(bqt2, new bzk_2(bufferedImage2));
    }

    private static void tzb_3(Matrix4f matrix4f, class_287 class_2872, hy_2 hy2_2) {
        tt_3.zthk_2(matrix4f, class_2872, hy2_2.snj, hy2_2.shmq, hy2_2.thjk, hy2_2.rdhm, hy2_2.ssh);
    }

    private static String[] aj618kp1wvte(String string) {
        return string.split("\u0005\u0013", -1);
    }

    private static CallSite kfw1aao3vqqc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ b54shygm ^ string.hashCode()) + (n2 + bogj0ih) + i ^ b54shygm, 15) + bogj0ih);
            }
            String[] stringArray = tt_3.aj618kp1wvte(new String(cArray));
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

    private static Object jv$noz6hp4u2nasv0(String string, Object[] objectArray, int n) throws Throwable {
        String string2 = tt_3.jv$p66gassv7gcsv(string, n);
        if ((tt_3.jv$urkil2yq3zgm(objectArray, n) ^ string2.length()) == -144012765) {
            tt_3.jv$iwig80p18mgfpa(string2, objectArray, n);
        }
        String[] stringArray = string2.split("\u001d", -1);
        int n2 = Integer.parseInt(stringArray[0]);
        Class<?> clazz = Class.forName(stringArray[1].replace('/', '.'));
        MethodType methodType = MethodType.fromMethodDescriptorString(stringArray[3], clazz.getClassLoader());
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = n2 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType) : lookup.findVirtual(clazz, stringArray[2], methodType);
        return methodHandle.invokeWithArguments(objectArray);
    }

    private static String jv$p66gassv7gcsv(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (n * 131 ^ i * 17 ^ 0xF92AC2F) & 0xFFFF);
        }
        return new String(cArray);
    }

    private static int jv$urkil2yq3zgm(Object[] objectArray, int n) {
        int n2 = n ^ 0x2BF16C45;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object == null) continue;
            n2 = Integer.rotateLeft(n2 ^ System.identityHashCode(object), 5) + i * 1315423911;
        }
        return n2;
    }

    private static Object jv$iwig80p18mgfpa(String string, Object[] objectArray, int n) {
        jv$yiimytiolknmiz = tt_3.jv$urkil2yq3zgm(objectArray, n) ^ string.length();
        if ((jv$yiimytiolknmiz & 3) == 4) {
            return string.substring(0, 0);
        }
        return null;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

