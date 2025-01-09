package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBArrayObject;
import VBA.VBArrayString;
import VBA.VBVariant;
import java.awt.Point;
import java.util.HashMap;
import javax.swing.table.AbstractTableModel;

public class JBGridModel extends AbstractTableModel {
   private HashMap myMatrix;
   private int myMaxRow;
   private int myMaxCol;
   private Point myTmpIndex;
   private VBArrayObject myColumnAlign;
   private VBArrayObject myColumnIcon;
   private VBArrayString myColumnName;
   private VB.JBGrid myGrid;
   private boolean myStopEdit;
   private boolean insideCellEditable;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBGridModel(VB.JBGrid refGrid) {
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
   public AbstractTableModel $Parent() {
      AbstractTableModel $Parent = null;
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
   private long max(long v1, long v2) {
      long max = 0L;
      Throwable Err = null;

      try {
         if (v1 <= v2) {
            max = v2;
         } else {
            max = v1;
         }
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return max;
      }

      return max;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void fireTableCellUpdated(int row, int col) {
      Throwable Err = null;

      try {
         if (myGrid.isEditing(row, col)) {
            myGrid.$CellEditor().$Value(getValueAt(row, col).toString());
         }

         super.fireTableCellUpdated(row, col);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public int getColumnCount() {
      int getColumnCount = 0;
      Throwable Err = null;

      try {
         getColumnCount = myMaxCol;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getColumnCount;
      }

      return getColumnCount;
   }

   public VBVariant setColumnCount(int v) {
      VBVariant setColumnCount = new VBVariant();
      Throwable Err = null;

      label44:
      try {
         myMaxCol = v;
      } finally {
         break label44;
      }

      try {
         $Parent().fireTableStructureChanged();
      } finally {
         return setColumnCount;
      }

      return setColumnCount;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public int getRowCount() {
      int getRowCount = 0;
      Throwable Err = null;

      try {
         getRowCount = myMaxRow;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getRowCount;
      }

      return getRowCount;
   }

   public VBVariant setRowCount(int v) {
      VBVariant setRowCount = new VBVariant();
      Throwable Err = null;

      label44:
      try {
         myMaxRow = v;
      } finally {
         break label44;
      }

      try {
         $Parent().fireTableStructureChanged();
      } finally {
         return setRowCount;
      }

      return setRowCount;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void refreshRowColCount(int row, int col) {
      Throwable Err = null;

      try {
         myMaxRow = (int)max((long)row, (long)myMaxRow);
         myMaxCol = (int)max((long)col, (long)myMaxCol);
         if (myColumnAlign.getUBound(1) != myMaxCol) {
            myColumnAlign.setBound(0, myMaxCol, true);
            myColumnName.setBound(0, myMaxCol, true);
            myColumnIcon.setBound(0, myMaxCol, true);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   public void setColumnAlign(int col, VB.fmTextAlign val) {
      Throwable Err = null;

      label72:
      try {
         refreshRowColCount(myMaxRow, col);
      } finally {
         break label72;
      }

      label69:
      try {
         myColumnAlign.setValueObj(col, val);
      } finally {
         break label69;
      }

      try {
         $Parent().fireTableStructureChanged();
      } finally {
         return;
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmTextAlign getColumnAlign(int col) {
      VB.fmTextAlign getColumnAlign = new VB.fmTextAlign();
      Throwable Err = null;
      new VB.fmTextAlign();
      VB.fmTextAlign h6 = null;

      label834:
      try {
         h6 = (VB.fmTextAlign)myColumnAlign.valueOfObj(col);
      } finally {
         break label834;
      }

      label844: {
         label829: {
            label828: {
               label827: {
                  label845: {
                     label824: {
                        label823: {
                           label846: {
                              try {
                                 if (h6.compareTo(new VB.fmTextAlign(0)) != 0 && h6.compareTo(new VB.fmTextAlign(1)) != 0) {
                                    break label846;
                                 }
                              } catch (Throwable var136) {
                                 boolean var10001 = false;
                                 break label823;
                              }

                              try {
                                 break label823;
                              } catch (Throwable var135) {
                                 boolean var138 = false;
                                 break label823;
                              }
                           }

                           try {
                              if (h6.compareTo(new VB.fmTextAlign(2)) != 0) {
                                 break label845;
                              }
                              break label824;
                           } catch (Throwable var134) {
                              boolean var139 = false;
                              break label827;
                           }
                        }

                        label793:
                        try {
                           getColumnAlign = new VB.fmTextAlign(10);
                           break label844;
                        } finally {
                           break label793;
                        }
                     }

                     try {
                        break label827;
                     } catch (Throwable var133) {
                        boolean var140 = false;
                        break label827;
                     }
                  }

                  try {
                     if (h6.compareTo(new VB.fmTextAlign(3)) != 0) {
                        break label844;
                     }
                     break label828;
                  } catch (Throwable var132) {
                     boolean var141 = false;
                     break label829;
                  }
               }

               label791:
               try {
                  getColumnAlign = new VB.fmTextAlign(0);
                  break label844;
               } finally {
                  break label791;
               }
            }

            label796:
            try {
               ;
            } catch (Throwable var131) {
               boolean var142 = false;
               break label796;
            }
         }

         label786:
         try {
            getColumnAlign = new VB.fmTextAlign(11);
         } finally {
            break label786;
         }
      }

      try {
         ;
      } finally {
         return getColumnAlign;
      }

      return getColumnAlign;
   }

   public void setColumnIcon(int col, IResource val) {
      Throwable Err = null;

      label72:
      try {
         refreshRowColCount(myMaxRow, col);
      } finally {
         break label72;
      }

      label69:
      try {
         myColumnIcon.setValueObj(col, val);
      } finally {
         break label69;
      }

      try {
         $Parent().fireTableStructureChanged();
      } finally {
         return;
      }
   }

   public IResource getColumnIcon(int col) {
      IResource getColumnIcon = null;
      Throwable Err = null;

      try {
         getColumnIcon = (IResource)myColumnIcon.valueOfObj(col);
      } finally {
         return getColumnIcon;
      }

      return getColumnIcon;
   }

   public void setColumnName(int col, String val) {
      Throwable Err = null;

      label72:
      try {
         refreshRowColCount(myMaxRow, col);
      } finally {
         break label72;
      }

      label69:
      try {
         myColumnName.setValueStr(col, val);
      } finally {
         break label69;
      }

      try {
         $Parent().fireTableStructureChanged();
      } finally {
         return;
      }
   }

   @Override
   public String getColumnName(int col) {
      String getColumnName = "";
      Throwable Err = null;

      try {
         getColumnName = myColumnName.valueOfStr(col);
      } finally {
         return getColumnName;
      }

      return getColumnName;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean registerStopEditEvent() {
      boolean registerStopEditEvent = false;
      Throwable Err = null;

      try {
         myStopEdit = true;
         registerStopEditEvent = insideCellEditable;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return registerStopEditEvent;
      }

      return registerStopEditEvent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean isCellEditable(int row, int col) {
      boolean isCellEditable = false;
      Throwable Err = null;

      try {
         if (myGrid.$Editable().compareTo(VB.JBEditable.jbNotEditable) != 0) {
            insideCellEditable = true;
            if (myGrid != null) {
               myStopEdit = false;
               myGrid.fireBeforeEdit(row, col);
               if (!myStopEdit) {
                  isCellEditable = myGrid.$Editable().compareTo(VB.JBEditable.jbNotEditable) != 0;
               } else {
                  isCellEditable = false;
               }
            } else {
               isCellEditable = super.isCellEditable(row, col);
            }

            insideCellEditable = false;
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return isCellEditable;
      }

      return isCellEditable;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void setValueAt(Object val, int row, int col) {
      Throwable Err = null;
      VB.JBCellData myData = null;

      label144: {
         Throwable var10000;
         label143: {
            label149: {
               try {
                  if (val == null) {
                     myMatrix.remove(new Point(col, row));
                     return;
                  }

                  if (!(val instanceof VB.JBCellData)) {
                     break label149;
                  }
               } finally {
                  break label144;
               }

               myData = (VB.JBCellData)val;

               try {
                  myData.$Text(myData.$Text());
                  myData.setOwner(myGrid, row, col);
               } catch (Throwable var17) {
                  var10000 = var17;
                  boolean var10001 = false;
                  break label143;
               }
            }

            label128:
            try {
               refreshRowColCount(row, col);
               myMatrix.put((Point)(new Point(row, col)), val);
               $Parent().fireTableCellUpdated(row, col);
               return;
            } catch (Throwable var16) {
               var10000 = var16;
               boolean var20 = false;
               break label128;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Object getValueAt(int row, int col) {
      Object getValueAt = null;
      Throwable Err = null;
      Object tmpRet = null;

      try {
         myTmpIndex.x = row;
         myTmpIndex.y = col;
         tmpRet = myMatrix.get(myTmpIndex);
         if (tmpRet != null) {
            getValueAt = tmpRet;
         } else {
            getValueAt = "";
         }
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return getValueAt;
      }

      return getValueAt;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void clear() {
      Throwable Err = null;

      try {
         myMatrix = new HashMap();
         myMaxCol = 0;
         myMaxRow = 0;
         $Parent().fireTableDataChanged();
         myColumnAlign.setBound(0, -1 * 1, false);
         myColumnName.setBound(0, -1 * 1, false);
         myColumnIcon.setBound(0, -1 * 1, false);
         super.fireTableStructureChanged();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVars() {
      myMatrix = new HashMap();
      myMaxRow = 0;
      myMaxCol = 0;
      myTmpIndex = new Point(0, 0);
      myColumnAlign = VBArray.createVBArray(new VB.fmTextAlign().getClass());
      myColumnIcon = new VBArray();
      myColumnName = new VBArray();
      myGrid = null;
      myStopEdit = false;
      insideCellEditable = false;
   }
}
