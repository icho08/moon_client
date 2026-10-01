/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_287
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthy;

public final class tth_8
implements tthy {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int a3xdwzeqzppl3;

    public static void shhd_4(class_4587 class_45872, class_287 class_2872, class_238 class_2383, byq byq2) {
        float f = byq2.sbk();
        float f2 = byq2.srl();
        float f3 = byq2.shsl_2();
        float f4 = byq2.tzdh_2();
        RenderSystem.enableBlend();
        RenderSystem.disableDepthTest();
        RenderSystem.disableCull();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        int n = 3;
        float f5 = 0.1f;
        for (int i = n; i >= 1; --i) {
            float f6 = (float)i * f5;
            float f7 = f4 * (0.15f / (float)i);
            tth_8.khldh(class_45872, class_2872, class_2383.method_1014((double)f6), new byq(f, f2, f3, f7));
        }
        tth_8.khldh(class_45872, class_2872, class_2383, new byq(f, f2, f3, f4));
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    public static void khldh(class_4587 class_45872, class_287 class_2872, class_238 class_2383, byq byq2) {
        float f = byq2.sbk() / 255.0f;
        float f2 = byq2.srl() / 255.0f;
        float f3 = byq2.shsl_2() / 255.0f;
        float f4 = byq2.tzdh_2() / 255.0f;
        tth_8.hlt(class_45872, class_2872, class_2383, f, f2, f3, f4);
    }

    public static void jqz(class_4587 class_45872, class_287 class_2872, class_238 class_2383, byq byq2) {
        float f = byq2.sbk() / 255.0f;
        float f2 = byq2.srl() / 255.0f;
        float f3 = byq2.shsl_2() / 255.0f;
        float f4 = byq2.tzdh_2() / 255.0f;
        float f5 = (float)class_2383.field_1323;
        float f6 = (float)class_2383.field_1322;
        float f7 = (float)class_2383.field_1321;
        float f8 = (float)class_2383.field_1320;
        float f9 = (float)class_2383.field_1325;
        float f10 = (float)class_2383.field_1324;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
    }

    public static void hlt(class_4587 class_45872, class_287 class_2872, class_238 class_2383, float f, float f2, float f3, float f4) {
        float f5 = (float)class_2383.field_1323;
        float f6 = (float)class_2383.field_1322;
        float f7 = (float)class_2383.field_1321;
        float f8 = (float)class_2383.field_1320;
        float f9 = (float)class_2383.field_1325;
        float f10 = (float)class_2383.field_1324;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
    }

    public static void zsz_6(class_4587 class_45872, class_287 class_2872, class_238 class_2383, byq byq2) {
        float f = byq2.sbk() / 255.0f;
        float f2 = byq2.srl() / 255.0f;
        float f3 = byq2.shsl_2() / 255.0f;
        float f4 = byq2.tzdh_2() / 255.0f;
        float f5 = (float)class_2383.field_1323;
        float f6 = (float)class_2383.field_1322;
        float f7 = (float)class_2383.field_1321;
        float f8 = (float)class_2383.field_1320;
        float f9 = (float)class_2383.field_1325;
        float f10 = (float)class_2383.field_1324;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f7).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f8, f9, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f6, f10).method_22915(f, f2, f3, f4);
        class_2872.method_22918(matrix4f, f5, f9, f10).method_22915(f, f2, f3, f4);
    }

    public static void ds_2(class_4587 class_45872, class_4588 class_45882, class_243 class_2432, class_243 class_2433, byq byq2) {
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        class_243 class_2434 = class_2433.method_1020(class_2432).method_1029();
        Vector3f vector3f = new Vector3f((float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350);
        class_45882.method_61032(class_46652, vector3f).method_39415(byq2.rk()).method_60831(class_46652, (float)class_2434.field_1352, (float)class_2434.field_1351, (float)class_2434.field_1350);
        class_45882.method_56824(class_46652, (float)class_2433.field_1352, (float)class_2433.field_1351, (float)class_2433.field_1350).method_39415(byq2.rk()).method_60831(class_46652, (float)class_2434.field_1352, (float)class_2434.field_1351, (float)class_2434.field_1350);
    }

    public static void zbdh_2(class_4587 class_45872, class_287 class_2872, class_243 class_2432, class_243 class_2433, byq byq2) {
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        Matrix4f matrix4f = class_46652.method_23761();
        class_243 class_2434 = class_2433.method_1020(class_2432).method_1029();
        class_2872.method_22918(matrix4f, (float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350).method_39415(byq2.rk()).method_60831(class_46652, (float)class_2434.field_1352, (float)class_2434.field_1351, (float)class_2434.field_1350);
        class_2872.method_22918(matrix4f, (float)class_2433.field_1352, (float)class_2433.field_1351, (float)class_2433.field_1350).method_39415(byq2.rk()).method_60831(class_46652, (float)class_2434.field_1352, (float)class_2434.field_1351, (float)class_2434.field_1350);
    }

    public static void zkht_3(class_4587 class_45872, class_287 class_2872, class_243 class_2432, byq byq2) {
        class_4184 class_41842 = tth_8.mc.field_1773.method_19418();
        class_243 class_2433 = class_41842.method_19326();
        class_243 class_2434 = new class_243(0.0, 0.0, 27.0).method_1037((float)(-Math.toRadians(class_41842.method_19329()))).method_1024((float)(-Math.toRadians(class_41842.method_19330())));
        class_243 class_2435 = class_2432.method_1020(class_2433);
        class_243 class_2436 = new class_243(class_2434.method_10216(), class_2434.method_10214(), class_2434.method_10215());
        tth_8.zbdh_2(class_45872, class_2872, class_2436, class_2435, byq2);
    }

    @Generated
    private tth_8() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

