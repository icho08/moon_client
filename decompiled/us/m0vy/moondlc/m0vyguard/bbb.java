/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1429
 *  net.minecraft.class_1569
 *  net.minecraft.class_1657
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1429;
import net.minecraft.class_1569;
import net.minecraft.class_1657;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.thm_3;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Hit Sound", category=bzw.OTHER, desc="Plays a sound when you hit an entity")
public class bbb
extends bnq {
    private final khd bhq = new khd(this, "Sound");
    private final fy hmr = new fy(this.bhq, "Sword");
    private final fy hkh_2 = new fy(this.bhq, "Sound");
    private final fy bsth = new fy(this.bhq, "Bubble");
    private final fy jst_4 = new fy(this.bhq, "Metallic");
    private final fy jzk_2 = new fy(this.bhq, "Bell");
    private final fy stn = new fy(this.bhq, "Hit4");
    private final tay zaa_4 = new tay(this, "Volume").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x939F43F6 ^ 0x918903F6, 5))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xDFDBFAA8 ^ 0x9D7BFAA8));
    private final badh_2 zydh = new badh_2(this, "Players").bts(true);
    private final badh_2 hys = new badh_2(this, "Mobs").bts(true);
    private final badh_2 ththd = new badh_2(this, "Animals").bts(false);
    private final bql<bthy> bjkh = this::shdhth;
    private static final int rzs_3 = 191208260;
    private static final int dar = -1710216978;
    private static final int kkh = -205437319;
    private static final int qt = 186348523;
    private static final int w6hfnlkw8 = 1279114613;
    private static final int s8a6nbtzd14 = 1163224211;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p13ba4f1vzgm6;

    private void shdhth(bthy bthy2) {
        class_1297 class_12972;
        int n = -2004652748;
        n = Integer.rotateLeft(n * -1301932633, 10) ^ 0xF16447A7;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0xF6647C76;
        if ((n2 ^ n) != -161186698) {
            int cfr_ignored_0 = (0x7EE71142 ^ n) + -1142917744;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if ((class_12972 = bthy2.khtf()) == null || !(class_12972 instanceof class_1309)) {
            return;
        }
        if (class_12972 instanceof class_1657 && !this.zydh.shzl()) {
            return;
        }
        if (class_12972 instanceof class_1569 && !this.hys.shzl()) {
            return;
        }
        if (class_12972 instanceof class_1429 && !this.ththd.shzl()) {
            return;
        }
        String string = this.hmr.shghkh() ? "sword.wav" : (this.hkh_2.shghkh() ? "sound.wav" : (this.bsth.shghkh() ? "bubble.wav" : (this.jst_4.shghkh() ? "metallic.wav" : (this.jzk_2.shghkh() ? "bell.wav" : (this.stn.shghkh() ? "hit4.wav" : "sword.wav")))));
        thm_3.rff(string, (int)this.zaa_4.thw_5());
    }

    private static String sls_3(String string, int n, int n2, int n3) {
        int n4 = -1817677119;
        n4 = Integer.rotateLeft(n4 * 358293845, 6) ^ 0x1A319FF4;
        n4 = n ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 14)) ^ 0x6B54E473;
        if ((n5 ^ n4) != 1800725619) {
            int cfr_ignored_0 = (0xF8FC96B2 ^ n4) - -283285960;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x83086D1C) + rzs_3 ^ Integer.reverse(n2 + i * 91869487), 9) - dar);
        }
        return new String(cArray);
    }

    private static String[] bwz_2(String string) {
        int n = 1387716255;
        n = Integer.rotateLeft(n * 1299195673, 17) ^ 0xD66A4FE3;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
        int n2 = n ^ 0x7271226B;
        if ((n2 ^ n) != 1920017003) {
            int cfr_ignored_0 = (0x20C7FCF4 ^ n) + 695210457;
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

    private static CallSite jaf_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -620521184;
            n3 = Integer.rotateLeft(n3 * -580626353, 14) ^ 0xA4203B35;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateRight(n ^ n3, 12);
            int n4 = n3 ^ 0x689FDFA0;
            if ((n4 ^ n3) != 1755307936) {
                int cfr_ignored_0 = (0xB39C4680 ^ n3) + -337594316;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ kkh ^ string.hashCode()) + (n2 + qt) + i ^ kkh, 28) + qt);
            }
            String[] stringArray = bbb.bwz_2(new String(cArray));
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

    private static String[] zynufpsbdvx(String string) {
        return string.split("\u0006\u000f", -1);
    }

    private static CallSite tgp6xoy3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ w6hfnlkw8 ^ string.hashCode() ^ n2 + s8a6nbtzd14 ^ i * -961110559 ^ w6hfnlkw8, 11) ^ s8a6nbtzd14));
            }
            String[] stringArray = bbb.zynufpsbdvx(new String(cArray));
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

