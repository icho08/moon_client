/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bhkh_2;
import us.m0vy.moondlc.m0vyguard.tat_2;
import us.m0vy.moondlc.m0vyguard.thw;
import us.m0vy.moondlc.m0vyguard.tdm;
import us.m0vy.moondlc.m0vyguard.rs;
import us.m0vy.moondlc.m0vyguard.fd;
import us.m0vy.moondlc.m0vyguard.lq;

public class tthw
extends tat_2 {
    private static final tthw dhan_2;
    private final List tnth = new ArrayList();
    private final List jjn = new ArrayList();
    private final fd hzs_3;
    private fd jdht_2 = this.hzs_3 = new fd("Moondlc");
    protected fd skhr_2;
    private final String slq = "Create custom theme...";
    private String khad = "";
    private boolean dhaz;
    private bhkh_2 jlh_2 = new bhkh_2(-1.0f, -1.0f, -1.0f);
    private final bjz shys_2 = new bjz();
    private boolean tth_2;
    private float jwgh;
    private static final int dyzaznp = -817779510;
    private static final int zmysrtknqnv = -1938762623;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tfom3h3m;

    private int sna_3() {
        return (int)(this.shys_2.khbk() * (double)this.jwgh * 255.0);
    }

    public tthw() {
        this.rghh_2(this.dsa_2(95.0f));
        this.sar(this.dsa_2(150.0f));
        rs.tt().jkhh_2(new lq(-1, this::khwkh));
    }

    public void ghkhdh() {
        this.ghsh_3();
    }

    private void ghsh_3() {
        tdm.zkm_2().tthh_4();
    }

    public void thhsh(boolean bl) {
        if (!bl) {
            tdm.zkm_2().tda_2();
        } else if (this.jdht_2 != null) {
            tdm.zkm_2().zwdh(this.jdht_2);
        }
    }

    public void jkw() {
        tdm.zkm_2().tthh_4();
        fd fd2 = tdm.zkm_2().szt();
        String string = fd2 == null ? this.hzs_3.getName() : fd2.getName();
        for (thw thw2 : this.tnth) {
            if (thw2 == null || thw2.ttkh_3() == null || !thw2.ttkh_3().getName().equalsIgnoreCase(string)) continue;
            this.jdht_2 = thw2.ttkh_3();
            return;
        }
        this.jdht_2 = fd2 == null ? this.hzs_3 : fd2;
        this.tnth.add(new thw(this.jdht_2));
    }

    @Generated
    public List ttt_6() {
        return this.tnth;
    }

    @Generated
    public List aghr() {
        return this.jjn;
    }

    @Generated
    public fd aghz() {
        return this.hzs_3;
    }

    @Generated
    public fd stm_3() {
        return this.jdht_2;
    }

    @Generated
    public fd ghsd_2() {
        return this.skhr_2;
    }

    @Generated
    public String bdkh() {
        return this.slq;
    }

    @Generated
    public String zbb() {
        return this.khad;
    }

    @Generated
    public boolean ghm() {
        return this.dhaz;
    }

    @Generated
    public bhkh_2 shzh_2() {
        return this.jlh_2;
    }

    @Generated
    public bjz dhqt_2() {
        return this.shys_2;
    }

    @Generated
    public boolean hmz_2() {
        return this.tth_2;
    }

    @Generated
    public float ghbh() {
        return this.jwgh;
    }

    @Generated
    public static tthw sfs_3() {
        return dhan_2;
    }

    @Generated
    public void ghtz_2(fd fd2) {
        this.jdht_2 = fd2;
    }

    @Generated
    public void bty_2(boolean bl) {
        this.tth_2 = bl;
    }

    @Generated
    public void mm(float f) {
        this.jwgh = f;
    }

    private void khwkh(rs rs2) {
        this.rghh_2(this.dsa_2(95.0f));
    }

    private static String[] ql8pfu2ao69oz7(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite o3fw058cfoz9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dyzaznp ^ string.hashCode()) + (n2 + zmysrtknqnv) + i ^ dyzaznp, 14) + zmysrtknqnv);
            }
            String[] stringArray = tthw.ql8pfu2ao69oz7(new String(cArray));
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

