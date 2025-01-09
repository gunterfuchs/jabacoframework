package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JSlider implements VB.IJabacoControl, MouseListener, MouseMotionListener, ChangeListener, FocusListener {
   private IResource myMouseIcon;
   private String myTag;
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
   public JSlider $Parent() {
      JSlider $Parent = null;
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
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         $Parent().setVisible(false);
         $Parent().addFocusListener(this);
         super.setValue(0);
         $Parent().addChangeListener(this);
         $Parent().addMouseListener(this);
         $Parent().addMouseMotionListener(this);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
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
   public VB.BackStyleConstants $BackStyle() {
      VB.BackStyleConstants $BackStyle = new VB.BackStyleConstants();
      Throwable Err = null;

      try {
         if (!isOpaque()) {
            $BackStyle = VB.BackStyleConstants.vbTransparent;
         } else {
            $BackStyle = VB.BackStyleConstants.vbSolid;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $BackStyle;
      }

      return $BackStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackStyle(VB.BackStyleConstants val) {
      Throwable Err = null;
      new VB.BackStyleConstants();
      VB.BackStyleConstants h5 = null;

      try {
         if (val.compareTo(VB.BackStyleConstants.vbTransparent) != 0) {
            if (val.compareTo(VB.BackStyleConstants.vbSolid) == 0) {
               $Parent().setOpaque(true);
            }
         } else {
            $Parent().setOpaque(false);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void stateChanged(ChangeEvent e) {
      Throwable Err = null;

      try {
         if ($Visible()) {
            _Change();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Orientation(VB.OrientationConstants v) {
      Throwable Err = null;

      try {
         if (v.compareTo(VB.OrientationConstants.ccOrientationVertical) != 0) {
            super.setInverted(false);
         } else {
            super.setInverted(true);
         }

         super.setOrientation(v.intValue());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.OrientationConstants $Orientation() {
      VB.OrientationConstants $Orientation = new VB.OrientationConstants();
      Throwable Err = null;

      try {
         $Orientation = new VB.OrientationConstants(super.getOrientation());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Orientation;
      }

      return $Orientation;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $TickStyle(VB.TickStyleConstants v) {
      Throwable Err = null;

      try {
         if (v.compareTo(VB.TickStyleConstants.sldNoTicks) != 0) {
            super.setPaintTicks(true);
         } else {
            super.setPaintTicks(false);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.TickStyleConstants $TickStyle() {
      VB.TickStyleConstants $TickStyle = new VB.TickStyleConstants();
      Throwable Err = null;

      try {
         if (!super.getPaintTicks()) {
            $TickStyle = VB.TickStyleConstants.sldNoTicks;
         } else {
            $TickStyle = VB.TickStyleConstants.sldTopLeft;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $TickStyle;
      }

      return $TickStyle;
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
         if (super.getValue() != v) {
            super.setValue(v);
         }
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
   public void $SnapToTicks(boolean v) {
      Throwable Err = null;

      try {
         super.setSnapToTicks(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $SnapToTicks() {
      boolean $SnapToTicks = false;
      Throwable Err = null;

      try {
         $SnapToTicks = super.getSnapToTicks();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $SnapToTicks;
      }

      return $SnapToTicks;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $TickFrequency(int v) {
      Throwable Err = null;

      try {
         super.setMinorTickSpacing(0);
         super.setMajorTickSpacing(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $TickFrequency() {
      int $TickFrequency = 0;
      Throwable Err = null;

      try {
         $TickFrequency = super.getMajorTickSpacing();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $TickFrequency;
      }

      return $TickFrequency;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $PaintLabels(boolean v) {
      Throwable Err = null;

      try {
         super.setPaintLabels(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $PaintLabels() {
      boolean $PaintLabels = false;
      Throwable Err = null;

      try {
         $PaintLabels = super.getPaintLabels();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $PaintLabels;
      }

      return $PaintLabels;
   }

   public String $FontName() {
      String $FontName = "";
      Throwable Err = null;

      try {
         $FontName = $Parent().getFont().getFamily();
      } finally {
         return $FontName;
      }

      return $FontName;
   }

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
      } finally {
         return;
      }
   }

   public boolean $FontBold() {
      boolean $FontBold = false;
      Throwable Err = null;

      try {
         $FontBold = $Parent().getFont().isBold();
      } finally {
         return $FontBold;
      }

      return $FontBold;
   }

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
      } finally {
         return;
      }
   }

   public boolean $FontItalic() {
      boolean $FontItalic = false;
      Throwable Err = null;

      try {
         $FontItalic = $Parent().getFont().isItalic();
      } finally {
         return $FontItalic;
      }

      return $FontItalic;
   }

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
      } finally {
         return;
      }
   }

   public int $FontSize() {
      int $FontSize = 0;
      Throwable Err = null;

      try {
         $FontSize = VB.Global.JFontSizeToVBFontSize($Font().getSize());
      } finally {
         return $FontSize;
      }

      return $FontSize;
   }

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
      } finally {
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
         $ForeColor = Information.ColorToRGB(super.getForeground());
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
            super.setForeground(Information.RGBtoColor(v));
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
   @Override
   public String toString() {
      String toString = "";
      Throwable Err = null;

      try {
         toString = String.valueOf($Value());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return toString;
      }

      return toString;
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

   public Slider() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      myMouseIcon = null;
      myTag = "";
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
