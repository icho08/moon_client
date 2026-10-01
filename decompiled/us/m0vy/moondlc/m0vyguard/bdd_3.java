/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.NonNull
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.NonNull;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;

public class bdd_3 {
    private static final jkh hsz_3;
    private final long thghkh;
    private final fa_2 thws_2;
    private final fa_2 saz_6;
    private final fa_2 jqa_2;
    private final fa_2 thdhd;
    private static final int jeijww28 = 1088019022;
    private static final int z9pfvetab = -384391484;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int kl0pjdr1fqj1o;

    public bdd_3(long l, jkh jkh2) {
        this.thghkh = l;
        this.thws_2 = new fa_2(l, jkh2);
        this.saz_6 = new fa_2(l, jkh2);
        this.jqa_2 = new fa_2(l, jkh2);
        this.thdhd = new fa_2(l, jkh2);
    }

    public bdd_3(long l) {
        this(l, hsz_3);
    }

    public bdd_3(long l, byq byq2, jkh jkh2) {
        this.thghkh = l;
        this.thws_2 = new fa_2(l, byq2.sbk(), jkh2);
        this.saz_6 = new fa_2(l, byq2.srl(), jkh2);
        this.jqa_2 = new fa_2(l, byq2.shsl_2(), jkh2);
        this.thdhd = new fa_2(l, byq2.tzdh_2(), jkh2);
    }

    public bdd_3(long l, byq byq2) {
        this(l, byq2, hsz_3);
    }

    public void zsa_8(@NonNull byq byq2) {
        if (byq2 == null) {
            throw new NullPointerException("targetColor is marked non-null but is null");
        }
        this.thws_2.khmf(byq2.sbk());
        this.saz_6.khmf(byq2.srl());
        this.jqa_2.khmf(byq2.shsl_2());
        this.thdhd.khmf(byq2.tzdh_2());
    }

    public byq dsr_4() {
        return new byq((int)this.thws_2.tssh_2(), (int)this.saz_6.tssh_2(), (int)this.jqa_2.tssh_2(), (int)this.thdhd.tssh_2());
    }

    public void khngh(jkh jkh2) {
        this.thws_2.dam_2(jkh2);
        this.saz_6.dam_2(jkh2);
        this.jqa_2.dam_2(jkh2);
        this.thdhd.dam_2(jkh2);
    }

    public void djn(long l) {
        this.thws_2.zkhdh(l);
        this.saz_6.zkhdh(l);
        this.jqa_2.zkhdh(l);
        this.thdhd.zkhdh(l);
    }

    public void all_2(@NonNull byq byq2) {
        if (byq2 == null) {
            throw new NullPointerException("color is marked non-null but is null");
        }
        this.thws_2.atth_2(byq2.sbk());
        this.saz_6.atth_2(byq2.srl());
        this.jqa_2.atth_2(byq2.shsl_2());
        this.thdhd.atth_2(byq2.tzdh_2());
    }

    private static String[] vasel6xs1nfcrc(String string) {
        return string.split("\u0002\u0011", -1);
    }

    private static CallSite c4139drsg7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jeijww28 ^ string.hashCode() ^ n2 + z9pfvetab + i * 1243249469) + jeijww28) ^ z9pfvetab));
            }
            String[] stringArray = bdd_3.vasel6xs1nfcrc(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

