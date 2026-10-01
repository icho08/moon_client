/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1934
 *  net.minecraft.class_268
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_640
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
import java.util.Set;
import net.minecraft.class_1934;
import net.minecraft.class_268;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_640;
import net.minecraft.class_742;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bdgh_2;
import us.m0vy.moondlc.m0vyguard.bzr_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.tdd;
import us.m0vy.moondlc.m0vyguard.tdhk;
import us.m0vy.moondlc.m0vyguard.thy_3;
import us.m0vy.moondlc.m0vyguard.kf;
import us.m0vy.moondlc.m0vyguard.wz;

public class bash_2
extends thy_3 {
    private final tdd khba = new tdd(false);
    private List jak_2 = new ArrayList();
    private final Map dhyf = new HashMap();
    private static final int ieaghrp = 2077498837;
    private static final int hrxzrylyzrd0 = -1758098407;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int coohrk388h;

    public bash_2() {
        super(100.0f, 100.0f);
    }

    @Override
    public String getName() {
        return "Staffs";
    }

    @Override
    protected Map dhhgh() {
        return null;
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f;
        float f2;
        float f3;
        Object object2;
        ArrayList arrayList = new ArrayList(this.dhdhm());
        arrayList.forEach(this::trn_2);
        this.dhyf.entrySet().removeIf(arg_0 -> bash_2.dqm(arrayList, arg_0));
        float f4 = this.khta_3().getX();
        float f5 = this.khta_3().getY();
        float f6 = this.khta_3().getWidth();
        boolean bl = f4 + f6 / 2.0f > (float)class_310.method_1551().method_22683().method_4486() / 2.0f;
        float f7 = this.ada_4(11.0f);
        float f8 = this.ada_4(3.5f);
        float f9 = this.ada_4(6.0f);
        float f10 = this.ada_4(8.0f);
        float f11 = this.thdz_2().shdf_2(">", f9);
        Color color = new Color(12, 12, 18, 240);
        Color color2 = new Color(160, 160, 160, 180);
        HashMap<String, Float> hashMap = new HashMap<String, Float>();
        float f12 = 0.0f;
        for (Object object2 : arrayList) {
            f3 = this.thdz_2().shdf_2(((bdgh_2)object2).name(), f9);
            f2 = this.thdz_2().shdf_2(((bdgh_2)object2).status().getLabel(), f9);
            f = f8 + f3 + f8 + f11 + f8 + (f2 + this.ada_4(4.0f)) + f8;
            hashMap.put(((bdgh_2)object2).rawName(), Float.valueOf(f));
            if (!(f > f12)) continue;
            f12 = f;
        }
        String string = "Staff";
        object2 = "S";
        f3 = this.thdz_2().shdf_2(string, f9);
        f2 = brz_2.tsf.shdf_2((String)object2, f10);
        f = f3 + f2 + f8 * 4.0f;
        float f13 = Math.max(f, f12);
        if (arrayList.isEmpty()) {
            f13 = f;
        }
        float f14 = bl ? f4 + f6 - f13 : f4;
        float f15 = f5;
        bjgh.jghs.hrj(class_45872, f14, f15, f13, f7, 3.0f, color);
        this.thdz_2().zskh_4(class_45872, string, f14 + f8, f15 + f7 / 2.0f - f9 / 2.0f, f9, Color.WHITE, 0.0f);
        brz_2.tsf.jdz(class_45872, (String)object2, f14 + f13 - f8 - f2, f15 + f7 / 2.0f - f10 / 2.0f, f10, bas_4.zsz_4(), bas_4.tkb_2(), 1.1f);
        f15 += f7 + 1.5f;
        for (bdgh_2 bdgh2 : arrayList) {
            String string2 = bdgh2.rawName();
            float f16 = this.dhyf.getOrDefault(string2, Float.valueOf(0.0f)).floatValue();
            if (f16 <= 0.05f) continue;
            float f17 = hashMap.getOrDefault(string2, Float.valueOf(f)).floatValue();
            float f18 = bl ? f4 + f6 - f17 : f4;
            float f19 = f7 * f16;
            int n = (int)(255.0f * f16);
            Color color3 = new Color(0, 0, 0, (int)(205.0f * f16));
            Color color4 = new Color(255, 255, 255, n);
            Color color5 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), n);
            Color color6 = switch (bdgh2.status().ordinal()) {
                case 0 -> bas_4.thaj();
                case 1 -> bas_4.dsl_3();
                default -> bas_4.jwa_2();
            };
            Color color7 = new Color(color6.getRed(), color6.getGreen(), color6.getBlue(), n);
            Color color8 = new Color(0, 0, 0, (int)(180.0f * f16));
            bjgh.thqf.tgha_2(class_45872, f18, f15, f17, f19, 3.0f, color3);
            float f20 = f15 + f19 / 2.0f - f9 / 2.0f;
            this.thdz_2().zskh_4(class_45872, bdgh2.name(), f18 + f8, f20, f9, color4, 0.0f);
            float f21 = this.thdz_2().shdf_2(bdgh2.name(), f9);
            this.thdz_2().thdsh_2(class_45872, ">", f18 + f8 + f21 + f8 * 0.5f, f20, f9, color5);
            String string3 = bdgh2.status().getLabel();
            float f22 = this.thdz_2().shdf_2(string3, f9);
            float f23 = f22 + this.ada_4(4.0f);
            float f24 = (f9 + this.ada_4(2.0f)) * f16;
            float f25 = f18 + f17 - f8 - f23;
            float f26 = f15 + f19 / 2.0f - f24 / 2.0f;
            if (f16 > 0.5f) {
                bjgh.jghs.hrj(class_45872, f25, f26, f23, f24, 2.0f, color8);
                this.thdz_2().zskh_4(class_45872, string3, f25 + f23 / 2.0f - f22 / 2.0f, f20, f9, color7, 0.0f);
            }
            f15 += f19 + 1.5f;
        }
        this.khta_3().setWidth(f13);
        this.khta_3().setHeight(f15 - f5);
    }

    private List dhdhm() {
        this.khba.khhm_2(15, this::shh_4);
        return this.jak_2;
    }

    private List art_2() {
        ArrayList<bdgh_2> arrayList = new ArrayList<bdgh_2>();
        if (bash_2.mc.field_1724 == null || bash_2.mc.field_1724.field_3944 == null) {
            return arrayList;
        }
        for (class_640 class_6402 : bash_2.mc.field_1724.field_3944.method_2880()) {
            String string;
            String string2 = class_6402.method_2966().getName();
            if (!kf.hsr_2(string2)) continue;
            class_268 class_2682 = class_6402.method_2955();
            String string3 = string = class_2682 != null ? bzr_2.djw(class_2682.method_1144().getString()) : "";
            if (!wz.tdb_4().aqj(string2) && !this.aygh(string.toLowerCase())) continue;
            tdhk tdhk2 = tdhk.zqr;
            if (class_6402.method_2958() == class_1934.field_9219) {
                tdhk2 = tdhk.rlz_2;
            } else if (bash_2.mc.field_1687 != null && bash_2.mc.field_1687.method_18456().stream().anyMatch(arg_0 -> bash_2.ztf_3(string2, arg_0))) {
                tdhk2 = tdhk.shdhm;
            }
            arrayList.add(new bdgh_2(string + string2, string2, tdhk2));
        }
        return arrayList;
    }

    private List jlgh() {
        ArrayList<bdgh_2> arrayList = new ArrayList<bdgh_2>();
        if (bash_2.mc.field_1687 == null || bash_2.mc.field_1687.method_8428() == null || mc.method_1562() == null) {
            return arrayList;
        }
        HashSet hashSet = new HashSet();
        mc.method_1562().method_2880().forEach(arg_0 -> bash_2.ghhn(hashSet, arg_0));
        for (class_268 class_2682 : bash_2.mc.field_1687.method_8428().method_1159()) {
            for (String string : class_2682.method_1204()) {
                if (!kf.hsr_2(string) || hashSet.contains(string) || !wz.tdb_4().aqj(string)) continue;
                arrayList.add(new bdgh_2(string, string, tdhk.htsh));
            }
        }
        return arrayList;
    }

    private boolean aygh(String string) {
        String string2 = string.toLowerCase();
        return string2.contains("helper") || string2.contains("moder") || string2.contains("admin") || string2.contains("owner") || string2.contains("curator") || string2.contains("ĐşŃŃ€Đ°Ń‚ĐľŃ€") || string2.contains("ĐĽĐľĐ´ĐµŃ€") || string2.contains("Đ°Đ´ĐĽĐ¸Đ˝") || string2.contains("Ń…ĐµĐ»ĐżĐµŃ€") || string2.contains("ŃŃ‚Đ°Đ¶ĐµŃ€") || string2.contains("staff") || string2.contains("developer");
    }

    private static void ghhn(Set set, class_640 class_6402) {
        set.add(class_6402.method_2966().getName());
    }

    private static boolean ztf_3(String string, class_742 class_7423) {
        return class_7423.method_7334().getName().equals(string);
    }

    private void shh_4() {
        ArrayList arrayList = new ArrayList();
        if (bash_2.mc.field_1724 != null && !mc.method_1542()) {
            arrayList.addAll(this.art_2());
            arrayList.addAll(this.jlgh());
        }
        this.jak_2 = arrayList;
    }

    private static boolean dqm(List list, Map.Entry entry) {
        return list.stream().noneMatch(arg_0 -> bash_2.bjm(entry, arg_0)) && ((Float)entry.getValue()).floatValue() < 0.05f;
    }

    private static boolean bjm(Map.Entry entry, bdgh_2 bdgh2) {
        return bdgh2.rawName().equals(entry.getKey());
    }

    private void trn_2(bdgh_2 bdgh2) {
        String string = bdgh2.rawName();
        this.dhyf.put(string, Float.valueOf(this.dhyf.getOrDefault(string, Float.valueOf(0.0f)).floatValue() + (1.0f - this.dhyf.getOrDefault(string, Float.valueOf(0.0f)).floatValue()) * 0.15f));
    }

    private static String[] xdat0jpxw(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite d9951hdsrgmc1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ieaghrp ^ string.hashCode() ^ n2 + hrxzrylyzrd0 + i * 630152009) + ieaghrp) ^ hrxzrylyzrd0));
            }
            String[] stringArray = bash_2.xdat0jpxw(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

