/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_3675
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_3675;
import us.m0vy.moondlc.m0vyguard.bhh;
import us.m0vy.moondlc.m0vyguard.bhm;
import us.m0vy.moondlc.m0vyguard.bdhw;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.blm;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bnn;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.bhm_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.tkhd;
import us.m0vy.moondlc.m0vyguard.thq_3;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.khw;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.nt_3;

public class bsd_3
extends nt_3 {
    private final fa_2 hlm;
    private final fa_2 ssth_2;
    private final fa_2 tss;
    private final fa_2 szq;
    private final fa_2 shtr_2;
    private static final byq dsy_2;
    private static final byq kd;
    private static final byq szh_3;
    private final bsb dhft_2;
    private final thq_3 jdh;
    private boolean zagh_2;
    private boolean hkw;
    private long khnh_2 = 0L;
    private boolean rdz_2 = false;
    private boolean zhsh = false;
    private static final int hbr42460erbp9 = 777084754;
    private static final int eb7sfjk5 = -148012695;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ic16dwdsnbsriq;

    public bsd_3(bsb bsb2, thq_3 thq2) {
        this.dhft_2 = bsb2;
        this.jdh = thq2;
        this.hlm = new fa_2(280L, 1.0f, jkh.dzb);
        this.ssth_2 = new fa_2(280L, 1.0f, jkh.dzb);
        this.tss = new fa_2(240L, 0.0f, jkh.tb);
        this.szq = new fa_2(90L, jkh.dzb);
        this.shtr_2 = new fa_2(500L, jkh.dzb);
    }

    public static String ghdha(int n) {
        if (n == 0 || n == -1 || n == -999) {
            return "";
        }
        if (n >= 0 && n <= 7) {
            return switch (n) {
                case 0 -> "M1";
                case 1 -> "M2";
                case 2 -> "M3";
                case 3 -> "M4";
                case 4 -> "M5";
                case 5 -> "M6";
                case 6 -> "M7";
                case 7 -> "M8";
                default -> "M" + (n + 1);
            };
        }
        if (n >= -100 && n <= -90) {
            int n2 = n + 100;
            return switch (n2) {
                case 0 -> "M1";
                case 1 -> "M2";
                case 2 -> "M3";
                case 3 -> "M4";
                case 4 -> "M5";
                case 5 -> "M6";
                case 6 -> "M7";
                case 7 -> "M8";
                default -> "M" + (n2 + 1);
            };
        }
        Object object = bhm_2.getKeyName(n);
        if (object == null || ((String)object).equals("KEY_NONE") || ((String)object).equalsIgnoreCase("none")) {
            try {
                object = class_3675.method_15985((int)n, (int)-1).method_1441();
                object = ((String)object).replace("key.keyboard.", "").replace("key.", "").replace(".", "");
            }
            catch (Exception exception) {
                object = String.valueOf(n);
            }
        }
        if (((String)(object = ((String)object).replace("KEY_", "").replace("KEY", ""))).startsWith("NUMPAD_")) {
            object = "Num" + ((String)object).substring(7);
        }
        if (((String)object).equals("LEFT_CONTROL") || ((String)object).equals("RIGHT_CONTROL")) {
            object = "Ctrl";
        }
        if (((String)object).equals("LEFT_SHIFT") || ((String)object).equals("RIGHT_SHIFT")) {
            object = "Shift";
        }
        if (((String)object).equals("LEFT_ALT") || ((String)object).equals("RIGHT_ALT")) {
            object = "Alt";
        }
        if (((String)object).equals("GRAVE_ACCENT")) {
            object = "`";
        }
        if (((String)object).equals("APOSTROPHE")) {
            object = "'";
        }
        if (((String)object).equals("SEMICOLON")) {
            object = ";";
        }
        if (((String)object).equals("BACKSLASH")) {
            object = "\\";
        }
        if (((String)object).equals("SLASH")) {
            object = "/";
        }
        if (((String)object).equals("LEFT_BRACKET")) {
            object = "[";
        }
        if (((String)object).equals("RIGHT_BRACKET")) {
            object = "]";
        }
        if (((String)object).equals("MINUS")) {
            object = "-";
        }
        if (((String)object).equals("EQUAL")) {
            object = "=";
        }
        if (((String)object).equals("PERIOD")) {
            object = ".";
        }
        if (((String)object).equals("COMMA")) {
            object = ",";
        }
        return ((String)object).toUpperCase();
    }

    public void sst_7(bzth bzth2, float f) {
        this.tss.dam_2(jkh.tb);
        this.tss.ddt_6(this.dhft_2.rgha_2());
        this.shtr_2.ddt_6(this.zagh_2);
        this.szq.khmf(this.zagh_2 ? (this.hkw ? 1.0f : -1.0f) : 0.0f);
        if (this.shtr_2.tssh_2() == 1.0f) {
            this.zagh_2 = false;
        }
        if (this.szq.tssh_2() == 1.0f) {
            this.hkw = false;
        }
        if (this.szq.tssh_2() == -1.0f) {
            this.hkw = true;
        }
        float f2 = this.hlm.tssh_2() * f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(16.0f, 16.0f, 17.0f, 255.0f) : dsy_2;
        bzth2.drawRoundedRect(this.sdht_2, this.shat_2, this.zshl, this.zqkh, zth_8.all(5.0f), byq2.thzz_4(f2));
    }

    @Override
    protected void bws_2(bzth bzth2) {
        this.sst_7(bzth2, 1.0f);
    }

    public void thzs_3(bzth bzth2, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        String string;
        float f6 = this.tss.tssh_2();
        float f7 = this.hlm.tssh_2() * f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bnn.dzb_2().dhdhk(this.sdht_2);
        String string2 = this.zhsh ? "..." : (string = this.dhft_2.jmr() ? bsd_3.ghdha(this.dhft_2.thaf()) : "");
        if (!string.isEmpty()) {
            f5 = this.sdht_2 + 8.0f + this.szq.tssh_2() * 1.5f;
            f4 = bmn.sdha_2.twy_2(6.5f).dak(string);
            f3 = Math.max(13.0f, f4 + 6.0f);
            f2 = 11.0f;
            float f8 = f5;
            float f9 = this.shat_2 + 6.0f;
            byq byq3 = this.zhsh ? byq2 : (bl ? new byq(24.0f, 24.0f, 27.0f, 255.0f) : new byq(225.0f, 225.0f, 230.0f, 255.0f));
            bzth2.drawRoundedRect(f8, f9, f3, f2, zth_8.all(3.0f), byq3.thzz_4(f7));
        }
        f5 = 20.0f;
        f4 = 11.0f;
        f3 = this.sdht_2 + this.zshl - f5 - 8.0f;
        f2 = this.shat_2 + 6.0f;
        byq byq4 = byq2;
        byq byq5 = bl ? new byq(28.0f, 28.0f, 32.0f, 255.0f) : new byq(200.0f, 204.0f, 212.0f, 255.0f);
        bzth2.drawRoundedRect(f3, f2, f5, f4, zth_8.all(5.5f), byq5.dkhw_2(byq4, f6).thzz_4(f7));
    }

    public void rat_4(bzth bzth2) {
        this.thzs_3(bzth2, 1.0f);
    }

    public void bl_2(bzth bzth2, float f) {
        float f2 = this.tss.tssh_2();
        float f3 = this.hlm.tssh_2() * f;
        float f4 = 20.0f;
        float f5 = this.sdht_2 + this.zshl - f4 - 8.0f;
        float f6 = this.shat_2 + 6.0f;
        float f7 = 7.0f;
        float f8 = f5 + 2.0f + 9.0f * f2;
        bzth2.drawRoundedRect(f8, f6 + 2.0f, f7, f7, zth_8.all(3.5f), bhj_2.rrd.thzz_4(f3));
    }

    public void dhadh(bzth bzth2) {
        this.bl_2(bzth2, 1.0f);
    }

    public void hdw_2(bzth bzth2, float f) {
        String string;
        float f2 = this.hlm.tssh_2() * f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(250.0f, 250.0f, 250.0f, 255.0f) : kd;
        float f3 = this.sdht_2 + 8.0f + this.szq.tssh_2() * 1.5f;
        String string2 = this.zhsh ? "..." : (string = this.dhft_2.jmr() ? bsd_3.ghdha(this.dhft_2.thaf()) : "");
        if (!string.isEmpty()) {
            float f4 = bmn.sdha_2.twy_2(6.5f).dak(string);
            float f5 = Math.max(13.0f, f4 + 6.0f);
            float f6 = 11.0f;
            float f7 = this.shat_2 + 6.0f;
            byq byq3 = this.zhsh ? bhj_2.rrd : (bl ? new byq(180.0f, 180.0f, 185.0f, 255.0f) : new byq(100.0f, 100.0f, 105.0f, 255.0f));
            bzth2.drawCenteredText(bmn.sdha_2.twy_2(6.5f), string, f3 + f5 / 2.0f, f7 + 2.5f, byq3.thzz_4(f2));
            f3 += f5 + 4.0f;
        }
        bzth2.drawText(bmn.sdha_2.twy_2(8.5f), this.dhft_2.getName(), f3, this.shat_2 + 8.5f, byq2.thzz_4(f2));
    }

    public void hdhh(bzth bzth2) {
        this.hdw_2(bzth2, 1.0f);
    }

    public void stht(bzth bzth2, float f) {
        float f2 = this.hlm.tssh_2() * f;
        boolean bl = bnn.dzb_2().ghdt();
        byq byq2 = bl ? new byq(135.0f, 135.0f, 142.0f, 255.0f) : szh_3;
        String string = this.dhft_2.zhz();
        if (string == null || string.isEmpty()) {
            return;
        }
        float f3 = this.zshl - 16.0f;
        float f4 = bmn.shzth.twy_2(7.0f).dak(string);
        boolean bl2 = this.rhb(bzth2);
        if (bl2 && !this.rdz_2) {
            this.khnh_2 = System.currentTimeMillis();
        }
        this.rdz_2 = bl2;
        if (f4 <= f3) {
            bzth2.drawText(bmn.shzth.twy_2(7.0f), string, this.sdht_2 + 8.0f, this.shat_2 + 21.0f, byq2.thzz_4(f2));
        } else if (bl2) {
            long l = Math.max(0L, System.currentTimeMillis() - this.khnh_2);
            float f5 = f4 - f3 + 8.0f;
            float f6 = 0.0f;
            if (l > 400L) {
                float f7 = (float)((l - 400L) % 3200L) / 3200.0f;
                float f8 = (float)(Math.sin((double)f7 * Math.PI * 2.0 - 1.5707963267948966) * 0.5 + 0.5);
                f6 = f8 * f5;
            }
            bhm.dar_2(bzth2.method_51448(), this.sdht_2 + 8.0f, this.shat_2 + 19.0f, f3, 14.0f);
            bzth2.drawText(bmn.shzth.twy_2(7.0f), string, this.sdht_2 + 8.0f - f6, this.shat_2 + 21.0f, byq2.thzz_4(f2));
            bhm.sdhsh_2();
        } else {
            Object object = string;
            while (((String)object).length() > 3 && bmn.shzth.twy_2(7.0f).dak((String)object + "...") > f3) {
                object = ((String)object).substring(0, ((String)object).length() - 1);
            }
            object = (String)object + "...";
            bzth2.drawText(bmn.shzth.twy_2(7.0f), (String)object, this.sdht_2 + 8.0f, this.shat_2 + 21.0f, byq2.thzz_4(f2));
        }
    }

    public void hyt(bzth bzth2) {
        this.stht(bzth2, 1.0f);
    }

    public boolean dtr_3() {
        return this.dhft_2.dty() != null && this.dhft_2.dty().stream().anyMatch(bdhw::tsa_5);
    }

    @Override
    public void dh_4(double d, double d2, tthdh tthdh2) {
        float f;
        float f2;
        String string;
        tkhd tkhd2 = tkhd.getCurrentScreen();
        if (this.zhsh) {
            this.dhft_2.zhs_5(tthdh2.getButtonIndex());
            this.zhsh = false;
            return;
        }
        float f3 = this.sdht_2 + 8.0f;
        String string2 = string = this.dhft_2.jmr() ? bsd_3.ghdha(this.dhft_2.thaf()) : "";
        if (!string.isEmpty() && bhh.thsb_2(f3, this.shat_2 + 4.0f, f2 = Math.max(13.0f, (f = bmn.sdha_2.twy_2(6.5f).dak(string)) + 6.0f), 14.0, d, d2)) {
            this.zhsh = true;
            return;
        }
        f = 22.0f;
        f2 = this.sdht_2 + this.zshl - f - 8.0f;
        if (bhh.thsb_2(f2, this.shat_2 + 5.0f, f, 14.0, d, d2) && tthdh2 == tthdh.tdha_2) {
            this.dhft_2.dwkh();
            khw.sbkh_2.play(0.8f);
            return;
        }
        switch (blm.dhyt_2[tthdh2.ordinal()]) {
            case 1: {
                this.dhft_2.dwkh();
                khw.sbkh_2.play(0.8f);
                break;
            }
            case 2: {
                if (tkhd2 == null || !this.dtr_3()) break;
                tkhd2.openFlyingSettingsTab(this, (float)d, (float)d2);
                khw.ghs.play(0.8f);
                break;
            }
            case 3: {
                if (tkhd2 == null) break;
                tkhd2.openKeybindPopup(this, (float)d, (float)d2);
                khw.ghs.play(0.8f);
            }
        }
    }

    public boolean jghh() {
        return this.zhsh;
    }

    @Generated
    public fa_2 hls() {
        return this.hlm;
    }

    @Generated
    public fa_2 hshh_2() {
        return this.ssth_2;
    }

    @Generated
    public bsb zhz_7() {
        return this.dhft_2;
    }

    @Generated
    public thq_3 bwkh() {
        return this.jdh;
    }

    @Generated
    public void sdz_2(boolean bl) {
        this.zhsh = bl;
    }

    private static String[] gp3c18ekbj6(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kas8w6oq8o(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hbr42460erbp9 ^ string.hashCode()) + (n2 + eb7sfjk5) + i ^ hbr42460erbp9, 17) + eb7sfjk5);
            }
            String[] stringArray = bsd_3.gp3c18ekbj6(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

