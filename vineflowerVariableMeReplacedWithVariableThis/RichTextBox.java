package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Constants;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.StringReader;
import java.util.LinkedList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.rtf.RTFEditorKit;

public class RichTextBox extends JScrollPane implements VB.IJabacoControl, MouseListener, MouseMotionListener, KeyListener, FocusListener, AdjustmentListener {
   private VB.fmBorderStyle myBorderStyle;
   private VB.fmSpecialEffect mySpecialEffect;
   private long myBorderColor;
   private String myTag;
   private IResource myMouseIcon;
   private StyleContext myStyle;
   private long myStyleCount;
   private VB.Collection myCursorHive;
   private LinkedList myCursorHiveLL;
   private IResource myHTMLPath;
   private VB.RichTextBox$RTTextPane myText;
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

   public void _Paint(Graphics g) {
   }

   public void _Scroll(float X, float Y) {
   }

   public void _Modified(VB.MODTYPE action, DocumentEvent e) {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JTextPane $Parent() {
      JTextPane $Parent = null;
      Throwable Err = null;

      try {
         $Parent = myText;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   private void Class_Initialize() {
      Throwable Err = null;

      label302:
      try {
         $Parent().addFocusListener(this);
      } finally {
         break label302;
      }

      label299:
      try {
         $Parent().addMouseListener(this);
      } finally {
         break label299;
      }

      label296:
      try {
         $Parent().addMouseMotionListener(this);
      } finally {
         break label296;
      }

      label293:
      try {
         $Parent().addKeyListener(this);
      } finally {
         break label293;
      }

      label290:
      try {
         setViewportView(myText);
      } finally {
         break label290;
      }

      label287:
      try {
         super.setOpaque(false);
      } finally {
         break label287;
      }

      label284:
      try {
         super.getVerticalScrollBar().addAdjustmentListener(this);
      } finally {
         break label284;
      }

      try {
         super.getHorizontalScrollBar().addAdjustmentListener(this);
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mousePressed(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseDown(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseReleased(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
         if (e.getX() > 0 & e.getY() > 0 & e.getX() < getWidth() & e.getY() < getHeight()) {
            if (e.getClickCount() % 2 != 0) {
               _Click();
            } else {
               _DblClick();
            }
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      Throwable Err = null;
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

   @Override
   public void adjustmentValueChanged(AdjustmentEvent arg2) {
      Throwable Err = null;

      try {
         _Scroll((float)$HScrollPos(), (float)$VScrollPos());
      } finally {
         return;
      }
   }

   public int $HScrollPos() {
      int $HScrollPos = 0;
      Throwable Err = null;

      label106:
      try {
         if (Double.valueOf(super.getHorizontalScrollBar().toString()).intValue() != 0) {
            return $HScrollPos;
         }
      } finally {
         break label106;
      }

      label100:
      try {
         if (Double.valueOf(super.getHorizontalScrollBar().getModel().toString()).intValue() != 0) {
            return $HScrollPos;
         }
      } finally {
         break label100;
      }

      try {
         $HScrollPos = super.getHorizontalScrollBar().getModel().getValue();
      } finally {
         return $HScrollPos;
      }

      return $HScrollPos;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $HScrollPos(int v) {
      Throwable Err = null;

      try {
         super.getHorizontalScrollBar().getModel().setValue(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public int $VScrollPos() {
      int $VScrollPos = 0;
      Throwable Err = null;

      label106:
      try {
         if (Double.valueOf(super.getVerticalScrollBar().toString()).intValue() != 0) {
            return $VScrollPos;
         }
      } finally {
         break label106;
      }

      label100:
      try {
         if (Double.valueOf(super.getVerticalScrollBar().getModel().toString()).intValue() != 0) {
            return $VScrollPos;
         }
      } finally {
         break label100;
      }

      try {
         $VScrollPos = super.getVerticalScrollBar().getModel().getValue();
      } finally {
         return $VScrollPos;
      }

      return $VScrollPos;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $VScrollPos(int v) {
      Throwable Err = null;

      try {
         super.getVerticalScrollBar().getModel().setValue(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $HScrollMax() {
      int $HScrollMax = 0;
      Throwable Err = null;

      try {
         $HScrollMax = super.getHorizontalScrollBar().getModel().getMaximum() - super.getViewport().getWidth();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $HScrollMax;
      }

      return $HScrollMax;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $VScrollMax() {
      int $VScrollMax = 0;
      Throwable Err = null;

      try {
         $VScrollMax = super.getVerticalScrollBar().getModel().getMaximum() - super.getViewport().getHeight();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $VScrollMax;
      }

      return $VScrollMax;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.vbScrollBarPolicy $HScrollBar() {
      VB.vbScrollBarPolicy $HScrollBar = new VB.vbScrollBarPolicy();
      Throwable Err = null;

      try {
         $HScrollBar = VB.Global.JScrollBarToVBScrollBarPolicy(super.getHorizontalScrollBarPolicy());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $HScrollBar;
      }

      return $HScrollBar;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $HScrollBar(VB.vbScrollBarPolicy v) {
      Throwable Err = null;

      try {
         super.setHorizontalScrollBarPolicy(VB.Global.VBScrollBarToJScrollBarPolicy(v, true));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.vbScrollBarPolicy $VScrollBar() {
      VB.vbScrollBarPolicy $VScrollBar = new VB.vbScrollBarPolicy();
      Throwable Err = null;

      try {
         $HScrollBar(VB.Global.JScrollBarToVBScrollBarPolicy(super.getVerticalScrollBarPolicy()));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $VScrollBar;
      }

      return $VScrollBar;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $VScrollBar(VB.vbScrollBarPolicy v) {
      Throwable Err = null;

      try {
         super.setVerticalScrollBarPolicy(VB.Global.VBScrollBarToJScrollBarPolicy(v, false));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $SelStart() {
      long $SelStart = 0L;
      Throwable Err = null;

      try {
         $SelStart = (long)$Parent().getSelectionStart();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $SelStart;
      }

      return $SelStart;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SelStart(long v) {
      Throwable Err = null;

      try {
         $Parent().setSelectionStart((int)v);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $SelLength() {
      long $SelLength = 0L;
      Throwable Err = null;

      try {
         $SelLength = (long)$Parent().getSelectionEnd() - $SelStart();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $SelLength;
      }

      return $SelLength;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SelLength(long v) {
      Throwable Err = null;

      try {
         myText.setSelectionEnd((int)($SelStart() + v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $SelText() {
      String $SelText = "";
      Throwable Err = null;

      try {
         $SelText = $Parent().getSelectedText();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $SelText;
      }

      return $SelText;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SelText(String v) {
      Throwable Err = null;

      try {
         $Parent().replaceSelection(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $HtmlFile() {
      IResource $HtmlFile = null;
      Throwable Err = null;

      try {
         $HtmlFile = myHTMLPath;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $HtmlFile;
      }

      return $HtmlFile;
   }

   public void $HtmlFile(IResource param1) {
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
      // 03: invokeinterface VBA/IResource.toString ()Ljava/lang/String; 1
      // 08: invokestatic VBA/Strings.Len (Ljava/lang/String;)I
      // 0b: bipush 0
      // 0c: if_icmpgt 13
      // 0f: bipush 0
      // 10: goto 14
      // 13: bipush 1
      // 14: ifne 1a
      // 17: goto 4d
      // 1a: nop
      // 1b: aload 0
      // 1c: getfield VB/RichTextBox.myText LVB/RichTextBox$RTTextPane;
      // 1f: ldc_w "text/html"
      // 22: invokevirtual javax/swing/JEditorPane.setContentType (Ljava/lang/String;)V
      // 25: aload 0
      // 26: getfield VB/RichTextBox.myText LVB/RichTextBox$RTTextPane;
      // 29: bipush 1
      // 2a: invokevirtual javax/swing/JComponent.setAutoscrolls (Z)V
      // 2d: aload 0
      // 2e: getfield VB/RichTextBox.myText LVB/RichTextBox$RTTextPane;
      // 31: aload 0
      // 32: invokevirtual VB/RichTextBox.$Parent ()Ljavax/swing/JTextPane;
      // 35: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 38: ldc_w "/"
      // 3b: aload 1
      // 3c: invokeinterface VBA/IResource.toString ()Ljava/lang/String; 1
      // 41: invokestatic VBA/Strings.StrMerge (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 44: invokevirtual java/lang/Class.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 47: invokevirtual javax/swing/JEditorPane.setPage (Ljava/net/URL;)V
      // 4a: goto 5b
      // 4d: nop
      // 4e: aload 0
      // 4f: getfield VB/RichTextBox.myText LVB/RichTextBox$RTTextPane;
      // 52: ldc_w "text/plain"
      // 55: invokevirtual javax/swing/JEditorPane.setContentType (Ljava/lang/String;)V
      // 58: goto 5b
      // 5b: nop
      // 5c: nop
      // 5d: nop
      // 5e: return
      // 5f: nop
      // 60: aload 2
      // 61: checkcast java/lang/Throwable
      // 64: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 67: goto 5d
      // 6a: astore 3
      // 6b: astore 2
      // 6c: ret 3
      // 6e: jsr 6a
      // 71: goto 5c
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void appendText(String text) {
      Throwable Err = null;

      try {
         insertText(text, $Parent().getStyledDocument().getLength());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public void replaceText(String text, int pos, int length) {
      Throwable Err = null;

      label60: {
         try {
            saveCursorState();
            $SelStart((long)pos);
            $SelLength((long)length);
         } finally {
            break label60;
         }

         boolean MemLocked = $Locked();

         label51:
         try {
            $Locked(false);
            $Parent().replaceSelection(text);
            $Locked(MemLocked);
            restoreCursorState();
            return;
         } finally {
            break label51;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void insertText(String text, int pos) {
      Throwable Err = null;

      try {
         replaceText(text, pos, 0);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void insertText(String text, int pos, boolean Bold, boolean Italic, long TextColor) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Bold(Bold);
         tmpStyle.$Italic(Italic);
         tmpStyle.$TextColor(TextColor);
         insertText(text, pos, tmpStyle);
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void insertText(String text, int pos, VB.RTStyle style) {
      Throwable Err = null;
      int iOldLen = Strings.Len($Text());

      try {
         insertText(text, pos);
         setStyle(pos, (long)Strings.Len(text), style, true);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void replaceText(String text, int pos, int length, boolean Bold, boolean Italic, long TextColor) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Bold(Bold);
         tmpStyle.$Italic(Italic);
         tmpStyle.$TextColor(TextColor);
         replaceText(text, pos, length, tmpStyle);
      } catch (Throwable var12) {
         Interaction.MsgBox(var12);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void replaceText(String text, int pos, int length, VB.RTStyle style) {
      Throwable Err = null;

      try {
         replaceText(text, pos, length);
         Interaction.MsgBox(String.valueOf(Strings.Len(text)));
         setStyle(pos, (long)Strings.Len(text), style, true);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void appendText(String text, boolean Bold, boolean Italic, long TextColor) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Bold(Bold);
         tmpStyle.$Italic(Italic);
         tmpStyle.$TextColor(TextColor);
         appendText(text, tmpStyle);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void appendText(String text, VB.RTStyle style) {
      Throwable Err = null;
      int iOldLen = Strings.Len($Text());

      try {
         appendText(text);
         setStyle(iOldLen, (long)Strings.Len(text), style, true);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void saveCursorState() {
      Throwable Err = null;
      VB.RTFCursorState tmpItem = new VB.RTFCursorState();

      try {
         tmpItem.Redraw = $Redraw();
         tmpItem.SelStart = (int)$SelStart();
         tmpItem.SelLength = (int)$SelLength();
         tmpItem.VScrollPos = $VScrollPos();
         tmpItem.HScrollPos = $HScrollPos();
         myCursorHiveLL.addLast((VB.RTFCursorState)tmpItem);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void restoreCursorState() {
      Throwable Err = null;
      new VB.RTFCursorState();

      try {
         if (myCursorHiveLL.size() >= 1) {
            VB.RTFCursorState tmpItem = (VB.RTFCursorState)((VB.RTFCursorState)myCursorHiveLL.removeLast()).clone();
            $SelStart((long)tmpItem.SelStart);
            $SelLength((long)tmpItem.SelLength);
            revalidateRT();
            $VScrollPos(tmpItem.VScrollPos);
            $HScrollPos(tmpItem.HScrollPos);
            $Redraw(tmpItem.Redraw);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void revalidateRT() {
      Throwable Err = null;

      try {
         $Parent().revalidate();
         $Parent().updateUI();
         super.revalidate();
         super.updateUI();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Redraw() {
      boolean $Redraw = false;
      Throwable Err = null;

      try {
         $Redraw = !$Parent().getIgnoreRepaint();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Redraw;
      }

      return $Redraw;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Redraw(boolean v) {
      Throwable Err = null;

      try {
         super.setIgnoreRepaint(!v);
         $Parent().setIgnoreRepaint(!v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public StyleContext setStyle(int start, long length, VB.RTStyle style, boolean overwrite) {
      StyleContext setStyle = null;
      Throwable Err = null;

      try {
         $StyledDoc().setCharacterAttributes(start, (int)length, style.getStyle(), overwrite);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return (StyleContext)setStyle;
      }

      return (StyleContext)setStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public StyleContext setStyle(int start, long length, Style style, boolean overwrite) {
      StyleContext setStyle = null;
      Throwable Err = null;

      try {
         $StyledDoc().setCharacterAttributes(start, (int)length, style, overwrite);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return (StyleContext)setStyle;
      }

      return (StyleContext)setStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.RTStyle getStyle(int pos) {
      VB.RTStyle getStyle = null;
      Throwable Err = null;
      Style tmpStyle = null;

      try {
         tmpStyle = $StyledDoc().getLogicalStyle(pos);
         if (tmpStyle != null) {
            getStyle = new VB.RTStyle((Style)tmpStyle);
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return getStyle;
      }

      return getStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String getText(int start, int length) {
      String getText = "";
      Throwable Err = null;

      try {
         if (start >= 1) {
            if (length >= 0) {
               getText = Strings.Mid($Text(), start, length);
            }
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return getText;
      }

      return getText;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int GetPosByXY(int x, int y) {
      int GetPosByXY = 0;
      Throwable Err = null;

      try {
         GetPosByXY = GetPosByXY(new Point(x, y));
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return GetPosByXY;
      }

      return GetPosByXY;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int GetPosByXY(Point v) {
      int GetPosByXY = 0;
      Throwable Err = null;
      int ret = 0;

      try {
         ret = $Parent().viewToModel(v);
         GetPosByXY = ret;
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return GetPosByXY;
      }

      return GetPosByXY;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Point GetXYByPos(int pos) {
      Point GetXYByPos = null;
      Throwable Err = null;

      try {
         GetXYByPos = $Parent().modelToView(pos).getLocation();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return GetXYByPos;
      }

      return GetXYByPos;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Rectangle GetRectByPos(int pos) {
      Rectangle GetRectByPos = null;
      Throwable Err = null;

      try {
         GetRectByPos = $Parent().modelToView(pos);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return GetRectByPos;
      }

      return GetRectByPos;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setBidiLevel(int start, long length, int v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$BidiLevel(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setSuperscript(int start, long length, boolean v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Superscript(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setSubscript(int start, long length, boolean v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Subscript(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setSpaceAbove(int start, long length, float v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$SpaceAbove(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setSpaceBelow(int start, long length, float v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$SpaceBelow(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setRightIndent(int start, long length, float v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$RightIndent(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setLeftIndent(int start, long length, float v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$LeftIndent(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setFirstLineIndent(int start, long length, float v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$FirstLineIndent(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setBold(int start, long length, boolean v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Bold(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setItalic(int start, long length, boolean v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Italic(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setUnderline(int start, long length, boolean v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Underline(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setFontName(int start, long length, String v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$FontName(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setFontSize(int start, long length, int v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$FontSize(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setTextColor(int start, long length, long v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$TextColor(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setBackColor(int start, long length, long v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$BackColor(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setIcon(int start, long length, IResource v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$Icon(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void setStrikeThrough(int start, long length, boolean v) {
      Throwable Err = null;
      VB.RTStyle tmpStyle = null;

      try {
         tmpStyle = createStyle();
         tmpStyle.$StrikeThrough(v);
         setStyle(start, length, tmpStyle, false);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.RTStyle createStyle() {
      VB.RTStyle createStyle = null;
      Throwable Err = null;

      try {
         createStyle = new VB.RTStyle($StyledDoc().addStyle(null, null));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return createStyle;
      }

      return createStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.RTStyle createStyle(String styleName) {
      VB.RTStyle createStyle = null;
      Throwable Err = null;

      try {
         createStyle = new VB.RTStyle($StyledDoc().addStyle(styleName, null));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return createStyle;
      }

      return createStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void removeStyle(String styleName) {
      Throwable Err = null;

      try {
         $StyledDoc().removeStyle(styleName);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public StyledDocument $StyledDoc() {
      StyledDocument $StyledDoc = null;
      Throwable Err = null;

      try {
         $StyledDoc = $Parent().getStyledDocument();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $StyledDoc;
      }

      return $StyledDoc;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public StyleContext $StyleContext() {
      StyleContext $StyleContext = null;
      Throwable Err = null;

      try {
         $StyleContext = myStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $StyleContext;
      }

      return $StyleContext;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Text() {
      String $Text = "";
      Throwable Err = null;

      try {
         $Text = $Parent().getDocument().getText(0, $Parent().getDocument().getLength());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Text;
      }

      return $Text;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Text(String s) {
      Throwable Err = null;
      Document tmpDoc = $Parent().getDocument();

      try {
         tmpDoc.remove(0, tmpDoc.getLength());
         $Parent().getEditorKit().read(new StringReader(s), tmpDoc, 0);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Print(String s) {
      Throwable Err = null;

      try {
         $Text(Strings.StrCat(Strings.StrCat($Text(), s), Constants.vbNewLine));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public void LoadFile(String FileName) {
      Throwable Err = null;
      FileInputStream fis = new FileInputStream(FileName);
      DefaultStyledDocument doc = new DefaultStyledDocument(new StyleContext());
      RTFEditorKit kit = new RTFEditorKit();

      label298:
      try {
         $Parent().setEditorKit(kit);
      } finally {
         break label298;
      }

      label295:
      try {
         $Parent().setDocument(doc);
      } finally {
         break label295;
      }

      label292:
      try {
         kit.read(fis, doc, 0);
      } finally {
         break label292;
      }

      label289: {
         label288:
         try {
            if (Err == null) {
               break label289;
            }
         } finally {
            break label288;
         }

         label282:
         try {
            Interaction.MsgBox(Err.getMessage());
         } finally {
            break label282;
         }
      }

      label279:
      try {
         ;
      } finally {
         break label279;
      }

      try {
         fis.close();
      } finally {
         return;
      }
   }

   public String $StyledText() {
      String $StyledText = "";
      Throwable Err = null;
      return $StyledText;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public StyledDocument $Style() {
      StyledDocument $Style = null;
      Throwable Err = null;

      try {
         $Style = $Parent().getStyledDocument();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Style;
      }

      return $Style;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void InsertIcon(IResource IconPath, int pos) {
      Throwable Err = null;

      try {
         saveCursorState();
         $SelStart((long)pos);
         $SelLength((long)0);
         InsertIcon(IconPath);
         restoreCursorState();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void InsertComponent(Component v, int pos) {
      Throwable Err = null;

      try {
         saveCursorState();
         $SelStart((long)pos);
         $SelLength((long)0);
         InsertComponent(v);
         restoreCursorState();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void InsertIcon(IResource IconPath) {
      Throwable Err = null;

      try {
         $Parent().insertIcon(VB.Global.LoadIcon(IconPath));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void InsertComponent(Component v) {
      Throwable Err = null;

      try {
         $Parent().insertComponent(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColorSel() {
      long $BackColorSel = 0L;
      Throwable Err = null;

      try {
         $BackColorSel = Information.ColorToRGB($Parent().getSelectionColor());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColorSel;
      }

      return $BackColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColorSel(long v) {
      Throwable Err = null;

      try {
         if (v != (long)(-1 * 1)) {
            $Parent().setSelectionColor(Information.RGBtoColor(v));
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ForeColorSel() {
      long $ForeColorSel = 0L;
      Throwable Err = null;

      try {
         $BackColorSel(Information.ColorToRGB($Parent().getSelectedTextColor()));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ForeColorSel;
      }

      return $ForeColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ForeColorSel(long v) {
      Throwable Err = null;

      try {
         if (v != (long)(-1 * 1)) {
            $Parent().setSelectedTextColor(Information.RGBtoColor(v));
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public String toString() {
      String toString = "";
      Throwable Err = null;

      try {
         toString = $Text();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return toString;
      }

      return toString;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Locked() {
      boolean $Locked = false;
      Throwable Err = null;

      try {
         $Locked = !$Parent().isEditable();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Locked;
      }

      return $Locked;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Locked(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setEditable(!v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myText_Paint(Graphics g) {
      Throwable Err = null;

      try {
         _Paint(g);
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
         if (v != (long)(-1 * 1)) {
            $Parent().setBackground(Information.RGBtoColor(v));
         }

         super.setBackground($Parent().getBackground());
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
         if (v != (long)(-1 * 1)) {
            $Parent().setForeground(Information.RGBtoColor(v));
         }

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
         $Enabled = $Parent().isEnabled();
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
         $Parent().setEnabled(v);
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Refresh() {
      Throwable Err = null;

      try {
         $Parent().invalidate();
         $Parent().repaint((long)0, 0, 0, (int)$Width(), (int)$Height());
         $Parent().setSize(getSize());
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myText_Modified(VB.MODTYPE action, DocumentEvent e) {
      Throwable Err = null;

      try {
         _Modified(action, e);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
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

   public RichTextBox() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      myBorderStyle = new VB.fmBorderStyle();
      mySpecialEffect = new VB.fmSpecialEffect();
      myBorderColor = 0L;
      myTag = "";
      myMouseIcon = null;
      myStyle = new StyleContext();
      myStyleCount = 0L;
      myCursorHive = new VB.Collection();
      myCursorHiveLL = new LinkedList();
      myHTMLPath = null;
      myText = new VB.RichTextBox$RTTextPane();
      myText.setOwner(this, 1);
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
