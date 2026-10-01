/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_332
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.client.accessor;

import net.minecraft.class_1799;
import net.minecraft.class_332;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_332.class})
public interface IDrawContextAccessor {
    @Invoker(value="drawItemBar")
    public void callDrawItemBar(class_1799 var1, int var2, int var3);

    @Invoker(value="drawCooldownProgress")
    public void callDrawCooldownProgress(class_1799 var1, int var2, int var3);
}

