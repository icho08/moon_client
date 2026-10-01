/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bkhh;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.thw_3;

public abstract class qm
extends thw_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int sf48afpnk;

    public qm(float f, float f2) {
        super(f, f2);
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f = this.khta_3().getX();
        float f2 = this.khta_3().getY();
        String string = " " + this.thkf();
        float f3 = this.ada_4(7.5f);
        float f4 = this.dsgh_2().shdf_2(this.getName(), f3);
        float f5 = this.dsgh_2().shdf_2(string, f3);
        float f6 = f4 + f5 + this.thshth() * 2.0f;
        float f7 = f3 + this.thshth() * 2.0f;
        float f8 = f7 * 0.3f;
        float f9 = f + this.thshth();
        float f10 = f2 + this.thshth();
        Color color = new Color(12, 12, 18, 240);
        bjgh.jghs.hrj(class_45872, f, f2, f6, f7, 3.0f, color);
        this.dsgh_2().jdz(class_45872, this.getName(), f9, f10, f3, bas_4.zsz_4(), bas_4.tkb_2(), f4 / 4.0f);
        this.dsgh_2().thdsh_2(class_45872, string, f9 + f4, f10, f3, bas_4.ghss());
        this.khta_3().setWidth(f6);
        this.khta_3().setHeight(f7);
    }

    public abstract String thkf();

    public abstract bkhh agh();

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

