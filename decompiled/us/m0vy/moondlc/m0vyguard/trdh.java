/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2350
 *  net.minecraft.class_239
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.wd_2;

@tq_2(name="Crystal Tap", category=bzw.OTHER, desc="Automatically places and detonates crystals under your crosshair")
public class trdh
extends bnq {
    private static final trdh jshsh;
    public final badh_2 khzth_2 = new badh_2(this, "Auto Plac".concat("e Crystal")).bts(true);
    public final tay dzk = new tay(this, "Place Delay").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1111772623) ^ 0xCCEDDDBD)).rkh_3(1.0f).ssd_5(0.0f);
    public final tay khhf = new tay(this, "Attack ".concat("Delay")).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xD1C1A27 ^ 0x4D1C1AA6, 23))).rkh_3(1.0f).ssd_5(0.0f);
    private int dwdh;
    private int ttj;
    private final bql<btt> khkhz_2 = this::tzh_6;
    private static final int dsk_2 = -2120891609;
    private static final int ththsh = 245565919;
    private static final int dda_2 = 494248182;
    private static final int dhshl = -885394963;
    private static final int brtwzes3ri4iw = 1245230344;
    private static final int lyt4mo9ioxmuu = 1883716509;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int nf2f1039;

    @Override
    public void nt() {
        int n = -1437922583;
        n = Integer.rotateLeft(n * -928088795, 27) ^ 0x96DE12B;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
        int n2 = n ^ 0x8803AF93;
        if ((n2 ^ n) != -2013024365) {
            int cfr_ignored_0 = (0x2248A57A ^ n) - 1283990311;
        }
        this.dwdh = 0;
        this.ttj = 0;
    }

    @Override
    public void nc() {
        int n = 1693145075;
        n = Integer.rotateLeft(n * -474446189, 20) ^ 0x8810DC12;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
        int n2 = n ^ 0x1136AE9C;
        if ((n2 ^ n) != 288796316) {
            int cfr_ignored_0 = (0x75DDF96F ^ n) - 1271083585;
        }
        this.dwdh = 0;
        this.ttj = 0;
    }

    private void khta_4() {
        class_3966 class_39662;
        class_239 class_2392;
        if (trdh.mc.field_1724 == null || trdh.mc.field_1687 == null || trdh.mc.field_1761 == null) {
            return;
        }
        if (this.khzth_2.shzl()) {
            this.szdh_4();
        }
        if ((class_2392 = trdh.mc.field_1765) instanceof class_3966 && (class_2392 = (class_39662 = (class_3966)class_2392).method_17782()) instanceof class_1511) {
            class_1511 class_15112 = (class_1511)class_2392;
            if (class_15112.method_31481() || !class_15112.method_5805()) {
                return;
            }
            if ((float)this.dwdh >= this.khhf.hkj()) {
                trdh.mc.field_1761.method_2918((class_1657)trdh.mc.field_1724, (class_1297)class_15112);
                trdh.mc.field_1724.method_6104(class_1268.field_5808);
                this.dwdh = 0;
                return;
            }
            ++this.dwdh;
        } else {
            this.dwdh = 0;
        }
    }

    private void szdh_4() {
        class_1297 class_129722;
        Object object = trdh.mc.field_1765;
        if (!(object instanceof class_3965)) {
            this.ttj = 0;
            return;
        }
        class_3965 class_39652 = (class_3965)object;
        if (trdh.mc.field_1687.method_8320(class_39652.method_17777()).method_26204() != class_2246.field_10540) {
            this.ttj = 0;
            return;
        }
        for (class_1297 class_129722 : trdh.mc.field_1687.method_18112()) {
            class_1511 class_15112;
            if (!(class_129722 instanceof class_1511) || !(class_15112 = (class_1511)class_129722).method_24515().method_10074().equals((Object)class_39652.method_17777())) continue;
            this.ttj = 0;
            return;
        }
        if (trdh.mc.field_1724.method_6047().method_7909() != class_1802.field_8301) {
            this.ttj = 0;
            return;
        }
        object = class_39652.method_17780();
        class_129722 = new class_3965(class_39652.method_17784(), (class_2350)object, class_39652.method_17777(), true);
        if ((float)this.ttj >= this.dzk.hkj()) {
            trdh.mc.field_1761.method_2896(trdh.mc.field_1724, class_1268.field_5808, (class_3965)class_129722);
            trdh.mc.field_1724.method_6104(class_1268.field_5808);
            this.ttj = 0;
            return;
        }
        ++this.ttj;
    }

    @Generated
    public static trdh zkht_2() {
        block0: {
            int n = wd_2.jqz_2(13715664);
            int n2 = n ^ 0x8E7E120F;
            if ((n2 ^ n) == -1904340465) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8EAF5ADF ^ n, 4) - 1268359228) * -1901110561;
        }
        return jshsh;
    }

    private void tzh_6(btt btt2) {
        int n = -381121352;
        n = Integer.rotateLeft(n * -1338819209, 17) ^ 0xFDC51BC0;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0x6482142A;
        if ((n2 ^ n) != 1686246442) {
            int cfr_ignored_0 = (0x8DCA9892 ^ n) + -1261992977;
        }
        this.khta_4();
    }

    private static String tan_2(String string, int n, int n2, int n3) {
        int n4 = -889227289;
        n4 = Integer.rotateLeft(n4 * 2046546499, 8) ^ 0xA3B1516F;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 5);
        int n5 = n4 ^ 0xCD1C1866;
        if ((n5 ^ n4) != -853796762) {
            int cfr_ignored_0 = (0x7E36F81 ^ n4) + -195166289;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x4616B322) + dsk_2 ^ Integer.reverse(n2 + i * -1248726917), 18) - ththsh);
        }
        return new String(cArray);
    }

    private static String[] thms_2(String string) {
        block0: {
            int n = -451399914;
            n = Integer.rotateLeft(n * 1307241913, 18) ^ 0xCD3E2BA8;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x38236C72;
            if ((n2 ^ n) == 941845618) break block0;
            int cfr_ignored_0 = (0xDD3B4364 ^ n) + -1698782198;
        }
        return string.split("\u0006\u000e", -1);
    }

    private static CallSite hhz_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1373369232;
            n3 = Integer.rotateLeft(n3 * -1797505573, 11) ^ 0xEBFAED99;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x9B09C58E;
            if ((n4 ^ n3) != -1693858418) {
                int cfr_ignored_0 = (0xCAD2361E ^ n3) + 854444626;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dda_2 ^ string.hashCode() ^ n2 + dhshl + i * -605828841) + dda_2) ^ dhshl));
            }
            String[] stringArray = trdh.thms_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] vtpm20vpj6qvr5(String string) {
        return string.split("\u0005\u001b", -1);
    }

    private static CallSite wakywz5v1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ brtwzes3ri4iw ^ string.hashCode() ^ n2 + lyt4mo9ioxmuu + i * 553395531) + brtwzes3ri4iw) ^ lyt4mo9ioxmuu));
            }
            String[] stringArray = trdh.vtpm20vpj6qvr5(new String(cArray));
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

