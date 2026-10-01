/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.db;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dy;

public abstract class bkhn
implements dl {
    private final String dhql;
    public int khnw = 1;
    private static final int khkh = -402380049;
    private static final int rkhs_2 = 14559772;
    private static final int aku14rpo7jo = -1035245371;
    private static final int xam6bs81sd0 = 862966100;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int c4cbi6pdtr21;

    public bkhn() {
        dy dy2 = this.getClass().getAnnotation(dy.class);
        this.dhql = dy2.name();
    }

    public abstract void rda_2(LiteralArgumentBuilder var1);

    public final void thzt_4(CommandDispatcher commandDispatcher) {
        int n = db.ghshr(1019052468);
        CommandDispatcher commandDispatcher2 = commandDispatcher;
        n = (commandDispatcher2 != null ? System.identityHashCode(commandDispatcher2) : 0) ^ n;
        int n2 = n ^ 0x8ABF51E2;
        if ((n2 ^ n) != -1967173150) {
            int cfr_ignored_0 = (Integer.rotateRight(0xB602D056 ^ n, 9) - 246733221) * -1241329577;
        }
        LiteralArgumentBuilder literalArgumentBuilder = LiteralArgumentBuilder.literal((String)this.dhql);
        bkhn.zan_2(this, literalArgumentBuilder);
        commandDispatcher.register(literalArgumentBuilder);
    }

    public static RequiredArgumentBuilder hths(String string, ArgumentType argumentType) {
        block0: {
            int n = 1906232473;
            n = Integer.rotateLeft(n * -2107670493, 7) ^ 0x76FDC14A;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
            int n2 = n ^ 0xD68F701;
            if ((n2 ^ n) == 224982785) break block0;
            int cfr_ignored_0 = (0x7CF63B98 ^ n) - 522144126;
        }
        return bkhn.dhghth(string, argumentType);
    }

    public static LiteralArgumentBuilder ddd_5(String string) {
        block0: {
            int n = 75336222;
            int n2 = (n = Integer.rotateLeft(n * -283629733, 28) ^ 0x7952FFF9) ^ 0xC447567B;
            if ((n2 ^ n) == -1001957765) break block0;
            int cfr_ignored_0 = (0xC03ADC65 ^ n) + 223656218;
        }
        return LiteralArgumentBuilder.literal((String)string);
    }

    @Generated
    public String getName() {
        block0: {
            int n = -583779402;
            n = Integer.rotateLeft(n * 1664268485, 16) ^ 0xCD9A3735;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0xB8F6D1FB;
            if ((n2 ^ n) == -1191783941) break block0;
            int cfr_ignored_0 = (0x65C2EA4D ^ n) - -1608650010;
        }
        return this.dhql;
    }

    @Generated
    public int thtf_2() {
        block0: {
            int n = -499682735;
            n = Integer.rotateLeft(n * 1362230761, 14) ^ 0x9551034E;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x77225382;
            if ((n2 ^ n) == 1998738306) break block0;
            int cfr_ignored_0 = (0x951521D3 ^ n) + -1812037884;
        }
        return this.khnw;
    }

    private static void zan_2(bkhn bkhn2, LiteralArgumentBuilder literalArgumentBuilder) {
        int n = 1014001807;
        n = Integer.rotateLeft(n * 1370947535, 16) ^ 0x2153BD1C;
        bkhn bkhn3 = bkhn2;
        n = Integer.rotateLeft((bkhn3 != null ? System.identityHashCode(bkhn3) : 0) ^ n, 28);
        int n2 = n ^ 0x2B0D56A3;
        if ((n2 ^ n) != 722294435) {
            int cfr_ignored_0 = (0x177D262C ^ n) + -1896241244;
        }
        bkhn2.rda_2(literalArgumentBuilder);
    }

    private static RequiredArgumentBuilder dhghth(String string, ArgumentType argumentType) {
        block0: {
            int n = db.ghshr(-1575477569);
            ArgumentType argumentType2 = argumentType;
            n = (argumentType2 != null ? System.identityHashCode(argumentType2) : 0) ^ n;
            int n2 = n ^ 0xBD24567A;
            if ((n2 ^ n) == -1121692038) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x1F3C48C5 ^ n, 6) - -861245674;
            int cfr_ignored_1 = (int)(0xDD8EE6F827D4EB4FL ^ (long)n ^ 0x3080831A2DB816CCL);
        }
        return RequiredArgumentBuilder.argument((String)string, (ArgumentType)argumentType);
    }

    private static String[] zrs(String string) {
        int n = -1206256936;
        int n2 = (n = Integer.rotateLeft(n * -1198316339, 12) ^ 0xB7700E73) ^ 0x1A3977AE;
        if ((n2 ^ n) != 439973806) {
            int cfr_ignored_0 = (0xA2208D76 ^ n) - 1593303911;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite zkh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 729359295;
            n3 = Integer.rotateLeft(n3 * 1554010031, 21) ^ 0xB5DD57A8;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 17);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 25);
            int n4 = n3 ^ 0x1FAACDB6;
            if ((n4 ^ n3) != 531287478) {
                int cfr_ignored_0 = (0x34D3EE09 ^ n3) - 1894470370;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ khkh ^ string.hashCode()) + (n2 + rkhs_2) + i ^ khkh, 14) + rkhs_2);
            }
            String[] stringArray = bkhn.zrs(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType3) : lookup.findVirtual(clazz, stringArray[0], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] v0d9m98okf3geh(String string) {
        return string.split("\b\u0018", -1);
    }

    private static CallSite w7s9e9it7u3i(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ aku14rpo7jo ^ string.hashCode()) + (n2 + xam6bs81sd0) + i ^ aku14rpo7jo, 6) + xam6bs81sd0);
            }
            String[] stringArray = bkhn.v0d9m98okf3geh(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

