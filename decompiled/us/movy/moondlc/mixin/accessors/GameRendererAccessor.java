/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4184
 *  net.minecraft.class_4599
 *  net.minecraft.class_757
 *  net.minecraft.class_765
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_4184;
import net.minecraft.class_4599;
import net.minecraft.class_757;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_757.class})
public interface GameRendererAccessor {
    @Accessor(value="buffers")
    public class_4599 buffers();

    @Accessor(value="lightmapTextureManager")
    public class_765 lightmapTextureManager();

    @Invoker(value="getFov")
    public float callGetFov(class_4184 var1, float var2, boolean var3);
}

