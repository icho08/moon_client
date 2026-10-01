/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_742
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_742;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.khkh;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="AutoLeave", category=bzw.OTHER, desc="Automatically leaves server when a player is nearby")
public class dd_2
extends bnq {
    private final tay khwn = new tay(this, "Distance").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(1374999891) ^ 0x88632F8A)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xF905D929 ^ 0xFB179929, 5)));
    private final khd dhbkh = new khd(this, "Action");
    private final fy hsa_4 = new fy(this.dhbkh, "Hub");
    private final fy tdhn = new fy(this.dhbkh, "Spawn");
    private final fy zdm_2 = new fy(this.dhbkh, "Home");
    private final bql<btt> tkhl = this::nt_3;
    private static final int zlsh = 1485719901;
    private static final int rzkh = -35083701;
    private static final int rthd_2 = -57816465;
    private static final int hghf = 454228455;
    private static final int y4calis05ub1 = 137484532;
    private static final int ob3pqhpp3wi = 1981602101;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p4m4jcfqlzir0;

    private void ghath_2() {
        try {
            int n = 1481438665;
            n = Integer.rotateLeft(n * 929896627, 7) ^ 0x23DF1C83;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x84B613F7;
            if ((n2 ^ n) != -2068442121) {
                int cfr_ignored_0 = (0xDCFAE63E ^ n) + -291995869;
            }
            if ((0x367 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (dd_2.mc.field_1724 == null) {
            return;
        }
        if (this.hsa_4.shghkh()) {
            dd_2.mc.field_1724.field_3944.method_45730("hub");
        } else if (this.tdhn.shghkh()) {
            dd_2.mc.field_1724.field_3944.method_45730("spawn");
        } else if (dd_2.anz_2(this.zdm_2)) {
            dd_2.mc.field_1724.field_3944.method_45730("home home");
        }
    }

    private void nt_3(btt btt2) {
        int n = -156287543;
        n = Integer.rotateLeft(n * 543096585, 19) ^ 0x293DB78F;
        btt btt3 = btt2;
        n = Integer.rotateRight((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 18);
        int n2 = n ^ 0xE3E477E0;
        if ((n2 ^ n) != -471566368) {
            int cfr_ignored_0 = (0x154B4A29 ^ n) - 431981687;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (dd_2.mc.field_1724 == null || dd_2.mc.field_1687 == null) {
            return;
        }
        for (class_742 class_7423 : dd_2.mc.field_1687.method_18456()) {
            if (class_7423 == dd_2.mc.field_1724 || !(class_7423.method_19538().method_1022(dd_2.mc.field_1724.method_19538()) <= (double)this.khwn.thw_5())) continue;
            this.ghath_2();
            this.tskh_3();
            break;
        }
    }

    private static String rkq(String string, int n, int n2, int n3) {
        int n4 = 1089155601;
        n4 = Integer.rotateLeft(n4 * -883860835, 8) ^ 0xE19CBCC4;
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 8)) ^ 0x9FCA4B4A;
        if ((n5 ^ n4) != -1614132406) {
            int cfr_ignored_0 = (0xDF21795B ^ n4) - -1478578198;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x6498A4C0 ^ n2 ^ i * -715378893 ^ zlsh, 24) ^ rzkh));
        }
        return new String(cArray);
    }

    private static String asf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = khkh.shsl(-1582130633);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 18)) ^ 0xE45B03BC;
            if ((n5 ^ n4) == -463797316) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x45E9998B ^ n4, 11) + 2074556176;
        }
        return dd_2.rkq(string, n, n2, n3);
    }

    private static String szr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 918254046;
            n4 = Integer.rotateLeft(n4 * -492070539, 19) ^ 0x17D8496;
            int n5 = (n4 = n3 ^ n4) ^ 0x10D5B98;
            if ((n5 ^ n4) == 17652632) break block0;
            int cfr_ignored_0 = (0x37B62A46 ^ n4) + -559351306;
        }
        return dd_2.rkq(string, n, n2, n3);
    }

    private static boolean anz_2(fy fy2) {
        block0: {
            int n = khkh.shsl(1824734831);
            fy fy3 = fy2;
            n = Integer.rotateRight((fy3 != null ? System.identityHashCode(fy3) : 0) ^ n, 13);
            int n2 = n ^ 0xF72206FF;
            if ((n2 ^ n) == -148764929) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9BE13890 ^ n, 6) + -459048789) * -1679738735;
        }
        return fy2.shghkh();
    }

    private static String khsm(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1273715126;
            int n5 = (n4 = Integer.rotateLeft(n4 * 496379721, 27) ^ 0x949D5729) ^ 0xD173830E;
            if ((n5 ^ n4) == -780958962) break block0;
            int cfr_ignored_0 = (0x9A98DAB8 ^ n4) + -878815551;
        }
        return dd_2.rkq(string, n, n2, n3);
    }

    private static String[] sqq(String string) {
        block0: {
            int n = 1669122625;
            int n2 = (n = Integer.rotateLeft(n * 889601247, 3) ^ 0xD8CC89AB) ^ 0x5A1E611E;
            if ((n2 ^ n) == 1511940382) break block0;
            int cfr_ignored_0 = (0x3962AB5F ^ n) + -371451634;
        }
        return string.split("\u0003\u000f", -1);
    }

    private static CallSite srj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 405859570;
            n3 = Integer.rotateLeft(n3 * 320565707, 8) ^ 0xA5784E0C;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 10);
            int n4 = n3 ^ 0x11A5E04A;
            if ((n4 ^ n3) != 296083530) {
                int cfr_ignored_0 = (0x9950CB8 ^ n3) + 17627017;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rthd_2 ^ string.hashCode() ^ n2 + hghf ^ i * 1147359841 ^ rthd_2, 18) ^ hghf));
            }
            String[] stringArray = dd_2.sqq(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] snj0w46f0jemi(String string) {
        return string.split("\u0004\u0011", -1);
    }

    private static CallSite o0wqu3kza2e(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ y4calis05ub1 ^ string.hashCode() ^ n2 + ob3pqhpp3wi + i * 2115603771) + y4calis05ub1) ^ ob3pqhpp3wi));
            }
            String[] stringArray = dd_2.snj0w46f0jemi(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

