/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_284
 *  net.minecraft.class_5944
 *  net.minecraft.class_6367
 *  net.minecraft.class_765
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.world;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_284;
import net.minecraft.class_5944;
import net.minecraft.class_6367;
import net.minecraft.class_765;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.zb_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_765.class})
public class MixinLightmapTextureManager {
    @Shadow
    @Final
    private class_6367 field_53101;

    @Inject(method={"update(F)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gl/SimpleFramebuffer;method_1240()V", shift=At.Shift.BEFORE)})
    private void onUpdate(CallbackInfo info) {
    }

    @Inject(method={"update(F)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gl/SimpleFramebuffer;method_1235(Z)V")})
    private void moondlc$applyNightModeUniforms(float tickDelta, CallbackInfo info, @Local class_5944 shaderProgram) {
        zb_2 ambience;
        if (btd_2.bzf_2()) {
            this.setNightModeUniforms(shaderProgram, new Vector3f(1.0f, 1.0f, 1.0f), 0.0f);
            return;
        }
        zb_2 zb2 = ambience = Moondlc.getInstance().getModuleManager() == null ? null : (zb_2)Moondlc.getInstance().getModuleManager().dfr_2(zb_2.class);
        if (ambience != null && ambience.ttsh()) {
            byq tint = ambience.jdsh_2();
            Vector3f tintVec = new Vector3f(tint.sbk() / 255.0f, tint.srl() / 255.0f, tint.shsl_2() / 255.0f);
            this.setNightModeUniforms(shaderProgram, tintVec, ambience.tdt());
        } else {
            this.setNightModeUniforms(shaderProgram, new Vector3f(1.0f, 1.0f, 1.0f), 0.0f);
        }
    }

    private void setNightModeUniforms(class_5944 shaderProgram, Vector3f tint, float strength) {
        class_284 tintUniform = shaderProgram.method_34582("MoonDLCNightTint");
        class_284 strengthUniform = shaderProgram.method_34582("MoonDLCNightStrength");
        if (tintUniform != null) {
            tintUniform.method_34413(tint);
        }
        if (strengthUniform != null) {
            strengthUniform.method_1251(strength);
        }
    }
}

