/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.ss_3;
import us.m0vy.moondlc.m0vyguard.yf;

public class tdq {
    private long dkj;
    private float shyk;
    private btf_2 dhkk;
    private long dhght;
    private float zjs_2;
    private float stw_2;
    private boolean rhs_2;
    private boolean thtw;
    private static final int b44jjvodo = -732050381;
    private static final int o0gn5ozbz1p = -997854129;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int du5vr4322wpde;

    public tdq(long l, float f, btf_2 btf2) {
        this.dkj = l;
        this.dhkk = btf2;
        this.shyk = f;
        this.zjs_2 = f;
        this.stw_2 = f;
        this.rhs_2 = true;
    }

    public tdq(long l, btf_2 btf2) {
        this(l, 0.0f, btf2);
    }

    public void zsht_2(boolean bl) {
        this.znl_2(bl ? 1.0f : 0.0f);
    }

    public float znl_2(float f) {
        long l;
        long l2 = System.currentTimeMillis();
        if (f != this.stw_2) {
            this.zjs_2 = this.shyk;
            this.stw_2 = f;
            this.dhght = l2;
            this.rhs_2 = false;
        }
        if ((l = l2 - this.dhght) >= this.dkj) {
            this.shyk = this.stw_2;
            this.rhs_2 = true;
            return this.shyk;
        }
        float f2 = (float)l / (float)this.dkj;
        float f3 = this.dhkk.ease(f2, 0.0f, 1.0f, 1.0f);
        this.shyk = this.zjs_2 + (this.stw_2 - this.zjs_2) * f3;
        return this.shyk;
    }

    public void khadh_2(float f) {
        int n = 0;
        int n2 = -1977469559;
        n2 = Integer.rotateLeft(n2 * -1532263275, 19) ^ 0x2CC7F503;
        int n3 = n2 - -1122404687 + -625175069 - -625175069;
        while (true) {
            block15: {
                block18: {
                    block24: {
                        block28: {
                            block20: {
                                block23: {
                                    block19: {
                                        block27: {
                                            block13: {
                                                block26: {
                                                    block12: {
                                                        block29: {
                                                            block14: {
                                                                block17: {
                                                                    block22: {
                                                                        block25: {
                                                                            block21: {
                                                                                block10: {
                                                                                    block16: {
                                                                                        block11: {
                                                                                            if ((n = n2 - n3) > -613868323) break block10;
                                                                                            if (n > -1435594311) break block11;
                                                                                            if (n == -1538325151) break block12;
                                                                                            if (n == -1442085650) break block13;
                                                                                            if (n == -1435594311) break block14;
                                                                                            break block15;
                                                                                        }
                                                                                        if (n > -1114711149) break block16;
                                                                                        if (n == -1122404687) break block17;
                                                                                        if (n == -1114711149) break block18;
                                                                                        int cfr_ignored_0 = (Integer.rotateRight(0xD63E83D6 ^ n2, 13) - -168847835) * -700546089;
                                                                                        break block15;
                                                                                    }
                                                                                    if (n == -873987479) break block19;
                                                                                    if (n == -613868323) break block20;
                                                                                    break block15;
                                                                                }
                                                                                if (n > 434484234) break block21;
                                                                                if (n == -256896436) break block22;
                                                                                if (n == -179204606) break block23;
                                                                                int cfr_ignored_1 = (Integer.rotateLeft(0xF9E2E25D ^ n2, 18) - 1188497534) * -102571427;
                                                                                int cfr_ignored_2 = (int)(0x3B504C6027D4EB4FL ^ (long)n2 ^ 0x65B0831A2DB9DB71L);
                                                                                if (n == 434484234) break block24;
                                                                                break block15;
                                                                            }
                                                                            if (n > 886365359) break block25;
                                                                            if (n == 798843829) break block26;
                                                                            if (n == 886365359) break block27;
                                                                            break block15;
                                                                        }
                                                                        if (n == 921794327) break block28;
                                                                        if (n == 1587221459) break block29;
                                                                        int cfr_ignored_3 = (Integer.rotateRight(0x43C09AD3 ^ n2, 11) + 951082696) * 1136696019;
                                                                        break block15;
                                                                    }
                                                                    int cfr_ignored_4 = (Integer.rotateLeft(0xA9489059 ^ n2, 8) + -2077812222) * -1454862247;
                                                                    int cfr_ignored_5 = (int)(0x6BFA3E6427D4EB4FL ^ (long)n2 ^ 0x81B8831A2DB97A25L);
                                                                    yf.athz_2();
                                                                    throw null;
                                                                }
                                                                int cfr_ignored_6 = Integer.rotateRight(0x68C52BA6 ^ n2, 16) - -1271011243;
                                                                if (yf.khdha_2()) {
                                                                    n3 = n2 - -1435594311 ^ 0xF647141E ^ 0xF647141E;
                                                                    int cfr_ignored_7 = (Integer.rotateLeft(0x5EADA9F5 ^ n2, 14) - 2070229990) * 1588439541;
                                                                    int cfr_ignored_8 = (int)(0x9C1F07C827D4EB4FL ^ (long)n2 ^ 0xF2E0831A2DB895EFL);
                                                                    n -= 2;
                                                                    continue;
                                                                }
                                                                n3 = n2 - -256896436 + -1853060172 - -1853060172;
                                                                continue;
                                                            }
                                                            int cfr_ignored_9 = Integer.rotateLeft(0x7B42AEA8 ^ n2, 18) + -244267629;
                                                            this.shyk = f;
                                                            this.zjs_2 = f;
                                                            this.stw_2 = f;
                                                            this.rhs_2 = true;
                                                            return;
                                                        }
                                                        int cfr_ignored_10 = (Integer.rotateRight(0x16D023F7 ^ n2, 5) - -946734556) * 382739447;
                                                        int cfr_ignored_11 = (int)(0x2453DD29EF170CD3L ^ (long)n2 ^ 0x4723129DE281E576L);
                                                        n3 = n2 - -107590038 + 1337935709 - 1337935709;
                                                        int cfr_ignored_12 = (int)(0xF78819BD11C6679BL ^ (long)n2 ^ 0xCE0AEF3F341042C1L);
                                                        n3 = Integer.reverse(Integer.reverse(n2 - -1122404687));
                                                        continue;
                                                    }
                                                    int cfr_ignored_13 = Integer.rotateLeft(0xEC0F9189 ^ n2, 16) + -1707065646;
                                                    int cfr_ignored_14 = (int)(0x2EBD3FB427D4EB4FL ^ (long)n2 ^ 0x8218831A2DB9F0ABL);
                                                    n3 = (int)((long)(n2 - 1946499929) ^ 0xA21831A598000687L ^ 0xA21831A598000687L);
                                                    int cfr_ignored_15 = Integer.rotateLeft(0xCB34128C ^ n2, 12) - -1616126417;
                                                    n3 = Integer.reverse(Integer.reverse(n2 - -1122404687));
                                                    n += 5;
                                                    continue;
                                                }
                                                int cfr_ignored_16 = (Integer.rotateLeft(0xCEDCD25D ^ n2, 12) - 286988414) * -824389027;
                                                int cfr_ignored_17 = (int)(0xC6E7C6027D4EB4FL ^ (long)n2 ^ 0x5B0831A2DB9B50DL);
                                                int cfr_ignored_18 = (int)(0xD6BE3459B706A557L ^ (long)n2 ^ 0x95C3A2BEB18800ADL);
                                                n3 = n2 - 1784751639 + 1412248387 - 1412248387;
                                                int cfr_ignored_19 = (int)(0xE5BFBBA4807171F8L ^ (long)n2 ^ 0x8A39CC5118D666AEL);
                                                n3 = Integer.reverse(Integer.reverse(n2 - -1122404687));
                                                continue;
                                            }
                                            int cfr_ignored_20 = (Integer.rotateLeft(0x628DA7B4 ^ n2, 15) - -209392121) * 1653450677;
                                            try {
                                                if ((0x6ED8EC36494B409DL ^ (long)n2 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                n3 = n2 - -1122404687;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                n3 = n2 - -1122404687 + -1908822413 - -1908822413;
                                            }
                                            --n;
                                            continue;
                                        }
                                        int cfr_ignored_21 = (Integer.rotateLeft(0xAE754BF0 ^ n2, 8) + 613536075) * -1368044559;
                                        n3 = n2 - 1989481332;
                                        int cfr_ignored_22 = (Integer.rotateLeft(0x533F96BC ^ n2, 13) - 420536319) * 1396676285;
                                        n3 = n2 - -1122404687 + -1725537267 - -1725537267;
                                        continue;
                                    }
                                    int cfr_ignored_23 = Integer.rotateRight(0x257C2122 ^ n2, 7) + -1905941927;
                                    n3 = n2 - -1122404687 + -388562045 - -388562045;
                                    int cfr_ignored_24 = (Integer.rotateLeft(0x3451B655 ^ n2, 9) - 1514320774) * 877770325;
                                    int cfr_ignored_25 = (int)(0xF6E3186827D4EB4FL ^ (long)n2 ^ 0xCDA0831A2DB84017L);
                                    n += 4;
                                    continue;
                                }
                                int cfr_ignored_26 = Integer.rotateLeft(0xA85E00A9 ^ n2, 8) + 1740616626;
                                int cfr_ignored_27 = (int)(0x6AECAE9427D4EB4FL ^ (long)n2 ^ 0xA058831A2DB97808L);
                                n3 = n2 - -1122404687;
                                ++n;
                                continue;
                            }
                            int cfr_ignored_28 = (Integer.rotateRight(0x97112236 ^ n2, 5) - 1332790213) * -1760484809;
                            try {
                                n -= 2;
                                n3 = n2 - -1122404687 + 1764169704 - 1764169704;
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                n3 = (int)((long)(n2 - -1122404687) ^ 0x23DA3DC7ED2912L ^ 0x23DA3DC7ED2912L);
                            }
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_29 = (Integer.rotateLeft(0x915E82BD ^ n2, 5) - -1630571490) * -1856077123;
                        int cfr_ignored_30 = (int)(0x53EC2C8027D4EB4FL ^ (long)n2 ^ 0xA470831A2DB90A09L);
                        try {
                            n -= 5;
                            if ((0x9D643C8570A4FCE1L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = n2 - -1122404687 ^ 0x83C78B8C ^ 0x83C78B8C;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = n2 - -1122404687 ^ 0xC30C7484 ^ 0xC30C7484;
                        }
                        --n;
                        continue;
                    }
                    int cfr_ignored_31 = Integer.rotateRight(0x1637C3C3 ^ n2, 5) + -1256303656;
                    int cfr_ignored_32 = (int)(0xE4886958CFD3F441L ^ (long)n2 ^ 0x2FC1531413A464C1L);
                    n3 = n2 - 1565350299;
                    int cfr_ignored_33 = (int)(0x164ECBC896C7E723L ^ (long)n2 ^ 0x6AE1E13C3561814CL);
                    n3 = Integer.reverse(Integer.reverse(n2 - -1122404687));
                    n -= 3;
                    continue;
                }
                int cfr_ignored_34 = Integer.rotateLeft(0xE3CE42C8 ^ n2, 15) + -1705527949;
                n3 = n2 - -536205571 ^ 0xED0334F6 ^ 0xED0334F6;
                int cfr_ignored_35 = Integer.rotateRight(0x2023276E ^ n2, 7) - -392206963;
                n3 = n2 - -1122404687;
                n += 5;
                continue;
            }
            int cfr_ignored_36 = Integer.rotateLeft(0xE9EFC105 ^ n2, 16) - 1483079382;
            int cfr_ignored_37 = (int)(0x2B5D6F3827D4EB4FL ^ (long)n2 ^ 0x2300831A2DB9FB6BL);
            n3 = (int)((long)(n2 - -1122404687) ^ 0xBA26A1E46A4E64A7L ^ 0xBA26A1E46A4E64A7L);
        }
    }

    public void jtt_3(float f) {
        try {
            int n = -1088828698;
            n = Integer.rotateLeft(n * -1798966951, 9) ^ 0xD2DF550A;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 29);
            int n2 = n ^ 0x4644EC7F;
            if ((n2 ^ n) != 1178922111) {
                int cfr_ignored_0 = (0xF95D2699 ^ n) - -1841164957;
            }
            if ((0x296 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.shyk = f;
        this.zjs_2 = f;
        this.stw_2 = f;
        this.rhs_2 = true;
    }

    public void sdd_5() {
        int n = -1957874088;
        n = Integer.rotateLeft(n * -1262934449, 25) ^ 0xCDC5C4D4;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0x5A8578B6;
        if ((n2 ^ n) != 1518696630) {
            int cfr_ignored_0 = (0xD1C84EEE ^ n) - 848781829;
        }
        this.jtt_3(0.0f);
    }

    public void zwth_2() {
        int n = 0;
        int n2 = 789875306;
        n2 = Integer.rotateLeft(n2 * -1170345319, 3) ^ 0x144E6B0A;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779));
        block48: while (true) {
            switch (n3 - -817501779 ^ 0xCF45E9AD ^ n2) {
                case -1598013032: {
                    int cfr_ignored_0 = Integer.rotateRight(0xDC18CCB ^ n2, 4) + -1362252848;
                    if (this.shyk == 0.0f) {
                        int cfr_ignored_1 = (int)(0xA5BEC3CC09E6A6B2L ^ (long)n2 ^ 0x7AE8DF7EB642E6ACL);
                        n3 = (n2 ^ 0xC056061C ^ 0xCF45E9AD) + -817501779 + 573038708 - 573038708;
                        n += 3;
                        continue block48;
                    }
                    try {
                        if ((0x50EF9093D87FAF6DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x1F4C2F20 ^ 0xCF45E9AD) + -817501779));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)((n2 ^ 0x1F4C2F20 ^ 0xCF45E9AD) + -817501779) ^ 0x516213D22606DF5EL ^ 0x516213D22606DF5EL);
                    }
                    n += 4;
                    continue block48;
                }
                case -1652978652: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xA39A6753 ^ n2, 7) + -737140152) * -1550162093;
                    this.znl_2(1.0f);
                    try {
                        n += 3;
                        n3 = (int)((long)((n2 ^ 0x4E335E1E ^ 0xCF45E9AD) + -817501779) ^ 0x2E4C5247C72E5E67L ^ 0x2E4C5247C72E5E67L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)((n2 ^ 0x4E335E1E ^ 0xCF45E9AD) + -817501779) ^ 0xC944172B4194F423L ^ 0xC944172B4194F423L);
                    }
                    continue block48;
                }
                case 1620164624: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0x33BDF510 ^ n2, 9) + 1214139435) * 868087057;
                    this.znl_2(0.0f);
                    try {
                        if ((0xC3D09BB15AB4470FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (n2 ^ 0x4E335E1E ^ 0xCF45E9AD) + -817501779;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0x4E335E1E ^ 0xCF45E9AD) + -817501779 + 1057664918 - 1057664918;
                    }
                    n += 5;
                    continue block48;
                }
                case 1962510092: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0xBB193318 ^ n2, 10) + -1402286301) * -1155976423;
                    this.thtw = true;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x1F4C2F20 ^ 0xCF45E9AD) + -817501779));
                    int cfr_ignored_5 = (Integer.rotateLeft(0x951D9999 ^ n2, 5) + 317929666) * -1793222247;
                    int cfr_ignored_6 = (int)(0x57AF37A427D4EB4FL ^ (long)n2 ^ 0x9238831A2DB9028FL);
                    n += 2;
                    continue block48;
                }
                case -1068104164: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0x666C735 ^ n2, 3) - -892354906) * 107398965;
                    int cfr_ignored_8 = (int)(0xC4D4690827D4EB4FL ^ (long)n2 ^ 0x2F60831A2DB82479L);
                    this.thtw = true;
                    int cfr_ignored_9 = (int)(0x8A0BFFD612587856L ^ (long)n2 ^ 0x2DCE8030B8AB9C6L);
                    n3 = (n2 ^ 0x4061C1F4 ^ 0xCF45E9AD) + -817501779 ^ 0x7F11E480 ^ 0x7F11E480;
                    int cfr_ignored_10 = (int)(0x779DDCEA3F3CCC72L ^ (long)n2 ^ 0x44A4B2CA63C342EAL);
                    n3 = (n2 ^ 0x1F4C2F20 ^ 0xCF45E9AD) + -817501779;
                    n -= 2;
                    continue block48;
                }
                case -1556815332: {
                    int cfr_ignored_11 = Integer.rotateRight(0x8C78AFC2 ^ n2, 4) + 117106617;
                    if (this.thtw) {
                        try {
                            n += 4;
                            if ((0x1E6E27FAE40411F7L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = (n2 ^ 0x9D798C24 ^ 0xCF45E9AD) + -817501779 ^ 0xF7B11905 ^ 0xF7B11905;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = (int)((long)((n2 ^ 0x9D798C24 ^ 0xCF45E9AD) + -817501779) ^ 0x8233374C87C6FCC9L ^ 0x8233374C87C6FCC9L);
                        }
                        n += 3;
                        continue block48;
                    }
                    n3 = (n2 ^ 0xDA7CD11E ^ 0xCF45E9AD) + -817501779;
                    int cfr_ignored_12 = (Integer.rotateLeft(0xB05BA8D1 ^ n2, 9) + 1601638538) * -1336170287;
                    int cfr_ignored_13 = (int)(0x72E906EC27D4EB4FL ^ (long)n2 ^ 0xF0A8831A2DB94803L);
                    n3 = (n2 ^ 0x6091C010 ^ 0xCF45E9AD) + -817501779 + -372390904 - -372390904;
                    continue block48;
                }
                case 508975498: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x2E169058 ^ n2, 8) + -1726408221) * 773230681;
                    this.thtw = false;
                    n3 = (n2 ^ 0x1F4C2F20 ^ 0xCF45E9AD) + -817501779 + 971381338 - 971381338;
                    int cfr_ignored_15 = (Integer.rotateRight(0xCDA779F ^ n2, 4) - -1831724164) * 215644063;
                    n -= 2;
                    continue block48;
                }
                case 525086496: {
                    int cfr_ignored_16 = Integer.rotateLeft(0x1BDEBE2D ^ n2, 6) - 1683400366;
                    int cfr_ignored_17 = (int)(0xD96C101027D4EB4FL ^ (long)n2 ^ 0xDD50831A2DB81F09L);
                    return;
                }
                case -989195262: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0x23A4CF3D ^ n2, 7) - 1431484318) * 598003517;
                    int cfr_ignored_19 = (int)(0xE116610027D4EB4FL ^ (long)n2 ^ 0x3F70831A2DB86FFDL);
                    if (yf.khdha_2()) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x88A1FCD0 ^ 0xCF45E9AD) + -817501779));
                        int cfr_ignored_20 = (Integer.rotateRight(0x1B91DAFE ^ n2, 6) - 1527194621) * 462543615;
                        n3 = (n2 ^ 0xA334E21C ^ 0xCF45E9AD) + -817501779 ^ 0x8EFB8E73 ^ 0x8EFB8E73;
                        n -= 3;
                        continue block48;
                    }
                    try {
                        n -= 2;
                        n3 = (n2 ^ 0xA92C45F3 ^ 0xCF45E9AD) + -817501779;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0xA92C45F3 ^ 0xCF45E9AD) + -817501779;
                    }
                    ++n;
                    continue block48;
                }
                case -1456716301: {
                    int cfr_ignored_21 = (Integer.rotateRight(0xFB5BBD32 ^ n2, 18) + 1954121801) * -77873869;
                    yf.athz_2();
                    try {
                        ++n;
                        if ((0x1C9205FF6511A0A7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)((n2 ^ 0xA334E21C ^ 0xCF45E9AD) + -817501779) ^ 0xFE29B2976BEED450L ^ 0xFE29B2976BEED450L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA334E21C ^ 0xCF45E9AD) + -817501779));
                    }
                    n += 2;
                    continue block48;
                }
                case 1311989278: {
                    int cfr_ignored_22 = Integer.rotateLeft(0x772198A4 ^ n2, 17) - 1903106839;
                    if (this.shyk == 1.0f) {
                        n3 = (n2 ^ 0x1E56598A ^ 0xCF45E9AD) + -817501779;
                        n += 4;
                        continue block48;
                    }
                    try {
                        n += 3;
                        if ((0xC7A85E78616E3F13L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (n2 ^ 0xA0C04198 ^ 0xCF45E9AD) + -817501779 ^ 0x7417C0EE ^ 0x7417C0EE;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0xA0C04198 ^ 0xCF45E9AD) + -817501779 + 293463078 - 293463078;
                    }
                    continue block48;
                }
                case 1692933961: {
                    int cfr_ignored_23 = (Integer.rotateLeft(0x2CEB79F4 ^ n2, 8) - 1960928199) * 753629685;
                    n3 = (int)((long)((n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779) ^ 0xDDB03983CBD1AA39L ^ 0xDDB03983CBD1AA39L);
                    int cfr_ignored_24 = (Integer.rotateRight(0x937B289F ^ n2, 5) - -532182404) * -1820645217;
                    n += 2;
                    continue block48;
                }
                case -345796416: {
                    int cfr_ignored_25 = (Integer.rotateLeft(0x8160EC31 ^ n2, 3) + -1357235926) * -2124354511;
                    int cfr_ignored_26 = (int)(0x43D2420C27D4EB4FL ^ (long)n2 ^ 0x7968831A2DB92A75L);
                    n3 = (n2 ^ 0xE55AFE2F ^ 0xCF45E9AD) + -817501779;
                    int cfr_ignored_27 = (Integer.rotateRight(0x4A0765BF ^ n2, 12) - -79498916) * 1241998783;
                    n3 = (n2 ^ 0x31AE80 ^ 0xCF45E9AD) + -817501779 + -718005930 - -718005930;
                    int cfr_ignored_28 = (Integer.rotateLeft(0x8568A131 ^ n2, 3) + 738796586) * -2056740559;
                    int cfr_ignored_29 = (int)(0x47DA0F0C27D4EB4FL ^ (long)n2 ^ 0xE368831A2DB92265L);
                    n3 = (int)((long)((n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779) ^ 0xBA6BCBFFAE0A81F7L ^ 0xBA6BCBFFAE0A81F7L);
                    --n;
                    continue block48;
                }
                case -97262218: {
                    int cfr_ignored_30 = (Integer.rotateLeft(0x735B10F4 ^ n2, 17) - -60511033) * 1935347957;
                    n3 = (n2 ^ 0x92362595 ^ 0xCF45E9AD) + -817501779;
                    int cfr_ignored_31 = (Integer.rotateLeft(0xA9DB4B1C ^ n2, 8) - -1779714145) * -1445246179;
                    n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779;
                    n -= 3;
                    continue block48;
                }
                case 881146445: {
                    int cfr_ignored_32 = (Integer.rotateLeft(0xBF7A57B8 ^ n2, 10) + 875445891) * -1082501191;
                    n3 = (n2 ^ 0x31897894 ^ 0xCF45E9AD) + -817501779 ^ 0x5F9DF4CE ^ 0x5F9DF4CE;
                    int cfr_ignored_33 = (Integer.rotateLeft(0x58A60450 ^ n2, 14) + -1065868053) * 1487275089;
                    try {
                        n -= 4;
                        n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 + -1288558557 - -1288558557;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 ^ 0xC9C3E525 ^ 0xC9C3E525;
                    }
                    continue block48;
                }
                case -848919085: {
                    int cfr_ignored_34 = Integer.rotateLeft(0xFAE76EA1 ^ n2, 18) + 1717830842;
                    int cfr_ignored_35 = (int)(0x3855C09C27D4EB4FL ^ (long)n2 ^ 0x7C48831A2DB9DD7AL);
                    n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 ^ 0x6BB05C59 ^ 0x6BB05C59;
                    continue block48;
                }
                case 1050147730: {
                    int cfr_ignored_36 = (Integer.rotateRight(0x82FC7BD2 ^ n2, 3) + -521101911) * -2097382445;
                    int cfr_ignored_37 = (int)(0xFA69E596648BD596L ^ (long)n2 ^ 0x365C05A4500A5902L);
                    n3 = (n2 ^ 0x6446981A ^ 0xCF45E9AD) + -817501779 + 780034450 - 780034450;
                    int cfr_ignored_38 = (int)(0xBA20DCAD9CFADEBDL ^ (long)n2 ^ 0x442BF546465CD990L);
                    n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 + -566192902 - -566192902;
                    n += 4;
                    continue block48;
                }
                case -562718540: {
                    int cfr_ignored_39 = (Integer.rotateRight(0xA4528CBE ^ n2, 7) - -363025859) * -1538093889;
                    try {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 ^ 0x8CBC07E0 ^ 0x8CBC07E0;
                    }
                    --n;
                    continue block48;
                }
                case -1017370081: {
                    int cfr_ignored_40 = Integer.rotateRight(0x40689F2E ^ n2, 11) - -787946035;
                    n3 = (n2 ^ 0x2BAF7745 ^ 0xCF45E9AD) + -817501779;
                    int cfr_ignored_41 = Integer.rotateLeft(0xB88105A5 ^ n2, 10) - 1543327286;
                    int cfr_ignored_42 = (int)(0x7A33AB9827D4EB4FL ^ (long)n2 ^ 0xAA40831A2DB959B6L);
                    int cfr_ignored_43 = (int)(0xC678D593E2E344C9L ^ (long)n2 ^ 0x5657097572B42120L);
                    n3 = (n2 ^ 0xF39BCEC0 ^ 0xCF45E9AD) + -817501779 ^ 0xD8825E55 ^ 0xD8825E55;
                    int cfr_ignored_44 = (int)(0xBB57203B4ECEF80FL ^ (long)n2 ^ 0xBD06512E0B38DB7FL);
                    n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779;
                    n += 3;
                    continue block48;
                }
                case -506981992: {
                    int cfr_ignored_45 = Integer.rotateLeft(0x5F12FB80 ^ n2, 14) + -2018896965;
                    int cfr_ignored_46 = (int)(0x1D89950B68A513C8L ^ (long)n2 ^ 0xD7661DF9DCB796C2L);
                    n3 = (n2 ^ 0xCADFE95A ^ 0xCF45E9AD) + -817501779 + 1270703884 - 1270703884;
                    int cfr_ignored_47 = (int)(0x56BB74B8ACE24551L ^ (long)n2 ^ 0x14019577718500A7L);
                    n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 ^ 0xAEE3C1AE ^ 0xAEE3C1AE;
                    continue block48;
                }
                case 1362369103: {
                    int cfr_ignored_48 = (Integer.rotateRight(0xECAF2413 ^ n2, 16) + -1382875768) * -324066285;
                    try {
                        n -= 4;
                        if ((0xDB84FE4F1D1FE89BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779;
                    }
                    n += 5;
                    continue block48;
                }
                case 504938776: {
                    int cfr_ignored_49 = Integer.rotateLeft(0xB4DDA7A8 ^ n2, 9) + -348853101;
                    n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 ^ 0x91898C00 ^ 0x91898C00;
                    int cfr_ignored_50 = (Integer.rotateLeft(0x10854B10 ^ n2, 5) + 75609643) * 277170961;
                    continue block48;
                }
                case 1628045216: {
                    int cfr_ignored_51 = (Integer.rotateLeft(0xB4CE74FC ^ n2, 9) - -379729473) * -1261538051;
                    try {
                        ++n;
                        if ((0xB573DB11E61BA305L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 + -1766790208 - -1766790208;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779));
                    }
                    continue block48;
                }
                case 673776178: {
                    int cfr_ignored_52 = Integer.rotateLeft(0x44E072C9 ^ n2, 11) + 1535870354;
                    int cfr_ignored_53 = (int)(0x8652DCF427D4EB4FL ^ (long)n2 ^ 0x4498831A2DB8A174L);
                    n3 = (int)((long)((n2 ^ 0xEF92FC2A ^ 0xCF45E9AD) + -817501779) ^ 0x6F9E262BFB16E033L ^ 0x6F9E262BFB16E033L);
                    int cfr_ignored_54 = (Integer.rotateLeft(0x611D05D0 ^ n2, 15) + -958311573) * 1629291985;
                    n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 + 1428897013 - 1428897013;
                    int cfr_ignored_55 = (Integer.rotateRight(0x321E91F7 ^ n2, 9) - 370232356) * 840864247;
                    ++n;
                    continue block48;
                }
            }
            int cfr_ignored_56 = Integer.rotateLeft(0x2B7A4000 ^ n2, 8) + 1210801979;
            n3 = (n2 ^ 0xC50A1402 ^ 0xCF45E9AD) + -817501779 + -790481793 - -790481793;
        }
    }

    @Generated
    public long rjw() {
        block0: {
            int n = ss_3.ths_10(957165940);
            int n2 = n ^ 0x3D855BE3;
            if ((n2 ^ n) == 1032149987) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4886A97 ^ n, 3) - -1864202364) * 76049047;
        }
        return this.dkj;
    }

    @Generated
    public float swd() {
        block0: {
            int n = -282989363;
            n = Integer.rotateLeft(n * 1990706343, 12) ^ 0xB0ED4AD5;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
            int n2 = n ^ 0xC29990B4;
            if ((n2 ^ n) == -1030123340) break block0;
            int cfr_ignored_0 = (0x2DB87C79 ^ n) + -989672702;
        }
        return this.shyk;
    }

    @Generated
    public btf_2 smy_2() {
        block0: {
            int n = -1174009778;
            int n2 = (n = Integer.rotateLeft(n * 1802251239, 18) ^ 0x9AEEEBBB) ^ 0x80777962;
            if ((n2 ^ n) == -2139653790) break block0;
            int cfr_ignored_0 = (0x3A71712C ^ n) + -2147345316;
        }
        return this.dhkk;
    }

    @Generated
    public long thas() {
        block0: {
            int n = 139211369;
            n = Integer.rotateLeft(n * 248011505, 21) ^ 0x40BAE482;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8ECA6AD;
            if ((n2 ^ n) == 149726893) break block0;
            int cfr_ignored_0 = (0xA094C4 ^ n) - 660330186;
        }
        return this.dhght;
    }

    @Generated
    public float jdy() {
        block0: {
            int n = -1345236706;
            int n2 = (n = Integer.rotateLeft(n * 1691437613, 5) ^ 0x2EE125D0) ^ 0xE8505232;
            if ((n2 ^ n) == -397389262) break block0;
            int cfr_ignored_0 = (0x4781032C ^ n) - -1162128409;
        }
        return this.zjs_2;
    }

    @Generated
    public float jshdh() {
        return this.stw_2;
    }

    @Generated
    public boolean dym() {
        block0: {
            int n = ss_3.ths_10(-119771842);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0xDA6268FE;
            if ((n2 ^ n) == -631084802) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x22BE05C0 ^ n, 7) + 962613627;
        }
        return this.rhs_2;
    }

    @Generated
    public boolean dhjd() {
        return this.thtw;
    }

    @Generated
    public void zaz_5(long l) {
        int n = 1251423374;
        n = Integer.rotateLeft(n * -692571893, 7) ^ 0x8E4EC1B0;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 2);
        int n2 = (n = (int)l ^ n) ^ 0x245F5355;
        if ((n2 ^ n) != 610227029) {
            int cfr_ignored_0 = (0x6EC867DB ^ n) + -1048637860;
        }
        this.dkj = l;
    }

    @Generated
    public void zzb_4(btf_2 btf2) {
        int n = 623810547;
        n = Integer.rotateLeft(n * 1670734743, 12) ^ 0xE1D8DDBC;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB044B009;
        if ((n2 ^ n) != -1337675767) {
            int cfr_ignored_0 = (0x956A27FA ^ n) - -494278768;
        }
        this.dhkk = btf2;
    }

    @Generated
    public void zht_7(long l) {
        int n = ss_3.ths_10(-1937584222);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
        int n2 = (n = (int)l ^ n) ^ 0xAE39BE66;
        if ((n2 ^ n) != -1371947418) {
            int cfr_ignored_0 = Integer.rotateLeft(0x22BB71C4 ^ n, 7) - 957375991;
        }
        this.dhght = l;
    }

    @Generated
    public void zykh(float f) {
        int n = 441568304;
        n = Integer.rotateLeft(n * -174347001, 25) ^ 0x3FF9999F;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0xC550FFA6;
        if ((n2 ^ n) != -984547418) {
            int cfr_ignored_0 = (0xDF013396 ^ n) - -1107106700;
        }
        this.zjs_2 = f;
    }

    @Generated
    public void ghshd(float f) {
        int n = 280862101;
        n = Integer.rotateLeft(n * 2011240303, 19) ^ 0x972EF4B9;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB7499062;
        if ((n2 ^ n) != -1219915678) {
            int cfr_ignored_0 = (0xA7F40DF7 ^ n) + -1455267079;
        }
        this.stw_2 = f;
    }

    @Generated
    public void hghz_2(boolean bl) {
        int n = -1435125163;
        n = Integer.rotateLeft(n * -1478108137, 20) ^ 0x3B01FFDC;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
        int n2 = (n = bl ^ n) ^ 0xAA065521;
        if ((n2 ^ n) != -1442425567) {
            int cfr_ignored_0 = (0x73EF74 ^ n) + -1676539249;
        }
        this.rhs_2 = bl;
    }

    @Generated
    public void dhwy(boolean bl) {
        this.thtw = bl;
    }

    private static String[] x0pqemdwxf0u(String string) {
        return string.split("\u0007\u0010", -1);
    }

    private static CallSite c7669xo5zagq16(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ b44jjvodo ^ string.hashCode()) + (n2 + o0gn5ozbz1p) + i ^ b44jjvodo, 15) + o0gn5ozbz1p);
            }
            String[] stringArray = tdq.x0pqemdwxf0u(new String(cArray));
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

