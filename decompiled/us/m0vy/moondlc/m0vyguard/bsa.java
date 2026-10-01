/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.tty;
import us.m0vy.moondlc.m0vyguard.dj;

public abstract class bsa {
    public final tty zzb_2 = this.getClass().getAnnotation(tty.class);
    public final File khth = new File(dj.sdr_2, this.zzb_2.name() + "." + this.zzb_2.fileType());
    private static final int bth_2 = -2047097193;
    private static final int skhz_2 = -292134927;
    private static final int bvqgfz21g9zl = 1831139364;
    private static final int lpvsp73b1f5qo = 1359021407;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int w8d71zi20t6q;

    public abstract void znsh();

    public abstract void khwsh();

    @Generated
    public tty bln() {
        block0: {
            int n = 609123802;
            n = Integer.rotateLeft(n * 45721993, 14) ^ 0xEC401784;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD81209A;
            if ((n2 ^ n) == 226566298) break block0;
            int cfr_ignored_0 = (0x29CF5D40 ^ n) - 794412933;
        }
        return this.zzb_2;
    }

    @Generated
    public File hwj() {
        block0: {
            int n = -1831392819;
            n = Integer.rotateLeft(n * 326170177, 12) ^ 0x8107A598;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0x9D696434;
            if ((n2 ^ n) == -1654037452) break block0;
            int cfr_ignored_0 = (0xFBE4DF9 ^ n) - 923201050;
        }
        return this.khth;
    }

    private static String[] thnr(String string) {
        block0: {
            int n = 1589493133;
            int n2 = (n = Integer.rotateLeft(n * 1398960263, 14) ^ 0xB34E56B7) ^ 0x7CFF49F3;
            if ((n2 ^ n) == 2097105395) break block0;
            int cfr_ignored_0 = (0x2242F47E ^ n) - 236545890;
        }
        return string.split("\b\u000f", -1);
    }

    private static CallSite zfgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1493741046;
            n3 = Integer.rotateLeft(n3 * 736774057, 12) ^ 0xFA69092;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 24);
            n3 = n ^ n3;
            int n4 = n3 ^ 0x3F8B7640;
            if ((n4 ^ n3) != 1066104384) {
                int cfr_ignored_0 = (0x997C244A ^ n3) - 983999441;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bth_2 ^ string.hashCode()) + (n2 + skhz_2) + i ^ bth_2, 3) + skhz_2);
            }
            String[] stringArray = bsa.thnr(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] v4o5ql15(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite w0qb6rmfwv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bvqgfz21g9zl ^ string.hashCode()) + (n2 + lpvsp73b1f5qo) + i ^ bvqgfz21g9zl, 24) + lpvsp73b1f5qo);
            }
            String[] stringArray = bsa.v4o5ql15(new String(cArray));
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

