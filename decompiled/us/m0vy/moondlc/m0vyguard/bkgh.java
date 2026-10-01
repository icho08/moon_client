/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_276
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_276;
import us.m0vy.moondlc.m0vyguard.bdr_2;

public class bkgh
extends class_276
implements bdr_2 {
    private boolean smkh;
    private static final int xbmbc9n9 = -1857407078;
    private static final int s59lqu294bz = -1838270309;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int u3t9oq93ms42;

    public bkgh(boolean bl) {
        super(bl);
    }

    public bkgh(int n, int n2, boolean bl) {
        super(bl);
        this.method_1234(n, n2);
    }

    public bkgh setLinear() {
        this.smkh = true;
        RenderSystem.recordRenderCall(this::lambda$setLinear$0);
        return this;
    }

    public void method_58226(int n) {
        super.method_58226(this.smkh ? 9729 : n);
    }

    private void resizeFramebuffer() {
        if (this.needsNewFramebuffer()) {
            this.method_1231(Math.max(zak.method_4480(), 1), Math.max(zak.method_4507(), 1));
        }
    }

    public void setup(boolean bl) {
        this.resizeFramebuffer();
        if (bl) {
            this.method_1230();
        }
        this.method_1235(false);
    }

    public void setup() {
        this.setup(true);
    }

    public void stop() {
        this.method_1240();
        mc.method_1522().method_1235(true);
    }

    private boolean needsNewFramebuffer() {
        return this.field_1482 != zak.method_4480() || this.field_1481 != zak.method_4507();
    }

    private void lambda$setLinear$0() {
        this.method_58226(9729);
    }

    private static String[] e6q65mprp1e(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bazzlmlsi4aamb(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ xbmbc9n9 ^ string.hashCode() ^ n2 + s59lqu294bz ^ i * 297839305 ^ xbmbc9n9, 17) ^ s59lqu294bz));
            }
            String[] stringArray = bkgh.e6q65mprp1e(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

