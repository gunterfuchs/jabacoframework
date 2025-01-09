package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Constants;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToolBar;

public class VBToolBar extends JToolBar implements VB.IJabacoClass, ActionListener {
   private long myForeColor;
   private long myBackColor;
   private VB.IJabacoForm myOwner;

   public void _Visible(boolean b) {
   }

   public void _Click(VB.IToolBarItem ToolBarItem) {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getBackground() {
      Color getBackground = null;
      Throwable Err = null;

      try {
         if (myOwner != null) {
            getBackground = Information.RGBtoColor(myOwner.$ToolBackColor());
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
         if (myOwner != null) {
            getForeground = Information.RGBtoColor(myOwner.$ToolForeColor());
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
   public Font getFont() {
      Font getFont = null;
      Throwable Err = null;

      try {
         if (myOwner != null) {
            getFont = myOwner.$Font();
         } else {
            getFont = super.getFont();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getFont;
      }

      return getFont;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBToolBar(VB.IJabacoForm Owner) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myOwner = Owner;
         Class_Initialize();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   private void GoClick(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: aconst_null
      // 03: astore 4
      // 05: aload 1
      // 06: checkcast VB/IToolBarItem
      // 09: checkcast VB/IToolBarItem
      // 0c: astore 4
      // 0e: nop
      // 0f: aload 0
      // 10: aload 4
      // 12: invokevirtual VB/VBToolBar._Click (LVB/IToolBarItem;)V
      // 15: nop
      // 16: return
      // 17: nop
      // 18: aload 2
      // 19: checkcast java/lang/Throwable
      // 1c: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 1f: goto 15
      // 22: astore 3
      // 23: astore 2
      // 24: ret 3
      // 26: jsr 22
      // 29: goto 0e
   }

   public void Add(Component Component) {
      Throwable Err = null;
      VB.VBToolBarItem tmpItem = null;

      label72:
      try {
         tmpItem = (VB.VBToolBarItem)Component;
      } finally {
         break label72;
      }

      label69:
      try {
         super.add(Component);
      } finally {
         break label69;
      }

      try {
         $Visible(true);
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Visible() {
      boolean $Visible = false;
      Throwable Err = null;

      try {
         $Visible = isVisible();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Visible;
      }

      return $Visible;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Visible(boolean v) {
      Throwable Err = null;

      try {
         if ($Parent().isVisible() != v) {
            $Parent().setVisible(v);
            if ($Parent().isVisible() == v) {
               _Visible(v);
            }
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JToolBar $Parent() {
      JToolBar $Parent = null;
      Throwable Err = null;

      try {
         $Parent = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Height() {
      int $Height = 0;
      Throwable Err = null;

      try {
         if (!$Visible()) {
            $Height = 0;
         } else {
            $Height = $Parent().getHeight();
            if ($Height == 0) {
               $Height = (int)$Parent().getPreferredSize().getHeight();
            }
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Height;
      }

      return $Height;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void addSeperator() {
      Throwable Err = null;

      try {
         addSeperator(20);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void addSeperator(int width) {
      Throwable Err = null;

      try {
         $Parent().addSeparator();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBToolBarItem createToolBarItem(String ControlID, String Caption) {
      VB.VBToolBarItem createToolBarItem = null;
      Throwable Err = null;

      try {
         createToolBarItem = createToolBarItem(ControlID, Caption, Constants.vbNullString);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return createToolBarItem;
      }

      return createToolBarItem;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBToolBarItem createToolBarItem(String ControlID, String Caption, String ToolTip) {
      VB.VBToolBarItem createToolBarItem = null;
      Throwable Err = null;

      try {
         createToolBarItem = createToolBarItem(ControlID, Caption, ToolTip, null);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return createToolBarItem;
      }

      return createToolBarItem;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBToolBarItem createToolBarItem(String ControlID, String Caption, String ToolTip, IResource IconPath) {
      VB.VBToolBarItem createToolBarItem = null;
      Throwable Err = null;

      try {
         createToolBarItem = createToolBarItem(ControlID, Caption, ToolTip, IconPath, VB.fmPicturePosition.fmPicturePositionLeftCenter);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return createToolBarItem;
      }

      return createToolBarItem;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBToolBarItem createToolBarItem(String ControlID, String Caption, String ToolTip, IResource IconPath, VB.fmPicturePosition IconPosition) {
      VB.VBToolBarItem createToolBarItem = null;
      Throwable Err = null;

      try {
         createToolBarItem = createToolBarItem(ControlID, Caption, ToolTip, IconPath, VB.fmPicturePosition.fmPicturePositionLeftCenter, null);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return createToolBarItem;
      }

      return createToolBarItem;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBToolBarItem createToolBarItem(
      String ControlID, String Caption, String ToolTip, IResource IconPath, VB.fmPicturePosition IconPosition, IResource RolloverIconPath
   ) {
      VB.VBToolBarItem createToolBarItem = null;
      Throwable Err = null;
      VB.VBToolBarItem tmpItem = new VB.VBToolBarItem(this);

      try {
         tmpItem.$Parent().addActionListener(this);
         tmpItem.$Caption(Caption);
         tmpItem.$ControlID(ControlID);
         tmpItem.$ToolTip(ToolTip);
         tmpItem.$Visible(true);
         tmpItem.$Parent().setFont(getFont());
         tmpItem.$Picture(IconPath);
         tmpItem.$PicturePosition(IconPosition);
         tmpItem.$RolloverPicture(RolloverIconPath);
         Add(tmpItem);
         createToolBarItem = tmpItem;
      } catch (Throwable var12) {
         Interaction.MsgBox(var12);
         return createToolBarItem;
      }

      return createToolBarItem;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         $Parent().setFocusable(false);
         $Parent().setMinimumSize(new Dimension(400, 400));
         $Parent().setRollover(true);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent e) {
      Throwable Err = null;

      try {
         GoClick(e.getSource());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   private void initVars() {
      myForeColor = 0L;
      myBackColor = 0L;
      myOwner = null;
   }
}
