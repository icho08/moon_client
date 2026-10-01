/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;

public class bys_2 {
    private final boolean thq_3;
    private final List tht;
    public static final bys_2 khghm;
    private static final int y0of9ayd8b = -808651272;
    private static final int nvyz4id = -68699413;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fmj2wdsi;

    public bys_2(boolean bl, List list) {
        this.thq_3 = bl;
        this.tht = list;
    }

    public boolean bkk() {
        block0: {
            int n = -1753853205;
            n = Integer.rotateLeft(n * -1766914333, 4) ^ 0x2AEC64DF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF49F755D;
            if ((n2 ^ n) == -190876323) break block0;
            int cfr_ignored_0 = (0x63E927B6 ^ n) - -974179658;
        }
        return this.thq_3;
    }

    public List hthl() {
        block0: {
            int n = -2081004892;
            int n2 = (n = Integer.rotateLeft(n * 1433103013, 18) ^ 0x85B80281) ^ 0x785E5678;
            if ((n2 ^ n) == 2019448440) break block0;
            int cfr_ignored_0 = (0xFBA834DC ^ n) - 797736508;
        }
        return this.tht;
    }

    private static String[] qsxjq7jl(String string) {
        return string.split("\u0006\u0018", -1);
    }

    private static CallSite szy1yhn6u6jo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ y0of9ayd8b ^ string.hashCode()) + (n2 + nvyz4id) + i ^ y0of9ayd8b, 18) + nvyz4id);
            }
            String[] stringArray = bys_2.qsxjq7jl(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

