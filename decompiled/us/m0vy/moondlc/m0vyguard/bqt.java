/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_408
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Locale;
import net.minecraft.class_408;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.thw_3;

public abstract class bqt
extends thw_3 {
    private long thghk;
    private float ha_4;
    private static final int iuhb2mtg3d = 1149368615;
    private static final int ejrkmeqlva53p = 1621575632;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int yjpdtwwwh6xf;

    protected bqt(float f, float f2) {
        super(f, f2);
    }

    @Override
    public boolean shrth() {
        return true;
    }

    @Override
    public String skz() {
        String string = this.getName();
        return string.startsWith("Moondlc ") ? string.substring("Moondlc ".length()) : string;
    }

    protected float awd_2() {
        long l = System.nanoTime();
        if (this.thghk == 0L) {
            this.thghk = l;
            return 0.016666668f;
        }
        long l2 = l - this.thghk;
        this.thghk = l;
        return Math.min(Math.max((float)l2 / 1.0E9f, 0.0f), 0.1f);
    }

    protected float khhs_3(float f, float f2, float f3, float f4) {
        if (!Float.isFinite(f3) || f3 <= 0.0f) {
            return f2;
        }
        float f5 = 1.0f - (float)Math.exp(-f4 * f3);
        return f + (f2 - f) * f5;
    }

    protected float bhh_3(boolean bl, float f) {
        this.ha_4 = this.khhs_3(this.ha_4, bl ? 1.0f : 0.0f, f, 8.0f);
        return this.ha_4;
    }

    protected boolean tdha_2() {
        return this.ha_4 > 0.01f;
    }

    protected boolean tthy() {
        return bqt.mc.field_1755 instanceof class_408;
    }

    protected float zfj_2(float f) {
        return (float)Math.round(f * 2.0f) / 2.0f;
    }

    protected Color zdsh(Color color, float f) {
        return brb.zmn_2(color, Math.max(0, Math.min(255, Math.round((float)color.getAlpha() * f))));
    }

    protected bsh_2 khh() {
        return brz_2.shjh_2;
    }

    protected bsh_2 ghgh() {
        return brz_2.shthm;
    }

    protected bsh_2 ztr() {
        return brz_2.khkhj;
    }

    protected String jzt_2(bsh_2 bsh2, String string, float f, float f2) {
        String string2;
        if (bsh2.shdf_2(string, f) <= f2) {
            return string;
        }
        String string3 = "...";
        float f3 = bsh2.shdf_2(string3, f);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length() && !(bsh2.shdf_2(string2 = String.valueOf(stringBuilder) + String.valueOf(string.charAt(i)), f) + f3 > f2); ++i) {
            stringBuilder.append(string.charAt(i));
        }
        return String.valueOf(stringBuilder) + string3;
    }

    protected String tz_4(double d) {
        return String.format(Locale.US, "%.1f", d);
    }

    protected String btq(int n) {
        if (n < 0) {
            return "**:**";
        }
        int n2 = n / 20;
        int n3 = n2 / 60;
        int n4 = n2 % 60;
        return String.format(Locale.US, "%d:%02d", n3, n4);
    }

    protected String sfh(float f) {
        int n = Math.max(0, (int)f);
        int n2 = n / 60;
        int n3 = n % 60;
        return String.format(Locale.US, "%02d:%02d", n2, n3);
    }

    private static String[] lbelqtpdr(String string) {
        return string.split("\u0006\u000f", -1);
    }

    private static CallSite ea7mud3yjwv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ iuhb2mtg3d ^ string.hashCode() ^ n2 + ejrkmeqlva53p ^ i * -498893803 ^ iuhb2mtg3d, 4) ^ ejrkmeqlva53p));
            }
            String[] stringArray = bqt.lbelqtpdr(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

