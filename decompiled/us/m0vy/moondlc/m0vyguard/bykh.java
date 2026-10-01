/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bnr;
import us.m0vy.moondlc.m0vyguard.tth_2;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.ka;
import us.m0vy.moondlc.m0vyguard.yd;

public class bykh {
    private final ka dhghd_2;
    private final tkhd_2 hqs;
    private int zlth = 0;
    private boolean drkh = true;
    private boolean tdn_2 = false;
    private boolean thsgh = false;
    private static final int cz8tf5wkd2 = 248850480;
    private static final int v4ivx6mc2onr9 = -1885694582;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int iyszjbzrs4w;

    public bykh(class_2960 class_29602) {
        if (!class_29602.method_12832().startsWith("textures/")) {
            class_29602 = class_2960.method_60655((String)class_29602.method_12836(), (String)("textures/" + class_29602.method_12832()));
        }
        this.dhghd_2 = bnr.hn(class_29602);
        if (this.dhghd_2 == null) {
            throw new RuntimeException("Animation not found in global atlas: " + String.valueOf(class_29602));
        }
        this.hqs = new tkhd_2();
    }

    public void dkn() {
        this.zlth = 0;
        this.drkh = true;
        this.tdn_2 = false;
        this.thsgh = true;
        this.hqs.zat();
    }

    public tth_2 hmz() {
        if (this.drkh && !this.tdn_2) {
            this.dhdh();
            return this.dhghd_2.hds_3(this.zlth);
        }
        return this.dhghd_2.hds_3(this.zlth);
    }

    public void dhdh() {
        long l;
        if (this.drkh && !this.tdn_2 && this.hqs.tagh(l = this.dhghd_2.hhf.djs_2())) {
            this.shh_9();
            this.hqs.zat();
        }
    }

    private void shh_9() {
        ++this.zlth;
        if (this.zlth >= this.dhghd_2.shmm) {
            if (this.thsgh) {
                this.zlth = this.dhghd_2.shmm - 1;
                this.tdn_2 = true;
                this.thsgh = false;
            } else if (this.dhghd_2.hhf.takh_3()) {
                this.zlth = 0;
            } else {
                this.zlth = this.dhghd_2.shmm - 1;
                this.tdn_2 = true;
            }
        }
    }

    public void ghah() {
        this.drkh = true;
        this.tdn_2 = false;
        this.thsgh = false;
    }

    public void tas_6() {
        this.drkh = false;
    }

    public void jla_2() {
        this.drkh = false;
        this.zlth = 0;
        this.tdn_2 = false;
        this.thsgh = false;
        this.hqs.zat();
    }

    public void dst(int n) {
        if (n >= 0 && n < this.dhghd_2.shmm) {
            this.zlth = n;
            this.tdn_2 = false;
        }
    }

    public boolean tla_4() {
        return this.tdn_2;
    }

    public yd hkht_2() {
        return this.dhghd_2.hhf;
    }

    public class_2960 thfa_2() {
        return this.dhghd_2.sthz;
    }

    @Generated
    public int dly_2() {
        return this.zlth;
    }

    @Generated
    public boolean rt() {
        return this.drkh;
    }

    private static String[] r5qs96aakp3q(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite zb8h97j31(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ cz8tf5wkd2 ^ string.hashCode() ^ n2 + v4ivx6mc2onr9 ^ i * 1591060873 ^ cz8tf5wkd2, 24) ^ v4ivx6mc2onr9));
            }
            String[] stringArray = bykh.r5qs96aakp3q(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

