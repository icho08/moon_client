/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1937
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import net.minecraft.class_1937;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.ra_2;

public class ja
extends bqt {
    private static final float hl_2 = 20.0f;
    private static final float rks_2 = 7.0f;
    private static final float khsb = 11.0f;
    private static final float jsa_4 = 7.8f;
    private static final float dhghq = 3.0f;
    private static final float hshd_2 = 4.0f;
    private final ra_2 jzj = new ra_2("Nether Coords", List.of("Enabled", "Disabled"), "Disabled");
    private final tdj dts = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int w87epxs48tj2 = 87910309;
    private static final int p9aexf8u0haqu = 1938226046;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kneoyxick07t;

    public ja() {
        super(30.0f, 120.0f);
        this.dts.tyt_3(this::zts_6);
        this.rght(this.jzj);
        this.rght(this.dts);
    }

    @Override
    public String getName() {
        return "Moondlc XYZ";
    }

    @Override
    public void lh(class_4587 class_45872) {
        int n;
        if (ja.mc.field_1724 == null || ja.mc.field_1687 == null) {
            return;
        }
        float f = this.awd_2();
        float f2 = this.bhh_3(true, f);
        if (!this.tdha_2()) {
            return;
        }
        String string = String.valueOf((int)Math.floor(ja.mc.field_1724.method_23317()));
        String string2 = String.valueOf((int)Math.floor(ja.mc.field_1724.method_23318()));
        String string3 = String.valueOf((int)Math.floor(ja.mc.field_1724.method_23321()));
        boolean bl = this.jzj.thnth("Enabled");
        boolean bl2 = ja.mc.field_1687.method_27983() == class_1937.field_25180;
        int n2 = bl2 ? (int)Math.floor(ja.mc.field_1724.method_23317() * 8.0) : (int)Math.floor(ja.mc.field_1724.method_23317() / 8.0);
        int n3 = n = bl2 ? (int)Math.floor(ja.mc.field_1724.method_23321() * 8.0) : (int)Math.floor(ja.mc.field_1724.method_23321() / 8.0);
        String string4 = bl ? String.format(" [%s %d, %d]", bl2 ? "OW:" : "N:", n2, n) : "";
        float f3 = bl ? this.khh().shdf_2(string4, 7.0f) : 0.0f;
        float f4 = 31.0f + this.dhqh("x", string) + 4.0f + this.dhqh("y", string2) + 4.0f + this.dhqh("z", string3) + (bl ? f3 + 3.0f : 0.0f);
        float f5 = this.zfj_2(this.khta_3().getX());
        float f6 = this.zfj_2(this.khta_3().getY());
        class_45872.method_22903();
        float f7 = 0.92f + 0.08f * f2;
        class_45872.method_46416(f5 + f4 / 2.0f, f6 + 10.0f, 0.0f);
        class_45872.method_22905(f7, f7, 1.0f);
        class_45872.method_46416(-(f5 + f4 / 2.0f), -(f6 + 10.0f), 0.0f);
        tbkh.bsdh_2(class_45872, f5, f6, f4, 20.0f, f2, 8.0f);
        tbkh.ja_2(class_45872, f5, f6, f4, 20.0f, 8.0f, 0.22f, f2);
        bsh_2 bsh2 = brz_2.khkhj;
        float f8 = bsh2.shdf_2("q", 11.0f);
        bsh2.zskh_4(class_45872, "q", f5 + 7.0f + 5.5f - f8 / 2.0f, f6 + 10.0f - 5.5f + 0.9f, 11.0f, bas_4.tdth_2(Math.round(255.0f * f2)), 0.0f);
        float f9 = f5 + 7.0f + 11.0f + 6.0f;
        f9 = this.dyk(class_45872, f9, f6, "x", string, f2) + 4.0f;
        f9 = this.dyk(class_45872, f9, f6, "y", string2, f2) + 4.0f;
        f9 = this.dyk(class_45872, f9, f6, "z", string3, f2);
        if (bl) {
            float f10 = f6 + 10.0f - 4.2000003f;
            this.khh().zskh_4(class_45872, string4, f9 + 2.0f, f10, 7.0f, bas_4.tdth_2(Math.round(220.0f * f2)), 0.0f);
        }
        class_45872.method_22909();
        this.khta_3().setWidth(f4);
        this.khta_3().setHeight(20.0f);
    }

    private float dyk(class_4587 class_45872, float f, float f2, String string, String string2, float f3) {
        bsh_2 bsh2 = this.khh();
        float f4 = f2 + 10.0f - 4.6800003f;
        bsh2.zskh_4(class_45872, string, f, f4, 7.8f, bas_4.tdth_2(Math.round(255.0f * f3)), 0.0f);
        float f5 = bsh2.shdf_2(string, 7.8f);
        bsh2.zskh_4(class_45872, string2, f + f5 + 3.0f, f4, 7.8f, tbkh.hkdh(f3), 0.0f);
        return f + f5 + 3.0f + bsh2.shdf_2(string2, 7.8f);
    }

    private float dhqh(String string, String string2) {
        bsh_2 bsh2 = this.khh();
        return bsh2.shdf_2(string, 7.8f) + 3.0f + bsh2.shdf_2(string2, 7.8f);
    }

    private void zts_6(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] ihl7o53xs(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite m65n1z8c2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ w87epxs48tj2 ^ string.hashCode() ^ n2 + p9aexf8u0haqu + i * 260668869) + w87epxs48tj2) ^ p9aexf8u0haqu));
            }
            String[] stringArray = ja.ihl7o53xs(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

