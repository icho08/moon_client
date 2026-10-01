/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bht;
import us.m0vy.moondlc.m0vyguard.bnd;
import us.m0vy.moondlc.m0vyguard.byf;
import us.m0vy.moondlc.m0vyguard.tdt_2;

public class mq {
    private static final int rlow1043w6 = 59902394;
    private static final int i5jygdllk3 = -989141217;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int iqeg1t0z2;

    public mq(long l) {
    }

    public void zrt_3(tdt_2 ... tdtArray) {
        block0: {
            int n = 1590849893;
            n = Integer.rotateLeft(n * 1112519085, 22) ^ 0x5F4429B;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 16);
            n = (tdtArray != null ? System.identityHashCode(tdtArray) : 0) ^ n;
            int n2 = n ^ 0xD6F7223B;
            if ((n2 ^ n) == -688446917) break block0;
            int cfr_ignored_0 = (0x8825535E ^ n) + 1099930419;
        }
    }

    public void zah() {
        block0: {
            int n = bht.sdhh_2(-1622596891);
            int n2 = n ^ 0xB0986AA;
            if ((n2 ^ n) == 185173674) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9440A44F ^ n, 5) - -130972468;
        }
    }

    public void shshkh(bnd bnd2) {
        block0: {
            int n = 1240220015;
            n = Integer.rotateLeft(n * 781563003, 22) ^ 0xEAF7986D;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            bnd bnd3 = bnd2;
            n = (bnd3 != null ? System.identityHashCode(bnd3) : 0) ^ n;
            int n2 = n ^ 0xFBA23C99;
            if ((n2 ^ n) == -73253735) break block0;
            int cfr_ignored_0 = (0xB24E7DF6 ^ n) - 377639052;
        }
    }

    public void sjj(byf byf2) {
        block0: {
            int n = -871362443;
            n = Integer.rotateLeft(n * 180860995, 14) ^ 0x7A0D5A7C;
            byf byf3 = byf2;
            n = Integer.rotateRight((byf3 != null ? System.identityHashCode(byf3) : 0) ^ n, 21);
            int n2 = n ^ 0x86D5332A;
            if ((n2 ^ n) == -2032848086) break block0;
            int cfr_ignored_0 = (0x4AC5235F ^ n) - 661118984;
        }
    }

    private static String[] qb5b5kd5u(String string) {
        return string.split("\u0003\u0016", -1);
    }

    private static CallSite rfky7w5u5uxc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rlow1043w6 ^ string.hashCode()) + (n2 + i5jygdllk3) + i ^ rlow1043w6, 10) + i5jygdllk3);
            }
            String[] stringArray = mq.qb5b5kd5u(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

