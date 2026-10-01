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
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import us.m0vy.moondlc.m0vyguard.bts_2;
import us.m0vy.moondlc.m0vyguard.bfz_2;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.tzth;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.yf;

public class nsh
extends tzth {
    private final List jdhm = new ArrayList();
    private float dhdd = 0.0f;
    private long szs = 0L;
    private class_1297 rzt = null;
    private class_1309 thtk = null;
    private static final int dhjkh = -549102488;
    private static final int sdn = -781413465;
    private static final int cr2ylme11e60k = -972560645;
    private static final int c0rhzggai = -376271254;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int e5p7d6k4cf7f8;

    @Override
    public void ththd() {
        this.ssd_2();
        if (this.dhagh_2() == null) {
            this.jdhm.clear();
            this.thtk = null;
            return;
        }
        if (this.dhagh_2() != this.thtk) {
            this.thtk = this.dhagh_2();
            this.khmz_2((class_1297)this.thtk);
            this.rzt = this.thtk;
        }
    }

    private void khmz_2(class_1297 class_12972) {
        try {
            int n = 1787889451;
            n = Integer.rotateLeft(n * -174443055, 9) ^ 0x8FD4F88B;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0xC9926316;
            if ((n2 ^ n) != -913153258) {
                int cfr_ignored_0 = (0xA303643D ^ n) - -1375065822;
            }
            if ((0xCF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!nsh.thd_2()) {
            yf.athz_2();
            throw null;
        }
        this.jdhm.clear();
        int n = 0;
        this.jdhm.add(new bts_2(new class_243(Double.longBitsToDouble(0xEC8E05087F499789L ^ 0xD36D363B4C7AA4BAL), Double.longBitsToDouble(0x69F1C959EFBB9060L ^ 0x5602FA6ADC88A353L), 0.0), n++));
        this.jdhm.add(new bts_2(new class_243(Double.longBitsToDouble(0x48EA84069E89563L ^ 0xBB6D9B735ADBA650L), Double.longBitsToDouble(0x5F9072B4FBF31309L ^ 0x60634187C8C0203AL), 0.0), n++));
        this.jdhm.add(new bts_2(new class_243(0.0, Double.longBitsToDouble(0xC685946BBF14700AL ^ 0xF976A7588C274339L), Double.longBitsToDouble(0xB232A426D2246B48L ^ 0x8DD19715E117587BL)), n++));
        this.jdhm.add(new bts_2(new class_243(0.0, Double.longBitsToDouble(0x1B613E51BF9341DBL ^ 0x24920D628CA072E8L), Double.longBitsToDouble(0x5B81CFA68EA49CF0L ^ 0xE462FC95BD97AFC3L)), n++));
        this.jdhm.add(new bts_2(new class_243(nsh.tkhr(0x85FFF0745F71F5ADL ^ 0xBA1A32FB0359006EL), Double.longBitsToDouble(0xAC752FBF79CC5303L ^ 0x93892FBF79CC5303L), 0.0), n++));
        this.jdhm.add(new bts_2(new class_243(Double.longBitsToDouble(0x7B73E53F39B9BBF9L ^ 0xC49627B065914E3AL), Double.longBitsToDouble(0x68850F8730206613L ^ 0x57790F8730206613L), 0.0), n++));
        this.jdhm.add(new bts_2(new class_243(Double.longBitsToDouble(0x7CB564C0B61FC4C4L ^ 0x437CFD592F865D5EL), nsh.yz(0x69D2DBE63CB1C1C9L ^ 0x562EDBE63CB1C1C9L), Double.longBitsToDouble(0xFA8AF586AD24DBE5L ^ 0xC56F3709F10C2E26L)), n++));
        this.jdhm.add(new bts_2(new class_243(Double.longBitsToDouble(0xB93DD1D6F7F30A57L ^ 0x6F4484F6E6A93CDL), Double.longBitsToDouble(0x78BF858D347C8C71L ^ 0x4743858D347C8C71L), Double.longBitsToDouble(0xF7B0D553745C1368L ^ 0xC853E660476F205BL)), n++));
        this.jdhm.add(new bts_2(new class_243(0.0, Double.longBitsToDouble(0x318A153FB14F9651L ^ 0xE76153FB14F9651L), Double.longBitsToDouble(0x15CB544A2F0DA564L ^ 0xAA2867791C3E9657L)), n++));
        this.jdhm.add(new bts_2(new class_243(Double.longBitsToDouble(0xE1CD7AD74906CA63L ^ 0xDE28B858152E3FA0L), Double.longBitsToDouble(0xE0DA15B244758B9DL ^ 0xDF3ED97E88B94750L), 0.0), n++));
        this.jdhm.add(new bts_2(new class_243(Double.longBitsToDouble(0xD154D1B9F0319396L ^ 0x6EB11336AC196655L), Double.longBitsToDouble(0x30BC27EAF711C053L ^ 0xF58EB263BDD0C9EL), Double.longBitsToDouble(0x4603E9278E24A074L ^ 0xC603E9278E24A074L)), n++));
        this.jdhm.add(new bts_2(new class_243(nsh.atw_2(0xAE3346730159F135L ^ 0x91FADFEA98C068AFL), Double.longBitsToDouble(0x1C6D36EEA4B7E52CL ^ 0x2389FA22687B29E1L), Double.longBitsToDouble(0x35E53AA91656DB2AL ^ 0x8A06099A2565E819L)), n++));
        this.jdhm.add(new bts_2(new class_243(Double.longBitsToDouble(0xE78C33AC7923DE31L ^ 0x5845AA35E0BA47ABL), Double.longBitsToDouble(0x62D37E1AC47862D2L ^ 0x5D37B2D608B4AE1FL), Double.longBitsToDouble(0xF8FD2C9570E6B1D8L ^ 0x471E1FA643D582EBL)), n++));
        this.jdhm.add(new bts_2(new class_243(0.0, Double.longBitsToDouble(0x1EAC7511D2DEF3BDL ^ 0x2148B9DD1E123F70L), Double.longBitsToDouble(0xF2FFCA28EE36DCF6L ^ 0xCD18C0159E950BFCL)), n++));
        this.szs = System.currentTimeMillis();
    }

    @Override
    public void ht_2(shw_3 shw2) {
        if (this.dhagh_2() == null || this.ghsht() <= 0.0f) {
            return;
        }
        class_1309 class_13092 = this.dhagh_2();
        if (this.jdhm.isEmpty() || class_13092 != this.thtk) {
            this.khmz_2((class_1297)class_13092);
            this.thtk = class_13092;
        }
        class_4587 class_45872 = shw2.ssha_2();
        float f = this.ghsht();
        float f2 = mc.method_61966().method_60637(false);
        float f3 = class_3532.method_15363((float)(((float)class_13092.field_6235 - f2) / 20.0f), (float)0.0f, (float)1.0f);
        RenderSystem.enableDepthTest();
        class_243 class_2432 = this.thnz_2(class_13092);
        class_2432 = class_2432.method_1020(nsh.mc.field_1773.method_19418().method_19326());
        tdhz_2 tdhz2_2 = tdhz_2.trb();
        this.dhdd = (this.dhdd + 0.5f * tdhz2_2.khhd().thw_5()) % 360.0f;
        float f4 = class_3532.method_15363((float)f3, (float)0.0f, (float)1.0f);
        f4 *= f4;
        long l = System.currentTimeMillis() - this.szs;
        class_45872.method_22903();
        class_45872.method_22904(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        float f5 = this.dhsht(shw2.skz_4());
        float f6 = tdhz2_2.tsb_2().thw_5() * f5;
        class_45872.method_22905(f6, f6, f6);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(this.dhdd));
        class_4184 class_41842 = nsh.mc.field_1773.method_19418();
        int n = this.hya_2(class_13092).getRGB();
        for (bts_2 bts2 : this.jdhm) {
            bts2.rtt_2(class_45872, f, n, f4, class_41842, this.dhdd, l);
        }
        class_45872.method_22909();
        RenderSystem.enableDepthTest();
    }

    private Color hya_2(class_1309 class_13092) {
        int n = -35498043;
        n = Integer.rotateLeft(n * -178055039, 11) ^ 0x8A5521F7;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x4CECA5B5;
        if ((n2 ^ n) != 1290577333) {
            int cfr_ignored_0 = (0xB10EF270 ^ n) + -1295109535;
        }
        Color color = tdhz_2.trb().zbgh_2();
        if (class_13092.field_6235 > 0) {
            Color color2 = new Color(Integer.rotateLeft(0x5F560DBA ^ 0x5FA90DBA, 16), -2093895547 + 2093895597, 851423572 - 851423522, -2106565358 - -2106565613);
            float f = (float)class_13092.field_6235 / Float.intBitsToFloat(Integer.reverse(320681625) ^ 0xD84CB8C8);
            int n3 = (int)((float)color2.getRed() * f + (float)color.getRed() * (1.0f - f));
            int n4 = (int)((float)color2.getGreen() * f + (float)color.getGreen() * (1.0f - f));
            int n5 = (int)((float)color2.getBlue() * f + (float)color.getBlue() * (1.0f - f));
            return new Color(n3, n4, n5, -1272285559 + 1272285814);
        }
        return color;
    }

    private static boolean thd_2() {
        block0: {
            int n = bfz_2.haf_2(1772740177);
            int n2 = n ^ 0x30EA00E8;
            if ((n2 ^ n) == 820642024) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5943DEB9 ^ n, 14) + -745171038) * 1497620153;
            int cfr_ignored_1 = (int)(0x9BF1708427D4EB4FL ^ (long)n ^ 0x1C78831A2DB89A33L);
        }
        return yf.khdha_2();
    }

    private static double tkhr(long l) {
        block0: {
            int n = bfz_2.haf_2(-488099665);
            int n2 = (n = (int)l ^ n) ^ 0x7F46707F;
            if ((n2 ^ n) == 2135322751) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9DAE40D0 ^ n, 6) + 477591659) * -1649524527;
        }
        return Double.longBitsToDouble(l);
    }

    private static double yz(long l) {
        block0: {
            int n = -1218686272;
            int n2 = (n = Integer.rotateLeft(n * 282905585, 25) ^ 0xC11095BB) ^ 0x1481C36B;
            if ((n2 ^ n) == 344048491) break block0;
            int cfr_ignored_0 = (0xA3DD91AB ^ n) + -1567547787;
        }
        return Double.longBitsToDouble(l);
    }

    private static double atw_2(long l) {
        block0: {
            int n = 1670840635;
            int n2 = (n = Integer.rotateLeft(n * 2033192527, 19) ^ 0xB94E4) ^ 0x15C4D845;
            if ((n2 ^ n) == 365221957) break block0;
            int cfr_ignored_0 = (0x7653D97E ^ n) + 646020036;
        }
        return Double.longBitsToDouble(l);
    }

    private static String[] tmd(String string) {
        int n = -822500420;
        n = Integer.rotateLeft(n * -789592281, 23) ^ 0x51326D84;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x9FEC2977;
        if ((n2 ^ n) != -1611912841) {
            int cfr_ignored_0 = (0x51158ACB ^ n) - -2111346406;
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

    private static CallSite ast_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1339007731;
            n3 = Integer.rotateLeft(n3 * -694735785, 9) ^ 0x78EA51D8;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 9);
            n3 = Integer.rotateLeft(n2 ^ n3, 3);
            int n4 = n3 ^ 0x19AC8C7;
            if ((n4 ^ n3) != 26921159) {
                int cfr_ignored_0 = (0xB1AA95CA ^ n3) - -255551275;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhjkh ^ string.hashCode()) + (n2 + sdn) + i ^ dhjkh, 26) + sdn);
            }
            String[] stringArray = nsh.tmd(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] jetsi8jngvduy(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite akdn7n4h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ cr2ylme11e60k ^ string.hashCode() ^ n2 + c0rhzggai + i * -250192333) + cr2ylme11e60k) ^ c0rhzggai));
            }
            String[] stringArray = nsh.jetsi8jngvduy(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

