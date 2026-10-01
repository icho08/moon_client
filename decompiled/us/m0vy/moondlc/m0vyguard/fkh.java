/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1799
 *  net.minecraft.class_1829
 *  net.minecraft.class_9280
 *  net.minecraft.class_9334
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_9280;
import net.minecraft.class_9334;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.sd_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;

@tq_2(name="Sword Replace", category=bzw.OTHER, desc="Replaces custom 3D sword models via resourcepack model data")
public class fkh
extends bnq {
    public static final String[] stz_3;
    private static final fkh rd;
    private final khd smz = new khd(this, "Model").dhjdh(true);
    private final Map jha_2 = new HashMap();
    private static final int khshl = -1565204944;
    private static final int szy = -1204735954;
    private static final int dhda = -97290525;
    private static final int bkht_2 = 562974194;
    private static final int sa7slr4 = -1495664441;
    private static final int tji0tfth2w = -1672710801;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hp23zgwc7ulo;

    public fkh() {
        if (stz_3 != null) {
            for (String string : stz_3) {
                fy fy2 = new fy(this.smz, string);
                if ("Katana".equalsIgnoreCase(string)) {
                    fy2.rhh_3();
                }
                this.jha_2.put(string, new class_9280(List.of(), List.of(), List.of(string), List.of()));
            }
        }
    }

    public class_9280 thadh() {
        int n = sd_3.aqm(1923356394);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0x11D222C;
        if ((n2 ^ n) != 18686508) {
            int cfr_ignored_0 = Integer.rotateRight(0x73B934C6 ^ n, 17) - 130745141;
        }
        if (!this.rgha_2()) {
            return null;
        }
        fy fy2 = this.smz.sdh_2();
        if (fy2 == null) {
            return null;
        }
        String string = fy2.getName();
        class_9280 class_92802 = (class_9280)this.jha_2.get(string);
        if (class_92802 == null) {
            class_92802 = new class_9280(List.of(), List.of(), fkh.bya_2(string), List.of());
            this.jha_2.put(string, class_92802);
        }
        return class_92802;
    }

    public class_1799 shhd_2(class_1799 class_17992) {
        if (!this.rgha_2() || class_17992 == null || class_17992.method_7960() || !(class_17992.method_7909() instanceof class_1829)) {
            return class_17992;
        }
        class_9280 class_92802 = this.thadh();
        if (class_92802 == null) {
            return class_17992;
        }
        class_1799 class_17993 = class_17992.method_7972();
        class_17993.method_57379(class_9334.field_49637, (Object)class_92802);
        return class_17993;
    }

    @Generated
    public static fkh zzs_8() {
        block0: {
            int n = -1452093406;
            int n2 = (n = Integer.rotateLeft(n * -65443649, 12) ^ 0x2B21B4EE) ^ 0xAE3ECC49;
            if ((n2 ^ n) == -1371616183) break block0;
            int cfr_ignored_0 = (0x74C1C6B ^ n) + 1956129412;
        }
        return rd;
    }

    private static String thkhz(String string, int n, int n2, int n3) {
        int n4 = 1416125753;
        n4 = Integer.rotateLeft(n4 * -1793374393, 7) ^ 0x1C348125;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 4)) ^ 0xA36B78B7;
        if ((n5 ^ n4) != -1553237833) {
            int cfr_ignored_0 = (0xF703258E ^ n4) + -2035657869;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xA7EBA1D7) + i ^ khshl, 16) ^ n2 + szy));
        }
        return new String(cArray);
    }

    private static List bya_2(Object object) {
        block0: {
            int n = -592330523;
            n = Integer.rotateLeft(n * 1473588025, 3) ^ 0xAF09C481;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 23);
            int n2 = n ^ 0xC55A4937;
            if ((n2 ^ n) == -983938761) break block0;
            int cfr_ignored_0 = (0x19EB89D2 ^ n) - 885601170;
        }
        return List.of(object);
    }

    private static String[] jfkh(String string) {
        int n = -406432177;
        int n2 = (n = Integer.rotateLeft(n * -390329129, 6) ^ 0x9A66CFC8) ^ 0x6C140DD5;
        if ((n2 ^ n) != 1813253589) {
            int cfr_ignored_0 = (0x8BD25B9A ^ n) + -1991104333;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite shths_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1274830983;
            n3 = Integer.rotateLeft(n3 * -1484020335, 28) ^ 0x68B01C36;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 5);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x4201E78;
            if ((n4 ^ n3) != 69213816) {
                int cfr_ignored_0 = (0xB0238101 ^ n3) - 2001493300;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dhda ^ string.hashCode() ^ n2 + bkht_2 ^ i * 152774923 ^ dhda, 3) ^ bkht_2));
            }
            String[] stringArray = fkh.jfkh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] e3vlh34fva8s(String string) {
        return string.split("\u0002\u001e", -1);
    }

    private static CallSite g95yjqd3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sa7slr4 ^ string.hashCode() ^ n2 + tji0tfth2w + i * -140784363) + sa7slr4) ^ tji0tfth2w));
            }
            String[] stringArray = fkh.e3vlh34fva8s(new String(cArray));
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

