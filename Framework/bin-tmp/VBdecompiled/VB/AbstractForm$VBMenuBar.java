/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AbstractForm;
import VB.IJabacoForm;
import VB.IMenuItem;
import VB.VBMenuBar;

public class AbstractForm$VBMenuBar
extends VBMenuBar {
    int ID;
    AbstractForm Owner;
    int Index;

    public AbstractForm$VBMenuBar(IJabacoForm iJabacoForm) {
        super(iJabacoForm);
        AbstractForm$VBMenuBar Me;
    }

    public void setOwner(AbstractForm abstractForm, int n) {
        Me.Owner = abstractForm;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click(IMenuItem h2) {
        AbstractForm$VBMenuBar Me;
        if (1 == Me.ID) {
            Me.Owner.myMenuBar_Click(h2);
            return;
        }
    }
}
