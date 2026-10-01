/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10017
 *  net.minecraft.class_1297
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package us.movy.moondlc.mixin.minecraft.render.entity;

import net.minecraft.class_10017;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import us.movy.moondlc.utility.mixins.EntityRenderStateAddition;

@Mixin(value={class_10017.class})
public abstract class EntityRenderStateMixin
implements EntityRenderStateAddition {
    @Unique
    private class_1297 moondlc$entity;

    @Override
    @Unique
    public void moondlc$setEntity(class_1297 entity) {
        this.moondlc$entity = entity;
    }

    @Override
    @Unique
    public class_1297 moondlc$getEntity() {
        return this.moondlc$entity;
    }
}

