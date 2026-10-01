/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 */
package us.movy.moondlc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.Locale;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public final class OfflineDefaults
implements PreLaunchEntrypoint {
    public void onPreLaunch() {
        OfflineDefaults.setDefault("moondlc.launcher.present", "1");
        OfflineDefaults.setDefault("moondlc.launcher.pid", "1234");
        OfflineDefaults.setDefault("moondlc.auth.username", "Admin");
        OfflineDefaults.setDefault("moondlc.auth.hwid", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        OfflineDefaults.setDefault("moondlc.auth.ticket", "test-ticket-1");
        OfflineDefaults.setDefault("moondlc.auth.uid", "1");
        OfflineDefaults.setDefault("moondlc.auth.plan", "default");
        OfflineDefaults.setDefault("moondlc.auth.expiry", "2000000000");
        OfflineDefaults.installProxyGuard();
        System.out.println("[MoonDLC] Embedded properties active: launcher.present=" + System.getProperty("moondlc.launcher.present") + ", auth.username=" + System.getProperty("moondlc.auth.username") + ", auth.uid=" + System.getProperty("moondlc.auth.uid"));
    }

    private static void setDefault(String string, String string2) {
        if (System.getProperty(string) == null) {
            System.setProperty(string, string2);
        }
    }

    private static void installProxyGuard() {
        final ProxySelector proxySelector = ProxySelector.getDefault();
        ProxySelector.setDefault(new ProxySelector(){

            @Override
            public List<Proxy> select(URI uRI) {
                OfflineDefaults.check(uRI);
                return proxySelector == null ? List.of(Proxy.NO_PROXY) : proxySelector.select(uRI);
            }

            @Override
            public void connectFailed(URI uRI, SocketAddress socketAddress, IOException iOException) {
                if (proxySelector != null) {
                    proxySelector.connectFailed(uRI, socketAddress, iOException);
                }
            }
        });
    }

    public static URI check(URI uRI) {
        if (uRI != null && OfflineDefaults.isMoonDlc(uRI)) {
            throw new SecurityException("MoonDLC network destination blocked: " + String.valueOf(uRI));
        }
        return uRI;
    }

    public static URL check(URL uRL) {
        if (uRL != null) {
            String string = uRL.getHost().toLowerCase(Locale.ROOT);
            String string2 = uRL.getPath().toLowerCase(Locale.ROOT);
            OfflineDefaults.denyIfMoonDlc(string, string2);
        }
        return uRL;
    }

    public static URLConnection check(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            OfflineDefaults.check(uRLConnection.getURL());
        }
        return uRLConnection;
    }

    public static HttpURLConnection check(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            OfflineDefaults.check(httpURLConnection.getURL());
        }
        return httpURLConnection;
    }

    public static HttpRequest check(HttpRequest httpRequest) {
        if (httpRequest != null) {
            OfflineDefaults.check(httpRequest.uri());
        }
        return httpRequest;
    }

    private static boolean isMoonDlc(URI uRI) {
        String string = uRI.getHost();
        if (string == null) {
            return false;
        }
        String string2 = uRI.getPath();
        return OfflineDefaults.blocked(string.toLowerCase(Locale.ROOT), string2 == null ? "" : string2.toLowerCase(Locale.ROOT));
    }

    private static void denyIfMoonDlc(String string, String string2) {
        if (OfflineDefaults.blocked(string, string2)) {
            throw new SecurityException("MoonDLC network destination blocked: " + string + string2);
        }
    }

    private static boolean blocked(String string, String string2) {
        if (string.contains("moondlc") || string.contains("moon-dlc")) {
            return true;
        }
        if (string.equals("movy.us") || string.endsWith(".movy.us")) {
            return true;
        }
        return string2.contains("/moondlc/") || string2.endsWith("/moondlc") || string2.contains("/moon-dlc/") || string2.endsWith("/moon-dlc");
    }
}

