package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Adjustable;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ProgressBar extends JProgressBar implements VB.IJabacoControl, MouseListener, MouseMotionListener, ChangeListener, FocusListener {
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

   public void _GotFocus() {
   }

   public void _LostFocus() {
   }

   public void _Change() {
   }

   public void _Click() {
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JProgressBar $Parent() {
      JProgressBar $Parent = null;
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
         if (e.getX() > 0 & e.getY() > 0 & e.getX() < getWidth() & e.getY() < getHeight()) {
            _Click();
         }

         _MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
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
   public void stateChanged(ChangeEvent e) {
      Throwable Err = null;

      try {
         _Change();
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
         $Parent().addFocusListener(this);
         setVisible(false);
         super.setValue(0);
         addChangeListener(this);
         addMouseListener(this);
         addMouseMotionListener(this);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColor() {
      long $BackColor = 0L;
      Throwable Err = null;

      try {
         $BackColor = Information.ColorToRGB(super.getBackground());
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
            super.setBackground(Information.RGBtoColor(v));
         }
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
         $ForeColor = Information.ColorToRGB(getForeground());
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
            setForeground(Information.RGBtoColor(v));
         }
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
   public void $Orientation(VB.fmOrientation v) {
      Throwable Err = null;

      try {
         if (v.compareTo(VB.fmOrientation.fmOrientationVertical) != 0) {
            super.setOrientation(Adjustable.HORIZONTAL);
         } else {
            super.setOrientation(Adjustable.VERTICAL);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmOrientation $Orientation() {
      VB.fmOrientation $Orientation = new VB.fmOrientation();
      Throwable Err = null;

      try {
         if (super.getOrientation() != Adjustable.VERTICAL) {
            $Orientation = VB.fmOrientation.fmOrientationHorizontal;
         } else {
            $Orientation = VB.fmOrientation.fmOrientationVertical;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Orientation;
      }

      return $Orientation;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Min(int v) {
      Throwable Err = null;

      try {
         super.setMinimum(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Min() {
      int $Min = 0;
      Throwable Err = null;

      try {
         $Min = super.getMinimum();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Min;
      }

      return $Min;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Max(int v) {
      Throwable Err = null;

      try {
         super.setMaximum(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Max() {
      int $Max = 0;
      Throwable Err = null;

      try {
         $Max = super.getMaximum();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Max;
      }

      return $Max;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Value(int v) {
      Throwable Err = null;

      try {
         super.setValue(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Value() {
      int $Value = 0;
      Throwable Err = null;

      try {
         $Value = super.getValue();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Value;
      }

      return $Value;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $PaintString(boolean v) {
      Throwable Err = null;

      try {
         setStringPainted(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $PaintString() {
      boolean $PaintString = false;
      Throwable Err = null;

      try {
         $PaintString = super.isStringPainted();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $PaintString;
      }

      return $PaintString;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $InDeterminate(boolean v) {
      Throwable Err = null;

      try {
         setIndeterminate(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $InDeterminate() {
      boolean $InDeterminate = false;
      Throwable Err = null;

      try {
         $InDeterminate = super.isIndeterminate();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $InDeterminate;
      }

      return $InDeterminate;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $ToolTip() {
      String $ToolTip = "";
      Throwable Err = null;

      try {
         $ToolTip = getToolTipText();
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
            setToolTipText(v);
         } else {
            setToolTipText(null);
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
         $Enabled = isEnabled();
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
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
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

   public ProgressBar() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
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
