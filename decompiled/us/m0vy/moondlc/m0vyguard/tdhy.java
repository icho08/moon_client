/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1796
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
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
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1796;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bkd_2;
import us.m0vy.moondlc.m0vyguard.taw;
import us.m0vy.moondlc.m0vyguard.thy_3;
import us.movy.moondlc.mixin.accessors.ItemCooldownManagerAccessor;
import us.movy.moondlc.mixin.accessors.ItemCooldownManagerEntryAccessor;

public class tdhy
extends thy_3 {
    private final Map bzb_2 = new HashMap();
    private static final int sovg9189m8h = 1555042187;
    private static final int la3vj75k3 = 115195607;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int apu0eaamo;

    public tdhy() {
        super(100.0f, 100.0f);
    }

    @Override
    public String getName() {
        return "Cooldowns";
    }

    @Override
    public void lh(class_4587 class_45872) {
        float f;
        float f2;
        float f3;
        if (tdhy.mc.field_1724 == null) {
            return;
        }
        Map map = this.wa();
        map.keySet().forEach(this::ztd_8);
        this.bzb_2.entrySet().removeIf(arg_0 -> tdhy.khthy(map, arg_0));
        float f4 = this.ada_4(11.0f);
        float f5 = this.ada_4(3.5f);
        float f6 = this.ada_4(6.0f);
        float f7 = this.ada_4(8.0f);
        HashMap<String, Float> hashMap = new HashMap<String, Float>();
        float f8 = 0.0f;
        for (Map.Entry object2 : map.entrySet()) {
            f3 = this.thdz_2().shdf_2((String)object2.getKey(), f6);
            f2 = this.thdz_2().shdf_2(((taw)object2.getValue()).jtkh(), f6);
            f = f5 + f3 + f5 * 4.0f + (f2 + this.ada_4(4.0f)) + f5;
            hashMap.put((String)object2.getKey(), Float.valueOf(f));
            if (!(f > f8)) continue;
            f8 = f;
        }
        String string = "Cooldowns";
        String string2 = "c";
        f3 = this.thdz_2().shdf_2(string, f6);
        f2 = brz_2.tsf.shdf_2(string2, f7);
        f = Math.max(f3 + f2 + f5 * 5.0f, f8);
        ArrayList arrayList = new ArrayList(map.keySet());
        arrayList.sort((arg_0, arg_1) -> tdhy.ashsh(hashMap, arg_0, arg_1));
        float f9 = this.khta_3().getX();
        float f10 = this.khta_3().getY();
        float f11 = this.khta_3().getWidth();
        boolean bl = f9 + f11 / 2.0f > (float)mc.method_22683().method_4486() / 2.0f;
        float f12 = bl ? f9 + f11 - f : f9;
        bjgh.jghs.hrj(class_45872, f12, f10, f, f4, 3.0f, new Color(12, 12, 18, 240));
        this.thdz_2().zskh_4(class_45872, string, f12 + f5, f10 + f4 / 2.0f - f6 / 2.0f, f6, Color.WHITE, 0.0f);
        brz_2.tsf.jdz(class_45872, string2, f12 + f - f5 - f2, f10 + f4 / 2.0f - f7 / 2.0f, f7, bas_4.zsz_4(), bas_4.tkb_2(), 1.1f);
        float f13 = f10 + f4 + 1.5f;
        for (String string3 : arrayList) {
            float f14 = this.bzb_2.getOrDefault(string3, Float.valueOf(0.0f)).floatValue();
            if (f14 <= 0.05f) continue;
            float f15 = hashMap.getOrDefault(string3, Float.valueOf(f)).floatValue();
            float f16 = bl ? f9 + f11 - f15 : f9;
            float f17 = f4 * f14;
            int n = (int)(255.0f * f14);
            bjgh.thqf.tgha_2(class_45872, f16, f13, f15, f17, 3.0f, new Color(0, 0, 0, (int)(205.0f * f14)));
            float f18 = f13 + f17 / 2.0f - f6 / 2.0f;
            this.thdz_2().zskh_4(class_45872, string3, f16 + f5, f18, f6, new Color(255, 255, 255, n), 0.0f);
            String string4 = ((taw)map.get(string3)).jtkh();
            float f19 = this.thdz_2().shdf_2(string4, f6);
            float f20 = f19 + this.ada_4(4.0f);
            float f21 = (f6 + this.ada_4(2.0f)) * f14;
            float f22 = f16 + f15 - f5 - f20;
            float f23 = f13 + f17 / 2.0f - f21 / 2.0f;
            if (f14 > 0.5f) {
                bjgh.jghs.hrj(class_45872, f22, f23, f20, f21, 2.0f, new Color(0, 0, 0, (int)(180.0f * f14)));
                this.thdz_2().zskh_4(class_45872, string4, f22 + f20 / 2.0f - f19 / 2.0f, f18, f6, new Color(255, 255, 255, n), 0.0f);
            }
            f13 += f17 + 1.5f;
        }
        this.khta_3().setWidth(f);
        this.khta_3().setHeight(f13 - f10);
    }

    private Map wa() {
        HashMap<String, taw> hashMap = new HashMap<String, taw>();
        if (tdhy.mc.field_1724 == null) {
            return hashMap;
        }
        class_1796 class_17962 = tdhy.mc.field_1724.method_7357();
        float f = mc.method_61966().method_60637(false);
        for (int i = 0; i < tdhy.mc.field_1724.method_31548().method_5439(); ++i) {
            ItemCooldownManagerEntryAccessor itemCooldownManagerEntryAccessor;
            int n;
            class_1799 class_17992 = tdhy.mc.field_1724.method_31548().method_5438(i);
            if (class_17992.method_7960() || !class_17962.method_7904(class_17992)) continue;
            class_2960 class_29602 = class_17962.method_62836(class_17992);
            Object obj = ((ItemCooldownManagerAccessor)class_17962).getEntries().get(class_29602);
            if (obj == null || (n = Math.max(0, (itemCooldownManagerEntryAccessor = (ItemCooldownManagerEntryAccessor)obj).getEndTick() - (((ItemCooldownManagerAccessor)class_17962).getTick() + (int)f))) <= 0) continue;
            String string = class_17992.method_7909().method_63680().getString();
            String string2 = bkd_2.dhy_5(n);
            hashMap.put(string, new taw(string2));
        }
        return hashMap;
    }

    @Override
    protected Map dhhgh() {
        return null;
    }

    private static int ashsh(Map map, String string, String string2) {
        return Float.compare(map.getOrDefault(string2, Float.valueOf(0.0f)).floatValue(), map.getOrDefault(string, Float.valueOf(0.0f)).floatValue());
    }

    private static boolean khthy(Map map, Map.Entry entry) {
        return !map.containsKey(entry.getKey()) && ((Float)entry.getValue()).floatValue() < 0.05f;
    }

    private void ztd_8(String string) {
        this.bzb_2.put(string, Float.valueOf(this.bzb_2.getOrDefault(string, Float.valueOf(0.0f)).floatValue() + (1.0f - this.bzb_2.getOrDefault(string, Float.valueOf(0.0f)).floatValue()) * 0.15f));
    }

    private static String[] p2osrgnolzugea(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite s3zzswk8ro7o(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sovg9189m8h ^ string.hashCode() ^ n2 + la3vj75k3 + i * 1739930395) + sovg9189m8h) ^ la3vj75k3));
            }
            String[] stringArray = tdhy.p2osrgnolzugea(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

