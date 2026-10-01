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
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.btb;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tdht_2;
import us.m0vy.moondlc.m0vyguard.ghsh_2;

public class bhl_2 {
    public static final CopyOnWriteArrayList skgh;
    private static final int it0w3s4 = -1868379700;
    private static final int lcqz47ls = 97760532;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int cuyumiqlij6x6h;

    public static void tjk_2(String string, boolean bl) {
        String string2 = bl ? "Enabled" : "Disabled";
        skgh.add(new tdht_2(string2, string, bl, btb.thal_2));
        bhl_2.bthh();
    }

    public static void tza_8(String string) {
        skgh.add(new tdht_2("Loaded config", string, true, btb.jdz));
        bhl_2.bthh();
    }

    public static void ttr_2(String string, String string2, long l) {
        tdht_2 tdht2_2 = new tdht_2(string, string2, true, btb.jdz);
        tdht2_2.bhd_3 = l;
        skgh.add(tdht2_2);
        bhl_2.bthh();
    }

    public static void zqh_2(String string, String string2) {
        skgh.add(new tdht_2(string, string2, true, btb.jdz));
        bhl_2.bthh();
    }

    private static void bthh() {
        int n = skgh.size() - 5;
        if (n > 0) {
            for (int i = 0; i < n; ++i) {
                tdht_2 tdht2_2 = (tdht_2)skgh.get(i);
                if (tdht2_2.rsht_2() || tdht2_2.tad_6()) continue;
                tdht2_2.bzd = System.currentTimeMillis() - tdht2_2.bhd_3;
            }
        }
    }

    public static void khby(class_4587 class_45872, float f, float f2) {
        float f3 = bza_4.thd_9();
        bsh_2 bsh2 = brz_2.ryk;
        float f4 = 6.8f * f3;
        String string = "Aura";
        String string2 = "Disabled".toLowerCase() + "!";
        String string3 = string + " " + string2;
        float f5 = bsh2.shdf_2(string3, f4);
        float f6 = 21.0f * f3;
        float f7 = 6.0f * f3;
        float f8 = f6 - f7 * 1.5f;
        float f9 = f8 + f7 * 2.5f + f5 + f7;
        bhl_2.rmz(class_45872, f, f2, f9, f6, f7, f3, 1.0f, "Disabled", string, false, 0L);
    }

    private static void rmz(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, float f7, String string, String string2, boolean bl, long l) {
        int n = Math.max(0, Math.min(255, (int)(200.0f * f7)));
        int n2 = Math.max(0, Math.min(255, (int)(255.0f * f7)));
        Color color = new Color(12, 12, 18, n);
        bjgh.jghs.hrj(class_45872, f, f2, f3, f4, 3.0f * f6, color);
        long l2 = System.currentTimeMillis() - l;
        float f8 = 2000.0f;
        float f9 = Math.max(0.0f, 1.0f - (float)l2 / f8);
        float f10 = 1.5f * f6;
        float f11 = f3 - 4.0f * f6;
        float f12 = f11 * f9;
        Color color2 = bas_4.tdth_2(n2);
        if (f12 > 0.0f && (string.equals("Disabled") || string.equals("Enabled") || string.equals("Loaded config"))) {
            bjgh.jghs.hrj(class_45872, f + 2.0f * f6, f2 + f4 - f10 - 1.5f * f6, f12, f10, f10 / 2.0f, color2);
        }
        String string3 = "q";
        bsh_2 bsh2 = brz_2.khkhj;
        float f13 = 11.0f * f6;
        Color color3 = bl ? bas_4.tdth_2(n2) : new Color(150, 150, 150, n2);
        float f14 = f4 - f5 * 1.5f;
        float f15 = f2 + (f4 - f13) / 2.0f - 0.5f * f6;
        bsh2.zskh_4(class_45872, string3, f + f5, f15, f13, color3, 0.0f);
        bsh_2 bsh3 = brz_2.shjh_2;
        float f16 = 6.8f * f6;
        float f17 = f + f5 * 1.5f + f14 + 2.0f * f6;
        String string4 = string2 + " " + bhl_2.dshy_2(string).toLowerCase() + "!";
        bsh3.zskh_4(class_45872, string4, f17, f2 + f4 / 2.0f - f16 / 2.2f - 0.5f * f6, f16, new Color(220, 220, 220, n2), 0.0f);
    }

    public static void hmt_2(class_4587 class_45872, float f, float f2) {
        if (skgh.isEmpty()) {
            return;
        }
        float f3 = bza_4.thd_9();
        float f4 = f2;
        float f5 = 4.0f * f3;
        for (int i = 0; i < skgh.size(); ++i) {
            tdht_2 tdht2_2 = (tdht_2)skgh.get(i);
            tdht2_2.sjt_4.sbsh_2(1.0, 350L, tbm.tba, true);
            tdht2_2.sjt_4.ddhdh();
            if (System.currentTimeMillis() - tdht2_2.bzd > 2000L) {
                tdht2_2.ssn.sbsh_2(1.0, 300L, tbm.hrkh, true);
                tdht2_2.ssn.ddhdh();
            }
            if (tdht2_2.tad_6()) {
                skgh.remove(tdht2_2);
                --i;
                continue;
            }
            float f6 = (float)tdht2_2.sjt_4.khbk();
            float f7 = 1.0f - (float)tdht2_2.ssn.khbk();
            float f8 = f7;
            if (f8 <= 0.01f) continue;
            bsh_2 bsh2 = brz_2.ryk;
            float f9 = 6.8f * f3;
            float f10 = bsh2.shdf_2(bhl_2.dshy_2(tdht2_2.tms) + " ", f9);
            float f11 = bsh2.shdf_2(tdht2_2.dha_3, f9);
            float f12 = 21.0f * f3;
            float f13 = 6.0f * f3;
            float f14 = f12 + f13;
            float f15 = f14 + f10 + f11 + f13 * 2.0f;
            float f16 = f4;
            if (tdht2_2.hs_2.khbk() == -1.0) {
                tdht2_2.hs_2.shkh_6(f16 - f12 * 0.5f);
            }
            tdht2_2.hs_2.sbsh_2(f16, 250L, tbm.srdh, true);
            tdht2_2.hs_2.ddhdh();
            float f17 = (float)tdht2_2.hs_2.khbk();
            float f18 = f;
            bhl_2.rmz(class_45872, f18, f17, f15, f12, f13, f3, f8, tdht2_2.tms, tdht2_2.dha_3, tdht2_2.hbz, tdht2_2.bzd);
            f4 += f12 + f5;
        }
    }

    public static String dshy_2(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        return switch (string) {
            case "Enabled" -> ghsh_2.shhw("notification.enabled", "Enabled", new Object[0]);
            case "Disabled" -> ghsh_2.shhw("notification.disabled", "Disabled", new Object[0]);
            case "Loaded config" -> ghsh_2.shhw("notification.loaded_config", "Loaded config", new Object[0]);
            default -> ghsh_2.shhw("notification." + ghsh_2.bbn(string), string, new Object[0]);
        };
    }

    private static String[] tencmqptg0zi(String string) {
        return string.split("\u0004\u0015", -1);
    }

    private static CallSite xt8w34gg3jsu1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ it0w3s4 ^ string.hashCode() ^ n2 + lcqz47ls ^ i * 879170693 ^ it0w3s4, 9) ^ lcqz47ls));
            }
            String[] stringArray = bhl_2.tencmqptg0zi(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

