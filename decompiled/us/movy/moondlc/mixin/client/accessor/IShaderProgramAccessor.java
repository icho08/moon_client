/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_284
 *  net.minecraft.class_5944
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.client.accessor;

import java.util.Map;
import net.minecraft.class_284;
import net.minecraft.class_5944;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_5944.class})
public interface IShaderProgramAccessor {
    @Accessor(value="uniformsByName")
    public Map<String, class_284> getUniformsByName();
}

