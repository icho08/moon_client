/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bdn;

public class shdh_5
extends bdn {
    private static final int jpq1vmlpr = -1987802415;
    private static final int rfbk8jzh = 1016629281;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zfvhbinwp0kqsx;

    public shdh_5(String string, boolean bl) {
        super(string, bl);
    }

    public boolean dhdhq() {
        return Boolean.TRUE.equals(this.tyl);
    }

    public void khdht_2() {
        this.ttn_4(!this.dhdhq());
    }

    public void ashl(boolean bl) {
        this.ttn_4(bl);
    }

    @Override
    public String ttj() {
        return String.valueOf(this.tyl);
    }

    @Override
    public void tnz(String string) {
        if (string != null) {
            this.ttn_4(Boolean.parseBoolean(string.trim()));
        }
    }

    private static String[] bank22v1so4(String string) {
        return string.split("\u0007\u0019", -1);
    }

    private static CallSite ptwj68qs17ghmz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jpq1vmlpr ^ string.hashCode() ^ n2 + rfbk8jzh + i * 641939389) + jpq1vmlpr) ^ rfbk8jzh));
            }
            String[] stringArray = shdh_5.bank22v1so4(new String(cArray));
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

