/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_243
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_243;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthf;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tkhy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;

@tq_2(name="Jesus", category=bzw.OTHER, desc="Walk on water and lava")
public class bghkh
extends bnq {
    private static final float shdsh_2 = 0.44f;
    private final khd sqr = new khd(this, "Mode");
    private final fy dhghw = new fy(this.sqr, "Solid");
    private final fy zjz_2 = new fy(this.sqr, "Dolphin");
    private final fy khq = new fy(this.sqr, "Bounce");
    private final fy dr = new fy(this.sqr, "MetaHvH");
    private final bql<btt> zth_5 = this::aad_3;
    private static final int dhmf = 213388326;
    private static final int zjr = 259506200;
    private static final int zkhgh = -1244008461;
    private static final int rqd = -278814744;
    private static final int wry60pwprkr7 = 339849430;
    private static final int i9rmruk86rp = -504291154;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int y8894535hd73;

    private void shrs() {
        int n = -1947723508;
        n = Integer.rotateLeft(n * 1862370375, 5) ^ 0xA4FD8E2D;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0x2B8C4114;
        if ((n2 ^ n) != 730611988) {
            int cfr_ignored_0 = (0xA0645818 ^ n) + 1175933565;
        }
        if (bghkh.mc.field_1724 == null || !bghkh.mc.field_1724.method_5799() && !bghkh.mc.field_1724.method_5771()) {
            return;
        }
        class_1293 class_12932 = bghkh.mc.field_1724.method_6112(class_1294.field_5904);
        class_1293 class_12933 = bghkh.mc.field_1724.method_6112(class_1294.field_5909);
        String string = bghkh.mc.field_1724.method_6079().method_7964().getString();
        float f = bghkh.jqs_2(this, string) && class_12932 != null && bghkh.brt(class_12932) == 2 ? Float.intBitsToFloat(Integer.reverse(-603389614) ^ 0x747CBEE0) : (class_12932 != null ? (class_12932.method_5578() == 2 ? Float.intBitsToFloat(-286879265 - -1343944536) : (bghkh.sthth_2(class_12932) == 1 ? bghkh.sht_7(Integer.reverse(244054890) ^ 0x683E96DE) : Float.intBitsToFloat(-1103271258 + -2136744696) * (1.0f + Float.intBitsToFloat(-436644544 - -1473476493) * (float)(class_12932.method_5578() + 1)))) : Float.intBitsToFloat(0x2C6DFF11 ^ 0x12F4CFAF));
        if (class_12933 != null) {
            f *= Float.intBitsToFloat(Integer.reverse(-264556215) ^ 0xADD54595);
        }
        bghkh.jys_2(f);
        if (!bthf.dhst_2()) {
            bghkh.mc.field_1724.method_18800(0.0, bghkh.mc.field_1724.method_18798().field_1351, 0.0);
        }
        bghkh.khhsh(bghkh.mc.field_1724, bghkh.rls((class_746)bghkh.mc.field_1724).field_1352, bghkh.mc.field_1690.field_1903.method_1434() ? bghkh.rkj(0x2F95F84AB1487BADL ^ 0x10068CF6DB368276L) : Double.longBitsToDouble(0x57B337A3A5FF432EL ^ 0x68DBA4D719953DD4L), bghkh.dhaa_4((class_746)bghkh.mc.field_1724).field_1350);
    }

    private boolean znh_3(String string) {
        int n = -2036814843;
        int n2 = (n = Integer.rotateLeft(n * -1334904289, 7) ^ 0xB5D75B33) ^ 0xC9C7A846;
        if ((n2 ^ n) != -909662138) {
            int cfr_ignored_0 = (0x4F5F0443 ^ n) + -471881096;
        }
        return string.contains("Melon") || string.contains("Slice") || bghkh.zkdh_2(string, "\u041b\u043e\u043c\u0442\u0438\u043a \u0414\u044b\u043d\u0438");
    }

    /*
     * Unable to fully structure code
     */
    private void aad_3(btt var1_1) {
        var4_2 = 0;
        var2_3 = -1951598463;
        var2_3 = Integer.rotateLeft(var2_3 * 1913967955, 4) ^ 1018621616;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 28);
        v0 = var1_1;
        var2_3 = Integer.rotateRight((v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3, 10);
        var3_4 = 1924821373 * -412166273 + -1927864830 ^ var2_3 ^ 848060561 ^ 848060561;
        while (true) {
            block79: {
                block68: {
                    block81: {
                        block72: {
                            block66: {
                                block74: {
                                    block86: {
                                        block65: {
                                            block83: {
                                                block71: {
                                                    block70: {
                                                        block84: {
                                                            block67: {
                                                                block80: {
                                                                    block69: {
                                                                        block82: {
                                                                            block73: {
                                                                                block85: {
                                                                                    block76: {
                                                                                        block77: {
                                                                                            block78: {
                                                                                                block75: {
                                                                                                    var4_2 = ((var3_4 ^ var2_3) - -1927864830) * 1598613631;
                                                                                                    switch (var4_2 & 15) {
                                                                                                        case 1: {
                                                                                                            if (var4_2 != 1062965937) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block65;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (var4_2 == 776383378) break block66;
                                                                                                            if (var4_2 == 419924850) break block67;
                                                                                                            (Integer.rotateLeft(558894101 ^ var2_3, 7) - 219092422) * 558894101;
                                                                                                            (int)(-2025878589012645041L ^ (long)var2_3 ^ -5106937828978693612L);
                                                                                                            if (var4_2 != -1481393086) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block68;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            if (var4_2 != 470664707) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block69;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            if (var4_2 != -2060584156) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block70;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            if (var4_2 == 283454597) break block71;
                                                                                                            if (var4_2 != 2020547589) {
                                                                                                                Integer.rotateRight(282588463 ^ var2_3, 5) - 243552236;
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block72;
                                                                                                        }
                                                                                                        case 6: {
                                                                                                            if (var4_2 != -1977143754) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block73;
                                                                                                        }
                                                                                                        case 8: {
                                                                                                            if (var4_2 == -1657041896) break block74;
                                                                                                            if (var4_2 != 508120216) {
                                                                                                                (Integer.rotateLeft(-1775381483 ^ var2_3, 5) - 870993350) * -1775381483;
                                                                                                                (int)(6097726733368486735L ^ (long)var2_3 ^ 657669694055580911L);
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block75;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            if (var4_2 == -67188119) break block76;
                                                                                                            if (var4_2 != -450407959) {
                                                                                                                (Integer.rotateRight(2144418259 ^ var2_3, 18) + 2125701064) * 2144418259;
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block77;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            if (var4_2 != -194431622) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block78;
                                                                                                        }
                                                                                                        case 11: {
                                                                                                            if (var4_2 == 541603899) break block79;
                                                                                                            if (var4_2 != 446763019) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block80;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            if (var4_2 != 881715580) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block81;
                                                                                                        }
                                                                                                        case 13: {
                                                                                                            if (var4_2 == 1924821373) break;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            if (var4_2 != -330157394) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block82;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            if (var4_2 == 978293087) break block83;
                                                                                                            if (var4_2 == 314985743) break block84;
                                                                                                            if (var4_2 == 2140457647) break block85;
                                                                                                            if (var4_2 != 504439855) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block86;
                                                                                                        }
                                                                                                    }
                                                                                                    Integer.rotateLeft(-622833308 ^ var2_3, 14) - -2054718889;
                                                                                                    if (bghkh.mc.field_1724 != null) {
                                                                                                        try {
                                                                                                            var4_2 += 3;
                                                                                                            var3_4 = (-330157394 * -412166273 + -1927864830 ^ var2_3) + -1051341908 - -1051341908;
                                                                                                        }
                                                                                                        catch (NoSuchElementException v1) {
                                                                                                            var3_4 = Integer.reverse(Integer.reverse(-330157394 * -412166273 + -1927864830 ^ var2_3));
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        ++var4_2;
                                                                                                        if ((1955786528978478043L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                            throw new IllegalArgumentException();
                                                                                                        }
                                                                                                        var3_4 = Integer.reverse(Integer.reverse(508120216 * -412166273 + -1927864830 ^ var2_3));
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v2) {
                                                                                                        var3_4 = 508120216 * -412166273 + -1927864830 ^ var2_3 ^ 1405910453 ^ 1405910453;
                                                                                                    }
                                                                                                    var4_2 += 4;
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateLeft(-1224124571 ^ var2_3, 9) - 780088438;
                                                                                                (int)(8483648480103164751L ^ (long)var2_3 ^ 1135051254556870310L);
                                                                                                return;
                                                                                            }
                                                                                            Integer.rotateLeft(844154760 ^ var2_3, 9) + 472238259;
                                                                                            return;
                                                                                        }
                                                                                        Integer.rotateRight(-242068978 ^ var2_3, 17) - 1159040749;
                                                                                        if (!bghkh.mc.field_1724.method_5869()) {
                                                                                            (int)(-2702622823855484577L ^ (long)var2_3 ^ 5244565761134434605L);
                                                                                            var3_4 = Integer.reverse(Integer.reverse(446763019 * -412166273 + -1927864830 ^ var2_3));
                                                                                            var4_2 -= 5;
                                                                                            continue;
                                                                                        }
                                                                                        var3_4 = -194431622 * -412166273 + -1927864830 ^ var2_3 ^ 1356447171 ^ 1356447171;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateRight(2038813559 ^ var2_3, 18) - -1148044636) * 2038813559;
                                                                                    if (this.dhghw.shghkh()) {
                                                                                        var3_4 = -1977143754 * -412166273 + -1927864830 ^ var2_3 ^ 794161633 ^ 794161633;
                                                                                        var4_2 += 3;
                                                                                        continue;
                                                                                    }
                                                                                    var3_4 = (int)((long)(-1076139490 * -412166273 + -1927864830 ^ var2_3) ^ -5269200236462748644L ^ -5269200236462748644L);
                                                                                    (Integer.rotateLeft(-1734271112 ^ var2_3, 6) + 2145414851) * -1734271111;
                                                                                    var3_4 = -194431622 * -412166273 + -1927864830 ^ var2_3 ^ 508681521 ^ 508681521;
                                                                                    var4_2 -= 5;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(53197942 ^ var2_3, 3) - 1722380677) * 53197943;
                                                                                if (bghkh.mc.field_1724.method_5799()) {
                                                                                    var3_4 = (-54349920 * -412166273 + -1927864830 ^ var2_3) + 444524821 - 444524821;
                                                                                    (Integer.rotateRight(-1271292865 ^ var2_3, 9) - -682128676) * -1271292865;
                                                                                    var3_4 = -450407959 * -412166273 + -1927864830 ^ var2_3 ^ 1567318028 ^ 1567318028;
                                                                                    continue;
                                                                                }
                                                                                var3_4 = (int)((long)(658643570 * -412166273 + -1927864830 ^ var2_3) ^ 6996035040442861231L ^ 6996035040442861231L);
                                                                                Integer.rotateRight(1502700714 ^ var2_3, 14) + -587673647;
                                                                                var3_4 = (int)((long)(-194431622 * -412166273 + -1927864830 ^ var2_3) ^ 6115256243326437070L ^ 6115256243326437070L);
                                                                                --var4_2;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(451966273 ^ var2_3, 6) + 1199297050;
                                                                            (int)(-2863485086763521201L ^ (long)var2_3 ^ 5442744298136673620L);
                                                                            if (bghkh.mc.field_1724.method_5799()) {
                                                                                try {
                                                                                    if ((6872631992685719291L ^ (long)var2_3 | 1L) == 0L) {
                                                                                        throw new NoSuchElementException();
                                                                                    }
                                                                                    var3_4 = (-450407959 * -412166273 + -1927864830 ^ var2_3) + 991390043 - 991390043;
                                                                                }
                                                                                catch (NoSuchElementException v3) {
                                                                                    var3_4 = -450407959 * -412166273 + -1927864830 ^ var2_3;
                                                                                }
                                                                                var4_2 -= 2;
                                                                                continue;
                                                                            }
                                                                            var3_4 = (int)((long)(513145785 * -412166273 + -1927864830 ^ var2_3) ^ 7982975406848346157L ^ 7982975406848346157L);
                                                                            (Integer.rotateRight(1506012371 ^ var2_3, 14) + -485012280) * 1506012371;
                                                                            var3_4 = (-194431622 * -412166273 + -1927864830 ^ var2_3) + -622033119 - -622033119;
                                                                            var4_2 += 4;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(-850644975 ^ var2_3, 12) + -526945974) * -850644975;
                                                                        (int)(1152532467137440591L ^ (long)var2_3 ^ -4528225276861500884L);
                                                                        if (this.dr.shghkh()) {
                                                                            (int)(-7391591450009185134L ^ (long)var2_3 ^ 7497066717366099718L);
                                                                            var3_4 = 470664707 * -412166273 + -1927864830 ^ var2_3 ^ -587430803 ^ -587430803;
                                                                            var4_2 += 4;
                                                                            continue;
                                                                        }
                                                                        var3_4 = Integer.reverse(Integer.reverse(-1659944343 * -412166273 + -1927864830 ^ var2_3));
                                                                        Integer.rotateLeft(1297306560 ^ var2_3, 12) + 1635042171;
                                                                        var3_4 = -67188119 * -412166273 + -1927864830 ^ var2_3;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(-721871666 ^ var2_3, 13) - -829940691;
                                                                    this.shrs();
                                                                    return;
                                                                }
                                                                Integer.rotateRight(1696308650 ^ var2_3, 15) + 1119205073;
                                                                bghkh.mc.field_1724.method_18800(bghkh.mc.field_1724.method_18798().field_1352, Double.longBitsToDouble(4272447555087140177L ^ 356718902361529547L), bghkh.mc.field_1724.method_18798().field_1350);
                                                                (int)(-4854704264667332981L ^ (long)var2_3 ^ -4822702743738067824L);
                                                                var3_4 = (1320174146 * -412166273 + -1927864830 ^ var2_3) + -1111769372 - -1111769372;
                                                                (int)(-8928328889657379584L ^ (long)var2_3 ^ -7697935401911671327L);
                                                                var3_4 = (-194431622 * -412166273 + -1927864830 ^ var2_3) + 1627519405 - 1627519405;
                                                                var4_2 -= 2;
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(782304535 ^ var2_3, 8) - -1445118716) * 782304535;
                                                            var3_4 = (int)((long)(2118763578 * -412166273 + -1927864830 ^ var2_3) ^ -5373885250457818817L ^ -5373885250457818817L);
                                                            Integer.rotateRight(1752767590 ^ var2_3, 16) - -1425535083;
                                                            try {
                                                                var4_2 += 4;
                                                                if ((4779887023339735077L ^ (long)var2_3 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var3_4 = (int)((long)(1924821373 * -412166273 + -1927864830 ^ var2_3) ^ -2583534878303745732L ^ -2583534878303745732L);
                                                            }
                                                            catch (NoSuchElementException v4) {
                                                                var3_4 = (1924821373 * -412166273 + -1927864830 ^ var2_3) + 615083621 - 615083621;
                                                            }
                                                            var4_2 -= 4;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1947682808 ^ var2_3, 4) + -175380429;
                                                        var3_4 = Integer.reverse(Integer.reverse(390039249 * -412166273 + -1927864830 ^ var2_3));
                                                        Integer.rotateLeft(350478373 ^ var2_3, 5) - -1946827850;
                                                        (int)(-3003533610824963249L ^ (long)var2_3 ^ 7007745168647913843L);
                                                        var3_4 = 1924821373 * -412166273 + -1927864830 ^ var2_3;
                                                        var4_2 -= 4;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(-376670811 ^ var2_3, 16) - 1281351222;
                                                    (int)(3116169438736739151L ^ (long)var2_3 ^ 5350420505775700908L);
                                                    var3_4 = Integer.reverse(Integer.reverse(1924821373 * -412166273 + -1927864830 ^ var2_3));
                                                    (Integer.rotateLeft(-1488343460 ^ var2_3, 7) - 1179237471) * -1488343459;
                                                    --var4_2;
                                                    continue;
                                                }
                                                Integer.rotateLeft(-1367076576 ^ var2_3, 8) + 643543579;
                                                try {
                                                    var4_2 -= 2;
                                                    if ((-721628897662514179L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var3_4 = 1924821373 * -412166273 + -1927864830 ^ var2_3 ^ 1157446799 ^ 1157446799;
                                                }
                                                catch (IllegalStateException v5) {
                                                    var3_4 = (1924821373 * -412166273 + -1927864830 ^ var2_3) + -1112950419 - -1112950419;
                                                }
                                                continue;
                                            }
                                            (Integer.rotateLeft(44319961 ^ var2_3, 3) + 1447163266) * 44319961;
                                            (int)(-4605235303298045105L ^ (long)var2_3 ^ 2934239305691311612L);
                                            var3_4 = (int)((long)(713256920 * -412166273 + -1927864830 ^ var2_3) ^ 556525061262176729L ^ 556525061262176729L);
                                            Integer.rotateRight(-759885657 ^ var2_3, 13) - -2008374412;
                                            try {
                                                if ((539690005186357989L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                var3_4 = 1924821373 * -412166273 + -1927864830 ^ var2_3;
                                            }
                                            catch (IllegalArgumentException v6) {
                                                var3_4 = (int)((long)(1924821373 * -412166273 + -1927864830 ^ var2_3) ^ 6064937372103778251L ^ 6064937372103778251L);
                                            }
                                            var4_2 += 3;
                                            continue;
                                        }
                                        Integer.rotateRight(1280446923 ^ var2_3, 12) + 1112393424;
                                        var3_4 = -1745415331 * -412166273 + -1927864830 ^ var2_3 ^ -858170840 ^ -858170840;
                                        (Integer.rotateLeft(-1700249287 ^ var2_3, 6) + -1094875870) * -1700249287;
                                        (int)(6348649425859308367L ^ (long)var2_3 ^ 2555936936992251364L);
                                        (int)(-8835703904032542306L ^ (long)var2_3 ^ 8163068463701206803L);
                                        var3_4 = (int)((long)(711830266 * -412166273 + -1927864830 ^ var2_3) ^ -2697106128332118065L ^ -2697106128332118065L);
                                        (int)(-8620519060545502655L ^ (long)var2_3 ^ 8817429960167046506L);
                                        var3_4 = Integer.reverse(Integer.reverse(1924821373 * -412166273 + -1927864830 ^ var2_3));
                                        continue;
                                    }
                                    (Integer.rotateRight(276328731 ^ var2_3, 5) + 49500544) * 276328731;
                                    try {
                                        if ((7025027351990813429L ^ (long)var2_3 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var3_4 = 1924821373 * -412166273 + -1927864830 ^ var2_3;
                                    }
                                    catch (ArithmeticException v7) {
                                        var3_4 = (int)((long)(1924821373 * -412166273 + -1927864830 ^ var2_3) ^ -6978875708940190528L ^ -6978875708940190528L);
                                    }
                                    continue;
                                }
                                (Integer.rotateRight(-1152921026 ^ var2_3, 10) - -1307568963) * -1152921025;
                                var3_4 = Integer.reverse(Integer.reverse(923415100 * -412166273 + -1927864830 ^ var2_3));
                                (Integer.rotateLeft(-1694488295 ^ var2_3, 6) + -916285118) * -1694488295;
                                (int)(6463377004586920783L ^ (long)var2_3 ^ -920841975337771340L);
                                var3_4 = Integer.reverse(Integer.reverse(1924821373 * -412166273 + -1927864830 ^ var2_3));
                                var4_2 -= 3;
                                continue;
                            }
                            (Integer.rotateRight(-1758549062 ^ var2_3, 5) + 1392798401) * -1758549061;
                            var3_4 = (416710585 * -412166273 + -1927864830 ^ var2_3) + -1004661545 - -1004661545;
                            Integer.rotateLeft(-1245715284 ^ var2_3, 9) - 110776335;
                            var3_4 = (int)((long)(1924821373 * -412166273 + -1927864830 ^ var2_3) ^ 677021908643838060L ^ 677021908643838060L);
                            (Integer.rotateRight(2096969595 ^ var2_3, 18) + 654792480) * 2096969595;
                            var4_2 += 2;
                            continue;
                        }
                        (Integer.rotateLeft(-1870601071 ^ var2_3, 5) + -2080813878) * -1870601071;
                        (int)(5922878563208719183L ^ (long)var2_3 ^ 7505392927472421301L);
                        try {
                            if ((542805944708543503L ^ (long)var2_3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var3_4 = (int)((long)(1924821373 * -412166273 + -1927864830 ^ var2_3) ^ -4744229278572242275L ^ -4744229278572242275L);
                        }
                        catch (UnsupportedOperationException v8) {
                            var3_4 = (int)((long)(1924821373 * -412166273 + -1927864830 ^ var2_3) ^ -8001493907752649734L ^ -8001493907752649734L);
                        }
                        continue;
                    }
                    Integer.rotateRight(-259381009 ^ var2_3, 17) - 622367788;
                    var3_4 = 1036232774 * -412166273 + -1927864830 ^ var2_3 ^ -1674258789 ^ -1674258789;
                    Integer.rotateRight(166691814 ^ var2_3, 4) - 945723413;
                    var3_4 = Integer.reverse(Integer.reverse(931115769 * -412166273 + -1927864830 ^ var2_3));
                    (Integer.rotateRight(-2073373989 ^ var2_3, 3) + 223160256) * -2073373989;
                    var3_4 = 1924821373 * -412166273 + -1927864830 ^ var2_3;
                    var4_2 += 4;
                    continue;
                }
                Integer.rotateRight(-1825526166 ^ var2_3, 5) + -683491823;
                try {
                    var4_2 += 3;
                    if ((-6227493285858818477L ^ (long)var2_3 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var3_4 = Integer.reverse(Integer.reverse(1924821373 * -412166273 + -1927864830 ^ var2_3));
                }
                catch (NoSuchElementException v9) {
                    var3_4 = 1924821373 * -412166273 + -1927864830 ^ var2_3;
                }
                var4_2 += 3;
                continue;
            }
            (Integer.rotateRight(-1927750829 ^ var2_3, 4) + 442510920) * -1927750829;
            var3_4 = (1650450635 * -412166273 + -1927864830 ^ var2_3) + -1298199249 - -1298199249;
            Integer.rotateRight(-667381626 ^ var2_3, 14) - 859250549;
            try {
                ++var4_2;
                if ((1522306461170722417L ^ (long)var2_3 | 1L) == 0L) {
                    throw new ArithmeticException();
                }
                var3_4 = Integer.reverse(Integer.reverse(1924821373 * -412166273 + -1927864830 ^ var2_3));
            }
            catch (ArithmeticException v10) {
                var3_4 = (1924821373 * -412166273 + -1927864830 ^ var2_3) + -612314523 - -612314523;
            }
            continue;
lbl377:
            // 15 sources

            (Integer.rotateLeft(1807848121 ^ var2_3, 16) + 281961378) * 1807848121;
            (int)(-6236574520676390065L ^ (long)var2_3 ^ -8901220515038298313L);
            var3_4 = 1924821373 * -412166273 + -1927864830 ^ var2_3 ^ -690162408 ^ -690162408;
        }
    }

    private static String dhqsh(String string, int n, int n2, int n3) {
        int n4 = -1624542291;
        n4 = Integer.rotateLeft(n4 * -119394381, 8) ^ 0xCF546658;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0xF5834CA8;
        if ((n5 ^ n4) != -175944536) {
            int cfr_ignored_0 = (0x6AA83F05 ^ n4) + 752083624;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x965C3BBC) + n2 ^ i * -679791803) ^ dhmf) + zjr);
        }
        return new String(cArray);
    }

    private static boolean jqs_2(bghkh bghkh2, String string) {
        block0: {
            int n = -307132374;
            n = Integer.rotateLeft(n * -2016628659, 27) ^ 0x2F141EBF;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
            int n2 = n ^ 0x23B6C9D7;
            if ((n2 ^ n) == 599181783) break block0;
            int cfr_ignored_0 = (0xCE0741FD ^ n) + -1722799122;
        }
        return bghkh2.znh_3(string);
    }

    private static int brt(class_1293 class_12932) {
        block0: {
            int n = tkhy.shas_2(178372463);
            class_1293 class_12933 = class_12932;
            n = (class_12933 != null ? System.identityHashCode(class_12933) : 0) ^ n;
            int n2 = n ^ 0xBD6CA057;
            if ((n2 ^ n) == -1116954537) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB7CD1F38 ^ n, 9) + 1177839363) * -1211293895;
        }
        return class_12932.method_5578();
    }

    private static int sthth_2(class_1293 class_12932) {
        block0: {
            int n = tkhy.shas_2(-266741555);
            class_1293 class_12933 = class_12932;
            n = (class_12933 != null ? System.identityHashCode(class_12933) : 0) ^ n;
            int n2 = n ^ 0xD385116F;
            if ((n2 ^ n) == -746253969) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x239CC9A2 ^ n, 7) + 1415186905;
        }
        return class_12932.method_5578();
    }

    private static float sht_7(int n) {
        block0: {
            int n2 = tkhy.shas_2(439956194);
            int n3 = n2 ^ 0xD9EA3DAA;
            if ((n3 ^ n2) == -638960214) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC3D30F48 ^ n2, 11) + -1158907661;
        }
        return Float.intBitsToFloat(n);
    }

    private static void jys_2(double d) {
        int n = -606451838;
        int n2 = (n = Integer.rotateLeft(n * 1250835557, 15) ^ 0x193A720C) ^ 0x6633BCD8;
        if ((n2 ^ n) != 1714666712) {
            int cfr_ignored_0 = (0xBDE9FB5A ^ n) + 775443994;
        }
        bthf.khlt_2(d);
    }

    private static class_243 rls(class_746 class_7462) {
        block0: {
            int n = 1767307733;
            int n2 = (n = Integer.rotateLeft(n * -1494670685, 24) ^ 0x5014661D) ^ 0xD480305E;
            if ((n2 ^ n) == -729796514) break block0;
            int cfr_ignored_0 = (0xBDD6C98B ^ n) - 2068358239;
        }
        return class_7462.method_18798();
    }

    private static double rkj(long l) {
        block0: {
            int n = tkhy.shas_2(1648470082);
            int n2 = n ^ 0x8CE217DD;
            if ((n2 ^ n) == -1931339811) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEEA3BF9F ^ n, 16) - -365833348) * -291258465;
        }
        return Double.longBitsToDouble(l);
    }

    private static class_243 dhaa_4(class_746 class_7462) {
        block0: {
            int n = tkhy.shas_2(-331875147);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x7B7E0606;
            if ((n2 ^ n) == 2071856646) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9749FAB3 ^ n, 5) + 1448278760) * -1756759373;
        }
        return class_7462.method_18798();
    }

    private static void khhsh(class_746 class_7462, double d, double d2, double d3) {
        int n = -279457586;
        n = Integer.rotateLeft(n * 794582103, 13) ^ 0xEAE39F92;
        class_746 class_7463 = class_7462;
        n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
        n = (int)Double.doubleToLongBits(d) ^ n;
        int n2 = n ^ 0x44D2E403;
        if ((n2 ^ n) != 1154671619) {
            int cfr_ignored_0 = (0xAB8534CD ^ n) - 1044966352;
        }
        class_7462.method_18800(d, d2, d3);
    }

    private static boolean zkdh_2(String string, CharSequence charSequence) {
        block0: {
            int n = -129413071;
            n = Integer.rotateLeft(n * -2115148587, 18) ^ 0xFC49DE09;
            CharSequence charSequence2 = charSequence;
            n = (charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n;
            int n2 = n ^ 0x583F9FA;
            if ((n2 ^ n) == 92535290) break block0;
            int cfr_ignored_0 = (0xFDCAA9CB ^ n) - -1270733888;
        }
        return string.contains(charSequence);
    }

    private static String[] tjn(String string) {
        block0: {
            int n = 1200123133;
            int n2 = (n = Integer.rotateLeft(n * 1054695375, 16) ^ 0x7951E9DE) ^ 0xAD5376AF;
            if ((n2 ^ n) == -1387039057) break block0;
            int cfr_ignored_0 = (0xEADB1A52 ^ n) + -1217598;
        }
        return string.split("\u0001\u0016", -1);
    }

    private static CallSite zhd_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 688886636;
            n3 = Integer.rotateLeft(n3 * -908516479, 9) ^ 0x3D91048D;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0xC91E8C98;
            if ((n4 ^ n3) != -920744808) {
                int cfr_ignored_0 = (0xE0111FF4 ^ n3) + -1260164759;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zkhgh ^ string.hashCode() ^ n2 + rqd ^ i * -149055853 ^ zkhgh, 27) ^ rqd));
            }
            String[] stringArray = bghkh.tjn(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] p2mglt1ga(String string) {
        return string.split("\b\u0019", -1);
    }

    private static CallSite qzmn7dtg65(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wry60pwprkr7 ^ string.hashCode() ^ n2 + i9rmruk86rp ^ i * 1287678039 ^ wry60pwprkr7, 24) ^ i9rmruk86rp));
            }
            String[] stringArray = bghkh.p2mglt1ga(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

