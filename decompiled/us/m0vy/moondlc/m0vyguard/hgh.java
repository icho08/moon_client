/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2616
 *  net.minecraft.class_3532
 *  net.minecraft.class_638
 *  net.minecraft.class_8143
 *  org.joml.Vector2f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2616;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_8143;
import org.joml.Vector2f;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tkhn;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.dhs_5;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.wy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="DamageMarkers", category=bzw.OTHER, desc="Shows dealt damage in 3D")
public class hgh
extends bnq {
    private static final float tthd = 8.0f;
    private static final long zdt_4 = 2500L;
    private final tay hykh = new tay(this, "Size").shth_7(Float.intBitsToFloat(-1953826734 + -1284175954)).dhbs_2(Float.intBitsToFloat(2034490505 + -958651529)).rkh_3(Float.intBitsToFloat(0x753A725D ^ 0x48F6BE90)).ssd_5(1.0f);
    private final tay bzm = new tay(this, "Life Time").shth_7(Float.intBitsToFloat(1680756261 - 546852389)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1470702223) ^ 0xCBA72A15)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1453700002) ^ 0x38FA5A95)).ssd_5(Float.intBitsToFloat(-2133924548 - 1012196668));
    private final badh_2 dhl = new badh_2(this, "Self Damage").bts(true);
    private final badh_2 saj = new badh_2(this, "Friend Hits").bts(true);
    private final khd jsy = new khd(this, "Color");
    private final fy shjf = new fy(this.jsy, "Damage").rhh_3();
    private final fy zjy = new fy(this.jsy, "Custom");
    private final bzw_2 srh = new bzw_2(this, "Custom Color", this::stht_3).dhshy(byq.tkhw(Integer.rotateLeft(0x34A5FBFF ^ 0xE5B4C400, 18)));
    private final Map dhq_3 = new HashMap();
    private final Map hah_2 = new HashMap();
    private final Map tsr = new HashMap();
    private final Map dhjm = new HashMap();
    private final ArrayList dhaj = new ArrayList();
    private final bql<bthy> thsm_2 = this::rbh;
    private final bql<bksh> ztk_2 = this::zqt_2;
    private final bql<btt> ad = this::dhy;
    private final bql<bbgh> zmd_2 = this::htth_2;
    private static final int sbt = 954039775;
    private static final int khsh_2 = 1094303023;
    private static final int dtd_4 = -1302911797;
    private static final int dqq = 367730143;
    private static final int pcs98ghlfc = 2115780955;
    private static final int spbf911h64c = 142732247;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ydr6cyxxbd0;

    @Override
    public void nc() {
        int n = -1047104080;
        n = Integer.rotateLeft(n * -1519045121, 12) ^ 0x6990327D;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB97BC378;
        if ((n2 ^ n) != -1183071368) {
            int cfr_ignored_0 = (0x78EDB6C8 ^ n) + -1214335567;
        }
        this.ztj_2();
    }

    private boolean ghaw(class_1309 class_13092) {
        try {
            int n = 1411241916;
            n = Integer.rotateLeft(n * 762795307, 28) ^ 0xE5E2E187;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x25844425;
            if ((n2 ^ n) != 629425189) {
                int cfr_ignored_0 = (0x71999399 ^ n) + -241710133;
            }
            if ((0xB8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            hgh.dwa();
        }
        if (class_13092 == hgh.mc.field_1724) {
            return this.dhl.shzl();
        }
        Long l = (Long)this.hah_2.get(class_13092.method_5628());
        if (l != null && System.currentTimeMillis() - l <= (0x3E27EA6A4E9648A5L ^ 0x3E27EA6A4E964161L)) {
            return true;
        }
        Long l2 = (Long)this.tsr.get(class_13092.method_5628());
        if (l2 != null && System.currentTimeMillis() - l2 <= (0x5CB9547E2CB2F9BFL ^ 0x5CB9547E2CB2F07BL)) {
            return true;
        }
        class_1309 class_13094 = class_13092.method_6065();
        if (class_13094 == null) {
            class_13094 = class_13092.method_6124();
        }
        if (class_13094 == hgh.mc.field_1724) {
            return true;
        }
        if (this.saj.shzl() && hgh.rdh_3(this, (class_1297)class_13094)) {
            return true;
        }
        return this.saj.shzl() && hgh.rdsh(this, class_13092);
    }

    private boolean khkl(class_1309 class_13092) {
        int n = -1649800793;
        n = Integer.rotateLeft(n * -1641616129, 21) ^ 0xCD1503F3;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0xCBB320CC;
        if ((n2 ^ n) != -877453108) {
            int cfr_ignored_0 = (0x5619296B ^ n) - 999547285;
        }
        if (hgh.djq()) {
            throw null;
        }
        long l = System.currentTimeMillis();
        for (Map.Entry entry : this.dhjm.entrySet()) {
            class_1297 class_12972;
            if (l - (Long)entry.getValue() > (0x8F7D9438FB5D3648L ^ 0x8F7D9438FB5D3F8CL) || !this.std_5(class_12972 = hgh.mc.field_1687 != null ? hgh.alm(hgh.mc.field_1687, (Integer)entry.getKey()) : null) || !(class_12972.method_5858((class_1297)class_13092) <= hgh.dhwr(0xC71D75B5233D550L ^ 0x4C41D75B5233D550L))) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean std_5(class_1297 class_12972) {
        int n = 17243787;
        n = Integer.rotateLeft(n * -344926345, 15) ^ 0xC7CD8077;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xD6960234;
        if ((n2 ^ n) != -694812108) {
            int cfr_ignored_0 = (0xD7911CBF ^ n) + 1780965164;
        }
        if (!(class_12972 instanceof class_1657)) return false;
        class_1657 class_16572 = (class_1657)class_12972;
        if (!hgh.qs(hgh.dhbb(Moondlc.getInstance()), hgh.dkhh_4(class_16572).getName())) return false;
        return true;
    }

    private void bya(class_1309 class_13092, float f) {
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        int n = 0;
        int n2 = -523818359;
        n2 = Integer.rotateLeft(n2 * -1907553015, 3) ^ 0x2F18B454;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 - 1487991505;
        while (true) {
            block12: {
                block10: {
                    block21: {
                        block11: {
                            block17: {
                                block24: {
                                    block14: {
                                        block19: {
                                            block18: {
                                                block15: {
                                                    block9: {
                                                        block23: {
                                                            block13: {
                                                                block22: {
                                                                    block20: {
                                                                        block16: {
                                                                            block7: {
                                                                                block8: {
                                                                                    if ((n = n2 - n3) > -766841414) break block7;
                                                                                    if (n > -1858587176) break block8;
                                                                                    if (n == -2003116688) break block9;
                                                                                    if (n == -1906786701) break block10;
                                                                                    if (n == -1858587176) break block11;
                                                                                    break block12;
                                                                                }
                                                                                if (n == -1401758371) break block13;
                                                                                if (n == -869116373) break block14;
                                                                                int cfr_ignored_0 = Integer.rotateLeft(0x5FD69100 ^ n2, 14) + -1621545413;
                                                                                if (n == -766841414) break block15;
                                                                                break block12;
                                                                            }
                                                                            if (n > 672353940) break block16;
                                                                            if (n == -647707120) break block17;
                                                                            if (n == 620090552) break block18;
                                                                            int cfr_ignored_1 = (Integer.rotateRight(0xB457F1BA ^ n2, 9) + -620501823) * -1269304901;
                                                                            if (n == 672353940) break block19;
                                                                            break block12;
                                                                        }
                                                                        if (n > 1446282329) break block20;
                                                                        if (n == 1331415349) break block21;
                                                                        if (n == 1446282329) break block22;
                                                                        int cfr_ignored_2 = Integer.rotateRight(0x70768AAB ^ n2, 17) + -1564972560;
                                                                        break block12;
                                                                    }
                                                                    if (n == 1487991505) break block23;
                                                                    if (n == 1537123345) break block24;
                                                                    int cfr_ignored_3 = (Integer.rotateRight(0x97E3AB3 ^ n2, 4) + 715569896) * 159267507;
                                                                    break block12;
                                                                }
                                                                int cfr_ignored_4 = Integer.rotateRight(0xC367FAEE ^ n2, 11) - -1376452083;
                                                                throw null;
                                                            }
                                                            int cfr_ignored_5 = Integer.rotateRight(0x8531F38B ^ n2, 3) + 627711248;
                                                            String string = hgh.znt(BigDecimal.valueOf(f), 1, RoundingMode.HALF_UP).toPlainString();
                                                            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
                                                            d = class_13092.method_23317() + threadLocalRandom.nextDouble(hgh.dmd_2(0x174100FF913BB4EEL ^ 0xA89100FF913BB4EEL), Double.longBitsToDouble(0x6EAE8E0ABFD11E02L ^ 0x517E8E0ABFD11E02L));
                                                            d2 = hgh.zsht_3((class_1309)class_13092).field_1322 + (double)class_13092.method_17682() * Double.longBitsToDouble(0xA2A792900FF623DL ^ 0x35C9AE233D8FC1EAL) + threadLocalRandom.nextDouble(Double.longBitsToDouble(0xEAFE9EDCAFD05660L ^ 0x555707453649CFFAL), Double.longBitsToDouble(0x30125D8A3D44DCA7L ^ 0xFACE5DBD6C1C21FL));
                                                            d3 = class_13092.method_23321() + threadLocalRandom.nextDouble(Double.longBitsToDouble(0xB4EAA57659B24CA8L ^ 0xB3AA57659B24CA8L), Double.longBitsToDouble(0x76889239A0AE21DL ^ 0x38B889239A0AE21DL));
                                                            this.dhaj.add(new wy(class_13092, string, f, new class_243(d, d2, d3), System.currentTimeMillis(), Math.round(hgh.taa_6(this.bzm))));
                                                            return;
                                                        }
                                                        int cfr_ignored_6 = Integer.rotateRight(0xD4DB66A6 ^ n2, 13) - -890303147;
                                                        if (!hgh.ths_4()) {
                                                            n3 = n2 - 1199904606 ^ 0x9E8B6714 ^ 0x9E8B6714;
                                                            int cfr_ignored_7 = Integer.rotateRight(0x944569C3 ^ n2, 5) + -121279016;
                                                            n3 = Integer.reverse(Integer.reverse(n2 - -1401758371));
                                                            n += 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_8 = (int)(0xFC81FAAE28DC09CL ^ (long)n2 ^ 0xC22509A87A1FB241L);
                                                        n3 = (int)((long)(n2 - 1446282329) ^ 0x41D954BD081C2FAEL ^ 0x41D954BD081C2FAEL);
                                                        n += 2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_9 = Integer.rotateRight(0x7C5A3E46 ^ n2, 18) - 323692981;
                                                    n3 = Integer.reverse(Integer.reverse(n2 - -604212837));
                                                    int cfr_ignored_10 = (Integer.rotateRight(0xB914831E ^ n2, 10) - 1842970589) * -1189838049;
                                                    try {
                                                        n += 5;
                                                        n3 = Integer.reverse(Integer.reverse(n2 - 1487991505));
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n3 = n2 - 1487991505;
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_11 = Integer.rotateLeft(0xAF79378D ^ n2, 8) - 1141594446;
                                                int cfr_ignored_12 = (int)(0x6DCB99B027D4EB4FL ^ (long)n2 ^ 0xCE10831A2DB97646L);
                                                n3 = Integer.reverse(Integer.reverse(n2 - -1034891738));
                                                int cfr_ignored_13 = Integer.rotateLeft(0x777AB3CC ^ n2, 17) - 2084136175;
                                                n3 = n2 - 1487991505 + -1564056745 - -1564056745;
                                                int cfr_ignored_14 = Integer.rotateRight(0x88EEBFCB ^ n2, 4) + -1723410224;
                                                n += 2;
                                                continue;
                                            }
                                            int cfr_ignored_15 = (Integer.rotateRight(0x34497BBE ^ n2, 9) - 1497602877) * 877231039;
                                            n3 = (int)((long)(n2 - 1487991505) ^ 0x8501F30AA33B4186L ^ 0x8501F30AA33B4186L);
                                            int cfr_ignored_16 = (Integer.rotateLeft(0x84515F4 ^ n2, 4) - 79382471) * 138745333;
                                            n -= 5;
                                            continue;
                                        }
                                        int cfr_ignored_17 = Integer.rotateRight(0xAE1AD867 ^ n2, 8) - 429773748;
                                        n3 = Integer.reverse(Integer.reverse(n2 - 1128175427));
                                        int cfr_ignored_18 = (Integer.rotateRight(0x93DF3C32 ^ n2, 5) + -328865463) * -1814086605;
                                        n3 = Integer.reverse(Integer.reverse(n2 - 1487991505));
                                        continue;
                                    }
                                    int cfr_ignored_19 = Integer.rotateLeft(0x725748E5 ^ n2, 17) - -588287242;
                                    int cfr_ignored_20 = (int)(0xB0E5E6D827D4EB4FL ^ (long)n2 ^ 0x30C0831A2DB8CC1AL);
                                    n3 = n2 - 1487991505;
                                    continue;
                                }
                                int cfr_ignored_21 = Integer.rotateLeft(0xB7EA3EA5 ^ n2, 9) - 1237005622;
                                int cfr_ignored_22 = (int)(0x7558909827D4EB4FL ^ (long)n2 ^ 0xDC40831A2DB94760L);
                                try {
                                    ++n;
                                    if ((0x86519C5F7F8ACE51L ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    n3 = n2 - 1487991505;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    n3 = (int)((long)(n2 - 1487991505) ^ 0x6F6622D7FBAE537CL ^ 0x6F6622D7FBAE537CL);
                                }
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_23 = (Integer.rotateRight(0xCD119EBE ^ n2, 12) - -645932995) * -854483265;
                            n3 = (int)((long)(n2 - 1779672751) ^ 0x103621BD57B59324L ^ 0x103621BD57B59324L);
                            int cfr_ignored_24 = (Integer.rotateRight(0xF8C85852 ^ n2, 18) + 614486313) * -121087917;
                            n3 = (int)((long)(n2 - 1487991505) ^ 0x6144C4B84461969L ^ 0x6144C4B84461969L);
                            --n;
                            continue;
                        }
                        int cfr_ignored_25 = Integer.rotateLeft(0x1447A1CD ^ n2, 5) - 2030712590;
                        int cfr_ignored_26 = (int)(0xD6F50FF027D4EB4FL ^ (long)n2 ^ 0xE290831A2DB8003BL);
                        n3 = (int)((long)(n2 - -1413032494) ^ 0xAC6BE31AF2A840A7L ^ 0xAC6BE31AF2A840A7L);
                        int cfr_ignored_27 = (Integer.rotateRight(0xDB07EC5B ^ n2, 14) + -1974256064) * -620237733;
                        n3 = n2 - 1487991505;
                        int cfr_ignored_28 = (Integer.rotateRight(0xA2EAC93B ^ n2, 7) + -1093927584) * -1561671365;
                        n -= 4;
                        continue;
                    }
                    int cfr_ignored_29 = (Integer.rotateRight(0xA7BF4876 ^ n2, 7) - 1418159493) * -1480636297;
                    int cfr_ignored_30 = (int)(0x2FE42B1084614AC2L ^ (long)n2 ^ 0xAB51C4716EA3F219L);
                    n3 = n2 - 1870882258 + 78256371 - 78256371;
                    int cfr_ignored_31 = (int)(0x6FC18F417BB55ABAL ^ (long)n2 ^ 0xE3F23BD94E537252L);
                    n3 = (int)((long)(n2 - 1487991505) ^ 0x6BD8589D073A93FL ^ 0x6BD8589D073A93FL);
                    ++n;
                    continue;
                }
                int cfr_ignored_32 = (Integer.rotateLeft(0xE295E81D ^ n2, 15) - 1954855614) * -493492195;
                int cfr_ignored_33 = (int)(0x2027462027D4EB4FL ^ (long)n2 ^ 0x7130831A2DB9ED9FL);
                int cfr_ignored_34 = (int)(0x50D4C620581E2CD3L ^ (long)n2 ^ 0x71307C8FA2810C78L);
                n3 = Integer.reverse(Integer.reverse(n2 - -2067373837));
                int cfr_ignored_35 = (int)(0x391F898EAE9787EAL ^ (long)n2 ^ 0xEE6D919CF4F3DFEEL);
                n3 = n2 - 1487991505 ^ 0x9E776531 ^ 0x9E776531;
                n += 4;
                continue;
            }
            int cfr_ignored_36 = Integer.rotateLeft(0x8C4EAFA9 ^ n2, 4) + 31777970;
            int cfr_ignored_37 = (int)(0x4EFC019427D4EB4FL ^ (long)n2 ^ 0xFE58831A2DB93029L);
            n3 = n2 - 1487991505 + -2005505687 - -2005505687;
        }
    }

    /*
     * Unable to fully structure code
     */
    private Color dhdd_2(float var1_1) {
        var2_2 = null;
        var5_3 = 0;
        var3_4 = -922982186;
        var3_4 = Integer.rotateLeft(var3_4 * 1653606611, 8) ^ 796712998;
        var3_4 = Float.floatToIntBits(var1_1) ^ var3_4;
        var4_5 = (int)((long)(var3_4 ^ 1893302497) ^ -5159334373191242327L ^ -5159334373191242327L);
        while (true) {
            block78: {
                block75: {
                    block72: {
                        block74: {
                            block83: {
                                block79: {
                                    block89: {
                                        block92: {
                                            block84: {
                                                block86: {
                                                    block71: {
                                                        block81: {
                                                            block82: {
                                                                block76: {
                                                                    block90: {
                                                                        block91: {
                                                                            block94: {
                                                                                block77: {
                                                                                    block88: {
                                                                                        block80: {
                                                                                            block93: {
                                                                                                block85: {
                                                                                                    block70: {
                                                                                                        block87: {
                                                                                                            block73: {
                                                                                                                var5_3 = var4_5 ^ var3_4;
                                                                                                                switch (var5_3 & 15) {
                                                                                                                    case 0: {
                                                                                                                        if (var5_3 != 1253381680) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block70;
                                                                                                                    }
                                                                                                                    case 1: {
                                                                                                                        if (var5_3 == 451612769) break block71;
                                                                                                                        if (var5_3 == 1153720289) break block72;
                                                                                                                        if (var5_3 == 1893302497) break block73;
                                                                                                                        if (var5_3 != -1934256079) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block74;
                                                                                                                    }
                                                                                                                    case 2: {
                                                                                                                        if (var5_3 != -66706014) {
                                                                                                                            if (var5_3 == -756521902) break;
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block75;
                                                                                                                    }
                                                                                                                    case 3: {
                                                                                                                        if (var5_3 != 2075773171) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block76;
                                                                                                                    }
                                                                                                                    case 4: {
                                                                                                                        if (var5_3 != -2049129868) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block77;
                                                                                                                    }
                                                                                                                    case 5: {
                                                                                                                        if (var5_3 == 1825840517) break block78;
                                                                                                                        if (var5_3 != 134384597) {
                                                                                                                            (Integer.rotateLeft(501091481 ^ var3_4, 6) + -1572788798) * 501091481;
                                                                                                                            (int)(-2347322479840269489L ^ (long)var3_4 ^ -5172240023575588088L);
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block79;
                                                                                                                    }
                                                                                                                    case 6: {
                                                                                                                        if (var5_3 == -357933434) break block80;
                                                                                                                        if (var5_3 != -481189434) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block81;
                                                                                                                    }
                                                                                                                    case 8: {
                                                                                                                        if (var5_3 == -217255112) break block82;
                                                                                                                        if (var5_3 != -1789359512) {
                                                                                                                            Integer.rotateLeft(-1652858880 ^ var3_4, 6) + 374226747;
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block83;
                                                                                                                    }
                                                                                                                    case 9: {
                                                                                                                        if (var5_3 != 128883577) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block84;
                                                                                                                    }
                                                                                                                    case 11: {
                                                                                                                        if (var5_3 != 726867723) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block85;
                                                                                                                    }
                                                                                                                    case 12: {
                                                                                                                        if (var5_3 != 1233086252) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block86;
                                                                                                                    }
                                                                                                                    case 13: {
                                                                                                                        if (var5_3 == -733152019) break block87;
                                                                                                                        if (var5_3 == -1150517827) break block88;
                                                                                                                        if (var5_3 != 206840221) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block89;
                                                                                                                    }
                                                                                                                    case 14: {
                                                                                                                        if (var5_3 != -1989015762) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block90;
                                                                                                                    }
                                                                                                                    case 15: {
                                                                                                                        if (var5_3 == -1478334401) break block91;
                                                                                                                        if (var5_3 == 909426879) break block92;
                                                                                                                        (Integer.rotateLeft(-578979976 ^ var3_4, 14) + -695265597) * -578979975;
                                                                                                                        if (var5_3 == -1825535025) break block93;
                                                                                                                        if (var5_3 != 450580863) {
                                                                                                                            ** break;
                                                                                                                        }
                                                                                                                        break block94;
                                                                                                                    }
                                                                                                                }
                                                                                                                Integer.rotateLeft(-319248915 ^ var3_4, 16) - -1233537298;
                                                                                                                (int)(3335491462670641999L ^ (long)var3_4 ^ -1526576125219049147L);
                                                                                                                if (!(var1_1 >= 1.0f)) {
                                                                                                                    (int)(-8460607635752068089L ^ (long)var3_4 ^ 4119705860918786298L);
                                                                                                                    var4_5 = var3_4 ^ -1478334401 ^ -736188056 ^ -736188056;
                                                                                                                    var5_3 -= 5;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                try {
                                                                                                                    ++var5_3;
                                                                                                                    if ((-5965018151059840337L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                                        throw new UnsupportedOperationException();
                                                                                                                    }
                                                                                                                    var4_5 = (var3_4 ^ 450580863) + 1068070392 - 1068070392;
                                                                                                                }
                                                                                                                catch (UnsupportedOperationException v0) {
                                                                                                                    var4_5 = var3_4 ^ 450580863;
                                                                                                                }
                                                                                                                var5_3 -= 3;
                                                                                                                continue;
                                                                                                            }
                                                                                                            (Integer.rotateLeft(1864235741 ^ var3_4, 16) - 2029977598) * 1864235741;
                                                                                                            (int)(-5931428862505981105L ^ (long)var3_4 ^ 6102521643546506895L);
                                                                                                            if (hgh.ads_2()) {
                                                                                                                var4_5 = var3_4 ^ -357933434 ^ -1618090074 ^ -1618090074;
                                                                                                                continue;
                                                                                                            }
                                                                                                            var4_5 = var3_4 ^ 1253381680;
                                                                                                            Integer.rotateLeft(-1862781020 ^ var3_4, 5) - -1838392297;
                                                                                                            continue;
                                                                                                        }
                                                                                                        Integer.rotateRight(1656093926 ^ var3_4, 15) - -127451371;
                                                                                                        var2_2 = new Color(hgh.tshw(this.srh).rk(), true);
                                                                                                        var4_5 = var3_4 ^ 1825840517 ^ 1379130974 ^ 1379130974;
                                                                                                        (Integer.rotateLeft(1173350101 ^ var3_4, 11) - 2087359238) * 1173350101;
                                                                                                        (int)(-8692711543817311409L ^ (long)var3_4 ^ 7827400300829385579L);
                                                                                                        var5_3 += 4;
                                                                                                        continue;
                                                                                                    }
                                                                                                    Integer.rotateRight(1059455686 ^ var3_4, 10) - -1443367627;
                                                                                                    yf.athz_2();
                                                                                                    try {
                                                                                                        --var5_3;
                                                                                                        var4_5 = (var3_4 ^ -357933434) + 1193259079 - 1193259079;
                                                                                                    }
                                                                                                    catch (ArithmeticException v1) {
                                                                                                        var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ -357933434));
                                                                                                    }
                                                                                                    ++var5_3;
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateLeft(-1108421971 ^ var3_4, 10) - 71901742;
                                                                                                (int)(9177347099259628367L ^ (long)var3_4 ^ 310892522748072809L);
                                                                                                yf.athz_2();
                                                                                                try {
                                                                                                    var5_3 += 2;
                                                                                                    if ((-7947394407154259971L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                        throw new IllegalArgumentException();
                                                                                                    }
                                                                                                    var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ -357933434));
                                                                                                }
                                                                                                catch (IllegalArgumentException v2) {
                                                                                                    var4_5 = (int)((long)(var3_4 ^ -357933434) ^ 4552419315839379753L ^ 4552419315839379753L);
                                                                                                }
                                                                                                var5_3 -= 4;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateLeft(1342948385 ^ var3_4, 13) + -1245028550;
                                                                                            (int)(-7874145804320707761L ^ (long)var3_4 ^ 2974771702337669283L);
                                                                                            if (var1_1 >= Float.intBitsToFloat(Integer.reverse(-312305217) ^ -1109834057)) {
                                                                                                var4_5 = (var3_4 ^ 668919089) + -1093776924 - -1093776924;
                                                                                                (Integer.rotateLeft(-804665412 ^ var3_4, 13) - 898420479) * -804665411;
                                                                                                var4_5 = var3_4 ^ -2049129868 ^ -1614019331 ^ -1614019331;
                                                                                                var5_3 += 5;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                var5_3 += 3;
                                                                                                var4_5 = var3_4 ^ -756521902 ^ 1399514582 ^ 1399514582;
                                                                                            }
                                                                                            catch (UnsupportedOperationException v3) {
                                                                                                var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ -756521902));
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateLeft(-565037332 ^ var3_4, 14) - -263043633;
                                                                                        if (!this.zjy.shghkh()) {
                                                                                            (int)(-34849515002085290L ^ (long)var3_4 ^ -7176143119723113767L);
                                                                                            var4_5 = (int)((long)(var3_4 ^ -2129138645) ^ -2171031470045784158L ^ -2171031470045784158L);
                                                                                            (int)(-7014778378199105726L ^ (long)var3_4 ^ -214213452298547044L);
                                                                                            var4_5 = (int)((long)(var3_4 ^ -1150517827) ^ 7568964247593486712L ^ 7568964247593486712L);
                                                                                            ++var5_3;
                                                                                            continue;
                                                                                        }
                                                                                        var4_5 = (int)((long)(var3_4 ^ -733152019) ^ -7257690247846004823L ^ -7257690247846004823L);
                                                                                        var5_3 += 5;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateRight(-1990974762 ^ var3_4, 4) - -1517431003) * -1990974761;
                                                                                    if (!(var1_1 >= Float.intBitsToFloat(Integer.reverse(-876621669) ^ -1716781613))) {
                                                                                        try {
                                                                                            var4_5 = (int)((long)(var3_4 ^ -1825535025) ^ 2288750297669628734L ^ 2288750297669628734L);
                                                                                        }
                                                                                        catch (NoSuchElementException v4) {
                                                                                            var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ -1825535025));
                                                                                        }
                                                                                        var5_3 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    var4_5 = var3_4 ^ -390693431;
                                                                                    Integer.rotateRight(-930721493 ^ var3_4, 12) + 1285649264;
                                                                                    var4_5 = var3_4 ^ -1989015762;
                                                                                    var5_3 += 2;
                                                                                    continue;
                                                                                }
                                                                                Integer.rotateRight(424084299 ^ var3_4, 6) + 334955856;
                                                                                var2_2 = new Color(812130456 + -812152472, true);
                                                                                try {
                                                                                    var5_3 -= 4;
                                                                                    var4_5 = (var3_4 ^ 1825840517) + 1742871919 - 1742871919;
                                                                                }
                                                                                catch (UnsupportedOperationException v5) {
                                                                                    var4_5 = (int)((long)(var3_4 ^ 1825840517) ^ -5345741035515732637L ^ -5345741035515732637L);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(-1926382304 ^ var3_4, 4) + 484935195;
                                                                            var2_2 = new Color(787019168 + -787019339, true);
                                                                            try {
                                                                                var5_3 += 5;
                                                                                if ((-1635180190420812773L ^ (long)var3_4 | 1L) == 0L) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                var4_5 = var3_4 ^ 1825840517;
                                                                            }
                                                                            catch (IllegalStateException v6) {
                                                                                var4_5 = (int)((long)(var3_4 ^ 1825840517) ^ 1366835887384159142L ^ 1366835887384159142L);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        Integer.rotateLeft(-1492568796 ^ var3_4, 7) - 1048252055;
                                                                        var2_2 = new Color(774060856 + -785202147, true);
                                                                        var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ -2047088301));
                                                                        Integer.rotateRight(-1440146237 ^ var3_4, 8) + -1621615912;
                                                                        var4_5 = var3_4 ^ 1825840517 ^ -1446138065 ^ -1446138065;
                                                                        ++var5_3;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateLeft(-366357027 ^ var3_4, 16) - 1601078526) * -366357027;
                                                                    (int)(2926068585578425167L ^ (long)var3_4 ^ 770259684739906791L);
                                                                    var2_2 = new Color(Integer.reverse(1100437598) ^ -2048545338, true);
                                                                    try {
                                                                        var5_3 -= 5;
                                                                        if ((4600449790915002429L ^ (long)var3_4 | 1L) == 0L) {
                                                                            throw new UnsupportedOperationException();
                                                                        }
                                                                        var4_5 = var3_4 ^ 1825840517 ^ 1241292206 ^ 1241292206;
                                                                    }
                                                                    catch (UnsupportedOperationException v7) {
                                                                        var4_5 = var3_4 ^ 1825840517;
                                                                    }
                                                                    var5_3 += 2;
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(518162446 ^ var3_4, 6) - -1043588883;
                                                                var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ -671577182));
                                                                (Integer.rotateLeft(903897661 ^ var3_4, 9) - -1970699106) * 903897661;
                                                                (int)(-625213097210746033L ^ (long)var3_4 ^ 7309486343681753972L);
                                                                try {
                                                                    var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 1893302497));
                                                                }
                                                                catch (IllegalArgumentException v8) {
                                                                    var4_5 = var3_4 ^ 1893302497;
                                                                }
                                                                var5_3 += 5;
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(274328982 ^ var3_4, 5) - -12491675) * 274328983;
                                                            (int)(866372899417207870L ^ (long)var3_4 ^ 1040170025624516058L);
                                                            var4_5 = var3_4 ^ 1041036654;
                                                            (int)(-1963317769494529720L ^ (long)var3_4 ^ 3799028805473297488L);
                                                            var4_5 = (var3_4 ^ 1893302497) + -602609141 - -602609141;
                                                            var5_3 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1021635995 ^ var3_4, 11) - -1532700298;
                                                        (int)(119833951913438031L ^ (long)var3_4 ^ -8808896722677158270L);
                                                        var4_5 = (var3_4 ^ 1063031119) + 1666329700 - 1666329700;
                                                        Integer.rotateRight(-1323869658 ^ var3_4, 9) - 1982958037;
                                                        try {
                                                            var4_5 = var3_4 ^ 1893302497 ^ 1890525981 ^ 1890525981;
                                                        }
                                                        catch (UnsupportedOperationException v9) {
                                                            var4_5 = var3_4 ^ 1893302497;
                                                        }
                                                        var5_3 -= 4;
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(1524731230 ^ var3_4, 14) - 95272349) * 1524731231;
                                                    try {
                                                        ++var5_3;
                                                        var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 1893302497));
                                                    }
                                                    catch (NoSuchElementException v10) {
                                                        var4_5 = (int)((long)(var3_4 ^ 1893302497) ^ -4528380336691613960L ^ -4528380336691613960L);
                                                    }
                                                    continue;
                                                }
                                                Integer.rotateLeft(1844436104 ^ var3_4, 16) + 1416188851;
                                                var4_5 = var3_4 ^ -1349091889 ^ 1714522615 ^ 1714522615;
                                                (Integer.rotateLeft(1489896089 ^ var3_4, 14) + -984617022) * 1489896089;
                                                (int)(-7314781873713648817L ^ (long)var3_4 ^ -6613391904334112472L);
                                                var4_5 = (var3_4 ^ -519657774) + 1416221891 - 1416221891;
                                                Integer.rotateLeft(151586829 ^ var3_4, 4) - 477468878;
                                                (int)(-3766233937608381617L ^ (long)var3_4 ^ -5687902180909499738L);
                                                var4_5 = var3_4 ^ 1893302497;
                                                var5_3 -= 3;
                                                continue;
                                            }
                                            Integer.rotateRight(1431018251 ^ var3_4, 13) + 1485137296;
                                            (int)(-5477363464920171136L ^ (long)var3_4 ^ 41961512656882217L);
                                            var4_5 = (var3_4 ^ 1355657015) + -905695628 - -905695628;
                                            (int)(5545899944883381240L ^ (long)var3_4 ^ 21200715508036668L);
                                            var4_5 = (int)((long)(var3_4 ^ 1893302497) ^ -7456917645492285981L ^ -7456917645492285981L);
                                            continue;
                                        }
                                        (Integer.rotateRight(611086839 ^ var3_4, 7) - 1837067300) * 611086839;
                                        try {
                                            --var5_3;
                                            if ((-7234985252895679983L ^ (long)var3_4 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            var4_5 = var3_4 ^ 1893302497;
                                        }
                                        catch (UnsupportedOperationException v11) {
                                            var4_5 = var3_4 ^ 1893302497;
                                        }
                                        var5_3 += 3;
                                        continue;
                                    }
                                    (Integer.rotateRight(1604653430 ^ var3_4, 14) - -1722106747) * 1604653431;
                                    var4_5 = var3_4 ^ 821648504 ^ -1687979492 ^ -1687979492;
                                    Integer.rotateLeft(1180593345 ^ var3_4, 11) + -1983067494;
                                    (int)(-8868499177943536817L ^ (long)var3_4 ^ 8685336029843465224L);
                                    var4_5 = var3_4 ^ 1893302497;
                                    var5_3 -= 4;
                                    continue;
                                }
                                (Integer.rotateLeft(-1334593963 ^ var3_4, 9) - 1650504582) * -1334593963;
                                (int)(8268917226452872015L ^ (long)var3_4 ^ -3629757151201114029L);
                                (int)(-8823951228290365829L ^ (long)var3_4 ^ -916719533487511865L);
                                var4_5 = var3_4 ^ 1893302497 ^ -1723595133 ^ -1723595133;
                                var5_3 -= 2;
                                continue;
                            }
                            (Integer.rotateRight(1829233019 ^ var3_4, 16) + 944893216) * 1829233019;
                            (int)(7516766673170986969L ^ (long)var3_4 ^ 3142851733761654128L);
                            var4_5 = var3_4 ^ 1893302497 ^ -156965869 ^ -156965869;
                            continue;
                        }
                        Integer.rotateRight(-116085561 ^ var3_4, 18) - 769559380;
                        try {
                            var5_3 += 3;
                            var4_5 = (int)((long)(var3_4 ^ 1893302497) ^ 832912575466016769L ^ 832912575466016769L);
                        }
                        catch (IllegalStateException v12) {
                            var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 1893302497));
                        }
                        var5_3 += 5;
                        continue;
                    }
                    Integer.rotateRight(-1484779637 ^ var3_4, 7) + 1289715984;
                    var4_5 = var3_4 ^ -214373725 ^ -1189854369 ^ -1189854369;
                    (Integer.rotateRight(1602859507 ^ var3_4, 14) + -1777718360) * 1602859507;
                    try {
                        var5_3 += 3;
                        if ((-6414774142386869885L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = var3_4 ^ 1893302497 ^ 1112702993 ^ 1112702993;
                    }
                    catch (ArithmeticException v13) {
                        var4_5 = var3_4 ^ 1893302497 ^ 121358177 ^ 121358177;
                    }
                    var5_3 -= 3;
                    continue;
                }
                Integer.rotateLeft(1158681964 ^ var3_4, 11) - 1632646991;
                var4_5 = var3_4 ^ -2123587744;
                Integer.rotateLeft(-2136399227 ^ var3_4, 3) - -1730622122;
                (int)(4763555753444567887L ^ (long)var3_4 ^ -2017468484602484250L);
                var4_5 = var3_4 ^ 1893302497 ^ 1940802533 ^ 1940802533;
                var5_3 += 4;
                continue;
            }
            return var2_2;
lbl416:
            // 15 sources

            Integer.rotateLeft(-1314204728 ^ var3_4, 9) + -2012396429;
            var4_5 = (int)((long)(var3_4 ^ 1893302497) ^ 8173975491664196119L ^ 8173975491664196119L);
        }
    }

    private Color shzz_3(Color color, int n) {
        try {
            int n2 = -710921877;
            n2 = Integer.rotateLeft(n2 * -1873568475, 4) ^ 0xCB064EE3;
            Color color2 = color;
            n2 = (color2 != null ? System.identityHashCode(color2) : 0) ^ n2;
            n2 = Integer.rotateRight(n ^ n2, 10);
            int n3 = n2 ^ 0x6C49F88D;
            if ((n3 ^ n2) != 1816787085) {
                int cfr_ignored_0 = (0xB9E9C9E6 ^ n2) - -1437998135;
            }
            if ((0x116 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!hgh.zld_2()) {
            hgh.dhys();
            throw null;
        }
        return new Color(hgh.shhb_2(color), color.getGreen(), color.getBlue(), class_3532.method_15340((int)n, (int)0, (int)(Integer.reverse(380006858) ^ 0x538E6597)));
    }

    private void ztj_2() {
        try {
            int n = -2071558080;
            n = Integer.rotateLeft(n * -941489187, 24) ^ 0xAB98A0C4;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD85342E0;
            if ((n2 ^ n) != -665632032) {
                int cfr_ignored_0 = (0x5CD5CAA0 ^ n) + 138025137;
            }
            if ((0x67 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.dhaj.clear();
        this.dhq_3.clear();
        this.hah_2.clear();
        this.tsr.clear();
        this.dhjm.clear();
    }

    private void htth_2(bbgh bbgh2) {
        int n = -1732270571;
        n = Integer.rotateLeft(n * -857980697, 23) ^ 0xD8086545;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0x9FFFDF16;
        if ((n2 ^ n) != -1610621162) {
            int cfr_ignored_0 = (0x7407903 ^ n) - -1805873809;
        }
        if (hgh.mc.field_1724 == null || hgh.mc.field_1687 == null || this.dhaj.isEmpty()) {
            return;
        }
        long l = System.currentTimeMillis();
        Iterator iterator = this.dhaj.iterator();
        while (iterator.hasNext()) {
            wy wy2 = (wy)iterator.next();
            float f = class_3532.method_15363((float)((float)(l - wy2.shdkh) / (float)wy2.dhhm_2), (float)0.0f, (float)1.0f);
            if (f >= 1.0f) {
                iterator.remove();
                continue;
            }
            class_243 class_2432 = wy2.rsm_2.method_1031(0.0, (double)f * Double.longBitsToDouble(0x49E0A787C8824062L ^ 0x76013E1E511BD9F8L), 0.0);
            Vector2f vector2f = dhs_5.tdhkh(class_2432);
            if (vector2f.x == Float.intBitsToFloat(Integer.rotateLeft(0x4C29084E ^ 0x93F6F7B1, 2)) || vector2f.y == Float.intBitsToFloat(1141894191 + 997200848)) continue;
            float f2 = 1.0f - f;
            float f3 = this.hykh.thw_5() * (1.0f + (1.0f - f) * Float.intBitsToFloat(218788819 - -820727484));
            float f4 = Float.intBitsToFloat(439346434 - -651172606) * f3;
            Color color = this.shzz_3(this.dhdd_2(wy2.shshb), Math.round(Float.intBitsToFloat(0x610DB3F5 ^ 0x2272B3F5) * f2));
            float f5 = brz_2.thtkh_2.shdf_2(wy2.shlz_2, f4);
            bbgh2.dtn().method_51448().method_22903();
            bbgh2.dtn().method_51448().method_46416(vector2f.x, vector2f.y, 0.0f);
            brz_2.thtkh_2.zskh_4(bbgh2.dtn().method_51448(), wy2.shlz_2, -f5 / 2.0f, 0.0f, f4, color, 0.0f);
            bbgh2.dtn().method_51448().method_22909();
        }
    }

    private void dhy(btt btt2) {
        try {
            int n = -524963049;
            n = Integer.rotateLeft(n * 255594183, 24) ^ 0x36A031EF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xE331E050;
            if ((n2 ^ n) != -483270576) {
                int cfr_ignored_0 = (0x3845347 ^ n) + 1112447952;
            }
            if ((0x9A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (hgh.mc.field_1724 == null || hgh.mc.field_1687 == null) {
            this.ztj_2();
            return;
        }
        long l = System.currentTimeMillis();
        this.hah_2.entrySet().removeIf(arg_0 -> hgh.khqd_2(l, arg_0));
        this.tsr.entrySet().removeIf(arg_0 -> hgh.shdh_6(l, arg_0));
        this.dhjm.entrySet().removeIf(arg_0 -> hgh.jdha_2(l, arg_0));
        for (class_1297 class_12972 : hgh.mc.field_1687.method_18112()) {
            float f;
            if (!(class_12972 instanceof class_1309)) continue;
            class_1309 class_13092 = (class_1309)class_12972;
            if (class_12972.method_5858((class_1297)hgh.mc.field_1724) > Double.longBitsToDouble(0x289D75A7F8C19D1FL ^ 0x68FF75A7F8C19D1FL)) continue;
            int n = class_12972.method_5628();
            float f2 = class_13092.method_6032();
            Float f3 = this.dhq_3.put(n, Float.valueOf(f2));
            if (f3 == null || (f = f3.floatValue() - f2) <= 0.0f || !this.ghaw(class_13092)) continue;
            this.bya(class_13092, f);
        }
        this.dhaj.removeIf(arg_0 -> hgh.jba_2(l, arg_0));
    }

    private static boolean jba_2(long l, wy wy2) {
        int n = -88215492;
        n = Integer.rotateLeft(n * -473537429, 7) ^ 0xC3EA118D;
        int n2 = (n = Integer.rotateLeft((int)l ^ n, 9)) ^ 0x54BB378;
        if ((n2 ^ n) != 88847224) {
            int cfr_ignored_0 = (0xFFF64344 ^ n) + 1704528322;
        }
        return l - wy2.shdkh >= wy2.dhhm_2 || wy2.yy.method_31481();
    }

    private static boolean jdha_2(long l, Map.Entry entry) {
        int n = -1095053940;
        n = Integer.rotateLeft(n * 552257069, 22) ^ 0xAA57304;
        int n2 = (n = Integer.rotateRight((int)l ^ n, 10)) ^ 0xB879A9FA;
        if ((n2 ^ n) != -1199986182) {
            int cfr_ignored_0 = (0x6C36476 ^ n) + -532628829;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return l - (Long)entry.getValue() > (0x903A2A2035C3956EL ^ 0x903A2A2035C39CAAL);
    }

    private static boolean shdh_6(long l, Map.Entry entry) {
        int n;
        block4: {
            try {
                int n2 = -1249101444;
                n2 = Integer.rotateLeft(n2 * 649719387, 13) ^ 0xA39618F;
                n2 = Integer.rotateRight((int)l ^ n2, 12);
                int n3 = n2 ^ 0xA0360FAC;
                if ((n3 ^ n2) != -1607069780) {
                    int cfr_ignored_0 = (0x15BA36D0 ^ n2) - 2122066788;
                }
                if ((0x34C & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = l - (Long)entry.getValue() > (0x45AA9713568FE8DDL ^ 0x45AA9713568FE119L) ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0xEE9F;
        }
        return n != 0;
    }

    private static boolean khqd_2(long l, Map.Entry entry) {
        int n = tkhn.khyq(1271440980);
        Map.Entry entry2 = entry;
        n = Integer.rotateRight((entry2 != null ? System.identityHashCode(entry2) : 0) ^ n, 17);
        int n2 = n ^ 0x78D297A4;
        if ((n2 ^ n) != 2027067300) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x331A31F0 ^ n, 9) + 881437515) * 857354737;
        }
        return l - (Long)entry.getValue() > (0xB11B77534C16BE34L ^ 0xB11B77534C16B7F0L);
    }

    private void zqt_2(bksh bksh2) {
        class_2616 class_26162;
        int n = 1999289548;
        n = Integer.rotateLeft(n * -287948309, 25) ^ 0x3D4909AA;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0x22134ACD;
        if ((n2 ^ n) != 571689677) {
            int cfr_ignored_0 = (0x5539F601 ^ n) + 872154762;
        }
        if (hgh.mc.field_1724 == null || hgh.mc.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = bksh2.asw();
        if (class_25962 instanceof class_8143) {
            class_8143 class_81432 = (class_8143)class_25962;
            if ((class_25962 = class_81432.method_49071((class_1937)hgh.mc.field_1687).method_5529()) == hgh.mc.field_1724 || this.std_5((class_1297)class_25962) || class_81432.comp_1267() == hgh.mc.field_1724.method_5628()) {
                this.tsr.put(class_81432.comp_1267(), System.currentTimeMillis());
            }
            return;
        }
        class_25962 = bksh2.asw();
        if (class_25962 instanceof class_2616 && ((class_26162 = (class_2616)class_25962).method_11267() == 0 || class_26162.method_11267() == 3) && this.std_5((class_1297)(class_25962 = hgh.mc.field_1687.method_8469(class_26162.method_11269())))) {
            this.dhjm.put(class_26162.method_11269(), System.currentTimeMillis());
        }
    }

    private void rbh(bthy bthy2) {
        class_1309 class_13092;
        class_1297 class_12972;
        int n = 1093532265;
        n = Integer.rotateLeft(n * 1272882187, 10) ^ 0x6CF56D91;
        bthy bthy3 = bthy2;
        n = (bthy3 != null ? System.identityHashCode(bthy3) : 0) ^ n;
        int n2 = n ^ 0x9AE5C9DB;
        if ((n2 ^ n) != -1696216613) {
            int cfr_ignored_0 = (0xDBC833B2 ^ n) + -635659478;
        }
        if ((class_12972 = bthy2.khtf()) instanceof class_1309 && (class_13092 = (class_1309)class_12972) != hgh.mc.field_1724) {
            this.hah_2.put(class_13092.method_5628(), System.currentTimeMillis());
        }
    }

    private boolean stht_3() {
        int n = -2123073678;
        n = Integer.rotateLeft(n * -64550807, 6) ^ 0x81A57CEB;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC25A426B;
        if ((n2 ^ n) != -1034272149) {
            int cfr_ignored_0 = (0x432E3519 ^ n) + 143650235;
        }
        return !this.zjy.shghkh();
    }

    private static String abq(String string, int n, int n2, int n3) {
        int n4 = -578256031;
        n4 = Integer.rotateLeft(n4 * -1784235659, 9) ^ 0x5FEF2C69;
        n4 = n ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 26)) ^ 0x1753FC4;
        if ((n5 ^ n4) != 24461252) {
            int cfr_ignored_0 = (0xDCFDBCA5 ^ n4) + 1364055064;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xB39B9D2A) + i ^ sbt, 25) ^ n2 + khsh_2));
        }
        return new String(cArray);
    }

    private static void dwa() {
        int n = 1820929491;
        int n2 = (n = Integer.rotateLeft(n * 993093905, 18) ^ 0xB537B4C6) ^ 0xABCDB168;
        if ((n2 ^ n) != -1412583064) {
            int cfr_ignored_0 = (0xC7449CBB ^ n) + 88976317;
        }
        yf.athz_2();
    }

    private static boolean rdh_3(hgh hgh2, class_1297 class_12972) {
        block0: {
            int n = -1828440560;
            n = Integer.rotateLeft(n * 1126346197, 21) ^ 0x436775EE;
            class_1297 class_12973 = class_12972;
            n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 4);
            int n2 = n ^ 0xDC52C5D9;
            if ((n2 ^ n) == -598555175) break block0;
            int cfr_ignored_0 = (0x4F56F3C9 ^ n) + -412222931;
        }
        return hgh2.std_5(class_12972);
    }

    private static boolean rdsh(hgh hgh2, class_1309 class_13092) {
        block0: {
            int n = tkhn.khyq(-684100140);
            int n2 = n ^ 0xC68FECBA;
            if ((n2 ^ n) == -963646278) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x11B6996E ^ n, 5) - 695874445;
        }
        return hgh2.khkl(class_13092);
    }

    private static boolean djq() {
        block0: {
            int n = -1675489918;
            int n2 = (n = Integer.rotateLeft(n * -287821109, 17) ^ 0x6F6D3A1A) ^ 0xD5834DB3;
            if ((n2 ^ n) == -712815181) break block0;
            int cfr_ignored_0 = (0x49A14031 ^ n) - 598039054;
        }
        return yf.dnkh();
    }

    private static class_1297 alm(class_638 class_6382, int n) {
        block0: {
            int n2 = 869735289;
            n2 = Integer.rotateLeft(n2 * 1426756521, 27) ^ 0xB40EB86;
            class_638 class_6383 = class_6382;
            n2 = Integer.rotateRight((class_6383 != null ? System.identityHashCode(class_6383) : 0) ^ n2, 17);
            int n3 = n2 ^ 0x206F5D3D;
            if ((n3 ^ n2) == 544169277) break block0;
            int cfr_ignored_0 = (0x13B84644 ^ n2) - 860394656;
        }
        return class_6382.method_8469(n);
    }

    private static double dhwr(long l) {
        block0: {
            int n = -1768472315;
            n = Integer.rotateLeft(n * 1331068735, 21) ^ 0x38413216;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 4)) ^ 0xED76FB52;
            if ((n2 ^ n) == -310969518) break block0;
            int cfr_ignored_0 = (0x7BE1BA57 ^ n) + -1788952078;
        }
        return Double.longBitsToDouble(l);
    }

    private static kh_3 dhbb(Moondlc moondlc) {
        block0: {
            int n = -1062094484;
            int n2 = (n = Integer.rotateLeft(n * -272908333, 22) ^ 0x7C068739) ^ 0x4F0E2981;
            if ((n2 ^ n) == 1326328193) break block0;
            int cfr_ignored_0 = (0x8FBF90ED ^ n) - 1385444621;
        }
        return moondlc.getFriendManager();
    }

    private static GameProfile dkhh_4(class_1657 class_16572) {
        block0: {
            int n = tkhn.khyq(972863595);
            int n2 = n ^ 0x17785501;
            if ((n2 ^ n) == 393762049) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x2E84ED6A ^ n, 8) + -1502191855;
        }
        return class_16572.method_7334();
    }

    private static boolean qs(kh_3 kh2, String string) {
        block0: {
            int n = -320304579;
            n = Integer.rotateLeft(n * -1312554009, 14) ^ 0x515C50AF;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
            int n2 = n ^ 0x1EF58003;
            if ((n2 ^ n) == 519405571) break block0;
            int cfr_ignored_0 = (0xF21D0A3E ^ n) + -226166154;
        }
        return kh2.adhj(string);
    }

    private static boolean ths_4() {
        block0: {
            int n = -1298386895;
            int n2 = (n = Integer.rotateLeft(n * 1876445703, 12) ^ 0xC6B49A87) ^ 0x665DF924;
            if ((n2 ^ n) == 1717434660) break block0;
            int cfr_ignored_0 = (0xD4C1C915 ^ n) - -2075921472;
        }
        return yf.dnkh();
    }

    private static BigDecimal znt(BigDecimal bigDecimal, int n, RoundingMode roundingMode) {
        block0: {
            int n2 = 515580068;
            n2 = Integer.rotateLeft(n2 * 1977929639, 20) ^ 0x866A0C50;
            BigDecimal bigDecimal2 = bigDecimal;
            n2 = (bigDecimal2 != null ? System.identityHashCode(bigDecimal2) : 0) ^ n2;
            int n3 = n2 ^ 0x7DFDC406;
            if ((n3 ^ n2) == 2113782790) break block0;
            int cfr_ignored_0 = (0x6346E4A2 ^ n2) + -1594822072;
        }
        return bigDecimal.setScale(n, roundingMode);
    }

    private static double dmd_2(long l) {
        block0: {
            int n = 880656135;
            int n2 = (n = Integer.rotateLeft(n * -1325956857, 27) ^ 0x5CB10C40) ^ 0xFC725B75;
            if ((n2 ^ n) == -59614347) break block0;
            int cfr_ignored_0 = (0xC80FE472 ^ n) - 1068473985;
        }
        return Double.longBitsToDouble(l);
    }

    private static class_238 zsht_3(class_1309 class_13092) {
        block0: {
            int n = 556009599;
            int n2 = (n = Integer.rotateLeft(n * 1066138913, 15) ^ 0xD6366F90) ^ 0xC5BE4CC4;
            if ((n2 ^ n) == -977384252) break block0;
            int cfr_ignored_0 = (0xE49A44BB ^ n) + -1490677494;
        }
        return class_13092.method_5829();
    }

    private static float taa_6(tay tay2) {
        block0: {
            int n = 763839206;
            n = Integer.rotateLeft(n * 1317996567, 15) ^ 0xB9E64F82;
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 9);
            int n2 = n ^ 0xBFBD23BF;
            if ((n2 ^ n) == -1078123585) break block0;
            int cfr_ignored_0 = (0x923A6159 ^ n) - 919899312;
        }
        return tay2.thw_5();
    }

    private static boolean ads_2() {
        block0: {
            int n = -1612511816;
            int n2 = (n = Integer.rotateLeft(n * -42572251, 28) ^ 0x41C77CB6) ^ 0xD038B801;
            if ((n2 ^ n) == -801589247) break block0;
            int cfr_ignored_0 = (0x4FDBBDB9 ^ n) - 605999130;
        }
        return yf.khdha_2();
    }

    private static byq tshw(bzw_2 bzw2_2) {
        block0: {
            int n = -802327638;
            n = Integer.rotateLeft(n * 790795729, 15) ^ 0x60176D85;
            bzw_2 bzw3_2 = bzw2_2;
            n = Integer.rotateLeft((bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n, 27);
            int n2 = n ^ 0x8C517DC8;
            if ((n2 ^ n) == -1940816440) break block0;
            int cfr_ignored_0 = (0x5C7C0E62 ^ n) + -428319416;
        }
        return bzw2_2.sdsh_4();
    }

    private static boolean zld_2() {
        block0: {
            int n = 535043050;
            int n2 = (n = Integer.rotateLeft(n * -59520155, 13) ^ 0x156F7507) ^ 0x5E440ED2;
            if ((n2 ^ n) == 1581518546) break block0;
            int cfr_ignored_0 = (0x41A01538 ^ n) - 2104747439;
        }
        return yf.khdha_2();
    }

    private static void dhys() {
        int n = -490902356;
        int n2 = (n = Integer.rotateLeft(n * -1856521731, 28) ^ 0xB8354A23) ^ 0xFFB1A7BF;
        if ((n2 ^ n) != -5134401) {
            int cfr_ignored_0 = (0x1D0CCB13 ^ n) - -399025155;
        }
        yf.athz_2();
    }

    private static int shhb_2(Color color) {
        block0: {
            int n = 890470840;
            n = Integer.rotateLeft(n * -1341769035, 21) ^ 0x46734B28;
            Color color2 = color;
            n = Integer.rotateLeft((color2 != null ? System.identityHashCode(color2) : 0) ^ n, 18);
            int n2 = n ^ 0x3B767D5C;
            if ((n2 ^ n) == 997621084) break block0;
            int cfr_ignored_0 = (0xE65FCE4 ^ n) - 1392874613;
        }
        return color.getRed();
    }

    private static String[] zqdh(String string) {
        int n = 1243179406;
        int n2 = (n = Integer.rotateLeft(n * -735143425, 12) ^ 0xBFE54C0D) ^ 0x1FBD97FE;
        if ((n2 ^ n) != 532518910) {
            int cfr_ignored_0 = (0x55A4FE70 ^ n) - -782152148;
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

    private static CallSite ta(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1061854825;
            n3 = Integer.rotateLeft(n3 * -224303133, 4) ^ 0x15097DB6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 29);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x49E1ED14;
            if ((n4 ^ n3) != 1239543060) {
                int cfr_ignored_0 = (0x89548C83 ^ n3) - -1696419323;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dtd_4 ^ string.hashCode() ^ n2 + dqq ^ i * -797146785 ^ dtd_4, 7) ^ dqq));
            }
            String[] stringArray = hgh.zqdh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] z97xgdnomyfqc(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite a1q74n0e59kp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pcs98ghlfc ^ string.hashCode() ^ n2 + spbf911h64c + i * 465272431) + pcs98ghlfc) ^ spbf911h64c));
            }
            String[] stringArray = hgh.z97xgdnomyfqc(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

