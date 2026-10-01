/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_2371
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
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
import net.minecraft.class_2371;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.wh_2;

public class tths_2
extends thw_3 {
    private static final float tsb = 13.0f;
    private static final float ddq = 2.0f;
    private static final float dkhh_2 = 5.0f;
    private static final float shts_4 = 3.0f;
    private static final float khkk = 10.5f;
    private static final float khzs_2 = 5.2f;
    private static final float bah_4 = 3.0f;
    private static final int hth_4 = 4;
    private final List rbs_2 = new ArrayList();
    private static final int qodiqpibb6a = -558404513;
    private static final int wo9njau = 1046531239;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lt9x523jbjsnx;

    public tths_2() {
        super(30.0f, 100.0f);
    }

    @Override
    public String getName() {
        return "Armor";
    }

    @Override
    public void lh(wh_2 wh2) {
        float f;
        this.tat();
        boolean bl = tths_2.mc.field_1755 instanceof class_408;
        if (!this.rtz() && !bl) {
            return;
        }
        class_4587 class_45872 = wh2.matrixStack();
        class_332 class_3322 = wh2.context();
        float f2 = this.khta_3().getX();
        float f3 = this.khta_3().getY();
        float f4 = this.ada_4(3.0f);
        float f5 = this.ada_4(13.0f);
        float f6 = this.ada_4(2.0f);
        float f7 = this.ada_4(10.5f);
        float f8 = this.ada_4(5.2f);
        List list = this.skhdh_2(bl);
        if (list.isEmpty()) {
            return;
        }
        float f9 = this.dhth_8(list, f8);
        float f10 = this.ada_4(3.0f);
        float f11 = this.ada_4(5.0f);
        float f12 = f4 * 2.0f + f7 + f10 + f9;
        float f13 = f4 * 2.0f + (float)list.size() * f5 + ((float)list.size() - 1.0f) * f6;
        float f14 = Math.max(f7, f9) + this.ada_4(2.0f);
        float f15 = f4 * 2.0f + (float)list.size() * f14 + ((float)list.size() - 1.0f) * f11;
        boolean bl2 = this.dzth_2(f2, f3, f12, f13, f15, f = f4 * 2.0f + f7 + this.ada_4(1.0f) + f8);
        float f16 = bl2 ? f15 : f12;
        float f17 = bl2 ? f : f13;
        bjgh.jghs.hrj(class_45872, f2, f3, f16, f17, 3.0f, new Color(12, 12, 18, 240));
        if (bl2) {
            this.khhm(class_3322, class_45872, list, f2, f3, f4, f7, f8, f14, f11);
        } else {
            this.dqj_2(class_3322, class_45872, list, f2, f3, f4, f5, f6, f7, f8, f10);
        }
        this.tr_2(f16, f17);
    }

    private void dqj_2(class_332 class_3322, class_4587 class_45872, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f2 + f3;
        for (class_1799 class_17992 : list) {
            float f10 = f9 + f4 / 2.0f - f6 / 2.0f;
            this.thzs(class_3322, class_45872, class_17992, f + f3, f10, f6, f7);
            this.tht(class_45872, class_17992, f + f3 + f6 + f8, f9 + f4 / 2.0f - f7 / 2.0f, f7, false, 0.0f);
            f9 += f4 + f5;
        }
    }

    private void khhm(class_332 class_3322, class_4587 class_45872, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f + f3;
        float f9 = f2 + f3;
        float f10 = f9 + f4 + this.ada_4(1.0f);
        for (class_1799 class_17992 : list) {
            float f11 = f8 + f6 / 2.0f;
            this.thzs(class_3322, class_45872, class_17992, f11 - f4 / 2.0f, f9, f4, f5);
            this.tht(class_45872, class_17992, f11, f10, f5, true, f6);
            f8 += f6 + f7;
        }
    }

    private void thzs(class_332 class_3322, class_4587 class_45872, class_1799 class_17992, float f, float f2, float f3, float f4) {
        if (!class_17992.method_7960()) {
            this.dthd_3(class_3322, class_17992, f, f2, f3);
        } else {
            this.thdz_2().thsz_4(class_45872, "-", f + f3 / 2.0f, f2 + f3 / 2.0f - f4 / 2.0f, f4, bas_4.rykh(130));
        }
    }

    private void tht(class_4587 class_45872, class_1799 class_17992, float f, float f2, float f3, boolean bl, float f4) {
        Color color;
        String string = this.dtkh_2(class_17992);
        Color color2 = color = class_17992.method_7960() ? bas_4.rykh(150) : brb.tal(bas_4.thaj(), bas_4.jwa_2(), this.snj_2(class_17992));
        if (bl) {
            this.thdz_2().sjw_2(class_45872, string, f, f2, f3, color, 0.0f);
        } else {
            this.thdz_2().zskh_4(class_45872, string, f, f2, f3, color, 0.0f);
        }
    }

    private boolean dzth_2(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean bl;
        float f7;
        float f8 = mc.method_22683().method_4486();
        float f9 = mc.method_22683().method_4502();
        float f10 = f + this.khta_3().getWidth() / 2.0f;
        float f11 = f2 + this.khta_3().getHeight() / 2.0f;
        float f12 = Math.min(f11, f9 - f11);
        boolean bl2 = f12 <= (f7 = Math.min(f10, f8 - f10));
        float f13 = this.ada_4(2.0f);
        boolean bl3 = f >= f13 && f + f5 <= f8 - f13;
        boolean bl4 = bl = f2 >= f13 && f2 + f4 <= f9 - f13;
        if (bl2 && !bl3 && bl) {
            return false;
        }
        if (!bl2 && !bl && bl3) {
            return true;
        }
        return bl2;
    }

    private void dthd_3(class_332 class_3322, class_1799 class_17992, float f, float f2, float f3) {
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22905(f3 / 16.0f, f3 / 16.0f, 1.0f);
        class_3322.method_51427(class_17992, 0, 0);
        class_45872.method_22909();
    }

    private float snj_2(class_1799 class_17992) {
        if (!class_17992.method_7963() || class_17992.method_7936() <= 0) {
            return 1.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (float)(class_17992.method_7936() - class_17992.method_7919()) / (float)class_17992.method_7936()));
    }

    private String dtkh_2(class_1799 class_17992) {
        if (!class_17992.method_7963() || class_17992.method_7936() <= 0) {
            return "--/--";
        }
        return class_17992.method_7936() - class_17992.method_7919() + "/" + class_17992.method_7936();
    }

    private List skhdh_2(boolean bl) {
        ArrayList<class_1799> arrayList = new ArrayList<class_1799>();
        for (int i = 0; i < 4; ++i) {
            class_1799 class_17992;
            class_1799 class_17993 = class_17992 = i < this.rbs_2.size() ? (class_1799)this.rbs_2.get(i) : class_1799.field_8037;
            if (class_17992.method_7960() && !bl) continue;
            arrayList.add(class_17992);
        }
        return arrayList;
    }

    private float dhth_8(List list, float f) {
        float f2 = 0.0f;
        for (class_1799 class_17992 : list) {
            f2 = Math.max(f2, this.thdz_2().shdf_2(this.dtkh_2(class_17992), f));
        }
        return f2;
    }

    private void tr_2(float f, float f2) {
        this.khta_3().setWidth(f);
        this.khta_3().setHeight(f2);
    }

    private void tat() {
        this.rbs_2.clear();
        if (tths_2.mc.field_1724 == null) {
            return;
        }
        class_746 class_7462 = tths_2.mc.field_1724;
        class_2371 class_23712 = class_7462.method_31548().field_7548;
        for (int i = class_23712.size() - 1; i >= 0; --i) {
            class_1799 class_17992 = (class_1799)class_23712.get(i);
            this.rbs_2.add(class_17992);
        }
        while (this.rbs_2.size() < 4) {
            this.rbs_2.add(class_1799.field_8037);
        }
    }

    private boolean rtz() {
        for (class_1799 class_17992 : this.rbs_2) {
            if (class_17992.method_7960()) continue;
            return true;
        }
        return false;
    }

    @Override
    public void lh(class_4587 class_45872) {
    }

    private static String[] swngldf17u0cm(String string) {
        return string.split("\u0003\u0013", -1);
    }

    private static CallSite kim8dabag9lw7t(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ qodiqpibb6a ^ string.hashCode() ^ n2 + wo9njau ^ i * 1647810289 ^ qodiqpibb6a, 23) ^ wo9njau));
            }
            String[] stringArray = tths_2.swngldf17u0cm(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

