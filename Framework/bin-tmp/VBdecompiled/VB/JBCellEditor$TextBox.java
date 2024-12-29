/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.JBCellEditor;
import VB.TextBox;

public class JBCellEditor$TextBox
extends TextBox {
    int ID;
    JBCellEditor Owner;
    int Index;

    public JBCellEditor$TextBox() {
        JBCellEditor$TextBox Me;
    }

    public void setOwner(JBCellEditor jBCellEditor, int n) {
        Me.Owner = jBCellEditor;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _KeyDown(int h2, int h3) {
        JBCellEditor$TextBox Me;
        if (1 == Me.ID) {
            Me.Owner.myText_KeyDown(h2, h3);
            return;
        }
    }
}
