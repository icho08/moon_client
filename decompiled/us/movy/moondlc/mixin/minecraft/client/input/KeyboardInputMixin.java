/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10185
 *  net.minecraft.class_743
 *  net.minecraft.class_744
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.input;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.tsf;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.input.MixinInput;
import us.movy.moondlc.mixin.minecraft.client.input.InputAccessor;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_743.class})
public abstract class KeyboardInputMixin
extends MixinInput {
    @Inject(method={"tick()V"}, at={@At(value="TAIL")})
    private void onTickTail(CallbackInfo ci) {
        class_744 input = (class_744)this;
        InputAccessor accessor = (InputAccessor)input;
        class_10185 keys = accessor.getInput();
        boolean jumping = keys.comp_3163();
        boolean sneaking = keys.comp_3164();
        boolean sprint = keys.comp_3165();
        float rawForward = KeyboardInputMixin.getMovementMultiplier(keys.comp_3159(), keys.comp_3160());
        float rawStrafe = KeyboardInputMixin.getMovementMultiplier(keys.comp_3161(), keys.comp_3162());
        tsf event = new tsf(rawForward, rawStrafe, jumping, sneaking, sprint);
        Moondlc.getInstance().getEventManager().azj_2(event);
        float fw = event.ztt();
        float st = event.hyq();
        accessor.setMovementForward(fw);
        accessor.setMovementSideways(st);
        boolean forwardKey = fw > 0.0f;
        boolean backwardKey = fw < 0.0f;
        boolean leftKey = st > 0.0f;
        boolean rightKey = st < 0.0f;
        accessor.setInput(new class_10185(forwardKey, backwardKey, leftKey, rightKey, event.zthy(), event.ddq_3(), event.bd_2()));
    }

    @Unique
    private static float getMovementMultiplier(boolean positive, boolean negative) {
        if (positive == negative) {
            return 0.0f;
        }
        return positive ? 1.0f : -1.0f;
    }
}

