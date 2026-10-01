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

public class bshh_2
extends bmt {
    private static final int flskvaje4m5 = -442926266;
    private static final int ivpivbsq2u030 = -258629076;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int qa30crzlb;

    public bshh_2(String string) {
        super(string);
    }

    public bshh_2(String string, String string2, boolean bl) {
        this(string);
        this.td_3(bl);
    }

    public bshh_2 td_3(Boolean bl) {
        this.bth(bl);
        return this;
    }

    public void bth(Boolean bl) {
        if (this.hlj(bl)) {
            return;
        }
        super.bth(bl);
        this.zkhn();
    }

    @Override
    public bshh_2 qh(Supplier supplier) {
        return (bshh_2)super.qh(supplier);
    }

    @Override
    public bshh_2 dk(Runnable runnable) {
        return (bshh_2)super.dk(runnable);
    }

    public void sft_3() {
        this.bth((Boolean)this.dms_4() == false);
    }

    private static String[] q1u3tlxcpiany(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite jjg3kua20yh7m(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ flskvaje4m5 ^ string.hashCode()) + (n2 + ivpivbsq2u030) + i ^ flskvaje4m5, 12) + ivpivbsq2u030);
            }
            String[] stringArray = bshh_2.q1u3tlxcpiany(new String(cArray));
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

