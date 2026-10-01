/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_286
 *  net.minecraft.class_290
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
import net.minecraft.class_286;
import net.minecraft.class_290;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.tjd_2;
import us.m0vy.moondlc.m0vyguard.fth;

public class bfz
extends tjd_2 {
    private final fth haj_2 = bdht.ghrdh();
    private final float zzk = 0.5f;
    private final float rrt_2;
    private static final int wtp9m2w0okgz = -1185771945;
    private static final int h37qgyp = -1164665976;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ab6d23m1;

    public bfz(float f) {
        super(class_290.field_1576);
        this.rrt_2 = f;
    }

    @Override
    public void jbn() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        this.haj_2.aghl();
        this.haj_2.rthw("Smoothness").method_1251(0.5f);
        this.haj_2.rthw("CornerSmoothness").method_1251(this.rrt_2);
        class_9801 class_98012 = this.dzj().method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        if (khsj == this) {
            khsj = null;
        }
    }

    public void dth_3(Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        this.haj_2.rthw("Size").method_1255(f3, f4);
        this.haj_2.rthw("Radius").method_35657(f5, f6, f7, f8);
        float f9 = 0.75f;
        float f10 = 0.75f;
        float f11 = f - f9 / 2.0f;
        float f12 = f2 - f10 / 2.0f;
        float f13 = f3 + f9;
        float f14 = f4 + f10;
        this.dzj().method_22918(matrix4f, f11, f12, 0.0f).method_39415(n);
        this.dzj().method_22918(matrix4f, f11, f12 + f14, 0.0f).method_39415(n);
        this.dzj().method_22918(matrix4f, f11 + f13, f12 + f14, 0.0f).method_39415(n);
        this.dzj().method_22918(matrix4f, f11 + f13, f12, 0.0f).method_39415(n);
    }

    private static String[] mp77gkhk8qe(String string) {
        return string.split("\u0005\u000e", -1);
    }

    private static CallSite jtvp9a5j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wtp9m2w0okgz ^ string.hashCode() ^ n2 + h37qgyp + i * -1984947501) + wtp9m2w0okgz) ^ h37qgyp));
            }
            String[] stringArray = bfz.mp77gkhk8qe(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

