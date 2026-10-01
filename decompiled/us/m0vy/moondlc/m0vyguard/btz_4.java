/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
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
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import us.m0vy.moondlc.m0vyguard.brn;
import us.m0vy.moondlc.m0vyguard.tdz_2;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.tzth;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.yf;

public class btz_4
extends tzth {
    private final List dhk_3 = new ArrayList();
    private float khzd = 0.0f;
    private class_1309 hghsh = null;
    private static final class_2960 tha_2;
    private static final int bshr = -452350252;
    private static final int bmkh = -1500463510;
    private static final int a76ragy = 1483889984;
    private static final int u2fkc0fruv = -748766219;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int uh6lcpio;

    @Override
    public void ththd() {
        this.ssd_2();
        if (this.dhagh_2() == null) {
            this.dhk_3.clear();
            this.hghsh = null;
            return;
        }
        if (this.dhagh_2() != this.hghsh) {
            this.hghsh = this.dhagh_2();
            this.bath(this.hghsh);
        }
    }

    private void bath(class_1309 class_13092) {
        int n = tdz_2.at_2(-245675035);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 7);
        int n2 = n ^ 0x45AE1217;
        if ((n2 ^ n) != 1169035799) {
            int cfr_ignored_0 = (Integer.rotateRight(0xB4F559F2 ^ n, 9) + -300711031) * -1258989069;
        }
        this.dhk_3.clear();
        this.dhk_3.add(new brn(this, class_13092, new class_243(0.0, Double.longBitsToDouble(0x19D92F316051739EL ^ 0x26321C02536240ADL), Double.longBitsToDouble(0x3ACB627AF4E35233L ^ 0x522FBE36D7ACBA9L)), new class_243(Double.longBitsToDouble(0x59B8DD933E0494C1L ^ 0x99F05D933E0494C1L), 0.0, btz_4.ran_2(0x5325D0842E3FCA26L ^ 0x1361D0842E3FCA26L))));
        this.dhk_3.add(new brn(this, class_13092, new class_243(btz_4.jtl(0xF620121470C1ED9AL ^ 0xC9E98B8DE9587400L), Double.longBitsToDouble(0xD6DA412A2A1E0A8EL ^ 0xE9317219192D39BDL), Double.longBitsToDouble(0x2457D4FB05341A52L ^ 0x9BB24D629CAD83C8L)), new class_243(Double.longBitsToDouble(0x121C30DBEBCC7289L ^ 0x525DB0DBEBCC7289L), 0.0, btz_4.snf_2(0xB22A420C752C1FB8L ^ 0x7214420C752C1FB8L))));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0xB0662B6E557AEB83L ^ 0x8F85185D6649D8B0L), Double.longBitsToDouble(0xE07D2689A1292CL ^ 0x3F15E4BF1038B0B6L), Double.longBitsToDouble(0xF409B12EC4208160L ^ 0xCBEA821DF713B253L)), new class_243(Double.longBitsToDouble(0x5FED12F85D829FE4L ^ 0x9FD312F85D829FE4L), 0.0, Double.longBitsToDouble(0x4336C2FD86917E67L ^ 0x37742FD86917E67L))));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0x999DA46240929E30L ^ 0x267A0A763A73D99EL), btz_4.khdha(0x6DC7C0644AB2F583L ^ 0x52370CA8867E394EL), Double.longBitsToDouble(0x23675A5DF0F593B2L ^ 0x1CBEC3C4696C0A28L)), new class_243(btz_4.shz_4(0x4FF59257CC9AAAD3L ^ 0x8FCC9257CC9AAAD3L), 0.0, Double.longBitsToDouble(0x319E64E413E17410L ^ 0xF1A064E413E17410L))));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0x10C41B77EB14F2AAL ^ 0x2F23B56391F5B504L), Double.longBitsToDouble(0xFC771B679585C46CL ^ 0xC3997D01F3E3A20AL), Double.longBitsToDouble(0x83CA2EF8A85BBDBCL ^ 0x3C13B76131C22426L)), new class_243(0.0, 0.0, 0.0)));
        this.dhk_3.add(new brn(this, class_13092, new class_243(btz_4.jrl(0xB9B190206430F15L ^ 0xB4457F6460256973L), Double.longBitsToDouble(0xDEB2992E4CDFD51AL ^ 0xE159AA1D7FECE629L), Double.longBitsToDouble(0xED880833C5EB024CL ^ 0x52500833C5EB024CL)), new class_243(Double.longBitsToDouble(0x5A344EC09EABFD5DL ^ 0x1A0A4EC09EABFD5DL), 0.0, Double.longBitsToDouble(0x573DFEFD258A0E82L ^ 0x9704FEFD258A0E82L))));
        this.dhk_3.add(new brn(this, class_13092, new class_243(0.0, Double.longBitsToDouble(0x28CF9AC9BF35B91FL ^ 0x173A035026AC2085L), Double.longBitsToDouble(0xDECB825A3D2C9690L ^ 0x6128B1690E1FA5A3L)), new class_243(Double.longBitsToDouble(0x923B6FFA52C77522L ^ 0xD27DEFFA52C77522L), 0.0, 0.0)));
        this.dhk_3.add(new brn(this, class_13092, new class_243(btz_4.sat_7(0x5EA66E7657E88286L ^ 0x614D5D4564DBB1B5L), Double.longBitsToDouble(0x4EACCDF3A5BC3082L ^ 0x714AAB95C3DA56E4L), Double.longBitsToDouble(0x5EB25101960921DBL ^ 0x610BC8980F90B841L)), new class_243(Double.longBitsToDouble(0x49F07EB0C360B51EL ^ 0x89CE7EB0C360B51EL), 0.0, Double.longBitsToDouble(0xB1922D37C228403BL ^ 0xF1AC2D37C228403BL))));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0x1098F40D6EA8534DL ^ 0xAF7E926B08CE352BL), Double.longBitsToDouble(0xCF5A62A18B0E4985L ^ 0xF0AFFB381297D01FL), Double.longBitsToDouble(0x887D699814236871L ^ 0x37AE5AAB27105B42L)), new class_243(0.0, 0.0, 0.0)));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0xE75EE1F5B013DE62L ^ 0x588DD2C68320ED51L), Double.longBitsToDouble(0x9BFEFA30B09E27EBL ^ 0xA40B63A92907BE71L), Double.longBitsToDouble(0x655C763AF704EDB7L ^ 0x5ABDEFA36E9D742DL)), new class_243(0.0, 0.0, 0.0)));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0x534D792E01DB7988L ^ 0xECAD792E01DB7988L), Double.longBitsToDouble(0x9E02D874D5DCA457L ^ 0xA1E4BE12B3BAC231L), Double.longBitsToDouble(0x95978E102720744DL ^ 0xAA71E8764146122BL)), new class_243(0.0, 0.0, 0.0)));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0x589D26B1E3C58156L ^ 0x677D26B1E3C58156L), Double.longBitsToDouble(0x2B29AF92793552C5L ^ 0x14CFC9F41F5334A3L), Double.longBitsToDouble(0x32BCB21EA3F26DB1L ^ 0xD5AD478C5940BD7L)), new class_243(0.0, 0.0, 0.0)));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0x6DE9E8F4BDA74E28L ^ 0xD20F8E92DBC1284EL), btz_4.dhkhq(0xE76B5A03783EED9BL ^ 0xD8835A03783EED9BL), 0.0), new class_243(0.0, 0.0, 0.0)));
        this.dhk_3.add(new brn(this, class_13092, new class_243(Double.longBitsToDouble(0xF3BEF98DF6B5404BL ^ 0x4C7760146F2CD9D1L), Double.longBitsToDouble(0x35C0FB1CE252CD3DL ^ 0xA2437D02E9E01F0L), Double.longBitsToDouble(0xF8C95121A8D4142BL ^ 0x472F3747CEB2724DL)), new class_243(0.0, 0.0, 0.0)));
    }

    @Override
    public void ht_2(shw_3 shw2) {
        if (this.dhagh_2() == null || this.ghsht() <= 0.0f) {
            return;
        }
        class_1309 class_13092 = this.dhagh_2();
        if (this.dhk_3.isEmpty() || class_13092 != this.hghsh) {
            this.bath(class_13092);
            this.hghsh = class_13092;
        }
        class_4587 class_45872 = shw2.ssha_2();
        float f = this.ghsht();
        tdhz_2 tdhz2_2 = tdhz_2.trb();
        float f2 = tdhz2_2.khhd().thw_5();
        RenderSystem.disableDepthTest();
        class_243 class_2432 = this.thnz_2(class_13092);
        class_2432 = class_2432.method_1020(btz_4.mc.field_1773.method_19418().method_19326());
        this.khzd = (this.khzd + 0.5f * f2) % 360.0f;
        class_45872.method_22903();
        class_45872.method_22904(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        float f3 = this.dhsht(shw2.skz_4());
        float f4 = tdhz2_2.tsb_2().thw_5() * f3;
        class_45872.method_22905(f4, f4, f4);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(this.khzd));
        class_4184 class_41842 = btz_4.mc.field_1773.method_19418();
        int n = this.dghs(class_13092).getRGB();
        for (brn brn2 : this.dhk_3) {
            brn2.zdy_4(class_45872, f, n, class_41842, f2);
        }
        class_45872.method_22909();
        RenderSystem.enableDepthTest();
    }

    private Color dghs(class_1309 class_13092) {
        try {
            int n = -242929041;
            n = Integer.rotateLeft(n * 471827407, 8) ^ 0x531072AE;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 11);
            int n2 = n ^ 0x21E437EC;
            if ((n2 ^ n) != 568604652) {
                int cfr_ignored_0 = (0xD0610583 ^ n) - 1014084904;
            }
            if ((0x290 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        Color color = tdhz_2.trb().zbgh_2();
        if (class_13092.field_6235 > 0) {
            Color color2 = new Color(Integer.rotateLeft(0xAF8178A8 ^ 0xAF9E98A8, 19), 0x14B75222 ^ 0x14B75210, btz_4.ads_3(-1514695075) ^ 0xBA69ED97, Integer.reverse(472333996) ^ 0x357CE4C7);
            float f = (float)class_13092.field_6235 / Float.intBitsToFloat(0xC96286E9 ^ 0x884286E9);
            int n = (int)((float)color2.getRed() * f + (float)btz_4.dht_7(color) * (1.0f - f));
            int n3 = (int)((float)btz_4.thh_7(color2) * f + (float)btz_4.hkth(color) * (1.0f - f));
            int n4 = (int)((float)btz_4.ghsdh_2(color2) * f + (float)color.getBlue() * (1.0f - f));
            return new Color(n, n3, n4, Integer.reverse(1329387692) ^ 0x351B3C0D);
        }
        return color;
    }

    private int aqd(int n, int n2) {
        block0: {
            int n3 = 909095356;
            n3 = Integer.rotateLeft(n3 * 1110728385, 11) ^ 0xDFF50AE3;
            n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 20);
            int n4 = (n3 = n2 ^ n3) ^ 0x7F560AE5;
            if ((n4 ^ n3) == 2136345317) break block0;
            int cfr_ignored_0 = (0x4979BB59 ^ n3) - 2066306546;
        }
        return btz_4.thah(0, btz_4.khbt_2(1520342926 - 1520342671, n2)) << (0x74605157 ^ 0x7460514F) | n & 1736368535 + -1719591320;
    }

    private static double ran_2(long l) {
        block0: {
            int n = tdz_2.at_2(1441192086);
            int n2 = (n = (int)l ^ n) ^ 0xFDC3F106;
            if ((n2 ^ n) == -37490426) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA8252990 ^ n, 8) + 1625139115) * -1473959535;
        }
        return Double.longBitsToDouble(l);
    }

    private static double jtl(long l) {
        block0: {
            int n = -999426423;
            n = Integer.rotateLeft(n * -1032365727, 15) ^ 0xBA5FCBA9;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 10)) ^ 0x4E8D1B02;
            if ((n2 ^ n) == 1317870338) break block0;
            int cfr_ignored_0 = (0x8AE0ED8B ^ n) - 180970953;
        }
        return Double.longBitsToDouble(l);
    }

    private static double snf_2(long l) {
        block0: {
            int n = 463358293;
            n = Integer.rotateLeft(n * 413151279, 18) ^ 0x3FCD9730;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 18)) ^ 0xE9C969A7;
            if ((n2 ^ n) == -372676185) break block0;
            int cfr_ignored_0 = (0xF25720F2 ^ n) - 28702397;
        }
        return Double.longBitsToDouble(l);
    }

    private static double khdha(long l) {
        block0: {
            int n = tdz_2.at_2(-1174977917);
            int n2 = (n = (int)l ^ n) ^ 0x66CE5B3F;
            if ((n2 ^ n) == 1724799807) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xDF3919BC ^ n, 14) - 206028031) * -549905987;
        }
        return Double.longBitsToDouble(l);
    }

    private static double shz_4(long l) {
        block0: {
            int n = 1987331347;
            n = Integer.rotateLeft(n * -1668504723, 9) ^ 0x920D43F0;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 15)) ^ 0x32821861;
            if ((n2 ^ n) == 847386721) break block0;
            int cfr_ignored_0 = (0x44F65D72 ^ n) + 2057183790;
        }
        return Double.longBitsToDouble(l);
    }

    private static double jrl(long l) {
        block0: {
            int n = tdz_2.at_2(-679223467);
            int n2 = n ^ 0x764BB690;
            if ((n2 ^ n) == 1984673424) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA1C869C5 ^ n, 7) - -1683853802;
            int cfr_ignored_1 = (int)(0x637AC7F827D4EB4FL ^ (long)n ^ 0x7280831A2DB96B24L);
        }
        return Double.longBitsToDouble(l);
    }

    private static double sat_7(long l) {
        block0: {
            int n = 1005554485;
            int n2 = (n = Integer.rotateLeft(n * 1558315233, 15) ^ 0xA620D43C) ^ 0x2E463A8A;
            if ((n2 ^ n) == 776354442) break block0;
            int cfr_ignored_0 = (0x15A9B1BF ^ n) - 376618997;
        }
        return Double.longBitsToDouble(l);
    }

    private static double dhkhq(long l) {
        block0: {
            int n = -1056647425;
            n = Integer.rotateLeft(n * -953456965, 17) ^ 0xC8F9B273;
            int n2 = (n = (int)l ^ n) ^ 0xAC20FD89;
            if ((n2 ^ n) == -1407124087) break block0;
            int cfr_ignored_0 = (0x6D242B76 ^ n) - -866838413;
        }
        return Double.longBitsToDouble(l);
    }

    private static int ads_3(int n) {
        block0: {
            int n2 = tdz_2.at_2(-1172819591);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 27)) ^ 0x5601FE11;
            if ((n3 ^ n2) == 1442971153) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEC19CF68 ^ n2, 16) + -1686258477;
        }
        return Integer.reverse(n);
    }

    private static int dht_7(Color color) {
        block0: {
            int n = -1458735948;
            n = Integer.rotateLeft(n * 523666713, 16) ^ 0x5FAC43EA;
            Color color2 = color;
            n = (color2 != null ? System.identityHashCode(color2) : 0) ^ n;
            int n2 = n ^ 0xBFD2704E;
            if ((n2 ^ n) == -1076727730) break block0;
            int cfr_ignored_0 = (0x16DF04FA ^ n) + -2020664982;
        }
        return color.getRed();
    }

    private static int thh_7(Color color) {
        block0: {
            int n = -1683307695;
            n = Integer.rotateLeft(n * -1651517395, 22) ^ 0xFCE31B86;
            Color color2 = color;
            n = (color2 != null ? System.identityHashCode(color2) : 0) ^ n;
            int n2 = n ^ 0xB47BC4A8;
            if ((n2 ^ n) == -1266957144) break block0;
            int cfr_ignored_0 = (0x2FD107F9 ^ n) - -1632471079;
        }
        return color.getGreen();
    }

    private static int hkth(Color color) {
        block0: {
            int n = tdz_2.at_2(-545808132);
            Color color2 = color;
            n = (color2 != null ? System.identityHashCode(color2) : 0) ^ n;
            int n2 = n ^ 0x2385AA54;
            if ((n2 ^ n) == 595962452) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xFCF20AA8 ^ n, 18) + -1515394669;
        }
        return color.getGreen();
    }

    private static int ghsdh_2(Color color) {
        block0: {
            int n = -473629950;
            n = Integer.rotateLeft(n * 126531671, 4) ^ 0x176B1B76;
            Color color2 = color;
            n = (color2 != null ? System.identityHashCode(color2) : 0) ^ n;
            int n2 = n ^ 0xF4123589;
            if ((n2 ^ n) == -200133239) break block0;
            int cfr_ignored_0 = (0x17D6CE8B ^ n) - -937123478;
        }
        return color.getBlue();
    }

    private static int khbt_2(int n, int n2) {
        block0: {
            int n3 = 344103113;
            n3 = Integer.rotateLeft(n3 * 595057275, 23) ^ 0xD7C6ED2B;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 25)) ^ 0xCD33D349;
            if ((n4 ^ n3) == -852241591) break block0;
            int cfr_ignored_0 = (0xD9B14B80 ^ n3) + -1701154643;
        }
        return Math.min(n, n2);
    }

    private static int thah(int n, int n2) {
        block0: {
            int n3 = tdz_2.at_2(-1212373339);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 18)) ^ 0x8B055E1;
            if ((n4 ^ n3) == 145774049) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xBF0CF344 ^ n3, 10) - 653202551;
        }
        return Math.max(n, n2);
    }

    private static String[] dhqs(String string) {
        int n = 635748706;
        int n2 = (n = Integer.rotateLeft(n * -979269829, 18) ^ 0xBF01BBE0) ^ 0x3C2E4E56;
        if ((n2 ^ n) != 1009667670) {
            int cfr_ignored_0 = (0x19CA8F34 ^ n) - -1360630167;
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

    private static CallSite bzn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -964955913;
            n3 = Integer.rotateLeft(n3 * -1833159251, 22) ^ 0xF480ADA5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 18);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xEDEC1200;
            if ((n4 ^ n3) != -303296000) {
                int cfr_ignored_0 = (0x2B97E2F7 ^ n3) - 1380236618;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bshr ^ string.hashCode()) + (n2 + bmkh) + i ^ bshr, 28) + bmkh);
            }
            String[] stringArray = btz_4.dhqs(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] jwfciofkhicnye(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite n8518vyk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ a76ragy ^ string.hashCode() ^ n2 + u2fkc0fruv + i * -1224048349) + a76ragy) ^ u2fkc0fruv));
            }
            String[] stringArray = btz_4.jwfciofkhicnye(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

