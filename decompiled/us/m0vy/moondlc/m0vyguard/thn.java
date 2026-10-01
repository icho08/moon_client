/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.Optional;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bhdh;
import us.m0vy.moondlc.m0vyguard.bdht_2;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.bssh_2;
import us.m0vy.moondlc.m0vyguard.tjt_2;
import us.m0vy.moondlc.m0vyguard.t_3;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.ah_2;
import us.m0vy.moondlc.m0vyguard.yf;

public final class thn {
    private static final t_3 bagh_2;
    private static final int sts_3 = -479563045;
    private static final int shhd_2 = -2137814327;
    private static final int ddz = -1740102180;
    private static final int dhhh = 1711342275;
    private static final int t715mp83 = 1737127754;
    private static final int mobakp9 = 1590300949;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int f1ralolyiz;

    public bthn ttha_2() {
        int n = 199236512;
        int n2 = (n = Integer.rotateLeft(n * -1575529697, 3) ^ 0x79CC2B6D) ^ 0xE1632F7E;
        if ((n2 ^ n) != -513593474) {
            int cfr_ignored_0 = (0xEA8334DE ^ n) - 1937356055;
        }
        List list = bhdh.khsb().ml();
        return thn.jdgh(bdht_2.jngh("config", arg_0 -> this.shms_2(list, arg_0)));
    }

    private void rkn(bths_2 bths2) {
        try {
            int n = -203548515;
            n = Integer.rotateLeft(n * -1237923279, 11) ^ 0xD6FFAB62;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xFD9DFA52;
            if ((n2 ^ n) != -39978414) {
                int cfr_ignored_0 = (0xE43E2CF ^ n) - 1208399042;
            }
            if ((0x69 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        bssh_2 bssh2 = (bssh_2)((Object)bths2.arguments().get(0));
        String string = (String)bths2.arguments().get(1);
        bssh2.createHandler().accept(string);
    }

    private void shms_2(List list, bdht_2 bdht2) {
        int n = tjt_2.tath_3(1097069465);
        n = System.identityHashCode(this) ^ n;
        bdht_2 bdht3 = bdht2;
        n = Integer.rotateRight((bdht3 != null ? System.identityHashCode(bdht3) : 0) ^ n, 13);
        int n2 = n ^ 0xCD9D7226;
        if ((n2 ^ n) != -845319642) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8CFE81BF ^ n, 4) - 388978012) * -1929477697;
        }
        bdht2.bkhd("cfg").brsh("commands.config.description").dqdh_2("action", thn::zks_2).dqdh_2("id", arg_0 -> thn.tzr(list, arg_0)).jmz(this::rkn);
    }

    private static void tzr(List list, bsj bsj2) {
        int n = tjt_2.tath_3(1702320585);
        bsj bsj3 = bsj2;
        n = (bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n;
        int n2 = n ^ 0x252162E8;
        if ((n2 ^ n) != 622945000) {
            int cfr_ignored_0 = Integer.rotateLeft(0x40563B21 ^ n, 11) + -825309126;
            int cfr_ignored_1 = (int)(0x82E4951C27D4EB4FL ^ (long)n ^ 0xD748831A2DB8A818L);
        }
        bsj2.tkn().tkk_2(bagh_2).sldh(list);
    }

    private static void zks_2(bsj bsj2) {
        int n = 229978650;
        n = Integer.rotateLeft(n * -1554698367, 7) ^ 0x1FAA407;
        bsj bsj3 = bsj2;
        n = (bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n;
        int n2 = n ^ 0x8AFDE424;
        if ((n2 ^ n) != -1963072476) {
            int cfr_ignored_0 = (0x8748D63E ^ n) + 1609307175;
        }
        bsj2.tkk_2(thn::dhsh_6).sldh(bssh_2.allNames());
    }

    private static ah_2 dhsh_6(String string) {
        Optional optional;
        int n = 28141256;
        n = Integer.rotateLeft(n * 1551588531, 11) ^ 0xC4BE092B;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
        int n2 = n ^ 0x9CEEC1B8;
        if ((n2 ^ n) != -1662074440) {
            int cfr_ignored_0 = (0x9D43A770 ^ n) + 388003501;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return (optional = bssh_2.from(string)).isPresent() ? ah_2.tsy((Object)((bssh_2)((Object)optional.get()))) : ah_2.thsdh_2(tr_2.ttq_3("commands.config".concat(".invalid_action")));
    }

    private static String rshl(String string, int n, int n2, int n3) {
        int n4 = 1272288892;
        n4 = Integer.rotateLeft(n4 * 1994745539, 13) ^ 0x7BD74BD;
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 13)) ^ 0x25D4D816;
        if ((n5 ^ n4) != 634705942) {
            int cfr_ignored_0 = (0x6E014E6A ^ n4) + 1289157558;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x11812692 ^ n2 ^ i * 1806673131 ^ sts_3, 22) ^ shhd_2));
        }
        return new String(cArray);
    }

    private static bthn jdgh(bdht_2 bdht2) {
        block0: {
            int n = 1295203397;
            int n2 = (n = Integer.rotateLeft(n * 2106494785, 19) ^ 0x24686F2D) ^ 0x96E42CD9;
            if ((n2 ^ n) == -1763431207) break block0;
            int cfr_ignored_0 = (0xDBD7109C ^ n) + -1235928740;
        }
        return bdht2.szy_2();
    }

    private static String[] brl(String string) {
        int n = 1077784055;
        int n2 = (n = Integer.rotateLeft(n * -1636094699, 18) ^ 0x3817BD26) ^ 0x21490C86;
        if ((n2 ^ n) != 558435462) {
            int cfr_ignored_0 = (0x6174A171 ^ n) + -1112154610;
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

    private static CallSite dzz_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1717030235;
            n3 = Integer.rotateLeft(n3 * -894692919, 17) ^ 0xB9118451;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xB5178B2F;
            if ((n4 ^ n3) != -1256748241) {
                int cfr_ignored_0 = (0xD3404674 ^ n3) - 1341698680;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ddz ^ string.hashCode() ^ n2 + dhhh + i * 1797170347) + ddz) ^ dhhh));
            }
            String[] stringArray = thn.brl(new String(cArray));
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

    private static String[] zck3r458rsyc0(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite nh3my2214v(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ t715mp83 ^ string.hashCode() ^ n2 + mobakp9 + i * 1643504133) + t715mp83) ^ mobakp9));
            }
            String[] stringArray = thn.zck3r458rsyc0(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

