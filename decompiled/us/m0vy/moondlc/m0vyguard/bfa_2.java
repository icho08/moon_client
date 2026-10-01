/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bas_2;
import us.m0vy.moondlc.m0vyguard.btd_3;

public class bfa_2
extends bas_2 {
    private Runnable brj;
    private static final int l7n7q02hhk = 1394911974;
    private static final int kxa5vlys0pkxa = -503658973;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o1qnyw014oy5h;

    public bfa_2(String string, String string2, int n) {
        super(string);
        this.td_3(n);
    }

    public bfa_2(String string, String string2, int n, Runnable runnable) {
        this(string, string2, n);
        this.brj = runnable;
    }

    public bfa_2 zwf_2(Runnable runnable) {
        this.brj = runnable;
        return this;
    }

    public boolean tft_2(btd_3 btd2) {
        return btd2 != null && btd2.action() == 1 && (Integer)this.dms_4() != -999 && (Integer)this.dms_4() == btd2.key() + (btd2.mouse() ? -100 : 0);
    }

    public void rtw() {
        if (this.brj != null) {
            this.brj.run();
        }
    }

    private static String[] cbp0pwmed(String string) {
        return string.split("\u0003\u001c", -1);
    }

    private static CallSite meo4hqv2x5y(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ l7n7q02hhk ^ string.hashCode()) + (n2 + kxa5vlys0pkxa) + i ^ l7n7q02hhk, 12) + kxa5vlys0pkxa);
            }
            String[] stringArray = bfa_2.cbp0pwmed(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

