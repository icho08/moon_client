/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2586
 *  net.minecraft.class_2818
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.world.chunk;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2818;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bght_2;

@Mixin(value={class_2818.class})
public abstract class WorldChunkMixin {
    @Shadow
    public abstract class_1937 method_12200();

    @Inject(method={"setBlockEntity(Lnet/minecraft/block/entity/BlockEntity;)V"}, at={@At(value="INVOKE", target="Ljava/util/Map;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")})
    private void onLoadBlockEntity(class_2586 blockEntity, CallbackInfo ci, @Local(ordinal=0) class_2586 removedBlockEntity) {
        if (!bght_2.sma_2.contains(blockEntity)) {
            // empty if block
        }
    }

    @Inject(method={"removeBlockEntity(Lnet/minecraft/util/math/BlockPos;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/block/entity/BlockEntity;markRemoved()V")})
    private void onRemoveBlockEntity(class_2338 pos, CallbackInfo ci, @Local @Nullable class_2586 removed) {
        if (removed != null) {
            bght_2.sma_2.remove(removed);
        }
    }
}

