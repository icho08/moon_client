/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2248
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import lombok.Generated;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import us.m0vy.moondlc.m0vyguard.bmt;

public class tsk
extends bmt {
    private final List shdr = new ArrayList();
    private static final int pcq3hc1vmka20 = 1641127290;
    private static final int r84i8b1e = 660658463;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q5az6frz8a;

    public tsk(String string) {
        super(string);
        this.jsn_2 = new ArrayList();
    }

    public tsk td_3(List list) {
        this.jsn_2 = list;
        this.shdr.clear();
        for (String string : list) {
            class_2248 class_22482 = (class_2248)class_7923.field_41175.method_63535(class_2960.method_60654((String)string));
            if (class_22482 == null || this.shdr.contains(class_22482)) continue;
            this.shdr.add(class_22482);
        }
        this.zkhn();
        return this;
    }

    public tsk swf_2(class_2248 ... class_2248Array) {
        for (class_2248 class_22482 : class_2248Array) {
            this.azr_2(class_22482);
        }
        return this;
    }

    public void azr_2(class_2248 class_22482) {
        String string = class_7923.field_41175.method_10221((Object)class_22482).toString();
        if (!((List)this.jsn_2).contains(string)) {
            ((List)this.jsn_2).add(string);
            this.shdr.add(class_22482);
            this.zkhn();
        }
    }

    public void sar_2(class_2248 class_22482) {
        String string = class_7923.field_41175.method_10221((Object)class_22482).toString();
        boolean bl = ((List)this.jsn_2).remove(string) | this.shdr.remove(class_22482);
        if (bl) {
            this.zkhn();
        }
    }

    public boolean khdw_2(class_2248 class_22482) {
        String string = class_7923.field_41175.method_10221((Object)class_22482).toString();
        return ((List)this.jsn_2).contains(string);
    }

    public List dhsf() {
        if (this.shdr.isEmpty() && !((List)this.jsn_2).isEmpty()) {
            for (String string : (List)this.jsn_2) {
                class_2248 class_22482 = (class_2248)class_7923.field_41175.method_63535(class_2960.method_60654((String)string));
                if (class_22482 == null || this.shdr.contains(class_22482)) continue;
                this.shdr.add(class_22482);
            }
        }
        return this.shdr;
    }

    public static List adsh() {
        ArrayList<class_2248> arrayList = new ArrayList<class_2248>();
        for (class_2248 class_22482 : class_7923.field_41175) {
            arrayList.add(class_22482);
        }
        return arrayList;
    }

    public static List sqa_2(String string) {
        ArrayList<class_2248> arrayList = new ArrayList<class_2248>();
        String string2 = string.toLowerCase();
        for (class_2248 class_22482 : class_7923.field_41175) {
            String string3 = class_7923.field_41175.method_10221((Object)class_22482).toString();
            if (!string3.contains(string2)) continue;
            arrayList.add(class_22482);
        }
        return arrayList;
    }

    @Override
    public tsk qh(Supplier supplier) {
        return (tsk)super.qh(supplier);
    }

    @Generated
    public List ahh_3() {
        return this.shdr;
    }

    private static String[] ktopc6us774z(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ke6zz0rricx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ pcq3hc1vmka20 ^ string.hashCode()) + (n2 + r84i8b1e) + i ^ pcq3hc1vmka20, 12) + r84i8b1e);
            }
            String[] stringArray = tsk.ktopc6us774z(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

