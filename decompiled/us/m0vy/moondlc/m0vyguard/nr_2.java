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
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.trd;

public class nr_2
extends bshz_2 {
    private final String dfb;
    private static final int al4rxf4sic = 803355802;
    private static final int s1cqs8bcy = 1775165055;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ke3izuxjlw5h;

    public nr_2(String string) {
        this.dfb = string;
    }

    @Override
    protected void bws_2(bzth bzth2) {
        trd trd2 = bmn.shzth.twy_2(8.0f);
        float f = 8.0f;
        float f2 = trd2.thssh_2();
        bzth2.drawFadeoutText(trd2, this.dfb, this.sdht_2 + f, this.shat_2 + bhh.khrth(f2, this.zqkh), bhj_2.bzs().tkhl_2(RenderSystem.getShaderColor()[3] * 255.0f * 0.75f), 0.8f, 1.0f, this.zshl - 12.0f);
    }

    @Override
    public float jfn() {
        this.zqkh = 18.0f;
        return 18.0f;
    }

    private static String[] r2e5yqqz1s72(String string) {
        return string.split("\u0007\u001f", -1);
    }

    private static CallSite lxc1fhlq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ al4rxf4sic ^ string.hashCode()) + (n2 + s1cqs8bcy) + i ^ al4rxf4sic, 14) + s1cqs8bcy);
            }
            String[] stringArray = nr_2.r2e5yqqz1s72(new String(cArray));
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

