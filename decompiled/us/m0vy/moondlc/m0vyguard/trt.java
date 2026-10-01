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
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bgha;

public final class trt
extends Enum {
    public static final /* enum */ trt tht_4;
    public static final /* enum */ trt rqq;
    public static final /* enum */ trt shsth_2;
    public static final /* enum */ trt khbdh;
    public static final /* enum */ trt swl;
    private final String dzq;
    private final bzw dhtq;
    private final bgha jshq;
    private final bgha dqr;
    private static final trt[] bda_4;
    private static final int ldqy490 = 1806592055;
    private static final int quwbig73yuk = 1689635960;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static trt[] values() {
        return (trt[])bda_4.clone();
    }

    public static trt valueOf(String string) {
        return Enum.valueOf(trt.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private trt(bgha bgha2, bgha bgha3) {
        void var6_4;
        void var5_3;
        void var2_-1;
        void var1_-1;
        this.dzq = bgha2;
        this.dhtq = bgha3;
        this.jshq = var5_3;
        this.dqr = var6_4;
    }

    @Generated
    public String getName() {
        return this.dzq;
    }

    @Generated
    public bzw getCategory() {
        return this.dhtq;
    }

    @Generated
    public bgha getMenuSprite() {
        return this.jshq;
    }

    @Generated
    public bgha getBigMenuSprite() {
        return this.dqr;
    }

    private static trt[] $values() {
        return new trt[]{tht_4, rqq, shsth_2, khbdh, swl};
    }

    private static String[] pvsxqdctq(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite huzhd8xc9ck0z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ldqy490 ^ string.hashCode() ^ n2 + quwbig73yuk ^ i * -286303441 ^ ldqy490, 28) ^ quwbig73yuk));
            }
            String[] stringArray = trt.pvsxqdctq(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

