package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Information;
import VBA.Interaction;
import java.awt.Graphics;
import javax.swing.JDesktopPane;

public class MDIForm extends VB.AbstractForm implements VB.IJabacoForm {
   private JDesktopPane myDesktop;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public MDIForm() {
      Throwable Err = null;
      super();
      initVarsI();

      try {
         VB.Global.setGlobalMDIForm(this);
         super.getContentPane().add(myDesktop);
         myDesktop.setDoubleBuffered(true);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void addChild(VB.MDIChild refChild) {
      Throwable Err = null;

      try {
         myDesktop.add(refChild);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColor() {
      long $BackColor = 0L;
      Throwable Err = null;

      try {
         $BackColor = Information.ColorToRGB(myDesktop.getBackground());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColor;
      }

      return $BackColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColor(long v) {
      Throwable Err = null;

      try {
         myDesktop.setBackground(Information.RGBtoColor(v));
         super.setBackground(Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.MDIChild $ActiveForm() {
      VB.MDIChild $ActiveForm = null;
      Throwable Err = null;

      try {
         $ActiveForm = (VB.MDIChild)myDesktop.getSelectedFrame();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ActiveForm;
      }

      return $ActiveForm;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ActiveForm(VB.MDIChild v) {
      Throwable Err = null;

      try {
         myDesktop.setSelectedFrame(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public void Form_Activate() {
      Throwable Err = null;
   }

   @Override
   public void Form_Deactivate() {
      Throwable Err = null;
   }

   @Override
   public void Form_GotFocus() {
      Throwable Err = null;
   }

   @Override
   public void Form_LostFocus() {
      Throwable Err = null;
   }

   @Override
   public void Form_Load() {
      Throwable Err = null;
   }

   @Override
   public void Form_Resize() {
      Throwable Err = null;
   }

   @Override
   public void Form_Move() {
      Throwable Err = null;
   }

   @Override
   public void Form_MenuClick(VB.IMenuItem MenuItem) {
      Throwable Err = null;
   }

   @Override
   public void Form_ToolBarClick(VB.IToolBarItem ToolBarItem) {
      Throwable Err = null;
   }

   public void Form_Click() {
      Throwable Err = null;
   }

   public void Form_DblClick() {
      Throwable Err = null;
   }

   @Override
   public void Form_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   @Override
   public void Form_KeyPress(int KeyAscii) {
      Throwable Err = null;
   }

   @Override
   public void Form_KeyUp(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   public void Form_MouseDown(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Form_MouseMove(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Form_MouseUp(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Form_Paint(Graphics g) {
      Throwable Err = null;
   }

   @Override
   public int Form_Unload() {
      int Form_Unload = 0;
      Throwable Err = null;
      return Form_Unload;
   }

   private void initVarsI() {
      myDesktop = new JDesktopPane();
   }
}
