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
import us.m0vy.moondlc.m0vyguard.tsw;

public class tzdh
extends tsw {
    private final boolean shnkh;
    private static final int fv3vox3z = 355930468;
    private static final int h547fak7ab = 629718736;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fitlqlc7;

    public tzdh(String string, String string2, List list, List list2, boolean bl) {
        super(string);
        this.shnkh = bl;
        this.values((String[])list.toArray(tzdh::sdh_9));
        if (list2 != null && !list2.isEmpty()) {
            this.td_3((String)list2.getFirst());
        }
    }

    public boolean jths_2(String string) {
        return this.hrsh(string);
    }

    public String jbkh() {
        return (String)this.dms_4();
    }

    public List tmf_2() {
        return List.of((String)this.dms_4());
    }

    public boolean thrd_2() {
        return this.shnkh;
    }

    private static String[] sdh_9(int n) {
        return new String[n];
    }

    private static String[] pef79zm6d4c3(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite tvmfm77yv9qd3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ fv3vox3z ^ string.hashCode()) + (n2 + h547fak7ab) + i ^ fv3vox3z, 22) + h547fak7ab);
            }
            String[] stringArray = tzdh.pef79zm6d4c3(new String(cArray));
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

