/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javazoom.jl.player.Player
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3298
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Optional;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javazoom.jl.player.Player;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import us.m0vy.moondlc.m0vyguard.dht_5;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class thm_3 {
    private static final int zz_3 = -1289887015;
    private static final int shdkh_2 = 912323919;
    private static final int khfd = -289604095;
    private static final int stm = 514342238;
    private static final int lp7ykb26 = -380207300;
    private static final int rijlgs5ehhz2l = -387894706;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ypeku1zk;

    public static void khmsh(String string) {
        try {
            int n = 79096211;
            n = Integer.rotateLeft(n * 2107746799, 6) ^ 0x68BDC17D;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 4);
            int n2 = n ^ 0x710D1B30;
            if ((n2 ^ n) != 1896684336) {
                int cfr_ignored_0 = (0x75BBF2A3 ^ n) + 131200858;
            }
            if ((0x34C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            thm_3.zaa_7();
            throw null;
        }
        new Thread(() -> thm_3.ttkh_2(string)).start();
    }

    public static void bthz(String string) {
        int n = -1927063376;
        n = Integer.rotateLeft(n * -766454059, 20) ^ 0xA429D86E;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xEA05150F;
        if ((n2 ^ n) != -368765681) {
            int cfr_ignored_0 = (0x67264DBF ^ n) + 529836304;
        }
        new Thread(() -> thm_3.jfm(string)).start();
    }

    public static void shqk(String string) {
        try {
            int n = 1492091347;
            n = Integer.rotateLeft(n * 1895018523, 11) ^ 0x5042F180;
            int n2 = n ^ 0x62ACE847;
            if ((n2 ^ n) != 1655498823) {
                int cfr_ignored_0 = (0x3A436994 ^ n) + -1039487050;
            }
            if ((0xF0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (thm_3.zshth()) {
            throw null;
        }
        class_2960 class_29602 = thm_3.zad_7("moondlc", "sounds/" + string);
        class_310.method_1551().execute(() -> thm_3.khrd(class_29602));
    }

    public static void ssn_2(String string) {
        int n = -223175536;
        int n2 = (n = Integer.rotateLeft(n * -1778306327, 26) ^ 0x6D10E41A) ^ 0xABD7CB58;
        if ((n2 ^ n) != -1411921064) {
            int cfr_ignored_0 = (0x596557C8 ^ n) - 1716978796;
        }
        class_2960 class_29602 = class_2960.method_60655((String)"moondlc", (String)("sounds/" + string));
        class_310.method_1551().execute(() -> thm_3.zwa(class_29602));
    }

    public static void rff(String string, int n) {
        try {
            int n2 = 1605455096;
            n2 = Integer.rotateLeft(n2 * 388677711, 20) ^ 0xAB543921;
            int n3 = n2 ^ 0x7AF75253;
            if ((n3 ^ n2) != 2063028819) {
                int cfr_ignored_0 = (0x25461EAB ^ n2) + 65172258;
            }
            if ((0x35C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_2960 class_29602 = class_2960.method_60655((String)"moondlc", (String)("sounds/" + string));
        thm_3.dhrs().execute(() -> thm_3.zwdh_2(class_29602, n));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void jzh_4(byte[] byArray, float f) {
        try {
            int n = 592982448;
            n = Integer.rotateLeft(n * 348087097, 16) ^ 0xA9B733D3;
            int n2 = n ^ 0x385418A;
            if ((n2 ^ n) != 59064714) {
                int cfr_ignored_0 = (0x20DD703A ^ n) - 619036900;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new ByteArrayInputStream(byArray));
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                FloatControl floatControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
                float f2 = (float)(Double.longBitsToDouble(0xACA0E96E1433AEA9L ^ 0xEC94E96E1433AEA9L) * Math.log10(f));
                thm_3.bma_2(floatControl, Math.min(thm_3.zth_8(f2, floatControl.getMinimum()), floatControl.getMaximum()));
                clip.start();
                clip.addLineListener(arg_0 -> thm_3.ghdq_2(clip, arg_0));
                if (audioInputStream == null) return;
            }
            catch (Throwable throwable) {
                if (audioInputStream == null) throw throwable;
                try {
                    audioInputStream.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    thm_3.ghdh(throwable, throwable2);
                }
                throw throwable;
            }
            audioInputStream.close();
            return;
        }
        catch (Exception exception) {
            System.err.println("Error playing sound: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private static void ghdq_2(Clip clip, LineEvent lineEvent) {
        int n = 0;
        int n2 = 781932123;
        n2 = Integer.rotateLeft(n2 * 1967578599, 24) ^ 0x8EB76117;
        Clip clip2 = clip;
        n2 = (clip2 != null ? System.identityHashCode(clip2) : 0) ^ n2;
        LineEvent lineEvent2 = lineEvent;
        n2 = (lineEvent2 != null ? System.identityHashCode(lineEvent2) : 0) ^ n2;
        int n3 = 203817119 * 1830472513 + 1663877335 ^ n2;
        block23: while (true) {
            switch (((n3 ^ n2) - 1663877335) * -1703951167) {
                case 203817120: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x47CB4D48 ^ n2, 11) + -1241777421;
                    return;
                }
                case 203817121: {
                    int cfr_ignored_1 = (Integer.rotateRight(0x35475E7A ^ n2, 9) + 2013401089) * 893869691;
                    clip.close();
                    try {
                        n3 = 203817120 * 1830472513 + 1663877335 ^ n2 ^ 0xD9E0EB8 ^ 0xD9E0EB8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(203817120 * 1830472513 + 1663877335 ^ n2) ^ 0xBFFA35DC86F16543L ^ 0xBFFA35DC86F16543L);
                    }
                    continue block23;
                }
                case 203817119: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xFD1DDBBF ^ n2, 18) - -1426375844) * -48374849;
                    if (lineEvent.getType() == LineEvent.Type.STOP) {
                        try {
                            n += 4;
                            n3 = 203817121 * 1830472513 + 1663877335 ^ n2;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = 203817121 * 1830472513 + 1663877335 ^ n2;
                        }
                        ++n;
                        continue block23;
                    }
                    n3 = 203817120 * 1830472513 + 1663877335 ^ n2 ^ 0x8DC275DE ^ 0x8DC275DE;
                    n += 5;
                    continue block23;
                }
                case 203817122: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xD535BBB2 ^ n2, 13) + -706782775) * -717898829;
                    try {
                        if ((0x250C89F428ADAE07L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (203817119 * 1830472513 + 1663877335 ^ n2) + -376637645 - -376637645;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = 203817119 * 1830472513 + 1663877335 ^ n2;
                    }
                    n -= 5;
                    continue block23;
                }
                case 203817123: {
                    int cfr_ignored_4 = Integer.rotateRight(0x57F7474F ^ n2, 13) - -1420869172;
                    int cfr_ignored_5 = (int)(0x36CE73CD3CE4F1F5L ^ (long)n2 ^ 0x1AEAB57A18CDC04DL);
                    n3 = (int)((long)(2127538105 * 1830472513 + 1663877335 ^ n2) ^ 0x9C898C2AA75EB40L ^ 0x9C898C2AA75EB40L);
                    int cfr_ignored_6 = (int)(0x7851E3533C736796L ^ (long)n2 ^ 0x3BD6B455340B5D72L);
                    n3 = Integer.reverse(Integer.reverse(203817119 * 1830472513 + 1663877335 ^ n2));
                    continue block23;
                }
                case 203817124: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0x52D375F9 ^ n2, 13) + 200861794) * 1389590009;
                    int cfr_ignored_8 = (int)(0x9061DBC427D4EB4FL ^ (long)n2 ^ 0x4AF8831A2DB88D12L);
                    int cfr_ignored_9 = (int)(0x868E1AD2693903ADL ^ (long)n2 ^ 0xC8D41EC1FC7CA0CDL);
                    n3 = (1993721839 * 1830472513 + 1663877335 ^ n2) + 2000305933 - 2000305933;
                    int cfr_ignored_10 = (int)(0x80B526EBE83BD2C8L ^ (long)n2 ^ 0xB0A71CC45EB6ACBBL);
                    n3 = Integer.reverse(Integer.reverse(203817119 * 1830472513 + 1663877335 ^ n2));
                    continue block23;
                }
                case 203817125: {
                    int cfr_ignored_11 = Integer.rotateLeft(0x4F9DE364 ^ n2, 12) - -1468258217;
                    n3 = Integer.reverse(Integer.reverse(-707606290 * 1830472513 + 1663877335 ^ n2));
                    int cfr_ignored_12 = (Integer.rotateRight(0xBC3DE0DB ^ n2, 10) + -807675456) * -1136795429;
                    n3 = -1894005853 * 1830472513 + 1663877335 ^ n2;
                    int cfr_ignored_13 = (Integer.rotateLeft(0x3EF515D ^ n2, 3) - 2119727486) * 66015581;
                    int cfr_ignored_14 = (int)(0xC15DFF6027D4EB4FL ^ (long)n2 ^ 0x3B0831A2DB82F6AL);
                    n3 = Integer.reverse(Integer.reverse(203817119 * 1830472513 + 1663877335 ^ n2));
                    continue block23;
                }
                case 203817126: {
                    int cfr_ignored_15 = (Integer.rotateRight(0x9EBB8453 ^ n2, 6) + 1024632136) * -1631878061;
                    n3 = (239032898 * 1830472513 + 1663877335 ^ n2) + 499335216 - 499335216;
                    int cfr_ignored_16 = (Integer.rotateRight(0x720CB016 ^ n2, 17) - -739839515) * 1913434135;
                    n3 = (int)((long)(936740021 * 1830472513 + 1663877335 ^ n2) ^ 0x350DCF5DC390E6D7L ^ 0x350DCF5DC390E6D7L);
                    int cfr_ignored_17 = Integer.rotateLeft(0x93A50D4C ^ n2, 5) - -447071377;
                    n3 = (203817119 * 1830472513 + 1663877335 ^ n2) + 2093493041 - 2093493041;
                    n -= 2;
                    continue block23;
                }
                case 203817127: {
                    int cfr_ignored_18 = Integer.rotateRight(0xDE78AFEF ^ n2, 14) - -184881876;
                    n3 = -1572626286 * 1830472513 + 1663877335 ^ n2 ^ 0x855F8F25 ^ 0x855F8F25;
                    int cfr_ignored_19 = (Integer.rotateLeft(0xA1334B5D ^ n2, 7) - -1986805890) * -1590473891;
                    int cfr_ignored_20 = (int)(0x6381E56027D4EB4FL ^ (long)n2 ^ 0x37B0831A2DB96AD2L);
                    try {
                        ++n;
                        if ((0xA94706A76FE82B9BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = 203817119 * 1830472513 + 1663877335 ^ n2;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (203817119 * 1830472513 + 1663877335 ^ n2) + 1699044932 - 1699044932;
                    }
                    n += 2;
                    continue block23;
                }
                case 203817128: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0xC38FDF8 ^ n2, 4) + 2135187523) * 205061625;
                    n3 = (int)((long)(203817119 * 1830472513 + 1663877335 ^ n2) ^ 0x1C83029555C16364L ^ 0x1C83029555C16364L);
                    n -= 3;
                    continue block23;
                }
                case 203817129: {
                    int cfr_ignored_22 = (Integer.rotateLeft(0x259FA2DC ^ n2, 7) - -1833805857) * 631218909;
                    n3 = -1720148536 * 1830472513 + 1663877335 ^ n2;
                    int cfr_ignored_23 = (Integer.rotateLeft(0xBEB7B1BC ^ n2, 10) - 479995135) * -1095257667;
                    n3 = -982770134 * 1830472513 + 1663877335 ^ n2;
                    int cfr_ignored_24 = (Integer.rotateLeft(0x398E0678 ^ n2, 10) + -57645117) * 965609081;
                    n3 = Integer.reverse(Integer.reverse(203817119 * 1830472513 + 1663877335 ^ n2));
                    n -= 5;
                    continue block23;
                }
                case 203817130: {
                    int cfr_ignored_25 = Integer.rotateRight(0x2721CFEA ^ n2, 7) + -1049244527;
                    n3 = 1772419715 * 1830472513 + 1663877335 ^ n2;
                    int cfr_ignored_26 = Integer.rotateRight(0xCCA2A666 ^ n2, 12) - -871381611;
                    n3 = 203817119 * 1830472513 + 1663877335 ^ n2 ^ 0x9F702D89 ^ 0x9F702D89;
                    int cfr_ignored_27 = Integer.rotateRight(0x8BC0A762 ^ n2, 4) + -256777191;
                    n += 5;
                    continue block23;
                }
                case 203817131: {
                    int cfr_ignored_28 = (Integer.rotateRight(0x74AFE49F ^ n2, 17) - 631918204) * 1957684383;
                    n3 = -611382718 * 1830472513 + 1663877335 ^ n2;
                    int cfr_ignored_29 = Integer.rotateLeft(0x7CFD9E8 ^ n2, 3) + -158793133;
                    n3 = (int)((long)(-1059159697 * 1830472513 + 1663877335 ^ n2) ^ 0xAC43C138B10972EDL ^ 0xAC43C138B10972EDL);
                    int cfr_ignored_30 = (Integer.rotateLeft(0xF9249B71 ^ n2, 18) + 801927658) * -115041423;
                    int cfr_ignored_31 = (int)(0x3B96354C27D4EB4FL ^ (long)n2 ^ 0x97E8831A2DB9DAFDL);
                    n3 = (203817119 * 1830472513 + 1663877335 ^ n2) + -253592346 - -253592346;
                    n += 2;
                    continue block23;
                }
            }
            int cfr_ignored_32 = Integer.rotateLeft(0x3D8760A9 ^ n2, 10) + 2009224114;
            int cfr_ignored_33 = (int)(0xFF35CE9427D4EB4FL ^ (long)n2 ^ 0x6058831A2DB853BAL);
            n3 = 203817119 * 1830472513 + 1663877335 ^ n2 ^ 0xE676D2A0 ^ 0xE676D2A0;
        }
    }

    private static void zwdh_2(class_2960 class_29602, int n) {
        try {
            Optional optional;
            int n2 = 782097367;
            n2 = Integer.rotateLeft(n2 * 953690909, 18) ^ 0xC62A8F79;
            class_2960 class_29603 = class_29602;
            n2 = Integer.rotateRight((class_29603 != null ? System.identityHashCode(class_29603) : 0) ^ n2, 8);
            int n3 = n2 ^ 0x10C222B8;
            if ((n3 ^ n2) != 281158328) {
                int cfr_ignored_0 = (0x3E5FF96F ^ n2) - -1470014698;
            }
            if ((optional = class_310.method_1551().method_1478().method_14486(class_29602)).isEmpty()) {
                System.err.println("Sound resource not found: " + String.valueOf(class_29602));
                return;
            }
            class_3298 class_32982 = (class_3298)optional.get();
            try (InputStream inputStream = class_32982.method_14482();){
                byte[] byArray = inputStream.readAllBytes();
                float f = Math.max(Float.intBitsToFloat(Integer.reverse(-497048630) ^ 0x6FE62D4D), (float)n / Float.intBitsToFloat(-1119233313 + -2055330527));
                new Thread(() -> thm_3.dhrkh(byArray, f)).start();
            }
        }
        catch (Exception exception) {
            System.err.println("Error loading sound: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private static void dhrkh(byte[] byArray, float f) {
        int n = dht_5.dghs_2(-591340642);
        n = (byArray != null ? System.identityHashCode(byArray) : 0) ^ n;
        int n2 = n ^ 0xB5503119;
        if ((n2 ^ n) != -1253035751) {
            int cfr_ignored_0 = Integer.rotateRight(0x6990EA87 ^ n, 16) - -857078380;
        }
        thm_3.jzh_4(byArray, f);
    }

    private static void zwa(class_2960 class_29602) {
        try {
            Optional optional;
            int n = 1850154580;
            n = Integer.rotateLeft(n * 1833569097, 3) ^ 0xE85E5C04;
            int n2 = n ^ 0xA99F712C;
            if ((n2 ^ n) != -1449168596) {
                int cfr_ignored_0 = (0xC7D86F78 ^ n) - 1326685910;
            }
            if ((optional = class_310.method_1551().method_1478().method_14486(class_29602)).isEmpty()) {
                System.err.println("Sound resource not found: " + String.valueOf(class_29602));
                return;
            }
            class_3298 class_32982 = (class_3298)optional.get();
            try (InputStream inputStream = class_32982.method_14482();){
                byte[] byArray = inputStream.readAllBytes();
                float f = 1.0f;
                new Thread(() -> thm_3.jdk_2(byArray, f)).start();
            }
        }
        catch (Exception exception) {
            System.err.println("Error loading sound: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private static void jdk_2(byte[] byArray, float f) {
        int n = dht_5.dghs_2(1334699515);
        int n2 = n ^ 0x54F596F6;
        if ((n2 ^ n) != 1425381110) {
            int cfr_ignored_0 = Integer.rotateLeft(0x1B78730D ^ n, 6) - 1475579342;
            int cfr_ignored_1 = (int)(0xD9CADD3027D4EB4FL ^ (long)n ^ 0x4710831A2DB81E44L);
        }
        thm_3.jzh_4(byArray, f);
    }

    private static void khrd(class_2960 class_29602) {
        try {
            Optional optional;
            int n = 2008590129;
            n = Integer.rotateLeft(n * 1314066227, 25) ^ 0xDF02B8F8;
            int n2 = n ^ 0xA8783239;
            if ((n2 ^ n) != -1468517831) {
                int cfr_ignored_0 = (0xDFC09508 ^ n) - -2004545731;
            }
            if ((optional = class_310.method_1551().method_1478().method_14486(class_29602)).isEmpty()) {
                System.err.println("Sound resource not found: " + String.valueOf(class_29602));
                return;
            }
            class_3298 class_32982 = (class_3298)optional.get();
            new Thread(() -> thm_3.tthq(class_32982)).start();
        }
        catch (Exception exception) {
            System.err.println("Error loading sound resource: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private static void tthq(class_3298 class_32982) {
        try {
            int n = -41479377;
            n = Integer.rotateLeft(n * 840041683, 5) ^ 0xE95C05CF;
            class_3298 class_32983 = class_32982;
            n = (class_32983 != null ? System.identityHashCode(class_32983) : 0) ^ n;
            int n2 = n ^ 0xE6EDDA59;
            if ((n2 ^ n) != -420619687) {
                int cfr_ignored_0 = (0x1B6AC976 ^ n) - -1578465631;
            }
            if (yf.dnkh()) {
                throw null;
            }
            try (InputStream inputStream = class_32982.method_14482();){
                Player player = new Player(inputStream);
                player.play();
            }
        }
        catch (Exception exception) {
            System.err.println("Error playing MP3: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private static void jfm(String string) {
        Object object;
        try {
            int n = 178432393;
            n = Integer.rotateLeft(n * -577257501, 16) ^ 0xC6695C36;
            int n2 = n ^ 0xBA985E36;
            if ((n2 ^ n) != -1164419530) {
                int cfr_ignored_0 = (0xB03AF7BF ^ n) + -468059683;
            }
            if ((0x26F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        InputStream inputStream = thm_3.class.getResourceAsStream(string);
        if (inputStream == null) {
            object = string.startsWith("/") ? string.substring(1) : string;
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream((String)object);
        }
        if (inputStream == null) {
            object = string.startsWith("/") ? string.substring(1) : string;
            inputStream = FabricLoader.getInstance().getModContainer("moondlc").flatMap(arg_0 -> thm_3.thshm((String)object, arg_0)).map(thm_3::trz_2).orElse(null);
        }
        if (inputStream == null) {
            Moondlc.dhrn.error("Sound stream is null for path: " + string);
            return;
        }
        try {
            object = inputStream;
            try {
                Player player = new Player((InputStream)object);
                player.play();
            }
            finally {
                if (object != null) {
                    ((InputStream)object).close();
                }
            }
        }
        catch (Exception exception) {
            Moondlc.dhrn.error("Error playing direct MP3: " + exception.getMessage(), (Throwable)exception);
        }
    }

    private static InputStream trz_2(Path path) {
        try {
            int n = 687680504;
            n = Integer.rotateLeft(n * 959404241, 3) ^ 0xDF45F967;
            int n2 = n ^ 0xBA25CE7C;
            if ((n2 ^ n) != -1171927428) {
                int cfr_ignored_0 = (0x92D8E584 ^ n) - 1265485023;
            }
            return Files.newInputStream(path, new OpenOption[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Optional thshm(String string, ModContainer modContainer) {
        block0: {
            int n = dht_5.dghs_2(-2097005696);
            int n2 = n ^ 0xF5CF8D42;
            if ((n2 ^ n) == -170947262) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x76CDB6C2 ^ n, 17) + 1732690105;
        }
        return modContainer.findPath(string);
    }

    private static void ttkh_2(String string) {
        Object object;
        InputStream inputStream;
        int n = -1254535131;
        n = Integer.rotateLeft(n * -1545022821, 27) ^ 0xB8244E06;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 26);
        int n2 = n ^ 0x4541EBF8;
        if ((n2 ^ n) != 1161948152) {
            int cfr_ignored_0 = (0xF078BBDD ^ n) - 1388783717;
        }
        if ((inputStream = thm_3.class.getResourceAsStream(string)) == null) {
            object = string.startsWith("/") ? string.substring(1) : string;
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream((String)object);
        }
        if (inputStream == null) {
            object = string.startsWith("/") ? string.substring(1) : string;
            inputStream = FabricLoader.getInstance().getModContainer("moondlc").flatMap(arg_0 -> thm_3.djsh((String)object, arg_0)).map(thm_3::hba_2).orElse(null);
        }
        if (inputStream == null) {
            Moondlc.dhrn.error("Sound stream is null for path: " + string);
            return;
        }
        try {
            object = inputStream;
            try {
                byte[] byArray = ((InputStream)object).readAllBytes();
                thm_3.jzh_4(byArray, 1.0f);
            }
            finally {
                if (object != null) {
                    ((InputStream)object).close();
                }
            }
        }
        catch (Exception exception) {
            Moondlc.dhrn.error("Error playing direct WAV: " + exception.getMessage(), (Throwable)exception);
        }
    }

    private static InputStream hba_2(Path path) {
        try {
            int n = -817491522;
            n = Integer.rotateLeft(n * 387901371, 6) ^ 0xBF0B6BE5;
            Path path2 = path;
            n = (path2 != null ? System.identityHashCode(path2) : 0) ^ n;
            int n2 = n ^ 0xFBF8932E;
            if ((n2 ^ n) != -67595474) {
                int cfr_ignored_0 = (0x34BE8290 ^ n) + 1074271623;
            }
            return Files.newInputStream(path, new OpenOption[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Optional djsh(String string, ModContainer modContainer) {
        block0: {
            int n = 614669959;
            n = Integer.rotateLeft(n * 1162885659, 26) ^ 0xAB417694;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
            int n2 = n ^ 0x838272B4;
            if ((n2 ^ n) == -2088602956) break block0;
            int cfr_ignored_0 = (0xA7216C33 ^ n) + 1071619951;
        }
        return modContainer.findPath(string);
    }

    private static String khmgh(String string, int n, int n2, int n3) {
        int n4 = -1095764286;
        n4 = Integer.rotateLeft(n4 * 75841919, 18) ^ 0xA0B802B2;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0x4EBBF9E4;
        if ((n5 ^ n4) != 1320942052) {
            int cfr_ignored_0 = (0xF0140F26 ^ n4) + -20947849;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x47B53BBD ^ n2 - i) + shdkh_2, 8) ^ zz_3 + i * -1474273375));
        }
        return new String(cArray);
    }

    private static void zaa_7() {
        int n = dht_5.dghs_2(685415994);
        int n2 = n ^ 0xC21E1D0C;
        if ((n2 ^ n) != -1038213876) {
            int cfr_ignored_0 = (Integer.rotateRight(0xEAC48336 ^ n, 16) - 1915323077) * -356220105;
        }
        yf.athz_2();
    }

    private static boolean zshth() {
        block0: {
            int n = -618270980;
            int n2 = (n = Integer.rotateLeft(n * 1239558525, 14) ^ 0xEF2401FE) ^ 0x8593C019;
            if ((n2 ^ n) == -2053914599) break block0;
            int cfr_ignored_0 = (0x5EB62EE5 ^ n) + -622698837;
        }
        return yf.dnkh();
    }

    private static class_2960 zad_7(String string, String string2) {
        block0: {
            int n = dht_5.dghs_2(-1030972442);
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x9C0386F6;
            if ((n2 ^ n) == -1677490442) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5E8F1D10 ^ n, 14) + 2008163371) * 1586437393;
        }
        return class_2960.method_60655((String)string, (String)string2);
    }

    private static String sfdh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -142929062;
            n4 = Integer.rotateLeft(n4 * 760319449, 22) ^ 0x31397A53;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 16);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 16)) ^ 0x48C2FA9E;
            if ((n5 ^ n4) == 1220737694) break block0;
            int cfr_ignored_0 = (0xBFB9E9C4 ^ n4) - 2119010724;
        }
        return thm_3.khmgh(string, n, n2, n3);
    }

    private static String smh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = dht_5.dghs_2(725221042);
            int n5 = (n4 = n ^ n4) ^ 0xC4FCAB67;
            if ((n5 ^ n4) == -990074009) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xEFC555D5 ^ n4, 16) - 222495750) * -272280107;
            int cfr_ignored_1 = (int)(0x2D77FBE827D4EB4FL ^ (long)n4 ^ 0xAA0831A2DB9F73EL);
        }
        return thm_3.khmgh(string, n, n2, n3);
    }

    private static class_310 dhrs() {
        block0: {
            int n = 1755617221;
            int n2 = (n = Integer.rotateLeft(n * 1704078561, 14) ^ 0x1436812F) ^ 0x5399AEFB;
            if ((n2 ^ n) == 1402580731) break block0;
            int cfr_ignored_0 = (0x3B3D393E ^ n) + 897862305;
        }
        return class_310.method_1551();
    }

    private static float zth_8(float f, float f2) {
        block0: {
            int n = -1891710871;
            n = Integer.rotateLeft(n * 577626487, 3) ^ 0xD447B5A9;
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 23);
            int n2 = n ^ 0x9787E83;
            if ((n2 ^ n) == 158891651) break block0;
            int cfr_ignored_0 = (0x8646B6EA ^ n) - 1192952374;
        }
        return Math.max(f, f2);
    }

    private static void bma_2(FloatControl floatControl, float f) {
        int n = dht_5.dghs_2(-343976709);
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x9FA25BBA;
        if ((n2 ^ n) != -1616749638) {
            int cfr_ignored_0 = Integer.rotateLeft(0x74DD0F41 ^ n, 17) + 723679258;
            int cfr_ignored_1 = (int)(0xB66FA17C27D4EB4FL ^ (long)n ^ 0xBF88831A2DB8C10EL);
        }
        floatControl.setValue(f);
    }

    private static void ghdh(Throwable throwable, Throwable throwable2) {
        int n = 2128857272;
        n = Integer.rotateLeft(n * 1480760687, 11) ^ 0x299D8071;
        Throwable throwable3 = throwable2;
        n = (throwable3 != null ? System.identityHashCode(throwable3) : 0) ^ n;
        int n2 = n ^ 0x63A47D9A;
        if ((n2 ^ n) != 1671724442) {
            int cfr_ignored_0 = (0x1D47B522 ^ n) + 1374121693;
        }
        throwable.addSuppressed(throwable2);
    }

    private static String[] ata(String string) {
        block0: {
            int n = -330572427;
            n = Integer.rotateLeft(n * 1178136669, 10) ^ 0x63A141EB;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x74112234;
            if ((n2 ^ n) == 1947279924) break block0;
            int cfr_ignored_0 = (0x985AFF41 ^ n) - 1789040018;
        }
        return string.split("\b\u0016", -1);
    }

    private static CallSite bss_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1896857453;
            n3 = Integer.rotateLeft(n3 * -1229684745, 5) ^ 0xDBF3C88F;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 18);
            n3 = n ^ n3;
            int n4 = n3 ^ 0x5F4693CE;
            if ((n4 ^ n3) != 1598460878) {
                int cfr_ignored_0 = (0xD1B6D35D ^ n3) - 1847324544;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ khfd ^ string.hashCode() ^ n2 + stm ^ i * 2058830755 ^ khfd, 25) ^ stm));
            }
            String[] stringArray = thm_3.ata(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ylojui5pgs(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite luozfq37x7z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ lp7ykb26 ^ string.hashCode() ^ n2 + rijlgs5ehhz2l ^ i * 461856215 ^ lp7ykb26, 24) ^ rijlgs5ehhz2l));
            }
            String[] stringArray = thm_3.ylojui5pgs(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

