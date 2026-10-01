/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.bhsh;
import us.m0vy.moondlc.m0vyguard.bhh_3;
import us.m0vy.moondlc.m0vyguard.sj;
import us.m0vy.moondlc.m0vyguard.yf;

public class bks_2 {
    private final Deque tam = new ArrayDeque();
    private long jdd = 0L;
    public double thmd_2 = 0.0;
    public double sshd = 0.0;
    public double tqh = 0.0;
    public double shash = 0.0;
    private static final int khma = 703858063;
    private static final int zwj = 68913623;
    private static final int rjy = 122386504;
    private static final int tqa_2 = 1087339485;
    private static final int r3u7l22 = -1184406515;
    private static final int wxm9rphu = 1944761553;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dqh5z1eqq;

    public void hbh() {
        int n = bhsh.rwa_2(1315590125);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x8575B3B6;
        if ((n2 ^ n) != -2055883850) {
            int cfr_ignored_0 = (Integer.rotateRight(0xCB1FFC5B ^ n, 12) + -1656934848) * -887096229;
        }
        this.tam.clear();
        this.jdd = 0L;
        this.thmd_2 = 0.0;
        this.sshd = 0.0;
        this.tqh = 0.0;
        this.shash = 0.0;
    }

    public List jrw(String string) {
        try {
            int n = 1041326823;
            n = Integer.rotateLeft(n * 1407916263, 13) ^ 0x64FA0936;
            n = System.identityHashCode(this) ^ n;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
            int n2 = n ^ 0x796CE8DA;
            if ((n2 ^ n) != 2037180634) {
                int cfr_ignored_0 = (0x477D8A3D ^ n) + 1732039907;
            }
            if ((0x10D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bks_2.shkhd_2()) {
            throw null;
        }
        ArrayList<sj> arrayList = new ArrayList<sj>();
        long l = bks_2.zqgh();
        if (this.jdd > 0L) {
            long l2 = l - this.jdd;
            this.jdd = l;
            if (l2 < (0x8188C59789D59680L ^ 0x8188C59789D5969EL) && l2 > 0L) {
                arrayList.add(new sj(bhh_3.tzt_2, "POLAR-CL".concat("ICK-D"), "Impossible Micro-Interval / Double-Click", Float.intBitsToFloat(0x985A61F8 ^ 0xA72FA377), bks_2.zhdh("Click interval %dms is below p".concat("hysical switch debounce threshold"), new Object[]{l2}), l2, bks_2.sbj_2(0xFB365299289F376AL ^ 0xBB085299289F376AL), bks_2.hfz_2("㐑ᛄꫀꔐ끣鬿梭庮犞\uda70ﲎٚŽ閧矦讟葜人㩌䧌뾛퍟뢸쳼㌰᧌ⴆꏷ끞鴑꘧慅痱", 947478585 - 2076171328, -837620790 + -1218032764, bks_2.slt_2(-863411302) ^ 0x89D6D538)));
            }
            this.tam.add(l2);
            if (this.tam.size() > Integer.rotateLeft(0x582B16BF ^ 0x582B1633, 30)) {
                this.tam.removeFirst();
            }
            if (this.tam.size() >= Integer.rotateLeft(0x6AF57387 ^ 0x6AF57380, 1)) {
                this.bhb(string, arrayList);
            }
        } else {
            this.jdd = l;
        }
        return arrayList;
    }

    private void bhb(String string, List list) {
        double d;
        double d2;
        double d3;
        int n = bhsh.rwa_2(-1007014189);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x61DD1B9D;
        if ((n2 ^ n) != 1641880477) {
            int cfr_ignored_0 = Integer.rotateRight(0xA227354E ^ n, 7) - -1491266643;
        }
        int n3 = this.tam.size();
        double d4 = 0.0;
        Iterator iterator = this.tam.iterator();
        while (iterator.hasNext()) {
            long l = (Long)iterator.next();
            d4 += (double)l;
        }
        this.shash = d3 = d4 / (double)n3;
        double d5 = 0.0;
        Iterator iterator2 = this.tam.iterator();
        while (iterator2.hasNext()) {
            long l = (Long)iterator2.next();
            double d6 = (double)l - d3;
            d5 += d6 * d6;
        }
        double d7 = d5 / (double)n3;
        this.tqh = d2 = Math.sqrt(d7);
        String string2 = string;
        int n4 = -1;
        switch (string2.hashCode()) {
            case 1838807491: {
                if (!bks_2.rtgh(string2, "Polar Enterprise")) break;
                n4 = 0;
                break;
            }
            case -1808119063: {
                if (!string2.equals("Strict")) break;
                n4 = 1;
                break;
            }
            case 1727163223: {
                if (!string2.equals("Lenient")) break;
                n4 = 2;
            }
        }
        switch (n4) {
            case 0: {
                double d8 = Double.longBitsToDouble(0x90DF006DFCD9DC99L ^ 0xD0C5006DFCD9DC99L);
                break;
            }
            case 1: {
                double d8 = Double.longBitsToDouble(0x14A0FF23DA298F7BL ^ 0x54B2FF23DA298F7BL);
                break;
            }
            case 2: {
                double d8 = Double.longBitsToDouble(0xDC9F9EE904196C19L ^ 0xE3679EE904196C19L);
                break;
            }
            default: {
                double d8 = d = bks_2.tjf(0x508DD91BDA0FF832L ^ 0x1085D91BDA0FF832L);
            }
        }
        if (d2 < d && n3 >= -430005752 + 430005768) {
            list.add(new sj(bhh_3.tzt_2, "POLAR-C".concat("LICK-C"), bks_2.khshkh("類덋ꆥ⛔᪌ウ쐧쮨뤚홬㽦䡏㲷轟葦败瘭ኽ\u001cࠫ\uda13煍搪毨馴떱齠ꠋ᳚⿠⎟쵙똿틡䃣䞦㭩凊", Integer.rotateLeft(0xB97DE526 ^ 0x161DC217, 1), bks_2.hbd(0x56F62846 ^ 0x80422B2B, 26), bks_2.dkhh_2(0xE6FAC19F ^ 0xF7D2960A, 6)), Float.intBitsToFloat(-1237397135 - 1993559122), String.format("Standard deviation of click intervals ".concat("collapsed (\u03c3: %.2fms < Min: %.2fms)"), bks_2.shhh_4(d2), d), d2, d, bks_2.khshkh("殎坒疞\udc92⎓ⷎ᧥늤鹜ꢊ号㿞䥁㩉캗쓨쮭ᙉĘ۷粐逑葦浓妽犤帥\udb14╃⨊᝹㐒ꂩꜴ鶑䇉䘊㳳倆쑏췭맄ኬ︵ࢃ﯅迓蕷訄圢瓕惍杴\ude54ⳏᠢ㑶鿧ꦤ骔긷䥾㬟侖씥쨧뜰풭", Integer.rotateLeft(0x9E037567 ^ 0x45933265, 4), bks_2.am(0xBE86795F ^ 0x15F5B24, 20), Integer.reverse(1365905066) ^ 0x1F65B3CE)));
        }
        if (d2 > Double.longBitsToDouble(0x4E7659C168331378L ^ 0x71263B8CBAC2BA84L) && n3 >= 1782231401 - 1782231381) {
            double d9 = 0.0;
            double d10 = 0.0;
            Iterator iterator3 = this.tam.iterator();
            while (iterator3.hasNext()) {
                long l = (Long)iterator3.next();
                double d11 = ((double)l - d3) / d2;
                d9 += d11 * d11 * d11;
                d10 += d11 * d11 * d11 * d11;
            }
            double d12 = d9 / (double)n3;
            double d13 = d10 / (double)n3;
            double d14 = d13 - Double.longBitsToDouble(0x2DC81716395366A5L ^ 0x6DC01716395366A5L);
            this.sshd = d12;
            this.thmd_2 = d14;
            if (d13 < bks_2.btw_2(0xD87E876E4ADE595DL ^ 0xE784E1082CB83F3BL)) {
                list.add(new sj(bhh_3.tzt_2, "POLAR-CLICK-A", bks_2.rad_4("Artificial Clamp".concat("ed Distribution (U"), "niform RNG Kurtosis)"), Float.intBitsToFloat(-1488817812 + -1742809534), bks_2.shzb("Click interval distribu".concat("tion is artificially flat").concat(" (Kurtosis: %.2f < Min: 1.65)"), new Object[]{d13}), d13, Double.longBitsToDouble(0xAD9176C08E14A599L ^ 0x926B10A6E872C3FFL), "Switch from uniform random(min".concat(", max) to right-skewed Log-Norm").concat("al or Weibull distribution.")));
            }
            if (Math.abs(d12) < bks_2.sghdh(0xC6B344BFB51104E1L ^ 0xF90DFCEE5E941A59L) && string.equals("Polar Ent".concat("erprise"))) {
                list.add(new sj(bhh_3.tzt_2, "POLA".concat("R-CLICK-B"), "Symmetric Randomizer Signature (Skewness Flaw)", Float.intBitsToFloat(Integer.reverse(515871670) ^ 0x5289FD78), String.format("Distribution lacks biological positive right-skew (Skewness: %.3f near 0)", d12), Math.abs(d12), Double.longBitsToDouble(0xFF36BF6EA7444053L ^ 0xC088073F4CC15EEBL), "Model neuromuscular fatigue with positive skewness (Ex-Gaussian / Log-Normal)."));
            }
        }
    }

    private static String khshkh(String string, int n, int n2, int n3) {
        int n4 = 631378415;
        int n5 = (n4 = Integer.rotateLeft(n4 * 869681053, 22) ^ 0x815BF77B) ^ 0xEAF12E3C;
        if ((n5 ^ n4) != -353292740) {
            int cfr_ignored_0 = (0xCF533FD3 ^ n4) - 1682332670;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xF05D9846) + khma ^ Integer.reverse(n2 + i * 1299931677), 4) - zwj);
        }
        return new String(cArray);
    }

    private static boolean shkhd_2() {
        block0: {
            int n = 1819794792;
            int n2 = (n = Integer.rotateLeft(n * -543557061, 22) ^ 0xBE395FDC) ^ 0xB7A9944E;
            if ((n2 ^ n) == -1213623218) break block0;
            int cfr_ignored_0 = (0xDBDE4926 ^ n) - 751750786;
        }
        return yf.dnkh();
    }

    private static long zqgh() {
        block0: {
            int n = 24245276;
            int n2 = (n = Integer.rotateLeft(n * -1775642363, 9) ^ 0x7570D74E) ^ 0x3B7CEDF1;
            if ((n2 ^ n) == 998043121) break block0;
            int cfr_ignored_0 = (0x3A0D19ED ^ n) - -852129460;
        }
        return System.currentTimeMillis();
    }

    private static String tdkh_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 549394510;
            n4 = Integer.rotateLeft(n4 * -827019249, 5) ^ 0x85AFABFD;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0x972C1C0C;
            if ((n5 ^ n4) == -1758716916) break block0;
            int cfr_ignored_0 = (0xB7930442 ^ n4) - 1445930355;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static String str_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1759102454;
            n4 = Integer.rotateLeft(n4 * -2112940423, 17) ^ 0x3A25D7E3;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 2)) ^ 0x811D3360;
            if ((n5 ^ n4) == -2128792736) break block0;
            int cfr_ignored_0 = (0x163B096A ^ n4) - 1168825450;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static String zhdh(String string, Object[] objectArray) {
        block0: {
            int n = 634404434;
            n = Integer.rotateLeft(n * 609304383, 8) ^ 0xE0AF556;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 15);
            n = (objectArray != null ? System.identityHashCode(objectArray) : 0) ^ n;
            int n2 = n ^ 0xE6274F1A;
            if ((n2 ^ n) == -433631462) break block0;
            int cfr_ignored_0 = (0xC3F77148 ^ n) + 523717571;
        }
        return String.format(string, objectArray);
    }

    private static double sbj_2(long l) {
        block0: {
            int n = 1024683973;
            n = Integer.rotateLeft(n * 569345431, 17) ^ 0xFBFA442A;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 28)) ^ 0x54470A21;
            if ((n2 ^ n) == 1413941793) break block0;
            int cfr_ignored_0 = (0x695465E4 ^ n) + -642924068;
        }
        return Double.longBitsToDouble(l);
    }

    private static int slt_2(int n) {
        block0: {
            int n2 = -2116649177;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1069645087, 10) ^ 0x88D13278) ^ 0xDF9B01C2;
            if ((n3 ^ n2) == -543489598) break block0;
            int cfr_ignored_0 = (0x5E4D7EE5 ^ n2) - 1002339112;
        }
        return Integer.reverse(n);
    }

    private static String hfz_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1950190737;
            n4 = Integer.rotateLeft(n4 * -1343265663, 13) ^ 0x3FEF70FF;
            n4 = n2 ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xAC728DED;
            if ((n5 ^ n4) == -1401778707) break block0;
            int cfr_ignored_0 = (0xD84F017C ^ n4) - -235780928;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static boolean rtgh(String string, Object object) {
        block0: {
            int n = bhsh.rwa_2(379854740);
            int n2 = n ^ 0x8EE4D741;
            if ((n2 ^ n) == -1897605311) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9840C8D5 ^ n, 6) - 1949692166) * -1740584747;
            int cfr_ignored_1 = (int)(0x5AF266E827D4EB4FL ^ (long)n ^ 0x30A0831A2DB91835L);
        }
        return string.equals(object);
    }

    private static String dhghj(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2004324869;
            n4 = Integer.rotateLeft(n4 * 880508367, 3) ^ 0xFCB560CB;
            n4 = Integer.rotateRight(n ^ n4, 28);
            int n5 = (n4 = n3 ^ n4) ^ 0x411DB890;
            if ((n5 ^ n4) == 1092466832) break block0;
            int cfr_ignored_0 = (0xC995D56B ^ n4) + 109995288;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static double tjf(long l) {
        block0: {
            int n = 1598987133;
            n = Integer.rotateLeft(n * 606945261, 10) ^ 0xB6474AB4;
            int n2 = (n = (int)l ^ n) ^ 0xA54AD244;
            if ((n2 ^ n) == -1521823164) break block0;
            int cfr_ignored_0 = (0xFA044939 ^ n) + 1470288104;
        }
        return Double.longBitsToDouble(l);
    }

    private static String hnn(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhsh.rwa_2(1361545272);
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 21)) ^ 0x4E11AF06;
            if ((n5 ^ n4) == 1309781766) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1F36273E ^ n4, 6) - -873701443) * 523642687;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static int hbd(int n, int n2) {
        block0: {
            int n3 = 1794539286;
            n3 = Integer.rotateLeft(n3 * -1028166879, 18) ^ 0xA8FC98C6;
            int n4 = (n3 = n2 ^ n3) ^ 0xC986B25F;
            if ((n4 ^ n3) == -913919393) break block0;
            int cfr_ignored_0 = (0xA370CD49 ^ n3) - -973700423;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int dkhh_2(int n, int n2) {
        block0: {
            int n3 = bhsh.rwa_2(1637779318);
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0xAE722AFD;
            if ((n4 ^ n3) == -1368249603) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCFECAD8B ^ n3, 12) + 839295760;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String bdhgh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhsh.rwa_2(-1922408803);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 3)) ^ 0x3657047;
            if ((n5 ^ n4) == 56979527) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8E0F2EDA ^ n4, 4) + 942951329) * -1911607589;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static Double shhh_4(double d) {
        block0: {
            int n = bhsh.rwa_2(-1203636746);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xF1373D45;
            if ((n2 ^ n) == -248038075) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4976C8B3 ^ n, 12) + -373297944) * 1232521395;
        }
        return d;
    }

    private static int am(int n, int n2) {
        block0: {
            int n3 = 1716565989;
            int n4 = (n3 = Integer.rotateLeft(n3 * 1804005387, 6) ^ 0x460F1807) ^ 0xD8E3637C;
            if ((n4 ^ n3) == -656186500) break block0;
            int cfr_ignored_0 = (0xBEB3D499 ^ n3) - -88280674;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static double btw_2(long l) {
        block0: {
            int n = bhsh.rwa_2(-111142795);
            int n2 = (n = Integer.rotateRight((int)l ^ n, 15)) ^ 0x5BD5D030;
            if ((n2 ^ n) == 1540739120) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA2B5C845 ^ n, 7) - -1201610858;
            int cfr_ignored_1 = (int)(0x6007667827D4EB4FL ^ (long)n ^ 0x3180831A2DB96DDFL);
        }
        return Double.longBitsToDouble(l);
    }

    private static String rad_4(String string, String string2) {
        block0: {
            int n = 998437063;
            n = Integer.rotateLeft(n * 1694251539, 24) ^ 0xDF3E3E48;
            String string3 = string2;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 3);
            int n2 = n ^ 0x31758E4E;
            if ((n2 ^ n) == 829787726) break block0;
            int cfr_ignored_0 = (0xAF77E89 ^ n) + -434371721;
        }
        return string.concat(string2);
    }

    private static String shzb(String string, Object[] objectArray) {
        block0: {
            int n = 2091584748;
            n = Integer.rotateLeft(n * 1798494395, 8) ^ 0x92F49108;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xC5483241;
            if ((n2 ^ n) == -985124287) break block0;
            int cfr_ignored_0 = (0xB9E33EAD ^ n) + -1045130201;
        }
        return String.format(string, objectArray);
    }

    private static String hzr_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhsh.rwa_2(-1291700850);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 2)) ^ 0x68107F27;
            if ((n5 ^ n4) == 1745911591) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xDB124AA9 ^ n4, 14) + -1953191502;
            int cfr_ignored_1 = (int)(0x19A0E49427D4EB4FL ^ (long)n4 ^ 0x3458831A2DB99E90L);
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static String bghr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1103039560;
            n4 = Integer.rotateLeft(n4 * 621891135, 28) ^ 0xD9A08236;
            n4 = Integer.rotateLeft(n ^ n4, 26);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 28)) ^ 0x87AB13E6;
            if ((n5 ^ n4) == -2018831386) break block0;
            int cfr_ignored_0 = (0x39EBE05E ^ n4) - -1008893178;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static String adl(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -987564260;
            n4 = Integer.rotateLeft(n4 * 1689626229, 16) ^ 0xFE9EFE95;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 25)) ^ 0x9A2E3949;
            if ((n5 ^ n4) == -1708246711) break block0;
            int cfr_ignored_0 = (0x5F0CCE55 ^ n4) + -149878486;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static double sghdh(long l) {
        block0: {
            int n = 1824836128;
            n = Integer.rotateLeft(n * -795396693, 9) ^ 0x4CB2E3F8;
            int n2 = (n = (int)l ^ n) ^ 0xFAD8F42B;
            if ((n2 ^ n) == -86445013) break block0;
            int cfr_ignored_0 = (0x961C3E0B ^ n) - 127861636;
        }
        return Double.longBitsToDouble(l);
    }

    private static String tff_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1464406048;
            n4 = Integer.rotateLeft(n4 * -663674403, 25) ^ 0xDEBD439C;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0x4C83FC13;
            if ((n5 ^ n4) == 1283718163) break block0;
            int cfr_ignored_0 = (0xE43513F3 ^ n4) - -1157214655;
        }
        return bks_2.khshkh(string, n, n2, n3);
    }

    private static String[] zzj_4(String string) {
        int n = bhsh.rwa_2(-351226569);
        int n2 = n ^ 0x7D614CFE;
        if ((n2 ^ n) != 2103528702) {
            int cfr_ignored_0 = Integer.rotateLeft(0x9671F9C9 ^ n, 5) + 1009442450;
            int cfr_ignored_1 = (int)(0x54C357F427D4EB4FL ^ (long)n ^ 0x5298831A2DB90457L);
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite adt_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -914295753;
            n3 = Integer.rotateLeft(n3 * -1230288069, 4) ^ 0x4A1AFFB5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 14);
            int n4 = n3 ^ 0x7795F5D5;
            if ((n4 ^ n3) != 2006316501) {
                int cfr_ignored_0 = (0xBE1501E2 ^ n3) + 152423442;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rjy ^ string.hashCode() ^ n2 + tqa_2 ^ i * -139846453 ^ rjy, 25) ^ tqa_2));
            }
            String[] stringArray = bks_2.zzj_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] p44s4mnl90gz(String string) {
        return string.split("\u0001\u000e", -1);
    }

    private static CallSite eif0gc3sz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ r3u7l22 ^ string.hashCode() ^ n2 + wxm9rphu ^ i * 584556507 ^ r3u7l22, 8) ^ wxm9rphu));
            }
            String[] stringArray = bks_2.p44s4mnl90gz(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

