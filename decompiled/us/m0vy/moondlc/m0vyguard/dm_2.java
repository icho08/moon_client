/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bhdh;
import us.m0vy.moondlc.m0vyguard.bkhh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.tat_2;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.rs;
import us.m0vy.moondlc.m0vyguard.lq;
import us.m0vy.moondlc.m0vyguard.wsh;

public class dm_2
extends tat_2 {
    private static final dm_2 zshsh;
    private final String thzz_2 = "Enter config name...";
    private String thh_6 = "";
    private boolean khzkh;
    private wsh khzsh_2 = new wsh(-1.0f, -1.0f, -1.0f);
    private final bjz htl_2 = new bjz();
    private boolean jkhz;
    private float sdq;
    private List rs_2 = new ArrayList();
    private static final int ajqmx507 = -1238434678;
    private static final int xkvxpy8qn = -494535572;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int iyv4jocnwi4hb;

    private int zrq() {
        return (int)(this.htl_2.khbk() * (double)this.sdq * 255.0);
    }

    public dm_2() {
        this.rghh_2(this.dsa_2(95.0f));
        this.sar(this.dsa_2(150.0f));
        rs.tt().jkhh_2(new lq(-1, this::shkz_2));
    }

    public void hb() {
        this.jta();
    }

    private void jta() {
        this.rs_2 = bhdh.khsb().ml();
    }

    @Override
    public void hagh_2(class_332 class_3322, int n, int n2, float f) {
        this.htl_2.ddhdh();
        this.htl_2.shd_6(this.jkhz ? 1.0 : 0.0, 100L, tbm.hrkh);
        if (this.htl_2.khbk() <= 0.1) {
            return;
        }
        float f2 = this.dghgh() * 0.05f;
        float f3 = this.dsa_2(this.tydh());
        float f4 = f3 * 0.52f;
        String string = "Config Manager";
        float f5 = brz_2.thtkh_2.shdf_2(string, f4);
        this.rghh_2(f5 * 1.5f);
        class_4587 class_45872 = class_3322.method_51448();
        bjgh.thqf.tgha_2(class_45872, this.sjr(), this.shha_2(), this.dghgh(), this.bkgh(), f2, bas_4.zkhm(this.zrq()));
        brz_2.thtkh_2.jdz(class_45872, string, this.sjr() + this.dghgh() / 2.0f - f5 / 2.0f, this.shha_2() + f3 / 2.0f - f4 / 2.0f, f4, bas_4.tdth_2(this.zrq()), bas_4.dhfk(this.zrq()), brz_2.thtkh_2.shdf_2(string, f4) / 4.0f);
        this.ghrsh(class_3322, n, n2, f);
        float f6 = this.sjr() + this.dhh_3();
        float f7 = this.dghgh() - this.dhh_3() * 2.0f;
        float f8 = this.shkt() + f3 + this.tbq_2()[3];
        for (String string2 : this.rs_2) {
            float f9;
            float f10 = this.shha_2() + f8;
            boolean bl = baf.zath(n, n2, f6, f10, f7, f9 = this.dsa_2(17.0f));
            int n3 = bl ? bas_4.tdth_2(this.zrq()).getRGB() : bas_4.khan(this.zrq()).getRGB();
            String string3 = bhdh.khsb().dhth_3();
            if (string2.equals(string3)) {
                n3 = bas_4.khtha(this.zrq()).getRGB();
            }
            brz_2.ryk.thsz_4(class_45872, string2, f6 + f7 / 2.0f, f10 + f9 / 2.0f - f9 * 0.4f / 2.0f, f9 * 0.4f, new Color(n3, true));
            f8 += f9 + this.shkt();
        }
        this.sar(f8);
    }

    private void ghrsh(class_332 class_3322, int n, int n2, float f) {
        class_4587 class_45872 = class_3322.method_51448();
        float[] fArray = this.tbq_2();
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        float f5 = fArray[3];
        float f6 = f5 * 0.4f;
        float f7 = f5 * 0.2f;
        String string = this.khzkh && System.currentTimeMillis() % 1000L > 500L ? "_" : " ";
        Object object = this.thh_6.isEmpty() && !this.khzkh ? "Enter config name..." : this.thh_6 + string;
        bjgh.thqf.tgha_2(class_45872, f2, f3, f4, f5, f7, bas_4.dhyf(this.zrq()));
        brz_2.thtkh_2.thdsh_2(class_45872, (String)object, f2 + this.dhh_3(), f3 + f5 / 2.0f - f6 / 2.0f, f6, bas_4.khan(this.zrq()));
        if (!this.thh_6.isEmpty()) {
            float f8 = this.shkt();
            float f9 = f5 - f8 * 2.0f;
            float f10 = f2 + this.dghgh() - f9 - f8 - this.dhh_3() * 2.0f;
            float f11 = f3 + f8;
            float f12 = f9 * 0.5f;
            bjgh.thqf.tgha_2(class_45872, f10, f11, f9, f9, f7, bas_4.dkhs_2(this.zrq()));
            brz_2.jhw_2.sjw_2(class_45872, bkhh.hdhkh.getLetter(), f10 + f9 / 2.0f, f11 + f9 / 2.0f - f12 / 2.0f, f12, bas_4.khan(this.zrq()), 0.1f);
            this.khzsh_2 = new wsh(f10, f11, f9);
            float f13 = f10 - f9 - f8;
            bjgh.thqf.tgha_2(class_45872, f13, f11, f9, f9, f7, bas_4.khtha(this.zrq()));
            brz_2.jhw_2.sjw_2(class_45872, "+", f13 + f9 / 2.0f, f11 + f9 / 2.0f - f12 / 2.0f, f12, bas_4.khan(this.zrq()), 0.1f);
        } else {
            this.khzsh_2 = new wsh(-1.0f, -1.0f, -1.0f);
        }
    }

    @Override
    public void thda_2(int n, int n2, int n3) {
        if (!this.jkhz) {
            return;
        }
        if (this.khzkh) {
            switch (n) {
                case 259: {
                    if (this.thh_6.isEmpty()) break;
                    this.thh_6 = this.thh_6.substring(0, this.thh_6.length() - 1);
                    break;
                }
                case 257: {
                    if (this.thh_6.isEmpty()) break;
                    bhdh.khsb().daw_3(this.thh_6);
                    this.jta();
                    this.thh_6 = "";
                    this.khzkh = false;
                }
            }
        }
    }

    @Override
    public void thkdh(double d, double d2, int n) {
        float f;
        float f2;
        if (!this.jkhz) {
            return;
        }
        if (this.khzsh_2.tda_3 != -1.0f && baf.rtn(d, d2, this.khzsh_2.tda_3, this.khzsh_2.zthd_2, this.khzsh_2.hkha_2, this.khzsh_2.hkha_2)) {
            if (!this.thh_6.isEmpty()) {
                if (bhdh.khsb().ard(this.thh_6)) {
                    bhdh.khsb().dhbt(this.thh_6);
                }
                this.jta();
                this.thh_6 = "";
            }
            return;
        }
        if (this.khzsh_2.tda_3 != -1.0f && baf.rtn(d, d2, f2 = this.khzsh_2.tda_3 - this.khzsh_2.hkha_2 - (f = this.shkt()), this.khzsh_2.zthd_2, this.khzsh_2.hkha_2, this.khzsh_2.hkha_2)) {
            if (!this.thh_6.isEmpty()) {
                bhdh.khsb().daw_3(this.thh_6);
                this.jta();
                this.thh_6 = "";
                this.khzkh = false;
            }
            return;
        }
        if (baf.rtn(d, d2, this.tbq_2()[0], this.tbq_2()[1], this.tbq_2()[2], this.tbq_2()[3])) {
            this.khzkh = !this.khzkh;
            return;
        }
        f = this.sjr() + this.dhh_3();
        f2 = this.dghgh() - this.dhh_3() * 2.0f;
        float f3 = this.shkt() + this.dsa_2(this.tydh()) + this.tbq_2()[3];
        for (String string : this.rs_2) {
            float f4;
            float f5 = this.shha_2() + f3;
            if (baf.rtn(d, d2, f, f5, f2, f4 = this.dsa_2(17.0f))) {
                if (n == 0) {
                    if (bhdh.khsb().ard(string)) {
                        bhdh.khsb().rzs_4(string);
                    }
                    this.jta();
                } else if (n == 1) {
                    if (bhdh.khsb().ard(string)) {
                        bhdh.khsb().dhbt(string);
                    }
                    this.jta();
                }
            }
            f3 += f4 + this.shkt();
        }
    }

    @Override
    public void khs_2(double d, double d2, int n) {
    }

    @Override
    public boolean jkn(char c, int n) {
        if (!this.jkhz) {
            return false;
        }
        if (this.khzkh && this.thh_6.length() < 16 && Character.isLetterOrDigit(c)) {
            this.thh_6 = this.thh_6 + c;
            return true;
        }
        return false;
    }

    private float[] tbq_2() {
        float f = this.sjr() + this.dhh_3();
        float f2 = this.shha_2() + this.dsa_2(this.tydh());
        float f3 = this.dghgh() - this.dhh_3() * 2.0f;
        float f4 = this.dsa_2(this.shhk());
        return new float[]{f, f2, f3, f4};
    }

    private float tydh() {
        return 19.0f;
    }

    private float shhk() {
        return 19.0f;
    }

    @Override
    public void bthf(double d, double d2, double d3, double d4) {
    }

    @Generated
    public String shkk() {
        return this.thzz_2;
    }

    @Generated
    public String bshl() {
        return this.thh_6;
    }

    @Generated
    public boolean szh() {
        return this.khzkh;
    }

    @Generated
    public wsh ghagh() {
        return this.khzsh_2;
    }

    @Generated
    public bjz dhthh() {
        return this.htl_2;
    }

    @Generated
    public boolean zgha_3() {
        return this.jkhz;
    }

    @Generated
    public float shsgh() {
        return this.sdq;
    }

    @Generated
    public List thdha() {
        return this.rs_2;
    }

    @Generated
    public static dm_2 sdgh_3() {
        return zshsh;
    }

    @Generated
    public void djr_2(boolean bl) {
        this.jkhz = bl;
    }

    @Generated
    public void shsj(float f) {
        this.sdq = f;
    }

    private void shkz_2(rs rs2) {
        this.rghh_2(this.dsa_2(95.0f));
    }

    private static String[] g0felgrn(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kliklcn0bm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ajqmx507 ^ string.hashCode() ^ n2 + xkvxpy8qn ^ i * 2041346523 ^ ajqmx507, 12) ^ xkvxpy8qn));
            }
            String[] stringArray = dm_2.g0felgrn(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

