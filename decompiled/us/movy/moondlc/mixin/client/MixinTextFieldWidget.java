/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 *  net.minecraft.class_342
 *  net.minecraft.class_5250
 *  net.minecraft.class_5348
 *  net.minecraft.class_5481
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.client;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import net.minecraft.class_5481;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bjkh;
import us.m0vy.moondlc.m0vyguard.btn_2;
import us.m0vy.moondlc.m0vyguard.bzr_2;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_342.class})
public abstract class MixinTextFieldWidget {
    @Shadow
    private int field_2103;
    @Unique
    private final List<Long> moondlc$charAddedTimes = new ArrayList<Long>();

    @Shadow
    public abstract int method_1881();

    @ModifyVariable(method={"renderWidget"}, at=@At(value="STORE"), ordinal=0)
    private String modifyRenderedText(String original) {
        if (bjkh.shzkh() != null && bjkh.shzkh().rgha_2()) {
            return bzr_2.sdl_2(original);
        }
        return original;
    }

    @Inject(method={"write"}, at={@At(value="HEAD")})
    private void onWrite(String textToWrite, CallbackInfo ci) {
        if (textToWrite == null || textToWrite.isEmpty()) {
            return;
        }
        int targetCursor = Math.max(0, Math.min(this.method_1881(), this.moondlc$charAddedTimes.size()));
        long now = System.currentTimeMillis();
        for (int i = 0; i < textToWrite.length(); ++i) {
            this.moondlc$charAddedTimes.add(targetCursor + i, now);
        }
    }

    @Inject(method={"eraseCharacters"}, at={@At(value="HEAD")})
    private void onEraseCharacters(int characterOffset, CallbackInfo ci) {
        if (characterOffset == 0 || this.moondlc$charAddedTimes.isEmpty()) {
            return;
        }
        int currentCursor = this.method_1881();
        int from = characterOffset < 0 ? Math.max(0, currentCursor + characterOffset) : currentCursor;
        int to = characterOffset < 0 ? currentCursor : Math.min(this.moondlc$charAddedTimes.size(), currentCursor + characterOffset);
        for (int i = to - 1; i >= from && i < this.moondlc$charAddedTimes.size(); --i) {
            this.moondlc$charAddedTimes.remove(i);
        }
    }

    @Inject(method={"setText"}, at={@At(value="HEAD")})
    private void onSetText(String newText, CallbackInfo ci) {
        this.moondlc$charAddedTimes.clear();
        if (newText != null) {
            long now = System.currentTimeMillis();
            for (int i = 0; i < newText.length(); ++i) {
                this.moondlc$charAddedTimes.add(now);
            }
        }
    }

    @WrapOperation(method={"renderWidget"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/OrderedText;III)I")}, require=0)
    private int moondlc$animateTypingOrderedText(class_332 context, class_327 textRenderer, class_5481 orderedText, int x, int y, int color, Operation<Integer> original) {
        return this.moondlc$renderAnimatedOrderedText(context, textRenderer, orderedText, x, y, color, original);
    }

    @WrapOperation(method={"renderWidget"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)I")}, require=0)
    private int moondlc$animateTypingString(class_332 context, class_327 textRenderer, String renderedText, int x, int y, int color, Operation<Integer> original) {
        return this.moondlc$renderAnimatedString(context, textRenderer, renderedText, x, y, color, original);
    }

    @Unique
    private int moondlc$renderAnimatedOrderedText(class_332 context, class_327 textRenderer, class_5481 orderedText, int x, int y, int color, Operation<Integer> original) {
        record CharEntry(class_2583 style, int codePoint) {
        }
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        if (animation == null || !animation.rgha_2() || !animation.shsh_7() || orderedText == null) {
            return (Integer)original.call(new Object[]{context, textRenderer, orderedText, x, y, color});
        }
        ArrayList charList = new ArrayList();
        orderedText.accept((index, style, codePoint) -> {
            charList.add(new CharEntry(style, codePoint));
            return true;
        });
        if (charList.isEmpty()) {
            return (Integer)original.call(new Object[]{context, textRenderer, orderedText, x, y, color});
        }
        long now = System.currentTimeMillis();
        int currentX = x;
        int startIndex = this.field_2103;
        for (int i = 0; i < charList.size(); ++i) {
            CharEntry entry = (CharEntry)charList.get(i);
            String charStr = new String(Character.toChars(entry.codePoint()));
            class_5250 charText = class_2561.method_43470((String)charStr).method_10862(entry.style());
            int charWidth = textRenderer.method_27525((class_5348)charText);
            int globalIndex = startIndex + i;
            long addedTime = globalIndex >= 0 && globalIndex < this.moondlc$charAddedTimes.size() ? this.moondlc$charAddedTimes.get(globalIndex) : 0L;
            long elapsed = now - addedTime;
            if (elapsed >= 0L && elapsed < 220L) {
                float t = Math.min(1.0f, (float)elapsed / 220.0f);
                float scale = jkh.hd_2.ease(t, 0.0f, 1.0f, 1.0f);
                float offsetY = (1.0f - Math.min(1.0f, t)) * 3.5f;
                int alpha = (int)(255.0f * Math.min(1.0f, t * 1.8f));
                context.method_51448().method_22903();
                context.method_51448().method_46416((float)currentX + (float)charWidth / 2.0f, (float)y + 4.0f + offsetY, 0.0f);
                context.method_51448().method_22905(scale, scale, 1.0f);
                context.method_51448().method_46416(-((float)currentX + (float)charWidth / 2.0f), -((float)y + 4.0f), 0.0f);
                context.method_51439(textRenderer, (class_2561)charText, currentX, y, color & 0xFFFFFF | alpha << 24, true);
                context.method_51448().method_22909();
            } else {
                context.method_51439(textRenderer, (class_2561)charText, currentX, y, color, true);
            }
            currentX += charWidth;
        }
        return currentX;
    }

    @Unique
    private int moondlc$renderAnimatedString(class_332 context, class_327 textRenderer, String renderedText, int x, int y, int color, Operation<Integer> original) {
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        if (animation == null || !animation.rgha_2() || !animation.shsh_7() || renderedText == null || renderedText.isEmpty()) {
            return (Integer)original.call(new Object[]{context, textRenderer, renderedText, x, y, color});
        }
        long now = System.currentTimeMillis();
        int currentX = x;
        int startIndex = this.field_2103;
        for (int i = 0; i < renderedText.length(); ++i) {
            char c = renderedText.charAt(i);
            String charStr = String.valueOf(c);
            int charWidth = textRenderer.method_1727(charStr);
            int globalIndex = startIndex + i;
            long addedTime = globalIndex >= 0 && globalIndex < this.moondlc$charAddedTimes.size() ? this.moondlc$charAddedTimes.get(globalIndex) : 0L;
            long elapsed = now - addedTime;
            if (elapsed >= 0L && elapsed < 220L) {
                float t = Math.min(1.0f, (float)elapsed / 220.0f);
                float scale = jkh.hd_2.ease(t, 0.0f, 1.0f, 1.0f);
                float offsetY = (1.0f - Math.min(1.0f, t)) * 3.5f;
                int alpha = (int)(255.0f * Math.min(1.0f, t * 1.8f));
                context.method_51448().method_22903();
                context.method_51448().method_46416((float)currentX + (float)charWidth / 2.0f, (float)y + 4.0f + offsetY, 0.0f);
                context.method_51448().method_22905(scale, scale, 1.0f);
                context.method_51448().method_46416(-((float)currentX + (float)charWidth / 2.0f), -((float)y + 4.0f), 0.0f);
                context.method_25303(textRenderer, charStr, currentX, y, color & 0xFFFFFF | alpha << 24);
                context.method_51448().method_22909();
            } else {
                context.method_25303(textRenderer, charStr, currentX, y, color);
            }
            currentX += charWidth;
        }
        return currentX;
    }
}

