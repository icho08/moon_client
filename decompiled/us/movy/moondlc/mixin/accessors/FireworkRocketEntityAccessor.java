/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1671
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_1671;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1671.class})
public interface FireworkRocketEntityAccessor {
    @Accessor(value="life")
    public int getLife();

    @Accessor(value="life")
    public void setLife(int var1);

    @Accessor(value="lifeTime")
    public int getLifeTime();

    @Accessor(value="lifeTime")
    public void setLifeTime(int var1);
}

