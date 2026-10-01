/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.wn;
import us.m0vy.moondlc.m0vyguard.yf;

public class bs {
    private double[] khft_2;
    private int jhn_2;
    private static final int jht_3 = 1830717580;
    private static final int ztht = -28002882;
    private static final int rht_3 = 822705114;
    private static final int rdt_4 = 1362533287;
    private static final int hn70ui5sdlr2 = 1030415569;
    private static final int xgrvna9la = 650679228;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ixcn5obb;

    public bs() {
        this(5);
    }

    public bs(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Stack's capaci".concat("ty must be positive"));
        }
        this.khft_2 = new double[n];
        this.jhn_2 = -1;
    }

    public void asd_3(double d) {
        int n = 0;
        int n2 = -1849799256;
        n2 = Integer.rotateLeft(n2 * 164093459, 17) ^ 0x55C165D8;
        int n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xE438E977, 3)));
        while (true) {
            block33: {
                block23: {
                    block25: {
                        block21: {
                            block20: {
                                block31: {
                                    block32: {
                                        block26: {
                                            block19: {
                                                block28: {
                                                    block30: {
                                                        block22: {
                                                            block27: {
                                                                block29: {
                                                                    block24: {
                                                                        if ((n = Integer.rotateRight(n3, 3) ^ n2) == 693762689) break block19;
                                                                        if (n == 1273522777) break block20;
                                                                        int cfr_ignored_0 = Integer.rotateLeft(0x307F8825 ^ n2, 9) - -472966218;
                                                                        int cfr_ignored_1 = (int)(0xF2CD261827D4EB4FL ^ (long)n2 ^ 0xB140831A2DB8484BL);
                                                                        if (n == 1775159908) break block21;
                                                                        if (n == 2068643839) break block22;
                                                                        if (n == 1186237036) break block23;
                                                                        int cfr_ignored_2 = (Integer.rotateLeft(0xCDC521F8 ^ n2, 12) + -281232317) * -842718727;
                                                                        if (n == 661825803) break block24;
                                                                        if (n == -631201090) break block25;
                                                                        if (n == 1504082409) break block26;
                                                                        if (n == 594168510) break block27;
                                                                        if (n == -541865612) break block28;
                                                                        if (n == -466032265) break block29;
                                                                        int cfr_ignored_3 = Integer.rotateRight(0x3F577A02 ^ n2, 10) + -1342872199;
                                                                        if (n == -579895334) break block30;
                                                                        if (n == -1061686772) break block31;
                                                                        if (n == 911134140) break block32;
                                                                        break block33;
                                                                    }
                                                                    int cfr_ignored_4 = Integer.rotateLeft(0x64B4F3CD ^ n2, 15) - 910632206;
                                                                    int cfr_ignored_5 = (int)(0xA6065DF027D4EB4FL ^ (long)n2 ^ 0x4690831A2DB8E1DDL);
                                                                    this.khft_2[++this.jhn_2] = d;
                                                                    return;
                                                                }
                                                                int cfr_ignored_6 = Integer.rotateLeft(0x2D14750C ^ n2, 8) - 2044185519;
                                                                if (this.jhn_2 + 1 != this.khft_2.length) {
                                                                    try {
                                                                        if ((0x32B5398ABE2541CDL ^ (long)n2 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x2772A90B, 3)));
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = Integer.rotateLeft(n2 ^ 0x2772A90B, 3);
                                                                    }
                                                                    ++n;
                                                                    continue;
                                                                }
                                                                try {
                                                                    n += 2;
                                                                    if ((0x43790FA5C2BCB549L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n3 = Integer.rotateLeft(n2 ^ 0x236A4ABE, 3) + 1040384215 - 1040384215;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n3 = Integer.rotateLeft(n2 ^ 0x236A4ABE, 3) + 1150817941 - 1150817941;
                                                                }
                                                                n -= 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_7 = (Integer.rotateRight(0xB71E2FBB ^ n2, 9) + 822437600) * -1222758469;
                                                            double[] dArray = new double[(int)((double)this.khft_2.length * bs.dhn_3(0x71DA8B3D5440A295L ^ 0x4E29B80E677391A6L)) + 1];
                                                            bs.hdd_4(this.khft_2, 0, dArray, 0, this.khft_2.length);
                                                            this.khft_2 = dArray;
                                                            try {
                                                                ++n;
                                                                if ((0xFD2C1C86D6465B69L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                n3 = Integer.rotateLeft(n2 ^ 0x2772A90B, 3) + -1867363077 - -1867363077;
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x2772A90B, 3)));
                                                            }
                                                            n -= 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_8 = Integer.rotateRight(0x37790D23 ^ n2, 9) + -1140443528;
                                                        try {
                                                            n -= 5;
                                                            if ((0xAFCFF6F36CF39F17L ^ (long)n2 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3);
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3) + -437972124 - -437972124;
                                                        }
                                                        n += 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_9 = Integer.rotateLeft(0xDBABE408 ^ n2, 14) + -1641137101;
                                                    n3 = Integer.rotateLeft(n2 ^ 0xCA41ED95, 3) ^ 0xD020C188 ^ 0xD020C188;
                                                    int cfr_ignored_10 = (Integer.rotateLeft(0x8E3E329C ^ n2, 4) - 1038467103) * -1908526435;
                                                    n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3) ^ 0x8029B904 ^ 0x8029B904;
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_11 = Integer.rotateRight(0x71752FAB ^ n2, 17) + -1047632656;
                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5D985EF3, 3) ^ 0x5CC8A88EB648AB56L ^ 0x5CC8A88EB648AB56L);
                                                int cfr_ignored_12 = Integer.rotateLeft(0x6164F6C9 ^ n2, 15) + -812154478;
                                                int cfr_ignored_13 = (int)(0xA3D658F427D4EB4FL ^ (long)n2 ^ 0x4C98831A2DB8EA7DL);
                                                try {
                                                    n += 5;
                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xE438E977, 3) ^ 0x994ADD5F11E6ABFEL ^ 0x994ADD5F11E6ABFEL);
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3) + 1491918450 - 1491918450;
                                                }
                                                n -= 3;
                                                continue;
                                            }
                                            int cfr_ignored_14 = Integer.rotateRight(0x21E725CF ^ n2, 7) - 526070604;
                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xE438E977, 3)));
                                            n += 2;
                                            continue;
                                        }
                                        int cfr_ignored_15 = Integer.rotateLeft(0x22765ED ^ n2, 3) - 1193473774;
                                        int cfr_ignored_16 = (int)(0xC095CBD027D4EB4FL ^ (long)n2 ^ 0x6AD0831A2DB82CFAL);
                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xE950E41D, 3) ^ 0xD8DE282FF2128A0EL ^ 0xD8DE282FF2128A0EL);
                                        int cfr_ignored_17 = Integer.rotateLeft(0x8A679FA4 ^ n2, 4) - -957746153;
                                        n3 = Integer.rotateLeft(n2 ^ 0x9EB800FC, 3);
                                        int cfr_ignored_18 = (Integer.rotateLeft(0x9DD0CF90 ^ n2, 6) + 547799467) * -1647259759;
                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xE438E977, 3)));
                                        continue;
                                    }
                                    int cfr_ignored_19 = Integer.rotateRight(0xAF286502 ^ n2, 8) + 977394297;
                                    n3 = Integer.rotateLeft(n2 ^ 0x9F3DB48, 3);
                                    int cfr_ignored_20 = Integer.rotateRight(0x750E75CE ^ n2, 17) - 824042285;
                                    try {
                                        if ((0x487A39246D159A4FL ^ (long)n2 | 1L) == 0L) {
                                            throw new IllegalArgumentException();
                                        }
                                        n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3) ^ 0x6AF602CC ^ 0x6AF602CC;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xE438E977, 3) ^ 0xA25A9007ACB96119L ^ 0xA25A9007ACB96119L);
                                    }
                                    continue;
                                }
                                wn.ghkhy(-1116841056, n2);
                                int cfr_ignored_21 = (int)(0x235922197F4A7C15L ^ (long)n2 ^ 0xB9423227030DEB63L);
                                int cfr_ignored_22 = (int)(0x5B0C5116A7622995L ^ (long)n2 ^ 0x5F5D8277A80D1BC9L);
                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xBFD8E33E, 3) ^ 0xBF95854D95EE9C3L ^ 0xBF95854D95EE9C3L);
                                int cfr_ignored_23 = (int)(0x22AACF7795F8343DL ^ (long)n2 ^ 0x639FE743935DE884L);
                                n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3) + -1270956614 - -1270956614;
                                n -= 5;
                                continue;
                            }
                            int cfr_ignored_24 = (Integer.rotateRight(0x7746993E ^ n2, 17) - 1978281405) * 2001115455;
                            n3 = Integer.rotateLeft(n2 ^ 0x6D988E6C, 3);
                            int cfr_ignored_25 = Integer.rotateRight(0x3A6997EA ^ n2, 10) + 388433041;
                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xE438E977, 3) ^ 0x2D09B4C54E0A7826L ^ 0x2D09B4C54E0A7826L);
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_26 = (Integer.rotateLeft(0xC6765F35 ^ n2, 11) - 213067430) * -965320907;
                        int cfr_ignored_27 = (int)(0x4C4F10827D4EB4FL ^ (long)n2 ^ 0x1F60831A2DB9A458L);
                        n3 = Integer.rotateLeft(n2 ^ 0x4FC744BD, 3) ^ 0xFD553B6E ^ 0xFD553B6E;
                        int cfr_ignored_28 = (Integer.rotateRight(0x52B4DC3A ^ n2, 13) + 138693185) * 1387584571;
                        int cfr_ignored_29 = (int)(0x780180CD778F7F34L ^ (long)n2 ^ 0xFCEA23AD054F5DD2L);
                        n3 = Integer.rotateLeft(n2 ^ 0x6083289B, 3) + 928811271 - 928811271;
                        int cfr_ignored_30 = (int)(0x591F35D2A1AA8888L ^ (long)n2 ^ 0x96D58FE6EA371FEFL);
                        n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3) + -1080196588 - -1080196588;
                        --n;
                        continue;
                    }
                    int cfr_ignored_31 = (Integer.rotateLeft(0x37E37211 ^ n2, 9) + -924291254) * 937652753;
                    int cfr_ignored_32 = (int)(0xF551DC2C27D4EB4FL ^ (long)n2 ^ 0x4528831A2DB84772L);
                    n3 = Integer.rotateLeft(n2 ^ 0x79A8FF3D, 3);
                    int cfr_ignored_33 = (Integer.rotateRight(0x17AE24FB ^ n2, 5) + -495707744) * 397288699;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xBAF6A9E6, 3)));
                    int cfr_ignored_34 = (Integer.rotateLeft(0x4DB1D2BD ^ n2, 12) - 1827021854) * 1303499453;
                    int cfr_ignored_35 = (int)(0x8F037C8027D4EB4FL ^ (long)n2 ^ 0x470831A2DB8B3D7L);
                    n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3) + -98459833 - -98459833;
                    --n;
                    continue;
                }
                int cfr_ignored_36 = Integer.rotateRight(0x1DEC252B ^ n2, 6) + -1544151184;
                n3 = Integer.rotateLeft(n2 ^ 0x18273A6C, 3);
                int cfr_ignored_37 = (Integer.rotateRight(0x8EB1AB7F ^ n2, 4) - 1273062300) * -1900958849;
                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x1DDEC3A2, 3)));
                wn.ghkhy(-95416064, n2);
                int cfr_ignored_38 = (int)(0x646768B97F4A7C15L ^ (long)n2 ^ 0x2C023227030D651FL);
                n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3);
                continue;
            }
            int cfr_ignored_39 = (Integer.rotateLeft(0x8274F3B4 ^ n2, 3) - -796450297) * -2106264651;
            n3 = Integer.rotateLeft(n2 ^ 0xE438E977, 3) ^ 0x694C04D9 ^ 0x694C04D9;
        }
    }

    public double ghz() {
        try {
            int n = -1175744663;
            n = Integer.rotateLeft(n * -212495521, 4) ^ 0x1BC1E26A;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x639512AE;
            if ((n2 ^ n) != 1670714030) {
                int cfr_ignored_0 = (0xDA7E9DC7 ^ n) - -736119046;
            }
            if ((0x88 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bs.skf_2()) {
            yf.athz_2();
        }
        if (this.jhn_2 == -1) {
            throw new EmptyStackException();
        }
        return this.khft_2[this.jhn_2];
    }

    /*
     * Unable to fully structure code
     */
    public double dtt() {
        var3_1 = 0;
        var1_2 = 1141908224;
        var1_2 = Integer.rotateLeft(var1_2 * -1724494413, 27) ^ 1035098328;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = (int)((long)(var1_2 ^ 929469123) ^ 9053637338527958495L ^ 9053637338527958495L);
        block34: while (true) {
            if ((var3_1 = var2_3 ^ var1_2) == -1553285261) ** GOTO lbl190
            if (var3_1 == -1751262564) ** GOTO lbl139
            if (var3_1 == -3813489) ** GOTO lbl77
            switch (var3_1) {
                case -1855715994: {
                    (Integer.rotateRight(375675638 ^ var1_2, 5) - -1165712635) * 375675639;
                    return this.khft_2[this.jhn_2--];
                }
                case 1793127783: {
                    (Integer.rotateLeft(2010330813 ^ var1_2, 17) - -2031009762) * 2010330813;
                    (int)(-5376848803912160433L ^ (long)var1_2 ^ -3715325544121186542L);
                    if (this.jhn_2 != -1) {
                        try {
                            var3_1 += 3;
                            if ((5327817966385829989L ^ (long)var1_2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var2_3 = (int)((long)(var1_2 ^ -1855715994) ^ 7576113631366067173L ^ 7576113631366067173L);
                        }
                        catch (UnsupportedOperationException v0) {
                            var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -1855715994));
                        }
                        --var3_1;
                        continue block34;
                    }
                    (int)(946247342506326610L ^ (long)var1_2 ^ -9181903072937134190L);
                    var2_3 = var1_2 ^ 386138695 ^ -1013339098 ^ -1013339098;
                    (int)(4055290884502953197L ^ (long)var1_2 ^ 7950370568547458399L);
                    var2_3 = var1_2 ^ -883018275 ^ 629600515 ^ 629600515;
                    var3_1 -= 4;
                    continue block34;
                }
                case 929469123: {
                    (Integer.rotateLeft(-1368365264 ^ var1_2, 8) + 603594251) * -1368365263;
                    if (!yf.dnkh()) {
                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 1793127783));
                        var3_1 += 5;
                        continue block34;
                    }
                    (int)(-6952335149813569591L ^ (long)var1_2 ^ 5582382708773130969L);
                    var2_3 = var1_2 ^ -1601441360 ^ 1967613402 ^ 1967613402;
                    var3_1 -= 5;
                    continue block34;
                }
                case -1601441360: {
                    Integer.rotateLeft(-1185187132 ^ var1_2, 10) - 1987149047;
                    throw null;
                }
                case -883018275: {
                    Integer.rotateLeft(47710344 ^ var1_2, 3) + 1552265139;
                    throw new EmptyStackException();
                }
                case 458862704: {
                    Integer.rotateLeft(1179446509 ^ var1_2, 11) - -2018619410;
                    (int)(-8863573554829661361L ^ (long)var1_2 ^ 8705602228166632493L);
                    var2_3 = (var1_2 ^ -1535402677) + -1031538950 - -1031538950;
                    Integer.rotateRight(1874449771 ^ var1_2, 16) + -1948354768;
                    try {
                        var3_1 -= 5;
                        if ((6880646477213994567L ^ (long)var1_2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var2_3 = var1_2 ^ 929469123;
                    }
                    catch (ArithmeticException v1) {
                        var2_3 = (var1_2 ^ 929469123) + 1046591868 - 1046591868;
                    }
                    var3_1 += 4;
                    continue block34;
                }
lbl77:
                // 1 sources

                Integer.rotateLeft(885270336 ^ var1_2, 9) + 1746821115;
                try {
                    var3_1 += 5;
                    if ((2589163751123602329L ^ (long)var1_2 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 929469123));
                }
                catch (IllegalArgumentException v2) {
                    var2_3 = (int)((long)(var1_2 ^ 929469123) ^ -7011202440000683682L ^ -7011202440000683682L);
                }
                var3_1 += 4;
                continue block34;
                case 1097572101: {
                    (Integer.rotateLeft(-812122000 ^ var1_2, 12) + 667266251) * -812121999;
                    var2_3 = var1_2 ^ 929469123;
                    Integer.rotateLeft(-924450619 ^ var1_2, 12) - 1480046358;
                    (int)(744412219266362191L ^ (long)var1_2 ^ -6881356082162583176L);
                    continue block34;
                }
                case 354452417: {
                    (Integer.rotateLeft(-892218960 ^ var1_2, 12) + -1815739509) * -892218959;
                    try {
                        var3_1 += 4;
                        if ((-5332758524003762815L ^ (long)var1_2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var2_3 = var1_2 ^ 929469123 ^ 2146078897 ^ 2146078897;
                    }
                    catch (ArithmeticException v3) {
                        var2_3 = (int)((long)(var1_2 ^ 929469123) ^ -2767731271017527031L ^ -2767731271017527031L);
                    }
                    var3_1 += 5;
                    continue block34;
                }
                case -745236677: {
                    (Integer.rotateLeft(1806440656 ^ var1_2, 16) + 238329963) * 1806440657;
                    try {
                        var3_1 -= 5;
                        if ((-349059833831309255L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var2_3 = var1_2 ^ 929469123 ^ 1356579854 ^ 1356579854;
                    }
                    catch (IllegalArgumentException v4) {
                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 929469123));
                    }
                    --var3_1;
                    continue block34;
                }
                case -1847817422: {
                    Integer.rotateLeft(1679113157 ^ var1_2, 15) - 586144790;
                    (int)(-6438012249250141361L ^ (long)var1_2 ^ -2990246004114530146L);
                    try {
                        var3_1 += 3;
                        if ((-7515692596378730389L ^ (long)var1_2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var2_3 = var1_2 ^ 929469123 ^ -143481958 ^ -143481958;
                    }
                    catch (NoSuchElementException v5) {
                        var2_3 = (int)((long)(var1_2 ^ 929469123) ^ 105567137339065337L ^ 105567137339065337L);
                    }
                    --var3_1;
                    continue block34;
                }
lbl139:
                // 1 sources

                Integer.rotateLeft(686596648 ^ var1_2, 8) + -117095917;
                var2_3 = var1_2 ^ 2058657501 ^ -1002417495 ^ -1002417495;
                (Integer.rotateLeft(485614453 ^ var1_2, 6) - -2052576666) * 485614453;
                (int)(-2431014401548686513L ^ (long)var1_2 ^ 7485126729149190487L);
                var2_3 = var1_2 ^ 929469123;
                var3_1 -= 4;
                continue block34;
                case -1753659271: {
                    Integer.rotateLeft(1726339117 ^ var1_2, 15) - 2050149550;
                    (int)(-6604680516755723441L ^ (long)var1_2 ^ 1247641245241107839L);
                    try {
                        var3_1 -= 3;
                        if ((-8270267129622553287L ^ (long)var1_2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var2_3 = (int)((long)(var1_2 ^ 929469123) ^ 4021603793268457000L ^ 4021603793268457000L);
                    }
                    catch (ArithmeticException v6) {
                        var2_3 = (int)((long)(var1_2 ^ 929469123) ^ 6686473433322493767L ^ 6686473433322493767L);
                    }
                    continue block34;
                }
                case 1027055546: {
                    (Integer.rotateRight(1768314035 ^ var1_2, 16) + -943595288) * 1768314035;
                    var2_3 = var1_2 ^ -2074838742 ^ -1453736685 ^ -1453736685;
                    Integer.rotateRight(-1359902170 ^ var1_2, 8) - 865950165;
                    try {
                        if ((-7306521584686495831L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var2_3 = var1_2 ^ 929469123;
                    }
                    catch (IllegalArgumentException v7) {
                        var2_3 = var1_2 ^ 929469123 ^ 971111360 ^ 971111360;
                    }
                    var3_1 -= 5;
                    continue block34;
                }
                case -1858358876: {
                    Integer.rotateLeft(1999590016 ^ var1_2, 17) + 1930992827;
                    try {
                        if ((-6528609491822552189L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var2_3 = var1_2 ^ 929469123 ^ 1985094179 ^ 1985094179;
                    }
                    catch (IllegalArgumentException v8) {
                        var2_3 = (int)((long)(var1_2 ^ 929469123) ^ 8851791768185143295L ^ 8851791768185143295L);
                    }
                    --var3_1;
                    continue block34;
                }
lbl190:
                // 1 sources

                Integer.rotateRight(568996518 ^ var1_2, 7) - 532267349;
                var2_3 = var1_2 ^ 1166123051;
                (Integer.rotateRight(-600817798 ^ var1_2, 14) + -1372238079) * -600817797;
                var2_3 = var1_2 ^ 929469123;
                var3_1 += 2;
                continue block34;
                case -1825447275: {
                    Integer.rotateLeft(-2038391232 ^ var1_2, 3) + 1307625723;
                    var2_3 = (int)((long)(var1_2 ^ 1314290211) ^ 5218524153215989617L ^ 5218524153215989617L);
                    (Integer.rotateLeft(1991971793 ^ var1_2, 17) + 1694827914) * 1991971793;
                    (int)(-5473635050113930417L ^ (long)var1_2 ^ -8743594528080345662L);
                    (int)(-7765694745580731733L ^ (long)var1_2 ^ -7567415553020623452L);
                    var2_3 = (int)((long)(var1_2 ^ 1414553377) ^ 8147717876629579966L ^ 8147717876629579966L);
                    (int)(4386103885174057886L ^ (long)var1_2 ^ -2806407537570884500L);
                    var2_3 = (int)((long)(var1_2 ^ 929469123) ^ 646340945992680444L ^ 646340945992680444L);
                    continue block34;
                }
            }
            (Integer.rotateRight(-587110081 ^ var1_2, 14) - -947298852) * -587110081;
            var2_3 = var1_2 ^ 929469123;
        }
    }

    public boolean thkz_2() {
        int n = -741984660;
        int n2 = (n = Integer.rotateLeft(n * -587182433, 14) ^ 0x5D76017E) ^ 0x806A6354;
        if ((n2 ^ n) != -2140511404) {
            int cfr_ignored_0 = (0x53AC5538 ^ n) + 314865465;
        }
        return this.jhn_2 == -1;
    }

    public int bds_4() {
        block0: {
            int n = wn.zzm(507505682);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD1EE6A6F;
            if ((n2 ^ n) == -772904337) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCFD1867D ^ n, 12) - 784132190) * -808352131;
            int cfr_ignored_1 = (int)(0xD63284027D4EB4FL ^ (long)n ^ 0xADF0831A2DB9B717L);
        }
        return this.jhn_2 + 1;
    }

    private static String rrz_2(String string, int n, int n2, int n3) {
        int n4 = wn.zzm(-647315569);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 4);
        int n5 = n4 ^ 0x23200F33;
        if ((n5 ^ n4) != 589303603) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xFA4AB0BC ^ n4, 18) - 1399391743) * -95768387;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x5A890139 ^ n2 ^ i * 1171870203 ^ jht_3, 7) ^ ztht));
        }
        return new String(cArray);
    }

    private static double dhn_3(long l) {
        block0: {
            int n = -1781959270;
            n = Integer.rotateLeft(n * -1972352573, 11) ^ 0xA343443D;
            int n2 = (n = (int)l ^ n) ^ 0xA8190408;
            if ((n2 ^ n) == -1474755576) break block0;
            int cfr_ignored_0 = (0x3DD07192 ^ n) - -144447686;
        }
        return Double.longBitsToDouble(l);
    }

    private static void hdd_4(Object object, int n, Object object2, int n2, int n3) {
        int n4 = -1840082039;
        n4 = Integer.rotateLeft(n4 * -1094412299, 22) ^ 0x71E361DE;
        n4 = Integer.rotateRight(n ^ n4, 26);
        int n5 = (n4 = n3 ^ n4) ^ 0x7031467B;
        if ((n5 ^ n4) != 1882277499) {
            int cfr_ignored_0 = (0xE263D5F2 ^ n4) + -989368068;
        }
        System.arraycopy(object, n, object2, n2, n3);
    }

    private static boolean skf_2() {
        block0: {
            int n = 446768045;
            int n2 = (n = Integer.rotateLeft(n * -196933517, 26) ^ 0x2351CD80) ^ 0xD76E35C1;
            if ((n2 ^ n) == -680643135) break block0;
            int cfr_ignored_0 = (0xCDCF166C ^ n) - 1146566926;
        }
        return yf.khdha_2();
    }

    private static String[] dhfn(String string) {
        block0: {
            int n = wn.zzm(-1299191049);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x2DE4E93D;
            if ((n2 ^ n) == 769976637) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9F6B03CA ^ n, 6) + 1381176497;
        }
        return string.split("\u0005\u000f", -1);
    }

    private static CallSite tsz_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -990371819;
            n3 = Integer.rotateLeft(n3 * 222691981, 18) ^ 0x76A117A7;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x53018382;
            if ((n4 ^ n3) != 1392608130) {
                int cfr_ignored_0 = (0x97F9A397 ^ n3) - 1179892381;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rht_3 ^ string.hashCode() ^ n2 + rdt_4 ^ i * -863230293 ^ rht_3, 28) ^ rdt_4));
            }
            String[] stringArray = bs.dhfn(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ojbumbtiuwq(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite tyrv9spdfl0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hn70ui5sdlr2 ^ string.hashCode() ^ n2 + xgrvna9la + i * -420305141) + hn70ui5sdlr2) ^ xgrvna9la));
            }
            String[] stringArray = bs.ojbumbtiuwq(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

