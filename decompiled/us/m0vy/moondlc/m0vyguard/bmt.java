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
import java.util.function.Supplier;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.ghsh_2;

public abstract class bmt {
    protected String ddhl;
    protected Object jsn_2;
    protected Supplier dnth = bmt::hss_2;
    protected Runnable tngh;
    private static final int qtwz9hg = 1624073315;
    private static final int zoxjurjqx0yq = 1984937261;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int z7ukiasrr8nxhp;

    public void bth(Object object) {
        this.jsn_2 = object;
    }

    public bmt(String string) {
        this.ddhl = string;
    }

    public String thbb() {
        return this.ddhl;
    }

    public String khth_4() {
        return ghsh_2.sdf_2(this);
    }

    public bmt qh(Supplier supplier) {
        this.dnth = supplier;
        return this;
    }

    public bmt zkh_6(Supplier supplier) {
        return this.qh(supplier);
    }

    public void zkhn() {
        if (this.tngh != null) {
            this.tngh.run();
        }
    }

    protected boolean hlj(Object object) {
        if (this.jsn_2 == null || object == null) {
            return false;
        }
        return this.jsn_2 == object;
    }

    public bmt dk(Runnable runnable) {
        this.tngh = runnable;
        return this;
    }

    public bmt rms(Runnable runnable) {
        return this.dk(runnable);
    }

    public boolean thath() {
        return (Boolean)this.dnth.get();
    }

    public abstract bmt td_3(Object var1);

    @Generated
    public String getName() {
        return this.ddhl;
    }

    @Generated
    public Object dms_4() {
        return this.jsn_2;
    }

    @Generated
    public Supplier thdd_2() {
        return this.dnth;
    }

    @Generated
    public Runnable ssz() {
        return this.tngh;
    }

    @Generated
    public void zzgh_3(String string) {
        this.ddhl = string;
    }

    @Generated
    public void zmy_2(Supplier supplier) {
        this.dnth = supplier;
    }

    @Generated
    public void tmf(Runnable runnable) {
        this.tngh = runnable;
    }

    private static Boolean hss_2() {
        return true;
    }

    private static String[] iu7ub5vk(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ee0g7si2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ qtwz9hg ^ string.hashCode() ^ n2 + zoxjurjqx0yq + i * -1871931369) + qtwz9hg) ^ zoxjurjqx0yq));
            }
            String[] stringArray = bmt.iu7ub5vk(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

