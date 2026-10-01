/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1937
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.world;

import net.minecraft.class_1937;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.zb_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_1937.class})
public abstract class WorldMixin {
    @Inject(method={"getRainGradient"}, cancellable=true, at={@At(value="HEAD")})
    private void overrideWeather(float delta, CallbackInfoReturnable<Float> cir) {
        if (btd_2.bzf_2()) {
            return;
        }
        zb_2 module = (zb_2)Moondlc.getInstance().getModuleManager().dfr_2(zb_2.class);
        if (module != null && module.rgha_2()) {
            if (module.jak.dhbn("Sunny")) {
                cir.setReturnValue((Object)Float.valueOf(0.0f));
            } else if (module.jak.dhbn("Rainy") || module.jak.dhbn("Thunder")) {
                cir.setReturnValue((Object)Float.valueOf(1.0f));
            } else if (module.jak.dhbn("Snowy")) {
                cir.setReturnValue((Object)Float.valueOf(0.9f));
            }
        }
    }

    @Inject(method={"getThunderGradient"}, cancellable=true, at={@At(value="HEAD")})
    private void overrideThunder(float delta, CallbackInfoReturnable<Float> cir) {
        if (btd_2.bzf_2()) {
            return;
        }
        zb_2 module = (zb_2)Moondlc.getInstance().getModuleManager().dfr_2(zb_2.class);
        if (module != null && module.rgha_2()) {
            if (module.jak.dhbn("Sunny") || module.jak.dhbn("Rainy") || module.jak.dhbn("Snowy")) {
                cir.setReturnValue((Object)Float.valueOf(0.0f));
            } else if (module.jak.dhbn("Thunder")) {
                cir.setReturnValue((Object)Float.valueOf(1.0f));
            }
        }
    }
}

