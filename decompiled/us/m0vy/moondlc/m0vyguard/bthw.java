/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_742
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.dhs_5;
import us.m0vy.moondlc.m0vyguard.yf;

public class bthw
implements tthy {
    private static float zdhj;
    private static float sbt_2;
    private static final int sef2f62 = 494419791;
    private static final int mmvbba5 = -1489380476;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int iww1d0ogul2tpj;

    public static void tnj_2() {
        int n = -1569758321;
        int n2 = (n = Integer.rotateLeft(n * -1286635701, 15) ^ 0x6069CE95) ^ 0xB681BEEC;
        if ((n2 ^ n) != -1233010964) {
            int cfr_ignored_0 = (0x14EEDD63 ^ n) - 168965524;
        }
        dhs_5.dft_3();
    }

    public static void dwy() {
        int n = 194136041;
        int n2 = (n = Integer.rotateLeft(n * 2078087637, 19) ^ 0xEE3B323D) ^ 0x83CE4A82;
        if ((n2 ^ n) != -2083632510) {
            int cfr_ignored_0 = (0x885C0D6B ^ n) + 878704153;
        }
        dhs_5.zlk();
    }

    public static Vector2f daz_7(@NotNull class_243 class_2432) {
        try {
            int n = 158509973;
            n = Integer.rotateLeft(n * -1581200249, 20) ^ 0x1BB116E9;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 15);
            int n2 = n ^ 0xFFA94930;
            if ((n2 ^ n) != -5682896) {
                int cfr_ignored_0 = (0xF6DBE2A5 ^ n) + -1212109361;
            }
            if ((0x17C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bthw.khnj()) {
            throw null;
        }
        return bthw.ragh_2(class_2432.method_10216(), bthw.jghdh(class_2432), class_2432.method_10215());
    }

    public static Vector2f ragh_2(double d, double d2, double d3) {
        block0: {
            int n = -1468290479;
            int n2 = (n = Integer.rotateLeft(n * 1147695559, 9) ^ 0x471AB4CF) ^ 0xF16B09D3;
            if ((n2 ^ n) == -244643373) break block0;
            int cfr_ignored_0 = (0x5910A382 ^ n) + -1538501854;
        }
        return dhs_5.zrb_2(d, d2, d3);
    }

    private static void dhkn(class_742 class_7422, Vector3f vector3f) {
        Quaternionf quaternionf;
        float f = mc.method_61966().method_60637(false);
        float f2 = class_7422.field_53039;
        float f3 = class_7422.field_53038;
        float f4 = f2 - f3;
        float f5 = -(f2 + f4 * f);
        float f6 = class_3532.method_16439((float)f, (float)class_7422.field_7505, (float)class_7422.field_7483);
        float f7 = class_3532.method_15374((float)(f5 * (float)Math.PI)) * f6 * 0.5f;
        float f8 = -Math.abs(class_3532.method_15362((float)(f5 * (float)Math.PI)) * f6);
        float f9 = class_3532.method_15374((float)(f5 * (float)Math.PI)) * f6 * 3.0f;
        float f10 = Math.abs(class_3532.method_15362((float)(f5 * (float)Math.PI - 0.2f)) * f6) * 5.0f;
        float f11 = f9 * ((float)Math.PI / 180);
        float f12 = f10 * ((float)Math.PI / 180);
        if (f11 != 0.0f) {
            quaternionf = new Quaternionf().setAngleAxis(f11, 0.0f, 0.0f, 1.0f).conjugate();
            vector3f.rotate((Quaternionfc)quaternionf);
        }
        if (f12 != 0.0f) {
            quaternionf = new Quaternionf().setAngleAxis(f12, 1.0f, 0.0f, 0.0f).conjugate();
            vector3f.rotate((Quaternionfc)quaternionf);
        }
        vector3f.add(f7, -f8, 0.0f);
    }

    private static Vector2f dadh_4(Vector3f vector3f, double d) {
        float f = (float)mc.method_22683().method_4486() / 2.0f;
        float f2 = (float)mc.method_22683().method_4502() / 2.0f;
        float f3 = vector3f.x;
        float f4 = vector3f.y;
        float f5 = vector3f.z;
        double d2 = (double)f2 / ((double)f5 * Math.tan(Math.toRadians(d / 2.0)));
        return f5 < 0.0f ? new Vector2f((float)((double)(-f3) * d2 + (double)f), (float)((double)f2 - (double)f4 * d2)) : new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
    }

    private static boolean khnj() {
        block0: {
            int n = 1387475219;
            int n2 = (n = Integer.rotateLeft(n * 1944988615, 3) ^ 0x5C83D3AD) ^ 0x30E05A92;
            if ((n2 ^ n) == 820009618) break block0;
            int cfr_ignored_0 = (0x62536B81 ^ n) - 841712865;
        }
        return yf.dnkh();
    }

    private static double jghdh(class_243 class_2432) {
        block0: {
            int n = -1999944446;
            n = Integer.rotateLeft(n * 1985018685, 27) ^ 0x3BCA807C;
            class_243 class_2433 = class_2432;
            n = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 5);
            int n2 = n ^ 0xB32DF627;
            if ((n2 ^ n) == -1288833497) break block0;
            int cfr_ignored_0 = (0x3BE6B325 ^ n) + -412522364;
        }
        return class_2432.method_10214();
    }

    private static String[] hf5tr1pzge1(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite h690gqpl2r4s(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ sef2f62 ^ string.hashCode()) + (n2 + mmvbba5) + i ^ sef2f62, 21) + mmvbba5);
            }
            String[] stringArray = bthw.hf5tr1pzge1(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

