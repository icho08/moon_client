/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1661
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1829
 *  net.minecraft.class_2596
 *  net.minecraft.class_2886
 *  net.minecraft.class_7204
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1268;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1829;
import net.minecraft.class_2596;
import net.minecraft.class_2886;
import net.minecraft.class_7204;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bjd_2;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.brk;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bfn;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhk_2;
import us.m0vy.moondlc.m0vyguard.bwa;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zsh_8;
import us.m0vy.moondlc.m0vyguard.yf;
import us.m0vy.moondlc.m0vyguard.yn;
import us.movy.moondlc.mixin.accessors.ClientPlayerInteractionManagerAccessor;

@tq_2(name="Upward Pearl", category=bzw.OTHER, desc="Throws a pearl and wind charge upward in sequence")
public class bws
extends bnq {
    private static final float tls_2 = -89.5f;
    private static final float skhl_2 = 89.5f;
    private final bdh_3 zbt_2 = new bdh_3(this, "Execute Key");
    private final bdh_3 sas_5 = new bdh_3(this, "Jump Execute Key");
    private final tay mh = new tay(this, "Wind Delay").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x2D779EBA ^ 0xDF79EBA, 1))).rkh_3(1.0f).ssd_5(2.0f);
    private final tay tfk = new tay(this, "Hop Height").shth_7(Float.intBitsToFloat(-2037798178 - 1203559953)).dhbs_2(Float.intBitsToFloat(-499721835 + 1575560811)).rkh_3(Float.intBitsToFloat(0x14D39D4E ^ 0x299F5183)).ssd_5(1.0f);
    private final tay tzkh = new tay(this, "Hop Timeout").shth_7(2.0f).dhbs_2(Float.intBitsToFloat(-335241644 - -1436246444)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(1287547955 - 197028915));
    private brk tqkh = brk.khtn_2;
    private zsh_8 dhdhz;
    private zsh_8 khlgh;
    private boolean dhhf_2;
    private boolean khshj;
    private boolean sht_4;
    private boolean shaj_2;
    private boolean bshz_2;
    private boolean zjkh;
    private int dtt_4 = -1;
    private int thghz_2;
    private int shtth;
    private double ak;
    private float bghj;
    private float dkw;
    private final bql<btt> k_2 = this::tyy;
    private final bql<bjd_2> dhzh_4 = this::srz_3;
    private static final int skhh_2 = 95327083;
    private static final int sdhth = -725968595;
    private static final int thqm = -1866489695;
    private static final int zty_2 = -345989216;
    private static final int dp9249lemlf75 = 468314171;
    private static final int yfy6qlh5mjr = 433830017;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int i7r673ycdnbu;

    /*
     * Unable to fully structure code
     */
    @Override
    public void nt() {
        var3_1 = 0;
        var1_2 = -1872470439;
        var1_2 = Integer.rotateLeft(var1_2 * 1410516917, 15) ^ -2005554309;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -2131149239 ^ 1048537385) + 1048537385));
        while (true) {
            block24: {
                block23: {
                    block29: {
                        block33: {
                            block27: {
                                block34: {
                                    block26: {
                                        block31: {
                                            block28: {
                                                block30: {
                                                    block25: {
                                                        block32: {
                                                            var3_1 = var2_3 - 1048537385 ^ 1048537385 ^ var1_2;
                                                            switch (var3_1 & 7) {
                                                                case 0: {
                                                                    if (var3_1 == -1651889112) break;
                                                                    if (var3_1 != 116185152) {
                                                                        (Integer.rotateLeft(-296136943 ^ var1_2, 16) + -517066166) * -296136943;
                                                                        (int)(3236928336958909263L ^ (long)var1_2 ^ 4551031571917435910L);
                                                                        ** break;
                                                                    }
                                                                    break block23;
                                                                }
                                                                case 1: {
                                                                    if (var3_1 == -1591150359) break block24;
                                                                    if (var3_1 == -2131149239) break block25;
                                                                    if (var3_1 != -993179343) {
                                                                        ** break;
                                                                    }
                                                                    break block26;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 == -1512951124) break block27;
                                                                    if (var3_1 == 219517996) break block28;
                                                                    if (var3_1 == 1906286572) break block29;
                                                                    if (var3_1 != -7749036) {
                                                                        ** break;
                                                                    }
                                                                    break block30;
                                                                }
                                                                case 5: {
                                                                    if (var3_1 == 379311053) break block31;
                                                                    if (var3_1 != 1209354741) {
                                                                        (Integer.rotateLeft(1242255385 ^ var1_2, 12) + -71544254) * 1242255385;
                                                                        (int)(-8594558982619337905L ^ (long)var1_2 ^ 87964341193194658L);
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 6: {
                                                                    if (var3_1 == 1406101326) break block33;
                                                                    if (var3_1 != -1806275194) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                            }
                                                            Integer.rotateLeft(330525197 ^ var1_2, 5) - 1729590990;
                                                            (int)(-3386209733700162737L ^ (long)var1_2 ^ 8435386250524364754L);
                                                            bws.zshy_2();
                                                            throw null;
                                                        }
                                                        Integer.rotateRight(-780799473 ^ var1_2, 13) - 1638264588;
                                                        this.bshz_2 = false;
                                                        this.zjkh = false;
                                                        bws.day_4(this);
                                                        return;
                                                    }
                                                    (Integer.rotateRight(-1803425774 ^ var1_2, 5) + 1620329) * -1803425773;
                                                    if (yf.khdha_2()) {
                                                        (int)(5913333050305726035L ^ (long)var1_2 ^ 4564592468535871985L);
                                                        var2_3 = (int)((long)((var1_2 ^ 455001566 ^ 1048537385) + 1048537385) ^ 7506813709429598116L ^ 7506813709429598116L);
                                                        (int)(8498063974838391317L ^ (long)var1_2 ^ -7123875331008805361L);
                                                        var2_3 = (var1_2 ^ 1209354741 ^ 1048537385) + 1048537385;
                                                        ++var3_1;
                                                        continue;
                                                    }
                                                    var2_3 = (var1_2 ^ -1651889112 ^ 1048537385) + 1048537385 ^ 1768303892 ^ 1768303892;
                                                    (Integer.rotateLeft(79048253 ^ var1_2, 3) - -1771226978) * 79048253;
                                                    (int)(-4178073816136357041L ^ (long)var1_2 ^ -184503436262759976L);
                                                    continue;
                                                }
                                                Integer.rotateLeft(581226857 ^ var1_2, 7) + 911407858;
                                                (int)(-2299510560303813809L ^ (long)var1_2 ^ 277115525542735357L);
                                                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1954555694 ^ 1048537385) + 1048537385));
                                                (Integer.rotateLeft(259319353 ^ var1_2, 4) + -477790174) * 259319353;
                                                (int)(-3619126067860280497L ^ (long)var1_2 ^ 7888198895798859357L);
                                                try {
                                                    var3_1 -= 3;
                                                    if ((-5501723751250327269L ^ (long)var1_2 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385 + -83130207 - -83130207;
                                                }
                                                catch (NoSuchElementException v0) {
                                                    var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385 ^ 2116583831 ^ 2116583831;
                                                }
                                                var3_1 -= 4;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-1401809739 ^ var1_2, 8) - -433184474) * -1401809739;
                                            (int)(7980583633647102799L ^ (long)var1_2 ^ -8619745538327613360L);
                                            var2_3 = (int)((long)((var1_2 ^ -1270217835 ^ 1048537385) + 1048537385) ^ 3005082328991128447L ^ 3005082328991128447L);
                                            Integer.rotateLeft(-1015049340 ^ var1_2, 11) - -1328513993;
                                            (int)(-3018871286540418924L ^ (long)var1_2 ^ 6660457644837175780L);
                                            var2_3 = (var1_2 ^ 2048570290 ^ 1048537385) + 1048537385;
                                            (int)(5094547469548928770L ^ (long)var1_2 ^ 1345493387828207799L);
                                            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -2131149239 ^ 1048537385) + 1048537385));
                                            var3_1 += 4;
                                            continue;
                                        }
                                        Integer.rotateLeft(2122192041 ^ var1_2, 18) + 1436688306;
                                        (int)(-4842290353843934385L ^ (long)var1_2 ^ -8621997338141338552L);
                                        var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385 + -618873840 - -618873840;
                                        Integer.rotateLeft(485326765 ^ var1_2, 6) - -2061494994;
                                        (int)(-2422987657428276401L ^ (long)var1_2 ^ 6796075986161504622L);
                                        --var3_1;
                                        continue;
                                    }
                                    Integer.rotateRight(1103773958 ^ var1_2, 11) - -69501195;
                                    var2_3 = (var1_2 ^ -1122770496 ^ 1048537385) + 1048537385 + -69186932 - -69186932;
                                    (Integer.rotateRight(1888111386 ^ var1_2, 17) + -1524844703) * 1888111387;
                                    (int)(-7811149482045697647L ^ (long)var1_2 ^ -8310237719535777053L);
                                    var2_3 = (var1_2 ^ -1529857722 ^ 1048537385) + 1048537385;
                                    (int)(-7012309273216346246L ^ (long)var1_2 ^ 8560244710735777935L);
                                    var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385;
                                    var3_1 += 4;
                                    continue;
                                }
                                Integer.rotateLeft(-348404284 ^ var1_2, 16) - -2137353737;
                                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -957798232 ^ 1048537385) + 1048537385));
                                Integer.rotateRight(1593676014 ^ var1_2, 14) - -2062406643;
                                var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385 + -55337765 - -55337765;
                                Integer.rotateRight(1040451406 ^ var1_2, 10) - -2032500307;
                                continue;
                            }
                            (Integer.rotateLeft(1763437436 ^ var1_2, 16) - -1094769857) * 1763437437;
                            try {
                                if ((-8305943336535053237L ^ (long)var1_2 | 1L) == 0L) {
                                    throw new ArithmeticException();
                                }
                                var2_3 = (int)((long)((var1_2 ^ -2131149239 ^ 1048537385) + 1048537385) ^ 8754768104656387039L ^ 8754768104656387039L);
                            }
                            catch (ArithmeticException v1) {
                                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -2131149239 ^ 1048537385) + 1048537385));
                            }
                            var3_1 += 5;
                            continue;
                        }
                        (Integer.rotateRight(-2118970822 ^ var1_2, 3) + -1190341567) * -2118970821;
                        var2_3 = (var1_2 ^ 1279740080 ^ 1048537385) + 1048537385 ^ 96644078 ^ 96644078;
                        Integer.rotateRight(-302102069 ^ var1_2, 16) + -701985072;
                        var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385 + -2088978444 - -2088978444;
                        (Integer.rotateLeft(-841194343 ^ var1_2, 12) + -233976382) * -841194343;
                        (int)(1112048964398803791L ^ (long)var1_2 ^ 7509896527099835148L);
                        continue;
                    }
                    (Integer.rotateLeft(1570407348 ^ var1_2, 14) - 1511232007) * 1570407349;
                    var2_3 = (int)((long)((var1_2 ^ -879936480 ^ 1048537385) + 1048537385) ^ -3147075755573868068L ^ -3147075755573868068L);
                    (Integer.rotateLeft(-1108461963 ^ var1_2, 10) - 70661990) * -1108461963;
                    (int)(9177377576347560783L ^ (long)var1_2 ^ -3611742752691629208L);
                    var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -2131149239 ^ 1048537385) + 1048537385));
                    --var3_1;
                    continue;
                }
                Integer.rotateLeft(2096808581 ^ var1_2, 18) - 649801046;
                (int)(-4735415469982028977L ^ (long)var1_2 ^ 2594217533824880961L);
                try {
                    var3_1 += 4;
                    if ((-1969770526333354137L ^ (long)var1_2 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385 ^ -259877396 ^ -259877396;
                }
                catch (ArithmeticException v2) {
                    var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -2131149239 ^ 1048537385) + 1048537385));
                }
                continue;
            }
            Integer.rotateRight(-2047840185 ^ var1_2, 3) - 1014708180;
            var2_3 = (int)((long)((var1_2 ^ -494306640 ^ 1048537385) + 1048537385) ^ 6769721298329122220L ^ 6769721298329122220L);
            Integer.rotateRight(495227234 ^ var1_2, 6) + -1754580455;
            var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385 + 825199289 - 825199289;
            (Integer.rotateLeft(-998640744 ^ var1_2, 11) + -819847517) * -998640743;
            continue;
lbl207:
            // 6 sources

            (Integer.rotateRight(2146472638 ^ var1_2, 18) - -2105580483) * 2146472639;
            var2_3 = (var1_2 ^ -2131149239 ^ 1048537385) + 1048537385 + 1449267124 - 1449267124;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = 626026565;
        var1_2 = Integer.rotateLeft(var1_2 * 1578017689, 24) ^ -1431005526;
        var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 ^ 1569984874 ^ 1569984874;
        while (true) {
            block35: {
                block37: {
                    block40: {
                        block30: {
                            block33: {
                                block36: {
                                    block38: {
                                        block31: {
                                            block41: {
                                                block39: {
                                                    block34: {
                                                        block32: {
                                                            var3_1 = var2_3 - -2055502807 ^ -2055502807 ^ var1_2;
                                                            switch (var3_1 & 7) {
                                                                case 7: {
                                                                    if (var3_1 != 544984975) {
                                                                        ** break;
                                                                    }
                                                                    break block30;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 == -1849301028) break block31;
                                                                    if (var3_1 != -1393111004) {
                                                                        Integer.rotateLeft(-1366014776 ^ var1_2, 8) + 676459379;
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 3: {
                                                                    if (var3_1 == 1647973067) break block33;
                                                                    if (var3_1 != -634206965) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                                case 2: {
                                                                    if (var3_1 == -476059070) break block35;
                                                                    if (var3_1 != 1334145666) {
                                                                        Integer.rotateRight(-2006134162 ^ var1_2, 4) - -1987372403;
                                                                        if (var3_1 == 1866640850) break;
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 6: {
                                                                    if (var3_1 == -169258074) break block37;
                                                                    if (var3_1 == -1474545786) break block38;
                                                                    Integer.rotateLeft(-1015588435 ^ var1_2, 11) - -1345225938;
                                                                    (int)(127780362965543759L ^ (long)var1_2 ^ 1319698839279087194L);
                                                                    if (var3_1 == -467625522) break block39;
                                                                    if (var3_1 != 184222174) {
                                                                        ** break;
                                                                    }
                                                                    break block40;
                                                                }
                                                                case 1: {
                                                                    if (var3_1 != 872619017) {
                                                                        ** break;
                                                                    }
                                                                    break block41;
                                                                }
                                                            }
                                                            Integer.rotateLeft(-1485825660 ^ var1_2, 7) - 1257289271;
                                                            bws.thghw();
                                                            throw null;
                                                        }
                                                        Integer.rotateLeft(1218607812 ^ var1_2, 12) - -804619017;
                                                        if (bws.skdh()) {
                                                            var2_3 = (var1_2 ^ -634206965 ^ -2055502807) + -2055502807 ^ 2126339568 ^ 2126339568;
                                                            var3_1 += 3;
                                                            continue;
                                                        }
                                                        var2_3 = (var1_2 ^ 951907924 ^ -2055502807) + -2055502807 + 71052442 - 71052442;
                                                        (Integer.rotateRight(-515834217 ^ var1_2, 15) - 1262252932) * -515834217;
                                                        var2_3 = (var1_2 ^ 1866640850 ^ -2055502807) + -2055502807 + 46713935 - 46713935;
                                                        var3_1 -= 4;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1321062160 ^ var1_2, 12) + -1923501525) * 1321062161;
                                                    bws.dts_7(this);
                                                    this.bshz_2 = false;
                                                    this.zjkh = false;
                                                    return;
                                                }
                                                Integer.rotateRight(1889073990 ^ var1_2, 17) - -1495003979;
                                                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1713985968 ^ -2055502807) + -2055502807));
                                                Integer.rotateLeft(-932762304 ^ var1_2, 12) + 1222384123;
                                                try {
                                                    var3_1 += 5;
                                                    if ((8254706913352406613L ^ (long)var1_2 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1393111004 ^ -2055502807) + -2055502807));
                                                }
                                                catch (ArithmeticException v0) {
                                                    var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 ^ 1940985824 ^ 1940985824;
                                                }
                                                var3_1 -= 2;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-1797182436 ^ var1_2, 5) - 195163807) * -1797182435;
                                            try {
                                                var3_1 -= 3;
                                                if ((-4896933758863572673L ^ (long)var1_2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 + -979814385 - -979814385;
                                            }
                                            catch (NoSuchElementException v1) {
                                                var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 + -1119093210 - -1119093210;
                                            }
                                            var3_1 += 5;
                                            continue;
                                        }
                                        (Integer.rotateRight(1655634643 ^ var1_2, 15) + -141689144) * 1655634643;
                                        try {
                                            if ((-8303176581663896281L ^ (long)var1_2 | 1L) == 0L) {
                                                throw new ArithmeticException();
                                            }
                                            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1393111004 ^ -2055502807) + -2055502807));
                                        }
                                        catch (ArithmeticException v2) {
                                            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1393111004 ^ -2055502807) + -2055502807));
                                        }
                                        continue;
                                    }
                                    Integer.rotateLeft(1882109344 ^ var1_2, 17) + -1710908005;
                                    var2_3 = (var1_2 ^ 1619472858 ^ -2055502807) + -2055502807 ^ 1338098967 ^ 1338098967;
                                    (Integer.rotateLeft(233106524 ^ var1_2, 4) - -1290387873) * 233106525;
                                    var2_3 = (var1_2 ^ 1404331725 ^ -2055502807) + -2055502807 ^ 487696407 ^ 487696407;
                                    Integer.rotateLeft(289389312 ^ var1_2, 5) + 454378555;
                                    var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 + -1203662901 - -1203662901;
                                    var3_1 += 4;
                                    continue;
                                }
                                (Integer.rotateRight(-1131352005 ^ var1_2, 10) + -638929312) * -1131352005;
                                var2_3 = (var1_2 ^ 1850818754 ^ -2055502807) + -2055502807 ^ -194423160 ^ -194423160;
                                (Integer.rotateRight(1297463478 ^ var1_2, 12) - 1639906629) * 1297463479;
                                var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 ^ -32820671 ^ -32820671;
                                (Integer.rotateLeft(-1485940588 ^ var1_2, 7) - 1253726503) * -1485940587;
                                var3_1 -= 5;
                                continue;
                            }
                            Integer.rotateLeft(-1800394584 ^ var1_2, 5) + 95587219;
                            var2_3 = (var1_2 ^ -2101877443 ^ -2055502807) + -2055502807 ^ -986518670 ^ -986518670;
                            Integer.rotateRight(2028352007 ^ var1_2, 18) - -1472352748;
                            var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 + -1054833246 - -1054833246;
                            var3_1 -= 4;
                            continue;
                        }
                        (Integer.rotateRight(-1013157446 ^ var1_2, 11) + -1269865279) * -1013157445;
                        var2_3 = (var1_2 ^ -629231905 ^ -2055502807) + -2055502807;
                        (Integer.rotateLeft(672550968 ^ var1_2, 8) + -552511997) * 672550969;
                        var2_3 = (var1_2 ^ -536825256 ^ -2055502807) + -2055502807 ^ -794679322 ^ -794679322;
                        (Integer.rotateLeft(-937425739 ^ var1_2, 12) - 1077817638) * -937425739;
                        (int)(761858788739574607L ^ (long)var1_2 ^ -6313902529113900812L);
                        var2_3 = (int)((long)((var1_2 ^ -1393111004 ^ -2055502807) + -2055502807) ^ 8311737386915208225L ^ 8311737386915208225L);
                        continue;
                    }
                    (Integer.rotateRight(1498782942 ^ var1_2, 14) - -709124579) * 1498782943;
                    try {
                        var3_1 -= 5;
                        var2_3 = (int)((long)((var1_2 ^ -1393111004 ^ -2055502807) + -2055502807) ^ 3949062563953823778L ^ 3949062563953823778L);
                    }
                    catch (IllegalStateException v3) {
                        var2_3 = (int)((long)((var1_2 ^ -1393111004 ^ -2055502807) + -2055502807) ^ 3980188000045680578L ^ 3980188000045680578L);
                    }
                    --var3_1;
                    continue;
                }
                (Integer.rotateLeft(-1072110543 ^ var1_2, 11) + 1197556010) * -1072110543;
                (int)(192047350184995663L ^ (long)var1_2 ^ 7595464920019871877L);
                var2_3 = (var1_2 ^ -2079320109 ^ -2055502807) + -2055502807 + -1162966832 - -1162966832;
                Integer.rotateLeft(-1554258719 ^ var1_2, 7) + -864135558;
                (int)(7055252600674118479L ^ (long)var1_2 ^ 7550428923746151939L);
                try {
                    if ((6796112264913543651L ^ (long)var1_2 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 + -1392455509 - -1392455509;
                }
                catch (NoSuchElementException v4) {
                    var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807 ^ -968279327 ^ -968279327;
                }
                continue;
            }
            (Integer.rotateRight(-2102403149 ^ var1_2, 3) + -676743704) * -2102403149;
            var2_3 = (int)((long)((var1_2 ^ -1075928292 ^ -2055502807) + -2055502807) ^ -8608682457990154856L ^ -8608682457990154856L);
            (Integer.rotateRight(0xB77B7E ^ var1_2, 3) - 446010237) * 0xB77B7F;
            var2_3 = (var1_2 ^ -1393111004 ^ -2055502807) + -2055502807;
            --var3_1;
            continue;
lbl194:
            // 7 sources

            (Integer.rotateLeft(583670832 ^ var1_2, 7) + 987171083) * 583670833;
            var2_3 = (int)((long)((var1_2 ^ -1393111004 ^ -2055502807) + -2055502807) ^ 465102831533545914L ^ 465102831533545914L);
        }
    }

    private void jkb(boolean bl) {
        int n = bwa.atj(964566543);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0x931C977E;
        if ((n2 ^ n) != -1826842754) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xAA628971 ^ n, 8) + -1504951318) * -1436382863;
            int cfr_ignored_1 = (int)(0x68D0274C27D4EB4FL ^ (long)n ^ 0xB3E8831A2DB97C71L);
        }
        boolean[] blArray = new boolean[-348395783 + 348395792];
        int n3 = bws.taa(this, class_1802.field_8634);
        int n4 = this.sab(class_1802.field_49098);
        if (n3 != -1) {
            blArray[n3] = true;
        }
        if (n4 != -1) {
            blArray[n4] = true;
        }
        zsh_8 zsh2_2 = this.tlq_2(class_1802.field_8634, n3, blArray);
        zsh_8 zsh3_2 = bws.dhjl(this, class_1802.field_49098, n4, blArray);
        if (zsh2_2 == null || zsh3_2 == null) {
            bws.hhl(this);
            return;
        }
        this.dhdhz = zsh2_2;
        this.khlgh = zsh3_2;
        this.dtt_4 = bws.mc.field_1724.method_31548().field_7545;
        this.shaj_2 = bl;
        this.tqkh = brk.jbd;
    }

    private brk dhan() {
        int n = 1360834301;
        n = Integer.rotateLeft(n * 110406709, 4) ^ 0x8F15313C;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0x6E1B8769;
        if ((n2 ^ n) != 1847297897) {
            int cfr_ignored_0 = (0x3F072994 ^ n) + -901526616;
        }
        return this.shaj_2 ? brk.khhh : brk.tkhk;
    }

    private void tsha_3() {
        if (this.tqkh == brk.zdd_2) {
            boolean bl;
            ++this.shtth;
            double d = bws.mc.field_1724.method_23318() - this.ak;
            boolean bl2 = this.shtth >= Math.round(this.tzkh.thw_5());
            boolean bl3 = bl = d >= (double)this.tfk.thw_5() && bws.mc.field_1724.method_18798().field_1351 <= 0.08;
            if (bl2 || bl) {
                this.tqkh = brk.tkhk;
            }
        } else if (this.tqkh == brk.dyd && --this.thghz_2 <= 0) {
            this.tqkh = brk.raq;
        }
    }

    private void dwk() {
        try {
            int n = 2129354979;
            n = Integer.rotateLeft(n * 2012178661, 12) ^ 0xA68009DC;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4B276B4E;
            if ((n2 ^ n) != 1260874574) {
                int cfr_ignored_0 = (0x35CC0BAD ^ n) - 756008866;
            }
            if ((0x7C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.sht_4 = false;
        if (this.tqkh == brk.dkhkh) {
            if (!bws.mc.field_1724.method_24828()) {
                this.tqkh = brk.tkhk;
                return;
            }
            this.ak = bws.mc.field_1724.method_23318();
            bws.mc.field_1724.method_6043();
            this.zdf(Float.intBitsToFloat(0xE07144F3 ^ 0xA2C244F3));
        } else if (this.tqkh == brk.bbz || this.tqkh == brk.shzth_2) {
            bws.shzth_2(this, Float.intBitsToFloat(1029965959 - 2058422407));
        }
    }

    private void zdf(float f) {
        int n = 2106394890;
        n = Integer.rotateLeft(n * -2114554673, 4) ^ 0x3D839457;
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xEE50832A;
        if ((n2 ^ n) != -296713430) {
            int cfr_ignored_0 = (0x93DD8A20 ^ n) - 1723786870;
        }
        this.bghj = bws.mc.field_1724.method_36454();
        this.dkw = f;
        btj_2.sdd_3(this.bghj, this.dkw);
        this.sht_4 = true;
    }

    /*
     * Unable to fully structure code
     */
    private boolean dhtt(zsh_8 var1_1, class_1792 var2_2) {
        var3_3 = false;
        var6_4 = 0;
        var4_5 = -1925071649;
        var4_5 = Integer.rotateLeft(var4_5 * -1132723823, 11) ^ -2096128753;
        var4_5 = System.identityHashCode(this) ^ var4_5;
        v0 = var1_1;
        var4_5 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var4_5;
        var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ 1833615409, 7)));
        while (true) {
            block39: {
                block46: {
                    block43: {
                        block37: {
                            block41: {
                                block42: {
                                    block44: {
                                        block47: {
                                            block40: {
                                                block45: {
                                                    block49: {
                                                        block48: {
                                                            block38: {
                                                                block50: {
                                                                    var6_4 = Integer.rotateRight(var5_6, 7) ^ var4_5;
                                                                    switch (var6_4 & 7) {
                                                                        case 6: {
                                                                            if (var6_4 == -1782846658) break block37;
                                                                            if (var6_4 != -1840878634) {
                                                                                (Integer.rotateRight(-190776297 ^ var4_5, 17) - -1545853436) * -190776297;
                                                                                ** break;
                                                                            }
                                                                            break block38;
                                                                        }
                                                                        case 4: {
                                                                            if (var6_4 == -694228636) break block39;
                                                                            if (var6_4 != -380605084) {
                                                                                Integer.rotateLeft(-377813659 ^ var4_5, 16) - 1245922934;
                                                                                (int)(3155241409063480143L ^ (long)var4_5 ^ -6070708149235877310L);
                                                                                ** break;
                                                                            }
                                                                            break block40;
                                                                        }
                                                                        case 0: {
                                                                            if (var6_4 == 332864672) break block41;
                                                                            if (var6_4 != 918410072) {
                                                                                (Integer.rotateRight(-1144533674 ^ var4_5, 10) - -1047561051) * -1144533673;
                                                                                ** break;
                                                                            }
                                                                            break block42;
                                                                        }
                                                                        case 3: {
                                                                            if (var6_4 == -460385101) break;
                                                                            if (var6_4 != 230584019) {
                                                                                ** break;
                                                                            }
                                                                            break block43;
                                                                        }
                                                                        case 2: {
                                                                            if (var6_4 == 192057410) break block44;
                                                                            if (var6_4 != 1622268498) {
                                                                                Integer.rotateLeft(1734463628 ^ var4_5, 15) - -1992957905;
                                                                                ** break;
                                                                            }
                                                                            break block45;
                                                                        }
                                                                        case 1: {
                                                                            if (var6_4 == 1607714025) break block46;
                                                                            if (var6_4 == 1803686433) break block47;
                                                                            if (var6_4 != 1833615409) {
                                                                                ** break;
                                                                            }
                                                                            break block48;
                                                                        }
                                                                        case 7: {
                                                                            if (var6_4 == -1855253881) break block49;
                                                                            if (var6_4 != -1166307129) {
                                                                                (Integer.rotateLeft(1505261232 ^ var4_5, 14) + -508297589) * 1505261233;
                                                                                ** break;
                                                                            }
                                                                            break block50;
                                                                        }
                                                                    }
                                                                    (Integer.rotateLeft(809405272 ^ var4_5, 9) + -604995869) * 809405273;
                                                                    if (!bws.tyh_3(bws.shql(bws.mc.field_1724.method_31548(), var1_1.slot()), var2_2)) {
                                                                        var5_6 = Integer.rotateLeft(var4_5 ^ -158187203, 7) + -1929833108 - -1929833108;
                                                                        Integer.rotateLeft(-1288948063 ^ var4_5, 9) + -1229439814;
                                                                        (int)(8187148969056725839L ^ (long)var4_5 ^ -3726584543189578004L);
                                                                        var5_6 = Integer.rotateLeft(var4_5 ^ -1166307129, 7);
                                                                        var6_4 -= 5;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        var6_4 -= 4;
                                                                        if ((-4297097090057389315L ^ (long)var4_5 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -1840878634, 7) ^ 2199281583677516280L ^ 2199281583677516280L);
                                                                    }
                                                                    catch (IllegalStateException v1) {
                                                                        var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -1840878634, 7)));
                                                                    }
                                                                    var6_4 -= 4;
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(2106040650 ^ var4_5, 18) + 935995185;
                                                                this.dhfz_2();
                                                                var3_3 = false;
                                                                try {
                                                                    var6_4 += 2;
                                                                    if ((888345155669487435L ^ (long)var4_5 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    var5_6 = Integer.rotateLeft(var4_5 ^ -694228636, 7) ^ -1031603405 ^ -1031603405;
                                                                }
                                                                catch (ArithmeticException v2) {
                                                                    var5_6 = Integer.rotateLeft(var4_5 ^ -694228636, 7);
                                                                }
                                                                var6_4 -= 2;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(-634083840 ^ var4_5, 14) + 1891481915;
                                                            ((ClientPlayerInteractionManagerAccessor)bws.mc.field_1761).invokeSendSequencedPacket(bws.mc.field_1687, (class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, sath(int ), (I)Lnet/minecraft/class_2596;)((bws)this));
                                                            bws.zghs_4(bws.mc.field_1724, class_1268.field_5808);
                                                            var3_3 = true;
                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -694228636, 7) + -53278375 - -53278375;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(-37216033 ^ var4_5, 18) - -1080452548) * -37216033;
                                                        if (var1_1 == null) {
                                                            (int)(-8247520478048065188L ^ (long)var4_5 ^ 3086607234702948036L);
                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -1278798853, 7) ^ -1987434365 ^ -1987434365;
                                                            (int)(-5570106721709079832L ^ (long)var4_5 ^ -30034583911741257L);
                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -1166307129, 7);
                                                            var6_4 += 2;
                                                            continue;
                                                        }
                                                        try {
                                                            var6_4 += 4;
                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -460385101, 7);
                                                        }
                                                        catch (UnsupportedOperationException v3) {
                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -460385101, 7) ^ -985810174 ^ -985810174;
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateRight(-646963258 ^ var4_5, 14) - 1492219957;
                                                    var5_6 = Integer.rotateLeft(var4_5 ^ -1561657796, 7) ^ 1620842104 ^ 1620842104;
                                                    (Integer.rotateRight(-1222647365 ^ var4_5, 9) + 825881824) * -1222647365;
                                                    var5_6 = Integer.rotateLeft(var4_5 ^ -1598644417, 7) + 833613170 - 833613170;
                                                    Integer.rotateRight(438277058 ^ var4_5, 6) + 774931385;
                                                    var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7) ^ -362513131 ^ -362513131;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-1828413580 ^ var4_5, 5) - -773001657) * -1828413579;
                                                try {
                                                    var6_4 += 2;
                                                    if ((-8266347464478848567L ^ (long)var4_5 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7) + -380988245 - -380988245;
                                                }
                                                catch (ArithmeticException v4) {
                                                    var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7) + -408008764 - -408008764;
                                                }
                                                var6_4 += 5;
                                                continue;
                                            }
                                            Integer.rotateLeft(-631902335 ^ var4_5, 14) + 1959108570;
                                            (int)(1794475252908354383L ^ (long)var4_5 ^ 9081652797052132383L);
                                            (int)(8946287508548619981L ^ (long)var4_5 ^ -3504618890766494306L);
                                            var5_6 = Integer.rotateLeft(var4_5 ^ -1024258386, 7);
                                            (int)(3687591675502263186L ^ (long)var4_5 ^ 1683890289930128264L);
                                            var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1833615409, 7) ^ -7888870038625339012L ^ -7888870038625339012L);
                                            ++var6_4;
                                            continue;
                                        }
                                        Integer.rotateRight(1434937102 ^ var4_5, 13) - 1606621677;
                                        var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ 263577690, 7)));
                                        (Integer.rotateRight(-339771918 ^ var4_5, 16) + -1869750391) * -339771917;
                                        try {
                                            var6_4 += 5;
                                            var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1833615409, 7) ^ 7983903419562629174L ^ 7983903419562629174L);
                                        }
                                        catch (IllegalArgumentException v5) {
                                            var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7) ^ 2117813146 ^ 2117813146;
                                        }
                                        var6_4 += 2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(1044505393 ^ var4_5, 10) + -1906826710) * 1044505393;
                                    (int)(-219747242207810737L ^ (long)var4_5 ^ 7451349731943928887L);
                                    var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ 1770792682, 7)));
                                    Integer.rotateLeft(1185187969 ^ var4_5, 11) + -1840634150;
                                    (int)(-8928906621651457201L ^ (long)var4_5 ^ -5762211574761085443L);
                                    var5_6 = Integer.rotateLeft(var4_5 ^ -1460438819, 7) + -689235196 - -689235196;
                                    (Integer.rotateLeft(-1292797135 ^ var4_5, 9) + -1348761046) * -1292797135;
                                    (int)(8089543603872131919L ^ (long)var4_5 ^ 6298428227337145686L);
                                    var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7) + -1347912681 - -1347912681;
                                    continue;
                                }
                                Integer.rotateRight(-1193059797 ^ var4_5, 10) + 1743096432;
                                var5_6 = Integer.rotateLeft(var4_5 ^ -1662917021, 7) ^ -396810587 ^ -396810587;
                                (Integer.rotateRight(1345268510 ^ var4_5, 13) - -1173104675) * 1345268511;
                                (int)(2326910870981542050L ^ (long)var4_5 ^ 5712654503311043908L);
                                var5_6 = Integer.rotateLeft(var4_5 ^ -2134830525, 7);
                                (int)(-6468019030317060205L ^ (long)var4_5 ^ 620597672939676072L);
                                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1833615409, 7) ^ 4616830543343297700L ^ 4616830543343297700L);
                                var6_4 += 5;
                                continue;
                            }
                            Integer.rotateLeft(-108797880 ^ var4_5, 18) + 995477491;
                            var5_6 = Integer.rotateLeft(var4_5 ^ -1062107381, 7);
                            (Integer.rotateRight(1540659574 ^ var4_5, 14) - 589051013) * 1540659575;
                            try {
                                if ((-2367121972128270267L ^ (long)var4_5 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1833615409, 7) ^ -926989361845935880L ^ -926989361845935880L);
                            }
                            catch (UnsupportedOperationException v6) {
                                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1833615409, 7) ^ -7861476400776959289L ^ -7861476400776959289L);
                            }
                            --var6_4;
                            continue;
                        }
                        (Integer.rotateLeft(-1763340772 ^ var4_5, 5) - 1244255391) * -1763340771;
                        var5_6 = Integer.rotateLeft(var4_5 ^ 1723956377, 7);
                        (Integer.rotateRight(-1453834701 ^ var4_5, 8) + -2045958296) * -1453834701;
                        try {
                            --var6_4;
                            var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7);
                        }
                        catch (IllegalStateException v7) {
                            var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ 1833615409, 7)));
                        }
                        --var6_4;
                        continue;
                    }
                    (Integer.rotateRight(-40356453 ^ var4_5, 18) + -1177805568) * -40356453;
                    var5_6 = Integer.rotateLeft(var4_5 ^ 1718545133, 7) + -1667103961 - -1667103961;
                    Integer.rotateRight(-1174052093 ^ var4_5, 10) + -1962632040;
                    var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7);
                    Integer.rotateLeft(1424842016 ^ var4_5, 13) + 1293674011;
                    var6_4 += 4;
                    continue;
                }
                (Integer.rotateLeft(-903773832 ^ var4_5, 12) + 2121026755) * -903773831;
                var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7) ^ 1559618917 ^ 1559618917;
                --var6_4;
                continue;
            }
            return var3_3;
lbl253:
            // 8 sources

            Integer.rotateLeft(-206668468 ^ var4_5, 17) - -2038510737;
            var5_6 = Integer.rotateLeft(var4_5 ^ 1833615409, 7) + 61033178 - 61033178;
        }
    }

    private zsh_8 tlq_2(class_1792 class_17922, int n, boolean[] blArray) {
        int n2 = 0;
        int n3 = 0;
        zsh_8 zsh2_2 = null;
        int n4 = 0;
        int n5 = 1512664087;
        n5 = Integer.rotateLeft(n5 * 375410131, 17) ^ 0x7FEF502D;
        n5 = Integer.rotateRight(System.identityHashCode(this) ^ n5, 22);
        class_1792 class_17923 = class_17922;
        n5 = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n5;
        int n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765;
        block42: while (true) {
            switch (n6 - 1053513765 ^ 0x3ECB5825 ^ n5) {
                case 1613695679: {
                    int cfr_ignored_0 = Integer.rotateRight(0xEDCA580B ^ n5, 16) + -807516016;
                    zsh2_2 = null;
                    n6 = (n5 ^ 0x62A9A968 ^ 0x3ECB5825) + 1053513765 ^ 0xCD6968E2 ^ 0xCD6968E2;
                    n4 -= 4;
                    continue block42;
                }
                case -1380677817: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x1EBAD55D ^ n5, 6) - -1124240002) * 515560797;
                    int cfr_ignored_2 = (int)(0xDC087B6027D4EB4FL ^ (long)n5 ^ 0xBB0831A2DB815C1L);
                    n3 = bws.rqa(this, blArray);
                    if (n3 == -1) {
                        int cfr_ignored_3 = (int)(0xBDA2FB8B6BCD256BL ^ (long)n5 ^ 0xA661B29B1F0D694L);
                        n6 = (n5 ^ 0x1A989A7D ^ 0x3ECB5825) + 1053513765;
                        int cfr_ignored_4 = (int)(0xC3FF9C88404D68FFL ^ (long)n5 ^ 0xC4604C292AD82A2EL);
                        n6 = (n5 ^ 0x602F0ABF ^ 0x3ECB5825) + 1053513765 ^ 0x806EDD90 ^ 0x806EDD90;
                        n4 -= 5;
                        continue block42;
                    }
                    try {
                        n4 += 3;
                        if ((0x45CED363A0CB6F99L ^ (long)n5 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n6 = (int)((long)((n5 ^ 0xAB14E701 ^ 0x3ECB5825) + 1053513765) ^ 0xCAE072BCEA3360A7L ^ 0xCAE072BCEA3360A7L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n6 = (n5 ^ 0xAB14E701 ^ 0x3ECB5825) + 1053513765;
                    }
                    ++n4;
                    continue block42;
                }
                case -1424693503: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x4938A25C ^ n5, 12) - -499562401) * 1228448349;
                    blArray[n3] = true;
                    zsh2_2 = new zsh_8(n3, new bhk_2(n2, n3));
                    if (!bwa.dhya_2(n5, 136944331)) {
                        int cfr_ignored_6 = Integer.rotateRight(0x6A8033A3 ^ n5, 16) + -370941960;
                    }
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0x62A9A968 ^ 0x3ECB5825) + 1053513765));
                    continue block42;
                }
                case 820414158: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0x2F3B4299 ^ n5, 8) + -1131761726) * 792412825;
                    int cfr_ignored_8 = (int)(0xED89ECA427D4EB4FL ^ (long)n5 ^ 0x2438831A2DB876C2L);
                    zsh2_2 = null;
                    n6 = (n5 ^ 0x62A9A968 ^ 0x3ECB5825) + 1053513765;
                    int cfr_ignored_9 = (Integer.rotateRight(0x556CADDE ^ n5, 13) - 1552330013) * 1433185759;
                    continue block42;
                }
                case 177860158: {
                    int cfr_ignored_10 = Integer.rotateRight(0x240BDA8A ^ n5, 7) + 1640830449;
                    zsh2_2 = null;
                    try {
                        --n4;
                        if ((0xA1576CB4EEB80ABDL ^ (long)n5 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n6 = (n5 ^ 0x62A9A968 ^ 0x3ECB5825) + 1053513765 + 1723521589 - 1723521589;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n6 = Integer.reverse(Integer.reverse((n5 ^ 0x62A9A968 ^ 0x3ECB5825) + 1053513765));
                    }
                    n4 -= 3;
                    continue block42;
                }
                case -200739063: {
                    int cfr_ignored_11 = (Integer.rotateRight(0x8B33067B ^ n5, 4) + -544511968) * -1959590277;
                    if (n != -1) {
                        int cfr_ignored_12 = (int)(0x1DA201C6F47B5C73L ^ (long)n5 ^ 0xFEFD244543C19695L);
                        n6 = (n5 ^ 0x659FECA4 ^ 0x3ECB5825) + 1053513765 + -646464868 - -646464868;
                        n4 += 3;
                        continue block42;
                    }
                    try {
                        if ((0x9EE13C1CCBCA0C9FL ^ (long)n5 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n6 = Integer.reverse(Integer.reverse((n5 ^ 0xCD74E9E4 ^ 0x3ECB5825) + 1053513765));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n6 = (n5 ^ 0xCD74E9E4 ^ 0x3ECB5825) + 1053513765;
                    }
                    n4 -= 4;
                    continue block42;
                }
                case -847975964: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x118AC1D8 ^ n5, 5) + 606804067) * 294306265;
                    n2 = bws.ghdw_2(this, class_17922);
                    if (n2 == -1) {
                        try {
                            n4 -= 5;
                            n6 = (n5 ^ 0x30E686CE ^ 0x3ECB5825) + 1053513765 ^ 0xFBAFB8A6 ^ 0xFBAFB8A6;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n6 = Integer.reverse(Integer.reverse((n5 ^ 0x30E686CE ^ 0x3ECB5825) + 1053513765));
                        }
                        ++n4;
                        continue block42;
                    }
                    if (!bwa.dhya_2(n5, 1267327814)) {
                        int cfr_ignored_14 = Integer.rotateLeft(0xE63D6401 ^ n5, 15) + -439567526;
                        int cfr_ignored_15 = (int)(0x248FCA3C27D4EB4FL ^ (long)n5 ^ 0x6908831A2DB9E4CEL);
                    }
                    n6 = (n5 ^ 0xADB48747 ^ 0x3ECB5825) + 1053513765;
                    n4 += 5;
                    continue block42;
                }
                case 1704979620: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0x28CA10FC ^ n5, 8) - -187322945) * 684331261;
                    zsh2_2 = new zsh_8(n, null);
                    try {
                        n4 += 4;
                        if ((0x17B83FD248835C79L ^ (long)n5 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n6 = Integer.reverse(Integer.reverse((n5 ^ 0x62A9A968 ^ 0x3ECB5825) + 1053513765));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n6 = (n5 ^ 0x62A9A968 ^ 0x3ECB5825) + 1053513765;
                    }
                    continue block42;
                }
                case -2004893397: {
                    int cfr_ignored_17 = Integer.rotateLeft(0x4626902C ^ n5, 11) - -2096556913;
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0x83A70BF8 ^ 0x3ECB5825) + 1053513765));
                    int cfr_ignored_18 = Integer.rotateRight(0x9F880846 ^ n5, 6) - 1440128949;
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765));
                    int cfr_ignored_19 = Integer.rotateRight(0xB939FA6F ^ n5, 10) - 1919087276;
                    n4 += 4;
                    continue block42;
                }
                case -1585326733: {
                    int cfr_ignored_20 = Integer.rotateRight(0xACCD72A7 ^ n5, 8) - -247561868;
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765));
                    int cfr_ignored_21 = Integer.rotateRight(0xCBBAAE6B ^ n5, 12) + -1342652880;
                    n4 += 4;
                    continue block42;
                }
                case 643853870: {
                    int cfr_ignored_22 = (Integer.rotateRight(0xAEE12DD6 ^ n5, 8) - 832711717) * -1360974377;
                    try {
                        n4 += 4;
                        if ((0x45E2B1EBE29DCAFL ^ (long)n5 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n6 = (int)((long)((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765) ^ 0x9121BFF020535687L ^ 0x9121BFF020535687L);
                    }
                    n4 += 2;
                    continue block42;
                }
                case -355580794: {
                    int cfr_ignored_23 = Integer.rotateRight(0x79ADF94F ^ n5, 18) - -1066479668;
                    int cfr_ignored_24 = (int)(0x70F5E96F43DE6585L ^ (long)n5 ^ 0x2FAE4B0F302D4C3AL);
                    n6 = (int)((long)((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765) ^ 0x24811CD11BDF6AF0L ^ 0x24811CD11BDF6AF0L);
                    --n4;
                    continue block42;
                }
                case -1627017555: {
                    int cfr_ignored_25 = Integer.rotateRight(0x9616570B ^ n5, 5) + 823273872;
                    n6 = (int)((long)((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765) ^ 0xA4C4D02B859BFDEEL ^ 0xA4C4D02B859BFDEEL);
                    n4 += 2;
                    continue block42;
                }
                case -1634961830: {
                    int cfr_ignored_26 = Integer.rotateLeft(0x546E03C8 ^ n5, 13) + 1034949747;
                    n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765;
                    int cfr_ignored_27 = (Integer.rotateLeft(0xF3D81915 ^ n5, 17) - -1953978170) * -203941611;
                    int cfr_ignored_28 = (int)(0x316AB72827D4EB4FL ^ (long)n5 ^ 0x9320831A2DB9CF04L);
                    continue block42;
                }
                case 435907770: {
                    int cfr_ignored_29 = Integer.rotateRight(0xCDB4AEA2 ^ n5, 12) + -314653479;
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0xD1E71BCC ^ 0x3ECB5825) + 1053513765));
                    int cfr_ignored_30 = Integer.rotateLeft(0xA83AA1C5 ^ n5, 8) - 1668757014;
                    int cfr_ignored_31 = (int)(0x6A880FF827D4EB4FL ^ (long)n5 ^ 0xE280831A2DB978C1L);
                    int cfr_ignored_32 = (int)(0x54F2BDE194A5E188L ^ (long)n5 ^ 0x86B3E5F838370434L);
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765));
                    n4 += 4;
                    continue block42;
                }
                case -1362270609: {
                    int cfr_ignored_33 = (Integer.rotateLeft(0xAD5A8498 ^ n5, 8) + 39038371) * -1386576743;
                    n6 = (n5 ^ 0xF86E40FC ^ 0x3ECB5825) + 1053513765 + -1903811606 - -1903811606;
                    int cfr_ignored_34 = (Integer.rotateRight(0x1A4CEEF3 ^ n5, 6) + 867077800) * 441249523;
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0x28E8FBB0 ^ 0x3ECB5825) + 1053513765));
                    int cfr_ignored_35 = (Integer.rotateRight(0x5B9C5F ^ n5, 3) - 259362492) * 6003807;
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765));
                    ++n4;
                    continue block42;
                }
                case -1240120314: {
                    int cfr_ignored_36 = (Integer.rotateRight(0x5923E436 ^ n5, 14) - -810139195) * 1495524407;
                    n6 = (n5 ^ 0xB9074609 ^ 0x3ECB5825) + 1053513765 + 50063756 - 50063756;
                    int cfr_ignored_37 = Integer.rotateRight(0x7260C527 ^ n5, 17) - -569016588;
                    try {
                        ++n4;
                        if ((0xEF28C08FFADE67D5L ^ (long)n5 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n6 = (int)((long)((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765) ^ 0x72711B75D05F0DA4L ^ 0x72711B75D05F0DA4L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765 + 937106534 - 937106534;
                    }
                    ++n4;
                    continue block42;
                }
                case -1646510756: {
                    int cfr_ignored_38 = (Integer.rotateLeft(0x461720DC ^ n5, 11) - -2127914529) * 1175920861;
                    n6 = (n5 ^ 0x4BD1EE97 ^ 0x3ECB5825) + 1053513765 ^ 0x56F9AA0B ^ 0x56F9AA0B;
                    int cfr_ignored_39 = Integer.rotateRight(0x1EE98106 ^ n5, 6) - -1029423371;
                    try {
                        ++n4;
                        n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765 + -1381862762 - -1381862762;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765;
                    }
                    ++n4;
                    continue block42;
                }
                case -1869593643: {
                    int cfr_ignored_40 = Integer.rotateRight(0x2ABB3122 ^ n5, 8) + 822645337;
                    int cfr_ignored_41 = (int)(0x7C3FDB2E1B5ACC79L ^ (long)n5 ^ 0x4B2CFA0663D555AEL);
                    n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765 + 637206006 - 637206006;
                    continue block42;
                }
                case 5757192: {
                    int cfr_ignored_42 = Integer.rotateRight(0xA1FBEE07 ^ n5, 7) - -1579191788;
                    n6 = (n5 ^ 0xE1FC2F23 ^ 0x3ECB5825) + 1053513765 ^ 0x4463603 ^ 0x4463603;
                    int cfr_ignored_43 = Integer.rotateRight(0x90BB7AE6 ^ n5, 5) - -1961787115;
                    if (!bwa.dhya_2(n5, 1493322774)) {
                        int cfr_ignored_44 = (Integer.rotateRight(0xAD0ABB1F ^ n5, 8) - -123058180) * -1391805665;
                    }
                    n6 = Integer.reverse(Integer.reverse((n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765));
                    n4 -= 5;
                    continue block42;
                }
                case -534188746: {
                    int cfr_ignored_45 = Integer.rotateRight(0x466A343 ^ n5, 3) + -1932827560;
                    try {
                        n4 += 3;
                        n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765 + 1433094820 - 1433094820;
                    }
                    continue block42;
                }
                case 1655286120: {
                    return zsh2_2;
                }
            }
            int cfr_ignored_46 = Integer.rotateRight(0xFF9228E ^ n5, 4) - -209138067;
            n6 = (n5 ^ 0xF408F709 ^ 0x3ECB5825) + 1053513765;
        }
    }

    private int sab(class_1792 class_17922) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = bwa.atj(26898092);
        n4 = Integer.rotateLeft(System.identityHashCode(this) ^ n4, 18);
        int n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0xB5503F4E ^ 0xB5503F4E;
        while (true) {
            block26: {
                block41: {
                    block34: {
                        block38: {
                            block33: {
                                block25: {
                                    block48: {
                                        block32: {
                                            block35: {
                                                block29: {
                                                    block47: {
                                                        block24: {
                                                            block40: {
                                                                block27: {
                                                                    block49: {
                                                                        block31: {
                                                                            block44: {
                                                                                block45: {
                                                                                    block46: {
                                                                                        block42: {
                                                                                            block39: {
                                                                                                block28: {
                                                                                                    block43: {
                                                                                                        block36: {
                                                                                                            block37: {
                                                                                                                block21: {
                                                                                                                    block30: {
                                                                                                                        block22: {
                                                                                                                            block23: {
                                                                                                                                if ((n3 = Integer.reverse(n5) ^ n4 ^ 0xD1C90CD3) > -335698301) break block21;
                                                                                                                                if (n3 > -1635007341) break block22;
                                                                                                                                if (n3 > -1909048548) break block23;
                                                                                                                                if (n3 == -2128622165) break block24;
                                                                                                                                if (n3 == -1909048548) break block25;
                                                                                                                                int cfr_ignored_0 = (Integer.rotateLeft(0x87EE729C ^ n4, 3) - 2050850847) * -2014416227;
                                                                                                                                break block26;
                                                                                                                            }
                                                                                                                            if (n3 == -1898893372) break block27;
                                                                                                                            if (n3 == -1731450644) break block28;
                                                                                                                            if (n3 == -1635007341) break block29;
                                                                                                                            break block26;
                                                                                                                        }
                                                                                                                        if (n3 > -1196271603) break block30;
                                                                                                                        if (n3 == -1521013245) break block31;
                                                                                                                        if (n3 == -1196271603) break block32;
                                                                                                                        break block26;
                                                                                                                    }
                                                                                                                    if (n3 == -859907049) break block33;
                                                                                                                    if (n3 == -353336288) break block34;
                                                                                                                    int cfr_ignored_1 = (Integer.rotateLeft(0x35A27FB4 ^ n4, 9) - -2096425465) * 899841973;
                                                                                                                    if (n3 == -335698301) break block35;
                                                                                                                    break block26;
                                                                                                                }
                                                                                                                if (n3 > 176133444) break block36;
                                                                                                                if (n3 > -168097667) break block37;
                                                                                                                if (n3 == -187785769) break block38;
                                                                                                                if (n3 == -168097667) break block39;
                                                                                                                int cfr_ignored_2 = Integer.rotateRight(0x11C78F4A ^ n4, 5) + 730331441;
                                                                                                                break block26;
                                                                                                            }
                                                                                                            if (n3 == -40953891) break block40;
                                                                                                            if (n3 == 170797642) break block41;
                                                                                                            if (n3 == 176133444) break block42;
                                                                                                            break block26;
                                                                                                        }
                                                                                                        if (n3 > 850009667) break block43;
                                                                                                        if (n3 == 198686228) break block44;
                                                                                                        if (n3 == 275888927) break block45;
                                                                                                        int cfr_ignored_3 = Integer.rotateRight(0xCD7E7686 ^ n4, 12) - -424806027;
                                                                                                        if (n3 == 850009667) break block46;
                                                                                                        break block26;
                                                                                                    }
                                                                                                    if (n3 == 1177547504) break block47;
                                                                                                    if (n3 == 1307178751) break block48;
                                                                                                    int cfr_ignored_4 = Integer.rotateRight(0x8DBACD87 ^ n4, 4) - 771523220;
                                                                                                    if (n3 == 1777359367) break block49;
                                                                                                    break block26;
                                                                                                }
                                                                                                int cfr_ignored_5 = (Integer.rotateRight(0x8624D4B6 ^ n4, 3) - 1121149253) * -2044406601;
                                                                                                n2 = -1;
                                                                                                n5 = Integer.reverse(n4 ^ 0x1C2BEA57 ^ 0xD1C90CD3) + 1925816278 - 1925816278;
                                                                                                int cfr_ignored_6 = Integer.rotateRight(0xE1A5AA4F ^ n4, 15) - 1466777292;
                                                                                                n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xA2E2A4A ^ 0xD1C90CD3)));
                                                                                                ++n3;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_7 = Integer.rotateLeft(0x9BB7A0A5 ^ n4, 6) - -543550666;
                                                                                            int cfr_ignored_8 = (int)(0x59050E9827D4EB4FL ^ (long)n4 ^ 0xE040831A2DB91FDBL);
                                                                                            n2 = -1;
                                                                                            try {
                                                                                                if ((0x10709B63C3B9677L ^ (long)n4 | 1L) == 0L) {
                                                                                                    throw new IllegalArgumentException();
                                                                                                }
                                                                                                n5 = Integer.reverse(n4 ^ 0xA2E2A4A ^ 0xD1C90CD3) ^ 0x70D4D8D0 ^ 0x70D4D8D0;
                                                                                            }
                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                n5 = Integer.reverse(n4 ^ 0xA2E2A4A ^ 0xD1C90CD3) ^ 0xBD15FF17 ^ 0xBD15FF17;
                                                                                            }
                                                                                            n3 += 3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_9 = (Integer.rotateLeft(0x42250FC ^ n4, 3) - -2071630401) * 69357821;
                                                                                        n2 = n;
                                                                                        try {
                                                                                            n3 -= 5;
                                                                                            if ((0xDA030E69DE01E69DL ^ (long)n4 | 1L) == 0L) {
                                                                                                throw new NoSuchElementException();
                                                                                            }
                                                                                            n5 = Integer.reverse(n4 ^ 0xA2E2A4A ^ 0xD1C90CD3);
                                                                                        }
                                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                                            n5 = Integer.reverse(n4 ^ 0xA2E2A4A ^ 0xD1C90CD3) + 1433761006 - 1433761006;
                                                                                        }
                                                                                        n3 += 2;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_10 = Integer.rotateRight(0xE7B5062 ^ n4, 4) + -984851687;
                                                                                    ++n;
                                                                                    int cfr_ignored_11 = (int)(0xF62570DEB5E85D88L ^ (long)n4 ^ 0x1CCDA7634036419BL);
                                                                                    n5 = Integer.reverse(n4 ^ 0xD497734 ^ 0xD1C90CD3);
                                                                                    int cfr_ignored_12 = (int)(0xE9739E4059634162L ^ (long)n4 ^ 0xC1F07E7579E27F36L);
                                                                                    n5 = Integer.reverse(n4 ^ 0xBD7B614 ^ 0xD1C90CD3) + -45926057 - -45926057;
                                                                                    --n3;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_13 = Integer.rotateLeft(0xD2268D85 ^ n4, 13) - 1997062742;
                                                                                int cfr_ignored_14 = (int)(0x109423B827D4EB4FL ^ (long)n4 ^ 0xBA00831A2DB98CF9L);
                                                                                if (bws.jkd(bws.mc.field_1724).method_5438(n).method_31574(class_17922)) {
                                                                                    int cfr_ignored_15 = (int)(0x265A2AAD9B8E604DL ^ (long)n4 ^ 0xA82BFBAF3BBDE165L);
                                                                                    n5 = Integer.reverse(n4 ^ 0xA7F9544 ^ 0xD1C90CD3) ^ 0x10D4E834 ^ 0x10D4E834;
                                                                                    continue;
                                                                                }
                                                                                n5 = Integer.reverse(n4 ^ 0x32AA1E43 ^ 0xD1C90CD3) ^ 0x6D9DDE15 ^ 0x6D9DDE15;
                                                                                int cfr_ignored_16 = (Integer.rotateLeft(0xFFD83D59 ^ n4, 18) + -7533310) * -2605735;
                                                                                int cfr_ignored_17 = (int)(0x3D6A936427D4EB4FL ^ (long)n4 ^ 0xDBB8831A2DB9D704L);
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_18 = (Integer.rotateLeft(0x3BCB0D54 ^ n4, 10) - 1106525287) * 1003162965;
                                                                            if (n >= -500151593 + 500151602) {
                                                                                n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xF5FB087D ^ 0xD1C90CD3)));
                                                                                n3 += 2;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                n3 -= 3;
                                                                                if ((0x57975DB567D31B25L ^ (long)n4 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0x1071BB1F ^ 0xD1C90CD3)));
                                                                            }
                                                                            catch (ArithmeticException arithmeticException) {
                                                                                n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0x1071BB1F ^ 0xD1C90CD3)));
                                                                            }
                                                                            n3 += 3;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_19 = (Integer.rotateLeft(0x9957E490 ^ n4, 6) + -1778234197) * -1722293103;
                                                                        n = 0;
                                                                        n5 = Integer.reverse(n4 ^ 0x6744A34D ^ 0xD1C90CD3);
                                                                        int cfr_ignored_20 = (Integer.rotateRight(0xB4B217A ^ n4, 4) + 1651944705) * 189473147;
                                                                        n5 = (int)((long)Integer.reverse(n4 ^ 0xBD7B614 ^ 0xD1C90CD3) ^ 0x7D3E0940C0587BEAL ^ 0x7D3E0940C0587BEAL);
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_21 = (Integer.rotateLeft(0xD90E8EB5 ^ n4, 14) - 1294001958) * -653357387;
                                                                    int cfr_ignored_22 = (int)(0x1BBC208827D4EB4FL ^ (long)n4 ^ 0xBC60831A2DB99AA9L);
                                                                    n5 = (int)((long)Integer.reverse(n4 ^ 0x503AF58E ^ 0xD1C90CD3) ^ 0xF8DB40606DA479A7L ^ 0xF8DB40606DA479A7L);
                                                                    int cfr_ignored_23 = (Integer.rotateLeft(0xD865AA35 ^ n4, 14) - 950877094) * -664425931;
                                                                    int cfr_ignored_24 = (int)(0x1AD7040827D4EB4FL ^ (long)n4 ^ 0xF560831A2DB9987FL);
                                                                    n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3);
                                                                    n3 -= 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_25 = Integer.rotateRight(0xDD5516EF ^ n4, 14) - -777296340;
                                                                n5 = (int)((long)Integer.reverse(n4 ^ 0x63CAF711 ^ 0xD1C90CD3) ^ 0xCB9DE65AF2B20581L ^ 0xCB9DE65AF2B20581L);
                                                                int cfr_ignored_26 = (Integer.rotateRight(0x6C167F92 ^ n4, 16) + 454496745) * 1813413779;
                                                                n5 = (int)((long)Integer.reverse(n4 ^ 0xBDD5C10E ^ 0xD1C90CD3) ^ 0x760019B2AA0FC8D2L ^ 0x760019B2AA0FC8D2L);
                                                                int cfr_ignored_27 = (Integer.rotateRight(0xFA88A39E ^ n4, 18) - 1525247837) * -91708513;
                                                                n5 = (int)((long)Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x375078D9BEBA7EC0L ^ 0x375078D9BEBA7EC0L);
                                                                continue;
                                                            }
                                                            int cfr_ignored_28 = (Integer.rotateRight(0x64035052 ^ n4, 15) + 549738793) * 1677938771;
                                                            n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3)));
                                                            --n3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_29 = (Integer.rotateLeft(0x21BD5C38 ^ n4, 7) + 441174531) * 566058041;
                                                        try {
                                                            if ((0x26D9B2A4A878DC47L ^ (long)n4 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) + 970780227 - 970780227;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            n5 = (int)((long)Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x58C496327A24A4C2L ^ 0x58C496327A24A4C2L);
                                                        }
                                                        n3 += 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_30 = (Integer.rotateRight(0x92AEA1BA ^ n4, 5) + -947702591) * -1834049093;
                                                    n5 = Integer.reverse(n4 ^ 0xE5E98EF6 ^ 0xD1C90CD3) ^ 0x734E4318 ^ 0x734E4318;
                                                    int cfr_ignored_31 = (Integer.rotateRight(0x9F540CB7 ^ n4, 6) - 1334520164) * -1621881673;
                                                    n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x6F7D82E8 ^ 0x6F7D82E8;
                                                    n3 += 2;
                                                    continue;
                                                }
                                                int cfr_ignored_32 = Integer.rotateRight(0x7504F92F ^ n4, 17) - 804768748;
                                                n5 = Integer.reverse(n4 ^ 0xA5A94878 ^ 0xD1C90CD3);
                                                int cfr_ignored_33 = Integer.rotateLeft(0xFB967CE1 ^ n4, 18) + 2073476730;
                                                int cfr_ignored_34 = (int)(0x3924D2DC27D4EB4FL ^ (long)n4 ^ 0x58C8831A2DB9DF98L);
                                                try {
                                                    ++n3;
                                                    if ((0x609D430BC0BA59D5L ^ (long)n4 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x47114C5E ^ 0x47114C5E;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) + -233589384 - -233589384;
                                                }
                                                n3 -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_35 = Integer.rotateRight(0x6B4D63CE ^ n4, 16) - 45921581;
                                            n5 = Integer.reverse(n4 ^ 0x3E156C ^ 0xD1C90CD3);
                                            int cfr_ignored_36 = (Integer.rotateRight(0xD56AAA77 ^ n4, 13) - -599243868) * -714429833;
                                            n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x5BCF79B8 ^ 0x5BCF79B8;
                                            int cfr_ignored_37 = (Integer.rotateRight(0x98883DB7 ^ n4, 6) - 2094864484) * -1735901769;
                                            n3 -= 2;
                                            continue;
                                        }
                                        int cfr_ignored_38 = (Integer.rotateLeft(0xCC6FD4DD ^ n4, 12) - -974625282) * -865086243;
                                        int cfr_ignored_39 = (int)(0xEDD7AE027D4EB4FL ^ (long)n4 ^ 0x8B0831A2DB9B06BL);
                                        n5 = Integer.reverse(n4 ^ 0x68461459 ^ 0xD1C90CD3) + -1352866125 - -1352866125;
                                        int cfr_ignored_40 = (Integer.rotateRight(0xE02405FF ^ n4, 15) - 683301148) * -534510081;
                                        int cfr_ignored_41 = (int)(0xDD794B5CA4569E65L ^ (long)n4 ^ 0x6BC9841EC7EC1723L);
                                        n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x9332804A ^ 0x9332804A;
                                        n3 += 5;
                                        continue;
                                    }
                                    int cfr_ignored_42 = Integer.rotateLeft(0xFDCD8D20 ^ n4, 18) + -1069435365;
                                    n5 = (int)((long)Integer.reverse(n4 ^ 0x617A42 ^ 0xD1C90CD3) ^ 0x30C4AA2B791DED8FL ^ 0x30C4AA2B791DED8FL);
                                    int cfr_ignored_43 = (Integer.rotateLeft(0x6782EF1 ^ n4, 3) + -856994198) * 108539633;
                                    int cfr_ignored_44 = (int)(0xC4CA80CC27D4EB4FL ^ (long)n4 ^ 0xFCE8831A2DB82444L);
                                    n5 = Integer.reverse(n4 ^ 0xFE848F92 ^ 0xD1C90CD3);
                                    int cfr_ignored_45 = Integer.rotateRight(0x784C08AE ^ n4, 18) - -1785549747;
                                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3)));
                                    n3 -= 4;
                                    continue;
                                }
                                int cfr_ignored_46 = Integer.rotateRight(0xE780938B ^ n4, 15) + 217021712;
                                try {
                                    n3 -= 3;
                                    if ((0xD08F37EA8C530809L ^ (long)n4 | 1L) == 0L) {
                                        throw new UnsupportedOperationException();
                                    }
                                    n5 = (int)((long)Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x172D29B0E12ECDB0L ^ 0x172D29B0E12ECDB0L);
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3)));
                                }
                                ++n3;
                                continue;
                            }
                            int cfr_ignored_47 = Integer.rotateLeft(0xBD67C7AD ^ n4, 10) - -202453714;
                            int cfr_ignored_48 = (int)(0x7FD5699027D4EB4FL ^ (long)n4 ^ 0x2E50831A2DB9527BL);
                            n5 = Integer.reverse(n4 ^ 0x37D092D9 ^ 0xD1C90CD3) ^ 0x60492927 ^ 0x60492927;
                            int cfr_ignored_49 = Integer.rotateLeft(0x25C7D224 ^ n4, 7) - -1752165993;
                            int cfr_ignored_50 = (int)(0xF3645B1D22146C49L ^ (long)n4 ^ 0x4B4A889B23B44B19L);
                            n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3);
                            n3 += 2;
                            continue;
                        }
                        int cfr_ignored_51 = (Integer.rotateRight(0x5313BCFA ^ n4, 13) + 331448705) * 1393802491;
                        n5 = Integer.reverse(n4 ^ 0xDF0DD5EB ^ 0xD1C90CD3) ^ 0x8DA1B740 ^ 0x8DA1B740;
                        int cfr_ignored_52 = Integer.rotateLeft(0x22DF9609 ^ n4, 7) + 1030802002;
                        int cfr_ignored_53 = (int)(0xE06D383427D4EB4FL ^ (long)n4 ^ 0x8D18831A2DB86D0BL);
                        n5 = (int)((long)Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x6AB32515FBD4CE2BL ^ 0x6AB32515FBD4CE2BL);
                        n3 += 4;
                        continue;
                    }
                    int cfr_ignored_54 = (Integer.rotateRight(0x40979D72 ^ n4, 11) + -692473847) * 1083678067;
                    n5 = Integer.reverse(n4 ^ 0xF9E8AC11 ^ 0xD1C90CD3) + -947882551 - -947882551;
                    int cfr_ignored_55 = (Integer.rotateRight(0x89F1D9D3 ^ n4, 4) + -1197015096) * -1980638765;
                    n5 = Integer.reverse(n4 ^ 0xE9EC4D65 ^ 0xD1C90CD3) + -1783222791 - -1783222791;
                    int cfr_ignored_56 = Integer.rotateLeft(0x3A0EC4D ^ n4, 3) - 1960459406;
                    int cfr_ignored_57 = (int)(0xC112427027D4EB4FL ^ (long)n4 ^ 0x7990831A2DB82FF5L);
                    n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3);
                    ++n3;
                    continue;
                }
                return n2;
            }
            int cfr_ignored_58 = Integer.rotateLeft(0xF02DE884 ^ n4, 17) - 434947895;
            n5 = Integer.reverse(n4 ^ 0xA5572E03 ^ 0xD1C90CD3) ^ 0x8F56DCE5 ^ 0x8F56DCE5;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int zkhgh(class_1792 var1_1) {
        var2_2 = 0;
        var3_3 = 0;
        var6_4 = 0;
        var4_5 = bwa.atj(1039144580);
        var5_6 = 834895776 + var4_5 + -171070295 - -171070295;
        block37: while (true) {
            if ((var6_4 = var5_6 - var4_5) == 1098397916) ** GOTO lbl197
            if (var6_4 == -1323938134) ** GOTO lbl-1000
            Integer.rotateLeft(-1907261343 ^ var4_5, 4) + 1077684986;
            (int)(5540322939935976271L ^ (long)var4_5 ^ -6789032289801522153L);
            if (var6_4 != -1920848177) {
                switch (var6_4) {
                    case -2108902971: {
                        Integer.rotateLeft(601110220 ^ var4_5, 7) - 1527792111;
                        if (var2_2 < (Integer.reverse(-1918121200) ^ 148100501)) {
                            try {
                                --var6_4;
                                if ((1390995406794090311L ^ (long)var4_5 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                var5_6 = -1009675828 + var4_5 ^ -330241159 ^ -330241159;
                            }
                            catch (UnsupportedOperationException v0) {
                                var5_6 = -1009675828 + var4_5 + 681211032 - 681211032;
                            }
                            continue block37;
                        }
                        var5_6 = (int)((long)(-1816510384 + var4_5) ^ -906659184585243041L ^ -906659184585243041L);
                        Integer.rotateRight(-1168438298 ^ var4_5, 10) - -1788604395;
                        var5_6 = (int)((long)(-1589473270 + var4_5) ^ -1135885116245320522L ^ -1135885116245320522L);
                        var6_4 += 2;
                        continue block37;
                    }
                    case -748227008: {
                        (Integer.rotateLeft(1489228857 ^ var4_5, 14) + -1005301214) * 1489228857;
                        (int)(-7317933761233622193L ^ (long)var4_5 ^ 682439492006091059L);
                        var3_3 = -1;
                        (int)(6121611127587687814L ^ (long)var4_5 ^ 6104309686522807353L);
                        var5_6 = (int)((long)(-1566987370 + var4_5) ^ 3542519091637159315L ^ 3542519091637159315L);
                        (int)(-6132087889144754346L ^ (long)var4_5 ^ 1759610758134167581L);
                        var5_6 = -606749128 + var4_5 ^ 276563985 ^ 276563985;
                        var6_4 -= 3;
                        continue block37;
                    }
                    case -1589473270: {
                        Integer.rotateLeft(1788320748 ^ var4_5, 16) - -323387185;
                        var3_3 = -1;
                        try {
                            var6_4 -= 3;
                            var5_6 = Integer.reverse(Integer.reverse(-606749128 + var4_5));
                        }
                        catch (IllegalStateException v1) {
                            var5_6 = -606749128 + var4_5 + -608161415 - -608161415;
                        }
                        var6_4 += 4;
                        continue block37;
                    }
                    case 1383380148: {
                        Integer.rotateLeft(-1283272728 ^ var4_5, 9) + -1053504429;
                        var3_3 = var2_2;
                        (int)(5199986144585150558L ^ (long)var4_5 ^ -2106878318050853499L);
                        var5_6 = -606749128 + var4_5 ^ -2125144722 ^ -2125144722;
                        var6_4 += 2;
                        continue block37;
                    }
                    case -1009675828: {
                        (Integer.rotateRight(-1047751142 ^ var4_5, 11) + 1952697441) * -1047751141;
                        if (bws.szz_7(bws.mc.field_1724.method_31548().method_5438(var2_2), var1_1)) {
                            var5_6 = (int)((long)(1383380148 + var4_5) ^ -1170292699733911286L ^ -1170292699733911286L);
                            continue block37;
                        }
                        var5_6 = -196124878 + var4_5;
                        continue block37;
                    }
                    case 834895776: {
                        Integer.rotateLeft(269959488 ^ var4_5, 5) + -147945989;
                        var2_2 = -933426646 - -933426655;
                        try {
                            if ((7779103082980926083L ^ (long)var4_5 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var5_6 = Integer.reverse(Integer.reverse(-2108902971 + var4_5));
                        }
                        catch (IllegalArgumentException v2) {
                            var5_6 = -2108902971 + var4_5;
                        }
                        var6_4 -= 5;
                        continue block37;
                    }
                    case -196124878: {
                        (Integer.rotateRight(1079433151 ^ var4_5, 11) - -824066212) * 1079433151;
                        ++var2_2;
                        try {
                            var6_4 -= 4;
                            var5_6 = -2108902971 + var4_5;
                        }
                        catch (NoSuchElementException v3) {
                            var5_6 = (int)((long)(-2108902971 + var4_5) ^ 3323491843390808242L ^ 3323491843390808242L);
                        }
                        var6_4 += 3;
                        continue block37;
                    }
                    case 596752507: {
                        Integer.rotateRight(-450056561 ^ var4_5, 15) - -993607028;
                        (int)(-8413205267569358871L ^ (long)var4_5 ^ 7616841072231365549L);
                        var5_6 = Integer.reverse(Integer.reverse(-1907793977 + var4_5));
                        (int)(9087217360642862985L ^ (long)var4_5 ^ 7883269059162493417L);
                        var5_6 = (int)((long)(834895776 + var4_5) ^ -8108985280973378220L ^ -8108985280973378220L);
                        continue block37;
                    }
                    case -1873648491: {
                        (Integer.rotateLeft(-1067789776 ^ var4_5, 11) + 1331499787) * -1067789775;
                        var5_6 = (int)((long)(834895776 + var4_5) ^ 5619503924233109302L ^ 5619503924233109302L);
                        (Integer.rotateLeft(1185323696 ^ var4_5, 11) + -1836426613) * 1185323697;
                        continue block37;
                    }
                    case -338795454: {
                        Integer.rotateRight(-303302302 ^ var4_5, 16) + -739192295;
                        try {
                            var6_4 += 4;
                            if ((-3342231289806604189L ^ (long)var4_5 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var5_6 = 834895776 + var4_5;
                        }
                        catch (IllegalArgumentException v4) {
                            var5_6 = 834895776 + var4_5 ^ 878157902 ^ 878157902;
                        }
                        var6_4 -= 2;
                        continue block37;
                    }
                    case -1835973690: {
                        (Integer.rotateLeft(6602197 ^ var4_5, 3) - 277912582) * 6602197;
                        (int)(-4407313297513845937L ^ (long)var4_5 ^ -2693008428708124547L);
                        var5_6 = 834895776 + var4_5 ^ 858056323 ^ 858056323;
                        var6_4 -= 5;
                        continue block37;
                    }
                    case 755608474: {
                        Integer.rotateLeft(-259243635 ^ var4_5, 17) - 626626382;
                        (int)(3620594690314005327L ^ (long)var4_5 ^ 2454605945376459180L);
                        var5_6 = 1837906146 + var4_5;
                        (Integer.rotateRight(770307218 ^ var4_5, 8) + -1817035543) * 770307219;
                        var5_6 = (int)((long)(834895776 + var4_5) ^ -778113273226576976L ^ -778113273226576976L);
                        (Integer.rotateLeft(-779617479 ^ var4_5, 13) + 1674906402) * -779617479;
                        (int)(1384105936822790991L ^ (long)var4_5 ^ 6302931826964532155L);
                        var6_4 -= 4;
                        continue block37;
                    }
                }
            }
            ** GOTO lbl217
lbl-1000:
            // 1 sources

            {
                Integer.rotateRight(1831509926 ^ var4_5, 16) - 1015477333;
                var5_6 = 303181161 + var4_5;
                (Integer.rotateLeft(1817213365 ^ var4_5, 16) - 572283942) * 1817213365;
                (int)(-5844872386589693105L ^ (long)var4_5 ^ 5935888457333796884L);
                try {
                    if ((-3136225536023438315L ^ (long)var4_5 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    var5_6 = (int)((long)(834895776 + var4_5) ^ 642145796603875465L ^ 642145796603875465L);
                }
                catch (IllegalArgumentException v5) {
                    var5_6 = Integer.reverse(Integer.reverse(834895776 + var4_5));
                }
                var6_4 -= 5;
                continue block37;
                case -513145811: {
                    (Integer.rotateRight(929875162 ^ var4_5, 9) + -1165396575) * 929875163;
                    try {
                        var6_4 -= 5;
                        if ((-106523703466780637L ^ (long)var4_5 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var5_6 = 834895776 + var4_5 ^ -1291695564 ^ -1291695564;
                    }
                    catch (ArithmeticException v6) {
                        var5_6 = (int)((long)(834895776 + var4_5) ^ 7826176410881625203L ^ 7826176410881625203L);
                    }
                    ++var6_4;
                    continue block37;
                }
                case -355331360: {
                    Integer.rotateLeft(136890857 ^ var4_5, 4) + 21893746;
                    (int)(-3847648770735674545L ^ (long)var4_5 ^ 3663822445325334757L);
                    var5_6 = -383213066 + var4_5 + 673810372 - 673810372;
                    (Integer.rotateLeft(57063065 ^ var4_5, 3) + 1842199490) * 57063065;
                    (int)(-4479928636004832433L ^ (long)var4_5 ^ -3731088142817022343L);
                    var5_6 = 834895776 + var4_5 ^ -774975785 ^ -774975785;
                    continue block37;
                }
lbl197:
                // 1 sources

                Integer.rotateLeft(1241079437 ^ var4_5, 12) - -107998642;
                (int)(-8409363239811093681L ^ (long)var4_5 ^ 2022260381148822342L);
                var5_6 = (int)((long)(834895776 + var4_5) ^ 9147316751496293756L ^ 9147316751496293756L);
                var6_4 -= 4;
                continue block37;
                case 2004349384: {
                    Integer.rotateRight(639720971 ^ var4_5, 7) + -1570241904;
                    try {
                        var6_4 -= 2;
                        if ((4669498334102828219L ^ (long)var4_5 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var5_6 = (int)((long)(834895776 + var4_5) ^ -245247365762138620L ^ -245247365762138620L);
                    }
                    catch (IllegalStateException v7) {
                        var5_6 = 834895776 + var4_5 ^ 1346353917 ^ 1346353917;
                    }
                    var6_4 -= 5;
                    continue block37;
                }
lbl217:
                // 1 sources

                (Integer.rotateRight(-390091598 ^ var4_5, 16) + 865306825) * -390091597;
                var5_6 = 1878547950 + var4_5 + 681905204 - 681905204;
                Integer.rotateLeft(206325633 ^ var4_5, 4) + -2120595494;
                (int)(-3531128063480501425L ^ (long)var4_5 ^ 3317045274017804332L);
                try {
                    var6_4 -= 3;
                    if ((7931369344559266915L ^ (long)var4_5 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var5_6 = 834895776 + var4_5;
                }
                catch (NoSuchElementException v8) {
                    var5_6 = 834895776 + var4_5;
                }
                var6_4 -= 3;
                continue block37;
                case -1873976683: {
                    Integer.rotateRight(-1343724113 ^ var4_5, 8) - 1367469932;
                    (int)(5687866092008723599L ^ (long)var4_5 ^ 4996388529727156239L);
                    var5_6 = Integer.reverse(Integer.reverse(834895776 + var4_5));
                    var6_4 += 5;
                    continue block37;
                }
                case -606749128: {
                    return var3_3;
                }
            }
            (Integer.rotateRight(-988646345 ^ var4_5, 11) - -510021148) * -988646345;
            var5_6 = 834895776 + var4_5 ^ -1632585149 ^ -1632585149;
        }
    }

    private int khwj(boolean[] blArray) {
        int n;
        int n2 = 2146561019;
        n2 = Integer.rotateLeft(n2 * 60472451, 26) ^ 0x8A327B1D;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 10);
        int n3 = n2 ^ 0x3A5926F7;
        if ((n3 ^ n2) != 978921207) {
            int cfr_ignored_0 = (0x45A8CD0C ^ n2) + -1220655616;
        }
        for (n = 0; n < 1940287203 + -1940287194; ++n) {
            if (blArray[n] || !bws.hsr(bws.mc.field_1724.method_31548().method_5438(n))) continue;
            int n4 = n;
            if (bws.ashk() == 0) {
                n4 = n4 ^ 0xBE69;
            }
            return n4;
        }
        for (n = 0; n < (0x716FB0CB ^ 0x716FB0C2); ++n) {
            if (blArray[n] || n == bws.dhb((class_746)bws.mc.field_1724).field_7545 || bws.ghrs(bws.mc.field_1724.method_31548(), n).method_7909() instanceof class_1829) continue;
            return n;
        }
        for (n = 0; n < 2003404382 + -2003404373; ++n) {
            if (blArray[n] || n == bws.khshgh((class_746)bws.mc.field_1724).field_7545) continue;
            return n;
        }
        for (n = 0; n < (0x770FA601 ^ 0x770FA608); ++n) {
            if (blArray[n]) continue;
            return n;
        }
        return -1;
    }

    private void rrb(zsh_8 zsh2_2) {
        int n = 0;
        int n2 = 1991003491;
        n2 = Integer.rotateLeft(n2 * -1487874061, 22) ^ 0xB8D9A5DB;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (int)((long)(n2 ^ 0x5E65F938) ^ 0x17D03CE2234B249CL ^ 0x17D03CE2234B249CL);
        while (true) {
            block30: {
                block51: {
                    block44: {
                        block45: {
                            block32: {
                                block35: {
                                    block41: {
                                        block36: {
                                            block29: {
                                                block38: {
                                                    block28: {
                                                        block49: {
                                                            block47: {
                                                                block50: {
                                                                    block31: {
                                                                        block34: {
                                                                            block48: {
                                                                                block37: {
                                                                                    block43: {
                                                                                        block42: {
                                                                                            block46: {
                                                                                                block39: {
                                                                                                    block40: {
                                                                                                        block25: {
                                                                                                            block33: {
                                                                                                                block26: {
                                                                                                                    block27: {
                                                                                                                        if ((n = n3 ^ n2) > 565605343) break block25;
                                                                                                                        if (n > -1624992049) break block26;
                                                                                                                        if (n > -1914234977) break block27;
                                                                                                                        if (n == -2106835107) break block28;
                                                                                                                        if (n == -1914234977) break block29;
                                                                                                                        break block30;
                                                                                                                    }
                                                                                                                    if (n == -1655826055) break block31;
                                                                                                                    if (n == -1624992049) break block32;
                                                                                                                    break block30;
                                                                                                                }
                                                                                                                if (n > -1302958168) break block33;
                                                                                                                if (n == -1459280048) break block34;
                                                                                                                if (n == -1302958168) break block35;
                                                                                                                break block30;
                                                                                                            }
                                                                                                            if (n == -928735072) break block36;
                                                                                                            if (n == -296650048) break block37;
                                                                                                            int cfr_ignored_0 = Integer.rotateRight(0x3F796B66 ^ n2, 10) - -1273913195;
                                                                                                            if (n == 565605343) break block38;
                                                                                                            break block30;
                                                                                                        }
                                                                                                        if (n > 1244460656) break block39;
                                                                                                        if (n > 832050684) break block40;
                                                                                                        if (n == 759481803) break block41;
                                                                                                        if (n == 832050684) break block42;
                                                                                                        int cfr_ignored_1 = (Integer.rotateLeft(0x8B22C83D ^ n2, 4) - -577511778) * -1960654787;
                                                                                                        int cfr_ignored_2 = (int)(0x4990660027D4EB4FL ^ (long)n2 ^ 0x3170831A2DB93EF1L);
                                                                                                        break block30;
                                                                                                    }
                                                                                                    if (n == 946171153) break block43;
                                                                                                    if (n == 1109768704) break block44;
                                                                                                    int cfr_ignored_3 = (Integer.rotateRight(0x6EBE591A ^ n2, 16) + 1835690337) * 1857968411;
                                                                                                    if (n == 1244460656) break block45;
                                                                                                    break block30;
                                                                                                }
                                                                                                if (n > 1583741240) break block46;
                                                                                                if (n == 1295066926) break block47;
                                                                                                if (n == 1583741240) break block48;
                                                                                                break block30;
                                                                                            }
                                                                                            if (n == 1715290263) break block49;
                                                                                            if (n == 1814877584) break block50;
                                                                                            int cfr_ignored_4 = (Integer.rotateRight(0xB32D50D3 ^ n2, 9) + -1227200312) * -1288875821;
                                                                                            if (n == 1907681782) break block51;
                                                                                            break block30;
                                                                                        }
                                                                                        int cfr_ignored_5 = (Integer.rotateLeft(0xE0DE4B70 ^ n2, 15) + 1061732811) * -522302607;
                                                                                        if (zsh2_2.move() != null) {
                                                                                            try {
                                                                                                --n;
                                                                                                if ((0xD809D146EB9608D5L ^ (long)n2 | 1L) == 0L) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEE517AC0));
                                                                                            }
                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                n3 = n2 ^ 0xEE517AC0 ^ 0x9B2B1833 ^ 0x9B2B1833;
                                                                                            }
                                                                                            n -= 2;
                                                                                            continue;
                                                                                        }
                                                                                        n3 = n2 ^ 0x6B230ADF ^ 0x7C9097DC ^ 0x7C9097DC;
                                                                                        int cfr_ignored_6 = (Integer.rotateLeft(0xEF52D794 ^ n2, 16) - -10110425) * -279783531;
                                                                                        n3 = n2 ^ 0xA9052750 ^ 0x5C95949C ^ 0x5C95949C;
                                                                                        n -= 4;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_7 = (Integer.rotateRight(0x6D18EDD6 ^ n2, 16) - 979528741) * 1830350295;
                                                                                    if (zsh2_2.move() == null) {
                                                                                        try {
                                                                                            n += 5;
                                                                                            if ((0x150C68CED5559527L ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                            n3 = (int)((long)(n2 ^ 0xA9052750) ^ 0xA9E3B4D6B1165A8AL ^ 0xA9E3B4D6B1165A8AL);
                                                                                        }
                                                                                        catch (IllegalStateException illegalStateException) {
                                                                                            n3 = (int)((long)(n2 ^ 0xA9052750) ^ 0x5EBDD7C3A29FF111L ^ 0x5EBDD7C3A29FF111L);
                                                                                        }
                                                                                        --n;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_8 = (int)(0x1918D031303C1A25L ^ (long)n2 ^ 0x5D12ACCBCF6D9FE0L);
                                                                                    n3 = (int)((long)(n2 ^ 0x32BBBA51) ^ 0x704722C104F6F269L ^ 0x704722C104F6F269L);
                                                                                    int cfr_ignored_9 = (int)(0x2CA7700FBC5C5982L ^ (long)n2 ^ 0x1D6FB40B4823F49FL);
                                                                                    n3 = n2 ^ 0xEE517AC0 ^ 0xD3C289BE ^ 0xD3C289BE;
                                                                                    n += 4;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_10 = Integer.rotateLeft(0x5C732825 ^ n2, 14) - 911178678;
                                                                                int cfr_ignored_11 = (int)(0x9EC1861827D4EB4FL ^ (long)n2 ^ 0xF140831A2DB89052L);
                                                                                bws.thjsh(bws.shzt(zsh2_2.move()), bws.zath_2(bws.rsha(zsh2_2)));
                                                                                int cfr_ignored_12 = (int)(0x82716846E7D2AFFCL ^ (long)n2 ^ 0x2DFD0316A4DEA933L);
                                                                                n3 = n2 ^ 0xA9052750 ^ 0x93C19A0B ^ 0x93C19A0B;
                                                                                n -= 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_13 = (Integer.rotateRight(0xD72C55DE ^ n2, 13) - 314311965) * -684960289;
                                                                            if (!yf.dnkh()) {
                                                                                try {
                                                                                    --n;
                                                                                    if ((0x3F90C97737E1E48FL ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x6C2CD590));
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    n3 = (n2 ^ 0x6C2CD590) + 751589903 - 751589903;
                                                                                }
                                                                                n -= 2;
                                                                                continue;
                                                                            }
                                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9D4E1979));
                                                                            int cfr_ignored_14 = Integer.rotateLeft(0xD082084D ^ n2, 13) - 1142726798;
                                                                            int cfr_ignored_15 = (int)(0x1230A67027D4EB4FL ^ (long)n2 ^ 0xB190831A2DB989B0L);
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_16 = (Integer.rotateLeft(0x293749B4 ^ n2, 8) - 34573319) * 691489205;
                                                                        return;
                                                                    }
                                                                    int cfr_ignored_17 = (Integer.rotateLeft(0xD1A3451D ^ n2, 13) - 1730346430) * -777829091;
                                                                    int cfr_ignored_18 = (int)(0x1311EB2027D4EB4FL ^ (long)n2 ^ 0x2B30831A2DB98BF2L);
                                                                    throw null;
                                                                }
                                                                int cfr_ignored_19 = (Integer.rotateLeft(0xFA65883D ^ n2, 18) - 1453923998) * -94009283;
                                                                int cfr_ignored_20 = (int)(0x38D7260027D4EB4FL ^ (long)n2 ^ 0xB170831A2DB9DC7FL);
                                                                if (zsh2_2 == null) {
                                                                    try {
                                                                        n -= 2;
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA9052750));
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA9052750));
                                                                    }
                                                                    continue;
                                                                }
                                                                n3 = n2 ^ 0xDCD57EB3 ^ 0xAF58DA14 ^ 0xAF58DA14;
                                                                int cfr_ignored_21 = (Integer.rotateLeft(0x6EBAEF1 ^ n2, 3) + -622342550) * 116109041;
                                                                int cfr_ignored_22 = (int)(0xC45900CC27D4EB4FL ^ (long)n2 ^ 0xFCE8831A2DB82563L);
                                                                n3 = (n2 ^ 0x319815FC) + 1650145568 - 1650145568;
                                                                n -= 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_23 = Integer.rotateLeft(0xFF8FFFA9 ^ n2, 18) + -154299214;
                                                            int cfr_ignored_24 = (int)(0x3D3D519427D4EB4FL ^ (long)n2 ^ 0x5E58831A2DB9D7ABL);
                                                            n3 = (n2 ^ 0xFD7281B) + -213207375 - -213207375;
                                                            int cfr_ignored_25 = Integer.rotateRight(0x26E049CE ^ n2, 7) - -1182363859;
                                                            n3 = (n2 ^ 0x918DFF80) + 1430674296 - 1430674296;
                                                            int cfr_ignored_26 = (Integer.rotateLeft(0x1699FA19 ^ n2, 5) + -1056774078) * 379189785;
                                                            int cfr_ignored_27 = (int)(0xD42B542427D4EB4FL ^ (long)n2 ^ 0x5538831A2DB80587L);
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5E65F938));
                                                            n -= 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_28 = Integer.rotateLeft(0xE30BD24D ^ n2, 15) - -2100554098;
                                                        int cfr_ignored_29 = (int)(0x21B97C7027D4EB4FL ^ (long)n2 ^ 0x590831A2DB9EEA3L);
                                                        n3 = n2 ^ 0x713E31C8;
                                                        int cfr_ignored_30 = Integer.rotateRight(0xBDC84CE3 ^ n2, 10) + -6361416;
                                                        try {
                                                            n += 2;
                                                            if ((0xBCF70B8C6507A079L ^ (long)n2 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            n3 = (n2 ^ 0x5E65F938) + -1955219353 - -1955219353;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n3 = n2 ^ 0x5E65F938;
                                                        }
                                                        n -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_31 = (Integer.rotateRight(0x22CAF4F3 ^ n2, 7) + 988891304) * 583726323;
                                                    n3 = n2 ^ 0xF09F6453 ^ 0x32DF4BA1 ^ 0x32DF4BA1;
                                                    int cfr_ignored_32 = Integer.rotateLeft(0xB8763108 ^ n2, 10) + 1521323827;
                                                    n3 = (n2 ^ 0x80026FD3) + -2029072227 - -2029072227;
                                                    int cfr_ignored_33 = (Integer.rotateLeft(0x6F586DD8 ^ n2, 16) + -2146243485) * 1868066265;
                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5E65F938));
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_34 = Integer.rotateRight(0x27FF8342 ^ n2, 7) + -598834119;
                                                n3 = n2 ^ 0xA4F813A;
                                                bwa.ghda_4(1215902016, n2);
                                                int cfr_ignored_35 = (int)(0xD64E48F97F4A7C15L ^ (long)n2 ^ 0x6C823227030C014DL);
                                                n3 = (n2 ^ 0x5E65F938) + 582529689 - 582529689;
                                                n += 4;
                                                continue;
                                            }
                                            int cfr_ignored_36 = Integer.rotateLeft(0x55504604 ^ n2, 13) - 1494620599;
                                            try {
                                                if ((0xE1D5CF683AD6A07FL ^ (long)n2 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                n3 = (int)((long)(n2 ^ 0x5E65F938) ^ 0xBAB468900312B9ADL ^ 0xBAB468900312B9ADL);
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5E65F938));
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_37 = (Integer.rotateLeft(0x2F41B6F5 ^ n2, 8) - -1118648602) * 792835829;
                                        int cfr_ignored_38 = (int)(0xEDF318C827D4EB4FL ^ (long)n2 ^ 0xCCE0831A2DB87637L);
                                        n3 = n2 ^ 0xD87AD496 ^ 0x76D4C88E ^ 0x76D4C88E;
                                        int cfr_ignored_39 = Integer.rotateLeft(0xB75C3B05 ^ n2, 9) - 948487382;
                                        int cfr_ignored_40 = (int)(0x75EE953827D4EB4FL ^ (long)n2 ^ 0xD700831A2DB9460CL);
                                        n3 = (int)((long)(n2 ^ 0x5E65F938) ^ 0xB6FD9118C516A8CBL ^ 0xB6FD9118C516A8CBL);
                                        int cfr_ignored_41 = (Integer.rotateRight(0x10250372 ^ n2, 5) + -119993847) * 270861171;
                                        n += 2;
                                        continue;
                                    }
                                    int cfr_ignored_42 = (Integer.rotateRight(0x526A41F ^ n2, 3) - -1542750468) * 86418463;
                                    n3 = (n2 ^ 0x5E2B128B) + -1109280153 - -1109280153;
                                    int cfr_ignored_43 = Integer.rotateLeft(0x2016EEC ^ n2, 3) - 1116343759;
                                    n3 = (int)((long)(n2 ^ 0x5E65F938) ^ 0xAA0AA152424681BL ^ 0xAA0AA152424681BL);
                                    continue;
                                }
                                int cfr_ignored_44 = Integer.rotateRight(0xE6B5087 ^ n2, 4) - -1017356396;
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5E65F938));
                                int cfr_ignored_45 = (Integer.rotateRight(0x6E58DCBA ^ n2, 16) + 1629510081) * 1851317435;
                                n += 4;
                                continue;
                            }
                            int cfr_ignored_46 = (Integer.rotateLeft(0x62EEE19 ^ n2, 3) + -1005816766) * 103738905;
                            int cfr_ignored_47 = (int)(0xC49C402427D4EB4FL ^ (long)n2 ^ 0x7D38831A2DB824E9L);
                            int cfr_ignored_48 = (int)(0x992D842501FFEB0CL ^ (long)n2 ^ 0xF53ACF4C2D3E9F8AL);
                            n3 = n2 ^ 0x5E65F938 ^ 0xEE8D1873 ^ 0xEE8D1873;
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_49 = Integer.rotateRight(0x36170846 ^ n2, 9) - -1859674187;
                        int cfr_ignored_50 = (int)(0xB1F45243178CBB92L ^ (long)n2 ^ 0x59F6E3AA8C02CE39L);
                        n3 = (n2 ^ 0xA03CA3A7) + -1135994584 - -1135994584;
                        int cfr_ignored_51 = (int)(0x81AFA4EBF8429FF0L ^ (long)n2 ^ 0xB4A73C36C4C6AE8EL);
                        n3 = n2 ^ 0x5E65F938 ^ 0x42A99C76 ^ 0x42A99C76;
                        n += 3;
                        continue;
                    }
                    int cfr_ignored_52 = (Integer.rotateRight(0xA38AC6D3 ^ n2, 7) + -768888120) * -1551186221;
                    try {
                        ++n;
                        if ((0xD7FA5D2BEB94FFE5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (n2 ^ 0x5E65F938) + 1856233605 - 1856233605;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5E65F938));
                    }
                    n -= 3;
                    continue;
                }
                int cfr_ignored_53 = (Integer.rotateLeft(0x387DBF54 ^ n2, 10) - -610809241) * 947765077;
                n3 = n2 ^ 0x1EB98C7C;
                int cfr_ignored_54 = Integer.rotateLeft(0xBBAAE8C4 ^ n2, 10) - -1106260233;
                n3 = n2 ^ 0x9D419B34 ^ 0x7F2D9D3E ^ 0x7F2D9D3E;
                int cfr_ignored_55 = (Integer.rotateLeft(0xD307705C ^ n2, 13) - -1841022369) * -754487203;
                n3 = (n2 ^ 0x5E65F938) + 2065476335 - 2065476335;
                continue;
            }
            int cfr_ignored_56 = Integer.rotateLeft(0x71E7EE2D ^ n2, 17) - -814516562;
            int cfr_ignored_57 = (int)(0xB355401027D4EB4FL ^ (long)n2 ^ 0x7D50831A2DB8CB7BL);
            n3 = n2 ^ 0x5E65F938 ^ 0x44E24F28 ^ 0x44E24F28;
        }
    }

    private void dhfz_2() {
        int n = 0;
        int n2 = 1581651472;
        n2 = Integer.rotateLeft(n2 * 357824571, 21) ^ 0x95DE118C;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(-1232690028 * 1057859283 + -1270331658 ^ n2));
        block45: while (true) {
            switch (((n3 ^ n2) - -1270331658) * 804888923) {
                case -1232690023: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x1B23409B ^ n2, 6) + 1302491648) * 455295131;
                    if (!this.khshj) {
                        n3 = -1232690025 * 1057859283 + -1270331658 ^ n2;
                        continue block45;
                    }
                    n3 = (int)((long)(1834562679 * 1057859283 + -1270331658 ^ n2) ^ 0xE8E37B53D05793C7L ^ 0xE8E37B53D05793C7L);
                    int cfr_ignored_1 = Integer.rotateRight(0x610949A2 ^ n2, 15) + -998405671;
                    n3 = (-1232690030 * 1057859283 + -1270331658 ^ n2) + 1254107129 - 1254107129;
                    continue block45;
                }
                case -1232690028: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0x764F32DC ^ n2, 17) - 1475659743) * 1984901853;
                    if (!bws.dadh_2()) {
                        n3 = -1741031638 * 1057859283 + -1270331658 ^ n2;
                        int cfr_ignored_3 = (Integer.rotateLeft(0x78952CDC ^ n2, 18) - -1636954657) * 2023042269;
                        n3 = (-1232690024 * 1057859283 + -1270331658 ^ n2) + -1848026575 - -1848026575;
                        n -= 5;
                        continue block45;
                    }
                    int cfr_ignored_4 = (int)(0x12496A99E9166F7DL ^ (long)n2 ^ 0x28431E9F25DD8943L);
                    n3 = Integer.reverse(Integer.reverse(-1232690032 * 1057859283 + -1270331658 ^ n2));
                    continue block45;
                }
                case -1232690027: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x4A2E98BF ^ n2, 12) - 138844) * 1244567743;
                    this.rrb(this.dhdhz);
                    int cfr_ignored_6 = (int)(0xD68901C9183D4474L ^ (long)n2 ^ 0xFEE2FCC973CE00C3L);
                    n3 = (-1232690026 * 1057859283 + -1270331658 ^ n2) + -798991766 - -798991766;
                    n += 3;
                    continue block45;
                }
                case -1232690024: {
                    int cfr_ignored_7 = Integer.rotateLeft(0x2AACBDCD ^ n2, 8) - 793287438;
                    int cfr_ignored_8 = (int)(0xE81E13F027D4EB4FL ^ (long)n2 ^ 0xDA90831A2DB87DEDL);
                    bws.dsht_3();
                    try {
                        if ((0x5CC83CDF509E67DDL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)(-1232690032 * 1057859283 + -1270331658 ^ n2) ^ 0xC95E20F35F328C07L ^ 0xC95E20F35F328C07L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (-1232690032 * 1057859283 + -1270331658 ^ n2) + 1740837416 - 1740837416;
                    }
                    n += 5;
                    continue block45;
                }
                case -1232690022: {
                    int cfr_ignored_9 = (Integer.rotateRight(0xB30C1A5F ^ n2, 9) - -1294675780) * -1291052449;
                    bfn.awy(this.dtt_4);
                    try {
                        ++n;
                        if ((0x5DE9965484451BDL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = -1232690023 * 1057859283 + -1270331658 ^ n2;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (-1232690023 * 1057859283 + -1270331658 ^ n2) + -806051875 - -806051875;
                    }
                    continue block45;
                }
                case -1232690032: {
                    int cfr_ignored_10 = (Integer.rotateRight(0xBFDEED56 ^ n2, 10) - 1079794853) * -1075909289;
                    if (bws.mc.field_1724 == null) {
                        int cfr_ignored_11 = (int)(0x17303C36379FBB7DL ^ (long)n2 ^ 0x851CA38C8DDD83B1L);
                        n3 = (int)((long)(-1232690026 * 1057859283 + -1270331658 ^ n2) ^ 0x2FED50FF9A50E6BL ^ 0x2FED50FF9A50E6BL);
                        --n;
                        continue block45;
                    }
                    n3 = -1232690031 * 1057859283 + -1270331658 ^ n2;
                    continue block45;
                }
                case -1232690021: {
                    int cfr_ignored_12 = Integer.rotateLeft(0x8CDE2DE4 ^ n2, 4) - 323300823;
                    if (this.dtt_4 < Integer.rotateLeft(0x6282666C ^ 0xF282666C, 4)) {
                        try {
                            --n;
                            if ((0x171CEDAF1F0F39CBL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = (-1232690022 * 1057859283 + -1270331658 ^ n2) + -1586623706 - -1586623706;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = -1232690022 * 1057859283 + -1270331658 ^ n2;
                        }
                        ++n;
                        continue block45;
                    }
                    try {
                        n -= 2;
                        n3 = Integer.reverse(Integer.reverse(-1232690023 * 1057859283 + -1270331658 ^ n2));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (-1232690023 * 1057859283 + -1270331658 ^ n2) + -1266366891 - -1266366891;
                    }
                    n += 4;
                    continue block45;
                }
                case -1232690031: {
                    int cfr_ignored_13 = Integer.rotateRight(0x51AE480B ^ n2, 13) + -394766192;
                    if (bws.mc.field_1761 == null) {
                        n3 = Integer.reverse(Integer.reverse(-1232690026 * 1057859283 + -1270331658 ^ n2));
                        int cfr_ignored_14 = Integer.rotateRight(0x234E84A7 ^ n2, 7) - 1256173428;
                        continue block45;
                    }
                    n3 = 151232394 * 1057859283 + -1270331658 ^ n2 ^ 0xA34393EB ^ 0xA34393EB;
                    int cfr_ignored_15 = Integer.rotateRight(0x729B4B8F ^ n2, 17) - -450116212;
                    n3 = -1232690020 * 1057859283 + -1270331658 ^ n2 ^ 0x4B38E907 ^ 0x4B38E907;
                    continue block45;
                }
                case -1232690030: {
                    int cfr_ignored_16 = Integer.rotateRight(0x3131916F ^ n2, 9) - -111264852;
                    this.rrb(this.khlgh);
                    try {
                        n += 5;
                        if ((0x94F8D225BC735BCDL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = -1232690025 * 1057859283 + -1270331658 ^ n2 ^ 0xEA85E6E1 ^ 0xEA85E6E1;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(-1232690025 * 1057859283 + -1270331658 ^ n2));
                    }
                    n -= 3;
                    continue block45;
                }
                case -1232690029: {
                    int cfr_ignored_17 = Integer.rotateRight(0x4267A342 ^ n2, 11) + 250242105;
                    if (this.dtt_4 >= 0) {
                        try {
                            --n;
                            n3 = -1232690021 * 1057859283 + -1270331658 ^ n2 ^ 0xEB744742 ^ 0xEB744742;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = Integer.reverse(Integer.reverse(-1232690021 * 1057859283 + -1270331658 ^ n2));
                        }
                        n += 3;
                        continue block45;
                    }
                    try {
                        n3 = -1232690023 * 1057859283 + -1270331658 ^ n2 ^ 0xF5661311 ^ 0xF5661311;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(-1232690023 * 1057859283 + -1270331658 ^ n2) ^ 0xF9987D694758D948L ^ 0xF9987D694758D948L);
                    }
                    n += 3;
                    continue block45;
                }
                case -1232690020: {
                    int cfr_ignored_18 = Integer.rotateLeft(0xD80D6D61 ^ n2, 14) + 771612154;
                    int cfr_ignored_19 = (int)(0x1ABFC35C27D4EB4FL ^ (long)n2 ^ 0x7BC8831A2DB998AEL);
                    if (this.dtt_4 < 0) {
                        n3 = (-1232690023 * 1057859283 + -1270331658 ^ n2) + 1520819219 - 1520819219;
                        --n;
                        continue block45;
                    }
                    int cfr_ignored_20 = (int)(0x27ADDF2107296B5L ^ (long)n2 ^ 0x4694EC56D64DA924L);
                    n3 = Integer.reverse(Integer.reverse(529003329 * 1057859283 + -1270331658 ^ n2));
                    int cfr_ignored_21 = (int)(0x170281DF83BEE633L ^ (long)n2 ^ 0xFECFCBCE374183D4L);
                    n3 = -1232690021 * 1057859283 + -1270331658 ^ n2;
                    n -= 5;
                    continue block45;
                }
                case -1232690025: {
                    int cfr_ignored_22 = Integer.rotateLeft(0x6D0ACAE5 ^ n2, 16) - 950808822;
                    int cfr_ignored_23 = (int)(0xAFB864D827D4EB4FL ^ (long)n2 ^ 0x34C0831A2DB8F2A1L);
                    if (!this.dhhf_2) {
                        int cfr_ignored_24 = (int)(0xC49634EC5467B5C2L ^ (long)n2 ^ 0x94A8647C90A224FDL);
                        n3 = 501965954 * 1057859283 + -1270331658 ^ n2 ^ 0xB44A4751 ^ 0xB44A4751;
                        int cfr_ignored_25 = (int)(0xAF52CDB76B40F46FL ^ (long)n2 ^ 0x661E1A3213F8F374L);
                        n3 = (-1232690026 * 1057859283 + -1270331658 ^ n2) + 1740667762 - 1740667762;
                        continue block45;
                    }
                    n3 = 235551997 * 1057859283 + -1270331658 ^ n2 ^ 0xA6742A04 ^ 0xA6742A04;
                    bwa.ghda_4(1376830272, n2);
                    int cfr_ignored_26 = (int)(0xCC27BAF97F4A7C15L ^ (long)n2 ^ 0x88823227030C359EL);
                    n3 = -1232690027 * 1057859283 + -1270331658 ^ n2;
                    n += 2;
                    continue block45;
                }
                case -1232690026: {
                    int cfr_ignored_27 = (Integer.rotateRight(0x2FACAFD3 ^ n2, 8) + -901322296) * 799846355;
                    this.bfw();
                    return;
                }
                case -1232690019: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0xBB6C911 ^ n2, 4) + 1870657610) * 196528401;
                    int cfr_ignored_29 = (int)(0xC904672C27D4EB4FL ^ (long)n2 ^ 0x3328831A2DB83FD9L);
                    n3 = -1191344389 * 1057859283 + -1270331658 ^ n2 ^ 0xC77E9DD8 ^ 0xC77E9DD8;
                    int cfr_ignored_30 = Integer.rotateLeft(0x148E5A8C ^ n2, 5) - -2120575441;
                    n3 = 1149152169 * 1057859283 + -1270331658 ^ n2;
                    int cfr_ignored_31 = Integer.rotateLeft(0x31D5E6C5 ^ n2, 9) - 222597398;
                    int cfr_ignored_32 = (int)(0xF36748F827D4EB4FL ^ (long)n2 ^ 0x6C80831A2DB84B1FL);
                    n3 = -1232690028 * 1057859283 + -1270331658 ^ n2 ^ 0x1EFE3D6C ^ 0x1EFE3D6C;
                    n += 5;
                    continue block45;
                }
                case -1232690018: {
                    int cfr_ignored_33 = Integer.rotateLeft(0x1225DAED ^ n2, 5) - 921903598;
                    int cfr_ignored_34 = (int)(0xD09774D027D4EB4FL ^ (long)n2 ^ 0x14D0831A2DB80CFFL);
                    n3 = 638358363 * 1057859283 + -1270331658 ^ n2 ^ 0x84C572E6 ^ 0x84C572E6;
                    int cfr_ignored_35 = (Integer.rotateRight(0xC7FBEB76 ^ n2, 11) - 1004479109) * -939791497;
                    n3 = (-1232690028 * 1057859283 + -1270331658 ^ n2) + -471900202 - -471900202;
                    continue block45;
                }
                case -1232690017: {
                    int cfr_ignored_36 = (Integer.rotateLeft(0xDD723B58 ^ n2, 14) + -718090525) * -579716263;
                    n3 = -1232690028 * 1057859283 + -1270331658 ^ n2 ^ 0x4033A863 ^ 0x4033A863;
                    int cfr_ignored_37 = Integer.rotateLeft(0x241B144 ^ n2, 3) - 1246893687;
                    ++n;
                    continue block45;
                }
                case -1232690016: {
                    int cfr_ignored_38 = Integer.rotateLeft(0xB2645D88 ^ n2, 9) + -1635454285;
                    n3 = Integer.reverse(Integer.reverse(1464333407 * 1057859283 + -1270331658 ^ n2));
                    int cfr_ignored_39 = Integer.rotateRight(0xBA813C46 ^ n2, 10) - -1711019083;
                    n3 = (int)((long)(-1232690028 * 1057859283 + -1270331658 ^ n2) ^ 0xC0576A71DA95DCBBL ^ 0xC0576A71DA95DCBBL);
                    int cfr_ignored_40 = Integer.rotateLeft(0x8EB25021 ^ n2, 4) + 1274368826;
                    int cfr_ignored_41 = (int)(0x4C00FE1C27D4EB4FL ^ (long)n2 ^ 0x148831A2DB935D0L);
                    n -= 2;
                    continue block45;
                }
                case -1232690015: {
                    int cfr_ignored_42 = (Integer.rotateLeft(0xE98D7CDD ^ n2, 16) - 1283440126) * -376603427;
                    int cfr_ignored_43 = (int)(0x2B3FD2E027D4EB4FL ^ (long)n2 ^ 0x58B0831A2DB9FBAEL);
                    try {
                        --n;
                        if ((0xBE922A3DE5FD536FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-1232690028 * 1057859283 + -1270331658 ^ n2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -1232690028 * 1057859283 + -1270331658 ^ n2 ^ 0x8A792AA1 ^ 0x8A792AA1;
                    }
                    n -= 3;
                    continue block45;
                }
                case -1232690014: {
                    int cfr_ignored_44 = Integer.rotateRight(0xA92D2C2A ^ n2, 8) + -2133460911;
                    n3 = 1701646529 * 1057859283 + -1270331658 ^ n2 ^ 0xF086D19B ^ 0xF086D19B;
                    int cfr_ignored_45 = Integer.rotateLeft(0x5F0F7DCC ^ n2, 14) - -2025989393;
                    n3 = (int)((long)(-1232690028 * 1057859283 + -1270331658 ^ n2) ^ 0xA83A742380AE603AL ^ 0xA83A742380AE603AL);
                    continue block45;
                }
                case -1232690013: {
                    int cfr_ignored_46 = Integer.rotateRight(0xD7525946 ^ n2, 13) - 391540405;
                    n3 = (1792626472 * 1057859283 + -1270331658 ^ n2) + -1777564115 - -1777564115;
                    int cfr_ignored_47 = Integer.rotateLeft(0xE8FA2188 ^ n2, 16) + 984067763;
                    n3 = -835899366 * 1057859283 + -1270331658 ^ n2;
                    int cfr_ignored_48 = (Integer.rotateRight(0xD71AE7D6 ^ n2, 13) - 278901285) * -686102569;
                    n3 = (-1232690028 * 1057859283 + -1270331658 ^ n2) + -1035665233 - -1035665233;
                    ++n;
                    continue block45;
                }
                case -1232690012: {
                    int cfr_ignored_49 = Integer.rotateRight(0x2EB1244F ^ n2, 8) - -1412365108;
                    n3 = 1045935066 * 1057859283 + -1270331658 ^ n2;
                    int cfr_ignored_50 = Integer.rotateRight(0xC4E213E2 ^ n2, 11) + -608303207;
                    n3 = Integer.reverse(Integer.reverse(-1232690028 * 1057859283 + -1270331658 ^ n2));
                    n -= 3;
                    continue block45;
                }
                case -1232690011: {
                    int cfr_ignored_51 = (Integer.rotateRight(0xC35ABE7B ^ n2, 11) + -1403342816) * -1017463173;
                    n3 = (2063875477 * 1057859283 + -1270331658 ^ n2) + 1584536803 - 1584536803;
                    int cfr_ignored_52 = (Integer.rotateLeft(0x6C9AC914 ^ n2, 16) - 723253415) * 1822083349;
                    n3 = 1718990922 * 1057859283 + -1270331658 ^ n2 ^ 0x183901F6 ^ 0x183901F6;
                    int cfr_ignored_53 = (Integer.rotateLeft(0x87B1FEBC ^ n2, 3) - 1928034303) * -2018378051;
                    n3 = -1232690028 * 1057859283 + -1270331658 ^ n2;
                    continue block45;
                }
                case -1232690010: {
                    int cfr_ignored_54 = (Integer.rotateLeft(0xAAD090F9 ^ n2, 8) + -1281413790) * -1429171975;
                    int cfr_ignored_55 = (int)(0x68623EC427D4EB4FL ^ (long)n2 ^ 0x80F8831A2DB97D15L);
                    n3 = (1154075001 * 1057859283 + -1270331658 ^ n2) + -433609608 - -433609608;
                    int cfr_ignored_56 = (Integer.rotateRight(0x509827DB ^ n2, 13) + -959810880) * 1352148955;
                    int cfr_ignored_57 = (int)(0xDC5073A1A01E7263L ^ (long)n2 ^ 0x1A338C8F1FE01571L);
                    n3 = Integer.reverse(Integer.reverse(-1232690028 * 1057859283 + -1270331658 ^ n2));
                    continue block45;
                }
                case -1232690009: {
                    int cfr_ignored_58 = (Integer.rotateLeft(0xFE4FB7FD ^ n2, 18) - -804985122) * -28329987;
                    int cfr_ignored_59 = (int)(0x3CFD19C027D4EB4FL ^ (long)n2 ^ 0xCEF0831A2DB9D42BL);
                    try {
                        ++n;
                        if ((0x239A908D86FFC115L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-1232690028 * 1057859283 + -1270331658 ^ n2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(-1232690028 * 1057859283 + -1270331658 ^ n2));
                    }
                    n += 2;
                    continue block45;
                }
                case -1232690008: {
                    int cfr_ignored_60 = (Integer.rotateRight(0x71BE0FDE ^ n2, 17) - -899577059) * 1908281311;
                    n3 = Integer.reverse(Integer.reverse(805357836 * 1057859283 + -1270331658 ^ n2));
                    int cfr_ignored_61 = Integer.rotateLeft(0x928AF76C ^ n2, 5) - -1020160689;
                    int cfr_ignored_62 = (int)(0x217324247397F74CL ^ (long)n2 ^ 0xB5382B9C15BFEF37L);
                    n3 = -1232690028 * 1057859283 + -1270331658 ^ n2 ^ 0x360DB602 ^ 0x360DB602;
                    --n;
                    continue block45;
                }
            }
            int cfr_ignored_63 = (Integer.rotateLeft(0xC5E2A075 ^ n2, 11) - -87093914) * -975003531;
            int cfr_ignored_64 = (int)(0x7500E4827D4EB4FL ^ (long)n2 ^ 0xE1E0831A2DB9A371L);
            n3 = -1232690028 * 1057859283 + -1270331658 ^ n2 ^ 0xA033E994 ^ 0xA033E994;
        }
    }

    private void bfw() {
        int n = 1021196848;
        n = Integer.rotateLeft(n * -1318250149, 4) ^ 0x1B7B5E3B;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
        int n2 = n ^ 0xEA031D4C;
        if ((n2 ^ n) != -368894644) {
            int cfr_ignored_0 = (0xD6DD277C ^ n) - -275490751;
        }
        this.tqkh = brk.khtn_2;
        this.dhdhz = null;
        this.khlgh = null;
        this.dhhf_2 = false;
        this.khshj = false;
        this.sht_4 = false;
        this.dtt_4 = -1;
        this.thghz_2 = 0;
        this.shtth = 0;
        this.ak = 0.0;
        this.bghj = 0.0f;
        this.dkw = 0.0f;
    }

    private class_2596 sath(int n) {
        int n2 = 1211439104;
        n2 = Integer.rotateLeft(n2 * -1888239433, 7) ^ 0x2B02DAB5;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 19);
        int n3 = n2 ^ 0xECE10300;
        if ((n3 ^ n2) != -320797952) {
            int cfr_ignored_0 = (0xA4D41B00 ^ n2) - -1780239502;
        }
        return new class_2886(class_1268.field_5808, n, this.bghj, this.dkw);
    }

    private void srz_3(bjd_2 bjd2) {
        try {
            int n = -1627074416;
            n = Integer.rotateLeft(n * 1880660015, 16) ^ 0x3DACE851;
            int n2 = n ^ 0xF1EAA67;
            if ((n2 ^ n) != 253667943) {
                int cfr_ignored_0 = (0x901A7AF7 ^ n) - 1355072088;
            }
            if ((0xD8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.tqkh == brk.khtn_2) {
            return;
        }
        if (bws.mc.field_1724 == null || bws.mc.field_1687 == null || bws.mc.field_1761 == null) {
            this.dhfz_2();
            return;
        }
        switch (this.tqkh.ordinal()) {
            case 1: {
                if (this.dhdhz.move() != null) {
                    yn.thmsh(this.dhdhz.move().inventorySlot(), this.dhdhz.move().hotbarSlot());
                    this.dhhf_2 = true;
                }
                this.tqkh = brk.zsgh;
                break;
            }
            case 2: {
                if (this.khlgh.move() != null) {
                    yn.thmsh(this.khlgh.move().inventorySlot(), this.khlgh.move().hotbarSlot());
                    this.khshj = true;
                }
                this.tqkh = this.dhan();
                break;
            }
            case 3: {
                if (!bws.mc.field_1724.method_24828()) {
                    this.tqkh = brk.tkhk;
                    return;
                }
                bfn.awy(this.khlgh.slot());
                this.tqkh = brk.dkhkh;
                break;
            }
            case 4: {
                if (this.sht_4 && this.dhtt(this.khlgh, class_1802.field_49098)) {
                    this.shtth = 0;
                    this.tqkh = brk.zdd_2;
                }
                this.sht_4 = false;
                break;
            }
            case 6: {
                bfn.awy(this.dhdhz.slot());
                this.tqkh = brk.bbz;
                break;
            }
            case 7: {
                if (this.sht_4 && this.dhtt(this.dhdhz, class_1802.field_8634)) {
                    this.thghz_2 = Math.max(1, Math.round(this.mh.thw_5()));
                    this.tqkh = brk.dyd;
                }
                this.sht_4 = false;
                break;
            }
            case 9: {
                bfn.awy(this.khlgh.slot());
                this.tqkh = brk.shzth_2;
                break;
            }
            case 10: {
                if (this.sht_4 && this.dhtt(this.khlgh, class_1802.field_49098)) {
                    this.tqkh = brk.khdd_4;
                }
                this.sht_4 = false;
                break;
            }
            case 11: {
                bfn.awy(this.dtt_4);
                brk brk2 = this.khshj ? brk.rzk_2 : (this.tqkh = this.dhhf_2 ? brk.rts : brk.khtn_2);
                if (this.tqkh != brk.khtn_2) break;
                this.bfw();
                break;
            }
            case 12: {
                this.rrb(this.khlgh);
                this.khshj = false;
                brk brk3 = this.tqkh = this.dhhf_2 ? brk.rts : brk.khtn_2;
                if (this.tqkh != brk.khtn_2) break;
                this.bfw();
                break;
            }
            case 13: {
                this.rrb(this.dhdhz);
                this.dhhf_2 = false;
                this.bfw();
            }
        }
    }

    private void tyy(btt btt2) {
        boolean bl;
        boolean bl2;
        int n = bwa.atj(-130034491);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x71D88D55;
        if ((n2 ^ n) != 1910017365) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x89E75990 ^ n, 4) + -1218349141) * -1981326959;
        }
        if (bws.mc.field_1724 == null || bws.mc.field_1687 == null || bws.mc.field_1761 == null) {
            this.dhfz_2();
            return;
        }
        boolean bl3 = bl2 = this.zbt_2.sdhkh() != -1 && brz.rzdh(this.zbt_2.sdhkh());
        if (bl2 && !this.bshz_2 && this.tqkh == brk.khtn_2 && bws.mc.field_1755 == null) {
            this.jkb(false);
        }
        this.bshz_2 = bl2;
        boolean bl4 = bl = this.sas_5.sdhkh() != -1 && brz.rzdh(this.sas_5.sdhkh());
        if (bl && !this.zjkh && this.tqkh == brk.khtn_2 && bws.mc.field_1755 == null) {
            this.jkb(true);
        }
        this.zjkh = bl;
        this.tsha_3();
        this.dwk();
    }

    private static String dhza(String string, int n, int n2, int n3) {
        int n4 = bwa.atj(1100663662);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 19);
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 16)) ^ 0x8B2AC3A9;
        if ((n5 ^ n4) != -1960131671) {
            int cfr_ignored_0 = Integer.rotateRight(0xCAB008C7 ^ n4, 12) - -1884377260;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x636EB767 ^ n2 - i) + sdhth, 14) ^ skhh_2 + i * -1044916569));
        }
        return new String(cArray);
    }

    private static void zshy_2() {
        int n = bwa.atj(1818324095);
        int n2 = n ^ 0xDDA97D9E;
        if ((n2 ^ n) != -576094818) {
            int cfr_ignored_0 = Integer.rotateLeft(0xB1C811E1 ^ n, 9) + -1952986758;
            int cfr_ignored_1 = (int)(0x737ABFDC27D4EB4FL ^ (long)n ^ 0x82C8831A2DB94B24L);
        }
        yf.athz_2();
    }

    private static void day_4(bws bws2) {
        int n = -1608693162;
        int n2 = (n = Integer.rotateLeft(n * 1995322905, 3) ^ 0x4284F823) ^ 0x9BFB2DFA;
        if ((n2 ^ n) != -1678037510) {
            int cfr_ignored_0 = (0x3BE667AC ^ n) + 1767431546;
        }
        bws2.bfw();
    }

    private static boolean skdh() {
        block0: {
            int n = bwa.atj(927455485);
            int n2 = n ^ 0x2FF6CC1A;
            if ((n2 ^ n) == 804703258) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x18B114E7 ^ n, 6) - 30353204;
        }
        return yf.khdha_2();
    }

    private static void thghw() {
        int n = 1732925084;
        int n2 = (n = Integer.rotateLeft(n * 131393055, 21) ^ 0x82063345) ^ 0x7EE5DF29;
        if ((n2 ^ n) != 2128994089) {
            int cfr_ignored_0 = (0x19AF89B5 ^ n) + 127880250;
        }
        yf.athz_2();
    }

    private static void dts_7(bws bws2) {
        int n = bwa.atj(-1056541742);
        int n2 = n ^ 0xD1E1CAEA;
        if ((n2 ^ n) != -773731606) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x10E7B938 ^ n, 5) + 275582211) * 283621689;
        }
        bws2.dhfz_2();
    }

    private static int taa(bws bws2, class_1792 class_17922) {
        block0: {
            int n = bwa.atj(-707510354);
            bws bws3 = bws2;
            n = Integer.rotateLeft((bws3 != null ? System.identityHashCode(bws3) : 0) ^ n, 23);
            class_1792 class_17923 = class_17922;
            n = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n;
            int n2 = n ^ 0x6DD96B3B;
            if ((n2 ^ n) == 1842965307) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB80D5495 ^ n, 10) - 1308286278) * -1207085931;
            int cfr_ignored_1 = (int)(0x7ABFFAA827D4EB4FL ^ (long)n ^ 0x820831A2DB958AEL);
        }
        return bws2.sab(class_17922);
    }

    private static zsh_8 dhjl(bws bws2, class_1792 class_17922, int n, boolean[] blArray) {
        block0: {
            int n2 = -1671289750;
            n2 = Integer.rotateLeft(n2 * -850563499, 20) ^ 0x15CF2D57;
            bws bws3 = bws2;
            n2 = Integer.rotateLeft((bws3 != null ? System.identityHashCode(bws3) : 0) ^ n2, 12);
            class_1792 class_17923 = class_17922;
            n2 = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n2;
            int n3 = n2 ^ 0x19DA4BB9;
            if ((n3 ^ n2) == 433736633) break block0;
            int cfr_ignored_0 = (0x85B86FD3 ^ n2) - 1059637727;
        }
        return bws2.tlq_2(class_17922, n, blArray);
    }

    private static void hhl(bws bws2) {
        int n = -1052808934;
        int n2 = (n = Integer.rotateLeft(n * 1543865271, 24) ^ 0x5880CBE9) ^ 0xB4AA1CED;
        if ((n2 ^ n) != -1263919891) {
            int cfr_ignored_0 = (0x759575F7 ^ n) - 1001989192;
        }
        bws2.bfw();
    }

    private static void shzth_2(bws bws2, float f) {
        int n = 1785404650;
        n = Integer.rotateLeft(n * -994182927, 18) ^ 0x3BE6FD99;
        bws bws3 = bws2;
        n = Integer.rotateRight((bws3 != null ? System.identityHashCode(bws3) : 0) ^ n, 9);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 29);
        int n2 = n ^ 0x5BF30686;
        if ((n2 ^ n) != 1542653574) {
            int cfr_ignored_0 = (0x31981A6C ^ n) - -2059172407;
        }
        bws2.zdf(f);
    }

    private static class_1799 shql(class_1661 class_16612, int n) {
        block0: {
            int n2 = -296401918;
            n2 = Integer.rotateLeft(n2 * 1015460129, 6) ^ 0x9526DA1C;
            int n3 = (n2 = n ^ n2) ^ 0x277B5A74;
            if ((n3 ^ n2) == 662395508) break block0;
            int cfr_ignored_0 = (0xC92E1E76 ^ n2) + 1285122425;
        }
        return class_16612.method_5438(n);
    }

    private static boolean tyh_3(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = -717271484;
            int n2 = (n = Integer.rotateLeft(n * -522890997, 17) ^ 0x5EE346A3) ^ 0xDF6B4E73;
            if ((n2 ^ n) == -546615693) break block0;
            int cfr_ignored_0 = (0xA540037 ^ n) - 2111737704;
        }
        return class_17992.method_31574(class_17922);
    }

    private static void zghs_4(class_746 class_7462, class_1268 class_12682) {
        int n = bwa.atj(-175714971);
        class_746 class_7463 = class_7462;
        n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 4);
        int n2 = n ^ 0x1AC615CB;
        if ((n2 ^ n) != 449189323) {
            int cfr_ignored_0 = Integer.rotateRight(0xEF40D8AE ^ n, 16) - -46670771;
        }
        class_7462.method_6104(class_12682);
    }

    private static int ghdw_2(bws bws2, class_1792 class_17922) {
        block0: {
            int n = 57291322;
            n = Integer.rotateLeft(n * -2010750811, 12) ^ 0xA7D9E248;
            bws bws3 = bws2;
            n = (bws3 != null ? System.identityHashCode(bws3) : 0) ^ n;
            int n2 = n ^ 0x6CD3D97F;
            if ((n2 ^ n) == 1825823103) break block0;
            int cfr_ignored_0 = (0x6FB9EB45 ^ n) - 1769016707;
        }
        return bws2.zkhgh(class_17922);
    }

    private static int rqa(bws bws2, boolean[] blArray) {
        block0: {
            int n = -1827223443;
            n = Integer.rotateLeft(n * 1560396353, 6) ^ 0x7C8363D7;
            bws bws3 = bws2;
            n = (bws3 != null ? System.identityHashCode(bws3) : 0) ^ n;
            int n2 = n ^ 0xDF15BCE;
            if ((n2 ^ n) == 233921486) break block0;
            int cfr_ignored_0 = (0x9EE793A3 ^ n) + 964488422;
        }
        return bws2.khwj(blArray);
    }

    private static class_1661 jkd(class_746 class_7462) {
        block0: {
            int n = bwa.atj(-2056922149);
            int n2 = n ^ 0xECBBEF0D;
            if ((n2 ^ n) == -323227891) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x69DE34D6 ^ n, 16) - -700054235) * 1776170199;
        }
        return class_7462.method_31548();
    }

    private static boolean szz_7(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = bwa.atj(1555821156);
            class_1799 class_17993 = class_17992;
            n = Integer.rotateRight((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 13);
            int n2 = n ^ 0xD1059C26;
            if ((n2 ^ n) == -788161498) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x8DBE6E42 ^ n, 4) + 778893625;
        }
        return class_17992.method_31574(class_17922);
    }

    private static boolean hsr(class_1799 class_17992) {
        block0: {
            int n = bwa.atj(-224636141);
            int n2 = n ^ 0xF9459475;
            if ((n2 ^ n) == -112880523) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xBD9C766 ^ n, 4) - 1941750933;
        }
        return class_17992.method_7960();
    }

    private static int ashk() {
        block0: {
            int n = 522047734;
            int n2 = (n = Integer.rotateLeft(n * 340735767, 4) ^ 0x66CD0885) ^ 0xB8F0450B;
            if ((n2 ^ n) == -1192213237) break block0;
            int cfr_ignored_0 = (0xA7ED95FD ^ n) + 2098183118;
        }
        return yf.tdhth_2();
    }

    private static class_1661 dhb(class_746 class_7462) {
        block0: {
            int n = bwa.atj(28681464);
            int n2 = n ^ 0x9C9B298B;
            if ((n2 ^ n) == -1667552885) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9D2E8D73 ^ n, 6) + 218153000) * -1657893517;
        }
        return class_7462.method_31548();
    }

    private static class_1799 ghrs(class_1661 class_16612, int n) {
        block0: {
            int n2 = bwa.atj(-136569975);
            int n3 = n2 ^ 0xDBAFCF0F;
            if ((n3 ^ n2) == -609235185) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x2C73D486 ^ n2, 8) - 1717853045;
        }
        return class_16612.method_5438(n);
    }

    private static class_1661 khshgh(class_746 class_7462) {
        block0: {
            int n = bwa.atj(1014369994);
            int n2 = n ^ 0x54405DA9;
            if ((n2 ^ n) == 1413504425) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x68365363 ^ n, 16) + -1561216968;
        }
        return class_7462.method_31548();
    }

    private static int shzt(bhk_2 bhk2_2) {
        block0: {
            int n = 1038107517;
            int n2 = (n = Integer.rotateLeft(n * 456071609, 28) ^ 0xB82DDD73) ^ 0xDA0EE218;
            if ((n2 ^ n) == -636558824) break block0;
            int cfr_ignored_0 = (0xE7EEA165 ^ n) + -440187202;
        }
        return bhk2_2.inventorySlot();
    }

    private static bhk_2 rsha(zsh_8 zsh2_2) {
        block0: {
            int n = 700556178;
            int n2 = (n = Integer.rotateLeft(n * -248640645, 20) ^ 0x61A604ED) ^ 0x85C041D8;
            if ((n2 ^ n) == -2050997800) break block0;
            int cfr_ignored_0 = (0xAC01E24A ^ n) + 1414082054;
        }
        return zsh2_2.move();
    }

    private static int zath_2(bhk_2 bhk2_2) {
        block0: {
            int n = -801949877;
            int n2 = (n = Integer.rotateLeft(n * -1652184757, 15) ^ 0x996D71E7) ^ 0x1C4DCB61;
            if ((n2 ^ n) == 474860385) break block0;
            int cfr_ignored_0 = (0xCC7EFC2A ^ n) - 687602178;
        }
        return bhk2_2.hotbarSlot();
    }

    private static void thjsh(int n, int n2) {
        int n3 = bwa.atj(-1729668536);
        int n4 = (n3 = n2 ^ n3) ^ 0x1A4E3687;
        if ((n4 ^ n3) != 441333383) {
            int cfr_ignored_0 = Integer.rotateRight(0x82A96CCF ^ n3, 3) - -689845172;
        }
        yn.thmsh(n, n2);
    }

    private static boolean dadh_2() {
        block0: {
            int n = -1120745064;
            int n2 = (n = Integer.rotateLeft(n * 1336324691, 21) ^ 0x621B0BA5) ^ 0x96D04EF8;
            if ((n2 ^ n) == -1764733192) break block0;
            int cfr_ignored_0 = (0x2BE28760 ^ n) + -70304796;
        }
        return yf.khdha_2();
    }

    private static void dsht_3() {
        int n = -852864924;
        int n2 = (n = Integer.rotateLeft(n * -1308449311, 9) ^ 0x38B7C802) ^ 0x63FEA87C;
        if ((n2 ^ n) != 1677633660) {
            int cfr_ignored_0 = (0xAED4F818 ^ n) + -1273930605;
        }
        yf.athz_2();
    }

    private static String[] slh_4(String string) {
        int n = 1363443939;
        int n2 = (n = Integer.rotateLeft(n * -1727208651, 5) ^ 0xF1326E55) ^ 0x13D146A0;
        if ((n2 ^ n) != 332482208) {
            int cfr_ignored_0 = (0x4295C643 ^ n) - -383198360;
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

    private static CallSite rrd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1312790152;
            n3 = Integer.rotateLeft(n3 * -367161875, 9) ^ 0x23E543A4;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0x991CE6BD;
            if ((n4 ^ n3) != -1726159171) {
                int cfr_ignored_0 = (0x28DC8FC5 ^ n3) - 807014634;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ thqm ^ string.hashCode() ^ n2 + zty_2 + i * -3225725) + thqm) ^ zty_2));
            }
            String[] stringArray = bws.slh_4(new String(cArray));
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

    private static String[] co42wn20shg(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite onoyrsrcs6uu5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dp9249lemlf75 ^ string.hashCode() ^ n2 + yfy6qlh5mjr ^ i * -2138596681 ^ dp9249lemlf75, 17) ^ yfy6qlh5mjr));
            }
            String[] stringArray = bws.co42wn20shg(new String(cArray));
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

