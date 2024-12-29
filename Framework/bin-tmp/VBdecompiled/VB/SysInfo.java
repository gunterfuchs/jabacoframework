/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VBA.Constants;
import VBA.Conversion;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.net.URLConnection;
import java.util.Hashtable;

public class SysInfo
implements IJabacoClass {
    private boolean useProxy;
    private String ProxyUser;
    private String ProxyPassword;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void SetProxy(String host, long port, String user, String password) {
        Throwable Err = null;
        try {
            ((Hashtable)System.getProperties()).put((Object)"proxySet", (Object)"true");
            ((Hashtable)System.getProperties()).put((Object)"proxyHost", (Object)host);
            ((Hashtable)System.getProperties()).put((Object)"proxyPort", (Object)Conversion.CStr(VBVariant.valueOf(port)));
            Me.useProxy = true;
            return;
        }
        catch (Throwable throwable) {
            Object var7_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void SetProxyToConnection(URLConnection c) {
        Throwable Err = null;
        try {
            c.setRequestProperty("Proxy-Authorization", "");
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean IsProxy() {
        boolean IsProxy = false;
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.useProxy;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return IsProxy;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Window FocusedWindow() {
        Window FocusedWindow = null;
        Throwable Err = null;
        try {
            return KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusedWindow();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return FocusedWindow;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Component FocusedComponent() {
        Component FocusedComponent = null;
        Throwable Err = null;
        try {
            return KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return FocusedComponent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String NormString(String v) {
        String NormString = "";
        Throwable Err = null;
        try {
            if (Strings.StrComp(v, null) == 0) {
                v = Constants.vbNullString;
            }
            return v;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return NormString;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $OperatingSystem() {
        String $OperatingSystem = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("os.name"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $OperatingSystem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $SecurityMode() {
        boolean $SecurityMode = false;
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.$AppletMode();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SecurityMode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $AppletMode() {
        boolean $AppletMode = false;
        Throwable Err = null;
        try {
            SysInfo Me;
            if (Strings.Len(Me.$Browser()) > 0) return true;
            return false;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AppletMode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Architecture() {
        String $Architecture = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("os.arch"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Architecture;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $JavaVersion() {
        String $JavaVersion = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("java.vm.version"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $JavaVersion;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $JavaVendor() {
        String $JavaVendor = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("java.vm.vendor"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $JavaVendor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $JavaRuntimeVersion() {
        String $JavaRuntimeVersion = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("java.runtime.version"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $JavaRuntimeVersion;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Browser() {
        String $Browser = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("browser"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Browser;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $BrowserVersion() {
        String $BrowserVersion = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("browser.version"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BrowserVersion;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $LineSeperator() {
        String $LineSeperator = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("line.separator"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $LineSeperator;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $LineSeperator(String v) {
        Throwable Err = null;
        try {
            System.setProperty("line.separator", v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $PathSeperator() {
        String $PathSeperator = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("path.separator"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $PathSeperator;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Username() {
        String $Username = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("user.name"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Username;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $HomeDirectory() {
        String $HomeDirectory = "";
        Throwable Err = null;
        try {
            SysInfo Me;
            return Me.NormString(System.getProperty("user.home"));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HomeDirectory;
    }

    public SysInfo() {
        SysInfo Me;
        Me.initVars();
    }

    private void initVars() {
        Me.useProxy = false;
        Me.ProxyUser = "";
        Me.ProxyPassword = "";
    }
}
