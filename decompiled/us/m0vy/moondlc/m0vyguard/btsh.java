/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import us.m0vy.moondlc.m0vyguard.tthy;

public final class btsh
implements tthy {
    private static Matrix4f bksh;
    private static Matrix4f sthy_2;
    private static final int c7fgf6w7 = -106893569;
    private static final int ecjgnqg6rq4 = 169394062;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s516i5989gl;

    public static void jqq(Matrix4f matrix4f, Matrix4f matrix4f2) {
        bksh = new Matrix4f((Matrix4fc)matrix4f);
        sthy_2 = new Matrix4f((Matrix4fc)matrix4f2);
    }

    public static class_241 zgha_4(class_243 class_2432) {
        if (class_2432 != null && bksh != null && sthy_2 != null && btsh.mc.field_1724 != null && btsh.mc.field_1773 != null) {
            class_4184 class_41842 = btsh.mc.field_1773.method_19418();
            class_243 class_2433 = class_2432.method_1020(class_41842.method_19326());
            Vector4f vector4f = new Vector4f((float)class_2433.field_1352, (float)class_2433.field_1351, (float)class_2433.field_1350, 1.0f);
            vector4f.mul((Matrix4fc)bksh).mul((Matrix4fc)sthy_2);
            if (vector4f.w <= 0.0f) {
                return null;
            }
            Vector4f vector4f2 = vector4f.div(vector4f.w);
            float f = (vector4f2.x + 1.0f) / 2.0f * (float)mc.method_22683().method_4486();
            float f2 = (1.0f - vector4f2.y) / 2.0f * (float)mc.method_22683().method_4502();
            return Float.isFinite(f) && Float.isFinite(f2) ? new class_241(f, f2) : null;
        }
        return null;
    }

    public static class_243 zghz_4(class_1297 class_12972, float f) {
        return new class_243(class_3532.method_16436((double)f, (double)class_12972.field_6014, (double)class_12972.method_23317()), class_3532.method_16436((double)f, (double)class_12972.field_6036, (double)class_12972.method_23318()), class_3532.method_16436((double)f, (double)class_12972.field_5969, (double)class_12972.method_23321()));
    }

    public static class_243 ays(class_243 class_2432, class_243 class_2433, float f) {
        return new class_243(class_3532.method_16436((double)f, (double)class_2432.field_1352, (double)class_2433.method_10216()), class_3532.method_16436((double)f, (double)class_2432.field_1351, (double)class_2433.method_10214()), class_3532.method_16436((double)f, (double)class_2432.field_1350, (double)class_2433.method_10215()));
    }

    @Generated
    private btsh() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] if7q4p6ujn07h(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite o9bf1m4dbln(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ c7fgf6w7 ^ string.hashCode()) + (n2 + ecjgnqg6rq4) + i ^ c7fgf6w7, 12) + ecjgnqg6rq4);
            }
            String[] stringArray = btsh.if7q4p6ujn07h(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

