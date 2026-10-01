/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_639
 *  net.minecraft.class_642
 *  net.minecraft.class_9112
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_639;
import net.minecraft.class_642;
import net.minecraft.class_9112;
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.tha_5;

public class bjy
extends ttk {
    private final class_639 dhnkh;
    private final class_642 thqh_2;
    private final class_9112 khtsh_2;
    private static final int fmxbbljwrf = -961717144;
    private static final int rgagdl3 = -1080275962;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int qpo7z3rp5kvg9;

    @Generated
    public class_639 shha_3() {
        block0: {
            int n = 562440891;
            int n2 = (n = Integer.rotateLeft(n * 830424101, 14) ^ 0xF66E046A) ^ 0x4C11B9D1;
            if ((n2 ^ n) == 1276230097) break block0;
            int cfr_ignored_0 = (0x6D97936A ^ n) - 1589670271;
        }
        return this.dhnkh;
    }

    @Generated
    public class_642 skhs_3() {
        block0: {
            int n = -980559454;
            int n2 = (n = Integer.rotateLeft(n * -8882013, 11) ^ 0xBADA93CB) ^ 0xB64DEE54;
            if ((n2 ^ n) == -1236406700) break block0;
            int cfr_ignored_0 = (0x73C037F6 ^ n) + 1435185843;
        }
        return this.thqh_2;
    }

    @Generated
    public class_9112 hzt_2() {
        block0: {
            int n = tha_5.jdd_2(-257800495);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
            int n2 = n ^ 0x57AABEA6;
            if ((n2 ^ n) == 1470807718) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA708F877 ^ n, 7) - 1047770532) * -1492584329;
        }
        return this.khtsh_2;
    }

    @Generated
    public bjy(class_639 class_6392, class_642 class_6422, class_9112 class_91122) {
        this.dhnkh = class_6392;
        this.thqh_2 = class_6422;
        this.khtsh_2 = class_91122;
    }

    private static String[] buitqwlayj(String string) {
        return string.split("\u0006\u0018", -1);
    }

    private static CallSite umpbc90m(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ fmxbbljwrf ^ string.hashCode()) + (n2 + rgagdl3) + i ^ fmxbbljwrf, 8) + rgagdl3);
            }
            String[] stringArray = bjy.buitqwlayj(new String(cArray));
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

