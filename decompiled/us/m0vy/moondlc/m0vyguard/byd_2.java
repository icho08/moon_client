/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.btb;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.bhl_2;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.tdht_2;

public class byd_2
extends bqt {
    private static final float ssw = 17.0f;
    private static final float jhq_2 = 6.0f;
    private static final float dhzw = 4.0f;
    private static final float jtgh = 7.1f;
    private static final float dsz_2 = 9.0f;
    private static final float zrz_2 = 8.1f;
    private static final float jh_2 = -0.3f;
    private static final float szth = 7.0f;
    private static final float dkhz_2 = 8.0f;
    private static final float hzl = 5.0f;
    private static final String dhlt = "{";
    private static final float dhla_2 = 8.6f;
    private static final float hqa_2 = 5.6f;
    private static final float thz = -0.2f;
    private static final float sjd_4 = 3.0f;
    private final tdj khghkh;
    private static final int qqkzsh9 = -131468559;
    private static final int yqp1ofb0r4bp = -2123411096;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int j79ab35k2g92;

    public byd_2() {
        super(78.0f, 158.0f);
        this.khta_3().setWidth(130.0f);
        this.khta_3().setHeight(95.0f);
        this.khghkh = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
        this.khghkh.tyt_3(this::dhqdh);
        this.rght(this.khghkh);
    }

    @Override
    public String getName() {
        return "Moondlc Notifications";
    }

    @Override
    public void lh(class_4587 class_45872) {
        if (bhl_2.skgh.isEmpty()) {
            if (this.tthy()) {
                this.hbd_2(class_45872);
            }
            return;
        }
        float f = this.zfj_2(this.khta_3().getX());
        float f2 = this.zfj_2(this.khta_3().getY());
        float f3 = this.rshw();
        float f4 = mc.method_22683().method_4486();
        float f5 = f + f3 / 2.0f;
        int n = 0;
        n = f5 < f4 * 0.35f ? 0 : (f5 > f4 * 0.65f ? 2 : 1);
        float f6 = 0.0f;
        for (tdht_2 tdht2_2 : bhl_2.skgh) {
            if (tdht2_2.tad_6()) continue;
            f6 = Math.max(f6, this.zqb(tdht2_2));
        }
        float f7 = Math.max(105.0f, f6);
        this.khta_3().setWidth(f7);
        float f8 = 0.0f;
        for (tdht_2 tdht3_2 : bhl_2.skgh) {
            tdht3_2.sjt_4.sbsh_2(1.0, 330L, tbm.tba, true);
            tdht3_2.sjt_4.ddhdh();
            if (tdht3_2.rsht_2()) {
                tdht3_2.ssn.sbsh_2(1.0, 280L, tbm.hrkh, true);
                tdht3_2.ssn.ddhdh();
            }
            if (tdht3_2.tad_6()) {
                bhl_2.skgh.remove(tdht3_2);
                continue;
            }
            float f9 = 1.0f - (float)tdht3_2.ssn.khbk();
            float f10 = (float)tdht3_2.sjt_4.khbk();
            float f11 = Math.max(0.0f, Math.min(1.0f, f9));
            if (f11 <= 0.01f) continue;
            float f12 = this.zqb(tdht3_2);
            float f13 = n == 1 ? f + (f3 - f12) / 2.0f : (n == 2 ? f + f3 - f12 : f);
            float f14 = 4.0f;
            f13 = Math.max(f14, Math.min(f13, f4 - f12 - f14));
            float f15 = f2 + f8;
            if (tdht3_2.hs_2.khbk() == -1.0) {
                tdht3_2.hs_2.shkh_6(f15 - 8.0f);
            }
            tdht3_2.hs_2.sbsh_2(f15, 240L, tbm.srdh, true);
            tdht3_2.hs_2.ddhdh();
            float f16 = (float)tdht3_2.hs_2.khbk() - (1.0f - f10) * 5.0f;
            this.khkhgh(class_45872, tdht3_2, f13, f16, f12, f11);
            f8 += 21.0f;
        }
        this.khta_3().setHeight(Math.max(17.0f, Math.max(0.0f, f8 - 4.0f)));
    }

    private void hbd_2(class_4587 class_45872) {
        float f = this.zfj_2(this.khta_3().getX());
        float f2 = this.zfj_2(this.khta_3().getY());
        float f3 = this.rshw();
        this.ztf(class_45872, f, f2, f3, 1.0f);
        this.tdth_3(class_45872, f, f2, 1.0f, btb.jdz, true);
        this.snth_2(class_45872, f, f2, 1.0f);
        float f4 = this.hzgh_2(f);
        this.shns_2(class_45872, f4, f2, "Default", "notify", 1.0f);
        this.khta_3().setWidth(f3);
        this.khta_3().setHeight(17.0f);
    }

    private void khkhgh(class_4587 class_45872, tdht_2 tdht2_2, float f, float f2, float f3, float f4) {
        this.ztf(class_45872, f, f2, f3, f4);
        this.tdth_3(class_45872, f, f2, f4, tdht2_2.hath, tdht2_2.hbz);
        this.snth_2(class_45872, f, f2, f4);
        this.shns_2(class_45872, this.hzgh_2(f), f2, bhl_2.dshy_2(tdht2_2.tms), tdht2_2.dha_3, f4);
    }

    private void ztf(class_4587 class_45872, float f, float f2, float f3, float f4) {
        tbkh.bsdh_2(class_45872, f, f2, f3, 17.0f, f4, 6.0f);
        tbkh.ja_2(class_45872, f, f2, f3, 17.0f, 6.0f, 0.32f, f4);
    }

    private void tdth_3(class_4587 class_45872, float f, float f2, float f3, btb btb2, boolean bl) {
        String string = btb2 == btb.jdz ? "i" : "q";
        bsh_2 bsh2 = this.ztr();
        float f4 = bsh2.shdf_2(string, 8.1f);
        float f5 = f + 7.0f + 4.5f - f4 / 2.0f;
        float f6 = f2 + 8.5f - 4.05f + -0.3f;
        Color color = bl || btb2 == btb.jdz ? bas_4.tdth_2(Math.round(255.0f * f3)) : new Color(150, 150, 150, Math.round(255.0f * f3));
        bsh2.zskh_4(class_45872, string, f5, f6, 8.1f, color, 0.0f);
    }

    private void snth_2(class_4587 class_45872, float f, float f2, float f3) {
        bsh_2 bsh2 = this.ztr();
        float f4 = f + 7.0f + 9.0f + 5.0f - 1.2f;
        float f5 = f2 + 8.5f - 4.3f + -0.2f;
        bsh2.zskh_4(class_45872, dhlt, f4, f5, 8.6f, tbkh.thty_2(0.58f * f3), 0.0f);
    }

    private void shns_2(class_4587 class_45872, float f, float f2, String string, String string2, float f3) {
        bsh_2 bsh2 = this.khh();
        float f4 = f2 + 8.5f - 3.55f - 0.8f;
        Color color = tbkh.hkdh(f3);
        Color color2 = bas_4.tdth_2(Math.round(255.0f * f3));
        if (string == null || string.isEmpty()) {
            bsh2.zskh_4(class_45872, string2, f, f4, 7.1f, color, 0.0f);
        } else if (string2 == null || string2.isEmpty()) {
            bsh2.zskh_4(class_45872, string, f, f4, 7.1f, color, 0.0f);
        } else {
            bsh2.zskh_4(class_45872, string, f, f4, 7.1f, color, 0.0f);
            float f5 = bsh2.shdf_2(string, 7.1f);
            bsh2.zskh_4(class_45872, string2, f + f5 + 3.0f, f4, 7.1f, color2, 0.0f);
        }
    }

    private float zqb(tdht_2 tdht2_2) {
        String string = bhl_2.dshy_2(tdht2_2.tms);
        String string2 = tdht2_2.dha_3;
        float f = 0.0f;
        if (string != null && !string.isEmpty()) {
            f += this.khh().shdf_2(string, 7.1f);
            if (string2 != null && !string2.isEmpty()) {
                f += 3.0f + this.khh().shdf_2(string2, 7.1f);
            }
        } else if (string2 != null && !string2.isEmpty()) {
            f += this.khh().shdf_2(string2, 7.1f);
        }
        return this.jthkh() + f + 8.0f;
    }

    private float rshw() {
        return this.jthkh() + this.khh().shdf_2("Default", 7.1f) + 3.0f + this.khh().shdf_2("notify", 7.1f) + 8.0f;
    }

    private float hzgh_2(float f) {
        return f + this.jthkh();
    }

    private float jthkh() {
        return 31.6f;
    }

    private void dhqdh(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] qirqif6sf(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ixx90utjk9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ qqkzsh9 ^ string.hashCode() ^ n2 + yqp1ofb0r4bp + i * 146436769) + qqkzsh9) ^ yqp1ofb0r4bp));
            }
            String[] stringArray = byd_2.qirqif6sf(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

