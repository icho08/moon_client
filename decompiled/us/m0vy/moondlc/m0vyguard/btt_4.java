/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.platform.win32.WinDef$DWORD
 *  com.sun.jna.platform.win32.WinDef$HWND
 *  com.sun.jna.win32.StdCallLibrary
 */
package us.m0vy.moondlc.m0vyguard;

import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;

public interface btt_4
extends StdCallLibrary {
    public static final btt_4 INSTANCE;

    public boolean SetWindowDisplayAffinity(WinDef.HWND var1, WinDef.DWORD var2);
}

