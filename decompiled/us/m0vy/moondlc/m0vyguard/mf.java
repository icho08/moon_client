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
import us.m0vy.moondlc.m0vyguard.bkhz_2;
import us.m0vy.moondlc.m0vyguard.tthy;

public class mf
extends class_276
implements tthy,
bkhz_2 {
    private boolean khshn;
    private float stj = 1.0f;
    private int than_2 = -1;
    private int tzf_2 = -1;
    private static final int hsj14j38c = -1609708633;
    private static final int wbpej53pl = -232627643;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mooiui6ssk8n59;

    public mf(boolean bl) {
        super(bl);
    }

    public mf(int n, int n2, boolean bl) {
        super(bl);
        this.method_1234(n, n2);
    }

    public mf setLinear() {
        this.khshn = true;
        RenderSystem.recordRenderCall(this::lambda$setLinear$0);
        return this;
    }

    public mf setDownscale(float f) {
        this.stj = Math.max(0.1f, Math.min(1.0f, f));
        return this;
    }

    public mf setFixedSize(int n, int n2) {
        this.than_2 = Math.max(n, 1);
        this.tzf_2 = Math.max(n2, 1);
        return this;
    }

    public void method_58226(int n) {
        super.method_58226(this.khshn ? 9729 : n);
    }

    private void resizeFramebuffer() {
        if (this.needsNewFramebuffer()) {
            int n = this.targetWidth();
            int n2 = this.targetHeight();
            this.method_1231(n, n2);
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
        return this.field_1482 != this.targetWidth() || this.field_1481 != this.targetHeight();
    }

    private int targetWidth() {
        int n = this.than_2 > 0 ? this.than_2 : bdn_2.method_4486();
        return Math.max((int)Math.floor((float)n * this.stj), 1);
    }

    private int targetHeight() {
        int n = this.tzf_2 > 0 ? this.tzf_2 : bdn_2.method_4502();
        return Math.max((int)Math.floor((float)n * this.stj), 1);
    }

    private void lambda$setLinear$0() {
        if (this.method_30277() > 0) {
            this.method_58226(9729);
        }
    }

    private static String[] up0vtjn52i(String string) {
        return string.split("\u0001\u0010", -1);
    }

    private static CallSite xx0b26ckh0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hsj14j38c ^ string.hashCode() ^ n2 + wbpej53pl + i * 1809981899) + hsj14j38c) ^ wbpej53pl));
            }
            String[] stringArray = mf.up0vtjn52i(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

