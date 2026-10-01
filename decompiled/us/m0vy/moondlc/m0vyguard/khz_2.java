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
import us.m0vy.moondlc.m0vyguard.bmt_2;
import us.m0vy.moondlc.m0vyguard.tkhr;
import us.m0vy.moondlc.m0vyguard.dhsh_5;

public class khz_2
extends bmt_2 {
    private final dhsh_5 zhs_2 = tkhr.zqsh;
    private float shzl_2 = 0.5f;
    private static final int xpx1lppw0nhw7 = -482331986;
    private static final int nho9wqnmanlpw = -939121259;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int qfsezuox1kt;

    public khz_2() {
        super(class_290.field_1576);
    }

    public khz_2 thda_3(float f) {
        this.shzl_2 = f;
        return this;
    }

    @Override
    public void sw_2() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        this.zhs_2.rtth();
        this.zhs_2.zhd_5("Smoothness").method_1251(this.shzl_2);
        class_9801 class_98012 = this.ttgh().method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        if (sbgh == this) {
            sbgh = null;
        }
    }

    public void rad(Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        this.zhs_2.zhd_5("Size").method_1255(f3, f4);
        this.zhs_2.zhd_5("Radius").method_35657(f5, f6, f7, f8);
        float f9 = -this.shzl_2 / 2.0f + this.shzl_2 * 2.0f;
        float f10 = this.shzl_2 / 2.0f + this.shzl_2;
        float f11 = f - f9 / 2.0f;
        float f12 = f2 - f10 / 2.0f;
        float f13 = f3 + f9;
        float f14 = f4 + f10;
        this.ttgh().method_22918(matrix4f, f11, f12, 0.0f).method_39415(n);
        this.ttgh().method_22918(matrix4f, f11, f12 + f14, 0.0f).method_39415(n);
        this.ttgh().method_22918(matrix4f, f11 + f13, f12 + f14, 0.0f).method_39415(n);
        this.ttgh().method_22918(matrix4f, f11 + f13, f12, 0.0f).method_39415(n);
    }

    private static String[] qsrod554(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite l7stn55qq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ xpx1lppw0nhw7 ^ string.hashCode() ^ n2 + nho9wqnmanlpw ^ i * 1912577585 ^ xpx1lppw0nhw7, 16) ^ nho9wqnmanlpw));
            }
            String[] stringArray = khz_2.qsrod554(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

