/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.ndh;
import us.m0vy.moondlc.m0vyguard.ydh;
import us.m0vy.moondlc.m0vyguard.yf;

public abstract class bwd {
    private List hyr = new ArrayList();
    private static final Gson dkz_2;
    private static final int dhkb = 526880083;
    private static final int zkgh = 730724521;
    private static final int hcwrw16q = -817478070;
    private static final int djvxm2uuzx7b3 = -2140910186;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ycd9q1cfl3binj;

    public abstract String baw_2();

    private Path zkhj_2() {
        int n = 2042889361;
        n = Integer.rotateLeft(n * -898950271, 3) ^ 0x23C9F78F;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0xC31A5E15;
        if ((n2 ^ n) != -1021682155) {
            int cfr_ignored_0 = (0xBADE5A84 ^ n) + 1112174602;
        }
        return bwd.shzz(bdhb.hya_2, new String[]{this.baw_2() + ".json"});
    }

    public void dnj() {
        try {
            int n = -474734477;
            n = Integer.rotateLeft(n * -48237411, 10) ^ 0x91056101;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
            int n2 = n ^ 0xB40968CE;
            if ((n2 ^ n) != -1274451762) {
                int cfr_ignored_0 = (0x57BD48BD ^ n) - 1229034372;
            }
            if (!yf.khdha_2()) {
                yf.athz_2();
            }
            Files.createDirectories(Path.of(bdhb.hya_2, new String[0]), new FileAttribute[0]);
            FileWriter fileWriter = new FileWriter(this.zkhj_2().toFile());
            try {
                dkz_2.toJson((Object)this.hyr, (Appendable)fileWriter);
            }
            catch (Throwable throwable) {
                try {
                    fileWriter.close();
                }
                catch (Throwable throwable2) {
                    bwd.tgh_2(throwable, throwable2);
                }
                throw throwable;
            }
            fileWriter.close();
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to save: " + String.valueOf(this.zkhj_2()), iOException);
        }
    }

    public void khdhh_2() {
        try {
            FileReader fileReader;
            block11: {
                try {
                    int n = 2079026363;
                    n = Integer.rotateLeft(n * 1582054503, 14) ^ 0xC0664213;
                    n = System.identityHashCode(this) ^ n;
                    int n2 = n ^ 0xA64ED3B7;
                    if ((n2 ^ n) != -1504783433) {
                        int cfr_ignored_0 = (0xDDA5BF0C ^ n) + -1693486885;
                    }
                    if ((0x1F0 & 0) != 0) {
                        throw new RuntimeException();
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw null;
                }
                Files.createDirectories(Path.of(bdhb.hya_2, new String[0]), new FileAttribute[0]);
                File file = this.zkhj_2().toFile();
                if (!file.exists()) {
                    file.createNewFile();
                    this.dnj();
                    return;
                }
                fileReader = new FileReader(file);
                try {
                    Type type = new ndh(this).getType();
                    this.hyr = (List)dkz_2.fromJson((Reader)fileReader, type);
                    if (this.hyr != null) break block11;
                    this.hyr = new ArrayList();
                }
                catch (Throwable throwable) {
                    try {
                        bwd.ghrkh(fileReader);
                    }
                    catch (Throwable throwable2) {
                        bwd.sdd_7(throwable, throwable2);
                    }
                    throw throwable;
                }
            }
            fileReader.close();
        }
        catch (IOException iOException) {
            this.hyr = new ArrayList();
        }
    }

    public void thsh_3(String string) {
        int n = 0;
        int n2 = 344789547;
        n2 = Integer.rotateLeft(n2 * 588651073, 22) ^ 0xB5BC0433;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 15);
        String string2 = string;
        n2 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 27);
        int n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) + 1184280782 - 1184280782;
        while (true) {
            block22: {
                block39: {
                    block40: {
                        block26: {
                            block34: {
                                block29: {
                                    block33: {
                                        block42: {
                                            block30: {
                                                block24: {
                                                    block28: {
                                                        block35: {
                                                            block23: {
                                                                block27: {
                                                                    block41: {
                                                                        block36: {
                                                                            block38: {
                                                                                block20: {
                                                                                    block21: {
                                                                                        block37: {
                                                                                            block31: {
                                                                                                block32: {
                                                                                                    block17: {
                                                                                                        block25: {
                                                                                                            block18: {
                                                                                                                block19: {
                                                                                                                    if ((n = Integer.rotateRight(n3, 13) ^ n2) > -518660077) break block17;
                                                                                                                    if (n > -1901262689) break block18;
                                                                                                                    if (n > -2033288373) break block19;
                                                                                                                    if (n == -2124380922) break block20;
                                                                                                                    if (n == -2033288373) break block21;
                                                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0x64A1637D ^ n2, 15) - 870886238) * 1688298365;
                                                                                                                    int cfr_ignored_1 = (int)(0xA613CD4027D4EB4FL ^ (long)n2 ^ 0x67F0831A2DB8E1F6L);
                                                                                                                    break block22;
                                                                                                                }
                                                                                                                if (n == -2023780583) break block23;
                                                                                                                if (n == -1901262689) break block24;
                                                                                                                int cfr_ignored_2 = Integer.rotateRight(0x53690F22 ^ n2, 13) + 504788057;
                                                                                                                break block22;
                                                                                                            }
                                                                                                            if (n > -1818703842) break block25;
                                                                                                            if (n == -1887142882) break block26;
                                                                                                            if (n == -1818703842) break block27;
                                                                                                            break block22;
                                                                                                        }
                                                                                                        if (n == -1806769381) break block28;
                                                                                                        if (n == -1710511128) break block29;
                                                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0xA9084DD0 ^ n2, 8) + 2086603627) * -1459073583;
                                                                                                        if (n == -518660077) break block30;
                                                                                                        break block22;
                                                                                                    }
                                                                                                    if (n > 535699143) break block31;
                                                                                                    if (n > -80303595) break block32;
                                                                                                    if (n == -177331227) break block33;
                                                                                                    if (n == -80303595) break block34;
                                                                                                    break block22;
                                                                                                }
                                                                                                if (n == 31003172) break block35;
                                                                                                if (n == 535699143) break block36;
                                                                                                int cfr_ignored_4 = Integer.rotateRight(0xB49C7142 ^ n2, 9) + -481339847;
                                                                                                break block22;
                                                                                            }
                                                                                            if (n > 1671910102) break block37;
                                                                                            if (n == 1222958291) break block38;
                                                                                            if (n == 1671910102) break block39;
                                                                                            break block22;
                                                                                        }
                                                                                        if (n == 1823327159) break block40;
                                                                                        if (n == 1871701070) break block41;
                                                                                        int cfr_ignored_5 = (Integer.rotateLeft(0xE0B5FB1C ^ n2, 15) - 979830687) * -524944611;
                                                                                        if (n == 1916011050) break block42;
                                                                                        break block22;
                                                                                    }
                                                                                    int cfr_ignored_6 = (Integer.rotateRight(0x3103C7BF ^ n2, 9) - -204288164) * 822331327;
                                                                                    if (!this.hyr.contains(string)) {
                                                                                        try {
                                                                                            n += 2;
                                                                                            if ((0x5187722EFE4CEFDFL ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new IllegalArgumentException();
                                                                                            }
                                                                                            n3 = Integer.rotateLeft(n2 ^ 0x81608506, 13);
                                                                                        }
                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x81608506, 13)));
                                                                                        }
                                                                                        n -= 4;
                                                                                        continue;
                                                                                    }
                                                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x194BF3E6, 13) ^ 0x4E5E6C5D33BCDBF4L ^ 0x4E5E6C5D33BCDBF4L);
                                                                                    int cfr_ignored_7 = Integer.rotateRight(0x23EE97AB ^ n2, 7) + 1581382896;
                                                                                    n3 = Integer.rotateLeft(n2 ^ 0x1FEE1EC7, 13);
                                                                                    n -= 4;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_8 = Integer.rotateRight(0x1E60BFCB ^ n2, 6) + -1307256624;
                                                                                this.hyr.add(string);
                                                                                this.dnj();
                                                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xF2F8D40E, 13) ^ 0xDD6B7DFD461695B8L ^ 0xDD6B7DFD461695B8L);
                                                                                int cfr_ignored_9 = (Integer.rotateRight(0x6C716C77 ^ n2, 16) - 639222180) * 1819372663;
                                                                                n3 = Integer.rotateLeft(n2 ^ 0x1FEE1EC7, 13) ^ 0x54EF4AC7 ^ 0x54EF4AC7;
                                                                                n += 3;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_10 = Integer.rotateRight(0xABE48CEF ^ n2, 8) - -720719828;
                                                                            if (string != null) {
                                                                                int cfr_ignored_11 = (int)(0xF9352C40F5CBA20EL ^ (long)n2 ^ 0xA5F12724BF3A5FBBL);
                                                                                n3 = Integer.rotateLeft(n2 ^ 0x29B3E311, 13) ^ 0xA0676813 ^ 0xA0676813;
                                                                                int cfr_ignored_12 = (int)(0xE0C710C42D0B94E9L ^ (long)n2 ^ 0xDCF896A4D2F46C5FL);
                                                                                n3 = Integer.rotateLeft(n2 ^ 0x6F8FE44E, 13) ^ 0xFECB121A ^ 0xFECB121A;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                n3 = Integer.rotateLeft(n2 ^ 0x1FEE1EC7, 13);
                                                                            }
                                                                            catch (IllegalStateException illegalStateException) {
                                                                                n3 = Integer.rotateLeft(n2 ^ 0x1FEE1EC7, 13) + 2300256 - 2300256;
                                                                            }
                                                                            n -= 5;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_13 = Integer.rotateLeft(0x62D68DC1 ^ n2, 15) + -61290086;
                                                                        int cfr_ignored_14 = (int)(0xA06423FC27D4EB4FL ^ (long)n2 ^ 0xBA88831A2DB8ED19L);
                                                                        return;
                                                                    }
                                                                    int cfr_ignored_15 = (Integer.rotateLeft(0xB6BBF291 ^ n2, 9) + 622853834) * -1229196655;
                                                                    int cfr_ignored_16 = (int)(0x74095CAC27D4EB4FL ^ (long)n2 ^ 0x4428831A2DB945C3L);
                                                                    if (string.trim().isEmpty()) {
                                                                        int cfr_ignored_17 = (int)(0x5225B35227090FDBL ^ (long)n2 ^ 0x9BD482A1E491099AL);
                                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x1FEE1EC7, 13)));
                                                                        n += 4;
                                                                        continue;
                                                                    }
                                                                    n3 = Integer.rotateLeft(n2 ^ 0x86CE7B4B, 13) + -691871751 - -691871751;
                                                                    n -= 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_18 = Integer.rotateRight(0xAB00C527 ^ n2, 8) - -1183482124;
                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13)));
                                                                int cfr_ignored_19 = (Integer.rotateLeft(0xF788521C ^ n2, 17) - -35680097) * -142061027;
                                                                n -= 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_20 = Integer.rotateRight(0x8D8D73E7 ^ n2, 4) - 679389236;
                                                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) ^ 0x472667816A373596L ^ 0x472667816A373596L);
                                                            int cfr_ignored_21 = (Integer.rotateLeft(0x9FAA4179 ^ n2, 6) + 1509657826) * -1616232071;
                                                            int cfr_ignored_22 = (int)(0x5D18EF4427D4EB4FL ^ (long)n2 ^ 0x23F8831A2DB917E0L);
                                                            continue;
                                                        }
                                                        int cfr_ignored_23 = Integer.rotateLeft(0x2D59AAA0 ^ n2, 8) + -2110175077;
                                                        n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13);
                                                        continue;
                                                    }
                                                    int cfr_ignored_24 = Integer.rotateRight(0x42BA42E2 ^ n2, 11) + 418101401;
                                                    n3 = Integer.rotateLeft(n2 ^ 0x248595A0, 13) + -1909861220 - -1909861220;
                                                    int cfr_ignored_25 = Integer.rotateLeft(0x4636E004 ^ n2, 11) - -2063417417;
                                                    n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) + -1477334498 - -1477334498;
                                                    --n;
                                                    continue;
                                                }
                                                int cfr_ignored_26 = (Integer.rotateLeft(0xD58EB33C ^ n2, 13) - -526036097) * -712068291;
                                                int cfr_ignored_27 = (int)(0x5C3C1D3ED4D7B930L ^ (long)n2 ^ 0xC70D651C894715A9L);
                                                n3 = Integer.rotateLeft(n2 ^ 0x56A7EB54, 13) + -2085421633 - -2085421633;
                                                int cfr_ignored_28 = (int)(0x8D8FA3EB3D50D8BCL ^ (long)n2 ^ 0xBAA6B6124A5EB6CEL);
                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) ^ 0xCE191A46019FDC62L ^ 0xCE191A46019FDC62L);
                                                n += 5;
                                                continue;
                                            }
                                            int cfr_ignored_29 = (Integer.rotateRight(0xF42B7913 ^ n2, 17) + -1784592248) * -198477549;
                                            int cfr_ignored_30 = (int)(0x6B5DC0F8D11A024L ^ (long)n2 ^ 0x456FD690BB6FA0BAL);
                                            n3 = Integer.rotateLeft(n2 ^ 0xDD9A069A, 13) + 1599567436 - 1599567436;
                                            int cfr_ignored_31 = (int)(0xFB1FEBDDF9D83B59L ^ (long)n2 ^ 0x2ACB3F038D945BEEL);
                                            n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13);
                                            n -= 4;
                                            continue;
                                        }
                                        int cfr_ignored_32 = (Integer.rotateLeft(0x42A0FF58 ^ n2, 11) + 366775011) * 1117847385;
                                        int cfr_ignored_33 = (int)(0x24D72DA6DA21D580L ^ (long)n2 ^ 0xA63D78F05027E47FL);
                                        n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13);
                                        continue;
                                    }
                                    int cfr_ignored_34 = (Integer.rotateLeft(0x18D3E85C ^ n2, 6) - 101106271) * 416540765;
                                    n3 = Integer.rotateLeft(n2 ^ 0xB5DCEC65, 13);
                                    int cfr_ignored_35 = (Integer.rotateRight(0xB79D411F ^ n2, 9) - 1080590844) * -1214430945;
                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13)));
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_36 = Integer.rotateLeft(0xF1DC4BC9 ^ n2, 17) + 1309330578;
                                int cfr_ignored_37 = (int)(0x336EE5F427D4EB4FL ^ (long)n2 ^ 0x3698831A2DB9CB0CL);
                                int cfr_ignored_38 = (int)(0xD12C30D771B48A03L ^ (long)n2 ^ 0x9CDE2FDAEF200F89L);
                                n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) ^ 0xE87A0B43 ^ 0xE87A0B43;
                                continue;
                            }
                            int cfr_ignored_39 = (Integer.rotateLeft(0x4E4B9D35 ^ n2, 12) - 2139465894) * 1313578293;
                            int cfr_ignored_40 = (int)(0x8CF9330827D4EB4FL ^ (long)n2 ^ 0x9B60831A2DB8B423L);
                            try {
                                ++n;
                                if ((0xB243079503A15577L ^ (long)n2 | 1L) == 0L) {
                                    throw new ArithmeticException();
                                }
                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) ^ 0xC3E9D082ED720A4AL ^ 0xC3E9D082ED720A4AL);
                            }
                            catch (ArithmeticException arithmeticException) {
                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13)));
                            }
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_41 = Integer.rotateRight(0xE012CC8E ^ n2, 15) - 648307821;
                        n3 = Integer.rotateLeft(n2 ^ 0x4F08CF40, 13) ^ 0xC04FA611 ^ 0xC04FA611;
                        int cfr_ignored_42 = Integer.rotateRight(0x8BC7B1C6 ^ n2, 4) - -242473419;
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) ^ 0xE4AECF085205A0E3L ^ 0xE4AECF085205A0E3L);
                        continue;
                    }
                    int cfr_ignored_43 = (Integer.rotateLeft(0x82C61559 ^ n2, 3) + -631622398) * -2100947623;
                    int cfr_ignored_44 = (int)(0x4074BB6427D4EB4FL ^ (long)n2 ^ 0x8BB8831A2DB92D38L);
                    n3 = Integer.rotateLeft(n2 ^ 0x39CE37DB, 13);
                    int cfr_ignored_45 = (Integer.rotateLeft(0xE6B34C95 ^ n2, 15) - -200022714) * -424457067;
                    int cfr_ignored_46 = (int)(0x2401E2A827D4EB4FL ^ (long)n2 ^ 0x3820831A2DB9E5D2L);
                    try {
                        if ((0x8D69154C4D411457L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) + 662626708 - 662626708;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) + 1642113876 - 1642113876;
                    }
                    n -= 4;
                    continue;
                }
                int cfr_ignored_47 = (Integer.rotateRight(0xFB3CFFF6 ^ n2, 18) - 1891671557) * -79888393;
                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x9972AA4A, 13) ^ 0x11CCE5C03990FC68L ^ 0x11CCE5C03990FC68L);
                int cfr_ignored_48 = Integer.rotateRight(0xB4CB8EEF ^ n2, 9) - -385618388;
                try {
                    n -= 5;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) ^ 0xB4BE07E18D0E9DDEL ^ 0xB4BE07E18D0E9DDEL);
                }
                catch (ArithmeticException arithmeticException) {
                    n3 = Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13) ^ 0xFE5DF3B7 ^ 0xFE5DF3B7;
                }
                n -= 4;
                continue;
            }
            int cfr_ignored_49 = (Integer.rotateRight(0x9EB52DE ^ n2, 4) - 937207837) * 166417119;
            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x48E4DCD3, 13)));
        }
    }

    public boolean hfa_2(String string) {
        boolean bl = false;
        boolean bl2 = false;
        int n = 0;
        int n2 = 546153662;
        n2 = Integer.rotateLeft(n2 * 641095865, 20) ^ 0xD754601;
        String string2 = string;
        n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
        int n3 = 491258107 * 311687305 + 1580895175 ^ n2;
        while (true) {
            block30: {
                block44: {
                    block28: {
                        block34: {
                            block42: {
                                block37: {
                                    block33: {
                                        block27: {
                                            block29: {
                                                block39: {
                                                    block32: {
                                                        block35: {
                                                            block41: {
                                                                block43: {
                                                                    block38: {
                                                                        block40: {
                                                                            block36: {
                                                                                block25: {
                                                                                    block31: {
                                                                                        block26: {
                                                                                            if ((n = ((n3 ^ n2) - 1580895175) * 576912825) > 310403786) break block25;
                                                                                            if (n > -635137807) break block26;
                                                                                            if (n == -2095341950) break block27;
                                                                                            if (n == -1317846290) break block28;
                                                                                            int cfr_ignored_0 = (Integer.rotateLeft(0xF79D5F35 ^ n2, 17) - 7087782) * -140681419;
                                                                                            int cfr_ignored_1 = (int)(0x352FF10827D4EB4FL ^ (long)n2 ^ 0x1F60831A2DB9C78EL);
                                                                                            if (n == -635137807) break block29;
                                                                                            break block30;
                                                                                        }
                                                                                        if (n > -510276390) break block31;
                                                                                        if (n == -512764186) break block32;
                                                                                        if (n == -510276390) break block33;
                                                                                        break block30;
                                                                                    }
                                                                                    if (n == -396426679) break block34;
                                                                                    if (n == 310403786) break block35;
                                                                                    break block30;
                                                                                }
                                                                                if (n > 544551225) break block36;
                                                                                if (n == 348263558) break block37;
                                                                                if (n == 491258107) break block38;
                                                                                if (n == 544551225) break block39;
                                                                                break block30;
                                                                            }
                                                                            if (n > 1389802292) break block40;
                                                                            if (n == 990205690) break block41;
                                                                            if (n == 1389802292) break block42;
                                                                            break block30;
                                                                        }
                                                                        if (n == 1616908562) break block43;
                                                                        if (n == 1891300041) break block44;
                                                                        int cfr_ignored_2 = Integer.rotateRight(0x734687A7 ^ n2, 17) - -102232972;
                                                                        break block30;
                                                                    }
                                                                    int cfr_ignored_3 = Integer.rotateRight(0xEF9E400B ^ n2, 16) + 143089808;
                                                                    bl = this.hyr.remove(string);
                                                                    if (bl) {
                                                                        try {
                                                                            n += 4;
                                                                            if ((0x78BF9168AC35A913L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            n3 = (int)((long)(1616908562 * 311687305 + 1580895175 ^ n2) ^ 0x75C1F0518CDE842EL ^ 0x75C1F0518CDE842EL);
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n3 = (1616908562 * 311687305 + 1580895175 ^ n2) + 878310744 - 878310744;
                                                                        }
                                                                        n += 2;
                                                                        continue;
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse(1033158269 * 311687305 + 1580895175 ^ n2));
                                                                    int cfr_ignored_4 = (Integer.rotateRight(0x570A451F ^ n2, 13) - -1902379524) * 1460290847;
                                                                    n3 = (int)((long)(990205690 * 311687305 + 1580895175 ^ n2) ^ 0x58AAE6496AA22BBAL ^ 0x58AAE6496AA22BBAL);
                                                                    continue;
                                                                }
                                                                int cfr_ignored_5 = Integer.rotateLeft(0x240EAA48 ^ n2, 7) + 1646542323;
                                                                this.dnj();
                                                                int cfr_ignored_6 = (int)(0xF8BB1B56D1215536L ^ (long)n2 ^ 0xCBDD6EF1514A5CA7L);
                                                                n3 = 990205690 * 311687305 + 1580895175 ^ n2;
                                                                --n;
                                                                continue;
                                                            }
                                                            int cfr_ignored_7 = Integer.rotateRight(0x10CB1EE7 ^ n2, 5) - 217472308;
                                                            bl2 = bl;
                                                            n3 = (-1148211497 * 311687305 + 1580895175 ^ n2) + -986425736 - -986425736;
                                                            int cfr_ignored_8 = Integer.rotateLeft(0x6B9578C4 ^ n2, 16) - 192364279;
                                                            n3 = (int)((long)(1891300041 * 311687305 + 1580895175 ^ n2) ^ 0x8F911864C2994E24L ^ 0x8F911864C2994E24L);
                                                            continue;
                                                        }
                                                        int cfr_ignored_9 = Integer.rotateRight(0x81B7BD8A ^ n2, 3) + -1180855567;
                                                        n3 = -777922134 * 311687305 + 1580895175 ^ n2;
                                                        int cfr_ignored_10 = (Integer.rotateLeft(0x57E08E50 ^ n2, 13) + -1467032853) * 1474334289;
                                                        try {
                                                            n += 4;
                                                            if ((0xEDD66EF9DCDB4307L ^ (long)n2 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            n3 = (int)((long)(491258107 * 311687305 + 1580895175 ^ n2) ^ 0x9291874D198C6E23L ^ 0x9291874D198C6E23L);
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n3 = Integer.reverse(Integer.reverse(491258107 * 311687305 + 1580895175 ^ n2));
                                                        }
                                                        n -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_11 = Integer.rotateLeft(0x64910468 ^ n2, 15) + 837625811;
                                                    try {
                                                        --n;
                                                        if ((0xD186FA0ABC3C9841L ^ (long)n2 | 1L) == 0L) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        n3 = 491258107 * 311687305 + 1580895175 ^ n2 ^ 0x4D3F71C1 ^ 0x4D3F71C1;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n3 = (491258107 * 311687305 + 1580895175 ^ n2) + 1819536588 - 1819536588;
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_12 = (Integer.rotateRight(0x1D0031D6 ^ n2, 6) - -2023512027) * 486552023;
                                                int cfr_ignored_13 = (int)(0x92BC076D814CD05CL ^ (long)n2 ^ 0xF3ABCE2A5B9E88A9L);
                                                n3 = -1451538696 * 311687305 + 1580895175 ^ n2 ^ 0x677CE235 ^ 0x677CE235;
                                                int cfr_ignored_14 = (int)(0xE40E5A4D01A98AF5L ^ (long)n2 ^ 0x49EACFE0EECC65CDL);
                                                n3 = Integer.reverse(Integer.reverse(491258107 * 311687305 + 1580895175 ^ n2));
                                                continue;
                                            }
                                            int cfr_ignored_15 = Integer.rotateLeft(0xEB05FDE1 ^ n2, 16) + 2048351610;
                                            int cfr_ignored_16 = (int)(0x29B753DC27D4EB4FL ^ (long)n2 ^ 0x5AC8831A2DB9FEBFL);
                                            n3 = (-479433472 * 311687305 + 1580895175 ^ n2) + 1609205281 - 1609205281;
                                            int cfr_ignored_17 = Integer.rotateRight(0xACAC3626 ^ n2, 8) - -315085355;
                                            int cfr_ignored_18 = (int)(0x8690923D346D13D2L ^ (long)n2 ^ 0xD90AA469DC82A0F0L);
                                            n3 = Integer.reverse(Integer.reverse(491258107 * 311687305 + 1580895175 ^ n2));
                                            n -= 3;
                                            continue;
                                        }
                                        int cfr_ignored_19 = (Integer.rotateLeft(0x35998A74 ^ n2, 9) - -2114624697) * 899254901;
                                        n3 = (692485354 * 311687305 + 1580895175 ^ n2) + 362355673 - 362355673;
                                        int cfr_ignored_20 = (Integer.rotateLeft(0x60699DFC ^ n2, 15) - -1322794817) * 1617534461;
                                        try {
                                            n -= 5;
                                            if ((0xBAD38B33AD674D23L ^ (long)n2 | 1L) == 0L) {
                                                throw new NoSuchElementException();
                                            }
                                            n3 = (int)((long)(491258107 * 311687305 + 1580895175 ^ n2) ^ 0x536CAF6720E54709L ^ 0x536CAF6720E54709L);
                                        }
                                        catch (NoSuchElementException noSuchElementException) {
                                            n3 = (int)((long)(491258107 * 311687305 + 1580895175 ^ n2) ^ 0x4908620850E8B447L ^ 0x4908620850E8B447L);
                                        }
                                        n -= 4;
                                        continue;
                                    }
                                    int cfr_ignored_21 = Integer.rotateLeft(0xA80A0480 ^ n2, 8) + 1569991355;
                                    try {
                                        n -= 4;
                                        n3 = 491258107 * 311687305 + 1580895175 ^ n2;
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n3 = 491258107 * 311687305 + 1580895175 ^ n2 ^ 0xBE21B083 ^ 0xBE21B083;
                                    }
                                    continue;
                                }
                                int cfr_ignored_22 = Integer.rotateRight(0x4FEB81AE ^ n2, 12) - -1310567603;
                                try {
                                    n += 5;
                                    if ((0xF0D58AC006EB39F5L ^ (long)n2 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    n3 = 491258107 * 311687305 + 1580895175 ^ n2 ^ 0x813A4A2B ^ 0x813A4A2B;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = 491258107 * 311687305 + 1580895175 ^ n2;
                                }
                                continue;
                            }
                            int cfr_ignored_23 = Integer.rotateRight(0xF3E200AE ^ n2, 17) - -1933855667;
                            try {
                                n -= 5;
                                if ((0xDE1F8CD5106EA73BL ^ (long)n2 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                n3 = 491258107 * 311687305 + 1580895175 ^ n2;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n3 = 491258107 * 311687305 + 1580895175 ^ n2 ^ 0x67AE8D4F ^ 0x67AE8D4F;
                            }
                            n += 5;
                            continue;
                        }
                        int cfr_ignored_24 = Integer.rotateRight(0xECABC5E2 ^ n2, 16) + -1389718119;
                        n3 = (188960826 * 311687305 + 1580895175 ^ n2) + -64316827 - -64316827;
                        int cfr_ignored_25 = (Integer.rotateLeft(0x384B5DB1 ^ n2, 10) + -713164886) * 944463281;
                        int cfr_ignored_26 = (int)(0xFAF9F38C27D4EB4FL ^ (long)n2 ^ 0x1A68831A2DB85822L);
                        n3 = Integer.reverse(Integer.reverse(491258107 * 311687305 + 1580895175 ^ n2));
                        int cfr_ignored_27 = (Integer.rotateRight(0xBC3936B7 ^ n2, 10) - -817152156) * -1137101129;
                        continue;
                    }
                    int cfr_ignored_28 = Integer.rotateRight(0x42567703 ^ n2, 11) + 215353496;
                    n3 = -1804275782 * 311687305 + 1580895175 ^ n2;
                    int cfr_ignored_29 = (Integer.rotateRight(0x6DD03B52 ^ n2, 16) + 1351929385) * 1842363219;
                    try {
                        n -= 5;
                        if ((0x60BAFA43C92B78EDL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(491258107 * 311687305 + 1580895175 ^ n2) ^ 0x828FAFF1C067B7EDL ^ 0x828FAFF1C067B7EDL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(491258107 * 311687305 + 1580895175 ^ n2) ^ 0x4F32510966969133L ^ 0x4F32510966969133L);
                    }
                    --n;
                    continue;
                }
                return bl2;
            }
            int cfr_ignored_30 = (Integer.rotateRight(0x35EA33FE ^ n2, 9) - -1950749955) * 904541183;
            n3 = 491258107 * 311687305 + 1580895175 ^ n2 ^ 0xE538F4C0 ^ 0xE538F4C0;
        }
    }

    public List zdf_3() {
        int n = ydh.hthd(-1323187503);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x2CD06C30;
        if ((n2 ^ n) != 751856688) {
            int cfr_ignored_0 = Integer.rotateLeft(0x9DF1AEE1 ^ n, 6) + 614583418;
            int cfr_ignored_1 = (int)(0x5F4300DC27D4EB4FL ^ (long)n ^ 0xFCC8831A2DB91357L);
        }
        return new ArrayList(this.hyr);
    }

    public void tht_5() {
        int n = 0;
        int n2 = 362087532;
        n2 = Integer.rotateLeft(n2 * 1311713723, 26) ^ 0x4930B97D;
        int n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) ^ 0x70E7E8C1 ^ 0x70E7E8C1;
        while (true) {
            block17: {
                block14: {
                    block16: {
                        block18: {
                            block29: {
                                block28: {
                                    block27: {
                                        block26: {
                                            block20: {
                                                block22: {
                                                    block19: {
                                                        block24: {
                                                            block15: {
                                                                block23: {
                                                                    block25: {
                                                                        block21: {
                                                                            block12: {
                                                                                block13: {
                                                                                    if ((n = Integer.reverse(n3) ^ n2 ^ 0xAE937DCC) > -845546157) break block12;
                                                                                    if (n > -1387103420) break block13;
                                                                                    if (n == -1819750247) break block14;
                                                                                    if (n == -1407455877) break block15;
                                                                                    int cfr_ignored_0 = Integer.rotateLeft(0xF5761041 ^ n2, 17) + -1112959206;
                                                                                    int cfr_ignored_1 = (int)(0x37C4BE7C27D4EB4FL ^ (long)n2 ^ 0x8188831A2DB9C258L);
                                                                                    if (n == -1387103420) break block16;
                                                                                    break block17;
                                                                                }
                                                                                if (n == -1213938645) break block18;
                                                                                if (n == -1206167751) break block19;
                                                                                int cfr_ignored_2 = Integer.rotateRight(0x7A831EE2 ^ n2, 18) + -633447271;
                                                                                if (n == -845546157) break block20;
                                                                                break block17;
                                                                            }
                                                                            if (n > 756651284) break block21;
                                                                            if (n == -414006261) break block22;
                                                                            if (n == -355343541) break block23;
                                                                            if (n == 756651284) break block24;
                                                                            break block17;
                                                                        }
                                                                        if (n > 1164423538) break block25;
                                                                        if (n == 1082682982) break block26;
                                                                        if (n == 1164423538) break block27;
                                                                        break block17;
                                                                    }
                                                                    if (n == 1519484976) break block28;
                                                                    if (n == 1689954439) break block29;
                                                                    break block17;
                                                                }
                                                                int cfr_ignored_3 = (Integer.rotateRight(0x564145BE ^ n2, 13) - 1984237885) * 1447118271;
                                                                if (yf.khdha_2()) {
                                                                    try {
                                                                        --n;
                                                                        if ((0x83A223D6C01A167BL ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        n3 = Integer.reverse(n2 ^ 0xAC1BED7B ^ 0xAE937DCC) ^ 0xA2533C3F ^ 0xA2533C3F;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = Integer.reverse(n2 ^ 0xAC1BED7B ^ 0xAE937DCC) ^ 0x5A4F5212 ^ 0x5A4F5212;
                                                                    }
                                                                    continue;
                                                                }
                                                                n3 = Integer.reverse(n2 ^ 0x23F2423D ^ 0xAE937DCC) ^ 0x6A8C49A7 ^ 0x6A8C49A7;
                                                                int cfr_ignored_4 = Integer.rotateLeft(0xDB4E9ED ^ n2, 4) - -1387924754;
                                                                int cfr_ignored_5 = (int)(0xCF0647D027D4EB4FL ^ (long)n2 ^ 0x72D0831A2DB833DDL);
                                                                n3 = (int)((long)Integer.reverse(n2 ^ 0x2D199514 ^ 0xAE937DCC) ^ 0xE6901C540337CB07L ^ 0xE6901C540337CB07L);
                                                                n += 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_6 = Integer.rotateRight(0x86563BA6 ^ n2, 3) - 1221515349;
                                                            this.hyr.clear();
                                                            this.dnj();
                                                            return;
                                                        }
                                                        int cfr_ignored_7 = Integer.rotateRight(0x738FDB6E ^ n2, 17) - 46739853;
                                                        yf.athz_2();
                                                        throw null;
                                                    }
                                                    int cfr_ignored_8 = (Integer.rotateLeft(0x81F88798 ^ n2, 3) + -1049228637) * -2114418791;
                                                    try {
                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC)));
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) ^ 0xDB32D94 ^ 0xDB32D94;
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_9 = Integer.rotateLeft(0x1EABBD48 ^ n2, 6) + -1154905357;
                                                n3 = Integer.reverse(n2 ^ 0xAE6844C ^ 0xAE937DCC) + -809308610 - -809308610;
                                                int cfr_ignored_10 = (Integer.rotateRight(0x1AA71D33 ^ n2, 6) + 1050290280) * 447159603;
                                                n3 = (int)((long)Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) ^ 0x5A7C26F2607C1D20L ^ 0x5A7C26F2607C1D20L);
                                                int cfr_ignored_11 = (Integer.rotateRight(0x7C3D8856 ^ n2, 18) - 265363877) * 2084407383;
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_12 = Integer.rotateRight(0xBFA413CE ^ n2, 10) - 960234797;
                                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xD8DA5592 ^ 0xAE937DCC)));
                                            int cfr_ignored_13 = Integer.rotateRight(0x3AD4ECA2 ^ n2, 10) + 606488281;
                                            n3 = Integer.reverse(n2 ^ 0xE7131671 ^ 0xAE937DCC);
                                            int cfr_ignored_14 = Integer.rotateLeft(0xD1E4C941 ^ n2, 13) + 1863450138;
                                            int cfr_ignored_15 = (int)(0x1356677C27D4EB4FL ^ (long)n2 ^ 0x3388831A2DB98B7DL);
                                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC)));
                                            continue;
                                        }
                                        int cfr_ignored_16 = (Integer.rotateLeft(0x42EEB491 ^ n2, 11) + 524647626) * 1122940049;
                                        int cfr_ignored_17 = (int)(0x805C1AAC27D4EB4FL ^ (long)n2 ^ 0xC828831A2DB8AD69L);
                                        n3 = Integer.reverse(n2 ^ 0xE5114AA8 ^ 0xAE937DCC);
                                        int cfr_ignored_18 = Integer.rotateLeft(0x5E0CF585 ^ n2, 14) - 1743739478;
                                        int cfr_ignored_19 = (int)(0x9CBE5BB827D4EB4FL ^ (long)n2 ^ 0x4A00831A2DB894ADL);
                                        try {
                                            n -= 3;
                                            if ((0x9CD108A40DC51F97L ^ (long)n2 | 1L) == 0L) {
                                                throw new IllegalArgumentException();
                                            }
                                            n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) ^ 0x9F35E0D7 ^ 0x9F35E0D7;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC);
                                        }
                                        --n;
                                        continue;
                                    }
                                    int cfr_ignored_20 = (Integer.rotateRight(0x6B1402F7 ^ n2, 16) - -70649052) * 1796473591;
                                    n3 = Integer.reverse(n2 ^ 0x82B7632F ^ 0xAE937DCC);
                                    int cfr_ignored_21 = (Integer.rotateLeft(0x804EBE5D ^ n2, 3) - -1914262402) * -2142323107;
                                    int cfr_ignored_22 = (int)(0x42FC106027D4EB4FL ^ (long)n2 ^ 0xDDB0831A2DB92829L);
                                    int cfr_ignored_23 = (int)(0x9D64B2D6FD22DEB5L ^ (long)n2 ^ 0x98DD36F6464C9718L);
                                    n3 = Integer.reverse(n2 ^ 0x4CF3CB64 ^ 0xAE937DCC);
                                    int cfr_ignored_24 = (int)(0x8D5BDE8EB0B74337L ^ (long)n2 ^ 0x406DADDD7D48B766L);
                                    n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) ^ 0xD5786FAB ^ 0xD5786FAB;
                                    n += 5;
                                    continue;
                                }
                                int cfr_ignored_25 = (Integer.rotateLeft(0x8DE14BB1 ^ n2, 4) + 849725866) * -1914614863;
                                int cfr_ignored_26 = (int)(0x4F53E58C27D4EB4FL ^ (long)n2 ^ 0x3668831A2DB93376L);
                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xA72F44F7 ^ 0xAE937DCC)));
                                int cfr_ignored_27 = Integer.rotateRight(0xAA68F94B ^ n2, 8) + -1491873968;
                                n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) + -2076311610 - -2076311610;
                                int cfr_ignored_28 = (Integer.rotateLeft(0x3CA3F530 ^ n2, 10) + 1547194379) * 1017378097;
                                n += 3;
                                continue;
                            }
                            int cfr_ignored_29 = (Integer.rotateRight(0x774EBD96 ^ n2, 17) - 1994822757) * 2001649047;
                            try {
                                --n;
                                n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC);
                            }
                            catch (IllegalStateException illegalStateException) {
                                n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) + 1419589643 - 1419589643;
                            }
                            ++n;
                            continue;
                        }
                        int cfr_ignored_30 = (Integer.rotateRight(0xCBD7919B ^ n2, 12) + -1283964672) * -875064933;
                        n3 = Integer.reverse(n2 ^ 0x891DFC6B ^ 0xAE937DCC) + 1821711429 - 1821711429;
                        int cfr_ignored_31 = (Integer.rotateLeft(0xA2187394 ^ n2, 7) - -1521246681) * -1575455851;
                        n3 = Integer.reverse(n2 ^ 0x20C9DE2B ^ 0xAE937DCC);
                        int cfr_ignored_32 = Integer.rotateRight(0xEB5CB8CE ^ n2, 16) - -2070413267;
                        n3 = Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC);
                        continue;
                    }
                    int cfr_ignored_33 = (Integer.rotateRight(0xA5B1F552 ^ n2, 7) + 350901289) * -1515063981;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) ^ 0x8184D4678566E210L ^ 0x8184D4678566E210L);
                    n -= 3;
                    continue;
                }
                int cfr_ignored_34 = (Integer.rotateRight(0x182A191F ^ n2, 6) - -243881476) * 405412127;
                int cfr_ignored_35 = (int)(0xE6283440C129535L ^ (long)n2 ^ 0xFBF8D496D14DB114L);
                n3 = (int)((long)Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) ^ 0xC8B4AA6B5FCBC27AL ^ 0xC8B4AA6B5FCBC27AL);
                continue;
            }
            int cfr_ignored_36 = (Integer.rotateRight(0x7F233F9F ^ n2, 18) - 1772245884) * 2133016479;
            n3 = (int)((long)Integer.reverse(n2 ^ 0xEAD1E34B ^ 0xAE937DCC) ^ 0x82BFCEBBA837DE38L ^ 0x82BFCEBBA837DE38L);
        }
    }

    public boolean aqj(String string) {
        block0: {
            int n = 1144496988;
            n = Integer.rotateLeft(n * 1183921967, 9) ^ 0xB5766EF8;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 21);
            int n2 = n ^ 0x268F820F;
            if ((n2 ^ n) == 646939151) break block0;
            int cfr_ignored_0 = (0x62B82153 ^ n) + 548063318;
        }
        return this.hyr.contains(string);
    }

    public int ldh() {
        block0: {
            int n = ydh.hthd(382840978);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
            int n2 = n ^ 0xE32F813;
            if ((n2 ^ n) == 238221331) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x18E34881 ^ n, 6) + 132343514;
            int cfr_ignored_1 = (int)(0xDA51E6BC27D4EB4FL ^ (long)n ^ 0x3008831A2DB81972L);
        }
        return this.hyr.size();
    }

    private static Path shzz(String string, String[] stringArray) {
        block0: {
            int n = 528763164;
            n = Integer.rotateLeft(n * 167970727, 10) ^ 0xDB766055;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xBAA03757;
            if ((n2 ^ n) == -1163905193) break block0;
            int cfr_ignored_0 = (0xA5247E4B ^ n) + 275922265;
        }
        return Path.of(string, stringArray);
    }

    private static void tgh_2(Throwable throwable, Throwable throwable2) {
        int n = -677263099;
        n = Integer.rotateLeft(n * -463588877, 19) ^ 0x9DBF15FA;
        Throwable throwable3 = throwable2;
        n = (throwable3 != null ? System.identityHashCode(throwable3) : 0) ^ n;
        int n2 = n ^ 0x7247431B;
        if ((n2 ^ n) != 1917272859) {
            int cfr_ignored_0 = (0xA5E68A1E ^ n) + -1464049595;
        }
        throwable.addSuppressed(throwable2);
    }

    private static void ghrkh(FileReader fileReader) {
        int n = 1441712168;
        int n2 = (n = Integer.rotateLeft(n * -793575219, 16) ^ 0xC3C318A1) ^ 0x1E1718BD;
        if ((n2 ^ n) != 504830141) {
            int cfr_ignored_0 = (0x4BF9D095 ^ n) + -1060703481;
        }
        fileReader.close();
    }

    private static void sdd_7(Throwable throwable, Throwable throwable2) {
        int n = -1628759935;
        n = Integer.rotateLeft(n * 662815275, 23) ^ 0x5FD3607B;
        Throwable throwable3 = throwable;
        n = (throwable3 != null ? System.identityHashCode(throwable3) : 0) ^ n;
        int n2 = n ^ 0x695F753D;
        if ((n2 ^ n) != 1767863613) {
            int cfr_ignored_0 = (0xF7B46DBC ^ n) + 2015338111;
        }
        throwable.addSuppressed(throwable2);
    }

    private static String[] sdha(String string) {
        block0: {
            int n = 1595341749;
            int n2 = (n = Integer.rotateLeft(n * -442213893, 17) ^ 0xD84AA591) ^ 0x332FC868;
            if ((n2 ^ n) == 858769512) break block0;
            int cfr_ignored_0 = (0x6C3933DD ^ n) - 1821683444;
        }
        return string.split("\b\u001b", -1);
    }

    private static CallSite zghw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2122430492;
            n3 = Integer.rotateLeft(n3 * 1049944507, 16) ^ 0x6369A3D6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 18);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x526C8C2B;
            if ((n4 ^ n3) != 1382845483) {
                int cfr_ignored_0 = (0xD312CBCF ^ n3) - 600729346;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhkb ^ string.hashCode()) + (n2 + zkgh) + i ^ dhkb, 24) + zkgh);
            }
            String[] stringArray = bwd.sdha(new String(cArray));
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

    private static String[] ehmdu53yn8dxf(String string) {
        return string.split("\u0001\u0012", -1);
    }

    private static CallSite kia1z178(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hcwrw16q ^ string.hashCode() ^ n2 + djvxm2uuzx7b3 + i * 407243169) + hcwrw16q) ^ djvxm2uuzx7b3));
            }
            String[] stringArray = bwd.ehmdu53yn8dxf(new String(cArray));
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

