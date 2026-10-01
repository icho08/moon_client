/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.util.function.Predicate;
import us.m0vy.moondlc.m0vyguard.qsh;
import us.m0vy.moondlc.m0vyguard.nd;

final class qsh$$Lambda
implements Predicate {
    private final long arg$1;
    private final int arg$2;

    private qsh$$Lambda(long l, int n) {
        this.arg$1 = l;
        this.arg$2 = n;
    }

    public boolean test(Object object) {
        return qsh.hwth(this.arg$1, this.arg$2, (nd)object);
    }
}

