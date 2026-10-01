/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_640
 *  net.minecraft.class_8685
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.accessors;

import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;
import net.minecraft.class_640;
import net.minecraft.class_8685;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_640.class})
public interface PlayerListEntryAccessor {
    @Invoker(value="texturesSupplier")
    public static Supplier<class_8685> callTexturesSupplier(GameProfile profile) {
        throw new AssertionError();
    }
}

