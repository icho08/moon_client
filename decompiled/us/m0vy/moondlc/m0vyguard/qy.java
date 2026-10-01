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

public class qy
extends fth {
    private class_284 bkm;
    private class_284 sghh_2;
    private static final int lq0a9pl7 = 460058741;
    private static final int on96ijudvh = 1633428115;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int weegpnuifb02po;

    public qy(class_2960 class_29602) {
        super(class_29602, class_290.field_1576);
    }

    public void sfw_2(float f, float f2, float f3) {
        if (this.bkm == null) {
            this.bkm = this.rthw("Size");
        }
        if (this.sghh_2 == null) {
            this.sghh_2 = this.rthw("Progress");
        }
        if (this.bkm != null) {
            this.bkm.method_1255(f, f2);
        }
        if (this.sghh_2 != null) {
            this.sghh_2.method_1251(f3);
        }
    }

    @Override
    protected void zd_3() {
        this.bkm = this.rthw("Size");
        this.sghh_2 = this.rthw("Progress");
    }

    private static String[] isutduya(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hh7vut5l1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ lq0a9pl7 ^ string.hashCode() ^ n2 + on96ijudvh + i * 338054143) + lq0a9pl7) ^ on96ijudvh));
            }
            String[] stringArray = qy.isutduya(new String(cArray));
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

