/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_4587
 *  org.lwjgl.opengl.GL33C
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_4587;
import org.lwjgl.opengl.GL33C;
import us.m0vy.moondlc.m0vyguard.thl_3;

public final class bsha {
    private static int tdhf;
    private static int sbz_4;
    private static int skhth_2;
    private static final int shwz = -46334993;
    private static final int jghd = 1947415981;
    private static final int shsn = 269743908;
    private static final int thww = -1354993587;
    private static final int f0huwnv1ce282 = 1589429241;
    private static final int oo0lgmvma = -891098628;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int f3o2undbwpspk;

    public static void shtz_4() {
        int n = thl_3.thht_3(-1677877044);
        int n2 = n ^ 0x4F68335C;
        if ((n2 ^ n) != 1332228956) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xD4959390 ^ n, 13) + -1032159829) * -728394863;
        }
        String string = "#version 330 core\nlayout (location".concat(" = 0) in vec3 aPos;\nvoid main() {\n  ").concat("  gl_Position = vec4(aPos, 1.0);\n}\n");
        String string2 = bsha.dhsht_2("#version 330 core\nout vec4 FragColor;".concat("\nvoid main() {\n    FragColor = vec4"), "(0.0, 1.0, 0.0, 1.0); // Green\n}\n");
        int n3 = GL33C.glCreateShader((int)(Integer.reverse(-1943094248) ^ 0x183DFF00));
        GL33C.glShaderSource((int)n3, (CharSequence)string);
        GL33C.glCompileShader((int)n3);
        int n4 = GL33C.glCreateShader((int)(0xC14AFA65 ^ 0xC14A7155));
        GL33C.glShaderSource((int)n4, (CharSequence)string2);
        GL33C.glCompileShader((int)n4);
        skhth_2 = GL33C.glCreateProgram();
        bsha.shdhm(skhth_2, n3);
        bsha.dzy_3(skhth_2, n4);
        bsha.zshq(skhth_2);
        float[] fArray = new float[Integer.rotateLeft(0x3679CBD5 ^ 0x3679C7D5, 24)];
        fArray[0] = Float.intBitsToFloat(1365167061 - -1839281195);
        fArray[1] = Float.intBitsToFloat(Integer.rotateLeft(0x294EC1F3 ^ 0x295921F3, 11));
        fArray[2] = 0.0f;
        fArray[3] = bsha.sbt_4(0xFC96783 ^ 0x30C96783);
        fArray[4] = bsha.dddh_4(Integer.rotateLeft(0x3AC9926C ^ 0x3AC92D6C, 16));
        fArray[5] = 0.0f;
        fArray[bsha.zm((int)-217985561) ^ 0xE7B380C9] = Float.intBitsToFloat(200028224 - -856936384);
        fArray[Integer.rotateLeft((int)(0x44FABE ^ 0x3C4FABE), (int)9)] = bsha.azth_2(Integer.rotateLeft(0x67A9AA2F ^ 0x6459AA2F, 4));
        fArray[1360314396 + -1360314388] = 0.0f;
        fArray[0x24A7559B ^ 0x24A75592] = Float.intBitsToFloat(Integer.reverse(-266989193) ^ 0x5188680F);
        fArray[0xDD4F1F59 ^ 0xDD4F1F53] = bsha.zkha_2(-1154324293 - 2083678395);
        fArray[-1772666990 + 1772667001] = 0.0f;
        float[] fArray2 = fArray;
        tdhf = GL33C.glGenVertexArrays();
        sbz_4 = bsha.jshh_2();
        bsha.tzdh_3(tdhf);
        GL33C.glBindBuffer((int)(Integer.reverse(-504643016) ^ 0x1C435F15), (int)sbz_4);
        bsha.bght(-29348110 - -29383072, fArray2, 2121350898 - 2121315854);
        bsha.hshs(0, 3, Integer.reverse(1840330018) ^ 0x44AC99B0, false, Integer.rotateLeft(0xA1B3DE99 ^ 0xA1B3D299, 24), 0L);
        GL33C.glEnableVertexAttribArray((int)0);
        GL33C.glBindBuffer((int)(-2073017578 + 2073052540), (int)0);
        GL33C.glBindVertexArray((int)0);
    }

    public static void san_2(class_4587 class_45872) {
        GL33C.glUseProgram((int)skhth_2);
        GL33C.glBindVertexArray((int)tdhf);
        GL33C.glDrawArrays((int)6, (int)0, (int)4);
        GL33C.glBindVertexArray((int)0);
        GL33C.glUseProgram((int)0);
    }

    @Generated
    private bsha() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String sda_7(String string, int n, int n2, int n3) {
        int n4 = 1473351255;
        n4 = Integer.rotateLeft(n4 * -720704403, 16) ^ 0xA99C3A42;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 19)) ^ 0x16252BB9;
        if ((n5 ^ n4) != 371534777) {
            int cfr_ignored_0 = (0x41F4A5EE ^ n4) - 1335934399;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x1553BB2D ^ n2 - i) + jghd, 18) ^ shwz + i * -674814329));
        }
        return new String(cArray);
    }

    private static String dta_7(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1266561440;
            n4 = Integer.rotateLeft(n4 * -1157742147, 21) ^ 0x64E4BB01;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 20)) ^ 0x72DE8ACA;
            if ((n5 ^ n4) == 1927187146) break block0;
            int cfr_ignored_0 = (0xC65F44AA ^ n4) + -162935453;
        }
        return bsha.sda_7(string, n, n2, n3);
    }

    private static String dhzkh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -995095760;
            n4 = Integer.rotateLeft(n4 * 1113536965, 19) ^ 0xE96E282A;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x44839D6;
            if ((n5 ^ n4) == 71842262) break block0;
            int cfr_ignored_0 = (0xC0F832E6 ^ n4) + -852010752;
        }
        return bsha.sda_7(string, n, n2, n3);
    }

    private static String dhsht_2(String string, String string2) {
        block0: {
            int n = thl_3.thht_3(-54353821);
            String string3 = string;
            n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 17);
            String string4 = string2;
            n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
            int n2 = n ^ 0x350B11A0;
            if ((n2 ^ n) == 889917856) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xC9C9B1C3 ^ n, 12) + 1942627800;
        }
        return string.concat(string2);
    }

    private static void shdhm(int n, int n2) {
        int n3 = -1317008152;
        n3 = Integer.rotateLeft(n3 * 1587293369, 20) ^ 0x4D55F7A0;
        n3 = Integer.rotateRight(n ^ n3, 17);
        int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 11)) ^ 0x169DE234;
        if ((n4 ^ n3) != 379445812) {
            int cfr_ignored_0 = (0xA71DEEDC ^ n3) - -1983204507;
        }
        GL33C.glAttachShader((int)n, (int)n2);
    }

    private static void dzy_3(int n, int n2) {
        int n3 = thl_3.thht_3(700194812);
        n3 = n ^ n3;
        int n4 = (n3 = n2 ^ n3) ^ 0x759C6A47;
        if ((n4 ^ n3) != 1973185095) {
            int cfr_ignored_0 = (Integer.rotateRight(0x5C2075BB ^ n3, 14) + 743170272) * 1545631163;
        }
        GL33C.glAttachShader((int)n, (int)n2);
    }

    private static void zshq(int n) {
        int n2 = thl_3.thht_3(1175252644);
        int n3 = n2 ^ 0x8F17508;
        if ((n3 ^ n2) != 150041864) {
            int cfr_ignored_0 = Integer.rotateLeft(0x4EFD9BAC ^ n2, 12) - -1793885937;
        }
        GL33C.glLinkProgram((int)n);
    }

    private static float sbt_4(int n) {
        block0: {
            int n2 = 1761406906;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1468989307, 22) ^ 0x18208441) ^ 0x72BD167C;
            if ((n3 ^ n2) == 1924994684) break block0;
            int cfr_ignored_0 = (0x1A41F9C6 ^ n2) - 69034642;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dddh_4(int n) {
        block0: {
            int n2 = 796511968;
            int n3 = (n2 = Integer.rotateLeft(n2 * 22823671, 7) ^ 0xEA81B53F) ^ 0xF37ACCC;
            if ((n3 ^ n2) == 255306956) break block0;
            int cfr_ignored_0 = (0x204E622C ^ n2) - 745715111;
        }
        return Float.intBitsToFloat(n);
    }

    private static int zm(int n) {
        block0: {
            int n2 = thl_3.thht_3(-1603255643);
            int n3 = n2 ^ 0x98AF47FE;
            if ((n3 ^ n2) == -1733343234) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x38DF055B ^ n2, 10) + -413186752) * 954139995;
        }
        return Integer.reverse(n);
    }

    private static float azth_2(int n) {
        block0: {
            int n2 = -528149051;
            n2 = Integer.rotateLeft(n2 * -966575689, 27) ^ 0xB0059EE4;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 20)) ^ 0x50AA4727;
            if ((n3 ^ n2) == 1353336615) break block0;
            int cfr_ignored_0 = (0xB02F52E2 ^ n2) - -1851345219;
        }
        return Float.intBitsToFloat(n);
    }

    private static float zkha_2(int n) {
        block0: {
            int n2 = -269842980;
            int n3 = (n2 = Integer.rotateLeft(n2 * 290562309, 12) ^ 0xE9D4B748) ^ 0xD25E2D44;
            if ((n3 ^ n2) == -765579964) break block0;
            int cfr_ignored_0 = (0x3DB4A898 ^ n2) + 1337738036;
        }
        return Float.intBitsToFloat(n);
    }

    private static int jshh_2() {
        block0: {
            int n = thl_3.thht_3(-689473206);
            int n2 = n ^ 0xA6193484;
            if ((n2 ^ n) == -1508297596) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x70FE4DCE ^ n, 17) - -1289155795;
        }
        return GL33C.glGenBuffers();
    }

    private static void tzdh_3(int n) {
        int n2 = -823704723;
        int n3 = (n2 = Integer.rotateLeft(n2 * 750252001, 19) ^ 0x89457586) ^ 0xFB625D63;
        if ((n3 ^ n2) != -77439645) {
            int cfr_ignored_0 = (0x35851E0E ^ n2) + 1202788047;
        }
        GL33C.glBindVertexArray((int)n);
    }

    private static void bght(int n, float[] fArray, int n2) {
        int n3 = thl_3.thht_3(170280735);
        n3 = Integer.rotateLeft((fArray != null ? System.identityHashCode(fArray) : 0) ^ n3, 12);
        int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 12)) ^ 0xCE1D7727;
        if ((n4 ^ n3) != -836929753) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xC43B3038 ^ n3, 11) + -947358205) * -1002753991;
        }
        GL33C.glBufferData((int)n, (float[])fArray, (int)n2);
    }

    private static void hshs(int n, int n2, int n3, boolean bl, int n4, long l) {
        int n5 = thl_3.thht_3(-222932970);
        n5 = Integer.rotateRight(n3 ^ n5, 7);
        int n6 = (n5 = Integer.rotateRight(bl ^ n5, 4)) ^ 0xF62D86BA;
        if ((n6 ^ n5) != -164788550) {
            int cfr_ignored_0 = Integer.rotateLeft(0x49BD6AC ^ n5, 3) - -1824743921;
        }
        GL33C.glVertexAttribPointer((int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (long)l);
    }

    private static String[] djdh(String string) {
        block0: {
            int n = thl_3.thht_3(-1993460287);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xD1F21285;
            if ((n2 ^ n) == -772664699) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x58DC2744 ^ n, 14) - -955883401;
        }
        return string.split("\u0002\u0011", -1);
    }

    private static CallSite stt_6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1695465044;
            n3 = Integer.rotateLeft(n3 * -1235689249, 23) ^ 0x91724C9F;
            String string3 = string2;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 26);
            n3 = n ^ n3;
            int n4 = n3 ^ 0xCDB1922E;
            if ((n4 ^ n3) != -844000722) {
                int cfr_ignored_0 = (0xA8BF2C7A ^ n3) + 565396884;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shsn ^ string.hashCode()) + (n2 + thww) + i ^ shsn, 22) + thww);
            }
            String[] stringArray = bsha.djdh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ay37a62bh6(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite z0ivx9pfi6zpuk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ f0huwnv1ce282 ^ string.hashCode() ^ n2 + oo0lgmvma + i * -430248493) + f0huwnv1ce282) ^ oo0lgmvma));
            }
            String[] stringArray = bsha.ay37a62bh6(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

