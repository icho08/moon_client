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

public class tsgh
extends tjd_2 {
    private final fth jkhz_2 = bdht.sthgh;
    private float sdy = 0.5f;
    private static final int o2ldwwn2srb = 1941477676;
    private static final int ub7549jq10yo = -606684989;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ppyu71mhvgemj2;

    public tsgh() {
        super(class_290.field_1576);
    }

    public tsgh sds_5(float f) {
        this.sdy = f;
        return this;
    }

    @Override
    public void jbn() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        this.jkhz_2.aghl();
        this.jkhz_2.rthw("Smoothness").method_1251(this.sdy);
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

    public void dldh(Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        this.jkhz_2.rthw("Size").method_1255(f3, f4);
        this.jkhz_2.rthw("Radius").method_35657(f5, f6, f7, f8);
        float f9 = -this.sdy / 2.0f + this.sdy * 2.0f;
        float f10 = this.sdy / 2.0f + this.sdy;
        float f11 = f - f9 / 2.0f;
        float f12 = f2 - f10 / 2.0f;
        float f13 = f3 + f9;
        float f14 = f4 + f10;
        this.dzj().method_22918(matrix4f, f11, f12, 0.0f).method_39415(n);
        this.dzj().method_22918(matrix4f, f11, f12 + f14, 0.0f).method_39415(n);
        this.dzj().method_22918(matrix4f, f11 + f13, f12 + f14, 0.0f).method_39415(n);
        this.dzj().method_22918(matrix4f, f11 + f13, f12, 0.0f).method_39415(n);
    }

    private static String[] bjkavpgn(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wawp9zdwisxax(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ o2ldwwn2srb ^ string.hashCode() ^ n2 + ub7549jq10yo ^ i * -1206931801 ^ o2ldwwn2srb, 10) ^ ub7549jq10yo));
            }
            String[] stringArray = tsgh.bjkavpgn(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

