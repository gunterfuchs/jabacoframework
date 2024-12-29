/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.IListCellDataOwner;
import VB.Usercontrol;
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
    private IListCellDataOwner myOwner;
    private Usercontrol myComponentOwn;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean IsDefaultBorder() {
        boolean IsDefaultBorder = false;
        Throwable Err = null;
        try {
            ListCellData Me;
            IsDefaultBorder = true;
            if (!(Me.myOwner != null)) {
                return IsDefaultBorder;
            }
            if (Me.myOwner.$BorderColorSel() != (long)(-1 * 0x7FFFFFF6)) return false;
            boolean bl = false;
            if (bl) return false;
            return IsDefaultBorder;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return IsDefaultBorder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Border getBorderFocusSel() {
        Border getBorderFocusSel = null;
        Throwable Err = null;
        try {
            ListCellData Me;
            if (!Me.IsDefaultBorder()) return BorderFactory.createLineBorder(new Color((int)Information.ColorToRGB(new Color((int)Me.myOwner.$BorderColorSel()))));
            return UIManager.getBorder("List.focusCellHighlightBorder");
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getBorderFocusSel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Border getMarginBorder(Border refBorder) {
        Border getMarginBorder = null;
        Throwable Err = null;
        int margin = 1;
        try {
            ListCellData Me;
            if (Me.myOwner != null) {
                margin = (int)Me.myOwner.$MarginItem();
            }
            return new CompoundBorder(refBorder, new EmptyBorder(margin, margin, margin, margin));
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getMarginBorder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Component getComponent(IListCellDataOwner Owner, Component myComponent, boolean IsSelected, boolean CellHasFocus) {
        Throwable throwable2;
        Throwable Err;
        Component getComponent;
        block8: {
            block10: {
                boolean bl;
                ListCellData Me;
                boolean myCellHasFocus;
                JLabel tmpLabel;
                block14: {
                    block12: {
                        block13: {
                            JCheckBox tmpCheckBox;
                            block11: {
                                block9: {
                                    getComponent = null;
                                    Err = null;
                                    tmpCheckBox = null;
                                    tmpLabel = null;
                                    try {
                                        if (Owner == null) return getComponent;
                                        myCellHasFocus = CellHasFocus;
                                    }
                                    catch (Throwable throwable2) {
                                        break block8;
                                    }
                                    if (!myCellHasFocus && IsSelected && !Me.IsDefaultBorder()) {
                                        myCellHasFocus = true;
                                    }
                                    if (Me.myComponentOwn == null) break block9;
                                    Me.myComponentOwn.setBackground((Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionBackground()), VBVariant.valueOf(Owner.getBackground())).toObject());
                                    Me.myComponentOwn.setForeground((Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionForeground()), VBVariant.valueOf(Owner.getForeground())).toObject());
                                    Me.myComponentOwn.setBorder(Me.getMarginBorder((Border)Interaction.IIF(myCellHasFocus, VBVariant.valueOf(Me.getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1))).toObject()));
                                    Me.myComponentOwn.setFont(Owner.getFont());
                                    Me.myComponentOwn.$Parent().setPreferredSize(Me.myComponentOwn.$Parent().getPreferredSize());
                                    myComponent = Me.myComponentOwn;
                                    break block10;
                                }
                                if (Me.$AsCheckBox()) break block11;
                                tmpLabel = (JLabel)myComponent;
                                if (myComponent == null) break block12;
                                break block13;
                            }
                            tmpCheckBox = (JCheckBox)myComponent;
                            if (myComponent == null) {
                                tmpCheckBox = new JCheckBox(Me.$Text());
                                myComponent = tmpCheckBox;
                            }
                            tmpCheckBox.setText(Me.$Text());
                            tmpCheckBox.setOpaque(true);
                            tmpCheckBox.setBackground((Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionBackground()), VBVariant.valueOf(Owner.getBackground())).toObject());
                            tmpCheckBox.setForeground((Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionForeground()), VBVariant.valueOf(Owner.getForeground())).toObject());
                            tmpCheckBox.setBorder(Me.getMarginBorder((Border)Interaction.IIF(myCellHasFocus, VBVariant.valueOf(Me.getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1))).toObject()));
                            tmpCheckBox.setBorderPainted(true);
                            tmpCheckBox.setFont(Owner.getFont());
                            tmpCheckBox.setSelected(Me.$Checked());
                            break block10;
                        }
                        bl = false;
                        break block14;
                    }
                    bl = true;
                }
                if (bl) {
                    tmpLabel = new JLabel(Me.$Text(), Me.getIcon(), SwingConstants.LEFT);
                    myComponent = tmpLabel;
                }
                tmpLabel.setIcon(Me.getIcon());
                tmpLabel.setText(Me.$Text());
                tmpLabel.setOpaque(true);
                tmpLabel.setBackground((Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionBackground()), VBVariant.valueOf(Owner.getBackground())).toObject());
                tmpLabel.setForeground((Color)Interaction.IIF(IsSelected, VBVariant.valueOf(Owner.getSelectionForeground()), VBVariant.valueOf(Owner.getForeground())).toObject());
                tmpLabel.setBorder(Me.getMarginBorder((Border)Interaction.IIF(myCellHasFocus, VBVariant.valueOf(Me.getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1))).toObject()));
                tmpLabel.setFont(Owner.getFont());
            }
            getComponent = myComponent;
            return getComponent;
        }
        Object var7_10 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return getComponent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void FireChanged() {
        Throwable Err = null;
        try {
            ListCellData Me;
            Me.myOwner.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ListCellData(Usercontrol refControl) {
        ListCellData Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myComponentOwn = refControl;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ListCellData(String refText) {
        ListCellData Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myText = refText;
            Me.myIcon = null;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ListCellData(String refText, IResource refIcon) {
        ListCellData Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myText = refText;
            Me.myIcon = refIcon;
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ListCellData(String refText, IResource refIcon, boolean refAsCheckBox) {
        ListCellData Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myText = refText;
            Me.myIcon = refIcon;
            Me.myAsCheckBox = refAsCheckBox;
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Owner(IListCellDataOwner v) {
        Throwable Err = null;
        try {
            Me.myOwner = v;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IListCellDataOwner $Owner() {
        IListCellDataOwner $Owner = null;
        Throwable Err = null;
        try {
            ListCellData Me;
            return Me.myOwner;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Owner;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Text(String v) {
        Throwable Err = null;
        try {
            ListCellData Me;
            Me.myText = v;
            Me.FireChanged();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Text() {
        String $Text = "";
        Throwable Err = null;
        try {
            ListCellData Me;
            return Me.myText;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Text;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Data(String v) {
        Throwable Err = null;
        try {
            Me.myData = v;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Data() {
        String $Data = "";
        Throwable Err = null;
        try {
            ListCellData Me;
            return Me.myData;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Data;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Icon(IResource v) {
        Throwable Err = null;
        try {
            ListCellData Me;
            Me.myIcon = v;
            Me.FireChanged();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IResource $Icon() {
        IResource $Icon = null;
        Throwable Err = null;
        try {
            ListCellData Me;
            return Me.myIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Icon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Icon getIcon() {
        Icon getIcon = null;
        Throwable Err = null;
        try {
            ListCellData Me;
            return Global.LoadIcon(Me.$Icon());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AsCheckBox(boolean v) {
        Throwable Err = null;
        try {
            ListCellData Me;
            Me.myAsCheckBox = v;
            Me.FireChanged();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $AsCheckBox() {
        boolean $AsCheckBox = false;
        Throwable Err = null;
        try {
            ListCellData Me;
            return Me.myAsCheckBox;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AsCheckBox;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Checked(boolean v) {
        Throwable Err = null;
        try {
            ListCellData Me;
            Me.myChecked = v;
            Me.FireChanged();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Checked() {
        boolean $Checked = false;
        Throwable Err = null;
        try {
            ListCellData Me;
            return Me.myChecked;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Checked;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        String toString = "";
        Throwable Err = null;
        try {
            ListCellData Me;
            return Me.$Text();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return toString;
    }

    private void initVars() {
        Me.myText = "";
        Me.myData = "";
        Me.myIcon = null;
        Me.myAsCheckBox = false;
        Me.myComponent = null;
        Me.myChecked = false;
        Me.myOwner = null;
        Me.myComponentOwn = null;
    }
}
