/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1294
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1893
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_5321
 *  net.minecraft.class_638
 *  net.minecraft.class_6880
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_5321;
import net.minecraft.class_638;
import net.minecraft.class_6880;
import us.m0vy.moondlc.m0vyguard.bkh_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.fb;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bkhb
implements tthy {
    private static class_6880 hnk;
    private static final double tsz_3 = 0.08;
    private static final double shmh_2 = 0.98;
    private static final int at_3 = 676169740;
    private static final int dhfgh = 1749577480;
    private static final int thh_3 = 1572711454;
    private static final int dhtm_2 = -450225108;
    private static final int zd3v1wbf82mxk = -51099710;
    private static final int ykm19zb = -1706421072;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int g6tjp9xxev0a1;

    public static float sghd_3(class_1657 class_16572, int n) {
        float f;
        try {
            int n2 = -644075019;
            n2 = Integer.rotateLeft(n2 * -910484961, 19) ^ 0x94ECA72C;
            n2 = Integer.rotateLeft(n ^ n2, 25);
            int n3 = n2 ^ 0x40439F28;
            if ((n3 ^ n2) != 1078173480) {
                int cfr_ignored_0 = (0x99DFAEDD ^ n2) - 1123185905;
            }
            if ((0x241 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        class_243 class_2432 = class_16572.method_19538();
        class_243 class_2433 = class_16572.method_18798();
        class_238 class_2382 = bkhb.jtgh(class_16572).method_989(0.0, 0.0, 0.0);
        double d = 0.0;
        for (int i = 0; i < n; ++i) {
            class_2433 = bkhb.shzd_3(bkhb.zthm_2(class_2433, 0.0, Double.longBitsToDouble(0xC438C2CF733D000L ^ 0xB3F7F6CDB09DC47BL), 0.0), Double.longBitsToDouble(0x8BDFF33A282E8A8L ^ 0x3752A31B574067F4L), Double.longBitsToDouble(0x4DAEE4F75187C0A6L ^ 0x7241B8DFA4454FFAL), Double.longBitsToDouble(0xD972F3A13EF8DCE7L ^ 0xE69DAF89CB3A53BBL));
            class_2432 = bkhb.tyb(class_2432, class_2433);
            if (!bkhb.taw_3(bkhb.mc.field_1687, (class_2382 = class_2382.method_997(class_2433)).method_989(0.0, Double.longBitsToDouble(0xCC3F03397AFD6095L ^ 0x736F6174A80CC969L), 0.0))) break;
            if (!(class_2433.field_1351 < 0.0)) continue;
            d -= class_2433.field_1351;
        }
        if ((f = (float)d) <= Float.intBitsToFloat(Integer.rotateLeft(0x106A58EA ^ 0x10685AEA, 13))) {
            return 0.0f;
        }
        int n4 = class_3532.method_15375((float)(f - Float.intBitsToFloat(1796216553 + -718280425)));
        float f2 = n4;
        class_1799 class_17992 = class_16572.method_31548().method_7372(0);
        int n5 = bkhb.zzs(class_17992, class_1893.field_9129);
        if (n5 > 0) {
            f2 = Math.max(f2 - f2 * Float.intBitsToFloat(Integer.rotateLeft(0x78D5A98D ^ 0x67D96540, 1)) * (float)n5, 0.0f);
        }
        return class_16572.method_6059(class_1294.field_5906) ? 0.0f : f2;
    }

    @Generated
    private bkhb() {
        throw new UnsupportedOperationException("This is a ".concat("utility cla").concat("ss and cannot ").concat("be instantiated"));
    }

    private static String dhd_2(String string, int n, int n2, int n3) {
        int n4 = 1449609412;
        n4 = Integer.rotateLeft(n4 * -705891095, 16) ^ 0xF07F9994;
        int n5 = (n4 = n3 ^ n4) ^ 0x59DD8227;
        if ((n5 ^ n4) != 1507688999) {
            int cfr_ignored_0 = (0xFBACAE3 ^ n4) + -1286461793;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x289ADFCF) + at_3 ^ Integer.reverse(n2 + i * 136038207), 22) - dhfgh);
        }
        return new String(cArray);
    }

    private static class_238 jtgh(class_1657 class_16572) {
        block0: {
            int n = -245894285;
            int n2 = (n = Integer.rotateLeft(n * 647468981, 12) ^ 0xC9EA4EB7) ^ 0xB9814140;
            if ((n2 ^ n) == -1182711488) break block0;
            int cfr_ignored_0 = (0x48D6B233 ^ n) - -1905567570;
        }
        return class_16572.method_5829();
    }

    private static class_243 zthm_2(class_243 class_2432, double d, double d2, double d3) {
        block0: {
            int n = 1603099596;
            n = Integer.rotateLeft(n * 205210543, 15) ^ 0x75315ABF;
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0xB1F9632C;
            if ((n2 ^ n) == -1309056212) break block0;
            int cfr_ignored_0 = (0xEE7438E0 ^ n) - -346071428;
        }
        return class_2432.method_1031(d, d2, d3);
    }

    private static class_243 shzd_3(class_243 class_2432, double d, double d2, double d3) {
        block0: {
            int n = -1003411039;
            n = Integer.rotateLeft(n * -880346403, 27) ^ 0xA8F70F2E;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x21853A11;
            if ((n2 ^ n) == 562379281) break block0;
            int cfr_ignored_0 = (0xE5B413B0 ^ n) - 297197923;
        }
        return class_2432.method_18805(d, d2, d3);
    }

    private static class_243 tyb(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = fb.zkj_2(225782666);
            class_243 class_2434 = class_2432;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            class_243 class_2435 = class_2433;
            n = (class_2435 != null ? System.identityHashCode(class_2435) : 0) ^ n;
            int n2 = n ^ 0xB62A6C11;
            if ((n2 ^ n) == -1238733807) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xBB5F479B ^ n, 10) + -1259910400) * -1151383653;
        }
        return class_2432.method_1019(class_2433);
    }

    private static boolean taw_3(class_638 class_6382, class_238 class_2382) {
        block0: {
            int n = 1387310060;
            int n2 = (n = Integer.rotateLeft(n * 1621344809, 14) ^ 0x9BE74D2B) ^ 0x45D27137;
            if ((n2 ^ n) == 1171419447) break block0;
            int cfr_ignored_0 = (0x1762DADB ^ n) - -462226168;
        }
        return class_6382.method_18026(class_2382);
    }

    private static int zzs(class_1799 class_17992, class_5321 class_53212) {
        block0: {
            int n = 1012627697;
            n = Integer.rotateLeft(n * -1703992407, 7) ^ 0x44F5A2FB;
            class_5321 class_53213 = class_53212;
            n = (class_53213 != null ? System.identityHashCode(class_53213) : 0) ^ n;
            int n2 = n ^ 0xD8610DD4;
            if ((n2 ^ n) == -664728108) break block0;
            int cfr_ignored_0 = (0xE43A7525 ^ n) + -699020888;
        }
        return bkh_2.htd_2(class_17992, class_53212);
    }

    private static String[] aza_3(String string) {
        block0: {
            int n = 117532133;
            n = Integer.rotateLeft(n * 116080547, 5) ^ 0xBC9EE707;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x8BBB9FBD;
            if ((n2 ^ n) == -1950638147) break block0;
            int cfr_ignored_0 = (0x8CBAFA58 ^ n) + -1367765783;
        }
        return string.split("\u0007\u001b", -1);
    }

    private static CallSite ghkhs_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -80682627;
            n3 = Integer.rotateLeft(n3 * -213186961, 27) ^ 0x9A579A6F;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0xFB4AC242;
            if ((n4 ^ n3) != -78986686) {
                int cfr_ignored_0 = (0x7A233F ^ n3) - -475895902;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ thh_3 ^ string.hashCode() ^ n2 + dhtm_2 + i * -1011922853) + thh_3) ^ dhtm_2));
            }
            String[] stringArray = bkhb.aza_3(new String(cArray));
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

    private static String[] ncfml4aw1y(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite u35me2d5y0rn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zd3v1wbf82mxk ^ string.hashCode()) + (n2 + ykm19zb) + i ^ zd3v1wbf82mxk, 7) + ykm19zb);
            }
            String[] stringArray = bkhb.ncfml4aw1y(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
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

