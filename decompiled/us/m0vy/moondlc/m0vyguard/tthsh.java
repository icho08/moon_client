/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10055
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1921
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3883
 *  net.minecraft.class_3887
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_591
 *  net.minecraft.class_7833
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10055;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3883;
import net.minecraft.class_3887;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_591;
import net.minecraft.class_7833;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bhj;
import us.m0vy.moondlc.m0vyguard.bkhs;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class tthsh
extends class_3887 {
    private static final int jza = 1752839767;
    private static final int hzr = -1144100278;
    private static final int vv0rfen6ni0 = -942796507;
    private static final int njlw0xb3qw = -1601749306;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int lugiabq3w;

    public tthsh(class_3883 class_38832) {
        super(class_38832);
    }

    public void render(class_4587 class_45872, class_4597 class_45972, int n, class_10055 class_100552, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        class_1657 class_16572;
        bkhs bkhs2 = bkhs.thyn();
        if (bkhs2 == null || !bkhs2.rgha_2()) {
            return;
        }
        if (!bkhs2.zjm.skhth(bkhs2.hqw)) {
            return;
        }
        if (!this.shouldRender(bkhs2, class_100552)) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        class_591 class_5912 = (class_591)this.method_17165();
        class_45872.method_22903();
        class_5912.field_3398.method_22703(class_45872);
        class_1297 class_12972 = class_3102.field_1687 != null ? class_3102.field_1687.method_8469(class_100552.field_53528) : null;
        boolean bl = class_12972 instanceof class_1657 && !(class_16572 = (class_1657)class_12972).method_31548().method_5438(39).method_7960();
        float f7 = bl ? 0.48f : 0.45f;
        class_45872.method_46416(0.0f, -f7, 0.0f);
        class_45872.method_22907(class_7833.field_40717.rotationDegrees(180.0f));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(90.0f));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_4588 class_45882 = class_45972.getBuffer(class_1921.method_49042());
        long l = System.currentTimeMillis();
        int n2 = bkhs2.rkq.sdsh_4().rk();
        int n3 = bkhs2.dhta.sdsh_4().rk();
        float f8 = bkhs2.zdha.thw_5();
        float f9 = bkhs2.hyk.thw_5();
        int n4 = tthsh.withAlpha(n2, f9);
        int n5 = tthsh.withAlpha(n3, f9);
        double d = class_100552.field_53329 * f8;
        if (d <= 0.01) {
            d = 0.6 * (double)f8;
        }
        for (int i = 0; i < 360; ++i) {
            f6 = (float)i * 0.06981317f;
            f5 = (float)(i + 1) * 0.06981317f;
            int n6 = i * 8;
            int n7 = tthsh.getGradientColor(3, n6, n4, n5, l);
            f4 = class_3532.method_15374((float)f6) * (float)d;
            float f10 = class_3532.method_15362((float)f6) * (float)d;
            f3 = class_3532.method_15374((float)f5) * (float)d;
            float f11 = class_3532.method_15362((float)f5) * (float)d;
            tthsh.addVertex(class_45882, matrix4f, f4, 0.0f, f10, n7);
            tthsh.addVertex(class_45882, matrix4f, f3, 0.0f, f11, n7);
            tthsh.addVertex(class_45882, matrix4f, 0.0f, 0.3f * f8, 0.0f, n4);
            tthsh.addVertex(class_45882, matrix4f, 0.0f, 0.3f * f8, 0.0f, n4);
        }
        float f12 = (float)d + 0.01f * f8;
        f6 = (float)d - 0.01f * f8;
        f5 = class_3532.method_15374((float)0.0f) * f12;
        float f13 = class_3532.method_15362((float)0.0f) * f12;
        float f14 = class_3532.method_15374((float)0.0f) * f6;
        f4 = class_3532.method_15362((float)0.0f) * f6;
        for (int i = 1; i <= 180; ++i) {
            f3 = (float)i * 0.06981317f;
            int n8 = (i - 1) * 8;
            int n9 = tthsh.getGradientColor(3, n8, n4, n5, l);
            float f15 = class_3532.method_15374((float)f3) * f12;
            float f16 = class_3532.method_15362((float)f3) * f12;
            float f17 = class_3532.method_15374((float)f3) * f6;
            float f18 = class_3532.method_15362((float)f3) * f6;
            tthsh.addVertex(class_45882, matrix4f, f5, -0.01f * f8, f13, n9);
            tthsh.addVertex(class_45882, matrix4f, f5, 0.0f, f13, n9);
            tthsh.addVertex(class_45882, matrix4f, f15, 0.0f, f16, n9);
            tthsh.addVertex(class_45882, matrix4f, f15, -0.01f * f8, f16, n9);
            tthsh.addVertex(class_45882, matrix4f, f14, 0.0f, f4, n9);
            tthsh.addVertex(class_45882, matrix4f, f17, 0.0f, f18, n9);
            tthsh.addVertex(class_45882, matrix4f, f15, 0.0f, f16, n9);
            tthsh.addVertex(class_45882, matrix4f, f5, 0.0f, f13, n9);
            f5 = f15;
            f13 = f16;
            f14 = f17;
            f4 = f18;
        }
        class_45872.method_22909();
    }

    private boolean shouldRender(bkhs bkhs2, class_10055 class_100552) {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return false;
        }
        if (class_100552.field_53528 == class_3102.field_1724.method_5628()) {
            return bkhs2.zdhn.shzl() && !class_3102.field_1690.method_31044().method_31034();
        }
        class_1297 class_12972 = class_3102.field_1687.method_8469(class_100552.field_53528);
        if (class_12972 == null) {
            return false;
        }
        boolean bl = Moondlc.getInstance().getFriendManager().adhj(class_12972.method_5477().getString());
        return bl ? bkhs2.jhf.shzl() : bkhs2.tsa_3.shzl();
    }

    private static int getGradientColor(int n, int n2, int n3, int n4, long l) {
        int n5 = 1812052526;
        n5 = Integer.rotateLeft(n5 * -118258567, 3) ^ 0x63E59B3A;
        n5 = Integer.rotateRight(n3 ^ n5, 23);
        int n6 = (n5 = Integer.rotateLeft((int)l ^ n5, 27)) ^ 0x405C55D1;
        if ((n6 ^ n5) != 1079793105) {
            int cfr_ignored_0 = (0x2C5DEFFF ^ n5) + 183354296;
        }
        float f = ((long)n2 + l / (0xD258FE41D2A53269L ^ 0xD258FE41D2A53263L)) % (0xC30B6BD90F43BE0FL ^ 0xC30B6BD90F43BF67L);
        float f2 = f / Float.intBitsToFloat(598384951 - -537485001);
        float f3 = (float)((Math.sin((double)f2 * tthsh.v1knt8zd0mj(0x925E82A7ADA2AF9EL ^ 0xD257A35CF9E68286L) * Double.longBitsToDouble(0xCED71838175F820BL ^ 0x8ED71838175F820BL) * (double)n) + 1.0) / Double.longBitsToDouble(0x5F3FC2EA365CB5E4L ^ 0x1F3FC2EA365CB5E4L));
        return tthsh.blendColors(n3, n4, f3);
    }

    private static int blendColors(int n, int n2, float f) {
        int n3 = -2058301058;
        n3 = Integer.rotateLeft(n3 * -1759760251, 8) ^ 0x65E45035;
        int n4 = (n3 = Integer.rotateRight(n ^ n3, 28)) ^ 0xD2257559;
        if ((n4 ^ n3) != -769297063) {
            int cfr_ignored_0 = (0x5775A427 ^ n3) - -798505817;
        }
        int n5 = n >> 510693189 + -510693165 & 2012469252 - 2012468997;
        int n6 = n >> Integer.rotateLeft(0x88B5F3F0 ^ 0x88F5F3F0, 14) & Integer.rotateLeft(0x6B967ED6 ^ 0x14167ED6, 9);
        int n7 = n >> (Integer.reverse(776331741) ^ 0xBB87A27C) & (tthsh.zb1yvv9f7(509502063) ^ 0xF6467A87);
        int n8 = n & -1813357509 - -1813357764;
        int n9 = n2 >> (0xE9280D7C ^ 0xE9280D64) & Integer.rotateLeft(0x5B58639 ^ 0x58A4639, 18);
        int n10 = n2 >> Integer.rotateLeft(0x1C6C62C6 ^ 0x9C6C62C6, 5) & 1601527008 - 1601526753;
        int n11 = n2 >> Integer.rotateLeft(0x16705B5F ^ 0x16705B5E, 3) & Integer.rotateLeft(0x3CE2933E ^ 0x3F1E933E, 14);
        int n12 = n2 & 1852991921 + -1852991666;
        int n13 = (int)((float)n5 + (float)(n9 - n5) * f);
        int n14 = (int)((float)n6 + (float)(n10 - n6) * f);
        int n15 = (int)((float)n7 + (float)(n11 - n7) * f);
        int n16 = (int)((float)n8 + (float)(n12 - n8) * f);
        return n13 << -1226005830 - -1226005854 | n14 << (Integer.reverse(-834646576) ^ 0xBB20263) | n15 << 2143749065 - 2143749057 | n16;
    }

    private static int withAlpha(int n, float f) {
        int n2 = bhj.dsht(-588784000);
        int n3 = (n2 = n ^ n2) ^ 0x776EEBF3;
        if ((n3 ^ n2) != 2003758067) {
            int cfr_ignored_0 = (Integer.rotateRight(0xAB893573 ^ n2, 8) + -906291160) * -1417071245;
        }
        int n4 = class_3532.method_15340((int)tthsh.fvhji901yit((float)(n >>> -1049797641 + 1049797665 & (tthsh.eykdfcqaqybq0z(837638372) ^ 0x271AB773)) * class_3532.method_15363((float)f, (float)0.0f, (float)1.0f)), (int)0, (int)(-8261638 - -8261893));
        return n4 << -624235545 - -624235569 | n & -1294659698 - -1311436913;
    }

    private static void addVertex(class_4588 class_45882, Matrix4f matrix4f, float f, float f2, float f3, int n) {
        try {
            int n2 = -64573785;
            n2 = Integer.rotateLeft(n2 * -2053900427, 25) ^ 0x372D5FC6;
            n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 8);
            n2 = Float.floatToIntBits(f3) ^ n2;
            int n3 = n2 ^ 0xFD2D218B;
            if ((n3 ^ n2) != -47373941) {
                int cfr_ignored_0 = (0x10B8F2C ^ n2) - -1241105772;
            }
            if ((0x9E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        int n4 = n >> -955046906 - -955046922 & 433257075 - 433256820;
        int n5 = n >> (0xD2480D26 ^ 0xD2480D2E) & 1780265038 - 1780264783;
        int n6 = n & (0xD6233C67 ^ 0xD6233C98);
        int n7 = n >> Integer.rotateLeft(0x662B0400 ^ 0x67AB0400, 12) & (0x50A8A0CD ^ 0x50A8A032);
        class_45882.method_22918(matrix4f, f, f2, f3).method_1336(n4, n5, n6, n7);
    }

    private static double v1knt8zd0mj(long l) {
        block0: {
            int n = -1501641249;
            n = Integer.rotateLeft(n * -476993269, 7) ^ 0xFE29FF8D;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 27)) ^ 0x69A5AD91;
            if ((n2 ^ n) == 1772465553) break block0;
            int cfr_ignored_0 = (0xCFDB684E ^ n) + -1814241030;
        }
        return Double.longBitsToDouble(l);
    }

    private static int zb1yvv9f7(int n) {
        block0: {
            int n2 = -640603358;
            n2 = Integer.rotateLeft(n2 * 175963061, 21) ^ 0xC5F2EF10;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 20)) ^ 0x3279B651;
            if ((n3 ^ n2) == 846837329) break block0;
            int cfr_ignored_0 = (0xEBA89D73 ^ n2) - -122168605;
        }
        return Integer.reverse(n);
    }

    private static int eykdfcqaqybq0z(int n) {
        block0: {
            int n2 = bhj.dsht(907214817);
            int n3 = (n2 = n ^ n2) ^ 0x7A065DD;
            if ((n3 ^ n2) == 127952349) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x31B29A3C ^ n2, 9) - 150883455) * 833788477;
        }
        return Integer.reverse(n);
    }

    private static int fvhji901yit(float f) {
        block0: {
            int n = 408913608;
            n = Integer.rotateLeft(n * -456759339, 8) ^ 0xC872B7EE;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x3B171FC3;
            if ((n2 ^ n) == 991371203) break block0;
            int cfr_ignored_0 = (0x2348990B ^ n) - -715426545;
        }
        return Math.round(f);
    }

    private static String[] eyp40qcsh(String string) {
        int n = bhj.dsht(1933516956);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
        int n2 = n ^ 0xA9A62A0A;
        if ((n2 ^ n) != -1448728054) {
            int cfr_ignored_0 = (Integer.rotateRight(0xDA990A96 ^ n, 14) - 2095441765) * -627504489;
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

    private static CallSite n31wbmxmmdn2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1302019719;
            n3 = Integer.rotateLeft(n3 * -1241284569, 20) ^ 0x5B85CB08;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 13);
            int n4 = n3 ^ 0xCFF478E3;
            if ((n4 ^ n3) != -806061853) {
                int cfr_ignored_0 = (0x826F4664 ^ n3) + 1986300327;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jza ^ string.hashCode()) + (n2 + hzr) + i ^ jza, 12) + hzr);
            }
            String[] stringArray = tthsh.eyp40qcsh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rxunnvoes(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite uehst2kr8sqamk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ vv0rfen6ni0 ^ string.hashCode() ^ n2 + njlw0xb3qw ^ i * -344041013 ^ vv0rfen6ni0, 11) ^ njlw0xb3qw));
            }
            String[] stringArray = tthsh.rxunnvoes(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

