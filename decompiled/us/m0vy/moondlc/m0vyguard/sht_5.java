/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bdhj;
import us.m0vy.moondlc.m0vyguard.bss_2;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.bagh_2;
import us.m0vy.moondlc.m0vyguard.bhz_4;
import us.m0vy.moondlc.m0vyguard.tdq;
import us.m0vy.moondlc.m0vyguard.khh;
import us.m0vy.moondlc.m0vyguard.q;

public class sht_5
extends q {
    private final String std_4;
    private final float dzdh_2;
    private final String sthkh;
    private final Runnable jtb;
    private final tdq bjt = new tdq(400L, 0.0f, btf_2.shjm);
    private final tdq szgh_2 = new tdq(200L, 0.0f, btf_2.zdq);
    private static final int thjs7g9pxru = 571550499;
    private static final int xfdxeapgid = -898021425;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ag3c6kp2up5;

    public sht_5(String string, float f, String string2, Runnable runnable) {
        this.std_4 = string;
        this.dzdh_2 = f;
        this.sthkh = string2;
        this.jtb = runnable;
    }

    public void bza(bagh_2 bagh2) {
        boolean bl = this.bdhh_2(bagh2.getMouseX(), bagh2.getMouseY()) && this.bjt.swd() == 1.0f;
        this.szgh_2.zsht_2(bl);
        float f = this.bjt.swd();
        float f2 = this.szgh_2.swd();
        float f3 = 0.38f * f;
        float f4 = 20.0f;
        float f5 = 20.0f;
        float f6 = 30.0f;
        bagh2.drawRoundedRect(this.shghsh, this.sfd, this.rkh, this.jzy, bss_2.all(6.0f), new khh(f4, f5, f6).khhh_3(255.0f * f3));
        float f7 = 255.0f * f;
        float f8 = 10.0f;
        float f9 = this.sfd + (this.jzy - this.dzdh_2) / 2.0f;
        bagh2.drawTexture(class_2960.method_60655((String)"moondlc", (String)this.std_4), this.shghsh + f8, f9, this.dzdh_2, this.dzdh_2, khh.dww.khhh_3(f7));
        bdhj bdhj2 = bhz_4.twr.thds(12.0f);
        float f10 = this.shghsh + f8 + this.dzdh_2 + 7.0f;
        float f11 = this.sfd + (this.jzy - bdhj2.rfs_2()) / 2.0f - 1.0f;
        bagh2.drawText(bdhj2, this.sthkh, f10, f11, khh.dww.khhh_3(f7));
    }

    public void rlh(double d, double d2, int n) {
        if (this.bdhh_2(d, d2) && n == 0 && this.bjt.swd() == 1.0f) {
            this.jtb.run();
        }
    }

    @Generated
    public tdq zzs_5() {
        return this.bjt;
    }

    private static String[] c8z8w3qrq71uk(String string) {
        return string.split("\u0004\u001a", -1);
    }

    private static CallSite q3fid0z9b3uox(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ thjs7g9pxru ^ string.hashCode() ^ n2 + xfdxeapgid ^ i * 1061691475 ^ thjs7g9pxru, 9) ^ xfdxeapgid));
            }
            String[] stringArray = sht_5.c8z8w3qrq71uk(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

