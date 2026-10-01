/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import us.m0vy.moondlc.m0vyguard.bma_2;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.zs_3;

public abstract class bath_2
implements dl,
bma_2 {
    private final String shyn;
    private static final int v9vxkn1 = 223518758;
    private static final int t6psmode = -1195243058;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int h7y41ryh3m3a8;

    public bath_2(String string) {
        this.shyn = string;
    }

    @Override
    public String getName() {
        block0: {
            int n = -28574046;
            n = Integer.rotateLeft(n * -580747521, 14) ^ 0x73A37F28;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0x5FDD9EFA;
            if ((n2 ^ n) == 1608359674) break block0;
            int cfr_ignored_0 = (0xA1966058 ^ n) - -137664947;
        }
        return this.shyn;
    }

    public taj dz_4(taj taj2, taj taj3) {
        block0: {
            int n = zs_3.shkhh(-664536182);
            n = System.identityHashCode(this) ^ n;
            taj taj4 = taj2;
            n = (taj4 != null ? System.identityHashCode(taj4) : 0) ^ n;
            int n2 = n ^ 0xC0C56EDB;
            if ((n2 ^ n) == -1060802853) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x18A69551 ^ n, 6) + 9024522) * 413570385;
            int cfr_ignored_1 = (int)(0xDA143B6C27D4EB4FL ^ (long)n ^ 0x8BA8831A2DB819F9L);
        }
        return bath_2.zwt_4(this, taj2, taj3, null, null);
    }

    public taj dhaf(taj taj2, taj taj3, class_243 class_2432) {
        block0: {
            int n = -1575813593;
            n = Integer.rotateLeft(n * -214759329, 17) ^ 0x28C57F47;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
            taj taj4 = taj3;
            n = Integer.rotateRight((taj4 != null ? System.identityHashCode(taj4) : 0) ^ n, 11);
            int n2 = n ^ 0x24684728;
            if ((n2 ^ n) == 610813736) break block0;
            int cfr_ignored_0 = (0x867AB90F ^ n) - -1656491430;
        }
        return this.jddh_2(taj2, taj3, class_2432, null);
    }

    public abstract taj jddh_2(taj var1, taj var2, class_243 var3, class_1297 var4);

    private static taj zwt_4(bath_2 bath2, taj taj2, taj taj3, class_243 class_2432, class_1297 class_12972) {
        block0: {
            int n = -764882405;
            n = Integer.rotateLeft(n * -121093771, 20) ^ 0x818573D2;
            bath_2 bath3 = bath2;
            n = Integer.rotateRight((bath3 != null ? System.identityHashCode(bath3) : 0) ^ n, 9);
            taj taj4 = taj3;
            n = (taj4 != null ? System.identityHashCode(taj4) : 0) ^ n;
            int n2 = n ^ 0xD4BFD8C7;
            if ((n2 ^ n) == -725624633) break block0;
            int cfr_ignored_0 = (0x6D70ADC ^ n) - 1065586906;
        }
        return bath2.jddh_2(taj2, taj3, class_2432, class_12972);
    }

    private static String[] gw90nxb009l(String string) {
        return string.split("\u0005\u0010", -1);
    }

    private static CallSite tto1ehslygvvx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ v9vxkn1 ^ string.hashCode()) + (n2 + t6psmode) + i ^ v9vxkn1, 11) + t6psmode);
            }
            String[] stringArray = bath_2.gw90nxb009l(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

