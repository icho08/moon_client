/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1707
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_2371
 *  net.minecraft.class_2561
 *  net.minecraft.class_4185
 *  net.minecraft.class_437
 *  net.minecraft.class_465
 *  net.minecraft.class_490
 *  net.minecraft.class_636
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.class_1657;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_2371;
import net.minecraft.class_2561;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_636;
import us.m0vy.moondlc.m0vyguard.bfn;
import us.m0vy.moondlc.m0vyguard.tkhf;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.gha_2;
import us.m0vy.moondlc.m0vyguard.mn;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.accessors.HandledScreenAccessor;

public class btq
implements dl {
    private static final int qkh = -1041869711;
    private static final int rdy_2 = -1078282368;
    private static final int ibv332z = -1931883016;
    private static final int w4aga8rk78 = -1346977229;
    private static volatile int jv$kjzu0uuej;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ds7zh9m3n5unr;

    public static void mh(tkhf tkhf2) {
        class_465 class_4652;
        Object object;
        int n = 80;
        int n2 = 20;
        class_437 class_4372 = tkhf2.thyb();
        if (class_4372 instanceof class_490) {
            class_490 class_4902 = (class_490)class_4372;
            int n3 = (class_4372.field_22789 - n) / 2;
            int n4 = (class_4372.field_22790 - ((HandledScreenAccessor)class_4902).getBackgroundHeight()) / 2 - n2 - 5;
            btq.rhz(tkhf2, n3, n4, n, n2, new mn("Drop all", () -> btq.ahw_2(class_4902)));
        } else if (class_4372 instanceof class_465 && (object = (class_4652 = (class_465)class_4372).method_17577()) instanceof class_1707) {
            class_1707 class_17072 = (class_1707)object;
            object = class_4652.method_25440().getString();
            if (((String)object).contains("Auction") && ((String)object).contains("Search")) {
                return;
            }
            int n5 = class_17072.method_17388();
            int n6 = 114 + n5 * 18;
            int n7 = class_4372.field_22789 / 2 + 90;
            int n8 = (class_4372.field_22790 - n6) / 2;
            btq.rhz(tkhf2, n7, n8, n, n2, new mn("Steal all", () -> btq.bagh_2(class_17072)), new mn("From inv", () -> btq.zthz_3(class_17072)));
        }
    }

    @SafeVarargs
    private static void rhz(tkhf tkhf2, int n, int n2, int n3, int n4, mn ... mnArray) {
        int n5 = gha_2.rdhgh(1981967999);
        tkhf tkhf3 = tkhf2;
        n5 = Integer.rotateLeft((tkhf3 != null ? System.identityHashCode(tkhf3) : 0) ^ n5, 10);
        int n6 = (n5 = Integer.rotateRight(n ^ n5, 9)) ^ 0xEE881B2A;
        if ((n6 ^ n5) != -293070038) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x98AA7555 ^ n5, 6) - -2130586490) * -1733659307;
            int cfr_ignored_1 = (int)(0x5A18DB6827D4EB4FL ^ (long)n5 ^ 0x4BA0831A2DB919E0L);
        }
        if (!yf.khdha_2()) {
            btq.zkd_3();
            throw null;
        }
        ArrayList<class_4185> arrayList = new ArrayList<class_4185>();
        int n7 = n2;
        for (mn mn2 : mnArray) {
            class_4185 class_41852 = class_4185.method_46430((class_2561)class_2561.method_43470((String)((String)mn2.thash_2())), arg_0 -> btq.saa_8(mn2, arg_0)).method_46434(n, n7, n3, n4).method_46431();
            arrayList.add(class_41852);
            n7 += n4 + 5;
        }
        tkhf2.shtgh_2().addAll(arrayList);
    }

    private static void sshth(class_1707 class_17072) {
        int n = 1669460035;
        n = Integer.rotateLeft(n * -1683597093, 11) ^ 0x679CC072;
        class_1707 class_17073 = class_17072;
        n = Integer.rotateRight((class_17073 != null ? System.identityHashCode(class_17073) : 0) ^ n, 3);
        int n2 = n ^ 0xA57DB458;
        if ((n2 ^ n) != -1518488488) {
            int cfr_ignored_0 = (0xC6FC441B ^ n) + -1211888873;
        }
        if (yf.dnkh()) {
            throw null;
        }
        for (int i = 0; i < class_17072.method_7629().method_5439(); ++i) {
            class_1735 class_17352 = class_17072.method_7611(i);
            if (!class_17352.method_7681()) continue;
            btq.mc.field_1761.method_2906(btq.mc.field_1724.field_7512.field_7763, i, 0, class_1713.field_7794, (class_1657)btq.mc.field_1724);
        }
    }

    private static void sghn_2(class_1707 class_17072) {
        int n = gha_2.rdhgh(1129724792);
        int n2 = n ^ 0xBCAED7A7;
        if ((n2 ^ n) != -1129392217) {
            int cfr_ignored_0 = (Integer.rotateRight(0xFFF8ECDF ^ n, 18) - 58871356) * -463649;
        }
        if (!btq.bt_2()) {
            btq.thlh();
        }
        for (int i = class_17072.method_7629().method_5439(); i < btq.shyy(class_17072.field_7761); ++i) {
            class_1735 class_17352 = btq.zbk_2(class_17072, i);
            if (!class_17352.method_7681()) continue;
            btq.jfq(btq.mc.field_1761, btq.mc.field_1724.field_7512.field_7763, i, 0, class_1713.field_7794, (class_1657)btq.mc.field_1724);
        }
    }

    private static void shaa(class_465 class_4652) {
        try {
            int n = -1531638872;
            n = Integer.rotateLeft(n * -767926329, 17) ^ 0xFB83D68F;
            int n2 = n ^ 0x88B06FDA;
            if ((n2 ^ n) != -2001702950) {
                int cfr_ignored_0 = (0x2C056472 ^ n) + 949786306;
            }
            if ((0x1F7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        Iterator iterator = btq.hshm(class_4652.method_17577().field_7761);
        while (iterator.hasNext()) {
            class_1735 class_17352 = (class_1735)iterator.next();
            if (class_17352.method_7677().method_7960()) continue;
            btq.thdh_9(class_17352.field_7874);
        }
    }

    private static void saa_8(mn mn2, class_4185 class_41852) {
        int n = -352091635;
        n = Integer.rotateLeft(n * 38470323, 4) ^ 0x75051FE7;
        mn mn3 = mn2;
        n = Integer.rotateLeft((mn3 != null ? System.identityHashCode(mn3) : 0) ^ n, 6);
        class_4185 class_41853 = class_41852;
        n = Integer.rotateLeft((class_41853 != null ? System.identityHashCode(class_41853) : 0) ^ n, 13);
        int n2 = n ^ 0x316B3CB8;
        if ((n2 ^ n) != 829111480) {
            int cfr_ignored_0 = (0xDA68BEB5 ^ n) + 1454557881;
        }
        ((Runnable)mn2.tsa_3()).run();
    }

    private static void zthz_3(class_1707 class_17072) {
        Object[] objectArray = new Object[]{class_17072};
        btq.jv$xrlj1403dsav(objectArray, 1316730258);
        btq.jv$zateficu4ok6jr("熴熈燓燄燯熼燒熅煵焲煃煐焧焷焎焗烷炊烛烷炦炘炕灶災灟灚灠癰癃瘸玖疑疏疀珊珈玽獬獶獘猒猣猶猆猜狩狩狕犣犢狈犓牭牳牐牏爒牯牘版疾疡疂疒痈疅疑甲甦畀甀甭甸", objectArray, 1567790653);
    }

    private static void bagh_2(class_1707 class_17072) {
        Object[] objectArray = new Object[]{class_17072};
        btq.jv$xrlj1403dsav(objectArray, -403596248);
        btq.jv$zateficu4ok6jr("銖銪鋱鋦鋍銞鋰銧鉗鈐鉡鉲鈅鈕鈬鈵鏕鎨鏹鏕鎄鎺鎷鍔鍟鍽鍸鍂镒镡锚邴隵隣雏部郪邟過達遺逰送途逤逾釋釋釷醁醀釪醱酏酑酲酭鄰配酺酪障隃隠隰雪隦雤陆阂阱阨阋阚", objectArray, -185024633);
    }

    private static void ahw_2(class_490 class_4902) {
        btq.shaa((class_465)class_4902);
    }

    private static void zkd_3() {
        int n = -1191376944;
        int n2 = (n = Integer.rotateLeft(n * -1318898463, 13) ^ 0xE0583B5) ^ 0xAF3839E3;
        if ((n2 ^ n) != -1355269661) {
            int cfr_ignored_0 = (0x17C53E33 ^ n) + 1158337958;
        }
        yf.athz_2();
    }

    private static boolean bt_2() {
        block0: {
            int n = -249440479;
            int n2 = (n = Integer.rotateLeft(n * 1057845409, 18) ^ 0x2D0BD6B3) ^ 0xF72D4311;
            if ((n2 ^ n) == -148028655) break block0;
            int cfr_ignored_0 = (0x60C9430 ^ n) - -1885170790;
        }
        return yf.khdha_2();
    }

    private static void thlh() {
        int n = 546258824;
        int n2 = (n = Integer.rotateLeft(n * -1593712567, 24) ^ 0x8C2B889B) ^ 0xB3EC08D8;
        if ((n2 ^ n) != -1276376872) {
            int cfr_ignored_0 = (0x93633750 ^ n) + -727339732;
        }
        yf.athz_2();
    }

    private static int shyy(class_2371 class_23712) {
        block0: {
            int n = -360286710;
            n = Integer.rotateLeft(n * -1869584133, 15) ^ 0xC6C314C;
            class_2371 class_23713 = class_23712;
            n = Integer.rotateRight((class_23713 != null ? System.identityHashCode(class_23713) : 0) ^ n, 20);
            int n2 = n ^ 0x14350122;
            if ((n2 ^ n) == 339018018) break block0;
            int cfr_ignored_0 = (0xFEB37728 ^ n) - 745014371;
        }
        return class_23712.size();
    }

    private static class_1735 zbk_2(class_1707 class_17072, int n) {
        block0: {
            int n2 = -1980515187;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1630219739, 19) ^ 0x47E313E9) ^ 0x9182F243;
            if ((n3 ^ n2) == -1853689277) break block0;
            int cfr_ignored_0 = (0x18714ECE ^ n2) - 711882189;
        }
        return class_17072.method_7611(n);
    }

    private static void jfq(class_636 class_6362, int n, int n2, int n3, class_1713 class_17132, class_1657 class_16572) {
        int n4 = 1554902697;
        n4 = Integer.rotateLeft(n4 * 1486139961, 22) ^ 0xB5C8F0C0;
        n4 = n ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0x5FA03866;
        if ((n5 ^ n4) != 1604335718) {
            int cfr_ignored_0 = (0x30DD6CF ^ n4) - 532500136;
        }
        class_6362.method_2906(n, n2, n3, class_17132, class_16572);
    }

    private static Iterator hshm(class_2371 class_23712) {
        block0: {
            int n = gha_2.rdhgh(838950279);
            int n2 = n ^ 0xA06360D1;
            if ((n2 ^ n) == -1604099887) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x92623D56 ^ n, 5) - -1102902107) * -1839055529;
        }
        return class_23712.iterator();
    }

    private static void thdh_9(int n) {
        int n2 = -206236529;
        int n3 = (n2 = Integer.rotateLeft(n2 * -740698717, 18) ^ 0xBF83EDB0) ^ 0x49FD2DA6;
        if ((n3 ^ n2) != 1241329062) {
            int cfr_ignored_0 = (0xBA483929 ^ n2) + 1053211596;
        }
        bfn.dhykh(n);
    }

    private static String[] dhdha(String string) {
        block0: {
            int n = -232446494;
            int n2 = (n = Integer.rotateLeft(n * -8662791, 12) ^ 0xBB95EF58) ^ 0x7EA1080C;
            if ((n2 ^ n) == 2124482572) break block0;
            int cfr_ignored_0 = (0x8C842DEE ^ n) - 1270525403;
        }
        return string.split("\u0005\u0018", -1);
    }

    private static CallSite ghst_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1670402232;
            n3 = Integer.rotateLeft(n3 * -1588189453, 20) ^ 0xED70474A;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 13);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 15);
            int n4 = n3 ^ 0xA3599C91;
            if ((n4 ^ n3) != -1554408303) {
                int cfr_ignored_0 = (0xC0C9CC29 ^ n3) + 928012387;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ qkh ^ string.hashCode() ^ n2 + rdy_2 ^ i * 1051210827 ^ qkh, 7) ^ rdy_2));
            }
            String[] stringArray = btq.dhdha(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] fnlf0k9lj5(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xc01hfus11x(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ibv332z ^ string.hashCode() ^ n2 + w4aga8rk78 ^ i * 1222209895 ^ ibv332z, 15) ^ w4aga8rk78));
            }
            String[] stringArray = btq.fnlf0k9lj5(new String(cArray));
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

    private static Object jv$zateficu4ok6jr(String string, Object[] objectArray, int n) throws Throwable {
        String string2 = btq.jv$s4lahu7ntfy(string, n);
        if ((btq.jv$xrlj1403dsav(objectArray, n) ^ string2.length()) == -1047476583) {
            btq.jv$qyksvadlcjp(string2, objectArray, n);
        }
        String[] stringArray = string2.split("\u001d", -1);
        int n2 = Integer.parseInt(stringArray[0]);
        Class<?> clazz = Class.forName(stringArray[1].replace('/', '.'));
        MethodType methodType = MethodType.fromMethodDescriptorString(stringArray[3], clazz.getClassLoader());
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = n2 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType) : lookup.findVirtual(clazz, stringArray[2], methodType);
        return methodHandle.invokeWithArguments(objectArray);
    }

    private static String jv$s4lahu7ntfy(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (n * 131 ^ i * 17 ^ 0x216C90B3) & 0xFFFF);
        }
        return new String(cArray);
    }

    private static int jv$xrlj1403dsav(Object[] objectArray, int n) {
        int n2 = n ^ 0x130923AF;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object == null) continue;
            n2 = Integer.rotateLeft(n2 ^ System.identityHashCode(object), 5) + i * 1315423911;
        }
        return n2;
    }

    private static Object jv$qyksvadlcjp(String string, Object[] objectArray, int n) {
        jv$kjzu0uuej = btq.jv$xrlj1403dsav(objectArray, n) ^ string.length();
        if ((jv$kjzu0uuej & 3) == 4) {
            return string.substring(0, 0);
        }
        return null;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

