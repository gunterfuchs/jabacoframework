/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.Interaction;
import javax.swing.DefaultListModel;

public class ListBoxModel
extends DefaultListModel {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void fireChangeEvent(int fromIndex, int toIndex) {
        Throwable Err = null;
        try {
            ListBoxModel Me;
            super.fireContentsChanged(Me, fromIndex, toIndex);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public ListBoxModel() {
        ListBoxModel Me;
        Me.initVars();
    }

    private void initVars() {
    }
}
