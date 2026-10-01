/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bkhq;
import us.m0vy.moondlc.m0vyguard.sk_2;

public final class da {
    private final int khh_2;
    private final float dhthn;
    private final float jlt_2;
    private final float rthq;
    private final float hzt_3;
    private final float shkk;
    private final float zshr;
    private final float jkhk;
    private final float khkhf;
    private static final int ev1yayf = -413358167;
    private static final int uxsdb1cw09er = 743289501;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tu4uat5qo;

    public da(sk_2 sk2_2, float f, float f2) {
        this.khh_2 = sk2_2.unicode();
        this.shkk = sk2_2.advance();
        bkhq bkhq2 = sk2_2.atlasBounds();
        if (bkhq2 != null) {
            this.dhthn = bkhq2.left() / f;
            this.jlt_2 = bkhq2.right() / f;
            this.rthq = 1.0f - bkhq2.top() / f2;
            this.hzt_3 = 1.0f - bkhq2.bottom() / f2;
        } else {
            this.hzt_3 = 0.0f;
            this.rthq = 0.0f;
            this.jlt_2 = 0.0f;
            this.dhthn = 0.0f;
        }
        bkhq bkhq3 = sk2_2.planeBounds();
        if (bkhq3 != null) {
            this.jkhk = bkhq3.right() - bkhq3.left();
            this.khkhf = bkhq3.top() - bkhq3.bottom();
            this.zshr = bkhq3.top();
        } else {
            this.zshr = 0.0f;
            this.khkhf = 0.0f;
            this.jkhk = 0.0f;
        }
    }

    public float shs_10(Matrix4f matrix4f, class_4588 class_45882, float f, float f2, float f3, float f4, int n) {
        float f5 = this.jkhk * f;
        float f6 = this.khkhf * f;
        class_45882.method_22918(matrix4f, f2, f3 -= this.zshr * f, f4).method_22913(this.dhthn, this.rthq).method_39415(n);
        class_45882.method_22918(matrix4f, f2, f3 + f6, f4).method_22913(this.dhthn, this.hzt_3).method_39415(n);
        class_45882.method_22918(matrix4f, f2 + f5, f3 + f6, f4).method_22913(this.jlt_2, this.hzt_3).method_39415(n);
        class_45882.method_22918(matrix4f, f2 + f5, f3, f4).method_22913(this.jlt_2, this.rthq).method_39415(n);
        return this.shkk * f;
    }

    public float ssdh_4(float f) {
        return this.shkk * f;
    }

    public int rdd() {
        return this.khh_2;
    }

    private static String[] vkmpo63t93(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite g9girnl6j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ev1yayf ^ string.hashCode() ^ n2 + uxsdb1cw09er + i * -1250316233) + ev1yayf) ^ uxsdb1cw09er));
            }
            String[] stringArray = da.vkmpo63t93(new String(cArray));
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

