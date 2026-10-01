/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2761
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import net.minecraft.class_2761;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class lm {
    private final float[] khal = new float[574351457 - 574351437];
    private int zqd = 0;
    private long rtha;
    private final bql<bksh> zdhd = this::jfs;
    private static final int zts = -1067876469;
    private static final int dhdha = -550906329;
    private static final int l59y3s0oips = -340029539;
    private static final int tm0nrv3gjct4 = 55120210;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int xwcims3g;

    public lm() {
        this.rtha = 0x7762FF20F3D7153FL ^ 0x889D00DF0C28EAC0L;
        Arrays.fill(this.khal, 0.0f);
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    public float zsq_4() {
        int n = -539498139;
        int n2 = (n = Integer.rotateLeft(n * -45720005, 24) ^ 0x1EC687E4) ^ 0xC7CB43AB;
        if ((n2 ^ n) != -942980181) {
            int cfr_ignored_0 = (0x181CAACE ^ n) + -1378653103;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (float f3 : this.khal) {
            if (!(f3 > 0.0f)) continue;
            f2 += f3;
            f += 1.0f;
        }
        return lm.tnth(f2 / f, 0.0f, Float.intBitsToFloat(-1274770797 - 1919191699));
    }

    private void jfs(bksh bksh2) {
        try {
            int n = 973448766;
            n = Integer.rotateLeft(n * -1128240281, 6) ^ 0x53200137;
            bksh bksh3 = bksh2;
            n = (bksh3 != null ? System.identityHashCode(bksh3) : 0) ^ n;
            int n2 = n ^ 0x3118E604;
            if ((n2 ^ n) != 823715332) {
                int cfr_ignored_0 = (0xB1D403A ^ n) + -236281263;
            }
            if ((0x214 & 0) != 0) {
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
        if (bksh2.asw() instanceof class_2761) {
            if (this.rtha != (0x5967EB912BF7D7CDL ^ 0xA698146ED4082832L)) {
                float f = (float)(System.nanoTime() - this.rtha) / Float.intBitsToFloat(Integer.reverse(-1843225082) ^ 0x2E172F61);
                this.khal[this.zqd % this.khal.length] = class_3532.method_15363((float)(Float.intBitsToFloat(Integer.rotateLeft(0xB9B1DCBF ^ 0xB9910CBF, 9)) / f), (float)0.0f, (float)Float.intBitsToFloat(0x3D2A9E3 ^ 0x4272A9E3));
                ++this.zqd;
            }
            this.rtha = System.nanoTime();
        }
    }

    private static float tnth(float f, float f2, float f3) {
        block0: {
            int n = -2113157205;
            n = Integer.rotateLeft(n * -2139077463, 10) ^ 0xF08661BB;
            n = Integer.rotateRight(Float.floatToIntBits(f2) ^ n, 21);
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0x563D6CA1;
            if ((n2 ^ n) == 1446866081) break block0;
            int cfr_ignored_0 = (0xD436AB0A ^ n) + -1458951027;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static String[] tdm_3(String string) {
        block0: {
            int n = 1225662038;
            n = Integer.rotateLeft(n * 446791309, 27) ^ 0x368CE95D;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
            int n2 = n ^ 0x6990E18C;
            if ((n2 ^ n) == 1771102604) break block0;
            int cfr_ignored_0 = (0x209EFFDA ^ n) + 1288657962;
        }
        return string.split("\u0002\u0014", -1);
    }

    private static CallSite hdy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1505726225;
            n3 = Integer.rotateLeft(n3 * 298137209, 21) ^ 0xC4710258;
            int n4 = n3 ^ 0x32A4C5DB;
            if ((n4 ^ n3) != 849659355) {
                int cfr_ignored_0 = (0x6B1B4ACA ^ n3) + -1448370718;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zts ^ string.hashCode() ^ n2 + dhdha + i * -1659721895) + zts) ^ dhdha));
            }
            String[] stringArray = lm.tdm_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] jcuou1h6xew(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ap94btgwci6n4d(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ l59y3s0oips ^ string.hashCode()) + (n2 + tm0nrv3gjct4) + i ^ l59y3s0oips, 3) + tm0nrv3gjct4);
            }
            String[] stringArray = lm.jcuou1h6xew(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

