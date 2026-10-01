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
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.qk;

public class tjdh {
    private final qk sbn;
    private final String khghk;
    private final tkhd_2 ddn = new tkhd_2();
    private final long ththd_2;
    private final fa_2 hsh_3 = new fa_2(300L, jkh.hths_2);
    private final fa_2 thghd_2 = new fa_2(300L, jkh.shhj);
    private static final int i2xyvx9ode94o = 1670914578;
    private static final int hwqngihv = -1283494844;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qba8fod9i;

    public tjdh(qk qk2, String string) {
        this.sbn = qk2;
        this.khghk = string;
        this.ththd_2 = 1000L;
    }

    public void htd_4() {
        this.hsh_3.khmf(this.ddn.tagh(this.ththd_2) ? 0.0f : 1.0f);
    }

    public boolean tja() {
        return this.hsh_3.tssh_2() == 0.0f && this.ddn.tagh(this.ththd_2);
    }

    @Generated
    public qk sna_4() {
        return this.sbn;
    }

    @Generated
    public String wa_2() {
        return this.khghk;
    }

    @Generated
    public tkhd_2 sagh_3() {
        return this.ddn;
    }

    @Generated
    public long ghsth() {
        return this.ththd_2;
    }

    @Generated
    public fa_2 thr() {
        return this.hsh_3;
    }

    @Generated
    public fa_2 sthz_2() {
        return this.thghd_2;
    }

    private static String[] hnbnzkeuy(String string) {
        return string.split("\u0006\u0018", -1);
    }

    private static CallSite a7xfs4j96ksh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ i2xyvx9ode94o ^ string.hashCode() ^ n2 + hwqngihv ^ i * -522130289 ^ i2xyvx9ode94o, 8) ^ hwqngihv));
            }
            String[] stringArray = tjdh.hnbnzkeuy(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

