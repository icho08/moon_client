/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2828$class_2831
 *  net.minecraft.class_2846
 *  net.minecraft.class_2848
 *  net.minecraft.class_2868
 *  net.minecraft.class_2879
 *  net.minecraft.class_2885
 *  net.minecraft.class_2886
 *  net.minecraft.class_3532
 *  net.minecraft.class_3965
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2868;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bta_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghh_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Packet Logger", category=bzw.OTHER, desc="Logs outgoing packets to chat/console for debugging")
public class tzj
extends bnq {
    private long dyh_2 = 0L;
    private int jfa_2 = 0;
    private final bql<ghh_2> ssq_2 = this::ghth_3;
    private static final int bjb = 2048053497;
    private static final int thsd_4 = -1591532940;
    private static final int jwa = 521283124;
    private static final int jgha = -2000658678;
    private static final int e4ngpf5lv = -1458085971;
    private static final int zjdyh428d = 610238509;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int e4o6ayow7;

    @Override
    public void nt() {
        int n = -1430350433;
        n = Integer.rotateLeft(n * 2074584331, 11) ^ 0xA0E34BFF;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0x74199CE0;
        if ((n2 ^ n) != 1947835616) {
            int cfr_ignored_0 = (0xDEA7097F ^ n) + -127795844;
        }
        tzj.thdk(this, "Packet Logger Enable".concat(tzj.hfj("횄蔈煌ⷾ首瑘•鳥䢼❿鍿伦㮙鞢䈘㸎䚨㕺巪ৗ", -134168920 - -384094503, -1277350380 - 1071884393, tzj.thdhdh(718701040) ^ 0x3F98D967)));
        this.jfa_2 = 0;
        this.dyh_2 = System.currentTimeMillis();
    }

    /*
     * Unable to fully structure code
     */
    private void khfq(String var1_1) {
        var4_2 = 0;
        var2_3 = 156712209;
        var2_3 = Integer.rotateLeft(var2_3 * -1944128957, 14) ^ -170417799;
        var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -2053261235, 15)));
        while (true) {
            block36: {
                block40: {
                    block41: {
                        block42: {
                            block35: {
                                block38: {
                                    block34: {
                                        block31: {
                                            block39: {
                                                block33: {
                                                    block37: {
                                                        block32: {
                                                            var4_2 = Integer.rotateRight(var3_4, 15) ^ var2_3;
                                                            switch (var4_2 & 7) {
                                                                case 1: {
                                                                    if (var4_2 != 316326905) {
                                                                        if (var4_2 == 1952952881) break;
                                                                        (Integer.rotateLeft(1003400913 ^ var2_3, 10) + 1113901706) * 1003400913;
                                                                        (int)(-469499246872827057L ^ (long)var2_3 ^ -240798431604875479L);
                                                                        ** break;
                                                                    }
                                                                    break block31;
                                                                }
                                                                case 2: {
                                                                    if (var4_2 != 1691819146) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 3: {
                                                                    if (var4_2 == -1802419981) break block33;
                                                                    if (var4_2 == 1956577043) break block34;
                                                                    (Integer.rotateLeft(-1516373576 ^ var2_3, 7) + 310303875) * -1516373575;
                                                                    if (var4_2 != 66314563) {
                                                                        ** break;
                                                                    }
                                                                    break block35;
                                                                }
                                                                case 4: {
                                                                    if (var4_2 != -1192097068) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 5: {
                                                                    if (var4_2 == -2053261235) break block37;
                                                                    if (var4_2 != 1304478789) {
                                                                        (Integer.rotateLeft(-732944687 ^ var2_3, 13) + -1173204342) * -732944687;
                                                                        (int)(1649030961432947535L ^ (long)var2_3 ^ -1393719936211648492L);
                                                                        ** break;
                                                                    }
                                                                    break block38;
                                                                }
                                                                case 6: {
                                                                    if (var4_2 == -409419234) break block39;
                                                                    if (var4_2 != -1045808538) {
                                                                        ** break;
                                                                    }
                                                                    break block40;
                                                                }
                                                                case 7: {
                                                                    if (var4_2 == -1178798809) break block41;
                                                                    if (var4_2 != -1324535441) {
                                                                        (Integer.rotateLeft(1847145265 ^ var2_3, 16) + 1500172842) * 1847145265;
                                                                        (int)(-6004533002634990769L ^ (long)var2_3 ^ -4077865314124499834L);
                                                                        ** break;
                                                                    }
                                                                    break block42;
                                                                }
                                                            }
                                                            Integer.rotateRight(425971211 ^ var2_3, 6) + 393450128;
                                                            tzj.mc.field_1724.method_7353(class_2561.method_30163((String)("§8[§bLogger§8] §f" + var1_1)), false);
                                                            var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 1153424061, 15)));
                                                            (Integer.rotateRight(-1565083721 ^ var2_3, 7) - -1199710620) * -1565083721;
                                                            var3_4 = Integer.rotateLeft(var2_3 ^ 1691819146, 15) + 442426735 - 442426735;
                                                            --var4_2;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(-116159598 ^ var2_3, 18) + 767264233) * -116159597;
                                                        return;
                                                    }
                                                    (Integer.rotateLeft(1564476756 ^ var2_3, 14) - 1327383655) * 1564476757;
                                                    if (tzj.mc.field_1724 != null) {
                                                        var3_4 = Integer.rotateLeft(var2_3 ^ 1952952881, 15);
                                                        Integer.rotateRight(-909079453 ^ var2_3, 12) + 1956552504;
                                                        var4_2 += 2;
                                                        continue;
                                                    }
                                                    var3_4 = Integer.rotateLeft(var2_3 ^ 1691819146, 15) + 279838963 - 279838963;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(226886908 ^ var2_3, 4) - -1483195969) * 226886909;
                                                var3_4 = Integer.rotateLeft(var2_3 ^ 613410737, 15);
                                                Integer.rotateRight(1630297538 ^ var2_3, 15) + -927139399;
                                                try {
                                                    var4_2 += 3;
                                                    if ((4951820145478767869L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15);
                                                }
                                                catch (UnsupportedOperationException v0) {
                                                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -2053261235, 15) ^ 3427528410327330573L ^ 3427528410327330573L);
                                                }
                                                continue;
                                            }
                                            (Integer.rotateLeft(-458700004 ^ var2_3, 15) - -1261553761) * -458700003;
                                            var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -824960444, 15) ^ 1400744293691253043L ^ 1400744293691253043L);
                                            Integer.rotateRight(-560402710 ^ var2_3, 14) + -119370351;
                                            var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15) ^ -1700401905 ^ -1700401905;
                                            continue;
                                        }
                                        (Integer.rotateRight(1613764851 ^ var2_3, 15) + -1439652696) * 1613764851;
                                        var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 946964315, 15) ^ 3804902656875599138L ^ 3804902656875599138L);
                                        (Integer.rotateLeft(-1807632071 ^ var2_3, 5) + -128774878) * -1807632071;
                                        (int)(6265376813218065231L ^ (long)var2_3 ^ -3208670586041991113L);
                                        var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15) ^ 676654673 ^ 676654673;
                                        var4_2 += 4;
                                        continue;
                                    }
                                    (Integer.rotateLeft(2067504089 ^ var2_3, 18) + -258638206) * 2067504089;
                                    (int)(-5077467850846442673L ^ (long)var2_3 ^ -7586169423846121789L);
                                    var3_4 = Integer.rotateLeft(var2_3 ^ 1934586011, 15);
                                    (Integer.rotateLeft(1507605489 ^ var2_3, 14) + -435625622) * 1507605489;
                                    (int)(-7246690046318417073L ^ (long)var2_3 ^ -2960972606536639732L);
                                    (int)(-796460457239442203L ^ (long)var2_3 ^ 3724192676181722165L);
                                    var3_4 = Integer.rotateLeft(var2_3 ^ 2112979312, 15) + 1129954874 - 1129954874;
                                    (int)(-3626150691748511852L ^ (long)var2_3 ^ 6566288002401580683L);
                                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -2053261235, 15)));
                                    continue;
                                }
                                (Integer.rotateLeft(-1774580720 ^ var2_3, 5) + 895817003) * -1774580719;
                                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1549735205, 15) ^ -1449154817929878169L ^ -1449154817929878169L);
                                (Integer.rotateRight(951898482 ^ var2_3, 10) + -482673655) * 951898483;
                                try {
                                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -2053261235, 15) ^ 3139532489840785054L ^ 3139532489840785054L);
                                }
                                catch (ArithmeticException v1) {
                                    var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15) + -2053934465 - -2053934465;
                                }
                                var4_2 -= 5;
                                continue;
                            }
                            Integer.rotateRight(-1354774270 ^ var2_3, 8) + 1024915065;
                            var3_4 = Integer.rotateLeft(var2_3 ^ 1285444824, 15) ^ 74679273 ^ 74679273;
                            (Integer.rotateRight(-1527151182 ^ var2_3, 7) + -23801911) * -1527151181;
                            try {
                                var4_2 += 2;
                                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -2053261235, 15) ^ 4192111141105435378L ^ 4192111141105435378L);
                            }
                            catch (IllegalArgumentException v2) {
                                var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -2053261235, 15)));
                            }
                            var4_2 -= 3;
                            continue;
                        }
                        Integer.rotateRight(2024366254 ^ var2_3, 18) - -1595911091;
                        try {
                            var4_2 -= 5;
                            if ((-7375744506181972043L ^ (long)var2_3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15) ^ 1875009614 ^ 1875009614;
                        }
                        catch (UnsupportedOperationException v3) {
                            var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15);
                        }
                        var4_2 -= 5;
                        continue;
                    }
                    (Integer.rotateLeft(-1204819304 ^ var2_3, 10) + 1378551715) * -1204819303;
                    (int)(-6598841047648819816L ^ (long)var2_3 ^ -7530071406401886967L);
                    var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -2053261235, 15)));
                    var4_2 -= 2;
                    continue;
                }
                (Integer.rotateRight(635625054 ^ var2_3, 7) - -1697215331) * 635625055;
                var3_4 = Integer.rotateLeft(var2_3 ^ 2005048473, 15);
                (Integer.rotateLeft(-670637927 ^ var2_3, 14) + 758305218) * -670637927;
                (int)(1924249407743912783L ^ (long)var2_3 ^ 6933435774796404921L);
                try {
                    var4_2 += 4;
                    if ((7977781955431928087L ^ (long)var2_3 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15) + 397877397 - 397877397;
                }
                catch (NoSuchElementException v4) {
                    var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15) ^ 1421238307 ^ 1421238307;
                }
                var4_2 -= 2;
                continue;
            }
            Integer.rotateRight(-797628829 ^ var2_3, 13) + 1116554552;
            var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ -778162741, 15) ^ -1545216546191876349L ^ -1545216546191876349L);
            (Integer.rotateLeft(798380561 ^ var2_3, 8) + -946761910) * 798380561;
            (int)(-1358683920982021297L ^ (long)var2_3 ^ 371691117717518232L);
            (int)(5533987621863915839L ^ (long)var2_3 ^ -6510167095012412344L);
            var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1790215053, 15) ^ -8302651600443343037L ^ -8302651600443343037L);
            (int)(-746901213592593177L ^ (long)var2_3 ^ 1147203705962514069L);
            var3_4 = Integer.rotateLeft(var2_3 ^ -2053261235, 15) + 1588278627 - 1588278627;
            var4_2 += 4;
            continue;
lbl213:
            // 8 sources

            Integer.rotateLeft(1709881504 ^ var2_3, 15) + 1539963547;
            var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -2053261235, 15)));
        }
    }

    private void ghth_3(ghh_2 ghh2) {
        int n = bta_4.khkha_2(-560300309);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x56DFEC2;
        if ((n2 ^ n) != 91094722) {
            int cfr_ignored_0 = Integer.rotateLeft(0xDBF78029 ^ n, 14) + -1487526862;
            int cfr_ignored_1 = (int)(0x19452E1427D4EB4FL ^ (long)n ^ 0xA158831A2DB99F5BL);
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        class_2596 class_25962 = ghh2.zjd();
        long l = System.currentTimeMillis();
        if (l - this.dyh_2 > (0xBEC921FA497CE8BL ^ 0xBEC921FA497CEA3L)) {
            ++this.jfa_2;
        }
        this.dyh_2 = l;
        String string = null;
        if (class_25962 instanceof class_2828) {
            class_2828 class_28282 = (class_2828)class_25962;
            String string2 = "Move";
            if (class_25962 instanceof class_2828.class_2830) {
                string2 = "Move.Full";
            } else if (class_25962 instanceof class_2828.class_2831) {
                string2 = "Move.Look";
            } else if (class_25962 instanceof class_2828.class_2829) {
                string2 = "Move.Pos";
            }
            boolean bl = class_28282.method_36171();
            boolean bl2 = class_28282.method_36172();
            StringBuilder stringBuilder = new StringBuilder(String.format("[Tick %d".concat("] %s -> "), this.jfa_2, string2));
            if (bl) {
                stringBuilder.append(String.format("Pos(%.4f, %.4f, %.4f) ", class_28282.method_12269(0.0), class_28282.method_12268(0.0), class_28282.method_12274(0.0)));
            }
            if (bl2) {
                float f = class_28282.method_12271(0.0f);
                float f2 = class_28282.method_12270(0.0f);
                float f3 = class_3532.method_15393((float)(f - tzj.mc.field_1724.field_5982));
                float f4 = f2 - tzj.mc.field_1724.field_6004;
                stringBuilder.append(String.format("Rot(Y:%.4f, P:%".concat(".4f) Delta(d").concat("Y:%.4f, dP:%.4f) "), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
            }
            stringBuilder.append(String.format("Ground: %b", class_28282.method_12273()));
            string = stringBuilder.toString();
        } else if (class_25962 instanceof class_2824) {
            string = String.format("[Tick %d] INTERACT_ENTITY", this.jfa_2);
        } else if (class_25962 instanceof class_2885) {
            class_2885 class_28852 = (class_2885)class_25962;
            class_3965 class_39652 = class_28852.method_12543();
            class_2338 class_23382 = class_39652.method_17777();
            Object[] objectArray = new Object[0xDF835ACD ^ 0xDF835ACB];
            objectArray[0] = this.jfa_2;
            objectArray[1] = class_23382.method_10263();
            objectArray[2] = class_23382.method_10264();
            objectArray[3] = class_23382.method_10260();
            objectArray[4] = class_39652.method_17780().name();
            objectArray[5] = class_28852.method_12546().name();
            string = String.format("[Tick %d] INTERACT_BLOCK -> Pos".concat("(%d, %d, %d) Face(%s) Hand(%s)"), objectArray);
        } else if (class_25962 instanceof class_2848) {
            class_2848 class_28482 = (class_2848)class_25962;
            string = String.format("[Tick %d] COMMAND -> %s", this.jfa_2, class_28482.method_12365().name());
        } else if (class_25962 instanceof class_2879) {
            class_2879 class_28792 = (class_2879)class_25962;
            string = String.format("[Tick %d] SWIN".concat("G -> Hand(%s)"), this.jfa_2, class_28792.method_12512().name());
        } else if (class_25962 instanceof class_2846) {
            class_2846 class_28462 = (class_2846)class_25962;
            string = String.format("[Tick %d] A".concat("CTION -> %s on Po").concat("s(%d, %d, %d)"), this.jfa_2, class_28462.method_12363().name(), class_28462.method_12362().method_10263(), class_28462.method_12362().method_10264(), class_28462.method_12362().method_10260());
        } else if (class_25962 instanceof class_2886) {
            class_2886 class_28862 = (class_2886)class_25962;
            string = String.format("[Tick %d] INTERACT_ITEM -> Hand(%s)", this.jfa_2, class_28862.method_12551().name());
        } else if (class_25962 instanceof class_2868) {
            class_2868 class_28682 = (class_2868)class_25962;
            string = String.format("[Tick %d] HELD_ITEM_CHANGE -> Slot %d", this.jfa_2, class_28682.method_12442());
        }
        if (string != null) {
            System.out.println(string);
            this.khfq(string);
        }
    }

    private static String hfj(String string, int n, int n2, int n3) {
        int n4 = bta_4.khkha_2(980365405);
        n4 = n2 ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 27)) ^ 0x322BCE7D;
        if ((n5 ^ n4) != 841731709) {
            int cfr_ignored_0 = Integer.rotateLeft(0x844FE20 ^ n4, 4) + 79193371;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xEEED229B ^ n2 ^ i * 640279335 ^ bjb, 25) ^ thsd_4));
        }
        return new String(cArray);
    }

    private static String tmkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1228071742;
            n4 = Integer.rotateLeft(n4 * 930557495, 28) ^ 0x565B9E0B;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 4)) ^ 0xC9A57A16;
            if ((n5 ^ n4) == -911902186) break block0;
            int cfr_ignored_0 = (0x7F6866D4 ^ n4) + -1540733449;
        }
        return tzj.hfj(string, n, n2, n3);
    }

    private static int thdhdh(int n) {
        block0: {
            int n2 = -1160571437;
            n2 = Integer.rotateLeft(n2 * -132564499, 23) ^ 0x2F66D5B9;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 5)) ^ 0xDF4AFC55;
            if ((n3 ^ n2) == -548733867) break block0;
            int cfr_ignored_0 = (0x6599E986 ^ n2) + 2067424866;
        }
        return Integer.reverse(n);
    }

    private static void thdk(tzj tzj2, String string) {
        int n = -851083625;
        n = Integer.rotateLeft(n * -1329639959, 26) ^ 0x5A2F0DD8;
        tzj tzj3 = tzj2;
        n = Integer.rotateRight((tzj3 != null ? System.identityHashCode(tzj3) : 0) ^ n, 17);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 22);
        int n2 = n ^ 0x72E5AD8C;
        if ((n2 ^ n) != 1927654796) {
            int cfr_ignored_0 = (0xBFA0D31B ^ n) + -881201140;
        }
        tzj2.khfq(string);
    }

    private static String[] zmk(String string) {
        block0: {
            int n = -1562940279;
            n = Integer.rotateLeft(n * 627600735, 21) ^ 0xFC394EB6;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x7787F03B;
            if ((n2 ^ n) == 2005397563) break block0;
            int cfr_ignored_0 = (0xD5509CB2 ^ n) - 1935745184;
        }
        return string.split("\u0006\u0010", -1);
    }

    private static CallSite ddl_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1715394524;
            n3 = Integer.rotateLeft(n3 * -588923189, 9) ^ 0x5BD728D7;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 15);
            n3 = Integer.rotateLeft(n ^ n3, 21);
            int n4 = n3 ^ 0xDCF15B7D;
            if ((n4 ^ n3) != -588162179) {
                int cfr_ignored_0 = (0x45307359 ^ n3) - -1661790740;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jwa ^ string.hashCode() ^ n2 + jgha + i * 2008252289) + jwa) ^ jgha));
            }
            String[] stringArray = tzj.zmk(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] nh397gtmjde6xe(String string) {
        return string.split("\u0004\u001f", -1);
    }

    private static CallSite r6yi99llndog(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ e4ngpf5lv ^ string.hashCode()) + (n2 + zjdyh428d) + i ^ e4ngpf5lv, 14) + zjdyh428d);
            }
            String[] stringArray = tzj.nh397gtmjde6xe(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

