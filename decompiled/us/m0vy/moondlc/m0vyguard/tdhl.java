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
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bnn;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthn;
import us.movy.moondlc.Moondlc;

public class tdhl {
    public static final byq[] jdy_2;
    private byq shzt_2 = null;
    private tthn shkr = tthn.jthj;
    private static final int iiufqy4i7iu = 830067972;
    private static final int ofru6tcfwxc = 623040608;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qw1294j84;

    public byq srm_2() {
        return this.shzt_2;
    }

    public void tkt(byq byq2) {
        this.shzt_2 = byq2;
    }

    public void jkm() {
        this.shzt_2 = null;
    }

    public void zrd(int n) {
        if (n >= 0 && n < jdy_2.length) {
            this.shzt_2 = jdy_2[n];
        }
    }

    public void rtb_2() {
        this.shkr = this.shkr == tthn.jthj ? tthn.bzz_4 : tthn.jthj;
    }

    public tthn zskh_2() {
        return this.shkr;
    }

    public byq rkl() {
        return this.zskh_2().getTextColor();
    }

    public byq thddh_2() {
        return this.zskh_2().getBackgroundColor();
    }

    public byq tsj() {
        return this.zskh_2().getAdditionalColor();
    }

    public byq sath_4() {
        return this.zskh_2().getOutlineColor();
    }

    public byq lb() {
        return this.zskh_2().getFlatColor();
    }

    public byq rjt_2() {
        byq byq2 = bnn.dzb_2().kb();
        if (byq2 != null) {
            return byq2;
        }
        return this.zskh_2().getAccentColor();
    }

    public byq rsdh() {
        return this.zskh_2().getIconsColor();
    }

    public byq btd_4() {
        return this.zskh_2().getEnabledModulesColor();
    }

    public void jtd_3(byq byq2) {
        this.zskh_2().setTextColor(byq2);
    }

    public void sthn(byq byq2) {
        this.zskh_2().setBackgroundColor(byq2);
    }

    public void ztt_4(byq byq2) {
        this.zskh_2().setAdditionalColor(byq2);
    }

    public void tdhb_2(byq byq2) {
        this.zskh_2().setAccentColor(byq2);
    }

    public void jash() {
        try {
            Moondlc.getInstance().getFileManager().dsf_2("client");
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Generated
    public void hrs(tthn tthn2) {
        this.shkr = tthn2;
    }

    private static String[] enj51ke6lcpcxz(String string) {
        return string.split("\u0003\u001c", -1);
    }

    private static CallSite bw8a1lti8ypby(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ iiufqy4i7iu ^ string.hashCode()) + (n2 + ofru6tcfwxc) + i ^ iiufqy4i7iu, 24) + ofru6tcfwxc);
            }
            String[] stringArray = tdhl.enj51ke6lcpcxz(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

