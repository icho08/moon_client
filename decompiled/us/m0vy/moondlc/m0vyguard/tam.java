/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1657
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_5944
 *  net.minecraft.class_742
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1657;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_5944;
import net.minecraft.class_742;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dhsh_5;

public class tam
implements dl {
    private static final dhsh_5 hshk;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int j9t6al89;

    public void sdth_2(class_4587 class_45872, class_1657 class_16572, float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        class_2960 class_29602 = ((class_742)class_16572).method_52814().comp_1626();
        float f7 = 0.125f;
        float f8 = 0.625f;
        float f9 = f5 * 2.0f;
        bjgh.shsf_2.tlh_4(class_45872, f + f5, f2 + f5, f3 - f9, f4 - f9, f6, color, f7, f7, f7, f7, class_29602);
        bjgh.shsf_2.tlh_4(class_45872, f, f2, f3, f4, f6, color, f8, f7, f7, f7, class_29602);
    }

    public void tlh_4(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, Color color, float f6, float f7, float f8, float f9, class_2960 class_29602) {
        this.bsz_4(class_45872, f, f2, f3, f4, new Vector4f(f5, f5, f5, f5), color, f6, f7, f8, f9, class_29602);
    }

    public void bsz_4(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color, float f5, float f6, float f7, float f8, class_2960 class_29602) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f9 = 0.0f;
        float f10 = 0.8f;
        float f11 = -f10 / 2.0f + f10 * 2.0f;
        float f12 = f10 / 2.0f + f10;
        float f13 = f - f11 / 2.0f;
        float f14 = f2 - f12 / 2.0f;
        float f15 = f3 + f11;
        float f16 = f4 + f12;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        class_5944 class_59442 = hshk.rtth();
        if (class_59442 == null) {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            return;
        }
        hshk.zhd_5("Size").method_1255(f3, f4);
        hshk.zhd_5("Radius").method_35657(vector4f.x, vector4f.z, vector4f.w, vector4f.y);
        hshk.zhd_5("Smoothness").method_1251(f10);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f13, f14, f9).method_22913(f5, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f13, f14 + f16, f9).method_22913(f5, f6 + f8).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f13 + f15, f14 + f16, f9).method_22913(f5 + f7, f6 + f8).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f13 + f15, f14, f9).method_22913(f5 + f7, f6).method_39415(color.getRGB());
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public void da_4(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, Color color, float f6, float f7, float f8, float f9, int n) {
        this.dthz(class_45872, f, f2, f3, f4, new Vector4f(f5, f5, f5, f5), color, f6, f7, f8, f9, n);
    }

    public void dthz(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color, float f5, float f6, float f7, float f8, int n) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f9 = 0.0f;
        float f10 = 0.8f;
        float f11 = -f10 / 2.0f + f10 * 2.0f;
        float f12 = f10 / 2.0f + f10;
        float f13 = f - f11 / 2.0f;
        float f14 = f2 - f12 / 2.0f;
        float f15 = f3 + f11;
        float f16 = f4 + f12;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)n);
        class_5944 class_59442 = hshk.rtth();
        if (class_59442 == null) {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            return;
        }
        hshk.zhd_5("Size").method_1255(f3, f4);
        hshk.zhd_5("Radius").method_35657(vector4f.x, vector4f.z, vector4f.w, vector4f.y);
        hshk.zhd_5("Smoothness").method_1251(f10);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f13, f14, f9).method_22913(f5, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f13, f14 + f16, f9).method_22913(f5, f6 + f8).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f13 + f15, f14 + f16, f9).method_22913(f5 + f7, f6 + f8).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f13 + f15, f14, f9).method_22913(f5 + f7, f6).method_39415(color.getRGB());
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

