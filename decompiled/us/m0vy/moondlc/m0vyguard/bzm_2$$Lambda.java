/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import us.m0vy.moondlc.m0vyguard.bzm_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.shd_6;

final class bzm$$Lambda
implements shd_6 {
    private final bkt arg$1;

    private bzm$$Lambda(bkt bkt2) {
        this.arg$1 = bkt2;
    }

    @Override
    public bkt getDefaultColor() {
        return bzm_2.blw(this.arg$1);
    }
}

