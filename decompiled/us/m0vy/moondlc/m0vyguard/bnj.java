/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Supplier;
import us.m0vy.moondlc.m0vyguard.bmt;

public class bnj
extends bmt {
    private static final int jzgur95p = -1351719230;
    private static final int tnge19zsc = -358137904;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int nnf3ux43;

    public bnj(String string) {
        super(string);
    }

    public bnj(String string, String string2, Color color, boolean bl) {
        this(string);
        this.td_3(color);
    }

    public bnj td_3(Color color) {
        this.bth(color);
        return this;
    }

    public void bth(Color color) {
        if (this.hlj(color)) {
            return;
        }
        super.bth(color);
        this.zkhn();
    }

    @Override
    public bnj qh(Supplier supplier) {
        return (bnj)super.qh(supplier);
    }

    @Override
    public bnj dk(Runnable runnable) {
        return (bnj)super.dk(runnable);
    }

    public Color khbl() {
        return (Color)this.dms_4();
    }

    private static String[] xaeghsvoq23drm(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ui8mm936wa(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jzgur95p ^ string.hashCode()) + (n2 + tnge19zsc) + i ^ jzgur95p, 27) + tnge19zsc);
            }
            String[] stringArray = bnj.xaeghsvoq23drm(new String(cArray));
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

