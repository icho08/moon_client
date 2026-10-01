/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_293
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_9801
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import lombok.Generated;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_293;
import net.minecraft.class_9801;

public abstract class bmt_2 {
    protected static bmt_2 sbgh;
    protected class_287 khts_4;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ylbtgwd6kb38;

    public bmt_2(class_293 class_2932) {
        this.khts_4 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_2932);
        sbgh = this;
    }

    protected void mdh() {
        class_9801 class_98012 = this.khts_4.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    public abstract void sw_2();

    @Generated
    public class_287 ttgh() {
        return this.khts_4;
    }

    @Generated
    public static bmt_2 zqy_2() {
        return sbgh;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

