/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.SimpleDateFormat
 *  lombok.Generated
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_3675
 *  net.minecraft.class_5250
 */
package us.m0vy.moondlc.m0vyguard;

import com.ibm.icu.text.SimpleDateFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import lombok.Generated;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_3675;
import net.minecraft.class_5250;
import us.m0vy.moondlc.m0vyguard.bshw;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tdhf;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.qt_2;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bzdh_2
implements tthy {
    private static final String hak_2 = "[â…]";
    private static final List khht_2;
    private static final List thdhn;
    private static final List jzkh;
    private static final List thrq;
    private static final SimpleDateFormat hry;
    private static final Random sham;
    private static final int thz_3 = 1350315953;
    private static final int shrz_2 = 886435636;
    private static final int zms_2 = -2008943150;
    private static final int zts_4 = 1094357103;
    private static final int azp2418fz0hl = -2081054813;
    private static final int e8a7612xm61ti = 440288884;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wptl3r9gup472e;

    public static String tmm_2() {
        int n = 2026006106;
        int n2 = (n = Integer.rotateLeft(n * -199767489, 12) ^ 0x5C26F961) ^ 0xB701A2B6;
        if ((n2 ^ n) != -1224629578) {
            int cfr_ignored_0 = (0xCFC3C4EC ^ n) - -1622216992;
        }
        String string = bzdh_2.thqf(khht_2);
        String string2 = bzdh_2.yd_2(thdhn);
        String string3 = bzdh_2.sza_4(jzkh);
        String string4 = bzdh_2.sza_4(thrq);
        String string5 = sham.nextInt(Integer.reverse(-1609314295) ^ 0x900BC861) < (Integer.reverse(-1685373854) ^ 0x463CD1C7) ? String.valueOf(-40311122 + 40313122 + sham.nextInt(1406496662 + -1406496636)) : "";
        ArrayList<String> arrayList = new ArrayList<String>();
        if (sham.nextBoolean()) {
            arrayList.add(string);
        }
        if (sham.nextBoolean()) {
            arrayList.add(string2);
        }
        if (sham.nextBoolean()) {
            arrayList.add(string3);
        }
        if (sham.nextBoolean()) {
            arrayList.add(string4);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(string);
        }
        if (arrayList.size() < 2) {
            arrayList.add(sham.nextBoolean() ? string2 : string3);
        }
        Object object = String.join((CharSequence)"", arrayList) + string5;
        object = sham.nextInt(0x78C3EF9D ^ 0x78C3EFF9) < Integer.rotateLeft(0x2D57FDC8 ^ 0xAD57FDCA, 3) ? (String)object + (sham.nextBoolean() ? "52" : "69") : (String)object + bzdh_2.rrth(2 + bzdh_2.jthdh(sham, 3));
        if (((String)object).length() > 1238239433 + -1238239417) {
            object = ((String)object).substring(((String)object).length() - Integer.rotateLeft(0x4A440E2A ^ 0x4A440EAA, 29));
        }
        return object;
    }

    public static String aght(double d) {
        int n = 2140533196;
        n = Integer.rotateLeft(n * -1221394889, 9) ^ 0xA400FFCF;
        n = (int)Double.doubleToLongBits(d) ^ n;
        int n2 = n ^ 0xDC1D9E9B;
        if ((n2 ^ n) != -602038629) {
            int cfr_ignored_0 = (0xA3886F57 ^ n) + -39063552;
        }
        if (d == (double)((int)d)) {
            return String.valueOf((int)d);
        }
        String string = bzdh_2.htsh_2("%.1f", new Object[]{d}).replace(",", ".").replaceAll("\\.?0+$", "");
        return string.endsWith(".") ? string.replace(bzdh_2.tzr_4("餙", bzdh_2.tkhz(0x44ED3823 ^ 0x8D41A2B1, 13), 0x817B3C8A ^ 0xB5770FED, 0x56D0D3FC ^ 0x2725C3DD), "") : string;
    }

    public static String twh_4(double d) {
        int n = 2082270148;
        n = Integer.rotateLeft(n * 815346363, 7) ^ 0xA8A1AA13;
        n = (int)Double.doubleToLongBits(d) ^ n;
        int n2 = n ^ 0xC7AF4D;
        if ((n2 ^ n) != 13086541) {
            int cfr_ignored_0 = (0x7CDB4489 ^ n) - -48915974;
        }
        return String.format("%.1f", d).replace(",", ".");
    }

    private static String sza_4(List list) {
        block0: {
            int n = 1611256970;
            n = Integer.rotateLeft(n * 1220905635, 17) ^ 0x9885B525;
            List list2 = list;
            n = Integer.rotateRight((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 12);
            int n2 = n ^ 0x60A3326E;
            if ((n2 ^ n) == 1621308014) break block0;
            int cfr_ignored_0 = (0xAAE6E4 ^ n) + 73086492;
        }
        return (String)list.get(sham.nextInt(list.size()));
    }

    private static String rrth(int n) {
        int n2 = 535605679;
        int n3 = (n2 = Integer.rotateLeft(n2 * -467338921, 8) ^ 0x12FEE206) ^ 0x9E82D745;
        if ((n3 ^ n2) != -1635592379) {
            int cfr_ignored_0 = (0x816E66EA ^ n2) + 2112767002;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            bzdh_2.azd(stringBuilder, sham.nextInt(bzdh_2.shgh_4(-1156940245) ^ 0xD47E50D7));
        }
        return stringBuilder.toString();
    }

    public static String shst_4(String string) {
        int n = -1104438898;
        n = Integer.rotateLeft(n * 1410115945, 6) ^ 0x128F419D;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xDE31E0B5;
        if ((n2 ^ n) != -567156555) {
            int cfr_ignored_0 = (0x601A793B ^ n) + -227114057;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (string.endsWith("\u0110\u00b0")) {
            return bzdh_2.tzr_4("禘过", Integer.reverse(-1252355261) ^ 0x88642D3E, bzdh_2.sdth_4(0x65783EC9 ^ 0xE075DBF7, 11), 1960153124 + -1766211935);
        }
        if (bzdh_2.dhww(string, "a")) {
            return "\u0110\u00b0";
        }
        if (string.endsWith("y")) {
            return "\u0110\u013e";
        }
        if (bzdh_2.rdt_3(string, "\u0143\u017d")) {
            return "o";
        }
        if (bzdh_2.dsd_7(string, "u")) {
            return "o";
        }
        if (string.endsWith(bzdh_2.tzr_4("ས", -1956267376 - -1422777209, Integer.rotateLeft(0x759BC497 ^ 0xF471CBD0, 10), bzdh_2.dhmgh(-544972012) ^ 0x23496F3E))) {
            return "\u0110\u00b0";
        }
        if (string.endsWith(bzdh_2.tzr_4("\ud827ຢ", 0x1FD8AC96 ^ 0xFBF83105, bzdh_2.jjd(-1119149400) ^ 0xB583219A, 198340592 - 4399403))) {
            return "\u0143\u2039";
        }
        return bzdh_2.amk(string, "\u0110\u00b8") ? "\u0143\u2039" : "";
    }

    public static String ata_4(float f) {
        try {
            int n = -1201653225;
            n = Integer.rotateLeft(n * 1318062831, 13) ^ 0x7221A0BC;
            int n2 = n ^ 0x7C76E98C;
            if ((n2 ^ n) != 2088167820) {
                int cfr_ignored_0 = (0xC416D39B ^ n) + 175746635;
            }
            if ((0x1DD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        double d = Math.abs(f);
        long l = (long)Math.floor(d);
        double d2 = d - (double)l;
        if (d2 > Double.longBitsToDouble(0x2076C7373E186F44L ^ 0x1E67E93CD63EB9D1L)) {
            return "\u0110\u00b0";
        }
        int n = (int)(l % (0x43FAA07B00982A6L ^ 0x43FAA07B00982C2L));
        if (n >= Integer.rotateLeft(0x3EFE36A8 ^ 0x3EFE3DA8, 24) && n <= -339408537 + 339408551) {
            return "\u0110\u013e\u0110\u02db";
        }
        return switch (n % (1718321403 + -1718321393)) {
            case 1 -> "";
            case 2, 3, 4 -> "\u0110\u00b0";
            default -> "\u0110\u013e\u0110\u02db";
        };
    }

    public static String ghdd(float f) {
        int n = 1498754759;
        n = Integer.rotateLeft(n * -992806211, 20) ^ 0x94109217;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x42D1981E;
        if ((n2 ^ n) != 1121032222) {
            int cfr_ignored_0 = (0x1B84B6D9 ^ n) - 394736200;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        tdhf tdhf2 = tr_2.hqs();
        return switch (bshw.hghh_2[tdhf2.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> bzdh_2.szkh_4(f);
            case 2 -> bzdh_2.jhs_3(f);
            case 3 -> bzdh_2.dys_3(f);
            case 4 -> bzdh_2.dhh_4(f);
        };
    }

    private static String sghr(float f) {
        long l;
        int n = -788850473;
        n = Integer.rotateLeft(n * -1264972853, 10) ^ 0xC94728B5;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xB23A6981;
        if ((n2 ^ n) != -1304794751) {
            int cfr_ignored_0 = (0x62C17156 ^ n) - 2097169290;
        }
        if (!yf.khdha_2()) {
            bzdh_2.shyf();
            throw null;
        }
        double d = Math.abs(f);
        double d2 = d - (double)(l = (long)Math.floor(d));
        if (d2 > Double.longBitsToDouble(0x7BBD8051C2861B20L ^ 0x45ACAE5A2AA0CDB5L)) {
            return "\u0110\u00b0";
        }
        int n3 = (int)(l % (0xEB1BA372A297A283L ^ 0xEB1BA372A297A2E7L));
        if (n3 >= (Integer.reverse(2029016510) ^ 0x7DAA0F15) && n3 <= 753310247 + -753310233) {
            return "\u0110\u013e\u0110\u02db";
        }
        return switch (n3 % Integer.rotateLeft(0x1BB00733 ^ 0x11B00733, 8)) {
            case 1 -> "";
            case 2, 3, 4 -> "\u0110\u00b0";
            default -> "\u0110\u013e\u0110\u02db";
        };
    }

    private static String shas_4(float f) {
        try {
            int n = 980853188;
            n = Integer.rotateLeft(n * -431053273, 11) ^ 0x6B06C134;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 20);
            int n2 = n ^ 0x63E111B2;
            if ((n2 ^ n) != 1675694514) {
                int cfr_ignored_0 = (0x5997B076 ^ n) - -1379717078;
            }
            if ((0x1F9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        double d = Math.abs(f);
        long l = (long)Math.floor(d);
        double d2 = d - (double)l;
        if (d2 > bzdh_2.dhh(0x5D2E6199B19C3AC8L ^ 0x633F4F9259BAEC5DL)) {
            return "\u0110\u00b8";
        }
        int n = (int)(l % (0x46E03B8DCBA1BE66L ^ 0x46E03B8DCBA1BE02L));
        if (n >= (Integer.reverse(1582866948) ^ 0x20451A71) && n <= (0x572F6D8B ^ 0x572F6D85)) {
            return bzdh_2.tzr_4("㿩ۊൡ", bzdh_2.hkhz(-2058727084) ^ 0xA9C10A60, -199339814 + 1818736934, Integer.rotateLeft(0xA5F26CAD ^ 0x4B7FEB61, 6));
        }
        return switch (n % (0xF435C20D ^ 0xF435C207)) {
            case 1 -> "";
            case 2, 3, 4 -> "\u0110\u00b8";
            default -> "\u0143\u2013\u0110\u02db";
        };
    }

    private static String dys_3(float f) {
        try {
            int n = -2107921227;
            n = Integer.rotateLeft(n * 561396571, 7) ^ 0xD2051EF1;
            int n2 = n ^ 0x67230FD9;
            if ((n2 ^ n) != 1730351065) {
                int cfr_ignored_0 = (0xE578A36C ^ n) + -1179322552;
            }
            if ((0x320 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        double d = Math.abs(f);
        long l = (long)Math.floor(d);
        double d2 = d - (double)l;
        if (d2 > Double.longBitsToDouble(0xEED3CAA9B91BE4CFL ^ 0xD0C2E4A2513D325AL)) {
            return "y";
        }
        if (l == 1L) {
            return "";
        }
        return l >= (0xDDC5729797DAAC51L ^ 0xDDC5729797DAAC53L) && l <= (0x9EE67A5C9209014FL ^ 0x9EE67A5C9209014BL) ? "y" : "\u0102\u0142w";
    }

    private static String dhh_4(float f) {
        double d;
        int n = 673334951;
        int n2 = (n = Integer.rotateLeft(n * 443313001, 21) ^ 0xA4514F71) ^ 0x9625E1A9;
        if ((n2 ^ n) != -1775902295) {
            int cfr_ignored_0 = (0xBE07A70E ^ n) + -1243223528;
        }
        return (d = (double)Math.abs(f)) == 1.0 ? "" : "s";
    }

    public static String ddhn_2(int n) {
        int n2 = -1059574227;
        n2 = Integer.rotateLeft(n2 * 1807829285, 19) ^ 0x93082D8B;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 8)) ^ 0x9DF0520B;
        if ((n3 ^ n2) != -1645194741) {
            int cfr_ignored_0 = (0x5D287C26 ^ n2) + 1020621243;
        }
        if (n >= 0 && n <= Integer.rotateLeft(0x8157551C ^ 0x82D7551C, 9)) {
            return switch (n) {
                case 0 -> "LMB";
                case 1 -> "RMB";
                case 2 -> "MMB";
                case 3 -> "MOUSE4";
                case 4 -> "MOUSE5";
                case 5 -> "MOUSE6";
                case 6 -> "MOUSE7";
                case 7 -> "MOUSE8";
                default -> "MOUSE" + n;
            };
        }
        if (n <= -1 || n == 0) {
            return "n/a";
        }
        String string = class_3675.method_15985((int)n, (int)-1).method_1441();
        if ((string = string.replace("key.k".concat("eyboard."), "").replace("key.", "").replace(".", "").replace("left", "l").replace("right", "r").replace("printscreen", "prtsc").replace("graveaccent", "grave").replace("control", "ctrl")).equalsIgnoreCase("none") || string.equalsIgnoreCase("unknown") || string.isEmpty()) {
            return "n/a";
        }
        return string.toUpperCase();
    }

    public static String bjd_2() {
        int n = 899051513;
        int n2 = (n = Integer.rotateLeft(n * 1507602893, 22) ^ 0x1726D374) ^ 0xCBE641BB;
        if ((n2 ^ n) != -874102341) {
            int cfr_ignored_0 = (0xFE702E42 ^ n) + 259912596;
        }
        return hry.format(new Date());
    }

    public static String rghkh() {
        int n = 1011745168;
        int n2 = (n = Integer.rotateLeft(n * 941057163, 14) ^ 0xA40856E7) ^ 0x7AB96E0;
        if ((n2 ^ n) != 128685792) {
            int cfr_ignored_0 = (0x3BE59770 ^ n) + 1229699618;
        }
        LocalDate localDate = LocalDate.now();
        String[] stringArray = new String[-871189446 + 871189453];
        stringArray[0] = "time.days.monday";
        stringArray[1] = "time.da".concat("ys.tuesday");
        stringArray[2] = "time.days".concat(".wednesday");
        stringArray[3] = "time.days.thursday";
        stringArray[4] = "time.days.friday";
        stringArray[5] = "time.days.saturday";
        stringArray[-675425437 - -675425443] = "time.da".concat("ys.sunday");
        String[] stringArray2 = stringArray;
        String[] stringArray3 = new String[0xAE0DFF83 ^ 0xAE0DFF8F];
        stringArray3[0] = "time.months.january";
        stringArray3[1] = "time.months.february";
        stringArray3[2] = "time.months.march";
        stringArray3[3] = "time.months.april";
        stringArray3[4] = "time.months.may";
        stringArray3[5] = "time.months.june";
        stringArray3[0x535C572D ^ 0x535C572B] = "time.m".concat("onths.july");
        stringArray3[Integer.reverse((int)-1699369833) ^ 0xE935AD5E] = "time.months.august";
        stringArray3[0x4AF0C6CC ^ 0x4AF0C6C4] = "time.months".concat(".september");
        stringArray3[-27808033 - -27808042] = "time.months.october";
        stringArray3[-2005775870 - -2005775880] = "time.mont".concat("hs.november");
        stringArray3[-1474292263 - -1474292274] = "time.mon".concat("ths.december");
        String[] stringArray4 = stringArray3;
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String string = tr_2.ttq_3(stringArray2[dayOfWeek.getValue() - 1]);
        int n3 = localDate.getDayOfMonth();
        Month month = localDate.getMonth();
        String string2 = tr_2.ttq_3(stringArray4[month.getValue() - 1]);
        return String.format("%s, %d %s", string, n3, string2);
    }

    public static void sghkh(String string) {
        int n = qt_2.jbs(1221659448);
        int n2 = n ^ 0xCBC7E755;
        if ((n2 ^ n) != -876091563) {
            int cfr_ignored_0 = Integer.rotateLeft(0x8316EC6D ^ n, 3) - -467386258;
            int cfr_ignored_1 = (int)(0x41A4425027D4EB4FL ^ (long)n ^ 0x79D0831A2DB92E99L);
        }
        bzdh_2.mc.field_1774.method_1455(string);
    }

    /*
     * Unable to fully structure code
     */
    public static class_5250 rsh_3(String var0) {
        var4_1 = null;
        var7_2 = 0;
        var5_3 = -586144098;
        var5_3 = Integer.rotateLeft(var5_3 * 1691528957, 22) ^ 325120296;
        v0 = var0;
        var5_3 = Integer.rotateLeft((v0 != null ? System.identityHashCode(v0) : 0) ^ var5_3, 24);
        var6_4 = -1884307307 * -1795246685 + -2035132843 ^ var5_3;
        block34: while (true) {
            if ((var7_2 = ((var6_4 ^ var5_3) - -2035132843) * 1057498635) == 575546856) ** GOTO lbl-1000
            if (var7_2 == 298040302) ** GOTO lbl189
            if (var7_2 != 724739165) {
                if (var7_2 == -1884307307) {
                    Integer.rotateLeft(-1679541400 ^ var5_3, 6) + -452931373;
                    if (yf.dnkh()) {
                        try {
                            if ((-1352460411197800735L ^ (long)var5_3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var6_4 = -1091723391 * -1795246685 + -2035132843 ^ var5_3;
                        }
                        catch (UnsupportedOperationException v1) {
                            var6_4 = Integer.reverse(Integer.reverse(-1091723391 * -1795246685 + -2035132843 ^ var5_3));
                        }
                        --var7_2;
                        continue;
                    }
                    var6_4 = -538118567 * -1795246685 + -2035132843 ^ var5_3 ^ -1038011566 ^ -1038011566;
                    var7_2 += 2;
                    continue;
                }
                switch (var7_2) {
                    case -538118567: {
                        (Integer.rotateLeft(663055413 ^ var5_3, 7) - -846874202) * 663055413;
                        (int)(-1929860575021175985L ^ (long)var5_3 ^ 8746134624812951486L);
                        if (!var0.startsWith("[\u00e2\u0098\u2026]")) {
                            try {
                                --var7_2;
                                var6_4 = 1095526423 * -1795246685 + -2035132843 ^ var5_3 ^ 1500179579 ^ 1500179579;
                            }
                            catch (ArithmeticException v2) {
                                var6_4 = 1095526423 * -1795246685 + -2035132843 ^ var5_3;
                            }
                            var7_2 += 2;
                            continue block34;
                        }
                        try {
                            if ((5421523832164070111L ^ (long)var5_3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var6_4 = 1678606479 * -1795246685 + -2035132843 ^ var5_3 ^ -1692379848 ^ -1692379848;
                        }
                        catch (UnsupportedOperationException v3) {
                            var6_4 = (int)((long)(1678606479 * -1795246685 + -2035132843 ^ var5_3) ^ 5720943272137327832L ^ 5720943272137327832L);
                        }
                        var7_2 += 2;
                        continue block34;
                    }
                    case 1095526423: {
                        Integer.rotateRight(-417628601 ^ var5_3, 15) - 11659732;
                        var4_1 = class_2561.method_43470((String)var0);
                        (int)(-1060234275363763155L ^ (long)var5_3 ^ 7522894619457900355L);
                        var6_4 = (int)((long)(1473513031 * -1795246685 + -2035132843 ^ var5_3) ^ -8611449873580646279L ^ -8611449873580646279L);
                        (int)(344841632502608145L ^ (long)var5_3 ^ -4452284762152393661L);
                        var6_4 = -1413468070 * -1795246685 + -2035132843 ^ var5_3 ^ 164433239 ^ 164433239;
                        var7_2 -= 4;
                        continue block34;
                    }
                    case -1091723391: {
                        Integer.rotateRight(-236466426 ^ var5_3, 17) - 1332719861;
                        throw null;
                    }
                    case 1678606479: {
                        Integer.rotateLeft(1069001737 ^ var5_3, 10) + -1147440046;
                        (int)(-214762984200410289L ^ (long)var5_3 ^ -497503610364995621L);
                        var1_5 = var0.substring("[\u00e2\u0098\u2026]".length());
                        var2_6 = class_2561.method_43470((String)"[\u00e2\u0098\u2026]").method_27692(class_124.field_1061);
                        var3_7 = class_2561.method_43470((String)var1_5).method_27692(class_124.field_1065);
                        var4_1 = class_2561.method_43470((String)"").method_10852((class_2561)var2_6).method_10852((class_2561)var3_7);
                        (int)(7426616435466652707L ^ (long)var5_3 ^ -5338627506693905424L);
                        var6_4 = (int)((long)(-1413468070 * -1795246685 + -2035132843 ^ var5_3) ^ 6097209022744904101L ^ 6097209022744904101L);
                        --var7_2;
                        continue block34;
                    }
                }
            }
            ** GOTO lbl179
lbl-1000:
            // 1 sources

            {
                (Integer.rotateRight(1979793330 ^ var5_3, 17) + 1317295561) * 1979793331;
                var6_4 = (int)((long)(1843651870 * -1795246685 + -2035132843 ^ var5_3) ^ 7667937793172031756L ^ 7667937793172031756L);
                Integer.rotateLeft(697671269 ^ var5_3, 8) - 226217334;
                (int)(-1502178795521250481L ^ (long)var5_3 ^ -7079514465766966369L);
                var6_4 = (int)((long)(-1884307307 * -1795246685 + -2035132843 ^ var5_3) ^ -7811450159887864214L ^ -7811450159887864214L);
                var7_2 -= 3;
                continue block34;
                case 1944371897: {
                    Integer.rotateLeft(-1030846943 ^ var5_3, 11) + -1818239686;
                    (int)(16932599995099983L ^ (long)var5_3 ^ -5960369958365319767L);
                    var6_4 = -311962987 * -1795246685 + -2035132843 ^ var5_3 ^ 1573814635 ^ 1573814635;
                    Integer.rotateLeft(-142377856 ^ var5_3, 17) + -45501765;
                    try {
                        if ((927804961833648785L ^ (long)var5_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var6_4 = (-1884307307 * -1795246685 + -2035132843 ^ var5_3) + 1663662344 - 1663662344;
                    }
                    catch (IllegalStateException v4) {
                        var6_4 = -1884307307 * -1795246685 + -2035132843 ^ var5_3;
                    }
                    ++var7_2;
                    continue block34;
                }
                case -512374308: {
                    Integer.rotateLeft(1433634404 ^ var5_3, 13) - 1566238039;
                    var6_4 = Integer.reverse(Integer.reverse(1217030366 * -1795246685 + -2035132843 ^ var5_3));
                    (Integer.rotateLeft(450013428 ^ var5_3, 6) - 1138758855) * 450013429;
                    try {
                        var7_2 += 3;
                        if ((-4525304610408876787L ^ (long)var5_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var6_4 = (-1884307307 * -1795246685 + -2035132843 ^ var5_3) + -1852752081 - -1852752081;
                    }
                    catch (NoSuchElementException v5) {
                        var6_4 = (-1884307307 * -1795246685 + -2035132843 ^ var5_3) + 1285538462 - 1285538462;
                    }
                    var7_2 -= 4;
                    continue block34;
                }
                case -1308597428: {
                    Integer.rotateRight(1017530406 ^ var5_3, 10) - 1551915989;
                    var6_4 = -1700209764 * -1795246685 + -2035132843 ^ var5_3;
                    Integer.rotateRight(1805808579 ^ var5_3, 16) + 218735576;
                    var6_4 = (-1884307307 * -1795246685 + -2035132843 ^ var5_3) + -140253256 - -140253256;
                    continue block34;
                }
                case 200033529: {
                    (Integer.rotateRight(1569784438 ^ var5_3, 14) - 1491921797) * 1569784439;
                    try {
                        var7_2 += 2;
                        if ((7180946170520788213L ^ (long)var5_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var6_4 = -1884307307 * -1795246685 + -2035132843 ^ var5_3;
                    }
                    catch (IllegalStateException v6) {
                        var6_4 = (-1884307307 * -1795246685 + -2035132843 ^ var5_3) + 820741698 - 820741698;
                    }
                    var7_2 += 5;
                    continue block34;
                }
                case -352584184: {
                    Integer.rotateLeft(1186157280 ^ var5_3, 11) + -1810585509;
                    var6_4 = 1772974940 * -1795246685 + -2035132843 ^ var5_3 ^ -1848132829 ^ -1848132829;
                    (Integer.rotateRight(-489599470 ^ var5_3, 15) + 2075530089) * -489599469;
                    try {
                        var7_2 -= 5;
                        if ((6165337949305608737L ^ (long)var5_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var6_4 = (int)((long)(-1884307307 * -1795246685 + -2035132843 ^ var5_3) ^ 6494133235092350926L ^ 6494133235092350926L);
                    }
                    catch (NoSuchElementException v7) {
                        var6_4 = Integer.reverse(Integer.reverse(-1884307307 * -1795246685 + -2035132843 ^ var5_3));
                    }
                    var7_2 -= 4;
                    continue block34;
                }
                case 759295468: {
                    (Integer.rotateLeft(956186961 ^ var5_3, 10) + -349730806) * 956186961;
                    (int)(-410690218193786033L ^ (long)var5_3 ^ 2569447735874312520L);
                    var6_4 = (1772130858 * -1795246685 + -2035132843 ^ var5_3) + 279958160 - 279958160;
                    Integer.rotateRight(-1793832017 ^ var5_3, 5) - 299026796;
                    try {
                        if ((5249119502429500845L ^ (long)var5_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var6_4 = (-1884307307 * -1795246685 + -2035132843 ^ var5_3) + -1721921130 - -1721921130;
                    }
                    catch (IllegalArgumentException v8) {
                        var6_4 = -1884307307 * -1795246685 + -2035132843 ^ var5_3;
                    }
                    continue block34;
                }
lbl179:
                // 1 sources

                Integer.rotateRight(1867565926 ^ var5_3, 16) - 2133213333;
                var6_4 = (-206432203 * -1795246685 + -2035132843 ^ var5_3) + 140112972 - 140112972;
                Integer.rotateRight(1733977071 ^ var5_3, 15) - -2008041172;
                var6_4 = (int)((long)(-1884307307 * -1795246685 + -2035132843 ^ var5_3) ^ 823641081595088109L ^ 823641081595088109L);
                (Integer.rotateRight(1659873722 ^ var5_3, 15) + -10277695) * 1659873723;
                --var7_2;
                continue block34;
lbl189:
                // 1 sources

                (Integer.rotateRight(-923239373 ^ var5_3, 12) + 1517594984) * -923239373;
                (int)(-3331337477316520558L ^ (long)var5_3 ^ -7990204293955056040L);
                var6_4 = 108805660 * -1795246685 + -2035132843 ^ var5_3 ^ 805181325 ^ 805181325;
                (int)(4776272432200394221L ^ (long)var5_3 ^ -8538399224906307264L);
                var6_4 = -1884307307 * -1795246685 + -2035132843 ^ var5_3;
                var7_2 += 2;
                continue block34;
                case 1181979298: {
                    Integer.rotateLeft(-2100214419 ^ var5_3, 3) - -608893074;
                    (int)(4639810770619919183L ^ (long)var5_3 ^ 3157167487246216470L);
                    try {
                        var7_2 -= 3;
                        var6_4 = (int)((long)(-1884307307 * -1795246685 + -2035132843 ^ var5_3) ^ -7563207164030817695L ^ -7563207164030817695L);
                    }
                    catch (ArithmeticException v9) {
                        var6_4 = (int)((long)(-1884307307 * -1795246685 + -2035132843 ^ var5_3) ^ 1667252889362866346L ^ 1667252889362866346L);
                    }
                    ++var7_2;
                    continue block34;
                }
                case 833103135: {
                    Integer.rotateLeft(1924253289 ^ var5_3, 17) + -404445710;
                    (int)(-5763648387449296049L ^ (long)var5_3 ^ 3303534475135733207L);
                    var6_4 = (-1449075020 * -1795246685 + -2035132843 ^ var5_3) + -161476728 - -161476728;
                    Integer.rotateLeft(-1603054268 ^ var5_3, 7) - 1918169719;
                    var6_4 = 1734821905 * -1795246685 + -2035132843 ^ var5_3;
                    (Integer.rotateLeft(707454205 ^ var5_3, 8) - 529488350) * 707454205;
                    (int)(-1686515871287809201L ^ (long)var5_3 ^ 7561687922814516449L);
                    var6_4 = (-1884307307 * -1795246685 + -2035132843 ^ var5_3) + 951572907 - 951572907;
                    var7_2 -= 5;
                    continue block34;
                }
                case -302327161: {
                    Integer.rotateRight(-1264342138 ^ var5_3, 9) - -466656139;
                    var6_4 = (517943771 * -1795246685 + -2035132843 ^ var5_3) + 1638835275 - 1638835275;
                    Integer.rotateRight(1136490447 ^ var5_3, 11) - 944709964;
                    (int)(-6149343143185347757L ^ (long)var5_3 ^ -5437229740060510077L);
                    var6_4 = 501884647 * -1795246685 + -2035132843 ^ var5_3;
                    (int)(3388843397139970046L ^ (long)var5_3 ^ -3221754497804274722L);
                    var6_4 = (int)((long)(-1884307307 * -1795246685 + -2035132843 ^ var5_3) ^ -1355752981754681288L ^ -1355752981754681288L);
                    var7_2 += 2;
                    continue block34;
                }
                case -1413468070: {
                    return var4_1;
                }
            }
            (Integer.rotateLeft(1747712112 ^ var5_3, 16) + -1582254901) * 1747712113;
            var6_4 = Integer.reverse(Integer.reverse(-1884307307 * -1795246685 + -2035132843 ^ var5_3));
        }
    }

    @Generated
    private bzdh_2() {
        throw new UnsupportedOperationException("This is a util".concat("ity class and ca").concat("nnot be instantiated"));
    }

    private static String tzr_4(String string, int n, int n2, int n3) {
        int n4 = qt_2.jbs(1042450823);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 12)) ^ 0x83F20BF2;
        if ((n5 ^ n4) != -2081289230) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xBDD08275 ^ n4, 10) - 10316646) * -1110408587;
            int cfr_ignored_1 = (int)(0x7F622C4827D4EB4FL ^ (long)n4 ^ 0xA5E0831A2DB95315L);
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x99C28672 ^ n2 ^ i * -27906113 ^ thz_3, 5) ^ shrz_2));
        }
        return new String(cArray);
    }

    private static String thqf(List list) {
        block0: {
            int n = 1493565687;
            n = Integer.rotateLeft(n * 770459743, 17) ^ 0x5D62C153;
            List list2 = list;
            n = (list2 != null ? System.identityHashCode(list2) : 0) ^ n;
            int n2 = n ^ 0x7D804EC7;
            if ((n2 ^ n) == 2105560775) break block0;
            int cfr_ignored_0 = (0x24864E30 ^ n) + -162832250;
        }
        return bzdh_2.sza_4(list);
    }

    private static String yd_2(List list) {
        block0: {
            int n = qt_2.jbs(1813066250);
            List list2 = list;
            n = Integer.rotateLeft((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 23);
            int n2 = n ^ 0x1017C6D4;
            if ((n2 ^ n) == 269993684) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x7C06F4DE ^ n, 18) - 154486301) * 2080830687;
        }
        return bzdh_2.sza_4(list);
    }

    private static String tyn_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1946866332;
            n4 = Integer.rotateLeft(n4 * 1655845569, 25) ^ 0x7C43B209;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0x5CC217B1;
            if ((n5 ^ n4) == 1556223921) break block0;
            int cfr_ignored_0 = (0x28C8C52D ^ n4) + 896743912;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static String hsgh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1801612015;
            n4 = Integer.rotateLeft(n4 * 821094197, 8) ^ 0xE1997D45;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x60EC794D;
            if ((n5 ^ n4) == 1626110285) break block0;
            int cfr_ignored_0 = (0xB8E13A2 ^ n4) + 229853030;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static int jthdh(Random random, int n) {
        block0: {
            int n2 = 707478071;
            int n3 = (n2 = Integer.rotateLeft(n2 * -372430153, 12) ^ 0x6A6B4CA0) ^ 0xA3E481BF;
            if ((n3 ^ n2) == -1545305665) break block0;
            int cfr_ignored_0 = (0x89CFC388 ^ n2) - -182688103;
        }
        return random.nextInt(n);
    }

    private static String bks_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1966612530;
            n4 = Integer.rotateLeft(n4 * -758817803, 10) ^ 0x992B053D;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 15);
            int n5 = (n4 = n ^ n4) ^ 0xAF4BF56E;
            if ((n5 ^ n4) == -1353976466) break block0;
            int cfr_ignored_0 = (0x258C2AA0 ^ n4) + 1460118810;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static String htsh_2(String string, Object[] objectArray) {
        block0: {
            int n = 2080617723;
            int n2 = (n = Integer.rotateLeft(n * 233876047, 20) ^ 0x9BE6566C) ^ 0x43F64009;
            if ((n2 ^ n) == 1140211721) break block0;
            int cfr_ignored_0 = (0x3FF5F4F2 ^ n) - -2138094918;
        }
        return String.format(string, objectArray);
    }

    private static String dhth_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = qt_2.jbs(540130557);
            n4 = Integer.rotateLeft(n ^ n4, 26);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 15)) ^ 0x8880E9E8;
            if ((n5 ^ n4) == -2004817432) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA8B15515 ^ n4, 8) - 1909910726) * -1464773355;
            int cfr_ignored_1 = (int)(0x6A03FB2827D4EB4FL ^ (long)n4 ^ 0xB20831A2DB979D6L);
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static String tfd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1595321690;
            n4 = Integer.rotateLeft(n4 * -402843609, 3) ^ 0xB209E536;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 7)) ^ 0x12684F03;
            if ((n5 ^ n4) == 308825859) break block0;
            int cfr_ignored_0 = (0xB2811DA5 ^ n4) + -612450483;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static String sdhf_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1276863991;
            n4 = Integer.rotateLeft(n4 * 62727433, 21) ^ 0xB5171F5B;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 13);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 6)) ^ 0x16EDAEE9;
            if ((n5 ^ n4) == 384675561) break block0;
            int cfr_ignored_0 = (0xA50934E0 ^ n4) - -1770870487;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static int tkhz(int n, int n2) {
        block0: {
            int n3 = qt_2.jbs(-133358634);
            n3 = Integer.rotateLeft(n ^ n3, 14);
            int n4 = (n3 = n2 ^ n3) ^ 0xE24CC185;
            if ((n4 ^ n3) == -498286203) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1A41DA53 ^ n3, 6) + 844566344) * 440523347;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String sds_6(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 768244496;
            n4 = Integer.rotateLeft(n4 * 987412655, 19) ^ 0xCAF37588;
            n4 = n2 ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xD8E9E078;
            if ((n5 ^ n4) == -655761288) break block0;
            int cfr_ignored_0 = (0xF5239B68 ^ n4) + 932216338;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static int shgh_4(int n) {
        block0: {
            int n2 = -1732334296;
            int n3 = (n2 = Integer.rotateLeft(n2 * 144555979, 15) ^ 0xC29506A7) ^ 0x34844957;
            if ((n3 ^ n2) == 881084759) break block0;
            int cfr_ignored_0 = (0xAC3AE47F ^ n2) + 749624125;
        }
        return Integer.reverse(n);
    }

    private static StringBuilder azd(StringBuilder stringBuilder, int n) {
        block0: {
            int n2 = -1654896189;
            n2 = Integer.rotateLeft(n2 * -137085035, 6) ^ 0xD5D34B58;
            StringBuilder stringBuilder2 = stringBuilder;
            n2 = (stringBuilder2 != null ? System.identityHashCode(stringBuilder2) : 0) ^ n2;
            int n3 = n2 ^ 0x6E97E575;
            if ((n3 ^ n2) == 1855448437) break block0;
            int cfr_ignored_0 = (0xF3CBACB6 ^ n2) - 660165273;
        }
        return stringBuilder.append(n);
    }

    private static int sdth_4(int n, int n2) {
        block0: {
            int n3 = -1865185738;
            n3 = Integer.rotateLeft(n3 * -926535093, 24) ^ 0x65C530D7;
            int n4 = (n3 = n ^ n3) ^ 0x9C16AA28;
            if ((n4 ^ n3) == -1676236248) break block0;
            int cfr_ignored_0 = (0xCC52C1E ^ n3) + 556338485;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean dhww(String string, String string2) {
        block0: {
            int n = 407685251;
            n = Integer.rotateLeft(n * 86928903, 13) ^ 0x40430D2A;
            String string3 = string;
            n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 14);
            int n2 = n ^ 0x50A939BB;
            if ((n2 ^ n) == 1353267643) break block0;
            int cfr_ignored_0 = (0x48E5F138 ^ n) - -228275303;
        }
        return string.endsWith(string2);
    }

    private static String khdj(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1797465530;
            n4 = Integer.rotateLeft(n4 * 1952395549, 26) ^ 0x18D1ABC4;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 8)) ^ 0xC109C57C;
            if ((n5 ^ n4) == -1056324228) break block0;
            int cfr_ignored_0 = (0x55D51F3A ^ n4) + 1098519741;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static boolean rdt_3(String string, String string2) {
        block0: {
            int n = 1528168278;
            n = Integer.rotateLeft(n * -25453181, 6) ^ 0x34D4322C;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x1BF85C1D;
            if ((n2 ^ n) == 469261341) break block0;
            int cfr_ignored_0 = (0x40EDA34B ^ n) - 2099885856;
        }
        return string.endsWith(string2);
    }

    private static boolean dsd_7(String string, String string2) {
        block0: {
            int n = 1072620410;
            int n2 = (n = Integer.rotateLeft(n * -1935238081, 27) ^ 0xBAA50F4) ^ 0x74CEEB8;
            if ((n2 ^ n) == 122482360) break block0;
            int cfr_ignored_0 = (0x38A20DC2 ^ n) - -1089438879;
        }
        return string.endsWith(string2);
    }

    private static String dqk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = qt_2.jbs(1455746229);
            int n5 = n4 ^ 0x1BDFBA50;
            if ((n5 ^ n4) == 467647056) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4D1B56E5 ^ n4, 12) - 1521296630;
            int cfr_ignored_1 = (int)(0x8FA9F8D827D4EB4FL ^ (long)n4 ^ 0xCC0831A2DB8B282L);
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static int dhmgh(int n) {
        block0: {
            int n2 = qt_2.jbs(1378473164);
            int n3 = (n2 = n ^ n2) ^ 0x879922B3;
            if ((n3 ^ n2) == -2020007245) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD5B0F67F ^ n2, 13) - -456427364) * -709822849;
        }
        return Integer.reverse(n);
    }

    private static int jjd(int n) {
        block0: {
            int n2 = -626138785;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1640410497, 9) ^ 0x7A3672CC) ^ 0xE62C739D;
            if ((n3 ^ n2) == -433294435) break block0;
            int cfr_ignored_0 = (0x3C8192C2 ^ n2) - -1666265398;
        }
        return Integer.reverse(n);
    }

    private static String khah_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 776788119;
            n4 = Integer.rotateLeft(n4 * 1695497063, 22) ^ 0x3EFA9182;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 16);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 23)) ^ 0x3DAB054C;
            if ((n5 ^ n4) == 1034618188) break block0;
            int cfr_ignored_0 = (0x13E7DDDB ^ n4) - 509854771;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static boolean amk(String string, String string2) {
        block0: {
            int n = 119576118;
            int n2 = (n = Integer.rotateLeft(n * -372840897, 22) ^ 0xCC57B24C) ^ 0x5E90EAD6;
            if ((n2 ^ n) == 1586555606) break block0;
            int cfr_ignored_0 = (0x59B07CE0 ^ n) + 1100192487;
        }
        return string.endsWith(string2);
    }

    private static String dhha(String string, int n, int n2, int n3) {
        block0: {
            int n4 = qt_2.jbs(-2117254690);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 29)) ^ 0x56C76907;
            if ((n5 ^ n4) == 1455909127) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD70A28D9 ^ n4, 13) + 244879746) * -687200039;
            int cfr_ignored_1 = (int)(0x15B886E427D4EB4FL ^ (long)n4 ^ 0xF0B8831A2DB986A0L);
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static String l_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 146269036;
            n4 = Integer.rotateLeft(n4 * 47177247, 15) ^ 0xC4DCCA39;
            n4 = Integer.rotateRight(n ^ n4, 7);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 2)) ^ 0x7B074416;
            if ((n5 ^ n4) == 2064073750) break block0;
            int cfr_ignored_0 = (0x73B0A77A ^ n4) + -1065593038;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static String szkh_4(float f) {
        block0: {
            int n = -1415230648;
            n = Integer.rotateLeft(n * -1963468833, 13) ^ 0x97F63736;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 10);
            int n2 = n ^ 0xB4DE0495;
            if ((n2 ^ n) == -1260518251) break block0;
            int cfr_ignored_0 = (0x1F7B4FDD ^ n) + -1377631855;
        }
        return bzdh_2.sghr(f);
    }

    private static String jhs_3(float f) {
        block0: {
            int n = -1794200820;
            n = Integer.rotateLeft(n * 49876689, 12) ^ 0x382AD3CB;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xC7B5DF80;
            if ((n2 ^ n) == -944382080) break block0;
            int cfr_ignored_0 = (0x52BB748C ^ n) + -1610374987;
        }
        return bzdh_2.shas_4(f);
    }

    private static void shyf() {
        int n = -1563769813;
        int n2 = (n = Integer.rotateLeft(n * -1857546669, 21) ^ 0x742F486D) ^ 0xF237B4B5;
        if ((n2 ^ n) != -231230283) {
            int cfr_ignored_0 = (0x50FD709E ^ n) - -301741202;
        }
        yf.athz_2();
    }

    private static String ghshkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 218126807;
            n4 = Integer.rotateLeft(n4 * 2058081139, 15) ^ 0x60C75BD0;
            n4 = Integer.rotateLeft(n ^ n4, 23);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 22)) ^ 0xDEF8F930;
            if ((n5 ^ n4) == -554108624) break block0;
            int cfr_ignored_0 = (0xD3F8A0E7 ^ n4) + 416044059;
        }
        return bzdh_2.tzr_4(string, n, n2, n3);
    }

    private static double dhh(long l) {
        block0: {
            int n = -2074055312;
            n = Integer.rotateLeft(n * -753332965, 14) ^ 0x1CE44BD2;
            int n2 = (n = (int)l ^ n) ^ 0xB9686811;
            if ((n2 ^ n) == -1184339951) break block0;
            int cfr_ignored_0 = (0x3D080561 ^ n) - -918908660;
        }
        return Double.longBitsToDouble(l);
    }

    private static int hkhz(int n) {
        block0: {
            int n2 = -1712920879;
            int n3 = (n2 = Integer.rotateLeft(n2 * -213854469, 11) ^ 0xF3665B00) ^ 0x2CCA44A0;
            if ((n3 ^ n2) == 751453344) break block0;
            int cfr_ignored_0 = (0xB52CA271 ^ n2) - -1937673570;
        }
        return Integer.reverse(n);
    }

    private static String[] ghrj(String string) {
        int n = qt_2.jbs(-323877443);
        int n2 = n ^ 0xD034F0D7;
        if ((n2 ^ n) != -801836841) {
            int cfr_ignored_0 = Integer.rotateRight(0x3C86F56A ^ n, 10) + 1488279313;
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

    private static CallSite ghzm_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 364364413;
            n3 = Integer.rotateLeft(n3 * 1449701077, 10) ^ 0x6FFB048C;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0x809E6436;
            if ((n4 ^ n3) != -2137103306) {
                int cfr_ignored_0 = (0x9529A64B ^ n3) + -1648287825;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zms_2 ^ string.hashCode()) + (n2 + zts_4) + i ^ zms_2, 5) + zts_4);
            }
            String[] stringArray = bzdh_2.ghrj(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] p6vpi9zadmkhby(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite adoqxc6rjqz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ azp2418fz0hl ^ string.hashCode() ^ n2 + e8a7612xm61ti + i * -1916205137) + azp2418fz0hl) ^ e8a7612xm61ti));
            }
            String[] stringArray = bzdh_2.p6vpi9zadmkhby(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

