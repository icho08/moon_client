/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  org.objectweb.asm.tree.ClassNode
 *  org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
 *  org.spongepowered.asm.mixin.extensibility.IMixinInfo
 */
package us.movy.moondlc.mixin;

import java.util.List;
import java.util.Set;
import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public final class MoondlcMixinPlugin
implements IMixinConfigPlugin {
    private static final String VANILLA_CHUNK_ANIMATOR = "us.movy.moondlc.mixin.minecraft.client.render.WorldRendererChunkAnimatorMixin";
    private static final String SODIUM_CHUNK_ANIMATOR = "us.movy.moondlc.mixin.compat.sodium.SodiumDefaultChunkRendererMixin";

    public void onLoad(String mixinPackage) {
    }

    public String getRefMapperConfig() {
        return null;
    }

    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        boolean sodiumLoaded = FabricLoader.getInstance().isModLoaded("sodium");
        if (VANILLA_CHUNK_ANIMATOR.equals(mixinClassName)) {
            return !sodiumLoaded;
        }
        if (SODIUM_CHUNK_ANIMATOR.equals(mixinClassName)) {
            return sodiumLoaded;
        }
        return true;
    }

    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
    }

    public List<String> getMixins() {
        return null;
    }

    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }

    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }
}

