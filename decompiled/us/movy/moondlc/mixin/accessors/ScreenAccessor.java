/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_364
 *  net.minecraft.class_4068
 *  net.minecraft.class_437
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.accessors;

import java.util.List;
import net.minecraft.class_364;
import net.minecraft.class_4068;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_437.class})
public interface ScreenAccessor {
    @Accessor(value="children")
    public List<class_364> getChildren();

    @Invoker(value="addDrawableChild")
    public <T extends class_364 & class_4068> T invokeAddDrawableChild(T var1);
}

