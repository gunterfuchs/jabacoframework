package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class JBHeaderRenderer extends DefaultTableCellRenderer {
   private VB.JBGrid myGrid;
   private int myColumn;
   private IResource myHeaderIcon;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBHeaderRenderer(VB.JBGrid refGrid) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myGrid = refGrid;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private Border getMarginBorder(Border refBorder, int LeftMargin, int RightMargin) {
      Border getMarginBorder = null;
      Throwable Err = null;

      try {
         getMarginBorder = new CompoundBorder(refBorder, new EmptyBorder(0, LeftMargin, 0, RightMargin));
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return getMarginBorder;
      }

      return getMarginBorder;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
      Component getTableCellRendererComponent = null;
      Throwable Err = null;
      Component myBaseComponent = null;

      try {
         myBaseComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
         myHeaderIcon = myGrid.$HeaderIcon(col);
         myColumn = col;
         if (!myGrid.$FlatHeader()) {
            super.setBorder(getMarginBorder(BorderFactory.createRaisedBevelBorder(), 1, 0));
         } else {
            super.setBorder(getMarginBorder(BorderFactory.createEtchedBorder(), 1, 0));
         }

         super.setHorizontalAlignment(myGrid.$HeaderAlign(col).intValue());
         super.setFont(myBaseComponent.getFont());
         super.setBackground(Information.RGBtoColor(myGrid.$BackColorHeader()));
         super.setForeground(Information.RGBtoColor(myGrid.$ForeColorHeader()));
         super.setPreferredSize(new Dimension((int)super.getPreferredSize().getWidth(), myGrid.$HeaderHeight()));
         getTableCellRendererComponent = this;
      } catch (Throwable var12) {
         Interaction.MsgBox(var12);
         return getTableCellRendererComponent;
      }

      return getTableCellRendererComponent;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void paint(Graphics g) {
      Throwable Err = null;
      Graphics2D g2 = null;
      GradientPaint gradientPaint = null;
      Image myHeaderImage = null;
      Color c = null;
      int SortIndicatorTop = 0;
      int SortIndicatorLeft = 0;

      label1384: {
         label1378: {
            Throwable var10000;
            label1377: {
               label1376: {
                  label1375: {
                     label1385: {
                        try {
                           super.setOpaque(false);
                           if (!myGrid.$GradientHeader()) {
                              break label1385;
                           }

                           g.setColor(Information.RGBtoColor(myGrid.$GridColor()));
                           g.fillRect(0, 0, myGrid.$Parent().getColumnModel().getTotalColumnWidth(), super.getHeight());
                           if (myGrid.$FlatHeader()) {
                              g.setColor(Information.RGBtoColor(myGrid.$BackColorHeader()));
                              g.fillRect(0, 0, super.getWidth() - 1, super.getHeight() - 1);
                              break label1375;
                           }
                        } finally {
                           break label1384;
                        }

                        g2 = (Graphics2D)g;

                        try {
                           gradientPaint = new GradientPaint(
                              (float)0,
                              (float)((double)myGrid.$HeaderHeight() / (double)100 * (double)5),
                              new Color(16777215),
                              (float)0,
                              (float)myGrid.$HeaderHeight(),
                              Information.RGBtoColor(myGrid.$BackColorHeader()),
                              false
                           );
                           g2.setPaint((Paint)gradientPaint);
                           g2.fillRect(0, 0, super.getWidth() - 1, super.getHeight() - 1);
                           break label1375;
                        } catch (Throwable var190) {
                           var10000 = var190;
                           boolean var10001 = false;
                           break label1377;
                        }
                     }

                     try {
                        g.setColor(Information.RGBtoColor(myGrid.$BackColorHeader()));
                        super.paintBorder(g);
                        break label1376;
                     } catch (Throwable var191) {
                        var10000 = var191;
                        boolean var202 = false;
                        break label1377;
                     }
                  }

                  try {
                     ;
                  } catch (Throwable var189) {
                     var10000 = var189;
                     boolean var201 = false;
                     break label1377;
                  }
               }

               label1358:
               try {
                  break label1378;
               } catch (Throwable var188) {
                  var10000 = var188;
                  boolean var203 = false;
                  break label1358;
               }
            }

            Err = var10000;
            break label1384;
         }

         int myRightMargin = Interaction.IIF(myGrid.$ColHeaderIndex() == myColumn, VBVariant.valueOf(15), VBVariant.valueOf(4)).intValue();

         Throwable var200;
         label1352: {
            label1351: {
               label1387: {
                  label1349: {
                     label1388: {
                        try {
                           if (myHeaderIcon == null) {
                              break label1388;
                           }
                        } finally {
                           break label1384;
                        }

                        myHeaderImage = VB.Global.LoadPicture(myHeaderIcon);

                        try {
                           super.setBorder(new EmptyBorder(0, myHeaderImage.getWidth(null) + 5, 0, myRightMargin));
                           g.drawImage(
                              (Image)myHeaderImage, 3, (int)((double)super.getHeight() / (double)2 - (double)myHeaderImage.getHeight(null) / (double)2), null
                           );
                           break label1349;
                        } catch (Throwable var186) {
                           var200 = var186;
                           boolean var204 = false;
                           break label1387;
                        }
                     }

                     try {
                        super.setBorder(new EmptyBorder(0, 3, 0, myRightMargin));
                     } catch (Throwable var185) {
                        var200 = var185;
                        boolean var205 = false;
                        break label1387;
                     }
                  }

                  label1390: {
                     try {
                        if (!myGrid.$ShowSortIndicator()) {
                           break label1351;
                        }

                        if (myColumn != myGrid.$ColHeaderIndex()) {
                           break label1390;
                        }
                     } catch (Throwable var184) {
                        var200 = var184;
                        boolean var206 = false;
                        break label1387;
                     }

                     c = Information.RGBtoColor(myGrid.$GridColor());

                     try {
                        g.setColor((Color)c);
                     } finally {
                        break label1384;
                     }

                     SortIndicatorTop = (int)((double)super.getHeight() / (double)2);
                     SortIndicatorLeft = super.getWidth();

                     try {
                        if (myGrid.$SortIndicatorIndex() != 0) {
                           if (myGrid.$SortIndicatorIndex() == 1) {
                              g.drawLine(
                                 SortIndicatorLeft - 5, SortIndicatorTop + 2, (int)((double)SortIndicatorLeft - (double)15 / (double)2), SortIndicatorTop - 2
                              );
                              g.setColor(c.darker());
                              g.drawLine(SortIndicatorLeft - 10, SortIndicatorTop + 2, SortIndicatorLeft - 6, SortIndicatorTop + 2);
                              g.drawLine(
                                 SortIndicatorLeft - 11, SortIndicatorTop + 2, (int)((double)SortIndicatorLeft - (double)15 / (double)2), SortIndicatorTop - 2
                              );
                           }
                        } else {
                           g.drawLine(
                              SortIndicatorLeft - 5, SortIndicatorTop - 2, (int)((double)SortIndicatorLeft - (double)15 / (double)2), SortIndicatorTop + 2
                           );
                           g.setColor(c.darker());
                           g.drawLine(SortIndicatorLeft - 10, SortIndicatorTop - 2, SortIndicatorLeft - 6, SortIndicatorTop - 2);
                           g.drawLine(
                              SortIndicatorLeft - 11, SortIndicatorTop - 2, (int)((double)SortIndicatorLeft - (double)15 / (double)2), SortIndicatorTop + 2
                           );
                        }
                     } catch (Throwable var183) {
                        var200 = var183;
                        boolean var207 = false;
                        break label1352;
                     }
                  }

                  try {
                     break label1351;
                  } catch (Throwable var182) {
                     var200 = var182;
                     boolean var208 = false;
                     break label1352;
                  }
               }

               Err = var200;
               break label1384;
            }

            label1317:
            try {
               super.paintComponent(g);
               return;
            } catch (Throwable var180) {
               var200 = var180;
               boolean var209 = false;
               break label1317;
            }
         }

         Err = var200;
      }

      Interaction.MsgBox(Err);
   }

   private void initVars() {
      myGrid = null;
      myColumn = 0;
      myHeaderIcon = null;
   }
}
