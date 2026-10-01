/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1313
 *  net.minecraft.class_1799
 *  net.minecraft.class_1890
 *  net.minecraft.class_243
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1313;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_243;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bjt_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.nb;

@tq_2(name="TridentBoost", category=bzw.OTHER, desc="Boosts riptide trident movement")
public class ghk
extends bnq {
    private final khd khkh_3 = new khd(this, "Mode");
    private final fy tbh_2 = new fy(this.khkh_3, "Motion");
    private final fy khfy = new fy(this.khkh_3, "Factor");
    private final fy rdth_2 = new fy(this.khkh_3, "None");
    private final tay shwa_2 = new tay(this, "Factor").shth_7(Float.intBitsToFloat(-282325666 - -1319157615)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x92218DE0 ^ 0x82498DE0, 2))).rkh_3(Float.intBitsToFloat(Integer.reverse(-240280923) ^ 0x98957942)).ssd_5(1.0f);
    private final tay hs_4 = new tay(this, "Cooldown").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(428305573) ^ 0xE496E198)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xFD58AD4D ^ 0xFD588DDD, 17)));
    private final badh_2 khkhw = new badh_2(this, "AnyWeather").bts(true);
    private static ghk jkl;
    private final bql<nb> sdh_5 = this::shs;
    private static final int sbh_3 = -1181118838;
    private static final int dhhm = 393582519;
    private static final int hz_3 = 1946174683;
    private static final int sah = -273545820;
    private static final int uavfp24pgsx = 1762084256;
    private static final int mhu8uogri2h = 415912872;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int frcii4bkhojf;

    public static ghk ghdht() {
        block0: {
            int n = -2088097293;
            int n2 = (n = Integer.rotateLeft(n * 1839148981, 18) ^ 0xADDD85C6) ^ 0x8AB8FD91;
            if ((n2 ^ n) == -1967587951) break block0;
            int cfr_ignored_0 = (0x932D462 ^ n) - 199398570;
        }
        return jkl;
    }

    public ghk() {
        jkl = this;
    }

    public boolean slsh() {
        block0: {
            int n = bjt_2.dthm(-36546519);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x695EF61C;
            if ((n2 ^ n) == 1767831068) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x948CAE35 ^ n, 5) - 23508902) * -1802719691;
            int cfr_ignored_1 = (int)(0x563E000827D4EB4FL ^ (long)n ^ 0xFD60831A2DB901ADL);
        }
        return this.khkhw.shzl();
    }

    private void shs(nb nb2) {
        int n = 1709881189;
        n = Integer.rotateLeft(n * 570346079, 5) ^ 0x9F041127;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        nb nb3 = nb2;
        n = (nb3 != null ? System.identityHashCode(nb3) : 0) ^ n;
        int n2 = n ^ 0x898860D0;
        if ((n2 ^ n) != -1987551024) {
            int cfr_ignored_0 = (0xEC62D7B5 ^ n) + 2090797825;
        }
        if (ghk.mc.field_1724 == null || ghk.mc.field_1687 == null) {
            return;
        }
        if ((float)ghk.mc.field_1724.method_6048() >= this.hs_4.thw_5()) {
            boolean bl;
            float f = class_1890.method_60123((class_1799)ghk.mc.field_1724.method_6030(), (class_1309)ghk.mc.field_1724);
            boolean bl2 = bl = this.khkhw.shzl() || ghk.mc.field_1724.method_5721() || this.rdth_2.shghkh();
            if (bl && f > 0.0f) {
                float f2 = ghk.mc.field_1724.method_36454();
                float f3 = ghk.mc.field_1724.method_36455();
                float f4 = -class_3532.method_15374((float)(f2 * Float.intBitsToFloat(Integer.rotateLeft(0xC211DCB3 ^ 0xAFE7FE0, 28)))) * class_3532.method_15362((float)(f3 * Float.intBitsToFloat(-1480746967 - 1798217204)));
                float f5 = -class_3532.method_15374((float)(f3 * Float.intBitsToFloat(0x760A2053 ^ 0x4A84DA66)));
                float f6 = class_3532.method_15362((float)(f2 * Float.intBitsToFloat(-587406613 + 1603409738))) * class_3532.method_15362((float)(f3 * Float.intBitsToFloat(-1562071688 + -1716892483)));
                float f7 = class_3532.method_15355((float)(f4 * f4 + f5 * f5 + f6 * f6));
                float f8 = this.khfy.shghkh() ? this.shwa_2.thw_5() * Float.intBitsToFloat(1266963201 - 189027073) * ((1.0f + f) / Float.intBitsToFloat(0xACD7AA7C ^ 0xEC57AA7C)) : (this.tbh_2.shghkh() ? this.shwa_2.thw_5() : Float.intBitsToFloat(-1024802716 - -2102738844));
                ghk.mc.field_1724.method_5762((double)(f4 *= f8 / f7), (double)(f5 *= f8 / f7), (double)(f6 *= f8 / f7));
                ghk.mc.field_1724.method_40126(Integer.rotateLeft(0x5E69AF6C ^ 0x5E69AFCC, 29), Float.intBitsToFloat(1001852285 + 88666755), ghk.mc.field_1724.method_6030());
                if (ghk.mc.field_1724.method_24828()) {
                    ghk.mc.field_1724.method_5784(class_1313.field_6308, new class_243(0.0, Double.longBitsToDouble(0x31725C776C8259EFL ^ 0xE816F444C8259EFL), 0.0));
                }
                ghk.mc.field_1687.method_43129(null, (class_1297)ghk.mc.field_1724, (class_3414)class_3417.field_14606.comp_349(), class_3419.field_15248, 1.0f, 1.0f);
            }
        }
        nb2.dhtd_2();
    }

    private static String gham(String string, int n, int n2, int n3) {
        int n4 = 2097397452;
        n4 = Integer.rotateLeft(n4 * 1398576657, 26) ^ 0x50AAEA7E;
        int n5 = (n4 = n2 ^ n4) ^ 0xEA386BBB;
        if ((n5 ^ n4) != -365401157) {
            int cfr_ignored_0 = (0x973BD577 ^ n4) + 2009480526;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x4861754B) + sbh_3 ^ Integer.reverse(n2 + i * -812519569), 28) - dhhm);
        }
        return new String(cArray);
    }

    private static String[] shbq(String string) {
        int n = bjt_2.dthm(1300766264);
        int n2 = n ^ 0x5D14F0C7;
        if ((n2 ^ n) != 1561653447) {
            int cfr_ignored_0 = (Integer.rotateRight(0x109CEEFF ^ n, 5) - 123637788) * 278720255;
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

    private static CallSite tzs_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1996562723;
            n3 = Integer.rotateLeft(n3 * 125551873, 5) ^ 0x1645D296;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 26);
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xA3529932;
            if ((n4 ^ n3) != -1554867918) {
                int cfr_ignored_0 = (0xD453B811 ^ n3) + -557976567;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ hz_3 ^ string.hashCode() ^ n2 + sah ^ i * -908439951 ^ hz_3, 16) ^ sah));
            }
            String[] stringArray = ghk.shbq(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] zstg01ref(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite iwwjd5v5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ uavfp24pgsx ^ string.hashCode()) + (n2 + mhu8uogri2h) + i ^ uavfp24pgsx, 11) + mhu8uogri2h);
            }
            String[] stringArray = ghk.zstg01ref(new String(cArray));
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

