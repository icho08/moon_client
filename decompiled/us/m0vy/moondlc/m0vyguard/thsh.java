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
import java.util.List;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.bsw_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.bhn_2;

public class thsh {
    private List shjq;
    private final List thqd_2;
    private int jas_2 = 0;
    private final bhn_2 hy;
    private static final int znz_2 = 0;
    private static final int syh = 1;
    private static final int dhys_2 = 2;
    private static final int qs_2 = 3;
    private static final int u1rt0jbjuona5 = -427389152;
    private static final int dviyk2v6 = 388686471;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jg3sfvgh23;

    public thsh(List list, long l) {
        if (list.size() != 4) {
            throw new IllegalArgumentException("Requires 4 colors - Gradient.of throw exception");
        }
        this.shjq = new ArrayList(list);
        this.thqd_2 = new ArrayList(list);
        this.hy = new bhn_2(l, bdz.jadh_2);
    }

    public void jhr() {
        float f = this.hy.hnf();
        this.hy.sqm(1000L);
        bkt bkt2 = ((bkt)this.shjq.get(0)).shbm(0.0f);
        if (this.jas_2 == 0) {
            this.thqd_2.set(0, ((bkt)this.shjq.get(0)).ttz_8(bkt2, f));
            this.thqd_2.set(1, bkt2.ttz_8((bkt)this.shjq.get(1), f));
        }
        if (this.jas_2 == 1) {
            this.thqd_2.set(2, ((bkt)this.shjq.get(2)).ttz_8(bkt2, f));
            this.thqd_2.set(0, bkt2.ttz_8((bkt)this.shjq.get(0), f));
        }
        if (this.jas_2 == 2) {
            this.thqd_2.set(3, ((bkt)this.shjq.get(3)).ttz_8(bkt2, f));
            this.thqd_2.set(2, bkt2.ttz_8((bkt)this.shjq.get(2), f));
        }
        if (this.jas_2 == 3) {
            this.thqd_2.set(1, ((bkt)this.shjq.get(1)).ttz_8(bkt2, f));
            this.thqd_2.set(3, bkt2.ttz_8((bkt)this.shjq.get(3), f));
        }
        if (this.hy.hnf() == 1.0f) {
            this.hy.bzs_2();
            ++this.jas_2;
            if (this.jas_2 >= this.thqd_2.size()) {
                this.jas_2 = 0;
            }
        }
        this.hy.thdhsh(1.0f);
    }

    public bsw_2 zhdh_4() {
        return bsw_2.shtl_2((bkt)this.thqd_2.get(0), (bkt)this.thqd_2.get(1), (bkt)this.thqd_2.get(2), (bkt)this.thqd_2.get(3));
    }

    @Generated
    public List dhd_5() {
        return this.shjq;
    }

    private static String[] evwj649dax8v(String string) {
        return string.split("\u0005\u001a", -1);
    }

    private static CallSite qvpwqkzmbcs3qq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ u1rt0jbjuona5 ^ string.hashCode() ^ n2 + dviyk2v6 + i * 792776393) + u1rt0jbjuona5) ^ dviyk2v6));
            }
            String[] stringArray = thsh.evwj649dax8v(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

