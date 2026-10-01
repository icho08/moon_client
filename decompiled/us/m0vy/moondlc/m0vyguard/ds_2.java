/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.bmt;

public class ds_2
extends bmt {
    private final boolean jrf;
    private static final int vkjtu1132 = -610022883;
    private static final int hygbql5h = 363345954;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int o1b1cxbese;

    public ds_2(String string, String string2, boolean bl) {
        super(string);
        this.jsn_2 = new ArrayList();
        this.jrf = bl;
    }

    public ds_2 ras(bmt ... bmtArray) {
        ((List)this.jsn_2).addAll(Arrays.asList(bmtArray));
        return this;
    }

    public List rat() {
        return (List)this.jsn_2;
    }

    public boolean smt_4() {
        return this.jrf;
    }

    public ds_2 td_3(List list) {
        this.jsn_2 = list;
        return this;
    }

    private static String[] wn1cg24x4mv7me(String string) {
        return string.split("\u0003\u0016", -1);
    }

    private static CallSite p52qp5mxn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vkjtu1132 ^ string.hashCode()) + (n2 + hygbql5h) + i ^ vkjtu1132, 21) + hygbql5h);
            }
            String[] stringArray = ds_2.wn1cg24x4mv7me(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

