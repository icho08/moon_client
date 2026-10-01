/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_276
 *  net.minecraft.class_286
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_5944
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_276;
import net.minecraft.class_286;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dhsh_5;
import us.m0vy.moondlc.m0vyguard.wz_2;

public class sz_2
implements dl {
    private static final dhsh_5 zdhr;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int adhasmgt286wv4;

    public void awz(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, Color color, float f6) {
        this.akd(class_45872, f, f2, f3, f4, new Vector4f(f5, f5, f5, f5), color, color, color, color, f6);
    }

    public void tgha_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, Color color) {
        this.awz(class_45872, f, f2, f3, f4, f5, color, bza_4.aar() ? 0.0f : bza_4.atm());
    }

    public void dzz_5(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color) {
        this.akd(class_45872, f, f2, f3, f4, vector4f, color, color, color, color, bza_4.aar() ? 0.0f : bza_4.atm());
    }

    public void arz(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color, Color color2, Color color3, Color color4) {
        this.akd(class_45872, f, f2, f3, f4, vector4f, color, color2, color3, color4, bza_4.aar() ? 0.0f : bza_4.atm());
    }

    public void akd(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color, Color color2, Color color3, Color color4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        Vector4f vector4f2;
        float f10 = 0.0f;
        float[] fArray = brb.rdz_2(color);
        float[] fArray2 = brb.rdz_2(color3);
        float[] fArray3 = brb.rdz_2(color4);
        float[] fArray4 = brb.rdz_2(color2);
        float f11 = (fArray[3] + fArray2[3] + fArray3[3] + fArray4[3]) / 4.0f;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_276 class_2762 = class_310.method_1551().method_1522();
        if ((f5 != 1.0f || bza_4.aar()) && !wz_2.jsh_2.isEmpty()) {
            class_2762 = (class_276)wz_2.jsh_2.getFirst();
        }
        float f12 = 0.8f;
        float f13 = -f12 / 2.0f + f12 * 2.0f;
        float f14 = f12 / 2.0f + f12;
        float f15 = f - f13 / 2.0f;
        float f16 = f2 - f14 / 2.0f;
        float f17 = f3 + f13;
        float f18 = f4 + f14;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)class_2762.method_30277());
        class_5944 class_59442 = zdhr.rtth();
        if (class_59442 == null) {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            return;
        }
        zdhr.zhd_5("uSize").method_1255(f3, f4);
        zdhr.zhd_5("uRadius").method_35657(vector4f.x, vector4f.z, vector4f.w, vector4f.y);
        zdhr.zhd_5("uMix").method_1251(f5);
        zdhr.zhd_5("uSmoothness").method_1251(f12);
        zdhr.zhd_5("uAlpha").method_1251(f11);
        zdhr.zhd_5("uTopLeftColor").method_35657(fArray[0], fArray[1], fArray[2], fArray[3]);
        zdhr.zhd_5("uBottomLeftColor").method_35657(fArray2[0], fArray2[1], fArray2[2], fArray2[3]);
        zdhr.zhd_5("uBottomRightColor").method_35657(fArray3[0], fArray3[1], fArray3[2], fArray3[3]);
        zdhr.zhd_5("uTopRightColor").method_35657(fArray4[0], fArray4[1], fArray4[2], fArray4[3]);
        if (f5 != 1.0f) {
            vector4f2 = new Vector4f(f, f2, 0.0f, 1.0f);
            vector4f2.mul((Matrix4fc)matrix4f);
            Vector4f vector4f3 = new Vector4f(f + f3, f2 + f4, 0.0f, 1.0f);
            vector4f3.mul((Matrix4fc)matrix4f);
            int n = class_310.method_1551().method_22683().method_4486();
            int n2 = class_310.method_1551().method_22683().method_4502();
            f9 = vector4f2.x() / (float)n;
            f8 = vector4f3.x() / (float)n;
            f7 = 1.0f - vector4f2.y() / (float)n2;
            f6 = 1.0f - vector4f3.y() / (float)n2;
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
            f8 = 0.0f;
            f9 = 0.0f;
        }
        vector4f2 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        vector4f2.method_22918(matrix4f, f15, f16, f10).method_22913(f9, f7).method_39415(color.getRGB());
        vector4f2.method_22918(matrix4f, f15, f16 + f18, f10).method_22913(f9, f6).method_39415(color3.getRGB());
        vector4f2.method_22918(matrix4f, f15 + f17, f16 + f18, f10).method_22913(f8, f6).method_39415(color4.getRGB());
        vector4f2.method_22918(matrix4f, f15 + f17, f16, f10).method_22913(f8, f7).method_39415(color2.getRGB());
        class_286.method_43433((class_9801)vector4f2.method_60800());
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

