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
import us.m0vy.moondlc.m0vyguard.bhn;
import us.m0vy.moondlc.m0vyguard.blsh;

public final class tn_2 {
    private final int htn_2;
    private final float tyf;
    private final float shmw;
    private final float tthdh;
    private final float shha_4;
    private final float tqt_2;
    private final float htn;
    private final float snr;
    private final float hnh;
    private static final int a2w6ktptqd = -865040160;
    private static final int nvnw62wdyqb = 276420081;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int bvfcu7tw76rbgl;

    public tn_2(bhn bhn2, float f, float f2) {
        this.htn_2 = bhn2.unicode();
        this.tqt_2 = bhn2.advance();
        blsh blsh2 = bhn2.atlasBounds();
        if (blsh2 != null) {
            this.tyf = blsh2.left() / f;
            this.shmw = blsh2.right() / f;
            this.tthdh = 1.0f - blsh2.top() / f2;
            this.shha_4 = 1.0f - blsh2.bottom() / f2;
        } else {
            this.shha_4 = 0.0f;
            this.tthdh = 0.0f;
            this.shmw = 0.0f;
            this.tyf = 0.0f;
        }
        blsh blsh3 = bhn2.planeBounds();
        if (blsh3 != null) {
            this.snr = blsh3.right() - blsh3.left();
            this.hnh = blsh3.top() - blsh3.bottom();
            this.htn = blsh3.top();
        } else {
            this.htn = 0.0f;
            this.hnh = 0.0f;
            this.snr = 0.0f;
        }
    }

    public float khbq(Matrix4f matrix4f, class_4588 class_45882, float f, float f2, float f3, float f4, int n) {
        float f5 = this.snr * f;
        float f6 = this.hnh * f;
        class_45882.method_22918(matrix4f, f2, f3 -= this.htn * f, f4).method_22913(this.tyf, this.tthdh).method_39415(n);
        class_45882.method_22918(matrix4f, f2, f3 + f6, f4).method_22913(this.tyf, this.shha_4).method_39415(n);
        class_45882.method_22918(matrix4f, f2 + f5, f3 + f6, f4).method_22913(this.shmw, this.shha_4).method_39415(n);
        class_45882.method_22918(matrix4f, f2 + f5, f3, f4).method_22913(this.shmw, this.tthdh).method_39415(n);
        return this.tqt_2 * f;
    }

    public float dhay(float f) {
        return this.tqt_2 * f;
    }

    public int ztht_4() {
        return this.htn_2;
    }

    private static String[] yjk422dxf640nn(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gpezou9waejv12(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ a2w6ktptqd ^ string.hashCode()) + (n2 + nvnw62wdyqb) + i ^ a2w6ktptqd, 3) + nvnw62wdyqb);
            }
            String[] stringArray = tn_2.yjk422dxf640nn(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

