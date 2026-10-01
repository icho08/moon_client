/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package us.movy.moondlc.mixin.compat.sodium;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import us.m0vy.moondlc.m0vyguard.tagh;

@Pseudo
@Mixin(targets={"net.caffeinemc.mods.sodium.client.render.chunk.DefaultChunkRenderer"}, remap=false)
public class SodiumDefaultChunkRendererMixin {
    private static final ThreadLocal<Object> capturedRegion;

    @Inject(method={"setModelMatrixUniforms"}, at={@At(value="HEAD")}, require=0, remap=false)
    private static void moondlc$captureRegion(CallbackInfo ci) {
    }

    @ModifyArgs(method={"setModelMatrixUniforms"}, at=@At(value="INVOKE", target="Lnet/caffeinemc/mods/sodium/client/render/chunk/shader/ChunkShaderInterface;setRegionOffset(FFF)V", remap=false), require=0)
    private static void moondlc$animateSodiumRegion(Args args) {
        try {
            float x = ((Float)args.get(0)).floatValue();
            float y = ((Float)args.get(1)).floatValue();
            float z = ((Float)args.get(2)).floatValue();
            int originX = Math.round(x) & 0xFFFFFFF0;
            int originY = Math.round(y) & 0xFFFFFFF0;
            int originZ = Math.round(z) & 0xFFFFFFF0;
            Float offset = tagh.tddh_3(originX, originY, originZ);
            if (offset != null) {
                args.set(1, (Object)Float.valueOf(y + offset.floatValue()));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

