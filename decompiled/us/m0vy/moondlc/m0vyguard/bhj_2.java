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
import us.m0vy.moondlc.m0vyguard.bdd_3;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthn;
import us.m0vy.moondlc.m0vyguard.tthw;
import us.m0vy.moondlc.m0vyguard.fd;
import us.movy.moondlc.Moondlc;

public final class bhj_2 {
    public static final byq khnh;
    public static final byq sll;
    public static final byq shdhn;
    public static final byq rrd;
    public static final byq bdhj;
    public static final byq bsdh_2;
    private static final long smw = 500L;
    private static final bdd_3 khaz_4;
    private static final bdd_3 srgh;
    private static final bdd_3 rthl;
    private static final bdd_3 hkkh;
    private static final bdd_3 tlw;
    private static final bdd_3 dhsgh_2;
    private static final bdd_3 tly;
    private static final bdd_3 sbk;
    private static int dlm;
    private static byq zzh_4;
    private static final int h9684rq = -1833042680;
    private static final int do3b6nme0 = 2042178287;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nhjodifiw5;

    private static tthn ya() {
        return Moondlc.getInstance().getThemeManager().zskh_2();
    }

    public static byq khhy_2() {
        return bhj_2.bar(khaz_4, bhj_2.ya().getBackgroundColor());
    }

    public static byq bdhh() {
        return bhj_2.bar(srgh, bhj_2.ya().getAdditionalColor());
    }

    public static byq bzs() {
        return bhj_2.bar(rthl, bhj_2.ya().getTextColor());
    }

    public static byq zzq_2() {
        return bhj_2.bar(hkkh, bhj_2.ya().getOutlineColor());
    }

    public static byq szs_4() {
        return bhj_2.bar(tlw, bhj_2.ya().getFlatColor());
    }

    public static byq ths() {
        return bhj_2.bar(dhsgh_2, bhj_2.thdkh());
    }

    private static byq thdkh() {
        fd fd2 = tthw.sfs_3().stm_3();
        if (fd2 == null) {
            tthn tthn2 = bhj_2.ya();
            return tthn2 == null ? bsdh_2 : tthn2.getAccentColor();
        }
        Color color = fd2.rdm_2();
        int n = color.getRGB();
        if (n != dlm) {
            dlm = n;
            zzh_4 = new byq(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        }
        return zzh_4;
    }

    public static byq ghdj_2() {
        return bhj_2.bar(tly, bhj_2.ya().getIconsColor());
    }

    public static byq ddt() {
        return bhj_2.bar(sbk, bhj_2.ya().getEnabledModulesColor());
    }

    public static byq daw_4() {
        return byq.dhww.tkhl_2(255.0f * (bhj_2.ya() == tthn.jthj ? 0.08f : 0.05f));
    }

    private static byq bar(bdd_3 bdd2, byq byq2) {
        bdd2.zsa_8(byq2);
        return bdd2.dsr_4();
    }

    @Generated
    private bhj_2() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] iwem7rxnjg(String string) {
        return string.split("\u0003\u000e", -1);
    }

    private static CallSite uovmurzp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ h9684rq ^ string.hashCode() ^ n2 + do3b6nme0 ^ i * 1348155007 ^ h9684rq, 5) ^ do3b6nme0));
            }
            String[] stringArray = bhj_2.iwem7rxnjg(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

