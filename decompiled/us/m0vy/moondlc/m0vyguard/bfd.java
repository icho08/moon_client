/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.ttk;

public class bfd
extends ttk {
    private final float tkhb;
    private final float thtdh;
    private final int khdhh_2;
    private static final int cpopsis = 1792738443;
    private static final int wr4kwy8mh = 1533194349;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int v7pfko7mrt;

    @Generated
    public float ghsb_2() {
        block0: {
            int n = 1592280324;
            n = Integer.rotateLeft(n * -1524947267, 25) ^ 0xC9FE0418;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0x88D680FC;
            if ((n2 ^ n) == -1999208196) break block0;
            int cfr_ignored_0 = (0xD63EC5F8 ^ n) + 934465443;
        }
        return this.tkhb;
    }

    @Generated
    public float tbkh_2() {
        block0: {
            int n = -253449415;
            int n2 = (n = Integer.rotateLeft(n * 1379263075, 9) ^ 0x896A2D91) ^ 0x1363644E;
            if ((n2 ^ n) == 325280846) break block0;
            int cfr_ignored_0 = (0xE387CF77 ^ n) + 1232356396;
        }
        return this.thtdh;
    }

    @Generated
    public int zts_2() {
        block0: {
            int n = -545293185;
            n = Integer.rotateLeft(n * 1669224119, 17) ^ 0x9EC3CD0;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8E23D26B;
            if ((n2 ^ n) == -1910254997) break block0;
            int cfr_ignored_0 = (0x515CAE14 ^ n) + -804011256;
        }
        return this.khdhh_2;
    }

    @Generated
    public bfd(float f, float f2, int n) {
        this.tkhb = f;
        this.thtdh = f2;
        this.khdhh_2 = n;
    }

    private static String[] yrqmx0x1mw386e(String string) {
        return string.split("\u0006\u001c", -1);
    }

    private static CallSite jh2r92po29(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ cpopsis ^ string.hashCode()) + (n2 + wr4kwy8mh) + i ^ cpopsis, 15) + wr4kwy8mh);
            }
            String[] stringArray = bfd.yrqmx0x1mw386e(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

