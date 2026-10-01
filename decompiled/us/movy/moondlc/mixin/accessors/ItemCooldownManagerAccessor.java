/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1796
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import java.util.Map;
import net.minecraft.class_1796;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1796.class})
public interface ItemCooldownManagerAccessor {
    @Accessor(value="entries")
    public Map<?, ?> getEntries();

    @Accessor(value="tick")
    public int getTick();
}

