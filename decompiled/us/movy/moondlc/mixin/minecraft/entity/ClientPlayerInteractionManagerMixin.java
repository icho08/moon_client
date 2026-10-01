/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.entity;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.bbq;
import us.m0vy.moondlc.m0vyguard.bhq;
import us.m0vy.moondlc.m0vyguard.bkhgh;
import us.m0vy.moondlc.m0vyguard.bdhd_2;
import us.m0vy.moondlc.m0vyguard.brj;
import us.m0vy.moondlc.m0vyguard.bsz_3;
import us.m0vy.moondlc.m0vyguard.bqr;
import us.m0vy.moondlc.m0vyguard.bkf;
import us.m0vy.moondlc.m0vyguard.tskh;
import us.m0vy.moondlc.m0vyguard.khk;
import us.m0vy.moondlc.m0vyguard.wb;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_636.class})
public class ClientPlayerInteractionManagerMixin {
    @Shadow
    @Final
    private class_310 field_3712;
    @Unique
    private class_3965 freeCam$correctedHit;

    @Inject(method={"attackEntity(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void moondlc$critPre(class_1657 player, class_1297 target, CallbackInfo ci) {
        if (ClientPlayerInteractionManagerMixin.shouldHideEntity(target)) {
            ci.cancel();
            return;
        }
        bsz_3 hitbox = bsz_3.skhy();
        if (hitbox != null && hitbox.rgha_2()) {
            hitbox.zdq_4(target);
            if (hitbox.jzb_2(target)) {
                hitbox.sjf();
                ci.cancel();
                return;
            }
        }
        bkf event = new bkf(target);
        Moondlc.getInstance().getEventManager().azj_2(event);
        if (event.tsm_3()) {
            ci.cancel();
        }
    }

    @Inject(method={"breakBlock(Lnet/minecraft/util/math/BlockPos;)Z"}, at={@At(value="RETURN")}, cancellable=true)
    public void breakBlockHook(class_2338 pos, CallbackInfoReturnable<Boolean> cir) {
        bhq event = new bhq(pos);
        Moondlc.getInstance().getEventManager().azj_2(event);
        if (event.tsm_3()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"breakBlock(Lnet/minecraft/util/math/BlockPos;)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void antiTrap$preventBreakBlock(class_2338 pos, CallbackInfoReturnable<Boolean> cir) {
        if (this.field_3712.field_1687 != null && ClientPlayerInteractionManagerMixin.shouldBlockInteraction(this.field_3712.field_1687.method_8320(pos))) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"attackBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAttackBlock(class_2338 blockPos, class_2350 direction, CallbackInfoReturnable<Boolean> info) {
        if (this.field_3712.field_1687 != null && ClientPlayerInteractionManagerMixin.shouldBlockInteraction(this.field_3712.field_1687.method_8320(blockPos))) {
            info.setReturnValue((Object)false);
            return;
        }
        tskh event = new tskh(blockPos);
        Moondlc.getInstance().getEventManager().azj_2(event);
        if (event.tsm_3()) {
            info.cancel();
        }
    }

    @Inject(method={"interactBlock(Lnet/minecraft/client/network/ClientPlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;)Lnet/minecraft/util/ActionResult;"}, at={@At(value="HEAD")}, cancellable=true)
    public void preventInteraction(class_746 player, class_1268 hand, class_3965 hitResult, CallbackInfoReturnable<class_1269> cir) {
        if (this.field_3712.field_1687 != null) {
            class_1269 result;
            if (ClientPlayerInteractionManagerMixin.shouldBlockInteraction(this.field_3712.field_1687.method_8320(hitResult.method_17777()))) {
                cir.setReturnValue((Object)class_1269.field_5811);
                return;
            }
            bkhgh noInteractModule = (bkhgh)Moondlc.getInstance().getModuleManager().dfr_2(bkhgh.class);
            class_2248 block = this.field_3712.field_1687.method_8320(hitResult.method_17777()).method_26204();
            if (noInteractModule != null && noInteractModule.rgha_2() && noInteractModule.zjr_2(block)) {
                cir.setReturnValue((Object)class_1269.field_5811);
                return;
            }
            wb crystalOptimizer = (wb)Moondlc.getInstance().getModuleManager().dfr_2(wb.class);
            if (crystalOptimizer != null && crystalOptimizer.rgha_2() && (result = crystalOptimizer.ztd_7((class_1657)player, hand, hitResult)) == class_1269.field_5814) {
                cir.setReturnValue((Object)class_1269.field_5814);
            }
        }
    }

    @Inject(method={"clickSlot(IIILnet/minecraft/screen/slot/SlotActionType;Lnet/minecraft/entity/player/PlayerEntity;)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void onClickSlot(int syncId, int slotId, int button, class_1713 actionType, class_1657 player, CallbackInfo ci) {
        if (this.field_3712.field_1724 == null || this.field_3712.field_1687 == null) {
            return;
        }
        bqr event = new bqr(actionType, slotId, button, syncId);
        Moondlc.getInstance().getEventManager().azj_2(event);
        if (event.tsm_3()) {
            ci.cancel();
            return;
        }
        bbq oldEvent = new bbq(actionType, slotId, button, syncId);
        if (khk.thshk().zkhh(oldEvent)) {
            ci.cancel();
        }
    }

    @Inject(method={"interactEntity(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResult;"}, at={@At(value="HEAD")}, cancellable=true)
    private void onInteractEntity(class_1657 player, class_1297 entity, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
        if (ClientPlayerInteractionManagerMixin.shouldHideEntity(entity)) {
            cir.setReturnValue((Object)class_1269.field_5811);
        }
    }

    @Inject(method={"interactEntityAtLocation(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/hit/EntityHitResult;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResult;"}, at={@At(value="HEAD")}, cancellable=true)
    private void onInteractEntityAtLocation(class_1657 player, class_1297 entity, class_3966 hitResult, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
        if (ClientPlayerInteractionManagerMixin.shouldHideEntity(entity)) {
            cir.setReturnValue((Object)class_1269.field_5811);
        }
    }

    @Inject(method={"interactBlock(Lnet/minecraft/client/network/ClientPlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;)Lnet/minecraft/util/ActionResult;"}, at={@At(value="HEAD")}, cancellable=true)
    private void freeCam$prepareInteractBlock(class_746 player, class_1268 hand, class_3965 hitResult, CallbackInfoReturnable<class_1269> cir) {
        this.freeCam$correctedHit = null;
        bdhd_2 freeCam = bdhd_2.bfz();
        if (freeCam == null || !freeCam.rgha_2() || !freeCam.rlr()) {
            return;
        }
        class_3965 bodyHit = freeCam.dfy(hitResult);
        if (bodyHit == null) {
            cir.setReturnValue((Object)class_1269.field_5814);
            return;
        }
        this.freeCam$correctedHit = bodyHit;
    }

    @ModifyVariable(method={"interactBlockInternal(Lnet/minecraft/client/network/ClientPlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;)Lnet/minecraft/util/ActionResult;"}, at=@At(value="HEAD"), argsOnly=true, require=0)
    private class_3965 freeCam$modifyInteractBlockHitResult(class_3965 hitResult) {
        if (this.freeCam$correctedHit != null) {
            return this.freeCam$correctedHit;
        }
        return hitResult;
    }

    @Inject(method={"interactBlock(Lnet/minecraft/client/network/ClientPlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;)Lnet/minecraft/util/ActionResult;"}, at={@At(value="RETURN")})
    private void freeCam$cleanupInteractBlock(CallbackInfoReturnable<class_1269> cir) {
        this.freeCam$correctedHit = null;
    }

    @Unique
    private static boolean shouldHideEntity(class_1297 entity) {
        brj antiTrap = brj.dhqf();
        return antiTrap != null && antiTrap.hth_3(entity);
    }

    @Unique
    private static boolean shouldBlockInteraction(class_2680 state) {
        brj antiTrap = brj.dhqf();
        return antiTrap != null && antiTrap.zta_5(state);
    }
}

