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
import us.m0vy.moondlc.m0vyguard.tr_2;

public class tthth
extends bshz_2 {
    private final String thda_2;
    private static final int md9ftr1mpd22l = 317704885;
    private static final int j8f80ua5ym = -1996005746;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zxloefql02;

    public tthth(String string) {
        this.thda_2 = string;
    }

    @Override
    protected void bws_2(bzth bzth2) {
        trd trd2 = bmn.shzth.twy_2(8.0f);
        float f = 8.0f;
        float f2 = trd2.thssh_2();
        bzth2.drawFadeoutText(trd2, tr_2.ttq_3(this.thda_2), this.sdht_2 + f, this.shat_2 + bhh.khrth(f2, this.zqkh), bhj_2.bzs().tkhl_2(RenderSystem.getShaderColor()[3] * 255.0f), 0.8f, 1.0f, this.zshl - 12.0f);
    }

    @Override
    public float jfn() {
        this.zqkh = 18.0f;
        return 18.0f;
    }

    private static String[] m17mlbb9v(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite asas9pk07(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ md9ftr1mpd22l ^ string.hashCode() ^ n2 + j8f80ua5ym ^ i * 1732367885 ^ md9ftr1mpd22l, 14) ^ j8f80ua5ym));
            }
            String[] stringArray = tthth.m17mlbb9v(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

