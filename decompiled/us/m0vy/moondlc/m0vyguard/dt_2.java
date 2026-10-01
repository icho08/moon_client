/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10156
 *  net.minecraft.class_2561
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4588
 *  net.minecraft.class_5944
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_10156;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4588;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bbz_2;
import us.m0vy.moondlc.m0vyguard.bmt_2;
import us.m0vy.moondlc.m0vyguard.ttl;
import us.m0vy.moondlc.m0vyguard.zn_2;
import us.m0vy.moondlc.m0vyguard.wa;

public final class dt_2 {
    public static final class_10156 jsr_2;
    private static final int b4sjlczstkfj = -563902990;
    private static final int rtnwq8x6 = -975946272;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yv64sc5j3;

    public static void sthq_2(zn_2 zn2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4) {
        dt_2.swl(zn2, string, f, n, matrix4f, f2, f3, f4, false, 0.0f, 1.0f, 0.0f);
    }

    public static void swl(zn_2 zn2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7) {
        string = string.replace("і", "i").replace("І", "I");
        float f8 = 0.05f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        if (bmt_2.zqy_2() != null) {
            zn2.thzkh(matrix4f, (class_4588)bmt_2.zqy_2().ttgh(), string, f, f8 * 0.5f * f, f10, f2 - 0.75f, f3 + f * 0.7f, f4, n);
        } else {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();
            RenderSystem.setShaderTexture((int)0, (int)zn2.khnk());
            class_5944 class_59442 = RenderSystem.setShader((class_10156)jsr_2);
            class_59442.method_34582("Range").method_1251(zn2.dhz_10().range());
            class_59442.method_34582("Thickness").method_1251(f8);
            class_59442.method_34582("Smoothness").method_1251(f9);
            class_59442.method_34582("EnableFadeout").method_35649(bl ? 1 : 0);
            class_59442.method_34582("FadeoutStart").method_1251(f5);
            class_59442.method_34582("FadeoutEnd").method_1251(f6);
            class_59442.method_34582("MaxWidth").method_1251(f7);
            class_59442.method_34582("TextPosX").method_1251(f2);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            zn2.thzkh(matrix4f, (class_4588)class_2872, string, f, f8 * 0.5f * f, f10, f2 - 0.75f, f3 + f * 0.7f, f4, n);
            class_9801 class_98012 = class_2872.method_60794();
            if (class_98012 != null) {
                class_286.method_43433((class_9801)class_98012);
            }
            RenderSystem.setShaderTexture((int)0, (int)0);
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
        }
    }

    public static void dhaz_2(zn_2 zn2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6) {
        float f7 = zn2.rjj(string, f) * 2.0f;
        dt_2.swl(zn2, string, f, n, matrix4f, f2, f3, f4, bl, f5, f6, f7);
    }

    public static void dtw_2(zn_2 zn2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4) {
        dt_2.zzf_2(zn2, class_25612, f, matrix4f, f2, f3, f4, false, 0.0f, 1.0f, 0.0f);
    }

    public static void zzf_2(zn_2 zn2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7) {
        float f8 = 0.05f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        List list = bbz_2.hrd_2(class_25612, ttl.khzt_4.rlsh());
        float f11 = f2;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)zn2.khnk());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)jsr_2);
        class_59442.method_34582("Range").method_1251(zn2.dhz_10().range());
        class_59442.method_34582("Thickness").method_1251(f8);
        class_59442.method_34582("Smoothness").method_1251(f9);
        class_59442.method_34582("EnableFadeout").method_35649(bl ? 1 : 0);
        class_59442.method_34582("FadeoutStart").method_1251(f5);
        class_59442.method_34582("FadeoutEnd").method_1251(f6);
        class_59442.method_34582("MaxWidth").method_1251(f7);
        class_59442.method_34582("TextPosX").method_1251(f2);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (wa wa2 : list) {
            zn2.thzkh(matrix4f, (class_4588)class_2872, wa2.ttd_3, f, f8 * 0.5f * f, f10 - 0.3f, f11 - 0.75f, f3 + f * 0.7f, f4, wa2.tdgh_2);
            f11 += zn2.rjj(wa2.ttd_3, f);
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void swh_2(zn_2 zn2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6) {
        float f7 = zn2.azf_2(class_25612, f) * 2.0f;
        dt_2.zzf_2(zn2, class_25612, f, matrix4f, f2, f3, f4, bl, f5, f6, f7);
    }

    @Generated
    private dt_2() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] rfirduhnjk0y(String string) {
        return string.split("\u0007\u0017", -1);
    }

    private static CallSite l9sxqtgygsk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ b4sjlczstkfj ^ string.hashCode() ^ n2 + rtnwq8x6 + i * 882038825) + b4sjlczstkfj) ^ rtnwq8x6));
            }
            String[] stringArray = dt_2.rfirduhnjk0y(new String(cArray));
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

