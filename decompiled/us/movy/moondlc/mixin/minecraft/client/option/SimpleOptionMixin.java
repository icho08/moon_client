/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_7172
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.option;

import net.minecraft.class_2561;
import net.minecraft.class_7172;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_7172.class})
public class SimpleOptionMixin<T> {
    @Shadow
    @Final
    class_2561 field_38280;
    @Shadow
    T field_37868;

    @Inject(method={"setValue(Ljava/lang/Object;)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void setGammaValue(T value, CallbackInfo ci) {
        if (this.field_38280.getString().equals("Gamma")) {
            this.field_37868 = value;
            ci.cancel();
        }
    }
}

