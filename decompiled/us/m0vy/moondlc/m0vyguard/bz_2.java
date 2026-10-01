/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.SecureRandom;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bmd_2;
import us.m0vy.moondlc.m0vyguard.bwn;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.mt;
import us.m0vy.moondlc.m0vyguard.yf;

public class bz_2
implements bmd_2 {
    private static final float thsz_4 = 0.23f;
    private static final float shkhs_2 = 0.13f;
    private static final float jkha_2 = 1.0E-4f;
    private static final float rq = -1.75f;
    private final SecureRandom dj_2 = new SecureRandom();
    private final bwn zdt_3 = new bwn();
    private float dt_3;
    private float sth_3;
    private float khsf_2;
    private float shws_2;
    private float zml;
    private float jdl_2;
    private long dhrf;
    private boolean jdhk;
    private float thay;
    private float jah_2;
    private float hsa_2;
    private float khhd_4;
    private float jbk;
    private float jkhdh;
    private float khra_2;
    private float fd_2;
    private float shjs;
    private float khsz_4;
    private float shghb;
    private float thdd_4;
    private float dzkh_2;
    private float shthf;
    private float jrd_2;
    private double thbn;
    private double zsht_2;
    private double shgh;
    private boolean dhbt;
    private static final int qa = 1833261559;
    private static final int bsj = 2038332103;
    private static final int j5ym9cmix8 = -268102714;
    private static final int ese1n2r = -337715964;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xijlhnto5;

    public bz_2() {
        this.tld_3();
        this.dhrf = System.nanoTime();
    }

    @Override
    public lb ysh(lb lb2, lb lb3, class_1309 class_13092, boolean bl, boolean bl2) {
        float f;
        float f2;
        float f3;
        long l = System.nanoTime();
        float f4 = Math.max(1.0E-4f, Math.min(0.1f, (float)(l - this.dhrf) / 1.0E9f));
        this.dhrf = l;
        if (class_13092 == null) {
            this.sthw_2(f4);
            return lb2;
        }
        this.stb_3(class_13092, f4);
        float f5 = bghdh.ttb_2(lb2.sry(), lb3.sry());
        float f6 = lb3.khdhd_2() + -1.75f - lb2.khdhd_2();
        float f7 = (float)Math.sqrt(f5 * f5 + f6 * f6);
        if (f7 < 0.1f) {
            this.sthw_2(f4);
            return lb2;
        }
        float f8 = f7 > 1.0E-4f ? f5 / f7 : 0.0f;
        float f9 = f7 > 1.0E-4f ? f6 / f7 : 0.0f;
        float f10 = Math.min(f7 / 10.0f, 1.0f);
        float f11 = f8 * 1000.0f * f10;
        float f12 = f9 * 1000.0f * f10 * 0.23f;
        float f13 = this.jww(f7, f4);
        float f14 = 0.13f * f13;
        if (f14 > 1.0E-4f) {
            float[] fArray = this.hnz_2();
            f3 = (float)Math.exp((double)(-f4) / 0.04);
            this.khsf_2 = this.khsf_2 * f3 + fArray[0] * f14 * Math.abs(f11) * (1.0f - f3);
            this.shws_2 = this.shws_2 * f3 + fArray[1] * f14 * Math.abs(f12) * 2.0f * (1.0f - f3);
            f11 += this.khsf_2;
            f12 += this.shws_2;
        }
        float f15 = class_3532.method_15363((float)(1.0f - (float)Math.exp(-35.0 * (double)f4)), (float)0.05f, (float)0.95f);
        this.dt_3 = class_3532.method_16439((float)f15, (float)this.dt_3, (float)f11);
        this.sth_3 = class_3532.method_16439((float)(f15 * 0.75f), (float)this.sth_3, (float)f12);
        f3 = Math.max(Math.abs(f5) / f4 * 1.5f, 1.0f);
        float f16 = Math.max(Math.abs(f6) / f4 * 1.5f, 1.0f);
        this.dt_3 = class_3532.method_15363((float)this.dt_3, (float)(-f3), (float)f3);
        this.sth_3 = class_3532.method_15363((float)this.sth_3, (float)(-f16), (float)f16);
        float f17 = this.dt_3 * f4;
        float f18 = this.sth_3 * f4;
        float f19 = bghdh.ryz();
        if (f19 > 1.0E-4f) {
            this.zml += f17;
            this.jdl_2 += f18;
            f2 = (float)Math.round(this.zml / f19) * f19;
            f = (float)Math.round(this.jdl_2 / f19) * f19;
            this.zml = class_3532.method_15363((float)(this.zml - f2), (float)(-f19 * 2.0f), (float)(f19 * 2.0f));
            this.jdl_2 = class_3532.method_15363((float)(this.jdl_2 - f), (float)(-f19 * 2.0f), (float)(f19 * 2.0f));
            f17 = f2;
            f18 = f;
        }
        f2 = lb2.sry() + f17;
        f = class_3532.method_15363((float)(lb2.khdhd_2() + f18), (float)-90.0f, (float)90.0f);
        return new lb(f2, f);
    }

    private void stb_3(class_1309 class_13092, float f) {
        float f2 = mc.method_61966().method_60637(true);
        double d = class_3532.method_16436((double)f2, (double)class_13092.field_6014, (double)class_13092.method_23317());
        double d2 = class_3532.method_16436((double)f2, (double)class_13092.field_6036, (double)class_13092.method_23318()) + (double)class_13092.method_17682() * 0.5;
        double d3 = class_3532.method_16436((double)f2, (double)class_13092.field_5969, (double)class_13092.method_23321());
        if (!this.dhbt) {
            this.thbn = d;
            this.zsht_2 = d2;
            this.shgh = d3;
            this.dhbt = true;
            return;
        }
        double d4 = class_3532.method_15350((double)(1.0 - Math.exp(-25.0 * (double)f)), (double)0.05, (double)0.95);
        this.thbn += (d - this.thbn) * d4;
        this.zsht_2 += (d2 - this.zsht_2) * d4;
        this.shgh += (d3 - this.shgh) * d4;
    }

    private float jww(float f, float f2) {
        try {
            int n = 515250312;
            n = Integer.rotateLeft(n * 18541007, 4) ^ 0x9C3645CF;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x4674C66F;
            if ((n2 ^ n) != 1182058095) {
                int cfr_ignored_0 = (0x58C2DEE7 ^ n) + 953600287;
            }
            if ((0x3AF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bz_2.twh_2();
            throw null;
        }
        this.thay += f2;
        if (this.thay >= this.jah_2) {
            this.jdhk = !this.jdhk;
            this.jah_2 = this.jdhk ? bz_2.khthkh(this, this.jbk, this.jkhdh) : bz_2.hjh_2(this, this.khra_2, this.fd_2);
            this.thay = 0.0f;
        }
        float f3 = this.jdhk ? this.shjs : this.khsz_4;
        float f4 = this.jdhk ? bz_2.ghbs(Integer.reverse(1322919055) ^ 0xB1C45B72) : Float.intBitsToFloat(0x8AE91DE9 ^ 0xCAC91DE9);
        this.hsa_2 += (f3 - this.hsa_2) * (1.0f - (float)bz_2.sam_4(-f4 * f2));
        float f5 = this.hsa_2;
        this.khhd_4 = class_3532.method_15363((float)(this.khhd_4 + f2 * this.shghb * Float.intBitsToFloat(-909845363 + 1957280512)), (float)0.0f, (float)this.thdd_4);
        f5 += this.khhd_4;
        if (f < this.dzkh_2) {
            f5 *= this.jrd_2;
        } else if (f < this.shthf) {
            float f6 = (f - this.dzkh_2) / (this.shthf - this.dzkh_2);
            f5 *= class_3532.method_16439((float)f6, (float)this.jrd_2, (float)1.0f);
        }
        return f5;
    }

    private float[] hnz_2() {
        int n = -31132583;
        n = Integer.rotateLeft(n * -39588267, 22) ^ 0x3ED2873A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x56B901E9;
        if ((n2 ^ n) != 1454965225) {
            int cfr_ignored_0 = (0xA89DF5B0 ^ n) - -1453421185;
        }
        double d = Math.max(Double.longBitsToDouble(0xED6ED84119EBCEE9L ^ 0xD0B5A49EC03C7352L), this.dj_2.nextDouble());
        double d2 = bz_2.zfs_3(this.dj_2);
        double d3 = Math.sqrt(Double.longBitsToDouble(0xDB4DBAAE5EB85F77L ^ 0x1B4DBAAE5EB85F77L) * Math.log(d));
        return new float[]{(float)(d3 * bz_2.shsz_2(Double.longBitsToDouble(0xD5F191AA6041928DL ^ 0x95E8B0513405BF95L) * d2)), (float)(d3 * bz_2.dhsgh(bz_2.zha_3(0xAC0A4367C589ED6DL ^ 0xEC13629C91CDC075L) * d2))};
    }

    private void sthw_2(float f) {
        int n = 358000673;
        n = Integer.rotateLeft(n * -831082423, 18) ^ 0x19845A94;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 25);
        int n2 = n ^ 0x26602500;
        if ((n2 ^ n) != 643835136) {
            int cfr_ignored_0 = (0x33368D21 ^ n) - 1059030591;
        }
        float f2 = (float)Math.exp(Double.longBitsToDouble(0xB9D12732835B1A4AL ^ 0x79F12732835B1A4AL) * (double)f);
        this.dt_3 *= f2;
        this.sth_3 *= f2;
        this.khsf_2 *= f2;
        this.shws_2 *= f2;
    }

    private void tld_3() {
        int n = -1204271763;
        n = Integer.rotateLeft(n * 1502405789, 21) ^ 0x3739AE9D;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x45CF4213;
        if ((n2 ^ n) != 1171210771) {
            int cfr_ignored_0 = (0xFDF7077E ^ n) + -1971310625;
        }
        this.jbk = this.zja_2(Float.intBitsToFloat(0x6A74118D ^ 0x57B8DD40), Float.intBitsToFloat(Integer.reverse(-1447017787) ^ 0x9DDB9A0F));
        this.jkhdh = this.zja_2(Float.intBitsToFloat(0x9DFBA8E5 ^ 0xA2FBA8E5), Float.intBitsToFloat(Integer.reverse(265527537) ^ 0xB0A5CBF0));
        this.khra_2 = this.zja_2(Float.intBitsToFloat(-599803339 - -1656767947), 1.0f);
        this.fd_2 = this.zja_2(Float.intBitsToFloat(112731009 + 965205119), Float.intBitsToFloat(Integer.reverse(1785402213) ^ 0xE698D656));
        this.shjs = this.zja_2(bz_2.jtk_2(-1534613034 + -1703389654), Float.intBitsToFloat(764825838 - -302205100));
        this.khsz_4 = bz_2.dls(this, bz_2.jtn(Integer.reverse(1655413770) ^ 0x6D9A024C), Float.intBitsToFloat(-836796535 + 1882017092));
        this.shghb = this.zja_2(Float.intBitsToFloat(-1583559111 + -1695111549), Float.intBitsToFloat(Integer.reverse(-1454118602) ^ 0x502BA0EA));
        this.thdd_4 = bz_2.thsha(this, Float.intBitsToFloat(-736436564 + 1778301678), Float.intBitsToFloat(Integer.rotateLeft(0x2C92E6F1 ^ 0x1FA1D51A, 20)));
        this.dzkh_2 = this.zja_2(2.0f, Float.intBitsToFloat(Integer.rotateLeft(0xA56518CB ^ 0xA76418CB, 5)));
        this.shthf = bz_2.sbh(this, Float.intBitsToFloat(Integer.rotateLeft(0xB4997C29 ^ 0xB49B7A29, 13)), Float.intBitsToFloat(0xA333A0D1 ^ 0xE223A0D1));
        this.jrd_2 = this.zja_2(Float.intBitsToFloat(Integer.reverse(-1661145576) ^ 0x266EA6A3), Float.intBitsToFloat(Integer.rotateLeft(0xCBCDD32B ^ 0x71E37E7, 12)));
        this.jdhk = false;
        this.thay = 0.0f;
        this.jah_2 = bz_2.khwl(this, this.khra_2, this.fd_2);
        this.hsa_2 = this.khsz_4;
        this.khhd_4 = 0.0f;
    }

    private float zja_2(float f, float f2) {
        block0: {
            int n = 1362979541;
            n = Integer.rotateLeft(n * -370725577, 11) ^ 0xC611A508;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 18);
            int n2 = n ^ 0x99E8581E;
            if ((n2 ^ n) == -1712826338) break block0;
            int cfr_ignored_0 = (0xC8D532CB ^ n) + 591802692;
        }
        return f + this.dj_2.nextFloat() * (f2 - f);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void tf() {
        var3_1 = 0;
        var1_2 = 1173634463;
        var1_2 = Integer.rotateLeft(var1_2 * 1689752545, 28) ^ 1501517463;
        var1_2 = Integer.rotateRight(System.identityHashCode(this) ^ var1_2, 22);
        var2_3 = (var1_2 ^ -36491593 ^ -1638309273) + -1638309273 ^ 473295667 ^ 473295667;
        block20: while (true) {
            block23: {
                block22: {
                    if ((var3_1 = var2_3 - -1638309273 ^ -1638309273 ^ var1_2) == 2022957507) ** GOTO lbl135
                    if (var3_1 == 266153099) break block22;
                    (Integer.rotateLeft(2023417364 ^ var1_2, 18) - -1625326681) * 2023417365;
                    if (var3_1 == 1617154731) ** GOTO lbl144
                    break block23;
                }
                Integer.rotateLeft(-1362136020 ^ var1_2, 8) - 796700815;
                this.dt_3 = 0.0f;
                this.sth_3 = 0.0f;
                this.khsf_2 = 0.0f;
                this.shws_2 = 0.0f;
                this.zml = 0.0f;
                this.jdl_2 = 0.0f;
                this.dhbt = false;
                bz_2.sqh_2(this);
                this.dhrf = System.nanoTime();
                return;
            }
            switch (var3_1) {
                case -36491593: {
                    Integer.rotateRight(-610327921 ^ var1_2, 14) - -1667051892;
                    if (!yf.dnkh()) {
                        var2_3 = (var1_2 ^ -901259166 ^ -1638309273) + -1638309273 + -1959957813 - -1959957813;
                        Integer.rotateRight(-669130866 ^ var1_2, 14) - 805024109;
                        var2_3 = (var1_2 ^ 266153099 ^ -1638309273) + -1638309273;
                        continue block20;
                    }
                    try {
                        var3_1 -= 5;
                        var2_3 = (var1_2 ^ -1513684574 ^ -1638309273) + -1638309273 + 767332551 - 767332551;
                    }
                    catch (UnsupportedOperationException v0) {
                        var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1513684574 ^ -1638309273) + -1638309273));
                    }
                    var3_1 -= 4;
                    continue block20;
                }
                case -1513684574: {
                    Integer.rotateLeft(-543515415 ^ var1_2, 14) + 404135794;
                    (int)(2100985112951057231L ^ (long)var1_2 ^ -7433047036515477631L);
                    throw null;
                }
                case 293410853: {
                    (Integer.rotateLeft(-1432847184 ^ var1_2, 8) + -1395345269) * -1432847183;
                    var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1821499563 ^ -1638309273) + -1638309273));
                    Integer.rotateRight(1597068454 ^ var1_2, 14) - -1957241003;
                    try {
                        var3_1 += 5;
                        var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -36491593 ^ -1638309273) + -1638309273));
                    }
                    catch (ArithmeticException v1) {
                        var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -36491593 ^ -1638309273) + -1638309273));
                    }
                    continue block20;
                }
                case 198426598: {
                    (Integer.rotateLeft(808573681 ^ var1_2, 9) + -630775190) * 808573681;
                    (int)(-971804674391479473L ^ (long)var1_2 ^ 1506598223814871255L);
                    var2_3 = (var1_2 ^ -36491593 ^ -1638309273) + -1638309273 + 1696186764 - 1696186764;
                    (Integer.rotateRight(1038669815 ^ var1_2, 10) - -2087729628) * 1038669815;
                    var3_1 -= 3;
                    continue block20;
                }
                case 75850757: {
                    (Integer.rotateRight(766055743 ^ var1_2, 8) - -1948831268) * 766055743;
                    var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1578609903 ^ -1638309273) + -1638309273));
                    (Integer.rotateLeft(1132763544 ^ var1_2, 11) + 829175971) * 1132763545;
                    try {
                        var3_1 += 4;
                        var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -36491593 ^ -1638309273) + -1638309273));
                    }
                    catch (IllegalArgumentException v2) {
                        var2_3 = (var1_2 ^ -36491593 ^ -1638309273) + -1638309273 + 1620248744 - 1620248744;
                    }
                    var3_1 += 2;
                    continue block20;
                }
                case 1934708367: {
                    Integer.rotateLeft(1349660552 ^ var1_2, 13) + -1036951373;
                    (int)(7481298595934494453L ^ (long)var1_2 ^ 3435725520158679668L);
                    var2_3 = (var1_2 ^ 85063367 ^ -1638309273) + -1638309273;
                    (int)(-2230551254783112082L ^ (long)var1_2 ^ 547053215984283591L);
                    var2_3 = (var1_2 ^ -36491593 ^ -1638309273) + -1638309273 + -673203213 - -673203213;
                    var3_1 -= 5;
                    continue block20;
                }
                case 773437339: {
                    (Integer.rotateLeft(-1401303847 ^ var1_2, 8) + -417501822) * -1401303847;
                    (int)(7983583496504666959L ^ (long)var1_2 ^ 4087160810298241095L);
                    (int)(-8081849412053829570L ^ (long)var1_2 ^ -216674047556406658L);
                    var2_3 = (var1_2 ^ -36491593 ^ -1638309273) + -1638309273 ^ 479039287 ^ 479039287;
                    continue block20;
                }
                case 1129794504: {
                    Integer.rotateLeft(-772231859 ^ var1_2, 13) - 1903860622;
                    (int)(1389927215236705103L ^ (long)var1_2 ^ -319611425083782331L);
                    var2_3 = (var1_2 ^ -1205210039 ^ -1638309273) + -1638309273 + 1805006335 - 1805006335;
                    (Integer.rotateRight(252125918 ^ var1_2, 4) - -700786659) * 252125919;
                    var2_3 = (var1_2 ^ 498500859 ^ -1638309273) + -1638309273;
                    Integer.rotateRight(1728981767 ^ var1_2, 15) - 2132071700;
                    var2_3 = (var1_2 ^ -36491593 ^ -1638309273) + -1638309273 ^ -2116751720 ^ -2116751720;
                    var3_1 -= 2;
                    continue block20;
                }
                case -1647280486: {
                    (Integer.rotateLeft(503158709 ^ var1_2, 6) - -1508704730) * 503158709;
                    (int)(-2355600823144879281L ^ (long)var1_2 ^ -8187399974100135089L);
                    var2_3 = (var1_2 ^ -1607421413 ^ -1638309273) + -1638309273 ^ -1307376023 ^ -1307376023;
                    (Integer.rotateLeft(1775987448 ^ var1_2, 16) + -705719485) * 1775987449;
                    var2_3 = (int)((long)((var1_2 ^ -36491593 ^ -1638309273) + -1638309273) ^ -8567560306902953526L ^ -8567560306902953526L);
                    (Integer.rotateLeft(-1390767748 ^ var1_2, 8) - -90882753) * -1390767747;
                    var3_1 -= 3;
                    continue block20;
                }
lbl135:
                // 1 sources

                Integer.rotateLeft(1643619809 ^ var1_2, 15) + -514148998;
                (int)(-6681921431945286833L ^ (long)var1_2 ^ -1528827925032801445L);
                var2_3 = (var1_2 ^ 1882625771 ^ -1638309273) + -1638309273 ^ 1086439817 ^ 1086439817;
                (Integer.rotateRight(-679297477 ^ var1_2, 13) + 489859168) * -679297477;
                var2_3 = (var1_2 ^ -36491593 ^ -1638309273) + -1638309273 + -1167223969 - -1167223969;
                continue block20;
lbl144:
                // 1 sources

                Integer.rotateLeft(15506377 ^ var1_2, 3) + 553942162;
                (int)(-4441052859784172721L ^ (long)var1_2 ^ -7595176623100909203L);
                var2_3 = (var1_2 ^ -36491593 ^ -1638309273) + -1638309273;
                continue block20;
                case -527769674: {
                    (Integer.rotateRight(-505722274 ^ var1_2, 15) - 1575723165) * -505722273;
                    try {
                        --var3_1;
                        var2_3 = (int)((long)((var1_2 ^ -36491593 ^ -1638309273) + -1638309273) ^ -4537590347540862149L ^ -4537590347540862149L);
                    }
                    catch (UnsupportedOperationException v3) {
                        var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -36491593 ^ -1638309273) + -1638309273));
                    }
                    continue block20;
                }
            }
            (Integer.rotateLeft(-394791152 ^ var1_2, 16) + 719620651) * -394791151;
            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -36491593 ^ -1638309273) + -1638309273));
        }
    }

    @Override
    public void mgh(class_1309 class_13092) {
        int n = mt.jash_2(1353824197);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x182316B3;
        if ((n2 ^ n) != 404952755) {
            int cfr_ignored_0 = (Integer.rotateRight(0x4892A176 ^ n, 12) - -836817787) * 1217569143;
        }
        this.dhbt = false;
        this.zml = 0.0f;
        this.jdl_2 = 0.0f;
    }

    private static void twh_2() {
        int n = 702974443;
        int n2 = (n = Integer.rotateLeft(n * -1425663671, 11) ^ 0xBD8B2446) ^ 0xABBF2CB7;
        if ((n2 ^ n) != -1413534537) {
            int cfr_ignored_0 = (0x8259A55C ^ n) - -1551018817;
        }
        yf.athz_2();
    }

    private static float khthkh(bz_2 bz2, float f, float f2) {
        block0: {
            int n = 1220774090;
            n = Integer.rotateLeft(n * -1461780707, 12) ^ 0x38A17754;
            bz_2 bz3 = bz2;
            n = Integer.rotateLeft((bz3 != null ? System.identityHashCode(bz3) : 0) ^ n, 19);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xE335512F;
            if ((n2 ^ n) == -483045073) break block0;
            int cfr_ignored_0 = (0xABF6D9E5 ^ n) - 1699877172;
        }
        return bz2.zja_2(f, f2);
    }

    private static float hjh_2(bz_2 bz2, float f, float f2) {
        block0: {
            int n = 4300131;
            n = Integer.rotateLeft(n * -753116819, 27) ^ 0xC11CD2B3;
            bz_2 bz3 = bz2;
            n = Integer.rotateRight((bz3 != null ? System.identityHashCode(bz3) : 0) ^ n, 23);
            int n2 = n ^ 0x5C60248B;
            if ((n2 ^ n) == 1549804683) break block0;
            int cfr_ignored_0 = (0x5C21B9E8 ^ n) + -375385518;
        }
        return bz2.zja_2(f, f2);
    }

    private static float ghbs(int n) {
        block0: {
            int n2 = mt.jash_2(203124165);
            int n3 = n2 ^ 0x99EB8199;
            if ((n3 ^ n2) == -1712619111) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x95F0EC5C ^ n2, 5) - 747257439) * -1779372963;
        }
        return Float.intBitsToFloat(n);
    }

    private static double sam_4(double d) {
        block0: {
            int n = -1268920939;
            n = Integer.rotateLeft(n * 1484290629, 16) ^ 0x96556C09;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 29);
            int n2 = n ^ 0x8B3318D0;
            if ((n2 ^ n) == -1959585584) break block0;
            int cfr_ignored_0 = (0x3F6ED545 ^ n) + 11199717;
        }
        return Math.exp(d);
    }

    private static double zfs_3(SecureRandom secureRandom) {
        block0: {
            int n = 1045072848;
            n = Integer.rotateLeft(n * 445112599, 18) ^ 0x7CE5A49B;
            SecureRandom secureRandom2 = secureRandom;
            n = Integer.rotateRight((secureRandom2 != null ? System.identityHashCode(secureRandom2) : 0) ^ n, 27);
            int n2 = n ^ 0x8C8AA545;
            if ((n2 ^ n) == -1937070779) break block0;
            int cfr_ignored_0 = (0xB2C02E95 ^ n) - 1570891719;
        }
        return secureRandom.nextDouble();
    }

    private static double shsz_2(double d) {
        block0: {
            int n = -473376597;
            int n2 = (n = Integer.rotateLeft(n * 1734038215, 28) ^ 0xBE87FC8F) ^ 0x3C33292F;
            if ((n2 ^ n) == 1009985839) break block0;
            int cfr_ignored_0 = (0xDFFBF184 ^ n) + 2052102734;
        }
        return Math.cos(d);
    }

    private static double zha_3(long l) {
        block0: {
            int n = mt.jash_2(1192766797);
            int n2 = (n = (int)l ^ n) ^ 0xDA03A220;
            if ((n2 ^ n) == -637296096) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x9D1B8F6D ^ n, 6) - 179567982;
            int cfr_ignored_1 = (int)(0x5FA9215027D4EB4FL ^ (long)n ^ 0xBFD0831A2DB91283L);
        }
        return Double.longBitsToDouble(l);
    }

    private static double dhsgh(double d) {
        block0: {
            int n = mt.jash_2(1329201288);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 7);
            int n2 = n ^ 0xF0059C01;
            if ((n2 ^ n) == -268067839) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xBF3F9C89 ^ n, 10) + 756126674;
            int cfr_ignored_1 = (int)(0x7D8D32B427D4EB4FL ^ (long)n ^ 0x9818831A2DB956CBL);
        }
        return Math.sin(d);
    }

    private static float jtk_2(int n) {
        block0: {
            int n2 = mt.jash_2(1502747102);
            int n3 = (n2 = n ^ n2) ^ 0x4D2CE62D;
            if ((n3 ^ n2) == 1294788141) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x14BEFFF3 ^ n2, 5) + -2021745240) * 348061683;
        }
        return Float.intBitsToFloat(n);
    }

    private static float jtn(int n) {
        block0: {
            int n2 = -758847282;
            int n3 = (n2 = Integer.rotateLeft(n2 * 866547221, 14) ^ 0xD4D0DCF1) ^ 0xFBCA73F2;
            if ((n3 ^ n2) == -70618126) break block0;
            int cfr_ignored_0 = (0x290E9B3C ^ n2) - -7337524;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dls(bz_2 bz2, float f, float f2) {
        block0: {
            int n = mt.jash_2(-954532838);
            int n2 = n ^ 0xF69529BA;
            if ((n2 ^ n) == -157996614) break block0;
            mt.dsq_3(831509920, n);
            int cfr_ignored_0 = (int)(0xAFB8AC197F4A7C15L ^ (long)n ^ 0xA5423227030CF2A0L);
        }
        return bz2.zja_2(f, f2);
    }

    private static float thsha(bz_2 bz2, float f, float f2) {
        block0: {
            int n = mt.jash_2(-1265445192);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xB60BF9E6;
            if ((n2 ^ n) == -1240729114) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x2992F5E ^ n, 3) - 1424645021) * 43593567;
        }
        return bz2.zja_2(f, f2);
    }

    private static float sbh(bz_2 bz2, float f, float f2) {
        block0: {
            int n = -1153528322;
            n = Integer.rotateLeft(n * 2056205415, 10) ^ 0x6DABF6B3;
            bz_2 bz3 = bz2;
            n = (bz3 != null ? System.identityHashCode(bz3) : 0) ^ n;
            int n2 = n ^ 0xC2EE05DC;
            if ((n2 ^ n) == -1024588324) break block0;
            int cfr_ignored_0 = (0x79D08822 ^ n) + 726922759;
        }
        return bz2.zja_2(f, f2);
    }

    private static float khwl(bz_2 bz2, float f, float f2) {
        block0: {
            int n = 44208352;
            n = Integer.rotateLeft(n * -1972145637, 9) ^ 0x19CE057;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x3BC9D6D4;
            if ((n2 ^ n) == 1003083476) break block0;
            int cfr_ignored_0 = (0x396B4634 ^ n) - 232751328;
        }
        return bz2.zja_2(f, f2);
    }

    private static void sqh_2(bz_2 bz2) {
        int n = -1361731407;
        n = Integer.rotateLeft(n * 1005866891, 19) ^ 0xB8921A10;
        bz_2 bz3 = bz2;
        n = (bz3 != null ? System.identityHashCode(bz3) : 0) ^ n;
        int n2 = n ^ 0xD469C0CF;
        if ((n2 ^ n) != -731266865) {
            int cfr_ignored_0 = (0x7ABC607E ^ n) + -1692430792;
        }
        bz2.tld_3();
    }

    private static String[] jqm(String string) {
        block0: {
            int n = 338224556;
            n = Integer.rotateLeft(n * 580484445, 12) ^ 0x5E572B68;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x3A88F7BB;
            if ((n2 ^ n) == 982054843) break block0;
            int cfr_ignored_0 = (0x2EA01217 ^ n) - -1479808678;
        }
        return string.split("\u0001\u0013", -1);
    }

    private static CallSite dqq_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1456167372;
            n3 = Integer.rotateLeft(n3 * -607415323, 6) ^ 0x9794F65E;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 12);
            int n4 = n3 ^ 0xD3B7281F;
            if ((n4 ^ n3) != -742971361) {
                int cfr_ignored_0 = (0x7A838E2B ^ n3) - 1341762091;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ qa ^ string.hashCode() ^ n2 + bsj + i * 1267176167) + qa) ^ bsj));
            }
            String[] stringArray = bz_2.jqm(new String(cArray));
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

    private static String[] hrdbubap26pzjp(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pqref7c17vh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ j5ym9cmix8 ^ string.hashCode() ^ n2 + ese1n2r + i * 1193770591) + j5ym9cmix8) ^ ese1n2r));
            }
            String[] stringArray = bz_2.hrdbubap26pzjp(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

