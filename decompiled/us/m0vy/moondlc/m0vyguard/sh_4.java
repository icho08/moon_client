/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.UUID;
import us.m0vy.moondlc.m0vyguard.bshth;
import us.m0vy.moondlc.m0vyguard.yf;

public class sh_4 {
    private static final int td_2 = 594684353;
    private static final int sad_3 = -761033507;
    private static final int jdhz_2 = -838436635;
    private static final int skj = -652330187;
    private static final int hw2ggvxalrw = 1823419501;
    private static final int ffuhcq8fypt6 = 1035915070;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xb3prrxu170m;

    public static UUID nkh(String string) {
        try {
            try {
                int n = -1533921975;
                n = Integer.rotateLeft(n * -769438037, 28) ^ 0x8DD2E820;
                int n2 = n ^ 0x3D26627F;
                if ((n2 ^ n) != 1025925759) {
                    int cfr_ignored_0 = (0x99B45736 ^ n) + 320476314;
                }
                if ((0x3CF & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            if (!yf.khdha_2()) {
                sh_4.khmy();
            }
            return UUID.fromString(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return sh_4.szf(string);
        }
    }

    /*
     * Unable to fully structure code
     */
    private static UUID szf(String var0) {
        var1_1 = 0L;
        var3_2 = 0L;
        var7_3 = 0;
        var5_4 = -2117575767;
        var5_4 = Integer.rotateLeft(var5_4 * -600888807, 25) ^ -545458808;
        var6_5 = -31919705 + var5_4 ^ -337470179 ^ -337470179;
        while (true) {
            block36: {
                block37: {
                    block26: {
                        block35: {
                            block30: {
                                block27: {
                                    block29: {
                                        block28: {
                                            block31: {
                                                block33: {
                                                    block32: {
                                                        block34: {
                                                            var7_3 = var6_5 - var5_4;
                                                            switch (var7_3 & 7) {
                                                                case 1: {
                                                                    if (var7_3 == -615054479) break block26;
                                                                    if (var7_3 != -1122849287) {
                                                                        ** break;
                                                                    }
                                                                    break block27;
                                                                }
                                                                case 2: {
                                                                    if (var7_3 == 116304082) break block28;
                                                                    if (var7_3 == 1167061786) break;
                                                                    Integer.rotateRight(-425162458 ^ var5_4, 15) - -221889835;
                                                                    if (var7_3 != -713890662) {
                                                                        ** break;
                                                                    }
                                                                    break block29;
                                                                }
                                                                case 4: {
                                                                    if (var7_3 == -346089444) break block30;
                                                                    if (var7_3 != 973716196) {
                                                                        ** break;
                                                                    }
                                                                    break block31;
                                                                }
                                                                case 5: {
                                                                    if (var7_3 != -118347163) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 7: {
                                                                    if (var7_3 == 57168591) break block33;
                                                                    if (var7_3 == -31919705) break block34;
                                                                    Integer.rotateRight(-1216773206 ^ var5_4, 9) + 1007980753;
                                                                    if (var7_3 == 1645458639) break block35;
                                                                    if (var7_3 == -1228561001) break block36;
                                                                    if (var7_3 != -1350446721) {
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                            }
                                                            (Integer.rotateLeft(1519821520 ^ var5_4, 14) + -56928661) * 1519821521;
                                                            var1_1 = sh_4.slz_4(var0.substring(0, sh_4.skm(-1393029476 ^ -1393025380, 24)), Integer.reverse(-503428824) ^ 345145239);
                                                            var3_2 = Long.parseUnsignedLong(var0.substring(1501654247 ^ 1501654263, -1786816290 - -1786816322), -1257012757 - -1257012773);
                                                            return new UUID(var1_1, var3_2);
                                                        }
                                                        (Integer.rotateLeft(1869027824 ^ var5_4, 16) + -2116435125) * 1869027825;
                                                        if (var0.length() != -1084844214 + 1084844246) {
                                                            if (!bshth.akj(var5_4, 692574609)) {
                                                                (Integer.rotateLeft(-776604684 ^ var5_4, 13) - 1768303047) * -776604683;
                                                            }
                                                            var6_5 = (int)((long)(-118347163 + var5_4) ^ -6345079566097037599L ^ -6345079566097037599L);
                                                            --var7_3;
                                                            continue;
                                                        }
                                                        try {
                                                            var6_5 = 1167061786 + var5_4 + -388881615 - -388881615;
                                                        }
                                                        catch (IllegalStateException v0) {
                                                            var6_5 = Integer.reverse(Integer.reverse(1167061786 + var5_4));
                                                        }
                                                        var7_3 -= 5;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1864016244 ^ var5_4, 16) - 2023173191) * 1864016245;
                                                    throw new IllegalArgumentException("Invalid UUID len".concat("gth, expecte").concat("d 32 characters"));
                                                }
                                                (Integer.rotateRight(1877970459 ^ var5_4, 16) + -1839213440) * 1877970459;
                                                var6_5 = -1725337781 + var5_4 + -1075996527 - -1075996527;
                                                bshth.shlz_2(-4162528, var5_4);
                                                (int)(7059117097750264853L ^ (long)var5_4 ^ -701943448780050881L);
                                                if (!bshth.akj(var5_4, 253616812)) {
                                                    Integer.rotateRight(-251325685 ^ var5_4, 17) + 872082832;
                                                }
                                                var6_5 = Integer.reverse(Integer.reverse(-31919705 + var5_4));
                                                var7_3 += 5;
                                                continue;
                                            }
                                            (Integer.rotateLeft(2038057520 ^ var5_4, 18) + -1171481845) * 2038057521;
                                            var6_5 = 1502383400 + var5_4;
                                            Integer.rotateLeft(-2131804403 ^ var5_4, 3) - -1588182578;
                                            (int)(4782138015350057807L ^ (long)var5_4 ^ -2373252855164753558L);
                                            if (!bshth.akj(var5_4, -681738030)) {
                                                (Integer.rotateLeft(692416885 ^ var5_4, 8) - 63331430) * 692416885;
                                                (int)(-1443439654550049969L ^ (long)var5_4 ^ 4891053343783811646L);
                                            }
                                            var6_5 = -31919705 + var5_4;
                                            continue;
                                        }
                                        (Integer.rotateRight(1755685211 ^ var5_4, 16) + -1335088832) * 1755685211;
                                        var6_5 = -798799091 + var5_4 + -1591596100 - -1591596100;
                                        Integer.rotateRight(1730857059 ^ var5_4, 15) + -2104761544;
                                        if (!bshth.akj(var5_4, 1630796937)) {
                                            Integer.rotateRight(-1624568530 ^ var5_4, 6) - 1251227597;
                                        }
                                        var6_5 = -31919705 + var5_4 + 8838452 - 8838452;
                                        var7_3 -= 5;
                                        continue;
                                    }
                                    (Integer.rotateLeft(99474676 ^ var5_4, 3) - -1138007865) * 99474677;
                                    (int)(-3796156126336399656L ^ (long)var5_4 ^ 5569737935316990835L);
                                    var6_5 = (int)((long)(-31919705 + var5_4) ^ 608783898078552759L ^ 608783898078552759L);
                                    --var7_3;
                                    continue;
                                }
                                (Integer.rotateLeft(2074951121 ^ var5_4, 18) + -27780214) * 2074951121;
                                (int)(-5107200809925022897L ^ (long)var5_4 ^ -2690756628894392338L);
                                var6_5 = Integer.reverse(Integer.reverse(-811634848 + var5_4));
                                Integer.rotateLeft(-26833559 ^ var5_4, 18) + -758595854;
                                (int)(4383167181690825551L ^ (long)var5_4 ^ -4911031245187984263L);
                                if (bshth.akj(var5_4, 300637529)) {
                                    (Integer.rotateRight(-269243138 ^ var5_4, 16) - 316641789) * -269243137;
                                }
                                var6_5 = (int)((long)(-31919705 + var5_4) ^ 9073554190409793836L ^ 9073554190409793836L);
                                var7_3 -= 3;
                                continue;
                            }
                            Integer.rotateLeft(-1386491284 ^ var5_4, 8) - 41687631;
                            try {
                                if ((-3725194899841697131L ^ (long)var5_4 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                var6_5 = -31919705 + var5_4;
                            }
                            catch (UnsupportedOperationException v1) {
                                var6_5 = -31919705 + var5_4;
                            }
                            continue;
                        }
                        Integer.rotateRight(-1807406329 ^ var5_4, 5) - -121776876;
                        (int)(850508285719983749L ^ (long)var5_4 ^ -4251401309893313974L);
                        var6_5 = Integer.reverse(Integer.reverse(-1380859459 + var5_4));
                        (int)(-5726638608096932394L ^ (long)var5_4 ^ 3782181475588951260L);
                        var6_5 = Integer.reverse(Integer.reverse(-31919705 + var5_4));
                        continue;
                    }
                    Integer.rotateLeft(1351530441 ^ var5_4, 13) + -978984814;
                    (int)(-7909418309138453681L ^ (long)var5_4 ^ -3559951356976920151L);
                    (int)(6317355346585433193L ^ (long)var5_4 ^ 9160285309130572422L);
                    var6_5 = -376581910 + var5_4 ^ 1783974247 ^ 1783974247;
                    (int)(-9114860198634815663L ^ (long)var5_4 ^ -535212852667699502L);
                    var6_5 = -31919705 + var5_4 + -225499739 - -225499739;
                    var7_3 += 2;
                    continue;
                }
                Integer.rotateLeft(1347109672 ^ var5_4, 13) + -1116028653;
                if (!bshth.akj(var5_4, -2079326034)) {
                    Integer.rotateLeft(2047406345 ^ var5_4, 18) + -881668270;
                    (int)(-5135687747451425969L ^ (long)var5_4 ^ 4834758348441705637L);
                }
                var6_5 = (int)((long)(-31919705 + var5_4) ^ 8033536476528668920L ^ 8033536476528668920L);
                var7_3 += 5;
                continue;
            }
            Integer.rotateRight(808200939 ^ var5_4, 9) + -642330192;
            if (bshth.akj(var5_4, 2013705111)) {
                (Integer.rotateLeft(-2044837328 ^ var5_4, 3) + 1107796747) * -2044837327;
            }
            var6_5 = -31919705 + var5_4;
            var7_3 += 4;
            continue;
lbl187:
            // 6 sources

            Integer.rotateRight(12838503 ^ var5_4, 3) - 471238068;
            var6_5 = -31919705 + var5_4 + -1357025869 - -1357025869;
        }
    }

    public static UUID ghkhd(String string) {
        block0: {
            int n = bshth.stm(2052022471);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x3A41B819;
            if ((n2 ^ n) == 977385497) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x400ED8DE ^ n, 11) - -970333667) * 1074714847;
        }
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes());
    }

    private static String aqs(String string, int n, int n2, int n3) {
        int n4 = -798395816;
        n4 = Integer.rotateLeft(n4 * 1228351579, 4) ^ 0x49EEE50D;
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 20)) ^ 0xE62CA8CD;
        if ((n5 ^ n4) != -433280819) {
            int cfr_ignored_0 = (0x3645DA95 ^ n4) + -537731255;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x1E240BD1) + n2 ^ i * 407761951) ^ td_2) + sad_3);
        }
        return new String(cArray);
    }

    private static void khmy() {
        int n = 1849632330;
        int n2 = (n = Integer.rotateLeft(n * 869272623, 27) ^ 0x9B87D03) ^ 0x4E40ED5C;
        if ((n2 ^ n) != 1312877916) {
            int cfr_ignored_0 = (0x207FCB16 ^ n) + -1509823851;
        }
        yf.athz_2();
    }

    private static int skm(int n, int n2) {
        block0: {
            int n3 = -1778214342;
            int n4 = (n3 = Integer.rotateLeft(n3 * -2017061589, 6) ^ 0x6F3324EE) ^ 0x468F04FB;
            if ((n4 ^ n3) == 1183778043) break block0;
            int cfr_ignored_0 = (0xD08D9EC1 ^ n3) + 1152575372;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static long slz_4(String string, int n) {
        block0: {
            int n2 = bshth.stm(1582079462);
            int n3 = n2 ^ 0xEBE6DC16;
            if ((n3 ^ n2) == -337191914) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB5AA41F0 ^ n2, 9) + 66820939) * -1247133199;
        }
        return Long.parseUnsignedLong(string, n);
    }

    private static String[] dlb(String string) {
        int n = 116660147;
        n = Integer.rotateLeft(n * -257321581, 11) ^ 0xBE297A11;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
        int n2 = n ^ 0xCAA2A658;
        if ((n2 ^ n) != -895310248) {
            int cfr_ignored_0 = (0xCC56B1EB ^ n) - -153907344;
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

    private static CallSite jht_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 445876710;
            n3 = Integer.rotateLeft(n3 * -1172547397, 28) ^ 0xF55E1757;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            n3 = Integer.rotateRight(n ^ n3, 4);
            int n4 = n3 ^ 0xD7120F1D;
            if ((n4 ^ n3) != -686682339) {
                int cfr_ignored_0 = (0xCD8186FB ^ n3) + -181433720;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jdhz_2 ^ string.hashCode()) + (n2 + skj) + i ^ jdhz_2, 12) + skj);
            }
            String[] stringArray = sh_4.dlb(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] s3946fh09alnvj(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite l8h8j7bmjus80j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hw2ggvxalrw ^ string.hashCode()) + (n2 + ffuhcq8fypt6) + i ^ hw2ggvxalrw, 26) + ffuhcq8fypt6);
            }
            String[] stringArray = sh_4.s3946fh09alnvj(new String(cArray));
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

