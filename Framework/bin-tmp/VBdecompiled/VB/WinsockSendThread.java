/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.ErrorConstants;
import VB.StateConstants;
import VB.WinsockItemTCP;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBVariant;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WinsockSendThread
extends Thread {
    private WinsockItemTCP Owner;
    private List DataHive;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void AddData(String NewData) {
        Throwable Err = null;
        try {
            WinsockSendThread Me;
            if (Me.Owner.$Owner().$State().compareTo(StateConstants.sckConnected) == 0) {
                Me.DataHive.add((Object)NewData);
                return;
            }
            Me.Owner.$Owner().OnError(ErrorConstants.sckNotConnected);
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
    public WinsockSendThread(WinsockItemTCP RefOwner) {
        WinsockSendThread Me;
        Throwable Err = null;
        super(RefOwner);
        Me.initVars();
        try {
            Me.Owner = RefOwner;
            Me.Class_Initialize();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
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
        block5: {
            Err = null;
            try {
                if (true) ** GOTO lbl9
            }
            catch (Throwable v0) {
                break block5;
            }
            while (true) {
                Me.processData();
lbl9:
                // 2 sources

                try {
                }
                catch (Throwable v0) {
                    break;
                }
            }
        }
        var2_2 = null;
        Err = v0;
        Me.Owner.$Owner().OnError(ErrorConstants.sckInProgress, Err.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private synchronized void processData() {
        Throwable Err = null;
        String tmpData = "";
        try {
            WinsockSendThread Me;
            if (!Me.DataHive.isEmpty()) {
                tmpData = Me.DataHive.get(0).toString();
                Me.DataHive.remove(0);
                Me.SendData(tmpData);
                return;
            }
            Thread.yield();
            Thread.sleep(1);
            return;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void SendData(String data) {
        Throwable throwable2;
        Throwable Err;
        block6: {
            Err = null;
            DataOutputStream tmpStream = null;
            long DataSize = 0L;
            long CurrentSend = 0L;
            long CurrentDataSize = 0L;
            long CurrentPacketSize = 0L;
            try {
                WinsockSendThread Me;
                tmpStream = new DataOutputStream(Me.Owner.GetOutputStream());
                CurrentDataSize = DataSize = (long)Strings.Len(data);
                while (true) {
                    if (!(CurrentDataSize > (long)0)) {
                        Me.Owner.$Owner().OnSendComplete();
                        return;
                    }
                    CurrentPacketSize = Interaction.IIF(Me.Owner.$Owner().$BlockSize() < CurrentDataSize, VBVariant.valueOf(Me.Owner.$Owner().$BlockSize()), VBVariant.valueOf(CurrentDataSize)).longValue();
                    tmpStream.write(Strings.StringToArray(data), (int)CurrentSend, (int)CurrentPacketSize);
                    Me.Owner.$Owner().OnSendProgress(CurrentSend += CurrentPacketSize, CurrentDataSize -= CurrentPacketSize);
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (Throwable throwable2) {
            }
        }
        Object var3_8 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            Me.DataHive = Collections.synchronizedList(new ArrayList());
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.Owner = null;
        Me.DataHive = null;
    }
}
