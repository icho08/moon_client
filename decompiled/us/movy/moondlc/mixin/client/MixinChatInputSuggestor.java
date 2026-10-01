/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.suggestion.Suggestions
 *  net.minecraft.class_2172
 *  net.minecraft.class_342
 *  net.minecraft.class_4717
 *  net.minecraft.class_4717$class_464
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.client;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_2172;
import net.minecraft.class_342;
import net.minecraft.class_4717;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_4717.class})
public abstract class MixinChatInputSuggestor {
    @Final
    @Shadow
    class_342 field_21599;
    @Shadow
    boolean field_21614;
    @Shadow
    private ParseResults<class_2172> field_21610;
    @Shadow
    private CompletableFuture<Suggestions> field_21611;
    @Shadow
    private class_4717.class_464 field_21612;

    @Shadow
    public abstract void method_23920(boolean var1);

    @Inject(method={"refresh"}, at={@At(value="HEAD")}, cancellable=true)
    public void onRefresh(CallbackInfo callbackInfo) {
        String prefix;
        String text = this.field_21599.method_1882();
        if (text.startsWith(prefix = Moondlc.getInstance().getCommandManager().sam())) {
            int cursor = this.field_21599.method_1881();
            this.field_21611 = Moondlc.getInstance().getCommandManager().ghzl(text, cursor);
            this.field_21611.thenRun(() -> {
                if (this.field_21611.isDone()) {
                    this.method_23920(false);
                }
            });
            callbackInfo.cancel();
        }
    }
}

