/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1675
 *  net.minecraft.class_1922
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1675;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.hsh_6;

public class rj
implements dl {
    private static final int nl6lvl7gcy2h = -1734419758;
    private static final int l4tk8awr94ck = 1248417773;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int rym4eglg;

    private static boolean akhz(class_243 class_2432, class_243 class_2433, class_3965 class_39652) {
        int n = hsh_6.aws(-331277130);
        class_243 class_2434 = class_2433;
        n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
        class_3965 class_39653 = class_39652;
        n = (class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n;
        int n2 = n ^ 0x1A02FC13;
        if ((n2 ^ n) != 436403219) {
            int cfr_ignored_0 = Integer.rotateLeft(0xF643E0A5 ^ n, 17) - -694824138;
            int cfr_ignored_1 = (int)(0x34F14E9827D4EB4FL ^ (long)n ^ 0x6040831A2DB9C433L);
        }
        if (class_39652 == null || rj.khbm(class_39652) != class_239.class_240.field_1332) {
            return false;
        }
        if (rj.mc.field_1687 == null) {
            return false;
        }
        class_2680 class_26802 = rj.mc.field_1687.method_8320(class_39652.method_17777());
        if (class_26802 == null) {
            return false;
        }
        if (!rj.dwr_2(rj.shdhb(class_26802, (class_1922)rj.mc.field_1687, rj.bwa_2(class_39652)))) {
            class_243 class_2435 = rj.stn_2(class_39652);
            return class_2435.method_1025(class_2432) < class_2433.method_1025(class_2432);
        }
        return false;
    }

    public static class_3965 sml(taj taj2, double d, boolean bl, float f) {
        return rj.zthgh(d, bl, rj.mc.field_1724.method_5836(f), taj2.rrj(), rj.mc.field_1719);
    }

    public static class_3965 zthgh(double d, boolean bl, class_243 class_2432, class_243 class_2433, class_1297 class_12972) {
        class_243 class_2434 = class_2432.method_1031(class_2433.field_1352 * d, class_2433.field_1351 * d, class_2433.field_1350 * d);
        return rj.mc.field_1687.method_17742(new class_3959(class_2432, class_2434, class_3959.class_3960.field_17559, bl ? class_3959.class_242.field_1347 : class_3959.class_242.field_1348, class_12972));
    }

    public static class_3966 thrq(double d, taj taj2, boolean bl) {
        return rj.jd_2(d, taj2, bl, rj::sdhsh, 0.0f);
    }

    public static class_3966 khzk(double d, taj taj2, boolean bl, float f) {
        return rj.jd_2(d, taj2, bl, rj::khtz_2, f);
    }

    public static class_3966 jd_2(double d, taj taj2, boolean bl, Predicate predicate, float f) {
        class_3966 class_39662;
        class_1297 class_12972 = mc.method_1560();
        if (class_12972 == null) {
            return null;
        }
        class_243 class_2432 = class_12972.method_33571();
        class_243 class_2433 = taj2.rrj();
        class_243 class_2434 = class_2432.method_1031(class_2433.field_1352 * d, class_2433.field_1351 * d, class_2433.field_1350 * d);
        class_238 class_2383 = class_12972.method_5829().method_18804(class_2433.method_1021(d)).method_1009(1.0, 1.0, 1.0);
        class_3966 class_39663 = class_39662 = f <= 0.0f ? class_1675.method_18075((class_1297)class_12972, (class_243)class_2432, (class_243)class_2434, (class_238)class_2383, arg_0 -> rj.tthm(predicate, arg_0), (double)(d * d)) : rj.hkhgh(class_12972, class_2432, class_2434, class_2383, predicate, f, d * d);
        if (class_39662 == null) {
            return null;
        }
        if (bl) {
            return class_39662;
        }
        class_243 class_2435 = class_39662.method_17782().method_5829().method_992(class_2432, class_2434).orElse(class_39662.method_17782().method_19538());
        class_3965 class_39652 = rj.mc.field_1687 != null ? rj.mc.field_1687.method_17742(new class_3959(class_2432, class_2435, class_3959.class_3960.field_17558, class_3959.class_242.field_1347, (class_1297)rj.mc.field_1724)) : null;
        return rj.akhz(class_2432, class_2435, class_39652) ? null : class_39662;
    }

    private static class_3966 hkhgh(class_1297 class_12972, class_243 class_2432, class_243 class_2433, class_238 class_2383, Predicate predicate, float f, double d) {
        class_3966 class_39662 = null;
        double d2 = d;
        for (class_1297 class_12973 : rj.mc.field_1687.method_8333(class_12972, class_2383, arg_0 -> rj.dhdn_2(predicate, arg_0))) {
            class_243 class_2434;
            double d3;
            class_238 class_2384 = class_12973.method_5829().method_1014((double)(class_12973.method_5871() + f));
            if (class_2384.method_1006(class_2432)) {
                d3 = 0.0;
                class_2434 = class_2432;
            } else {
                Optional optional = class_2384.method_992(class_2432, class_2433);
                if (optional.isEmpty()) continue;
                class_2434 = (class_243)optional.get();
                d3 = class_2432.method_1025(class_2434);
            }
            if (!(d3 < d2)) continue;
            d2 = d3;
            class_39662 = new class_3966(class_12973, class_2434);
        }
        return class_39662;
    }

    private static boolean dhdn_2(Predicate predicate, class_1297 class_12972) {
        return class_12972.method_5863() && class_12972.method_5805() && !class_12972.method_7325() && predicate.test(class_12972);
    }

    private static boolean tthm(Predicate predicate, class_1297 class_12972) {
        return class_12972.method_5863() && class_12972.method_5805() && !class_12972.method_7325() && predicate.test(class_12972);
    }

    private static boolean khtz_2(class_1297 class_12972) {
        return true;
    }

    private static boolean sdhsh(class_1297 class_12972) {
        return true;
    }

    private static class_239.class_240 khbm(class_3965 class_39652) {
        block0: {
            int n = hsh_6.aws(-203849694);
            class_3965 class_39653 = class_39652;
            n = Integer.rotateLeft((class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n, 6);
            int n2 = n ^ 0x990ADB44;
            if ((n2 ^ n) == -1727341756) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6AD35B66 ^ n, 16) - -202002283;
        }
        return class_39652.method_17783();
    }

    private static class_2338 bwa_2(class_3965 class_39652) {
        block0: {
            int n = -1129802813;
            int n2 = (n = Integer.rotateLeft(n * 877708841, 3) ^ 0x67FE1024) ^ 0x749ED48F;
            if ((n2 ^ n) == 1956566159) break block0;
            int cfr_ignored_0 = (0xC836474C ^ n) + 1963500749;
        }
        return class_39652.method_17777();
    }

    private static class_265 shdhb(class_2680 class_26802, class_1922 class_19222, class_2338 class_23382) {
        block0: {
            int n = 1998812972;
            n = Integer.rotateLeft(n * -1759403249, 9) ^ 0x3DDA012;
            class_2680 class_26803 = class_26802;
            n = Integer.rotateRight((class_26803 != null ? System.identityHashCode(class_26803) : 0) ^ n, 18);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x5C92DDD0;
            if ((n2 ^ n) == 1553128912) break block0;
            int cfr_ignored_0 = (0x2BB1AAFC ^ n) - 384157509;
        }
        return class_26802.method_26220(class_19222, class_23382);
    }

    private static boolean dwr_2(class_265 class_2652) {
        block0: {
            int n = -2016892606;
            int n2 = (n = Integer.rotateLeft(n * -679548871, 18) ^ 0x2FAB693F) ^ 0xFC3FD6BB;
            if ((n2 ^ n) == -62925125) break block0;
            int cfr_ignored_0 = (0x7BF77FF9 ^ n) - -408222228;
        }
        return class_2652.method_1110();
    }

    private static class_243 stn_2(class_3965 class_39652) {
        block0: {
            int n = hsh_6.aws(91871278);
            class_3965 class_39653 = class_39652;
            n = (class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n;
            int n2 = n ^ 0x9DD2A626;
            if ((n2 ^ n) == -1647139290) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x98AB7E08 ^ n, 6) + -2128485837;
        }
        return class_39652.method_17784();
    }

    private static String[] hfedq8i5(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite v2v42d24s1xogr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ nl6lvl7gcy2h ^ string.hashCode()) + (n2 + l4tk8awr94ck) + i ^ nl6lvl7gcy2h, 18) + l4tk8awr94ck);
            }
            String[] stringArray = rj.hfedq8i5(new String(cArray));
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

