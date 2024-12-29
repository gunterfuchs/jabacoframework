/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Dialog;
import VB.IJabacoForm;
import VB.IToolBarItem;
import VB.VBToolBar;

public class Dialog$VBToolBar
extends VBToolBar {
    int ID;
    Dialog Owner;
    int Index;

    public Dialog$VBToolBar(IJabacoForm iJabacoForm) {
        super(iJabacoForm);
        Dialog$VBToolBar Me;
    }

    public void setOwner(Dialog dialog, int n) {
        Me.Owner = dialog;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click(IToolBarItem h2) {
        Dialog$VBToolBar Me;
        if (2 == Me.ID) {
            Me.Owner.myToolBar_Click(h2);
            return;
        }
    }
}
