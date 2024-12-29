/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.MODTYPE;
import VBA.Interaction;
import java.awt.Graphics;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class RTTextPane
extends JTextPane
implements DocumentListener {
    public void _Modified(MODTYPE action, DocumentEvent e) {
    }

    public void _Paint(Graphics g) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JTextPane $Parent() {
        RTTextPane $Parent = null;
        Throwable Err = null;
        try {
            RTTextPane Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setDocument(Document refDoc) {
        Throwable Err = null;
        try {
            RTTextPane Me;
            super.setDocument(refDoc);
            refDoc.removeDocumentListener(Me);
            refDoc.addDocumentListener(Me);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void paintComponent(Graphics g) {
        Object var3_3;
        RTTextPane Me;
        Throwable Err = null;
        try {
            super.paintComponent(g);
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            Me._Paint(g);
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void insertUpdate(DocumentEvent e) {
        Throwable Err = null;
        try {
            RTTextPane Me;
            Me._Modified(MODTYPE.DOC_INSERT, e);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void removeUpdate(DocumentEvent e) {
        Throwable Err = null;
        try {
            RTTextPane Me;
            Me._Modified(MODTYPE.DOC_REMOVE, e);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void changedUpdate(DocumentEvent e) {
        Throwable Err = null;
        try {
            RTTextPane Me;
            Me._Modified(MODTYPE.DOC_CHANGED, e);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public RTTextPane() {
        RTTextPane Me;
        Me.initVars();
    }

    private void initVars() {
    }
}
