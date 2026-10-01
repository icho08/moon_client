/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.baw_2;
import us.m0vy.moondlc.m0vyguard.tthy;

public class thd
implements tthy {
    private long rat_2 = System.nanoTime();
    private int hsha;
    private final boolean bdn;
    private int ztha_2 = 0;
    private long kham_2 = 0L;
    private static final int fyzuhto = -1410766060;
    private static final int kfpcm4xbi0r6s = -337792035;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int v3mpihpgt4t;

    public thd(boolean bl) {
        this.bdn = bl;
        this.hsha = 0;
    }

    public void zakh_4(int n, baw_2 ... bawArray) {
        if (this.ztha_2 != n) {
            this.kham_2 = 1000000000L / (long)n;
            this.ztha_2 = n;
        }
        long l = System.nanoTime();
        long l2 = l - this.rat_2;
        this.hsha += (int)(l2 / this.kham_2);
        this.rat_2 += (long)this.hsha * this.kham_2;
        this.hsha = Math.min(this.hsha, this.bdn ? Math.min(this.ztha_2, mc.method_47599()) : this.ztha_2);
        while (this.hsha > 0) {
            for (baw_2 baw2 : bawArray) {
                baw2.ghrh_2();
            }
            --this.hsha;
        }
    }

    private static String[] sjfc3bfqi8s7f(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite baskmzbd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ fyzuhto ^ string.hashCode() ^ n2 + kfpcm4xbi0r6s ^ i * -1396448267 ^ fyzuhto, 13) ^ kfpcm4xbi0r6s));
            }
            String[] stringArray = thd.sjfc3bfqi8s7f(new String(cArray));
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

