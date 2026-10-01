/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_238
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_238;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.dl;

public class bbs
implements dl {
    private static final int pib7m4q8g8 = -369753254;
    private static final int xpnoxsld = -1446873062;
    private static volatile int jv$rtpz3qduid;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int brm8mu34nb6y;

    public static void dbk_2() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
    }

    public static void dhw_4() {
        Object[] objectArray = new Object[]{};
        bbs.jv$wycf133px(objectArray, 2042133192);
        bbs.jv$vvkndnd5fo1k8("ⷨⷔ⶙ⶄⷱⶢⷓⷀⴺⴠⴜⴄⴻⵧⵚⵆⲲⲜⳙ⳿ⲣⳎⳗⰬⰴⰔⰏⱠⰫⱧⱃ⾹⾜⾌⿨⿘⿅⿞⼪⼪⼝⽼⽶⽪⽇⽄⺴⺫⺍⻛⻦⻞⻂⸹⹓⹗⹉⹇⸟⸇⸓⦰⧶⦓⧼⧭⦂", objectArray, 1942009397);
    }

    public static void kq(class_4587 class_45872, class_238 class_2382, Color color) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_4587 class_45873 = new class_4587();
        class_45873.method_22904(class_2382.field_1323, class_2382.field_1322, class_2382.field_1321);
        Matrix4f matrix4f = class_45873.method_23760().method_23761();
        class_238 class_2383 = class_2382.method_989(-class_2382.field_1323, -class_2382.field_1322, -class_2382.field_1321);
        float f = (float)class_2383.field_1323;
        float f2 = (float)class_2383.field_1322;
        float f3 = (float)class_2383.field_1321;
        float f4 = (float)class_2383.field_1320;
        float f5 = (float)class_2383.field_1325;
        float f6 = (float)class_2383.field_1324;
        int n = color.getRed();
        int n2 = color.getGreen();
        int n3 = color.getBlue();
        int n4 = color.getAlpha();
        class_2872.method_22918(matrix4f, f, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f2, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f2, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f5, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f5, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f5, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f2, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f5, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f2, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f5, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f5, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f, f2, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f2, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f3).method_1336(n, n2, n3, n4);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void thfy(class_238 class_2382, Color color, float f) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53864);
        RenderSystem.lineWidth((float)f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
        class_4587 class_45872 = new class_4587();
        class_45872.method_22904(class_2382.field_1323, class_2382.field_1322, class_2382.field_1321);
        class_238 class_2383 = class_2382.method_989(-class_2382.field_1323, -class_2382.field_1322, -class_2382.field_1321);
        bbs.shmf(class_2383, class_45872, class_2872, color);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void shmf(class_238 class_2382, class_4587 class_45872, class_287 class_2872, Color color) {
        float f = (float)class_2382.field_1323;
        float f2 = (float)class_2382.field_1322;
        float f3 = (float)class_2382.field_1321;
        float f4 = (float)class_2382.field_1320;
        float f5 = (float)class_2382.field_1325;
        float f6 = (float)class_2382.field_1324;
        bbs.tghl_2(class_45872, (class_4588)class_2872, f, f2, f3, f4, f2, f3, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f4, f2, f3, f4, f2, f6, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f4, f2, f6, f, f2, f6, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f, f2, f6, f, f2, f3, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f, f2, f6, f, f5, f6, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f, f2, f3, f, f5, f3, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f4, f2, f6, f4, f5, f6, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f4, f2, f3, f4, f5, f3, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f, f5, f3, f4, f5, f3, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f4, f5, f3, f4, f5, f6, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f4, f5, f6, f, f5, f6, color);
        bbs.tghl_2(class_45872, (class_4588)class_2872, f, f5, f6, f, f5, f3, color);
    }

    public static void tghl_2(class_4587 class_45872, class_4588 class_45882, float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        Matrix4f matrix4f = class_46652.method_23761();
        Vector3f vector3f = bbs.jnd_2(f, f2, f3, f4, f5, f6);
        int n = color.getRed();
        int n2 = color.getGreen();
        int n3 = color.getBlue();
        int n4 = color.getAlpha();
        class_45882.method_22918(matrix4f, f, f2, f3).method_1336(n, n2, n3, n4).method_60831(class_46652, vector3f.x(), vector3f.y(), vector3f.z());
        class_45882.method_22918(matrix4f, f4, f5, f6).method_1336(n, n2, n3, n4).method_60831(class_46652, vector3f.x(), vector3f.y(), vector3f.z());
    }

    public static Vector3f jnd_2(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float f9 = f6 - f3;
        float f10 = class_3532.method_15355((float)(f7 * f7 + f8 * f8 + f9 * f9));
        return new Vector3f(f7 / f10, f8 / f10, f9 / f10);
    }

    @Deprecated
    public static class_4587 ghddh(double d, double d2, double d3) {
        class_4587 class_45872 = new class_4587();
        class_4184 class_41842 = bbs.mc.field_1773.method_19418();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(class_41842.method_19330() + 180.0f));
        class_45872.method_22904(d - class_41842.method_19326().field_1352, d2 - class_41842.method_19326().field_1351, d3 - class_41842.method_19326().field_1350);
        return class_45872;
    }

    private static String[] l7mdga4nvpbo72(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hubnd38ocgerx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ pib7m4q8g8 ^ string.hashCode()) + (n2 + xpnoxsld) + i ^ pib7m4q8g8, 11) + xpnoxsld);
            }
            String[] stringArray = bbs.l7mdga4nvpbo72(new String(cArray));
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

    private static Object jv$vvkndnd5fo1k8(String string, Object[] objectArray, int n) throws Throwable {
        String string2 = bbs.jv$ssf6ap0a602(string, n);
        if ((bbs.jv$wycf133px(objectArray, n) ^ string2.length()) == -1492975799) {
            bbs.jv$mdwcou3f654y(string2, objectArray, n);
        }
        String[] stringArray = string2.split("\u001d", -1);
        int n2 = Integer.parseInt(stringArray[0]);
        Class<?> clazz = Class.forName(stringArray[1].replace('/', '.'));
        MethodType methodType = MethodType.fromMethodDescriptorString(stringArray[3], clazz.getClassLoader());
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = n2 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType) : lookup.findVirtual(clazz, stringArray[2], methodType);
        return methodHandle.invokeWithArguments(objectArray);
    }

    private static String jv$ssf6ap0a602(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (n * 131 ^ i * 17 ^ 0x326D10C7) & 0xFFFF);
        }
        return new String(cArray);
    }

    private static int jv$wycf133px(Object[] objectArray, int n) {
        int n2 = n ^ 0xA78CCFD;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object == null) continue;
            n2 = Integer.rotateLeft(n2 ^ System.identityHashCode(object), 5) + i * 1315423911;
        }
        return n2;
    }

    private static Object jv$mdwcou3f654y(String string, Object[] objectArray, int n) {
        jv$rtpz3qduid = bbs.jv$wycf133px(objectArray, n) ^ string.length();
        if ((jv$rtpz3qduid & 3) == 4) {
            return string.substring(0, 0);
        }
        return null;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

