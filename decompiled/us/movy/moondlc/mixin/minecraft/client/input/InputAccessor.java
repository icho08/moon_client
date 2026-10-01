/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10185
 *  net.minecraft.class_744
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.minecraft.client.input;

import net.minecraft.class_10185;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_744.class})
public interface InputAccessor {
    @Accessor(value="movementForward")
    public float getMovementForward();

    @Accessor(value="movementForward")
    public void setMovementForward(float var1);

    @Accessor(value="movementSideways")
    public float getMovementSideways();

    @Accessor(value="movementSideways")
    public void setMovementSideways(float var1);

    @Accessor(value="playerInput")
    public class_10185 getInput();

    @Accessor(value="playerInput")
    public void setInput(class_10185 var1);
}

