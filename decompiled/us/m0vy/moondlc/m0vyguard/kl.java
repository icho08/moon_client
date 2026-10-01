/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10156
 *  net.minecraft.class_286
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
import java.util.Map;
import net.minecraft.class_10156;
import net.minecraft.class_286;
import net.minecraft.class_4588;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bqw;
import us.m0vy.moondlc.m0vyguard.bwm;
import us.m0vy.moondlc.m0vyguard.tbh;

public final class kl {
    private static final Map skhl;
    private static boolean thbw;
    private static final int vejiel77 = -2069707567;
    private static final int pys8vp4c87sja = -927936045;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kj6hhn4xdxx;

    public static void ghdhsh() {
        if (!thbw) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();
            thbw = true;
        }
    }

    public static void hat_3(bqw bqw2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6) {
        int n2;
        bwm bwm2;
        if (!thbw) {
            kl.ghdhsh();
        }
        if ((bwm2 = (bwm)skhl.get(n2 = bqw2.zas())) == null) {
            bwm2 = new bwm(bqw2);
            skhl.put(n2, bwm2);
            RenderSystem.setShaderTexture((int)0, (int)bqw2.zas());
            class_5944 class_59442 = RenderSystem.setShader((class_10156)tbh.hab);
            class_59442.method_34582("Range").method_1251(bqw2.dhksh().range());
            class_59442.method_34582("Thickness").method_1251(f5);
            class_59442.method_34582("Smoothness").method_1251(0.5f);
            class_59442.method_34582("EnableFadeout").method_35649(0);
            bwm2.zddh = true;
        }
        bqw2.zkhkh(matrix4f, (class_4588)bwm2.zkh_4, string, f, f5 * 0.5f * f, f6, f2 - 0.75f, f3 + f * 0.7f, f4, n);
    }

    public static void hhj_2(bqw bqw2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        class_5944 class_59442;
        int n2;
        bwm bwm2;
        if (!thbw) {
            kl.ghdhsh();
        }
        if ((bwm2 = (bwm)skhl.get(n2 = bqw2.zas())) == null) {
            bwm2 = new bwm(bqw2);
            skhl.put(n2, bwm2);
            RenderSystem.setShaderTexture((int)0, (int)bqw2.zas());
            class_59442 = RenderSystem.setShader((class_10156)tbh.hab);
            class_59442.method_34582("Range").method_1251(bqw2.dhksh().range());
            class_59442.method_34582("Thickness").method_1251(f5);
            class_59442.method_34582("Smoothness").method_1251(0.5f);
            bwm2.zddh = true;
        }
        class_59442 = RenderSystem.getShader();
        class_59442.method_34582("EnableFadeout").method_35649(1);
        class_59442.method_34582("FadeoutStart").method_1251(f7);
        class_59442.method_34582("FadeoutEnd").method_1251(f8);
        class_59442.method_34582("MaxWidth").method_1251(f9);
        class_59442.method_34582("TextPosX").method_1251(f10);
        bqw2.zkhkh(matrix4f, (class_4588)bwm2.zkh_4, string, f, f5 * 0.5f * f, f6, f2 - 0.75f, f3 + f * 0.7f, f4, n);
    }

    public static void taa_8() {
        if (thbw) {
            for (bwm bwm2 : skhl.values()) {
                class_9801 class_98012 = bwm2.zkh_4.method_60794();
                if (class_98012 == null) continue;
                class_286.method_43433((class_9801)class_98012);
            }
            RenderSystem.setShaderTexture((int)0, (int)0);
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            skhl.clear();
            thbw = false;
        }
    }

    private static String[] g8dpuctmah86mr(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yydjpxnh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ vejiel77 ^ string.hashCode() ^ n2 + pys8vp4c87sja + i * 1447431257) + vejiel77) ^ pys8vp4c87sja));
            }
            String[] stringArray = kl.g8dpuctmah86mr(new String(cArray));
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

