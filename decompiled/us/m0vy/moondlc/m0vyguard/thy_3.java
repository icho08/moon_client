/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.taw;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tzm;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.hb_2;

public abstract class thy_3
extends thw_3 {
    private final List zj_2 = new ArrayList();
    private final bjz shbt = new bjz();
    private final bjz zd_2 = new bjz();
    private final bjz khty_2 = new bjz();
    private float sbj_2;
    private float dhbd;
    private float rqs_2;
    private static final int mtj7nq5vc = 1791974086;
    private static final int mvya4naq54zbd = -460955118;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mqupvk5w;

    public thy_3(float f, float f2) {
        super(f, f2);
    }

    public boolean ghsz() {
        return this.dhddh_2().stream().anyMatch(thy_3::khghw);
    }

    public List zdf_2() {
        this.zds_8();
        return this.dhddh_2();
    }

    protected abstract Map dhhgh();

    protected boolean dshk_2(hb_2 hb2_2, Map map) {
        return map.containsKey(hb2_2.szw_2());
    }

    private float hwt() {
        return this.thshth() * 1.3f;
    }

    private float dhnz_2() {
        return this.amz(true) + this.thshth() * 3.0f;
    }

    private int nd_2() {
        return (int)(this.shbt.khbk() * 255.0);
    }

    private float amz(boolean bl) {
        return this.ada_4(bl ? 8.0f : 7.0f);
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f = this.khta_3().getX();
        float f2 = this.khta_3().getY();
        this.zd_2.ddhdh();
        this.khty_2.ddhdh();
        this.shbt.ddhdh();
        this.shbt.shd_6(this.ghsz() || thy_3.mc.field_1755 instanceof class_408 ? 1.0 : 0.0, this.tshz_3(), this.zst_4());
        float f3 = (float)this.khty_2.khbk();
        float f4 = (float)this.zd_2.khbk();
        float f5 = this.hwt() * 1.2f;
        float f6 = this.thshth() * 2.0f;
        int n = this.nd_2();
        float f7 = this.amz(true);
        float f8 = this.thdz_2().shdf_2(this.getName(), f7);
        this.sbj_2 = f8 + this.hwt() * 4.0f;
        this.dhbd = this.dhnz_2();
        if (bza_4.aar()) {
            bjgh.thqf.tgha_2(class_45872, f, f2, f4, f3, f6, bas_4.dhyf(n));
            bjgh.hskh_2.dfth_2(class_45872, f, f2, f4, f3, f6, bas_4.dhyf(n));
        } else if (bza_4.dhhh()) {
            bjgh.jghs.hrj(class_45872, f, f2, f4, f3, f6, new Color(10, 10, 12, n));
        } else {
            bjgh.thqf.tgha_2(class_45872, f, f2, f4, f3, f6, bas_4.dhyf(n));
        }
        this.thdz_2().znb(class_45872, this.getName(), f + f4 / 2.0f, f2 + this.dhnz_2() / 2.0f - f7 / 2.0f, f7, bas_4.tdth_2(n), bas_4.dhfk(n), f8 / 4.0f);
        tzm.hds_2(class_45872, f, f2, f4, f3);
        this.rqs_2 = 0.0f;
        float f9 = f2 + this.dhnz_2() + f5 / 2.0f;
        float f10 = this.amz(false);
        float f11 = f + f5;
        float f12 = f + f4 - f5;
        List list = this.zdf_2();
        for (hb_2 hb2_2 : list) {
            String string = hb2_2.szw_2();
            String string2 = hb2_2.htdh().jtkh();
            float f13 = (float)hb2_2.tsn().khbk();
            float f14 = this.ada_4(2.0f) * (1.0f - f13);
            int n2 = (int)((double)f13 * this.shbt.khbk() * 255.0);
            this.thdz_2().thdsh_2(class_45872, string, f11, f9 - f14, f10, bas_4.khan(n2));
            float f15 = this.thdz_2().shdf_2(string2, f10);
            this.thdz_2().thdsh_2(class_45872, string2, f12 - f15, f9 - f14, f10, brb.zmn_2(hb2_2.htdh().shma, n2));
            float f16 = f10 + this.thshth();
            f9 += f16 * f13;
            if (hb2_2.zzk_2()) {
                this.khss_2(f16);
            }
            this.thdhq(string, string2, f5 * 4.0f);
        }
        tzm.jdz_4(class_45872);
        this.zd_2.bghkh(this.sbj_2, this.tshz_3(), this.zst_4());
        this.khty_2.bghkh(this.dhbd, this.tshz_3(), this.zst_4());
        this.khta_3().setWidth((float)this.zd_2.khbk());
        this.khta_3().setHeight((float)this.khty_2.khbk());
    }

    public void khss_2(float f) {
        this.rqs_2 += f;
        this.dhbd = this.dhnz_2() + this.rqs_2 + this.hwt();
    }

    public void thdhq(String string, String string2, float f) {
        float f2;
        float f3 = this.amz(false);
        float f4 = this.thdz_2().shdf_2(string, f3);
        float f5 = f4 + f + (f2 = this.thdz_2().shdf_2(string2, f3));
        if (f5 > this.sbj_2) {
            this.sbj_2 = f5;
        }
    }

    private void zds_8() {
        Object object;
        Object object222;
        tbm tbm2 = this.zst_4();
        long l = this.tshz_3();
        for (Object object222 : this.zj_2) {
            ((hb_2)object222).tsn().ddhdh();
        }
        Map map = this.dhhgh();
        if (map == null) {
            map = Collections.emptyMap();
        }
        object222 = new HashMap(this.zj_2.size() * 2 + 1);
        for (hb_2 object3 : this.zj_2) {
            object222.put(object3.szw_2(), object3);
        }
        for (Map.Entry entry : map.entrySet()) {
            object = (String)entry.getKey();
            taw taw2 = (taw)entry.getValue();
            hb_2 hb2_2 = (hb_2)object222.get(object);
            if (hb2_2 == null) {
                hb_2 hb3_2 = new hb_2((String)object, taw2);
                hb3_2.tsn().shd_6(1.0, l, tbm2);
                this.zj_2.add(hb3_2);
                object222.put(object, hb3_2);
                continue;
            }
            if (!hb2_2.htdh().equals(taw2)) {
                hb2_2.sqf_2(taw2);
            }
            hb2_2.jdhd(true);
        }
        Iterator<Object> iterator = this.zj_2.iterator();
        while (iterator.hasNext()) {
            hb_2 hb4 = (hb_2)iterator.next();
            object = hb4.tsn();
            if (!this.dshk_2(hb4, map)) {
                hb4.jdhd(false);
                ((bjz)object).shd_6(0.0, l, tbm2);
                if (!(((bjz)object).khbk() <= 0.1)) continue;
                iterator.remove();
                continue;
            }
            if (!hb4.zzk_2()) continue;
            ((bjz)object).shd_6(1.0, l, tbm2);
        }
    }

    @Generated
    public List dhddh_2() {
        return this.zj_2;
    }

    @Generated
    public bjz tzt_7() {
        return this.shbt;
    }

    @Generated
    public bjz hdhd() {
        return this.zd_2;
    }

    @Generated
    public bjz bakh_2() {
        return this.khty_2;
    }

    @Generated
    public float rdd_3() {
        return this.sbj_2;
    }

    @Generated
    public float dyz_3() {
        return this.dhbd;
    }

    @Generated
    public float sagh() {
        return this.rqs_2;
    }

    @Generated
    public void shlkh(float f) {
        this.sbj_2 = f;
    }

    @Generated
    public void thbdh(float f) {
        this.dhbd = f;
    }

    @Generated
    public void arw(float f) {
        this.rqs_2 = f;
    }

    private static boolean khghw(hb_2 hb2_2) {
        return hb2_2.tsn().khbk() > 0.1;
    }

    private static String[] fsohkgp2u8cp7c(String string) {
        return string.split("\b\u001d", -1);
    }

    private static CallSite wua8qt08c(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ mtj7nq5vc ^ string.hashCode() ^ n2 + mvya4naq54zbd + i * 1695116597) + mtj7nq5vc) ^ mvya4naq54zbd));
            }
            String[] stringArray = thy_3.fsohkgp2u8cp7c(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

