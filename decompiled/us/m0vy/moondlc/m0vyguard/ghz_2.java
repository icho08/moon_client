/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_284
 *  net.minecraft.class_290
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_284;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bkhz_2;
import us.m0vy.moondlc.m0vyguard.fth;

public class ghz_2
extends fth
implements bkhz_2 {
    private class_284 ssdh;
    private class_284 ss_3;
    private class_284 thla;
    private class_284 szkh;
    private class_284 rskh;
    private static final int sv05e5v7lb = 236511940;
    private static final int owha4aam6lbng = -1816066855;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hz2nk93afjj;

    public ghz_2(class_2960 class_29602) {
        super(class_29602, class_290.field_1575);
    }

    public void khagh(float f) {
        this.ss_3.method_1251(f);
        this.ssdh.method_1255(1.0f / (float)bdn_2.method_4486(), 1.0f / (float)bdn_2.method_4502());
        this.thla.method_1251(1.0f);
        this.szkh.method_1251(0.0f);
        this.rskh.method_1249(1.0f, 1.0f, 1.0f);
    }

    public void bghk(float f, int n, int n2) {
        this.ss_3.method_1251(f);
        float f2 = n > 0 ? 1.0f / (float)n : 0.0f;
        float f3 = n2 > 0 ? 1.0f / (float)n2 : 0.0f;
        this.ssdh.method_1255(f2, f3);
        this.thla.method_1251(1.0f);
        this.szkh.method_1251(0.0f);
        this.rskh.method_1249(1.0f, 1.0f, 1.0f);
    }

    @Override
    protected void zd_3() {
        this.ssdh = this.rthw("Resolution");
        this.ss_3 = this.rthw("Offset");
        this.thla = this.rthw("Saturation");
        this.szkh = this.rthw("TintIntensity");
        this.rskh = this.rthw("TintColor");
        super.zd_3();
    }

    private static String[] b3p194k4uv(String string) {
        return string.split("\u0005\u0018", -1);
    }

    private static CallSite os7l6jl6f3mr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sv05e5v7lb ^ string.hashCode() ^ n2 + owha4aam6lbng + i * -1852799443) + sv05e5v7lb) ^ owha4aam6lbng));
            }
            String[] stringArray = ghz_2.b3p194k4uv(new String(cArray));
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

