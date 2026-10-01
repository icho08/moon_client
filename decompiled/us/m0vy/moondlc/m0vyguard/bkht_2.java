/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.ss_4;

public class bkht_2 {
    private final class_746 jmj;
    private double lq;
    private double khaq_2;
    private double hat_3;
    private double jrkh;
    private double dhghh_2;
    private double rshth;
    private final float dhjl;
    private int tzs_2;
    private static final int ttdh_2 = 1650203678;
    private static final int dthth = 1477538263;
    private static final int sny2904likp = 987308509;
    private static final int y4czh2vjfw5n = 636401371;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ckb3bj9xnypv0r;

    public bkht_2(class_746 class_7462, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        this.jmj = class_7462;
        this.lq = d;
        this.khaq_2 = d2;
        this.hat_3 = d3;
        this.jrkh = d4;
        this.dhghh_2 = d5;
        this.rshth = d6;
        this.dhjl = f;
        this.tzs_2 = 0;
    }

    public static bkht_2 drf_2(class_746 class_7462) {
        int n = ss_4.thq_4(-2082088257);
        class_746 class_7463 = class_7462;
        n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 10);
        int n2 = n ^ 0xC9445C3E;
        if ((n2 ^ n) != -918266818) {
            int cfr_ignored_0 = Integer.rotateLeft(0x4AA18681 ^ n, 12) + 233629914;
            int cfr_ignored_1 = (int)(0x881328BC27D4EB4FL ^ (long)n ^ 0xAC08831A2DB8BDF7L);
        }
        return new bkht_2(class_7462, class_7462.method_19538().method_10216(), bkht_2.bhh_4(class_7462.method_19538()), bkht_2.khghr(bkht_2.shssh_2(class_7462)), class_7462.method_18798().field_1352, bkht_2.khbt((class_746)class_7462).field_1351, class_7462.method_18798().field_1350, class_7462.method_36454());
    }

    public boolean dshl_2(float f) {
        int n = ss_4.thq_4(-1913620787);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x54928D79;
        if ((n2 ^ n) != 1418890617) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xD962FBB4 ^ n, 14) - 1465522695) * -647824459;
        }
        class_243 class_2432 = this.jmj.method_5828(0.0f);
        double d = this.jrkh;
        double d2 = this.dhghh_2;
        double d3 = this.rshth;
        double d4 = bkht_2.mh_2(0xCE67D610587FA110L ^ 0xF1D3ACF11FD1B56BL);
        float f2 = bkht_2.dzh_2(this.jmj.method_36455() * Float.intBitsToFloat(Integer.rotateLeft(0x6D13A87E ^ 0x82B0FBB6, 20)));
        f2 = (float)((double)(f2 * f2) * bkht_2.zzj_3(class_2432.method_1033() / Double.longBitsToDouble(0xBA6522BE7A7CC9CBL ^ 0x85BCBB27E3E55051L), 1.0));
        class_243 class_2433 = bkht_2.jrh(new class_243(d, d2, d3), 0.0, d4 * (Double.longBitsToDouble(0xCED211116432A343L ^ 0x712211116432A343L) + (double)f2 * Double.longBitsToDouble(0x2DACA5B4B28991A3L ^ 0x1244A5B4B28991A3L)), 0.0);
        d2 = class_2433.field_1351 * Double.longBitsToDouble(0xA5C42EF94067BF6FL ^ 0x9A2B72D04067BF6FL);
        return d2 < (double)f;
    }

    public boolean shfh(float f, int n) {
        int n2 = -1356281843;
        n2 = Integer.rotateLeft(n2 * 1144013507, 20) ^ 0x68CC820C;
        int n3 = (n2 = n ^ n2) ^ 0x819FCE04;
        if ((n3 ^ n2) != -2120233468) {
            int cfr_ignored_0 = (0x2EB70609 ^ n2) - -1309039849;
        }
        class_243 class_2432 = this.jmj.method_5828(0.0f);
        double d = this.jrkh;
        double d2 = this.dhghh_2;
        double d3 = this.rshth;
        double d4 = Double.longBitsToDouble(0xA2C8F0B3F9EC9849L ^ 0x9D7C8A52BE428C32L);
        float f2 = class_3532.method_15362((float)(bkht_2.zty(this.jmj) * bkht_2.srr_2(Integer.rotateLeft(0x81A44F43 ^ 0x739FA797, 30))));
        f2 = (float)((double)(f2 * f2) * Math.min(class_2432.method_1033() / Double.longBitsToDouble(0xAD5A6FA96A121E2FL ^ 0x9283F630F38B87B5L), 1.0));
        for (int i = 0; i < n; ++i) {
            class_243 class_2433 = new class_243(d, d2, d3).method_1031(0.0, d4 * (Double.longBitsToDouble(0x82990D2DC383ED04L ^ 0x3D690D2DC383ED04L) + (double)f2 * bkht_2.dhs_8(0xFF1D11658F29BE49L ^ 0xC0F511658F29BE49L)), 0.0);
            d2 = class_2433.field_1351 * Double.longBitsToDouble(0xFB5085F491BF01E7L ^ 0xC4BFD9DD91BF01E7L);
            if (!(d2 >= (double)f)) continue;
            return false;
        }
        return true;
    }

    private static double bhh_4(class_243 class_2432) {
        block0: {
            int n = 918548841;
            n = Integer.rotateLeft(n * -1240327389, 4) ^ 0xC643F91B;
            class_243 class_2433 = class_2432;
            n = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 12);
            int n2 = n ^ 0x6D24440B;
            if ((n2 ^ n) == 1831093259) break block0;
            int cfr_ignored_0 = (0x5B9BB562 ^ n) - 3482332;
        }
        return class_2432.method_10214();
    }

    private static class_243 shssh_2(class_746 class_7462) {
        block0: {
            int n = 319023943;
            n = Integer.rotateLeft(n * 1441288689, 3) ^ 0x4F25FD40;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 12);
            int n2 = n ^ 0xE4E9AD1D;
            if ((n2 ^ n) == -454447843) break block0;
            int cfr_ignored_0 = (0xF7EA465A ^ n) - 1535565845;
        }
        return class_7462.method_19538();
    }

    private static double khghr(class_243 class_2432) {
        block0: {
            int n = 2111656855;
            int n2 = (n = Integer.rotateLeft(n * 91542773, 8) ^ 0x24D0A428) ^ 0x65A4C652;
            if ((n2 ^ n) == 1705297490) break block0;
            int cfr_ignored_0 = (0x187995C5 ^ n) + 539109217;
        }
        return class_2432.method_10215();
    }

    private static class_243 khbt(class_746 class_7462) {
        block0: {
            int n = 1307232048;
            int n2 = (n = Integer.rotateLeft(n * -1502146761, 20) ^ 0xE68638D8) ^ 0x22E1E5AF;
            if ((n2 ^ n) == 585229743) break block0;
            int cfr_ignored_0 = (0x6F0B229F ^ n) - 1668549865;
        }
        return class_7462.method_18798();
    }

    private static double mh_2(long l) {
        block0: {
            int n = -124470913;
            n = Integer.rotateLeft(n * 982334939, 26) ^ 0xC9458794;
            int n2 = (n = (int)l ^ n) ^ 0x18277887;
            if ((n2 ^ n) == 405239943) break block0;
            int cfr_ignored_0 = (0xE0B3C1F8 ^ n) + 2011132576;
        }
        return Double.longBitsToDouble(l);
    }

    private static float dzh_2(float f) {
        block0: {
            int n = ss_4.thq_4(-333821228);
            int n2 = n ^ 0x297F0C19;
            if ((n2 ^ n) == 696192025) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC56546CD ^ n, 11) - -341757426;
            int cfr_ignored_1 = (int)(0x7D7E8F027D4EB4FL ^ (long)n ^ 0x2C90831A2DB9A27EL);
        }
        return class_3532.method_15362((float)f);
    }

    private static double zzj_3(double d, double d2) {
        block0: {
            int n = 682689228;
            n = Integer.rotateLeft(n * 1596786783, 13) ^ 0x4DD36BF0;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x6FF82CDE;
            if ((n2 ^ n) == 1878535390) break block0;
            int cfr_ignored_0 = (0x47492E12 ^ n) + 1511223086;
        }
        return Math.min(d, d2);
    }

    private static class_243 jrh(class_243 class_2432, double d, double d2, double d3) {
        block0: {
            int n = 334099761;
            n = Integer.rotateLeft(n * -1493967929, 26) ^ 0x8025DDE7;
            class_243 class_2433 = class_2432;
            n = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 27);
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0x6CAB9C18;
            if ((n2 ^ n) == 1823185944) break block0;
            int cfr_ignored_0 = (0x7F426929 ^ n) - -1617586162;
        }
        return class_2432.method_1031(d, d2, d3);
    }

    private static float zty(class_746 class_7462) {
        block0: {
            int n = -1707377728;
            n = Integer.rotateLeft(n * -1407545793, 13) ^ 0x73A35491;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 14);
            int n2 = n ^ 0xBF62840C;
            if ((n2 ^ n) == -1084062708) break block0;
            int cfr_ignored_0 = (0x2559FFCC ^ n) - 158218069;
        }
        return class_7462.method_36455();
    }

    private static float srr_2(int n) {
        block0: {
            int n2 = -4307582;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1227148509, 16) ^ 0xF1618F89) ^ 0x3BFC0A93;
            if ((n3 ^ n2) == 1006373523) break block0;
            int cfr_ignored_0 = (0xC4424F11 ^ n2) - -1092336349;
        }
        return Float.intBitsToFloat(n);
    }

    private static double dhs_8(long l) {
        block0: {
            int n = 542408716;
            n = Integer.rotateLeft(n * 28536601, 22) ^ 0xB4F52A3E;
            int n2 = (n = (int)l ^ n) ^ 0x966E6CB8;
            if ((n2 ^ n) == -1771148104) break block0;
            int cfr_ignored_0 = (0xB63AECB4 ^ n) + 981529610;
        }
        return Double.longBitsToDouble(l);
    }

    private static String[] rdq_2(String string) {
        block0: {
            int n = 1231183580;
            n = Integer.rotateLeft(n * 26526079, 9) ^ 0xC3A1F44C;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
            int n2 = n ^ 0xD0F7E9D3;
            if ((n2 ^ n) == -789059117) break block0;
            int cfr_ignored_0 = (0x9995B70F ^ n) + 362309691;
        }
        return string.split("\u0003\u001a", -1);
    }

    private static CallSite tsh_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1684446288;
            n3 = Integer.rotateLeft(n3 * 1051275875, 22) ^ 0x27F1EA0E;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 29);
            int n4 = n3 ^ 0xBA88243D;
            if ((n4 ^ n3) != -1165482947) {
                int cfr_ignored_0 = (0x2111478D ^ n3) + 1222271261;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ttdh_2 ^ string.hashCode()) + (n2 + dthth) + i ^ ttdh_2, 10) + dthth);
            }
            String[] stringArray = bkht_2.rdq_2(new String(cArray));
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

    private static String[] x7kol6ta9el(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite y4r15xrjw6edvy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sny2904likp ^ string.hashCode() ^ n2 + y4czh2vjfw5n + i * -1896210111) + sny2904likp) ^ y4czh2vjfw5n));
            }
            String[] stringArray = bkht_2.x7kol6ta9el(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

