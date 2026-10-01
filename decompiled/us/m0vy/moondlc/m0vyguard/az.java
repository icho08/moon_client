/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_241
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_7833
 *  org.joml.Vector2i
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_241;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_7833;
import org.joml.Vector2i;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bjm;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bmb;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.sl;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.yf;

public class az
implements dl {
    private static final az sbl;
    private Vector2i rhm = null;
    private Vector2i thth_7 = null;
    private final bjz dtq_2 = new bjz();
    private final bjz shzh = new bjz();
    private static final int thhd_4 = -1463951799;
    private static final int sdh_8 = -1492585965;
    private static final int sr9dwa4n = -298617407;
    private static final int q3h457k2fv = -1722366942;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int gnrvgt2v;

    public void zwj(class_332 class_3322) {
        if (this.rhm != null) {
            this.thth_7 = this.rhm;
        }
        if (class_3322 == null) {
            return;
        }
        float f = bmb.ath_2().dhna();
        boolean bl = this.rhm == null;
        boolean bl2 = this.thth_7 == null;
        float f2 = !bl2 ? this.akd_2(this.thth_7) : this.akd_2(new Vector2i(0, 0));
        float f3 = 10.0f;
        float f4 = 3.0f;
        this.dtq_2.ddhdh();
        this.shzh.ddhdh();
        this.dtq_2.shd_6(f2 <= f4 ? 0.0 : (f2 >= f3 ? 1.0 : (double)((f2 - f4) / (f3 - f4))), 500L, tbm.hash_3);
        this.shzh.shd_6(bl ? 0.0 : 1.0, 500L, tbm.hash_3);
        if (this.dtq_2.khbk() < 0.1 || this.shzh.khbk() < 0.1) {
            return;
        }
        float f5 = (float)this.shzh.khbk();
        double d = this.dtq_2.khbk() * (double)f5;
        float f6 = (float)mc.method_22683().method_4486() / 2.0f;
        float f7 = (float)mc.method_22683().method_4502() / 6.0f;
        float f8 = bl ? 0.0f : (float)this.thth_7.x;
        float f9 = bl ? 0.0f : (float)this.thth_7.y;
        float f10 = this.sshn(new class_241(f8, f9)) - az.mc.field_1724.method_36454();
        float f11 = 12.0f * f;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f6, f7, 0.0f);
        class_3322.method_51448().method_22907(class_7833.field_40718.rotationDegrees(f10));
        class_3322.method_51448().method_46416(-f6, -f7, 0.0f);
        Color color = brb.zmn_2(bas_4.hmq((int)d), (int)(255.0 * d));
        byq byq2 = new byq(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        bjm.thmz().zssh_4(ghdh_3.of(class_3322), f6, f7 - f11 * 1.75f, 22.0f * f, byq2, true);
        class_3322.method_51448().method_22909();
        float f12 = f7 + f11 * (2.0f - f5);
        brz_2.thtkh_2.thsz_4(class_3322.method_51448(), String.format("%.1f", Float.valueOf(f2)) + "m", f6, f12, 8.0f * f, bas_4.khan((int)(255.0 * d)));
    }

    private float akd_2(Vector2i vector2i) {
        int n = -632740702;
        n = Integer.rotateLeft(n * 1353923189, 20) ^ 0x5A106E65;
        Vector2i vector2i2 = vector2i;
        n = (vector2i2 != null ? System.identityHashCode(vector2i2) : 0) ^ n;
        int n2 = n ^ 0x85B19D06;
        if ((n2 ^ n) != -2051957498) {
            int cfr_ignored_0 = (0x5FF8B9A4 ^ n) - -127886296;
        }
        double d = az.mc.field_1724.method_19538().field_1352 - (double)vector2i.x;
        double d2 = az.mc.field_1724.method_19538().field_1350 - (double)vector2i.y;
        return class_3532.method_15355((float)((float)(d * d + d2 * d2)));
    }

    private float sshn(class_241 class_2412) {
        try {
            int n = -1920214331;
            n = Integer.rotateLeft(n * -1775769413, 16) ^ 0xA72AB47B;
            class_241 class_2413 = class_2412;
            n = (class_2413 != null ? System.identityHashCode(class_2413) : 0) ^ n;
            int n2 = n ^ 0x95FE953C;
            if ((n2 ^ n) != -1778477764) {
                int cfr_ignored_0 = (0x18754FF9 ^ n) - -202829400;
            }
            if ((0x27D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!az.zls_2()) {
            yf.athz_2();
        }
        if (az.mc.field_1724 == null) {
            return 0.0f;
        }
        double d = (double)class_2412.field_1343 - az.mc.field_1724.method_19538().field_1352;
        double d2 = (double)class_2412.field_1342 - az.mc.field_1724.method_19538().field_1350;
        return (float)(-az.szd_4(Math.atan2(d, d2)));
    }

    @Generated
    public Vector2i thsht_2() {
        block0: {
            int n = 1686567516;
            n = Integer.rotateLeft(n * -404147751, 27) ^ 0x46957C31;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xCF7D8D9B;
            if ((n2 ^ n) == -813855333) break block0;
            int cfr_ignored_0 = (0xABFB77C7 ^ n) - 1857697593;
        }
        return this.rhm;
    }

    @Generated
    public Vector2i ztz_2() {
        block0: {
            int n = 221173734;
            n = Integer.rotateLeft(n * -1957644101, 17) ^ 0x44F35ED3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x78553CEF;
            if ((n2 ^ n) == 2018852079) break block0;
            int cfr_ignored_0 = (0x757BEB09 ^ n) - 1295732066;
        }
        return this.thth_7;
    }

    @Generated
    public bjz dbl_2() {
        block0: {
            int n = 2122963748;
            n = Integer.rotateLeft(n * 700081251, 4) ^ 0x1CCEFF54;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC3B6264F;
            if ((n2 ^ n) == -1011472817) break block0;
            int cfr_ignored_0 = (0xBD3FFD6B ^ n) - 20114722;
        }
        return this.dtq_2;
    }

    @Generated
    public bjz khdm() {
        block0: {
            int n = sl.shshy(197204947);
            int n2 = n ^ 0x4C0A37EB;
            if ((n2 ^ n) == 1275738091) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x47CB2C38 ^ n, 11) + -1242039805) * 1204497465;
        }
        return this.shzh;
    }

    @Generated
    public void dhkhw(Vector2i vector2i) {
        int n = 2071206146;
        n = Integer.rotateLeft(n * -100557, 25) ^ 0x30DCA2AC;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0x85092B5;
        if ((n2 ^ n) != 139498165) {
            int cfr_ignored_0 = (0x73248BB7 ^ n) + -443611965;
        }
        this.rhm = vector2i;
    }

    @Generated
    public void rkf(Vector2i vector2i) {
        int n = sl.shshy(2116340289);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
        Vector2i vector2i2 = vector2i;
        n = Integer.rotateRight((vector2i2 != null ? System.identityHashCode(vector2i2) : 0) ^ n, 18);
        int n2 = n ^ 0x7EC75BF8;
        if ((n2 ^ n) != 2126994424) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xE391B9 ^ n, 3) + 535577762) * 14913977;
            int cfr_ignored_1 = (int)(0xC2513F8427D4EB4FL ^ (long)n ^ 0x8278831A2DB82973L);
        }
        this.thth_7 = vector2i;
    }

    @Generated
    public static az thdhh_2() {
        block0: {
            int n = 867649445;
            int n2 = (n = Integer.rotateLeft(n * -1506713479, 8) ^ 0x53D022F) ^ 0x25916513;
            if ((n2 ^ n) == 630285587) break block0;
            int cfr_ignored_0 = (0x162622B6 ^ n) - 1941580565;
        }
        return sbl;
    }

    private static boolean zls_2() {
        block0: {
            int n = sl.shshy(1104043867);
            int n2 = n ^ 0x219A9416;
            if ((n2 ^ n) == 563778582) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6054CB4D ^ n, 15) - -1365099122;
            int cfr_ignored_1 = (int)(0xA2E6657027D4EB4FL ^ (long)n ^ 0x3790831A2DB8E81DL);
        }
        return yf.khdha_2();
    }

    private static double szd_4(double d) {
        block0: {
            int n = sl.shshy(0x5F3F3555);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x9BE04D87;
            if ((n2 ^ n) == -1679798905) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xC4DF78D2 ^ n, 11) + -613597015) * -991987501;
        }
        return Math.toDegrees(d);
    }

    private static String[] srkh(String string) {
        int n = 1261372721;
        int n2 = (n = Integer.rotateLeft(n * 350748673, 4) ^ 0x8F56B910) ^ 0xF05AACD;
        if ((n2 ^ n) != 252029645) {
            int cfr_ignored_0 = (0x442AAFFC ^ n) + -862954399;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite zds(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1733311337;
            n3 = Integer.rotateLeft(n3 * 2025022157, 8) ^ 0x5F4A0A32;
            n3 = n2 ^ n3;
            int n4 = n3 ^ 0x93BB3A18;
            if ((n4 ^ n3) != -1816446440) {
                int cfr_ignored_0 = (0xB14FE8F ^ n3) - -2129671078;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ thhd_4 ^ string.hashCode() ^ n2 + sdh_8 ^ i * -1537180777 ^ thhd_4, 18) ^ sdh_8));
            }
            String[] stringArray = az.srkh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rltvbkcf8t2ny(String string) {
        return string.split("\u0002\u0016", -1);
    }

    private static CallSite a2mu52jio(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ sr9dwa4n ^ string.hashCode()) + (n2 + q3h457k2fv) + i ^ sr9dwa4n, 8) + q3h457k2fv);
            }
            String[] stringArray = az.rltvbkcf8t2ny(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

