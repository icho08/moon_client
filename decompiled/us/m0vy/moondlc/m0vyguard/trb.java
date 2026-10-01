/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1309
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1309;
import us.m0vy.moondlc.m0vyguard.ttt;

public class trb
extends ttt {
    private final class_1309 thd_3;
    private static final int atfgv6oucp = -213154802;
    private static final int uak7opj = 1344074235;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jx3llzqo;

    @Generated
    public class_1309 zla() {
        block0: {
            int n = -1792869296;
            n = Integer.rotateLeft(n * -1891830923, 26) ^ 0xA3EE4FF9;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x89F2804C;
            if ((n2 ^ n) == -1980596148) break block0;
            int cfr_ignored_0 = (0x1CD07C1C ^ n) - -875972174;
        }
        return this.thd_3;
    }

    @Generated
    public trb(class_1309 class_13092) {
        this.thd_3 = class_13092;
    }

    private static String[] ylc47rwkwaxt(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wf2kgjfydrce(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ atfgv6oucp ^ string.hashCode() ^ n2 + uak7opj ^ i * -1862847203 ^ atfgv6oucp, 27) ^ uak7opj));
            }
            String[] stringArray = trb.ylc47rwkwaxt(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

