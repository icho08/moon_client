/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bkhf;
import us.m0vy.moondlc.m0vyguard.khh;
import us.m0vy.moondlc.m0vyguard.fd;

public final class ttl {
    public static final khh sfl;
    public static final khh rtth;
    public static final khh bbk;
    public static final khh khzt_4;
    public static final khh bqz_2;
    public static final khh bjgh;
    private static final long stgh = 500L;
    private static final bkhf hkhl;
    private static final bkhf shn;
    private static final bkhf tld;
    private static final bkhf khbth;
    private static final bkhf bthw;
    private static fd bfdh;
    private static final int gubtgoibs = 530593989;
    private static final int bvdi244ror1xd = 391644261;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dpr0p8fr8x5j;

    private static fd zmdh_2() {
        return bfdh;
    }

    private static khh stz_7(Color color) {
        return new khh(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static khh das_6() {
        return ttl.ztsh_4(hkhl, ttl.stz_7(ttl.zmdh_2().tmd_3()));
    }

    public static khh znw() {
        return ttl.ztsh_4(shn, ttl.stz_7(ttl.zmdh_2().jghgh()));
    }

    public static khh ma_2() {
        return ttl.ztsh_4(tld, ttl.stz_7(ttl.zmdh_2().dtm_3()));
    }

    public static khh ztt_6() {
        return ttl.ztsh_4(khbth, ttl.stz_7(ttl.zmdh_2().rdm_2()));
    }

    public static khh shaw() {
        return ttl.ztsh_4(bthw, ttl.stz_7(ttl.zmdh_2().shthz()));
    }

    public static khh zwm_2() {
        return khh.thth_2.khhh_3(255.0f * (ttl.zmdh_2().getName().equalsIgnoreCase("dark") ? 0.08f : 0.05f));
    }

    private static khh ztsh_4(bkhf bkhf2, khh khh2) {
        bkhf2.ghsy(khh2);
        return bkhf2.ghzd_3();
    }

    @Generated
    private ttl() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] jkosflidk(String string) {
        return string.split("\u0007\u001d", -1);
    }

    private static CallSite zda35sssjq3z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ gubtgoibs ^ string.hashCode() ^ n2 + bvdi244ror1xd ^ i * -1927644971 ^ gubtgoibs, 23) ^ bvdi244ror1xd));
            }
            String[] stringArray = ttl.jkosflidk(new String(cArray));
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

