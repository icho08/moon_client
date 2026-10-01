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
import us.m0vy.moondlc.m0vyguard.a_2;
import us.m0vy.moondlc.m0vyguard.tbq;
import us.m0vy.moondlc.m0vyguard.fth;
import us.movy.moondlc.mixin.accessors.MultiPhaseAccessor;
import us.movy.moondlc.mixin.accessors.MultiPhaseParametersAccessor;
import us.movy.moondlc.mixin.accessors.TextureAccessor;

public class bthth
extends class_1921 {
    private static final Map shmt_2;
    private static final Map hkh_3;
    private static final Map rzj_2;
    private static final Map hdn_2;
    private static final int bx4tg1erp9v4 = 1856217714;
    private static final int cs50kzg44h = -1349474693;
    private static volatile int jv$lqik4wmo;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zm6tro9u5cd;

    private bthth() {
        super("dummy", class_290.field_1592, class_293.class_5596.field_27382, 0, false, false, bthth::lambda$new$0, bthth::lambda$new$1);
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
        return shmt_2.computeIfAbsent(class_29602, bthth::lambda$getChamsThroughWalls$2);
    }

    public static class_1921 getChamsNormal(class_2960 class_29602) {
        Object[] objectArray = new Object[]{class_29602};
        bthth.jv$tzlkrjtbd3b2px(objectArray, 1192560496);
        return (class_1921)bthth.jv$rybitzu7("誴誈諈諒誴諾誏誚詢詸詍詍訩訿訞詔请诉诗讴讣设诃謺謮謜謣謢謽謝謒裤裀裪裴裤裕裉蠲蠎蠄衱蠠蠺蠜衖觧觲觚覠覵覕覑襧襦褌襟褡褿褜褋軖躨躒軲軥軝軞蹌蹿蹇蹇蹣踰踇踑迭迺还迚農辑这轤轼轀轁輰較轜轇貽販貒貧貭賓貑谱谯谓豗豳", objectArray, -743639919);
    }

    public static class_4668.class_5939 getCompositeTexturePhase(class_2960 class_29602) {
        return new class_4668.class_5939(() -> bthth.lambda$getCompositeTexturePhase$3(class_29602), bthth::lambda$getCompositeTexturePhase$4);
    }

    public static class_1921 getDepthOnlyLayer(class_2960 class_29602, boolean bl) {
        if (class_29602 == null) {
            return class_1921.method_23583();
        }
        Map map = bl ? hkh_3 : rzj_2;
        return map.computeIfAbsent(class_29602, arg_0 -> bthth.lambda$getDepthOnlyLayer$5(bl, arg_0));
    }

    public static class_1921 getReflectionLayer(class_2960 class_29602, fth fth2, boolean bl, float f) {
        if (class_29602 == null) {
            return class_1921.method_23583();
        }
        String string = class_29602.toString() + "_" + fth2.hashCode() + "_" + bl + "_" + f;
        return hdn_2.computeIfAbsent(string, arg_0 -> bthth.lambda$getReflectionLayer$6(fth2, f, class_29602, bl, arg_0));
    }

    private static class_1921 lambda$getReflectionLayer$6(fth fth2, float f, class_2960 class_29602, boolean bl, String string) {
        return class_1921.method_24049((String)"chams_reflection", (class_293)class_290.field_1580, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)true, (boolean)true, (class_1921.class_4688)class_1921.class_4688.method_23598().method_34578((class_4668.class_5942)new a_2(fth2, f)).method_34577(bthth.getCompositeTexturePhase(class_29602)).method_23615(field_21370).method_23603(field_21344).method_23608(field_21383).method_23611(field_21385).method_23604(bl ? field_21346 : field_21348).method_23616(field_21350).method_23617(true));
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

    private static String[] rujev8drgiqsjw(String string) {
        return string.split("\u0001\u000f", -1);
    }

    private static CallSite g4qd527x9wlf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bx4tg1erp9v4 ^ string.hashCode() ^ n2 + cs50kzg44h + i * -174391689) + bx4tg1erp9v4) ^ cs50kzg44h));
            }
            String[] stringArray = bthth.rujev8drgiqsjw(new String(cArray));
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

    private static Object jv$rybitzu7(String string, Object[] objectArray, int n) throws Throwable {
        String string2 = bthth.jv$c9exywdvl(string, n);
        if ((bthth.jv$tzlkrjtbd3b2px(objectArray, n) ^ string2.length()) == 1572075153) {
            bthth.jv$osetd8hl982w(string2, objectArray, n);
        }
        String[] stringArray = string2.split("\u001d", -1);
        int n2 = Integer.parseInt(stringArray[0]);
        Class<?> clazz = Class.forName(stringArray[1].replace('/', '.'));
        MethodType methodType = MethodType.fromMethodDescriptorString(stringArray[3], clazz.getClassLoader());
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = n2 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType) : lookup.findVirtual(clazz, stringArray[2], methodType);
        return methodHandle.invokeWithArguments(objectArray);
    }

    private static String jv$c9exywdvl(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (n * 131 ^ i * 17 ^ 0x760CACB7) & 0xFFFF);
        }
        return new String(cArray);
    }

    private static int jv$tzlkrjtbd3b2px(Object[] objectArray, int n) {
        int n2 = n ^ 0x94B9F3E1;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object == null) continue;
            n2 = Integer.rotateLeft(n2 ^ System.identityHashCode(object), 5) + i * 1315423911;
        }
        return n2;
    }

    private static Object jv$osetd8hl982w(String string, Object[] objectArray, int n) {
        jv$lqik4wmo = bthth.jv$tzlkrjtbd3b2px(objectArray, n) ^ string.length();
        if ((jv$lqik4wmo & 3) == 4) {
            return string.substring(0, 0);
        }
        return null;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

