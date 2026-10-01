/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.tat_2;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.fd;

public class thw
extends tat_2 {
    private final fd zkhj;
    private final bjz slz = new bjz();
    private final bjz stl_3 = new bjz();
    private static final int dx0k9tv1c1 = 216952872;
    private static final int cglv6a5z = -834586042;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int b4utwuay9hcm;

    public thw(fd fd2) {
        this.zkhj = fd2;
    }

    @Override
    public void hagh_2(class_332 class_3322, int n, int n2, float f) {
        class_4587 class_45872 = class_3322.method_51448();
        boolean bl = this.bda_2(n, n2);
        this.stl_3.ddhdh();
        this.stl_3.shd_6(bas_4.tzm_2().getName().equals(this.zkhj.getName()) ? 1.0 : 0.7, 200L, tbm.hrkh);
        this.slz.ddhdh();
        this.slz.shd_6(bl ? 1.0 : 0.0, 500L, tbm.hash_3);
        int n3 = (int)((double)this.jst() * this.stl_3.khbk() * 255.0);
        Color color = brb.zmn_2(this.zkhj.rdm_2(), n3);
        Color color2 = brb.zmn_2(this.zkhj.shthz(), n3);
        float f2 = this.bkgh() * 0.2f;
        float f3 = (float)((double)(this.bkgh() * 0.4f) + this.slz.khbk());
        bjgh.zyn.sla(class_45872, this.sjr(), this.shha_2(), this.dghgh(), this.bkgh(), f2, color, color2, color, color2);
        brz_2.thtkh_2.thsz_4(class_45872, this.zkhj.getName(), this.sjr() + this.dghgh() / 2.0f, this.shha_2() + this.bkgh() / 2.0f - f3 / 2.0f, f3, brb.zmn_2(this.zkhj.dtm_3(), n3));
    }

    private boolean bda_2(float f, float f2) {
        return baf.zath(f, f2, this.sjr(), this.shha_2(), this.dghgh(), this.bkgh());
    }

    @Override
    public void thda_2(int n, int n2, int n3) {
    }

    @Override
    public void thkdh(double d, double d2, int n) {
    }

    @Override
    public void khs_2(double d, double d2, int n) {
    }

    @Override
    public void bthf(double d, double d2, double d3, double d4) {
    }

    @Generated
    public fd ttkh_3() {
        return this.zkhj;
    }

    @Generated
    public bjz zkhz_2() {
        return this.slz;
    }

    @Generated
    public bjz sfd_4() {
        return this.stl_3;
    }

    private static String[] doao5w88k(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite m7fndept5du(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dx0k9tv1c1 ^ string.hashCode() ^ n2 + cglv6a5z ^ i * -125558299 ^ dx0k9tv1c1, 25) ^ cglv6a5z));
            }
            String[] stringArray = thw.doao5w88k(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

