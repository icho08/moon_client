/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_5223
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package us.movy.moondlc.mixin.minecraft.text;

import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import us.m0vy.moondlc.m0vyguard.bjkh;
import us.m0vy.moondlc.m0vyguard.bzr_2;
import us.m0vy.moondlc.m0vyguard.tjsh;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_5223.class})
public class TextVisitFactoryMixin {
    @ModifyArg(method={"visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z"}, index=0, at=@At(value="INVOKE", target="Lnet/minecraft/text/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z", ordinal=0))
    private static String patchName(String text) {
        String processed = text;
        tjsh nameProtectModule = (tjsh)Moondlc.getInstance().getModuleManager().dfr_2(tjsh.class);
        if (nameProtectModule != null && nameProtectModule.rgha_2()) {
            processed = nameProtectModule.thbw(processed);
        }
        if (bjkh.shzkh() != null && bjkh.shzkh().rgha_2() && tdhr.dhzn() != null) {
            processed = bzr_2.sdl_2(processed);
        }
        return processed;
    }
}

