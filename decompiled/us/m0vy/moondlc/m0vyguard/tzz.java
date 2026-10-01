/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bsf_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.kb;
import us.movy.moondlc.Moondlc;

public class tzz
implements tthy {
    private static final fa_2 zlm;
    private static boolean skhth;
    private static boolean shsd_4;
    private static boolean hwt;
    private final bql<kb> dnf = tzz::sma_3;
    private final bql<bsf_2> tsh = tzz::khrm;
    private static final int bshkh = -328780068;
    private static final int hkhk = -1578209006;
    private static final int ndlkkwk1zrk = -187563994;
    private static final int f9dwhb8g1 = -1147128514;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int uyvewwtnljhrvc;

    public tzz() {
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    private static void khrm(bsf_2 bsf2_2) {
        int n = -1211369863;
        int n2 = (n = Integer.rotateLeft(n * 1662426509, 12) ^ 0x25558F31) ^ 0x4512FD13;
        if ((n2 ^ n) != 1158872339) {
            int cfr_ignored_0 = (0xF2D90B6A ^ n) - -639903390;
        }
        if ((double)zlm.tssh_2() == 1.0 && !skhth) {
            skhth = true;
        }
        zlm.khmf(skhth ? 0.0f : 1.0f);
        if (zlm.tssh_2() != 0.0f || !skhth) {
            float f = Float.intBitsToFloat(-462312579 - -1591104643);
            float f2 = ((float)mc.method_22683().method_4486() - f) / 2.0f;
            float f3 = ((float)mc.method_22683().method_4502() - f) / 2.0f;
            class_2960 class_29602 = Moondlc.id("icons/poshalko.png");
            bsf2_2.khjr().drawTexture(class_29602, f2, f3, f, f, bhj_2.rrd.tkhl_2(Float.intBitsToFloat(-880489236 - -2012885780) * zlm.tssh_2()));
        }
    }

    private static void sma_3(kb kb2) {
        int n = -1484537578;
        n = Integer.rotateLeft(n * -491804393, 24) ^ 0xF14082C0;
        kb kb3 = kb2;
        n = (kb3 != null ? System.identityHashCode(kb3) : 0) ^ n;
        int n2 = n ^ 0xBB3815AC;
        if ((n2 ^ n) != -1153952340) {
            int cfr_ignored_0 = (0x1CBBD4BA ^ n) - -782474783;
        }
        int n3 = kb2.zthgh_2();
        int n4 = kb2.dnd_3();
        if (n3 == (0x55FEFF41 ^ 0x55FEFF1B)) {
            shsd_4 = n4 != 0;
        } else if (n3 == (Integer.reverse(482764686) ^ 0x71E6636E)) {
            boolean bl = hwt = n4 != 0;
        }
        if (shsd_4 && hwt) {
            skhth = false;
            zlm.khmf(1.0f);
        }
    }

    private static String thdhgh(String string, int n, int n2, int n3) {
        int n4 = -597425896;
        n4 = Integer.rotateLeft(n4 * -705465467, 11) ^ 0x6BC82B63;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 26)) ^ 0x85911B24;
        if ((n5 ^ n4) != -2054087900) {
            int cfr_ignored_0 = (0x59F51A3C ^ n4) - -1005127694;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xD054E613 ^ n2 ^ i * -7831087 ^ bshkh, 16) ^ hkhk));
        }
        return new String(cArray);
    }

    private static String[] og5uhgx9k(String string) {
        return string.split("\u0007\u0014", -1);
    }

    private static CallSite dryev93195dfy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ndlkkwk1zrk ^ string.hashCode()) + (n2 + f9dwhb8g1) + i ^ ndlkkwk1zrk, 14) + f9dwhb8g1);
            }
            String[] stringArray = tzz.og5uhgx9k(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

