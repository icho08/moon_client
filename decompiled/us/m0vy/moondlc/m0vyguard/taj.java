/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.tkhk;
import us.m0vy.moondlc.m0vyguard.khy;
import us.m0vy.moondlc.m0vyguard.kq;
import us.m0vy.moondlc.m0vyguard.yf;

public class taj {
    private float khzdh_2;
    private float wb;
    public static final taj dlq;
    private static final int khlz_2 = 1927709767;
    private static final int sjw = 153648982;
    private static final int emu7wd23ba02 = -471904410;
    private static final int aonq7gvz8 = 18622553;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ilqk475ty;

    public taj(float f, float f2) {
        this.khzdh_2 = f;
        this.wb = f2;
    }

    public taj jhm_2() {
        int n = -1614318044;
        n = Integer.rotateLeft(n * 1014471775, 18) ^ 0x259A9F9D;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA5500DA;
        if ((n2 ^ n) != 173342938) {
            int cfr_ignored_0 = (0x959276FE ^ n) - -1411309293;
        }
        double d = baf.tssh_3();
        taj taj2 = taj.tjkh().jty();
        float f = taj.thqt(this, this.khzdh_2, taj2.khzdh_2, d);
        float f2 = this.ryk(this.wb, taj2.wb, d);
        return new taj(f, class_3532.method_15363((float)f2, (float)Float.intBitsToFloat(Integer.rotateLeft(0x58594A2E ^ 0x5838102E, 9)), (float)Float.intBitsToFloat(Integer.rotateLeft(0x3B29D905 ^ 0x393C7905, 5))));
    }

    private float ryk(float f, float f2, double d) {
        try {
            int n = 495765034;
            n = Integer.rotateLeft(n * 1784607987, 9) ^ 0x24D684F2;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x9A37683D;
            if ((n2 ^ n) != -1707644867) {
                int cfr_ignored_0 = (0x87BBAE17 ^ n) - -1918853448;
            }
            if ((0x38A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        float f3 = f - f2;
        return f2 + (float)Math.round((double)f3 / d) * (float)d;
    }

    public class_243 rrj() {
        try {
            int n = -1507293169;
            n = Integer.rotateLeft(n * -1715246187, 3) ^ 0xFF99D1A9;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0xB5B24D83;
            if ((n2 ^ n) != -1246605949) {
                int cfr_ignored_0 = (0x139AC58C ^ n) - 448180314;
            }
            if ((0x375 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        float f = this.wb * Float.intBitsToFloat(0x3CB80BBF ^ 0x36F18A);
        float f2 = -this.khzdh_2 * Float.intBitsToFloat(0xAC0F4661 ^ 0x9081BC54);
        float f3 = class_3532.method_15362((float)f2);
        float f4 = taj.nh(f2);
        float f5 = class_3532.method_15362((float)f);
        float f6 = taj.tdhl(f);
        return new class_243((double)(f4 * f5), (double)(-f6), (double)(f3 * f5));
    }

    public taj kt_2(taj taj2) {
        block0: {
            int n = -236178676;
            n = Integer.rotateLeft(n * 1635501697, 22) ^ 0x1A4000FB;
            n = System.identityHashCode(this) ^ n;
            taj taj3 = taj2;
            n = (taj3 != null ? System.identityHashCode(taj3) : 0) ^ n;
            int n2 = n ^ 0x6D49073F;
            if ((n2 ^ n) == 1833502527) break block0;
            int cfr_ignored_0 = (0x9CA53433 ^ n) - 321221931;
        }
        return taj.khhs_4(this, taj2);
    }

    public String jkhsh() {
        block0: {
            int n = 985509927;
            int n2 = (n = Integer.rotateLeft(n * 999678349, 7) ^ 0xE5513479) ^ 0x68F1B8E6;
            if ((n2 ^ n) == 1760671974) break block0;
            int cfr_ignored_0 = (0x524C08C1 ^ n) + -753195326;
        }
        return "Rotation(yaw=" + this.khzdh_2 + ", pitch=" + this.wb + ")";
    }

    @Generated
    public float dda_3() {
        block0: {
            int n = 999317840;
            n = Integer.rotateLeft(n * -245328577, 19) ^ 0xBE1BF227;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7366D114;
            if ((n2 ^ n) == 1936118036) break block0;
            int cfr_ignored_0 = (0x48F6B044 ^ n) + 368202833;
        }
        return this.khzdh_2;
    }

    @Generated
    public float shyq() {
        block0: {
            int n = khy.dhkhkh(-402144165);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD64C7AEF;
            if ((n2 ^ n) == -699630865) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x3E4BBEB4 ^ n, 10) - -1886800121) * 1045151413;
        }
        return this.wb;
    }

    @Generated
    public void shbkh(float f) {
        int n = khy.dhkhkh(1549486995);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 7);
        int n2 = n ^ 0xA2B3D42D;
        if ((n2 ^ n) != -1565273043) {
            int cfr_ignored_0 = (Integer.rotateRight(0xFEE89FBE ^ n, 18) - -494340291) * -18309185;
        }
        this.khzdh_2 = f;
    }

    @Generated
    public void jhz_3(float f) {
        int n = -546342359;
        n = Integer.rotateLeft(n * -2141468833, 18) ^ 0x37A6F584;
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x608D3057;
        if ((n2 ^ n) != 1619865687) {
            int cfr_ignored_0 = (0xBFE24A7E ^ n) + 1418685786;
        }
        this.wb = f;
    }

    private static kq tjkh() {
        block0: {
            int n = 890362890;
            int n2 = (n = Integer.rotateLeft(n * 1154822227, 19) ^ 0xF1DFB974) ^ 0x4A146CD3;
            if ((n2 ^ n) == 1242852563) break block0;
            int cfr_ignored_0 = (0x7F05B0D9 ^ n) - 417564162;
        }
        return kq.thzt_2();
    }

    private static float thqt(taj taj2, float f, float f2, double d) {
        block0: {
            int n = -700436660;
            n = Integer.rotateLeft(n * 1889592921, 22) ^ 0x20E65758;
            n = Integer.rotateRight(Float.floatToIntBits(f2) ^ n, 16);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xBED75BEE;
            if ((n2 ^ n) == -1093182482) break block0;
            int cfr_ignored_0 = (0x689774A2 ^ n) + 1957654398;
        }
        return taj2.ryk(f, f2, d);
    }

    private static float nh(float f) {
        block0: {
            int n = khy.dhkhkh(-1496769846);
            int n2 = n ^ 0x6916E5BB;
            if ((n2 ^ n) == 1763108283) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCFDFFF71 ^ n, 12) + 813534698) * -807403663;
            int cfr_ignored_1 = (int)(0xD6D514C27D4EB4FL ^ (long)n ^ 0x5FE8831A2DB9B70BL);
        }
        return class_3532.method_15374((float)f);
    }

    private static float tdhl(float f) {
        block0: {
            int n = -1250968101;
            n = Integer.rotateLeft(n * -955958519, 17) ^ 0x60B45F78;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x5F55429D;
            if ((n2 ^ n) == 1599423133) break block0;
            int cfr_ignored_0 = (0xEA3AFF46 ^ n) + 9807348;
        }
        return class_3532.method_15374((float)f);
    }

    private static taj khhs_4(taj taj2, taj taj3) {
        block0: {
            int n = -1536624804;
            int n2 = (n = Integer.rotateLeft(n * 1532471107, 17) ^ 0x2C0A985B) ^ 0x639ED954;
            if ((n2 ^ n) == 1671354708) break block0;
            int cfr_ignored_0 = (0xC7F62E08 ^ n) + -2011922720;
        }
        return tkhk.baa(taj2, taj3);
    }

    private static String[] tlz_3(String string) {
        block0: {
            int n = -940321444;
            n = Integer.rotateLeft(n * 1872637637, 11) ^ 0x644E34E3;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x5190F8B0;
            if ((n2 ^ n) == 1368455344) break block0;
            int cfr_ignored_0 = (0x96632DEC ^ n) + -1834194428;
        }
        return string.split("\u0007\u0013", -1);
    }

    private static CallSite amd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 600934572;
            n3 = Integer.rotateLeft(n3 * -434523485, 19) ^ 0xDE87D9CD;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 6);
            int n4 = n3 ^ 0x3A0D2D4D;
            if ((n4 ^ n3) != 973942093) {
                int cfr_ignored_0 = (0x19DCA5E1 ^ n3) - -103389495;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ khlz_2 ^ string.hashCode()) + (n2 + sjw) + i ^ khlz_2, 7) + sjw);
            }
            String[] stringArray = taj.tlz_3(new String(cArray));
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

    private static String[] d4zaadtli(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite mcqrnglb9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ emu7wd23ba02 ^ string.hashCode() ^ n2 + aonq7gvz8 + i * 1252436239) + emu7wd23ba02) ^ aonq7gvz8));
            }
            String[] stringArray = taj.d4zaadtli(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

