/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1738
 *  net.minecraft.class_1741
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_8051
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.item;

import net.minecraft.class_1738;
import net.minecraft.class_1741;
import net.minecraft.class_1792;
import net.minecraft.class_8051;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.movy.moondlc.utility.mixins.ArmorItemAddition;

@Mixin(value={class_1738.class})
public abstract class ArmorItemMixin
implements ArmorItemAddition {
    @Unique
    private class_8051 moondlc$type;
    @Unique
    private class_1741 moondlc$material;

    @Inject(method={"<init>(Lnet/minecraft/item/equipment/ArmorMaterial;Lnet/minecraft/item/equipment/EquipmentType;Lnet/minecraft/item/Item$Settings;)V"}, at={@At(value="TAIL")})
    public void saveArgs(class_1741 material, class_8051 type, class_1792.class_1793 settings, CallbackInfo ci) {
        this.moondlc$type = type;
        this.moondlc$material = material;
    }

    @Override
    public class_1741 moondlc$getMaterial() {
        return this.moondlc$material;
    }

    @Override
    public class_8051 moondlc$getType() {
        return this.moondlc$type;
    }
}

