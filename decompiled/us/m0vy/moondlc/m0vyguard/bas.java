/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10055
 *  net.minecraft.class_1297
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3883
 *  net.minecraft.class_3887
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_591
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_10055;
import net.minecraft.class_1297;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3883;
import net.minecraft.class_3887;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_591;
import us.m0vy.moondlc.m0vyguard.bkhs;
import us.m0vy.moondlc.m0vyguard.kht;
import us.movy.moondlc.Moondlc;

public class bas
extends class_3887 {
    private final kht khhz_3 = new kht();
    private static final class_2960 dhar_2;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int hg1ovcgm3kztvi;

    public bas(class_3883 class_38832) {
        super(class_38832);
    }

    public void render(class_4587 class_45872, class_4597 class_45972, int n, class_10055 class_100552, float f, float f2) {
        bkhs bkhs2 = bkhs.thyn();
        if (bkhs2 == null || !bkhs2.rgha_2()) {
            return;
        }
        if (!bkhs2.zjm.skhth(bkhs2.khskh)) {
            return;
        }
        if (!this.shouldRenderHat(bkhs2, class_100552)) {
            return;
        }
        class_45872.method_22903();
        class_591 class_5912 = (class_591)this.method_17165();
        class_5912.field_3398.method_22703(class_45872);
        float f3 = bkhs2.zdha.thw_5();
        class_45872.method_22905(f3, -f3, f3);
        this.khhz_3.ark(class_45872, class_45972, n, dhar_2);
        class_45872.method_22909();
    }

    private boolean shouldRenderHat(bkhs bkhs2, class_10055 class_100552) {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return false;
        }
        if (class_100552.field_53528 == class_3102.field_1724.method_5628()) {
            return bkhs2.zdhn.shzl() && !class_3102.field_1690.method_31044().method_31034();
        }
        class_1297 class_12972 = class_3102.field_1687.method_8469(class_100552.field_53528);
        if (class_12972 == null) {
            return false;
        }
        boolean bl = Moondlc.getInstance().getFriendManager().adhj(class_12972.method_5477().getString());
        return bl ? bkhs2.jhf.shzl() : bkhs2.tsa_3.shzl();
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

