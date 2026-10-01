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
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import us.m0vy.moondlc.m0vyguard.bdn;

public class tkhth
extends bdn {
    private final List shyb;
    private static final int y8ga5kxmfa = 1280183549;
    private static final int knc6i67g = -1375699565;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yiofsg5unh2;

    public tkhth(String string, List list, Set set) {
        super(string, new HashSet(set));
        this.shyb = new ArrayList(list);
    }

    public List rrw() {
        return this.shyb;
    }

    public boolean akhj(String string) {
        return ((Set)this.tyl).contains(string);
    }

    public void srgh(String string) {
        HashSet<String> hashSet = new HashSet<String>((Collection)this.tyl);
        if (hashSet.contains(string)) {
            hashSet.remove(string);
        } else {
            hashSet.add(string);
        }
        this.ttn_4(hashSet);
    }

    @Override
    public String ttj() {
        return String.join((CharSequence)",", (Iterable)this.tyl);
    }

    @Override
    public void tnz(String string) {
        if (string != null && !string.trim().isEmpty()) {
            String[] stringArray;
            HashSet<String> hashSet = new HashSet<String>();
            for (String string2 : stringArray = string.split(",")) {
                String string3 = string2.trim();
                if (!this.shyb.contains(string3)) continue;
                hashSet.add(string3);
            }
            this.ttn_4(hashSet);
        }
    }

    private static String[] iss2ett6ibaajq(String string) {
        return string.split("\u0003\u0010", -1);
    }

    private static CallSite vo2f5q9je5kk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ y8ga5kxmfa ^ string.hashCode() ^ n2 + knc6i67g ^ i * -854943989 ^ y8ga5kxmfa, 13) ^ knc6i67g));
            }
            String[] stringArray = tkhth.iss2ett6ibaajq(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

