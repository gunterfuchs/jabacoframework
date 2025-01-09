package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class VBOptionButtonMenuItem extends JRadioButtonMenuItem implements VB.IJabacoClass, VB.IMenuItem {
   private IResource myIconPath;
   private String myControlID;
   private VB.VBMenuBar myMenuBar;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getBackground() {
      Color getBackground = null;
      Throwable Err = null;

      try {
         if (myMenuBar != null) {
            getBackground = myMenuBar.getBackground();
            $Parent().setOpaque(true);
         } else {
            getBackground = super.getBackground();
            $Parent().setOpaque(true);
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
         if (myMenuBar != null) {
            getForeground = myMenuBar.getForeground();
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
         if (myMenuBar != null) {
            getFont = myMenuBar.getFont();
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
   public VBOptionButtonMenuItem(
      VB.VBMenuBar refMenuBar,
      JComponent refOwner,
      String refControlID,
      String refCaption,
      boolean refSelected,
      ButtonGroup refGroup,
      boolean refEnabled,
      boolean refVisible,
      IResource refIconPath
   ) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myMenuBar = refMenuBar;
         refGroup.add(this);
         if (refOwner != null) {
            refOwner.add(this);
         } else {
            refMenuBar.add(this);
         }

         $Parent().addActionListener(refMenuBar);
         $Caption(refCaption);
         $ControlID(refControlID);
         $Enabled(refEnabled);
         $Visible(refVisible);
         $Icon(refIconPath);
         super.setSelected(refSelected);
      } catch (Throwable var13) {
         Interaction.MsgBox(var13);
         return;
      }
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
   @Override
   public String $Caption() {
      String $Caption = "";
      Throwable Err = null;

      try {
         $Caption = getLabel();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Caption;
      }

      return $Caption;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Caption(String s) {
      Throwable Err = null;
      int mnemonicPos = 0;

      try {
         mnemonicPos = s.indexOf("&");
         if (mnemonicPos > -1 * 1 & mnemonicPos < s.length()) {
            setMnemonic(s.charAt(mnemonicPos + 1));
         }

         setLabel(s.replaceFirst("&", ""));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public IResource $Icon() {
      IResource $Icon = null;
      Throwable Err = null;

      try {
         $Icon = myIconPath;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Icon;
      }

      return $Icon;
   }

   @Override
   public void $Icon(IResource param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: aload 1
      // 03: aconst_null
      // 04: if_acmpne 0b
      // 07: bipush 0
      // 08: goto 0c
      // 0b: bipush 1
      // 0c: ifne 12
      // 0f: goto 43
      // 12: nop
      // 13: aload 1
      // 14: invokeinterface VBA/IResource.toString ()Ljava/lang/String; 1
      // 19: invokestatic VBA/Strings.Len (Ljava/lang/String;)I
      // 1c: bipush 0
      // 1d: if_icmpgt 24
      // 20: bipush 0
      // 21: goto 25
      // 24: bipush 1
      // 25: ifne 2b
      // 28: goto 3f
      // 2b: nop
      // 2c: aload 0
      // 2d: aload 1
      // 2e: invokestatic VB/Global.LoadIcon (LVBA/IResource;)Ljavax/swing/ImageIcon;
      // 31: checkcast javax/swing/Icon
      // 34: invokevirtual javax/swing/AbstractButton.setIcon (Ljavax/swing/Icon;)V
      // 37: aload 0
      // 38: aload 1
      // 39: putfield VB/VBOptionButtonMenuItem.myIconPath LVBA/IResource;
      // 3c: goto 3f
      // 3f: nop
      // 40: goto 43
      // 43: nop
      // 44: nop
      // 45: nop
      // 46: return
      // 47: nop
      // 48: aload 2
      // 49: checkcast java/lang/Throwable
      // 4c: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 4f: goto 45
      // 52: astore 3
      // 53: astore 2
      // 54: ret 3
      // 56: jsr 52
      // 59: goto 44
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Selected() {
      boolean $Selected = false;
      Throwable Err = null;

      try {
         $Selected = super.isSelected();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Selected;
      }

      return $Selected;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Selected(boolean v) {
      Throwable Err = null;

      try {
         super.setSelected(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean $Enabled() {
      boolean $Enabled = false;
      Throwable Err = null;

      try {
         $Enabled = isEnabled();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Enabled;
      }

      return $Enabled;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Enabled(boolean v) {
      Throwable Err = null;

      try {
         setEnabled(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
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
   @Override
   public void $Visible(boolean v) {
      Throwable Err = null;

      try {
         setVisible(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JMenuItem $Parent() {
      JMenuItem $Parent = null;
      Throwable Err = null;

      try {
         $Parent = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   private void initVars() {
      myIconPath = null;
      myControlID = "";
      myMenuBar = null;
   }
}
