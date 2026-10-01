/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1297;
import us.m0vy.moondlc.m0vyguard.ttt;

public class bthy
extends ttt {
    private final class_1297 hhr_2;
    private static final int f2w7kc3q = -539375385;
    private static final int ctb0l0pnxb = -822960443;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zmbf03a3;

    @Generated
    public class_1297 khtf() {
        block0: {
            int n = 1356933064;
            n = Integer.rotateLeft(n * -251928437, 7) ^ 0x410F885;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0x311CDD24;
            if ((n2 ^ n) == 823975204) break block0;
            int cfr_ignored_0 = (0x61FDFAEC ^ n) - 1240042603;
        }
        return this.hhr_2;
    }

    @Generated
    public bthy(class_1297 class_12972) {
        this.hhr_2 = class_12972;
    }

    private static String[] vvqv7mv9kai(String string) {
        return string.split("\u0001\u001f", -1);
    }

    private static CallSite ngp69onyt(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ f2w7kc3q ^ string.hashCode() ^ n2 + ctb0l0pnxb + i * -1309416055) + f2w7kc3q) ^ ctb0l0pnxb));
            }
            String[] stringArray = bthy.vvqv7mv9kai(new String(cArray));
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

