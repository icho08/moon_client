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
import us.m0vy.moondlc.m0vyguard.takh;
import us.m0vy.moondlc.m0vyguard.dt_2;
import us.m0vy.moondlc.m0vyguard.zn_2;

public final class bth_2 {
    private static final Map tqgh;
    private static boolean trkh;
    private static final int r7sytln5 = -868579858;
    private static final int k2od2co4 = -436756938;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qj20yxhg;

    public static void rnsh() {
        if (!trkh) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();
            trkh = true;
        }
    }

    public static void sfs_2(zn_2 zn2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6) {
        int n2;
        takh takh2;
        if (!trkh) {
            bth_2.rnsh();
        }
        if ((takh2 = (takh)tqgh.get(n2 = zn2.khnk())) == null) {
            takh2 = new takh(zn2);
            tqgh.put(n2, takh2);
            RenderSystem.setShaderTexture((int)0, (int)zn2.khnk());
            class_5944 class_59442 = RenderSystem.setShader((class_10156)dt_2.jsr_2);
            class_59442.method_34582("Range").method_1251(zn2.dhz_10().range());
            class_59442.method_34582("Thickness").method_1251(f5);
            class_59442.method_34582("Smoothness").method_1251(0.5f);
            class_59442.method_34582("EnableFadeout").method_35649(0);
            takh2.dkgh = true;
        }
        zn2.thzkh(matrix4f, (class_4588)takh2.thr, string, f, f5 * 0.5f * f, f6, f2 - 0.75f, f3 + f * 0.7f, f4, n);
    }

    public static void szs_3(zn_2 zn2, String string, float f, int n, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        class_5944 class_59442;
        int n2;
        takh takh2;
        if (!trkh) {
            bth_2.rnsh();
        }
        if ((takh2 = (takh)tqgh.get(n2 = zn2.khnk())) == null) {
            takh2 = new takh(zn2);
            tqgh.put(n2, takh2);
            RenderSystem.setShaderTexture((int)0, (int)zn2.khnk());
            class_59442 = RenderSystem.setShader((class_10156)dt_2.jsr_2);
            class_59442.method_34582("Range").method_1251(zn2.dhz_10().range());
            class_59442.method_34582("Thickness").method_1251(f5);
            class_59442.method_34582("Smoothness").method_1251(0.5f);
            takh2.dkgh = true;
        }
        class_59442 = RenderSystem.getShader();
        class_59442.method_34582("EnableFadeout").method_35649(1);
        class_59442.method_34582("FadeoutStart").method_1251(f7);
        class_59442.method_34582("FadeoutEnd").method_1251(f8);
        class_59442.method_34582("MaxWidth").method_1251(f9);
        class_59442.method_34582("TextPosX").method_1251(f10);
        zn2.thzkh(matrix4f, (class_4588)takh2.thr, string, f, f5 * 0.5f * f, f6, f2 - 0.75f, f3 + f * 0.7f, f4, n);
    }

    public static void rat_3() {
        if (trkh) {
            for (takh takh2 : tqgh.values()) {
                class_9801 class_98012 = takh2.thr.method_60794();
                if (class_98012 == null) continue;
                class_286.method_43433((class_9801)class_98012);
            }
            RenderSystem.setShaderTexture((int)0, (int)0);
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            tqgh.clear();
            trkh = false;
        }
    }

    private static String[] q4rofwb6(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite iddnznt4ygvss(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ r7sytln5 ^ string.hashCode()) + (n2 + k2od2co4) + i ^ r7sytln5, 26) + k2od2co4);
            }
            String[] stringArray = bth_2.q4rofwb6(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

