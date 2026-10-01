/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.bad_4;
import us.m0vy.moondlc.m0vyguard.bat_4;
import us.m0vy.moondlc.m0vyguard.bhn_2;
import us.m0vy.moondlc.m0vyguard.tshth;
import us.m0vy.moondlc.m0vyguard.thk_3;
import us.m0vy.moondlc.m0vyguard.ay;
import us.m0vy.moondlc.m0vyguard.ghw;
import us.m0vy.moondlc.m0vyguard.qz;
import us.m0vy.moondlc.m0vyguard.yf;

public class tss
implements tshth,
Comparable {
    private final bsb rwq;
    private final String dda_3;
    private final qz jhq;
    private final String shz_4;
    private final List jtz;
    private final bhn_2 jbj = new bhn_2(0x4A2EAB9E7361A679L ^ 0x4A2EAB9E7361A683L, bdz.shll);
    private final bhn_2 thtdh_2 = new bhn_2(0x636CC1379BB1FDE8L ^ 0x636CC1379BB1FD12L, bdz.shll);
    private final ay dsh;
    private static final int shth_6 = 627504670;
    private static final int shsh_4 = 1708177310;
    private static final int fbhha29z = 1245279117;
    private static final int sbzycjyl = -1280298713;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qbyzad6mpyv;

    public tss(bsb bsb2) {
        this.rwq = bsb2;
        this.dda_3 = bsb2.getName();
        this.jhq = tss.convertCategory(bsb2.dkb());
        this.shz_4 = bsb2.zhz();
        this.jtz = ghw.khzw(bsb2.dty());
        this.dsh = new bad_4(this);
    }

    public void refreshAnimations() {
        int n = 473579473;
        int n2 = (n = Integer.rotateLeft(n * -845727425, 25) ^ 0xCC4C2F72) ^ 0x912B214F;
        if ((n2 ^ n) != -1859444401) {
            int cfr_ignored_0 = (0x8D111E9E ^ n) - 641944844;
        }
        tss.dcw5b2do(this.jbj, this.isEnabled());
        ghw.dhsd_2(this.jtz);
    }

    public void setToggled(boolean bl) {
        try {
            int n = -1995848615;
            n = Integer.rotateLeft(n * 1937511595, 15) ^ 0x7E22E8E7;
            int n2 = n ^ 0x4227762D;
            if ((n2 ^ n) != 1109882413) {
                int cfr_ignored_0 = (0xCB2EB274 ^ n) - -382520102;
            }
            if ((0x137 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.rwq.dhaq(bl, true);
    }

    public void toggle() {
        int n = -2020228842;
        n = Integer.rotateLeft(n * -309385287, 26) ^ 0xCEA489ED;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x504C2DF2;
        if ((n2 ^ n) != 1347169778) {
            int cfr_ignored_0 = (0xD7D9ECE4 ^ n) - 312178683;
        }
        this.rwq.dwkh();
    }

    public void onEnable() {
        int n = -704008475;
        n = Integer.rotateLeft(n * -214217967, 16) ^ 0xC431EE7A;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
        int n2 = n ^ 0xBC80A535;
        if ((n2 ^ n) != -1132419787) {
            int cfr_ignored_0 = (0x6A890BD0 ^ n) + -721775799;
        }
        this.rwq.dhaq(true, true);
    }

    public void onDisable() {
        int n = 0;
        int n2 = -1447161279;
        n2 = Integer.rotateLeft(n2 * 861073373, 24) ^ 0x4E7706E7;
        int n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x99EF2B10, 6)));
        while (true) {
            block25: {
                block13: {
                    block15: {
                        block20: {
                            block16: {
                                block19: {
                                    block23: {
                                        block24: {
                                            block22: {
                                                block21: {
                                                    block18: {
                                                        block14: {
                                                            block17: {
                                                                block12: {
                                                                    if ((n = Integer.rotateRight(n3, 6) ^ n2) == 1744906149) break block12;
                                                                    if (n == -225892693) break block13;
                                                                    if (n == -2072531083) break block14;
                                                                    if (n == 1602985260) break block15;
                                                                    if (n == 1321944133) break block16;
                                                                    if (n == -1712379120) break block17;
                                                                    if (n == 1396684317) break block18;
                                                                    if (n == 1461192106) break block19;
                                                                    if (n == 1238927995) break block20;
                                                                    if (n == -1875077243) break block21;
                                                                    if (n == -2047623720) break block22;
                                                                    if (n == -1474511560) break block23;
                                                                    if (n == 380990171) break block24;
                                                                    break block25;
                                                                }
                                                                int cfr_ignored_0 = (Integer.rotateRight(0x79701FF6 ^ n2, 18) - -1192133115) * 2037391351;
                                                                yf.athz_2();
                                                                throw null;
                                                            }
                                                            int cfr_ignored_1 = (Integer.rotateLeft(0xE1B1E855 ^ n2, 15) - 1491648902) * -508434347;
                                                            int cfr_ignored_2 = (int)(0x2303466827D4EB4FL ^ (long)n2 ^ 0x71A0831A2DB9EBD7L);
                                                            if (yf.khdha_2()) {
                                                                try {
                                                                    n -= 5;
                                                                    if ((0x4870D8FFC381F639L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    n3 = Integer.rotateLeft(n2 ^ 0x8477AF75, 6) ^ 0xE73DC767 ^ 0xE73DC767;
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x8477AF75, 6) ^ 0x84B4F1AAFE953E1FL ^ 0x84B4F1AAFE953E1FL);
                                                                }
                                                                ++n;
                                                                continue;
                                                            }
                                                            try {
                                                                n += 2;
                                                                if ((0x1F76824E7974168FL ^ (long)n2 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x680127A5, 6) ^ 0xAF6CF70427A70627L ^ 0xAF6CF70427A70627L);
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                n3 = Integer.rotateLeft(n2 ^ 0x680127A5, 6);
                                                            }
                                                            n -= 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_3 = (Integer.rotateRight(0x9816341B ^ n2, 6) + 1863184000) * -1743375333;
                                                        this.rwq.dhaq(false, true);
                                                        return;
                                                    }
                                                    int cfr_ignored_4 = (Integer.rotateLeft(0xB356CF55 ^ n2, 9) - -1142900090) * -1286156459;
                                                    int cfr_ignored_5 = (int)(0x71E4616827D4EB4FL ^ (long)n2 ^ 0x3FA0831A2DB94E19L);
                                                    try {
                                                        n += 3;
                                                        n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6);
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6) + 833093304 - 833093304;
                                                    }
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_6 = Integer.rotateLeft(0xB583E9C0 ^ n2, 9) + -11080325;
                                                n3 = Integer.rotateLeft(n2 ^ 0x2A476C42, 6);
                                                int cfr_ignored_7 = Integer.rotateRight(0x7CFDCD0F ^ n2, 18) - 655979532;
                                                n3 = Integer.rotateLeft(n2 ^ 0x93DC03EA, 6) ^ 0x5D5CFCE3 ^ 0x5D5CFCE3;
                                                int cfr_ignored_8 = (Integer.rotateLeft(0xB76A0AF9 ^ n2, 9) + 976548706) * -1217787143;
                                                int cfr_ignored_9 = (int)(0x75D8A4C427D4EB4FL ^ (long)n2 ^ 0xB4F8831A2DB94660L);
                                                n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6);
                                                ++n;
                                                continue;
                                            }
                                            int cfr_ignored_10 = (Integer.rotateRight(0xFA8B7A3E ^ n2, 18) - 1531014333) * -91522497;
                                            n3 = Integer.rotateLeft(n2 ^ 0xE9624F1A, 6);
                                            int cfr_ignored_11 = (Integer.rotateRight(0xEC3C5FB ^ n2, 4) + -837642080) * 247711227;
                                            n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6);
                                            int cfr_ignored_12 = Integer.rotateRight(0xCA299C87 ^ n2, 12) - 2137494420;
                                            n -= 2;
                                            continue;
                                        }
                                        int cfr_ignored_13 = Integer.rotateRight(0x6104B22 ^ n2, 3) + -1068058535;
                                        try {
                                            n -= 4;
                                            n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6) + 2063913597 - 2063913597;
                                        }
                                        catch (NoSuchElementException noSuchElementException) {
                                            n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6) ^ 0x5D8E07A5 ^ 0x5D8E07A5;
                                        }
                                        n += 3;
                                        continue;
                                    }
                                    int cfr_ignored_14 = Integer.rotateRight(0x812636A ^ n2, 4) + -23615215;
                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xDB2931A5, 6) ^ 0x234D3A8B021ED103L ^ 0x234D3A8B021ED103L);
                                    int cfr_ignored_15 = (Integer.rotateRight(0x7F327F97 ^ n2, 18) - 1803227780) * 2134015895;
                                    n3 = Integer.rotateLeft(n2 ^ 0x72F5FC80, 6) + -1241874323 - -1241874323;
                                    int cfr_ignored_16 = Integer.rotateRight(0xDC66062B ^ n2, 14) + -1262985616;
                                    n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6) ^ 0xBF0FF1E6 ^ 0xBF0FF1E6;
                                    n += 2;
                                    continue;
                                }
                                int cfr_ignored_17 = Integer.rotateLeft(0x884656C1 ^ n2, 4) + -2065555302;
                                int cfr_ignored_18 = (int)(0x4AF4F8FC27D4EB4FL ^ (long)n2 ^ 0xC88831A2DB93838L);
                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x37BF49C8, 6) ^ 0xBD53B1948C919186L ^ 0xBD53B1948C919186L);
                                int cfr_ignored_19 = (Integer.rotateRight(0x8AE4B0DA ^ n2, 4) + -703657567) * -1964724005;
                                n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6);
                                int cfr_ignored_20 = (Integer.rotateRight(0xE3DF31BE ^ n2, 15) - -1671125699) * -471912001;
                                continue;
                            }
                            int cfr_ignored_21 = Integer.rotateLeft(0x55A9FCAC ^ n2, 13) - 1676883983;
                            n3 = Integer.rotateLeft(n2 ^ 0x982FED75, 6) + -2021307600 - -2021307600;
                            int cfr_ignored_22 = Integer.rotateLeft(0xAABF028 ^ n2, 4) + 1328526355;
                            int cfr_ignored_23 = (int)(0x8D00B629BF5D2692L ^ (long)n2 ^ 0x9123B209B602B7D0L);
                            n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6) + -2132288962 - -2132288962;
                            continue;
                        }
                        int cfr_ignored_24 = Integer.rotateLeft(0xCA52A240 ^ n2, 12) + -2074131205;
                        n3 = Integer.rotateLeft(n2 ^ 0x1B8FF246, 6);
                        int cfr_ignored_25 = Integer.rotateLeft(0x1861108D ^ n2, 6) - -132210610;
                        int cfr_ignored_26 = (int)(0xDAD3BEB027D4EB4FL ^ (long)n2 ^ 0x8010831A2DB81876L);
                        n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6);
                        int cfr_ignored_27 = (Integer.rotateLeft(0xCAAB89D5 ^ n2, 12) - -1893511162) * -894727723;
                        int cfr_ignored_28 = (int)(0x81927E827D4EB4FL ^ (long)n2 ^ 0xB2A0831A2DB9BDE3L);
                        n += 4;
                        continue;
                    }
                    int cfr_ignored_29 = Integer.rotateLeft(0x44282801 ^ n2, 11) + 1161459546;
                    int cfr_ignored_30 = (int)(0x869A863C27D4EB4FL ^ (long)n2 ^ 0xF108831A2DB8A0E4L);
                    n3 = Integer.rotateLeft(n2 ^ 0x75BF9BBF, 6) ^ 0x4ED3B9E6 ^ 0x4ED3B9E6;
                    int cfr_ignored_31 = Integer.rotateLeft(0x7A8FB3EC ^ n2, 18) - -607885105;
                    n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6);
                    n += 4;
                    continue;
                }
                int cfr_ignored_32 = Integer.rotateLeft(0x202D3A84 ^ n2, 7) - -371739337;
                n3 = Integer.rotateLeft(n2 ^ 0xB1BC0119, 6);
                int cfr_ignored_33 = (Integer.rotateRight(0xF2E6FCF2 ^ n2, 17) + 1851146377) * -219742989;
                n3 = Integer.rotateLeft(n2 ^ 0xF5F7D8D4, 6) + -1162109893 - -1162109893;
                int cfr_ignored_34 = (Integer.rotateRight(0xB9E6C79E ^ n2, 10) - -2024813731) * -1176057953;
                n3 = Integer.rotateLeft(n2 ^ 0x99EF2B10, 6) + 914167844 - 914167844;
                n -= 2;
                continue;
            }
            int cfr_ignored_35 = (Integer.rotateLeft(0xE62693F0 ^ n2, 15) + -485914293) * -433679375;
            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x99EF2B10, 6)));
        }
    }

    public List getSettings() {
        block0: {
            int n = 646956001;
            int n2 = (n = Integer.rotateLeft(n * -965589743, 12) ^ 0xC23B5A30) ^ 0xEE0BDA1E;
            if ((n2 ^ n) == -301213154) break block0;
            int cfr_ignored_0 = (0xC88419FF ^ n) + -1643799105;
        }
        return this.jtz;
    }

    public JsonObject save() {
        int n = thk_3.bdb_2(-1591022953);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x740DA03;
        if ((n2 ^ n) != 121690627) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xA66A3094 ^ n, 7) - 725188903) * -1502990187;
        }
        return new JsonObject();
    }

    public void load(JsonObject jsonObject) {
        block0: {
            int n = thk_3.bdb_2(1873535589);
            int n2 = n ^ 0x4DEFF1B;
            if ((n2 ^ n) == 81723163) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6B751D7E ^ n, 16) - 126628221) * 1802837375;
        }
    }

    public int compareTo(tss tss2) {
        block0: {
            int n = -1126010291;
            n = Integer.rotateLeft(n * -1115994065, 21) ^ 0x9F886188;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC80D5260;
            if ((n2 ^ n) == -938651040) break block0;
            int cfr_ignored_0 = (0x74EF202D ^ n) + -382309465;
        }
        return tss.em38xyic237(tss2).compareToIgnoreCase(this.dda_3);
    }

    public ay getInfo() {
        block0: {
            int n = -1219265829;
            n = Integer.rotateLeft(n * 1247663609, 6) ^ 0xA8BE8B8;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
            int n2 = n ^ 0x99A3196F;
            if ((n2 ^ n) == -1717364369) break block0;
            int cfr_ignored_0 = (0x2EF063B4 ^ n) + -1690554564;
        }
        return this.dsh;
    }

    public String getName() {
        block0: {
            int n = -2011558658;
            int n2 = (n = Integer.rotateLeft(n * 1169729519, 8) ^ 0xAEF6B032) ^ 0x5512C10C;
            if ((n2 ^ n) == 1427292428) break block0;
            int cfr_ignored_0 = (0xDD08CDF2 ^ n) - -544431950;
        }
        return this.dda_3;
    }

    public qz getCategory() {
        block0: {
            int n = thk_3.bdb_2(-830516217);
            int n2 = n ^ 0x3F133BF1;
            if ((n2 ^ n) == 1058225137) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xF16C6FF6 ^ n, 17) - 1082076677) * -244551689;
        }
        return this.jhq;
    }

    public boolean isEnabled() {
        block0: {
            int n = -716031203;
            int n2 = (n = Integer.rotateLeft(n * -1965707513, 8) ^ 0xF6A612A3) ^ 0x63D8B21;
            if ((n2 ^ n) == 104696609) break block0;
            int cfr_ignored_0 = (0xD36FB03C ^ n) + 510754003;
        }
        return this.rwq.rgha_2();
    }

    public int getKeyCode() {
        block0: {
            int n = thk_3.bdb_2(1082615854);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8F730A6A;
            if ((n2 ^ n) == -1888286102) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xCFF46244 ^ n, 12) - 854951287;
        }
        return tss.qj5yh7q2(this.rwq.thaf());
    }

    public bhn_2 getAnimation() {
        block0: {
            int n = -166689790;
            int n2 = (n = Integer.rotateLeft(n * -272771673, 9) ^ 0xA302610D) ^ 0xA3AECA79;
            if ((n2 ^ n) == -1548825991) break block0;
            int cfr_ignored_0 = (0x55BE4E7B ^ n) + 294637269;
        }
        return this.jbj;
    }

    public bhn_2 getDescAnimation() {
        block0: {
            int n = -1872859290;
            n = Integer.rotateLeft(n * -644774453, 19) ^ 0xF61371B3;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
            int n2 = n ^ 0xC580ED6B;
            if ((n2 ^ n) == -981406357) break block0;
            int cfr_ignored_0 = (0x55DE820D ^ n) + 616441506;
        }
        return this.thtdh_2;
    }

    public void setEnabled(boolean bl) {
        int n = 591373068;
        int n2 = (n = Integer.rotateLeft(n * -437601207, 12) ^ 0xA1901184) ^ 0x6CA70DE9;
        if ((n2 ^ n) != 1822887401) {
            int cfr_ignored_0 = (0x4F98AEE5 ^ n) - 135832582;
        }
        this.rwq.dhaq(bl, true);
    }

    public void setKeyCode(int n) {
        int n2 = 0;
        int n3 = -1802735124;
        n3 = Integer.rotateLeft(n3 * 1255520847, 5) ^ 0xC39D6A2A;
        n3 = System.identityHashCode(this) ^ n3;
        n3 = Integer.rotateLeft(n ^ n3, 28);
        int n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114 + -516540763 - -516540763;
        while (true) {
            block18: {
                block17: {
                    block23: {
                        block19: {
                            block25: {
                                block29: {
                                    block27: {
                                        block21: {
                                            block20: {
                                                block30: {
                                                    block15: {
                                                        block28: {
                                                            block16: {
                                                                block24: {
                                                                    block26: {
                                                                        block22: {
                                                                            block13: {
                                                                                block14: {
                                                                                    if ((n2 = n4 - 1410311114 ^ 0x540FA3CA ^ n3) > -456124626) break block13;
                                                                                    if (n2 > -1309336928) break block14;
                                                                                    if (n2 == -2022807431) break block15;
                                                                                    if (n2 == -1367569695) break block16;
                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0x16250891 ^ n3, 5) + -1294358326) * 371525777;
                                                                                    int cfr_ignored_1 = (int)(0xD497A6AC27D4EB4FL ^ (long)n3 ^ 0xB028831A2DB804FEL);
                                                                                    if (n2 == -1309336928) break block17;
                                                                                    break block18;
                                                                                }
                                                                                if (n2 == -763455391) break block19;
                                                                                if (n2 == -601955590) break block20;
                                                                                int cfr_ignored_2 = Integer.rotateLeft(0xC22F2A61 ^ n3, 11) + -2011971334;
                                                                                int cfr_ignored_3 = (int)(0x9D845C27D4EB4FL ^ (long)n3 ^ 0xF5C8831A2DB9ACEAL);
                                                                                if (n2 == -456124626) break block21;
                                                                                break block18;
                                                                            }
                                                                            if (n2 > 226976692) break block22;
                                                                            if (n2 == -320250543) break block23;
                                                                            if (n2 == 218359830) break block24;
                                                                            if (n2 == 226976692) break block25;
                                                                            break block18;
                                                                        }
                                                                        if (n2 > 1036693475) break block26;
                                                                        if (n2 == 856511219) break block27;
                                                                        if (n2 == 1036693475) break block28;
                                                                        break block18;
                                                                    }
                                                                    if (n2 == 1251535019) break block29;
                                                                    if (n2 == 1841508304) break block30;
                                                                    break block18;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateRight(0xC393B5F ^ n3, 4) - 2135674812) * 205077343;
                                                                this.rwq.zhs_5(tss.toMoonBind(n));
                                                                return;
                                                            }
                                                            int cfr_ignored_5 = (Integer.rotateRight(0xFB8134BB ^ n3, 18) + 2030240224) * -75418437;
                                                            yf.athz_2();
                                                            throw null;
                                                        }
                                                        int cfr_ignored_6 = (Integer.rotateLeft(0xA6258A39 ^ n3, 7) + 585718818) * -1507489223;
                                                        int cfr_ignored_7 = (int)(0x6497240427D4EB4FL ^ (long)n3 ^ 0xB578831A2DB964FFL);
                                                        if (!yf.khdha_2()) {
                                                            n4 = (int)((long)((n3 ^ 0xEC0B9E66 ^ 0x540FA3CA) + 1410311114) ^ 0x59C443B0061FB97AL ^ 0x59C443B0061FB97AL);
                                                            int cfr_ignored_8 = Integer.rotateLeft(0x4F5844E8 ^ n3, 12) + -1609697453;
                                                            n4 = (n3 ^ 0xAE7C8AE1 ^ 0x540FA3CA) + 1410311114;
                                                            n2 -= 2;
                                                            continue;
                                                        }
                                                        n4 = (n3 ^ 0x22D75C0 ^ 0x540FA3CA) + 1410311114 + -1225806237 - -1225806237;
                                                        int cfr_ignored_9 = (Integer.rotateLeft(0x38FF77D0 ^ n3, 10) + -347266709) * 956266449;
                                                        n4 = (int)((long)((n3 ^ 0xD03E816 ^ 0x540FA3CA) + 1410311114) ^ 0x69B1A0725644637EL ^ 0x69B1A0725644637EL);
                                                        continue;
                                                    }
                                                    int cfr_ignored_10 = Integer.rotateLeft(0x143E55E5 ^ n3, 5) - 2011825654;
                                                    int cfr_ignored_11 = (int)(0xD68CFBD827D4EB4FL ^ (long)n3 ^ 0xAC0831A2DB800C8L);
                                                    n4 = (n3 ^ 0x82CEED8E ^ 0x540FA3CA) + 1410311114 + -991409232 - -991409232;
                                                    int cfr_ignored_12 = Integer.rotateLeft(0xB666294C ^ n3, 9) - 448569199;
                                                    int cfr_ignored_13 = (int)(0x6CB093C59357F6F7L ^ (long)n3 ^ 0xDAFBEA1C16C974B0L);
                                                    n4 = Integer.reverse(Integer.reverse((n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114));
                                                    n2 -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_14 = (Integer.rotateLeft(0xD01E4FBC ^ n3, 13) - 940132095) * -803319875;
                                                n4 = (n3 ^ 0xC1B7DF1A ^ 0x540FA3CA) + 1410311114;
                                                int cfr_ignored_15 = Integer.rotateRight(0x86C480EF ^ n3, 3) - 1445542956;
                                                n4 = Integer.reverse(Integer.reverse((n3 ^ 0x2C15C9 ^ 0x540FA3CA) + 1410311114));
                                                int cfr_ignored_16 = (Integer.rotateRight(0xCBEB8D7 ^ n3, 4) - -1888091836) * 213825751;
                                                n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114 ^ 0xFECAD224 ^ 0xFECAD224;
                                                continue;
                                            }
                                            int cfr_ignored_17 = (Integer.rotateRight(0x247438DA ^ n3, 7) + 1852866977) * 611596507;
                                            n4 = Integer.reverse(Integer.reverse((n3 ^ 0xF13CD4BA ^ 0x540FA3CA) + 1410311114));
                                            int cfr_ignored_18 = (Integer.rotateRight(0xDD6F7C77 ^ n3, 14) - -723668572) * -579896201;
                                            n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114;
                                            int cfr_ignored_19 = Integer.rotateRight(0xCA51ECE3 ^ n3, 12) + -2075570504;
                                            continue;
                                        }
                                        int cfr_ignored_20 = Integer.rotateRight(0x936E3206 ^ n3, 5) - -558518795;
                                        n4 = (int)((long)((n3 ^ 0x1F535F90 ^ 0x540FA3CA) + 1410311114) ^ 0xEF1F522DDC2644E3L ^ 0xEF1F522DDC2644E3L);
                                        int cfr_ignored_21 = (Integer.rotateLeft(0xF4A643D ^ n3, 4) - -564149602) * 256533565;
                                        int cfr_ignored_22 = (int)(0xCDF8CA0027D4EB4FL ^ (long)n3 ^ 0x6970831A2DB83620L);
                                        try {
                                            if ((0x4D6484C6B7D7CCC9L ^ (long)n3 | 1L) == 0L) {
                                                throw new IllegalArgumentException();
                                            }
                                            n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114 + -1949714578 - -1949714578;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            n4 = (int)((long)((n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114) ^ 0x65C6515F8950FAD9L ^ 0x65C6515F8950FAD9L);
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_23 = (Integer.rotateLeft(0x197A7355 ^ n3, 6) - 439457414) * 427455317;
                                    int cfr_ignored_24 = (int)(0xDBC8DD6827D4EB4FL ^ (long)n3 ^ 0x47A0831A2DB81A40L);
                                    n4 = (n3 ^ 0x5DE91A95 ^ 0x540FA3CA) + 1410311114 ^ 0xEDD1F8C4 ^ 0xEDD1F8C4;
                                    int cfr_ignored_25 = (Integer.rotateRight(0x9D560CFE ^ n3, 6) - 298398205) * -1655304961;
                                    int cfr_ignored_26 = (int)(0xB7D89F67F7656ECL ^ (long)n3 ^ 0xEE9C325F56FFBB2AL);
                                    n4 = Integer.reverse(Integer.reverse((n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114));
                                    n2 -= 5;
                                    continue;
                                }
                                int cfr_ignored_27 = Integer.rotateRight(0x4D2C4E6E ^ n3, 12) - 1555766925;
                                int cfr_ignored_28 = (int)(0xBC78BF8A9E64AE21L ^ (long)n3 ^ 0x8265F07AA764D520L);
                                n4 = (n3 ^ 0x648B4FA ^ 0x540FA3CA) + 1410311114 + 139343788 - 139343788;
                                int cfr_ignored_29 = (int)(0x50D68DD8667C7E5L ^ (long)n3 ^ 0x2CCBC07C74EDA7CBL);
                                n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114;
                                n2 -= 5;
                                continue;
                            }
                            int cfr_ignored_30 = (Integer.rotateRight(0xA11B55FF ^ n3, 7) - -2035480292) * -1592044033;
                            try {
                                n2 -= 3;
                                n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114 + 1144354858 - 1144354858;
                            }
                            catch (IllegalStateException illegalStateException) {
                                n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114 ^ 0x55A1C1A1 ^ 0x55A1C1A1;
                            }
                            continue;
                        }
                        int cfr_ignored_31 = (Integer.rotateLeft(0x4C72E3F5 ^ n3, 12) - 1179072998) * 1282597877;
                        int cfr_ignored_32 = (int)(0x8EC04DC827D4EB4FL ^ (long)n3 ^ 0x66E0831A2DB8B051L);
                        try {
                            ++n2;
                            if ((0x6BE65F345204D91L ^ (long)n3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114 ^ 0x3B2246F2 ^ 0x3B2246F2;
                        }
                        n2 -= 2;
                        continue;
                    }
                    int cfr_ignored_33 = (Integer.rotateRight(0xE5195E77 ^ n3, 15) - -1032843356) * -451322249;
                    n4 = (n3 ^ 0x57E1DE20 ^ 0x540FA3CA) + 1410311114 ^ 0xCB377424 ^ 0xCB377424;
                    int cfr_ignored_34 = Integer.rotateLeft(0xB2D39A05 ^ n3, 9) - -1409464874;
                    int cfr_ignored_35 = (int)(0x7061343827D4EB4FL ^ (long)n3 ^ 0x9500831A2DB94D13L);
                    n4 = (n3 ^ 0x83C3641F ^ 0x540FA3CA) + 1410311114 + -27585394 - -27585394;
                    int cfr_ignored_36 = (Integer.rotateLeft(0xEFAFABB1 ^ n3, 16) + 178481578) * -273699919;
                    int cfr_ignored_37 = (int)(0x2D1D058C27D4EB4FL ^ (long)n3 ^ 0xF668831A2DB9F7EBL);
                    n4 = Integer.reverse(Integer.reverse((n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114));
                    n2 -= 2;
                    continue;
                }
                int cfr_ignored_38 = Integer.rotateLeft(0xD772C640 ^ n3, 13) + 457416955;
                n4 = (n3 ^ 0xE602CE57 ^ 0x540FA3CA) + 1410311114;
                int cfr_ignored_39 = Integer.rotateRight(0x8D086E8E ^ n3, 4) - 409141869;
                try {
                    ++n2;
                    if ((0xE12660008FBABCF9L ^ (long)n3 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    n4 = Integer.reverse(Integer.reverse((n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    n4 = (n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114 + 1203501958 - 1203501958;
                }
                n2 -= 3;
                continue;
            }
            int cfr_ignored_40 = (Integer.rotateRight(0xD5D0647A ^ n3, 13) + -392574463) * -707763077;
            n4 = Integer.reverse(Integer.reverse((n3 ^ 0x3DCAAFE3 ^ 0x540FA3CA) + 1410311114));
        }
    }

    public bsb getSource() {
        block0: {
            int n = -1914077308;
            n = Integer.rotateLeft(n * 780610037, 24) ^ 0x6836A79C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF7CF5DB8;
            if ((n2 ^ n) == -137405000) break block0;
            int cfr_ignored_0 = (0x7A26223C ^ n) - 935445354;
        }
        return this.rwq;
    }

    private static qz convertCategory(bzw bzw2) {
        int n = -642882581;
        int n2 = (n = Integer.rotateLeft(n * -1528707973, 18) ^ 0xD030FA8F) ^ 0x699FD612;
        if ((n2 ^ n) != 1772082706) {
            int cfr_ignored_0 = (0xB031B5F9 ^ n) + 50913439;
        }
        if (bzw2 == null) {
            return qz.hfdh;
        }
        return switch (bat_4.rhh_3[bzw2.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> qz.rza_2;
            case 2 -> qz.bhy;
            case 3 -> qz.thfk;
            case 4 -> qz.khjn;
            case 5 -> qz.hfdh;
        };
    }

    private static int toJavelinBind(int n) {
        try {
            int n2 = -387383206;
            n2 = Integer.rotateLeft(n2 * 1690465225, 16) ^ 0xF307FBD2;
            int n3 = n2 ^ 0xE0FE5433;
            if ((n3 ^ n2) != -520203213) {
                int cfr_ignored_0 = (0x8175469 ^ n2) + 978881296;
            }
            if ((0x17D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (n == Integer.rotateLeft(0x7E46727A ^ 0x81B97405, 26)) {
            return -1;
        }
        if (n >= (Integer.reverse(974708683) ^ 0x2C04E7C0) && n <= 1779468684 - 1779468780) {
            return n + (Integer.reverse(-1652186422) ^ 0x5345A1DD);
        }
        return n;
    }

    private static int toMoonBind(int n) {
        try {
            int n2 = 964062224;
            n2 = Integer.rotateLeft(n2 * -1584821381, 26) ^ 0x4ADC75DD;
            n2 = n ^ n2;
            int n3 = n2 ^ 0x9D6BB77B;
            if ((n3 ^ n2) != -1653885061) {
                int cfr_ignored_0 = (0xA41DDB6B ^ n2) - -861125803;
            }
            if ((0x3A0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (n == -1) {
            return 0xD87E7F67 ^ 0x2781837E;
        }
        if (n >= 0 && n <= 4) {
            return n - (1815113948 + -1815113848);
        }
        return n;
    }

    private static void dcw5b2do(bhn_2 bhn2_2, boolean bl) {
        int n = 644348042;
        n = Integer.rotateLeft(n * 942955573, 16) ^ 0xEE4478F2;
        bhn_2 bhn3 = bhn2_2;
        n = (bhn3 != null ? System.identityHashCode(bhn3) : 0) ^ n;
        int n2 = n ^ 0xEE6F9359;
        if ((n2 ^ n) != -294677671) {
            int cfr_ignored_0 = (0xC8086BD3 ^ n) - -1052587463;
        }
        bhn2_2.sby_2(bl);
    }

    private static String em38xyic237(tss tss2) {
        block0: {
            int n = thk_3.bdb_2(1406768023);
            int n2 = n ^ 0xE5D7A4CA;
            if ((n2 ^ n) == -438852406) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB60E375D ^ n, 9) - 269898622) * -1240582307;
            int cfr_ignored_1 = (int)(0x74BC996027D4EB4FL ^ (long)n ^ 0xCFB0831A2DB944A8L);
        }
        return tss2.getName();
    }

    private static int qj5yh7q2(int n) {
        block0: {
            int n2 = 1817045685;
            n2 = Integer.rotateLeft(n2 * 1487304909, 9) ^ 0x9811856E;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 10)) ^ 0x890F65F6;
            if ((n3 ^ n2) == -1995479562) break block0;
            int cfr_ignored_0 = (0xE5428F43 ^ n2) - 2073019260;
        }
        return tss.toJavelinBind(n);
    }

    private static String[] sn7rxtkwt66v0(String string) {
        int n = -1574123998;
        n = Integer.rotateLeft(n * 1256994841, 27) ^ 0xBB2F18E5;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x4DDA8BC0;
        if ((n2 ^ n) != 1306168256) {
            int cfr_ignored_0 = (0xEFF64DE2 ^ n) + 1447520339;
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

    private static CallSite i6g0ww0u05j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1366325325;
            n3 = Integer.rotateLeft(n3 * -1485432329, 18) ^ 0x22FBAF54;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 17);
            int n4 = n3 ^ 0x2C04412E;
            if ((n4 ^ n3) != 738476334) {
                int cfr_ignored_0 = (0x7D743963 ^ n3) - -1396069994;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ shth_6 ^ string.hashCode() ^ n2 + shsh_4 ^ i * 453806491 ^ shth_6, 18) ^ shsh_4));
            }
            String[] stringArray = tss.sn7rxtkwt66v0(new String(cArray));
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

    private static String[] bncmzkr6ctkg(String string) {
        return string.split("\u0005\u001e", -1);
    }

    private static CallSite ilg2vqjampni(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ fbhha29z ^ string.hashCode() ^ n2 + sbzycjyl + i * 295391183) + fbhha29z) ^ sbzycjyl));
            }
            String[] stringArray = tss.bncmzkr6ctkg(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

