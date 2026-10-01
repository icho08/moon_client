/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_4011
 *  net.minecraft.class_425
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_310;
import net.minecraft.class_4011;
import net.minecraft.class_425;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_425.class})
public interface SplashOverlayAccessor {
    @Accessor(value="reload")
    public class_4011 getReload();

    @Accessor(value="client")
    public class_310 getClient();

    @Accessor(value="reloadCompleteTime")
    public long getReloadCompleteTime();

    @Accessor(value="reloadCompleteTime")
    public void setReloadCompleteTime(long var1);
}

