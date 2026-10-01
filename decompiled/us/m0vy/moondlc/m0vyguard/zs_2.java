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
import us.m0vy.moondlc.m0vyguard.bsw_2;
import us.m0vy.moondlc.m0vyguard.bghy;
import us.m0vy.moondlc.m0vyguard.khf;

public final class zs_2 {
    private final int zhd_3;
    private final float jkhq;
    private final float hkd_2;
    private final float hal;
    private final float jna_2;
    private final float jmt_2;
    private final float rds_2;
    private final float thzt;
    private final float tkhh;
    private static final int a6tzx0zh = 403195147;
    private static final int l7s4o0b = 1353254384;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mmpu0ma1;

    public zs_2(bghy bghy2, float f, float f2) {
        this.zhd_3 = bghy2.unicode();
        this.jmt_2 = bghy2.advance();
        khf khf2 = bghy2.atlasBounds();
        if (khf2 != null) {
            this.jkhq = khf2.left() / f;
            this.hkd_2 = khf2.right() / f;
            this.hal = 1.0f - khf2.top() / f2;
            this.jna_2 = 1.0f - khf2.bottom() / f2;
        } else {
            this.jna_2 = 0.0f;
            this.hal = 0.0f;
            this.hkd_2 = 0.0f;
            this.jkhq = 0.0f;
        }
        khf khf3 = bghy2.planeBounds();
        if (khf3 != null) {
            this.thzt = khf3.right() - khf3.left();
            this.tkhh = khf3.top() - khf3.bottom();
            this.rds_2 = khf3.top();
        } else {
            this.rds_2 = 0.0f;
            this.tkhh = 0.0f;
            this.thzt = 0.0f;
        }
    }

    public float sss_7(Matrix4f matrix4f, class_4588 class_45882, float f, float f2, float f3, float f4, int n) {
        float f5 = this.thzt * f;
        float f6 = this.tkhh * f;
        class_45882.method_22918(matrix4f, f2, f3 -= this.rds_2 * f, f4).method_22913(this.jkhq, this.hal).method_39415(n);
        class_45882.method_22918(matrix4f, f2, f3 + f6, f4).method_22913(this.jkhq, this.jna_2).method_39415(n);
        class_45882.method_22918(matrix4f, f2 + f5, f3 + f6, f4).method_22913(this.hkd_2, this.jna_2).method_39415(n);
        class_45882.method_22918(matrix4f, f2 + f5, f3, f4).method_22913(this.hkd_2, this.hal).method_39415(n);
        return this.jmt_2 * f;
    }

    public float khyh(Matrix4f matrix4f, class_4588 class_45882, float f, float f2, float f3, float f4, bsw_2 bsw2) {
        float f5 = this.thzt * f;
        float f6 = this.tkhh * f;
        class_45882.method_22918(matrix4f, f2, f3 -= this.rds_2 * f, f4).method_22913(this.jkhq, this.hal).method_39415(bsw2.t_2().btkh());
        class_45882.method_22918(matrix4f, f2, f3 + f6, f4).method_22913(this.jkhq, this.jna_2).method_39415(bsw2.aqz().btkh());
        class_45882.method_22918(matrix4f, f2 + f5, f3 + f6, f4).method_22913(this.hkd_2, this.jna_2).method_39415(bsw2.thtr_2().btkh());
        class_45882.method_22918(matrix4f, f2 + f5, f3, f4).method_22913(this.hkd_2, this.hal).method_39415(bsw2.dfgh_2().btkh());
        return this.jmt_2 * f;
    }

    public float tshq_2(float f) {
        return this.jmt_2 * f;
    }

    public int thyh_2() {
        return this.zhd_3;
    }

    private static String[] qe0jrzq45(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite b4ao1o2xksue(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ a6tzx0zh ^ string.hashCode() ^ n2 + l7s4o0b ^ i * -911976113 ^ a6tzx0zh, 17) ^ l7s4o0b));
            }
            String[] stringArray = zs_2.qe0jrzq45(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

