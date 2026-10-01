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
import us.m0vy.moondlc.m0vyguard.byq;

public final class qk
extends Enum {
    public static final /* enum */ qk zhh_2;
    public static final /* enum */ qk tghs;
    public static final /* enum */ qk shtdh_2;
    private final String rsgh;
    private final byq khbf;
    private static final qk[] lgh;
    private static final int pyil2zri3rl = 957372442;
    private static final int lvqwlhlk8i1c = -1718550306;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static qk[] values() {
        return (qk[])lgh.clone();
    }

    public static qk valueOf(String string) {
        return Enum.valueOf(qk.class, string);
    }

    public static qk get(String string) {
        for (qk qk2 : qk.values()) {
            if (!qk2.getName().equalsIgnoreCase(string)) continue;
            return qk2;
        }
        return shtdh_2;
    }

    @Generated
    public String getName() {
        return this.rsgh;
    }

    @Generated
    public byq getColor() {
        return this.khbf;
    }

    /*
     * WARNING - void declaration
     */
    @Generated
    private qk() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rsgh = var3_2;
        this.khbf = var4_1;
    }

    private static qk[] $values() {
        return new qk[]{zhh_2, tghs, shtdh_2};
    }

    private static String[] dly15649fpugj7(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite eupimd0ch5kej(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ pyil2zri3rl ^ string.hashCode() ^ n2 + lvqwlhlk8i1c ^ i * 782478753 ^ pyil2zri3rl, 21) ^ lvqwlhlk8i1c));
            }
            String[] stringArray = qk.dly15649fpugj7(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

