package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class JBGrid extends JScrollPane implements VB.IJabacoControl, MouseListener, MouseMotionListener, KeyListener, FocusListener {
   private VB.JBGridModel myModel;
   private JTable myTable;
   private VB.JBHeaderRenderer myHeaderRenderer;
   private VB.JBCellRenderer myRenderer;
   private VB.JBCellEditor myCellEditor;
   private boolean myAutoCheckBox;
   private IResource myHeaderIcon;
   private boolean myFlatHeader;
   private boolean myGradientHeader;
   private long myBackColorHeader;
   private VB.fmBorderStyle myBorderStyle;
   private VB.fmSpecialEffect mySpecialEffect;
   private int myColHeaderIndex;
   private boolean myShowSortIndicator;
   private int mySortIndicatorIndex;
   private int myHeaderHeight;
   private long myBorderColorSel;
   private long myBorderColor;
   private long myBackColorCells;
   private long myBackColorCellsAlternating;
   private String myTag;
   private String myComboList;
   private VB.JBEditable myEditable;
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

   public void _ColHeaderClick() {
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

   public void _RowColChange() {
   }

   public void _BeforeCellEdit(int row, int col) {
   }

   public void _AfterCellEdit(int row, int col) {
   }

   public void _CellButtonClick() {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JTable $Parent() {
      JTable $Parent = null;
      Throwable Err = null;

      try {
         $Parent = myTable;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   private void Class_Initialize() {
      Throwable Err = null;

      label60: {
         try {
            myModel = new VB.JBGridModel(this);
            myTable = new JTable(myModel);
            myHeaderRenderer = new VB.JBHeaderRenderer(this);
            myRenderer = new VB.JBCellRenderer(this);
            myCellEditor = new VB.JBCellEditor(this);
            $Parent().addFocusListener(this);
            super.setViewportView(myTable);
            $Parent().addMouseListener(this);
            $Parent().getTableHeader().addMouseListener(this);
            $Parent().addMouseMotionListener(this);
            $Parent().addKeyListener(this);
         } finally {
            break label60;
         }

         Object tmpObject = new Object();

         label51:
         try {
            $Parent().getTableHeader().setDefaultRenderer(myHeaderRenderer);
            $Parent().setDefaultRenderer(tmpObject.getClass(), myRenderer);
            $Parent().setDefaultEditor(tmpObject.getClass(), myCellEditor);
            $Parent().getTableHeader().setReorderingAllowed(false);
            $Parent().setDoubleBuffered(true);
            super.setDoubleBuffered(true);
            super.setIgnoreRepaint(false);
            return;
         } finally {
            break label51;
         }
      }

      Interaction.MsgBox((Throwable)Err);
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
         if (e.getX() > 0 & e.getY() > 0 & (double)e.getX() < $Parent().getBounds().getWidth() & (double)e.getY() < $Parent().getBounds().getHeight()
            && $Parent().getTableHeader().getMousePosition() == null) {
            if (e.getClickCount() % 2 != 0) {
               _Click();
            } else {
               _DblClick();
            }
         }

         $CellEditor().$Component(VB.JBCellEditorComponent.JBTextBox);
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
         if ($Parent().getTableHeader().getMousePosition() != null) {
            if (myShowSortIndicator) {
               if ($Parent().getTableHeader().columnAtPoint($Parent().getTableHeader().getMousePosition()) != -1 * 1) {
                  if ($ColHeaderIndex() != $Parent().getTableHeader().columnAtPoint($Parent().getTableHeader().getMousePosition())) {
                     mySortIndicatorIndex = 0;
                  } else if (mySortIndicatorIndex != 0) {
                     mySortIndicatorIndex = 0;
                  } else {
                     mySortIndicatorIndex = 1;
                  }
               } else {
                  mySortIndicatorIndex = -1 * 1;
               }
            }

            $ColHeaderIndex($Parent().getTableHeader().columnAtPoint($Parent().getTableHeader().getMousePosition()));
            $Parent().getTableHeader().repaint();
            _ColHeaderClick();
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $ShowSortIndicator() {
      boolean $ShowSortIndicator = false;
      Throwable Err = null;

      try {
         $ShowSortIndicator = myShowSortIndicator;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ShowSortIndicator;
      }

      return $ShowSortIndicator;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ShowSortIndicator(boolean v) {
      Throwable Err = null;

      try {
         myShowSortIndicator = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $SortIndicatorIndex() {
      int $SortIndicatorIndex = 0;
      Throwable Err = null;

      try {
         $SortIndicatorIndex = mySortIndicatorIndex;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $SortIndicatorIndex;
      }

      return $SortIndicatorIndex;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SortIndicatorIndex(int v) {
      Throwable Err = null;

      try {
         mySortIndicatorIndex = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void StartEdit(int row, int col) {
      Throwable Err = null;

      try {
         $Parent().editCellAt(row, col);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void StopEdit() {
      Throwable Err = null;

      try {
         if (!myModel.registerStopEditEvent()) {
            myCellEditor.stopCellEditing();
         }
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBVariant isCellSelected(int row, int col) {
      VBVariant isCellSelected = new VBVariant();
      Throwable Err = null;

      try {
         isCellSelected = VBVariant.valueOf($Parent().isCellSelected(row, col));
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return isCellSelected;
      }

      return isCellSelected;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
   public void $BorderColorSel(long v) {
      Throwable Err = null;

      try {
         myBorderColorSel = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $GridColor() {
      long $GridColor = 0L;
      Throwable Err = null;

      try {
         $GridColor = Information.ColorToRGB($Parent().getGridColor());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $GridColor;
      }

      return $GridColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $GridColor(long v) {
      Throwable Err = null;

      try {
         $Parent().setGridColor(Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColorSel() {
      long $BackColorSel = 0L;
      Throwable Err = null;

      try {
         $BackColorSel = Information.ColorToRGB($Parent().getSelectionBackground());
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
         $Parent().setSelectionBackground(Information.RGBtoColor(v));
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
         $ForeColorSel = Information.ColorToRGB($Parent().getSelectionForeground());
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
         $Parent().setSelectionForeground(Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.SelectionModeSettings $SelectionMode() {
      VB.SelectionModeSettings $SelectionMode = new VB.SelectionModeSettings();
      Throwable Err = null;
      int h5 = 0;
      h5 = (boolean)0;

      try {
         h5 = $Parent().getSelectionModel().getSelectionMode();
         if (h5 != ListSelectionModel.SINGLE_SELECTION) {
            if (h5 != ListSelectionModel.SINGLE_INTERVAL_SELECTION) {
               if (h5 == ListSelectionModel.MULTIPLE_INTERVAL_SELECTION) {
                  $SelectionMode = VB.SelectionModeSettings.flexSelectionByColumn;
               }
            } else {
               $SelectionMode = VB.SelectionModeSettings.flexSelectionByRow;
            }
         } else {
            $SelectionMode = VB.SelectionModeSettings.flexSelectionFree;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $SelectionMode;
      }

      return $SelectionMode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SelectionMode(VB.SelectionModeSettings v) {
      Throwable Err = null;
      new VB.SelectionModeSettings();
      VB.SelectionModeSettings h5 = null;

      try {
         if (v.compareTo(VB.SelectionModeSettings.flexSelectionFree) != 0) {
            if (v.compareTo(VB.SelectionModeSettings.flexSelectionByRow) != 0) {
               if (v.compareTo(VB.SelectionModeSettings.flexSelectionByColumn) == 0) {
                  $Parent().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
               }
            } else {
               $Parent().setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            }
         } else {
            $Parent().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.jbAutoResize $AutoResize() {
      VB.jbAutoResize $AutoResize = new VB.jbAutoResize();
      Throwable Err = null;
      int h5 = 0;
      h5 = (boolean)0;

      try {
         h5 = $Parent().getAutoResizeMode();
         if (h5 != JTable.AUTO_RESIZE_OFF) {
            if (h5 != JTable.AUTO_RESIZE_NEXT_COLUMN) {
               if (h5 != JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS) {
                  if (h5 != JTable.AUTO_RESIZE_LAST_COLUMN) {
                     if (h5 == JTable.AUTO_RESIZE_ALL_COLUMNS) {
                        $AutoResize = VB.jbAutoResize.jbAutoResizeAllColumns;
                     }
                  } else {
                     $AutoResize = VB.jbAutoResize.jbAutoResizeLastColumn;
                  }
               } else {
                  $AutoResize = VB.jbAutoResize.jbAutoResizeSubSequentColumn;
               }
            } else {
               $AutoResize = VB.jbAutoResize.jbAutoResizeNextColumn;
            }
         } else {
            $AutoResize = VB.jbAutoResize.jbAutoResizeOff;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $AutoResize;
      }

      return $AutoResize;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $AutoResize(VB.jbAutoResize v) {
      Throwable Err = null;
      new VB.jbAutoResize();
      VB.jbAutoResize h5 = null;

      try {
         if (v.compareTo(VB.jbAutoResize.jbAutoResizeOff) != 0) {
            if (v.compareTo(VB.jbAutoResize.jbAutoResizeNextColumn) != 0) {
               if (v.compareTo(VB.jbAutoResize.jbAutoResizeSubSequentColumn) != 0) {
                  if (v.compareTo(VB.jbAutoResize.jbAutoResizeLastColumn) != 0) {
                     if (v.compareTo(VB.jbAutoResize.jbAutoResizeAllColumns) == 0) {
                        $Parent().setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                     }
                  } else {
                     $Parent().setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
                  }
               } else {
                  $Parent().setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
               }
            } else {
               $Parent().setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
            }
         } else {
            $Parent().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColorHeader() {
      long $BackColorHeader = 0L;
      Throwable Err = null;

      try {
         $BackColorHeader = myBackColorHeader;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColorHeader;
      }

      return $BackColorHeader;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColorHeader(long v) {
      Throwable Err = null;

      try {
         myBackColorHeader = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ForeColorHeader() {
      long $ForeColorHeader = 0L;
      Throwable Err = null;

      try {
         $ForeColorHeader = Information.ColorToRGB($Parent().getTableHeader().getForeground());
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ForeColorHeader;
      }

      return $ForeColorHeader;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ForeColorHeader(long v) {
      Throwable Err = null;

      try {
         $Parent().getTableHeader().setForeground(Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColorCells() {
      long $BackColorCells = 0L;
      Throwable Err = null;

      try {
         $BackColorCells = myBackColorCells;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColorCells;
      }

      return $BackColorCells;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColorCells(long v) {
      Throwable Err = null;

      try {
         myBackColorCells = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColorCellsAlternating() {
      long $BackColorCellsAlternating = 0L;
      Throwable Err = null;

      try {
         $BackColorCellsAlternating = myBackColorCellsAlternating;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColorCellsAlternating;
      }

      return $BackColorCellsAlternating;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColorCellsAlternating(long v) {
      Throwable Err = null;

      try {
         myBackColorCellsAlternating = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $FlatHeader() {
      boolean $FlatHeader = false;
      Throwable Err = null;

      try {
         $FlatHeader = myFlatHeader;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FlatHeader;
      }

      return $FlatHeader;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FlatHeader(boolean v) {
      Throwable Err = null;

      try {
         myFlatHeader = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $GradientHeader() {
      boolean $GradientHeader = false;
      Throwable Err = null;

      try {
         $GradientHeader = myGradientHeader;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $GradientHeader;
      }

      return $GradientHeader;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $GradientHeader(boolean v) {
      Throwable Err = null;

      try {
         myGradientHeader = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BorderColor() {
      long $BorderColor = 0L;
      Throwable Err = null;

      try {
         $BorderColor = myBorderColor;
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
         myBorderColor = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmBorderStyle $BorderStyle() {
      VB.fmBorderStyle $BorderStyle = new VB.fmBorderStyle();
      Throwable Err = null;

      try {
         $BorderStyle = myBorderStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $BorderStyle;
      }

      return $BorderStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BorderStyle(VB.fmBorderStyle v) {
      Throwable Err = null;

      try {
         myBorderStyle = v;
         SetMyBorder();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmSpecialEffect $SpecialEffect() {
      VB.fmSpecialEffect $SpecialEffect = new VB.fmSpecialEffect();
      Throwable Err = null;

      try {
         $SpecialEffect = mySpecialEffect;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $SpecialEffect;
      }

      return $SpecialEffect;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SpecialEffect(VB.fmSpecialEffect v) {
      Throwable Err = null;

      try {
         mySpecialEffect = v;
         SetMyBorder();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void SetMyBorder() {
      Throwable Err = null;
      Border myBorder = null;

      try {
         myBorder = VB.Global.GetVBBorder($BorderStyle(), $SpecialEffect(), $BorderColor());
         super.setBorder((Border)myBorder);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.JBEditable $Editable() {
      VB.JBEditable $Editable = new VB.JBEditable();
      Throwable Err = null;

      try {
         $Editable = myEditable;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Editable;
      }

      return $Editable;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Editable(VB.JBEditable v) {
      Throwable Err = null;

      try {
         myEditable = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
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
         $Parent().setIgnoreRepaint(!v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Header(int Index) {
      String $Header = "";
      Throwable Err = null;

      try {
         $Header = myModel.getColumnName(Index);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Header;
      }

      return $Header;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Header(int Index, String value) {
      Throwable Err = null;
      VB.JBCellData tmpHeaderItem = new VB.JBCellData(value);

      try {
         myModel.setColumnName(Index, tmpHeaderItem.toString());
         Refresh();
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $HeaderAlign(int Index, VB.fmTextAlign value) {
      Throwable Err = null;

      try {
         myModel.setColumnAlign(Index, value);
         Refresh();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmTextAlign $HeaderAlign(int Index) {
      VB.fmTextAlign $HeaderAlign = new VB.fmTextAlign();
      Throwable Err = null;

      try {
         $HeaderAlign = myModel.getColumnAlign(Index);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $HeaderAlign;
      }

      return $HeaderAlign;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $HeaderIcon(int Index) {
      IResource $HeaderIcon = null;
      Throwable Err = null;

      try {
         $HeaderIcon = myModel.getColumnIcon(Index);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $HeaderIcon;
      }

      return $HeaderIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $HeaderIcon(int Index, IResource value) {
      Throwable Err = null;

      try {
         myModel.setColumnIcon(Index, value);
         Refresh();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $ColHeaderIndex() {
      int $ColHeaderIndex = 0;
      Throwable Err = null;

      try {
         $ColHeaderIndex = myColHeaderIndex;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ColHeaderIndex;
      }

      return $ColHeaderIndex;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ColHeaderIndex(int v) {
      Throwable Err = null;

      try {
         if (v > -1 * 2 & v < $Cols()) {
            myColHeaderIndex = v;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean isEditing() {
      boolean isEditing = false;
      Throwable Err = null;

      try {
         isEditing = $Parent().isEditing();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return isEditing;
      }

      return isEditing;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean isEditing(int row, int col) {
      boolean isEditing = false;
      Throwable Err = null;

      try {
         if (isEditing() && $Col() == (long)col & $Row() == (long)row) {
            isEditing = true;
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return isEditing;
      }

      return isEditing;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Cols(int v) {
      Throwable Err = null;

      try {
         myModel.setColumnCount(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Cols() {
      int $Cols = 0;
      Throwable Err = null;

      try {
         $Cols = myModel.getColumnCount();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Cols;
      }

      return $Cols;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Rows(int v) {
      Throwable Err = null;

      try {
         myModel.setRowCount(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Rows() {
      int $Rows = 0;
      Throwable Err = null;

      try {
         $Rows = myModel.getRowCount();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Rows;
      }

      return $Rows;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $HeaderHeight(int v) {
      Throwable Err = null;

      try {
         myHeaderHeight = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $HeaderHeight() {
      int $HeaderHeight = 0;
      Throwable Err = null;

      try {
         $HeaderHeight = myHeaderHeight;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $HeaderHeight;
      }

      return $HeaderHeight;
   }

   public void $TextMatrix(long row, long col, String text) {
      Throwable Err = null;
      VB.JBCellData tmpCellItem = null;

      label298:
      try {
         tmpCellItem = (VB.JBCellData)myModel.getValueAt((int)row, (int)col);
      } finally {
         break label298;
      }

      label295: {
         label294:
         try {
            if (tmpCellItem != null) {
               break label295;
            }
         } finally {
            break label294;
         }

         label288:
         try {
            tmpCellItem = new VB.JBCellData();
         } finally {
            break label288;
         }
      }

      label285:
      try {
         ;
      } finally {
         break label285;
      }

      label282:
      try {
         tmpCellItem.$Text(text);
      } finally {
         break label282;
      }

      label279:
      try {
         myModel.setValueAt(tmpCellItem, (int)row, (int)col);
      } finally {
         break label279;
      }

      try {
         Refresh();
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $TextMatrix(long row, long col) {
      String $TextMatrix = "";
      Throwable Err = null;
      VB.JBCellData tmpCellItem = null;
      Object tmpData = null;

      try {
         tmpData = myModel.getValueAt((int)row, (int)col);
         tmpCellItem = (VB.JBCellData)tmpData;
         if (tmpCellItem == null) {
            $TextMatrix = tmpData.toString();
         } else {
            $TextMatrix = tmpCellItem.$Text();
         }
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return $TextMatrix;
      }

      return $TextMatrix;
   }

   public void $CellBackColor(long row, long col, long backcolor) {
      Throwable Err = null;
      VB.JBCellData tmpCellItem = null;

      label298:
      try {
         tmpCellItem = (VB.JBCellData)myModel.getValueAt((int)row, (int)col);
      } finally {
         break label298;
      }

      label295: {
         label294:
         try {
            if (tmpCellItem != null) {
               break label295;
            }
         } finally {
            break label294;
         }

         label288:
         try {
            tmpCellItem = new VB.JBCellData();
         } finally {
            break label288;
         }
      }

      label285:
      try {
         ;
      } finally {
         break label285;
      }

      label282:
      try {
         tmpCellItem.$CellBackColor(backcolor);
      } finally {
         break label282;
      }

      label279:
      try {
         myModel.setValueAt(tmpCellItem, (int)row, (int)col);
      } finally {
         break label279;
      }

      try {
         Refresh();
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $CellBackColor(long row, long col) {
      long $CellBackColor = 0L;
      Throwable Err = null;
      VB.JBCellData tmpCellItem = null;
      Object tmpData = null;

      try {
         tmpData = myModel.getValueAt((int)row, (int)col);
         tmpCellItem = (VB.JBCellData)tmpData;
         if (tmpCellItem == null) {
            $CellBackColor = (long)(-1 * 1);
         } else {
            $CellBackColor = tmpCellItem.$CellBackColor();
         }
      } catch (Throwable var12) {
         Interaction.MsgBox(var12);
         return $CellBackColor;
      }

      return $CellBackColor;
   }

   public void $CellForeColor(long row, long col, long forecolor) {
      Throwable Err = null;
      VB.JBCellData tmpCellItem = null;

      label298:
      try {
         tmpCellItem = (VB.JBCellData)myModel.getValueAt((int)row, (int)col);
      } finally {
         break label298;
      }

      label295: {
         label294:
         try {
            if (tmpCellItem != null) {
               break label295;
            }
         } finally {
            break label294;
         }

         label288:
         try {
            tmpCellItem = new VB.JBCellData();
         } finally {
            break label288;
         }
      }

      label285:
      try {
         ;
      } finally {
         break label285;
      }

      label282:
      try {
         tmpCellItem.$CellForeColor(forecolor);
      } finally {
         break label282;
      }

      label279:
      try {
         myModel.setValueAt(tmpCellItem, (int)row, (int)col);
      } finally {
         break label279;
      }

      try {
         Refresh();
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $CellForeColor(long row, long col) {
      long $CellForeColor = 0L;
      Throwable Err = null;
      VB.JBCellData tmpCellItem = null;
      Object tmpData = null;

      try {
         tmpData = myModel.getValueAt((int)row, (int)col);
         tmpCellItem = (VB.JBCellData)tmpData;
         if (tmpCellItem == null) {
            $CellForeColor = (long)(-1 * 1);
         } else {
            $CellForeColor = tmpCellItem.$CellForeColor();
         }
      } catch (Throwable var12) {
         Interaction.MsgBox(var12);
         return $CellForeColor;
      }

      return $CellForeColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $DataMatrix(long row, long col, VB.JBCellData data) {
      Throwable Err = null;

      try {
         myModel.setValueAt(data, (int)row, (int)col);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   public VB.JBCellData $DataMatrix(long row, long col) {
      VB.JBCellData $DataMatrix = null;
      Throwable Err = null;

      try {
         $DataMatrix = (VB.JBCellData)myModel.getValueAt((int)row, (int)col);
      } finally {
         return $DataMatrix;
      }

      return $DataMatrix;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ClearData() {
      Throwable Err = null;

      try {
         if (isEditing()) {
            myCellEditor.stopCellEditing();
         }

         myModel.clear();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public TableCellRenderer getDefaultRenderer(Class columnClass) {
      TableCellRenderer getDefaultRenderer = null;
      Throwable Err = null;

      try {
         getDefaultRenderer = null;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return (TableCellRenderer)getDefaultRenderer;
      }

      return (TableCellRenderer)getDefaultRenderer;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void fireBeforeEdit(int row, int col) {
      Throwable Err = null;

      try {
         _BeforeCellEdit(row, col);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void fireAfterEdit(int row, int col) {
      Throwable Err = null;

      try {
         _AfterCellEdit(row, col);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void fireCellButtonClick() {
      Throwable Err = null;

      try {
         _CellButtonClick();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.JBCellRenderer $Renderer() {
      VB.JBCellRenderer $Renderer = null;
      Throwable Err = null;

      try {
         $Renderer = myRenderer;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Renderer;
      }

      return $Renderer;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.JBCellEditor $CellEditor() {
      VB.JBCellEditor $CellEditor = null;
      Throwable Err = null;

      try {
         $CellEditor = myCellEditor;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $CellEditor;
      }

      return $CellEditor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Row(long val) {
      Throwable Err = null;

      try {
         $Parent().setEditingRow((int)val);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $Row() {
      long $Row = 0L;
      Throwable Err = null;

      try {
         $Row = (long)$Parent().getSelectedRow();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Row;
      }

      return $Row;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Col(long val) {
      Throwable Err = null;

      try {
         $Parent().setEditingColumn((int)val);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $Col() {
      long $Col = 0L;
      Throwable Err = null;

      try {
         $Col = (long)$Parent().getSelectedColumn();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Col;
      }

      return $Col;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ColWidth(long col, long val) {
      Throwable Err = null;

      try {
         $Parent().getColumnModel().getColumn((int)col).setPreferredWidth((int)val);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ColWidth(long col) {
      long $ColWidth = 0L;
      Throwable Err = null;

      try {
         $ColWidth = (long)$Parent().getColumnModel().getColumn((int)col).getPreferredWidth();
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return $ColWidth;
      }

      return $ColWidth;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $RowHeightGlobal(int v) {
      Throwable Err = null;

      try {
         if (v >= 1) {
            $Parent().setRowHeight(v);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $RowHeightGlobal() {
      int $RowHeightGlobal = 0;
      Throwable Err = null;

      try {
         $RowHeightGlobal = $Parent().getRowHeight();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $RowHeightGlobal;
      }

      return $RowHeightGlobal;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $RowHeight(long row, int v) {
      Throwable Err = null;

      try {
         if (v >= 1) {
            $Parent().setRowHeight((int)row, v);
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $RowHeight(long row) {
      int $RowHeight = 0;
      Throwable Err = null;

      try {
         $RowHeight = $Parent().getRowHeight((int)row);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return $RowHeight;
      }

      return $RowHeight;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ShowHorizontalLines(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setShowHorizontalLines(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $ShowHorizontalLines() {
      boolean $ShowHorizontalLines = false;
      Throwable Err = null;

      try {
         $ShowHorizontalLines = $Parent().getShowHorizontalLines();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ShowHorizontalLines;
      }

      return $ShowHorizontalLines;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ShowVerticalLines(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setShowVerticalLines(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $ShowVerticalLines() {
      boolean $ShowVerticalLines = false;
      Throwable Err = null;

      try {
         $ShowVerticalLines = $Parent().getShowVerticalLines();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ShowVerticalLines;
      }

      return $ShowVerticalLines;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $HeaderVisible(boolean v) {
      Throwable Err = null;

      try {
         $Parent().getTableHeader().setVisible(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $HeaderVisible() {
      boolean $HeaderVisible = false;
      Throwable Err = null;

      try {
         $HeaderVisible = $Parent().getTableHeader().isVisible();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $HeaderVisible;
      }

      return $HeaderVisible;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $AutoCheckBox(boolean v) {
      Throwable Err = null;

      try {
         myAutoCheckBox = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $AutoCheckBox() {
      boolean $AutoCheckBox = false;
      Throwable Err = null;

      try {
         $AutoCheckBox = myAutoCheckBox;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $AutoCheckBox;
      }

      return $AutoCheckBox;
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
         setFont(
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
         setFont(
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
         setFont(
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
         setFont(
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
   @Override
   public void setFont(Font refFont) {
      Throwable Err = null;

      try {
         super.setFont(refFont);
         if ($Parent() != null) {
            $Parent().setFont(refFont);
            $Parent().getTableHeader().setFont(refFont);
         }
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
         super.setBackground(Information.RGBtoColor(v));
         super.getViewport().setBackground(Information.RGBtoColor(v));
         $Parent().getTableHeader().setBackground(Information.RGBtoColor(v));
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
         $Parent().revalidate();
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

   public JBGrid() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      myModel = null;
      myTable = null;
      myHeaderRenderer = null;
      myRenderer = null;
      myCellEditor = null;
      myAutoCheckBox = false;
      myHeaderIcon = null;
      myFlatHeader = false;
      myGradientHeader = false;
      myBackColorHeader = 0L;
      myBorderStyle = new VB.fmBorderStyle();
      mySpecialEffect = new VB.fmSpecialEffect();
      myColHeaderIndex = 0;
      myShowSortIndicator = false;
      mySortIndicatorIndex = 0;
      myHeaderHeight = 0;
      myBorderColorSel = 0L;
      myBorderColor = 0L;
      myBackColorCells = 0L;
      myBackColorCellsAlternating = 0L;
      myTag = "";
      myComboList = "";
      myEditable = new VB.JBEditable();
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
