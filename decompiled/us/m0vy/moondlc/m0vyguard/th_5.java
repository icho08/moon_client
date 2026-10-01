/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;

public class th_5 {
    private final float hq_2;
    private final trd tthh_2;
    private String thtd_4 = "";
    private String tjj = "";
    private final fa_2 bza_3;
    private boolean shhth_2;
    private float tdhs_2;
    private float bmk;
    private static final int z4jepu1wex5 = 437974537;
    private static final int r46f1tlo = -3036477;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s1s3ycmeat9u;

    public th_5(trd trd2, float f, long l, jkh jkh2) {
        this.tthh_2 = trd2;
        this.hq_2 = f;
        this.bza_3 = new fa_2(l, jkh2);
    }

    public void rqj(float f, float f2) {
        this.tdhs_2 = f;
        this.bmk = f2;
    }

    public void khdhgh(bzth bzth2) {
        this.bza_3.khmf(1.0f);
        float f = this.bza_3.tssh_2();
        byq byq2 = bhj_2.bzs();
        if (this.shhth_2) {
            bzth2.drawCenteredText(this.tthh_2, this.tjj, this.tdhs_2, this.bmk, byq2.thzz_4(f));
        } else {
            bzth2.drawText(this.tthh_2, this.tjj, this.tdhs_2, this.bmk, byq2.thzz_4(f));
        }
    }

    public th_5 bkhz_2() {
        this.shhth_2 = true;
        return this;
    }

    public void zws_4(String string) {
        if (this.tjj.equals(string)) {
            return;
        }
        this.thtd_4 = this.tjj;
        this.tjj = string;
        this.bza_3.atth_2(0.0f);
    }

    public trd rhgh_2() {
        return this.tthh_2;
    }

    private static String[] bngtl1wsa00(String string) {
        return string.split("\u0006\u0014", -1);
    }

    private static CallSite ckhiq9ipg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ z4jepu1wex5 ^ string.hashCode() ^ n2 + r46f1tlo ^ i * 741304545 ^ z4jepu1wex5, 6) ^ r46f1tlo));
            }
            String[] stringArray = th_5.bngtl1wsa00(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

