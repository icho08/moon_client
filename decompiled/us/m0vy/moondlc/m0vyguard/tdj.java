/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bdn;

public class tdj
extends bdn {
    private final float ddsh;
    private final float khkd_2;
    private final float dash;
    private final String ssq;
    private float thzf_2;
    private static final int w2jkckwgx = -653592165;
    private static final int nxy8me5rf8pzf = -658403432;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int a6j1m78gxfawn6;

    public tdj(String string, float f, float f2, float f3, float f4, String string2) {
        super(string, Float.valueOf(class_3532.method_15363((float)f4, (float)f, (float)f2)));
        this.ddsh = f;
        this.khkd_2 = f2;
        this.dash = Math.max(0.001f, f3);
        this.ssq = string2 != null ? string2 : "%.1f";
        this.thzf_2 = this.dshj_2();
    }

    public float dtht() {
        return this.ddsh;
    }

    public float tdj_2() {
        return this.khkd_2;
    }

    public float zmt_4() {
        return this.dash;
    }

    public String khq() {
        return this.ssq;
    }

    public void khtsh(float f) {
        float f2 = this.ddsh + (this.khkd_2 - this.ddsh) * class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        float f3 = (float)Math.round((f2 - this.ddsh) / this.dash) * this.dash + this.ddsh;
        this.ttn_4(Float.valueOf(class_3532.method_15363((float)f3, (float)this.ddsh, (float)this.khkd_2)));
    }

    public float dshj_2() {
        if (this.khkd_2 <= this.ddsh) {
            return 0.0f;
        }
        return class_3532.method_15363((float)((((Float)this.tyl).floatValue() - this.ddsh) / (this.khkd_2 - this.ddsh)), (float)0.0f, (float)1.0f);
    }

    public float shykh(float f) {
        float f2 = this.dshj_2();
        this.thzf_2 += (f2 - this.thzf_2) * class_3532.method_15363((float)(f * 16.0f), (float)0.05f, (float)1.0f);
        if (Math.abs(f2 - this.thzf_2) < 0.001f) {
            this.thzf_2 = f2;
        }
        return this.thzf_2;
    }

    public String smw() {
        return String.format(this.ssq, this.tyl);
    }

    @Override
    public String ttj() {
        return String.valueOf(this.tyl);
    }

    @Override
    public void tnz(String string) {
        if (string != null) {
            try {
                float f = Float.parseFloat(string.trim());
                this.ttn_4(Float.valueOf(class_3532.method_15363((float)f, (float)this.ddsh, (float)this.khkd_2)));
                this.thzf_2 = this.dshj_2();
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
    }

    private static String[] d9i31xoweu(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite figdvukwc6b6n(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ w2jkckwgx ^ string.hashCode() ^ n2 + nxy8me5rf8pzf ^ i * -189929513 ^ w2jkckwgx, 19) ^ nxy8me5rf8pzf));
            }
            String[] stringArray = tdj.d9i31xoweu(new String(cArray));
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

