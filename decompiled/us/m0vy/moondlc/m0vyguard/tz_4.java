/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.platform.win32.WinDef$DWORD
 *  com.sun.jna.platform.win32.WinDef$HWND
 *  com.sun.jna.platform.win32.WinDef$LPVOID
 *  com.sun.jna.platform.win32.WinNT$HRESULT
 *  com.sun.jna.win32.StdCallLibrary
 */
package us.m0vy.moondlc.m0vyguard;

import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.win32.StdCallLibrary;

public interface tz_4
extends StdCallLibrary {
    public static final tz_4 INSTANCE;

    public WinNT.HRESULT DwmSetWindowAttribute(WinDef.HWND var1, WinDef.DWORD var2, WinDef.LPVOID var3, WinDef.DWORD var4);
}

