/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10042
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.class_10042;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bwa_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ns_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Hit Color", category=bzw.OTHER, desc="Changes the hurt color overlay when entities are hit")
public class st_2
extends bnq {
    private static st_2 jss_4;
    private final bzw_2 dhz_2 = new bzw_2(this, "Color").dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0x5EE90CE2 ^ 0x5E6FF2E2, 7)), Float.intBitsToFloat(0x40A4F7FD ^ 0x228F7FD), Float.intBitsToFloat(-617905477 - -1734376773), Float.intBitsToFloat(-725954306 + 1858350850)));
    private final tay dhtdh_2 = new tay(this, "Alpha").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(1168486325) ^ 0xEE8AA5A2)).rkh_3(Float.intBitsToFloat(-1897806872 - 1312932840)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x2A39D942 ^ 0xA39D120, 19)));
    private final tay dkd = new tay(this, "Length").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-1385301522 + -1803418094)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x285847E1 ^ 0x28480FE1, 10)));
    private final tay jbt_2 = new tay(this, "Fade").shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-1448463660) ^ 0x16009958)).ssd_5(Float.intBitsToFloat(0x7D9CBCCA ^ 0x42C52550));
    private final tay stsh_3 = new tay(this, "Brightness").shth_7(Float.intBitsToFloat(0x50DF56B5 ^ 0x6E5F56B5)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(1285648566) ^ 0x504249FF)).ssd_5(1.0f);
    private final badh_2 khs_2 = new badh_2(this, "Pulse").bts(false);
    private final tay ddt = new tay((hy)this, "Pulse Speed", this.khs_2::shzl).shth_7(Float.intBitsToFloat(10583256 + 1034637301)).dhbs_2(Float.intBitsToFloat(0xE69C01F ^ 0x4EE9C01F)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x93A026F3 ^ 0xF5C9C895, 13))).ssd_5(1.0f);
    private final Map saz_5 = new WeakHashMap();
    private final Map thdt_3 = new HashMap();
    private static final int rwf = -732089331;
    private static final int rdth = 524747992;
    private static final int rta_4 = 1077777509;
    private static final int zzt_2 = -1121972541;
    private static final int y5eu33e = -1786144870;
    private static final int rysstkb4ncuu = -50735323;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int up7aqvln0;

    public static st_2 dqh_4() {
        block0: {
            int n = ns_2.thmm(1057981304);
            int n2 = n ^ 0x695F0211;
            if ((n2 ^ n) == 1767834129) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x56508169 ^ n, 13) + 2015185650;
            int cfr_ignored_1 = (int)(0x94E22F5427D4EB4FL ^ (long)n ^ 0xA3D8831A2DB88415L);
        }
        return jss_4;
    }

    public st_2() {
        jss_4 = this;
    }

    @Override
    public void nc() {
        int n = ns_2.thmm(-51528312);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x6156FF38;
        if ((n2 ^ n) != 1633091384) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x9DBB42B0 ^ n, 6) + 504017547) * -1648672079;
        }
        this.saz_5.clear();
        this.thdt_3.clear();
    }

    public void dhgh(class_1309 class_13092, class_10042 class_100422) {
        if (class_13092 == null || class_100422 == null) {
            return;
        }
        int n = class_13092.method_5628();
        this.saz_5.put(class_100422, n);
        bwa_2 bwa2 = (bwa_2)this.thdt_3.get(n);
        long l = System.currentTimeMillis();
        if (class_13092.field_6235 > 0) {
            boolean bl = bwa2 == null || class_13092.field_6235 > bwa2.bah || l - bwa2.jbsh > this.znk_2();
            long l2 = bl ? l : bwa2.jbsh;
            this.thdt_3.put(n, new bwa_2(class_13092.field_6235, l2, l));
            return;
        }
        if (bwa2 != null && l - bwa2.jbsh > this.znk_2()) {
            this.thdt_3.remove(n);
        }
    }

    public boolean zthd_2(class_10042 class_100422, int n) {
        int n2 = -2123905569;
        n2 = Integer.rotateLeft(n2 * -1355002163, 21) ^ 0x3B2AA87A;
        int n3 = (n2 = Integer.rotateRight(n ^ n2, 21)) ^ 0x2966A44B;
        if ((n3 ^ n2) != 694592587) {
            int cfr_ignored_0 = (0xA8016194 ^ n2) - -180911649;
        }
        return st_2.hzgh(this, class_100422) > 0.0f;
    }

    public int aan_2(class_10042 class_100422, int n) {
        int n2 = ns_2.thmm(1934229175);
        class_10042 class_100423 = class_100422;
        n2 = (class_100423 != null ? System.identityHashCode(class_100423) : 0) ^ n2;
        int n3 = n2 ^ 0x6D05F6FD;
        if ((n3 ^ n2) != 1829107453) {
            int cfr_ignored_0 = Integer.rotateRight(0x1E4C084A ^ n2, 6) + -1349345231;
        }
        float f = this.zdgh_2(class_100422);
        byq byq2 = this.dhz_2.sdsh_4();
        float f2 = 1.0f - this.jbt_2.thw_5() + this.jbt_2.thw_5() * f;
        if (st_2.rdy(this.khs_2)) {
            float f3 = (float)(Math.sin((double)System.nanoTime() / st_2.bhdh_2(0x6FEBDDB1DB9A5EDDL ^ 0x2E2610D4DB9A5EDDL) * (double)st_2.dsd(this.ddt) * Double.longBitsToDouble(0xC4BB6B5A35F04429L ^ 0x84B24AA161B46931L) * Double.longBitsToDouble(0x5DEA6FD1AB215D91L ^ 0x1DEA6FD1AB215D91L)) * Double.longBitsToDouble(0x5AA3E059ACC4DC73L ^ 0x6543E059ACC4DC73L) + Double.longBitsToDouble(0xDEB1BA99CD658FD4L ^ 0xE151BA99CD658FD4L));
            f2 *= Float.intBitsToFloat(Integer.rotateLeft(0xF99DC7E ^ 0xFC1CC2BD, 28)) + f3 * Float.intBitsToFloat(st_2.tmb_2(1364280496) ^ 0x33ADD6A3);
        }
        int n4 = class_3532.method_15340((int)Math.round(this.dhtdh_2.thw_5() * f2), (int)0, (int)Integer.rotateLeft(0xCFE84A31 ^ 0xCFE9B431, 23));
        float f4 = st_2.bwd(this.stsh_3);
        int n5 = st_2.zht_4(Math.round(byq2.sbk() * f4), 0, st_2.tds_7(0x5E4CC3D3 ^ 0x21CCC3D3, 9));
        int n6 = class_3532.method_15340((int)Math.round(byq2.srl() * f4), (int)0, (int)(1436931763 + -1436931508));
        int n7 = class_3532.method_15340((int)Math.round(byq2.shsl_2() * f4), (int)0, (int)(1072737785 + -1072737530));
        return n4 << -1332841182 + 1332841206 | n5 << (0x6F420E9E ^ 0x6F420E8E) | n6 << Integer.rotateLeft(0x196626CF ^ 0x196626CE, 3) | n7;
    }

    private float zdgh_2(class_10042 class_100422) {
        long l;
        bwa_2 bwa2;
        int n = 1316058349;
        n = Integer.rotateLeft(n * 788904777, 21) ^ 0x9A78C109;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0x4BB79E56;
        if ((n2 ^ n) != 1270324822) {
            int cfr_ignored_0 = (0x5C6EABB ^ n) + 2047658764;
        }
        if (yf.dnkh()) {
            throw null;
        }
        Integer n3 = class_100422 == null ? null : (Integer)this.saz_5.get(class_100422);
        bwa_2 bwa3 = bwa2 = n3 == null ? null : (bwa_2)this.thdt_3.get(n3);
        if (bwa2 == null) {
            return 0.0f;
        }
        long l2 = System.currentTimeMillis() - bwa2.jbsh;
        if (l2 >= (l = this.znk_2())) {
            this.thdt_3.remove(n3);
            return 0.0f;
        }
        return class_3532.method_15363((float)(1.0f - (float)l2 / (float)l), (float)0.0f, (float)1.0f);
    }

    private long znk_2() {
        try {
            int n = -366324782;
            n = Integer.rotateLeft(n * 1760230759, 24) ^ 0x611271B4;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x8E1B22D8;
            if ((n2 ^ n) != -1910824232) {
                int cfr_ignored_0 = (0x6431710A ^ n) - -951178494;
            }
            if ((0x320 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!st_2.khha_3()) {
            st_2.sths_4();
        }
        return Math.max(0xE2E79BFC13288279L ^ 0xE2E79BFC1328824BL, (long)Math.round(st_2.aghj(this.dkd) * Float.intBitsToFloat(Integer.reverse(-1733286186) ^ 0x292C0D19)));
    }

    private static String dhfh(String string, int n, int n2, int n3) {
        try {
            int n4 = -763551491;
            n4 = Integer.rotateLeft(n4 * 120109527, 8) ^ 0xAF8666D2;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateRight(n ^ n4, 21);
            int n5 = n4 ^ 0x4BBD2FF4;
            if ((n5 ^ n4) != 1270689780) {
                int cfr_ignored_0 = (0x99C00F09 ^ n4) - -1336301871;
            }
            if ((0x151 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x8226D370 ^ n2 - i) + rdth, 15) ^ rwf + i * -879121059));
        }
        return new String(cArray);
    }

    private static float hzgh(st_2 st2, class_10042 class_100422) {
        block0: {
            int n = -1764035819;
            n = Integer.rotateLeft(n * 1466937457, 13) ^ 0x1184E25E;
            class_10042 class_100423 = class_100422;
            n = Integer.rotateRight((class_100423 != null ? System.identityHashCode(class_100423) : 0) ^ n, 17);
            int n2 = n ^ 0x7135F6AD;
            if ((n2 ^ n) == 1899361965) break block0;
            int cfr_ignored_0 = (0xE7EF05B8 ^ n) + 1702222789;
        }
        return st2.zdgh_2(class_100422);
    }

    private static boolean rdy(badh_2 badh2) {
        block0: {
            int n = ns_2.thmm(1759828228);
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xB15FDA4C;
            if ((n2 ^ n) == -1319118260) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD9BB0348 ^ n, 14) + 1644365043;
        }
        return badh2.shzl();
    }

    private static double bhdh_2(long l) {
        block0: {
            int n = -951709126;
            int n2 = (n = Integer.rotateLeft(n * 2011000439, 16) ^ 0x56925E3E) ^ 0x3C5181BD;
            if ((n2 ^ n) == 1011974589) break block0;
            int cfr_ignored_0 = (0xFB179387 ^ n) + -1153805202;
        }
        return Double.longBitsToDouble(l);
    }

    private static float dsd(tay tay2) {
        block0: {
            int n = ns_2.thmm(47460057);
            int n2 = n ^ 0x464ACE65;
            if ((n2 ^ n) == 1179307621) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x449EE0BC ^ n, 11) - 1402656255) * 1151262909;
        }
        return tay2.thw_5();
    }

    private static int tmb_2(int n) {
        block0: {
            int n2 = ns_2.thmm(-535243939);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 27)) ^ 0xB1B5CD52;
            if ((n3 ^ n2) == -1313485486) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x51AD1E0F ^ n2, 13) - -397130996;
        }
        return Integer.reverse(n);
    }

    private static float bwd(tay tay2) {
        block0: {
            int n = 1580163250;
            n = Integer.rotateLeft(n * 1908853567, 25) ^ 0xFFD148C1;
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 20);
            int n2 = n ^ 0x7BB117D5;
            if ((n2 ^ n) == 2075203541) break block0;
            int cfr_ignored_0 = (0x259E7767 ^ n) + -1834241107;
        }
        return tay2.thw_5();
    }

    private static int tds_7(int n, int n2) {
        block0: {
            int n3 = ns_2.thmm(452252932);
            int n4 = n3 ^ 0x2F0DC103;
            if ((n4 ^ n3) == 789430531) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x35F91407 ^ n3, 9) - -1920529388;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int zht_4(int n, int n2, int n3) {
        block0: {
            int n4 = -42347382;
            n4 = Integer.rotateLeft(n4 * 217193869, 8) ^ 0xD534867A;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 23)) ^ 0xB818EE45;
            if ((n5 ^ n4) == -1206325691) break block0;
            int cfr_ignored_0 = (0x45613ACF ^ n4) + 564792802;
        }
        return class_3532.method_15340((int)n, (int)n2, (int)n3);
    }

    private static boolean khha_3() {
        block0: {
            int n = -466631894;
            int n2 = (n = Integer.rotateLeft(n * -882197537, 4) ^ 0x3DCCCF75) ^ 0xA5284AB3;
            if ((n2 ^ n) == -1524086093) break block0;
            int cfr_ignored_0 = (0x41078999 ^ n) + -425984785;
        }
        return yf.khdha_2();
    }

    private static void sths_4() {
        int n = -1128899996;
        int n2 = (n = Integer.rotateLeft(n * 1846281507, 16) ^ 0x70D6147F) ^ 0x48D81DB7;
        if ((n2 ^ n) != 1222122935) {
            int cfr_ignored_0 = (0xF46E47D3 ^ n) + 659239618;
        }
        yf.athz_2();
    }

    private static float aghj(tay tay2) {
        block0: {
            int n = ns_2.thmm(1516364995);
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 8);
            int n2 = n ^ 0x5A18E6C9;
            if ((n2 ^ n) == 1511581385) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x79020A ^ n, 3) + 319086193;
        }
        return tay2.thw_5();
    }

    private static String[] jmh(String string) {
        int n = ns_2.thmm(-845646004);
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 21);
        int n2 = n ^ 0x52BBA29A;
        if ((n2 ^ n) != 1388028570) {
            int cfr_ignored_0 = (Integer.rotateRight(0x9F23D5D6 ^ n, 6) - 1236567077) * -1625041449;
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

    private static CallSite khdk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1681775049;
            n3 = Integer.rotateLeft(n3 * -1447307681, 21) ^ 0x3A21C93E;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 24);
            int n4 = n3 ^ 0xF32B59E6;
            if ((n4 ^ n3) != -215262746) {
                int cfr_ignored_0 = (0x9716802F ^ n3) + 1294319748;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ rta_4 ^ string.hashCode() ^ n2 + zzt_2 + i * 892219743) + rta_4) ^ zzt_2));
            }
            String[] stringArray = st_2.jmh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] lkcx0r6175h19m(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite o6216p7tjl63(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ y5eu33e ^ string.hashCode()) + (n2 + rysstkb4ncuu) + i ^ y5eu33e, 15) + rysstkb4ncuu);
            }
            String[] stringArray = st_2.lkcx0r6175h19m(new String(cArray));
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

