package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import java.awt.Color;

public class VBToolBarItem extends VB.CommandButton implements VB.IJabacoClass, VB.IToolBarItem {
   private String myControlID;
   private VB.VBToolBar myToolBar;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBToolBarItem(VB.VBToolBar refToolBar) {
      Throwable Err = null;
      super();
      initVarsI();

      try {
         myToolBar = refToolBar;
         Class_Initialize();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getBackground() {
      Color getBackground = null;
      Throwable Err = null;

      try {
         if (myToolBar != null) {
            getBackground = myToolBar.getBackground();
         } else {
            getBackground = super.getBackground();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getBackground;
      }

      return getBackground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getForeground() {
      Color getForeground = null;
      Throwable Err = null;

      try {
         if (myToolBar != null) {
            getForeground = myToolBar.getForeground();
         } else {
            getForeground = super.getForeground();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getForeground;
      }

      return getForeground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public String $ControlID() {
      String $ControlID = "";
      Throwable Err = null;

      try {
         $ControlID = myControlID;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ControlID;
      }

      return $ControlID;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $ControlID(String s) {
      Throwable Err = null;

      try {
         myControlID = s;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         super.setRolloverEnabled(true);
         super.$Parent().setFocusable(false);
         super.$Parent().setRolloverEnabled(true);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVarsI() {
      myControlID = "";
      myToolBar = null;
   }
}
