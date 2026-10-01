/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2684
 *  net.minecraft.class_634
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.network;

import net.minecraft.class_2684;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bjkh;
import us.m0vy.moondlc.m0vyguard.bzr_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_634.class})
public class ClientPlayNetworkHandlerMixin
implements tthy {
    @Inject(method={"onEntity(Lnet/minecraft/network/packet/s2c/play/EntityS2CPacket;)V"}, at={@At(value="TAIL")})
    public void onEntity(class_2684 packet, CallbackInfo ci) {
    }

    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void sendChatMessage(String content, CallbackInfo ci) {
        if (Moondlc.getInstance().getCommandManager().ssq(content)) {
            ci.cancel();
        }
    }

    @ModifyVariable(method={"sendChatMessage"}, at=@At(value="HEAD"), ordinal=0, argsOnly=true)
    private String modifyChatMessage(String message) {
        if (bjkh.shzkh() != null && bjkh.shzkh().rgha_2()) {
            return bzr_2.sdl_2(message);
        }
        return message;
    }
}

