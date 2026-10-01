/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bhh;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bshz_2;
import us.m0vy.moondlc.m0vyguard.bay_2;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.tdl;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.tza;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.zw;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.movy.moondlc.Moondlc;

public class zq
extends bshz_2 {
    private final tza rhj_2;
    private final String rqt_2;
    private final String sdhth_2;
    private tdl shza;
    private final fa_2 shtt_2 = new fa_2(300L, jkh.dzb);
    private static final int r39vgint = 755915146;
    private static final int ngjdi15lx5r = 809741583;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int n8mowheeyosiw;

    public zq(tza tza2, String string, String string2, tdl tdl2) {
        this.rhj_2 = tza2;
        this.rqt_2 = string;
        this.sdhth_2 = string2;
        this.shza = tdl2;
    }

    @Override
    protected void bws_2(bzth bzth2) {
        trd trd2 = bmn.shzth.twy_2(8.0f);
        float f = 8.0f;
        float f2 = trd2.thssh_2();
        this.shtt_2.ddt_6(this.hrb(bzth2.getMouseX(), bzth2.getMouseY()));
        if (this.hrb(bzth2.getMouseX(), bzth2.getMouseY())) {
            zw.hdhth(bay_2.mw);
        }
        byq byq2 = !this.rqt_2.equals(tr_2.ttq_3("remove")) ? bhj_2.bzs() : byq.sn.dkhw_2(byq.brz_2, 0.3f);
        bzth2.drawFadeoutText(trd2, this.rqt_2, this.sdht_2 + f, this.shat_2 + bhh.khrth(f2, this.zqkh), byq2.tkhl_2(RenderSystem.getShaderColor()[3] * 255.0f * (0.75f + 0.25f * this.shtt_2.tssh_2())), 0.8f, 1.0f, this.zshl - 24.0f);
        bzth2.drawTexture(Moondlc.id(this.sdhth_2), this.sdht_2 + this.zshl - 16.0f, this.shat_2 + 6.0f, 8.0f, 8.0f, byq2.tkhl_2(RenderSystem.getShaderColor()[3] * 255.0f * (0.75f + 0.25f * this.shtt_2.tssh_2())));
        if (this.rhb(bzth2)) {
            zw.hdhth(bay_2.mw);
        }
    }

    @Override
    public void dh_4(double d, double d2, tthdh tthdh2) {
        if (this.shrh(d, d2) && tthdh2 == tthdh.tdha_2) {
            this.shza.zas_3(this.rhj_2);
        }
        super.dh_4(d, d2, tthdh2);
    }

    @Override
    public float jfn() {
        this.zqkh = 19.0f;
        return 19.0f;
    }

    private static String[] crd61gsg31f1(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite i67tf8p89p17s(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ r39vgint ^ string.hashCode() ^ n2 + ngjdi15lx5r + i * -1747084539) + r39vgint) ^ ngjdi15lx5r));
            }
            String[] stringArray = zq.crd61gsg31f1(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

