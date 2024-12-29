/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.JBCellData;
import VB.JBEditable;
import VB.JBGrid;
import VB.fmTextAlign;
import VBA.IResource;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBArrayObject;
import VBA.VBArrayString;
import VBA.VBVariant;
import java.awt.Point;
import java.util.HashMap;
import javax.swing.table.AbstractTableModel;

public class JBGridModel
extends AbstractTableModel {
    private HashMap myMatrix;
    private int myMaxRow;
    private int myMaxCol;
    private Point myTmpIndex;
    private VBArrayObject myColumnAlign;
    private VBArrayObject myColumnIcon;
    private VBArrayString myColumnName;
    private JBGrid myGrid;
    private boolean myStopEdit;
    private boolean insideCellEditable;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBGridModel(JBGrid refGrid) {
        JBGridModel Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myGrid = refGrid;
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
    public AbstractTableModel $Parent() {
        JBGridModel $Parent = null;
        Throwable Err = null;
        try {
            JBGridModel Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private long max(long v1, long v2) {
        long max = 0L;
        Throwable Err = null;
        try {
            if (!(v1 > v2)) return v2;
            return v1;
        }
        catch (Throwable throwable) {
            Object var8_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return max;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void fireTableCellUpdated(int row, int col) {
        Throwable Err = null;
        try {
            JBGridModel Me;
            if (Me.myGrid.isEditing(row, col)) {
                Me.myGrid.$CellEditor().$Value(Me.getValueAt(row, col).toString());
            }
            super.fireTableCellUpdated(row, col);
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
    @Override
    public int getColumnCount() {
        int getColumnCount = 0;
        Throwable Err = null;
        try {
            JBGridModel Me;
            return Me.myMaxCol;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getColumnCount;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBVariant setColumnCount(int v) {
        Object var4_4;
        VBVariant setColumnCount = new VBVariant();
        Throwable Err = null;
        try {
            Me.myMaxCol = v;
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            JBGridModel Me;
            Me.$Parent().fireTableStructureChanged();
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return setColumnCount;
        }
        return setColumnCount;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int getRowCount() {
        int getRowCount = 0;
        Throwable Err = null;
        try {
            JBGridModel Me;
            return Me.myMaxRow;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getRowCount;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBVariant setRowCount(int v) {
        Object var4_4;
        VBVariant setRowCount = new VBVariant();
        Throwable Err = null;
        try {
            Me.myMaxRow = v;
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            JBGridModel Me;
            Me.$Parent().fireTableStructureChanged();
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return setRowCount;
        }
        return setRowCount;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void refreshRowColCount(int row, int col) {
        Throwable Err = null;
        try {
            JBGridModel Me;
            Me.myMaxRow = (int)Me.max(row, Me.myMaxRow);
            Me.myMaxCol = (int)Me.max(col, Me.myMaxCol);
            if (Me.myColumnAlign.getUBound(1) == Me.myMaxCol) return;
            Me.myColumnAlign.setBound(0, Me.myMaxCol, true);
            Me.myColumnName.setBound(0, Me.myMaxCol, true);
            Me.myColumnIcon.setBound(0, Me.myMaxCol, true);
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
    public void setColumnAlign(int col, fmTextAlign val) {
        Object var4_4;
        JBGridModel Me;
        Throwable Err = null;
        try {
            Me.refreshRowColCount(Me.myMaxRow, col);
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Me.myColumnAlign.setValueObj(col, val);
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().fireTableStructureChanged();
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public fmTextAlign getColumnAlign(int col) {
        Object var4_5;
        Throwable Err;
        fmTextAlign getColumnAlign;
        block22: {
            block21: {
                block20: {
                    block19: {
                        getColumnAlign = new fmTextAlign();
                        Err = null;
                        fmTextAlign h6 = new fmTextAlign();
                        h6 = null;
                        try {
                            JBGridModel Me;
                            h6 = (fmTextAlign)Me.myColumnAlign.valueOfObj(col);
                        }
                        catch (Throwable throwable) {
                            var4_5 = null;
                            Err = throwable;
                        }
                        if (h6.compareTo(new fmTextAlign(0)) == 0) break block19;
                        if (h6.compareTo(new fmTextAlign(1)) == 0) break block19;
                        if (h6.compareTo(new fmTextAlign(2)) == 0) break block20;
                        if (h6.compareTo(new fmTextAlign(3)) == 0) break block21;
                        break block22;
                    }
                    try {
                    }
                    catch (Throwable throwable) {
                        var4_5 = null;
                        Err = throwable;
                    }
                    try {
                        getColumnAlign = new fmTextAlign(10);
                        break block22;
                    }
                    catch (Throwable throwable) {
                        var4_5 = null;
                        Err = throwable;
                    }
                }
                try {
                }
                catch (Throwable throwable) {
                    var4_5 = null;
                    Err = throwable;
                }
                try {
                    getColumnAlign = new fmTextAlign(0);
                    break block22;
                }
                catch (Throwable throwable) {
                    var4_5 = null;
                    Err = throwable;
                }
            }
            try {
            }
            catch (Throwable throwable) {
                var4_5 = null;
                Err = throwable;
            }
            try {
                getColumnAlign = new fmTextAlign(11);
            }
            catch (Throwable throwable) {
                var4_5 = null;
                Err = throwable;
            }
        }
        try {
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
            return getColumnAlign;
        }
        return getColumnAlign;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setColumnIcon(int col, IResource val) {
        Object var4_4;
        JBGridModel Me;
        Throwable Err = null;
        try {
            Me.refreshRowColCount(Me.myMaxRow, col);
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Me.myColumnIcon.setValueObj(col, val);
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().fireTableStructureChanged();
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public IResource getColumnIcon(int col) {
        IResource getColumnIcon = null;
        Throwable Err = null;
        try {
            JBGridModel Me;
            return (IResource)Me.myColumnIcon.valueOfObj(col);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
            return getColumnIcon;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setColumnName(int col, String val) {
        Object var4_4;
        JBGridModel Me;
        Throwable Err = null;
        try {
            Me.refreshRowColCount(Me.myMaxRow, col);
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Me.myColumnName.setValueStr(col, val);
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().fireTableStructureChanged();
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String getColumnName(int col) {
        String getColumnName = "";
        Throwable Err = null;
        try {
            JBGridModel Me;
            return Me.myColumnName.valueOfStr(col);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
            return getColumnName;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean registerStopEditEvent() {
        boolean registerStopEditEvent = false;
        Throwable Err = null;
        try {
            JBGridModel Me;
            Me.myStopEdit = true;
            return Me.insideCellEditable;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return registerStopEditEvent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        boolean isCellEditable = false;
        Throwable Err = null;
        try {
            block5: {
                boolean bl;
                block8: {
                    block6: {
                        block7: {
                            block3: {
                                JBGridModel Me;
                                block4: {
                                    block2: {
                                        if (Me.myGrid.$Editable().compareTo(JBEditable.jbNotEditable) == 0) return isCellEditable;
                                        Me.insideCellEditable = true;
                                        if (Me.myGrid == null) break block2;
                                        Me.myStopEdit = false;
                                        Me.myGrid.fireBeforeEdit(row, col);
                                        if (Me.myStopEdit) break block3;
                                        break block4;
                                    }
                                    isCellEditable = super.isCellEditable(row, col);
                                    break block5;
                                }
                                if (Me.myGrid.$Editable().compareTo(JBEditable.jbNotEditable) != 0) break block6;
                                break block7;
                            }
                            isCellEditable = false;
                            break block5;
                        }
                        bl = false;
                        break block8;
                    }
                    bl = true;
                }
                isCellEditable = bl;
            }
            Me.insideCellEditable = false;
            return isCellEditable;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return isCellEditable;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void setValueAt(Object val, int row, int col) {
        block9: {
            block8: {
                Err = null;
                myData = null;
                if (val == null) {
                    Me.myMatrix.remove(new Point(col, row));
                    break block8;
                }
                if (!(val instanceof JBCellData != false)) ** GOTO lbl15
                myData = (JBCellData)val;
                myData.$Text(myData.$Text());
                myData.setOwner(Me.myGrid, row, col);
lbl15:
                // 2 sources

                Me.refreshRowColCount(row, col);
                Me.myMatrix.put((Object)new Point(row, col), val);
                Me.$Parent().fireTableCellUpdated(row, col);
            }
lbl20:
            // 2 sources

            return;
lbl22:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {}
            break block9;
            finally {
            }
        }
        var5_6 = null;
        Err = v0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object getValueAt(int row, int col) {
        Object getValueAt = null;
        Throwable Err = null;
        Object tmpRet = null;
        try {
            JBGridModel Me;
            Me.myTmpIndex.x = row;
            Me.myTmpIndex.y = col;
            tmpRet = Me.myMatrix.get(Me.myTmpIndex);
            if (!(tmpRet == null)) return tmpRet;
            return "";
        }
        catch (Throwable throwable) {
            Object var5_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getValueAt;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clear() {
        Throwable Err = null;
        try {
            JBGridModel Me;
            Me.myMatrix = new HashMap();
            Me.myMaxCol = 0;
            Me.myMaxRow = 0;
            Me.$Parent().fireTableDataChanged();
            Me.myColumnAlign.setBound(0, -1 * 1, false);
            Me.myColumnName.setBound(0, -1 * 1, false);
            Me.myColumnIcon.setBound(0, -1 * 1, false);
            super.fireTableStructureChanged();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.myMatrix = new HashMap();
        Me.myMaxRow = 0;
        Me.myMaxCol = 0;
        Me.myTmpIndex = new Point(0, 0);
        Me.myColumnAlign = VBArray.createVBArray(new fmTextAlign().getClass());
        Me.myColumnIcon = new VBArray();
        Me.myColumnName = new VBArray();
        Me.myGrid = null;
        Me.myStopEdit = false;
        Me.insideCellEditable = false;
    }
}
