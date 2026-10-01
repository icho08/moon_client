/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.util.function.Supplier;
import us.m0vy.moondlc.m0vyguard.bqs;

final class bqs$$Lambda
implements Supplier {
    private final bqs arg$1;
    private final Class arg$2;

    private bqs$$Lambda(bqs bqs2, Class clazz) {
        this.arg$1 = bqs2;
        this.arg$2 = clazz;
    }

    public Object get() {
        return this.arg$1.ztht_2(this.arg$2);
    }
}

