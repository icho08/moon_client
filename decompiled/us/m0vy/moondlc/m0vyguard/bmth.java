/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1796
 *  net.minecraft.class_1799
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1796;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.tdd_2;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.wh_2;

public class bmth
extends bqt {
    private static final Set sbd;
    private final Map thnf = new HashMap();
    private final Map ll = new HashMap();
    private float zds_3 = -1.0f;
    private float sthw_2 = -1.0f;
    private float khdz_2 = 1.0f;
    private final ra_2 tdd_4 = new ra_2("Emotka", List.of("Right", "Left"), "Right");
    private final ra_2 slth = new ra_2("Items", List.of("Combat", "All"), "Combat");
    private final tdj thl_3 = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int yzq3wjsk = -484445316;
    private static final int ht8500k8lo = -1087619176;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fpqlobr312lq;

    public bmth() {
        super(490.0f, 32.0f);
        this.thl_3.tyt_3(this::sthb);
        this.rght(this.tdd_4);
        this.rght(this.slth);
        this.rght(this.thl_3);
    }

    @Override
    public String getName() {
        return "Moondlc Cooldowns";
    }

    @Override
    public void lh(wh_2 wh2) {
        this.athf(wh2.matrixStack(), () -> this.tsth_2(wh2));
    }

    @Override
    public void lh(class_4587 class_45872) {
    }

    private void zddh(class_4587 class_45872, class_332 class_3322) {
        if (bmth.mc.field_1724 == null) {
            return;
        }
        float f = this.awd_2();
        List list = this.bmm(f);
        boolean bl = list.isEmpty() && !this.tthy();
        float f2 = this.bhh_3(!bl, f);
        if (bl && !this.tdha_2()) {
            return;
        }
        if (this.zds_3 < 0.0f) {
            this.zds_3 = 80.0f;
        }
        this.zds_3 = this.khhs_3(this.zds_3, 84.0f, f, 12.0f);
        float f3 = this.zfj_2(this.zds_3);
        float f4 = this.zfj_2(this.khta_3().getX());
        float f5 = this.zfj_2(this.khta_3().getY());
        float f6 = 0.0f;
        for (tdd_2 tdd2 : list) {
            f6 += 11.5f * this.thnf.getOrDefault(tdd2.name(), Float.valueOf(0.0f)).floatValue();
        }
        float f7 = 17.0f + f6 + 10.0f - 3.0f;
        if (this.sthw_2 < 0.0f) {
            this.sthw_2 = f7;
        }
        this.sthw_2 = this.khhs_3(this.sthw_2, f7, f, 24.0f);
        class_45872.method_22903();
        float f8 = f2;
        class_45872.method_46416(f4 + f3 / 2.0f, f5 + this.sthw_2 / 2.0f, 0.0f);
        class_45872.method_22905(f8, f8, 1.0f);
        class_45872.method_46416(-(f4 + f3 / 2.0f), -(f5 + this.sthw_2 / 2.0f), 0.0f);
        tbkh.sqy(class_45872, f4, f5, f3, this.sthw_2, f2);
        tbkh.tzy_2(class_45872, f4, f5, f3, 16.0f, tbkh.sty, 0.35f, f2);
        tbkh.sshth_2(class_45872, f4 + 1.0f, f5 + 16.0f, f3 - 2.0f, f2);
        this.khdz_2 = this.khhs_3(this.khdz_2, this.tdd_4.thnth("Right") ? 1.0f : 0.0f, f, 12.0f);
        tbkh.dmkh_2(class_45872, f4, f5, f3, "Cooldowns", "i", brz_2.khkhj, f2, this.khdz_2);
        float f9 = 0.0f;
        for (tdd_2 tdd3 : list) {
            float f10 = this.thnf.getOrDefault(tdd3.name(), Float.valueOf(0.0f)).floatValue() * f2;
            if (f10 < 0.05f) continue;
            float f11 = f5 + 19.6f + f9;
            float f12 = 11.5f;
            float f13 = 8.0f;
            float f14 = f4 + 6.0f;
            float f15 = f11 + (f12 - f13) / 2.0f;
            class_45872.method_22903();
            class_45872.method_46416(f14, f15, 0.0f);
            class_45872.method_22905(0.5f, 0.5f, 1.0f);
            class_3322.method_51427(tdd3.stack(), 0, 0);
            class_45872.method_22909();
            float f16 = f14 + f13 + 3.2f;
            float f17 = f11 + (f12 - this.ghgh().khmw(6.4f)) / 2.0f - 0.4f;
            String string = this.jzt_2(this.ghgh(), tdd3.name(), 6.4f, f3 - 40.0f);
            this.ghgh().zskh_4(class_45872, string, f16, f17, 6.4f, tbkh.hkdh(f10), 0.0f);
            String string2 = String.format("%.1fs", Float.valueOf(tdd3.remainingSeconds()));
            float f18 = this.ghgh().shdf_2(string2, 6.4f);
            this.ghgh().zskh_4(class_45872, string2, f4 + f3 - 6.0f - f18, f17, 6.4f, tbkh.djd_3(f10), 0.0f);
            f9 += f12 * this.thnf.getOrDefault(tdd3.name(), Float.valueOf(0.0f)).floatValue();
        }
        class_45872.method_22909();
        this.khta_3().setWidth(f3);
        this.khta_3().setHeight(this.sthw_2);
    }

    private List bmm(float f) {
        LinkedHashMap<String, tdd_2> linkedHashMap = new LinkedHashMap<String, tdd_2>();
        class_1796 class_17962 = bmth.mc.field_1724.method_7357();
        boolean bl = this.slth.thnth("Combat");
        for (int i = 0; i < bmth.mc.field_1724.method_31548().method_5439(); ++i) {
            String string;
            class_1799 object = bmth.mc.field_1724.method_31548().method_5438(i);
            if (object.method_7960() || bl && !sbd.contains(object.method_7909()) || !class_17962.method_7904(object) || linkedHashMap.containsKey(string = object.method_7964().getString())) continue;
            long l = System.currentTimeMillis();
            this.ll.putIfAbsent(string, l);
            float f2 = class_17962.method_7905(object, 0.0f);
            float f3 = f2 * 3.0f;
            linkedHashMap.put(string, new tdd_2(string, object, f3));
        }
        for (String string : linkedHashMap.keySet()) {
            this.thnf.put(string, Float.valueOf(this.khhs_3(this.thnf.getOrDefault(string, Float.valueOf(0.0f)).floatValue(), 1.0f, f, 18.0f)));
        }
        this.thnf.entrySet().removeIf(arg_0 -> this.shn_4(linkedHashMap, f, arg_0));
        for (Map.Entry entry : new ArrayList(this.thnf.entrySet())) {
            if (linkedHashMap.containsKey(entry.getKey())) continue;
            this.thnf.put((String)entry.getKey(), Float.valueOf(this.khhs_3(((Float)entry.getValue()).floatValue(), 0.0f, f, 10.0f)));
        }
        return new ArrayList(linkedHashMap.values());
    }

    private boolean shn_4(Map map, float f, Map.Entry entry) {
        return !map.containsKey(entry.getKey()) && this.khhs_3(((Float)entry.getValue()).floatValue(), 0.0f, f, 10.0f) < 0.02f;
    }

    private void tsth_2(wh_2 wh2) {
        this.zddh(wh2.matrixStack(), wh2.context());
    }

    private void sthb(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] cjdlesdm1ek(String string) {
        return string.split("\u0002\u000f", -1);
    }

    private static CallSite cn571mrivqjosa(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ yzq3wjsk ^ string.hashCode()) + (n2 + ht8500k8lo) + i ^ yzq3wjsk, 15) + ht8500k8lo);
            }
            String[] stringArray = bmth.cjdlesdm1ek(new String(cArray));
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

