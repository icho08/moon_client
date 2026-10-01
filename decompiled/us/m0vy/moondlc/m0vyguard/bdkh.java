/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bjf;
import us.m0vy.moondlc.m0vyguard.bdt_4;
import us.m0vy.moondlc.m0vyguard.blgh;
import us.m0vy.moondlc.m0vyguard.bwd_2;
import us.m0vy.moondlc.m0vyguard.md_2;
import us.m0vy.moondlc.m0vyguard.yr;

public class bdkh {
    private static final int h7jdd3m7pfpnr = -921205645;
    private static final int pmkbaat6hcby = -1589048049;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tndl2wki4xi;

    private bdkh() {
    }

    public static bdt_4 dhyd() {
        int n = md_2.takh(4703933);
        int n2 = n ^ 0x7A2D9BB9;
        if ((n2 ^ n) != 2049809337) {
            int cfr_ignored_0 = Integer.rotateLeft(0x7A6A5D04 ^ n, 18) - -683744585;
        }
        return new bjf();
    }

    public static bdt_4 dhmth() {
        int n = 1073294751;
        int n2 = (n = Integer.rotateLeft(n * 1999336503, 5) ^ 0x59904095) ^ 0x21A9BA43;
        if ((n2 ^ n) != 564771395) {
            int cfr_ignored_0 = (0x1E5097DC ^ n) + -180677184;
        }
        return new yr();
    }

    public static bdt_4 awj() {
        int n = 2020455595;
        int n2 = (n = Integer.rotateLeft(n * -1659277251, 27) ^ 0x91335E83) ^ 0x52F5C677;
        if ((n2 ^ n) != 1391838839) {
            int cfr_ignored_0 = (0x2A9872DC ^ n) - 997414955;
        }
        return new bwd_2();
    }

    public static bdt_4 swn() {
        int n = 1844173048;
        int n2 = (n = Integer.rotateLeft(n * -905972303, 25) ^ 0xB2995312) ^ 0x5D2A7B23;
        if ((n2 ^ n) != 1563065123) {
            int cfr_ignored_0 = (0x30C1A3DB ^ n) + -2039443575;
        }
        return new blgh();
    }

    private static String[] dnth7vyrou(String string) {
        return string.split("\u0007\u0010", -1);
    }

    private static CallSite mwt8co7bxzhl4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ h7jdd3m7pfpnr ^ string.hashCode() ^ n2 + pmkbaat6hcby ^ i * -221052361 ^ h7jdd3m7pfpnr, 24) ^ pmkbaat6hcby));
            }
            String[] stringArray = bdkh.dnth7vyrou(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

