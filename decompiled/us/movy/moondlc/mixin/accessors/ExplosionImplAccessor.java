/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_9892
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.accessors;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_9892;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_9892.class})
public interface ExplosionImplAccessor {
    @Invoker(value="getBlocksToDestroy")
    public List<class_2338> invokeGetBlocksToDestroy();
}

