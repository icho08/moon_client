/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_241
 *  net.minecraft.class_290
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1309;
import net.minecraft.class_241;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import us.m0vy.moondlc.m0vyguard.bkha_2;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bdhn;
import us.m0vy.moondlc.m0vyguard.bsz;
import us.m0vy.moondlc.m0vyguard.bss_2;
import us.m0vy.moondlc.m0vyguard.bgha;
import us.m0vy.moondlc.m0vyguard.bmk;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tadh;
import us.m0vy.moondlc.m0vyguard.khh;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dhsh_5;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.qz_2;
import us.m0vy.moondlc.m0vyguard.mf;

public final class tkhr
implements dl,
bsz {
    public static final float khghz = 0.5f;
    public static dhsh_5 zqsh;
    private static dhsh_5 jjth;
    private static dhsh_5 hns_2;
    private static dhsh_5 rar;
    private static dhsh_5 zhl;
    private static dhsh_5 dkhs_2;
    private static dhsh_5 sshd_2;
    private static dhsh_5 hra_2;
    public static bmk khghy;
    private static final mf khns_2;
    private static final int vcrthqw = -1147468585;
    private static final int yt8xt9uj = -478665099;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qgmniqev;

    public static synchronized void dhkhgh() {
        if (zqsh != null && hra_2 != null) {
            return;
        }
        zqsh = new dhsh_5(class_2960.method_60655((String)"moondlc", (String)"rectangle/data"), class_290.field_1576);
        jjth = new dhsh_5(class_2960.method_60655((String)"moondlc", (String)"squircle/data"), class_290.field_1576);
        rar = new dhsh_5(class_2960.method_60655((String)"moondlc", (String)"squircle_texture/data"), class_290.field_1575);
        hns_2 = new dhsh_5(class_2960.method_60655((String)"moondlc", (String)"texture/data"), class_290.field_1575);
        zhl = new dhsh_5(class_2960.method_60655((String)"moondlc", (String)"border/data"), class_290.field_1576);
        dkhs_2 = new dhsh_5(class_2960.method_60655((String)"moondlc", (String)"loading/data"), class_290.field_1576);
        sshd_2 = new dhsh_5(class_2960.method_60655((String)"moondlc", (String)"rect/liquidglass"), class_290.field_1575);
        hra_2 = new dhsh_5(class_2960.method_60655((String)"moondlc", (String)"gradient_rectangle/data"), class_290.field_1576);
        khghy = new bmk();
        khghy.khzj_2();
    }

    public static void dzs_7() {
        tadh.dkhj_2();
    }

    public static void zsz() {
        tadh.ttth_2();
    }

    public static dhsh_5 khsr() {
        return jjth;
    }

    private static byq hjd_2(khh khh2) {
        if (khh2 == null) {
            return null;
        }
        return byq.tkhw(khh2.rlsh());
    }

    private static zth_8 zdhh_2(bss_2 bss2) {
        if (bss2 == null) {
            return null;
        }
        return new zth_8(bss2.topLeftRadius(), bss2.topRightRadius(), bss2.bottomRightRadius(), bss2.bottomLeftRadius());
    }

    private static bkha_2 zgha(qz_2 qz2_2) {
        if (qz2_2 == null) {
            return null;
        }
        return bkha_2.thtl_2(tkhr.hjd_2(qz2_2.dhtq()), tkhr.hjd_2(qz2_2.shdy_2()), tkhr.hjd_2(qz2_2.htha_2()), tkhr.hjd_2(qz2_2.slh_3()));
    }

    private static bgha hdt_3(bdhn bdhn2) {
        if (bdhn2 == null) {
            return null;
        }
        return bgha.valueOf(bdhn2.name());
    }

    public static void smt(class_4587 class_45872, float f, float f2, float f3, float f4, khh khh2) {
        bdht.tqkh(class_45872, f, f2, f3, f4, tkhr.hjd_2(khh2));
    }

    public static void aws_2(class_4587 class_45872, class_241 class_2412, class_241 class_2413, khh khh2) {
        bdht.jdr_2(class_45872, class_2412, class_2413, tkhr.hjd_2(khh2));
    }

    public static void ddhy_2(class_4587 class_45872, class_241 class_2412, class_241 class_2413, class_241 class_2414, class_241 class_2415, khh khh2, int n) {
        bdht.zfz(class_45872, class_2412, class_2413, class_2414, class_2415, tkhr.hjd_2(khh2), n);
    }

    public static void ghry(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        bdht.tzs_5(class_45872, f, f2, f3, f4, f5, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void zrj_2(class_4587 class_45872, float f, float f2, float f3, float f4, bss_2 bss2, khh khh2) {
        bdht.sqr_2(class_45872, f, f2, f3, f4, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void ghdy(class_4587 class_45872, float f, float f2, float f3, float f4, bss_2 bss2, qz_2 qz2_2) {
        bdht.sbd_3(class_45872, f, f2, f3, f4, tkhr.zdhh_2(bss2), tkhr.zgha(qz2_2));
    }

    public static void sshy(class_4587 class_45872, float f, float f2, float f3, float f4, bss_2 bss2, khh khh2, float f5, int n, khh khh3, float f6, boolean bl, float f7, float f8, float f9, boolean bl2) {
        bdht.zkb_2(class_45872, f, f2, f3, f4, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2), f5, n, tkhr.hjd_2(khh3), f6, bl, f7, f8, f9, bl2);
    }

    public static void sndh(class_4587 class_45872, float f, float f2, float f3, float f4, bss_2 bss2, khh khh2, float f5, float f6, khh khh3, float f7, boolean bl, float f8, float f9, float f10, boolean bl2) {
        bdht.zkb_2(class_45872, f, f2, f3, f4, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2), f5, f6, tkhr.hjd_2(khh3), f7, bl, f8, f9, f10, bl2);
    }

    public static void hzth(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        bdht.rsh_4(class_45872, f, f2, f3, f4, f5, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void dhqj(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        bdht.khshy(class_45872, f, f2, f3, f4, f5, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void rlgh(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, khh khh2) {
        bdht.dhmq(class_45872, class_29602, f, f2, f3, f4, tkhr.hjd_2(khh2));
    }

    public static void sshd_3(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, khh khh2) {
        bdht.bsr_2(class_45872, class_29602, f, f2, f3, f4, f5, f6, f7, f8, tkhr.hjd_2(khh2));
    }

    public static void zt_3(class_4587 class_45872, bdhn bdhn2, float f, float f2, float f3, float f4, khh khh2) {
        bdht.zkhs_3(class_45872, tkhr.hdt_3(bdhn2), f, f2, f3, f4, tkhr.hjd_2(khh2));
    }

    public static void skgh_2(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, bss_2 bss2) {
        bdht.khzs(class_45872, class_29602, f, f2, f3, f4, tkhr.zdhh_2(bss2));
    }

    public static void sshh_4(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, bss_2 bss2, khh khh2) {
        bdht.ryth(class_45872, class_29602, f, f2, f3, f4, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void tshj(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        bdht.jfgh(class_45872, f, f2, f3, f4, f5, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void shdhz_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        bdht.bjth(class_45872, f, f2, f3, f4, f5, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void jam_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, bss_2 bss2, khh khh2) {
        bdht.zfy(class_45872, f, f2, f3, f4, f5, f6, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void brw(class_4587 class_45872, class_742 class_7423, float f, float f2, float f3, bss_2 bss2, khh khh2) {
        bdht.htb(class_45872, class_7423, f, f2, f3, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    public static void hath_2(class_4587 class_45872, class_1309 class_13092, float f, float f2, float f3, bss_2 bss2, khh khh2) {
        bdht.zshk(class_45872, class_13092, f, f2, f3, tkhr.zdhh_2(bss2), tkhr.hjd_2(khh2));
    }

    private static String[] prvh35zol(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite vlix59urljrgp1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ vcrthqw ^ string.hashCode() ^ n2 + yt8xt9uj ^ i * -241091259 ^ vcrthqw, 13) ^ yt8xt9uj));
            }
            String[] stringArray = tkhr.prvh35zol(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

