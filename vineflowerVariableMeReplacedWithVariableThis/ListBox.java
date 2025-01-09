package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListBox
   extends JScrollPane
   implements VB.IJabacoControl,
   VB.IJabacoClass,
   VB.IListCellDataOwner,
   MouseListener,
   MouseMotionListener,
   KeyListener,
   FocusListener,
   ListSelectionListener {
   private VB.ListBoxModel myModel;
   private JList myList;
   private String myTag;
   private long myMargin;
   private long myMarginItem;
   private VB.fmBorderStyle myBorderStyle;
   private Border myDefaultBorder;
   private VB.ListCellDataRenderer myRenderer;
   private VB.ListBoxConstants myStyle;
   private int myMemListIndex;
   private long myBorderColorSel;
   private long myBackColorAlternating;
   private IResource myMouseIcon;
   private VB.AnchorStyles myAnchor;
   private float mySavedWidth;
   private float mySavedHeight;
   private float mySavedLeft;
   private float mySavedTop;
   private float hostSavedWidth;
   private float hostSavedHeight;
   private boolean isResizeTriggerInitialized;
   private boolean isLeftInitialized;
   private boolean isTopInitialized;

   public void _Click() {
   }

   public void _DblClick() {
   }

   public void _GotFocus() {
   }

   public void _KeyDown(int KeyCode, int Shift) {
   }

   public void _KeyPress(int KeyAscii) {
   }

   public void _KeyUp(int KeyCode, int Shift) {
   }

   public void _LostFocus() {
   }

   public void _MouseEntered() {
   }

   public void _MouseExited() {
   }

   public void _MouseDown(int Button, int Shift, float X, float Y) {
   }

   public void _MouseMove(int Button, int Shift, float X, float Y) {
   }

   public void _MouseUp(int Button, int Shift, float X, float Y) {
   }

   public void _ItemCheck(int Item) {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JList $Parent() {
      JList $Parent = null;
      Throwable Err = null;

      try {
         $Parent = myList;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   private void Class_Initialize() {
      Throwable Err = null;

      label366:
      try {
         $Parent().addFocusListener(this);
      } finally {
         break label366;
      }

      label363:
      try {
         $Parent().addMouseListener(this);
      } finally {
         break label363;
      }

      label360:
      try {
         $Parent().addMouseMotionListener(this);
      } finally {
         break label360;
      }

      label357:
      try {
         $Parent().addKeyListener(this);
      } finally {
         break label357;
      }

      label354:
      try {
         $Parent().addListSelectionListener(this);
      } finally {
         break label354;
      }

      label351:
      try {
         $Parent().setCellRenderer(myRenderer);
      } finally {
         break label351;
      }

      label348:
      try {
         setViewportView(myList);
      } finally {
         break label348;
      }

      label345:
      try {
         myDefaultBorder = super.getBorder();
      } finally {
         break label345;
      }

      try {
         super.setOpaque(false);
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void focusGained(FocusEvent arg2) {
      Throwable Err = null;

      try {
         _GotFocus();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void focusLost(FocusEvent arg2) {
      Throwable Err = null;

      try {
         _LostFocus();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseMoved(MouseEvent e) {
      Throwable Err = null;

      try {
         ReDispatch(e);
         _MouseMove(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseDragged(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseMove(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public void mousePressed(MouseEvent e) {
      Throwable Err = null;

      label78: {
         try {
            ReDispatch(e);
         } finally {
            break label78;
         }

         int Index = HitTest(e.getX(), e.getY());

         label69:
         try {
            if (IsCheckBox((long)Index)) {
               $Selected((long)Index, !$Selected((long)Index));
            }

            _MouseDown(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
            return;
         } finally {
            break label69;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseReleased(MouseEvent e) {
      Throwable Err = null;

      try {
         ReDispatch(e);
         _MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
         if (e.getX() > 0 & e.getY() > 0 & e.getX() < getWidth() & e.getY() < getHeight() && e.getClickCount() % 2 == 0) {
            _DblClick();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseClicked(MouseEvent e) {
      Throwable Err = null;

      try {
         ReDispatch(e);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseEntered(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseEntered();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseExited(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseExited();
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
         _KeyUp(e.getKeyCode(), VB.Global.KeyEventToShiftConstant(e));
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
         _KeyPress(e.getKeyChar());
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
         _KeyDown(e.getKeyCode(), VB.Global.KeyEventToShiftConstant(e));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void valueChanged(ListSelectionEvent arg2) {
      Throwable Err = null;

      try {
         if (myMemListIndex != $ListIndex()) {
            myMemListIndex = $ListIndex();
            _Click();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void RemoveItem(int v) {
      Throwable Err = null;

      try {
         myModel.removeElementAt(v);
         fireChange();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   private void ReDispatch(MouseEvent param1) {
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
      // 03: astore 7
      // 05: aconst_null
      // 06: astore 8
      // 08: aconst_null
      // 09: astore 9
      // 0b: lconst_0
      // 0c: lstore 10
      // 0e: lconst_0
      // 0f: lstore 12
      // 11: bipush 0
      // 12: istore 4
      // 14: aconst_null
      // 15: astore 5
      // 17: aload 5
      // 19: aconst_null
      // 1a: if_acmpeq 21
      // 1d: bipush 0
      // 1e: goto 22
      // 21: bipush 1
      // 22: ifne 28
      // 25: goto 2f
      // 28: nop
      // 29: goto bc
      // 2c: goto 2f
      // 2f: nop
      // 30: aconst_null
      // 31: astore 6
      // 33: aload 6
      // 35: aconst_null
      // 36: if_acmpne 3d
      // 39: bipush 0
      // 3a: goto 3e
      // 3d: bipush 1
      // 3e: ifne 44
      // 41: goto ba
      // 44: nop
      // 45: aload 9
      // 47: getfield java/awt/Point.x I
      // 4a: i2l
      // 4b: lstore 10
      // 4d: aload 9
      // 4f: getfield java/awt/Point.y I
      // 52: i2l
      // 53: lstore 12
      // 55: aload 8
      // 57: aconst_null
      // 58: if_acmpeq 5f
      // 5b: bipush 0
      // 5c: goto 60
      // 5f: bipush 1
      // 60: ifne 66
      // 63: goto 71
      // 66: nop
      // 67: aload 6
      // 69: checkcast java/awt/Component
      // 6c: astore 8
      // 6e: goto 71
      // 71: nop
      // 72: aload 8
      // 74: bipush 1
      // 75: invokevirtual java/awt/Component.setFocusable (Z)V
      // 78: aload 8
      // 7a: new java/awt/event/MouseEvent
      // 7d: dup
      // 7e: aload 8
      // 80: aload 1
      // 81: invokevirtual java/awt/AWTEvent.getID ()I
      // 84: aload 1
      // 85: invokevirtual java/awt/event/InputEvent.getWhen ()J
      // 88: aload 1
      // 89: invokevirtual java/awt/event/InputEvent.getModifiers ()I
      // 8c: aload 1
      // 8d: invokevirtual java/awt/event/MouseEvent.getX ()I
      // 90: i2l
      // 91: lload 10
      // 93: lsub
      // 94: l2i
      // 95: aload 1
      // 96: invokevirtual java/awt/event/MouseEvent.getY ()I
      // 99: i2l
      // 9a: lload 12
      // 9c: lsub
      // 9d: l2i
      // 9e: aload 1
      // 9f: invokevirtual java/awt/event/MouseEvent.getClickCount ()I
      // a2: aload 1
      // a3: invokevirtual java/awt/event/MouseEvent.isPopupTrigger ()Z
      // a6: aload 1
      // a7: invokevirtual java/awt/event/MouseEvent.getButton ()I
      // aa: invokespecial java/awt/event/MouseEvent.<init> (Ljava/awt/Component;IJIIIIZI)V
      // ad: checkcast java/awt/AWTEvent
      // b0: invokevirtual java/awt/Component.dispatchEvent (Ljava/awt/AWTEvent;)V
      // b3: aload 0
      // b4: invokespecial VB/ListBox.Refresh ()V
      // b7: goto ba
      // ba: nop
      // bb: nop
      // bc: nop
      // bd: return
      // be: nop
      // bf: aload 2
      // c0: checkcast java/lang/Throwable
      // c3: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // c6: goto bc
      // c9: astore 3
      // ca: astore 2
      // cb: ret 3
      // cd: jsr c9
      // d0: goto bb
      // d3: jsr c9
      // d6: goto bb
      // d9: jsr c9
      // dc: goto bb
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmMultiSelect $MultiSelect() {
      VB.fmMultiSelect $MultiSelect = new VB.fmMultiSelect();
      Throwable Err = null;

      try {
         if (myList.getSelectionMode() != ListSelectionModel.SINGLE_INTERVAL_SELECTION) {
            $MultiSelect = VB.fmMultiSelect.fmMultiSelectSingle;
         } else {
            $MultiSelect = VB.fmMultiSelect.fmMultiSelectSingle;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $MultiSelect;
      }

      return $MultiSelect;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $MultiSelect(VB.fmMultiSelect v) {
      Throwable Err = null;
      new VB.fmMultiSelect();
      VB.fmMultiSelect h5 = null;

      try {
         if (v.compareTo(VB.fmMultiSelect.fmMultiSelectExtended) != 0) {
            if (v.compareTo(VB.fmMultiSelect.fmMultiSelectMulti) != 0) {
               if (v.compareTo(VB.fmMultiSelect.fmMultiSelectSingle) == 0) {
                  $Parent().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
               }
            } else {
               $Parent().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            }
         } else {
            $Parent().setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $Margin() {
      long $Margin = 0L;
      Throwable Err = null;

      try {
         $Margin = myMargin;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Margin;
      }

      return $Margin;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Margin(long v) {
      Throwable Err = null;

      try {
         myMargin = v;
         $Parent().setBorder(BorderFactory.createEmptyBorder((int)v, (int)v, (int)v, (int)v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $MarginItem(long v) {
      Throwable Err = null;

      try {
         myMarginItem = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $MarginItem() {
      long $MarginItem = 0L;
      Throwable Err = null;

      try {
         $MarginItem = myMarginItem;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $MarginItem;
      }

      return $MarginItem;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $FixedCellHeight() {
      long $FixedCellHeight = 0L;
      Throwable Err = null;

      try {
         $FixedCellHeight = (long)$Parent().getFixedCellHeight();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $FixedCellHeight;
      }

      return $FixedCellHeight;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FixedCellHeight(long v) {
      Throwable Err = null;

      try {
         $Parent().setFixedCellHeight((int)v);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $FixedCellWidth() {
      long $FixedCellWidth = 0L;
      Throwable Err = null;

      try {
         $FixedCellWidth = (long)$Parent().getFixedCellWidth();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $FixedCellWidth;
      }

      return $FixedCellWidth;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FixedCellWidth(long v) {
      Throwable Err = null;

      try {
         $Parent().setFixedCellWidth((int)v);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $BorderColorSel() {
      long $BorderColorSel = 0L;
      Throwable Err = null;

      try {
         $BorderColorSel = myBorderColorSel;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BorderColorSel;
      }

      return $BorderColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $BorderColorSel(long v) {
      Throwable Err = null;

      try {
         myBorderColorSel = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $BackColorSel() {
      long $BackColorSel = 0L;
      Throwable Err = null;

      try {
         $BackColorSel = Information.ColorToRGB(myList.getSelectionBackground());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColorSel;
      }

      return $BackColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $BackColorSel(long v) {
      Throwable Err = null;

      try {
         myList.setSelectionBackground(Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $BackColorAlternating() {
      long $BackColorAlternating = 0L;
      Throwable Err = null;

      try {
         $BackColorAlternating = myBackColorAlternating;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColorAlternating;
      }

      return $BackColorAlternating;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColorAlternating(long v) {
      Throwable Err = null;

      try {
         myBackColorAlternating = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $ForeColorSel() {
      long $ForeColorSel = 0L;
      Throwable Err = null;

      try {
         $ForeColorSel = Information.ColorToRGB(myList.getSelectionForeground());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ForeColorSel;
      }

      return $ForeColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $ForeColorSel(long v) {
      Throwable Err = null;

      try {
         myList.setSelectionForeground(Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmBorderStyle $BorderStyle() {
      VB.fmBorderStyle $BorderStyle = new VB.fmBorderStyle();
      Throwable Err = null;

      try {
         $BorderStyle = myBorderStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $BorderStyle;
      }

      return $BorderStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BorderStyle(VB.fmBorderStyle v) {
      Throwable Err = null;

      try {
         myBorderStyle = v;
         if (v.compareTo(VB.fmBorderStyle.fmBorderStyleNone) != 0) {
            setBorder(myDefaultBorder);
         } else {
            setBorder(null);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Clear() {
      Throwable Err = null;

      try {
         myModel.clear();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ensureIndexIsVisible(int Index) {
      Throwable Err = null;

      try {
         $Parent().ensureIndexIsVisible(Index);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int getFirstVisibleIndex() {
      int getFirstVisibleIndex = 0;
      Throwable Err = null;

      try {
         getFirstVisibleIndex = $Parent().getFirstVisibleIndex();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getFirstVisibleIndex;
      }

      return getFirstVisibleIndex;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int getVisibleRowCount() {
      int getVisibleRowCount = 0;
      Throwable Err = null;

      try {
         getVisibleRowCount = $Parent().getVisibleRowCount();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getVisibleRowCount;
      }

      return getVisibleRowCount;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int HitTest(int x, int y) {
      int HitTest = 0;
      Throwable Err = null;

      try {
         HitTest = $Parent().locationToIndex(new Point(x, y));
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return HitTest;
      }

      return HitTest;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized void AddItem(String Item) {
      Throwable Err = null;
      VB.ListCellData tmpCellData = new VB.ListCellData(Item, null, (boolean)myStyle.intValue());

      try {
         tmpCellData.$Owner(this);
         myModel.addElement((VB.ListCellData)tmpCellData);
         fireChange();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized void AddItem(VB.ListCellData Item) {
      Throwable Err = null;

      try {
         Item.$Owner(this);
         myModel.addElement((VB.ListCellData)Item);
         fireChange();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized void AddItem(VB.Usercontrol v) {
      Throwable Err = null;
      VB.ListCellData tmpCellData = new VB.ListCellData(v);

      try {
         tmpCellData.$Owner(this);
         myModel.addElement((VB.ListCellData)tmpCellData);
         fireChange();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized void AddItem(VB.Usercontrol v, int Index) {
      Throwable Err = null;
      VB.ListCellData tmpCellData = new VB.ListCellData(v);

      try {
         tmpCellData.$Owner(this);
         myModel.insertElementAt((VB.ListCellData)tmpCellData, Index);
         fireChange();
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized void AddItem(String Item, int Index) {
      Throwable Err = null;
      VB.ListCellData tmpCellData = new VB.ListCellData(Item, null, (boolean)myStyle.intValue());

      try {
         tmpCellData.$Owner(this);
         myModel.insertElementAt((VB.ListCellData)tmpCellData, Index);
         fireChange();
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized void AddItem(VB.ListCellData Item, int Index) {
      Throwable Err = null;

      try {
         Item.$Owner(this);
         myModel.insertElementAt((VB.ListCellData)Item, Index);
         fireChange();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void fireChange() {
      Throwable Err = null;

      try {
         myModel.fireChangeEvent(0, (int)$ListCount());
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ListCount() {
      long $ListCount = 0L;
      Throwable Err = null;

      try {
         $ListCount = (long)myModel.getSize();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ListCount;
      }

      return $ListCount;
   }

   private VB.ListCellData GetCellData(long Index) {
      VB.ListCellData GetCellData = null;
      Throwable Err = null;

      try {
         GetCellData = (VB.ListCellData)myModel.getElementAt((int)Index);
      } finally {
         return GetCellData;
      }

      return GetCellData;
   }

   private Component GetCellComponent(long Index) {
      Component GetCellComponent = null;
      Throwable Err = null;

      try {
         GetCellComponent = GetCellData(Index).getComponent(this, null, $Selected(Index), (long)$ListIndex() == Index);
      } finally {
         return GetCellComponent;
      }

      return GetCellComponent;
   }

   public String $List(long Index) {
      String $List = "";
      Throwable Err = null;

      try {
         $List = GetCellData(Index).$Text();
      } finally {
         return $List;
      }

      return $List;
   }

   public void $List(long Index, String v) {
      Throwable Err = null;

      try {
         GetCellData(Index).$Text(v);
      } finally {
         return;
      }
   }

   public String $ListData(long Index) {
      String $ListData = "";
      Throwable Err = null;

      try {
         $ListData = GetCellData(Index).$Data();
      } finally {
         return $ListData;
      }

      return $ListData;
   }

   public void $ListData(long Index, String v) {
      Throwable Err = null;

      try {
         GetCellData(Index).$Data(v);
      } finally {
         return;
      }
   }

   public IResource $ListIcon(long Index) {
      IResource $ListIcon = null;
      Throwable Err = null;

      try {
         $ListIcon = GetCellData(Index).$Icon();
      } finally {
         return $ListIcon;
      }

      return $ListIcon;
   }

   public void $ListIcon(long Index, IResource v) {
      Throwable Err = null;

      try {
         GetCellData(Index).$Icon(v);
      } finally {
         return;
      }
   }

   public boolean IsCheckBox(long Index) {
      boolean IsCheckBox = false;
      Throwable Err = null;

      try {
         IsCheckBox = GetCellData(Index).$AsCheckBox();
      } finally {
         return IsCheckBox;
      }

      return IsCheckBox;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Selected(long Index, boolean v) {
      Throwable Err = null;

      try {
         if (!IsCheckBox(Index)) {
            $ListIndex((int)Index);
         } else {
            GetCellData(Index).$Checked(v);
            _ItemCheck((int)Index);
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Selected(long Index) {
      boolean $Selected = false;
      Throwable Err = null;

      try {
         if (!IsCheckBox(Index)) {
            $Selected = (long)$ListIndex() == Index;
         } else {
            $Selected = GetCellData(Index).$Checked();
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return $Selected;
      }

      return $Selected;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $ListIndex() {
      int $ListIndex = 0;
      Throwable Err = null;

      try {
         $ListIndex = $Parent().getSelectedIndex();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ListIndex;
      }

      return $ListIndex;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ListIndex(int val) {
      Throwable Err = null;

      try {
         $Parent().setSelectedIndex(val);
         ensureIndexIsVisible(val);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.ListBoxConstants $Style() {
      VB.ListBoxConstants $Style = new VB.ListBoxConstants();
      Throwable Err = null;

      try {
         $Style = myStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Style;
      }

      return $Style;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Style(VB.ListBoxConstants val) {
      Throwable Err = null;

      try {
         myStyle = val;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.lstOrientation $Orientation() {
      VB.lstOrientation $Orientation = new VB.lstOrientation();
      Throwable Err = null;

      try {
         if ($Parent().getLayoutOrientation() != JList.VERTICAL) {
            $Orientation = VB.lstOrientation.lstOrientationHorizontal;
         } else {
            $Orientation = VB.lstOrientation.lstOrientationVertical;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Orientation;
      }

      return $Orientation;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Orientation(VB.lstOrientation v) {
      Throwable Err = null;

      try {
         if (v.compareTo(VB.lstOrientation.lstOrientationVertical) != 0) {
            $Parent().setLayoutOrientation(JList.VERTICAL_WRAP);
            $Parent().setVisibleRowCount(-1 * 1);
         } else {
            $Parent().setLayoutOrientation(JList.VERTICAL);
            $Parent().setVisibleRowCount(8);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $FontName() {
      String $FontName = "";
      Throwable Err = null;

      try {
         $FontName = $Parent().getFont().getFamily();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontName;
      }

      return $FontName;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontName(String val) {
      Throwable Err = null;

      try {
         $Parent()
            .setFont(
               new Font(
                  val,
                  (int)(
                     Interaction.IIF($FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                        | Interaction.IIF($FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
                  ),
                  VB.Global.VBFontSizeToJFontSize($FontSize())
               )
            );
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $FontBold() {
      boolean $FontBold = false;
      Throwable Err = null;

      try {
         $FontBold = $Parent().getFont().isBold();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontBold;
      }

      return $FontBold;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontBold(boolean val) {
      Throwable Err = null;

      try {
         $Parent()
            .setFont(
               new Font(
                  $FontName(),
                  (int)(
                     Interaction.IIF(val, VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                        | Interaction.IIF($FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
                  ),
                  VB.Global.VBFontSizeToJFontSize($FontSize())
               )
            );
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $FontItalic() {
      boolean $FontItalic = false;
      Throwable Err = null;

      try {
         $FontItalic = $Parent().getFont().isItalic();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontItalic;
      }

      return $FontItalic;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontItalic(boolean val) {
      Throwable Err = null;

      try {
         $Parent()
            .setFont(
               new Font(
                  $FontName(),
                  (int)(
                     Interaction.IIF($FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                        | Interaction.IIF(val, VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
                  ),
                  VB.Global.VBFontSizeToJFontSize($FontSize())
               )
            );
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $FontSize() {
      int $FontSize = 0;
      Throwable Err = null;

      try {
         $FontSize = VB.Global.JFontSizeToVBFontSize($Font().getSize());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontSize;
      }

      return $FontSize;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontSize(int val) {
      Throwable Err = null;

      try {
         $Parent()
            .setFont(
               new Font(
                  $FontName(),
                  (int)(
                     Interaction.IIF($FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                        | Interaction.IIF($FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
                  ),
                  VB.Global.VBFontSizeToJFontSize(val)
               )
            );
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Font $Font() {
      Font $Font = null;
      Throwable Err = null;

      try {
         $Font = $Parent().getFont();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Font;
      }

      return $Font;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColor() {
      long $BackColor = 0L;
      Throwable Err = null;

      try {
         $BackColor = Information.ColorToRGB($Parent().getBackground());
         super.setBackground($Parent().getBackground());
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
         $Parent().setBackground(Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ForeColor() {
      long $ForeColor = 0L;
      Throwable Err = null;

      try {
         $ForeColor = Information.ColorToRGB($Parent().getForeground());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ForeColor;
      }

      return $ForeColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ForeColor(long v) {
      Throwable Err = null;

      try {
         $Parent().setForeground(Information.RGBtoColor(v));
         super.setForeground($Parent().getForeground());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float $Width() {
      float $Width = 0.0F;
      Throwable Err = null;

      try {
         $Width = (float)getSize().width;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Width;
      }

      return $Width;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Width(float v) {
      Throwable Err = null;

      try {
         setSize((int)v, getSize().height);
         Refresh();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float $Height() {
      float $Height = 0.0F;
      Throwable Err = null;

      try {
         $Height = (float)getSize().height;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Height;
      }

      return $Height;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Height(float v) {
      Throwable Err = null;

      try {
         setSize(getSize().width, (int)v);
         Refresh();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float $Left() {
      float $Left = 0.0F;
      Throwable Err = null;

      try {
         $Left = (float)getLocation().x;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Left;
      }

      return $Left;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Left(float v) {
      Throwable Err = null;

      try {
         if (!isLeftInitialized) {
            mySavedLeft = v;
            isLeftInitialized = true;
         }

         setLocation((int)v, getLocation().y);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float $Top() {
      float $Top = 0.0F;
      Throwable Err = null;

      try {
         $Top = (float)getLocation().y;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Top;
      }

      return $Top;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Top(float v) {
      Throwable Err = null;

      try {
         if (!isTopInitialized) {
            mySavedTop = v;
            isTopInitialized = true;
         }

         setLocation(getLocation().x, (int)v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.AnchorStyles $Anchor() {
      VB.AnchorStyles $Anchor = new VB.AnchorStyles();
      Throwable Err = null;

      try {
         $Anchor = myAnchor;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Anchor;
      }

      return $Anchor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Anchor(VB.AnchorStyles val) {
      Throwable Err = null;

      try {
         myAnchor = val;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBVariant Move(float Left, float Top, float Width, float Height) {
      VBVariant Move = new VBVariant();
      Throwable Err = null;

      try {
         $Left(Left);
         if (Top != (float)(-1 * 1)) {
            $Top(Top);
         }

         if (Width != (float)(-1 * 1)) {
            $Width(Width);
         }

         if (Height != (float)(-1 * 1)) {
            $Height(Height);
         }
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return Move;
      }

      return Move;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $ToolTip() {
      String $ToolTip = "";
      Throwable Err = null;

      try {
         $ToolTip = $Parent().getToolTipText();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ToolTip;
      }

      return $ToolTip;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ToolTip(String v) {
      Throwable Err = null;

      try {
         if (Strings.Len(v) != 0) {
            $Parent().setToolTipText(v);
         } else {
            $Parent().setToolTipText(null);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Enabled() {
      boolean $Enabled = false;
      Throwable Err = null;

      try {
         $Enabled = super.isEnabled();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Enabled;
      }

      return $Enabled;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Enabled(boolean v) {
      Throwable Err = null;

      try {
         super.setEnabled(v);
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
         $Visible = super.isVisible();
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
         super.setVisible(v);
         Refresh();
         RefreshModel();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Tag() {
      String $Tag = "";
      Throwable Err = null;

      try {
         $Tag = myTag;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Tag;
      }

      return $Tag;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Tag(String v) {
      Throwable Err = null;

      try {
         myTag = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.MousePointerConstants $MousePointer() {
      VB.MousePointerConstants $MousePointer = new VB.MousePointerConstants();
      Throwable Err = null;

      try {
         $MousePointer = VB.Global.JCursorToVBMousePointer($Parent().getCursor());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $MousePointer;
      }

      return $MousePointer;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $MousePointer(VB.MousePointerConstants v) {
      Throwable Err = null;

      try {
         $Parent().setCursor(VB.Global.VBMousePointerToJCursor(v));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $MouseIcon() {
      IResource $MouseIcon = null;
      Throwable Err = null;

      try {
         $MouseIcon = myMouseIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $MouseIcon;
      }

      return $MouseIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $MouseIcon(IResource v) {
      Throwable Err = null;

      try {
         myMouseIcon = v;
         $Parent().setCursor(VB.Global.VBMouseIconToJCursor(v, this));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $CanGetFocus() {
      boolean $CanGetFocus = false;
      Throwable Err = null;

      try {
         $CanGetFocus = $Parent().isFocusable();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $CanGetFocus;
      }

      return $CanGetFocus;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $CanGetFocus(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setFocusable(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SetFocus() {
      Throwable Err = null;

      try {
         $Parent().requestFocus();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public void RefreshModel() {
      Throwable Err = null;

      try {
         myModel.fireChangeEvent(0, (int)$ListCount());
      } finally {
         return;
      }
   }

   @Override
   public void Refresh() {
      Throwable Err = null;

      label106:
      try {
         $Parent().invalidate();
      } finally {
         break label106;
      }

      label103:
      try {
         $Parent().repaint((long)0, 0, 0, (int)$Width(), (int)$Height());
      } finally {
         break label103;
      }

      label100:
      try {
         $Parent().setSize(getSize());
      } finally {
         break label100;
      }

      try {
         $Parent().revalidate();
      } finally {
         return;
      }
   }

   @Override
   public Font getFont() {
      Font getFont = null;
      Throwable Err = null;

      try {
         getFont = $Parent().getFont();
      } finally {
         return getFont;
      }

      return getFont;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getSelectionBackground() {
      Color getSelectionBackground = null;
      Throwable Err = null;

      try {
         getSelectionBackground = $Parent().getSelectionBackground();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getSelectionBackground;
      }

      return getSelectionBackground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getSelectionForeground() {
      Color getSelectionForeground = null;
      Throwable Err = null;

      try {
         getSelectionForeground = $Parent().getSelectionForeground();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getSelectionForeground;
      }

      return getSelectionForeground;
   }

   @Override
   public Color getBackground() {
      Color getBackground = null;
      Throwable Err = null;

      try {
         getBackground = $Parent().getBackground();
      } finally {
         return getBackground;
      }

      return getBackground;
   }

   @Override
   public Color getForeground() {
      Color getForeground = null;
      Throwable Err = null;

      try {
         getForeground = $Parent().getForeground();
      } finally {
         return getForeground;
      }

      return getForeground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void ResizeTriggerInit(float w, float h) {
      Throwable Err = null;

      try {
         hostSavedWidth = w;
         hostSavedHeight = h;
         mySavedWidth = $Width();
         mySavedHeight = $Height();
         isResizeTriggerInitialized = true;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void ResizeTrigger(float w, float h) {
      Throwable Err = null;
      int h6 = 0;

      label369: {
         Throwable var10000;
         label368: {
            label374: {
               try {
                  if (!(isResizeTriggerInitialized & isLeftInitialized & isTopInitialized)) {
                     break label374;
                  }
               } finally {
                  break label369;
               }

               h6 = (boolean)0;

               try {
                  h6 = myAnchor.intValue() & 12;
                  if (h6 != VB.AnchorStyles.vbLeft.intValue()) {
                     if (h6 != VB.AnchorStyles.vbRight.intValue()) {
                        if (h6 != VB.AnchorStyles.vbLeftRight.intValue()) {
                           if (h6 == VB.AnchorStyles.vbNone.intValue()) {
                              $Left((float)((double)(w - mySavedWidth) / (double)(hostSavedWidth - mySavedWidth) * (double)mySavedLeft));
                           }
                        } else {
                           $Width(w - hostSavedWidth + mySavedWidth);
                        }
                     } else {
                        $Left(w - hostSavedWidth + mySavedLeft);
                     }
                  }
               } finally {
                  break label369;
               }

               int var28 = 0;

               try {
                  var28 = myAnchor.intValue() & 3;
                  if (var28 != VB.AnchorStyles.vbTop.intValue()) {
                     if (var28 != VB.AnchorStyles.vbBottom.intValue()) {
                        if (var28 != VB.AnchorStyles.vbTopBottom.intValue()) {
                           if (var28 == VB.AnchorStyles.vbNone.intValue()) {
                              $Top((float)((double)(h - mySavedHeight) / (double)(hostSavedHeight - mySavedHeight) * (double)mySavedTop));
                           }
                        } else {
                           $Height(h - hostSavedHeight + mySavedHeight);
                        }
                     } else {
                        $Top(h - hostSavedHeight + mySavedTop);
                     }
                  }
               } catch (Throwable var24) {
                  var10000 = var24;
                  boolean var10001 = false;
                  break label368;
               }
            }

            label354:
            try {
               return;
            } catch (Throwable var22) {
               var10000 = var22;
               boolean var30 = false;
               break label354;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
   }

   public VBVariant Move(float Left) {
      return Move(Left, (float)(-1 * 1), (float)(-1 * 1), (float)(-1 * 1));
   }

   public VBVariant Move(float Left, float Top) {
      return Move(Left, Top, (float)(-1 * 1), (float)(-1 * 1));
   }

   public VBVariant Move(float Left, float Top, float Width) {
      return Move(Left, Top, Width, (float)(-1 * 1));
   }

   public ListBox() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      myModel = new VB.ListBoxModel();
      myList = new JList(myModel);
      myTag = "";
      myMargin = 0L;
      myMarginItem = 0L;
      myBorderStyle = new VB.fmBorderStyle();
      myDefaultBorder = null;
      myRenderer = new VB.ListCellDataRenderer(this);
      myStyle = new VB.ListBoxConstants();
      myMemListIndex = -1 * 1;
      myBorderColorSel = (long)(-1 * 2147483638);
      myBackColorAlternating = 0L;
      myMouseIcon = null;
      myAnchor = VB.AnchorStyles.vbTopLeft;
      mySavedWidth = 0.0F;
      mySavedHeight = 0.0F;
      mySavedLeft = 0.0F;
      mySavedTop = 0.0F;
      hostSavedWidth = 0.0F;
      hostSavedHeight = 0.0F;
      isResizeTriggerInitialized = false;
      isLeftInitialized = false;
      isTopInitialized = false;
   }
}
