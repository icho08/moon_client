/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1293
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1812
 *  net.minecraft.class_1844
 *  net.minecraft.class_6880
 *  net.minecraft.class_9334
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_1293;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1812;
import net.minecraft.class_1844;
import net.minecraft.class_6880;
import net.minecraft.class_9334;
import us.m0vy.moondlc.m0vyguard.am;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bfb {
    private static final int bjsh = -1673142124;
    private static final int bshz = 1990314328;
    private static final int khtm = 769348822;
    private static final int khks_2 = 1279723595;
    private static final int wzvla1yjg0 = -1185415653;
    private static final int a4wvy870 = -1788824567;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mprn685xa6;

    public static boolean khskh(class_1799 class_17992, class_6880 class_68802) {
        int n = am.dam(-1329852380);
        class_1799 class_17993 = class_17992;
        n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
        int n2 = n ^ 0xA30D73CF;
        if ((n2 ^ n) != -1559399473) {
            int cfr_ignored_0 = Integer.rotateRight(0x13B163EB ^ n, 5) + 1725479088;
        }
        if (class_17992 != null && !class_17992.method_7960()) {
            if (!(class_17992.method_7909() instanceof class_1812)) {
                return false;
            }
            class_1844 class_18442 = (class_1844)class_17992.method_57824(class_9334.field_49651);
            if (class_18442 == null) {
                return false;
            }
            for (class_1293 class_12932 : class_18442.method_57397()) {
                if (class_12932.method_5579() != class_68802) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    public static List shmw(class_1799 class_17992) {
        try {
            int n = 376087552;
            n = Integer.rotateLeft(n * -1014036139, 6) ^ 0xD2F0C476;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0x6455232A;
            if ((n2 ^ n) != 1683301162) {
                int cfr_ignored_0 = (0x723F872A ^ n) - -1578665877;
            }
            if ((0x34F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bfb.brh_2()) {
            yf.athz_2();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        if (class_17992 == null || bfb.rkth(class_17992)) {
            return arrayList;
        }
        if (!(bfb.snz_3(class_17992) instanceof class_1812)) {
            return arrayList;
        }
        class_1844 class_18442 = (class_1844)class_17992.method_57824(class_9334.field_49651);
        if (class_18442 == null) {
            return arrayList;
        }
        class_18442.method_57397().forEach(arrayList::add);
        return arrayList;
    }

    @Generated
    private bfb() {
        throw new UnsupportedOperationException("This is a utili".concat("ty class and cann").concat("ot be instantiated"));
    }

    private static String ztj_3(String string, int n, int n2, int n3) {
        try {
            int n4 = 459748270;
            n4 = Integer.rotateLeft(n4 * -1815300431, 12) ^ 0x5D404EAF;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateLeft(n3 ^ n4, 13);
            int n5 = n4 ^ 0x4F86CD34;
            if ((n5 ^ n4) != 1334234420) {
                int cfr_ignored_0 = (0x54E1FE9A ^ n4) - -2141830101;
            }
            if ((0x141 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x7EB6F28C) + i ^ bjsh, 13) ^ n2 + bshz));
        }
        return new String(cArray);
    }

    private static boolean brh_2() {
        block0: {
            int n = 2036076091;
            int n2 = (n = Integer.rotateLeft(n * 1306661727, 21) ^ 0x16E7B73C) ^ 0xD9EA1D2C;
            if ((n2 ^ n) == -638968532) break block0;
            int cfr_ignored_0 = (0xA0B61317 ^ n) + 1140518884;
        }
        return yf.khdha_2();
    }

    private static boolean rkth(class_1799 class_17992) {
        block0: {
            int n = 1918714912;
            n = Integer.rotateLeft(n * -1279942067, 12) ^ 0x66A079C4;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateRight((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 7);
            int n2 = n ^ 0xC29E9E03;
            if ((n2 ^ n) == -1029792253) break block0;
            int cfr_ignored_0 = (0xB0C3DA23 ^ n) + 1607621065;
        }
        return class_17992.method_7960();
    }

    private static class_1792 snz_3(class_1799 class_17992) {
        block0: {
            int n = am.dam(-261110822);
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0x17C7BE02;
            if ((n2 ^ n) == 398966274) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE7A87DD8 ^ n, 15) + 298114147) * -408388135;
        }
        return class_17992.method_7909();
    }

    private static String[] rtz_4(String string) {
        int n = 867553176;
        n = Integer.rotateLeft(n * -369080955, 14) ^ 0x6DE8716E;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x6E23D32D;
        if ((n2 ^ n) != 1847841581) {
            int cfr_ignored_0 = (0x5D961CB5 ^ n) + 878229277;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite ghhs_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -540716149;
            n3 = Integer.rotateLeft(n3 * -574178899, 3) ^ 0xDD766C0D;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 23);
            int n4 = n3 ^ 0xB3EF27D4;
            if ((n4 ^ n3) != -1276172332) {
                int cfr_ignored_0 = (0x6C2A745F ^ n3) + 1792856404;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ khtm ^ string.hashCode() ^ n2 + khks_2 ^ i * 31625553 ^ khtm, 13) ^ khks_2));
            }
            String[] stringArray = bfb.rtz_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] cdlo5gvcn(String string) {
        return string.split("\u0004\u0016", -1);
    }

    private static CallSite bzc9xlg4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ wzvla1yjg0 ^ string.hashCode()) + (n2 + a4wvy870) + i ^ wzvla1yjg0, 19) + a4wvy870);
            }
            String[] stringArray = bfb.cdlo5gvcn(new String(cArray));
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

