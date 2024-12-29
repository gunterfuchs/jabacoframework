/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.IJabacoClass;
import VBA.Constants;
import VBA.Interaction;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class VBClipboard
implements IJabacoClass {
    private Clipboard myClipBoardInternal;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Clipboard myClipBoard() {
        Clipboard myClipBoard = null;
        Throwable Err = null;
        try {
            VBClipboard Me;
            if (Me.myClipBoardInternal == null) {
                Me.myClipBoardInternal = Toolkit.getDefaultToolkit().getSystemClipboard();
            }
            return Me.myClipBoardInternal;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return myClipBoard;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void SetText(String val) {
        Throwable throwable2;
        Throwable Err;
        block7: {
            VBClipboard Me;
            Err = null;
            StringSelection myStringSelection = null;
            try {
                if (Global.SysInfo().$SecurityMode()) {
                    return;
                }
                boolean bl = true;
                if (!bl) {
                    return;
                }
                myStringSelection = new StringSelection(val);
            }
            catch (Throwable throwable2) {
                break block7;
            }
            Me.myClipBoard().setContents(myStringSelection, null);
        }
        Object var3_4 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String GetText() {
        Object var3_5;
        VBClipboard Me;
        Transferable tmpData;
        Throwable Err;
        String GetText;
        block9: {
            GetText = "";
            Err = null;
            tmpData = null;
            if (!Global.SysInfo().$SecurityMode()) break block9;
            return GetText;
        }
        tmpData = Me.myClipBoard().getContents(null);
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetText;
        catch (Throwable throwable) {
            var3_5 = null;
            Err = throwable;
        }
        try {
            GetText = (String)tmpData.getTransferData(DataFlavor.stringFlavor);
            return GetText;
        }
        catch (Throwable throwable) {
            var3_5 = null;
            Err = throwable;
            return GetText;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void SetData(Transferable obj) {
        Throwable Err = null;
        try {
            VBClipboard Me;
            if (Global.SysInfo().$SecurityMode()) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.myClipBoard().setContents(obj, null);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
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
    public Transferable GetData() {
        Throwable Err;
        Transferable GetData;
        block9: {
            VBClipboard Me;
            block8: {
                block7: {
                    GetData = null;
                    Err = null;
                    if (!Global.SysInfo().$SecurityMode()) break block7;
                    return GetData;
                }
                try {}
                catch (Throwable throwable) {
                    Object var3_5 = null;
                    Err = throwable;
                    return GetData;
                }
                break block8;
                catch (Throwable throwable) {
                    Object var3_3 = null;
                    Err = throwable;
                }
                break block9;
            }
            GetData = Me.myClipBoard().getContents(null);
            return GetData;
        }
        Interaction.MsgBox(Err);
        return GetData;
        finally {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Clear() {
        Throwable Err = null;
        try {
            VBClipboard Me;
            if (Global.SysInfo().$SecurityMode()) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.SetText(Constants.vbNullString);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public VBClipboard() {
        VBClipboard Me;
        Me.initVars();
    }

    private void initVars() {
        Me.myClipBoardInternal = null;
    }
}
