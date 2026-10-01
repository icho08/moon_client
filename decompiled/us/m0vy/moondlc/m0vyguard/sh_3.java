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
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tbt_2;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="Smooth Tab", category=bzw.OTHER, desc="Animates the player list tab sliding in")
public class sh_3
extends bnq {
    private static sh_3 shkh_2;
    public final tay thbb = new tay(this, "Speed (ms)").shth_7(Float.intBitsToFloat(-758365009 + 1870379857)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xE7D97CB ^ 0xE79D06B, 12))).rkh_3(Float.intBitsToFloat(-923575304 + 2027201544)).ssd_5(Float.intBitsToFloat(1350612584 - 218543720));
    private final bjz khs = new bjz();
    private boolean hdd_4 = false;
    private final bql<btt> jza_2 = this::hsh_6;
    private static final int hzj_2 = -499527825;
    private static final int dfd = -704246085;
    private static final int rrm = 343923701;
    private static final int szr = -1465130601;
    private static final int od6gdlll2t = -596592611;
    private static final int ss822sy = -1659155371;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int avi4pm3ebvqk;

    public static sh_3 snn_2() {
        block0: {
            int n = 977287557;
            int n2 = (n = Integer.rotateLeft(n * -2031444149, 17) ^ 0x1EB0D7D) ^ 0x52E7954A;
            if ((n2 ^ n) == 1390908746) break block0;
            int cfr_ignored_0 = (0x68A7ACCF ^ n) + 426865814;
        }
        return shkh_2;
    }

    public bjz shzs() {
        block0: {
            int n = tbt_2.ssa_6(1833739760);
            int n2 = n ^ 0x5B3DAACD;
            if ((n2 ^ n) == 1530768077) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x36710F3D ^ n, 9) - -1676773474) * 913379133;
            int cfr_ignored_1 = (int)(0xF4C3A10027D4EB4FL ^ (long)n ^ 0xBF70831A2DB84456L);
        }
        return this.khs;
    }

    public sh_3() {
        shkh_2 = this;
    }

    /*
     * Unable to fully structure code
     */
    private void hsh_6(btt var1_1) {
        var2_2 = false;
        var5_3 = 0;
        var3_4 = -1274257640;
        var3_4 = Integer.rotateLeft(var3_4 * -1219126335, 26) ^ 1807998910;
        var4_5 = -1486539968 + var3_4 + -99913893 - -99913893;
        block38: while (true) {
            if ((var5_3 = var4_5 - var3_4) == 1697671338) ** GOTO lbl262
            if (var5_3 == -1486539968) ** GOTO lbl-1000
            (Integer.rotateLeft(1958726396 ^ var3_4, 17) - 664220607) * 1958726397;
            if (var5_3 != -377582147) {
                switch (var5_3) {
                    case 1583433313: {
                        Integer.rotateRight(-133399194 ^ var3_4, 18) - 232836757;
                        return;
                    }
                    case -1352805263: {
                        (Integer.rotateRight(-743839874 ^ var3_4, 13) - -1510955139) * -743839873;
                        var2_2 = sh_3.mc.field_1690.field_1907.method_1434();
                        if (!var2_2) {
                            var4_5 = 395889502 + var3_4 + 1926440355 - 1926440355;
                            (Integer.rotateRight(-1185635982 ^ var3_4, 10) + 1973234697) * -1185635981;
                            var5_3 -= 2;
                            continue block38;
                        }
                        (int)(-5193497509893409170L ^ (long)var3_4 ^ 468134019573924360L);
                        var4_5 = Integer.reverse(Integer.reverse(2095963795 + var3_4));
                        var5_3 -= 5;
                        continue block38;
                    }
                    case -1200889471: {
                        (Integer.rotateLeft(1902962524 ^ var3_4, 17) - -1064459425) * 1902962525;
                        var2_2 = sh_3.mc.field_1690.field_1907.method_1434();
                        if (var2_2) {
                            (int)(8250154971693955421L ^ (long)var3_4 ^ 2092018545727457581L);
                            var4_5 = Integer.reverse(Integer.reverse(2095963795 + var3_4));
                            var5_3 += 4;
                            continue block38;
                        }
                        var4_5 = 395889502 + var3_4;
                        Integer.rotateRight(1640914479 ^ var3_4, 15) - -598014228;
                        continue block38;
                    }
                    case -270029154: {
                        (Integer.rotateLeft(-2076194563 ^ var3_4, 3) - 135722462) * -2076194563;
                        (int)(5083832529859177295L ^ (long)var3_4 ^ 3526462656690593995L);
                        if (!this.hdd_4) {
                            try {
                                var5_3 += 2;
                                var4_5 = -332680022 + var3_4 + -2133304841 - -2133304841;
                            }
                            catch (IllegalArgumentException v0) {
                                var4_5 = -332680022 + var3_4 ^ 1720411584 ^ 1720411584;
                            }
                            var5_3 += 5;
                            continue block38;
                        }
                        var4_5 = (int)((long)(1409919754 + var3_4) ^ -8396217176121626753L ^ -8396217176121626753L);
                        Integer.rotateRight(1178602535 ^ var3_4, 11) - -2044782604;
                        var4_5 = -452442705 + var3_4 + -812801405 - -812801405;
                        continue block38;
                    }
                    case 2095963795: {
                        Integer.rotateRight(-33220982 ^ var3_4, 18) + -956605967;
                        if (!this.hdd_4) {
                            try {
                                var4_5 = -1422477447 + var3_4 + -1812024499 - -1812024499;
                            }
                            catch (NoSuchElementException v1) {
                                var4_5 = (int)((long)(-1422477447 + var3_4) ^ 967387822085107068L ^ 967387822085107068L);
                            }
                            var5_3 -= 4;
                            continue block38;
                        }
                        var4_5 = -1969024062 + var3_4;
                        (Integer.rotateRight(924838686 ^ var3_4, 9) - -1321527331) * 924838687;
                        var4_5 = 395889502 + var3_4 + 1188978877 - 1188978877;
                        var5_3 -= 2;
                        continue block38;
                    }
                }
            }
            ** GOTO lbl204
lbl-1000:
            // 1 sources

            {
                (Integer.rotateLeft(-1950225251 ^ var3_4, 4) - -254196162) * -1950225251;
                (int)(5292647242720930639L ^ (long)var3_4 ^ 8660566231892967223L);
                if (sh_3.mc.field_1690 != null) {
                    (int)(-2952294604098231780L ^ (long)var3_4 ^ 5915170710063285215L);
                    var4_5 = -1200889471 + var3_4 ^ -13928148 ^ -13928148;
                    var5_3 += 2;
                    continue block38;
                }
                try {
                    var5_3 -= 2;
                    if ((1543436997466512893L ^ (long)var3_4 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var4_5 = (int)((long)(1583433313 + var3_4) ^ 3061192268989970807L ^ 3061192268989970807L);
                }
                catch (ArithmeticException v2) {
                    var4_5 = 1583433313 + var3_4 ^ -1429768018 ^ -1429768018;
                }
                var5_3 += 2;
                continue block38;
                case -332680022: {
                    Integer.rotateLeft(-103650456 ^ var3_4, 18) + 1155047635;
                    this.khs.ddhdh();
                    return;
                }
                case 395889502: {
                    (Integer.rotateRight(-335500741 ^ var3_4, 16) + -1737343904) * -335500741;
                    if (!var2_2) {
                        var4_5 = -270029154 + var3_4;
                        continue block38;
                    }
                    try {
                        var5_3 -= 2;
                        var4_5 = (int)((long)(-332680022 + var3_4) ^ 8562676796933558597L ^ 8562676796933558597L);
                    }
                    catch (IllegalArgumentException v3) {
                        var4_5 = -332680022 + var3_4 ^ -21849444 ^ -21849444;
                    }
                    continue block38;
                }
                case -1422477447: {
                    (Integer.rotateRight(1404566290 ^ var3_4, 13) + 665126505) * 1404566291;
                    this.hdd_4 = true;
                    this.khs.shkh_6(0.0);
                    this.khs.shd_6(1.0, (long)this.thbb.hkj(), tbm.khjsh);
                    var4_5 = -332680022 + var3_4 + -1447076378 - -1447076378;
                    --var5_3;
                    continue block38;
                }
                case -452442705: {
                    Integer.rotateLeft(520924769 ^ var3_4, 6) + -957956870;
                    (int)(-2468535149947196593L ^ (long)var3_4 ^ -159733638312225107L);
                    this.hdd_4 = false;
                    this.khs.shd_6(0.0, (long)this.thbb.hkj(), tbm.bzk);
                    (int)(8852373805839657441L ^ (long)var3_4 ^ 1970013282880542818L);
                    var4_5 = -1467699470 + var3_4;
                    (int)(2044025130099206538L ^ (long)var3_4 ^ 5872011813829449066L);
                    var4_5 = -332680022 + var3_4 + -755114835 - -755114835;
                    var5_3 -= 5;
                    continue block38;
                }
                case -1713736250: {
                    (Integer.rotateLeft(1371713373 ^ var3_4, 13) - -353313922) * 1371713373;
                    (int)(-7822751040245798065L ^ (long)var3_4 ^ -22373849677395151L);
                    var4_5 = -1264009523 + var3_4 + -252426279 - -252426279;
                    (Integer.rotateRight(581759934 ^ var3_4, 7) - 927933245) * 581759935;
                    (int)(5030396582607047872L ^ (long)var3_4 ^ -2061346874632755634L);
                    var4_5 = -1699452559 + var3_4 ^ 174347194 ^ 174347194;
                    (int)(2847263655299535992L ^ (long)var3_4 ^ -352471854153735466L);
                    var4_5 = -1486539968 + var3_4;
                    var5_3 -= 4;
                    continue block38;
                }
                case 51687974: {
                    (Integer.rotateRight(-453696485 ^ var3_4, 15) + -1106444672) * -453696485;
                    var4_5 = (int)((long)(-60027764 + var3_4) ^ -5615086290255602783L ^ -5615086290255602783L);
                    (Integer.rotateLeft(-580361963 ^ var3_4, 14) - -738107194) * -580361963;
                    (int)(2295374731472595791L ^ (long)var3_4 ^ 7142853157469131364L);
                    var4_5 = -1486539968 + var3_4 + -485102331 - -485102331;
                    (Integer.rotateRight(-1969001442 ^ var3_4, 4) - -836258083) * -1969001441;
                    continue block38;
                }
                case -463390764: {
                    (Integer.rotateRight(-317270606 ^ var3_4, 16) + -1172209719) * -317270605;
                    var4_5 = (int)((long)(1234278963 + var3_4) ^ -3518427072028162452L ^ -3518427072028162452L);
                    Integer.rotateLeft(-526894552 ^ var3_4, 15) + 919382547;
                    try {
                        var5_3 -= 4;
                        if ((5435309349498715809L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(-1486539968 + var3_4));
                    }
                    catch (IllegalArgumentException v4) {
                        var4_5 = -1486539968 + var3_4;
                    }
                    var5_3 -= 4;
                    continue block38;
                }
                case 1614127651: {
                    (Integer.rotateLeft(141173944 ^ var3_4, 4) + 154669443) * 141173945;
                    var4_5 = Integer.reverse(Integer.reverse(-1885269638 + var3_4));
                    Integer.rotateRight(-172535610 ^ var3_4, 17) - -980392139;
                    var4_5 = 774341178 + var3_4;
                    Integer.rotateRight(-36365334 ^ var3_4, 18) + -1054080879;
                    var4_5 = -1486539968 + var3_4 + -173030085 - -173030085;
                    var5_3 -= 4;
                    continue block38;
                }
lbl204:
                // 1 sources

                Integer.rotateRight(1636260615 ^ var3_4, 15) - -742284012;
                try {
                    var5_3 += 2;
                    if ((4642660211053106879L ^ (long)var3_4 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var4_5 = -1486539968 + var3_4 ^ -760372695 ^ -760372695;
                }
                catch (ArithmeticException v5) {
                    var4_5 = -1486539968 + var3_4 ^ 2098118757 ^ 2098118757;
                }
                continue block38;
                case 1705873118: {
                    (Integer.rotateRight(1973185202 ^ var3_4, 17) + 1112443593) * 1973185203;
                    var4_5 = -1486539968 + var3_4 ^ 648543706 ^ 648543706;
                    Integer.rotateRight(-250396890 ^ var3_4, 17) - 900875477;
                    var5_3 += 2;
                    continue block38;
                }
                case -2086279509: {
                    (Integer.rotateLeft(749101592 ^ var3_4, 8) + 1820557347) * 749101593;
                    var4_5 = (int)((long)(2084201470 + var3_4) ^ -7175078838923436900L ^ -7175078838923436900L);
                    (Integer.rotateLeft(1794918225 ^ var3_4, 16) + -118865398) * 1794918225;
                    (int)(-6318856576420222129L ^ (long)var3_4 ^ 3434138864329489740L);
                    (int)(-1233464427512706578L ^ (long)var3_4 ^ 5203375828875505682L);
                    var4_5 = Integer.reverse(Integer.reverse(-1468786049 + var3_4));
                    (int)(1229506660191654402L ^ (long)var3_4 ^ -2961416005246283791L);
                    var4_5 = -1486539968 + var3_4 + -1189244707 - -1189244707;
                    var5_3 += 4;
                    continue block38;
                }
                case -517547601: {
                    (Integer.rotateRight(-171363982 ^ var3_4, 17) + -944071671) * -171363981;
                    (int)(-6932788176901606008L ^ (long)var3_4 ^ 7977041741225562690L);
                    var4_5 = Integer.reverse(Integer.reverse(1842631387 + var3_4));
                    (int)(1391303915415491671L ^ (long)var3_4 ^ 3631173801087699788L);
                    var4_5 = -1486539968 + var3_4 + 523885102 - 523885102;
                    continue block38;
                }
                case -1097434234: {
                    (Integer.rotateLeft(-389168812 ^ var3_4, 16) - 893913191) * -389168811;
                    try {
                        var5_3 += 5;
                        if ((3963499054006128125L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = -1486539968 + var3_4 + 1900967207 - 1900967207;
                    }
                    catch (UnsupportedOperationException v6) {
                        var4_5 = Integer.reverse(Integer.reverse(-1486539968 + var3_4));
                    }
                    var5_3 -= 2;
                    continue block38;
                }
lbl262:
                // 1 sources

                (Integer.rotateLeft(-1160902512 ^ var3_4, 10) + -1554995029) * -1160902511;
                var4_5 = 631663057 + var3_4;
                Integer.rotateRight(1186287183 ^ var3_4, 11) - -1806558516;
                var4_5 = -1486539968 + var3_4;
                (Integer.rotateRight(-1572265486 ^ var3_4, 7) + -1422345335) * -1572265485;
                var5_3 += 2;
                continue block38;
                case -132567209: {
                    (Integer.rotateRight(-189408109 ^ var3_4, 17) + -1503439608) * -189408109;
                    (int)(2625467887835230990L ^ (long)var3_4 ^ -1210162588412025586L);
                    var4_5 = Integer.reverse(Integer.reverse(-1486539968 + var3_4));
                    ++var5_3;
                    continue block38;
                }
                case -345526164: {
                    Integer.rotateLeft(1967712365 ^ var3_4, 17) - 942785646;
                    (int)(-5189758310511482033L ^ (long)var3_4 ^ 8201199069901144613L);
                    try {
                        var5_3 += 3;
                        var4_5 = -1486539968 + var3_4;
                    }
                    catch (NoSuchElementException v7) {
                        var4_5 = (int)((long)(-1486539968 + var3_4) ^ -6167158221680774123L ^ -6167158221680774123L);
                    }
                    continue block38;
                }
                case -1488078974: {
                    (Integer.rotateRight(-1512824553 ^ var3_4, 7) - 420323588) * -1512824553;
                    var4_5 = 731950261 + var3_4;
                    Integer.rotateRight(528826315 ^ var3_4, 6) + -713008944;
                    var4_5 = Integer.reverse(Integer.reverse(-882591163 + var3_4));
                    Integer.rotateRight(20021583 ^ var3_4, 3) - 693913548;
                    var4_5 = (int)((long)(-1486539968 + var3_4) ^ 7987393529590819460L ^ 7987393529590819460L);
                    var5_3 += 2;
                }
            }
            Integer.rotateRight(534810502 ^ var3_4, 6) - -527499147;
            var4_5 = Integer.reverse(Integer.reverse(-1486539968 + var3_4));
        }
    }

    private static String afa(String string, int n, int n2, int n3) {
        int n4 = -900892031;
        n4 = Integer.rotateLeft(n4 * -1706145981, 25) ^ 0x5539382B;
        n4 = n2 ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0xB88B7935;
        if ((n5 ^ n4) != -1198819019) {
            int cfr_ignored_0 = (0x72C603B4 ^ n4) + 2012131642;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x4036327 ^ n2 ^ i * -1356717295 ^ hzj_2, 14) ^ dfd));
        }
        return new String(cArray);
    }

    private static String[] adhb(String string) {
        block0: {
            int n = tbt_2.ssa_6(-1519663045);
            int n2 = n ^ 0xDA5F213D;
            if ((n2 ^ n) == -631299779) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7F34E906 ^ n, 18) - 1808127733;
        }
        return string.split("\u0002\u001c", -1);
    }

    private static CallSite bdhs_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 91632139;
            n3 = Integer.rotateLeft(n3 * -1217934293, 17) ^ 0x70D16F7A;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 15);
            n3 = Integer.rotateRight(n2 ^ n3, 5);
            int n4 = n3 ^ 0x6941ED63;
            if ((n4 ^ n3) != 1765928291) {
                int cfr_ignored_0 = (0x6C37DF68 ^ n3) - -437211988;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rrm ^ string.hashCode() ^ n2 + szr ^ i * 405496091 ^ rrm, 23) ^ szr));
            }
            String[] stringArray = sh_3.adhb(new String(cArray));
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

    private static String[] y1zo7jc0(String string) {
        return string.split("\u0001\u001d", -1);
    }

    private static CallSite dg744srkvofh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ od6gdlll2t ^ string.hashCode() ^ n2 + ss822sy ^ i * 1903150907 ^ od6gdlll2t, 21) ^ ss822sy));
            }
            String[] stringArray = sh_3.y1zo7jc0(new String(cArray));
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

