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
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.lb;

public class bqkh {
    private static final jkh twk;
    private final fa_2 khbkh;
    private final fa_2 bthdh;
    private static final int d3pwgyb2 = -297811200;
    private static final int tlvvfj4cmq = 181851642;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int a87xgymu3;

    public bqkh(long l, long l2, jkh jkh2) {
        this.khbkh = new fa_2(l, jkh2);
        this.bthdh = new fa_2(l2, jkh2);
    }

    public bqkh(long l) {
        this(l, l, twk);
    }

    public bqkh(long l, long l2, lb lb2, jkh jkh2) {
        this.khbkh = new fa_2(l, lb2.sry(), jkh2);
        this.bthdh = new fa_2(l2, lb2.khdhd_2(), jkh2);
    }

    public bqkh(long l, lb lb2) {
        this(l, l, lb2, twk);
    }

    public void kdh(@NonNull lb lb2) {
        if (lb2 == null) {
            throw new NullPointerException("rotation is marked non-null but is null");
        }
        this.khbkh.khmf(lb2.sry());
        this.bthdh.khmf(lb2.khdhd_2());
    }

    public lb zya_3() {
        return new lb(this.khbkh.tssh_2(), this.bthdh.tssh_2());
    }

    public void dta_5(long l) {
        this.khbkh.zkhdh(l);
    }

    public void ghkh(long l) {
        this.bthdh.zkhdh(l);
    }

    public void jkhh(jkh jkh2) {
        this.khbkh.dam_2(jkh2);
        this.bthdh.dam_2(jkh2);
    }

    public void smkh(@NonNull lb lb2) {
        if (lb2 == null) {
            throw new NullPointerException("rotation is marked non-null but is null");
        }
        this.khbkh.atth_2(lb2.sry());
        this.bthdh.atth_2(lb2.khdhd_2());
    }

    private static String[] yjpt49qc96q(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite g6m8881p(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ d3pwgyb2 ^ string.hashCode() ^ n2 + tlvvfj4cmq + i * -37535709) + d3pwgyb2) ^ tlvvfj4cmq));
            }
            String[] stringArray = bqkh.yjpt49qc96q(new String(cArray));
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

