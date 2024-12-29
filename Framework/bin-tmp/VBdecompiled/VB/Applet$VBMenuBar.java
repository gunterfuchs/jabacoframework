/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Applet;
import VB.IJabacoForm;
import VB.IMenuItem;
import VB.VBMenuBar;

public class Applet$VBMenuBar
extends VBMenuBar {
    int ID;
    Applet Owner;
    int Index;

    public Applet$VBMenuBar(IJabacoForm iJabacoForm) {
        super(iJabacoForm);
        Applet$VBMenuBar Me;
    }

    public void setOwner(Applet applet, int n) {
        Me.Owner = applet;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Visible(boolean h2) {
        Applet$VBMenuBar Me;
        if (1 == Me.ID) {
            Me.Owner.myMenuBar_Visible(h2);
            return;
        }
    }

    @Override
    public void _Click(IMenuItem h2) {
        Applet$VBMenuBar Me;
        if (1 == Me.ID) {
            Me.Owner.myMenuBar_Click(h2);
            return;
        }
    }
}
