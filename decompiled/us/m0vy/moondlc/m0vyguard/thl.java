/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tshd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.wf;

@tq_2(name="CustomFog", category=bzw.OTHER, desc="Customizes game fog distances and colors")
public class thl
extends bnq {
    private final tshd had = new tshd(this, "Distance").rshr(Float.intBitsToFloat(0xDF2FDAA1 ^ 0x1E0FDAA1)).shft(Float.intBitsToFloat(Integer.reverse(38703125) ^ 0xEBF37240)).zys_4(1.0f).afs_2(Float.intBitsToFloat(Integer.rotateLeft(0x6F011461 ^ 0x6F115C61, 10))).sjk_2(Float.intBitsToFloat(Integer.rotateLeft(0x52D1FB4E ^ 0xC2D1FBCA, 23)));
    private final badh_2 slh_2 = new badh_2(this, "Cust".concat("om Color")).bts(false);
    private final bzw_2 shkhz_2 = new bzw_2(this, "Color", this::thsq).dhshy(new byq(Float.intBitsToFloat(0x7A785927 ^ 0x39075927), Float.intBitsToFloat(1671584819 - 539188275), Float.intBitsToFloat(0xD977CEAF ^ 0x9A08CEAF), Float.intBitsToFloat(Integer.rotateLeft(0xF6D7E547 ^ 0xED2FE545, 29))));
    private final tay bghgh = new tay(this, "Blur Str".concat("ength")).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(1811815554 + -719199362)).rkh_3(Float.intBitsToFloat(-1133583145 + -2124552202)).ssd_5(1.0f);
    private final tay thlj = new tay(this, "Blur Offset").shth_7(Float.intBitsToFloat(1368039919 + 1899847185)).dhbs_2(Float.intBitsToFloat(-226108655 - -1346512111)).rkh_3(1.0f).ssd_5(0.0f);
    private final badh_2 bab = new badh_2(this, "No Sky Blur").bts(false);
    private static final int dtf = -1321751108;
    private static final int zmy = -308587178;
    private static final int jnf = -306944688;
    private static final int khygh = -170407112;
    private static final int m3y5mir = 1541312746;
    private static final int hlfzl7g4tm2s8 = 857317733;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int t4g3f7s6h65cv;

    public thl() {
        this.sdhdh(false);
    }

    public boolean skhz_2(Object object) {
        block0: {
            int n = 142225607;
            int n2 = (n = Integer.rotateLeft(n * -1556112419, 13) ^ 0x5D4CF517) ^ 0xA949C627;
            if ((n2 ^ n) == -1454782937) break block0;
            int cfr_ignored_0 = (0xA133F6E0 ^ n) - -615309001;
        }
        return this.rgha_2();
    }

    public boolean dhsr_2(Object object) {
        block0: {
            int n = wf.nz(-491829602);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
            int n2 = n ^ 0x8EFB6EE7;
            if ((n2 ^ n) == -1896124697) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6C542879 ^ n, 16) + 579765730) * 1817454713;
            int cfr_ignored_1 = (int)(0xAEE6864427D4EB4FL ^ (long)n ^ 0xF1F8831A2DB8F01CL);
        }
        return thl.rsj_2(this);
    }

    public tshd zhn_4() {
        block0: {
            int n = -685552090;
            n = Integer.rotateLeft(n * -1928668405, 11) ^ 0x97691B9A;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0xC04D2EF7;
            if ((n2 ^ n) == -1068683529) break block0;
            int cfr_ignored_0 = (0x176E60D1 ^ n) - 189577057;
        }
        return this.had;
    }

    public badh_2 say() {
        block0: {
            int n = 669649420;
            n = Integer.rotateLeft(n * 401248037, 25) ^ 0x4D8EE034;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x49323EBA;
            if ((n2 ^ n) == 1228029626) break block0;
            int cfr_ignored_0 = (0x6ED834B6 ^ n) - 827442438;
        }
        return this.slh_2;
    }

    public byq ghshsh() {
        block0: {
            int n = wf.nz(-1022474916);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 28);
            int n2 = n ^ 0x8535B7A;
            if ((n2 ^ n) == 139680634) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCB5D1E26 ^ n, 12) - -1532738091;
        }
        return this.shkhz_2.sdsh_4();
    }

    public tay khkhq() {
        block0: {
            int n = 1173205041;
            n = Integer.rotateLeft(n * 1787666839, 24) ^ 0x7B324403;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xEEB150E3;
            if ((n2 ^ n) == -290369309) break block0;
            int cfr_ignored_0 = (0xAB5CE0D2 ^ n) - -1234375645;
        }
        return this.bghgh;
    }

    public tay zbs_3() {
        block0: {
            int n = wf.nz(1009675159);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC7E9055E;
            if ((n2 ^ n) == -941030050) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xFBC76EC9 ^ n, 18) + -2122053230;
            int cfr_ignored_1 = (int)(0x3975C0F427D4EB4FL ^ (long)n ^ 0x7C98831A2DB9DF3AL);
        }
        return this.thlj;
    }

    public badh_2 kd() {
        block0: {
            int n = 505411064;
            int n2 = (n = Integer.rotateLeft(n * 1559908081, 22) ^ 0x9AA85E5C) ^ 0xD6CF2183;
            if ((n2 ^ n) == -691068541) break block0;
            int cfr_ignored_0 = (0xC8D0D47B ^ n) + -1469971973;
        }
        return this.bab;
    }

    private boolean thsq() {
        int n = -1017891793;
        int n2 = (n = Integer.rotateLeft(n * 711516251, 3) ^ 0x44FAE665) ^ 0x1783A9A;
        if ((n2 ^ n) != 24656538) {
            int cfr_ignored_0 = (0xC22C0EB5 ^ n) + 647662669;
        }
        return !this.slh_2.shzl();
    }

    private static String zw(String string, int n, int n2, int n3) {
        int n4 = 740429484;
        n4 = Integer.rotateLeft(n4 * 1126146791, 19) ^ 0x894A0CB6;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 5);
        int n5 = (n4 = n2 ^ n4) ^ 0x507AC218;
        if ((n5 ^ n4) != 1350222360) {
            int cfr_ignored_0 = (0x7C58CCB4 ^ n4) + -903732958;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xDAA29FAD ^ n2 ^ i * -1268756597 ^ dtf, 11) ^ zmy));
        }
        return new String(cArray);
    }

    private static boolean rsj_2(thl thl2) {
        block0: {
            int n = -1965149531;
            n = Integer.rotateLeft(n * 980010165, 17) ^ 0x1407F093;
            thl thl3 = thl2;
            n = Integer.rotateLeft((thl3 != null ? System.identityHashCode(thl3) : 0) ^ n, 11);
            int n2 = n ^ 0xD4EB8319;
            if ((n2 ^ n) == -722762983) break block0;
            int cfr_ignored_0 = (0x5E35B1BC ^ n) - -1070821035;
        }
        return thl2.rgha_2();
    }

    private static String[] hlk(String string) {
        block0: {
            int n = wf.nz(-1141633505);
            int n2 = n ^ 0x1CAE7B17;
            if ((n2 ^ n) == 481196823) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA75A7508 ^ n, 7) + 1213319987;
        }
        return string.split("\u0005\u0015", -1);
    }

    private static CallSite jss_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1674055827;
            n3 = Integer.rotateLeft(n3 * -1659608153, 10) ^ 0x6A5D4274;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x24EA405A;
            if ((n4 ^ n3) != 619331674) {
                int cfr_ignored_0 = (0x472250C9 ^ n3) + 879810548;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ jnf ^ string.hashCode() ^ n2 + khygh ^ i * -98741031 ^ jnf, 18) ^ khygh));
            }
            String[] stringArray = thl.hlk(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] umvqu3c5fic(String string) {
        return string.split("\u0006\u001d", -1);
    }

    private static CallSite jv4dqq27tgc5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ m3y5mir ^ string.hashCode() ^ n2 + hlfzl7g4tm2s8 + i * 1646813237) + m3y5mir) ^ hlfzl7g4tm2s8));
            }
            String[] stringArray = thl.umvqu3c5fic(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

