/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.util.function.BooleanSupplier;
import us.m0vy.moondlc.m0vyguard.tjs;

final class tjs$$Lambda
implements BooleanSupplier {
    private final tjs arg$1;

    private tjs$$Lambda(tjs tjs2) {
        this.arg$1 = tjs2;
    }

    @Override
    public boolean getAsBoolean() {
        return this.arg$1.shz_8();
    }
}

