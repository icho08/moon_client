/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import us.m0vy.moondlc.m0vyguard.bdhw;
import us.m0vy.moondlc.m0vyguard.hy;

public abstract class bfkh
implements bdhw {
    private final String syz_2;
    @NotNull
    private final BooleanSupplier shmb;
    private static final int qh6zcg82idiax = -1950880501;
    private static final int j3toix66zsasm = -723404301;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vbkhe5vfze5nn;

    public bfkh(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        this.syz_2 = string;
        this.shmb = booleanSupplier;
        this.trq_2(hy2);
    }

    public bfkh(@NotNull hy hy2, String string) {
        this(hy2, string, bfkh::bja);
    }

    @Override
    public void trq_2(hy hy2) {
        hy2.dty().add(this);
    }

    @Override
    public String zta() {
        return this.getName() + ".description";
    }

    @Override
    @Generated
    public String getName() {
        return this.syz_2;
    }

    @Override
    @NotNull
    @Generated
    public BooleanSupplier dhtm_2() {
        return this.shmb;
    }

    private static boolean bja() {
        return false;
    }

    private static String[] hs2etyzwgaaru(String string) {
        return string.split("\u0004\u0016", -1);
    }

    private static CallSite hsaqaieev(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ qh6zcg82idiax ^ string.hashCode() ^ n2 + j3toix66zsasm + i * 648949505) + qh6zcg82idiax) ^ j3toix66zsasm));
            }
            String[] stringArray = bfkh.hs2etyzwgaaru(new String(cArray));
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

