package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayString;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ComboBox
   extends JComboBox
   implements VB.IJabacoControl,
   VB.IListCellDataOwner,
   MouseListener,
   MouseMotionListener,
   KeyListener,
   ActionListener,
   FocusListener {
   private VB.JBComboBoxStyle myComboBoxStyle;
   private String myTag;
   private IResource myMouseIcon;
   private VB.ListCellDataRenderer myRenderer;
   private long myBorderColorSel;
   private long myMarginItem;
   private long myForeColorSel;
   private long myBackColorSel;
   private long myBackColorAlternating;
   private int myPreviousSelectedIndex;
   private boolean mySorted;
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

   public void _EditorClick() {
   }

   public void _ListClick() {
   }

   public void _Change() {
   }

   public void _GotFocus() {
   }

   public void _DropDown() {
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JComboBox $Parent() {
      JComboBox $Parent = null;
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
         $Parent().addFocusListener(this);
         $Parent().getEditor().getEditorComponent().addFocusListener(this);
         $Parent().addMouseListener(this);
         $Parent().getEditor().getEditorComponent().addMouseListener(this);
         $Parent().addMouseMotionListener(this);
         $Parent().getEditor().getEditorComponent().addMouseMotionListener(this);
         $Parent().addKeyListener(this);
         $Parent().getEditor().getEditorComponent().addKeyListener(this);
         $Parent().setRenderer(myRenderer);
         $Parent().getComponent(0).addMouseListener(this);
         $Parent().addActionListener(this);
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
         myPreviousSelectedIndex = $Parent().getSelectedIndex();
         if ($Parent().isPopupVisible()) {
            _DropDown();
         }

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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseClicked(MouseEvent e) {
      Throwable Err = null;

      try {
         if (!(e.getSource() instanceof JButton)) {
            _EditorClick();
         }
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

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void keyReleased(KeyEvent e) {
      Throwable Err = null;
      boolean bFound = false;
      int i = 0;
      int h7 = 0;
      int h8 = false;
      int SelStart = 0;
      String tmpText = "";

      label1507: {
         Throwable var147;
         label1506: {
            label1505: {
               label1512: {
                  try {
                     if (!(
                        myComboBoxStyle.compareTo(VB.JBComboBoxStyle.jbDropdownCombo) == 0
                           | myComboBoxStyle.compareTo(VB.JBComboBoxStyle.jbDropdownComboAutocomplete) == 0
                     )) {
                        break label1505;
                     }

                     if (getParentEditor().getText().length() == 0) {
                        $Parent().setSelectedIndex(-1 * 1);
                        if (e.getKeyCode() != 40) {
                           $Parent().setPopupVisible(false);
                        }

                        _Change();
                        break label1512;
                     }

                     if (!(e.getKeyCode() != 10 & e.getKeyCode() < 37 | e.getKeyCode() > 40)) {
                        break label1512;
                     }
                  } finally {
                     break label1507;
                  }

                  bFound = false;

                  label1515: {
                     try {
                        if (myComboBoxStyle.compareTo(VB.JBComboBoxStyle.jbDropdownComboAutocomplete) != 0) {
                           break label1515;
                        }
                     } finally {
                        break label1507;
                     }

                     i = 0;
                     h7 = (int)($ListCount() - (long)1);

                     for (int var144 = 1; i <= h7; i += var144) {
                        try {
                           if ($Parent().getModel().getElementAt(i).toString().toLowerCase().startsWith(getParentEditor().getText().toLowerCase())) {
                              bFound = true;
                              break;
                           }
                        } finally {
                           break label1507;
                        }
                     }
                  }

                  label1472: {
                     label1518: {
                        label1470: {
                           label1519: {
                              try {
                                 if (!bFound) {
                                    break label1470;
                                 }

                                 if (e.getKeyCode() == 8 & $Parent().getSelectedIndex() == i) {
                                    $Parent().setSelectedIndex(i);
                                    break label1519;
                                 }
                              } finally {
                                 break label1507;
                              }

                              SelStart = getParentEditor().getText().length();

                              try {
                                 $Parent().setSelectedIndex(i);
                                 getParentEditor().setText($Parent().getModel().getElementAt(i).toString());
                                 getParentEditor().setCaretPosition(SelStart);
                                 getParentEditor().setSelectionStart(SelStart);
                                 getParentEditor().setSelectionEnd($Parent().getModel().getElementAt(i).toString().length());
                              } catch (Throwable var137) {
                                 var147 = var137;
                                 boolean var10001 = false;
                                 break label1518;
                              }
                           }

                           try {
                              break label1472;
                           } catch (Throwable var136) {
                              var147 = var136;
                              boolean var148 = false;
                              break label1518;
                           }
                        }

                        try {
                           ;
                        } catch (Throwable var135) {
                           var147 = var135;
                           boolean var149 = false;
                           break label1518;
                        }

                        tmpText = getParentEditor().getText();

                        try {
                           $Parent().setSelectedIndex(-1 * 1);
                           getParentEditor().setText(tmpText);
                           _Change();
                           break label1472;
                        } catch (Throwable var134) {
                           var147 = var134;
                           boolean var150 = false;
                           break label1506;
                        }
                     }

                     Err = var147;
                     break label1507;
                  }

                  try {
                     ;
                  } catch (Throwable var133) {
                     var147 = var133;
                     boolean var151 = false;
                     break label1506;
                  }
               }

               try {
                  if (e.getKeyCode() == 10) {
                     getParentEditor().selectAll();
                  }
               } catch (Throwable var132) {
                  var147 = var132;
                  boolean var152 = false;
                  break label1506;
               }
            }

            label1433:
            try {
               _KeyUp(e.getKeyCode(), VB.Global.KeyEventToShiftConstant(e));
               return;
            } catch (Throwable var131) {
               var147 = var131;
               boolean var153 = false;
               break label1433;
            }
         }

         Err = var147;
      }

      Interaction.MsgBox(Err);
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
         myPreviousSelectedIndex = $Parent().getSelectedIndex();
         _KeyDown(e.getKeyCode(), VB.Global.KeyEventToShiftConstant(e));
         if (myComboBoxStyle.compareTo(VB.JBComboBoxStyle.jbDropdownCombo) == 0
               | myComboBoxStyle.compareTo(VB.JBComboBoxStyle.jbDropdownComboAutocomplete) == 0
            && e.getKeyCode() == 38 | e.getKeyCode() == 40
            && !$Parent().isPopupVisible()) {
            _DropDown();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent arg) {
      Throwable Err = null;

      try {
         if ($Parent().getSelectedIndex() != -1 * 1) {
            if (myPreviousSelectedIndex != $Parent().getSelectedIndex()) {
               _Click();
            }

            if (arg.getModifiers() == 16 && myPreviousSelectedIndex != $Parent().getSelectedIndex()) {
               _ListClick();
            }

            _Change();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private JTextField getParentEditor() {
      JTextField getParentEditor = null;
      Throwable Err = null;

      try {
         getParentEditor = (JTextField)super.getEditor().getEditorComponent();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getParentEditor;
      }

      return getParentEditor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Clear() {
      Throwable Err = null;

      try {
         $Parent().removeAllItems();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public void Add_Item(VB.ListCellData Item) {
      Throwable Err = null;
      int i = 0;
      int h6 = 0;
      int h7 = false;

      label580: {
         label581: {
            label574:
            try {
               if (!mySorted) {
                  break label581;
               }
            } finally {
               break label574;
            }

            i = 0;
            h6 = $Parent().getModel().getSize() - 1;

            for (int var81 = 1; i <= h6; i += var81) {
               label563:
               try {
                  if (Double.parseDouble($Parent().getModel().getElementAt(i).toString()) < Double.parseDouble(Item.toString())) {
                     break;
                  }
               } finally {
                  break label563;
               }

               try {
                  if ($Parent().getModel().getElementAt(i).toString().compareToIgnoreCase(Item.toString()) > 0) {
                     break;
                  }
               } finally {
                  continue;
               }
            }

            try {
               $Parent().insertItemAt((VB.ListCellData)Item, i);
               break label580;
            } finally {
               break label580;
            }
         }

         label543:
         try {
            ;
         } finally {
            break label543;
         }

         label541:
         try {
            $Parent().addItem((VB.ListCellData)Item);
         } finally {
            break label541;
         }
      }

      label538:
      try {
         ;
      } finally {
         break label538;
      }

      try {
         fireChange();
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void AddItem(String Item) {
      Throwable Err = null;
      VB.ListCellData tmpCellData = new VB.ListCellData(Item, null, false);

      try {
         tmpCellData.$Owner(this);
         Add_Item(tmpCellData);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void AddItem(String Item, int Index) {
      Throwable Err = null;
      VB.ListCellData tmpCellData = new VB.ListCellData(Item, null, false);

      try {
         tmpCellData.$Owner(this);
         $Parent().insertItemAt((VB.ListCellData)tmpCellData, Index);
         fireChange();
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void AddItem(VB.ListCellData Item) {
      Throwable Err = null;

      try {
         Item.$Owner(this);
         Add_Item(Item);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void AddItem(VB.ListCellData Item, int Index) {
      Throwable Err = null;

      try {
         Item.$Owner(this);
         $Parent().insertItemAt((VB.ListCellData)Item, Index);
         fireChange();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void AddItem(VB.Usercontrol v) {
      Throwable Err = null;
      VB.ListCellData tmpCellData = new VB.ListCellData(v);

      try {
         tmpCellData.$Owner(this);
         $Parent().addItem((VB.ListCellData)tmpCellData);
         fireChange();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void AddItem(VB.Usercontrol v, int Index) {
      Throwable Err = null;
      VB.ListCellData tmpCellData = new VB.ListCellData(v);

      try {
         tmpCellData.$Owner(this);
         $Parent().insertItemAt((VB.ListCellData)tmpCellData, Index);
         fireChange();
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void RemoveItem(int Index) {
      Throwable Err = null;

      try {
         $Parent().removeItemAt(Index);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Sorted() {
      boolean $Sorted = false;
      Throwable Err = null;

      try {
         $Sorted = mySorted;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Sorted;
      }

      return $Sorted;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Sorted(boolean v) {
      Throwable Err = null;

      try {
         mySorted = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ListCount() {
      long $ListCount = 0L;
      Throwable Err = null;

      try {
         $ListCount = (long)$Parent().getItemCount();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ListCount;
      }

      return $ListCount;
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

   public String List(long Index) {
      String List = "";
      Throwable Err = null;

      try {
         List = $Parent().getItemAt((int)Index).toString();
      } finally {
         return List;
      }

      return List;
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
         if (val >= -1 * 1 & (long)val < $ListCount()) {
            $Parent().setSelectedIndex(val);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   private VB.ListCellData GetCellData(long Index) {
      VB.ListCellData GetCellData = null;
      Throwable Err = null;

      try {
         GetCellData = (VB.ListCellData)$Parent().getItemAt((int)Index);
      } finally {
         return GetCellData;
      }

      return GetCellData;
   }

   private Component GetCellComponent(long Index) {
      Component GetCellComponent = null;
      Throwable Err = null;

      try {
         GetCellComponent = GetCellData(Index).getComponent(this, null, (long)$ListIndex() == Index, (long)$ListIndex() == Index);
      } finally {
         return GetCellComponent;
      }

      return GetCellComponent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Text() {
      String $Text = "";
      Throwable Err = null;
      new VB.JBComboBoxStyle();
      VB.JBComboBoxStyle h5 = null;

      try {
         h5 = myComboBoxStyle;
         if (h5.compareTo(new VB.JBComboBoxStyle(0)) == 0 || h5.compareTo(new VB.JBComboBoxStyle(3)) == 0) {
            $Text = getParentEditor().getText();
         } else if (h5.compareTo(new VB.JBComboBoxStyle(1)) == 0 || h5.compareTo(new VB.JBComboBoxStyle(2)) == 0) {
            $Text = List((long)$ListIndex());
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Text;
      }

      return $Text;
   }

   public void $Text(String v) {
      Throwable Err = null;
      new VB.JBComboBoxStyle();
      int i = 0;
      int h7 = 0;
      int h8 = false;
      VB.JBComboBoxStyle h5 = null;

      label267: {
         label272: {
            try {
               h5 = myComboBoxStyle;
               if (h5.compareTo(new VB.JBComboBoxStyle(0)) == 0 || h5.compareTo(new VB.JBComboBoxStyle(3)) == 0) {
                  getParentEditor().setText(v);
                  break label272;
               }

               if (h5.compareTo(new VB.JBComboBoxStyle(1)) != 0 && h5.compareTo(new VB.JBComboBoxStyle(2)) != 0) {
                  break label272;
               }
            } finally {
               break label267;
            }

            i = 0;
            h7 = (int)$ListCount();

            for (int var23 = 1; i <= h7; i += var23) {
               try {
                  if (Strings.StrComp(List((long)i), v) == 0) {
                     $ListIndex(i);
                     return;
                  }
               } finally {
                  break label267;
               }
            }
         }

         label233:
         try {
            return;
         } finally {
            break label233;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   public void $ComboList(String v) {
      Throwable Err = null;
      int h7 = 0;
      int h8 = 0;
      new VBArray();
      int i = 0;

      label96: {
         VBArrayString ary;
         try {
            ary = Strings.Split(v, "|");
            Clear();
         } finally {
            break label96;
         }

         i = 0;
         h7 = ary.getUBound(1);
         h8 = 1;

         while (true) {
            if (i > h7) {
               return;
            }

            try {
               AddItem(ary.valueOfStr(i));
            } finally {
               break;
            }

            i += h8;
         }
      }

      Interaction.MsgBox((Throwable)Err);
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
   public VB.JBComboBoxStyle $Style() {
      VB.JBComboBoxStyle $Style = new VB.JBComboBoxStyle();
      Throwable Err = null;

      try {
         $Style = myComboBoxStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Style;
      }

      return $Style;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Style(VB.JBComboBoxStyle v) {
      Throwable Err = null;
      new VB.JBComboBoxStyle();
      VB.JBComboBoxStyle h5 = null;

      try {
         if (v.compareTo(new VB.JBComboBoxStyle(0)) == 0 || v.compareTo(new VB.JBComboBoxStyle(3)) == 0) {
            $Parent().setEditable(true);
         } else if (v.compareTo(new VB.JBComboBoxStyle(1)) == 0 || v.compareTo(new VB.JBComboBoxStyle(2)) == 0) {
            $Parent().setEditable(false);
         }

         myComboBoxStyle = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $DropedDown() {
      boolean $DropedDown = false;
      Throwable Err = null;

      try {
         $DropedDown = $Parent().isPopupVisible();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $DropedDown;
      }

      return $DropedDown;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void DropDown() {
      Throwable Err = null;

      try {
         $Parent().setPopupVisible(true);
         _DropDown();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
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

   public Font $Font() {
      Font $Font = null;
      Throwable Err = null;

      try {
         $Font = $Parent().getFont();
      } finally {
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
         $Parent().setBackground(Information.RGBtoColor(v));
         if (myComboBoxStyle.intValue() == 0 | myComboBoxStyle.intValue() == 3) {
            getParentEditor().setOpaque(true);
            getParentEditor().setBackground($Parent().getBackground());
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
         getParentEditor().setForeground($Parent().getForeground());
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
   @Override
   public void Refresh() {
      Throwable Err = null;

      try {
         $Parent().invalidate();
         $Parent().repaint((long)0, 0, 0, (int)$Width(), (int)$Height());
         $Parent().revalidate();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void fireChange() {
      Throwable Err = null;

      try {
         Refresh();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $BackColorSel(long color) {
      Throwable Err = null;

      try {
         myBackColorSel = color;
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
         $BackColorSel = myBackColorSel;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColorSel;
      }

      return $BackColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $MarginItem(long margin) {
      Throwable Err = null;

      try {
         myMarginItem = margin;
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
   @Override
   public void $BorderColorSel(long color) {
      Throwable Err = null;

      try {
         myBorderColorSel = color;
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
   public long $ForeColorSel() {
      long $ForeColorSel = 0L;
      Throwable Err = null;

      try {
         $ForeColorSel = myForeColorSel;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ForeColorSel;
      }

      return $ForeColorSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $ForeColorSel(long color) {
      Throwable Err = null;

      try {
         myForeColorSel = color;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Font getFont() {
      Font getFont = null;
      Throwable Err = null;

      try {
         getFont = super.getFont();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
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
         getSelectionBackground = Information.RGBtoColor($BackColorSel());
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
         getSelectionForeground = Information.RGBtoColor($ForeColorSel());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getSelectionForeground;
      }

      return getSelectionForeground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getBackground() {
      Color getBackground = null;
      Throwable Err = null;

      try {
         getBackground = super.getBackground();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getBackground;
      }

      return getBackground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getForeground() {
      Color getForeground = null;
      Throwable Err = null;

      try {
         getForeground = super.getForeground();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
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

   public ComboBox() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      myComboBoxStyle = new VB.JBComboBoxStyle();
      myTag = "";
      myMouseIcon = null;
      myRenderer = new VB.ListCellDataRenderer(this);
      myBorderColorSel = 0L;
      myMarginItem = 0L;
      myForeColorSel = 0L;
      myBackColorSel = 0L;
      myBackColorAlternating = 0L;
      myPreviousSelectedIndex = 0;
      mySorted = false;
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
