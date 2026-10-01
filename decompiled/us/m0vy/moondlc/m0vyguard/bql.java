/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import us.m0vy.moondlc.m0vyguard.ttk;

public interface bql<T extends ttk> {
    public void onEvent(ttk var1);

    default public int getPriority() {
        return 0;
    }
}

