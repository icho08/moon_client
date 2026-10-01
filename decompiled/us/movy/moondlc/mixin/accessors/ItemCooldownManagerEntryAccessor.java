/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets={"net.minecraft.entity.player.ItemCooldownManager$Entry"})
public interface ItemCooldownManagerEntryAccessor {
    @Accessor(value="startTick")
    public int getStartTick();

    @Accessor(value="endTick")
    public int getEndTick();
}

