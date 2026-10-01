/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1429
 *  net.minecraft.class_1531
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Comparator;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1429;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.rs_2;
import us.m0vy.moondlc.m0vyguard.tm_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class byt
implements tthy {
    private boolean sjkh = false;
    private boolean thnt_2 = false;
    private boolean khad_4 = false;
    private boolean ththz_2 = false;
    private boolean stq = false;
    private boolean an = false;
    private boolean ys = false;
    private float jwz = Float.intBitsToFloat(0xF85F0248 ^ 0x47DF0248);
    private Comparator ym = rs_2.jja;
    private static final int rkhkh = 1239285130;
    private static final int srj = -2015584862;
    private static final int e54czqokij = 1318638449;
    private static final int hwzvevg3448ea = -509663524;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int f32uz5ijst0s8m;

    public boolean sdh_6(class_1297 class_12972) {
        try {
            int n = 1477230484;
            n = Integer.rotateLeft(n * -137398291, 25) ^ 0x2FB41C4D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2BC60202;
            if ((n2 ^ n) != 734396930) {
                int cfr_ignored_0 = (0x73CABD96 ^ n) - -468302701;
            }
            if ((0x1CF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!byt.rfs()) {
            yf.athz_2();
            throw null;
        }
        if (byt.mc.field_1724 == null || byt.mc.field_1687 == null || class_12972 == null) {
            return false;
        }
        if (class_12972 instanceof class_1309 && class_12972 != byt.mc.field_1724) {
            class_1309 class_13092;
            if (class_12972 instanceof class_1309 && byt.tsdh(class_13092 = (class_1309)class_12972)) {
                return false;
            }
            if (!this.zaz_7(class_12972)) {
                return false;
            }
            if (class_12972 instanceof class_1531) {
                return this.ys;
            }
            if (!this.ththz_2 && class_12972.method_5767()) {
                return false;
            }
            if (class_12972 instanceof class_1657) {
                class_1657 class_16572 = (class_1657)class_12972;
                boolean bl = byt.shzl_2(byt.swj_2(byt.m_2()), byt.dhrd(class_16572).getString());
                if (!this.an && bl) {
                    return false;
                }
                boolean bl2 = this.dhdy(class_16572);
                if (!this.sjkh && !this.stq) {
                    return false;
                }
                if (this.sjkh && this.stq) {
                    return true;
                }
                return this.stq ? bl2 : !bl2;
            }
            if (class_12972 instanceof class_1429) {
                return this.thnt_2;
            }
            return class_12972 instanceof class_1308 ? this.khad_4 : false;
        }
        return false;
    }

    public boolean zaz_7(class_1297 class_12972) {
        try {
            int n = -860614224;
            n = Integer.rotateLeft(n * 1992444489, 20) ^ 0x840692D3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x41358501;
            if ((n2 ^ n) != 1094026497) {
                int cfr_ignored_0 = (0x8D8194B1 ^ n) + 1473838645;
            }
            if ((0xF3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.sdkh_3() <= 0.0f ? true : class_12972.method_5739((class_1297)byt.mc.field_1724) <= this.sdkh_3();
    }

    private boolean dhdy(class_1657 class_16572) {
        int n = tm_2.dhzs_3(753799525);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x89495E56;
        if ((n2 ^ n) != -1991680426) {
            int cfr_ignored_0 = (Integer.rotateRight(0xA5A74F33 ^ n, 7) + 329266792) * -1515761869;
        }
        for (class_1799 class_17992 : class_16572.method_56674()) {
            if (class_17992 == null || byt.ssdh_2(class_17992)) continue;
            return false;
        }
        return true;
    }

    @Generated
    public boolean djz_4() {
        block0: {
            int n = 575187407;
            n = Integer.rotateLeft(n * 590801187, 18) ^ 0xEC2AB9D8;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB47FA49A;
            if ((n2 ^ n) == -1266703206) break block0;
            int cfr_ignored_0 = (0x96370D55 ^ n) - -701079988;
        }
        return this.sjkh;
    }

    @Generated
    public boolean dwr() {
        block0: {
            int n = -643586447;
            n = Integer.rotateLeft(n * -87410863, 9) ^ 0x8EC03182;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF1EAACCD;
            if ((n2 ^ n) == -236278579) break block0;
            int cfr_ignored_0 = (0x28490ABC ^ n) - -2126246892;
        }
        return this.thnt_2;
    }

    @Generated
    public boolean zrsh_2() {
        block0: {
            int n = tm_2.dhzs_3(-663916847);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDF5F8B49;
            if ((n2 ^ n) == -547386551) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x732E598 ^ n, 3) + -477664093) * 120776089;
        }
        return this.khad_4;
    }

    @Generated
    public boolean shlk() {
        return this.ththz_2;
    }

    @Generated
    public boolean aghn() {
        block0: {
            int n = 211214155;
            n = Integer.rotateLeft(n * 2070639983, 28) ^ 0xC066FBBF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x3D2B202E;
            if ((n2 ^ n) == 1026236462) break block0;
            int cfr_ignored_0 = (0x31BDFF65 ^ n) - -1701171870;
        }
        return this.stq;
    }

    @Generated
    public boolean zdha_3() {
        block0: {
            int n = 346007421;
            n = Integer.rotateLeft(n * 1105310361, 22) ^ 0x8AFBB88F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
            int n2 = n ^ 0x7AE2D6B0;
            if ((n2 ^ n) == 2061686448) break block0;
            int cfr_ignored_0 = (0x6E7D71CD ^ n) + 1031628485;
        }
        return this.an;
    }

    @Generated
    public boolean zkh_4() {
        block0: {
            int n = 929289710;
            n = Integer.rotateLeft(n * 1362939447, 22) ^ 0x536DF4BB;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0xEA947FB3;
            if ((n2 ^ n) == -359366733) break block0;
            int cfr_ignored_0 = (0xDDF7AA5D ^ n) - -929790185;
        }
        return this.ys;
    }

    @Generated
    public float sdkh_3() {
        block0: {
            int n = -1624175293;
            n = Integer.rotateLeft(n * -2005663151, 4) ^ 0x48A5ECA;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
            int n2 = n ^ 0xBC2A3C;
            if ((n2 ^ n) == 12331580) break block0;
            int cfr_ignored_0 = (0x9F8D277F ^ n) - 2005779394;
        }
        return this.jwz;
    }

    @Generated
    public Comparator hqa() {
        return this.ym;
    }

    private static boolean rfs() {
        block0: {
            int n = tm_2.dhzs_3(-1450504316);
            int n2 = n ^ 0x3DBCE43;
            if ((n2 ^ n) == 64736835) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xAA50C1C7 ^ n, 8) - -1541073324;
        }
        return yf.khdha_2();
    }

    private static boolean tsdh(class_1309 class_13092) {
        block0: {
            int n = 1070751267;
            int n2 = (n = Integer.rotateLeft(n * 733272119, 15) ^ 0x118D41DB) ^ 0x7FE647B;
            if ((n2 ^ n) == 134112379) break block0;
            int cfr_ignored_0 = (0x382C3A58 ^ n) + 1894873095;
        }
        return class_13092.method_29504();
    }

    private static Moondlc m_2() {
        block0: {
            int n = -2062723458;
            int n2 = (n = Integer.rotateLeft(n * -854405527, 12) ^ 0xC9349477) ^ 0x1D14CABE;
            if ((n2 ^ n) == 487901886) break block0;
            int cfr_ignored_0 = (0x98199CC0 ^ n) + -188114242;
        }
        return Moondlc.getInstance();
    }

    private static kh_3 swj_2(Moondlc moondlc) {
        block0: {
            int n = tm_2.dhzs_3(1892287770);
            int n2 = n ^ 0xF67424D4;
            if ((n2 ^ n) == -160160556) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x86BE21CE ^ n, 3) - 1432598317;
        }
        return moondlc.getFriendManager();
    }

    private static class_2561 dhrd(class_1657 class_16572) {
        block0: {
            int n = tm_2.dhzs_3(-1897755427);
            class_1657 class_16573 = class_16572;
            n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 26);
            int n2 = n ^ 0x1C0D2FDC;
            if ((n2 ^ n) == 470626268) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x92EFA301 ^ n, 5) + -815637414;
            int cfr_ignored_1 = (int)(0x505D0D3C27D4EB4FL ^ (long)n ^ 0xE708831A2DB90D6BL);
        }
        return class_16572.method_5477();
    }

    private static boolean shzl_2(kh_3 kh2, String string) {
        block0: {
            int n = tm_2.dhzs_3(-1592107967);
            kh_3 kh3 = kh2;
            n = (kh3 != null ? System.identityHashCode(kh3) : 0) ^ n;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x2BC0A1F6;
            if ((n2 ^ n) == 734044662) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8ADAFDB7 ^ n, 4) - -723363740) * -1965359689;
        }
        return kh2.adhj(string);
    }

    private static boolean ssdh_2(class_1799 class_17992) {
        block0: {
            int n = -2066565426;
            int n2 = (n = Integer.rotateLeft(n * 612806101, 26) ^ 0xD2AB6734) ^ 0xBE6B70DE;
            if ((n2 ^ n) == -1100255010) break block0;
            int cfr_ignored_0 = (0x3AB9C610 ^ n) + -323282964;
        }
        return class_17992.method_7960();
    }

    private static String[] dlb_2(String string) {
        int n = -1458721331;
        int n2 = (n = Integer.rotateLeft(n * 682129989, 11) ^ 0x2395706D) ^ 0xBCE47185;
        if ((n2 ^ n) != -1125879419) {
            int cfr_ignored_0 = (0x15E9DC48 ^ n) - 266316180;
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

    private static CallSite thgha(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1345975029;
            n3 = Integer.rotateLeft(n3 * -1780636427, 19) ^ 0xA0A1338;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 26);
            int n4 = n3 ^ 0xC3EC75EA;
            if ((n4 ^ n3) != -1007913494) {
                int cfr_ignored_0 = (0x93D5871F ^ n3) + -1972122199;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rkhkh ^ string.hashCode()) + (n2 + srj) + i ^ rkhkh, 13) + srj);
            }
            String[] stringArray = byt.dlb_2(new String(cArray));
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

    private static String[] g621gjhe3(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yqytqbb4azb2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ e54czqokij ^ string.hashCode()) + (n2 + hwzvevg3448ea) + i ^ e54czqokij, 22) + hwzvevg3448ea);
            }
            String[] stringArray = byt.g621gjhe3(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

