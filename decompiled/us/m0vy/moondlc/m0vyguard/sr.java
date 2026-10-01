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

public final class sr
extends Enum {
    public static final /* enum */ sr shshdh;
    public static final /* enum */ sr zjd;
    private final String zhdh_2;
    private final float hthq;
    private final float ft_2;
    private final float dhtgh_2;
    public float dhtz_2;
    private static final sr[] dhaw;
    private static final int vus78c9xa7qy = -1038844564;
    private static final int fxvolham = 404345773;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static sr[] values() {
        return (sr[])dhaw.clone();
    }

    public static sr valueOf(String string) {
        return Enum.valueOf(sr.class, string);
    }

    @Generated
    public String getTexture() {
        return this.zhdh_2;
    }

    @Generated
    public float getWidth() {
        return this.hthq;
    }

    @Generated
    public float getHeight() {
        return this.ft_2;
    }

    @Generated
    public float getStep() {
        return this.dhtgh_2;
    }

    @Generated
    public float getX() {
        return this.dhtz_2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private sr(float f, float f2) {
        void var6_4;
        void var5_3;
        void var2_-1;
        void var1_-1;
        this.zhdh_2 = (String)f;
        this.hthq = f2;
        this.ft_2 = var5_3;
        this.dhtgh_2 = var6_4;
    }

    private static sr[] $values() {
        return new sr[]{shshdh, zjd};
    }

    private static String[] atxoinj9uloh(String string) {
        return string.split("\u0004\u0012", -1);
    }

    private static CallSite pm9cl0tfh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vus78c9xa7qy ^ string.hashCode()) + (n2 + fxvolham) + i ^ vus78c9xa7qy, 8) + fxvolham);
            }
            String[] stringArray = sr.atxoinj9uloh(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

