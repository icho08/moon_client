/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bzz_4;

public final class tjr
implements Serializable {
    private static final long bsa_3 = 1L;
    private final float shdhr;
    private final float kh;
    private final double khkhh;
    private final long shwj;
    private final boolean dfn;
    private final double shdhf;
    private final String khhsh;
    private static final int dhkhj = -282973863;
    private static final int shhq_2 = -1777640572;
    private static final int kbzt2k4 = -450869657;
    private static final int y2bzpcg = -702502110;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yy6l5dn3hv2uqo;

    public tjr(float f, float f2, double d, boolean bl, double d2, String string) {
        this.shdhr = f;
        this.kh = f2;
        this.khkhh = d;
        this.shwj = System.currentTimeMillis();
        this.dfn = bl;
        this.shdhf = d2;
        this.khhsh = string;
    }

    public float getYaw() {
        block0: {
            int n = bzz_4.tmdh_2(1937343345);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4D8450A;
            if ((n2 ^ n) == 81282314) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x77A1C67B ^ n, 17) + -2131449824) * 2007090811;
        }
        return this.shdhr;
    }

    public float getPitch() {
        block0: {
            int n = -587632400;
            n = Integer.rotateLeft(n * 1554170467, 18) ^ 0x6AB48D64;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
            int n2 = n ^ 0xE5AD43CA;
            if ((n2 ^ n) == -441629750) break block0;
            int cfr_ignored_0 = (0x3954333A ^ n) + -949140550;
        }
        return this.kh;
    }

    public double getDistance() {
        block0: {
            int n = bzz_4.tmdh_2(744004464);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0x440C250B;
            if ((n2 ^ n) == 1141646603) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6854BE7B ^ n, 16) + -1499418592) * 1750384251;
        }
        return this.khkhh;
    }

    public long getTimestamp() {
        block0: {
            int n = bzz_4.tmdh_2(1672802332);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF2CD7E04;
            if ((n2 ^ n) == -221413884) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x91798E18 ^ n, 5) + -1575627741) * -1854304743;
        }
        return this.shwj;
    }

    public boolean isCritical() {
        block0: {
            int n = 2126336970;
            int n2 = (n = Integer.rotateLeft(n * 930692243, 16) ^ 0xB51E3913) ^ 0x21EF056A;
            if ((n2 ^ n) == 569312618) break block0;
            int cfr_ignored_0 = (0x5F5256A0 ^ n) + -462016340;
        }
        return this.dfn;
    }

    public double getTargetSpeed() {
        return this.shdhf;
    }

    public String getTargetType() {
        return this.khhsh;
    }

    private static String[] rfhqujb2tlob1y(String string) {
        int n = -554575729;
        n = Integer.rotateLeft(n * 415406161, 27) ^ 0xA30A22A4;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 21);
        int n2 = n ^ 0x28FAA3D9;
        if ((n2 ^ n) != 687514585) {
            int cfr_ignored_0 = (0xF60B7B56 ^ n) + 340584691;
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

    private static CallSite tpobkhm7l4htfc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1933572167;
            n3 = Integer.rotateLeft(n3 * 657081159, 22) ^ 0xCA51AA92;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x174E56C8;
            if ((n4 ^ n3) != 391009992) {
                int cfr_ignored_0 = (0x9B8E5171 ^ n3) - -562138741;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dhkhj ^ string.hashCode() ^ n2 + shhq_2 + i * -1468617695) + dhkhj) ^ shhq_2));
            }
            String[] stringArray = tjr.rfhqujb2tlob1y(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] t3z89sju(String string) {
        return string.split("\u0006\u001a", -1);
    }

    private static CallSite phmjsg6egy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ kbzt2k4 ^ string.hashCode()) + (n2 + y2bzpcg) + i ^ kbzt2k4, 26) + y2bzpcg);
            }
            String[] stringArray = tjr.t3z89sju(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

