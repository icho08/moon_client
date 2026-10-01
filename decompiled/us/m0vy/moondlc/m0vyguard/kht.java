/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4608
 *  net.minecraft.class_5603
 *  net.minecraft.class_5605
 *  net.minecraft.class_5606
 *  net.minecraft.class_5609
 *  net.minecraft.class_5610
 *  net.minecraft.class_630
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_5603;
import net.minecraft.class_5605;
import net.minecraft.class_5606;
import net.minecraft.class_5609;
import net.minecraft.class_5610;
import net.minecraft.class_630;

public class kht {
    private final class_630 zbr = kht.dmt_3();
    private final class_630 hwth = this.zbr.method_32086("santa_hat");
    private static final int ngydyt6flqeql = 384695843;
    private static final int t2h2l97pwfjd = 1005389988;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kzmhliur2k6z2x;

    private static class_630 dmt_3() {
        class_5609 class_56092 = new class_5609();
        class_5610 class_56102 = class_56092.method_32111();
        class_5610 class_56103 = class_56102.method_32117("santa_hat", class_5606.method_32108(), class_5603.method_32091((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-1.5707964f, (float)0.0f));
        class_56103.method_32117("sant_hat_top2", class_5606.method_32108().method_32101(0, 0).method_32097(-0.5f, 2.0f, -1.5f, 3.0f, 3.0f, 3.0f), class_5603.method_32091((float)0.53024f, (float)10.61642f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-1.0471976f));
        class_56103.method_32117("sant_hat_top1", class_5606.method_32108().method_32101(0, 0).method_32097(-3.0f, -1.0f, -3.0f, 6.0f, 4.0f, 6.0f), class_5603.method_32091((float)1.03024f, (float)9.75039f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.87266463f));
        class_56103.method_32117("santa_hat_top0", class_5606.method_32108().method_32101(0, 0).method_32097(-4.0f, -1.0f, -4.0f, 9.0f, 3.0f, 8.0f), class_5603.method_32091((float)0.2892f, (float)8.72718f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.34906584f));
        class_56103.method_32117("sant_hat_top3", class_5606.method_32108().method_32101(0, 16).method_32097(-0.90192f, -1.83013f, -2.0f, 4.0f, 4.0f, 4.0f), class_5603.method_32091((float)5.78024f, (float)12.11642f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.2617994f));
        class_56103.method_32117("santa_hat_base", class_5606.method_32108().method_32101(0, 16).method_32098(-4.5f, -3.0f, -4.5f, 10.0f, 4.0f, 9.0f, new class_5605(0.1f)), class_5603.method_32091((float)0.2892f, (float)8.72718f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.2617994f));
        return class_56102.method_32112(64, 32);
    }

    public void ark(class_4587 class_45872, class_4597 class_45972, int n, class_2960 class_29602) {
        class_4588 class_45882 = class_45972.getBuffer(class_1921.method_23578((class_2960)class_29602));
        this.zbr.method_22698(class_45872, class_45882, n, class_4608.field_21444);
    }

    private static String[] nce34vf73k5d(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite g1gdxf7y(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ngydyt6flqeql ^ string.hashCode()) + (n2 + t2h2l97pwfjd) + i ^ ngydyt6flqeql, 10) + t2h2l97pwfjd);
            }
            String[] stringArray = kht.nce34vf73k5d(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

