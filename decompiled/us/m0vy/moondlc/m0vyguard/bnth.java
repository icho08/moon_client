/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;
import us.m0vy.moondlc.m0vyguard.bma_2;
import us.m0vy.moondlc.m0vyguard.tht;

public abstract class bnth
extends tht
implements bma_2 {
    private static final int dhma = 1880623716;
    private static final int hym = -812037209;
    private static final int u0tnj75a9lllb = -371335315;
    private static final int k9rjecpah = 789104822;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int cuezu1mq3jn5;

    @Override
    public abstract String getName();

    public static String[] thbf(bnth ... bnthArray) {
        block0: {
            int n = -1832727287;
            int n2 = (n = Integer.rotateLeft(n * -394196863, 24) ^ 0x925164EF) ^ 0x8E739168;
            if ((n2 ^ n) == -1905028760) break block0;
            int cfr_ignored_0 = (0x1CB15C61 ^ n) - -887080525;
        }
        return (String[])Arrays.stream(bnthArray).map(bnth::getName).toArray(bnth::shj_2);
    }

    public static bnth dns_4(String string, bnth ... bnthArray) {
        int n = -2065613603;
        n = Integer.rotateLeft(n * -822311327, 20) ^ 0xB00BCC68;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 9);
        n = Integer.rotateRight((bnthArray != null ? System.identityHashCode(bnthArray) : 0) ^ n, 22);
        int n2 = n ^ 0x4FD004E8;
        if ((n2 ^ n) != 1339032808) {
            int cfr_ignored_0 = (0xCB313835 ^ n) - -1535227388;
        }
        if (bnthArray != null) {
            if (string == null) {
                if (bnthArray.length == 0) {
                    return null;
                }
                return bnthArray[0];
            }
        } else {
            return null;
        }
        for (bnth bnth2 : bnthArray) {
            if (bnth2 == null || !string.equals(bnth2.getName())) continue;
            return bnth2;
        }
        return null;
    }

    @SafeVarargs
    public static bma_2 dfa_4(String string, bma_2 ... bmaArray_2) {
        bma_2 bma2_2 = null;
        int n = 0;
        int n2 = 1475415772;
        n2 = Integer.rotateLeft(n2 * -980910881, 22) ^ 0x50336D40;
        String string2 = string;
        n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
        int n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 + 1769488636 - 1769488636;
        while (true) {
            block31: {
                block41: {
                    block36: {
                        block47: {
                            block30: {
                                block35: {
                                    block46: {
                                        block44: {
                                            block45: {
                                                block33: {
                                                    block29: {
                                                        block40: {
                                                            block39: {
                                                                block34: {
                                                                    block28: {
                                                                        block42: {
                                                                            block43: {
                                                                                block37: {
                                                                                    block38: {
                                                                                        block26: {
                                                                                            block32: {
                                                                                                block27: {
                                                                                                    if ((n = n3 - -1205360547 ^ 0xB827A85D ^ n2) > -546461727) break block26;
                                                                                                    if (n > -1536903068) break block27;
                                                                                                    if (n == -1920317702) break block28;
                                                                                                    if (n == -1672473728) break block29;
                                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0xA5859078 ^ n2, 7) + 260709827) * -1517973383;
                                                                                                    if (n == -1536903068) break block30;
                                                                                                    break block31;
                                                                                                }
                                                                                                if (n > -1289582565) break block32;
                                                                                                if (n == -1298173763) break block33;
                                                                                                if (n == -1289582565) break block34;
                                                                                                break block31;
                                                                                            }
                                                                                            if (n == -628331309) break block35;
                                                                                            if (n == -546461727) break block36;
                                                                                            int cfr_ignored_1 = (Integer.rotateLeft(0xD8E21299 ^ n2, 14) + 1203625922) * -656272743;
                                                                                            int cfr_ignored_2 = (int)(0x1A50BCA427D4EB4FL ^ (long)n2 ^ 0x8438831A2DB99970L);
                                                                                            break block31;
                                                                                        }
                                                                                        if (n > 835359708) break block37;
                                                                                        if (n > 356216207) break block38;
                                                                                        if (n == -427397304) break block39;
                                                                                        if (n == 356216207) break block40;
                                                                                        int cfr_ignored_3 = Integer.rotateRight(0x22B80AE7 ^ n2, 7) - 950464820;
                                                                                        break block31;
                                                                                    }
                                                                                    if (n == 684170166) break block41;
                                                                                    if (n == 835359708) break block42;
                                                                                    break block31;
                                                                                }
                                                                                if (n > 899920140) break block43;
                                                                                if (n == 857073069) break block44;
                                                                                if (n == 899920140) break block45;
                                                                                int cfr_ignored_4 = Integer.rotateLeft(0xCD4028AC ^ n2, 12) - -551384049;
                                                                                break block31;
                                                                            }
                                                                            if (n == 1649965016) break block46;
                                                                            if (n == 2123616119) break block47;
                                                                            int cfr_ignored_5 = Integer.rotateRight(0x34972C2E ^ n2, 9) - 1655437517;
                                                                            break block31;
                                                                        }
                                                                        int cfr_ignored_6 = (Integer.rotateRight(0x887859B2 ^ n2, 4) + -1963951159) * -2005378637;
                                                                        bma_2 bma3_2 = bmaArray_2[0];
                                                                        bma2_2 = (bma_2)bnth.rtz_2(Arrays.stream(bmaArray_2).filter(arg_0 -> bnth.tym(string, arg_0)).findFirst(), bma3_2);
                                                                        try {
                                                                            ++n;
                                                                            n3 = (n2 ^ 0x28C79BB6 ^ 0xB827A85D) + -1205360547 ^ 0xCD125D4 ^ 0xCD125D4;
                                                                        }
                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                            n3 = (n2 ^ 0x28C79BB6 ^ 0xB827A85D) + -1205360547;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_7 = Integer.rotateLeft(0xC0FE1584 ^ n2, 11) - 1663187511;
                                                                    if (bmaArray_2 != null) {
                                                                        try {
                                                                            if ((0xA961203C243CAE83L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new ArithmeticException();
                                                                            }
                                                                            n3 = (n2 ^ 0xE6866F48 ^ 0xB827A85D) + -1205360547 + -1795208979 - -1795208979;
                                                                        }
                                                                        catch (ArithmeticException arithmeticException) {
                                                                            n3 = (n2 ^ 0xE6866F48 ^ 0xB827A85D) + -1205360547 + -1824920588 - -1824920588;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x80790405 ^ 0xB827A85D) + -1205360547));
                                                                    int cfr_ignored_8 = (Integer.rotateLeft(0x98A9D630 ^ n2, 6) + -2131849461) * -1733700047;
                                                                    n3 = (n2 ^ 0xB322881B ^ 0xB827A85D) + -1205360547 + 1939897102 - 1939897102;
                                                                    n += 5;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_9 = (Integer.rotateRight(0x753D295E ^ n2, 17) - 918921629) * 1966942559;
                                                                bma2_2 = null;
                                                                int cfr_ignored_10 = (int)(0xD87857EA1364F84L ^ (long)n2 ^ 0xF78D8EDF642FB6DEL);
                                                                n3 = (n2 ^ 0x249136A4 ^ 0xB827A85D) + -1205360547 + -2125169678 - -2125169678;
                                                                int cfr_ignored_11 = (int)(0xC945A70A3F3197D1L ^ (long)n2 ^ 0xB364B2D0D4843F5AL);
                                                                n3 = (n2 ^ 0x28C79BB6 ^ 0xB827A85D) + -1205360547 + 471177590 - 471177590;
                                                                n += 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_12 = (Integer.rotateLeft(0xDF773E3C ^ n2, 14) - 332277887) * -545833411;
                                                            if (bmaArray_2.length != 0) {
                                                                n3 = (n2 ^ 0x5EC315AA ^ 0xB827A85D) + -1205360547;
                                                                int cfr_ignored_13 = Integer.rotateLeft(0x25DB2545 ^ n2, 7) - -1712905578;
                                                                int cfr_ignored_14 = (int)(0xE7698B7827D4EB4FL ^ (long)n2 ^ 0xEB80831A2DB86302L);
                                                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0x31CA93DC ^ 0xB827A85D) + -1205360547));
                                                                n += 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_15 = (int)(0xAFFA2A37E6EE35D6L ^ (long)n2 ^ 0xA91F016F908AF225L);
                                                            n3 = (n2 ^ 0xB322881B ^ 0xB827A85D) + -1205360547 + 996394154 - 996394154;
                                                            n -= 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_16 = Integer.rotateRight(0x28E7068A ^ n2, 8) + -128488975;
                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547));
                                                        int cfr_ignored_17 = Integer.rotateRight(0x6059CAC3 ^ n2, 15) + -1354945320;
                                                        continue;
                                                    }
                                                    int cfr_ignored_18 = (Integer.rotateRight(0x97BB553A ^ n2, 5) + 1678569793) * -1749330629;
                                                    n3 = (n2 ^ 0x30DCF7E9 ^ 0xB827A85D) + -1205360547 + 25154616 - 25154616;
                                                    int cfr_ignored_19 = Integer.rotateRight(0x769BB566 ^ n2, 17) - 1631098517;
                                                    try {
                                                        n += 3;
                                                        if ((0xB6961DA1136DABB1L ^ (long)n2 | 1L) == 0L) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        n3 = (int)((long)((n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547) ^ 0x98A2F5113648D4B4L ^ 0x98A2F5113648D4B4L);
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547));
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_20 = (Integer.rotateRight(0x12503FF ^ n2, 3) - 668539676) * 19203071;
                                                n3 = (n2 ^ 0x5D2A6B7B ^ 0xB827A85D) + -1205360547 ^ 0x2680EEF5 ^ 0x2680EEF5;
                                                int cfr_ignored_21 = (Integer.rotateLeft(0xADF9D79C ^ n2, 8) - 362724127) * -1376135267;
                                                n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 ^ 0x7B8FD524 ^ 0x7B8FD524;
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_22 = (Integer.rotateLeft(0x7EA3D014 ^ n2, 18) - 1513345447) * 2124664853;
                                            n3 = (n2 ^ 0xBA317C86 ^ 0xB827A85D) + -1205360547 ^ 0x3D4C01B8 ^ 0x3D4C01B8;
                                            int cfr_ignored_23 = Integer.rotateLeft(0x9A966A6C ^ n2, 6) - -1131118001;
                                            try {
                                                n += 3;
                                                if ((0x2F862391B67571FBL ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 ^ 0xB37B5E3A ^ 0xB37B5E3A;
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_24 = Integer.rotateLeft(0x268E3705 ^ n2, 7) - -1349105450;
                                        int cfr_ignored_25 = (int)(0xE43C993827D4EB4FL ^ (long)n2 ^ 0xCF00831A2DB865A8L);
                                        int cfr_ignored_26 = (int)(0x2261452778A2A2DL ^ (long)n2 ^ 0xD5D423A7AF7DA99DL);
                                        n3 = (n2 ^ 0x2C125AF2 ^ 0xB827A85D) + -1205360547 ^ 0x45D71B79 ^ 0x45D71B79;
                                        int cfr_ignored_27 = (int)(0xF2362D19FE4334C4L ^ (long)n2 ^ 0xA743303592AE49BDL);
                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547));
                                        n += 3;
                                        continue;
                                    }
                                    int cfr_ignored_28 = (Integer.rotateRight(0xC81ED99F ^ n2, 12) - 1075444092) * -937502305;
                                    int cfr_ignored_29 = (int)(0xA1F79D16BED0E0F9L ^ (long)n2 ^ 0xC75DB1123AD4EE3EL);
                                    n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547;
                                    n -= 4;
                                    continue;
                                }
                                int cfr_ignored_30 = Integer.rotateRight(0xAAC65466 ^ n2, 8) - -1302210667;
                                n3 = (n2 ^ 0x858AC0D6 ^ 0xB827A85D) + -1205360547 ^ 0x2D1E4E25 ^ 0x2D1E4E25;
                                int cfr_ignored_31 = (Integer.rotateLeft(0x2367B91 ^ n2, 3) + 1224119754) * 37125009;
                                int cfr_ignored_32 = (int)(0xC084D5AC27D4EB4FL ^ (long)n2 ^ 0x5628831A2DB82CD8L);
                                try {
                                    if ((0xB2EB4713B4BB164BL ^ (long)n2 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 + -595183750 - -595183750;
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547));
                                }
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_33 = Integer.rotateRight(0xD36D8C82 ^ n2, 13) + -1633574151;
                            try {
                                if ((0xB8995202B23E6543L ^ (long)n2 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 + -1646478567 - -1646478567;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 + -325935591 - -325935591;
                            }
                            continue;
                        }
                        int cfr_ignored_34 = (Integer.rotateRight(0x2C19EB72 ^ n2, 8) + 1535189513) * 739896179;
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xF1412476 ^ 0xB827A85D) + -1205360547));
                        int cfr_ignored_35 = (Integer.rotateRight(0x44E50C93 ^ n2, 11) + 1545217288) * 1155861651;
                        try {
                            ++n;
                            if ((0x7A6409BD15079489L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 + 237303406 - 237303406;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (int)((long)((n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547) ^ 0x72FF9B964D178985L ^ 0x72FF9B964D178985L);
                        }
                        n -= 4;
                        continue;
                    }
                    int cfr_ignored_36 = Integer.rotateLeft(0x98260AC5 ^ n2, 6) - 1895361814;
                    int cfr_ignored_37 = (int)(0x5A94A4F827D4EB4FL ^ (long)n2 ^ 0xB480831A2DB918F8L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9DDE2087 ^ 0xB827A85D) + -1205360547));
                    int cfr_ignored_38 = Integer.rotateLeft(0xEBA738C5 ^ n2, 16) - -1919058154;
                    int cfr_ignored_39 = (int)(0x291596F827D4EB4FL ^ (long)n2 ^ 0xD080831A2DB9FFFAL);
                    try {
                        ++n;
                        if ((0x1E5E40534D641EEBL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 + 2003967348 - 2003967348;
                    }
                    n += 2;
                    continue;
                }
                return bma2_2;
            }
            int cfr_ignored_40 = Integer.rotateRight(0x4758A7AE ^ n2, 11) - -1474695859;
            n3 = (n2 ^ 0x8D8A46FA ^ 0xB827A85D) + -1205360547 + -584329114 - -584329114;
        }
    }

    private static boolean tym(String string, bma_2 bma2_2) {
        block0: {
            int n = 2112561770;
            n = Integer.rotateLeft(n * 1807386173, 4) ^ 0xFDAEB4A2;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 10);
            bma_2 bma3_2 = bma2_2;
            n = (bma3_2 != null ? System.identityHashCode(bma3_2) : 0) ^ n;
            int n2 = n ^ 0x79315041;
            if ((n2 ^ n) == 2033274945) break block0;
            int cfr_ignored_0 = (0x4DA722B ^ n) - 666147085;
        }
        return bma2_2.getName().equals(string);
    }

    private static String[] shj_2(int n) {
        block0: {
            int n2 = -1787358307;
            n2 = Integer.rotateLeft(n2 * -562164261, 4) ^ 0x3DB9E04F;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 11)) ^ 0x5471AE9F;
            if ((n3 ^ n2) == 1416736415) break block0;
            int cfr_ignored_0 = (0xC106BD02 ^ n2) - 1440897532;
        }
        return new String[n];
    }

    private static Object rtz_2(Optional optional, Object object) {
        block0: {
            int n = -1487470258;
            int n2 = (n = Integer.rotateLeft(n * 1555071393, 7) ^ 0x7CBE910B) ^ 0x1B4D691D;
            if ((n2 ^ n) == 458058013) break block0;
            int cfr_ignored_0 = (0xBC1A6853 ^ n) - -13560224;
        }
        return optional.orElse(object);
    }

    private static String[] zhh_5(String string) {
        int n = 962223519;
        n = Integer.rotateLeft(n * 2060635073, 7) ^ 0x5E426A09;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x6B5E1A0E;
        if ((n2 ^ n) != 1801329166) {
            int cfr_ignored_0 = (0x52044791 ^ n) - 879233158;
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

    private static CallSite bn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 29089210;
            n3 = Integer.rotateLeft(n3 * -1982806337, 16) ^ 0xCD460B8E;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xF5B8BDE2;
            if ((n4 ^ n3) != -172442142) {
                int cfr_ignored_0 = (0xF4036058 ^ n3) - -171213766;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dhma ^ string.hashCode() ^ n2 + hym + i * 757364115) + dhma) ^ hym));
            }
            String[] stringArray = bnth.zhh_5(new String(cArray));
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

    private static String[] b1a536pnt892(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pgk1yyp2p97(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ u0tnj75a9lllb ^ string.hashCode() ^ n2 + k9rjecpah + i * 1163623573) + u0tnj75a9lllb) ^ k9rjecpah));
            }
            String[] stringArray = bnth.b1a536pnt892(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

