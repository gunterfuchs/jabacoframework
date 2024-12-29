/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VB.IWinsockItem;
import VB.Winsock;
import VBA.Interaction;
import java.net.DatagramSocket;

public class WinsockItemUDP
extends Thread
implements IJabacoClass,
IWinsockItem,
Runnable {
    private Winsock myOwner;
    private DatagramSocket mySocket;

    public long $BytesReceived() {
        long $BytesReceived = 0L;
        Object Err = null;
        return $BytesReceived;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void WinsockItem(Winsock RefOwner) {
        Throwable Err = null;
        try {
            Me.myOwner = RefOwner;
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
    public Winsock $Owner() {
        Winsock $Owner = null;
        Throwable Err = null;
        try {
            WinsockItemUDP Me;
            return Me.myOwner;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Owner;
    }

    @Override
    public void run() {
        Object Err = null;
    }

    @Override
    public synchronized String GetData() {
        String GetData = "";
        Object Err = null;
        return GetData;
    }

    @Override
    public void SendData(String data) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DatagramSocket $Parent() {
        DatagramSocket $Parent = null;
        Throwable Err = null;
        try {
            WinsockItemUDP Me;
            return Me.mySocket;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void Close() {
        Throwable Err = null;
        try {
            WinsockItemUDP Me;
            Me.mySocket.close();
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
            return;
        }
    }

    private void Class_Initialize() {
        Object Err = null;
    }

    public WinsockItemUDP() {
        WinsockItemUDP Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        Me.myOwner = null;
        Me.mySocket = null;
    }
}
