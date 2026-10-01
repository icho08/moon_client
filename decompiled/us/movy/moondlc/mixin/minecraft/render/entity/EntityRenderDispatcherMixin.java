/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_1297
 *  net.minecraft.class_2338
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_898
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.render.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.bra;
import us.m0vy.moondlc.m0vyguard.brj;
import us.m0vy.moondlc.m0vyguard.bsz_3;
import us.m0vy.moondlc.m0vyguard.ttm;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_898.class})
public abstract class EntityRenderDispatcherMixin {
    @ModifyExpressionValue(method={"renderHitbox"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;getBoundingBox()Lnet/minecraft/util/math/Box;", ordinal=0)})
    private static class_238 Moondlc$renderExpandedHitbox(class_238 original, class_4587 matrices, class_4588 vertices, class_1297 entity, float tickDelta, float red, float green, float blue) {
        bsz_3 hitbox = bsz_3.skhy();
        return hitbox != null ? hitbox.dhds_3(entity, original, tickDelta) : original;
    }

    @Inject(method={"getLight(Lnet/minecraft/entity/Entity;F)I"}, at={@At(value="RETURN")}, cancellable=true)
    private <E extends class_1297> void moondlc$applyDynamicFullbright(E entity, float tickDelta, CallbackInfoReturnable<Integer> info) {
        class_2338 pos = class_2338.method_49638((class_2374)entity.method_31166(tickDelta));
        info.setReturnValue((Object)bra.dds_5(pos, info.getReturnValueI()));
    }

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private <E extends class_1297> void Moondlc$hideAntiTrapEntities(E entity, double x, double y, double z, float tickDelta, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && !optimization.ghjz(entity)) {
            ci.cancel();
            return;
        }
        brj antiTrap = (brj)Moondlc.getInstance().getModuleManager().dfr_2(brj.class);
        if (antiTrap != null && antiTrap.hth_3(entity)) {
            ci.cancel();
        }
    }
}

