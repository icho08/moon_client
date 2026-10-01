/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  net.minecraft.class_3675
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bwk;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.trf;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.kq;
import us.m0vy.moondlc.m0vyguard.yf;

public class tra_2
implements dl {
    private static final int zy = -2132151564;
    private static final int shagh = -1119745037;
    private static final int l4xyiug6 = -1541290424;
    private static final int us8444z0d4v8 = 1231596878;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xt7vz049t;

    public static class_304[] dzdh_3() {
        int n = -637020765;
        int n2 = (n = Integer.rotateLeft(n * -1743002145, 26) ^ 0xBC953D4A) ^ 0xE3D5F4AB;
        if ((n2 ^ n) != -472517461) {
            int cfr_ignored_0 = (0x39D22108 ^ n) - 929417104;
        }
        class_304[] class_304Array = new class_304[Integer.reverse(604811421) ^ 0xB90D3022];
        class_304Array[0] = tra_2.mc.field_1690.field_1867;
        class_304Array[1] = tra_2.mc.field_1690.field_1894;
        class_304Array[2] = tra_2.mc.field_1690.field_1881;
        class_304Array[3] = tra_2.mc.field_1690.field_1913;
        class_304Array[4] = tra_2.mc.field_1690.field_1849;
        class_304Array[5] = tra_2.mc.field_1690.field_1903;
        return class_304Array;
    }

    public static void thrl() {
        for (class_304 class_3042 : tra_2.dzdh_3()) {
            class_3042.method_23481(class_3675.method_15987((long)mc.method_22683().method_4490(), (int)class_3042.method_1429().method_1444()));
        }
    }

    public static boolean tyl_2() {
        block0: {
            int n = trf.jtd_4(1945023870);
            int n2 = n ^ 0xA24AEDE6;
            if ((n2 ^ n) == -1572147738) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD1A45898 ^ n, 13) + 1732532643) * -777758567;
        }
        return tra_2.mc.field_1690.field_1894.method_1434();
    }

    public static boolean tdq() {
        block0: {
            int n = 99849115;
            int n2 = (n = Integer.rotateLeft(n * -1839902615, 9) ^ 0xE8403023) ^ 0xF5C4B815;
            if ((n2 ^ n) == -171657195) break block0;
            int cfr_ignored_0 = (0xF0372B8E ^ n) + 1964379773;
        }
        return tra_2.mc.field_1690.field_1881.method_1434();
    }

    public static boolean shht_4() {
        block0: {
            int n = 127919508;
            int n2 = (n = Integer.rotateLeft(n * -109853679, 24) ^ 0xE29D26B3) ^ 0x3D8E7EB4;
            if ((n2 ^ n) == 1032748724) break block0;
            int cfr_ignored_0 = (0x3A119B20 ^ n) + -1055678745;
        }
        return tra_2.mc.field_1690.field_1913.method_1434();
    }

    public static boolean khtt_2() {
        block0: {
            int n = 134399356;
            int n2 = (n = Integer.rotateLeft(n * -756112801, 23) ^ 0x56A059CF) ^ 0xB1046B9F;
            if ((n2 ^ n) == -1325110369) break block0;
            int cfr_ignored_0 = (0xB906AEE3 ^ n) + -1800551806;
        }
        return tra_2.mc.field_1690.field_1849.method_1434();
    }

    public static boolean ttht_4() {
        int n = -557278436;
        int n2 = (n = Integer.rotateLeft(n * -1493855011, 24) ^ 0x22D2613A) ^ 0x34440C7B;
        if ((n2 ^ n) != 876874875) {
            int cfr_ignored_0 = (0xEA8C9767 ^ n) - 1376822558;
        }
        return tra_2.mc.field_1724.field_6250 != 0.0f || tra_2.mc.field_1724.field_6212 != 0.0f;
    }

    public static double hghb(float f, float f2, float f3) {
        if (f2 < 0.0f) {
            f += 180.0f;
        }
        float f4 = 1.0f;
        if (f2 < 0.0f) {
            f4 = -0.5f;
        }
        if (f2 > 0.0f) {
            f4 = 0.5f;
        }
        if (f3 > 0.0f) {
            f -= 90.0f * f4;
        }
        if (f3 < 0.0f) {
            f += 90.0f * f4;
        }
        return Math.toRadians(f);
    }

    public static double[] bjh(double d) {
        float f;
        int n = 749513169;
        n = Integer.rotateLeft(n * -1003108801, 22) ^ 0x11D51784;
        n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 29);
        int n2 = n ^ 0x6EB52888;
        if ((n2 ^ n) != 1857366152) {
            int cfr_ignored_0 = (0x42198159 ^ n) + 1323126653;
        }
        kq kq2 = tra_2.shkl();
        taj taj2 = tra_2.shr_2(kq2);
        bwk bwk2 = kq2.jwj();
        float f2 = tra_2.mc.field_1724.field_3913.field_3905;
        float f3 = tra_2.mc.field_1724.field_3913.field_3907;
        float f4 = f = bwk2 == null ? tra_2.shgha_2(tra_2.mc.field_1724) : tra_2.thms(taj2);
        if (f2 != 0.0f) {
            if (f3 > 0.0f) {
                f += (float)(f2 > 0.0f ? Integer.reverse(1165008037) ^ 0x5AC6F171 : 0x77AFE3E1 ^ 0x77AFE3CC);
            } else if (f3 < 0.0f) {
                f += (float)(f2 > 0.0f ? 0x28AF65B8 ^ 0x28AF6595 : 0x68B3008A ^ 0x974CFF59);
            }
            f3 = 0.0f;
            if (f2 > 0.0f) {
                f2 = 1.0f;
            } else if (f2 < 0.0f) {
                f2 = Float.intBitsToFloat(0x9859E441 ^ 0x27D9E441);
            }
        }
        double d2 = Math.sin(Math.toRadians(f + tra_2.rzm(0x247D8127 ^ 0x66C98127)));
        double d3 = Math.cos(tra_2.sjr_2(f + tra_2.zhd_6(547510835 + 571581901)));
        double d4 = (double)f2 * d * d3 + (double)f3 * d * d2;
        double d5 = (double)f2 * d * d2 - (double)f3 * d * d3;
        return new double[]{d4, d5};
    }

    public static void jkhz_2(double d) {
        int n = 0;
        int n2 = -1069729837;
        n2 = Integer.rotateLeft(n2 * 538607725, 7) ^ 0xC23886F9;
        int n3 = (int)((long)((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983) ^ 0xB20D0AF3197C1C23L ^ 0xB20D0AF3197C1C23L);
        block30: while (true) {
            switch (n3 - -97494983 ^ 0xFA305839 ^ n2) {
                case -1641141147: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x1A4F7F4C ^ n2, 6) - 872286575;
                    if (yf.dnkh()) {
                        try {
                            n += 2;
                            if ((0x29F92D5749402DA5L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = (n2 ^ 0x92102D91 ^ 0xFA305839) + -97494983;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (n2 ^ 0x92102D91 ^ 0xFA305839) + -97494983 + -824347598 - -824347598;
                        }
                        n -= 2;
                        continue block30;
                    }
                    try {
                        n -= 2;
                        if ((0xB6271C5A8D8A879L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)((n2 ^ 0xA671C4E5 ^ 0xFA305839) + -97494983) ^ 0xCBBC0F5ABEF0BA1L ^ 0xCBBC0F5ABEF0BA1L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)((n2 ^ 0xA671C4E5 ^ 0xFA305839) + -97494983) ^ 0xFB674A6AC02F6E96L ^ 0xFB674A6AC02F6E96L);
                    }
                    continue block30;
                }
                case -1502493467: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x62D3DEE0 ^ n2, 15) + -66741157;
                    double[] dArray = tra_2.bjh(d);
                    tra_2.zdha_2(tra_2.mc.field_1724, dArray[0], tra_2.mc.field_1724.method_18798().field_1351, dArray[1]);
                    return;
                }
                case -1844433519: {
                    int cfr_ignored_2 = (Integer.rotateRight(0x1CDFB876 ^ n2, 6) - -2089486971) * 484423799;
                    throw null;
                }
                case -1723717170: {
                    int cfr_ignored_3 = Integer.rotateLeft(0xC1DAFE8C ^ n2, 11) - 2111992367;
                    n3 = (n2 ^ 0x61F64BBD ^ 0xFA305839) + -97494983;
                    int cfr_ignored_4 = (Integer.rotateLeft(0xDFF2F35C ^ n2, 14) - 583604063) * -537726115;
                    try {
                        if ((0x858CF93D249F81C7L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983));
                    }
                    ++n;
                    continue block30;
                }
                case 1595664289: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x293723B8 ^ n2, 8) + 34271875) * 691479481;
                    n3 = (n2 ^ 0x74C9BB61 ^ 0xFA305839) + -97494983 + 1184475206 - 1184475206;
                    int cfr_ignored_6 = Integer.rotateRight(0xEB91BE4E ^ n2, 16) - -1962693971;
                    try {
                        n += 2;
                        n3 = (n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983) ^ 0xC932829C6B2B495BL ^ 0xC932829C6B2B495BL);
                    }
                    n -= 2;
                    continue block30;
                }
                case -264094583: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0x10A0EE3C ^ n2, 5) - 131758207) * 278982205;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xEA2B6A6B ^ 0xFA305839) + -97494983));
                    int cfr_ignored_8 = Integer.rotateRight(0x8351932A ^ n2, 3) + -348229295;
                    n3 = (int)((long)((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983) ^ 0x3DFF0C92669141FFL ^ 0x3DFF0C92669141FFL);
                    continue block30;
                }
                case -1146924215: {
                    int cfr_ignored_9 = Integer.rotateLeft(0x8BCB3F80 ^ n2, 4) + -235253829;
                    n3 = (n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983;
                    int cfr_ignored_10 = (Integer.rotateRight(0xF937E4F3 ^ n2, 18) + 841111720) * -113777421;
                    continue block30;
                }
                case 1204996147: {
                    int cfr_ignored_11 = Integer.rotateRight(0x558AD782 ^ n2, 13) + 1613608953;
                    n3 = (n2 ^ 0xDE442395 ^ 0xFA305839) + -97494983 ^ 0xC9E8DFF9 ^ 0xC9E8DFF9;
                    int cfr_ignored_12 = Integer.rotateLeft(0xDF3222CD ^ n2, 14) - 191878670;
                    int cfr_ignored_13 = (int)(0x1D808CF027D4EB4FL ^ (long)n2 ^ 0xE490831A2DB996D0L);
                    try {
                        n += 2;
                        if ((0x8A638F9E8B6B3365L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983 ^ 0xF49FF97A ^ 0xF49FF97A;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983 ^ 0x5FC95165 ^ 0x5FC95165;
                    }
                    continue block30;
                }
                case 423697490: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0xAD3786FC ^ n2, 8) - -32049217) * -1388869891;
                    n3 = (int)((long)((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983) ^ 0x2618CF1043751239L ^ 0x2618CF1043751239L);
                    int cfr_ignored_15 = Integer.rotateLeft(0x668D8CC4 ^ n2, 15) - 1870768887;
                    n -= 3;
                    continue block30;
                }
                case 2062578204: {
                    int cfr_ignored_16 = Integer.rotateLeft(0x9CA017A0 ^ n2, 6) + -71271525;
                    try {
                        if ((0x8CC3C5A70E7B2BE7L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983));
                    }
                    continue block30;
                }
                case 632221644: {
                    int cfr_ignored_17 = Integer.rotateRight(0x1E3968EF ^ n2, 6) - -1387178964;
                    n3 = (n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983 ^ 0x9E26778A ^ 0x9E26778A;
                    int cfr_ignored_18 = Integer.rotateRight(0x12754207 ^ n2, 5) - 1083219476;
                    n -= 4;
                    continue block30;
                }
                case -283647385: {
                    int cfr_ignored_19 = Integer.rotateLeft(0xF9ADBDCD ^ n2, 18) - 1080531726;
                    int cfr_ignored_20 = (int)(0x3B1F13F027D4EB4FL ^ (long)n2 ^ 0xDA90831A2DB9DBEFL);
                    n3 = (int)((long)((n2 ^ 0x212D8E4 ^ 0xFA305839) + -97494983) ^ 0xD4E62E5E65C4917EL ^ 0xD4E62E5E65C4917EL);
                    int cfr_ignored_21 = Integer.rotateLeft(0x1F1AE2D ^ n2, 3) - 1084339886;
                    int cfr_ignored_22 = (int)(0xC343001027D4EB4FL ^ (long)n2 ^ 0xFD50831A2DB82B57L);
                    n3 = (int)((long)((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983) ^ 0xDD5B949AE287CA63L ^ 0xDD5B949AE287CA63L);
                    n -= 2;
                    continue block30;
                }
                case 228428718: {
                    int cfr_ignored_23 = Integer.rotateRight(0xC10C6382 ^ n2, 11) + 1692249081;
                    try {
                        n += 3;
                        if ((0xF1C44C90B72F2F71L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983) ^ 0x7F8179D4CD30DC04L ^ 0x7F8179D4CD30DC04L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983 ^ 0xF6CCF77D ^ 0xF6CCF77D;
                    }
                    continue block30;
                }
                case -1566830812: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x2277C259 ^ n2, 7) + 819865602) * 578273881;
                    int cfr_ignored_25 = (int)(0xE0C56C6427D4EB4FL ^ (long)n2 ^ 0x25B8831A2DB86C5BL);
                    int cfr_ignored_26 = (int)(0x4A04733F0E727365L ^ (long)n2 ^ 0x1B0ED0571DED39D9L);
                    n3 = (n2 ^ 0x133DCEA5 ^ 0xFA305839) + -97494983 ^ 0x8A664935 ^ 0x8A664935;
                    int cfr_ignored_27 = (int)(0x9AC7C6C88A9B5B2DL ^ (long)n2 ^ 0x70E1D9854D7C985EL);
                    n3 = (n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983 ^ 0x6D62A061 ^ 0x6D62A061;
                    n += 2;
                    continue block30;
                }
            }
            int cfr_ignored_28 = (Integer.rotateRight(0xD25244FF ^ n2, 13) - 2085878300) * -766360321;
            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9E2E2C65 ^ 0xFA305839) + -97494983));
        }
    }

    private static kq shkl() {
        block0: {
            int n = 464703276;
            int n2 = (n = Integer.rotateLeft(n * -852066359, 6) ^ 0x31081A7) ^ 0xA7B0C093;
            if ((n2 ^ n) == -1481588589) break block0;
            int cfr_ignored_0 = (0xBC020FBF ^ n) + -1598168015;
        }
        return kq.thzt_2();
    }

    private static taj shr_2(kq kq2) {
        block0: {
            int n = 1975832442;
            int n2 = (n = Integer.rotateLeft(n * 1832600093, 5) ^ 0x4A789418) ^ 0x6EA0B79C;
            if ((n2 ^ n) == 1856026524) break block0;
            int cfr_ignored_0 = (0x1B6478E6 ^ n) - 1536595053;
        }
        return kq2.hls_2();
    }

    private static float shgha_2(class_746 class_7462) {
        block0: {
            int n = 1311636199;
            int n2 = (n = Integer.rotateLeft(n * -1197020267, 19) ^ 0x3970946E) ^ 0x275D51A9;
            if ((n2 ^ n) == 660427177) break block0;
            int cfr_ignored_0 = (0x6970AB4E ^ n) - 136082504;
        }
        return class_7462.method_36454();
    }

    private static float thms(taj taj2) {
        block0: {
            int n = trf.jtd_4(-1998419687);
            int n2 = n ^ 0x9BD735DA;
            if ((n2 ^ n) == -1680394790) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1335BCC3 ^ n, 5) + 1474263768;
        }
        return taj2.dda_3();
    }

    private static float rzm(int n) {
        block0: {
            int n2 = -1601668301;
            int n3 = (n2 = Integer.rotateLeft(n2 * -974734761, 24) ^ 0xDCA01A6B) ^ 0xB000ADCB;
            if ((n3 ^ n2) == -1342132789) break block0;
            int cfr_ignored_0 = (0x1088D6F8 ^ n2) - -1047806390;
        }
        return Float.intBitsToFloat(n);
    }

    private static float zhd_6(int n) {
        block0: {
            int n2 = 2139493850;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1590501759, 4) ^ 0xA66F98A0) ^ 0x2E442CFB;
            if ((n3 ^ n2) == 776219899) break block0;
            int cfr_ignored_0 = (0x51C23921 ^ n2) + -286601055;
        }
        return Float.intBitsToFloat(n);
    }

    private static double sjr_2(double d) {
        block0: {
            int n = -1347158644;
            n = Integer.rotateLeft(n * 769612957, 28) ^ 0x4251E634;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 2);
            int n2 = n ^ 0x3E753F20;
            if ((n2 ^ n) == 1047871264) break block0;
            int cfr_ignored_0 = (0x91C6C2AC ^ n) - 1361473461;
        }
        return Math.toRadians(d);
    }

    private static void zdha_2(class_746 class_7462, double d, double d2, double d3) {
        int n = trf.jtd_4(1767487168);
        class_746 class_7463 = class_7462;
        n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 23);
        n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 3);
        int n2 = n ^ 0xE33D9282;
        if ((n2 ^ n) != -482504062) {
            int cfr_ignored_0 = Integer.rotateRight(0x8A642442 ^ n, 4) + -964820167;
        }
        class_7462.method_18800(d, d2, d3);
    }

    private static String[] bah_4(String string) {
        int n = trf.jtd_4(-430406893);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x46FB6AEF;
        if ((n2 ^ n) != 1190882031) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xA0A3E9FC ^ n, 7) - 2016867519) * -1599870467;
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

    private static CallSite tjw_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1765288426;
            n3 = Integer.rotateLeft(n3 * -403960501, 10) ^ 0x3D32AC9A;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x77E4169B;
            if ((n4 ^ n3) != 2011436699) {
                int cfr_ignored_0 = (0x1EDC3F71 ^ n3) + -1303899050;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zy ^ string.hashCode()) + (n2 + shagh) + i ^ zy, 10) + shagh);
            }
            String[] stringArray = tra_2.bah_4(new String(cArray));
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

    private static String[] vmlwkz6hg(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite fdcevsl1ay6v(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ l4xyiug6 ^ string.hashCode()) + (n2 + us8444z0d4v8) + i ^ l4xyiug6, 11) + us8444z0d4v8);
            }
            String[] stringArray = tra_2.vmlwkz6hg(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

