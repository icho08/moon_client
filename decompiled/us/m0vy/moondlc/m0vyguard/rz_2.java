/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.UUID;
import us.m0vy.moondlc.m0vyguard.bhf;
import us.m0vy.moondlc.m0vyguard.tbl;
import us.m0vy.moondlc.m0vyguard.jw;
import us.m0vy.moondlc.m0vyguard.sha_6;
import us.m0vy.moondlc.m0vyguard.sh_4;
import us.m0vy.moondlc.m0vyguard.ykh;
import us.m0vy.moondlc.m0vyguard.yf;

public record rz_2() {
    private static final int srl = 1498891352;
    private static final int thjkh = -1204428377;
    private static final int o9f22qk = 578590686;
    private static final int m6s1og54df2x1 = 71226460;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ih4bmxfwssv;

    public UUID uuidByName(String string) {
        try {
            bhf bhf2;
            try {
                int n = 197196196;
                n = Integer.rotateLeft(n * 792664447, 26) ^ 0xF5B21C8;
                n = System.identityHashCode(this) ^ n;
                String string2 = string;
                n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 15);
                int n2 = n ^ 0x84CBF461;
                if ((n2 ^ n) != -2067008415) {
                    int cfr_ignored_0 = (0x8F0B0DC5 ^ n) + 1548265077;
                }
                if ((0x37F & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            if (!yf.khdha_2()) {
                rz_2.nyi0ad9bg3();
            }
            if ((bhf2 = rz_2.swkpoi4904("https://api.minecraftservices.com/users/profiles/minecraft/" + string, Map.of())).code() != (rz_2.a2dnlvsx(-1500679315) ^ 0xB6CEB1AD)) {
                throw new RuntimeException("Fail " + string);
            }
            ykh ykh2 = (ykh)rz_2.utwuahdl(bhf2.text(), ykh.class);
            return sh_4.nkh(ykh2.thhz);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public final String toString() {
        block0: {
            int n = 1612643243;
            int n2 = (n = Integer.rotateLeft(n * -1889463307, 24) ^ 0xBEDC5551) ^ 0xF1A318AC;
            if ((n2 ^ n) == -240969556) break block0;
            int cfr_ignored_0 = (0x91BDE307 ^ n) + -1507020541;
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{rz_2.class, ""}, this);
    }

    @Override
    public final int hashCode() {
        block0: {
            int n = -219248718;
            n = Integer.rotateLeft(n * 2015804515, 19) ^ 0x1425D663;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA3FC52A4;
            if ((n2 ^ n) == -1543744860) break block0;
            int cfr_ignored_0 = (0x5112D516 ^ n) - 209980494;
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{rz_2.class, ""}, this);
    }

    @Override
    public final boolean equals(Object object) {
        block0: {
            int n = jw.tzd_5(-1619526833);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x69EFF6D3;
            if ((n2 ^ n) == 1777333971) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF6980D9C ^ n, 17) - -523811553) * -157807203;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{rz_2.class, ""}, this, object);
    }

    private static void nyi0ad9bg3() {
        int n = -762033417;
        int n2 = (n = Integer.rotateLeft(n * -239513089, 8) ^ 0xAA16C511) ^ 0xEDD347A0;
        if ((n2 ^ n) != -304920672) {
            int cfr_ignored_0 = (0x3F470D57 ^ n) - -584500257;
        }
        yf.athz_2();
    }

    private static bhf swkpoi4904(String string, Map map) {
        block0: {
            int n = -905227049;
            n = Integer.rotateLeft(n * -133943257, 19) ^ 0xCA6CFB9C;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
            Map map2 = map;
            n = Integer.rotateLeft((map2 != null ? System.identityHashCode(map2) : 0) ^ n, 10);
            int n2 = n ^ 0x2DAD3F2B;
            if ((n2 ^ n) == 766328619) break block0;
            int cfr_ignored_0 = (0xE7A66BFC ^ n) + 214997412;
        }
        return sha_6.zab(string, map);
    }

    private static int a2dnlvsx(int n) {
        block0: {
            int n2 = jw.tzd_5(1021354969);
            int n3 = (n2 = n ^ n2) ^ 0x50E3B231;
            if ((n3 ^ n2) == 1357099569) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6C0311E8 ^ n2, 16) + 415025747;
        }
        return Integer.reverse(n);
    }

    private static Object utwuahdl(String string, Class clazz) {
        block0: {
            int n = jw.tzd_5(392495045);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
            int n2 = n ^ 0x91E030FE;
            if ((n2 ^ n) == -1847578370) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8684CF3B ^ n, 3) + 1316140896) * -2038116549;
        }
        return tbl.shdq_2(string, clazz);
    }

    private static String[] lmd93zdu(String string) {
        block0: {
            int n = 1866471882;
            int n2 = (n = Integer.rotateLeft(n * 1337328235, 22) ^ 0xAC5B493) ^ 0x3A637B99;
            if ((n2 ^ n) == 979598233) break block0;
            int cfr_ignored_0 = (0x55236253 ^ n) - 300985724;
        }
        return string.split("\u0006\u001f", -1);
    }

    private static CallSite ybs0cftvuo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 914064257;
            n3 = Integer.rotateLeft(n3 * -1620442633, 10) ^ 0xA7BE38FE;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 22);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x2D73D293;
            if ((n4 ^ n3) != 762565267) {
                int cfr_ignored_0 = (0x1B085112 ^ n3) + 1153825334;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ srl ^ string.hashCode() ^ n2 + thjkh + i * 290391129) + srl) ^ thjkh));
            }
            String[] stringArray = rz_2.lmd93zdu(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] z27qh1d4o9o(String string) {
        return string.split("\u0005\u0014", -1);
    }

    private static CallSite g6w57aje43(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ o9f22qk ^ string.hashCode()) + (n2 + m6s1og54df2x1) + i ^ o9f22qk, 8) + m6s1og54df2x1);
            }
            String[] stringArray = rz_2.z27qh1d4o9o(new String(cArray));
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

