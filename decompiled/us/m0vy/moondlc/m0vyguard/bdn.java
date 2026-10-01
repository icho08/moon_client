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
import java.util.List;
import java.util.function.Consumer;
import us.m0vy.moondlc.m0vyguard.msh;

public abstract class bdn {
    private final String trsh;
    protected Object tyl;
    private final List bshb = new ArrayList();
    private static final int r5jfc0g60juy = 808083407;
    private static final int y1xfgl2 = -1620689515;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rookvi0kyb8p6;

    public bdn(String string, Object object) {
        this.trsh = string;
        this.tyl = object;
    }

    public String getName() {
        return this.trsh;
    }

    public Object ghjf() {
        return this.tyl;
    }

    public void ttn_4(Object object) {
        if (this.tyl != null && this.tyl.equals(object)) {
            return;
        }
        this.tyl = object;
        for (Consumer consumer : this.bshb) {
            consumer.accept(object);
        }
        msh.jt_2().ghsd();
    }

    public bdn tyt_3(Consumer consumer) {
        this.bshb.add(consumer);
        return this;
    }

    public abstract String ttj();

    public abstract void tnz(String var1);

    private static String[] r9229aom09(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite lxnsvi6j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ r5jfc0g60juy ^ string.hashCode()) + (n2 + y1xfgl2) + i ^ r5jfc0g60juy, 26) + y1xfgl2);
            }
            String[] stringArray = bdn.r9229aom09(new String(cArray));
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

