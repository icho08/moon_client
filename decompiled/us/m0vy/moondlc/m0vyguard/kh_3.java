/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_320
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import net.minecraft.class_2561;
import net.minecraft.class_320;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.blq;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.aq;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class kh_3
implements tthy {
    private final List hdhy = new ArrayList();
    private static final int dmb = 1051325597;
    private static final int la_2 = 711402959;
    private static final int yf = 671737543;
    private static final int tzl_2 = -1414779368;
    private static final int ushktrr02 = 857789477;
    private static final int eb01oujn = 1050869390;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int reutr2vdf13;

    public kh_3() {
        this.ghddh_2();
    }

    public void ghddh_2() {
        try {
            int n = -1927551150;
            n = Integer.rotateLeft(n * -2030355155, 7) ^ 0x3992E276;
            int n2 = n ^ 0xA5F96289;
            if ((n2 ^ n) != -1510382967) {
                int cfr_ignored_0 = (0x28E285DB ^ n) + 796265230;
            }
            if ((0x12F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!us.m0vy.moondlc.m0vyguard.yf.khdha_2()) {
            kh_3.srt();
        }
        kh_3.rwd(blq.aah_2());
        this.hdhy.clear();
        this.hdhy.addAll(kh_3.shbb().zdf_3());
    }

    /*
     * Unable to fully structure code
     */
    public void zfz_4(String var1_1) {
        var4_2 = 0;
        var2_3 = 1301486739;
        var2_3 = Integer.rotateLeft(var2_3 * 1782164633, 22) ^ -1373941488;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 16);
        v0 = var1_1;
        var2_3 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3;
        var3_4 = (int)((long)(-844383767 + var2_3) ^ 1650831110119722834L ^ 1650831110119722834L);
        block47: while (true) {
            if ((var4_2 = var3_4 - var2_3) == -1744330340) ** GOTO lbl234
            if (var4_2 == -844383767) ** GOTO lbl95
            if (var4_2 == -1540869203) ** GOTO lbl255
            if (var4_2 == -1739002476) ** GOTO lbl92
            switch (var4_2) {
                case -1127560737: {
                    Integer.rotateRight(1453216003 ^ var2_3, 13) + -2121699688;
                    if (this.hdhy.contains(var1_1)) {
                        try {
                            var4_2 += 4;
                            var3_4 = -2106952483 + var2_3 ^ 1041835277 ^ 1041835277;
                        }
                        catch (NoSuchElementException v1) {
                            var3_4 = -2106952483 + var2_3 ^ -1048669368 ^ -1048669368;
                        }
                        ++var4_2;
                        continue block47;
                    }
                    try {
                        if ((3712665657894856667L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = -977515083 + var2_3 ^ 2014108181 ^ 2014108181;
                    }
                    catch (ArithmeticException v2) {
                        var3_4 = -977515083 + var2_3;
                    }
                    var4_2 += 3;
                    continue block47;
                }
                case 1509504367: {
                    (Integer.rotateLeft(98094613 ^ var2_3, 3) - -1180789818) * 98094613;
                    (int)(-4077340787047339185L ^ (long)var2_3 ^ 4404664584027775749L);
                    us.m0vy.moondlc.m0vyguard.yf.athz_2();
                    throw null;
                }
                case 603529858: {
                    Integer.rotateLeft(1188237161 ^ var2_3, 11) + -1746109198;
                    (int)(-8907661205144540337L ^ (long)var2_3 ^ -4622800869036350190L);
                    bzh_4.dhght_2(class_2561.method_30163((String)tr_2.ttq_3("commands.friends.target")));
                    (int)(-694892159572911553L ^ (long)var2_3 ^ -8937777927478034073L);
                    var3_4 = -1739002476 + var2_3 ^ 1516707233 ^ 1516707233;
                    --var4_2;
                    continue block47;
                }
                case 1206119186: {
                    (Integer.rotateRight(1660821463 ^ var2_3, 15) - 19102276) * 1660821463;
                    bzh_4.dhght_2(class_2561.method_30163((String)tr_2.ttq_3("commands.friends.target")));
                    try {
                        var4_2 += 3;
                        var3_4 = -1739002476 + var2_3 ^ 1242645413 ^ 1242645413;
                    }
                    catch (IllegalArgumentException v3) {
                        var3_4 = Integer.reverse(Integer.reverse(-1739002476 + var2_3));
                    }
                    var4_2 += 4;
                    continue block47;
                }
                case -977515083: {
                    (Integer.rotateLeft(1134711733 ^ var2_3, 11) - 889569830) * 1134711733;
                    (int)(-9146532081963832497L ^ (long)var2_3 ^ 459511310451257328L);
                    if (var1_1.equalsIgnoreCase(kh_3.abth(kh_3.mc.method_1548()))) {
                        var3_4 = Integer.reverse(Integer.reverse(-701143033 + var2_3));
                        var4_2 -= 3;
                        continue block47;
                    }
                    var3_4 = 449568789 + var2_3 + -1749844381 - -1749844381;
                    var4_2 += 4;
                    continue block47;
                }
                case -746436043: {
                    Integer.rotateRight(1808995299 ^ var2_3, 16) + 317523896;
                    if (Moondlc.getInstance().getTargetManager().zlr_2().contains(var1_1)) {
                        var3_4 = Integer.reverse(Integer.reverse(603529858 + var2_3));
                        continue block47;
                    }
                    try {
                        if ((-1042282286975915261L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var3_4 = -1127560737 + var2_3 ^ -771096851 ^ -771096851;
                    }
                    catch (IllegalArgumentException v4) {
                        var3_4 = (int)((long)(-1127560737 + var2_3) ^ 8614079223034021313L ^ 8614079223034021313L);
                    }
                    var4_2 += 2;
                    continue block47;
                }
lbl92:
                // 1 sources

                (Integer.rotateRight(-1549786062 ^ var2_3, 7) + -725483191) * -1549786061;
                return;
lbl95:
                // 1 sources

                (Integer.rotateLeft(1164235408 ^ var2_3, 11) + 1804803755) * 1164235409;
                if (us.m0vy.moondlc.m0vyguard.yf.khdha_2()) {
                    var3_4 = (int)((long)(-789391022 + var2_3) ^ 4350674316148792573L ^ 4350674316148792573L);
                    (Integer.rotateLeft(1851738192 ^ var2_3, 16) + 1642553579) * 1851738193;
                    var3_4 = -746436043 + var2_3 ^ -737810085 ^ -737810085;
                    ++var4_2;
                    continue block47;
                }
                (int)(-3581638237463699953L ^ (long)var2_3 ^ 1193278777304035655L);
                var3_4 = 1509504367 + var2_3 + -870965492 - -870965492;
                var4_2 += 5;
                continue block47;
                case -2106952483: {
                    Integer.rotateRight(445428559 ^ var2_3, 6) - 996627916;
                    bzh_4.ttht_3(class_2561.method_30163((String)tr_2.zza_3(kh_3.dtw(kh_3.asz_3("雡䬫\uda59⵫벖ྪ黏", Integer.rotateLeft(1907564943 ^ 1711342886, 9), kh_3.jhn_2(-216486437) ^ -114212446, Integer.reverse(1458224783) ^ -1311614896), kh_3.khaz("Ʇ쥗空ᰱ跉㻨꿇킣䉌搃锺ۏ", 319240156 + 1434788105, 2124770577 ^ -16437444, kh_3.zkhw_2(-37161419) ^ -322954107)), new Object[]{var1_1})));
                    var3_4 = -1739002476 + var2_3 + 1246555191 - 1246555191;
                    Integer.rotateLeft(97667304 ^ var2_3, 3) + -1194036397;
                    continue block47;
                }
                case -701143033: {
                    (Integer.rotateRight(-1875704457 ^ var2_3, 5) - 2055948452) * -1875704457;
                    bzh_4.dhght_2(class_2561.method_30163((String)tr_2.ttq_3("commands.friends.self")));
                    try {
                        var4_2 -= 5;
                        var3_4 = -1739002476 + var2_3 ^ 639197574 ^ 639197574;
                    }
                    catch (IllegalStateException v5) {
                        var3_4 = (int)((long)(-1739002476 + var2_3) ^ -8934811430107530259L ^ -8934811430107530259L);
                    }
                    var4_2 += 3;
                    continue block47;
                }
                case 449568789: {
                    Integer.rotateRight(1532505350 ^ var2_3, 14) - 336270069;
                    this.hdhy.add(var1_1);
                    kh_3.shak_2(blq.aah_2(), var1_1);
                    bzh_4.ttht_3(kh_3.thtt_4(tr_2.zza_3(kh_3.khaz("싫강ἡ蹓祡宠쫅떷✍", kh_3.sqy_2(-55052681 ^ -639273362, 15), 153552905 + 1254253378, 740740199 - -344474323).concat("riends.added"), new Object[]{var1_1})));
                    try {
                        var3_4 = -1739002476 + var2_3 ^ 1328600115 ^ 1328600115;
                    }
                    catch (ArithmeticException v6) {
                        var3_4 = Integer.reverse(Integer.reverse(-1739002476 + var2_3));
                    }
                    var4_2 -= 5;
                    continue block47;
                }
                case 501024814: {
                    Integer.rotateRight(-1260218141 ^ var2_3, 9) + -338812232;
                    var3_4 = -23086637 + var2_3 + -1003475171 - -1003475171;
                    Integer.rotateRight(-1727667130 ^ var2_3, 6) - -1944829003;
                    var3_4 = -844383767 + var2_3;
                    Integer.rotateLeft(-374262784 ^ var2_3, 16) + 1356000059;
                    var4_2 += 5;
                    continue block47;
                }
                case -2126325635: {
                    Integer.rotateRight(1552634863 ^ var2_3, 14) - 960284972;
                    var3_4 = -237066980 + var2_3 ^ 444509758 ^ 444509758;
                    Integer.rotateRight(-749488894 ^ var2_3, 13) + -1686074759;
                    var3_4 = -844383767 + var2_3 + 12669978 - 12669978;
                    ++var4_2;
                    continue block47;
                }
                case 1037185419: {
                    Integer.rotateLeft(399264133 ^ var2_3, 5) - -434469290;
                    (int)(-3062755918437094577L ^ (long)var2_3 ^ 3603023850355820332L);
                    var3_4 = Integer.reverse(Integer.reverse(-1044647359 + var2_3));
                    Integer.rotateRight(1228296846 ^ var2_3, 12) - -504258963;
                    var3_4 = (int)((long)(500710216 + var2_3) ^ 3357411905061046869L ^ 3357411905061046869L);
                    (Integer.rotateRight(37344375 ^ var2_3, 3) - 1230920100) * 37344375;
                    var3_4 = (int)((long)(-844383767 + var2_3) ^ 1261303967118478397L ^ 1261303967118478397L);
                    var4_2 += 5;
                    continue block47;
                }
                case -94891944: {
                    (Integer.rotateRight(1913598995 ^ var2_3, 17) + -734728824) * 1913598995;
                    try {
                        var4_2 += 5;
                        var3_4 = -844383767 + var2_3 + -1038045306 - -1038045306;
                    }
                    catch (ArithmeticException v7) {
                        var3_4 = Integer.reverse(Integer.reverse(-844383767 + var2_3));
                    }
                    var4_2 += 3;
                    continue block47;
                }
                case -1472938538: {
                    (Integer.rotateLeft(-1890737067 ^ var2_3, 4) - 1589937542) * -1890737067;
                    (int)(5620222302442810191L ^ (long)var2_3 ^ -1612144518139136465L);
                    try {
                        var4_2 += 2;
                        var3_4 = -844383767 + var2_3 ^ 924222475 ^ 924222475;
                    }
                    catch (ArithmeticException v8) {
                        var3_4 = Integer.reverse(Integer.reverse(-844383767 + var2_3));
                    }
                    continue block47;
                }
                case -1281413377: {
                    (Integer.rotateRight(916555127 ^ var2_3, 9) - -1578317660) * 916555127;
                    var3_4 = (int)((long)(-844383767 + var2_3) ^ 8247348179692821856L ^ 8247348179692821856L);
                    (Integer.rotateLeft(-753877424 ^ var2_3, 13) + -1822119189) * -753877423;
                    var4_2 -= 5;
                    continue block47;
                }
                case 318856477: {
                    Integer.rotateLeft(-575228479 ^ var2_3, 14) + -578969190;
                    (int)(2234942084896582479L ^ (long)var2_3 ^ -3852685332755934247L);
                    try {
                        if ((8913016715173739879L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = -844383767 + var2_3;
                    }
                    catch (IllegalStateException v9) {
                        var3_4 = -844383767 + var2_3;
                    }
                    continue block47;
                }
                case -1067524480: {
                    Integer.rotateRight(1854560962 ^ var2_3, 16) + 1730059449;
                    try {
                        --var4_2;
                        if ((4113670040977884489L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = -844383767 + var2_3 ^ 1094448207 ^ 1094448207;
                    }
                    catch (ArithmeticException v10) {
                        var3_4 = -844383767 + var2_3;
                    }
                    var4_2 += 3;
                    continue block47;
                }
lbl234:
                // 1 sources

                (Integer.rotateLeft(-1814491844 ^ var2_3, 5) - -341427841) * -1814491843;
                (int)(-3402149535735953100L ^ (long)var2_3 ^ -4937247191987254205L);
                var3_4 = -1788758219 + var2_3;
                (int)(-2024712075150741187L ^ (long)var2_3 ^ 8304748590024911388L);
                var3_4 = -844383767 + var2_3;
                var4_2 += 5;
                continue block47;
                case -2080042265: {
                    (Integer.rotateRight(700699518 ^ var2_3, 8) - 320093053) * 700699519;
                    (int)(7931014873654899272L ^ (long)var2_3 ^ -4795359815419858448L);
                    var3_4 = 1512437676 + var2_3;
                    (int)(-3938169398326144346L ^ (long)var2_3 ^ 7127116123235565408L);
                    var3_4 = -844383767 + var2_3 + -920716588 - -920716588;
                    var4_2 -= 5;
                    continue block47;
                }
lbl255:
                // 1 sources

                Integer.rotateRight(-1251394866 ^ var2_3, 9) - -65290707;
                try {
                    var4_2 -= 3;
                    if ((-3220330405799526635L ^ (long)var2_3 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var3_4 = -844383767 + var2_3;
                }
                catch (ArithmeticException v11) {
                    var3_4 = -844383767 + var2_3;
                }
                var4_2 += 5;
                continue block47;
                case 2097742069: {
                    Integer.rotateRight(206859074 ^ var2_3, 4) + -2104058823;
                    var3_4 = Integer.reverse(Integer.reverse(709028426 + var2_3));
                    (Integer.rotateLeft(785872376 ^ var2_3, 8) + -1334515645) * 785872377;
                    var3_4 = (int)((long)(-455650986 + var2_3) ^ -6426182482977190489L ^ -6426182482977190489L);
                    Integer.rotateRight(-1144815422 ^ var2_3, 10) + -1056295239;
                    var3_4 = -844383767 + var2_3 ^ -10851790 ^ -10851790;
                    var4_2 -= 4;
                    continue block47;
                }
                case 947345720: {
                    Integer.rotateRight(1049250063 ^ var2_3, 10) - -1759741940;
                    var3_4 = Integer.reverse(Integer.reverse(-592678770 + var2_3));
                    Integer.rotateRight(248166822 ^ var2_3, 4) - -823518635;
                    var3_4 = 1030430562 + var2_3;
                    Integer.rotateLeft(-167882688 ^ var2_3, 17) + -836151557;
                    var3_4 = -844383767 + var2_3 ^ -2094893006 ^ -2094893006;
                    var4_2 += 3;
                    continue block47;
                }
                case -1874968227: {
                    Integer.rotateLeft(1093545928 ^ var2_3, 11) + -386570125;
                    var3_4 = Integer.reverse(Integer.reverse(1105703736 + var2_3));
                    Integer.rotateRight(1172339530 ^ var2_3, 11) + 2056031537;
                    try {
                        --var4_2;
                        if ((4691771082716771869L ^ (long)var2_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var3_4 = -844383767 + var2_3;
                    }
                    catch (UnsupportedOperationException v12) {
                        var3_4 = -844383767 + var2_3;
                    }
                    var4_2 += 3;
                    continue block47;
                }
            }
            (Integer.rotateLeft(-254608840 ^ var2_3, 17) + 770305027) * -254608839;
            var3_4 = -844383767 + var2_3 + 20888610 - 20888610;
        }
    }

    public void jjm(String string) {
        try {
            int n = -2055680385;
            n = Integer.rotateLeft(n * -2110146527, 15) ^ 0xAFAC207A;
            n = System.identityHashCode(this) ^ n;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x1EF6E906;
            if ((n2 ^ n) != 519497990) {
                int cfr_ignored_0 = (0x9B8E2779 ^ n) + -2009023844;
            }
            if ((0x16F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (us.m0vy.moondlc.m0vyguard.yf.dnkh()) {
            throw null;
        }
        if (this.hdhy.contains(string)) {
            this.hdhy.remove(string);
            kh_3.shthb(blq.aah_2(), string);
            kh_3.zdhl_2(class_2561.method_30163((String)tr_2.zza_3(kh_3.khaz("⇧伙ﰭ浟驭ஐ뢬⧉嚻쐁産፸肁ㆽ廇쾨紂᭑衡㦎ꚮퟁ", -1034976326 - -1270727139, 0xB0691C1C ^ 0x92413F6, kh_3.rtk(0xD0B63F49 ^ 0x453D88C8, 24)), string)));
        } else {
            bzh_4.ttht_3(class_2561.method_30163((String)tr_2.zza_3(kh_3.khaz("ᓹ稇줳塁꽳㺎趲᳗接䀽흔♦떟ң毙襁䠀\udf33⹖뵏ಃ鎭燺윋嘾", 0xC3186FF5 ^ 0x4F9A0F00, 0x7228AFEB ^ 0xBA01B4C1, kh_3.dzn_4(0xC39FB559 ^ 0x561402D8, 24)), string)));
        }
    }

    public void hrk() {
        int n = 0;
        int n2 = 1390628;
        n2 = Integer.rotateLeft(n2 * -1850076539, 4) ^ 0x315261FF;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(-1404770508 * -553488809 + 756826793 ^ n2));
        while (true) {
            block30: {
                block22: {
                    block17: {
                        block24: {
                            block26: {
                                block29: {
                                    block19: {
                                        block27: {
                                            block25: {
                                                block16: {
                                                    block28: {
                                                        block20: {
                                                            block23: {
                                                                block21: {
                                                                    block18: {
                                                                        if ((n = ((n3 ^ n2) - 756826793) * 1703959911) == -192290752) break block16;
                                                                        if (n == -1077303441) break block17;
                                                                        if (n == 1698058031) break block18;
                                                                        if (n == -938155051) break block19;
                                                                        if (n == -1404770508) break block20;
                                                                        int cfr_ignored_0 = Integer.rotateLeft(0xDB6359A8 ^ n2, 14) + -1788511597;
                                                                        if (n == 1801652301) break block21;
                                                                        if (n == -1285468088) break block22;
                                                                        if (n == -536116323) break block23;
                                                                        int cfr_ignored_1 = (Integer.rotateRight(0xE9A35C52 ^ n2, 16) + 1327877417) * -375169965;
                                                                        if (n == -1207677377) break block24;
                                                                        if (n == -149363683) break block25;
                                                                        if (n == -310873286) break block26;
                                                                        if (n == -426099971) break block27;
                                                                        if (n == 1383108835) break block28;
                                                                        if (n == 1973006829) break block29;
                                                                        break block30;
                                                                    }
                                                                    int cfr_ignored_2 = (Integer.rotateRight(0x91AEC7D6 ^ n2, 5) - -1467493851) * -1850816553;
                                                                    this.hdhy.clear();
                                                                    kh_3.asha().tht_5();
                                                                    kh_3.dqk_2(kh_3.zar_3(tr_2.ttq_3("commands.friends.cleared")));
                                                                    int cfr_ignored_3 = (int)(0x4AACD5D9F4856854L ^ (long)n2 ^ 0x56C325B92B8F3888L);
                                                                    n3 = 486106543 * -553488809 + 756826793 ^ n2;
                                                                    int cfr_ignored_4 = (int)(0x9504EFB691139A09L ^ (long)n2 ^ 0x221DEE94CF3487D8L);
                                                                    n3 = (-536116323 * -553488809 + 756826793 ^ n2) + -1010971822 - -1010971822;
                                                                    n -= 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_5 = Integer.rotateRight(0x12F1634E ^ n2, 5) - 1335403949;
                                                                kh_3.khqs_2(class_2561.method_30163((String)tr_2.ttq_3("commands.friends.empty")));
                                                                try {
                                                                    n -= 5;
                                                                    if ((0x393E67D715C4FF11L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n3 = -536116323 * -553488809 + 756826793 ^ n2;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n3 = -536116323 * -553488809 + 756826793 ^ n2 ^ 0x50D0C602 ^ 0x50D0C602;
                                                                }
                                                                n += 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_6 = Integer.rotateLeft(0xD5CEB7A0 ^ n2, 13) + -395977829;
                                                            return;
                                                        }
                                                        int cfr_ignored_7 = Integer.rotateLeft(0x5FCD25A8 ^ n2, 14) + -1640681837;
                                                        if (!this.hdhy.isEmpty()) {
                                                            n3 = 1698058031 * -553488809 + 756826793 ^ n2 ^ 0x5B6FE40C ^ 0x5B6FE40C;
                                                            n -= 3;
                                                            continue;
                                                        }
                                                        n3 = 1801652301 * -553488809 + 756826793 ^ n2 ^ 0xABC87FD5 ^ 0xABC87FD5;
                                                        int cfr_ignored_8 = Integer.rotateRight(0xDFB54966 ^ n2, 14) - 458326677;
                                                        n -= 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_9 = Integer.rotateRight(0x982FEEA ^ n2, 4) + 725253521;
                                                    n3 = (679937224 * -553488809 + 756826793 ^ n2) + 1872519299 - 1872519299;
                                                    int cfr_ignored_10 = Integer.rotateRight(0x74966C6F ^ n2, 17) - 580173996;
                                                    n3 = (-1404770508 * -553488809 + 756826793 ^ n2) + -353374911 - -353374911;
                                                    int cfr_ignored_11 = Integer.rotateLeft(0x30CB2A25 ^ n2, 9) - -319309386;
                                                    int cfr_ignored_12 = (int)(0xF279841827D4EB4FL ^ (long)n2 ^ 0xF540831A2DB84922L);
                                                    n += 3;
                                                    continue;
                                                }
                                                int cfr_ignored_13 = (Integer.rotateLeft(0x4D521414 ^ n2, 12) - 1632505255) * 1297224725;
                                                n3 = Integer.reverse(Integer.reverse(-2128969617 * -553488809 + 756826793 ^ n2));
                                                int cfr_ignored_14 = (Integer.rotateLeft(0x692F8D3D ^ n2, 16) - -1054885474) * 1764724029;
                                                int cfr_ignored_15 = (int)(0xAB9D230027D4EB4FL ^ (long)n2 ^ 0xBB70831A2DB8FAEBL);
                                                try {
                                                    --n;
                                                    if ((0xEDB1684358445535L ^ (long)n2 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    n3 = (int)((long)(-1404770508 * -553488809 + 756826793 ^ n2) ^ 0xD96FF3E4DEA6BA11L ^ 0xD96FF3E4DEA6BA11L);
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n3 = Integer.reverse(Integer.reverse(-1404770508 * -553488809 + 756826793 ^ n2));
                                                }
                                                n += 5;
                                                continue;
                                            }
                                            int cfr_ignored_16 = (Integer.rotateLeft(0xBA3B7874 ^ n2, 10) - -1852754617) * -1170507659;
                                            try {
                                                if ((0x1ECE892E47BDD2F1L ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = (-1404770508 * -553488809 + 756826793 ^ n2) + 153700962 - 153700962;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = (int)((long)(-1404770508 * -553488809 + 756826793 ^ n2) ^ 0x716CBE8F47352171L ^ 0x716CBE8F47352171L);
                                            }
                                            n -= 4;
                                            continue;
                                        }
                                        int cfr_ignored_17 = Integer.rotateLeft(0xAE1955EC ^ n2, 8) - 426706639;
                                        n3 = (-2032270814 * -553488809 + 756826793 ^ n2) + -1792274080 - -1792274080;
                                        int cfr_ignored_18 = (Integer.rotateRight(0x759E8753 ^ n2, 17) + 1116734024) * 1973323603;
                                        int cfr_ignored_19 = (int)(0x62D7A8B41419475L ^ (long)n2 ^ 0x8664E30D3CDA18BL);
                                        n3 = Integer.reverse(Integer.reverse(-1980104010 * -553488809 + 756826793 ^ n2));
                                        int cfr_ignored_20 = (int)(0x8BFDB6D51F175700L ^ (long)n2 ^ 0x90DAF29D5526BA2AL);
                                        n3 = Integer.reverse(Integer.reverse(-1404770508 * -553488809 + 756826793 ^ n2));
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_21 = Integer.rotateLeft(0xF739BA21 ^ n2, 17) + -195352262;
                                    int cfr_ignored_22 = (int)(0x358B141C27D4EB4FL ^ (long)n2 ^ 0xD548831A2DB9C6C7L);
                                    n3 = (int)((long)(-979866383 * -553488809 + 756826793 ^ n2) ^ 0x25FABFED4388D0E9L ^ 0x25FABFED4388D0E9L);
                                    int cfr_ignored_23 = Integer.rotateLeft(0x3275C32D ^ n2, 9) - 547373486;
                                    int cfr_ignored_24 = (int)(0xF0C76D1027D4EB4FL ^ (long)n2 ^ 0x2750831A2DB84C5FL);
                                    n3 = (int)((long)(-1404770508 * -553488809 + 756826793 ^ n2) ^ 0x69EA359EEC251C61L ^ 0x69EA359EEC251C61L);
                                    continue;
                                }
                                int cfr_ignored_25 = (Integer.rotateLeft(0xFF27A699 ^ n2, 18) + -366294078) * -14178663;
                                int cfr_ignored_26 = (int)(0x3D9508A427D4EB4FL ^ (long)n2 ^ 0xEC38831A2DB9D6FBL);
                                n3 = (int)((long)(-1404770508 * -553488809 + 756826793 ^ n2) ^ 0x38F213143A484B6AL ^ 0x38F213143A484B6AL);
                                n -= 2;
                                continue;
                            }
                            int cfr_ignored_27 = (Integer.rotateLeft(0x9D8F9230 ^ n2, 6) + 415257355) * -1651535311;
                            n3 = (int)((long)(-1318608723 * -553488809 + 756826793 ^ n2) ^ 0xB54A9E979F2ACD2BL ^ 0xB54A9E979F2ACD2BL);
                            int cfr_ignored_28 = Integer.rotateRight(0x51D77A6F ^ n2, 13) - -311070036;
                            try {
                                n += 5;
                                n3 = -1404770508 * -553488809 + 756826793 ^ n2 ^ 0x5673D990 ^ 0x5673D990;
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                n3 = -1404770508 * -553488809 + 756826793 ^ n2 ^ 0x9D2EC7DF ^ 0x9D2EC7DF;
                            }
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_29 = Integer.rotateRight(0x8E3101CE ^ n2, 4) - 1011668781;
                        n3 = (1103877821 * -553488809 + 756826793 ^ n2) + 623663194 - 623663194;
                        int cfr_ignored_30 = (Integer.rotateRight(0x915C969F ^ n2, 5) - -1634476932) * -1856203105;
                        n3 = -1404770508 * -553488809 + 756826793 ^ n2;
                        n -= 3;
                        continue;
                    }
                    int cfr_ignored_31 = (Integer.rotateLeft(0x9F99D730 ^ n2, 6) + 1476308491) * -1617307855;
                    n3 = -1688505599 * -553488809 + 756826793 ^ n2;
                    int cfr_ignored_32 = Integer.rotateLeft(0xC9EA956C ^ n2, 12) - 2009446223;
                    int cfr_ignored_33 = (int)(0x267D6B3F1BEC37D8L ^ (long)n2 ^ 0x2B0EFB6B9497E12BL);
                    n3 = 94424427 * -553488809 + 756826793 ^ n2 ^ 0x115F82FC ^ 0x115F82FC;
                    int cfr_ignored_34 = (int)(0x2E01008868D09FF1L ^ (long)n2 ^ 0xFC601D12C4C5F1D3L);
                    n3 = Integer.reverse(Integer.reverse(-1404770508 * -553488809 + 756826793 ^ n2));
                    n -= 5;
                    continue;
                }
                int cfr_ignored_35 = Integer.rotateLeft(0x3AE35760 ^ n2, 10) + 635778011;
                try {
                    n += 2;
                    if ((0x8D87C7CFEF4EA757L ^ (long)n2 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    n3 = Integer.reverse(Integer.reverse(-1404770508 * -553488809 + 756826793 ^ n2));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    n3 = -1404770508 * -553488809 + 756826793 ^ n2 ^ 0xC7FF9735 ^ 0xC7FF9735;
                }
                n -= 4;
                continue;
            }
            int cfr_ignored_36 = Integer.rotateLeft(0x87EF9D20 ^ n2, 3) + 2053219867;
            int cfr_ignored_37 = Integer.rotateRight(0xC1122A3 ^ n2, 4) + 2054213880;
            n3 = -1404770508 * -553488809 + 756826793 ^ n2 ^ 0xB3D746FC ^ 0xB3D746FC;
        }
    }

    public List hkha_2() {
        block0: {
            int n = -2107236463;
            n = Integer.rotateLeft(n * -2076308631, 4) ^ 0x3513DA5E;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0xED61603A;
            if ((n2 ^ n) == -312385478) break block0;
            int cfr_ignored_0 = (0x6F077FAB ^ n) - 1353993220;
        }
        return Collections.unmodifiableList(this.hdhy);
    }

    public boolean adhj(String string) {
        block0: {
            int n = aq.shtha(917344546);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x4283968;
            if ((n2 ^ n) == 69745000) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3285A84A ^ n, 9) + 579665969;
        }
        return this.hdhy.contains(string);
    }

    private static String khaz(String string, int n, int n2, int n3) {
        try {
            int n4 = -1866882658;
            n4 = Integer.rotateLeft(n4 * -14604307, 23) ^ 0x33BA7AED;
            n4 = n3 ^ n4;
            int n5 = n4 ^ 0x67309F60;
            if ((n5 ^ n4) != 1731239776) {
                int cfr_ignored_0 = (0xF7893EFE ^ n4) - -631457732;
            }
            if ((0x95 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x54C6C57F ^ n2 ^ i * -1860338825 ^ dmb, 5) ^ la_2));
        }
        return new String(cArray);
    }

    private static void srt() {
        int n = -1051206438;
        int n2 = (n = Integer.rotateLeft(n * 798931767, 11) ^ 0x6D688359) ^ 0x4E89CEB2;
        if ((n2 ^ n) != 1317654194) {
            int cfr_ignored_0 = (0x8FDE1268 ^ n) + -2082677978;
        }
        us.m0vy.moondlc.m0vyguard.yf.athz_2();
    }

    private static void rwd(blq blq2) {
        int n = 874707834;
        n = Integer.rotateLeft(n * -537626727, 23) ^ 0xF4C5BB5B;
        blq blq3 = blq2;
        n = (blq3 != null ? System.identityHashCode(blq3) : 0) ^ n;
        int n2 = n ^ 0xA62DB6D5;
        if ((n2 ^ n) != -1506953515) {
            int cfr_ignored_0 = (0x920F4DAF ^ n) - 2048588724;
        }
        blq2.khdhh_2();
    }

    private static blq shbb() {
        block0: {
            int n = -754874595;
            int n2 = (n = Integer.rotateLeft(n * -785345397, 27) ^ 0x2957AB71) ^ 0xC278403C;
            if ((n2 ^ n) == -1032306628) break block0;
            int cfr_ignored_0 = (0x1179C721 ^ n) + -1469747749;
        }
        return blq.aah_2();
    }

    private static String skdh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -647947304;
            n4 = Integer.rotateLeft(n4 * -1594195343, 5) ^ 0x20A25276;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 18)) ^ 0x57A76E8E;
            if ((n5 ^ n4) == 1470590606) break block0;
            int cfr_ignored_0 = (0x8EC67556 ^ n4) + -742635830;
        }
        return kh_3.khaz(string, n, n2, n3);
    }

    private static int jhn_2(int n) {
        block0: {
            int n2 = 1998157100;
            int n3 = (n2 = Integer.rotateLeft(n2 * 412062051, 23) ^ 0xAF370A2C) ^ 0x720E52EB;
            if ((n3 ^ n2) == 1913541355) break block0;
            int cfr_ignored_0 = (0x51727C7 ^ n2) + 318394138;
        }
        return Integer.reverse(n);
    }

    private static String asz_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1710478678;
            n4 = Integer.rotateLeft(n4 * -2071011081, 28) ^ 0xE92261AD;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 11)) ^ 0xAD01CA51;
            if ((n5 ^ n4) == -1392391599) break block0;
            int cfr_ignored_0 = (0x370DE0FB ^ n4) + -1665318938;
        }
        return kh_3.khaz(string, n, n2, n3);
    }

    private static int zkhw_2(int n) {
        block0: {
            int n2 = aq.shtha(-273995761);
            int n3 = (n2 = n ^ n2) ^ 0xB6F615D1;
            if ((n3 ^ n2) == -1225386543) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x595D3DDE ^ n2, 14) - -693625571) * 1499282911;
        }
        return Integer.reverse(n);
    }

    private static String dtw(String string, String string2) {
        block0: {
            int n = -1288927352;
            n = Integer.rotateLeft(n * -412064005, 27) ^ 0x9A72304B;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x323B319B;
            if ((n2 ^ n) == 842740123) break block0;
            int cfr_ignored_0 = (0x8117B613 ^ n) + -1428010111;
        }
        return string.concat(string2);
    }

    private static String abth(class_320 class_3202) {
        block0: {
            int n = 781731095;
            int n2 = (n = Integer.rotateLeft(n * -1124375681, 26) ^ 0xBFA9EF89) ^ 0x4F41F179;
            if ((n2 ^ n) == 1329721721) break block0;
            int cfr_ignored_0 = (0x61D9B46E ^ n) + 461032070;
        }
        return class_3202.method_1676();
    }

    private static void shak_2(blq blq2, String string) {
        int n = 92878599;
        n = Integer.rotateLeft(n * 837202747, 8) ^ 0xFB2AD3E0;
        blq blq3 = blq2;
        n = Integer.rotateRight((blq3 != null ? System.identityHashCode(blq3) : 0) ^ n, 14);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x7B56444F;
        if ((n2 ^ n) != 2069251151) {
            int cfr_ignored_0 = (0x7EDF7348 ^ n) - 414015767;
        }
        blq2.thsh_3(string);
    }

    private static int sqy_2(int n, int n2) {
        block0: {
            int n3 = 1716389063;
            n3 = Integer.rotateLeft(n3 * 1176741499, 6) ^ 0xE428407B;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 17)) ^ 0x2FB3F82D;
            if ((n4 ^ n3) == 800323629) break block0;
            int cfr_ignored_0 = (0x49FDFCEA ^ n3) + -1904009686;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static class_2561 thtt_4(String string) {
        block0: {
            int n = 464242678;
            n = Integer.rotateLeft(n * 841452537, 7) ^ 0x2EDE093D;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
            int n2 = n ^ 0x4F449F21;
            if ((n2 ^ n) == 1329897249) break block0;
            int cfr_ignored_0 = (0x54EF58D7 ^ n) + 784419648;
        }
        return class_2561.method_30163((String)string);
    }

    private static boolean shthb(blq blq2, String string) {
        block0: {
            int n = 375662117;
            int n2 = (n = Integer.rotateLeft(n * 769856223, 10) ^ 0xB0DE10DF) ^ 0xD62484C3;
            if ((n2 ^ n) == -702249789) break block0;
            int cfr_ignored_0 = (0xC040A2E6 ^ n) - 2030506725;
        }
        return blq2.hfa_2(string);
    }

    private static int rtk(int n, int n2) {
        block0: {
            int n3 = 33154253;
            n3 = Integer.rotateLeft(n3 * 175512883, 12) ^ 0x228011A1;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x69E32CB3;
            if ((n4 ^ n3) == 1776495795) break block0;
            int cfr_ignored_0 = (0x681AC87E ^ n3) + 417379710;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static void zdhl_2(class_2561 class_25612) {
        int n = aq.shtha(1658625772);
        int n2 = n ^ 0x22339FED;
        if ((n2 ^ n) != 573808621) {
            int cfr_ignored_0 = Integer.rotateLeft(0x40EF0101 ^ n, 11) + -514933158;
            int cfr_ignored_1 = (int)(0x825DAF3C27D4EB4FL ^ (long)n ^ 0xA308831A2DB8A96AL);
        }
        bzh_4.ttht_3(class_25612);
    }

    private static int dzn_4(int n, int n2) {
        block0: {
            int n3 = 1417767800;
            n3 = Integer.rotateLeft(n3 * -981292943, 8) ^ 0x7080E405;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 15)) ^ 0x62407528;
            if ((n4 ^ n3) == 1648391464) break block0;
            int cfr_ignored_0 = (0x36C11E50 ^ n3) + 474462340;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static void khqs_2(class_2561 class_25612) {
        int n = -814236731;
        n = Integer.rotateLeft(n * 988405555, 18) ^ 0x622ABABE;
        class_2561 class_25613 = class_25612;
        n = Integer.rotateLeft((class_25613 != null ? System.identityHashCode(class_25613) : 0) ^ n, 18);
        int n2 = n ^ 0x845E1C77;
        if ((n2 ^ n) != -2074207113) {
            int cfr_ignored_0 = (0x4B29A7B2 ^ n) + -1227207158;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static blq asha() {
        block0: {
            int n = aq.shtha(1872774735);
            int n2 = n ^ 0xAA553C94;
            if ((n2 ^ n) == -1437254508) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xC5F57ADB ^ n, 11) + -48791616) * -973767973;
        }
        return blq.aah_2();
    }

    private static class_2561 zar_3(String string) {
        block0: {
            int n = 132010046;
            n = Integer.rotateLeft(n * 684815717, 9) ^ 0xFC77D973;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xC2ADD382;
            if ((n2 ^ n) == -1028795518) break block0;
            int cfr_ignored_0 = (0xC57383BC ^ n) + 1760409343;
        }
        return class_2561.method_30163((String)string);
    }

    private static void dqk_2(class_2561 class_25612) {
        int n = -2093506365;
        int n2 = (n = Integer.rotateLeft(n * 616070573, 5) ^ 0x933ACDAD) ^ 0x21D0113B;
        if ((n2 ^ n) != 567284027) {
            int cfr_ignored_0 = (0xA2E7B1F8 ^ n) - 1461466840;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static String[] sfkh(String string) {
        block0: {
            int n = 1333846461;
            n = Integer.rotateLeft(n * -299385099, 21) ^ 0x22749901;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xE44CA4CA;
            if ((n2 ^ n) == -464739126) break block0;
            int cfr_ignored_0 = (0xABCC4577 ^ n) + -2000868830;
        }
        return string.split("\u0001\u0013", -1);
    }

    private static CallSite bndh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1420767324;
            n3 = Integer.rotateLeft(n3 * -1218449431, 16) ^ 0x6B6C76D6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 6);
            int n4 = n3 ^ 0x22AF38E;
            if ((n4 ^ n3) != 36369294) {
                int cfr_ignored_0 = (0x5685C3D2 ^ n3) - 2056585910;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ yf ^ string.hashCode()) + (n2 + tzl_2) + i ^ yf, 12) + tzl_2);
            }
            String[] stringArray = kh_3.sfkh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xuasee0w4j(String string) {
        return string.split("\u0001\u001e", -1);
    }

    private static CallSite bpao0wues2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ushktrr02 ^ string.hashCode() ^ n2 + eb01oujn + i * -250324731) + ushktrr02) ^ eb01oujn));
            }
            String[] stringArray = kh_3.xuasee0w4j(new String(cArray));
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

