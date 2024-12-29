/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.JBCellEditor;
import VB.Spinner;

public class JBCellEditor$Spinner
extends Spinner {
    int ID;
    JBCellEditor Owner;
    int Index;

    public JBCellEditor$Spinner() {
        JBCellEditor$Spinner Me;
    }

    public void setOwner(JBCellEditor jBCellEditor, int n) {
        Me.Owner = jBCellEditor;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _KeyDown(int h2, int h3) {
        JBCellEditor$Spinner Me;
        if (5 == Me.ID) {
            Me.Owner.mySpinner_KeyDown(h2, h3);
            return;
        }
    }
}
