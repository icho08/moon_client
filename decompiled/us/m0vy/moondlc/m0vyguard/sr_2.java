/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1839
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1799;
import net.minecraft.class_1839;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bsh;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.trl;
import us.m0vy.moondlc.m0vyguard.hm;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="NoSlow", category=bzw.OTHER, desc="Controls item-use slowdown without packet spam")
public class sr_2
extends bnq {
    private final khd jkf = new khd(this, "Profile");
    private final fy sdhb_2 = new fy(this.jkf, "Grim Pulse").rhh_3();
    private final fy djh_2 = new fy(this.jkf, "Full Speed");
    private final fy shshk = new fy(this.jkf, "Vanilla");
    private final badh_2 zshh_2 = new badh_2(this, "Consumables").bts(true);
    private final badh_2 jzw = new badh_2(this, "Shields").bts(true);
    private final badh_2 rksh = new badh_2(this, "Ranged Items").bts(true);
    private int sb_2;
    private boolean jnn;
    private static sr_2 hdd;
    private final bql<btt> bq = this::zwsh;
    private final bql<hm> rka_2 = this::asz;
    private static final int szq_2 = 1567498674;
    private static final int jtf = -1406406044;
    private static final int shysh = 926203288;
    private static final int shds_2 = -764710581;
    private static final int o6kb7edv0 = -1393805597;
    private static final int hv944ypm1p = -1783813683;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o8c8gzvyd;

    public sr_2() {
        hdd = this;
    }

    public static sr_2 stf_3() {
        block0: {
            int n = 1887145556;
            int n2 = (n = Integer.rotateLeft(n * -1118954533, 16) ^ 0xCDF20F33) ^ 0x77E4EE04;
            if ((n2 ^ n) == 2011491844) break block0;
            int cfr_ignored_0 = (0x79F6050 ^ n) - 1846674518;
        }
        return hdd;
    }

    @Override
    public void nt() {
        int n = -2090230475;
        int n2 = (n = Integer.rotateLeft(n * -1682981965, 6) ^ 0xD5E6955) ^ 0x1683D0EF;
        if ((n2 ^ n) != 377737455) {
            int cfr_ignored_0 = (0x95EA4DDA ^ n) + 1760206802;
        }
        this.bkt_2();
    }

    @Override
    public void nc() {
        int n = 310573583;
        n = Integer.rotateLeft(n * -1486764139, 23) ^ 0x5AA93039;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 28);
        int n2 = n ^ 0xDC33515C;
        if ((n2 ^ n) != -600616612) {
            int cfr_ignored_0 = (0xCEB1AB53 ^ n) - -841831140;
        }
        this.bkt_2();
    }

    public boolean shy_5() {
        int n;
        block4: {
            try {
                int n2 = -731593851;
                n2 = Integer.rotateLeft(n2 * 1431148993, 18) ^ 0xE149E1EF;
                int n3 = n2 ^ 0xFD3BAEF4;
                if ((n3 ^ n2) != -46420236) {
                    int cfr_ignored_0 = (0x295F6D71 ^ n2) + -837976187;
                }
                if ((0x1B6 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = this.rgha_2() && !this.shshk.shghkh() && sr_2.mc.field_1724 != null && sr_2.mc.field_1724.method_6115() && this.shdh_5() && this.jnn ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0xDCAF;
        }
        return n != 0;
    }

    public boolean ghh_2() {
        int n;
        block1: {
            int n2 = 1451292197;
            n2 = Integer.rotateLeft(n2 * -836055849, 9) ^ 0xCCC479BB;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x303EED90;
            if ((n3 ^ n2) != 809430416) {
                int cfr_ignored_0 = (0x66BE1BB5 ^ n2) + -905483312;
            }
            n = sr_2.ghzw(this) && !this.shshk.shghkh() && sr_2.mc.field_1724 != null && sr_2.mc.field_1724.method_6115() && !sr_2.zbd_3(sr_2.mc.field_1724) && this.shdh_5() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x7BD4;
        }
        return n != 0;
    }

    private boolean shdh_5() {
        try {
            int n = 1502341828;
            n = Integer.rotateLeft(n * 1566154535, 24) ^ 0x355C287B;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0x5AC54D42;
            if ((n2 ^ n) != 1522879810) {
                int cfr_ignored_0 = (0x34EA786 ^ n) - -2049429612;
            }
            if ((0x1D7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (sr_2.mc.field_1724 == null || !sr_2.bny(sr_2.mc.field_1724)) {
            return false;
        }
        class_1839 class_18392 = sr_2.jnf(sr_2.mc.field_1724).method_7976();
        return switch (bsh.hfa[class_18392.ordinal()]) {
            case 1, 2 -> this.zshh_2.shzl();
            case 3 -> this.jzw.shzl();
            case 4, 5, 6, 7, 8, 9 -> sr_2.thts_3(this.rksh);
            default -> false;
        };
    }

    /*
     * Unable to fully structure code
     */
    private void bkt_2() {
        var3_1 = 0;
        var1_2 = 351585717;
        var1_2 = Integer.rotateLeft(var1_2 * 1410961335, 17) ^ -1998001135;
        var2_3 = var1_2 - 583511744 + 1642522966 - 1642522966;
        while (true) {
            block28: {
                block29: {
                    block25: {
                        block32: {
                            block31: {
                                block26: {
                                    block34: {
                                        block30: {
                                            block33: {
                                                block37: {
                                                    block35: {
                                                        block27: {
                                                            block36: {
                                                                var3_1 = var1_2 - var2_3;
                                                                switch (var3_1 & 7) {
                                                                    case 0: {
                                                                        if (var3_1 == 583511744) break;
                                                                        if (var3_1 != -1136206968) {
                                                                            ** break;
                                                                        }
                                                                        break block25;
                                                                    }
                                                                    case 2: {
                                                                        if (var3_1 == 360334898) break block26;
                                                                        if (var3_1 != -1620360806) {
                                                                            ** break;
                                                                        }
                                                                        break block27;
                                                                    }
                                                                    case 3: {
                                                                        if (var3_1 == 1238375603) break block28;
                                                                        if (var3_1 != -1306997141) {
                                                                            ** break;
                                                                        }
                                                                        break block29;
                                                                    }
                                                                    case 4: {
                                                                        if (var3_1 != -1497024604) {
                                                                            ** break;
                                                                        }
                                                                        break block30;
                                                                    }
                                                                    case 5: {
                                                                        if (var3_1 == -1343277211) break block31;
                                                                        if (var3_1 == 856759797) break block32;
                                                                        if (var3_1 != 745680141) {
                                                                            ** break;
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    case 6: {
                                                                        if (var3_1 == 2089903078) break block34;
                                                                        if (var3_1 != -653475242) {
                                                                            (Integer.rotateLeft(-103543559 ^ var1_2, 18) + 1158361442) * -103543559;
                                                                            (int)(4280287459227790159L ^ (long)var1_2 ^ -5118196828047025380L);
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 7: {
                                                                        if (var3_1 == 2062432615) break block36;
                                                                        if (var3_1 != -609143009) {
                                                                            Integer.rotateLeft(1228579236 ^ var1_2, 12) - -495504873;
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                }
                                                                (Integer.rotateRight(-1474363718 ^ var1_2, 8) + 1612609473) * -1474363717;
                                                                if (!yf.khdha_2()) {
                                                                    (int)(-2827962172425711045L ^ (long)var1_2 ^ -2038274559482782637L);
                                                                    var2_3 = var1_2 - 1067227415 ^ -628250775 ^ -628250775;
                                                                    (int)(-2623445191971559687L ^ (long)var1_2 ^ -5652451720411473154L);
                                                                    var2_3 = (int)((long)(var1_2 - -1620360806) ^ 1144926153159004105L ^ 1144926153159004105L);
                                                                    var3_1 += 2;
                                                                    continue;
                                                                }
                                                                try {
                                                                    var2_3 = var1_2 - 2062432615;
                                                                }
                                                                catch (IllegalStateException v0) {
                                                                    var2_3 = (int)((long)(var1_2 - 2062432615) ^ 6500989730066592666L ^ 6500989730066592666L);
                                                                }
                                                                var3_1 -= 5;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(-1329326513 ^ var1_2, 9) - 1813795532;
                                                            this.sb_2 = 0;
                                                            this.jnn = false;
                                                            return;
                                                        }
                                                        Integer.rotateRight(-56064090 ^ var1_2, 18) - -1664742315;
                                                        yf.athz_2();
                                                        throw null;
                                                    }
                                                    Integer.rotateRight(-1089509718 ^ var1_2, 10) + 658181585;
                                                    var2_3 = var1_2 - -1202205300;
                                                    (Integer.rotateLeft(1538006288 ^ var1_2, 14) + 506799147) * 1538006289;
                                                    var2_3 = var1_2 - 583511744;
                                                    var3_1 -= 3;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(1554414069 ^ var1_2, 14) - 1015440358) * 1554414069;
                                                (int)(-7055777461521028273L ^ (long)var1_2 ^ 5971917254352736760L);
                                                var2_3 = var1_2 - 1335134010 + -364819391 - -364819391;
                                                (Integer.rotateRight(1065956791 ^ var1_2, 10) - -1241833372) * 1065956791;
                                                var2_3 = var1_2 - 583511744 ^ -1953506309 ^ -1953506309;
                                                var3_1 -= 3;
                                                continue;
                                            }
                                            (Integer.rotateLeft(1814898261 ^ var1_2, 16) - 500515718) * 1814898261;
                                            (int)(-5863818208886854833L ^ (long)var1_2 ^ -1323914141987442450L);
                                            try {
                                                var3_1 -= 5;
                                                var2_3 = Integer.reverse(Integer.reverse(var1_2 - 583511744));
                                            }
                                            catch (NoSuchElementException v1) {
                                                var2_3 = Integer.reverse(Integer.reverse(var1_2 - 583511744));
                                            }
                                            var3_1 += 3;
                                            continue;
                                        }
                                        Integer.rotateRight(173926275 ^ var1_2, 4) + 1169991704;
                                        var2_3 = var1_2 - 1338472886;
                                        (Integer.rotateRight(1285925243 ^ var1_2, 12) + 1282221344) * 1285925243;
                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 - 583511744));
                                        var3_1 += 4;
                                        continue;
                                    }
                                    Integer.rotateLeft(1597989856 ^ var1_2, 14) + -1928677541;
                                    var2_3 = var1_2 - 179978786 + 1714687241 - 1714687241;
                                    (Integer.rotateRight(-67010882 ^ var1_2, 18) - -2004092867) * -67010881;
                                    var2_3 = var1_2 - 583511744 + -1427703441 - -1427703441;
                                    var3_1 += 3;
                                    continue;
                                }
                                (Integer.rotateRight(1904888063 ^ var1_2, 17) - -1004767716) * 1904888063;
                                var2_3 = var1_2 - 440689888 + 1230870992 - 1230870992;
                                (Integer.rotateLeft(-2122222403 ^ var1_2, 3) - -1291140578) * -2122222403;
                                (int)(4842454268312349519L ^ (long)var1_2 ^ 5219816116581903286L);
                                var2_3 = Integer.reverse(Integer.reverse(var1_2 - 583511744));
                                var3_1 -= 2;
                                continue;
                            }
                            (Integer.rotateLeft(1003300564 ^ var1_2, 10) - 1110790887) * 1003300565;
                            var2_3 = Integer.reverse(Integer.reverse(var1_2 - -1916953335));
                            Integer.rotateRight(1329815722 ^ var1_2, 12) + -1652141103;
                            var2_3 = var1_2 - 583511744;
                            var3_1 += 4;
                            continue;
                        }
                        (Integer.rotateLeft(1912986705 ^ var1_2, 17) + -753709814) * 1912986705;
                        (int)(-5712971793445885105L ^ (long)var1_2 ^ 1848871795495062719L);
                        try {
                            var3_1 += 3;
                            if ((5126296731588378357L ^ (long)var1_2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var2_3 = var1_2 - 583511744 ^ 1462392320 ^ 1462392320;
                        }
                        catch (IllegalStateException v2) {
                            var2_3 = var1_2 - 583511744;
                        }
                        --var3_1;
                        continue;
                    }
                    Integer.rotateLeft(-2080090299 ^ var1_2, 3) - 14954646;
                    (int)(5095534322875951951L ^ (long)var1_2 ^ 1117036856047378620L);
                    var2_3 = (int)((long)(var1_2 - -355851214) ^ 2979717667578040789L ^ 2979717667578040789L);
                    Integer.rotateLeft(-2084768127 ^ var1_2, 3) + -130058022;
                    (int)(4687781827284626255L ^ (long)var1_2 ^ 5478773095155707853L);
                    var2_3 = var1_2 - 583511744 ^ -469189131 ^ -469189131;
                    Integer.rotateLeft(-1274065020 ^ var1_2, 9) - -768065481;
                    continue;
                }
                (Integer.rotateLeft(-1973861103 ^ var1_2, 4) + -986907574) * -1973861103;
                (int)(5254551965137169231L ^ (long)var1_2 ^ 3109879691158830086L);
                var2_3 = var1_2 - 583511744 + -1573708303 - -1573708303;
                var3_1 += 5;
                continue;
            }
            (Integer.rotateLeft(-1474083596 ^ var1_2, 8) - 1621293255) * -1474083595;
            var2_3 = var1_2 - 796493032 ^ -220535065 ^ -220535065;
            (Integer.rotateRight(-76369838 ^ var1_2, 18) + 2000746793) * -76369837;
            (int)(7918267918533329231L ^ (long)var1_2 ^ 5764886429515216407L);
            var2_3 = Integer.reverse(Integer.reverse(var1_2 - 842686588));
            (int)(9134413802080507889L ^ (long)var1_2 ^ 1484266402428047446L);
            var2_3 = var1_2 - 583511744 + 1204906993 - 1204906993;
            var3_1 -= 3;
            continue;
lbl200:
            // 8 sources

            (Integer.rotateRight(506675902 ^ var1_2, 6) - -1399671747) * 506675903;
            var2_3 = (int)((long)(var1_2 - 583511744) ^ -703429271085914101L ^ -703429271085914101L);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void asz(hm var1_1) {
        var4_2 = 0;
        var2_3 = -1089564956;
        var2_3 = Integer.rotateLeft(var2_3 * -95422501, 14) ^ 1579178189;
        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9);
        block34: while (true) {
            if ((var4_2 = Integer.rotateRight(var3_4, 9) ^ var2_3) == -300810338) ** GOTO lbl170
            if (var4_2 == 881785829) ** GOTO lbl-1000
            Integer.rotateRight(-1670699057 ^ var2_3, 6) - -178818740;
            if (var4_2 != 260498355) {
                switch (var4_2) {
                    case -373076967: {
                        (Integer.rotateRight(378274266 ^ var2_3, 5) + -1085155167) * 378274267;
                        if (yf.khdha_2()) {
                            try {
                                var4_2 += 3;
                                if ((3812657928733899915L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new ArithmeticException();
                                }
                                var3_4 = Integer.rotateLeft(var2_3 ^ -800876210, 9) ^ -868640204 ^ -868640204;
                            }
                            catch (ArithmeticException v0) {
                                var3_4 = Integer.rotateLeft(var2_3 ^ -800876210, 9) ^ -1592399735 ^ -1592399735;
                            }
                            ++var4_2;
                            continue block34;
                        }
                        var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -2086302305, 9)));
                        Integer.rotateRight(-1109012222 ^ var2_3, 10) + 53603961;
                        var3_4 = Integer.rotateLeft(var2_3 ^ -18493881, 9) ^ 1182043920 ^ 1182043920;
                        ++var4_2;
                        continue block34;
                    }
                    case -979446247: {
                        Integer.rotateRight(810711663 ^ var2_3, 9) - -564497748;
                        return;
                    }
                    case -800876210: {
                        Integer.rotateRight(522347595 ^ var2_3, 6) + -913849264;
                        if (this.shy_5()) {
                            var3_4 = Integer.rotateLeft(var2_3 ^ 871178514, 9) + 848188419 - 848188419;
                            (Integer.rotateLeft(268438201 ^ var2_3, 5) + -195105886) * 268438201;
                            (int)(-3264365892379284657L ^ (long)var2_3 ^ -5442456001217820492L);
                            var3_4 = Integer.rotateLeft(var2_3 ^ -1712507383, 9) + 206310101 - 206310101;
                            ++var4_2;
                            continue block34;
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ -979446247, 9) ^ 1651171846 ^ 1651171846;
                        --var4_2;
                        continue block34;
                    }
                    case -18493881: {
                        Integer.rotateRight(-34533206 ^ var2_3, 18) + -997284911;
                        yf.athz_2();
                        var3_4 = Integer.rotateLeft(var2_3 ^ -2071480102, 9);
                        (Integer.rotateLeft(1236919408 ^ var2_3, 12) + -236959541) * 1236919409;
                        var3_4 = Integer.rotateLeft(var2_3 ^ -800876210, 9);
                        var4_2 += 3;
                        continue block34;
                    }
                    case -1712507383: {
                        (Integer.rotateLeft(1968783376 ^ var2_3, 17) + 975986987) * 1968783377;
                        var1_1.dhtd_2();
                        try {
                            if ((-1551745139604968871L ^ (long)var2_3 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -979446247, 9)));
                        }
                        catch (ArithmeticException v1) {
                            var3_4 = Integer.rotateLeft(var2_3 ^ -979446247, 9) ^ -1693088063 ^ -1693088063;
                        }
                        var4_2 += 2;
                        continue block34;
                    }
                }
            }
            ** GOTO lbl146
lbl-1000:
            // 1 sources

            {
                Integer.rotateRight(-1684095294 ^ var2_3, 6) + -594102087;
                var3_4 = Integer.rotateLeft(var2_3 ^ -1300006493, 9) ^ -306030841 ^ -306030841;
                Integer.rotateRight(144299847 ^ var2_3, 4) - 251572436;
                try {
                    if ((7112799061253037661L ^ (long)var2_3 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) + -825125404 - -825125404;
                }
                catch (IllegalStateException v2) {
                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -373076967, 9) ^ 3109020678417778286L ^ 3109020678417778286L);
                }
                var4_2 += 5;
                continue block34;
                case 1548990765: {
                    (Integer.rotateLeft(-936345552 ^ var2_3, 12) + 1111303435) * -936345551;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -689934609, 9);
                    Integer.rotateRight(-1940262138 ^ var2_3, 4) - 54660341;
                    try {
                        var4_2 += 4;
                        if ((-4233537711778884237L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) + -767570978 - -767570978;
                    }
                    catch (ArithmeticException v3) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9);
                    }
                    var4_2 += 5;
                    continue block34;
                }
                case 1486021024: {
                    (Integer.rotateLeft(-614192715 ^ var2_3, 14) - -1786860506) * -614192715;
                    (int)(1861824514817846095L ^ (long)var2_3 ^ -981640570307240324L);
                    var3_4 = Integer.rotateLeft(var2_3 ^ 1644527570, 9);
                    (Integer.rotateLeft(-930810755 ^ var2_3, 12) - 1282882142) * -930810755;
                    (int)(735874820714326863L ^ (long)var2_3 ^ 5327902507638831549L);
                    try {
                        if ((5270299440269513863L ^ (long)var2_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) ^ 165097252 ^ 165097252;
                    }
                    catch (NoSuchElementException v4) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) ^ -1479078256 ^ -1479078256;
                    }
                    var4_2 += 5;
                    continue block34;
                }
                case -1017687649: {
                    (Integer.rotateRight(1429692091 ^ var2_3, 13) + 1444026336) * 1429692091;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 2095215521, 9)));
                    (Integer.rotateRight(-1702219078 ^ var2_3, 6) + -1155939391) * -1702219077;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -373076967, 9)));
                    ++var4_2;
                    continue block34;
                }
                case 1063644964: {
                    Integer.rotateRight(-1714420565 ^ var2_3, 6) + -1534185488;
                    try {
                        --var4_2;
                        if ((-8240608904115914779L ^ (long)var2_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) ^ 329142944 ^ 329142944;
                    }
                    catch (NoSuchElementException v5) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) + 1121531397 - 1121531397;
                    }
                    var4_2 -= 4;
                    continue block34;
                }
lbl146:
                // 1 sources

                Integer.rotateLeft(682607689 ^ var2_3, 8) + -240753646;
                (int)(-1576987247392789681L ^ (long)var2_3 ^ 2997289700474517995L);
                var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) + -213828370 - -213828370;
                (Integer.rotateLeft(1714106545 ^ var2_3, 15) + 1670939818) * 1714106545;
                (int)(-6586058655251764401L ^ (long)var2_3 ^ -4582268472389999390L);
                var4_2 += 4;
                continue block34;
                case 11592827: {
                    (Integer.rotateLeft(-1767138571 ^ var2_3, 5) - 1126523622) * -1767138571;
                    (int)(6059932807870081871L ^ (long)var2_3 ^ -7719025612853541405L);
                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 256771805, 9) ^ -264007714016888019L ^ -264007714016888019L);
                    Integer.rotateRight(-1647888541 ^ var2_3, 6) + 528307256;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 149719504, 9)));
                    Integer.rotateRight(-671308670 ^ var2_3, 13) + 737512185;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -373076967, 9)));
                    continue block34;
                }
lbl170:
                // 1 sources

                Integer.rotateRight(-1767650553 ^ var2_3, 5) - 1110652180;
                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -373076967, 9) ^ -1000254491087731786L ^ -1000254491087731786L);
                var4_2 -= 5;
                continue block34;
                case -917781967: {
                    (Integer.rotateRight(-2065342177 ^ var2_3, 3) - 472146428) * -2065342177;
                    var3_4 = Integer.rotateLeft(var2_3 ^ 517959261, 9);
                    Integer.rotateRight(-169732722 ^ var2_3, 17) - -893502611;
                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1590484951, 9) ^ -7625659280355601695L ^ -7625659280355601695L);
                    Integer.rotateRight(182087338 ^ var2_3, 4) + 1422984657;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) + 313056800 - 313056800;
                    var4_2 += 4;
                    continue block34;
                }
                case 1141143321: {
                    Integer.rotateRight(-932953465 ^ var2_3, 12) - 1216458132;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -710719709, 9) + -1960359939 - -1960359939;
                    (Integer.rotateRight(991832282 ^ var2_3, 10) + 755274145) * 991832283;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) ^ 1701303277 ^ 1701303277;
                    continue block34;
                }
                case -467727962: {
                    Integer.rotateLeft(-328549495 ^ var2_3, 16) + -1521855278;
                    (int)(3375471784220748623L ^ (long)var2_3 ^ -3019519401692368799L);
                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -553607640, 9) ^ -4273212275393861228L ^ -4273212275393861228L);
                    (Integer.rotateRight(-1222842754 ^ var2_3, 9) - 819824765) * -1222842753;
                    try {
                        ++var4_2;
                        var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -373076967, 9)));
                    }
                    catch (UnsupportedOperationException v6) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9);
                    }
                    var4_2 += 5;
                    continue block34;
                }
                case 1187633278: {
                    Integer.rotateRight(-985424254 ^ var2_3, 11) + -410136327;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 1378426445, 9)));
                    (Integer.rotateLeft(-832790959 ^ var2_3, 12) + 26528522) * -832790959;
                    (int)(931735413995137871L ^ (long)var2_3 ^ -7086269865207942131L);
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 859312438, 9)));
                    (Integer.rotateRight(1219013075 ^ var2_3, 12) + -792055864) * 1219013075;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) + 22147896 - 22147896;
                    continue block34;
                }
                case 1826190460: {
                    Integer.rotateLeft(-502137023 ^ var2_3, 15) + 1686865946;
                    (int)(2351813024103590735L ^ (long)var2_3 ^ 6883896178895350935L);
                    (int)(6700525663473254058L ^ (long)var2_3 ^ -1990912232171301845L);
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -373076967, 9)));
                    continue block34;
                }
                case -967348652: {
                    (Integer.rotateLeft(-843859492 ^ var2_3, 12) - -316596001) * -843859491;
                    try {
                        if ((-3823118554555050541L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9);
                    }
                    catch (ArithmeticException v7) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ -373076967, 9) ^ -1346880458 ^ -1346880458;
                    }
                    var4_2 += 5;
                }
            }
            Integer.rotateRight(1445923234 ^ var2_3, 13) + 1947191769;
            var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -373076967, 9)));
        }
    }

    private void zwsh(btt btt2) {
        try {
            int n = 240528270;
            n = Integer.rotateLeft(n * -759072899, 11) ^ 0x73AA5A7A;
            int n2 = n ^ 0xCF687FA;
            if ((n2 ^ n) != 217483258) {
                int cfr_ignored_0 = (0x2A0AC74 ^ n) - 360484138;
            }
            if ((0x3BB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (sr_2.mc.field_1724 == null || !sr_2.mc.field_1724.method_6115() || !this.shdh_5()) {
            this.bkt_2();
            return;
        }
        ++this.sb_2;
        this.jnn = this.djh_2.shghkh() || this.sdhb_2.shghkh() && (this.sb_2 & 1) == 1;
    }

    private static String ghdth(String string, int n, int n2, int n3) {
        int n4 = 1735087351;
        n4 = Integer.rotateLeft(n4 * -1930944531, 14) ^ 0xDB67322A;
        n4 = n2 ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0x2FF971FF;
        if ((n5 ^ n4) != 804876799) {
            int cfr_ignored_0 = (0x48922508 ^ n4) - 1023695554;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x3C7CDB9C) + n2 ^ i * -932144953) ^ szq_2) + jtf);
        }
        return new String(cArray);
    }

    private static boolean ghzw(sr_2 sr2) {
        block0: {
            int n = trl.athq(-1554884228);
            sr_2 sr3 = sr2;
            n = (sr3 != null ? System.identityHashCode(sr3) : 0) ^ n;
            int n2 = n ^ 0x176A0596;
            if ((n2 ^ n) == 392824214) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB4385CEA ^ n, 9) + -684662895;
        }
        return sr2.rgha_2();
    }

    private static boolean zbd_3(class_746 class_7462) {
        block0: {
            int n = 253023890;
            int n2 = (n = Integer.rotateLeft(n * 1680242671, 21) ^ 0x82652CF) ^ 0xDA3BD030;
            if ((n2 ^ n) == -633614288) break block0;
            int cfr_ignored_0 = (0xD52F06A2 ^ n) + -545202855;
        }
        return class_7462.method_5799();
    }

    private static boolean bny(class_746 class_7462) {
        block0: {
            int n = trl.athq(2012924629);
            int n2 = n ^ 0x17EF306F;
            if ((n2 ^ n) == 401551471) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6015FABA ^ n, 15) + -1492714559) * 1612053179;
        }
        return class_7462.method_6115();
    }

    private static class_1799 jnf(class_746 class_7462) {
        block0: {
            int n = 1482629910;
            int n2 = (n = Integer.rotateLeft(n * 1627769549, 13) ^ 0xB3C4A3CC) ^ 0xF26B8B50;
            if ((n2 ^ n) == -227833008) break block0;
            int cfr_ignored_0 = (0xAA34A846 ^ n) - -333549963;
        }
        return class_7462.method_6030();
    }

    private static boolean thts_3(badh_2 badh2) {
        block0: {
            int n = -1298195758;
            n = Integer.rotateLeft(n * -1598775499, 15) ^ 0x30BB11CE;
            badh_2 badh3 = badh2;
            n = Integer.rotateRight((badh3 != null ? System.identityHashCode(badh3) : 0) ^ n, 15);
            int n2 = n ^ 0xD1545560;
            if ((n2 ^ n) == -783002272) break block0;
            int cfr_ignored_0 = (0x63CB4FB2 ^ n) - -1568037134;
        }
        return badh2.shzl();
    }

    private static String[] akt(String string) {
        block0: {
            int n = trl.athq(1222562878);
            int n2 = n ^ 0x4083A52E;
            if ((n2 ^ n) == 1082369326) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x85D7110 ^ n, 4) + 128864299) * 140341521;
        }
        return string.split("\u0007\u0015", -1);
    }

    private static CallSite ja(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1634908434;
            n3 = Integer.rotateLeft(n3 * 1128497323, 17) ^ 0x6822A0F3;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x63AE26FB;
            if ((n4 ^ n3) != 1672357627) {
                int cfr_ignored_0 = (0xFD236015 ^ n3) - -1776734063;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ shysh ^ string.hashCode() ^ n2 + shds_2 ^ i * 808820573 ^ shysh, 18) ^ shds_2));
            }
            String[] stringArray = sr_2.akt(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] hhwrwl3c6g(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite uqnvi4ut(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ o6kb7edv0 ^ string.hashCode()) + (n2 + hv944ypm1p) + i ^ o6kb7edv0, 5) + hv944ypm1p);
            }
            String[] stringArray = sr_2.hhwrwl3c6g(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

