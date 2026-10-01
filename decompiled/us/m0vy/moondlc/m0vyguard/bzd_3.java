/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.tzth;
import us.m0vy.moondlc.m0vyguard.shw_3;

public class bzd_3
extends tzth {
    private static final int q1jlp9r9 = 181889377;
    private static final int td0al62hs4 = 1153502223;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int olcj0jgb3;

    @Override
    public void ththd() {
    }

    @Override
    public void ht_2(shw_3 shw2) {
        if (!this.ssn_3() || sbh_2 == null) {
            return;
        }
        tdhz_2 tdhz2_2 = tdhz_2.trb();
        class_4184 class_41842 = bzd_3.mc.field_1773.method_19418();
        double d = bzd_3.shkdh() - class_41842.method_19326().field_1352;
        double d2 = bzd_3.qn() - class_41842.method_19326().field_1350;
        float f = tdhz2_2.dwy_2().thw_5();
        float f2 = tdhz2_2.had_2().thw_5();
        float f3 = sbh_2.method_17682() * f2;
        double d3 = Math.sin((double)System.currentTimeMillis() / (400.0 / (double)Math.max(f, 0.1f)));
        double d4 = bzd_3.ghtb_2() - class_41842.method_19326().field_1351 + Math.min(d3 + 0.95, (double)f3);
        RenderSystem.disableDepthTest();
        RenderSystem.disableCull();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_4587 class_45872 = shw2.ssha_2();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27380, class_290.field_1576);
        int n = tdhz2_2.shthd(255).getRGB();
        float f4 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n & 0xFF) / 255.0f;
        float f7 = (float)thdhs_2.khbk() * tdhz2_2.ddhgh().thw_5();
        float f8 = this.dhsht(shw2.skz_4());
        float f9 = sbh_2.method_17681() * tdhz2_2.ssh().thw_5() * f8;
        float f10 = tdhz2_2.tty().thw_5() * f8;
        float f11 = 0.0f;
        while ((double)f11 <= 6.440264939859076) {
            double d5 = d + (double)f9 * Math.cos(f11);
            double d6 = d2 + (double)f9 * Math.sin(f11);
            class_2872.method_22918(matrix4f, (float)d5, (float)(d4 - Math.cos((double)System.currentTimeMillis() / 400.0) / (2.0 / (double)f10)), (float)d6).method_22915(f4, f5, f6, 0.01f * f7);
            class_2872.method_22918(matrix4f, (float)d5, (float)d4, (float)d6).method_22915(f4, f5, f6, f7);
            f11 = (float)((double)f11 + 0.15707963267948966);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableDepthTest();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private static String[] oa0lz20z(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite l8f6g0t9zkf065(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ q1jlp9r9 ^ string.hashCode() ^ n2 + td0al62hs4 ^ i * -728865489 ^ q1jlp9r9, 27) ^ td0al62hs4));
            }
            String[] stringArray = bzd_3.oa0lz20z(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

