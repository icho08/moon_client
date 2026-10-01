/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1293
 *  net.minecraft.class_2477
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_5321
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1293;
import net.minecraft.class_2477;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_5321;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bkd_2;
import us.m0vy.moondlc.m0vyguard.thy_3;

public class blw
extends thy_3 {
    private final Map shtsh_2 = new HashMap();
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int czqxkwd4m6;

    public blw() {
        super(3.0f, 120.0f);
    }

    @Override
    public String getName() {
        return "Potions";
    }

    @Override
    protected Map dhhgh() {
        return null;
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f;
        Object object2;
        if (blw.mc.field_1724 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(blw.mc.field_1724.method_6088().values());
        arrayList.forEach(this::dzkh_3);
        this.shtsh_2.entrySet().removeIf(blw::shas_3);
        float f2 = this.ada_4(11.0f);
        float f3 = this.ada_4(3.5f);
        float f4 = this.ada_4(6.0f);
        float f5 = this.ada_4(8.0f);
        float f6 = this.ada_4(7.0f);
        float f7 = this.thdz_2().shdf_2(">", f4);
        HashMap<String, Float> hashMap = new HashMap<String, Float>();
        float f8 = 0.0f;
        for (Object object2 : arrayList) {
            String string = class_2477.method_10517().method_48307(object2.method_5586()) + (String)(object2.method_5578() > 0 ? " " + (object2.method_5578() + 1) : "");
            String string2 = bkd_2.dhy_5(object2.method_5584());
            f = f3 + f6 + f3 * 0.7f + f7 + f3 * 0.7f + this.thdz_2().shdf_2(string, f4) + f3 * 3.0f + this.thdz_2().shdf_2(string2, f4) + f3;
            hashMap.put(object2.method_5586(), Float.valueOf(f));
            if (!(f > f8)) continue;
            f8 = f;
        }
        String string = "Potions";
        object2 = "P";
        float f9 = this.thdz_2().shdf_2(string, f4);
        float f10 = brz_2.tsf.shdf_2((String)object2, f5);
        f = f9 + f10 + f3 * 4.0f;
        float f11 = Math.max(f, f8);
        arrayList.sort((arg_0, arg_1) -> blw.hqn(hashMap, arg_0, arg_1));
        float f12 = this.khta_3().getX();
        float f13 = this.khta_3().getY();
        float f14 = this.khta_3().getWidth();
        boolean bl = f12 + f14 / 2.0f > (float)class_310.method_1551().method_22683().method_4486() / 2.0f;
        Color color = new Color(12, 12, 18, 240);
        Color color2 = new Color(160, 160, 160, 180);
        float f15 = bl ? f12 + f14 - f11 : f12;
        bjgh.jghs.hrj(class_45872, f15, f13, f11, f2, 3.0f, color);
        this.thdz_2().zskh_4(class_45872, string, f15 + f3, f13 + f2 / 2.0f - f4 / 2.0f, f4, Color.WHITE, 0.0f);
        brz_2.tsf.jdz(class_45872, (String)object2, f15 + f11 - f3 - f10, f13 + f2 / 2.0f - f5 / 2.0f, f5, bas_4.zsz_4(), bas_4.tkb_2(), 1.1f);
        float f16 = f13 + f2 + 1.5f;
        for (class_1293 class_12932 : arrayList) {
            String string3 = class_12932.method_5586();
            float f17 = this.shtsh_2.getOrDefault(string3, Float.valueOf(0.0f)).floatValue();
            if (f17 <= 0.05f) continue;
            float f18 = hashMap.getOrDefault(string3, Float.valueOf(f)).floatValue();
            float f19 = bl ? f12 + f14 - f18 : f12;
            float f20 = f2 * f17;
            int n = (int)(255.0f * f17);
            String string4 = ((class_5321)class_12932.method_5579().method_40230().get()).method_29177().method_12832();
            Color color3 = new Color(0, 0, 0, (int)(205.0f * f17));
            Color color4 = new Color(255, 255, 255, n);
            Color color5 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), n);
            Color color6 = new Color(0, 0, 0, (int)(180.0f * f17));
            bjgh.thqf.tgha_2(class_45872, f19, f16, f18, f20, 3.0f, color3);
            float f21 = f16 + f20 / 2.0f - f4 / 2.0f;
            class_2960 class_29602 = class_2960.method_60655((String)"minecraft", (String)("textures/mob_effect/" + string4 + ".png"));
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f17);
            bjgh.shsf_2.da_4(class_45872, f19 + f3, f16 + f20 / 2.0f - f6 / 2.0f, f6, f6, 0.0f, new Color(255, 255, 255, n), 0.0f, 0.0f, 1.0f, 1.0f, mc.method_1531().method_4619(class_29602).method_4624());
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.thdz_2().thdsh_2(class_45872, ">", f19 + f3 + f6 + f3 * 0.5f, f21, f4, color5);
            String string5 = class_2477.method_10517().method_48307(string3) + (String)(class_12932.method_5578() > 0 ? " " + (class_12932.method_5578() + 1) : "");
            this.thdz_2().zskh_4(class_45872, string5, f19 + f3 + f6 + f3 + f7, f21, f4, color4, 0.0f);
            String string6 = bkd_2.dhy_5(class_12932.method_5584());
            float f22 = this.thdz_2().shdf_2(string6, f4);
            float f23 = f22 + this.ada_4(4.0f);
            float f24 = (f4 + this.ada_4(2.0f)) * f17;
            float f25 = f19 + f18 - f3 - f23;
            float f26 = f16 + f20 / 2.0f - f24 / 2.0f;
            if (f17 > 0.5f) {
                bjgh.jghs.hrj(class_45872, f25, f26, f23, f24, 2.0f, color6);
                this.thdz_2().zskh_4(class_45872, string6, f25 + f23 / 2.0f - f22 / 2.0f, f21, f4, color4, 0.0f);
            }
            f16 += f20 + 1.5f;
        }
        this.khta_3().setWidth(f11);
        this.khta_3().setHeight(f16 - f13);
    }

    private static int hqn(Map map, class_1293 class_12932, class_1293 class_12933) {
        return Float.compare(map.getOrDefault(class_12933.method_5586(), Float.valueOf(0.0f)).floatValue(), map.getOrDefault(class_12932.method_5586(), Float.valueOf(0.0f)).floatValue());
    }

    private static boolean shas_3(Map.Entry entry) {
        return blw.mc.field_1724.method_6088().values().stream().noneMatch(arg_0 -> blw.ayq(entry, arg_0)) && ((Float)entry.getValue()).floatValue() < 0.05f;
    }

    private static boolean ayq(Map.Entry entry, class_1293 class_12932) {
        return class_12932.method_5586().equals(entry.getKey());
    }

    private void dzkh_3(class_1293 class_12932) {
        String string = class_12932.method_5586();
        this.shtsh_2.put(string, Float.valueOf(this.shtsh_2.getOrDefault(string, Float.valueOf(0.0f)).floatValue() + (1.0f - this.shtsh_2.getOrDefault(string, Float.valueOf(0.0f)).floatValue()) * 0.15f));
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

