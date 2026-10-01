/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1113
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1113;
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.agh;

public class bay
extends ttk {
    public class_1113 ryj;
    private static final int mnj5dsdk53 = -1437461514;
    private static final int hm54msoh5 = -149904714;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int um42webhd1;

    public bay(class_1113 class_11132) {
        this.ryj = class_11132;
    }

    @Generated
    public class_1113 dhsz_3() {
        block0: {
            int n = agh.jsa_3(69724716);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x66621D1C;
            if ((n2 ^ n) == 1717706012) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6245F730 ^ n, 15) + -355037685) * 1648752433;
        }
        return this.ryj;
    }

    private static String[] myyx4ass(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite peg5o98g03w(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ mnj5dsdk53 ^ string.hashCode() ^ n2 + hm54msoh5 + i * 683089891) + mnj5dsdk53) ^ hm54msoh5));
            }
            String[] stringArray = bay.myyx4ass(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

