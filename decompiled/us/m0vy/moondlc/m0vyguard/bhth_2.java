/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bhl_2;
import us.m0vy.moondlc.m0vyguard.tjdh;
import us.m0vy.moondlc.m0vyguard.ta_4;
import us.m0vy.moondlc.m0vyguard.qk;
import us.movy.moondlc.Moondlc;

public class bhth_2 {
    private final List tbt_2 = new CopyOnWriteArrayList();
    private final List zra = new CopyOnWriteArrayList();
    private final bql<bbgh> jbth = this::zjw_2;
    private static final int barxgt3wu8 = 162397690;
    private static final int mblj8bk1 = 920107182;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int k2ennmp9c1bdj;

    public bhth_2() {
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    public void khdhz_2(qk qk2, String string) {
        this.tbt_2.add(new tjdh(qk2, string));
        try {
            String string2 = string.toLowerCase();
            if (string2.contains("loaded") || string2.contains("загружен")) {
                bhl_2.tza_8(string);
            } else {
                boolean bl;
                boolean bl2 = string2.contains("enabled") || string2.contains("включен") || string2.contains("enable");
                boolean bl3 = bl = string2.contains("disabled") || string2.contains("выключен") || string2.contains("disable");
                if (bl2 || bl) {
                    String string3 = string;
                    string3 = string3.replace("enabled", "").replace("disabled", "").replace("Enabled", "").replace("Disabled", "").replace("включен", "").replace("выключен", "").trim();
                    bhl_2.tjk_2(string3, bl2);
                } else {
                    bhl_2.zqh_2("Info", string);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void thhd_2(qk qk2, String string, String string2) {
        try {
            bhl_2.zqh_2(string, string2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Generated
    public List dghs_3() {
        return this.tbt_2;
    }

    @Generated
    public List dkhm_2() {
        return this.zra;
    }

    private void zjw_2(bbgh bbgh2) {
        for (Object object : this.tbt_2) {
            ((tjdh)object).htd_4();
        }
        float f = 0.0f;
        for (ta_4 ta2 : this.zra) {
            ta2.ada_2();
            ta2.thkl(bbgh2.dtn(), f);
            if (!(ta2.szdh().tssh_2() >= 0.5f) && ta2.zhw_2().tagh(ta2.thzm_2())) continue;
            f += 30.0f;
        }
        this.tbt_2.removeIf(tjdh::tja);
        this.zra.removeIf(ta_4::ghtn);
    }

    private static String[] tkm53ktlgx(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gg9wo7adlkomu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ barxgt3wu8 ^ string.hashCode() ^ n2 + mblj8bk1 + i * -1430937915) + barxgt3wu8) ^ mblj8bk1));
            }
            String[] stringArray = bhth_2.tkm53ktlgx(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

