/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.class_1959$class_1963
 *  net.minecraft.class_9976
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package us.movy.moondlc.mixin.minecraft.client.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_1959;
import net.minecraft.class_9976;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.zb_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_9976.class})
public abstract class WeatherRenderingMixin {
    @ModifyExpressionValue(method={"addParticlesAndSound"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/world/ClientWorld;getRainGradient(F)F")})
    private float ambientPrecipitation(float original) {
        if (btd_2.bzf_2()) {
            return original;
        }
        zb_2 moduleCustomAmbience = (zb_2)Moondlc.getInstance().getModuleManager().dfr_2(zb_2.class);
        if (moduleCustomAmbience != null && moduleCustomAmbience.rgha_2() && moduleCustomAmbience.jak.dhbn("Snowy")) {
            return 0.0f;
        }
        return original;
    }

    @ModifyReturnValue(method={"getPrecipitationAt"}, at={@At(value="RETURN", ordinal=1)})
    private class_1959.class_1963 modifyBiomePrecipitation(class_1959.class_1963 original) {
        if (btd_2.bzf_2()) {
            return original;
        }
        zb_2 moduleOverrideWeather = (zb_2)Moondlc.getInstance().getModuleManager().dfr_2(zb_2.class);
        if (moduleOverrideWeather != null && moduleOverrideWeather.rgha_2() && moduleOverrideWeather.jak.dhbn("Snowy")) {
            return class_1959.class_1963.field_9383;
        }
        return original;
    }
}

