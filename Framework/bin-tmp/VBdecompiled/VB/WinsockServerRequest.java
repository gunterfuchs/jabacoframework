/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Winsock;
import VBA.Interaction;
import java.net.Socket;
import javax.swing.SwingUtilities;

public class WinsockServerRequest
implements Runnable {
    private Socket mySocket;
    private Winsock myOwner;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public WinsockServerRequest(Winsock RefOwner, Socket RefSocket) {
        WinsockServerRequest Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myOwner = RefOwner;
            Me.mySocket = RefSocket;
            if (SwingUtilities.isEventDispatchThread()) {
                Me.run();
                return;
            }
            SwingUtilities.invokeAndWait(Me);
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
    @Override
    public void run() {
        Throwable Err = null;
        try {
            WinsockServerRequest Me;
            Me.myOwner.OnConnectionRequest(Me.mySocket);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.mySocket = null;
        Me.myOwner = null;
    }
}
