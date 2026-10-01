/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import net.minecraft.class_1657;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.blq;
import us.m0vy.moondlc.m0vyguard.thw_3;

public class aj
extends thw_3 {
    private final float dhfn = 50.0f;
    private final float hwk = 47.0f;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int e57apf4p;

    @Override
    public String getName() {
        return "Radar";
    }

    public aj() {
        super(200.0f, 200.0f);
    }

    @Override
    public void lh(class_4587 class_45872) {
        if (aj.mc.field_1724 == null || aj.mc.field_1687 == null) {
            return;
        }
        float f = this.khta_3().getX();
        float f2 = this.khta_3().getY();
        float f3 = 50.0f;
        float f4 = 50.0f;
        float f5 = f + f3 / 2.0f;
        float f6 = f2 + f4 / 2.0f;
        bjgh.jghs.hrj(class_45872, f, f2, f3, f4, 5.0f, new Color(20, 20, 20, 200));
        bjgh.jghs.hrj(class_45872, f + f3 / 2.0f, f2 + 3.0f, 0.5f, f4 - 6.0f, 0.0f, new Color(bas_4.zsz_4().getRed(), bas_4.zsz_4().getGreen(), bas_4.zsz_4().getBlue(), 120));
        bjgh.jghs.hrj(class_45872, f + 3.0f, f2 + f4 / 2.0f, f3 - 6.0f, 0.5f, 0.0f, new Color(bas_4.zsz_4().getRed(), bas_4.zsz_4().getGreen(), bas_4.zsz_4().getBlue(), 120));
        for (class_1657 class_16572 : aj.mc.field_1687.method_18456()) {
            double d;
            double d2;
            double d3;
            if (class_16572 == aj.mc.field_1724 || (d3 = Math.sqrt((d2 = class_16572.method_23317() - aj.mc.field_1724.method_23317()) * d2 + (d = class_16572.method_23321() - aj.mc.field_1724.method_23321()) * d)) > 47.0) continue;
            double d4 = Math.atan2(d, d2) - Math.toRadians(aj.mc.field_1724.method_36454() + 180.0f);
            double d5 = d3 / 47.0 * 21.0;
            float f7 = (float)((double)f5 + d5 * Math.cos(d4));
            float f8 = (float)((double)f6 + d5 * Math.sin(d4));
            Color color = bjd.shfn() == class_16572 ? new Color(255, 82, 82) : (blq.aah_2().aqj(class_16572.method_5477().getString()) ? new Color(94, 255, 69) : Color.WHITE);
            bjgh.jghs.hrj(class_45872, f7 - 1.5f, f8 - 1.5f, 3.0f, 3.0f, 1.0f, new Color(25, 26, 33, 180));
            bjgh.jghs.hrj(class_45872, f7 - 1.0f, f8 - 1.0f, 2.0f, 2.0f, 0.0f, color);
        }
        this.khta_3().setWidth(f3);
        this.khta_3().setHeight(f4);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

