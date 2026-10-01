/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.runtime.ObjectMethods;
import us.m0vy.moondlc.m0vyguard.tkhs;

public final class tbs
extends Record {
    private final float dan_2;
    private final float khkd;
    private final float khash_2;
    private final float rjz_2;
    private static final int cvjjguqm0c = -1235401876;
    private static final int l2ii4wf4 = -1720658585;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cn4qcuul2260a;

    public tbs(float f, float f2, float f3, float f4) {
        this.dan_2 = f;
        this.khkd = f2;
        this.khash_2 = f3;
        this.rjz_2 = f4;
    }

    public boolean contains(double d, double d2) {
        return tkhs.hd_3(d, d2, this.dan_2, this.khkd, this.khash_2, this.rjz_2);
    }

    public float x() {
        return this.dan_2;
    }

    public float y() {
        return this.khkd;
    }

    public float width() {
        return this.khash_2;
    }

    public float height() {
        return this.rjz_2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tbs.class, "x;y;width;height", "دعن", "خكد", "خعش", "رجظ"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tbs.class, "x;y;width;height", "دعن", "خكد", "خعش", "رجظ"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tbs.class, "x;y;width;height", "دعن", "خكد", "خعش", "رجظ"}, this, object);
    }

    private static String[] l74lyuwly4y(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite mmvh16wvyrgvs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ cvjjguqm0c ^ string.hashCode() ^ n2 + l2ii4wf4 + i * 1566635811) + cvjjguqm0c) ^ l2ii4wf4));
            }
            String[] stringArray = tbs.l74lyuwly4y(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

