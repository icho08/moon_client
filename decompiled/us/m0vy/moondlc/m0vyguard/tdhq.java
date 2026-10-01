/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1308
 *  net.minecraft.class_1657
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import net.minecraft.class_1308;
import net.minecraft.class_1657;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.blq;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.ra_2;

public class tdhq
extends bqt {
    private static final float bbsh = 42.0f;
    private static final float bshh_2 = 5.0f;
    private static final float dhnz = 32.0f;
    private final ra_2 khshy = new ra_2("Show Mobs", List.of("Enabled", "Disabled"), "Disabled");
    private final tdj zsht = new tdj("Range", 20.0f, 80.0f, 5.0f, 47.0f, "%.0f m");
    private final tdj sdha = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int njcq8v1 = -1010562301;
    private static final int gkow4cx89zpw = -836555039;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jzep1rxywgo51;

    public tdhq() {
        super(200.0f, 200.0f);
        this.sdha.tyt_3(this::bhk_2);
        this.rght(this.khshy);
        this.rght(this.zsht);
        this.rght(this.sdha);
    }

    @Override
    public String getName() {
        return "Moondlc Radar";
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f;
        if (tdhq.mc.field_1724 == null || tdhq.mc.field_1687 == null) {
            return;
        }
        float f2 = this.awd_2();
        float f3 = this.bhh_3(true, f2);
        if (!this.tdha_2()) {
            return;
        }
        float f4 = this.zfj_2(this.khta_3().getX());
        float f5 = this.zfj_2(this.khta_3().getY());
        float f6 = ((Float)this.zsht.ghjf()).floatValue();
        class_45872.method_22903();
        float f7 = 0.92f + 0.08f * f3;
        class_45872.method_46416(f4 + 21.0f, f5 + 21.0f, 0.0f);
        class_45872.method_22905(f7, f7, 1.0f);
        class_45872.method_46416(-(f4 + 21.0f), -(f5 + 21.0f), 0.0f);
        tbkh.bsdh_2(class_45872, f4, f5, 42.0f, 42.0f, f3, 7.0f);
        tbkh.ja_2(class_45872, f4, f5, 42.0f, 42.0f, 7.0f, 0.18f, f3);
        float f8 = f4 + 5.0f;
        float f9 = f5 + 5.0f;
        float f10 = f8 + 16.0f;
        float f11 = f9 + 16.0f;
        Color color = bas_4.zsz_4();
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(58.0f * f3));
        bjgh.jghs.hrj(class_45872, f10 - 0.2f, f9 + 2.0f, 0.4f, 28.0f, 0.0f, color2);
        bjgh.jghs.hrj(class_45872, f8 + 2.0f, f11 - 0.2f, 28.0f, 0.4f, 0.0f, color2);
        bjgh.jghs.hrj(class_45872, f10 - 1.0f, f11 - 1.0f, 2.0f, 2.0f, 1.0f, bas_4.tdth_2(Math.round(210.0f * f3)));
        float f12 = tdhq.mc.field_1724.method_36454();
        for (class_1657 class_16572 : tdhq.mc.field_1687.method_18456()) {
            double d;
            double d2;
            double d3;
            if (class_16572 == tdhq.mc.field_1724 || (d3 = Math.sqrt((d2 = class_16572.method_23317() - tdhq.mc.field_1724.method_23317()) * d2 + (d = class_16572.method_23321() - tdhq.mc.field_1724.method_23321()) * d)) > (double)f6) continue;
            double d4 = Math.atan2(d, d2) - Math.toRadians(f12 + 180.0f);
            double d5 = d3 / (double)f6 * 12.0;
            float f13 = (float)((double)f10 + d5 * Math.cos(d4));
            f = (float)((double)f11 + d5 * Math.sin(d4));
            Color color3 = this.dshr(class_16572, f3);
            bjgh.jghs.hrj(class_45872, f13 - 1.0f, f - 1.0f, 2.0f, 2.0f, 1.0f, color3);
        }
        if (this.khshy.thnth("Enabled")) {
            for (class_1657 class_16572 : tdhq.mc.field_1687.method_18112()) {
                double d;
                double d6;
                double d7;
                class_1308 class_13082;
                if (!(class_16572 instanceof class_1308) || !(class_13082 = (class_1308)class_16572).method_5805() || (d7 = Math.sqrt((d6 = class_13082.method_23317() - tdhq.mc.field_1724.method_23317()) * d6 + (d = class_13082.method_23321() - tdhq.mc.field_1724.method_23321()) * d)) > (double)f6) continue;
                double d8 = Math.atan2(d, d6) - Math.toRadians(f12 + 180.0f);
                double d9 = d7 / (double)f6 * 12.0;
                f = (float)((double)f10 + d9 * Math.cos(d8));
                float f14 = (float)((double)f11 + d9 * Math.sin(d8));
                Color color4 = new Color(255, 170, 0, Math.round(200.0f * f3));
                bjgh.jghs.hrj(class_45872, f - 0.75f, f14 - 0.75f, 1.5f, 1.5f, 0.75f, color4);
            }
        }
        class_45872.method_22909();
        this.khta_3().setWidth(42.0f);
        this.khta_3().setHeight(42.0f);
    }

    private Color dshr(class_1657 class_16572, float f) {
        if (bjd.shfn() == class_16572) {
            return new Color(255, 82, 82, Math.round(255.0f * f));
        }
        if (blq.aah_2().aqj(class_16572.method_5477().getString())) {
            return new Color(94, 255, 69, Math.round(255.0f * f));
        }
        return new Color(255, 255, 255, Math.round(235.0f * f));
    }

    private void bhk_2(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] gwr4kwlv(String string) {
        return string.split("\u0006\u000e", -1);
    }

    private static CallSite k3zuldb2lgo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ njcq8v1 ^ string.hashCode()) + (n2 + gkow4cx89zpw) + i ^ njcq8v1, 10) + gkow4cx89zpw);
            }
            String[] stringArray = tdhq.gwr4kwlv(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

