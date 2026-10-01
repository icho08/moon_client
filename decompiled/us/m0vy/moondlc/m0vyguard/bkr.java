/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tbh;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;

public class bkr {
    private boolean thash;
    private Color zdhz = Color.WHITE;
    private final float dhhb_2;
    private final trd ryl;
    private final String[] zrgh = new String[]{"", ""};
    private final String[] dhtl = new String[]{"", ""};
    private final fa_2[] rkm;
    private float khzr;
    private float dmgh;
    private float dhaq_2;
    private static final int tkth5tvlw43d = 866772777;
    private static final int rj30m38cw = -199112626;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s38kv63y6p;

    public bkr(trd trd2, float f, long l, jkh jkh2) {
        this.ryl = trd2;
        this.dhhb_2 = f;
        this.rkm = new fa_2[2];
        for (int i = 0; i < this.rkm.length; ++i) {
            this.rkm[i] = new fa_2(l, jkh2);
        }
    }

    public bkr(bsh_2 bsh2, float f, long l, btf_2 btf2) {
        this.ryl = bmn.sdha_2.twy_2(bsh2.zrt_4());
        this.dhhb_2 = f;
        this.rkm = new fa_2[2];
        for (int i = 0; i < this.rkm.length; ++i) {
            this.rkm[i] = new fa_2(l, jkh.hd_2);
        }
    }

    public void skd_3(float f, float f2) {
        this.dmgh = f;
        this.dhaq_2 = f2;
    }

    public void bqa(bzth bzth2) {
        this.khtht_2(bzth2.method_51448(), this.dmgh, this.dhaq_2, this.ryl.ghtz_4());
    }

    public void khtht_2(class_4587 class_45872, float f, float f2, float f3) {
        for (fa_2 fa2_2 : this.rkm) {
            fa2_2.khmf(1.0f);
        }
        float f4 = (float)this.zdhz.getAlpha() / 255.0f * (1.0f - this.rkm[0].tssh_2());
        float f5 = (float)this.zdhz.getAlpha() / 255.0f * this.rkm[0].tssh_2();
        float f6 = (float)this.zdhz.getAlpha() / 255.0f * (1.0f - this.rkm[1].tssh_2());
        float f7 = (float)this.zdhz.getAlpha() / 255.0f * this.rkm[1].tssh_2();
        Color color = new Color(this.zdhz.getRed(), this.zdhz.getGreen(), this.zdhz.getBlue(), (int)(255.0f * f4));
        Color color2 = new Color(this.zdhz.getRed(), this.zdhz.getGreen(), this.zdhz.getBlue(), (int)(255.0f * f5));
        Color color3 = new Color(this.zdhz.getRed(), this.zdhz.getGreen(), this.zdhz.getBlue(), (int)(255.0f * f6));
        Color color4 = new Color(this.zdhz.getRed(), this.zdhz.getGreen(), this.zdhz.getBlue(), (int)(255.0f * f7));
        if (this.ryl != null) {
            this.zyq(this.dhtl[0], f, f2 + this.dhhb_2 * this.rkm[0].tssh_2(), color);
            this.zyq(this.zrgh[0], f, f2 - this.dhhb_2 + this.dhhb_2 * this.rkm[0].tssh_2(), color2);
            this.zyq(this.dhtl[1], f + this.khzr, f2 + this.dhhb_2 * this.rkm[1].tssh_2(), color3);
            this.zyq(this.zrgh[1], f + this.ryl.dma().dzh_3(this.zrgh[0], this.ryl.ghtz_4()), f2 - this.dhhb_2 + this.dhhb_2 * this.rkm[1].tssh_2(), color4);
        }
    }

    private void zyq(String string, float f, float f2, Color color) {
        if (string != null && !string.isEmpty() && this.ryl != null) {
            tbh.thal_2(this.ryl.dma(), string, this.ryl.ghtz_4(), color.getRGB(), new Matrix4f(), f, f2, 0.0f);
        }
    }

    public float sghsh() {
        return this.dhkh(this.ryl != null ? this.ryl.ghtz_4() : 7.0f);
    }

    public float dhkh(float f) {
        if (this.ryl != null) {
            return this.ryl.dma().dzh_3(this.zrgh[0] + this.zrgh[1], f);
        }
        return 10.0f;
    }

    public void ddhsh_2(int n) {
        this.tja_4(n, this.ryl != null ? this.ryl.ghtz_4() : 7.0f);
    }

    public void tja_4(int n, float f) {
        String string = String.valueOf(n / 10);
        String string2 = String.valueOf(n % 10);
        if (!string2.equals(this.zrgh[1])) {
            this.khzr = this.ryl != null ? this.ryl.dma().dzh_3(this.zrgh[0], f) : 5.0f;
            this.dhtl[1] = this.zrgh[1];
            this.zrgh[1] = string2;
            this.rkm[1].atth_2(0.0f);
        }
        if (!string.equals(this.zrgh[0])) {
            this.dhtl[0] = this.zrgh[0];
            this.zrgh[0] = this.thash ? string : (string.equals("0") ? "" : string);
            this.rkm[0].atth_2(0.0f);
        }
    }

    public void jath_2(boolean bl, Color color) {
        this.thash = bl;
        this.zdhz = color;
    }

    public void dhhw(boolean bl, byq byq2) {
        this.thash = bl;
        this.zdhz = new Color(byq2.sbk(), byq2.srl(), byq2.shsl_2(), byq2.tzdh_2());
    }

    private static String[] r3nm5s5emzz4(String string) {
        return string.split("\u0006\u0016", -1);
    }

    private static CallSite lhqouwjrwlwfr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ tkth5tvlw43d ^ string.hashCode() ^ n2 + rj30m38cw ^ i * 523489259 ^ tkth5tvlw43d, 19) ^ rj30m38cw));
            }
            String[] stringArray = bkr.r3nm5s5emzz4(new String(cArray));
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

