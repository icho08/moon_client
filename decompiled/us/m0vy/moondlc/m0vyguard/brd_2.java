/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1011
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import net.minecraft.class_1011;
import us.m0vy.moondlc.m0vyguard.dth_8;
import us.m0vy.moondlc.m0vyguard.yf;

public final class brd_2 {
    private static final int zkf = 4627965;
    private static final int jdsh = 1212060109;
    private static final int jsd_3 = 102490400;
    private static final int bas_3 = -364424345;
    private static final int odei1g4i1dcc = 1803676577;
    private static final int jgo675x4 = -631014731;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int w2w3xfhdluyy;

    public static String rzf(String string) throws IOException {
        String string2;
        block7: {
            int n = 1857643470;
            n = Integer.rotateLeft(n * -436378513, 27) ^ 0xABD27F0;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x436EC6B8;
            if ((n2 ^ n) != 1131333304) {
                int cfr_ignored_0 = (0x2DD7A576 ^ n) - 1481688659;
            }
            if (yf.dnkh()) {
                throw null;
            }
            URL uRL = new URL(string);
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
            brd_2.dhhz_3(httpURLConnection, "User-Agent", "Mozilla/5.0");
            brd_2.dbd_2(httpURLConnection, -1830026963 + 1830031963);
            httpURLConnection.setReadTimeout(0xB471E1E0 ^ 0xB471C6F0);
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                string2 = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
                if (inputStream == null) break block7;
            }
            catch (Throwable throwable) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            brd_2.thl_4(inputStream);
        }
        return string2;
    }

    public static String khthd(String string) {
        Pattern pattern;
        Matcher matcher;
        int n = -1045047663;
        n = Integer.rotateLeft(n * -600637595, 13) ^ 0x6299ADF7;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x8FFE9408;
        if ((n2 ^ n) != -1879141368) {
            int cfr_ignored_0 = (0x4E4B4299 ^ n) + -826888521;
        }
        return (matcher = (pattern = brd_2.tkht_3(brd_2.thrf("ꔀꕗꕐꕎꔁꕿꕐꔉꔙꕿꕐꔉꔂꔈꕻꕾꔂꕽꔋꔉꔃ", 904855176 + 927782345, brd_2.btn_2(-287192530) ^ 0x426172C7, Integer.reverse(-236603112) ^ 0xC2DFD2FF))).matcher(string)).find() ? matcher.group(1).replace("\\/", "/") : null;
    }

    public static class_1011 shghdh(BufferedImage bufferedImage, boolean bl) {
        int n = -204002013;
        n = Integer.rotateLeft(n * -775533485, 24) ^ 0xA3C30DF4;
        BufferedImage bufferedImage2 = bufferedImage;
        n = Integer.rotateLeft((bufferedImage2 != null ? System.identityHashCode(bufferedImage2) : 0) ^ n, 16);
        int n2 = n ^ 0x7C2F46BA;
        if ((n2 ^ n) != 2083473082) {
            int cfr_ignored_0 = (0x8FF86B99 ^ n) + 2113451230;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        class_1011 class_10112 = new class_1011(n3, n4, true);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n5 = bufferedImage.getRGB(j, i);
                class_10112.method_61941(j, i, n5);
            }
        }
        return class_10112;
    }

    public static void syt_3(String string) {
        try {
            int n = -1589359151;
            n = Integer.rotateLeft(n * 1545421737, 7) ^ 0xF877123;
            int n2 = n ^ 0xD11606F6;
            if ((n2 ^ n) != -787085578) {
                int cfr_ignored_0 = (0x70524B27 ^ n) - -1378460684;
            }
            Desktop.getDesktop().browse(new URI(string));
        }
        catch (Exception exception) {
            brd_2.sss_6(System.err, "Failed to open link: " + string + " - " + exception.getMessage());
        }
    }

    @Generated
    private brd_2() {
        throw new UnsupportedOperationException("This is a u".concat("tility class ").concat("and cannot be").concat(" instantiated"));
    }

    private static String thrf(String string, int n, int n2, int n3) {
        try {
            int n4 = 1251927516;
            n4 = Integer.rotateLeft(n4 * 605617671, 13) ^ 0xE784C761;
            n4 = Integer.rotateRight(n ^ n4, 18);
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0xC68A9563;
            if ((n5 ^ n4) != -963996317) {
                int cfr_ignored_0 = (0x8C1470BF ^ n4) - 1524122416;
            }
            if ((0x376 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xB362E25) + i ^ zkf, 3) ^ n2 + jdsh));
        }
        return new String(cArray);
    }

    private static String dsd_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1410502270;
            n4 = Integer.rotateLeft(n4 * -1056730599, 6) ^ 0x66F686B1;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0x83FD67EB;
            if ((n5 ^ n4) == -2080544789) break block0;
            int cfr_ignored_0 = (0x28101669 ^ n4) - 2112426729;
        }
        return brd_2.thrf(string, n, n2, n3);
    }

    private static String dhd_10(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 664256230;
            n4 = Integer.rotateLeft(n4 * 1587524827, 11) ^ 0x3221D037;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x7934122D;
            if ((n5 ^ n4) == 2033455661) break block0;
            int cfr_ignored_0 = (0x5EA3ACCB ^ n4) - -1915317652;
        }
        return brd_2.thrf(string, n, n2, n3);
    }

    private static void dhhz_3(HttpURLConnection httpURLConnection, String string, String string2) {
        int n = 329637029;
        n = Integer.rotateLeft(n * 1972138457, 11) ^ 0xEC78AF76;
        String string3 = string;
        n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
        String string4 = string2;
        n = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 14);
        int n2 = n ^ 0x3BC9F3BF;
        if ((n2 ^ n) != 1003090879) {
            int cfr_ignored_0 = (0x286C2F1A ^ n) - -5291699;
        }
        httpURLConnection.setRequestProperty(string, string2);
    }

    private static void dbd_2(HttpURLConnection httpURLConnection, int n) {
        int n2 = -1263931152;
        n2 = Integer.rotateLeft(n2 * 1276960149, 11) ^ 0x3C8BBB35;
        int n3 = (n2 = Integer.rotateRight(n ^ n2, 19)) ^ 0xFCFE2A24;
        if ((n3 ^ n2) != -50451932) {
            int cfr_ignored_0 = (0x4857DAD4 ^ n2) - 1048770741;
        }
        httpURLConnection.setConnectTimeout(n);
    }

    private static void thl_4(InputStream inputStream) {
        int n = 1791395580;
        int n2 = (n = Integer.rotateLeft(n * 576285765, 9) ^ 0x4ECD8719) ^ 0x366A98E3;
        if ((n2 ^ n) != 912955619) {
            int cfr_ignored_0 = (0x5CAC1E1F ^ n) + 391553902;
        }
        inputStream.close();
    }

    private static int btn_2(int n) {
        block0: {
            int n2 = -1512380808;
            int n3 = (n2 = Integer.rotateLeft(n2 * -195849361, 25) ^ 0xBA2B19AB) ^ 0x8DB5650D;
            if ((n3 ^ n2) == -1917491955) break block0;
            int cfr_ignored_0 = (0x286F8375 ^ n2) + 958896698;
        }
        return Integer.reverse(n);
    }

    private static Pattern tkht_3(String string) {
        block0: {
            int n = 2039369701;
            int n2 = (n = Integer.rotateLeft(n * 1271730835, 25) ^ 0x25220010) ^ 0xA789E82B;
            if ((n2 ^ n) == -1484134357) break block0;
            int cfr_ignored_0 = (0xDE07A7CE ^ n) + -1145889248;
        }
        return Pattern.compile(string);
    }

    private static String rlm(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1377606404;
            int n5 = (n4 = Integer.rotateLeft(n4 * 1435576551, 27) ^ 0x43AE72D) ^ 0x52E3F50A;
            if ((n5 ^ n4) == 1390671114) break block0;
            int cfr_ignored_0 = (0xFF0091F6 ^ n4) + 1352970505;
        }
        return brd_2.thrf(string, n, n2, n3);
    }

    private static String bthgh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2093312526;
            n4 = Integer.rotateLeft(n4 * 1868170921, 18) ^ 0xB09E0A0E;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 9);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 12)) ^ 0x1D86716C;
            if ((n5 ^ n4) == 495350124) break block0;
            int cfr_ignored_0 = (0x61431B62 ^ n4) + 1338020011;
        }
        return brd_2.thrf(string, n, n2, n3);
    }

    private static void sss_6(PrintStream printStream, String string) {
        int n = dth_8.ttsh_3(-1893366985);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x4388762B;
        if ((n2 ^ n) != 1133016619) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xCCADF51C ^ n, 12) - -848409185) * -861014755;
        }
        printStream.println(string);
    }

    private static String[] ddhq(String string) {
        int n = -830965756;
        n = Integer.rotateLeft(n * -774036533, 26) ^ 0xA7AE789;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
        int n2 = n ^ 0xDACF042B;
        if ((n2 ^ n) != -623967189) {
            int cfr_ignored_0 = (0x14B77C2F ^ n) + -2088347330;
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

    private static CallSite khdt(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -81692134;
            n3 = Integer.rotateLeft(n3 * -746082937, 27) ^ 0x9238FE55;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 10);
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 23);
            int n4 = n3 ^ 0x505F8BED;
            if ((n4 ^ n3) != 1348439021) {
                int cfr_ignored_0 = (0xAB7EF1F7 ^ n3) + 422952253;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jsd_3 ^ string.hashCode()) + (n2 + bas_3) + i ^ jsd_3, 11) + bas_3);
            }
            String[] stringArray = brd_2.ddhq(new String(cArray));
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

    private static String[] bf7lpyfitm61x(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite tgvy832mj3b(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ odei1g4i1dcc ^ string.hashCode() ^ n2 + jgo675x4 ^ i * 55248263 ^ odei1g4i1dcc, 22) ^ jgo675x4));
            }
            String[] stringArray = brd_2.bf7lpyfitm61x(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

