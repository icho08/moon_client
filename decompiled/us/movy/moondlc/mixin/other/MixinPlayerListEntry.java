/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.class_310
 *  net.minecraft.class_640
 *  net.minecraft.class_746
 *  net.minecraft.class_8685
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package us.movy.moondlc.mixin.other;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import java.util.function.Supplier;
import net.minecraft.class_310;
import net.minecraft.class_640;
import net.minecraft.class_746;
import net.minecraft.class_8685;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import us.m0vy.moondlc.m0vyguard.sh_5;
import us.m0vy.moondlc.m0vyguard.aw;

@Mixin(value={class_640.class})
public class MixinPlayerListEntry {
    @ModifyReturnValue(method={"getSkinTextures"}, at={@At(value="RETURN")})
    private class_8685 skinTexturesHook(class_8685 original) {
        aw clientCape;
        Supplier customSkin = sh_5.ztz_3();
        class_746 player = class_310.method_1551().field_1724;
        boolean localPlayer = false;
        if (player != null) {
            localPlayer = player.method_7334().getId().equals(((class_640)this).method_2966().getId());
            if (customSkin != null && localPlayer) {
                original = (class_8685)customSkin.get();
            }
        }
        return (clientCape = aw.tqd_2()) == null ? original : clientCape.thhh(original, ((class_640)this).method_2966());
    }

    @ModifyExpressionValue(method={"texturesSupplier"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;uuidEquals(Ljava/util/UUID;)Z")})
    private static boolean texturesSupplierHook(boolean original) {
        aw clientCape = aw.tqd_2();
        return original || sh_5.ztz_3() != null || clientCape != null && clientCape.rgha_2();
    }
}

