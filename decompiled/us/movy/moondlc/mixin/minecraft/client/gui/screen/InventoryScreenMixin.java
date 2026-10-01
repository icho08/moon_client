/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10260
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1713
 *  net.minecraft.class_1723
 *  net.minecraft.class_1729
 *  net.minecraft.class_2561
 *  net.minecraft.class_4185
 *  net.minecraft.class_490
 *  net.minecraft.class_507
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.gui.screen;

import net.minecraft.class_10260;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import net.minecraft.class_1729;
import net.minecraft.class_2561;
import net.minecraft.class_4185;
import net.minecraft.class_490;
import net.minecraft.class_507;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bdkh;
import us.m0vy.moondlc.m0vyguard.bdt_4;
import us.m0vy.moondlc.m0vyguard.bwd_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tzd_2;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.ScreenAccessor;

@Mixin(value={class_490.class})
public abstract class InventoryScreenMixin
extends class_10260<class_1723>
implements tthy {
    public InventoryScreenMixin(class_1723 handler, class_507<?> recipeBook, class_1661 inventory, class_2561 title) {
        super((class_1729)handler, recipeBook, inventory, title);
    }

    @Inject(method={"init()V"}, at={@At(value="TAIL")})
    private void dropButton(CallbackInfo ci) {
        if (!Moondlc.INSTANCE.isPanic()) {
            class_4185 widget = class_4185.method_46430((class_2561)class_2561.method_30163((String)tr_2.ttq_3("inventory.button.drop_all")), b -> this.dropAll()).method_46434(this.field_2776 + this.field_2792 / 2 - 40, this.field_2800 - 20, 80, 18).method_46431();
            ((ScreenAccessor)((Object)this)).invokeAddDrawableChild(widget);
        }
    }

    @Unique
    private void dropAll() {
        bdt_4 slots = bdkh.dhmth().zthr_2(bdkh.dhyd()).zthr_2(bdkh.swn()).zthr_2(new bwd_2());
        for (tzd_2 slot : slots.djkh_2()) {
            if (slot.jlj()) continue;
            InventoryScreenMixin.mc.field_1761.method_2906(InventoryScreenMixin.mc.field_1724.field_7512.field_7763, slot.shd_5(), 1, class_1713.field_7795, (class_1657)InventoryScreenMixin.mc.field_1724);
        }
    }
}

