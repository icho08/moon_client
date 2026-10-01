/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1934
 *  net.minecraft.class_268
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1934;
import net.minecraft.class_268;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bzr_2;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.ttr;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.tdd;
import us.m0vy.moondlc.m0vyguard.dhf_3;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.kf;
import us.m0vy.moondlc.m0vyguard.wz;

public class zf_2
extends bqt {
    private final tdd rm = new tdd(false);
    private final Map jda_2 = new HashMap();
    private List hwn = new ArrayList();
    private float khzh_2 = -1.0f;
    private float rddh_2 = -1.0f;
    private float daf = 1.0f;
    private final ra_2 btth = new ra_2("Emotka", List.of("Right", "Left"), "Right");
    private final ra_2 shshy = new ra_2("Player Heads", List.of("Enabled", "Disabled"), "Enabled");
    private final ra_2 btl_2 = new ra_2("Show Offline", List.of("Enabled", "Disabled"), "Disabled");
    private final tdj djd_2 = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int chw0xi7 = -1281020125;
    private static final int z9r0878n = 1894259887;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int g5wfc73vvd5988;

    public zf_2() {
        super(230.0f, 210.0f);
        this.djd_2.tyt_3(this::hzj);
        this.rght(this.btth);
        this.rght(this.shshy);
        this.rght(this.btl_2);
        this.rght(this.djd_2);
    }

    @Override
    public String getName() {
        return "Moondlc Staffs";
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f = this.awd_2();
        List list = this.srh_4(f);
        boolean bl = list.isEmpty() && !this.tthy();
        float f2 = this.bhh_3(!bl, f);
        if (bl && !this.tdha_2()) {
            return;
        }
        if (this.khzh_2 < 0.0f) {
            this.khzh_2 = 80.0f;
        }
        this.khzh_2 = this.khhs_3(this.khzh_2, 84.0f, f, 12.0f);
        float f3 = this.zfj_2(this.khzh_2);
        float f4 = this.zfj_2(this.khta_3().getX());
        float f5 = this.zfj_2(this.khta_3().getY());
        float f6 = 0.0f;
        for (dhf_3 dhf2 : list) {
            f6 += 9.5f * this.jda_2.getOrDefault(dhf2.rawName(), Float.valueOf(0.0f)).floatValue();
        }
        float f7 = 17.0f + f6 + 10.0f - 3.0f;
        if (this.rddh_2 < 0.0f) {
            this.rddh_2 = f7;
        }
        this.rddh_2 = this.khhs_3(this.rddh_2, f7, f, 24.0f);
        class_45872.method_22903();
        class_45872.method_46416(f4 + f3 / 2.0f, f5 + this.rddh_2 / 2.0f, 0.0f);
        class_45872.method_22905(f2, f2, 1.0f);
        class_45872.method_46416(-(f4 + f3 / 2.0f), -(f5 + this.rddh_2 / 2.0f), 0.0f);
        tbkh.sqy(class_45872, f4, f5, f3, this.rddh_2, f2);
        tbkh.tzy_2(class_45872, f4, f5, f3, 16.0f, tbkh.sty, 0.35f, f2);
        tbkh.sshth_2(class_45872, f4 + 1.0f, f5 + 16.0f, f3 - 2.0f, f2);
        this.daf = this.khhs_3(this.daf, this.btth.thnth("Right") ? 1.0f : 0.0f, f, 12.0f);
        tbkh.dmkh_2(class_45872, f4, f5, f3, "StaffList", "S", brz_2.tsf, f2, this.daf);
        boolean bl2 = this.shshy.thnth("Enabled");
        float f8 = 0.0f;
        for (dhf_3 dhf3 : list) {
            float f9;
            Object object;
            Object object2;
            float f10 = this.jda_2.getOrDefault(dhf3.rawName(), Float.valueOf(0.0f)).floatValue() * f2;
            if (f10 < 0.05f) continue;
            float f11 = f5 + 19.6f + f8;
            float f12 = f4 + 5.0f;
            if (bl2 && mc.method_1562() != null && (object2 = mc.method_1562().method_2874(dhf3.rawName())) != null) {
                object = object2.method_52810().comp_1626();
                float f13 = 7.5f;
                f9 = f12;
                float f14 = f11 + 0.8f;
                float f15 = 0.125f;
                float f16 = 0.625f;
                Color color = new Color(255, 255, 255, Math.round(255.0f * f10));
                bjgh.shsf_2.tlh_4(class_45872, f9, f14, f13, f13, 1.5f, color, f15, f15, f15, f15, (class_2960)object);
                bjgh.shsf_2.tlh_4(class_45872, f9, f14, f13, f13, 1.5f, color, f16, f15, f15, f15, (class_2960)object);
                f12 += f13 + 3.0f;
            }
            object2 = this.jzt_2(this.ghgh(), dhf3.name(), 6.5f, f3 - (f12 - f4) - 34.0f);
            object = dhf3.status().getLabel();
            this.ghgh().zskh_4(class_45872, (String)object2, f12, f11 + 1.2f, 6.5f, tbkh.hkdh(f10), 0.0f);
            Color color = this.dlj(dhf3.status(), f10);
            f9 = this.ghgh().shdf_2((String)object, 6.5f);
            this.ghgh().zskh_4(class_45872, (String)object, f4 + f3 - 5.0f - f9, f11 + 1.2f, 6.5f, color, 0.0f);
            f8 += 9.5f * this.jda_2.getOrDefault(dhf3.rawName(), Float.valueOf(0.0f)).floatValue();
        }
        class_45872.method_22909();
        this.khta_3().setWidth(f3);
        this.khta_3().setHeight(this.rddh_2);
    }

    private List srh_4(float f) {
        List list = this.zjd_2();
        for (dhf_3 object : list) {
            this.jda_2.put(object.rawName(), Float.valueOf(this.khhs_3(this.jda_2.getOrDefault(object.rawName(), Float.valueOf(0.0f)).floatValue(), 1.0f, f, 18.0f)));
        }
        this.jda_2.entrySet().removeIf(arg_0 -> this.rghw(list, f, arg_0));
        for (Map.Entry entry : new ArrayList(this.jda_2.entrySet())) {
            boolean bl = list.stream().anyMatch(arg_0 -> zf_2.ghdkh_2(entry, arg_0));
            if (bl) continue;
            this.jda_2.put((String)entry.getKey(), Float.valueOf(this.khhs_3(((Float)entry.getValue()).floatValue(), 0.0f, f, 10.0f)));
        }
        return list;
    }

    private List zjd_2() {
        if (zf_2.mc.field_1724 == null || zf_2.mc.field_1724.field_3944 == null) {
            return List.of();
        }
        this.rm.khhm_2(15, this::dfa_3);
        return this.hwn;
    }

    private boolean jzy(String string) {
        String string2 = string.toLowerCase();
        return string2.contains("helper") || string2.contains("moder") || string2.contains("admin") || string2.contains("owner") || string2.contains("curator") || string2.contains("куратор") || string2.contains("модер") || string2.contains("админ") || string2.contains("хелпер") || string2.contains("стажер") || string2.contains("staff") || string2.contains("developer");
    }

    private Color dlj(ttr ttr2, float f) {
        return switch (ttr2.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1 -> new Color(94, 255, 69, Math.round(255.0f * f));
            case 2, 3 -> new Color(255, 82, 82, Math.round(255.0f * f));
            case 4 -> new Color(130, 130, 130, Math.round(255.0f * f));
        };
    }

    private void dfa_3() {
        ArrayList<dhf_3> arrayList = new ArrayList<dhf_3>();
        HashSet<String> hashSet = new HashSet<String>();
        for (Object object : zf_2.mc.field_1724.field_3944.method_2880()) {
            String string;
            String string2 = object.method_2966().getName();
            if (!kf.hsr_2(string2)) continue;
            class_268 class_2682 = object.method_2955();
            String string3 = string = class_2682 != null ? bzr_2.djw(class_2682.method_1144().getString()) : "";
            if (!wz.tdb_4().aqj(string2) && !this.jzy(string.toLowerCase())) continue;
            hashSet.add(string2);
            ttr ttr2 = ttr.sbm_2;
            if (object.method_2958() == class_1934.field_9219) {
                ttr2 = ttr.khhd_2;
            } else if (zf_2.mc.field_1687 != null && zf_2.mc.field_1687.method_18456().stream().anyMatch(arg_0 -> zf_2.trw(string2, arg_0))) {
                ttr2 = ttr.khnb;
            }
            arrayList.add(new dhf_3(string + string2, string2, ttr2));
        }
        if (this.btl_2.thnth("Enabled")) {
            for (Object object : wz.tdb_4().zdf_3()) {
                if (hashSet.contains(object)) continue;
                arrayList.add(new dhf_3((String)object, (String)object, ttr.jssh));
            }
        }
        arrayList.sort(zf_2::zbm_2);
        this.hwn = arrayList;
    }

    private static int zbm_2(dhf_3 dhf2, dhf_3 dhf3) {
        int n = Integer.compare(dhf2.status().ordinal(), dhf3.status().ordinal());
        if (n != 0) {
            return n;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(dhf2.rawName(), dhf3.rawName());
    }

    private static boolean trw(String string, class_742 class_7423) {
        return class_7423.method_7334().getName().equals(string);
    }

    private static boolean ghdkh_2(Map.Entry entry, dhf_3 dhf2) {
        return dhf2.rawName().equals(entry.getKey());
    }

    private boolean rghw(List list, float f, Map.Entry entry) {
        return list.stream().noneMatch(arg_0 -> zf_2.sshz(entry, arg_0)) && this.khhs_3(((Float)entry.getValue()).floatValue(), 0.0f, f, 10.0f) < 0.02f;
    }

    private static boolean sshz(Map.Entry entry, dhf_3 dhf2) {
        return dhf2.rawName().equals(entry.getKey());
    }

    private void hzj(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] i0xqrvdk(String string) {
        return string.split("\u0003\u0018", -1);
    }

    private static CallSite hgq1zropfpova(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ chw0xi7 ^ string.hashCode()) + (n2 + z9r0878n) + i ^ chw0xi7, 3) + z9r0878n);
            }
            String[] stringArray = zf_2.i0xqrvdk(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

