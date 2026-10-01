/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1799
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1799;
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.sgh_2;

public class byth
extends ttk {
    public class_1799 ddhs;
    public int tdhh_2;
    private static final int doyn7veag = -2111215523;
    private static final int jy0eyvq = -1359801860;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int d9lvnl60k;

    public byth(class_1799 class_17992, int n) {
        this.ddhs = class_17992;
        this.tdhh_2 = n;
    }

    @Generated
    public class_1799 asm_3() {
        block0: {
            int n = sgh_2.dnz_4(69590919);
            int n2 = n ^ 0x339EA15;
            if ((n2 ^ n) == 54127125) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x71C3592 ^ n, 3) + -523756567) * 119289235;
        }
        return this.ddhs;
    }

    @Generated
    public int rths() {
        block0: {
            int n = sgh_2.dnz_4(-2062703196);
            int n2 = n ^ 0xD464902;
            if ((n2 ^ n) == 222710018) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x884BECA6 ^ n, 4) - -2054207659;
        }
        return this.tdhh_2;
    }

    private static String[] n2v1549ne(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite zg6ni6pao(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ doyn7veag ^ string.hashCode() ^ n2 + jy0eyvq + i * 1026630939) + doyn7veag) ^ jy0eyvq));
            }
            String[] stringArray = byth.n2v1549ne(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

