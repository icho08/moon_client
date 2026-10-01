/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bsa;
import us.m0vy.moondlc.m0vyguard.bfs;
import us.m0vy.moondlc.m0vyguard.rk;
import us.m0vy.moondlc.m0vyguard.yf;

public class dj {
    public static final Gson khds_3;
    public static final File sdr_2;
    public static final String sbsh = "dlc";
    private final List hkhdh = new ArrayList();
    private static final int dhqdh = -2133642730;
    private static final int thfy = -78390996;
    private static final int iq32a0gdvra9d = 795947314;
    private static final int mnh0aik38xa3 = -291624840;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int o2vx0ejk3kiwx2;

    public dj() {
        try {
            if (!sdr_2.exists()) {
                Files.createDirectories(Path.of(sdr_2.toURI()), new FileAttribute[0]);
            }
        }
        catch (IOException iOException) {
            System.err.println("Error creating directory: " + iOException.getMessage());
        }
        this.ajdh();
    }

    public void ajdh() {
        int n = -1736130541;
        n = Integer.rotateLeft(n * 510521135, 5) ^ 0x4E778BA7;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x663342FE;
        if ((n2 ^ n) != 1714635518) {
            int cfr_ignored_0 = (0xFEB782ED ^ n) + 606328597;
        }
        this.hkhdh.add(new bfs());
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public bsa shsh_9(String var1_1) {
        var2_2 = null;
        var5_3 = 0;
        var3_4 = -242408990;
        var3_4 = Integer.rotateLeft(var3_4 * 1713373793, 8) ^ -1110906111;
        var3_4 = System.identityHashCode(this) ^ var3_4;
        var4_5 = 1094164893 + var3_4 + -1269720923 - -1269720923;
        block24: while (true) {
            if ((var5_3 = var4_5 - var3_4) == 2096013958) {
                return var2_2;
            }
            if (var5_3 == -1523998626) ** GOTO lbl-1000
            (Integer.rotateRight(-886014433 ^ var3_4, 12) - -1623399172) * -886014433;
            if (var5_3 != -1466994144) {
                switch (var5_3) {
                    case -370214342: {
                        (Integer.rotateLeft(-721107856 ^ var3_4, 13) + -806262581) * -721107855;
                        yf.athz_2();
                        var4_5 = 1457500124 + var3_4 ^ -449204079 ^ -449204079;
                        --var5_3;
                        continue block24;
                    }
                    case 1457500124: {
                        Integer.rotateLeft(-1636863679 ^ var3_4, 6) + 870077978;
                        (int)(6691750345679629135L ^ (long)var3_4 ^ 4866283545833313386L);
                        var2_2 = this.hkhdh.stream().filter((Predicate<bsa>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, shqh_2(java.lang.String us.m0vy.moondlc.m0vyguard.bsa ), (Lus/m0vy/moondlc/m0vyguard/bsa;)Z)((String)var1_1)).findFirst().orElse(null);
                        var4_5 = (int)((long)(1399526545 + var3_4) ^ 7611467904398281199L ^ 7611467904398281199L);
                        Integer.rotateRight(761366851 ^ var3_4, 8) + -2094186920;
                        var4_5 = 2096013958 + var3_4 + 1544432452 - 1544432452;
                        var5_3 -= 3;
                        continue block24;
                    }
                    case 1094164893: {
                        (Integer.rotateRight(136991742 ^ var3_4, 4) - 25021181) * 136991743;
                        if (yf.khdha_2()) {
                            var4_5 = Integer.reverse(Integer.reverse(-525866299 + var3_4));
                            (Integer.rotateLeft(-2007683920 ^ var3_4, 4) + -2035414901) * -2007683919;
                            var4_5 = Integer.reverse(Integer.reverse(1457500124 + var3_4));
                            var5_3 += 4;
                            continue block24;
                        }
                        var4_5 = -370214342 + var3_4 + -2031291248 - -2031291248;
                        continue block24;
                    }
                    case -1052580537: {
                        Integer.rotateLeft(2095458561 ^ var3_4, 18) + 607950426;
                        (int)(-4732008616023495857L ^ (long)var3_4 ^ -934352774219902600L);
                        var4_5 = Integer.reverse(Integer.reverse(1094164893 + var3_4));
                        Integer.rotateRight(-1551123769 ^ var3_4, 7) - -766952108;
                        var5_3 += 3;
                        continue block24;
                    }
                    case -612951925: {
                        (Integer.rotateRight(-755873481 ^ var3_4, 13) - -1883996956) * -755873481;
                        try {
                            var5_3 -= 4;
                            if ((-3590881037228948211L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var4_5 = 1094164893 + var3_4 + 936664703 - 936664703;
                        }
                        catch (IllegalStateException v0) {
                            var4_5 = 1094164893 + var3_4 + 1258956212 - 1258956212;
                        }
                        var5_3 -= 3;
                        continue block24;
                    }
                    case 269205805: {
                        (Integer.rotateRight(-1719371022 ^ var3_4, 6) + -1687649655) * -1719371021;
                        var4_5 = Integer.reverse(Integer.reverse(213857924 + var3_4));
                        Integer.rotateRight(1092151823 ^ var3_4, 11) - -429787380;
                        var4_5 = 1094164893 + var3_4 ^ -333148252 ^ -333148252;
                        Integer.rotateRight(-1876920541 ^ var3_4, 5) + 2018249848;
                        var5_3 += 3;
                        continue block24;
                    }
                }
            }
            ** GOTO lbl106
lbl-1000:
            // 1 sources

            {
                (Integer.rotateLeft(-380606312 ^ var3_4, 16) + 1159350691) * -380606311;
                var4_5 = 1170252757 + var3_4 + 273454351 - 273454351;
                Integer.rotateLeft(2135141581 ^ var3_4, 18) - 1838124046;
                (int)(-4760020100670231729L ^ (long)var3_4 ^ -535784207197612493L);
                var4_5 = 256986415 + var3_4 ^ 732235987 ^ 732235987;
                Integer.rotateLeft(1258442948 ^ var3_4, 12) - 430270199;
                var4_5 = 1094164893 + var3_4;
                var5_3 -= 4;
                continue block24;
                case 1699052155: {
                    (Integer.rotateRight(-334198913 ^ var3_4, 16) - -1696987236) * -334198913;
                    try {
                        if ((3490479228634257651L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(1094164893 + var3_4));
                    }
                    catch (IllegalStateException v1) {
                        var4_5 = (int)((long)(1094164893 + var3_4) ^ -7020568050073614397L ^ -7020568050073614397L);
                    }
                    var5_3 -= 3;
                    continue block24;
                }
lbl106:
                // 1 sources

                Integer.rotateLeft(-677347672 ^ var3_4, 13) + 550303123;
                try {
                    var5_3 -= 2;
                    if ((-3566089692431033985L ^ (long)var3_4 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var4_5 = 1094164893 + var3_4 ^ -1133679313 ^ -1133679313;
                }
                catch (UnsupportedOperationException v2) {
                    var4_5 = 1094164893 + var3_4;
                }
                --var5_3;
                continue block24;
                case 971600925: {
                    Integer.rotateLeft(-1637825627 ^ var3_4, 6) - 840257590;
                    (int)(6688528896869329743L ^ (long)var3_4 ^ 2756347120410236021L);
                    var4_5 = 36146194 + var3_4 + -1603677882 - -1603677882;
                    (Integer.rotateLeft(-355119624 ^ var3_4, 16) + 1949438019) * -355119623;
                    try {
                        var5_3 -= 4;
                        if ((1576366514217895181L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(1094164893 + var3_4));
                    }
                    catch (UnsupportedOperationException v3) {
                        var4_5 = 1094164893 + var3_4;
                    }
                    var5_3 -= 2;
                    continue block24;
                }
                case -1543851580: {
                    (Integer.rotateRight(-1719822246 ^ var3_4, 6) + -1701637599) * -1719822245;
                    var4_5 = -1533382585 + var3_4 + 1642260642 - 1642260642;
                    (Integer.rotateLeft(-1300932048 ^ var3_4, 9) + -1600943349) * -1300932047;
                    try {
                        var5_3 += 2;
                        var4_5 = 1094164893 + var3_4;
                    }
                    catch (ArithmeticException v4) {
                        var4_5 = (int)((long)(1094164893 + var3_4) ^ 8970944479792257265L ^ 8970944479792257265L);
                    }
                    continue block24;
                }
                case 1139520038: {
                    (Integer.rotateLeft(1818494168 ^ var3_4, 16) + 611988835) * 1818494169;
                    var4_5 = 669413654 + var3_4 ^ 1659187302 ^ 1659187302;
                    Integer.rotateRight(-434160373 ^ var3_4, 15) + -500825200;
                    var4_5 = 1094164893 + var3_4 ^ -144382345 ^ -144382345;
                    continue block24;
                }
                case -1567621651: {
                    Integer.rotateLeft(-1417810231 ^ var3_4, 8) + -929199726;
                    (int)(7624384111546002255L ^ (long)var3_4 ^ 8978070005622603343L);
                    var4_5 = 1351226945 + var3_4;
                    Integer.rotateLeft(1328066180 ^ var3_4, 12) - -1706376905;
                    var4_5 = 1094164893 + var3_4;
                    var5_3 -= 3;
                    continue block24;
                }
                case -1214903556: {
                    (Integer.rotateLeft(2004654365 ^ var3_4, 17) - 2087987646) * 2004654365;
                    (int)(-5346275096395453617L ^ (long)var3_4 ^ -7840622802792561075L);
                    var4_5 = Integer.reverse(Integer.reverse(645817914 + var3_4));
                    Integer.rotateLeft(1576474405 ^ var3_4, 14) - 1699310774;
                    (int)(-6969961334887355569L ^ (long)var3_4 ^ -8124349579316915366L);
                    var4_5 = 1094164893 + var3_4 ^ -1929220916 ^ -1929220916;
                    --var5_3;
                }
            }
            Integer.rotateLeft(-431949719 ^ var3_4, 15) + -432294926;
            (int)(2662285249174891343L ^ (long)var3_4 ^ 5897607860501210165L);
            var4_5 = 1094164893 + var3_4 + 658263726 - 658263726;
        }
    }

    public void sshl(bsa bsa2) {
        try {
            int n = -1548273145;
            n = Integer.rotateLeft(n * -118718665, 23) ^ 0xFC7A9EFA;
            n = System.identityHashCode(this) ^ n;
            bsa bsa3 = bsa2;
            n = Integer.rotateLeft((bsa3 != null ? System.identityHashCode(bsa3) : 0) ^ n, 14);
            int n2 = n ^ 0x8A36F603;
            if ((n2 ^ n) != -1976109565) {
                int cfr_ignored_0 = (0x2981CC04 ^ n) - -398490294;
            }
            if (bsa2.hwj().exists()) {
                bsa2.khwsh();
            }
        }
        catch (Exception exception) {
            dj.tsk_2(System.err, "Error reading file: " + exception.getMessage());
        }
    }

    public void shdkh(String string) {
        int n = 249733926;
        n = Integer.rotateLeft(n * 2045079679, 23) ^ 0xC295C652;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x58C32B11;
        if ((n2 ^ n) != 1489185553) {
            int cfr_ignored_0 = (0x56218837 ^ n) + 67606113;
        }
        if (yf.dnkh()) {
            throw null;
        }
        bsa bsa2 = this.shsh_9(string);
        if (bsa2 != null) {
            dj.ghaf(this, bsa2);
        }
    }

    public void zjkh(bsa bsa2) {
        try {
            int n = -982948648;
            n = Integer.rotateLeft(n * -333921971, 6) ^ 0xDC41C8A9;
            n = System.identityHashCode(this) ^ n;
            bsa bsa3 = bsa2;
            n = (bsa3 != null ? System.identityHashCode(bsa3) : 0) ^ n;
            int n2 = n ^ 0x540D5143;
            if ((n2 ^ n) != 1410158915) {
                int cfr_ignored_0 = (0x9164359B ^ n) - 1375612816;
            }
            if (!dj.dhzm_2(dj.dhzb(bsa2))) {
                bsa2.hwj().createNewFile();
            }
            bsa2.znsh();
        }
        catch (IOException iOException) {
            dj.zlb(System.err, "Error saving file: " + iOException.getMessage());
        }
    }

    public void dsf_2(String string) {
        bsa bsa2;
        int n = 571320095;
        n = Integer.rotateLeft(n * -8239475, 5) ^ 0x22E421;
        n = System.identityHashCode(this) ^ n;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xAEFAFF8;
        if ((n2 ^ n) != 183480312) {
            int cfr_ignored_0 = (0x28E208E7 ^ n) - 79033476;
        }
        if ((bsa2 = this.shsh_9(string)) != null) {
            bsa2.znsh();
        }
    }

    public void jhm() {
        try {
            int n = -376432991;
            n = Integer.rotateLeft(n * -1594226137, 15) ^ 0x1A198CDA;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0x6E45271D;
            if ((n2 ^ n) != 1850025757) {
                int cfr_ignored_0 = (0x87D531BC ^ n) - -702229104;
            }
            if ((0xC8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        for (bsa bsa2 : this.hkhdh) {
            dj.ghhk(this, bsa2);
        }
    }

    public void jst_2() {
        int n = -1949941899;
        n = Integer.rotateLeft(n * -141095503, 26) ^ 0xDDD12D25;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xAE5195FE;
        if ((n2 ^ n) != -1370384898) {
            int cfr_ignored_0 = (0x2597AA8B ^ n) - -815350273;
        }
        if (!dj.rddh_2()) {
            yf.athz_2();
            throw null;
        }
        for (bsa bsa2 : this.hkhdh) {
            this.zjkh(bsa2);
        }
    }

    @Generated
    public List dbz_3() {
        block0: {
            int n = 347659736;
            n = Integer.rotateLeft(n * 762513147, 12) ^ 0xA4885703;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x6ABFED29;
            if ((n2 ^ n) == 1790962985) break block0;
            int cfr_ignored_0 = (0x7E0730F1 ^ n) - -174106336;
        }
        return this.hkhdh;
    }

    private static boolean shqh_2(String string, bsa bsa2) {
        block0: {
            int n = rk.tty_3(-462947595);
            bsa bsa3 = bsa2;
            n = (bsa3 != null ? System.identityHashCode(bsa3) : 0) ^ n;
            int n2 = n ^ 0xED0D6A46;
            if ((n2 ^ n) == -317887930) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x96A90B3 ^ n, 4) + 675620072) * 157978803;
        }
        return bsa2.bln().name().equalsIgnoreCase(string);
    }

    private static void tsk_2(PrintStream printStream, String string) {
        int n = rk.tty_3(1272995022);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xCDAB1D7D;
        if ((n2 ^ n) != -844423811) {
            int cfr_ignored_0 = (Integer.rotateRight(0x864B41B3 ^ n, 3) + 1199215592) * -2041888333;
        }
        printStream.println(string);
    }

    private static void ghaf(dj dj2, bsa bsa2) {
        int n = -1705831803;
        n = Integer.rotateLeft(n * -2010928317, 3) ^ 0x929B38AB;
        bsa bsa3 = bsa2;
        n = (bsa3 != null ? System.identityHashCode(bsa3) : 0) ^ n;
        int n2 = n ^ 0x95F6EDCE;
        if ((n2 ^ n) != -1778979378) {
            int cfr_ignored_0 = (0xFA5FF4B ^ n) - -91770283;
        }
        dj2.sshl(bsa2);
    }

    private static File dhzb(bsa bsa2) {
        block0: {
            int n = -1684104577;
            int n2 = (n = Integer.rotateLeft(n * -59283631, 25) ^ 0x6A84C6E2) ^ 0x22545D6D;
            if ((n2 ^ n) == 575954285) break block0;
            int cfr_ignored_0 = (0xB9CAC712 ^ n) + -513576311;
        }
        return bsa2.hwj();
    }

    private static boolean dhzm_2(File file) {
        block0: {
            int n = 679123256;
            n = Integer.rotateLeft(n * -651804857, 5) ^ 0xD3A5B6FD;
            File file2 = file;
            n = Integer.rotateLeft((file2 != null ? System.identityHashCode(file2) : 0) ^ n, 26);
            int n2 = n ^ 0xA2624618;
            if ((n2 ^ n) == -1570617832) break block0;
            int cfr_ignored_0 = (0x8A18DF20 ^ n) - -1969016514;
        }
        return file.exists();
    }

    private static void zlb(PrintStream printStream, String string) {
        int n = rk.tty_3(-1514870014);
        PrintStream printStream2 = printStream;
        n = (printStream2 != null ? System.identityHashCode(printStream2) : 0) ^ n;
        int n2 = n ^ 0xD704A1B9;
        if ((n2 ^ n) != -687562311) {
            int cfr_ignored_0 = (Integer.rotateRight(0x72B04ABB ^ n, 17) + -407458848) * 1924156091;
        }
        printStream.println(string);
    }

    private static void ghhk(dj dj2, bsa bsa2) {
        int n = rk.tty_3(-660451381);
        bsa bsa3 = bsa2;
        n = Integer.rotateRight((bsa3 != null ? System.identityHashCode(bsa3) : 0) ^ n, 22);
        int n2 = n ^ 0x84AF8349;
        if ((n2 ^ n) != -2068872375) {
            int cfr_ignored_0 = Integer.rotateRight(0x5C0DCC82 ^ n, 14) + 705258233;
        }
        dj2.sshl(bsa2);
    }

    private static boolean rddh_2() {
        block0: {
            int n = -1010923440;
            int n2 = (n = Integer.rotateLeft(n * 1521717659, 18) ^ 0xA39FDA55) ^ 0x93F6C78A;
            if ((n2 ^ n) == -1812543606) break block0;
            int cfr_ignored_0 = (0x50484FDA ^ n) - 1277456615;
        }
        return yf.khdha_2();
    }

    private static String[] bah_3(String string) {
        int n = 1967476847;
        n = Integer.rotateLeft(n * 1859300475, 27) ^ 0x59A1BEE6;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xA55BC480;
        if ((n2 ^ n) != -1520712576) {
            int cfr_ignored_0 = (0xD01E94EF ^ n) + -499305584;
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

    private static CallSite rzz_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 226860421;
            n3 = Integer.rotateLeft(n3 * 1504242941, 5) ^ 0xC19B8F52;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 6);
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 17);
            int n4 = n3 ^ 0xAEB3C0FB;
            if ((n4 ^ n3) != -1363951365) {
                int cfr_ignored_0 = (0xA3365D7E ^ n3) + -1451929694;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhqdh ^ string.hashCode()) + (n2 + thfy) + i ^ dhqdh, 24) + thfy);
            }
            String[] stringArray = dj.bah_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] egzvaiyfg(String string) {
        return string.split("\u0002\u001d", -1);
    }

    private static CallSite mu09962uohjln9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ iq32a0gdvra9d ^ string.hashCode()) + (n2 + mnh0aik38xa3) + i ^ iq32a0gdvra9d, 16) + mnh0aik38xa3);
            }
            String[] stringArray = dj.egzvaiyfg(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

