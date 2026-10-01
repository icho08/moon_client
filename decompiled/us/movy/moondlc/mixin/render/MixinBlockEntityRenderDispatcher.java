/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2586
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_824
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.render;

import net.minecraft.class_2586;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_824;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.brj;
import us.m0vy.moondlc.m0vyguard.ttm;

@Mixin(value={class_824.class})
public class MixinBlockEntityRenderDispatcher {
    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private <E extends class_2586> void Moondlc$hideAntiTrapBlockEntities(E blockEntity, float tickDelta, class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci) {
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && !optimization.dhtn_2(blockEntity)) {
            ci.cancel();
            return;
        }
        brj antiTrap = brj.dhqf();
        if (blockEntity != null && antiTrap != null && antiTrap.hal_2(blockEntity.method_11010())) {
            ci.cancel();
        }
    }
}

