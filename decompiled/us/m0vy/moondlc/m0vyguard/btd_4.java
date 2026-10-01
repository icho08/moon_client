/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.wh_2;
import us.movy.moondlc.mixin.client.accessor.IDrawContextAccessor;

public class btd_4
extends thw_3 {
    private static final float thny = 17.5f;
    private static final float rak_2 = 13.0f;
    private static final float zfb = 0.5f;
    private static final int htt_4 = 9;
    private static final int tzd = 36;
    private final List zzkh_2 = new ArrayList();
    private static final int bh9v4jc = 87721625;
    private static final int xfxsuswo = 610263447;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qrklb11t5y;

    public btd_4() {
        super(35.0f, 175.0f);
    }

    @Override
    public String getName() {
        return "Inventory";
    }

    @Override
    public void lh(wh_2 wh2) {
        this.rfd_2();
        if (!this.rssh()) {
            return;
        }
        class_332 class_3322 = wh2.context();
        class_4587 class_45872 = wh2.matrixStack();
        float f = this.khta_3().getX();
        float f2 = this.khta_3().getY();
        float f3 = 123.0f;
        float f4 = 60.0f;
        this.khta_3().setWidth(f3);
        this.khta_3().setHeight(f4);
        if (bza_4.aar()) {
            bjgh.thqf.tgha_2(class_45872, f, f2, f3, f4, 6.0f, bas_4.jtha());
            bjgh.hskh_2.dfth_2(class_45872, f, f2, f3, f4, 6.0f, bas_4.jtha());
        } else if (bza_4.dhhh()) {
            bjgh.jghs.hrj(class_45872, f, f2, f3, f4, 6.0f, new Color(10, 11, 14, 255));
        } else {
            bjgh.thqf.tgha_2(class_45872, f, f2, f3, f4, 6.0f, bas_4.jtha());
        }
        if (!bza_4.dhhh()) {
            bjgh.jghs.hrj(class_45872, f, f2, f3, f4, 6.0f, new Color(12, 14, 18, 170));
        }
        bjgh.zyn.sla(class_45872, f + 4.0f, f2 + 17.5f - 1.0f, f3 - 8.0f, 1.0f, 0.5f, bas_4.tdth_2(220), bas_4.dhfk(220), bas_4.tdth_2(220), bas_4.dhfk(220));
        float f5 = 7.5f;
        String string = this.getName();
        float f6 = this.dsgh_2().shdf_2(string, f5);
        this.dsgh_2().zskh_4(class_45872, string, f + f3 / 2.0f - f6 / 2.0f, f2 + 4.5f, f5, bas_4.ghss(), 0.0f);
        float f7 = 20.0f;
        float f8 = 4.0f;
        for (class_1799 class_17992 : this.zzkh_2) {
            float f9 = f + f8;
            float f10 = f2 + f7;
            bjgh.jghs.hrj(class_45872, f9, f10, 11.0f, 11.0f, 2.5f, new Color(20, 23, 29, 145));
            this.dna_2(class_3322, class_17992, f9 + 1.5f, f10 + 1.5f);
            if (!((f8 += 13.0f) > f3 - 13.0f)) continue;
            f7 += 13.0f;
            f8 = 4.0f;
        }
    }

    @Override
    public void lh(class_4587 class_45872) {
    }

    private void rfd_2() {
        this.zzkh_2.clear();
        if (btd_4.mc.field_1724 == null) {
            return;
        }
        for (int i = 9; i < 36; ++i) {
            this.zzkh_2.add(btd_4.mc.field_1724.method_31548().method_5438(i));
        }
    }

    private boolean rssh() {
        if (btd_4.mc.field_1724 == null) {
            return btd_4.mc.field_1755 instanceof class_408;
        }
        for (class_1799 class_17992 : this.zzkh_2) {
            if (class_17992.method_7960()) continue;
            return true;
        }
        return btd_4.mc.field_1755 instanceof class_408;
    }

    private void dna_2(class_332 class_3322, class_1799 class_17992, float f, float f2) {
        if (class_17992.method_7960()) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22905(0.5f, 0.5f, 1.0f);
        class_3322.method_51427(class_17992, 0, 0);
        ((IDrawContextAccessor)class_3322).callDrawItemBar(class_17992, 0, 0);
        ((IDrawContextAccessor)class_3322).callDrawCooldownProgress(class_17992, 0, 0);
        class_45872.method_22909();
    }

    private static String[] cmzrq66d(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xxa60glqyw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bh9v4jc ^ string.hashCode() ^ n2 + xfxsuswo + i * -1662578999) + bh9v4jc) ^ xfxsuswo));
            }
            String[] stringArray = btd_4.cmzrq66d(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

