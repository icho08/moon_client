/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10489
 *  net.minecraft.class_1799
 *  net.minecraft.class_1829
 *  net.minecraft.class_9280
 *  net.minecraft.class_9331
 *  net.minecraft.class_9334
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package us.movy.moondlc.mixin.minecraft.render.item;

import net.minecraft.class_10489;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_9280;
import net.minecraft.class_9331;
import net.minecraft.class_9334;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import us.m0vy.moondlc.m0vyguard.fkh;

@Mixin(value={class_10489.class})
public abstract class CustomModelDataStringPropertyMixin {
    @Redirect(method={"getValue(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/entity/LivingEntity;ILnet/minecraft/item/ModelTransformationMode;)Ljava/lang/String;"}, at=@At(value="INVOKE", target="Lnet/minecraft/item/ItemStack;get(Lnet/minecraft/component/ComponentType;)Ljava/lang/Object;"))
    private <T> T swordReplace$redirectGetCustomModelData(class_1799 stack, class_9331<? extends T> type) {
        class_9280 component;
        fkh swordReplace = fkh.zzs_8();
        if (swordReplace != null && swordReplace.rgha_2() && type == class_9334.field_49637 && !stack.method_7960() && stack.method_7909() instanceof class_1829 && (component = swordReplace.thadh()) != null) {
            class_9280 result = component;
            return (T)result;
        }
        return (T)stack.method_57824(type);
    }
}

