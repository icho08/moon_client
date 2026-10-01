/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_5251
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5251;
import us.m0vy.moondlc.m0vyguard.tza_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class fr {
    private static final int kydg2v5tc13 = 165384943;
    private static final int ehoza6grfwo5 = 527442786;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int jqi3rqdegs;

    public static List jhkh_2(class_2561 class_25612, int n) {
        int n2 = -1501628766;
        n2 = Integer.rotateLeft(n2 * -525404133, 20) ^ 0xD75EF840;
        int n3 = (n2 = n ^ n2) ^ 0x207E87C7;
        if ((n3 ^ n2) != 545163207) {
            int cfr_ignored_0 = (0x86007165 ^ n2) - -1371211456;
        }
        ArrayList arrayList = new ArrayList();
        class_25612.method_27658((arg_0, arg_1) -> fr.dkhk(n, arrayList, arg_0, arg_1), class_2583.field_24360);
        return arrayList;
    }

    private static int zdh_10(class_2583 class_25832, int n) {
        class_5251 class_52512;
        int n2 = -650746278;
        n2 = Integer.rotateLeft(n2 * 1205455129, 15) ^ 0xCD10E762;
        class_2583 class_25833 = class_25832;
        n2 = (class_25833 != null ? System.identityHashCode(class_25833) : 0) ^ n2;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 19)) ^ 0x5EC6C184;
        if ((n3 ^ n2) != 1590083972) {
            int cfr_ignored_0 = (0x87F0A7DE ^ n2) + 323364360;
        }
        return (class_52512 = class_25832.method_10973()) != null ? fr.thfk(class_52512) | -832143196 - -815365980 : n;
    }

    private static Optional dkhk(int n, List list, class_2583 class_25832, String string) {
        try {
            int n2 = -1604286339;
            n2 = Integer.rotateLeft(n2 * -940062827, 23) ^ 0xF0D77173;
            n2 = n ^ n2;
            String string2 = string;
            n2 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 14);
            int n3 = n2 ^ 0xAB880E68;
            if ((n3 ^ n2) != -1417146776) {
                int cfr_ignored_0 = (0xBE88615 ^ n2) - 63264500;
            }
            if ((0x30A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (!string.isEmpty()) {
            int n4 = fr.zdh_10(class_25832, n);
            boolean bl = class_25832.method_10984();
            boolean bl2 = class_25832.method_10966();
            boolean bl3 = class_25832.method_10965();
            boolean bl4 = class_25832.method_10986();
            list.add(new tza_2(string, n4, bl, bl2, bl3, bl4));
        }
        return Optional.empty();
    }

    private static int thfk(class_5251 class_52512) {
        block0: {
            int n = 1523450212;
            int n2 = (n = Integer.rotateLeft(n * 801138213, 24) ^ 0x4943BE0B) ^ 0x2982ED69;
            if ((n2 ^ n) == 696446313) break block0;
            int cfr_ignored_0 = (0x734CEC0D ^ n) - 0x78775878;
        }
        return class_52512.method_27716();
    }

    private static String[] ashpd1349bsl(String string) {
        return string.split("\u0005\u001a", -1);
    }

    private static CallSite vhafe1zrr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ kydg2v5tc13 ^ string.hashCode() ^ n2 + ehoza6grfwo5 ^ i * -822495769 ^ kydg2v5tc13, 15) ^ ehoza6grfwo5));
            }
            String[] stringArray = fr.ashpd1349bsl(new String(cArray));
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

