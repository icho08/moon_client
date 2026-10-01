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
import us.m0vy.moondlc.m0vyguard.ttk;

public class ksh
extends ttk {
    private final class_1297 ttgh_2;
    private static final int f4qoxwn1xvxx = -1928138660;
    private static final int nkvp427z = -514260089;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int crnpnzl2w6;

    public ksh(class_1297 class_12972) {
        this.ttgh_2 = class_12972;
    }

    @Generated
    public class_1297 jthm() {
        block0: {
            int n = -1156194804;
            n = Integer.rotateLeft(n * -1551155291, 13) ^ 0x7C66B164;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0xCC24E000;
            if ((n2 ^ n) == -869998592) break block0;
            int cfr_ignored_0 = (0x77313E0C ^ n) + 234325513;
        }
        return this.ttgh_2;
    }

    private static String[] rg06rh8he(String string) {
        return string.split("\u0003\u0016", -1);
    }

    private static CallSite mhs08v3cz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ f4qoxwn1xvxx ^ string.hashCode() ^ n2 + nkvp427z ^ i * -956020013 ^ f4qoxwn1xvxx, 20) ^ nkvp427z));
            }
            String[] stringArray = ksh.rg06rh8he(new String(cArray));
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

