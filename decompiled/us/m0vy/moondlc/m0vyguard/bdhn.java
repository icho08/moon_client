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
import us.m0vy.moondlc.m0vyguard.sr;

public final class bdhn
extends Enum {
    public static final /* enum */ bdhn htz;
    public static final /* enum */ bdhn zdt;
    public static final /* enum */ bdhn ztm_2;
    public static final /* enum */ bdhn shyf;
    public static final /* enum */ bdhn has_5;
    public static final /* enum */ bdhn thkhj;
    public static final /* enum */ bdhn hhz_4;
    public static final /* enum */ bdhn dst;
    public static final /* enum */ bdhn tay_2;
    public static final /* enum */ bdhn jks;
    public static final /* enum */ bdhn jfy;
    private final sr jwk;
    public final float sj_2;
    private static final bdhn[] khzh_4;
    private static final int itjw1ow4mg3 = 1821672389;
    private static final int xuwn8l97 = 1295741841;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static bdhn[] values() {
        return (bdhn[])khzh_4.clone();
    }

    public static bdhn valueOf(String string) {
        return Enum.valueOf(bdhn.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bdhn() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.jwk = var3_2;
        this.sj_2 = var3_2.dhtz_2;
        var3_2.dhtz_2 += var3_2.getStep();
    }

    @Generated
    public sr getTexture() {
        return this.jwk;
    }

    @Generated
    public float getX() {
        return this.sj_2;
    }

    private static bdhn[] $values() {
        return new bdhn[]{htz, zdt, ztm_2, shyf, has_5, thkhj, hhz_4, dst, tay_2, jks, jfy};
    }

    private static String[] dpel3sjqwlt(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ymvzpeizfp8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ itjw1ow4mg3 ^ string.hashCode()) + (n2 + xuwn8l97) + i ^ itjw1ow4mg3, 11) + xuwn8l97);
            }
            String[] stringArray = bdhn.dpel3sjqwlt(new String(cArray));
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

