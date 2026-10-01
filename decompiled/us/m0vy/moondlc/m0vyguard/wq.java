/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.annotations.SerializedName;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.btl_2;
import us.m0vy.moondlc.m0vyguard.bghgh;
import us.m0vy.moondlc.m0vyguard.bnw;
import us.m0vy.moondlc.m0vyguard.try_2;
import us.m0vy.moondlc.m0vyguard.yl;

public final class wq {
    private yl atlas;
    private bnw metrics;
    private List<try_2> glyphs;
    @SerializedName(value="kerning")
    private List<bghgh> kernings;
    private static final int qahbw7m79 = 1571626559;
    private static final int hht1vfumv2m = 1289659337;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ja4pzupftbkdu;

    public yl atlas() {
        block0: {
            int n = btl_2.swh(-118404288);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD255F2D6;
            if ((n2 ^ n) == -766119210) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x2AA4B996 ^ n, 8) - 777001061) * 715438487;
        }
        return this.atlas;
    }

    public bnw metrics() {
        block0: {
            int n = btl_2.swh(-1902238130);
            int n2 = n ^ 0xC28FA4EC;
            if ((n2 ^ n) == -1030773524) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x4C1182A2 ^ n, 12) + 981233881;
        }
        return this.metrics;
    }

    public List glyphs() {
        block0: {
            int n = -1075910746;
            n = Integer.rotateLeft(n * -272114555, 24) ^ 0xD1F659BF;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xEC209AD2;
            if ((n2 ^ n) == -333407534) break block0;
            int cfr_ignored_0 = (0x53FE7D74 ^ n) + -667572294;
        }
        return this.glyphs;
    }

    public List kernings() {
        block0: {
            int n = btl_2.swh(-454832584);
            int n2 = n ^ 0x58FC5F78;
            if ((n2 ^ n) == 1492934520) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xBC1F9140 ^ n, 10) + -869255685;
        }
        return this.kernings;
    }

    private static String[] anb6char(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hn3dxkskl5jr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ qahbw7m79 ^ string.hashCode() ^ n2 + hht1vfumv2m + i * 466020899) + qahbw7m79) ^ hht1vfumv2m));
            }
            String[] stringArray = wq.anb6char(new String(cArray));
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

