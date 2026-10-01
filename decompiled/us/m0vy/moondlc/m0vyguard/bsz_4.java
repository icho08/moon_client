/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bma;
import us.m0vy.moondlc.m0vyguard.thn_3;
import us.m0vy.moondlc.m0vyguard.ght_2;

public class bsz_4
extends ght_2 {
    private final bma ma_2;
    private static final int fww8k68bne0 = 1224893501;
    private static final int yt2ly94 = -505639334;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int d2u5ynev2rdmd;

    public bsz_4(bma bma2) {
        super(3);
        this.ma_2 = bma2;
    }

    public bma zdhz() {
        block0: {
            int n = thn_3.sy_2(881456510);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0x3BC765C6;
            if ((n2 ^ n) == 1002923462) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF4E90B8 ^ n, 4) + -555670141) * 256807097;
        }
        return this.ma_2;
    }

    private static String[] xaspb1oohtfk(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite phj096e54(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ fww8k68bne0 ^ string.hashCode()) + (n2 + yt2ly94) + i ^ fww8k68bne0, 13) + yt2ly94);
            }
            String[] stringArray = bsz_4.xaspb1oohtfk(new String(cArray));
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

