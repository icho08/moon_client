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
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dhsh_5;

public class bmf
implements dl {
    private static final dhsh_5 bwkh;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int atow3g2bmwc;

    public void sla(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, Color color, Color color2, Color color3, Color color4) {
        this.khtk(class_45872, f, f2, f3, f4, new Vector4f(f5), color, color2, color3, color4);
    }

    public void khtk(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, Color color, Color color2, Color color3, Color color4) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = -f6 / 2.0f + f6 * 2.0f;
        float f8 = f6 / 2.0f + f6;
        float f9 = f - f7 / 2.0f;
        float f10 = f2 - f8 / 2.0f;
        float f11 = f3 + f7;
        float f12 = f4 + f8;
        float[] fArray = brb.rdz_2(color);
        float[] fArray2 = brb.rdz_2(color3);
        float[] fArray3 = brb.rdz_2(color4);
        float[] fArray4 = brb.rdz_2(color2);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        class_5944 class_59442 = bwkh.rtth();
        if (class_59442 == null) {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            return;
        }
        bwkh.zhd_5("uSize").method_1255(f3, f4);
        bwkh.zhd_5("uRadius").method_35657(vector4f.x, vector4f.z, vector4f.w, vector4f.y);
        bwkh.zhd_5("uSmoothness").method_1251(f6);
        bwkh.zhd_5("uTopLeftColor").method_35657(fArray[0], fArray[1], fArray[2], fArray[3]);
        bwkh.zhd_5("uBottomLeftColor").method_35657(fArray2[0], fArray2[1], fArray2[2], fArray2[3]);
        bwkh.zhd_5("uBottomRightColor").method_35657(fArray3[0], fArray3[1], fArray3[2], fArray3[3]);
        bwkh.zhd_5("uTopRightColor").method_35657(fArray4[0], fArray4[1], fArray4[2], fArray4[3]);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f9, f10, f5).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f9, f10 + f12, f5).method_39415(color3.getRGB());
        class_2872.method_22918(matrix4f, f9 + f11, f10 + f12, f5).method_39415(color4.getRGB());
        class_2872.method_22918(matrix4f, f9 + f11, f10, f5).method_39415(color2.getRGB());
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

