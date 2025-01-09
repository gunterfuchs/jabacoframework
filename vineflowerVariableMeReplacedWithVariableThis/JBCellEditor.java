package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellEditor;

public class JBCellEditor extends AbstractCellEditor implements TableCellEditor {
   private VB.JBCellEditor$TextBox myText;
   private VB.JBCellEditor$ComboBox myCombo;
   private VB.JBCellEditor$CommandButton myButton;
   private VB.JBCellEditor$CheckBox myCheck;
   private VB.JBCellEditor$Spinner mySpinner;
   private VB.Label myLabel;
   private JPanel ButtonFrame;
   private VB.CELLEDITTYPE myEditMode;
   private VB.JBCellEditorComponent myCellEditorComponent;
   private VB.JBGrid myGrid;
   private Object lastObject;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBCellEditor(VB.JBGrid refGrid) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myGrid = refGrid;
         myText.$VScrollBar(VB.vbScrollBarPolicy.sbShowNever);
         myText.$HScrollBar(VB.vbScrollBarPolicy.sbShowNever);
         myCheck.$Parent().setHorizontalAlignment(0);
         myText.setBorder(new EmptyBorder(new Insets(0, 0, 0, 0)));
         myCombo.setBorder(new EmptyBorder(new Insets(0, 0, 0, 0)));
         myCombo.$Parent().setFocusable(false);
         myLabel.$Parent().setLabelFor(myButton);
         myLabel.$Visible(true);
         myButton.$Visible(true);
         myButton.$CanGetFocus(false);
         myButton.$Parent().setPreferredSize(new Dimension(23, 23));
         ButtonFrame.add(myButton, BorderLayout.LINE_END);
         ButtonFrame.add(myLabel, BorderLayout.LINE_START);
         ButtonFrame.setVisible(true);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myText_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;

      try {
         if (KeyCode == 13) {
            super.stopCellEditing();
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void mySpinner_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;

      try {
         if (KeyCode == 13) {
            super.stopCellEditing();
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myButton_Click() {
      Throwable Err = null;

      try {
         myGrid.fireCellButtonClick();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myCombo_Click() {
      Throwable Err = null;

      try {
         super.stopCellEditing();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myCheck_Click() {
      Throwable Err = null;

      try {
         super.stopCellEditing();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.JBCellEditorComponent $Component() {
      VB.JBCellEditorComponent $Component = new VB.JBCellEditorComponent();
      Throwable Err = null;

      try {
         $Component = myCellEditorComponent;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Component;
      }

      return $Component;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Component(VB.JBCellEditorComponent v) {
      Throwable Err = null;

      try {
         myCellEditorComponent = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.TextBox $JBTextBox() {
      VB.TextBox $JBTextBox = null;
      Throwable Err = null;

      try {
         $JBTextBox = myText;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $JBTextBox;
      }

      return $JBTextBox;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.CommandButton $JBCommandButton() {
      VB.CommandButton $JBCommandButton = null;
      Throwable Err = null;

      try {
         $JBCommandButton = myButton;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $JBCommandButton;
      }

      return $JBCommandButton;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.ComboBox $JBComboBox() {
      VB.ComboBox $JBComboBox = null;
      Throwable Err = null;

      try {
         $JBComboBox = myCombo;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $JBComboBox;
      }

      return $JBComboBox;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.Spinner $JBSpinner() {
      VB.Spinner $JBSpinner = null;
      Throwable Err = null;

      try {
         $JBSpinner = mySpinner;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $JBSpinner;
      }

      return $JBSpinner;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Value() {
      String $Value = "";
      Throwable Err = null;
      new VB.CELLEDITTYPE();
      VB.CELLEDITTYPE h5 = null;

      try {
         h5 = myEditMode;
         if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_TEXT) != 0) {
            if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_COMBO) != 0) {
               if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_BUTTON) != 0) {
                  if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_CHECK) != 0) {
                     if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_SPINNER) == 0) {
                        $Value = mySpinner.$EditorText();
                     }
                  } else {
                     $Value = String.valueOf(myCheck.$Value());
                  }
               } else {
                  $Value = myLabel.$Caption();
               }
            } else {
               $Value = myCombo.$Text();
            }
         } else {
            $Value = myText.$Text();
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Value;
      }

      return $Value;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Value(String v) {
      Throwable Err = null;
      new VB.CELLEDITTYPE();
      VB.CELLEDITTYPE h5 = null;

      try {
         h5 = myEditMode;
         if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_TEXT) != 0) {
            if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_COMBO) != 0) {
               if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_BUTTON) != 0) {
                  if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_CHECK) != 0) {
                     if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_SPINNER) == 0) {
                        mySpinner.$Value(v);
                     }
                  } else {
                     myCheck.$Value(VB.Global.GetStringAsBoolean(v));
                  }
               } else {
                  myLabel.$Caption(v);
               }
            } else {
               myCombo.$Text(v);
            }
         } else {
            myText.$Text(v);
         }
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
   public boolean isCellEditable(EventObject e) {
      boolean isCellEditable = false;
      Throwable Err = null;
      MouseEvent tmpMouseEvent = null;

      label192: {
         Throwable var10000;
         label191: {
            label197: {
               try {
                  if (myGrid.$Editable().compareTo(VB.JBEditable.jbNotEditable) == 0) {
                     return isCellEditable;
                  }

                  if (!(e instanceof MouseEvent)) {
                     break label197;
                  }
               } finally {
                  break label192;
               }

               tmpMouseEvent = (MouseEvent)e;

               try {
                  if (tmpMouseEvent.getClickCount() % 2 != 0) {
                     isCellEditable = myGrid.$Editable().compareTo(VB.JBEditable.jbEditOnClick) == 0;
                  } else {
                     isCellEditable = myGrid.$Editable().compareTo(VB.JBEditable.jbEditOnDblClick) == 0;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  boolean var10001 = false;
                  break label191;
               }
            }

            label176:
            try {
               return isCellEditable;
            } catch (Throwable var15) {
               var10000 = var15;
               boolean var19 = false;
               break label176;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
      return isCellEditable;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Object getCellEditorValue() {
      Object getCellEditorValue = null;
      Throwable Err = null;
      new VB.CELLEDITTYPE();
      VB.CELLEDITTYPE h5 = null;

      try {
         h5 = myEditMode;
         if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_TEXT) != 0) {
            if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_COMBO) != 0) {
               if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_CHECK) != 0) {
                  if (h5.compareTo(VB.CELLEDITTYPE.CELLEDIT_SPINNER) == 0 && $lastData() != null) {
                     $lastData().$Text(mySpinner.$EditorText());
                  }
               } else if ($lastData() != null) {
                  $lastData().$Text(String.valueOf(myCheck.$Value()));
               }
            } else if ($lastData() != null) {
               $lastData().$Text(myCombo.$Text());
            }
         } else if ($lastData() != null) {
            $lastData().$Text(myText.$Text());
         }

         myGrid.fireAfterEdit((int)myGrid.$Row(), (int)myGrid.$Col());
         getCellEditorValue = lastObject;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return getCellEditorValue;
      }

      return getCellEditorValue;
   }

   public VB.JBCellData $lastData() {
      VB.JBCellData $lastData = null;
      Throwable Err = null;

      try {
         $lastData = (VB.JBCellData)lastObject;
      } finally {
         return $lastData;
      }

      return $lastData;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long getRowBackColor(int row) {
      long getRowBackColor = 0L;
      Throwable Err = null;

      try {
         getRowBackColor = Interaction.IIF(
               row % 2 == 1, VBVariant.valueOf(myGrid.$BackColorCellsAlternating()), VBVariant.valueOf(myGrid.$BackColorCells())
            )
            .longValue();
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return getRowBackColor;
      }

      return getRowBackColor;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int col) {
      Component getTableCellEditorComponent = null;
      Throwable Err = null;
      long myBackColor = 0L;
      new VB.JBCellEditorComponent();
      Component ret = null;

      label484: {
         Throwable var10000;
         label483: {
            label482: {
               label481: {
                  label489: {
                     try {
                        lastObject = value;
                        if ($lastData() == null) {
                           break label489;
                        }

                        ret = $lastData().getEditorComponent(myGrid, isSelected, true);
                        myEditMode = VB.CELLEDITTYPE.CELLEDIT_CUSTOM;
                        if (ret != null) {
                           break label481;
                        }
                     } finally {
                        break label484;
                     }

                     myBackColor = getRowBackColor(row);
                     VB.JBCellEditorComponent h13 = null;

                     try {
                        h13 = myCellEditorComponent;
                        if (h13.compareTo(new VB.JBCellEditorComponent(0)) != 0) {
                           if (h13.compareTo(new VB.JBCellEditorComponent(1)) != 0) {
                              if (h13.compareTo(new VB.JBCellEditorComponent(2)) != 0) {
                                 if (h13.compareTo(new VB.JBCellEditorComponent(3)) != 0) {
                                    if (h13.compareTo(new VB.JBCellEditorComponent(4)) == 0) {
                                       mySpinner.$EditorText($lastData().$Text());
                                       mySpinner.$Parent().setFont(myGrid.$Parent().getFont());
                                       ret = mySpinner;
                                       myEditMode = VB.CELLEDITTYPE.CELLEDIT_SPINNER;
                                    }
                                 } else if (VB.Global.IsStringBoolean($lastData().$Text())) {
                                    myCheck
                                       .$BackColor(
                                          Interaction.IIF(
                                                myGrid.$DataMatrix((long)row, (long)col).$CellBackColor() == (long)(-1 * 1),
                                                VBVariant.valueOf(myGrid.$BackColorSel()),
                                                VBVariant.valueOf(myGrid.$DataMatrix((long)row, (long)col).$CellBackColor())
                                             )
                                             .longValue()
                                       );
                                    myCheck.$Value(VB.Global.GetStringAsBoolean($lastData().$Text()));
                                    ret = myCheck;
                                    myEditMode = VB.CELLEDITTYPE.CELLEDIT_CHECK;
                                 }
                              } else if (myCombo.$ListIndex() > -1 * 1) {
                                 myCombo.$ForeColorSel(myGrid.$ForeColorSel());
                                 myCombo.$BackColorSel(myGrid.$BackColorSel());
                                 myCombo.$BorderColorSel(myGrid.$BackColorSel());
                                 myCombo.$Text($lastData().$Text());
                                 myCombo.$Parent().setFont(myGrid.$Parent().getFont());
                                 myCombo.SetFocus();
                                 ret = myCombo;
                                 myEditMode = VB.CELLEDITTYPE.CELLEDIT_COMBO;
                              }
                           } else {
                              if (myGrid.$DataMatrix((long)row, (long)col).$CellBackColor() == (long)(-1 * 1)) {
                                 ButtonFrame.setBackground(Information.RGBtoColor(myBackColor));
                                 ButtonFrame.getComponent(0).setBackground(Information.RGBtoColor(myBackColor));
                              } else {
                                 ButtonFrame.setBackground(Information.RGBtoColor(myGrid.$DataMatrix((long)row, (long)col).$CellBackColor()));
                                 ButtonFrame
                                    .getComponent(0)
                                    .setBackground(Information.RGBtoColor(myGrid.$DataMatrix((long)row, (long)col).$CellBackColor()));
                              }

                              myLabel.$ForeColor($lastData().$ForeColor());
                              myLabel.$Caption($lastData().$Text());
                              myLabel.$Parent().setFont(myGrid.$Parent().getFont());
                              ret = ButtonFrame;
                              myEditMode = VB.CELLEDITTYPE.CELLEDIT_BUTTON;
                           }
                        } else {
                           myText.$Text($lastData().$Text());
                           myText.$Parent().setFont(myGrid.$Parent().getFont());
                           myText.SetFocus();
                           ret = myText;
                           myEditMode = VB.CELLEDITTYPE.CELLEDIT_TEXT;
                        }
                        break label481;
                     } catch (Throwable var40) {
                        var10000 = var40;
                        boolean var10001 = false;
                        break label483;
                     }
                  }

                  try {
                     ret = null;
                     break label482;
                  } catch (Throwable var41) {
                     var10000 = var41;
                     boolean var47 = false;
                     break label483;
                  }
               }

               try {
                  ;
               } catch (Throwable var39) {
                  var10000 = var39;
                  boolean var46 = false;
                  break label483;
               }
            }

            label463:
            try {
               getTableCellEditorComponent = ret;
               return ret;
            } catch (Throwable var38) {
               var10000 = var38;
               boolean var48 = false;
               break label463;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
      return getTableCellEditorComponent;
   }

   private void initVars() {
      myText = new VB.JBCellEditor$TextBox();
      myText.setOwner(this, 1);
      myCombo = new VB.JBCellEditor$ComboBox();
      myCombo.setOwner(this, 2);
      myButton = new VB.JBCellEditor$CommandButton();
      myButton.setOwner(this, 3);
      myCheck = new VB.JBCellEditor$CheckBox();
      myCheck.setOwner(this, 4);
      mySpinner = new VB.JBCellEditor$Spinner();
      mySpinner.setOwner(this, 5);
      myLabel = new VB.Label();
      ButtonFrame = new JPanel(new BorderLayout());
      myEditMode = VB.CELLEDITTYPE.CELLEDIT_TEXT;
      myCellEditorComponent = new VB.JBCellEditorComponent();
      myGrid = null;
      lastObject = null;
   }
}
