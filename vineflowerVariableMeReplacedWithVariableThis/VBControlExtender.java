package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Conversion;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

public class VBControlExtender implements VB.IJabacoClass, MouseListener, MouseMotionListener, KeyListener {
   private VB.VBControlExtender$Timer myTimer;
   private VB.PictureBox Owner;
   private VB.Collection Controls;
   private VB.Collection DeathList;

   public void _DblClick(String ControlID) {
   }

   public void _Click(String ControlID) {
   }

   public void _KeyDown(String ControlID, int KeyCode, int Shift) {
   }

   public void _KeyPress(String ControlID, int KeyAscii) {
   }

   public void _KeyUp(String ControlID, int KeyCode, int Shift) {
   }

   public void _MouseDown(String ControlID, int Button, int Shift, float X, float Y) {
   }

   public void _MouseMove(String ControlID, int Button, int Shift, float X, float Y) {
   }

   public void _MouseUp(String ControlID, int Button, int Shift, float X, float Y) {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBControlExtender(VB.IJabacoContainer RefOwner) {
      Throwable Err = null;
      super();
      initVars();

      try {
         Owner = RefOwner.$ContentFrame();
         Class_Initialize();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public VB.IJabacoControl GetControl(String ControlID) {
      VB.IJabacoControl GetControl = null;
      Throwable Err = null;
      int h8 = 0;
      int h9 = 0;
      int i = 0;
      new VBArray();

      label126: {
         VBArray tmpComponents;
         try {
            tmpComponents = VBArray.createVBArray(Owner.getComponents());
         } finally {
            break label126;
         }

         i = 0;
         h8 = tmpComponents.getUBound(1);
         h9 = 1;

         while (true) {
            if (i > h8) {
               return GetControl;
            }

            try {
               if (Strings.StrComp(GetControlID((Component)tmpComponents.valueOfObj(i)), ControlID) == 0) {
                  GetControl = (VB.IJabacoControl)((Component)tmpComponents.valueOfObj(i));
                  return GetControl;
               }
            } finally {
               break;
            }

            i += h9;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return GetControl;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean AddListener(VB.IJabacoControl RefOwner) {
      boolean AddListener = false;
      Throwable Err = null;
      JComponent tmpComponent = null;

      try {
         tmpComponent = (JComponent)RefOwner;
         if (tmpComponent != null) {
            tmpComponent.addMouseMotionListener(this);
            tmpComponent.addMouseListener(this);
            tmpComponent.addKeyListener(this);
            AddListener = true;
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return AddListener;
      }

      return AddListener;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean AddControl(String ControlID, VB.IJabacoControl RefControl, float Left, float Top, float Width, float Height, boolean Visible) {
      boolean AddControl = false;
      Throwable Err = null;

      try {
         if (AddControlID(ControlID, RefControl)) {
            Owner.add((JComponent)RefControl);
            RefControl.$Left(Left);
            RefControl.$Top(Top);
            RefControl.$Width(Width);
            RefControl.$Height(Height);
            RefControl.$Visible(Visible);
            AddListener(RefControl);
            Owner.invalidate();
            Owner.$Parent().repaint();
            AddControl = true;
         }
      } catch (Throwable var12) {
         Interaction.MsgBox(var12);
         return AddControl;
      }

      return AddControl;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void RemoveControl(String ControlID) {
      Throwable Err = null;

      try {
         if (IsControlID(ControlID)) {
            DeathList.Add(VBVariant.valueOf(ControlID));
            myTimer.$Enabled(true);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private String GetKeyFromControl(Object Control) {
      String GetKeyFromControl = "";
      Throwable Err = null;

      try {
         GetKeyFromControl = Conversion.CStr(VBVariant.valueOf(Control.hashCode()));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return GetKeyFromControl;
      }

      return GetKeyFromControl;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean IsControlID(String ControlID) {
      boolean IsControlID = false;
      Throwable Err = null;
      Object tmpControl = null;

      try {
         tmpControl = GetControl(ControlID);
         if (tmpControl == null) {
            IsControlID = false;
         } else {
            IsControlID = Controls.KeyExists(Conversion.CStr(VBVariant.valueOf(tmpControl.hashCode())));
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return IsControlID;
      }

      return IsControlID;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean AddControlID(String ControlID, Object Control) {
      boolean AddControlID = false;
      Throwable Err = null;

      try {
         if (!IsControlID(ControlID)) {
            Controls.Add(VBVariant.valueOf(ControlID), GetKeyFromControl(Control));
            AddControlID = true;
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return AddControlID;
      }

      return AddControlID;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private String GetControlID(Object Control) {
      String GetControlID = "";
      Throwable Err = null;

      try {
         GetControlID = Controls.Item(GetKeyFromControl(Control)).toString();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return GetControlID;
      }

      return GetControlID;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mousePressed(MouseEvent e) {
      Throwable Err = null;
      Component tmpComponents = null;

      try {
         tmpComponents = (Component)e.getSource();
         if (tmpComponents != null) {
            if (e.getX() > 0 & e.getY() > 0 & e.getX() < tmpComponents.getWidth() & e.getY() < tmpComponents.getHeight()) {
               if (e.getClickCount() < 2) {
                  _Click(GetControlID(e.getSource()));
               } else {
                  _DblClick(GetControlID(e.getSource()));
               }
            }

            _MouseDown(GetControlID(e.getSource()), VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseReleased(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseUp(GetControlID(e.getSource()), VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      Throwable Err = null;
   }

   @Override
   public void mouseExited(MouseEvent e) {
      Throwable Err = null;
   }

   @Override
   public void mouseDragged(MouseEvent e) {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseMoved(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseMove(GetControlID(e.getSource()), VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void keyTyped(KeyEvent e) {
      Throwable Err = null;

      try {
         _KeyPress(GetControlID(e.getSource()), e.getKeyChar());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void keyPressed(KeyEvent e) {
      Throwable Err = null;

      try {
         _KeyDown(GetControlID(e.getSource()), e.getKeyCode(), VB.Global.KeyEventToShiftConstant(e));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void keyReleased(KeyEvent e) {
      Throwable Err = null;

      try {
         _KeyUp(GetControlID(e.getSource()), e.getKeyCode(), VB.Global.KeyEventToShiftConstant(e));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      Throwable Err = null;
   }

   public void myTimer_Timer() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 1
      // 02: bipush 0
      // 03: istore 3
      // 04: iload 3
      // 05: ifne 0b
      // 08: goto 12
      // 0b: nop
      // 0c: goto b6
      // 0f: goto 12
      // 12: nop
      // 13: bipush 1
      // 14: istore 3
      // 15: ldc ""
      // 17: astore 4
      // 19: aconst_null
      // 1a: astore 5
      // 1c: aload 0
      // 1d: getfield VB/VBControlExtender.DeathList LVB/Collection;
      // 20: bipush 1
      // 21: invokevirtual VB/Collection.Item (I)LVBA/VBVariant;
      // 24: invokevirtual VBA/VBVariant.toString ()Ljava/lang/String;
      // 27: astore 4
      // 29: aload 0
      // 2a: aload 4
      // 2c: invokespecial VB/VBControlExtender.GetControl (Ljava/lang/String;)LVB/IJabacoControl;
      // 2f: checkcast javax/swing/JComponent
      // 32: checkcast javax/swing/JComponent
      // 35: astore 5
      // 37: aload 5
      // 39: aconst_null
      // 3a: if_acmpeq 41
      // 3d: bipush 0
      // 3e: goto 42
      // 41: bipush 1
      // 42: ifne 48
      // 45: goto 55
      // 48: nop
      // 49: aload 0
      // 4a: getfield VB/VBControlExtender.DeathList LVB/Collection;
      // 4d: bipush 1
      // 4e: invokevirtual VB/Collection.Remove (I)Z
      // 51: pop
      // 52: goto 7b
      // 55: nop
      // 56: aload 0
      // 57: getfield VB/VBControlExtender.Owner LVB/PictureBox;
      // 5a: aload 5
      // 5c: checkcast java/awt/Component
      // 5f: invokevirtual java/awt/Container.remove (Ljava/awt/Component;)V
      // 62: aload 0
      // 63: getfield VB/VBControlExtender.Controls LVB/Collection;
      // 66: aload 5
      // 68: invokevirtual java/awt/Component.toString ()Ljava/lang/String;
      // 6b: invokevirtual VB/Collection.Remove (Ljava/lang/String;)Z
      // 6e: pop
      // 6f: aload 0
      // 70: getfield VB/VBControlExtender.DeathList LVB/Collection;
      // 73: bipush 1
      // 74: invokevirtual VB/Collection.Remove (I)Z
      // 77: pop
      // 78: goto 7b
      // 7b: nop
      // 7c: aload 0
      // 7d: getfield VB/VBControlExtender.DeathList LVB/Collection;
      // 80: invokevirtual VB/Collection.Count ()I
      // 83: bipush 0
      // 84: if_icmpeq 8b
      // 87: bipush 0
      // 88: goto 8c
      // 8b: bipush 1
      // 8c: ifne 92
      // 8f: goto b2
      // 92: nop
      // 93: aload 0
      // 94: getfield VB/VBControlExtender.Owner LVB/PictureBox;
      // 97: invokevirtual VB/PictureBox.$Parent ()Ljavax/swing/JPanel;
      // 9a: invokevirtual java/awt/Container.invalidate ()V
      // 9d: aload 0
      // 9e: getfield VB/VBControlExtender.Owner LVB/PictureBox;
      // a1: invokevirtual VB/PictureBox.$Parent ()Ljavax/swing/JPanel;
      // a4: invokevirtual java/awt/Component.repaint ()V
      // a7: aload 0
      // a8: getfield VB/VBControlExtender.myTimer LVB/VBControlExtender$Timer;
      // ab: bipush 0
      // ac: invokevirtual VB/Timer.$Enabled (Z)V
      // af: goto b2
      // b2: nop
      // b3: nop
      // b4: bipush 1
      // b5: istore 3
      // b6: nop
      // b7: return
      // b8: nop
      // b9: aload 1
      // ba: checkcast java/lang/Throwable
      // bd: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // c0: goto b6
      // c3: astore 2
      // c4: astore 1
      // c5: ret 2
      // c7: jsr c3
      // ca: goto b3
      // cd: jsr c3
      // d0: goto b3
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         myTimer.$Interval((float)1);
         myTimer.$Enabled(false);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVars() {
      myTimer = new VB.VBControlExtender$Timer();
      myTimer.setOwner(this, 1);
      Owner = null;
      Controls = new VB.Collection();
      DeathList = new VB.Collection();
   }
}
