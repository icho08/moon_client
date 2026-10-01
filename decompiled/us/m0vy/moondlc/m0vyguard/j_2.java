/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.dd_3;

public class j_2
extends ttk {
    private final class_1657 hzn_2;
    private final class_1799 ddh;
    private static final int jm4sdbke9s = -1606912884;
    private static final int vo7buya7rv217 = 735609433;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int shs2a869n5i8;

    @Generated
    public class_1657 tkhy() {
        block0: {
            int n = dd_3.khkhh(1296575722);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0x41954D7F;
            if ((n2 ^ n) == 1100303743) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCDD6195 ^ n, 4) - -1825804218) * 215835029;
            int cfr_ignored_1 = (int)(0xCE6FCFA827D4EB4FL ^ (long)n ^ 0x6220831A2DB8310EL);
        }
        return this.hzn_2;
    }

    @Generated
    public class_1799 jdd_3() {
        block0: {
            int n = dd_3.khkhh(394568824);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 29);
            int n2 = n ^ 0x34FDEC7C;
            if ((n2 ^ n) == 889056380) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x23794804 ^ n, 7) - 1343051703;
        }
        return this.ddh;
    }

    @Generated
    public j_2(class_1657 class_16572, class_1799 class_17992) {
        this.hzn_2 = class_16572;
        this.ddh = class_17992;
    }

    private static String[] y9tmklh3h92td(String string) {
        return string.split("\u0003\u001e", -1);
    }

    private static CallSite ynvoxyv6k4g0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jm4sdbke9s ^ string.hashCode()) + (n2 + vo7buya7rv217) + i ^ jm4sdbke9s, 23) + vo7buya7rv217);
            }
            String[] stringArray = j_2.y9tmklh3h92td(new String(cArray));
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

