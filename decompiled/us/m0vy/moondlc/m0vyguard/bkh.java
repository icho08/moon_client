/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1921
 *  net.minecraft.class_1921$class_4687
 *  net.minecraft.class_1921$class_4688
 *  net.minecraft.class_290
 *  net.minecraft.class_293
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4668$class_4683
 *  net.minecraft.class_4668$class_5939
 *  net.minecraft.class_4668$class_5942
 *  net.minecraft.class_9851
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4668;
import net.minecraft.class_9851;
import us.m0vy.moondlc.m0vyguard.bqy;
import us.m0vy.moondlc.m0vyguard.tbq;
import us.m0vy.moondlc.m0vyguard.fth;
import us.movy.moondlc.mixin.accessors.MultiPhaseAccessor;
import us.movy.moondlc.mixin.accessors.MultiPhaseParametersAccessor;
import us.movy.moondlc.mixin.accessors.TextureAccessor;

public class bkh
extends class_1921 {
    private static final Map khha_3;
    private static final Map kk;
    private static final Map th;
    private static final Map dtn_2;
    private static final int dmm604vtkm = 1106085347;
    private static final int awoe6utjycj = 937503997;
    private static volatile int jv$kxucndf31gf;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int b44d346aeqtb;

    private bkh() {
        super("dummy", class_290.field_1592, class_293.class_5596.field_27382, 0, false, false, bkh::lambda$new$0, bkh::lambda$new$1);
    }

    public static class_2960 getTexture(class_1921 class_19212) {
        class_4668.class_5939 class_59392;
        class_1921.class_4687 class_46872;
        class_1921.class_4688 class_46882;
        if (class_19212 instanceof class_1921.class_4687 && (class_46882 = ((MultiPhaseAccessor)(class_46872 = (class_1921.class_4687)class_19212)).getPhases()) != null && (class_59392 = ((MultiPhaseParametersAccessor)class_46882).getTexture()) instanceof class_4668.class_4683) {
            class_4668.class_4683 class_46832 = (class_4668.class_4683)class_59392;
            return ((TextureAccessor)class_46832).getId().orElse(null);
        }
        return null;
    }

    public static class_1921 getChamsThroughWalls(class_2960 class_29602) {
        if (class_29602 == null) {
            return class_1921.method_23583();
        }
        return khha_3.computeIfAbsent(class_29602, bkh::lambda$getChamsThroughWalls$2);
    }

    public static class_1921 getChamsNormal(class_2960 class_29602) {
        Object[] objectArray = new Object[]{class_29602};
        bkh.jv$re31llnforg(objectArray, 1760081124);
        return (class_1921)bkh.jv$vrd5yjqrs91("甔用畨畲甔畞甯町痂痘痭痭疉疟疾痴瑗瑩瑷琔球琞瑣璚璎璼璃璂璝璽璲睄睠睊睔睄睵睩瞒瞮瞤矑瞀瞚瞼矶癇癒発瘀瘕瘵瘱盇盆皬盿皁皟皼皫煶焈焲煒煅煽煾燬營燧燧燃熐熧熱灍灚灸灺瀒瀱灹烄烜烠烡炐炣烼烧猝猉猲猇獚獳獥玖玄玶玡玃", objectArray, 434085741);
    }

    public static class_4668.class_5939 getCompositeTexturePhase(class_2960 class_29602) {
        return new class_4668.class_5939(() -> bkh.lambda$getCompositeTexturePhase$3(class_29602), bkh::lambda$getCompositeTexturePhase$4);
    }

    public static class_1921 getDepthOnlyLayer(class_2960 class_29602, boolean bl) {
        if (class_29602 == null) {
            return class_1921.method_23583();
        }
        Map map = bl ? kk : th;
        return map.computeIfAbsent(class_29602, arg_0 -> bkh.lambda$getDepthOnlyLayer$5(bl, arg_0));
    }

    public static class_1921 getReflectionLayer(class_2960 class_29602, fth fth2, boolean bl, float f) {
        if (class_29602 == null) {
            return class_1921.method_23583();
        }
        String string = class_29602.toString() + "_" + fth2.hashCode() + "_" + bl + "_" + f;
        return dtn_2.computeIfAbsent(string, arg_0 -> bkh.lambda$getReflectionLayer$6(fth2, f, class_29602, bl, arg_0));
    }

    private static class_1921 lambda$getReflectionLayer$6(fth fth2, float f, class_2960 class_29602, boolean bl, String string) {
        return class_1921.method_24049((String)"chams_reflection", (class_293)class_290.field_1580, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)true, (boolean)true, (class_1921.class_4688)class_1921.class_4688.method_23598().method_34578((class_4668.class_5942)new bqy(fth2, f)).method_34577(bkh.getCompositeTexturePhase(class_29602)).method_23615(field_21370).method_23603(field_21344).method_23608(field_21383).method_23611(field_21385).method_23604(bl ? field_21346 : field_21348).method_23616(field_21350).method_23617(true));
    }

    private static class_1921 lambda$getDepthOnlyLayer$5(boolean bl, class_2960 class_29602) {
        return class_1921.method_24049((String)(bl ? "chams_depth_only_through_walls" : "chams_depth_only_normal"), (class_293)class_290.field_1580, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)true, (boolean)true, (class_1921.class_4688)class_1921.class_4688.method_23598().method_34578(field_29407).method_34577((class_4668.class_5939)new class_4668.class_4683(class_29602, class_9851.field_52395, false)).method_23615(field_21370).method_23603(field_21344).method_23608(field_21383).method_23611(field_21385).method_23604(bl ? field_21346 : field_21348).method_23616(field_21351).method_23617(true));
    }

    private static void lambda$getCompositeTexturePhase$4() {
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.setShaderTexture((int)1, (int)0);
    }

    private static void lambda$getCompositeTexturePhase$3(class_2960 class_29602) {
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        tbq tbq2 = tbq.khhkh();
        if (tbq2 != null) {
            tbq2.rhdh_2();
            if (tbq2.dhlt() != -1) {
                RenderSystem.setShaderTexture((int)1, (int)tbq2.dhlt());
            }
        }
    }

    private static class_1921 lambda$getChamsThroughWalls$2(class_2960 class_29602) {
        return class_1921.method_24049((String)"chams_through_walls", (class_293)class_290.field_1580, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)true, (boolean)true, (class_1921.class_4688)class_1921.class_4688.method_23598().method_34578(field_29407).method_34577((class_4668.class_5939)new class_4668.class_4683(class_29602, class_9851.field_52395, false)).method_23615(field_21370).method_23603(field_21344).method_23608(field_21383).method_23611(field_21385).method_23604(field_21346).method_23616(field_21350).method_23617(true));
    }

    private static void lambda$new$1() {
    }

    private static void lambda$new$0() {
    }

    private static String[] va91oj9vyz2a6d(String string) {
        return string.split("\u0005\u0011", -1);
    }

    private static CallSite r0p7q1d6mcrmdl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dmm604vtkm ^ string.hashCode()) + (n2 + awoe6utjycj) + i ^ dmm604vtkm, 4) + awoe6utjycj);
            }
            String[] stringArray = bkh.va91oj9vyz2a6d(new String(cArray));
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

    private static Object jv$vrd5yjqrs91(String string, Object[] objectArray, int n) throws Throwable {
        String string2 = bkh.jv$ooibxgbst2(string, n);
        if ((bkh.jv$re31llnforg(objectArray, n) ^ string2.length()) == -2017387527) {
            bkh.jv$sva6046ogqiks(string2, objectArray, n);
        }
        String[] stringArray = string2.split("\u001d", -1);
        int n2 = Integer.parseInt(stringArray[0]);
        Class<?> clazz = Class.forName(stringArray[1].replace('/', '.'));
        MethodType methodType = MethodType.fromMethodDescriptorString(stringArray[3], clazz.getClassLoader());
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = n2 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType) : lookup.findVirtual(clazz, stringArray[2], methodType);
        return methodHandle.invokeWithArguments(objectArray);
    }

    private static String jv$ooibxgbst2(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (n * 131 ^ i * 17 ^ 0x157DE1E3) & 0xFFFF);
        }
        return new String(cArray);
    }

    private static int jv$re31llnforg(Object[] objectArray, int n) {
        int n2 = n ^ 0x71372B89;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object == null) continue;
            n2 = Integer.rotateLeft(n2 ^ System.identityHashCode(object), 5) + i * 1315423911;
        }
        return n2;
    }

    private static Object jv$sva6046ogqiks(String string, Object[] objectArray, int n) {
        jv$kxucndf31gf = bkh.jv$re31llnforg(objectArray, n) ^ string.length();
        if ((jv$kxucndf31gf & 3) == 4) {
            return string.substring(0, 0);
        }
        return null;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

