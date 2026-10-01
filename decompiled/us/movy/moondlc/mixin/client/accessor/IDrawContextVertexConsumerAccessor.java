/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  net.minecraft.class_4597$class_4598
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.client.accessor;

import net.minecraft.class_332;
import net.minecraft.class_4597;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_332.class})
public interface IDrawContextVertexConsumerAccessor {
    @Accessor(value="vertexConsumers")
    public class_4597.class_4598 getVertexConsumers();
}

