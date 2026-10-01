/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SplittableRandom;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bdhh_2;
import us.m0vy.moondlc.m0vyguard.bsd_2;
import us.m0vy.moondlc.m0vyguard.bhw_2;
import us.m0vy.moondlc.m0vyguard.thy;
import us.m0vy.moondlc.m0vyguard.tda_2;
import us.m0vy.moondlc.m0vyguard.yf;

public final class sa {
    private static final bsd_2 tmj;
    private static final bsd_2 sak_2;
    private static final bsd_2 rak;
    private final SplittableRandom dk_2 = new SplittableRandom();
    private final bsd_2 dhzz_4;
    private final tda_2 dhms;
    private final tda_2 rmh_2;
    private float thkf;
    private boolean jghf;
    private float thq_2;
    private float thksh;
    private static final int htdh_2 = -443816348;
    private static final int shagh_2 = 731400844;
    private static final int rzd_3 = -1901359261;
    private static final int dhshr = -1002593684;
    private static final int opd89dga = 1917304559;
    private static final int lyibzju9mmeq5 = -139207691;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vi291szts6jnj9;

    public sa(thy thy2) {
        this.dhzz_4 = sa.dhshgh(Objects.requireNonNull(thy2, "profile"));
        this.dhms = new tda_2(this.dhzz_4.noiseSources());
        this.rmh_2 = new tda_2(this.dhzz_4.noiseSources());
        this.tyw();
    }

    public void tyw() {
        int n = -1491181975;
        n = Integer.rotateLeft(n * 2067056349, 27) ^ 0x4C5FAAA5;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0xCCC008D;
        if ((n2 ^ n) != 214696077) {
            int cfr_ignored_0 = (0xABD25EE4 ^ n) - -1685904077;
        }
        this.ghjb(this.dhms, 1.0f);
        this.ghjb(this.rmh_2, Float.intBitsToFloat(1001391158 + 61613248));
        this.thkf = sa.tzt_8(this, -this.dhzz_4.wristLimit(), sa.dlm_2(this.dhzz_4));
        this.jghf = false;
        this.thq_2 = 0.0f;
        this.thksh = 1.0f;
    }

    public float zdn(bhw_2 bhw2) {
        try {
            int n = 561188632;
            n = Integer.rotateLeft(n * 353713325, 25) ^ 0x7FBE8401;
            bhw_2 bhw3 = bhw2;
            n = Integer.rotateLeft((bhw3 != null ? System.identityHashCode((Object)bhw3) : 0) ^ n, 8);
            int n2 = n ^ 0x30F60EB9;
            if ((n2 ^ n) != 821431993) {
                int cfr_ignored_0 = (0x118501A1 ^ n) + 2108758020;
            }
            if ((0x3D1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        tda_2 tda2 = this.shsm(bhw2);
        sa.shdd_4(this, tda2);
        if (this.dk_2.nextDouble() < this.dhzz_4.additionalNoiseRefreshChance()) {
            this.had_3(tda2);
        }
        float f = 0.0f;
        for (float f2 : tda2.dfz_2) {
            f += f2;
        }
        return sa.zqdh_2(f / (float)tda2.dfz_2.length, Float.intBitsToFloat(-179122401 + -903008031), 1.0f);
    }

    public float dhsm_2(bhw_2 bhw2, boolean bl) {
        float f;
        float f2;
        int n = 1745971982;
        n = Integer.rotateLeft(n * -1136459063, 28) ^ 0xA880F98B;
        bhw_2 bhw3 = bhw2;
        n = (bhw3 != null ? System.identityHashCode((Object)bhw3) : 0) ^ n;
        int n2 = (n = bl ^ n) ^ 0x584B2E81;
        if ((n2 ^ n) != 1481322113) {
            int cfr_ignored_0 = (0x305A458F ^ n) + 2006919543;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        tda_2 tda2 = this.shsm(bhw2);
        if (tda2.blh_2 <= 0) {
            f2 = bhw2 == bhw_2.tnd ? Float.intBitsToFloat(-1535080506 - 1696882384) : 1.0f;
            tda2.shfz_2 = f = 1.0f + (sa.bsq_2(this, this.dhzz_4.minimumGain(), this.dhzz_4.maximumGain()) - 1.0f) * f2;
            tda2.blh_2 = this.dk_2.nextInt(this.dhzz_4.minimumGainDuration(), sa.dza_3(this.dhzz_4) + 1);
        }
        --tda2.blh_2;
        f2 = this.dhzz_4.gainAdjustmentPerTick();
        tda2.shww += class_3532.method_15363((float)(tda2.shfz_2 - tda2.shww), (float)(-f2), (float)f2);
        if (!bl) {
            return tda2.shww;
        }
        f = (tda2.shww - 1.0f) * this.dhzz_4.precisionGainCompression();
        return 1.0f + sa.rrdh(f, -sa.ahs_3(this.dhzz_4), sa.thsth_2(this.dhzz_4));
    }

    public float dtk_4(float f, boolean bl) {
        if (bl || !Float.isFinite(f)) {
            this.bjgh();
            return 1.0f;
        }
        if (f > this.dhzz_4.subMovementThreshold() && !this.jghf && this.dk_2.nextDouble() < this.dhzz_4.subMovementProbability()) {
            this.jghf = true;
            this.thq_2 = 0.0f;
            this.thksh = this.dhzz_4.ballisticMinimum() + (float)this.dk_2.nextDouble() * this.dhzz_4.ballisticRange();
        }
        if (!this.jghf) {
            return 1.0f;
        }
        this.thq_2 += this.dhzz_4.subMovementProgressPerTick();
        if (this.thq_2 < 1.0f) {
            return this.thksh;
        }
        if (this.thq_2 < 1.75f) {
            return this.dhzz_4.correctionMinimum() + (float)this.dk_2.nextDouble() * this.dhzz_4.correctionRange();
        }
        this.bjgh();
        return 1.0f;
    }

    /*
     * Unable to fully structure code
     */
    public float tdf(float var1_1) {
        var2_2 = 0.0f;
        var5_3 = 0;
        var3_4 = 1789627932;
        var3_4 = Integer.rotateLeft(var3_4 * 1164555403, 20) ^ 481466676;
        var3_4 = Float.floatToIntBits(var1_1) ^ var3_4;
        var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ -1632323389, 6) ^ 142883210490671882L ^ 142883210490671882L);
        while (true) {
            block41: {
                block45: {
                    block37: {
                        block46: {
                            block42: {
                                block48: {
                                    block39: {
                                        block36: {
                                            block38: {
                                                block47: {
                                                    block43: {
                                                        block44: {
                                                            block40: {
                                                                var5_3 = Integer.rotateRight(var4_5, 6) ^ var3_4;
                                                                switch (var5_3 & 7) {
                                                                    case 0: {
                                                                        if (var5_3 == 1779834896) break block36;
                                                                        if (var5_3 != -1754738088) {
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 2: {
                                                                        if (var5_3 == -325691806) break block38;
                                                                        if (var5_3 != -2076575230) {
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 3: {
                                                                        if (var5_3 == -1632323389) break block40;
                                                                        if (var5_3 != 1081765307) {
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                    case 4: {
                                                                        if (var5_3 == 1525603948) break block42;
                                                                        if (var5_3 != -375782420) {
                                                                            (Integer.rotateRight(-1165603553 ^ var3_4, 10) - -1700727300) * -1165603553;
                                                                            ** break;
                                                                        }
                                                                        break block43;
                                                                    }
                                                                    case 5: {
                                                                        if (var5_3 == 1344387357) break block44;
                                                                        if (var5_3 == -1625069203) break block45;
                                                                        (Integer.rotateLeft(1648333913 ^ var3_4, 15) + -368011774) * 1648333913;
                                                                        (int)(-6877776854085473457L ^ (long)var3_4 ^ -8522918146339181365L);
                                                                        if (var5_3 != -1067857883) {
                                                                            ** break;
                                                                        }
                                                                        break block46;
                                                                    }
                                                                    case 6: {
                                                                        if (var5_3 != 1936109158) {
                                                                            if (var5_3 == 96676750) break;
                                                                            ** break;
                                                                        }
                                                                        break block47;
                                                                    }
                                                                    case 7: {
                                                                        if (var5_3 != -1938936881) {
                                                                            ** break;
                                                                        }
                                                                        break block48;
                                                                    }
                                                                }
                                                                Integer.rotateRight(-343249757 ^ var3_4, 16) + -1977563400;
                                                                yf.athz_2();
                                                                var4_5 = Integer.rotateLeft(var3_4 ^ 1344387357, 6) ^ 2105615893 ^ 2105615893;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(2010762248 ^ var3_4, 17) + -2017635277;
                                                            if (!yf.khdha_2()) {
                                                                try {
                                                                    var5_3 -= 5;
                                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ 96676750, 6)));
                                                                }
                                                                catch (NoSuchElementException v0) {
                                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ 96676750, 6)));
                                                                }
                                                                var5_3 += 2;
                                                                continue;
                                                            }
                                                            try {
                                                                var5_3 -= 3;
                                                                var4_5 = Integer.rotateLeft(var3_4 ^ 1344387357, 6) + 496317813 - 496317813;
                                                            }
                                                            catch (IllegalStateException v1) {
                                                                var4_5 = Integer.rotateLeft(var3_4 ^ 1344387357, 6) + -1904984280 - -1904984280;
                                                            }
                                                            var5_3 -= 3;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(426198270 ^ var3_4, 6) - 400488957) * 426198271;
                                                        var2_2 = var1_1 * this.dhzz_4.wristPitchCoupling() * class_3532.method_15374((float)this.thkf);
                                                        (int)(346418327004116414L ^ (long)var3_4 ^ -8199694601945373620L);
                                                        var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ 1081765307, 6) ^ -3221323850808169652L ^ -3221323850808169652L);
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1200438169 ^ var3_4, 11) + -1367877950) * 1200438169;
                                                    (int)(-8845186610856924337L ^ (long)var3_4 ^ -3010512202437711954L);
                                                    try {
                                                        if ((-6407299316052716907L ^ (long)var3_4 | 1L) == 0L) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ -1632323389, 6) ^ 6453880655680287468L ^ 6453880655680287468L);
                                                    }
                                                    catch (NoSuchElementException v2) {
                                                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -1632323389, 6)));
                                                    }
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-1770095243 ^ var3_4, 5) - 1034866790) * -1770095243;
                                                (int)(6110491101294291791L ^ (long)var3_4 ^ 6620435600694117448L);
                                                (int)(1490006915586106427L ^ (long)var3_4 ^ -2325365427861879670L);
                                                var4_5 = Integer.rotateLeft(var3_4 ^ -581118997, 6) ^ 1106644829 ^ 1106644829;
                                                (int)(-6357189773103394908L ^ (long)var3_4 ^ -8189140158639054244L);
                                                var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6) ^ -2021291245 ^ -2021291245;
                                                var5_3 -= 4;
                                                continue;
                                            }
                                            Integer.rotateLeft(592646792 ^ var3_4, 7) + 1265425843;
                                            var4_5 = Integer.rotateLeft(var3_4 ^ 155961616, 6) + -1457560319 - -1457560319;
                                            Integer.rotateRight(358760839 ^ var3_4, 5) - -1690071404;
                                            var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6);
                                            (Integer.rotateRight(-77700870 ^ var3_4, 18) + 1959484801) * -77700869;
                                            var5_3 -= 2;
                                            continue;
                                        }
                                        (Integer.rotateRight(1705083507 ^ var3_4, 15) + 1391225640) * 1705083507;
                                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -1632323389, 6)));
                                        Integer.rotateRight(1035559883 ^ var3_4, 10) + 2110829776;
                                        continue;
                                    }
                                    Integer.rotateRight(1681991206 ^ var3_4, 15) - 675364309;
                                    try {
                                        if ((7602502423383651133L ^ (long)var3_4 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6);
                                    }
                                    catch (UnsupportedOperationException v3) {
                                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -1632323389, 6)));
                                    }
                                    var5_3 += 2;
                                    continue;
                                }
                                (Integer.rotateRight(-1479876333 ^ var3_4, 7) + 1441718408) * -1479876333;
                                try {
                                    var5_3 -= 5;
                                    var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6) + 294172569 - 294172569;
                                }
                                catch (IllegalArgumentException v4) {
                                    var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ -1632323389, 6) ^ -4396700751867274444L ^ -4396700751867274444L);
                                }
                                ++var5_3;
                                continue;
                            }
                            (Integer.rotateRight(-1551827430 ^ var3_4, 7) + -788765599) * -1551827429;
                            try {
                                if ((-5571850581978304479L ^ (long)var3_4 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6) + -988379620 - -988379620;
                            }
                            catch (IllegalArgumentException v5) {
                                var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6);
                            }
                            continue;
                        }
                        (Integer.rotateRight(617232894 ^ var3_4, 7) - 2027595005) * 617232895;
                        var4_5 = Integer.rotateLeft(var3_4 ^ -59281024, 6);
                        (Integer.rotateRight(-628198894 ^ var3_4, 14) + 2073915241) * -628198893;
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1973822909, 6);
                        Integer.rotateLeft(-1087044632 ^ var3_4, 10) + 734599251;
                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -1632323389, 6)));
                        var5_3 += 5;
                        continue;
                    }
                    Integer.rotateLeft(1745995492 ^ var3_4, 16) - -1635470121;
                    try {
                        var5_3 += 3;
                        if ((1205795358740432717L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6) ^ -402447 ^ -402447;
                    }
                    catch (ArithmeticException v6) {
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6);
                    }
                    continue;
                }
                Integer.rotateLeft(-1425596152 ^ var3_4, 8) + -1170563277;
                var4_5 = Integer.rotateLeft(var3_4 ^ -1382575029, 6);
                (Integer.rotateRight(81040731 ^ var3_4, 3) + -1709460160) * 81040731;
                var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6);
                continue;
            }
            return var2_2;
lbl196:
            // 8 sources

            (Integer.rotateRight(80900343 ^ var3_4, 3) - -1713812188) * 80900343;
            var4_5 = Integer.rotateLeft(var3_4 ^ -1632323389, 6);
        }
    }

    public void dkf() {
        if (this.dk_2.nextDouble() < (double)this.dhzz_4.wristUpdateChance()) {
            this.thkf = class_3532.method_15363((float)(this.thkf + this.znz_3(-this.dhzz_4.wristAngleChange(), this.dhzz_4.wristAngleChange())), (float)(-this.dhzz_4.wristLimit()), (float)this.dhzz_4.wristLimit());
        }
    }

    private void ghjb(tda_2 tda2, float f) {
        int n = 0;
        int n2 = 0;
        int n3 = -1424775551;
        n3 = Integer.rotateLeft(n3 * 591159909, 28) ^ 0x4FC027F5;
        n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 4);
        n3 = Float.floatToIntBits(f) ^ n3;
        int n4 = (int)((long)(-372527035 + n3) ^ 0x821F1985E411A0A6L ^ 0x821F1985E411A0A6L);
        while (true) {
            block54: {
                block45: {
                    block48: {
                        block37: {
                            block34: {
                                block36: {
                                    block47: {
                                        block53: {
                                            block46: {
                                                block51: {
                                                    block42: {
                                                        block44: {
                                                            block49: {
                                                                block43: {
                                                                    block41: {
                                                                        block50: {
                                                                            block39: {
                                                                                block35: {
                                                                                    block38: {
                                                                                        block40: {
                                                                                            block52: {
                                                                                                if ((n2 = n4 - n3) == 1372359927) break block34;
                                                                                                if (n2 == -2108097428) break block35;
                                                                                                if (n2 == -349510649) break block36;
                                                                                                if (n2 == 2119852808) break block37;
                                                                                                if (n2 == -372527035) break block38;
                                                                                                if (n2 == 204318764) break block39;
                                                                                                if (n2 == -1255430345) break block40;
                                                                                                if (n2 == 1614810553) break block41;
                                                                                                if (n2 == -318896688) break block42;
                                                                                                if (n2 == -536677147) break block43;
                                                                                                if (n2 == -332988508) break block44;
                                                                                                if (n2 == -2070056280) break block45;
                                                                                                if (n2 == -1224258100) break block46;
                                                                                                if (n2 == 620780986) break block47;
                                                                                                int cfr_ignored_0 = Integer.rotateRight(0xE13214E3 ^ n3, 15) + 1231955640;
                                                                                                if (n2 == -134489835) break block48;
                                                                                                if (n2 == 761071254) break block49;
                                                                                                if (n2 == -453819395) break block50;
                                                                                                if (n2 == 1512573574) break block51;
                                                                                                if (n2 == -625975903) break block52;
                                                                                                if (n2 == 1556181144) break block53;
                                                                                                break block54;
                                                                                            }
                                                                                            int cfr_ignored_1 = Integer.rotateLeft(0xE4DFA04D ^ n3, 15) - -1150154610;
                                                                                            int cfr_ignored_2 = (int)(0x266D0E7027D4EB4FL ^ (long)n3 ^ 0xE190831A2DB9E10BL);
                                                                                            tda2.dfz_2[n] = this.khbsh();
                                                                                            ++n;
                                                                                            try {
                                                                                                n2 -= 3;
                                                                                                n4 = (int)((long)(1614810553 + n3) ^ 0xF952C726184A3703L ^ 0xF952C726184A3703L);
                                                                                            }
                                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                                n4 = Integer.reverse(Integer.reverse(1614810553 + n3));
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_3 = Integer.rotateRight(0x4AC2EBCB ^ n3, 12) + 301477072;
                                                                                        tda2.dfz_2[n] = this.khbsh();
                                                                                        ++n;
                                                                                        try {
                                                                                            ++n2;
                                                                                            if ((0x1C483244DEE736DDL ^ (long)n3 | 1L) == 0L) {
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            n4 = 1614810553 + n3;
                                                                                        }
                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                            n4 = Integer.reverse(Integer.reverse(1614810553 + n3));
                                                                                        }
                                                                                        n2 += 3;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_4 = (Integer.rotateLeft(0x7B0D84B9 ^ n3, 18) + -352276062) * 2064483513;
                                                                                    int cfr_ignored_5 = (int)(0xB9BF2A8427D4EB4FL ^ (long)n3 ^ 0xA878831A2DB8DEAFL);
                                                                                    if (!yf.khdha_2()) {
                                                                                        try {
                                                                                            n2 += 3;
                                                                                            if ((0x71A48210C9DC6741L ^ (long)n3 | 1L) == 0L) {
                                                                                                throw new ArithmeticException();
                                                                                            }
                                                                                            n4 = 204318764 + n3 ^ 0x5EF70F55 ^ 0x5EF70F55;
                                                                                        }
                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                            n4 = Integer.reverse(Integer.reverse(204318764 + n3));
                                                                                        }
                                                                                        n2 -= 2;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        --n2;
                                                                                        if ((0xA3BD3DF455512599L ^ (long)n3 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        n4 = (int)((long)(-2108097428 + n3) ^ 0x692EB1DEC8A133A2L ^ 0x692EB1DEC8A133A2L);
                                                                                    }
                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                        n4 = (int)((long)(-2108097428 + n3) ^ 0x648A56E252C15B68L ^ 0x648A56E252C15B68L);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_6 = (Integer.rotateRight(0x73F0DE57 ^ n3, 17) - 243829700) * 1945165399;
                                                                                n = 0;
                                                                                try {
                                                                                    ++n2;
                                                                                    if ((0x4C808958A742D029L ^ (long)n3 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    n4 = 1614810553 + n3 ^ 0xD7A93C44 ^ 0xD7A93C44;
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    n4 = Integer.reverse(Integer.reverse(1614810553 + n3));
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_7 = (Integer.rotateRight(0x710DCFB3 ^ n3, 17) + -1257650712) * 1896730547;
                                                                            yf.athz_2();
                                                                            n4 = Integer.reverse(Integer.reverse(1290913592 + n3));
                                                                            int cfr_ignored_8 = Integer.rotateLeft(0x924E6C5 ^ n3, 4) - 534090006;
                                                                            int cfr_ignored_9 = (int)(0xCB9648F827D4EB4FL ^ (long)n3 ^ 0x6C80831A2DB83AFDL);
                                                                            n4 = -2108097428 + n3 ^ 0x5ABDCE66 ^ 0x5ABDCE66;
                                                                            n2 -= 3;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_10 = Integer.rotateRight(0xB7BBAC03 ^ n3, 9) + 1142387608;
                                                                        tda2.shww = 1.0f;
                                                                        tda2.shfz_2 = 1.0f + (sa.thnl(this, this.dhzz_4.minimumGain(), this.dhzz_4.maximumGain()) - 1.0f) * f;
                                                                        tda2.blh_2 = this.dk_2.nextInt(this.dhzz_4.minimumGainDuration(), this.dhzz_4.maximumGainDuration() + 1);
                                                                        return;
                                                                    }
                                                                    int cfr_ignored_11 = Integer.rotateLeft(0x62649685 ^ n3, 15) - -292824746;
                                                                    int cfr_ignored_12 = (int)(0xA0D638B827D4EB4FL ^ (long)n3 ^ 0x8C00831A2DB8EC7DL);
                                                                    if (n >= tda2.dfz_2.length) {
                                                                        try {
                                                                            n2 += 2;
                                                                            if ((0x2EBAFB565D54E7F7L ^ (long)n3 | 1L) == 0L) {
                                                                                throw new NoSuchElementException();
                                                                            }
                                                                            n4 = (int)((long)(-453819395 + n3) ^ 0x143B5023E8CEBCDEL ^ 0x143B5023E8CEBCDEL);
                                                                        }
                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                            n4 = -453819395 + n3 ^ 0x52825FED ^ 0x52825FED;
                                                                        }
                                                                        n2 += 3;
                                                                        continue;
                                                                    }
                                                                    n4 = 1196714436 + n3;
                                                                    int cfr_ignored_13 = (Integer.rotateLeft(0x99FD82F4 ^ n3, 6) - -1441760569) * -1711439115;
                                                                    n4 = -1255430345 + n3;
                                                                    n2 -= 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_14 = Integer.rotateLeft(0x8E206381 ^ n3, 4) + 977906650;
                                                                int cfr_ignored_15 = (int)(0x4C92CDBC27D4EB4FL ^ (long)n3 ^ 0x6608831A2DB934F4L);
                                                                try {
                                                                    n2 += 3;
                                                                    if ((0x61872F84251A4DC9L ^ (long)n3 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    n4 = -372527035 + n3;
                                                                }
                                                                catch (NoSuchElementException noSuchElementException) {
                                                                    n4 = -372527035 + n3;
                                                                }
                                                                continue;
                                                            }
                                                            int cfr_ignored_16 = Integer.rotateRight(0xA21A9FC7 ^ n3, 7) - -1516832684;
                                                            int cfr_ignored_17 = (int)(0x98618A3A86C97BBAL ^ (long)n3 ^ 0xE905C1210C529D12L);
                                                            n4 = Integer.reverse(Integer.reverse(-857215189 + n3));
                                                            int cfr_ignored_18 = (int)(0x2CF81CCFBEF56812L ^ (long)n3 ^ 0xC4EFB1592B03F421L);
                                                            n4 = -372527035 + n3 ^ 0x70515DF2 ^ 0x70515DF2;
                                                            n2 += 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_19 = Integer.rotateRight(0x111AE886 ^ n3, 5) - 379570037;
                                                        n4 = -372527035 + n3 ^ 0xFC1ADDDB ^ 0xFC1ADDDB;
                                                        continue;
                                                    }
                                                    int cfr_ignored_20 = (Integer.rotateRight(0x8984DD7 ^ n3, 4) - 248450116) * 144199127;
                                                    n4 = -345295039 + n3;
                                                    int cfr_ignored_21 = (Integer.rotateLeft(0x36963811 ^ n3, 9) + -1601279670) * 915814417;
                                                    int cfr_ignored_22 = (int)(0xF424962C27D4EB4FL ^ (long)n3 ^ 0xD128831A2DB84598L);
                                                    try {
                                                        n2 -= 4;
                                                        if ((0x7A184DED7F1930C7L ^ (long)n3 | 1L) == 0L) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        n4 = -372527035 + n3 ^ 0x35B9ACD0 ^ 0x35B9ACD0;
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n4 = Integer.reverse(Integer.reverse(-372527035 + n3));
                                                    }
                                                    n2 += 5;
                                                    continue;
                                                }
                                                int cfr_ignored_23 = Integer.rotateRight(0x8C71687 ^ n3, 4) - 343497108;
                                                n4 = 1227481680 + n3 + -898236437 - -898236437;
                                                int cfr_ignored_24 = (Integer.rotateLeft(0xAE386299 ^ n3, 8) + 489787330) * -1372036455;
                                                int cfr_ignored_25 = (int)(0x6C8ACCA427D4EB4FL ^ (long)n3 ^ 0x6438831A2DB974C4L);
                                                int cfr_ignored_26 = (int)(0xFF63B1E5CA840FD0L ^ (long)n3 ^ 0x9EBB59BBE4865316L);
                                                n4 = (int)((long)(856255216 + n3) ^ 0x9519178DEDDDD8C3L ^ 0x9519178DEDDDD8C3L);
                                                int cfr_ignored_27 = (int)(0xD57AB1DCED7DE6DBL ^ (long)n3 ^ 0x9EC9164836900724L);
                                                n4 = -372527035 + n3 ^ 0x34C05FAA ^ 0x34C05FAA;
                                                continue;
                                            }
                                            int cfr_ignored_28 = (Integer.rotateRight(0x60E2B4B2 ^ n3, 15) + -1076789047) * 1625470131;
                                            n4 = -416091873 + n3 + 786205681 - 786205681;
                                            int cfr_ignored_29 = Integer.rotateRight(0x15BAF667 ^ n3, 5) - -1509853772;
                                            n4 = 976743871 + n3 + -1028906535 - -1028906535;
                                            int cfr_ignored_30 = (Integer.rotateRight(0xEC8A23DE ^ n3, 16) - -1458047203) * -326491169;
                                            n4 = -372527035 + n3 + -1927177170 - -1927177170;
                                            --n2;
                                            continue;
                                        }
                                        int cfr_ignored_31 = Integer.rotateLeft(0x70C17F2C ^ n3, 17) - -1412692593;
                                        try {
                                            --n2;
                                            if ((0x2C3628DA5AA0492DL ^ (long)n3 | 1L) == 0L) {
                                                throw new ArithmeticException();
                                            }
                                            n4 = -372527035 + n3;
                                        }
                                        catch (ArithmeticException arithmeticException) {
                                            n4 = Integer.reverse(Integer.reverse(-372527035 + n3));
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_32 = Integer.rotateRight(0xDBC4F50B ^ n3, 14) + -1590211696;
                                    n4 = Integer.reverse(Integer.reverse(1097695007 + n3));
                                    int cfr_ignored_33 = (Integer.rotateLeft(0x41326E39 ^ n3, 11) + -377948126) * 1093824057;
                                    int cfr_ignored_34 = (int)(0x8380C00427D4EB4FL ^ (long)n3 ^ 0x7D78831A2DB8AAD0L);
                                    n4 = -337616112 + n3 + -1700377858 - -1700377858;
                                    int cfr_ignored_35 = Integer.rotateRight(0x63077283 ^ n3, 15) + 38042904;
                                    n4 = Integer.reverse(Integer.reverse(-372527035 + n3));
                                    ++n2;
                                    continue;
                                }
                                int cfr_ignored_36 = Integer.rotateLeft(0xA8BC81CC ^ n3, 8) - 1932613359;
                                n4 = Integer.reverse(Integer.reverse(657754951 + n3));
                                int cfr_ignored_37 = Integer.rotateRight(0x33918783 ^ n3, 9) + 1123878936;
                                try {
                                    --n2;
                                    n4 = (int)((long)(-372527035 + n3) ^ 0x5A36B604831BFDA6L ^ 0x5A36B604831BFDA6L);
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n4 = -372527035 + n3;
                                }
                                n2 += 4;
                                continue;
                            }
                            int cfr_ignored_38 = Integer.rotateLeft(0x7336C061 ^ n3, 17) + -134288646;
                            int cfr_ignored_39 = (int)(0xB1846E5C27D4EB4FL ^ (long)n3 ^ 0x21C8831A2DB8CED9L);
                            n4 = (int)((long)(-503215650 + n3) ^ 0x889172B932953B31L ^ 0x889172B932953B31L);
                            int cfr_ignored_40 = (Integer.rotateLeft(0x9A5115F1 ^ n3, 6) + -1271969942) * -1705961999;
                            int cfr_ignored_41 = (int)(0x58E3BBCC27D4EB4FL ^ (long)n3 ^ 0x8AE8831A2DB91C16L);
                            int cfr_ignored_42 = (int)(0xAB3516A83E125A4L ^ (long)n3 ^ 0x5FA5CB71B06FB8B7L);
                            n4 = (int)((long)(757019057 + n3) ^ 0xA3A11663A113364EL ^ 0xA3A11663A113364EL);
                            int cfr_ignored_43 = (int)(0xEDEED870620F095FL ^ (long)n3 ^ 0x4D9008ADE998760CL);
                            n4 = Integer.reverse(Integer.reverse(-372527035 + n3));
                            n2 += 3;
                            continue;
                        }
                        int cfr_ignored_44 = (Integer.rotateRight(0x7E14CD5B ^ n3, 18) + 1222802752) * 2115292507;
                        try {
                            n2 -= 2;
                            if ((0x1A00810C440B44AFL ^ (long)n3 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n4 = (int)((long)(-372527035 + n3) ^ 0xDA3AD47D6D9C4FC3L ^ 0xDA3AD47D6D9C4FC3L);
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n4 = Integer.reverse(Integer.reverse(-372527035 + n3));
                        }
                        n2 += 4;
                        continue;
                    }
                    int cfr_ignored_45 = (Integer.rotateRight(0x2891723B ^ n3, 8) + -302353312) * 680620603;
                    n4 = -837868498 + n3 ^ 0xBDB63EEE ^ 0xBDB63EEE;
                    int cfr_ignored_46 = (Integer.rotateLeft(0x1E674751 ^ n3, 6) + -1293991414) * 510084945;
                    int cfr_ignored_47 = (int)(0xDCD5E96C27D4EB4FL ^ (long)n3 ^ 0x2FA8831A2DB8147AL);
                    n4 = -372527035 + n3 ^ 0x259E2615 ^ 0x259E2615;
                    n2 += 3;
                    continue;
                }
                int cfr_ignored_48 = Integer.rotateRight(0x5294024B ^ n3, 13) + 71951952;
                n4 = (int)((long)(-354918155 + n3) ^ 0xBA3F7B9A01FADC7AL ^ 0xBA3F7B9A01FADC7AL);
                int cfr_ignored_49 = (Integer.rotateRight(0x2CAC68B7 ^ n3, 8) - 1832799588) * 749496503;
                n4 = -372527035 + n3 ^ 0xE8D86069 ^ 0xE8D86069;
                int cfr_ignored_50 = (Integer.rotateRight(0x4BD35E57 ^ n3, 12) - 854985668) * 1272143447;
                continue;
            }
            int cfr_ignored_51 = Integer.rotateRight(0xEC075027 ^ n3, 16) - -1723837452;
            n4 = Integer.reverse(Integer.reverse(-372527035 + n3));
        }
    }

    private void had_3(tda_2 tda2) {
        try {
            int n = -1510426760;
            n = Integer.rotateLeft(n * 853794241, 18) ^ 0x37D9A722;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
            int n2 = n ^ 0x3A51E208;
            if ((n2 ^ n) != 978444808) {
                int cfr_ignored_0 = (0x9FA95570 ^ n) - -1318260457;
            }
            if ((0x1F3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        tda2.dfz_2[this.dk_2.nextInt((int)tda2.dfz_2.length)] = sa.shath_2(this);
    }

    private tda_2 shsm(bhw_2 bhw2) {
        int n = -1128070794;
        n = Integer.rotateLeft(n * 1101355381, 25) ^ 0x38DFF568;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9FE1CA88;
        if ((n2 ^ n) != -1612592504) {
            int cfr_ignored_0 = (0x2322CBFE ^ n) + 330703776;
        }
        return Objects.requireNonNull(bhw2, "axis") == bhw_2.shtr ? this.dhms : this.rmh_2;
    }

    private void bjgh() {
        try {
            int n = 91889677;
            n = Integer.rotateLeft(n * -1136118135, 10) ^ 0x5EDBB900;
            int n2 = n ^ 0x3D026048;
            if ((n2 ^ n) != 1023565896) {
                int cfr_ignored_0 = (0x38784045 ^ n) - -69036063;
            }
            if ((0x201 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.jghf = false;
        this.thq_2 = 0.0f;
        this.thksh = 1.0f;
    }

    /*
     * Unable to fully structure code
     */
    private float khbsh() {
        var3_1 = 0;
        var1_2 = 143250409;
        var1_2 = Integer.rotateLeft(var1_2 * -691365331, 17) ^ -368780151;
        var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) ^ 12248748 ^ 12248748;
        while (true) {
            block43: {
                block45: {
                    block39: {
                        block40: {
                            block46: {
                                block34: {
                                    block41: {
                                        block42: {
                                            block44: {
                                                block35: {
                                                    block36: {
                                                        block37: {
                                                            block38: {
                                                                var3_1 = Integer.rotateRight(var2_3, 20) ^ var1_2;
                                                                switch (var3_1 & 7) {
                                                                    case 4: {
                                                                        if (var3_1 > -1048715972) ** GOTO lbl14
                                                                        if (var3_1 == -1324394364) break block34;
                                                                        if (var3_1 != -1048715972) {
                                                                            ** break;
                                                                        }
                                                                        break block35;
lbl14:
                                                                        // 1 sources

                                                                        if (var3_1 == -86214900) break block36;
                                                                        if (var3_1 != 922665500) {
                                                                            Integer.rotateLeft(248115716 ^ var1_2, 4) - -825102921;
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 1: {
                                                                        if (var3_1 == 948497865) break block38;
                                                                        if (var3_1 != -235452871) {
                                                                            if (var3_1 == -834067199) break;
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 7: {
                                                                        if (var3_1 == -1654116353) break block40;
                                                                        if (var3_1 != -2027807897) {
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                    case 0: {
                                                                        if (var3_1 != -1708875776) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 3: {
                                                                        if (var3_1 > -1004889949) ** GOTO lbl41
                                                                        if (var3_1 == -1736014685) break block43;
                                                                        if (var3_1 != -1004889949) {
                                                                            ** break;
                                                                        }
                                                                        break block44;
lbl41:
                                                                        // 1 sources

                                                                        if (var3_1 == -293249133) break block45;
                                                                        if (var3_1 != 1277773123) {
                                                                            Integer.rotateRight(-791662129 ^ var1_2, 13) - 1301522252;
                                                                            ** break;
                                                                        }
                                                                        break block46;
                                                                    }
                                                                }
                                                                Integer.rotateRight(80591246 ^ var1_2, 3) - -1723394195;
                                                                return (float)(this.dk_2.nextDouble() * Double.longBitsToDouble(-8658867328347054332L ^ -4047181309919666428L) - 1.0);
                                                            }
                                                            Integer.rotateRight(1210296070 ^ var1_2, 12) - -1062283019;
                                                            yf.athz_2();
                                                            try {
                                                                if ((-3836228170969941133L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var2_3 = Integer.rotateLeft(var1_2 ^ -834067199, 20) + 1204387 - 1204387;
                                                            }
                                                            catch (NoSuchElementException v0) {
                                                                var2_3 = Integer.rotateLeft(var1_2 ^ -834067199, 20) + -1465754764 - -1465754764;
                                                            }
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(501413298 ^ var1_2, 6) + -1562812471) * 501413299;
                                                        if (yf.khdha_2()) {
                                                            (int)(3352974892420703131L ^ (long)var1_2 ^ -5999784643219296063L);
                                                            var2_3 = Integer.rotateLeft(var1_2 ^ -1345020011, 20);
                                                            (int)(-6620941919037801862L ^ (long)var1_2 ^ -7080214728473909782L);
                                                            var2_3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var1_2 ^ -834067199, 20)));
                                                            continue;
                                                        }
                                                        var2_3 = Integer.rotateLeft(var1_2 ^ -1581388217, 20) + -1515417271 - -1515417271;
                                                        (Integer.rotateLeft(1809024345 ^ var1_2, 16) + 318424322) * 1809024345;
                                                        (int)(-6241659899393807537L ^ (long)var1_2 ^ -6072959949049626861L);
                                                        var2_3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var1_2 ^ 948497865, 20)));
                                                        ++var3_1;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(1076864995 ^ var1_2, 11) + -903679048;
                                                    var2_3 = Integer.rotateLeft(var1_2 ^ 1077708592, 20) + 1747063543 - 1747063543;
                                                    Integer.rotateLeft(-796092663 ^ var1_2, 13) + 1164175698;
                                                    (int)(1314551037408111439L ^ (long)var1_2 ^ -8135608578385278547L);
                                                    try {
                                                        ++var3_1;
                                                        if ((-5067770957927261263L ^ (long)var1_2 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) ^ -627402493 ^ -627402493;
                                                    }
                                                    catch (UnsupportedOperationException v1) {
                                                        var2_3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var1_2 ^ 922665500, 20)));
                                                    }
                                                    ++var3_1;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1895114363 ^ var1_2, 17) + -1307752416) * 1895114363;
                                                try {
                                                    var3_1 += 2;
                                                    if ((5747283332573472363L ^ (long)var1_2 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    var2_3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var1_2 ^ 922665500, 20)));
                                                }
                                                catch (NoSuchElementException v2) {
                                                    var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) + 1863932016 - 1863932016;
                                                }
                                                var3_1 += 3;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-23280976 ^ var1_2, 18) + -648465781) * -23280975;
                                            var2_3 = Integer.rotateLeft(var1_2 ^ 988501714, 20) ^ 1680197777 ^ 1680197777;
                                            Integer.rotateRight(-1911871410 ^ var1_2, 4) - 934772909;
                                            var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) + 584303326 - 584303326;
                                            --var3_1;
                                            continue;
                                        }
                                        Integer.rotateRight(118934823 ^ var1_2, 3) - -534743308;
                                        var2_3 = (int)((long)Integer.rotateLeft(var1_2 ^ 538617258, 20) ^ 3250021266151169941L ^ 3250021266151169941L);
                                        Integer.rotateRight(1072731983 ^ var1_2, 10) - -1031802420;
                                        var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) ^ 1647082993 ^ 1647082993;
                                        var3_1 += 2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(1492205309 ^ var1_2, 14) - -913031202) * 1492205309;
                                    (int)(-7330856613452649649L ^ (long)var1_2 ^ -2526375242495387306L);
                                    (int)(-2648414013068626551L ^ (long)var1_2 ^ 2272511806263270316L);
                                    var2_3 = (int)((long)Integer.rotateLeft(var1_2 ^ 922665500, 20) ^ -5147496115447955019L ^ -5147496115447955019L);
                                    continue;
                                }
                                (Integer.rotateLeft(976512533 ^ var1_2, 10) - 280361926) * 976512533;
                                (int)(-538523030631683249L ^ (long)var1_2 ^ 7863429097848331484L);
                                var2_3 = Integer.rotateLeft(var1_2 ^ 1570337299, 20) ^ 107466809 ^ 107466809;
                                Integer.rotateLeft(-83723031 ^ var1_2, 18) + 1772797810;
                                (int)(4157054264706132815L ^ (long)var1_2 ^ 6402011018766704304L);
                                var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) + 331491932 - 331491932;
                                (Integer.rotateRight(125783346 ^ var1_2, 3) + -322439095) * 125783347;
                                var3_1 += 5;
                                continue;
                            }
                            (Integer.rotateLeft(1884869785 ^ var1_2, 17) + -1625334334) * 1884869785;
                            (int)(-5554492344946594993L ^ (long)var1_2 ^ 592367499458693125L);
                            var2_3 = Integer.rotateLeft(var1_2 ^ 1278000868, 20);
                            Integer.rotateLeft(778943745 ^ var1_2, 8) + -1549303206;
                            (int)(-1378361811864851633L ^ (long)var1_2 ^ -2663735031130196881L);
                            var2_3 = (int)((long)Integer.rotateLeft(var1_2 ^ 1593699300, 20) ^ -882013874685702265L ^ -882013874685702265L);
                            Integer.rotateRight(-1450201718 ^ var1_2, 8) + -1933335823;
                            var2_3 = (int)((long)Integer.rotateLeft(var1_2 ^ 922665500, 20) ^ 3181201209426607750L ^ 3181201209426607750L);
                            --var3_1;
                            continue;
                        }
                        (Integer.rotateLeft(-556499652 ^ var1_2, 14) - 1624447) * -556499651;
                        try {
                            var3_1 += 3;
                            if ((-1660279210974498035L ^ (long)var1_2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var2_3 = (int)((long)Integer.rotateLeft(var1_2 ^ 922665500, 20) ^ -2443559970618206131L ^ -2443559970618206131L);
                        }
                        catch (UnsupportedOperationException v3) {
                            var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20);
                        }
                        var3_1 += 3;
                        continue;
                    }
                    (Integer.rotateLeft(-1336025315 ^ var1_2, 9) - 1606132670) * -1336025315;
                    (int)(8281962622678788943L ^ (long)var1_2 ^ 2247440362517383183L);
                    var2_3 = (int)((long)Integer.rotateLeft(var1_2 ^ -1812376695, 20) ^ -7727559483125503965L ^ -7727559483125503965L);
                    Integer.rotateRight(-824777938 ^ var1_2, 12) - 274932173;
                    try {
                        ++var3_1;
                        if ((-5791760026313061679L ^ (long)var1_2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) + 763449288 - 763449288;
                    }
                    catch (UnsupportedOperationException v4) {
                        var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) + 1198895846 - 1198895846;
                    }
                    var3_1 += 5;
                    continue;
                }
                (Integer.rotateLeft(814145360 ^ var1_2, 9) + -458053141) * 814145361;
                try {
                    if ((-5682340688190605149L ^ (long)var1_2 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) + -892456544 - -892456544;
                }
                catch (IllegalStateException v5) {
                    var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) ^ 938982572 ^ 938982572;
                }
                var3_1 += 5;
                continue;
            }
            (Integer.rotateRight(-616227465 ^ var1_2, 14) - -1849937756) * -616227465;
            var2_3 = Integer.rotateLeft(var1_2 ^ 1207277954, 20) + 1912223846 - 1912223846;
            Integer.rotateRight(1707717763 ^ var1_2, 15) + 1472887576;
            (int)(-7442094776078589734L ^ (long)var1_2 ^ 4685576106341997729L);
            var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20) + -38988917 - -38988917;
            var3_1 += 5;
            continue;
lbl224:
            // 8 sources

            Integer.rotateRight(-1763404922 ^ var1_2, 5) - 1242266741;
            var2_3 = Integer.rotateLeft(var1_2 ^ 922665500, 20);
        }
    }

    private float znz_3(float f, float f2) {
        block0: {
            int n = -1853296345;
            n = Integer.rotateLeft(n * 0x1661061, 10) ^ 0xF12AB6C1;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 5);
            int n2 = n ^ 0xC8B56250;
            if ((n2 ^ n) == -927636912) break block0;
            int cfr_ignored_0 = (0x593D9377 ^ n) - -284404442;
        }
        return f + (float)sa.bfdh(this.dk_2) * (f2 - f);
    }

    private static bsd_2 dhshgh(thy thy2) {
        int n = -873477785;
        int n2 = (n = Integer.rotateLeft(n * -710338969, 25) ^ 0xC84EF229) ^ 0xC6AA5364;
        if ((n2 ^ n) != -961916060) {
            int cfr_ignored_0 = (0xD459A03 ^ n) - 1603079235;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return switch (thy2.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> tmj;
            case 1 -> sak_2;
            case 2 -> rak;
        };
    }

    private static String ghad(String string, int n, int n2, int n3) {
        int n4 = 1079903131;
        n4 = Integer.rotateLeft(n4 * 1393460453, 21) ^ 0x15533231;
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 9)) ^ 0xDD36DC43;
        if ((n5 ^ n4) != -583607229) {
            int cfr_ignored_0 = (0x9D68DFD8 ^ n4) + -1453045288;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x7B316EC5) + i ^ htdh_2, 11) ^ n2 + shagh_2));
        }
        return new String(cArray);
    }

    private static float dlm_2(bsd_2 bsd2) {
        block0: {
            int n = -1234482279;
            int n2 = (n = Integer.rotateLeft(n * -445933771, 24) ^ 0x9A5EC670) ^ 0xD091353;
            if ((n2 ^ n) == 218698579) break block0;
            int cfr_ignored_0 = (0xBB6258CA ^ n) - -1985104918;
        }
        return bsd2.wristLimit();
    }

    private static float tzt_8(sa sa2, float f, float f2) {
        block0: {
            int n = -2135287929;
            n = Integer.rotateLeft(n * 1645075143, 6) ^ 0xEE6C0F01;
            sa sa3 = sa2;
            n = (sa3 != null ? System.identityHashCode(sa3) : 0) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 27);
            int n2 = n ^ 0xF7290B64;
            if ((n2 ^ n) == -148305052) break block0;
            int cfr_ignored_0 = (0x77931CE3 ^ n) + -78725768;
        }
        return sa2.znz_3(f, f2);
    }

    private static void shdd_4(sa sa2, tda_2 tda2) {
        int n = -1539777945;
        n = Integer.rotateLeft(n * -877229545, 23) ^ 0x5A0C8626;
        sa sa3 = sa2;
        n = Integer.rotateLeft((sa3 != null ? System.identityHashCode(sa3) : 0) ^ n, 25);
        int n2 = n ^ 0xB4B8A8E3;
        if ((n2 ^ n) != -1262966557) {
            int cfr_ignored_0 = (0x10807284 ^ n) - -2013394064;
        }
        sa2.had_3(tda2);
    }

    private static float zqdh_2(float f, float f2, float f3) {
        block0: {
            int n = 345141792;
            n = Integer.rotateLeft(n * -1515196587, 6) ^ 0xB8695078;
            n = Integer.rotateRight(Float.floatToIntBits(f2) ^ n, 6);
            n = Integer.rotateLeft(Float.floatToIntBits(f3) ^ n, 5);
            int n2 = n ^ 0x79EDB66D;
            if ((n2 ^ n) == 2045621869) break block0;
            int cfr_ignored_0 = (0x6D7FC44D ^ n) + 401698140;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float bsq_2(sa sa2, float f, float f2) {
        block0: {
            int n = -1844528751;
            n = Integer.rotateLeft(n * -742776949, 7) ^ 0xF4D64493;
            sa sa3 = sa2;
            n = Integer.rotateRight((sa3 != null ? System.identityHashCode(sa3) : 0) ^ n, 3);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xFCAEDF87;
            if ((n2 ^ n) == -55648377) break block0;
            int cfr_ignored_0 = (0x6EA06616 ^ n) + 1564294281;
        }
        return sa2.znz_3(f, f2);
    }

    private static int dza_3(bsd_2 bsd2) {
        block0: {
            int n = 420164090;
            n = Integer.rotateLeft(n * -664376423, 21) ^ 0xE186E73B;
            bsd_2 bsd3 = bsd2;
            n = (bsd3 != null ? System.identityHashCode(bsd3) : 0) ^ n;
            int n2 = n ^ 0x806FD99B;
            if ((n2 ^ n) == -2140153445) break block0;
            int cfr_ignored_0 = (0x9964E861 ^ n) - -1284418330;
        }
        return bsd2.maximumGainDuration();
    }

    private static float ahs_3(bsd_2 bsd2) {
        block0: {
            int n = 893090997;
            int n2 = (n = Integer.rotateLeft(n * -894670057, 11) ^ 0xF29268A5) ^ 0xA170DB66;
            if ((n2 ^ n) == -1586439322) break block0;
            int cfr_ignored_0 = (0x944BA7D3 ^ n) + -1812601324;
        }
        return bsd2.maximumPrecisionGainDeviation();
    }

    private static float thsth_2(bsd_2 bsd2) {
        block0: {
            int n = bdhh_2.zra_2(-1376665583);
            bsd_2 bsd3 = bsd2;
            n = Integer.rotateRight((bsd3 != null ? System.identityHashCode(bsd3) : 0) ^ n, 17);
            int n2 = n ^ 0x22A31FAB;
            if ((n2 ^ n) == 581115819) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8F52DFBA ^ n, 4) + 1600566977) * -1890394181;
        }
        return bsd2.maximumPrecisionGainDeviation();
    }

    private static float rrdh(float f, float f2, float f3) {
        block0: {
            int n = 1033015807;
            n = Integer.rotateLeft(n * -382602125, 8) ^ 0x336A60DD;
            n = Float.floatToIntBits(f2) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f3) ^ n, 14);
            int n2 = n ^ 0x2F9FC942;
            if ((n2 ^ n) == 799000898) break block0;
            int cfr_ignored_0 = (0x120D58BD ^ n) - 581219739;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float thnl(sa sa2, float f, float f2) {
        block0: {
            int n = 153485337;
            n = Integer.rotateLeft(n * -1693078887, 17) ^ 0x590B8D5B;
            sa sa3 = sa2;
            n = Integer.rotateRight((sa3 != null ? System.identityHashCode(sa3) : 0) ^ n, 23);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x7A58DCD5;
            if ((n2 ^ n) == 2052644053) break block0;
            int cfr_ignored_0 = (0x737EDCCC ^ n) - -1264800809;
        }
        return sa2.znz_3(f, f2);
    }

    private static float shath_2(sa sa2) {
        block0: {
            int n = -553839260;
            n = Integer.rotateLeft(n * 1475968353, 13) ^ 0xDB0E68A6;
            sa sa3 = sa2;
            n = Integer.rotateLeft((sa3 != null ? System.identityHashCode(sa3) : 0) ^ n, 9);
            int n2 = n ^ 0x70779AFE;
            if ((n2 ^ n) == 1886886654) break block0;
            int cfr_ignored_0 = (0xAE8A8F9A ^ n) + 1063374721;
        }
        return sa2.khbsh();
    }

    private static double bfdh(SplittableRandom splittableRandom) {
        block0: {
            int n = bdhh_2.zra_2(1916261202);
            SplittableRandom splittableRandom2 = splittableRandom;
            n = Integer.rotateRight((splittableRandom2 != null ? System.identityHashCode(splittableRandom2) : 0) ^ n, 4);
            int n2 = n ^ 0xAC9E0B22;
            if ((n2 ^ n) == -1398928606) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xDEA9D870 ^ n, 14) + -85011253) * -559294351;
        }
        return splittableRandom.nextDouble();
    }

    private static String[] hfb(String string) {
        block0: {
            int n = -1630166700;
            n = Integer.rotateLeft(n * 1662382025, 17) ^ 0x4A54BDFB;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 7);
            int n2 = n ^ 0x8CB575E2;
            if ((n2 ^ n) == -1934264862) break block0;
            int cfr_ignored_0 = (0x1260D4B6 ^ n) - -883943200;
        }
        return string.split("\b\u001e", -1);
    }

    private static CallSite thghq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1070081153;
            n3 = Integer.rotateLeft(n3 * -1172629485, 20) ^ 0x312A9408;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 11);
            int n4 = n3 ^ 0x710AE329;
            if ((n4 ^ n3) != 1896538921) {
                int cfr_ignored_0 = (0x4EC2C7A8 ^ n3) - -818550887;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rzd_3 ^ string.hashCode() ^ n2 + dhshr ^ i * -1320198767 ^ rzd_3, 4) ^ dhshr));
            }
            String[] stringArray = sa.hfb(new String(cArray));
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

    private static String[] gkkgvyhm5(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gpjiy13e(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ opd89dga ^ string.hashCode() ^ n2 + lyibzju9mmeq5 + i * 534201807) + opd89dga) ^ lyibzju9mmeq5));
            }
            String[] stringArray = sa.gkkgvyhm5(new String(cArray));
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

