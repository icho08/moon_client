/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.ngh;

public class shf_3
extends thw_3 {
    private static final int khwt = 40;
    private final float[] khrt_2 = new float[40];
    private int jd_2;
    private long rhth;
    private static final int pqx7dk5 = 2043769056;
    private static final int u1oenl4x0ea = 507561349;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tie75gnju;

    @Override
    public String getName() {
        return "Speed Graph";
    }

    public shf_3() {
        super(80.0f, 120.0f);
    }

    @Override
    public void lh(class_4587 class_45872) {
        if (shf_3.mc.field_1724 == null) {
            return;
        }
        float f = this.khta_3().getX();
        float f2 = this.khta_3().getY();
        float f3 = 80.0f;
        float f4 = 30.0f;
        float f5 = 14.0f;
        float f6 = f + 4.0f;
        float f7 = f2 + f4 - 5.0f;
        float f8 = f3 - 8.0f;
        float f9 = (float)ngh.khmkh((class_1297)shf_3.mc.field_1724);
        this.jsh_3(f9);
        bjgh.jghs.hrj(class_45872, f, f2, f3, f4, 5.0f, new Color(20, 20, 20, 200));
        bjgh.jghs.hrj(class_45872, f + f3 * 0.5f, f2 + 3.0f, 0.5f, f4 - 6.0f, 0.0f, new Color(bas_4.zsz_4().getRed(), bas_4.zsz_4().getGreen(), bas_4.zsz_4().getBlue(), 80));
        bjgh.jghs.hrj(class_45872, f + 3.0f, f2 + f4 * 0.5f, f3 - 6.0f, 0.5f, 0.0f, new Color(bas_4.zsz_4().getRed(), bas_4.zsz_4().getGreen(), bas_4.zsz_4().getBlue(), 80));
        this.zghj_2(class_45872, f6, f7, f8, f5);
        String string = String.format("%.2f bps", Float.valueOf(f9));
        this.dsgh_2().zskh_4(class_45872, string, f + f3 - this.dsgh_2().shdf_2(string, 6.2f) - 4.0f, f2 + 2.5f, 6.2f, Color.WHITE, 0.0f);
        this.khta_3().setWidth(f3);
        this.khta_3().setHeight(f4);
    }

    private void jsh_3(float f) {
        long l = System.currentTimeMillis();
        if (l - this.rhth < 100L) {
            return;
        }
        this.khrt_2[this.jd_2] = f;
        this.jd_2 = (this.jd_2 + 1) % 40;
        this.rhth = l;
    }

    private void zghj_2(class_4587 class_45872, float f, float f2, float f3, float f4) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        Color color = bas_4.zsz_4();
        float f5 = 10.0f;
        for (int i = 0; i < 39; ++i) {
            int n = (this.jd_2 + i) % 40;
            int n2 = (this.jd_2 + i + 1) % 40;
            float f6 = f + (float)i / 39.0f * f3;
            float f7 = f2 - Math.min(this.khrt_2[n], f5) / f5 * f4;
            float f8 = f + (float)(i + 1) / 39.0f * f3;
            float f9 = f2 - Math.min(this.khrt_2[n2], f5) / f5 * f4;
            class_2872.method_22918(matrix4f, f6, f7, 0.0f).method_39415(color.getRGB());
            class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_39415(color.getRGB());
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.disableBlend();
    }

    private static String[] ae3iy3l6(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qaf3bptm2ro2f(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ pqx7dk5 ^ string.hashCode()) + (n2 + u1oenl4x0ea) + i ^ pqx7dk5, 21) + u1oenl4x0ea);
            }
            String[] stringArray = shf_3.ae3iy3l6(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

