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
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.fth;

public class tt_4
extends fth {
    private class_284 tsht;
    private class_284 ztth_2;
    private static final int iw8vt0o1pjpg = -124479165;
    private static final int p35oiskfc = -546140326;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ebmbz0hls;

    public tt_4(class_2960 class_29602) {
        super(class_29602, class_290.field_1575);
    }

    public void khthdh(float f, byq byq2) {
        if (this.tsht != null) {
            this.tsht.method_1251(f);
        }
        if (this.ztth_2 != null && byq2 != null) {
            this.ztth_2.method_1249(byq2.sbk() / 255.0f, byq2.srl() / 255.0f, byq2.shsl_2() / 255.0f);
        }
    }

    @Override
    protected void zd_3() {
        this.tsht = this.rthw("Time");
        this.ztth_2 = this.rthw("Accent");
    }

    private static String[] k810x5hfct(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite n7xf4q4elfto(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ iw8vt0o1pjpg ^ string.hashCode() ^ n2 + p35oiskfc ^ i * 672376537 ^ iw8vt0o1pjpg, 16) ^ p35oiskfc));
            }
            String[] stringArray = tt_4.k810x5hfct(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

