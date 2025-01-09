package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class ListCellData {
   private String myText;
   private String myData;
   private IResource myIcon;
   private boolean myAsCheckBox;
   private Component myComponent;
   private boolean myChecked;
   private VB.IListCellDataOwner myOwner;
   private VB.Usercontrol myComponentOwn;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean IsDefaultBorder() {
      boolean IsDefaultBorder = false;
      Throwable Err = null;

      try {
         IsDefaultBorder = true;
         if (myOwner != null && myOwner.$BorderColorSel() != (long)(-1 * 2147483638)) {
            IsDefaultBorder = false;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return IsDefaultBorder;
      }

      return IsDefaultBorder;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private Border getBorderFocusSel() {
      Border getBorderFocusSel = null;
      Throwable Err = null;

      try {
         if (!IsDefaultBorder()) {
            getBorderFocusSel = BorderFactory.createLineBorder(new Color((int)Information.ColorToRGB(new Color((int)myOwner.$BorderColorSel()))));
         } else {
            getBorderFocusSel = UIManager.getBorder("List.focusCellHighlightBorder");
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getBorderFocusSel;
      }

      return getBorderFocusSel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private Border getMarginBorder(Border refBorder) {
      Border getMarginBorder = null;
      Throwable Err = null;
      int margin = 1;

      try {
         if (myOwner != null) {
            margin = (int)myOwner.$MarginItem();
         }

         getMarginBorder = new CompoundBorder(refBorder, new EmptyBorder(margin, margin, margin, margin));
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return getMarginBorder;
      }

      return getMarginBorder;
   }

   public Component getComponent(VB.IListCellDataOwner Owner, Component myComponent, boolean IsSelected, boolean CellHasFocus) {
      Component getComponent = null;
      Throwable Err = null;
      JCheckBox tmpCheckBox = null;
      JLabel tmpLabel = null;

      label205: {
         try {
            if (Owner == null) {
               return getComponent;
            }
         } finally {
            break label205;
         }

         boolean myCellHasFocus = CellHasFocus;

         label191:
         try {
            if (!myCellHasFocus && IsSelected && !IsDefaultBorder()) {
               myCellHasFocus = true;
            }

            if (myComponentOwn != null) {
               myComponentOwn
                  .setBackground(
                     (Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionBackground()), VBVariant.valueOf(Owner.getBackground())).toObject()
                  );
               myComponentOwn
                  .setForeground(
                     (Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionForeground()), VBVariant.valueOf(Owner.getForeground())).toObject()
                  );
               myComponentOwn
                  .setBorder(
                     getMarginBorder(
                        (Border)Interaction.IIF(myCellHasFocus, VBVariant.valueOf(getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1)))
                           .toObject()
                     )
                  );
               myComponentOwn.setFont(Owner.getFont());
               myComponentOwn.$Parent().setPreferredSize(myComponentOwn.$Parent().getPreferredSize());
               myComponent = myComponentOwn;
            } else if (!$AsCheckBox()) {
               tmpLabel = (JLabel)myComponent;
               if (myComponent == null) {
                  tmpLabel = new JLabel($Text(), getIcon(), SwingConstants.LEFT);
                  myComponent = tmpLabel;
               }

               tmpLabel.setIcon(getIcon());
               tmpLabel.setText($Text());
               tmpLabel.setOpaque(true);
               tmpLabel.setBackground(
                  (Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionBackground()), VBVariant.valueOf(Owner.getBackground())).toObject()
               );
               tmpLabel.setForeground(
                  (Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionForeground()), VBVariant.valueOf(Owner.getForeground())).toObject()
               );
               tmpLabel.setBorder(
                  getMarginBorder(
                     (Border)Interaction.IIF(myCellHasFocus, VBVariant.valueOf(getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1)))
                        .toObject()
                  )
               );
               tmpLabel.setFont(Owner.getFont());
            } else {
               tmpCheckBox = (JCheckBox)myComponent;
               if (myComponent == null) {
                  tmpCheckBox = new JCheckBox($Text());
                  myComponent = tmpCheckBox;
               }

               tmpCheckBox.setText($Text());
               tmpCheckBox.setOpaque(true);
               tmpCheckBox.setBackground(
                  (Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionBackground()), VBVariant.valueOf(Owner.getBackground())).toObject()
               );
               tmpCheckBox.setForeground(
                  (Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionForeground()), VBVariant.valueOf(Owner.getForeground())).toObject()
               );
               tmpCheckBox.setBorder(
                  getMarginBorder(
                     (Border)Interaction.IIF(myCellHasFocus, VBVariant.valueOf(getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1)))
                        .toObject()
                  )
               );
               tmpCheckBox.setBorderPainted(true);
               tmpCheckBox.setFont(Owner.getFont());
               tmpCheckBox.setSelected($Checked());
            }

            getComponent = myComponent;
            return myComponent;
         } finally {
            break label191;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return getComponent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void FireChanged() {
      Throwable Err = null;

      try {
         myOwner.Refresh();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ListCellData(VB.Usercontrol refControl) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myComponentOwn = refControl;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ListCellData(String refText) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myText = refText;
         myIcon = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ListCellData(String refText, IResource refIcon) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myText = refText;
         myIcon = refIcon;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ListCellData(String refText, IResource refIcon, boolean refAsCheckBox) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myText = refText;
         myIcon = refIcon;
         myAsCheckBox = refAsCheckBox;
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Owner(VB.IListCellDataOwner v) {
      Throwable Err = null;

      try {
         myOwner = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.IListCellDataOwner $Owner() {
      VB.IListCellDataOwner $Owner = null;
      Throwable Err = null;

      try {
         $Owner = myOwner;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Owner;
      }

      return $Owner;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Text(String v) {
      Throwable Err = null;

      try {
         myText = v;
         FireChanged();
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
         $Text = myText;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Text;
      }

      return $Text;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Data(String v) {
      Throwable Err = null;

      try {
         myData = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Data() {
      String $Data = "";
      Throwable Err = null;

      try {
         $Data = myData;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Data;
      }

      return $Data;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Icon(IResource v) {
      Throwable Err = null;

      try {
         myIcon = v;
         FireChanged();
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
         $Icon = myIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Icon;
      }

      return $Icon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
   public void $AsCheckBox(boolean v) {
      Throwable Err = null;

      try {
         myAsCheckBox = v;
         FireChanged();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $AsCheckBox() {
      boolean $AsCheckBox = false;
      Throwable Err = null;

      try {
         $AsCheckBox = myAsCheckBox;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $AsCheckBox;
      }

      return $AsCheckBox;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Checked(boolean v) {
      Throwable Err = null;

      try {
         myChecked = v;
         FireChanged();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Checked() {
      boolean $Checked = false;
      Throwable Err = null;

      try {
         $Checked = myChecked;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Checked;
      }

      return $Checked;
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

   private void initVars() {
      myText = "";
      myData = "";
      myIcon = null;
      myAsCheckBox = false;
      myComponent = null;
      myChecked = false;
      myOwner = null;
      myComponentOwn = null;
   }
}
