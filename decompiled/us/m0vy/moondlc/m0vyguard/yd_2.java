/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="NoPush", category=bzw.OTHER, desc="Prevents player from being pushed by blocks, entities, or fluids")
public class yd_2
extends bnq {
    private final bbd_2 dlb = new bbd_2(this, "Types");
    private final s_3 jst = new s_3(this.dlb, "Blocks").thst();
    private final s_3 ztn = new s_3(this.dlb, "Entities").thst();
    private final s_3 zst_2 = new s_3(this.dlb, "Fluids").thst();
    private static yd_2 khthf;
    private static final int shhy_2 = 959337907;
    private static final int tthr = -303901723;
    private static final int bht_3 = -169532586;
    private static final int sr_2 = 382700037;
    private static final int pt2mmjlq06568 = -1023603217;
    private static final int h840phu63 = -1981151108;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hg17a0nvhc24p;

    public yd_2() {
        khthf = this;
        this.sdhdh(false);
    }

    public static yd_2 ghtd_4() {
        block0: {
            int n = 1536374626;
            int n2 = (n = Integer.rotateLeft(n * -1066647043, 16) ^ 0x657E440D) ^ 0x2A1F9EDB;
            if ((n2 ^ n) == 706715355) break block0;
            int cfr_ignored_0 = (0x718CA9B9 ^ n) - -775711848;
        }
        return khthf;
    }

    public s_3 thghh() {
        return this.jst;
    }

    public s_3 zhd_8() {
        block0: {
            int n = -1002227161;
            n = Integer.rotateLeft(n * 551045279, 6) ^ 0x1599D794;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD247D9BD;
            if ((n2 ^ n) == -767043139) break block0;
            int cfr_ignored_0 = (0x1604E39A ^ n) + -1834590830;
        }
        return this.ztn;
    }

    public s_3 khkj() {
        block0: {
            int n = 1324678933;
            int n2 = (n = Integer.rotateLeft(n * 959748291, 10) ^ 0x41496A65) ^ 0x60548D81;
            if ((n2 ^ n) == 1616153985) break block0;
            int cfr_ignored_0 = (0x2EA07294 ^ n) + -933673346;
        }
        return this.zst_2;
    }

    private static String tdz_4(String string, int n, int n2, int n3) {
        int n4 = 1713903499;
        n4 = Integer.rotateLeft(n4 * 1936598755, 9) ^ 0xA01B7927;
        int n5 = (n4 = n ^ n4) ^ 0x7E714125;
        if ((n5 ^ n4) != 2121351461) {
            int cfr_ignored_0 = (0x185956AE ^ n4) + 1579191723;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x49E4CD03 ^ n2 ^ i * 522988521 ^ shhy_2, 22) ^ tthr));
        }
        return new String(cArray);
    }

    private static String[] tkd_4(String string) {
        int n = 324128096;
        n = Integer.rotateLeft(n * 941873897, 23) ^ 0x2CB60968;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 10);
        int n2 = n ^ 0xDD24BB9E;
        if ((n2 ^ n) != -584795234) {
            int cfr_ignored_0 = (0xCE7576FE ^ n) - -865749271;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite hfs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1999752602;
            n3 = Integer.rotateLeft(n3 * 982477015, 18) ^ 0x8182ECEF;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 19);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xBCAB0622;
            if ((n4 ^ n3) != -1129642462) {
                int cfr_ignored_0 = (0xCB9ACBB8 ^ n3) - -1398143732;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bht_3 ^ string.hashCode() ^ n2 + sr_2 + i * -759852687) + bht_3) ^ sr_2));
            }
            String[] stringArray = yd_2.tkd_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] b98owwwd4np(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wz4k7onrch2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ pt2mmjlq06568 ^ string.hashCode()) + (n2 + h840phu63) + i ^ pt2mmjlq06568, 28) + h840phu63);
            }
            String[] stringArray = yd_2.b98owwwd4np(new String(cArray));
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

