/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VB.IWinsockItem;
import VB.Winsock;
import VB.WinsockSendThread;
import VBA.Constants;
import VBA.Conversion;
import VBA.Interaction;
import VBA.Strings;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WinsockItemTCP
extends Thread
implements IJabacoClass,
IWinsockItem,
Runnable {
    private Winsock myOwner;
    private Socket mySocket;
    private WinsockSendThread mySendThread;
    private long myBytesReceived;
    private String myBuffer;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BytesReceived() {
        long $BytesReceived = 0L;
        Throwable Err = null;
        try {
            WinsockItemTCP Me;
            return Me.myBytesReceived + (long)Me.GetInputStream().available();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BytesReceived;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public WinsockItemTCP(Winsock RefOwner) {
        WinsockItemTCP Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myOwner = RefOwner;
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Winsock $Owner() {
        Winsock $Owner = null;
        Throwable Err = null;
        try {
            WinsockItemTCP Me;
            return Me.myOwner;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Owner;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Connect() {
        boolean Connect = false;
        Throwable Err = null;
        Socket tmpSocket = null;
        try {
            WinsockItemTCP Me;
            tmpSocket = new Socket(Me.$Owner().$RemoteHost(), (int)Me.$Owner().$RemotePort());
            return Me.Connect(tmpSocket);
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Connect(Socket refSocket) {
        boolean Connect = false;
        Throwable Err = null;
        try {
            Me.mySocket = refSocket;
            return true;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Connect;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[DOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public InputStream GetInputStream() {
        InputStream GetInputStream = null;
        Throwable Err = null;
        try {
            WinsockItemTCP Me;
            return Me.mySocket.getInputStream();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return GetInputStream;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public OutputStream GetOutputStream() {
        OutputStream GetOutputStream = null;
        Throwable Err = null;
        try {
            WinsockItemTCP Me;
            return Me.mySocket.getOutputStream();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return GetOutputStream;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public synchronized String GetData() {
        String GetData = "";
        Throwable Err = null;
        try {
            WinsockItemTCP Me;
            GetData = Strings.StrCat(Me.myBuffer, Me.GetDataFromBuffer());
            Me.myBuffer = Constants.vbNullString;
            return GetData;
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
    private synchronized String GetDataFromBuffer() {
        String GetDataFromBuffer = "";
        Throwable Err = null;
        DataInputStream tmpStream = null;
        try {
            WinsockItemTCP Me;
            tmpStream = new DataInputStream(Me.GetInputStream());
            Me.myBytesReceived += (long)tmpStream.available();
            return Conversion.CStr(tmpStream);
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetDataFromBuffer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void SendData(String data) {
        Throwable Err = null;
        try {
            WinsockItemTCP Me;
            Me.mySendThread.AddData(data);
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
    public Socket $Parent() {
        Socket $Parent = null;
        Throwable Err = null;
        try {
            WinsockItemTCP Me;
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
            WinsockItemTCP Me;
            Me.mySocket.close();
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            WinsockItemTCP Me;
            Me.mySendThread = new WinsockSendThread(Me);
            Me.mySendThread.start();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.myOwner = null;
        Me.mySocket = null;
        Me.mySendThread = null;
        Me.myBytesReceived = 0L;
        Me.myBuffer = "";
    }
}
