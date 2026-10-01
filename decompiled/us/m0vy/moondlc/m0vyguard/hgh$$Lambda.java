/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.util.function.Predicate;
import us.m0vy.moondlc.m0vyguard.hgh;
import us.m0vy.moondlc.m0vyguard.wy;

final class hgh$$Lambda
implements Predicate {
    private final long arg$1;

    private hgh$$Lambda(long l) {
        this.arg$1 = l;
    }

    public boolean test(Object object) {
        return hgh.jba_2(this.arg$1, (wy)object);
    }
}

