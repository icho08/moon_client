/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Supplier;
import us.m0vy.moondlc.m0vyguard.bmt;

public class bhd
extends bmt {
    private static final int zhfj9rd14h0x = -1313306576;
    private static final int g4n9s0su4qvnl = 497736061;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int goxaj8qig;

    public bhd(String string, String string2) {
        super(string);
        this.jsn_2 = string2;
    }

    public bhd td_3(String string) {
        this.bth(string);
        return this;
    }

    public void bth(String string) {
        if (this.hlj(string)) {
            return;
        }
        super.bth(string);
        this.zkhn();
    }

    @Override
    public bhd qh(Supplier supplier) {
        return (bhd)super.qh(supplier);
    }

    @Override
    public bhd dk(Runnable runnable) {
        return (bhd)super.dk(runnable);
    }

    private static String[] aubw76p0tsub69(String string) {
        return string.split("\u0002\u0010", -1);
    }

    private static CallSite yz8iwcrg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zhfj9rd14h0x ^ string.hashCode() ^ n2 + g4n9s0su4qvnl ^ i * 921114049 ^ zhfj9rd14h0x, 25) ^ g4n9s0su4qvnl));
            }
            String[] stringArray = bhd.aubw76p0tsub69(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

