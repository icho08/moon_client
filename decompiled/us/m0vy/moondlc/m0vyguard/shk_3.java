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
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import us.m0vy.moondlc.m0vyguard.bkhz_2;
import us.m0vy.moondlc.m0vyguard.tthy;

public final class shk_3
implements tthy,
bkhz_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int pqook47uejloy;

    public static void sj(class_4587 class_45872, float f, float f2, float f3) {
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(f3));
        class_45872.method_46416(-f, -f2, 0.0f);
    }

    public static void bdhkh(class_4587 class_45872, float f, float f2, float f3) {
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22905(f3, f3, 1.0f);
        class_45872.method_46416(-f, -f2, 0.0f);
    }

    public static void hbj(class_4587 class_45872) {
        class_45872.method_22909();
    }

    public static void tsh(class_4587 class_45872) {
        class_4184 class_41842 = shk_3.mc.field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        class_243 class_2433 = class_243.field_1353.method_1020(class_2432);
        class_45872.method_22904(class_2433.method_10216(), class_2433.method_10214(), class_2433.method_10215());
    }

    public static void ghsf(class_4587 class_45872, class_243 class_2432) {
        class_4184 class_41842 = shk_3.mc.field_1773.method_19418();
        class_243 class_2433 = class_41842.method_19326();
        class_243 class_2434 = class_2432.method_1020(class_2433);
        class_45872.method_22904(class_2434.method_10216(), class_2434.method_10214(), class_2434.method_10215());
    }

    public static void thsh_9(boolean bl) {
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.depthMask((boolean)false);
        if (bl) {
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        } else {
            RenderSystem.defaultBlendFunc();
        }
    }

    public static void tsd_6() {
        RenderSystem.depthMask((boolean)true);
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
    }

    public static void tbgh_2(class_287 class_2872) {
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    @Generated
    private shk_3() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

