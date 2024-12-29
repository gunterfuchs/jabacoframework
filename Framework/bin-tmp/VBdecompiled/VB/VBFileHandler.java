/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VB.VBFileAccess;
import VB.VBFileLock;
import VB.VBFileMode;
import VBA.Constants;
import VBA.Conversion;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class VBFileHandler
implements IJabacoClass {
    private File myFile;
    private FileInputStream myInput;
    private BufferedReader myInputReader;
    private FileOutputStream myOutput;
    private String myInputReadLineMem;
    private String myFilename;
    private VBFileMode myMode;
    private VBFileAccess myAccess;
    private VBFileLock myLock;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void refresh() {
        Throwable Err = null;
        boolean bAppend = false;
        try {
            VBFileHandler Me;
            Me.myFile = new File(Me.myFilename);
            if (Me.myMode.compareTo(VBFileMode.Input) == 0 | Me.myMode.compareTo(VBFileMode.Random) == 0 && Me.$exists()) {
                Me.myInput = new FileInputStream(Me.myFile);
                Me.myInputReader = new BufferedReader(new InputStreamReader(Me.myInput));
                if (Me.myLock.compareTo(VBFileLock.LockReadAndWrite) == 0 | Me.myLock.compareTo(VBFileLock.LockRead) == 0) {
                    Me.myInput.getChannel().lock();
                }
            }
            if (!(Me.myMode.compareTo(VBFileMode.Output) == 0 | Me.myMode.compareTo(VBFileMode.Append) == 0 | Me.myMode.compareTo(VBFileMode.Random) == 0)) {
                return;
            }
            bAppend = Me.myMode.compareTo(VBFileMode.Random) == 0 | Me.myMode.compareTo(VBFileMode.Append) == 0;
            Me.myOutput = new FileOutputStream(Me.myFile, bAppend);
            if (Me.myMode.compareTo(VBFileMode.Append) == 0) {
                Me.myOutput.getChannel().position(Me.$length());
            }
            if (!(Me.myLock.compareTo(VBFileLock.LockReadAndWrite) == 0 | Me.myLock.compareTo(VBFileLock.LockWrite) == 0)) {
                return;
            }
            Me.myOutput.getChannel().lock();
            return;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FileInputStream $InputStream() {
        FileInputStream $InputStream = null;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.myInput;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $InputStream;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FileOutputStream $OutputStream() {
        FileOutputStream $OutputStream = null;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.myOutput;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $OutputStream;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBFileMode $Mode() {
        VBFileMode $Mode = new VBFileMode();
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.myMode;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Mode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Mode(VBFileMode v) {
        Throwable Err = null;
        try {
            Me.myMode = v;
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
    public VBFileAccess $Access() {
        VBFileAccess $Access = new VBFileAccess();
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.myAccess;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Access;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Access(VBFileAccess v) {
        Throwable Err = null;
        try {
            Me.myAccess = v;
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
    public VBFileLock $Lock() {
        VBFileLock $Lock = new VBFileLock();
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.myLock;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Lock;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Lock(VBFileLock v) {
        Throwable Err = null;
        try {
            Me.myLock = v;
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
    public String $Filename() {
        String $Filename = "";
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.myFilename;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Filename;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Filename(String s) {
        Throwable Err = null;
        try {
            VBFileHandler Me;
            Me.myFilename = s;
            Me.refresh();
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
    public boolean writeString(String s) {
        boolean writeString = false;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            if (Me.myOutput == null) return writeString;
            if (Me.myMode.compareTo(VBFileMode.Append) != 0) {
                Me.myOutput.getChannel().truncate(0);
            }
            Me.myOutput.write(Strings.StringToArray(s));
            return true;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return writeString;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean appendString(String s) {
        boolean appendString = false;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            if (Me.myOutput == null) return appendString;
            if (!(Me.myMode.compareTo(VBFileMode.Append) == 0)) {
                return Me.writeString(s);
            }
            Me.myOutput.write(Strings.StringToArray(s));
            return true;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return appendString;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean putString(String s, int pos) {
        boolean putString = false;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            if (Me.myOutput == null) return putString;
            if (Me.myMode.compareTo(VBFileMode.Append) == 0) return putString;
            Me.myOutput.getChannel().position(pos - 1);
            Me.myOutput.write(Strings.StringToArray(s));
            return true;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return putString;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $EOF() {
        boolean $EOF = false;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            if (Me.myInputReader == null) return true;
            boolean bl = false;
            if (bl) {
                return true;
            }
            if (Strings.StrComp(Me.myInputReadLineMem, null) != 0) return false;
            boolean bl2 = false;
            if (bl2) {
                return false;
            }
            Me.myInputReadLineMem = Me.myInputReader.readLine();
            if (Strings.StrComp(Me.myInputReadLineMem, null) == 0) return true;
            return false;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $EOF;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String read(int offset, int length) {
        Throwable throwable2;
        Throwable Err;
        String read;
        block8: {
            FileInputStream myOffsetReader;
            block12: {
                boolean bl;
                int retLen;
                VBArray tmp;
                block13: {
                    block10: {
                        block11: {
                            block9: {
                                VBFileHandler Me;
                                read = "";
                                Err = null;
                                try {
                                    if (Me.myInput == null) return read;
                                }
                                catch (Throwable throwable2) {
                                    break block8;
                                }
                                myOffsetReader = new FileInputStream(Me.myFile);
                                tmp = new VBArray();
                                tmp.setBound(0, length - 1, false);
                                try {
                                    myOffsetReader.skip(offset);
                                }
                                catch (Throwable throwable2) {}
                                retLen = myOffsetReader.read(tmp.byteArray(), 0, length);
                                if (retLen < 0) break block9;
                                if (retLen != length) break block10;
                                break block11;
                            }
                            read = Constants.vbNullString;
                            break block12;
                        }
                        bl = false;
                        break block13;
                    }
                    bl = true;
                }
                if (bl) {
                    tmp.setBound(0, retLen - 1, true);
                }
                read = tmp.toString();
            }
            myOffsetReader.close();
            break block8;
            finally {
            }
        }
        Object var5_8 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return read;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String readAll() {
        Throwable throwable2;
        Throwable Err;
        String readAll;
        block5: {
            BufferedReader myBufferedReader;
            readAll = "";
            Err = null;
            try {
                VBFileHandler Me;
                if (Me.myInput == null) return readAll;
                myBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(Me.myFile)));
            }
            catch (Throwable throwable2) {
                break block5;
            }
            readAll = Conversion.CStr(myBufferedReader);
            myBufferedReader.close();
        }
        Object var3_4 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return readAll;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String readLine() {
        String readLine = "";
        Throwable Err = null;
        String ret = "";
        try {
            VBFileHandler Me;
            if (Me.myInput == null) return readLine;
            if (Me.myInputReader == null) return readLine;
            if (!(Strings.StrComp(Me.myInputReadLineMem, null) == 0)) {
                ret = Me.myInputReadLineMem;
                Me.myInputReadLineMem = null;
            } else {
                ret = Me.myInputReader.readLine();
            }
            if (Strings.StrComp(ret, null) == 0) return "";
            boolean bl = false;
            if (!bl) return ret;
            return "";
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return readLine;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean close() {
        boolean close = false;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            if (Me.myInput != null) {
                Me.myInput.close();
            }
            if (Me.myOutput != null) {
                Me.myOutput.close();
            }
            if (Me.myInputReader != null) {
                Me.myInputReader.close();
            }
            Me.myInput = null;
            Me.myOutput = null;
            Me.myInputReader = null;
            return close;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return close;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean delete() {
        boolean delete = false;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.$Parent().delete();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return delete;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $exists() {
        boolean $exists = false;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.$Parent().exists();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $exists;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $length() {
        long $length = 0L;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            if (!Me.$exists()) return -1 * 1;
            return Me.myFile.length();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $length;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public File $Parent() {
        File $Parent = null;
        Throwable Err = null;
        try {
            VBFileHandler Me;
            return Me.myFile;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    public VBFileHandler() {
        VBFileHandler Me;
        Me.initVars();
    }

    private void initVars() {
        Me.myFile = null;
        Me.myInput = null;
        Me.myInputReader = null;
        Me.myOutput = null;
        Me.myInputReadLineMem = null;
        Me.myFilename = "";
        Me.myMode = new VBFileMode();
        Me.myAccess = new VBFileAccess();
        Me.myLock = new VBFileLock();
    }
}
