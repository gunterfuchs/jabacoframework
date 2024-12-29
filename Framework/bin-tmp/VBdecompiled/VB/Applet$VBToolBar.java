/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Applet;
import VB.IJabacoForm;
import VB.IToolBarItem;
import VB.VBToolBar;

public class Applet$VBToolBar
extends VBToolBar {
    int ID;
    Applet Owner;
    int Index;

    public Applet$VBToolBar(IJabacoForm iJabacoForm) {
        super(iJabacoForm);
        Applet$VBToolBar Me;
    }

    public void setOwner(Applet applet, int n) {
        Me.Owner = applet;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Visible(boolean h2) {
        Applet$VBToolBar Me;
        if (2 == Me.ID) {
            Me.Owner.myToolBar_Visible(h2);
            return;
        }
    }

    @Override
    public void _Click(IToolBarItem h2) {
        Applet$VBToolBar Me;
        if (2 == Me.ID) {
            Me.Owner.myToolBar_Click(h2);
            return;
        }
    }
}
