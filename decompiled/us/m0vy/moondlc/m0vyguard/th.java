/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byh_2;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.accessors.MinecraftClientAccessor;

@tq_2(name="Tape Mouse", category=bzw.OTHER, desc="Automatically holds down mouse buttons")
public class th
extends bnq {
    private final badh_2 rsd_2 = new badh_2(this, "Attack").bts(true);
    private final badh_2 khbq = new badh_2(this, "Use").bts(false);
    private final tay rsz_2 = new tay((hy)this, "Attack delay", this::dt_4).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0x61162D7A ^ 0x20B62D7A)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xC4A0557C ^ 0x8580557C));
    private final tay zdhgh = new tay((hy)this, "Use delay", this::khdhm).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xA17AA74A ^ 0xA15A774A, 9))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(496139901 - -596476291));
    private final tkhd_2 khkhd = new tkhd_2();
    private final tkhd_2 shtq_2 = new tkhd_2();
    private final bql<btt> bah_2 = this::zth_10;
    private static final int rghy = -102266505;
    private static final int bfd_2 = -1126216868;
    private static final int ddhdh = 1299631296;
    private static final int tnr = -640596432;
    private static final int wx8nqgccrf = 543986839;
    private static final int c5f2wrcv = 1556481710;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vantfcl0wdfmt4;

    private void bwy(float f, tkhd_2 tkhd2_2, Runnable runnable) {
        int n = 0;
        int n2 = -747859069;
        n2 = Integer.rotateLeft(n2 * 271444347, 14) ^ 0xBC95CA4A;
        n2 = System.identityHashCode(this) ^ n2;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 5);
        int n3 = (int)((long)(n2 - -1061266936) ^ 0xB5B37F46C81BFA51L ^ 0xB5B37F46C81BFA51L);
        block28: while (true) {
            switch (n2 - n3) {
                case -1061266937: {
                    int cfr_ignored_0 = Integer.rotateRight(0xF8721542 ^ n2, 18) + 439235129;
                    runnable.run();
                    tkhd2_2.zat();
                    n3 = (int)((long)(n2 - -1061266935) ^ 0x11DD46DD16DA695BL ^ 0x11DD46DD16DA695BL);
                    int cfr_ignored_1 = Integer.rotateRight(0xEB602E07 ^ n2, 16) - -2063388140;
                    continue block28;
                }
                case -1061266936: {
                    int cfr_ignored_2 = Integer.rotateRight(0x1443E6AA ^ n2, 5) + 2023132625;
                    if (tkhd2_2.tagh((long)(f * Float.intBitsToFloat(th.sqb_2(0x9FE27475 ^ 0xBFE2757C, 22))))) {
                        try {
                            --n;
                            if ((0x60BE5F4FF9DD4AFFL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = n2 - -1061266937 + 974831668 - 974831668;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.reverse(Integer.reverse(n2 - -1061266937));
                        }
                        continue block28;
                    }
                    n3 = n2 - -1061266935 ^ 0x1F1BD7C ^ 0x1F1BD7C;
                    int cfr_ignored_3 = Integer.rotateRight(0x4FF6CC42 ^ n2, 12) + -1287627975;
                    continue block28;
                }
                case -1061266935: {
                    int cfr_ignored_4 = (Integer.rotateRight(0xCF5137FF ^ n2, 12) - 523462428) * -816760833;
                    return;
                }
                case -1061266934: {
                    int cfr_ignored_5 = Integer.rotateRight(0x706E08CB ^ n2, 17) + -1582256176;
                    n3 = n2 - 999179485 + -2051933411 - -2051933411;
                    int cfr_ignored_6 = (Integer.rotateLeft(0x74C8B6D1 ^ n2, 17) + 682345098) * 1959311057;
                    int cfr_ignored_7 = (int)(0xB67A18EC27D4EB4FL ^ (long)n2 ^ 0xCCA8831A2DB8C125L);
                    int cfr_ignored_8 = (int)(0xD70B6929B8012C1AL ^ (long)n2 ^ 0x2F23BCB1A31203C7L);
                    n3 = n2 - -1098048888;
                    int cfr_ignored_9 = (int)(0xC3D4B4234E660A61L ^ (long)n2 ^ 0x9536507FEFE42A78L);
                    n3 = n2 - -1061266936;
                    n += 3;
                    continue block28;
                }
                case -1061266933: {
                    int cfr_ignored_10 = (Integer.rotateRight(0xDCA39653 ^ n2, 14) + -1137913016) * -593258925;
                    n3 = Integer.reverse(Integer.reverse(n2 - -1026255759));
                    int cfr_ignored_11 = (Integer.rotateRight(0x6F6DBBDF ^ n2, 16) - -2102960324) * 1869462495;
                    try {
                        n += 4;
                        n3 = n2 - -1061266936 ^ 0x6105EB97 ^ 0x6105EB97;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - -1061266936 + 1880964249 - 1880964249;
                    }
                    n += 4;
                    continue block28;
                }
                case -1061266932: {
                    int cfr_ignored_12 = (Integer.rotateRight(0x957A0ADF ^ n2, 5) - 505737276) * -1787163937;
                    n3 = n2 - 116881811 + 10223308 - 10223308;
                    int cfr_ignored_13 = Integer.rotateLeft(0x1BD94981 ^ n2, 6) + 1672316378;
                    int cfr_ignored_14 = (int)(0xD96BE7BC27D4EB4FL ^ (long)n2 ^ 0x3208831A2DB81F06L);
                    n3 = n2 - -1061266936 + 1334975182 - 1334975182;
                    continue block28;
                }
                case -1061266931: {
                    int cfr_ignored_15 = Integer.rotateRight(0x35178AE3 ^ n2, 9) + 1916235960;
                    n3 = n2 - -743645414 + 1739925063 - 1739925063;
                    int cfr_ignored_16 = Integer.rotateRight(0x5A19E32F ^ n2, 14) - -310369812;
                    int cfr_ignored_17 = (int)(0x55C91967CBB150C0L ^ (long)n2 ^ 0xCFBF5BD15AA70643L);
                    n3 = n2 - 1390033250 + -1866312912 - -1866312912;
                    int cfr_ignored_18 = (int)(0x85BCE4A3F9AA377AL ^ (long)n2 ^ 0x34373FE795D2A6A8L);
                    n3 = n2 - -1061266936;
                    n -= 3;
                    continue block28;
                }
                case -1061266930: {
                    int cfr_ignored_19 = (Integer.rotateLeft(0x10685F94 ^ n2, 5) - 16855591) * 275275669;
                    n3 = n2 - 808893823 + 1995010459 - 1995010459;
                    int cfr_ignored_20 = Integer.rotateLeft(0xC94C722C ^ n2, 12) - 1688171151;
                    n3 = n2 - -1061266936 + 1472032101 - 1472032101;
                    n += 2;
                    continue block28;
                }
                case -1061266929: {
                    int cfr_ignored_21 = Integer.rotateRight(0x70CEB82E ^ n2, 17) - -1385829171;
                    n3 = n2 - 1863724237;
                    int cfr_ignored_22 = (Integer.rotateLeft(0xE65FC9B4 ^ n2, 15) - -369685497) * -429930059;
                    n3 = n2 - -1061266936;
                    ++n;
                    continue block28;
                }
                case -1061266928: {
                    int cfr_ignored_23 = (Integer.rotateLeft(0x9A99F790 ^ n2, 6) + -1123903061) * -1701185647;
                    n3 = (int)((long)(n2 - 402915249) ^ 0x9A57E08753CE7E01L ^ 0x9A57E08753CE7E01L);
                    int cfr_ignored_24 = (Integer.rotateLeft(0x90AF2511 ^ n2, 5) + -1986847670) * -1867569903;
                    int cfr_ignored_25 = (int)(0x521D8B2C27D4EB4FL ^ (long)n2 ^ 0xEB28831A2DB909EAL);
                    try {
                        n -= 2;
                        if ((0x5154CE89DAC4605BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - -1061266936));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - -1061266936;
                    }
                    n -= 4;
                    continue block28;
                }
                case -1061266927: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0x2D61BA14 ^ n2, 8) - -2093799513) * 761379349;
                    try {
                        n -= 3;
                        if ((0x46284506B5102C03L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 - -1061266936;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)(n2 - -1061266936) ^ 0xEC27F33A9DFA71FAL ^ 0xEC27F33A9DFA71FAL);
                    }
                    n -= 4;
                    continue block28;
                }
                case -1061266926: {
                    int cfr_ignored_27 = Integer.rotateLeft(0x77BD1E6C ^ n2, 17) - -2075898289;
                    int cfr_ignored_28 = (int)(0xE1797BDA141DBDA9L ^ (long)n2 ^ 0xAC4E48880746F23L);
                    n3 = (int)((long)(n2 - -854166210) ^ 0x37024D07EB851E40L ^ 0x37024D07EB851E40L);
                    int cfr_ignored_29 = (int)(0xB7EA6E285E00407DL ^ (long)n2 ^ 0x212070B37BDCC205L);
                    n3 = n2 - -1061266936;
                    continue block28;
                }
                case -1061266925: {
                    int cfr_ignored_30 = Integer.rotateLeft(0x6888B8C5 ^ n2, 16) - -1393819882;
                    int cfr_ignored_31 = (int)(0xAA3A16F827D4EB4FL ^ (long)n2 ^ 0xD080831A2DB8F9A5L);
                    try {
                        n3 = n2 - -1061266936 ^ 0x57DB4E8C ^ 0x57DB4E8C;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - -1061266936 ^ 0x7C13D107 ^ 0x7C13D107;
                    }
                    n += 4;
                    continue block28;
                }
                case -1061266924: {
                    int cfr_ignored_32 = Integer.rotateRight(0xC60BC5EF ^ n2, 11) - -3500244;
                    try {
                        n += 4;
                        if ((0x651E2FC15335091L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = n2 - -1061266936 + 109274729 - 109274729;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(n2 - -1061266936) ^ 0xF8B4D90CE0211222L ^ 0xF8B4D90CE0211222L);
                    }
                    n += 3;
                    continue block28;
                }
            }
            int cfr_ignored_33 = Integer.rotateRight(0x2A5CB8CF ^ n2, 8) - 630718540;
            n3 = n2 - -1061266936;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void zth_10(btt var1_1) {
        var4_2 = 0;
        var2_3 = -2055726554;
        var2_3 = Integer.rotateLeft(var2_3 * -870639755, 15) ^ -968529676;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 25);
        v0 = var1_1;
        var2_3 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3;
        var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10);
        while (true) {
            block52: {
                block50: {
                    block59: {
                        block57: {
                            block58: {
                                block47: {
                                    block46: {
                                        block53: {
                                            block51: {
                                                block62: {
                                                    block55: {
                                                        block56: {
                                                            block61: {
                                                                block60: {
                                                                    block45: {
                                                                        block44: {
                                                                            block54: {
                                                                                block49: {
                                                                                    block48: {
                                                                                        block63: {
                                                                                            var4_2 = Integer.rotateRight(var3_4, 10) ^ var2_3;
                                                                                            switch (var4_2 & 15) {
                                                                                                case 13: {
                                                                                                    if (var4_2 > 700968365) ** GOTO lbl17
                                                                                                    if (var4_2 == -794993955) break block44;
                                                                                                    if (var4_2 != 700968365) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block45;
lbl17:
                                                                                                    // 1 sources

                                                                                                    if (var4_2 != 809774621) {
                                                                                                        if (var4_2 == 1053433501) break;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block46;
                                                                                                }
                                                                                                case 10: {
                                                                                                    if (var4_2 == 418837162) break block47;
                                                                                                    if (var4_2 == 174337994) break block48;
                                                                                                    (Integer.rotateRight(402447798 ^ var2_3, 5) - -335775675) * 402447799;
                                                                                                    if (var4_2 != -1963995478) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block49;
                                                                                                }
                                                                                                case 6: {
                                                                                                    if (var4_2 == 1745196838) break block50;
                                                                                                    if (var4_2 != 827687862) {
                                                                                                        Integer.rotateLeft(1714804652 ^ var2_3, 15) - 1692581135;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block51;
                                                                                                }
                                                                                                case 3: {
                                                                                                    if (var4_2 != -2041428173) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block52;
                                                                                                }
                                                                                                case 2: {
                                                                                                    if (var4_2 == -1813001982) break block53;
                                                                                                    if (var4_2 == 291283810) break block54;
                                                                                                    Integer.rotateLeft(564400616 ^ var2_3, 7) + 389794387;
                                                                                                    if (var4_2 != 687834450) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block55;
                                                                                                }
                                                                                                case 8: {
                                                                                                    if (var4_2 != -1020686440) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block56;
                                                                                                }
                                                                                                case 11: {
                                                                                                    if (var4_2 == 1028724699) break block57;
                                                                                                    if (var4_2 != -18048565) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block58;
                                                                                                }
                                                                                                case 7: {
                                                                                                    if (var4_2 != 1947925239) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block59;
                                                                                                }
                                                                                                case 12: {
                                                                                                    if (var4_2 != -1056387204) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block60;
                                                                                                }
                                                                                                case 4: {
                                                                                                    if (var4_2 == -1607064332) break block61;
                                                                                                    if (var4_2 == 883223652) break block62;
                                                                                                    if (var4_2 != -678697196) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block63;
                                                                                                }
                                                                                            }
                                                                                            Integer.rotateRight(-1849706490 ^ var2_3, 5) - -1433081867;
                                                                                            if (!this.rsd_2.shzl()) {
                                                                                                try {
                                                                                                    var4_2 += 2;
                                                                                                    var3_4 = Integer.rotateLeft(var2_3 ^ -794993955, 10);
                                                                                                }
                                                                                                catch (IllegalArgumentException v1) {
                                                                                                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -794993955, 10)));
                                                                                                }
                                                                                                var4_2 -= 5;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                var4_2 -= 5;
                                                                                                if ((5961071745033678693L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -678697196, 10) ^ 6022036455846703439L ^ 6022036455846703439L);
                                                                                            }
                                                                                            catch (IllegalStateException v2) {
                                                                                                var3_4 = Integer.rotateLeft(var2_3 ^ -678697196, 10) + -1520778490 - -1520778490;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateLeft(1525511236 ^ var2_3, 14) - 119452535;
                                                                                        this.bwy(this.rsz_2.thw_5(), this.khkhd, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, dtj_2(), ()V)());
                                                                                        try {
                                                                                            var4_2 += 5;
                                                                                            if ((7645043501321176759L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                throw new NoSuchElementException();
                                                                                            }
                                                                                            var3_4 = Integer.rotateLeft(var2_3 ^ -794993955, 10);
                                                                                        }
                                                                                        catch (NoSuchElementException v3) {
                                                                                            var3_4 = Integer.rotateLeft(var2_3 ^ -794993955, 10) + -1216002973 - -1216002973;
                                                                                        }
                                                                                        --var4_2;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateRight(1537885623 ^ var2_3, 14) - 503058532) * 1537885623;
                                                                                    this.bwy(this.zdhgh.thw_5(), this.shtq_2, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, sqth_2(), ()V)());
                                                                                    try {
                                                                                        var4_2 += 5;
                                                                                        if ((-4998446548009370769L ^ (long)var2_3 | 1L) == 0L) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        var3_4 = Integer.rotateLeft(var2_3 ^ -1056387204, 10);
                                                                                    }
                                                                                    catch (IllegalStateException v4) {
                                                                                        var3_4 = Integer.rotateLeft(var2_3 ^ -1056387204, 10);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                Integer.rotateLeft(2032403333 ^ var2_3, 18) - -1346761642;
                                                                                (int)(-4929561735656576177L ^ (long)var2_3 ^ -6485039314954036484L);
                                                                                if (th.mc.field_1724 != null) {
                                                                                    (int)(-1987512778410649321L ^ (long)var2_3 ^ 2459488913480770820L);
                                                                                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 108190834, 10) ^ -4902762904225235531L ^ -4902762904225235531L);
                                                                                    (int)(-6239439134502561841L ^ (long)var2_3 ^ -2079466585974046973L);
                                                                                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1053433501, 10) ^ -5636594234657562368L ^ -5636594234657562368L);
                                                                                    --var4_2;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    var4_2 -= 5;
                                                                                    if ((-5871900384480098443L ^ (long)var2_3 | 1L) == 0L) {
                                                                                        throw new IllegalArgumentException();
                                                                                    }
                                                                                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 291283810, 10)));
                                                                                }
                                                                                catch (IllegalArgumentException v5) {
                                                                                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 291283810, 10) ^ 2380268641641518647L ^ 2380268641641518647L);
                                                                                }
                                                                                var4_2 -= 3;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateRight(2141373867 ^ var2_3, 18) + 2031324912;
                                                                            return;
                                                                        }
                                                                        (Integer.rotateLeft(2036716881 ^ var2_3, 18) + -1213041654) * 2036716881;
                                                                        (int)(-4911321164169286833L ^ (long)var2_3 ^ 840065478964075135L);
                                                                        if (!this.khbq.shzl()) {
                                                                            var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -1056387204, 10) ^ -5192042407060060731L ^ -5192042407060060731L);
                                                                            var4_2 -= 2;
                                                                            continue;
                                                                        }
                                                                        var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -1582326501, 10) ^ 7585510438011506995L ^ 7585510438011506995L);
                                                                        (Integer.rotateRight(888747478 ^ var2_3, 9) - 1854612517) * 888747479;
                                                                        var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 174337994, 10)));
                                                                        var4_2 += 3;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(-1657613422 ^ var2_3, 6) + 226835945) * -1657613421;
                                                                    return;
                                                                }
                                                                (Integer.rotateRight(-1915777 ^ var2_3, 18) - 13855388) * -1915777;
                                                                return;
                                                            }
                                                            (Integer.rotateRight(-100207373 ^ var2_3, 18) + 1261783208) * -100207373;
                                                            var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 1941652675, 10)));
                                                            (Integer.rotateRight(-1126875853 ^ var2_3, 10) + -500168600) * -1126875853;
                                                            var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10) ^ 53469937 ^ 53469937;
                                                            var4_2 += 2;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(1628325734 ^ var2_3, 15) - -988265323;
                                                        var3_4 = Integer.rotateLeft(var2_3 ^ 1174870697, 10);
                                                        (Integer.rotateLeft(-1370359727 ^ var2_3, 8) + 541765898) * -1370359727;
                                                        (int)(7846209998334257999L ^ (long)var2_3 ^ 5884097061619069975L);
                                                        var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -1963995478, 10)));
                                                        var4_2 += 5;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-855361544 ^ var2_3, 12) + -673159613) * -855361543;
                                                    var3_4 = Integer.rotateLeft(var2_3 ^ -1898301405, 10);
                                                    Integer.rotateRight(-1100722097 ^ var2_3, 10) - 310597836;
                                                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -1963995478, 10)));
                                                    continue;
                                                }
                                                (Integer.rotateLeft(1760556156 ^ var2_3, 16) - -1184089537) * 1760556157;
                                                var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -2003853597, 10)));
                                                (Integer.rotateRight(-1212993474 ^ var2_3, 9) - 1125152445) * -1212993473;
                                                try {
                                                    var4_2 -= 4;
                                                    if ((6996745642654416887L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10) + -662323144 - -662323144;
                                                }
                                                catch (ArithmeticException v6) {
                                                    var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10) + -1324624400 - -1324624400;
                                                }
                                                var4_2 -= 4;
                                                continue;
                                            }
                                            Integer.rotateLeft(572111816 ^ var2_3, 7) + 628841587;
                                            var3_4 = Integer.rotateLeft(var2_3 ^ 1350583104, 10) ^ -621903883 ^ -621903883;
                                            (Integer.rotateRight(195656799 ^ var2_3, 4) - 1843637948) * 195656799;
                                            var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10) + -551582984 - -551582984;
                                            continue;
                                        }
                                        (Integer.rotateLeft(1575076604 ^ var2_3, 14) - 1655978943) * 1575076605;
                                        var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10);
                                        ++var4_2;
                                        continue;
                                    }
                                    Integer.rotateRight(984884046 ^ var2_3, 10) - 539878829;
                                    var3_4 = Integer.rotateLeft(var2_3 ^ -452935934, 10) ^ -1018190749 ^ -1018190749;
                                    (Integer.rotateLeft(-238262888 ^ var2_3, 17) + 1277029539) * -238262887;
                                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -1963995478, 10) ^ 4072338815505773162L ^ 4072338815505773162L);
                                    Integer.rotateLeft(-58914292 ^ var2_3, 18) - -1753098577;
                                    --var4_2;
                                    continue;
                                }
                                Integer.rotateLeft(-1426908927 ^ var2_3, 8) + -1211259302;
                                (int)(7512487122424884047L ^ (long)var2_3 ^ -7851881801860940462L);
                                (int)(2732723972378726783L ^ (long)var2_3 ^ -2989799595210840568L);
                                var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 1067254764, 10)));
                                (int)(3001415900085780260L ^ (long)var2_3 ^ -6140927373393002849L);
                                var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10) + -1777980155 - -1777980155;
                                var4_2 -= 3;
                                continue;
                            }
                            Integer.rotateLeft(1611972004 ^ var2_3, 15) - -1495230953;
                            var3_4 = Integer.rotateLeft(var2_3 ^ 570968091, 10);
                            Integer.rotateRight(-113623806 ^ var2_3, 18) + 845873785;
                            (int)(4774738641862574559L ^ (long)var2_3 ^ 8326675956594452823L);
                            var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10);
                            var4_2 -= 2;
                            continue;
                        }
                        Integer.rotateRight(-2118172086 ^ var2_3, 3) + -1165580751;
                        var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10) ^ 1430320604 ^ 1430320604;
                        Integer.rotateLeft(-1389214495 ^ var2_3, 8) + -42731910;
                        (int)(8034679966510934863L ^ (long)var2_3 ^ 2938742905318765264L);
                        var4_2 += 5;
                        continue;
                    }
                    Integer.rotateLeft(1116330372 ^ var2_3, 11) - 319747639;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -1238228582, 10) ^ 1106806480 ^ 1106806480;
                    (Integer.rotateRight(-1266668302 ^ var2_3, 9) + -538767223) * -1266668301;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -185335897, 10) ^ -2091175431 ^ -2091175431;
                    Integer.rotateRight(-14225330 ^ var2_3, 18) - -367740755;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10);
                    var4_2 -= 4;
                    continue;
                }
                Integer.rotateLeft(460741120 ^ var2_3, 6) + 1471317307;
                var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 140094062, 10)));
                (Integer.rotateRight(1136638710 ^ var2_3, 11) - 949306117) * 1136638711;
                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -1963995478, 10) ^ -8373349290392778064L ^ -8373349290392778064L);
                Integer.rotateLeft(1361105537 ^ var2_3, 13) + -682156838;
                (int)(-7813045255970428081L ^ (long)var2_3 ^ 290626324424854261L);
                var4_2 -= 5;
                continue;
            }
            Integer.rotateRight(-699237334 ^ var2_3, 13) + -128276399;
            var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10);
            Integer.rotateLeft(1033240332 ^ var2_3, 10) - 2038923695;
            var4_2 += 2;
            continue;
lbl305:
            // 12 sources

            (Integer.rotateLeft(1895248017 ^ var2_3, 17) + -1303609142) * 1895248017;
            (int)(-5600896099325514929L ^ (long)var2_3 ^ -4600282870899488422L);
            var3_4 = Integer.rotateLeft(var2_3 ^ -1963995478, 10) ^ -1739071629 ^ -1739071629;
        }
    }

    private static void sqth_2() {
        int n = 928652559;
        int n2 = (n = Integer.rotateLeft(n * -556394967, 13) ^ 0xE094F5E8) ^ 0x6D253DCC;
        if ((n2 ^ n) != 1831157196) {
            int cfr_ignored_0 = (0x5A7F20C3 ^ n) - 641940664;
        }
        ((MinecraftClientAccessor)mc).invokeDoItemUse();
    }

    private static void dtj_2() {
        int n = -1525272628;
        int n2 = (n = Integer.rotateLeft(n * -1081075937, 15) ^ 0xAB502922) ^ 0xDCD7CF40;
        if ((n2 ^ n) != -589836480) {
            int cfr_ignored_0 = (0x79C1E08C ^ n) - -970352571;
        }
        ((MinecraftClientAccessor)mc).invokeDoAttack();
    }

    private boolean khdhm() {
        int n = -662716222;
        int n2 = (n = Integer.rotateLeft(n * -1485958933, 16) ^ 0xA6600064) ^ 0x20646853;
        if ((n2 ^ n) != 543451219) {
            int cfr_ignored_0 = (0xF81BA891 ^ n) + -1018057867;
        }
        return !this.khbq.shzl();
    }

    private boolean dt_4() {
        int n = 205881068;
        n = Integer.rotateLeft(n * -1752994881, 18) ^ 0xE6C4196E;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE4282BD2;
        if ((n2 ^ n) != -467129390) {
            int cfr_ignored_0 = (0xE86D553E ^ n) - 938087146;
        }
        return !this.rsd_2.shzl();
    }

    private static String jzgh_2(String string, int n, int n2, int n3) {
        try {
            int n4 = 46008516;
            n4 = Integer.rotateLeft(n4 * 1288403065, 4) ^ 0x43F41FE9;
            n4 = Integer.rotateRight(n2 ^ n4, 6);
            int n5 = n4 ^ 0x18A0B707;
            if ((n5 ^ n4) != 413185799) {
                int cfr_ignored_0 = (0x1A1EBFC3 ^ n4) - -1072221032;
            }
            if ((0x393 & 0) != 0) {
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
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xBF2D5520) + n2 ^ i * 1077628667) ^ rghy) + bfd_2);
        }
        return new String(cArray);
    }

    private static int sqb_2(int n, int n2) {
        block0: {
            int n3 = byh_2.thzth(-1789831960);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 29)) ^ 0x98B9DA14;
            if ((n4 ^ n3) == -1732650476) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xDE88EFC ^ n3, 4) - -1283002433) * 233344765;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String[] aam_2(String string) {
        int n = 543857900;
        n = Integer.rotateLeft(n * -918216053, 27) ^ 0x7FB7F5C3;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xCD4629C4;
        if ((n2 ^ n) != -851039804) {
            int cfr_ignored_0 = (0xED2CB528 ^ n) + 1027739760;
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

    private static CallSite jzs_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1938149481;
            n3 = Integer.rotateLeft(n3 * -1358471331, 9) ^ 0x75BBBB2E;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 5);
            int n4 = n3 ^ 0x7173EE14;
            if ((n4 ^ n3) != 1903422996) {
                int cfr_ignored_0 = (0xFD09C183 ^ n3) - -1181195008;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ddhdh ^ string.hashCode() ^ n2 + tnr ^ i * 653445907 ^ ddhdh, 15) ^ tnr));
            }
            String[] stringArray = th.aam_2(new String(cArray));
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

    private static String[] pwz7pytm2u(String string) {
        return string.split("\u0005\u001a", -1);
    }

    private static CallSite wbfxm6doo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ wx8nqgccrf ^ string.hashCode()) + (n2 + c5f2wrcv) + i ^ wx8nqgccrf, 11) + c5f2wrcv);
            }
            String[] stringArray = th.pwz7pytm2u(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

