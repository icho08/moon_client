/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.fabricmc.api.ClientModInitializer;

public class bnd_2
implements ClientModInitializer {
    private static final int hfl = 2077729502;
    private static final int drz_2 = -587405970;
    private static final int bta_3 = -1549316025;
    private static final int zal_2 = -691510368;
    private static final int mp9m0m0 = 1249428917;
    private static final int qpl58k7x83x = -2003644612;
    private static volatile int jv$vxlzk9wqhx;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int t8d8r1w6ws7z8;

    public void onInitializeClient() {
        System.out.println(bnd_2.oddhfh89a(bnd_2.bywjq79("볇큌꼱慏㷁蜕暢ᣳ렅퍏㕝愙莭諟ᨊ\udc51뭛䴕⾿黼肰؉Ꝡ\ud8da㖕叵狗", 118043259 - 1837609414, bnd_2.vnbkk0x8(-573074675) ^ 0x48FD497C, -1841574345 + -393146929), "tializing client sound even").concat("ts before registry is frozen..."));
        bnd_2.en6oh5tzk();
    }

    private static String bywjq79(String string, int n, int n2, int n3) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xF43755EA) + n2 ^ i * -1111720877) ^ hfl) + drz_2);
        }
        return new String(cArray);
    }

    private static int vnbkk0x8(int n) {
        Object[] objectArray = new Object[]{n};
        bnd_2.jv$vekhzho5(objectArray, 571891032);
        return (Integer)bnd_2.jv$gba0tc4jugdux4("⍸⍄⌀⌚⍺⍼⌁⍓⎡⎿⎅⏜⏍⏻⏒⏒∿∌∈∖≮≈≈⊪⊢⊒⊗⊞⊼⋬⊟ℎⅵ⅋℻ℨℙ℈⇸↺⇕", objectArray, 1050703355);
    }

    private static String oddhfh89a(String string, String string2) {
        Object[] objectArray = new Object[]{string, string2};
        bnd_2.jv$vekhzho5(objectArray, 1589157736);
        return (String)bnd_2.jv$gba0tc4jugdux4("烩烔炐炊烪烬炑烃瀱瀯瀕灌灇灱灄灎熦熞燷燸燣燓燍焾焴煬煊煟煮煔煐状狗犅狻狥狛犂爍爻爂爈牼牤爏爌玚玭玉珯珫玔珀猼猠猘獏獂獶獁獍璻璡瓌璅璱瓙璜瑭瑵琟瑖瑴", objectArray, 1108260811);
    }

    private static void en6oh5tzk() {
        Object[] objectArray = new Object[]{};
        bnd_2.jv$vekhzho5(objectArray, -562671316);
        bnd_2.jv$gba0tc4jugdux4("䠤䠘䡃䡔䡿䠬䡂䠕䣥䢢䣓䣀䢷䢧䢞䢇䥧䤚䥋䥧䤶䤈䤅䧦䧭䧏䧊䧰俦促䧷䰵䰚䱢䩋䩯䩙䨷䪏䪵䫝䪟䫦䪪䫈䪍䬣", objectArray, -1027573361);
    }

    private static String[] wpr315c3p(String string) {
        return string.split("\u0002\u001c", -1);
    }

    private static CallSite dwagizdb90(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 152858380;
            n3 = Integer.rotateLeft(n3 * -2005264391, 5) ^ 0x91E52B7;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 13);
            int n4 = n3 ^ 0xA6FCD914;
            if ((n4 ^ n3) != -1493378796) {
                int cfr_ignored_0 = (0xAFE0B618 ^ n3) + 293234027;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ bta_3 ^ string.hashCode() ^ n2 + zal_2 ^ i * -1522928391 ^ bta_3, 8) ^ zal_2));
            }
            String[] stringArray = bnd_2.wpr315c3p(new String(cArray));
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

    private static String[] jhtadkrmb(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite x2tvty9jobb8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ mp9m0m0 ^ string.hashCode()) + (n2 + qpl58k7x83x) + i ^ mp9m0m0, 21) + qpl58k7x83x);
            }
            String[] stringArray = bnd_2.jhtadkrmb(new String(cArray));
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

    private static Object jv$gba0tc4jugdux4(String string, Object[] objectArray, int n) throws Throwable {
        String string2 = bnd_2.jv$p8l3dsxb36j(string, n);
        if ((bnd_2.jv$vekhzho5(objectArray, n) ^ string2.length()) == -1059623583) {
            bnd_2.jv$w4081opk71nz(string2, objectArray, n);
        }
        String[] stringArray = string2.split("\u001d", -1);
        int n2 = Integer.parseInt(stringArray[0]);
        Class<?> clazz = Class.forName(stringArray[1].replace('/', '.'));
        MethodType methodType = MethodType.fromMethodDescriptorString(stringArray[3], clazz.getClassLoader());
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = n2 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType) : lookup.findVirtual(clazz, stringArray[2], methodType);
        return methodHandle.invokeWithArguments(objectArray);
    }

    private static String jv$p8l3dsxb36j(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (n * 131 ^ i * 17 ^ 0xCAB57C39) & 0xFFFF);
        }
        return new String(cArray);
    }

    private static int jv$vekhzho5(Object[] objectArray, int n) {
        int n2 = n ^ 0x1CB628A3;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object == null) continue;
            n2 = Integer.rotateLeft(n2 ^ System.identityHashCode(object), 5) + i * 1315423911;
        }
        return n2;
    }

    private static Object jv$w4081opk71nz(String string, Object[] objectArray, int n) {
        jv$vxlzk9wqhx = bnd_2.jv$vekhzho5(objectArray, n) ^ string.length();
        if ((jv$vxlzk9wqhx & 3) == 4) {
            return string.substring(0, 0);
        }
        return null;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

