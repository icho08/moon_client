/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2828
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_6880
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2828;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btq_2;
import us.m0vy.moondlc.m0vyguard.bhh_3;
import us.m0vy.moondlc.m0vyguard.sj;
import us.m0vy.moondlc.m0vyguard.yf;

public class shd_5 {
    private double khshgh;
    private double thnq;
    private double jagh_2;
    private double shqh;
    private boolean bft;
    private boolean dthy = false;
    public double thjd = 0.0;
    public double shtd_4 = 0.0;
    private static final int hhj_2 = 160219190;
    private static final int rghh = 1252456317;
    private static final int rmz_2 = 2134946451;
    private static final int shthw = 353254828;
    private static final int ft4ia6n00 = 1077844410;
    private static final int fj7sesm9ho3qp = 1771583858;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g4g9dlf10s;

    public void dhghd_2() {
        int n = btq_2.zshb_2(-503887162);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x39513846;
        if ((n2 ^ n) != 961624134) {
            int cfr_ignored_0 = Integer.rotateLeft(0xD8A67280 ^ n, 14) + 1082490043;
        }
        this.dthy = false;
        this.khshgh = 0.0;
        this.thnq = 0.0;
        this.jagh_2 = 0.0;
        this.shqh = 0.0;
        this.bft = false;
        this.thjd = 0.0;
        this.shtd_4 = 0.0;
    }

    public List rqw(class_310 class_3102, class_746 class_7462, class_2828 class_28282, String string) {
        try {
            int n = -148858486;
            n = Integer.rotateLeft(n * 1181306625, 7) ^ 0x7C5BCEBF;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
            class_310 class_3103 = class_3102;
            n = (class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n;
            int n2 = n ^ 0xC188FE92;
            if ((n2 ^ n) != -1047986542) {
                int cfr_ignored_0 = (0x36A86718 ^ n) - -1464606223;
            }
            if ((0x1E1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!shd_5.zqsh_2()) {
            yf.athz_2();
        }
        ArrayList<sj> arrayList = new ArrayList<sj>();
        boolean bl = class_28282.method_36171();
        double d = bl ? class_28282.method_12269(class_7462.method_23317()) : class_7462.method_23317();
        double d2 = bl ? class_28282.method_12268(class_7462.method_23318()) : shd_5.shtha_2(class_7462);
        double d3 = bl ? class_28282.method_12274(shd_5.syj_2(class_7462)) : class_7462.method_23321();
        boolean bl2 = shd_5.rns(class_28282);
        if (!this.dthy) {
            this.khshgh = d;
            this.thnq = d2;
            this.jagh_2 = d3;
            this.shqh = shd_5.h_3((class_746)class_7462).field_1351;
            this.bft = bl2;
            this.dthy = true;
            return arrayList;
        }
        if (bl) {
            boolean bl3;
            double d4;
            double d5;
            double d6 = d - this.khshgh;
            double d7 = d2 - this.thnq;
            double d8 = d3 - this.jagh_2;
            this.thjd = d5 = Math.hypot(d6, d8);
            double d9 = this.hnq(class_7462);
            String string2 = string;
            int n = -1;
            switch (string2.hashCode()) {
                case 1838807491: {
                    if (!shd_5.skk(string2, "Polar E".concat("nterprise"))) break;
                    n = 0;
                    break;
                }
                case -1808119063: {
                    if (!string2.equals("Strict")) break;
                    n = 1;
                    break;
                }
                case 1727163223: {
                    if (!string2.equals("Lenient")) break;
                    n = 2;
                }
            }
            switch (n) {
                case 0: {
                    double d10 = shd_5.jy(0xA18B65EDC3C3B989L ^ 0x9E1F1F0C846DADF2L);
                    break;
                }
                case 1: {
                    double d10 = Double.longBitsToDouble(0x7E02823B35BF65EFL ^ 0x41AB1BA2AC26FC75L);
                    break;
                }
                case 2: {
                    double d10 = shd_5.tjt_2(0xA1C1A77E82EBEB34L ^ 0x9E05DD9FC545FF4FL);
                    break;
                }
                default: {
                    double d10 = d4 = Double.longBitsToDouble(0xD9B44E03BF42707L ^ 0x322F3E017C5A337CL);
                }
            }
            if (d5 > d9 + d4) {
                float f = class_3532.method_15363((float)((float)(d5 / (d9 + d4)) - Float.intBitsToFloat(Integer.rotateLeft(0xDB4536CE ^ 0x167B7A02, 8))), (float)Float.intBitsToFloat(Integer.rotateLeft(0x8D0A4391 ^ 0x1493BA08, 13)), (float)Float.intBitsToFloat(Integer.reverse(1482444474) ^ 0x620F4ABE));
                arrayList.add(new sj(bhh_3.jthh_2, "POLAR-MO".concat("VE-B"), "Horizontal Speed / Friction Violation", f, shd_5.tfd_4(shd_5.jzf_2("뺏帅ﾣ鼢㳀\udc4c緄ᵦ뫶嫉福鮛㬲\ud8a7硆᧘륬囧阁㞔휽瓼ំ뗹啮鈹㉉폍獅", shd_5.bfgh(0xD32F70C6 ^ 0x248058E9, 15), Integer.rotateLeft(0x65C28E6 ^ 0xB9EDECA4, 5), 1491348835 + -707933845).concat("fm exceeds maximum allowed: %.4fm"), new Object[]{shd_5.slz_3(d5), d9}), d5, d9, "Adjust movement speed / strafe modifiers to stay within Minecraft friction limits."));
            }
            if (!(class_7462.method_31549().field_7479 || class_7462.method_6101() || shd_5.djd(class_7462) || class_7462.method_5771() || class_7462.method_5765() || shd_5.djh_2(class_7462) || class_7462.method_6059(class_1294.field_5902) || class_7462.method_6059(class_1294.field_5906) || class_7462.field_6235 > 0)) {
                boolean bl4 = (this.bft || this.zbl(class_3102, class_7462)) && d7 > shd_5.saq_3(0x75603F5EE88DD2E6L ^ 0x4AA9A6C771144B7CL);
                n = shd_5.sft(class_7462, class_1294.field_5913) ? shd_5.dkhm(class_7462, class_1294.field_5913).method_5578() + 1 : 0;
                double d11 = Double.longBitsToDouble(0x2D1CA499BA98B541L ^ 0x12C645DE148CCFA0L) + (double)n * shd_5.ddha_2(0xB34720858E9420C5L ^ 0x8CFEB91C170DB95FL);
                if (bl4) {
                    double d12 = Math.abs(d7 - d11);
                    double d13 = Math.abs(d7 - Double.longBitsToDouble(0x9A2085C455A54491L ^ 0xA5C085C455A54491L));
                    double d14 = Math.abs(d7 - Double.longBitsToDouble(0xD40083FE3090AAEBL ^ 0xEBE3B0CD03A399D8L));
                    if (d12 > Double.longBitsToDouble(0xAE1CF6B1C7A34390L ^ 0x91A56F285E3ADA0AL) && d13 > Double.longBitsToDouble(0x23CAE870DAB23D82L ^ 0x1C7371E9432BA418L) && d14 > Double.longBitsToDouble(0x42B3A34FAC8BEECBL ^ 0x7D0A3AD635127751L) && d7 > Double.longBitsToDouble(0x9C7DCB788E581DCL ^ 0x3623107B44294D11L)) {
                        arrayList.add(new sj(bhh_3.jthh_2, "POLAR-MOV".concat("E-A-JUMP"), "Illegal Jump Impulse", shd_5.dhsj(350142911 + 713868128), String.format(shd_5.jzf_2("ᆣ丝꺝༦澩챔ⳛ资䩨ꨄઊ欚쯹⠹裗䧸ꙹ۠暈윛⟱葡䔍ꗊȲ抠싉⍛莌䂳ꅔǇ繟\udefc㽨齉ￆ山복ᵺ線", -2035277067 + -595660128, shd_5.shzj_2(0x7F411F36 ^ 0xBE7D648D, 27), -1734900692 + -1776651614), d7, d11), d7, d11, "Ensure jump impulse e".concat(shd_5.jzf_2("掸㰱\udcb2紂ᶏ븫廰ｵ鿍㡗\ud821碷ᤷ맅婃猪鬩㮙푋", shd_5.dthy_2(0xECA665F6 ^ 0xC90C3DEA, 29), -637715093 + -458016889, 1273454248 - 490039258)).concat(shd_5.jzf_2("ვ伄꿀๵滤촘ⶅ谉䬭ꭔை樯쪣⤭觍䣷ꝺߵ枇완⛰", 0xDA762938 ^ 0xF6DBB1B9, 0xE32E75B9 ^ 0xC2B5E570, shd_5.zza_5(-1560728655) ^ 0xA365698B))));
                    }
                } else if (!this.bft && !bl2 && shd_5.ghss_2(d7) > shd_5.djs(0x26E9F063B83EB12L ^ 0x3DFAE5E77C2DFF69L)) {
                    double d15;
                    double d16;
                    double d17 = (this.shqh - shd_5.khshk(0xF84211AE2E50D842L ^ 0xC7F66B4F69FECC39L)) * Double.longBitsToDouble(0xBEEA3A5D24090F40L ^ 0x81056675D1CB801CL);
                    this.shtd_4 = d16 = Math.abs(d7 - d17);
                    String string3 = string;
                    int n3 = -1;
                    switch (shd_5.zld_3(string3)) {
                        case 1838807491: {
                            if (!string3.equals("Polar Enterprise")) break;
                            n3 = 0;
                            break;
                        }
                        case -1808119063: {
                            if (!string3.equals("Strict")) break;
                            n3 = 1;
                            break;
                        }
                        case 1727163223: {
                            if (!shd_5.tws_2(string3, "Lenient")) break;
                            n3 = 2;
                        }
                    }
                    switch (n3) {
                        case 0: {
                            double d18 = Double.longBitsToDouble(0xEC8D3BC42FA2F055L ^ 0xD324A25DB63B69CFL);
                            break;
                        }
                        case 1: {
                            double d18 = shd_5.ttl(0x8FCA83AF2A1CE594L ^ 0xB07EF94E6DB2F1EFL);
                            break;
                        }
                        case 2: {
                            double d18 = Double.longBitsToDouble(0xACF00088F7F3B38L ^ 0x3506999116E6A2A2L);
                            break;
                        }
                        default: {
                            double d18 = d15 = Double.longBitsToDouble(0x777B644EE31C251BL ^ 0x48C5DC1F08993BA3L);
                        }
                    }
                    if (d16 > d15) {
                        arrayList.add(new sj(bhh_3.jthh_2, "POLAR-MOVE".concat("-A-GRAVITY"), "1:1 Gravity Simul".concat("ation Anomaly"), Float.intBitsToFloat(1197288079 + -133948129), String.format("Vertical acceleratio".concat("n deviated (Expecte").concat("d: %.4f, Actual: %").concat(".4f, Diff: %.4f)"), d17, d7, d16), d16, d15, "Simulate vanilla falling curve: vY = (vY_prev - 0.08) * 0.98."));
                    }
                }
            }
            boolean bl5 = bl3 = class_7462.method_24828() || this.zbl(class_3102, class_7462);
            if (bl2 && !bl3 && d7 < Double.longBitsToDouble(0x1A81EC3D66DDE520L ^ 0xA53875A4FF447CBAL) && class_7462.field_6017 > Float.intBitsToFloat(Integer.reverse(860040196) ^ 0x1EB4C2CC)) {
                arrayList.add(new sj(bhh_3.jthh_2, "POLAR-MOVE-C", "Ground Spoof / NoFall Packet Violation", Float.intBitsToFloat(-977686336 - -2042704008), String.format("Packet onGro".concat("und=true whi").concat("le falling in").concat(" air at Y: %.2f"), d2), 1.0, 0.0, "Do not spoof packet onGround state while air-borne."));
            }
            this.khshgh = d;
            this.thnq = d2;
            this.jagh_2 = d3;
            this.shqh = d7;
        }
        this.bft = bl2;
        return arrayList;
    }

    private double hnq(class_746 class_7462) {
        double d = 0.2863;
        if (class_7462.method_5624()) {
            d *= 1.35;
        }
        if (class_7462.method_6059(class_1294.field_5904)) {
            int n = class_7462.method_6112(class_1294.field_5904).method_5578() + 1;
            d *= 1.0 + 0.2 * (double)n;
        }
        if (!class_7462.method_24828()) {
            d = Math.max(d, 0.65);
        }
        return d;
    }

    private boolean zbl(class_310 class_3102, class_746 class_7462) {
        int n = 192968214;
        n = Integer.rotateLeft(n * 59110985, 20) ^ 0xA5FB5978;
        n = System.identityHashCode(this) ^ n;
        class_746 class_7463 = class_7462;
        n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
        int n2 = n ^ 0xC2FA45A3;
        if ((n2 ^ n) != -1023785565) {
            int cfr_ignored_0 = (0xC97A33B5 ^ n) + 2142138194;
        }
        if (class_3102.field_1687 == null) {
            return false;
        }
        class_238 class_2383 = class_7462.method_5829().method_989(0.0, Double.longBitsToDouble(0x13B52844B65FA4L ^ 0xBFBD0D79AF33411CL), 0.0);
        return !class_3102.field_1687.method_8587((class_1297)class_7462, class_2383);
    }

    private static String jzf_2(String string, int n, int n2, int n3) {
        int n4 = -1323109347;
        n4 = Integer.rotateLeft(n4 * -1683969663, 10) ^ 0xE4C78961;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 23)) ^ 0x189D3C11;
        if ((n5 ^ n4) != 412957713) {
            int cfr_ignored_0 = (0xA9BFC80C ^ n4) + -1718160348;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x347345D9 ^ n2 ^ i * 1442370763 ^ hhj_2, 20) ^ rghh));
        }
        return new String(cArray);
    }

    private static boolean zqsh_2() {
        block0: {
            int n = btq_2.zshb_2(1898281299);
            int n2 = n ^ 0x2BD834EC;
            if ((n2 ^ n) == 735589612) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x5AFD4DBF ^ n, 14) - 151652700) * 1526549951;
        }
        return yf.khdha_2();
    }

    private static double shtha_2(class_746 class_7462) {
        block0: {
            int n = 877805284;
            int n2 = (n = Integer.rotateLeft(n * 617971877, 14) ^ 0xBEFBBFE7) ^ 0xAFDF0893;
            if ((n2 ^ n) == -1344337773) break block0;
            int cfr_ignored_0 = (0x9B8D3677 ^ n) + 638690677;
        }
        return class_7462.method_23318();
    }

    private static double syj_2(class_746 class_7462) {
        block0: {
            int n = -1038802283;
            int n2 = (n = Integer.rotateLeft(n * 488084949, 10) ^ 0x4BFEC0A4) ^ 0x356CB032;
            if ((n2 ^ n) == 896315442) break block0;
            int cfr_ignored_0 = (0xF77992A7 ^ n) - 1166282354;
        }
        return class_7462.method_23321();
    }

    private static boolean rns(class_2828 class_28282) {
        block0: {
            int n = -2041181513;
            n = Integer.rotateLeft(n * 1249603107, 11) ^ 0xB98332F7;
            class_2828 class_28283 = class_28282;
            n = (class_28283 != null ? System.identityHashCode(class_28283) : 0) ^ n;
            int n2 = n ^ 0x35307BFD;
            if ((n2 ^ n) == 892369917) break block0;
            int cfr_ignored_0 = (0xB366714A ^ n) - -435509040;
        }
        return class_28282.method_12273();
    }

    private static class_243 h_3(class_746 class_7462) {
        block0: {
            int n = btq_2.zshb_2(1101680758);
            int n2 = n ^ 0x2C937DCF;
            if ((n2 ^ n) == 747863503) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6D392DB9 ^ n, 16) + 1045047458) * 1832463801;
            int cfr_ignored_1 = (int)(0xAF8B838427D4EB4FL ^ (long)n ^ 0xFA78831A2DB8F2C6L);
        }
        return class_7462.method_18798();
    }

    private static String tfr_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = btq_2.zshb_2(-678895705);
            n4 = n2 ^ n4;
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 14)) ^ 0xE8AC45F8;
            if ((n5 ^ n4) == -391363080) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3F249A5F ^ n4, 10) - -1446227780) * 1059363423;
        }
        return shd_5.jzf_2(string, n, n2, n3);
    }

    private static String rhw_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 335014636;
            n4 = Integer.rotateLeft(n4 * -1263078877, 16) ^ 0x7C73BF72;
            n4 = Integer.rotateRight(n2 ^ n4, 29);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 25)) ^ 0xD9EBAB6F;
            if ((n5 ^ n4) == -638866577) break block0;
            int cfr_ignored_0 = (0xCA1C4183 ^ n4) + 250972648;
        }
        return shd_5.jzf_2(string, n, n2, n3);
    }

    private static boolean skk(String string, Object object) {
        block0: {
            int n = -150928779;
            int n2 = (n = Integer.rotateLeft(n * 2115371521, 23) ^ 0x125BC959) ^ 0xBE610608;
            if ((n2 ^ n) == -1100937720) break block0;
            int cfr_ignored_0 = (0x4960047D ^ n) + -820632040;
        }
        return string.equals(object);
    }

    private static double jy(long l) {
        block0: {
            int n = 2066604926;
            int n2 = (n = Integer.rotateLeft(n * -1076187253, 16) ^ 0xF1629263) ^ 0x8F789DB4;
            if ((n2 ^ n) == -1887920716) break block0;
            int cfr_ignored_0 = (0xF4557ECA ^ n) - 1292600444;
        }
        return Double.longBitsToDouble(l);
    }

    private static double tjt_2(long l) {
        block0: {
            int n = 999616468;
            n = Integer.rotateLeft(n * -633285399, 18) ^ 0x7926A739;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 4)) ^ 0xDF897694;
            if ((n2 ^ n) == -544639340) break block0;
            int cfr_ignored_0 = (0xE41D9940 ^ n) - -1163315681;
        }
        return Double.longBitsToDouble(l);
    }

    private static String sqsh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -621877332;
            n4 = Integer.rotateLeft(n4 * -213110333, 17) ^ 0x6387FAEC;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 16)) ^ 0xC7AADD03;
            if ((n5 ^ n4) == -945103613) break block0;
            int cfr_ignored_0 = (0x1D443AAF ^ n4) + -592944404;
        }
        return shd_5.jzf_2(string, n, n2, n3);
    }

    private static int bfgh(int n, int n2) {
        block0: {
            int n3 = 1307518550;
            n3 = Integer.rotateLeft(n3 * -979256661, 28) ^ 0x47165B1A;
            n3 = Integer.rotateRight(n ^ n3, 19);
            int n4 = (n3 = n2 ^ n3) ^ 0x78C60F8D;
            if ((n4 ^ n3) == 2026246029) break block0;
            int cfr_ignored_0 = (0x352929DB ^ n3) - -759332220;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static Double slz_3(double d) {
        block0: {
            int n = -600820614;
            n = Integer.rotateLeft(n * 658023193, 5) ^ 0x1C6F69C;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x1570FA4A;
            if ((n2 ^ n) == 359725642) break block0;
            int cfr_ignored_0 = (0xC940CE30 ^ n) + 740216535;
        }
        return d;
    }

    private static String tfd_4(String string, Object[] objectArray) {
        block0: {
            int n = 184533624;
            n = Integer.rotateLeft(n * -992492803, 4) ^ 0x7C681974;
            n = (objectArray != null ? System.identityHashCode(objectArray) : 0) ^ n;
            int n2 = n ^ 0xE0575332;
            if ((n2 ^ n) == -531147982) break block0;
            int cfr_ignored_0 = (0xEAA8914A ^ n) + 1949841794;
        }
        return String.format(string, objectArray);
    }

    private static String dhshs_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 3812310;
            n4 = Integer.rotateLeft(n4 * 1506232777, 8) ^ 0xF5811A7C;
            int n5 = (n4 = n3 ^ n4) ^ 0xF842DBFC;
            if ((n5 ^ n4) == -129836036) break block0;
            int cfr_ignored_0 = (0xF878F02A ^ n4) + 64442447;
        }
        return shd_5.jzf_2(string, n, n2, n3);
    }

    private static boolean djd(class_746 class_7462) {
        block0: {
            int n = -567789601;
            int n2 = (n = Integer.rotateLeft(n * -565427527, 9) ^ 0xDAF03DF9) ^ 0xFE8D5D9D;
            if ((n2 ^ n) == -24289891) break block0;
            int cfr_ignored_0 = (0x20A56A42 ^ n) + 1569087132;
        }
        return class_7462.method_5799();
    }

    private static boolean djh_2(class_746 class_7462) {
        block0: {
            int n = 1405071544;
            n = Integer.rotateLeft(n * -12581125, 8) ^ 0x1BDB8AB2;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x5B20C7CE;
            if ((n2 ^ n) == 1528874958) break block0;
            int cfr_ignored_0 = (0x89F7776 ^ n) - -1483522392;
        }
        return class_7462.method_6128();
    }

    private static double saq_3(long l) {
        block0: {
            int n = 1648081127;
            n = Integer.rotateLeft(n * -336443125, 14) ^ 0x929ACE83;
            int n2 = (n = (int)l ^ n) ^ 0xDF86E6F3;
            if ((n2 ^ n) == -544807181) break block0;
            int cfr_ignored_0 = (0xBDBD5E14 ^ n) + -1028453930;
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean sft(class_746 class_7462, class_6880 class_68802) {
        block0: {
            int n = -1762480734;
            int n2 = (n = Integer.rotateLeft(n * -98922183, 18) ^ 0x6FE41162) ^ 0x46439679;
            if ((n2 ^ n) == 1178834553) break block0;
            int cfr_ignored_0 = (0xD0B13BDB ^ n) + 822974065;
        }
        return class_7462.method_6059(class_68802);
    }

    private static class_1293 dkhm(class_746 class_7462, class_6880 class_68802) {
        block0: {
            int n = btq_2.zshb_2(-2092867357);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            class_6880 class_68803 = class_68802;
            n = Integer.rotateLeft((class_68803 != null ? System.identityHashCode(class_68803) : 0) ^ n, 20);
            int n2 = n ^ 0x9E32C0B;
            if ((n2 ^ n) == 165882891) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8AA24CE8 ^ n, 4) + -838537389;
        }
        return class_7462.method_6112(class_68802);
    }

    private static double ddha_2(long l) {
        block0: {
            int n = -163678719;
            n = Integer.rotateLeft(n * 291950223, 9) ^ 0xB295E7C0;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 15)) ^ 0xAC3C9B12;
            if ((n2 ^ n) == -1405314286) break block0;
            int cfr_ignored_0 = (0x5A02ED13 ^ n) - -1770394442;
        }
        return Double.longBitsToDouble(l);
    }

    private static String zkhsh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = btq_2.zshb_2(-98977447);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x6658DE96;
            if ((n5 ^ n4) == 1717100182) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9C4167CF ^ n4, 6) - -263638708;
        }
        return shd_5.jzf_2(string, n, n2, n3);
    }

    private static float dhsj(int n) {
        block0: {
            int n2 = 892281614;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1796799285, 12) ^ 0x6421ED91) ^ 0xCEE7A1BF;
            if ((n3 ^ n2) == -823680577) break block0;
            int cfr_ignored_0 = (0xFBC882B1 ^ n2) + 1032871755;
        }
        return Float.intBitsToFloat(n);
    }

    private static int shzj_2(int n, int n2) {
        block0: {
            int n3 = btq_2.zshb_2(-391426336);
            int n4 = (n3 = n2 ^ n3) ^ 0xC51C57F9;
            if ((n4 ^ n3) == -987998215) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x2DB71919 ^ n3, 8) + -1920358078) * 766974233;
            int cfr_ignored_1 = (int)(0xEF05B72427D4EB4FL ^ (long)n3 ^ 0x9338831A2DB873DAL);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int dthy_2(int n, int n2) {
        block0: {
            int n3 = -141577405;
            n3 = Integer.rotateLeft(n3 * 1191550807, 28) ^ 0xD24CA2AF;
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 11)) ^ 0x9CCDEF7A;
            if ((n4 ^ n3) == -1664225414) break block0;
            int cfr_ignored_0 = (0x6B425C39 ^ n3) + 1612127410;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int zza_5(int n) {
        block0: {
            int n2 = 506832702;
            int n3 = (n2 = Integer.rotateLeft(n2 * 68300127, 10) ^ 0xFA97C7BE) ^ 0x1E7128C4;
            if ((n3 ^ n2) == 510732484) break block0;
            int cfr_ignored_0 = (0x448FFA ^ n2) - 852993932;
        }
        return Integer.reverse(n);
    }

    private static double ghss_2(double d) {
        block0: {
            int n = btq_2.zshb_2(-1792016875);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x84D3E073;
            if ((n2 ^ n) == -2066489229) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x11FC1E66 ^ n, 5) - 837111189;
        }
        return Math.abs(d);
    }

    private static double djs(long l) {
        block0: {
            int n = -174894799;
            n = Integer.rotateLeft(n * 1733233521, 13) ^ 0x48018D12;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 20)) ^ 0x3F4C74B;
            if ((n2 ^ n) == 66373451) break block0;
            int cfr_ignored_0 = (0xF667967A ^ n) + 1732117948;
        }
        return Double.longBitsToDouble(l);
    }

    private static double khshk(long l) {
        block0: {
            int n = -1435099298;
            n = Integer.rotateLeft(n * -604750167, 18) ^ 0x9A6F7790;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 20)) ^ 0x95D062C8;
            if ((n2 ^ n) == -1781505336) break block0;
            int cfr_ignored_0 = (0x3FA67D96 ^ n) + -1678837329;
        }
        return Double.longBitsToDouble(l);
    }

    private static int zld_3(String string) {
        block0: {
            int n = -2023021889;
            n = Integer.rotateLeft(n * 1171316737, 4) ^ 0x60C0B051;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x5E0970F3;
            if ((n2 ^ n) == 1577677043) break block0;
            int cfr_ignored_0 = (0xD962524C ^ n) + -1658098954;
        }
        return string.hashCode();
    }

    private static boolean tws_2(String string, Object object) {
        block0: {
            int n = btq_2.zshb_2(1061425759);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
            int n2 = n ^ 0x7014E759;
            if ((n2 ^ n) == 1880418137) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x4F50F506 ^ n, 12) - -1624552715;
        }
        return string.equals(object);
    }

    private static double ttl(long l) {
        block0: {
            int n = 1565310716;
            int n2 = (n = Integer.rotateLeft(n * 1754518357, 18) ^ 0xE2455A62) ^ 0x15D01873;
            if ((n2 ^ n) == 365959283) break block0;
            int cfr_ignored_0 = (0x489CA68F ^ n) - 867439743;
        }
        return Double.longBitsToDouble(l);
    }

    private static String[] dhza_2(String string) {
        int n = -1043014528;
        int n2 = (n = Integer.rotateLeft(n * -278997347, 25) ^ 0xCE686909) ^ 0x15B44C04;
        if ((n2 ^ n) != 364137476) {
            int cfr_ignored_0 = (0xD4609084 ^ n) - 261388405;
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

    private static CallSite thkj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -87644223;
            n3 = Integer.rotateLeft(n3 * -155672683, 19) ^ 0xCABA26CC;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 22);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x44D2842F;
            if ((n4 ^ n3) != 1154647087) {
                int cfr_ignored_0 = (0xBE1423EE ^ n3) + 1920159161;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ rmz_2 ^ string.hashCode() ^ n2 + shthw + i * 875000509) + rmz_2) ^ shthw));
            }
            String[] stringArray = shd_5.dhza_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] a9zt112p7(String string) {
        return string.split("\u0007\u000e", -1);
    }

    private static CallSite te7gjn25a(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ft4ia6n00 ^ string.hashCode()) + (n2 + fj7sesm9ho3qp) + i ^ ft4ia6n00, 16) + fj7sesm9ho3qp);
            }
            String[] stringArray = shd_5.a9zt112p7(new String(cArray));
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

