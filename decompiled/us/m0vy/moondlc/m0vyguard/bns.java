/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tshb;

public class bns {
    private final tshb shthkh = new tshb();
    private final tshb shsgh_2 = new tshb();
    private static final int psq2jlpi70ssb = -547638971;
    private static final int vpaq6ht = -496732791;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ihatmd4qb;

    public taj skhsh(taj taj2, int n, int n2) {
        return new taj(this.shthkh.qm(taj2.dda_3(), n), this.shsgh_2.qm(taj2.shyq(), n2));
    }

    public float qgh() {
        return this.shthkh.dhbm();
    }

    public float awk() {
        return this.shsgh_2.dhbm();
    }

    public bns szsh_4(tbm tbm2) {
        this.shthkh.zas_4(tbm2);
        this.shthkh.zas_4(tbm2);
        return this;
    }

    private static String[] vor993wr46(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ms4ugx5ztec56(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ psq2jlpi70ssb ^ string.hashCode() ^ n2 + vpaq6ht + i * -1077721009) + psq2jlpi70ssb) ^ vpaq6ht));
            }
            String[] stringArray = bns.vor993wr46(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

