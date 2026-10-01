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
import us.m0vy.moondlc.m0vyguard.fth;

public class btkh_2
extends fth {
    private class_284 rzl;
    private class_284 dhaj_2;
    private class_284 jshj;
    private class_284 byt_2;
    private static final int udkz9sycm0 = 1305730159;
    private static final int z475bckwqx3n = 1579438929;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int n2bj2bcxcoaw;

    public btkh_2(class_2960 class_29602) {
        super(class_29602, class_290.field_1575);
    }

    public void zjz_3(float f, float f2, float f3, float f4, float f5, float f6, boolean bl) {
        if (this.rzl != null) {
            this.rzl.method_35657(f, f2, f3, f4);
        }
        if (this.dhaj_2 != null) {
            this.dhaj_2.method_1251(f5);
        }
        if (this.jshj != null) {
            this.jshj.method_1251(f6);
        }
        if (this.byt_2 != null) {
            this.byt_2.method_1251(bl ? 1.0f : 0.0f);
        }
    }

    @Override
    protected void zd_3() {
        this.rzl = this.rthw("FogParams");
        this.dhaj_2 = this.rthw("BlurStrength");
        this.jshj = this.rthw("BlurFloor");
        this.byt_2 = this.rthw("SkipSky");
        super.zd_3();
    }

    private static String[] pc40qz95(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite vp26t46une3we(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ udkz9sycm0 ^ string.hashCode() ^ n2 + z475bckwqx3n ^ i * 705532895 ^ udkz9sycm0, 11) ^ z475bckwqx3n));
            }
            String[] stringArray = btkh_2.pc40qz95(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

