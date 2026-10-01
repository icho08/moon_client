/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bghz;
import us.m0vy.moondlc.m0vyguard.bha_3;
import us.m0vy.moondlc.m0vyguard.try_2;

public final class bta_2 {
    private final int dhlj;
    private final float khsh;
    private final float rar_2;
    private final float hst_2;
    private final float dhqkh;
    private final float hbq;
    private final float dhdt_2;
    private final float hash_2;
    private final float hdhk;
    private static final int v1bd6jnb2rvo = -203469111;
    private static final int tfm38c3 = -67203993;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rgz31gegjyy9;

    public bta_2(try_2 try2, float f, float f2) {
        this.dhlj = try2.unicode();
        this.hbq = try2.advance();
        bha_3 bha2_2 = try2.atlasBounds();
        if (bha2_2 != null) {
            this.khsh = bha2_2.left() / f;
            this.rar_2 = bha2_2.right() / f;
            this.hst_2 = 1.0f - bha2_2.top() / f2;
            this.dhqkh = 1.0f - bha2_2.bottom() / f2;
        } else {
            this.dhqkh = 0.0f;
            this.hst_2 = 0.0f;
            this.rar_2 = 0.0f;
            this.khsh = 0.0f;
        }
        bha_3 bha3_2 = try2.planeBounds();
        if (bha3_2 != null) {
            this.hash_2 = bha3_2.right() - bha3_2.left();
            this.hdhk = bha3_2.top() - bha3_2.bottom();
            this.dhdt_2 = bha3_2.top();
        } else {
            this.dhdt_2 = 0.0f;
            this.hdhk = 0.0f;
            this.hash_2 = 0.0f;
        }
    }

    public float tdd_2(Matrix4f matrix4f, class_4588 class_45882, float f, float f2, float f3, float f4, int n) {
        int n2 = 2029897898;
        n2 = Integer.rotateLeft(n2 * -845887669, 10) ^ 0xBC1DE809;
        n2 = System.identityHashCode(this) ^ n2;
        class_4588 class_45883 = class_45882;
        n2 = Integer.rotateRight((class_45883 != null ? System.identityHashCode(class_45883) : 0) ^ n2, 6);
        int n3 = n2 ^ 0x5E914A12;
        if ((n3 ^ n2) != 1586579986) {
            int cfr_ignored_0 = (0x266C82B8 ^ n2) + 612623601;
        }
        float f5 = this.hash_2 * f;
        float f6 = this.hdhk * f;
        class_45882.method_22918(matrix4f, f2, f3 -= this.dhdt_2 * f, f4).method_22913(this.khsh, this.hst_2).method_39415(n);
        class_45882.method_22918(matrix4f, f2, f3 + f6, f4).method_22913(this.khsh, this.dhqkh).method_39415(n);
        class_45882.method_22918(matrix4f, f2 + f5, f3 + f6, f4).method_22913(this.rar_2, this.dhqkh).method_39415(n);
        class_45882.method_22918(matrix4f, f2 + f5, f3, f4).method_22913(this.rar_2, this.hst_2).method_39415(n);
        return this.hbq * f;
    }

    public float jlz(float f) {
        block0: {
            int n = bghz.ddm_4(-1128242185);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 4);
            int n2 = n ^ 0xC7CA5763;
            if ((n2 ^ n) == -943040669) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x7B0A3494 ^ n, 18) - -359006937) * 2064266389;
        }
        return this.hbq * f;
    }

    public int jms() {
        block0: {
            int n = bghz.ddm_4(-322238228);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
            int n2 = n ^ 0x71E3C143;
            if ((n2 ^ n) == 1910751555) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9D28C9AF ^ n, 6) - 206441324;
        }
        return this.dhlj;
    }

    private static String[] nwm200lllquznh(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite lonmw6pn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ v1bd6jnb2rvo ^ string.hashCode() ^ n2 + tfm38c3 ^ i * -1771273227 ^ v1bd6jnb2rvo, 15) ^ tfm38c3));
            }
            String[] stringArray = bta_2.nwm200lllquznh(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

