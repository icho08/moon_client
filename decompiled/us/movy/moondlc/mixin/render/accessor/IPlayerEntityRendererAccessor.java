/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1007
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.render.accessor;

import net.minecraft.class_1007;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1007.class})
public interface IPlayerEntityRendererAccessor {
    @Invoker(value="renderRightArm")
    public void callRenderRightArm(class_4587 var1, class_4597 var2, int var3, class_2960 var4, boolean var5);

    @Invoker(value="renderLeftArm")
    public void callRenderLeftArm(class_4587 var1, class_4597 var2, int var3, class_2960 var4, boolean var5);
}

