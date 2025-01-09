package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBVariant;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class JBCellRenderer extends DefaultTableCellRenderer {
   private VB.JBGrid myGrid;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBCellRenderer(VB.JBGrid refGrid) {
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

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
      Component getTableCellRendererComponent = null;
      Throwable Err = null;
      JCheckBox myCheck = null;
      int ColSelR = 0;
      int ColSelG = 0;
      int ColSelB = 0;
      int ColBackR = 0;
      int ColBackG = 0;
      int ColBackB = 0;
      VB.JBCellData myCellData = null;

      label1103: {
         Throwable var161;
         label1102: {
            label1101: {
               label1100: {
                  label1108: {
                     label1098: {
                        label1097: {
                           label1109: {
                              label1095: {
                                 try {
                                    if (!(value instanceof VB.JBCellData)) {
                                       break label1108;
                                    }

                                    myCellData = (VB.JBCellData)value;
                                    if (Strings.StrComp(myCellData.$Text(), null) == 0) {
                                       break label1097;
                                    }

                                    if (myGrid.$AutoCheckBox() & VB.Global.IsStringBoolean(myCellData.$Text())) {
                                       break label1095;
                                    }
                                 } finally {
                                    break label1103;
                                 }

                                 try {
                                    getTableCellRendererComponent = myCellData.getComponent(myGrid, isSelected, hasFocus, row);
                                    break label1109;
                                 } catch (Throwable var148) {
                                    var161 = var148;
                                    boolean var10001 = false;
                                    break label1100;
                                 }
                              }

                              myCheck = new JCheckBox();

                              try {
                                 myCheck.setHorizontalAlignment(0);
                                 myCheck.setOpaque(true);
                                 myCheck.setBackground(myCellData.getComponent(myGrid, isSelected, hasFocus, row).getBackground());
                                 myCheck.setSelected(VB.Global.GetStringAsBoolean(myCellData.$Text()));
                                 myCheck.setBorderPainted(hasFocus);
                                 if (hasFocus) {
                                    myCheck.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
                                 }

                                 getTableCellRendererComponent = myCheck;
                              } catch (Throwable var147) {
                                 var161 = var147;
                                 boolean var162 = false;
                                 break label1100;
                              }
                           }

                           try {
                              break label1098;
                           } catch (Throwable var146) {
                              var161 = var146;
                              boolean var163 = false;
                              break label1100;
                           }
                        }

                        try {
                           getTableCellRendererComponent = myCellData.getComponent(myGrid, isSelected, hasFocus, row);
                        } catch (Throwable var145) {
                           var161 = var145;
                           boolean var164 = false;
                           break label1100;
                        }
                     }

                     label1071: {
                        label1112: {
                           try {
                              if (!isSelected) {
                                 break label1071;
                              }

                              if (myGrid.$DataMatrix((long)row, (long)col).$CellBackColor() == (long)(-1 * 1)) {
                                 break label1112;
                              }
                           } catch (Throwable var144) {
                              var161 = var144;
                              boolean var165 = false;
                              break label1100;
                           }

                           ColSelR = getTableCellRendererComponent.getBackground().getRed();
                           ColSelG = getTableCellRendererComponent.getBackground().getGreen();
                           ColSelB = getTableCellRendererComponent.getBackground().getBlue();
                           ColBackR = (int)((long)((double)myGrid.$DataMatrix((long)row, (long)col).$CellBackColor() / (double)1) & (long)255);
                           ColBackG = (int)((long)((double)myGrid.$DataMatrix((long)row, (long)col).$CellBackColor() / (double)256) & (long)255);
                           ColBackB = (int)((long)((double)myGrid.$DataMatrix((long)row, (long)col).$CellBackColor() / (double)65536) & (long)255);

                           try {
                              ColSelR = (int)((double)ColSelR / (double)3 * (double)2 + (double)ColBackR / (double)3);
                              ColSelG = (int)((double)ColSelG / (double)3 * (double)2 + (double)ColBackG / (double)3);
                              ColSelB = (int)((double)ColSelB / (double)3 * (double)2 + (double)ColBackB / (double)3);
                              getTableCellRendererComponent.setBackground(Information.RGBtoColor(Information.RGB(ColSelR, ColSelG, ColSelB)));
                           } catch (Throwable var143) {
                              var161 = var143;
                              boolean var166 = false;
                              break label1102;
                           }
                        }

                        try {
                           if (myGrid.$DataMatrix((long)row, (long)col).$CellForeColor() != (long)(-1 * 1)) {
                              getTableCellRendererComponent.setForeground(Information.RGBtoColor(myGrid.$DataMatrix((long)row, (long)col).$CellForeColor()));
                           }
                        } catch (Throwable var142) {
                           var161 = var142;
                           boolean var167 = false;
                           break label1102;
                        }
                     }

                     try {
                        break label1101;
                     } catch (Throwable var141) {
                        var161 = var141;
                        boolean var168 = false;
                        break label1102;
                     }
                  }

                  try {
                     getTableCellRendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                     getTableCellRendererComponent.setBackground(
                        Information.RGBtoColor(
                           Interaction.IIF(
                                 isSelected,
                                 VBVariant.valueOf(myGrid.$BackColorSel()),
                                 Interaction.IIF(
                                    row % 2 == 1, VBVariant.valueOf(myGrid.$BackColorCellsAlternating()), VBVariant.valueOf(myGrid.$BackColorCells())
                                 )
                              )
                              .longValue()
                        )
                     );
                     break label1101;
                  } catch (Throwable var140) {
                     var161 = var140;
                     boolean var169 = false;
                     break label1102;
                  }
               }

               Err = var161;
               break label1103;
            }

            label1051:
            try {
               return getTableCellRendererComponent;
            } catch (Throwable var139) {
               var161 = var139;
               boolean var170 = false;
               break label1051;
            }
         }

         Err = var161;
      }

      Interaction.MsgBox(Err);
      return getTableCellRendererComponent;
   }

   private void initVars() {
      myGrid = null;
   }
}
