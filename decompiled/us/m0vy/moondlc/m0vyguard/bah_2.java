/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_3532
 *  net.minecraft.class_3675
 *  net.minecraft.class_5611
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_5611;
import us.m0vy.moondlc.m0vyguard.bd;
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.bdhq;
import us.m0vy.moondlc.m0vyguard.bsf;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.bhn_2;
import us.m0vy.moondlc.m0vyguard.tkhs;
import us.m0vy.moondlc.m0vyguard.tdha;
import us.m0vy.moondlc.m0vyguard.tzt;

public class bah_2
implements tdha {
    private String tkhq = "";
    private boolean hkz_2;
    private boolean dlz_2;
    private int dqa;
    private float dhkhdh;
    private bd rtl_2;
    private class_5611 dhsn_2;
    private String dhath_2;
    private float qd;
    private long stf = System.currentTimeMillis();
    private int sdkh_2 = Integer.MAX_VALUE;
    private tzt hshl = tzt.zhs;
    private float zwm = 0.0f;
    public bhn_2 tsha = new bhn_2(400L, 0.2f, bdz.hay);
    private static final int w6hfnlkw8 = 1279114613;
    private static final int s8a6nbtzd14 = 1163224211;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p13ba4f1vzgm6;

    public bah_2(class_5611 class_56112, bd bd2, String string, float f) {
        this.rtl_2 = bd2;
        this.dhath_2 = string;
        this.qd = f;
        this.dhsn_2 = class_56112;
    }

    public void htt_2(bdhq bdhq2, float f, float f2, bkt bkt2, bkt bkt3) {
        int n;
        this.dhsn_2 = new class_5611(f, f2);
        this.dqa = class_3532.method_15340((int)this.dqa, (int)0, (int)this.tkhq.length());
        this.dhkhdh = f;
        boolean bl = this.dhakh();
        float f3 = 0.0f;
        if (!bl) {
            String string = this.tkhq.substring(0, this.dqa);
            f3 = this.rtl_2.rghz(string);
        }
        float f4 = this.qd;
        int n2 = 0;
        while (this.rtl_2.rghz(this.tkhq.substring(n2, this.dqa)) > f4) {
            ++n2;
        }
        for (n = this.dqa; n < this.tkhq.length() && this.rtl_2.rghz(this.tkhq.substring(n2, n)) < f4; ++n) {
        }
        String string = this.tkhq.substring(n2, n);
        if (bl) {
            bdhq2.drawText(this.rtl_2, this.dhath_2, f, f2, bkt3);
        } else {
            bdhq2.drawText(this.rtl_2, string, f, f2, bkt2);
        }
        if (this.hkz_2 && System.currentTimeMillis() - this.stf > 200L) {
            float f5 = this.dhkhdh + f3 - this.zwm;
            this.tsha.sqm(250L);
            bdhq2.drawRect(f5, f2 - 1.0f, 1.0f, this.rtl_2.ghak() + 2.0f, bkt2.shbm(this.tsha.thdhsh(this.tsha.hnf() == 0.2f ? 1.0f : (this.tsha.hnf() == 1.0f ? 0.2f : this.tsha.bghq()))));
        }
        if (this.dlz_2) {
            bdhq2.drawRect(f - 1.0f, f2 - 1.0f, this.rtl_2.rghz(string) + 2.0f, this.rtl_2.ghak() + 2.0f, bkt3.shbm(0.5f));
        }
    }

    public void dhh_6(double d, double d2, bsf bsf2) {
        class_5611 class_56112 = this.ttz_5();
        boolean bl = this.hkz_2 = bsf2.getButtonIndex() == 0 && tkhs.hd_3(d, d2, class_56112.method_32118(), class_56112.method_32119() - 1.0f, this.qd, this.rtl_2.ghak() + 2.0f);
        if (this.hkz_2) {
            this.dlz_2 = false;
        }
    }

    public boolean tbn(int n, int n2, int n3) {
        if (!this.hkz_2) {
            return false;
        }
        this.stf = System.currentTimeMillis();
        this.dqa = class_3532.method_15340((int)this.dqa, (int)0, (int)this.tkhq.length());
        if (class_3675.method_15987((long)mc.method_22683().method_4490(), (int)341)) {
            if (n == 86) {
                String string = bah_2.mc.field_1774.method_1460();
                if (this.dlz_2) {
                    this.tkhq = "";
                    this.dqa = 0;
                    this.dlz_2 = false;
                }
                this.skht(string, this.dqa);
                this.dqa += string.length();
                this.dlz_2 = false;
            } else if (n == 65) {
                this.dlz_2 = true;
                this.dqa = this.tkhq.length();
            } else if (n == 67 && this.hkz_2 && this.dlz_2) {
                bah_2.mc.field_1774.method_1455(this.tkhq);
            }
        } else if (n == 261 && !this.tkhq.isEmpty()) {
            this.aaq(this.dqa + 1);
            this.dlz_2 = false;
        } else if (n == 259 && !this.tkhq.isEmpty()) {
            if (this.dlz_2) {
                this.tkhq = "";
                this.dqa = 0;
                this.dlz_2 = false;
            } else {
                this.aaq(this.dqa);
                --this.dqa;
                if (class_3675.method_15987((long)mc.method_22683().method_4490(), (int)341)) {
                    while (!this.tkhq.isEmpty() && this.dqa > 0) {
                        this.aaq(this.dqa);
                        --this.dqa;
                    }
                }
            }
        } else if (n == 262) {
            ++this.dqa;
            if (class_3675.method_15987((long)mc.method_22683().method_4490(), (int)341)) {
                this.dqa = this.tkhq.length();
            }
            this.dlz_2 = false;
        } else if (n == 263) {
            --this.dqa;
            if (class_3675.method_15987((long)mc.method_22683().method_4490(), (int)341)) {
                this.dqa = 0;
            }
            this.dlz_2 = false;
        } else if (n == 269) {
            this.dqa = this.tkhq.length();
            this.dlz_2 = false;
        } else if (n == 268) {
            this.dqa = 0;
            this.dlz_2 = false;
        }
        this.dqa = class_3532.method_15340((int)this.dqa, (int)0, (int)this.tkhq.length());
        return true;
    }

    public boolean dd(char c, int n) {
        if (!this.hkz_2) {
            return false;
        }
        this.stf = System.currentTimeMillis();
        this.dqa = class_3532.method_15340((int)this.dqa, (int)0, (int)this.tkhq.length());
        if (this.dlz_2) {
            this.tkhq = "";
            this.dqa = 0;
            this.dlz_2 = false;
        }
        this.skht(Character.toString(c), this.dqa);
        ++this.dqa;
        this.dqa = class_3532.method_15340((int)this.dqa, (int)0, (int)this.tkhq.length());
        return true;
    }

    private void skht(String string, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (!this.hshl.isAllowed(c)) continue;
            stringBuilder.append(c);
        }
        String string2 = stringBuilder.toString();
        if (this.tkhq.length() + string2.length() > this.sdkh_2) {
            int n2 = this.sdkh_2 - this.tkhq.length();
            if (n2 <= 0) {
                return;
            }
            string2 = string2.substring(0, Math.min(n2, string2.length()));
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        boolean bl = false;
        for (int i = 0; i < this.tkhq.length(); ++i) {
            if (i == n) {
                bl = true;
                stringBuilder2.append(string2);
            }
            stringBuilder2.append(this.tkhq.charAt(i));
        }
        if (!bl) {
            stringBuilder2.append(string2);
        }
        this.tkhq = stringBuilder2.toString();
    }

    private void aaq(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.tkhq.length(); ++i) {
            if (i == n - 1) continue;
            stringBuilder.append(this.tkhq.charAt(i));
        }
        this.tkhq = stringBuilder.toString();
    }

    public boolean dhakh() {
        return this.tkhq.isEmpty();
    }

    @Generated
    public String zthd() {
        return this.tkhq;
    }

    @Generated
    public boolean dkj() {
        return this.hkz_2;
    }

    @Generated
    public boolean zydh() {
        return this.dlz_2;
    }

    @Generated
    public int rzq() {
        return this.dqa;
    }

    @Generated
    public float zlh_3() {
        return this.dhkhdh;
    }

    @Generated
    public bd sta_2() {
        return this.rtl_2;
    }

    @Generated
    public class_5611 ttz_5() {
        return this.dhsn_2;
    }

    @Generated
    public String shdh_4() {
        return this.dhath_2;
    }

    @Generated
    public float dsa_4() {
        return this.qd;
    }

    @Generated
    public long khhq_2() {
        return this.stf;
    }

    @Generated
    public int dha_5() {
        return this.sdkh_2;
    }

    @Generated
    public tzt dhmd_2() {
        return this.hshl;
    }

    @Generated
    public float dthgh() {
        return this.zwm;
    }

    @Generated
    public bhn_2 sthdh() {
        return this.tsha;
    }

    @Generated
    public void bjkh(String string) {
        this.tkhq = string;
    }

    @Generated
    public void khts_4(boolean bl) {
        this.hkz_2 = bl;
    }

    @Generated
    public void zzm_2(boolean bl) {
        this.dlz_2 = bl;
    }

    @Generated
    public void khsth_2(int n) {
        this.dqa = n;
    }

    @Generated
    public void twm(float f) {
        this.dhkhdh = f;
    }

    @Generated
    public void rhgh(bd bd2) {
        this.rtl_2 = bd2;
    }

    @Generated
    public void atz_2(class_5611 class_56112) {
        this.dhsn_2 = class_56112;
    }

    @Generated
    public void zsn_4(String string) {
        this.dhath_2 = string;
    }

    @Generated
    public void taw_2(float f) {
        this.qd = f;
    }

    @Generated
    public void khnh_2(long l) {
        this.stf = l;
    }

    @Generated
    public void jqth(int n) {
        this.sdkh_2 = n;
    }

    @Generated
    public void tdw(tzt tzt2) {
        this.hshl = tzt2;
    }

    @Generated
    public void ghkhk(float f) {
        this.zwm = f;
    }

    @Generated
    public void jrb(bhn_2 bhn2_2) {
        this.tsha = bhn2_2;
    }

    @Generated
    public boolean ghthsh(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bah_2)) {
            return false;
        }
        bah_2 bah2 = (bah_2)object;
        if (!bah2.zar_4(this)) {
            return false;
        }
        if (this.dkj() != bah2.dkj()) {
            return false;
        }
        if (this.zydh() != bah2.zydh()) {
            return false;
        }
        if (this.rzq() != bah2.rzq()) {
            return false;
        }
        if (Float.compare(this.zlh_3(), bah2.zlh_3()) != 0) {
            return false;
        }
        if (Float.compare(this.dsa_4(), bah2.dsa_4()) != 0) {
            return false;
        }
        if (this.khhq_2() != bah2.khhq_2()) {
            return false;
        }
        if (this.dha_5() != bah2.dha_5()) {
            return false;
        }
        if (Float.compare(this.dthgh(), bah2.dthgh()) != 0) {
            return false;
        }
        Object object2 = this.zthd();
        Object object3 = bah2.zthd();
        if (!(object2 == null ? object3 == null : object2.equals(object3))) {
            return false;
        }
        object2 = this.sta_2();
        object3 = bah2.sta_2();
        if (object2 == null ? object3 != null : !object2.equals(object3)) {
            return false;
        }
        Object object4 = this.ttz_5();
        Object object5 = bah2.ttz_5();
        if (!(object4 == null ? object5 == null : object4.equals(object5))) {
            return false;
        }
        object4 = this.shdh_4();
        object5 = bah2.shdh_4();
        if (object4 == null ? object5 != null : !object4.equals(object5)) {
            return false;
        }
        Object object6 = this.dhmd_2();
        Object object7 = bah2.dhmd_2();
        if (!(object6 == null ? object7 == null : object6.equals(object7))) {
            return false;
        }
        object6 = this.sthdh();
        object7 = bah2.sthdh();
        return !(object6 == null ? object7 != null : !object6.equals(object7));
    }

    @Generated
    protected boolean zar_4(Object object) {
        return object instanceof bah_2;
    }

    @Generated
    public int shwt() {
        boolean bl = true;
        int n = 1;
        n = n * 59 + (this.dkj() ? 79 : 97);
        n = n * 59 + (this.zydh() ? 79 : 97);
        n = n * 59 + this.rzq();
        n = n * 59 + Float.floatToIntBits(this.zlh_3());
        n = n * 59 + Float.floatToIntBits(this.dsa_4());
        long l = this.khhq_2();
        n = n * 59 + (int)(l >>> 32 ^ l);
        n = n * 59 + this.dha_5();
        n = n * 59 + Float.floatToIntBits(this.dthgh());
        String string = this.zthd();
        n = n * 59 + (string == null ? 43 : string.hashCode());
        bd bd2 = this.sta_2();
        n = n * 59 + (bd2 == null ? 43 : bd2.hashCode());
        class_5611 class_56112 = this.ttz_5();
        n = n * 59 + (class_56112 == null ? 43 : class_56112.hashCode());
        String string2 = this.shdh_4();
        n = n * 59 + (string2 == null ? 43 : string2.hashCode());
        tzt tzt2 = this.dhmd_2();
        n = n * 59 + (tzt2 == null ? 43 : ((Object)((Object)tzt2)).hashCode());
        bhn_2 bhn2_2 = this.sthdh();
        n = n * 59 + (bhn2_2 == null ? 43 : bhn2_2.hashCode());
        return n;
    }

    @Generated
    public String djs_3() {
        String string = this.zthd();
        return "TextBox(text=" + string + ", selected=" + this.dkj() + ", selectAll=" + this.zydh() + ", cursor=" + this.rzq() + ", posX=" + this.zlh_3() + ", font=" + String.valueOf(this.sta_2()) + ", position=" + String.valueOf(this.ttz_5()) + ", emptyText=" + this.shdh_4() + ", width=" + this.dsa_4() + ", lastInputTime=" + this.khhq_2() + ", maxLength=" + this.dha_5() + ", charFilter=" + String.valueOf((Object)this.dhmd_2()) + ", scrollOffset=" + this.dthgh() + ", animation=" + String.valueOf(this.sthdh()) + ")";
    }

    private static String[] zynufpsbdvx(String string) {
        return string.split("\u0006\u000f", -1);
    }

    private static CallSite tgp6xoy3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ w6hfnlkw8 ^ string.hashCode() ^ n2 + s8a6nbtzd14 ^ i * -961110559 ^ w6hfnlkw8, 11) ^ s8a6nbtzd14));
            }
            String[] stringArray = bah_2.zynufpsbdvx(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

