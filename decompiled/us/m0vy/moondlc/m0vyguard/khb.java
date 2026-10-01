/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1799
 *  net.minecraft.class_2371
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
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
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.wh_2;

public class khb
extends bqt {
    private static final float sdhq = 4.0f;
    private static final float zys = 4.0f;
    private static final float dhkd_2 = 16.0f;
    private static final float ral = 4.0f;
    private static final float hll = 13.0f;
    private final List bhs_4 = new ArrayList();
    private final ra_2 khwd = new ra_2("Orientation", List.of("Horizontal", "Vertical"), "Horizontal");
    private final ra_2 tk_2 = new ra_2("Durability", List.of("Percent", "Bar", "None"), "Percent");
    private final ra_2 ddgh_2 = new ra_2("Show Offhand", List.of("Enabled", "Disabled"), "Disabled");
    private final tdj skm = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int idz3at0 = -488045991;
    private static final int kivscwoai2f7h = 1360326689;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int aas4bswbm;

    public khb() {
        super(260.0f, 210.0f);
        this.skm.tyt_3(this::zghb);
        this.rght(this.khwd);
        this.rght(this.tk_2);
        this.rght(this.ddgh_2);
        this.rght(this.skm);
    }

    @Override
    public String getName() {
        return "Moondlc Armor";
    }

    @Override
    public void lh(wh_2 wh2) {
        this.athf(wh2.matrixStack(), () -> this.tsth_2(wh2));
    }

    @Override
    public void lh(class_4587 class_45872) {
    }

    private void jssh_2(wh_2 wh2) {
        if (khb.mc.field_1724 == null) {
            return;
        }
        float f = this.awd_2();
        boolean bl = khb.mc.field_1755 instanceof class_408;
        List list = this.shfy(bl);
        boolean bl2 = !list.isEmpty();
        float f2 = this.bhh_3(bl2, f);
        if (bl2) {
            this.tdhd(list, this.bhs_4);
        } else if (!this.tdha_2()) {
            this.bhs_4.clear();
            return;
        }
        List list2 = bl2 ? list : this.bhs_4;
        int n = Math.max(1, list2.size());
        class_4587 class_45872 = wh2.matrixStack();
        class_332 class_3322 = wh2.context();
        float f3 = this.zfj_2(this.khta_3().getX());
        float f4 = this.zfj_2(this.khta_3().getY());
        boolean bl3 = this.khwd.thnth("Vertical");
        float f5 = bl3 ? 24.0f : 8.0f + (float)n * 16.0f + ((float)n - 1.0f) * 4.0f;
        float f6 = bl3 ? 8.0f + (float)n * 16.0f + ((float)n - 1.0f) * 4.0f : 24.0f;
        class_45872.method_22903();
        float f7 = 0.88f + 0.12f * f2;
        class_45872.method_46416(f3 + f5 / 2.0f, f4 + f6 / 2.0f, 0.0f);
        class_45872.method_22905(f7, f7, 1.0f);
        class_45872.method_46416(-(f3 + f5 / 2.0f), -(f4 + f6 / 2.0f), 0.0f);
        tbkh.bsdh_2(class_45872, f3, f4, f5, f6, f2, 7.0f);
        tbkh.ja_2(class_45872, f3, f4, f5, f6, 7.0f, 0.3f, f2);
        for (int i = 0; i < n; ++i) {
            float f8;
            float f9;
            class_1799 class_17992 = i < list2.size() ? (class_1799)list2.get(i) : class_1799.field_8037;
            float f10 = bl3 ? f3 + 4.0f : f3 + 4.0f + (float)i * 20.0f;
            float f11 = bl3 ? f4 + 4.0f + (float)i * 20.0f : f4 + 4.0f;
            float f12 = f10 + 8.0f;
            float f13 = f11 + 8.0f - 0.55f;
            this.hshz(class_45872, f10, f11, f2);
            this.rtht_2(class_3322, class_17992, f12 - 6.5f, f13 - 6.5f, 13.0f, f2);
            if (class_17992.method_7960() || !class_17992.method_7963() || class_17992.method_7936() <= 0) continue;
            float f14 = this.jza_2(class_17992);
            if (this.tk_2.thnth("Percent")) {
                int n2 = Math.round(f14 * 100.0f);
                String string = n2 + "%";
                f9 = 5.0f;
                f8 = f13 - f9 / 2.0f;
                brz_2.btd_2.thsz_4(class_45872, string, f12 + 0.5f, f8 + 0.5f, f9, new Color(0, 0, 0, Math.round(200.0f * f2)));
                brz_2.btd_2.thsz_4(class_45872, string, f12, f8, f9, tbkh.hkdh(f2));
                continue;
            }
            if (!this.tk_2.thnth("Bar")) continue;
            float f15 = 14.0f;
            float f16 = 1.5f;
            f9 = f10 + 1.0f;
            f8 = f11 + 16.0f - 2.5f;
            bjgh.jghs.hrj(class_45872, f9, f8, f15, f16, 0.5f, new Color(15, 15, 15, Math.round(180.0f * f2)));
            int n3 = class_3532.method_15369((float)(f14 / 3.0f), (float)1.0f, (float)1.0f);
            bjgh.jghs.hrj(class_45872, f9, f8, f15 * f14, f16, 0.5f, new Color(n3 >> 16 & 0xFF, n3 >> 8 & 0xFF, n3 & 0xFF, Math.round(255.0f * f2)));
        }
        class_45872.method_22909();
        this.khta_3().setWidth(f5);
        this.khta_3().setHeight(f6);
    }

    private List shfy(boolean bl) {
        int n;
        ArrayList<class_1799> arrayList = new ArrayList<class_1799>();
        class_2371 class_23712 = khb.mc.field_1724.method_31548().field_7548;
        boolean bl2 = false;
        for (n = class_23712.size() - 1; n >= 0; --n) {
            class_1799 class_17992 = (class_1799)class_23712.get(n);
            arrayList.add(class_17992);
            if (class_17992.method_7960()) continue;
            bl2 = true;
        }
        if (this.ddgh_2.thnth("Enabled")) {
            class_1799 class_17993 = khb.mc.field_1724.method_6079();
            arrayList.add(class_17993);
            if (!class_17993.method_7960()) {
                bl2 = true;
            }
        }
        int n2 = n = this.ddgh_2.thnth("Enabled") ? 5 : 4;
        while (bl && arrayList.size() < n) {
            arrayList.add(class_1799.field_8037);
        }
        return bl2 || bl ? arrayList : List.of();
    }

    private void tdhd(List list, List list2) {
        list2.clear();
        for (class_1799 class_17992 : list) {
            list2.add(class_17992.method_7972());
        }
    }

    private void rtht_2(class_332 class_3322, class_1799 class_17992, float f, float f2, float f3, float f4) {
        if (class_17992.method_7960()) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22905(f3 / 16.0f, f3 / 16.0f, 1.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f4);
        class_3322.method_51427(class_17992, 0, 0);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_45872.method_22909();
    }

    private void hshz(class_4587 class_45872, float f, float f2, float f3) {
        Color color = bas_4.zsz_4();
        bjgh.jghs.hrj(class_45872, f, f2, 16.0f, 16.0f, 5.0f, new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(34.0f * f3)));
        bjgh.jghs.hrj(class_45872, f, f2, 16.0f, 16.0f, 4.5f, new Color(0, 0, 0, Math.round(32.0f * f3)));
    }

    private float jza_2(class_1799 class_17992) {
        if (class_17992.method_7960() || !class_17992.method_7963() || class_17992.method_7936() <= 0) {
            return class_17992.method_7960() ? 0.0f : 1.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (float)(class_17992.method_7936() - class_17992.method_7919()) / (float)class_17992.method_7936()));
    }

    private void tsth_2(wh_2 wh2) {
        this.jssh_2(wh2);
    }

    private void zghb(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] cune8pc3(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite y8wdza9a(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ idz3at0 ^ string.hashCode() ^ n2 + kivscwoai2f7h + i * 1551599545) + idz3at0) ^ kivscwoai2f7h));
            }
            String[] stringArray = khb.cune8pc3(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

