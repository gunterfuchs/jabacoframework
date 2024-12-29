/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Dialog;
import VB.IJabacoForm;
import VB.IMenuItem;
import VB.VBMenuBar;

public class Dialog$VBMenuBar
extends VBMenuBar {
    int ID;
    Dialog Owner;
    int Index;

    public Dialog$VBMenuBar(IJabacoForm iJabacoForm) {
        super(iJabacoForm);
        Dialog$VBMenuBar Me;
    }

    public void setOwner(Dialog dialog, int n) {
        Me.Owner = dialog;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click(IMenuItem h2) {
        Dialog$VBMenuBar Me;
        if (1 == Me.ID) {
            Me.Owner.myMenuBar_Click(h2);
            return;
        }
    }
}
