package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class Shape extends JComponent implements VB.IJabacoClass, VB.IJabacoControl {
   private long myBorderWidth;
   private VB.DrawModeConstants myDrawMode;
   private VB.ShapeConstants myShape;
   private long myFillColor;
   private VB.BackStyleConstants myBackStyle;
   private boolean myAntiAliasing;
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

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void paintComponent(Graphics g) {
      Throwable Err = null;
      long myMemWidth = 0L;
      long myMemHeight = 0L;
      new VB.ShapeConstants();
      long myDiameter = 0L;
      long myRadiusBorderWidth = 0L;
      long myRLeft = 0L;
      long myRTop = 0L;
      long myRWidth = 0L;
      long myRHeight = 0L;

      label1380: {
         try {
            if (g == null) {
               return;
            }
         } finally {
            break label1380;
         }

         Graphics2D g2d = null;

         try {
            g2d = (Graphics2D)g;
            if (myAntiAliasing) {
               g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            }
         } finally {
            break label1380;
         }

         long myNewBorderWidth = 0L;

         try {
            myNewBorderWidth = myBorderWidth;
            if (myNewBorderWidth < (long)1) {
               myNewBorderWidth = (long)1;
            }
         } finally {
            break label1380;
         }

         long tmpValue = 0L;

         try {
            if ($Width() <= $Height()) {
               tmpValue = (long)$Width();
            } else {
               tmpValue = (long)$Height();
            }

            if (tmpValue < myNewBorderWidth * (long)2) {
               myNewBorderWidth = (long)((double)tmpValue / (double)2);
            }

            g2d.setStroke(new BasicStroke((float)myNewBorderWidth));
         } finally {
            break label1380;
         }

         long myLeft = 0L;
         long myTop = 0L;
         long myWidth = 0L;
         long myHeight = 0L;

         label1353: {
            Throwable var10000;
            label1352: {
               label1384: {
                  try {
                     myLeft = (long)((double)myNewBorderWidth / (double)2);
                     myTop = (long)((double)myNewBorderWidth / (double)2);
                     myWidth = (long)($Width() - (float)1 - (float)myNewBorderWidth);
                     myHeight = (long)($Height() - (float)1 - (float)myNewBorderWidth);
                     if (!(
                        myShape.compareTo(VB.ShapeConstants.vbShapeSquare) == 0
                           | myShape.compareTo(VB.ShapeConstants.vbShapeCircle) == 0
                           | myShape.compareTo(VB.ShapeConstants.vbShapeRoundedSquare) == 0
                     )) {
                        break label1384;
                     }
                  } finally {
                     break label1380;
                  }

                  myMemWidth = myWidth;
                  myMemHeight = myHeight;

                  try {
                     myWidth = Interaction.IIF(myWidth > myHeight, VBVariant.valueOf(myHeight), VBVariant.valueOf(myWidth)).longValue();
                     myHeight = Interaction.IIF(myWidth > myHeight, VBVariant.valueOf(myHeight), VBVariant.valueOf(myWidth)).longValue();
                     myLeft = (long)((double)myLeft + (double)(myMemWidth - myWidth) / (double)2);
                     myTop = (long)((double)myTop + (double)(myMemHeight - myHeight) / (double)2);
                  } catch (Throwable var100) {
                     var10000 = var100;
                     boolean var10001 = false;
                     break label1352;
                  }
               }

               label1342:
               try {
                  break label1353;
               } catch (Throwable var99) {
                  var10000 = var99;
                  boolean var122 = false;
                  break label1342;
               }
            }

            Err = var10000;
            break label1380;
         }

         VB.ShapeConstants h22 = null;

         label1337:
         try {
            h22 = myShape;
            if (h22.compareTo(VB.ShapeConstants.vbShapeRectangle) != 0 && h22.compareTo(VB.ShapeConstants.vbShapeSquare) != 0) {
               if (h22.compareTo(VB.ShapeConstants.vbShapeOval) != 0 && h22.compareTo(VB.ShapeConstants.vbShapeCircle) != 0) {
                  if (h22.compareTo(VB.ShapeConstants.vbShapeRoundedRectangle) == 0 || h22.compareTo(VB.ShapeConstants.vbShapeRoundedSquare) == 0) {
                     myDiameter = Interaction.IIF(
                           !($Width() <= $Height()),
                           VBVariant.valueOf((double)$Height() / (double)4),
                           VBVariant.valueOf((double)$Width() / (double)4)
                        )
                        .longValue();
                     myRadiusBorderWidth = Interaction.IIF(
                           myNewBorderWidth * (long)2 > myDiameter, VBVariant.valueOf((double)myDiameter / (double)2), VBVariant.valueOf(myNewBorderWidth)
                        )
                        .longValue();
                     myRLeft = (long)((double)myLeft - (double)myNewBorderWidth / (double)2 + (double)myRadiusBorderWidth / (double)2);
                     myRTop = (long)((double)myTop - (double)myNewBorderWidth / (double)2 + (double)myRadiusBorderWidth / (double)2);
                     myRWidth = myRLeft + myWidth + (long)1 + myNewBorderWidth - myDiameter;
                     myRHeight = myRTop + myHeight + (long)1 + myNewBorderWidth - myDiameter;
                     if (myBackStyle.compareTo(VB.BackStyleConstants.vbSolid) == 0) {
                        g2d.setColor($Parent().getBackground());
                        g2d.fillRect(
                           (int)((double)myLeft - (double)myNewBorderWidth / (double)2 + (double)myDiameter / (double)2 - (double)1),
                           (int)((double)myTop - (double)myNewBorderWidth / (double)2 + (double)1),
                           (int)(myWidth - myDiameter + myNewBorderWidth + (long)2),
                           (int)(myHeight + myNewBorderWidth - (long)1)
                        );
                        g2d.fillRect(
                           (int)((double)myLeft - (double)myNewBorderWidth / (double)2 + (double)1),
                           (int)((double)myTop - (double)myNewBorderWidth / (double)2 + (double)myDiameter / (double)2 - (double)1),
                           (int)(myWidth + myNewBorderWidth - (long)1),
                           (int)(myHeight - myDiameter + myNewBorderWidth + (long)2)
                        );
                        g2d.fillArc(
                           (int)myRLeft,
                           (int)myRTop,
                           (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                           (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                           90,
                           90
                        );
                        g2d.fillArc(
                           (int)myRWidth,
                           (int)myRTop,
                           (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                           (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                           0,
                           90
                        );
                        g2d.fillArc(
                           (int)myRLeft,
                           (int)myRHeight,
                           (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                           (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                           180,
                           90
                        );
                        g2d.fillArc(
                           (int)myRWidth,
                           (int)myRHeight,
                           (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                           (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                           270,
                           90
                        );
                     }

                     g2d.setColor($Parent().getForeground());
                     g2d.drawLine(
                        (int)((double)myLeft + (double)myDiameter / (double)2),
                        (int)myTop,
                        (int)((double)(myLeft + myWidth) - (double)myDiameter / (double)2 + (double)1),
                        (int)myTop
                     );
                     g2d.drawLine(
                        (int)((double)myLeft + (double)myDiameter / (double)2),
                        (int)(myTop + myHeight),
                        (int)((double)(myLeft + myWidth) - (double)myDiameter / (double)2 + (double)1),
                        (int)(myTop + myHeight)
                     );
                     g2d.drawLine(
                        (int)myLeft,
                        (int)((double)myTop + (double)myDiameter / (double)2),
                        (int)myLeft,
                        (int)((double)(myTop + myHeight) - (double)myDiameter / (double)2 + (double)1)
                     );
                     g2d.drawLine(
                        (int)(myLeft + myWidth),
                        (int)((double)myTop + (double)myDiameter / (double)2),
                        (int)(myLeft + myWidth),
                        (int)((double)(myTop + myHeight) - (double)myDiameter / (double)2 + (double)1)
                     );
                     g2d.setStroke(new BasicStroke((float)myRadiusBorderWidth, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND));
                     g2d.drawArc(
                        (int)myRLeft, (int)myRTop, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 90, 90
                     );
                     g2d.drawArc(
                        (int)myRWidth, (int)myRTop, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 0, 90
                     );
                     g2d.drawArc(
                        (int)myRLeft,
                        (int)myRHeight,
                        (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                        (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                        180,
                        90
                     );
                     g2d.drawArc(
                        (int)myRWidth,
                        (int)myRHeight,
                        (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                        (int)(myDiameter - (long)1 - myRadiusBorderWidth),
                        270,
                        90
                     );
                  }
               } else {
                  if (myBackStyle.compareTo(VB.BackStyleConstants.vbSolid) == 0) {
                     g2d.setColor($Parent().getBackground());
                     g2d.fillOval((int)myLeft, (int)myTop, (int)(myWidth + (long)1), (int)(myHeight + (long)1));
                  }

                  g2d.setColor($Parent().getForeground());
                  g2d.drawOval((int)myLeft, (int)myTop, (int)myWidth, (int)myHeight);
               }
            } else {
               if (myBackStyle.compareTo(VB.BackStyleConstants.vbSolid) == 0) {
                  g2d.setColor($Parent().getBackground());
                  g2d.fillRect((int)myLeft, (int)myTop, (int)(myWidth + (long)1), (int)(myHeight + (long)1));
               }

               g2d.setColor($Parent().getForeground());
               g2d.drawRect((int)myLeft, (int)myTop, (int)myWidth, (int)myHeight);
            }

            if (myShape.compareTo(VB.ShapeConstants.vbShapeCloud) == 0) {
               if (myBackStyle.compareTo(VB.BackStyleConstants.vbSolid) == 0) {
                  g2d.setColor($Parent().getBackground());
                  g2d.fillOval(
                     (int)((double)191 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)97 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)576 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)448 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)0 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)352 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)381 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)279 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)57 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)571 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)384 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)291 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)209 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)600 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)617 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)383 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)688 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)622 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)599 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)422 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)1150 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)534 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)499 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)377 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)1379 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)303 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)519 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)413 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)1331 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)122 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)529 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)363 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)1248 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)0 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)456 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)392 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)935 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)0 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)449 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)421 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillOval(
                     (int)((double)597 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)36 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)474 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)388 / (double)1044 * (double)($Height() - (float)1))
                  );
                  g2d.fillRect(
                     (int)((double)300 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)270 / (double)1044 * (double)($Height() - (float)1)),
                     (int)((double)1150 / (double)1898 * (double)($Width() - (float)1)),
                     (int)((double)500 / (double)1044 * (double)($Height() - (float)1))
                  );
               }

               g2d.setStroke(new BasicStroke((float)myBorderWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
               g2d.setColor($Parent().getForeground());
               g2d.drawArc(
                  (int)((double)191 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)97 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)576 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)448 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  47,
                  154
               );
               g2d.drawArc(
                  (int)((double)0 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)352 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)381 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)279 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  89,
                  181
               );
               g2d.drawArc(
                  (int)((double)57 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)571 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)384 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)291 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  137,
                  157
               );
               g2d.drawArc(
                  (int)((double)209 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)600 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)617 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)383 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  201,
                  111
               );
               g2d.drawArc(
                  (int)((double)688 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)622 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)599 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)422 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  198,
                  161
               );
               g2d.drawArc(
                  (int)((double)1150 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)534 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)499 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)377 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  240,
                  192
               );
               g2d.drawArc(
                  (int)((double)1379 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)303 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)519 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)413 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  272,
                  128
               );
               g2d.drawArc(
                  (int)((double)1331 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)122 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)529 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)363 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  308,
                  121
               );
               g2d.drawArc(
                  (int)((double)1248 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)0 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)456 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)392 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  12,
                  128
               );
               g2d.drawArc(
                  (int)((double)935 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)0 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)449 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)421 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  46,
                  103
               );
               g2d.drawArc(
                  (int)((double)597 / (double)1898 * (double)($Width() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)36 / (double)1044 * (double)($Height() - (float)1) + (double)myBorderWidth / (double)2),
                  (int)((double)474 / (double)1898 * (double)($Width() - (float)1) - (double)myBorderWidth),
                  (int)((double)388 / (double)1044 * (double)($Height() - (float)1) - (double)myBorderWidth),
                  51,
                  98
               );
            }

            g2d.dispose();
            return;
         } finally {
            break label1337;
         }
      }

      Interaction.MsgBox(Err);
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.DrawModeConstants $DrawMode() {
      VB.DrawModeConstants $DrawMode = new VB.DrawModeConstants();
      Throwable Err = null;

      try {
         $DrawMode = myDrawMode;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $DrawMode;
      }

      return $DrawMode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $DrawMode(VB.DrawModeConstants v) {
      Throwable Err = null;

      try {
         myDrawMode = v;
         Refresh();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.ShapeConstants $Shape() {
      VB.ShapeConstants $Shape = new VB.ShapeConstants();
      Throwable Err = null;

      try {
         $Shape = myShape;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Shape;
      }

      return $Shape;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Shape(VB.ShapeConstants v) {
      Throwable Err = null;

      try {
         myShape = v;
         Refresh();
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
         super.setBackground(Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
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
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $FillColor() {
      long $FillColor = 0L;
      Throwable Err = null;

      try {
         $FillColor = myFillColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $FillColor;
      }

      return $FillColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FillColor(long v) {
      Throwable Err = null;

      try {
         myFillColor = v;
         Refresh();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.BackStyleConstants $BackStyle() {
      VB.BackStyleConstants $BackStyle = new VB.BackStyleConstants();
      Throwable Err = null;

      try {
         $BackStyle = myBackStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $BackStyle;
      }

      return $BackStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackStyle(VB.BackStyleConstants v) {
      Throwable Err = null;

      try {
         myBackStyle = v;
         Refresh();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
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
         Refresh();
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

   public Shape() {
      initVars();
   }

   private void initVars() {
      myBorderWidth = 0L;
      myDrawMode = new VB.DrawModeConstants();
      myShape = new VB.ShapeConstants();
      myFillColor = 0L;
      myBackStyle = new VB.BackStyleConstants();
      myAntiAliasing = false;
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
