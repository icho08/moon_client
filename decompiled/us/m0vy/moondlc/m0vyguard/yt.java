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
import us.m0vy.moondlc.m0vyguard.bsz;
import us.m0vy.moondlc.m0vyguard.dhsh_5;

public class yt
extends dhsh_5
implements bsz {
    private class_284 tal_2;
    private class_284 rhz_3;
    private class_284 bshs_2;
    private class_284 khah_4;
    private class_284 zsdh;
    private static final int wba1n6yv6 = -468452126;
    private static final int ykahhb173 = 670657654;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int loxee5eso913v;

    public yt(class_2960 class_29602) {
        super(class_29602, class_290.field_1575);
    }

    public void bmf(float f) {
        this.rhz_3.method_1251(f);
        this.tal_2.method_1255(1.0f / (float)dyt.method_4486(), 1.0f / (float)dyt.method_4502());
        this.bshs_2.method_1251(1.0f);
        this.khah_4.method_1251(0.0f);
        this.zsdh.method_1249(1.0f, 1.0f, 1.0f);
    }

    public void zkhz(float f, int n, int n2) {
        this.rhz_3.method_1251(f);
        float f2 = n > 0 ? 1.0f / (float)n : 0.0f;
        float f3 = n2 > 0 ? 1.0f / (float)n2 : 0.0f;
        this.tal_2.method_1255(f2, f3);
        this.bshs_2.method_1251(1.0f);
        this.khah_4.method_1251(0.0f);
        this.zsdh.method_1249(1.0f, 1.0f, 1.0f);
    }

    @Override
    protected void tdy_3() {
        this.tal_2 = this.zhd_5("Resolution");
        this.rhz_3 = this.zhd_5("Offset");
        this.bshs_2 = this.zhd_5("Saturation");
        this.khah_4 = this.zhd_5("TintIntensity");
        this.zsdh = this.zhd_5("TintColor");
        super.tdy_3();
    }

    private static String[] a458cz60u(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite jw37821uk20lxp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wba1n6yv6 ^ string.hashCode() ^ n2 + ykahhb173 + i * -2044113667) + wba1n6yv6) ^ ykahhb173));
            }
            String[] stringArray = yt.a458cz60u(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

