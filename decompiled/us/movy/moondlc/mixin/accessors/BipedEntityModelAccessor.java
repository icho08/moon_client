/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_572
 *  net.minecraft.class_630
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_572;
import net.minecraft.class_630;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_572.class})
public interface BipedEntityModelAccessor {
    @Accessor(value="head")
    public class_630 moondlc$getHead();

    @Accessor(value="hat")
    public class_630 moondlc$getHat();

    @Accessor(value="body")
    public class_630 moondlc$getBody();

    @Accessor(value="rightArm")
    public class_630 moondlc$getRightArm();

    @Accessor(value="leftArm")
    public class_630 moondlc$getLeftArm();

    @Accessor(value="rightLeg")
    public class_630 moondlc$getRightLeg();

    @Accessor(value="leftLeg")
    public class_630 moondlc$getLeftLeg();
}

