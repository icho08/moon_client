/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1835
 *  net.minecraft.class_1890
 *  net.minecraft.class_1937
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.item;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1835;
import net.minecraft.class_1890;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.bthd_2;
import us.m0vy.moondlc.m0vyguard.ghk;
import us.m0vy.moondlc.m0vyguard.nb;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_1835.class})
public abstract class TridentItemMixin {
    @Inject(method={"onStoppedUsing"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$onStoppedUsing(class_1799 stack, class_1937 world, class_1309 user, int remainingUseTicks, CallbackInfoReturnable<Boolean> cir) {
        class_310 client = class_310.method_1551();
        if (user == client.field_1724 && class_1890.method_60123((class_1799)stack, (class_1309)user) > 0.0f) {
            nb event = new nb();
            Moondlc.getInstance().getEventManager().azj_2(event);
            if (event.tsm_3()) {
                cir.setReturnValue((Object)true);
                return;
            }
            if (bthd_2.sz_2().jqy()) {
                cir.setReturnValue((Object)true);
            }
        }
    }

    @Inject(method={"use"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$use(class_1937 world, class_1657 user, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
        class_1799 itemStack = user.method_5998(hand);
        ghk tridentBoost = (ghk)Moondlc.getInstance().getModuleManager().dfr_2(ghk.class);
        if (tridentBoost != null && class_1890.method_60123((class_1799)itemStack, (class_1309)user) > 0.0f && !user.method_5721() && tridentBoost.rgha_2() && tridentBoost.slsh()) {
            user.method_6019(hand);
            cir.setReturnValue((Object)class_1269.field_21466);
        }
    }
}

