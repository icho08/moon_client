/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_10185
 *  net.minecraft.class_744
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_10185;
import net.minecraft.class_744;
import us.m0vy.moondlc.m0vyguard.tkhq;
import us.m0vy.moondlc.m0vyguard.zz_3;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bndh {
    private boolean shqa_2;
    private boolean rddh;
    private boolean bdm_2;
    private boolean thaq_2;
    public static final bndh dhw;
    public static final bndh rta_3;
    public static final bndh skhk;
    public static final bndh btd_4;
    public static final bndh dhq_2;
    private static final int zld_2 = 2110453501;
    private static final int djf = -936477292;
    private static final int y9awlkxt = 1003617556;
    private static final int eiypatf = -1444217429;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int xqmvfje8z;

    public bndh(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.shqa_2 = bl;
        this.rddh = bl2;
        this.bdm_2 = bl3;
        this.thaq_2 = bl4;
    }

    public bndh(class_744 class_7442) {
        this(((zz_3)class_7442).zlt_4());
    }

    public bndh(class_10185 class_101852) {
        this(class_101852.comp_3159(), class_101852.comp_3160(), class_101852.comp_3161(), class_101852.comp_3162());
    }

    public bndh(float f, float f2) {
        this(f > 0.0f, f < 0.0f, f2 > 0.0f, f2 < 0.0f);
    }

    public boolean khlgh(Object object) {
        try {
            int n = -1716137335;
            n = Integer.rotateLeft(n * 1587321531, 3) ^ 0x6821FA93;
            n = System.identityHashCode(this) ^ n;
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0xB6FBCE5C;
            if ((n2 ^ n) != -1225011620) {
                int cfr_ignored_0 = (0x2F4E1CD5 ^ n) + 696930900;
            }
            if ((0x288 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this == object) {
            int n = 1;
            if (yf.tdhth_2() == 0) {
                n = n ^ 0x8B20;
            }
            return n != 0;
        }
        if (!(object instanceof bndh)) {
            return false;
        }
        bndh bndh2 = (bndh)object;
        return this.shqa_2 == bndh2.shqa_2 && this.rddh == bndh2.rddh && this.bdm_2 == bndh2.bdm_2 && this.thaq_2 == bndh2.thaq_2;
    }

    public int tqs_2() {
        int n;
        block1: {
            int n2 = 636397135;
            n2 = Integer.rotateLeft(n2 * 1811605187, 4) ^ 0xB490F698;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 25);
            int n3 = n2 ^ 0x3266AE2F;
            if ((n3 ^ n2) != 845590063) {
                int cfr_ignored_0 = (0x17880860 ^ n2) - 2052294821;
            }
            int n4 = Boolean.hashCode(this.shqa_2);
            n4 = (0x3B3628B7 ^ 0x3B3628A8) * n4 + Boolean.hashCode(this.rddh);
            n4 = (1077704756 + -1077704725) * n4 + Boolean.hashCode(this.bdm_2);
            n = n4 = (-424120505 + 424120536) * n4 + Boolean.hashCode(this.thaq_2);
            if (bndh.jkh_2() != 0) break block1;
            n = n ^ 0x2308;
        }
        return n;
    }

    public boolean thld_2() {
        int n = 463746541;
        n = Integer.rotateLeft(n * 1096822629, 13) ^ 0xA1EF2F99;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC73CDCE2;
        if ((n2 ^ n) != -952312606) {
            int cfr_ignored_0 = (0xDC98E90F ^ n) + 1473261630;
        }
        if (!bndh.rtd()) {
            yf.athz_2();
        }
        return this.shqa_2 || this.rddh || this.bdm_2 || this.thaq_2;
    }

    @Generated
    public boolean thtd() {
        block0: {
            int n = tkhq.jas_2(942934351);
            int n2 = n ^ 0x753E015A;
            if ((n2 ^ n) == 1966997850) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4D0A0815 ^ n, 12) - 1486133702) * 1292503061;
            int cfr_ignored_1 = (int)(0x8FB8A62827D4EB4FL ^ (long)n ^ 0xB120831A2DB8B2A0L);
        }
        return this.shqa_2;
    }

    @Generated
    public boolean dhym() {
        block0: {
            int n = -767183143;
            n = Integer.rotateLeft(n * -1579575327, 14) ^ 0x8D11ED0F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x28E3DDC7;
            if ((n2 ^ n) == 686022087) break block0;
            int cfr_ignored_0 = (0xFAA66B1E ^ n) + 190716159;
        }
        return this.rddh;
    }

    @Generated
    public boolean dshq() {
        block0: {
            int n = -226345914;
            n = Integer.rotateLeft(n * 179502301, 3) ^ 0xD15B76BE;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x9D54CCD7;
            if ((n2 ^ n) == -1655386921) break block0;
            int cfr_ignored_0 = (0x6FD6F091 ^ n) + -1522320492;
        }
        return this.bdm_2;
    }

    @Generated
    public boolean sht_6() {
        block0: {
            int n = tkhq.jas_2(625143304);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x847F3A12;
            if ((n2 ^ n) == -2072036846) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA13DD41A ^ n, 7) + -1965404575) * -1589783525;
        }
        return this.thaq_2;
    }

    @Generated
    public void dhkht_2(boolean bl) {
        int n = 1369721724;
        n = Integer.rotateLeft(n * -490318493, 16) ^ 0x91CAD0B3;
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = bl ^ n) ^ 0x4366DC4F;
        if ((n2 ^ n) != 1130814543) {
            int cfr_ignored_0 = (0x12C29733 ^ n) + -1524958388;
        }
        this.shqa_2 = bl;
    }

    @Generated
    public void dhy_2(boolean bl) {
        int n = tkhq.jas_2(-1640401988);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE9DDCF0;
        if ((n2 ^ n) != 245226736) {
            int cfr_ignored_0 = Integer.rotateLeft(0x90A4AF4C ^ n, 5) - -2008098449;
        }
        this.rddh = bl;
    }

    @Generated
    public void ghtj(boolean bl) {
        int n = tkhq.jas_2(2095765262);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
        int n2 = (n = Integer.rotateLeft(bl ^ n, 25)) ^ 0x81FAC5DC;
        if ((n2 ^ n) != -2114271780) {
            int cfr_ignored_0 = (Integer.rotateRight(0xFD1012D2 ^ n, 18) + -1454381399) * -49278253;
        }
        this.bdm_2 = bl;
    }

    @Generated
    public void slth(boolean bl) {
        int n = 1215727502;
        n = Integer.rotateLeft(n * 566410517, 24) ^ 0xE24308F5;
        int n2 = (n = bl ^ n) ^ 0x974D4CEB;
        if ((n2 ^ n) != -1756541717) {
            int cfr_ignored_0 = (0xDF3BCB65 ^ n) + 9825337;
        }
        this.thaq_2 = bl;
    }

    private static int jkh_2() {
        block0: {
            int n = 2132964283;
            int n2 = (n = Integer.rotateLeft(n * 1398270587, 6) ^ 0x69D82119) ^ 0x94F5C0EE;
            if ((n2 ^ n) == -1795833618) break block0;
            int cfr_ignored_0 = (0xEBD7B355 ^ n) + -1166825432;
        }
        return yf.tdhth_2();
    }

    private static boolean rtd() {
        block0: {
            int n = -1217167954;
            int n2 = (n = Integer.rotateLeft(n * -2140480927, 15) ^ 0xA9D0DC82) ^ 0x4FE4C1C4;
            if ((n2 ^ n) == 1340391876) break block0;
            int cfr_ignored_0 = (0xF897BC6A ^ n) + 147324564;
        }
        return yf.khdha_2();
    }

    private static String[] zql(String string) {
        int n = -1280630431;
        n = Integer.rotateLeft(n * 630379911, 17) ^ 0x4AABB5A2;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 4);
        int n2 = n ^ 0x16B7E171;
        if ((n2 ^ n) != 381149553) {
            int cfr_ignored_0 = (0xA51CC010 ^ n) + -171807907;
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

    private static CallSite rly(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 777313429;
            n3 = Integer.rotateLeft(n3 * 1695023805, 11) ^ 0x62C22705;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 25);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 10);
            int n4 = n3 ^ 0x2BF2E566;
            if ((n4 ^ n3) != 737338726) {
                int cfr_ignored_0 = (0x5A639F3 ^ n3) + -1261516795;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zld_2 ^ string.hashCode() ^ n2 + djf ^ i * 571806767 ^ zld_2, 26) ^ djf));
            }
            String[] stringArray = bndh.zql(new String(cArray));
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

    private static String[] glgmu7157a0sj6(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qytvz6q94x02us(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ y9awlkxt ^ string.hashCode()) + (n2 + eiypatf) + i ^ y9awlkxt, 9) + eiypatf);
            }
            String[] stringArray = bndh.glgmu7157a0sj6(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

