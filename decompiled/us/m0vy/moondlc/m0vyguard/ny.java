/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 *  net.minecraft.class_4050
 *  net.minecraft.class_746
 *  org.jetbrains.annotations.ApiStatus$Internal
 *  org.jetbrains.annotations.Nullable
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import net.minecraft.class_4050;
import net.minecraft.class_746;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import us.m0vy.moondlc.m0vyguard.btth;
import us.m0vy.moondlc.m0vyguard.bzd;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bghl;
import us.m0vy.moondlc.m0vyguard.bmm;
import us.m0vy.moondlc.m0vyguard.bnsh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.my;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class ny
implements tthy {
    private final bghl hghkh;
    private lb tydh = lb.thah_3;
    private final lb rba = lb.thah_3;
    private lb shd_6 = lb.thah_3;
    private lb khghl = lb.thah_3;
    private btth tkhd = btth.stha_3;
    @Nullable
    private my zff;
    private final tkhd_2 zmh = new tkhd_2();
    private static final int hlkh = 1078451926;
    private static final int zza = -79791816;
    private static final int km48cionn3pzr = -2008828278;
    private static final int k8a4hiqdnu = -1103671863;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zwl5wjn8m;

    public ny(bghl bghl2) {
        this.hghkh = bghl2;
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    public boolean smf() {
        int n = -120779422;
        n = Integer.rotateLeft(n * -1792351277, 5) ^ 0x76111BE5;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE8ADCF24;
        if ((n2 ^ n) != -391262428) {
            int cfr_ignored_0 = (0x1060C246 ^ n) - 1641020654;
        }
        return this.tkhd == btth.stha_3;
    }

    public void shgh_5() {
        int n = 1160060459;
        n = Integer.rotateLeft(n * -751982665, 5) ^ 0x7FC65097;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
        int n2 = n ^ 0xBA3EEA84;
        if ((n2 ^ n) != -1170281852) {
            int cfr_ignored_0 = (0xFF1BF4AF ^ n) - -1621133808;
        }
        this.zff = null;
        this.tkhd = btth.stha_3;
    }

    @ApiStatus.Internal
    public void hzsh() {
        this.shd_6 = this.tydh;
        if (this.zff == null) {
            this.tydh = this.dhhf();
            this.tkhd = btth.stha_3;
        } else if (this.zmh.tagh(70L)) {
            if (this.dhhf().rtz_3(this.tydh) < 1.0f) {
                this.tkhd = btth.stha_3;
                this.zff = null;
            } else {
                this.tkhd = btth.jda;
                this.tydh = this.tal_3(this.tydh, new lb(this.szs_7(this.tydh.sry(), this.dhhf().sry(), this.zff.shsy()), this.szs_7(this.tydh.khdhd_2(), this.dhhf().khdhd_2(), this.zff.shsy())));
            }
        } else {
            this.tkhd = btth.thjdh;
            this.tydh = this.tal_3(this.tydh, new lb(this.szs_7(this.tydh.sry(), this.zff.shdhn().sry(), this.zff.bfy()), this.szs_7(this.tydh.khdhd_2(), this.zff.shdhn().khdhd_2(), this.zff.dzkh_4())));
        }
    }

    public void aak_2(float f) {
        if (ny.mc.field_1724 != null) {
            float f2 = class_3532.method_17821((float)f, (float)this.shd_6.sry(), (float)this.tydh.sry());
            float f3 = class_3532.method_16439((float)f, (float)this.shd_6.khdhd_2(), (float)this.tydh.khdhd_2());
            f3 = class_3532.method_15363((float)f3, (float)-90.0f, (float)90.0f);
            this.khghl = new lb(f2, f3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void dzj_4(lb var1_1, bnsh var2_2, float var3_3, float var4_4, float var5_5, bmm var6_6) {
        var9_7 = 0;
        var7_8 = 1929549368;
        var7_8 = Integer.rotateLeft(var7_8 * 1164317291, 11) ^ -1780133227;
        var7_8 = Integer.rotateRight(System.identityHashCode(this) ^ var7_8, 29);
        v0 = var2_2;
        var7_8 = Integer.rotateLeft((v0 != null ? System.identityHashCode((Object)v0) : 0) ^ var7_8, 27);
        var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131;
        block21: while (true) {
            block28: {
                block27: {
                    if ((var9_7 = var8_9 - -613231131 ^ -613231131 ^ var7_8) == -1779456478) break block27;
                    if (var9_7 == -583292706) ** GOTO lbl114
                    break block28;
                }
                Integer.rotateRight(762544195 ^ var7_8, 8) + -2057689256;
                if (ny.thd_7()) {
                    if (!bzd.ghts_3(var7_8, -1531307793)) {
                        (Integer.rotateLeft(-38435948 ^ var7_8, 18) - -1118269913) * -38435947;
                    }
                    var8_9 = (var7_8 ^ 1494195067 ^ -613231131) + -613231131 ^ 1034798129 ^ 1034798129;
                    continue;
                }
                var8_9 = (var7_8 ^ -1975608892 ^ -613231131) + -613231131 + -249621430 - -249621430;
                Integer.rotateRight(1761922342 ^ var7_8, 16) - -1141737771;
                continue;
            }
            switch (var9_7) {
                case 1494195067: {
                    Integer.rotateRight(-1102650837 ^ var7_8, 10) + 250806896;
                    throw null;
                }
                case -1975608892: {
                    (Integer.rotateRight(-1752559525 ^ var7_8, 5) + 1578474048) * -1752559525;
                    this.tdq_2(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
                    return;
                }
                case -354068330: {
                    Integer.rotateRight(-1847900670 ^ var7_8, 5) + -1377101447;
                    var8_9 = (var7_8 ^ 1826498354 ^ -613231131) + -613231131 + -612512283 - -612512283;
                    (Integer.rotateRight(-586558401 ^ var7_8, 14) - -930196772) * -586558401;
                    var8_9 = (var7_8 ^ -398690889 ^ -613231131) + -613231131 + 1658180582 - 1658180582;
                    Integer.rotateRight(-349623893 ^ var7_8, 16) + 2119805680;
                    var8_9 = Integer.reverse(Integer.reverse((var7_8 ^ -1779456478 ^ -613231131) + -613231131));
                    var9_7 += 2;
                    continue block21;
                }
                case 376227171: {
                    (Integer.rotateLeft(0x7939399 ^ var7_8, 3) + -281248062) * 0x7939399;
                    (int)(-4242041598754100401L ^ (long)var7_8 ^ -8775119725471979629L);
                    if (!bzd.ghts_3(var7_8, 1543655241)) {
                        Integer.rotateRight(-907155093 ^ var7_8, 12) + 2016207664;
                    }
                    var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131 ^ 8988673 ^ 8988673;
                    var9_7 += 4;
                    continue block21;
                }
                case 1196971179: {
                    (Integer.rotateLeft(1552121148 ^ var7_8, 14) - 944359807) * 1552121149;
                    var8_9 = (int)((long)((var7_8 ^ 610821711 ^ -613231131) + -613231131) ^ -8124049086874754539L ^ -8124049086874754539L);
                    (Integer.rotateRight(295292410 ^ var7_8, 5) + 637374593) * 295292411;
                    try {
                        var9_7 -= 4;
                        if ((-192094061812930215L ^ (long)var7_8 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131 + 1304654628 - 1304654628;
                    }
                    catch (IllegalStateException v1) {
                        var8_9 = Integer.reverse(Integer.reverse((var7_8 ^ -1779456478 ^ -613231131) + -613231131));
                    }
                    --var9_7;
                    continue block21;
                }
                case -897714440: {
                    (Integer.rotateLeft(1767593177 ^ var7_8, 16) + -965941886) * 1767593177;
                    (int)(-6059035965822538929L ^ (long)var7_8 ^ 628396296477669890L);
                    var8_9 = (int)((long)((var7_8 ^ -1943440417 ^ -613231131) + -613231131) ^ 5261958643220824636L ^ 5261958643220824636L);
                    Integer.rotateRight(971764874 ^ var7_8, 10) + 133184497;
                    var8_9 = Integer.reverse(Integer.reverse((var7_8 ^ -1779456478 ^ -613231131) + -613231131));
                    var9_7 += 2;
                    continue block21;
                }
                case -719877959: {
                    Integer.rotateLeft(741189165 ^ var7_8, 8) - 1575272110;
                    (int)(-1252273305904944305L ^ (long)var7_8 ^ -1346432140124327697L);
                    try {
                        ++var9_7;
                        var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131 + -688407182 - -688407182;
                    }
                    catch (UnsupportedOperationException v2) {
                        var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131 ^ 1340356792 ^ 1340356792;
                    }
                    var9_7 -= 2;
                    continue block21;
                }
                case 1658923891: {
                    (Integer.rotateLeft(1811640144 ^ var7_8, 16) + 399514091) * 1811640145;
                    var8_9 = (var7_8 ^ 48722838 ^ -613231131) + -613231131;
                    Integer.rotateRight(1265732579 ^ var7_8, 12) + 656248760;
                    try {
                        var9_7 += 3;
                        var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131;
                    }
                    catch (ArithmeticException v3) {
                        var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131 ^ -1007150536 ^ -1007150536;
                    }
                    var9_7 -= 2;
                    continue block21;
                }
lbl114:
                // 1 sources

                Integer.rotateLeft(570398733 ^ var7_8, 7) - 575736014;
                (int)(-2067937073438594225L ^ (long)var7_8 ^ -7993745190123181237L);
                var8_9 = (var7_8 ^ -412971321 ^ -613231131) + -613231131 + -1072111263 - -1072111263;
                (Integer.rotateRight(493318774 ^ var7_8, 6) - -1813742715) * 493318775;
                (int)(4195024502833297438L ^ (long)var7_8 ^ -8327566569540691522L);
                var8_9 = (var7_8 ^ -1618732290 ^ -613231131) + -613231131 ^ 7718636 ^ 7718636;
                (int)(4649043676192566582L ^ (long)var7_8 ^ -8331714543356269352L);
                var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131 ^ -744259275 ^ -744259275;
                --var9_7;
                continue block21;
                case -1180734299: {
                    (Integer.rotateLeft(2077666908 ^ var7_8, 18) - 56409183) * 2077666909;
                    (int)(-53740070819701328L ^ (long)var7_8 ^ -2733195007161380013L);
                    var8_9 = Integer.reverse(Integer.reverse((var7_8 ^ 990860602 ^ -613231131) + -613231131));
                    (int)(-1228943229242186079L ^ (long)var7_8 ^ 2898378038312202290L);
                    var8_9 = Integer.reverse(Integer.reverse((var7_8 ^ -1779456478 ^ -613231131) + -613231131));
                    continue block21;
                }
                case 431557268: {
                    Integer.rotateRight(1832672546 ^ var7_8, 16) + 1051518553;
                    var8_9 = (var7_8 ^ -2116055419 ^ -613231131) + -613231131 + -2056777108 - -2056777108;
                    (Integer.rotateRight(-1732139465 ^ var7_8, 6) - -2083471388) * -1732139465;
                    try {
                        var9_7 -= 2;
                        if ((-7233578329224015273L ^ (long)var7_8 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131 + -659428691 - -659428691;
                    }
                    catch (IllegalStateException v4) {
                        var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131;
                    }
                    ++var9_7;
                    continue block21;
                }
                case -114489983: {
                    (Integer.rotateLeft(1871097532 ^ var7_8, 16) - -2052274177) * 1871097533;
                    var8_9 = Integer.reverse(Integer.reverse((var7_8 ^ -765348669 ^ -613231131) + -613231131));
                    Integer.rotateLeft(729394888 ^ var7_8, 8) + 1209649523;
                    var8_9 = (var7_8 ^ 1621562822 ^ -613231131) + -613231131 ^ 708412910 ^ 708412910;
                    (Integer.rotateLeft(824897433 ^ var7_8, 9) + -124738878) * 824897433;
                    (int)(-893892352734336177L ^ (long)var7_8 ^ 9095163595934157537L);
                    var8_9 = (int)((long)((var7_8 ^ -1779456478 ^ -613231131) + -613231131) ^ -8532221251187624271L ^ -8532221251187624271L);
                    var9_7 -= 5;
                    continue block21;
                }
            }
            Integer.rotateLeft(1698086852 ^ var7_8, 15) - 1174329335;
            var8_9 = (var7_8 ^ -1779456478 ^ -613231131) + -613231131 + -1173172736 - -1173172736;
        }
    }

    public boolean tna(lb lb2, bnsh bnsh2, float f, float f2, float f3, bmm bmm2) {
        try {
            int n = -57119882;
            n = Integer.rotateLeft(n * -1221299055, 3) ^ 0x6CC4B412;
            n = Float.floatToIntBits(f3) ^ n;
            bmm bmm3 = bmm2;
            n = Integer.rotateLeft((bmm3 != null ? System.identityHashCode((Object)bmm3) : 0) ^ n, 15);
            int n2 = n ^ 0xC10B907E;
            if ((n2 ^ n) != -1056206722) {
                int cfr_ignored_0 = (0x3D93FB08 ^ n) + 593661370;
            }
            if ((0x2E4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!ny.hrz_2(this, lb2, bnsh2, f, f2, f3, bmm2)) {
            int n = 0;
            if (yf.tdhth_2() == 0) {
                n = n ^ 0x7599;
            }
            return n != 0;
        }
        this.tydh = lb2;
        this.tkhd = btth.thjdh;
        this.zmh.zat();
        return true;
    }

    private boolean tdq_2(lb lb2, bnsh bnsh2, float f, float f2, float f3, bmm bmm2) {
        try {
            int n = 1676976618;
            n = Integer.rotateLeft(n * 759289233, 6) ^ 0x5C221181;
            n = System.identityHashCode(this) ^ n;
            lb lb3 = lb2;
            n = Integer.rotateLeft((lb3 != null ? System.identityHashCode(lb3) : 0) ^ n, 22);
            int n2 = n ^ 0xA27FF486;
            if ((n2 ^ n) != -1568672634) {
                int cfr_ignored_0 = (0xC18B556C ^ n) - -1547070187;
            }
            if ((0x1DD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        int n = bmm2.getPriority();
        if (this.zff == null || ny.dtd_7(this.zff) <= n || this.tkhd != btth.thjdh) {
            lb2.dzdh_4(ny.dt_2(this.zff == null ? this.dhhf().sry() : this.zff.shdhn().sry(), lb2.sry()));
            this.zff = new my(lb2, bnsh2, f, f2, f3, n);
            this.zmh.zat();
            return true;
        }
        return false;
    }

    public void jghth(lb lb2, bnsh bnsh2, float f, float f2, float f3) {
        int n = bzd.bnq(1423559984);
        n = System.identityHashCode(this) ^ n;
        lb lb3 = lb2;
        n = (lb3 != null ? System.identityHashCode(lb3) : 0) ^ n;
        int n2 = n ^ 0x3D1A31EA;
        if ((n2 ^ n) != 1025126890) {
            int cfr_ignored_0 = (Integer.rotateRight(0x69C3FCDA ^ n, 16) + -753320543) * 1774451931;
        }
        ny.shaj(this, lb2, bnsh2, f, f2, f3, bmm.rsw);
    }

    public void dksh(lb lb2, bmm bmm2) {
        int n = bzd.bnq(1026951856);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0xAEFBC496;
        if ((n2 ^ n) != -1359231850) {
            int cfr_ignored_0 = Integer.rotateRight(0x93CDCE26 ^ n, 5) - -364276267;
        }
        this.dzj_4(lb2, bnsh.ghn, Float.intBitsToFloat(Integer.rotateLeft(0x235828EC ^ 0x23DE40EC, 7)), Float.intBitsToFloat(Integer.reverse(-1749941007) ^ 0xCC144DE9), Float.intBitsToFloat(Integer.rotateLeft(0x45F51819 ^ 0xE5F51A00, 21)), bmm2);
    }

    /*
     * Unable to fully structure code
     */
    public void hzj_2(lb var1_1) {
        var4_2 = 0;
        var2_3 = 1793723217;
        var2_3 = Integer.rotateLeft(var2_3 * 1985904911, 22) ^ -530980894;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 14);
        v0 = var1_1;
        var2_3 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3;
        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 362971041 ^ 332127992) + 332127992));
        while (true) {
            block26: {
                block28: {
                    block35: {
                        block33: {
                            block29: {
                                block25: {
                                    block31: {
                                        block36: {
                                            block34: {
                                                block27: {
                                                    block32: {
                                                        block30: {
                                                            var4_2 = var3_4 - 332127992 ^ 332127992 ^ var2_3;
                                                            switch (var4_2 & 7) {
                                                                case 7: {
                                                                    if (var4_2 == -444450281) break block25;
                                                                    if (var4_2 == 691586423) break block26;
                                                                    if (var4_2 != 1064908367) {
                                                                        ** break;
                                                                    }
                                                                    break block27;
                                                                }
                                                                case 0: {
                                                                    if (var4_2 == 639513320) break block28;
                                                                    if (var4_2 != 1432421896) {
                                                                        ** break;
                                                                    }
                                                                    break block29;
                                                                }
                                                                case 1: {
                                                                    if (var4_2 == 362971041) break block30;
                                                                    if (var4_2 == 2117979449) break block31;
                                                                    (Integer.rotateLeft(-1260515687 ^ var2_3, 9) + -348036158) * -1260515687;
                                                                    (int)(8533372020863593295L ^ (long)var2_3 ^ -4884009647423799032L);
                                                                    if (var4_2 == -634905527) break;
                                                                    if (var4_2 != -1005367007) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 3: {
                                                                    if (var4_2 != 559271323) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 6: {
                                                                    if (var4_2 == -585012514) break block34;
                                                                    if (var4_2 != -1427115706) {
                                                                        Integer.rotateLeft(-736759644 ^ var2_3, 13) - -1291468009;
                                                                        ** break;
                                                                    }
                                                                    break block35;
                                                                }
                                                                case 4: {
                                                                    if (var4_2 != -1401718100) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                            }
                                                            Integer.rotateRight(-1284862462 ^ var2_3, 9) + -1102786183;
                                                            yf.athz_2();
                                                            var3_4 = (var2_3 ^ -1005367007 ^ 332127992) + 332127992;
                                                            --var4_2;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1805196216 ^ var2_3, 5) + -53263373;
                                                        if (!yf.khdha_2()) {
                                                            var3_4 = (int)((long)((var2_3 ^ -634905527 ^ 332127992) + 332127992) ^ -928154916958958771L ^ -928154916958958771L);
                                                            (Integer.rotateRight(514883762 ^ var2_3, 6) + -1145228087) * 514883763;
                                                            var4_2 += 4;
                                                            continue;
                                                        }
                                                        try {
                                                            var4_2 += 5;
                                                            if ((1708696223834066229L ^ (long)var2_3 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            var3_4 = (var2_3 ^ -1005367007 ^ 332127992) + 332127992;
                                                        }
                                                        catch (IllegalArgumentException v1) {
                                                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1005367007 ^ 332127992) + 332127992));
                                                        }
                                                        var4_2 += 2;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(539618246 ^ var2_3, 7) - -378459083;
                                                    this.dzj_4(var1_1, bnsh.ghn, Float.intBitsToFloat(1616298589 + -488817245), Float.intBitsToFloat(-1837831627 + -1329654325), ny.hdt_2(-1126569301 - 2040916651), bmm.rsw);
                                                    return;
                                                }
                                                Integer.rotateLeft(-457599832 ^ var2_3, 15) + -1227448429;
                                                (int)(-7551246386590358580L ^ (long)var2_3 ^ -2907606705623891016L);
                                                var3_4 = (var2_3 ^ 660673352 ^ 332127992) + 332127992;
                                                (int)(8448872413034103013L ^ (long)var2_3 ^ 2599960507690338129L);
                                                var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-1815649676 ^ var2_3, 5) - -377320633) * -1815649675;
                                            try {
                                                if ((-7417445285048848589L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992 + 64688578 - 64688578;
                                            }
                                            catch (NoSuchElementException v2) {
                                                var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992;
                                            }
                                            var4_2 += 4;
                                            continue;
                                        }
                                        Integer.rotateRight(894850830 ^ var2_3, 9) - 2043816429;
                                        try {
                                            var4_2 += 3;
                                            if ((-3429254112187075205L ^ (long)var2_3 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992 + 697938735 - 697938735;
                                        }
                                        catch (UnsupportedOperationException v3) {
                                            var3_4 = (int)((long)((var2_3 ^ 362971041 ^ 332127992) + 332127992) ^ 9004683468640916469L ^ 9004683468640916469L);
                                        }
                                        var4_2 += 3;
                                        continue;
                                    }
                                    (Integer.rotateRight(-258948206 ^ var2_3, 17) + 635784681) * -258948205;
                                    var3_4 = (var2_3 ^ -1307555810 ^ 332127992) + 332127992;
                                    (Integer.rotateLeft(-2096378703 ^ var2_3, 3) + -489985878) * -2096378703;
                                    (int)(4735924837259995983L ^ (long)var2_3 ^ 4064642812161371811L);
                                    var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992 + -1844893639 - -1844893639;
                                    ++var4_2;
                                    continue;
                                }
                                Integer.rotateLeft(-187689915 ^ var2_3, 17) - -1450175594;
                                (int)(3918899650992859983L ^ (long)var2_3 ^ -8538680745034923756L);
                                var3_4 = (var2_3 ^ -1580038156 ^ 332127992) + 332127992 + -1801970356 - -1801970356;
                                Integer.rotateRight(-1869312126 ^ var2_3, 5) + -2040856583;
                                var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992 ^ -567999102 ^ -567999102;
                                var4_2 += 3;
                                continue;
                            }
                            (Integer.rotateRight(-322375590 ^ var2_3, 16) + -1330464223) * -322375589;
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -601138148 ^ 332127992) + 332127992));
                            (Integer.rotateLeft(-1155667631 ^ var2_3, 10) + -1392713718) * -1155667631;
                            (int)(8768305529363950415L ^ (long)var2_3 ^ 8334055258908614287L);
                            var3_4 = (var2_3 ^ 1406804245 ^ 332127992) + 332127992 ^ -259558794 ^ -259558794;
                            (Integer.rotateLeft(-1561375435 ^ var2_3, 7) - -1084753754) * -1561375435;
                            (int)(6943955824642681679L ^ (long)var2_3 ^ 4278563794461486442L);
                            var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992;
                            var4_2 += 2;
                            continue;
                        }
                        (Integer.rotateRight(1149293943 ^ var2_3, 11) - 1341618340) * 1149293943;
                        var3_4 = (var2_3 ^ 940772950 ^ 332127992) + 332127992 + 777415543 - 777415543;
                        (Integer.rotateRight(-1303325186 ^ var2_3, 9) - -1675130627) * -1303325185;
                        (int)(3374179061683135120L ^ (long)var2_3 ^ 469980669318525047L);
                        var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992 ^ -758944234 ^ -758944234;
                        var4_2 -= 5;
                        continue;
                    }
                    (Integer.rotateLeft(-391413899 ^ var2_3, 16) - 824315494) * -391413899;
                    (int)(3033685931846855503L ^ (long)var2_3 ^ 6908665976845892066L);
                    var3_4 = (var2_3 ^ 907195515 ^ 332127992) + 332127992;
                    (Integer.rotateRight(-1715457158 ^ var2_3, 6) + -1566319871) * -1715457157;
                    (int)(-3707889126340598378L ^ (long)var2_3 ^ 2416453248413742276L);
                    var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992;
                    var4_2 += 3;
                    continue;
                }
                Integer.rotateRight(80427306 ^ var2_3, 3) + -1728476335;
                (int)(9140304283665379814L ^ (long)var2_3 ^ 4166903902218440800L);
                var3_4 = (int)((long)((var2_3 ^ 362971041 ^ 332127992) + 332127992) ^ -7867336350219248226L ^ -7867336350219248226L);
                continue;
            }
            Integer.rotateRight(1112876423 ^ var2_3, 11) - 212675220;
            var3_4 = (var2_3 ^ 1429475614 ^ 332127992) + 332127992;
            Integer.rotateLeft(107390221 ^ var2_3, 3) - -892625970;
            (int)(-4263770645758416049L ^ (long)var2_3 ^ -1508561726709685127L);
            var3_4 = (var2_3 ^ 362971041 ^ 332127992) + 332127992;
            var4_2 += 3;
            continue;
lbl193:
            // 7 sources

            (Integer.rotateRight(-778115434 ^ var2_3, 13) - 1721469797) * -778115433;
            var3_4 = (int)((long)((var2_3 ^ 362971041 ^ 332127992) + 332127992) ^ -1107238885166831243L ^ -1107238885166831243L);
        }
    }

    private float szs_7(float f, float f2, float f3) {
        float f4;
        float f5;
        int n = -1051995912;
        n = Integer.rotateLeft(n * 1693519907, 9) ^ 0xACF5E2FF;
        n = System.identityHashCode(this) ^ n;
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 26);
        int n2 = n ^ 0xA29E495F;
        if ((n2 ^ n) != -1566684833) {
            int cfr_ignored_0 = (0x63D599A7 ^ n) + -1076339338;
        }
        if ((f5 = Math.abs(f4 = bghdh.ttb_2(f, f2))) <= f3 || f3 >= Float.intBitsToFloat(219293429 + 908122379)) {
            return f2;
        }
        long l = ny.mc.field_1724 != null ? (long)ny.mc.field_1724.field_6012 : ny.rrh() / (0xC6726EC6F76C7676L ^ 0xC6726EC6F76C7644L);
        float f6 = 1.0f + (float)ny.dhths_2((double)l * ny.shzm_2(0xD02B9805A2779F6L ^ 0x32F98AB369144AC5L)) * Float.intBitsToFloat(Integer.reverse(1664385045) ^ 0x95A2FBCC);
        float f7 = (float)Math.sin(Math.min(1.0, (double)f5 / Double.longBitsToDouble(0x9D2D5F5247F0D791L ^ 0xDD4BDF5247F0D791L)) * Double.longBitsToDouble(0x526B810DD0CF3D40L ^ 0x6D92A0F6848B1058L)) * f6;
        float f8 = Math.max(f3 * f7, ny.ghrb(0x52453F1F ^ 0x6F09F3D2));
        if (f5 <= f8) {
            return f2;
        }
        return f + Math.signum(f4) * f8;
    }

    private lb tal_3(lb lb2, lb lb3) {
        block0: {
            int n = 375067962;
            n = Integer.rotateLeft(n * 1926312045, 22) ^ 0xA3AA976C;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
            lb lb4 = lb2;
            n = (lb4 != null ? System.identityHashCode(lb4) : 0) ^ n;
            int n2 = n ^ 0x3A7027D8;
            if ((n2 ^ n) == 980428760) break block0;
            int cfr_ignored_0 = (0x2C2B32E2 ^ n) + -918375252;
        }
        return bghdh.btdh(lb2, lb3);
    }

    /*
     * Unable to fully structure code
     */
    public void skhz_3(class_1297 var1_1, long var2_2, long var4_3, long var6_4, bmm var8_5, bnsh var9_6) {
        var10_7 = 0.0;
        var12_8 = 0.0;
        var14_9 = 0.0;
        var16_10 = 0.0;
        var18_11 = 0.0;
        var20_12 = 0.0;
        var22_13 = 0.0;
        var24_14 = 0.0f;
        var25_15 = 0.0f;
        var29_16 = 0;
        var27_17 = -1819404763;
        var27_17 = Integer.rotateLeft(var27_17 * -993401933, 21) ^ -1992796780;
        var27_17 = System.identityHashCode(this) ^ var27_17;
        v0 = var1_1;
        var27_17 = Integer.rotateRight((v0 != null ? System.identityHashCode(v0) : 0) ^ var27_17, 3);
        var28_18 = var27_17 - 307096200;
        while (true) {
            block71: {
                block62: {
                    block67: {
                        block57: {
                            block66: {
                                block58: {
                                    block59: {
                                        block65: {
                                            block54: {
                                                block56: {
                                                    block64: {
                                                        block61: {
                                                            block69: {
                                                                block55: {
                                                                    block60: {
                                                                        block53: {
                                                                            block63: {
                                                                                block70: {
                                                                                    block68: {
                                                                                        var29_16 = var27_17 - var28_18;
                                                                                        switch (var29_16 & 15) {
                                                                                            case 0: {
                                                                                                if (var29_16 != 473511952) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block53;
                                                                                            }
                                                                                            case 2: {
                                                                                                if (var29_16 == 1715908162) break block54;
                                                                                                if (var29_16 == -200210894) break block55;
                                                                                                if (var29_16 == -1656348798) break block56;
                                                                                                if (var29_16 == -483874334) break block57;
                                                                                                if (var29_16 != 947524706) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block58;
                                                                                            }
                                                                                            case 3: {
                                                                                                if (var29_16 == -141468285) break block59;
                                                                                                if (var29_16 == -417241933) break block60;
                                                                                                (Integer.rotateLeft(607294972 ^ var27_17, 7) - 1719519423) * 607294973;
                                                                                                if (var29_16 != -1981897677) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block61;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (var29_16 != 1413610404) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block62;
                                                                                            }
                                                                                            case 7: {
                                                                                                if (var29_16 == 1233620103) break;
                                                                                                ** break;
                                                                                            }
                                                                                            case 8: {
                                                                                                if (var29_16 != 307096200) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block63;
                                                                                            }
                                                                                            case 9: {
                                                                                                if (var29_16 == 683270361) break block64;
                                                                                                if (var29_16 == -1399571159) break block65;
                                                                                                if (var29_16 != 204074585) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block66;
                                                                                            }
                                                                                            case 11: {
                                                                                                if (var29_16 != 1679119467) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block67;
                                                                                            }
                                                                                            case 13: {
                                                                                                if (var29_16 != -1803650467) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block68;
                                                                                            }
                                                                                            case 14: {
                                                                                                if (var29_16 == -1315349090) break block69;
                                                                                                if (var29_16 != 699430222) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block70;
                                                                                            }
                                                                                            case 15: {
                                                                                                if (var29_16 != -1846633041) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block71;
                                                                                            }
                                                                                        }
                                                                                        Integer.rotateRight(1467082059 ^ var27_17, 13) + -1691851952;
                                                                                        var10_7 = var1_1.method_23317();
                                                                                        var12_8 = var1_1.method_23318() + (double)ny.aaz_2(var1_1, var1_1.method_18376());
                                                                                        var14_9 = var1_1.method_23321();
                                                                                        var16_10 = var10_7 - ny.mc.field_1724.method_23317();
                                                                                        var18_11 = var12_8 - (ny.mc.field_1724.method_23318() + (double)ny.mc.field_1724.method_18381(ny.mz(ny.mc.field_1724)));
                                                                                        var20_12 = var14_9 - ny.ddhb_2(ny.mc.field_1724);
                                                                                        var22_13 = Math.sqrt(var16_10 * var16_10 + var20_12 * var20_12);
                                                                                        var24_14 = (float)Math.toDegrees(Math.atan2(var20_12, var16_10)) - Float.intBitsToFloat(Integer.rotateLeft(733597895 ^ -1950756142, 21));
                                                                                        var25_15 = (float)(-Math.toDegrees(Math.atan2(var18_11, var22_13)));
                                                                                        var26_19 = new lb(var24_14, var25_15);
                                                                                        ny.khshh_2(this, var26_19, var9_6, var2_2, var4_3, var6_4, var8_5);
                                                                                        try {
                                                                                            var29_16 -= 4;
                                                                                            var28_18 = Integer.reverse(Integer.reverse(var27_17 - -1803650467));
                                                                                        }
                                                                                        catch (IllegalStateException v1) {
                                                                                            var28_18 = var27_17 - -1803650467;
                                                                                        }
                                                                                        ++var29_16;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateRight(770936630 ^ var27_17, 8) - -1797523771) * 770936631;
                                                                                    return;
                                                                                }
                                                                                Integer.rotateLeft(-1632997020 ^ var27_17, 6) - 989944407;
                                                                                throw null;
                                                                            }
                                                                            Integer.rotateRight(-1111898717 ^ var27_17, 10) + -35877384;
                                                                            if (yf.dnkh()) {
                                                                                try {
                                                                                    var29_16 += 4;
                                                                                    var28_18 = var27_17 - 699430222;
                                                                                }
                                                                                catch (IllegalArgumentException v2) {
                                                                                    var28_18 = Integer.reverse(Integer.reverse(var27_17 - 699430222));
                                                                                }
                                                                                ++var29_16;
                                                                                continue;
                                                                            }
                                                                            var28_18 = (int)((long)(var27_17 - -200210894) ^ -1864959946273687406L ^ -1864959946273687406L);
                                                                            var29_16 -= 2;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateRight(-1431354993 ^ var27_17, 8) - -1349087348;
                                                                        if (ny.mc.field_1724 == null) {
                                                                            var28_18 = var27_17 - -1803650467 ^ 1553636359 ^ 1553636359;
                                                                            (Integer.rotateRight(805402226 ^ var27_17, 9) + -729090295) * 805402227;
                                                                            var29_16 += 3;
                                                                            continue;
                                                                        }
                                                                        (int)(3377976362511428200L ^ (long)var27_17 ^ 740203194402467856L);
                                                                        var28_18 = var27_17 - 1233620103 + -946667909 - -946667909;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateLeft(-2035195680 ^ var27_17, 3) + 1406687835;
                                                                    if (ny.mc.field_1724 != null) {
                                                                        try {
                                                                            if ((6589992999318096837L ^ (long)var27_17 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            var28_18 = var27_17 - 1233620103 + 1481287559 - 1481287559;
                                                                        }
                                                                        catch (IllegalStateException v3) {
                                                                            var28_18 = (int)((long)(var27_17 - 1233620103) ^ -1858762786519484631L ^ -1858762786519484631L);
                                                                        }
                                                                        var29_16 -= 4;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        var28_18 = Integer.reverse(Integer.reverse(var27_17 - -1803650467));
                                                                    }
                                                                    catch (UnsupportedOperationException v4) {
                                                                        var28_18 = (int)((long)(var27_17 - -1803650467) ^ -3824731805997534933L ^ -3824731805997534933L);
                                                                    }
                                                                    var29_16 += 2;
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(1705862893 ^ var27_17, 15) - 1415386606;
                                                                (int)(-6404179348750537905L ^ (long)var27_17 ^ 7840911099711513582L);
                                                                if (var1_1 != null) {
                                                                    (int)(-2172198451772236933L ^ (long)var27_17 ^ 7455819543602032228L);
                                                                    var28_18 = var27_17 - 473511952;
                                                                    ++var29_16;
                                                                    continue;
                                                                }
                                                                try {
                                                                    --var29_16;
                                                                    var28_18 = (int)((long)(var27_17 - -1803650467) ^ -5358479235904097707L ^ -5358479235904097707L);
                                                                }
                                                                catch (UnsupportedOperationException v5) {
                                                                    var28_18 = var27_17 - -1803650467 ^ -601589280 ^ -601589280;
                                                                }
                                                                var29_16 -= 3;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(1492598413 ^ var27_17, 14) - -900844978;
                                                            (int)(-7330293732218705073L ^ (long)var27_17 ^ -2589425637278574246L);
                                                            (int)(-2638051001915443404L ^ (long)var27_17 ^ 8673574841314319126L);
                                                            var28_18 = var27_17 - 307096200;
                                                            var29_16 += 4;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-1222564007 ^ var27_17, 9) + 828465922) * -1222564007;
                                                        (int)(8472266387272035151L ^ (long)var27_17 ^ -1173043554470508810L);
                                                        (int)(3445466646483333581L ^ (long)var27_17 ^ 9088605459694088816L);
                                                        var28_18 = Integer.reverse(Integer.reverse(var27_17 - 307096200));
                                                        var29_16 += 4;
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(-1989054474 ^ var27_17, 4) - -1457902075) * -1989054473;
                                                    var28_18 = Integer.reverse(Integer.reverse(var27_17 - 307096200));
                                                    --var29_16;
                                                    continue;
                                                }
                                                (Integer.rotateRight(377402331 ^ var27_17, 5) + -1112185152) * 377402331;
                                                var28_18 = Integer.reverse(Integer.reverse(var27_17 - 307096200));
                                                (Integer.rotateRight(282778738 ^ var27_17, 5) + 249450761) * 282778739;
                                                var29_16 -= 5;
                                                continue;
                                            }
                                            Integer.rotateLeft(-1556445120 ^ var27_17, 7) + -931913989;
                                            var28_18 = (int)((long)(var27_17 - 628709583) ^ 7232824133721325877L ^ 7232824133721325877L);
                                            (Integer.rotateRight(1304790963 ^ var27_17, 12) + 1867058664) * 1304790963;
                                            try {
                                                var29_16 -= 2;
                                                if ((-7878340353724297137L ^ (long)var27_17 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                var28_18 = (int)((long)(var27_17 - 307096200) ^ -5537842967303875447L ^ -5537842967303875447L);
                                            }
                                            catch (IllegalStateException v6) {
                                                var28_18 = var27_17 - 307096200 + 1690919478 - 1690919478;
                                            }
                                            ++var29_16;
                                            continue;
                                        }
                                        (Integer.rotateLeft(1382714709 ^ var27_17, 13) - -12272506) * 1382714709;
                                        (int)(-8009613007026590897L ^ (long)var27_17 ^ -4926793843883864991L);
                                        try {
                                            var29_16 += 5;
                                            if ((-1712332268606113159L ^ (long)var27_17 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            var28_18 = (int)((long)(var27_17 - 307096200) ^ -7642904595788408486L ^ -7642904595788408486L);
                                        }
                                        catch (UnsupportedOperationException v7) {
                                            var28_18 = var27_17 - 307096200 ^ -2062481387 ^ -2062481387;
                                        }
                                        var29_16 += 4;
                                        continue;
                                    }
                                    Integer.rotateLeft(-682287612 ^ var27_17, 13) - 397164983;
                                    (int)(3094613322701353368L ^ (long)var27_17 ^ 8189616906393090101L);
                                    var28_18 = Integer.reverse(Integer.reverse(var27_17 - -444149694));
                                    (int)(3005285499355350064L ^ (long)var27_17 ^ 3101458253595803320L);
                                    var28_18 = var27_17 - 307096200;
                                    var29_16 += 5;
                                    continue;
                                }
                                (Integer.rotateLeft(1729851733 ^ var27_17, 15) - -2135926650) * 1729851733;
                                (int)(-6509426147949483185L ^ (long)var27_17 ^ 4873038945274357378L);
                                var28_18 = var27_17 - 1115430925 + -562844683 - -562844683;
                                (Integer.rotateLeft(-1626574116 ^ var27_17, 6) - 1189054431) * -1626574115;
                                (int)(-1866754313945823772L ^ (long)var27_17 ^ 1504158408640455166L);
                                var28_18 = var27_17 - -1086624998 ^ -1405972383 ^ -1405972383;
                                (int)(8774632438480399537L ^ (long)var27_17 ^ 9087200610411175514L);
                                var28_18 = var27_17 - 307096200 + 895087835 - 895087835;
                                var29_16 += 2;
                                continue;
                            }
                            Integer.rotateRight(-1920880469 ^ var27_17, 4) + 655492080;
                            var28_18 = (int)((long)(var27_17 - 307096200) ^ 7018220146905597941L ^ 7018220146905597941L);
                            (Integer.rotateRight(-455620194 ^ var27_17, 15) - -1166079651) * -455620193;
                            var29_16 -= 4;
                            continue;
                        }
                        (Integer.rotateRight(1999948799 ^ var27_17, 17) - 1942115100) * 1999948799;
                        var28_18 = (int)((long)(var27_17 - 307096200) ^ -4803865709031963952L ^ -4803865709031963952L);
                        Integer.rotateLeft(1574463564 ^ var27_17, 14) - 1636974703;
                        var29_16 += 4;
                        continue;
                    }
                    (Integer.rotateRight(1464651070 ^ var27_17, 13) - -1767212611) * 1464651071;
                    var28_18 = var27_17 - 2088182451 ^ -648430314 ^ -648430314;
                    Integer.rotateRight(1271189898 ^ var27_17, 12) + 825425649;
                    try {
                        var29_16 -= 3;
                        var28_18 = Integer.reverse(Integer.reverse(var27_17 - 307096200));
                    }
                    catch (IllegalStateException v8) {
                        var28_18 = (int)((long)(var27_17 - 307096200) ^ 7904022019726669L ^ 7904022019726669L);
                    }
                    var29_16 += 2;
                    continue;
                }
                (Integer.rotateRight(1447838358 ^ var27_17, 13) - 2006560613) * 1447838359;
                try {
                    if ((147593616119392095L ^ (long)var27_17 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    var28_18 = var27_17 - 307096200 + -360331379 - -360331379;
                }
                catch (IllegalArgumentException v9) {
                    var28_18 = (int)((long)(var27_17 - 307096200) ^ -2879714513174841929L ^ -2879714513174841929L);
                }
                var29_16 -= 3;
                continue;
            }
            Integer.rotateRight(1515517830 ^ var27_17, 14) - -190343051;
            try {
                if ((-5015387840032014207L ^ (long)var27_17 | 1L) == 0L) {
                    throw new IllegalStateException();
                }
                var28_18 = var27_17 - 307096200 ^ -377227808 ^ -377227808;
            }
            catch (IllegalStateException v10) {
                var28_18 = var27_17 - 307096200;
            }
            var29_16 += 4;
            continue;
lbl316:
            // 12 sources

            Integer.rotateLeft(-664152736 ^ var27_17, 14) + 959346139;
            var28_18 = (int)((long)(var27_17 - 307096200) ^ 9092292316585910359L ^ 9092292316585910359L);
        }
    }

    public lb stn_3(class_1309 class_13092) {
        int n = -499976489;
        n = Integer.rotateLeft(n * 1470461209, 9) ^ 0x22B21DC3;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
        class_1309 class_13093 = class_13092;
        n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 13);
        int n2 = n ^ 0xA61DE4C;
        if ((n2 ^ n) != 174186060) {
            int cfr_ignored_0 = (0xE853289B ^ n) + 362589420;
        }
        return new lb(ny.sfb(class_13092), ny.smn_2(class_13092));
    }

    public lb dhhf() {
        try {
            int n = -1563884397;
            n = Integer.rotateLeft(n * -799473685, 17) ^ 0xCD71AE15;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0xBBFEB4F8;
            if ((n2 ^ n) != -1140935432) {
                int cfr_ignored_0 = (0x1937B06B ^ n) + 53498929;
            }
            if ((0x1AA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return ny.mc.field_1724 == null ? lb.thah_3 : ny.dj(this, (class_1309)ny.mc.field_1724);
    }

    @Generated
    public bghl zrd_2() {
        return this.hghkh;
    }

    @Generated
    public lb dhdf() {
        block0: {
            int n = -1569530935;
            n = Integer.rotateLeft(n * -2018732847, 6) ^ 0x3D703D74;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0xB48B552D;
            if ((n2 ^ n) == -1265937107) break block0;
            int cfr_ignored_0 = (0x16F98EE4 ^ n) + 1716256981;
        }
        return this.tydh;
    }

    @Generated
    public lb wk() {
        block0: {
            int n = -1382575347;
            n = Integer.rotateLeft(n * 1920830805, 6) ^ 0x675884E3;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x97F2F20A;
            if ((n2 ^ n) == -1745686006) break block0;
            int cfr_ignored_0 = (0x3A656107 ^ n) + 2121050820;
        }
        return this.rba;
    }

    @Generated
    public lb dhkhr() {
        block0: {
            int n = 502841499;
            n = Integer.rotateLeft(n * 250917995, 26) ^ 0x77E7BEC9;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7B529142;
            if ((n2 ^ n) == 2069008706) break block0;
            int cfr_ignored_0 = (0x66AA51D9 ^ n) - -2038452470;
        }
        return this.shd_6;
    }

    @Generated
    public lb ghdh_2() {
        return this.khghl;
    }

    @Generated
    public btth hzd_2() {
        block0: {
            int n = -182682532;
            n = Integer.rotateLeft(n * 1629222169, 4) ^ 0x70FA9499;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x9F22D634;
            if ((n2 ^ n) == -1625106892) break block0;
            int cfr_ignored_0 = (0x6A3EAA68 ^ n) + -410170153;
        }
        return this.tkhd;
    }

    @Generated
    public tkhd_2 dbdh() {
        block0: {
            int n = -430411449;
            n = Integer.rotateLeft(n * 1210397877, 4) ^ 0x3097369;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 28);
            int n2 = n ^ 0x58D586C;
            if ((n2 ^ n) == 93149292) break block0;
            int cfr_ignored_0 = (0xE3D5292B ^ n) - 514025548;
        }
        return this.zmh;
    }

    @Generated
    public void hhn_2(lb lb2) {
        int n = -1118243731;
        int n2 = (n = Integer.rotateLeft(n * 1133678199, 8) ^ 0x3141B58) ^ 0x1420CAD4;
        if ((n2 ^ n) != 337693396) {
            int cfr_ignored_0 = (0xA9783EB9 ^ n) + -1340453933;
        }
        this.tydh = lb2;
    }

    @Generated
    public void shwa(lb lb2) {
        int n = -1365235377;
        n = Integer.rotateLeft(n * -1110272523, 9) ^ 0xB71D36ED;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA24A99DE;
        if ((n2 ^ n) != -1572169250) {
            int cfr_ignored_0 = (0xCEAB091 ^ n) + -1838966411;
        }
        this.shd_6 = lb2;
    }

    @Generated
    public void jagh(lb lb2) {
        this.khghl = lb2;
    }

    @Generated
    public void rkk(btth btth2) {
        int n = 1383399045;
        int n2 = (n = Integer.rotateLeft(n * 50879629, 26) ^ 0xF217B5C8) ^ 0x308D7D92;
        if ((n2 ^ n) != 814579090) {
            int cfr_ignored_0 = (0x62F98317 ^ n) - 2116138015;
        }
        this.tkhd = btth2;
    }

    @Generated
    public void smgh(@Nullable my my2) {
        int n = bzd.bnq(278864084);
        n = System.identityHashCode(this) ^ n;
        my my3 = my2;
        n = (my3 != null ? System.identityHashCode(my3) : 0) ^ n;
        int n2 = n ^ 0x6B441886;
        if ((n2 ^ n) != 1799624838) {
            int cfr_ignored_0 = (Integer.rotateRight(0x7BDB3852 ^ n, 18) + 65630505) * 2077964371;
        }
        this.zff = my2;
    }

    @Nullable
    @Generated
    public my tkhm() {
        block0: {
            int n = -1527956017;
            n = Integer.rotateLeft(n * 248048567, 15) ^ 0xE41CED19;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x9D57A6FE;
            if ((n2 ^ n) == -1655200002) break block0;
            int cfr_ignored_0 = (0x39BA9B31 ^ n) - -1313561846;
        }
        return this.zff;
    }

    private static boolean thd_7() {
        block0: {
            int n = -1605243075;
            int n2 = (n = Integer.rotateLeft(n * -1158163411, 10) ^ 0x38802EC0) ^ 0x7D55F172;
            if ((n2 ^ n) == 2102784370) break block0;
            int cfr_ignored_0 = (0xDD041E4F ^ n) + 1957304051;
        }
        return yf.dnkh();
    }

    private static boolean hrz_2(ny ny2, lb lb2, bnsh bnsh2, float f, float f2, float f3, bmm bmm2) {
        block0: {
            int n = bzd.bnq(-44411549);
            ny ny3 = ny2;
            n = Integer.rotateRight((ny3 != null ? System.identityHashCode(ny3) : 0) ^ n, 9);
            lb lb3 = lb2;
            n = Integer.rotateLeft((lb3 != null ? System.identityHashCode(lb3) : 0) ^ n, 25);
            int n2 = n ^ 0x64DBD539;
            if ((n2 ^ n) == 1692128569) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9981805A ^ n, 6) + -1693701599) * -1719566245;
        }
        return ny2.tdq_2(lb2, bnsh2, f, f2, f3, bmm2);
    }

    private static int dtd_7(my my2) {
        block0: {
            int n = -695045468;
            n = Integer.rotateLeft(n * -1641849741, 10) ^ 0x8AF39D1A;
            my my3 = my2;
            n = (my3 != null ? System.identityHashCode(my3) : 0) ^ n;
            int n2 = n ^ 0x3B0AFBFA;
            if ((n2 ^ n) == 990575610) break block0;
            int cfr_ignored_0 = (0xED98895E ^ n) + 394323312;
        }
        return my2.hgh_2();
    }

    private static float dt_2(float f, float f2) {
        block0: {
            int n = 1716236996;
            int n2 = (n = Integer.rotateLeft(n * 422433335, 11) ^ 0xD30CC859) ^ 0x29E3B9A4;
            if ((n2 ^ n) == 702790052) break block0;
            int cfr_ignored_0 = (0x4FA80B60 ^ n) + -39894056;
        }
        return bghdh.bds_3(f, f2);
    }

    private static void shaj(ny ny2, lb lb2, bnsh bnsh2, float f, float f2, float f3, bmm bmm2) {
        int n = bzd.bnq(-1324299398);
        n = Float.floatToIntBits(f) ^ n;
        bmm bmm3 = bmm2;
        n = (bmm3 != null ? System.identityHashCode((Object)bmm3) : 0) ^ n;
        int n2 = n ^ 0xB5A5B474;
        if ((n2 ^ n) != -1247431564) {
            int cfr_ignored_0 = Integer.rotateRight(0x4B57F0E ^ n, 3) - -1772617235;
        }
        ny2.dzj_4(lb2, bnsh2, f, f2, f3, bmm2);
    }

    private static float hdt_2(int n) {
        block0: {
            int n2 = -1460066535;
            n2 = Integer.rotateLeft(n2 * 1876489981, 26) ^ 0x832140D8;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 8)) ^ 0xF0305599;
            if ((n3 ^ n2) == -265267815) break block0;
            int cfr_ignored_0 = (0x58C97280 ^ n2) - 1735393073;
        }
        return Float.intBitsToFloat(n);
    }

    private static long rrh() {
        block0: {
            int n = -1678103233;
            int n2 = (n = Integer.rotateLeft(n * -388457057, 22) ^ 0xD969E8EA) ^ 0xAD60E96B;
            if ((n2 ^ n) == -1386157717) break block0;
            int cfr_ignored_0 = (0x369AC454 ^ n) + -2103457595;
        }
        return System.currentTimeMillis();
    }

    private static double shzm_2(long l) {
        block0: {
            int n = -1296422948;
            n = Integer.rotateLeft(n * 1953022135, 14) ^ 0x3A615A72;
            int n2 = (n = (int)l ^ n) ^ 0xA7748C32;
            if ((n2 ^ n) == -1485534158) break block0;
            int cfr_ignored_0 = (0x15CEABEE ^ n) - 1069045885;
        }
        return Double.longBitsToDouble(l);
    }

    private static double dhths_2(double d) {
        block0: {
            int n = bzd.bnq(-568184658);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 21);
            int n2 = n ^ 0x5B485E57;
            if ((n2 ^ n) == 1531469399) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x856A6EF9 ^ n, 3) + 742461282) * -2056622343;
            int cfr_ignored_1 = (int)(0x47D8C0C427D4EB4FL ^ (long)n ^ 0x7CF8831A2DB92260L);
        }
        return Math.sin(d);
    }

    private static float ghrb(int n) {
        block0: {
            int n2 = 1492902247;
            int n3 = (n2 = Integer.rotateLeft(n2 * -925746239, 26) ^ 0xD5018AD1) ^ 0x7AE345B7;
            if ((n3 ^ n2) == 2061714871) break block0;
            int cfr_ignored_0 = (0x2218A4D0 ^ n2) + -2137368636;
        }
        return Float.intBitsToFloat(n);
    }

    private static float aaz_2(class_1297 class_12972, class_4050 class_40502) {
        block0: {
            int n = bzd.bnq(913896082);
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            class_4050 class_40503 = class_40502;
            n = (class_40503 != null ? System.identityHashCode(class_40503) : 0) ^ n;
            int n2 = n ^ 0x9842D2EF;
            if ((n2 ^ n) == -1740451089) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xAE3A207D ^ n, 8) - 493325918) * -1371922307;
            int cfr_ignored_1 = (int)(0x6C888E4027D4EB4FL ^ (long)n ^ 0xE1F0831A2DB974C0L);
        }
        return class_12972.method_18381(class_40502);
    }

    private static class_4050 mz(class_746 class_7462) {
        block0: {
            int n = bzd.bnq(388099197);
            int n2 = n ^ 0xB1AA40C7;
            if ((n2 ^ n) == -1314242361) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA68BACBA ^ n, 7) + 793217473) * -1500795717;
        }
        return class_7462.method_18376();
    }

    private static double ddhb_2(class_746 class_7462) {
        block0: {
            int n = -212689482;
            int n2 = (n = Integer.rotateLeft(n * -1530683429, 10) ^ 0x218D1A37) ^ 0xF52D986D;
            if ((n2 ^ n) == -181561235) break block0;
            int cfr_ignored_0 = (0x67F05DB ^ n) - 822048400;
        }
        return class_7462.method_23321();
    }

    private static void khshh_2(ny ny2, lb lb2, bnsh bnsh2, float f, float f2, float f3, bmm bmm2) {
        int n = -32494704;
        n = Integer.rotateLeft(n * 1185987907, 16) ^ 0xF6265BA8;
        ny ny3 = ny2;
        n = Integer.rotateRight((ny3 != null ? System.identityHashCode(ny3) : 0) ^ n, 9);
        lb lb3 = lb2;
        n = (lb3 != null ? System.identityHashCode(lb3) : 0) ^ n;
        int n2 = n ^ 0x433CBBD9;
        if ((n2 ^ n) != 1128053721) {
            int cfr_ignored_0 = (0xBD2C9049 ^ n) + -1388904270;
        }
        ny2.dzj_4(lb2, bnsh2, f, f2, f3, bmm2);
    }

    private static float sfb(class_1309 class_13092) {
        block0: {
            int n = -1138872313;
            int n2 = (n = Integer.rotateLeft(n * -363634087, 15) ^ 0x71AF48B3) ^ 0x96520B7E;
            if ((n2 ^ n) == -1773008002) break block0;
            int cfr_ignored_0 = (0x2A4C3B79 ^ n) + 1080208962;
        }
        return class_13092.method_36454();
    }

    private static float smn_2(class_1309 class_13092) {
        block0: {
            int n = bzd.bnq(-1233310246);
            int n2 = n ^ 0xC580463D;
            if ((n2 ^ n) == -981449155) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x73FD6BE7 ^ n, 17) - 269332532;
        }
        return class_13092.method_36455();
    }

    private static lb dj(ny ny2, class_1309 class_13092) {
        block0: {
            int n = -1415158471;
            n = Integer.rotateLeft(n * 1585854487, 24) ^ 0x999A31FF;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 7);
            int n2 = n ^ 0xA683C475;
            if ((n2 ^ n) == -1501313931) break block0;
            int cfr_ignored_0 = (0xD25A14C ^ n) + 883346095;
        }
        return ny2.stn_3(class_13092);
    }

    private static String[] zzl(String string) {
        block0: {
            int n = -119751583;
            n = Integer.rotateLeft(n * -1733345241, 23) ^ 0x14162623;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
            int n2 = n ^ 0x3D60824F;
            if ((n2 ^ n) == 1029734991) break block0;
            int cfr_ignored_0 = (0xC5BC3E2E ^ n) + 1158350986;
        }
        return string.split("\u0003\u0013", -1);
    }

    private static CallSite shsht_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 734014118;
            n3 = Integer.rotateLeft(n3 * 1893250255, 8) ^ 0x1B5C89E6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 17);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xD6432631;
            if ((n4 ^ n3) != -700242383) {
                int cfr_ignored_0 = (0xFD830C97 ^ n3) - -2107921062;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hlkh ^ string.hashCode()) + (n2 + zza) + i ^ hlkh, 20) + zza);
            }
            String[] stringArray = ny.zzl(new String(cArray));
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

    private static String[] mrdtaowwz4w1p8(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kupdsnxko(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ km48cionn3pzr ^ string.hashCode() ^ n2 + k8a4hiqdnu ^ i * -1368585097 ^ km48cionn3pzr, 6) ^ k8a4hiqdnu));
            }
            String[] stringArray = ny.mrdtaowwz4w1p8(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

