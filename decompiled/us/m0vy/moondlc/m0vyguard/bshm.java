/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2761
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_634
 *  net.minecraft.class_640
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.UUID;
import net.minecraft.class_2761;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_634;
import net.minecraft.class_640;
import us.m0vy.moondlc.m0vyguard.tan_2;
import us.m0vy.moondlc.m0vyguard.zth_3;
import us.m0vy.moondlc.m0vyguard.ghd_2;
import us.m0vy.moondlc.m0vyguard.lq;
import us.m0vy.moondlc.m0vyguard.yf;

public class bshm {
    private static final bshm INSTANCE;
    private static final int khjd = 20;
    private final ArrayDeque khma_2 = new ArrayDeque(Integer.reverse(-1785892967) ^ 0x99F6B1BD);
    private long ryt;
    private long dhwk = 0x129862BEA1180EBDL ^ 0x129862BEA1180D55L;
    private float rzk = Float.intBitsToFloat(1382890274 + -281885474);
    private static final int shdhs_2 = -1107396585;
    private static final int jab_2 = 121635267;
    private static final int ykcn72v41om0r = 1057488654;
    private static final int j8tcny6z9v06 = 720628991;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int de9w61b3yam2qu;

    private bshm() {
        zth_3.dzgh_3().jkhh_2(new lq(this::szt_6));
    }

    public static bshm ztr_4() {
        block0: {
            int n = 2092850558;
            int n2 = (n = Integer.rotateLeft(n * 755879285, 24) ^ 0x65F0F7F7) ^ 0x78E30140;
            if ((n2 ^ n) == 2028142912) break block0;
            int cfr_ignored_0 = (0x45D5C3E ^ n) - 1789608339;
        }
        return INSTANCE;
    }

    public float thaw() {
        try {
            int n = 1465167118;
            n = Integer.rotateLeft(n * 2107730989, 20) ^ 0x50CA9A13;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 28);
            int n2 = n ^ 0xC116F9C5;
            if ((n2 ^ n) != -1055458875) {
                int cfr_ignored_0 = (0x964254CB ^ n) - 323992473;
            }
            if ((0x320 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return bshm.tzj(class_3532.method_15363((float)this.rzk, (float)0.0f, (float)Float.intBitsToFloat(Integer.reverse(414268584) ^ 0x549C8D18)));
    }

    public float zns_4() {
        if (this.dhwk <= 0L) {
            return 1.0f;
        }
        return class_3532.method_15363((float)((float)this.dhwk / 1000.0f), (float)1.0f, (float)3.0f);
    }

    public int zqa_4(int n) {
        int n2;
        block1: {
            int n3 = 558580233;
            n3 = Integer.rotateLeft(n3 * 176669177, 5) ^ 0x2344F12D;
            n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 12);
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 10)) ^ 0xD7F90FC2;
            if ((n4 ^ n3) != -671543358) {
                int cfr_ignored_0 = (0xF6B24DCB ^ n3) - -626824473;
            }
            n2 = n <= 0 ? 0 : bshm.jbh(1, Math.round((float)n * this.zns_4()));
            if (yf.tdhth_2() != 0) break block1;
            n2 = n2 ^ 0x30FD;
        }
        return n2;
    }

    public long adt(long l) {
        int n = -184170387;
        n = Integer.rotateLeft(n * 1919704579, 23) ^ 0x3E67EE83;
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = (int)l ^ n) ^ 0x277C5424;
        if ((n2 ^ n) != 662459428) {
            int cfr_ignored_0 = (0xD2799C49 ^ n) + -1007253930;
        }
        return l <= 0L ? 0L : Math.max(1L, (long)bshm.khat_4((float)l * this.zns_4()));
    }

    public int dhks_2() {
        class_310 class_3102;
        try {
            int n = -316504245;
            n = Integer.rotateLeft(n * -1344653631, 23) ^ 0x9CF2D9C2;
            int n2 = n ^ 0xD9112E05;
            if ((n2 ^ n) != -653185531) {
                int cfr_ignored_0 = (0x3433A94E ^ n) - -1054724726;
            }
            if ((0x2E2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if ((class_3102 = bshm.ghtl_2()).method_1562() == null || class_3102.field_1724 == null) {
            return 0;
        }
        class_640 class_6402 = bshm.zaa_8(bshm.khhsh_2(class_3102), class_3102.field_1724.method_5667());
        return class_6402 == null ? 0 : bshm.zhd_4(class_6402);
    }

    public static float zsf_2(double d) {
        int n = 2123493963;
        int n2 = (n = Integer.rotateLeft(n * 1468864293, 17) ^ 0xAD12DEEF) ^ 0x9764FAEC;
        if ((n2 ^ n) != -1754989844) {
            int cfr_ignored_0 = (0xE9F508A7 ^ n) + 1815235451;
        }
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    private void szt_6(ghd_2 ghd2_2) {
        try {
            int n = 804448707;
            n = Integer.rotateLeft(n * -647334399, 23) ^ 0xC6812DC0;
            ghd_2 ghd3_2 = ghd2_2;
            n = Integer.rotateRight((ghd3_2 != null ? System.identityHashCode(ghd3_2) : 0) ^ n, 19);
            int n2 = n ^ 0xA7BED6AD;
            if ((n2 ^ n) != -1480665427) {
                int cfr_ignored_0 = (0x884C3F6E ^ n) + -649529704;
            }
            if ((0x253 & 0) != 0) {
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
        if (!ghd2_2.isReceive() || !(ghd2_2.packet() instanceof class_2761)) {
            return;
        }
        long l = System.currentTimeMillis();
        if (this.ryt != 0L) {
            long l2 = l - this.ryt;
            this.dhwk = Math.max(0x1C9D18DEB106A634L ^ 0x1C9D18DEB106A6CEL, Math.min(0xDE6695894CFA0231L ^ 0xDE6695894CFA2521L, l2));
            if (this.khma_2.size() >= 1910665149 + -1910665129) {
                this.khma_2.poll();
            }
            this.khma_2.add(Float.valueOf(Float.intBitsToFloat(-1902357516 - 1291604980) * (Float.intBitsToFloat(192699877 - -956146203) / (float)this.dhwk)));
            float f = 0.0f;
            for (Float f2 : this.khma_2) {
                f += class_3532.method_15363((float)f2.floatValue(), (float)0.0f, (float)Float.intBitsToFloat(-1786221133 + -1407741363));
            }
            if (!this.khma_2.isEmpty()) {
                this.rzk = f / (float)this.khma_2.size();
            }
        }
        this.ryt = l;
    }

    private static float tzj(double d) {
        block0: {
            int n = 700609145;
            n = Integer.rotateLeft(n * -1439189683, 25) ^ 0xD815AA15;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x99819019;
            if ((n2 ^ n) == -1719562215) break block0;
            int cfr_ignored_0 = (0xB043E260 ^ n) - 536720757;
        }
        return bshm.zsf_2(d);
    }

    private static int jbh(int n, int n2) {
        block0: {
            int n3 = 1645253767;
            n3 = Integer.rotateLeft(n3 * 1374938629, 6) ^ 0x2DB9134C;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 20)) ^ 0xF9BABA10;
            if ((n4 ^ n3) == -105203184) break block0;
            int cfr_ignored_0 = (0x9BAA2E97 ^ n3) - -1499305997;
        }
        return Math.max(n, n2);
    }

    private static int khat_4(float f) {
        block0: {
            int n = -679605394;
            int n2 = (n = Integer.rotateLeft(n * -1120358297, 4) ^ 0x4164DF87) ^ 0x5F8C0EE0;
            if ((n2 ^ n) == 1603014368) break block0;
            int cfr_ignored_0 = (0x88F2058E ^ n) + -870087359;
        }
        return Math.round(f);
    }

    private static class_310 ghtl_2() {
        block0: {
            int n = 71417949;
            int n2 = (n = Integer.rotateLeft(n * -531318425, 19) ^ 0x20B28CCF) ^ 0x54DFF178;
            if ((n2 ^ n) == 1423962488) break block0;
            int cfr_ignored_0 = (0x509E3125 ^ n) - -656408657;
        }
        return class_310.method_1551();
    }

    private static class_634 khhsh_2(class_310 class_3102) {
        block0: {
            int n = -1985442240;
            int n2 = (n = Integer.rotateLeft(n * -741509519, 28) ^ 0x4808E7B2) ^ 0xFD316D40;
            if ((n2 ^ n) == -47092416) break block0;
            int cfr_ignored_0 = (0x7499E300 ^ n) + -1679414237;
        }
        return class_3102.method_1562();
    }

    private static class_640 zaa_8(class_634 class_6342, UUID uUID) {
        block0: {
            int n = tan_2.saw_3(-399493393);
            class_634 class_6343 = class_6342;
            n = (class_6343 != null ? System.identityHashCode(class_6343) : 0) ^ n;
            UUID uUID2 = uUID;
            n = Integer.rotateRight((uUID2 != null ? System.identityHashCode(uUID2) : 0) ^ n, 25);
            int n2 = n ^ 0xDF1E193D;
            if ((n2 ^ n) == -551675587) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x372E2FD2 ^ n, 9) + -1292539479) * 925773779;
        }
        return class_6342.method_2871(uUID);
    }

    private static int zhd_4(class_640 class_6402) {
        block0: {
            int n = -1991935690;
            n = Integer.rotateLeft(n * 1474661541, 5) ^ 0xDE01B207;
            class_640 class_6403 = class_6402;
            n = (class_6403 != null ? System.identityHashCode(class_6403) : 0) ^ n;
            int n2 = n ^ 0x6D78FCC8;
            if ((n2 ^ n) == 1836645576) break block0;
            int cfr_ignored_0 = (0xE43D85FE ^ n) - 1427374775;
        }
        return class_6402.method_2959();
    }

    private static String[] zaa_3(String string) {
        block0: {
            int n = tan_2.saw_3(1459742736);
            int n2 = n ^ 0x9B0960E8;
            if ((n2 ^ n) == -1693884184) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCC0888F8 ^ n, 12) + -1184484029) * -871855879;
        }
        return string.split("\u0004\u0019", -1);
    }

    private static CallSite tny_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -222189168;
            n3 = Integer.rotateLeft(n3 * -1862849799, 28) ^ 0x207675C5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 4);
            int n4 = n3 ^ 0x8BFCC8D4;
            if ((n4 ^ n3) != -1946367788) {
                int cfr_ignored_0 = (0x793D6144 ^ n3) - -562768896;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ shdhs_2 ^ string.hashCode() ^ n2 + jab_2 ^ i * 1700314087 ^ shdhs_2, 21) ^ jab_2));
            }
            String[] stringArray = bshm.zaa_3(new String(cArray));
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

    private static String[] m49xduwiri3a(String string) {
        return string.split("\u0002\u0018", -1);
    }

    private static CallSite plcb5jt2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ykcn72v41om0r ^ string.hashCode() ^ n2 + j8tcny6z9v06 ^ i * -749279983 ^ ykcn72v41om0r, 18) ^ j8tcny6z9v06));
            }
            String[] stringArray = bshm.m49xduwiri3a(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

