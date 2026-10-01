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

public abstract class tjd_2 {
    protected static tjd_2 khsj;
    protected class_287 khkl;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tjgiseet;

    public tjd_2(class_293 class_2932) {
        this.khkl = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_2932);
        khsj = this;
    }

    protected void shqy() {
        class_9801 class_98012 = this.khkl.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    public abstract void jbn();

    @Generated
    public class_287 dzj() {
        return this.khkl;
    }

    @Generated
    public static tjd_2 sz_3() {
        return khsj;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

