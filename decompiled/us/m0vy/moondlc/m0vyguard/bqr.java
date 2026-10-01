/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1713
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1713;
import us.m0vy.moondlc.m0vyguard.ttt;

public class bqr
extends ttt {
    private final class_1713 thtth_2;
    private final int bhth;
    private final int bhl;
    private final int thrgh;
    private static final int scnzycyyx1zr = 1993533172;
    private static final int lah109y9wjs = 697125494;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int k16qsnrh;

    public bqr(class_1713 class_17132, int n, int n2, int n3) {
        this.thtth_2 = class_17132;
        this.bhth = n;
        this.bhl = n2;
        this.thrgh = n3;
    }

    public class_1713 bly() {
        block0: {
            int n = -1756698163;
            n = Integer.rotateLeft(n * 160853885, 20) ^ 0xAB331746;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x66ECFB04;
            if ((n2 ^ n) == 1726806788) break block0;
            int cfr_ignored_0 = (0xF1A612C9 ^ n) - 1928918453;
        }
        return this.thtth_2;
    }

    public int zkn() {
        block0: {
            int n = -230702220;
            int n2 = (n = Integer.rotateLeft(n * 647855453, 4) ^ 0x697F9DF6) ^ 0xE013C212;
            if ((n2 ^ n) == -535576046) break block0;
            int cfr_ignored_0 = (0x122C0166 ^ n) + -752348598;
        }
        return this.bhth;
    }

    public int zdhy_2() {
        block0: {
            int n = 215583110;
            n = Integer.rotateLeft(n * 755141517, 23) ^ 0x6E9E50EF;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0xBBF2F011;
            if ((n2 ^ n) == -1141706735) break block0;
            int cfr_ignored_0 = (0xB72B7997 ^ n) + 1818970953;
        }
        return this.bhl;
    }

    public int shaa_3() {
        block0: {
            int n = -1871020666;
            n = Integer.rotateLeft(n * -798871681, 12) ^ 0x6097544;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x58E8BD7D;
            if ((n2 ^ n) == 1491647869) break block0;
            int cfr_ignored_0 = (0xC892C0FB ^ n) + 1407242330;
        }
        return this.thrgh;
    }

    private static String[] rmh730f9ui(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite jrs2mu3ny57(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ scnzycyyx1zr ^ string.hashCode() ^ n2 + lah109y9wjs ^ i * -330716143 ^ scnzycyyx1zr, 5) ^ lah109y9wjs));
            }
            String[] stringArray = bqr.rmh730f9ui(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

