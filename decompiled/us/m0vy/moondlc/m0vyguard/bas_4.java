/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.bnn;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthw;
import us.m0vy.moondlc.m0vyguard.fd;

public class bas_4 {
    private static final int vs5ffq9ca = -568834174;
    private static final int t2hfrslvy6je = 469298656;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dtm5tqsqz2wr2f;

    public static fd tzm_2() {
        return tthw.sfs_3().stm_3();
    }

    private static Color tjth(Color color, int n) {
        int n2 = (int)((float)color.getAlpha() / 255.0f * (float)n);
        return brb.zmn_2(color, n2);
    }

    public static Color hmq(int n) {
        return bas_4.ththsh(n, 255);
    }

    public static Color ththsh(int n, int n2) {
        return bas_4.tjth(brb.jma(15, n, bas_4.tdth_2(n2), bas_4.dhfk(n2)), n2);
    }

    public static Color dhlj() {
        return bas_4.zkhm(255);
    }

    public static Color zkhm(int n) {
        return bas_4.tjth(bas_4.tzm_2().zjs_3(), n);
    }

    public static Color jtha() {
        return bas_4.dhyf(255);
    }

    public static Color dhyf(int n) {
        return bas_4.tjth(bas_4.tzm_2().jghgh(), n);
    }

    public static Color zan_3() {
        return bas_4.zab_4(255);
    }

    public static Color zab_4(int n) {
        return bas_4.tjth(bas_4.tzm_2().tmd_3(), n);
    }

    public static Color zsz_4() {
        return bas_4.tdth_2(255);
    }

    public static Color tdth_2(int n) {
        byq byq2 = bnn.dzb_2().kb();
        if (byq2 != null) {
            return new Color((int)byq2.sbk(), (int)byq2.srl(), (int)byq2.shsl_2(), Math.min(255, Math.max(0, n)));
        }
        return bas_4.tjth(bas_4.tzm_2().rdm_2(), n);
    }

    public static Color tkb_2() {
        return bas_4.dhfk(255);
    }

    public static Color dhfk(int n) {
        byq byq2 = bnn.dzb_2().rha_3();
        if (byq2 != null) {
            return new Color((int)byq2.sbk(), (int)byq2.srl(), (int)byq2.shsl_2(), Math.min(255, Math.max(0, n)));
        }
        return bas_4.tjth(bas_4.tzm_2().shthz(), n);
    }

    public static Color thqa() {
        return bas_4.zdhn(255);
    }

    public static Color zdhn(int n) {
        return bas_4.tdth_2(n);
    }

    public static Color shnb() {
        return bas_4.ata_2(255);
    }

    public static Color ata_2(int n) {
        return bas_4.tjth(bas_4.tzm_2().sdd_2(), n);
    }

    public static Color ghss() {
        return bas_4.khan(255);
    }

    public static Color khan(int n) {
        return bas_4.tjth(bas_4.tzm_2().dtm_3(), n);
    }

    public static Color shjz() {
        return bas_4.rykh(255);
    }

    public static Color rykh(int n) {
        return bas_4.tjth(bas_4.tzm_2().dhygh(), n);
    }

    public static Color thaj() {
        return bas_4.khtha(255);
    }

    public static Color khtha(int n) {
        return bas_4.tjth(bas_4.tzm_2().rht_3(), n);
    }

    public static Color dsl_3() {
        return bas_4.ghza_4(255);
    }

    public static Color ghza_4(int n) {
        return bas_4.tjth(bas_4.tzm_2().dydh_2(), n);
    }

    public static Color jwa_2() {
        return bas_4.dkhs_2(255);
    }

    public static Color dkhs_2(int n) {
        return bas_4.tjth(bas_4.tzm_2().bwt_2(), n);
    }

    private static String[] x7ljdsew(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xgvzeg3i4b6rt(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ vs5ffq9ca ^ string.hashCode() ^ n2 + t2hfrslvy6je ^ i * 890040729 ^ vs5ffq9ca, 15) ^ t2hfrslvy6je));
            }
            String[] stringArray = bas_4.x7ljdsew(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

