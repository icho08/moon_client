/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10017
 *  net.minecraft.class_1297
 *  net.minecraft.class_2561
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_897
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.render.entity;

import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_2561;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.ad;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.utility.mixins.EntityRenderStateAddition;

@Mixin(value={class_897.class})
public abstract class EntityRendererMixin<T extends class_1297, S extends class_10017> {
    @Inject(method={"updateRenderState(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/render/entity/state/EntityRenderState;F)V"}, at={@At(value="HEAD")})
    private void updateRenderingEntity(T entity, S state, float tickDelta, CallbackInfo ci) {
        if (state instanceof EntityRenderStateAddition) {
            EntityRenderStateAddition addition = (EntityRenderStateAddition)state;
            addition.moondlc$setEntity((class_1297)entity);
        }
    }

    @Inject(method={"renderLabelIfPresent"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderLabelIfPresent(S state, class_2561 text, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        ad nametags = (ad)Moondlc.getInstance().getModuleManager().dfr_2(ad.class);
        if (nametags != null && nametags.rgha_2()) {
            ci.cancel();
        }
    }
}

