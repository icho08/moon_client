/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2596
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_2596;
import us.m0vy.moondlc.m0vyguard.ttt;
import us.m0vy.moondlc.m0vyguard.hn_2;

public class ghh_2
extends ttt {
    private class_2596 zfd;
    private static final int d1u6gwkjry = -736046175;
    private static final int qdbzcnex2hfkz = 316613395;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dqxbnrrh8rb1u;

    @Generated
    public class_2596 zjd() {
        block0: {
            int n = hn_2.ssy(1243042770);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF07D0BC5;
            if ((n2 ^ n) == -260240443) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xBA6A5817 ^ n, 10) - -1757525500) * -1167435753;
        }
        return this.zfd;
    }

    @Generated
    public void dkhsh_2(class_2596 class_25962) {
        int n = -1628367800;
        n = Integer.rotateLeft(n * 506577753, 6) ^ 0xFBF0BCC6;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
        class_2596 class_25963 = class_25962;
        n = Integer.rotateLeft((class_25963 != null ? System.identityHashCode(class_25963) : 0) ^ n, 29);
        int n2 = n ^ 0x5F010F96;
        if ((n2 ^ n) != 1593905046) {
            int cfr_ignored_0 = (0xC1F01BDE ^ n) - -1362251506;
        }
        this.zfd = class_25962;
    }

    @Generated
    public ghh_2(class_2596 class_25962) {
        this.zfd = class_25962;
    }

    private static String[] ip1bct84l1bo(String string) {
        return string.split("\u0001\u0014", -1);
    }

    private static CallSite b2ymbvi0ap(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ d1u6gwkjry ^ string.hashCode() ^ n2 + qdbzcnex2hfkz ^ i * 1172271411 ^ d1u6gwkjry, 3) ^ qdbzcnex2hfkz));
            }
            String[] stringArray = ghh_2.ip1bct84l1bo(new String(cArray));
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

