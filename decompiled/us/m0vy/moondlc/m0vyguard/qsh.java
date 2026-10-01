/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.lwjgl.glfw.GLFW
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bdr;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.nd;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Click Effect", category=bzw.OTHER, desc="Pop animation on left click")
public class qsh
extends bnq {
    private final khd dhshd_2 = new khd(this, "Mode");
    private final fy lh_2 = new fy(this.dhshd_2, "Circle");
    private final fy dhdhj = new fy(this.dhshd_2, "Ring");
    private final fy thb_3 = new fy(this.dhshd_2, "Bloom");
    private final tay shdhh_2 = new tay(this, "Size").shth_7(Float.intBitsToFloat(-245998695 - -1330226279)).dhbs_2(Float.intBitsToFloat(895430551 - -224972905)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(912233712 - -188771088));
    private final tay jsth_2 = new tay(this, "Duration").shth_7(Float.intBitsToFloat(-602753552 - -1731545616)).dhbs_2(Float.intBitsToFloat(2112298994 - 959160306)).rkh_3(Float.intBitsToFloat(-1946905759 - 1236046689)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x2C0483AF ^ 0xBC048328, 23)));
    private final tay thwd_2 = new tay((hy)this, "Thickness", this::djth).shth_7(Float.intBitsToFloat(-1255007735 - 1982994953)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-2065858184) ^ 0x5FF1BB21)).rkh_3(Float.intBitsToFloat(-633233345 + 1690197953)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x64F2CC26 ^ 0x60F0CC26, 4)));
    private final tay saz_2 = new tay(this, "Opacity").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x58E0596D ^ 0x5AF2196D, 5))).dhbs_2(Float.intBitsToFloat(-2028461670 + -1134109082)).rkh_3(Float.intBitsToFloat(1543013703 + -458786119)).ssd_5(Float.intBitsToFloat(-1588025844 - 1576838668));
    private final badh_2 thab_2 = new badh_2(this, "On Attack").bts(true);
    private final badh_2 dzt = new badh_2(this, "Theme Color").bts(true);
    private final bzw_2 thjth = new bzw_2(this, "Color 1", this::dhkhh).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(1812860952) ^ 0x5B777036), Float.intBitsToFloat(Integer.rotateLeft(0x39BA0264 ^ 0x79BA0076, 21)), Float.intBitsToFloat(1994563943 + -869048679), Float.intBitsToFloat(-65360438 - -1197756982)));
    private final bzw_2 shld = new bzw_2(this, "Color 2", this::dbj_2).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0xC54A7ACB ^ 0xC5CEEACB, 7)), Float.intBitsToFloat(Integer.rotateLeft(0xE62D0024 ^ 0x662D10E1, 18)), Float.intBitsToFloat(Integer.rotateLeft(0xDB2463DF ^ 0xECD463DB, 28)), Float.intBitsToFloat(Integer.rotateLeft(0x593F71B9 ^ 0x593B4649, 12))));
    private final CopyOnWriteArrayList shhdh_2 = new CopyOnWriteArrayList();
    private boolean srf = false;
    private final bql<btt> zy_2 = this::ashr;
    private final bql<bthy> ss = this::khws_2;
    private final bql<bbgh> dzn_2 = this::skhd_2;
    private static final int dhwkh = 1449885775;
    private static final int qy = 545901644;
    private static final int khsz = 520134813;
    private static final int tjk = -373292541;
    private static final int slyby7fbq6 = 1684026613;
    private static final int l3h3k2woxp4j = -1993843763;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int l2qm33jk;

    private int shdm_2(int n) {
        try {
            int n2 = 1832782236;
            n2 = Integer.rotateLeft(n2 * -937618287, 18) ^ 0x47E7A5AA;
            int n3 = n2 ^ 0xE455E9D3;
            if ((n3 ^ n2) != -464131629) {
                int cfr_ignored_0 = (0x896BE04F ^ n2) + 1923125405;
            }
            if ((0x3C2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (qsh.tshdh()) {
            throw null;
        }
        if (this.dzt.shzl()) {
            return bhj_2.ths().rk();
        }
        float f = (float)((Math.sin((double)n * Double.longBitsToDouble(0x32291EE5E4EAD251L ^ 0xDBD6404A344C62AL) + (double)qsh.trb_2() * Double.longBitsToDouble(0x377C9D6B478D475L ^ 0x3C17AB9B66897D89L)) + 1.0) / qsh.abm(0x8091D7071AEBE63AL ^ 0xC091D7071AEBE63AL));
        int n4 = (int)(this.thjth.sdsh_4().sbk() * (1.0f - f) + qsh.az(this.shld).sbk() * f);
        int n5 = (int)(qsh.ayw(this.thjth).srl() * (1.0f - f) + this.shld.sdsh_4().srl() * f);
        int n6 = (int)(qsh.shdq(this.thjth).shsl_2() * (1.0f - f) + qsh.zdth(this.shld.sdsh_4()) * f);
        return new Color(n4, n5, n6).getRGB();
    }

    @Override
    public void nc() {
        int n = -348268520;
        n = Integer.rotateLeft(n * -911506103, 20) ^ 0x7A5F0F9;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
        int n2 = n ^ 0x5742CE42;
        if ((n2 ^ n) != 1463995970) {
            int cfr_ignored_0 = (0xBC7F165A ^ n) + -1263823131;
        }
        this.shhdh_2.clear();
    }

    private void skhd_2(bbgh bbgh2) {
        int n = 2013028270;
        n = Integer.rotateLeft(n * -1472612375, 22) ^ 0x51A22DD;
        n = System.identityHashCode(this) ^ n;
        bbgh bbgh3 = bbgh2;
        n = Integer.rotateRight((bbgh3 != null ? System.identityHashCode(bbgh3) : 0) ^ n, 20);
        int n2 = n ^ 0x3F22F7A4;
        if ((n2 ^ n) != 1059256228) {
            int cfr_ignored_0 = (0x48DEA80A ^ n) + 279626604;
        }
        long l = System.currentTimeMillis();
        int n3 = (int)this.jsth_2.thw_5();
        this.shhdh_2.removeIf(arg_0 -> qsh.hwth(l, n3, arg_0));
        if (this.shhdh_2.isEmpty()) {
            return;
        }
        class_4587 class_45872 = bbgh2.dtn().method_51448();
        float f = this.shdhh_2.thw_5();
        for (nd nd2 : this.shhdh_2) {
            float f2 = (float)(l - nd2.ths_4) / (float)n3;
            float f3 = f * (1.0f - (float)Math.pow(1.0f - f2, Double.longBitsToDouble(0xA87AEA13BFB20246L ^ 0xE872EA13BFB20246L)));
            float f4 = (1.0f - f2) * (this.saz_2.thw_5() / Float.intBitsToFloat(Integer.rotateLeft(0x5B7B3FCF ^ 0xE4FB3FEE, 25)));
            int n4 = this.shdm_2((int)(nd2.tghn + nd2.bd_2) % (-1685776116 + 1685776476));
            int n5 = n4 >> -266735274 - -266735290 & -814784882 + 814785137;
            int n6 = n4 >> 1833638355 + -1833638347 & -897115956 + 897116211;
            int n7 = n4 & -544843244 - -544843499;
            int n8 = (int)(f4 * Float.intBitsToFloat(1087002377 - -45394167));
            byq byq2 = new byq(n5, n6, n7, n8);
            float f5 = f3 * 2.0f;
            if (this.lh_2.shghkh()) {
                bdht.sqr_2(class_45872, nd2.tghn - f3, nd2.bd_2 - f3, f5, f5, zth_8.all(f3), byq2);
                continue;
            }
            if (this.dhdhj.shghkh()) {
                float f6 = Math.max(Float.intBitsToFloat(848987555 + 207977053), this.thwd_2.thw_5() * (1.0f - f2));
                bdht.khshy(class_45872, nd2.tghn - f3, nd2.bd_2 - f3, f5, f5, f6, zth_8.all(f3), byq2);
                continue;
            }
            if (!this.thb_3.shghkh()) continue;
            RenderSystem.setShader((class_10156)class_10142.field_53880);
            RenderSystem.setShaderTexture((int)0, (class_2960)Moondlc.id("textures/images/particles/bloom.png"));
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            float f7 = f3;
            int n9 = byq2.rk();
            class_2872.method_22918(matrix4f, nd2.tghn - f7, nd2.bd_2 + f7, 0.0f).method_22913(0.0f, 1.0f).method_39415(n9);
            class_2872.method_22918(matrix4f, nd2.tghn + f7, nd2.bd_2 + f7, 0.0f).method_22913(1.0f, 1.0f).method_39415(n9);
            class_2872.method_22918(matrix4f, nd2.tghn + f7, nd2.bd_2 - f7, 0.0f).method_22913(1.0f, 0.0f).method_39415(n9);
            class_2872.method_22918(matrix4f, nd2.tghn - f7, nd2.bd_2 - f7, 0.0f).method_22913(0.0f, 0.0f).method_39415(n9);
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
    }

    private static boolean hwth(long l, int n, nd nd2) {
        int n2 = bdr.hkw(410336973);
        n2 = (int)l ^ n2;
        nd nd3 = nd2;
        n2 = Integer.rotateRight((nd3 != null ? System.identityHashCode(nd3) : 0) ^ n2, 23);
        int n3 = n2 ^ 0x632B4F69;
        if ((n3 ^ n2) != 1663782761) {
            int cfr_ignored_0 = Integer.rotateLeft(0x7B5E71A4 ^ n2, 18) - -187866601;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return l - nd2.ths_4 > (long)n;
    }

    private void khws_2(bthy bthy2) {
        class_1297 class_12972;
        int n = bdr.hkw(-1503441847);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x98ADC686;
        if ((n2 ^ n) != -1733441914) {
            int cfr_ignored_0 = Integer.rotateRight(0x3ECE8ACF ^ n, 10) - -1621070260;
        }
        if (this.thab_2.shzl() && (class_12972 = bthy2.khtf()) instanceof class_1309) {
            float f = (float)mc.method_22683().method_4486() / 2.0f;
            float f2 = (float)mc.method_22683().method_4502() / 2.0f;
            this.shhdh_2.add(new nd(f, f2, System.currentTimeMillis()));
        }
    }

    private void ashr(btt btt2) {
        boolean bl;
        int n = 1719870007;
        n = Integer.rotateLeft(n * 1678209699, 4) ^ 0x312AECB2;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0x5E83AD98;
        if ((n2 ^ n) != 1585687960) {
            int cfr_ignored_0 = (0x38008FAF ^ n) - 1632030014;
        }
        boolean bl2 = bl = GLFW.glfwGetMouseButton((long)mc.method_22683().method_4490(), (int)0) == 1;
        if (bl && !this.srf) {
            float f;
            float f2;
            if (qsh.mc.field_1755 == null) {
                f2 = (float)mc.method_22683().method_4486() / 2.0f;
                f = (float)mc.method_22683().method_4502() / 2.0f;
            } else {
                double d = mc.method_22683().method_4495();
                f2 = (float)(qsh.mc.field_1729.method_1603() / d);
                f = (float)(qsh.mc.field_1729.method_1604() / d);
            }
            this.shhdh_2.add(new nd(f2, f, System.currentTimeMillis()));
        }
        this.srf = bl;
    }

    private boolean dbj_2() {
        block0: {
            int n = -1573847309;
            n = Integer.rotateLeft(n * -1845979737, 22) ^ 0xFF19C5EC;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4DBFF664;
            if ((n2 ^ n) == 1304426084) break block0;
            int cfr_ignored_0 = (0xEF8F0897 ^ n) - -86451768;
        }
        return this.dzt.shzl();
    }

    private boolean dhkhh() {
        block0: {
            int n = 1344332824;
            n = Integer.rotateLeft(n * 1272405153, 18) ^ 0x30EE7D9F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0x134A5822;
            if ((n2 ^ n) == 323639330) break block0;
            int cfr_ignored_0 = (0x436ABC3A ^ n) + -1580925753;
        }
        return this.dzt.shzl();
    }

    private boolean djth() {
        int n = 771453007;
        n = Integer.rotateLeft(n * 368853031, 27) ^ 0xA47077F4;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0x35873B8B;
        if ((n2 ^ n) != 898055051) {
            int cfr_ignored_0 = (0x187C4BC4 ^ n) - 181458579;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dhdhj.shghkh();
    }

    private static String ghjkh(String string, int n, int n2, int n3) {
        int n4 = bdr.hkw(1366105865);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 3);
        int n5 = (n4 = n ^ n4) ^ 0x41AF1AED;
        if ((n5 ^ n4) != 1101994733) {
            int cfr_ignored_0 = Integer.rotateLeft(0x10C205E4 ^ n4, 5) - 198989271;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x5F283559 ^ n2 - i) + qy, 25) ^ dhwkh + i * -1997807945));
        }
        return new String(cArray);
    }

    private static boolean tshdh() {
        block0: {
            int n = -146113792;
            int n2 = (n = Integer.rotateLeft(n * 2046360767, 5) ^ 0x31E40DA8) ^ 0x9318B09B;
            if ((n2 ^ n) == -1827098469) break block0;
            int cfr_ignored_0 = (0x6452CB9B ^ n) + -621869761;
        }
        return yf.dnkh();
    }

    private static long trb_2() {
        block0: {
            int n = -1469628909;
            int n2 = (n = Integer.rotateLeft(n * 492835213, 20) ^ 0x6E5F844) ^ 0x3BFAE367;
            if ((n2 ^ n) == 1006297959) break block0;
            int cfr_ignored_0 = (0x939DDD74 ^ n) + 1303489674;
        }
        return System.currentTimeMillis();
    }

    private static double abm(long l) {
        block0: {
            int n = bdr.hkw(-765264755);
            int n2 = (n = (int)l ^ n) ^ 0xC460002A;
            if ((n2 ^ n) == -1000341462) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1602FCA7 ^ n, 5) - -1363527820;
        }
        return Double.longBitsToDouble(l);
    }

    private static byq az(bzw_2 bzw2_2) {
        block0: {
            int n = bdr.hkw(-900586011);
            int n2 = n ^ 0x43984E4B;
            if ((n2 ^ n) == 1134054987) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x89CA6BAE ^ n, 4) - -1277122227;
        }
        return bzw2_2.sdsh_4();
    }

    private static byq ayw(bzw_2 bzw2_2) {
        block0: {
            int n = 1813545418;
            n = Integer.rotateLeft(n * -828334267, 10) ^ 0x568E8DE2;
            bzw_2 bzw3_2 = bzw2_2;
            n = Integer.rotateRight((bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n, 7);
            int n2 = n ^ 0xE7D2AF34;
            if ((n2 ^ n) == -405622988) break block0;
            int cfr_ignored_0 = (0x8BCA2EFE ^ n) + 1931815716;
        }
        return bzw2_2.sdsh_4();
    }

    private static byq shdq(bzw_2 bzw2_2) {
        block0: {
            int n = 1492474727;
            int n2 = (n = Integer.rotateLeft(n * 1387662425, 16) ^ 0x54757F32) ^ 0xAA0E0BBB;
            if ((n2 ^ n) == -1441920069) break block0;
            int cfr_ignored_0 = (0xF2FB50DC ^ n) - -976966522;
        }
        return bzw2_2.sdsh_4();
    }

    private static float zdth(byq byq2) {
        block0: {
            int n = -13950225;
            int n2 = (n = Integer.rotateLeft(n * 879475537, 20) ^ 0x7D917EBE) ^ 0xBFFEDB5B;
            if ((n2 ^ n) == -1073816741) break block0;
            int cfr_ignored_0 = (0x40D5F9B4 ^ n) + 1700772288;
        }
        return byq2.shsl_2();
    }

    private static String[] khghb(String string) {
        block0: {
            int n = -1759517977;
            n = Integer.rotateLeft(n * -589593861, 19) ^ 0x10463132;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
            int n2 = n ^ 0x1019E601;
            if ((n2 ^ n) == 270132737) break block0;
            int cfr_ignored_0 = (0x870604E6 ^ n) - -82180975;
        }
        return string.split("\u0005\u000e", -1);
    }

    private static CallSite dmj_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1977853583;
            n3 = Integer.rotateLeft(n3 * -109031283, 18) ^ 0x4FD1EB44;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 20);
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 15);
            int n4 = n3 ^ 0x6EE26DF3;
            if ((n4 ^ n3) != 1860333043) {
                int cfr_ignored_0 = (0x1B01CB7C ^ n3) + 1989455881;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ khsz ^ string.hashCode() ^ n2 + tjk + i * -1305567211) + khsz) ^ tjk));
            }
            String[] stringArray = qsh.khghb(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ghg2j4oh7m(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite iv82fyofs0g(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ slyby7fbq6 ^ string.hashCode()) + (n2 + l3h3k2woxp4j) + i ^ slyby7fbq6, 13) + l3h3k2woxp4j);
            }
            String[] stringArray = qsh.ghg2j4oh7m(new String(cArray));
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

