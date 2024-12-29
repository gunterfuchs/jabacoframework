/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Applet;
import VB.PictureBox;

public class Applet$PictureBox
extends PictureBox {
    int ID;
    Applet Owner;
    int Index;

    public Applet$PictureBox() {
        Applet$PictureBox Me;
    }

    public void setOwner(Applet applet, int n) {
        Me.Owner = applet;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click() {
        Applet$PictureBox Me;
        if (3 == Me.ID) {
            Me.Owner.myContent_Click();
            return;
        }
    }

    @Override
    public void _DblClick() {
        Applet$PictureBox Me;
        if (3 == Me.ID) {
            Me.Owner.myContent_DblClick();
            return;
        }
    }

    @Override
    public void _KeyDown(int h2, int h3) {
        Applet$PictureBox Me;
        if (3 == Me.ID) {
            Me.Owner.myContent_KeyDown(h2, h3);
            return;
        }
    }

    @Override
    public void _KeyPress(int h2) {
        Applet$PictureBox Me;
        if (3 == Me.ID) {
            Me.Owner.myContent_KeyPress(h2);
            return;
        }
    }

    @Override
    public void _KeyUp(int h2, int h3) {
        Applet$PictureBox Me;
        if (3 == Me.ID) {
            Me.Owner.myContent_KeyUp(h2, h3);
            return;
        }
    }

    @Override
    public void _MouseDown(int h2, int h3, float h4, float h5) {
        Applet$PictureBox Me;
        if (3 == Me.ID) {
            Me.Owner.myContent_MouseDown(h2, h3, h4, h5);
            return;
        }
    }

    @Override
    public void _MouseMove(int h2, int h3, float h4, float h5) {
        Applet$PictureBox Me;
        if (3 == Me.ID) {
            Me.Owner.myContent_MouseMove(h2, h3, h4, h5);
            return;
        }
    }

    @Override
    public void _MouseUp(int h2, int h3, float h4, float h5) {
        Applet$PictureBox Me;
        if (3 == Me.ID) {
            Me.Owner.myContent_MouseUp(h2, h3, h4, h5);
            return;
        }
    }
}
