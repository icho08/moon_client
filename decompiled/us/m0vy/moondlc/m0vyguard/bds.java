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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.movy.moondlc.Moondlc;

public class bds
extends bqt {
    private static final float dhshkh = 84.0f;
    private static final float tfsh = 6.5f;
    private static final float khzn = 11.0f;
    private static final float hfth = 8.4f;
    private static final float khfa_2 = 2.2f;
    private final Map dzgh = new HashMap();
    private float hzs_2 = -1.0f;
    private float zm_2 = -1.0f;
    private float dhdkh = 1.0f;
    private final ra_2 rshn = new ra_2("Emotka", List.of("Right", "Left"), "Right");
    private final ra_2 raj_2 = new ra_2("Display Mode", List.of("Always", "Active Only"), "Always");
    private final tdj tsf_2 = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int nnb01ioo5 = 315450303;
    private static final int y67xikm = 281828148;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ji8xnmms3jnt1;

    public bds() {
        super(460.0f, 32.0f);
        this.tsf_2.tyt_3(this::zdt_8);
        this.rght(this.rshn);
        this.rght(this.raj_2);
        this.rght(this.tsf_2);
    }

    @Override
    public String getName() {
        return "Moondlc Keybinds";
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f = this.awd_2();
        List list = this.zsz_2(f);
        boolean bl = list.isEmpty() && !this.tthy();
        float f2 = this.bhh_3(!bl, f);
        if (bl && !this.tdha_2()) {
            return;
        }
        if (this.hzs_2 < 0.0f) {
            this.hzs_2 = 84.0f;
        }
        this.hzs_2 = this.khhs_3(this.hzs_2, this.tth_10(list), f, 12.0f);
        float f3 = this.zfj_2(this.hzs_2);
        float f4 = this.zfj_2(this.khta_3().getX());
        float f5 = this.zfj_2(this.khta_3().getY());
        float f6 = 0.0f;
        for (bsb bsb2 : list) {
            f6 += 11.0f * this.dzgh.getOrDefault(bsb2, Float.valueOf(0.0f)).floatValue();
        }
        float f7 = 17.0f + f6 + 10.0f - 3.0f;
        if (this.zm_2 < 0.0f) {
            this.zm_2 = f7;
        }
        this.zm_2 = this.khhs_3(this.zm_2, f7, f, 24.0f);
        class_45872.method_22903();
        float f8 = f2;
        class_45872.method_46416(f4 + f3 / 2.0f, f5 + this.zm_2 / 2.0f, 0.0f);
        class_45872.method_22905(f8, f8, 1.0f);
        class_45872.method_46416(-(f4 + f3 / 2.0f), -(f5 + this.zm_2 / 2.0f), 0.0f);
        tbkh.sqy(class_45872, f4, f5, f3, this.zm_2, f2);
        tbkh.tzy_2(class_45872, f4, f5, f3, 16.0f, tbkh.sty, 0.35f, f2);
        tbkh.sshth_2(class_45872, f4 + 1.0f, f5 + 16.0f, f3 - 2.0f, f2);
        this.dhdkh = this.khhs_3(this.dhdkh, this.rshn.thnth("Right") ? 1.0f : 0.0f, f, 12.0f);
        tbkh.dmkh_2(class_45872, f4, f5, f3, "KeyBinds", "K", brz_2.tsf, f2, this.dhdkh);
        boolean bl2 = this.raj_2.thnth("Always");
        float f9 = 0.0f;
        for (bsb bsb3 : list) {
            float f10 = this.dzgh.getOrDefault(bsb3, Float.valueOf(0.0f)).floatValue() * f2;
            if (f10 < 0.05f) continue;
            float f11 = f5 + 19.6f + f9;
            String string = brz.adq(bsb3.zshsh_2());
            float f12 = this.dhyt(string);
            float f13 = f4 + f3 - 6.0f - f12;
            float f14 = f11 + 0.45f;
            float f15 = f4 + 6.0f;
            float f16 = f13 - f15 - 5.0f;
            String string2 = this.jzt_2(this.ghgh(), bsb3.getName(), 6.5f, f16);
            Color color = bl2 ? (bsb3.rgha_2() ? bas_4.tdth_2(Math.round(255.0f * f10)) : tbkh.hkdh(f10 * 0.65f)) : tbkh.hkdh(f10);
            this.ghgh().zskh_4(class_45872, string2, f15, f11 + 5.5f - 3.9f, 6.5f, color, 0.0f);
            bjgh.jghs.hrj(class_45872, f13, f14, f12, 8.4f, 2.2f, tbkh.zq_2(f10));
            float f17 = f13 + f12 / 2.0f - this.afl(string);
            float f18 = f14 + 4.2f - 3.9f;
            this.ghgh().sjw_2(class_45872, string, f17, f18, 6.5f, tbkh.djd_3(f10), 0.0f);
            f9 += 11.0f * this.dzgh.getOrDefault(bsb3, Float.valueOf(0.0f)).floatValue();
        }
        class_45872.method_22909();
        this.khta_3().setWidth(f3);
        this.khta_3().setHeight(this.zm_2);
    }

    private List zsz_2(float f) {
        ArrayList<bsb> arrayList = new ArrayList<bsb>();
        boolean bl = this.raj_2.thnth("Always");
        for (bsb bsb2 : Moondlc.getInstance().getModuleManager().rdhs()) {
            float f2;
            boolean bl2 = bsb2.jmr() && (bl || bsb2.rgha_2());
            float f3 = this.dzgh.getOrDefault(bsb2, Float.valueOf(0.0f)).floatValue();
            float f4 = this.khhs_3(f3, f2 = bl2 ? 1.0f : 0.0f, f, bl2 ? 18.0f : 10.0f);
            if (f4 > 0.01f || bl2) {
                this.dzgh.put(bsb2, Float.valueOf(f4));
            } else {
                this.dzgh.remove(bsb2);
            }
            if (!bl2 && !(f4 > 0.1f)) continue;
            arrayList.add(bsb2);
        }
        arrayList.sort(Comparator.comparing(bsb::getName, String.CASE_INSENSITIVE_ORDER));
        return arrayList;
    }

    private float tth_10(List list) {
        float f = Math.max(84.0f, tbkh.rmh_2("KeyBinds", "K"));
        for (bsb bsb2 : list) {
            String string = brz.adq(bsb2.zshsh_2());
            float f2 = 6.0f + this.ghgh().shdf_2(bsb2.getName(), 6.5f) + 6.0f + this.dhyt(string) + 6.0f;
            f = Math.max(f, f2);
        }
        return Math.min(f, this.tqsh());
    }

    private float dhyt(String string) {
        return Math.max(12.0f, this.ghgh().shdf_2(string, 6.5f) + 7.5f);
    }

    private float afl(String string) {
        return string.length() == 1 ? 0.45f : 0.0f;
    }

    private float tqsh() {
        if (mc.method_22683() == null) {
            return 180.0f;
        }
        return Math.max(84.0f, (float)mc.method_22683().method_4486() - this.khta_3().getX() - 8.0f);
    }

    private void zdt_8(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] oa1bpop7x(String string) {
        return string.split("\u0001\u0010", -1);
    }

    private static CallSite j5df0ctu3rcl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ nnb01ioo5 ^ string.hashCode()) + (n2 + y67xikm) + i ^ nnb01ioo5, 27) + y67xikm);
            }
            String[] stringArray = bds.oa1bpop7x(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

