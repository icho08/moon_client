/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1792
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bst_3;
import us.m0vy.moondlc.m0vyguard.bqr;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Mouse Tweaks", category=bzw.OTHER, desc="Enhances inventory management")
public class badh
extends bnq {
    private static badh rhz_4;
    public final tay shhh = new tay(this, "Delay").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xD2195C1D ^ 0xD238F81D, 9))).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x69499352 ^ 0x6949B302, 17))).ssd_5(0.0f);
    private boolean zn_2 = false;
    private final bql<bqr> thtt_4 = this::dhjd_2;
    private static final int tzh_3 = -1347482378;
    private static final int smz_2 = -1300347165;
    private static final int bdhsh = -2124961605;
    private static final int jnd_2 = 1034616469;
    private static final int r6uthwhs1 = 1634847057;
    private static final int z66wu4bimyqi = -1256933982;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yvtinl99;

    public static badh zaj() {
        block0: {
            int n = bst_3.hdhd_2(792489720);
            int n2 = n ^ 0x925FB1F5;
            if ((n2 ^ n) == -1839222283) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xBD63DF0D ^ n, 10) - -210394674;
            int cfr_ignored_1 = (int)(0x7FD1713027D4EB4FL ^ (long)n ^ 0x1F10831A2DB95273L);
        }
        return rhz_4;
    }

    public badh() {
        rhz_4 = this;
    }

    private void dhjd_2(bqr bqr2) {
        int n = bst_3.hdhd_2(307233333);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0x3776EACE;
        if ((n2 ^ n) != 930540238) {
            int cfr_ignored_0 = (Integer.rotateRight(0x2526E8FB ^ n, 7) + -2079074912) * 623307003;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if ((brz.rzdh(-578858229 - -578858569) || brz.rzdh(735145218 + -735144874)) && (brz.rzdh(-450682328 + 450682669) || brz.rzdh(-1303011317 + 1303011662)) && bqr2.bly() == class_1713.field_7795 && !this.zn_2) {
            if (badh.mc.field_1724 == null || badh.mc.field_1724.field_7512 == null || badh.mc.field_1761 == null) {
                return;
            }
            class_1792 class_17922 = ((class_1735)badh.mc.field_1724.field_7512.field_7761.get(bqr2.zkn())).method_7677().method_7909();
            this.zn_2 = true;
            for (int i = 0; i < badh.mc.field_1724.field_7512.field_7761.size(); ++i) {
                if (((class_1735)badh.mc.field_1724.field_7512.field_7761.get(i)).method_7677().method_7909() != class_17922) continue;
                badh.mc.field_1761.method_2906(badh.mc.field_1724.field_7512.field_7763, i, 1, class_1713.field_7795, (class_1657)badh.mc.field_1724);
            }
            this.zn_2 = false;
        }
    }

    private static String ty_2(String string, int n, int n2, int n3) {
        int n4 = bst_3.hdhd_2(-845063397);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0xB64DE624;
        if ((n5 ^ n4) != -1236408796) {
            int cfr_ignored_0 = (Integer.rotateRight(0x7BECBD3F ^ n4, 18) - 101222876) * 2079112511;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x4E2EFE49) + n2 ^ i * -243656375) ^ tzh_3) + smz_2);
        }
        return new String(cArray);
    }

    private static String[] thys_2(String string) {
        block0: {
            int n = -1776226501;
            int n2 = (n = Integer.rotateLeft(n * -547462091, 13) ^ 0xB8BE79F7) ^ 0xF4B3247B;
            if ((n2 ^ n) == -189586309) break block0;
            int cfr_ignored_0 = (0x6293CB40 ^ n) + 2082042994;
        }
        return string.split("\u0001\u0015", -1);
    }

    private static CallSite and_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1024738337;
            n3 = Integer.rotateLeft(n3 * -235784273, 14) ^ 0x2BDD56CB;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 13);
            int n4 = n3 ^ 0x6A0D026F;
            if ((n4 ^ n3) != 1779237487) {
                int cfr_ignored_0 = (0x5719464E ^ n3) - 863997094;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bdhsh ^ string.hashCode()) + (n2 + jnd_2) + i ^ bdhsh, 27) + jnd_2);
            }
            String[] stringArray = badh.thys_2(new String(cArray));
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

    private static String[] smgjslj64ob(String string) {
        return string.split("\u0007\u0018", -1);
    }

    private static CallSite g0fcnjch3op(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ r6uthwhs1 ^ string.hashCode() ^ n2 + z66wu4bimyqi + i * 646877779) + r6uthwhs1) ^ z66wu4bimyqi));
            }
            String[] stringArray = badh.smgjslj64ob(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

