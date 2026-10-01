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
import us.m0vy.moondlc.m0vyguard.ttk;

public class thgh_3
extends ttk {
    private final float shz_5;
    private final float shmsh;
    private final int thys_2;
    private static final int wlg5rt6hspco = -1637978660;
    private static final int x3fyh65g8g = -221006693;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wks21qunjkyux;

    @Generated
    public float hj_2() {
        block0: {
            int n = -1159450456;
            n = Integer.rotateLeft(n * 1040333217, 18) ^ 0xAD4D86FF;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0x213C10AB;
            if ((n2 ^ n) == 557584555) break block0;
            int cfr_ignored_0 = (0x9BD82003 ^ n) - 1055910974;
        }
        return this.shz_5;
    }

    @Generated
    public float khkth() {
        block0: {
            int n = 1000474749;
            n = Integer.rotateLeft(n * 2098641691, 24) ^ 0xA4FFE430;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 29);
            int n2 = n ^ 0x1C718D1B;
            if ((n2 ^ n) == 477203739) break block0;
            int cfr_ignored_0 = (0x27D38566 ^ n) - -2087293408;
        }
        return this.shmsh;
    }

    @Generated
    public int hah() {
        block0: {
            int n = -584450634;
            n = Integer.rotateLeft(n * -576158967, 12) ^ 0x4688D77A;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x54FE7C8;
            if ((n2 ^ n) == 89122760) break block0;
            int cfr_ignored_0 = (0xD8661A7E ^ n) - -1951827510;
        }
        return this.thys_2;
    }

    @Generated
    public thgh_3(float f, float f2, int n) {
        this.shz_5 = f;
        this.shmsh = f2;
        this.thys_2 = n;
    }

    private static String[] ow59vxcpwun6(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite v8a1orzd9u4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wlg5rt6hspco ^ string.hashCode() ^ n2 + x3fyh65g8g ^ i * 1586059561 ^ wlg5rt6hspco, 25) ^ x3fyh65g8g));
            }
            String[] stringArray = thgh_3.ow59vxcpwun6(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

