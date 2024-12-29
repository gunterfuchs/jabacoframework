/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.CommandButton;
import VB.JBCellEditor;

public class JBCellEditor$CommandButton
extends CommandButton {
    int ID;
    JBCellEditor Owner;
    int Index;

    public JBCellEditor$CommandButton() {
        JBCellEditor$CommandButton Me;
    }

    public void setOwner(JBCellEditor jBCellEditor, int n) {
        Me.Owner = jBCellEditor;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click() {
        JBCellEditor$CommandButton Me;
        if (3 == Me.ID) {
            Me.Owner.myButton_Click();
            return;
        }
    }
}
