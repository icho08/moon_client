/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthf;
import us.m0vy.moondlc.m0vyguard.bzs;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.baf_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="NoWeb", category=bzw.OTHER, desc="Tweaks or bypasses cobweb slowdown")
public class bqth
extends bnq {
    private final khd sghz_2 = new khd(this, "Mode");
    private final fy jbl = new fy(this.sghz_2, "Grim");
    private final fy dhdz_3 = new fy(this.sghz_2, "Ignore Web");
    private final tay zmz = new tay((hy)this, "Web Speed", this::khln).shth_7(Float.intBitsToFloat(Integer.reverse(-947287948) ^ 0x13DD5D2E)).dhbs_2(Float.intBitsToFloat(-295074590 + 1362105528)).rkh_3(Float.intBitsToFloat(Integer.reverse(737125229) ^ 0x8AE620DE)).ssd_5(Float.intBitsToFloat(1971397004 + -926176447));
    private final badh_2 hhn_2 = new badh_2(this, "No Break").bts(false);
    private static bqth shtz_4;
    private final bql<btt> ttz_3 = this::ththa_2;
    private static final int hqq = -2117551641;
    private static final int bh_2 = 23763665;
    private static final int shkha_2 = -1837433745;
    private static final int zyh_2 = -972029675;
    private static final int wqusv4a = 612791434;
    private static final int kevfpy8uf = -366306794;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int v54ajzb4gqq;

    public static bqth twkh() {
        block0: {
            int n = -1439725296;
            int n2 = (n = Integer.rotateLeft(n * -950219073, 28) ^ 0x37C5EBEB) ^ 0x327379B;
            if ((n2 ^ n) == 52901787) break block0;
            int cfr_ignored_0 = (0xA908BE8B ^ n) + 2143563212;
        }
        return shtz_4;
    }

    public bqth() {
        shtz_4 = this;
    }

    public boolean dmz_4() {
        block0: {
            int n = baf_2.sdh_4(1448516479);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
            int n2 = n ^ 0xB4C08638;
            if ((n2 ^ n) == -1262451144) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE2961D47 ^ n, 15) - 1955277524;
        }
        return this.hhn_2.shzl();
    }

    public boolean ghbk() {
        block0: {
            int n = 1624614561;
            int n2 = (n = Integer.rotateLeft(n * 605460303, 20) ^ 0xCF7D39AD) ^ 0x1B252E28;
            if ((n2 ^ n) == 455421480) break block0;
            int cfr_ignored_0 = (0x7BF08889 ^ n) - 703991150;
        }
        return bqth.thzs_2(this.dhdz_3);
    }

    private void ththa_2(btt btt2) {
        try {
            int n = -998295412;
            n = Integer.rotateLeft(n * -739013669, 23) ^ 0xFE691FFE;
            int n2 = n ^ 0x5E8A5B92;
            if ((n2 ^ n) != 1586125714) {
                int cfr_ignored_0 = (0x9AF5631E ^ n) - -1866810986;
            }
            if ((0x34F & 0) != 0) {
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
        if (bqth.mc.field_1724 == null || !bzs.shsa_3() || this.ghbk()) {
            return;
        }
        double d = this.zmz.thw_5();
        double d2 = Math.max(Double.longBitsToDouble(0xBCA05B257592603DL ^ 0x836751180531B737L), Math.min(Double.longBitsToDouble(0xC20FBA1B2D16CB41L ^ 0xFDFDDC7D4B70AD27L), d * Double.longBitsToDouble(0x3C6FC3B8DFDBB202L ^ 0x7C61A5DEB9BDD464L)));
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        if (bthf.dhst_2()) {
            double[] dArray = bthf.tshd(d);
            d3 = dArray[0];
            d4 = dArray[1];
        }
        if (bqth.mc.field_1690.field_1903.method_1434()) {
            d5 = d2;
        } else if (bqth.mc.field_1690.field_1832.method_1434()) {
            d5 = -d2;
        }
        bqth.mc.field_1724.method_18800(d3, d5, d4);
    }

    private boolean khln() {
        int n;
        block1: {
            int n2 = baf_2.sdh_4(1604467101);
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x91151AE0;
            if ((n3 ^ n2) != -1860887840) {
                int cfr_ignored_0 = (Integer.rotateLeft(0xCEB7237D ^ n2, 12) - 210430814) * -826858627;
                int cfr_ignored_1 = (int)(0xC058D4027D4EB4FL ^ (long)n2 ^ 0xE7F0831A2DB9B5DAL);
            }
            n = !this.jbl.shghkh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xDD05;
        }
        return n != 0;
    }

    private static String shghs(String string, int n, int n2, int n3) {
        int n4 = -267948102;
        n4 = Integer.rotateLeft(n4 * -153911721, 8) ^ 0x43945192;
        int n5 = (n4 = n ^ n4) ^ 0x37216D56;
        if ((n5 ^ n4) != 924937558) {
            int cfr_ignored_0 = (0xC72602EC ^ n4) + -370440258;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x9698BA59) + i ^ hqq, 19) ^ n2 + bh_2));
        }
        return new String(cArray);
    }

    private static boolean thzs_2(fy fy2) {
        block0: {
            int n = 1902469905;
            n = Integer.rotateLeft(n * 219823311, 6) ^ 0xDE9B7610;
            fy fy3 = fy2;
            n = Integer.rotateRight((fy3 != null ? System.identityHashCode(fy3) : 0) ^ n, 23);
            int n2 = n ^ 0x7A174DC3;
            if ((n2 ^ n) == 2048347587) break block0;
            int cfr_ignored_0 = (0xB722ED2 ^ n) - 1719003963;
        }
        return fy2.shghkh();
    }

    private static String[] ht_3(String string) {
        block0: {
            int n = -790013924;
            int n2 = (n = Integer.rotateLeft(n * -125686415, 18) ^ 0x4DE5ECF2) ^ 0x255FC99C;
            if ((n2 ^ n) == 627034524) break block0;
            int cfr_ignored_0 = (0xF5B69180 ^ n) - 1351255168;
        }
        return string.split("\u0006\u000e", -1);
    }

    private static CallSite zds_5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1595176332;
            n3 = Integer.rotateLeft(n3 * 1015915365, 11) ^ 0xBC8180F6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xA66AC095;
            if ((n4 ^ n3) != -1502953323) {
                int cfr_ignored_0 = (0xF97EB519 ^ n3) - -893804743;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ shkha_2 ^ string.hashCode() ^ n2 + zyh_2 ^ i * -2014710281 ^ shkha_2, 10) ^ zyh_2));
            }
            String[] stringArray = bqth.ht_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ih2o647fk(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite onl5wzxyxmrnn0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wqusv4a ^ string.hashCode() ^ n2 + kevfpy8uf + i * 1425176185) + wqusv4a) ^ kevfpy8uf));
            }
            String[] stringArray = bqth.ih2o647fk(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

