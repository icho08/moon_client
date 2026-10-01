/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_2338
 *  net.minecraft.class_761
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package us.movy.moondlc.mixin.minecraft.client.render;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_2338;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import us.m0vy.moondlc.m0vyguard.tagh;

@Mixin(value={class_761.class})
public class WorldRendererChunkAnimatorMixin {
    @ModifyArgs(method={"renderLayer(Lnet/minecraft/client/render/RenderLayer;DDDLorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gl/GlUniform;set(FFF)V"), require=0, expect=0)
    private void moondlc$animateChunkLayer(Args args, @Local class_2338 origin) {
        if (origin == null) {
            return;
        }
        Float offset = tagh.dzf_4(origin);
        if (offset != null) {
            args.set(1, (Object)Float.valueOf(((Float)args.get(1)).floatValue() + offset.floatValue()));
        }
    }
}

