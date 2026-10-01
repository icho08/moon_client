/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_5944
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import us.m0vy.moondlc.m0vyguard.dhsh_5;

public class trsh {
    private static final dhsh_5 hba;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int julxshpsr6;

    public void shlr(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        this.jght_2(class_45872, f, f2, f3, f4, new Vector4f(f5, f5, f5, f5), f6, color);
    }

    public void jght_2(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, float f5, Color color) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = 0.8f;
        float f7 = -f6 / 2.0f + f6 * 2.0f;
        float f8 = f6 / 2.0f + f6;
        float f9 = f - f7 / 2.0f;
        float f10 = f2 - f8 / 2.0f;
        float f11 = f3 + f7;
        float f12 = f4 + f8;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        class_5944 class_59442 = hba.rtth();
        if (class_59442 == null) {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            return;
        }
        hba.zhd_5("uSize").method_1255(f3, f4);
        hba.zhd_5("uRadius").method_35657(vector4f.x, vector4f.z, vector4f.w, vector4f.y);
        hba.zhd_5("uSmoothness").method_1251(f6);
        hba.zhd_5("uThickness").method_1251(f5);
        int n = color.getRGB();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f9, f10, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f9, f10 + f12, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f9 + f11, f10 + f12, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f9 + f11, f10, 0.0f).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

