/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_304
 *  net.minecraft.class_3675
 *  net.minecraft.class_3675$class_306
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1041;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import us.m0vy.moondlc.m0vyguard.bdkh_2;
import us.m0vy.moondlc.m0vyguard.tra_2;
import us.m0vy.moondlc.m0vyguard.hb;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dn_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class ns
implements dl {
    private static final List dkt;
    public static boolean shkha;
    private static final int jmdh = 1561597842;
    private static final int dhdh_5 = -1319870195;
    private static final int k912zot8tor = -368079285;
    private static final int wfmldu69 = 1355218247;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int qz0sqpc2bf;

    public static boolean stsh_4() {
        int n = -1291197326;
        int n2 = (n = Integer.rotateLeft(n * -731808417, 12) ^ 0x185AE2BA) ^ 0x4EE74DD;
        if ((n2 ^ n) != 82736349) {
            int cfr_ignored_0 = (0xB7E790AF ^ n) + 95871767;
        }
        return hb.tdm_2() != null && hb.tdm_2().rgha_2();
    }

    public static void dhbz(long l, long l2, Runnable runnable) {
        int n = bdkh_2.shfb(-1173582327);
        int n2 = (n = (int)l ^ n) ^ 0x5F67004D;
        if ((n2 ^ n) != 1600585805) {
            int cfr_ignored_0 = Integer.rotateLeft(0xE56B8E44 ^ n, 15) - -865871497;
        }
        long l3 = System.nanoTime();
        long l4 = l3 + l2 * (0x499E13183CF9E6F7L ^ 0x499E13183CF6A4B7L);
        long l5 = l3 + l * (0xF643FABA3FB9C2FEL ^ 0xF643FABA3FB680BEL);
        dkt.add(new dn_2(l4, l5, runnable));
        if (!shkha) {
            for (class_304 class_3042 : ns.shqd_2()) {
                class_3042.method_23481(false);
            }
            shkha = true;
        }
    }

    public static void taz(long l, Runnable runnable) {
        int n = -530979226;
        n = Integer.rotateLeft(n * 1112650691, 8) ^ 0x7845C52;
        int n2 = (n = Integer.rotateLeft((int)l ^ n, 23)) ^ 0x918FD015;
        if ((n2 ^ n) != -1852846059) {
            int cfr_ignored_0 = (0x71D63673 ^ n) - -586846774;
        }
        ns.thdh_7(l, 1L, runnable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void dds_4() {
        if (!shkha && dkt.isEmpty()) {
            return;
        }
        long l = System.nanoTime();
        ArrayList<dn_2> arrayList = null;
        for (dn_2 dn2 : dkt) {
            if (dn2.zzd_4 || l < dn2.zsh_2) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<dn_2>(4);
            }
            arrayList.add(dn2);
        }
        if (arrayList != null) {
            for (dn_2 dn2 : arrayList) {
                try {
                    if (dn2.rwdh == null) continue;
                    dn2.rwdh.run();
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                finally {
                    dn2.zzd_4 = true;
                }
            }
        }
        for (int i = dkt.size() - 1; i >= 0; --i) {
            dn_2 dn2;
            dn2 = (dn_2)dkt.get(i);
            if (!dn2.zzd_4 || l < dn2.skz) continue;
            dkt.remove(i);
        }
        if (dkt.isEmpty() && shkha) {
            ns.khnd_2();
        }
    }

    private static void khnd_2() {
        int n = bdkh_2.shfb(-77184145);
        int n2 = n ^ 0xB3B18517;
        if ((n2 ^ n) != -1280211689) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x48D7C678 ^ n, 12) + -696342589) * 1222100601;
        }
        if (!ns.sah_3()) {
            yf.athz_2();
            throw null;
        }
        if (ns.mc.field_1724 == null || ns.mc.field_1687 == null) {
            dkt.clear();
            shkha = false;
            return;
        }
        long l = ns.dkkh_2(mc.method_22683());
        for (class_304 class_3042 : tra_2.dzdh_3()) {
            ns.zzn_2(class_3042, class_3675.method_15987((long)l, (int)ns.zth_6(class_3042.method_1429())));
        }
        shkha = false;
    }

    private static class_304[] shqd_2() {
        block0: {
            int n = bdkh_2.shfb(365793897);
            int n2 = n ^ 0x6A0E420C;
            if ((n2 ^ n) == 1779319308) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7FC3D065 ^ n, 18) - 2098453366;
            int cfr_ignored_1 = (int)(0xBD717E5827D4EB4FL ^ (long)n ^ 0x1C0831A2DB8D733L);
        }
        return tra_2.dzdh_3();
    }

    private static void thdh_7(long l, long l2, Runnable runnable) {
        int n = bdkh_2.shfb(1009852414);
        n = (int)l ^ n;
        Runnable runnable2 = runnable;
        n = (runnable2 != null ? System.identityHashCode(runnable2) : 0) ^ n;
        int n2 = n ^ 0x5420BFF;
        if ((n2 ^ n) != 88214527) {
            int cfr_ignored_0 = Integer.rotateLeft(0x39731401 ^ n, 10) + -112391334;
            int cfr_ignored_1 = (int)(0xFBC1BA3C27D4EB4FL ^ (long)n ^ 0x8908831A2DB85A52L);
        }
        ns.dhbz(l, l2, runnable);
    }

    private static boolean sah_3() {
        block0: {
            int n = 866511390;
            int n2 = (n = Integer.rotateLeft(n * -1949564555, 10) ^ 0x9E6ABF0E) ^ 0x83C7CCB8;
            if ((n2 ^ n) == -2084057928) break block0;
            int cfr_ignored_0 = (0xB06226A6 ^ n) + -1012488824;
        }
        return yf.khdha_2();
    }

    private static long dkkh_2(class_1041 class_10412) {
        block0: {
            int n = -1363926623;
            n = Integer.rotateLeft(n * -1940276929, 8) ^ 0x4DE81DBC;
            class_1041 class_10413 = class_10412;
            n = (class_10413 != null ? System.identityHashCode(class_10413) : 0) ^ n;
            int n2 = n ^ 0x1365ED8E;
            if ((n2 ^ n) == 325447054) break block0;
            int cfr_ignored_0 = (0xBDD1CC2F ^ n) + -1503921259;
        }
        return class_10412.method_4490();
    }

    private static int zth_6(class_3675.class_306 class_3062) {
        block0: {
            int n = bdkh_2.shfb(2094198966);
            class_3675.class_306 class_3063 = class_3062;
            n = Integer.rotateRight((class_3063 != null ? System.identityHashCode(class_3063) : 0) ^ n, 24);
            int n2 = n ^ 0xFF2D4D39;
            if ((n2 ^ n) == -13808327) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x83FFBD8F ^ n, 3) - 5608332;
        }
        return class_3062.method_1444();
    }

    private static void zzn_2(class_304 class_3042, boolean bl) {
        int n = bdkh_2.shfb(2051032417);
        int n2 = (n = Integer.rotateLeft(bl ^ n, 11)) ^ 0x5D2F6686;
        if ((n2 ^ n) != 1563387526) {
            int cfr_ignored_0 = Integer.rotateRight(0x276F23E7 ^ n, 7) - -892143564;
        }
        class_3042.method_23481(bl);
    }

    private static String[] shhh_3(String string) {
        block0: {
            int n = 53739865;
            int n2 = (n = Integer.rotateLeft(n * 1615853821, 23) ^ 0x2FA0990F) ^ 0x64B4F01;
            if ((n2 ^ n) == 105598721) break block0;
            int cfr_ignored_0 = (0x57F4E58 ^ n) + -563811873;
        }
        return string.split("\u0005\u000e", -1);
    }

    private static CallSite sl_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -562774384;
            n3 = Integer.rotateLeft(n3 * -1265010993, 3) ^ 0x61A359B1;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 25);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x48F9213B;
            if ((n4 ^ n3) != 1224286523) {
                int cfr_ignored_0 = (0x968D9FAB ^ n3) + -706251582;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jmdh ^ string.hashCode()) + (n2 + dhdh_5) + i ^ jmdh, 8) + dhdh_5);
            }
            String[] stringArray = ns.shhh_3(new String(cArray));
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

    private static String[] i1ah3d3wn9h(String string) {
        return string.split("\u0001\u001d", -1);
    }

    private static CallSite mcepbc8k4qvbt(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ k912zot8tor ^ string.hashCode() ^ n2 + wfmldu69 ^ i * -1559465351 ^ k912zot8tor, 17) ^ wfmldu69));
            }
            String[] stringArray = ns.i1ah3d3wn9h(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

