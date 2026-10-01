/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_437;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bdht_2;
import us.m0vy.moondlc.m0vyguard.brr;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.tkhd;
import us.m0vy.moondlc.m0vyguard.dha_6;
import us.m0vy.moondlc.m0vyguard.ah_2;
import us.m0vy.moondlc.m0vyguard.ghkh;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class btha {
    private static final int zth_8 = -1278622601;
    private static final int dhht = -1661202197;
    private static final int thkt = -552344373;
    private static final int dhmt = -1256388605;
    private static final int agkcngja5vea = -181375938;
    private static final int h9lauku7p8joa = -416951827;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int finiixnqci;

    public bthn zdht_4() {
        try {
            int n = -1279398797;
            n = Integer.rotateLeft(n * -1471464593, 4) ^ 0xB8F9BE02;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6C1F850D;
            if ((n2 ^ n) != 1814005005) {
                int cfr_ignored_0 = (0xDFA2697E ^ n) - -1792785361;
            }
            if ((0x3D0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!btha.ttj_2()) {
            yf.athz_2();
        }
        return btha.thhdh_2(bdht_2.jngh("clickgui", this::dzdh_2));
    }

    private void zar_2(bths_2 bths2) {
        String string;
        int n = 850141364;
        n = Integer.rotateLeft(n * -1028803805, 27) ^ 0xEFAE89C9;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xBEA6168C;
        if ((n2 ^ n) != -1096411508) {
            int cfr_ignored_0 = (0x8C0A3638 ^ n) - -2028035864;
        }
        String string2 = bths2.arguments().size() > 0 ? (String)btha.tnkh_2(bths2).get(0) : null;
        String string3 = string = btha.thky(bths2).size() > 1 ? (String)bths2.arguments().get(1) : null;
        if (string2 == null || string2.equalsIgnoreCase("open")) {
            btha.dh_5(class_310.method_1551(), btha::khan_2);
        } else if (btha.asw_2(string2, "bind")) {
            if (string == null) {
                bzh_4.dhght_2(class_2561.method_30163((String)btha.khtb_2("Ꙟ這㶨콏飪櫔瑭Ƃ印㴞꺸塓׼", -647440582 + 1393105715, Integer.rotateLeft(0x8D8B8D7E ^ 0xD5CE2AB9, 6), btha.khzgh(0x348C4307 ^ 0x1BF6E721, 7)).concat("gui bind <key>")));
                return;
            }
            int n3 = brz.zya_4(string);
            if (n3 == -1) {
                btha.dhls(class_2561.method_30163((String)("Key " + string + " not found.")));
                return;
            }
            dha_6 dha2 = (dha_6)Moondlc.getInstance().getModuleManager().dfr_2(dha_6.class);
            if (dha2 != null) {
                dha2.zhs_5(n3);
                bzh_4.ttht_3(btha.zzw_4("Click GUI bound to " + brz.adq(n3) + "."));
            } else {
                btha.slr_2(class_2561.method_30163((String)"Click GUI module not found."));
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void khan_2() {
        var2 = 0;
        var0_1 = 598048026;
        var0_1 = Integer.rotateLeft(var0_1 * -1860023683, 28) ^ -1209482286;
        var1_2 = (-1988450383 * -1646143101 + 887629778 ^ var0_1) + 1371614519 - 1371614519;
        while (true) {
            block50: {
                block41: {
                    block43: {
                        block40: {
                            block42: {
                                block44: {
                                    block39: {
                                        block45: {
                                            block46: {
                                                block48: {
                                                    block49: {
                                                        block51: {
                                                            block47: {
                                                                var2 = ((var1_2 ^ var0_1) - 887629778) * -1554055893;
                                                                switch (var2 & 7) {
                                                                    case 5: {
                                                                        if (var2 == 137085949) break block39;
                                                                        if (var2 == -1692373347) break block40;
                                                                        if (var2 == 1462032717) break block41;
                                                                        if (var2 != -458692267) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 4: {
                                                                        if (var2 == -718627716) break block43;
                                                                        if (var2 != -738030788) {
                                                                            ** break;
                                                                        }
                                                                        break block44;
                                                                    }
                                                                    case 0: {
                                                                        if (var2 == 308976408) break block45;
                                                                        if (var2 == 600305392) break block46;
                                                                        (Integer.rotateLeft(-111947595 ^ var0_1, 18) - 897836326) * -111947595;
                                                                        (int)(4314869041246563151L ^ (long)var0_1 ^ 27165746223766035L);
                                                                        if (var2 != 1334952464) {
                                                                            ** break;
                                                                        }
                                                                        break block47;
                                                                    }
                                                                    case 7: {
                                                                        if (var2 == -779127801) break block48;
                                                                        if (var2 != 1887886503) {
                                                                            ** break;
                                                                        }
                                                                        break block49;
                                                                    }
                                                                    case 2: {
                                                                        if (var2 != 1141377658) {
                                                                            ** break;
                                                                        }
                                                                        break block50;
                                                                    }
                                                                    case 1: {
                                                                        if (var2 == -1988450383) break;
                                                                        ** break;
                                                                    }
                                                                    case 3: {
                                                                        if (var2 != 1870559187) {
                                                                            ** break;
                                                                        }
                                                                        break block51;
                                                                    }
                                                                }
                                                                Integer.rotateRight(-1622204214 ^ var0_1, 6) + 1324521393;
                                                                if (yf.khdha_2()) {
                                                                    try {
                                                                        var2 += 5;
                                                                        if ((7755976177366696523L ^ (long)var0_1 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        var1_2 = 1334952464 * -1646143101 + 887629778 ^ var0_1;
                                                                    }
                                                                    catch (ArithmeticException v0) {
                                                                        var1_2 = Integer.reverse(Integer.reverse(1334952464 * -1646143101 + 887629778 ^ var0_1));
                                                                    }
                                                                    var2 += 5;
                                                                    continue;
                                                                }
                                                                try {
                                                                    var2 -= 4;
                                                                    var1_2 = 1870559187 * -1646143101 + 887629778 ^ var0_1;
                                                                }
                                                                catch (NoSuchElementException v1) {
                                                                    var1_2 = 1870559187 * -1646143101 + 887629778 ^ var0_1;
                                                                }
                                                                ++var2;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(983360716 ^ var0_1, 10) - 492655599;
                                                            class_310.method_1551().method_1507((class_437)new tkhd());
                                                            return;
                                                        }
                                                        Integer.rotateLeft(2102864069 ^ var0_1, 18) - 837521174;
                                                        (int)(-4619137442420298929L ^ (long)var0_1 ^ -1116748559128407526L);
                                                        yf.athz_2();
                                                        var1_2 = 1334952464 * -1646143101 + 887629778 ^ var0_1;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(-445501952 ^ var0_1, 15) + -852414149;
                                                    try {
                                                        var2 -= 5;
                                                        if ((-6755058791330649351L ^ (long)var0_1 | 1L) == 0L) {
                                                            throw new IllegalStateException();
                                                        }
                                                        var1_2 = -1988450383 * -1646143101 + 887629778 ^ var0_1 ^ 317135630 ^ 317135630;
                                                    }
                                                    catch (IllegalStateException v2) {
                                                        var1_2 = (-1988450383 * -1646143101 + 887629778 ^ var0_1) + -1062029617 - -1062029617;
                                                    }
                                                    --var2;
                                                    continue;
                                                }
                                                Integer.rotateRight(1588606050 ^ var0_1, 14) + 2075391769;
                                                var1_2 = -836625053 * -1646143101 + 887629778 ^ var0_1 ^ 1432495823 ^ 1432495823;
                                                Integer.rotateLeft(595965544 ^ var0_1, 7) + 1368307155;
                                                try {
                                                    var2 += 3;
                                                    var1_2 = Integer.reverse(Integer.reverse(-1988450383 * -1646143101 + 887629778 ^ var0_1));
                                                }
                                                catch (UnsupportedOperationException v3) {
                                                    var1_2 = Integer.reverse(Integer.reverse(-1988450383 * -1646143101 + 887629778 ^ var0_1));
                                                }
                                                var2 += 2;
                                                continue;
                                            }
                                            Integer.rotateRight(1753415334 ^ var0_1, 16) - -1405455019;
                                            try {
                                                var2 += 3;
                                                if ((-2370941665595260837L ^ (long)var0_1 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                var1_2 = (-1988450383 * -1646143101 + 887629778 ^ var0_1) + 1283066402 - 1283066402;
                                            }
                                            catch (IllegalArgumentException v4) {
                                                var1_2 = (int)((long)(-1988450383 * -1646143101 + 887629778 ^ var0_1) ^ 5973820158747702816L ^ 5973820158747702816L);
                                            }
                                            var2 -= 5;
                                            continue;
                                        }
                                        Integer.rotateLeft(1184064193 ^ var0_1, 11) + -1875471206;
                                        (int)(-8925627603099522225L ^ (long)var0_1 ^ 7244184149084906898L);
                                        var1_2 = 1075415590 * -1646143101 + 887629778 ^ var0_1;
                                        (Integer.rotateLeft(1230320624 ^ var0_1, 12) + -441521845) * 1230320625;
                                        var1_2 = -1988450383 * -1646143101 + 887629778 ^ var0_1 ^ -325594565 ^ -325594565;
                                        var2 -= 2;
                                        continue;
                                    }
                                    Integer.rotateRight(1812932591 ^ var0_1, 16) - 439579948;
                                    (int)(5392377148353047036L ^ (long)var0_1 ^ -2768515598825604998L);
                                    var1_2 = -1115355141 * -1646143101 + 887629778 ^ var0_1 ^ 716153508 ^ 716153508;
                                    (int)(6735093579457479868L ^ (long)var0_1 ^ 5380277169654011710L);
                                    var1_2 = (int)((long)(-1988450383 * -1646143101 + 887629778 ^ var0_1) ^ 8810160360468475009L ^ 8810160360468475009L);
                                    var2 -= 2;
                                    continue;
                                }
                                (Integer.rotateLeft(840141852 ^ var0_1, 9) - 347838111) * 840141853;
                                var1_2 = Integer.reverse(Integer.reverse(208484585 * -1646143101 + 887629778 ^ var0_1));
                                Integer.rotateLeft(331640869 ^ var0_1, 5) - 1764176822;
                                (int)(-3353248677201908913L ^ (long)var0_1 ^ 4701902159434223420L);
                                var1_2 = (int)((long)(-1988450383 * -1646143101 + 887629778 ^ var0_1) ^ 3640949910498503212L ^ 3640949910498503212L);
                                var2 += 5;
                                continue;
                            }
                            (Integer.rotateLeft(783348349 ^ var0_1, 8) - -1412760482) * 783348349;
                            (int)(-1440487500189209777L ^ (long)var0_1 ^ 5039672131487036885L);
                            (int)(788278780168166908L ^ (long)var0_1 ^ -878400396687591376L);
                            var1_2 = 60060518 * -1646143101 + 887629778 ^ var0_1 ^ -1174361002 ^ -1174361002;
                            (int)(-8502597795523474054L ^ (long)var0_1 ^ -7654466627113403952L);
                            var1_2 = -1988450383 * -1646143101 + 887629778 ^ var0_1 ^ -531113952 ^ -531113952;
                            ++var2;
                            continue;
                        }
                        (Integer.rotateLeft(-39380496 ^ var0_1, 18) + -1147550901) * -39380495;
                        var1_2 = Integer.reverse(Integer.reverse(-808747056 * -1646143101 + 887629778 ^ var0_1));
                        Integer.rotateLeft(356463845 ^ var0_1, 5) - -1761278218;
                        (int)(-2914503130666964145L ^ (long)var0_1 ^ -3981037922136096054L);
                        try {
                            var2 += 4;
                            if ((7249195394633544015L ^ (long)var0_1 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var1_2 = (int)((long)(-1988450383 * -1646143101 + 887629778 ^ var0_1) ^ -2915668299708924220L ^ -2915668299708924220L);
                        }
                        catch (ArithmeticException v5) {
                            var1_2 = (-1988450383 * -1646143101 + 887629778 ^ var0_1) + 936444913 - 936444913;
                        }
                        var2 -= 4;
                        continue;
                    }
                    Integer.rotateLeft(299086181 ^ var0_1, 5) - 754981494;
                    (int)(-3215254195479975089L ^ (long)var0_1 ^ -4341325892325733613L);
                    try {
                        var2 += 2;
                        if ((-5693152146081594073L ^ (long)var0_1 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var1_2 = -1988450383 * -1646143101 + 887629778 ^ var0_1 ^ 85755228 ^ 85755228;
                    }
                    catch (IllegalStateException v6) {
                        var1_2 = (int)((long)(-1988450383 * -1646143101 + 887629778 ^ var0_1) ^ 4986644576113588273L ^ 4986644576113588273L);
                    }
                    continue;
                }
                Integer.rotateRight(-233511929 ^ var0_1, 17) - 1424309268;
                var1_2 = (-500683188 * -1646143101 + 887629778 ^ var0_1) + -354595649 - -354595649;
                (Integer.rotateRight(999034423 ^ var0_1, 10) - 978540516) * 999034423;
                var1_2 = -1555703230 * -1646143101 + 887629778 ^ var0_1;
                (Integer.rotateLeft(699023313 ^ var0_1, 8) + 268130698) * 699023313;
                (int)(-1506293631888856241L ^ (long)var0_1 ^ -2402526252742706208L);
                var1_2 = (-1988450383 * -1646143101 + 887629778 ^ var0_1) + -2098793505 - -2098793505;
                var2 += 3;
                continue;
            }
            Integer.rotateRight(-1536543090 ^ var0_1, 7) - -314951059;
            var1_2 = (-164768911 * -1646143101 + 887629778 ^ var0_1) + -954449190 - -954449190;
            Integer.rotateRight(-1237903001 ^ var0_1, 9) - 352957108;
            try {
                var2 -= 3;
                if ((-4937791989429749757L ^ (long)var0_1 | 1L) == 0L) {
                    throw new UnsupportedOperationException();
                }
                var1_2 = Integer.reverse(Integer.reverse(-1988450383 * -1646143101 + 887629778 ^ var0_1));
            }
            catch (UnsupportedOperationException v7) {
                var1_2 = (-1988450383 * -1646143101 + 887629778 ^ var0_1) + 1749569592 - 1749569592;
            }
            var2 -= 2;
            continue;
lbl228:
            // 8 sources

            (Integer.rotateRight(-1921717413 ^ var0_1, 4) + 629546816) * -1921717413;
            var1_2 = (-1988450383 * -1646143101 + 887629778 ^ var0_1) + 425742364 - 425742364;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void dzdh_2(bdht_2 var1_1) {
        var4_2 = 0;
        var2_3 = 398009207;
        var2_3 = Integer.rotateLeft(var2_3 * 1498344029, 26) ^ -693316789;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 5);
        v0 = var1_1;
        var2_3 = Integer.rotateRight((v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3, 17);
        var3_4 = (112883050 * -2074853355 + 2128142271 ^ var2_3) + 932502710 - 932502710;
        while (true) {
            block29: {
                block32: {
                    block39: {
                        block38: {
                            block34: {
                                block40: {
                                    block28: {
                                        block31: {
                                            block35: {
                                                block33: {
                                                    block36: {
                                                        block30: {
                                                            block37: {
                                                                var4_2 = ((var3_4 ^ var2_3) - 2128142271) * 1054707517;
                                                                switch (var4_2 & 7) {
                                                                    case 3: {
                                                                        if (var4_2 != -1215499349) {
                                                                            ** break;
                                                                        }
                                                                        break block28;
                                                                    }
                                                                    case 5: {
                                                                        if (var4_2 != -1670789595) {
                                                                            ** break;
                                                                        }
                                                                        break block29;
                                                                    }
                                                                    case 7: {
                                                                        if (var4_2 == -1042363249) break block30;
                                                                        if (var4_2 == -1931217505) break block31;
                                                                        if (var4_2 != -2084667961) {
                                                                            ** break;
                                                                        }
                                                                        break block32;
                                                                    }
                                                                    case 2: {
                                                                        if (var4_2 == 376552546) break block33;
                                                                        if (var4_2 == -1358847374) break block34;
                                                                        if (var4_2 == 112883050) break;
                                                                        if (var4_2 != -1320346990) {
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 1: {
                                                                        if (var4_2 != 963272313) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 0: {
                                                                        if (var4_2 != -1041104504) {
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 6: {
                                                                        if (var4_2 == -104848706) break block38;
                                                                        if (var4_2 == 1339289510) break block39;
                                                                        Integer.rotateLeft(-1661350875 ^ var2_3, 6) - 110974902;
                                                                        (int)(6794632318705527631L ^ (long)var2_3 ^ 4125441407130865991L);
                                                                        if (var4_2 != 1969609294) {
                                                                            ** break;
                                                                        }
                                                                        break block40;
                                                                    }
                                                                }
                                                                (Integer.rotateRight(1069301202 ^ var2_3, 10) + -1138156631) * 1069301203;
                                                                if (!yf.dnkh()) {
                                                                    try {
                                                                        var4_2 -= 2;
                                                                        if ((8921712825083762325L ^ (long)var2_3 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        var3_4 = -1041104504 * -2074853355 + 2128142271 ^ var2_3;
                                                                    }
                                                                    catch (IllegalArgumentException v1) {
                                                                        var3_4 = (-1041104504 * -2074853355 + 2128142271 ^ var2_3) + -34832260 - -34832260;
                                                                    }
                                                                    var4_2 += 2;
                                                                    continue;
                                                                }
                                                                var3_4 = Integer.reverse(Integer.reverse(1712012213 * -2074853355 + 2128142271 ^ var2_3));
                                                                Integer.rotateLeft(153905956 ^ var2_3, 4) - 549361815;
                                                                var3_4 = (int)((long)(-1042363249 * -2074853355 + 2128142271 ^ var2_3) ^ -2114151469844920190L ^ -2114151469844920190L);
                                                                var4_2 += 2;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(-1080664913 ^ var2_3, 10) - 932370540;
                                                            var1_1.brsh("commands.clickgui.description").dqdh_2("action", (Consumer<bsj>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, twdh(us.m0vy.moondlc.m0vyguard.bsj ), (Lus/m0vy/moondlc/m0vyguard/bsj;)V)()).dqdh_2("key", (Consumer<bsj>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, ghsk_2(us.m0vy.moondlc.m0vyguard.bsj ), (Lus/m0vy/moondlc/m0vyguard/bsj;)V)()).jmz((ghkh)LambdaMetafactory.metafactory(null, null, null, (Lus/m0vy/moondlc/m0vyguard/bths_2;)V, zar_2(us.m0vy.moondlc.m0vyguard.bths_2 ), (Lus/m0vy/moondlc/m0vyguard/bths_2;)V)((btha)this));
                                                            return;
                                                        }
                                                        Integer.rotateRight(-783469586 ^ var2_3, 13) - 1555491085;
                                                        throw null;
                                                    }
                                                    Integer.rotateLeft(532842537 ^ var2_3, 6) + -588506062;
                                                    (int)(-2490448725926417585L ^ (long)var2_3 ^ -5667635982586341583L);
                                                    try {
                                                        var4_2 += 2;
                                                        if ((-6583644598516905399L ^ (long)var2_3 | 1L) == 0L) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        var3_4 = 112883050 * -2074853355 + 2128142271 ^ var2_3;
                                                    }
                                                    catch (NoSuchElementException v2) {
                                                        var3_4 = Integer.reverse(Integer.reverse(112883050 * -2074853355 + 2128142271 ^ var2_3));
                                                    }
                                                    var4_2 -= 3;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(1832389148 ^ var2_3, 16) - 1042733215) * 1832389149;
                                                var3_4 = 112883050 * -2074853355 + 2128142271 ^ var2_3;
                                                Integer.rotateLeft(-1542870648 ^ var2_3, 7) + -511105357;
                                                var4_2 -= 2;
                                                continue;
                                            }
                                            Integer.rotateRight(-2038261681 ^ var2_3, 3) - 1311641804;
                                            try {
                                                var4_2 -= 5;
                                                var3_4 = 112883050 * -2074853355 + 2128142271 ^ var2_3;
                                            }
                                            catch (IllegalStateException v3) {
                                                var3_4 = 112883050 * -2074853355 + 2128142271 ^ var2_3 ^ 723422372 ^ 723422372;
                                            }
                                            var4_2 -= 2;
                                            continue;
                                        }
                                        (Integer.rotateRight(1676718615 ^ var2_3, 15) - 511913988) * 1676718615;
                                        var3_4 = -1607927483 * -2074853355 + 2128142271 ^ var2_3 ^ -1596177758 ^ -1596177758;
                                        (Integer.rotateRight(-489761226 ^ var2_3, 15) - 2070515653) * -489761225;
                                        (int)(5496113640494497190L ^ (long)var2_3 ^ -4536874117690084003L);
                                        var3_4 = Integer.reverse(Integer.reverse(1570065827 * -2074853355 + 2128142271 ^ var2_3));
                                        (int)(-2048791889343544112L ^ (long)var2_3 ^ -8632365536215930125L);
                                        var3_4 = 112883050 * -2074853355 + 2128142271 ^ var2_3 ^ -806800371 ^ -806800371;
                                        var4_2 += 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(706664147 ^ var2_3, 8) + 504996552) * 706664147;
                                    var3_4 = (-1122543138 * -2074853355 + 2128142271 ^ var2_3) + -1464141307 - -1464141307;
                                    (Integer.rotateRight(72796954 ^ var2_3, 3) + -1965017247) * 72796955;
                                    (int)(1143579613597292492L ^ (long)var2_3 ^ 7080728453346996844L);
                                    var3_4 = (int)((long)(112883050 * -2074853355 + 2128142271 ^ var2_3) ^ 5846211113130673653L ^ 5846211113130673653L);
                                    var4_2 += 5;
                                    continue;
                                }
                                Integer.rotateLeft(944180296 ^ var2_3, 10) + -721937421;
                                try {
                                    var4_2 += 5;
                                    var3_4 = (int)((long)(112883050 * -2074853355 + 2128142271 ^ var2_3) ^ -1704094977701046808L ^ -1704094977701046808L);
                                }
                                catch (IllegalArgumentException v4) {
                                    var3_4 = (int)((long)(112883050 * -2074853355 + 2128142271 ^ var2_3) ^ -8968361923127999306L ^ -8968361923127999306L);
                                }
                                var4_2 += 3;
                                continue;
                            }
                            Integer.rotateLeft(-1571355063 ^ var2_3, 7) + -1394122222;
                            (int)(6982172014145760079L ^ (long)var2_3 ^ -5937851960228484070L);
                            var3_4 = 112883050 * -2074853355 + 2128142271 ^ var2_3 ^ 73922364 ^ 73922364;
                            Integer.rotateRight(-2108075158 ^ var2_3, 3) + -852575983;
                            var4_2 -= 2;
                            continue;
                        }
                        Integer.rotateLeft(-1280934552 ^ var2_3, 9) + -981020973;
                        var3_4 = (int)((long)(-566777333 * -2074853355 + 2128142271 ^ var2_3) ^ 4331253552995529479L ^ 4331253552995529479L);
                        (Integer.rotateRight(438621727 ^ var2_3, 6) - 785616124) * 438621727;
                        var3_4 = (int)((long)(112883050 * -2074853355 + 2128142271 ^ var2_3) ^ 2740666376525729320L ^ 2740666376525729320L);
                        var4_2 += 2;
                        continue;
                    }
                    Integer.rotateRight(949345731 ^ var2_3, 10) + -561808936;
                    var3_4 = (-2039368530 * -2074853355 + 2128142271 ^ var2_3) + 1462833239 - 1462833239;
                    Integer.rotateLeft(-1075990523 ^ var2_3, 10) - 1077276630;
                    (int)(9038476203691141967L ^ (long)var2_3 ^ -4539484275929950449L);
                    var3_4 = 811179441 * -2074853355 + 2128142271 ^ var2_3;
                    Integer.rotateRight(-139397021 ^ var2_3, 17) + 46904120;
                    var3_4 = (int)((long)(112883050 * -2074853355 + 2128142271 ^ var2_3) ^ -1288419688804624641L ^ -1288419688804624641L);
                    continue;
                }
                (Integer.rotateLeft(894214461 ^ var2_3, 9) - 2024088990) * 894214461;
                (int)(-577007208914162865L ^ (long)var2_3 ^ -2058000881248878035L);
                var3_4 = Integer.reverse(Integer.reverse(730929225 * -2074853355 + 2128142271 ^ var2_3));
                (Integer.rotateRight(720592894 ^ var2_3, 8) - 936787709) * 720592895;
                var3_4 = (int)((long)(112883050 * -2074853355 + 2128142271 ^ var2_3) ^ -2977644422444667830L ^ -2977644422444667830L);
                Integer.rotateRight(-556641873 ^ var2_3, 14) - -2784404;
                continue;
            }
            (Integer.rotateRight(-1690616426 ^ var2_3, 6) - -796257179) * -1690616425;
            var3_4 = (1035322223 * -2074853355 + 2128142271 ^ var2_3) + -1044990544 - -1044990544;
            (Integer.rotateRight(2074102687 ^ var2_3, 18) - -54081668) * 2074102687;
            (int)(-1857588944028994277L ^ (long)var2_3 ^ -858564267126791776L);
            var3_4 = (int)((long)(36394130 * -2074853355 + 2128142271 ^ var2_3) ^ 2901856950826838760L ^ 2901856950826838760L);
            (int)(-3253801580714697116L ^ (long)var2_3 ^ -6622671374010939295L);
            var3_4 = 112883050 * -2074853355 + 2128142271 ^ var2_3;
            var4_2 += 3;
            continue;
lbl207:
            // 8 sources

            Integer.rotateRight(-1109986422 ^ var2_3, 10) + 23403761;
            var3_4 = (int)((long)(112883050 * -2074853355 + 2128142271 ^ var2_3) ^ -7371913326822823827L ^ -7371913326822823827L);
        }
    }

    private static void ghsk_2(bsj bsj2) {
        int n = -234914154;
        n = Integer.rotateLeft(n * 70535777, 25) ^ 0xA409D18;
        bsj bsj3 = bsj2;
        n = (bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n;
        int n2 = n ^ 0x88E9715D;
        if ((n2 ^ n) != -1997967011) {
            int cfr_ignored_0 = (0x79160FCB ^ n) - 480312555;
        }
        bsj2.tkn().tkk_2(ah_2::tsy);
    }

    private static void twdh(bsj bsj2) {
        int n = 0;
        int n2 = -233339611;
        n2 = Integer.rotateLeft(n2 * -883797305, 4) ^ 0x9594F945;
        bsj bsj3 = bsj2;
        n2 = Integer.rotateRight((bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n2, 18);
        int n3 = 1002448197 + n2 ^ 0xF0332278 ^ 0xF0332278;
        block19: while (true) {
            switch (n3 - n2) {
                case -1967439083: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x9B224B2C ^ n2, 6) - -846939761;
                    yf.athz_2();
                    try {
                        n3 = -198830434 + n2 + 1364744648 - 1364744648;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -198830434 + n2 + -1626022784 - -1626022784;
                    }
                    ++n;
                    continue block19;
                }
                case -198830434: {
                    int cfr_ignored_1 = (Integer.rotateRight(0xE5718F37 ^ n2, 15) - -853674268) * -445542601;
                    bsj2.tkn().dby_2("open", "bind");
                    return;
                }
                case 1002448197: {
                    int cfr_ignored_2 = Integer.rotateLeft(0xC6086ECD ^ n2, 11) - -10286578;
                    int cfr_ignored_3 = (int)(0x4BAC0F027D4EB4FL ^ (long)n2 ^ 0x7C90831A2DB9A4A4L);
                    if (!yf.khdha_2()) {
                        n3 = 445493181 + n2 ^ 0x52FBD369 ^ 0x52FBD369;
                        int cfr_ignored_4 = (Integer.rotateLeft(0xE1BD4F7C ^ n2, 15) - 1514815295) * -507687043;
                        n3 = -1967439083 + n2;
                        continue block19;
                    }
                    n3 = (int)((long)(-198830434 + n2) ^ 0x20EAB0DDE36042FEL ^ 0x20EAB0DDE36042FEL);
                    int cfr_ignored_5 = Integer.rotateLeft(0xE896D1CC ^ n2, 16) - 782305007;
                    n += 2;
                    continue block19;
                }
                case -272342177: {
                    int cfr_ignored_6 = Integer.rotateRight(0x39C976CA ^ n2, 10) + 63111601;
                    n3 = 1002448197 + n2;
                    continue block19;
                }
                case 773393016: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0xCF8A1BB8 ^ n2, 12) + 639040131) * -813032519;
                    n3 = 1471876930 + n2 ^ 0x4053389F ^ 0x4053389F;
                    int cfr_ignored_8 = (Integer.rotateLeft(0x948F9A19 ^ n2, 5) + 29444162) * -1802528231;
                    int cfr_ignored_9 = (int)(0x563D342427D4EB4FL ^ (long)n2 ^ 0x9538831A2DB901ABL);
                    int cfr_ignored_10 = (int)(0xBAA97445E20C222CL ^ (long)n2 ^ 0x15FB08ABBF7ED883L);
                    n3 = 1640117771 + n2 + 116211169 - 116211169;
                    int cfr_ignored_11 = (int)(0x5C816F71EB5025B9L ^ (long)n2 ^ 0x23931A13B05514D3L);
                    n3 = 1002448197 + n2 ^ 0x61BE188C ^ 0x61BE188C;
                    n -= 5;
                    continue block19;
                }
                case -1803910056: {
                    int cfr_ignored_12 = (Integer.rotateRight(0xA749F95A ^ n2, 7) + 1179832609) * -1488324261;
                    n3 = 1002448197 + n2 ^ 0xCA3B87CB ^ 0xCA3B87CB;
                    int cfr_ignored_13 = Integer.rotateRight(0x1B775FEB ^ n2, 6) + 1473395888;
                    continue block19;
                }
                case 937064853: {
                    int cfr_ignored_14 = Integer.rotateRight(0xBACAEA22 ^ n2, 10) + -1561331367;
                    n3 = 1546409394 + n2;
                    int cfr_ignored_15 = (Integer.rotateRight(0x20432D13 ^ n2, 7) + -327150456) * 541273363;
                    n3 = 1002448197 + n2 + -1172867080 - -1172867080;
                    n -= 5;
                    continue block19;
                }
                case 1697154315: {
                    int cfr_ignored_16 = (Integer.rotateRight(0xC3F1D85A ^ n2, 11) + -1096363487) * -1007560613;
                    n3 = 1037642451 + n2 + -1320453742 - -1320453742;
                    int cfr_ignored_17 = (Integer.rotateRight(0xE85A3D5E ^ n2, 16) - 659230109) * -396739233;
                    n3 = 1002448197 + n2;
                    int cfr_ignored_18 = (Integer.rotateRight(0xC81F9972 ^ n2, 12) + 1076966409) * -937453197;
                    --n;
                    continue block19;
                }
                case 1048917814: {
                    int cfr_ignored_19 = (Integer.rotateRight(0xC78C3BD7 ^ n2, 11) - 777576004) * -947110953;
                    n3 = 277975775 + n2;
                    int cfr_ignored_20 = Integer.rotateLeft(0xC4128CC0 ^ n2, 11) + -1029920133;
                    int cfr_ignored_21 = (int)(0x89BF808E2CF817FDL ^ (long)n2 ^ 0xFC6C9543D4DCBEAEL);
                    n3 = Integer.reverse(Integer.reverse(1002448197 + n2));
                    n += 5;
                    continue block19;
                }
                case 90364537: {
                    int cfr_ignored_22 = Integer.rotateRight(0x8C338403 ^ n2, 4) + -23422056;
                    n3 = (int)((long)(1002448197 + n2) ^ 0x258665FB4623A957L ^ 0x258665FB4623A957L);
                    int cfr_ignored_23 = Integer.rotateLeft(0xB671C20D ^ n2, 9) - 472129230;
                    int cfr_ignored_24 = (int)(0x74C36C3027D4EB4FL ^ (long)n2 ^ 0x2510831A2DB94457L);
                    n += 5;
                    continue block19;
                }
                case -1623718730: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x71ECB232 ^ n2, 17) + -804834487) * 1911337523;
                    try {
                        if ((0xC591FB722163A96FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = 1002448197 + n2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = 1002448197 + n2;
                    }
                    n -= 2;
                    continue block19;
                }
                case 217508171: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0xB1FB1835 ^ n2, 9) - -1849324122) * -1308944331;
                    int cfr_ignored_27 = (int)(0x7349B60827D4EB4FL ^ (long)n2 ^ 0x9160831A2DB94B42L);
                    n3 = 1002448197 + n2 ^ 0xDF14985 ^ 0xDF14985;
                    int cfr_ignored_28 = Integer.rotateLeft(0x6CF6F581 ^ n2, 16) + 910514650;
                    int cfr_ignored_29 = (int)(0xAE445BBC27D4EB4FL ^ (long)n2 ^ 0x4A08831A2DB8F159L);
                    n += 2;
                    continue block19;
                }
                case -1428005941: {
                    int cfr_ignored_30 = Integer.rotateRight(0x27227E03 ^ n2, 7) + -1047862888;
                    n3 = -564321746 + n2 + -209753186 - -209753186;
                    int cfr_ignored_31 = (Integer.rotateRight(0x346EE27F ^ n2, 9) - 1573588124) * 879682175;
                    n3 = -1017409903 + n2 + 634449151 - 634449151;
                    int cfr_ignored_32 = Integer.rotateRight(0x778881EB ^ n2, 17) + 2112182960;
                    n3 = Integer.reverse(Integer.reverse(1002448197 + n2));
                    n += 2;
                    continue block19;
                }
            }
            int cfr_ignored_33 = Integer.rotateLeft(0xA3F76A9 ^ n2, 4) + 1108147634;
            int cfr_ignored_34 = (int)(0xC88DD89427D4EB4FL ^ (long)n2 ^ 0x4C58831A2DB83CCAL);
            n3 = 1002448197 + n2 ^ 0x984F3FF5 ^ 0x984F3FF5;
        }
    }

    private static String tmt_4(String string, int n, int n2, int n3) {
        try {
            int n4 = -575342443;
            n4 = Integer.rotateLeft(n4 * -1260425743, 12) ^ 0x5A565C1B;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = n ^ n4;
            int n5 = n4 ^ 0x7415802C;
            if ((n5 ^ n4) != 1947566124) {
                int cfr_ignored_0 = (0xA9A178B9 ^ n4) + -406942994;
            }
            if ((0x20D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xA8639A7 ^ n2 - i) + dhht, 20) ^ zth_8 + i * -1818698337));
        }
        return new String(cArray);
    }

    private static boolean ttj_2() {
        block0: {
            int n = -1004213873;
            int n2 = (n = Integer.rotateLeft(n * -102610407, 21) ^ 0x94E365E0) ^ 0x87A3A7BC;
            if ((n2 ^ n) == -2019317828) break block0;
            int cfr_ignored_0 = (0x43874E33 ^ n) - -176699831;
        }
        return yf.khdha_2();
    }

    private static String btt_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -25711824;
            n4 = Integer.rotateLeft(n4 * 451792799, 26) ^ 0x6BE070A2;
            int n5 = (n4 = n3 ^ n4) ^ 0x6AF68DF0;
            if ((n5 ^ n4) == 1794543088) break block0;
            int cfr_ignored_0 = (0x948126C0 ^ n4) + -2122141997;
        }
        return btha.tmt_4(string, n, n2, n3);
    }

    private static bthn thhdh_2(bdht_2 bdht2) {
        block0: {
            int n = 484707860;
            int n2 = (n = Integer.rotateLeft(n * -1194452323, 12) ^ 0xE0731B96) ^ 0x3001F69C;
            if ((n2 ^ n) == 805435036) break block0;
            int cfr_ignored_0 = (0x2CE5F888 ^ n) + -29962058;
        }
        return bdht2.szy_2();
    }

    private static List tnkh_2(bths_2 bths2) {
        block0: {
            int n = -386358772;
            n = Integer.rotateLeft(n * -1554562259, 11) ^ 0x8E410FD6;
            bths_2 bths3 = bths2;
            n = Integer.rotateLeft((bths3 != null ? System.identityHashCode(bths3) : 0) ^ n, 28);
            int n2 = n ^ 0xA890F6CB;
            if ((n2 ^ n) == -1466894645) break block0;
            int cfr_ignored_0 = (0x406854C7 ^ n) + -1829422721;
        }
        return bths2.arguments();
    }

    private static List thky(bths_2 bths2) {
        block0: {
            int n = -1267724437;
            n = Integer.rotateLeft(n * 638917479, 27) ^ 0x7DC0E038;
            bths_2 bths3 = bths2;
            n = (bths3 != null ? System.identityHashCode(bths3) : 0) ^ n;
            int n2 = n ^ 0x56918DB4;
            if ((n2 ^ n) == 1452379572) break block0;
            int cfr_ignored_0 = (0xE2E182DF ^ n) + -1347621389;
        }
        return bths2.arguments();
    }

    private static String znk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1232979954;
            n4 = Integer.rotateLeft(n4 * -1751904249, 26) ^ 0x6A4F3654;
            int n5 = (n4 = n3 ^ n4) ^ 0x8ADBFF1B;
            if ((n5 ^ n4) == -1965293797) break block0;
            int cfr_ignored_0 = (0xC3A638E9 ^ n4) - -160101867;
        }
        return btha.tmt_4(string, n, n2, n3);
    }

    private static void dh_5(class_310 class_3102, Runnable runnable) {
        int n = brr.rshd(1572510567);
        Runnable runnable2 = runnable;
        n = Integer.rotateLeft((runnable2 != null ? System.identityHashCode(runnable2) : 0) ^ n, 17);
        int n2 = n ^ 0xB5D9C646;
        if ((n2 ^ n) != -1244019130) {
            int cfr_ignored_0 = Integer.rotateLeft(0xE8635D21 ^ n, 16) + 677766714;
            int cfr_ignored_1 = (int)(0x2AD1F31C27D4EB4FL ^ (long)n ^ 0x1B48831A2DB9F872L);
        }
        class_3102.execute(runnable);
    }

    private static String khtt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = brr.rshd(1259741100);
            n4 = Integer.rotateLeft(n ^ n4, 17);
            int n5 = (n4 = n3 ^ n4) ^ 0x2E9CE19E;
            if ((n5 ^ n4) == 782033310) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x658AFE32 ^ n4, 15) + 1345480521) * 1703607859;
        }
        return btha.tmt_4(string, n, n2, n3);
    }

    private static boolean asw_2(String string, String string2) {
        block0: {
            int n = 572192045;
            n = Integer.rotateLeft(n * -245250311, 3) ^ 0xC32327CE;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x58BD13B8;
            if ((n2 ^ n) == 1488786360) break block0;
            int cfr_ignored_0 = (0x7AA7E695 ^ n) - 30247551;
        }
        return string.equalsIgnoreCase(string2);
    }

    private static int khzgh(int n, int n2) {
        block0: {
            int n3 = 254913400;
            n3 = Integer.rotateLeft(n3 * -698922997, 26) ^ 0x221B113C;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 4)) ^ 0xE00252FA;
            if ((n4 ^ n3) == -536718598) break block0;
            int cfr_ignored_0 = (0xEF33F982 ^ n3) + 679665299;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String khtb_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = brr.rshd(-316884239);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x642F11AF;
            if ((n5 ^ n4) == 1680806319) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8933AB5E ^ n4, 4) - -1583390819) * -1993102497;
        }
        return btha.tmt_4(string, n, n2, n3);
    }

    private static void dhls(class_2561 class_25612) {
        int n = 18723583;
        n = Integer.rotateLeft(n * 552059995, 28) ^ 0x744B89C4;
        class_2561 class_25613 = class_25612;
        n = (class_25613 != null ? System.identityHashCode(class_25613) : 0) ^ n;
        int n2 = n ^ 0x8A9A17E3;
        if ((n2 ^ n) != -1969612829) {
            int cfr_ignored_0 = (0x8B87A51C ^ n) - -1065465762;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static class_2561 zzw_4(String string) {
        block0: {
            int n = -561692688;
            n = Integer.rotateLeft(n * 1076129669, 26) ^ 0x5CE8FAFB;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xDB4F1221;
            if ((n2 ^ n) == -615575007) break block0;
            int cfr_ignored_0 = (0x5CA2DD1 ^ n) + 916804646;
        }
        return class_2561.method_30163((String)string);
    }

    private static void slr_2(class_2561 class_25612) {
        int n = -252210036;
        int n2 = (n = Integer.rotateLeft(n * 552342169, 14) ^ 0x787477EB) ^ 0x76A91782;
        if ((n2 ^ n) != 1990793090) {
            int cfr_ignored_0 = (0x865E830E ^ n) + 87406584;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static String[] jkr(String string) {
        int n = brr.rshd(727140833);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xC9ED2B02;
        if ((n2 ^ n) != -907203838) {
            int cfr_ignored_0 = Integer.rotateRight(0xE2BA62E3 ^ n, 15) + 2028968120;
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

    private static CallSite sghgh_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1058435682;
            n3 = Integer.rotateLeft(n3 * -383620607, 9) ^ 0x8F03FBA2;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 27);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x81EE0ABF;
            if ((n4 ^ n3) != -2115106113) {
                int cfr_ignored_0 = (0x41078721 ^ n3) - 531647521;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ thkt ^ string.hashCode()) + (n2 + dhmt) + i ^ thkt, 20) + dhmt);
            }
            String[] stringArray = btha.jkr(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] q3knu4sb59von(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite oaj1yrlx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ agkcngja5vea ^ string.hashCode() ^ n2 + h9lauku7p8joa ^ i * 440378549 ^ agkcngja5vea, 12) ^ h9lauku7p8joa));
            }
            String[] stringArray = btha.q3knu4sb59von(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

