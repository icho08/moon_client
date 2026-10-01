/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_9975
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.render;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_9975;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.bwz;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.zb_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_9975.class})
public class SkyRenderingMixin {
    @Inject(method={"renderSky(FFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderCustomSkybox(float red, float green, float blue, CallbackInfo info) {
        if (btd_2.bzf_2()) {
            return;
        }
        zb_2 ambience = this.getAmbience();
        if (ambience != null && ambience.ztk_3()) {
            byq color;
            byq byq2 = color = ambience.khqt() ? ambience.dqd() : byq.brz_2;
            if (ambience.jaq_2()) {
                bwz.tdm_4(ambience.dhrh(), color);
            }
            if (ambience.dhr_3()) {
                float time = (float)(System.currentTimeMillis() % 100000000L) / 1000.0f;
                float opacity = ambience.jaq_2() ? ambience.bza_3() : 1.0f;
                bwz.zwt(ambience.tza_4(), color, time, opacity);
            }
            info.cancel();
        }
    }

    @Inject(method={"close()V"}, at={@At(value="HEAD")})
    private void closeCustomSkybox(CallbackInfo info) {
        bwz.zwt_2();
    }

    @Redirect(method={"renderStars(Lnet/minecraft/client/render/Fog;FLnet/minecraft/client/util/math/MatrixStack;)V"}, at=@At(value="INVOKE", target="Lcom/mojang/blaze3d/systems/RenderSystem;setShaderColor(FFFF)V", ordinal=0))
    private void redirectStarColor(float red, float green, float blue, float alpha) {
        if (btd_2.bzf_2()) {
            RenderSystem.setShaderColor((float)red, (float)green, (float)blue, (float)alpha);
            return;
        }
        zb_2 ambience = this.getAmbience();
        if (ambience != null && ambience.sshh()) {
            byq color = ambience.sdt_2();
            RenderSystem.setShaderColor((float)(color.sbk() / 255.0f), (float)(color.srl() / 255.0f), (float)(color.shsl_2() / 255.0f), (float)(color.tzdh_2() / 255.0f));
        } else {
            RenderSystem.setShaderColor((float)red, (float)green, (float)blue, (float)alpha);
        }
    }

    private zb_2 getAmbience() {
        return Moondlc.getInstance().getModuleManager() == null ? null : (zb_2)Moondlc.getInstance().getModuleManager().dfr_2(zb_2.class);
    }
}

