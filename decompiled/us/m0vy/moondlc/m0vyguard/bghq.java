/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1282
 *  net.minecraft.class_1309
 *  org.jetbrains.annotations.Nullable
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1282;
import net.minecraft.class_1309;
import org.jetbrains.annotations.Nullable;
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.tths;

public class bghq
extends ttk {
    private final class_1309 dhghm;
    private final class_1282 daz_2;
    private static final int yiytgcagwlzo = 1331727320;
    private static final int xicokkl2d = 1168823976;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int p9r9mblo2ef3;

    public bghq(class_1309 class_13092, class_1282 class_12822) {
        this.dhghm = class_13092;
        this.daz_2 = class_12822;
    }

    @Nullable
    public class_1309 jdz_2() {
        block0: {
            int n = tths.rza_2(-824257839);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
            int n2 = n ^ 0x116A2086;
            if ((n2 ^ n) == 292167814) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xDFB4F257 ^ n, 14) - 457635780) * -541789609;
        }
        return this.dhghm.method_6124();
    }

    @Generated
    public class_1309 sll() {
        block0: {
            int n = -90085595;
            n = Integer.rotateLeft(n * -682692151, 8) ^ 0xFCF1BD0;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC1B5DF3;
            if ((n2 ^ n) == 203120115) break block0;
            int cfr_ignored_0 = (0xF6BA3AD6 ^ n) + 295325908;
        }
        return this.dhghm;
    }

    @Generated
    public class_1282 rnk() {
        block0: {
            int n = -1664052965;
            n = Integer.rotateLeft(n * -469395341, 7) ^ 0xCE8C3433;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x44310AED;
            if ((n2 ^ n) == 1144064749) break block0;
            int cfr_ignored_0 = (0xD8E19BF6 ^ n) - -1269606519;
        }
        return this.daz_2;
    }

    private static String[] ab2p8xmyz49g5(String string) {
        return string.split("\b\u000e", -1);
    }

    private static CallSite lymk5j4sun2i(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ yiytgcagwlzo ^ string.hashCode() ^ n2 + xicokkl2d + i * -292160115) + yiytgcagwlzo) ^ xicokkl2d));
            }
            String[] stringArray = bghq.ab2p8xmyz49g5(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

