/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Timer", category=bzw.OTHER, desc="Changes the game tick speed")
public class dhq_3
extends bnq {
    private final tay ns = new tay(this, "Multiplier").shth_7(Float.intBitsToFloat(0xE0C21E18 ^ 0xDD0ED2D5)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xD4EA7AE7 ^ 0xD4EAFBA7, 15))).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xD8A16C15 ^ 0xBEC88273, 13))).ssd_5(2.0f);
    private final bql<btt> zkb = this::zyt;
    private static final int wa_2 = 1812005206;
    private static final int khtht = -1207742340;
    private static final int sh_2 = -104780769;
    private static final int bkh_2 = 285806468;
    private static final int avmiinptf = -1842509814;
    private static final int if1rye56 = 279664054;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rvmfa8xi5;

    @Override
    public void nc() {
        int n = 1887221671;
        n = Integer.rotateLeft(n * 114044447, 20) ^ 0x56A6932A;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
        int n2 = n ^ 0x11CC5348;
        if ((n2 ^ n) != 298603336) {
            int cfr_ignored_0 = (0x61B0E4EF ^ n) - 1066534669;
        }
        hd.htf();
    }

    /*
     * Unable to fully structure code
     */
    private void zyt(btt var1_1) {
        var4_2 = 0;
        var2_3 = 79387099;
        var2_3 = Integer.rotateLeft(var2_3 * -2097550323, 10) ^ 984598001;
        var2_3 = Integer.rotateRight(System.identityHashCode(this) ^ var2_3, 22);
        var3_4 = var2_3 - -1618791683 ^ 1672042374 ^ 1672042374;
        block29: while (true) {
            block57: {
                block55: {
                    block58: {
                        block49: {
                            block56: {
                                block51: {
                                    block59: {
                                        block50: {
                                            block48: {
                                                block54: {
                                                    block52: {
                                                        block53: {
                                                            var4_2 = var2_3 - var3_4;
                                                            switch (var4_2 & 7) {
                                                                case 7: {
                                                                    if (var4_2 != -1688980553) {
                                                                        ** break;
                                                                    }
                                                                    break block48;
                                                                }
                                                                case 6: {
                                                                    if (var4_2 == 701718310) break block49;
                                                                    if (var4_2 != -1464545330) {
                                                                        Integer.rotateRight(-627351634 ^ var2_3, 14) - 2100180301;
                                                                        ** break;
                                                                    }
                                                                    break block50;
                                                                }
                                                                case 3: {
                                                                    if (var4_2 != -478743669) {
                                                                        ** break;
                                                                    }
                                                                    break block51;
                                                                }
                                                                case 1: {
                                                                    if (var4_2 != -1443456623) {
                                                                        ** break;
                                                                    }
                                                                    break block52;
                                                                }
                                                                case 5: {
                                                                    if (var4_2 > -1152641355) ** GOTO lbl36
                                                                    if (var4_2 == -1618791683) break block53;
                                                                    if (var4_2 != -1152641355) {
                                                                        Integer.rotateRight(1220578954 ^ var2_3, 12) + -743513615;
                                                                        ** break;
                                                                    }
                                                                    break block54;
lbl36:
                                                                    // 1 sources

                                                                    if (var4_2 == -72446515) break block55;
                                                                    if (var4_2 != 482562621) {
                                                                        ** break;
                                                                    }
                                                                    break block56;
                                                                }
                                                                case 4: {
                                                                    if (var4_2 == -1672967508) break;
                                                                    if (var4_2 != -1726976460) {
                                                                        Integer.rotateRight(-849832670 ^ var2_3, 12) + -501764519;
                                                                        ** break;
                                                                    }
                                                                    break block57;
                                                                }
                                                                case 0: {
                                                                    if (var4_2 == 1209923472) break block58;
                                                                    if (var4_2 == 1524318096) ** GOTO lbl55
                                                                    Integer.rotateLeft(-947061852 ^ var2_3, 11) - 779098135;
                                                                    if (var4_2 != -1156997816) {
                                                                        ** break;
                                                                    }
                                                                    break block59;
lbl55:
                                                                    // 1 sources

                                                                    (Integer.rotateLeft(67641108 ^ var2_3, 3) - -2124848473) * 67641109;
                                                                    if (dhq_3.mc.field_1687 == null) {
                                                                        try {
                                                                            if ((7749366795649227235L ^ (long)var2_3 | 1L) == 0L) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            var3_4 = var2_3 - -1443456623 ^ 1432459363 ^ 1432459363;
                                                                        }
                                                                        catch (IllegalArgumentException v0) {
                                                                            var3_4 = var2_3 - -1443456623;
                                                                        }
                                                                        var4_2 -= 3;
                                                                        continue block29;
                                                                    }
                                                                    (int)(8348013796904989743L ^ (long)var2_3 ^ -3903515205992625563L);
                                                                    var3_4 = var2_3 - 165045765;
                                                                    (int)(4835112130073275517L ^ (long)var2_3 ^ 8415548567365430242L);
                                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1672967508));
                                                                    continue block29;
                                                                }
                                                            }
                                                            (Integer.rotateRight(-268752390 ^ var2_3, 16) + 331854977) * -268752389;
                                                            hd.sdhs(this.ns.thw_5());
                                                            return;
                                                        }
                                                        (Integer.rotateRight(-1437363914 ^ var2_3, 8) - -1535363899) * -1437363913;
                                                        if (dhq_3.mc.field_1724 == null) {
                                                            (int)(-4419865908343219781L ^ (long)var2_3 ^ 851083694022076547L);
                                                            var3_4 = var2_3 - 1404264525 + 143946153 - 143946153;
                                                            (int)(-5950584744828658015L ^ (long)var2_3 ^ 8077120108686014215L);
                                                            var3_4 = var2_3 - -1443456623;
                                                            var4_2 += 5;
                                                            continue;
                                                        }
                                                        try {
                                                            --var4_2;
                                                            if ((-5956672418735760957L ^ (long)var2_3 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            var3_4 = var2_3 - 1524318096 + -668942705 - -668942705;
                                                        }
                                                        catch (IllegalStateException v1) {
                                                            var3_4 = var2_3 - 1524318096;
                                                        }
                                                        var4_2 += 2;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(1548613960 ^ var2_3, 14) + 835636979;
                                                    return;
                                                }
                                                Integer.rotateLeft(-1283231263 ^ var2_3, 9) + -1052219014;
                                                (int)(8156546536798743375L ^ (long)var2_3 ^ 4812240350304882610L);
                                                var3_4 = var2_3 - -1585543722 ^ -1432980442 ^ -1432980442;
                                                (Integer.rotateLeft(-56136140 ^ var2_3, 18) - -1666975865) * -56136139;
                                                try {
                                                    var4_2 -= 5;
                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1618791683));
                                                }
                                                catch (NoSuchElementException v2) {
                                                    var3_4 = (int)((long)(var2_3 - -1618791683) ^ -304880337477602362L ^ -304880337477602362L);
                                                }
                                                var4_2 -= 3;
                                                continue;
                                            }
                                            (Integer.rotateRight(1838291391 ^ var2_3, 16) - 1225702748) * 1838291391;
                                            try {
                                                --var4_2;
                                                if ((3416960880716394417L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                var3_4 = var2_3 - -1618791683 + 369917150 - 369917150;
                                            }
                                            catch (UnsupportedOperationException v3) {
                                                var3_4 = var2_3 - -1618791683 + 1492750273 - 1492750273;
                                            }
                                            ++var4_2;
                                            continue;
                                        }
                                        Integer.rotateLeft(2058372073 ^ var2_3, 18) + -541730702;
                                        (int)(-5187322325320275121L ^ (long)var2_3 ^ 2799131316870241748L);
                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1618791683));
                                        var4_2 -= 3;
                                        continue;
                                    }
                                    (Integer.rotateRight(-1846046885 ^ var2_3, 5) + -1319634112) * -1846046885;
                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1248757968));
                                    (Integer.rotateLeft(-145161927 ^ var2_3, 17) + -131807966) * -145161927;
                                    (int)(3885391535920180047L ^ (long)var2_3 ^ -6667435099862481402L);
                                    try {
                                        ++var4_2;
                                        var3_4 = (int)((long)(var2_3 - -1618791683) ^ 6696714302705518075L ^ 6696714302705518075L);
                                    }
                                    catch (IllegalStateException v4) {
                                        var3_4 = (int)((long)(var2_3 - -1618791683) ^ -5716674381726126081L ^ -5716674381726126081L);
                                    }
                                    continue;
                                }
                                (Integer.rotateRight(653828891 ^ var2_3, 7) + -1132896384) * 653828891;
                                var3_4 = var2_3 - 575581826 ^ -1910179420 ^ -1910179420;
                                (Integer.rotateLeft(-1062909295 ^ var2_3, 11) + 1482794698) * -1062909295;
                                (int)(150840540593974095L ^ (long)var2_3 ^ 3758398037500209662L);
                                var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1618791683));
                                var4_2 += 5;
                                continue;
                            }
                            (Integer.rotateLeft(267254421 ^ var2_3, 4) - -231803066) * 267254421;
                            (int)(-3648104091947308209L ^ (long)var2_3 ^ 6061989246900123503L);
                            var3_4 = var2_3 - 1349587515 + -998031147 - -998031147;
                            (Integer.rotateLeft(-1044157871 ^ var2_3, 11) + 2064088842) * -1044157871;
                            (int)(248195423285865295L ^ (long)var2_3 ^ 8478170446984489778L);
                            try {
                                var4_2 += 4;
                                if ((606699822000989239L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                var3_4 = var2_3 - -1618791683;
                            }
                            catch (IllegalArgumentException v5) {
                                var3_4 = var2_3 - -1618791683 + -795430210 - -795430210;
                            }
                            var4_2 -= 5;
                            continue;
                        }
                        (Integer.rotateRight(-197361001 ^ var2_3, 17) - -1749979260) * -197361001;
                        try {
                            if ((-9176899148520864381L ^ (long)var2_3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1618791683));
                        }
                        catch (UnsupportedOperationException v6) {
                            var3_4 = var2_3 - -1618791683 ^ 996251719 ^ 996251719;
                        }
                        continue;
                    }
                    Integer.rotateRight(-84953533 ^ var2_3, 18) + 1734652248;
                    var3_4 = var2_3 - 31682559 + -1667087861 - -1667087861;
                    (Integer.rotateRight(-139670350 ^ var2_3, 17) + 38430921) * -139670349;
                    try {
                        if ((3747586813991864081L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = var2_3 - -1618791683;
                    }
                    catch (IllegalStateException v7) {
                        var3_4 = var2_3 - -1618791683 + 1542104004 - 1542104004;
                    }
                    var4_2 += 2;
                    continue;
                }
                Integer.rotateLeft(-561990227 ^ var2_3, 14) - -168583378;
                (int)(2031716687855020879L ^ (long)var2_3 ^ -3868447931451730507L);
                try {
                    var4_2 += 3;
                    if ((5116372050654926413L ^ (long)var2_3 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var3_4 = var2_3 - -1618791683;
                }
                catch (IllegalStateException v8) {
                    var3_4 = var2_3 - -1618791683;
                }
                --var4_2;
                continue;
            }
            Integer.rotateLeft(-1389683679 ^ var2_3, 8) + -57276614;
            (int)(8041654443643824975L ^ (long)var2_3 ^ -7401521839123893534L);
            var3_4 = var2_3 - 1744981114 ^ 1453165926 ^ 1453165926;
            Integer.rotateRight(225170991 ^ var2_3, 4) - -1536389396;
            try {
                var4_2 += 5;
                if ((-5412621884237209057L ^ (long)var2_3 | 1L) == 0L) {
                    throw new UnsupportedOperationException();
                }
                var3_4 = var2_3 - -1618791683;
            }
            catch (UnsupportedOperationException v9) {
                var3_4 = var2_3 - -1618791683 ^ 1541663747 ^ 1541663747;
            }
            ++var4_2;
            continue;
lbl246:
            // 9 sources

            (Integer.rotateRight(146115646 ^ var2_3, 4) - 307862205) * 146115647;
            var3_4 = var2_3 - -1618791683 + -1767521627 - -1767521627;
        }
    }

    private static String ddj_4(String string, int n, int n2, int n3) {
        try {
            int n4 = -1314526130;
            n4 = Integer.rotateLeft(n4 * -427543949, 13) ^ 0x19132611;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateRight(n2 ^ n4, 8);
            int n5 = n4 ^ 0x3925EF2;
            if ((n5 ^ n4) != 59924210) {
                int cfr_ignored_0 = (0xB237B2BC ^ n4) + -574596354;
            }
            if ((0x290 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xC0A3F1BD) + i ^ wa_2, 26) ^ n2 + khtht));
        }
        return new String(cArray);
    }

    private static String[] trw_2(String string) {
        block0: {
            int n = 1546605875;
            int n2 = (n = Integer.rotateLeft(n * 1899943855, 18) ^ 0x9CB79705) ^ 0x3D686C1;
            if ((n2 ^ n) == 64390849) break block0;
            int cfr_ignored_0 = (0x5FF9D3F2 ^ n) - 1751157459;
        }
        return string.split("\u0004\u0017", -1);
    }

    private static CallSite twd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1582827889;
            n3 = Integer.rotateLeft(n3 * -1145715451, 19) ^ 0xA908B9C;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 27);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 26);
            int n4 = n3 ^ 0x854BA498;
            if ((n4 ^ n3) != -2058640232) {
                int cfr_ignored_0 = (0xDB13ADE9 ^ n3) + -1624948505;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sh_2 ^ string.hashCode() ^ n2 + bkh_2 + i * 1442032905) + sh_2) ^ bkh_2));
            }
            String[] stringArray = dhq_3.trw_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] jvv9mqz42ib(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite dcvcy6d0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ avmiinptf ^ string.hashCode()) + (n2 + if1rye56) + i ^ avmiinptf, 8) + if1rye56);
            }
            String[] stringArray = dhq_3.jvv9mqz42ib(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

