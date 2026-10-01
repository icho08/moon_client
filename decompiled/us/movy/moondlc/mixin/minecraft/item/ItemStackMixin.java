/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.item;

import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.ttm;
import us.m0vy.moondlc.m0vyguard.j_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_1799.class})
public abstract class ItemStackMixin {
    @Inject(method={"hasGlint()Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void optimization$disableGlint(CallbackInfoReturnable<Boolean> cir) {
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && optimization.dzb_3()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"finishUsing(Lnet/minecraft/world/World;Lnet/minecraft/entity/LivingEntity;)Lnet/minecraft/item/ItemStack;"}, at={@At(value="TAIL")})
    private void onFinishUsing(class_1937 world, class_1309 user, CallbackInfoReturnable<class_1799> cir) {
        if (user instanceof class_1657) {
            class_1657 player = (class_1657)user;
            Moondlc.getInstance().getEventManager().azj_2(new j_2(player, (class_1799)this));
        }
    }
}

