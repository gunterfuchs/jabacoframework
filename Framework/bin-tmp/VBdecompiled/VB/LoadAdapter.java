/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.ILoadAdapter;
import VBA.Interaction;
import javax.swing.SwingUtilities;

public class LoadAdapter
implements Runnable {
    private ILoadAdapter myContainer;
    private Object mySender;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public LoadAdapter(Object refSender, ILoadAdapter refContainer) {
        LoadAdapter Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.mySender = refSender;
            Me.myContainer = refContainer;
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void fireLoaded() {
        Throwable Err = null;
        try {
            LoadAdapter Me;
            if (SwingUtilities.isEventDispatchThread()) {
                Me.myContainer.fireLoaded(Me.mySender);
                return;
            }
            SwingUtilities.invokeAndWait(Me);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public void fireLoaded(Object sender) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        Throwable Err = null;
        try {
            LoadAdapter Me;
            Me.myContainer.fireLoaded(Me.mySender);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.myContainer = null;
        Me.mySender = null;
    }
}
