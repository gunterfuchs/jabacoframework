package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

public class VBMenuGroup extends JMenu implements VB.IJabacoClass, VB.IMenuItem {
   private IResource myIconPath;
   private String myControlID;
   private VB.VBMenuBar myMenuBar;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuBar $MenuBar() {
      VB.VBMenuBar $MenuBar = null;
      Throwable Err = null;

      try {
         $MenuBar = myMenuBar;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $MenuBar;
      }

      return $MenuBar;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBMenuGroup(
      VB.VBMenuBar refMenuBar, JComponent refOwner, String refControlID, String refCaption, boolean refEnabled, boolean refVisible, IResource refIconPath
   ) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myMenuBar = refMenuBar;
         if (refOwner != null) {
            refOwner.add(this);
            $Parent().setOpaque(true);
         } else {
            refMenuBar.add(this);
            $Parent().setOpaque(false);
         }

         $Parent().addActionListener(refMenuBar);
         $Caption(refCaption);
         $ControlID(refControlID);
         $Enabled(refEnabled);
         $Visible(refVisible);
         $Icon(refIconPath);
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
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
         if (myMenuBar != null) {
            getBackground = myMenuBar.getBackground();
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
   public JPopupMenu GetAsPopupMenu() {
      JPopupMenu GetAsPopupMenu = null;
      Throwable Err = null;

      try {
         GetAsPopupMenu = GetAsPopupMenu(null);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return GetAsPopupMenu;
      }

      return GetAsPopupMenu;
   }

   public JPopupMenu GetAsPopupMenu(JComponent tmpMenu) {
      JPopupMenu GetAsPopupMenu = null;
      Throwable Err = null;
      JPopupMenu tmpNewPopupMenu = null;
      int h12 = 0;
      int h13 = false;
      VB.VBMenuItem tmpMenuItem = null;
      VB.VBMenuGroup tmpMenuGroup = null;
      VB.VBMenuItem tmpNewMenuItem = null;
      VB.VBMenuGroup tmpNewMenuGroup = null;

      label1416: {
         label1411:
         try {
            if (tmpMenu != null) {
               break label1416;
            }
         } finally {
            break label1411;
         }

         tmpNewPopupMenu = new JPopupMenu();

         label1404:
         try {
            tmpMenu = (JComponent)tmpNewPopupMenu;
         } finally {
            break label1404;
         }
      }

      label1401:
      try {
         ;
      } finally {
         break label1401;
      }

      int i = 0;
      i = 0;
      h12 = $Parent().getMenuComponentCount() - 1;

      for (int var256 = 1; i <= h12; i += var256) {
         label1394:
         try {
            tmpMenuItem = null;
         } finally {
            break label1394;
         }

         label1391:
         try {
            tmpMenuItem = (VB.VBMenuItem)$Parent().getMenuComponent(i);
         } finally {
            break label1391;
         }

         label1388: {
            label1387:
            try {
               if (tmpMenuItem == null) {
                  break label1388;
               }
            } finally {
               break label1387;
            }

            label1381:
            try {
               new VB.VBMenuItem(myMenuBar, tmpMenu, tmpMenuItem.$ControlID(), tmpMenuItem.$Caption(), true, tmpMenuItem.$Visible(), tmpMenuItem.$Icon());
            } finally {
               break label1381;
            }
         }

         label1378:
         try {
            ;
         } finally {
            break label1378;
         }

         label1375:
         try {
            tmpMenuGroup = null;
         } finally {
            break label1375;
         }

         label1372:
         try {
            tmpMenuGroup = (VB.VBMenuGroup)$Parent().getMenuComponent(i);
         } finally {
            break label1372;
         }

         label1420: {
            label1368:
            try {
               if (tmpMenuGroup == null) {
                  break label1420;
               }
            } finally {
               break label1368;
            }

            label1361:
            try {
               tmpNewMenuGroup = new VB.VBMenuGroup(
                  myMenuBar, tmpMenu, tmpMenuGroup.$ControlID(), tmpMenuGroup.$Caption(), true, tmpMenuGroup.$Visible(), tmpMenuGroup.$Icon()
               );
            } finally {
               break label1361;
            }

            label1359:
            try {
               tmpMenuGroup.GetAsPopupMenu(tmpNewMenuGroup);
            } finally {
               break label1359;
            }
         }

         try {
            ;
         } finally {
            continue;
         }
      }

      try {
         GetAsPopupMenu = (JPopupMenu)tmpMenu;
      } finally {
         return GetAsPopupMenu;
      }

      return GetAsPopupMenu;
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
      // 34: invokespecial javax/swing/AbstractButton.setIcon (Ljavax/swing/Icon;)V
      // 37: aload 0
      // 38: aload 1
      // 39: putfield VB/VBMenuGroup.myIconPath LVBA/IResource;
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
   public JMenu $Parent() {
      JMenu $Parent = null;
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
