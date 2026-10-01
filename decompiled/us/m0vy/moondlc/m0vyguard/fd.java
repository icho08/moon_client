/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.lsh;

public class fd {
    private final String zda;
    private final List hah_3 = new ArrayList();
    private static final int dblpfvrq = -9240416;
    private static final int cu1d62few = 1977602931;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int n9sgsnqoknp;

    public String getName() {
        return this.zda;
    }

    public List tjz() {
        return this.hah_3;
    }

    public fd(String string) {
        this.zda = string;
        this.hah_3.add(new lsh("Primary", new Color(190, 141, 255)));
        this.hah_3.add(new lsh("Secondary", new Color(168, 108, 255)));
        this.hah_3.add(new lsh("Blur", new Color(37, 33, 46)));
        this.hah_3.add(new lsh("Widget blur", new Color(23, 23, 32, 255)));
        this.hah_3.add(new lsh("Background blur", new Color(35, 29, 47, 255)));
        this.hah_3.add(new lsh("Text", new Color(231, 217, 255, 255)));
        this.hah_3.add(new lsh("Inactive text", new Color(152, 152, 152)));
        this.hah_3.add(new lsh("Knob", new Color(181, 151, 252)));
        this.hah_3.add(new lsh("Inactive knob", new Color(255, 255, 255)));
        this.hah_3.add(new lsh("Positive", new Color(130, 255, 130)));
        this.hah_3.add(new lsh("Middle", new Color(255, 200, 95)));
        this.hah_3.add(new lsh("Negative", new Color(255, 80, 80)));
    }

    public Color rdm_2() {
        return this.hkhs_2("Primary");
    }

    public Color shthz() {
        return this.hkhs_2("Secondary");
    }

    public Color zjs_3() {
        return this.hkhs_2("Blur");
    }

    public Color jghgh() {
        return this.hkhs_2("Widget blur");
    }

    public Color tmd_3() {
        return this.hkhs_2("Background blur");
    }

    public Color dtm_3() {
        return this.hkhs_2("Text");
    }

    public Color dhygh() {
        return this.hkhs_2("Inactive text");
    }

    public Color ddhh_2() {
        return this.hkhs_2("Knob");
    }

    public Color sdd_2() {
        return this.hkhs_2("Inactive knob");
    }

    public Color rht_3() {
        return this.hkhs_2("Positive");
    }

    public Color dydh_2() {
        return this.hkhs_2("Middle");
    }

    public Color bwt_2() {
        return this.hkhs_2("Negative");
    }

    public Color hkhs_2(String string) {
        for (lsh lsh2 : this.hah_3) {
            if (!lsh2.getName().equalsIgnoreCase(string)) continue;
            return lsh2.snw_2();
        }
        return new Color(-1);
    }

    private static String[] iaybf1efq4(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wai76s7xbc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dblpfvrq ^ string.hashCode()) + (n2 + cu1d62few) + i ^ dblpfvrq, 12) + cu1d62few);
            }
            String[] stringArray = fd.iaybf1efq4(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

