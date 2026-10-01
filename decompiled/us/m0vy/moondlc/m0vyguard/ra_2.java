/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.bdn;

public class ra_2
extends bdn {
    private final List hlt;
    private static final int e8jyvpao = -2022723077;
    private static final int o58haqc68tc = 893201869;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int z6vd1ky32pnh;

    public ra_2(String string, List list, String string2) {
        super(string, list.contains(string2) ? string2 : (String)list.get(0));
        this.hlt = List.copyOf(list);
    }

    public List thwkh() {
        return this.hlt;
    }

    public int dhkhf() {
        return Math.max(0, this.hlt.indexOf(this.tyl));
    }

    public void ttdh_2(int n) {
        if (n >= 0 && n < this.hlt.size()) {
            this.ttn_4((String)this.hlt.get(n));
        }
    }

    public void rfz(String string) {
        for (String string2 : this.hlt) {
            if (!string2.equalsIgnoreCase(string)) continue;
            this.ttn_4(string2);
            return;
        }
    }

    public boolean thnth(String string) {
        return this.tyl != null && ((String)this.tyl).equalsIgnoreCase(string);
    }

    @Override
    public String ttj() {
        return (String)this.tyl;
    }

    @Override
    public void tnz(String string) {
        if (string != null) {
            this.rfz(string.trim());
        }
    }

    private static String[] ubmxb52cen6d5i(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yjpgnjj2ny5lbw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ e8jyvpao ^ string.hashCode()) + (n2 + o58haqc68tc) + i ^ e8jyvpao, 16) + o58haqc68tc);
            }
            String[] stringArray = ra_2.ubmxb52cen6d5i(new String(cArray));
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

