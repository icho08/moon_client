/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.v2.WrapWithCondition
 *  net.minecraft.class_1297
 *  net.minecraft.class_1536
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package us.movy.moondlc.mixin.entity;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.class_1297;
import net.minecraft.class_1536;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import us.m0vy.moondlc.m0vyguard.tdhr;

@Mixin(value={class_1536.class})
public abstract class MixinFishingBobberEntity {
    @WrapWithCondition(method={"handleStatus"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/projectile/FishingBobberEntity;pullHookedEntity(Lnet/minecraft/entity/Entity;)V")})
    private boolean noPushByFishingRodHook(class_1536 instance, class_1297 entity) {
        return entity != tdhr.dhzn();
    }
}

