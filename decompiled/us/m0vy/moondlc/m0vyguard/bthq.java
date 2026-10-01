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

public final class bthq
extends Enum {
    public static final /* enum */ bthq rbd;
    public static final /* enum */ bthq dks;
    private final String taj;
    private final float rfdh;
    private final float dsgh_2;
    private final float ss_4;
    public float rwr;
    private static final bthq[] dwz_2;
    private static final int qelwnv840 = -1905797933;
    private static final int nje5vci8zrzv0 = 1877391336;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static bthq[] values() {
        return (bthq[])dwz_2.clone();
    }

    public static bthq valueOf(String string) {
        return Enum.valueOf(bthq.class, string);
    }

    @Generated
    public String getTexture() {
        return this.taj;
    }

    @Generated
    public float getWidth() {
        return this.rfdh;
    }

    @Generated
    public float getHeight() {
        return this.dsgh_2;
    }

    @Generated
    public float getStep() {
        return this.ss_4;
    }

    @Generated
    public float getX() {
        return this.rwr;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private bthq(float f, float f2) {
        void var6_4;
        void var5_3;
        void var2_-1;
        void var1_-1;
        this.taj = (String)f;
        this.rfdh = f2;
        this.dsgh_2 = var5_3;
        this.ss_4 = var6_4;
    }

    private static bthq[] $values() {
        return new bthq[]{rbd, dks};
    }

    private static String[] zweuhe7qsk5(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite g1zj78079w(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ qelwnv840 ^ string.hashCode() ^ n2 + nje5vci8zrzv0 + i * -68673123) + qelwnv840) ^ nje5vci8zrzv0));
            }
            String[] stringArray = bthq.zweuhe7qsk5(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

