/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import us.m0vy.moondlc.m0vyguard.byr;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.thkh;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.tzth;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.yf;

public class bts_4
extends tzth {
    private final List tkhr = new ArrayList();
    private float tfth = 0.0f;
    private long bdk_2 = 0L;
    private class_1297 str_2 = null;
    private class_1309 hlw = null;
    private static final int bat_3 = -914483394;
    private static final int bzkh = 213730683;
    private static final int zm6ogb7v = 367279603;
    private static final int yercpyg1ym4v = -1679042861;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int xx4wp59pgo8y;

    @Override
    public void ththd() {
        this.ssd_2();
        if (this.dhagh_2() == null) {
            this.tkhr.clear();
            this.hlw = null;
            return;
        }
        if (this.dhagh_2() != this.hlw) {
            this.hlw = this.dhagh_2();
            this.skhgh();
            this.str_2 = this.hlw;
        } else if (this.tkhr.size() != (int)tdhz_2.trb().ska_2().thw_5()) {
            this.skhgh();
        }
    }

    private void skhgh() {
        try {
            int n = -727682847;
            n = Integer.rotateLeft(n * -954606951, 16) ^ 0x2FB866E4;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF6DB3C98;
            if ((n2 ^ n) != -153404264) {
                int cfr_ignored_0 = (0x227B4C79 ^ n) - -5747502;
            }
            if ((0x8F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.tkhr.clear();
        Random random = new Random();
        int n = (int)bts_4.tdh_9(tdhz_2.trb()).thw_5();
        for (int i = 0; i < n; ++i) {
            float f = random.nextFloat() * Float.intBitsToFloat(-2137372638 + -1021724706);
            float f2 = Float.intBitsToFloat(-441607848 - -1495217013) + bts_4.bshth(random) * Float.intBitsToFloat(714673852 + 355712529);
            float f3 = bts_4.trm_2(Integer.reverse(-2113199123) ^ 0x89081C8C) + random.nextFloat() * Float.intBitsToFloat(952987314 + 98944129);
            float f4 = (float)Math.cos(Math.toRadians(f)) * f3;
            float f5 = (float)Math.sin(Math.toRadians(f)) * f3;
            this.tkhr.add(new byr(new class_243((double)(f4 += (bts_4.dath_3(random) - Float.intBitsToFloat(104945783 + 952018825)) * bts_4.jrj(Integer.reverse(1273363454) ^ 0x41C63E48)), (double)f2, (double)(f5 += (random.nextFloat() - Float.intBitsToFloat(bts_4.zfh_4(0x89344B33 ^ 0x89347433, 16))) * bts_4.hysh(0xDF42F13E ^ 0xE15B68A4))), i));
        }
        this.bdk_2 = System.currentTimeMillis();
    }

    @Override
    public void ht_2(shw_3 shw2) {
        if (this.dhagh_2() == null || this.ghsht() <= 0.0f) {
            return;
        }
        class_1309 class_13092 = this.dhagh_2();
        if (this.tkhr.isEmpty() || class_13092 != this.hlw) {
            this.skhgh();
            this.hlw = class_13092;
        }
        class_4587 class_45872 = shw2.ssha_2();
        float f = this.ghsht();
        float f2 = mc.method_61966().method_60637(false);
        float f3 = class_3532.method_15363((float)(((float)class_13092.field_6235 - f2) / 20.0f), (float)0.0f, (float)1.0f);
        RenderSystem.enableDepthTest();
        class_243 class_2432 = this.thnz_2(class_13092);
        class_2432 = class_2432.method_1020(bts_4.mc.field_1773.method_19418().method_19326());
        tdhz_2 tdhz2_2 = tdhz_2.trb();
        this.tfth = (this.tfth + 0.7f * tdhz2_2.khhd().thw_5()) % 360.0f;
        float f4 = class_3532.method_15363((float)f3, (float)0.0f, (float)1.0f);
        f4 *= f4;
        long l = System.currentTimeMillis() - this.bdk_2;
        class_45872.method_22903();
        class_45872.method_22904(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        float f5 = this.dhsht(shw2.skz_4());
        float f6 = tdhz2_2.tsb_2().thw_5() * f5;
        class_45872.method_22905(f6, f6, f6);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(this.tfth));
        class_4184 class_41842 = bts_4.mc.field_1773.method_19418();
        int n = this.rzl(class_13092).getRGB();
        for (int i = 0; i < this.tkhr.size(); ++i) {
            byr byr2 = (byr)this.tkhr.get(i);
            float f7 = (float)Math.sin((double)System.currentTimeMillis() / 350.0 + (double)i * 0.7) * 0.06f;
            float f8 = (float)Math.cos((double)System.currentTimeMillis() / 500.0 + (double)i * 0.5) * 0.03f;
            class_45872.method_22903();
            class_45872.method_46416(f8, f7, f8 * 0.5f);
            byr2.sakh_4(class_45872, f, n, f4, class_41842, this.tfth, l);
            class_45872.method_22909();
        }
        class_45872.method_22909();
        RenderSystem.enableDepthTest();
    }

    private Color rzl(class_1309 class_13092) {
        int n = thkh.adh_2(-1939816631);
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0xA0B46C37;
        if ((n2 ^ n) != -1598788553) {
            int cfr_ignored_0 = (Integer.rotateRight(0x2CD4D37E ^ n, 8) - 1914911613) * 752145279;
        }
        Color color = bts_4.thjh_2().zbgh_2();
        if (class_13092.field_6235 > 0) {
            Color color2 = new Color(Integer.reverse(124928686) ^ 0x75424E1F, 0x34ACDC14 ^ 0x34ACDC26, 1037836637 - 1037836587, Integer.rotateLeft(0x762A7748 ^ 0x762B8948, 23));
            float f = (float)class_13092.field_6235 / Float.intBitsToFloat(173796732 + 918819460);
            int n3 = (int)((float)color2.getRed() * f + (float)color.getRed() * (1.0f - f));
            int n4 = (int)((float)color2.getGreen() * f + (float)color.getGreen() * (1.0f - f));
            int n5 = (int)((float)color2.getBlue() * f + (float)color.getBlue() * (1.0f - f));
            return new Color(n3, n4, n5, Integer.reverse(1512349728) ^ 0x40524A5);
        }
        return color;
    }

    private static tay tdh_9(tdhz_2 tdhz2_2) {
        block0: {
            int n = thkh.adh_2(-487594199);
            tdhz_2 tdhz3_2 = tdhz2_2;
            n = (tdhz3_2 != null ? System.identityHashCode(tdhz3_2) : 0) ^ n;
            int n2 = n ^ 0x32BF63D2;
            if ((n2 ^ n) == 851403730) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD05084FB ^ n, 13) + 1042135456) * -800029445;
        }
        return tdhz2_2.ska_2();
    }

    private static float bshth(Random random) {
        block0: {
            int n = thkh.adh_2(1529527093);
            Random random2 = random;
            n = Integer.rotateLeft((random2 != null ? System.identityHashCode(random2) : 0) ^ n, 5);
            int n2 = n ^ 0xFCF23504;
            if ((n2 ^ n) == -51235580) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA7D88E31 ^ n, 7) + 1469503274) * -1478980047;
            int cfr_ignored_1 = (int)(0x656A200C27D4EB4FL ^ (long)n ^ 0xBD68831A2DB96705L);
        }
        return random.nextFloat();
    }

    private static float trm_2(int n) {
        block0: {
            int n2 = 1136474531;
            int n3 = (n2 = Integer.rotateLeft(n2 * 941099657, 20) ^ 0x8B8BAADD) ^ 0x9F365E82;
            if ((n3 ^ n2) == -1623826814) break block0;
            int cfr_ignored_0 = (0xDC8B6721 ^ n2) - 1327345894;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dath_3(Random random) {
        block0: {
            int n = thkh.adh_2(1539704226);
            Random random2 = random;
            n = (random2 != null ? System.identityHashCode(random2) : 0) ^ n;
            int n2 = n ^ 0x84A66B86;
            if ((n2 ^ n) == -2069468282) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xDF606E24 ^ n, 14) - 285930903;
        }
        return random.nextFloat();
    }

    private static float jrj(int n) {
        block0: {
            int n2 = 1005477364;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1275477649, 11) ^ 0x85F9CF72) ^ 0x99957377;
            if ((n3 ^ n2) == -1718258825) break block0;
            int cfr_ignored_0 = (0xA27B2E83 ^ n2) - 1725032074;
        }
        return Float.intBitsToFloat(n);
    }

    private static int zfh_4(int n, int n2) {
        block0: {
            int n3 = thkh.adh_2(1806276264);
            int n4 = (n3 = n ^ n3) ^ 0x401A0225;
            if ((n4 ^ n3) == 1075446309) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x2BB3948D ^ n3, 8) - 1327275086;
            int cfr_ignored_1 = (int)(0xE9013AB027D4EB4FL ^ (long)n3 ^ 0x8810831A2DB87FD3L);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float hysh(int n) {
        block0: {
            int n2 = -332172686;
            n2 = Integer.rotateLeft(n2 * 596675105, 22) ^ 0x98FB4E2A;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 10)) ^ 0x2621E77;
            if ((n3 ^ n2) == 39984759) break block0;
            int cfr_ignored_0 = (0xEE516C05 ^ n2) - 519419226;
        }
        return Float.intBitsToFloat(n);
    }

    private static tdhz_2 thjh_2() {
        block0: {
            int n = 1665578893;
            int n2 = (n = Integer.rotateLeft(n * -221366233, 18) ^ 0xD1CA8D07) ^ 0xE79C34A6;
            if ((n2 ^ n) == -409193306) break block0;
            int cfr_ignored_0 = (0x84DA832B ^ n) - -1358948292;
        }
        return tdhz_2.trb();
    }

    private static String[] shb_3(String string) {
        block0: {
            int n = -372829841;
            n = Integer.rotateLeft(n * 681130751, 15) ^ 0xF16D6BCF;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xD2A397C4;
            if ((n2 ^ n) == -761030716) break block0;
            int cfr_ignored_0 = (0x3B6486AB ^ n) - 56171361;
        }
        return string.split("\u0005\u0012", -1);
    }

    private static CallSite aan(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1675295996;
            n3 = Integer.rotateLeft(n3 * 929255669, 20) ^ 0xD2DB7922;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 23);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x98570C35;
            if ((n4 ^ n3) != -1739125707) {
                int cfr_ignored_0 = (0xFB8DF0C9 ^ n3) - -179254612;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ bat_3 ^ string.hashCode() ^ n2 + bzkh ^ i * -1523541011 ^ bat_3, 27) ^ bzkh));
            }
            String[] stringArray = bts_4.shb_3(new String(cArray));
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

    private static String[] mcd5s6jaldua(String string) {
        return string.split("\b\u0010", -1);
    }

    private static CallSite sh9mug9u(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zm6ogb7v ^ string.hashCode()) + (n2 + yercpyg1ym4v) + i ^ zm6ogb7v, 13) + yercpyg1ym4v);
            }
            String[] stringArray = bts_4.mcd5s6jaldua(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

