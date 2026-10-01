/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnsh;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.tsf;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.zy;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.my;
import us.m0vy.moondlc.m0vyguard.ny;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class bghl {
    private final bql<btt> rthb = bghl::skhf_2;
    private final bql<shw_3> snt_2 = bghl::sda_8;
    private final bql<tsf> khtdh_2 = this::tdhq_2;
    private static final int b7e7lwq7 = -738720742;
    private static final int q04v6mgqvws = -1874509074;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int suba5xe0jllgu;

    public bghl() {
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    private boolean ghsr_2() {
        tkhdh tkhdh2;
        int n = zy.shtgh(-1270449113);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0xD997452B;
        if ((n2 ^ n) != -644397781) {
            int cfr_ignored_0 = Integer.rotateLeft(0x6DD1390C ^ n, 16) - 1353942959;
        }
        return (tkhdh2 = tkhdh.zkhr_2()).rgha_2() && tkhdh2.rkhh_2() != null && (bghl.hsq(tkhdh2.saa_6, tkhdh2.dtha_2) || bghl.drsh_2(tkhdh2.saa_6, tkhdh2.zqq));
    }

    private void tdhq_2(tsf tsf2) {
        int n = zy.shtgh(772449165);
        int n2 = n ^ 0xCFB81BB0;
        if ((n2 ^ n) != -810017872) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xE1B2B83D ^ n, 15) - 1493298846) * -508381123;
            int cfr_ignored_1 = (int)(0x2300160027D4EB4FL ^ (long)n ^ 0xD170831A2DB9EBD1L);
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        ny ny2 = Moondlc.INSTANCE.getRotationHandler();
        my my2 = ny2.tkhm();
        if (!ny2.smf() && my2 != null && my2.dhthd() == bnsh.stb_3 && !this.ghsr_2()) {
            tsf2.dghz(Moondlc.getInstance().getRotationHandler().dhdf().sry());
        }
    }

    private static void sda_8(shw_3 shw2) {
        int n = zy.shtgh(1637813094);
        int n2 = n ^ 0xD45CE2E2;
        if ((n2 ^ n) != -732110110) {
            int cfr_ignored_0 = Integer.rotateLeft(0xB5C3E984 ^ n, 9) - 118941239;
        }
        Moondlc.getInstance().getRotationHandler().aak_2(shw2.skz_4());
    }

    private static void skhf_2(btt btt2) {
        int n = -2058465368;
        n = Integer.rotateLeft(n * -558033523, 20) ^ 0x9AC1C4E1;
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0xD83CE0BA;
        if ((n2 ^ n) != -667098950) {
            int cfr_ignored_0 = (0x5D72AF12 ^ n) - 798930719;
        }
        Moondlc.getInstance().getRotationHandler().hzsh();
    }

    private static boolean hsq(khd khd2, fy fy2) {
        block0: {
            int n = zy.shtgh(-1308268353);
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            int n2 = n ^ 0xBE35C6B6;
            if ((n2 ^ n) == -1103771978) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC30AE09 ^ n, 4) + 2118300242;
            int cfr_ignored_1 = (int)(0xCE82003427D4EB4FL ^ (long)n ^ 0xFD18831A2DB830D5L);
        }
        return khd2.skhth(fy2);
    }

    private static boolean drsh_2(khd khd2, fy fy2) {
        block0: {
            int n = zy.shtgh(-1042277530);
            khd khd3 = khd2;
            n = Integer.rotateRight((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 4);
            int n2 = n ^ 0xD7A0778;
            if ((n2 ^ n) == 226101112) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xCC9A1C1E ^ n, 12) - -888731939) * -862315489;
        }
        return khd2.skhth(fy2);
    }

    private static String[] ktnn5ckts(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gkykx4br8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ b7e7lwq7 ^ string.hashCode()) + (n2 + q04v6mgqvws) + i ^ b7e7lwq7, 24) + q04v6mgqvws);
            }
            String[] stringArray = bghl.ktnn5ckts(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

