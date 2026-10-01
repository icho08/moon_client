/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_239
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_2960
 *  net.minecraft.class_3298
 *  net.minecraft.class_3966
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_239;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_2960;
import net.minecraft.class_3298;
import net.minecraft.class_3966;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bghq;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.mz_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="KillSound", category=bzw.OTHER, desc="Plays sounds on kill")
public class tth
extends bnq {
    private static final long sdn_2 = 12000L;
    private static final long bdm = 2500L;
    private static final long dhha = 300L;
    private static final String[] shaa_3;
    private final tay thnth = new tay(this, "Volume").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(1036715454 + 97188418)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0x7D695585 ^ 0x3FA15585));
    private final Random ghy = new Random();
    private final Map khzd_2 = new HashMap();
    private class_1309 dhrkh;
    private long rshd_2;
    private Clip shnn;
    private long snw;
    private final bql<bthy> tdhsh = this::dzd_6;
    private final bql<bghq> zthdh = this::rrl;
    private final bql<bksh> tzh_2 = this::thkhs_2;
    private final bql<btt> hshw = this::khkh;
    private static final int thzs_2 = 970175059;
    private static final int bnth = 1181382343;
    private static final int dhr_2 = -1425759168;
    private static final int jbw = -1900558075;
    private static final int cuxstt664 = -1338640167;
    private static final int sds38wsbsh = -1802920659;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dp11l89uof75;

    @Override
    public void nc() {
        int n = mz_2.thzt_3(-1106575821);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x51C80B36;
        if ((n2 ^ n) != 1372064566) {
            int cfr_ignored_0 = Integer.rotateLeft(0xEFC2F505 ^ n, 16) - 217664214;
            int cfr_ignored_1 = (int)(0x2D705B3827D4EB4FL ^ (long)n ^ 0x4B00831A2DB9F731L);
        }
        this.ghthdh();
        this.khzd_2.clear();
        this.dhrkh = null;
    }

    private void tst_6(class_1297 class_12972, long l) {
        class_1309 class_13092;
        try {
            int n = 275704267;
            n = Integer.rotateLeft(n * 1668949711, 25) ^ 0xDC14E7C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC78164F2;
            if ((n2 ^ n) != -947821326) {
                int cfr_ignored_0 = (0xD7EF8D39 ^ n) - 641069679;
            }
            if ((0x1DD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (tth.mc.field_1724 == null || !(class_12972 instanceof class_1309) || (class_13092 = (class_1309)class_12972) == tth.mc.field_1724 || !(class_13092 instanceof class_1657)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        this.khzd_2.put(class_13092.method_5628(), l2);
        this.dhrkh = class_13092;
        this.rshd_2 = l2 - ((0x9B910A95F408215CL ^ 0x9B910A95F4080FBCL) - l);
    }

    private boolean ghkhd_2(class_1309 class_13092, class_1297 class_12972) {
        int n = -1474784792;
        n = Integer.rotateLeft(n * 830388143, 24) ^ 0x6B0AE38C;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x2053F7B8;
        if ((n2 ^ n) != 542373816) {
            int cfr_ignored_0 = (0x884B6650 ^ n) + -777713185;
        }
        if (tth.mc.field_1724 == null || class_13092 == null || class_13092 == tth.mc.field_1724 || !(class_13092 instanceof class_1657)) {
            return false;
        }
        long l = System.currentTimeMillis();
        Long l2 = (Long)this.khzd_2.get(tth.dnz(class_13092));
        if (l2 != null && l - l2 <= (0x3330B7BDCAAAB795L ^ 0x3330B7BDCAAA9975L)) {
            return true;
        }
        if (this.dhrkh != null && this.dhrkh.method_5628() == tth.tkr(class_13092) && l - this.rshd_2 <= (0xB7B1704890E3FF05L ^ 0xB7B1704890E3D1E5L)) {
            return true;
        }
        if (class_12972 == tth.mc.field_1724 || tth.dkhsh(class_13092) == tth.mc.field_1724) {
            return true;
        }
        class_1309 class_13094 = bjd.shfn();
        return class_13094 != null && class_13094.method_5628() == class_13092.method_5628() && tth.mc.field_1724.method_5739((class_1297)class_13092) < Float.intBitsToFloat(696435887 + 398277457);
    }

    private void dlz(class_1309 class_13092) {
        int n = 0;
        int n2 = 1767607732;
        n2 = Integer.rotateLeft(n2 * 1102460017, 5) ^ 0xA2D85572;
        n2 = System.identityHashCode(this) ^ n2;
        class_1309 class_13093 = class_13092;
        n2 = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n2, 9);
        int n3 = (1936865953 * 54336697 + -1596919418 ^ n2) + 600623747 - 600623747;
        block35: while (true) {
            switch (((n3 ^ n2) - -1596919418) * 725756297) {
                case 1237191155: {
                    int cfr_ignored_0 = Integer.rotateRight(0x8DA32466 ^ n2, 4) - 723453845;
                    this.khzd_2.remove(class_13092.method_5628());
                    if (this.dhrkh == null) {
                        int cfr_ignored_1 = (int)(0x7609049B425D97B4L ^ (long)n2 ^ 0xF4464808D44F41C3L);
                        n3 = (1482125891 * 54336697 + -1596919418 ^ n2) + 1750649612 - 1750649612;
                        n -= 2;
                        continue block35;
                    }
                    n3 = 823242671 * 54336697 + -1596919418 ^ n2;
                    int cfr_ignored_2 = (Integer.rotateRight(0x408654B6 ^ n2, 11) - -727588539) * 1082545335;
                    n -= 4;
                    continue block35;
                }
                case 2050963706: {
                    int cfr_ignored_3 = Integer.rotateRight(0x24DFD142 ^ n2, 7) + 2071459385;
                    this.dhrkh = null;
                    int cfr_ignored_4 = (int)(0xEE1B2D08C9925D59L ^ (long)n2 ^ 0xA7615F97419471E7L);
                    n3 = 755787787 * 54336697 + -1596919418 ^ n2 ^ 0x8C7BA33A ^ 0x8C7BA33A;
                    int cfr_ignored_5 = (int)(0xF89B646CAB62A1A3L ^ (long)n2 ^ 0x35A99A76B8605CE7L);
                    n3 = (int)((long)(1482125891 * 54336697 + -1596919418 ^ n2) ^ 0xFB762449BB04B488L ^ 0xFB762449BB04B488L);
                    n += 4;
                    continue block35;
                }
                case 1482125891: {
                    int cfr_ignored_6 = Integer.rotateRight(0x716C592E ^ n2, 17) - -1065587763;
                    return;
                }
                case 1936865953: {
                    int cfr_ignored_7 = Integer.rotateRight(0x5FF7E36B ^ n2, 14) + -1553848016;
                    if (class_13092 != null) {
                        int cfr_ignored_8 = (int)(0xC3237338B26F9AE6L ^ (long)n2 ^ 0x1B01A86CCEEA2B97L);
                        n3 = (1485825625 * 54336697 + -1596919418 ^ n2) + 2103768895 - 2103768895;
                        int cfr_ignored_9 = (int)(0xB6AF8C1E272C4514L ^ (long)n2 ^ 0xE54C82EB710EC08EL);
                        n3 = Integer.reverse(Integer.reverse(1237191155 * 54336697 + -1596919418 ^ n2));
                        n += 2;
                        continue block35;
                    }
                    n3 = Integer.reverse(Integer.reverse(-1966758667 * 54336697 + -1596919418 ^ n2));
                    int cfr_ignored_10 = Integer.rotateRight(0xF7088903 ^ n2, 17) + -295291240;
                    n3 = (1482125891 * 54336697 + -1596919418 ^ n2) + -110439911 - -110439911;
                    n -= 2;
                    continue block35;
                }
                case 823242671: {
                    int cfr_ignored_11 = Integer.rotateLeft(0xE27522D ^ n2, 4) - -1155493202;
                    int cfr_ignored_12 = (int)(0xCC95FC1027D4EB4FL ^ (long)n2 ^ 0x550831A2DB834FAL);
                    if (this.dhrkh.method_5628() == tth.jwsh(class_13092)) {
                        try {
                            n -= 3;
                            if ((0x7D6098FBAB279B35L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = 2050963706 * 54336697 + -1596919418 ^ n2 ^ 0x4DED874C ^ 0x4DED874C;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = 2050963706 * 54336697 + -1596919418 ^ n2;
                        }
                        n -= 5;
                        continue block35;
                    }
                    try {
                        if ((0x4A2CC72DAA8D3631L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = 1482125891 * 54336697 + -1596919418 ^ n2;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = 1482125891 * 54336697 + -1596919418 ^ n2 ^ 0x6A9384E2 ^ 0x6A9384E2;
                    }
                    --n;
                    continue block35;
                }
                case -372095778: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x5474C290 ^ n2, 13) + 1048653483) * 1416938129;
                    try {
                        --n;
                        if ((0xDAE8A4ECB22F3E8DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = 1936865953 * 54336697 + -1596919418 ^ n2;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = 1936865953 * 54336697 + -1596919418 ^ n2;
                    }
                    continue block35;
                }
                case 496517179: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x1A0BFB11 ^ n2, 6) + 735118922) * 436992785;
                    int cfr_ignored_15 = (int)(0xD8B9552C27D4EB4FL ^ (long)n2 ^ 0x5728831A2DB81CA3L);
                    n3 = -895802011 * 54336697 + -1596919418 ^ n2;
                    int cfr_ignored_16 = Integer.rotateRight(0x99FF0FC3 ^ n2, 6) + -1438611496;
                    n3 = (int)((long)(1936865953 * 54336697 + -1596919418 ^ n2) ^ 0x1BA2E34076DFC1F6L ^ 0x1BA2E34076DFC1F6L);
                    int cfr_ignored_17 = Integer.rotateRight(0x4331A92F ^ n2, 11) - 660675564;
                    n -= 4;
                    continue block35;
                }
                case -1929973352: {
                    int cfr_ignored_18 = Integer.rotateLeft(0x92D75AA5 ^ n2, 5) - -864970442;
                    int cfr_ignored_19 = (int)(0x5065F49827D4EB4FL ^ (long)n2 ^ 0x1440831A2DB90D1AL);
                    n3 = 2029602996 * 54336697 + -1596919418 ^ n2 ^ 0x24346713 ^ 0x24346713;
                    int cfr_ignored_20 = (Integer.rotateRight(0xDEF5DDD7 ^ n2, 14) - 69434436) * -554312233;
                    int cfr_ignored_21 = (int)(0x4E57208DE22ECCB8L ^ (long)n2 ^ 0xBC6B08EE6257317FL);
                    n3 = -1366407614 * 54336697 + -1596919418 ^ n2 ^ 0xF6A70D7A ^ 0xF6A70D7A;
                    int cfr_ignored_22 = (int)(0x418B1A2D860034BFL ^ (long)n2 ^ 0xC92BC0B392592EC7L);
                    n3 = (1936865953 * 54336697 + -1596919418 ^ n2) + 1532851933 - 1532851933;
                    ++n;
                    continue block35;
                }
                case 622629923: {
                    int cfr_ignored_23 = Integer.rotateRight(0x897921E6 ^ n2, 4) - -1442268651;
                    n3 = 1936865953 * 54336697 + -1596919418 ^ n2 ^ 0x66D08054 ^ 0x66D08054;
                    int cfr_ignored_24 = Integer.rotateLeft(0x6CE2EE9 ^ n2, 3) + -682275470;
                    int cfr_ignored_25 = (int)(0xC47C80D427D4EB4FL ^ (long)n2 ^ 0xFCD8831A2DB82528L);
                    continue block35;
                }
                case 283829635: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0xE1573B9C ^ n2, 15) - 1307432735) * -514376803;
                    n3 = -1093066490 * 54336697 + -1596919418 ^ n2 ^ 0x45CE23A3 ^ 0x45CE23A3;
                    int cfr_ignored_27 = (Integer.rotateRight(0xB9D760B6 ^ n2, 10) - -2056104635) * -1177067337;
                    n3 = Integer.reverse(Integer.reverse(-2109209951 * 54336697 + -1596919418 ^ n2));
                    int cfr_ignored_28 = (Integer.rotateRight(0xE16395DB ^ n2, 15) + 1332528320) * -513567269;
                    n3 = Integer.reverse(Integer.reverse(1936865953 * 54336697 + -1596919418 ^ n2));
                    continue block35;
                }
                case -1002564344: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0xEF02C83D ^ n2, 16) - -172761442) * -285030339;
                    int cfr_ignored_30 = (int)(0x2DB0660027D4EB4FL ^ (long)n2 ^ 0x3170831A2DB9F6B1L);
                    try {
                        n3 = (int)((long)(1936865953 * 54336697 + -1596919418 ^ n2) ^ 0xA683C2A3AFE84969L ^ 0xA683C2A3AFE84969L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 1936865953 * 54336697 + -1596919418 ^ n2 ^ 0xE436CC10 ^ 0xE436CC10;
                    }
                    n += 2;
                    continue block35;
                }
                case -1590734714: {
                    int cfr_ignored_31 = Integer.rotateRight(0x5B75FACE ^ n2, 14) - 396820013;
                    n3 = (1954446910 * 54336697 + -1596919418 ^ n2) + -1133987787 - -1133987787;
                    int cfr_ignored_32 = (Integer.rotateRight(0x3986AC57 ^ n2, 10) - -72581692) * 965127255;
                    n3 = 1936865953 * 54336697 + -1596919418 ^ n2 ^ 0x411C2581 ^ 0x411C2581;
                    continue block35;
                }
                case -388092994: {
                    int cfr_ignored_33 = (Integer.rotateRight(0x970FF1B ^ n2, 4) + 688685952) * 158400283;
                    n3 = -252619220 * 54336697 + -1596919418 ^ n2 ^ 0x37F1EBCE ^ 0x37F1EBCE;
                    int cfr_ignored_34 = (Integer.rotateRight(0xE9A70152 ^ n2, 16) + 1335281705) * -374931117;
                    try {
                        if ((0x1398BA2A34349AE1L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (1936865953 * 54336697 + -1596919418 ^ n2) + 2069872533 - 2069872533;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (1936865953 * 54336697 + -1596919418 ^ n2) + 248695577 - 248695577;
                    }
                    n += 2;
                    continue block35;
                }
                case -2009201854: {
                    int cfr_ignored_35 = Integer.rotateLeft(0x6A6BF948 ^ n2, 16) + -412037389;
                    n3 = (-1233424896 * 54336697 + -1596919418 ^ n2) + -280758983 - -280758983;
                    int cfr_ignored_36 = Integer.rotateRight(0x9D25F263 ^ n2, 6) + 200669496;
                    try {
                        if ((0xDBD53317E5BB8FDDL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = 1936865953 * 54336697 + -1596919418 ^ n2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(1936865953 * 54336697 + -1596919418 ^ n2) ^ 0xB1E6B3E81FE381BEL ^ 0xB1E6B3E81FE381BEL);
                    }
                    n -= 2;
                    continue block35;
                }
                case -1608998946: {
                    int cfr_ignored_37 = Integer.rotateRight(0xF0358AF ^ n2, 4) - -708486036;
                    try {
                        --n;
                        if ((0xCF6DCEF00F21E339L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = 1936865953 * 54336697 + -1596919418 ^ n2;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(1936865953 * 54336697 + -1596919418 ^ n2));
                    }
                    n += 2;
                    continue block35;
                }
                case 1231835410: {
                    int cfr_ignored_38 = (Integer.rotateRight(0x7A4A615E ^ n2, 18) - -748721763) * 2051694943;
                    n3 = Integer.reverse(Integer.reverse(1823611320 * 54336697 + -1596919418 ^ n2));
                    int cfr_ignored_39 = (Integer.rotateLeft(0xC71EE671 ^ n2, 11) + 555452138) * -954276239;
                    int cfr_ignored_40 = (int)(0x5AC484C27D4EB4FL ^ (long)n2 ^ 0x6DE8831A2DB9A689L);
                    n3 = 1936865953 * 54336697 + -1596919418 ^ n2;
                    --n;
                    continue block35;
                }
                case 191795190: {
                    int cfr_ignored_41 = (Integer.rotateLeft(0xFDF2D858 ^ n2, 18) + -993668637) * -34416551;
                    n3 = 1646079198 * 54336697 + -1596919418 ^ n2;
                    int cfr_ignored_42 = (Integer.rotateRight(0x5BC4499A ^ n2, 14) + 555911393) * 1539590555;
                    try {
                        n += 5;
                        if ((0x29524C1160B90803L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = 1936865953 * 54336697 + -1596919418 ^ n2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(1936865953 * 54336697 + -1596919418 ^ n2) ^ 0x9892F21991BF13B4L ^ 0x9892F21991BF13B4L);
                    }
                    n += 4;
                    continue block35;
                }
            }
            int cfr_ignored_43 = Integer.rotateLeft(0x793B942D ^ n2, 18) - -1298886482;
            int cfr_ignored_44 = (int)(0xBB893A1027D4EB4FL ^ (long)n2 ^ 0x8950831A2DB8DAC3L);
            n3 = (int)((long)(1936865953 * 54336697 + -1596919418 ^ n2) ^ 0xD8DBBE631ADB65A1L ^ 0xD8DBBE631ADB65A1L);
        }
    }

    private void sm_2() {
        long l = 0L;
        int n = 0;
        int n2 = 845478363;
        n2 = Integer.rotateLeft(n2 * -978150473, 8) ^ 0x6D82061D;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 15);
        int n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10) ^ 0x9193221E ^ 0x9193221E;
        while (true) {
            block19: {
                block32: {
                    block28: {
                        block21: {
                            block18: {
                                block16: {
                                    block26: {
                                        block31: {
                                            block27: {
                                                block22: {
                                                    block24: {
                                                        block17: {
                                                            block23: {
                                                                block33: {
                                                                    block30: {
                                                                        block29: {
                                                                            block25: {
                                                                                block14: {
                                                                                    block20: {
                                                                                        block15: {
                                                                                            if ((n = Integer.rotateRight(n3, 10) ^ n2) > 343346026) break block14;
                                                                                            if (n > -1592874883) break block15;
                                                                                            if (n == -2052312073) break block16;
                                                                                            if (n == -1738884142) break block17;
                                                                                            if (n == -1592874883) break block18;
                                                                                            break block19;
                                                                                        }
                                                                                        if (n > -550767195) break block20;
                                                                                        if (n == -669686091) break block21;
                                                                                        if (n == -550767195) break block22;
                                                                                        break block19;
                                                                                    }
                                                                                    if (n == 225437331) break block23;
                                                                                    if (n == 343346026) break block24;
                                                                                    int cfr_ignored_0 = (Integer.rotateRight(0xB15B5FFE ^ n2, 9) - 2121154301) * -1319411713;
                                                                                    break block19;
                                                                                }
                                                                                if (n > 658851386) break block25;
                                                                                if (n == 366262848) break block26;
                                                                                if (n == 640042967) break block27;
                                                                                int cfr_ignored_1 = (Integer.rotateRight(0xC260543A ^ n2, 11) + -1912090047) * -1033874373;
                                                                                if (n == 658851386) break block28;
                                                                                break block19;
                                                                            }
                                                                            if (n > 1539138168) break block29;
                                                                            if (n == 704385755) break block30;
                                                                            if (n == 1539138168) break block31;
                                                                            break block19;
                                                                        }
                                                                        if (n == 1547063741) break block32;
                                                                        if (n == 1796832352) break block33;
                                                                        break block19;
                                                                    }
                                                                    int cfr_ignored_2 = (Integer.rotateLeft(0x26B5C4F4 ^ n2, 7) - -1268746041) * 649446645;
                                                                    this.snw = l;
                                                                    this.ghthdh();
                                                                    tth.zaa_5(this, shaa_3[this.ghy.nextInt(shaa_3.length)]);
                                                                    return;
                                                                }
                                                                int cfr_ignored_3 = (Integer.rotateRight(0x88E9695B ^ n2, 4) + -1734254272) * -1997969061;
                                                                return;
                                                            }
                                                            int cfr_ignored_4 = Integer.rotateRight(0x7353B83 ^ n2, 3) + -472919016;
                                                            l = System.currentTimeMillis();
                                                            if (l - this.snw < (0xF3928ACCAD6A0DDCL ^ 0xF3928ACCAD6A0CF0L)) {
                                                                int cfr_ignored_5 = (int)(0xD7F98582CF5DD02AL ^ (long)n2 ^ 0xF67552085B720222L);
                                                                n3 = Integer.rotateLeft(n2 ^ 0x6B197C60, 10) ^ 0x5E3A8175 ^ 0x5E3A8175;
                                                                n -= 3;
                                                                continue;
                                                            }
                                                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x29FC12DB, 10) ^ 0x75156D20812D4B38L ^ 0x75156D20812D4B38L);
                                                            int cfr_ignored_6 = (Integer.rotateRight(0xD6379B9E ^ n2, 13) - -182880419) * -700998753;
                                                            continue;
                                                        }
                                                        int cfr_ignored_7 = (Integer.rotateRight(0xD515F01F ^ n2, 13) - -771378436) * -719982561;
                                                        int cfr_ignored_8 = (int)(0x92F07502D3EE069FL ^ (long)n2 ^ 0x17756B6FF6188831L);
                                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xC3E09CD9, 10) ^ 0x36BC413A5593080EL ^ 0x36BC413A5593080EL);
                                                        int cfr_ignored_9 = (int)(0xE18B5DF8C99775FFL ^ (long)n2 ^ 0x46815F9D10D86EC7L);
                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD6FE693, 10)));
                                                        ++n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_10 = Integer.rotateLeft(0x490AAC81 ^ n2, 12) + -592936230;
                                                    int cfr_ignored_11 = (int)(0x8BB802BC27D4EB4FL ^ (long)n2 ^ 0xF808831A2DB8BAA1L);
                                                    n3 = Integer.rotateLeft(n2 ^ 0x38B5C2BD, 10) + 2064985141 - 2064985141;
                                                    int cfr_ignored_12 = (Integer.rotateLeft(0x5AE59599 ^ n2, 14) + 103464130) * 1524995481;
                                                    int cfr_ignored_13 = (int)(0x98573BA427D4EB4FL ^ (long)n2 ^ 0x8A38831A2DB89D7FL);
                                                    n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10);
                                                    n += 2;
                                                    continue;
                                                }
                                                int cfr_ignored_14 = Integer.rotateLeft(0x170F2FCC ^ n2, 5) - -818648849;
                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA86D5D00, 10)));
                                                int cfr_ignored_15 = (Integer.rotateLeft(0x28515C30 ^ n2, 8) + -432551669) * 676420657;
                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD6FE693, 10)));
                                                int cfr_ignored_16 = Integer.rotateLeft(0x6AB33961 ^ n2, 16) + -267283974;
                                                int cfr_ignored_17 = (int)(0xA801975C27D4EB4FL ^ (long)n2 ^ 0xD3C8831A2DB8FDD2L);
                                                --n;
                                                continue;
                                            }
                                            int cfr_ignored_18 = (Integer.rotateRight(0x5C6B5D77 ^ n2, 14) - 895348900) * 1550540151;
                                            n3 = Integer.rotateLeft(n2 ^ 0x8E3175E9, 10) ^ 0x83B416C4 ^ 0x83B416C4;
                                            int cfr_ignored_19 = Integer.rotateRight(0x2F2556A2 ^ n2, 8) + -1176298279;
                                            try {
                                                n -= 3;
                                                if ((0xD7BCAFF328C6F865L ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10);
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xD6FE693, 10) ^ 0x8376226F62912664L ^ 0x8376226F62912664L);
                                            }
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_20 = (Integer.rotateLeft(0x246D81D5 ^ n2, 7) - 1839224838) * 611156437;
                                        int cfr_ignored_21 = (int)(0xE6DF2FE827D4EB4FL ^ (long)n2 ^ 0xA2A0831A2DB8606FL);
                                        try {
                                            n += 5;
                                            if ((0x3E7509CA5490F1CDL ^ (long)n2 | 1L) == 0L) {
                                                throw new IllegalStateException();
                                            }
                                            n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10) + -88102245 - -88102245;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10) ^ 0x369F4130 ^ 0x369F4130;
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_22 = (Integer.rotateLeft(0xC596FA35 ^ n2, 11) - -240784474) * -979961291;
                                    int cfr_ignored_23 = (int)(0x724540827D4EB4FL ^ (long)n2 ^ 0x5560831A2DB9A399L);
                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x2FEA9527, 10) ^ 0xD37A197E4FB8A116L ^ 0xD37A197E4FB8A116L);
                                    int cfr_ignored_24 = (Integer.rotateRight(0x6F544613 ^ n2, 16) + 2140281736) * 1867793939;
                                    try {
                                        n -= 2;
                                        if ((0x3CADB0CF73A682B3L ^ (long)n2 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10) ^ 0xF2050803 ^ 0xF2050803;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10) ^ 0xA5B381CE ^ 0xA5B381CE;
                                    }
                                    n += 5;
                                    continue;
                                }
                                int cfr_ignored_25 = Integer.rotateRight(0x1CABE66B ^ n2, 6) + 2100201008;
                                n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10) + -285075740 - -285075740;
                                n += 4;
                                continue;
                            }
                            int cfr_ignored_26 = (Integer.rotateRight(0xB8F2E63A ^ n2, 10) + 1774682177) * -1192040901;
                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA43133ED, 10)));
                            int cfr_ignored_27 = (Integer.rotateRight(0x3843743E ^ n2, 10) - -729238851) * 943944767;
                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD6FE693, 10)));
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_28 = (Integer.rotateLeft(0x72EE1515 ^ n2, 17) - -281924410) * 1928205589;
                        int cfr_ignored_29 = (int)(0xB05CBB2827D4EB4FL ^ (long)n2 ^ 0x8B20831A2DB8CD68L);
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x13C2F5DC, 10) ^ 0xC04BB95D872933CFL ^ 0xC04BB95D872933CFL);
                        int cfr_ignored_30 = (Integer.rotateRight(0xFDC76B2 ^ n2, 4) + -267387191) * 266106547;
                        try {
                            --n;
                            if ((0x5C300128252FD27BL ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10);
                        }
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_31 = (Integer.rotateRight(0xFADED776 ^ n2, 18) - 1700378245) * -86059145;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5BC215E6, 10) ^ 0x880055212F897F69L ^ 0x880055212F897F69L);
                    int cfr_ignored_32 = (Integer.rotateRight(0x3DD7B95F ^ n2, 10) - -2122509892) * 1037547871;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x5128EBA5, 10)));
                    int cfr_ignored_33 = (Integer.rotateRight(0xCF2E8F32 ^ n2, 12) + 453047881) * -819032269;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD6FE693, 10)));
                    n -= 5;
                    continue;
                }
                int cfr_ignored_34 = Integer.rotateRight(0x1ECFEE82 ^ n2, 6) + -1081376519;
                n3 = Integer.rotateLeft(n2 ^ 0xF17F5147, 10);
                int cfr_ignored_35 = (Integer.rotateLeft(0xF4DBE2BD ^ n2, 17) - -1426189282) * -186916163;
                int cfr_ignored_36 = (int)(0x36694C8027D4EB4FL ^ (long)n2 ^ 0x6470831A2DB9C103L);
                n3 = Integer.rotateLeft(n2 ^ 0x59A77F0E, 10);
                int cfr_ignored_37 = Integer.rotateLeft(0x21DA5EC9 ^ n2, 7) + 500111762;
                int cfr_ignored_38 = (int)(0xE368F0F427D4EB4FL ^ (long)n2 ^ 0x1C98831A2DB86B00L);
                n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10);
                n -= 2;
                continue;
            }
            int cfr_ignored_39 = (Integer.rotateRight(0xEDF3F6D6 ^ n2, 16) - -722959579) * -302778665;
            n3 = Integer.rotateLeft(n2 ^ 0xD6FE693, 10) + -1557115676 - -1557115676;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void skd(String var1_1) {
        var4_2 = 0;
        var2_3 = 779194463;
        var2_3 = Integer.rotateLeft(var2_3 * -2101977383, 21) ^ 468491204;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 8);
        v0 = var1_1;
        var2_3 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3;
        var3_4 = Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) + 1127612906 - 1127612906;
        block19: while (true) {
            block25: {
                block24: {
                    if ((var4_2 = Integer.reverse(var3_4) ^ var2_3 ^ -2056021820) == 1302076791) break block24;
                    if (var4_2 == -1095903079) ** GOTO lbl125
                    if (var4_2 == 1074228640) ** GOTO lbl26
                    break block25;
                }
                Integer.rotateRight(419735115 ^ var2_3, 6) + 200131152;
                tth.mc.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, bzt_2(java.lang.String ), ()V)((tth)this, (String)var1_1));
                return;
            }
            switch (var4_2) {
                case -1774403863: {
                    (Integer.rotateLeft(-1810709995 ^ var2_3, 5) - -224190522) * -1810709995;
                    (int)(6242108003258264399L ^ (long)var2_3 ^ 2675282327117562001L);
                    return;
                }
lbl26:
                // 1 sources

                Integer.rotateLeft(-58184632 ^ var2_3, 18) + -1730479117;
                if (tth.mc != null) {
                    try {
                        var4_2 += 5;
                        if ((-7451640173263217041L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 1302076791 ^ -2056021820)));
                    }
                    catch (ArithmeticException v1) {
                        var3_4 = Integer.reverse(var2_3 ^ 1302076791 ^ -2056021820) + -145539103 - -145539103;
                    }
                    var4_2 -= 3;
                    continue block19;
                }
                try {
                    var4_2 += 2;
                    if ((-1435514693891696079L ^ (long)var2_3 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    var3_4 = Integer.reverse(var2_3 ^ -1774403863 ^ -2056021820);
                }
                catch (IllegalArgumentException v2) {
                    var3_4 = Integer.reverse(var2_3 ^ -1774403863 ^ -2056021820) + -1037907876 - -1037907876;
                }
                continue block19;
                case 1377139471: {
                    Integer.rotateRight(796771043 ^ var2_3, 8) + -996656968;
                    var3_4 = Integer.reverse(var2_3 ^ -849406051 ^ -2056021820) ^ -928398404 ^ -928398404;
                    Integer.rotateLeft(-437393811 ^ var2_3, 15) - -601061778;
                    (int)(2837065799369550671L ^ (long)var2_3 ^ 7912968693749506927L);
                    var3_4 = Integer.reverse(var2_3 ^ -694159297 ^ -2056021820);
                    (Integer.rotateRight(2070798547 ^ var2_3, 18) + -156510008) * 2070798547;
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) ^ 8917785068100201932L ^ 8917785068100201932L);
                    var4_2 -= 3;
                    continue block19;
                }
                case 792213050: {
                    Integer.rotateRight(-387654865 ^ var2_3, 16) - 940845548;
                    var3_4 = Integer.reverse(var2_3 ^ -1015043161 ^ -2056021820) ^ -1099800702 ^ -1099800702;
                    Integer.rotateRight(1232151751 ^ var2_3, 12) - -384756908;
                    var3_4 = Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) + 1393083666 - 1393083666;
                    Integer.rotateLeft(860241125 ^ var2_3, 9) - 970915574;
                    (int)(-1012022559172662449L ^ (long)var2_3 ^ -2828116417529229768L);
                    continue block19;
                }
                case -2005557317: {
                    Integer.rotateRight(1551514955 ^ var2_3, 14) + 925567824;
                    try {
                        var4_2 += 2;
                        if ((-2063733128858161969L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var3_4 = Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820);
                    }
                    catch (IllegalArgumentException v3) {
                        var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820)));
                    }
                    continue block19;
                }
                case -794842062: {
                    Integer.rotateLeft(-1489965851 ^ var2_3, 7) - 1128943350;
                    (int)(7314482240951741263L ^ (long)var2_3 ^ 8701098628539311829L);
                    var3_4 = Integer.reverse(var2_3 ^ 1223006567 ^ -2056021820);
                    Integer.rotateLeft(335511116 ^ var2_3, 5) - 1884154479;
                    var3_4 = Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) ^ 1820209396 ^ 1820209396;
                    continue block19;
                }
                case 1472774202: {
                    (Integer.rotateRight(-495586253 ^ var2_3, 15) + 1889939816) * -495586253;
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) ^ -5360023081772319060L ^ -5360023081772319060L);
                    Integer.rotateRight(447355718 ^ var2_3, 6) - 1056369845;
                    var4_2 += 3;
                    continue block19;
                }
                case -1191228079: {
                    (Integer.rotateRight(-2080270889 ^ var2_3, 3) - 9356356) * -2080270889;
                    (int)(-4278381906592189965L ^ (long)var2_3 ^ -5056130017633753967L);
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) ^ -8990698867886009309L ^ -8990698867886009309L);
                    var4_2 -= 5;
                    continue block19;
                }
                case -948760427: {
                    Integer.rotateLeft(1631993669 ^ var2_3, 15) - -874559338;
                    (int)(-6632516405959529649L ^ (long)var2_3 ^ -2341727657773176264L);
                    var3_4 = Integer.reverse(var2_3 ^ -982343619 ^ -2056021820) ^ -483089755 ^ -483089755;
                    (Integer.rotateLeft(1443188441 ^ var2_3, 13) + 1862413186) * 1443188441;
                    (int)(-7730462964832736433L ^ (long)var2_3 ^ 4375391186449892542L);
                    var3_4 = Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820);
                    var4_2 -= 5;
                    continue block19;
                }
lbl125:
                // 1 sources

                (Integer.rotateLeft(-1728351436 ^ var2_3, 6) - -1966042489) * -1728351435;
                var3_4 = (int)((long)Integer.reverse(var2_3 ^ -2023164908 ^ -2056021820) ^ 2679108587797128251L ^ 2679108587797128251L);
                (Integer.rotateLeft(1552898233 ^ var2_3, 14) + 968449442) * 1552898233;
                (int)(-7044203194673206449L ^ (long)var2_3 ^ 1186842650271584682L);
                var3_4 = Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) ^ -1021135587 ^ -1021135587;
                var4_2 -= 2;
                continue block19;
                case 398217366: {
                    (Integer.rotateRight(932717011 ^ var2_3, 9) + -1077299256) * 932717011;
                    var3_4 = Integer.reverse(var2_3 ^ 1332862024 ^ -2056021820) + -820702434 - -820702434;
                    (Integer.rotateRight(-1357138466 ^ var2_3, 8) - 951624989) * -1357138465;
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) ^ -2019928997804733825L ^ -2019928997804733825L);
                    var4_2 += 3;
                    continue block19;
                }
                case -1866362851: {
                    Integer.rotateLeft(99696364 ^ var2_3, 3) - -1131135537;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -297247566 ^ -2056021820)));
                    Integer.rotateRight(1677596679 ^ var2_3, 15) - 539133972;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820)));
                    continue block19;
                }
                case 1189518137: {
                    Integer.rotateLeft(481839744 ^ var2_3, 6) + 2125374651;
                    var3_4 = Integer.reverse(var2_3 ^ -1883446125 ^ -2056021820) ^ -660483151 ^ -660483151;
                    Integer.rotateLeft(-897645532 ^ var2_3, 12) - -1983963241;
                    (int)(7151302534008232817L ^ (long)var2_3 ^ -939240897436619860L);
                    var3_4 = Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) ^ -2117680829 ^ -2117680829;
                    var4_2 += 2;
                    continue block19;
                }
            }
            Integer.rotateLeft(890899209 ^ var2_3, 9) + 1921316178;
            (int)(-601048906828813489L ^ (long)var2_3 ^ -5253304816868244864L);
            var3_4 = Integer.reverse(var2_3 ^ 1074228640 ^ -2056021820) + 15870705 - 15870705;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void jn(byte[] byArray, float f) {
        try {
            int n = 1136722068;
            n = Integer.rotateLeft(n * -679390199, 16) ^ 0xBEF53177;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            n = (byArray != null ? System.identityHashCode(byArray) : 0) ^ n;
            int n2 = n ^ 0xFE2A9B0A;
            if ((n2 ^ n) != -30762230) {
                int cfr_ignored_0 = (0xBDEB9B9E ^ n) - -1230746718;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new ByteArrayInputStream(byArray));
            try {
                Clip clip = tth.drz_2();
                clip.open(audioInputStream);
                if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                    FloatControl floatControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
                    float f2 = (float)(Double.longBitsToDouble(0x7ACEC5EE8E9CE7CFL ^ 0x3AFAC5EE8E9CE7CFL) * Math.log10(Math.max(tth.djb_2(Integer.rotateLeft(0x2FDF2136 ^ 0x73F7D1B9, 14)), f)));
                    floatControl.setValue(Math.max(floatControl.getMinimum(), tth.hdh_2(f2, floatControl.getMaximum())));
                }
                this.shnn = clip;
                clip.addLineListener(arg_0 -> this.thtt(clip, arg_0));
                clip.start();
                if (audioInputStream == null) return;
            }
            catch (Throwable throwable) {
                if (audioInputStream == null) throw throwable;
                try {
                    tth.thl_3(audioInputStream);
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            audioInputStream.close();
            return;
        }
        catch (Exception exception) {
            System.err.println("KillSound play error: " + exception.getMessage());
        }
    }

    private void ghthdh() {
        int n = 0;
        int n2 = -115938764;
        n2 = Integer.rotateLeft(n2 * -104427557, 24) ^ 0x57C151E2;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 18);
        int n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9) + -1545078719 - -1545078719;
        while (true) {
            block17: {
                block16: {
                    block19: {
                        block23: {
                            block36: {
                                block18: {
                                    block31: {
                                        block29: {
                                            block32: {
                                                block26: {
                                                    block20: {
                                                        block24: {
                                                            block30: {
                                                                block39: {
                                                                    block35: {
                                                                        block25: {
                                                                            block33: {
                                                                                block22: {
                                                                                    block37: {
                                                                                        block38: {
                                                                                            block15: {
                                                                                                block34: {
                                                                                                    block27: {
                                                                                                        block28: {
                                                                                                            block12: {
                                                                                                                block21: {
                                                                                                                    block13: {
                                                                                                                        block14: {
                                                                                                                            if ((n = Integer.rotateRight(n3, 9) ^ n2) > -448884574) break block12;
                                                                                                                            if (n > -1320409302) break block13;
                                                                                                                            if (n > -1965510801) break block14;
                                                                                                                            if (n == -1989145722) break block15;
                                                                                                                            if (n == -1965510801) break block16;
                                                                                                                            break block17;
                                                                                                                        }
                                                                                                                        if (n == -1714228955) break block18;
                                                                                                                        if (n == -1682142922) break block19;
                                                                                                                        int cfr_ignored_0 = Integer.rotateRight(0x9FD9326 ^ n2, 4) - 974287061;
                                                                                                                        if (n == -1320409302) break block20;
                                                                                                                        break block17;
                                                                                                                    }
                                                                                                                    if (n > -1060534988) break block21;
                                                                                                                    if (n == -1293165938) break block22;
                                                                                                                    if (n == -1060534988) break block23;
                                                                                                                    break block17;
                                                                                                                }
                                                                                                                if (n == -754319326) break block24;
                                                                                                                if (n == -551967280) break block25;
                                                                                                                int cfr_ignored_1 = Integer.rotateRight(0x9579570A ^ n2, 5) + 504310129;
                                                                                                                if (n == -448884574) break block26;
                                                                                                                break block17;
                                                                                                            }
                                                                                                            if (n > 555441085) break block27;
                                                                                                            if (n > 103256348) break block28;
                                                                                                            if (n == -445299476) break block29;
                                                                                                            if (n == 103256348) break block30;
                                                                                                            break block17;
                                                                                                        }
                                                                                                        if (n == 136522292) break block31;
                                                                                                        if (n == 226127923) break block32;
                                                                                                        int cfr_ignored_2 = Integer.rotateLeft(0x46E8C6C4 ^ n2, 11) - -1701990153;
                                                                                                        if (n == 555441085) break block33;
                                                                                                        break block17;
                                                                                                    }
                                                                                                    if (n > 1450795637) break block34;
                                                                                                    if (n == 1057027328) break block35;
                                                                                                    if (n == 1450795637) break block36;
                                                                                                    break block17;
                                                                                                }
                                                                                                if (n == 1601345966) break block37;
                                                                                                if (n == 1694991075) break block38;
                                                                                                int cfr_ignored_3 = (Integer.rotateRight(0xC606AADE ^ n2, 11) - -13873123) * -972641569;
                                                                                                if (n == 1827081593) break block39;
                                                                                                break block17;
                                                                                            }
                                                                                            int cfr_ignored_4 = (Integer.rotateLeft(0x367A7219 ^ n2, 9) + -1657704382) * 913994265;
                                                                                            int cfr_ignored_5 = (int)(0xF4C8DC2427D4EB4FL ^ (long)n2 ^ 0x4538831A2DB84440L);
                                                                                            return;
                                                                                        }
                                                                                        int cfr_ignored_6 = Integer.rotateRight(0xA26191CB ^ n2, 7) + -1372698928;
                                                                                        if (yf.khdha_2()) {
                                                                                            int cfr_ignored_7 = (int)(0x7C4D343369543F3EL ^ (long)n2 ^ 0x95161E1B855B554BL);
                                                                                            n3 = Integer.rotateLeft(n2 ^ 0x8E39B2D4, 9) + 806435272 - 806435272;
                                                                                            int cfr_ignored_8 = (int)(0xB4815975126BE8EEL ^ (long)n2 ^ 0x4F9AE8642AFAC4D3L);
                                                                                            n3 = Integer.rotateLeft(n2 ^ 0xB2EBDA8E, 9) ^ 0x15C634ED ^ 0x15C634ED;
                                                                                            n -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_9 = (int)(0xDE6EA06FE1E97B51L ^ (long)n2 ^ 0xBDAF0F610D84110CL);
                                                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x7A7B8E79, 9)));
                                                                                        int cfr_ignored_10 = (int)(0x87E0BFA166FE5D94L ^ (long)n2 ^ 0x8232014F400EA210L);
                                                                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5F7299AE, 9) ^ 0x3979156BFCA5ACD1L ^ 0x3979156BFCA5ACD1L);
                                                                                        n -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_11 = Integer.rotateLeft(0xB8CC29E0 ^ n2, 10) + 1695986011;
                                                                                    yf.athz_2();
                                                                                    throw null;
                                                                                }
                                                                                int cfr_ignored_12 = Integer.rotateLeft(0x32AAAA05 ^ n2, 9) - 654849494;
                                                                                int cfr_ignored_13 = (int)(0xF018043827D4EB4FL ^ (long)n2 ^ 0xF500831A2DB84DE1L);
                                                                                if (this.shnn != null) {
                                                                                    try {
                                                                                        --n;
                                                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xDF19A5D0, 9)));
                                                                                    }
                                                                                    catch (ArithmeticException arithmeticException) {
                                                                                        n3 = Integer.rotateLeft(n2 ^ 0xDF19A5D0, 9) ^ 0x2453B014 ^ 0x2453B014;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_14 = (int)(0x95D547171D2DFCC7L ^ (long)n2 ^ 0x735EF6E802A8867BL);
                                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x1F710AB8, 9)));
                                                                                int cfr_ignored_15 = (int)(0x48F8711BE940C913L ^ (long)n2 ^ 0x1F471E3269013C21L);
                                                                                n3 = Integer.rotateLeft(n2 ^ 0x89700B86, 9);
                                                                                n -= 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_16 = Integer.rotateRight(0x3490232E ^ n2, 9) - 1641144781;
                                                                            this.shnn.stop();
                                                                            n3 = Integer.rotateLeft(n2 ^ 0x5AB70D3A, 9) ^ 0x2E9F27F3 ^ 0x2E9F27F3;
                                                                            int cfr_ignored_17 = (Integer.rotateRight(0x5BC75C97 ^ n2, 14) - 562156932) * 1539792023;
                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x6CE70D79, 9)));
                                                                            --n;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_18 = Integer.rotateLeft(0x3E2D3E20 ^ n2, 10) + -1948768997;
                                                                        if (!this.shnn.isRunning()) {
                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x3F00F500, 9)));
                                                                            --n;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_19 = (int)(0xDEC3B493B50894A5L ^ (long)n2 ^ 0x9457A6A2D26C1056L);
                                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x2302B6D1, 9)));
                                                                        int cfr_ignored_20 = (int)(0x5F7DF76917D2DEA1L ^ (long)n2 ^ 0x13A2E3164665132AL);
                                                                        n3 = Integer.rotateLeft(n2 ^ 0x211B5BBD, 9);
                                                                        n -= 4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_21 = Integer.rotateRight(0xF0BDBBEA ^ n2, 17) + 727146641;
                                                                    this.shnn.close();
                                                                    this.shnn = null;
                                                                    try {
                                                                        n += 4;
                                                                        if ((0x1DE6097399362DA5L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x89700B86, 9)));
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x89700B86, 9) ^ 0xCDCE7C6C693B3EB3L ^ 0xCDCE7C6C693B3EB3L);
                                                                    }
                                                                    n -= 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_22 = (Integer.rotateRight(0x6B8FE1F ^ n2, 3) - -725326596) * 112786975;
                                                                this.shnn.close();
                                                                this.shnn = null;
                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD0B11CDB, 9)));
                                                                int cfr_ignored_23 = (Integer.rotateLeft(0x731ACBD1 ^ n2, 17) + -191083126) * 1931135953;
                                                                int cfr_ignored_24 = (int)(0xB1A865EC27D4EB4FL ^ (long)n2 ^ 0x36A8831A2DB8CE81L);
                                                                n3 = Integer.rotateLeft(n2 ^ 0x89700B86, 9) ^ 0xC7E34A46 ^ 0xC7E34A46;
                                                                n -= 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_25 = (Integer.rotateRight(0x1A92FB57 ^ n2, 6) - 1009389252) * 445840215;
                                                            n3 = Integer.rotateLeft(n2 ^ 0x5CB7A0F2, 9) ^ 0x7E4594C0 ^ 0x7E4594C0;
                                                            int cfr_ignored_26 = Integer.rotateRight(0xBF953B27 ^ n2, 10) - 930072820;
                                                            n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9) + 492913471 - 492913471;
                                                            n -= 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_27 = (Integer.rotateLeft(0x30B80ED8 ^ n2, 9) + -358126749) * 817368793;
                                                        n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9);
                                                        int cfr_ignored_28 = (Integer.rotateRight(0x614033FB ^ n2, 15) + -886838624) * 1631597563;
                                                        continue;
                                                    }
                                                    int cfr_ignored_29 = Integer.rotateLeft(0xFB04106D ^ n2, 18) - 1776000110;
                                                    int cfr_ignored_30 = (int)(0x39B6BE5027D4EB4FL ^ (long)n2 ^ 0x81D0831A2DB9DEBCL);
                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6B0B41D, 9) ^ 0xFDCA1F9E9FD05CCCL ^ 0xFDCA1F9E9FD05CCCL);
                                                    int cfr_ignored_31 = (Integer.rotateLeft(0xF57175D ^ n2, 4) - -538348674) * 257365853;
                                                    int cfr_ignored_32 = (int)(0xCDE5B96027D4EB4FL ^ (long)n2 ^ 0x8FB0831A2DB8361AL);
                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x650782E3, 9) ^ 0xCFB892EE5EBDBEA6L ^ 0xCFB892EE5EBDBEA6L);
                                                    int cfr_ignored_33 = (Integer.rotateRight(0xCDCBD6DF ^ n2, 12) - -267606980) * -842279201;
                                                    continue;
                                                }
                                                int cfr_ignored_34 = Integer.rotateRight(0xDF7E066 ^ n2, 4) - -1251882091;
                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x1AC4D4DF, 9) ^ 0x580D6FF7DB11F0E9L ^ 0x580D6FF7DB11F0E9L);
                                                int cfr_ignored_35 = Integer.rotateRight(0xEBCDE96F ^ n2, 16) - -1840454740;
                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x650782E3, 9) ^ 0xC155F7AB0865651AL ^ 0xC155F7AB0865651AL);
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_36 = (Integer.rotateLeft(0xF84AAA11 ^ n2, 18) + 359151434) * -129324527;
                                            int cfr_ignored_37 = (int)(0x3AF8042C27D4EB4FL ^ (long)n2 ^ 0xF528831A2DB9D821L);
                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xB2815EF8, 9)));
                                            int cfr_ignored_38 = (Integer.rotateRight(0xA8FC0BD6 ^ n2, 8) - 2061700645) * -1459876905;
                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA3701731, 9)));
                                            int cfr_ignored_39 = Integer.rotateRight(0xB4F12D46 ^ n2, 9) - -309192011;
                                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x650782E3, 9) ^ 0xEF8CD4E7F0F545C7L ^ 0xEF8CD4E7F0F545C7L);
                                            continue;
                                        }
                                        int cfr_ignored_40 = Integer.rotateRight(0xCD3801CE ^ n2, 12) - -567945427;
                                        n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9) ^ 0xAF6CF163 ^ 0xAF6CF163;
                                        n += 5;
                                        continue;
                                    }
                                    int cfr_ignored_41 = (Integer.rotateLeft(0x7D96A0B4 ^ n2, 18) - 966464775) * 2107023541;
                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x650782E3, 9) ^ 0xDE2202750393823CL ^ 0xDE2202750393823CL);
                                    int cfr_ignored_42 = (Integer.rotateRight(0xCF9BB03B ^ n2, 12) + 674756192) * -811880389;
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_43 = Integer.rotateRight(0xDFE46FEF ^ n2, 14) - 554118444;
                                int cfr_ignored_44 = (int)(0xDF5641CEB5819BA9L ^ (long)n2 ^ 0x7EEDA7B0CC74137DL);
                                n3 = Integer.rotateLeft(n2 ^ 0x332B090C, 9);
                                int cfr_ignored_45 = (int)(0x3B8A8CE9D459041FL ^ (long)n2 ^ 0xE4A36401F319DAC4L);
                                n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9);
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_46 = Integer.rotateLeft(0xD705CB2D ^ n2, 13) - 236009902;
                            int cfr_ignored_47 = (int)(0x15B7651027D4EB4FL ^ (long)n2 ^ 0x3750831A2DB986BFL);
                            n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9) + -652463348 - -652463348;
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_48 = (Integer.rotateRight(0x759E3ED3 ^ n2, 17) + 1116158664) * 1973305043;
                        n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9) ^ 0x8FA8BA2F ^ 0x8FA8BA2F;
                        n -= 3;
                        continue;
                    }
                    int cfr_ignored_49 = (Integer.rotateLeft(0x8C88677C ^ n2, 4) - 149038911) * -1937217667;
                    try {
                        n += 2;
                        if ((0x2FFB5E1C0E0C30A1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x650782E3, 9)));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9);
                    }
                    n += 4;
                    continue;
                }
                int cfr_ignored_50 = (Integer.rotateLeft(0x9DB9555C ^ n2, 6) - 500102495) * -1648798371;
                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x7984C3A6, 9) ^ 0x671D9C07B3C687FCL ^ 0x671D9C07B3C687FCL);
                int cfr_ignored_51 = (Integer.rotateRight(0xE9D72472 ^ n2, 16) + 1433078025) * -371776397;
                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x650782E3, 9)));
                continue;
            }
            int cfr_ignored_52 = (Integer.rotateLeft(0x41E4C99C ^ n2, 11) - -15595233) * 1105512861;
            n3 = Integer.rotateLeft(n2 ^ 0x650782E3, 9) ^ 0x21217A8A ^ 0x21217A8A;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void thtt(Clip var1_1, LineEvent var2_2) {
        var5_3 = 0;
        var3_4 = -1222514874;
        var3_4 = Integer.rotateLeft(var3_4 * 726952365, 15) ^ 536295165;
        var3_4 = System.identityHashCode(this) ^ var3_4;
        v0 = var1_1;
        var3_4 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var3_4;
        var4_5 = (var3_4 ^ 1208431761) + -144903470 - -144903470;
        while (true) {
            block38: {
                block40: {
                    block44: {
                        block35: {
                            block33: {
                                block39: {
                                    block43: {
                                        block41: {
                                            block45: {
                                                block42: {
                                                    block46: {
                                                        block34: {
                                                            block37: {
                                                                block36: {
                                                                    var5_3 = var4_5 ^ var3_4;
                                                                    switch (var5_3 & 7) {
                                                                        case 0: {
                                                                            if (var5_3 != 2000028248) {
                                                                                ** break;
                                                                            }
                                                                            break block33;
                                                                        }
                                                                        case 5: {
                                                                            if (var5_3 != 1241873749) {
                                                                                ** break;
                                                                            }
                                                                            break block34;
                                                                        }
                                                                        case 4: {
                                                                            if (var5_3 != 26383180) {
                                                                                ** break;
                                                                            }
                                                                            break block35;
                                                                        }
                                                                        case 1: {
                                                                            if (var5_3 == 529893865) break block36;
                                                                            if (var5_3 != 1208431761) {
                                                                                Integer.rotateLeft(-1746453499 ^ var3_4, 5) - 1767760854;
                                                                                (int)(6148981636128369487L ^ (long)var3_4 ^ -2810102019019700358L);
                                                                                ** break;
                                                                            }
                                                                            break block37;
                                                                        }
                                                                        case 2: {
                                                                            if (var5_3 == -361027190) break block38;
                                                                            if (var5_3 == 421325138) break block39;
                                                                            if (var5_3 == 1377144290) break block40;
                                                                            if (var5_3 == -1790890758) break block41;
                                                                            if (var5_3 == 992218570) break block42;
                                                                            if (var5_3 != -1282388270) {
                                                                                if (var5_3 == -1273706254) break;
                                                                                ** break;
                                                                            }
                                                                            break block43;
                                                                        }
                                                                        case 6: {
                                                                            if (var5_3 == -81240866) break block44;
                                                                            if (var5_3 != -156601706) {
                                                                                (Integer.rotateRight(9895059 ^ var3_4, 3) + 379991304) * 9895059;
                                                                                ** break;
                                                                            }
                                                                            break block45;
                                                                        }
                                                                        case 7: {
                                                                            if (var5_3 != 1309599967) {
                                                                                ** break;
                                                                            }
                                                                            break block46;
                                                                        }
                                                                    }
                                                                    (Integer.rotateLeft(385219960 ^ var3_4, 5) + -869838653) * 385219961;
                                                                    this.shnn = null;
                                                                    (int)(3248462804885297730L ^ (long)var3_4 ^ 5340057703742175224L);
                                                                    var4_5 = (int)((long)(var3_4 ^ 1241873749) ^ 5854734589214764232L ^ 5854734589214764232L);
                                                                    var5_3 += 3;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(-209171175 ^ var3_4, 17) + -2116094654) * -209171175;
                                                                (int)(3547397400934280015L ^ (long)var3_4 ^ 4267304795393085348L);
                                                                var1_1.close();
                                                                if (this.shnn == var1_1) {
                                                                    (int)(-3579042372453192776L ^ (long)var3_4 ^ -6725757682716364424L);
                                                                    var4_5 = var3_4 ^ -1273706254;
                                                                    continue;
                                                                }
                                                                (int)(-1521734893235275177L ^ (long)var3_4 ^ -7986464911825274862L);
                                                                var4_5 = (var3_4 ^ 616634204) + 1436881379 - 1436881379;
                                                                (int)(8750034245249067816L ^ (long)var3_4 ^ 5107765419166883597L);
                                                                var4_5 = (var3_4 ^ 1241873749) + -1282567999 - -1282567999;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(-306259835 ^ var3_4, 16) - -830875818;
                                                            (int)(3390215152817466191L ^ (long)var3_4 ^ 1153065653066396617L);
                                                            if (var2_2.getType() != LineEvent.Type.STOP) {
                                                                (int)(4786978067017007853L ^ (long)var3_4 ^ 8868094502481242380L);
                                                                var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 253350220));
                                                                (int)(-8036049668990785256L ^ (long)var3_4 ^ -7800647547234120411L);
                                                                var4_5 = var3_4 ^ 1241873749;
                                                                var5_3 += 3;
                                                                continue;
                                                            }
                                                            var4_5 = (int)((long)(var3_4 ^ 529893865) ^ 681791255141405349L ^ 681791255141405349L);
                                                            (Integer.rotateLeft(-820921672 ^ var3_4, 12) + 394476419) * -820921671;
                                                            var5_3 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-117812725 ^ var3_4, 18) + 716017296;
                                                        return;
                                                    }
                                                    (Integer.rotateRight(-724455054 ^ var3_4, 13) + -910025719) * -724455053;
                                                    (int)(5278729220327004990L ^ (long)var3_4 ^ 6770276461742604114L);
                                                    var4_5 = var3_4 ^ 1208431761;
                                                    var5_3 += 5;
                                                    continue;
                                                }
                                                Integer.rotateLeft(128173704 ^ var3_4, 3) + -248337997;
                                                var4_5 = (var3_4 ^ -154991835) + 1813514721 - 1813514721;
                                                (Integer.rotateLeft(-1224549451 ^ var3_4, 9) - 766917158) * -1224549451;
                                                (int)(8480407325982911311L ^ (long)var3_4 ^ 1612432815058142897L);
                                                var4_5 = (var3_4 ^ -1960963229) + 1809562713 - 1809562713;
                                                Integer.rotateLeft(-1160133183 ^ var3_4, 10) + -1531145830;
                                                (int)(8677147837803588431L ^ (long)var3_4 ^ 3064843694885133575L);
                                                var4_5 = (var3_4 ^ 1208431761) + -2137205064 - -2137205064;
                                                var5_3 -= 3;
                                                continue;
                                            }
                                            (Integer.rotateRight(-759862477 ^ var3_4, 13) + -2007655832) * -759862477;
                                            var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 1425358550));
                                            (Integer.rotateLeft(-1337046220 ^ var3_4, 9) - 1574484615) * -1337046219;
                                            try {
                                                if ((-1084638990661071927L ^ (long)var3_4 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var4_5 = var3_4 ^ 1208431761;
                                            }
                                            catch (NoSuchElementException v1) {
                                                var4_5 = (int)((long)(var3_4 ^ 1208431761) ^ -4298103844934670479L ^ -4298103844934670479L);
                                            }
                                            ++var5_3;
                                            continue;
                                        }
                                        (Integer.rotateRight(-1019946758 ^ var3_4, 11) + -1480333951) * -1019946757;
                                        var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 1333684532));
                                        (Integer.rotateRight(-1331197481 ^ var3_4, 9) - 1755795524) * -1331197481;
                                        var4_5 = (var3_4 ^ 1208431761) + -1003612211 - -1003612211;
                                        var5_3 -= 2;
                                        continue;
                                    }
                                    (Integer.rotateRight(60251442 ^ var3_4, 3) + 1941039177) * 60251443;
                                    (int)(5769609341388553056L ^ (long)var3_4 ^ 8588893118498541042L);
                                    var4_5 = (var3_4 ^ -429749946) + -2135192943 - -2135192943;
                                    (int)(9042755459241233266L ^ (long)var3_4 ^ 6425292152062039853L);
                                    var4_5 = (int)((long)(var3_4 ^ 1208431761) ^ 1390140539633865368L ^ 1390140539633865368L);
                                    continue;
                                }
                                (Integer.rotateRight(1511067003 ^ var3_4, 14) + -328318688) * 1511067003;
                                try {
                                    ++var5_3;
                                    var4_5 = (int)((long)(var3_4 ^ 1208431761) ^ 6364868808817825326L ^ 6364868808817825326L);
                                }
                                catch (IllegalStateException v2) {
                                    var4_5 = (int)((long)(var3_4 ^ 1208431761) ^ 7123714307710203992L ^ 7123714307710203992L);
                                }
                                var5_3 += 2;
                                continue;
                            }
                            Integer.rotateLeft(1406074253 ^ var3_4, 13) - 711873358;
                            (int)(-7963398025050264753L ^ (long)var3_4 ^ 6489831211500343081L);
                            var4_5 = (int)((long)(var3_4 ^ 413206806) ^ -485361216414931842L ^ -485361216414931842L);
                            (Integer.rotateLeft(1616066864 ^ var3_4, 15) + -1368290293) * 1616066865;
                            (int)(3130754723874723161L ^ (long)var3_4 ^ -6567872886846653644L);
                            var4_5 = var3_4 ^ 2132872779 ^ 825350042 ^ 825350042;
                            (int)(-4378678016227909662L ^ (long)var3_4 ^ 7090510155198114726L);
                            var4_5 = (int)((long)(var3_4 ^ 1208431761) ^ 8646044571407495623L ^ 8646044571407495623L);
                            var5_3 -= 5;
                            continue;
                        }
                        Integer.rotateLeft(1524982792 ^ var3_4, 14) + 103070771;
                        var4_5 = var3_4 ^ -1522248613 ^ 1652758527 ^ 1652758527;
                        Integer.rotateLeft(1240430025 ^ var3_4, 12) + -128130414;
                        (int)(-8404319487916709041L ^ (long)var3_4 ^ 5375190303726156650L);
                        try {
                            var5_3 -= 4;
                            if ((1567159098259800997L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var4_5 = (var3_4 ^ 1208431761) + 1474432416 - 1474432416;
                        }
                        catch (IllegalStateException v3) {
                            var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 1208431761));
                        }
                        var5_3 -= 3;
                        continue;
                    }
                    (Integer.rotateLeft(-279375344 ^ var3_4, 16) + 2543403) * -279375343;
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 366130042));
                    (Integer.rotateLeft(-65863047 ^ var3_4, 18) + -1968509982) * -65863047;
                    (int)(4513077710327966543L ^ (long)var3_4 ^ -6487291114767658862L);
                    try {
                        if ((5667873314003091129L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = var3_4 ^ 1208431761;
                    }
                    catch (IllegalArgumentException v4) {
                        var4_5 = (var3_4 ^ 1208431761) + -14866402 - -14866402;
                    }
                    var5_3 -= 5;
                    continue;
                }
                Integer.rotateRight(222178118 ^ var3_4, 4) - -1629168459;
                try {
                    var5_3 -= 2;
                    if ((5525050165589886025L ^ (long)var3_4 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var4_5 = var3_4 ^ 1208431761 ^ -1440887036 ^ -1440887036;
                }
                catch (UnsupportedOperationException v5) {
                    var4_5 = (int)((long)(var3_4 ^ 1208431761) ^ 8611650911607104864L ^ 8611650911607104864L);
                }
                var5_3 -= 5;
                continue;
            }
            (Integer.rotateRight(1254085015 ^ var3_4, 12) - 295174276) * 1254085015;
            (int)(3858654611827156733L ^ (long)var3_4 ^ -7014042572563822904L);
            var4_5 = var3_4 ^ 1208431761 ^ -2092946140 ^ -2092946140;
            var5_3 += 5;
            continue;
lbl243:
            // 8 sources

            Integer.rotateRight(-1563434769 ^ var3_4, 7) - -1148593108;
            var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 1208431761));
        }
    }

    private void bzt_2(String string) {
        try {
            byte[] byArray;
            int n = -1520253017;
            n = Integer.rotateLeft(n * -1819453171, 5) ^ 0x489F48A3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xBC3B538A;
            if ((n2 ^ n) != -1136962678) {
                int cfr_ignored_0 = (0x1959942D ^ n) - 473391647;
            }
            if (!yf.khdha_2()) {
                yf.athz_2();
            }
            class_2960 class_29602 = class_2960.method_60655((String)"moondlc", (String)("sounds/" + string));
            Optional optional = mc.method_1478().method_14486(class_29602);
            if (optional.isEmpty()) {
                System.err.println("KillSound resource not found: " + String.valueOf(class_29602));
                return;
            }
            try (InputStream inputStream = ((class_3298)optional.get()).method_14482();){
                byArray = inputStream.readAllBytes();
            }
            float f = Math.max(1.0f, this.thnth.thw_5()) / Float.intBitsToFloat(1020312606 - -100090850);
            new Thread(() -> this.dshw(byArray, f), "Moondlc-KillSound").start();
        }
        catch (Exception exception) {
            System.err.println("KillSound load error: " + exception.getMessage());
        }
    }

    private void dshw(byte[] byArray, float f) {
        int n = -1920800193;
        n = Integer.rotateLeft(n * -1345589379, 4) ^ 0xBB6DAD90;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x218F5E1B;
        if ((n2 ^ n) != 563043867) {
            int cfr_ignored_0 = (0xAC0DB424 ^ n) - -7957789;
        }
        this.jn(byArray, f);
    }

    private void khkh(btt btt2) {
        class_239 class_2392;
        int n = -2026513152;
        n = Integer.rotateLeft(n * -1752993559, 19) ^ 0x9638B43D;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
        int n2 = n ^ 0x99F25BD9;
        if ((n2 ^ n) != -1712170023) {
            int cfr_ignored_0 = (0x1EC786D9 ^ n) + -1198168385;
        }
        if (tth.mc.field_1724 == null || tth.mc.field_1687 == null || !tth.mc.field_1724.method_5805() || tth.mc.field_1724.field_6213 > 0) {
            this.khzd_2.clear();
            this.dhrkh = null;
            return;
        }
        class_1309 class_13092 = bjd.shfn();
        if (class_13092 != null) {
            this.tst_6((class_1297)class_13092, 0x19847D42254461EBL ^ 0x19847D422544682FL);
        }
        if ((class_2392 = tth.mc.field_1765) instanceof class_3966) {
            class_3966 class_39662 = (class_3966)class_2392;
            this.tst_6(class_39662.method_17782(), 0xCE40FDF124BFB874L ^ 0xCE40FDF124BFB1B0L);
        }
        long l = System.currentTimeMillis();
        Iterator iterator = this.khzd_2.entrySet().iterator();
        while (iterator.hasNext()) {
            if (l - (Long)iterator.next().getValue() <= (0x78EF3C532579EA8AL ^ 0x78EF3C532579C46AL)) continue;
            iterator.remove();
        }
        if (this.dhrkh != null && (this.dhrkh.method_6032() <= 0.0f || !this.dhrkh.method_5805())) {
            if (this.ghkhd_2(this.dhrkh, (class_1297)this.dhrkh.method_6065())) {
                this.sm_2();
            }
            this.dlz(this.dhrkh);
        }
    }

    private void thkhs_2(bksh bksh2) {
        class_1309 class_13092;
        class_2663 class_26632;
        int n = mz_2.thzt_3(-1172805593);
        int n2 = n ^ 0x345BBBFD;
        if ((n2 ^ n) != 878427133) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8E43D3DA ^ n, 4) + 1049904801) * -1908157477;
        }
        if (tth.mc.field_1724 == null || tth.mc.field_1687 == null || !tth.mc.field_1724.method_5805() || tth.mc.field_1724.field_6213 > 0) {
            return;
        }
        class_2596 class_25962 = bksh2.asw();
        if (class_25962 instanceof class_2663 && (class_26632 = (class_2663)class_25962).method_11470() == 3 && (class_25962 = class_26632.method_11469((class_1937)tth.mc.field_1687)) instanceof class_1309 && this.ghkhd_2(class_13092 = (class_1309)class_25962, (class_1297)class_13092.method_6065())) {
            this.sm_2();
            this.dlz(class_13092);
        }
    }

    private void rrl(bghq bghq2) {
        try {
            int n = -20722113;
            n = Integer.rotateLeft(n * 889340139, 18) ^ 0x3B97A9D2;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x67AFFB6;
            if ((n2 ^ n) != 108724150) {
                int cfr_ignored_0 = (0xF8B93189 ^ n) + -1871158913;
            }
            if ((0xF0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_1309 class_13092 = bghq2.sll();
        if (this.ghkhd_2(class_13092, bghq2.rnk() != null ? bghq2.rnk().method_5529() : null)) {
            this.sm_2();
            this.dlz(class_13092);
        }
    }

    private void dzd_6(bthy bthy2) {
        int n = mz_2.thzt_3(496082067);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
        int n2 = n ^ 0x52F6D9A3;
        if ((n2 ^ n) != 1391909283) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x4F674530 ^ n, 12) + -1579220981) * 1332167985;
        }
        this.tst_6(bthy2.khtf(), 0x746527BEE2AA387L ^ 0x746527BEE2A8D67L);
    }

    private static String sghs(String string, int n, int n2, int n3) {
        int n4 = -1162678422;
        n4 = Integer.rotateLeft(n4 * 398524085, 23) ^ 0xA0AA3DAA;
        n4 = n ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0xB5C4AB05;
        if ((n5 ^ n4) != -1245402363) {
            int cfr_ignored_0 = (0xF76446F ^ n4) - 1166747581;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x1CBCA071) + n2 ^ i * 830513151) ^ thzs_2) + bnth);
        }
        return new String(cArray);
    }

    private static int dnz(class_1309 class_13092) {
        block0: {
            int n = -1152286390;
            n = Integer.rotateLeft(n * -909290933, 24) ^ 0xE45B6AE6;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xAD4E160A;
            if ((n2 ^ n) == -1387391478) break block0;
            int cfr_ignored_0 = (0x161F9740 ^ n) + -622544795;
        }
        return class_13092.method_5628();
    }

    private static int tkr(class_1309 class_13092) {
        block0: {
            int n = mz_2.thzt_3(-1563053558);
            int n2 = n ^ 0xAD559893;
            if ((n2 ^ n) == -1386899309) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF802A99 ^ n, 4) + -454899774) * 260057753;
            int cfr_ignored_1 = (int)(0xCD3284A427D4EB4FL ^ (long)n ^ 0xF438831A2DB837B4L);
        }
        return class_13092.method_5628();
    }

    private static class_1309 dkhsh(class_1309 class_13092) {
        block0: {
            int n = 1073733125;
            int n2 = (n = Integer.rotateLeft(n * 537626521, 18) ^ 0xA4BADDB2) ^ 0xBAE86943;
            if ((n2 ^ n) == -1159173821) break block0;
            int cfr_ignored_0 = (0x8517B746 ^ n) - 988410626;
        }
        return class_13092.method_6124();
    }

    private static int jwsh(class_1309 class_13092) {
        block0: {
            int n = 1126359098;
            int n2 = (n = Integer.rotateLeft(n * 1814797019, 13) ^ 0xE5AA5898) ^ 0x82417100;
            if ((n2 ^ n) == -2109640448) break block0;
            int cfr_ignored_0 = (0xC163913A ^ n) + -162564749;
        }
        return class_13092.method_5628();
    }

    private static void zaa_5(tth tth2, String string) {
        int n = 6962799;
        n = Integer.rotateLeft(n * 1692502521, 23) ^ 0x571BAF4B;
        tth tth3 = tth2;
        n = Integer.rotateLeft((tth3 != null ? System.identityHashCode(tth3) : 0) ^ n, 12);
        int n2 = n ^ 0x7FDA699B;
        if ((n2 ^ n) != 2145020315) {
            int cfr_ignored_0 = (0x7FB057F4 ^ n) - 1636180836;
        }
        tth2.skd(string);
    }

    private static Clip drz_2() {
        block0: {
            int n = 20886804;
            int n2 = (n = Integer.rotateLeft(n * -1787322185, 21) ^ 0x33480358) ^ 0x33EAE1CC;
            if ((n2 ^ n) == 871031244) break block0;
            int cfr_ignored_0 = (0x32D454D8 ^ n) - 1924516852;
        }
        return AudioSystem.getClip();
    }

    private static float djb_2(int n) {
        block0: {
            int n2 = mz_2.thzt_3(-921151099);
            int n3 = (n2 = n ^ n2) ^ 0x1E5D6A15;
            if ((n3 ^ n2) == 509438485) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD7453390 ^ n2, 13) + 364830123) * -683330671;
        }
        return Float.intBitsToFloat(n);
    }

    private static float hdh_2(float f, float f2) {
        block0: {
            int n = -370578879;
            n = Integer.rotateLeft(n * 1874970937, 6) ^ 0xF0C251D2;
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 11);
            int n2 = n ^ 0x3682913E;
            if ((n2 ^ n) == 914526526) break block0;
            int cfr_ignored_0 = (0xDF6BFB7F ^ n) - 2022585247;
        }
        return Math.min(f, f2);
    }

    private static void thl_3(AudioInputStream audioInputStream) {
        int n = -1229779682;
        int n2 = (n = Integer.rotateLeft(n * -1033710651, 15) ^ 0x2B850002) ^ 0x56F2717C;
        if ((n2 ^ n) != 1458729340) {
            int cfr_ignored_0 = (0xE0417C62 ^ n) - -1889716303;
        }
        audioInputStream.close();
    }

    private static String[] rzq_2(String string) {
        int n = mz_2.thzt_3(2064225150);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x7BF67584;
        if ((n2 ^ n) != 2079749508) {
            int cfr_ignored_0 = (Integer.rotateRight(0xFFE6FA ^ n, 3) + 593139585) * 16770811;
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

    private static CallSite aff(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2095007755;
            n3 = Integer.rotateLeft(n3 * -689011897, 28) ^ 0x7DC43FE0;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 6);
            n3 = n ^ n3;
            int n4 = n3 ^ 0x99C7ED60;
            if ((n4 ^ n3) != -1714950816) {
                int cfr_ignored_0 = (0x1AE75A95 ^ n3) + 1515595590;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dhr_2 ^ string.hashCode() ^ n2 + jbw ^ i * -463832495 ^ dhr_2, 17) ^ jbw));
            }
            String[] stringArray = tth.rzq_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] f92qu6ip3wdr6(String string) {
        return string.split("\u0004\u001c", -1);
    }

    private static CallSite toon0k9v6km6v9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ cuxstt664 ^ string.hashCode() ^ n2 + sds38wsbsh ^ i * -954702073 ^ cuxstt664, 8) ^ sds38wsbsh));
            }
            String[] stringArray = tth.f92qu6ip3wdr6(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

