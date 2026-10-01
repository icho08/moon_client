/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.bhn_2;
import us.m0vy.moondlc.m0vyguard.tadh;
import us.m0vy.moondlc.m0vyguard.tjq;
import us.m0vy.moondlc.m0vyguard.jz_2;

public class thz {
    private bhn_2 bbt = new bhn_2(250L, bdz.shll);
    private bhn_2 jdq_2 = new bhn_2(250L, bdz.shll);
    private float bshn;
    private float ssh_8;
    private String tzj_2;
    private int khdhl;
    private int hdh_5;
    private int khkhth;
    private int sd;
    private static final int f2wwkg66j9 = 166834929;
    private static final int asj65fh = -225224321;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int xi15bq69;

    public thz(String string, int n, int n2) {
        this.tzj_2 = string;
        this.khdhl = n;
        this.hdh_5 = n2;
        this.khkhth = this.khdhl;
        this.sd = this.hdh_5;
    }

    public void rzh_4(int n, int n2) {
        this.khkhth = n;
        this.sd = n2;
        this.bbt = new bhn_2(250L, bdz.shll);
    }

    public bkt bzy() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.khkhth), new bkt(this.khdhl), f);
    }

    public bkt dzf() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.khkhth), new bkt(this.khdhl), f);
    }

    public bkt snb_2() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.khkhth), new bkt(this.khdhl), f);
    }

    public bkt szr_2() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.khkhth), new bkt(this.khdhl), f);
    }

    public bkt zaw_2() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.khkhth), new bkt(this.khdhl), f);
    }

    public bkt tfh_2() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.khkhth), new bkt(this.khdhl), f);
    }

    public bkt dhwb() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.khkhth), new bkt(this.khdhl), f);
    }

    public bkt dfq() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.khkhth), new bkt(this.khdhl), f);
    }

    public bkt adth_2() {
        float f = this.bbt.hnf();
        return tjq.ttdh_4(new bkt(this.sd), new bkt(this.hdh_5), f);
    }

    public bkt zksh() {
        return new bkt(32, 255, 32, 255);
    }

    public void dhmr(class_4587 class_45872, double d) {
        tadh.dza_6(class_45872, this.bshn - 34.0f, this.ssh_8 + 2.5f, 27.0f, 10.0f, jz_2.all(2.0f), new bkt(this.khdhl).rwh_2((int)d).ghtt_2(0.4f + this.jdq_2.hnf() * 0.7f), new bkt(this.khdhl).rwh_2((int)d).ghtt_2(0.4f + this.jdq_2.hnf() * 0.7f), new bkt(this.hdh_5).rwh_2((int)d).ghtt_2(0.4f + this.jdq_2.hnf() * 0.7f), new bkt(this.hdh_5).rwh_2((int)d).ghtt_2(0.4f + this.jdq_2.hnf() * 0.7f));
    }

    @Generated
    public bhn_2 shan_2() {
        return this.bbt;
    }

    @Generated
    public bhn_2 shrq() {
        return this.jdq_2;
    }

    @Generated
    public float shbd() {
        return this.bshn;
    }

    @Generated
    public float zwy() {
        return this.ssh_8;
    }

    @Generated
    public String getName() {
        return this.tzj_2;
    }

    @Generated
    public int rtd_3() {
        return this.khdhl;
    }

    @Generated
    public int dhdhh() {
        return this.hdh_5;
    }

    @Generated
    public int zdk_4() {
        return this.khkhth;
    }

    @Generated
    public int sthdh_2() {
        return this.sd;
    }

    @Generated
    public void fm(bhn_2 bhn2_2) {
        this.bbt = bhn2_2;
    }

    @Generated
    public void sdsh(bhn_2 bhn2_2) {
        this.jdq_2 = bhn2_2;
    }

    @Generated
    public void dhdd_4(float f) {
        this.bshn = f;
    }

    @Generated
    public void sws_2(float f) {
        this.ssh_8 = f;
    }

    @Generated
    public void dhns_2(String string) {
        this.tzj_2 = string;
    }

    @Generated
    public void jhn(int n) {
        this.khdhl = n;
    }

    @Generated
    public void dhbq(int n) {
        this.hdh_5 = n;
    }

    @Generated
    public void smf_2(int n) {
        this.khkhth = n;
    }

    @Generated
    public void dhdhb(int n) {
        this.sd = n;
    }

    @Generated
    public boolean khzn_2(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof thz)) {
            return false;
        }
        thz thz2 = (thz)object;
        if (!thz2.dzkh_2(this)) {
            return false;
        }
        if (Float.compare(this.shbd(), thz2.shbd()) != 0) {
            return false;
        }
        if (Float.compare(this.zwy(), thz2.zwy()) != 0) {
            return false;
        }
        if (this.rtd_3() != thz2.rtd_3()) {
            return false;
        }
        if (this.dhdhh() != thz2.dhdhh()) {
            return false;
        }
        if (this.zdk_4() != thz2.zdk_4()) {
            return false;
        }
        if (this.sthdh_2() != thz2.sthdh_2()) {
            return false;
        }
        bhn_2 bhn2_2 = this.shan_2();
        bhn_2 bhn3 = thz2.shan_2();
        if (bhn2_2 == null ? bhn3 != null : !bhn2_2.equals(bhn3)) {
            return false;
        }
        Object object2 = this.shrq();
        Object object3 = thz2.shrq();
        if (!(object2 == null ? object3 == null : object2.equals(object3))) {
            return false;
        }
        object2 = this.getName();
        object3 = thz2.getName();
        return !(object2 == null ? object3 != null : !object2.equals(object3));
    }

    @Generated
    protected boolean dzkh_2(Object object) {
        return object instanceof thz;
    }

    @Generated
    public int dyh_3() {
        boolean bl = true;
        int n = 1;
        n = n * 59 + Float.floatToIntBits(this.shbd());
        n = n * 59 + Float.floatToIntBits(this.zwy());
        n = n * 59 + this.rtd_3();
        n = n * 59 + this.dhdhh();
        n = n * 59 + this.zdk_4();
        n = n * 59 + this.sthdh_2();
        bhn_2 bhn2_2 = this.shan_2();
        n = n * 59 + (bhn2_2 == null ? 43 : bhn2_2.hashCode());
        bhn_2 bhn3 = this.shrq();
        n = n * 59 + (bhn3 == null ? 43 : bhn3.hashCode());
        String string = this.getName();
        n = n * 59 + (string == null ? 43 : string.hashCode());
        return n;
    }

    @Generated
    public String rdhkh() {
        String string = String.valueOf(this.shan_2());
        return "Theme(animation=" + string + ", checkAnimation=" + String.valueOf(this.shrq()) + ", x=" + this.shbd() + ", y=" + this.zwy() + ", name=" + this.getName() + ", color1=" + this.rtd_3() + ", color2=" + this.dhdhh() + ", fromColor1=" + this.zdk_4() + ", fromColor2=" + this.sthdh_2() + ")";
    }

    private static String[] ooxuhxxdod(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite e0zfrxx4lnzw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ f2wwkg66j9 ^ string.hashCode() ^ n2 + asj65fh ^ i * 968682735 ^ f2wwkg66j9, 10) ^ asj65fh));
            }
            String[] stringArray = thz.ooxuhxxdod(new String(cArray));
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

