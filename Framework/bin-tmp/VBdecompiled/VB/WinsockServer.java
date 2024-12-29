/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VB.Winsock;
import VB.WinsockServerRequest;
import VBA.Interaction;
import java.net.ServerSocket;
import javax.swing.SwingUtilities;

public class WinsockServer
implements IJabacoClass,
Runnable {
    private boolean bWithGUI;
    private Thread myThread;
    private ServerSocket myServer;
    private Winsock Owner;

    public void _Connect() {
    }

    public void _Close() {
    }

    public void _SendComplete() {
    }

    public void _SendProgress(long bytesSent, long bytesRemaining) {
    }

    public void _DataArrival(long bytesTotal) {
    }

    public void _ConnectionRequest(long requestID) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public WinsockServer(Winsock RefOwner) {
        WinsockServer Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.Owner = RefOwner;
            Me.myThread = new Thread(Me);
            Me.myThread.start();
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
    public void closeServer() {
        Throwable Err = null;
        try {
            WinsockServer Me;
            if (Me.myServer != null) {
                Me.myServer.close();
            }
            Me.myServer = null;
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startServer() {
        Throwable Err = null;
        try {
            WinsockServer Me;
            Me.bWithGUI = SwingUtilities.isEventDispatchThread();
            if (Me.myServer != null) {
                Me.myServer.close();
            }
            Me.myServer = new ServerSocket((int)Me.Owner.$LocalPort());
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        Err = null;
        tmpSocket = null;
        tmpRequest = null;
        if (true) ** GOTO lbl118
        while (true) {
            block43: {
                block46: {
                    block48: {
                        block47: {
                            block45: {
                                block44: {
                                    block42: {
                                        block41: {
                                            try {
                                                if (Me.myServer == null) break block41;
                                                break block42;
                                            }
                                            catch (Throwable v0) {
                                                var2_4 = null;
                                                Err = v0;
                                            }
                                        }
                                        try {
                                            try {
                                                Thread.sleep(1);
                                            }
                                            catch (Throwable v1) {
                                                var2_4 = null;
                                                Err = v1;
                                            }
                                            break block43;
                                        }
                                        catch (Throwable v2) {
                                            var2_4 = null;
                                            Err = v2;
                                        }
                                    }
                                    try {
                                        if (Me.myServer.isBound()) break block44;
                                        break block43;
                                    }
                                    catch (Throwable v3) {
                                        var2_4 = null;
                                        Err = v3;
                                    }
                                }
                                try {
                                    tmpSocket = Me.myServer.accept();
                                }
                                catch (Throwable v4) {
                                    var2_4 = null;
                                    Err = v4;
                                }
                                try {
                                    if (tmpSocket != null) break block45;
                                    break block46;
                                }
                                catch (Throwable v5) {
                                    var2_4 = null;
                                    Err = v5;
                                }
                            }
                            try {
                                if (Me.bWithGUI) break block47;
                                break block48;
                            }
                            catch (Throwable v6) {
                                var2_4 = null;
                                Err = v6;
                            }
                        }
                        try {
                            try {
                                tmpRequest = new WinsockServerRequest(Me.Owner, tmpSocket);
                            }
                            catch (Throwable v7) {
                                var2_4 = null;
                                Err = v7;
                            }
                            break block43;
                        }
                        catch (Throwable v8) {
                            var2_4 = null;
                            Err = v8;
                        }
                    }
                    try {
                        try {
                            try {
                                Me.Owner.OnConnectionRequest(tmpSocket);
                            }
                            catch (Throwable v9) {
                                var2_4 = null;
                                Err = v9;
                                break block43;
                            }
                        }
                        catch (Throwable v10) {
                            var2_4 = null;
                            Err = v10;
                        }
                        break block43;
                    }
                    catch (Throwable v11) {
                        var2_4 = null;
                        Err = v11;
                    }
                }
                try {
                    try {
                        try {
                            Thread.sleep(1);
                        }
                        catch (Throwable v12) {
                            var2_4 = null;
                            Err = v12;
                        }
                    }
                    catch (Throwable v13) {
                        var2_4 = null;
                        Err = v13;
                    }
                }
                catch (Throwable v14) {
                    var2_4 = null;
                    Err = v14;
                }
            }
            break;
        }
        catch (Throwable v15) {
            var2_4 = null;
            Err = v15;
            return;
        }
        {
            continue;
        }
        catch (Throwable v16) {
            var2_4 = null;
            Err = v16;
        }
        try {
        }
        catch (Throwable v17) {
            var2_4 = null;
            Err = v17;
            return;
        }
    }

    private void initVars() {
        WinsockServer Me;
        Me.bWithGUI = false;
        Me.myThread = new Thread(Me);
        Me.myServer = null;
        Me.Owner = null;
    }
}
