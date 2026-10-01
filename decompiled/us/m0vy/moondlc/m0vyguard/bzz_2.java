/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.util.List;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.movy.moondlc.Moondlc;

public class bzz_2
extends thw_3 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vifq0dn1;

    public bzz_2() {
        super(2.0f, 30.0f);
    }

    @Override
    public String getName() {
        return "ArrayList";
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f = this.khta_3().getX();
        float f2 = this.khta_3().getY();
        float f3 = this.khta_3().getWidth();
        boolean bl = f + f3 / 2.0f > (float)class_310.method_1551().method_22683().method_4486() / 2.0f;
        float f4 = this.ada_4(6.0f);
        float f5 = this.ada_4(2.5f);
        float f6 = this.ada_4(1.2f);
        float f7 = 1.5f;
        List<bsb> list = Moondlc.getInstance().getModuleManager().rdhs().stream().filter(bsb::rgha_2).sorted((arg_0, arg_1) -> this.hkhd(f4, arg_0, arg_1)).toList();
        float f8 = f2;
        float f9 = 0.0f;
        Color color = new Color(12, 12, 18, 240);
        for (bsb bsb2 : list) {
            String string = bsb2.getName();
            float f10 = this.thdz_2().shdf_2(string, f4);
            float f11 = f10 + f5 * 2.0f + f7;
            float f12 = f4 + f6 * 2.0f;
            float f13 = bl ? f + f3 - f11 : f;
            bjgh.jghs.hrj(class_45872, f13, f8, f11, f12, 0.0f, color);
            float f14 = bl ? f13 + f11 - f7 : f13;
            bjgh.zyn.sla(class_45872, f14, f8, f7, f12, 0.0f, bas_4.zsz_4(), bas_4.zsz_4(), bas_4.tkb_2(), bas_4.tkb_2());
            float f15 = bl ? f13 + f5 : f13 + f7 + f5;
            this.thdz_2().jdz(class_45872, string, f15, f8 + f6 + 0.5f, f4, bas_4.zsz_4(), bas_4.tkb_2(), f10);
            if (f11 > f9) {
                f9 = f11;
            }
            f8 += f12;
        }
        this.khta_3().setWidth(f9);
        this.khta_3().setHeight(list.isEmpty() ? this.ada_4(10.0f) : f8 - f2);
    }

    private int hkhd(float f, bsb bsb2, bsb bsb3) {
        float f2 = this.thdz_2().shdf_2(bsb2.getName(), f);
        float f3 = this.thdz_2().shdf_2(bsb3.getName(), f);
        return Float.compare(f3, f2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

