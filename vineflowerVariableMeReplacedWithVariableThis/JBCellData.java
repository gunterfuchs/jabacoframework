package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;

public class JBCellData extends VB.Label {
   private VB.JBGrid myGrid;
   private VB.Usercontrol myComponentOwn;
   private boolean myEditable;
   private long myCellBackColor;
   private long myCellForeColor;
   private int myRow;
   private int myCol;

   public JBCellData() {
      Throwable Err = null;
      super();
      initVarsI();
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBCellData(String refText) {
      Throwable Err = null;
      super();
      initVarsI();

      try {
         super.$Caption(refText);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBCellData(String refText, IResource refIcon) {
      Throwable Err = null;
      super();
      initVarsI();

      try {
         super.$Caption(refText);
         super.$Picture(refIcon);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBCellData(String refText, IResource refIcon, long refCellBackColor) {
      Throwable Err = null;
      super();
      initVarsI();

      try {
         super.$Caption(refText);
         super.$Picture(refIcon);
         myCellBackColor = refCellBackColor;
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBCellData(String refText, IResource refIcon, long refCellBackColor, long refCellForeColor) {
      Throwable Err = null;
      super();
      initVarsI();

      try {
         super.$Caption(refText);
         super.$Picture(refIcon);
         myCellBackColor = refCellBackColor;
         myCellForeColor = refCellForeColor;
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JBCellData(VB.Usercontrol refControl) {
      Throwable Err = null;
      super();
      initVarsI();

      try {
         myComponentOwn = refControl;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBVariant setOwner(VB.JBGrid v, int row, int col) {
      VBVariant setOwner = new VBVariant();
      Throwable Err = null;

      try {
         myGrid = v;
         myRow = row;
         myCol = col;
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return setOwner;
      }

      return setOwner;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Component getEditorComponent(VB.JBGrid table, boolean isSelected, boolean hasFocus) {
      Component getEditorComponent = null;
      Throwable Err = null;

      try {
         getEditorComponent = myComponentOwn;
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return getEditorComponent;
      }

      return getEditorComponent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private Border getBorderFocusSel() {
      Border getBorderFocusSel = null;
      Throwable Err = null;
      boolean bUseDefault = true;

      try {
         if (myGrid != null && myGrid.$BorderColorSel() != (long)(-1 * 2147483638)) {
            bUseDefault = false;
         }

         if (!bUseDefault) {
            getBorderFocusSel = BorderFactory.createLineBorder(new Color((int)Information.ColorToRGB(new Color((int)myGrid.$BorderColorSel()))));
         } else {
            getBorderFocusSel = UIManager.getBorder("List.focusCellHighlightBorder");
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return getBorderFocusSel;
      }

      return getBorderFocusSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Component getComponent(VB.JBGrid table, boolean isSelected, boolean hasFocus, int row) {
      Component getComponent = null;
      Throwable Err = null;

      try {
         if (table != null) {
            if (myComponentOwn != null) {
               myComponentOwn
                  .setBackground(
                     Information.RGBtoColor(
                        Interaction.IIF(
                              isSelected,
                              VBVariant.valueOf(table.$BackColorSel()),
                              Interaction.IIF(row % 2 == 1, VBVariant.valueOf(table.$BackColorCellsAlternating()), VBVariant.valueOf(table.$BackColorCells()))
                           )
                           .longValue()
                     )
                  );
               myComponentOwn
                  .setForeground(
                     (Color)Interaction.IIF(
                           isSelected, VBVariant.valueOf(table.$Parent().getSelectionForeground()), VBVariant.valueOf(table.$Parent().getForeground())
                        )
                        .toObject()
                  );
               myComponentOwn
                  .setBorder(
                     (Border)Interaction.IIF(hasFocus, VBVariant.valueOf(getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1))).toObject()
                  );
               myComponentOwn.setFont(table.$Parent().getFont());
               myComponentOwn.setPreferredSize(myComponentOwn.getPreferredSize());
               getComponent = myComponentOwn;
            } else {
               $BackStyle(VB.BackStyleConstants.vbSolid);
               $Parent().setVerticalTextPosition(SwingConstants.CENTER);
               $BackColor(
                  Interaction.IIF(
                        isSelected,
                        VBVariant.valueOf(table.$BackColorSel()),
                        Interaction.IIF(row % 2 == 1, VBVariant.valueOf(table.$BackColorCellsAlternating()), VBVariant.valueOf(table.$BackColorCells()))
                     )
                     .longValue()
               );
               $ForeColor(Interaction.IIF(isSelected, VBVariant.valueOf(table.$ForeColorSel()), VBVariant.valueOf(table.$ForeColor())).longValue());
               setBorder(
                  (Border)Interaction.IIF(hasFocus, VBVariant.valueOf(getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1))).toObject()
               );
               setFont(table.$Parent().getFont());
               getComponent = this;
            }

            if (!isSelected) {
               if ($CellBackColor() != (long)(-1 * 1)) {
                  getComponent.setBackground(Information.RGBtoColor($CellBackColor()));
               }

               if ($CellForeColor() != (long)(-1 * 1)) {
                  getComponent.setForeground(Information.RGBtoColor($CellForeColor()));
               }
            }
         }
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return getComponent;
      }

      return getComponent;
   }

   private void fireChanged() {
      Throwable Err = null;

      label87: {
         try {
            if (myGrid == null) {
               return;
            }
         } finally {
            break label87;
         }

         AbstractTableModel refModel = (AbstractTableModel)myGrid.$Parent().getModel();

         label73:
         try {
            refModel.fireTableCellUpdated(myRow, myCol);
            return;
         } finally {
            break label73;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Caption(String v) {
      Throwable Err = null;

      try {
         super.$Caption(v);
         fireChanged();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Text(String v) {
      Throwable Err = null;

      try {
         $Caption(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Text() {
      String $Text = "";
      Throwable Err = null;

      try {
         $Text = $Caption();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Text;
      }

      return $Text;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Editable(boolean v) {
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
   public boolean $Editable() {
      boolean $Editable = false;
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
   @Override
   public void $Picture(IResource v) {
      Throwable Err = null;

      try {
         super.$Picture(v);
         fireChanged();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Icon(IResource v) {
      Throwable Err = null;

      try {
         $Picture(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $Icon() {
      IResource $Icon = null;
      Throwable Err = null;

      try {
         $Icon = $Picture();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Icon;
      }

      return $Icon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Icon getIcon() {
      Icon getIcon = null;
      Throwable Err = null;

      try {
         getIcon = VB.Global.LoadIcon($Icon());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getIcon;
      }

      return getIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $CellBackColor(long v) {
      Throwable Err = null;

      try {
         myCellBackColor = v;
         fireChanged();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $CellBackColor() {
      long $CellBackColor = 0L;
      Throwable Err = null;

      try {
         $CellBackColor = myCellBackColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $CellBackColor;
      }

      return $CellBackColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $CellForeColor(long v) {
      Throwable Err = null;

      try {
         myCellForeColor = v;
         fireChanged();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $CellForeColor() {
      long $CellForeColor = 0L;
      Throwable Err = null;

      try {
         $CellForeColor = myCellForeColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $CellForeColor;
      }

      return $CellForeColor;
   }

   private void initVarsI() {
      myGrid = null;
      myComponentOwn = null;
      myEditable = false;
      myCellBackColor = (long)(-1 * 1);
      myCellForeColor = (long)(-1 * 1);
      myRow = 0;
      myCol = 0;
   }
}
