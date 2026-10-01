/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_437
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_437;
import us.m0vy.moondlc.m0vyguard.ttk;

public class dkh
extends ttk {
    private final class_437 dlth;
    private static final int k78bues7 = -1858837360;
    private static final int m1t04nbmt5mfn = 1518383393;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int z8p7jgowe5huj;

    @Generated
    public class_437 fh() {
        block0: {
            int n = 1835357090;
            n = Integer.rotateLeft(n * 1561840567, 18) ^ 0x2916C467;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0x36EAEC3;
            if ((n2 ^ n) == 57585347) break block0;
            int cfr_ignored_0 = (0x6E0BFD61 ^ n) - -1929783728;
        }
        return this.dlth;
    }

    @Generated
    public dkh(class_437 class_4372) {
        this.dlth = class_4372;
    }

    private static String[] whcqxhw68khau(String string) {
        return string.split("\u0005\u0019", -1);
    }

    private static CallSite b4ns5eyo14d(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ k78bues7 ^ string.hashCode() ^ n2 + m1t04nbmt5mfn ^ i * 713533355 ^ k78bues7, 11) ^ m1t04nbmt5mfn));
            }
            String[] stringArray = dkh.whcqxhw68khau(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

