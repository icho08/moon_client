/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  net.minecraft.class_1297
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bdgh;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Recorder", category=bzw.OTHER)
public class rm
extends bnq {
    private static final long thbth = 1500L;
    private final List thlz_2 = new ArrayList();
    private float bgha_2;
    private float dhkl;
    private float ssd_2;
    private float shtt_3;
    private float hwz_2;
    private float ddd_3;
    private float tdkh_2;
    private long zthn;
    private class_1297 bdht;
    private final bql<bthy> sdth_2 = this::dhkth;
    private final bql<bbgh> jgha_2 = this::ztm_4;
    private final bql<btt> shsgh = this::shakh_2;
    private static final int tdh_3 = 220247884;
    private static final int nb = 1044734057;
    private static final int thtz_4 = -898001192;
    private static final int jmsh = -878165355;
    private static final int d1i2f9d3x5uv = 1508042498;
    private static final int nu6oxmx = 274486;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int axmhq27ia;

    private void thaz_2() {
        try {
            int n = -1437834576;
            n = Integer.rotateLeft(n * -1778024155, 5) ^ 0xFDBAC0FD;
            int n2 = n ^ 0x64258F63;
            if ((n2 ^ n) != 1680183139) {
                int cfr_ignored_0 = (0xCE69EDD3 ^ n) - -898992659;
            }
            if ((0x3B5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            rm.khzj();
        }
        Path path = rm.zyt_2().field_1697.toPath().resolve("C:/Moondlc/kil".concat("l_aura_dataset.json"));
        try {
            FileWriter fileWriter = new FileWriter(path.toFile(), true);
            try {
                Gson gson = new GsonBuilder().create();
                fileWriter.write(gson.toJson((Object)this.thlz_2));
                rm.jbb(fileWriter, "\n");
            }
            catch (Throwable throwable) {
                try {
                    rm.hbh_2(fileWriter);
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            fileWriter.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     */
    private float ahh_2(float var1_1) {
        var2_2 = 0.0f;
        var5_3 = 0;
        var3_4 = 1394512869;
        var3_4 = Integer.rotateLeft(var3_4 * 1466600341, 26) ^ -1339759391;
        var3_4 = Integer.rotateRight(System.identityHashCode(this) ^ var3_4, 15);
        var3_4 = Integer.rotateLeft(Float.floatToIntBits(var1_1) ^ var3_4, 10);
        var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + 15488847 - 15488847;
        block36: while (true) {
            if ((var5_3 = Integer.rotateRight(var4_5, 7) ^ var3_4) == 1219539567) ** GOTO lbl150
            if (var5_3 == 1749874023) ** GOTO lbl-1000
            (Integer.rotateLeft(-1093479979 ^ var3_4, 10) - 535103494) * -1093479979;
            (int)(8962303893544692559L ^ (long)var3_4 ^ 189295332809069841L);
            if (var5_3 == 346860348) ** GOTO lbl185
            if (var5_3 != -645503260) {
                switch (var5_3) {
                    case 411797052: {
                        (Integer.rotateLeft(1246472113 ^ var3_4, 12) + 59174314) * 1246472113;
                        (int)(-8576813517782062257L ^ (long)var3_4 ^ -1267619146645324765L);
                        var2_2 = var1_1;
                        var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ 1097812718, 7) ^ -6445041006425969451L ^ -6445041006425969451L);
                        var5_3 += 5;
                        continue block36;
                    }
                    case 1417231768: {
                        Integer.rotateLeft(-544356855 ^ var3_4, 14) + 378051154;
                        (int)(2107517723848534863L ^ (long)var3_4 ^ 3249491279607338927L);
                        if (var1_1 < rm.thwh_2(Integer.rotateLeft(-300474906 ^ -288085530, 8))) {
                            (int)(7671137389970888980L ^ (long)var3_4 ^ 5246953526450420027L);
                            var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ -1737641201, 7) ^ -1242973068092501453L ^ -1242973068092501453L);
                            var5_3 += 4;
                            continue block36;
                        }
                        if (!bdgh.zwr_2(var3_4, -1952248420)) {
                            Integer.rotateLeft(-1826059360 ^ var3_4, 5) + -700020837;
                        }
                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ 411797052, 7)));
                        continue block36;
                    }
                    case -488679341: {
                        (Integer.rotateRight(-1550564333 ^ var3_4, 7) + -749609592) * -1550564333;
                        var1_1 -= Float.intBitsToFloat(-209064173 - -1344934125);
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1417231768, 7);
                        Integer.rotateRight(863153742 ^ var3_4, 9) - 1061206701;
                        var5_3 -= 4;
                        continue block36;
                    }
                    case -1031192576: {
                        Integer.rotateLeft(-1504051096 ^ var3_4, 7) + 692300755;
                        var1_1 %= Float.intBitsToFloat(-1118634738 ^ -18416370);
                        if (var1_1 > rm.rlj(Integer.rotateLeft(-1603733460 ^ -1587271636, 6))) {
                            try {
                                var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -488679341, 7)));
                            }
                            catch (UnsupportedOperationException v0) {
                                var4_5 = Integer.rotateLeft(var3_4 ^ -488679341, 7) ^ 1840336125 ^ 1840336125;
                            }
                            var5_3 -= 2;
                            continue block36;
                        }
                        try {
                            var5_3 += 5;
                            if ((8921698889362535669L ^ (long)var3_4 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var4_5 = Integer.rotateLeft(var3_4 ^ 1417231768, 7) + 1248469321 - 1248469321;
                        }
                        catch (ArithmeticException v1) {
                            var4_5 = Integer.rotateLeft(var3_4 ^ 1417231768, 7);
                        }
                        --var5_3;
                        continue block36;
                    }
                    case -1737641201: {
                        Integer.rotateRight(-879795765 ^ var3_4, 12) + -1430620464;
                        var1_1 += Float.intBitsToFloat(-548943757 ^ -1661745037);
                        try {
                            var5_3 -= 2;
                            var4_5 = Integer.rotateLeft(var3_4 ^ 411797052, 7) ^ -1655767494 ^ -1655767494;
                        }
                        catch (ArithmeticException v2) {
                            var4_5 = Integer.rotateLeft(var3_4 ^ 411797052, 7);
                        }
                        continue block36;
                    }
                    case 1776382914: {
                        (Integer.rotateLeft(8828565 ^ var3_4, 3) - 346929990) * 8828565;
                        (int)(-4452907021060740273L ^ (long)var3_4 ^ -3737843542258079303L);
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1115147280, 7);
                        (Integer.rotateRight(262371990 ^ var3_4, 4) - -383158427) * 262371991;
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + 1976449254 - 1976449254;
                        continue block36;
                    }
                }
            }
            ** GOTO lbl109
lbl-1000:
            // 1 sources

            {
                Integer.rotateLeft(-1789940087 ^ var3_4, 5) + 419676626;
                (int)(6340224624169904975L ^ (long)var3_4 ^ -281330828251168213L);
                try {
                    var5_3 += 2;
                    if ((-6293627701831049867L ^ (long)var3_4 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7);
                }
                catch (UnsupportedOperationException v3) {
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7);
                }
                continue block36;
lbl109:
                // 1 sources

                (Integer.rotateLeft(1122325972 ^ var3_4, 11) - 505611239) * 1122325973;
                var4_5 = Integer.rotateLeft(var3_4 ^ 1635320680, 7);
                (Integer.rotateRight(-445664610 ^ var3_4, 15) - -857456547) * -445664609;
                try {
                    var5_3 -= 5;
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + -1392800299 - -1392800299;
                }
                catch (ArithmeticException v4) {
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + -1303873999 - -1303873999;
                }
                var5_3 -= 3;
                continue block36;
                case -1923274666: {
                    (Integer.rotateRight(-508423182 ^ var3_4, 15) + 1491995017) * -508423181;
                    if (bdgh.zwr_2(var3_4, -336779020)) {
                        (Integer.rotateLeft(694446324 ^ var3_4, 8) - 126244039) * 694446325;
                    }
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + -1173683249 - -1173683249;
                    var5_3 += 4;
                    continue block36;
                }
                case -179292680: {
                    Integer.rotateRight(-1862191702 ^ var3_4, 5) + -1820123439;
                    try {
                        ++var5_3;
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7);
                    }
                    catch (ArithmeticException v5) {
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7);
                    }
                    var5_3 += 3;
                    continue block36;
                }
                case 1555868457: {
                    (Integer.rotateLeft(-2001855436 ^ var3_4, 4) - -1854731897) * -2001855435;
                    (int)(-5004950327658350645L ^ (long)var3_4 ^ 5553868897099241668L);
                    var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -1031192576, 7)));
                    var5_3 -= 5;
                    continue block36;
                }
lbl150:
                // 1 sources

                Integer.rotateLeft(577083465 ^ var3_4, 7) + 782962706;
                (int)(-2245266016708531377L ^ (long)var3_4 ^ -7955464593290531713L);
                try {
                    ++var5_3;
                    if ((2008241912199766147L ^ (long)var3_4 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + 1381643743 - 1381643743;
                }
                catch (IllegalStateException v6) {
                    var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ -1031192576, 7) ^ 5624911604816076514L ^ 5624911604816076514L);
                }
                continue block36;
                case -1519219679: {
                    Integer.rotateLeft(-870271347 ^ var3_4, 12) - -1135363506;
                    (int)(1049928807992322895L ^ (long)var3_4 ^ -3742347141885349643L);
                    var4_5 = Integer.rotateLeft(var3_4 ^ -2132612171, 7) + -1576045474 - -1576045474;
                    Integer.rotateRight(1200829550 ^ var3_4, 11) - -1355745139;
                    if (bdgh.zwr_2(var3_4, -214653457)) {
                        Integer.rotateRight(834528751 ^ var3_4, 9) - 173831980;
                    }
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + 978846695 - 978846695;
                    var5_3 -= 5;
                    continue block36;
                }
                case -2140706988: {
                    Integer.rotateRight(-1189703925 ^ var3_4, 10) + 1847128464;
                    (int)(-2811177177419751358L ^ (long)var3_4 ^ -6921897558136447960L);
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + 1918453714 - 1918453714;
                    var5_3 -= 4;
                    continue block36;
                }
lbl185:
                // 1 sources

                Integer.rotateLeft(1320705121 ^ var3_4, 12) + -1934569734;
                (int)(-8355599681013355697L ^ (long)var3_4 ^ 1857878994749797828L);
                var4_5 = Integer.rotateLeft(var3_4 ^ -1197665887, 7) + 365122273 - 365122273;
                (Integer.rotateLeft(220908316 ^ var3_4, 4) - -1668532321) * 220908317;
                var4_5 = Integer.rotateLeft(var3_4 ^ -1070852961, 7);
                Integer.rotateLeft(909575877 ^ var3_4, 9) - -1794674410;
                (int)(-827069172778996913L ^ (long)var3_4 ^ -6016664953707543334L);
                var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) ^ -157311391 ^ -157311391;
                continue block36;
                case 197075223: {
                    Integer.rotateRight(1542894447 ^ var3_4, 14) - 658332076;
                    try {
                        if ((-1945058835274992901L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + 701012136 - 701012136;
                    }
                    catch (ArithmeticException v7) {
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) + 932280223 - 932280223;
                    }
                    --var5_3;
                    continue block36;
                }
                case 1866451315: {
                    (Integer.rotateRight(1752851706 ^ var3_4, 16) + -1422927487) * 1752851707;
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1155813033, 7);
                    Integer.rotateLeft(-787646904 ^ var3_4, 13) + 1425994227;
                    try {
                        var5_3 -= 3;
                        if ((3401484987434385355L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -1031192576, 7)));
                    }
                    catch (ArithmeticException v8) {
                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -1031192576, 7)));
                    }
                    continue block36;
                }
                case -1849868451: {
                    Integer.rotateLeft(-1930756408 ^ var3_4, 4) + 349337971;
                    var4_5 = Integer.rotateLeft(var3_4 ^ 952713821, 7) + 932341179 - 932341179;
                    Integer.rotateLeft(1720179784 ^ var3_4, 15) + 1859210227;
                    var4_5 = Integer.rotateLeft(var3_4 ^ 344111875, 7);
                    Integer.rotateLeft(1823489924 ^ var3_4, 16) - 766857271;
                    var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -1031192576, 7)));
                    var5_3 -= 3;
                    continue block36;
                }
                case 1683310781: {
                    Integer.rotateLeft(1925404320 ^ var3_4, 17) + -368763749;
                    if (!bdgh.zwr_2(var3_4, 1295855195)) {
                        (Integer.rotateRight(-1884000677 ^ var3_4, 4) + 1798765632) * -1884000677;
                    }
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7);
                    continue block36;
                }
                case 1097812718: {
                    return var2_2;
                }
            }
            (Integer.rotateLeft(-568327815 ^ var3_4, 14) + -365048606) * -568327815;
            (int)(2058900686922640207L ^ (long)var3_4 ^ -6631406302843529996L);
            var4_5 = Integer.rotateLeft(var3_4 ^ -1031192576, 7) ^ 294324866 ^ 294324866;
        }
    }

    private float zthq(class_746 class_7462, class_1297 class_12972) {
        int n = bdgh.zdhy(1606876183);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        int n2 = n ^ 0xDCBF9E40;
        if ((n2 ^ n) != -591421888) {
            int cfr_ignored_0 = (Integer.rotateRight(0x83796257 ^ n, 3) - -267352124) * -2089196969;
        }
        double d = class_12972.method_23317() - class_7462.method_23317();
        double d2 = class_12972.method_23321() - class_7462.method_23321();
        float f = (float)(rm.arth(Math.atan2(d2, d)) - Double.longBitsToDouble(0xF374F32786544EBEL ^ 0xB322732786544EBEL));
        return this.ahh_2(f - class_7462.method_36454());
    }

    private float khdhn(class_746 class_7462, class_1297 class_12972) {
        int n = bdgh.zdhy(599086817);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x370F5276;
        if ((n2 ^ n) != 923751030) {
            int cfr_ignored_0 = (Integer.rotateRight(0x14BA0497 ^ n, 5) - -2031866492) * 347735191;
        }
        double d = class_12972.method_23317() - rm.rn(class_7462);
        double d2 = class_12972.method_23321() - rm.tqt_4(class_7462);
        double d3 = rm.dya_4(class_12972) - class_7462.method_23320();
        double d4 = Math.sqrt(d * d + d2 * d2);
        float f = (float)(-rm.jyd_2(Math.atan2(d3, d4)));
        return this.ahh_2(f - rm.zjgh(class_7462));
    }

    private void shakh_2(btt btt2) {
        class_746 class_7462;
        int n = -1984656354;
        int n2 = (n = Integer.rotateLeft(n * 1659144499, 22) ^ 0xCE1824CD) ^ 0x31354922;
        if ((n2 ^ n) != 825575714) {
            int cfr_ignored_0 = (0xB881C53C ^ n) + 191489218;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if ((class_7462 = class_310.method_1551().field_1724) != null) {
            long l = System.currentTimeMillis();
            float f = class_7462.method_36454();
            float f2 = class_7462.method_36455();
            float f3 = this.ahh_2(f - this.bgha_2);
            float f4 = this.ahh_2(f2 - this.dhkl);
            float f5 = Float.intBitsToFloat(-359226929 + -639427023);
            float f6 = Float.intBitsToFloat(298211494 - 1296865446);
            float f7 = Float.intBitsToFloat(Integer.reverse(1167543088) ^ 0xC8AB29A2);
            if (this.bdht != null && l - this.zthn <= (0x314D57AB92A3F431L ^ 0x314D57AB92A3F1EDL) && this.bdht.method_5805() && rm.mc.field_1687.method_18456().contains(this.bdht) && rm.mc.field_1724.method_5739(this.bdht) < Float.intBitsToFloat(Integer.reverse(446294396) ^ 0x7E379958)) {
                f5 = class_7462.method_5739(this.bdht);
                f6 = this.zthq(class_7462, this.bdht);
                f7 = this.khdhn(class_7462, this.bdht);
                float f8 = (float)(rm.mc.field_1724.method_23318() - this.bdht.method_23318());
                if (Math.abs(f6) < Float.intBitsToFloat(Integer.reverse(705987340) ^ 0x71312854) || Math.signum(f3) == Math.signum(f6)) {
                    HashMap<String, Number> hashMap = new HashMap<String, Number>();
                    hashMap.put("deltaYaw", Float.valueOf(f3));
                    hashMap.put("deltaPitch", Float.valueOf(f4));
                    hashMap.put("timeSinceLa".concat("stHitMs"), l - this.zthn);
                    hashMap.put("distance", Float.valueOf(f5));
                    hashMap.put("fallDistance", Float.valueOf(rm.mc.field_1724.field_6017));
                    hashMap.put("diffY", Float.valueOf(f8));
                    hashMap.put("targetDel".concat("taYaw"), Float.valueOf(f6));
                    hashMap.put("target".concat("DeltaPitch"), Float.valueOf(f7));
                    hashMap.put("prevTargetYaw", Float.valueOf(this.hwz_2 == Float.intBitsToFloat(0x5FE0153C ^ 0x9B99D53C) ? f6 : this.hwz_2));
                    hashMap.put("prevT".concat("argetPitch"), Float.valueOf(this.ddd_3 == Float.intBitsToFloat(1270821220 - -2025492124) ? f7 : this.ddd_3));
                    hashMap.put("prevYaw", Float.valueOf(this.ssd_2));
                    hashMap.put("prevPitch", Float.valueOf(this.shtt_3));
                    hashMap.put("prevD".concat("istance"), Float.valueOf(this.tdkh_2 == Float.intBitsToFloat(621105305 + -1619759257) ? f5 : this.tdkh_2));
                    this.thlz_2.add(hashMap);
                }
            }
            this.hwz_2 = f6;
            this.ddd_3 = f7;
            this.ssd_2 = f3;
            this.shtt_3 = f4;
            this.tdkh_2 = f5;
            if (this.bdht != null && l - this.zthn > (0xC65D4F51DED5448EL ^ 0xC65D4F51DED54152L) && !this.thlz_2.isEmpty()) {
                this.thaz_2();
                this.thlz_2.clear();
                this.bdht = null;
            }
            this.bgha_2 = class_7462.method_36454();
            this.dhkl = class_7462.method_36455();
        }
    }

    private void ztm_4(bbgh bbgh2) {
        try {
            int n = 217385669;
            n = Integer.rotateLeft(n * -32451411, 10) ^ 0x23DD844B;
            int n2 = n ^ 0x6687207;
            if ((n2 ^ n) != 107508231) {
                int cfr_ignored_0 = (0xA9D78C2 ^ n) + 1199085739;
            }
            if ((0x33D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        long l = System.currentTimeMillis();
        if (this.bdht != null && l - this.zthn <= (0xEF90FC4B890B55B7L ^ 0xEF90FC4B890B506BL) && this.bdht.method_5805() && rm.mc.field_1687.method_18456().contains(this.bdht) && rm.mc.field_1724.method_5739(this.bdht) < Float.intBitsToFloat(1425629311 - 341401727)) {
            class_746 class_7462 = rm.mc.field_1724;
            float f = class_7462.method_36454();
            float f2 = this.ahh_2(f - this.bgha_2);
            float f3 = this.zthq(class_7462, this.bdht);
            if (Math.abs(f2) < Float.intBitsToFloat(Integer.reverse(1950058622) ^ 0x3C59DC2E) || Math.signum(f2) == Math.signum(f3)) {
                bbgh2.dtn().drawCenteredText(bmn.sdha_2.twy_2(Float.intBitsToFloat(165968869 + 924550171)), "Recording", tdw.shjh() / 2.0f, Float.intBitsToFloat(0x3E3BB554 ^ 0x7C1BB554), byq.brz_2);
            }
        }
    }

    private void dhkth(bthy bthy2) {
        long l;
        try {
            int n = -972403588;
            n = Integer.rotateLeft(n * 1557696453, 16) ^ 0xB158BA24;
            n = System.identityHashCode(this) ^ n;
            bthy bthy3 = bthy2;
            n = (bthy3 != null ? System.identityHashCode(bthy3) : 0) ^ n;
            int n2 = n ^ 0x8947A08;
            if ((n2 ^ n) != 143948296) {
                int cfr_ignored_0 = (0xCE9E3674 ^ n) - 1407932054;
            }
            if ((0x2BA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        this.zthn = l = System.currentTimeMillis();
        class_1297 class_12972 = bthy2.khtf();
        if (class_12972 != null) {
            this.bdht = class_12972;
            class_746 class_7462 = class_310.method_1551().field_1724;
            if (class_7462 != null) {
                this.bgha_2 = class_7462.method_36454();
                this.dhkl = class_7462.method_36455();
            }
        } else {
            this.bdht = null;
        }
    }

    private static String thyt_2(String string, int n, int n2, int n3) {
        try {
            int n4 = 163500370;
            n4 = Integer.rotateLeft(n4 * -1717187585, 10) ^ 0x3F848A41;
            n4 = Integer.rotateRight(n ^ n4, 12);
            int n5 = n4 ^ 0xBDE8C7EA;
            if ((n5 ^ n4) != -1108817942) {
                int cfr_ignored_0 = (0xB45616B8 ^ n4) - 1629123740;
            }
            if ((0x20B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x5B39AE20) + i ^ tdh_3, 8) ^ n2 + nb));
        }
        return new String(cArray);
    }

    private static void khzj() {
        int n = -1199126321;
        int n2 = (n = Integer.rotateLeft(n * -477742877, 27) ^ 0x6E5F117B) ^ 0x66849847;
        if ((n2 ^ n) != 1719965767) {
            int cfr_ignored_0 = (0xDE025088 ^ n) + 1390122581;
        }
        yf.athz_2();
    }

    private static class_310 zyt_2() {
        block0: {
            int n = 2045638635;
            int n2 = (n = Integer.rotateLeft(n * 937946977, 16) ^ 0x7845215F) ^ 0x267277DC;
            if ((n2 ^ n) == 645035996) break block0;
            int cfr_ignored_0 = (0x5F9F8037 ^ n) + 918448036;
        }
        return class_310.method_1551();
    }

    private static void jbb(FileWriter fileWriter, String string) {
        int n = bdgh.zdhy(-1645327911);
        FileWriter fileWriter2 = fileWriter;
        n = Integer.rotateRight((fileWriter2 != null ? System.identityHashCode(fileWriter2) : 0) ^ n, 24);
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 14);
        int n2 = n ^ 0x3DEA668C;
        if ((n2 ^ n) != 1038771852) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xA0042F55 ^ n, 7) - 1692359302) * -1610338475;
            int cfr_ignored_1 = (int)(0x62B6816827D4EB4FL ^ (long)n ^ 0xFFA0831A2DB968BCL);
        }
        fileWriter.write(string);
    }

    private static void hbh_2(FileWriter fileWriter) {
        int n = -602321990;
        int n2 = (n = Integer.rotateLeft(n * 791419671, 25) ^ 0xC7E807EA) ^ 0x11273D29;
        if ((n2 ^ n) != 287784233) {
            int cfr_ignored_0 = (0xCD3E7693 ^ n) + -1219253581;
        }
        fileWriter.close();
    }

    private static float rlj(int n) {
        block0: {
            int n2 = -1511421573;
            int n3 = (n2 = Integer.rotateLeft(n2 * -719809271, 18) ^ 0xF32A702E) ^ 0xE47E5808;
            if ((n3 ^ n2) == -461481976) break block0;
            int cfr_ignored_0 = (0x4197D173 ^ n2) + 1574852942;
        }
        return Float.intBitsToFloat(n);
    }

    private static float thwh_2(int n) {
        block0: {
            int n2 = -1087647102;
            n2 = Integer.rotateLeft(n2 * -956639595, 25) ^ 0x3B7206FE;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 8)) ^ 0x84A3093C;
            if ((n3 ^ n2) == -2069690052) break block0;
            int cfr_ignored_0 = (0x3B88DBBE ^ n2) - 1792172572;
        }
        return Float.intBitsToFloat(n);
    }

    private static double arth(double d) {
        block0: {
            int n = 626651368;
            n = Integer.rotateLeft(n * 286597705, 24) ^ 0xCC915BE;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 29);
            int n2 = n ^ 0x6EECA5FF;
            if ((n2 ^ n) == 1861002751) break block0;
            int cfr_ignored_0 = (0x4BB55517 ^ n) + -1375120316;
        }
        return Math.toDegrees(d);
    }

    private static double rn(class_746 class_7462) {
        block0: {
            int n = bdgh.zdhy(1653112341);
            int n2 = n ^ 0x3CEF9975;
            if ((n2 ^ n) == 1022335349) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x5E67E760 ^ n, 14) + 1928504283;
        }
        return class_7462.method_23317();
    }

    private static double tqt_4(class_746 class_7462) {
        block0: {
            int n = -456928033;
            n = Integer.rotateLeft(n * 390358967, 12) ^ 0xD5DA11F9;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 5);
            int n2 = n ^ 0xE96130D0;
            if ((n2 ^ n) == -379506480) break block0;
            int cfr_ignored_0 = (0xDA2E40F ^ n) - 84800728;
        }
        return class_7462.method_23321();
    }

    private static double dya_4(class_1297 class_12972) {
        block0: {
            int n = bdgh.zdhy(-1757725975);
            int n2 = n ^ 0xAA587D06;
            if ((n2 ^ n) == -1437041402) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3D6347EF ^ n, 10) - 1935889708;
        }
        return class_12972.method_23320();
    }

    private static double jyd_2(double d) {
        block0: {
            int n = 994790869;
            int n2 = (n = Integer.rotateLeft(n * 1658885181, 23) ^ 0xF3568C3D) ^ 0x7698BA1B;
            if ((n2 ^ n) == 1989720603) break block0;
            int cfr_ignored_0 = (0x4DD3F7CE ^ n) + 631855357;
        }
        return Math.toDegrees(d);
    }

    private static float zjgh(class_746 class_7462) {
        block0: {
            int n = -875515643;
            int n2 = (n = Integer.rotateLeft(n * 1549370777, 16) ^ 0x21EA0F0C) ^ 0x6BBBE6DE;
            if ((n2 ^ n) == 1807476446) break block0;
            int cfr_ignored_0 = (0xA06B57DB ^ n) - 1728038256;
        }
        return class_7462.method_36455();
    }

    private static String[] rkhr(String string) {
        block0: {
            int n = 1129915648;
            n = Integer.rotateLeft(n * -1691961775, 21) ^ 0x6560207A;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 11);
            int n2 = n ^ 0x46D99EF6;
            if ((n2 ^ n) == 1188667126) break block0;
            int cfr_ignored_0 = (0x580BBF6 ^ n) + 314188621;
        }
        return string.split("\u0001\u0017", -1);
    }

    private static CallSite dhsy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1349724885;
            n3 = Integer.rotateLeft(n3 * 1472599721, 24) ^ 0x37E12903;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 23);
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0x52BF865D;
            if ((n4 ^ n3) != 1388283485) {
                int cfr_ignored_0 = (0x2CCAC88 ^ n3) - -461098432;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ thtz_4 ^ string.hashCode() ^ n2 + jmsh + i * -91967157) + thtz_4) ^ jmsh));
            }
            String[] stringArray = rm.rkhr(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] s2zvsz2vqj7(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ldd76f5h2xgfk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ d1i2f9d3x5uv ^ string.hashCode() ^ n2 + nu6oxmx ^ i * 317964311 ^ d1i2f9d3x5uv, 19) ^ nu6oxmx));
            }
            String[] stringArray = rm.s2zvsz2vqj7(new String(cArray));
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

