/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_279
 *  net.minecraft.class_283
 *  net.minecraft.class_284
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  net.minecraft.class_5944
 *  net.minecraft.class_757
 *  net.minecraft.class_9922
 *  net.minecraft.class_9960
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_279;
import net.minecraft.class_283;
import net.minecraft.class_284;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_5944;
import net.minecraft.class_757;
import net.minecraft.class_9922;
import net.minecraft.class_9960;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.bl_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.kth;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.PostEffectProcessorAccessor;
import us.movy.moondlc.mixin.accessors.ShaderProgramAccessor;

public final class thr_3
implements tthy {
    private static final thr_3 INSTANCE;
    private static final class_2960 ttz_2;
    private static final int bnw = 4;
    private static final int dhhd_2 = 96;
    private static final float rkhl = 1.5f;
    private static final long tzm = 10000000000L;
    private static final Set raz;
    private final Matrix4f tzq = new Matrix4f();
    private final Matrix4f zmkh = new Matrix4f();
    private final Vector3f sthj_2 = new Vector3f();
    private final Matrix4f sdk_2 = new Matrix4f();
    private final Matrix4f dhydh = new Matrix4f();
    private final Vector3f hfw = new Vector3f();
    private class_279 blsh;
    private Map dhqs = Map.of();
    private class_9922 jjj;
    private long dhdm;
    private long ws_2 = Long.MIN_VALUE;
    private float dj;
    private boolean dhtd_2;
    private static final int h0zgsusct3l4 = 1819856803;
    private static final int lny48xu4yyux5 = 1429162467;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int b253y9wyg8nwzk;

    private thr_3() {
    }

    public static thr_3 swd_4() {
        return INSTANCE;
    }

    public void skhs_4(class_9922 class_99222, Matrix4f matrix4f, Matrix4f matrix4f2, class_4184 class_41842, class_757 class_7572) {
        bl_2 bl2_2 = bl_2.sygh_2();
        if (bl2_2 == null || !bl2_2.rgha_2()) {
            this.zsr();
            return;
        }
        this.jjj = class_99222;
        this.sdk_2.set((Matrix4fc)matrix4f);
        this.dhydh.set((Matrix4fc)matrix4f2);
        thr_3.zay(this.hfw, class_41842);
    }

    public void srn_2(class_9922 class_99222, Matrix4f matrix4f, Matrix4f matrix4f2, class_4184 class_41842, class_757 class_7572) {
        bl_2 bl2_2 = bl_2.sygh_2();
        if (bl2_2 == null || !bl2_2.rgha_2()) {
            this.zsr();
            return;
        }
        this.jjj = class_99222;
        if (!this.dhtd_2) {
            this.jth_4(matrix4f, matrix4f2, class_41842);
            this.dhtd_2 = true;
            return;
        }
        this.qsh(bl2_2);
        this.jth_4(matrix4f, matrix4f2, class_41842);
    }

    public void zfd_4() {
        this.blsh = null;
        this.dhqs = Map.of();
        this.zsr();
    }

    private void qsh(bl_2 bl2_2) {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.field_1687 == null || class_3102.field_1724 == null || this.jjj == null) {
            return;
        }
        if (!class_3102.field_1690.method_31044().method_31034() && !bl2_2.jzd().shzl()) {
            return;
        }
        float f = bl2_2.dkf_2().thw_5();
        if (f <= 0.0f) {
            return;
        }
        int n = class_3102.method_22683().method_4489();
        int n2 = class_3102.method_22683().method_4506();
        if (n <= 0 || n2 <= 0) {
            return;
        }
        class_279 class_2792 = this.rthd_2(class_3102);
        if (class_2792 == null) {
            return;
        }
        this.jwa();
        float f2 = this.ajh_2(bl2_2, f);
        int n3 = Math.clamp((long)((int)bl2_2.shdm().thw_5()), 4, 96);
        Matrix4f matrix4f = new Matrix4f((Matrix4fc)this.dhydh).invert();
        Matrix4f matrix4f2 = new Matrix4f((Matrix4fc)this.sdk_2).invert();
        this.daj_3("mvInverse", matrix4f2);
        this.daj_3("projInverse", matrix4f);
        this.daj_3("prevModelView", this.tzq);
        this.daj_3("prevProjection", this.zmkh);
        this.thzb("view_res", n, n2);
        this.ghsf_2("cameraPos", this.hfw.x, this.hfw.y, this.hfw.z);
        this.ghsf_2("prevCameraPos", this.sthj_2.x, this.sthj_2.y, this.sthj_2.z);
        this.dkth("BlendFactor", f2);
        this.dhyz("motionBlurSamples", n3);
        this.dhyz("blurAlgorithm", bl2_2.sdht());
        this.dhyz("useDepth", bl2_2.aqh().shzl() ? 1 : 0);
        try {
            class_2792.method_1258(class_3102.method_1522(), this.jjj);
        }
        catch (RuntimeException runtimeException) {
            this.zfd_4();
            this.rtr_2("render", runtimeException);
        }
    }

    private class_279 rthd_2(class_310 class_3102) {
        if (this.blsh != null) {
            return this.blsh;
        }
        try {
            class_279 class_2792 = class_3102.method_62887().method_62941(ttz_2, class_9960.field_53902);
            if (class_2792 == null) {
                this.rtr_2("load", null);
                return null;
            }
            Map map = this.tha_9(class_2792);
            if (!map.keySet().containsAll(raz)) {
                Moondlc.dhrn.error("Motion Blur post effect loaded without all required uniforms: {}", (Object)raz);
                return null;
            }
            this.blsh = class_2792;
            this.dhqs = Map.copyOf(map);
            return this.blsh;
        }
        catch (Exception exception) {
            this.rtr_2("load", exception);
            return null;
        }
    }

    private Map tha_9(class_279 class_2792) {
        HashMap<String, class_284> hashMap = new HashMap<String, class_284>(raz.size());
        for (class_283 class_2832 : ((PostEffectProcessorAccessor)class_2792).getPasses()) {
            class_5944 class_59442 = class_2832.method_62922();
            Map<String, class_284> map = ((ShaderProgramAccessor)class_59442).getUniformsByName();
            for (String string : raz) {
                class_284 class_2842 = map.get(string);
                if (class_2842 == null) continue;
                hashMap.putIfAbsent(string, class_2842);
            }
        }
        return hashMap;
    }

    private void jwa() {
        long l = System.nanoTime();
        if (this.dhdm != 0L) {
            float f = (float)(l - this.dhdm) / 1.0E9f;
            this.dj = f > 0.0f && f < 1.0f ? 1.0f / f : 0.0f;
        }
        this.dhdm = l;
    }

    private float ajh_2(bl_2 bl2_2, float f) {
        if (!bl2_2.zdm().shzl()) {
            return f;
        }
        kth.zma_2();
        int n = Math.max(1, kth.tat_6());
        float f2 = Math.clamp(this.dj / (float)n, 1.0f, 1.5f);
        return f * f2;
    }

    private void jth_4(Matrix4f matrix4f, Matrix4f matrix4f2, class_4184 class_41842) {
        this.tzq.set((Matrix4fc)matrix4f);
        this.zmkh.set((Matrix4fc)matrix4f2);
        thr_3.zay(this.sthj_2, class_41842);
    }

    private static void zay(Vector3f vector3f, class_4184 class_41842) {
        if (class_41842 == null || class_41842.method_19326() == null) {
            vector3f.zero();
            return;
        }
        vector3f.set((float)(class_41842.method_19326().field_1352 % 30000.0), (float)(class_41842.method_19326().field_1351 % 30000.0), (float)(class_41842.method_19326().field_1350 % 30000.0));
    }

    private void zsr() {
        this.dhtd_2 = false;
        this.dhdm = 0L;
        this.dj = 0.0f;
    }

    private void daj_3(String string, Matrix4f matrix4f) {
        class_284 class_2842 = (class_284)this.dhqs.get(string);
        if (class_2842 != null) {
            class_2842.method_1250(matrix4f);
        }
    }

    private void thzb(String string, float f, float f2) {
        class_284 class_2842 = (class_284)this.dhqs.get(string);
        if (class_2842 != null) {
            class_2842.method_1255(f, f2);
        }
    }

    private void ghsf_2(String string, float f, float f2, float f3) {
        class_284 class_2842 = (class_284)this.dhqs.get(string);
        if (class_2842 != null) {
            class_2842.method_1249(f, f2, f3);
        }
    }

    private void dkth(String string, float f) {
        class_284 class_2842 = (class_284)this.dhqs.get(string);
        if (class_2842 != null) {
            class_2842.method_1251(f);
        }
    }

    private void dhyz(String string, int n) {
        class_284 class_2842 = (class_284)this.dhqs.get(string);
        if (class_2842 != null) {
            class_2842.method_35649(n);
        }
    }

    private void rtr_2(String string, Exception exception) {
        long l = System.nanoTime();
        if (l - this.ws_2 < 10000000000L) {
            return;
        }
        this.ws_2 = l;
        if (exception == null) {
            Moondlc.dhrn.error("Motion Blur post effect could not {} because the shader pipeline returned no processor.", (Object)string);
        } else {
            Moondlc.dhrn.error("Motion Blur post effect failed to {}. It will retry safely.", (Object)string, (Object)exception);
        }
    }

    private static String[] zrtgdd0gzb(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite dohtwptbkisj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ h0zgsusct3l4 ^ string.hashCode() ^ n2 + lny48xu4yyux5 + i * 855192519) + h0zgsusct3l4) ^ lny48xu4yyux5));
            }
            String[] stringArray = thr_3.zrtgdd0gzb(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

