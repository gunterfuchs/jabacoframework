package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class Line extends JComponent implements VB.IJabacoClass {
   private long mX1;
   private long mX2;
   private long mY1;
   private long mY2;
   private long myBorderWidth;
   private boolean myAntiAliasing;
   private String myTag;

   @Override
   public void paintComponent(Graphics g) {
      Throwable Err = null;

      label200: {
         try {
            if (g == null) {
               return;
            }
         } finally {
            break label200;
         }

         Graphics2D g2d = null;

         label186:
         try {
            g2d = (Graphics2D)g;
            if (myAntiAliasing) {
               g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            }

            g2d.setStroke(new BasicStroke((float)myBorderWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2d.setColor($Parent().getForeground());
            if (!(mX1 <= mX2 & mY1 <= mY2)) {
               if (!(mX1 > mX2 & mY1 <= mY2)) {
                  if (!(mX1 <= mX2 & mY1 > mY2)) {
                     if (mX1 > mX2 & mY1 > mY2) {
                        g2d.drawLine(
                           (int)(mX1 - mX2 + myBorderWidth),
                           (int)(mY1 - mY2 + myBorderWidth),
                           (int)((long)0 + myBorderWidth),
                           (int)((long)0 + myBorderWidth)
                        );
                     }
                  } else {
                     g2d.drawLine(
                        (int)((long)0 + myBorderWidth),
                        (int)(mY1 - mY2 + myBorderWidth),
                        (int)(mX2 - mX1 + myBorderWidth),
                        (int)((long)0 + myBorderWidth)
                     );
                  }
               } else {
                  g2d.drawLine(
                     (int)(mX1 - mX2 + myBorderWidth),
                     (int)((long)0 + myBorderWidth),
                     (int)((long)0 + myBorderWidth),
                     (int)(mY2 - mY1 + myBorderWidth)
                  );
               }
            } else {
               g2d.drawLine(
                  (int)((long)0 + myBorderWidth),
                  (int)((long)0 + myBorderWidth),
                  (int)(mX2 - mX1 + myBorderWidth),
                  (int)(mY2 - mY1 + myBorderWidth)
               );
            }

            g2d.dispose();
            return;
         } finally {
            break label186;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JComponent $Parent() {
      JComponent $Parent = null;
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
   private void recalcMySelf() {
      Throwable Err = null;

      try {
         $Parent()
            .setLocation(
               (int)(Interaction.IIF($X1() > $X2(), VBVariant.valueOf($X2()), VBVariant.valueOf($X1())).doubleValue() - (double)$BorderWidth()),
               (int)(Interaction.IIF($Y1() > $Y2(), VBVariant.valueOf($Y2()), VBVariant.valueOf($Y1())).doubleValue() - (double)$BorderWidth())
            );
         $Parent()
            .setSize(
               (int)(Math.abs($X1() - $X2()) + (long)2 * $BorderWidth() + (long)1),
               (int)(Math.abs($Y1() - $Y2()) + (long)2 * $BorderWidth() + (long)1)
            );
         $Parent().invalidate();
         $Parent().updateUI();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public VB.DrawModeConstants $DrawMode() {
      VB.DrawModeConstants $DrawMode = new VB.DrawModeConstants();
      Throwable Err = null;
      return $DrawMode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $AntiAliasing() {
      boolean $AntiAliasing = false;
      Throwable Err = null;

      try {
         $AntiAliasing = myAntiAliasing;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $AntiAliasing;
      }

      return $AntiAliasing;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $AntiAliasing(boolean v) {
      Throwable Err = null;

      try {
         myAntiAliasing = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public void $DrawMode(VB.DrawModeConstants v) {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BorderColor() {
      long $BorderColor = 0L;
      Throwable Err = null;

      try {
         $BorderColor = Information.ColorToRGB($Parent().getForeground());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BorderColor;
      }

      return $BorderColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BorderColor(long v) {
      Throwable Err = null;

      try {
         $Parent().setForeground(Information.RGBtoColor(v));
         recalcMySelf();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BorderWidth() {
      long $BorderWidth = 0L;
      Throwable Err = null;

      try {
         $BorderWidth = myBorderWidth;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BorderWidth;
      }

      return $BorderWidth;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BorderWidth(long v) {
      Throwable Err = null;

      try {
         myBorderWidth = v;
         recalcMySelf();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $X1(long v) {
      Throwable Err = null;

      try {
         mX1 = v;
         recalcMySelf();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $X1() {
      long $X1 = 0L;
      Throwable Err = null;

      try {
         $X1 = mX1;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $X1;
      }

      return $X1;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Y1(long v) {
      Throwable Err = null;

      try {
         mY1 = v;
         recalcMySelf();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $Y1() {
      long $Y1 = 0L;
      Throwable Err = null;

      try {
         $Y1 = mY1;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Y1;
      }

      return $Y1;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $X2(long v) {
      Throwable Err = null;

      try {
         mX2 = v;
         recalcMySelf();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $X2() {
      long $X2 = 0L;
      Throwable Err = null;

      try {
         $X2 = mX2;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $X2;
      }

      return $X2;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Y2(long v) {
      Throwable Err = null;

      try {
         mY2 = v;
         recalcMySelf();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $Y2() {
      long $Y2 = 0L;
      Throwable Err = null;

      try {
         $Y2 = mY2;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Y2;
      }

      return $Y2;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
   public void Refresh() {
      Throwable Err = null;

      try {
         $Parent().invalidate();
         $Parent()
            .repaint(
               (long)0,
               0,
               0,
               (int)(Math.abs($X1() - $X2()) + (long)2 * $BorderWidth()),
               (int)(Math.abs($Y1() - $Y2()) + (long)2 * $BorderWidth())
            );
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public Line() {
      initVars();
   }

   private void initVars() {
      mX1 = 0L;
      mX2 = 0L;
      mY1 = 0L;
      mY2 = 0L;
      myBorderWidth = 0L;
      myAntiAliasing = false;
      myTag = "";
   }
}
