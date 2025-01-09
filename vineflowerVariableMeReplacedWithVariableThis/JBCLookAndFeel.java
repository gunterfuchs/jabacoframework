package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;

public class JBCLookAndFeel extends WindowsLookAndFeel implements VB.IJabacoClass {
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         setDefaultLookAndFeel();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setDefaultLookAndFeel() {
      Throwable Err = null;

      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean setJabacoLookAndFeel(String v) {
      boolean setJabacoLookAndFeel = false;
      Throwable Err = null;

      try {
         UIManager.setLookAndFeel(v);
         setJabacoLookAndFeel = true;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return setJabacoLookAndFeel;
      }

      return setJabacoLookAndFeel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean isInitialized() {
      boolean isInitialized = false;
      Throwable Err = null;

      try {
         isInitialized = true;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return isInitialized;
      }

      return isInitialized;
   }

   public JBCLookAndFeel() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
   }
}
