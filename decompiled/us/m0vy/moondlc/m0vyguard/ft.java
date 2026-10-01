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
import us.m0vy.moondlc.m0vyguard.bghsh;
import us.m0vy.moondlc.m0vyguard.tjk;
import us.m0vy.moondlc.m0vyguard.zk;
import us.m0vy.moondlc.m0vyguard.df_2;
import us.m0vy.moondlc.m0vyguard.qgh;
import us.m0vy.moondlc.m0vyguard.yf;

public class ft {
    private static final int tkh_4 = 326282310;
    private static final int zbl = 238267865;
    private static final int rkhr = -1591157498;
    private static final int dzs = 864420703;
    private static final int v56t5owhl = -837461729;
    private static final int z60zctd = -736925709;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int m962v0oz;

    public static tjk[] shzs_4(String string, Map map, Map map2, Set set, boolean bl) {
        tjk tjk2;
        int n = 771883191;
        n = Integer.rotateLeft(n * 1598463153, 28) ^ 0xC73B3ADA;
        Map map3 = map;
        n = Integer.rotateRight((map3 != null ? System.identityHashCode(map3) : 0) ^ n, 14);
        Set set2 = set;
        n = (set2 != null ? System.identityHashCode(set2) : 0) ^ n;
        int n2 = n ^ 0xF94CA347;
        if ((n2 ^ n) != -112417977) {
            int cfr_ignored_0 = (0xD74EA3F0 ^ n) + -1324559082;
        }
        Stack<tjk> stack = new Stack<tjk>();
        ArrayList<tjk> arrayList = new ArrayList<tjk>();
        qgh qgh2 = new qgh(string, map, map2, set, bl);
        block8: while (ft.thns(qgh2)) {
            tjk2 = ft.thha(qgh2);
            switch (ft.thza_4(tjk2)) {
                case 1: 
                case 6: {
                    arrayList.add(tjk2);
                    break;
                }
                case 2: {
                    while (!stack.empty() && ((tjk)stack.peek()).tghf() == 2) {
                        bghsh bghsh2 = (bghsh)tjk2;
                        bghsh bghsh3 = (bghsh)stack.peek();
                        if (bghsh2.jkk().tss() == 1 && ft.tsht_3(bghsh3.jkk()) == 2 || (!ft.shshl(ft.khst_4(bghsh2)) || ft.shtd_3(bghsh2).jthf() > bghsh3.jkk().jthf()) && ft.aal_2(bghsh2.jkk()) >= ft.shyt(bghsh3).jthf()) break;
                        arrayList.add((tjk)stack.pop());
                    }
                    stack.push(tjk2);
                    continue block8;
                }
                case 3: {
                    stack.add(tjk2);
                    break;
                }
                case 4: {
                    ft.hzl(stack, tjk2);
                    break;
                }
                case 5: {
                    while (ft.tnt_3((tjk)ft.dhly(stack)) != 4) {
                        arrayList.add((tjk)stack.pop());
                    }
                    ft.zdt_3(stack);
                    if (stack.isEmpty() || ft.zkz((tjk)stack.peek()) != 3) continue block8;
                    arrayList.add((tjk)stack.pop());
                    break;
                }
                case 7: {
                    while (!ft.byy(stack) && ((tjk)stack.peek()).tghf() != 4) {
                        arrayList.add((tjk)stack.pop());
                    }
                    if (!stack.empty() && ((tjk)stack.peek()).tghf() == 4) break;
                    throw new IllegalArgumentException(ft.zdt_5("Misplaced function s", "eparator ',' or mi").concat("smatched parentheses"));
                }
                default: {
                    throw new IllegalArgumentException("Unknown Token type encountered. This should not happen");
                }
            }
        }
        while (!ft.zsa_6(stack)) {
            tjk2 = (tjk)stack.pop();
            if (ft.dhzf_2(tjk2) == 5 || tjk2.tghf() == 4) {
                throw new IllegalArgumentException("Mismatched pare".concat("ntheses detecte").concat("d. Please check ").concat("the expression"));
            }
            arrayList.add(tjk2);
        }
        return arrayList.toArray(new tjk[0]);
    }

    private static String tysh_2(String string, int n, int n2, int n3) {
        try {
            int n4 = -918907090;
            n4 = Integer.rotateLeft(n4 * -2051138273, 13) ^ 0x827C25AD;
            n4 = Integer.rotateLeft(n2 ^ n4, 11);
            n4 = n3 ^ n4;
            int n5 = n4 ^ 0x454CE173;
            if ((n5 ^ n4) != 1162666355) {
                int cfr_ignored_0 = (0x8C76765D ^ n4) - 378713632;
            }
            if ((0x70 & 0) != 0) {
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
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x220B0884) + i ^ tkh_4, 21) ^ n2 + zbl));
        }
        return new String(cArray);
    }

    private static boolean thns(qgh qgh2) {
        block0: {
            int n = df_2.hwkh(-1559090744);
            qgh qgh3 = qgh2;
            n = (qgh3 != null ? System.identityHashCode(qgh3) : 0) ^ n;
            int n2 = n ^ 0x7A4A527F;
            if ((n2 ^ n) == 2051691135) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD9587BB7 ^ n, 14) - 1444190820) * -648512585;
        }
        return qgh2.skhm_2();
    }

    private static tjk thha(qgh qgh2) {
        block0: {
            int n = df_2.hwkh(1281932043);
            int n2 = n ^ 0x2055C7C1;
            if ((n2 ^ n) == 542492609) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6C3D7CCA ^ n, 16) + 533707697;
        }
        return qgh2.thtl();
    }

    private static int thza_4(tjk tjk2) {
        block0: {
            int n = -2077239696;
            n = Integer.rotateLeft(n * 2009245015, 14) ^ 0x22046054;
            tjk tjk3 = tjk2;
            n = (tjk3 != null ? System.identityHashCode(tjk3) : 0) ^ n;
            int n2 = n ^ 0xCAE5AF5D;
            if ((n2 ^ n) == -890917027) break block0;
            int cfr_ignored_0 = (0x4ECA792D ^ n) - -133297281;
        }
        return tjk2.tghf();
    }

    private static int tsht_3(zk zk2) {
        block0: {
            int n = -395744503;
            n = Integer.rotateLeft(n * -670825463, 17) ^ 0x7D623B67;
            zk zk3 = zk2;
            n = Integer.rotateLeft((zk3 != null ? System.identityHashCode(zk3) : 0) ^ n, 13);
            int n2 = n ^ 0xE2DBB8F9;
            if ((n2 ^ n) == -488916743) break block0;
            int cfr_ignored_0 = (0xAB2D3F0 ^ n) + -126476774;
        }
        return zk2.tss();
    }

    private static zk khst_4(bghsh bghsh2) {
        block0: {
            int n = 1502438314;
            n = Integer.rotateLeft(n * -613974713, 8) ^ 0x1EA617CE;
            bghsh bghsh3 = bghsh2;
            n = Integer.rotateLeft((bghsh3 != null ? System.identityHashCode(bghsh3) : 0) ^ n, 9);
            int n2 = n ^ 0x95FB3E14;
            if ((n2 ^ n) == -1778696684) break block0;
            int cfr_ignored_0 = (0xCC765DBE ^ n) - -303959564;
        }
        return bghsh2.jkk();
    }

    private static boolean shshl(zk zk2) {
        block0: {
            int n = 777315318;
            n = Integer.rotateLeft(n * 1241605077, 14) ^ 0xCA70A022;
            zk zk3 = zk2;
            n = Integer.rotateLeft((zk3 != null ? System.identityHashCode(zk3) : 0) ^ n, 16);
            int n2 = n ^ 0x39177427;
            if ((n2 ^ n) == 957838375) break block0;
            int cfr_ignored_0 = (0x174397D1 ^ n) + 1819434815;
        }
        return zk2.thfl();
    }

    private static zk shtd_3(bghsh bghsh2) {
        block0: {
            int n = df_2.hwkh(247569393);
            int n2 = n ^ 0x5861E41A;
            if ((n2 ^ n) == 1482810394) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x56A07FEB ^ n, 13) + -2117264208;
        }
        return bghsh2.jkk();
    }

    private static int aal_2(zk zk2) {
        block0: {
            int n = 0x19911299;
            n = Integer.rotateLeft(n * 466523257, 3) ^ 0xC323D8C1;
            zk zk3 = zk2;
            n = Integer.rotateRight((zk3 != null ? System.identityHashCode(zk3) : 0) ^ n, 28);
            int n2 = n ^ 0xB67D8F75;
            if ((n2 ^ n) == -1233285259) break block0;
            int cfr_ignored_0 = (0xAFEC9DEC ^ n) - -898382145;
        }
        return zk2.jthf();
    }

    private static zk shyt(bghsh bghsh2) {
        block0: {
            int n = df_2.hwkh(2054014762);
            bghsh bghsh3 = bghsh2;
            n = Integer.rotateLeft((bghsh3 != null ? System.identityHashCode(bghsh3) : 0) ^ n, 26);
            int n2 = n ^ 0x8DB8CD6D;
            if ((n2 ^ n) == -1917268627) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF7D50A47 ^ n, 17) - 120184276;
        }
        return bghsh2.jkk();
    }

    private static Object hzl(Stack stack, Object object) {
        block0: {
            int n = -1010163753;
            n = Integer.rotateLeft(n * -2140577687, 28) ^ 0xF38F49A3;
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 21);
            int n2 = n ^ 0x869C31B5;
            if ((n2 ^ n) == -2036584011) break block0;
            int cfr_ignored_0 = (0x45562E62 ^ n) - -1578873868;
        }
        return stack.push(object);
    }

    private static Object dhly(Stack stack) {
        block0: {
            int n = 724375429;
            int n2 = (n = Integer.rotateLeft(n * 282263285, 23) ^ 0x3556E03C) ^ 0x2358997E;
            if ((n2 ^ n) == 593009022) break block0;
            int cfr_ignored_0 = (0x8758EFB ^ n) + -742971614;
        }
        return stack.peek();
    }

    private static int tnt_3(tjk tjk2) {
        block0: {
            int n = df_2.hwkh(-2009651711);
            int n2 = n ^ 0xCA9B22AA;
            if ((n2 ^ n) == -895802710) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x42AC04AB ^ n, 11) + 389165040;
        }
        return tjk2.tghf();
    }

    private static Object zdt_3(Stack stack) {
        block0: {
            int n = -498711890;
            n = Integer.rotateLeft(n * 693595333, 25) ^ 0xBB26859E;
            Stack stack2 = stack;
            n = Integer.rotateRight((stack2 != null ? System.identityHashCode(stack2) : 0) ^ n, 11);
            int n2 = n ^ 0x4EA906BF;
            if ((n2 ^ n) == 1319700159) break block0;
            int cfr_ignored_0 = (0xACEF4411 ^ n) - 1703141011;
        }
        return stack.pop();
    }

    private static int zkz(tjk tjk2) {
        block0: {
            int n = df_2.hwkh(858319683);
            int n2 = n ^ 0xD9A98910;
            if ((n2 ^ n) == -643200752) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEA816253 ^ n, 16) + 1778943816) * -360619437;
        }
        return tjk2.tghf();
    }

    private static boolean byy(Stack stack) {
        block0: {
            int n = 843318240;
            int n2 = (n = Integer.rotateLeft(n * 936740853, 22) ^ 0x6A61D0D6) ^ 0xDB1DC722;
            if ((n2 ^ n) == -618805470) break block0;
            int cfr_ignored_0 = (0xE959C4C2 ^ n) - -1027809114;
        }
        return stack.empty();
    }

    private static String khtn_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1661081620;
            n4 = Integer.rotateLeft(n4 * 1179619089, 3) ^ 0xE8AD385A;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 6);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 23)) ^ 0x808E208F;
            if ((n5 ^ n4) == -2138169201) break block0;
            int cfr_ignored_0 = (0x1C73C763 ^ n4) - 622172411;
        }
        return ft.tysh_2(string, n, n2, n3);
    }

    private static String afd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 927304402;
            n4 = Integer.rotateLeft(n4 * 405790711, 8) ^ 0x6444704E;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x171E8323;
            if ((n5 ^ n4) == 387875619) break block0;
            int cfr_ignored_0 = (0x205B09F1 ^ n4) - 1698212755;
        }
        return ft.tysh_2(string, n, n2, n3);
    }

    private static String zdt_5(String string, String string2) {
        block0: {
            int n = -512574497;
            n = Integer.rotateLeft(n * 1612880227, 22) ^ 0x3E8BFBAC;
            String string3 = string2;
            n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 17);
            int n2 = n ^ 0x4894DEE4;
            if ((n2 ^ n) == 1217715940) break block0;
            int cfr_ignored_0 = (0xA9E6653B ^ n) + -174192288;
        }
        return string.concat(string2);
    }

    private static boolean zsa_6(Stack stack) {
        block0: {
            int n = -1779256197;
            int n2 = (n = Integer.rotateLeft(n * -1001758763, 19) ^ 0xCFCC3D23) ^ 0x756D6DD5;
            if ((n2 ^ n) == 1970105813) break block0;
            int cfr_ignored_0 = (0xE09FD9AE ^ n) + -1716548523;
        }
        return stack.empty();
    }

    private static int dhzf_2(tjk tjk2) {
        block0: {
            int n = df_2.hwkh(-136556147);
            tjk tjk3 = tjk2;
            n = Integer.rotateRight((tjk3 != null ? System.identityHashCode(tjk3) : 0) ^ n, 16);
            int n2 = n ^ 0x870E6DDB;
            if ((n2 ^ n) == -2029097509) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x70D23C56 ^ n, 17) - -1378685531) * 1892826199;
        }
        return tjk2.tghf();
    }

    private static String zshy(String string, int n, int n2, int n3) {
        block0: {
            int n4 = df_2.hwkh(1691742017);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 20)) ^ 0x46E9B94;
            if ((n5 ^ n4) == 74357652) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x60BB74D5 ^ n4, 15) - -1156528890) * 1622897877;
            int cfr_ignored_1 = (int)(0xA209DAE827D4EB4FL ^ (long)n4 ^ 0x48A0831A2DB8E9C2L);
        }
        return ft.tysh_2(string, n, n2, n3);
    }

    private static String[] hhy(String string) {
        block0: {
            int n = 228124679;
            int n2 = (n = Integer.rotateLeft(n * -1903980589, 22) ^ 0xAC248625) ^ 0xE5DD7026;
            if ((n2 ^ n) == -438472666) break block0;
            int cfr_ignored_0 = (0xE8459821 ^ n) - -1992487618;
        }
        return string.split("\u0002\u001a", -1);
    }

    private static CallSite zthn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1574827713;
            n3 = Integer.rotateLeft(n3 * -654584751, 7) ^ 0x6B05B363;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x72087131;
            if ((n4 ^ n3) != 1913155889) {
                int cfr_ignored_0 = (0xD02A780E ^ n3) + -1078804161;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rkhr ^ string.hashCode()) + (n2 + dzs) + i ^ rkhr, 11) + dzs);
            }
            String[] stringArray = ft.hhy(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] cq02jvqgyyxo(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite zkjtq6pt7b49(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ v56t5owhl ^ string.hashCode() ^ n2 + z60zctd ^ i * 1545187697 ^ v56t5owhl, 12) ^ z60zctd));
            }
            String[] stringArray = ft.cq02jvqgyyxo(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

