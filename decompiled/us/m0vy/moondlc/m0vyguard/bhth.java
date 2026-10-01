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
import us.m0vy.moondlc.m0vyguard.bzs_3;
import us.m0vy.moondlc.m0vyguard.bwb;
import us.m0vy.moondlc.m0vyguard.tshdh;

public class bhth {
    private final bwb shkm;
    private long hkhj;
    private int shsn_2 = 0;
    private boolean dhsdh = true;
    private boolean hdkh_2 = false;
    private boolean dhsht_2 = false;
    private static final int fmxbbljwrf = -961717144;
    private static final int rgagdl3 = -1080275962;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int qpo7z3rp5kvg9;

    public bhth(class_2960 class_29602) {
        this.shkm = bzs_3.rkhd(class_29602);
        if (this.shkm == null) {
            throw new RuntimeException("Animation not found in atlas: " + String.valueOf(class_29602));
        }
        this.hkhj = System.currentTimeMillis();
    }

    public static bhth khjd_2(class_2960 class_29602) {
        bwb bwb2 = bzs_3.rkhd(class_29602);
        if (bwb2 == null) {
            return null;
        }
        return new bhth(class_29602);
    }

    public void tzth() {
        this.shsn_2 = 0;
        this.dhsdh = true;
        this.hdkh_2 = false;
        this.dhsht_2 = true;
        this.hkhj = System.currentTimeMillis();
    }

    public tshdh sfz_2() {
        if (!this.dhsdh || this.hdkh_2) {
            return this.shkm.af(this.shsn_2);
        }
        this.ah();
        return this.shkm.af(this.shsn_2);
    }

    public void ah() {
        long l;
        if (!this.dhsdh || this.hdkh_2) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.hkhj >= (l = this.shkm.yj().dht_8())) {
            this.tla();
            this.hkhj = l2;
        }
    }

    private void tla() {
        ++this.shsn_2;
        if (this.shsn_2 >= this.shkm.ghdhk()) {
            if (this.dhsht_2) {
                this.shsn_2 = this.shkm.ghdhk() - 1;
                this.hdkh_2 = true;
                this.dhsht_2 = false;
            } else if (this.shkm.yj().tqy_2()) {
                this.shsn_2 = 0;
            } else {
                this.shsn_2 = this.shkm.ghdhk() - 1;
                this.hdkh_2 = true;
            }
        }
    }

    public void tnh_2() {
        this.dhsdh = true;
        this.hdkh_2 = false;
        this.dhsht_2 = false;
    }

    public void khjs() {
        this.dhsdh = false;
    }

    public void ghzs_4() {
        this.dhsdh = false;
        this.shsn_2 = 0;
        this.hdkh_2 = false;
        this.dhsht_2 = false;
        this.hkhj = System.currentTimeMillis();
    }

    @Generated
    public bwb shma() {
        return this.shkm;
    }

    @Generated
    public long shhm_2() {
        return this.hkhj;
    }

    @Generated
    public int ghbs_2() {
        return this.shsn_2;
    }

    @Generated
    public boolean sws_3() {
        return this.dhsdh;
    }

    @Generated
    public boolean nn() {
        return this.hdkh_2;
    }

    @Generated
    public boolean jtf_2() {
        return this.dhsht_2;
    }

    private static String[] buitqwlayj(String string) {
        return string.split("\u0006\u0018", -1);
    }

    private static CallSite umpbc90m(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ fmxbbljwrf ^ string.hashCode()) + (n2 + rgagdl3) + i ^ fmxbbljwrf, 8) + rgagdl3);
            }
            String[] stringArray = bhth.buitqwlayj(new String(cArray));
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

