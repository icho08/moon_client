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
import us.m0vy.moondlc.m0vyguard.tsz_2;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="Slot Locker", category=bzw.OTHER, desc="Prevents dropping items from protected hotbar slots")
public class thgh
extends bnq {
    private final bbd_2 raa = new bbd_2(this, "Protected Hotbar Slots").sshm(true);
    private final s_3 khthl = new s_3(this.raa, "Slot 1");
    private final s_3 khdz_4 = new s_3(this.raa, "Slot 2");
    private final s_3 hdq_2 = new s_3(this.raa, "Slot 3");
    private final s_3 dsd_4 = new s_3(this.raa, "Slot 4");
    private final s_3 dydh = new s_3(this.raa, "Slot 5");
    private final s_3 dhds_4 = new s_3(this.raa, "Slot 6");
    private final s_3 thyh_2 = new s_3(this.raa, "Slot 7");
    private final s_3 thfr = new s_3(this.raa, "Slot 8");
    private final s_3 thht_2 = new s_3(this.raa, "Slot 9");
    private final s_3[] dbkh;
    private static thgh khfl;
    private static final int rbb = 2022779027;
    private static final int hzb = -1475679206;
    private static final int bts_4 = 1766629954;
    private static final int zdgh = -1073321926;
    private static final int je7j7rtz93q = 21203939;
    private static final int gzuargcn7 = 1263607072;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int q79s3hl7;

    public thgh() {
        s_3[] sArray = new s_3[Integer.rotateLeft(0xF32A5BDB ^ 0xF32A5B4B, 28)];
        sArray[0] = this.khthl;
        sArray[1] = this.khdz_4;
        sArray[2] = this.hdq_2;
        sArray[3] = this.dsd_4;
        sArray[4] = this.dydh;
        sArray[5] = this.dhds_4;
        sArray[Integer.rotateLeft((int)(0xF048F6B ^ 0xFC48F6B), (int)11)] = this.thyh_2;
        sArray[1735958099 + -1735958092] = this.thfr;
        sArray[1245058333 + -1245058325] = this.thht_2;
        this.dbkh = sArray;
        khfl = this;
    }

    public static thgh zaz_3() {
        block0: {
            int n = tsz_2.ztl_4(1083984610);
            int n2 = n ^ 0x1F46C850;
            if ((n2 ^ n) == 524732496) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x5FDA82B2 ^ n, 14) + -1613532471) * 1608155827;
        }
        return khfl;
    }

    public boolean hdhj(int n) {
        int n2 = tsz_2.ztl_4(-1526863597);
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 7);
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 15)) ^ 0x3A260B5E;
        if ((n3 ^ n2) != 975571806) {
            int cfr_ignored_0 = Integer.rotateLeft(0x9EDBE24D ^ n2, 6) - 1090389646;
            int cfr_ignored_1 = (int)(0x5C694C7027D4EB4FL ^ (long)n2 ^ 0x6590831A2DB91503L);
        }
        return this.rgha_2() && n >= 0 && n < this.dbkh.length && this.dbkh[n].alh();
    }

    private static String jka_2(String string, int n, int n2, int n3) {
        int n4 = tsz_2.ztl_4(-656792378);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 7)) ^ 0xDFA64E00;
        if ((n5 ^ n4) != -542749184) {
            int cfr_ignored_0 = Integer.rotateRight(0x77C6AC6 ^ n4, 3) - -328299211;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x26E4F33E) + i ^ rbb, 25) ^ n2 + hzb));
        }
        return new String(cArray);
    }

    private static String[] hhy_2(String string) {
        int n = tsz_2.ztl_4(-107239499);
        int n2 = n ^ 0x2E2925A;
        if ((n2 ^ n) != 48403034) {
            int cfr_ignored_0 = Integer.rotateRight(0xFB7935EF ^ n, 18) - 2013996844;
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

    private static CallSite zzth_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -574450753;
            n3 = Integer.rotateLeft(n3 * 61113397, 17) ^ 0xB4B0DA77;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x39A745B5;
            if ((n4 ^ n3) != 967263669) {
                int cfr_ignored_0 = (0xE465D60A ^ n3) + 2103617141;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bts_4 ^ string.hashCode() ^ n2 + zdgh + i * 285503807) + bts_4) ^ zdgh));
            }
            String[] stringArray = thgh.hhy_2(new String(cArray));
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

    private static String[] rag7toi59e(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite p3q8cvj5in6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ je7j7rtz93q ^ string.hashCode()) + (n2 + gzuargcn7) + i ^ je7j7rtz93q, 6) + gzuargcn7);
            }
            String[] stringArray = thgh.rag7toi59e(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

