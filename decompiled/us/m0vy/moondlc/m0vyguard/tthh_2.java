/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import us.m0vy.moondlc.m0vyguard.bal_2;
import us.m0vy.moondlc.m0vyguard.bfk;
import us.m0vy.moondlc.m0vyguard.tst;
import us.m0vy.moondlc.m0vyguard.zt_2;
import us.m0vy.moondlc.m0vyguard.ght_2;

public class tthh_2 {
    private static final int ja_2 = 1773928267;
    private static final int sthf = 1890165047;
    private static final int khdz_3 = 1871986113;
    private static final int jtd_4 = -1828806099;
    private static final int lg6peuvlf75 = -145614695;
    private static final int gevlxzp = 1849370750;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int or8ej1bz09m;

    public static ght_2[] thghm(String string, Map map, Map map2, Set set, boolean bl) {
        ght_2 ght2;
        int n = tst.khhj_2(2028044587);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        Map map3 = map2;
        n = (map3 != null ? System.identityHashCode(map3) : 0) ^ n;
        int n2 = n ^ 0x5AB3356E;
        if ((n2 ^ n) != 1521694062) {
            int cfr_ignored_0 = Integer.rotateLeft(0x2252B445 ^ n, 7) - 744584086;
            int cfr_ignored_1 = (int)(0xE0E01A7827D4EB4FL ^ (long)n ^ 0xC980831A2DB86C11L);
        }
        Stack<ght_2> stack = new Stack<ght_2>();
        ArrayList<ght_2> arrayList = new ArrayList<ght_2>();
        zt_2 zt2_2 = new zt_2(string, map, map2, set, bl);
        block8: while (tthh_2.khqy(zt2_2)) {
            ght2 = zt2_2.twq_2();
            switch (ght2.bjy()) {
                case 1: 
                case 6: {
                    arrayList.add(ght2);
                    break;
                }
                case 2: {
                    while (!tthh_2.rtkh(stack) && ((ght_2)stack.peek()).bjy() == 2) {
                        bfk bfk2 = (bfk)ght2;
                        bfk bfk3 = (bfk)stack.peek();
                        if (bfk2.shnt().zbn_2() == 1 && tthh_2.hk(bfk3.shnt()) == 2 || (!bfk2.shnt().shsh_4() || tthh_2.zdhth(bfk2.shnt()) > tthh_2.sfk_2(bfk3).ty()) && tthh_2.dhlth(bfk2).ty() >= bfk3.shnt().ty()) break;
                        arrayList.add((ght_2)stack.pop());
                    }
                    stack.push(ght2);
                    continue block8;
                }
                case 3: {
                    stack.add(ght2);
                    break;
                }
                case 4: {
                    stack.push(ght2);
                    break;
                }
                case 5: {
                    while (((ght_2)stack.peek()).bjy() != 4) {
                        arrayList.add((ght_2)stack.pop());
                    }
                    stack.pop();
                    if (stack.isEmpty() || ((ght_2)stack.peek()).bjy() != 3) continue block8;
                    arrayList.add((ght_2)stack.pop());
                    break;
                }
                case 7: {
                    while (!stack.empty() && tthh_2.sbkh((ght_2)stack.peek()) != 4) {
                        arrayList.add((ght_2)stack.pop());
                    }
                    if (!tthh_2.tqm_2(stack) && ((ght_2)stack.peek()).bjy() == 4) break;
                    throw new IllegalArgumentException("Misplaced function separator '".concat(",' or mismatched parentheses"));
                }
                default: {
                    throw new IllegalArgumentException("Unknown Token type encounter".concat("ed. This should not happen"));
                }
            }
        }
        while (!stack.empty()) {
            ght2 = (ght_2)tthh_2.tthd(stack);
            if (ght2.bjy() == 5 || tthh_2.bdhd_2(ght2) == 4) {
                throw new IllegalArgumentException("Mismatched parentheses detected. Please check the expression");
            }
            arrayList.add(ght2);
        }
        return arrayList.toArray(new ght_2[0]);
    }

    private static String bta_4(String string, int n, int n2, int n3) {
        int n4 = tst.khhj_2(-2080829224);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 5);
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 28)) ^ 0x7F88CE1B;
        if ((n5 ^ n4) != 2139672091) {
            int cfr_ignored_0 = Integer.rotateRight(0xFC71DEC3 ^ n4, 18) + -1775789864;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x8276AA39) + ja_2 ^ Integer.reverse(n2 + i * 944564171), 4) - sthf);
        }
        return new String(cArray);
    }

    private static boolean khqy(zt_2 zt2_2) {
        block0: {
            int n = 1375832750;
            n = Integer.rotateLeft(n * 70764971, 7) ^ 0x66A3D97C;
            zt_2 zt3_2 = zt2_2;
            n = (zt3_2 != null ? System.identityHashCode(zt3_2) : 0) ^ n;
            int n2 = n ^ 0xE6D9C177;
            if ((n2 ^ n) == -421936777) break block0;
            int cfr_ignored_0 = (0xB4D84BD9 ^ n) - -1564212221;
        }
        return zt2_2.shra();
    }

    private static boolean rtkh(Stack stack) {
        block0: {
            int n = 511902186;
            n = Integer.rotateLeft(n * -1504731297, 8) ^ 0x55184DAB;
            Stack stack2 = stack;
            n = Integer.rotateRight((stack2 != null ? System.identityHashCode(stack2) : 0) ^ n, 27);
            int n2 = n ^ 0xF9E0FFE7;
            if ((n2 ^ n) == -102694937) break block0;
            int cfr_ignored_0 = (0xE763FE0D ^ n) - -733634067;
        }
        return stack.empty();
    }

    private static int hk(bal_2 bal2) {
        block0: {
            int n = tst.khhj_2(-1800535108);
            int n2 = n ^ 0xB7443A23;
            if ((n2 ^ n) == -1220265437) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x23EA399F ^ n, 7) - 1572510076) * 602552735;
        }
        return bal2.zbn_2();
    }

    private static int zdhth(bal_2 bal2) {
        block0: {
            int n = 461775210;
            n = Integer.rotateLeft(n * 407541381, 4) ^ 0x3F1979D8;
            bal_2 bal3 = bal2;
            n = Integer.rotateRight((bal3 != null ? System.identityHashCode(bal3) : 0) ^ n, 20);
            int n2 = n ^ 0x81990EBE;
            if ((n2 ^ n) == -2120675650) break block0;
            int cfr_ignored_0 = (0x9A1F2FD4 ^ n) - -1380874016;
        }
        return bal2.ty();
    }

    private static bal_2 sfk_2(bfk bfk2) {
        block0: {
            int n = 1561057873;
            int n2 = (n = Integer.rotateLeft(n * 125807719, 21) ^ 0xBC1049CC) ^ 0x8E2F20F7;
            if ((n2 ^ n) == -1909513993) break block0;
            int cfr_ignored_0 = (0xD324FAA6 ^ n) - -32049848;
        }
        return bfk2.shnt();
    }

    private static bal_2 dhlth(bfk bfk2) {
        block0: {
            int n = tst.khhj_2(2091623006);
            int n2 = n ^ 0xFFADB84C;
            if ((n2 ^ n) == -5392308) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x83061A12 ^ n, 3) + -501561495) * -2096752109;
        }
        return bfk2.shnt();
    }

    private static int sbkh(ght_2 ght2) {
        block0: {
            int n = -2139008515;
            n = Integer.rotateLeft(n * 112165667, 22) ^ 0x3C511EF4;
            ght_2 ght3 = ght2;
            n = (ght3 != null ? System.identityHashCode(ght3) : 0) ^ n;
            int n2 = n ^ 0xA212287C;
            if ((n2 ^ n) == -1575868292) break block0;
            int cfr_ignored_0 = (0x22937981 ^ n) - -1296417054;
        }
        return ght2.bjy();
    }

    private static boolean tqm_2(Stack stack) {
        block0: {
            int n = 102457815;
            n = Integer.rotateLeft(n * -553631339, 17) ^ 0x7D36F76B;
            Stack stack2 = stack;
            n = Integer.rotateLeft((stack2 != null ? System.identityHashCode(stack2) : 0) ^ n, 12);
            int n2 = n ^ 0xA5075FDF;
            if ((n2 ^ n) == -1526243361) break block0;
            int cfr_ignored_0 = (0xA31C3E08 ^ n) - 1679907568;
        }
        return stack.empty();
    }

    private static Object tthd(Stack stack) {
        block0: {
            int n = 1307099762;
            int n2 = (n = Integer.rotateLeft(n * 141067489, 8) ^ 0x502179D8) ^ 0x1B11B114;
            if ((n2 ^ n) == 0x1B11B114) break block0;
            int cfr_ignored_0 = (0x56F97366 ^ n) + 1898400771;
        }
        return stack.pop();
    }

    private static int bdhd_2(ght_2 ght2) {
        block0: {
            int n = 1481323544;
            n = Integer.rotateLeft(n * 1335759013, 25) ^ 0x206E3978;
            ght_2 ght3 = ght2;
            n = Integer.rotateLeft((ght3 != null ? System.identityHashCode(ght3) : 0) ^ n, 4);
            int n2 = n ^ 0x57422D5E;
            if ((n2 ^ n) == 1463954782) break block0;
            int cfr_ignored_0 = (0xF091946 ^ n) - -1733886271;
        }
        return ght2.bjy();
    }

    private static String srs_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tst.khhj_2(437133691);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 28)) ^ 0xA709B542;
            if ((n5 ^ n4) == -1492535998) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xBD079439 ^ n4, 10) + -397897182) * -1123576775;
            int cfr_ignored_1 = (int)(0x7FB53A0427D4EB4FL ^ (long)n4 ^ 0x8978831A2DB952BBL);
        }
        return tthh_2.bta_4(string, n, n2, n3);
    }

    private static String[] stht_2(String string) {
        int n = tst.khhj_2(-409866655);
        int n2 = n ^ 0xF0C0D875;
        if ((n2 ^ n) != -255797131) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x17513614 ^ n, 5) - -684512345) * 391198229;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite alj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 211140255;
            n3 = Integer.rotateLeft(n3 * -2011204493, 9) ^ 0xFC201082;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x42FF8DD8;
            if ((n4 ^ n3) != 1124044248) {
                int cfr_ignored_0 = (0x4E6A3347 ^ n3) + 798717498;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ khdz_3 ^ string.hashCode() ^ n2 + jtd_4 ^ i * -1683980009 ^ khdz_3, 15) ^ jtd_4));
            }
            String[] stringArray = tthh_2.stht_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ef7fk8lvth0(String string) {
        return string.split("\u0001\u0012", -1);
    }

    private static CallSite uua2y1z3tib(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ lg6peuvlf75 ^ string.hashCode() ^ n2 + gevlxzp ^ i * 50793637 ^ lg6peuvlf75, 26) ^ gevlxzp));
            }
            String[] stringArray = tthh_2.ef7fk8lvth0(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

