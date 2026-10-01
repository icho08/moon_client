/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import us.m0vy.moondlc.m0vyguard.bshh_2;
import us.m0vy.moondlc.m0vyguard.bmt;

public class hs
extends bmt {
    private static final int tx77dxstv78b = -602942131;
    private static final int fsfyu0v1sb = 1029675456;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int xnij7087aqkrt;

    public hs(String string) {
        super(string);
        this.jsn_2 = new ArrayList();
    }

    public hs td_3(List list) {
        this.bth(list);
        return this;
    }

    public hs dsgh_3(bshh_2 ... bshhArray) {
        this.bth(new ArrayList<bshh_2>(Arrays.asList(bshhArray)));
        return this;
    }

    public void bth(List list) {
        if (this.hlj(list)) {
            return;
        }
        super.bth(list);
        this.zkhn();
    }

    @Override
    public hs dk(Runnable runnable) {
        return (hs)super.dk(runnable);
    }

    public hs zf_2(bshh_2 ... bshhArray) {
        ((List)this.jsn_2).addAll(Arrays.asList(bshhArray));
        return this;
    }

    public boolean sht_5(String string) {
        return this.zbh_2(string).map(bmt::dms_4).orElse(false);
    }

    public boolean sks(String string) {
        return this.zbh_2(string).map(hs::sdt_7).orElse(false);
    }

    public List zsy() {
        return ((List)this.jsn_2).stream().map(bmt::getName).collect(Collectors.toList());
    }

    public List rghj() {
        return ((List)this.jsn_2).stream().filter(bmt::dms_4).map(bmt::getName).collect(Collectors.toList());
    }

    private Optional zbh_2(String string) {
        return ((List)this.jsn_2).stream().filter(arg_0 -> hs.bdz_3(string, arg_0)).findFirst();
    }

    @Override
    public hs qh(Supplier supplier) {
        return (hs)super.qh(supplier);
    }

    private static boolean bdz_3(String string, bshh_2 bshh2) {
        return bshh2.getName().equalsIgnoreCase(string);
    }

    private static Boolean sdt_7(bshh_2 bshh2) {
        bshh2.td_3((Boolean)bshh2.dms_4() == false);
        return true;
    }

    private static String[] pg0eyx4y6fbb2g(String string) {
        return string.split("\u0003\u000f", -1);
    }

    private static CallSite thpg3pwqouiew6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tx77dxstv78b ^ string.hashCode() ^ n2 + fsfyu0v1sb + i * 1790042759) + tx77dxstv78b) ^ fsfyu0v1sb));
            }
            String[] stringArray = hs.pg0eyx4y6fbb2g(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

