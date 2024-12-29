/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.MDIChild;
import VBA.Interaction;
import VBA.Strings;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JInternalFrame;

public class MDIChildFocusHandler
implements PropertyChangeListener {
    private MDIChild myMDIChild;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MDIChildFocusHandler(MDIChild refMDIChild) {
        MDIChildFocusHandler Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myMDIChild = refMDIChild;
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
    public void propertyChange(PropertyChangeEvent arg2) {
        MDIChildFocusHandler Me;
        Object var3_4;
        Throwable Err = null;
        String propertyName = "";
        try {
            if (Global.$GlobalMDIForm() == null) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        propertyName = arg2.getPropertyName();
        try {
            if (Strings.StrComp(propertyName, JInternalFrame.IS_SELECTED_PROPERTY) != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            if (Global.GetStringAsBoolean(arg2.getOldValue().toString())) {
                Me.myMDIChild.Form_LostFocus();
            }
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            try {
                if (!Me.myMDIChild.isSelected()) {
                    return;
                }
                Me.myMDIChild.Form_GotFocus();
            }
            catch (Throwable throwable) {
                var3_4 = null;
                Err = throwable;
                return;
            }
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
            return;
        }
    }

    private void initVars() {
        Me.myMDIChild = null;
    }
}
