/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10442
 *  net.minecraft.class_1799
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package us.movy.moondlc.mixin.minecraft.render.item;

import net.minecraft.class_10442;
import net.minecraft.class_1799;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import us.m0vy.moondlc.m0vyguard.fkh;

@Mixin(value={class_10442.class})
public abstract class ItemModelManagerMixin {
    @ModifyVariable(method={"update(Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;ZLnet/minecraft/world/World;Lnet/minecraft/entity/LivingEntity;I)V"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private class_1799 hookUpdate7(class_1799 stack) {
        fkh swordReplace = fkh.zzs_8();
        if (swordReplace == null) {
            return stack;
        }
        return swordReplace.shhd_2(stack);
    }

    @ModifyVariable(method={"update(Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;Lnet/minecraft/world/World;Lnet/minecraft/entity/LivingEntity;I)V"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private class_1799 hookUpdate6(class_1799 stack) {
        fkh swordReplace = fkh.zzs_8();
        if (swordReplace == null) {
            return stack;
        }
        return swordReplace.shhd_2(stack);
    }

    @ModifyVariable(method={"updateForLivingEntity(Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;ZLnet/minecraft/entity/LivingEntity;)V"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private class_1799 hookUpdateLiving(class_1799 stack) {
        fkh swordReplace = fkh.zzs_8();
        if (swordReplace == null) {
            return stack;
        }
        return swordReplace.shhd_2(stack);
    }

    @ModifyVariable(method={"updateForNonLivingEntity(Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;Lnet/minecraft/entity/Entity;)V"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private class_1799 hookUpdateNonLiving(class_1799 stack) {
        fkh swordReplace = fkh.zzs_8();
        if (swordReplace == null) {
            return stack;
        }
        return swordReplace.shhd_2(stack);
    }
}

