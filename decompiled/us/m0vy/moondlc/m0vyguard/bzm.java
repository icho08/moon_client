/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bzm
implements tthy {
    private static final int btm_2 = 1981688556;
    private static final int ddk = 1188244147;
    private static final int hdh_6 = 2111677629;
    private static final int ykh = -1982336373;
    private static final int teyuxo2wt = -1343236869;
    private static final int pwf8gfaqd6zr = 532752017;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int spsyxokyk;

    private bzm() {
        throw new UnsupportedOperationException("Utility".concat(" class"));
    }

    public static float thhkh_2(float f, float f2, double d, double d2, double d3, double d4, float f3) {
        float f4;
        float f5;
        double d5 = d3 - d;
        double d6 = d4 - d2;
        float f6 = (float)(d5 * d5 + d6 * d6);
        float f7 = f2;
        if (f6 > 0.0025000002f) {
            f5 = (float)class_3532.method_15349((double)d6, (double)d5) * 57.295776f - 90.0f;
            f4 = class_3532.method_15379((float)(class_3532.method_15393((float)f) - f5));
            f7 = 95.0f < f4 && f4 < 265.0f ? f5 - 180.0f : f5;
        }
        if (f3 > 0.0f) {
            f7 = f;
        }
        f5 = class_3532.method_15393((float)(f7 - f2));
        f7 = f2 + f5 * 0.3f;
        f4 = class_3532.method_15393((float)(f - f7));
        float f8 = 50.0f;
        if (Math.abs(f4) > f8) {
            f7 += f4 - Math.signum(f4) * f8;
        }
        return f7;
    }

    public static float[] tgha_4(double d, float f) {
        float f2;
        float f3;
        double d2 = class_3532.method_15338((double)(d - (double)f));
        if (d2 >= -22.5 && d2 <= 22.5) {
            f3 = 1.0f;
            f2 = 0.0f;
        } else if (d2 > 22.5 && d2 <= 67.5) {
            f3 = 1.0f;
            f2 = -1.0f;
        } else if (d2 > 67.5 && d2 <= 112.5) {
            f3 = 0.0f;
            f2 = -1.0f;
        } else if (d2 > 112.5 && d2 <= 157.5) {
            f3 = -1.0f;
            f2 = -1.0f;
        } else if (d2 > 157.5 || d2 <= -157.5) {
            f3 = -1.0f;
            f2 = 0.0f;
        } else if (d2 < -22.5 && d2 >= -67.5) {
            f3 = 1.0f;
            f2 = 1.0f;
        } else if (d2 < -67.5 && d2 >= -112.5) {
            f3 = 0.0f;
            f2 = 1.0f;
        } else {
            f3 = -1.0f;
            f2 = 1.0f;
        }
        return new float[]{f3, f2};
    }

    private static String tww(String string, int n, int n2, int n3) {
        try {
            int n4 = 444790613;
            n4 = Integer.rotateLeft(n4 * -1228465157, 24) ^ 0x47EA894C;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateLeft(n2 ^ n4, 23);
            int n5 = n4 ^ 0xEBB70726;
            if ((n5 ^ n4) != -340326618) {
                int cfr_ignored_0 = (0xF135F073 ^ n4) + 1629791289;
            }
            if ((0x2AA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x7FD0FA3F ^ n2 - i) + ddk, 5) ^ btm_2 + i * -641220299));
        }
        return new String(cArray);
    }

    private static String[] zdm_2(String string) {
        int n = 631170511;
        int n2 = (n = Integer.rotateLeft(n * 531021017, 23) ^ 0x40E1FC91) ^ 0x3DB47201;
        if ((n2 ^ n) != 1035235841) {
            int cfr_ignored_0 = (0x182A97CE ^ n) - 688449281;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite zmt_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2121742047;
            n3 = Integer.rotateLeft(n3 * -148956873, 6) ^ 0x84B59B03;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 5);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 9);
            int n4 = n3 ^ 0x2318634F;
            if ((n4 ^ n3) != 588800847) {
                int cfr_ignored_0 = (0xA290AA6E ^ n3) - 1344460566;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ hdh_6 ^ string.hashCode() ^ n2 + ykh ^ i * 1159281913 ^ hdh_6, 12) ^ ykh));
            }
            String[] stringArray = bzm.zdm_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] a71d0i01iczg(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite x0spnnuc8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ teyuxo2wt ^ string.hashCode() ^ n2 + pwf8gfaqd6zr + i * -646301519) + teyuxo2wt) ^ pwf8gfaqd6zr));
            }
            String[] stringArray = bzm.a71d0i01iczg(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

