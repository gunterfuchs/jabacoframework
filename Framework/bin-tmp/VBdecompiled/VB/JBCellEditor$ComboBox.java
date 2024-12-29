/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.ComboBox;
import VB.JBCellEditor;

public class JBCellEditor$ComboBox
extends ComboBox {
    int ID;
    JBCellEditor Owner;
    int Index;

    public JBCellEditor$ComboBox() {
        JBCellEditor$ComboBox Me;
    }

    public void setOwner(JBCellEditor jBCellEditor, int n) {
        Me.Owner = jBCellEditor;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click() {
        JBCellEditor$ComboBox Me;
        if (2 == Me.ID) {
            Me.Owner.myCombo_Click();
            return;
        }
    }
}
