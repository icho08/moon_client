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
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bdhf;
import us.m0vy.moondlc.m0vyguard.byq;

public final class tthn
extends Enum
implements bdhf {
    public static final /* enum */ tthn jthj;
    public static final /* enum */ tthn bzz_4;
    private byq dhyk;
    private byq sbl_2;
    private byq dwf;
    private byq zdhh_2;
    private byq shlw;
    private byq rshkh = new byq(151.0f, 71.0f, 255.0f);
    private byq shaw_2 = byq.brz_2;
    private byq khqsh = byq.brz_2;
    private final boolean hsj_2 = true;
    private final float rsj = 4.0f;
    private final float jhs = 20.0f;
    private final float shkgh = 80.0f;
    private final float jsdh = 2.0f;
    private final float ry = 7.0f;
    private final float rah_3 = 0.5f;
    private final float tyth = 0.8f;
    private final float thdkh = 0.2f;
    private final float dzz_4 = 25.0f;
    private final float khfk = 0.08f;
    private final float rth_5 = 2.0f;
    private final float hss_3 = 1.0f;
    private final float tdha = 1.0f;
    private static final tthn[] jshth;
    private static final int be28l3j1 = -1729753108;
    private static final int olsozilxfmg = -1139096727;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static tthn[] values() {
        return (tthn[])jshth.clone();
    }

    public static tthn valueOf(String string) {
        return Enum.valueOf(tthn.class, string);
    }

    @Override
    @Generated
    public byq getTextColor() {
        return this.dhyk;
    }

    public void setTextColor(byq byq2) {
        this.dhyk = byq2;
    }

    @Override
    @Generated
    public byq getBackgroundColor() {
        return this.sbl_2;
    }

    public void setBackgroundColor(byq byq2) {
        this.sbl_2 = byq2;
    }

    @Override
    @Generated
    public byq getAdditionalColor() {
        return this.dwf;
    }

    public void setAdditionalColor(byq byq2) {
        this.dwf = byq2;
    }

    @Override
    @Generated
    public byq getOutlineColor() {
        return this.zdhh_2;
    }

    public void setOutlineColor(byq byq2) {
        this.zdhh_2 = byq2;
    }

    @Override
    @Generated
    public byq getFlatColor() {
        return this.shlw;
    }

    public void setFlatColor(byq byq2) {
        this.shlw = byq2;
    }

    @Override
    public byq getAccentColor() {
        return this.rshkh;
    }

    public void setAccentColor(byq byq2) {
        this.rshkh = byq2;
    }

    @Override
    public byq getIconsColor() {
        return this.shaw_2;
    }

    public void setIconsColor(byq byq2) {
        this.shaw_2 = byq2;
    }

    @Override
    public byq getEnabledModulesColor() {
        return this.khqsh;
    }

    public void setEnabledModulesColor(byq byq2) {
        this.khqsh = byq2;
    }

    @Override
    public boolean isDark() {
        return this == jthj;
    }

    @Override
    public boolean isSeparators() {
        return true;
    }

    @Override
    public float getBlurStrength() {
        return 4.0f;
    }

    @Override
    public float getGlassOpacity() {
        return 20.0f;
    }

    @Override
    public float getMinimalismOpacity() {
        return 80.0f;
    }

    @Override
    public float getEnabledOffset() {
        return 2.0f;
    }

    @Override
    public float getHudRounding() {
        return 7.0f;
    }

    @Override
    public float getBlurOffset() {
        return 0.5f;
    }

    @Override
    public float getHudAlpha() {
        return 0.8f;
    }

    @Override
    public float getDisableAlphaGlass() {
        return 0.2f;
    }

    @Override
    public float getGlassPower() {
        return 25.0f;
    }

    @Override
    public float getGlassStrength() {
        return 0.08f;
    }

    @Override
    public float getPadding() {
        return 2.0f;
    }

    @Override
    public float getSplitters() {
        return 1.0f;
    }

    @Override
    public float getAlbumColor() {
        return 1.0f;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private tthn(byq byq3, byq byq4, byq byq5) {
        void var7_5;
        void var6_4;
        void var2_-1;
        void var1_-1;
        this.dhyk = byq3;
        this.sbl_2 = byq4;
        this.dwf = byq5;
        this.zdhh_2 = var6_4;
        this.shlw = var7_5;
    }

    private static tthn[] $values() {
        return new tthn[]{jthj, bzz_4};
    }

    private static String[] w1g00q3m(String string) {
        return string.split("\u0004\u0018", -1);
    }

    private static CallSite hygo4uwd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ be28l3j1 ^ string.hashCode()) + (n2 + olsozilxfmg) + i ^ be28l3j1, 25) + olsozilxfmg);
            }
            String[] stringArray = tthn.w1g00q3m(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

