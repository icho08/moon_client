/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_290
 *  net.minecraft.class_3532
 *  net.minecraft.class_437
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import net.minecraft.class_290;
import net.minecraft.class_3532;
import net.minecraft.class_437;
import us.m0vy.moondlc.m0vyguard.bjdh;
import us.m0vy.moondlc.m0vyguard.bja_2;
import us.m0vy.moondlc.m0vyguard.bhm;
import us.m0vy.moondlc.m0vyguard.bhh_2;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bth_4;
import us.m0vy.moondlc.m0vyguard.bay_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthdh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tjd_2;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.tra;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.khw;
import us.m0vy.moondlc.m0vyguard.zw;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.nt_3;

public class baa_2
extends nt_3
implements tthy {
    public static baa_2 dhrh;
    private final HashMap hdh = new HashMap();
    private final List thfw = new ArrayList();
    private final trd thsn;
    private String dhtk = "";
    private String bshth = "";
    private final fa_2 stha_2 = new fa_2(300L, 0.0f, jkh.dzb);
    private boolean thm;
    private final fa_2 ft = new fa_2(300L, 0.0f, jkh.hd_2);
    private int khthq;
    private bhh_2 thdd_2;
    private float bdt_4 = 0.0f;
    private float thaq = 0.0f;
    private int dhal_2 = -1;
    private long rqa = 0L;
    private int blz_2 = 0;
    private final tkhd_2 khzs_4 = new tkhd_2();
    private String tyj = "";
    private String dshh = "";
    private Map rdhw = new HashMap();
    private String bhkh = "";
    private float khyf;
    private final tkhd_2 jmb = new tkhd_2();
    private float zkh_2 = 1.0f;
    private byq jmy = byq.brz_2;
    private static final int vtlaa1htf5q = -1508665095;
    private static final int zty42sg18ml = -185649000;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int e1uwx2ggi;

    public baa_2(trd trd2) {
        this.thsn = trd2;
    }

    public String dwq() {
        return this.bshth;
    }

    @Override
    protected void bws_2(bzth bzth2) {
        Object object2;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = this.zqkh / 2.0f - this.thsn.thssh_2() / 2.0f;
        float f5 = this.thsn.thssh_2() / 8.0f;
        this.thfw.removeIf(baa_2::dhwgh);
        this.stha_2.ddt_6(this.thm);
        if (this.thdd_2 != null && this.thdd_2.shjz_2() == this.thdd_2.dhdq()) {
            this.thdd_2 = null;
        }
        if (this.dhal_2 != -1) {
            this.khzs_4.zat();
            int n = -1;
            float f6 = 0.0f;
            for (Object object2 : this.thfw) {
                String string = String.valueOf(((bjdh)object2).bhs);
                if ((float)bzth2.getMouseX() < this.sdht_2 + this.khyf + f6 + this.thsn.dak(string) + this.thsn.dak(string) / 2.0f) {
                    n = this.thfw.indexOf(object2);
                    break;
                }
                f6 += this.thsn.dak(string);
            }
            if (n == -1) {
                n = this.thfw.size();
            }
            if (n != this.dhal_2) {
                this.thdd_2 = new bhh_2(n > this.dhal_2, Math.min(this.dhal_2, n), Math.max(this.dhal_2, n));
                this.khthq = n;
            } else {
                if (this.thdd_2 != null) {
                    this.khthq = this.thdd_2.shjz_2();
                }
                this.thdd_2 = null;
            }
        }
        if (this.rhb(bzth2)) {
            zw.hdhth(bay_2.shsdh);
        }
        this.stsh();
        bhm.dar_2(bzth2.getContext(), this.sdht_2, this.shat_2, this.zshl, this.zqkh);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)this.zkh_2);
        bzth2.drawRect(this.sdht_2 + this.khyf + f4 + this.bdt_4, this.shat_2 + f4 - 1.0f, this.thaq - this.bdt_4, this.thsn.thssh_2() + 2.0f, byq.hzq_2.dkhw_2(new byq(76.0f, 99.0f, 122.0f), 0.7f).tkhl_2(255.0f * this.stha_2.tssh_2() * this.zkh_2));
        this.bdt_4 = 0.0f;
        this.thaq = 0.0f;
        bja_2 bja2 = new bja_2(class_290.field_1575, this.thsn.dma());
        if (this.thfw.isEmpty()) {
            bzth2.drawText(this.thsn, this.tyj, this.sdht_2 + f + f4, this.shat_2 + f4 - 2.0f * this.stha_2.tssh_2(), this.jmy.thzz_4(0.75f * (1.0f - this.stha_2.tssh_2()) * this.zkh_2));
        }
        if (!this.bhkh.isEmpty() && this.bhkh.toLowerCase().startsWith(this.bshth.toLowerCase()) && !this.bshth.isEmpty()) {
            bzth2.drawText(this.thsn, this.bshth + this.bhkh.substring(this.bshth.length()), this.sdht_2 + f + f4, this.shat_2 + f4, this.jmy.tkhl_2(150.0f * this.stha_2.tssh_2() * this.zkh_2));
        }
        for (Object object3 : this.thfw) {
            object2 = String.valueOf(((bjdh)object3).bhs);
            ((bjdh)object3).hna.zkhdh(200L);
            ((bjdh)object3).hna.ddt_6(!((bjdh)object3).jqd);
            bzth2.drawText(this.thsn, (String)object2, this.sdht_2 + f + f4 + this.khyf, this.shat_2 + f4 + 2.0f - 2.0f * ((bjdh)object3).hna.tssh_2(), this.jmy.tkhl_2(255.0f * ((bjdh)object3).hna.tssh_2() * this.zkh_2));
            f += this.thsn.dak((String)object2) * ((bjdh)object3).hna.tssh_2();
            f2 += this.thsn.dak((String)object2);
            if (this.thfw.indexOf(object3) == this.khthq - 1) {
                f3 = f2;
            }
            if (this.thdd_2 == null) continue;
            if (this.thfw.indexOf(object3) == this.thdd_2.shjz_2() - 1) {
                this.bdt_4 = f2;
            }
            if (this.thfw.indexOf(object3) != this.thdd_2.dhdq() - 1) continue;
            this.thaq = f2;
        }
        ((tjd_2)bja2).jbn();
        f3 += this.khthq == this.thfw.size() ? 1.0f : 0.0f;
        if (this.jmb.tagh(10L)) {
            for (Object object3 : this.thfw) {
                object2 = String.valueOf(((bjdh)object3).bhs);
                if (f3 + f4 + this.khyf > this.zshl - 5.0f) {
                    this.khyf -= this.thsn.dak((String)object2);
                    this.jmb.zat();
                    break;
                }
                if (!(f3 + f4 + this.khyf < 5.0f)) continue;
                this.khyf += this.thsn.dak((String)object2);
                this.jmb.zat();
                break;
            }
            if (this.thsn.dak(this.bshth) < this.zshl - 10.0f) {
                this.khyf = 0.0f;
            }
        }
        this.ft.dam_2(jkh.tdth);
        this.ft.khmf(f3);
        shk_3.sj(bzth2.getContext(), this.sdht_2 + f4 + this.khyf + this.ft.tssh_2() + f5 / 2.0f, this.shat_2 + f4 - 1.0f, class_3532.method_15363((float)(f3 - this.ft.tssh_2()), (float)-20.0f, (float)20.0f));
        bzth2.drawRect(this.sdht_2 + f4 + this.ft.tssh_2() + this.khyf, this.shat_2 + f4 - 1.0f, f5, this.thsn.thssh_2() + 2.0f, this.jmy.tkhl_2((float)((double)(200.0f * this.stha_2.tssh_2() * this.zkh_2) * (!this.khzs_4.tagh(300L) ? 3.0 : tra.dagh_2((double)System.currentTimeMillis() / 200.0) + 2.0) / 3.0)));
        shk_3.hbj(bzth2.getContext());
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bhm.sdhsh_2();
    }

    @Override
    public void dh_4(double d, double d2, tthdh tthdh2) {
        if (this.shrh(d, d2)) {
            if (tthdh2 == tthdh.tdha_2) {
                long l = System.currentTimeMillis();
                this.blz_2 = l - this.rqa < 500L ? ++this.blz_2 : 1;
                this.rqa = l;
                this.thm = true;
                float f = 0.0f;
                int n = this.thfw.size();
                for (bjdh bjdh2 : this.thfw) {
                    String string = String.valueOf(bjdh2.bhs);
                    if (d < (double)(this.sdht_2 + this.khyf + f + this.thsn.dak(string) + this.thsn.dak(string) / 2.0f)) {
                        n = this.thfw.indexOf(bjdh2);
                        break;
                    }
                    f += this.thsn.dak(string);
                }
                this.khthq = n;
                if (this.blz_2 == 2) {
                    this.dhjs_2();
                    this.dhal_2 = -1;
                } else {
                    this.thdd_2 = null;
                    this.dhal_2 = this.khthq;
                }
            }
        } else {
            this.thm = false;
        }
    }

    @Override
    public void tbkh(double d, double d2, tthdh tthdh2) {
        this.dhal_2 = -1;
    }

    @Override
    public void bry(int n, int n2, int n3) {
        if (this.thm) {
            if ((n == 259 || n == 261) && this.thdd_2 != null) {
                this.khhkh_2();
                khw.thzgh_2.play(0.3f, 1.2f);
                this.hby(0);
            } else if (n == 259 && this.khthq > 0) {
                int n4 = class_437.method_25441() ? Math.max(1, this.aaa_3(false)) : 1;
                for (int i = 0; i < n4; ++i) {
                    this.hby(-1);
                    bjdh bjdh2 = null;
                    for (bjdh bjdh3 : this.thfw) {
                        if (!bjdh3.jqd) {
                            bjdh2 = bjdh3;
                        }
                        if (this.thfw.indexOf(bjdh3) != this.khthq) continue;
                        break;
                    }
                    if (bjdh2 == null) continue;
                    bjdh2.jqd = true;
                }
                khw.thzgh_2.play(0.3f, 1.2f);
            } else if (n == 261 && this.khthq < this.thfw.size()) {
                int n5 = class_437.method_25441() ? Math.max(1, this.aaa_3(true)) : 1;
                block2: for (int i = 0; i < n5 && this.khthq < this.thfw.size(); ++i) {
                    for (int j = this.khthq; j < this.thfw.size(); ++j) {
                        bjdh bjdh4 = (bjdh)this.thfw.get(j);
                        if (bjdh4.jqd) continue;
                        bjdh4.jqd = true;
                        continue block2;
                    }
                }
                this.hby(0);
                khw.thzgh_2.play(0.3f, 1.2f);
            } else if (n == 263) {
                int n6;
                khw.thzgh_2.play(0.3f, 1.3f);
                int n7 = n6 = class_437.method_25441() ? Math.max(1, this.aaa_3(false)) : 1;
                if (class_437.method_25442()) {
                    this.dhz_9(-n6);
                } else if (this.thdd_2 != null) {
                    this.khthq = this.thdd_2.shjz_2();
                    this.thdd_2 = null;
                    return;
                }
                this.hby(-n6);
            } else if (n == 262) {
                int n8;
                khw.thzgh_2.play(0.3f, 1.3f);
                int n9 = n8 = class_437.method_25441() ? Math.max(1, this.aaa_3(true)) : 1;
                if (class_437.method_25442()) {
                    this.dhz_9(n8);
                } else if (this.thdd_2 != null) {
                    this.khthq = this.thdd_2.dhdq();
                    this.thdd_2 = null;
                    return;
                }
                this.hby(n8);
            } else if (class_437.method_25439((int)n)) {
                this.thdd_2 = new bhh_2(true, 0, this.thfw.size());
            } else if (class_437.method_25438((int)n)) {
                if (this.thdd_2 != null) {
                    baa_2.mc.field_1774.method_1455(this.dhdhd_2());
                    return;
                }
                baa_2.mc.field_1774.method_1455(this.bshth);
            } else if (class_437.method_25436((int)n)) {
                if (this.thdd_2 != null) {
                    baa_2.mc.field_1774.method_1455(this.dhdhd_2());
                    this.khhkh_2();
                    this.hby(0);
                    return;
                }
                baa_2.mc.field_1774.method_1455(this.bshth);
                for (bjdh bjdh5 : this.thfw) {
                    bjdh5.jqd = true;
                }
                this.bshth = "";
            } else if (class_437.method_25437((int)n)) {
                this.khddh_2(baa_2.mc.field_1774.method_1460());
            } else if (n != 258 && n != 257) {
                if (n == 259 && this.thfw.isEmpty()) {
                    this.thm = false;
                }
            } else {
                for (Map.Entry entry : this.rdhw.entrySet()) {
                    if (!((String)entry.getKey()).toLowerCase().startsWith(this.bshth.toLowerCase()) || this.bshth.isEmpty() || entry.getValue() == null) continue;
                    this.ghthd();
                    if (n == 257) {
                        ((bth_4)entry.getValue()).dtht_3().run();
                    } else {
                        ((bth_4)entry.getValue()).zth().run();
                    }
                    this.thm = false;
                    return;
                }
                if (n == 257) {
                    this.thm = false;
                }
            }
        }
    }

    @Override
    public boolean thtt_3(char c, int n) {
        if (!this.thm) {
            return false;
        }
        if (c == ' ') {
            khw.thzgh_2.play(0.3f, 0.8f);
        } else {
            if (!this.hdh.containsKey(Character.valueOf(c))) {
                this.hdh.put(Character.valueOf(c), Float.valueOf(tra.hjr(0.8, 1.2)));
            }
            khw.thzgh_2.play(0.3f, ((Float)this.hdh.get(Character.valueOf(c))).floatValue());
        }
        this.jshb(c);
        return true;
    }

    private void stsh() {
        this.dhtk = this.bshth;
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : this.thfw) {
            stringBuilder.append(((bjdh)object).bhs);
        }
        this.bshth = stringBuilder.toString();
        if (!this.dhtk.equals(this.bshth)) {
            this.bhkh = "";
            for (Object object : this.rdhw.keySet()) {
                if (!((String)object).toLowerCase().startsWith(this.bshth.toLowerCase()) || this.bshth.isEmpty()) continue;
                this.bhkh = object;
            }
        }
    }

    public int aaa_3(boolean bl) {
        int n = 0;
        if (bl) {
            for (int i = this.khthq; i < this.thfw.size(); ++i) {
                bjdh bjdh2 = (bjdh)this.thfw.get(i);
                if (!bjdh2.jqd && bjdh2.bhs != ' ') {
                    ++n;
                    continue;
                }
                break;
            }
        } else {
            for (int i = this.khthq - 1; i >= 0; --i) {
                bjdh bjdh3 = (bjdh)this.thfw.get(i);
                if (!bjdh3.jqd && bjdh3.bhs != ' ') {
                    ++n;
                    continue;
                }
                break;
            }
        }
        return n;
    }

    public void khddh_2(String string) {
        if (string == null) {
            return;
        }
        for (char c : string.toCharArray()) {
            this.jshb(c);
        }
    }

    public void jshb(char c) {
        this.khhkh_2();
        this.thfw.add((int)class_3532.method_53062((long)this.khthq, (long)0L, (long)Math.max(0, this.thfw.size())), new bjdh(c));
        this.hby(1);
        dhrh = this;
    }

    private void hby(int n) {
        this.khthq = class_3532.method_15340((int)(this.khthq + n), (int)0, (int)this.thfw.size());
        this.khzs_4.zat();
    }

    public void ghthd() {
        this.thfw.clear();
        this.bshth = "";
    }

    private void dhjs_2() {
        if (!this.thfw.isEmpty()) {
            bjdh bjdh2;
            int n = this.khthq;
            int n2 = this.khthq;
            int n3 = this.khthq - 1;
            while (n3 >= 0) {
                bjdh2 = (bjdh)this.thfw.get(n3);
                if (bjdh2.jqd || bjdh2.bhs == ' ' || !Character.isLetterOrDigit(bjdh2.bhs)) break;
                n = n3--;
            }
            for (n3 = this.khthq; n3 < this.thfw.size(); ++n3) {
                bjdh2 = (bjdh)this.thfw.get(n3);
                if (bjdh2.jqd || bjdh2.bhs == ' ' || !Character.isLetterOrDigit(bjdh2.bhs)) break;
                n2 = n3 + 1;
            }
            if (n != n2) {
                this.thdd_2 = new bhh_2(true, n, n2);
                this.khthq = n2;
            }
        }
    }

    private void khhkh_2() {
        if (this.thdd_2 != null) {
            for (bjdh bjdh2 : this.sshz_3()) {
                bjdh2.jqd = true;
            }
            this.khthq = this.thdd_2.shjz_2();
            this.thdd_2 = null;
        }
    }

    private List sshz_3() {
        ArrayList<bjdh> arrayList = new ArrayList<bjdh>();
        boolean bl = false;
        for (bjdh bjdh2 : this.thfw) {
            if (this.thfw.indexOf(bjdh2) == this.thdd_2.shjz_2()) {
                bl = true;
            }
            if (this.thfw.indexOf(bjdh2) == this.thdd_2.dhdq()) {
                bl = false;
            }
            if (!bl) continue;
            arrayList.add(bjdh2);
        }
        return arrayList;
    }

    private String dhdhd_2() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        for (bjdh bjdh2 : this.thfw) {
            if (this.thfw.indexOf(bjdh2) == this.thdd_2.shjz_2()) {
                bl = true;
            }
            if (this.thfw.indexOf(bjdh2) == this.thdd_2.dhdq()) {
                bl = false;
            }
            if (!bl) continue;
            stringBuilder.append(bjdh2.bhs);
        }
        return stringBuilder.toString();
    }

    private void dhz_9(int n) {
        if (this.thdd_2 == null) {
            this.thdd_2 = new bhh_2(n > 0, this.khthq, this.khthq);
        }
        if (!this.thdd_2.szw) {
            this.thdd_2.zjh = class_3532.method_15340((int)(this.thdd_2.shjz_2() + n), (int)0, (int)this.thfw.size());
        } else {
            this.thdd_2.bzf_2 = class_3532.method_15340((int)(this.thdd_2.dhdq() + n), (int)0, (int)this.thfw.size());
        }
    }

    @Generated
    public boolean zqr_2() {
        return this.thm;
    }

    @Generated
    public void dby(boolean bl) {
        this.thm = bl;
    }

    @Generated
    public String tsj_4() {
        return this.tyj;
    }

    @Generated
    public void rja(String string) {
        this.tyj = string;
    }

    @Generated
    public String twk() {
        return this.dshh;
    }

    @Generated
    public void shgh_2(String string) {
        this.dshh = string;
    }

    @Generated
    public void dthd(Map map) {
        this.rdhw = map;
    }

    @Generated
    public String tlf() {
        return this.bhkh;
    }

    @Generated
    public void dzh_8(float f) {
        this.zkh_2 = f;
    }

    @Generated
    public byq akht() {
        return this.jmy;
    }

    @Generated
    public void bsz(byq byq2) {
        this.jmy = byq2;
    }

    private static boolean dhwgh(bjdh bjdh2) {
        return bjdh2.hna.tssh_2() == 0.0f && bjdh2.jqd;
    }

    private static String[] p2bv4d2e8dg2(String string) {
        return string.split("\u0003\u001a", -1);
    }

    private static CallSite uvc33vy52wh1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ vtlaa1htf5q ^ string.hashCode() ^ n2 + zty42sg18ml ^ i * 1712463269 ^ vtlaa1htf5q, 24) ^ zty42sg18ml));
            }
            String[] stringArray = baa_2.p2bv4d2e8dg2(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

