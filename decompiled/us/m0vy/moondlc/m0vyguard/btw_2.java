/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  org.lwjgl.glfw.GLFW
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import org.lwjgl.glfw.GLFW;
import us.m0vy.moondlc.m0vyguard.bthdh;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bdht_2;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.bzdh_2;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.ah_2;
import us.m0vy.moondlc.m0vyguard.ghkh;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class btw_2 {
    private static final int shlgh = 1756842441;
    private static final int dhbz = 208901134;
    private static final int shss_3 = 1640581331;
    private static final int jkm = -1825301885;
    private static final int edc7meklt5gpg = -168906979;
    private static final int jrbngrvya = -190132127;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int k3xy4dks2pjrwa;

    public bthn dts_3() {
        try {
            int n = 2018443432;
            n = Integer.rotateLeft(n * -2125237225, 6) ^ 0xEF78B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xE8B9A39C;
            if ((n2 ^ n) != -390487140) {
                int cfr_ignored_0 = (0x90F6A334 ^ n) - 1348422150;
            }
            if ((0x1A9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        List<String> list = Moondlc.getInstance().getModuleManager().rdhs().stream().map(btw_2::dna_3).toList();
        List list2 = this.zdhn_2();
        return btw_2.wdh(btw_2.bzl_2(btw_2.bfs("bind", btw_2::hzy_2), "action", btw_2::tht_8).dqdh_2("module", arg_0 -> btw_2.jaa(list, arg_0)).dqdh_2("key", arg_0 -> btw_2.tls_3(list2, arg_0)), this::zzkh_4).szy_2();
    }

    private void zzkh_4(bths_2 bths2) {
        int n = -772303064;
        n = Integer.rotateLeft(n * 1689628345, 22) ^ 0xD3019A1F;
        n = System.identityHashCode(this) ^ n;
        bths_2 bths3 = bths2;
        n = (bths3 != null ? System.identityHashCode(bths3) : 0) ^ n;
        int n2 = n ^ 0xF159DC7D;
        if ((n2 ^ n) != -245769091) {
            int cfr_ignored_0 = (0x20AE4B55 ^ n) - 819198560;
        }
        String string = (String)btw_2.zhd(bths2).getFirst();
        bsb bsb2 = (bsb)bths2.arguments().get(1);
        String string2 = (String)btw_2.dhdhl(bths2).get(2);
        if (string.equalsIgnoreCase("list")) {
            List<bsb> list = Moondlc.getInstance().getModuleManager().rdhs().stream().filter(btw_2::thr_4).toList();
            if (list.isEmpty()) {
                bzh_4.ttht_3(class_2561.method_30163((String)"Bind list i".concat("s empty")));
            } else {
                bzh_4.ttht_3(btw_2.asz_4("Bind list:"));
                for (int i = 0; i < list.size(); ++i) {
                    bsb bsb3 = list.get(i);
                    bzh_4.ttht_3(class_2561.method_30163((String)(btw_2.stk_4(class_124.field_1080) + "[" + (i + 1) + "] " + String.valueOf(class_124.field_1068) + bsb3.getName() + btw_2.tthz(class_124.field_1080) + " (" + bzdh_2.ddhn_2(bsb3.thaf()) + ")")));
                }
            }
        } else if (bsb2 == null) {
            btw_2.trz(class_2561.method_30163((String)"Module not specified"));
        } else if (!string.equalsIgnoreCase("add") && !btw_2.ghty(string, "create")) {
            if (string.equalsIgnoreCase("delete") || string.equalsIgnoreCase("remove")) {
                bsb2.zhs_5(-1);
                btw_2.sgha_3(btw_2.btht("Bind removed from module " + bsb2.getName()));
            }
        } else {
            if (string2 == null) {
                bzh_4.dhght_2(class_2561.method_30163((String)"Key not ".concat("specified")));
                return;
            }
            int n3 = this.zss_4(string2);
            if (n3 == -1) {
                btw_2.thsth(class_2561.method_30163((String)("Unknown key: " + string2)));
                return;
            }
            bsb2.zhs_5(n3);
            bzh_4.ttht_3(btw_2.shdl("Bind set to key " + bzdh_2.ddhn_2(n3)));
        }
    }

    private int zss_4(String string) {
        try {
            int n = -159087933;
            n = Integer.rotateLeft(n * -1767559043, 14) ^ 0x18C28F0C;
            int n2 = n ^ 0x6496CA75;
            if ((n2 ^ n) != 1687603829) {
                int cfr_ignored_0 = (0x921248B6 ^ n) - -1340417987;
            }
            if ((0x3C1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            btw_2.dyz_2();
        }
        if (string != null && !string.isBlank()) {
            string = string.toUpperCase(Locale.ROOT).replace(" ", btw_2.dml("몠", btw_2.sam_2(-1432187823) ^ 0xF1BD03FC, -408222173 + 1609458265, 0x60777E71 ^ 0xDC7A2967));
            try {
                return (Integer)GLFW.class.getField("GLFW_KEY_" + string).get(null);
            }
            catch (Exception exception) {
                return -1;
            }
        }
        return -1;
    }

    private List zdhn_2() {
        try {
            int n = -1555121824;
            n = Integer.rotateLeft(n * 804905257, 22) ^ 0x95581625;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8C3EF854;
            if ((n2 ^ n) != -1942030252) {
                int cfr_ignored_0 = (0x2F704134 ^ n) + -1216634495;
            }
            if ((0xFB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return Stream.of(btw_2.aww(GLFW.class)).map(Field::getName).filter(btw_2::dhff).map(btw_2::jsgh).filter(btw_2::ghas).collect(Collectors.toList());
    }

    private static boolean ghas(String string) {
        int n = -2090936726;
        n = Integer.rotateLeft(n * 889419557, 16) ^ 0xB651D52C;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
        int n2 = n ^ 0x3785DF35;
        if ((n2 ^ n) != 931520309) {
            int cfr_ignored_0 = (0xB4DB095F ^ n) + 1254413941;
        }
        return !string.matches("LAST|UNKNOWN".concat("|WORLD_\\d+"));
    }

    private static String jsgh(String string) {
        block0: {
            int n = -1989278797;
            int n2 = (n = Integer.rotateLeft(n * -1079119527, 28) ^ 0x8D629C51) ^ 0x8CE6C0E2;
            if ((n2 ^ n) == -1931034398) break block0;
            int cfr_ignored_0 = (0x588C351 ^ n) + -373342778;
        }
        return string.substring("GLFW_KEY_".length());
    }

    private static boolean dhff(String string) {
        block0: {
            int n = bthdh.tbh_4(-1538553118);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xD9E8886;
            if ((n2 ^ n) == 228493446) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA9D50264 ^ n, 8) - -1792480937;
        }
        return string.startsWith("GLFW_KEY_");
    }

    private static boolean thr_4(bsb bsb2) {
        int n = 1401698878;
        int n2 = (n = Integer.rotateLeft(n * 1977435919, 28) ^ 0xC64CF6C8) ^ 0x9C26F4AB;
        if ((n2 ^ n) != -1675168597) {
            int cfr_ignored_0 = (0xCFAACE95 ^ n) + -1190714278;
        }
        return bsb2.thaf() != -1;
    }

    private static void tls_3(List list, bsj bsj2) {
        int n = 884271412;
        n = Integer.rotateLeft(n * -1244437993, 22) ^ 0x57A28677;
        bsj bsj3 = bsj2;
        n = (bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n;
        int n2 = n ^ 0x8DC3FF06;
        if ((n2 ^ n) != -1916535034) {
            int cfr_ignored_0 = (0xB9771632 ^ n) - 228975483;
        }
        bsj2.tkn().tkk_2(btw_2::hjt_2).sldh(list);
    }

    private static ah_2 hjt_2(String string) {
        try {
            int n = 533537227;
            n = Integer.rotateLeft(n * -511110761, 24) ^ 0x942795E0;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 21);
            int n2 = n ^ 0x8B81BDA;
            if ((n2 ^ n) != 146283482) {
                int cfr_ignored_0 = (0x17753A11 ^ n) - 1186526066;
            }
            if ((0x251 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return (ah_2)((Object)(string.isBlank() ? ah_2.thsdh_2("key is".concat(" empty")) : ah_2.tsy(string)));
    }

    private static void jaa(List list, bsj bsj2) {
        int n = bthdh.tbh_4(462652881);
        bsj bsj3 = bsj2;
        n = (bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n;
        int n2 = n ^ 0xC29EBD5D;
        if ((n2 ^ n) != -1029784227) {
            int cfr_ignored_0 = Integer.rotateLeft(0xD90D388C ^ n, 14) - 1291286575;
        }
        bsj2.tkn().tkk_2(bsj.trz_2).sldh(list);
    }

    /*
     * Unable to fully structure code
     */
    private static void tht_8(bsj var0) {
        var3_1 = 0;
        var1_2 = 1539318831;
        var1_2 = Integer.rotateLeft(var1_2 * 1878754879, 12) ^ -220500418;
        v0 = var0;
        var1_2 = Integer.rotateRight((v0 != null ? System.identityHashCode(v0) : 0) ^ var1_2, 10);
        var2_3 = -1558983207 * 208022539 + -1912167656 ^ var1_2;
        while (true) {
            block36: {
                block34: {
                    block28: {
                        block35: {
                            block31: {
                                block29: {
                                    block30: {
                                        block33: {
                                            block37: {
                                                block27: {
                                                    block26: {
                                                        block32: {
                                                            var3_1 = ((var2_3 ^ var1_2) - -1912167656) * 404357027;
                                                            switch (var3_1 & 7) {
                                                                case 0: {
                                                                    if (var3_1 == -1407571088) break block26;
                                                                    if (var3_1 == -498555040) break block27;
                                                                    (Integer.rotateLeft(446153365 ^ var1_2, 6) - 1019096902) * 446153365;
                                                                    (int)(-2871769717900252337L ^ (long)var1_2 ^ 2603224733079575963L);
                                                                    if (var3_1 != 1217161736) {
                                                                        ** break;
                                                                    }
                                                                    break block28;
                                                                }
                                                                case 1: {
                                                                    if (var3_1 == 1802423313) break block29;
                                                                    if (var3_1 == -1650617415) break block30;
                                                                    (Integer.rotateLeft(-1942319651 ^ var1_2, 4) - -9122562) * -1942319651;
                                                                    (int)(5658812377438939983L ^ (long)var1_2 ^ -4994347838294380351L);
                                                                    if (var3_1 == -366249199) break block31;
                                                                    if (var3_1 != -1558983207) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 2: {
                                                                    if (var3_1 != 866216378) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 == -1419523268) break block34;
                                                                    if (var3_1 == -1207740476) break;
                                                                    Integer.rotateLeft(1590493709 ^ var1_2, 14) - 2133909198;
                                                                    (int)(-7169822758923867313L ^ (long)var1_2 ^ -6552593309364611794L);
                                                                    if (var3_1 != 1173780412) {
                                                                        ** break;
                                                                    }
                                                                    break block35;
                                                                }
                                                                case 5: {
                                                                    if (var3_1 != -1932256467) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 7: {
                                                                    if (var3_1 != 1106611015) {
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                            }
                                                            Integer.rotateLeft(-1466914300 ^ var1_2, 8) - 1843541431;
                                                            yf.athz_2();
                                                            throw null;
                                                        }
                                                        Integer.rotateRight(-1098968562 ^ var1_2, 10) - 364957421;
                                                        if (yf.khdha_2()) {
                                                            try {
                                                                var3_1 -= 3;
                                                                if ((8955254991831999417L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var2_3 = (-1407571088 * 208022539 + -1912167656 ^ var1_2) + 1431079651 - 1431079651;
                                                            }
                                                            catch (NoSuchElementException v1) {
                                                                var2_3 = -1407571088 * 208022539 + -1912167656 ^ var1_2 ^ -1532260179 ^ -1532260179;
                                                            }
                                                            var3_1 += 4;
                                                            continue;
                                                        }
                                                        var2_3 = 825657479 * 208022539 + -1912167656 ^ var1_2 ^ -1742247288 ^ -1742247288;
                                                        (Integer.rotateRight(-324565961 ^ var1_2, 16) - -1398365724) * -324565961;
                                                        var2_3 = (-1207740476 * 208022539 + -1912167656 ^ var1_2) + -665475392 - -665475392;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(1468248044 ^ var1_2, 13) - -1655706417;
                                                    var0.dby_2(new String[]{"add", "delete", "remove", "create", "list"});
                                                    return;
                                                }
                                                Integer.rotateRight(1737093806 ^ var1_2, 15) - -1911422387;
                                                var2_3 = (943904445 * 208022539 + -1912167656 ^ var1_2) + 1948951257 - 1948951257;
                                                (Integer.rotateLeft(-631819459 ^ var1_2, 14) - 1961677726) * -631819459;
                                                (int)(1794012650570836815L ^ (long)var1_2 ^ -4075613514310771686L);
                                                var2_3 = (int)((long)(-1558983207 * 208022539 + -1912167656 ^ var1_2) ^ -6461242276091962247L ^ -6461242276091962247L);
                                                var3_1 += 3;
                                                continue;
                                            }
                                            Integer.rotateRight(-1415104209 ^ var1_2, 8) - -845313044;
                                            var2_3 = (-341069235 * 208022539 + -1912167656 ^ var1_2) + -1973447592 - -1973447592;
                                            Integer.rotateLeft(506368101 ^ var1_2, 6) - -1409213578;
                                            (int)(-2550094740652233905L ^ (long)var1_2 ^ -9097127098828974871L);
                                            try {
                                                var3_1 -= 2;
                                                var2_3 = (-1558983207 * 208022539 + -1912167656 ^ var1_2) + 1849032756 - 1849032756;
                                            }
                                            catch (ArithmeticException v2) {
                                                var2_3 = -1558983207 * 208022539 + -1912167656 ^ var1_2;
                                            }
                                            continue;
                                        }
                                        Integer.rotateRight(-64951834 ^ var1_2, 18) - -1940262379;
                                        var2_3 = Integer.reverse(Integer.reverse(469003045 * 208022539 + -1912167656 ^ var1_2));
                                        Integer.rotateRight(-1452596885 ^ var1_2, 8) + -2007586000;
                                        var2_3 = (int)((long)(-1558983207 * 208022539 + -1912167656 ^ var1_2) ^ -27906356457473089L ^ -27906356457473089L);
                                        var3_1 -= 2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(2021234644 ^ var1_2, 18) - -1692991001) * 2021234645;
                                    (int)(-9023712215921938741L ^ (long)var1_2 ^ 6226773554800666715L);
                                    var2_3 = (int)((long)(-1464787427 * 208022539 + -1912167656 ^ var1_2) ^ -9016687335735152341L ^ -9016687335735152341L);
                                    (int)(-5876526970652916598L ^ (long)var1_2 ^ 4523090420656435509L);
                                    var2_3 = (int)((long)(-1558983207 * 208022539 + -1912167656 ^ var1_2) ^ -2552672275177415664L ^ -2552672275177415664L);
                                    var3_1 += 3;
                                    continue;
                                }
                                Integer.rotateRight(264630339 ^ var1_2, 4) + -313149608;
                                try {
                                    var3_1 += 4;
                                    var2_3 = Integer.reverse(Integer.reverse(-1558983207 * 208022539 + -1912167656 ^ var1_2));
                                }
                                catch (IllegalArgumentException v3) {
                                    var2_3 = (-1558983207 * 208022539 + -1912167656 ^ var1_2) + -396581842 - -396581842;
                                }
                                var3_1 -= 2;
                                continue;
                            }
                            Integer.rotateRight(-664993298 ^ var1_2, 14) - 933288717;
                            try {
                                var3_1 -= 4;
                                if ((670593854360029837L ^ (long)var1_2 | 1L) == 0L) {
                                    throw new ArithmeticException();
                                }
                                var2_3 = -1558983207 * 208022539 + -1912167656 ^ var1_2;
                            }
                            catch (ArithmeticException v4) {
                                var2_3 = -1558983207 * 208022539 + -1912167656 ^ var1_2 ^ 1702089065 ^ 1702089065;
                            }
                            continue;
                        }
                        Integer.rotateLeft(1422141676 ^ var1_2, 13) - 1209963471;
                        var2_3 = Integer.reverse(Integer.reverse(-525164745 * 208022539 + -1912167656 ^ var1_2));
                        Integer.rotateRight(1502695726 ^ var1_2, 14) - -587828275;
                        (int)(-5104641933820260614L ^ (long)var1_2 ^ -6117833764252754048L);
                        var2_3 = 931837381 * 208022539 + -1912167656 ^ var1_2;
                        (int)(2293243322633467827L ^ (long)var1_2 ^ -8917841366738693513L);
                        var2_3 = -1558983207 * 208022539 + -1912167656 ^ var1_2;
                        ++var3_1;
                        continue;
                    }
                    Integer.rotateLeft(65733896 ^ var1_2, 3) + 2110995251;
                    (int)(7725297122625408157L ^ (long)var1_2 ^ 8424608095398624186L);
                    var2_3 = 1245969773 * 208022539 + -1912167656 ^ var1_2;
                    (int)(4890111425416351526L ^ (long)var1_2 ^ -6220108005872293269L);
                    var2_3 = Integer.reverse(Integer.reverse(-1558983207 * 208022539 + -1912167656 ^ var1_2));
                    var3_1 += 2;
                    continue;
                }
                Integer.rotateRight(2111728331 ^ var1_2, 18) + 1112313296;
                var2_3 = 195183420 * 208022539 + -1912167656 ^ var1_2 ^ 1529371269 ^ 1529371269;
                (Integer.rotateLeft(413430384 ^ var1_2, 6) + 4684491) * 413430385;
                (int)(-5001340631595973482L ^ (long)var1_2 ^ -6119277749249320706L);
                var2_3 = Integer.reverse(Integer.reverse(-1558983207 * 208022539 + -1912167656 ^ var1_2));
                continue;
            }
            (Integer.rotateRight(430089819 ^ var1_2, 6) + 521126976) * 430089819;
            var2_3 = 915416111 * 208022539 + -1912167656 ^ var1_2 ^ -1565598700 ^ -1565598700;
            (Integer.rotateLeft(-877232527 ^ var1_2, 12) + -1351160086) * -877232527;
            (int)(649873271752551247L ^ (long)var1_2 ^ 6766802588583706584L);
            (int)(-5505767261544525861L ^ (long)var1_2 ^ -2971931687118648578L);
            var2_3 = (2106911130 * 208022539 + -1912167656 ^ var1_2) + 324695703 - 324695703;
            (int)(-687723503282075550L ^ (long)var1_2 ^ -7832627346465996488L);
            var2_3 = -1558983207 * 208022539 + -1912167656 ^ var1_2;
            var3_1 += 5;
            continue;
lbl202:
            // 7 sources

            (Integer.rotateLeft(-792994703 ^ var1_2, 13) + 1260212458) * -792994703;
            (int)(1299695638884445007L ^ (long)var1_2 ^ 1866886194004593091L);
            var2_3 = -1558983207 * 208022539 + -1912167656 ^ var1_2 ^ 535447947 ^ 535447947;
        }
    }

    private static void hzy_2(bdht_2 bdht2) {
        try {
            int n = 1879691994;
            n = Integer.rotateLeft(n * -836597201, 9) ^ 0xDA8CDD66;
            int n2 = n ^ 0x4F610137;
            if ((n2 ^ n) != 1331757367) {
                int cfr_ignored_0 = (0x3F68D3ED ^ n) - -260488619;
            }
            if ((0x228 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        bdht2.bkhd("binds").brsh("Bind a module".concat(" to a key"));
    }

    private static String dna_3(bsb bsb2) {
        block0: {
            int n = -1807850649;
            n = Integer.rotateLeft(n * -858497359, 14) ^ 0x23FB3CAD;
            bsb bsb3 = bsb2;
            n = Integer.rotateLeft((bsb3 != null ? System.identityHashCode(bsb3) : 0) ^ n, 21);
            int n2 = n ^ 0x1F8F8863;
            if ((n2 ^ n) == 529500259) break block0;
            int cfr_ignored_0 = (0x8BB1EB04 ^ n) + 2087131320;
        }
        return bsb2.getName().replace(" ", "");
    }

    private static String dml(String string, int n, int n2, int n3) {
        int n4 = 748814881;
        n4 = Integer.rotateLeft(n4 * 689904189, 25) ^ 0x2E54ACBE;
        int n5 = (n4 = n ^ n4) ^ 0x6EAD2C6;
        if ((n5 ^ n4) != 116052678) {
            int cfr_ignored_0 = (0x2A48D0E7 ^ n4) - -1649558174;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xDCD2AB77 ^ n2 - i) + dhbz, 5) ^ shlgh + i * -46875665));
        }
        return new String(cArray);
    }

    private static bdht_2 bfs(String string, Consumer consumer) {
        block0: {
            int n = -222385426;
            n = Integer.rotateLeft(n * 250505991, 21) ^ 0xA501BA7C;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 14);
            Consumer consumer2 = consumer;
            n = Integer.rotateRight((consumer2 != null ? System.identityHashCode(consumer2) : 0) ^ n, 5);
            int n2 = n ^ 0x3D115253;
            if ((n2 ^ n) == 1024545363) break block0;
            int cfr_ignored_0 = (0xCFAFF8BD ^ n) - -1238631499;
        }
        return bdht_2.jngh(string, consumer);
    }

    private static String dzm_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2039774877;
            n4 = Integer.rotateLeft(n4 * 1068923613, 13) ^ 0x5BF095EE;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 12)) ^ 0x478EECEA;
            if ((n5 ^ n4) == 1200549098) break block0;
            int cfr_ignored_0 = (0xC1E56D89 ^ n4) - 218499200;
        }
        return btw_2.dml(string, n, n2, n3);
    }

    private static bdht_2 bzl_2(bdht_2 bdht2, String string, Consumer consumer) {
        block0: {
            int n = 1057377611;
            n = Integer.rotateLeft(n * 987088155, 6) ^ 0xDA0BB858;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x31213863;
            if ((n2 ^ n) == 824260707) break block0;
            int cfr_ignored_0 = (0xE277528 ^ n) - -170480157;
        }
        return bdht2.dqdh_2(string, consumer);
    }

    private static bdht_2 wdh(bdht_2 bdht2, ghkh ghkh2) {
        block0: {
            int n = -2068296990;
            n = Integer.rotateLeft(n * -2091681245, 17) ^ 0x679032DE;
            bdht_2 bdht3 = bdht2;
            n = Integer.rotateRight((bdht3 != null ? System.identityHashCode(bdht3) : 0) ^ n, 24);
            ghkh ghkh3 = ghkh2;
            n = Integer.rotateLeft((ghkh3 != null ? System.identityHashCode(ghkh3) : 0) ^ n, 29);
            int n2 = n ^ 0xE2B15093;
            if ((n2 ^ n) == -491695981) break block0;
            int cfr_ignored_0 = (0x66091A71 ^ n) - 947960423;
        }
        return bdht2.jmz(ghkh2);
    }

    private static List zhd(bths_2 bths2) {
        block0: {
            int n = 151867466;
            int n2 = (n = Integer.rotateLeft(n * 456920303, 15) ^ 0x91EFA4CE) ^ 0x466E6FCA;
            if ((n2 ^ n) == 1181642698) break block0;
            int cfr_ignored_0 = (0x4F633F80 ^ n) + 285522182;
        }
        return bths2.arguments();
    }

    private static List dhdhl(bths_2 bths2) {
        block0: {
            int n = -627995049;
            int n2 = (n = Integer.rotateLeft(n * -454588547, 10) ^ 0xB38995BA) ^ 0xDD40F26F;
            if ((n2 ^ n) == -582946193) break block0;
            int cfr_ignored_0 = (0x7D17C38 ^ n) - 1612158394;
        }
        return bths2.arguments();
    }

    private static class_2561 asz_4(String string) {
        block0: {
            int n = 1378525764;
            n = Integer.rotateLeft(n * -737978113, 20) ^ 0x12F6AB2F;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
            int n2 = n ^ 0x9155CCC0;
            if ((n2 ^ n) == -1856648000) break block0;
            int cfr_ignored_0 = (0xC37F6E84 ^ n) - -1255173173;
        }
        return class_2561.method_30163((String)string);
    }

    private static String stk_4(Object object) {
        block0: {
            int n = bthdh.tbh_4(166217786);
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 14);
            int n2 = n ^ 0xEB9BB9EC;
            if ((n2 ^ n) == -342115860) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE273F1D6 ^ n, 15) - 1885857829) * -495717929;
        }
        return String.valueOf(object);
    }

    private static String tthz(Object object) {
        block0: {
            int n = -297744618;
            int n2 = (n = Integer.rotateLeft(n * -1639002765, 16) ^ 0x276B6B4C) ^ 0x2F5E2E75;
            if ((n2 ^ n) == 794701429) break block0;
            int cfr_ignored_0 = (0xC11EE963 ^ n) + 1233664009;
        }
        return String.valueOf(object);
    }

    private static void trz(class_2561 class_25612) {
        int n = -301294533;
        int n2 = (n = Integer.rotateLeft(n * 111251669, 25) ^ 0x45F17516) ^ 0x9F22BACF;
        if ((n2 ^ n) != -1625113905) {
            int cfr_ignored_0 = (0x712826F4 ^ n) - -440151683;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static String tjd_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1565410362;
            n4 = Integer.rotateLeft(n4 * -2085809983, 10) ^ 0x2781FC7D;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 28);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 13)) ^ 0xFA3EF81D;
            if ((n5 ^ n4) == -96536547) break block0;
            int cfr_ignored_0 = (0x588F43DB ^ n4) - -1589551246;
        }
        return btw_2.dml(string, n, n2, n3);
    }

    private static boolean ghty(String string, String string2) {
        block0: {
            int n = 50377793;
            n = Integer.rotateLeft(n * -1490017991, 26) ^ 0x7074BE30;
            String string3 = string2;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 12);
            int n2 = n ^ 0xD861F265;
            if ((n2 ^ n) == -664669595) break block0;
            int cfr_ignored_0 = (0xDB614624 ^ n) - 362732257;
        }
        return string.equalsIgnoreCase(string2);
    }

    private static class_2561 btht(String string) {
        block0: {
            int n = 629004145;
            int n2 = (n = Integer.rotateLeft(n * 761745325, 28) ^ 0xCB5C0C9A) ^ 0xFFFE9A28;
            if ((n2 ^ n) == -91608) break block0;
            int cfr_ignored_0 = (0xDA834D59 ^ n) + 1119356679;
        }
        return class_2561.method_30163((String)string);
    }

    private static void sgha_3(class_2561 class_25612) {
        int n = bthdh.tbh_4(1271005941);
        int n2 = n ^ 0x1AE1FAB1;
        if ((n2 ^ n) != 451017393) {
            int cfr_ignored_0 = Integer.rotateLeft(0x5123F844 ^ n, 13) - -675762313;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static String tha(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1459891566;
            n4 = Integer.rotateLeft(n4 * 158609285, 4) ^ 0x95AAAA02;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 29);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 14)) ^ 0x16751B6C;
            if ((n5 ^ n4) == 376773484) break block0;
            int cfr_ignored_0 = (0x41713602 ^ n4) + 1016292946;
        }
        return btw_2.dml(string, n, n2, n3);
    }

    private static void thsth(class_2561 class_25612) {
        int n = -48628199;
        int n2 = (n = Integer.rotateLeft(n * 1143425949, 19) ^ 0x5B467854) ^ 0xCCE1330B;
        if ((n2 ^ n) != -857656565) {
            int cfr_ignored_0 = (0x31F8CD12 ^ n) + -392498565;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static class_2561 shdl(String string) {
        block0: {
            int n = -1094725448;
            int n2 = (n = Integer.rotateLeft(n * 518197783, 3) ^ 0xE58934D1) ^ 0x3D6C4369;
            if ((n2 ^ n) == 1030505321) break block0;
            int cfr_ignored_0 = (0x83D393D1 ^ n) + -1343799333;
        }
        return class_2561.method_30163((String)string);
    }

    private static void dyz_2() {
        int n = bthdh.tbh_4(-328979507);
        int n2 = n ^ 0xCDD74FE2;
        if ((n2 ^ n) != -841527326) {
            int cfr_ignored_0 = Integer.rotateRight(0x21B3642F ^ n, 7) - 420921580;
        }
        yf.athz_2();
    }

    private static String tdn_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bthdh.tbh_4(-1764305497);
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xFB69588B;
            if ((n5 ^ n4) == -76982133) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6DBF8D2C ^ n4, 16) - 1318041487;
        }
        return btw_2.dml(string, n, n2, n3);
    }

    private static int sam_2(int n) {
        block0: {
            int n2 = 2102072417;
            n2 = Integer.rotateLeft(n2 * 589185207, 4) ^ 0x4A55A9C9;
            int n3 = (n2 = n ^ n2) ^ 0x2EEBE328;
            if ((n3 ^ n2) == 787211048) break block0;
            int cfr_ignored_0 = (0x53A0F749 ^ n2) - 195579847;
        }
        return Integer.reverse(n);
    }

    private static Field[] aww(Class clazz) {
        block0: {
            int n = bthdh.tbh_4(-1295933128);
            Class clazz2 = clazz;
            n = (clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n;
            int n2 = n ^ 0xDEE55096;
            if ((n2 ^ n) == -555396970) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6C24F1AE ^ n, 16) - 483844941;
        }
        return clazz.getFields();
    }

    private static String[] dhydh(String string) {
        int n = 147801001;
        int n2 = (n = Integer.rotateLeft(n * -1443586095, 7) ^ 0x3B02F86) ^ 0x549D538F;
        if ((n2 ^ n) != 1419596687) {
            int cfr_ignored_0 = (0x5C521026 ^ n) - -256132640;
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

    private static CallSite hws_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1854824221;
            n3 = Integer.rotateLeft(n3 * 1700254055, 16) ^ 0xF738C9D0;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0x59B9E450;
            if ((n4 ^ n3) != 1505354832) {
                int cfr_ignored_0 = (0xC8C844B3 ^ n3) - 1970734232;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shss_3 ^ string.hashCode()) + (n2 + jkm) + i ^ shss_3, 15) + jkm);
            }
            String[] stringArray = btw_2.dhydh(new String(cArray));
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

    private static String[] a9kk5ond(String string) {
        return string.split("\u0003\u0017", -1);
    }

    private static CallSite kg99l9yx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ edc7meklt5gpg ^ string.hashCode()) + (n2 + jrbngrvya) + i ^ edc7meklt5gpg, 7) + jrbngrvya);
            }
            String[] stringArray = btw_2.a9kk5ond(new String(cArray));
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

