/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Supplier;
import us.m0vy.moondlc.m0vyguard.bmt;

public class bas_2
extends bmt {
    private static final int dyxeu2a4 = 1824143953;
    private static final int hybhcozcb = -2101888973;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int c7wy9d629una;

    public bas_2(String string) {
        super(string);
        this.jsn_2 = -999;
    }

    public bas_2 td_3(Integer n) {
        this.bth(n);
        return this;
    }

    public void bth(Integer n) {
        if (this.hlj(n)) {
            return;
        }
        super.bth(n);
        this.zkhn();
    }

    @Override
    public bas_2 qh(Supplier supplier) {
        return (bas_2)super.qh(supplier);
    }

    @Override
    public bas_2 dk(Runnable runnable) {
        return (bas_2)super.dk(runnable);
    }

    private static String[] wmgf4i9vs(String string) {
        return string.split("\u0003\u001b", -1);
    }

    private static CallSite ojbwf56arj7r(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dyxeu2a4 ^ string.hashCode()) + (n2 + hybhcozcb) + i ^ dyxeu2a4, 28) + hybhcozcb);
            }
            String[] stringArray = bas_2.wmgf4i9vs(new String(cArray));
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

