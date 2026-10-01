/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
 *  net.minecraft.class_7833
 *  org.joml.Vector2f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import net.minecraft.class_7833;
import org.joml.Vector2f;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.dhl_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Arrows", category=bzw.OTHER, desc="Arrows pointing to players")
public class bjm
extends bnq {
    private static bjm jzl;
    private final tay ttdh = new tay(this, "Radius").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xD6F767F8 ^ 0xD4E527F8, 5))).dhbs_2(Float.intBitsToFloat(0x8BE59A48 ^ 0xC8C59A48)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(320965991 - -795505305));
    private final tay zsh_8 = new tay(this, "Size").shth_7(Float.intBitsToFloat(0x92D32512 ^ 0xD3F32512)).dhbs_2(Float.intBitsToFloat(Integer.reverse(435694597) ^ 0xE23C1F98)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-1354167523 - 1839794973));
    private final badh_2 rzs = new badh_2(this, "Dynamic").bts(true);
    private final badh_2 dat_2 = new badh_2(this, "Name").bts(false);
    private final badh_2 bhgh_2 = new badh_2(this, "Distance").bts(false);
    private final bzw_2 fs_2 = new bzw_2(this, "Neut".concat("ral color")).dhshy(new byq(Float.intBitsToFloat(-1784819242 - 1377751510), Float.intBitsToFloat(0xDE59F34C ^ 0x9D26F34C), Float.intBitsToFloat(0xFC6A68F6 ^ 0xBF1568F6), Float.intBitsToFloat(-831981032 + 1964377576)));
    private final bzw_2 jm = new bzw_2(this, "Frie".concat("nd color")).dhshy(new byq(Float.intBitsToFloat(-1001724394 - -2121341418), Float.intBitsToFloat(Integer.rotateLeft(0xB315CBC6 ^ 0xBEE9CBC7, 30)), Float.intBitsToFloat(Integer.rotateLeft(0xF7FF833 ^ 0x27DFF837, 28)), Float.intBitsToFloat(Integer.reverse(233656589) ^ 0xF3F5B7B0)));
    private final bzw_2 shky = new bzw_2(this, "Target color").dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-342588760) ^ 0x563E29D7), Float.intBitsToFloat(974361412 + 143682748), Float.intBitsToFloat(0x81B25EC9 ^ 0xC3165EC9), Float.intBitsToFloat(-715675950 + 1848072494)));
    private float bws = this.ttdh.thw_5();
    private final Map sdkh = new HashMap();
    private static final class_2960 rbs;
    private static final class_2960 jndh;
    private final bql<bbgh> thwsh = this::anm;
    private static final int rbq = -1402892554;
    private static final int shr = 1411271707;
    private static final int zrs = -1380819320;
    private static final int hlr = 1136473971;
    private static final int go5y6j756 = 1633608456;
    private static final int xh8ewht7 = 1446260498;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int mqwoes9ie;

    public bjm() {
        jzl = this;
    }

    private void haz_4(ghdh_3 ghdh2, class_1657 class_16572, double d, double d2, byq byq2) {
        String string;
        boolean bl;
        int n = mc.method_22683().method_4486();
        int n2 = mc.method_22683().method_4502();
        class_4587 class_45872 = ghdh2.method_51448();
        float f = (float)n / 2.0f;
        float f2 = (float)n2 / 2.0f;
        float f3 = class_3532.method_15393((float)(this.bgha(new Vector2f((float)d, (float)d2)) - bjm.mc.field_1724.method_36454()));
        float f4 = this.shzk(class_16572.method_5667(), f3);
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(f4));
        class_45872.method_46416(-f, -f2, 0.0f);
        boolean bl2 = Moondlc.getInstance().getFriendManager().adhj(class_16572.method_5477().getString());
        class_1309 class_13092 = bjd.shfn();
        boolean bl3 = bl = class_13092 == class_16572;
        byq byq3 = bl2 ? this.jm.sdsh_4() : (bl ? this.shky.sdsh_4() : byq2);
        this.zssh_4(ghdh2, f, f2 - this.bws, this.zsh_8.thw_5(), byq3, false);
        class_45872.method_22909();
        String string2 = this.dat_2.shzl() ? class_16572.method_5477().getString() : "";
        String string3 = string = this.bhgh_2.shzl() ? String.format("%.1fm", Float.valueOf(bjm.mc.field_1724.method_5739((class_1297)class_16572))) : "";
        if (!string2.isEmpty() || !string.isEmpty()) {
            float f5 = (float)Math.toRadians(f4);
            float f6 = f + (float)Math.sin(f5) * (this.bws + 14.0f);
            float f7 = f2 - (float)Math.cos(f5) * (this.bws + 14.0f);
            if (!string2.isEmpty() && !string.isEmpty()) {
                ghdh2.drawCenteredText(bmn.shzth.twy_2(5.5f), string2, f6, f7 - 5.5f, byq3);
                ghdh2.drawCenteredText(bmn.shzth.twy_2(5.5f), string, f6, f7 + 1.5f, byq3);
            } else {
                String string4 = !string2.isEmpty() ? string2 : string;
                ghdh2.drawCenteredText(bmn.shzth.twy_2(5.5f), string4, f6, f7 - 2.5f, byq3);
            }
        }
    }

    public void zssh_4(ghdh_3 ghdh2, float f, float f2, float f3, byq byq2, boolean bl) {
        float f4 = f3 + 8.0f;
        class_2960 class_29602 = bl ? jndh : rbs;
        bdht.dhmq(ghdh2.method_51448(), class_29602, f - f4 / 2.0f, f2, f4, f4, byq2);
    }

    private float shzk(UUID uUID, float f) {
        int n = -359586097;
        n = Integer.rotateLeft(n * -1794365721, 18) ^ 0x5D458E5A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x2619417C;
        if ((n2 ^ n) != 639189372) {
            int cfr_ignored_0 = (0xCC8867B3 ^ n) + 1890987154;
        }
        float f2 = bjm.dhaa_2(this.sdkh.getOrDefault(uUID, Float.valueOf(f)));
        float f3 = class_3532.method_15393((float)(f - f2));
        float f4 = Float.intBitsToFloat(1694466672 + -660319078);
        float f5 = f2 + f3 * f4;
        this.sdkh.put(uUID, bjm.tzl_4(f5));
        return f5;
    }

    /*
     * Unable to fully structure code
     */
    private float bgha(Vector2f var1_1) {
        var2_2 = 0.0;
        var4_3 = 0.0;
        var6_4 = 0.0f;
        var9_5 = 0;
        var7_6 = -564377270;
        var7_6 = Integer.rotateLeft(var7_6 * -671286061, 18) ^ 243266422;
        var7_6 = System.identityHashCode(this) ^ var7_6;
        v0 = var1_1;
        var7_6 = Integer.rotateLeft((v0 != null ? System.identityHashCode(v0) : 0) ^ var7_6, 26);
        var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8) + -2045744222 - -2045744222;
        while (true) {
            block33: {
                block35: {
                    block37: {
                        block38: {
                            block30: {
                                block41: {
                                    block39: {
                                        block32: {
                                            block40: {
                                                block31: {
                                                    block42: {
                                                        block34: {
                                                            block36: {
                                                                var9_5 = Integer.rotateRight(var8_7, 8) ^ var7_6;
                                                                switch (var9_5 & 7) {
                                                                    case 0: {
                                                                        if (var9_5 != -53643144) {
                                                                            ** break;
                                                                        }
                                                                        break block30;
                                                                    }
                                                                    case 7: {
                                                                        if (var9_5 != -283142177) {
                                                                            ** break;
                                                                        }
                                                                        break block31;
                                                                    }
                                                                    case 2: {
                                                                        if (var9_5 == -1728856430) break block32;
                                                                        if (var9_5 != 1361013202) {
                                                                            ** break;
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    case 4: {
                                                                        if (var9_5 == -1032549532) break block34;
                                                                        if (var9_5 == 19316276) break block35;
                                                                        (Integer.rotateLeft(-1549888167 ^ var7_6, 7) + -728648446) * -1549888167;
                                                                        (int)(7002036822005312335L ^ (long)var7_6 ^ -8378802958263292023L);
                                                                        if (var9_5 != 1902250036) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 6: {
                                                                        if (var9_5 > -402528362) ** GOTO lbl43
                                                                        if (var9_5 == -1363761946) break block37;
                                                                        if (var9_5 != -402528362) {
                                                                            ** break;
                                                                        }
                                                                        break block38;
lbl43:
                                                                        // 1 sources

                                                                        if (var9_5 == 542649606) break;
                                                                        if (var9_5 != 1712244222) {
                                                                            (Integer.rotateLeft(1447888784 ^ var7_6, 13) + 2008123819) * 1447888785;
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 1: {
                                                                        if (var9_5 == 313488825) break block40;
                                                                        if (var9_5 == 2034369353) break block41;
                                                                        (Integer.rotateRight(-1178847269 ^ var7_6, 10) + -2111282496) * -1178847269;
                                                                        if (var9_5 != -637072767) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                }
                                                                Integer.rotateLeft(-1046111795 ^ var7_6, 11) - 2003517198;
                                                                (int)(222708211178072911L ^ (long)var7_6 ^ -7885658799066207233L);
                                                                var6_4 = 0.0f;
                                                                try {
                                                                    var8_7 = Integer.rotateLeft(var7_6 ^ 1361013202, 8) ^ 1112679981 ^ 1112679981;
                                                                }
                                                                catch (NoSuchElementException v1) {
                                                                    var8_7 = Integer.rotateLeft(var7_6 ^ 1361013202, 8) ^ 410575340 ^ 410575340;
                                                                }
                                                                var9_5 += 5;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(1620353093 ^ var7_6, 15) - -1235417194;
                                                            (int)(-6762701881223091377L ^ (long)var7_6 ^ -2197612469697320547L);
                                                            if (bjm.mc.field_1724 != null) {
                                                                try {
                                                                    var9_5 += 5;
                                                                    if ((-4265223317384766055L ^ (long)var7_6 | 1L) == 0L) {
                                                                        throw new IllegalArgumentException();
                                                                    }
                                                                    var8_7 = Integer.rotateLeft(var7_6 ^ -1032549532, 8) ^ -1036629002 ^ -1036629002;
                                                                }
                                                                catch (IllegalArgumentException v2) {
                                                                    var8_7 = Integer.rotateLeft(var7_6 ^ -1032549532, 8);
                                                                }
                                                                var9_5 += 4;
                                                                continue;
                                                            }
                                                            (int)(2809248338248075010L ^ (long)var7_6 ^ 1550719279436128297L);
                                                            var8_7 = (int)((long)Integer.rotateLeft(var7_6 ^ 542649606, 8) ^ -1032736657300397567L ^ -1032736657300397567L);
                                                            --var9_5;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(856308329 ^ var7_6, 9) + 848998898;
                                                        (int)(-1028909425687729329L ^ (long)var7_6 ^ -3037533800201957728L);
                                                        var2_2 = (double)var1_1.x - bjm.tzw_3(bjm.mc.field_1724);
                                                        var4_3 = (double)var1_1.y - bjm.mc.field_1724.method_23321();
                                                        var6_4 = (float)(-(Math.atan2(var2_2, var4_3) * bjm.dzd_4(-6477164116277150987L ^ -1850741600770622707L)));
                                                        (int)(-7009334073223694671L ^ (long)var7_6 ^ 5974172620743282850L);
                                                        var8_7 = Integer.rotateLeft(var7_6 ^ 1361013202, 8) + -1807594873 - -1807594873;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(524328554 ^ var7_6, 6) + -852439535;
                                                    var8_7 = Integer.rotateLeft(var7_6 ^ 1973819192, 8) ^ -671906587 ^ -671906587;
                                                    (Integer.rotateLeft(-345153475 ^ var7_6, 16) - -2036578658) * -345153475;
                                                    (int)(3017356775425108815L ^ (long)var7_6 ^ 7021255967530155630L);
                                                    var8_7 = Integer.rotateLeft(var7_6 ^ 1407820678, 8) + 116666233 - 116666233;
                                                    (Integer.rotateLeft(-396607724 ^ var7_6, 16) - 663306919) * -396607723;
                                                    var8_7 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var7_6 ^ 1902250036, 8)));
                                                    var9_5 += 3;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1677845311 ^ var7_6, 15) - 546841564) * 1677845311;
                                                var8_7 = Integer.rotateLeft(var7_6 ^ 1289027, 8) + -1265837199 - -1265837199;
                                                (Integer.rotateRight(1498999219 ^ var7_6, 14) + -702419992) * 1498999219;
                                                var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8) + 1459745137 - 1459745137;
                                                var9_5 += 3;
                                                continue;
                                            }
                                            Integer.rotateRight(-1975598010 ^ var7_6, 4) - -1040751691;
                                            var8_7 = Integer.rotateLeft(var7_6 ^ -2007596871, 8);
                                            Integer.rotateRight(733451842 ^ var7_6, 8) + 1335415097;
                                            var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8);
                                            Integer.rotateRight(1420397451 ^ var7_6, 13) + 1155892496;
                                            ++var9_5;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1293550644 ^ var7_6, 9) - -1372119825;
                                        var8_7 = Integer.rotateLeft(var7_6 ^ 1054143934, 8) ^ -1743310089 ^ -1743310089;
                                        (Integer.rotateRight(-302872137 ^ var7_6, 16) - -725857180) * -302872137;
                                        var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8) + -1788694068 - -1788694068;
                                        continue;
                                    }
                                    (Integer.rotateRight(-2026362922 ^ var7_6, 3) - 1680503333) * -2026362921;
                                    var8_7 = Integer.rotateLeft(var7_6 ^ -1911102636, 8) + -91436426 - -91436426;
                                    (Integer.rotateRight(-1793116202 ^ var7_6, 5) - 321217061) * -1793116201;
                                    try {
                                        if ((1985013112899651531L ^ (long)var7_6 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8) + 1328433683 - 1328433683;
                                    }
                                    catch (NoSuchElementException v3) {
                                        var8_7 = (int)((long)Integer.rotateLeft(var7_6 ^ 1902250036, 8) ^ -2420434946285768967L ^ -2420434946285768967L);
                                    }
                                    var9_5 -= 5;
                                    continue;
                                }
                                (Integer.rotateRight(1394865727 ^ var7_6, 13) - 364409052) * 1394865727;
                                var8_7 = Integer.rotateLeft(var7_6 ^ -1033198931, 8);
                                (Integer.rotateLeft(1889608408 ^ var7_6, 17) + -1478437021) * 1889608409;
                                (int)(-8175904271055615361L ^ (long)var7_6 ^ 5311134778183430339L);
                                var8_7 = Integer.rotateLeft(var7_6 ^ -1085218535, 8) + -838881614 - -838881614;
                                (int)(3767156331851952497L ^ (long)var7_6 ^ -4899293522957056674L);
                                var8_7 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var7_6 ^ 1902250036, 8)));
                                continue;
                            }
                            Integer.rotateRight(-1283889406 ^ var7_6, 9) + -1072621447;
                            var8_7 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var7_6 ^ 1902250036, 8)));
                            Integer.rotateLeft(1710295169 ^ var7_6, 15) + 1552787162;
                            (int)(-6394083718883644593L ^ (long)var7_6 ^ -5762211574761069738L);
                            continue;
                        }
                        Integer.rotateRight(-1563027509 ^ var7_6, 7) + -1135968048;
                        var8_7 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var7_6 ^ -1168163544, 8)));
                        Integer.rotateLeft(-1624642392 ^ var7_6, 6) + 1248937875;
                        try {
                            var9_5 += 3;
                            var8_7 = (int)((long)Integer.rotateLeft(var7_6 ^ 1902250036, 8) ^ -6536483954751009109L ^ -6536483954751009109L);
                        }
                        catch (UnsupportedOperationException v4) {
                            var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8);
                        }
                        var9_5 += 5;
                        continue;
                    }
                    (Integer.rotateLeft(-1992612135 ^ var7_6, 4) + -1568189566) * -1992612135;
                    (int)(5443032138156141391L ^ (long)var7_6 ^ -1389216336584295742L);
                    var8_7 = Integer.rotateLeft(var7_6 ^ -865987164, 8) ^ 1116590440 ^ 1116590440;
                    Integer.rotateLeft(630099240 ^ var7_6, 7) + -1868515565;
                    try {
                        if ((4447373568316258121L ^ (long)var7_6 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8) + 1704051760 - 1704051760;
                    }
                    catch (IllegalArgumentException v5) {
                        var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8) + -1236663879 - -1236663879;
                    }
                    continue;
                }
                Integer.rotateRight(-645081690 ^ var7_6, 14) - 1550548565;
                var8_7 = Integer.rotateLeft(var7_6 ^ -751643614, 8) ^ -460185256 ^ -460185256;
                (Integer.rotateLeft(1843603444 ^ var7_6, 16) - 1390376391) * 1843603445;
                (int)(9189205523409179282L ^ (long)var7_6 ^ -4176647703548964132L);
                var8_7 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var7_6 ^ 1902250036, 8)));
                var9_5 -= 5;
                continue;
            }
            return var6_4;
lbl224:
            // 8 sources

            (Integer.rotateLeft(2096253617 ^ var7_6, 18) + 632597162) * 2096253617;
            (int)(-4737535517378942129L ^ (long)var7_6 ^ 3776412436009636176L);
            var8_7 = Integer.rotateLeft(var7_6 ^ 1902250036, 8) ^ 1128281575 ^ 1128281575;
        }
    }

    @Generated
    public static bjm thmz() {
        block0: {
            int n = dhl_3.rda_4(-848295917);
            int n2 = n ^ 0x5215CB6C;
            if ((n2 ^ n) == 1377160044) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9F65C37F ^ n, 6) - 1370508188) * -1620720769;
        }
        return jzl;
    }

    private void anm(bbgh bbgh2) {
        int n = 317751320;
        n = Integer.rotateLeft(n * -158203177, 4) ^ 0xF5501D5;
        n = System.identityHashCode(this) ^ n;
        bbgh bbgh3 = bbgh2;
        n = (bbgh3 != null ? System.identityHashCode(bbgh3) : 0) ^ n;
        int n2 = n ^ 0xEB0600F4;
        if ((n2 ^ n) != -351928076) {
            int cfr_ignored_0 = (0xF9F680EC ^ n) + -686446428;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (bjm.mc.field_1724 == null || bjm.mc.field_1687 == null) {
            return;
        }
        float f = this.ttdh.thw_5();
        if (this.rzs.shzl()) {
            if (bjm.mc.field_1755 != null) {
                f += Float.intBitsToFloat(0x6C0E5B77 ^ 0x2ED25B77);
            } else if (bjm.mc.field_1724.method_5624()) {
                f += Float.intBitsToFloat(Integer.rotateLeft(0xABE000B9 ^ 0xABE83EB9, 11));
            } else if (bjm.mc.field_1724.method_18798().method_37268() > Double.longBitsToDouble(0xAA24AB2E52586763L ^ 0x9574C96380A9CE9FL)) {
                f += Float.intBitsToFloat(Integer.reverse(-1786759402) ^ 0x299C01A9);
            }
        }
        int n3 = mc.method_22683().method_4486();
        int n4 = mc.method_22683().method_4502();
        float f2 = (float)Math.min(n3, n4) / 2.0f - this.zsh_8.thw_5() / 2.0f - Float.intBitsToFloat(-1700422885 + -1501928219);
        f = Math.min(f, f2);
        this.bws += (f - this.bws) * Float.intBitsToFloat(949854307 - -86977642);
        for (class_1657 class_16572 : bjm.mc.field_1687.method_18456()) {
            if (class_16572.equals((Object)bjm.mc.field_1724)) continue;
            this.haz_4(bbgh2.dtn(), class_16572, class_16572.method_23317(), class_16572.method_23321(), this.fs_2.sdsh_4());
        }
    }

    private static String hfd_2(String string, int n, int n2, int n3) {
        int n4 = -1174592789;
        n4 = Integer.rotateLeft(n4 * 1487153107, 14) ^ 0x866E1DC6;
        int n5 = (n4 = n2 ^ n4) ^ 0x599C9766;
        if ((n5 ^ n4) != 1503434598) {
            int cfr_ignored_0 = (0xE061B58D ^ n4) + 817576246;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x74D1696A ^ n2 - i) + shr, 9) ^ rbq + i * -956007245));
        }
        return new String(cArray);
    }

    private static float dhaa_2(Float f) {
        block0: {
            int n = 559244784;
            n = Integer.rotateLeft(n * -108674503, 28) ^ 0xEE47354;
            Float f2 = f;
            n = (f2 != null ? System.identityHashCode(f2) : 0) ^ n;
            int n2 = n ^ 0xAAF1BEBD;
            if ((n2 ^ n) == -1426997571) break block0;
            int cfr_ignored_0 = (0x8BA4DB4D ^ n) + -105351987;
        }
        return f.floatValue();
    }

    private static Float tzl_4(float f) {
        block0: {
            int n = dhl_3.rda_4(-308162287);
            int n2 = n ^ 0xC23BC470;
            if ((n2 ^ n) == -1036270480) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x2F9A1561 ^ n, 8) + -939117062;
            int cfr_ignored_1 = (int)(0xED28BB5C27D4EB4FL ^ (long)n ^ 0x8BC8831A2DB87780L);
        }
        return Float.valueOf(f);
    }

    private static double tzw_3(class_746 class_7462) {
        block0: {
            int n = 493727470;
            n = Integer.rotateLeft(n * 1703103329, 13) ^ 0x603B69F6;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xECACD057;
            if ((n2 ^ n) == -324218793) break block0;
            int cfr_ignored_0 = (0xF1C17EB9 ^ n) - -553647624;
        }
        return class_7462.method_23317();
    }

    private static double dzd_4(long l) {
        block0: {
            int n = -327536687;
            n = Integer.rotateLeft(n * 1241569329, 9) ^ 0xE2C6C568;
            int n2 = (n = (int)l ^ n) ^ 0xD02154B;
            if ((n2 ^ n) == 218240331) break block0;
            int cfr_ignored_0 = (0xE1783A9A ^ n) + -312261784;
        }
        return Double.longBitsToDouble(l);
    }

    private static String[] ghda_2(String string) {
        int n = 922439313;
        int n2 = (n = Integer.rotateLeft(n * 1281442325, 21) ^ 0x89E2E52D) ^ 0xD0B77ECA;
        if ((n2 ^ n) != -793280822) {
            int cfr_ignored_0 = (0xE64C305B ^ n) + -1576742353;
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

    private static CallSite hthn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2085647226;
            n3 = Integer.rotateLeft(n3 * -607290617, 16) ^ 0x220B7324;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 15);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x68886A9B;
            if ((n4 ^ n3) != 1753770651) {
                int cfr_ignored_0 = (0xEB27E61D ^ n3) + 1850962352;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zrs ^ string.hashCode() ^ n2 + hlr ^ i * -107162235 ^ zrs, 5) ^ hlr));
            }
            String[] stringArray = bjm.ghda_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ivabyl0y3z5eq(String string) {
        return string.split("\u0003\u0010", -1);
    }

    private static CallSite o5kufvwybcn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ go5y6j756 ^ string.hashCode()) + (n2 + xh8ewht7) + i ^ go5y6j756, 22) + xh8ewht7);
            }
            String[] stringArray = bjm.ivabyl0y3z5eq(new String(cArray));
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

