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
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
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
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import us.m0vy.moondlc.m0vyguard.bzsh;
import us.m0vy.moondlc.m0vyguard.bsw_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.tthz_2;
import us.m0vy.moondlc.m0vyguard.tl;

public final class wt_2 {
    public static final class_10156 bthd_2;
    private static final int o9fs4leqj9tws = -1434591646;
    private static final int zpshkwg = -1522634663;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int hmp5tm7vr;

    public static void sdhj_2(tthz_2 tthz2_2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4) {
        wt_2.rah_4(tthz2_2, string, f, n, matrix4f, f2, f3, f4, false, 0.0f, 1.0f, 0.0f);
    }

    public static void rah_4(tthz_2 tthz2_2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7) {
        float f8 = 0.05f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)tthz2_2.nh_2());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)bthd_2);
        class_59442.method_34582("Range").method_1251(tthz2_2.dhh_5().range());
        class_59442.method_34582("Thickness").method_1251(f8);
        class_59442.method_34582("Smoothness").method_1251(0.57f);
        class_59442.method_34582("EnableFadeout").method_35649(bl ? 1 : 0);
        class_59442.method_34582("FadeoutStart").method_1251(f5);
        class_59442.method_34582("FadeoutEnd").method_1251(f6);
        Vector4f vector4f = new Vector4f(f2, 0.0f, 0.0f, 1.0f).mul((Matrix4fc)matrix4f);
        Vector4f vector4f2 = new Vector4f(f2 + f7, 0.0f, 0.0f, 1.0f).mul((Matrix4fc)matrix4f);
        class_59442.method_34582("TextPosX").method_1251(vector4f.x);
        class_59442.method_34582("MaxWidth").method_1251(vector4f2.x - vector4f.x);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        tthz2_2.zad_6(matrix4f, (class_4588)class_2872, string, f, f8 * 0.5f * f, f10, f2 - 0.75f, f3 + f * 0.7f, f4, n);
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void shz_3(tthz_2 tthz2_2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6) {
        float f7 = tthz2_2.dht_10(string, f) * 2.0f;
        wt_2.rah_4(tthz2_2, string, f, n, matrix4f, f2, f3, f4, bl, f5, f6, f7);
    }

    public static void tff(tthz_2 tthz2_2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4) {
        wt_2.tkth_2(tthz2_2, class_25612, f, matrix4f, f2, f3, f4, false, 0.0f, 1.0f, 0.0f);
    }

    public static void khth_2(tthz_2 tthz2_2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4, int n) {
        wt_2.bdsh(tthz2_2, class_25612, f, matrix4f, f2, f3, f4, false, 0.0f, 1.0f, 0.0f, n);
    }

    public static void tkth_2(tthz_2 tthz2_2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7) {
        float f8 = 0.05f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        List list = bzsh.ahz(class_25612, bkt.jdh_5.btkh());
        float f11 = f2;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)tthz2_2.nh_2());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)bthd_2);
        class_59442.method_34582("Range").method_1251(tthz2_2.dhh_5().range());
        class_59442.method_34582("Thickness").method_1251(f8);
        class_59442.method_34582("Smoothness").method_1251(0.57f);
        class_59442.method_34582("EnableFadeout").method_35649(bl ? 1 : 0);
        class_59442.method_34582("FadeoutStart").method_1251(f5);
        class_59442.method_34582("FadeoutEnd").method_1251(f6);
        Vector4f vector4f = new Vector4f(f2, 0.0f, 0.0f, 1.0f).mul((Matrix4fc)matrix4f);
        Vector4f vector4f2 = new Vector4f(f2 + f7, 0.0f, 0.0f, 1.0f).mul((Matrix4fc)matrix4f);
        class_59442.method_34582("TextPosX").method_1251(vector4f.x);
        class_59442.method_34582("MaxWidth").method_1251(vector4f2.x - vector4f.x);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (tl tl2 : list) {
            tthz2_2.zad_6(matrix4f, (class_4588)class_2872, tl2.text(), f, f8 * 0.5f * f, f10 - 0.3f, f11 - 0.75f, f3 + f * 0.7f, f4, tl2.color());
            f11 += tthz2_2.dht_10(tl2.text(), f);
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void bdsh(tthz_2 tthz2_2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7, int n) {
        float f8 = 0.05f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        List list = bzsh.ahz(class_25612, bkt.jdh_5.btkh());
        float f11 = f2;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)tthz2_2.nh_2());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)bthd_2);
        class_59442.method_34582("Range").method_1251(tthz2_2.dhh_5().range());
        class_59442.method_34582("Thickness").method_1251(f8);
        class_59442.method_34582("Smoothness").method_1251(0.57f);
        class_59442.method_34582("EnableFadeout").method_35649(bl ? 1 : 0);
        class_59442.method_34582("FadeoutStart").method_1251(f5);
        class_59442.method_34582("FadeoutEnd").method_1251(f6);
        Vector4f vector4f = new Vector4f(f2, 0.0f, 0.0f, 1.0f).mul((Matrix4fc)matrix4f);
        Vector4f vector4f2 = new Vector4f(f2 + f7, 0.0f, 0.0f, 1.0f).mul((Matrix4fc)matrix4f);
        class_59442.method_34582("TextPosX").method_1251(vector4f.x);
        class_59442.method_34582("MaxWidth").method_1251(vector4f2.x - vector4f.x);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (tl tl2 : list) {
            int n2 = tl2.color();
            if (n != 255) {
                n2 = n2 & 0xFFFFFF | (n & 0xFF) << 24;
            }
            tthz2_2.zad_6(matrix4f, (class_4588)class_2872, tl2.text(), f, f8 * 0.5f * f, f10 - 0.3f, f11 - 0.75f, f3 + f * 0.7f, f4, n2);
            f11 += tthz2_2.dht_10(tl2.text(), f);
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void dsd_6(tthz_2 tthz2_2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6) {
        float f7 = tthz2_2.zml(class_25612, f) * 2.0f;
        wt_2.tkth_2(tthz2_2, class_25612, f, matrix4f, f2, f3, f4, bl, f5, f6, f7);
    }

    public static void zhh_4(tthz_2 tthz2_2, String string, float f, bsw_2 bsw2, Matrix4f matrix4f, float f2, float f3, float f4) {
        wt_2.dzs_2(tthz2_2, string, f, bsw2, matrix4f, f2, f3, f4, false, 0.0f, 1.0f, 0.0f);
    }

    public static void dzs_2(tthz_2 tthz2_2, String string, float f, bsw_2 bsw2, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7) {
        string = string.replace("і", "i").replace("І", "I");
        float f8 = 0.05f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)tthz2_2.nh_2());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)bthd_2);
        class_59442.method_34582("Range").method_1251(tthz2_2.dhh_5().range());
        class_59442.method_34582("Thickness").method_1251(f8);
        class_59442.method_34582("Smoothness").method_1251(0.57f);
        class_59442.method_34582("EnableFadeout").method_35649(bl ? 1 : 0);
        class_59442.method_34582("FadeoutStart").method_1251(f5);
        class_59442.method_34582("FadeoutEnd").method_1251(f6);
        class_59442.method_34582("MaxWidth").method_1251(f7);
        class_59442.method_34582("TextPosX").method_1251(f2);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        tthz2_2.thdha_2(matrix4f, (class_4588)class_2872, string, f, f8 * 0.5f * f, f10, f2 - 0.75f, f3 + f * 0.7f, f4, bsw2);
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void ththd_2(tthz_2 tthz2_2, String string, float f, bsw_2 bsw2, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6) {
        float f7 = tthz2_2.dht_10(string, f) * 2.0f;
        wt_2.dzs_2(tthz2_2, string, f, bsw2, matrix4f, f2, f3, f4, bl, f5, f6, f7);
    }

    @Generated
    private wt_2() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] c3dtozjh(String string) {
        return string.split("\u0005\u000f", -1);
    }

    private static CallSite md3nbait6xmz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ o9fs4leqj9tws ^ string.hashCode() ^ n2 + zpshkwg + i * -1601559753) + o9fs4leqj9tws) ^ zpshkwg));
            }
            String[] stringArray = wt_2.c3dtozjh(new String(cArray));
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

