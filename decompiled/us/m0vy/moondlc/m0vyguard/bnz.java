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

public class bnz
extends ttk {
    private final char dhjh_2;
    private final int zww;
    private static final int mnp7lt24pqmk = 436930314;
    private static final int y82cy24fk2qd = -834884377;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int a6313gm87ek;

    @Generated
    public char rad_2() {
        block0: {
            int n = -1316669042;
            n = Integer.rotateLeft(n * 928937259, 8) ^ 0x20A083E2;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0xE0EADCF6;
            if ((n2 ^ n) == -521478922) break block0;
            int cfr_ignored_0 = (0x516FE578 ^ n) - -219393016;
        }
        return this.dhjh_2;
    }

    @Generated
    public int tshkh_2() {
        block0: {
            int n = 1603430706;
            n = Integer.rotateLeft(n * 1882803391, 6) ^ 0x10C235E;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2184CC2A;
            if ((n2 ^ n) == 562351146) break block0;
            int cfr_ignored_0 = (0x7E16A518 ^ n) + 189366415;
        }
        return this.zww;
    }

    @Generated
    public bnz(char c, int n) {
        this.dhjh_2 = c;
        this.zww = n;
    }

    private static String[] oo2zzyrb(String string) {
        return string.split("\u0004\u001a", -1);
    }

    private static CallSite xdo1cqr7s(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ mnp7lt24pqmk ^ string.hashCode() ^ n2 + y82cy24fk2qd + i * -1138718131) + mnp7lt24pqmk) ^ y82cy24fk2qd));
            }
            String[] stringArray = bnz.oo2zzyrb(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

