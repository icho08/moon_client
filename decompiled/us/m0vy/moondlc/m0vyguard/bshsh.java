/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.fd;
import us.m0vy.moondlc.m0vyguard.lsh;

public abstract class bshsh
extends fd {
    private static final int rmgra91kw = 369158606;
    private static final int k7gvum46 = 1986407345;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int thebb9x51;

    public bshsh(String string) {
        super(string);
    }

    public abstract Color hh_4();

    public abstract Color rdn_2();

    public abstract Color dhsdh();

    public abstract Color ttf_2();

    public abstract Color hy_2();

    public abstract Color bsa_4();

    public abstract Color bfn();

    public abstract Color bzgh();

    public abstract Color thdq_2();

    public bshsh rlt_2() {
        for (lsh lsh2 : this.tjz()) {
            switch (lsh2.getName()) {
                case "Primary": {
                    lsh2.rhm(this.hh_4());
                    break;
                }
                case "Secondary": {
                    lsh2.rhm(this.rdn_2());
                    break;
                }
                case "Blur": {
                    lsh2.rhm(this.dhsdh());
                    break;
                }
                case "Widget blur": {
                    lsh2.rhm(this.ttf_2());
                    break;
                }
                case "Background blur": {
                    lsh2.rhm(this.hy_2());
                    break;
                }
                case "Text": {
                    lsh2.rhm(this.bsa_4());
                    break;
                }
                case "Inactive text": {
                    lsh2.rhm(this.bfn());
                    break;
                }
                case "Knob": {
                    lsh2.rhm(this.bzgh());
                    break;
                }
                case "Inactive knob": {
                    lsh2.rhm(this.thdq_2());
                }
            }
        }
        return this;
    }

    private static String[] fwz4xs2p(String string) {
        return string.split("\u0003\u001a", -1);
    }

    private static CallSite kn1ekke2yu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rmgra91kw ^ string.hashCode()) + (n2 + k7gvum46) + i ^ rmgra91kw, 23) + k7gvum46);
            }
            String[] stringArray = bshsh.fwz4xs2p(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

