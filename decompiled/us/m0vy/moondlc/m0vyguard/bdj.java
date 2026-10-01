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
import us.m0vy.moondlc.m0vyguard.bhs_2;

public final class bdj
extends Enum {
    public static final /* enum */ bdj zly;
    public static final /* enum */ bdj dhja;
    public static final /* enum */ bdj dhht_3;
    public static final /* enum */ bdj shrd;
    public static final /* enum */ bdj dqz;
    private final String thshl;
    private static final bdj[] khzy_2;
    private static final int vln1nnh = 420980786;
    private static final int ni00a5jwdf = -441053152;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static bdj[] values() {
        block0: {
            int n = 1978643230;
            int n2 = (n = Integer.rotateLeft(n * -1680471695, 14) ^ 0xE086D4FC) ^ 0xB0B5CEB0;
            if ((n2 ^ n) == -1330262352) break block0;
            int cfr_ignored_0 = (0xC55A7DAE ^ n) + -408158661;
        }
        return (bdj[])khzy_2.clone();
    }

    public static bdj valueOf(String string) {
        block0: {
            int n = -521982809;
            n = Integer.rotateLeft(n * 545094241, 28) ^ 0xE0BA815E;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
            int n2 = n ^ 0xD83A6197;
            if ((n2 ^ n) == -667262569) break block0;
            int cfr_ignored_0 = (0x38D94D30 ^ n) + 473200272;
        }
        return (bdj)bdj.aly97lmcrcbcr(bdj.class, string);
    }

    @Generated
    public String getLabel() {
        block0: {
            int n = 1808491697;
            n = Integer.rotateLeft(n * 345922251, 7) ^ 0x7FF453E0;
            n = System.identityHashCode((Object)this) ^ n;
            int n2 = n ^ 0x27578C29;
            if ((n2 ^ n) == 660048937) break block0;
            int cfr_ignored_0 = (0x4C9CE898 ^ n) - 574377260;
        }
        return this.thshl;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private bdj() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.thshl = var3_2;
    }

    private static bdj[] $values() {
        int n = 332402124;
        int n2 = (n = Integer.rotateLeft(n * 1209525257, 6) ^ 0xE30FC4E7) ^ 0x6FE30027;
        if ((n2 ^ n) != 1877147687) {
            int cfr_ignored_0 = (0x7C330DEB ^ n) + -1679568212;
        }
        return new bdj[]{zly, dhja, dhht_3, shrd, dqz};
    }

    private static Enum aly97lmcrcbcr(Class clazz, String string) {
        block0: {
            int n = bhs_2.rqth(-1501762585);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 11);
            int n2 = n ^ 0xA9490462;
            if ((n2 ^ n) == -1454832542) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF35EF85 ^ n, 4) - -605708202;
            int cfr_ignored_1 = (int)(0xCD8741B827D4EB4FL ^ (long)n ^ 0x7E00831A2DB836DFL);
        }
        return Enum.valueOf(clazz, string);
    }

    private static String[] kulpqdf8c8x2(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite c1o1o172oo3bb5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vln1nnh ^ string.hashCode()) + (n2 + ni00a5jwdf) + i ^ vln1nnh, 15) + ni00a5jwdf);
            }
            String[] stringArray = bdj.kulpqdf8c8x2(new String(cArray));
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

