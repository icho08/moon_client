/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.UUID;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bsth;
import us.m0vy.moondlc.m0vyguard.yf;

public class bll {
    private final String sghh;
    private final UUID hma_2;
    private final String khfb;
    private final String ththk;
    private static final int jyz_2 = 164642002;
    private static final int jsz_2 = -1390818285;
    private static final int bhjsp0mf = 1533548348;
    private static final int tasx071bmod = -664253006;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zuxms8kwyy4;

    @Generated
    public String tash_3() {
        block0: {
            int n = -145105399;
            n = Integer.rotateLeft(n * 1246037483, 12) ^ 0x8691817E;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0xB18135A4;
            if ((n2 ^ n) == -1316932188) break block0;
            int cfr_ignored_0 = (0x46D8EBAD ^ n) + 1719499635;
        }
        return this.sghh;
    }

    @Generated
    public UUID shkd_2() {
        block0: {
            int n = bsth.snn(-1360955193);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC7BEDF5B;
            if ((n2 ^ n) == -943792293) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x695FA79C ^ n, 16) - -957158625) * 1767876509;
        }
        return this.hma_2;
    }

    @Generated
    public String zzr_2() {
        block0: {
            int n = 574530859;
            int n2 = (n = Integer.rotateLeft(n * 1069575385, 7) ^ 0x20C87801) ^ 0x82CEFB49;
            if ((n2 ^ n) == -2100364471) break block0;
            int cfr_ignored_0 = (0xA0F05E62 ^ n) - -1794210789;
        }
        return this.khfb;
    }

    @Generated
    public String khqs() {
        block0: {
            int n = -1929995496;
            n = Integer.rotateLeft(n * -1001675073, 19) ^ 0x4EC32BAA;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8A2D4936;
            if ((n2 ^ n) == -1976743626) break block0;
            int cfr_ignored_0 = (0x6DBD22E ^ n) + -924855055;
        }
        return this.ththk;
    }

    @Generated
    public boolean tbb_2(Object object) {
        int n = bsth.snn(1194452745);
        n = System.identityHashCode(this) ^ n;
        Object object2 = object;
        n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 9);
        int n2 = n ^ 0xCFCE9E04;
        if ((n2 ^ n) != -808542716) {
            int cfr_ignored_0 = Integer.rotateLeft(0x88FF790D ^ n, 4) - -1689434162;
            int cfr_ignored_1 = (int)(0x4A4DD73027D4EB4FL ^ (long)n ^ 0x5310831A2DB9394AL);
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof bll)) {
            return false;
        }
        bll bll2 = (bll)object;
        if (!bll.smk(bll2, this)) {
            return false;
        }
        String string = this.tash_3();
        String string2 = bll2.tash_3();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        UUID uUID = this.shkd_2();
        UUID uUID2 = bll2.shkd_2();
        if (uUID == null ? uUID2 != null : !((Object)uUID).equals(uUID2)) {
            return false;
        }
        String string3 = bll.khaa_4(this);
        String string4 = bll.jqdh(bll2);
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return false;
        }
        String string5 = this.khqs();
        String string6 = bll2.khqs();
        return !(string5 == null ? string6 != null : !string5.equals(string6));
    }

    @Generated
    protected boolean tta_2(Object object) {
        block0: {
            int n = -1394235417;
            n = Integer.rotateLeft(n * 823380255, 27) ^ 0x34C2DEA0;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 10);
            int n2 = n ^ 0xD751D2B2;
            if ((n2 ^ n) == -682503502) break block0;
            int cfr_ignored_0 = (0x7BB47555 ^ n) + -1538460052;
        }
        return object instanceof bll;
    }

    @Generated
    public int hda_3() {
        int n = -698039533;
        n = Integer.rotateLeft(n * 2045462993, 21) ^ 0x19EB3A4B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x3E6E2E71;
        if ((n2 ^ n) != 1047408241) {
            int cfr_ignored_0 = (0xE80AED62 ^ n) + -2138348969;
        }
        int n3 = Integer.reverse(1410212670) ^ 0x7CC47011;
        int n4 = 1;
        String string = this.tash_3();
        n4 = n4 * (177620179 - 177620120) + (string == null ? Integer.rotateLeft(0x10567FEB ^ 0x12E67FEB, 12) : string.hashCode());
        UUID uUID = bll.szh_6(this);
        n4 = n4 * (bll.ghdhd_2(-2083256924) ^ 0x25A02BFA) + (uUID == null ? 0x7FA842D5 ^ 0x7FA842FE : ((Object)uUID).hashCode());
        String string2 = this.zzr_2();
        n4 = n4 * (bll.jtd_2(-657131622) ^ 0x59EF2B20) + (string2 == null ? -2027327274 - -2027327317 : string2.hashCode());
        String string3 = this.khqs();
        n4 = n4 * (1218435388 + -1218435329) + (string3 == null ? 1204113600 + -1204113557 : string3.hashCode());
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    @Generated
    public String aghz_2() {
        var1_1 = null;
        var4_2 = 0;
        var2_3 = -1992553905;
        var2_3 = Integer.rotateLeft(var2_3 * -1991030273, 20) ^ 979802258;
        var3_4 = (int)((long)(2080841037 + var2_3) ^ 1531788589031289316L ^ 1531788589031289316L);
        while (true) {
            block34: {
                block32: {
                    block38: {
                        block43: {
                            block33: {
                                block35: {
                                    block37: {
                                        block31: {
                                            block36: {
                                                block44: {
                                                    block39: {
                                                        block42: {
                                                            block40: {
                                                                block41: {
                                                                    var4_2 = var3_4 - var2_3;
                                                                    switch (var4_2 & 7) {
                                                                        case 0: {
                                                                            if (var4_2 == 617400728) break block31;
                                                                            if (var4_2 == -1805720128) break block32;
                                                                            (Integer.rotateLeft(385436157 ^ var2_3, 5) - -863136546) * 385436157;
                                                                            (int)(-3149168701927527601L ^ (long)var2_3 ^ 3670577844766377286L);
                                                                            if (var4_2 != -287682144) {
                                                                                ** break;
                                                                            }
                                                                            break block33;
                                                                        }
                                                                        case 1: {
                                                                            if (var4_2 == 382775737) break block34;
                                                                            if (var4_2 != -2019402823) {
                                                                                (Integer.rotateLeft(1105703960 ^ var2_3, 11) + -9671133) * 1105703961;
                                                                                ** break;
                                                                            }
                                                                            break block35;
                                                                        }
                                                                        case 2: {
                                                                            if (var4_2 == -2111110870) break block36;
                                                                            if (var4_2 == 2098972634) break block37;
                                                                            Integer.rotateRight(1739457482 ^ var2_3, 15) + -1838148431;
                                                                            if (var4_2 != -77907270) {
                                                                                ** break;
                                                                            }
                                                                            break block38;
                                                                        }
                                                                        case 4: {
                                                                            if (var4_2 == 1067317436) break block39;
                                                                            if (var4_2 != -223598540) {
                                                                                (Integer.rotateLeft(598562041 ^ var2_3, 7) + 1448798562) * 598562041;
                                                                                (int)(-2224783970508936369L ^ (long)var2_3 ^ 646410694987116526L);
                                                                                if (var4_2 == -728545980) break;
                                                                                ** break;
                                                                            }
                                                                            break block40;
                                                                        }
                                                                        case 5: {
                                                                            if (var4_2 != 2080841037) {
                                                                                ** break;
                                                                            }
                                                                            break block41;
                                                                        }
                                                                        case 7: {
                                                                            if (var4_2 == -1544083673) break block42;
                                                                            if (var4_2 == -280368785) break block43;
                                                                            (Integer.rotateLeft(1715421080 ^ var2_3, 15) + 1711690403) * 1715421081;
                                                                            if (var4_2 != -1777073953) {
                                                                                ** break;
                                                                            }
                                                                            break block44;
                                                                        }
                                                                    }
                                                                    Integer.rotateLeft(311911145 ^ var2_3, 5) + 1152555378;
                                                                    (int)(-3448124728108848305L ^ (long)var2_3 ^ 7266702147221720474L);
                                                                    var1_1 = "Session(username=" + this.tash_3() + ", uuid=" + bll.dshdh_2(this.shkd_2()) + ", token=" + this.zzr_2() + ", type=" + this.khqs() + ")";
                                                                    (int)(-2900343713388575718L ^ (long)var2_3 ^ 3239219995331396270L);
                                                                    var3_4 = (int)((long)(-1393784635 + var2_3) ^ -3805129412112790130L ^ -3805129412112790130L);
                                                                    (int)(-3074403905332493642L ^ (long)var2_3 ^ -671192915392198790L);
                                                                    var3_4 = 382775737 + var2_3 ^ 475108978 ^ 475108978;
                                                                    var4_2 -= 5;
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(-959707837 ^ var2_3, 11) + 387072600;
                                                                if (yf.dnkh()) {
                                                                    var3_4 = -223598540 + var2_3 ^ 1407126911 ^ 1407126911;
                                                                    var4_2 -= 4;
                                                                    continue;
                                                                }
                                                                try {
                                                                    ++var4_2;
                                                                    if ((5442049969093528931L ^ (long)var2_3 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    var3_4 = -728545980 + var2_3;
                                                                }
                                                                catch (UnsupportedOperationException v0) {
                                                                    var3_4 = (int)((long)(-728545980 + var2_3) ^ 1947986078916862468L ^ 1947986078916862468L);
                                                                }
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(327656698 ^ var2_3, 5) + 1640667521) * 327656699;
                                                            throw null;
                                                        }
                                                        (Integer.rotateLeft(-1353244239 ^ var2_3, 8) + 1072346026) * -1353244239;
                                                        (int)(7918893351927343951L ^ (long)var2_3 ^ -2132310275100412390L);
                                                        var3_4 = (int)((long)(1971138391 + var2_3) ^ 1439234128455265872L ^ 1439234128455265872L);
                                                        (Integer.rotateLeft(731273401 ^ var2_3, 8) + 1267883426) * 731273401;
                                                        (int)(-1646920516246377649L ^ (long)var2_3 ^ 1186842650271580056L);
                                                        try {
                                                            var4_2 -= 3;
                                                            if ((3350279035617072731L ^ (long)var2_3 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            var3_4 = 2080841037 + var2_3;
                                                        }
                                                        catch (ArithmeticException v1) {
                                                            var3_4 = Integer.reverse(Integer.reverse(2080841037 + var2_3));
                                                        }
                                                        var4_2 -= 2;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(849778027 ^ var2_3, 9) + 646559536;
                                                    var3_4 = (int)((long)(-634361640 + var2_3) ^ 558638980297543934L ^ 558638980297543934L);
                                                    Integer.rotateLeft(-676828607 ^ var2_3, 13) + 566394138;
                                                    (int)(1520743861714217807L ^ (long)var2_3 ^ 8469163247729739748L);
                                                    var3_4 = Integer.reverse(Integer.reverse(697842195 + var2_3));
                                                    (Integer.rotateRight(712967954 ^ var2_3, 8) + 700414569) * 712967955;
                                                    var3_4 = 2080841037 + var2_3 + 1088646331 - 1088646331;
                                                    var4_2 -= 5;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-779114094 ^ var2_3, 13) + 1690511337) * -779114093;
                                                (int)(4399031286881468393L ^ (long)var2_3 ^ 160784332044490697L);
                                                var3_4 = Integer.reverse(Integer.reverse(2080841037 + var2_3));
                                                var4_2 -= 4;
                                                continue;
                                            }
                                            (Integer.rotateLeft(630892892 ^ var2_3, 7) - -1843912353) * 630892893;
                                            (int)(-1349102936585544541L ^ (long)var2_3 ^ -1045650469027809441L);
                                            var3_4 = -1518374850 + var2_3;
                                            (int)(8749974870780180773L ^ (long)var2_3 ^ -5556614733610787059L);
                                            var3_4 = (int)((long)(2080841037 + var2_3) ^ -5645951461681567459L ^ -5645951461681567459L);
                                            var4_2 -= 4;
                                            continue;
                                        }
                                        (Integer.rotateRight(1129322811 ^ var2_3, 11) + 722513248) * 1129322811;
                                        var3_4 = -382410798 + var2_3;
                                        Integer.rotateLeft(-656913983 ^ var2_3, 14) + 1183747482;
                                        (int)(1903588862703496015L ^ (long)var2_3 ^ 3641304447188572420L);
                                        var3_4 = (int)((long)(2080841037 + var2_3) ^ 8428619560094977262L ^ 8428619560094977262L);
                                        Integer.rotateLeft(-764635871 ^ var2_3, 13) + 2139336250;
                                        (int)(1215473941550000975L ^ (long)var2_3 ^ -8410328155654878099L);
                                        continue;
                                    }
                                    (Integer.rotateRight(1770121970 ^ var2_3, 16) + -887549303) * 1770121971;
                                    (int)(2181727500070649850L ^ (long)var2_3 ^ -1854092847086333601L);
                                    var3_4 = 1373493087 + var2_3;
                                    (int)(-6365049027503713289L ^ (long)var2_3 ^ 7364757408872718980L);
                                    var3_4 = (int)((long)(2080841037 + var2_3) ^ 8586779409837082069L ^ 8586779409837082069L);
                                    var4_2 += 5;
                                    continue;
                                }
                                Integer.rotateRight(2044569443 ^ var2_3, 18) + -969612232;
                                var3_4 = 1182266368 + var2_3 ^ 1442849186 ^ 1442849186;
                                (Integer.rotateRight(342573459 ^ var2_3, 5) + 2103087112) * 342573459;
                                try {
                                    var4_2 += 2;
                                    if ((617153671769572815L ^ (long)var2_3 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    var3_4 = 2080841037 + var2_3;
                                }
                                catch (NoSuchElementException v2) {
                                    var3_4 = Integer.reverse(Integer.reverse(2080841037 + var2_3));
                                }
                                var4_2 += 4;
                                continue;
                            }
                            (Integer.rotateLeft(-703236835 ^ var2_3, 13) - -252260930) * -703236835;
                            (int)(1488399133022939983L ^ (long)var2_3 ^ 5417974500186227870L);
                            var3_4 = -1076690510 + var2_3;
                            (Integer.rotateRight(280516731 ^ var2_3, 5) + 179328544) * 280516731;
                            try {
                                var4_2 -= 3;
                                if ((3289352758150788729L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var3_4 = 2080841037 + var2_3;
                            }
                            catch (IllegalStateException v3) {
                                var3_4 = Integer.reverse(Integer.reverse(2080841037 + var2_3));
                            }
                            var4_2 -= 5;
                            continue;
                        }
                        Integer.rotateLeft(-1379122520 ^ var2_3, 8) + 270119315;
                        (int)(2339939549567989911L ^ (long)var2_3 ^ -5166170326999372509L);
                        var3_4 = Integer.reverse(Integer.reverse(-6398515 + var2_3));
                        (int)(5616535670751832250L ^ (long)var2_3 ^ 2282878891386418738L);
                        var3_4 = 2080841037 + var2_3;
                        var4_2 -= 2;
                        continue;
                    }
                    (Integer.rotateRight(-2006119909 ^ var2_3, 4) + -1986930560) * -2006119909;
                    var3_4 = (int)((long)(-578888472 + var2_3) ^ 615736332066645263L ^ 615736332066645263L);
                    (Integer.rotateRight(489704063 ^ var2_3, 6) - -1925798756) * 489704063;
                    try {
                        ++var4_2;
                        if ((767672031710134859L ^ (long)var2_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var3_4 = 2080841037 + var2_3;
                    }
                    catch (NoSuchElementException v4) {
                        var3_4 = 2080841037 + var2_3;
                    }
                    var4_2 -= 4;
                    continue;
                }
                (Integer.rotateLeft(-1219398596 ^ var2_3, 9) - 926593663) * -1219398595;
                var3_4 = 2080841037 + var2_3;
                continue;
            }
            return var1_1;
lbl235:
            // 7 sources

            (Integer.rotateLeft(1338984789 ^ var2_3, 12) - -1367900026) * 1338984789;
            (int)(-8251184507742000305L ^ (long)var2_3 ^ 3720117440667498282L);
            var3_4 = Integer.reverse(Integer.reverse(2080841037 + var2_3));
        }
    }

    @Generated
    public bll(String string, UUID uUID, String string2, String string3) {
        this.sghh = string;
        this.hma_2 = uUID;
        this.khfb = string2;
        this.ththk = string3;
    }

    private static boolean smk(bll bll2, Object object) {
        block0: {
            int n = -2015589369;
            int n2 = (n = Integer.rotateLeft(n * 858160419, 20) ^ 0x15B0B78B) ^ 0xFF04D95;
            if ((n2 ^ n) == 267406741) break block0;
            int cfr_ignored_0 = (0x882CC192 ^ n) - -958014371;
        }
        return bll2.tta_2(object);
    }

    private static String khaa_4(bll bll2) {
        block0: {
            int n = -1079056519;
            n = Integer.rotateLeft(n * 936992281, 5) ^ 0x6230F292;
            bll bll3 = bll2;
            n = (bll3 != null ? System.identityHashCode(bll3) : 0) ^ n;
            int n2 = n ^ 0x1B7110E5;
            if ((n2 ^ n) == 460394725) break block0;
            int cfr_ignored_0 = (0xA4DFF79C ^ n) - -1748203494;
        }
        return bll2.zzr_2();
    }

    private static String jqdh(bll bll2) {
        block0: {
            int n = -1116443130;
            int n2 = (n = Integer.rotateLeft(n * 144755239, 3) ^ 0xA6B344AF) ^ 0x12236A31;
            if ((n2 ^ n) == 304310833) break block0;
            int cfr_ignored_0 = (0xAF570437 ^ n) - 1697629572;
        }
        return bll2.zzr_2();
    }

    private static UUID szh_6(bll bll2) {
        block0: {
            int n = bsth.snn(816724475);
            int n2 = n ^ 0x7D9BA755;
            if ((n2 ^ n) == 2107352917) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x4D359EAE ^ n, 12) - 1574688333;
        }
        return bll2.shkd_2();
    }

    private static int ghdhd_2(int n) {
        block0: {
            int n2 = 589018595;
            int n3 = (n2 = Integer.rotateLeft(n2 * -893499367, 11) ^ 0xF28C3D7E) ^ 0xA7238370;
            if ((n3 ^ n2) == -1490844816) break block0;
            int cfr_ignored_0 = (0x84383693 ^ n2) - 65058492;
        }
        return Integer.reverse(n);
    }

    private static int jtd_2(int n) {
        block0: {
            int n2 = -594539910;
            n2 = Integer.rotateLeft(n2 * -1045423309, 23) ^ 0xEEA74740;
            int n3 = (n2 = n ^ n2) ^ 0xEE314D58;
            if ((n3 ^ n2) == -298758824) break block0;
            int cfr_ignored_0 = (0x32A14722 ^ n2) - 1302303277;
        }
        return Integer.reverse(n);
    }

    private static String dshdh_2(Object object) {
        block0: {
            int n = bsth.snn(1481950337);
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 21);
            int n2 = n ^ 0x6CC6EC49;
            if ((n2 ^ n) == 1824975945) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x349228C8 ^ n, 9) + 1645252467;
        }
        return String.valueOf(object);
    }

    private static String[] zsha_4(String string) {
        int n = -2141460717;
        n = Integer.rotateLeft(n * 767013139, 4) ^ 0xD79F748B;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
        int n2 = n ^ 0x77EFC758;
        if ((n2 ^ n) != 2012202840) {
            int cfr_ignored_0 = (0xF7B4204B ^ n) - 1182283224;
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

    private static CallSite hhf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1233360092;
            n3 = Integer.rotateLeft(n3 * -1138528141, 18) ^ 0x8EFB350E;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 12);
            int n4 = n3 ^ 0x4EB61769;
            if ((n4 ^ n3) != 1320556393) {
                int cfr_ignored_0 = (0xF8CA7C4D ^ n3) - 1295354789;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ jyz_2 ^ string.hashCode() ^ n2 + jsz_2 ^ i * 1241530995 ^ jyz_2, 17) ^ jsz_2));
            }
            String[] stringArray = bll.zsha_4(new String(cArray));
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

    private static String[] uk5vn33c(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ke3byoaxj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ bhjsp0mf ^ string.hashCode() ^ n2 + tasx071bmod ^ i * 1764063087 ^ bhjsp0mf, 20) ^ tasx071bmod));
            }
            String[] stringArray = bll.uk5vn33c(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

