/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1309
 *  net.minecraft.class_1671
 *  net.minecraft.class_243
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_243;
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.th_4;

public class bakh_2
extends ttk {
    private final class_1309 rhsh;
    private class_243 thb;
    private final class_1671 khqd;
    private static final int prebmxndydn = 1602167843;
    private static final int ot1x8g0kom = 1314776762;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int h4elkfsdmj1aeo;

    @Generated
    public class_1309 dlr() {
        block0: {
            int n = 1226053813;
            n = Integer.rotateLeft(n * 472132857, 27) ^ 0xDEB8F45C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x768478E;
            if ((n2 ^ n) == 124274574) break block0;
            int cfr_ignored_0 = (0x4E7C5F3B ^ n) - -537700053;
        }
        return this.rhsh;
    }

    @Generated
    public class_243 tghw() {
        block0: {
            int n = th_4.my(2130817239);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xE8AA1B74;
            if ((n2 ^ n) == -391505036) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x97ABABA3 ^ n, 5) + 1646749688;
        }
        return this.thb;
    }

    @Generated
    public class_1671 shq_3() {
        block0: {
            int n = 2128894708;
            n = Integer.rotateLeft(n * 1388767705, 7) ^ 0xD5212A9;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0xB0328AC3;
            if ((n2 ^ n) == -1338864957) break block0;
            int cfr_ignored_0 = (0xCED6D037 ^ n) - 2049915430;
        }
        return this.khqd;
    }

    @Generated
    public void thak(class_243 class_2432) {
        int n = -1995624499;
        n = Integer.rotateLeft(n * -121705005, 15) ^ 0x7136D982;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0xC4C87DAF;
        if ((n2 ^ n) != -993493585) {
            int cfr_ignored_0 = (0x4DC55262 ^ n) - 1203165303;
        }
        this.thb = class_2432;
    }

    @Generated
    public bakh_2(class_1309 class_13092, class_243 class_2432, class_1671 class_16712) {
        this.rhsh = class_13092;
        this.thb = class_2432;
        this.khqd = class_16712;
    }

    private static String[] sz6ohlg48(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite r0zrhjz7z8ff(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ prebmxndydn ^ string.hashCode() ^ n2 + ot1x8g0kom ^ i * 1487879737 ^ prebmxndydn, 26) ^ ot1x8g0kom));
            }
            String[] stringArray = bakh_2.sz6ohlg48(new String(cArray));
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

