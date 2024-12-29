/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.BackStyleConstants;
import VB.Global;
import VB.JBGrid;
import VB.Label;
import VB.Usercontrol;
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

public class JBCellData
extends Label {
    private JBGrid myGrid;
    private Usercontrol myComponentOwn;
    private boolean myEditable;
    private long myCellBackColor;
    private long myCellForeColor;
    private int myRow;
    private int myCol;

    public JBCellData() {
        JBCellData Me;
        Object Err = null;
        Me.initVarsI();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBCellData(String refText) {
        JBCellData Me;
        Throwable Err = null;
        Me.initVarsI();
        try {
            super.$Caption(refText);
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
    public JBCellData(String refText, IResource refIcon) {
        JBCellData Me;
        Throwable Err = null;
        Me.initVarsI();
        try {
            super.$Caption(refText);
            super.$Picture(refIcon);
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
    public JBCellData(String refText, IResource refIcon, long refCellBackColor) {
        JBCellData Me;
        Throwable Err = null;
        Me.initVarsI();
        try {
            super.$Caption(refText);
            super.$Picture(refIcon);
            Me.myCellBackColor = refCellBackColor;
            return;
        }
        catch (Throwable throwable) {
            Object var6_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBCellData(String refText, IResource refIcon, long refCellBackColor, long refCellForeColor) {
        JBCellData Me;
        Throwable Err = null;
        Me.initVarsI();
        try {
            super.$Caption(refText);
            super.$Picture(refIcon);
            Me.myCellBackColor = refCellBackColor;
            Me.myCellForeColor = refCellForeColor;
            return;
        }
        catch (Throwable throwable) {
            Object var8_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBCellData(Usercontrol refControl) {
        JBCellData Me;
        Throwable Err = null;
        Me.initVarsI();
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
    public VBVariant setOwner(JBGrid v, int row, int col) {
        VBVariant setOwner = new VBVariant();
        Throwable Err = null;
        try {
            Me.myGrid = v;
            Me.myRow = row;
            Me.myCol = col;
            return setOwner;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return setOwner;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Component getEditorComponent(JBGrid table, boolean isSelected, boolean hasFocus) {
        Component getEditorComponent = null;
        Throwable Err = null;
        try {
            JBCellData Me;
            return Me.myComponentOwn;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getEditorComponent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Border getBorderFocusSel() {
        Border getBorderFocusSel = null;
        Throwable Err = null;
        boolean bUseDefault = true;
        try {
            JBCellData Me;
            if (Me.myGrid != null && Me.myGrid.$BorderColorSel() != (long)(-1 * 0x7FFFFFF6)) {
                bUseDefault = false;
            }
            if (!bUseDefault) return BorderFactory.createLineBorder(new Color((int)Information.ColorToRGB(new Color((int)Me.myGrid.$BorderColorSel()))));
            return UIManager.getBorder("List.focusCellHighlightBorder");
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
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
    public Component getComponent(JBGrid table, boolean isSelected, boolean hasFocus, int row) {
        Component getComponent = null;
        Throwable Err = null;
        try {
            JBCellData Me;
            block8: {
                boolean bl;
                VBVariant vBVariant;
                Usercontrol usercontrol;
                block9: {
                    block6: {
                        block7: {
                            block5: {
                                if (table == null) return getComponent;
                                if (Me.myComponentOwn == null) break block5;
                                usercontrol = Me.myComponentOwn;
                                vBVariant = VBVariant.valueOf(table.$BackColorSel());
                                if (row % 2 == 1) break block6;
                                break block7;
                            }
                            Me.$BackStyle(BackStyleConstants.vbSolid);
                            Me.$Parent().setVerticalTextPosition(SwingConstants.CENTER);
                            Me.$BackColor(Interaction.IIF(isSelected, VBVariant.valueOf(table.$BackColorSel()), Interaction.IIF(row % 2 == 1, VBVariant.valueOf(table.$BackColorCellsAlternating()), VBVariant.valueOf(table.$BackColorCells()))).longValue());
                            Me.$ForeColor(Interaction.IIF(isSelected, VBVariant.valueOf(table.$ForeColorSel()), VBVariant.valueOf(table.$ForeColor())).longValue());
                            Me.setBorder((Border)Interaction.IIF(hasFocus, VBVariant.valueOf(Me.getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1))).toObject());
                            Me.setFont(table.$Parent().getFont());
                            getComponent = Me;
                            break block8;
                        }
                        bl = false;
                        break block9;
                    }
                    bl = true;
                }
                usercontrol.setBackground(Information.RGBtoColor(Interaction.IIF(isSelected, vBVariant, Interaction.IIF(bl, VBVariant.valueOf(table.$BackColorCellsAlternating()), VBVariant.valueOf(table.$BackColorCells()))).longValue()));
                Me.myComponentOwn.setForeground((Color)Interaction.IIF(isSelected, VBVariant.valueOf(table.$Parent().getSelectionForeground()), VBVariant.valueOf(table.$Parent().getForeground())).toObject());
                Me.myComponentOwn.setBorder((Border)Interaction.IIF(hasFocus, VBVariant.valueOf(Me.getBorderFocusSel()), VBVariant.valueOf(new EmptyBorder(1, 1, 1, 1))).toObject());
                Me.myComponentOwn.setFont(table.$Parent().getFont());
                Me.myComponentOwn.setPreferredSize(Me.myComponentOwn.getPreferredSize());
                getComponent = Me.myComponentOwn;
            }
            if (!(!isSelected)) {
                return getComponent;
            }
            if (Me.$CellBackColor() != (long)(-1 * 1)) {
                getComponent.setBackground(Information.RGBtoColor(Me.$CellBackColor()));
            }
            if (!(Me.$CellForeColor() != (long)(-1 * 1))) {
                return getComponent;
            }
            getComponent.setForeground(Information.RGBtoColor(Me.$CellForeColor()));
            return getComponent;
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getComponent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void fireChanged() {
        Throwable throwable2;
        Throwable Err;
        block5: {
            JBCellData Me;
            Err = null;
            try {
                if (Me.myGrid == null) return;
            }
            catch (Throwable throwable2) {
                break block5;
            }
            AbstractTableModel refModel = (AbstractTableModel)Me.myGrid.$Parent().getModel();
            refModel.fireTableCellUpdated(Me.myRow, Me.myCol);
        }
        Object var2_3 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Caption(String v) {
        Throwable Err = null;
        try {
            JBCellData Me;
            super.$Caption(v);
            Me.fireChanged();
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
    public void $Text(String v) {
        Throwable Err = null;
        try {
            JBCellData Me;
            Me.$Caption(v);
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
            JBCellData Me;
            return Me.$Caption();
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
    public void $Editable(boolean v) {
        Throwable Err = null;
        try {
            Me.myEditable = v;
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
    public boolean $Editable() {
        boolean $Editable = false;
        Throwable Err = null;
        try {
            JBCellData Me;
            return Me.myEditable;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Editable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Picture(IResource v) {
        Throwable Err = null;
        try {
            JBCellData Me;
            super.$Picture(v);
            Me.fireChanged();
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
    public void $Icon(IResource v) {
        Throwable Err = null;
        try {
            JBCellData Me;
            Me.$Picture(v);
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
            JBCellData Me;
            return Me.$Picture();
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
    @Override
    public Icon getIcon() {
        Icon getIcon = null;
        Throwable Err = null;
        try {
            JBCellData Me;
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
    public void $CellBackColor(long v) {
        Throwable Err = null;
        try {
            JBCellData Me;
            Me.myCellBackColor = v;
            Me.fireChanged();
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $CellBackColor() {
        long $CellBackColor = 0L;
        Throwable Err = null;
        try {
            JBCellData Me;
            return Me.myCellBackColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CellBackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CellForeColor(long v) {
        Throwable Err = null;
        try {
            JBCellData Me;
            Me.myCellForeColor = v;
            Me.fireChanged();
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $CellForeColor() {
        long $CellForeColor = 0L;
        Throwable Err = null;
        try {
            JBCellData Me;
            return Me.myCellForeColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CellForeColor;
    }

    private void initVarsI() {
        Me.myGrid = null;
        Me.myComponentOwn = null;
        Me.myEditable = false;
        Me.myCellBackColor = -1 * 1;
        Me.myCellForeColor = -1 * 1;
        Me.myRow = 0;
        Me.myCol = 0;
    }
}
