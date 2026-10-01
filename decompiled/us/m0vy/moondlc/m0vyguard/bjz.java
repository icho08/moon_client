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
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.ngh;

public class bjz {
    private long bja = 0L;
    private long khws = 0L;
    private double dbj = 0.0;
    private double dhfth = 0.0;
    private double shqb = 0.0;
    private tbm jzt_3 = tbm.bthth;
    private static final int vwtdckg6p078c = 666528100;
    private static final int hnjbqkpb30be = -1471220160;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int cum6d5db;

    public bjz bghkh(float f, long l, tbm tbm2) {
        return this.sbsh_2(f, l, tbm2, false);
    }

    public bjz shd_6(double d, long l, tbm tbm2) {
        return this.sbsh_2(d, l, tbm2, false);
    }

    public bjz sbsh_2(double d, long l, tbm tbm2, boolean bl) {
        if (!this.dyd_3(bl, d)) {
            this.jzt_3 = tbm2;
            this.khws = l;
            this.bja = System.currentTimeMillis();
            this.dbj = this.shqb;
            this.dhfth = d;
        }
        return this;
    }

    public boolean ddhdh() {
        boolean bl = this.shghl();
        if (bl) {
            this.shqb = ngh.dhsth(this.dbj, this.dhfth, this.jzt_3.apply(this.dhtdh_2()));
        } else {
            this.bja = 0L;
            this.shqb = this.dhfth;
        }
        return bl;
    }

    public boolean shghl() {
        return !this.hght_2();
    }

    public boolean hght_2() {
        return this.dhtdh_2() >= 1.0;
    }

    private double dhtdh_2() {
        return (double)(System.currentTimeMillis() - this.bja) / (double)this.khws;
    }

    private boolean dyd_3(boolean bl, double d) {
        return bl && this.shghl() && (d == this.dbj || d == this.dhfth || d == this.shqb);
    }

    @Generated
    public void shh(long l) {
        this.khws = l;
    }

    @Generated
    public double tzkh_2() {
        return this.dbj;
    }

    @Generated
    public double dthdh() {
        return this.dhfth;
    }

    @Generated
    public void shkh_6(double d) {
        this.shqb = d;
    }

    @Generated
    public double khbk() {
        return this.shqb;
    }

    @Generated
    public void th_3(tbm tbm2) {
        this.jzt_3 = tbm2;
    }

    private static String[] iytq5fbj2ng8(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite l0s548jh4gtv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vwtdckg6p078c ^ string.hashCode()) + (n2 + hnjbqkpb30be) + i ^ vwtdckg6p078c, 11) + hnjbqkpb30be);
            }
            String[] stringArray = bjz.iytq5fbj2ng8(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

