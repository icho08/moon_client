/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.ttf;
import us.m0vy.moondlc.m0vyguard.tjn;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tt_4;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.ww;

@tq_2(name="Ambience", category=bzw.OTHER, desc="Custom world time, weather and fog")
public class zb_2
extends bnq {
    private static zb_2 tma;
    public final khd md_2 = new khd(this, "Time");
    public final khd jak = new khd(this, "Weather");
    private static final int tnz_2 = -739243463;
    private static final int jhh_2 = 814690548;
    private static final int ddhsh = 342248236;
    private static final int jlsh = 914162008;
    private static final int z4jepu1wex5 = 437974537;
    private static final int r46f1tlo = -3036477;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s1s3ycmeat9u;

    public zb_2() {
        tma = this;
        for (ww enum_ : ww.values()) {
            new fy(this.md_2, enum_.getName());
        }
        for (Enum enum_ : tjn.values()) {
            new fy(this.jak, ((tjn)enum_).getName());
        }
        this.md_2.dhtd_3((fy)this.md_2.jsw().get(1));
        this.jak.dhtd_3((fy)this.jak.jsw().get(1));
    }

    public static zb_2 zbw_2() {
        block0: {
            int n = -570182272;
            int n2 = (n = Integer.rotateLeft(n * -1500228885, 22) ^ 0xE022E76B) ^ 0xE042F3BD;
            if ((n2 ^ n) == -532483139) break block0;
            int cfr_ignored_0 = (0x3E41463D ^ n) + -1320613572;
        }
        return tma;
    }

    /*
     * Unable to fully structure code
     */
    public long jghk(long var1_1) {
        var3_2 = 0L;
        var7_3 = 0;
        var5_4 = 478559575;
        var5_4 = Integer.rotateLeft(var5_4 * 694372211, 17) ^ 1816873057;
        var5_4 = Integer.rotateRight(System.identityHashCode(this) ^ var5_4, 16);
        var5_4 = Integer.rotateLeft((int)var1_1 ^ var5_4, 4);
        var6_5 = Integer.reverse(Integer.reverse(-1529632710 * 243338361 + -686885935 ^ var5_4));
        block53: while (true) {
            block97: {
                block106: {
                    block98: {
                        block122: {
                            block108: {
                                block109: {
                                    block101: {
                                        block103: {
                                            block118: {
                                                block120: {
                                                    block105: {
                                                        block125: {
                                                            block112: {
                                                                block116: {
                                                                    block102: {
                                                                        block107: {
                                                                            block99: {
                                                                                block121: {
                                                                                    block126: {
                                                                                        block124: {
                                                                                            block115: {
                                                                                                block119: {
                                                                                                    block113: {
                                                                                                        block117: {
                                                                                                            block95: {
                                                                                                                block104: {
                                                                                                                    block114: {
                                                                                                                        block96: {
                                                                                                                            block111: {
                                                                                                                                block110: {
                                                                                                                                    block123: {
                                                                                                                                        block100: {
                                                                                                                                            var7_3 = ((var6_5 ^ var5_4) - -686885935) * -2004902455;
                                                                                                                                            switch (var7_3 & 31) {
                                                                                                                                                case 0: {
                                                                                                                                                    if (var7_3 != 1785700896) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block95;
                                                                                                                                                }
                                                                                                                                                case 2: {
                                                                                                                                                    if (var7_3 == -1773269758) break block96;
                                                                                                                                                    if (var7_3 != -1245476446) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block97;
                                                                                                                                                }
                                                                                                                                                case 3: {
                                                                                                                                                    if (var7_3 != -2024994653) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block98;
                                                                                                                                                }
                                                                                                                                                case 6: {
                                                                                                                                                    if (var7_3 != -1857334138) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block99;
                                                                                                                                                }
                                                                                                                                                case 9: {
                                                                                                                                                    if (var7_3 != 842162697) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block100;
                                                                                                                                                }
                                                                                                                                                case 12: {
                                                                                                                                                    if (var7_3 == -1870415764) break block101;
                                                                                                                                                    if (var7_3 == -2102916756) break block102;
                                                                                                                                                    if (var7_3 != 237064236) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block103;
                                                                                                                                                }
                                                                                                                                                case 13: {
                                                                                                                                                    if (var7_3 != 1431453645) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block104;
                                                                                                                                                }
                                                                                                                                                case 16: {
                                                                                                                                                    if (var7_3 == -664743152) break block105;
                                                                                                                                                    if (var7_3 == 643193296) break block106;
                                                                                                                                                    (Integer.rotateLeft(-1255423564 ^ var5_4, 9) - -190180345) * -1255423563;
                                                                                                                                                    if (var7_3 != -1894905712) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block107;
                                                                                                                                                }
                                                                                                                                                case 18: {
                                                                                                                                                    if (var7_3 != 1635824466) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block108;
                                                                                                                                                }
                                                                                                                                                case 21: {
                                                                                                                                                    if (var7_3 != -822287691) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block109;
                                                                                                                                                }
                                                                                                                                                case 22: {
                                                                                                                                                    if (var7_3 != 243950998) {
                                                                                                                                                        if (var7_3 == -292980842) break;
                                                                                                                                                        Integer.rotateLeft(1632678693 ^ var5_4, 15) - -853323594;
                                                                                                                                                        (int)(-6637710911206003889L ^ (long)var5_4 ^ -4089124313192928747L);
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block110;
                                                                                                                                                }
                                                                                                                                                case 24: {
                                                                                                                                                    if (var7_3 != -2129290536) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block111;
                                                                                                                                                }
                                                                                                                                                case 25: {
                                                                                                                                                    if (var7_3 != 2015021209) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block112;
                                                                                                                                                }
                                                                                                                                                case 26: {
                                                                                                                                                    if (var7_3 == -1529632710) break block113;
                                                                                                                                                    if (var7_3 == 876337242) break block114;
                                                                                                                                                    Integer.rotateLeft(1874593313 ^ var5_4, 16) + -1943904966;
                                                                                                                                                    (int)(-5976654816593253553L ^ (long)var5_4 ^ -5960369958365366324L);
                                                                                                                                                    if (var7_3 == -172390758) break block115;
                                                                                                                                                    if (var7_3 != -1872890566) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block116;
                                                                                                                                                }
                                                                                                                                                case 27: {
                                                                                                                                                    if (var7_3 == -2081320485) break block117;
                                                                                                                                                    if (var7_3 != -430487333) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block118;
                                                                                                                                                }
                                                                                                                                                case 28: {
                                                                                                                                                    if (var7_3 == -2051278660) break block119;
                                                                                                                                                    if (var7_3 == -1332649220) break block120;
                                                                                                                                                    Integer.rotateLeft(1724616868 ^ var5_4, 15) - 1996759831;
                                                                                                                                                    if (var7_3 != -2113046148) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block121;
                                                                                                                                                }
                                                                                                                                                case 29: {
                                                                                                                                                    if (var7_3 != 639151229) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block122;
                                                                                                                                                }
                                                                                                                                                case 30: {
                                                                                                                                                    if (var7_3 == -1833743970) break block123;
                                                                                                                                                    if (var7_3 == 1213203806) break block124;
                                                                                                                                                    if (var7_3 != 40568670) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block125;
                                                                                                                                                }
                                                                                                                                                case 31: {
                                                                                                                                                    if (var7_3 == -869313921) ** GOTO lbl114
                                                                                                                                                    if (var7_3 != 95013279) {
                                                                                                                                                        ** break;
                                                                                                                                                    }
                                                                                                                                                    break block126;
lbl114:
                                                                                                                                                    // 1 sources

                                                                                                                                                    (Integer.rotateLeft(-950730568 ^ var5_4, 11) + 665367939) * -950730567;
                                                                                                                                                    var3_2 = 3853968595689684654L ^ 3853968595689679326L;
                                                                                                                                                    try {
                                                                                                                                                        if ((4080776772539862837L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                                                                            throw new IllegalStateException();
                                                                                                                                                        }
                                                                                                                                                        var6_5 = (-1245476446 * 243338361 + -686885935 ^ var5_4) + 684522959 - 684522959;
                                                                                                                                                    }
                                                                                                                                                    catch (IllegalStateException v0) {
                                                                                                                                                        var6_5 = (int)((long)(-1245476446 * 243338361 + -686885935 ^ var5_4) ^ 3980787430766322723L ^ 3980787430766322723L);
                                                                                                                                                    }
                                                                                                                                                    var7_3 -= 5;
                                                                                                                                                    continue block53;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            Integer.rotateRight(1036010243 ^ var5_4, 10) + 2124790936;
                                                                                                                                            if (!this.md_2.dhbn("Night")) {
                                                                                                                                                var6_5 = (-1833743970 * 243338361 + -686885935 ^ var5_4) + -1794699106 - -1794699106;
                                                                                                                                                ++var7_3;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            (int)(-6440627300100217620L ^ (long)var5_4 ^ 7656278916830519533L);
                                                                                                                                            var6_5 = (int)((long)(256419213 * 243338361 + -686885935 ^ var5_4) ^ 8885210612362676029L ^ 8885210612362676029L);
                                                                                                                                            (int)(5981635804821282137L ^ (long)var5_4 ^ -1633160759152931881L);
                                                                                                                                            var6_5 = 1213203806 * 243338361 + -686885935 ^ var5_4;
                                                                                                                                            var7_3 -= 5;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        (Integer.rotateLeft(-1870927271 ^ var5_4, 5) + -2090926078) * -1870927271;
                                                                                                                                        (int)(5965374378384616271L ^ (long)var5_4 ^ 8482674046611818563L);
                                                                                                                                        var3_2 = -3575337113394248317L ^ -3575337113394225278L;
                                                                                                                                        try {
                                                                                                                                            var7_3 += 4;
                                                                                                                                            if ((7470171292898944667L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                                                                throw new ArithmeticException();
                                                                                                                                            }
                                                                                                                                            var6_5 = -1245476446 * 243338361 + -686885935 ^ var5_4 ^ 755249559 ^ 755249559;
                                                                                                                                        }
                                                                                                                                        catch (ArithmeticException v1) {
                                                                                                                                            var6_5 = -1245476446 * 243338361 + -686885935 ^ var5_4 ^ -2084082441 ^ -2084082441;
                                                                                                                                        }
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    (Integer.rotateLeft(-742269127 ^ var5_4, 13) + -1462261982) * -742269127;
                                                                                                                                    (int)(1257472983628573519L ^ (long)var5_4 ^ 2267706560840568631L);
                                                                                                                                    if (this.md_2.dhbn("Mid Night")) {
                                                                                                                                        try {
                                                                                                                                            if ((1738964239816901249L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                                                                throw new ArithmeticException();
                                                                                                                                            }
                                                                                                                                            var6_5 = Integer.reverse(Integer.reverse(-2113046148 * 243338361 + -686885935 ^ var5_4));
                                                                                                                                        }
                                                                                                                                        catch (ArithmeticException v2) {
                                                                                                                                            var6_5 = Integer.reverse(Integer.reverse(-2113046148 * 243338361 + -686885935 ^ var5_4));
                                                                                                                                        }
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    var6_5 = (int)((long)(-1773269758 * 243338361 + -686885935 ^ var5_4) ^ -6470652713070216676L ^ -6470652713070216676L);
                                                                                                                                    (Integer.rotateRight(588772154 ^ var5_4, 7) + 0x44441341) * 588772155;
                                                                                                                                    var7_3 -= 2;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                Integer.rotateLeft(-1944845024 ^ var5_4, 4) + -87409125;
                                                                                                                                if (zb_2.smd_3(this.md_2, "Noon")) {
                                                                                                                                    try {
                                                                                                                                        if ((3326576502740774611L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                                                            throw new NoSuchElementException();
                                                                                                                                        }
                                                                                                                                        var6_5 = -869313921 * 243338361 + -686885935 ^ var5_4;
                                                                                                                                    }
                                                                                                                                    catch (NoSuchElementException v3) {
                                                                                                                                        var6_5 = (int)((long)(-869313921 * 243338361 + -686885935 ^ var5_4) ^ 9043249006762056489L ^ 9043249006762056489L);
                                                                                                                                    }
                                                                                                                                    var7_3 += 4;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                var6_5 = Integer.reverse(Integer.reverse(95013279 * 243338361 + -686885935 ^ var5_4));
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            (Integer.rotateLeft(-712075816 ^ var5_4, 13) + -526269341) * -712075815;
                                                                                                                            var3_2 = var1_1;
                                                                                                                            try {
                                                                                                                                if ((2626733432295183509L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                                                    throw new IllegalStateException();
                                                                                                                                }
                                                                                                                                var6_5 = -1245476446 * 243338361 + -686885935 ^ var5_4;
                                                                                                                            }
                                                                                                                            catch (IllegalStateException v4) {
                                                                                                                                var6_5 = (int)((long)(-1245476446 * 243338361 + -686885935 ^ var5_4) ^ 7002340899355977323L ^ 7002340899355977323L);
                                                                                                                            }
                                                                                                                            var7_3 += 3;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        (Integer.rotateLeft(-893256707 ^ var5_4, 12) - -1847909666) * -893256707;
                                                                                                                        (int)(608924658415496015L ^ (long)var5_4 ^ 6264651230131895607L);
                                                                                                                        var3_2 = var1_1;
                                                                                                                        (int)(-2733110617003386211L ^ (long)var5_4 ^ -1598927505214137867L);
                                                                                                                        var6_5 = (int)((long)(1793562382 * 243338361 + -686885935 ^ var5_4) ^ -8417024062639595452L ^ -8417024062639595452L);
                                                                                                                        (int)(5867669797661094120L ^ (long)var5_4 ^ -5737667896415940851L);
                                                                                                                        var6_5 = -1245476446 * 243338361 + -686885935 ^ var5_4;
                                                                                                                        var7_3 -= 3;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    (Integer.rotateRight(-1121007041 ^ var5_4, 10) - -318235428) * -1121007041;
                                                                                                                    var3_2 = 5276029689669881831L ^ 5276029689669880847L;
                                                                                                                    try {
                                                                                                                        var7_3 -= 2;
                                                                                                                        if ((4869181148986167001L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                                            throw new UnsupportedOperationException();
                                                                                                                        }
                                                                                                                        var6_5 = Integer.reverse(Integer.reverse(-1245476446 * 243338361 + -686885935 ^ var5_4));
                                                                                                                    }
                                                                                                                    catch (UnsupportedOperationException v5) {
                                                                                                                        var6_5 = Integer.reverse(Integer.reverse(-1245476446 * 243338361 + -686885935 ^ var5_4));
                                                                                                                    }
                                                                                                                    continue;
                                                                                                                }
                                                                                                                Integer.rotateLeft(-385686747 ^ var5_4, 16) - 1001857206;
                                                                                                                (int)(3148100905674795855L ^ (long)var5_4 ^ 7440090732875610801L);
                                                                                                                if (this.rgha_2()) {
                                                                                                                    (int)(42673240752033117L ^ (long)var5_4 ^ -3792888149343097602L);
                                                                                                                    var6_5 = (int)((long)(-1646762642 * 243338361 + -686885935 ^ var5_4) ^ 7796772160668273242L ^ 7796772160668273242L);
                                                                                                                    (int)(-1806743057421076368L ^ (long)var5_4 ^ -5983383171095961589L);
                                                                                                                    var6_5 = Integer.reverse(Integer.reverse(-1857334138 * 243338361 + -686885935 ^ var5_4));
                                                                                                                    ++var7_3;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                try {
                                                                                                                    var7_3 += 5;
                                                                                                                    if ((2530387185511782137L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                                        throw new IllegalStateException();
                                                                                                                    }
                                                                                                                    var6_5 = Integer.reverse(Integer.reverse(-2051278660 * 243338361 + -686885935 ^ var5_4));
                                                                                                                }
                                                                                                                catch (IllegalStateException v6) {
                                                                                                                    var6_5 = -2051278660 * 243338361 + -686885935 ^ var5_4 ^ 0x7F7C7C ^ 0x7F7C7C;
                                                                                                                }
                                                                                                                var7_3 += 5;
                                                                                                                continue;
                                                                                                            }
                                                                                                            Integer.rotateLeft(1047567913 ^ var5_4, 10) + -1811888590;
                                                                                                            (int)(-233571367544100017L ^ (long)var5_4 ^ -7108787863344884651L);
                                                                                                            if (this.rgha_2()) {
                                                                                                                var6_5 = -920874719 * 243338361 + -686885935 ^ var5_4;
                                                                                                                (Integer.rotateLeft(889246393 ^ var5_4, 9) + 1870078882) * 889246393;
                                                                                                                (int)(-598278893441062065L ^ (long)var5_4 ^ 322151521816429237L);
                                                                                                                var6_5 = (-1857334138 * 243338361 + -686885935 ^ var5_4) + 1554900763 - 1554900763;
                                                                                                                continue;
                                                                                                            }
                                                                                                            var6_5 = (int)((long)(-2051278660 * 243338361 + -686885935 ^ var5_4) ^ -4785425301128334745L ^ -4785425301128334745L);
                                                                                                            var7_3 += 2;
                                                                                                            continue;
                                                                                                        }
                                                                                                        Integer.rotateLeft(271531077 ^ var5_4, 5) - -99226730;
                                                                                                        (int)(-3270296709639115953L ^ (long)var5_4 ^ -2774073222000801558L);
                                                                                                        if (!this.md_2.dhbn("Day")) {
                                                                                                            (int)(-5912356297207512252L ^ (long)var5_4 ^ -3171850811471890889L);
                                                                                                            var6_5 = (243950998 * 243338361 + -686885935 ^ var5_4) + 1130836233 - 1130836233;
                                                                                                            var7_3 -= 3;
                                                                                                            continue;
                                                                                                        }
                                                                                                        try {
                                                                                                            --var7_3;
                                                                                                            var6_5 = (876337242 * 243338361 + -686885935 ^ var5_4) + 1791352008 - 1791352008;
                                                                                                        }
                                                                                                        catch (ArithmeticException v7) {
                                                                                                            var6_5 = 876337242 * 243338361 + -686885935 ^ var5_4 ^ 552895862 ^ 552895862;
                                                                                                        }
                                                                                                        var7_3 += 3;
                                                                                                        continue;
                                                                                                    }
                                                                                                    (Integer.rotateLeft(1195297144 ^ var5_4, 11) + -1527249725) * 1195297145;
                                                                                                    if (zb_2.mc.field_1687 == null) {
                                                                                                        try {
                                                                                                            var7_3 += 5;
                                                                                                            if ((6020994733924718791L ^ (long)var5_4 | 1L) == 0L) {
                                                                                                                throw new UnsupportedOperationException();
                                                                                                            }
                                                                                                            var6_5 = Integer.reverse(Integer.reverse(-2051278660 * 243338361 + -686885935 ^ var5_4));
                                                                                                        }
                                                                                                        catch (UnsupportedOperationException v8) {
                                                                                                            var6_5 = -2051278660 * 243338361 + -686885935 ^ var5_4 ^ -1273044745 ^ -1273044745;
                                                                                                        }
                                                                                                        var7_3 -= 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    (int)(-217665670751003761L ^ (long)var5_4 ^ -7421014513325419484L);
                                                                                                    var6_5 = 461348170 * 243338361 + -686885935 ^ var5_4 ^ -183819687 ^ -183819687;
                                                                                                    (int)(5167352171888761859L ^ (long)var5_4 ^ -4348056973302750531L);
                                                                                                    var6_5 = 1431453645 * 243338361 + -686885935 ^ var5_4 ^ -1318865847 ^ -1318865847;
                                                                                                    ++var7_3;
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateRight(-2001628658 ^ var5_4, 4) - -1847701779;
                                                                                                var3_2 = var1_1;
                                                                                                var6_5 = Integer.reverse(Integer.reverse(1042412516 * 243338361 + -686885935 ^ var5_4));
                                                                                                Integer.rotateLeft(-446467347 ^ var5_4, 15) - -882341394;
                                                                                                (int)(2869317224191290191L ^ (long)var5_4 ^ 4958607338194461298L);
                                                                                                var6_5 = -1245476446 * 243338361 + -686885935 ^ var5_4 ^ -1552452821 ^ -1552452821;
                                                                                                var7_3 += 5;
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateRight(786367766 ^ var5_4, 8) - -1319158555) * 786367767;
                                                                                            var3_2 = -3958493521794594208L ^ -3958493521794581726L;
                                                                                            try {
                                                                                                var7_3 += 2;
                                                                                                var6_5 = -1245476446 * 243338361 + -686885935 ^ var5_4;
                                                                                            }
                                                                                            catch (IllegalArgumentException v9) {
                                                                                                var6_5 = (-1245476446 * 243338361 + -686885935 ^ var5_4) + -552288604 - -552288604;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateRight(-928795101 ^ var5_4, 12) + 1345367416;
                                                                                        var3_2 = 636512212653616626L ^ 636512212653612858L;
                                                                                        var6_5 = Integer.reverse(Integer.reverse(-1245476446 * 243338361 + -686885935 ^ var5_4));
                                                                                        (Integer.rotateRight(2139767007 ^ var5_4, 18) - 1981512252) * 2139767007;
                                                                                        var7_3 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateLeft(108636721 ^ var5_4, 3) + -853984470) * 108636721;
                                                                                    (int)(-4266311771749029041L ^ (long)var5_4 ^ -763215988379868089L);
                                                                                    if (this.md_2.dhbn("Dusk")) {
                                                                                        var6_5 = -1489604028 * 243338361 + -686885935 ^ var5_4;
                                                                                        Integer.rotateRight(1186892615 ^ var5_4, 11) - -1787790124;
                                                                                        var6_5 = -172390758 * 243338361 + -686885935 ^ var5_4;
                                                                                        continue;
                                                                                    }
                                                                                    var6_5 = (1412426677 * 243338361 + -686885935 ^ var5_4) + 887196787 - 887196787;
                                                                                    (Integer.rotateRight(-887838726 ^ var5_4, 12) + -1679952255) * -887838725;
                                                                                    var6_5 = Integer.reverse(Integer.reverse(-292980842 * 243338361 + -686885935 ^ var5_4));
                                                                                    var7_3 -= 4;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateLeft(1110626549 ^ var5_4, 11) - 142929126) * 1110626549;
                                                                                (int)(-9187203841708987569L ^ (long)var5_4 ^ 63194543242652881L);
                                                                                var3_2 = 2969574479648309494L ^ 2969574479648294566L;
                                                                                var6_5 = -878577454 * 243338361 + -686885935 ^ var5_4;
                                                                                Integer.rotateLeft(-1776209119 ^ var5_4, 5) + 845336634;
                                                                                (int)(6094387465015323471L ^ (long)var5_4 ^ -4086872513379236618L);
                                                                                var6_5 = Integer.reverse(Integer.reverse(-1245476446 * 243338361 + -686885935 ^ var5_4));
                                                                                var7_3 += 4;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateLeft(1220019997 ^ var5_4, 12) - -760841282) * 1220019997;
                                                                            (int)(-8499795391136076977L ^ (long)var5_4 ^ -5823010169730582076L);
                                                                            if (this.md_2.dhbn("Dawn")) {
                                                                                (int)(-6369533955278393403L ^ (long)var5_4 ^ 4632542777516548836L);
                                                                                var6_5 = (int)((long)(244740079 * 243338361 + -686885935 ^ var5_4) ^ -3911995468136289378L ^ -3911995468136289378L);
                                                                                (int)(5948965930796534126L ^ (long)var5_4 ^ 904573427744704716L);
                                                                                var6_5 = Integer.reverse(Integer.reverse(842162697 * 243338361 + -686885935 ^ var5_4));
                                                                                var7_3 += 3;
                                                                                continue;
                                                                            }
                                                                            (int)(-6322641315921635061L ^ (long)var5_4 ^ 1369490262458432851L);
                                                                            var6_5 = (int)((long)(-1639937088 * 243338361 + -686885935 ^ var5_4) ^ -1900033592042646467L ^ -1900033592042646467L);
                                                                            (int)(-7556380158122058421L ^ (long)var5_4 ^ 5611733718775399317L);
                                                                            var6_5 = -2081320485 * 243338361 + -686885935 ^ var5_4;
                                                                            var7_3 += 3;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateLeft(-428708252 ^ var5_4, 15) - -331809449;
                                                                        var6_5 = -2001147095 * 243338361 + -686885935 ^ var5_4 ^ -1034406845 ^ -1034406845;
                                                                        Integer.rotateLeft(-588952568 ^ var5_4, 14) + -1004415949;
                                                                        try {
                                                                            ++var7_3;
                                                                            if ((2826340946504261691L ^ (long)var5_4 | 1L) == 0L) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            var6_5 = Integer.reverse(Integer.reverse(-1529632710 * 243338361 + -686885935 ^ var5_4));
                                                                        }
                                                                        catch (IllegalArgumentException v10) {
                                                                            var6_5 = (int)((long)(-1529632710 * 243338361 + -686885935 ^ var5_4) ^ -2944833611096891325L ^ -2944833611096891325L);
                                                                        }
                                                                        --var7_3;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateLeft(-1998790488 ^ var5_4, 4) + -1759718509;
                                                                    var6_5 = -1107935831 * 243338361 + -686885935 ^ var5_4;
                                                                    Integer.rotateRight(1811499106 ^ var5_4, 16) + 395141913;
                                                                    var6_5 = -1529632710 * 243338361 + -686885935 ^ var5_4;
                                                                    --var7_3;
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(-152637407 ^ var5_4, 17) + -363547846;
                                                                (int)(3770742263036308303L ^ (long)var5_4 ^ 4704153959248020857L);
                                                                (int)(-6677528864212868450L ^ (long)var5_4 ^ -5714572138688877704L);
                                                                var6_5 = -493741154 * 243338361 + -686885935 ^ var5_4 ^ -690038285 ^ -690038285;
                                                                (int)(-805748814369846000L ^ (long)var5_4 ^ 3603185528817992819L);
                                                                var6_5 = -1529632710 * 243338361 + -686885935 ^ var5_4;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(1604278561 ^ var5_4, 14) + -1733727686;
                                                            (int)(-7120763735503475889L ^ (long)var5_4 ^ 1389504633503258506L);
                                                            var6_5 = -1771213869 * 243338361 + -686885935 ^ var5_4;
                                                            Integer.rotateLeft(129601033 ^ var5_4, 3) + -204090798;
                                                            (int)(-4248266415115277489L ^ (long)var5_4 ^ -4820959252640684089L);
                                                            try {
                                                                var7_3 += 2;
                                                                if ((787138997991300321L ^ (long)var5_4 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                var6_5 = (int)((long)(-1529632710 * 243338361 + -686885935 ^ var5_4) ^ 6058265129277487335L ^ 6058265129277487335L);
                                                            }
                                                            catch (UnsupportedOperationException v11) {
                                                                var6_5 = (int)((long)(-1529632710 * 243338361 + -686885935 ^ var5_4) ^ -5104697063169637728L ^ -5104697063169637728L);
                                                            }
                                                            var7_3 += 4;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(1581165011 ^ var5_4, 14) + 1844719560) * 1581165011;
                                                        var6_5 = (-1862206868 * 243338361 + -686885935 ^ var5_4) + 294353227 - 294353227;
                                                        (Integer.rotateRight(-18026825 ^ var5_4, 18) - -485587100) * -18026825;
                                                        var6_5 = -1529632710 * 243338361 + -686885935 ^ var5_4;
                                                        var7_3 -= 3;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1527424281 ^ var5_4, 14) + 178756930) * 1527424281;
                                                    (int)(-7370128540276823217L ^ (long)var5_4 ^ -1497302727641227615L);
                                                    try {
                                                        var7_3 += 4;
                                                        if ((-8765816721409629503L ^ (long)var5_4 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        var6_5 = Integer.reverse(Integer.reverse(-1529632710 * 243338361 + -686885935 ^ var5_4));
                                                    }
                                                    catch (UnsupportedOperationException v12) {
                                                        var6_5 = Integer.reverse(Integer.reverse(-1529632710 * 243338361 + -686885935 ^ var5_4));
                                                    }
                                                    var7_3 += 4;
                                                    continue;
                                                }
                                                Integer.rotateLeft(507150568 ^ var5_4, 6) + -1384957101;
                                                (int)(-6044333924729695185L ^ (long)var5_4 ^ -7938863204028320275L);
                                                var6_5 = -13474306 * 243338361 + -686885935 ^ var5_4 ^ -184451077 ^ -184451077;
                                                (int)(-2681993115218030764L ^ (long)var5_4 ^ -5223711065332901794L);
                                                var6_5 = Integer.reverse(Integer.reverse(-1529632710 * 243338361 + -686885935 ^ var5_4));
                                                var7_3 += 3;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-1901433551 ^ var5_4, 4) + 1258346538) * -1901433551;
                                            (int)(5483347003298868047L ^ (long)var5_4 ^ 8892501612702545376L);
                                            var6_5 = Integer.reverse(Integer.reverse(-1529632710 * 243338361 + -686885935 ^ var5_4));
                                            ++var7_3;
                                            continue;
                                        }
                                        (Integer.rotateLeft(-1196167856 ^ var5_4, 10) + 1646746603) * -1196167855;
                                        var6_5 = (int)((long)(310518861 * 243338361 + -686885935 ^ var5_4) ^ -9194054645833600666L ^ -9194054645833600666L);
                                        (Integer.rotateLeft(1939168756 ^ var5_4, 17) - 57933767) * 1939168757;
                                        (int)(-8791629853721274141L ^ (long)var5_4 ^ 5405450680982873642L);
                                        var6_5 = (int)((long)(-1529632710 * 243338361 + -686885935 ^ var5_4) ^ -6000453789083605063L ^ -6000453789083605063L);
                                        var7_3 -= 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(-828302314 ^ var5_4, 12) - 165676517) * -828302313;
                                    var6_5 = (int)((long)(-2041689374 * 243338361 + -686885935 ^ var5_4) ^ 8584141574335269144L ^ 8584141574335269144L);
                                    Integer.rotateLeft(-1591809052 ^ var5_4, 7) - -2028195881;
                                    var6_5 = -1529632710 * 243338361 + -686885935 ^ var5_4 ^ -670782384 ^ -670782384;
                                    continue;
                                }
                                Integer.rotateLeft(779777920 ^ var5_4, 8) + -1523443781;
                                try {
                                    var7_3 += 3;
                                    var6_5 = -1529632710 * 243338361 + -686885935 ^ var5_4;
                                }
                                catch (NoSuchElementException v13) {
                                    var6_5 = -1529632710 * 243338361 + -686885935 ^ var5_4;
                                }
                                continue;
                            }
                            (Integer.rotateLeft(1668426104 ^ var5_4, 15) + 254846147) * 1668426105;
                            var6_5 = -646316929 * 243338361 + -686885935 ^ var5_4 ^ 1228452258 ^ 1228452258;
                            (Integer.rotateLeft(-2078503972 ^ var5_4, 3) - 64130783) * -2078503971;
                            var6_5 = (-1529632710 * 243338361 + -686885935 ^ var5_4) + 512836709 - 512836709;
                            (Integer.rotateLeft(-1024651080 ^ var5_4, 11) + -1626167933) * -1024651079;
                            var7_3 -= 4;
                            continue;
                        }
                        Integer.rotateLeft(-1756132064 ^ var5_4, 5) + 1467725339;
                        var6_5 = Integer.reverse(Integer.reverse(-331879164 * 243338361 + -686885935 ^ var5_4));
                        Integer.rotateLeft(-83196479 ^ var5_4, 18) + 1789120922;
                        (int)(4159122617876671311L ^ (long)var5_4 ^ -6158528341969609055L);
                        try {
                            ++var7_3;
                            if ((8799590726218285407L ^ (long)var5_4 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var6_5 = (-1529632710 * 243338361 + -686885935 ^ var5_4) + 303543590 - 303543590;
                        }
                        catch (ArithmeticException v14) {
                            var6_5 = (-1529632710 * 243338361 + -686885935 ^ var5_4) + 540159584 - 540159584;
                        }
                        var7_3 += 3;
                        continue;
                    }
                    Integer.rotateLeft(1120666305 ^ var5_4, 11) + 454161562;
                    (int)(-9187715990789231793L ^ (long)var5_4 ^ -6590873906197254868L);
                    var6_5 = (int)((long)(1092143903 * 243338361 + -686885935 ^ var5_4) ^ 307691223547490860L ^ 307691223547490860L);
                    Integer.rotateLeft(1264014953 ^ var5_4, 12) + 603002354;
                    (int)(-8510122880517477553L ^ (long)var5_4 ^ 997691465922035226L);
                    var6_5 = (int)((long)(-1529632710 * 243338361 + -686885935 ^ var5_4) ^ 7290685081641043652L ^ 7290685081641043652L);
                    var7_3 += 2;
                    continue;
                }
                (Integer.rotateRight(1425527007 ^ var5_4, 13) - 1314908732) * 1425527007;
                var6_5 = -236779065 * 243338361 + -686885935 ^ var5_4;
                Integer.rotateLeft(2061311692 ^ var5_4, 18) - -450602513;
                try {
                    if ((7611764742390251991L ^ (long)var5_4 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var6_5 = -1529632710 * 243338361 + -686885935 ^ var5_4;
                }
                catch (ArithmeticException v15) {
                    var6_5 = (int)((long)(-1529632710 * 243338361 + -686885935 ^ var5_4) ^ 7127967779118781810L ^ 7127967779118781810L);
                }
                ++var7_3;
                continue;
            }
            return var3_2;
lbl583:
            // 20 sources

            Integer.rotateLeft(130308716 ^ var5_4, 3) - -182152625;
            var6_5 = Integer.reverse(Integer.reverse(-1529632710 * 243338361 + -686885935 ^ var5_4));
        }
    }

    public boolean ztk_3() {
        return false;
    }

    public boolean khqt() {
        block0: {
            int n = -557999706;
            n = Integer.rotateLeft(n * -1206260237, 9) ^ 0xBB0C6763;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF1F04443;
            if ((n2 ^ n) == -235912125) break block0;
            int cfr_ignored_0 = (0x2F4DDDE5 ^ n) + -1369739958;
        }
        return false;
    }

    public byq dqd() {
        block0: {
            int n = 1914361111;
            n = Integer.rotateLeft(n * 37758055, 27) ^ 0x993080DD;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0xC426B1A9;
            if ((n2 ^ n) == -1004097111) break block0;
            int cfr_ignored_0 = (0xB63C64BE ^ n) - 1650072726;
        }
        return byq.brz_2;
    }

    public boolean jaq_2() {
        block0: {
            int n = 1969641705;
            n = Integer.rotateLeft(n * 523501029, 13) ^ 0x44D1BBE6;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0x7C18FBFD;
            if ((n2 ^ n) == 2082012157) break block0;
            int cfr_ignored_0 = (0x97EA314 ^ n) + -1667340415;
        }
        return false;
    }

    public class_2960 dhrh() {
        block0: {
            int n = ttf.khkhz(1383642137);
            int n2 = n ^ 0xAF2EE405;
            if ((n2 ^ n) == -1355881467) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xFD56501C ^ n, 18) - -1311681889) * -44675043;
        }
        return null;
    }

    public boolean dhr_3() {
        block0: {
            int n = ttf.khkhz(890921303);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0x64CAF120;
            if ((n2 ^ n) == 1691021600) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x51D09077 ^ n, 13) - -325116508) * 1372622967;
        }
        return false;
    }

    public float bza_3() {
        block0: {
            int n = 241596890;
            n = Integer.rotateLeft(n * -931156517, 3) ^ 0xBFB8332F;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
            int n2 = n ^ 0xC734E383;
            if ((n2 ^ n) == -952835197) break block0;
            int cfr_ignored_0 = (0xC9529A59 ^ n) + -618558908;
        }
        return 1.0f;
    }

    public tt_4 tza_4() {
        block0: {
            int n = ttf.khkhz(227811235);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0x46930E0F;
            if ((n2 ^ n) == 1184042511) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4B0711AC ^ n, 12) - 439927567;
        }
        return null;
    }

    public boolean sshh() {
        block0: {
            int n = 429048450;
            n = Integer.rotateLeft(n * -2044711489, 16) ^ 0xE483A225;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x84230879;
            if ((n2 ^ n) == -2078078855) break block0;
            int cfr_ignored_0 = (0x9DB1CAFB ^ n) - 1895168674;
        }
        return false;
    }

    public byq sdt_2() {
        block0: {
            int n = 640687216;
            int n2 = (n = Integer.rotateLeft(n * 856998839, 23) ^ 0xFEE08A41) ^ 0xB2F4C882;
            if ((n2 ^ n) == -1292580734) break block0;
            int cfr_ignored_0 = (0x94C4D4F2 ^ n) + -1147411832;
        }
        return byq.brz_2;
    }

    public boolean ttsh() {
        block0: {
            int n = -2091225422;
            n = Integer.rotateLeft(n * -117564975, 9) ^ 0x66FAD9A8;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0x45649AFD;
            if ((n2 ^ n) == 1164221181) break block0;
            int cfr_ignored_0 = (0xC63EF44F ^ n) + 5815683;
        }
        return false;
    }

    public byq jdsh_2() {
        block0: {
            int n = 1654081497;
            n = Integer.rotateLeft(n * 765919681, 25) ^ 0x520606B1;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0x9A59D7DF;
            if ((n2 ^ n) == -1705388065) break block0;
            int cfr_ignored_0 = (0xF8CE9006 ^ n) - -1098702114;
        }
        return byq.brz_2;
    }

    public float tdt() {
        block0: {
            int n = -951745150;
            n = Integer.rotateLeft(n * -744080755, 26) ^ 0xDE50EB68;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2AAEF073;
            if ((n2 ^ n) == 716107891) break block0;
            int cfr_ignored_0 = (0xEDEB75F1 ^ n) - 1529228635;
        }
        return 0.0f;
    }

    private static String zhj_3(String string, int n, int n2, int n3) {
        int n4 = ttf.khkhz(1619351005);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 5);
        int n5 = n4 ^ 0xDF268235;
        if ((n5 ^ n4) != -551124427) {
            int cfr_ignored_0 = Integer.rotateLeft(0xBFA3D7E8 ^ n4, 10) + 959759443;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x61F3429E) + i ^ tnz_2, 16) ^ n2 + jhh_2));
        }
        return new String(cArray);
    }

    private static String bhkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1622277531;
            n4 = Integer.rotateLeft(n4 * -921256323, 14) ^ 0xC3094420;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xF61C7E6F;
            if ((n5 ^ n4) == -165904785) break block0;
            int cfr_ignored_0 = (0x96AD83F4 ^ n4) - -95752152;
        }
        return zb_2.zhj_3(string, n, n2, n3);
    }

    private static String tadh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = ttf.khkhz(-1443028453);
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 14)) ^ 0x6067C901;
            if ((n5 ^ n4) == 1617414401) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xC99AEB1A ^ n4, 12) + 1847596897) * -912594149;
        }
        return zb_2.zhj_3(string, n, n2, n3);
    }

    private static boolean smd_3(khd khd2, String string) {
        block0: {
            int n = -221918990;
            n = Integer.rotateLeft(n * 813157067, 14) ^ 0xC10F1730;
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            int n2 = n ^ 0x7880E68E;
            if ((n2 ^ n) == 2021713550) break block0;
            int cfr_ignored_0 = (0x8A452E7C ^ n) - 1200350498;
        }
        return khd2.dhbn(string);
    }

    private static String thfth(String string, int n, int n2, int n3) {
        block0: {
            int n4 = ttf.khkhz(-1622021185);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0x62B848E3;
            if ((n5 ^ n4) == 1656244451) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xFDE9A35C ^ n4, 18) - -1012373665) * -35019939;
        }
        return zb_2.zhj_3(string, n, n2, n3);
    }

    private static String dhda_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -819789770;
            n4 = Integer.rotateLeft(n4 * 349551269, 5) ^ 0x3D4BFBE5;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 25);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 17)) ^ 0x52EBC537;
            if ((n5 ^ n4) == 1391183159) break block0;
            int cfr_ignored_0 = (0x9DC8C501 ^ n4) + 435914571;
        }
        return zb_2.zhj_3(string, n, n2, n3);
    }

    private static String[] zsh_5(String string) {
        block0: {
            int n = -1870233171;
            int n2 = (n = Integer.rotateLeft(n * -616487979, 21) ^ 0x2EB9B069) ^ 0x4D36A9AA;
            if ((n2 ^ n) == 1295428010) break block0;
            int cfr_ignored_0 = (0xDDB02807 ^ n) - 1699811317;
        }
        return string.split("\u0007\u0015", -1);
    }

    private static CallSite bdd_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 2086375024;
            n3 = Integer.rotateLeft(n3 * -337587377, 13) ^ 0xEA09F83E;
            int n4 = n3 ^ 0xDA200877;
            if ((n4 ^ n3) != -635434889) {
                int cfr_ignored_0 = (0xA67B8607 ^ n3) + 1993896120;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ddhsh ^ string.hashCode() ^ n2 + jlsh + i * 2058590023) + ddhsh) ^ jlsh));
            }
            String[] stringArray = zb_2.zsh_5(new String(cArray));
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

    private static String[] bngtl1wsa00(String string) {
        return string.split("\u0006\u0014", -1);
    }

    private static CallSite ckhiq9ipg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ z4jepu1wex5 ^ string.hashCode() ^ n2 + r46f1tlo ^ i * 741304545 ^ z4jepu1wex5, 6) ^ r46f1tlo));
            }
            String[] stringArray = zb_2.bngtl1wsa00(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

