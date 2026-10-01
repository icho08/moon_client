/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1923
 *  net.minecraft.class_2487
 *  net.minecraft.class_2540
 *  net.minecraft.class_2818
 *  net.minecraft.class_2902$class_2903
 *  net.minecraft.class_631
 *  net.minecraft.class_6603$class_6605
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.world.chunk;

import java.util.function.Consumer;
import net.minecraft.class_1923;
import net.minecraft.class_2487;
import net.minecraft.class_2540;
import net.minecraft.class_2818;
import net.minecraft.class_2902;
import net.minecraft.class_631;
import net.minecraft.class_6603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.tagh;

@Mixin(value={class_631.class})
public class ClientChunkManagerMixin {
    @Inject(method={"loadChunkFromPacket(IILnet/minecraft/network/PacketByteBuf;Lnet/minecraft/nbt/NbtCompound;Ljava/util/function/Consumer;)Lnet/minecraft/world/chunk/WorldChunk;"}, at={@At(value="TAIL")})
    private void onChunkLoad(int x, int z, class_2540 buf, class_2487 nbt, Consumer<class_6603.class_6605> consumer, CallbackInfoReturnable<class_2818> cir) {
        class_1923 pos = new class_1923(x, z);
        class_2818 chunk = (class_2818)cir.getReturnValue();
        if (chunk != null) {
            float surfaceY = this.getSurfaceY(chunk);
            tagh.zdha(pos, surfaceY);
        }
    }

    private float getSurfaceY(class_2818 chunk) {
        int totalHeight = 0;
        int count = 0;
        for (int x = 0; x < 16; ++x) {
            for (int z = 0; z < 16; ++z) {
                int height = chunk.method_12032(class_2902.class_2903.field_13202).method_12603(x, z);
                totalHeight += height;
                ++count;
            }
        }
        return count > 0 ? (float)totalHeight / (float)count : 64.0f;
    }
}

