/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.CELLEDITTYPE;
import VB.ComboBox;
import VB.CommandButton;
import VB.Global;
import VB.JBCellData;
import VB.JBCellEditor$CheckBox;
import VB.JBCellEditor$ComboBox;
import VB.JBCellEditor$CommandButton;
import VB.JBCellEditor$Spinner;
import VB.JBCellEditor$TextBox;
import VB.JBCellEditorComponent;
import VB.JBEditable;
import VB.JBGrid;
import VB.Label;
import VB.Spinner;
import VB.TextBox;
import VB.vbScrollBarPolicy;
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

public class JBCellEditor
extends AbstractCellEditor
implements TableCellEditor {
    private JBCellEditor$TextBox myText;
    private JBCellEditor$ComboBox myCombo;
    private JBCellEditor$CommandButton myButton;
    private JBCellEditor$CheckBox myCheck;
    private JBCellEditor$Spinner mySpinner;
    private Label myLabel;
    private JPanel ButtonFrame;
    private CELLEDITTYPE myEditMode;
    private JBCellEditorComponent myCellEditorComponent;
    private JBGrid myGrid;
    private Object lastObject;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBCellEditor(JBGrid refGrid) {
        JBCellEditor Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myGrid = refGrid;
            Me.myText.$VScrollBar(vbScrollBarPolicy.sbShowNever);
            Me.myText.$HScrollBar(vbScrollBarPolicy.sbShowNever);
            Me.myCheck.$Parent().setHorizontalAlignment(0);
            Me.myText.setBorder(new EmptyBorder(new Insets(0, 0, 0, 0)));
            Me.myCombo.setBorder(new EmptyBorder(new Insets(0, 0, 0, 0)));
            Me.myCombo.$Parent().setFocusable(false);
            Me.myLabel.$Parent().setLabelFor(Me.myButton);
            Me.myLabel.$Visible(true);
            Me.myButton.$Visible(true);
            Me.myButton.$CanGetFocus(false);
            Me.myButton.$Parent().setPreferredSize(new Dimension(23, 23));
            Me.ButtonFrame.add((Component)Me.myButton, BorderLayout.LINE_END);
            Me.ButtonFrame.add((Component)Me.myLabel, BorderLayout.LINE_START);
            Me.ButtonFrame.setVisible(true);
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
    public void myText_KeyDown(int KeyCode, int Shift) {
        Throwable Err = null;
        try {
            JBCellEditor Me;
            if (KeyCode != 13) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            super.stopCellEditing();
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
    public void mySpinner_KeyDown(int KeyCode, int Shift) {
        Throwable Err = null;
        try {
            JBCellEditor Me;
            if (KeyCode != 13) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            super.stopCellEditing();
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
    public void myButton_Click() {
        Throwable Err = null;
        try {
            JBCellEditor Me;
            Me.myGrid.fireCellButtonClick();
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
    public void myCombo_Click() {
        Throwable Err = null;
        try {
            JBCellEditor Me;
            super.stopCellEditing();
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
    public void myCheck_Click() {
        Throwable Err = null;
        try {
            JBCellEditor Me;
            super.stopCellEditing();
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
    public JBCellEditorComponent $Component() {
        JBCellEditorComponent $Component = new JBCellEditorComponent();
        Throwable Err = null;
        try {
            JBCellEditor Me;
            return Me.myCellEditorComponent;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Component;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Component(JBCellEditorComponent v) {
        Throwable Err = null;
        try {
            Me.myCellEditorComponent = v;
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
    public TextBox $JBTextBox() {
        TextBox $JBTextBox = null;
        Throwable Err = null;
        try {
            JBCellEditor Me;
            return Me.myText;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $JBTextBox;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CommandButton $JBCommandButton() {
        CommandButton $JBCommandButton = null;
        Throwable Err = null;
        try {
            JBCellEditor Me;
            return Me.myButton;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $JBCommandButton;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ComboBox $JBComboBox() {
        ComboBox $JBComboBox = null;
        Throwable Err = null;
        try {
            JBCellEditor Me;
            return Me.myCombo;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $JBComboBox;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Spinner $JBSpinner() {
        Spinner $JBSpinner = null;
        Throwable Err = null;
        try {
            JBCellEditor Me;
            return Me.mySpinner;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $JBSpinner;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Value() {
        String $Value = "";
        Throwable Err = null;
        CELLEDITTYPE h5 = new CELLEDITTYPE();
        h5 = null;
        try {
            JBCellEditor Me;
            h5 = Me.myEditMode;
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_TEXT) == 0) {
                return Me.myText.$Text();
            }
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_COMBO) == 0) {
                return Me.myCombo.$Text();
            }
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_BUTTON) == 0) {
                return Me.myLabel.$Caption();
            }
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_CHECK) == 0) {
                return String.valueOf(Me.myCheck.$Value());
            }
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_SPINNER) == 0) return Me.mySpinner.$EditorText();
            return $Value;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Value;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Value(String v) {
        Throwable Err = null;
        CELLEDITTYPE h5 = new CELLEDITTYPE();
        h5 = null;
        try {
            JBCellEditor Me;
            h5 = Me.myEditMode;
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_TEXT) == 0) {
                Me.myText.$Text(v);
                return;
            }
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_COMBO) == 0) {
                Me.myCombo.$Text(v);
                return;
            }
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_BUTTON) == 0) {
                Me.myLabel.$Caption(v);
                return;
            }
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_CHECK) == 0) {
                Me.myCheck.$Value(Global.GetStringAsBoolean(v));
                return;
            }
            if (h5.compareTo(CELLEDITTYPE.CELLEDIT_SPINNER) != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.mySpinner.$Value(v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
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
    public boolean isCellEditable(EventObject e) {
        Throwable throwable2;
        Throwable Err;
        boolean isCellEditable;
        block6: {
            boolean bl;
            block10: {
                block8: {
                    block9: {
                        JBCellEditor Me;
                        block7: {
                            isCellEditable = false;
                            Err = null;
                            MouseEvent tmpMouseEvent = null;
                            try {
                                if (Me.myGrid.$Editable().compareTo(JBEditable.jbNotEditable) == 0) return isCellEditable;
                                if (!(e instanceof MouseEvent)) {
                                    return isCellEditable;
                                }
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            tmpMouseEvent = (MouseEvent)e;
                            if (tmpMouseEvent.getClickCount() % 2 == 0) break block7;
                            if (Me.myGrid.$Editable().compareTo(JBEditable.jbEditOnClick) == 0) break block8;
                            break block9;
                        }
                        isCellEditable = Me.myGrid.$Editable().compareTo(JBEditable.jbEditOnDblClick) == 0;
                        return isCellEditable;
                    }
                    bl = false;
                    break block10;
                }
                bl = true;
            }
            isCellEditable = bl;
        }
        Object var4_5 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return isCellEditable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object getCellEditorValue() {
        Object getCellEditorValue = null;
        Throwable Err = null;
        CELLEDITTYPE h5 = new CELLEDITTYPE();
        h5 = null;
        try {
            JBCellEditor Me;
            block10: {
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                h5 = Me.myEditMode;
                                if (h5.compareTo(CELLEDITTYPE.CELLEDIT_TEXT) == 0) break block6;
                                if (h5.compareTo(CELLEDITTYPE.CELLEDIT_COMBO) == 0) break block7;
                                if (h5.compareTo(CELLEDITTYPE.CELLEDIT_CHECK) == 0) break block8;
                                if (h5.compareTo(CELLEDITTYPE.CELLEDIT_SPINNER) == 0) break block9;
                                break block10;
                            }
                            if (Me.$lastData() != null) {
                                Me.$lastData().$Text(Me.myText.$Text());
                            }
                            break block10;
                        }
                        if (Me.$lastData() != null) {
                            Me.$lastData().$Text(Me.myCombo.$Text());
                        }
                        break block10;
                    }
                    if (Me.$lastData() != null) {
                        Me.$lastData().$Text(String.valueOf(Me.myCheck.$Value()));
                    }
                    break block10;
                }
                if (Me.$lastData() != null) {
                    Me.$lastData().$Text(Me.mySpinner.$EditorText());
                }
            }
            Me.myGrid.fireAfterEdit((int)Me.myGrid.$Row(), (int)Me.myGrid.$Col());
            return Me.lastObject;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getCellEditorValue;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JBCellData $lastData() {
        JBCellData $lastData = null;
        Throwable Err = null;
        try {
            JBCellEditor Me;
            return (JBCellData)Me.lastObject;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return $lastData;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long getRowBackColor(int row) {
        long getRowBackColor = 0L;
        Throwable Err = null;
        try {
            JBCellEditor Me;
            return Interaction.IIF(row % 2 == 1, VBVariant.valueOf(Me.myGrid.$BackColorCellsAlternating()), VBVariant.valueOf(Me.myGrid.$BackColorCells())).longValue();
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getRowBackColor;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int col) {
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                block11: {
                                    getTableCellEditorComponent = null;
                                    Err = null;
                                    myBackColor = 0L;
                                    h13 = new JBCellEditorComponent();
                                    ret = null;
                                    Me.lastObject = value;
                                    if (!(Me.$lastData() != null)) ** GOTO lbl81
                                    ret = Me.$lastData().getEditorComponent(Me.myGrid, isSelected, true);
                                    Me.myEditMode = CELLEDITTYPE.CELLEDIT_CUSTOM;
                                    if (!(ret == null)) ** GOTO lbl83
                                    myBackColor = Me.getRowBackColor(row);
                                    h13 = null;
                                    h13 = Me.myCellEditorComponent;
                                    if (h13.compareTo(new JBCellEditorComponent(0)) == 0) break block11;
                                    if (h13.compareTo(new JBCellEditorComponent(1)) == 0) break block12;
                                    if (h13.compareTo(new JBCellEditorComponent(2)) == 0) break block13;
                                    if (h13.compareTo(new JBCellEditorComponent(3)) == 0) break block14;
                                    if (h13.compareTo(new JBCellEditorComponent(4)) == 0) break block15;
                                    break block16;
                                }
                                Me.myText.$Text(Me.$lastData().$Text());
                                Me.myText.$Parent().setFont(Me.myGrid.$Parent().getFont());
                                Me.myText.SetFocus();
                                ret = Me.myText;
                                Me.myEditMode = CELLEDITTYPE.CELLEDIT_TEXT;
                                break block16;
                            }
                            if (Me.myGrid.$DataMatrix(row, col).$CellBackColor() != (long)(-1 * 1)) {
                                Me.ButtonFrame.setBackground(Information.RGBtoColor(Me.myGrid.$DataMatrix(row, col).$CellBackColor()));
                                Me.ButtonFrame.getComponent(0).setBackground(Information.RGBtoColor(Me.myGrid.$DataMatrix(row, col).$CellBackColor()));
                            } else {
                                Me.ButtonFrame.setBackground(Information.RGBtoColor(myBackColor));
                                Me.ButtonFrame.getComponent(0).setBackground(Information.RGBtoColor(myBackColor));
                            }
                            Me.myLabel.$ForeColor(Me.$lastData().$ForeColor());
                            Me.myLabel.$Caption(Me.$lastData().$Text());
                            Me.myLabel.$Parent().setFont(Me.myGrid.$Parent().getFont());
                            ret = Me.ButtonFrame;
                            Me.myEditMode = CELLEDITTYPE.CELLEDIT_BUTTON;
                            break block16;
                        }
                        if (Me.myCombo.$ListIndex() > -1 * 1) {
                            Me.myCombo.$ForeColorSel(Me.myGrid.$ForeColorSel());
                            Me.myCombo.$BackColorSel(Me.myGrid.$BackColorSel());
                            Me.myCombo.$BorderColorSel(Me.myGrid.$BackColorSel());
                            Me.myCombo.$Text(Me.$lastData().$Text());
                            Me.myCombo.$Parent().setFont(Me.myGrid.$Parent().getFont());
                            Me.myCombo.SetFocus();
                            ret = Me.myCombo;
                            Me.myEditMode = CELLEDITTYPE.CELLEDIT_COMBO;
                        }
                        break block16;
                    }
                    if (Global.IsStringBoolean(Me.$lastData().$Text()) == true) {
                        Me.myCheck.$BackColor(Interaction.IIF(Me.myGrid.$DataMatrix(row, col).$CellBackColor() == (long)(-1 * 1), VBVariant.valueOf(Me.myGrid.$BackColorSel()), VBVariant.valueOf(Me.myGrid.$DataMatrix(row, col).$CellBackColor())).longValue());
                        Me.myCheck.$Value(Global.GetStringAsBoolean(Me.$lastData().$Text()));
                        ret = Me.myCheck;
                        Me.myEditMode = CELLEDITTYPE.CELLEDIT_CHECK;
                    }
                    break block16;
                }
                Me.mySpinner.$EditorText(Me.$lastData().$Text());
                Me.mySpinner.$Parent().setFont(Me.myGrid.$Parent().getFont());
                ret = Me.mySpinner;
                Me.myEditMode = CELLEDITTYPE.CELLEDIT_SPINNER;
                break block16;
lbl81:
                // 1 sources

                ret = null;
            }
            getTableCellEditorComponent = ret;
            return getTableCellEditorComponent;
lbl86:
            // 1 sources

            return getTableCellEditorComponent;
lbl88:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {}
            break block17;
            finally {
            }
        }
        var8_11 = null;
        Err = v0;
        ** while (true)
    }

    private void initVars() {
        JBCellEditor Me;
        Me.myText = new JBCellEditor$TextBox();
        Me.myText.setOwner(Me, 1);
        Me.myCombo = new JBCellEditor$ComboBox();
        Me.myCombo.setOwner(Me, 2);
        Me.myButton = new JBCellEditor$CommandButton();
        Me.myButton.setOwner(Me, 3);
        Me.myCheck = new JBCellEditor$CheckBox();
        Me.myCheck.setOwner(Me, 4);
        Me.mySpinner = new JBCellEditor$Spinner();
        Me.mySpinner.setOwner(Me, 5);
        Me.myLabel = new Label();
        Me.ButtonFrame = new JPanel(new BorderLayout());
        Me.myEditMode = CELLEDITTYPE.CELLEDIT_TEXT;
        Me.myCellEditorComponent = new JBCellEditorComponent();
        Me.myGrid = null;
        Me.lastObject = null;
    }
}
