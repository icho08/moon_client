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
import us.m0vy.moondlc.m0vyguard.brt_2;
import us.m0vy.moondlc.m0vyguard.ttk;

public class ttt
extends ttk {
    private boolean dhal;
    private static final int prbphul4 = -1069753259;
    private static final int z421zbqb8n1u = -1764929039;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ql9m4cb2;

    public void dhtd_2() {
        int n = brt_2.khqz_2(2018859803);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x98B28173;
        if ((n2 ^ n) != -1733131917) {
            int cfr_ignored_0 = Integer.rotateLeft(0xE0E7DA68 ^ n, 15) + 1081151955;
        }
        this.dhal = true;
    }

    @Generated
    public boolean tsm_3() {
        block0: {
            int n = 1466847694;
            int n2 = (n = Integer.rotateLeft(n * 970282857, 9) ^ 0x131EB54E) ^ 0x5032A8B5;
            if ((n2 ^ n) == 1345497269) break block0;
            int cfr_ignored_0 = (0x75CF97B ^ n) + 1761174699;
        }
        return this.dhal;
    }

    private static String[] nuz36x36(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite at4yvczo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ prbphul4 ^ string.hashCode() ^ n2 + z421zbqb8n1u + i * -1877441771) + prbphul4) ^ z421zbqb8n1u));
            }
            String[] stringArray = ttt.nuz36x36(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

