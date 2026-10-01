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
import us.m0vy.moondlc.m0vyguard.bqw;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.tjsh;
import us.m0vy.moondlc.m0vyguard.tjd_2;
import us.m0vy.moondlc.m0vyguard.tza_2;
import us.m0vy.moondlc.m0vyguard.fr;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public final class tbh {
    public static final class_10156 hab;
    private static final int thh_4 = -1747392404;
    private static final int thyr = 992449866;
    private static final int bmw = -1933678869;
    private static final int thjh_2 = -392589987;
    private static final int pr9ofvyqkh7ea = 344586284;
    private static final int zd9d1ad26 = -1771023146;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int pa6gy0j7wg;

    public static void thal_2(bqw bqw2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4) {
        tbh.an(bqw2, string, f, n, matrix4f, f2, f3, f4, false, 0.0f, 1.0f, 0.0f);
    }

    public static void an(bqw bqw2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7) {
        string = string.replace("і", "i").replace("І", "I");
        float f8 = 0.05f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        tjsh tjsh2 = (tjsh)Moondlc.getInstance().getModuleManager().dfr_2(tjsh.class);
        if (tjsh2.rgha_2()) {
            string = tjsh2.thbw(string);
        }
        if (tjd_2.sz_3() != null) {
            bqw2.zkhkh(matrix4f, (class_4588)tjd_2.sz_3().dzj(), string, f, f8 * 0.5f * f, f10, f2, f3 + f * 0.7f, f4, n);
        } else {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();
            RenderSystem.setShaderTexture((int)0, (int)bqw2.zas());
            class_5944 class_59442 = RenderSystem.setShader((class_10156)hab);
            class_59442.method_34582("Range").method_1251(bqw2.dhksh().range());
            class_59442.method_34582("Thickness").method_1251(f8);
            class_59442.method_34582("Smoothness").method_1251(f9);
            class_59442.method_34582("EnableFadeout").method_35649(bl ? 1 : 0);
            class_59442.method_34582("FadeoutStart").method_1251(f5);
            class_59442.method_34582("FadeoutEnd").method_1251(f6);
            class_59442.method_34582("MaxWidth").method_1251(f7);
            class_59442.method_34582("TextPosX").method_1251(f2);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            bqw2.zkhkh(matrix4f, (class_4588)class_2872, string, f, f8 * 0.5f * f, f10, f2, f3 + f * 0.7f, f4, n);
            class_9801 class_98012 = class_2872.method_60794();
            if (class_98012 != null) {
                class_286.method_43433((class_9801)class_98012);
            }
            RenderSystem.setShaderTexture((int)0, (int)0);
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
        }
    }

    public static void tghd(bqw bqw2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6) {
        float f7 = bqw2.dzh_3(string, f) * 2.0f;
        tbh.an(bqw2, string, f, n, matrix4f, f2, f3, f4, bl, f5, f6, f7);
    }

    public static void dhtgh(bqw bqw2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4) {
        tbh.sah_4(bqw2, class_25612, f, matrix4f, f2, f3, f4, false, 0.0f, 1.0f, 0.0f);
    }

    public static void sah_4(bqw bqw2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7) {
        float f8 = 0.05f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        List list = fr.jhkh_2(class_25612, bhj_2.rrd.rk());
        float f11 = f2;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)bqw2.zas());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)hab);
        class_59442.method_34582("Range").method_1251(bqw2.dhksh().range());
        class_59442.method_34582("Thickness").method_1251(f8);
        class_59442.method_34582("Smoothness").method_1251(f9);
        class_59442.method_34582("EnableFadeout").method_35649(bl ? 1 : 0);
        class_59442.method_34582("FadeoutStart").method_1251(f5);
        class_59442.method_34582("FadeoutEnd").method_1251(f6);
        class_59442.method_34582("MaxWidth").method_1251(f7);
        class_59442.method_34582("TextPosX").method_1251(f2);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (tza_2 tza2_2 : list) {
            bqw2.zkhkh(matrix4f, (class_4588)class_2872, tza2_2.btn_2, f, f8 * 0.5f * f, f10 - 0.3f, f11 - 0.75f, f3 + f * 0.7f, f4, tza2_2.bry);
            f11 += bqw2.dzh_3(tza2_2.btn_2, f);
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void tbk(bqw bqw2, class_2561 class_25612, float f, Matrix4f matrix4f, float f2, float f3, float f4, boolean bl, float f5, float f6) {
        float f7 = bqw2.shar(class_25612, f) * 2.0f;
        tbh.sah_4(bqw2, class_25612, f, matrix4f, f2, f3, f4, bl, f5, f6, f7);
    }

    @Generated
    private tbh() {
        throw new UnsupportedOperationException("This is a util".concat("ity class a").concat("nd cannot b").concat("e instantiated"));
    }

    private static String dhshw(String string, int n, int n2, int n3) {
        try {
            int n4 = -609421215;
            n4 = Integer.rotateLeft(n4 * 496124039, 16) ^ 0x9D0B6408;
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0xD88D85F3;
            if ((n5 ^ n4) != -661813773) {
                int cfr_ignored_0 = (0x3217D92 ^ n4) + 680761008;
            }
            if ((0x2FC & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xB330D754 ^ n2 ^ i * -668699197 ^ thh_4, 14) ^ thyr));
        }
        return new String(cArray);
    }

    private static String[] dhzq_2(String string) {
        block0: {
            int n = -809702820;
            n = Integer.rotateLeft(n * 1851612229, 25) ^ 0x7CCC1618;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 24);
            int n2 = n ^ 0xAAD4FE83;
            if ((n2 ^ n) == -1428881789) break block0;
            int cfr_ignored_0 = (0x656814DF ^ n) + 1973552151;
        }
        return string.split("\b\u0013", -1);
    }

    private static CallSite zzn_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -721303993;
            n3 = Integer.rotateLeft(n3 * 1198956015, 3) ^ 0x8FAF6A6;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 22);
            String string4 = string2;
            n3 = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n3, 24);
            int n4 = n3 ^ 0xFB397A0B;
            if ((n4 ^ n3) != -80119285) {
                int cfr_ignored_0 = (0x2E38BC4C ^ n3) - 1610298281;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bmw ^ string.hashCode()) + (n2 + thjh_2) + i ^ bmw, 5) + thjh_2);
            }
            String[] stringArray = tbh.dhzq_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] yjjtu23t(String string) {
        return string.split("\u0004\u0012", -1);
    }

    private static CallSite rxj2fk2a62mndf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ pr9ofvyqkh7ea ^ string.hashCode() ^ n2 + zd9d1ad26 ^ i * 328027169 ^ pr9ofvyqkh7ea, 21) ^ zd9d1ad26));
            }
            String[] stringArray = tbh.yjjtu23t(new String(cArray));
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

