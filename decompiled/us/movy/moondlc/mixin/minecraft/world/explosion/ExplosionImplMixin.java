/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_9892
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.world.explosion;

import java.util.List;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_9892;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bdz_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.ExplosionImplAccessor;

@Mixin(value={class_9892.class})
public abstract class ExplosionImplMixin
implements tthy {
    @Inject(method={"explode()V"}, at={@At(value="INVOKE", target="Lnet/minecraft/world/explosion/ExplosionImpl;damageEntities()V", shift=At.Shift.AFTER)})
    private void onAfterDamageEntities(CallbackInfo ci) {
        class_9892 self = (class_9892)this;
        List<class_2338> affectedBlocks = ((ExplosionImplAccessor)self).invokeGetBlocksToDestroy();
        List<class_2338> debris = affectedBlocks.stream().filter(pos -> self.method_64504().method_8320(pos).method_27852(class_2246.field_22109)).toList();
        if (!debris.isEmpty() && self.method_64504().method_27983() == class_1937.field_25180) {
            Moondlc.getInstance().getEventManager().azj_2(new bdz_2(debris, self.method_55109()));
        }
    }
}

