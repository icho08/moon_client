/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_276
 *  net.minecraft.class_286
 *  net.minecraft.class_287
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
import net.minecraft.class_287;
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

public class kt_2
implements dl {
    private static final dhsh_5 hkhh;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dsh3ztvsy0lq;

    public void jnt(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, Color color, float f6) {
        this.rfh_2(class_45872, f, f2, f3, f4, new Vector4f(f5, f5, f5, f5), color, color, color, color, f6);
    }

    public void dfth_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, Color color) {
        this.jnt(class_45872, f, f2, f3, f4, f5, color, bza_4.aar() ? 1.0f : bza_4.atm());
    }

    public void dhgh_5(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color) {
        this.rfh_2(class_45872, f, f2, f3, f4, vector4f, color, color, color, color, bza_4.aar() ? 1.0f : bza_4.atm());
    }

    public void ddd_3(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color, Color color2, Color color3, Color color4) {
        this.rfh_2(class_45872, f, f2, f3, f4, vector4f, color, color2, color3, color4, bza_4.aar() ? 1.0f : bza_4.atm());
    }

    public void rfh_2(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color, Color color2, Color color3, Color color4, float f5) {
        float f6 = 0.0f;
        float[] fArray = brb.rdz_2(color);
        float f7 = fArray[3];
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_276 class_2762 = class_310.method_1551().method_1522();
        if ((f5 != 1.0f || bza_4.aar()) && !wz_2.jsh_2.isEmpty()) {
            class_2762 = (class_276)wz_2.jsh_2.getFirst();
        }
        float f8 = 0.5f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)class_2762.method_30277());
        class_5944 class_59442 = hkhh.rtth();
        if (class_59442 == null) {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            return;
        }
        hkhh.zhd_5("Size").method_1255(f3, f4);
        hkhh.zhd_5("Radius").method_35657(vector4f.x, vector4f.z, vector4f.w, vector4f.y);
        hkhh.zhd_5("Smoothness").method_1251(f8);
        hkhh.zhd_5("CornerSmoothness").method_1251(2.0f);
        hkhh.zhd_5("GlobalAlpha").method_1251(f7 * f5);
        hkhh.zhd_5("FresnelPower").method_1251(50.0f * f5);
        hkhh.zhd_5("FresnelColor").method_1249(fArray[0], fArray[1], fArray[2]);
        hkhh.zhd_5("FresnelAlpha").method_1251(1.0f);
        hkhh.zhd_5("BaseAlpha").method_1251(f7);
        hkhh.zhd_5("FresnelInvert").method_35649(1);
        hkhh.zhd_5("FresnelMix").method_1251(0.0f);
        hkhh.zhd_5("DistortStrength").method_1251(0.08f);
        Vector4f vector4f2 = new Vector4f(f, f2, 0.0f, 1.0f);
        vector4f2.mul((Matrix4fc)matrix4f);
        Vector4f vector4f3 = new Vector4f(f + f3, f2 + f4, 0.0f, 1.0f);
        vector4f3.mul((Matrix4fc)matrix4f);
        int n = class_310.method_1551().method_22683().method_4486();
        int n2 = class_310.method_1551().method_22683().method_4502();
        float f9 = vector4f2.x() / (float)n;
        float f10 = vector4f3.x() / (float)n;
        float f11 = 1.0f - vector4f2.y() / (float)n2;
        float f12 = 1.0f - vector4f3.y() / (float)n2;
        hkhh.zhd_5("TextureBounds").method_35657(Math.min(f9, f10), Math.max(f9, f10), Math.min(f12, f11), Math.max(f12, f11));
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2, f6).method_22913(f9, f11).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f2 + f4, f6).method_22913(f9, f12).method_39415(color3.getRGB());
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, f6).method_22913(f10, f12).method_39415(color4.getRGB());
        class_2872.method_22918(matrix4f, f + f3, f2, f6).method_22913(f10, f11).method_39415(color2.getRGB());
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

