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
import us.m0vy.moondlc.m0vyguard.bthm;
import us.m0vy.moondlc.m0vyguard.ttk;

public class kb
extends ttk {
    private final int dhthd_2;
    private final int hsb;
    private static final int efft289g54yh = 1855627778;
    private static final int pwzdg43v = 1898945359;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rz598j08;

    @Generated
    public int dnd_3() {
        block0: {
            int n = bthm.ghsn_2(-1042749501);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0xD759F176;
            if ((n2 ^ n) == -681971338) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x168116B5 ^ n, 5) - -1107337434) * 377558709;
            int cfr_ignored_1 = (int)(0xD433B88827D4EB4FL ^ (long)n ^ 0x8C60831A2DB805B6L);
        }
        return this.dhthd_2;
    }

    @Generated
    public int zthgh_2() {
        block0: {
            int n = -1523906741;
            int n2 = (n = Integer.rotateLeft(n * 10928881, 26) ^ 0xC2DC00F9) ^ 0x5A728650;
            if ((n2 ^ n) == 1517454928) break block0;
            int cfr_ignored_0 = (0xFF59811B ^ n) + -1316115990;
        }
        return this.hsb;
    }

    @Generated
    public kb(int n, int n2) {
        this.dhthd_2 = n;
        this.hsb = n2;
    }

    private static String[] z52kahhge(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yvx287gc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ efft289g54yh ^ string.hashCode()) + (n2 + pwzdg43v) + i ^ efft289g54yh, 28) + pwzdg43v);
            }
            String[] stringArray = kb.z52kahhge(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

