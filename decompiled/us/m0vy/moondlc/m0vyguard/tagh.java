/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1923
 *  net.minecraft.class_2338
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import us.m0vy.moondlc.m0vyguard.brf;
import us.m0vy.moondlc.m0vyguard.btn_2;
import us.m0vy.moondlc.m0vyguard.tthz;
import us.m0vy.moondlc.m0vyguard.yf;

public class tagh {
    private static final Map sas_6;
    private static final Map djd;
    private static final int dhzb_2 = -298959036;
    private static final int dth_2 = 1911912310;
    private static final int dt6z38heaqvy = -1102789281;
    private static final int kh24at4lheq = 1479163106;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zm4va21a5;

    public static void zdha(class_1923 class_19232, float f) {
        btn_2 btn2;
        int n = -759633988;
        n = Integer.rotateLeft(n * 371290819, 19) ^ 0x3B676054;
        class_1923 class_19233 = class_19232;
        n = (class_19233 != null ? System.identityHashCode(class_19233) : 0) ^ n;
        int n2 = n ^ 0x2C6F840C;
        if ((n2 ^ n) != 745505804) {
            int cfr_ignored_0 = (0xFED763B0 ^ n) + -910807833;
        }
        if ((btn2 = btn_2.shrh_2()) != null && btn2.rgha_2() && tagh.thth_4(btn2)) {
            sas_6.put(tagh.bzh_2(class_19232.method_8324()), System.currentTimeMillis());
        }
    }

    public static Float wq(class_1923 class_19232) {
        block0: {
            int n = brf.abj(-1129383499);
            int n2 = n ^ 0x79C7464;
            if ((n2 ^ n) == 127693924) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xBB328DD1 ^ n, 10) + -1350775926) * -1154314799;
            int cfr_ignored_1 = (int)(0x798023EC27D4EB4FL ^ (long)n ^ 0xBAA8831A2DB95ED1L);
        }
        return null;
    }

    public static Float dzf_4(class_2338 class_23382) {
        btn_2 btn2;
        int n = 1062429777;
        int n2 = (n = Integer.rotateLeft(n * -177052751, 12) ^ 0x2C092903) ^ 0xD09138FA;
        if ((n2 ^ n) != -795789062) {
            int cfr_ignored_0 = (0xEFC25CAB ^ n) - 973091720;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if ((btn2 = tagh.sn()) == null || !tagh.thwt(btn2) || !btn2.thnh_2()) {
            tagh.sghw_2();
            return null;
        }
        long l = new class_1923(class_23382.method_10263() >> 4, tagh.zzgh_4(class_23382) >> 4).method_8324();
        Long l2 = (Long)sas_6.get(l);
        if (l2 == null) {
            return null;
        }
        return tagh.hnm(tagh.khjb(class_23382), l2, class_23382.method_10264(), btn2);
    }

    public static Float tddh_3(int n, int n2, int n3) {
        btn_2 btn2;
        int n4 = -604325221;
        n4 = Integer.rotateLeft(n4 * 997444113, 26) ^ 0x37BE53EC;
        n4 = Integer.rotateLeft(n ^ n4, 19);
        int n5 = (n4 = n2 ^ n4) ^ 0xE510E1C1;
        if ((n5 ^ n4) != -451878463) {
            int cfr_ignored_0 = (0x3EEA5B5A ^ n4) - 591262572;
        }
        if ((btn2 = btn_2.shrh_2()) == null || !btn2.rgha_2() || !btn2.thnh_2()) {
            tagh.dhtt_4();
            return null;
        }
        Long l = tagh.dhaf_2(n >> 4, n3 >> 4);
        if (l == null) {
            return null;
        }
        long l2 = class_2338.method_10064((int)n, (int)n2, (int)n3);
        return tagh.hnm(l2, l, n2, btn2);
    }

    private static Float hnm(long l, long l2, int n, btn_2 btn2) {
        int n2 = 1607985778;
        n2 = Integer.rotateLeft(n2 * 1085616401, 8) ^ 0x60798F82;
        n2 = (int)l2 ^ n2;
        int n3 = (n2 = n ^ n2) ^ 0x3904221C;
        if ((n3 ^ n2) != 956572188) {
            int cfr_ignored_0 = (0x66D3C86E ^ n2) - -749065414;
        }
        tthz tthz2 = djd.computeIfAbsent(tagh.asa_2(l), arg_0 -> tagh.sdr_3(l2, arg_0));
        if (tthz2.hmk != l2) {
            tthz2.hmk = l2;
            tthz2.shtht.set(0xB6B485E715DBBC63L ^ 0x494B7A18EA24439CL);
            tthz2.hdj_2 = false;
        }
        if (tthz2.hdj_2) {
            return null;
        }
        long l3 = tthz2.shtht.get();
        if (l3 == (0x796B39A2FE78078AL ^ 0x8694C65D0187F875L)) {
            l3 = System.currentTimeMillis();
            tagh.sdth_3(tthz2.shtht, l3);
        }
        long l4 = Math.max(1L, btn2.khkhm());
        long l5 = System.currentTimeMillis() - l3;
        if (l5 > l4) {
            tthz2.hdj_2 = true;
            return null;
        }
        double d = (double)l5 / (double)l4;
        double d2 = tagh.zqs_2(btn2, d);
        return tagh.khlz_2((float)((double)(-n) + (double)n * d2));
    }

    private static Long dhaf_2(int n, int n2) {
        int n3 = 661441643;
        n3 = Integer.rotateLeft(n3 * -229954177, 22) ^ 0xD697956B;
        int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 11)) ^ 0xE6F5BAC4;
        if ((n4 ^ n3) != -420103484) {
            int cfr_ignored_0 = (0xC19976AF ^ n3) - 1092325094;
        }
        Long l = null;
        long l2 = tagh.shtj();
        for (Map.Entry entry : sas_6.entrySet()) {
            long l3 = tagh.dzr((Long)entry.getKey());
            int n5 = (int)l3;
            int n6 = (int)(l3 >> Integer.rotateLeft(0xDEF10D02 ^ 0xDEE10D02, 17));
            Long l4 = (Long)entry.getValue();
            if (l2 - l4 > (0x435021FD44A0BA30L ^ 0x435021FD44A0B188L)) {
                sas_6.remove(l3, l4);
                continue;
            }
            if (n5 < n || n5 >= n + Integer.rotateLeft(0x538BE079 ^ 0x738BE079, 6) || n6 < n2 || n6 >= n2 + Integer.rotateLeft(0xA9ADDA7C ^ 0x29ADDA7C, 4) || l != null && l4 <= tagh.rwk(l)) continue;
            l = l4;
        }
        return l;
    }

    private static void shnl() {
        int n = 0;
        int n2 = -1318324969;
        n2 = Integer.rotateLeft(n2 * -328125567, 3) ^ 0x71D3A9E0;
        int n3 = 692461874 * 458530243 + -1539171183 ^ n2;
        block34: while (true) {
            switch (((n3 ^ n2) - -1539171183) * -909690133) {
                case 692461874: {
                    int cfr_ignored_0 = Integer.rotateRight(0x9A907562 ^ n2, 6) + -1143220711;
                    if (yf.khdha_2()) {
                        try {
                            n -= 3;
                            if ((0x18121D55C72FA27L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = -296486579 * 458530243 + -1539171183 ^ n2;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = -296486579 * 458530243 + -1539171183 ^ n2 ^ 0x508E64ED ^ 0x508E64ED;
                        }
                        n -= 4;
                        continue block34;
                    }
                    try {
                        if ((0x607F542721FD0D31L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(127842388 * 458530243 + -1539171183 ^ n2) ^ 0xC3D4AC398D8435A5L ^ 0xC3D4AC398D8435A5L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = 127842388 * 458530243 + -1539171183 ^ n2 ^ 0x2804F2 ^ 0x2804F2;
                    }
                    continue block34;
                }
                case -296486579: {
                    int cfr_ignored_1 = Integer.rotateLeft(0xDA73D3C0 ^ n2, 14) + 2019836795;
                    sas_6.clear();
                    djd.clear();
                    return;
                }
                case 127842388: {
                    int cfr_ignored_2 = Integer.rotateRight(0x9072B1E3 ^ n2, 5) + -2109658696;
                    yf.athz_2();
                    try {
                        n3 = Integer.reverse(Integer.reverse(-296486579 * 458530243 + -1539171183 ^ n2));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = -296486579 * 458530243 + -1539171183 ^ n2;
                    }
                    --n;
                    continue block34;
                }
                case 685392493: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xA63B7732 ^ n2, 7) + 630263369) * -1506052301;
                    n3 = (237436410 * 458530243 + -1539171183 ^ n2) + -575654087 - -575654087;
                    int cfr_ignored_4 = Integer.rotateRight(0x920A5147 ^ n2, 5) - -1281526060;
                    try {
                        if ((0x779515CDECBAC03FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(692461874 * 458530243 + -1539171183 ^ n2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(692461874 * 458530243 + -1539171183 ^ n2));
                    }
                    n += 4;
                    continue block34;
                }
                case 2129067473: {
                    int cfr_ignored_5 = Integer.rotateRight(0x68627822 ^ n2, 16) + -1471534247;
                    n3 = (int)((long)(697875245 * 458530243 + -1539171183 ^ n2) ^ 0x7BF1A2B582FE8150L ^ 0x7BF1A2B582FE8150L);
                    int cfr_ignored_6 = Integer.rotateRight(0x8B2F036F ^ n2, 4) - -552662612;
                    n3 = 692461874 * 458530243 + -1539171183 ^ n2;
                    n -= 2;
                    continue block34;
                }
                case -545726969: {
                    int cfr_ignored_7 = (Integer.rotateRight(0x2449A7B ^ n2, 3) + 1252807712) * 38050427;
                    n3 = (int)((long)(1828156822 * 458530243 + -1539171183 ^ n2) ^ 0xCC8B3283A12E821CL ^ 0xCC8B3283A12E821CL);
                    int cfr_ignored_8 = (Integer.rotateRight(0x777CC4F6 ^ n2, 17) - 2088335621) * 2004665591;
                    n3 = -1517786027 * 458530243 + -1539171183 ^ n2;
                    int cfr_ignored_9 = (Integer.rotateRight(0x36320D53 ^ n2, 9) + -1804780472) * 909249875;
                    n3 = (int)((long)(692461874 * 458530243 + -1539171183 ^ n2) ^ 0x1B07657AADEC42B7L ^ 0x1B07657AADEC42B7L);
                    n += 3;
                    continue block34;
                }
                case 1658026461: {
                    int cfr_ignored_10 = Integer.rotateLeft(0xBD1C98A0 ^ n2, 10) + -355198309;
                    try {
                        n -= 5;
                        if ((0x39AB555E7B721025L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (692461874 * 458530243 + -1539171183 ^ n2) + -381168553 - -381168553;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 692461874 * 458530243 + -1539171183 ^ n2 ^ 0xF0DC8D65 ^ 0xF0DC8D65;
                    }
                    continue block34;
                }
                case -230688945: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0xA0823E58 ^ n2, 7) + 1948462051) * -1602077095;
                    n3 = -1866949794 * 458530243 + -1539171183 ^ n2 ^ 0x37103F5F ^ 0x37103F5F;
                    int cfr_ignored_12 = Integer.rotateRight(0x10111EA7 ^ n2, 5) - -160410252;
                    n3 = -668582335 * 458530243 + -1539171183 ^ n2;
                    int cfr_ignored_13 = (Integer.rotateLeft(0x5782D34 ^ n2, 3) - -1377101689) * 91761973;
                    n3 = (int)((long)(692461874 * 458530243 + -1539171183 ^ n2) ^ 0x8643F6BAD45D0FCL ^ 0x8643F6BAD45D0FCL);
                    n -= 4;
                    continue block34;
                }
                case 1696983910: {
                    int cfr_ignored_14 = Integer.rotateRight(0x1AA8882E ^ n2, 6) - 1053170893;
                    n3 = Integer.reverse(Integer.reverse(202568879 * 458530243 + -1539171183 ^ n2));
                    int cfr_ignored_15 = (Integer.rotateRight(0x673C236 ^ n2, 3) - -865983547) * 108249655;
                    try {
                        n -= 2;
                        if ((0x188D287CAEECB725L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(692461874 * 458530243 + -1539171183 ^ n2) ^ 0xBED6E19B1C4E0AA2L ^ 0xBED6E19B1C4E0AA2L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(692461874 * 458530243 + -1539171183 ^ n2) ^ 0xB4F585E05380D8FEL ^ 0xB4F585E05380D8FEL);
                    }
                    continue block34;
                }
                case -1089736393: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0x4EC08115 ^ n2, 12) - -1918025530) * 1321238805;
                    int cfr_ignored_17 = (int)(0x8C722F2827D4EB4FL ^ (long)n2 ^ 0xA320831A2DB8B535L);
                    n3 = Integer.reverse(Integer.reverse(-758123067 * 458530243 + -1539171183 ^ n2));
                    int cfr_ignored_18 = Integer.rotateRight(0x3EEED047 ^ n2, 10) - -1555507244;
                    try {
                        n += 2;
                        n3 = (692461874 * 458530243 + -1539171183 ^ n2) + 756150463 - 756150463;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(692461874 * 458530243 + -1539171183 ^ n2));
                    }
                    continue block34;
                }
                case -1087783397: {
                    int cfr_ignored_19 = Integer.rotateLeft(0x1D22B02D ^ n2, 6) - -1953434450;
                    int cfr_ignored_20 = (int)(0xDF901E1027D4EB4FL ^ (long)n2 ^ 0xC150831A2DB812F1L);
                    n3 = -1643111612 * 458530243 + -1539171183 ^ n2 ^ 0x4F0FFF7A ^ 0x4F0FFF7A;
                    int cfr_ignored_21 = Integer.rotateLeft(0xA8AA236C ^ n2, 8) - 1895295311;
                    try {
                        if ((0x5D4155B286EA7F05L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (692461874 * 458530243 + -1539171183 ^ n2) + -2121456203 - -2121456203;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 692461874 * 458530243 + -1539171183 ^ n2 ^ 0xBABC6D17 ^ 0xBABC6D17;
                    }
                    n -= 4;
                    continue block34;
                }
                case 1905330532: {
                    int cfr_ignored_22 = (Integer.rotateLeft(0xEE373839 ^ n2, 16) + -586322398) * -298371015;
                    int cfr_ignored_23 = (int)(0x2C85960427D4EB4FL ^ (long)n2 ^ 0xD178831A2DB9F4DAL);
                    try {
                        if ((0x9AC9F01D3A04359DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = 692461874 * 458530243 + -1539171183 ^ n2 ^ 0xEEDC8A0C ^ 0xEEDC8A0C;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (692461874 * 458530243 + -1539171183 ^ n2) + 130502150 - 130502150;
                    }
                    ++n;
                    continue block34;
                }
                case 2097337384: {
                    int cfr_ignored_24 = Integer.rotateLeft(0xE0ED1045 ^ n2, 15) - 1091737494;
                    int cfr_ignored_25 = (int)(0x225FBE7827D4EB4FL ^ (long)n2 ^ 0x8180831A2DB9E96EL);
                    int cfr_ignored_26 = (int)(0xC7B37777BB7B12D6L ^ (long)n2 ^ 0x139FBA45DE8A22B7L);
                    n3 = -1740881778 * 458530243 + -1539171183 ^ n2 ^ 0x2EF03C5 ^ 0x2EF03C5;
                    int cfr_ignored_27 = (int)(0xAE7AE6EA0AFD8D98L ^ (long)n2 ^ 0x30A4D948E016F124L);
                    n3 = 692461874 * 458530243 + -1539171183 ^ n2;
                    n -= 2;
                    continue block34;
                }
                case -1911069425: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0xD9F15675 ^ n2, 14) - 1754732390) * -638495115;
                    int cfr_ignored_29 = (int)(0x1B43F84827D4EB4FL ^ (long)n2 ^ 0xDE0831A2DB99B56L);
                    n3 = 1972148100 * 458530243 + -1539171183 ^ n2;
                    int cfr_ignored_30 = (Integer.rotateRight(0x3091CCD2 ^ n2, 9) + -435852119) * 814861523;
                    n3 = 692461874 * 458530243 + -1539171183 ^ n2;
                    n -= 2;
                    continue block34;
                }
            }
            int cfr_ignored_31 = (Integer.rotateRight(0x24683EFA ^ n2, 7) + 1828536193) * 610811643;
            n3 = (692461874 * 458530243 + -1539171183 ^ n2) + -197795300 - -197795300;
        }
    }

    private static tthz sdr_3(long l, Long l2) {
        int n = -560744164;
        int n2 = (n = Integer.rotateLeft(n * -1745470967, 14) ^ 0xE1661DE2) ^ 0xF7777088;
        if ((n2 ^ n) != -143167352) {
            int cfr_ignored_0 = (0x29E4C994 ^ n) + -1807229101;
        }
        return new tthz(l);
    }

    private static boolean thth_4(btn_2 btn2) {
        block0: {
            int n = -1266597310;
            n = Integer.rotateLeft(n * 1818269673, 26) ^ 0x479C1640;
            btn_2 btn3 = btn2;
            n = (btn3 != null ? System.identityHashCode(btn3) : 0) ^ n;
            int n2 = n ^ 0x5AF30F63;
            if ((n2 ^ n) == 1525878627) break block0;
            int cfr_ignored_0 = (0xEE724D21 ^ n) + -448287799;
        }
        return btn2.thnh_2();
    }

    private static Long bzh_2(long l) {
        block0: {
            int n = brf.abj(-2132753841);
            int n2 = (n = Integer.rotateRight((int)l ^ n, 13)) ^ 0x1AC5A8;
            if ((n2 ^ n) == 1754536) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x80FA07E7 ^ n, 3) - -1566272460;
        }
        return l;
    }

    private static btn_2 sn() {
        block0: {
            int n = -993804716;
            int n2 = (n = Integer.rotateLeft(n * -1146671543, 3) ^ 0xFD757D3) ^ 0xB2DA65;
            if ((n2 ^ n) == 11721317) break block0;
            int cfr_ignored_0 = (0xC4716431 ^ n) - 1134059071;
        }
        return btn_2.shrh_2();
    }

    private static boolean thwt(btn_2 btn2) {
        block0: {
            int n = brf.abj(997267325);
            btn_2 btn3 = btn2;
            n = Integer.rotateRight((btn3 != null ? System.identityHashCode(btn3) : 0) ^ n, 25);
            int n2 = n ^ 0x3ED0C2E;
            if ((n2 ^ n) == 65866798) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x389C1B53 ^ n, 10) + -549130680) * 949754707;
        }
        return btn2.rgha_2();
    }

    private static void sghw_2() {
        int n = -1924243668;
        int n2 = (n = Integer.rotateLeft(n * -737610049, 20) ^ 0x9D4744E7) ^ 0x21DD924D;
        if ((n2 ^ n) != 568169037) {
            int cfr_ignored_0 = (0xAC93CD61 ^ n) + -1620478012;
        }
        tagh.shnl();
    }

    private static int zzgh_4(class_2338 class_23382) {
        block0: {
            int n = -1020849782;
            int n2 = (n = Integer.rotateLeft(n * 1832981191, 15) ^ 0xBA8B7F60) ^ 0xCD1C5F46;
            if ((n2 ^ n) == -853778618) break block0;
            int cfr_ignored_0 = (0xE3B4ECC ^ n) - -2039243012;
        }
        return class_23382.method_10260();
    }

    private static long khjb(class_2338 class_23382) {
        block0: {
            int n = brf.abj(-900254332);
            int n2 = n ^ 0x9D331FA8;
            if ((n2 ^ n) == -1657593944) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x57642A2C ^ n, 13) - -1719747953;
        }
        return class_23382.method_10063();
    }

    private static void dhtt_4() {
        int n = brf.abj(-1797867787);
        int n2 = n ^ 0x8EEEB0FB;
        if ((n2 ^ n) != -1896959749) {
            int cfr_ignored_0 = Integer.rotateRight(0x1A38060E ^ n, 6) - 824597229;
        }
        tagh.shnl();
    }

    private static Long asa_2(long l) {
        block0: {
            int n = 1584604436;
            n = Integer.rotateLeft(n * -1374908089, 26) ^ 0xE850E7DA;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 7)) ^ 0x3F439384;
            if ((n2 ^ n) == 1061393284) break block0;
            int cfr_ignored_0 = (0x6130B690 ^ n) - 631959524;
        }
        return l;
    }

    private static void sdth_3(AtomicLong atomicLong, long l) {
        int n = brf.abj(-1547784952);
        AtomicLong atomicLong2 = atomicLong;
        n = (atomicLong2 != null ? System.identityHashCode(atomicLong2) : 0) ^ n;
        int n2 = n ^ 0x9193688C;
        if ((n2 ^ n) != -1852610420) {
            int cfr_ignored_0 = Integer.rotateLeft(0x322DC584 ^ n, 9) - 401115703;
        }
        atomicLong.set(l);
    }

    private static double zqs_2(btn_2 btn2, double d) {
        block0: {
            int n = -641205085;
            n = Integer.rotateLeft(n * -1314462209, 4) ^ 0x4F8656F5;
            btn_2 btn3 = btn2;
            n = (btn3 != null ? System.identityHashCode(btn3) : 0) ^ n;
            int n2 = n ^ 0xADB855BF;
            if ((n2 ^ n) == -1380428353) break block0;
            int cfr_ignored_0 = (0x747FA91C ^ n) + -1848449323;
        }
        return btn2.dzth_3(d);
    }

    private static Float khlz_2(float f) {
        block0: {
            int n = -1420732297;
            n = Integer.rotateLeft(n * -486842165, 14) ^ 0x7F91B7FF;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 5);
            int n2 = n ^ 0x3A6D600A;
            if ((n2 ^ n) == 980246538) break block0;
            int cfr_ignored_0 = (0x913C387D ^ n) + -1076615584;
        }
        return Float.valueOf(f);
    }

    private static long shtj() {
        block0: {
            int n = 558751412;
            int n2 = (n = Integer.rotateLeft(n * -525345929, 24) ^ 0x1F1F6B0) ^ 0x54F398FE;
            if ((n2 ^ n) == 1425250558) break block0;
            int cfr_ignored_0 = (0x75BE464A ^ n) + 1476987990;
        }
        return System.currentTimeMillis();
    }

    private static long dzr(Long l) {
        block0: {
            int n = -248669825;
            n = Integer.rotateLeft(n * -1081709277, 6) ^ 0xC7F7FE4F;
            Long l2 = l;
            n = (l2 != null ? System.identityHashCode(l2) : 0) ^ n;
            int n2 = n ^ 0x2F1F5025;
            if ((n2 ^ n) == 790581285) break block0;
            int cfr_ignored_0 = (0xDE32C95A ^ n) - 282110351;
        }
        return l;
    }

    private static long rwk(Long l) {
        block0: {
            int n = -943349883;
            n = Integer.rotateLeft(n * 661522569, 28) ^ 0x2E168BB3;
            Long l2 = l;
            n = (l2 != null ? System.identityHashCode(l2) : 0) ^ n;
            int n2 = n ^ 0x143C5F02;
            if ((n2 ^ n) == 339500802) break block0;
            int cfr_ignored_0 = (0xD3F9C087 ^ n) + -1991632059;
        }
        return l;
    }

    private static String[] thst_3(String string) {
        block0: {
            int n = -107662960;
            int n2 = (n = Integer.rotateLeft(n * -763310477, 26) ^ 0xE6BD5747) ^ 0xBE7A9872;
            if ((n2 ^ n) == -1099261838) break block0;
            int cfr_ignored_0 = (0x47EFA9E2 ^ n) - -1348932121;
        }
        return string.split("\b\u0017", -1);
    }

    private static CallSite dhjth(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1091236221;
            n3 = Integer.rotateLeft(n3 * -2089028315, 18) ^ 0x3180F9BF;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0x394DEA42;
            if ((n4 ^ n3) != 961407554) {
                int cfr_ignored_0 = (0x78471B3F ^ n3) + -1159462360;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhzb_2 ^ string.hashCode()) + (n2 + dth_2) + i ^ dhzb_2, 5) + dth_2);
            }
            String[] stringArray = tagh.thst_3(new String(cArray));
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

    private static String[] k612eke56ux(String string) {
        return string.split("\u0001\u001b", -1);
    }

    private static CallSite mzxr81he(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dt6z38heaqvy ^ string.hashCode() ^ n2 + kh24at4lheq + i * 114279255) + dt6z38heaqvy) ^ kh24at4lheq));
            }
            String[] stringArray = tagh.k612eke56ux(new String(cArray));
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

