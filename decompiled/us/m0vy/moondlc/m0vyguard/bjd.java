/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1309;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tzk;
import us.movy.moondlc.Moondlc;

public class bjd
implements tthy {
    private static final int ixql6per10i = 1971956379;
    private static final int z8hyosrv4c = 229165742;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int c187cjdmjoo;

    public static class_1309 shfn() {
        block0: {
            int n = -1112617596;
            int n2 = (n = Integer.rotateLeft(n * 526764655, 5) ^ 0x4DBE7379) ^ 0xBFD4314C;
            if ((n2 ^ n) == -1076612788) break block0;
            int cfr_ignored_0 = (0x27AFCC8 ^ n) + -791194028;
        }
        return bjd.zsa(bjd.tah_7(Moondlc.getInstance()));
    }

    private static tzk tah_7(Moondlc moondlc) {
        block0: {
            int n = -1396866171;
            n = Integer.rotateLeft(n * 1145077055, 22) ^ 0xFEE846E2;
            Moondlc moondlc2 = moondlc;
            n = Integer.rotateRight((moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n, 11);
            int n2 = n ^ 0xC35B378A;
            if ((n2 ^ n) == -1017432182) break block0;
            int cfr_ignored_0 = (0x6FE6B40F ^ n) + 670023492;
        }
        return moondlc.getTargetManager();
    }

    private static class_1309 zsa(tzk tzk2) {
        block0: {
            int n = 1052812217;
            n = Integer.rotateLeft(n * 708157429, 3) ^ 0x89E0A494;
            tzk tzk3 = tzk2;
            n = (tzk3 != null ? System.identityHashCode(tzk3) : 0) ^ n;
            int n2 = n ^ 0x997E5A0F;
            if ((n2 ^ n) == -1719772657) break block0;
            int cfr_ignored_0 = (0xA7BEF9B6 ^ n) + 845454028;
        }
        return tzk2.br();
    }

    private static String[] s2857umpfxoi(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite uxmnahcawuwe(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ixql6per10i ^ string.hashCode() ^ n2 + z8hyosrv4c ^ i * 1121024759 ^ ixql6per10i, 22) ^ z8hyosrv4c));
            }
            String[] stringArray = bjd.s2857umpfxoi(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

