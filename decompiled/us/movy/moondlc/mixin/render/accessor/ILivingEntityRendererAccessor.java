/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10042
 *  net.minecraft.class_3887
 *  net.minecraft.class_4587
 *  net.minecraft.class_583
 *  net.minecraft.class_922
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.render.accessor;

import net.minecraft.class_10042;
import net.minecraft.class_3887;
import net.minecraft.class_4587;
import net.minecraft.class_583;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_922.class})
public interface ILivingEntityRendererAccessor<S extends class_10042, M extends class_583<? super S>> {
    @Invoker(value="addFeature")
    public boolean callAddFeature(class_3887<S, M> var1);

    @Invoker(value="setupTransforms")
    public void callSetupTransforms(class_10042 var1, class_4587 var2, float var3, float var4);

    @Invoker(value="scale")
    public void callScale(class_10042 var1, class_4587 var2);
}

