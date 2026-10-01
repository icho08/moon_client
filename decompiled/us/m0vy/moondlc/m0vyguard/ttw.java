/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.SplittableRandom;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bjt;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bmd_2;
import us.m0vy.moondlc.m0vyguard.bhw_2;
import us.m0vy.moondlc.m0vyguard.thy;
import us.m0vy.moondlc.m0vyguard.sa;
import us.m0vy.moondlc.m0vyguard.ky;
import us.m0vy.moondlc.m0vyguard.lb;

public final class ttw
implements bmd_2 {
    private static final float dhnsh = 120.0f;
    private static final float st_4 = 85.0f;
    private static final float dwd_2 = 60.0f;
    private static final float zdz = 40.0f;
    private static final float dfh = 45.0f;
    private static final float hdn = 35.0f;
    private static final float jghr = 0.85f;
    private static final float dhjb = 1.0E-5f;
    private final SplittableRandom ztm = new SplittableRandom();
    private final sa khsm_2 = new sa(thy.thsa_4);
    private final ky rzt_2 = new ky();
    private boolean shdhs;
    private float shzj_2;
    private float bdhk;
    private float dhkhz_2;
    private float khts_3;
    private static final int jdm = 1623117664;
    private static final int rsy = -219634771;
    private static final int f8q3gzovhugd = -718340526;
    private static final int iwie8ctung = -1579448625;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tka9wtuo;

    @Override
    public lb ysh(lb lb2, lb lb3, class_1309 class_13092, boolean bl, boolean bl2) {
        if (lb2 == null || lb3 == null) {
            return lb2 != null ? lb2 : lb3;
        }
        this.bky(lb3);
        boolean bl3 = !bl2 || !bl;
        this.khsm_2.dkf();
        float f = bl3 ? 0.5f : 0.22f;
        float f2 = bghdh.bds_3(lb2.sry(), lb3.sry() + this.dhkhz_2 * f);
        float f3 = class_3532.method_15363((float)(lb3.khdhd_2() + this.khts_3 * f), (float)-90.0f, (float)90.0f);
        float f4 = f2 - lb2.sry();
        float f5 = f3 - lb2.khdhd_2();
        float f6 = (float)Math.hypot(f4, f5);
        float f7 = this.khsm_2.dtk_4(f6, bl);
        float f8 = this.khsm_2.zdn(bhw_2.shtr) * 0.04f;
        float f9 = this.khsm_2.zdn(bhw_2.tnd) * 0.03f;
        float f10 = this.khsm_2.dhsm_2(bhw_2.shtr, bl);
        float f11 = this.khsm_2.dhsm_2(bhw_2.tnd, bl);
        double d = bl3 ? 1.02 : 1.03 + this.ztm.nextDouble() * 0.08;
        double d2 = bl3 ? 1.05 : 1.05 + this.ztm.nextDouble() * 0.1;
        float f12 = bl3 ? 120.0f : 85.0f;
        float f13 = bl3 ? 60.0f : 40.0f;
        float f14 = this.bhl_2(f4, f12, 45.0f, d, f8, f10, f7, bl, bl2);
        float f15 = this.bhl_2(f5, f13, 35.0f, d2, f9, f11, f7, bl, bl2);
        if (!bl && !bl2) {
            f15 += this.khsm_2.tdf(f14);
        }
        return new lb(lb2.sry() + f14, class_3532.method_15363((float)(lb2.khdhd_2() + f15), (float)-90.0f, (float)90.0f));
    }

    private void bky(lb lb2) {
        if (!this.shdhs) {
            this.shzj_2 = lb2.sry();
            this.bdhk = lb2.khdhd_2();
            this.dhkhz_2 = 0.0f;
            this.khts_3 = 0.0f;
            this.shdhs = true;
            return;
        }
        float f = class_3532.method_15363((float)bghdh.ttb_2(this.shzj_2, lb2.sry()), (float)-45.0f, (float)45.0f);
        float f2 = class_3532.method_15363((float)(lb2.khdhd_2() - this.bdhk), (float)-25.0f, (float)25.0f);
        this.dhkhz_2 = class_3532.method_16439((float)0.55f, (float)this.dhkhz_2, (float)f);
        this.khts_3 = class_3532.method_16439((float)0.55f, (float)this.khts_3, (float)f2);
        this.shzj_2 = lb2.sry();
        this.bdhk = lb2.khdhd_2();
    }

    @Override
    public float shgh_3() {
        block0: {
            int n = -639567586;
            int n2 = (n = Integer.rotateLeft(n * 729521143, 3) ^ 0x71AE6F68) ^ 0xD4ABB528;
            if ((n2 ^ n) == -726944472) break block0;
            int cfr_ignored_0 = (0xD4B4C36 ^ n) + -1048198347;
        }
        return Float.intBitsToFloat(-594929833 - -1714022569);
    }

    @Override
    public float hghs() {
        block0: {
            int n = -548225570;
            n = Integer.rotateLeft(n * 993781817, 16) ^ 0x3863DDCC;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
            int n2 = n ^ 0x6AE265C7;
            if ((n2 ^ n) == 1793222087) break block0;
            int cfr_ignored_0 = (0xB5B0D819 ^ n) - -1773354151;
        }
        return Float.intBitsToFloat(1470974736 - 360270608);
    }

    public lb zbh_3(lb lb2, lb lb3) {
        return this.rzt_2.zft(lb2, lb3);
    }

    private float bhl_2(float f, float f2, float f3, double d, float f4, float f5, float f6, boolean bl, boolean bl2) {
        float f7;
        float f8;
        int n = bjt.rjq(1733157739);
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f2) ^ n;
        int n2 = n ^ 0xFE8AF9;
        if ((n2 ^ n) != 16681721) {
            int cfr_ignored_0 = (Integer.rotateRight(0x67B36992 ^ n, 15) + -1827182615) * 1739811219;
        }
        if (!Float.isFinite(f) || Math.abs(f) <= Float.intBitsToFloat(-2004337653 + -1365276255)) {
            return 0.0f;
        }
        float f9 = Math.abs(f);
        float f10 = class_3532.method_15363((float)(f9 / f3), (float)0.0f, (float)1.0f);
        float f11 = (float)Math.pow(f10, d);
        if (!bl2) {
            f8 = class_3532.method_15363((float)(f5 + f4 * Float.intBitsToFloat(865239974 + 177296228) + Float.intBitsToFloat(0xA7FAC988 ^ 0x997AC988)), (float)Float.intBitsToFloat(0xECE1B5E3 ^ 0xD36D792E), (float)ttw.bsd(Integer.reverse(782667319) ^ 0xD3C8FCEE));
        } else if (bl) {
            f8 = ttw.zda_2(f5 + f4 * Float.intBitsToFloat(1783989333 - 747157384) + Float.intBitsToFloat(-286229352 - -1327423377), Float.intBitsToFloat(871036826 + 194987479), Float.intBitsToFloat(0xE3BF1F8F ^ 0xDC1CC885));
        } else {
            f7 = Float.intBitsToFloat(Integer.reverse(-208687809) ^ 0xC3EC6855) + (float)this.ztm.nextDouble() * ttw.dts(Integer.rotateLeft(0xF253F9D1 ^ 0x33A3351D, 5));
            f8 = class_3532.method_15363((float)(f7 * f5 * f6 + f4), (float)Float.intBitsToFloat(153066027 - -910609467), (float)Float.intBitsToFloat(0xF9969419 ^ 0xC6369419));
        }
        f7 = !bl2 ? Math.max(f11, Float.intBitsToFloat(188306615 - -874026702)) : (bl ? Math.max(f11, Float.intBitsToFloat(ttw.hhb_2(-918175492) ^ 0x3BF37F)) : Math.max(f11, Float.intBitsToFloat(369974896 + 688667434)));
        float f12 = f2 * f7 * f8;
        float f13 = Math.min(f9, Math.min(f2, f12));
        return Math.copySign(f13, f);
    }

    @Override
    public void tf() {
        int n = -832732933;
        int n2 = (n = Integer.rotateLeft(n * -947564505, 26) ^ 0x9A78E846) ^ 0x7B2E9053;
        if ((n2 ^ n) != 2066649171) {
            int cfr_ignored_0 = (0xB57310A8 ^ n) - 570034173;
        }
        this.shdhs = false;
        this.shzj_2 = 0.0f;
        this.bdhk = 0.0f;
        this.dhkhz_2 = 0.0f;
        this.khts_3 = 0.0f;
        this.khsm_2.tyw();
        ttw.mt_2(this.rzt_2);
    }

    @Override
    public void mgh(class_1309 class_13092) {
        int n = bjt.rjq(411505993);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x803824A0;
        if ((n2 ^ n) != -2143804256) {
            int cfr_ignored_0 = Integer.rotateLeft(0x98BF31E9 ^ n, 6) + -2088457614;
            int cfr_ignored_1 = (int)(0x5A0D9FD427D4EB4FL ^ (long)n ^ 0xC2D8831A2DB919CAL);
        }
        ttw.aakh(this);
    }

    private static float bsd(int n) {
        block0: {
            int n2 = -1618283932;
            n2 = Integer.rotateLeft(n2 * 242010055, 25) ^ 0xF5A62961;
            int n3 = (n2 = n ^ n2) ^ 0xD683D948;
            if ((n3 ^ n2) == -696002232) break block0;
            int cfr_ignored_0 = (0x49092B2C ^ n2) - 1302557587;
        }
        return Float.intBitsToFloat(n);
    }

    private static float zda_2(float f, float f2, float f3) {
        block0: {
            int n = 2051312956;
            n = Integer.rotateLeft(n * -893359641, 24) ^ 0x53DC8C3E;
            n = Float.floatToIntBits(f) ^ n;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x4221A71A;
            if ((n2 ^ n) == 1109501722) break block0;
            int cfr_ignored_0 = (0x38652A26 ^ n) + 440005965;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float dts(int n) {
        block0: {
            int n2 = -504523431;
            n2 = Integer.rotateLeft(n2 * 1360933233, 25) ^ 0xBEA2EAF5;
            int n3 = (n2 = n ^ n2) ^ 0x282CCED6;
            if ((n3 ^ n2) == 674025174) break block0;
            int cfr_ignored_0 = (0xC9C15B8F ^ n2) - -822030963;
        }
        return Float.intBitsToFloat(n);
    }

    private static int hhb_2(int n) {
        block0: {
            int n2 = 1791202878;
            int n3 = (n2 = Integer.rotateLeft(n2 * -362231761, 15) ^ 0xADC25EC6) ^ 0xB50E8477;
            if ((n3 ^ n2) == -1257339785) break block0;
            int cfr_ignored_0 = (0xDFCD1249 ^ n2) - 738328407;
        }
        return Integer.reverse(n);
    }

    private static void mt_2(ky ky2) {
        int n = -1202616190;
        int n2 = (n = Integer.rotateLeft(n * 735690287, 3) ^ 0xD79CE720) ^ 0x995214B0;
        if ((n2 ^ n) != -1722674000) {
            int cfr_ignored_0 = (0x21039C32 ^ n) - 835382127;
        }
        ky2.ryq();
    }

    private static void aakh(ttw ttw2) {
        int n = -143405966;
        int n2 = (n = Integer.rotateLeft(n * -1095152613, 22) ^ 0x4BEBB128) ^ 0x245A2DD4;
        if ((n2 ^ n) != 609889748) {
            int cfr_ignored_0 = (0xD329E1A6 ^ n) - -342225436;
        }
        ttw2.tf();
    }

    private static String[] fdh(String string) {
        int n = 1609272979;
        n = Integer.rotateLeft(n * 1116942645, 10) ^ 0x4950971E;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x352E386;
        if ((n2 ^ n) != 55763846) {
            int cfr_ignored_0 = (0x5CB96D15 ^ n) + -234766919;
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

    private static CallSite std_7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -663797158;
            n3 = Integer.rotateLeft(n3 * 1176336123, 11) ^ 0x267E981C;
            Class clazz2 = clazz;
            n3 = Integer.rotateRight((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n3, 26);
            int n4 = n3 ^ 0x80F75B63;
            if ((n4 ^ n3) != -2131272861) {
                int cfr_ignored_0 = (0x58981939 ^ n3) - -711521756;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ jdm ^ string.hashCode() ^ n2 + rsy ^ i * -2102630443 ^ jdm, 3) ^ rsy));
            }
            String[] stringArray = ttw.fdh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ds0uzc6hsl0k30(String string) {
        return string.split("\b\u0018", -1);
    }

    private static CallSite ifqndeyf297c(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ f8q3gzovhugd ^ string.hashCode()) + (n2 + iwie8ctung) + i ^ f8q3gzovhugd, 18) + iwie8ctung);
            }
            String[] stringArray = ttw.ds0uzc6hsl0k30(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

