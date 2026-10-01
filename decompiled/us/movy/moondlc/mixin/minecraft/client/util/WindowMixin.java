/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10219
 *  net.minecraft.class_1041
 *  net.minecraft.class_3262
 *  net.minecraft.class_7367
 *  net.minecraft.class_8518
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.util;

import java.io.InputStream;
import java.util.List;
import net.minecraft.class_10219;
import net.minecraft.class_1041;
import net.minecraft.class_3262;
import net.minecraft.class_7367;
import net.minecraft.class_8518;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.tht_2;
import us.m0vy.moondlc.m0vyguard.rs;
import us.m0vy.moondlc.m0vyguard.fsh;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_1041.class})
public class WindowMixin {
    @Shadow
    @Final
    private long field_5187;

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void onWindowInit(CallbackInfo ci) {
        tht_2.ghra(this.field_5187);
    }

    @Inject(method={"onWindowSizeChanged"}, at={@At(value="RETURN")})
    private void windowResizeHook(long window, int width, int height, CallbackInfo ci) {
        rs.tt().jqy();
    }

    @Inject(method={"onFramebufferSizeChanged"}, at={@At(value="RETURN")})
    private void framebufferResizeHook(long window, int width, int height, CallbackInfo callbackInfo) {
        if (window == this.field_5187) {
            fsh.sdhy_2().jqy();
        }
    }

    @Inject(method={"swapBuffers"}, at={@At(value="RETURN")})
    private void Moondlc$renderCleanGameLocalOverlay(class_10219 capturer, CallbackInfo ci) {
        btd_2.bat_2();
    }

    @Redirect(method={"setIcon(Lnet/minecraft/resource/ResourcePack;Lnet/minecraft/client/util/Icons;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/util/Icons;getIcons(Lnet/minecraft/resource/ResourcePack;)Ljava/util/List;"))
    public List<class_7367<InputStream>> setCustomIcon(class_8518 instance, class_3262 resourcePack) {
        InputStream icon16;
        if (Moondlc.getInstance().isPanic()) {
            try {
                return instance.method_51418(resourcePack);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if ((icon16 = Moondlc.class.getResourceAsStream("/assets/moondlc/textures/m0vy/25/25v7e7itzaeae.png")) == null) {
            try {
                return instance.method_51418(resourcePack);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return List.of(() -> Moondlc.class.getResourceAsStream("/assets/moondlc/textures/m0vy/25/25v7e7itzaeae.png"), () -> Moondlc.class.getResourceAsStream("/assets/moondlc/textures/m0vy/59/592haq4kphg2.png"));
    }
}

