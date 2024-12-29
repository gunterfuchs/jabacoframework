/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Form;
import VB.PictureBox;
import java.awt.Graphics;

public class Form$PictureBox
extends PictureBox {
    int ID;
    Form Owner;
    int Index;

    public Form$PictureBox() {
        Form$PictureBox Me;
    }

    public void setOwner(Form form, int n) {
        Me.Owner = form;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click() {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_Click();
            return;
        }
    }

    @Override
    public void _DblClick() {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_DblClick();
            return;
        }
    }

    @Override
    public void _KeyDown(int h2, int h3) {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_KeyDown(h2, h3);
            return;
        }
    }

    @Override
    public void _KeyPress(int h2) {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_KeyPress(h2);
            return;
        }
    }

    @Override
    public void _KeyUp(int h2, int h3) {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_KeyUp(h2, h3);
            return;
        }
    }

    @Override
    public void _MouseDown(int h2, int h3, float h4, float h5) {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_MouseDown(h2, h3, h4, h5);
            return;
        }
    }

    @Override
    public void _MouseMove(int h2, int h3, float h4, float h5) {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_MouseMove(h2, h3, h4, h5);
            return;
        }
    }

    @Override
    public void _MouseUp(int h2, int h3, float h4, float h5) {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_MouseUp(h2, h3, h4, h5);
            return;
        }
    }

    @Override
    public void _Paint(Graphics h2) {
        Form$PictureBox Me;
        if (1 == Me.ID) {
            Me.Owner.myContent_Paint(h2);
            return;
        }
    }
}
