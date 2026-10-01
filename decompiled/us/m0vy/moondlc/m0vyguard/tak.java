/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import us.m0vy.moondlc.m0vyguard.bza;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.tss;
import us.m0vy.moondlc.m0vyguard.thz_6;
import us.m0vy.moondlc.m0vyguard.gha;
import us.movy.moondlc.Moondlc;

public final class tak {
    private final List bfsh = new ArrayList();
    private final Map mz_2 = new IdentityHashMap();
    private static final int bsq = 988830778;
    private static final int dhjdh = -1808578783;
    private static final int hajwwmuk8uk = 1791242441;
    private static final int xowl695rhzxgg = -2122745401;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int f42thld0jryjt;

    public List dbd_3() {
        int n = thz_6.khzd_3(-112987225);
        int n2 = n ^ 0xB5F49C5;
        if ((n2 ^ n) != 190794181) {
            int cfr_ignored_0 = Integer.rotateRight(0xF21CBA62 ^ n, 17) + 1440231705;
        }
        this.rh();
        for (tss tss2 : this.bfsh) {
            tak.tnth_2(tss2);
        }
        return this.bfsh;
    }

    public void rh() {
        int n = -1151781743;
        int n2 = (n = Integer.rotateLeft(n * 2111682017, 11) ^ 0x254EC531) ^ 0x443FD54;
        if ((n2 ^ n) != 71564628) {
            int cfr_ignored_0 = (0xBF1AC9C5 ^ n) + 1092309248;
        }
        List list = tak.zqk_2().getModuleManager().rdhs();
        boolean bl = false;
        for (bsb bsb2 : list) {
            if (bsb2.dsd_4() || this.mz_2.containsKey(bsb2)) continue;
            tss tss2 = new tss(bsb2);
            this.mz_2.put(bsb2, tss2);
            this.bfsh.add(tss2);
            bl = true;
        }
        if (bl) {
            this.bfsh.sort(tak::tfk);
        }
    }

    public void ky() {
        gha gha2 = bza.getInstance().getFigmaMenuScreen();
        if (gha2 != null && gha2.bhw) {
            if (gha2.skhz_4 != null) {
                gha2.skhz_4.run();
            }
            if (gha2.dhjk.hnf() <= 0.01f) {
                gha2.skhz_4 = null;
                gha2.bhw = false;
                gha2.dhjk.dhht_2(0.0f);
                gha2.dhjk.sfm_2(0.0f);
            }
        }
    }

    private static int tfk(tss tss2, tss tss3) {
        block0: {
            int n = thz_6.khzd_3(-637170876);
            int n2 = n ^ 0x1C41C28;
            if ((n2 ^ n) == 29629480) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xDBC1976C ^ n, 14) - -1597049521;
        }
        return tss2.getName().compareToIgnoreCase(tss3.getName());
    }

    private static void tnth_2(tss tss2) {
        int n = thz_6.khzd_3(1422404973);
        tss tss3 = tss2;
        n = (tss3 != null ? System.identityHashCode(tss3) : 0) ^ n;
        int n2 = n ^ 0x3776758;
        if ((n2 ^ n) != 58156888) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x57BF4A35 ^ n, 13) - -1534616666) * 1472154165;
            int cfr_ignored_1 = (int)(0x950DE40827D4EB4FL ^ (long)n ^ 0x3560831A2DB887CAL);
        }
        tss2.refreshAnimations();
    }

    private static Moondlc zqk_2() {
        block0: {
            int n = thz_6.khzd_3(-1182996799);
            int n2 = n ^ 0x55A56158;
            if ((n2 ^ n) == 1436901720) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xECD98799 ^ n, 16) + -1296758078) * -321288295;
            int cfr_ignored_1 = (int)(0x2E6B29A427D4EB4FL ^ (long)n ^ 0xAE38831A2DB9F107L);
        }
        return Moondlc.getInstance();
    }

    private static String[] shzy_2(String string) {
        int n = 123137663;
        n = Integer.rotateLeft(n * 111619829, 16) ^ 0x340FBFC0;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xCF7235C7;
        if ((n2 ^ n) != -814598713) {
            int cfr_ignored_0 = (0xC824DBB8 ^ n) + 772707745;
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

    private static CallSite dhzn_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 133064536;
            n3 = Integer.rotateLeft(n3 * -1224608475, 5) ^ 0x43D9DEA3;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 14);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x818AED05;
            if ((n4 ^ n3) != -2121601787) {
                int cfr_ignored_0 = (0x86648A5D ^ n3) - -504828557;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ bsq ^ string.hashCode() ^ n2 + dhjdh ^ i * 315680627 ^ bsq, 15) ^ dhjdh));
            }
            String[] stringArray = tak.shzy_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] b5sgn73g(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite aww0ywu3zqq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ hajwwmuk8uk ^ string.hashCode() ^ n2 + xowl695rhzxgg ^ i * -153166437 ^ hajwwmuk8uk, 26) ^ xowl695rhzxgg));
            }
            String[] stringArray = tak.b5sgn73g(new String(cArray));
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

