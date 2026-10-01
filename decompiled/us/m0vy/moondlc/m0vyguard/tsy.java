/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
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
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.brl;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdq;
import us.m0vy.moondlc.m0vyguard.tzm;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.s_3;

public final class tsy
implements dl {
    private static final tsy bjt_2;
    private static final float w_2 = 96.0f;
    private static final float rshm = 154.0f;
    private static final float tdhz = 11.0f;
    private static final float htw_2 = 6.5f;
    private static final float rkgh = 17.0f;
    private static final float sjj_2 = 7.0f;
    private static final float zthl = 8.4f;
    private static final float jzf_2 = 2.2f;
    private static final float hkhn = 5.0f;
    private static final float thda_3 = 6.0f;
    private static final String jdhq = "HUD Elements";
    private final List shm_3 = new ArrayList();
    private final tdq dhlq = new tdq(300L, 0.0f, btf_2.tghz_2);
    private float ddl_2;
    private float dhssh;
    private float khsz_3;
    private float dsa_3;
    private float thdl = 96.0f;
    private float khtj;
    private float thrd;
    private float zsh_4;
    private float shsj_2;
    private float tz;
    private boolean khsgh_2;
    private boolean bdr = true;
    private boolean sbb_2;
    private static final int c6c5ocqslh = -711057714;
    private static final int yhm0k3jjcr = -1148229389;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ogrno7w2a;

    private tsy() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void dzh_5(class_4587 class_45872) {
        if (this.bdr) {
            return;
        }
        if (!this.srh()) {
            this.thrsh();
        }
        this.dhlq.zsht_2(this.khsgh_2);
        float f = this.dhlq.swd();
        float f2 = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        if (!this.khsgh_2 && f2 <= 0.02f && this.dhlq.dym()) {
            this.bdr = true;
            this.sbb_2 = false;
            this.shm_3.clear();
            return;
        }
        if (f2 <= 0.001f) {
            return;
        }
        this.hdht_2();
        this.drz_3();
        this.tz += (this.shsj_2 - this.tz) * 0.22f;
        float f3 = class_3532.method_15363((float)(0.5f + f * 0.5f), (float)0.5f, (float)1.06f);
        class_45872.method_22903();
        class_45872.method_46416(0.0f, 0.0f, 2000.0f);
        bjgh.khhq_2.shm_4(class_45872, this.ddl_2 + this.thdl / 6.0f, this.dhssh + this.khtj / 6.0f, f3);
        try {
            tbkh.sqy(class_45872, this.ddl_2, this.dhssh, this.thdl, this.khtj, f2);
            tbkh.ja_2(class_45872, this.ddl_2, this.dhssh, this.thdl, this.khtj, 5.0f, 0.35f, f2);
            tbkh.sshth_2(class_45872, this.ddl_2 + 1.0f, this.dhssh + 16.0f, this.thdl - 2.0f, f2);
            brz_2.shjh_2.zskh_4(class_45872, jdhq, this.ddl_2 + 9.0f, this.dhssh + 5.05f, 6.5f, tbkh.hkdh(f2), 0.0f);
            float f4 = this.ddl_2;
            float f5 = this.dhssh + 19.6f;
            float f6 = this.thdl;
            float f7 = this.thrd;
            float f8 = f5 - this.tz;
            tzm.hds_2(class_45872, f4, f5, f6, f7);
            try {
                for (brl brl2 : this.shm_3) {
                    brl2.sshj(f4, f8, f6, 11.0f);
                    if (f8 + 11.0f >= f5 - 1.0f && f8 <= f5 + f7 + 1.0f) {
                        brl2.azkh_2(class_45872, this.ds(), this.aaa_4(), f2);
                    }
                    f8 += 11.0f;
                }
            }
            finally {
                tzm.jdz_4(class_45872);
            }
            this.tdh_2(class_45872, f2);
        }
        finally {
            bjgh.khhq_2.dhzj_2(class_45872);
            class_45872.method_22909();
        }
    }

    public boolean jzdh(int n, int n2) {
        if (n2 != 1) {
            return false;
        }
        if (!this.srh()) {
            this.thrsh();
            return false;
        }
        float f = this.ds();
        float f2 = this.aaa_4();
        if (!this.bdr && this.khsgh_2) {
            if (this.shash(f, f2)) {
                return this.hyy(f, f2, n) || n == 0 || n == 1;
            }
            if (n == 0) {
                this.thrsh();
                return true;
            }
        }
        if (n == 1) {
            this.shhd_3(f, f2);
            return true;
        }
        return false;
    }

    public boolean tjd_4(double d, double d2) {
        if (this.bdr || !this.khsgh_2 || !this.srh() || !this.shash(this.ds(), this.aaa_4())) {
            return false;
        }
        this.shsj_2 -= (float)d2 * 22.0f;
        this.drz_3();
        return true;
    }

    public void thrsh() {
        this.khsgh_2 = false;
    }

    private void shhd_3(float f, float f2) {
        boolean bl = this.bdr || !this.sbb_2;
        this.gh();
        this.khsgh_2 = true;
        this.bdr = false;
        this.shsj_2 = 0.0f;
        this.tz = 0.0f;
        this.khsz_3 = f;
        this.dsa_3 = f2;
        if (bl) {
            this.sbb_2 = false;
        }
        this.hdht_2();
    }

    private void gh() {
        this.shm_3.clear();
        for (s_3 s2 : bza_4.thtsh_2().jry.zskh_3()) {
            this.shm_3.add(new brl(this, s2));
        }
    }

    private boolean hyy(float f, float f2, int n) {
        if (n != 0 && n != 1) {
            return false;
        }
        float f3 = this.dhssh + 19.6f;
        if (!baf.zath(f, f2, this.ddl_2, f3, this.thdl, this.thrd)) {
            return false;
        }
        for (brl brl2 : this.shm_3) {
            if (!brl2.dtt_3(f, f2)) continue;
            return true;
        }
        return false;
    }

    private void hdht_2() {
        this.thdl = this.tnf_2();
        this.zsh_4 = (float)this.shm_3.size() * 11.0f;
        float f = 17.0f + this.zsh_4 + 7.0f;
        float f2 = mc.method_22683().method_4486();
        float f3 = mc.method_22683().method_4502();
        float f4 = Math.max(57.0f, f3 - 10.0f);
        this.khtj = Math.min(f, f4);
        this.thrd = Math.max(11.0f, this.khtj - 17.0f - 7.0f);
        this.khsz_3 = class_3532.method_15363((float)this.khsz_3, (float)5.0f, (float)Math.max(5.0f, f2 - this.thdl - 5.0f));
        this.dsa_3 = class_3532.method_15363((float)this.dsa_3, (float)5.0f, (float)Math.max(5.0f, f3 - this.khtj - 5.0f));
        if (!this.sbb_2) {
            this.ddl_2 = this.khsz_3;
            this.dhssh = this.dsa_3;
            this.sbb_2 = true;
            return;
        }
        this.ddl_2 += (this.khsz_3 - this.ddl_2) * 0.26f;
        this.dhssh += (this.dsa_3 - this.dhssh) * 0.26f;
        if (Math.abs(this.khsz_3 - this.ddl_2) < 0.08f) {
            this.ddl_2 = this.khsz_3;
        }
        if (Math.abs(this.dsa_3 - this.dhssh) < 0.08f) {
            this.dhssh = this.dsa_3;
        }
    }

    private float tnf_2() {
        float f = Math.max(96.0f, 18.0f + brz_2.shjh_2.shdf_2(jdhq, 6.5f));
        for (brl brl2 : this.shm_3) {
            float f2 = 6.0f + brz_2.shthm.shdf_2(brl2.zkd_2.getName(), 6.5f) + 6.0f + this.rash_2() + 6.0f;
            f = Math.max(f, f2);
        }
        return Math.min(154.0f, f);
    }

    private void drz_3() {
        float f = Math.max(0.0f, this.zsh_4 - this.thrd);
        this.shsj_2 = class_3532.method_15363((float)this.shsj_2, (float)0.0f, (float)f);
        this.tz = class_3532.method_15363((float)this.tz, (float)0.0f, (float)f);
    }

    private void tdh_2(class_4587 class_45872, float f) {
        if (this.zsh_4 <= this.thrd + 0.5f) {
            return;
        }
        float f2 = Math.max(18.0f, this.thrd * (this.thrd / this.zsh_4));
        float f3 = Math.max(1.0f, this.zsh_4 - this.thrd);
        float f4 = this.ddl_2 + this.thdl - 3.2f;
        float f5 = this.dhssh + 19.6f + (this.thrd - f2) * (this.tz / f3);
        bjgh.jghs.hrj(class_45872, f4, this.dhssh + 19.6f, 1.2f, this.thrd, 0.8f, new Color(255, 255, 255, this.ztb_4(10.0f * f)));
        bjgh.jghs.hrj(class_45872, f4, f5, 1.2f, f2, 0.8f, tbkh.djd_3(0.45f * f));
    }

    private boolean shash(float f, float f2) {
        return baf.mk(f, f2, this.ddl_2, this.dhssh, this.thdl, this.khtj, 5.0f);
    }

    private boolean srh() {
        return tsy.mc.field_1724 != null && tsy.mc.field_1687 != null && tsy.mc.field_1755 instanceof class_408 && bza_4.thtsh_2().rgha_2();
    }

    private float ds() {
        return (float)(tsy.mc.field_1729.method_1603() / mc.method_22683().method_4495());
    }

    private float aaa_4() {
        return (float)(tsy.mc.field_1729.method_1604() / mc.method_22683().method_4495());
    }

    private int ztb_4(float f) {
        return Math.max(0, Math.min(255, Math.round(f)));
    }

    private float rash_2() {
        return 12.5f;
    }

    private String khz_2(String string, float f) {
        String string2;
        if (brz_2.shthm.shdf_2(string, 6.5f) <= f) {
            return string;
        }
        String string3 = "...";
        float f2 = brz_2.shthm.shdf_2(string3, 6.5f);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length() && !(brz_2.shthm.shdf_2(string2 = String.valueOf(stringBuilder) + String.valueOf(string.charAt(i)), 6.5f) + f2 > f); ++i) {
            stringBuilder.append(string.charAt(i));
        }
        return String.valueOf(stringBuilder) + string3;
    }

    @Generated
    public static tsy baz_4() {
        return bjt_2;
    }

    private static String[] fxwj5z6qxmn8(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite drmf7x51omjut(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ c6c5ocqslh ^ string.hashCode() ^ n2 + yhm0k3jjcr + i * -641912735) + c6c5ocqslh) ^ yhm0k3jjcr));
            }
            String[] stringArray = tsy.fxwj5z6qxmn8(new String(cArray));
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

