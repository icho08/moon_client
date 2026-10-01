/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.SecureRandom;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bmd_2;
import us.m0vy.moondlc.m0vyguard.khj;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;

public class ttht
implements bmd_2 {
    private final SecureRandom jlh = new SecureRandom();
    private float s_2 = 0.0f;
    private float hsn_2 = 0.0f;
    private static final int hhh = -806395719;
    private static final int jdhf = 179252185;
    private static final int pne7thxvngpv = 767522834;
    private static final int v7dinfp = 882877030;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dl3ueko1te;

    @Override
    public lb ysh(lb lb2, lb lb3, class_1309 class_13092, boolean bl, boolean bl2) {
        float f;
        if (lb2 == null || lb3 == null) {
            return lb2 != null ? lb2 : lb3;
        }
        float f2 = bghdh.ttb_2(lb2.sry(), lb3.sry());
        float f3 = lb3.khdhd_2() - lb2.khdhd_2();
        float f4 = (float)Math.hypot(f2, f3);
        float f5 = !bl2 ? this.hghk(45.0f, 65.0f) : (bl ? this.hghk(35.0f, 50.0f) : this.hghk(28.0f, 42.0f));
        this.s_2 = class_3532.method_16439((float)0.35f, (float)this.s_2, (float)f5);
        this.hsn_2 = class_3532.method_16439((float)0.3f, (float)this.hsn_2, (float)(f5 * 0.75f));
        float f6 = class_3532.method_15363((float)f2, (float)(-this.s_2), (float)this.s_2);
        float f7 = class_3532.method_15363((float)f3, (float)(-this.hsn_2), (float)this.hsn_2);
        if (f4 < 8.0f) {
            f = Math.max(0.45f, f4 / 8.0f);
            f6 *= f;
            f7 *= f;
        }
        f = lb2.sry() + f6;
        float f8 = class_3532.method_15363((float)(lb2.khdhd_2() + f7), (float)-90.0f, (float)90.0f);
        return new lb(f, f8);
    }

    private float hghk(float f, float f2) {
        block0: {
            int n = khj.haj_2(-2119207868);
            n = System.identityHashCode(this) ^ n;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x4AC8044A;
            if ((n2 ^ n) == 1254622282) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCB67700E ^ n, 12) - -1511771923;
        }
        return f + this.jlh.nextFloat() * (f2 - f);
    }

    @Override
    public void tf() {
        int n = 0;
        int n2 = -1784275361;
        n2 = Integer.rotateLeft(n2 * 749704891, 21) ^ 0x8B3DF10C;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(734269727 * -827747127 + 1353285660 ^ n2));
        block21: while (true) {
            switch (((n3 ^ n2) - 1353285660) * -1366637191) {
                case -239891459: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x8377D51B ^ n2, 3) + -270504576) * -2089298661;
                    this.s_2 = 0.0f;
                    this.hsn_2 = 0.0f;
                    return;
                }
                case 734269727: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0xB00B8F50 ^ n2, 9) + 1438906859) * -1341419695;
                    if (yf.khdha_2()) {
                        int cfr_ignored_2 = (int)(0x16DA045EDD6041FBL ^ (long)n2 ^ 0xF5CD767378D18065L);
                        n3 = (-239891459 * -827747127 + 1353285660 ^ n2) + 1738505119 - 1738505119;
                        n += 3;
                        continue block21;
                    }
                    try {
                        n += 3;
                        if ((0xC2AE5BBE98AA60DFL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (-1521878641 * -827747127 + 1353285660 ^ n2) + 435187258 - 435187258;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (-1521878641 * -827747127 + 1353285660 ^ n2) + 802102105 - 802102105;
                    }
                    continue block21;
                }
                case -1521878641: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x432471C4 ^ n2, 11) - 633824759;
                    ttht.ghtth();
                    throw null;
                }
                case -2124517226: {
                    int cfr_ignored_4 = (Integer.rotateRight(0x69642517 ^ n2, 16) - -948036348) * 1768170775;
                    n3 = Integer.reverse(Integer.reverse(202386775 * -827747127 + 1353285660 ^ n2));
                    int cfr_ignored_5 = (Integer.rotateRight(0xE191D31F ^ n2, 15) - 1426468860) * -510536929;
                    try {
                        n3 = (int)((long)(734269727 * -827747127 + 1353285660 ^ n2) ^ 0x7CF5B519CA6C49A1L ^ 0x7CF5B519CA6C49A1L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 734269727 * -827747127 + 1353285660 ^ n2 ^ 0xD158C495 ^ 0xD158C495;
                    }
                    n -= 4;
                    continue block21;
                }
                case -1144547375: {
                    int cfr_ignored_6 = Integer.rotateLeft(0x22D062CC ^ n2, 7) - 999921135;
                    n3 = -2095756237 * -827747127 + 1353285660 ^ n2;
                    int cfr_ignored_7 = Integer.rotateLeft(0xB505264 ^ n2, 4) - 1662490967;
                    n3 = 734269727 * -827747127 + 1353285660 ^ n2 ^ 0xC0A42FD7 ^ 0xC0A42FD7;
                    int cfr_ignored_8 = (Integer.rotateRight(0xFE7EDE5E ^ n2, 18) - -709194595) * -25239969;
                    n += 2;
                    continue block21;
                }
                case -1713557768: {
                    int cfr_ignored_9 = (Integer.rotateRight(0xF8892ED7 ^ n2, 18) - 486165316) * -125227305;
                    n3 = -78932548 * -827747127 + 1353285660 ^ n2 ^ 0xFB1D2520 ^ 0xFB1D2520;
                    int cfr_ignored_10 = Integer.rotateRight(0x4542DE6E ^ n2, 11) - 1735822989;
                    int cfr_ignored_11 = (int)(0xBE6943E0E7E6091L ^ (long)n2 ^ 0xD50CD04F3A05BA1CL);
                    n3 = 734269727 * -827747127 + 1353285660 ^ n2 ^ 0xAD0E376 ^ 0xAD0E376;
                    ++n;
                    continue block21;
                }
                case -1940233414: {
                    int cfr_ignored_12 = (Integer.rotateRight(0x1DA8ABD3 ^ n2, 6) + -1681232440) * 497593299;
                    n3 = -210840723 * -827747127 + 1353285660 ^ n2 ^ 0x9E5559DB ^ 0x9E5559DB;
                    int cfr_ignored_13 = (Integer.rotateLeft(0x8B33D8B5 ^ n2, 4) - -542843610) * -1959536459;
                    int cfr_ignored_14 = (int)(0x4981768827D4EB4FL ^ (long)n2 ^ 0x1060831A2DB93ED3L);
                    n3 = 734269727 * -827747127 + 1353285660 ^ n2 ^ 0x8E8611D6 ^ 0x8E8611D6;
                    int cfr_ignored_15 = Integer.rotateRight(0x84562A06 ^ n2, 3) - 181188085;
                    n += 2;
                    continue block21;
                }
                case -523463984: {
                    int cfr_ignored_16 = Integer.rotateRight(0x5034EE0B ^ n2, 13) + -1161399664;
                    n3 = Integer.reverse(Integer.reverse(441715250 * -827747127 + 1353285660 ^ n2));
                    int cfr_ignored_17 = Integer.rotateRight(0x58515D83 ^ n2, 14) + -1237847528;
                    n3 = Integer.reverse(Integer.reverse(734269727 * -827747127 + 1353285660 ^ n2));
                    continue block21;
                }
                case -519071880: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0x42DFA230 ^ n2, 11) + 494027531) * 1121952305;
                    int cfr_ignored_19 = (int)(0x1E02CBAA9FACE2C6L ^ (long)n2 ^ 0x6A25F3EA3EAB91D4L);
                    n3 = 734269727 * -827747127 + 1353285660 ^ n2 ^ 0xF41180AB ^ 0xF41180AB;
                    --n;
                    continue block21;
                }
                case 202264263: {
                    int cfr_ignored_20 = Integer.rotateLeft(0x1345FFE1 ^ n2, 5) + 1507302266;
                    int cfr_ignored_21 = (int)(0xD1F751DC27D4EB4FL ^ (long)n2 ^ 0x5EC8831A2DB80E3FL);
                    n3 = (279989050 * -827747127 + 1353285660 ^ n2) + 1026627336 - 1026627336;
                    int cfr_ignored_22 = (Integer.rotateLeft(0x5D472A70 ^ n2, 14) + 1341899467) * 1564945009;
                    try {
                        ++n;
                        n3 = Integer.reverse(Integer.reverse(734269727 * -827747127 + 1353285660 ^ n2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 734269727 * -827747127 + 1353285660 ^ n2;
                    }
                    n -= 3;
                    continue block21;
                }
                case 1202770628: {
                    int cfr_ignored_23 = Integer.rotateLeft(0xE58A29E1 ^ n2, 15) + -803688070;
                    int cfr_ignored_24 = (int)(0x273887DC27D4EB4FL ^ (long)n2 ^ 0xF2C8831A2DB9E3A0L);
                    n3 = -565839043 * -827747127 + 1353285660 ^ n2 ^ 0x6D81EDD ^ 0x6D81EDD;
                    int cfr_ignored_25 = (Integer.rotateLeft(0xF8DD22B9 ^ n2, 18) + 656724898) * -119725383;
                    int cfr_ignored_26 = (int)(0x3A6F8C8427D4EB4FL ^ (long)n2 ^ 0xE478831A2DB9D90EL);
                    n3 = (734269727 * -827747127 + 1353285660 ^ n2) + -1743673335 - -1743673335;
                    n += 2;
                    continue block21;
                }
                case 1141553294: {
                    int cfr_ignored_27 = Integer.rotateRight(0x4FD00062 ^ n2, 12) + -1366447335;
                    n3 = (-1609252405 * -827747127 + 1353285660 ^ n2) + 1819609161 - 1819609161;
                    int cfr_ignored_28 = (Integer.rotateLeft(0x7F54A791 ^ n2, 18) + 1872619978) * 2136254353;
                    int cfr_ignored_29 = (int)(0xBDE609AC27D4EB4FL ^ (long)n2 ^ 0xEE28831A2DB8D61DL);
                    n3 = Integer.reverse(Integer.reverse(734269727 * -827747127 + 1353285660 ^ n2));
                    continue block21;
                }
                case -127022334: {
                    int cfr_ignored_30 = Integer.rotateRight(0x92A7DAE2 ^ n2, 5) + -961470311;
                    n3 = (int)((long)(1821702013 * -827747127 + 1353285660 ^ n2) ^ 0xED923187D9B100B6L ^ 0xED923187D9B100B6L);
                    int cfr_ignored_31 = Integer.rotateRight(0x2D2EED66 ^ n2, 8) - 2097962645;
                    int cfr_ignored_32 = (int)(0xE7B9CAD136D4FF91L ^ (long)n2 ^ 0x68D2A11A040462A2L);
                    n3 = (734269727 * -827747127 + 1353285660 ^ n2) + -841102733 - -841102733;
                    n += 3;
                    continue block21;
                }
            }
            int cfr_ignored_33 = (Integer.rotateRight(0x8A89D47F ^ n2, 4) - -888251748) * -1970678657;
            n3 = 734269727 * -827747127 + 1353285660 ^ n2 ^ 0xE57C7A12 ^ 0xE57C7A12;
        }
    }

    private static void ghtth() {
        int n = khj.haj_2(1921292208);
        int n2 = n ^ 0xD7F70295;
        if ((n2 ^ n) != -671677803) {
            int cfr_ignored_0 = Integer.rotateLeft(0xA5739525 ^ n, 7) - 224177846;
            int cfr_ignored_1 = (int)(0x67C13B1827D4EB4FL ^ (long)n ^ 0x8B40831A2DB96253L);
        }
        yf.athz_2();
    }

    private static String[] khkhs(String string) {
        block0: {
            int n = 2132931504;
            int n2 = (n = Integer.rotateLeft(n * 580550475, 8) ^ 0x4BFE8097) ^ 0xCCF09FE4;
            if ((n2 ^ n) == -856645660) break block0;
            int cfr_ignored_0 = (0xB3D16C54 ^ n) + -97292207;
        }
        return string.split("\u0001\u001c", -1);
    }

    private static CallSite yd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 814051747;
            n3 = Integer.rotateLeft(n3 * 688522509, 17) ^ 0x5A33C6F5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 13);
            n3 = n2 ^ n3;
            int n4 = n3 ^ 0xD4ACA5EA;
            if ((n4 ^ n3) != -726882838) {
                int cfr_ignored_0 = (0xE429D449 ^ n3) - -1076310935;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hhh ^ string.hashCode() ^ n2 + jdhf + i * 1863681723) + hhh) ^ jdhf));
            }
            String[] stringArray = ttht.khkhs(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] x9a9e4fbaiw(String string) {
        return string.split("\u0001\u0011", -1);
    }

    private static CallSite fs62ep6wk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ pne7thxvngpv ^ string.hashCode() ^ n2 + v7dinfp ^ i * 287008583 ^ pne7thxvngpv, 24) ^ v7dinfp));
            }
            String[] stringArray = ttht.x9a9e4fbaiw(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

