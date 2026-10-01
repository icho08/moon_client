/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  net.minecraft.class_337
 *  net.minecraft.class_345
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.gui.overlay;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_332;
import net.minecraft.class_337;
import net.minecraft.class_345;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.bghn;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.sk;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_337.class})
public class BossBarHudMixin
implements tthy {
    @Shadow
    @Final
    Map<UUID, class_345> field_2060;
    @Unique
    private static final Pattern PVP_TIME_PATTERN;
    private static final String FILTERED_TEXT = "ë‘…ęˆŁęˆƒë‘„ęˆŁęˆ…";
    private final Map<UUID, String> lastProcessedNames = new HashMap<UUID, String>();

    @Inject(method={"render(Lnet/minecraft/client/gui/DrawContext;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderHead(class_332 context, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals != null && removals.dhkhk()) {
            ci.cancel();
            return;
        }
        int ctTimer = 0;
        for (class_345 bossBar : this.field_2060.values()) {
            String name;
            if (bossBar.method_5414() == null || !(name = bossBar.method_5414().getString().toLowerCase()).contains("Đ±ĐľĐą") && !name.contains("pvp")) continue;
            Matcher matcher = PVP_TIME_PATTERN.matcher(bossBar.method_5414().getString());
            if (!matcher.find()) break;
            ctTimer = Integer.parseInt(matcher.group(1));
            break;
        }
        bghn.dhaw(ctTimer > 0);
        bghn.dq_2(ctTimer);
    }
}

