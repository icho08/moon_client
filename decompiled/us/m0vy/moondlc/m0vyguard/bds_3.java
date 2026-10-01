/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.NonNull
 *  net.minecraft.class_243
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.NonNull;
import net.minecraft.class_243;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;

public class bds_3 {
    private static final jkh drh;
    private final long dzdh;
    private final fa_2 za_2;
    private final fa_2 rkhj;
    private final fa_2 htt;
    private static final int a7ut6sjn = 745283023;
    private static final int m5ope9u = -220095157;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ehzfgmq0xqsi;

    public bds_3(long l, jkh jkh2) {
        this.dzdh = l;
        this.za_2 = new fa_2(l, jkh2);
        this.rkhj = new fa_2(l, jkh2);
        this.htt = new fa_2(l, jkh2);
    }

    public bds_3(long l) {
        this(l, drh);
    }

    public bds_3(long l, class_243 class_2432, jkh jkh2) {
        this.dzdh = l;
        this.za_2 = new fa_2(l, (float)class_2432.method_10216(), jkh2);
        this.rkhj = new fa_2(l, (float)class_2432.method_10214(), jkh2);
        this.htt = new fa_2(l, (float)class_2432.method_10215(), jkh2);
    }

    public bds_3(long l, class_243 class_2432) {
        this(l, class_2432, drh);
    }

    public void khk(@NonNull class_243 class_2432) {
        if (class_2432 == null) {
            throw new NullPointerException("vec is marked non-null but is null");
        }
        this.za_2.atth_2((float)class_2432.method_10216());
        this.rkhj.atth_2((float)class_2432.method_10214());
        this.htt.atth_2((float)class_2432.method_10215());
    }

    public class_243 brr() {
        return new class_243((double)((int)this.za_2.tssh_2()), (double)((int)this.rkhj.tssh_2()), (double)((int)this.htt.tssh_2()));
    }

    public void dhthdh(jkh jkh2) {
        this.za_2.dam_2(jkh2);
        this.rkhj.dam_2(jkh2);
        this.htt.dam_2(jkh2);
    }

    public void ghst(long l) {
        this.za_2.zkhdh(l);
        this.rkhj.zkhdh(l);
        this.htt.zkhdh(l);
    }

    public void khkhdh(@NonNull class_243 class_2432) {
        if (class_2432 == null) {
            throw new NullPointerException("vec is marked non-null but is null");
        }
        this.za_2.atth_2((float)class_2432.method_10216());
        this.rkhj.atth_2((float)class_2432.method_10214());
        this.htt.atth_2((float)class_2432.method_10215());
    }

    private static String[] bvoac5h64ozb(String string) {
        return string.split("\u0004\u0017", -1);
    }

    private static CallSite rxnp4j0z0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ a7ut6sjn ^ string.hashCode()) + (n2 + m5ope9u) + i ^ a7ut6sjn, 23) + m5ope9u);
            }
            String[] stringArray = bds_3.bvoac5h64ozb(new String(cArray));
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

