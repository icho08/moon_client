/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.class_1941
 *  net.minecraft.class_2338
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_3726
 *  net.minecraft.class_5329
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package us.movy.moondlc.mixin.minecraft.world;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.class_1941;
import net.minecraft.class_2338;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_5329;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import us.m0vy.moondlc.m0vyguard.bna_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_5329.class})
public abstract class BlockCollisionSpliteratorMixin {
    @WrapOperation(method={"computeNext()Ljava/lang/Object;"}, at={@At(value="INVOKE", target="Lnet/minecraft/block/ShapeContext;getCollisionShape(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/CollisionView;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/shape/VoxelShape;")})
    private class_265 onComputeNextCollisionBox(class_3726 instance, class_2680 blockState, class_1941 collisionView, class_2338 blockPos, Operation<class_265> original) {
        class_265 shape = (class_265)original.call(new Object[]{instance, blockState, collisionView, blockPos});
        if (collisionView != class_310.method_1551().field_1687) {
            return shape;
        }
        bna_2 event = new bna_2(blockState, blockPos, shape);
        Moondlc.getInstance().getEventManager().azj_2(event);
        return event.tsm_3() ? class_259.method_1073() : event.sts_2();
    }
}

