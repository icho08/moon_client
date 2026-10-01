/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Random;
import us.m0vy.moondlc.m0vyguard.bzb_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class bn {
    private final int[] khsy = new int[-1347533650 - -1347534162];
    private static final int jsth = -1115403169;
    private static final int khtdh = 498919333;
    private static final int gexhooaffb = -1123805741;
    private static final int btdl9ww5e3c3z = 354932572;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int p0wjsjofffrm;

    public bn() {
        this(System.currentTimeMillis());
    }

    public bn(long l) {
        int n;
        int n2;
        Random random = new Random(l);
        int[] nArray = new int[Integer.rotateLeft(0x6A5FE0AA ^ 0x625FE0AA, 13)];
        for (n2 = 0; n2 < (0x8AE7DE68 ^ 0x8AE7DF68); ++n2) {
            nArray[n2] = n2;
        }
        for (n2 = 0; n2 < 856490635 + -856490379; ++n2) {
            n = random.nextInt(Integer.rotateLeft(0x14DF733E ^ 0x14DF733C, 7) - n2) + n2;
            int n3 = nArray[n2];
            nArray[n2] = nArray[n];
            nArray[n] = n3;
        }
        for (n2 = 0; n2 < 1865359938 - 1865359682; ++n2) {
            this.khsy[n2 + (0x4845997C ^ 0x4845987C)] = n = nArray[n2];
            this.khsy[n2] = n;
        }
    }

    public double sshs_3(double d) {
        block0: {
            int n = -741459363;
            n = Integer.rotateLeft(n * 1693811535, 21) ^ 0x36D71B21;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
            int n2 = n ^ 0x24583D10;
            if ((n2 ^ n) == 609762576) break block0;
            int cfr_ignored_0 = (0xF796074D ^ n) - -2066764465;
        }
        return this.dhghsh(d, 0.0, 0.0);
    }

    public double shthd_2(double d, double d2) {
        block0: {
            int n = 1729459904;
            int n2 = (n = Integer.rotateLeft(n * -1163266451, 3) ^ 0x9008B62A) ^ 0xBCFF778C;
            if ((n2 ^ n) == -1124108404) break block0;
            int cfr_ignored_0 = (0xDBEA014C ^ n) + 1003447678;
        }
        return this.dhghsh(d, d2, 0.0);
    }

    public double dhghsh(double d, double d2, double d3) {
        try {
            int n = -106555688;
            n = Integer.rotateLeft(n * 1911683607, 19) ^ 0xCF5181E7;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 15);
            int n2 = n ^ 0x30D2A40A;
            if ((n2 ^ n) != 819110922) {
                int cfr_ignored_0 = (0xC974B2D2 ^ n) - 1389203485;
            }
            if ((0x14F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bn.sshm_2()) {
            throw null;
        }
        int n = (int)Math.floor(d) & (Integer.reverse(-1380770363) ^ 0xA3B8CD4A);
        int n3 = (int)Math.floor(d2) & (0xABB1F02E ^ 0xABB1F0D1);
        int n4 = (int)Math.floor(d3) & Integer.rotateLeft(0x166CCCF9 ^ 0xD66CCCC6, 2);
        d -= Math.floor(d);
        d2 -= Math.floor(d2);
        d3 -= Math.floor(d3);
        double d4 = bn.tsm(d);
        double d5 = bn.zthkh(d2);
        double d6 = bn.ssd_8(d3);
        int n5 = this.khsy[n] + n3;
        int n6 = this.khsy[n5] + n4;
        int n7 = this.khsy[n5 + 1] + n4;
        int n8 = this.khsy[n + 1] + n3;
        int n9 = this.khsy[n8] + n4;
        int n10 = this.khsy[n8 + 1] + n4;
        return bn.brm(d6, bn.thb_5(d5, bn.tjgh_2(d4, bn.zrs_2(this.khsy[n6], d, d2, d3), bn.khzdh(this.khsy[n9], d - 1.0, d2, d3)), bn.tjgh_2(d4, bn.ghshgh(this.khsy[n7], d, d2 - 1.0, d3), bn.zrs_2(this.khsy[n10], d - 1.0, d2 - 1.0, d3))), bn.tjgh_2(d5, bn.tjgh_2(d4, bn.zrs_2(this.khsy[n6 + 1], d, d2, d3 - 1.0), bn.dsl_2(this.khsy[n9 + 1], d - 1.0, d2, d3 - 1.0)), bn.tjgh_2(d4, bn.zrs_2(this.khsy[n7 + 1], d, d2 - 1.0, d3 - 1.0), bn.zrs_2(this.khsy[n10 + 1], d - 1.0, d2 - 1.0, d3 - 1.0))));
    }

    private static double tsm(double d) {
        block0: {
            int n = -1404524241;
            n = Integer.rotateLeft(n * 1206637129, 21) ^ 0xF97A323C;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 13);
            int n2 = n ^ 0x287994AB;
            if ((n2 ^ n) == 679056555) break block0;
            int cfr_ignored_0 = (0x84313D84 ^ n) - 1123293984;
        }
        return d * d * d * (d * (d * Double.longBitsToDouble(0x2845C929F4B365A3L ^ 0x685DC929F4B365A3L) - Double.longBitsToDouble(0xF60F8E7040BBDD03L ^ 0xB6218E7040BBDD03L)) + Double.longBitsToDouble(0x4715AEACF77174C9L ^ 0x731AEACF77174C9L));
    }

    private static double tjgh_2(double d, double d2, double d3) {
        block0: {
            int n = -622179157;
            n = Integer.rotateLeft(n * 258701177, 12) ^ 0x9DF2EB2A;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 11);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d3) ^ n, 12);
            int n2 = n ^ 0x8689CB9C;
            if ((n2 ^ n) == -2037789796) break block0;
            int cfr_ignored_0 = (0x5C638737 ^ n) + 1890895319;
        }
        return d2 + d * (d3 - d2);
    }

    private static double zrs_2(int n, double d, double d2, double d3) {
        double d4;
        int n2 = bzb_2.szgh_3(-1496127159);
        n2 = Integer.rotateLeft(n ^ n2, 28);
        n2 = (int)Double.doubleToLongBits(d) ^ n2;
        int n3 = n2 ^ 0xCA38E7DC;
        if ((n3 ^ n2) != -902240292) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x6CEA0E95 ^ n2, 16) - 884302662) * 1827278485;
            int cfr_ignored_1 = (int)(0xAE58A0A827D4EB4FL ^ (long)n2 ^ 0xBC20831A2DB8F160L);
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        int n4 = n & (Integer.reverse(1315754406) ^ 0x658B367D);
        double d5 = d4 = n4 < Integer.rotateLeft(0x150E5B4C ^ 0x152E5B4C, 14) ? d : d2;
        double d6 = n4 < 4 ? d2 : (n4 == (0x8B5F0745 ^ 0x8B5F0749) || n4 == 2143854031 - 2143854017 ? d : d3);
        return ((n4 & 1) == 0 ? d4 : -d4) + ((n4 & 2) == 0 ? d6 : -d6);
    }

    private static boolean sshm_2() {
        block0: {
            int n = -1745100629;
            int n2 = (n = Integer.rotateLeft(n * -1861316403, 6) ^ 0x9E7D38B5) ^ 0xA202C8C;
            if ((n2 ^ n) == 169880716) break block0;
            int cfr_ignored_0 = (0x9DDBCC27 ^ n) + -727798187;
        }
        return yf.dnkh();
    }

    private static double zthkh(double d) {
        block0: {
            int n = 630705664;
            n = Integer.rotateLeft(n * 1850854393, 7) ^ 0x466F3160;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 13);
            int n2 = n ^ 0xB13FABDF;
            if ((n2 ^ n) == -1321227297) break block0;
            int cfr_ignored_0 = (0x94A865DF ^ n) - 473942579;
        }
        return bn.tsm(d);
    }

    private static double ssd_8(double d) {
        block0: {
            int n = bzb_2.szgh_3(21868070);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xE8B454D1;
            if ((n2 ^ n) == -390834991) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE9F9FAF7 ^ n, 16) - 1503855396) * -369493257;
        }
        return bn.tsm(d);
    }

    private static double khzdh(int n, double d, double d2, double d3) {
        block0: {
            int n2 = 2034740305;
            n2 = Integer.rotateLeft(n2 * -2019908341, 20) ^ 0x55780FC1;
            n2 = Integer.rotateLeft(n ^ n2, 22);
            n2 = (int)Double.doubleToLongBits(d) ^ n2;
            int n3 = n2 ^ 0x3679A277;
            if ((n3 ^ n2) == 913941111) break block0;
            int cfr_ignored_0 = (0x4F3E0E26 ^ n2) - 1264023817;
        }
        return bn.zrs_2(n, d, d2, d3);
    }

    private static double ghshgh(int n, double d, double d2, double d3) {
        block0: {
            int n2 = bzb_2.szgh_3(339869118);
            n2 = n ^ n2;
            n2 = (int)Double.doubleToLongBits(d) ^ n2;
            int n3 = n2 ^ 0xE314C99D;
            if ((n3 ^ n2) == -485176931) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF7553423 ^ n2, 17) + -139530376;
        }
        return bn.zrs_2(n, d, d2, d3);
    }

    private static double thb_5(double d, double d2, double d3) {
        block0: {
            int n = -1439431381;
            n = Integer.rotateLeft(n * 1815741401, 7) ^ 0xB6E37D3;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x1151E41F;
            if ((n2 ^ n) == 290579487) break block0;
            int cfr_ignored_0 = (0xBB65E134 ^ n) + -857613916;
        }
        return bn.tjgh_2(d, d2, d3);
    }

    private static double dsl_2(int n, double d, double d2, double d3) {
        block0: {
            int n2 = bzb_2.szgh_3(883885190);
            n2 = (int)Double.doubleToLongBits(d) ^ n2;
            n2 = (int)Double.doubleToLongBits(d2) ^ n2;
            int n3 = n2 ^ 0xCE7E5B54;
            if ((n3 ^ n2) == -830579884) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xFAD15FD2 ^ n2, 18) + 1673017769) * -86941741;
        }
        return bn.zrs_2(n, d, d2, d3);
    }

    private static double brm(double d, double d2, double d3) {
        block0: {
            int n = bzb_2.szgh_3(490806720);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 3);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x12386A1B;
            if ((n2 ^ n) == 305687067) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xF7977DB ^ n, 4) + -468507968) * 259618779;
        }
        return bn.tjgh_2(d, d2, d3);
    }

    private static String[] blz(String string) {
        block0: {
            int n = bzb_2.szgh_3(791181710);
            int n2 = n ^ 0xCFDC5715;
            if ((n2 ^ n) == -807643371) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE0F42E9B ^ n, 15) + 1106199552) * -520868197;
        }
        return string.split("\b\u001f", -1);
    }

    private static CallSite dhm_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -979341892;
            n3 = Integer.rotateLeft(n3 * 1321337061, 28) ^ 0xFF7A3EB5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xAD19F685;
            if ((n4 ^ n3) != -1390807419) {
                int cfr_ignored_0 = (0x68B99B39 ^ n3) - 127559071;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jsth ^ string.hashCode()) + (n2 + khtdh) + i ^ jsth, 23) + khtdh);
            }
            String[] stringArray = bn.blz(new String(cArray));
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

    private static String[] rdkfxzk7(String string) {
        return string.split("\u0001\u000e", -1);
    }

    private static CallSite fwaf6svc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ gexhooaffb ^ string.hashCode()) + (n2 + btdl9ww5e3c3z) + i ^ gexhooaffb, 24) + btdl9ww5e3c3z);
            }
            String[] stringArray = bn.rdkfxzk7(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

