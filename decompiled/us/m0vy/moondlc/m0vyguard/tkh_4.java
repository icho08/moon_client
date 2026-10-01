/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4604
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
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
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4604;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.bhk;
import us.m0vy.moondlc.m0vyguard.blkh;
import us.m0vy.moondlc.m0vyguard.blz;
import us.m0vy.moondlc.m0vyguard.hj;
import us.m0vy.moondlc.m0vyguard.dl;

public class tkh_4
implements dl {
    private final List dkd_2 = new ArrayList();
    private final List khht = new ArrayList();
    private final List sdsh_3 = new ArrayList();
    private static final int u7lyond0 = -1606734874;
    private static final int ufra2eh = 2139863114;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int thr9bfhc9zrhu;

    public void jtf(class_4587 class_45872) {
        class_4184 class_41842 = class_310.method_1551().field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        class_4604 class_46042 = new class_4604(class_45872.method_23760().method_23761(), RenderSystem.getProjectionMatrix());
        class_46042.method_23088(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        this.dghb_2(this.khht, class_46042, class_45872);
        this.zyd(this.sdsh_3, class_46042, class_45872);
        this.hhf_2(this.dkd_2, class_46042, class_45872);
        this.khht.clear();
        this.sdsh_3.clear();
        this.dkd_2.clear();
    }

    private void dghb_2(List list, class_4604 class_46042, class_4587 class_45872) {
        if (list.isEmpty()) {
            return;
        }
        for (blkh blkh2 : list) {
            class_238 class_2383 = new class_238(blkh2.shhth, blkh2.shhth.method_1019(blkh2.zk_2));
            if (!class_46042.method_23093(class_2383)) continue;
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_289 class_2892 = class_289.method_1348();
            class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.setShader((class_10156)class_10142.field_53876);
            this.shlth(blkh2.shhth, blkh2.zk_2, class_45872, class_2872, blkh2.daz_3);
            class_286.method_43433((class_9801)class_2872.method_60800());
            RenderSystem.enableCull();
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
        }
    }

    private void zyd(List list, class_4604 class_46042, class_4587 class_45872) {
        if (list.isEmpty()) {
            return;
        }
        for (bhk bhk2 : list) {
            class_238 class_2383 = new class_238(bhk2.jaj, bhk2.jaj.method_1019(bhk2.rmt_2));
            if (!class_46042.method_23093(class_2383)) continue;
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_289 class_2892 = class_289.method_1348();
            class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27377, class_290.field_29337);
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.setShader((class_10156)class_10142.field_53864);
            RenderSystem.lineWidth((float)bhk2.hwy);
            this.rwl(bhk2.jaj, bhk2.rmt_2, class_45872, class_2872, bhk2.rds_3, bhk2.thdt);
            class_286.method_43433((class_9801)class_2872.method_60800());
            RenderSystem.enableCull();
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
        }
    }

    private void hhf_2(List list, class_4604 class_46042, class_4587 class_45872) {
        if (list.isEmpty()) {
            return;
        }
        for (hj hj2 : list) {
            class_238 class_2383 = new class_238(hj2.bnb, hj2.bnb.method_1019(hj2.dhwz));
            if (!class_46042.method_23093(class_2383)) continue;
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_289 class_2892 = class_289.method_1348();
            class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27377, class_290.field_29337);
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.setShader((class_10156)class_10142.field_53864);
            RenderSystem.lineWidth((float)hj2.shza_3);
            this.ghds_2(hj2.bnb, hj2.dhwz, class_45872, class_2872, hj2.dghh_2);
            class_286.method_43433((class_9801)class_2872.method_60800());
            RenderSystem.enableCull();
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
        }
    }

    private void shlth(class_243 class_2432, class_243 class_2433, class_4587 class_45872, class_287 class_2872, Color color) {
        class_243 class_2434 = class_310.method_1551().field_1773.method_19418().method_19326();
        float f = (float)(class_2432.field_1352 - class_2434.field_1352);
        float f2 = (float)(class_2432.field_1351 - class_2434.field_1351);
        float f3 = (float)(class_2432.field_1350 - class_2434.field_1350);
        float f4 = f + (float)class_2433.field_1352;
        float f5 = f2 + (float)class_2433.field_1351;
        float f6 = f3 + (float)class_2433.field_1350;
        this.tzd_6(class_45872, class_2872, f, f2, f3, f4, f2, f3, f4, f5, f3, f, f5, f3, color);
        this.tzd_6(class_45872, class_2872, f, f2, f6, f4, f2, f6, f4, f5, f6, f, f5, f6, color);
        this.tzd_6(class_45872, class_2872, f, f2, f3, f, f2, f6, f, f5, f6, f, f5, f3, color);
        this.tzd_6(class_45872, class_2872, f4, f2, f3, f4, f2, f6, f4, f5, f6, f4, f5, f3, color);
        this.tzd_6(class_45872, class_2872, f, f2, f3, f4, f2, f3, f4, f2, f6, f, f2, f6, color);
        this.tzd_6(class_45872, class_2872, f, f5, f3, f4, f5, f3, f4, f5, f6, f, f5, f6, color);
    }

    private void ghds_2(class_243 class_2432, class_243 class_2433, class_4587 class_45872, class_287 class_2872, Color color) {
        class_243 class_2434 = class_310.method_1551().field_1773.method_19418().method_19326();
        float f = (float)(class_2432.field_1352 - class_2434.field_1352);
        float f2 = (float)(class_2432.field_1351 - class_2434.field_1351);
        float f3 = (float)(class_2432.field_1350 - class_2434.field_1350);
        float f4 = f + (float)class_2433.field_1352;
        float f5 = f2 + (float)class_2433.field_1351;
        float f6 = f3 + (float)class_2433.field_1350;
        this.jkh_3(class_45872, (class_4588)class_2872, f, f2, f3, f4, f2, f3, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f4, f2, f3, f4, f2, f6, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f4, f2, f6, f, f2, f6, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f, f2, f6, f, f2, f3, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f, f5, f3, f4, f5, f3, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f4, f5, f3, f4, f5, f6, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f4, f5, f6, f, f5, f6, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f, f5, f6, f, f5, f3, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f, f2, f3, f, f5, f3, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f4, f2, f3, f4, f5, f3, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f, f2, f6, f, f5, f6, color);
        this.jkh_3(class_45872, (class_4588)class_2872, f4, f2, f6, f4, f5, f6, color);
    }

    private void rwl(class_243 class_2432, class_243 class_2433, class_4587 class_45872, class_287 class_2872, Color color, float f) {
        class_243 class_2434 = class_310.method_1551().field_1773.method_19418().method_19326();
        float f2 = (float)(class_2432.field_1352 - class_2434.field_1352);
        float f3 = (float)(class_2432.field_1351 - class_2434.field_1351);
        float f4 = (float)(class_2432.field_1350 - class_2434.field_1350);
        float f5 = f2 + (float)class_2433.field_1352;
        float f6 = f3 + (float)class_2433.field_1351;
        float f7 = f4 + (float)class_2433.field_1350;
        this.ajgh(class_45872, class_2872, color, f2, f3, f4, f5, f3, f4, f, f);
        this.ajgh(class_45872, class_2872, color, f5, f3, f4, f5, f3, f7, f, f);
        this.ajgh(class_45872, class_2872, color, f5, f3, f7, f2, f3, f7, f, f);
        this.ajgh(class_45872, class_2872, color, f2, f3, f7, f2, f3, f4, f, f);
        this.ajgh(class_45872, class_2872, color, f2, f6, f4, f5, f6, f4, f, f);
        this.ajgh(class_45872, class_2872, color, f5, f6, f4, f5, f6, f7, f, f);
        this.ajgh(class_45872, class_2872, color, f5, f6, f7, f2, f6, f7, f, f);
        this.ajgh(class_45872, class_2872, color, f2, f6, f7, f2, f6, f4, f, f);
        this.ajgh(class_45872, class_2872, color, f2, f3, f4, f2, f6, f4, f, f);
        this.ajgh(class_45872, class_2872, color, f5, f3, f4, f5, f6, f4, f, f);
        this.ajgh(class_45872, class_2872, color, f2, f3, f7, f2, f6, f7, f, f);
        this.ajgh(class_45872, class_2872, color, f5, f3, f7, f5, f6, f7, f, f);
    }

    private void ajgh(class_4587 class_45872, class_287 class_2872, Color color, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f4 - f;
        float f10 = f5 - f2;
        float f11 = f6 - f3;
        float f12 = class_3532.method_15355((float)(f9 * f9 + f10 * f10 + f11 * f11));
        if (class_3532.method_15347((float)f12, (float)0.0f)) {
            return;
        }
        float f13 = 0.0f;
        while (f13 < 1.0f) {
            float f14 = f13;
            float f15 = Math.min(f13 + f7 / f12, 1.0f);
            if (f15 > f14) {
                float f16 = f + f9 * f14;
                float f17 = f2 + f10 * f14;
                float f18 = f3 + f11 * f14;
                float f19 = f + f9 * f15;
                float f20 = f2 + f10 * f15;
                float f21 = f3 + f11 * f15;
                this.jkh_3(class_45872, (class_4588)class_2872, f16, f17, f18, f19, f20, f21, color);
            }
            f13 = f15;
            f13 = Math.min(f13 + f8 / f12, 1.0f);
        }
    }

    private void jkh_3(class_4587 class_45872, class_4588 class_45882, float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        Matrix4f matrix4f = class_46652.method_23761();
        Vector3f vector3f = this.bjr(f, f2, f3, f4, f5, f6);
        class_45882.method_22918(matrix4f, f, f2, f3).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, vector3f.x, vector3f.y, vector3f.z);
        class_45882.method_22918(matrix4f, f4, f5, f6).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, vector3f.x, vector3f.y, vector3f.z);
    }

    private Vector3f bjr(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float f9 = f6 - f3;
        float f10 = class_3532.method_15355((float)(f7 * f7 + f8 * f8 + f9 * f9));
        return new Vector3f(f7 / f10, f8 / f10, f9 / f10);
    }

    private void tzd_6(class_4587 class_45872, class_287 class_2872, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, Color color) {
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        Matrix4f matrix4f = class_46652.method_23761();
        Vector3f vector3f = new Vector3f(0.0f, 0.0f, 1.0f);
        class_2872.method_22918(matrix4f, f, f2, f3).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, vector3f.x, vector3f.y, vector3f.z);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, vector3f.x, vector3f.y, vector3f.z);
        class_2872.method_22918(matrix4f, f7, f8, f9).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, vector3f.x, vector3f.y, vector3f.z);
        class_2872.method_22918(matrix4f, f10, f11, f12).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, vector3f.x, vector3f.y, vector3f.z);
    }

    public void sta_7(float f, float f2, float f3, float f4, float f5, float f6, float f7, Color color, blz blz2, float f8) {
        class_243 class_2432 = new class_243((double)f, (double)f2, (double)f3);
        class_243 class_2433 = new class_243((double)(f4 - f), (double)(f5 - f2), (double)(f6 - f3));
        switch (blz2.ordinal()) {
            case 0: {
                this.khht.add(new blkh(class_2432, class_2433, color));
                break;
            }
            case 1: {
                this.dkd_2.add(new hj(class_2432, class_2433, f7, color));
                break;
            }
            case 2: {
                this.sdsh_3.add(new bhk(class_2432, class_2433, f7, color, f8));
            }
        }
    }

    private static String[] s7by1vmtjn(String string) {
        return string.split("\b\u001e", -1);
    }

    private static CallSite qiod4sudu2cq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ u7lyond0 ^ string.hashCode() ^ n2 + ufra2eh + i * -2012411073) + u7lyond0) ^ ufra2eh));
            }
            String[] stringArray = tkh_4.s7by1vmtjn(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

