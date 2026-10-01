/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_310
 *  net.minecraft.class_6880
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client;

import net.minecraft.class_1293;
import net.minecraft.class_310;
import net.minecraft.class_6880;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.bkr;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.movy.moondlc.utility.mixins.StatusEffectInstanceAddition;

@Mixin(value={class_1293.class})
public class StatusEffectInstanceMixin
implements StatusEffectInstanceAddition {
    @Unique
    private final fa_2 potionStatusAnimation = new fa_2(300L, 0.0f, jkh.dzb);
    @Unique
    private bkr timeAnimation;

    @Inject(method={"<init>(Lnet/minecraft/registry/entry/RegistryEntry;IIZZZLnet/minecraft/entity/effect/StatusEffectInstance;)V"}, at={@At(value="TAIL")})
    public void onInit(class_6880<?> effect, int duration, int amplifier, boolean ambient, boolean showParticles, boolean showIcon, class_1293 hiddenEffect, CallbackInfo ci) {
        if (class_310.method_1551() != null && class_310.method_1551().field_1724 != null) {
            this.timeAnimation = new bkr(brz_2.shthm, 3.0f, 300L, btf_2.zdq);
        }
    }

    @Override
    public fa_2 moondlc$getAnimPotion() {
        return this.potionStatusAnimation;
    }

    @Override
    public bkr moondlc$getTimeAnimation() {
        return this.timeAnimation;
    }
}

