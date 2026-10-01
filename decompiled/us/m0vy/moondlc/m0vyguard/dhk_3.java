/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="GuiMove", category=bzw.OTHER, desc="Provides movement handling in inventory screens")
public class dhk_3
extends bnq {
    private static final int zyhzg5oe3qbrf = 585652625;
    private static final int cxhu7b4x = 2039526479;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int phw096e2iio;

    public dhk_3() {
        this.sdhdh(true);
    }

    public void khlm(boolean bl) {
        block0: {
            int n = 569211069;
            int n2 = (n = Integer.rotateLeft(n * -774668793, 4) ^ 0x30D4D55E) ^ 0x2A4653C8;
            if ((n2 ^ n) == 709252040) break block0;
            int cfr_ignored_0 = (0xBAB2B75 ^ n) - 292476928;
        }
    }

    public boolean thghth() {
        block0: {
            int n = 1814700832;
            int n2 = (n = Integer.rotateLeft(n * -1659518715, 19) ^ 0xE0FA4D1D) ^ 0x7BC12BD;
            if ((n2 ^ n) == 129766077) break block0;
            int cfr_ignored_0 = (0x6B96319D ^ n) + -1555055192;
        }
        return false;
    }

    private static String[] wojalt9vded(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite c7y9j30s9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zyhzg5oe3qbrf ^ string.hashCode() ^ n2 + cxhu7b4x + i * -769888769) + zyhzg5oe3qbrf) ^ cxhu7b4x));
            }
            String[] stringArray = dhk_3.wojalt9vded(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

