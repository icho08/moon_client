/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1921
 *  net.minecraft.class_1921$class_4688
 *  net.minecraft.class_290
 *  net.minecraft.class_291
 *  net.minecraft.class_293
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4588
 *  net.minecraft.class_4668
 *  net.minecraft.class_4668$class_4683
 *  net.minecraft.class_4668$class_5939
 *  net.minecraft.class_4668$class_5942
 *  net.minecraft.class_9851
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
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_291;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4588;
import net.minecraft.class_4668;
import net.minecraft.class_9851;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tt_4;

public final class bwz {
    private static final float khd_2 = 100.0f;
    private static final int thssh = 1536;
    private static final Map rkt;
    private static final Map thrz_2;
    private static class_291 jdkh;
    private static final int gqsab62xccr = 959744254;
    private static final int mzd3dmz4j = -1346419117;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lnycvyct3n;

    public static void tdm_4(class_2960 class_29602, byq byq2) {
        if (class_29602 != null && byq2 != null) {
            bwz.wh_2();
            RenderSystem.setShaderColor((float)(byq2.sbk() / 255.0f), (float)(byq2.srl() / 255.0f), (float)(byq2.shsl_2() / 255.0f), (float)(byq2.tzdh_2() / 255.0f));
            jdkh.method_65176(rkt.computeIfAbsent(class_29602, bwz::ghrt));
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    public static void zwt(tt_4 tt2, byq byq2, float f, float f2) {
        if (tt2 != null && byq2 != null) {
            bwz.wh_2();
            tt2.khthdh(f, byq2);
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)Math.max(0.0f, Math.min(1.0f, f2)));
            jdkh.method_65176(thrz_2.computeIfAbsent(tt2, bwz::jzt));
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    public static void thwa(tt_4 tt2) {
        if (tt2 != null) {
            thrz_2.put(tt2, bwz.jzt(tt2));
        }
    }

    public static void zwt_2() {
        if (jdkh != null && !jdkh.method_43444()) {
            jdkh.close();
        }
        jdkh = null;
        rkt.clear();
        thrz_2.clear();
    }

    private static void wh_2() {
        if (jdkh == null || jdkh.method_43444()) {
            jdkh = class_291.method_65175((class_293.class_5596)class_293.class_5596.field_27382, (class_293)class_290.field_1575, bwz::dhss_4);
        }
    }

    private static class_1921 ghrt(class_2960 class_29602) {
        return class_1921.method_24049((String)"moondlc_skybox", (class_293)class_290.field_1575, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)false, (boolean)false, (class_1921.class_4688)class_1921.class_4688.method_23598().method_34578(class_4668.field_53128).method_34577((class_4668.class_5939)new class_4668.class_4683(class_29602, class_9851.field_52395, false)).method_23615(class_4668.field_21370).method_23603(class_4668.field_21345).method_23616(class_4668.field_21350).method_23617(false));
    }

    private static class_1921 jzt(tt_4 tt2) {
        return class_1921.method_24049((String)"moondlc_skybox_shader", (class_293)class_290.field_1575, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)false, (boolean)false, (class_1921.class_4688)class_1921.class_4688.method_23598().method_34578((class_4668.class_5942)tt2.zzk_3()).method_23615(class_4668.field_21370).method_23603(class_4668.field_21345).method_23616(class_4668.field_21350).method_23617(false));
    }

    private static void dhss_4(class_4588 class_45882) {
        float f = 100.0f;
        bwz.bjj(class_45882, 1, -f, f, -f, -f, f, f, f, f, f, f, f, -f);
        bwz.bjj(class_45882, 0, -f, -f, f, -f, -f, -f, f, -f, -f, f, -f, f);
        bwz.bjj(class_45882, 2, f, f, -f, f, -f, -f, -f, -f, -f, -f, f, -f);
        bwz.bjj(class_45882, 4, -f, f, f, -f, -f, f, f, -f, f, f, f, f);
        bwz.bjj(class_45882, 3, -f, f, -f, -f, -f, -f, -f, -f, f, -f, f, f);
        bwz.bjj(class_45882, 5, f, f, f, f, -f, f, f, -f, -f, f, f, -f);
    }

    private static void bjj(class_4588 class_45882, int n, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        int n2 = n % 3;
        int n3 = n / 3;
        float f13 = (float)n2 / 3.0f;
        float f14 = (float)(n2 + 1) / 3.0f;
        float f15 = (float)n3 / 2.0f;
        float f16 = (float)(n3 + 1) / 2.0f;
        Matrix4f matrix4f = new Matrix4f();
        class_45882.method_22918(matrix4f, f, f2, f3).method_22913(f13, f15).method_39415(-1);
        class_45882.method_22918(matrix4f, f4, f5, f6).method_22913(f13, f16).method_39415(-1);
        class_45882.method_22918(matrix4f, f7, f8, f9).method_22913(f14, f16).method_39415(-1);
        class_45882.method_22918(matrix4f, f10, f11, f12).method_22913(f14, f15).method_39415(-1);
    }

    private bwz() {
    }

    private static String[] hrqqc4lg(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite u82yn30avdls47(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ gqsab62xccr ^ string.hashCode() ^ n2 + mzd3dmz4j + i * -150110721) + gqsab62xccr) ^ mzd3dmz4j));
            }
            String[] stringArray = bwz.hrqqc4lg(new String(cArray));
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

