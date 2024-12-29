/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.ErrorConstants;
import VB.IJabacoClass;
import VB.IWinsockItem;
import VB.ProtocolConstants;
import VB.StateConstants;
import VB.WinsockItemTCP;
import VB.WinsockServer;
import VBA.Interaction;
import VBA.Strings;
import java.net.InetAddress;
import java.net.Socket;

public class Winsock
implements IJabacoClass {
    private IWinsockItem mySocket;
    private WinsockServer myServer;
    private String myRemoteHost;
    private long myRemotePort;
    private String myLocalHost;
    private long myLocalPort;
    private ProtocolConstants myProtocol;
    private long myBlockSize;
    private StateConstants myState;

    public void _Error(ErrorConstants Number, String Description) {
    }

    public void _Connect() {
    }

    public void _Close() {
    }

    public void _SendProgress(long bytesSent, long bytesRemaining) {
    }

    public void _DataArrival(long bytesTotal) {
    }

    public void _ConnectionRequest(Socket requestSocket) {
    }

    public void _SendComplete() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IWinsockItem $Parent() {
        IWinsockItem $Parent = null;
        Throwable Err = null;
        try {
            Winsock Me;
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public StateConstants $State() {
        StateConstants $State = new StateConstants();
        Throwable Err = null;
        try {
            Winsock Me;
            return Me.myState;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $State;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Listen() {
        boolean Listen = false;
        Throwable Err = null;
        try {
            Winsock Me;
            Me.myServer.startServer();
            return false;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Listen;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Accept(Socket requestSocket) {
        Throwable throwable2;
        Throwable Err;
        block6: {
            WinsockItemTCP tmpSocket;
            Err = null;
            try {
                Winsock Me;
                Me.Close();
                tmpSocket = new WinsockItemTCP(Me);
            }
            catch (Throwable throwable2) {
                break block6;
            }
            Me.mySocket = tmpSocket;
            Me.myState = StateConstants.sckConnected;
            if (!tmpSocket.Connect(requestSocket)) {
                return;
            }
            tmpSocket.start();
        }
        Object var3_4 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void OnDataArrival(long bytesTotal) {
        Throwable Err = null;
        try {
            Winsock Me;
            Me._DataArrival(bytesTotal);
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void OnConnect() {
        Throwable Err = null;
        try {
            Winsock Me;
            Me._Connect();
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
    public void OnClose() {
        Throwable Err = null;
        try {
            Winsock Me;
            Me.myState = StateConstants.sckClosing;
            Me.Close();
            Me._Close();
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
    public void OnConnectionRequest(Socket requestSocket) {
        Throwable Err = null;
        try {
            Winsock Me;
            Me._ConnectionRequest(requestSocket);
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
    public void OnSendProgress(long bytesSent, long bytesRemaining) {
        Throwable Err = null;
        try {
            Winsock Me;
            Me._SendProgress(bytesSent, bytesRemaining);
            return;
        }
        catch (Throwable throwable) {
            Object var6_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void OnSendComplete() {
        Throwable Err = null;
        try {
            Winsock Me;
            Me._SendComplete();
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
    public String GetData() {
        String GetData = "";
        Throwable Err = null;
        try {
            Winsock Me;
            return Me.mySocket.GetData();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetData;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Connect() {
        Throwable throwable2;
        Throwable Err;
        block6: {
            WinsockItemTCP tmpSocket;
            Err = null;
            try {
                Winsock Me;
                Me.myState = StateConstants.sckConnecting;
                Me.Close();
                tmpSocket = new WinsockItemTCP(Me);
            }
            catch (Throwable throwable2) {
                break block6;
            }
            Me.mySocket = tmpSocket;
            if (!tmpSocket.Connect()) {
                return;
            }
            Me.myState = StateConstants.sckConnected;
            tmpSocket.start();
        }
        Object var2_3 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Connect(String RefRemoteHost, long RefRemotePort) {
        Throwable Err = null;
        try {
            Winsock Me;
            Me.$RemoteHost(RefRemoteHost);
            Me.$RemotePort(RefRemotePort);
            Me.Connect();
            return;
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isMulticastAddress() {
        boolean isMulticastAddress = false;
        Throwable Err = null;
        try {
            Winsock Me;
            return InetAddress.getByName(Me.$RemoteHost()).isMulticastAddress();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return isMulticastAddress;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void SendData(String data) {
        Throwable Err = null;
        try {
            Winsock Me;
            if (Me.mySocket == null) {
                Me.OnError(ErrorConstants.sckNotInitialized);
                return;
            }
            Me.mySocket.SendData(data);
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
    public void Close() {
        Throwable Err = null;
        try {
            Winsock Me;
            if (Me.myServer != null) {
                Me.myServer.closeServer();
            }
            if (Me.mySocket != null) {
                Me.mySocket.Close();
            }
            Me.mySocket = null;
            Me.myState = StateConstants.sckClosed;
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
    public void $LocalHost(String Host) {
        Throwable Err = null;
        try {
            Me.myLocalHost = Host;
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
    public String $LocalHost() {
        String $LocalHost = "";
        Throwable Err = null;
        try {
            Winsock Me;
            if (Strings.Len(Me.myLocalHost) == 0) return "127.0.0.1";
            boolean bl = false;
            if (!bl) return Me.myLocalHost;
            return "127.0.0.1";
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $LocalHost;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $LocalPort(long Port) {
        Throwable Err = null;
        try {
            Me.myLocalPort = Port;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $LocalPort() {
        long $LocalPort = 0L;
        Throwable Err = null;
        try {
            Winsock Me;
            return Me.myLocalPort;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $LocalPort;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $RemoteHost(String Host) {
        Throwable Err = null;
        try {
            Me.myRemoteHost = Host;
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
    public String $RemoteHost() {
        String $RemoteHost = "";
        Throwable Err = null;
        try {
            Winsock Me;
            return Me.myRemoteHost;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $RemoteHost;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $RemotePort(long Port) {
        Throwable Err = null;
        try {
            Me.myRemotePort = Port;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $RemotePort() {
        long $RemotePort = 0L;
        Throwable Err = null;
        try {
            Winsock Me;
            return Me.myRemotePort;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $RemotePort;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Protocol(ProtocolConstants v) {
        Throwable Err = null;
        try {
            Me.myProtocol = v;
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
    public ProtocolConstants $Protocol() {
        ProtocolConstants $Protocol = new ProtocolConstants();
        Throwable Err = null;
        try {
            Winsock Me;
            return Me.myProtocol;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Protocol;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BlockSize(long v) {
        Throwable Err = null;
        try {
            Me.myBlockSize = v;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BlockSize() {
        long $BlockSize = 0L;
        Throwable Err = null;
        try {
            Winsock Me;
            if (Me.myBlockSize <= (long)0) return 16000L;
            boolean bl = false;
            if (!bl) return Me.myBlockSize;
            return 16000;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BlockSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            Me.myBlockSize = 16000;
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
    public void OnError(ErrorConstants Number) {
        Throwable Err = null;
        ErrorConstants h6 = new ErrorConstants();
        String Description = "";
        h6 = null;
        try {
            Winsock Me;
            block31: {
                block30: {
                    block29: {
                        block28: {
                            block27: {
                                block26: {
                                    block25: {
                                        block24: {
                                            block23: {
                                                block22: {
                                                    block21: {
                                                        block20: {
                                                            block19: {
                                                                block18: {
                                                                    block17: {
                                                                        block16: {
                                                                            block15: {
                                                                                block14: {
                                                                                    block13: {
                                                                                        block12: {
                                                                                            block11: {
                                                                                                block10: {
                                                                                                    block9: {
                                                                                                        block8: {
                                                                                                            block7: {
                                                                                                                block6: {
                                                                                                                    block5: {
                                                                                                                        block4: {
                                                                                                                            block3: {
                                                                                                                                block2: {
                                                                                                                                    h6 = Number;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckOutOfMemory) == 0) break block2;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckInProgress) == 0) break block3;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckAlreadyComplete) == 0) break block4;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNotSocket) == 0) break block5;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckMsgTooBig) == 0) break block6;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckPortNotSupported) == 0) break block7;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckAddressInUse) == 0) break block8;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckAddressNotAvailable) == 0) break block9;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNetworkSubsystemFailed) == 0) break block10;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNetworkUnreachable) == 0) break block11;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNetReset) == 0) break block12;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckConnectAborted) == 0) break block13;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckConnectionReset) == 0) break block14;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNoBufferSpace) == 0) break block15;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckAlreadyConnected) == 0) break block16;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNotConnected) == 0) break block17;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckSocketShutdown) == 0) break block18;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckTimedout) == 0) break block19;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckConnectionRefused) == 0) break block20;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNotInitialized) == 0) break block21;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckHostNotFound) == 0) break block22;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckHostNotFoundTryAgain) == 0) break block23;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNonRecoverableError) == 0) break block24;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckNoData) == 0) break block25;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckBadState) == 0) break block26;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckUnsupported) == 0) break block27;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckInvalidOp) == 0) break block28;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckOutOfRange) == 0) break block29;
                                                                                                                                    if (h6.compareTo(ErrorConstants.sckWrongProtocol) == 0) break block30;
                                                                                                                                    Description = "Unknown";
                                                                                                                                    break block31;
                                                                                                                                }
                                                                                                                                Description = "OutOfMemory";
                                                                                                                                break block31;
                                                                                                                            }
                                                                                                                            Description = "InProgress";
                                                                                                                            break block31;
                                                                                                                        }
                                                                                                                        Description = "AlreadyComplete";
                                                                                                                        break block31;
                                                                                                                    }
                                                                                                                    Description = "NotSocket";
                                                                                                                    break block31;
                                                                                                                }
                                                                                                                Description = "MsgTooBig";
                                                                                                                break block31;
                                                                                                            }
                                                                                                            Description = "PortNotSupported";
                                                                                                            break block31;
                                                                                                        }
                                                                                                        Description = "AddressInUse";
                                                                                                        break block31;
                                                                                                    }
                                                                                                    Description = "AddressNotAvailable";
                                                                                                    break block31;
                                                                                                }
                                                                                                Description = "NetworkSubsystemFailed";
                                                                                                break block31;
                                                                                            }
                                                                                            Description = "NetworkUnreachable";
                                                                                            break block31;
                                                                                        }
                                                                                        Description = "NetReset";
                                                                                        break block31;
                                                                                    }
                                                                                    Description = "ConnectAborted";
                                                                                    break block31;
                                                                                }
                                                                                Description = "ConnectionReset";
                                                                                break block31;
                                                                            }
                                                                            Description = "NoBufferSpace";
                                                                            break block31;
                                                                        }
                                                                        Description = "AlreadyConnected";
                                                                        break block31;
                                                                    }
                                                                    Description = "NotConnected";
                                                                    break block31;
                                                                }
                                                                Description = "SocketShutdown";
                                                                break block31;
                                                            }
                                                            Description = "Timedout";
                                                            break block31;
                                                        }
                                                        Description = "ConnectionRefused";
                                                        break block31;
                                                    }
                                                    Description = "NotInitialized";
                                                    break block31;
                                                }
                                                Description = "HostNotFound";
                                                break block31;
                                            }
                                            Description = "HostNotFoundTryAgain";
                                            break block31;
                                        }
                                        Description = "NonRecoverableError";
                                        break block31;
                                    }
                                    Description = "NoData";
                                    break block31;
                                }
                                Description = "BadState";
                                break block31;
                            }
                            Description = "Unsupported";
                            break block31;
                        }
                        Description = "InvalidOp";
                        break block31;
                    }
                    Description = "OutOfRange";
                    break block31;
                }
                Description = "WrongProtocol";
            }
            Me.OnError(Number, Strings.StrCat("[Socket] Error: ", Description));
            return;
        }
        catch (Throwable throwable) {
            Object var3_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void OnError(ErrorConstants Number, String Description) {
        Throwable Err = null;
        try {
            Winsock Me;
            Me.myState = StateConstants.sckError;
            Me._Error(Number, Description);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public Winsock() {
        Winsock Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        Winsock Me;
        Me.mySocket = null;
        Me.myServer = new WinsockServer(Me);
        Me.myRemoteHost = "";
        Me.myRemotePort = 0L;
        Me.myLocalHost = "";
        Me.myLocalPort = 0L;
        Me.myProtocol = new ProtocolConstants();
        Me.myBlockSize = 0L;
        Me.myState = StateConstants.sckClosed;
    }
}
