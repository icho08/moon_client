/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_276
 *  net.minecraft.class_284
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_5944
 *  net.minecraft.class_6367
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
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_276;
import net.minecraft.class_284;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_5944;
import net.minecraft.class_6367;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dhsh_5;
import us.m0vy.moondlc.m0vyguard.fsh;
import us.m0vy.moondlc.m0vyguard.lq;

public class wz_2
implements dl {
    private static final dhsh_5 ztw;
    private static final dhsh_5 rz_2;
    public static final List jsh_2;
    private static boolean thagh_2;
    private static int shsb;
    private static final int oikxzl8d = 1286028486;
    private static final int z5jpjm6o4wm1x = 889573294;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int osbhc2rccz2;

    public static void tdhh() {
        if (!thagh_2) {
            wz_2.ththkh();
            thagh_2 = true;
        }
        fsh.sdhy_2().jkhh_2(new lq(wz_2::zzl_2));
    }

    private static void ththkh() {
        jsh_2.forEach(class_276::method_1238);
        jsh_2.clear();
        int n = bza_4.lw();
        for (int i = 0; i <= n; ++i) {
            jsh_2.add(wz_2.ghdhn(i));
        }
        shsb = n;
    }

    public static void sly_2() {
        wz_2.ththkh();
    }

    public static void skr(class_4587 class_45872) {
        int n;
        if (bza_4.atm() == 1.0f && !bza_4.aar()) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.method_1522() == null) {
            return;
        }
        if (jsh_2.isEmpty()) {
            return;
        }
        int n2 = bza_4.lw();
        if (n2 != shsb) {
            wz_2.ththkh();
        }
        int n3 = jsh_2.size() - 1;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f = bza_4.saz_7();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        wz_2.sfh_2(matrix4f, rz_2, class_3102.method_1522(), (class_276)jsh_2.get(0), f, 0, n3);
        for (n = 0; n < n3; ++n) {
            wz_2.sfh_2(matrix4f, rz_2, (class_276)jsh_2.get(n), (class_276)jsh_2.get(n + 1), f, n + 1, n3);
        }
        for (n = n3; n > 0; --n) {
            wz_2.sfh_2(matrix4f, ztw, (class_276)jsh_2.get(n), (class_276)jsh_2.get(n - 1), f, n, n3);
        }
        class_3102.method_1522().method_1235(true);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
    }

    private static void sfh_2(Matrix4f matrix4f, dhsh_5 dhsh2, class_276 class_2762, class_276 class_2763, float f, int n, int n2) {
        class_2763.method_1235(true);
        RenderSystem.setShaderTexture((int)0, (int)class_2762.method_30277());
        class_5944 class_59442 = dhsh2.rtth();
        if (class_59442 == null) {
            return;
        }
        float f2 = class_2762.field_1482 > 0 ? 0.5f / (float)class_2762.field_1482 : 0.0f;
        float f3 = class_2762.field_1481 > 0 ? 0.5f / (float)class_2762.field_1481 : 0.0f;
        class_284 class_2842 = dhsh2.zhd_5("uHalfTexelSize");
        if (class_2842 != null) {
            class_2842.method_1255(f2, f3);
        }
        float f4 = n2 > 0 ? f * (float)n / (float)n2 : 0.0f;
        class_284 class_2843 = dhsh2.zhd_5("uOffset");
        if (class_2843 != null) {
            class_2843.method_1251(f4);
        }
        wz_2.zly_2(matrix4f);
    }

    private static void zly_2(Matrix4f matrix4f) {
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        class_2872.method_22912(-1.0f, -1.0f, 0.0f);
        class_2872.method_22912(-1.0f, 1.0f, 0.0f);
        class_2872.method_22912(1.0f, 1.0f, 0.0f);
        class_2872.method_22912(1.0f, -1.0f, 0.0f);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private static class_6367 ghdhn(int n) {
        class_310 class_3102 = class_310.method_1551();
        int n2 = 854;
        int n3 = 480;
        if (class_3102 != null && class_3102.method_22683() != null) {
            n2 = class_3102.method_22683().method_4489();
            n3 = class_3102.method_22683().method_4506();
        }
        int n4 = 1 << n + 1;
        class_6367 class_63672 = new class_6367(Math.max(n2 / n4, 1), Math.max(n3 / n4, 1), false);
        class_63672.method_58226(9729);
        return class_63672;
    }

    private static void zzl_2(fsh fsh2) {
        wz_2.ththkh();
    }

    private static String[] h1cxmcvqjdf98(String string) {
        return string.split("\u0003\u001b", -1);
    }

    private static CallSite caykafox9m(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ oikxzl8d ^ string.hashCode()) + (n2 + z5jpjm6o4wm1x) + i ^ oikxzl8d, 7) + z5jpjm6o4wm1x);
            }
            String[] stringArray = wz_2.h1cxmcvqjdf98(new String(cArray));
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

