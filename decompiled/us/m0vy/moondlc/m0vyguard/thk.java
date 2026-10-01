/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.jh_2;

public class thk
extends ttk {
    private final float szz;
    private final float skt;
    private final int shfb;
    private static final int iy6o9wd0yybkc = -978446886;
    private static final int va58wpzl1 = 614845515;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fx2et0dsvoq9n;

    @Generated
    public float jthd() {
        block0: {
            int n = -548772398;
            int n2 = (n = Integer.rotateLeft(n * -1696195525, 24) ^ 0xB440A5BF) ^ 0xCF2C223;
            if ((n2 ^ n) == 217236003) break block0;
            int cfr_ignored_0 = (0xD3B8A7F1 ^ n) - -603965157;
        }
        return this.szz;
    }

    @Generated
    public float zshz_3() {
        block0: {
            int n = 0x6363BBB3;
            int n2 = (n = Integer.rotateLeft(n * -1628824343, 24) ^ 0x4CE539A8) ^ 0x4BC04845;
            if ((n2 ^ n) == 1270892613) break block0;
            int cfr_ignored_0 = (0x28A3F3F6 ^ n) - 1936124471;
        }
        return this.skt;
    }

    @Generated
    public int dbw() {
        block0: {
            int n = jh_2.zwd_2(356341870);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x9DF3998C;
            if ((n2 ^ n) == -1644979828) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x88CEC1E2 ^ n, 4) + -1788405351;
        }
        return this.shfb;
    }

    @Generated
    public thk(float f, float f2, int n) {
        this.szz = f;
        this.skt = f2;
        this.shfb = n;
    }

    private static String[] ieh0qhy9oeo0wl(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hxhypo4mb53(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ iy6o9wd0yybkc ^ string.hashCode()) + (n2 + va58wpzl1) + i ^ iy6o9wd0yybkc, 19) + va58wpzl1);
            }
            String[] stringArray = thk.ieh0qhy9oeo0wl(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

