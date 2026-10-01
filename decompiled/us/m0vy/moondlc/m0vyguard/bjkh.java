/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_320
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_310;
import net.minecraft.class_320;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.ts_4;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghh;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Protect", category=bzw.OTHER, desc="Protect mode for hiding identity")
public class bjkh
extends bnq {
    private final ts_4 bzd_3 = new ts_4((hy)this, "Custom Name", "Custom Name").tshgh("Protected");
    private final badh_2 hb = new badh_2(this, "Hide Name").bts(true);
    private final badh_2 rkn = new badh_2((hy)this, "Hide fri".concat("ends"), this::zdhs).bts(true);
    private final badh_2 khlz = new badh_2(this, "No Fun Time").bts(true);
    private final ConcurrentHashMap rnm = new ConcurrentHashMap();
    private final AtomicInteger bts_2 = new AtomicInteger(1);
    private static bjkh thk_2;
    private static final int ztz_4 = 1178352845;
    private static final int tdh_5 = -677695571;
    private static final int tdh_2 = 1449339706;
    private static final int ysh = 1078059502;
    private static final int o1row9gx30rq0 = -1330902815;
    private static final int icbrpr7w4xq8 = -568246430;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int wfjoefx8q9v;

    public badh_2 thtq() {
        block0: {
            int n = -1657877824;
            n = Integer.rotateLeft(n * -665063577, 8) ^ 0xAFF11EE5;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
            int n2 = n ^ 0x740FC85C;
            if ((n2 ^ n) == 1947191388) break block0;
            int cfr_ignored_0 = (0xE921029C ^ n) - 486961939;
        }
        return this.khlz;
    }

    public badh_2 dhdkh_2() {
        block0: {
            int n = ghh.shrw(1588529070);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x34CAC851;
            if ((n2 ^ n) == 885704785) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6A65CFFF ^ n, 16) - -424554724) * 1785057279;
        }
        return this.hb;
    }

    public badh_2 dad_4() {
        block0: {
            int n = -36362613;
            int n2 = (n = Integer.rotateLeft(n * 852176287, 10) ^ 0x9D10176E) ^ 0x9D6F6C9;
            if ((n2 ^ n) == 165082825) break block0;
            int cfr_ignored_0 = (0xF403D042 ^ n) + 396246655;
        }
        return this.rkn;
    }

    public bjkh() {
        thk_2 = this;
    }

    public static bjkh shzkh() {
        block0: {
            int n = 1981140664;
            int n2 = (n = Integer.rotateLeft(n * -720326825, 18) ^ 0xC67D5682) ^ 0xA5B05721;
            if ((n2 ^ n) == -1515170015) break block0;
            int cfr_ignored_0 = (0xD3A59999 ^ n) + 807223550;
        }
        return thk_2;
    }

    public String hd() {
        int n = 717814415;
        n = Integer.rotateLeft(n * -809135991, 13) ^ 0x19EDA1BC;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA57C2F9;
        if ((n2 ^ n) != 173523705) {
            int cfr_ignored_0 = (0x209F3876 ^ n) + 1700243024;
        }
        return bjkh.zsh_8(this) && this.hb.shzl() ? this.bzd_3.dysh() : bjkh.khzz_3(mc).method_1676();
    }

    public String zta_4(String string) {
        int n = -1541775924;
        n = Integer.rotateLeft(n * -1916998367, 5) ^ 0xD9ED1AE9;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF139902A;
        if ((n2 ^ n) != -247885782) {
            int cfr_ignored_0 = (0x5523CDE6 ^ n) - 506793983;
        }
        return this.rgha_2() && this.hb.shzl() && this.rkn.shzl() && Moondlc.getInstance().getFriendManager().adhj(string) ? bjkh.mw(this, string) : string;
    }

    public String thlb(String string) {
        try {
            int n = 1009463464;
            n = Integer.rotateLeft(n * -1255328437, 19) ^ 0xCAE9E02A;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 25);
            int n2 = n ^ 0xB13709D;
            if ((n2 ^ n) != 185823389) {
                int cfr_ignored_0 = (0x37384035 ^ n) + -1911917010;
            }
            if ((0xAB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bjkh.sadh_4()) {
            bjkh.znz();
            throw null;
        }
        int n = this.rnm.computeIfAbsent(string.toLowerCase(), this::bfz_2);
        return "Friend " + n;
    }

    public String dds_8(String string) {
        int n = -320545532;
        n = Integer.rotateLeft(n * 1371978127, 15) ^ 0x7F26E722;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x39655A10;
        if ((n2 ^ n) != 962943504) {
            int cfr_ignored_0 = (0xD5818714 ^ n) + -1035964767;
        }
        if (!yf.khdha_2()) {
            bjkh.shzn();
            throw null;
        }
        if (string == null || string.isBlank()) {
            return string;
        }
        kh_3 kh2 = bjkh.hdhl().getFriendManager();
        for (String string2 : kh2.hkha_2()) {
            if (!bjkh.md(string2, string)) continue;
            return string2;
        }
        if (!(this.rgha_2() && this.hb.shzl() && this.rkn.shzl())) {
            return string;
        }
        for (String string2 : kh2.hkha_2()) {
            Integer n3 = (Integer)this.rnm.get(string2.toLowerCase());
            if (n3 == null || !bjkh.shka("Friend " + n3, string)) continue;
            return string2;
        }
        for (String string2 : kh2.hkha_2()) {
            if (!this.thlb(string2).equalsIgnoreCase(string)) continue;
            return string2;
        }
        return string;
    }

    private Integer bfz_2(String string) {
        block0: {
            int n = 1683763258;
            n = Integer.rotateLeft(n * 1972723977, 9) ^ 0xA81A729F;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 29);
            int n2 = n ^ 0xCE4EA87C;
            if ((n2 ^ n) == -833705860) break block0;
            int cfr_ignored_0 = (0xAA129846 ^ n) - 460352520;
        }
        return this.bts_2.getAndIncrement();
    }

    private boolean zdhs() {
        block0: {
            int n = 1134337306;
            n = Integer.rotateLeft(n * -1270427835, 16) ^ 0xC0969ACC;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0xAAF1A0B1;
            if ((n2 ^ n) == -1427005263) break block0;
            int cfr_ignored_0 = (0xE96D3DAB ^ n) + -1959949138;
        }
        return this.hb.shzl();
    }

    private static String zdhm(String string, int n, int n2, int n3) {
        try {
            int n4 = -1441499337;
            n4 = Integer.rotateLeft(n4 * -1187083443, 12) ^ 0xE8BAC598;
            int n5 = n4 ^ 0xB6A6404B;
            if ((n5 ^ n4) != -1230618549) {
                int cfr_ignored_0 = (0x1CB2377C ^ n4) + -74354368;
            }
            if ((0x9C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xC92F2A8C ^ n2 - i) + tdh_5, 6) ^ ztz_4 + i * 2074156001));
        }
        return new String(cArray);
    }

    private static boolean zsh_8(bjkh bjkh2) {
        block0: {
            int n = ghh.shrw(-201173393);
            int n2 = n ^ 0xE396592C;
            if ((n2 ^ n) == -476686036) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x17940F43 ^ n, 5) + -548702120;
        }
        return bjkh2.rgha_2();
    }

    private static class_320 khzz_3(class_310 class_3102) {
        block0: {
            int n = -124859240;
            int n2 = (n = Integer.rotateLeft(n * -672920181, 28) ^ 0x26523C64) ^ 0x1EAE0264;
            if ((n2 ^ n) == 514720356) break block0;
            int cfr_ignored_0 = (0xE620CEFC ^ n) + 457458036;
        }
        return class_3102.method_1548();
    }

    private static String mw(bjkh bjkh2, String string) {
        block0: {
            int n = 479138867;
            n = Integer.rotateLeft(n * 1440492735, 27) ^ 0x865BBCE6;
            bjkh bjkh3 = bjkh2;
            n = (bjkh3 != null ? System.identityHashCode(bjkh3) : 0) ^ n;
            int n2 = n ^ 0xF90C43BD;
            if ((n2 ^ n) == -116636739) break block0;
            int cfr_ignored_0 = (0xE583578E ^ n) - -233497461;
        }
        return bjkh2.thlb(string);
    }

    private static boolean sadh_4() {
        block0: {
            int n = ghh.shrw(1741220139);
            int n2 = n ^ 0xB3C9ADEF;
            if ((n2 ^ n) == -1278628369) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD40144C4 ^ n, 13) - -1333464329;
        }
        return yf.khdha_2();
    }

    private static void znz() {
        int n = ghh.shrw(828225093);
        int n2 = n ^ 0xC08CE67D;
        if ((n2 ^ n) != -1064507779) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF1D15038 ^ n, 17) + 1287017987) * -237940679;
        }
        yf.athz_2();
    }

    private static void shzn() {
        int n = -480384046;
        int n2 = (n = Integer.rotateLeft(n * -2124269193, 26) ^ 0xDF59A62A) ^ 0x8EAB3BBD;
        if ((n2 ^ n) != -1901380675) {
            int cfr_ignored_0 = (0x6DF6D06F ^ n) + -755919414;
        }
        yf.athz_2();
    }

    private static Moondlc hdhl() {
        block0: {
            int n = 1388656349;
            int n2 = (n = Integer.rotateLeft(n * -2016526937, 4) ^ 0x86EFE3E) ^ 0xC163357D;
            if ((n2 ^ n) == -1050462851) break block0;
            int cfr_ignored_0 = (0x93A603A0 ^ n) - 1721063636;
        }
        return Moondlc.getInstance();
    }

    private static boolean md(String string, String string2) {
        block0: {
            int n = -865338690;
            n = Integer.rotateLeft(n * 171933799, 10) ^ 0xC28F1016;
            String string3 = string2;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 13);
            int n2 = n ^ 0xE882D3ED;
            if ((n2 ^ n) == -394079251) break block0;
            int cfr_ignored_0 = (0x24E92953 ^ n) - -1472709066;
        }
        return string.equalsIgnoreCase(string2);
    }

    private static boolean shka(String string, String string2) {
        block0: {
            int n = 589121994;
            n = Integer.rotateLeft(n * 100859333, 9) ^ 0x7FF8E5F0;
            String string3 = string;
            n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 28);
            String string4 = string2;
            n = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 16);
            int n2 = n ^ 0x4FE4E7A8;
            if ((n2 ^ n) == 1340401576) break block0;
            int cfr_ignored_0 = (0x6CF9AE62 ^ n) - 323842248;
        }
        return string.equalsIgnoreCase(string2);
    }

    private static String[] arj(String string) {
        block0: {
            int n = 1821869097;
            int n2 = (n = Integer.rotateLeft(n * 835529805, 3) ^ 0x19A12401) ^ 0xAE41898E;
            if ((n2 ^ n) == -1371436658) break block0;
            int cfr_ignored_0 = (0xC2D60DA7 ^ n) + -1737828493;
        }
        return string.split("\u0002\u001a", -1);
    }

    private static CallSite ttsh_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1377852564;
            n3 = Integer.rotateLeft(n3 * 1002672207, 17) ^ 0xC1F7848E;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x988C315B;
            if ((n4 ^ n3) != -1735642789) {
                int cfr_ignored_0 = (0x35539237 ^ n3) + -1652630902;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tdh_2 ^ string.hashCode()) + (n2 + ysh) + i ^ tdh_2, 19) + ysh);
            }
            String[] stringArray = bjkh.arj(new String(cArray));
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

    private static String[] rhp7u180hl7u(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite m7h19mtlqf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ o1row9gx30rq0 ^ string.hashCode() ^ n2 + icbrpr7w4xq8 + i * 1620862131) + o1row9gx30rq0) ^ icbrpr7w4xq8));
            }
            String[] stringArray = bjkh.rhp7u180hl7u(new String(cArray));
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

