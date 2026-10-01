/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_310
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
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bds;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bghd_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmth;
import us.m0vy.moondlc.m0vyguard.bnm;
import us.m0vy.moondlc.m0vyguard.bws_2;
import us.m0vy.moondlc.m0vyguard.byd_2;
import us.m0vy.moondlc.m0vyguard.byn;
import us.m0vy.moondlc.m0vyguard.tbb;
import us.m0vy.moondlc.m0vyguard.ttd_2;
import us.m0vy.moondlc.m0vyguard.ttq;
import us.m0vy.moondlc.m0vyguard.tdhq;
import us.m0vy.moondlc.m0vyguard.tsy;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.ja;
import us.m0vy.moondlc.m0vyguard.khb;
import us.m0vy.moondlc.m0vyguard.zf_2;
import us.m0vy.moondlc.m0vyguard.qr;
import us.m0vy.moondlc.m0vyguard.msh;
import us.m0vy.moondlc.m0vyguard.wh_2;
import us.movy.moondlc.Moondlc;

public class taa {
    private static final taa khny;
    private final List dhz_3 = new ArrayList();
    private final bql<bbgh> khsy_2 = this::sdz_3;
    private static final int att1czyar3b = -315007833;
    private static final int lja45g345 = -841516187;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int b78b0kljtx;

    public void jms_2() {
        this.rjgh(new bghd_2(), new bds(), new qr(), new bmth(), new zf_2(), new bnm(), new khb(), new ttd_2(), new tdhq(), new byn(), new ja(), new bws_2(), new byd_2());
        bzz.zhs_7().thrt_2();
        msh.jt_2().tdh();
        bza_4.thtsh_2().dhah_2();
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    private void dghs_4(class_4587 class_45872) {
        int n;
        float f;
        tbb tbb2 = bzz.zhs_7().dtsh_2();
        if (tbb2 == null || !this.shst_2(tbb2)) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        float f2 = class_3102.method_22683().method_4486();
        float f3 = class_3102.method_22683().method_4502();
        float f4 = 20.0f;
        for (f = 0.0f; f <= f2; f += f4) {
            n = (int)f % 100 == 0 ? 42 : 22;
            bjgh.jghs.jzw(class_45872, f, 0.0f, f, f3, new Color(255, 255, 255, n), 0.45f);
        }
        for (f = 0.0f; f <= f3; f += f4) {
            n = (int)f % 100 == 0 ? 42 : 22;
            bjgh.jghs.jzw(class_45872, 0.0f, f, f2, f, new Color(255, 255, 255, n), 0.45f);
        }
        f = tbb2.getX() + tbb2.getScaledWidth() / 2.0f;
        float f5 = tbb2.getY() + tbb2.getScaledHeight() / 2.0f;
        Color color = bas_4.tdth_2(150);
        bjgh.jghs.jzw(class_45872, f, 0.0f, f, f3, color, 0.9f);
        bjgh.jghs.jzw(class_45872, 0.0f, f5, f2, f5, color, 0.9f);
        bjgh.jlkh.shlr(class_45872, tbb2.getX(), tbb2.getY(), tbb2.getScaledWidth(), tbb2.getScaledHeight(), 2.0f, 0.9f, color);
    }

    private void tta_7(class_4587 class_45872, tbb tbb2) {
        if (tbb2.getScaledWidth() <= 0.0f || tbb2.getScaledHeight() <= 0.0f) {
            return;
        }
        float f = tbb2.getResizeHandleSize();
        float f2 = tbb2.getX() + tbb2.getScaledWidth() - f;
        float f3 = tbb2.getY() + tbb2.getScaledHeight() - f;
        Color color = tbb2.isResizing() || tbb2.isResizeHovering() ? bas_4.tdth_2(145) : bas_4.tdth_2(90);
        Color color2 = new Color(255, 255, 255, tbb2.isResizing() || tbb2.isResizeHovering() ? 190 : 120);
        bjgh.jghs.hrj(class_45872, f2, f3, f, f, 2.0f, color);
        bjgh.jghs.jzw(class_45872, f2 + 2.0f, f3 + f - 2.0f, f2 + f - 2.0f, f3 + f - 2.0f, color2, 0.8f);
        bjgh.jghs.jzw(class_45872, f2 + f - 2.0f, f3 + 2.0f, f2 + f - 2.0f, f3 + f - 2.0f, color2, 0.8f);
    }

    public void rjgh(thw_3 ... thwArray) {
        this.dhz_3.addAll(List.of(thwArray));
    }

    public boolean shst_2(tbb tbb2) {
        bza_4 bza2_2 = bza_4.thtsh_2();
        if (tbb2 == null || !bza2_2.rgha_2()) {
            return false;
        }
        return this.dhz_3.stream().filter(arg_0 -> taa.hthh(tbb2, arg_0)).findFirst().map(this::tmn).orElse(false);
    }

    private boolean tmn(thw_3 thw2_2) {
        return thw2_2.tat_2();
    }

    @Generated
    public List dab_4() {
        return this.dhz_3;
    }

    @Generated
    public bql thqr() {
        return this.khsy_2;
    }

    @Generated
    public static taa tdt_8() {
        return khny;
    }

    private static boolean hthh(tbb tbb2, thw_3 thw2_2) {
        return thw2_2.khta_3() == tbb2;
    }

    private void sdz_3(bbgh bbgh2) {
        bza_4 bza2_2 = bza_4.thtsh_2();
        wh_2 wh2 = new wh_2(bbgh2.dtn(), bbgh2.dtn().method_51448(), bbgh2.bhw());
        boolean bl = bza2_2 != null && bza2_2.rgha_2();
        for (thw_3 thw2_2 : this.dhz_3) {
            thw2_2.rsgh(wh2, bl && this.tmn(thw2_2));
        }
        if (bl) {
            class_310 class_3102 = class_310.method_1551();
            if (class_3102.field_1755 instanceof class_408) {
                this.dghs_4(wh2.matrixStack());
                bzz.zhs_7().shzf().forEach((arg_0, arg_1) -> this.ada_3(wh2, arg_0, arg_1));
            }
            tsy.baz_4().dzh_5(wh2.matrixStack());
            ttq.tdhd_4().hhj(wh2.matrixStack());
        }
    }

    private void ada_3(wh_2 wh2, String string, tbb tbb2) {
        if (tbb2.getModule().rgha_2()) {
            if (this.shst_2(tbb2)) {
                tbb2.onDraw();
                this.tta_7(wh2.matrixStack(), tbb2);
            } else if (tbb2.isActive()) {
                tbb2.onRelease(0);
            }
        }
    }

    private static String[] nwbm5rrawypck9(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite d12hnnynh0va(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ att1czyar3b ^ string.hashCode()) + (n2 + lja45g345) + i ^ att1czyar3b, 5) + lja45g345);
            }
            String[] stringArray = taa.nwbm5rrawypck9(new String(cArray));
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

