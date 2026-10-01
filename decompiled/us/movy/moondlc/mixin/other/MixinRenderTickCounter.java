/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_9779$class_9781
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.other;

import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.dha_5;

@Mixin(value={class_9779.class_9781.class})
public class MixinRenderTickCounter {
    @Shadow
    private float field_51958;

    @Inject(method={"beginRenderTick(J)I"}, at={@At(value="FIELD", target="Lnet/minecraft/client/render/RenderTickCounter$Dynamic;lastFrameDuration:F", shift=At.Shift.AFTER)})
    private void timer(CallbackInfoReturnable<Integer> callback) {
        float customTimer = dha_5.khkq().jkha();
        if (customTimer > 0.0f) {
            this.field_51958 *= customTimer;
        }
    }
}

