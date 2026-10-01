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
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
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
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bjgh;

public class btz_3 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int np6e1eo4mi;

    public void shm_4(class_4587 class_45872, float f, float f2, double d) {
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22905((float)d, (float)d, 1.0f);
        class_45872.method_46416(-f, -f2, 0.0f);
    }

    public void ala(class_4587 class_45872, float f, float f2, double d) {
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22905(1.0f, (float)d, 1.0f);
        class_45872.method_46416(-f, -f2, 0.0f);
    }

    public void dhzj_2(class_4587 class_45872) {
        class_45872.method_22909();
    }

    public void bzth_2(class_4587 class_45872, float f, float f2, float f3, int n) {
        bjgh.jghs.hrj(class_45872, f - f3, f2 - f3, f3 * 2.0f, f3 * 2.0f, f3, new Color(n, true));
    }

    public void dhns(class_4587 class_45872, float f, float f2, float f3, float f4, int n) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.lineWidth((float)f4);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
        int n2 = Math.max(16, (int)(f3 * 2.0f));
        for (int i = 0; i <= n2; ++i) {
            float f5 = (float)((double)i * Math.PI * 2.0 / (double)n2);
            float f6 = f + (float)Math.cos(f5) * f3;
            float f7 = f2 + (float)Math.sin(f5) * f3;
            class_2872.method_22918(matrix4f, f6, f7, 0.0f).method_39415(n);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

