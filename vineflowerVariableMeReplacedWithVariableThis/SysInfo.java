package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Constants;
import VBA.Conversion;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.net.URLConnection;

public class SysInfo implements VB.IJabacoClass {
   private boolean useProxy;
   private String ProxyUser;
   private String ProxyPassword;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SetProxy(String host, long port, String user, String password) {
      Throwable Err = null;

      try {
         System.getProperties().put((String)"proxySet", (String)"true");
         System.getProperties().put((String)"proxyHost", (String)host);
         System.getProperties().put((String)"proxyPort", (String)Conversion.CStr(VBVariant.valueOf(port)));
         useProxy = true;
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SetProxyToConnection(URLConnection c) {
      Throwable Err = null;

      try {
         c.setRequestProperty("Proxy-Authorization", "");
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean IsProxy() {
      boolean IsProxy = false;
      Throwable Err = null;

      try {
         IsProxy = useProxy;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return IsProxy;
      }

      return IsProxy;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Window FocusedWindow() {
      Window FocusedWindow = null;
      Throwable Err = null;

      try {
         FocusedWindow = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusedWindow();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return FocusedWindow;
      }

      return FocusedWindow;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Component FocusedComponent() {
      Component FocusedComponent = null;
      Throwable Err = null;

      try {
         FocusedComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return FocusedComponent;
      }

      return FocusedComponent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private String NormString(String v) {
      String NormString = "";
      Throwable Err = null;

      try {
         if (Strings.StrComp(v, null) == 0) {
            v = Constants.vbNullString;
         }

         NormString = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return NormString;
      }

      return NormString;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $OperatingSystem() {
      String $OperatingSystem = "";
      Throwable Err = null;

      try {
         $OperatingSystem = NormString(System.getProperty("os.name"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $OperatingSystem;
      }

      return $OperatingSystem;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $SecurityMode() {
      boolean $SecurityMode = false;
      Throwable Err = null;

      try {
         $SecurityMode = $AppletMode();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $SecurityMode;
      }

      return $SecurityMode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $AppletMode() {
      boolean $AppletMode = false;
      Throwable Err = null;

      try {
         $AppletMode = Strings.Len($Browser()) > 0;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $AppletMode;
      }

      return $AppletMode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Architecture() {
      String $Architecture = "";
      Throwable Err = null;

      try {
         $Architecture = NormString(System.getProperty("os.arch"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Architecture;
      }

      return $Architecture;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $JavaVersion() {
      String $JavaVersion = "";
      Throwable Err = null;

      try {
         $JavaVersion = NormString(System.getProperty("java.vm.version"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $JavaVersion;
      }

      return $JavaVersion;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $JavaVendor() {
      String $JavaVendor = "";
      Throwable Err = null;

      try {
         $JavaVendor = NormString(System.getProperty("java.vm.vendor"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $JavaVendor;
      }

      return $JavaVendor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $JavaRuntimeVersion() {
      String $JavaRuntimeVersion = "";
      Throwable Err = null;

      try {
         $JavaRuntimeVersion = NormString(System.getProperty("java.runtime.version"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $JavaRuntimeVersion;
      }

      return $JavaRuntimeVersion;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Browser() {
      String $Browser = "";
      Throwable Err = null;

      try {
         $Browser = NormString(System.getProperty("browser"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Browser;
      }

      return $Browser;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $BrowserVersion() {
      String $BrowserVersion = "";
      Throwable Err = null;

      try {
         $BrowserVersion = NormString(System.getProperty("browser.version"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $BrowserVersion;
      }

      return $BrowserVersion;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $LineSeperator() {
      String $LineSeperator = "";
      Throwable Err = null;

      try {
         $LineSeperator = NormString(System.getProperty("line.separator"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $LineSeperator;
      }

      return $LineSeperator;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $LineSeperator(String v) {
      Throwable Err = null;

      try {
         System.setProperty("line.separator", v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $PathSeperator() {
      String $PathSeperator = "";
      Throwable Err = null;

      try {
         $PathSeperator = NormString(System.getProperty("path.separator"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $PathSeperator;
      }

      return $PathSeperator;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Username() {
      String $Username = "";
      Throwable Err = null;

      try {
         $Username = NormString(System.getProperty("user.name"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Username;
      }

      return $Username;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $HomeDirectory() {
      String $HomeDirectory = "";
      Throwable Err = null;

      try {
         $HomeDirectory = NormString(System.getProperty("user.home"));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $HomeDirectory;
      }

      return $HomeDirectory;
   }

   public SysInfo() {
      initVars();
   }

   private void initVars() {
      useProxy = false;
      ProxyUser = "";
      ProxyPassword = "";
   }
}
