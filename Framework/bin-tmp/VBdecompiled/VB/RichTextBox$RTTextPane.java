/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.MODTYPE;
import VB.RTTextPane;
import VB.RichTextBox;
import java.awt.Graphics;
import javax.swing.event.DocumentEvent;

public class RichTextBox$RTTextPane
extends RTTextPane {
    int ID;
    RichTextBox Owner;
    int Index;

    public RichTextBox$RTTextPane() {
        RichTextBox$RTTextPane Me;
    }

    public void setOwner(RichTextBox richTextBox, int n) {
        Me.Owner = richTextBox;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Modified(MODTYPE h2, DocumentEvent h3) {
        RichTextBox$RTTextPane Me;
        if (1 == Me.ID) {
            Me.Owner.myText_Modified(h2, h3);
            return;
        }
    }

    @Override
    public void _Paint(Graphics h2) {
        RichTextBox$RTTextPane Me;
        if (1 == Me.ID) {
            Me.Owner.myText_Paint(h2);
            return;
        }
    }
}
