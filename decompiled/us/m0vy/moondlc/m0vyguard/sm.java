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
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.tr;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.zw;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.movy.moondlc.Moondlc;

public class sm
extends bshz_2 {
    private boolean stsh;
    private final String dhtw;
    private final fa_2 tthm = new fa_2(300L, jkh.dzb);
    private final fa_2 bnj = new fa_2(300L, jkh.dzb);
    private tr rhs_4;
    private static final int dtbgmodc = -897865768;
    private static final int dwn1rs4qb = 1740116153;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int o726obpto;

    public sm(String string) {
        this.dhtw = string;
    }

    @Override
    protected void bws_2(bzth bzth2) {
        trd trd2 = bmn.shzth.twy_2(8.0f);
        float f = 8.0f;
        float f2 = trd2.thssh_2();
        this.tthm.ddt_6(this.hrb(bzth2.getMouseX(), bzth2.getMouseY()));
        this.bnj.khmf(this.stsh ? 1.0f : 0.0f);
        if (this.hrb(bzth2.getMouseX(), bzth2.getMouseY())) {
            zw.hdhth(bay_2.mw);
        }
        bzth2.drawFadeoutText(trd2, this.dhtw, this.sdht_2 + f, this.shat_2 + bhh.khrth(f2, this.zqkh), bhj_2.bzs().tkhl_2(RenderSystem.getShaderColor()[3] * 255.0f * (0.75f + 0.25f * this.bnj.tssh_2() + 0.25f * this.tthm.tssh_2())), 0.8f, 1.0f, this.zshl - 12.0f - 12.0f * this.bnj.tssh_2());
        float f3 = this.bnj.tssh_2() * RenderSystem.getShaderColor()[3] * 255.0f;
        if (this.bnj.tssh_2() >= 0.0f) {
            bzth2.drawTexture(Moondlc.id("icons/check.png"), this.sdht_2 + this.zshl - 13.0f - this.bnj.tssh_2() * 2.0f, this.shat_2 + 7.0f, 6.0f, 6.0f, bhj_2.bzs().tkhl_2(f3));
        }
    }

    @Override
    public void dh_4(double d, double d2, tthdh tthdh2) {
        if (this.shrh(d, d2) && tthdh2 == tthdh.tdha_2) {
            boolean bl = this.stsh = !this.stsh;
            if (this.rhs_4 != null) {
                this.rhs_4.arh(this.stsh);
            }
        }
        super.dh_4(d, d2, tthdh2);
    }

    @Override
    public float jfn() {
        this.zqkh = 19.0f;
        return 19.0f;
    }

    public sm jja_2(boolean bl) {
        this.stsh = bl;
        return this;
    }

    public sm hqt_2(tr tr2) {
        this.rhs_4 = tr2;
        return this;
    }

    private static String[] w3lu9qodmr2wx(String string) {
        return string.split("\u0002\u001f", -1);
    }

    private static CallSite v1982117kg0716(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dtbgmodc ^ string.hashCode()) + (n2 + dwn1rs4qb) + i ^ dtbgmodc, 23) + dwn1rs4qb);
            }
            String[] stringArray = sm.w3lu9qodmr2wx(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

