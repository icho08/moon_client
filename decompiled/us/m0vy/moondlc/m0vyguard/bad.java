/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1937
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 *  net.minecraft.class_437
 *  net.minecraft.class_634
 *  net.minecraft.class_636
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.Generated;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1937;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_437;
import net.minecraft.class_634;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bdj;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bshh_2;
import us.m0vy.moondlc.m0vyguard.bqdh;
import us.m0vy.moondlc.m0vyguard.bkd_2;
import us.m0vy.moondlc.m0vyguard.blq;
import us.m0vy.moondlc.m0vyguard.bhth_2;
import us.m0vy.moondlc.m0vyguard.bhsh_2;
import us.m0vy.moondlc.m0vyguard.tht;
import us.m0vy.moondlc.m0vyguard.tkhh_2;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.ghsh_2;
import us.m0vy.moondlc.m0vyguard.ghl;
import us.m0vy.moondlc.m0vyguard.qk;
import us.m0vy.moondlc.m0vyguard.mk;
import us.m0vy.moondlc.m0vyguard.yz;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public abstract class bad
extends tht
implements dl {
    protected static final long tzy_2 = 1000000000L;
    private final String rsn_2;
    private final bdj znl;
    private int khthth;
    private boolean rsz_4;
    private boolean dshm;
    private final String yd_2;
    private boolean hhdh_2;
    private static final int dhwsh = 582794302;
    private static final int tbm = 1337105895;
    private static final int shny = 852055767;
    private static final int hnr = 858751847;
    private static final int zb1uxxbtk7ow = -1181756488;
    private static final int puai9ob7 = -1716662052;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int pt5p186v;

    public String getName() {
        block0: {
            int n = ghl.zthr(1707495268);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
            int n2 = n ^ 0xEAFE1D71;
            if ((n2 ^ n) == -352445071) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8F385215 ^ n, 4) - 1546620870) * -1892134379;
            int cfr_ignored_1 = (int)(0x4D8AFC2827D4EB4FL ^ (long)n ^ 0x520831A2DB936C4L);
        }
        return this.rsn_2;
    }

    public bad() {
        tkhh_2 tkhh2_2 = this.getClass().getAnnotation(tkhh_2.class);
        if (tkhh2_2 == null) {
            try {
                throw new Exception("No data for " + this.getClass().getName());
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
        this.rsn_2 = bad.dskh_4(tkhh2_2.name());
        tkhh_2 tkhh3_2 = tkhh2_2;
        this.znl = bad.tfm(tkhh3_2.name(), tkhh3_2.category());
        this.khthth = tkhh2_2.bind();
        this.yd_2 = bad.shhkh(tkhh2_2.desc());
    }

    public boolean khash_2() {
        int n = ghl.zthr(1535903670);
        int n2 = n ^ 0xD51AAA63;
        if ((n2 ^ n) != -719672733) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x8E96ADD5 ^ n, 4) - 1218227206) * -1902727723;
            int cfr_ignored_1 = (int)(0x4C2403E827D4EB4FL ^ (long)n ^ 0xFAA0831A2DB93599L);
        }
        return this.khthth != Integer.rotateLeft(0x1BAB0496 ^ 0xE4533769, 23);
    }

    public String rwq() {
        block0: {
            int n = ghl.zthr(912796634);
            int n2 = n ^ 0x487E9A7A;
            if ((n2 ^ n) == 1216256634) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7E16B1A0 ^ n, 18) + 1226645915;
        }
        return this.yd_2;
    }

    public String dyd_4() {
        block0: {
            int n = -2129119946;
            n = Integer.rotateLeft(n * -30395557, 17) ^ 0x7D260A6A;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x1269FCD5;
            if ((n2 ^ n) == 308935893) break block0;
            int cfr_ignored_0 = (0x9371C9E3 ^ n) + -1267440666;
        }
        return this.yd_2;
    }

    public String zzh_4() {
        block0: {
            int n = -1427358133;
            int n2 = (n = Integer.rotateLeft(n * -980723081, 19) ^ 0xF002CB04) ^ 0xF03C6A5C;
            if ((n2 ^ n) == -264476068) break block0;
            int cfr_ignored_0 = (0x5AD05417 ^ n) - 1222778171;
        }
        return bad.adz(this);
    }

    public void db() {
        try {
            int n = 1107892528;
            n = Integer.rotateLeft(n * 1347052563, 10) ^ 0xF1C54864;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD4BFF9A5;
            if ((n2 ^ n) != -725616219) {
                int cfr_ignored_0 = (0x96B6E095 ^ n) + 1431144669;
            }
            if ((0x1A2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bad.swdh();
        }
        this.shlq(!this.dshm, false);
    }

    public void ghba_2(boolean bl) {
        int n = 0;
        int n2 = -1475137759;
        n2 = Integer.rotateLeft(n2 * -546530767, 16) ^ 0x302938F2;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 - 1881819257;
        while (true) {
            block24: {
                block28: {
                    block32: {
                        block29: {
                            block35: {
                                block27: {
                                    block36: {
                                        block21: {
                                            block33: {
                                                block38: {
                                                    block22: {
                                                        block31: {
                                                            block37: {
                                                                block26: {
                                                                    block23: {
                                                                        block34: {
                                                                            block30: {
                                                                                block19: {
                                                                                    block25: {
                                                                                        block20: {
                                                                                            if ((n = n2 - n3) > 211344858) break block19;
                                                                                            if (n > -1113143353) break block20;
                                                                                            if (n == -2140973959) break block21;
                                                                                            if (n == -1533100550) break block22;
                                                                                            int cfr_ignored_0 = Integer.rotateRight(0x77955842 ^ n2, 17) + 2138263353;
                                                                                            if (n == -1113143353) break block23;
                                                                                            break block24;
                                                                                        }
                                                                                        if (n > -234220733) break block25;
                                                                                        if (n == -595724163) break block26;
                                                                                        if (n == -234220733) break block27;
                                                                                        break block24;
                                                                                    }
                                                                                    if (n == 93942050) break block28;
                                                                                    if (n == 211344858) break block29;
                                                                                    break block24;
                                                                                }
                                                                                if (n > 999107198) break block30;
                                                                                if (n == 415910428) break block31;
                                                                                if (n == 901589672) break block32;
                                                                                if (n == 999107198) break block33;
                                                                                break block24;
                                                                            }
                                                                            if (n > 1862901676) break block34;
                                                                            if (n == 1150442314) break block35;
                                                                            if (n == 1862901676) break block36;
                                                                            int cfr_ignored_1 = Integer.rotateRight(0x66CF3F6E ^ n2, 15) - 2004241805;
                                                                            break block24;
                                                                        }
                                                                        if (n == 1881819257) break block37;
                                                                        if (n == 2017045677) break block38;
                                                                        break block24;
                                                                    }
                                                                    int cfr_ignored_2 = Integer.rotateRight(0x967461A6 ^ n2, 5) - 1014329941;
                                                                    yf.athz_2();
                                                                    try {
                                                                        n -= 5;
                                                                        if ((0xA9EC1AB164C71E81L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n3 = n2 - -595724163 + 1543162087 - 1543162087;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = (int)((long)(n2 - -595724163) ^ 0x5476DE5BC6F5961BL ^ 0x5476DE5BC6F5961BL);
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_3 = Integer.rotateRight(0x8FF24F6F ^ n2, 4) - 1924480428;
                                                                this.shlq(bl, false);
                                                                return;
                                                            }
                                                            int cfr_ignored_4 = (Integer.rotateLeft(0xAD5C3435 ^ n2, 8) - 42463654) * -1386466251;
                                                            int cfr_ignored_5 = (int)(0x6FEE9A0827D4EB4FL ^ (long)n2 ^ 0xC960831A2DB9720CL);
                                                            if (bad.dhqd_2()) {
                                                                int cfr_ignored_6 = (int)(0xA44DB15FD528DB03L ^ (long)n2 ^ 0x9FCF66E24D20E54AL);
                                                                n3 = (int)((long)(n2 - -595724163) ^ 0x3104F6B0998BA00FL ^ 0x3104F6B0998BA00FL);
                                                                continue;
                                                            }
                                                            try {
                                                                n -= 4;
                                                                if ((0xD41DC79069FF93F9L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                n3 = (int)((long)(n2 - -1113143353) ^ 0xC52CAC2C0A4172F1L ^ 0xC52CAC2C0A4172F1L);
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                n3 = (int)((long)(n2 - -1113143353) ^ 0xE312C0B976985851L ^ 0xE312C0B976985851L);
                                                            }
                                                            n += 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_7 = (Integer.rotateRight(0x9395F353 ^ n2, 5) + -477751736) * -1818889389;
                                                        n3 = (int)((long)(n2 - 744358332) ^ 0xFBBBEF8354E79037L ^ 0xFBBBEF8354E79037L);
                                                        int cfr_ignored_8 = Integer.rotateRight(0x66870BE2 ^ n2, 15) + 1857556377;
                                                        n3 = n2 - 1749563640 + -1172707337 - -1172707337;
                                                        int cfr_ignored_9 = (Integer.rotateRight(0x985939FB ^ n2, 6) + 1999348896) * -1738982917;
                                                        n3 = n2 - 1881819257 ^ 0x6C41771E ^ 0x6C41771E;
                                                        n += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_10 = (Integer.rotateLeft(0xE4E670FC ^ n2, 15) - -1136308801) * -454659843;
                                                    n3 = n2 - 1881819257;
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_11 = Integer.rotateRight(0xD2AD2B8B ^ n2, 13) + -2024413936;
                                                n3 = (int)((long)(n2 - 1710166983) ^ 0x6BDF2273D1D0B5FL ^ 0x6BDF2273D1D0B5FL);
                                                int cfr_ignored_12 = (Integer.rotateLeft(0xC1C7183D ^ n2, 11) - 2071563934) * -1043916739;
                                                int cfr_ignored_13 = (int)(0x375B60027D4EB4FL ^ (long)n2 ^ 0x9170831A2DB9AB3AL);
                                                try {
                                                    n -= 3;
                                                    n3 = n2 - 1881819257 ^ 0x354A73E0 ^ 0x354A73E0;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = n2 - 1881819257;
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_14 = Integer.rotateLeft(0x259C534D ^ n2, 7) - -1840532082;
                                            int cfr_ignored_15 = (int)(0xE72EFD7027D4EB4FL ^ (long)n2 ^ 0x790831A2DB8638CL);
                                            n3 = n2 - -1378028296 ^ 0x422E33E9 ^ 0x422E33E9;
                                            int cfr_ignored_16 = (Integer.rotateLeft(0x9C5BE1D9 ^ n2, 6) + -209848190) * -1671700007;
                                            int cfr_ignored_17 = (int)(0x5EE94FE427D4EB4FL ^ (long)n2 ^ 0x62B8831A2DB91003L);
                                            try {
                                                n -= 3;
                                                if ((0x90ED5E056572FA8DL ^ (long)n2 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                n3 = (int)((long)(n2 - 1881819257) ^ 0xF5EADBD3071B7EAL ^ 0xF5EADBD3071B7EAL);
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                n3 = (int)((long)(n2 - 1881819257) ^ 0x4D1536EDDBB40012L ^ 0x4D1536EDDBB40012L);
                                            }
                                            n += 4;
                                            continue;
                                        }
                                        int cfr_ignored_18 = Integer.rotateRight(0x671DC70A ^ n2, 15) + -2131183247;
                                        n3 = n2 - -475730414 + -1967280766 - -1967280766;
                                        int cfr_ignored_19 = (Integer.rotateRight(0x8E135433 ^ n2, 4) + 951374184) * -1911335885;
                                        n3 = n2 - 1881819257;
                                        n -= 4;
                                        continue;
                                    }
                                    int cfr_ignored_20 = Integer.rotateRight(0x21590863 ^ n2, 7) + 237347640;
                                    n3 = (int)((long)(n2 - 2055156730) ^ 0xE443B9007D853AB8L ^ 0xE443B9007D853AB8L);
                                    int cfr_ignored_21 = (Integer.rotateLeft(0x3B7A88DD ^ n2, 10) - 942944766) * 997886173;
                                    int cfr_ignored_22 = (int)(0xF9C826E027D4EB4FL ^ (long)n2 ^ 0xB0B0831A2DB85E41L);
                                    int cfr_ignored_23 = (int)(0xFF14371F3B7D51C9L ^ (long)n2 ^ 0x934EBA4958B453F9L);
                                    n3 = n2 - -695440772;
                                    int cfr_ignored_24 = (int)(0xBF4629ECD4E03786L ^ (long)n2 ^ 0xAEA96573942AD35DL);
                                    n3 = n2 - 1881819257 + 405420551 - 405420551;
                                    --n;
                                    continue;
                                }
                                int cfr_ignored_25 = (Integer.rotateLeft(0x903941B5 ^ n2, 5) - 2068616230) * -1875295819;
                                int cfr_ignored_26 = (int)(0x528BEF8827D4EB4FL ^ (long)n2 ^ 0x2260831A2DB908C6L);
                                n3 = Integer.reverse(Integer.reverse(n2 - 576482796));
                                int cfr_ignored_27 = (Integer.rotateLeft(0x6D14B9D9 ^ n2, 16) + 970989698) * 1830074841;
                                int cfr_ignored_28 = (int)(0xAFA617E427D4EB4FL ^ (long)n2 ^ 0xD2B8831A2DB8F29DL);
                                try {
                                    n -= 5;
                                    if ((0xC451B5C2B8538E63L ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    n3 = Integer.reverse(Integer.reverse(n2 - 1881819257));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    n3 = n2 - 1881819257 + 1727853923 - 1727853923;
                                }
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_29 = (Integer.rotateLeft(0x86910F1C ^ n2, 3) - 1341027231) * -2037313763;
                            n3 = (int)((long)(n2 - 1663393469) ^ 0x7E5D8D55315907F3L ^ 0x7E5D8D55315907F3L);
                            int cfr_ignored_30 = (Integer.rotateRight(0xACC48BDE ^ n2, 8) - -265646307) * -1396405281;
                            int cfr_ignored_31 = (int)(0x5162764BBD950085L ^ (long)n2 ^ 0x11E7B799FA2D0F15L);
                            n3 = n2 - -9740604;
                            int cfr_ignored_32 = (int)(0xBE1D2D66745539E7L ^ (long)n2 ^ 0xA7BC241988E8D1EBL);
                            n3 = Integer.reverse(Integer.reverse(n2 - 1881819257));
                            n -= 3;
                            continue;
                        }
                        int cfr_ignored_33 = Integer.rotateRight(0x469D7A6E ^ n2, 11) - -1854967155;
                        n3 = n2 - -1306760336 + 700139551 - 700139551;
                        int cfr_ignored_34 = Integer.rotateRight(0x176FA5CF ^ n2, 5) - -622677172;
                        n3 = n2 - 1881819257 + -1308883326 - -1308883326;
                        continue;
                    }
                    int cfr_ignored_35 = Integer.rotateLeft(0x3BE3DE4 ^ n2, 3) - 2020023767;
                    n3 = n2 - -1834640361;
                    int cfr_ignored_36 = Integer.rotateLeft(0x23EF53AD ^ n2, 7) - 1582874926;
                    int cfr_ignored_37 = (int)(0xE15DFD9027D4EB4FL ^ (long)n2 ^ 0x650831A2DB86F6AL);
                    try {
                        if ((0x86FA3B0160C0E2B7L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 1881819257 ^ 0xBE49E7D7 ^ 0xBE49E7D7;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - 1881819257 + -1360105352 - -1360105352;
                    }
                    n -= 2;
                    continue;
                }
                int cfr_ignored_38 = (Integer.rotateRight(0x60721456 ^ n2, 15) - -1305602651) * 1618089047;
                n3 = (int)((long)(n2 - -1787267117) ^ 0xFF38E1DACE5E43EEL ^ 0xFF38E1DACE5E43EEL);
                int cfr_ignored_39 = (Integer.rotateLeft(0x76108498 ^ n2, 17) + 1348316579) * 1980794009;
                n3 = n2 - 49213959 ^ 0x56F6D080 ^ 0x56F6D080;
                int cfr_ignored_40 = Integer.rotateRight(0xE8BF3B63 ^ n2, 16) + 864407608;
                n3 = n2 - 1881819257 ^ 0x792B8A37 ^ 0x792B8A37;
                ++n;
                continue;
            }
            int cfr_ignored_41 = (Integer.rotateRight(0xDFFDE833 ^ n2, 14) + 605863272) * -537008077;
            n3 = n2 - 1881819257;
        }
    }

    public void shlq(boolean bl, boolean bl2) {
        try {
            int n = -1816956306;
            n = Integer.rotateLeft(n * -1145133341, 16) ^ 0x9A6D3504;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
            n = Integer.rotateRight(bl2 ^ n, 10);
            int n2 = n ^ 0x482380C3;
            if ((n2 ^ n) != 1210286275) {
                int cfr_ignored_0 = (0xDB90F2AD ^ n) + 1161094642;
            }
            if ((0x178 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bad.tws_3()) {
            bad.ttl_4();
            throw null;
        }
        this.dshm = bl;
        boolean bl3 = this.rsz_4 ? bad.dghr(this) : bl;
        this.zhw_3(bl3, bl2);
    }

    public void tsth_4(boolean bl) {
        int n = 836377614;
        n = Integer.rotateLeft(n * -890769847, 28) ^ 0x8527E34C;
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = bl ^ n) ^ 0x3B0FD60C;
        if ((n2 ^ n) != 990893580) {
            int cfr_ignored_0 = (0xAD5CA02 ^ n) - -1906943816;
        }
        this.rsz_4 = bl;
        boolean bl2 = bl ? bad.dht_3(this) : this.dshm;
        bad.syth_2(this, bl2, false);
    }

    /*
     * Unable to fully structure code
     */
    public void rra(boolean var1_1) {
        var4_2 = 0;
        var2_3 = 955651204;
        var2_3 = Integer.rotateLeft(var2_3 * 1713946791, 26) ^ 1511731442;
        var2_3 = Integer.rotateRight(System.identityHashCode(this) ^ var2_3, 11);
        var2_3 = var1_1 ^ var2_3;
        var3_4 = (int)((long)((var2_3 ^ -1452004811 ^ 2057510390) + 2057510390) ^ 7048418312150109626L ^ 7048418312150109626L);
        while (true) {
            block56: {
                block47: {
                    block48: {
                        block50: {
                            block59: {
                                block53: {
                                    block51: {
                                        block54: {
                                            block57: {
                                                block52: {
                                                    block45: {
                                                        block58: {
                                                            block46: {
                                                                block55: {
                                                                    block49: {
                                                                        block60: {
                                                                            var4_2 = var3_4 - 2057510390 ^ 2057510390 ^ var2_3;
                                                                            switch (var4_2 & 15) {
                                                                                case 0: {
                                                                                    if (var4_2 != -503716016) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block45;
                                                                                }
                                                                                case 2: {
                                                                                    if (var4_2 != 153332050) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block46;
                                                                                }
                                                                                case 3: {
                                                                                    if (var4_2 != 1881407507) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block47;
                                                                                }
                                                                                case 4: {
                                                                                    if (var4_2 != 778232292) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block48;
                                                                                }
                                                                                case 5: {
                                                                                    if (var4_2 != -465113099) {
                                                                                        if (var4_2 == -1452004811) break;
                                                                                        (Integer.rotateLeft(1559080369 ^ var2_3, 14) + 1160095658) * 1559080369;
                                                                                        (int)(-7034900192430855345L ^ (long)var2_3 ^ -402928018190200465L);
                                                                                        ** break;
                                                                                    }
                                                                                    break block49;
                                                                                }
                                                                                case 6: {
                                                                                    if (var4_2 != 399982150) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block50;
                                                                                }
                                                                                case 7: {
                                                                                    if (var4_2 != -491109561) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block51;
                                                                                }
                                                                                case 8: {
                                                                                    if (var4_2 != -1297175448) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block52;
                                                                                }
                                                                                case 9: {
                                                                                    if (var4_2 == -474140215) break block53;
                                                                                    if (var4_2 == -1134453047) break block54;
                                                                                    (Integer.rotateLeft(1984328029 ^ var2_3, 17) - 1457871230) * 1984328029;
                                                                                    (int)(-5407451648487003313L ^ (long)var2_3 ^ 4877542544901719096L);
                                                                                    if (var4_2 != 1891401753) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block55;
                                                                                }
                                                                                case 10: {
                                                                                    if (var4_2 == 23457050) break block56;
                                                                                    if (var4_2 == -353280790) break block57;
                                                                                    if (var4_2 != -31388102) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block58;
                                                                                }
                                                                                case 12: {
                                                                                    if (var4_2 != -647957348) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block59;
                                                                                }
                                                                                case 14: {
                                                                                    if (var4_2 != 526371134) {
                                                                                        ** break;
                                                                                    }
                                                                                    break block60;
                                                                                }
                                                                            }
                                                                            Integer.rotateLeft(-1111371100 ^ var2_3, 10) - -19521257;
                                                                            if (yf.khdha_2()) {
                                                                                (int)(-5915107979734863838L ^ (long)var2_3 ^ 6643754023661008387L);
                                                                                var3_4 = (var2_3 ^ 526371134 ^ 2057510390) + 2057510390 ^ -498475156 ^ -498475156;
                                                                                ++var4_2;
                                                                                continue;
                                                                            }
                                                                            (int)(-2292113345634167188L ^ (long)var2_3 ^ 8317055209977048496L);
                                                                            var3_4 = (var2_3 ^ 1891401753 ^ 2057510390) + 2057510390;
                                                                            ++var4_2;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateRight(861992922 ^ var2_3, 9) + 1025221281) * 861992923;
                                                                        if (!this.rsz_4) {
                                                                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 153332050 ^ 2057510390) + 2057510390));
                                                                            Integer.rotateLeft(-1709304411 ^ var2_3, 6) - -1375584714;
                                                                            (int)(6389688233509579599L ^ (long)var2_3 ^ -8484637549506519928L);
                                                                            var4_2 += 5;
                                                                            continue;
                                                                        }
                                                                        (int)(-7850228310040715709L ^ (long)var2_3 ^ 4076795800517118925L);
                                                                        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -465113099 ^ 2057510390) + 2057510390));
                                                                        var4_2 += 5;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateLeft(-2000126984 ^ var2_3, 4) + -1801149885) * -2000126983;
                                                                    bad.zbgh(this, this.dshm ^ var1_1, false);
                                                                    return;
                                                                }
                                                                Integer.rotateRight(245463211 ^ var2_3, 4) + -907330576;
                                                                bad.dsk_3();
                                                                try {
                                                                    --var4_2;
                                                                    var3_4 = (var2_3 ^ 526371134 ^ 2057510390) + 2057510390 + -648595386 - -648595386;
                                                                }
                                                                catch (NoSuchElementException v0) {
                                                                    var3_4 = (var2_3 ^ 526371134 ^ 2057510390) + 2057510390 ^ -545718891 ^ -545718891;
                                                                }
                                                                var4_2 += 4;
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(-821702114 ^ var2_3, 12) - 370282717) * -821702113;
                                                            return;
                                                        }
                                                        Integer.rotateLeft(180784421 ^ var2_3, 4) - 1382594230;
                                                        (int)(-4002535582171075761L ^ (long)var2_3 ^ -4953815441648108231L);
                                                        var3_4 = (var2_3 ^ -517623869 ^ 2057510390) + 2057510390 ^ -292097963 ^ -292097963;
                                                        Integer.rotateRight(-2111185882 ^ var2_3, 3) - -949008427;
                                                        try {
                                                            var4_2 += 5;
                                                            if ((-8691108941135626545L ^ (long)var2_3 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390;
                                                        }
                                                        catch (IllegalStateException v1) {
                                                            var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 ^ 238944889 ^ 238944889;
                                                        }
                                                        var4_2 -= 4;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(1344528493 ^ var2_3, 13) - -1196045202;
                                                    (int)(-7885435366376412337L ^ (long)var2_3 ^ 7048277565294282995L);
                                                    (int)(3176708780179657379L ^ (long)var2_3 ^ 2516164473348290042L);
                                                    var3_4 = (var2_3 ^ 968634057 ^ 2057510390) + 2057510390 + 1868217183 - 1868217183;
                                                    (int)(-3295313812688242862L ^ (long)var2_3 ^ -7032605851273524904L);
                                                    var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 ^ -1966410173 ^ -1966410173;
                                                    var4_2 += 5;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-132776687 ^ var2_3, 18) + 252134474) * -132776687;
                                                (int)(4226438224422431567L ^ (long)var2_3 ^ 6568644204979411103L);
                                                var3_4 = (var2_3 ^ -965237251 ^ 2057510390) + 2057510390 ^ 588284794 ^ 588284794;
                                                Integer.rotateRight(-983085629 ^ var2_3, 11) + -337638952;
                                                var3_4 = (var2_3 ^ 21697863 ^ 2057510390) + 2057510390 + -712014980 - -712014980;
                                                Integer.rotateLeft(-556539095 ^ var2_3, 14) + 401714;
                                                (int)(2045000454765865807L ^ (long)var2_3 ^ 7446846132316640531L);
                                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1452004811 ^ 2057510390) + 2057510390));
                                                var4_2 += 3;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-2022936624 ^ var2_3, 3) + 1786718571) * -2022936623;
                                            var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390;
                                            Integer.rotateRight(-470585306 ^ var2_3, 15) - -1629998123;
                                            var4_2 -= 4;
                                            continue;
                                        }
                                        (Integer.rotateLeft(1680231313 ^ var2_3, 15) + 620807626) * 1680231313;
                                        (int)(-6443272639294936241L ^ (long)var2_3 ^ 3902513225576014072L);
                                        (int)(-1561308696229637058L ^ (long)var2_3 ^ -4506293766615041669L);
                                        var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 + 1092506898 - 1092506898;
                                        var4_2 -= 3;
                                        continue;
                                    }
                                    Integer.rotateRight(1665399175 ^ var2_3, 15) - 161011348;
                                    var3_4 = (var2_3 ^ 933229300 ^ 2057510390) + 2057510390 + 2036305023 - 2036305023;
                                    Integer.rotateLeft(-441210295 ^ var2_3, 15) + -719372782;
                                    (int)(2810532539386882895L ^ (long)var2_3 ^ -749705189497642029L);
                                    var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 ^ 815640455 ^ 815640455;
                                    var4_2 += 3;
                                    continue;
                                }
                                Integer.rotateLeft(616657568 ^ var2_3, 7) + 2009759899;
                                var3_4 = (var2_3 ^ 470763617 ^ 2057510390) + 2057510390;
                                Integer.rotateRight(1255859655 ^ var2_3, 12) - 350188116;
                                try {
                                    var4_2 += 4;
                                    if ((-6782507363723061309L ^ (long)var2_3 | 1L) == 0L) {
                                        throw new UnsupportedOperationException();
                                    }
                                    var3_4 = (int)((long)((var2_3 ^ -1452004811 ^ 2057510390) + 2057510390) ^ -8178877890846270001L ^ -8178877890846270001L);
                                }
                                catch (UnsupportedOperationException v2) {
                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1452004811 ^ 2057510390) + 2057510390));
                                }
                                var4_2 -= 5;
                                continue;
                            }
                            Integer.rotateLeft(-1959275259 ^ var2_3, 4) - -534746410;
                            (int)(5297776017787906895L ^ (long)var2_3 ^ 792777682876710619L);
                            var3_4 = (int)((long)((var2_3 ^ -160318864 ^ 2057510390) + 2057510390) ^ 8702237096126609663L ^ 8702237096126609663L);
                            (Integer.rotateLeft(-1505171152 ^ var2_3, 7) + 657579019) * -1505171151;
                            (int)(3718067535056929817L ^ (long)var2_3 ^ -8646234784469234973L);
                            var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390;
                            var4_2 -= 4;
                            continue;
                        }
                        (Integer.rotateRight(1629436511 ^ var2_3, 15) - -953831236) * 1629436511;
                        (int)(3091995703736222396L ^ (long)var2_3 ^ 1016420183270488064L);
                        var3_4 = (var2_3 ^ -433632167 ^ 2057510390) + 2057510390;
                        (int)(4492127165359164052L ^ (long)var2_3 ^ -8735190485035921025L);
                        var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 ^ -775945116 ^ -775945116;
                        var4_2 += 2;
                        continue;
                    }
                    (Integer.rotateRight(1707018782 ^ var2_3, 15) - 1451219165) * 1707018783;
                    try {
                        var4_2 += 3;
                        var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 + -1126978821 - -1126978821;
                    }
                    catch (IllegalStateException v3) {
                        var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 + 228127176 - 228127176;
                    }
                    continue;
                }
                Integer.rotateLeft(1032356324 ^ var2_3, 10) - 2011519447;
                var3_4 = (var2_3 ^ 648655650 ^ 2057510390) + 2057510390;
                (Integer.rotateRight(1306422326 ^ var2_3, 12) - 1917630917) * 1306422327;
                try {
                    if ((-8687086305355715001L ^ (long)var2_3 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 ^ -1244392641 ^ -1244392641;
                }
                catch (IllegalStateException v4) {
                    var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390;
                }
                var4_2 -= 3;
                continue;
            }
            (Integer.rotateLeft(-1311378792 ^ var2_3, 9) + -1924792413) * -1311378791;
            var3_4 = (var2_3 ^ 1302096307 ^ 2057510390) + 2057510390 ^ 1569510753 ^ 1569510753;
            Integer.rotateLeft(-1140334675 ^ var2_3, 10) - -917392082;
            (int)(9130328683521043279L ^ (long)var2_3 ^ 2184389967734198459L);
            try {
                var4_2 -= 5;
                if ((-4214815148998237751L ^ (long)var2_3 | 1L) == 0L) {
                    throw new NoSuchElementException();
                }
                var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 + -1145441807 - -1145441807;
            }
            catch (NoSuchElementException v5) {
                var3_4 = (var2_3 ^ -1452004811 ^ 2057510390) + 2057510390 + -935998336 - -935998336;
            }
            var4_2 += 5;
            continue;
lbl280:
            // 13 sources

            Integer.rotateLeft(-1778013984 ^ var2_3, 5) + 789385819;
            var3_4 = (int)((long)((var2_3 ^ -1452004811 ^ 2057510390) + 2057510390) ^ 4943338917028086872L ^ 4943338917028086872L);
        }
    }

    private boolean thlr() {
        try {
            int n = 242556767;
            n = Integer.rotateLeft(n * 844707887, 8) ^ 0xF6F40A23;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0x9199EA7F;
            if ((n2 ^ n) != -1852183937) {
                int cfr_ignored_0 = (0x9FECF520 ^ n) - 1240463308;
            }
            if ((0x15B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.dshm ^ (bad.dhjr(this) && brz.rzdh(this.khthth));
    }

    private void zhw_3(boolean bl, boolean bl2) {
        int n = -1787285125;
        n = Integer.rotateLeft(n * 1856870289, 26) ^ 0x9B2AB230;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xAFC2EF27;
        if ((n2 ^ n) != -1346179289) {
            int cfr_ignored_0 = (0x3ABADE5C ^ n) + -101772727;
        }
        if (this.hhdh_2 == bl) {
            return;
        }
        this.hhdh_2 = bl;
        if (this.hhdh_2) {
            this.tql();
            if (this.hhdh_2) {
                this.thtj();
            }
        } else {
            this.stt_7();
            bad.ddgh(this);
        }
        if (this.hhdh_2 != bl) {
            return;
        }
        if (bl2 || "ClickGui".equalsIgnoreCase(this.getName())) {
            return;
        }
        yz.tda_8(bl);
        if (bad.dthk_2(bad.aw()) != null) {
            bad.thghr(Moondlc.getInstance()).thhd_2(bl ? qk.zhh_2 : qk.tghs, bad.tmk_2(this), bl ? "Enabled" : "Disabled");
        }
    }

    @Override
    public abstract void thtj();

    public void tql() {
        block0: {
            int n = -108154285;
            n = Integer.rotateLeft(n * -137499999, 23) ^ 0x2C499E0F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0xF91FCF65;
            if ((n2 ^ n) == -115355803) break block0;
            int cfr_ignored_0 = (0x927D36 ^ n) + -1821783644;
        }
    }

    public void stt_7() {
        block0: {
            int n = -1185428174;
            n = Integer.rotateLeft(n * 1341286283, 7) ^ 0xD74255AF;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x1868DACF;
            if ((n2 ^ n) == 409524943) break block0;
            int cfr_ignored_0 = (0xA13F17FD ^ n) + -215584881;
        }
    }

    public void zrz_3(WorldRenderContext worldRenderContext) {
    }

    public void khsh_4(WorldRenderContext worldRenderContext) {
    }

    public void ssf_2(WorldRenderContext worldRenderContext) {
    }

    public void jba(WorldRenderContext worldRenderContext) {
    }

    public void bjn(WorldRenderContext worldRenderContext) {
    }

    public class_1269 tghj_2(class_1657 class_16572, class_1937 class_19372, class_1268 class_12682, class_1297 class_12972, class_3966 class_39662) {
        block0: {
            int n = 523922220;
            n = Integer.rotateLeft(n * -1574376807, 4) ^ 0xE9492953;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 11);
            int n2 = n ^ 0x780ADEFA;
            if ((n2 ^ n) == 2013978362) break block0;
            int cfr_ignored_0 = (0x6730B5D6 ^ n) + 2141441848;
        }
        return class_1269.field_5811;
    }

    public void khqd(class_1657 class_16572, class_1937 class_19372, class_1268 class_12682, class_1297 class_12972, class_3966 class_39662) {
        block0: {
            int n = -682338162;
            n = Integer.rotateLeft(n * -1003531175, 9) ^ 0x1F34844B;
            class_1937 class_19373 = class_19372;
            n = Integer.rotateLeft((class_19373 != null ? System.identityHashCode(class_19373) : 0) ^ n, 18);
            class_1297 class_12973 = class_12972;
            n = Integer.rotateLeft((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 4);
            int n2 = n ^ 0xBBF5461F;
            if ((n2 ^ n) == -1141553633) break block0;
            int cfr_ignored_0 = (0x6CA11E91 ^ n) + -2005424973;
        }
    }

    public class_1269 ddhs_3(class_1657 class_16572, class_1937 class_19372, class_1268 class_12682, class_3965 class_39652) {
        block0: {
            int n = -1924844049;
            n = Integer.rotateLeft(n * 1290730911, 9) ^ 0x128CE939;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x901B39FE;
            if ((n2 ^ n) == -1877263874) break block0;
            int cfr_ignored_0 = (0x1D5E0C11 ^ n) + -2135611722;
        }
        return class_1269.field_5811;
    }

    public void thfh_2(mk mk2) {
        block0: {
            int n = -1506630129;
            n = Integer.rotateLeft(n * 316064383, 17) ^ 0x8EA9DEDF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x35C75FB8;
            if ((n2 ^ n) == 902258616) break block0;
            int cfr_ignored_0 = (0x93F5F9B7 ^ n) - 715999599;
        }
    }

    public void kht(bqdh bqdh2) {
        block0: {
            int n = 2003402369;
            n = Integer.rotateLeft(n * 1697731155, 14) ^ 0x29D40A3E;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
            bqdh bqdh3 = bqdh2;
            n = Integer.rotateLeft((bqdh3 != null ? System.identityHashCode(bqdh3) : 0) ^ n, 16);
            int n2 = n ^ 0x2CDEBA9B;
            if ((n2 ^ n) == 752794267) break block0;
            int cfr_ignored_0 = (0x5BB7C41A ^ n) + 624666976;
        }
    }

    public void rnn(bhsh_2 bhsh2) {
        block0: {
            int n = -1089932996;
            n = Integer.rotateLeft(n * -1299840267, 7) ^ 0x6FC93A47;
            n = System.identityHashCode(this) ^ n;
            bhsh_2 bhsh3 = bhsh2;
            n = (bhsh3 != null ? System.identityHashCode(bhsh3) : 0) ^ n;
            int n2 = n ^ 0xC89F6688;
            if ((n2 ^ n) == -929077624) break block0;
            int cfr_ignored_0 = (0x779797B4 ^ n) + 981425349;
        }
    }

    protected boolean shkkh() {
        try {
            int n = -1484823233;
            n = Integer.rotateLeft(n * 2058047399, 18) ^ 0x715B6D8C;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x87889CE6;
            if ((n2 ^ n) != -2021090074) {
                int cfr_ignored_0 = (0x20F7F9D9 ^ n) + -2018363328;
            }
            if ((0x202 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        class_310 class_3102 = this.thzd_2();
        return class_3102 == null || class_3102.field_1724 == null || class_3102.field_1687 == null;
    }

    protected boolean tlt_3() {
        try {
            int n = -670491724;
            n = Integer.rotateLeft(n * 1008967493, 16) ^ 0x8649394F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2F008375;
            if ((n2 ^ n) != 788562805) {
                int cfr_ignored_0 = (0xF70998C1 ^ n) + 430081807;
            }
            if ((0x39B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.shkkh();
    }

    protected bshh_2 sght_2() {
        block0: {
            int n = ghl.zthr(1410957091);
            int n2 = n ^ 0x4BC61738;
            if ((n2 ^ n) == 1271273272) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1FDF681B ^ n, 6) + -529843584) * 534734875;
        }
        return null;
    }

    protected class_746 shfd() {
        class_310 class_3102;
        int n = ghl.zthr(156437405);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x389B79BD;
        if ((n2 ^ n) != 949713341) {
            int cfr_ignored_0 = Integer.rotateLeft(0x31C87220 ^ n, 9) + 195260699;
        }
        return (class_3102 = bad.ryw(this)) != null ? class_3102.field_1724 : null;
    }

    protected class_1657 sha_8() {
        class_310 class_3102;
        int n = 870843088;
        int n2 = (n = Integer.rotateLeft(n * 2087311035, 17) ^ 0xF04DE406) ^ 0x35B41022;
        if ((n2 ^ n) != 900993058) {
            int cfr_ignored_0 = (0x65C12F2 ^ n) + -901369174;
        }
        return (class_3102 = this.thzd_2()) != null ? class_3102.field_1724 : null;
    }

    protected class_638 atd_4() {
        class_310 class_3102;
        int n = ghl.zthr(-508291945);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x8CED8DDA;
        if ((n2 ^ n) != -1930588710) {
            int cfr_ignored_0 = Integer.rotateLeft(0x6D59994D ^ n, 16) - 1110912910;
            int cfr_ignored_1 = (int)(0xAFEB377027D4EB4FL ^ (long)n ^ 0x9390831A2DB8F207L);
        }
        return (class_3102 = this.thzd_2()) != null ? class_3102.field_1687 : null;
    }

    protected class_638 khdth_2() {
        int n = -1338206885;
        n = Integer.rotateLeft(n * -403314837, 22) ^ 0xEB4AC71D;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x58B8593D;
        if ((n2 ^ n) != 1488476477) {
            int cfr_ignored_0 = (0xE884CC66 ^ n) - 1835532755;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        class_310 class_3102 = this.thzd_2();
        return class_3102 != null ? class_3102.field_1687 : null;
    }

    protected class_310 thzd_2() {
        block0: {
            int n = 982388760;
            n = Integer.rotateLeft(n * -1306726381, 18) ^ 0xF3A1690E;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x5312E0BA;
            if ((n2 ^ n) == 1393746106) break block0;
            int cfr_ignored_0 = (0x699CF0A2 ^ n) + -476713299;
        }
        return bad.dhghw();
    }

    protected class_1661 khtq() {
        try {
            int n = 780684286;
            n = Integer.rotateLeft(n * 602890869, 14) ^ 0xC247DFB8;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
            int n2 = n ^ 0x76064598;
            if ((n2 ^ n) != 1980122520) {
                int cfr_ignored_0 = (0x588E0E66 ^ n) - -273052830;
            }
            if ((0x3E0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_746 class_7462 = this.shfd();
        return class_7462 != null ? class_7462.method_31548() : null;
    }

    protected class_315 dhrs_2() {
        class_310 class_3102;
        int n = -622082730;
        n = Integer.rotateLeft(n * -2094702049, 16) ^ 0xA5730395;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x66356C30;
        if ((n2 ^ n) != 1714777136) {
            int cfr_ignored_0 = (0xBCDEA966 ^ n) + -707217531;
        }
        return (class_3102 = this.thzd_2()) != null ? class_3102.field_1690 : null;
    }

    protected class_437 htl_2() {
        class_310 class_3102;
        int n = 897587378;
        n = Integer.rotateLeft(n * 339855825, 20) ^ 0xD17F2CFE;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0x68841BF9;
        if ((n2 ^ n) != 1753488377) {
            int cfr_ignored_0 = (0x5D04034B ^ n) + -77016014;
        }
        if (!yf.khdha_2()) {
            bad.sghb();
        }
        return (class_3102 = bad.hkt(this)) != null ? class_3102.field_1755 : null;
    }

    protected class_634 djh_3() {
        class_310 class_3102;
        int n = -190864863;
        int n2 = (n = Integer.rotateLeft(n * 1906584845, 6) ^ 0x228F5D9B) ^ 0x8F00033E;
        if ((n2 ^ n) != -1895824578) {
            int cfr_ignored_0 = (0x7B9FA11F ^ n) + 2062394858;
        }
        return (class_3102 = bad.ghsh_4(this)) != null ? class_3102.method_1562() : null;
    }

    protected class_636 bshkh() {
        try {
            int n = -1521450502;
            n = Integer.rotateLeft(n * -1218031851, 7) ^ 0x7ACE3FBA;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x5F34D541;
            if ((n2 ^ n) != 1597297985) {
                int cfr_ignored_0 = (0xFA6454BB ^ n) - -165444684;
            }
            if ((0x136 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_310 class_3102 = bad.sfz_4(this);
        return class_3102 != null ? class_3102.field_1761 : null;
    }

    protected class_1268 dmh_2() {
        block0: {
            int n = ghl.zthr(669918386);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x6EF56553;
            if ((n2 ^ n) == 1861576019) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x491B41E1 ^ n, 12) + -559244934;
            int cfr_ignored_1 = (int)(0x8BA9EFDC27D4EB4FL ^ (long)n ^ 0x22C8831A2DB8BA82L);
        }
        return class_1268.field_5808;
    }

    protected void dhhm_2(class_1268 class_12682) {
        class_310 class_3102;
        int n = -910158148;
        n = Integer.rotateLeft(n * -1242511705, 11) ^ 0xA8A6F8D8;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
        class_1268 class_12683 = class_12682;
        n = Integer.rotateRight((class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n, 21);
        int n2 = n ^ 0x5D29AAB1;
        if ((n2 ^ n) != 1563011761) {
            int cfr_ignored_0 = (0x94E9BC0D ^ n) + 290205891;
        }
        if ((class_3102 = this.thzd_2()) != null && class_3102.field_1724 != null && class_3102.field_1761 != null) {
            bad.sba_2(class_3102.field_1761, (class_1657)class_3102.field_1724, class_12682);
        }
    }

    protected boolean shh_10(class_1657 class_16572) {
        int n = ghl.zthr(-415384803);
        int n2 = n ^ 0xF95A6804;
        if ((n2 ^ n) != -111515644) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x1E67D319 ^ n, 6) + -1292882110) * 510120729;
            int cfr_ignored_1 = (int)(0xDCD57D2427D4EB4FL ^ (long)n ^ 0x738831A2DB8147BL);
        }
        return class_16572 != null && blq.aah_2().aqj(bad.snd_2(class_16572).getString());
    }

    protected boolean rb(class_1309 class_13092) {
        class_1657 class_16572;
        int n = 513900101;
        n = Integer.rotateLeft(n * -705344479, 12) ^ 0xB7454CF4;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 7);
        int n2 = n ^ 0xC6BA09E8;
        if ((n2 ^ n) != -960886296) {
            int cfr_ignored_0 = (0xD81B77AD ^ n) + 357914698;
        }
        if (!bad.dba_2()) {
            yf.athz_2();
        }
        return class_13092 instanceof class_1657 && bad.bld_2(this, class_16572 = (class_1657)class_13092);
    }

    protected void dky(String string) {
        int n = 827599863;
        n = Integer.rotateLeft(n * -1114567153, 22) ^ 0x65DEB5AA;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
        int n2 = n ^ 0x535829B2;
        if ((n2 ^ n) != 1398286770) {
            int cfr_ignored_0 = (0x620C0245 ^ n) - -446165113;
        }
        bkd_2.jha_4(string);
    }

    @Generated
    public bdj takh_2() {
        block0: {
            int n = 29223959;
            n = Integer.rotateLeft(n * -1173056743, 7) ^ 0x386157FB;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x38DDB75C;
            if ((n2 ^ n) == 954054492) break block0;
            int cfr_ignored_0 = (0x39605B4B ^ n) + -850318707;
        }
        return this.znl;
    }

    @Generated
    public int jdb() {
        block0: {
            int n = -1734808613;
            n = Integer.rotateLeft(n * -2145089767, 11) ^ 0x22F6A9D5;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0xFDECA96A;
            if ((n2 ^ n) == -34821782) break block0;
            int cfr_ignored_0 = (0x657442B1 ^ n) - -410563227;
        }
        return this.khthth;
    }

    @Generated
    public boolean shaf_2() {
        block0: {
            int n = -1416439151;
            n = Integer.rotateLeft(n * -207495787, 21) ^ 0x58359DBB;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
            int n2 = n ^ 0xB5BA78BB;
            if ((n2 ^ n) == -1246070597) break block0;
            int cfr_ignored_0 = (0x1E28A22A ^ n) - 275891610;
        }
        return this.rsz_4;
    }

    @Generated
    public boolean thdb_2() {
        block0: {
            int n = 219109309;
            n = Integer.rotateLeft(n * -1945115653, 16) ^ 0xBBAD16D6;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
            int n2 = n ^ 0x8253CA7C;
            if ((n2 ^ n) == -2108437892) break block0;
            int cfr_ignored_0 = (0x8F5C9DC1 ^ n) + -368273621;
        }
        return this.dshm;
    }

    @Generated
    public boolean hkha() {
        block0: {
            int n = -656416051;
            n = Integer.rotateLeft(n * 946010125, 25) ^ 0xF15C531E;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7F7369D2;
            if ((n2 ^ n) == 2138270162) break block0;
            int cfr_ignored_0 = (0xA7AC8B1F ^ n) + 1066348232;
        }
        return this.hhdh_2;
    }

    @Generated
    public void dlm(int n) {
        int n2 = 610268087;
        n2 = Integer.rotateLeft(n2 * -518929965, 14) ^ 0xC7EFA799;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 13);
        int n3 = (n2 = n ^ n2) ^ 0xF0F4AD0E;
        if ((n3 ^ n2) != -252400370) {
            int cfr_ignored_0 = (0xD4AB5EB9 ^ n2) - 1799182042;
        }
        this.khthth = n;
    }

    private static String shhkh(String string) {
        int n = ghl.zthr(-711365405);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x31BA8416;
        if ((n2 ^ n) != 834307094) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xE423E8F5 ^ n, 15) - -1531521818) * -467408651;
            int cfr_ignored_1 = (int)(0x269146C827D4EB4FL ^ (long)n ^ 0x70E0831A2DB9E0F3L);
        }
        if (string == null) {
            return string;
        }
        if (string.length() < 2) {
            return string;
        }
        if (string.charAt(0) != -875396654 - -875404945) {
            return string;
        }
        int n3 = string.charAt(1) - (0x4F07FF81 ^ 0x4F071D81);
        if (n3 < 0 || n3 > (Integer.reverse(992943741) ^ 0xBE78F423)) {
            return string;
        }
        int n4 = string.length() - 2;
        if ((n4 & 1) != 0) {
            return string;
        }
        int n5 = n4 >> 1;
        char[] cArray = new char[n5];
        for (int i = 0; i < n5; ++i) {
            int n6 = 2 + (i << 1);
            int n7 = string.charAt(n6) - (0xF3B10936 ^ 0xF3B1E936);
            int n8 = string.charAt(n6 + 1) - (Integer.reverse(1159525235) ^ 0xCECFD9A2);
            int n9 = (n7 & (Integer.reverse(1109286003) ^ 0xCE3A78BD)) << -779426544 + 779426552 | n8 & (Integer.reverse(-664891614) ^ 0x44F17AE4);
            int n10 = (n3 * (416187461 + -416187330) ^ i * (0x386BE04A ^ 0x386BE05B) ^ Integer.rotateLeft(0x1E8484A4 ^ 0x1FFF30A4, 22)) & (0x43E4DF88 ^ 0x43E42077);
            cArray[i] = n9 ^ n10;
        }
        return new String(cArray);
    }

    private static String dskh_4(String string) {
        String string2;
        int n;
        int n2 = 778435494;
        n2 = Integer.rotateLeft(n2 * 450255169, 5) ^ 0xF41C17D9;
        String string3 = string;
        n2 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n2;
        int n3 = n2 ^ 0xEB5ED4CD;
        if ((n3 ^ n2) != -346106675) {
            int cfr_ignored_0 = (0xC53B2F6B ^ n2) - 1563638315;
        }
        if ((n = (string2 = bad.shhkh(string)).indexOf(0)) >= 0) {
            return string2.substring(0, n);
        }
        return string2;
    }

    private static bdj tfm(String string, bdj bdj2) {
        String string2;
        int n;
        int n2 = -1565245632;
        n2 = Integer.rotateLeft(n2 * -342534575, 20) ^ 0x5004C5BB;
        bdj bdj3 = bdj2;
        n2 = Integer.rotateLeft((bdj3 != null ? System.identityHashCode((Object)bdj3) : 0) ^ n2, 25);
        int n3 = n2 ^ 0xE57FC643;
        if ((n3 ^ n2) != -444611005) {
            int cfr_ignored_0 = (0x47CBF903 ^ n2) + 44896696;
        }
        if ((n = (string2 = bad.shhkh(string)).indexOf(0)) >= 0) {
            int n4 = string2.length() - 1;
            if (n < n4) {
                return bdj.valueOf(string2.substring(n + 1));
            }
        } else {
            return bdj2;
        }
        return bdj2;
    }

    private static String dhzd_3(String string, int n, int n2, int n3) {
        int n4 = ghl.zthr(-1974153090);
        n4 = Integer.rotateRight(n ^ n4, 19);
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 27)) ^ 0x603D47EB;
        if ((n5 ^ n4) != 1614628843) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xEA699795 ^ n4, 16) - 1730607686) * -362178667;
            int cfr_ignored_1 = (int)(0x28DB39A827D4EB4FL ^ (long)n4 ^ 0x8E20831A2DB9FC67L);
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xFD2E54D) + dhwsh ^ Integer.reverse(n2 + i * 870862653), 18) - tbm);
        }
        return new String(cArray);
    }

    private static String adz(bad bad2) {
        block0: {
            int n = -2094960520;
            n = Integer.rotateLeft(n * -1913060725, 17) ^ 0x9099BAC3;
            bad bad3 = bad2;
            n = Integer.rotateRight((bad3 != null ? System.identityHashCode(bad3) : 0) ^ n, 27);
            int n2 = n ^ 0xAC49B6E4;
            if ((n2 ^ n) == -1404455196) break block0;
            int cfr_ignored_0 = (0x2F68C69C ^ n) - 49475606;
        }
        return ghsh_2.shwd_2(bad2);
    }

    private static void swdh() {
        int n = ghl.zthr(289672562);
        int n2 = n ^ 0xF737B62D;
        if ((n2 ^ n) != -147343827) {
            int cfr_ignored_0 = (Integer.rotateRight(0xE673BB5F ^ n, 15) - -329166916) * -428623009;
        }
        yf.athz_2();
    }

    private static boolean dhqd_2() {
        block0: {
            int n = 1685433326;
            int n2 = (n = Integer.rotateLeft(n * -117813149, 22) ^ 0xC2D58685) ^ 0x2C94CD7;
            if ((n2 ^ n) == 46746839) break block0;
            int cfr_ignored_0 = (0x66BCE739 ^ n) - -13155956;
        }
        return yf.khdha_2();
    }

    private static boolean tws_3() {
        block0: {
            int n = ghl.zthr(-989246384);
            int n2 = n ^ 0xF585A97D;
            if ((n2 ^ n) == -175789699) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x308CE52D ^ n, 9) - -445816914;
            int cfr_ignored_1 = (int)(0xF23E4B1027D4EB4FL ^ (long)n ^ 0x6B50831A2DB849ADL);
        }
        return yf.khdha_2();
    }

    private static void ttl_4() {
        int n = 1832464679;
        int n2 = (n = Integer.rotateLeft(n * -1756932221, 8) ^ 0xE8EB16B9) ^ 0xF7CD5E45;
        if ((n2 ^ n) != -137535931) {
            int cfr_ignored_0 = (0x9AF46F62 ^ n) + 82051165;
        }
        yf.athz_2();
    }

    private static boolean dghr(bad bad2) {
        block0: {
            int n = ghl.zthr(-849410058);
            bad bad3 = bad2;
            n = Integer.rotateLeft((bad3 != null ? System.identityHashCode(bad3) : 0) ^ n, 9);
            int n2 = n ^ 0x54A10F08;
            if ((n2 ^ n) == 1419841288) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x99FE08FE ^ n, 6) - -1440696835) * -1711404801;
        }
        return bad2.thlr();
    }

    private static boolean dht_3(bad bad2) {
        block0: {
            int n = ghl.zthr(-2112567412);
            bad bad3 = bad2;
            n = Integer.rotateLeft((bad3 != null ? System.identityHashCode(bad3) : 0) ^ n, 26);
            int n2 = n ^ 0x7075EBA6;
            if ((n2 ^ n) == 1886776230) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF2612C2A ^ n, 17) + 1579284561;
        }
        return bad2.thlr();
    }

    private static void syth_2(bad bad2, boolean bl, boolean bl2) {
        int n = -989818826;
        n = Integer.rotateLeft(n * 504319343, 17) ^ 0x60A2BBE8;
        bad bad3 = bad2;
        n = (bad3 != null ? System.identityHashCode(bad3) : 0) ^ n;
        int n2 = (n = Integer.rotateRight(bl ^ n, 18)) ^ 0x4CB98B2D;
        if ((n2 ^ n) != 1287228205) {
            int cfr_ignored_0 = (0x89B91B1B ^ n) + 699413790;
        }
        bad2.zhw_3(bl, bl2);
    }

    private static void dsk_3() {
        int n = ghl.zthr(-2042774334);
        int n2 = n ^ 0x25897140;
        if ((n2 ^ n) != 629764416) {
            int cfr_ignored_0 = Integer.rotateRight(0xA3B4CD82 ^ n, 7) + -683507207;
        }
        yf.athz_2();
    }

    private static void zbgh(bad bad2, boolean bl, boolean bl2) {
        int n = -228432588;
        n = Integer.rotateLeft(n * 2020256893, 9) ^ 0x401A97F6;
        bad bad3 = bad2;
        n = (bad3 != null ? System.identityHashCode(bad3) : 0) ^ n;
        int n2 = (n = Integer.rotateRight(bl2 ^ n, 27)) ^ 0xBF39F1DB;
        if ((n2 ^ n) != -1086721573) {
            int cfr_ignored_0 = (0x4D5B94EF ^ n) + 1362185146;
        }
        bad2.zhw_3(bl, bl2);
    }

    private static boolean dhjr(bad bad2) {
        block0: {
            int n = -1119835833;
            int n2 = (n = Integer.rotateLeft(n * 298833159, 21) ^ 0x8E6E0768) ^ 0x2B9AE248;
            if ((n2 ^ n) == 731570760) break block0;
            int cfr_ignored_0 = (0x96DA4B0F ^ n) - 542687544;
        }
        return bad2.khash_2();
    }

    private static void ddgh(bad bad2) {
        int n = -1927487915;
        int n2 = (n = Integer.rotateLeft(n * -2079674357, 11) ^ 0x6A5A5B24) ^ 0x5B5C9644;
        if ((n2 ^ n) != 1532794436) {
            int cfr_ignored_0 = (0xD6404811 ^ n) - 1266979253;
        }
        bad2.zsa_3();
    }

    private static Moondlc aw() {
        block0: {
            int n = -1907190197;
            int n2 = (n = Integer.rotateLeft(n * -1542884197, 20) ^ 0x7D7565B5) ^ 0xD4537C0D;
            if ((n2 ^ n) == -732726259) break block0;
            int cfr_ignored_0 = (0x5A01EA46 ^ n) - 995886273;
        }
        return Moondlc.getInstance();
    }

    private static bhth_2 dthk_2(Moondlc moondlc) {
        block0: {
            int n = -1162020721;
            int n2 = (n = Integer.rotateLeft(n * -1248206039, 10) ^ 0xC0FD64A0) ^ 0x8D36F13D;
            if ((n2 ^ n) == -1925779139) break block0;
            int cfr_ignored_0 = (0x378A09B2 ^ n) + -1545296126;
        }
        return moondlc.getNotificationManager();
    }

    private static bhth_2 thghr(Moondlc moondlc) {
        block0: {
            int n = ghl.zthr(594906161);
            Moondlc moondlc2 = moondlc;
            n = Integer.rotateLeft((moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n, 7);
            int n2 = n ^ 0xF5D41BC3;
            if ((n2 ^ n) == -170648637) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD6A197F2 ^ n, 13) + 32441737) * -694052877;
        }
        return moondlc.getNotificationManager();
    }

    private static String tmk_2(bad bad2) {
        block0: {
            int n = 1809459674;
            n = Integer.rotateLeft(n * -1408143633, 21) ^ 0xFB6B3D3E;
            bad bad3 = bad2;
            n = Integer.rotateRight((bad3 != null ? System.identityHashCode(bad3) : 0) ^ n, 13);
            int n2 = n ^ 0xA7FB9B87;
            if ((n2 ^ n) == -1476682873) break block0;
            int cfr_ignored_0 = (0xCC21B25D ^ n) + -1209361085;
        }
        return bad2.getName();
    }

    private static String slkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = ghl.zthr(582039042);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xB5C7ABCB;
            if ((n5 ^ n4) == -1245205557) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x97769DC9 ^ n4, 5) + 1538964114;
            int cfr_ignored_1 = (int)(0x55C433F427D4EB4FL ^ (long)n4 ^ 0x9A98831A2DB90659L);
        }
        return bad.dhzd_3(string, n, n2, n3);
    }

    private static class_310 ryw(bad bad2) {
        block0: {
            int n = -1732466649;
            n = Integer.rotateLeft(n * -1160724145, 3) ^ 0x48A5A48A;
            bad bad3 = bad2;
            n = Integer.rotateRight((bad3 != null ? System.identityHashCode(bad3) : 0) ^ n, 7);
            int n2 = n ^ 0x338E5EE4;
            if ((n2 ^ n) == 864968420) break block0;
            int cfr_ignored_0 = (0xAB32F6C3 ^ n) + -1360120918;
        }
        return bad2.thzd_2();
    }

    private static class_310 dhghw() {
        block0: {
            int n = 1916357528;
            int n2 = (n = Integer.rotateLeft(n * -531025085, 22) ^ 0x572039A4) ^ 0x48BFBFA2;
            if ((n2 ^ n) == 1220525986) break block0;
            int cfr_ignored_0 = (0x3A86F43A ^ n) - 1035339812;
        }
        return dl.shsw_2();
    }

    private static void sghb() {
        int n = -1519373893;
        int n2 = (n = Integer.rotateLeft(n * -1011454317, 24) ^ 0x7096B1CA) ^ 0x4BC12331;
        if ((n2 ^ n) != 1270948657) {
            int cfr_ignored_0 = (0xEEB1128A ^ n) + -1012640201;
        }
        yf.athz_2();
    }

    private static class_310 hkt(bad bad2) {
        block0: {
            int n = 87215280;
            int n2 = (n = Integer.rotateLeft(n * 1354035319, 5) ^ 0x4310FB69) ^ 0xEAF765E;
            if ((n2 ^ n) == 246380126) break block0;
            int cfr_ignored_0 = (0xB9DBAEE ^ n) - 636265937;
        }
        return bad2.thzd_2();
    }

    private static class_310 ghsh_4(bad bad2) {
        block0: {
            int n = ghl.zthr(-980474790);
            int n2 = n ^ 0xE0B37EE0;
            if ((n2 ^ n) == -525107488) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x253C5ABA ^ n, 7) + -2035508287) * 624712379;
        }
        return bad2.thzd_2();
    }

    private static class_310 sfz_4(bad bad2) {
        block0: {
            int n = 1384298344;
            int n2 = (n = Integer.rotateLeft(n * 1108106409, 8) ^ 0x5B504FC5) ^ 0xDDF4DA42;
            if ((n2 ^ n) == -571155902) break block0;
            int cfr_ignored_0 = (0x8F766D2A ^ n) + 322015270;
        }
        return bad2.thzd_2();
    }

    private static class_1269 sba_2(class_636 class_6362, class_1657 class_16572, class_1268 class_12682) {
        block0: {
            int n = 1885045938;
            n = Integer.rotateLeft(n * 582148393, 5) ^ 0x61EDFF73;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 3);
            class_1268 class_12683 = class_12682;
            n = Integer.rotateRight((class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n, 25);
            int n2 = n ^ 0xFF575918;
            if ((n2 ^ n) == -11052776) break block0;
            int cfr_ignored_0 = (0x8F0CDDAA ^ n) - -1521349033;
        }
        return class_6362.method_2919(class_16572, class_12682);
    }

    private static class_2561 snd_2(class_1657 class_16572) {
        block0: {
            int n = -1247767877;
            int n2 = (n = Integer.rotateLeft(n * 420602583, 9) ^ 0x4F7D642) ^ 0xE2E1CE9;
            if ((n2 ^ n) == 237903081) break block0;
            int cfr_ignored_0 = (0xBB8E8E52 ^ n) - -1794398985;
        }
        return class_16572.method_5477();
    }

    private static boolean dba_2() {
        block0: {
            int n = ghl.zthr(1679544788);
            int n2 = n ^ 0x231E7AFD;
            if ((n2 ^ n) == 589200125) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4705AB29 ^ n, 11) + -1643292366;
            int cfr_ignored_1 = (int)(0x85B7051427D4EB4FL ^ (long)n ^ 0xF758831A2DB8A6BFL);
        }
        return yf.khdha_2();
    }

    private static boolean bld_2(bad bad2, class_1657 class_16572) {
        block0: {
            int n = 1028070609;
            n = Integer.rotateLeft(n * -1378893289, 13) ^ 0x5F8952FD;
            bad bad3 = bad2;
            n = (bad3 != null ? System.identityHashCode(bad3) : 0) ^ n;
            int n2 = n ^ 0x30183E2D;
            if ((n2 ^ n) == 806895149) break block0;
            int cfr_ignored_0 = (0xD5F22FC ^ n) + -924827694;
        }
        return bad2.shh_10(class_16572);
    }

    private static String[] sthf_2(String string) {
        int n = 981542296;
        n = Integer.rotateLeft(n * 1599682739, 26) ^ 0x9D61E63A;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x968833CA;
        if ((n2 ^ n) != -1769458742) {
            int cfr_ignored_0 = (0xAC091652 ^ n) + -144704782;
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

    private static CallSite tjh_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1309639132;
            n3 = Integer.rotateLeft(n3 * 1632883685, 26) ^ 0x25C5FA03;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 12);
            int n4 = n3 ^ 0xA9193630;
            if ((n4 ^ n3) != -1457965520) {
                int cfr_ignored_0 = (0x18E94814 ^ n3) - -885125665;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shny ^ string.hashCode()) + (n2 + hnr) + i ^ shny, 18) + hnr);
            }
            String[] stringArray = bad.sthf_2(new String(cArray));
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

    private static String[] vpi9yc8n(String string) {
        return string.split("\u0005\u001d", -1);
    }

    private static CallSite fytql4e8g4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zb1uxxbtk7ow ^ string.hashCode() ^ n2 + puai9ob7 + i * 2031746987) + zb1uxxbtk7ow) ^ puai9ob7));
            }
            String[] stringArray = bad.vpi9yc8n(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

