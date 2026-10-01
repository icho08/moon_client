/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1657
 *  net.minecraft.class_239
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import us.m0vy.moondlc.m0vyguard.bdj_2;

public class mk {
    private final class_1657 thla_2;
    private final class_1268 rdhth;
    private final class_239 dhkhy;
    private boolean hsy_2;
    private static final int c6tgndrkapjt2 = -914746544;
    private static final int kq49q1xy9yjv = -2066591895;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int e7ehw16872;

    public mk(class_1657 class_16572, class_1268 class_12682, class_239 class_2392) {
        this.thla_2 = class_16572;
        this.rdhth = class_12682;
        this.dhkhy = class_2392;
    }

    public class_1657 bkha_2() {
        block0: {
            int n = bdj_2.hhr(881192530);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x16ADD8D4;
            if ((n2 ^ n) == 380491988) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x22283686 ^ n, 7) - 658258293;
        }
        return this.thla_2;
    }

    public class_1268 afb() {
        block0: {
            int n = bdj_2.hhr(-1994797661);
            int n2 = n ^ 0x2107534F;
            if ((n2 ^ n) == 554128207) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA81E9EEC ^ n, 8) - 1611849167;
        }
        return this.rdhth;
    }

    public class_239 sfa() {
        return this.dhkhy;
    }

    public boolean ssk() {
        block0: {
            int n = bdj_2.hhr(465812425);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4627A599;
            if ((n2 ^ n) == 1177003417) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5DE41E50 ^ n, 14) + 1660766955) * 1575231057;
        }
        return this.hsy_2;
    }

    public void jld(boolean bl) {
        int n = 33282181;
        n = Integer.rotateLeft(n * -1617738975, 11) ^ 0x20E55826;
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = Integer.rotateLeft(bl ^ n, 13)) ^ 0xB1ABA127;
        if ((n2 ^ n) != -1314152153) {
            int cfr_ignored_0 = (0xB05079A2 ^ n) + 1297159436;
        }
        this.hsy_2 = bl;
    }

    private static String[] i4n45zea7q(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite jbytwcmtsvlp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ c6tgndrkapjt2 ^ string.hashCode() ^ n2 + kq49q1xy9yjv + i * -1802491889) + c6tgndrkapjt2) ^ kq49q1xy9yjv));
            }
            String[] stringArray = mk.i4n45zea7q(new String(cArray));
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

