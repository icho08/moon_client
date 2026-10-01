/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.thy_3;
import us.movy.moondlc.Moondlc;

public class tsj
extends thy_3 {
    private final Map bqs = new HashMap();
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ic7od175k1;

    public tsj() {
        super(3.0f, 120.0f);
    }

    @Override
    public String getName() {
        return "Keybinds";
    }

    @Override
    protected Map dhhgh() {
        return null;
    }

    @Override
    public void lh(class_4587 class_45872) {
        Moondlc.getInstance().getModuleManager().rdhs().forEach(this::zls);
        this.bqs.entrySet().removeIf(tsj::tsth_2);
        float f = this.khta_3().getX();
        float f2 = this.khta_3().getY();
        float f3 = this.khta_3().getWidth();
        boolean bl = f + f3 / 2.0f > (float)class_310.method_1551().method_22683().method_4486() / 2.0f;
        float f4 = this.ada_4(11.0f);
        float f5 = this.ada_4(3.5f);
        float f6 = this.ada_4(6.0f);
        float f7 = this.ada_4(8.0f);
        Color color = new Color(12, 12, 18, 240);
        String string = "Keybinds";
        String string2 = "K";
        float f8 = this.thdz_2().shdf_2(string, f6);
        float f9 = brz_2.tsf.shdf_2(string2, f7);
        float f10 = f8 + f9 + f5 * 3.0f;
        for (Map.Entry entry : this.bqs.entrySet()) {
            if (((Float)entry.getValue()).floatValue() <= 0.05f) continue;
            String string3 = brz.adq(((bsb)entry.getKey()).zshsh_2());
            float f11 = this.thdz_2().shdf_2(((bsb)entry.getKey()).getName(), f6) + this.thdz_2().shdf_2(string3, f6) + f5 * 4.5f;
            if (!(f11 > f10)) continue;
            f10 = f11;
        }
        float f12 = bl ? f + f3 - f10 : f;
        float f13 = f2;
        bjgh.jghs.hrj(class_45872, f12, f13, f10, f4, 3.0f, color);
        this.thdz_2().zskh_4(class_45872, string, f12 + f5, f13 + f4 / 2.0f - f6 / 2.0f, f6, Color.WHITE, 0.0f);
        brz_2.tsf.jdz(class_45872, string2, f12 + f10 - f5 - f9, f13 + f4 / 2.0f - f7 / 2.0f, f7, bas_4.zsz_4(), bas_4.tkb_2(), 1.1f);
        f13 += f4 + 1.5f;
        for (bsb bsb2 : Moondlc.getInstance().getModuleManager().rdhs()) {
            float f14;
            if (!this.bqs.containsKey(bsb2) || (f14 = ((Float)this.bqs.get(bsb2)).floatValue()) <= 0.05f) continue;
            float f15 = f4 * f14;
            int n = (int)(255.0f * f14);
            Color color2 = new Color(0, 0, 0, 205);
            Color color3 = new Color(255, 255, 255, n);
            Color color4 = new Color(0, 0, 0, (int)(180.0f * f14));
            bjgh.thqf.tgha_2(class_45872, f12, f13, f10, f15, 3.0f, color2);
            float f16 = f13 + f15 / 2.0f - f6 / 2.0f;
            this.thdz_2().zskh_4(class_45872, bsb2.getName(), f12 + f5, f16, f6, color3, 0.0f);
            String string4 = brz.adq(bsb2.zshsh_2());
            float f17 = this.thdz_2().shdf_2(string4, f6);
            float f18 = f17 + this.ada_4(4.0f);
            float f19 = (f6 + this.ada_4(2.0f)) * f14;
            float f20 = f12 + f10 - f5 - f18;
            float f21 = f13 + f15 / 2.0f - f19 / 2.0f;
            if (f14 > 0.5f) {
                bjgh.jghs.hrj(class_45872, f20, f21, f18, f19, 2.0f, color4);
                this.thdz_2().zskh_4(class_45872, string4, f20 + f18 / 2.0f - f17 / 2.0f, f16, f6, color3, 0.0f);
            }
            f13 += f15 + 1.0f;
        }
        this.khta_3().setWidth(f10);
        this.khta_3().setHeight(f13 - f2);
    }

    private static boolean tsth_2(Map.Entry entry) {
        return ((Float)entry.getValue()).floatValue() < 0.05f && !((bsb)entry.getKey()).rgha_2();
    }

    private void zls(bsb bsb2) {
        boolean bl = bsb2.rgha_2() && bsb2.jmr();
        float f = this.bqs.getOrDefault(bsb2, Float.valueOf(0.0f)).floatValue();
        this.bqs.put(bsb2, Float.valueOf(f + ((bl ? 1.0f : 0.0f) - f) * 0.15f));
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

