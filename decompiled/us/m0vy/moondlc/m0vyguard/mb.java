/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1661
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2886
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
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
import net.minecraft.class_2596;
import net.minecraft.class_2886;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bjd_2;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bfn;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.kh;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.km;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.hz_4;
import us.m0vy.moondlc.m0vyguard.yf;
import us.m0vy.moondlc.m0vyguard.yn;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.ClientPlayerInteractionManagerAccessor;

@tq_2(name="Click Pearl", category=bzw.OTHER, desc="Throws an ender pearl instantly from a bind")
public class mb
extends bnq {
    private static final int jshf = 45;
    private final bdh_3 sat_4 = new bdh_3(this, "Throw Key");
    private final badh_2 jhh_3 = new badh_2(this, "Legit").bts(false);
    private hz_4 jhd = hz_4.jdb_2;
    private boolean tthd_2;
    private boolean bzf;
    private int bzs_2 = -1;
    private int dhft = -1;
    private int ks_2 = -1;
    private final bql<btt> thqh = this::dkk;
    private final bql<bjd_2> jal = this::shdw_2;
    private static final int jbq = -1395775532;
    private static final int khwr = 1777760156;
    private static final int tds_3 = -1322836731;
    private static final int shsk_2 = -1035838588;
    private static final int n9ena4w = 1484098980;
    private static final int yl7upk5 = -949892516;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int uogct6n5lzbs;

    @Override
    public void nt() {
        int n = 1020872256;
        n = Integer.rotateLeft(n * -2101627877, 28) ^ 0x42BE0BEE;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
        int n2 = n ^ 0xCFAE38CC;
        if ((n2 ^ n) != -810665780) {
            int cfr_ignored_0 = (0xF3777E8C ^ n) - 341659165;
        }
        this.tthd_2 = false;
        this.dhhz_4();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = -71626677;
        var1_2 = Integer.rotateLeft(var1_2 * -1071149611, 26) ^ 1428597650;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = (-52659862 * 537246921 + -850377973 ^ var1_2) + 426682334 - 426682334;
        while (true) {
            block40: {
                block38: {
                    block43: {
                        block35: {
                            block34: {
                                block39: {
                                    block37: {
                                        block36: {
                                            block41: {
                                                block44: {
                                                    block33: {
                                                        block42: {
                                                            var3_1 = ((var2_3 ^ var1_2) - -850377973) * 506404217;
                                                            switch (var3_1 & 7) {
                                                                case 0: {
                                                                    if (var3_1 != 644466648) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 3: {
                                                                    if (var3_1 == -1752703141) break block34;
                                                                    if (var3_1 == -1881174805) break block35;
                                                                    (Integer.rotateRight(1722715030 ^ var1_2, 15) - 1937802853) * 1722715031;
                                                                    if (var3_1 != -2013070021) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 2: {
                                                                    if (var3_1 == 178028066) break block37;
                                                                    if (var3_1 != 1229456842) {
                                                                        if (var3_1 == -52659862) break;
                                                                        ** break;
                                                                    }
                                                                    break block38;
                                                                }
                                                                case 6: {
                                                                    if (var3_1 == -1111319826) break block39;
                                                                    if (var3_1 != 1369117782) {
                                                                        Integer.rotateLeft(-420382068 ^ var1_2, 15) - -73697745;
                                                                        ** break;
                                                                    }
                                                                    break block40;
                                                                }
                                                                case 7: {
                                                                    if (var3_1 != -1370318129) {
                                                                        ** break;
                                                                    }
                                                                    break block41;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 == 178146284) break block42;
                                                                    if (var3_1 != -1539234548) {
                                                                        (Integer.rotateRight(25712499 ^ var1_2, 3) + 870331944) * 25712499;
                                                                        ** break;
                                                                    }
                                                                    break block43;
                                                                }
                                                                case 5: {
                                                                    if (var3_1 != 51667781) {
                                                                        ** break;
                                                                    }
                                                                    break block44;
                                                                }
                                                            }
                                                            kh.jksh(1998303552, var1_2);
                                                            (int)(-1644718789989073899L ^ (long)var1_2 ^ 7818867046204866440L);
                                                            if (yf.khdha_2()) {
                                                                var2_3 = (644466648 * 537246921 + -850377973 ^ var1_2) + 2022253877 - 2022253877;
                                                                var3_1 -= 5;
                                                                continue;
                                                            }
                                                            try {
                                                                var3_1 -= 2;
                                                                if ((4541021919220553715L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var2_3 = 178146284 * 537246921 + -850377973 ^ var1_2 ^ -161895849 ^ -161895849;
                                                            }
                                                            catch (NoSuchElementException v0) {
                                                                var2_3 = (178146284 * 537246921 + -850377973 ^ var1_2) + -1404807751 - -1404807751;
                                                            }
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1952875992 ^ var1_2, 4) + -336369133;
                                                        mb.aqk();
                                                        try {
                                                            var3_1 -= 2;
                                                            if ((7315179787962403235L ^ (long)var1_2 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            var2_3 = 644466648 * 537246921 + -850377973 ^ var1_2;
                                                        }
                                                        catch (ArithmeticException v1) {
                                                            var2_3 = (644466648 * 537246921 + -850377973 ^ var1_2) + 1255400198 - 1255400198;
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(-1873131036 ^ var1_2, 5) - 2135724503;
                                                    this.thss_4();
                                                    this.tthd_2 = false;
                                                    return;
                                                }
                                                Integer.rotateRight(-1224523162 ^ var1_2, 9) - 767732117;
                                                var2_3 = Integer.reverse(Integer.reverse(1509789237 * 537246921 + -850377973 ^ var1_2));
                                                Integer.rotateRight(2126081743 ^ var1_2, 18) - 1557269068;
                                                try {
                                                    if ((-714573640497810075L ^ (long)var1_2 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    var2_3 = Integer.reverse(Integer.reverse(-52659862 * 537246921 + -850377973 ^ var1_2));
                                                }
                                                catch (NoSuchElementException v2) {
                                                    var2_3 = (int)((long)(-52659862 * 537246921 + -850377973 ^ var1_2) ^ 8150932701153400996L ^ 8150932701153400996L);
                                                }
                                                --var3_1;
                                                continue;
                                            }
                                            (Integer.rotateLeft(359081080 ^ var1_2, 5) + -1680143933) * 359081081;
                                            try {
                                                var3_1 -= 5;
                                                if ((-8691166147546243817L ^ (long)var1_2 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                var2_3 = Integer.reverse(Integer.reverse(-52659862 * 537246921 + -850377973 ^ var1_2));
                                            }
                                            catch (IllegalStateException v3) {
                                                var2_3 = Integer.reverse(Integer.reverse(-52659862 * 537246921 + -850377973 ^ var1_2));
                                            }
                                            var3_1 += 3;
                                            continue;
                                        }
                                        Integer.rotateRight(-1226987794 ^ var1_2, 9) - 691328525;
                                        var2_3 = (-126858792 * 537246921 + -850377973 ^ var1_2) + 2061824414 - 2061824414;
                                        kh.jksh(1913436992, var1_2);
                                        (int)(-1424330480294396907L ^ (long)var1_2 ^ 8683558174659999142L);
                                        var2_3 = (int)((long)(-52659862 * 537246921 + -850377973 ^ var1_2) ^ 3590564920109765115L ^ 3590564920109765115L);
                                        continue;
                                    }
                                    Integer.rotateRight(-240729141 ^ var1_2, 17) + 1200575696;
                                    var2_3 = 1328222846 * 537246921 + -850377973 ^ var1_2 ^ -1454808816 ^ -1454808816;
                                    (Integer.rotateLeft(1758007793 ^ var1_2, 16) + -1263088790) * 1758007793;
                                    (int)(-6162120781563892913L ^ (long)var1_2 ^ -9013810505722562266L);
                                    (int)(-5346982184585249006L ^ (long)var1_2 ^ -7683006430801902010L);
                                    var2_3 = -103212971 * 537246921 + -850377973 ^ var1_2 ^ -1653978720 ^ -1653978720;
                                    (int)(3519109768878138473L ^ (long)var1_2 ^ 4184384595660491901L);
                                    var2_3 = -52659862 * 537246921 + -850377973 ^ var1_2;
                                    var3_1 -= 5;
                                    continue;
                                }
                                (Integer.rotateLeft(1812199289 ^ var1_2, 16) + 416847586) * 1812199289;
                                (int)(-5858803490971391153L ^ (long)var1_2 ^ 5762499871680032947L);
                                var2_3 = (int)((long)(-52659862 * 537246921 + -850377973 ^ var1_2) ^ 4170017231778321277L ^ 4170017231778321277L);
                                var3_1 += 4;
                                continue;
                            }
                            (Integer.rotateRight(538200795 ^ var1_2, 7) + -422400064) * 538200795;
                            var2_3 = Integer.reverse(Integer.reverse(-2135758584 * 537246921 + -850377973 ^ var1_2));
                            (Integer.rotateRight(2136712531 ^ var1_2, 18) + 1886823496) * 2136712531;
                            try {
                                if ((960990332818400635L ^ (long)var1_2 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var2_3 = (-52659862 * 537246921 + -850377973 ^ var1_2) + 778072855 - 778072855;
                            }
                            catch (IllegalStateException v4) {
                                var2_3 = (-52659862 * 537246921 + -850377973 ^ var1_2) + -7559823 - -7559823;
                            }
                            var3_1 += 2;
                            continue;
                        }
                        Integer.rotateLeft(-2097051796 ^ var1_2, 3) - -510851761;
                        var2_3 = -52659862 * 537246921 + -850377973 ^ var1_2;
                        continue;
                    }
                    (Integer.rotateRight(-787058925 ^ var1_2, 13) + 1444221576) * -787058925;
                    (int)(9137225483114409766L ^ (long)var1_2 ^ 1811625654281261130L);
                    var2_3 = Integer.reverse(Integer.reverse(-534822086 * 537246921 + -850377973 ^ var1_2));
                    (int)(3339882419784179162L ^ (long)var1_2 ^ -5202852540100382366L);
                    var2_3 = Integer.reverse(Integer.reverse(-52659862 * 537246921 + -850377973 ^ var1_2));
                    var3_1 -= 4;
                    continue;
                }
                Integer.rotateLeft(-1854867995 ^ var1_2, 5) - -1593088522;
                (int)(6035487434569214799L ^ (long)var1_2 ^ 5386449302794603093L);
                var2_3 = -52659862 * 537246921 + -850377973 ^ var1_2 ^ 490537907 ^ 490537907;
                var3_1 -= 5;
                continue;
            }
            Integer.rotateLeft(993393572 ^ var1_2, 10) - 803674135;
            var2_3 = -380871428 * 537246921 + -850377973 ^ var1_2;
            (Integer.rotateRight(844651835 ^ var1_2, 9) + 487647584) * 844651835;
            var2_3 = Integer.reverse(Integer.reverse(-52659862 * 537246921 + -850377973 ^ var1_2));
            (Integer.rotateLeft(10912885 ^ var1_2, 3) - 411543910) * 10912885;
            (int)(-4461894841423041713L ^ (long)var1_2 ^ -6205816138057111047L);
            var3_1 += 2;
            continue;
lbl199:
            // 8 sources

            (Integer.rotateLeft(226411381 ^ var1_2, 4) - -1497937306) * 226411381;
            (int)(-3473281055936156849L ^ (long)var1_2 ^ 2873440710721811017L);
            var2_3 = Integer.reverse(Integer.reverse(-52659862 * 537246921 + -850377973 ^ var1_2));
        }
    }

    private void rdhj() {
        try {
            int n = -1664859863;
            n = Integer.rotateLeft(n * -264950715, 4) ^ 0xED9E158C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4582B31A;
            if ((n2 ^ n) != 1166193434) {
                int cfr_ignored_0 = (0xD946F233 ^ n) - 1896851653;
            }
            if ((0x34F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        int n = this.jrt();
        if (n == -1) {
            return;
        }
        this.bzs_2 = mb.bdl((class_746)mb.mc.field_1724).field_7545;
        if (n == (0x49636E35 ^ 0x49636E18)) {
            this.dhft = Integer.reverse(-1465791081) ^ 0xE9B38538;
            this.jhd = hz_4.btdh;
            return;
        }
        if (n < -598497988 + 598497997) {
            this.dhft = n;
            this.jhd = n == this.bzs_2 ? hz_4.btdh : hz_4.thmf;
            return;
        }
        int n3 = mb.ddy_3(this);
        if (n3 == -1) {
            mb.rqr(this);
            return;
        }
        this.ks_2 = n;
        this.dhft = n3;
        this.jhd = hz_4.htgh_2;
    }

    /*
     * Unable to fully structure code
     */
    private void rghdh() {
        var3_1 = 0;
        var1_2 = -1804966131;
        var1_2 = Integer.rotateLeft(var1_2 * -1987215573, 11) ^ -802144838;
        var1_2 = Integer.rotateLeft(System.identityHashCode(this) ^ var1_2, 29);
        var2_3 = (int)((long)(1341670547 + var1_2) ^ 1209143458386604087L ^ 1209143458386604087L);
        while (true) {
            block56: {
                block53: {
                    block57: {
                        block60: {
                            block68: {
                                block59: {
                                    block73: {
                                        block71: {
                                            block63: {
                                                block64: {
                                                    block55: {
                                                        block66: {
                                                            block69: {
                                                                block58: {
                                                                    block54: {
                                                                        block65: {
                                                                            block72: {
                                                                                block62: {
                                                                                    block70: {
                                                                                        block67: {
                                                                                            block61: {
                                                                                                var3_1 = var2_3 - var1_2;
                                                                                                switch (var3_1 & 15) {
                                                                                                    case 0: {
                                                                                                        if (var3_1 != -1900946160) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block53;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        if (var3_1 != 442445058) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block54;
                                                                                                    }
                                                                                                    case 14: {
                                                                                                        if (var3_1 == -541963490) break block55;
                                                                                                        if (var3_1 != 1163841726) {
                                                                                                            Integer.rotateRight(-1329113813 ^ var1_2, 9) + 1820389232;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block56;
                                                                                                    }
                                                                                                    case 15: {
                                                                                                        if (var3_1 != -1277584497) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block57;
                                                                                                    }
                                                                                                    case 8: {
                                                                                                        if (var3_1 == 203176744) break block58;
                                                                                                        if (var3_1 != 1376073528) {
                                                                                                            Integer.rotateRight(-1687793686 ^ var1_2, 6) + -708752239;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block59;
                                                                                                    }
                                                                                                    case 13: {
                                                                                                        if (var3_1 == -137428787) break block60;
                                                                                                        if (var3_1 == -1871821203) break block61;
                                                                                                        (Integer.rotateLeft(1839247357 ^ var1_2, 16) - 1255337694) * 1839247357;
                                                                                                        (int)(-5831596642677757105L ^ (long)var1_2 ^ -76417045205814283L);
                                                                                                        if (var3_1 == 1694514669) break;
                                                                                                        if (var3_1 != 1723044685) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block62;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        if (var3_1 == 2108241187) break block63;
                                                                                                        if (var3_1 == -237095965) break block64;
                                                                                                        if (var3_1 != 1341670547) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block65;
                                                                                                    }
                                                                                                    case 10: {
                                                                                                        if (var3_1 != -1130709350) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block66;
                                                                                                    }
                                                                                                    case 4: {
                                                                                                        if (var3_1 == -1077897276) break block67;
                                                                                                        if (var3_1 != -957329836) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block68;
                                                                                                    }
                                                                                                    case 6: {
                                                                                                        if (var3_1 != -1621333594) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block69;
                                                                                                    }
                                                                                                    case 11: {
                                                                                                        if (var3_1 != 1096426747) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block70;
                                                                                                    }
                                                                                                    case 7: {
                                                                                                        if (var3_1 == -224757849) break block71;
                                                                                                        if (var3_1 == 1306587655) break block72;
                                                                                                        Integer.rotateRight(1964005967 ^ var1_2, 17) - 827887308;
                                                                                                        if (var3_1 != 1761539575) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block73;
                                                                                                    }
                                                                                                }
                                                                                                Integer.rotateLeft(-228081299 ^ var1_2, 17) - 1592658798;
                                                                                                (int)(3518841073916242767L ^ (long)var1_2 ^ 2580706734942833787L);
                                                                                                bfn.awy(this.dhft);
                                                                                                (int)(-1911921775209808769L ^ (long)var1_2 ^ 575370182862071615L);
                                                                                                var2_3 = 1723044685 + var1_2 ^ -1440569912 ^ -1440569912;
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateLeft(1606773748 ^ var1_2, 14) - -1656376889) * 1606773749;
                                                                                            bfn.awy(this.dhft);
                                                                                            (int)(4836359748097195174L ^ (long)var1_2 ^ -7326545040293286931L);
                                                                                            var2_3 = (int)((long)(-1451381692 + var1_2) ^ -7334264225022890958L ^ -7334264225022890958L);
                                                                                            (int)(447588253847378774L ^ (long)var1_2 ^ -5531910351164300867L);
                                                                                            var2_3 = 1723044685 + var1_2 + -1198443989 - -1198443989;
                                                                                            var3_1 -= 3;
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateLeft(1870836964 ^ var1_2, 16) - -2060351785;
                                                                                        if (this.jhh_3.shzl()) {
                                                                                            (int)(-7272762191426427485L ^ (long)var1_2 ^ 1716826891494661106L);
                                                                                            var2_3 = -1156772113 + var1_2 + 396285279 - 396285279;
                                                                                            (int)(8526431525559641887L ^ (long)var1_2 ^ 1002220150429663606L);
                                                                                            var2_3 = 1694514669 + var1_2 + -1702290766 - -1702290766;
                                                                                            var3_1 -= 2;
                                                                                            continue;
                                                                                        }
                                                                                        (int)(-3797120299113458871L ^ (long)var1_2 ^ 3105723864428329802L);
                                                                                        var2_3 = 203176744 + var1_2;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(713289989 ^ var1_2, 8) - 710397654;
                                                                                    (int)(-1715485288260375729L ^ (long)var1_2 ^ 4828002949000625587L);
                                                                                    if (this.dhft != this.bzs_2) {
                                                                                        try {
                                                                                            var3_1 -= 4;
                                                                                            var2_3 = -1077897276 + var1_2 ^ 1949882425 ^ 1949882425;
                                                                                        }
                                                                                        catch (NoSuchElementException v0) {
                                                                                            var2_3 = Integer.reverse(Integer.reverse(-1077897276 + var1_2));
                                                                                        }
                                                                                        var3_1 -= 2;
                                                                                        continue;
                                                                                    }
                                                                                    (int)(-121026062564712769L ^ (long)var1_2 ^ -887450762419351179L);
                                                                                    var2_3 = 1884331186 + var1_2 ^ 2019397683 ^ 2019397683;
                                                                                    (int)(-2341010863941870912L ^ (long)var1_2 ^ -2054852646046133545L);
                                                                                    var2_3 = (int)((long)(1306587655 + var1_2) ^ 4651139776111060824L ^ 4651139776111060824L);
                                                                                    --var3_1;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-1987991238 ^ var1_2, 4) + -1424941759) * -1987991237;
                                                                                return;
                                                                            }
                                                                            Integer.rotateRight(-674602066 ^ var1_2, 13) - 635416909;
                                                                            return;
                                                                        }
                                                                        (Integer.rotateRight(1294768958 ^ var1_2, 12) - 1556376509) * 1294768959;
                                                                        if (this.dhft >= 0) {
                                                                            (int)(-8155271622299817395L ^ (long)var1_2 ^ -5609568351128080268L);
                                                                            var2_3 = 442445058 + var1_2 + -1678348290 - -1678348290;
                                                                            var3_1 += 2;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            var3_1 += 5;
                                                                            if ((-4916241418668279415L ^ (long)var1_2 | 1L) == 0L) {
                                                                                throw new NoSuchElementException();
                                                                            }
                                                                            var2_3 = 1306587655 + var1_2 + 385171366 - 385171366;
                                                                        }
                                                                        catch (NoSuchElementException v1) {
                                                                            var2_3 = (int)((long)(1306587655 + var1_2) ^ 1759010679936178717L ^ 1759010679936178717L);
                                                                        }
                                                                        var3_1 += 2;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(1865006790 ^ var1_2, 16) - 2053880117;
                                                                    if (this.dhft <= (86318055 ^ 86318063)) {
                                                                        var2_3 = Integer.reverse(Integer.reverse(-774861085 + var1_2));
                                                                        Integer.rotateRight(-1016456697 ^ var1_2, 11) - -1372142060;
                                                                        var2_3 = (int)((long)(1096426747 + var1_2) ^ -608632473048844199L ^ -608632473048844199L);
                                                                        --var3_1;
                                                                        continue;
                                                                    }
                                                                    var2_3 = 1306587655 + var1_2 + 1571150944 - 1571150944;
                                                                    var3_1 += 3;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(529039707 ^ var1_2, 6) + -706393792) * 529039707;
                                                                mb.zsh_10(this.dhft);
                                                                try {
                                                                    var3_1 += 2;
                                                                    var2_3 = (int)((long)(1723044685 + var1_2) ^ -5046127763630256262L ^ -5046127763630256262L);
                                                                }
                                                                catch (IllegalArgumentException v2) {
                                                                    var2_3 = Integer.reverse(Integer.reverse(1723044685 + var1_2));
                                                                }
                                                                var3_1 += 3;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(2100100953 ^ var1_2, 18) + 751864578) * 2100100953;
                                                            (int)(-4639181075538187441L ^ (long)var1_2 ^ 6897406977777390317L);
                                                            var2_3 = -1844517267 + var1_2 + -703072747 - -703072747;
                                                            (Integer.rotateRight(-565533418 ^ var1_2, 14) - -278422299) * -565533417;
                                                            var2_3 = 1341670547 + var1_2;
                                                            var3_1 += 4;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(861203122 ^ var1_2, 9) + 1000737481) * 861203123;
                                                        var2_3 = 1341670547 + var1_2 ^ -1225189828 ^ -1225189828;
                                                        Integer.rotateRight(-377413853 ^ var1_2, 16) + 1258316920;
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(-1613620870 ^ var1_2, 6) + 1590605057) * -1613620869;
                                                    var2_3 = (int)((long)(-341211140 + var1_2) ^ 2030520653566514909L ^ 2030520653566514909L);
                                                    (Integer.rotateRight(-107108998 ^ var1_2, 18) + 1047832833) * -107108997;
                                                    var2_3 = 1868722241 + var1_2;
                                                    (Integer.rotateRight(-1001047938 ^ var1_2, 11) - -894470531) * -1001047937;
                                                    var2_3 = (int)((long)(1341670547 + var1_2) ^ 2042966326911407510L ^ 2042966326911407510L);
                                                    --var3_1;
                                                    continue;
                                                }
                                                Integer.rotateRight(-813289662 ^ var1_2, 12) + 631068729;
                                                var2_3 = Integer.reverse(Integer.reverse(281967305 + var1_2));
                                                Integer.rotateLeft(-1201199355 ^ var1_2, 10) - 1490770134;
                                                (int)(8851131516946017103L ^ (long)var1_2 ^ -1224834950185265030L);
                                                var2_3 = (int)((long)(1341670547 + var1_2) ^ 6276799378347750174L ^ 6276799378347750174L);
                                                (Integer.rotateRight(-1962367682 ^ var1_2, 4) - -630611523) * -1962367681;
                                                continue;
                                            }
                                            Integer.rotateLeft(1161111853 ^ var1_2, 11) - 1707973550;
                                            (int)(-8680821253275849905L ^ (long)var1_2 ^ -914086575896747298L);
                                            var2_3 = 1341670547 + var1_2 ^ 1821425889 ^ 1821425889;
                                            (Integer.rotateLeft(-740498320 ^ var1_2, 13) + -1407366965) * -740498319;
                                            var3_1 -= 5;
                                            continue;
                                        }
                                        Integer.rotateRight(462761282 ^ var1_2, 6) + 1533942329;
                                        try {
                                            var3_1 += 3;
                                            if ((-514320813643779423L ^ (long)var1_2 | 1L) == 0L) {
                                                throw new NoSuchElementException();
                                            }
                                            var2_3 = Integer.reverse(Integer.reverse(1341670547 + var1_2));
                                        }
                                        catch (NoSuchElementException v3) {
                                            var2_3 = (int)((long)(1341670547 + var1_2) ^ -3190590891990840595L ^ -3190590891990840595L);
                                        }
                                        var3_1 -= 3;
                                        continue;
                                    }
                                    Integer.rotateRight(-1544125526 ^ var1_2, 7) + -550006575;
                                    var2_3 = Integer.reverse(Integer.reverse(1572092573 + var1_2));
                                    Integer.rotateRight(416400267 ^ var1_2, 6) + 96750864;
                                    try {
                                        if ((1808407116755194325L ^ (long)var1_2 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        var2_3 = (int)((long)(1341670547 + var1_2) ^ 5708282524579876822L ^ 5708282524579876822L);
                                    }
                                    catch (UnsupportedOperationException v4) {
                                        var2_3 = (int)((long)(1341670547 + var1_2) ^ 5530106147592038006L ^ 5530106147592038006L);
                                    }
                                    --var3_1;
                                    continue;
                                }
                                (Integer.rotateLeft(530270545 ^ var1_2, 6) + -668237814) * 530270545;
                                (int)(-2510220865571591345L ^ (long)var1_2 ^ 3722369240481142658L);
                                try {
                                    var3_1 -= 2;
                                    var2_3 = 1341670547 + var1_2 ^ -64801566 ^ -64801566;
                                }
                                catch (IllegalStateException v5) {
                                    var2_3 = (int)((long)(1341670547 + var1_2) ^ -3717638396042742965L ^ -3717638396042742965L);
                                }
                                continue;
                            }
                            Integer.rotateRight(-156173809 ^ var1_2, 17) - -473176308;
                            var2_3 = (int)((long)(-898320706 + var1_2) ^ -335619964102003002L ^ -335619964102003002L);
                            (Integer.rotateRight(-1656968769 ^ var1_2, 6) - 246820188) * -1656968769;
                            var2_3 = 1341670547 + var1_2 + -1605168539 - -1605168539;
                            Integer.rotateLeft(-758271676 ^ var1_2, 13) - -1958341001;
                            continue;
                        }
                        (Integer.rotateLeft(-669389484 ^ var1_2, 14) - 797006951) * -669389483;
                        try {
                            var3_1 += 4;
                            var2_3 = 1341670547 + var1_2 + -1937684790 - -1937684790;
                        }
                        catch (IllegalArgumentException v6) {
                            var2_3 = 1341670547 + var1_2 + -481619594 - -481619594;
                        }
                        var3_1 += 4;
                        continue;
                    }
                    Integer.rotateRight(2082229454 ^ var1_2, 18) - 197848109;
                    var2_3 = -309874914 + var1_2;
                    Integer.rotateLeft(1297379457 ^ var1_2, 12) + 1637301978;
                    (int)(-8077523981938922673L ^ (long)var1_2 ^ 4614081966700540444L);
                    var2_3 = 1341670547 + var1_2 ^ -46042071 ^ -46042071;
                    var3_1 -= 4;
                    continue;
                }
                (Integer.rotateLeft(1460896537 ^ var1_2, 13) + -1883603134) * 1460896537;
                (int)(-7664795457497535665L ^ (long)var1_2 ^ -6397219122220333421L);
                try {
                    var3_1 -= 2;
                    var2_3 = 1341670547 + var1_2;
                }
                catch (ArithmeticException v7) {
                    var2_3 = (int)((long)(1341670547 + var1_2) ^ 6543117734128363355L ^ 6543117734128363355L);
                }
                var3_1 += 4;
                continue;
            }
            Integer.rotateRight(197396642 ^ var1_2, 4) + 1897573081;
            var2_3 = -2042078192 + var1_2;
            Integer.rotateLeft(2091901925 ^ var1_2, 18) - 497694710;
            (int)(-4747552841402094769L ^ (long)var1_2 ^ 7404061935856570859L);
            try {
                var3_1 += 3;
                if ((-8702220394098976497L ^ (long)var1_2 | 1L) == 0L) {
                    throw new IllegalStateException();
                }
                var2_3 = 1341670547 + var1_2 ^ -145204328 ^ -145204328;
            }
            catch (IllegalStateException v8) {
                var2_3 = 1341670547 + var1_2 + -303663711 - -303663711;
            }
            var3_1 -= 2;
            continue;
lbl343:
            // 13 sources

            (Integer.rotateRight(-463655393 ^ var1_2, 15) - -1415170820) * -463655393;
            var2_3 = 1341670547 + var1_2 + -879519506 - -879519506;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ayd_2() {
        class_1268 class_12682;
        int n = -1416441730;
        int n2 = (n = Integer.rotateLeft(n * 401562331, 14) ^ 0xFCBD8C9D) ^ 0x387182B5;
        if ((n2 ^ n) != 946963125) {
            int cfr_ignored_0 = (0x93E352CB ^ n) + -2119269855;
        }
        class_1268 class_12683 = class_12682 = this.dhft == -1386817025 - -1386817070 ? class_1268.field_5810 : class_1268.field_5808;
        if (!this.ht(class_12682)) {
            mb.adgh(this);
            return;
        }
        lb lb2 = mb.dhzb_2().getRotationHandler().wk();
        float f = mb.shwd(lb2);
        float f2 = lb2.khdhd_2();
        boolean bl = km.zhm_2;
        km.zhm_2 = true;
        try {
            ((ClientPlayerInteractionManagerAccessor)mb.mc.field_1761).invokeSendSequencedPacket(mb.mc.field_1687, arg_0 -> mb.dhbth(class_12682, f, f2, arg_0));
            mb.mc.field_1724.method_6104(class_12682);
        }
        finally {
            km.zhm_2 = bl;
        }
        if (this.dhft != (Integer.reverse(722239310) ^ 0x72FE30F9) && this.dhft != this.bzs_2) {
            this.jhd = hz_4.thaa_3;
        } else if (this.bzf) {
            this.jhd = hz_4.dyt_2;
        } else {
            this.dhhz_4();
        }
    }

    private boolean ht(class_1268 class_12682) {
        int n = kh.thzdh_2(933674120);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
        class_1268 class_12683 = class_12682;
        n = Integer.rotateRight((class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n, 26);
        int n2 = n ^ 0xCF7F1518;
        if ((n2 ^ n) != -813755112) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF8D9A990 ^ n, 18) + 649668523) * -119953007;
        }
        if (class_12682 == class_1268.field_5810) {
            int n3 = mb.hfkh(mb.mc.field_1724.method_6079(), class_1802.field_8634);
            if (mb.dhjf() == 0) {
                n3 = n3 ^ 0xDA4;
            }
            return n3 != 0;
        }
        return this.dhft >= 0 && this.dhft < (Integer.reverse(72305112) ^ 0x1B92F229) && mb.mc.field_1724.method_31548().method_5438(this.dhft).method_31574(class_1802.field_8634);
    }

    /*
     * Unable to fully structure code
     */
    private int jrt() {
        var1_1 = 0;
        var2_2 = 0;
        var5_3 = 0;
        var3_4 = 436468369;
        var3_4 = Integer.rotateLeft(var3_4 * -1358068409, 16) ^ 689211450;
        var3_4 = Integer.rotateRight(System.identityHashCode(this) ^ var3_4, 11);
        var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4;
        block37: while (true) {
            if ((var5_3 = ((var4_5 ^ var3_4) - -329631822) * -1055002221) == -692040132) ** GOTO lbl-1000
            if (var5_3 == 1045464136) ** GOTO lbl184
            (Integer.rotateRight(-249876841 ^ var3_4, 17) - 916996996) * -249876841;
            if (var5_3 == 1222478470) ** GOTO lbl250
            if (var5_3 == 1045537101) ** GOTO lbl258
            if (var5_3 != 943366832) {
                switch (var5_3) {
                    case -1006344849: {
                        (Integer.rotateRight(-1755501581 ^ var3_4, 5) + 1487270312) * -1755501581;
                        if (mb.mc.field_1724.method_6079().method_31574(class_1802.field_8634)) {
                            var4_5 = (int)((long)(-653380988 * -192162661 + -329631822 ^ var3_4) ^ -207101774206520304L ^ -207101774206520304L);
                            (Integer.rotateRight(-300779141 ^ var3_4, 16) + -660974304) * -300779141;
                            var4_5 = Integer.reverse(Integer.reverse(-98613402 * -192162661 + -329631822 ^ var3_4));
                            continue block37;
                        }
                        (int)(8171662707134151656L ^ (long)var3_4 ^ -2688813214724567266L);
                        var4_5 = -819742662 * -192162661 + -329631822 ^ var3_4;
                        (int)(-9211332713336420616L ^ (long)var3_4 ^ 8509041290155306372L);
                        var4_5 = Integer.reverse(Integer.reverse(1337171371 * -192162661 + -329631822 ^ var3_4));
                        var5_3 -= 4;
                        continue block37;
                    }
                    case -515459939: {
                        Integer.rotateLeft(-115843419 ^ var3_4, 18) - 777065782;
                        (int)(4299513330572520271L ^ (long)var3_4 ^ 2035771180031007364L);
                        if (var1_1 < (Integer.reverse(1688817992) ^ 311072002)) {
                            (int)(-652151154665434798L ^ (long)var3_4 ^ -3277212950476996553L);
                            var4_5 = -397800142 * -192162661 + -329631822 ^ var3_4 ^ -1612519313 ^ -1612519313;
                            (int)(-4096526395895206933L ^ (long)var3_4 ^ -8028735075368557667L);
                            var4_5 = (int)((long)(1272414225 * -192162661 + -329631822 ^ var3_4) ^ -8950921054882517871L ^ -8950921054882517871L);
                            var5_3 -= 3;
                            continue block37;
                        }
                        var4_5 = (-1794311678 * -192162661 + -329631822 ^ var3_4) + 1337497855 - 1337497855;
                        (Integer.rotateLeft(1027982424 ^ var3_4, 10) + 1875928547) * 1027982425;
                        var4_5 = (int)((long)(943366832 * -192162661 + -329631822 ^ var3_4) ^ -6024714477985858640L ^ -6024714477985858640L);
                        var5_3 += 2;
                        continue block37;
                    }
                }
            }
            ** GOTO lbl113
lbl-1000:
            // 1 sources

            {
                Integer.rotateRight(319221894 ^ var3_4, 5) - 1379188597;
                var2_2 = var1_1;
                try {
                    var5_3 += 5;
                    if ((-8853406516366872219L ^ (long)var3_4 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var4_5 = 24216089 * -192162661 + -329631822 ^ var3_4 ^ -1879536996 ^ -1879536996;
                }
                catch (IllegalStateException v0) {
                    var4_5 = (int)((long)(24216089 * -192162661 + -329631822 ^ var3_4) ^ -6497476846114871126L ^ -6497476846114871126L);
                }
                var5_3 += 5;
                continue block37;
                case -1833136926: {
                    (Integer.rotateRight(-85761570 ^ var3_4, 18) - 1709603101) * -85761569;
                    ++var1_1;
                    try {
                        var5_3 -= 3;
                        var4_5 = -515459939 * -192162661 + -329631822 ^ var3_4 ^ -1991632579 ^ -1991632579;
                    }
                    catch (IllegalArgumentException v1) {
                        var4_5 = (int)((long)(-515459939 * -192162661 + -329631822 ^ var3_4) ^ -2718315513959244298L ^ -2718315513959244298L);
                    }
                    var5_3 += 5;
                    continue block37;
                }
                case 1272414225: {
                    Integer.rotateRight(1681776295 ^ var3_4, 15) - 668702068;
                    if (!mb.rzj_2(mb.tthn_2(mb.mc.field_1724), var1_1).method_31574(class_1802.field_8634)) {
                        try {
                            var5_3 += 4;
                            if ((5475265384753981381L ^ (long)var3_4 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var4_5 = -1833136926 * -192162661 + -329631822 ^ var3_4;
                        }
                        catch (UnsupportedOperationException v2) {
                            var4_5 = (-1833136926 * -192162661 + -329631822 ^ var3_4) + 372067127 - 372067127;
                        }
                        var5_3 += 5;
                        continue block37;
                    }
                    (int)(6880181783938195819L ^ (long)var3_4 ^ 6679585692931134247L);
                    var4_5 = (int)((long)(-1826512134 * -192162661 + -329631822 ^ var3_4) ^ -6998135192628375464L ^ -6998135192628375464L);
                    (int)(-4579993913912346693L ^ (long)var3_4 ^ -3248534417767912144L);
                    var4_5 = -692040132 * -192162661 + -329631822 ^ var3_4;
                    var5_3 -= 3;
                    continue block37;
                }
                case -652727690: {
                    (Integer.rotateRight(-54859406 ^ var3_4, 18) + -1627397111) * -54859405;
                    var2_2 = -1;
                    (int)(-9075293314776679146L ^ (long)var3_4 ^ -3111824376403940915L);
                    var4_5 = (int)((long)(1259323349 * -192162661 + -329631822 ^ var3_4) ^ 939875134732883681L ^ 939875134732883681L);
                    (int)(7015771448110459998L ^ (long)var3_4 ^ -1109232046555041941L);
                    var4_5 = 24216089 * -192162661 + -329631822 ^ var3_4;
                    continue block37;
                }
lbl113:
                // 1 sources

                Integer.rotateRight(1310879458 ^ var3_4, 12) + 2055802009;
                var2_2 = -1;
                var4_5 = (int)((long)(1387891029 * -192162661 + -329631822 ^ var3_4) ^ 8593067444588605134L ^ 8593067444588605134L);
                Integer.rotateRight(-1834115002 ^ var3_4, 5) - -949745739;
                var4_5 = (24216089 * -192162661 + -329631822 ^ var3_4) + 1515738354 - 1515738354;
                continue block37;
                case -98613402: {
                    Integer.rotateRight(60379915 ^ var3_4, 3) + 1945021840;
                    var2_2 = mb.byz(531503144 ^ 532191272, 17);
                    (int)(-8839466697334221071L ^ (long)var3_4 ^ 3660958435119507318L);
                    var4_5 = (24216089 * -192162661 + -329631822 ^ var3_4) + -1939710569 - -1939710569;
                    var5_3 -= 3;
                    continue block37;
                }
                case 1337171371: {
                    (Integer.rotateLeft(853489172 ^ var3_4, 9) - 761605031) * 853489173;
                    var1_1 = 0;
                    var4_5 = (-515459939 * -192162661 + -329631822 ^ var3_4) + 227719907 - 227719907;
                    (Integer.rotateLeft(2099911249 ^ var3_4, 18) + 745983754) * 2099911249;
                    (int)(-4640761039387563185L ^ (long)var3_4 ^ -7662730617511423264L);
                    var5_3 += 3;
                    continue block37;
                }
                case -1766752614: {
                    Integer.rotateRight(-1520766037 ^ var3_4, 7) + 174137584;
                    var4_5 = (-398289078 * -192162661 + -329631822 ^ var3_4) + 6012116 - 6012116;
                    Integer.rotateLeft(-188749203 ^ var3_4, 17) - -1483013522;
                    (int)(3894844363801684815L ^ (long)var3_4 ^ 8489429446052921803L);
                    var4_5 = (int)((long)(-1006344849 * -192162661 + -329631822 ^ var3_4) ^ 12958454060623022L ^ 12958454060623022L);
                    Integer.rotateLeft(-410299927 ^ var3_4, 15) + 238848626;
                    (int)(2682456339742255951L ^ (long)var3_4 ^ 205057931504904098L);
                    var5_3 += 5;
                    continue block37;
                }
                case 524817748: {
                    Integer.rotateRight(-1455191165 ^ var3_4, 8) + -2088008680;
                    try {
                        var4_5 = Integer.reverse(Integer.reverse(-1006344849 * -192162661 + -329631822 ^ var3_4));
                    }
                    catch (IllegalStateException v3) {
                        var4_5 = Integer.reverse(Integer.reverse(-1006344849 * -192162661 + -329631822 ^ var3_4));
                    }
                    --var5_3;
                    continue block37;
                }
                case -629797171: {
                    Integer.rotateRight(1611423715 ^ var3_4, 15) + -1512227912;
                    var4_5 = Integer.reverse(Integer.reverse(-1088576506 * -192162661 + -329631822 ^ var3_4));
                    (Integer.rotateLeft(2129190257 ^ var3_4, 18) + 1653633002) * 2129190257;
                    (int)(-4874456875752166577L ^ (long)var3_4 ^ 2011001382080402789L);
                    try {
                        var5_3 += 4;
                        if ((-296955560808591753L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(-1006344849 * -192162661 + -329631822 ^ var3_4));
                    }
                    catch (UnsupportedOperationException v4) {
                        var4_5 = (-1006344849 * -192162661 + -329631822 ^ var3_4) + -480038430 - -480038430;
                    }
                    var5_3 -= 3;
                    continue block37;
                }
lbl184:
                // 1 sources

                (Integer.rotateRight(2013139583 ^ var3_4, 17) - -1943937892) * 2013139583;
                var4_5 = (int)((long)(31514222 * -192162661 + -329631822 ^ var3_4) ^ -4337616245188141003L ^ -4337616245188141003L);
                Integer.rotateLeft(2061742085 ^ var3_4, 18) - -437260330;
                (int)(-5165314071081981105L ^ (long)var3_4 ^ -4539484275929981581L);
                (int)(7296528192514723464L ^ (long)var3_4 ^ 1011001349329348437L);
                var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4;
                var5_3 += 3;
                continue block37;
                case 593876498: {
                    (Integer.rotateRight(969166170 ^ var3_4, 10) + 52624673) * 969166171;
                    var4_5 = (int)((long)(-1060960442 * -192162661 + -329631822 ^ var3_4) ^ -1268904903497715827L ^ -1268904903497715827L);
                    Integer.rotateRight(-2114708541 ^ var3_4, 3) + -1058210856;
                    var4_5 = -1124121086 * -192162661 + -329631822 ^ var3_4 ^ 1444108040 ^ 1444108040;
                    Integer.rotateLeft(1324065353 ^ var3_4, 12) + -1830402542;
                    (int)(-8333615942448387249L ^ (long)var3_4 ^ -1902626694104566429L);
                    var4_5 = (-1006344849 * -192162661 + -329631822 ^ var3_4) + -1312660065 - -1312660065;
                    continue block37;
                }
                case -865243449: {
                    Integer.rotateLeft(1337229445 ^ var3_4, 12) - -1422315690;
                    (int)(-8284883096024323249L ^ (long)var3_4 ^ -6917384879181613091L);
                    var4_5 = (-1555447390 * -192162661 + -329631822 ^ var3_4) + -582068863 - -582068863;
                    (Integer.rotateLeft(-1409641827 ^ var3_4, 8) - -675979202) * -1409641827;
                    (int)(7586380230866299727L ^ (long)var3_4 ^ -8921486713361432767L);
                    try {
                        var4_5 = (-1006344849 * -192162661 + -329631822 ^ var3_4) + -738164067 - -738164067;
                    }
                    catch (UnsupportedOperationException v5) {
                        var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4 ^ -2095787205 ^ -2095787205;
                    }
                    continue block37;
                }
                case 343535704: {
                    Integer.rotateLeft(1084369736 ^ var3_4, 11) + -671032077;
                    try {
                        var5_3 += 4;
                        if ((-3053342997359642677L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(-1006344849 * -192162661 + -329631822 ^ var3_4));
                    }
                    catch (UnsupportedOperationException v6) {
                        var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4 ^ -98310365 ^ -98310365;
                    }
                    var5_3 += 5;
                    continue block37;
                }
                case -1861472193: {
                    (Integer.rotateRight(-1053526310 ^ var3_4, 11) + 1773667233) * -1053526309;
                    try {
                        if ((1994051956085503597L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = (int)((long)(-1006344849 * -192162661 + -329631822 ^ var3_4) ^ 1104993403475709521L ^ 1104993403475709521L);
                    }
                    catch (IllegalArgumentException v7) {
                        var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4 ^ -401291204 ^ -401291204;
                    }
                    var5_3 -= 4;
                    continue block37;
                }
lbl250:
                // 1 sources

                (Integer.rotateRight(1510262099 ^ var3_4, 14) + -353270712) * 1510262099;
                var4_5 = (int)((long)(-1218014638 * -192162661 + -329631822 ^ var3_4) ^ 5840195436029192291L ^ 5840195436029192291L);
                Integer.rotateLeft(-361125208 ^ var3_4, 16) + 1763264915;
                var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4;
                --var5_3;
                continue block37;
lbl258:
                // 1 sources

                (Integer.rotateRight(1914573982 ^ var3_4, 17) - -704504227) * 1914573983;
                (int)(-1079803428081805632L ^ (long)var3_4 ^ 8390610096163803094L);
                var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4;
                var5_3 -= 2;
                continue block37;
                case -436546869: {
                    Integer.rotateRight(657762027 ^ var3_4, 7) + -1010969168;
                    var4_5 = Integer.reverse(Integer.reverse(415564685 * -192162661 + -329631822 ^ var3_4));
                    Integer.rotateLeft(1803504237 ^ var3_4, 16) - 147300974;
                    (int)(-6211057278157264049L ^ (long)var3_4 ^ 3877743427625483850L);
                    var4_5 = (-1006344849 * -192162661 + -329631822 ^ var3_4) + 1999162081 - 1999162081;
                    var5_3 -= 2;
                    continue block37;
                }
                case -668846166: {
                    Integer.rotateLeft(719681220 ^ var3_4, 8) - 908525815;
                    try {
                        var5_3 -= 4;
                        var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4;
                    }
                    catch (ArithmeticException v8) {
                        var4_5 = Integer.reverse(Integer.reverse(-1006344849 * -192162661 + -329631822 ^ var3_4));
                    }
                    continue block37;
                }
                case 24216089: {
                    return var2_2;
                }
            }
            (Integer.rotateLeft(-2051326664 ^ var3_4, 3) + 906627331) * -2051326663;
            var4_5 = -1006344849 * -192162661 + -329631822 ^ var3_4 ^ -1057543950 ^ -1057543950;
        }
    }

    private int zdkh_3() {
        int n;
        try {
            int n2 = 1694406706;
            n2 = Integer.rotateLeft(n2 * -311952737, 26) ^ 0x9A92387D;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 14);
            int n3 = n2 ^ 0x8A4637E1;
            if ((n3 ^ n2) != -1975109663) {
                int cfr_ignored_0 = (0xEEB8AFD3 ^ n2) - 1607304625;
            }
            if ((0x3CF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        for (n = 0; n < -1619011068 + 1619011077; ++n) {
            if (!mb.zkh_3(mb.dhfz(mb.mc.field_1724), n).method_7960()) continue;
            return n;
        }
        for (n = 0; n < 102078265 + -102078256; ++n) {
            if (n == this.bzs_2) continue;
            return n;
        }
        return this.bzs_2;
    }

    private void dhz_6() {
        try {
            int n = -1909681516;
            n = Integer.rotateLeft(n * 26462231, 8) ^ 0xFFC17884;
            int n2 = n ^ 0x501CF97B;
            if ((n2 ^ n) != 1344076155) {
                int cfr_ignored_0 = (0xDE306BEF ^ n) + -519832830;
            }
            if ((0x3B6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.bzs_2 < 0 || this.bzs_2 > Integer.rotateLeft(0x8855913D ^ 0x855913D, 4) || mb.mc.field_1724 == null) {
            return;
        }
        if (this.jhh_3.shzl()) {
            mb.skhh_3(this.bzs_2);
        } else {
            mb.rmsh(this.bzs_2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void thss_4() {
        var3_1 = 0;
        var1_2 = -499578824;
        var1_2 = Integer.rotateLeft(var1_2 * -119852701, 10) ^ -996809771;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) + 131339244 - 131339244;
        while (true) {
            block71: {
                block59: {
                    block70: {
                        block83: {
                            block67: {
                                block64: {
                                    block78: {
                                        block63: {
                                            block79: {
                                                block72: {
                                                    block77: {
                                                        block80: {
                                                            block82: {
                                                                block81: {
                                                                    block74: {
                                                                        block69: {
                                                                            block66: {
                                                                                block61: {
                                                                                    block68: {
                                                                                        block60: {
                                                                                            block76: {
                                                                                                block65: {
                                                                                                    block75: {
                                                                                                        block73: {
                                                                                                            block62: {
                                                                                                                var3_1 = Integer.reverse(var2_3) ^ var1_2 ^ 783150772;
                                                                                                                switch (var3_1 & 15) {
                                                                                                                    case 5: {
                                                                                                                        if (var3_1 == -1467250795) break block59;
                                                                                                                        if (var3_1 == -332647659) break block60;
                                                                                                                        (Integer.rotateLeft(218074705 ^ var1_2, 4) + -1756374262) * 218074705;
                                                                                                                        (int)(-3581170479792854193L ^ (long)var1_2 ^ -4780426855994347189L);
                                                                                                                        if (var3_1 != -20397259) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block61;
                                                                                                                    }
                                                                                                                    case 13: {
                                                                                                                        if (var3_1 != 1975336605) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block62;
                                                                                                                    }
                                                                                                                    case 4: {
                                                                                                                        if (var3_1 == 1615029620) break block63;
                                                                                                                        if (var3_1 != 899774212) {
                                                                                                                            (Integer.rotateRight(-2144453602 ^ var1_2, 3) - -1980307747) * -2144453601;
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block64;
                                                                                                                    }
                                                                                                                    case 14: {
                                                                                                                        if (var3_1 == -1010029506) break block65;
                                                                                                                        if (var3_1 == 310731790) break block66;
                                                                                                                        if (var3_1 != 841105566) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block67;
                                                                                                                    }
                                                                                                                    case 1: {
                                                                                                                        if (var3_1 == -2089779279) break block68;
                                                                                                                        if (var3_1 == 435726897) break block69;
                                                                                                                        Integer.rotateLeft(589611300 ^ var1_2, 7) - 1171325591;
                                                                                                                        if (var3_1 != 2002172017) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block70;
                                                                                                                    }
                                                                                                                    case 2: {
                                                                                                                        if (var3_1 != -1310501598) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block71;
                                                                                                                    }
                                                                                                                    case 8: {
                                                                                                                        if (var3_1 == -1703532568) break block72;
                                                                                                                        if (var3_1 != -647477832) {
                                                                                                                            (Integer.rotateLeft(344777049 ^ var1_2, 5) + -2123568894) * 344777049;
                                                                                                                            (int)(-3008880209453323441L ^ (long)var1_2 ^ 7185637353929048493L);
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block73;
                                                                                                                    }
                                                                                                                    case 7: {
                                                                                                                        if (var3_1 == 291772359) break block74;
                                                                                                                        if (var3_1 == -1671740889) break block75;
                                                                                                                        if (var3_1 != -808455785) {
                                                                                                                            if (var3_1 == -1287352153) break;
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block76;
                                                                                                                    }
                                                                                                                    case 3: {
                                                                                                                        if (var3_1 == 522270723) break block77;
                                                                                                                        if (var3_1 != -1780194269) {
                                                                                                                            Integer.rotateLeft(873119145 ^ var1_2, 9) + 1370134194;
                                                                                                                            (int)(-668763017620165809L ^ (long)var1_2 ^ -2713274627031285599L);
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block78;
                                                                                                                    }
                                                                                                                    case 6: {
                                                                                                                        if (var3_1 == -156388554) break block79;
                                                                                                                        if (var3_1 != 1295118486) {
                                                                                                                            Integer.rotateLeft(188333353 ^ var1_2, 4) + 1616611122;
                                                                                                                            (int)(-3924021673034716337L ^ (long)var1_2 ^ -2641217032993358137L);
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block80;
                                                                                                                    }
                                                                                                                    case 15: {
                                                                                                                        if (var3_1 != -2116311473) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block81;
                                                                                                                    }
                                                                                                                    case 10: {
                                                                                                                        if (var3_1 == -967982438) break block82;
                                                                                                                        if (var3_1 != -1786994198) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block83;
                                                                                                                    }
                                                                                                                }
                                                                                                                Integer.rotateRight(455721903 ^ var1_2, 6) - 1315721580;
                                                                                                                mb.hzsh_2(this);
                                                                                                                return;
                                                                                                            }
                                                                                                            Integer.rotateLeft(-556424443 ^ var1_2, 14) - 3955926;
                                                                                                            (int)(2046619090500774735L ^ (long)var1_2 ^ -1801295702488672993L);
                                                                                                            if (this.ks_2 < (-1396345570 ^ -1396345542)) {
                                                                                                                try {
                                                                                                                    ++var3_1;
                                                                                                                    var2_3 = Integer.reverse(var1_2 ^ -332647659 ^ 783150772);
                                                                                                                }
                                                                                                                catch (NoSuchElementException v0) {
                                                                                                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -332647659 ^ 783150772) ^ -481409309769754355L ^ -481409309769754355L);
                                                                                                                }
                                                                                                                continue;
                                                                                                            }
                                                                                                            var2_3 = Integer.reverse(var1_2 ^ -1287352153 ^ 783150772) ^ -1963782135 ^ -1963782135;
                                                                                                            var3_1 -= 5;
                                                                                                            continue;
                                                                                                        }
                                                                                                        Integer.rotateRight(-920967062 ^ var1_2, 12) + 1588036625;
                                                                                                        if (this.jhd == hz_4.jdb_2) {
                                                                                                            var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -808455785 ^ 783150772)));
                                                                                                            (Integer.rotateRight(739943282 ^ var1_2, 8) + 1536649737) * 739943283;
                                                                                                            var3_1 -= 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        try {
                                                                                                            var3_1 += 2;
                                                                                                            var2_3 = Integer.reverse(var1_2 ^ 291772359 ^ 783150772) ^ -2074656908 ^ -2074656908;
                                                                                                        }
                                                                                                        catch (NoSuchElementException v1) {
                                                                                                            var2_3 = Integer.reverse(var1_2 ^ 291772359 ^ 783150772) ^ 1771498990 ^ 1771498990;
                                                                                                        }
                                                                                                        var3_1 -= 5;
                                                                                                        continue;
                                                                                                    }
                                                                                                    (Integer.rotateRight(-2001417985 ^ var1_2, 4) - -1841170916) * -2001417985;
                                                                                                    if (this.dhft >= -724605093 - -724605102) {
                                                                                                        try {
                                                                                                            if ((3841288924029962769L ^ (long)var1_2 | 1L) == 0L) {
                                                                                                                throw new UnsupportedOperationException();
                                                                                                            }
                                                                                                            var2_3 = Integer.reverse(var1_2 ^ -1287352153 ^ 783150772);
                                                                                                        }
                                                                                                        catch (UnsupportedOperationException v2) {
                                                                                                            var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1287352153 ^ 783150772) ^ -5163119127724783525L ^ -5163119127724783525L);
                                                                                                        }
                                                                                                        var3_1 += 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        var3_1 += 5;
                                                                                                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1010029506 ^ 783150772) ^ -6890936668438755745L ^ -6890936668438755745L);
                                                                                                    }
                                                                                                    catch (UnsupportedOperationException v3) {
                                                                                                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1010029506 ^ 783150772) ^ 7500438039317260815L ^ 7500438039317260815L);
                                                                                                    }
                                                                                                    var3_1 -= 4;
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateLeft(-665951928 ^ var1_2, 14) + 903571187;
                                                                                                yn.thmsh(this.ks_2, this.dhft);
                                                                                                var2_3 = Integer.reverse(var1_2 ^ -1287352153 ^ 783150772);
                                                                                                Integer.rotateRight(-364303349 ^ var1_2, 16) + 1664742544;
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateLeft(-1942849772 ^ var1_2, 4) - -25556313) * -1942849771;
                                                                                            this.dhhz_4();
                                                                                            return;
                                                                                        }
                                                                                        Integer.rotateLeft(-1641773884 ^ var1_2, 6) - 717861623;
                                                                                        if (this.dhft >= 0) {
                                                                                            var2_3 = Integer.reverse(var1_2 ^ -1671740889 ^ 783150772) + 622382211 - 622382211;
                                                                                            continue;
                                                                                        }
                                                                                        var2_3 = Integer.reverse(var1_2 ^ -1452843052 ^ 783150772) ^ -1104475145 ^ -1104475145;
                                                                                        Integer.rotateLeft(-222438971 ^ var1_2, 17) - 1767570966;
                                                                                        (int)(3463118546175060815L ^ (long)var1_2 ^ 1333209638161206735L);
                                                                                        var2_3 = Integer.reverse(var1_2 ^ -1287352153 ^ 783150772);
                                                                                        ++var3_1;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateLeft(-881804332 ^ var1_2, 12) - -1492886041) * -881804331;
                                                                                    this.dhz_6();
                                                                                    if (this.bzf) {
                                                                                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ -285404374 ^ 783150772) ^ -2806636869479671712L ^ -2806636869479671712L);
                                                                                        (Integer.rotateRight(-799967469 ^ var1_2, 13) + 1044056712) * -799967469;
                                                                                        var2_3 = Integer.reverse(var1_2 ^ 435726897 ^ 783150772);
                                                                                        continue;
                                                                                    }
                                                                                    var2_3 = Integer.reverse(var1_2 ^ -1287352153 ^ 783150772) + -311488780 - -311488780;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(7413459 ^ var1_2, 3) + 303061704) * 7413459;
                                                                                if (mb.mc.field_1761 == null) {
                                                                                    (int)(2615772719592605446L ^ (long)var1_2 ^ -3194419649279433397L);
                                                                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1287352153 ^ 783150772) ^ 4533648238020955434L ^ 4533648238020955434L);
                                                                                    var3_1 -= 5;
                                                                                    continue;
                                                                                }
                                                                                var2_3 = Integer.reverse(var1_2 ^ -2089779279 ^ 783150772) + 1526953397 - 1526953397;
                                                                                --var3_1;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(150536776 ^ var1_2, 4) + 444917235;
                                                                            if (this.ks_2 >= (-656482757 ^ -656482766)) {
                                                                                var2_3 = Integer.reverse(var1_2 ^ 1975336605 ^ 783150772) ^ 571503098 ^ 571503098;
                                                                                (Integer.rotateRight(-90602637 ^ var1_2, 18) + 1559530024) * -90602637;
                                                                                var3_1 += 3;
                                                                                continue;
                                                                            }
                                                                            var2_3 = Integer.reverse(var1_2 ^ -1287352153 ^ 783150772) ^ -83075425 ^ -83075425;
                                                                            var3_1 -= 5;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateRight(0x40744777 ^ var1_2, 11) - -764262748) * 0x40744777;
                                                                        if (this.ks_2 >= (-656482757 ^ -656482766)) {
                                                                            var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 1975336605 ^ 783150772)));
                                                                            (Integer.rotateRight(-1139090374 ^ var1_2, 10) + -878818751) * -1139090373;
                                                                            var3_1 += 5;
                                                                            continue;
                                                                        }
                                                                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -1543838438 ^ 783150772)));
                                                                        (Integer.rotateRight(478558678 ^ var1_2, 6) - 2023661605) * 478558679;
                                                                        var2_3 = Integer.reverse(var1_2 ^ -1287352153 ^ 783150772) ^ -2025599396 ^ -2025599396;
                                                                        var3_1 -= 3;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(432198586 ^ var1_2, 6) + 586498753) * 432198587;
                                                                    if (mb.mc.field_1724 != null) {
                                                                        var2_3 = Integer.reverse(var1_2 ^ -20397259 ^ 783150772) ^ -2135876953 ^ -2135876953;
                                                                        Integer.rotateRight(1219314534 ^ var1_2, 12) - -782710635;
                                                                        continue;
                                                                    }
                                                                    var2_3 = Integer.reverse(var1_2 ^ -643924016 ^ 783150772);
                                                                    (Integer.rotateRight(-1314991397 ^ var1_2, 9) + -2036783168) * -1314991397;
                                                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1287352153 ^ 783150772) ^ 1318070696426070192L ^ 1318070696426070192L);
                                                                    var3_1 -= 2;
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(-400835058 ^ var1_2, 16) - 532259565;
                                                                var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 495964885 ^ 783150772)));
                                                                (Integer.rotateRight(-1015374022 ^ var1_2, 11) + -1338579135) * -1015374021;
                                                                try {
                                                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -647477832 ^ 783150772) ^ -2637049906611069926L ^ -2637049906611069926L);
                                                                }
                                                                catch (NoSuchElementException v4) {
                                                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -647477832 ^ 783150772) ^ 7454108371942786013L ^ 7454108371942786013L);
                                                                }
                                                                var3_1 -= 3;
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(1167885399 ^ var1_2, 11) - 1917953476) * 1167885399;
                                                            try {
                                                                var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -647477832 ^ 783150772)));
                                                            }
                                                            catch (NoSuchElementException v5) {
                                                                var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -647477832 ^ 783150772)));
                                                            }
                                                            var3_1 -= 5;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-1599152968 ^ var1_2, 7) + 2039110019) * -1599152967;
                                                        try {
                                                            var3_1 += 4;
                                                            if ((266858436209956463L ^ (long)var1_2 | 1L) == 0L) {
                                                                throw new UnsupportedOperationException();
                                                            }
                                                            var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -647477832 ^ 783150772)));
                                                        }
                                                        catch (UnsupportedOperationException v6) {
                                                            var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772);
                                                        }
                                                        var3_1 += 2;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(2089605345 ^ var1_2, 18) + 426500730;
                                                    (int)(-4738219070014035121L ^ (long)var1_2 ^ 1209360648408453549L);
                                                    var2_3 = Integer.reverse(var1_2 ^ -1467278992 ^ 783150772) + -2105048288 - -2105048288;
                                                    Integer.rotateLeft(-1119872480 ^ var1_2, 10) + -283064037;
                                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ 719560301 ^ 783150772) ^ -1616505314058390487L ^ -1616505314058390487L);
                                                    Integer.rotateRight(1499643042 ^ var1_2, 14) + -682461479;
                                                    var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) ^ 1082733560 ^ 1082733560;
                                                    continue;
                                                }
                                                Integer.rotateLeft(-1737446232 ^ var1_2, 6) + 2046986131;
                                                (int)(8648509440342980166L ^ (long)var1_2 ^ -6451542594799575590L);
                                                var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) ^ 395529362 ^ 395529362;
                                                continue;
                                            }
                                            Integer.rotateLeft(-213051027 ^ var1_2, 17) - 2058597230;
                                            (int)(3602799781813218127L ^ (long)var1_2 ^ -7795586806518788562L);
                                            var2_3 = Integer.reverse(var1_2 ^ -1223412456 ^ 783150772);
                                            (Integer.rotateLeft(-1537990992 ^ var1_2, 7) + -359836021) * -1537990991;
                                            try {
                                                var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) + 1773744756 - 1773744756;
                                            }
                                            catch (NoSuchElementException v7) {
                                                var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) + 584267827 - 584267827;
                                            }
                                            var3_1 += 2;
                                            continue;
                                        }
                                        Integer.rotateRight(-1343448189 ^ var1_2, 8) + 1376023576;
                                        var2_3 = Integer.reverse(var1_2 ^ 364473208 ^ 783150772);
                                        Integer.rotateLeft(-597536692 ^ var1_2, 14) - -1270523793;
                                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -647477832 ^ 783150772)));
                                        continue;
                                    }
                                    Integer.rotateRight(-1999356766 ^ var1_2, 4) + -1777273127;
                                    var2_3 = Integer.reverse(var1_2 ^ 1707841353 ^ 783150772);
                                    Integer.rotateLeft(-1107439547 ^ var1_2, 10) - 102356886;
                                    (int)(9173690020506430287L ^ (long)var1_2 ^ 108230539516400463L);
                                    var2_3 = Integer.reverse(var1_2 ^ -1333729859 ^ 783150772) + 1592329024 - 1592329024;
                                    Integer.rotateLeft(166949225 ^ var1_2, 4) + 953703154;
                                    (int)(-3800511057985475761L ^ (long)var1_2 ^ 4888801543970110290L);
                                    var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -647477832 ^ 783150772)));
                                    continue;
                                }
                                Integer.rotateLeft(-1115122015 ^ var1_2, 10) + -135799622;
                                (int)(9167702234800384847L ^ (long)var1_2 ^ -8338270561616964699L);
                                (int)(4761389586865069733L ^ (long)var1_2 ^ 5207471923573631478L);
                                var2_3 = Integer.reverse(var1_2 ^ 645834753 ^ 783150772) ^ 1583904291 ^ 1583904291;
                                (int)(-5888150808398025551L ^ (long)var1_2 ^ -3358981975451569853L);
                                var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) ^ -1607160392 ^ -1607160392;
                                var3_1 += 5;
                                continue;
                            }
                            Integer.rotateLeft(-155671507 ^ var1_2, 17) - -457604946;
                            (int)(3749820704243379023L ^ (long)var1_2 ^ -1634662516275952187L);
                            var2_3 = Integer.reverse(var1_2 ^ -335434376 ^ 783150772) + 766984531 - 766984531;
                            (Integer.rotateRight(125373107 ^ var1_2, 3) + -335156504) * 125373107;
                            var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) + 136073083 - 136073083;
                            --var3_1;
                            continue;
                        }
                        Integer.rotateLeft(141159977 ^ var1_2, 4) + 154236466;
                        (int)(-3829396602836686001L ^ (long)var1_2 ^ 9032113201150965863L);
                        var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) ^ -1315956257 ^ -1315956257;
                        --var3_1;
                        continue;
                    }
                    Integer.rotateLeft(71253152 ^ var1_2, 3) + -2012875109;
                    var2_3 = Integer.reverse(var1_2 ^ 1848472174 ^ 783150772);
                    (Integer.rotateRight(-1332181285 ^ var1_2, 9) + 1725297600) * -1332181285;
                    try {
                        var3_1 += 4;
                        if ((-2841177971498267L ^ (long)var1_2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) + -1736962431 - -1736962431;
                    }
                    catch (NoSuchElementException v8) {
                        var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772);
                    }
                    var3_1 -= 3;
                    continue;
                }
                Integer.rotateLeft(-836437663 ^ var1_2, 12) + -86519302;
                (int)(907008428278606671L ^ (long)var1_2 ^ 6037219448949683453L);
                var2_3 = (int)((long)Integer.reverse(var1_2 ^ -647477832 ^ 783150772) ^ 6287591792336062919L ^ 6287591792336062919L);
                ++var3_1;
                continue;
            }
            Integer.rotateLeft(883423884 ^ var1_2, 9) - 1689581103;
            try {
                var3_1 -= 5;
                var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772);
            }
            catch (ArithmeticException v9) {
                var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772) ^ 681312590 ^ 681312590;
            }
            var3_1 += 2;
            continue;
lbl402:
            // 13 sources

            Integer.rotateLeft(-525316979 ^ var1_2, 15) - 968287310;
            (int)(2450770393453357903L ^ (long)var1_2 ^ 4039873014210882004L);
            var2_3 = Integer.reverse(var1_2 ^ -647477832 ^ 783150772);
        }
    }

    private void dhhz_4() {
        int n = -281054066;
        n = Integer.rotateLeft(n * 14061189, 26) ^ 0x8C070522;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x8ADCF7F2;
        if ((n2 ^ n) != -1965230094) {
            int cfr_ignored_0 = (0x65E3837C ^ n) - 501866511;
        }
        this.jhd = hz_4.jdb_2;
        this.bzf = false;
        this.bzs_2 = -1;
        this.dhft = -1;
        this.ks_2 = -1;
    }

    private static class_2596 dhbth(class_1268 class_12682, float f, float f2, int n) {
        int n2 = kh.thzdh_2(1691125235);
        n2 = Integer.rotateRight(Float.floatToIntBits(f) ^ n2, 28);
        int n3 = n2 ^ 0xE95D3FAA;
        if ((n3 ^ n2) != -379764822) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x8D91BA59 ^ n2, 4) + 688074754) * -1919829415;
            int cfr_ignored_1 = (int)(0x4F23146427D4EB4FL ^ (long)n2 ^ 0xD5B8831A2DB93397L);
        }
        return new class_2886(class_12682, n, f, f2);
    }

    private void shdw_2(bjd_2 bjd2) {
        int n = -207673462;
        n = Integer.rotateLeft(n * 1153206437, 14) ^ 0x4F676461;
        bjd_2 bjd3 = bjd2;
        n = (bjd3 != null ? System.identityHashCode(bjd3) : 0) ^ n;
        int n2 = n ^ 0xFF3745E9;
        if ((n2 ^ n) != -13154839) {
            int cfr_ignored_0 = (0xCA86263 ^ n) + -1912279245;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (this.jhd == hz_4.jdb_2) {
            return;
        }
        if (mb.mc.field_1724 == null || mb.mc.field_1687 == null || mb.mc.field_1761 == null) {
            this.thss_4();
            return;
        }
        switch (this.jhd.ordinal()) {
            case 1: {
                yn.thmsh(this.ks_2, this.dhft);
                this.bzf = true;
                this.jhd = hz_4.thmf;
                break;
            }
            case 2: {
                this.rghdh();
                if (this.jhh_3.shzl()) {
                    this.jhd = hz_4.btdh;
                    break;
                }
                this.ayd_2();
                break;
            }
            case 3: {
                this.ayd_2();
                break;
            }
            case 4: {
                this.dhz_6();
                hz_4 hz2_3 = this.jhd = this.bzf ? hz_4.dyt_2 : hz_4.jdb_2;
                if (this.jhd != hz_4.jdb_2) break;
                this.dhhz_4();
                break;
            }
            case 5: {
                yn.thmsh(this.ks_2, this.dhft);
                this.dhhz_4();
                break;
            }
            default: {
                this.dhhz_4();
            }
        }
    }

    private void dkk(btt btt2) {
        boolean bl;
        int n = kh.thzdh_2(-1379012266);
        n = System.identityHashCode(this) ^ n;
        btt btt3 = btt2;
        n = Integer.rotateLeft((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 29);
        int n2 = n ^ 0x73E8B6F3;
        if ((n2 ^ n) != 1944631027) {
            int cfr_ignored_0 = Integer.rotateLeft(0xDE2547A5 ^ n, 14) - -354333642;
            int cfr_ignored_1 = (int)(0x1C97E99827D4EB4FL ^ (long)n ^ 0x2E40831A2DB994FEL);
        }
        if (mb.mc.field_1724 == null || mb.mc.field_1687 == null || mb.mc.field_1761 == null) {
            this.thss_4();
            return;
        }
        boolean bl2 = bl = this.sat_4.sdhkh() != -1 && brz.rzdh(this.sat_4.sdhkh());
        if (bl && !this.tthd_2 && this.jhd == hz_4.jdb_2 && mb.mc.field_1755 == null) {
            this.rdhj();
        }
        this.tthd_2 = bl;
    }

    private static String alt(String string, int n, int n2, int n3) {
        int n4 = 804206976;
        n4 = Integer.rotateLeft(n4 * 2026027893, 26) ^ 0xF388B034;
        int n5 = (n4 = n3 ^ n4) ^ 0x97DD2DE3;
        if ((n5 ^ n4) != -1747112477) {
            int cfr_ignored_0 = (0xB8321463 ^ n4) + 2116912329;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x22EF0C26) + n2 ^ i * -664031525) ^ jbq) + khwr);
        }
        return new String(cArray);
    }

    private static void aqk() {
        int n = 2098359380;
        int n2 = (n = Integer.rotateLeft(n * -968310039, 7) ^ 0x84E9F7CE) ^ 0xE4B71601;
        if ((n2 ^ n) != -457763327) {
            int cfr_ignored_0 = (0x99A57A55 ^ n) - 27687649;
        }
        yf.athz_2();
    }

    private static class_1661 bdl(class_746 class_7462) {
        block0: {
            int n = kh.thzdh_2(-380047526);
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 16);
            int n2 = n ^ 0x60A4B379;
            if ((n2 ^ n) == 1621406585) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x89FC5C23 ^ n, 4) + -1175664776;
        }
        return class_7462.method_31548();
    }

    private static int ddy_3(mb mb2) {
        block0: {
            int n = 433056308;
            n = Integer.rotateLeft(n * 663575851, 18) ^ 0x342C6FDD;
            mb mb3 = mb2;
            n = (mb3 != null ? System.identityHashCode(mb3) : 0) ^ n;
            int n2 = n ^ 0xC8F751EC;
            if ((n2 ^ n) == -923315732) break block0;
            int cfr_ignored_0 = (0xD138BBD8 ^ n) + 1941964958;
        }
        return mb2.zdkh_3();
    }

    private static void rqr(mb mb2) {
        int n = -1744791178;
        n = Integer.rotateLeft(n * 1336365665, 18) ^ 0x4D14D1A2;
        mb mb3 = mb2;
        n = (mb3 != null ? System.identityHashCode(mb3) : 0) ^ n;
        int n2 = n ^ 0xD539B0F5;
        if ((n2 ^ n) != -717639435) {
            int cfr_ignored_0 = (0x4D392983 ^ n) - -698033320;
        }
        mb2.dhhz_4();
    }

    private static void zsh_10(int n) {
        int n2 = kh.thzdh_2(1964356261);
        int n3 = (n2 = n ^ n2) ^ 0x702B56D;
        if ((n3 ^ n2) != 117618029) {
            int cfr_ignored_0 = Integer.rotateLeft(0x721707C8 ^ n2, 17) + -718827405;
        }
        bfn.shkz(n);
    }

    private static void adgh(mb mb2) {
        int n = 1575649107;
        int n2 = (n = Integer.rotateLeft(n * -2115337095, 21) ^ 0x4D612195) ^ 0x71844E1D;
        if ((n2 ^ n) != 1904496157) {
            int cfr_ignored_0 = (0x2C6E314E ^ n) - -1995427544;
        }
        mb2.thss_4();
    }

    private static Moondlc dhzb_2() {
        block0: {
            int n = kh.thzdh_2(-774302861);
            int n2 = n ^ 0x9F460D3;
            if ((n2 ^ n) == 167010515) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD82D73A0 ^ n, 14) + 836673435;
        }
        return Moondlc.getInstance();
    }

    private static float shwd(lb lb2) {
        block0: {
            int n = -1476933339;
            n = Integer.rotateLeft(n * -346885843, 7) ^ 0x2B86EAF1;
            lb lb3 = lb2;
            n = (lb3 != null ? System.identityHashCode(lb3) : 0) ^ n;
            int n2 = n ^ 0x516E1C11;
            if ((n2 ^ n) == 1366170641) break block0;
            int cfr_ignored_0 = (0xF699D534 ^ n) + 1036921335;
        }
        return lb2.sry();
    }

    private static boolean hfkh(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = -245549702;
            n = Integer.rotateLeft(n * -361711367, 22) ^ 0xC4FBD3C1;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateRight((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 22);
            class_1792 class_17923 = class_17922;
            n = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n;
            int n2 = n ^ 0x79B06E58;
            if ((n2 ^ n) == 2041605720) break block0;
            int cfr_ignored_0 = (0x88ED5B22 ^ n) + 1481010062;
        }
        return class_17992.method_31574(class_17922);
    }

    private static int dhjf() {
        block0: {
            int n = 912550628;
            int n2 = (n = Integer.rotateLeft(n * 1898879273, 23) ^ 0x8F937728) ^ 0x2531E721;
            if ((n2 ^ n) == 624027425) break block0;
            int cfr_ignored_0 = (0x13558DC5 ^ n) + -1208047754;
        }
        return yf.tdhth_2();
    }

    private static int byz(int n, int n2) {
        block0: {
            int n3 = 875680457;
            n3 = Integer.rotateLeft(n3 * -25307603, 3) ^ 0x86A3C116;
            n3 = Integer.rotateRight(n ^ n3, 14);
            int n4 = (n3 = n2 ^ n3) ^ 0x3A4394C9;
            if ((n4 ^ n3) == 977507529) break block0;
            int cfr_ignored_0 = (0xE724600 ^ n3) - 1807287632;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static class_1661 tthn_2(class_746 class_7462) {
        block0: {
            int n = -1753223329;
            n = Integer.rotateLeft(n * -2017218063, 8) ^ 0x7C4B6D15;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 5);
            int n2 = n ^ 0xDEFF8B26;
            if ((n2 ^ n) == -553678042) break block0;
            int cfr_ignored_0 = (0x49806479 ^ n) - 73465435;
        }
        return class_7462.method_31548();
    }

    private static class_1799 rzj_2(class_1661 class_16612, int n) {
        block0: {
            int n2 = kh.thzdh_2(-527287921);
            class_1661 class_16613 = class_16612;
            n2 = Integer.rotateLeft((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 27);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 29)) ^ 0x294DB6B4;
            if ((n3 ^ n2) == 692958900) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xC9DF8F3B ^ n2, 12) + 1987049312) * -908095685;
        }
        return class_16612.method_5438(n);
    }

    private static class_1661 dhfz(class_746 class_7462) {
        block0: {
            int n = -1903586058;
            n = Integer.rotateLeft(n * -786117929, 21) ^ 0x26BC4037;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 26);
            int n2 = n ^ 0x8BD6753E;
            if ((n2 ^ n) == -1948879554) break block0;
            int cfr_ignored_0 = (0x55FE1C8 ^ n) - 57666070;
        }
        return class_7462.method_31548();
    }

    private static class_1799 zkh_3(class_1661 class_16612, int n) {
        block0: {
            int n2 = 744932596;
            n2 = Integer.rotateLeft(n2 * -1050092781, 4) ^ 0xE7CA19F3;
            class_1661 class_16613 = class_16612;
            n2 = (class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 24)) ^ 0xA032918B;
            if ((n3 ^ n2) == -1607298677) break block0;
            int cfr_ignored_0 = (0x8C54557F ^ n2) - -10671363;
        }
        return class_16612.method_5438(n);
    }

    private static void skhh_3(int n) {
        int n2 = 1018771997;
        n2 = Integer.rotateLeft(n2 * 1418980957, 25) ^ 0xCD777359;
        int n3 = (n2 = n ^ n2) ^ 0xCBB6D63D;
        if ((n3 ^ n2) != -877210051) {
            int cfr_ignored_0 = (0xF70FEC20 ^ n2) + 1323425375;
        }
        bfn.awy(n);
    }

    private static void rmsh(int n) {
        int n2 = kh.thzdh_2(52563516);
        int n3 = (n2 = Integer.rotateRight(n ^ n2, 27)) ^ 0xFAF7520C;
        if ((n3 ^ n2) != -84454900) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF9D55C30 ^ n2, 18) + 1161021707) * -103457743;
        }
        bfn.shkz(n);
    }

    private static void hzsh_2(mb mb2) {
        int n = 742472527;
        int n2 = (n = Integer.rotateLeft(n * 715697701, 9) ^ 0x447E0B15) ^ 0x3496C735;
        if ((n2 ^ n) != 882296629) {
            int cfr_ignored_0 = (0x18D7FC7A ^ n) + -325017640;
        }
        mb2.dhhz_4();
    }

    private static String[] dny_2(String string) {
        block0: {
            int n = kh.thzdh_2(463500577);
            int n2 = n ^ 0x254DC87B;
            if ((n2 ^ n) == 625854587) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3EEDBD5A ^ n, 10) + -1557689055) * 1055767899;
        }
        return string.split("\u0004\u0010", -1);
    }

    private static CallSite shhy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2056822992;
            n3 = Integer.rotateLeft(n3 * -240390123, 24) ^ 0x1601C268;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 7);
            Class clazz2 = clazz;
            n3 = Integer.rotateLeft((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n3, 24);
            int n4 = n3 ^ 0xFBD14C12;
            if ((n4 ^ n3) != -70169582) {
                int cfr_ignored_0 = (0x7EB61322 ^ n3) - -1496232130;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tds_3 ^ string.hashCode()) + (n2 + shsk_2) + i ^ tds_3, 11) + shsk_2);
            }
            String[] stringArray = mb.dny_2(new String(cArray));
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

    private static String[] f5r880rwo1k(String string) {
        return string.split("\u0001\u001a", -1);
    }

    private static CallSite coxr0z1col4kl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n9ena4w ^ string.hashCode() ^ n2 + yl7upk5 + i * 42205093) + n9ena4w) ^ yl7upk5));
            }
            String[] stringArray = mb.f5r880rwo1k(new String(cArray));
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

