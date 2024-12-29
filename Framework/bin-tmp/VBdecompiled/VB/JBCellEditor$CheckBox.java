/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.CheckBox;
import VB.JBCellEditor;

public class JBCellEditor$CheckBox
extends CheckBox {
    int ID;
    JBCellEditor Owner;
    int Index;

    public JBCellEditor$CheckBox() {
        JBCellEditor$CheckBox Me;
    }

    public void setOwner(JBCellEditor jBCellEditor, int n) {
        Me.Owner = jBCellEditor;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click() {
        JBCellEditor$CheckBox Me;
        if (4 == Me.ID) {
            Me.Owner.myCheck_Click();
            return;
        }
    }
}
