/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1761
 *  net.minecraft.class_481
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_1761;
import net.minecraft.class_481;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_481.class})
public interface CreativeInventoryScreenAccessor {
    @Accessor(value="selectedTab")
    public static class_1761 getSelectedTab() {
        throw new AssertionError();
    }
}

