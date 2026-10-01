/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.thb;

public class qa_2
extends IllegalArgumentException {
    private static final long thsw = 1L;
    private final String zwth;
    private final String thwa_2;
    private final String zq;
    private final int ghh_2;
    private static final int bdha_2 = 117698059;
    private static final int hhf_2 = 1923587233;
    private static final int xk0gq07zji4 = -1202676746;
    private static final int ulkgprvwl4 = 560064038;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int rvw10mb4;

    public qa_2(String string, int n, int n2) {
        this.thwa_2 = string;
        this.zq = qa_2.token(string, n, n2);
        this.ghh_2 = n;
        this.zwth = "Unknown function or variable '" + this.zq + "' at pos " + n + " in expression '" + string + "'";
    }

    private static String token(String string, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        String string2 = null;
        int n5 = 0;
        int n6 = 690118567;
        n6 = Integer.rotateLeft(n6 * 263327627, 12) ^ 0x654F8832;
        n6 = Integer.rotateLeft(n2 ^ n6, 23);
        int n7 = n6 - -805352850 ^ 0x3A9DA616 ^ 0x3A9DA616;
        block25: while (true) {
            switch (n6 - n7) {
                case -805352850: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xA64C0715 ^ n6, 7) - 663911110) * -1504966891;
                    int cfr_ignored_1 = (int)(0x64FEA92827D4EB4FL ^ (long)n6 ^ 0xAF20831A2DB9642CL);
                    n3 = string.length();
                    n4 = n + n2 - 1;
                    if (n3 < n4) {
                        try {
                            if ((0x527C3AB7C6B255C7L ^ (long)n6 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n7 = n6 - -1593254128 ^ 0x807D18D0 ^ 0x807D18D0;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n7 = Integer.reverse(Integer.reverse(n6 - -1593254128));
                        }
                        n5 -= 3;
                        continue block25;
                    }
                    try {
                        n5 += 2;
                        if ((0x568D65CCB6F9648FL ^ (long)n6 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n7 = (int)((long)(n6 - -725669368) ^ 0xB2C41F79462606ACL ^ 0xB2C41F79462606ACL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n7 = Integer.reverse(Integer.reverse(n6 - -725669368));
                    }
                    n5 -= 3;
                    continue block25;
                }
                case -725669368: {
                    int cfr_ignored_2 = Integer.rotateRight(0x8A0D3567 ^ n6, 4) - -1141434700;
                    string2 = string.substring(n, n4);
                    int cfr_ignored_3 = (int)(0x54ECEF03431048A4L ^ (long)n6 ^ 0x23764A936A6F0408L);
                    n7 = n6 - 312134897 ^ 0x13348332 ^ 0x13348332;
                    int cfr_ignored_4 = (int)(0xFEAA109F02AC581BL ^ (long)n6 ^ 0xDC4EC9EB4B105085L);
                    n7 = n6 - -1151504026 + 768354196 - 768354196;
                    continue block25;
                }
                case -1593254128: {
                    int cfr_ignored_5 = Integer.rotateLeft(0xBFE44CED ^ n6, 10) - 1090711534;
                    int cfr_ignored_6 = (int)(0x7D56E2D027D4EB4FL ^ (long)n6 ^ 0x38D0831A2DB9577CL);
                    n4 = n3;
                    try {
                        n5 += 5;
                        if ((0xE40DF007A5634215L ^ (long)n6 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n7 = n6 - -725669368;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n7 = n6 - -725669368 + 2082984367 - 2082984367;
                    }
                    ++n5;
                    continue block25;
                }
                case 405650322: {
                    int cfr_ignored_7 = Integer.rotateLeft(0x2FF233E0 ^ n6, 8) + -760092837;
                    n7 = (int)((long)(n6 - -805352850) ^ 0x5889EAD2F1F56581L ^ 0x5889EAD2F1F56581L);
                    continue block25;
                }
                case 714149795: {
                    int cfr_ignored_8 = Integer.rotateLeft(0x25BB4981 ^ n6, 7) + -1777629734;
                    int cfr_ignored_9 = (int)(0xE709E7BC27D4EB4FL ^ (long)n6 ^ 0x3208831A2DB863C2L);
                    n7 = (int)((long)(n6 - -337263115) ^ 0x8F35436CD742B6BEL ^ 0x8F35436CD742B6BEL);
                    int cfr_ignored_10 = (Integer.rotateRight(0xCFE51E3A ^ n6, 12) + 823937089) * -807068101;
                    try {
                        n7 = Integer.reverse(Integer.reverse(n6 - -805352850));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n7 = n6 - -805352850;
                    }
                    n5 += 5;
                    continue block25;
                }
                case 529768536: {
                    int cfr_ignored_11 = Integer.rotateLeft(0xCEC851AD ^ n6, 12) - 245334830;
                    int cfr_ignored_12 = (int)(0xC7AFF9027D4EB4FL ^ (long)n6 ^ 0x250831A2DB9B524L);
                    n7 = (int)((long)(n6 - 1219994552) ^ 0xC8F8B188C12D52B1L ^ 0xC8F8B188C12D52B1L);
                    int cfr_ignored_13 = Integer.rotateLeft(0x57E7AA09 ^ n6, 13) + -1452591534;
                    int cfr_ignored_14 = (int)(0x9555043427D4EB4FL ^ (long)n6 ^ 0xF518831A2DB8877BL);
                    n7 = (int)((long)(n6 - -805352850) ^ 0x75B1A40EFF527CA1L ^ 0x75B1A40EFF527CA1L);
                    n5 += 2;
                    continue block25;
                }
                case -1171375067: {
                    int cfr_ignored_15 = Integer.rotateRight(0xB71803EB ^ n6, 9) + 809900208;
                    int cfr_ignored_16 = (int)(0x4ED64952CF402B76L ^ (long)n6 ^ 0x6FD55233ADCB307DL);
                    n7 = n6 - -805352850 ^ 0xC9F91728 ^ 0xC9F91728;
                    --n5;
                    continue block25;
                }
                case 670279097: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xB3FF0D10 ^ n6, 9) + -801098709) * -1275130607;
                    n7 = (int)((long)(n6 - -805352850) ^ 0x92A7428B501C4B1BL ^ 0x92A7428B501C4B1BL);
                    --n5;
                    continue block25;
                }
                case 1272293299: {
                    int cfr_ignored_18 = Integer.rotateLeft(0xF7BC5285 ^ n6, 17) - 69967190;
                    int cfr_ignored_19 = (int)(0x350EFCB827D4EB4FL ^ (long)n6 ^ 0x400831A2DB9C7CCL);
                    n7 = (int)((long)(n6 - -805352850) ^ 0xD506736473FBBAE8L ^ 0xD506736473FBBAE8L);
                    --n5;
                    continue block25;
                }
                case 1606951099: {
                    int cfr_ignored_20 = (Integer.rotateLeft(0x8F10C679 ^ n6, 4) + 1466279906) * -1894726023;
                    int cfr_ignored_21 = (int)(0x4DA2684427D4EB4FL ^ (long)n6 ^ 0x2DF8831A2DB93695L);
                    n7 = (int)((long)(n6 - 1273722287) ^ 0xF3991BA6BCB05DFEL ^ 0xF3991BA6BCB05DFEL);
                    int cfr_ignored_22 = Integer.rotateRight(0xCCDFFAA6 ^ n6, 12) - -746784427;
                    n7 = n6 - -754165340 ^ 0xC7C99BA7 ^ 0xC7C99BA7;
                    int cfr_ignored_23 = Integer.rotateLeft(0xFF4595C0 ^ n6, 18) + -305479301;
                    n7 = n6 - -805352850 ^ 0x315D2CC ^ 0x315D2CC;
                    continue block25;
                }
                case 889676320: {
                    int cfr_ignored_24 = Integer.rotateLeft(0xE7798A0C ^ n6, 15) - 202725039;
                    n7 = (int)((long)(n6 - 165475765) ^ 0x27B04AB7B7032AA2L ^ 0x27B04AB7B7032AA2L);
                    int cfr_ignored_25 = (Integer.rotateLeft(0x5F306551 ^ n6, 14) + -1959140342) * 1597007185;
                    int cfr_ignored_26 = (int)(0x9D82CB6C27D4EB4FL ^ (long)n6 ^ 0x6BA8831A2DB896D4L);
                    int cfr_ignored_27 = (int)(0x589D5763C4D67149L ^ (long)n6 ^ 0x53B7451F19B51CEBL);
                    n7 = Integer.reverse(Integer.reverse(n6 - -1309543473));
                    int cfr_ignored_28 = (int)(0x37D60309E9B94BB1L ^ (long)n6 ^ 0xFB631FC16C45C27DL);
                    n7 = (int)((long)(n6 - -805352850) ^ 0x20C4C59D4C1B47B0L ^ 0x20C4C59D4C1B47B0L);
                    ++n5;
                    continue block25;
                }
                case 832807030: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0x72CEA538 ^ n6, 17) + -345792253) * 1926145337;
                    n7 = (int)((long)(n6 - 1330696419) ^ 0x620BC7887726A67FL ^ 0x620BC7887726A67FL);
                    int cfr_ignored_30 = (Integer.rotateLeft(0xC8280490 ^ n6, 12) + 1094069419) * -936901487;
                    n7 = n6 - -805352850 + 1292735564 - 1292735564;
                    int cfr_ignored_31 = (Integer.rotateRight(0x3DC47992 ^ n6, 10) + 2133350377) * 1036286355;
                    n5 -= 2;
                    continue block25;
                }
                case 1655026092: {
                    int cfr_ignored_32 = (Integer.rotateLeft(0xAB632B3D ^ n6, 8) - -983573602) * -1419564227;
                    int cfr_ignored_33 = (int)(0x69D1850027D4EB4FL ^ (long)n6 ^ 0xF770831A2DB97E72L);
                    n7 = (int)((long)(n6 - -805352850) ^ 0x2C9484C1B2467E5DL ^ 0x2C9484C1B2467E5DL);
                    continue block25;
                }
                case -1546696891: {
                    int cfr_ignored_34 = (Integer.rotateRight(0x43755A77 ^ n6, 11) - 798200740) * 1131764343;
                    int cfr_ignored_35 = (int)(0xE9A52CB9E78F13BFL ^ (long)n6 ^ 0xA40303ADDC587E9BL);
                    n7 = n6 - 1813941666;
                    int cfr_ignored_36 = (int)(0xB12C8CCCA342441CL ^ (long)n6 ^ 0xE4E98A37731ECF88L);
                    n7 = n6 - -805352850;
                    continue block25;
                }
                case -1151504026: {
                    return string2;
                }
            }
            int cfr_ignored_37 = (Integer.rotateLeft(0x3A384E7C ^ n6, 10) - 288301119) * 976768637;
            n7 = Integer.reverse(Integer.reverse(n6 - -805352850));
        }
    }

    @Override
    public String getMessage() {
        block0: {
            int n = thb.afq(422951440);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0x58A3271E;
            if ((n2 ^ n) == 1487087390) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x41969D0E ^ n, 11) - -174414867;
        }
        return this.zwth;
    }

    public String getExpression() {
        block0: {
            int n = -1434926220;
            n = Integer.rotateLeft(n * -762334045, 16) ^ 0xED384AA9;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x64CA4484;
            if ((n2 ^ n) == 1690977412) break block0;
            int cfr_ignored_0 = (0xCEB287F0 ^ n) - 437936546;
        }
        return this.thwa_2;
    }

    public String getToken() {
        block0: {
            int n = 54363223;
            int n2 = (n = Integer.rotateLeft(n * -1726516729, 16) ^ 0x4066C0B5) ^ 0xEDCC5EE8;
            if ((n2 ^ n) == -305373464) break block0;
            int cfr_ignored_0 = (0xEEF1DABF ^ n) - -1346671943;
        }
        return this.zq;
    }

    public int getPosition() {
        block0: {
            int n = -1448277716;
            int n2 = (n = Integer.rotateLeft(n * 2031027949, 12) ^ 0x6795AADA) ^ 0x1B2D1BB9;
            if ((n2 ^ n) == 455941049) break block0;
            int cfr_ignored_0 = (0xB2801295 ^ n) - -1775999917;
        }
        return this.ghh_2;
    }

    private static String[] nwvt66qv(String string) {
        int n = -1141474635;
        n = Integer.rotateLeft(n * 1049389857, 28) ^ 0xB02DE182;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 13);
        int n2 = n ^ 0x414D9179;
        if ((n2 ^ n) != 1095602553) {
            int cfr_ignored_0 = (0xFABBEBCC ^ n) - 452827169;
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

    private static CallSite ganpkvq975(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1204573200;
            n3 = Integer.rotateLeft(n3 * 68046527, 5) ^ 0x4E6E0C43;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 16);
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xABCD9E4D;
            if ((n4 ^ n3) != -1412587955) {
                int cfr_ignored_0 = (0xEC01CA5D ^ n3) - -1024415162;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bdha_2 ^ string.hashCode()) + (n2 + hhf_2) + i ^ bdha_2, 13) + hhf_2);
            }
            String[] stringArray = qa_2.nwvt66qv(new String(cArray));
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

    private static String[] w80kayj1y8(String string) {
        return string.split("\u0001\u0017", -1);
    }

    private static CallSite p6h16f6m30(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ xk0gq07zji4 ^ string.hashCode() ^ n2 + ulkgprvwl4 ^ i * -968778005 ^ xk0gq07zji4, 5) ^ ulkgprvwl4));
            }
            String[] stringArray = qa_2.w80kayj1y8(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

