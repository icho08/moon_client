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
import us.m0vy.moondlc.m0vyguard.bhd_3;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.qd;
import us.movy.moondlc.Moondlc;

public abstract class baa
extends bhd_3 {
    protected final fa_2 jghb = new fa_2(350L, jkh.hd_2);
    protected boolean khmk = false;
    private static final int leib7cyrmn4cj = 1510751450;
    private static final int zvgr1d7 = -451316098;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int feboz36n18;

    public void finishCloseAnimation() {
        this.khmk = true;
        qd qd2 = (qd)Moondlc.getInstance().getModuleManager().dfr_2(qd.class);
        if (qd2 != null && qd2.rgha_2()) {
            qd2.tba(false);
        }
        if (Moondlc.getInstance().getMenuScreen() == this) {
            Moondlc.getInstance().setMenuScreen(null);
        }
    }

    @Generated
    public fa_2 getMenuAnimation() {
        return this.jghb;
    }

    @Generated
    public boolean isClosing() {
        return this.khmk;
    }

    @Generated
    public void setClosing(boolean bl) {
        this.khmk = bl;
    }

    private static String[] jycx67j1h(String string) {
        return string.split("\u0005\u000e", -1);
    }

    private static CallSite zvw8oowwxtn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ leib7cyrmn4cj ^ string.hashCode()) + (n2 + zvgr1d7) + i ^ leib7cyrmn4cj, 23) + zvgr1d7);
            }
            String[] stringArray = baa.jycx67j1h(new String(cArray));
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

