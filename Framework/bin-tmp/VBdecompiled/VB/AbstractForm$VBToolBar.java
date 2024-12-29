/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AbstractForm;
import VB.IJabacoForm;
import VB.IToolBarItem;
import VB.VBToolBar;

public class AbstractForm$VBToolBar
extends VBToolBar {
    int ID;
    AbstractForm Owner;
    int Index;

    public AbstractForm$VBToolBar(IJabacoForm iJabacoForm) {
        super(iJabacoForm);
        AbstractForm$VBToolBar Me;
    }

    public void setOwner(AbstractForm abstractForm, int n) {
        Me.Owner = abstractForm;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click(IToolBarItem h2) {
        AbstractForm$VBToolBar Me;
        if (2 == Me.ID) {
            Me.Owner.myToolBar_Click(h2);
            return;
        }
    }
}
