/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10055
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4608
 *  net.minecraft.class_7833
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10055;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_7833;
import us.m0vy.moondlc.m0vyguard.bthgh;
import us.m0vy.moondlc.m0vyguard.bngh;
import us.m0vy.moondlc.m0vyguard.hl;
import us.m0vy.moondlc.m0vyguard.aw;

public final class bsh_3 {
    private static final int dhkhsh = 16;
    private static final float zm = 0.3125f;
    private static final float shh_8 = 0.0625f;
    private static final ThreadLocal tw;
    private static final int kt8r7hp1 = 1076528081;
    private static final int ymkultkeefplh = 1487737415;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int aq85cj6xgsdcit;

    private bsh_3() {
    }

    public static boolean ztsh_3(aw aw2, class_4587 class_45872, class_4597 class_45972, int n, class_10055 class_100552) {
        hl hl2 = aw2.dhldh(class_100552.field_53528);
        class_2960 class_29602 = class_100552.field_53520.comp_1627();
        if (hl2 == null || class_29602 == null) {
            return false;
        }
        bthgh bthgh2 = (bthgh)tw.get();
        bsh_3.bshj(hl2, bthgh2);
        class_45872.method_22903();
        class_45872.method_46416(0.0f, 0.0f, 0.125f);
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(6.0f));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(class_100552.field_53538 * 0.5f));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(180.0f - class_100552.field_53538 * 0.5f));
        class_4588 class_45882 = class_45972.getBuffer(class_1921.method_23578((class_2960)class_29602));
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        for (int i = 0; i < 16; ++i) {
            bsh_3.tfy(class_45882, class_46652, n, bthgh2, i);
        }
        class_45872.method_22909();
        return true;
    }

    private static void bshj(hl hl2, bthgh bthgh2) {
        int n;
        for (n = 0; n <= 16; ++n) {
            bthgh2.rr[n] = hl2.dsy_3(n);
            bthgh2.jfth[n] = hl2.shth(n);
        }
        for (n = 0; n <= 16; ++n) {
            float f;
            int n2 = Math.max(0, n - 1);
            int n3 = Math.min(16, n + 1);
            float f2 = bthgh2.rr[n3] - bthgh2.rr[n2];
            float f3 = class_3532.method_15355((float)(f2 * f2 + (f = bthgh2.jfth[n3] - bthgh2.jfth[n2]) * f));
            if (f3 < 1.0E-5f) {
                bthgh2.jt_2[n] = 0.0f;
                bthgh2.hwa_2[n] = -1.0f;
                continue;
            }
            bthgh2.jt_2[n] = f / f3;
            bthgh2.hwa_2[n] = -f2 / f3;
        }
    }

    private static void tfy(class_4588 class_45882, class_4587.class_4665 class_46652, int n, bthgh bthgh2, int n2) {
        int n3 = n2;
        int n4 = n2 + 1;
        float f = bthgh2.rr[n3];
        float f2 = bthgh2.rr[n4];
        float f3 = bthgh2.jfth[n3];
        float f4 = bthgh2.jfth[n4];
        float f5 = f3 - 0.0625f;
        float f6 = f4 - 0.0625f;
        float f7 = 0.03125f * (float)(n2 + 1);
        float f8 = f7 + 0.03125f;
        bsh_3.alf(class_45882, class_46652, 0.3125f, f, f5, 0.171875f, f7, n, 0.0f, bthgh2.jt_2[n3], bthgh2.hwa_2[n3]);
        bsh_3.alf(class_45882, class_46652, -0.3125f, f, f5, 0.015625f, f7, n, 0.0f, bthgh2.jt_2[n3], bthgh2.hwa_2[n3]);
        bsh_3.alf(class_45882, class_46652, -0.3125f, f2, f6, 0.015625f, f8, n, 0.0f, bthgh2.jt_2[n4], bthgh2.hwa_2[n4]);
        bsh_3.alf(class_45882, class_46652, 0.3125f, f2, f6, 0.171875f, f8, n, 0.0f, bthgh2.jt_2[n4], bthgh2.hwa_2[n4]);
        bsh_3.alf(class_45882, class_46652, 0.3125f, f, f3, 0.1875f, f7, n, 0.0f, -bthgh2.jt_2[n3], -bthgh2.hwa_2[n3]);
        bsh_3.alf(class_45882, class_46652, 0.3125f, f2, f4, 0.1875f, f8, n, 0.0f, -bthgh2.jt_2[n4], -bthgh2.hwa_2[n4]);
        bsh_3.alf(class_45882, class_46652, -0.3125f, f2, f4, 0.34375f, f8, n, 0.0f, -bthgh2.jt_2[n4], -bthgh2.hwa_2[n4]);
        bsh_3.alf(class_45882, class_46652, -0.3125f, f, f3, 0.34375f, f7, n, 0.0f, -bthgh2.jt_2[n3], -bthgh2.hwa_2[n3]);
        bsh_3.alf(class_45882, class_46652, -0.3125f, f2, f4, 0.0f, f8, n, -1.0f, 0.0f, 0.0f);
        bsh_3.alf(class_45882, class_46652, -0.3125f, f2, f6, 0.015625f, f8, n, -1.0f, 0.0f, 0.0f);
        bsh_3.alf(class_45882, class_46652, -0.3125f, f, f5, 0.015625f, f7, n, -1.0f, 0.0f, 0.0f);
        bsh_3.alf(class_45882, class_46652, -0.3125f, f, f3, 0.0f, f7, n, -1.0f, 0.0f, 0.0f);
        bsh_3.alf(class_45882, class_46652, 0.3125f, f2, f6, 0.171875f, f8, n, 1.0f, 0.0f, 0.0f);
        bsh_3.alf(class_45882, class_46652, 0.3125f, f2, f4, 0.1875f, f8, n, 1.0f, 0.0f, 0.0f);
        bsh_3.alf(class_45882, class_46652, 0.3125f, f, f3, 0.1875f, f7, n, 1.0f, 0.0f, 0.0f);
        bsh_3.alf(class_45882, class_46652, 0.3125f, f, f5, 0.171875f, f7, n, 1.0f, 0.0f, 0.0f);
        if (n2 == 0) {
            bsh_3.alf(class_45882, class_46652, 0.3125f, f, f3, 0.171875f, 0.03125f, n, 0.0f, -1.0f, 0.0f);
            bsh_3.alf(class_45882, class_46652, -0.3125f, f, f3, 0.015625f, 0.03125f, n, 0.0f, -1.0f, 0.0f);
            bsh_3.alf(class_45882, class_46652, -0.3125f, f, f5, 0.015625f, 0.0f, n, 0.0f, -1.0f, 0.0f);
            bsh_3.alf(class_45882, class_46652, 0.3125f, f, f5, 0.171875f, 0.0f, n, 0.0f, -1.0f, 0.0f);
        }
        if (n2 == 15) {
            bsh_3.alf(class_45882, class_46652, 0.3125f, f2, f6, 0.328125f, 0.0f, n, 0.0f, 1.0f, 0.0f);
            bsh_3.alf(class_45882, class_46652, -0.3125f, f2, f6, 0.171875f, 0.0f, n, 0.0f, 1.0f, 0.0f);
            bsh_3.alf(class_45882, class_46652, -0.3125f, f2, f4, 0.171875f, 0.03125f, n, 0.0f, 1.0f, 0.0f);
            bsh_3.alf(class_45882, class_46652, 0.3125f, f2, f4, 0.328125f, 0.03125f, n, 0.0f, 1.0f, 0.0f);
        }
    }

    private static void alf(class_4588 class_45882, class_4587.class_4665 class_46652, float f, float f2, float f3, float f4, float f5, int n, float f6, float f7, float f8) {
        int n2 = bngh.sts_5(-737820634);
        class_4588 class_45883 = class_45882;
        n2 = (class_45883 != null ? System.identityHashCode(class_45883) : 0) ^ n2;
        class_4587.class_4665 class_46653 = class_46652;
        n2 = Integer.rotateLeft((class_46653 != null ? System.identityHashCode(class_46653) : 0) ^ n2, 28);
        int n3 = n2 ^ 0xDD90FCB;
        if ((n3 ^ n2) != 232329163) {
            int cfr_ignored_0 = Integer.rotateLeft(0xD9DCCFED ^ n2, 14) - 1713032430;
            int cfr_ignored_1 = (int)(0x1B6E61D027D4EB4FL ^ (long)n2 ^ 0x3ED0831A2DB99B0DL);
        }
        class_45882.method_56824(class_46652, f, f2, f3).method_1336(94418502 - 94418247, bsh_3.tyh(0x6AC5F9B8 ^ 0x6A3AF9B8, 16), -1128757376 + 1128757631, 620865496 + -620865241).method_22913(f4, f5).method_22922(class_4608.field_21444).method_60803(n).method_60831(class_46652, f6, f7, f8);
    }

    private static int tyh(int n, int n2) {
        block0: {
            int n3 = -896659892;
            n3 = Integer.rotateLeft(n3 * 896982895, 24) ^ 0x350C5941;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 25)) ^ 0x8FDF289E;
            if ((n4 ^ n3) == -1881200482) break block0;
            int cfr_ignored_0 = (0x455126D2 ^ n3) + -985382311;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String[] kyds7tv2wlgjr(String string) {
        return string.split("\u0005\u0019", -1);
    }

    private static CallSite jpftb7asf0zft(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ kt8r7hp1 ^ string.hashCode() ^ n2 + ymkultkeefplh + i * -264327175) + kt8r7hp1) ^ ymkultkeefplh));
            }
            String[] stringArray = bsh_3.kyds7tv2wlgjr(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

