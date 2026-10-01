/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_243
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
 *  net.minecraft.class_490
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import net.minecraft.class_490;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.dhs_5;
import us.m0vy.moondlc.m0vyguard.ngh;
import us.m0vy.moondlc.m0vyguard.wh_2;

public class sl_2
extends thw_3 {
    private final bjz thsf = new bjz();
    private final bjz zzs_2 = new bjz();
    private float zdh_2;
    private class_1309 shal_2;
    private class_332 jfb;
    private float rsdh;
    private static final int pch934t = -1733698244;
    private static final int bfn0h9v = 1743518393;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int aw0ejzhh5g3i;

    public sl_2() {
        super(135.0f, 44.0f);
    }

    @Override
    public String getName() {
        return "Target Info";
    }

    @Override
    public void lh(wh_2 wh2) {
        this.jfb = wh2.context();
        this.rsdh = wh2.partialTicks();
        this.lh(wh2.matrixStack());
        this.jfb = null;
    }

    @Override
    public void lh(class_4587 class_45872) {
        if (this.jfb == null || !bza_4.thtsh_2().rgha_2()) {
            return;
        }
        class_1309 class_13092 = this.zssh_2();
        this.sdhd(class_13092);
        if (class_13092 != null) {
            this.shal_2 = class_13092;
        }
        if (this.thsf.khbk() <= 0.05 || this.shal_2 == null) {
            return;
        }
        float f = (float)this.thsf.khbk();
        int n = (int)(f * 255.0f);
        float f2 = this.khta_3().getX();
        float f3 = this.khta_3().getY();
        float f4 = 110.0f;
        float f5 = 35.0f;
        Vector2f vector2f = this.hhh(this.shal_2, f5);
        if (vector2f != null) {
            f2 = vector2f.x;
            f3 = vector2f.y;
        }
        this.rthdh(class_45872, this.shal_2, f2, f3, f, n);
    }

    private void rthdh(class_4587 class_45872, class_1309 class_13092, float f, float f2, float f3, int n) {
        float f4 = 110.0f;
        float f5 = 35.0f;
        float f6 = Math.max(1.0f, class_13092.method_6063());
        float f7 = class_3532.method_15363((float)class_13092.method_6032(), (float)0.0f, (float)f6);
        float f8 = Math.max(0.0f, class_13092.method_6067());
        float f9 = class_3532.method_15363((float)(f7 / f6), (float)0.0f, (float)1.0f);
        float f10 = class_3532.method_15363((float)(f8 / f6), (float)0.0f, (float)1.0f);
        this.zdh_2 = ngh.thnj(this.zdh_2, f9, 0.2f);
        Color color = new Color(20, 20, 25, (int)(220.0f * f3));
        Color color2 = bas_4.khan(n);
        bjgh.jghs.hrj(class_45872, f, f2, f4, f5, 5.0f, color);
        if (n > 10) {
            this.nth(f + 16.0f, f2 + 29.0f, 13, class_13092);
        }
        float f11 = f + 34.0f;
        float f12 = f2 + 4.0f;
        this.thdz_2().zskh_4(class_45872, class_13092.method_5477().getString(), f11, f12, 7.0f, color2, 0.0f);
        String string = "Distance: " + String.format("%.1f", Float.valueOf(sl_2.mc.field_1724.method_5739((class_1297)class_13092)));
        this.thdz_2().zskh_4(class_45872, string, f11, f12 + 9.0f, 6.0f, new Color(180, 180, 180, n), 0.0f);
        String string2 = String.format("%.1f", Float.valueOf(f7 + f8));
        float f13 = this.dsgh_2().shdf_2(string2, 6.5f);
        this.dsgh_2().zskh_4(class_45872, string2, f + f4 - f13 - 6.0f, f12 + 0.5f, 6.5f, bas_4.tdth_2(n), 0.0f);
        float f14 = f11;
        float f15 = f2 + f5 - 9.0f;
        float f16 = 65.0f;
        float f17 = 3.0f;
        bjgh.jghs.hrj(class_45872, f14, f15, f16, f17, 1.0f, new Color(40, 40, 40, n));
        bjgh.jghs.hrj(class_45872, f14, f15, f16 * this.zdh_2, f17, 1.0f, bas_4.tdth_2(n));
        if (f10 > 0.0f) {
            float f18 = f16 * f10;
            float f19 = f14 + f16 - f18;
            if (f18 > 0.0f) {
                bjgh.jghs.hrj(class_45872, f19, f15, f18, f17, 1.0f, new Color(255, 220, 81, n));
            }
        }
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            if (this.zzs_2.khbk() > 0.01) {
                this.hza_2(class_45872, class_16572, f + f4, f2 + f5 + 2.0f, n, (float)this.zzs_2.khbk());
            }
        }
        this.khta_3().setWidth(f4);
        this.khta_3().setHeight(f5);
    }

    private void hza_2(class_4587 class_45872, class_1657 class_16572, float f, float f2, float f3, float f4) {
        int n = 0;
        for (int i = 0; i < 6; ++i) {
            if (this.ghbsh(class_16572, i).method_7960()) continue;
            ++n;
        }
        if (n == 0) {
            return;
        }
        float f5 = 8.0f;
        float f6 = 2.0f;
        float f7 = 2.5f;
        float f8 = (float)n * f5 + (float)(n - 1) * f6 + f7 * 2.0f;
        float f9 = f5 + f7 * 2.0f + 1.5f;
        float f10 = f - f8;
        float f11 = f3 * f4;
        float f12 = f10 + f8 * 0.5f;
        float f13 = f2 + f9 * 0.5f;
        float f14 = this.zjsh(f4);
        float f15 = 0.72f + f14 * 0.28f;
        float f16 = (1.0f - f14) * -5.0f;
        class_45872.method_22903();
        class_45872.method_46416(f12, f13 + f16, 0.0f);
        class_45872.method_22905(f15, f15, 1.0f);
        class_45872.method_46416(-f12, -f13, 0.0f);
        bjgh.jghs.hrj(class_45872, f10, f2, f8, f9, 4.0f, new Color(20, 20, 25, (int)(220.0f * (f11 / 255.0f))));
        float f17 = f10 + f7;
        float f18 = f2 + f7;
        for (int i = 0; i < 6; ++i) {
            class_1799 class_17992 = this.ghbsh(class_16572, i);
            if (class_17992.method_7960()) continue;
            this.jhh_3(class_17992, f17, f18, f5, f11);
            f17 += f5 + f6;
        }
        class_45872.method_22909();
    }

    private class_1799 ghbsh(class_1657 class_16572, int n) {
        if (n == 0) {
            return class_16572.method_6047();
        }
        if (n == 1) {
            return class_16572.method_6079();
        }
        int n2 = 5 - n;
        return n2 >= 0 && n2 < class_16572.method_31548().field_7548.size() ? (class_1799)class_16572.method_31548().field_7548.get(n2) : class_1799.field_8037;
    }

    private void jhh_3(class_1799 class_17992, float f, float f2, float f3, float f4) {
        if (this.jfb == null || class_17992.method_7960()) {
            return;
        }
        float f5 = f3 / 16.0f;
        class_4587 class_45872 = this.jfb.method_51448();
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22905(f5, f5, 1.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)(f4 / 255.0f));
        this.jfb.method_51427(class_17992, 0, 0);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_45872.method_22909();
        if (class_17992.method_7963()) {
            float f6 = 1.0f - (float)class_17992.method_7919() / (float)class_17992.method_7936();
            float f7 = f3;
            float f8 = 1.0f;
            float f9 = f2 + f3 + 0.5f;
            bjgh.jghs.hrj(class_45872, f, f9, f7, f8, 0.5f, new Color(20, 20, 20, (int)(200.0f * (f4 / 255.0f))));
            int n = class_3532.method_15369((float)(f6 / 3.0f), (float)1.0f, (float)1.0f);
            bjgh.jghs.hrj(class_45872, f, f9, f7 * f6, f8, 0.5f, new Color(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, (int)(255.0f * (f4 / 255.0f))));
        }
    }

    private void nth(float f, float f2, int n, class_1309 class_13092) {
        float f3;
        float f4;
        if (this.jfb == null) {
            return;
        }
        class_4587 class_45872 = this.jfb.method_51448();
        class_45872.method_22903();
        if (class_13092 != null && class_13092.field_6235 > 0 && (f4 = ((float)class_13092.field_6235 - this.rsdh) / 10.0f) > 0.0f) {
            float f5 = class_3532.method_15374((float)(f4 * (float)Math.PI * 2.0f)) * 4.0f;
            class_45872.method_46416(f, f2 - (float)n / 2.0f, 0.0f);
            class_45872.method_22907(new Quaternionf().rotateZ((float)Math.toRadians(f5)));
            f3 = 1.0f + class_3532.method_15374((float)(f4 * (float)Math.PI)) * 0.05f;
            class_45872.method_22905(f3, f3, 1.0f);
            class_45872.method_46416(-f, -(f2 - (float)n / 2.0f), 0.0f);
        }
        Quaternionf quaternionf = new Quaternionf().rotateZ((float)Math.PI);
        Quaternionf quaternionf2 = new Quaternionf().rotateX(-0.5235988f);
        quaternionf.mul((Quaternionfc)quaternionf2);
        f3 = class_13092.field_6283;
        float f6 = class_13092.method_36454();
        float f7 = class_13092.method_36455();
        float f8 = class_13092.field_6259;
        float f9 = class_13092.field_6241;
        class_13092.field_6283 = 180.0f;
        class_13092.method_36456(180.0f);
        class_13092.method_36457(0.0f);
        class_13092.field_6241 = 180.0f;
        class_13092.field_6259 = 180.0f;
        class_490.method_48472((class_332)this.jfb, (float)f, (float)f2, (float)n, (Vector3f)new Vector3f(0.0f, 0.0f, 0.0f), (Quaternionf)quaternionf, null, (class_1309)class_13092);
        class_13092.field_6283 = f3;
        class_13092.method_36456(f6);
        class_13092.method_36457(f7);
        class_13092.field_6259 = f8;
        class_13092.field_6241 = f9;
        class_45872.method_22909();
    }

    private void sdhd(class_1309 class_13092) {
        this.thsf.ddhdh();
        this.zzs_2.ddhdh();
        this.thsf.shd_6(class_13092 != null ? 1.0 : 0.0, this.tshz_3(), this.zst_4());
        boolean bl = class_13092 instanceof class_1657 && bza_4.thtsh_2().sd_2.hdh();
        this.zzs_2.sbsh_2(bl ? 1.0 : 0.0, bl ? 180L : 260L, bl ? tbm.srdh : tbm.hrkh, true);
    }

    private class_1309 zssh_2() {
        class_1309 class_13092 = bjd.shfn();
        if (class_13092 != null) {
            return class_13092;
        }
        if (sl_2.mc.field_1755 instanceof class_408) {
            return sl_2.mc.field_1724;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Vector2f hhh(class_1309 class_13092, float f) {
        if (!bza_4.thtsh_2().dhd_5.hdh() || class_13092 == null || class_13092 == sl_2.mc.field_1724) {
            return null;
        }
        double d = ngh.dhsth(class_13092.field_6014, class_13092.method_23317(), this.rsdh);
        double d2 = ngh.dhsth(class_13092.field_6036, class_13092.method_23318(), this.rsdh) + (double)class_13092.method_17682() * 0.55;
        double d3 = ngh.dhsth(class_13092.field_5969, class_13092.method_23321(), this.rsdh);
        double d4 = Math.max(0.28, (double)class_13092.method_17681() * 0.5);
        dhs_5.dft_3();
        try {
            Vector2f vector2f = dhs_5.tdhkh(new class_243(d, d2, d3));
            if (vector2f.x == Float.MAX_VALUE) {
                Vector2f vector2f2 = null;
                return vector2f2;
            }
            Vector2f vector2f3 = dhs_5.tdhkh(new class_243(d + d4, d2, d3));
            Vector2f vector2f4 = dhs_5.tdhkh(new class_243(d - d4, d2, d3));
            float f2 = vector2f.x;
            if (vector2f3.x != Float.MAX_VALUE) {
                f2 = Math.max(f2, vector2f3.x);
            }
            if (vector2f4.x != Float.MAX_VALUE) {
                f2 = Math.max(f2, vector2f4.x);
            }
            Vector2f vector2f5 = new Vector2f(f2 + 8.0f, vector2f.y - f * 0.55f);
            return vector2f5;
        }
        finally {
            dhs_5.zlk();
        }
    }

    private float zjsh(float f) {
        return f * f * (3.0f - 2.0f * f);
    }

    private static String[] hce00inc(String string) {
        return string.split("\u0002\u000f", -1);
    }

    private static CallSite nf2hllltt2e5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ pch934t ^ string.hashCode()) + (n2 + bfn0h9v) + i ^ pch934t, 22) + bfn0h9v);
            }
            String[] stringArray = sl_2.hce00inc(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

