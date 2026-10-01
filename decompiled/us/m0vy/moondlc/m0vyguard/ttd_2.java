/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1799
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bdm;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.btd_3;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbb;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.lq;
import us.m0vy.moondlc.m0vyguard.wh_2;

public class ttd_2
extends bqt {
    private static final int zyk = 9;
    private static final int ztb_2 = 36;
    private static final float shb_4 = 125.0f;
    private static final float dhtht = 16.0f;
    private static final float ldh = 11.0f;
    private static final float dbf = 13.0f;
    private static final float rha = 0.5f;
    private static final float khql = 4.0f;
    private final List hht_2 = new ArrayList();
    private final List bhf = new ArrayList();
    private float dhsd_4 = 1.0f;
    private float btw = 1.0f;
    private boolean jzdh_2 = false;
    private int yk = -1;
    private class_1799 stm_3 = class_1799.field_8037;
    private final ra_2 shshm = new ra_2("Show Header", List.of("Enabled", "Disabled"), "Enabled");
    private final ra_2 khlt_2 = new ra_2("Emotka", List.of("Right", "Left"), "Right");
    private final ra_2 khat_4 = new ra_2("Interactive", List.of("Enabled", "Disabled"), "Enabled");
    private final tdj hzt_2 = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int xg62hm5j6w = 1476588967;
    private static final int gtopqlzp = 1222038398;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int oqllro2f;

    public ttd_2() {
        super(35.0f, 175.0f);
        this.hzt_2.tyt_3(this::ahsh);
        this.rght(this.shshm);
        this.rght(this.khlt_2);
        this.rght(this.khat_4);
        this.rght(this.hzt_2);
        bdm.dhsl_2().jkhh_2(new lq(this::jadh));
    }

    @Override
    public String getName() {
        return "Moondlc Inventory";
    }

    @Override
    public void lh(wh_2 wh2) {
        this.athf(wh2.matrixStack(), () -> this.ts_4(wh2));
    }

    @Override
    public void lh(class_4587 class_45872) {
    }

    private void drs(wh_2 wh2) {
        float f;
        int n;
        float f2;
        List list;
        this.zhj();
        float f3 = this.awd_2();
        boolean bl = this.wt_2(this.hht_2);
        float f4 = this.bhh_3(bl, f3);
        if (bl) {
            this.ghtz(this.hht_2, this.bhf);
        } else if (!this.tdha_2()) {
            this.bhf.clear();
            return;
        }
        List list2 = list = bl ? this.hht_2 : this.bhf;
        if (list.isEmpty() && !this.tthy()) {
            return;
        }
        this.dhsd_4 = this.khhs_3(this.dhsd_4, this.shshm.thnth("Enabled") ? 1.0f : 0.0f, f3, 12.0f);
        this.btw = this.khhs_3(this.btw, this.khlt_2.thnth("Right") ? 1.0f : 0.0f, f3, 12.0f);
        class_4587 class_45872 = wh2.matrixStack();
        class_332 class_3322 = wh2.context();
        float f5 = this.zfj_2(this.khta_3().getX());
        float f6 = this.zfj_2(this.khta_3().getY());
        float f7 = 39.0f;
        float f8 = (4.0f + f7 + 4.0f) * (1.0f - this.dhsd_4) + 60.0f * this.dhsd_4;
        float f9 = (f6 + 4.0f) * (1.0f - this.dhsd_4) + (f6 + 18.5f) * this.dhsd_4;
        double d = ttd_2.mc.field_1729.method_1603() * (double)mc.method_22683().method_4486() / (double)mc.method_22683().method_4480();
        double d2 = ttd_2.mc.field_1729.method_1604() * (double)mc.method_22683().method_4502() / (double)mc.method_22683().method_4507();
        float f10 = this.khta_3().getScale();
        double d3 = d;
        double d4 = d2;
        if (f10 != 0.0f) {
            d3 = (double)this.khta_3().getX() + (d - (double)this.khta_3().getX()) / (double)f10;
            d4 = (double)this.khta_3().getY() + (d2 - (double)this.khta_3().getY()) / (double)f10;
        }
        boolean bl2 = this.khat_4.thnth("Enabled") && this.tthy();
        boolean bl3 = bl2 && baf.zath((float)d3, (float)d4, f5 + 4.0f, f9, 117.0f, f7);
        tbb.dragBlocked = bl3 || this.jzdh_2;
        class_45872.method_22903();
        float f11 = 0.92f + 0.08f * f4;
        class_45872.method_46416(f5 + 62.5f, f6 + f8 / 2.0f, 0.0f);
        class_45872.method_22905(f11, f11, 1.0f);
        class_45872.method_46416(-(f5 + 62.5f), -(f6 + f8 / 2.0f), 0.0f);
        tbkh.bsdh_2(class_45872, f5, f6, 125.0f, f8, f4, 6.0f);
        if (this.dhsd_4 > 0.02f) {
            f2 = f4 * this.dhsd_4;
            tbkh.tzy_2(class_45872, f5, f6, 125.0f, 16.0f, tbkh.sty, 0.36f, f2);
            tbkh.sshth_2(class_45872, f5 + 1.0f, f6 + 16.0f, 123.0f, f2);
            tbkh.dmkh_2(class_45872, f5, f6, 125.0f, "Inventory", "g", brz_2.khkhj, f2, this.btw);
        }
        f2 = 117.0f;
        bjgh.jghs.hrj(class_45872, f5 + 4.0f, f9, f2, f7, 2.5f, new Color(0, 0, 0, Math.round(75.0f * f4)));
        Color color = new Color(0, 0, 0, Math.round(45.0f * f4));
        for (n = 1; n < 9; ++n) {
            f = f5 + 4.0f + (float)n * 13.0f;
            bjgh.jghs.hrj(class_45872, f, f9, 0.75f, f7, 0.0f, color);
        }
        for (n = 1; n < 3; ++n) {
            f = f9 + (float)n * 13.0f;
            bjgh.jghs.hrj(class_45872, f5 + 4.0f, f, f2, 0.75f, 0.0f, color);
        }
        for (n = 0; n < 27; ++n) {
            boolean bl4;
            class_1799 class_17992 = n < list.size() ? (class_1799)list.get(n) : class_1799.field_8037;
            int n2 = n % 9;
            int n3 = n / 9;
            float f12 = f5 + 4.0f + (float)n2 * 13.0f;
            float f13 = f9 + (float)n3 * 13.0f;
            boolean bl5 = bl4 = bl2 && baf.zath((float)d3, (float)d4, f12, f13, 13.0f, 13.0f);
            if (bl4) {
                bjgh.jghs.hrj(class_45872, f12, f13, 13.0f, 13.0f, 1.5f, bas_4.tdth_2(Math.round(55.0f * f4)));
            }
            if (this.jzdh_2 && this.yk == n) {
                bjgh.jghs.hrj(class_45872, f12, f13, 13.0f, 13.0f, 1.5f, new Color(0, 0, 0, Math.round(110.0f * f4)));
                this.shl(class_3322, class_17992, f12 + 2.5f, f13 + 2.5f, f4 * 0.35f);
                continue;
            }
            this.shl(class_3322, class_17992, f12 + 2.5f, f13 + 2.5f, f4);
        }
        if (this.jzdh_2 && !this.stm_3.method_7960()) {
            this.azs_4(class_3322, this.stm_3, (float)d3 - 4.0f, (float)d4 - 4.0f);
        }
        class_45872.method_22909();
        this.khta_3().setWidth(125.0f);
        this.khta_3().setHeight(f8);
    }

    private void ssj_2(int n) {
        if (!this.khat_4.thnth("Enabled") || !this.tthy() || ttd_2.mc.field_1724 == null || ttd_2.mc.field_1761 == null) {
            return;
        }
        double d = ttd_2.mc.field_1729.method_1603() * (double)mc.method_22683().method_4486() / (double)mc.method_22683().method_4480();
        double d2 = ttd_2.mc.field_1729.method_1604() * (double)mc.method_22683().method_4502() / (double)mc.method_22683().method_4507();
        float f = this.khta_3().getScale();
        double d3 = d;
        double d4 = d2;
        if (f != 0.0f) {
            d3 = (double)this.khta_3().getX() + (d - (double)this.khta_3().getX()) / (double)f;
            d4 = (double)this.khta_3().getY() + (d2 - (double)this.khta_3().getY()) / (double)f;
        }
        float f2 = this.zfj_2(this.khta_3().getX());
        float f3 = this.zfj_2(this.khta_3().getY());
        float f4 = (f3 + 4.0f) * (1.0f - this.dhsd_4) + (f3 + 18.5f) * this.dhsd_4;
        for (int i = 0; i < 27; ++i) {
            int n2 = i % 9;
            float f5 = f2 + 4.0f + (float)n2 * 13.0f;
            int n3 = i / 9;
            float f6 = f4 + (float)n3 * 13.0f;
            if (!baf.zath((float)d3, (float)d4, f5, f6, 13.0f, 13.0f)) continue;
            class_1799 class_17992 = ttd_2.mc.field_1724.method_31548().method_5438(9 + i);
            if (n == 0 && !class_17992.method_7960()) {
                this.jzdh_2 = true;
                this.yk = i;
                this.stm_3 = class_17992.method_7972();
            } else if (n == 1) {
                int n4 = 9 + i;
                ttd_2.mc.field_1761.method_2906(ttd_2.mc.field_1724.field_7498.field_7763, n4, 1, class_1713.field_7790, (class_1657)ttd_2.mc.field_1724);
            }
            return;
        }
    }

    private void dqr_2(int n) {
        int n2;
        int n3;
        if (n != 0 || !this.jzdh_2) {
            this.jzdh_2 = false;
            this.yk = -1;
            this.stm_3 = class_1799.field_8037;
            return;
        }
        if (ttd_2.mc.field_1724 == null || ttd_2.mc.field_1761 == null) {
            this.jzdh_2 = false;
            this.yk = -1;
            this.stm_3 = class_1799.field_8037;
            return;
        }
        double d = ttd_2.mc.field_1729.method_1603() * (double)mc.method_22683().method_4486() / (double)mc.method_22683().method_4480();
        double d2 = ttd_2.mc.field_1729.method_1604() * (double)mc.method_22683().method_4502() / (double)mc.method_22683().method_4507();
        float f = this.khta_3().getScale();
        double d3 = d;
        double d4 = d2;
        if (f != 0.0f) {
            d3 = (double)this.khta_3().getX() + (d - (double)this.khta_3().getX()) / (double)f;
            d4 = (double)this.khta_3().getY() + (d2 - (double)this.khta_3().getY()) / (double)f;
        }
        float f2 = this.zfj_2(this.khta_3().getX());
        float f3 = this.zfj_2(this.khta_3().getY());
        float f4 = (f3 + 4.0f) * (1.0f - this.dhsd_4) + (f3 + 18.5f) * this.dhsd_4;
        int n4 = -1;
        for (n3 = 0; n3 < 27; ++n3) {
            n2 = n3 % 9;
            float f5 = f2 + 4.0f + (float)n2 * 13.0f;
            int n5 = n3 / 9;
            float f6 = f4 + (float)n5 * 13.0f;
            if (!baf.zath((float)d3, (float)d4, f5, f6, 13.0f, 13.0f)) continue;
            n4 = n3;
            break;
        }
        if (n4 != -1 && n4 != this.yk) {
            n3 = 9 + this.yk;
            n2 = 9 + n4;
            ttd_2.mc.field_1761.method_2906(ttd_2.mc.field_1724.field_7498.field_7763, n3, 0, class_1713.field_7790, (class_1657)ttd_2.mc.field_1724);
            ttd_2.mc.field_1761.method_2906(ttd_2.mc.field_1724.field_7498.field_7763, n2, 0, class_1713.field_7790, (class_1657)ttd_2.mc.field_1724);
            if (!ttd_2.mc.field_1724.field_7498.method_34255().method_7960()) {
                ttd_2.mc.field_1761.method_2906(ttd_2.mc.field_1724.field_7498.field_7763, n3, 0, class_1713.field_7790, (class_1657)ttd_2.mc.field_1724);
            }
        }
        this.jzdh_2 = false;
        this.yk = -1;
        this.stm_3 = class_1799.field_8037;
    }

    private void zhj() {
        this.hht_2.clear();
        if (ttd_2.mc.field_1724 == null) {
            return;
        }
        for (int i = 9; i < 36; ++i) {
            this.hht_2.add(ttd_2.mc.field_1724.method_31548().method_5438(i));
        }
    }

    private boolean wt_2(List list) {
        if (this.tthy()) {
            return true;
        }
        for (class_1799 class_17992 : list) {
            if (class_17992.method_7960()) continue;
            return true;
        }
        return false;
    }

    private void ghtz(List list, List list2) {
        list2.clear();
        for (class_1799 class_17992 : list) {
            list2.add(class_17992.method_7972());
        }
    }

    private void shl(class_332 class_3322, class_1799 class_17992, float f, float f2, float f3) {
        if (class_17992.method_7960()) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 0.0f);
        class_45872.method_22905(0.5f, 0.5f, 1.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
        class_3322.method_51427(class_17992, 0, 0);
        class_3322.method_51431(ttd_2.mc.field_1772, class_17992, 0, 0);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_45872.method_22909();
    }

    private void azs_4(class_332 class_3322, class_1799 class_17992, float f, float f2) {
        if (class_17992.method_7960()) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        class_45872.method_46416(f, f2, 500.0f);
        class_45872.method_22905(0.575f, 0.575f, 1.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_3322.method_51427(class_17992, 0, 0);
        class_3322.method_51431(ttd_2.mc.field_1772, class_17992, 0, 0);
        class_45872.method_22909();
    }

    private void ts_4(wh_2 wh2) {
        this.drs(wh2);
    }

    private void jadh(btd_3 btd2) {
        if (btd2.mouse() && (btd2.key() == 0 || btd2.key() == 1)) {
            if (btd2.action() == 1) {
                this.ssj_2(btd2.key());
            } else if (btd2.action() == 0) {
                this.dqr_2(btd2.key());
            }
        }
    }

    private void ahsh(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] e1s5afufnx(String string) {
        return string.split("\b\u0015", -1);
    }

    private static CallSite tbpaeicudml(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ xg62hm5j6w ^ string.hashCode() ^ n2 + gtopqlzp ^ i * -516499627 ^ xg62hm5j6w, 26) ^ gtopqlzp));
            }
            String[] stringArray = ttd_2.e1s5afufnx(new String(cArray));
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

