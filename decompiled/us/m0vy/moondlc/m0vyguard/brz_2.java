/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import us.m0vy.moondlc.m0vyguard.bsh_2;

public class brz_2 {
    public static final String dshgh = "sf_pro";
    public static final String ksh = "product_sans";
    private static final Map bbth;
    public static final bsh_2 btd_2;
    public static final bsh_2 shbt_2;
    public static final bsh_2 shjh_2;
    public static final bsh_2 shthm;
    public static final bsh_2 dht_5;
    public static final bsh_2 dsht_2;
    public static final bsh_2 thtkh_2;
    public static final bsh_2 ryk;
    public static final bsh_2 zzw_2;
    public static final bsh_2 rzr;
    public static final bsh_2 bngh;
    public static final bsh_2 jhw_2;
    public static final bsh_2 zr_2;
    public static final bsh_2 tsf;
    public static final bsh_2 khkhj;
    public static final bsh_2 jghq;
    public static final bsh_2 khsd_4;
    public static final bsh_2 dshs;
    private static final int uunmqm6 = -2001433532;
    private static final int spxemco914 = 466408733;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ddqp7rojzps5;

    public static float khqkh() {
        return 0.07f;
    }

    public static float tkkh_2() {
        return 0.1f;
    }

    private static bsh_2 zgh_2(String string) {
        return bbth.computeIfAbsent(string, brz_2::dwb_2);
    }

    private static bsh_2 dwb_2(String string) {
        return bsh_2.zfsh_2(string, () -> brz_2.jdhh(string));
    }

    private static bsh_2 jdhh(String string) {
        return bsh_2.rzk().zshh_2(string).hghth();
    }

    private static String[] bimg6hwur0(String string) {
        return string.split("\u0001\u0012", -1);
    }

    private static CallSite q3lplhrbh5ejvs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ uunmqm6 ^ string.hashCode()) + (n2 + spxemco914) + i ^ uunmqm6, 6) + spxemco914);
            }
            String[] stringArray = brz_2.bimg6hwur0(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

