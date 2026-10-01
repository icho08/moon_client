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
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.sgh;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.qk;
import us.movy.moondlc.Moondlc;

public class ta_4 {
    private final qk shrs;
    private final String thfb;
    private final String dhst;
    private final tkhd_2 shkd = new tkhd_2();
    private final long zsh_3;
    private final fa_2 rad_4 = new fa_2(400L, jkh.hd_2);
    private final fa_2 hqsh = new fa_2(300L, jkh.shhj);
    private final fa_2 dhdt_4 = new fa_2(300L, jkh.tdth);
    private static final int mnov8tr8 = 839003520;
    private static final int rxmoeyo = -1236661510;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vi6m8p66;

    public ta_4(qk qk2, String string, String string2) {
        this.shrs = qk2;
        this.thfb = string;
        this.dhst = string2;
        this.zsh_3 = 2000L;
    }

    public void thkl(ghdh_3 ghdh2, float f) {
        float f2 = Math.max(bmn.shmz.twy_2(7.0f).dak(this.thfb), bmn.sdha_2.twy_2(6.0f).dak(this.dhst));
        float f3 = f2 + 32.0f;
        this.dhdt_4.dam_2(jkh.shhj);
        this.dhdt_4.zkhdh(300L);
        float f4 = (float)ghdh2.method_51421() / 2.0f - f3 / 2.0f;
        float f5 = (float)ghdh2.method_51443() - 90.0f - this.dhdt_4.khmf(f);
        float f6 = 26.0f;
        int n = (int)(255.0f * this.rad_4.tssh_2());
        shk_3.bdhkh(ghdh2.method_51448(), f4 + f3 / 2.0f, f5 + 12.0f + f6 / 2.0f, 0.5f + 0.5f * this.rad_4.tssh_2());
        if (sgh.drgh()) {
            ghdh2.drawLiquidGlass(f4, f5, f3, f6, 7.0f, 0.08f, zth_8.all(7.0f), byq.brz_2.tkhl_2(255.0f * this.rad_4.tssh_2() * sgh.swk_2()));
            ghdh2.drawSquircle(f4, f5, f3, f6, 7.0f, zth_8.all(7.0f), bhj_2.khhy_2().tkhl_2(255.0f * (0.8f - 0.6f * sgh.swk_2()) * this.rad_4.tssh_2()));
        } else {
            ghdh2.drawBlurredRect(f4, f5, f3, f6, 45.0f, 7.0f, zth_8.all(7.0f), byq.brz_2.tkhl_2(255.0f * this.rad_4.tssh_2() * sgh.tqa()));
            ghdh2.drawSquircle(f4, f5, f3, f6, 7.0f, zth_8.all(7.0f), new byq(0.0f, 0.0f, 0.0f).tkhl_2((int)(140.25f * this.rad_4.tssh_2())));
            ghdh2.drawRoundedRect(f4 + f6 / 2.0f - 9.0f, f5 + f6 / 2.0f - 9.0f, 18.0f, 18.0f, zth_8.all(4.0f), new byq(0.0f, 0.0f, 0.0f).tkhl_2((int)(51.0f * this.rad_4.tssh_2())));
        }
        ghdh2.drawTexture(Moondlc.id("icons/" + this.shrs.getName() + ".png"), f4 + f6 / 2.0f - 4.5f, f5 + f6 / 2.0f - 4.5f, 10.0f, 10.0f, this.shrs.getColor().tkhl_2((float)n * 0.8f));
        ghdh2.drawText(bmn.shmz.twy_2(7.0f), this.thfb, f4 + 27.0f, f5 + 7.0f, byq.brz_2.tkhl_2(n));
        ghdh2.drawText(bmn.sdha_2.twy_2(6.0f), this.dhst, f4 + 27.0f, f5 + 15.0f, byq.brz_2.tkhl_2(n));
        shk_3.hbj(ghdh2.method_51448());
    }

    public void ada_2() {
        this.rad_4.zkhdh(400L);
        this.rad_4.dam_2(this.shkd.tagh(this.zsh_3) ? jkh.hthd : jkh.hd_2);
        this.rad_4.khmf(this.shkd.tagh(this.zsh_3) ? 0.0f : 1.0f);
    }

    public boolean ghtn() {
        return this.rad_4.tssh_2() == 0.0f && this.shkd.tagh(this.zsh_3);
    }

    @Generated
    public qk drl_2() {
        return this.shrs;
    }

    @Generated
    public String skhy_2() {
        return this.thfb;
    }

    @Generated
    public String thlk() {
        return this.dhst;
    }

    @Generated
    public tkhd_2 zhw_2() {
        return this.shkd;
    }

    @Generated
    public long thzm_2() {
        return this.zsh_3;
    }

    @Generated
    public fa_2 szdh() {
        return this.rad_4;
    }

    @Generated
    public fa_2 thfz_2() {
        return this.hqsh;
    }

    @Generated
    public fa_2 dts_6() {
        return this.dhdt_4;
    }

    private static String[] bm80i9m3(String string) {
        return string.split("\u0003\u001e", -1);
    }

    private static CallSite du8b0df4gdyv8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ mnov8tr8 ^ string.hashCode() ^ n2 + rxmoeyo + i * 1597300955) + mnov8tr8) ^ rxmoeyo));
            }
            String[] stringArray = ta_4.bm80i9m3(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

