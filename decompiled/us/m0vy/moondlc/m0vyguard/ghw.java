/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import us.m0vy.moondlc.m0vyguard.bbh;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bjq;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.bdhw;
import us.m0vy.moondlc.m0vyguard.brm;
import us.m0vy.moondlc.m0vyguard.bshj;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bqd_2;
import us.m0vy.moondlc.m0vyguard.bhn_2;
import us.m0vy.moondlc.m0vyguard.byl;
import us.m0vy.moondlc.m0vyguard.tath;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tbdh;
import us.m0vy.moondlc.m0vyguard.tthk;
import us.m0vy.moondlc.m0vyguard.tkhh;
import us.m0vy.moondlc.m0vyguard.trr;
import us.m0vy.moondlc.m0vyguard.tshd;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.dr;
import us.m0vy.moondlc.m0vyguard.sdh_3;
import us.m0vy.moondlc.m0vyguard.shsh_5;
import us.m0vy.moondlc.m0vyguard.ts_4;
import us.m0vy.moondlc.m0vyguard.aa_2;
import us.m0vy.moondlc.m0vyguard.fw_2;
import us.m0vy.moondlc.m0vyguard.qkh;
import us.m0vy.moondlc.m0vyguard.y_2;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ghw {
    private static final int dbq = 864405281;
    private static final int sdsh_2 = 760732518;
    private static final int pcb6aizdj5gth = 1373021854;
    private static final int jk3ew64cfbg3z = -501505718;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int smg6eons6ze6p;

    private ghw() {
    }

    public static List khzw(List list) {
        int n = 1053219262;
        n = Integer.rotateLeft(n * 1150594183, 21) ^ 0x5FAA8C08;
        List list2 = list;
        n = Integer.rotateRight((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 13);
        int n2 = n ^ 0x4688D726;
        if ((n2 ^ n) != 1183373094) {
            int cfr_ignored_0 = (0x784E0E98 ^ n) - -1374599850;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (bdhw bdhw2 : list) {
            ghw.zww_2(arrayList, bdhw2, ghw::dfn_2);
        }
        return arrayList;
    }

    public static void dhsd_2(List list) {
        int n = 1028177444;
        n = Integer.rotateLeft(n * 1336975891, 24) ^ 0x3F8795FE;
        List list2 = list;
        n = (list2 != null ? System.identityHashCode(list2) : 0) ^ n;
        int n2 = n ^ 0x7E862733;
        if ((n2 ^ n) != 2122721075) {
            int cfr_ignored_0 = (0x43CE9917 ^ n) + -1724214370;
        }
        for (baj_2 baj2_2 : list) {
            if (baj2_2 instanceof tkhh) {
                tkhh tkhh2 = (tkhh)baj2_2;
                tkhh2.jqn();
                tkhh2.dsz_3().sby_2(ghw.skh_2(tkhh2));
                continue;
            }
            if (baj2_2 instanceof bjq) {
                bjq bjq2 = (bjq)baj2_2;
                ghw.htn(bjq2);
                bjq2.bjk().sby_2(ghw.jwz_2(bjq2));
                for (Object object : bjq2.bla_2()) {
                    ((sdh_3)object).tkhk_2().sby_2(((sdh_3)object).swz());
                }
                continue;
            }
            if (baj2_2 instanceof aa_2) {
                aa_2 aa2 = (aa_2)baj2_2;
                aa2.zshth_2();
                ghw.thls(aa2.zghsh_2(), ghw.ththh_2(aa2));
                for (Object object : aa2.shbh()) {
                    ghw.tsa_7(((tbdh)object).dhdy_2(), ghw.dhsd((tbdh)object));
                }
                continue;
            }
            if (baj2_2 instanceof brm) {
                brm brm2 = (brm)baj2_2;
                brm2.akha();
                continue;
            }
            if (baj2_2 instanceof y_2) {
                y_2 y2 = (y_2)baj2_2;
                y2.sghgh();
                continue;
            }
            if (!(baj2_2 instanceof bqd_2)) continue;
            bqd_2 bqd2 = (bqd_2)baj2_2;
            ghw.shzdh(bqd2);
        }
    }

    private static void ztth_3(List list, bdhw bdhw2, bbh bbh2) {
        int n = -1015991460;
        n = Integer.rotateLeft(n * -320786833, 21) ^ 0x1F75A821;
        bdhw bdhw3 = bdhw2;
        n = (bdhw3 != null ? System.identityHashCode(bdhw3) : 0) ^ n;
        bbh bbh3 = bbh2;
        n = (bbh3 != null ? System.identityHashCode(bbh3) : 0) ^ n;
        int n2 = n ^ 0x71E4A71F;
        if ((n2 ^ n) != 1910810399) {
            int cfr_ignored_0 = (0xB2959443 ^ n) - 1239454077;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        bbh bbh4 = () -> ghw.shat(bbh2, bdhw2);
        if (bdhw2 instanceof badh_2) {
            badh_2 badh2 = (badh_2)bdhw2;
            list.add(new tkhh(badh2, bbh4));
        } else if (bdhw2 instanceof khd) {
            khd khd2 = (khd)bdhw2;
            bjq bjq2 = new bjq(khd2, bbh4);
            ghw.tzs_2(bjq2, ghw.rsl_2(khd2));
            list.add(bjq2);
        } else if (bdhw2 instanceof bbd_2) {
            bbd_2 bbd2 = (bbd_2)bdhw2;
            aa_2 aa2 = new aa_2(bbd2, bbh4);
            ghw.ghrr(aa2, bbd2.thhy());
            list.add(aa2);
        } else if (bdhw2 instanceof tshd) {
            tshd tshd2 = (tshd)bdhw2;
            list.add(new bshj(tshd2, bbh4));
        } else if (bdhw2 instanceof tay) {
            tay tay2 = (tay)bdhw2;
            list.add(new brm(tay2, bbh4));
        } else if (bdhw2 instanceof qkh) {
            qkh qkh2 = (qkh)bdhw2;
            list.add(new tthk(qkh2, bbh4));
        } else if (bdhw2 instanceof ts_4) {
            ts_4 ts2 = (ts_4)bdhw2;
            list.add(new shsh_5(ts2, bbh4::visible));
        } else if (bdhw2 instanceof fw_2) {
            fw_2 fw2 = (fw_2)bdhw2;
            trr trr2 = new trr(fw2.getName(), () -> ghw.ddz_3(fw2));
            bbh bbh5 = bbh4;
            ghw.ghzl_2(bbh5);
            trr2.bqq(bbh5::visible);
            list.add(trr2);
        } else if (bdhw2 instanceof bzw_2) {
            bzw_2 bzw2_2 = (bzw_2)bdhw2;
            list.add(new bqd_2(bzw2_2, bbh4));
        } else if (bdhw2 instanceof bdh_3) {
            bdh_3 bdh2_2 = (bdh_3)bdhw2;
            list.add(new y_2(bdh2_2, bbh4));
        } else if (bdhw2 instanceof byl) {
            byl byl2 = (byl)bdhw2;
            list.add(new dr(byl2, bbh4));
        }
    }

    /*
     * Unable to fully structure code
     */
    private static int sfl(Integer var0) {
        var1_1 = 0;
        var4_2 = 0;
        var2_3 = -1795368586;
        var2_3 = Integer.rotateLeft(var2_3 * -1633531839, 19) ^ 1585448871;
        v0 = var0;
        var2_3 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3;
        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 790656027));
        while (true) {
            block67: {
                block65: {
                    block83: {
                        block85: {
                            block74: {
                                block78: {
                                    block71: {
                                        block73: {
                                            block76: {
                                                block66: {
                                                    block75: {
                                                        block69: {
                                                            block84: {
                                                                block72: {
                                                                    block80: {
                                                                        block79: {
                                                                            block81: {
                                                                                block77: {
                                                                                    block70: {
                                                                                        block82: {
                                                                                            block68: {
                                                                                                var4_2 = var3_4 ^ var2_3;
                                                                                                switch (var4_2 & 15) {
                                                                                                    case 0: {
                                                                                                        if (var4_2 != -1196916064) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block65;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        if (var4_2 == -1563759806) break block66;
                                                                                                        if (var4_2 != -1169093710) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block67;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        if (var4_2 == -1031217933) break block68;
                                                                                                        if (var4_2 != 1153443235) {
                                                                                                            if (var4_2 == 403509731) break;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block69;
                                                                                                    }
                                                                                                    case 4: {
                                                                                                        if (var4_2 != -858991036) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block70;
                                                                                                    }
                                                                                                    case 5: {
                                                                                                        if (var4_2 != -1281118251) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block71;
                                                                                                    }
                                                                                                    case 6: {
                                                                                                        if (var4_2 != -1534699322) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block72;
                                                                                                    }
                                                                                                    case 7: {
                                                                                                        if (var4_2 == -356540777) break block73;
                                                                                                        if (var4_2 != -505533737) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block74;
                                                                                                    }
                                                                                                    case 8: {
                                                                                                        if (var4_2 != -1937065880) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block75;
                                                                                                    }
                                                                                                    case 9: {
                                                                                                        if (var4_2 == -1138143431) break block76;
                                                                                                        if (var4_2 != 1203208873) {
                                                                                                            Integer.rotateLeft(-1530896984 ^ var2_3, 7) + -139921773;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block77;
                                                                                                    }
                                                                                                    case 10: {
                                                                                                        if (var4_2 != -815448502) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block78;
                                                                                                    }
                                                                                                    case 11: {
                                                                                                        if (var4_2 == 724776923) break block79;
                                                                                                        if (var4_2 == 790656027) break block80;
                                                                                                        if (var4_2 != 1742269019) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block81;
                                                                                                    }
                                                                                                    case 12: {
                                                                                                        if (var4_2 != -1999254180) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block82;
                                                                                                    }
                                                                                                    case 13: {
                                                                                                        if (var4_2 == -2072332739) break block83;
                                                                                                        if (var4_2 != 776350813) {
                                                                                                            (Integer.rotateLeft(1285981145 ^ var2_3, 12) + 1283954306) * 1285981145;
                                                                                                            (int)(-8208885762845512881L ^ (long)var2_3 ^ -6433247919239286279L);
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block84;
                                                                                                    }
                                                                                                    case 14: {
                                                                                                        if (var4_2 != 1189708958) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block85;
                                                                                                    }
                                                                                                }
                                                                                                Integer.rotateRight(-1640423741 ^ var2_3, 6) + 759716056;
                                                                                                var1_1 = -1;
                                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 376123595));
                                                                                                Integer.rotateRight(-510026357 ^ var2_3, 15) + 1442296592;
                                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1169093710));
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateLeft(50659568 ^ var2_3, 3) + 1643691083) * 50659569;
                                                                                            if (ghw.dhwm(var0) <= (ghw.dhmdh(1122448156) ^ -952952606)) {
                                                                                                var3_4 = var2_3 ^ 1203208873;
                                                                                                var4_2 += 2;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                var4_2 -= 2;
                                                                                                if ((2959166831494495869L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -858991036));
                                                                                            }
                                                                                            catch (IllegalStateException v1) {
                                                                                                var3_4 = (var2_3 ^ -858991036) + 1062385521 - 1062385521;
                                                                                            }
                                                                                            var4_2 += 3;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateRight(801280730 ^ var2_3, 8) + -856856671) * 801280731;
                                                                                        if (ghw.dhwm(var0) <= (ghw.dhmdh(1122448156) ^ -952952606)) {
                                                                                            (int)(2038472250081649186L ^ (long)var2_3 ^ -3882998410623347387L);
                                                                                            var3_4 = var2_3 ^ 1203208873 ^ -1123142954 ^ -1123142954;
                                                                                            var4_2 -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        (int)(7382169633304982881L ^ (long)var2_3 ^ -8852285691801542348L);
                                                                                        var3_4 = (int)((long)(var2_3 ^ -858991036) ^ 8155889964757041449L ^ 8155889964757041449L);
                                                                                        --var4_2;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateRight(1284943095 ^ var2_3, 12) - 1251774756) * 1284943095;
                                                                                    var1_1 = var0;
                                                                                    var3_4 = (int)((long)(var2_3 ^ -692479178) ^ 3244849091705090862L ^ 3244849091705090862L);
                                                                                    (Integer.rotateLeft(644924565 ^ var2_3, 7) - -1408930490) * 644924565;
                                                                                    (int)(-1962889217124799665L ^ (long)var2_3 ^ 2891455109231305813L);
                                                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1169093710));
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateLeft(-534558667 ^ var2_3, 15) - 681794982) * -534558667;
                                                                                (int)(2491024991614987087L ^ (long)var2_3 ^ 3557987854082238706L);
                                                                                var1_1 = var0 + (Integer.reverse(1112010352) ^ 242737702);
                                                                                try {
                                                                                    var4_2 += 2;
                                                                                    if ((-1326924646186028147L ^ (long)var2_3 | 1L) == 0L) {
                                                                                        throw new NoSuchElementException();
                                                                                    }
                                                                                    var3_4 = var2_3 ^ -1169093710;
                                                                                }
                                                                                catch (NoSuchElementException v2) {
                                                                                    var3_4 = var2_3 ^ -1169093710;
                                                                                }
                                                                                var4_2 += 5;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(-345493275 ^ var2_3, 16) - -2047112458;
                                                                            (int)(3015897551696358223L ^ (long)var2_3 ^ -4557498674439389596L);
                                                                            if (var0 != 1313384327 - 1313385326) {
                                                                                (int)(-3635844094782816189L ^ (long)var2_3 ^ 4282522175067403972L);
                                                                                var3_4 = var2_3 ^ -455372736 ^ 739405869 ^ 739405869;
                                                                                (int)(-436301023056759043L ^ (long)var2_3 ^ 1765199587302989362L);
                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 724776923));
                                                                                var4_2 -= 3;
                                                                                continue;
                                                                            }
                                                                            var3_4 = var2_3 ^ 403509731 ^ 534026127 ^ 534026127;
                                                                            ++var4_2;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateLeft(-1297465247 ^ var2_3, 9) + -1493472518;
                                                                        (int)(8077468011261651791L ^ (long)var2_3 ^ 2434339747053260256L);
                                                                        if (var0 < Integer.rotateLeft(-868480976 ^ 721680335, 10)) {
                                                                            try {
                                                                                var4_2 -= 4;
                                                                                if ((8025185758794168745L ^ (long)var2_3 | 1L) == 0L) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                var3_4 = (var2_3 ^ -858991036) + 1846852489 - 1846852489;
                                                                            }
                                                                            catch (IllegalStateException v3) {
                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -858991036));
                                                                            }
                                                                            var4_2 += 3;
                                                                            continue;
                                                                        }
                                                                        (int)(2678814090038327800L ^ (long)var2_3 ^ -2089269298196912245L);
                                                                        var3_4 = var2_3 ^ -1031217933 ^ -129106079 ^ -129106079;
                                                                        --var4_2;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(-451372121 ^ var2_3, 15) - -1034389388;
                                                                    if (var0 == null) {
                                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 403509731));
                                                                        (Integer.rotateLeft(47405489 ^ var2_3, 3) + 1542814634) * 47405489;
                                                                        (int)(-4584110764350706865L ^ (long)var2_3 ^ 1326454238720044306L);
                                                                        --var4_2;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        var4_2 += 2;
                                                                        if ((3833184413174561297L ^ (long)var2_3 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        var3_4 = (int)((long)(var2_3 ^ 1742269019) ^ 5152072012014197577L ^ 5152072012014197577L);
                                                                    }
                                                                    catch (IllegalArgumentException v4) {
                                                                        var3_4 = var2_3 ^ 1742269019;
                                                                    }
                                                                    var4_2 += 3;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(1777463838 ^ var2_3, 16) - -659951395) * 1777463839;
                                                                var3_4 = (var2_3 ^ -43830357) + -1638789175 - -1638789175;
                                                                Integer.rotateLeft(-260189463 ^ var2_3, 17) + 597305714;
                                                                (int)(3661282272718678863L ^ (long)var2_3 ^ 349173119580751951L);
                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -344067089));
                                                                (Integer.rotateLeft(104413848 ^ var2_3, 3) + -984893533) * 104413849;
                                                                var3_4 = (var2_3 ^ 790656027) + 1382993688 - 1382993688;
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(1863195062 ^ var2_3, 16) - 1997716549) * 1863195063;
                                                            (int)(-6725942083817985775L ^ (long)var2_3 ^ -5481398716730120064L);
                                                            var3_4 = var2_3 ^ 790656027;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-195917055 ^ var2_3, 17) + -1705216934;
                                                        (int)(3954201413127826255L ^ (long)var2_3 ^ -5257808416495517679L);
                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 141367887));
                                                        Integer.rotateLeft(-1718483124 ^ var2_3, 6) - -1660124817;
                                                        try {
                                                            var4_2 += 3;
                                                            var3_4 = var2_3 ^ 790656027;
                                                        }
                                                        catch (IllegalStateException v5) {
                                                            var3_4 = var2_3 ^ 790656027;
                                                        }
                                                        var4_2 += 5;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1326413305 ^ var2_3, 12) + -1757616030) * 1326413305;
                                                    (int)(-8233182908235060401L ^ (long)var2_3 ^ 5402211901490378410L);
                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 790656027));
                                                    Integer.rotateRight(171377155 ^ var2_3, 4) + 1090968984;
                                                    var4_2 += 4;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-802083178 ^ var2_3, 13) - 978469733) * -802083177;
                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1584301349));
                                                Integer.rotateLeft(-57946687 ^ var2_3, 18) + -1723102822;
                                                (int)(4483724838675213135L ^ (long)var2_3 ^ 4217765199492010403L);
                                                var3_4 = (int)((long)(var2_3 ^ 829157962) ^ 2329103323314594800L ^ 2329103323314594800L);
                                                Integer.rotateLeft(-1110564467 ^ var2_3, 10) - 5484366;
                                                (int)(9186375326674250575L ^ (long)var2_3 ^ -2157080073050959064L);
                                                var3_4 = var2_3 ^ 790656027 ^ 615543141 ^ 615543141;
                                                continue;
                                            }
                                            Integer.rotateLeft(1033645996 ^ var2_3, 10) - 2051499279;
                                            var3_4 = (var2_3 ^ -1355234371) + -1140663745 - -1140663745;
                                            Integer.rotateLeft(-2006769719 ^ var2_3, 4) + -2007074670;
                                            (int)(5391285891137596239L ^ (long)var2_3 ^ -7018715870797416334L);
                                            var3_4 = (int)((long)(var2_3 ^ -969405518) ^ 2217673771231040879L ^ 2217673771231040879L);
                                            Integer.rotateLeft(644659328 ^ var2_3, 7) + -1417152837;
                                            var3_4 = var2_3 ^ 790656027 ^ 1302682666 ^ 1302682666;
                                            continue;
                                        }
                                        (Integer.rotateRight(1583453206 ^ var2_3, 14) - 1915653605) * 1583453207;
                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1587771408));
                                        Integer.rotateLeft(1072177092 ^ var2_3, 10) - -1049004041;
                                        var3_4 = (var2_3 ^ 435419741) + 994238850 - 994238850;
                                        Integer.rotateLeft(1558513029 ^ var2_3, 14) - 1142508118;
                                        (int)(-7036967085312513201L ^ (long)var2_3 ^ -6196808938802343554L);
                                        var3_4 = (int)((long)(var2_3 ^ 790656027) ^ 5019963786412742062L ^ 5019963786412742062L);
                                        ++var4_2;
                                        continue;
                                    }
                                    (Integer.rotateRight(-479895558 ^ var2_3, 15) + -1918615935) * -479895557;
                                    try {
                                        var4_2 += 2;
                                        if ((-3003959160986573557L ^ (long)var2_3 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 790656027));
                                    }
                                    catch (NoSuchElementException v6) {
                                        var3_4 = var2_3 ^ 790656027;
                                    }
                                    continue;
                                }
                                Integer.rotateRight(-128403230 ^ var2_3, 18) + 387711641;
                                var3_4 = (var2_3 ^ -169912283) + 1605114774 - 1605114774;
                                Integer.rotateRight(1288657866 ^ var2_3, 12) + 1366932657;
                                try {
                                    var4_2 += 3;
                                    if ((-4254685060134995501L ^ (long)var2_3 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 790656027));
                                }
                                catch (NoSuchElementException v7) {
                                    var3_4 = var2_3 ^ 790656027;
                                }
                                continue;
                            }
                            (Integer.rotateRight(471176182 ^ var2_3, 6) - 1794804229) * 471176183;
                            try {
                                var4_2 += 2;
                                if ((-3838374606226115287L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var3_4 = var2_3 ^ 790656027;
                            }
                            catch (IllegalStateException v8) {
                                var3_4 = (var2_3 ^ 790656027) + -998376254 - -998376254;
                            }
                            var4_2 += 3;
                            continue;
                        }
                        Integer.rotateRight(-1901713781 ^ var2_3, 4) + 1249659408;
                        var3_4 = (int)((long)(var2_3 ^ -212014282) ^ 9215946976814837115L ^ 9215946976814837115L);
                        Integer.rotateRight(1972476419 ^ var2_3, 17) + 1090471320;
                        var3_4 = (int)((long)(var2_3 ^ -496717384) ^ -734300910741425295L ^ -734300910741425295L);
                        (Integer.rotateRight(1238576058 ^ var2_3, 12) + -185603391) * 1238576059;
                        var3_4 = (var2_3 ^ 790656027) + 445865759 - 445865759;
                        var4_2 -= 5;
                        continue;
                    }
                    Integer.rotateLeft(1060853640 ^ var2_3, 10) + -1400031053;
                    try {
                        var4_2 += 5;
                        if ((-1449352819742448983L ^ (long)var2_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var3_4 = (int)((long)(var2_3 ^ 790656027) ^ -3201029433345945187L ^ -3201029433345945187L);
                    }
                    catch (UnsupportedOperationException v9) {
                        var3_4 = var2_3 ^ 790656027;
                    }
                    var4_2 -= 4;
                    continue;
                }
                (Integer.rotateRight(-230082637 ^ var2_3, 17) + 1530617320) * -230082637;
                var3_4 = var2_3 ^ -683840661 ^ 463050433 ^ 463050433;
                Integer.rotateLeft(-1804916256 ^ var2_3, 5) + -44584613;
                try {
                    --var4_2;
                    if ((-2007682690239410895L ^ (long)var2_3 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var3_4 = var2_3 ^ 790656027;
                }
                catch (ArithmeticException v10) {
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 790656027));
                }
                --var4_2;
                continue;
            }
            return var1_1;
lbl377:
            // 15 sources

            (Integer.rotateLeft(-658217315 ^ var2_3, 14) - 1143344190) * -658217315;
            (int)(1906932082426571599L ^ (long)var2_3 ^ 7795875103437855036L);
            var3_4 = (int)((long)(var2_3 ^ 790656027) ^ -2941453426408281641L ^ -2941453426408281641L);
        }
    }

    private static int thhw(int n) {
        try {
            int n2 = 616763279;
            n2 = Integer.rotateLeft(n2 * 2125563535, 4) ^ 0xCC31E822;
            n2 = n ^ n2;
            int n3 = n2 ^ 0x99AE3E32;
            if ((n3 ^ n2) != -1716634062) {
                int cfr_ignored_0 = (0xBD6D31BD ^ n2) + 347578619;
            }
            if ((0x183 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (n == -1) {
            return Integer.rotateLeft(0xCFD2A958 ^ 0x303266A7, 21);
        }
        if (n >= 0 && n <= 4) {
            return n - (-362616029 - -362616129);
        }
        return n;
    }

    private static void ddz_3(fw_2 fw2) {
        try {
            int n = -1174700647;
            n = Integer.rotateLeft(n * -817589087, 17) ^ 0xCCC5442E;
            int n2 = n ^ 0xE13F64B7;
            if ((n2 ^ n) != -515939145) {
                int cfr_ignored_0 = (0x58C4192E ^ n) - -656889252;
            }
            if ((0x301 & 0) != 0) {
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
        Runnable runnable = fw2.dqt();
        if (runnable != null) {
            runnable.run();
        }
    }

    private static boolean shat(bbh bbh2, bdhw bdhw2) {
        int n = -780041145;
        n = Integer.rotateLeft(n * -732463325, 14) ^ 0x75E2E193;
        bbh bbh3 = bbh2;
        n = (bbh3 != null ? System.identityHashCode(bbh3) : 0) ^ n;
        bdhw bdhw3 = bdhw2;
        n = Integer.rotateLeft((bdhw3 != null ? System.identityHashCode(bdhw3) : 0) ^ n, 19);
        int n2 = n ^ 0x82427B6C;
        if ((n2 ^ n) != -2109572244) {
            int cfr_ignored_0 = (0x53C3FF2B ^ n) + 1370240471;
        }
        return bbh2.visible() && bdhw2.tsa_5();
    }

    private static boolean dfn_2() {
        block0: {
            int n = 637233430;
            int n2 = (n = Integer.rotateLeft(n * 1164825739, 15) ^ 0x9C7EE782) ^ 0x6D6514B2;
            if ((n2 ^ n) == 1835340978) break block0;
            int cfr_ignored_0 = (0x489E7DA4 ^ n) + -1707861019;
        }
        return true;
    }

    private static void zww_2(List list, bdhw bdhw2, bbh bbh2) {
        int n = 560878097;
        n = Integer.rotateLeft(n * -817057995, 14) ^ 0xDEDDEDEA;
        bdhw bdhw3 = bdhw2;
        n = (bdhw3 != null ? System.identityHashCode(bdhw3) : 0) ^ n;
        bbh bbh3 = bbh2;
        n = Integer.rotateRight((bbh3 != null ? System.identityHashCode(bbh3) : 0) ^ n, 8);
        int n2 = n ^ 0xA67A2E7C;
        if ((n2 ^ n) != -1501942148) {
            int cfr_ignored_0 = (0x87147C6D ^ n) - 1072901097;
        }
        ghw.ztth_3(list, bdhw2, bbh2);
    }

    private static boolean skh_2(tkhh tkhh2) {
        block0: {
            int n = tath.khal_2(1616993797);
            tkhh tkhh3 = tkhh2;
            n = Integer.rotateLeft((tkhh3 != null ? System.identityHashCode(tkhh3) : 0) ^ n, 27);
            int n2 = n ^ 0xB917779F;
            if ((n2 ^ n) == -1189644385) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD976299A ^ n, 14) + 1504487649) * -646567525;
        }
        return tkhh2.tsz();
    }

    private static void htn(bjq bjq2) {
        int n = -731824833;
        int n2 = (n = Integer.rotateLeft(n * -86293839, 7) ^ 0x5F116471) ^ 0xAFFE238E;
        if ((n2 ^ n) != -1342299250) {
            int cfr_ignored_0 = (0x7B9F1EB1 ^ n) - 251346131;
        }
        bjq2.ajy();
    }

    private static boolean jwz_2(bjq bjq2) {
        block0: {
            int n = -1262616870;
            int n2 = (n = Integer.rotateLeft(n * 1648272779, 15) ^ 0x5693C69B) ^ 0xF48298C1;
            if ((n2 ^ n) == -192767807) break block0;
            int cfr_ignored_0 = (0x403F661B ^ n) + 1153698898;
        }
        return bjq2.zst();
    }

    private static boolean ththh_2(aa_2 aa2) {
        block0: {
            int n = -886326573;
            n = Integer.rotateLeft(n * -1640495703, 23) ^ 0xDBEDBBD6;
            aa_2 aa3 = aa2;
            n = Integer.rotateRight((aa3 != null ? System.identityHashCode(aa3) : 0) ^ n, 20);
            int n2 = n ^ 0xFCEA96D;
            if ((n2 ^ n) == 265202029) break block0;
            int cfr_ignored_0 = (0xC4E513BE ^ n) - 1260626686;
        }
        return aa2.tshd_3();
    }

    private static void thls(bhn_2 bhn2_2, boolean bl) {
        int n = tath.khal_2(1020255124);
        bhn_2 bhn3 = bhn2_2;
        n = (bhn3 != null ? System.identityHashCode(bhn3) : 0) ^ n;
        int n2 = (n = Integer.rotateRight(bl ^ n, 4)) ^ 0x6914FC01;
        if ((n2 ^ n) != 1762982913) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x55DB2795 ^ n, 13) - 1776773702) * 1440425877;
            int cfr_ignored_1 = (int)(0x976989A827D4EB4FL ^ (long)n ^ 0xEE20831A2DB88302L);
        }
        bhn2_2.sby_2(bl);
    }

    private static boolean dhsd(tbdh tbdh2) {
        block0: {
            int n = tath.khal_2(607704686);
            tbdh tbdh3 = tbdh2;
            n = (tbdh3 != null ? System.identityHashCode(tbdh3) : 0) ^ n;
            int n2 = n ^ 0x458E9BDB;
            if ((n2 ^ n) == 1166973915) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x61B64DB5 ^ n, 15) - -646903770) * 1639337397;
            int cfr_ignored_1 = (int)(0xA304E38827D4EB4FL ^ (long)n ^ 0x3A60831A2DB8EBD8L);
        }
        return tbdh2.bzth();
    }

    private static void tsa_7(bhn_2 bhn2_2, boolean bl) {
        int n = -167173137;
        n = Integer.rotateLeft(n * 786640033, 21) ^ 0x83FB4734;
        bhn_2 bhn3 = bhn2_2;
        n = (bhn3 != null ? System.identityHashCode(bhn3) : 0) ^ n;
        int n2 = n ^ 0xC2460E4;
        if ((n2 ^ n) != 203710692) {
            int cfr_ignored_0 = (0xFA2D430B ^ n) + 609763980;
        }
        bhn2_2.sby_2(bl);
    }

    private static void shzdh(bqd_2 bqd2) {
        int n = -1922472697;
        int n2 = (n = Integer.rotateLeft(n * -1796714409, 3) ^ 0xBD82DF4E) ^ 0x5BE89111;
        if ((n2 ^ n) != 1541968145) {
            int cfr_ignored_0 = (0xD681F416 ^ n) + 830831130;
        }
        bqd2.jlth();
    }

    private static boolean rsl_2(khd khd2) {
        block0: {
            int n = 306408706;
            n = Integer.rotateLeft(n * 1921366823, 21) ^ 0x9E423A61;
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            int n2 = n ^ 0xA39C57D1;
            if ((n2 ^ n) == -1550034991) break block0;
            int cfr_ignored_0 = (0xB1DF3AD3 ^ n) - -1331897715;
        }
        return khd2.zsm_2();
    }

    private static void tzs_2(bjq bjq2, boolean bl) {
        int n = -143866925;
        n = Integer.rotateLeft(n * 804643235, 10) ^ 0xEA8ED110;
        bjq bjq3 = bjq2;
        n = Integer.rotateLeft((bjq3 != null ? System.identityHashCode(bjq3) : 0) ^ n, 20);
        int n2 = (n = Integer.rotateRight(bl ^ n, 11)) ^ 0x18C34139;
        if ((n2 ^ n) != 415449401) {
            int cfr_ignored_0 = (0xEFAF82EA ^ n) - -1081530937;
        }
        bjq2.jdt(bl);
    }

    private static void ghrr(aa_2 aa2, boolean bl) {
        int n = -873950991;
        n = Integer.rotateLeft(n * -1284134209, 15) ^ 0x371FA43F;
        int n2 = (n = bl ^ n) ^ 0xA29CFF8E;
        if ((n2 ^ n) != -1566769266) {
            int cfr_ignored_0 = (0x69746F7F ^ n) - -967702336;
        }
        aa2.dss_6(bl);
    }

    private static Object ghzl_2(Object object) {
        block0: {
            int n = 1770494185;
            int n2 = (n = Integer.rotateLeft(n * 729360529, 18) ^ 0x6204C0FE) ^ 0xF784F5B5;
            if ((n2 ^ n) == -142281291) break block0;
            int cfr_ignored_0 = (0x9E036D5C ^ n) - 1058525962;
        }
        return Objects.requireNonNull(object);
    }

    private static int dhwm(Integer n) {
        block0: {
            int n2 = -1414028803;
            n2 = Integer.rotateLeft(n2 * -802548165, 23) ^ 0xAA7F5DE;
            Integer n3 = n;
            n2 = Integer.rotateRight((n3 != null ? System.identityHashCode(n3) : 0) ^ n2, 3);
            int n4 = n2 ^ 0xDBC70122;
            if ((n4 ^ n2) == -607715038) break block0;
            int cfr_ignored_0 = (0x7070A0DF ^ n2) + 1127824685;
        }
        return n;
    }

    private static int dhmdh(int n) {
        block0: {
            int n2 = -1126354317;
            int n3 = (n2 = Integer.rotateLeft(n2 * -823278067, 4) ^ 0xDB8AAFFE) ^ 0x86B6A7D;
            if ((n3 ^ n2) == 141257341) break block0;
            int cfr_ignored_0 = (0xB4B6580E ^ n2) - -834672066;
        }
        return Integer.reverse(n);
    }

    private static String[] szkh_3(String string) {
        int n = tath.khal_2(-1505471901);
        int n2 = n ^ 0x7CAA9C91;
        if ((n2 ^ n) != 2091555985) {
            int cfr_ignored_0 = (Integer.rotateRight(0xDAEECEF2 ^ n, 14) + -2025279863) * -621883661;
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

    private static CallSite dhft_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1482221375;
            n3 = Integer.rotateLeft(n3 * -2035641355, 17) ^ 0xBA0FE6B8;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xE3CDF3B6;
            if ((n4 ^ n3) != -473041994) {
                int cfr_ignored_0 = (0x446AEB77 ^ n3) - 887218875;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dbq ^ string.hashCode() ^ n2 + sdsh_2 ^ i * -118470887 ^ dbq, 23) ^ sdsh_2));
            }
            String[] stringArray = ghw.szkh_3(new String(cArray));
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

    private static String[] rub0hhkaim5f(String string) {
        return string.split("\u0006\u000f", -1);
    }

    private static CallSite j48hjvb8s7qea(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pcb6aizdj5gth ^ string.hashCode() ^ n2 + jk3ew64cfbg3z + i * 1426825529) + pcb6aizdj5gth) ^ jk3ew64cfbg3z));
            }
            String[] stringArray = ghw.rub0hhkaim5f(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

