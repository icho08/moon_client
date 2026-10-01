/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1044
 *  net.minecraft.class_2561
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1044;
import net.minecraft.class_2561;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bta_2;
import us.m0vy.moondlc.m0vyguard.bshd;
import us.m0vy.moondlc.m0vyguard.bshn;
import us.m0vy.moondlc.m0vyguard.bnw;
import us.m0vy.moondlc.m0vyguard.tjsh;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.yf;
import us.m0vy.moondlc.m0vyguard.yl;
import us.movy.moondlc.Moondlc;

public final class bqw {
    private final String sbw_2;
    private final class_1044 hyz;
    private final yl smgh;
    private final bnw zlk;
    private final Map jdt_4;
    private final Map hqt_2;
    private final ConcurrentHashMap blt_2 = new ConcurrentHashMap();
    private static final int wth = 1229787787;
    private static final int sthgh_2 = 458561302;
    private static final int khzh = -1106881244;
    private static final int zsh_5 = 1377640754;
    private static final int vrwbvp37w1rwc = -1333982450;
    private static final int re4dbk9fp8t = 1169864389;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wbdr7tf1f1n;

    private bqw(String string, class_1044 class_10443, yl yl2, bnw bnw2, Map map, Map map2) {
        this.sbw_2 = string;
        this.hyz = class_10443;
        this.smgh = yl2;
        this.zlk = bnw2;
        this.jdt_4 = map;
        this.hqt_2 = map2;
    }

    public int zas() {
        block0: {
            int n = 220051477;
            int n2 = (n = Integer.rotateLeft(n * 2097164649, 17) ^ 0xD6E3F32B) ^ 0x938A7F76;
            if ((n2 ^ n) == -1819639946) break block0;
            int cfr_ignored_0 = (0x9E97C763 ^ n) + -127606681;
        }
        return bqw.thkhth(this.hyz);
    }

    public void zkhkh(Matrix4f matrix4f, class_4588 class_45882, String string, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        int n2 = -1139298336;
        n2 = Integer.rotateLeft(n2 * 386638637, 15) ^ 0xA6485653;
        n2 = System.identityHashCode(this) ^ n2;
        Matrix4f matrix4f2 = matrix4f;
        n2 = Integer.rotateLeft((matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n2, 22);
        int n3 = n2 ^ 0x8CD4A6C8;
        if ((n3 ^ n2) != -1932220728) {
            int cfr_ignored_0 = (0x30C30928 ^ n2) + -2067619970;
        }
        int n4 = -1;
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (bl) {
                bl = false;
                continue;
            }
            if (c == (Integer.reverse(-180002002) ^ 0x74C6A208)) {
                bl = true;
                continue;
            }
            bta_2 bta2 = (bta_2)this.jdt_4.get(c);
            if (bta2 == null) continue;
            Map map = (Map)this.hqt_2.get(n4);
            if (map != null) {
                f4 += map.getOrDefault(c, bqw.ddn_3(0.0f)).floatValue() * f;
            }
            f4 += bta2.tdd_2(matrix4f, class_45882, f, f4, f5, f6, n) + f2 + f3;
            n4 = c;
        }
    }

    public float tba_3(String string, float f) {
        try {
            int n = 425726380;
            n = Integer.rotateLeft(n * -1795851469, 28) ^ 0x596FB38;
            n = System.identityHashCode(this) ^ n;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
            int n2 = n ^ 0x952679F5;
            if ((n2 ^ n) != -1792640523) {
                int cfr_ignored_0 = (0x8C466859 ^ n) - -1862176103;
            }
            if ((0x28E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        string = bqw.rfa_2(string, "\u0456", "i").replace("\u0406", "I");
        int n = -1;
        float f2 = 0.0f;
        boolean bl = false;
        tjsh tjsh2 = (tjsh)Moondlc.getInstance().getModuleManager().dfr_2(tjsh.class);
        if (tjsh2 != null && bqw.sas(tjsh2)) {
            string = tjsh2.thbw(string);
        }
        float f3 = Float.intBitsToFloat(375256665 + 644798068) * f;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (bl) {
                bl = false;
                continue;
            }
            if (c == (0xCB501144 ^ 0xCB5011E3)) {
                bl = true;
                continue;
            }
            bta_2 bta2 = (bta_2)this.jdt_4.get(bqw.djy(c));
            if (bta2 == null) continue;
            Map map = (Map)this.hqt_2.get(n);
            if (map != null) {
                f2 += map.getOrDefault(bqw.zagh(c), bqw.dth_4(0.0f)).floatValue() * f;
            }
            f2 += bta2.jlz(f) + f3;
            n = c;
        }
        return f2;
    }

    private static long zaq_2(String string, float f, boolean bl) {
        int n = bshn.dmf_2(-77071231);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 16);
        int n2 = n ^ 0xDE0E2A58;
        if ((n2 ^ n) != -569497000) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x2569D6D9 ^ n, 7) + -1943100542) * 627693273;
            int cfr_ignored_1 = (int)(0xE7DB78E427D4EB4FL ^ (long)n ^ 0xCB8831A2DB86267L);
        }
        int n3 = string.hashCode();
        return (long)n3 & (0xD7DB7AA2D6B94CA2L ^ 0xD7DB7AA22946B35DL) ^ (long)Float.floatToIntBits(f) << -2007222400 + 2007222432 ^ (bl ? 0x7E0FC39DEAEA70EBL ^ 0xE038BA2495A00CFEL : 0L);
    }

    public float dzh_3(String string, float f) {
        long l;
        Float f2;
        int n = -901611186;
        n = Integer.rotateLeft(n * -2074587369, 9) ^ 0x58CDA883;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x6B50D7E8;
        if ((n2 ^ n) != 1800460264) {
            int cfr_ignored_0 = (0xA11256A6 ^ n) - 1377827830;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        string = string.replace("\u0456", "i").replace("\u0406", bqw.rbd("弁", 325962600 - -1142071917, bqw.ssh_9(0xA0C1B4E6 ^ 0x82A5512D, 18), Integer.reverse(872067758) ^ 0x63EB21CC));
        tjsh tjsh2 = (tjsh)Moondlc.getInstance().getModuleManager().dfr_2(tjsh.class);
        boolean bl = tjsh2.rgha_2();
        if (bl) {
            string = tjsh2.thbw(string);
        }
        if ((f2 = (Float)this.blt_2.get(l = bqw.zaq_2(string, f, bl))) != null) {
            return f2.floatValue();
        }
        float f3 = bqw.shjq(this, string, f);
        this.blt_2.put(l, Float.valueOf(f3));
        return f3;
    }

    public void sbsh() {
        int n = -1142968924;
        n = Integer.rotateLeft(n * -1816182739, 19) ^ 0x5474A702;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
        int n2 = n ^ 0x4CAF3081;
        if ((n2 ^ n) != 1286549633) {
            int cfr_ignored_0 = (0xF7709D25 ^ n) - -828610143;
        }
        this.blt_2.clear();
    }

    public float shar(class_2561 class_25612, float f) {
        block0: {
            int n = 2076376596;
            n = Integer.rotateLeft(n * 1380082145, 11) ^ 0xF3ABA8D2;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2F9E9335;
            if ((n2 ^ n) == 798921525) break block0;
            int cfr_ignored_0 = (0x545C6D21 ^ n) + -1200116742;
        }
        return this.dzh_3(class_25612.getString(), f);
    }

    public trd twy_2(float f) {
        int n = -142243809;
        n = Integer.rotateLeft(n * -238957797, 22) ^ 0x6D8E5456;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x1FC1140E;
        if ((n2 ^ n) != 532747278) {
            int cfr_ignored_0 = (0xE8449C11 ^ n) - -2141632735;
        }
        return new trd(this, f);
    }

    public String getName() {
        block0: {
            int n = bshn.dmf_2(621548626);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x51E4FFFA;
            if ((n2 ^ n) == 1373962234) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x74E8EBA8 ^ n, 17) + 747776147;
        }
        return this.sbw_2;
    }

    public yl dhksh() {
        block0: {
            int n = bshn.dmf_2(-1939399141);
            int n2 = n ^ 0xFF566B2C;
            if ((n2 ^ n) == -11113684) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x73317537 ^ n, 17) - -145043228) * 1932621111;
        }
        return this.smgh;
    }

    public bnw shzth() {
        block0: {
            int n = -389376834;
            n = Integer.rotateLeft(n * -1522444775, 10) ^ 0x95B86E22;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8D22C4F9;
            if ((n2 ^ n) == -1927101191) break block0;
            int cfr_ignored_0 = (0x65E85047 ^ n) - -131007152;
        }
        return this.zlk;
    }

    public static bshd zthq_2() {
        return new bshd();
    }

    private static String rbd(String string, int n, int n2, int n3) {
        try {
            int n4 = -2062048478;
            n4 = Integer.rotateLeft(n4 * -404320121, 13) ^ 0xFC2901E9;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 3);
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0xA65DA31;
            if ((n5 ^ n4) != 174447153) {
                int cfr_ignored_0 = (0x8F727913 ^ n4) - 730930027;
            }
            if ((0x16F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x470B9360) + n2 ^ i * 971457001) ^ wth) + sthgh_2);
        }
        return new String(cArray);
    }

    private static int thkhth(class_1044 class_10443) {
        block0: {
            int n = bshn.dmf_2(-529390422);
            int n2 = n ^ 0xD1C3F7B1;
            if ((n2 ^ n) == -775686223) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x31B1D31B ^ n, 9) + 149303168) * 833737499;
        }
        return class_10443.method_4624();
    }

    private static Float ddn_3(float f) {
        block0: {
            int n = -676525129;
            n = Integer.rotateLeft(n * 4069289, 23) ^ 0xFC92E857;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 6);
            int n2 = n ^ 0x655A3381;
            if ((n2 ^ n) == 1700410241) break block0;
            int cfr_ignored_0 = (0xB2F73836 ^ n) - 1235792380;
        }
        return Float.valueOf(f);
    }

    private static String rfa_2(String string, CharSequence charSequence, CharSequence charSequence2) {
        block0: {
            int n = 1837799567;
            n = Integer.rotateLeft(n * -712807671, 17) ^ 0x5DBF0C43;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
            CharSequence charSequence3 = charSequence;
            n = (charSequence3 != null ? System.identityHashCode(charSequence3) : 0) ^ n;
            int n2 = n ^ 0x135B7A2;
            if ((n2 ^ n) == 20297634) break block0;
            int cfr_ignored_0 = (0x6CBF2F2D ^ n) + -883187042;
        }
        return string.replace(charSequence, charSequence2);
    }

    private static String dhza_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bshn.dmf_2(1621804942);
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 8)) ^ 0xC91650D1;
            if ((n5 ^ n4) == -921284399) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA9BC975F ^ n4, 8) - -1842089028) * -1447258273;
        }
        return bqw.rbd(string, n, n2, n3);
    }

    private static boolean sas(tjsh tjsh2) {
        block0: {
            int n = 110411581;
            n = Integer.rotateLeft(n * -1294757549, 18) ^ 0x1AAA381;
            tjsh tjsh3 = tjsh2;
            n = Integer.rotateRight((tjsh3 != null ? System.identityHashCode(tjsh3) : 0) ^ n, 17);
            int n2 = n ^ 0xDB73D5F5;
            if ((n2 ^ n) == -613165579) break block0;
            int cfr_ignored_0 = (0xDDE76AC8 ^ n) - 1280047486;
        }
        return tjsh2.rgha_2();
    }

    private static Integer djy(int n) {
        block0: {
            int n2 = 1817490659;
            n2 = Integer.rotateLeft(n2 * -410838975, 26) ^ 0xB632369;
            int n3 = (n2 = n ^ n2) ^ 0x1F358020;
            if ((n3 ^ n2) == 523599904) break block0;
            int cfr_ignored_0 = (0x736134C3 ^ n2) - 1397716231;
        }
        return n;
    }

    private static Integer zagh(int n) {
        block0: {
            int n2 = bshn.dmf_2(1302801846);
            int n3 = (n2 = n ^ n2) ^ 0xFFCE6A40;
            if ((n3 ^ n2) == -3249600) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB26947F6 ^ n2, 9) - -1625467387) * -1301723145;
        }
        return n;
    }

    private static Float dth_4(float f) {
        block0: {
            int n = bshn.dmf_2(-111905526);
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 14);
            int n2 = n ^ 0x6B604B5F;
            if ((n2 ^ n) == 1801472863) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x92343E55 ^ n, 5) - -1196348538) * -1842069931;
            int cfr_ignored_1 = (int)(0x5086906827D4EB4FL ^ (long)n ^ 0xDDA0831A2DB90CDCL);
        }
        return Float.valueOf(f);
    }

    private static int ssh_9(int n, int n2) {
        block0: {
            int n3 = bshn.dmf_2(-724222964);
            int n4 = n3 ^ 0x32C85BFD;
            if ((n4 ^ n3) == 851991549) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE61D67F1 ^ n3, 15) + -504547990) * -434280463;
            int cfr_ignored_1 = (int)(0x24AFC9CC27D4EB4FL ^ (long)n3 ^ 0x6EE8831A2DB9E48EL);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float shjq(bqw bqw2, String string, float f) {
        block0: {
            int n = -149288517;
            n = Integer.rotateLeft(n * -1416410951, 13) ^ 0xC1E63C3;
            bqw bqw3 = bqw2;
            n = (bqw3 != null ? System.identityHashCode(bqw3) : 0) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 18);
            int n2 = n ^ 0x1EC2FEEB;
            if ((n2 ^ n) == 516095723) break block0;
            int cfr_ignored_0 = (0xE9D8F750 ^ n) + 1861421866;
        }
        return bqw2.tba_3(string, f);
    }

    private static String[] ttq_2(String string) {
        int n = bshn.dmf_2(1019381177);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xA3221CB4;
        if ((n2 ^ n) != -1558045516) {
            int cfr_ignored_0 = Integer.rotateLeft(0x9FE0990D ^ n, 6) - 1620060110;
            int cfr_ignored_1 = (int)(0x5D52373027D4EB4FL ^ (long)n ^ 0x9310831A2DB91775L);
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

    private static CallSite ztm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1728749879;
            n3 = Integer.rotateLeft(n3 * -244458487, 19) ^ 0xE49B6844;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 25);
            n3 = n ^ n3;
            int n4 = n3 ^ 0x656E047D;
            if ((n4 ^ n3) != 1701708925) {
                int cfr_ignored_0 = (0xFD9B5AB4 ^ n3) - -926060660;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ khzh ^ string.hashCode() ^ n2 + zsh_5 + i * -464749293) + khzh) ^ zsh_5));
            }
            String[] stringArray = bqw.ttq_2(new String(cArray));
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

    private static String[] l44gqyd8cxs0(String string) {
        return string.split("\u0007\u0011", -1);
    }

    private static CallSite vikp7eahlx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ vrwbvp37w1rwc ^ string.hashCode() ^ n2 + re4dbk9fp8t ^ i * -1001696623 ^ vrwbvp37w1rwc, 10) ^ re4dbk9fp8t));
            }
            String[] stringArray = bqw.l44gqyd8cxs0(new String(cArray));
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

