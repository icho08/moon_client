/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_3959$class_242
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package us.movy.moondlc.mixin.other;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.m0vy.moondlc.m0vyguard.kq;

@Mixin(value={class_1792.class})
public abstract class MixinItem {
    @ModifyExpressionValue(method={"raycast"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;getRotationVector(FF)Lnet/minecraft/util/math/Vec3d;")})
    private static class_243 hookFixRotation(class_243 original, class_1937 world, class_1657 player, class_3959.class_242 fluidHandling) {
        taj rotation = kq.thzt_2().tthw();
        if (player == tdhr.dhzn() && rotation != null) {
            return rotation.rrj();
        }
        return original;
    }
}

