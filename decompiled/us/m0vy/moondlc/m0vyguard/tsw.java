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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bmt;
import us.m0vy.moondlc.m0vyguard.bma_2;
import us.m0vy.moondlc.m0vyguard.ghsh_2;

public class tsw
extends bmt {
    private final List thsn_2 = new ArrayList();
    private static final int fgjap9ty = 1223044366;
    private static final int szs26j7wq73v6 = 1912087779;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lx34zkfco9q8m;

    public tsw(String string) {
        super(string);
    }

    public tsw values(String ... stringArray) {
        this.thsn_2.addAll(Arrays.asList(stringArray));
        if (this.jsn_2 == null && !this.thsn_2.isEmpty()) {
            this.jsn_2 = this.thsn_2.getFirst();
        }
        return this;
    }

    public tsw values(Enum ... enumArray) {
        this.thsn_2.addAll(Arrays.stream(enumArray).map(tsw::shkhk).toList());
        if (this.jsn_2 == null && !this.thsn_2.isEmpty()) {
            this.jsn_2 = this.thsn_2.getFirst();
        }
        return this;
    }

    public tsw td_3(Enum enum_) {
        return this.td_3(enum_ != null ? (enum_ instanceof bma_2 ? ((bma_2)((Object)enum_)).getName() : enum_.name()) : null);
    }

    public boolean atha(Enum enum_) {
        if (enum_ == null) {
            return false;
        }
        String string = enum_ instanceof bma_2 ? ((bma_2)((Object)enum_)).getName() : enum_.name();
        return ((String)this.jsn_2).equals(string);
    }

    public tsw td_3(String string) {
        this.bth(string);
        return this;
    }

    public void bth(String string) {
        if (this.hlj(string)) {
            return;
        }
        super.bth(string);
        this.zkhn();
    }

    @Override
    public tsw qh(Supplier supplier) {
        return (tsw)super.qh(supplier);
    }

    @Override
    public tsw dk(Runnable runnable) {
        return (tsw)super.dk(runnable);
    }

    public boolean hrsh(String string) {
        return ((String)this.jsn_2).equals(string);
    }

    public String daf_3() {
        return ghsh_2.rhr_2(this, (String)this.dms_4());
    }

    public List shl_2() {
        return this.tds_2().stream().map(this::khnkh).toList();
    }

    @Generated
    public List tds_2() {
        return this.thsn_2;
    }

    private String khnkh(String string) {
        return ghsh_2.rhr_2(this, string);
    }

    private static String shkhk(Enum enum_) {
        if (enum_ instanceof bma_2) {
            return ((bma_2)((Object)enum_)).getName();
        }
        return enum_.name();
    }

    private static String[] n6n6boz10hj8jt(String string) {
        return string.split("\u0003\u001c", -1);
    }

    private static CallSite qzbq2ht9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ fgjap9ty ^ string.hashCode()) + (n2 + szs26j7wq73v6) + i ^ fgjap9ty, 7) + szs26j7wq73v6);
            }
            String[] stringArray = tsw.n6n6boz10hj8jt(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

