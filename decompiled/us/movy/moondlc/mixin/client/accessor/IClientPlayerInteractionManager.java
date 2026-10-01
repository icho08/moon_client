/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_636
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.client.accessor;

import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_636.class})
public interface IClientPlayerInteractionManager {
    @Invoker(value="syncSelectedSlot")
    public void invokeSyncSelectedSlot();

    @Accessor(value="lastSelectedSlot")
    public int getLastSelectedSlot();

    @Accessor(value="lastSelectedSlot")
    public void setLastSelectedSlot(int var1);
}

